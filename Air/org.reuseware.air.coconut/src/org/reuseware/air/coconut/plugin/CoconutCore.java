package org.reuseware.air.coconut.plugin;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class CoconutCore extends Plugin {

	public static final String PLUGIN_ID = "org.reuseware.air.coconut";
	private static CoconutCore plugin;
	
	public CoconutCore() {	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static CoconutCore getDefault() {
		return plugin;
	}
	
	public static IStatus createStatus(String message, Throwable e){
		return new Status(IStatus.ERROR, PLUGIN_ID, IStatus.OK, message, e);
	}
	
	public static IStatus createStatusWithStackTrace(String message, Throwable e){
		MultiStatus multi = new MultiStatus(PLUGIN_ID, Status.OK, message, e);
		for(int i=0;i<e.getStackTrace().length;i++){
			multi.add(createStatus(e.getStackTrace()[i].toString(), null));
		}
		return multi;
	}
	
	public static MultiStatus createEmptyMultiStatus(String message,Throwable e){
		return  new MultiStatus(PLUGIN_ID, Status.OK, message, e);
	
	}
	

}
