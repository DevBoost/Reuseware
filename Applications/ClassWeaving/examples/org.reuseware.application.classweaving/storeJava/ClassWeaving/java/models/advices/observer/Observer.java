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
package org.reuseware.lib.java.pattern.adviceobserver;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Observer {

	public List<Subject> subjects = new LinkedList<Subject>();

	public void update() {
		Iterator<Subject> it;
		it = subjects.iterator();
		
		while (it.hasNext()) {
			Subject subject;
			subject = it.next();
			subject.notify();
		}
	}
	
}
