package org.reuseware.sokan.index.solr;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.FacetField;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.eclipse.emf.common.util.EList;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.FacetedResponse;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.CoreUtil;
import org.reuseware.sokan.index.util.FacetUtil;

/**
 * Utility class to support facet-based queries on the Solr index.
 * <p>
 * Webinar: Mastering Solr 1.4 contained hints about faceted queries 
 * on slide 14.
 * <p>
 * q=index replication&facet=true
 * &fq={!tag=proj}project:(luceneOR solr)
 * &facet.field={!ex=proj}project
 * &facet.field={!ex=src}source
 */
public final class FacetedBrowsing {
	
	private FacetedBrowsing() { }
	
	private static final SolrControler CONTROLER = SolrControler.INSTANCE;
	private static final String AND = " AND ";

	// private static final String OR = " OR ";

	/**
	 * Query the index according to the given request.
	 * 
	 * @param request the faceted request
	 * 
	 * @return the query result
	 */
	public static FacetedResponse query(FacetedRequest request) {
		SolrQuery query = buildQuery(request);
		QueryResponse response = CONTROLER.query(query);
		return buildResponse(response, request);
	}

	private static SolrQuery buildQuery(FacetedRequest request) {

		// create query object
		SolrQuery query = new SolrQuery();

		// allow to define a keyword search on facets and values!
		// String queryString = request.getKeywordSearchString();
		// if (queryString != null && !queryString.equals(""))
		// query.setQuery(queryString);

		// maintain faceted constraints
		List<Constraint> constList = request.getConstraints();
		if (constList == null || constList.isEmpty()) {
			return null;
		}
		// start building queryString
		String queryString = "";
		String valueString;
		String field;
		EList<String> valueList;
		Set<String> fields = CONTROLER.getFieldNames();
		boolean stop;

		for (Constraint con : constList) {
			valueString = ":(";
			valueList = con.getValues();
			field = SolrUtil.adaptField(con.getName(), fields);
			if (field == null) {
				continue;
			}
			if (valueList.size() == 0 || valueList.contains("")) {
				queryString += "-" + field + ":" + "[\"\" TO *]" + AND;
			} else {
				stop = false;
				for (String value : valueList) {
					//TODO #1261: de-activated to allow complex query construction 
					/*if (value.contains("*")
							&& (value.contains(" ") || value.startsWith("*"))) {
						stop = true;
						break;
					}*/

					if (value != null && value.contains("*")) {
						queryString += field + ":" + value + AND;
						stop = true;
						break;
					}

					valueString += "\"" + value + "\" ";
				}
				if (stop) {
					continue;
				}
				queryString += field + CoreUtil.trimLastChar(valueString) + ")"
						+ AND;
			}

		}
		if ("".equals(queryString)) {
			return null;
		}
		queryString = CoreUtil.trimLastSeperator(queryString, AND);
		query.setQuery(queryString);

		// maintain facet fields to get facetCounts
		List<String> facetFields = request.getFacetFields();
		if (facetFields != null && facetFields.size() > 0) {
			query.setFacet(true);
			for (String facet : facetFields) {
				query.addFacetField(facet);
			}
		}

		// TODO #1142: add rows and offset parameters
		CONTROLER.limit(query, request.getRows());

		return query;
	}

	private static FacetedResponse buildResponse(QueryResponse response,
			FacetedRequest request) {
		if (response == null) {
			return null;
		}
		// maintain content
		List<IndexRow> content = SolrUtil.toIndexRows(response.getResults());

		// maintain value Counts
		Map<String, Map<String, Long>> facetCounts;
		Map<String, Long> valueCounts;
		List<FacetField.Count> values;

		List<FacetField> fields = response.getFacetFields();
		if (fields != null) {
			facetCounts = new HashMap<String, Map<String, Long>>(fields.size());
			
			for (FacetField facetField : fields) {
				values = facetField.getValues();
				valueCounts = new HashMap<String, Long>(values.size());

				for (FacetField.Count value : values) {
					valueCounts.put(value.getName(), value.getCount());
				}
				
				facetCounts.put(facetField.getName(), valueCounts);
			}
			
		} else {
			facetCounts = Collections.emptyMap();
		}

		// TODO #1142: support rows and offset here!

		return FacetUtil.buildFacetedResponse(request, content, facetCounts);
	}
}