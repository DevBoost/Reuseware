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

import java.util.LinkedHashSet;
import java.util.Set;

import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.notify.IndexListener;
import org.reuseware.sokan.index.notify.IndexNotifier;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * @author Matthias Schmidt
 * 
 */
public class MockIndex {
	public static final MockIndex INSTANCE = new MockIndex();

	private IndexNotifier notifier;
	private int value;

	private MockIndex() {
		notifier = new IndexNotifier();
		setValue(0);
	}

	public void addListener(IndexListener listener) {
		notifier.add(listener);
	}

	public void removeListener(IndexListener listener) {
		notifier.remove(listener);
	}

	/**
	 * @param newValue
	 *            the value to set
	 */
	public void setValue(int newValue) {
		value = newValue;

		Set<ID> delta = new LinkedHashSet<ID>();
		ID mockID = ResourceUtil.idFrom("my/mock/id.file");
		delta.add(mockID);
		
		notifier.notifyListeners(delta);
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
}
