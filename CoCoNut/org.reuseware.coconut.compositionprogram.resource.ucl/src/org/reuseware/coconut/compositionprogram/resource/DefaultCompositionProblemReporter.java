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
package org.reuseware.coconut.compositionprogram.resource;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * A default implementation of the <code>CompositionProblemReporter</code> interface
 * that creates a default marker for a file without further information about
 * the location of the problem <i>inside</i> the file.
 */
public class DefaultCompositionProblemReporter implements
		CompositionProblemReporter {

	/**
	 * Default marker type:
	 * <i>org.eclipse.core.resources.problemmarker</i>.
	 */
	public static final String DEFAULT_MARKER_TYPE = "org.eclipse.core.resources.problemmarker";
	
	/**
	 * Returns the file in the workspace that corresponds to the resource
	 * that contains the given EObject.
	 * 
	 * @param problemSource the EObject causing the problem
	 * 
	 * @return file holding the problem source EObject
	 */
	public IFile getFile(EObject problemSource) {
		Resource resource = problemSource.eResource();
		if (resource == null || !resource.getURI().isPlatformResource()) {
			return null;
		}
		IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(
				resource.getURI().toPlatformString(true));
		return file;
	}
	
	/**
	 * @param problemSource the EObject causing the problem
	 * 
	 * @return <code>DEFAULT_MARKER_TYPE</code>
	 */
	public String getMarkerType(EObject problemSource) {
		return DEFAULT_MARKER_TYPE;
	}

	/**
	 * This implementation does nothing.
	 * 
	 * @param problemSource the EObject causing the problem
	 * @param attributes the attributes for the marker that can be extended by this methods
	 */
	public void getAttributes(EObject problemSource,
			Map<String, Object> attributes) {
		//
	}


}
