/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.roundtrip.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.id.ID;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.roundtrip.ICallbackNameChosen;
import org.reuseware.coconut.roundtrip.IConflictResolver;
import org.reuseware.coconut.roundtrip.RoundTripAdapter;

/**
 * AbstractHandler implements functionality that is shared by the
 * handler for adding, removing and changing elements.
 */
public abstract class AbstractHandler {

	private IConflictResolver conflictResolver;

	public AbstractHandler(IConflictResolver resolver) {
		super();
		this.conflictResolver = resolver;
	}
	
	public IConflictResolver getConflictResolver() {
		return conflictResolver;
	}

	public abstract void modifyTemporary(RoundTripAdapter adapter);

	public void copyFragment(RoundTripAdapter adapter) {
		// copy the source fragment and connect the corresponding composition
		getConflictResolver().chooseNewNameForCopiedFragment(adapter, new ICallbackNameChosen() {

			public void setChosenName(RoundTripAdapter adapter, URI newName) {
				saveFragment(adapter, newName);
			}
		});
	}
	
	public void saveFragment(RoundTripAdapter adapter, URI newSourceUFI) {

		// modify temporarily and save a copy of the fragment
		// to a new UFI
		modifyTemporary(adapter);
		URI originalUFI = adapter.getOriginalUFI();
		saveToNewSourceFragment(originalUFI, newSourceUFI);
		
		// then revert the changes
		adapter.undoChanges();
		// TODO: I think the following line of code did not do anything useful
		// FragmentRegistry.INSTANCE.updateVirtualFragment(adapter.getOriginalUFI());

		// TODO implement correction of the composition program
		/*
		PackageableElement element = ReuseResources.INSTANCE.getElement(
				IDUtil.uriToID(adapter.openerUFI));

		if (!(element instanceof CompositionProgram)) {
			return;
		}
		CompositionProgram corrCompositionProgram = (CompositionProgram) element;

		saveNewInformationToCompositionProgram(corrCompositionProgram, 
				originalUFI, newSourceUFI);
		saveCompositionProgram(corrCompositionProgram);
		*/
	}

	/**
	 * Method that returns an adapter of type CopiedFromAdapter from a given
	 * EObject.
	 * 
	 * @param eObject
	 *            The EObject that holds the Adapter.
	 * @return Returns the CopiedFromAdapter from the given EObject
	 */
	protected RoundTripAdapter getAdapter(EObject eObject) {
		RoundTripAdapter resultAdapter = null;
		Iterator<Adapter> containerAdapter = eObject.eAdapters().iterator();

		while (containerAdapter.hasNext()) {
			Adapter nextAdapter = containerAdapter.next();
			if (nextAdapter instanceof RoundTripAdapter) {
				resultAdapter = (RoundTripAdapter) nextAdapter;
				break;
			}
		}
		return resultAdapter;
	}

	/**
	 * Saves a modified composition program
	 * 
	 * @param corrCompositionProgram
	 *            The composition program to be saved
	 */
	protected void saveCompositionProgram(CompositionProgram corrCompositionProgram) {
		try {
			corrCompositionProgram.eResource().save(null);
		} catch (Exception e) {
			// TODO show message to the user
			e.printStackTrace();
		}
	}

	/**
	 * Changes the composition program such that the old fragment reference is
	 * modified to point at the copied fragment.
	 * 
	 * @param fixedCompositionProgram
	 *            The affected composition program.
	 * @param originalUFI
	 *            The old fragment UFI.
	 * @param newSourceUFI
	 *            The UFI of the copied fragment.
	 */
	// TODO this does not belong here
	protected void saveNewInformationToCompositionProgram(
			CompositionProgram fixedCompositionProgram,
			URI originalUFI, URI newSourceUFI) {
		Iterator<FragmentInstance> fragmentInstances = fixedCompositionProgram
				.getFragmentInstances().iterator();

		while (fragmentInstances.hasNext()) {
			FragmentInstance fi = fragmentInstances.next();
			if (fi.getUFI().equals(originalUFI.segmentsList())) {
				fi.getUFI().clear();
				fi.getUFI().addAll(newSourceUFI.segmentsList());
				break;
			}
		}
	}

	/**
	 * Saves a copied fragment.
	 * 
	 * @param newSourceURI
	 *            The new physical URI for the copied model.
	 * @param copied
	 *            The copied model content.
	 * @param newDiagrammURI
	 *            The new UFI for the copied diagram. (may be null for textual
	 *            languages)
	 * @param diagram
	 *            The copied model diagram. (may be null for textual languages)
	 */
	// TODO this does not belong here
	protected void saveNewSourceFragment(URI newSourceURI,
			Collection<EObject> copied, URI newDiagrammURI,
			Collection<EObject> diagram) {
		System.out.println("saveNewSourceFragment(" + newSourceURI + ")");
		ResourceSet resourceSet = new ResourceSetImpl();

		Resource newFile = resourceSet.createResource(newSourceURI);

		newFile.getContents().clear();
		newFile.getContents().addAll(copied);

		try {
			newFile.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO show message to the user
			e.printStackTrace();
		}
		
		if (diagram == null) {
			return;
		}
		Resource newDiagram = resourceSet.createResource(newDiagrammURI);

		newDiagram.getContents().clear();
		newDiagram.getContents().addAll(diagram);

		try {
			newDiagram.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO show message to the user
			e.printStackTrace();
		}
	}

