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
package org.reuseware.sokan.ui.internal.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.reuseware.sokan.Store;
import org.reuseware.sokan.index.util.StoreUtil;
import org.reuseware.sokan.resource.ui.StoreDecorator;
import org.reuseware.sokan.resource.util.BuildUtil;

/**
 * Base action for activating and deactivating folders or projects as Sokan stores.
 */
public abstract class AbstractStoreToggleAction implements IObjectActionDelegate {

	protected final StoreUtil storeUtil = StoreUtil.INSTANCE;
	protected ISelection selection;
	protected Shell shell;

	/**
     * Runs the action.
     *
     * @param action the action proxy that handles the presentation portion of the
     *   action
     */
	public void run(IAction action) {
		List<IContainer> selected = acquireSelectedContainers();

		for (IContainer container : selected) {
			Store store = null;
			boolean isNewStore = !storeUtil.isStore(container);
			if (isNewStore) {
				store = getStore(container);
			}
			boolean toggled = BuildUtil.toggleStore(container, store);
			if (toggled) {
				StoreDecorator.refresh(container);
			}
		}
	}

	protected abstract Store getStore(IContainer container);

	private List<IContainer> acquireSelectedContainers() {
		if (!(selection instanceof IStructuredSelection)) {
			return null;
		}
		@SuppressWarnings("unchecked")
		List<Object> selected = ((IStructuredSelection) selection).toList();
		List<IContainer> back = new ArrayList<IContainer>(selected.size());
		IContainer container = null;

		for (Object object : selected) {
			if (object instanceof IContainer) {
				container = (IContainer) object;
			} else if (object instanceof IAdaptable) {
				container = (IContainer) ((IAdaptable) object)
						.getAdapter(IContainer.class);
			}

			if (container != null) {
				back.add(container);
			}
		}

		return back;
	}

	/**
	 * Decides if the selection can be marked or unmarked as store and modifies
	 * text and activation status accordingly.
     *
     * @param action the action proxy that handles presentation portion of 
     * 		the action
     * @param selection the current selection, or <code>null</code> if there
     * 		is no selection.
     */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;

		List<IContainer> selectedContainer = acquireSelectedContainers();
		boolean isEnabled = true;
		int markAsStore = 13; // -1:true, +1:false, 0:both, 13:default

		for (IContainer cont : selectedContainer) {
			if (storeUtil.isStore(cont)) {
				if (markAsStore != 0) {
					if (markAsStore == -1) {
						markAsStore = 0;
					} else {
						markAsStore = 1;
					}
				}
				continue;
			} else {
				if (markAsStore != 0) {
					if (markAsStore == 1) {
						markAsStore = 0;
					} else {
						markAsStore = -1;
					}
				}
			}

			if (storeUtil.isInStore(cont) || storeUtil.isParentOfStore(cont)
					|| storeUtil.isClosedProject(cont)) {
				isEnabled = false;
				break;
			}
		}
		if (!isEnabled) {
			markAsStore = 0;
		}
		action.setEnabled(isEnabled);
		switch (markAsStore) {
		case -1:
			action.setText("Mark as Store" + getFilterName());
			break;
		case +1:
			if (supportsUnMark()) {
				action.setText("Unmark as Store");
			} else {
				action.setEnabled(false);
			}
			break;
		default:
			if (supportsUnMark()) {
				action.setText("(Un)Mark as Store");
			} else {
				action.setEnabled(false);
			}
			break;
		}
	}

	protected abstract String getFilterName();

	protected abstract boolean supportsUnMark();
	
    /**
	 * @param action
	 *            the action proxy that handles presentation portion of the
	 *            action; must not be <code>null</code>.
	 * @param targetPart
	 *            the new part target; must not be <code>null</code>.
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getWorkbenchWindow().getShell();
	}
}
