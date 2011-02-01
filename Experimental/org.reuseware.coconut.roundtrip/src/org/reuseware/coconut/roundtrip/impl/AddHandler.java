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

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.reuseware.coconut.roundtrip.RoundTripAdapter;
import org.reuseware.coconut.roundtrip.EModificationType;
import org.reuseware.coconut.roundtrip.ICallbackCopyFragment;
import org.reuseware.coconut.roundtrip.ICallbackFragmentSelected;
import org.reuseware.coconut.roundtrip.IConflictResolver;

/**
 * AddHandler extends AbstractHandler to implement analysis functionality for
 * modifications that add elements.
 * 
 * @author Roland Samlaus
 */
public class AddHandler extends AbstractHandler {

	public AddHandler(IConflictResolver resolver) {
		super(resolver);
	}

	/**
	 * Handle the addition of an element. The addition may cause conflicts,
	 * if the fragment is used in multiple composition programs. If this is 
	 * the case, the conflict resolver is asked for a resolution.
	 * 
	 * @param modifiedFragmentUFI
	 *            the UFI of the modified fragment
	 * @param adapter
	 *            The adapter that was notified after adding an element.
	 */
	public void handleAdd(URI modifiedFragmentUFI, RoundTripAdapter adapter) {
		// first check whether the addition can possibly be
		// propagated to multiple source fragments and use
		// conflict resolver to choose one
		Set<URI> otherEdgeUFIs = getNeigbourUFIs(adapter, adapter.getOriginalUFI());
		if (otherEdgeUFIs.size() > 1) {
			selectSourceFragment(modifiedFragmentUFI, otherEdgeUFIs, adapter);
		} else if (otherEdgeUFIs.size() == 1) {
			// found single UFI
			checkForMultipleCompositionPrograms(otherEdgeUFIs.iterator().next(), adapter);
		} else {
			assert false;
		}
	}

	/**
	 * Checks whether the element was added "on edge". If so, the element can be
	 * added to multiple source fragments.
	 * 
	 * @param adapter
	 *            CopiedFromAdapter that was notified.
	 * @param ufi
	 *            UFI of the fragment where the element was added.
	 * @return List of possible source fragment UFIs.
	 */
	private Set<URI> getNeigbourUFIs(RoundTripAdapter adapter, URI ufi) {

		// has the parent a different UFI?
		Set<URI> otherUFIs = new LinkedHashSet<URI>();
		otherUFIs.add(ufi);

		List<EObject> neighbours = adapter.getCopyValues();
		for (EObject neighbour : neighbours) {
			RoundTripAdapter cfAdapter = getAdapter(neighbour);

			if (cfAdapter == null) {
				continue;
			}

			Resource resource = cfAdapter.getOriginal().eResource();
			if (resource == null) {
				continue;
			}

			URI otherUFI = resource.getURI();
			otherUFIs.add(otherUFI);
		}

		return otherUFIs;
	}

	public void confirmChanges(RoundTripAdapter adapter) {
		adapter.confirmAddElements();
	}

	public void discardChanges(RoundTripAdapter adapter) {
		adapter.discardAdd();
	}

	/*
	private void postCompareAction(CopiedFromAdapter adapter) {
		adapter.undoChanges();
	}

	private void preCompareAction(CopiedFromAdapter adapter) {
		adapter.addTemporary();
	}
	*/

	/**
	 * Asks the conflict resolve to choose one of the possible source fragments 
	 * when the new element can be potentially added.
	 * 
	 * @param modifiedFragmentUFI
	 *            the UFIs of the modified fragment
	 * @param sourceUFIs
	 *            the UFIs of all possible source fragments
	 * @param adapter 
	 *            the adapter that was notified about the addition of a new element
	 */
	private void selectSourceFragment(
			final URI modifiedFragmentUFI, 
			Set<URI> sourceUFIs, 
			RoundTripAdapter adapter) {

		getConflictResolver().chooseSourceFragement(EModificationType.ON_EDGE, sourceUFIs, adapter, new ICallbackFragmentSelected() {

			public void fragmentSelected(RoundTripAdapter adapter,
					URI selectedFragmentUFI) {

				RoundTripAdapter newAdapter = tranferChangeToSelectedFragment(adapter, selectedFragmentUFI);
				checkForMultipleCompositionPrograms(selectedFragmentUFI, newAdapter);
			}
		});
	}
	
	private void checkForMultipleCompositionPrograms(URI modifiedSourceFragmentUFI, RoundTripAdapter adapter) {
		
		// the check whether the modified source fragment is
		// used in multiple composition programs
		List<URI> compositionProgramUFIs = getCompositionProgramsUsing(modifiedSourceFragmentUFI);
		if (compositionProgramUFIs.size() == 1) {
			confirmChanges(adapter);
		} else if (compositionProgramUFIs.size() > 1) {
			getConflictResolver().chooseCopyFragement(EModificationType.ADD, compositionProgramUFIs, adapter, new ICallbackCopyFragment() {
				
				public void copySelected(boolean doCopy, RoundTripAdapter adapter) {
					if (doCopy) {
						copyFragment(adapter);
					} else {
						confirmChanges(adapter);
					}
				}
			});
		} else {
			assert false;
		}
	}

	@Override
	public void modifyTemporary(RoundTripAdapter adapter) {
		adapter.addTemporary();
	}

	private RoundTripAdapter tranferChangeToSelectedFragment(
			RoundTripAdapter adapter, URI selectedFragmentUFI) {
		List<EObject> copies = adapter.getCopyValues();
		for (EObject copy : copies) {
			
			RoundTripAdapter copyAdapter = getAdapter(copy);
			if (copyAdapter == null) {
				continue;
			}
			Resource resource = copyAdapter.getOriginal().eResource();
			if (resource == null) {
				continue;
			}
			// find the adapter for the element in the selected
			// fragment
			if (resource.getURI().equals(selectedFragmentUFI)) {
				copyAdapter.setCopyValues(adapter.getCopyValues());
				copyAdapter.setFeature(adapter.getFeature());
				copyAdapter.setIdx(adapter.getIdx());
				copyAdapter.setOriginal(copyAdapter.getOriginal().eContainer());
				return copyAdapter;
			}
		}
		return adapter;
	}
}
