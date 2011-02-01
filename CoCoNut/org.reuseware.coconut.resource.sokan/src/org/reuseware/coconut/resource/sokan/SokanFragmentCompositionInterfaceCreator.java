package org.reuseware.coconut.resource.sokan;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.FragmentCompositionInterfaceCreator;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * A fragment composition interface creator that loads
 * the cached interface from the index. The interfaces 
 * are initially created an and cached by the 
 * FragmentCompositionInterfaceGenerator indexer.
 */
public class SokanFragmentCompositionInterfaceCreator implements
		FragmentCompositionInterfaceCreator {

	/**
	 * @param ufi ID of the fragment for which to compute the composition interface
	 * @param resourceSet resource set for loading resources
	 * @return the computed composition interface
	 */
	public Fragment getFragment(List<String> ufi, ResourceSet resourceSet) {
		String idString = ResourceUtil.idString(ufi);
		if (idString == null || "".equals(idString) || "/".equals(idString)) {
			return null;
		}
		
		URI compositionInterfaceURI = 
			URI.createURI("reuseware:" + idString);
		
		Resource resource = resourceSet.getResource(compositionInterfaceURI, true);
		
		if (resource != null && !resource.getContents().isEmpty()
				 && resource.getContents().get(0) instanceof Fragment) {
			return (Fragment) resource.getContents().get(0);
		}
		return null;
	}
}
