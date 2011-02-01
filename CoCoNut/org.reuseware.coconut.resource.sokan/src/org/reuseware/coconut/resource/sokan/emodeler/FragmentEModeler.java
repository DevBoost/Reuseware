package org.reuseware.coconut.resource.sokan.emodeler;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.fragment.FragmentPackage;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.emodeler.EModeler;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * This EModeler presents a model through its
 * composition interface. For this it loads the
 * composition interface (Fragment) model which
 * is cached in the index.
 */
public class FragmentEModeler implements EModeler {

	/**
	 * Loads the composition interface from the given row using a
	 * FragmentResource (registered for the 'reuseware:' protocol).
	 * 
	 * @param row
	 *            data stored in the index that is the base for the creation of
	 *            the model object
	 * @param resourceSet
     *            the resource set to use when loading models
     *            
	 * @return list of loaded root <code>EObject</code>s
	 */
	public List<? extends EObject> createMetaDataModel(IndexRow row, ResourceSet resourceSet) {
		List<String> ufi = row.getArtifactID().getSegments();

		URI compositionInterfaceURI = 
			URI.createURI("reuseware:" + ResourceUtil.idString(ufi));
		
		Resource resource = resourceSet.getResource(compositionInterfaceURI, false);
		if (resource != null) {
			resource.unload();
		}
		resource = resourceSet.getResource(compositionInterfaceURI, true);
		
		if (resource != null && !resource.getContents().isEmpty()
				&& resource.getContents().get(0) instanceof Fragment) {
			return Collections.singletonList(resource.getContents().get(0));
		}		
		return Collections.emptyList();
	}

	/**
	 * @param row the row from which to create the model
	 * @param eClass the type of the model to create
	 * 
	 * @return true if eClass is <code>Fragment</code> and if
	 *              the row does not represent a meta artifact
	 *              (fracol or rex) or a diagram.
	 */
	public boolean canModel(IndexRow row, EClass eClass) {
		if (eClass == null) {
			return false;
		}
		if (eClass != FragmentPackage.Literals.FRAGMENT
				&& !eClass.getEAllSuperTypes().contains(FragmentPackage.Literals.FRAGMENT)) {
			return false;
		}
		return !SokanReuseResourceUtil.isMetaArtifact(row)
				&& !SokanReuseResourceUtil.isRexActivator(row)
				&& !SokanReuseResourceUtil.isDiagram(row);
	}

	/**
	 * @param element the root element of the model
	 * @param id the id of the row from which the model might have been created
	 * 
	 * @return true if element is a <code>Fragment</code> 
	 *              and if the fragment's UFI corresponds to the ID
	 */
	public boolean wasModelled(EObject element, ID id) {
		if (element instanceof Fragment) {
			return id.getSegments().equals(
					((Fragment) element).getUFI());
		}
		return false;
	}

}
