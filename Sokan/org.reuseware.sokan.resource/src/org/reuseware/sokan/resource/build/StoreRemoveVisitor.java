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
package org.reuseware.sokan.resource.build;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.reuseware.sokan.index.util.StoreUtil;

/**
 * Visitor that removes complete stores from the index if
 * a store folder was unmarked by the user.
 */
public class StoreRemoveVisitor implements IResourceDeltaVisitor {

	private final StoreUtil storeUtil = StoreUtil.INSTANCE;
	
	/**
	 * If the current resource represents a removed store, the store
	 * is completely removed from the index.
	 * 
	 * @param delta the resource delta
	 * 
	 * @return false if the current resource is a removed store 
	 * 
	 * @throws CoreException if the visit fails for some reason.
	 */
	public boolean visit(IResourceDelta delta) throws CoreException {
		for (IResourceDelta childDelta : delta.getAffectedChildren()) {
			if (storeUtil.isStoreFile(childDelta.getResource())) {
				if (childDelta.getKind() == IResourceDelta.REMOVED) {
					if (delta.getResource() instanceof IContainer) {
						IContainer store = (IContainer) delta.getResource();
						storeUtil.removeDeletedStores(store);
					}
				}
				return false;
			}
		}
		return true;
	}

}
