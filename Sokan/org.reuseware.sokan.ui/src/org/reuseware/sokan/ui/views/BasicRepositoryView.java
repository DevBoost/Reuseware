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
package org.reuseware.sokan.ui.views;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.notify.IndexListener;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.ui.SokanUIPlugin;
import org.reuseware.sokan.ui.internal.actions.FiltersAction;
import org.reuseware.sokan.ui.internal.actions.NewAction;
import org.reuseware.sokan.ui.internal.actions.OpenAction;
import org.reuseware.sokan.ui.internal.filters.ArtifactFilter;
import org.reuseware.sokan.ui.internal.views.BasicRepositoryIndexListener;
import org.reuseware.sokan.ui.internal.views.BasicRepositoryTreeViewer;
import org.reuseware.sokan.ui.internal.views.ErrorMarkingAdapterFactoryLabelProvider;
import org.reuseware.sokan.ui.internal.views.LocalSelectionTransferViewerDragAdapter;
import org.reuseware.sokan.ui.model.sokanui.Artifact;
import org.reuseware.sokan.ui.model.sokanui.Container;
import org.reuseware.sokan.ui.model.sokanui.Root;
import org.reuseware.sokan.ui.model.sokanui.SokanuiFactory;
import org.reuseware.sokan.ui.model.sokanui.util.SokanuiUtil;

/**
 * A view on the complete Sokan repository. The view is extendible to 
 * more specialized views on the repository.
 */
