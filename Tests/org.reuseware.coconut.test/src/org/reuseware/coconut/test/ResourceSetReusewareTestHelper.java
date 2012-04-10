/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.test;

import java.io.File;
import java.io.IOException;
import java.util.Map;

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
	protected void initReuseResources(Map<?,?> loadOptions) throws IOException {
		reuseResourceSet = new ReuseResourceSet();
		reuseResourceSet.getLoadOptions().putAll(loadOptions);	
		
		access = new ResourceSetReuseResourceAccess(reuseResourceSet,
						URI.createFileURI(new File(AbstractReusewareCompositionTestCase.TEMP_STORE_URI).getCanonicalPath()));
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
