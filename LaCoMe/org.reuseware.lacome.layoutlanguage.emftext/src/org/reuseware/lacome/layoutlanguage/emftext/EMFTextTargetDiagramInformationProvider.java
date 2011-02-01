package org.reuseware.lacome.layoutlanguage.emftext;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.emftext.access.EMFTextAccessProxy;
import org.emftext.access.resource.IResource;
import org.reuseware.lacome.CompositionDiagramUtil;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.provider.TargetDiagramInformationProvider;

/**
 * A target information provider that extracts information from textual models
 * (which act as composition programs) processed with EMFText.
 */
public class EMFTextTargetDiagramInformationProvider implements
		TargetDiagramInformationProvider {

	/**
	 * @param diagram the diagram to compute information from
	 * 
	 * @return true if the context of the diagram can be mapped 
	 *         to a line in the textual model
	 */
	public boolean canProvide(DiagramDescription diagram) {
		EObject context = diagram.getContext();
		return getLine(context) != -1;
	}

	/**
	 * Computes X, Y, and model position based on column and line
	 * position of the context object (i.e., the element in
	 * the textual model that represents a fragment instance).
	 * 
	 * @param diagram the diagram to compute information for
	 */
	public void provideBounds(DiagramDescription diagram) {
		EObject context = diagram.getContext();
			
		int line = getLine(context);
		if (line != -1) {
			diagram.getTargetBounds().setY(findTarget(context));
			diagram.getTargetBounds().setX(getColumn(context));
			diagram.getTargetBounds().setModelPosition(findTarget(context));
		}

	}
	
	/**
	 * In order to get the target layout information, the line number of the 
	 * model element is taken from the EMFText document. This will be the y value.
	 * 
	 * @param context the context object
	 * @return line number
	 */
	private int getLine(EObject context) {
		if (!CompositionDiagramUtil.getDerivedFrom(context).isEmpty()) {
			EObject semanticElement = getFirstSource(context);
			if (semanticElement == null) {
				return -1;
			}
			Resource resource = semanticElement.eResource();
			if (resource == null) {
				return -1;
			}
			IResource textRess = castToTextResource(resource);
			if (textRess == null) {
				return -1;
			}
			int line = textRess.getLocationMap().getLine(semanticElement);
			return line;		
		}
		return -1;
	}
	
	/**
	 * In order to get the target layout information, the column number of the 
	 * model element is taken from the EMFText document. This will be the x value.
	 * 
	 * @param context the context object
	 * @return column number
	 */
	private int getColumn(EObject context) {
		if (!CompositionDiagramUtil.getDerivedFrom(context).isEmpty()) {
			EObject semanticElement = getFirstSource(context);
			if (semanticElement == null) {
				return -1;
			}
			Resource resource = semanticElement.eResource();
			if (resource == null) {
				return -1;
			}
			IResource textRess = castToTextResource(resource);
			if (textRess == null) {
				return -1;
			}
			int column = textRess.getLocationMap().getColumn(semanticElement);
			return column;		
		}	
		return -1;
	}
	
	/**
	 * Returns the index of the current element in the EMFText model.
	 * 
	 * @param context the context object
	 * @return index of the element
	 */
	private int findTarget(EObject context) {
		if (!CompositionDiagramUtil.getDerivedFrom(context).isEmpty()) {
			EObject semanticElement = getFirstSource(context);

			if ((semanticElement == null)) {	
				return -1;
			}
			
			EObject container = semanticElement.eContainer();
			if (container == null) {
				Resource resource = semanticElement.eResource();
				if (resource == null) {
					return -1;
				}
				return resource.getContents().indexOf(semanticElement);
			}
			
			Object object = container.eGet(semanticElement.eContainmentFeature());
			if (object instanceof List) {
				List<?> list = (List<?>) object;
				return list.indexOf(semanticElement);
			}
		}
		return -1;
	}

	private EObject getFirstSource(EObject context) {
		if (CompositionDiagramUtil.getDerivedFrom(context).isEmpty()) {
			return null;
		}
		EObject copy = CompositionDiagramUtil.getDerivedFrom(context).get(0);
		EObject original = CompositionDiagramUtil.getOriginal(copy);
		
		return original != null ? original : copy;
	}
	
	private IResource castToTextResource(Resource resource) {
		try {
			//check if this resource provides "getLocationMap"
			resource.getClass().getMethod("getLocationMap", new Class[]{});
		} catch (Exception e) {
			return null;
		} 
		return (IResource) EMFTextAccessProxy.get(resource, IResource.class);
	}
}
