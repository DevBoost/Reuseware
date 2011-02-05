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
package org.reuseware.sokan.index.notify;

import java.util.Set;

import org.reuseware.sokan.ID;

/**
 * Clients implementing this interface can register with <code>IndexUtil.addListener()</code>
 * to get notified about changes in the index.
 */
public interface IndexListener {

	/**
	 * The index of the artifacts with the given IDs has changed.
	 *  
	 * @param delta set of artifact IDs of changed index rows
	 */
	void indexChanged(Set<ID> delta);
}
