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

/**
 * Collects all interfaces that need to be implemented by a full
 * resource management system for Reuseware. It offers a default
 * implementation that delegates to the concrete registered 
 * implementation.
 */
public interface ReuseResources extends 
		ReuseResourceAccess,
		ReuseResourceDependencyCalculator, 
		FragmentCompositionInterfaceCreator {
	
	/**
	 * Extension point ID:
	 * <i>org.reuseware.coconut.resource.reuseResources</i>.
	 */
	String REUSE_RESOURCES_EP_ID = 
		"org.reuseware.coconut.resource.reuseResources";
	
	/**
	 * The reuse resources instance.
	 */
	ReuseResources INSTANCE = 
		new ReuseResourcesImpl();
	
	/**
	 * Initializes the resource management system with the given implementations.
	 * 
	 * @param reuseResourceAccess                 the access implementation
	 * @param resourceDependencyCalculator        the dependency calculator implementations
	 * @param fragmentCompositionInterfaceCreator the composition interface creator implementation
	 */
	void init(
			ReuseResourceAccess reuseResourceAccess,
			ReuseResourceDependencyCalculator resourceDependencyCalculator,
			FragmentCompositionInterfaceCreator fragmentCompositionInterfaceCreator);
	
	/**
	 * Shuts down the resource management system.
	 */
	void shutDown();
}
