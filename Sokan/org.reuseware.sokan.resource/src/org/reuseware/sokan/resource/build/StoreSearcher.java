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
package org.reuseware.sokan.resource.build;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.reuseware.sokan.index.util.StoreUtil;
import org.reuseware.sokan.resource.util.BuildUtil;

/**
 * A resource visitor that finds all store folder in a project
 * by looking for .store files.
 */
public class StoreSearcher implements IResourceVisitor {

	
	/**
	 * If the current resource is a .store file, its containing folder
	 * is marked as store.
	 * 
	 * @param resource the resource 
	 * 
	 * @return false if the current resource is a .store file
	 * 
	 * @throws CoreException if the visit fails for some reason.
	 */
	public boolean visit(IResource resource) throws CoreException {
		if (!StoreUtil.INSTANCE.isStoreFile(resource)) {
			return true;
		}
		IContainer storeContainer = (IContainer) resource.getParent();
		String pattern = StoreUtil.INSTANCE
				.acquireFilterPattern(storeContainer);
		BuildUtil.visitStore(storeContainer, pattern, true);
		return false;
	}

}
