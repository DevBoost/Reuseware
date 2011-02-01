package org.reuseware.sokan.ui.internal.views;

import java.util.ArrayList;
import java.util.List;

import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.reuseware.sokan.ui.SokanUIPlugin;
import org.reuseware.sokan.ui.views.BasicRepositoryView;

/**
 * An adapter factory label provider that marks images
 * with warning icon if the marked object represents
 * a file with warning/error markers.
 */
public class ErrorMarkingAdapterFactoryLabelProvider extends
		AdapterFactoryLabelProvider {
	
	/**
	 * ID of standard Eclipse marker type:
	 * <i>org.eclipse.core.resources.problemmarker</i>.
	 */
	public static final String STD_MARKER_TYPE = 
		"org.eclipse.core.resources.problemmarker";
	
	private static ImageDescriptor warningImage;
	static {
		URL url = null;
		url = SokanUIPlugin.getDefault().getBundle().getResource(
				"icons/warning.gif");
		warningImage = ImageDescriptor.createFromURL(url);
	}
	
	private BasicRepositoryView basicRepositoryView;
	
	/**
	 * Constructs a new ErrorMarkingAdapterFactoryLabelProvider.
	 * 
	 * @param view the repository view
	 * @param adapterFactory the adapter factory
	 */
	public ErrorMarkingAdapterFactoryLabelProvider(
			BasicRepositoryView view,
			ComposedAdapterFactory adapterFactory) {
		super(adapterFactory);
		this.basicRepositoryView = view;
	}
	
	/**
	 * @param object the object for which to obtain an image
	 * 
	 * @return the image (overlayed with a warning icon if appropriate)
	 */
	public Image getImage(Object object) {
		Image image = super.getImage(object);
		
		if (!(object instanceof EObject) || image == null) {
			return image;
		}
		IFile file = basicRepositoryView.getFileForElement((EObject) object);

		if (file != null) {
			IMarker[] markers;
			try {
				markers = file.findMarkers(STD_MARKER_TYPE, true, 0);
				if (markers.length > 0) {
					List<Object> images = new ArrayList<Object>(2);
					images.add(image);
					images.add(warningImage);
					return ExtendedImageRegistry.getInstance().getImage(
							new ComposedImage(images));
				}
			} catch (CoreException e) {
				//ok
			}
		}
		return image;
	}   
}
