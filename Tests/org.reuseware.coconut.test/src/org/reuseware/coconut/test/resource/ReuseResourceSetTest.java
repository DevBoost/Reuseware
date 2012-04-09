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
package org.reuseware.coconut.test.resource;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.reuseware.coconut.resource.resourceset.ResourceSetReuseResourceUtil;

public class ReuseResourceSetTest extends TestCase {

	@Test
	public void testReuseExtensionActivatorScope() throws Exception {
		
		List<String> UFI = new ArrayList<String>();
		List<String> rexActivatorID = new ArrayList<String>();
		
		UFI.clear();
		rexActivatorID.clear();
		UFI.add("A");
		rexActivatorID.add("A");
		UFI.add("B");
		rexActivatorID.add("B");
		UFI.add("C.fragment");
		rexActivatorID.add("X.rex_activator");
		
		assertTrue(ResourceSetReuseResourceUtil.isInScopeOf(UFI, rexActivatorID));
	
		UFI.clear();
		rexActivatorID.clear();
		UFI.add("A");
		rexActivatorID.add("A");
		UFI.add("B");
		UFI.add("C.fragment");
		rexActivatorID.add("X.rex_activator");
		
		assertTrue(ResourceSetReuseResourceUtil.isInScopeOf(UFI, rexActivatorID));
		
		UFI.clear();
		rexActivatorID.clear();
		UFI.add("A");
		rexActivatorID.add("A");
		rexActivatorID.add("B");
		UFI.add("C.fragment");
		rexActivatorID.add("X.rex_activator");
		
		assertFalse(ResourceSetReuseResourceUtil.isInScopeOf(UFI, rexActivatorID));
		
		UFI.clear();
		rexActivatorID.clear();
		UFI.add("A");
		rexActivatorID.add("A");
		UFI.add("D");
		rexActivatorID.add("B");
		UFI.add("C.fragment");
		rexActivatorID.add("X.rex_activator");
		
		assertFalse(ResourceSetReuseResourceUtil.isInScopeOf(UFI, rexActivatorID));
		
		
	}
	
	
}
