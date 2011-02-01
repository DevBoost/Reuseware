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
package org.reuseware.coconut.description.browse.views;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.part.ViewPart;
import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.FacetValueDecorator;
import org.reuseware.coconut.description.GUIState;
import org.reuseware.coconut.description.browse.BrowserStateManager;
import org.reuseware.coconut.description.browse.MainBrowserManager;
import org.reuseware.coconut.description.browse.util.DynamicDecorationManager;
import org.reuseware.coconut.description.classify.DecorationManager;
import org.reuseware.coconut.description.classify.DescriptionManager;
import org.reuseware.coconut.description.classify.views.facet.FacetView;
import org.reuseware.coconut.description.classify.views.facet.FacetViewUtil;

@SuppressWarnings("restriction")
public class FacetViewsController implements Observer, IPartListener {

	private WorkbenchPage page;

	private List<FacetView> shownViews;
	private List<Integer> freePlaceholders;

	private FacetView closedView;
	private ViewPart swapView;
	private LinkedList<FacetView> badViews;

	private static final String DEFAULT_PLACEHOLDER = "5";

	public FacetViewsController(BrowserStateManager stateManager) {
		this.page = (WorkbenchPage) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage();
		this.shownViews = new LinkedList<FacetView>();

		this.freePlaceholders = new LinkedList<Integer>();

		iniFreePlaceholders();

		showPresentedFacets();
	}

	public void unregisterListeners() {
		for (FacetView view : shownViews) {
			view.getSite().getPage().removePartListener(this);
		}
	}

	/**
	 * Either refreshes the <code>FacetView</code>'s content or delets some
	 * shown views if they show <code>FacetType</code>s which are not in the
	 * <code>BrowserState</code> any more.
	 */
	public void clean() {
		// update list of shown views
//		FacetView facetView;
//		List<FacetTypeDecorator> presented = MainBrowserManager.getInstance()
//				.getBrowserStateManager().getState().getPresentedFacets();
//		for (IViewPart iView : page.getViews()) {
//			if (!(iView instanceof FacetView))
//				continue;
//			facetView = (FacetView) iView;
//
//			// check whether facet view shows a facet stored in browser state
//			if (presented == null || !presented.contains(facetView.getContext())) {
//				swapView = facetView;
//				Runnable r = new Runnable() {
//					public void run() {
//						swapView.getSite().getPage().hideView(swapView);
//					}
//				};
//				facetView.getSite().getShell().getDisplay().asyncExec(r);
//			} else
//				shownViews.add(facetView);
//		}

		// clean all shown views
		FacetTypeDecorator context;
		for (FacetView view : shownViews) {
			context = view.getContext();
			System.out.println();
			System.out.println("clean: " + context.getDecoratee().getName());

			// check whether all valueCounts are 0
			boolean update = true;
			for (FacetValueDecorator vDecor : context.getValues()) {
				update &= vDecor.getValueCount() == 0;
				if (!update)
					break;
			}

			// update context if needed
			if (update) {
				System.out.println("sauber!");
				context = MainBrowserManager.getInstance().update(context);
			}

			// clean the view
			view.clean(context);
		}
	}

	private void iniFreePlaceholders() {
		freePlaceholders.clear();

		// default number of facet views is 6 (0-5)
		for (int i = 0; i < 6; i++)
			freePlaceholders.add(i);
	}

	public void showPresentedFacets() {
		BrowserState state = MainBrowserManager.getInstance().getBrowserStateManager().getState();
		List<FacetTypeDecorator> presentedTypes = state.getPresentedFacets();

		boolean stop;
		for (FacetTypeDecorator typeDecor : presentedTypes) {
			stop = false;
			for (FacetView view : shownViews) {
				if (view.getContext().equals(typeDecor)) {
					stop = true;
					break;
				}
			}
			if (stop)
				continue;

			showViewFor(typeDecor, false, null);
		}
	}

	public void openFacetViewFor(FacetTypeDecorator decor) {

		if (freePlaceholders.size() == 0) {
			// look for the view to be replaced
			IViewReference[] refs = page.getViewReferences();
			for (IViewReference iRef : refs) {
				swapView = (ViewPart) iRef.getView(true);

				if (swapView != null && swapView instanceof FacetView
						&& DEFAULT_PLACEHOLDER.equals(iRef.getSecondaryId())) {
					// set correct view's replacement decorator
					((FacetView) swapView).setReplaceContext(decor);

					// close this old view
					Runnable r = new Runnable() {
						public void run() {
							if (!isWorkbenchClosing())
								swapView.getSite().getPage().hideView(swapView);
							shownViews.remove(swapView);
						}
					};
					try {
						swapView.getSite().getShell().getDisplay().asyncExec(r);
					} catch (Exception e) {
						e.printStackTrace();
					}

					return;
				}
			}
		}

		/*
		 * else { // there might be a selection given for the new view swapFacet
		 * = MainBrowserManager.getInstance().getTransientFacet(); swapDecor =
		 * decor; Runnable r; if (swapFacet != null) { // open view with this
		 * selection r = new Runnable() {
		 * 
		 * @Override public void run() { showViewFor(swapDecor, true,
		 * swapFacet); } };
		 * 
		 * // remove Facet from selected facets list BrowserState state =
		 * MainBrowserManager.getInstance().getBrowserStateManager()
		 * .getState(); state.getSelectedFacets().remove(swapFacet);
		 * MainBrowserManager
		 * .getInstance().getBrowserStateManager().setState(state); } else { r =
		 * new Runnable() {
		 * 
		 * @Override public void run() { showViewFor(swapDecor, true, null); }
		 * }; } try {
		 * PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell
		 * ().getDisplay() .asyncExec(r); } catch (Exception e) {
		 * e.printStackTrace(); }
		 * 
		 * }
		 */
	}

