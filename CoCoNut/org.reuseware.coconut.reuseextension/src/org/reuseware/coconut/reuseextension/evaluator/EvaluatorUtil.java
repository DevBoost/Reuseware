/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.reuseextension.evaluator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * Manager class for the extension point:
 * <i>org.reuseware.coconut.reuseextension.evaluator</i>.
 */
public final class EvaluatorUtil {

	private EvaluatorUtil() { }
	
	private static final String PLUGIN_ID = 
		"org.reuseware.coconut.reuseextension";
	
	/**
	 * ID of the extension point:
	 * <i>org.reuseware.coconut.reuseextension.evaluator</i>.
	 */
	public static final String EVALUATOR_EP_ID = 
		PLUGIN_ID + ".evaluator";
	
	/**
	 * Prefix of the default evaluator:
	 * <i>ocl+</i>.
	 */
	public static final String DEFAULT_PREFIX = 
		"ocl+";

	private static Map<String, Evaluator> evaluatorMap = null;

	/**
	 * Registers the given evaluator.
	 * 
	 * @param evaluator the evaluator.
	 */
	public static void addEvaluator(Evaluator evaluator) {
		init();
		evaluatorMap.put(evaluator.getPrefix(), evaluator);
	}
	
	private static void init() {
		if (evaluatorMap == null) {
			evaluatorMap = new LinkedHashMap<String, Evaluator>();
			if (Platform.isRunning()) {
				//read extension point
		        IExtensionPoint ep = 
		        	Platform.getExtensionRegistry().getExtensionPoint(EVALUATOR_EP_ID);
		        IConfigurationElement[] entries = ep.getConfigurationElements();
		        
		        for (int i = 0; i < entries.length; i++) {
		        	try {
		        		Evaluator evaluator = 
							(Evaluator) entries[i].createExecutableExtension("class");
		        		evaluatorMap.put(evaluator.getPrefix(), evaluator);
					} catch (CoreException e) {
						IStatus status = new Status(IStatus.ERROR, PLUGIN_ID,
								0, "[Reuseware] Failed to install an evaluator", e);
						Platform.getLog(Platform.getBundle(
									PLUGIN_ID)).log(status);
					}
		        }
			}
		}
	}
	
	private static String getPrefix(String expression) {
		if (expression == null) {
			return null;
		}
		int pos = expression.indexOf(":");
		if (pos == -1) {
			return DEFAULT_PREFIX;
		}
		String prefix = expression.substring(0, pos);
		if (!evaluatorMap.containsKey(prefix)) {
			return DEFAULT_PREFIX;
		}
		return prefix;
	}
	
	private static String trimPrefix(String expression) {
		if (expression == null) {
			return null;
		}
		int pos = expression.indexOf(":");
		if (pos == -1) {
			return expression;
		}
		String prefix = expression.substring(0, pos);
		if (!evaluatorMap.containsKey(prefix)) {
			return expression;
		}
		return expression.substring(pos + 1);
	}
	
	private static Evaluator getEvaluatorForExpression(String expression) {
		if (expression == null) {
			return null;
		}
		return evaluatorMap.get(getPrefix(expression));
	}

	/**
	 * Evaluates the expression towards a boolean value.
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an element in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * 
	 * @return the result of the evaluation
	 */
	public static boolean eval(List<String> iD, EObject context, String expression, Map<String, String> args) {
		init();
		Evaluator evaluator = getEvaluatorForExpression(expression);
		expression = trimPrefix(expression);
		if (evaluator == null) {
			return true;
		} else {
			return evaluator.eval(iD, context, expression, args);
		}
	}
	
	/**
	 * Evaluates the expression towards a boolean value.
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an element in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation
	 * @param nullValue the boolean value that should be returned if the expression is null
	 * 
	 * @return the result of the evaluation
	 */
	public static boolean eval(List<String> iD, EObject context, String expression, Map<String, String> args, boolean nullValue) {
		if (expression == null || "".equals(expression)) {
			return nullValue;
		}
		return eval(iD, context, expression, args);
	}
	
	/**
	 * Evaluates the expression towards a boolean value (with a list of elements as context).
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an elements in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * 
	 * @return the result of the evaluation
	 */
	public static boolean eval(List<String> iD, List<EObject> context, String expression, Map<String, String> args) {
		init();
		Evaluator evaluator = getEvaluatorForExpression(expression);
		expression = trimPrefix(expression);
		if (evaluator == null) {
			return true;
		} else {
			return evaluator.eval(iD, context, expression, args);
		}
	}
	
