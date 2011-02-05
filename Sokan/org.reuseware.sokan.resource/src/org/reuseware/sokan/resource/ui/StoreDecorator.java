/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.sokan.resource.ui;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.PlatformUI;
import org.reuseware.sokan.index.util.SokanConst;
import org.reuseware.sokan.index.util.StoreUtil;
import org.reuseware.sokan.resource.SokanResourcePlugin;

/**
 * Decorates store folders or projects with a special icon.
 */
public class StoreDecorator extends LabelProvider implements
		ILightweightLabelDecorator {
	private static final String ID = SokanConst.ID_STORE_DECORATOR;

	private static StoreDecorator decorator;
	private ImageDescriptor descriptor;
	private String iconPath = "icons/store.png";
	private int quadrant;

    /**
     * Calculates decorations based on element. 
     * 
     * @param element the element to decorate
     * @param decoration the decoration to set
     */
	public void decorate(Object element, IDecoration decoration) {
		IResource res = null;
		if (element instanceof IResource) {
			res = (IResource) element;
		} else if (element instanceof IAdaptable) {
			res = (IResource) ((IAdaptable) element)
					.getAdapter(IResource.class);
		}

		if (res == null) {
			return;
		}
		if (StoreUtil.INSTANCE.isStore(res)) {
			descriptor = SokanResourcePlugin.getImageDescriptor(iconPath);
			if (descriptor == null) {
				return;
			}
			quadrant = IDecoration.BOTTOM_RIGHT;
			decoration.addOverlay(descriptor, quadrant);
		}
	}

	/**
	 * Activates the store decorator in the running platform using
	 * the platform's decorator manager.
	 */
	public static void activate() {
		IDecoratorManager decoratorManager = PlatformUI.getWorkbench()
				.getDecoratorManager();

		if (!decoratorManager.getEnabled(ID)) {
			try {
				decoratorManager.setEnabled(ID, true);
			} catch (CoreException e) {
				//should not happen
			}
		}
	}

	/**
	 * Refreshes the decorator for the given container.
	 * 
	 * @param container the container (file or project)
	 */
	public static void refresh(IContainer container) {
		activate();

		final StoreDecorator storeDecorator = getDecorator();
		if (storeDecorator == null) {
			return;
		}
		// Create a label changed event
		final LabelProviderChangedEvent event = new LabelProviderChangedEvent(
				storeDecorator, container);

		// Re-Decorate using current UI thread
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				// Fire a LabelProviderChangedEvent to notify eclipse views
				// that label provider has been changed for the resources
				storeDecorator.fireLabelProviderChanged(event);
			}
		});
	}

	/**
	 * Gets the <code>StoreDecorator</code> object. This method should be called
	 * to get the <code>StoreDecorator</code> object by all methods that try to
	 * decorate resources.
	 * 
	 * @return <code>StoreDecorator</code> instance if the
	 *         <code>StoreDecorator</code> is enabled, else null.
	 */
	private static StoreDecorator getDecorator() {
		if (decorator != null) {
			return decorator;
		}
		IDecoratorManager decoratorManager = SokanResourcePlugin.getDefault()
				.getWorkbench().getDecoratorManager();

		// If the decorator is disabled, a null value is returned
		decorator = (StoreDecorator) decoratorManager.getBaseLabelProvider(ID);
		return decorator;
	}
}
