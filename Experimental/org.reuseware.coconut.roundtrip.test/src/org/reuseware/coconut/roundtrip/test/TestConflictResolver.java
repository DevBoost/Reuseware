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
package org.reuseware.coconut.roundtrip.test;

import java.util.Collection;
import java.util.List;

import junit.framework.Assert;

import org.eclipse.emf.common.util.URI;
import org.reuseware.coconut.fragment.util.CopiedFromAdapter;
import org.reuseware.coconut.fragment.util.EModificationType;
import org.reuseware.coconut.roundtrip.ICallbackCopyFragment;
import org.reuseware.coconut.roundtrip.ICallbackFragmentSelected;
import org.reuseware.coconut.roundtrip.ICallbackNameChosen;
import org.reuseware.coconut.roundtrip.IConflictResolver;

public class TestConflictResolver implements IConflictResolver {
	
	private URI selectedFragmentUFI;
	private Boolean doCopyFragment;
	private URI newNameForCopiedFragment;

	public void chooseCopyFragement(EModificationType type,
			List<URI> compositionPrograms, CopiedFromAdapter adapter,
			ICallbackCopyFragment callback) {
		Assert.assertNotNull("Set doCopyFragment before.", doCopyFragment);
		System.out.println("chooseCopyFragement() : " + doCopyFragment);
		callback.copySelected(doCopyFragment.booleanValue(), adapter);

		// reset to default
		doCopyFragment = null;
		System.out.println("ResetDoCopyFragment");
	}

	public void chooseNewNameForCopiedFragment(CopiedFromAdapter adapter,
			ICallbackNameChosen callback) {
		Assert.assertNotNull("Set newNameForCopiedFragment before.", newNameForCopiedFragment);
		callback.setChosenName(adapter, newNameForCopiedFragment);
		// reset to default
		newNameForCopiedFragment = null;
	}

	public void chooseSourceFragement(EModificationType type,
			Collection<URI> compositionProgramURIs, CopiedFromAdapter adapter,
			ICallbackFragmentSelected callback) {
		System.out.println("chooseSourceFragement(" + compositionProgramURIs + ")");
		Assert.assertNotNull("Set fragment URI to select before.", selectedFragmentUFI);
		Assert.assertTrue("The URI should be in the list to choose from.", compositionProgramURIs.contains(selectedFragmentUFI));
		callback.fragmentSelected(adapter, selectedFragmentUFI);
		// reset to default
		selectedFragmentUFI = null;
	}

	public void setSelectedFragmentUFI(URI selectedFragmentUFI) {
		this.selectedFragmentUFI = selectedFragmentUFI;
	}

	public void setDoCopyFragment(boolean doCopyFragment) {
		System.out.println("setDoCopyFragment(" + doCopyFragment + ")");
		this.doCopyFragment = new Boolean(doCopyFragment);
	}

	public void setNewNameForCopiedFragment(URI newNameForCopiedFragment) {
		this.newNameForCopiedFragment = newNameForCopiedFragment;
	}
}
