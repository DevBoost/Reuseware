package org.reuseware.sokan.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the SokanUIPlugin.
 */
public class SokanUIPlugin extends AbstractUIPlugin {

	/**
	 * The SokanUIPlugin ID:
	 * <i>org.reuseware.sokan.ui</i>.
	 */
	public static final String PLUGIN_ID = "org.reuseware.sokan.ui";

	// The shared instance
	private static SokanUIPlugin plugin;
	
	/**
	 * The constructor of SokanUIPlugin.
	 */
	public SokanUIPlugin() { }

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
	 * Returns the shared SokanUIPlugin instance.
	 *
	 * @return the shared instance
	 */
	public static SokanUIPlugin getDefault() {
		return plugin;
	}

}
