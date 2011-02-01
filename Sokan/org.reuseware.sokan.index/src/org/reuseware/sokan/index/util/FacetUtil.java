package org.reuseware.sokan.index.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.FacetedResponse;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.SokanFactory;
import org.reuseware.sokan.index.SokanIndexPlugin;

/**
 * Utility methods to perform facet-based querying on Sokan's index.
 */
public final class FacetUtil {

	private FacetUtil() { }
	
	/**
	 * Builds a list of constraints out of a specific constraint array. This
	 * array needs look like the following: <br>
	 * <br>
	 * schema:<br>
	 * <code>
	 * {fName,vName1,vName2,...},{fName,vName1,vName2,...},...<br>
	 * </code> <br>
	 * example:<br>
	 * <code>
	 * String[][] cons = {{"color","Brown","Blue"},{"size","Large"}};
	 * </code>
	 * 
	 * @param constraintArray
	 *            The array containing the constraint information.
	 * @return A list of constraints ready to be used to build a
	 *         <code>FacetedRequest</code> object.
	 */
	public static List<Constraint> buildConstraints(String[][] constraintArray) {
		List<Constraint> constraints = new LinkedList<Constraint>();
		if (constraintArray == null) {
			return constraints;
		}
		try {
			List<String> valueList;
			for (String[] constraint : constraintArray) {
				valueList = new ArrayList<String>(constraint.length - 1);
				for (int i = 1; i < constraint.length; i++) {
					valueList.add(constraint[i]);
				}
				constraints.add(createConstraint(constraint[0], valueList));
			}
		} catch (Exception e) {
			SokanIndexPlugin.logError(
					"Error parsing the constraint array.", e);
		}

		return constraints;
	}

	/**
	 * Builds a list of constraints by the given name and the give single value.
	 * 
	 * @param facetName
	 *            The facet/column name to constrain on.
	 * @param value
	 *            The single value.
	 * @return A list of constraints ready to be used to build a
	 *         <code>FacetedRequest</code> object.
	 */
	public static List<Constraint> buildConstraints(String facetName,
			String value) {
		List<Constraint> cons = new LinkedList<Constraint>();
		cons.add(createConstraint(facetName, value));
		return cons;
	}

	/**
	 * Builds a list of constraints by the given facetName (aka. index column
	 * name) and an array of facet values.
	 * 
	 * @param facetName
	 *            The facet/column name to constrain on.
	 * @param valueArray
	 *            An array of values.
	 * @return A list of constraints ready to be used to build a
	 *         <code>FacetedRequest</code> object.
	 */
	public static List<Constraint> buildConstraints(String facetName,
			String[] valueArray) {
		if (valueArray == null) {
			return new LinkedList<Constraint>();
		}
		List<String> valueList = new ArrayList<String>(valueArray.length);
		for (String string : valueArray) {
			valueList.add(string);
		}
		return buildConstraints(facetName, valueList);
	}

	/**
	 * Builds a list of constraints by the given facetName (aka. index column
	 * name) and an list of facet values.
	 * 
	 * @param facetName
	 *            The facet/column name to constrain on.
	 * @param valueList
	 *            An list of values.
	 * @return A list of constraints ready to be used to build a
	 *         <code>FacetedRequest</code> object.
	 */
	public static List<Constraint> buildConstraints(String facetName,
			List<String> valueList) {
		List<Constraint> constraints = new LinkedList<Constraint>();
		if (facetName == null | valueList == null) {
			return constraints;
		}
		Constraint con = createConstraint(facetName, valueList);
		constraints.add(con);
		return constraints;
	}

	/**
	 * Builds a list of constraints out of a specific constraint string. This
	 * string needs to have to following structure: <br>
	 * <br>
	 * fName=vName[,vName][;fName=vName[,vName]] <br>
	 * <br>
	 * e.g.:<br>
	 * color=Brown,Blue;numberType=Even;size=Big,Large
	 * 
	 * @param constraintString
	 *            A <code>String</code> that contains all facet names and
	 *            values.
	 * @return A list of constraints ready to be used to build a
	 *         <code>FacetedRequest</code> object.
	 */
	public static List<Constraint> buildConstraints(String constraintString) {
		try {
			// color=Brown,Golden;numberType=Even
			String[] facetValuePairs = constraintString.split(";");
			List<String> valueList;
			List<Constraint> constraints = new LinkedList<Constraint>();

			for (String facetValuePair : facetValuePairs) {
				String[] parts = facetValuePair.split("=");
				if (parts.length == 1) {
					valueList = new ArrayList<String>(0);
				} else {
					String[] valueArray = parts[1].split(",");
					valueList = new ArrayList<String>(valueArray.length);
					for (String value : valueArray) {
						valueList.add(value);
					}
				}

				constraints.add(createConstraint(parts[0], valueList));
			}

			return constraints;
		} catch (Exception e) {
			SokanIndexPlugin.logError(
					"Error parsing the constraintString.", e);
			return Collections.emptyList();
		}
	}

