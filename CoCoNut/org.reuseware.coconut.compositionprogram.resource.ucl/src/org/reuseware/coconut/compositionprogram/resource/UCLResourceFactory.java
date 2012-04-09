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
package org.reuseware.coconut.compositionprogram.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * Resource factory for UCL resources.
 */
public class UCLResourceFactory extends ResourceFactoryImpl {
	
	/**
	 * Creates an instance of the resource factory.
	 */
	public UCLResourceFactory() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * 
	 * @param uri of the UCL resource to create
	 * @return the new UCL resource
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new UCLResource(uri);
		return result;
	}

} 
