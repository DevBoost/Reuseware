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
/**
 * 
 */
package org.reuseware.coconut.description.browse.views;

import org.eclipse.ui.part.ViewPart;
import org.reuseware.coconut.description.browse.MainBrowserManager;

/**
 * This class will be presented in the browser perspective to show some
 * information of the BrowserState. The update() method will be call by it's
 * controller every time this state changes.
 * 
 * @author Matthias Schmidt
 * 
 */
public abstract class AbstractBrowserView extends ViewPart {

	protected AbstractViewController controller;

	public abstract void update();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// do nothing
	}

	@Override
	public void dispose() {
		MainBrowserManager main = MainBrowserManager.getInstance();
		main.removeStateObserver(controller);
		main.resetInstance();

		controller = null;
		super.dispose();
	}

	/**
	 * Registers the view's controller as an Observer to the
	 * BrowserStateManager.
	 */
	public void register() {
		controller.addAsObserver();
	}
}
