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
package org.reuseware.coconut.roundtrip.interactive.listener;

// TODO remove this class?
public class TracingGuiListenerRegistry {

	public final static TracingGuiListenerRegistry INSTANCE = new TracingGuiListenerRegistry();

	/*
	private List<IChangeListener> changeListeners;

	private TracingGuiListenerRegistry() {
		super();
	}

	public void registerListener(IChangeListener listener) {
		if (changeListeners == null) {
			changeListeners = new ArrayList<IChangeListener>();
		}
		changeListeners.add(listener);
	}

	public void unregisterListener(IChangeListener listener) {
		if (changeListeners == null) {
			return;
		}

		if (changeListeners.contains(listener)) {
			changeListeners.remove(listener);
		}
	}

	public boolean showCandidates(Object[] options, AbstractHandler gui) {
		if (changeListeners == null || changeListeners.size() < 1) {
			return false;
		}
		for (int i = 0; i < changeListeners.size(); i++) {
			changeListeners.get(i).showCandidates(options, gui);
		}
		return true;
	}

	public boolean copyFragment(URI suggestion, AbstractHandler gui) {
		if (changeListeners == null || changeListeners.size() < 1) {
			return false;
		}
		for (int i = 0; i < changeListeners.size(); i++) {
			changeListeners.get(i).copyFragment(suggestion, gui);
		}
		return true;
	}

	public boolean confirmCancelOrCopy(EModificationType type, AbstractHandler gui, CopiedFromAdapter adapter) {
		if (changeListeners == null || changeListeners.size() < 1) {
			return false;
		}
		for (int i = 0; i < changeListeners.size(); i++) {
			changeListeners.get(i).confirmCancelOrCopy(type, gui, adapter);
		}
		return true;
	}
	*/
}
