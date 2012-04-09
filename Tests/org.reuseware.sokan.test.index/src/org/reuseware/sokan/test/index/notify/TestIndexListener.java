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
package org.reuseware.sokan.test.index.notify;

import java.util.Set;

import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.notify.IndexListener;

/**
 * @author Matthias Schmidt
 * 
 */
public class TestIndexListener implements IndexListener {

	private Set<ID> myDelta;

	public void indexChanged(Set<ID> delta) {
		myDelta = delta;
	}

	public Set<ID> getMyDelta() {
		return myDelta;
	}

	public void setMyDelta(Set<ID> myDelta) {
		this.myDelta = myDelta;
	}
}
