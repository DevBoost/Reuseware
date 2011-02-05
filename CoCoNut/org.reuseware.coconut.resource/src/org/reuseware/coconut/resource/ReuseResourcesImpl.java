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
package org.reuseware.coconut.resource;

import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.fragment.Fragment;

/**
 * Default implementation of the reuse resource management interfaces that
 * delegates to a registered implementation.
 */
public class ReuseResourcesImpl implements ReuseResources {
	private boolean initialised = false;
	
	private ReuseResourceAccess reuseResourceAccess = null;
	private ReuseResourceDependencyCalculator resourceDependencyCalculator = null;
	private FragmentCompositionInterfaceCreator fragmentCompositionInterfaceCreator = null;
	
	/**
	 * Initializes the resource management system with the given implementations.
	 * 
	 * @param reuseResourceAccess                 the access implementation
	 * @param resourceDependencyCalculator        the dependency calculator implementations
	 * @param fragmentCompositionInterfaceCreator the composition interface creator implementation
	 */
	public synchronized void init(
			ReuseResourceAccess reuseResourceAccess,
			ReuseResourceDependencyCalculator resourceDependencyCalculator,
			FragmentCompositionInterfaceCreator fragmentCompositionInterfaceCreator) {
		if (initialised) {
			throw new IllegalStateException(
					"Reuse resource management is already initialised");
		}
		if (reuseResourceAccess == null || resourceDependencyCalculator == null || fragmentCompositionInterfaceCreator == null) {
			throw new IllegalStateException(
				"Reuse resource management can not be initialised with null");
		}
		
		this.reuseResourceAccess = reuseResourceAccess;
		this.resourceDependencyCalculator = resourceDependencyCalculator;
		this.fragmentCompositionInterfaceCreator = fragmentCompositionInterfaceCreator;
		
		initialised = true;
	}
	
	/**
	 * Shuts down the resource management system.
	 */
	public synchronized void shutDown() {
		if (!initialised) {
			throw new IllegalStateException(
					"Reuse resource management is not initialised");
		}
		this.reuseResourceAccess = null;
		this.resourceDependencyCalculator = null;
		this.fragmentCompositionInterfaceCreator = null;
		initialised = false;
	}
	
	private void initOnDemand() {
		if (initialised) {
			return;
		}
		if (initFromExtensionPoint()) {
			initialised = true;
		} else {
			throw new IllegalStateException(
				"Reuse resource management can not be initialised");
		}
	}
	
	private boolean initFromExtensionPoint() {
		try {
			if (Platform.isRunning()) {
		        IExtensionPoint reuseResourcesEP = 
		        	Platform.getExtensionRegistry().getExtensionPoint(REUSE_RESOURCES_EP_ID);
		        IConfigurationElement[] entries = reuseResourcesEP.getConfigurationElements();
		        
		        for (int i = 0; i < entries.length; i++) {
		        	IConfigurationElement entry = entries[i];
		        	try {
			        	if (entry.getName().equals("reuseResourceAccess")) {
			        		this.reuseResourceAccess = (ReuseResourceAccess) 
			        			entry.createExecutableExtension("class");
			        	}
			        	if (entry.getName().equals("resourceDependencyCalculator")) {
			        		this.resourceDependencyCalculator = (ReuseResourceDependencyCalculator) 
			        			entry.createExecutableExtension("class");
			        	}
			        	if (entry.getName().equals("fragmentCompositionInterfaceCreator")) {
			        		this.fragmentCompositionInterfaceCreator = (FragmentCompositionInterfaceCreator) 
			        			entry.createExecutableExtension("class");
			        	}
		        	} catch (Exception e) {
			        	e.printStackTrace();
			        	return false;
			        }
		        }
				return true;
			}
		} catch (RuntimeException e) {
			if (e.getCause() instanceof ClassNotFoundException) {
				// Platform not installed
			} else {
				throw e;
			}
		}
		return false;
	}
	
	// ReuseResourceAccess
	/**
	 * @param resourceURI URI of an artifact
	 * @return ID of the artifact in the repository
	 */
	public List<String> getID(URI resourceURI) {
		if (resourceURI == null) {
			return null;
		}
		initOnDemand();
		return reuseResourceAccess.getID(resourceURI);
	}
	
