package org.reuseware.lacome.layoutlanguage.emftext;


import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.emftext.access.EMFTextAccessProxy;
import org.emftext.access.resource.IResource;
import org.reuseware.lacome.CompositionDiagramUtil;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.provider.SourceDiagramInformationProvider;

/**
 * A source information provider that extracts information from textual models
 * processed with EMFText.
 */
public class EMFTextSourceDiagramInformationProvider implements
		SourceDiagramInformationProvider {

	/**
	 * @param diagram the diagram with text layout information 
	 *        to compute information from
	 * 
	 * @return true if the contents (provided in the diagram) is hold
	 *         by a text resource generated wit EMFText.
	 */
	public boolean canProvide(DiagramDescription diagram) {
		if (!diagram.getContents().isEmpty()) {
			EObject semanticElement = getFirstSource(diagram);
			if (semanticElement == null) {
				return false;
			}
			Resource resource = semanticElement.eResource();
			if (resource == null) {
				return false;
			}
			if (((IResource) castToTextResource(resource)) != null) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Computes a model position.
	 * 
	 * @param diagram the diagram to compute information from
	 */
	public void provideBounds(DiagramDescription diagram) {
		if (!diagram.getContents().isEmpty()) {
			EObject semanticElement = getFirstSource(diagram);
			if (!(semanticElement == null)) {
				EObject container = semanticElement.eContainer();

				Object value = container.eGet(semanticElement
						.eContainmentFeature());
				if (value instanceof List) {	
					List<?> list = (List<?>) value;
					diagram.getSourceBounds().setModelPosition(
							list.indexOf(semanticElement));
				}
			}
		}
	}
	
	private EObject getFirstSource(DiagramDescription receivingDiagram) {
		if (receivingDiagram.getDiagramRoots().isEmpty()) {
			return null;
		}
		EObject copy = receivingDiagram.getDiagramRoots().get(0);
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
