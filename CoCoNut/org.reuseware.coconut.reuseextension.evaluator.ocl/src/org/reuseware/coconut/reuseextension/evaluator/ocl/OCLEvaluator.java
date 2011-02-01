/*******************************************************************************
 * Copyright (c) 2006-2010
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.reuseextension.evaluator.ocl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.CollectionType;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCL.Query;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.helper.Choice;
import org.eclipse.ocl.helper.ConstraintKind;
import org.reuseware.coconut.id.ID;
import org.reuseware.coconut.id.IdFactory;
import org.reuseware.coconut.id.IdPackage;
import org.reuseware.coconut.reuseextension.evaluator.Evaluator;

/**
 * A REX evaluator for OCL.
 */
public abstract class OCLEvaluator implements Evaluator {
	
	/**
	 * String result indicating that an error occured during evaluation.
	 */
	public static final String ERROR_STRING = "<ERROR_NULL>";
	
	protected final OCL env = OCL.newInstance(getEnvironmentFactory());
	
	protected abstract EcoreEnvironmentFactory getEnvironmentFactory();
	
	/**
	 * Evaluates the OCL expression towards a boolean value.
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an element in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * 
	 * @return the result of the evaluation
	 */
	public boolean eval(List<String> iD, EObject context, String expression, Map<String, String> args) {
		if (expression == null || expression.equals("")) {
			return true;
		}
		return Boolean.parseBoolean(executeQueryExpressionToString(iD, context, expression, args));
	}
	