	/**
	 * Evaluates the expression towards a boolean value (with a list of elements as context).
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an elements in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * @param nullValue the boolean value that should be returned if the expression is null
	 * 
	 * @return the result of the evaluation
	 */
	public static boolean eval(List<String> iD, List<EObject> context, String expression, Map<String, String> args, boolean nullValue) {
		if (expression == null || "".equals(expression)) {
			return nullValue;
		}
		return eval(iD, context, expression, args);
	}

	/**
	 * Evaluates the expression towards a String value.
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an element in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * 
	 * @return the result of the evaluation
	 */
	public static String derive(List<String> iD, EObject context, String expression, Map<String, String> args) {
		init();
		Evaluator evaluator = getEvaluatorForExpression(expression);
		expression = trimPrefix(expression);
		if (evaluator == null) {
			return "";
		} else {
			return evaluator.derive(iD, context, expression, args);
		}
	}
	
	/**
	 * Evaluates the expression towards an integer value.
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an element in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * 
	 * @return the result of the evaluation
	 */
	public static int deriveInt(List<String> iD, EObject context, String expression, Map<String, String> args) {
		init();
		Evaluator evaluator = getEvaluatorForExpression(expression);
		expression = trimPrefix(expression);
		if (evaluator == null) {
			return -1;
		} else {
			return evaluator.deriveInt(iD, context, expression, args);
		}
	}
	
	/**
	 * Evaluates the expression towards an ID (a list of Strings).
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an element in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * 
	 * @return the result of the evaluation
	 */
	public static List<String> deriveID(List<String> iD, EObject context, String expression, Map<String, String> args) {
		init();
		Evaluator evaluator = getEvaluatorForExpression(expression);
		expression = trimPrefix(expression);
		if (evaluator == null) {
			return Collections.emptyList();
		} else {
			return evaluator.deriveID(iD, context, expression, args);
		}
	}
	
	/**
	 * Evaluates the expression towards a list of model elements.
	 * 
	 * @param iD id of the fragment on which the expression is to be evaluated
	 * @param context an element in the fragment on which the expression is to be evaluated
	 * @param expression the unparsed expression as string
	 * @param args additional arguments to be used in the evaluation 
	 * 
	 * @return the result of the evaluation
	 */
	public static List<EObject> deriveElementList(List<String> iD, EObject context, String expression, Map<String, String> args) {
		init();
		Evaluator evaluator = getEvaluatorForExpression(expression);
		expression = trimPrefix(expression);
		if (evaluator == null) {
			return Collections.singletonList(context);
		} else {
			return evaluator.deriveElementList(iD, context, expression, args);
		}
	}

	/**
	 * Validates if the expression is correct.
	 * 
	 * @param context the context in which to evaluate the expression
	 * @param expression the unparsed expression as string
	 * @param parameters additional parameters to be used in the evaluation

	 * @return error message if errors were found
	 */
	public static String validateExpression(EClass context, String expression, List<String> parameters) {
		init();
		Evaluator evaluator = getEvaluatorForExpression(expression);
		expression = trimPrefix(expression);
		if (evaluator == null) {
			return null;
		} else {
			return evaluator.validateExpression(context, expression, parameters);
		}
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
	public static EClass getResultType(EClass context, String expression, List<String> parameters) {
		init();
		Evaluator evaluator = getEvaluatorForExpression(expression);
		expression = trimPrefix(expression);
		if (evaluator == null) {
			return null;
		} else {
			return evaluator.getResultType(context, expression, parameters);
		}
	}
	
	/**
	 * Computes completion proposals for an incomplete expression. This optional
	 * functionality is used in the REX editor to ease expression definition.
	 * 
	 * @param context the context in which to evaluate the expression
	 * @param expressionStart the unparsed beginning of the expression to be completed
	 * @param parameters additional parameters to be used in the evaluation
	 * 
	 * @return a list of completion proposals (complete expressions as Strings)
	 */
	public static List<String> getCompletionProposals(EClass context, String expressionStart, List<String> parameters) {
		init();
		Evaluator evaluator = getEvaluatorForExpression(expressionStart);
		expressionStart = trimPrefix(expressionStart);
		if (evaluator == null) {
			return new ArrayList<String>(evaluatorMap.keySet());
		} else {
			return evaluator.getCompletionProposals(context, expressionStart, parameters);
		}
	}
}