	/**
	 * Copies a source fragment.
	 * 
	 * @param originalUFI
	 *            The UFI of the original fragment.
	 * @param newSourceUFI
	 *            UFI where the copied elements should be saved.
	 */
	// TODO this does not belong here
	public void saveToNewSourceFragment(URI originalUFI,
			URI newSourceUFI) {

		Fragment fragmentInstance = (Fragment) ReuseResources.INSTANCE.getElement(
				IDUtil.uriToID(originalUFI));

		Copier copier = new Copier();

		Collection<EObject> copied = copier.copyAll(fragmentInstance.getContents());

		URI diagramURI = null;
		Collection<EObject> copiedDiagram = null;

		//TODO jj: is newSourceUFI the "Reuseware:" URI or the physical URI? We need a physical URI!
		
		if (fragmentInstance.getDiagrams().size() > 0) {
			// EObject copied = copier.copy(frInstance.getContents().get(0));
			copiedDiagram = copier.copyAll(fragmentInstance.getDiagrams());

			String diagramextension = fragmentInstance.getDiagrams().get(0)
					.eResource().getURI().fileExtension();

			diagramURI = newSourceUFI.trimFileExtension().appendFileExtension(diagramextension);
		}
		
		copier.copyReferences();
		saveNewSourceFragment(newSourceUFI, copied, diagramURI, copiedDiagram);
		ReuseResources.INSTANCE.register(newSourceUFI);

	}

	protected List<URI> getCompositionProgramsUsing(URI ufi) {
		System.out.println("getCompositionProgramsUsing(" + ufi + ")");
		ID all = RepositoryFactory.eINSTANCE.createID();
		all = all.append(".*");
		List<PackageableElement> elements = ReuseResources.INSTANCE.getByQuery(all);

		List<URI> result = new ArrayList<URI>();
		for (PackageableElement element : elements) {
			if (!(element instanceof CompositionProgram)) {
				continue;
			}

			CompositionProgram cp = (CompositionProgram) element;
			for (FragmentInstance fragmentInstance : cp.getFragmentInstances()) {
				//TODO target UFI must be logical address!
				if (IDUtil.equals(fragmentInstance.getUFIAsID(), ufi)) {
					result.add(IDUtil.idToURI(cp.getID()));
				}
			}
		}

		System.out.println("getCompositionProgramsUsing(" + ufi + ") : " + result);
		return result;
	}

	/**
	 * Returns all target fragment URIs of the composition program
	 * with the given UFI.
	 * 
	 * @param compositionProgramUFI the UFI of the composition program
	 * @return a list of URIs of all target fragment
	 */
	protected List<URI> getTargetsFromCompositionProgram(URI compositionProgramUFI) {
		PackageableElement element = ReuseResources.INSTANCE.getElement(IDUtil.uriToID(compositionProgramUFI));

		if (!(element instanceof CompositionProgram)) {
			return Collections.emptyList();
		}

		List<URI> result = new ArrayList<URI>();
		CompositionProgram cp = (CompositionProgram) element;
		for (FragmentInstance fragmentInstance : cp.getFragmentInstances()) {
			if (fragmentInstance.isTarget()) {
				result.add(IDUtil.idToURI(fragmentInstance.getTargetUFIAsID()));
			}
		}

		return result;
	}

	/**
	 * Returns the URIs of all composition programs that create 
	 * a fragment with the given UFI.
	 * 
	 * @param ufi the UFI of the target fragment
	 * @return a list of composition program URIs
	 */
	protected List<URI> getCreatingCompositionPrograms(URI ufi) {
		List<URI> result = new ArrayList<URI>();
		if (ufi == null) return result;

		for (PackageableElement element : ReuseResources.INSTANCE.getRootPackage().getAllElements()) {
			if (element instanceof CompositionProgram) {
				CompositionProgram cp = (CompositionProgram) element;

				for (FragmentInstance fi : cp.getFragmentInstances()) {
					boolean isTargetFragment = fi.isTarget();
					boolean ufiIsEqual = IDUtil.idToURI(fi.getTargetUFIAsID()).equals(ufi);
					if (isTargetFragment && ufiIsEqual) {
						result.add(IDUtil.idToURI(cp.getID()));
					}
				}
			}
		}

		return result;
	}
}
