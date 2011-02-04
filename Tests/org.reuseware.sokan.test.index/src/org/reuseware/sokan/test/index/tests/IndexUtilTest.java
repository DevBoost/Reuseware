package org.reuseware.sokan.test.index.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.FacetedResponse;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.emodeler.EModelerManager;
import org.reuseware.sokan.index.util.FacetUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.test.index.indexer.FacetColorIndexer;
import org.reuseware.sokan.test.index.indexer.FacetSizeIndexer;
import org.reuseware.sokan.test.index.indexer.FacetTypeIndexer;
import org.reuseware.sokan.test.model.FacetInstance;
import org.reuseware.sokan.test.model.ModelFactory;
import org.reuseware.sokan.test.util.TestData;
import org.reuseware.sokan.test.util.TestUtil;



public class IndexUtilTest {
	private static final IndexUtil indexUtil = IndexUtil.INSTANCE;
	private static final TestData data = TestData.INSTANCE;

	private static final String FACET_COLOR = FacetColorIndexer.FACET_NAME;
	private static final String COLOR_BROWN = FacetColorIndexer.VALUE_B;
	private static final String COLOR_DARK = FacetColorIndexer.VALUE_C;
	private static final String COLOR_ORANGE = FacetColorIndexer.VALUE_G;

	private static final String FACET_SIZE = FacetSizeIndexer.FACET_NAME;
	private static final String SIZE_SMALL = FacetSizeIndexer.VALUE_SMALL;
	private static final String SIZE_TINY = FacetSizeIndexer.VALUE_TINY;

	private static final String FACET_TYPE = FacetTypeIndexer.FACET_NAME;
	private static final String TYPE_EVEN = FacetTypeIndexer.VALUE_EVEN;

	@Test
	public void testCleanIndexRow() throws IOException {
		ID idB17 = ResourceUtil.idFrom(TestUtil.fileAsURI(data.b17));
		assertNotNull(idB17);

		// retrieve current status from index
		IndexRow rowB17 = indexUtil.getIndex(idB17);
		assertNotNull(rowB17);
		assertNotNull(rowB17.getMetaData());
		assertFalse(rowB17.getMetaData().isEmpty());
		assertNotNull(rowB17.getPhyURI());

		String time1 = rowB17.getMetaData().getSingle("time");
		assertNotNull(time1);
		
		// make a change: dirty state
		TestUtil.change(data.b17);
		
		// commit: clean state
		IndexUtil.INSTANCE.commitIndex();

		// retrieve new state
		rowB17 = indexUtil.getIndex(idB17);
		assertNotNull(rowB17);
		assertNotNull(rowB17.getMetaData());
		assertFalse(rowB17.getMetaData().isEmpty());
		assertNotNull(rowB17.getPhyURI());

		String time2 = rowB17.getMetaData().getSingle("time");
		assertNotNull(time2);
		assertFalse(time1.equals(time2)); // update worked
	}

	@Test
	public void testGetFacetedResponseNoCleanSimple() {
		// color=Brown
		// start with simple query
		List<Constraint> constraints = FacetUtil.buildConstraints(FACET_COLOR
				+ "=" + COLOR_BROWN);
		FacetedRequest req = FacetUtil.buildFacetedRequest(constraints);
		FacetedResponse rsp = indexUtil.getFacetedResponse(req);
		assertNotNull(rsp);
		assertNotNull(rsp.getContent());
		assertTrue(44 == rsp.getContent().size()); // 42?

		// color=Dark
		// query for "Dark" might fail, because of facet value "Dark orange"
		constraints = FacetUtil
				.buildConstraints(FACET_COLOR + "=" + COLOR_DARK);
		req = FacetUtil.buildFacetedRequest(constraints);
		rsp = indexUtil.getFacetedResponse(req);
		assertNotNull(rsp);
		assertNotNull(rsp.getContent());
		assertTrue(33 == rsp.getContent().size());

		// color=orange
		// query for "orange" might fail, because of facet value "Dark orange"
		constraints = FacetUtil.buildConstraints(FACET_COLOR + "="
				+ COLOR_ORANGE);
		req = FacetUtil.buildFacetedRequest(constraints);
		rsp = indexUtil.getFacetedResponse(req);
		assertNotNull(rsp);
		assertNotNull(rsp.getContent());
		assertTrue(3 == rsp.getContent().size());

		// color=Brown,Dark
		// simple double value on one field
		constraints = FacetUtil.buildConstraints(FACET_COLOR + "="
				+ COLOR_BROWN + "," + COLOR_DARK);
		req = FacetUtil.buildFacetedRequest(constraints);
		rsp = indexUtil.getFacetedResponse(req);
		assertNotNull(rsp);
		assertNotNull(rsp.getContent());
		assertTrue(77 == rsp.getContent().size()); // 73
	}

	@Test
	public void testGetFacetedResponseNoCleanComplex() {
		// color=Brown;size=small
		// simple double facet query
		List<Constraint> constraints = FacetUtil.buildConstraints(FACET_COLOR
				+ "=" + COLOR_BROWN + ";" + FACET_SIZE + "=" + SIZE_SMALL);
		FacetedRequest req = FacetUtil.buildFacetedRequest(constraints);
		FacetedResponse rsp = indexUtil.getFacetedResponse(req);
		assertNotNull(rsp);
		assertNotNull(rsp.getContent());
		assertTrue(rsp.getContent().size() == 18);

		// color=Brown,Dark;size=small,tiny
		// two facets with two values each
		constraints = FacetUtil.buildConstraints(FACET_COLOR + "="
				+ COLOR_BROWN + "," + COLOR_DARK + ";" + FACET_SIZE + "="
				+ SIZE_SMALL + "," + SIZE_TINY);
		req = FacetUtil.buildFacetedRequest(constraints);
		rsp = indexUtil.getFacetedResponse(req);
		assertNotNull(rsp);
		assertNotNull(rsp.getContent());
		assertTrue(rsp.getContent().size() == 46);

		// color=Brown,Dark;size=small,tiny;type=even
		// complex query with three facets
		constraints = FacetUtil.buildConstraints(FACET_COLOR + "="
				+ COLOR_BROWN + "," + COLOR_DARK + ";" + FACET_SIZE + "="
				+ SIZE_SMALL + "," + SIZE_TINY + ";" + FACET_TYPE + "="
				+ TYPE_EVEN);
		req = FacetUtil.buildFacetedRequest(constraints);
		rsp = indexUtil.getFacetedResponse(req);
		assertNotNull(rsp);
		assertNotNull(rsp.getContent());
		assertTrue(rsp.getContent().size() == 4);
	}

	/**
	 * Test method for {@link EModelerManager#createModel(EClass, ID)}.
	 * @throws IOException 
	 */
	@Test
	public void testGetEModel() throws IOException {
		ID artifactID = ResourceUtil.idFrom(TestUtil.fileAsURI(data.b17));
		EClass eClass = ModelFactory.eINSTANCE.createFacetInstance().eClass();
		List<EObject> eObjs = indexUtil.getEModel(artifactID, eClass, new ResourceSetImpl());

		assertNotNull(eObjs);
		assertTrue(eObjs.size() == 4);
		for (EObject eObject : eObjs)
			assertTrue(eObject instanceof FacetInstance);
	}
}