	/**
	 * @param iD ID of the artifact in the repository
	 * @return URI of the artifact
	 */
	public URI getContentsURI(List<String> iD) {
		if (iD == null) {
			return null;
		}
		initOnDemand();
		return reuseResourceAccess.getContentsURI(iD);
	}
	
	/**
	 * @param iD ID of the artifact in the repository
	 * @return URIs of the diagrams associated with the artifact
	 */
	public List<URI> getDiagramURIs(List<String> iD) {
		initOnDemand();
		return reuseResourceAccess.getDiagramURIs(iD);
	}
	
	/**
	 * @return IDs of all Fracols registered in the repository
	 */
	public List<List<String>> getAllFragmentCollaborationIDs() {
		initOnDemand();
		return reuseResourceAccess.getAllFragmentCollaborationIDs();
	}
	
	/**
	 * @return IDs of all reuse extensions registered in the repository
	 */
	public List<List<String>> getAllReuseExtensionIDs() {
		initOnDemand();
		return reuseResourceAccess.getAllReuseExtensionIDs();
	}
	
	/**
	 * @return IDs of all reuse extension activator lists registered in the repository
	 */
	public List<List<String>> getAllReuseExtensionActivatorListIDs() {
		initOnDemand();
		return reuseResourceAccess.getAllReuseExtensionActivatorListIDs();
	}
	
	/**
	 * @return IDs of all composition programs registered in the repository
	 */
	public List<List<String>> getAllCompositionProgramIDs() {
		initOnDemand();
		return reuseResourceAccess.getAllCompositionProgramIDs();
	}
	
	/**
	 * @return IDs of all derived composition programs registered in the repository
	 */
	public List<List<String>> getAllDerivedCompositionProgramIDs() {
		initOnDemand();
		return reuseResourceAccess.getAllDerivedCompositionProgramIDs();
	}
	
	/**
	 * @return IDs of all fragments registered in the repository
	 */
	public List<List<String>> getAllFragmentIDs() {
		initOnDemand();
		return reuseResourceAccess.getAllFragmentIDs();
	}
	
	/**
	 * @return IDs of all composed fragments registered in the repository
	 */
	public List<List<String>> getAllComposedFragmentIDs() {
		initOnDemand();
		return reuseResourceAccess.getAllComposedFragmentIDs();
	}

	
	// FragmentCompositionInterfaceCreator
	/**
	 * @param ufi ID of the fragment for which to compute the composition interface
	 * @param resourceSet resource set for loading resources
	 * @return the computed composition interface
	 */
	public Fragment getFragment(
			List<String> ufi, ResourceSet resourceSet) {
		initOnDemand();
		return fragmentCompositionInterfaceCreator.getFragment(ufi, resourceSet);
	}
	
	
	// ReuseResourceDependencyCalculator
	/**
	 * Calculates which composition interfaces need to be updated
	 * if the given Fracol has changed.
	 * 
	 * @param fracolID ID of the Fracol that has been changed
	 * @return the composition interfaces to update
	 */
	public List<List<String>> getInfluencedCompositionInterfaceIDsFracol(
			List<String> fracolID) {
		initOnDemand();
		return resourceDependencyCalculator.getInfluencedCompositionInterfaceIDsFracol(
				fracolID);
	}

	/**
	 * Calculates which composition interfaces need to be updated
	 * if the given component model specification (REXcm) has changed.
	 * 
	 * @param rexcmID ID of the REXcm that has been changed
	 * @return the composition interfaces to update
	 */
	public List<List<String>> getInfluencedCompositionInterfaceIDsRexCM(
			List<String> rexcmID) {
		initOnDemand();
		return resourceDependencyCalculator.getInfluencedCompositionInterfaceIDsRexCM(
				rexcmID);
	}

