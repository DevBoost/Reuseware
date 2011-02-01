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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.reuseware.coconut.roundtrip.RoundTripAdapter;
import org.reuseware.coconut.roundtrip.EModificationType;
import org.reuseware.coconut.roundtrip.ICallbackCopyFragment;
import org.reuseware.coconut.roundtrip.IConflictResolver;

/**
 * A ChangeHandler extends an AbstractHandler to implement 
 * analysis functionality for modifications that change attributes.
 * 
 * @author Roland Samlaus
 */
public class ChangeHandler extends AbstractHandler {

	public ChangeHandler(IConflictResolver resolver) {
		super(resolver);
	}

	/**
	 * Analyzes if problems occur when performing a modification.
	 * 
	 * @param ufi
	 *            UFI used to retrieve the target fragments that use this
	 *            source.
	 * @param adapter
	 *            The CopiedFromAdapter that was notified.
	 */
	public void handleChange(URI ufi, RoundTripAdapter adapter) {
		Collection<URI> programUFIs = getCreatingCompositionPrograms(ufi);
		// if the fragment is produced by multiple composition programs
		// we must choose between changing either one or all of them
		if (programUFIs.size() > 1) {
			List<URI> targetFragments = getTargetsFromCompositionProgram(ufi);
			selectCopySource(targetFragments, adapter);
		} else {
			confirmChanges(adapter);
		}
	}

	private void confirmChanges(RoundTripAdapter adapter) {
		adapter.confirmChangeAttribute();
	}

	/*
	private void discardChanges(CopiedFromAdapter adapter) {
		adapter.discardChange();
	}
	*/

	public void postCompareAction(RoundTripAdapter adapter) {
		adapter.unchange();
	}

	public void preCompareAction(RoundTripAdapter adapter) {
		adapter.changeTemporary();
	}

	/**
	 * Notifies the conflict resolver about the usage of a source fragment in
	 * multiple composition programs. The resolver must select whether this 
	 * source fragment should be copied (propagating the change only to the
	 * modified composed fragment) or not (propagating the change to all
	 * compositions that use the source fragment.
	 * 
	 * @param compositionProgramUFIs
	 *            a list of the UFIs of all composition programs that use the
	 *            source fragment
	 * @param adapter
	 *            The notified CopiedFromAdapter.
	 */
	private void selectCopySource(List<URI> compositionProgramUFIs,
			RoundTripAdapter adapter) {
		getConflictResolver().chooseCopyFragement(EModificationType.CHANGE, compositionProgramUFIs, adapter, new ICallbackCopyFragment() {
			
			public void copySelected(boolean doCopy, RoundTripAdapter adapter) {
				if (doCopy) {
					copyFragment(adapter);
				} else {
					confirmChanges(adapter);
				}
			}
		});
	}


	@Override
	public void modifyTemporary(RoundTripAdapter adapter) {
		adapter.changeTemporary();
	}
}
