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
package org.reuseware.coconut.ui;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * Interface to be implemented by diagram initializers. A diagram initializer
 * can create a diagram for a given model. It is used if a user selects to open
 * a model as diagram and there is currently no diagram available.
 */
public interface DiagramInitializer {
	
	/**
	 * @param modelResource resource holding the model
	 * @return true if a diagram for the given model can be created by this initializer
	 */
	boolean canInitializeDiagramFor(Resource modelResource);
	
	/**
	 * Initialize a diagram for the given model.
	 * 
	 * @param modelResource resource holding the model
	 * @return resource holding the newly created diagram
	 */
	Resource initializeDiagram(Resource modelResource);
}
