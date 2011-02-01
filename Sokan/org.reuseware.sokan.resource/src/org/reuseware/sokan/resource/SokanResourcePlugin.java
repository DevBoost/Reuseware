package org.reuseware.sokan.resource;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * Activator class of the Sokan resource management plugin.
 */
public class SokanResourcePlugin extends AbstractUIPlugin {

	/**
	 * The Sokan resource management plugin ID.
	 */
	public static final String PLUGIN_ID = "org.reuseware.sokan.resource";

	// The shared instance
	private static SokanResourcePlugin plugin;

	/**
	 * The Sokan resource plugin activator constructor.
	 */
	public SokanResourcePlugin() { }

	/**
	 * @param context the bundle context for this plug-in
	 * @exception Exception if this plug-in did not start up properly
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * @param context the bundle context for this plug-in
	 * @exception Exception if this plug-in did not stop properly
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * @return the shared plugin instance
	 */
	public static SokanResourcePlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path.
	 * 
	 * @param path the path to the image
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
