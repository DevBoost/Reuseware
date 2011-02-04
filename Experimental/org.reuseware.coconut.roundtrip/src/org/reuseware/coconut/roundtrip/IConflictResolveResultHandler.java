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


public interface IConflictResolveResultHandler {
	
	public void confirmChanges(RoundTripAdapter adapter);
	public void discardChanges(RoundTripAdapter adapter);
	public void copyFragment(RoundTripAdapter adapter);
	// TODO do these two methods belong here?
	public void preCompareAction(RoundTripAdapter adapter);
	public void postCompareAction(RoundTripAdapter adapter);
}