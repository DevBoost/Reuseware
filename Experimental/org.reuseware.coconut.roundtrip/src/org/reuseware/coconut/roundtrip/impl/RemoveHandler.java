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

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.reuseware.coconut.roundtrip.RoundTripAdapter;
import org.reuseware.coconut.roundtrip.EModificationType;
import org.reuseware.coconut.roundtrip.ICallbackFragmentSelected;
import org.reuseware.coconut.roundtrip.IConflictResolver;

/**
 * RemoveHandler extends AbstractHandler to implement analysis functionality for
 * modifications that remove elements.
 * 
 * @author Roland Samlaus
 */
public class RemoveHandler extends AbstractHandler {

	public RemoveHandler(IConflictResolver resolver) {
		super(resolver);
	}

	/**
	 * Handles problems that occur while removing elements from a composed
	 * artifact. Such problem may occur, when multiple composition programs 
	 * use the source fragment the removed element originates from.
	 * 
	 * @param composedArtifactUFI
	 *            the UFI of the composed artifact
	 * @param adapter
	 *            The adapter that was notified about the removal of an element
	 */
	public void handleRemove(URI composedArtifactUFI, RoundTripAdapter adapter) {

		List<URI> programUFIs = getCreatingCompositionPrograms(composedArtifactUFI);
		if (programUFIs.size() > 1) {
			programUFIs = getTargetsFromCompositionProgram(composedArtifactUFI);
			selectSourceToRemoveFrom(programUFIs, adapter);
		} else {
			adapter.confirmRemoveElementsFromFragment();
		}
	}

	/**
	 * Notifies the conflict resolver about a conflict and ask for a decision about
	 * which source fragment the element should be removed from.
	 * 
	 * @param compositionProgramUFIs
	 *            a list of compositions program ufi's where the source fragment
	 *            is used in.
	 */
	private void selectSourceToRemoveFrom(List<URI> compositionProgramUFIs,
			RoundTripAdapter adapter) {
		getConflictResolver().chooseSourceFragement(EModificationType.REMOVE, compositionProgramUFIs, adapter, new ICallbackFragmentSelected() {
			
			public void fragmentSelected(RoundTripAdapter adapter,
					URI selectedFragmentUFI) {
				copyFragment(adapter);
			}
		});
	}

	public void saveOriginal(RoundTripAdapter adapter) {
		adapter.saveOriginalFragment();
	}

	public EObject getOriginal(RoundTripAdapter adapter) {
		return adapter.getOriginal();
	}

	public void setOnEdgeUFI(URI ufi) {
	}

	/*
	private void discardChanges(CopiedFromAdapter adapter) {
		adapter.discardRemove();
	}

	private void preCompareAction(CopiedFromAdapter adapter) {
		adapter.removeTemporary();
	}

	private void postCompareAction(CopiedFromAdapter adapter) {
		adapter.undoChanges();
	}
	*/

	@Override
	public void modifyTemporary(RoundTripAdapter adapter) {
		adapter.removeTemporary();
	}
}
