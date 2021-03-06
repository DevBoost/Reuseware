/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.sokan.index;

import java.util.HashSet;

/**
 * Super class for classes that are in danger of causing an invokation loop
 * which can be broken by using functionality provided by this class.
 */
public abstract class LoopBreaker {

	protected HashSet<Object> wasCalled;
	protected Object lastCallee;

	/**
	 * The constructor.
	 */
	public LoopBreaker() {
		wasCalled = new HashSet<Object>();
		lastCallee = null;
	}

	protected boolean checkForInvokationLoop() {
		if (lastCallee != null) {
			wasCalled.add(lastCallee);
			lastCallee = null;
			return true;
		}

		wasCalled.clear();
		return false;
	}

	protected boolean wasCalledBefore(Object callee) {
		if (wasCalled.contains(callee)) {
			return true;
		}
		setLastCallee(callee);
		return false;
	}

	protected boolean thisCausedInvokationLoop() {
		if (lastCallee == null) {
			return true;
		}
		unSetLastCallee();
		return false;
	}

	protected void setLastCallee(Object newCallee) {
		lastCallee = newCallee;
	}

	protected void unSetLastCallee() {
		setLastCallee(null);
	}
}
