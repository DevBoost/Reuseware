package org.reuseware.sokan.index;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;
import org.reuseware.sokan.index.util.IndexUtil;

/**
 * The activator class that controls the SokanIndexPlugin.
 */
public class SokanIndexPlugin extends Plugin {

	/**
	 * The SokanIndexPlugin ID:
	 * <i>org.reuseware.sokan.index</i>.
	 */
	public static final String PLUGIN_ID = "org.reuseware.sokan.index";

	// The shared instance
	private static SokanIndexPlugin plugin;

	/**
	 * The constructor.
	 */
	public SokanIndexPlugin() {
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
		IndexUtil.INSTANCE.shutdownIndexServer();

		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared SokanIndexPlugin instance.
	 *
	 * @return the shared instance
	 */
	public static SokanIndexPlugin getDefault() {
		return plugin;
	}
	
	/**
	 * Logs error in global Eclipse log.
	 * 
	 * @param message the message to log
	 * @param exception the exception associated with the message (if any)
	 * @return the logged error as status object
	 */
	public static IStatus logError(String message, Throwable exception) {
		IStatus status;
		message = "[Sokan] " + message;
		if (exception != null) {
			status = new Status(IStatus.ERROR, SokanIndexPlugin.PLUGIN_ID,
					0, message, exception);
		} else {
			status = new Status(IStatus.ERROR, SokanIndexPlugin.PLUGIN_ID,
					message);
		}
		
		final SokanIndexPlugin pluginInstance = SokanIndexPlugin.getDefault();
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
