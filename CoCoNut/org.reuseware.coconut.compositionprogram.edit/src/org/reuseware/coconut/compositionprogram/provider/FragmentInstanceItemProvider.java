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
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * Copyright (c) 2006-2011
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
 */
package org.reuseware.coconut.compositionprogram.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.ui.PlatformUI;
import org.reuseware.coconut.compositionprogram.CompositionprogramFactory;
import org.reuseware.coconut.compositionprogram.CompositionprogramPackage;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PortInstance;
import org.reuseware.coconut.compositionprogram.Setting;
import org.reuseware.coconut.fragment.Fragment;

/**
 * This is the item provider adapter for a {@link org.reuseware.coconut.compositionprogram.FragmentInstance} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class FragmentInstanceItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FragmentInstanceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	//!START MODIFICATION

	protected void addPortSettingsPropertyDescriptors(Object object) {
		FragmentInstance fInstance = (FragmentInstance) object;

		for (PortInstance portInstance : fInstance.getPortInstances()) {
			for (Setting setting : portInstance.getSettings()) {
				itemPropertyDescriptors.add(
						new FragmentInstanceSettingItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(), getResourceLocator(),
						setting.getProperty(), "",
						CompositionprogramPackage.Literals.SETTING__VALUE,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						portInstance.getPortName(), null));
			}
		}
	}
	
	protected Map<Object, List<IItemPropertyDescriptor>> itemPropertyDescriptorMap = new HashMap<Object, List<IItemPropertyDescriptor>>();

	public void unsetTarget(Notifier oldTarget) {
		itemPropertyDescriptorMap.remove(oldTarget);
		super.unsetTarget(oldTarget);
	}
	
	/**
	 * This returns the property descriptors for the adapted class.
	 * 
	 * Modified to also show settings in properties. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptorMap.get(object) == null) {
			itemPropertyDescriptors = new ArrayList<IItemPropertyDescriptor>();
			itemPropertyDescriptorMap.put(object, itemPropertyDescriptors);
			
			final FragmentInstance fInstance = (FragmentInstance) object;
			
			fInstance.eAdapters().add(new EContentAdapter() {
				@Override
				public void notifyChanged(Notification notification) {
					if( ((notification.getOldValue() instanceof Setting || notification.getOldValue() instanceof PortInstance)
						&& (notification.getEventType() == Notification.REMOVE)) ||  
						((notification.getNewValue() instanceof Setting || notification.getNewValue() instanceof PortInstance)
						&& (notification.getEventType() == Notification.ADD))   ) {
						//make sure the property descriptor list is rebuilt, because a setting has been removed
						itemPropertyDescriptorMap.get(fInstance).clear();
					}
				}
			});
		}
		if (itemPropertyDescriptorMap.get(object).isEmpty()) {
			itemPropertyDescriptors = itemPropertyDescriptorMap.get(object);
			
			addUFIPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTargetUFIPropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addReferencePropertyDescriptor(object);
			addDerivedFromPropertyDescriptor(object);
			addTargetPhysicalLocationPropertyDescriptor(object);
			addArgumentsPropertyDescriptor(object);

			addPortSettingsPropertyDescriptors(object);
		}

		return itemPropertyDescriptorMap.get(object);
	}
	//!END MODIFICATION

	/**
	 * This adds a property descriptor for the UFI feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUFIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentInstance_UFI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentInstance_UFI_feature", "_UI_FragmentInstance_type"),
				 CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__UFI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arguments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArgumentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentInstance_arguments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentInstance_arguments_feature", "_UI_FragmentInstance_type"),
				 CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__ARGUMENTS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Derived From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentInstance_derivedFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentInstance_derivedFrom_feature", "_UI_FragmentInstance_type"),
				 CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__DERIVED_FROM,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fragment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFragmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentInstance_fragment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentInstance_fragment_feature", "_UI_FragmentInstance_type"),
				 CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__FRAGMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentInstance_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentInstance_name_feature", "_UI_FragmentInstance_type"),
				 CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentInstance_reference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentInstance_reference_feature", "_UI_FragmentInstance_type"),
				 CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__REFERENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Physical Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPhysicalLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentInstance_targetPhysicalLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentInstance_targetPhysicalLocation_feature", "_UI_FragmentInstance_type"),
				 CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__TARGET_PHYSICAL_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target UFI feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTargetUFIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentInstance_targetUFI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentInstance_targetUFI_feature", "_UI_FragmentInstance_type"),
				 CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__TARGET_UFI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentInstance_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentInstance_target_feature", "_UI_FragmentInstance_type"),
				 CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__ARGUMENTS);
			childrenFeatures.add(CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__DERIVED_FROM);
			childrenFeatures.add(CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__PORT_INSTANCES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FragmentInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
	      EList<String> ufi = ((FragmentInstance)object).getUFI();
		  if (ufi.isEmpty()) {
			  return overlayImage(object, getResourceLocator().getImage("full/obj16/FragmentInstance"));
		  }
		
	      List<Object> images = new ArrayList<Object>(2);
	      //XXX the PlatformUI dependency could be set to optional and only used when available
	      images.add(PlatformUI.getWorkbench().getEditorRegistry().getImageDescriptor(ufi.get(ufi.size() - 1)));
	      images.add(getResourceLocator().getImage("full/obj16/Overlay"));
	      return new ComposedImage(images);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		FragmentInstance fi = (FragmentInstance)object;
		Fragment fragment = fi.getFragment();
		
		String label = fi.getName();
		
		if(fragment != null) {
			label += " : ";
			label += fragment.getUFI().toString();
		}
		
		return label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FragmentInstance.class)) {
			case CompositionprogramPackage.FRAGMENT_INSTANCE__UFI:
			case CompositionprogramPackage.FRAGMENT_INSTANCE__NAME:
			case CompositionprogramPackage.FRAGMENT_INSTANCE__REFERENCE:
			case CompositionprogramPackage.FRAGMENT_INSTANCE__TARGET_PHYSICAL_LOCATION:
			case CompositionprogramPackage.FRAGMENT_INSTANCE__TARGET_UFI:
			case CompositionprogramPackage.FRAGMENT_INSTANCE__TARGET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CompositionprogramPackage.FRAGMENT_INSTANCE__ARGUMENTS:
			case CompositionprogramPackage.FRAGMENT_INSTANCE__PORT_INSTANCES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__ARGUMENTS,
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(CompositionprogramPackage.Literals.FRAGMENT_INSTANCE__PORT_INSTANCES,
				 CompositionprogramFactory.eINSTANCE.createPortInstance()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CompositionprogramEditPlugin.INSTANCE;
	}

}
