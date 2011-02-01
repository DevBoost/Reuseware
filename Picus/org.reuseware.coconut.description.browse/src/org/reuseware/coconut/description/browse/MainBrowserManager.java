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
package org.reuseware.coconut.description.browse;

import java.util.Collections;
import java.util.List;
import java.util.Observer;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Perspective;
import org.eclipse.ui.internal.WorkbenchPage;
import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.browse.util.DynamicDecorationManager;
import org.reuseware.coconut.description.browse.views.AbstractBrowserView;
import org.reuseware.coconut.description.browse.views.BrowserPerspectiveFactory;
import org.reuseware.coconut.description.browse.views.FacetViewsController;
import org.reuseware.coconut.description.classify.DescriptionManager;
import org.reuseware.coconut.repository.ID;
import org.reuseware.coconut.repository.RepositoryFactory;
import org.reuseware.coconut.ui.eclipse.resource.WorkspaceFragmentStoreManager;

@SuppressWarnings("restriction")
public class MainBrowserManager {

	public final static int FACET_VIEW_NUMBER = 6;
	private static MainBrowserManager instance;

	private BrowserStateManager browserStateManager;
	private FacetViewsController facetViewsController;

	private IWorkbenchWindow myWindow;
	private BrowserListener listener;

	private Facet transientFacet;

	private MainBrowserManager() {
		// TODO hack to start coconut plug-in which fills the fragment store
		WorkspaceFragmentStoreManager.isFragment(null);
		browserStateManager = new BrowserStateManager();

		myWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		listener = new BrowserListener(this, true);

		myWindow.addPerspectiveListener(listener);
	}

	public static MainBrowserManager getInstance() {
		if (instance == null)
			instance = new MainBrowserManager();
		return instance;
	}

	public BrowserStateManager getBrowserStateManager() {
		return browserStateManager;
	}

	public void addStateObserver(Observer observer) {
		System.out.println();
		System.out.println("ADD");
		System.out.println(observer);
		System.out.println("vorher: " + browserStateManager.countObservers());
		browserStateManager.addObserver(observer);
		System.out.println("hinterher: " + browserStateManager.countObservers());
		System.out.println();
	}

	public void removeStateObserver(Observer observer) {
		System.out.println();
		System.out.println("REMOVE");
		System.out.println(observer);
		System.out.println("vorher: " + browserStateManager.countObservers());
		browserStateManager.deleteObserver(observer);
		System.out.println("hinterher: " + browserStateManager.countObservers());
		System.out.println();
	}

	private void makeSureAllViewsAreRegisteredAsObserver() {
		IViewReference[] refs = myWindow.getActivePage().getViewReferences();

		for (IViewReference ref : refs) {
			if (ref.getPart(true) instanceof AbstractBrowserView) {
				((AbstractBrowserView) ref.getPart(true)).register();
			}
		}
	}

	public void restart() {
		// restart the BrowserState
		browserStateManager.restart();

		// clean all facet views
		// System.out.println("CLEAN!");
		facetViewsController.clean();
	}

	public void start() {
		listener.setNewPerspective(false);
		Runnable run = new Runnable() {
			public void run() {
				// create a new controller for the FacetView
				removeStateObserver(facetViewsController);
				facetViewsController = new FacetViewsController(browserStateManager);
				addStateObserver(facetViewsController);

				// make sure all views are registered as Observer with the
				// BrowserStateManager
				makeSureAllViewsAreRegisteredAsObserver();

				// restart the BrowserState
				browserStateManager.restart();
			}
		};
		try {
			PlatformUI.getWorkbench().getDisplay().asyncExec(run);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void isNewPerspective(boolean newPersp) {
		listener.setNewPerspective(newPersp);
	}

	public boolean isBrowserPerspectivActive() {
		WorkbenchPage page = (WorkbenchPage) myWindow.getActivePage();
		Perspective persp = page.getActivePerspective();

		return persp.getDesc().getId().equals(BrowserPerspectiveFactory.PERSPECTIVE_ID);
	}

	public void openFacetViewFor(FacetTypeDecorator tDecor) {
		if (isBrowserPerspectivActive()) {
			DynamicDecorationManager.refresh(tDecor);
			facetViewsController.openFacetViewFor(tDecor);
		}
	}

	public void openFacetViewFor(Facet facet) {
		if (isBrowserPerspectivActive()) {
			// store the selection to show in next opend view
			setTransientFacet(facet);

			// calculate the right decorator
			ID typeID = RepositoryFactory.eINSTANCE.createID();
			typeID.getSegments().addAll(facet.getTypeID());
			FacetTypeDecorator tDecor = browserStateManager.getDecoratorBy(typeID);
			tDecor.setSelection(facet);

			BrowserState state = browserStateManager.getState();
			state.getSelectedFacets().remove(facet);

			EList<FragmentDescription> oldContent = new BasicEList<FragmentDescription>();
			oldContent.addAll(state.getFilteredContent());

			List<FacetValue> noValues = Collections.emptyList();
			Facet empty = DescriptionManager.buildFacet(facet.getType(), noValues);
			state = DynamicDecorationManager.getZoomLister().zoomContent(state, empty);

			DynamicDecorationManager.refresh(tDecor);

			state.getFilteredContent().clear();
			state.getFilteredContent().addAll(oldContent);

			// open new view
			facetViewsController.openFacetViewFor(tDecor);
		}
	}

	public void setTransientFacet(Facet facet) {
		this.transientFacet = facet;
	}

	public Facet pullTransientFacet() {
		Facet back = transientFacet;
		transientFacet = null;
		return back;
	}

	public void resetInstance() {
		System.out.println("****************  Kill!!!");

		// remove all listeners
		myWindow.removePerspectiveListener(listener);
		if (facetViewsController != null)
			facetViewsController.unregisterListeners();
		// browserStateManager.deleteObservers();

		// set the singleton instance to null
		instance = null;
	}

	public FacetTypeDecorator update(FacetTypeDecorator tDecor) {
		BrowserState state = browserStateManager.getState();
		return DynamicDecorationManager.getZoomLister().calcValueCounts(tDecor, state);
	}
}
