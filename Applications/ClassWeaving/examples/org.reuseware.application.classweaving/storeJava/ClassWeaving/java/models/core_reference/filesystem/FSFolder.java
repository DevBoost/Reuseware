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
package org.reuseware.test;


public class FSFolder {
	public java.lang.String name;
	public java.lang.Byte content;
	public java.util.List < org.reuseware.test.FileSystem >observers = new java.util.LinkedList < org.reuseware.test.FileSystem >();
	public void attach( org.reuseware.test.FileSystem observer) {
	observers.add(observer);
}
	public void detach( org.reuseware.test.FileSystem observer) {
	observers.remove(observer);
}
	public void notifyObserver() {
}
}
