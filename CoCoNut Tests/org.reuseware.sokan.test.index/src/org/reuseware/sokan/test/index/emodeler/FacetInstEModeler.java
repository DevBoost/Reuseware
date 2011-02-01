package org.reuseware.sokan.test.index.emodeler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.emodeler.EModeler;
import org.reuseware.sokan.test.index.indexer.FacetColorIndexer;
import org.reuseware.sokan.test.index.indexer.FacetSizeIndexer;
import org.reuseware.sokan.test.index.indexer.FacetTypeIndexer;
import org.reuseware.sokan.test.model.ModelPackage;
import org.reuseware.sokan.test.util.TestUtil;

public class FacetInstEModeler implements EModeler {
	private static final String FACET_COLOR = FacetColorIndexer.FACET_NAME;
	private static final String FACET_SIZE = FacetSizeIndexer.FACET_NAME;
	private static final String FACET_TYPE = FacetTypeIndexer.FACET_NAME;

	public List<? extends EObject> createMetaDataModel(IndexRow row, ResourceSet resourceSet) {
		
		List<EObject> list = new ArrayList<EObject>(3);
		list.add(build(FACET_COLOR, row));
		list.add(build(FACET_SIZE, row));
		list.add(build(FACET_TYPE, row));

		return list;
	}

	private EObject build(String facetName, IndexRow row) {
		return TestUtil.buildFacetInstance(facetName, row);
	}

	public boolean canModel(IndexRow row, EClass eClass) {
		return ModelPackage.Literals.FACET_INSTANCE.equals(eClass);
	}

	public boolean wasModelled(EObject element, ID id) {
		return ModelPackage.Literals.FACET_INSTANCE.isInstance(element);
	}
}
