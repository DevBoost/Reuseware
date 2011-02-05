/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.ui.views;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;
import org.reuseware.coconut.compositionprogram.PhysicalCompositionProgram;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.fragment.FragmentPackage;
import org.reuseware.coconut.fragment.PhysicalFragment;
import org.reuseware.coconut.fragment.provider.FragmentItemProviderAdapterFactory;
import org.reuseware.coconut.fragment.provider.PhysicalFragmentItemProvider;
import org.reuseware.coconut.reuseextensionactivator.ReuseextensionactivatorPackage;
import org.reuseware.coconut.ui.CoCoNutUIPlugin;
import org.reuseware.coconut.ui.internal.actions.OpenCompositionProgramAction;
import org.reuseware.coconut.ui.internal.actions.OpenDiagramAction;
import org.reuseware.coconut.ui.internal.actions.RenameAction;
import org.reuseware.coconut.ui.internal.actions.ReuseAction;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.ui.model.sokanui.provider.PackageItemProvider;
import org.reuseware.sokan.ui.model.sokanui.provider.SokanuiItemProviderAdapterFactory;
import org.reuseware.sokan.ui.views.BasicRepositoryView;

/**
 * A specialized repository view that shows the composition interface
 * of fragments (i.e., models) instead of their content. It is indended to
 * be used by composition system users and therefore filters
 * out composition system specifications (Fracol and Rex files).
 */
public class FragmentRepositoryView extends BasicRepositoryView {

	private ReuseAction reuseAction = 
		new ReuseAction(this);
	private OpenDiagramAction openDiagramAction = 
		new OpenDiagramAction(this);
	private OpenCompositionProgramAction openCompositionProgramAction = 
		new OpenCompositionProgramAction(this);
	private RenameAction renameAction =
		new RenameAction(this);
	
	/**
	 * Constructor of this view.
	 */
	public FragmentRepositoryView() {
		getAdapterFactory().addAdapterFactory(new SokanuiItemProviderAdapterFactory() {
			private ImageDescriptor packageImage = null;

			@Override
			public Adapter createPackageAdapter() {
				if (packageItemProvider == null) {
					packageItemProvider = new PackageItemProvider(this) {
						public Object getImage(Object object) {
							if (packageImage == null) {
								URL url = CoCoNutUIPlugin.getDefault().getBundle().getResource(
										"icons/Package.gif");
								packageImage = ImageDescriptor.createFromURL(url);
							}
							return packageImage;
						};
					};
				}
				return packageItemProvider;
			}
		});
	
		getAdapterFactory().addAdapterFactory(new FragmentItemProviderAdapterFactory() {
			private ImageDescriptor compositionProgramImage = null;
			private ImageDescriptor derivedCompositionProgramImage = null;
	
			@Override
			public Adapter createPhysicalFragmentAdapter() {
				if (physicalFragmentItemProvider == null) {
					physicalFragmentItemProvider = new PhysicalFragmentItemProvider(this) {
						public Object getImage(Object object) {
							if (compositionProgramImage == null) {
								URL url = CoCoNutUIPlugin.getDefault().getBundle().getResource(
										"icons/CompositionProgram.gif");
								compositionProgramImage = ImageDescriptor.createFromURL(url);
								url = CoCoNutUIPlugin.getDefault().getBundle().getResource(
									"icons/DerivedCompositionProgram.gif");
								derivedCompositionProgramImage = ImageDescriptor.createFromURL(url);
							}
							Fragment fragment = (Fragment) object;
							URI uri = ResourceUtil.uriFrom(ResourceUtil.idFrom(fragment.getUFI()));
														
							if (uri != null && "ucl".equals(uri.fileExtension()) && fragment.getContents().size() == 1) {
								if (fragment.getContents().get(0) instanceof PhysicalCompositionProgram) {
									return compositionProgramImage;
								}
								if (fragment.getContents().get(0) instanceof DerivedCompositionProgram) {
									return derivedCompositionProgramImage;
								}
							}
							return super.getImage(object);
						};
					};
				}
				return physicalFragmentItemProvider;
			}
		});	
	}
	
	@Override
	protected List<Action> getAdditionalActions() {
		List<Action> actions = new ArrayList<Action>();
		
		actions.add(openDiagramAction);
		actions.add(openCompositionProgramAction);
		actions.add(reuseAction);
		
		actions.add(renameAction);
		
		return actions;
	}
	
	@Override
	protected boolean canHandle(Action additinalAction, EObject element) {
		if (additinalAction == openDiagramAction) {
			return openDiagramAction.hasDiagrams(element);
		}
		if (additinalAction == openCompositionProgramAction) {
			return openCompositionProgramAction.getComposingCompositionProgramRow(element) != null;
		}
		if (additinalAction == reuseAction) {
			return reuseAction.getActiveCompositionProgramEditor() != null;
		}
		if (additinalAction == renameAction) {
			if (element instanceof PhysicalFragment) {
				Fragment fragment = (Fragment) element;
				URI uri = ResourceUtil.uriFrom(ResourceUtil.idFrom(fragment.getUFI()));
				if (uri != null && "ucl".equals(uri.fileExtension()) && fragment.getContents().size() == 1) {
					if (fragment.getContents().get(0) instanceof DerivedCompositionProgram) {
						return false;
					}
				}
				return true;
			}
			return false;
		}
		return true;
	}
	
	@Override
	protected Action getDoubleClickAction() {
		return openDiagramAction;
	}
	
	private List<EClass> visibleTypes = null;
	
	@Override
	protected List<EClass> getVisibleTypes() {
		if (visibleTypes == null) {
			visibleTypes = new ArrayList<EClass>();
			visibleTypes.add(
				FragmentPackage.Literals.FRAGMENT);
			visibleTypes.add(
				ReuseextensionactivatorPackage.Literals.REUSE_EXTENSION_ACTIVATOR_LIST);
		}
		return visibleTypes;
	}
	
	@Override
	public URI getURIForElement(EObject element) {
		EObject root = EcoreUtil.getRootContainer(element);
		if (root instanceof Fragment) {
			Fragment fragment = (Fragment) root;
			return ResourceUtil.uriFrom(ResourceUtil.idFrom(fragment.getUFI()));
 		}
		return super.getURIForElement(element);
	}
}
