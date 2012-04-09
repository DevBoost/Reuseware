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

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;

/**
 * A problem reporter identifies a file that should be marked
 * with a problem marker because it holds some responsibility for
 * the problem. The reporter can influence the type of the
 * marker and its attributes which may help to identify the 
 * exact part of the file content that is responsible.
 */
public interface CompositionProblemReporter {
	
	/**
	 * Returns a file in the workspace that is responsible for
	 * the problem.
	 * 
	 * @param problemSource the EObject causing the problem
	 * 
	 * @return file to be marked; null, if this reporter can not report for any file
	 */
	IFile getFile(EObject problemSource);
	
	/**
	 * Returns the type of the marker.
	 * 
	 * @param problemSource the EObject causing the problem
	 * 
	 * @return marker type
	 */
	String getMarkerType(EObject problemSource);

	/**
	 * Defines additional attributes for the marker.
	 * 
	 * @param problemSource the EObject causing the problem
	 * @param attributes the attributes for the marker that can be extended by this methods
	 */
	void getAttributes(EObject problemSource, Map<String, Object> attributes);
}
