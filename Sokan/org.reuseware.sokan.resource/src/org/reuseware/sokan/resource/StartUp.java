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