	/**
	 * Calculates which composition interfaces need to be updated
	 * if the given reuse extension activator has changed.
	 * 
	 * @param rexActivatorID ID of the reuse extension activator that has been changed
	 * @return the composition interfaces to update
	 */
	public List<List<String>> getInfluencedCompositionInterfaceIDsRexActivator(
			List<String> rexActivatorID) {
		initOnDemand();
		return resourceDependencyCalculator.getInfluencedCompositionInterfaceIDsRexActivator(
				rexActivatorID);
	}
	/**
	 * Calculates which composition programs need to be re-executed
	 * if the given Fracol has changed.
	 * 
	 * @param fracolID ID of the Fracol that has been changed
	 * @return the composition program to re-execute
	 */
	public List<List<String>> getInfluencedComposingCompositionProgramIDsFracol(
			List<String> fracolID) {
		initOnDemand();
		return resourceDependencyCalculator.getInfluencedComposingCompositionProgramIDsFracol(
				fracolID);
	}

	/**
	 * Calculates which composition programs need to be re-executed
	 * if the given component model specification (REXcm)  has changed.
	 * 
	 * @param rexcmID ID of the REXcm that has been changed
	 * @return the composition program to re-execute
	 */
	public List<List<String>> getInfluencedComposingCompositionProgramIDsRexCM(
			List<String> rexcmID) {
		initOnDemand();
		return resourceDependencyCalculator.getInfluencedComposingCompositionProgramIDsRexCM(
				rexcmID);
	}

	/**
	 * Calculates which composition programs need to be re-executed
	 * if the given reuse extension activator has changed.
	 * 
	 * @param rexActivatorID ID of the reuse extension activator that has been changed
	 * @return the composition program to re-execute
	 */
	public List<List<String>> getInfluencedComposingCompositionProgramIDsRexActivator(
			List<String> rexActivatorID) {
		initOnDemand();
		return resourceDependencyCalculator.getInfluencedComposingCompositionProgramIDsRexActivator(
				rexActivatorID);
	}

	/**
	 * Calculates which composition programs need to be re-executed
	 * if the given fragment has changed.
	 * 
	 * @param fragmentID ID of the fragment that has been changed
	 * @return the composition program to re-execute
	 */	
	public List<List<String>> getInfluencedComposingCompositionProgramIDsFragment(
			List<String> fragmentID) {
		initOnDemand();
		return resourceDependencyCalculator.getInfluencedComposingCompositionProgramIDsFragment(
				fragmentID);
	}

	/**
	 * Calculates which derived composition programs need to be re-derived
	 * if the given Fracol has changed.
	 * 
	 * @param fracolID ID of the Fracol that has been changed
	 * @return the composition programs to re-derive
	 */
	public List<List<String>> getInfluencedDerivedCompositionProgramIDsFracol(
			List<String> fracolID) {
		initOnDemand();
		return resourceDependencyCalculator.getInfluencedDerivedCompositionProgramIDsFracol(
				fracolID);
	}

	/**
	 * Calculates which derived composition programs need to be re-derived
	 * if the given composition language specifications (REXcl) has changed.
	 * 
	 * @param rexclID ID of the REXcl that has been changed
	 * @return the composition programs to re-derive
	 */
	public List<List<String>> getInfluencedDerivedCompositionProgramIDsRexCL(
			List<String> rexclID) {
		initOnDemand();
		return resourceDependencyCalculator.getInfluencedDerivedCompositionProgramIDsRexCL(
				rexclID);
	}

	/**
	 * Calculates which derived composition programs need to be re-derived
	 * if the given fragment from which the programs are derived has changed.
	 * 
	 * @param fragmentID ID of the fragment that has been changed
	 * @return the composition programs to re-derive
	 */
	public List<List<String>> getInfluencedDerivedCompositionProgramIDsCompositionProgramSource(
			List<String> fragmentID) {
		initOnDemand();
		return resourceDependencyCalculator.getInfluencedDerivedCompositionProgramIDsCompositionProgramSource(
				fragmentID);
	}
	
	/**
	 * Calculates which derived composition programs need to be re-derived
	 * if the given reuse extension activator has changed.
	 * 
	 * @param rexActivatorID ID of the reuse extension activator that has been changed
	 * @return the composition programs to re-derive
	 */
	public List<List<String>> getInfluencedCompositionProgramSourceIDsRexActivator(
			List<String> rexActivatorID) {
		initOnDemand();
		return resourceDependencyCalculator.getInfluencedCompositionProgramSourceIDsRexActivator(
				rexActivatorID);
	}
}
