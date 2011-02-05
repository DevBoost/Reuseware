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
package org.reuseware.sokan.index.indexer;

/**
 * Interface that allows Sokan to control validation of resources. A resource
 * needs to implement this interface in addition to the EMF <code>Resource</code> 
 * interface in order to get validated by Sokan.
 */
public interface Validatable {
	
	/**
	 * Perform the validation of myself.
	 */
	void validate();

}
