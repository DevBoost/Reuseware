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
package org.reuseware.coconut.resource.resourceset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;
import org.reuseware.coconut.fracol.FragmentCollaboration;
import org.reuseware.coconut.resource.ReuseResourceAccess;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivatorList;

/**
 * A reuse resource manager that manages resources in memory
 * by using a single resource set.
 */
public class ResourceSetReuseResourceAccess implements ReuseResourceAccess {

	protected ReuseResourceSet reuseResourceSet = null;

	protected List<URI> storeURIs = new ArrayList<URI>();
	protected URI defaultStoreURI = null;
	
	protected Map<List<String>, URI> idToStoreURIMap = new LinkedHashMap<List<String>, URI>();

	
	public void addStore(URI storeURI) {
		storeURIs.add(storeURI);
	}
	
	public ResourceSetReuseResourceAccess(ReuseResourceSet reuseResourceSet, URI defaultStoreURI) {
		super();
		this.reuseResourceSet = reuseResourceSet;
		this.defaultStoreURI = defaultStoreURI;
	}
	
	private URI idToURI(List<String> ID) {
		URI storeURI = idToStoreURIMap.get(ID);
		if (storeURI == null) {
			return defaultStoreURI.appendSegments(
					ID.toArray(new String[ID.size()]));
		}
		return storeURI.appendSegments(
				ID.toArray(new String[ID.size()]));
	}
	
	private List<String> uriToID(URI uri) {
		for(URI storeURI : storeURIs) {
			if (uri.toString().startsWith(storeURI.appendSegment("").toString())) {
				List<String> ID =  uri.segmentsList().subList(storeURI.segmentCount(), uri.segmentCount());
				idToStoreURIMap.put(ID, storeURI);
				return ID;
			}
		}
		if (uri.toString().startsWith(defaultStoreURI.appendSegment("").toString())) {
			List<String> ID =  uri.segmentsList().subList(defaultStoreURI.segmentCount(), uri.segmentCount());
			idToStoreURIMap.put(ID, defaultStoreURI);
			return ID;
		}
		return null;
	}
	

	
	public List<String> getID(URI contentsURI) {
		return uriToID(contentsURI);
	}
	
	public URI getContentsURI(List<String> ID) {
		return idToURI(ID);
	}

	public List<URI> getDiagramURIs(List<String> ID) {
		Resource contentsResource = null;
		try {
			contentsResource = reuseResourceSet.getResource(idToURI(ID), true);
		} catch(Exception e) {}
		if (contentsResource == null) {
			return Collections.emptyList();
		}
		
		Set<URI> diagramURIs = new TreeSet<URI>();
		for(Resource diagramResource : new ArrayList<Resource>(reuseResourceSet.getResources())) {
			if (!diagramResource.getContents().isEmpty() && diagramResource.getContents().get(0).eClass().getName().equals("Diagram")) {
				for(Iterator<EObject> i = diagramResource.getAllContents(); i.hasNext(); ) {
					EObject next = i.next();
					for(EObject referencedElement : next.eCrossReferences()) {
						URI referencedURI = referencedElement.eResource().getURI();
						if(referencedURI.equals(idToURI(ID))) {
							diagramURIs.add(diagramResource.getURI());
						}
					}
				}
			}
		}
		return new ArrayList<URI>(diagramURIs);
	}
	
	public List<List<String>> getAllFragmentCollaborationIDs() {
		List<List<String>> result = new ArrayList<List<String>>();

		for(Resource resource : new ArrayList<Resource>(reuseResourceSet.getResources())) {
			List<String> ID = uriToID(resource.getURI());
			FragmentCollaboration fracol = 
				ReuseResourcesUtil.getFragmentCollaboration(ID, reuseResourceSet);
			if (fracol != null) {
				result.add(ID);
			}
		}
		return result;
	}
	
	public List<List<String>> getAllReuseExtensionIDs(){
		List<List<String>> result = new ArrayList<List<String>>();

		for(Resource resource : new ArrayList<Resource>(reuseResourceSet.getResources())) {
			List<String> ID = uriToID(resource.getURI());
			ReuseExtension reuseExtension = 
				ReuseResourcesUtil.getReuseExtension(ID, reuseResourceSet);
			if (reuseExtension != null) {
				result.add(ID);
			}
		}
		return result;
	}
	
	public List<List<String>> getAllReuseExtensionActivatorListIDs(){
		List<List<String>> result = new ArrayList<List<String>>();

		for(Resource resource : new ArrayList<Resource>(reuseResourceSet.getResources())) {
			List<String> ID = uriToID(resource.getURI());
			ReuseExtensionActivatorList reuseExtensionActivatorList = 
				ReuseResourcesUtil.getReuseExtensionActivatorList(ID, reuseResourceSet);
			if (reuseExtensionActivatorList != null) {
				result.add(ID);
			}
		}
		return result;
	}
	
	public List<List<String>> getAllCompositionProgramIDs(){
		List<List<String>> result = new ArrayList<List<String>>();

		for(Resource resource : new ArrayList<Resource>(reuseResourceSet.getResources())) {
			List<String> ID = uriToID(resource.getURI());
			CompositionProgram compositionProgram = 
				ReuseResourcesUtil.getCompositionProgram(ID, reuseResourceSet);
			if (compositionProgram != null) {
				result.add(ID);
			}
		}
		return result;
	}
	
	public List<List<String>> getAllFragmentIDs(){
		List<List<String>> result = new ArrayList<List<String>>();

		for(Resource resource : new ArrayList<Resource>(reuseResourceSet.getResources())) {
			URI uri = resource.getURI();
			//every resource can be treated as fragment
			result.add(uriToID(uri));
		}
		return result;
	}
	
	public List<List<String>> getAllComposedFragmentIDs() {
		List<List<String>> result = new ArrayList<List<String>>();
		for(URI uri : reuseResourceSet.getComposedFragmentURIs()) {
			result.add(uriToID(uri));
		}
		return result;
	}
	
	public List<List<String>> getAllDerivedCompositionProgramIDs(){
		List<List<String>> result = new ArrayList<List<String>>();

		for(Resource resource : new ArrayList<Resource>(reuseResourceSet.getResources())) {
			List<String> ID = uriToID(resource.getURI());
			DerivedCompositionProgram derivedCompositionProgram = 
				ReuseResourcesUtil.getDerivedCompositionProgram(ID, reuseResourceSet);
			if (derivedCompositionProgram != null) {
				result.add(ID);
			}
		}
		return result;
	}


}
