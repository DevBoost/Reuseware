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
package org.reuseware.coconut.description.classify.test;

import junit.framework.TestCase;

import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.classify.DecorationManager;

public class DecorationManagerTester extends TestCase {
	private FacetTypeDecorator decor1;
	private FacetTypeDecorator decor2;

	protected void setUp() throws Exception {
		FacetType type1 = TestDataFactory.getHobbyFacet();
		decor1 = DecorationManager.buildFacetTypeDecorator(type1);

		FacetType type2 = TestDataFactory.getJobFacet();
		decor2 = DecorationManager.buildFacetTypeDecorator(type2);
	}

	public void testDecoration1() {
		checkTypeDecoration(decor1);
	}
	
	public void testDecoration2() {
		checkTypeDecoration(decor2);
	}

	private void checkTypeDecoration(FacetTypeDecorator decor) {
		assertNotNull(decor.getValues());
		assertTrue(decor.getValues().size() != 0);
		
		assertNotNull(decor.getDecoratee());
		assertTrue(decor.getDecoratee() instanceof FacetType);
		
		assertEquals(decor.getValues().size(), decor.getDecoratee().getValues().size());
		assertTrue(decor.getDecoratee().getValues().contains(decor.getValues().get(0).getDecoratee()));
	}

}
