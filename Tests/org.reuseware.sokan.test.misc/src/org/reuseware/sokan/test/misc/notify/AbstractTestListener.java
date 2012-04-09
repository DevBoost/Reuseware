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
package org.reuseware.sokan.test.misc.notify;

import org.reuseware.sokan.index.notify.IndexListener;

/**
 * @author Matthias Schmidt
 * 
 */
public abstract class AbstractTestListener implements IndexListener {
	protected static final MockIndex INDEX = MockIndex.INSTANCE;
	private int myValue;
	protected String name;
	protected int invokeCounter;

	public AbstractTestListener(String name) {
		this.name = name;
		this.invokeCounter = 0;
	}

	protected void print(String comment) {
		myValue = INDEX.getValue();

		String string = this.getClass().getSimpleName() + " (" + name + ")";
		string += comment == null ? "" : comment;
		string += ": " + myValue;

		System.out.println(string);
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int newValue) {
		myValue = newValue;
	}

	public int getInvokeCounter() {
		return invokeCounter;
	}

	public void setInvokeCounter(int newCounter) {
		invokeCounter = newCounter;
	}
}
