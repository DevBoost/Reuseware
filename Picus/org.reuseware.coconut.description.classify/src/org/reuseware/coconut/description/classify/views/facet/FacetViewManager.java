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
package org.reuseware.coconut.description.classify.views.facet;

import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.FastViewBar;
import org.eclipse.ui.internal.Perspective;
import org.eclipse.ui.internal.WorkbenchPage;
import org.reuseware.coconut.description.DescriptionFactory;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.ListFacet;
import org.reuseware.coconut.description.classify.DecorationManager;

@SuppressWarnings("restriction")
public class FacetViewManager {

	private IWorkbenchPartSite site;
	@SuppressWarnings("unused")
	private String currentViewID;
	private FacetView facetView;

	private FacetType swapType;
	private Facet swapFacet;
	private FragmentDescription swapContext;

	public FacetViewManager(IWorkbenchPartSite workbenchPartSite) {
		this.site = workbenchPartSite;
		this.currentViewID = "";
	}

	public void addFacet(FacetType type, FragmentDescription context) {
		swapType = type;
		swapContext = context;
		try {
			site.getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					openFastFacetView(swapType, swapContext);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editFacet(Facet facet, FragmentDescription context) {
		swapFacet = facet;
		swapContext = context;
		try {
			site.getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					FacetView view = openFastFacetView(swapFacet.getType(), swapContext);
					if (view != null)
						view.supportEdit(swapFacet);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void hideFastFacetView() {
		Runnable r = new Runnable() {
			public void run() {
				WorkbenchPage wp = (WorkbenchPage) PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				Perspective persp = wp.getActivePerspective();

				IViewReference[] fastViews = persp.getFastViews();
				for (IViewReference viewRef : fastViews) {
					if (viewRef.getView(true) instanceof FacetView)
						if (Perspective.useNewMinMax(persp))
							wp.hideView(viewRef);
				}

			}
		};
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getDisplay().asyncExec(r);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// private FacetView openFacetView(FacetType type, FragmentDescription
	// context) {
	// swapType = type;
	// swapContext = context;
	// ISafeRunnable runnable = new ISafeRunnable() {
	// @Override
	// public void handleException(Throwable exception) {
	// System.err
	// .println("Exception in plug-in: VIEW_ID");
	// exception.printStackTrace();
	// }
	//
	// @Override
	// public void run() throws Exception {
	// open2(swapType,swapContext);
	// }
	// };
	// SafeRunner.run(runnable);
	// return null;
	// }

	private FacetView openFastFacetView(FacetType type, FragmentDescription context) {
		FacetView view = FacetViewUtil.getViewForType(type);
		FacetTypeDecorator decor = DecorationManager.buildFacetTypeDecorator(type);
		if (view == null) {
			System.err.println("No FacetView found for: " + type.eClass().getName());
			return null;
		}

		String viewId = view.VIEW_ID;
		// String viewId = new FacetTreeView().VIEW_ID;

		final IWorkbenchPage activePage = site.getPage();
		// PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		WorkbenchPage wp = (WorkbenchPage) activePage;
		Perspective persp = wp.getActivePerspective();

		// If we create a fast view then use the new mechanism directly
		boolean useNewMinMax = Perspective.useNewMinMax(persp);
		if (useNewMinMax) {
			IViewReference ref = persp.getViewReference(viewId, null);
			if (ref == null)
				return null;

			persp.getFastViewManager().addViewReference(FastViewBar.FASTVIEWBAR_ID, -1, ref, true);
			wp.activate(ref.getPart(true));

			if (ref.getPart(true) instanceof FacetView) {
				facetView = (FacetView) ref.getPart(true);
				facetView.browserMode = false;
				facetView.setContext(decor, context);
				currentViewID = facetView.VIEW_ID;
				return facetView;
			}
		} else
			System.err.println("The new mechanism for fast views is not "
					+ "supported! \nsee: Perspective.useNewMinMax(persp)");
		currentViewID = "";
		return null;
	}

	public void testTheBest() {
		System.out.println("BAMM!");
//		TreeFacet treeFacet = DescriptionFactory.eINSTANCE.createTreeFacet();
		ListFacet listFacet = DescriptionFactory.eINSTANCE.createListFacet();
//		DateFacet dateFacet = DescriptionFactory.eINSTANCE.createDateFacet();

		FacetType type = listFacet;
		System.out.println("We need view for: " + type.eClass().getName());
		FacetView view = FacetViewUtil.getViewForType(type);
		if (view != null)
			open(view);
	}

	private void open(FacetView view) {
		final FacetView viewFinal = view;

		ISafeRunnable runnable = new ISafeRunnable() {
			public void handleException(Throwable exception) {
				System.err.println("Exception in plug-in: VIEW_ID");
				exception.printStackTrace();
			}

			public void run() throws Exception {
				viewFinal.print();
			}
		};
		SafeRunner.run(runnable);
	}
}