	/**
	 * Evaluates the OCL expression towards a boolean value (with a list of elements as context).
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an elements in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * 
	 * @return the result of the evaluation
	 */
	public boolean eval(List<String> iD, List<EObject> context, String expression, Map<String, String> args) {
		for (EObject singleElementContext : context) {
			if (eval(iD, singleElementContext, expression, args)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Evaluates the OCL expression towards a String value.
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an element in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * 
	 * @return the result of the evaluation
	 */
	public String derive(List<String> iD, EObject context, String expression, Map<String, String> args) {
		if (expression == null || expression.equals("")) {
			return "";
		}
		return executeQueryExpressionToString(iD, context, expression, args);
	}

	/**
	 * Evaluates the OCL expression towards an integer value.
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an element in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * 
	 * @return the result of the evaluation
	 */
	public int deriveInt(List<String> iD, EObject context, String expression, Map<String, String> args) {
		if (expression == null || expression.equals("")) {
			return -1;
		}
		try {
			return Integer.parseInt(executeQueryExpressionToString(iD, context, expression, args));
		} catch (NumberFormatException e) {
			return -1;
		}
	}
	
	/**
	 * Evaluates the OCL expression towards an ID (a list of Strings).
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an element in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * 
	 * @return the result of the evaluation
	 */
	public List<String> deriveID(List<String> iD, EObject context, String expression, Map<String, String> args) {
		String result = derive(iD, context, expression, args);
		if (!ERROR_STRING.equals(result)) {
			try {
				return Arrays.asList(result.split("/"));
			} catch (Exception e) {
				e.printStackTrace();		
			}
		}
		return Collections.emptyList();
	}

	/**
	 * Evaluates the OCL expression towards a list of model elements.
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an element in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * 
	 * @return the result of the evaluation
	 */
	public List<EObject> deriveElementList(List<String> iD, EObject context, String expression, Map<String, String> args) {
		if (expression == null || expression.equals("")) {
			return Collections.singletonList(context);
		}
		return executeQueryExpressionToList(iD, context, expression, args);
	}
	
	private final Map<EObject, Map<String, Object>> cache = 
		new HashMap<EObject, Map<String, Object>>();
	private ResourceSet currentResourceSet = null;
	
	private String computeCacheID(String expression, Map<String, String> args) {
		String id = expression + "?";
		for (String  property : args.keySet()) {
			id = id + property + "=" + args.get(property) + ";";
		}
		return id;
	}
	
	private Object getFromCache(EObject context, String expression, Map<String, String> args)  {
		if (context.eResource() == null) {
			currentResourceSet = null;
			return null;
		}
		ResourceSet contextResourceSet = context.eResource().getResourceSet();
		if (contextResourceSet == null) {
			currentResourceSet = null;
			return null;
		}
		if (contextResourceSet != currentResourceSet) {
			currentResourceSet = contextResourceSet;
			cache.clear();
		}
		
		String cacheID = computeCacheID(expression, args);
		Map<String, Object> contextCache = cache.get(context);
		if (contextCache != null) {
			return contextCache.get(cacheID);
		}
		return null;
	}
	
	private void putIntoCach(EObject context, String expression, Map<String, String> args, Object result)  {
		if (currentResourceSet == null) {
			return;
		}
		
		String cacheID = computeCacheID(expression, args);
		Map<String, Object> contextCache = cache.get(context);
		if (contextCache == null) {
			contextCache = new HashMap<String, Object>();
			cache.put(context, contextCache);
		}
		contextCache.put(cacheID, result);
	}
	
	protected Object executeQueryExpression(List<String> iD, EObject context, String expression, Map<String, String> args) {
		if (args == null) {
			return "";
		}
		if (args.equals("")) {
			return "";
		}
		
		Object result = getFromCache(context, expression, args);
		if (result != null) {
			return result;
		}

		createContextVariables(args.keySet());
		
		OCLExpression oclExpression = null;
		try {
			oclExpression = parse(context.eClass(), expression);
		} catch (ParserException e) {
			// Error in parsing OCL. If this happens, an error was
			// already reported by validateExpression()
			result = ERROR_STRING;
		}
		
		if (oclExpression != null) {
			Query query = env.createQuery(oclExpression);
			
			ID ufiIDElement = IdFactory.eINSTANCE.createID();
			ufiIDElement.getSegments().addAll(iD);
			
			query.getEvaluationEnvironment().add("ufi", ufiIDElement);
			for (String property : args.keySet()) {
				query.getEvaluationEnvironment().add(property, args.get(property));
			}
			
			try {
				result = query.evaluate(context);
			} catch (Exception e) {
				result = null;
			}	
		}

		if (result == null) {
			result = "";
		}
		
		if (result instanceof EObject && ((EObject) result).eClass().getName().equals("OclInvalid_Class")) {
			//OCL "Null Pointer Exception"
			result = ERROR_STRING;
		}
		
		putIntoCach(context, expression, args, result);
		
		return result;
	}
	
	protected List<EObject> executeQueryExpressionToList(
			List<String> ufi, 
			EObject context,
			String expression,
			Map<String, String> args) {
		
		Object result = executeQueryExpression(ufi, context, expression, args);
		if (result instanceof Collection<?>) {
			@SuppressWarnings("unchecked")
			ArrayList<EObject> resultAsList = 
				new ArrayList<EObject>((Collection<EObject>) result);
			return resultAsList;
		}
		if (result instanceof EObject) {
			return Collections.singletonList((EObject) result);
		}
		return ECollections.emptyEList();		
	}

	protected String executeQueryExpressionToString(
			List<String> iD, 
			EObject context, 
			String expression, 
			Map<String, String> args) {
		
		Object result = executeQueryExpression(iD, context, expression, args);
		
		if (result instanceof List<?>) {
			@SuppressWarnings("unchecked")
			List<String> resultAsList = (List<String>) result;
			result = idToString(resultAsList);
		}
		if (result instanceof Collection<?>) {
			EList<String> idList = new BasicEList<String>();
			for (Object o : (Collection<?>) result) {
				if (o instanceof String) {
					idList.add((String) o);
				}
			}
			result = idToString((EList<String>) idList);
		}

		return result.toString();
	}
	
	private void createContextVariables(Collection<String> parameters) {
		Variable<EClassifier, EParameter> ufiContextVar = 
			env.getEnvironment().getOCLFactory().createVariable();
		ufiContextVar.setName("ufi");
		ufiContextVar.setType(IdPackage.Literals.ID);
		env.getEnvironment().addElement(ufiContextVar.getName(), 
				ufiContextVar, true);
		
		for (String property : parameters) {
			Variable<EClassifier, EParameter> contextVar = 
				env.getEnvironment().getOCLFactory().createVariable();
			contextVar.setName(property);
			contextVar.setType(env.getEnvironment().getOCLStandardLibrary().getString());
			env.getEnvironment().addElement(contextVar.getName(), 
					contextVar, true);
		}
	}
	
	private OCLExpression parse(EClass context, String expression) throws ParserException {
		if (expression == null) {
			return null;
		}

		OCLExpression oclExpression = null;
		Helper helper = env.createOCLHelper();
		helper.setContext(context);

	
		oclExpression = helper.createQuery(expression);

		return oclExpression;
	}
	
	private String idToString(List<String> stringList) {
		String result = "";
		Iterator<String> stringIt = stringList.iterator();
		while (stringIt.hasNext()) {
			result += stringIt.next();
			if (stringIt.hasNext()) {
				result += "/";
			}
		}
		return result;
	}

	/**
	 * Validates if the OCL expression is correct.
	 * 
	 * @param context the context in which to evaluate the expression
	 * @param expression the unparsed expression as string
	 * @param parameters additional parameters to be used in the evaluation

	 * @return error message if errors were found
	 */
	public String validateExpression(EClass context, String expression, List<String> parameters) {
		createContextVariables(parameters);
		try {
			parse(context, expression);
		} catch (ParserException e) {
			return e.getLocalizedMessage();
		}
		return null;
	}
	
	/**
	 * Determines the result type of the given expression.
	 * 
	 * @param context the context in which to evaluate the expression
	 * @param expression the unparsed expression as string
	 * @param parameters additional parameters to be used in the evaluation
	 * 
	 * @return the expression's result type
	 */
	public EClass getResultType(EClass context, String expression, List<String> parameters) {
		createContextVariables(parameters);
		try {
			OCLExpression query = parse(context, expression);
			EClassifier type = query.getType();
			if (type instanceof CollectionType) {
				type = ((CollectionType) type).getElementType();
			}
			return type instanceof EClass ? (EClass) type : null;
		} catch (ParserException e) { 
			//
		}
		return null;
	}
	
	/**
	 * Computes completion proposals for the given incomplete OCL expressions.
	 * This method delegates to <code>getSyntaxHelp()</code> of the OCL helper.
	 * 
	 * @param context the context in which to evaluate the expression
	 * @param expressionStart the unparsed beginning of the expression to be completed
	 * @param parameters additional parameters to be used in the evaluation
	 * 
	 * @return a list of completion proposals (complete expressions as Strings)
	 */
	public List<String> getCompletionProposals(EClass context,
			String expressionStart, List<String> parameters) {
		
		List<String> result = new ArrayList<String>();
		
		createContextVariables(parameters);
		
		Helper helper = env.createOCLHelper();
		helper.setContext(context);
		
		List<Choice> choices = helper.getSyntaxHelp(ConstraintKind.DERIVATION, expressionStart);
		
		String prefix = expressionStart;
		while (prefix.matches(".*\\w")) {
			prefix = prefix.substring(0, prefix.length() - 1);
		}
		
		for (Choice choice : choices) {
			result.add(prefix + choice.getName());
		}
		
		return result;
	}


	
	
}
