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
package org.reuseware.sokan.index.emodeler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.CoreUtil;

/**
 * Manager class for <code>EModeler</code>s (registered in extension point
 * <i>org.reuseware.sokan.index</i>).
 */
public final class EModelerManager {
	
	private EModelerManager() { }
	
	private static List<EModeler> modelers = null;
	
	/**
	 * Creates a model of the given row with the given type.
	 * 
	 * @param eClass the type of the model to create
	 * @param row the row from which to create a model
	 * @param resourceSet the resource set to use for loading
	 * @return the created model
	 */
	public static List<EObject> createModel(EClass eClass, IndexRow row,
			ResourceSet resourceSet) {
		List<EModeler> modelerList = getEModelers();
		if (modelerList == null || row == null) {
			return null;
		}
		return invokeModelers(modelerList, row, eClass, resourceSet);
	}
	
	/**
	 * True if an EModeler is registered that can create a model
	 * for the given row with the given type.
	 * 
	 * @param eClass the type of the model to create
	 * @param row the row from which to create a model
	 * @return true if a model can be created
	 */
	public static boolean canModel(EClass eClass, IndexRow row) {
		List<EModeler> modelerList = getEModelers();
		if (modelerList == null || row == null) {
			return false;
		}
		return askModelersForCanModel(modelerList, row, eClass);
	}
	
	/**
	 * Determines whether the given element was created
	 * by an modeler for the row with the given ID.
	 * 
	 * @param element the root element of the model
	 * @param id the id of the row from which the model might have been created
	 * @return true if the element was modeled by this modeler
	 */
	public static boolean wasModelled(EObject element, ID id) {
		List<EModeler> modelerList = getEModelers();
		if (modelerList == null || id == null) {
			return false;
		}
		return askModelersForWasModelled(modelerList, element, id);
	}
	
	/**
	 * @return list of all registered EModelers
	 */
	public static List<EModeler> getEModelers() {
		if (modelers == null) {
			modelers = CoreUtil.findEModelers();
		}
		return modelers;
	}

	private static List<EObject> invokeModelers(List<EModeler> modelerList,
			IndexRow row, EClass eClass, ResourceSet resourceSet) {

		List<EObject> eObjs = new ArrayList<EObject>(modelerList.size());
		for (EModeler eModeler : modelerList) {
			if (eModeler.canModel(row, eClass)) {
				eObjs.addAll(eModeler.createMetaDataModel(row, resourceSet));
			}
		}

		return eObjs;
	}
	
	private static boolean askModelersForCanModel(List<EModeler> modelerList,
			IndexRow row, EClass eClass) {
		for (EModeler eModeler : modelerList) {
			if (eModeler.canModel(row, eClass)) {
				return true;
			}
		}

		return false;
	}
	

	private static boolean askModelersForWasModelled(List<EModeler> modelerList,
			EObject element, ID id) {
		for (EModeler eModeler : modelerList) {
			if (eModeler.wasModelled(element, id)) {
				return true;
			}
		}

		return false;
	}


}
