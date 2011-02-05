/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.sokan.index.indexer;

/**
 * Current state of the running indexing process.
 */
public final class State {

	private State() { }
	
	private static boolean isCreating = false;
	private static boolean isCalcDep = false;
	

	protected static void setCreating() {
		isCreating = true;
	}

	protected static void unsetCreating() {
		isCreating = false;
	}

	protected static boolean isCreating() {
		return isCreating;
	}
	
	protected static void setCalcDep() {
		isCalcDep = true;
	}

	protected static void unsetCalcDep() {
		isCalcDep = false;
	}

	protected static boolean isCalculatingDependencies() {
		return isCalcDep;
	}
}
