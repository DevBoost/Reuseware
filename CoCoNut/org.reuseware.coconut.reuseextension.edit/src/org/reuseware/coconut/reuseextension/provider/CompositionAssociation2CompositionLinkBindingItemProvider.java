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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.reuseware.coconut.reuseextension.CompositionAssociation2CompositionLinkBinding;
import org.reuseware.coconut.reuseextension.ReuseextensionPackage;

/**
 * This is the item provider adapter for a {@link org.reuseware.coconut.reuseextension.CompositionAssociation2CompositionLinkBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositionAssociation2CompositionLinkBindingItemProvider
	extends CompositionAssociationBindingItemProvider
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
	public CompositionAssociation2CompositionLinkBindingItemProvider(AdapterFactory adapterFactory) {
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

			addForEach1ExpressionPropertyDescriptor(object);
			addForEach2ExpressionPropertyDescriptor(object);
			addFragmentInstance1NameExpressionPropertyDescriptor(object);
			addFragmentInstance2NameExpressionPropertyDescriptor(object);
			addPortInstance1NameExpressionPropertyDescriptor(object);
			addPortInstance2NameExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the For Each1 Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForEach1ExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositionAssociation2CompositionLinkBinding_forEach1Expression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositionAssociation2CompositionLinkBinding_forEach1Expression_feature", "_UI_CompositionAssociation2CompositionLinkBinding_type"),
				 ReuseextensionPackage.Literals.COMPOSITION_ASSOCIATION2_COMPOSITION_LINK_BINDING__FOR_EACH1_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the For Each2 Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForEach2ExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositionAssociation2CompositionLinkBinding_forEach2Expression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositionAssociation2CompositionLinkBinding_forEach2Expression_feature", "_UI_CompositionAssociation2CompositionLinkBinding_type"),
				 ReuseextensionPackage.Literals.COMPOSITION_ASSOCIATION2_COMPOSITION_LINK_BINDING__FOR_EACH2_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fragment Instance1 Name Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFragmentInstance1NameExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositionAssociation2CompositionLinkBinding_fragmentInstance1NameExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositionAssociation2CompositionLinkBinding_fragmentInstance1NameExpression_feature", "_UI_CompositionAssociation2CompositionLinkBinding_type"),
				 ReuseextensionPackage.Literals.COMPOSITION_ASSOCIATION2_COMPOSITION_LINK_BINDING__FRAGMENT_INSTANCE1_NAME_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fragment Instance2 Name Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFragmentInstance2NameExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositionAssociation2CompositionLinkBinding_fragmentInstance2NameExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositionAssociation2CompositionLinkBinding_fragmentInstance2NameExpression_feature", "_UI_CompositionAssociation2CompositionLinkBinding_type"),
				 ReuseextensionPackage.Literals.COMPOSITION_ASSOCIATION2_COMPOSITION_LINK_BINDING__FRAGMENT_INSTANCE2_NAME_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Instance1 Name Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortInstance1NameExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositionAssociation2CompositionLinkBinding_portInstance1NameExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositionAssociation2CompositionLinkBinding_portInstance1NameExpression_feature", "_UI_CompositionAssociation2CompositionLinkBinding_type"),
				 ReuseextensionPackage.Literals.COMPOSITION_ASSOCIATION2_COMPOSITION_LINK_BINDING__PORT_INSTANCE1_NAME_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Instance2 Name Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortInstance2NameExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositionAssociation2CompositionLinkBinding_portInstance2NameExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositionAssociation2CompositionLinkBinding_portInstance2NameExpression_feature", "_UI_CompositionAssociation2CompositionLinkBinding_type"),
				 ReuseextensionPackage.Literals.COMPOSITION_ASSOCIATION2_COMPOSITION_LINK_BINDING__PORT_INSTANCE2_NAME_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CompositionAssociation2CompositionLinkBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositionAssociation2CompositionLinkBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompositionAssociation2CompositionLinkBinding)object).getFragmentInstance1NameExpression();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositionAssociation2CompositionLinkBinding_type") :
			getString("_UI_CompositionAssociation2CompositionLinkBinding_type") + " " + label;
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

		switch (notification.getFeatureID(CompositionAssociation2CompositionLinkBinding.class)) {
			case ReuseextensionPackage.COMPOSITION_ASSOCIATION2_COMPOSITION_LINK_BINDING__FOR_EACH1_EXPRESSION:
			case ReuseextensionPackage.COMPOSITION_ASSOCIATION2_COMPOSITION_LINK_BINDING__FOR_EACH2_EXPRESSION:
			case ReuseextensionPackage.COMPOSITION_ASSOCIATION2_COMPOSITION_LINK_BINDING__FRAGMENT_INSTANCE1_NAME_EXPRESSION:
			case ReuseextensionPackage.COMPOSITION_ASSOCIATION2_COMPOSITION_LINK_BINDING__FRAGMENT_INSTANCE2_NAME_EXPRESSION:
			case ReuseextensionPackage.COMPOSITION_ASSOCIATION2_COMPOSITION_LINK_BINDING__PORT_INSTANCE1_NAME_EXPRESSION:
			case ReuseextensionPackage.COMPOSITION_ASSOCIATION2_COMPOSITION_LINK_BINDING__PORT_INSTANCE2_NAME_EXPRESSION:
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

}
