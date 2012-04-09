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
package org.reuseware.lacome;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;

/**
 * Implementations of this interface provide
 * tracing information between models and copies
 * of models to Lacome. Lacome works with diagrams
 * of copied models and sometimes needs to know
 * how the copies were modified compared to the
 * original models in order to modify the copied 
 * diagrams accordingly.
 */
public interface TraceProvider {
	
	/**
	 * @param copy a copy of a model element
	 * @return the original model element
	 */
	EObject getOriginal(EObject copy);
	
	/**
	 * @param element a model element
	 * @return model elements that were replaced by the given element
	 */
	List<EObject> getReplacedValues(EObject element);

	/**
	 * @param element a model element
	 * @return the setting from which the element was removed (if any)
	 */
	Setting getRemovedFromSetting(EObject element);

	/**
	 * @param element a model element
	 * @return all elements from which this element was derived 
	 *         (e.g., by some kind of model transformation)
	 */
	List<EObject> getDerivedFrom(EObject element);
}
