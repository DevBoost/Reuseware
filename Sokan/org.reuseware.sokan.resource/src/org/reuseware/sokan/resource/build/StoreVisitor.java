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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.resource.util.FilterUtil;

/**
 * Resource visitor that adds and removes artifacts from
 * the index.
 */
public class StoreVisitor implements IResourceVisitor {

	private String filterPattern;
	private boolean inAddMode;

	/**
	 * Create a new store visitor.
	 * 
	 * @param filterPattern pattern the resource's name needs to match
	 * @param addMode true if resources are added; false if they are removed
	 */
	public StoreVisitor(String filterPattern, boolean addMode) {
		this.filterPattern = filterPattern;
		this.inAddMode = addMode;
	}

	/**
	 * Removes or adds the given resource to/from the index depending
	 * on the mode of this visitor. The resource's name has to match this
	 * visitor's pattern.
	 * 
	 * @param resource the resource
	 * 
	 * @return always true
	 * 
	 * @throws CoreException if this method fails.
	 */
	public boolean visit(IResource resource) throws CoreException {
		// if it is an artifact, add it
		if (FilterUtil.isArtifact(resource, filterPattern)) {
			if (inAddMode) {
				IndexUtil.INSTANCE.addArtifact(resource);
			} else {
				IndexUtil.INSTANCE.removeArtifact(resource);
			}
		}
		return true;
	}
}
