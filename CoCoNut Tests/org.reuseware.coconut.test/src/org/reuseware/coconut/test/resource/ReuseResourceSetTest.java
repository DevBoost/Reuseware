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
