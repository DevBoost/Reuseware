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
package org.reuseware.sokan.index.notify;

import java.util.LinkedHashSet;
import java.util.Set;

import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.LoopBreaker;

/**
 * The index notifier manages the index listeners and can 
 * be instructed to inform all listeners about an update.
 */
public class IndexNotifier extends LoopBreaker {

	private Set<IndexListener> allListeners;
	private Set<IndexListener> activeListeners;

	/**
	 * The constructor.
	 */
	public IndexNotifier() {
		super();
		allListeners = new LinkedHashSet<IndexListener>();
		activeListeners = new LinkedHashSet<IndexListener>();
	}

	/**
	 * Registers the given index listener.
	 * 
	 * @param listener the index listener
	 */
	public void add(IndexListener listener) {
		allListeners.add(listener);
	}

	/**
	 * Unregisters the given index listener.
	 * 
	 * @param listener the index listener
	 */
	public void remove(IndexListener listener) {
		allListeners.remove(listener);
		activeListeners.remove(listener);
	}

	/**
	 * Notifies all registered indexers that the indexed information of
	 * all artifacts with the given IDs have been updated.
	 * 
	 * @param delta the updated artifact IDs
	 */
	public void notifyListeners(Set<ID> delta) {
		if (allListeners.isEmpty() || delta.isEmpty()) {
			return;
		}
		Object last = super.lastCallee;
		if (checkForInvokationLoop()) {
			activeListeners.add((IndexListener) last);
			return;
		}

		boolean goOn;
		do {
			goOn = false;

			Set<IndexListener> toNotify;
			toNotify = new LinkedHashSet<IndexListener>();
			toNotify.addAll(activeListeners);
			toNotify.addAll(allListeners);

			for (IndexListener listener : toNotify) {
				if (super.wasCalledBefore(listener)) {
					continue;
				}
				listener.indexChanged(delta);

				if (super.thisCausedInvokationLoop()) {
					goOn = true;
					break;
				}
			}
		} while (goOn);
	}
}
