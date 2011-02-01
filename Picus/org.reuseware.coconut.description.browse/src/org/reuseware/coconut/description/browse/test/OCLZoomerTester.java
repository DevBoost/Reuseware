/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * 
 */
package org.reuseware.coconut.description.browse.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.reuseware.coconut.description.DescriptionFactory;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.browse.util.OCLZoomer;
import org.reuseware.coconut.description.classify.test.TestDataFactory;

/**
 * @author Matthias Schmidt
 * 
 */
public class OCLZoomerTester extends TestCase {
	
	private OCLZoomer zoomer = (OCLZoomer) OCLZoomer.getInstance();
//	private BrowserState state;

	private FacetType protocoll;

	private FacetValue ip;

	private Facet protocollIP;
	
	private FragmentDescription ipDevice;

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		String[] ipStr = TestDataFactory.buildValue("IP", "Hallo");
		protocoll = TestDataFactory.buildListType("Protocoll", "some description", Collections
				.singletonList(ipStr));

		ip = DescriptionFactory.eINSTANCE.createFacetValue();
		ip.setName(ipStr[0]);
		ip.setDescription(ipStr[1]);

		List<FacetValue> values = Collections.singletonList(ip);
		protocollIP = TestDataFactory.buildFacet(protocoll, values);

		List<String[]> properties = new ArrayList<String[]>(4);
		properties.add(TestDataFactory.buildValue("name", "ipDevice"));
		properties.add(TestDataFactory.buildValue("hint", "A hinty Hint."));
		ipDevice = TestDataFactory.buildDescription(properties, Collections.singletonList(protocollIP));
	}
	
	public void testSimpleQuery(){
		assertTrue(zoomer.fDescContainsFacet(ipDevice, OCLZoomer.QUERY, protocollIP));
	}
	
	
}
