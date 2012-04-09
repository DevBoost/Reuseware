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
package org.reuseware.coconut.resource.topcased;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.reuseware.coconut.compositionprogram.resource.CompositionProblemReporter;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.ReuseResources;

/**
 * Problem reporter that can annotate Topcased diagrams with markers
 * that are shown on visual elements in the diagrams.
 */
public class TopcasedCompositionProblemReporter implements
		CompositionProblemReporter {

	private EObject findNotationFor(EObject problemSource) {
		Resource resource = problemSource.eResource();
		if (resource == null || !resource.getURI().isPlatformResource()) {
			return null;
		}
		
		ResourceSet resourceSet = resource.getResourceSet();
		if (resourceSet != null) {
			Fragment fragment = ReuseResources.INSTANCE.getFragment(ReuseResources.INSTANCE.getID(resource.getURI()), 
					resourceSet);
			
			if (fragment != null) {
				for (EObject diagramRoot : fragment.getDiagrams()) {
					if (diagramRoot.getClass().getCanonicalName().equals(
							"org.topcased.modeler.diagrams.model.internal.impl.DiagramsImpl")) {
						Iterator<EObject> i = diagramRoot.eResource().getAllContents();
						while (i.hasNext()) {
							EObject next = i.next();
							for (EObject crossRef : next.eCrossReferences()) {
								if (problemSource.equals(crossRef)) {
									return next;
								}
							}
						}
					}
				}
			}
		}
		
		return null;
	}

	/**
	 * Returns the Topcased diagram file that is associated
	 * with the model containing the problem's source element.
	 * 
	 * @param problemSource the EObject causing the problem
	 * 
	 * @return file with Topcased diagram
	 */
	public IFile getFile(EObject problemSource) {
		EObject notation = findNotationFor(problemSource);
		if (notation == null) {
			return null;
		}
		IFile file = WorkspaceSynchronizer.getFile(notation.eResource());
		return file;
	}
	
	/**
	 * @param problemSource the EObject causing the problem
	 * 
	 * @return <code>EValidator.MARKER</code> since this type is used by Topcased as well
	 */
	public String getMarkerType(EObject problemSource) {
		return EValidator.MARKER;
	}

	/**
	 * Sets the <code>EValidator.URI_ATTRIBUTE</code> attribute to the
	 * URI of the problem source element since this localization method
	 * is supported by Topcased.
	 * 
	 * @param problemSource the EObject causing the problem
	 * @param attributes the attributes for the marker that can be extended by this methods
	 */
	public void getAttributes(EObject problemSource,
			Map<String, Object> attributes) {
		attributes.put(
				EValidator.URI_ATTRIBUTE, 
				EcoreUtil.getURI(problemSource).toString());
	}

}
