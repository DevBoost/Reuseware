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
package org.reuseware.coconut.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class of the CoCoNutUIPlugin.
 */
public class CoCoNutUIPlugin extends AbstractUIPlugin {

	/**
	 * The CoCoNutUIPlugin ID:
	 * <i>org.reuseware.coconut.ui</i>.
	 */
	public static final String PLUGIN_ID = "org.reuseware.coconut.ui";

	// The shared instance
	private static CoCoNutUIPlugin plugin;
	
	/***
	 * The constructor.
	 */
	public CoCoNutUIPlugin() {
	}

	/**
	 * Log an error in the Platform's error log or to the console if the
	 * Platform is not running. Messages are prepended with [Reuseware].
	 * 
	 * @param message the message to lock
	 * @param exception an associated exception, if available
	 * @return the logged error as status object
	 */
	public static IStatus logError(String message, Throwable exception) {
		IStatus status;
		message = "[Reuseware] " + message;
		if (exception != null) {
			status = new Status(IStatus.ERROR, CoCoNutUIPlugin.PLUGIN_ID,
					0, message, exception);
		} else {
			status = new Status(IStatus.ERROR, CoCoNutUIPlugin.PLUGIN_ID,
					message);
		}
		
		final CoCoNutUIPlugin pluginInstance = CoCoNutUIPlugin.getDefault();
		if (pluginInstance == null) {
			System.err.println(message);
			if (exception != null) {
				exception.printStackTrace();
			}
		} else {
			pluginInstance.getLog().log(status);
		}
		return status;
	}
	
	/**
	 * @param context The execution context of the bundle being started.
	 * 
	 * @throws Exception if something went wrong starting the plugin
	 * 
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * @param context The execution context of the bundle being started.
	 *
	 * @throws Exception if something went wrong stopping the plugin
	 * 
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared CoCoNut UI plugin instance.
	 *
	 * @return the shared instance
	 */
	public static CoCoNutUIPlugin getDefault() {
		return plugin;
	}

}
