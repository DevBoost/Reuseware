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
package org.reuseware.coconut.reuseextension.evaluator.ocl;

import java.lang.reflect.Method;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.EnvironmentFactory;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironment;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.util.TypeUtil;

/**
 * OCL Ecore environment enhanced with:
 * (1) complete Java String API
 * (2) eContainer() operation for all elements
 * (3) getValue() operation for EFeatureMapEntry.
 */
public class EnhancedEcoreEnvironment extends EcoreEnvironment {

    protected EList<EOperation> customOperations = new BasicEList<EOperation>();
    
    // this constructor is used to initialize the root environment
    EnhancedEcoreEnvironment(EPackage.Registry registry) {
        super(registry);
        
        defineStringOperations();
        defineContainerOperation();
        defineToStringOperation();
        defineGetValueOperation();
    }
    
    // this constructor is used to initialize child environments
    EnhancedEcoreEnvironment(EnhancedEcoreEnvironment parent) {
        super(parent);
        
        // get the parent's custom operations
        customOperations.clear();
        customOperations.addAll(parent.customOperations);
    }
	
	// override this to provide visibility of the inherited protected method
    @Override
    protected void setFactory(
            EnvironmentFactory<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> factory) {
        super.setFactory(factory);
    }
    
    private void defineContainerOperation() {

        EOperation newOperation = EcoreFactory.eINSTANCE.createEOperation();
		
        newOperation.setName("eContainer");
        newOperation.setEType(EcorePackage.Literals.EOBJECT);
        
        EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
        annotation.setSource("EContainerOperation");
        newOperation.getEAnnotations().add(annotation);
        
    	addHelperOperation(getOCLStandardLibrary().getOclAny(), newOperation);

    }
    
    private void defineToStringOperation() {

        EOperation newOperation = EcoreFactory.eINSTANCE.createEOperation();
		
        newOperation.setName("toString");
        newOperation.setEType(getOCLStandardLibrary().getString());
        
        EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
        annotation.setSource("toStringOperation");
        newOperation.getEAnnotations().add(annotation);
        
    	addHelperOperation(getOCLStandardLibrary().getInteger(), newOperation);
    }
    
    private void defineGetValueOperation() {

        EOperation newOperation = EcoreFactory.eINSTANCE.createEOperation();
		
        newOperation.setName("getValue");
        newOperation.setEType(EcorePackage.Literals.EJAVA_OBJECT);
        
        EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
        annotation.setSource("getValueOperation");
        newOperation.getEAnnotations().add(annotation);
        
    	addHelperOperation(EcorePackage.Literals.EFEATURE_MAP_ENTRY, newOperation);

    }
    
    
    // use the AbstractEnvironment's mechanism for defining "additional operations"
    // to add our custom operation to OCL's String primitive type
    private void defineStringOperations() {
        //iterate over the String API
    	for (Method stringMethod : String.class.getDeclaredMethods()) {
            EOperation newOperation = EcoreFactory.eINSTANCE.createEOperation();
    		boolean usable = true;
    		
    		String name       = stringMethod.getName();
    		Class<?> javaType = stringMethod.getReturnType();

            newOperation.setName(name);
    		
            EClassifier eType = javaTypeToEType(javaType);
            if (eType == null) {
            	usable = false;
            	continue;
            } else {
            	newOperation.setEType(eType);
	    		int pIndex = 0;
	    		for (Class<?> pJavaType : stringMethod.getParameterTypes()) {
		            EParameter parm = EcoreFactory.eINSTANCE.createEParameter();
		            parm.setName("p" + pIndex);
		            EClassifier pEType = javaTypeToEType(pJavaType);
		            if (pEType == null) {
		            	usable = false;
		            	break;
		            }
		            parm.setEType(pEType);
		            newOperation.getEParameters().add(parm);
		            pIndex++;
	    		}
	    	}
            
            if (usable) {
                // annotate it so that we will recognize it in the evaluation environment
                EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
                annotation.setSource("JavaMethod");
                newOperation.getEAnnotations().add(annotation);
                
                // define it as an additional operation on OCL String
                addHelperOperation(getOCLStandardLibrary().getString(), newOperation);
            	
            }
    	}

    }
    
    private EClassifier javaTypeToEType(Class<?> javaType) {
    	EClassifier eClassifier = null;
    	
    	boolean isArray = javaType.isArray();
    	if (isArray) {
    		javaType = javaType.getComponentType();
    	}
    	
		if (javaType == String.class) {
			eClassifier = getOCLStandardLibrary().getString();
		} else if (javaType == CharSequence.class) {
			eClassifier = getOCLStandardLibrary().getString();
		} else if (javaType == int.class) {
			eClassifier = getOCLStandardLibrary().getInteger();
		} else if (javaType == boolean.class) {
			eClassifier = getOCLStandardLibrary().getBoolean();
		}
		
		if (isArray && eClassifier != null) {
			eClassifier = TypeUtil.resolveSequenceType(this, eClassifier);
		}
		
		return eClassifier;
    }
}
