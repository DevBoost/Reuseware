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
package org.reuseware.coconut.roundtrip;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;

/**
 * Instances of IConflictResolver can be used to resolve 
 * conflict cause by modifications that were made to 
 * source fragments.
 */
public interface IConflictResolver {

	/**
	 * The method is called when a change can possibly be applied
	 * to multiple source fragments. The resolver must choose which
	 * one has to be changed or cancel the modification.
	 * 
	 * @param composedIn
	 * @param adapter
	 */
	public void chooseSourceFragement(EModificationType type, Collection<URI> composedIn, RoundTripAdapter adapter, ICallbackFragmentSelected callback);

	/**
	 * This method is called when a change is propagated to a source 
	 * fragment which is used in multiple composition programs. The
	 * resolver must choose between copying the fragment (and thus 
	 * using the copy) or modifying the fragment (and thus changing
	 * all target fragment.
	 * 
	 * @param type
	 * @param compositionPrograms a set of all composition programs
	 * @param adapter
	 */
	public void chooseCopyFragement(EModificationType type, List<URI> compositionPrograms,
			RoundTripAdapter adapter, ICallbackCopyFragment callback);

	public void chooseNewNameForCopiedFragment(RoundTripAdapter adapter, ICallbackNameChosen callback);
}