public class BasicRepositoryView extends ViewPart implements
		IPropertyChangeListener, ISelectionChangedListener {

	/**
	 * Constant representing that the artifacts are currently structured in packages.
	 */
	public static final int MODE_PACKAGE = 0;
	
	/**
	 * Constant representing that the artifacts are currently structured in folders.
	 */
	public static final int MODE_FOLDER = 1;

	/**
	 * This view's ID.
	 */
	public static final String ID = "org.reuseware.sokan.ui.eclipse.BasicRepositoryView";
	
	private IPreferenceStore preferenceStore;
	private int mode = MODE_PACKAGE;

	// viewer and adapters for views
	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private ComposedAdapterFactory emfEditAdapterFactory;
	private IndexListener indexListener;
	private ResourceSet resourceSet;

	// actions
	// TODO #1449: private Action structureAction = new ChangeStructureAction(this);
	private Action openAction = new OpenAction(this);
	private Action newAction = new NewAction(this);
	private Action filtersAction = new FiltersAction(this);

	// filter
	private ArtifactFilter filter = new ArtifactFilter();
	private IMemento memento;
	private static final String MEMENTO_TAG_FILTER = "TAG_FILTER";

	// mapping files to their root EObject
	private Map<IResource, EObject> resource2EObjectMap = 
		new HashMap<IResource, EObject>();

	/**
	 * The constructor.
	 */
	public BasicRepositoryView() {
		this.emfEditAdapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		emfEditAdapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		emfEditAdapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		preferenceStore = SokanUIPlugin.getDefault().getPreferenceStore();
		preferenceStore.addPropertyChangeListener(this);
	}
	
	/**
	 * @return the utilized EMF edit adapter factory 
	 */
	public ComposedAdapterFactory getAdapterFactory() {
		return this.emfEditAdapterFactory;
	}

	protected List<Action> getAdditionalActions() {
		return Collections.emptyList();
	}

	/**
	 * @param element an element displayed in the view
	 * @return the URI of the artifact associated with the given element
	 */
	public URI getURIForElement(EObject element) {
		if (element == null) {
			return null;
		}
		if (element instanceof Artifact) {
			Artifact artifact = (Artifact) element;
			return ResourceUtil.uriFrom(ResourceUtil.idFrom(artifact.getId()));
		}
		
		if (element.eResource() == null) {
			return null;
		}
		
		return element.eResource().getURI();
	}

	/**
	 * Associate a certain resource with a certain element displayed in the view.
	 * 
	 * @param resource the resource
	 * @param element the element
	 */
	public void addResource2EObjectMapping(IResource resource, EObject element) {
		resource2EObjectMap.put(resource, element);
	}

	/**
	 * @return the currently used artifact filter
	 */
	public ArtifactFilter getFilter() {
		return filter;
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize it.
	 * 
	 * @param parent the view's parent
	 */
	public void createPartControl(Composite parent) {
		viewer = new BasicRepositoryTreeViewer(this, parent);
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new AdapterFactoryContentProvider(
				emfEditAdapterFactory));

		ILabelDecorator decorator = PlatformUI.getWorkbench()
				.getDecoratorManager().getLabelDecorator();
		viewer.setLabelProvider(new DecoratingLabelProvider(
				new ErrorMarkingAdapterFactoryLabelProvider(this,
						emfEditAdapterFactory), decorator));

		getSite().setSelectionProvider(viewer);

		viewer.setSorter(new ViewerSorter());
		viewer.addDragSupport(DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK,
				new Transfer[] { LocalSelectionTransfer.getTransfer() },
				new LocalSelectionTransferViewerDragAdapter(viewer));

		hookContextMenu();
		contributeToActionBars();

		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				boolean includesContainers = false;
				for (EObject selected : getSelectedElements()) {
					if (selected instanceof Container) {
						if (viewer.getExpandedState(selected)) {
							viewer.collapseToLevel(selected, 1);
						} else {
							viewer.expandToLevel(selected, 1);
						}
						includesContainers = true;
					}
				}
				if (!includesContainers) {
					getDoubleClickAction().run();	
				}
			}
		});

		if (memento != null) {
			// restore filter
			IMemento filterMemento = memento.getChild(MEMENTO_TAG_FILTER);
			if (filterMemento != null) {
				filter.restoreState(filterMemento);
			}
		}

		viewer.addFilter(filter);
		viewer.addSelectionChangedListener(this);

		newRoot();

		indexListener = new BasicRepositoryIndexListener(this);
		IndexUtil.INSTANCE.addListener(indexListener);
	}

	@Override
	public void dispose() {
		IndexUtil.INSTANCE.removeListener(indexListener);
		super.dispose();
	}

	/**
	 * Recreate the view's model by replacing the model's root element.
	 */
	public void newRoot() {
		Root root = null;
		resourceSet = IndexUtil.INSTANCE.createNewResourceSet();

		if (mode == MODE_FOLDER) {
			root = SokanuiFactory.eINSTANCE.createRootFolder();
		} else /* mode == MODE_PACKAGE */ {
			root = SokanuiFactory.eINSTANCE.createRootPackage();
		}
		root.setResourceSet(resourceSet);
		root.getVisibleTypes().addAll(getVisibleTypes());
		
		SokanuiUtil.init(root);
		
		viewer.setInput(root);
		refreshViewer();
	}
	
	/** 
	 * @return the resource set this view is working with to load artifacts
	 */
	public ResourceSet getResourceSet() {
		return resourceSet;
	}
	
	/**
	 * Updates the parts of the view's model that represent
	 * the artifacts with the given IDs.
	 * 
	 * @param delta IDs of the artifacts to update
	 */
	public void updateViewModel(Set<ID> delta) {
		SokanuiUtil.update((Root) viewer.getInput(), delta);
	}

	protected List<EClass> getVisibleTypes() {
		return Collections.emptyList();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				BasicRepositoryView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(openAction);
		manager.add(newAction);
		manager.add(new Separator());
		for (Action additinalAction : getAdditionalActions()) {
			manager.add(additinalAction);
		}
		drillDownAdapter.addNavigationActions(manager);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(openAction);
		manager.add(newAction);
		manager.add(new Separator());
		for (Action additinalAction : getAdditionalActions()) {
			manager.add(additinalAction);
		}
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		// manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(openAction);
		manager.add(newAction);
		manager.add(new Separator());
		for (Action additinalAction : getAdditionalActions()) {
			manager.add(additinalAction);
		}
		manager.add(new Separator());
		manager.add(filtersAction);
		// TODO #1449: manager.add(structureAction);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}

	/**
	 * @return the currently selected elements
	 */
	public List<EObject> getSelectedElements() {
		List<EObject> selectedElements = new ArrayList<EObject>();
		TreeSelection selection = (TreeSelection) viewer.getSelection(); // to
		// update the selectedPackagedElements list
		Iterator<?> selectionIterator = selection.iterator();
		while (selectionIterator.hasNext()) {
			Object next = selectionIterator.next();
			EObject element = null;
			if (next instanceof EObject) {
				element = (EObject) next;
			}
			if (next instanceof IResource) {
				element = resource2EObjectMap.get(next);
			}

			if (element != null) {
				selectedElements.add(element);
			}

		}
		return selectedElements;
	}

	protected Action getDoubleClickAction() {
		return openAction;
	}

	/**
	 * Refreshes the viewer.
	 */
	public void refreshViewer() {
		viewer.refresh();
	}

	/**
	 * Saves the state of the artifact filter.
	 * Is is called when the Eclipse application is closed.
	 * 
	 * @param memento the memento to save
	 */
	public void saveState(IMemento memento) {
		if (viewer == null) {
			if (this.memento != null) {
				memento.putMemento(this.memento);
			}
			return;
		}
		filter.saveState(memento.createChild(MEMENTO_TAG_FILTER));
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	/**
	 * Refreshes the viewer.
	 * 
	 * @param event the property change event
	 */
	public void propertyChange(PropertyChangeEvent event) {
		// viewPackageMgr.setPackageList(event.getNewValue().toString());
		viewer.refresh();
	}

	/**
	 * Update the view upon a filter change.
	 */
	public void filterChanged() {
		BusyIndicator.showWhile(viewer.getControl().getShell().getDisplay(),
				new Runnable() {
					public void run() {
						// Filter has already been updated by dialog; just
						// refresh.
						viewer.getControl().setRedraw(false);
						viewer.refresh(false);
						viewer.getControl().setRedraw(true);

						// update after refresh since the content provider
						// caches summary info
						// updateStatusMessage();
						// updateTitle();
					}
				});
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class required) {
		if (required.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		return super.getAdapter(required);
	}

	private PropertySheetPage propertySheetPage = null;

	/**
	 * @return property sheet page (for the property view) associated with this repository view.
	 */
	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new PropertySheetPage();

			propertySheetPage
					.setPropertySourceProvider(new AdapterFactoryContentProvider(
							emfEditAdapterFactory) {
						protected IPropertySource createPropertySource(
								Object object,
								IItemPropertySource itemPropertySource) {
							return new PropertySource(object,
									itemPropertySource) {
								protected IPropertyDescriptor createPropertyDescriptor(
										IItemPropertyDescriptor itemPropertyDescriptor) {
									return new PropertyDescriptor(object,
											itemPropertyDescriptor) {
										public CellEditor createPropertyEditor(
												Composite composite) {
											return null;
										}
									};
								}
							};
						}
					});
		}

		return propertySheetPage;
	}

	protected IFile getFileForSelection() {
		List<EObject> selections = getSelectedElements();
		IFile file = null;
		if (!selections.isEmpty() && selections.get(0) instanceof EObject) {
			EObject element = (EObject) selections.get(0);
			file = getFileForElement(element);
		}
		return file;
	}

	/**
	 * @param element an element displayed in the view
	 * @return the file associated with the element
	 */
	public IFile getFileForElement(EObject element) {
		URI uri = getURIForElement(element);
		IFile file = null;

		if (uri != null) {
			file = ResourceUtil.fileFor(uri);
		}

		return file;
	}

	/**
	 * Update the view's actions according to changes in the selection.
	 * 
	 * @param event the selection changed event
	 */
	public void selectionChanged(SelectionChangedEvent event) {
		boolean includesContainers = false;
		for (EObject selected : getSelectedElements()) {
			if (selected instanceof Container) {
				includesContainers = true;
				break;
			}
		}
		
		if (includesContainers) {
			openAction.setEnabled(false);
			newAction.setEnabled(true);
			for (Action additinalAction : getAdditionalActions()) {
				additinalAction.setEnabled(false);
			}
		} else {
			openAction.setEnabled(true);
			newAction.setEnabled(false);
			for (Action additinalAction : getAdditionalActions()) {
				for (EObject selected : getSelectedElements()) {
					additinalAction.setEnabled(true);
					if (!canHandle(additinalAction, selected)) {
						additinalAction.setEnabled(false);
						break;
					}
				}
			}	
		}
	}
	
	protected boolean canHandle(Action additinalAction, EObject selected) {
		return true;
	}

	/**
	 * Swap between <i>package</i> and <i>folder</i> display mode.
	 */
	public void swapMode() {
		switch (mode) {
		case MODE_FOLDER:
			mode = MODE_PACKAGE;
			break;
			
		case MODE_PACKAGE:
			mode = MODE_FOLDER;
			break;

		default:
			break;
		}
	}
}
