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
package org.reuseware.sokan.test.exampleindexer.persister;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.FacetedResponse;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.IndexTransaction;
import org.reuseware.sokan.index.persister.Persister;
import org.reuseware.sokan.index.util.ResourceUtil;

public class PrintPersister implements Persister {

	public boolean commit(IndexTransaction indexTransaction) {
		System.out.println();
		printAdds(indexTransaction.getAddArtifacts());
		printRems(indexTransaction.getRemArtifacts());

		return true;
	}

	public IndexRow queryArtifact(ID artifactID) {
		System.out.println("Query index of artifact: "
				+ ResourceUtil.idString(artifactID));
		return null;
	}

	public List<IndexRow> queryAll() {
		System.out.println("Query complete index!");
		return null;
	}

	public void shutdown() {
		System.out.println("Shutdown performed!");
	}

	private void printAdds(EList<IndexRow> addArtifacts) {
		System.out.println("** IndexRows to Add:");

		for (IndexRow indexRow : addArtifacts) {
			System.out.println(indexRow);
		}
	}

	private void printRems(EList<ID> remArtifacts) {
		System.out.println("** IDs to Remove:");

		for (ID id : remArtifacts) {
			System.out.println(id);
		}
	}

	public FacetedResponse queryAll(FacetedRequest request) {
		System.out.println("Query by FacetedRequest");
		return null;
	}

	public List<IndexRow> queryArtifacts(Collection<ID> artifactIDs) {
		for (ID id : artifactIDs) {
			queryArtifact(id);
		}
		return null;
	}

	public int getIndexSize() {
		return 0;
	}

}
