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

import org.eclipse.emf.common.util.URI;
import org.reuseware.coconut.roundtrip.RoundTripAdapter;
import org.reuseware.coconut.roundtrip.IConflictResolveResultHandler;

/**
 * An empty implementation of IConflictResolveResultHandler.
 */
public abstract class AbstractResolveResultHandler implements
		IConflictResolveResultHandler {

	public void confirmChanges(RoundTripAdapter adapter) {
		// do nothing
	}

	public void copyFragment(RoundTripAdapter adapter) {
		// do nothing
	}

	public void discardChanges(RoundTripAdapter adapter) {
		// do nothing
	}

	public void postCompareAction(RoundTripAdapter adapter) {
		// do nothing
	}

	public void preCompareAction(RoundTripAdapter adapter) {
		// do nothing
	}

	public void sourceFragmentSelected(RoundTripAdapter adapter,
			URI selectedFragmentUFI) {
		// do nothing
	}
}
