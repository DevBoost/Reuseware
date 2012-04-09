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
/**
 * 
 */
package org.reuseware.coconut.description.browse.views;

import java.util.Observable;
import java.util.Observer;

import org.reuseware.coconut.description.browse.BrowserStateManager;
import org.reuseware.coconut.description.browse.MainBrowserManager;

/**
 * This class will observe the BrowserState via the BrowserStateManager object
 * and propagate changes to this Model to it's corresponding view.
 * 
 * @author Matthias Schmidt
 */
public abstract class AbstractViewController implements Observer {

	protected AbstractBrowserView view;
	protected BrowserStateManager stateManager;

	public AbstractViewController(AbstractBrowserView abstractView) {
		this.view = abstractView;
		addAsObserver();
		
		System.out.println("created: " + this);
	}
	
	public void addAsObserver() {
		MainBrowserManager main = MainBrowserManager.getInstance();
		this.stateManager = main.getBrowserStateManager();
		main.addStateObserver(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(Observable o, Object arg) {
		view.update();
	}
}
