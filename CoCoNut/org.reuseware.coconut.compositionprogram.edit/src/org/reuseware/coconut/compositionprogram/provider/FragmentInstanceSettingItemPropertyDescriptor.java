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
package org.reuseware.coconut.compositionprogram.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.reuseware.coconut.compositionprogram.CompositionprogramPackage;
import org.reuseware.coconut.compositionprogram.FragmentInstance;

public class FragmentInstanceSettingItemPropertyDescriptor extends
		ItemPropertyDescriptor {
	public FragmentInstanceSettingItemPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	protected Object getValue(EObject object, EStructuralFeature feature) {
		return super.getValue(findCorrectOwner(feature, object), feature);
	}

	public String getId(Object object) {
		if (feature == CompositionprogramPackage.Literals.SETTING__VALUE) {
			return getCategory(object) + "_" + getDisplayName(object);
		}
		return super.getId(object);
	}

	public void setPropertyValue(Object object, Object value) {
		super.setPropertyValue(findCorrectOwner(feature, (EObject) object),
				value);
	}

	private EObject findCorrectOwner(EStructuralFeature feature, EObject owner) {
		// find the proper owner
		if (feature == CompositionprogramPackage.Literals.SETTING__VALUE) {
			String propertyName = getDisplayName(owner);
			String portName = getCategory(owner);
			if (owner instanceof FragmentInstance) {
				FragmentInstance fInstance = (FragmentInstance) owner;
	
				return fInstance.getSetting(portName, propertyName);
			}
		}
		return owner;
	}
}
