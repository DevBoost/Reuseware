package org.reuseware.sokan.resource;

import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.StoreUtil;

/**
 * Management class for the
 * <i>org.reuseware.sokan.resource.pluginStore</i>
 * extension point.
 */
public final class PluginStoreManager {
	
	private PluginStoreManager() { }
	
	/**
	 * Extension point ID: 
	 * <i>org.reuseware.sokan.resource.pluginStore</i>.
	 */
	public static final String PLUGIN_STORE_EP_ID = 
		SokanResourcePlugin.PLUGIN_ID + ".pluginStore";
	
	/**
	 * Initializes all plugin stores by inspecting all extensions.
	 */
	public static void init() {
		if (Platform.isRunning()) {
			IExtensionPoint ep = 
	        	Platform.getExtensionRegistry().getExtensionPoint(PLUGIN_STORE_EP_ID);
	        IConfigurationElement[] entries = ep.getConfigurationElements();
	        
	        List<URI> existingURIs = new ArrayList<URI>();
	        
	        for (int i = 0; i < entries.length; i++) {
	        	String path = entries[i].getAttribute("folder");
	        	String bundleID = entries[i].getDeclaringExtension().getNamespaceIdentifier();
	        	Bundle bundle = Platform.getBundle(bundleID);
	        	
	        	String updateString = entries[i].getAttribute("update");
	        	boolean update = false;
	        	if ("true".equals(updateString) || "TRUE".equals(updateString)) {
	        		update = true;
	        	}
	        	
	        	if (path != null && bundle != null) {
	        		String storeURI = "/" + bundleID + "/" + path;
	        		while (storeURI.endsWith("/")) {
	        			storeURI = storeURI.substring(0, storeURI.length() - 1);
	        		}
	        		registerStore(URI.createPlatformPluginURI(storeURI, true));
	        		
		        	@SuppressWarnings("unchecked")
					Enumeration<URL> urlEnum = bundle.findEntries(path, null, true);	
		        	while (urlEnum.hasMoreElements()) {
		        		URL url = urlEnum.nextElement();
		        		String uriString = url.toExternalForm();
		        		if (!uriString.endsWith("/") && !uriString.contains("/.")) {
		        			uriString = uriString.substring("bundleentry://".length());
		        			uriString = uriString.substring(uriString.indexOf("/"));
		        			uriString = "/" + bundleID + uriString;
			        		URI uri = URI.createPlatformPluginURI(uriString, true);
			        		addOrUpdateArtifact(uri, update);
			        		existingURIs.add(uri);
		        		}
		        	}
	        	}
	        }
	        
	        removeOldArtifacts(existingURIs);
		}
	}
	
	private static void registerStore(URI storeURI) {
		StoreUtil.INSTANCE.addExternalStore(storeURI);
	}
	
	private static void removeOldArtifacts(List<URI> existingURIs) {
		for (IndexRow row : IndexUtil.INSTANCE.getIndex()) {
			URI rowURI = URI.createURI(row.getPhyURI());
			if (rowURI != null && rowURI.isPlatformPlugin()) {
				if (!existingURIs.contains(rowURI)) {
					IndexUtil.INSTANCE.removeArtifact(rowURI);
				}
			}
		}
		
	}

	private static void addOrUpdateArtifact(URI uri, boolean update) {
		if (!IndexUtil.INSTANCE.isArtifact(uri)) {
			IndexUtil.INSTANCE.addArtifact(uri);
		} else if (update) {
			IndexUtil.INSTANCE.updateArtifact(uri);
		}

	}

}
