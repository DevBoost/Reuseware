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
package org.reuseware.coconut.fragment.util;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;

/**
 * An adapter that informs about which values the adapted EObject replaced
 * and from which setting it was removed during composition.
 */
public class ReplacementForAdapter extends AdapterImpl {

	protected EList<EObject> replacedValues     = new BasicEList<EObject>();
	protected Setting        removedFromSetting = null;

	/**
	 * Constructor for ReplacementForAdapter.
	 */
	public ReplacementForAdapter() {
		super();
	}
	
	/**
	 * @param type the type to check
	 * 
	 * @return <code>ReplacementForAdapter.class</code>
	 */
	public boolean isAdapterForType(Object type) {
		return type == ReplacementForAdapter.class;
	}
	
	/**
	 * @return modifiable list of replaced values.
	 */
	public EList<EObject> getReplacedValues() {
		return replacedValues;
	}

	/**
	 * Set the setting from which the adapted EObject was removed.
	 * 
	 * @param removedFromSetting the setting
	 */
	public void setRemovedFromSetting(Setting removedFromSetting) {
		this.removedFromSetting = removedFromSetting;
	}
	
	/**
	 * @return the setting from which the adapted EObject was removed
	 */
	public Setting getRemovedFromSetting() {
		return removedFromSetting;
	}

}
