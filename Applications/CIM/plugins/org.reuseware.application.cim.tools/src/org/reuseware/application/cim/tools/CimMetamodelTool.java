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
package org.reuseware.application.cim.tools;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import es.tid.cim.CimPackage;

public class CimMetamodelTool {

	public static void main(String[] args) {
		StringWriter s = new StringWriter();
		
		CimPackage cim = CimPackage.eINSTANCE;
		
		int abstr = 0;
		int concr = 0;
		int enums = 0;
		
		for(EClassifier eClassifier : cim.getEClassifiers()) {
			if (eClassifier instanceof EEnum) {
				enums++;
			}
			else if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				if (eClass.isAbstract()) {
					abstr++;
				}
				else {
					concr++;
				}
			}
		}
		
		s.append("No of abstract metclasses: " + abstr + "\n");
		s.append("No of concrete metclasses: " + concr + "\n");
		s.append("No of enums:               " + enums + "\n");
		
		s.append("No of metclasses:          " + cim.getEClassifiers().size() + 
				" ("+ (abstr + concr + enums) +")\n");
		
		Map<String, Integer> attributeMap = new HashMap<String, Integer>();
		int contain = 0;
		for(EClassifier eClassifier : cim.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				for(EAttribute eAttribute : eClass.getEAllAttributes()) {
					String tName = eAttribute.getEType().getName();
					if (attributeMap.containsKey(tName)) {
						attributeMap.put(tName, attributeMap.get(tName) + 1);
					}
					else {
						attributeMap.put(tName, 1);
					}
				}
				for(EReference eReference : eClass.getEAllReferences()) {
					if (eReference.isContainment()) {
						contain++;
						System.out.println(eReference);
					}
				}
			}
		}
		
		s.append("Containment refs: " + contain + "\n");
		
		for (String tName : attributeMap.keySet()) {
			s.append(tName + " attributes: " + attributeMap.get(tName) + "\n");
		}
		
		s.append("\n\n=== CIM Attributes REX ===\n");
		
		s.append("\tfragment role Default {\n");
		s.append("\t\thomo port Config {\n");
		
		for(EClassifier eClassifier : cim.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				for(EAttribute eAttribute : eClass.getEAttributes()) {
					if(eAttribute.getEType().equals(EcorePackage.Literals.ESTRING)) {
						String className = eClass.getName();
						String attributeName = eAttribute.getName();
						
						s.append("\t\t\t" + className + "." + attributeName + " is value hook if $" + attributeName + ".startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {\n");
						s.append("\t\t\t\tport  merge expr = $" + attributeName + "$\n");
						s.append("\t\t\t\tport  expr = $'" + attributeName + "'$\n");
						s.append("\t\t\t\tpoint expr = $'value'$\n");
						s.append("\t\t\t}\n");						
					}
				}
			}
		}
		
		s.append("\t\t}\n");
		s.append("\t}\n");
		
		System.out.println(s.toString());

	}

}
