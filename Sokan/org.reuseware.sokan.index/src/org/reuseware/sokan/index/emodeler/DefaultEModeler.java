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
package org.reuseware.sokan.index.emodeler;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * The default modeler which creates a model by loading 
 * it using the URI stored in the given index row. It works
 * for all kinds of EMF models.
 */
public class DefaultEModeler implements EModeler {

	/**
	 * Loads the model from the URI stored in the given row using
	 * the given resource set.
	 * 
	 * @param row
	 *            data stored in the index that is the base for the creation of
	 *            the model object
	 * @param resourceSet
     *            the resource set to use when loading models
     *            
	 * @return list of loaded root <code>EObject</code>s
	 */
	public List<? extends EObject> createMetaDataModel(IndexRow row,
			ResourceSet resourceSet) {
		URI uri = ResourceUtil.uriFrom(row.getPhyURI());
		if (uri != null && resourceSet != null) {
			Resource resource;
			try {
				resource = resourceSet.getResource(uri, true);
			} catch (Exception e) {
				return Collections.emptyList();
			}
			if (resource != null) {
				return resource.getContents();
			}
		}
		return Collections.emptyList();
	}

	/**
	 * @param row the row from which to create the model
	 * @param eClass the type of the model to create
	 * 
	 * @return true for the <code>EObject</code> class.
	 */
	public boolean canModel(IndexRow row, EClass eClass) {
		return EcorePackage.Literals.EOBJECT.equals(eClass);
	}
	
	/**
	 * @param element the root element of the model
	 * @param id the id of the row from which the model might have been created
	 * 
	 * @return false in any case
	 */
	public boolean wasModelled(EObject element, ID id) {
		return false;
	}

}
