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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.reuseware.coconut.compositionprogram.CompositionLink;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.sokan.index.indexer.Validatable;

/**
 * A specialized XMI resource for UCL composition programs. After loading,
 * it links the fragment instances of the composition program to the 
 * corresponding fragments that are found in the Sokan repository.
 * <p>
 * This resource implements the <code>Validatable</code> interface of Sokan 
 * to allow Sokan to control at which points composition programs are re-validated.
 */
public class UCLResource extends XMIResourceImpl implements Validatable {
	
	/**
	 * Creates an instance of the resource.
	 * @param uri the URI of the new resource
	 */
	public UCLResource(URI uri) {
		super(uri);
	}

	/**
	 * Sets the FragmentInstance.fFragment reference after loading.
	 * 
	 * @param inputStream the stream
	 * @param options the load options.
	 * @throws IOException caused by super implementation
	 */
	public void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		super.doLoad(inputStream, options);
		ReuseResourcesUtil.completeCompositionProgram(this);
	}

	/**
	 * Validates the resource and produces the corresponding error markers.
	 */
	public void validate() {
		clearOldProblems();
		for (EObject root : getContents()) {
			org.eclipse.emf.common.util.Diagnostic diagnostic = Diagnostician.INSTANCE.validate(root);
			addProblem(diagnostic);
		}
	}
	
	private void clearOldProblems() {
		List<String> ucpi = ReuseResources.INSTANCE.getID(getURI());
		Set<Resource> resourcesToUnmark = new LinkedHashSet<Resource>();
		if (ucpi != null) {
			resourcesToUnmark.add(this);
			for (Iterator<EObject> i = getAllContents(); i.hasNext();) {
				EObject element = i.next();
				if (element instanceof FragmentInstance) {
					for (EObject derivedFrom : ((FragmentInstance) element).getDerivedFrom()) {
						Resource resource = derivedFrom.eResource();
						if (resource != null) {
							resourcesToUnmark.add(resource);
						}
					}
				}
				if (element instanceof CompositionLink) {
					for (EObject derivedFrom : ((CompositionLink) element).getDerivedFrom()) {
						Resource resource = derivedFrom.eResource();
						if (resource != null) {
							resourcesToUnmark.add(resource);
						}
					}
				}
			}
		}
		//add also diagram resources
		for (Resource contentResource : new ArrayList<Resource>(resourcesToUnmark)) {
			URI uri = contentResource.getURI();
			ResourceSet resourceSet = getResourceSet();
			if (resourceSet != null && uri != null) {
				Fragment fragment = ReuseResources.INSTANCE.getFragment(ReuseResources.INSTANCE.getID(uri), 
						resourceSet);
				if (fragment != null) {
					for (EObject diagramRoot : fragment.getDiagrams()) {
						Resource resource = diagramRoot.eResource();
						if (resource != null) {
							resourcesToUnmark.add(resource);
						}
					}
				}
			}
		}
		
		for (Resource resource : resourcesToUnmark) {
			UCLMarkerHelper.unmark(resource, ucpi);
		}
	}
	
	private void addProblem(org.eclipse.emf.common.util.Diagnostic diagnostic) {
		List<org.eclipse.emf.common.util.Diagnostic> children = diagnostic.getChildren();
		if (children.size() == 0) {
			if (diagnostic.getSeverity() == org.eclipse.emf.common.util.Diagnostic.OK) {
				return;
			}
			
			UCLDiagnostic uclDiagnostic = new UCLDiagnostic(diagnostic);
			if (diagnostic.getSeverity() == org.eclipse.emf.common.util.Diagnostic.ERROR) {
				getErrors().add(uclDiagnostic);
			} else {
				getWarnings().add(uclDiagnostic);
			}
			List<String> ucpi = ReuseResources.INSTANCE.getID(getURI());
			if (ucpi != null) {
				UCLMarkerHelper.mark(uclDiagnostic, ucpi);
			}
		}
		for (org.eclipse.emf.common.util.Diagnostic child : children) {
			addProblem(child);
		}
	}
	
	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		super.doSave(outputStream, options);
	}
}
