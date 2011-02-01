package org.reuseware.comogen.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

/**
 * The activator class that controls the CoMoGen UI plugin.
 */
public class CoMoGenUIPlugin extends Plugin {

	/**
	 * Plugin ID:
	 * <i>org.reuseware.comogen.ui</i>.
	 */
	public static final String PLUGIN_ID = "org.reuseware.comogen.ui";

	// The shared instance
	private static CoMoGenUIPlugin plugin;
	
	/**
	 * The constructor.
	 */
	public CoMoGenUIPlugin() {
	}
	
	/**
	 * Method to log an error in the platform's error log.
	 * 
	 * @param message message describing the error
	 * @param exception the associated exception if available
	 * @return status object representing the error
	 */
	public static IStatus logError(String message, Throwable exception) {
		IStatus status;
		message = "[Reuseware] " + message;
		if (exception != null) {
			status = new Status(IStatus.ERROR, CoMoGenUIPlugin.PLUGIN_ID,
					0, message, exception);
		} else {
			status = new Status(IStatus.ERROR, CoMoGenUIPlugin.PLUGIN_ID,
					message);
		}
		
		final CoMoGenUIPlugin pluginInstance = CoMoGenUIPlugin.getDefault();
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
	 * Returns the shared CoMoGen UI plugin instance.
	 *
	 * @return the shared instance
	 */
	public static CoMoGenUIPlugin getDefault() {
		return plugin;
	}

}
