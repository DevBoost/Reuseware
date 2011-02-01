package org.reuseware.coconut.resource.sokan;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Resource factory for creating fragment resources.
 */
public class FragmentResourceFactory implements Resource.Factory {

	/**
	 * Creates a new fragment resource.
	 * 
	 * @param uri the URI of the resource
	 * @return the new resource
	 */
	public Resource createResource(URI uri) {
		return new FragmentResource(uri);
	}

}
