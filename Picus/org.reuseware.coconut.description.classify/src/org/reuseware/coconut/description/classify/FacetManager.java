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
package org.reuseware.coconut.description.classify;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.reuseware.coconut.description.DescriptionFactory;
import org.reuseware.coconut.description.DirectDerivation;
import org.reuseware.coconut.description.FacetDefinition;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.classify.derive.DerivationManager;
import org.reuseware.coconut.repository.ID;
import org.reuseware.coconut.repository.PackageableElement;
import org.reuseware.coconut.repository.RepositoryFactory;
import org.reuseware.coconut.repository.resource.ReuseResources;

public class FacetManager {

	public final static int TYPE_LIST_FACET = 1;
	public final static int TYPE_TREE_FACET = 2;
	public final static int TYPE_DATE_FACET = 3;
	public final static int TYPE_RANGE_FACET = 4;
	public final static int TYPE_FREE_TEXT_FACET = 5;


	public static FacetType buildDirectDerivableType(EClass typeClass, String name,
			String description, String rule) {
		// create type instance
		EObject obj = DescriptionFactory.eINSTANCE.create(typeClass);
		if (!(obj instanceof FacetType))
			return null;
		FacetType type = (FacetType) obj;

		// create a derivation data
		DirectDerivation data = DescriptionFactory.eINSTANCE
				.createDirectDerivation();
		data.setDerivatorID(DerivationManager.ID_DirectDerivator);
		data.setRule(rule);

		// set the derivation data and other attributes
		type.setDerivationData(data);
		type.setName(name);
		type.setDescription(description);

		return type;
	}

	public static FacetValue buildFacetValue(String name, String description,
			EObject value, List<FacetValue> children) {
		if (name == null)
			return null;

		FacetValue back = DescriptionFactory.eINSTANCE.createFacetValue();

		// set the data
		back.setName(name);
		back.setDescription(description);
		back.setValue(value);

		// append the children
		if (children != null)
			back.getChildren().addAll(children);

		return back;
	}

	public static boolean isDerivableType(Object obj) {
		if (obj == null || !(obj instanceof FacetType))
			return false;
		FacetType type = (FacetType) obj;

		return type.getDerivationData() != null;
	}

	public static Set<FacetType> getRegisteredTypes() {
		// get all the elements in the store
		List<PackageableElement> allElements = ReuseResources.INSTANCE
				.getRootPackage().getAllElements();

		Set<FacetType> registeredTypes = new HashSet<FacetType>();
		// if the element is a FacetDefinition, add it's FacetTypes to the list
		for (PackageableElement elem : allElements) {
			if (!(elem instanceof FacetDefinition))
				continue;
			registeredTypes.addAll(((FacetDefinition) elem).getFacetTypes());
		}

		return registeredTypes;
	}

	public static ID getTypeID(FacetType type) {
		ID id = RepositoryFactory.eINSTANCE.createID();
		id = type.getContainer().getID().append(type.getName());
		return id;
	}

	public static FacetType getTypeByID(ID typeID) {
		if (typeID == null || typeID.getSegments().size() == 0)
			return null;

		Set<FacetType> types = getRegisteredTypes();
		ID testID;

		for (FacetType facetType : types) {
			testID = getTypeID(facetType);
			if (typeID.equals(testID))
				return facetType;
		}

		return null;
	}

}
