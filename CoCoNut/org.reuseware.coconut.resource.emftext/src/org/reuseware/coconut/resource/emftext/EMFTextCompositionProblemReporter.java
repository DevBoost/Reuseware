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
package org.reuseware.coconut.resource.emftext;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.emftext.access.EMFTextAccessProxy;
import org.emftext.access.resource.ILocationMap;
import org.emftext.access.resource.IResource;
import org.reuseware.coconut.compositionprogram.resource.CompositionProblemReporter;

/**
 * Problem reporter that can annotate EMFText models with markers
 * that are shown in the text editors at the positions of the 
 * elements causing the problems.
 */
public class EMFTextCompositionProblemReporter implements
		CompositionProblemReporter {

	/**
	 * Default problem marker type of Eclipse which is supported by EMFText:
	 * <i>org.eclipse.core.resources.problemmarker</i>.
	 */
	public static final String DEFAULT_MARKER_TYPE = "org.eclipse.core.resources.problemmarker";

	/**
	 * The file containing the problem source if the file contains
	 * a textual EMFText model.
	 * 
	 * @param problemSource the EObject causing the problem
	 * 
	 * @return file containing the model
	 */
	public IFile getFile(EObject problemSource) {
		Resource resource = problemSource.eResource();
		if (resource == null) {
			return null;
		}
		if (!EMFTextAccessProxy.isAccessibleWith(resource.getClass(), IResource.class)) {
			return null;
		}
		IFile file = WorkspaceSynchronizer.getFile(resource);
		return file;
	}

	/**
	 * @param problemSource the EObject causing the problem
	 * 
	 * @return Eclipse default marker type which is supported by EMFText
	 */
	public String getMarkerType(EObject problemSource) {
		return DEFAULT_MARKER_TYPE;
	}

	/**
	 * Sets the following standard attributes supported by EMFText:
	 * <code>IMarker.LINE_NUMBER</code>,
	 * <code>IMarker.CHAR_START</code>, and
	 * <code>IMarker.CHAR_END</code>.
	 * 
	 * @param problemSource the EObject causing the problem
	 * @param attributes the attributes for the marker that can be extended by this methods
	 */
	public void getAttributes(EObject problemSource,
			Map<String, Object> attributes) {
		Resource resource = problemSource.eResource();
		IResource textResource = (IResource) EMFTextAccessProxy.get(resource, IResource.class);
		ILocationMap locationMap = textResource.getLocationMap();
		attributes.put(IMarker.LINE_NUMBER, locationMap.getLine(problemSource));
		attributes.put(IMarker.CHAR_START, locationMap.getCharStart(problemSource));
		attributes.put(IMarker.CHAR_END, locationMap.getCharEnd(problemSource));
	}
}
