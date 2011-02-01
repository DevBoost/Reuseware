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
package org.reuseware.coconut.description.classify.views.describe;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetDefinition;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.classify.DescriptionManager;
import org.reuseware.coconut.description.classify.views.facet.FacetView;
import org.reuseware.coconut.fragment.Fragment;

public class DescriptionViewListener extends EContentAdapter implements IPartListener {

	private FragmentDescriptionView view;
	private FragmentDescription fDesc;
	private FacetView fView;

	public DescriptionViewListener(FragmentDescriptionView view) {
		this.view = view;
	}

	// ****************************************************************************************************
	// EContentAdapter method

	@Override
	public void notifyChanged(Notification notification) {

		try {
			super.notifyChanged(notification);

			if (notification.getNotifier() instanceof FragmentDescription) {
				// System.out.println("refresh - fDesc1");
				fDesc = (FragmentDescription) notification.getNotifier();
				Runnable statement;

				switch (notification.getEventType()) {
				case Notification.REMOVING_ADAPTER:
					// FragmentDescription was unregistered by deleting the file
					// or changing the store folder

					// ignore derived facets
					if (notification.getNewValue() instanceof Facet) {
						Facet newFacet = (Facet) notification.getNewValue();
						if (DescriptionManager.isDerivedFacet(newFacet))
							break;
					}

					// facets will be derived next time description is opened
					DescriptionManager.setDirty(fDesc);

					statement = new Runnable() {
						public void run() {
							view.reactOnContentChange(null);
						}
					};
					view.getSite().getShell().getDisplay().asyncExec(statement);
					break;

				case Notification.ADD:
					if (!(notification.getNewValue() instanceof Facet))
						break;
					Facet newFacet = (Facet) notification.getNewValue();

					// ignore Dummys and Derived facets
					if (DescriptionManager.isDerivedFacet(newFacet))
						break;
					if (DescriptionManager.isDummyFacet(newFacet))
						break;

					// a Facet was added to the FragmentDescription
					statement = new Runnable() {
						public void run() {
							view.reactOnContentChange(fDesc, true);
						}
					};
					view.getSite().getShell().getDisplay().asyncExec(statement);
					break;

				case Notification.REMOVE:
					if (!(notification.getOldValue() instanceof Facet))
						return;
					Facet oldFacet = (Facet) notification.getOldValue();

					// ignore Dummys and Derived facets
					if (DescriptionManager.isDerivedFacet(oldFacet))
						break;
					if (DescriptionManager.isDummyFacet(oldFacet))
						break;

					// a Facet was removed from the FragmentDescription
					statement = new Runnable() {
						public void run() {
							view.reactOnContentChange(fDesc, true);
						}
					};
					view.getSite().getShell().getDisplay().asyncExec(statement);
					break;

				default:
					break;
				}
			} else if (notification.getNotifier() instanceof FacetDefinition) {
				// System.out.println("refresh - fDef1");
				view.getSite().getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						// update view
						view.reactOnFacetTypesChanged();
					}
				});

			} else if (notification.getNewValue() instanceof FragmentDescription) {
				// a description was added to the store
				fDesc = (FragmentDescription) notification.getNewValue();
				
				// facets will be derived next time description is opened
				DescriptionManager.setDirty(fDesc);
				
				// update gui
				view.getSite().getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						view.reactOnContentChange(fDesc);
					}
				});

			} else if (notification.getNewValue() instanceof FacetDefinition) {
				// a facet definition was added to the store
				view.getSite().getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						// update view
						view.reactOnFacetTypesChanged();
					}
				});
			} else {
				// react on Fragments
				if (notification.getNotifier() instanceof Fragment) {
					Fragment fragment = (Fragment) notification.getNotifier();
					System.out.println("notification: " + notification.getEventType());

					switch (notification.getEventType()) {
					case Notification.ADD:
						System.out.println("Add");
						setSubject(fragment);

						break;

					default:
						break;
					}
				}
				if (notification.getNewValue() instanceof Fragment) {
					Fragment fragment = (Fragment) notification.getNewValue();
					setSubject(fragment);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setSubject(Fragment frag) {

		// Runnable run = new Runnable() {
		// public void run() {
		boolean test = DescriptionManager.addFragmentenToDesc(frag);
		System.out.println(test);
		// }
		// };
		// view.getSite().getShell().getDisplay().asyncExec(run);
	}

	// ****************************************************************************************************
	// IPartListener methods

	public void partActivated(IWorkbenchPart part) {
		Runnable r = new Runnable() {
			public void run() {
				view.reactOnPartActivated();
			}
		};
		try {
			view.getSite().getShell().getDisplay().asyncExec(r);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void partBroughtToTop(IWorkbenchPart part) {
	}

	public void partClosed(IWorkbenchPart part) {
	}

	public void partDeactivated(IWorkbenchPart part) {
		// react on deactivation of a FacetView
		if (part instanceof FacetView) {
			fView = (FacetView) part;
			if (fView.browserMode)
				return;

			if (fView.getContext() == null)
				// the view was empty
				return;

			if (fView.getSelection() == null) {
				if (!PlatformUI.getWorkbench().isClosing()) {
					// FacetView was deactivated without selecting any values
					Runnable r = new Runnable() {
						public void run() {
							System.out.println("Please choose one or "
									+ "more facet values and click Set!");
							view.getSite().getPage().hideView(fView);
						}
					};
					try {
						view.getSite().getShell().getDisplay().asyncExec(r);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					// The Workbench was closed while the FacetView was active
					fView.setContext(null, null);
				}
			} else {
				// FacetView was deactivated and there are some new FacetValues
			}
		}
	}

	public void partOpened(IWorkbenchPart part) {

	}

}
