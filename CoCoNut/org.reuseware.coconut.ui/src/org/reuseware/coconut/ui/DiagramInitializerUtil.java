package org.reuseware.coconut.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Manager class for the extension points:
 * <i>org.reuseware.coconut.ui.diagramInitializer</i>.
 */
public final class DiagramInitializerUtil {
	
	private DiagramInitializerUtil() { }

	/**
	 * The extension point ID:
	 * <i>org.reuseware.coconut.ui.diagramInitializer</i>.
	 */
	public static final String DIAGRAM_INITIALIZER_EP_ID = 
		"org.reuseware.coconut.ui.diagramInitializer";

	private static List<DiagramInitializer> initializerList = null;

	/**
	 * Initialize a diagram for the given model using an appropriate
	 * diagram initializer (if available).
	 * 
	 * @param modelResource resource holding the model
	 * @return resource holding the newly created diagram
	 */
	public static Resource initializeDiagram(Resource modelResource) {
		init();
		if (modelResource == null) {
			return null;
		}
		for (DiagramInitializer initializer : initializerList) {
			if (initializer.canInitializeDiagramFor(modelResource)) {
				Resource diagramResource = initializer.initializeDiagram(modelResource);
				if (diagramResource != null && !diagramResource.getContents().isEmpty()) {
					return diagramResource;
				}
			}
		}
		return null;
	}
	
	/**
	 * Registers the given initializer.
	 * 
	 * @param initializer the initializer
	 */
	public static void addInitializer(DiagramInitializer initializer) {
		init();
		initializerList.add(initializer);
	}
	
	private static void init() {
		if (initializerList == null) {
			initializerList = new ArrayList<DiagramInitializer>();
			if (Platform.isRunning()) {
				//read extension point
		        IExtensionPoint ep = 
		        	Platform.getExtensionRegistry().getExtensionPoint(DIAGRAM_INITIALIZER_EP_ID);
		        IConfigurationElement[] entries = ep.getConfigurationElements();
		        
		        for (int i = 0; i < entries.length; i++) {
		        	try {
		        		DiagramInitializer initializer = 
							(DiagramInitializer) entries[i].createExecutableExtension("class");
		        		initializerList.add(initializer);
					} catch (CoreException e) {
						CoCoNutUIPlugin.logError("", e);
					}
		        }
			}
		}
	}
	
}
