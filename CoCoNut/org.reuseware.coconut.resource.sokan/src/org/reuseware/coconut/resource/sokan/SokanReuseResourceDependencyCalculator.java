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
package org.reuseware.coconut.resource.sokan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.reuseware.coconut.resource.ReuseResourceDependencyCalculator;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.solr.SolrConst;
import org.reuseware.sokan.index.util.FacetUtil;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.index.util.SokanConst;

/**
 * A dependency calculator implementation that uses
 * the information stored in the Sokan index by
 * the ReuseResourceDependencyIndexer to calculate 
 * dependencies.
 */
public class SokanReuseResourceDependencyCalculator implements
		ReuseResourceDependencyCalculator {

	/**
	 * Calculates which composition interfaces need to be updated
	 * if the given Fracol has changed.
	 * 
	 * @param fracolID ID of the Fracol that has been changed
	 * @return the composition interfaces to update
	 */
	public List<List<String>> getInfluencedCompositionInterfaceIDsFracol(
			List<String> fracolID) {
		IndexRow fracolRow = IndexUtil.INSTANCE.getIndex(
				ResourceUtil.idFrom(fracolID));
		if (fracolRow == null) {
			return Collections.emptyList();
		}
		
		List<List<String>> result = new ArrayList<List<String>>();
		
		FacetedRequest rexcmRequest = FacetUtil.buildFacetedRequest(
				FacetUtil.buildConstraints(
						IndexConstants.COLUMN_CM_IMPLEMENTED_FRAGMENT_COLLABORATION, 
						ResourceUtil.idString(fracolID)));

		for (IndexRow rexcmRow : IndexUtil.INSTANCE.getIndex(rexcmRequest)) {
			List<String> rexcmID = rexcmRow.getArtifactID().getSegments();
			result.addAll(getInfluencedCompositionInterfaceIDsRexCM(rexcmID));
		}
		
		return result;
	}
	
	/**
	 * Calculates which composition interfaces need to be updated
	 * if the given component model specification (REXcm) has changed.
	 * 
	 * @param rexcmID ID of the REXcm that has been changed
	 * @return the composition interfaces to update
	 */
	public List<List<String>> getInfluencedCompositionInterfaceIDsRexCM(
			List<String> rexcmID) {
		IndexRow rexCMRow = IndexUtil.INSTANCE.getIndex(
				ResourceUtil.idFrom(rexcmID));
		if (rexCMRow == null) {
			return Collections.emptyList();
		}
		
		List<List<String>> result = new ArrayList<List<String>>();
		
		FacetedRequest rexActivatorRequest = FacetUtil.buildFacetedRequest(
			FacetUtil.buildConstraints(
					IndexConstants.COLUMN_CM_ACTIVATED_REUSE_EXTENSION, 
					ResourceUtil.idString(rexcmID)));

		for (IndexRow rexActivatorRow : IndexUtil.INSTANCE.getIndex(rexActivatorRequest)) {
			List<String> rootEClassList = rexCMRow.getMetaData().getMulti(
					IndexConstants.COLUMN_CM_EXTENDED_ROOT_ECLASS);
			if (rootEClassList.isEmpty()) {
				return Collections.emptyList();
			}
			List<String> rexActivatorID = rexActivatorRow.getArtifactID().getSegments();
			
			String scopeQuery = ResourceUtil.idString(rexActivatorID.subList(
					0, rexActivatorID.size() - 1)) + SokanConst.SEPERATOR + "*";
			
			List<Constraint> constraints = new ArrayList<Constraint>();
			constraints.addAll(FacetUtil.buildConstraints(
					IndexConstants.COLUMN_ROOT_ECLASS,
					rootEClassList));		
			constraints.addAll(FacetUtil.buildConstraints(
					SolrConst.SYS_FIELD_ID,
					scopeQuery));
			
			FacetedRequest request = FacetUtil.buildFacetedRequest(constraints);
			List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
			
			for (IndexRow row : response) {
				result.add(row.getArtifactID().getSegments());
			}
		}
		return result;
	}

	/**
	 * Calculates which composition interfaces need to be updated
	 * if the given reuse extension activator has changed.
	 * 
	 * @param rexActivatorID ID of the reuse extension activator that has been changed
	 * @return the composition interfaces to update
	 */
	public List<List<String>> getInfluencedCompositionInterfaceIDsRexActivator(
			List<String> rexActivatorID) {
		IndexRow rexActivatorRow = IndexUtil.INSTANCE.getIndex(
				ResourceUtil.idFrom(rexActivatorID));
		if (rexActivatorRow == null) {
			return Collections.emptyList();
		}
		
		List<List<String>> result = new ArrayList<List<String>>();
		List<String> rexCMIDs = rexActivatorRow.getMetaData().getMulti(
				IndexConstants.COLUMN_CM_ACTIVATED_REUSE_EXTENSION);
		for (String rexcmID : rexCMIDs) {
			IndexRow rexCMRow = IndexUtil.INSTANCE.getIndex(
					ResourceUtil.idFrom(rexcmID));
			if (rexCMRow == null) {
				continue;
			}
			
			List<String> rootEClassList = rexCMRow.getMetaData().getMulti(
					IndexConstants.COLUMN_CM_EXTENDED_ROOT_ECLASS);
			if (rootEClassList.isEmpty()) {
				return Collections.emptyList();
			}
			
			String scopeQuery = ResourceUtil.idString(rexActivatorID.subList(
					0, rexActivatorID.size() - 1)) + SokanConst.SEPERATOR + "*";
			
			List<Constraint> constraints = new ArrayList<Constraint>();
			constraints.addAll(FacetUtil.buildConstraints(
					IndexConstants.COLUMN_ROOT_ECLASS,
					rootEClassList));		
			constraints.addAll(FacetUtil.buildConstraints(
					SolrConst.SYS_FIELD_ID,
					scopeQuery));
			
			FacetedRequest request = FacetUtil.buildFacetedRequest(constraints);
			List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
			
			for (IndexRow row : response) {
				result.add(row.getArtifactID().getSegments());
			}
		}
		return result;
	}
	
	/**
	 * Calculates which composition programs need to be re-executed
	 * if the given Fracol has changed.
	 * 
	 * @param fracolID ID of the Fracol that has been changed
	 * @return the composition program to re-execute
	 */
	public List<List<String>> getInfluencedComposingCompositionProgramIDsFracol(
			List<String> fracolID) {
		List<List<String>> result = new ArrayList<List<String>>();
		
		for (List<String> fragmentID : getInfluencedCompositionInterfaceIDsFracol(fracolID)) {
			result.addAll(getInfluencedComposingCompositionProgramIDsFragment(fragmentID));
		}
	
		return result;
	}

	/**
	 * Calculates which composition programs need to be re-executed
	 * if the given component model specification (REXcm) has changed.
	 * 
	 * @param rexcmID ID of the REXcm that has been changed
	 * @return the composition program to re-execute
	 */
	public List<List<String>> getInfluencedComposingCompositionProgramIDsRexCM(
			List<String> rexcmID) {
		List<List<String>> result = new ArrayList<List<String>>();
		
		for (List<String> fragmentID : getInfluencedCompositionInterfaceIDsRexCM(rexcmID)) {
			result.addAll(getInfluencedComposingCompositionProgramIDsFragment(fragmentID));
		}
	
		return result;
	}
	
	/**
	 * Calculates which composition programs need to be re-executed
	 * if the given reuse extension activator has changed.
	 * 
	 * @param rexActivatorID ID of the reuse extension activator that has been changed
	 * @return the composition program to re-execute
	 */
	public List<List<String>> getInfluencedComposingCompositionProgramIDsRexActivator(
			List<String> rexActivatorID) {
		List<List<String>> result = new ArrayList<List<String>>();
		
		for (List<String> fragmentID : getInfluencedCompositionInterfaceIDsRexActivator(rexActivatorID)) {
			result.addAll(getInfluencedComposingCompositionProgramIDsFragment(fragmentID));
		}
	
		return result;
	}
	
	/**
	 * Calculates which composition programs need to be re-executed
	 * if the given fragment has changed.
	 * 
	 * @param fragmentID ID of the fragment that has been changed
	 * @return the composition program to re-execute
	 */
	public List<List<String>> getInfluencedComposingCompositionProgramIDsFragment(
			List<String> fragmentID) {
		List<Constraint> constraints = FacetUtil.buildConstraints(
				IndexConstants.COLUMN_INSTANTIATED_FRAGMENT,
				ResourceUtil.idString(fragmentID));
		FacetedRequest request  = FacetUtil.buildFacetedRequest(constraints);
		List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
		
		List<List<String>> result = new ArrayList<List<String>>();
		
		for (IndexRow cpRow : response) {
			result.add(cpRow.getArtifactID().getSegments());
		}
		return result;
	}
	
	/**
	 * Calculates which derived composition programs need to be re-derived
	 * if the given Fracol has changed.
	 * 
	 * @param fracolID ID of the Fracol that has been changed
	 * @return the composition programs to re-derive
	 */
	public List<List<String>> getInfluencedDerivedCompositionProgramIDsFracol(
			List<String> fracolID) {
		IndexRow fracolRow = IndexUtil.INSTANCE.getIndex(
				ResourceUtil.idFrom(fracolID));
		if (fracolRow == null) {
			return Collections.emptyList();
		}
		
		List<List<String>> result = new ArrayList<List<String>>();
		
		FacetedRequest rexcmRequest = FacetUtil.buildFacetedRequest(
				FacetUtil.buildConstraints(
						IndexConstants.COLUMN_CL_IMPLEMENTED_FRAGMENT_COLLABORATION, 
						ResourceUtil.idString(fracolID)));

		for (IndexRow rexcmRow : IndexUtil.INSTANCE.getIndex(rexcmRequest)) {
			List<String> rexcmID = rexcmRow.getArtifactID().getSegments();
			result.addAll(getInfluencedCompositionInterfaceIDsRexCM(rexcmID));
		}
		
		return result;
	}
	
	/**
	 * Calculates which derived composition programs need to be re-derived
	 * if the given composition language specifications (REXcl) has changed.
	 * 
	 * @param rexclID ID of the REXcl that has been changed
	 * @return the composition programs to re-derive
	 */
	public List<List<String>> getInfluencedDerivedCompositionProgramIDsRexCL(
			List<String> rexclID) {
		IndexRow rexCMRow = IndexUtil.INSTANCE.getIndex(
				ResourceUtil.idFrom(rexclID));
		if (rexCMRow == null) {
			return Collections.emptyList();
		}
		
		List<List<String>> result = new ArrayList<List<String>>();
		
		FacetedRequest rexActivatorRequest = FacetUtil.buildFacetedRequest(
			FacetUtil.buildConstraints(
					IndexConstants.COLUMN_CL_ACTIVATED_REUSE_EXTENSION, 
					ResourceUtil.idString(rexclID)));

		for (IndexRow rexActivatorRow : IndexUtil.INSTANCE.getIndex(rexActivatorRequest)) {
			List<String> rootEClassList = rexCMRow.getMetaData().getMulti(
					IndexConstants.COLUMN_CL_EXTENDED_ROOT_ECLASS);
			if (rootEClassList.isEmpty()) {
				return Collections.emptyList();
			}
			List<String> rexActivatorID = rexActivatorRow.getArtifactID().getSegments();
			
			String scopeQuery = ResourceUtil.idString(rexActivatorID.subList(
					0, rexActivatorID.size() - 1)) + SokanConst.SEPERATOR + "*";
			
			List<Constraint> constraints = new ArrayList<Constraint>();
			constraints.addAll(FacetUtil.buildConstraints(
					IndexConstants.COLUMN_ROOT_ECLASS,
					rootEClassList));		
			constraints.addAll(FacetUtil.buildConstraints(
					SolrConst.SYS_FIELD_ID,
					scopeQuery));
			
			FacetedRequest request = FacetUtil.buildFacetedRequest(constraints);
			List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
			
			for (IndexRow activatorRow : response) {
				result.addAll(getInfluencedDerivedCompositionProgramIDsCompositionProgramSource(
						activatorRow.getArtifactID().getSegments()));
			}
		}
		return result;
	}
	
	/**
	 * Calculates which derived composition programs need to be re-derived
	 * if the given fragment from which the programs are derived has changed.
	 * 
	 * @param fragmentID ID of the fragment that has been changed
	 * @return the composition programs to re-derive
	 */
	public List<List<String>> getInfluencedDerivedCompositionProgramIDsCompositionProgramSource(
			List<String> fragmentID) {
		IndexRow derivedFromFragmentRow = IndexUtil.INSTANCE.getIndex(
				ResourceUtil.idFrom(fragmentID));
		if (derivedFromFragmentRow == null) {
			return Collections.emptyList();
		}
	
		List<String> derivedCPIDStringList = derivedFromFragmentRow.getMetaData().getMulti(
				IndexConstants.COLUMN_DERIVED_COMPOSITION_PROGRAM);
		
		List<List<String>> result = new ArrayList<List<String>>();
		for (String derivedCPString : derivedCPIDStringList) {
			ID ucpi = ResourceUtil.idFrom(derivedCPString);
			if (ucpi != null) {
				result.add(ucpi.getSegments());
			}
		}
		return result;
	}
	
	/**
	 * Calculates which derived composition programs need to be re-derived
	 * if the given reuse extension activator has changed.
	 * 
	 * @param rexActivatorID ID of the reuse extension activator that has been changed
	 * @return the composition programs to re-derive
	 */
	public List<List<String>> getInfluencedCompositionProgramSourceIDsRexActivator(
			List<String> rexActivatorID) {
		IndexRow rexActivatorRow = IndexUtil.INSTANCE.getIndex(
				ResourceUtil.idFrom(rexActivatorID));
		if (rexActivatorRow == null) {
			return Collections.emptyList();
		}
		
		List<List<String>> result = new ArrayList<List<String>>();
		List<String> rexCLIDs = rexActivatorRow.getMetaData().getMulti(
				IndexConstants.COLUMN_CL_ACTIVATED_REUSE_EXTENSION);
		for (String rexcmID : rexCLIDs) {
			IndexRow rexCLRow = IndexUtil.INSTANCE.getIndex(
					ResourceUtil.idFrom(rexcmID));
			if (rexCLRow == null) {
				continue;
			}
			
			List<String> rootEClassList = rexCLRow.getMetaData().getMulti(
					IndexConstants.COLUMN_CL_EXTENDED_ROOT_ECLASS);
			if (rootEClassList.isEmpty()) {
				return Collections.emptyList();
			}
			
			String scopeQuery = ResourceUtil.idString(rexActivatorID.subList(
					0, rexActivatorID.size() - 1)) + SokanConst.SEPERATOR + "*";
			
			List<Constraint> constraints = new ArrayList<Constraint>();
			constraints.addAll(FacetUtil.buildConstraints(
					IndexConstants.COLUMN_ROOT_ECLASS,
					rootEClassList));		
			constraints.addAll(FacetUtil.buildConstraints(
					SolrConst.SYS_FIELD_ID,
					scopeQuery));
			
			FacetedRequest request = FacetUtil.buildFacetedRequest(constraints);
			List<IndexRow> response = IndexUtil.INSTANCE.getIndex(request);
			
			for (IndexRow row : response) {
				result.add(row.getArtifactID().getSegments());
			}
		}
		return result;
	}
}
