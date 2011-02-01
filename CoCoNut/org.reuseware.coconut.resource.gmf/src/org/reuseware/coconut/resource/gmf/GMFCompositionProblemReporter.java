package org.reuseware.coconut.resource.gmf;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.PlatformUI;
import org.reuseware.coconut.compositionprogram.resource.CompositionProblemReporter;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.ReuseResources;

/**
 * Problem reporter that can annotate GMF diagrams with markers
 * that are shown on visual elements in the diagrams.
 */
public class GMFCompositionProblemReporter implements
		CompositionProblemReporter {

	private EObject findNotationFor(EObject problemSource) {
		Resource resource = problemSource.eResource();
		if (resource == null || !resource.getURI().isPlatformResource()) {
			return null;
		}
		
		ResourceSet resourceSet = resource.getResourceSet();
		if (resourceSet != null) {
			Fragment fragment = ReuseResources.INSTANCE.getFragment(ReuseResources.INSTANCE.getID(resource.getURI()), 
					resourceSet);
			
			if (fragment != null) {
				// make sure fragment.contents is resolved
				EcoreUtil.resolveAll(fragment);

				for (EObject diagramRoot : fragment.getDiagrams()) {
					if (diagramRoot instanceof Diagram) {
						Iterator<EObject> i = diagramRoot.eResource().getAllContents();
						while (i.hasNext()) {
							EObject next = i.next();
							for (EObject crossRef : next.eCrossReferences()) {
								if (problemSource.equals(crossRef)) {
									return next;
								}
							}
						}
					}
				}
			}
		}		
		return null;
	}
	
	/**
	 * Returns the GMF diagram file that is associated
	 * with the model containing the problem's source element.
	 * 
	 * @param problemSource the EObject causing the problem
	 * 
	 * @return file with GMF diagram
	 */
	public IFile getFile(EObject problemSource) {
		EObject notation = findNotationFor(problemSource);
		if (notation == null) {
			return null;
		}
		IFile file = WorkspaceSynchronizer.getFile(notation.eResource());
		return file;
	}
	
	/**
	 * GMF generates an individual marker type for each editor.
	 * This method computes this marker type based on the class 
	 * name of the GMF editor for the given type of model.
	 * 
	 * @param problemSource the EObject causing the problem
	 * 
	 * @return individual GMF marker type
	 */
	public String getMarkerType(EObject problemSource) {
		EObject notation = findNotationFor(problemSource);
		Resource resource = notation.eResource();
		IEditorDescriptor gmfEditorDescriptor = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(
				resource.getURI().lastSegment());
		if (gmfEditorDescriptor == null) {
			return null;
		}
		
		// this guesses the marker ID based on the editor ID according to GMF's defaults
		String markerID = gmfEditorDescriptor.getId();
		markerID = markerID.substring(0, markerID.lastIndexOf("."));
		markerID = markerID.substring(0, markerID.lastIndexOf("."));
		markerID = markerID + ".diagnostic";
		return markerID;
	}

	/**
	 * Sets the <code>elementId</code> attribute to the
	 * <code>XMLResource.getID()</code> for the notation element
	 * associated with the given problem source element. This
	 * information can be used by GMF to annotate the notation
	 * element in the diagram editor.
	 * 
	 * @param problemSource the EObject causing the problem
	 * @param attributes the attributes for the marker that can be extended by this methods
	 */
	public void getAttributes(EObject problemSource,
			Map<String, Object> attributes) {
		EObject notation = findNotationFor(problemSource);
		Resource resource = notation.eResource();
		if (resource instanceof XMLResource) {
			String elementId = ((XMLResource) resource).getID(notation);
			attributes.put("elementId", elementId);
		}
	}
}
