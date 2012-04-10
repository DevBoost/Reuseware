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


public class FileSystem {
	public java.lang.String name;
	public java.util.List < org.reuseware.test.FSFolder >subjectFolder = new java.util.LinkedList < org.reuseware.test.FSFolder >();
	public void updatFolder() {
	java.util.Iterator < org.reuseware.test.FSFolder >it;
	it = subjectFolder.iterator();
	while (it.hasNext()) {
		org.reuseware.test.FSFolder subject;
		subject = it.next();
		subject.notify();
	}
}
	public java.util.List < org.reuseware.test.FSFile >subjectFile = new java.util.LinkedList < org.reuseware.test.FSFile >();
	public void updatFile() {
	java.util.Iterator < org.reuseware.test.FSFile >it;
	it = subjectFile.iterator();
	while (it.hasNext()) {
		org.reuseware.test.FSFile subject;
		subject = it.next();
		subject.notify();
	}
}
}
