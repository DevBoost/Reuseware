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
package org.reuseware.coconut.fracol.resource.fracol.mopp;

import org.eclipse.core.runtime.IStatus;


/**
 * A singleton class for the text resource plugin with
 * customized error logging method.
 */
public class FracolPlugin extends org.eclipse.core.runtime.Plugin {
	
	/**
	 * The plugin id.
	 */
	public static final String PLUGIN_ID = "org.reuseware.coconut.fracol.resource.fracol";
	
	/**
	 * The version of EMFText that was used to generate this plug-in.
	 */
	public static final String EMFTEXT_SDK_VERSION = "1.3.4";
	
	/**
	 * The ID of the extension point to register default options to be used when
	 * loading resources with this plug-in.
	 */
	public static final String EP_DEFAULT_LOAD_OPTIONS_ID = PLUGIN_ID + ".default_load_options";
	
	/**
	 * ID of extension point for addition parsers.
	 */
	public static final String EP_ADDITIONAL_EXTENSION_PARSER_ID = PLUGIN_ID + ".additional_extension_parser";
	
	private static FracolPlugin plugin;
	
	/**
	 * The constructor.
	 */
	public FracolPlugin() {
		super();
	}
	
	/**
	 * Starts the plugin.
	 * 
	 * @param context the bundle context
	 * 
	 * @throws Exception if something goes wrong
	 */
	public void start(org.osgi.framework.BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}
	
	/**
	 * Stops the plugin.
	 * 
	 * @param context the bundle context
	 * 
	 * @throws Exception if something goes wrong
	 */
	public void stop(org.osgi.framework.BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	/**
	 * @return singleton plugin instance
	 */
	public static FracolPlugin getDefault() {
		return plugin;
	}
	
	/**
	 * Helper method for error logging.
	 * 
	 * @param message the error message to log
	 * @param exception the exception that describes the error in detail
	 * 
	 * @return the status object describing the error
	 */
	public static org.eclipse.core.runtime.IStatus logError(String message, Throwable exception) {
		return log(IStatus.ERROR, message, exception, false);
	}

	public static org.eclipse.core.runtime.IStatus logWarning(String message, Throwable exception) {
		return log(IStatus.WARNING, message, exception, false);
	}

	private static org.eclipse.core.runtime.IStatus log(int type, String message, Throwable exception, boolean dontLogExceptions) {
		org.eclipse.core.runtime.IStatus status;
		if (exception != null) {
			status = new org.eclipse.core.runtime.Status(type, FracolPlugin.PLUGIN_ID, 0, message, exception);
		} else {
			status = new org.eclipse.core.runtime.Status(type, FracolPlugin.PLUGIN_ID, message);
			if (dontLogExceptions) {
				//do not log; covered by validation
				return null;
			}
		}
		final FracolPlugin pluginInstance = FracolPlugin.getDefault();
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
}