	private boolean showViewFor(FacetTypeDecorator facetDecor, boolean activate, Facet editContext) {
		if (freePlaceholders.size() <= 0 || facetDecor == null)
			return false;

		String viewId = FacetViewUtil.getViewForType(facetDecor.getDecoratee()).VIEW_ID;
		IViewPart view = null;
		int place = freePlaceholders.get(0);

		// try open this view
		try {
			int mode = activate ? WorkbenchPage.VIEW_ACTIVATE : WorkbenchPage.VIEW_VISIBLE;
			if (page == null)
				return false;
			view = page.showView(viewId, String.valueOf(place), mode);
		} catch (PartInitException e) {
			System.err.println("Failed to show a view for: " + facetDecor.getDecoratee());
			e.printStackTrace();
			return false;
		}
		if (view != null && view instanceof FacetView) {
			// set facetView properties
			FacetView facetView = ((FacetView) view);
			facetView.browserMode = true;
			facetView.setContext(facetDecor, null);
			facetView.setZoomListener(DynamicDecorationManager.getZoomLister());

			// there might be a selection context
			if (editContext != null)
				facetView.supportEdit(editContext);
		} else
			return false;

		view.getSite().getPage().addPartListener(this);
		freePlaceholders.remove(new Integer(place));
		shownViews.add((FacetView) view);
		((FacetView) view).place = place;

		return true;
	}

	private boolean isWorkbenchClosing() {
		WorkbenchPage page = (WorkbenchPage) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage();

		if (page == null)
			return true;

		return page.getWorkbenchWindow().getWorkbench().isClosing();
	}

	// ********************************************************************************************
	// Observer of BrowserState

