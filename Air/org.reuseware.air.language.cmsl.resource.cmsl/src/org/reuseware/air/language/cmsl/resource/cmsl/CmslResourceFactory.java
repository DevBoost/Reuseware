package org.reuseware.air.language.cmsl.resource.cmsl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class CmslResourceFactory implements Resource.Factory {
	
	public CmslResourceFactory() {
		super();
	}
	
	public Resource createResource(URI uri) {
		return new CmslResource(uri);
	}
}
