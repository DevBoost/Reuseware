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
package org.reuseware.coconut.resource.sokan;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Resource factory for creating fragment resources.
 */
public class FragmentResourceFactory implements Resource.Factory {

	/**
	 * Creates a new fragment resource.
	 * 
	 * @param uri the URI of the resource
	 * @return the new resource
	 */
	public Resource createResource(URI uri) {
		return new FragmentResource(uri);
	}

}