	/**
	 * Builds a simple {@link FacetedRequest} using the given constraints. The
	 * {@link FacetedResponse} to this request won't contain any value counts.
	 * 
	 * @param constraints
	 *            The faceted constrains filtering the result set.
	 * @return A new <code>FacetedRequest</code> instance.
	 */
	public static FacetedRequest buildFacetedRequest(
			List<Constraint> constraints) {
		if (constraints == null || constraints.size() == 0) {
			return null;
		}
		FacetedRequest request = SokanFactory.eINSTANCE.createFacetedRequest();
		request.getConstraints().addAll(constraints);

		return request;
	}

	/**
	 * Builds a simple {@link FacetedRequest} using the facetName and
	 * valueArray. The {@link FacetedResponse} to this request won't contain any
	 * value counts.
	 * 
	 * @see FacetUtil#buildConstraints(String, String[])
	 * @param facetName
	 *            The facet/column name to constrain on.
	 * @param valueArray
	 *            An array of values.
	 * @return A new <code>FacetedRequest</code> instance.
	 */
	public static FacetedRequest buildFacetedRequest(String facetName,
			String[] valueArray) {
		List<Constraint> constraints = buildConstraints(facetName, valueArray);
		if (constraints == null || constraints.size() == 0) {
			return null;
		}
		FacetedRequest request = SokanFactory.eINSTANCE.createFacetedRequest();
		request.getConstraints().addAll(constraints);

		return request;
	}

	/**
	 * Builds a {@link FacetedRequest} using the given information.
	 * 
	 * @param constraints
	 *            The faceted constrains filtering the result set.
	 * @param facetFields
	 *            A list of field/column names value counts are needed for.
	 * @param keywordSearchString
	 *            A search string to filter the result set. (Not supported yet.)
	 * @param rows
	 *            The maximum number of index rows in the response.
	 * @param offset
	 *            An offset needed to split the result set into pages.
	 * 
	 * @see FacetedRequest#getRows()
	 * @see FacetedRequest#getOffset()
	 * 
	 * @return A new <code>FacetedRequest</code> instance.
	 */
	public static FacetedRequest buildFacetedRequest(
			List<Constraint> constraints, List<String> facetFields,
			String keywordSearchString, int rows, int offset) {
		if (constraints == null || constraints.size() == 0) {
			return null;
		}
		FacetedRequest request = SokanFactory.eINSTANCE.createFacetedRequest();
		request.getConstraints().addAll(constraints);
		request.setFacetFields(adaptECollection(facetFields));
		request.setKeywordSearchString(keywordSearchString);
		request.setKeywordSearchString(keywordSearchString);
		request.setRows(rows);
		request.setOffset(offset);

		return request;
	}

	/**
	 * Builds a {@link FacetedResponse} using the given information.
	 * 
	 * @param request
	 *            The {@link FacetedRequest} that leaded to this response.
	 * @param content
	 *            The result set fulfilling the constraints.
	 * @param valueCounts
	 *            The facet value's occurrence of the facets list in the
	 *            request.
	 * @see FacetedRequest#setFacetFields(EList)
	 * @return A new <code>FacetedResponse</code> instance.
	 */
	public static FacetedResponse buildFacetedResponse(FacetedRequest request,
			List<IndexRow> content, Map<String, Map<String, Long>> valueCounts) {

		FacetedResponse response = SokanFactory.eINSTANCE
				.createFacetedResponse();
		response.setQuery(request);
		response.getContent().addAll(content);
		response.setValueCountMap(valueCounts);

		return response;
	}

	private static EList<String> adaptECollection(List<String> facetFields) {
		return new BasicEList<String>(facetFields);
	}

	/**
	 * Creates a <code>Constraint</code> with the given name and the give single
	 * value.
	 * 
	 * @param facetName
	 *            The facet/column name to constrain on.
	 * @param value
	 *            The single value.
	 * @return A new <code>Constraint</code> object
	 */
	public static Constraint createConstraint(String facetName, String value) {
		List<String> values = new ArrayList<String>(1);
		values.add(value);
		return createConstraint(facetName, values);
	}

	/**
	 * Creates a <code>Constraint</code> with the given name and values.
	 * 
	 * @param facetName
	 *            The facet/column name to constrain on.
	 * @param values
	 *            The list of value.
	 * @return A new <code>Constraint</code> object
	 */
	public static Constraint createConstraint(String facetName,
			List<String> values) {
		Constraint con = SokanFactory.eINSTANCE.createConstraint();
		con.setName(facetName);
		con.setValues(CoreUtil.adapt(values));
		return con;
	}

}
