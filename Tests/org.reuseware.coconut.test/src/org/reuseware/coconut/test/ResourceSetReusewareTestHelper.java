package org.reuseware.coconut.test;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.resourceset.ResourceSetFragmentCompositionInterfaceCreator;
import org.reuseware.coconut.resource.resourceset.ResourceSetReuseResourceAccess;
import org.reuseware.coconut.resource.resourceset.ResourceSetReuseResourceDependencyCalculator;
import org.reuseware.coconut.resource.resourceset.ReuseResourceSet;

public class ResourceSetReusewareTestHelper extends AbstractReusewareTestHelper {

	private ResourceSetReuseResourceAccess access = null;
	private ReuseResourceSet reuseResourceSet = null;
	
	@Override
	protected void initReuseResources() throws IOException {
		reuseResourceSet = new ReuseResourceSet();
		reuseResourceSet.getLoadOptions().putAll(AbstractReusewareCompositionTest.getLoadOption());	
		
		access = new ResourceSetReuseResourceAccess(reuseResourceSet,
						URI.createFileURI(new File(AbstractReusewareCompositionTest.TEMP_STORE_URI).getCanonicalPath()));
		ResourceSetReuseResourceDependencyCalculator dependencyCalculator = 
			new ResourceSetReuseResourceDependencyCalculator(reuseResourceSet);
		ResourceSetFragmentCompositionInterfaceCreator ciCreator =
			new ResourceSetFragmentCompositionInterfaceCreator(reuseResourceSet);
		
		ReuseResources.INSTANCE.init(access, dependencyCalculator, ciCreator);
	}
	
	protected void registerStore(URI storeFolderURI) {
		access.addStore(storeFolderURI);
	}
		
	protected boolean registerArtifact(URI uri) {
		return reuseResourceSet.getResource(uri, true) != null;
	}

	@Override
	protected void update() {
		//handled by resource set
	}

}
