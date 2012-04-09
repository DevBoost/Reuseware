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
package org.reuseware.coconut.reuseextension.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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
import org.reuseware.coconut.reuseextension.FragmentRole2SyntaxBinding;
import org.reuseware.coconut.reuseextension.ReuseextensionFactory;
import org.reuseware.coconut.reuseextension.ReuseextensionPackage;

/**
 * This is the item provider adapter for a {@link org.reuseware.coconut.reuseextension.FragmentRole2SyntaxBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FragmentRole2SyntaxBindingItemProvider
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
	public FragmentRole2SyntaxBindingItemProvider(AdapterFactory adapterFactory) {
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

			addHeightExpressionPropertyDescriptor(object);
			addIconExpressionPropertyDescriptor(object);
			addVisibleExpressionPropertyDescriptor(object);
			addWidthExpressionPropertyDescriptor(object);
			addNameExpressionPropertyDescriptor(object);
			addTargetUfiExpressionPropertyDescriptor(object);
			addUfiExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Height Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SyntaxDerivationRule_heightExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SyntaxDerivationRule_heightExpression_feature", "_UI_SyntaxDerivationRule_type"),
				 ReuseextensionPackage.Literals.SYNTAX_DERIVATION_RULE__HEIGHT_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Icon Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIconExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SyntaxDerivationRule_iconExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SyntaxDerivationRule_iconExpression_feature", "_UI_SyntaxDerivationRule_type"),
				 ReuseextensionPackage.Literals.SYNTAX_DERIVATION_RULE__ICON_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SyntaxDerivationRule_visibleExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SyntaxDerivationRule_visibleExpression_feature", "_UI_SyntaxDerivationRule_type"),
				 ReuseextensionPackage.Literals.SYNTAX_DERIVATION_RULE__VISIBLE_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SyntaxDerivationRule_widthExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SyntaxDerivationRule_widthExpression_feature", "_UI_SyntaxDerivationRule_type"),
				 ReuseextensionPackage.Literals.SYNTAX_DERIVATION_RULE__WIDTH_EXPRESSION,
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
				 getString("_UI_FragmentRole2SyntaxBinding_nameExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentRole2SyntaxBinding_nameExpression_feature", "_UI_FragmentRole2SyntaxBinding_type"),
				 ReuseextensionPackage.Literals.FRAGMENT_ROLE2_SYNTAX_BINDING__NAME_EXPRESSION,
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
				 getString("_UI_FragmentRole2SyntaxBinding_targetUfiExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentRole2SyntaxBinding_targetUfiExpression_feature", "_UI_FragmentRole2SyntaxBinding_type"),
				 ReuseextensionPackage.Literals.FRAGMENT_ROLE2_SYNTAX_BINDING__TARGET_UFI_EXPRESSION,
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
				 getString("_UI_FragmentRole2SyntaxBinding_ufiExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FragmentRole2SyntaxBinding_ufiExpression_feature", "_UI_FragmentRole2SyntaxBinding_type"),
				 ReuseextensionPackage.Literals.FRAGMENT_ROLE2_SYNTAX_BINDING__UFI_EXPRESSION,
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
			childrenFeatures.add(ReuseextensionPackage.Literals.FRAGMENT_ROLE2_SYNTAX_BINDING__PORT_TYPE_BINDINGS);
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
	 * This returns FragmentRole2SyntaxBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FragmentRole2SyntaxBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FragmentRole2SyntaxBinding)object).getNameExpression();
		return label == null || label.length() == 0 ?
			getString("_UI_FragmentRole2SyntaxBinding_type") :
			getString("_UI_FragmentRole2SyntaxBinding_type") + " " + label;
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

		switch (notification.getFeatureID(FragmentRole2SyntaxBinding.class)) {
			case ReuseextensionPackage.FRAGMENT_ROLE2_SYNTAX_BINDING__HEIGHT_EXPRESSION:
			case ReuseextensionPackage.FRAGMENT_ROLE2_SYNTAX_BINDING__ICON_EXPRESSION:
			case ReuseextensionPackage.FRAGMENT_ROLE2_SYNTAX_BINDING__VISIBLE_EXPRESSION:
			case ReuseextensionPackage.FRAGMENT_ROLE2_SYNTAX_BINDING__WIDTH_EXPRESSION:
			case ReuseextensionPackage.FRAGMENT_ROLE2_SYNTAX_BINDING__NAME_EXPRESSION:
			case ReuseextensionPackage.FRAGMENT_ROLE2_SYNTAX_BINDING__TARGET_UFI_EXPRESSION:
			case ReuseextensionPackage.FRAGMENT_ROLE2_SYNTAX_BINDING__UFI_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ReuseextensionPackage.FRAGMENT_ROLE2_SYNTAX_BINDING__PORT_TYPE_BINDINGS:
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
				(ReuseextensionPackage.Literals.FRAGMENT_ROLE2_SYNTAX_BINDING__PORT_TYPE_BINDINGS,
				 ReuseextensionFactory.eINSTANCE.createPortType2SyntaxBinding()));
	}

}
