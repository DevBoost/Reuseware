/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.reuseextension.evaluator.ocl;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.EcoreEvaluationEnvironment;

/**
 * The evaluation environment for the enhanced OCL Ecore environment.
 */
public class EnhancedEcoreEvaluationEnvironment extends
		EcoreEvaluationEnvironment {
	
	EnhancedEcoreEvaluationEnvironment() {
        super();
    }

	EnhancedEcoreEvaluationEnvironment(
            EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> parent) {
        super(parent);
    }
    
	/**
	 * Extended to call the additional supported operations 
	 * (see <code>EnhancedEcoreEnvironment</code>).
	 * 
	 * @param operation the operation to call
	 * @param opcode the opcode
	 * @param source the object to call  the operation on
	 * @param args operation call arguments
	 * 
	 * @return result of the operation call
	 */
	@Override
    public Object callOperation(EOperation operation, int opcode, Object source, Object[] args) {
        if (operation.getEAnnotation("JavaMethod") != null) {
        	
        	if (source instanceof EObject /*might be error object*/) {
        		return source;
        	}
        	
        	String name = operation.getName();
        	
            // get the parameter types as java classes
            EList<EParameter> parms = operation.getEParameters();
            Class<?>[] javaParms = new Class[parms.size()];
            for (int i = 0, n = parms.size(); i < n; i++) {
                EParameter parm = parms.get(i);

                if (parm.isMany()) {
                    javaParms[i] = EList.class; 
                } else {
                    javaParms[i] = parm.getEType().getInstanceClass();
                }
            }

            //replace null with "" to allow operation calls of String attributes set to null
            if (source == null) {
            	source = "";
            }
            
            Method javaMethod = null;
    		try {
    			javaMethod = String.class.getMethod(name, javaParms);
    		} catch (NoSuchMethodException e) {
    		     for (int i = 0, n = javaParms.length; i < n; i++) {
    		    	 if (javaParms[i] == String.class) {
    		    		 javaParms[i] = CharSequence.class;
    		    	 }
    		     }
    	   		try {
					javaMethod = String.class.getMethod(name, javaParms);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
    		}
    		
    		try {
            	Object result = javaMethod.invoke(source, args);
            	if (result.getClass().isArray()) {
            		result = Arrays.asList((Object[]) result);
            	}
            	return result;
    		} catch (Exception e) {
    			e.printStackTrace();
    		} 

            throw new UnsupportedOperationException();  // unknown operation
            // not our custom regex operation

        } else if (operation.getEAnnotation("EContainerOperation") != null) {
        	if (source instanceof EObject) {
        		return ((EObject) source).eContainer();
        	} else {
        		return null;
        	}
        } else if (operation.getEAnnotation("toStringOperation") != null) {
        	if (source instanceof EObject /*might be error object*/ || source == null) {
        		return source;
        	}
        	return source.toString();
        } else if (operation.getEAnnotation("getValueOperation") != null) {
        	if (source instanceof FeatureMap.Entry) {
        		return ((FeatureMap.Entry) source).getValue();
        	}
        	
        	return null;
        }

        return super.callOperation(operation, opcode, source, args);
    }

}

