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
package org.reuseware.sokan.resource;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IStartup;
import org.reuseware.sokan.resource.build.ProjectCloseListener;
import org.reuseware.sokan.resource.build.ProjectOpenListener;
import org.reuseware.sokan.resource.ui.GenDecorator;

/**
 * This Class is used to active the Sokan Resource Plug-in on Eclipse start-up
 * if the {@link StoreDecorator} is not enabled. Activating the plug-in is
 * necessary because the {@link StoreToggleAction} and {@link QueryAction} need
 * to change their label from time to time.
 */
public class StartUp implements IStartup {

	/**
	 * @see IStartup#earlyStartup()
	 */
	public void earlyStartup() {
		PluginStoreManager.init();
		GenDecorator.activate();
		registerProjectStateListeners();
	}
	
	private void registerProjectStateListeners() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
				new ProjectCloseListener(), 
				IResourceChangeEvent.PRE_CLOSE | IResourceChangeEvent.PRE_DELETE);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
				new ProjectOpenListener(), 
				IResourceChangeEvent.POST_CHANGE);
	}


}
