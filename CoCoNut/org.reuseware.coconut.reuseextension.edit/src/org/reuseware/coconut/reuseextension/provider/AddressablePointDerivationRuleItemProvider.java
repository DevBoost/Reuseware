/*******************************************************************************
 * Copyright (c) 2006-2010
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
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.reuseware.coconut.reuseextension.AddressablePointDerivationRule;
import org.reuseware.coconut.reuseextension.ReuseextensionPackage;

/**
 * This is the item provider adapter for a {@link org.reuseware.coconut.reuseextension.AddressablePointDerivationRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressablePointDerivationRuleItemProvider
	extends ItemProviderAdapter
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
	public AddressablePointDerivationRuleItemProvider(AdapterFactory adapterFactory) {
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
			addForEachExpressionPropertyDescriptor(object);
			addHomoPortNameExpressionPropertyDescriptor(object);
			addPointNameExpressionPropertyDescriptor(object);
			addPortNameExpressionPropertyDescriptor(object);
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
	 * This adds a property descriptor for the For Each Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForEachExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddressablePointDerivationRule_forEachExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddressablePointDerivationRule_forEachExpression_feature", "_UI_AddressablePointDerivationRule_type"),
				 ReuseextensionPackage.Literals.ADDRESSABLE_POINT_DERIVATION_RULE__FOR_EACH_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Homo Port Name Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHomoPortNameExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddressablePointDerivationRule_homoPortNameExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddressablePointDerivationRule_homoPortNameExpression_feature", "_UI_AddressablePointDerivationRule_type"),
				 ReuseextensionPackage.Literals.ADDRESSABLE_POINT_DERIVATION_RULE__HOMO_PORT_NAME_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Point Name Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointNameExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddressablePointDerivationRule_pointNameExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddressablePointDerivationRule_pointNameExpression_feature", "_UI_AddressablePointDerivationRule_type"),
				 ReuseextensionPackage.Literals.ADDRESSABLE_POINT_DERIVATION_RULE__POINT_NAME_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Name Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortNameExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddressablePointDerivationRule_portNameExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddressablePointDerivationRule_portNameExpression_feature", "_UI_AddressablePointDerivationRule_type"),
				 ReuseextensionPackage.Literals.ADDRESSABLE_POINT_DERIVATION_RULE__PORT_NAME_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		AddressablePointDerivationRule rule = (AddressablePointDerivationRule) object;
		EClass bound = rule.getEBoundClass();
		EStructuralFeature boundFeatrue = rule.getEBoundFeature();
		
		String label = " > ";
		if(bound.eIsProxy()) {
			label += "?";
		}
		else {
			label += bound.getEPackage().getName() + "::" + bound.getName();
		}
		if(boundFeatrue != null && !boundFeatrue.eIsProxy()) {
			label += "." + boundFeatrue.getName();
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

		switch (notification.getFeatureID(AddressablePointDerivationRule.class)) {
			case ReuseextensionPackage.ADDRESSABLE_POINT_DERIVATION_RULE__IS_EXPRESSION:
			case ReuseextensionPackage.ADDRESSABLE_POINT_DERIVATION_RULE__FOR_EACH_EXPRESSION:
			case ReuseextensionPackage.ADDRESSABLE_POINT_DERIVATION_RULE__HOMO_PORT_NAME_EXPRESSION:
			case ReuseextensionPackage.ADDRESSABLE_POINT_DERIVATION_RULE__POINT_NAME_EXPRESSION:
			case ReuseextensionPackage.ADDRESSABLE_POINT_DERIVATION_RULE__PORT_NAME_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ReuseextensionEditPlugin.INSTANCE;
	}

}
