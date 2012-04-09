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
package org.reuseware.sokan.test.index.emodeler;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.emodeler.EModeler;
import org.reuseware.sokan.test.model.ModelPackage;
import org.reuseware.sokan.test.util.TestUtil;

public class FacetOtherEModeler implements EModeler {
	private static final String FACET_NAME = "name";

	public List<? extends EObject> createMetaDataModel(IndexRow row, ResourceSet resourceSet) {
		return Collections.singletonList(TestUtil.buildFacetInstance(FACET_NAME,
				row));
	}
	
	public boolean canModel(IndexRow row, EClass eClass) {
		return ModelPackage.Literals.FACET_INSTANCE.equals(eClass);
	}

	public boolean wasModelled(EObject element, ID id) {
		return ModelPackage.Literals.FACET_INSTANCE.isInstance(element);
	}
}
