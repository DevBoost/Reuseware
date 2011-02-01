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
package org.reuseware.coconut.roundtrip.interactive.impl;

import java.awt.Frame;
import java.util.Collection;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.URI;
import org.reuseware.coconut.fragment.util.CopiedFromAdapter;
import org.reuseware.coconut.fragment.util.EModificationType;
import org.reuseware.coconut.roundtrip.ICallbackCopyFragment;
import org.reuseware.coconut.roundtrip.ICallbackFragmentSelected;
import org.reuseware.coconut.roundtrip.ICallbackNameChosen;
import org.reuseware.coconut.roundtrip.IConflictResolver;

public class InteractiveConflictResolver implements IConflictResolver {

	public void chooseSourceFragement(EModificationType type, List<URI> composedIn,
			RoundTripAdapter adapter) {
		//if (!TracingGuiListenerRegistry.INSTANCE.confirmCancelOrCopy(type, this, adapter)) {
			//mup = new MultipleUtilizationPane(composedIn, adapter, resultHandler);
		//}
	}

	public void chooseCopyFragement(EModificationType type,
			List<URI> compositionPrograms, RoundTripAdapter adapter,
			ICallbackCopyFragment callback) {
		// TODO Auto-generated method stub
		
	}

	public void chooseNewNameForCopiedFragment(RoundTripAdapter adapter,
			ICallbackNameChosen callback) {
		showSelectNewNameGUI(adapter, callback);
	}

	public void chooseSourceFragement(EModificationType type,
			Collection<URI> composedIn, RoundTripAdapter adapter,
			ICallbackFragmentSelected callback) {
		// TODO Auto-generated method stub
		
	}

	private void showSelectNewNameGUI(RoundTripAdapter adapter, ICallbackNameChosen callback) {
		URI originalUFI = adapter.getOriginalUFI();
		// TODO this suffix should be different for other types of changes
		URI newSourceUFI = getNameAdvice(originalUFI, "_added");
		//if (!TracingGuiListenerRegistry.INSTANCE.copyFragment(newSourceUFI, this))

		newSourceUFI = URI.createURI((String) JOptionPane.showInputDialog(
				new Frame(),
				"Please enter a new name for the Source Fragment: \n",
				"Please enter new name", JOptionPane.PLAIN_MESSAGE, null,
				null, newSourceUFI));
		
		callback.setChosenName(adapter, newSourceUFI);
	}


	/**
	 * Creates a name for a duplicated fragment.
	 * 
	 * @param originalUFI
	 *            the Old UFI
	 * @param appendix
	 * @return
	 */
	protected URI getNameAdvice(URI originalUFI, String appendix) {
		URI pre = originalUFI.trimFileExtension();
		String fileExtension = originalUFI.fileExtension();
		URI newSourceUFI = pre.trimSegments(1).appendSegment(
				pre.lastSegment() + appendix)
				.appendFileExtension(fileExtension);
		return newSourceUFI;
	}
}
