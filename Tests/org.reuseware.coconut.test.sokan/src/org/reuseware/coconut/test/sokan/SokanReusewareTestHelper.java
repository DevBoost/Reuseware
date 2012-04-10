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
package org.reuseware.coconut.test.sokan;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.sokan.FragmentResourceFactory;
import org.reuseware.coconut.resource.sokan.SokanFragmentCompositionInterfaceCreator;
import org.reuseware.coconut.resource.sokan.SokanReuseResourceAccess;
import org.reuseware.coconut.resource.sokan.SokanReuseResourceDependencyCalculator;
import org.reuseware.coconut.resource.sokan.emodeler.FragmentEModeler;
import org.reuseware.coconut.resource.sokan.emodeler.MetaArtifactEModeler;
import org.reuseware.coconut.resource.sokan.emodeler.RexActivatorEModeler;
import org.reuseware.coconut.resource.sokan.generators.ComposedFragmentsGenerator;
import org.reuseware.coconut.resource.sokan.generators.DerivedCompositionProgramGenerator;
import org.reuseware.coconut.resource.sokan.generators.FragmentCompositionInterfaceGenerator;
import org.reuseware.coconut.resource.sokan.indexer.CompositionProgramSourceIndexer;
import org.reuseware.coconut.resource.sokan.indexer.DiagramIndexer;
import org.reuseware.coconut.resource.sokan.indexer.ReuseResourceDependencyIndexer;
import org.reuseware.coconut.resource.sokan.indexer.RootEClassIndexer;
import org.reuseware.coconut.test.AbstractReusewareTestHelper;
import org.reuseware.sokan.index.emodeler.EModeler;
import org.reuseware.sokan.index.emodeler.EModelerManager;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.index.indexer.IndexerConfiguration;
import org.reuseware.sokan.index.persister.PersistencyManager;
import org.reuseware.sokan.index.solr.SolrPersister;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.index.util.StoreUtil;

public class SokanReusewareTestHelper extends AbstractReusewareTestHelper {

	protected URI createURI(String path) throws IOException {
		File file = new File(path);
		return URI.createFileURI(file.getCanonicalPath());
	}
	
	private void newIndexer(
			Indexer indexer, Indexer[] dependencies) {
		String id = indexer.getClass().getCanonicalName();
		List<String> depIDs = new ArrayList<String>();
		for(Indexer depIndexer : dependencies) {
			String depID = null;
			if (depIndexer == null) {
				depID = "Foo";
			}
			else {
				depID = depIndexer.getClass().getCanonicalName();
			}
			depIDs.add(depID);
		}
		IndexUtil.INSTANCE.addIndexer(
				new IndexerConfiguration(indexer, id, depIDs));
	}
	
	private void newEModeler(EModeler modeler) {
		EModelerManager.getEModelers().add(modeler);
	}
	
	
	private void pluginXMLReuseware() {
		Indexer rootEClassIndexer = new RootEClassIndexer();
		Indexer diagramIndexer = new DiagramIndexer();
		Indexer depIndexer = new ReuseResourceDependencyIndexer();
		Indexer cpSourceIndexer = new CompositionProgramSourceIndexer();
		
		Indexer ciIndexer = new FragmentCompositionInterfaceGenerator();
		Indexer derivedCPIndexer = new DerivedCompositionProgramGenerator();
		Indexer composedFragmentIndexer = new ComposedFragmentsGenerator();
		
		EModeler fragmentEModeler = new FragmentEModeler();
		EModeler rexActivatorEModeler = new RexActivatorEModeler();
		EModeler metaArtifactEModeler = new MetaArtifactEModeler();
		
		newIndexer(rootEClassIndexer, new Indexer[]{});
		newIndexer(diagramIndexer, new Indexer[]{});
		newIndexer(depIndexer, new Indexer[]{rootEClassIndexer});
		newIndexer(cpSourceIndexer, new Indexer[]{depIndexer});
		newIndexer(ciIndexer, new Indexer[]{depIndexer});
		newIndexer(derivedCPIndexer, new Indexer[]{cpSourceIndexer});
		newIndexer(composedFragmentIndexer, new Indexer[]{derivedCPIndexer});
		
		newEModeler(fragmentEModeler);
		newEModeler(rexActivatorEModeler);
		newEModeler(metaArtifactEModeler);
		
	}

	@Override
	protected void initReuseResources(Map<?, ?> options) throws IOException {
		if (IndexUtil.INSTANCE.getIndexerConfigurations().isEmpty()) {
			AbstractReusewareTestHelper.deleteDirectory(new File(".metadata"), true, true);
			
			IndexUtil.INSTANCE.setPersistencyManager(
					new PersistencyManager(new SolrPersister()));
			for (Map.Entry<?, ?> entry : options.entrySet()) {
				IndexUtil.INSTANCE.addLoadOption(entry.getKey().toString(), entry.getValue());	
			}
			pluginXMLReuseware();
		}
		
		SokanReuseResourceAccess access = 
			new SokanReuseResourceAccess();					
		SokanReuseResourceDependencyCalculator dependencyCalculator = 
			new SokanReuseResourceDependencyCalculator();
		SokanFragmentCompositionInterfaceCreator ciCreator =
			new SokanFragmentCompositionInterfaceCreator();
		
		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
				"reuseware", new FragmentResourceFactory());
		
		ReuseResources.INSTANCE.init(access, dependencyCalculator, ciCreator);
	}
	
	@Override
	protected void registerStore(URI storeFolderURI) {
		StoreUtil.INSTANCE.addExternalStore(storeFolderURI);
	}
	
	@Override
	protected boolean registerArtifact(URI uri) {
		IndexUtil.INSTANCE.addArtifact(uri);
		IndexUtil.INSTANCE.commitIndex();
		return IndexUtil.INSTANCE.getIndex(ResourceUtil.idFrom(uri)) != null;
	}
	
	@Override
	protected void update() {
		IndexUtil.INSTANCE.commitIndex();
	}

}
