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

import org.reuseware.coconut.roundtrip.impl.RoundtripModificationHandler;

public class RoundtripModificationHandlerFactory {

	public final static RoundtripModificationHandlerFactory INSTANCE = new RoundtripModificationHandlerFactory();
	
	private RoundtripModificationHandlerFactory() {
		super();
	}
	
	public IModificationHandler createRoundtripModificationHandler(IConflictResolver conflictResolver) {
		return new RoundtripModificationHandler(conflictResolver);
	}
}
