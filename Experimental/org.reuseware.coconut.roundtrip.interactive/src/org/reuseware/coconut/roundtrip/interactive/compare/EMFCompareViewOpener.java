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
package org.reuseware.coconut.roundtrip.interactive.compare;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.compare.CompareUI;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.metamodel.ComparisonResourceSnapshot;
import org.eclipse.emf.compare.diff.metamodel.DiffFactory;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.ui.editor.ModelCompareEditorInput;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.repository.PackageableElement;
import org.reuseware.coconut.repository.resource.ReuseResources;
import org.reuseware.coconut.repository.util.IDUtil;

/**
 * EMFCompareViewOpener compares to Ecore-based models an opens a view
 * visualizing the differences.
 * 
 * @author Roland Samlaus
 */
public class EMFCompareViewOpener implements Runnable {

	private Thread runner;
	private EObject model1;
	private EObject model2;
	private URI cUFI1;
	private URI cUFI2;

	public EMFCompareViewOpener() {
		runner = new Thread(this, "CompareThread"); // Create a new thread.
		runner.start();
	}

	/**
	 * Sets the UFIs for the duplicated models that will be compared.
	 * 
	 * @param model1uri
	 *            The original model UFI of model 1.
	 */
	private void getCompareUFI(URI model1uri) {
		// String pre = model1uri.substring(0, model1uri.lastIndexOf("/"));
		
		//TODO jj: I am not sure what this is for. The method s called get... but sets a global state.
		
		/*String post = model1uri.get(model1uri.size() - 1);

		cUFI1 = new BasicEList<String>();
		cUFI1.add("emfcompare");
		cUFI1.add(post);

		cUFI2 = new BasicEList<String>();
		cUFI2.add("emfcompare");
		cUFI2.add(post);*/
	}

	/**
	 * This method compares two Ecore models and opens a view to show the
	 * differences between them.
	 */
	public void openCompareView() {
		// saveBoth();
		MatchModel match = null;
		if (model1 != null && model2 != null) {
			try {
				match = MatchService.doMatch(model1, model2, Collections
						.<String, Object> emptyMap());
			} catch (InterruptedException e) {
				// TODO show error to users?
				e.printStackTrace();
			}
			DiffModel diff = DiffService.doDiff(match, false);
			ComparisonResourceSnapshot snapshot = 
				DiffFactory.eINSTANCE.createComparisonResourceSnapshot();
			snapshot.setDiff(diff);
			snapshot.setMatch(match);

			try {
				CompareUI.openCompareEditor(new ModelCompareEditorInput(snapshot));
			} catch (Exception e) {
				// TODO show error to users?
				e.printStackTrace();
			}
		}
	}

	public void run() {
		openCompareView();
	}

	/**
	 * Save a model so that the compare-tool can load the files.
	 * 
	 * @param newSourceUFI
	 *            UFI where to save the model.
	 * @param copied
	 *            The copied model
	 */
	protected void saveSourceFragment(URI newSourceUFI, EObject copied) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource newFile = resourceSet.createResource(newSourceUFI);

		newFile.getContents().clear();
		newFile.getContents().add(copied);

		try {
			newFile.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO show error to users?
			e.printStackTrace();
		}
	}

	/**
	 * Sets the first model to compare.
	 * 
	 * @param model1uri
	 *            The UFI of model 1
	 */
	public void setModelOne(URI model1uri) {
		Copier copier = new Copier();
		PackageableElement element = ReuseResources.INSTANCE.getElement(
				IDUtil.uriToID(model1uri));
		if (!(element instanceof Fragment)) {
			return;
		}

		Fragment fragment = (Fragment) element;
		EObject model1t = copier.copy(fragment.getContents().get(0));
		copier.copy(fragment.getDiagrams().get(0));
		copier.copyReferences();
		model1 = model1t;
		getCompareUFI(model1uri);
		saveSourceFragment(cUFI1, model1);
	}

	/**
	 * Sets the second model to compare.
	 * 
	 * @param model2uri
	 *            The UFI of model 2
	 */
	public void setModelTwo(URI model2uri) {
		Copier copier = new Copier();
		PackageableElement element = ReuseResources.INSTANCE
				.getElement(IDUtil.uriToID(model2uri));
		if (!(element instanceof Fragment)) {
			return;
		}

		Fragment fragment = (Fragment) element;
		EObject model2t = copier.copy(fragment.getContents().get(0));
		copier.copy(fragment.getDiagrams().get(0));
		copier.copyReferences();
		model2 = model2t;
		saveSourceFragment(cUFI2, model2);
	}
}
