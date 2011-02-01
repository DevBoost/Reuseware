package org.reuseware.lacome.layoutlanguage.emftext;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.reuseware.lacome.CompositionDiagramUtil;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.strategy.DiagramMerger;

/**
 * A merger that adjusts text layout (white spaces , tabs, line breaks)
 * in textual models processed by EMFText.
 */
public class EMFTextMerger implements DiagramMerger {

	/**
	 * <i>Not implemented yet!</i>.
	 * 
	 * @param receivingDiagram the diagram to be extended
	 * 
	 * @return false 
	 */
	public boolean canMerge(DiagramDescription receivingDiagram) {
		// TODO #1474: Implement
		return false;
	}

	/**
	 * <i>Not implemented yet!</i>.
	 * 
	 * @param contributingDiagrams the diagram holding the text layout information 
	 *                             of the contributing fragment
	 * @param receivingDiagram     the diagram holding the text layout information 
	 *                             of the receiving fragment 
	 * @param additionalDiagrams   other diagrams holding text layout information 
	 *                             that are processed in another composition
	 *                             step of the same composition program execution
	 */
	public void merge(List<DiagramDescription> contributingDiagrams,
			DiagramDescription receivingDiagram, List<DiagramDescription> additionalDiagrams) {	
		
		//now, they are sorted again according to the layout information
		for (DiagramDescription sourceDiagram : contributingDiagrams) {
			for (EObject sRootElement : sourceDiagram.getDiagramRoots()) {
				for (EObject tRootElement : receivingDiagram.getContents()) {
					mergeEMFText(sRootElement, tRootElement,
							sourceDiagram.getTargetBounds().getModelPosition());
				}
			}
		}
	}
	
	/**
	 * This implementation does nothing.
	 * 
	 * @param element the element that was target of a cleanup
	 * @param feature the feature modified during cleanup
	 * @param removedValue the old value of the feature before cleanup
	 * @return false
	 */
	public boolean cleanup(EObject element, EStructuralFeature feature,
			EObject removedValue) {
		// do nothing
		return false;
	}

	/**
	 * This method checks whether there is an equivalent element in the receiving
	 * model for an element of the source model. They are equal if they have the same
	 * original. If that is the case, the layout information of this element is applied.
	 * @param sRootElement root element of the contributing model
	 * @param tRootElement root element of the receiving model
	 * @param modelPosition layout information. The y value of the target bounds.
	 */
	private void mergeEMFText(EObject sRootElement, EObject tRootElement,
			int modelPosition) {
		TreeIterator<EObject> iterate = EcoreUtil.getAllContents(Collections
				.singletonList(sRootElement));
		while (iterate.hasNext()) {
			EObject sourceNext = iterate.next();
			TreeIterator<EObject> targetit = tRootElement.eAllContents();
			while (targetit.hasNext()) {
				EObject tnext = targetit.next();
				Setting sourceSetting = CompositionDiagramUtil
						.getRemovedFromSetting(tnext);
				if (sourceSetting != null) {
					if (sourceNext.equals(sourceSetting.getEObject())) {
						EReference tnextRef = tnext.eContainmentFeature();
						if (tnextRef.isMany()) {
							@SuppressWarnings("unchecked")
							EList<EObject> containerlist = (EList<EObject>) tnext
									.eContainer().eGet(tnextRef);
							containerlist.move(modelPosition, tnext);
							iterate.prune();
							break;
						}
					}
				}
			}
		}
	}
	
	/*
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
	*/
}
