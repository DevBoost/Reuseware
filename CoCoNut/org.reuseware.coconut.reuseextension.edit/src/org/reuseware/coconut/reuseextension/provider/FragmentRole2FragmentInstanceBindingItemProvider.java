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
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.coconut.reuseextension.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.reuseware.coconut.fracol.FragmentRole;
import org.reuseware.coconut.reuseextension.FragmentRole2FragmentInstanceBinding;
import org.reuseware.coconut.reuseextension.ReuseextensionFactory;
import org.reuseware.coconut.reuseextension.ReuseextensionPackage;

/**
 * This is the item provider adapter for a {@link org.reuseware.coconut.reuseextension.FragmentRole2FragmentInstanceBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FragmentRole2FragmentInstanceBindingItemProvider
	extends FragmentRoleBindingItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentRole2FragmentInstanceBindingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEBoundClassPropertyDescriptor(object);
			addEBoundFeaturePropertyDescriptor(object);
			addIsExpressionPropertyDescriptor(object);
			addNameExpressionPropertyDescriptor(object);
			addTargetPhysicalLocationExpressionPropertyDescriptor(object);
			addTargetUfiExpressionPropertyDescriptor(object);
			addUfiExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the EBound Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEBoundClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleContext_eBoundClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleContext_eBoundClass_feature", "_UI_RuleContext_type"),
				 ReuseextensionPackage.Literals.RULE_CONTEXT__EBOUND_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EBound Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEBoundFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleContext_eBoundFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleContext_eBoundFeature_feature", "_UI_RuleContext_type"),
				 ReuseextensionPackage.Literals.RULE_CONTEXT__EBOUND_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RuleContext_isExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RuleContext_isExpression_feature", "_UI_RuleContext_type"),
				 ReuseextensionPackage.Literals.RULE_CONTEXT__IS_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentRole2FragmentInstanceBinding_nameExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentRole2FragmentInstanceBinding_nameExpression_feature", "_UI_FragmentRole2FragmentInstanceBinding_type"),
				 ReuseextensionPackage.Literals.FRAGMENT_ROLE2_FRAGMENT_INSTANCE_BINDING__NAME_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Physical Location Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPhysicalLocationExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentRole2FragmentInstanceBinding_targetPhysicalLocationExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentRole2FragmentInstanceBinding_targetPhysicalLocationExpression_feature", "_UI_FragmentRole2FragmentInstanceBinding_type"),
				 ReuseextensionPackage.Literals.FRAGMENT_ROLE2_FRAGMENT_INSTANCE_BINDING__TARGET_PHYSICAL_LOCATION_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Ufi Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetUfiExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentRole2FragmentInstanceBinding_targetUfiExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentRole2FragmentInstanceBinding_targetUfiExpression_feature", "_UI_FragmentRole2FragmentInstanceBinding_type"),
				 ReuseextensionPackage.Literals.FRAGMENT_ROLE2_FRAGMENT_INSTANCE_BINDING__TARGET_UFI_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ufi Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUfiExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FragmentRole2FragmentInstanceBinding_ufiExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentRole2FragmentInstanceBinding_ufiExpression_feature", "_UI_FragmentRole2FragmentInstanceBinding_type"),
				 ReuseextensionPackage.Literals.FRAGMENT_ROLE2_FRAGMENT_INSTANCE_BINDING__UFI_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ReuseextensionPackage.Literals.FRAGMENT_ROLE2_FRAGMENT_INSTANCE_BINDING__PORT_TYPE_BINDINGS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FragmentRole2FragmentInstanceBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FragmentRole2FragmentInstanceBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		FragmentRole2FragmentInstanceBinding binding = (FragmentRole2FragmentInstanceBinding) object;
		FragmentRole role = binding.getFragmentRole();
		EClass bound = binding.getEBoundClass();
		
		String label;
		if(role == null || role.eIsProxy()) {
			label = "?";
		}
		else {
			label = role.getName();
		}
		label += " > ";
		if(bound == null || bound.eIsProxy() || bound.getEPackage() == null ) {
			label += "?";
		}
		else {
			label += bound.getEPackage().getName() + "::" + bound.getName();
		}
		
		return label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FragmentRole2FragmentInstanceBinding.class)) {
			case ReuseextensionPackage.FRAGMENT_ROLE2_FRAGMENT_INSTANCE_BINDING__IS_EXPRESSION:
			case ReuseextensionPackage.FRAGMENT_ROLE2_FRAGMENT_INSTANCE_BINDING__NAME_EXPRESSION:
			case ReuseextensionPackage.FRAGMENT_ROLE2_FRAGMENT_INSTANCE_BINDING__TARGET_PHYSICAL_LOCATION_EXPRESSION:
			case ReuseextensionPackage.FRAGMENT_ROLE2_FRAGMENT_INSTANCE_BINDING__TARGET_UFI_EXPRESSION:
			case ReuseextensionPackage.FRAGMENT_ROLE2_FRAGMENT_INSTANCE_BINDING__UFI_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ReuseextensionPackage.FRAGMENT_ROLE2_FRAGMENT_INSTANCE_BINDING__PORT_TYPE_BINDINGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ReuseextensionPackage.Literals.FRAGMENT_ROLE2_FRAGMENT_INSTANCE_BINDING__PORT_TYPE_BINDINGS,
				 ReuseextensionFactory.eINSTANCE.createPortType2SettingBinding()));
	}

}
