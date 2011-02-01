package org.reuseware.coconut.resource;

import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.fragment.Fragment;

/**
 * A fragment composition interface creator is able to compute
 * the composition interface of a fragment.
 */
public interface FragmentCompositionInterfaceCreator {

	/**
	 * @param ufi ID of the fragment for which to compute the composition interface
	 * @param resourceSet resource set for loading resources
	 * @return the computed composition interface
	 */
	Fragment getFragment(List<String> ufi, ResourceSet resourceSet);
}
