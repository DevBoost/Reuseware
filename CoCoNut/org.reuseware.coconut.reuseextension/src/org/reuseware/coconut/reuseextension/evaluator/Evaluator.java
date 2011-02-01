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
package org.reuseware.coconut.reuseextension.evaluator;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * An evaluator adds support for an expression language
 * within the reuse extension (REX) language.
 */
public interface Evaluator {
	
	/**
	 * @return the prefix developers need to use to identify an expression to
	 *         be evaluated by this evaluator
	 */
	String getPrefix();
	
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
	boolean eval(List<String> iD, EObject context, String expression, Map<String, String> args);
	
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
	boolean eval(List<String> iD, List<EObject> context, String expression, Map<String, String> args); 

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
	String derive(List<String> iD, EObject context, String expression, Map<String, String> args); 
	
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
	int deriveInt(List<String> iD, EObject context, String expression, Map<String, String> args); 
	
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
	List<String> deriveID(List<String> iD, EObject context, String expression, Map<String, String> args); 
	
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
	List<EObject> deriveElementList(List<String> iD, EObject context, String expression, Map<String, String> args);

	/**
	 * Validates if the expression is correct.
	 * 
	 * @param context the context in which to evaluate the expression
	 * @param expression the unparsed expression as string
	 * @param parameters additional parameters to be used in the evaluation

	 * @return error message if errors were found
	 */
	String validateExpression(EClass context, String expression, List<String> parameters); 

	/**
	 * Determines the result type of the given expression.
	 * 
	 * @param context the context in which to evaluate the expression
	 * @param expression the unparsed expression as string
	 * @param parameters additional parameters to be used in the evaluation
	 * 
	 * @return the expression's result type
	 */
	EClass getResultType(EClass context, String expression, List<String> parameters);

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
	List<String> getCompletionProposals(EClass context, String expressionStart, List<String> parameters); 
}

