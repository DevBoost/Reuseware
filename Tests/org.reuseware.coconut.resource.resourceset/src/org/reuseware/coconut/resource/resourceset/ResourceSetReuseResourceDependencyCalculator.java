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
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.resource.ReuseResourceDependencyCalculator;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.util.ReuseResourcesUtil;
import org.reuseware.coconut.reuseextension.CompositionLanguageSpecification;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextension.RootElementContext;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivator;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivatorList;

public class ResourceSetReuseResourceDependencyCalculator implements
		ReuseResourceDependencyCalculator {

	private ReuseResourceSet reuseResourceSet = null;
	
	public ResourceSetReuseResourceDependencyCalculator(ReuseResourceSet reuseResourceSet) {
		this.reuseResourceSet = reuseResourceSet;
	}

	/* TODO #1558: Implement required methods below and remove the ones in this section */
	
	public List<List<String>> getInfluencedFragmentIDs(List<String> rexActivatorID) {
		List<List<String>> result = new ArrayList<List<String>>();

		ReuseExtensionActivatorList rexActivatorList = 
			ReuseResourcesUtil.getReuseExtensionActivatorList(
					rexActivatorID, reuseResourceSet);
		
		for(Resource resource : new ArrayList<Resource>(reuseResourceSet.getResources())) {
			boolean isDependentFragment = false;
			List<String> UFI = ReuseResources.INSTANCE.getID(resource.getURI());
			if (ResourceSetReuseResourceUtil.isInScopeOf(UFI, rexActivatorID)) {
				for(ReuseExtensionActivator rexActivator : rexActivatorList.getActivators()) {
					isDependentFragment = ResourceSetReuseResourceUtil.extendsTypeOf(rexActivator, resource, UFI);
					if (isDependentFragment) {
						break;
					}
				}			
			}
			
			if (isDependentFragment) {
				result.add(UFI);			
			}
		}
		return result;
	}
	
	public List<List<String>> getInstantantingCompositionProgramIDs(
			List<String> instatiatedFragmentID) {
		List<List<String>> result = new ArrayList<List<String>>();

		for(Resource resource : new ArrayList<Resource>(reuseResourceSet.getResources())) {
			CompositionProgram compositionProgram = 
				ReuseResourcesUtil.getCompositionProgram(
						ReuseResources.INSTANCE.getID(resource.getURI()), 
						reuseResourceSet);
			if (compositionProgram != null) {
				for(FragmentInstance fi : compositionProgram.getFragmentInstances()) {
					if (instatiatedFragmentID.equals(fi.getUFI())) {
						result.add(compositionProgram.getUCPI());
						break;
					}
				}	
			}
		}
		return result;
	}
	
	public List<List<String>> getDerivedCompositionProgramIDs(
			List<String> derivedFromFragmentID) {
		Resource fragmentResource = null;
		try {
			fragmentResource = reuseResourceSet.getResource(
					ReuseResources.INSTANCE.getContentsURI(derivedFromFragmentID), true);
		} catch(Exception e) {}
		if (fragmentResource == null || fragmentResource.getContents().isEmpty()) {
			return Collections.emptyList();
		}

		Set<List<String>> result = new TreeSet<List<String>>();
		for(Resource resource : new ArrayList<Resource>(reuseResourceSet.getResources())) {
			ReuseExtensionActivatorList rexActivatorList = 
				ReuseResourcesUtil.getReuseExtensionActivatorList(
						ReuseResources.INSTANCE.getID(resource.getURI()), 
						reuseResourceSet);
			
			if (rexActivatorList != null) {
				if (ResourceSetReuseResourceUtil.isInScopeOf(
						derivedFromFragmentID, 
						ReuseResources.INSTANCE.getID(resource.getURI()))){
					for(ReuseExtensionActivator rexActivator : rexActivatorList.getActivators()) {
						ReuseExtension rex = rexActivator.getReuseExtension();
						if (rex instanceof CompositionLanguageSpecification) {
							for(EObject root : fragmentResource.getContents()) {
								for(RootElementContext rootElementContext : rex.getRootElementContexts()) {
									if (rootElementContext.getEBoundClass().isInstance(root)) {
										/*if (Evaluator.eval(
												derivedFromFragmentID, 
												rexActivator.getVariant(), 
												root, 
												rootElementContext.getIsExpression())) {
											List<String> UCPI = Evaluator.deriveID(
													derivedFromFragmentID, 
													rexActivator.getVariant(), 
													root, 
													((CompositionLanguageSpecification)rex).getIdExpression());
											result.add(UCPI);
										}*/
									}
								}
							}
						}
					}
				}
			}
		}
		return new ArrayList<List<String>>(result);
	}

	public List<List<String>> getComposedFragmentIDs(
			List<String> composingCompositionProgramID) {
		List<List<String>> result = new ArrayList<List<String>>();
	
		CompositionProgram compositionProgram = 
			ReuseResourcesUtil.getCompositionProgram(composingCompositionProgramID, reuseResourceSet);
		if (compositionProgram != null) {
			for(FragmentInstance fi : compositionProgram.getFragmentInstances()) {
				if(fi.isTarget()) {
					result.add(fi.getTargetUFI());
				}
			}	
		}
		
		return result;
	}
	
	/* ========================================= */

	public List<List<String>> getInfluencedCompositionInterfaceIDsFracol(
			List<String> fracolID) {
		return Collections.emptyList();
	}

	public List<List<String>> getInfluencedCompositionInterfaceIDsRexCM(
			List<String> rexcmID) {
		return Collections.emptyList();
	}

	public List<List<String>> getInfluencedCompositionInterfaceIDsRexActivator(
			List<String> rexActivatorID) {
		return Collections.emptyList();
	}

	public List<List<String>> getInfluencedComposingCompositionProgramIDsFracol(
			List<String> fracolID) {
		return Collections.emptyList();
	}

	public List<List<String>> getInfluencedComposingCompositionProgramIDsRexCM(
			List<String> rexID) {
		return Collections.emptyList();
	}

	public List<List<String>> getInfluencedComposingCompositionProgramIDsRexActivator(
			List<String> rexActivatorID) {
		return Collections.emptyList();
	}

	public List<List<String>> getInfluencedComposingCompositionProgramIDsFragment(
			List<String> fragmentID) {
		return Collections.emptyList();
	}

	public List<List<String>> getInfluencedDerivedCompositionProgramIDsFracol(
			List<String> fracolID) {
		return Collections.emptyList();
	}

	public List<List<String>> getInfluencedDerivedCompositionProgramIDsRexCL(
			List<String> rexclID) {
		return Collections.emptyList();
	}

	public List<List<String>> getInfluencedDerivedCompositionProgramIDsCompositionProgramSource(
			List<String> fragmentID) {
		return Collections.emptyList();
	}

	public List<List<String>> getInfluencedCompositionProgramSourceIDsRexActivator(
			List<String> rexActivatorID) {
		return Collections.emptyList();
	}

}