	public void update(Observable o, Object arg) {
		if (!MainBrowserManager.getInstance().isBrowserPerspectivActive())
			return;

		BrowserStateManager stateManager = MainBrowserManager.getInstance()
				.getBrowserStateManager();
		BrowserState state = stateManager.getState();
		List<FacetTypeDecorator> presentedFacets = new ArrayList<FacetTypeDecorator>(state
				.getPresentedFacets().size());
		presentedFacets.addAll(state.getPresentedFacets());
		badViews = new LinkedList<FacetView>();
		List<FacetTypeDecorator> shownDecors = new LinkedList<FacetTypeDecorator>();
		List<FacetView> shownViews = new ArrayList<FacetView>(this.shownViews.size());
		shownViews.addAll(this.shownViews);
		FacetTypeDecorator context = null;
		boolean contains;
		int c = 0;

		// check whether all views show a FacetType from presentedFacets list
		for (FacetView view : shownViews) {
			c++;
			System.out.println();
			System.out.println("#####");
			System.out.println(c);
			System.out.println("#####");
			System.out.println();

			context = view.getContext();

			contains = false;
			for (FacetTypeDecorator tDecor : presentedFacets) {
				if (DecorationManager.equal(tDecor, context)) {
					context = tDecor;
					contains = true;
					break;
				}
			}

			shownDecors.add(context);

			// view shows something which is not in the presented facets list
			// or it shows something another view is already showing
			if (!contains || shownDecors.indexOf(context) != shownDecors.lastIndexOf(context)) {
				badViews.add(view);
				this.shownViews.remove(view);
				String place = ((IViewReference) page.getReference(view)).getSecondaryId();
				freePlaceholders.add(Integer.valueOf(place));
			}

			else {
				// make sure view's selection is stored in presented facets list
				Facet select = null;
				List<FacetValueDecorator> selection = view.getSelection();
				boolean hasSelection = selection != null && selection.size() > 0;
				if (hasSelection) {
					List<FacetValue> values = new ArrayList<FacetValue>(selection.size());
					for (FacetValueDecorator vDecor : selection)
						values.add(vDecor.getDecoratee());

					select = DescriptionManager.buildFacet(context.getDecoratee(), values);
				}
				context.setSelection(select);

				// make sure the view's content is up-to-date
				// don't update if view is active and has a selection
				System.out.println();
				if (!state.getGuiState().equals(GUIState.UP_TO_DATE)) {
					boolean test = false;
					try {
						test = page.getActivePart().equals(view) && hasSelection;
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					if (test) {
						// do nothing
					} else {
						// recalculate context
						context = MainBrowserManager.getInstance().update(context);

						// try to refresh the view
						try {
							view.refreshContext(context, select);
						} catch (Exception e) {
							System.err.println("Disposed!");

							view.setReplaceContext(context);
							view.setReplaceSelection(select);
							MainBrowserManager.getInstance().setTransientFacet(null);
							badViews.add(view);
							this.shownViews.remove(view);
						}
					}
				}
			}
		}
		shownViews.removeAll(badViews);

		Runnable r;
		for (final FacetView facetView : badViews) {
			// this should never happen
			r = new Runnable() {
				public void run() {
					System.err.println("FAILURE: NEED TO CLEAN UP FACET VIEWS");
					page.hideView(facetView);
				}
			};
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getDisplay().asyncExec(
					r);
		}

		// present the presented facets
		showPresentedFacets();

		// change browser state's GUI state
		state.setGuiState(GUIState.UP_TO_DATE);
		stateManager.setState(state, true);

		System.out.println();
		System.out.println("*********************************************************************");
		for (FacetTypeDecorator fDecor : presentedFacets) {
			System.out.print(fDecor.getDecoratee().getName() + " = {");
			if (fDecor.getSelection() != null) {
				for (FacetValue value : fDecor.getSelection().getValues()) {
					System.out.print(value.getName() + ",");
				}
			}
			System.out.println("}");
		}
		System.out.println("*********************************************************************");
		System.out.println();
	}

	// ********************************************************************************************
	// Listener of FacetView
	public void partActivated(IWorkbenchPart part) {
	}

	public void partBroughtToTop(IWorkbenchPart part) {
	}

	public void partClosed(IWorkbenchPart part) {
		// do nothing if workbench is closing
		if (isWorkbenchClosing())
			return;

		// if this is the Fragment Browser perspective - go on
		if (MainBrowserManager.getInstance().isBrowserPerspectivActive()) {

			// make sure it's a FacetView and reacted only once
			if (part instanceof FacetView && !part.equals(closedView)) {
				FacetView facetView = (FacetView) part;
				// if (facetView.getContext() == null)
				// return;
				IViewReference ref = (IViewReference) part.getSite().getPage().getReference(
						facetView);
				int viewPlaceholder = Integer.parseInt(ref.getSecondaryId());

				// make sure the view was created in this session
				// if (usedPlaceholders.contains(new Integer(viewPlaceholder)))
				// {
				if (facetView.place == viewPlaceholder) {

					// change BrowserState
					BrowserState state = MainBrowserManager.getInstance().getBrowserStateManager()
							.getState();
					freePlaceholders.add(new Integer(viewPlaceholder));
					shownViews.remove(facetView);
					state.getPresentedFacets().remove(facetView.getContext());
					closedView = facetView;

					// open new facet view at old view's placeholder
					FacetTypeDecorator newDecor = null;
					// either take the replacement of the FacetView
					if (facetView.getReplaceContext() != null) {
						newDecor = facetView.getReplaceContext();
						state.getAdditionalFacets().remove(newDecor);
						state.getPresentedFacets().add(newDecor);
					}
					// or look into the list of additional facets
					else {
						List<FacetTypeDecorator> additionalFacets = state.getAdditionalFacets();
						if (additionalFacets.size() > 0) {
							newDecor = additionalFacets.remove(0);
							state.getPresentedFacets().add(newDecor);
						}
					}
					// there might be a selection given for the new view
					Facet selected = MainBrowserManager.getInstance().pullTransientFacet();
					if (selected == null)
						selected = facetView.getReplaceSelection();
					if (selected != null) {
						// open view with this selection
						showViewFor(newDecor, true, selected);

						// remove Facet from selected facets list
						state.getSelectedFacets().remove(selected);
					} else
						showViewFor(newDecor, true, null);

					// handle old view's state
					List<FacetValueDecorator> selection = facetView.getSelection();
					// either save old views content
					if (selection != null && selection.size() > 0) {
						System.err.println("SELECTED!");

						// build Facet to represent user's selection
						FacetType type = facetView.getContext().getDecoratee();
						List<FacetValue> values = new ArrayList<FacetValue>(selection.size());
						for (FacetValueDecorator fDecor : selection)
							values.add(fDecor.getDecoratee());
						selected = DescriptionManager.buildFacet(type, values);

						// add to list of selected facets
						state.getSelectedFacets().add(selected);
					}
					// or mark again as additional facet
					else {
						state.getAdditionalFacets().add(facetView.getContext());
					}

					// update model and GUI
					MainBrowserManager.getInstance().getBrowserStateManager().setState(state);
				}
			}
		} else {
			// the Fragment Browser perspective is closing!
			iniFreePlaceholders();
		}
	}

	public void partDeactivated(IWorkbenchPart part) {
	}

	public void partOpened(IWorkbenchPart part) {
	}
}
