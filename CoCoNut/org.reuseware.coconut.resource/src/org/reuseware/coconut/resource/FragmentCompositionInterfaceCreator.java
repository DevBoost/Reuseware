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
package org.reuseware.coconut.resource;

import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.fragment.Fragment;

/**
 * A fragment composition interface creator is able to compute
 * the composition interface of a fragment.
 */
public interface FragmentCompositionInterfaceCreator {

	/**
	 * @param ufi ID of the fragment for which to compute the composition interface
	 * @param resourceSet resource set for loading resources
	 * @return the computed composition interface
	 */
	Fragment getFragment(List<String> ufi, ResourceSet resourceSet);
}
