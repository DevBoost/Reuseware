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
import org.reuseware.coconut.reuseextension.CompositionLanguageSpecification;
import org.reuseware.coconut.reuseextension.ReuseextensionFactory;
import org.reuseware.coconut.reuseextension.ReuseextensionPackage;

/**
 * This is the item provider adapter for a {@link org.reuseware.coconut.reuseextension.CompositionLanguageSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositionLanguageSpecificationItemProvider
	extends ReuseExtensionItemProvider
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
	public CompositionLanguageSpecificationItemProvider(AdapterFactory adapterFactory) {
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

			addCompositionProgramPhysicalLocationExpressionPropertyDescriptor(object);
			addUcpiExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Composition Program Physical Location Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompositionProgramPhysicalLocationExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositionLanguageSpecification_compositionProgramPhysicalLocationExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositionLanguageSpecification_compositionProgramPhysicalLocationExpression_feature", "_UI_CompositionLanguageSpecification_type"),
				 ReuseextensionPackage.Literals.COMPOSITION_LANGUAGE_SPECIFICATION__COMPOSITION_PROGRAM_PHYSICAL_LOCATION_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ucpi Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUcpiExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositionLanguageSpecification_ucpiExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositionLanguageSpecification_ucpiExpression_feature", "_UI_CompositionLanguageSpecification_type"),
				 ReuseextensionPackage.Literals.COMPOSITION_LANGUAGE_SPECIFICATION__UCPI_EXPRESSION,
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
			childrenFeatures.add(ReuseextensionPackage.Literals.COMPOSITION_LANGUAGE_SPECIFICATION__COMPOSITION_ASSOCIATION_BINDINGS);
			childrenFeatures.add(ReuseextensionPackage.Literals.COMPOSITION_LANGUAGE_SPECIFICATION__FRAGMENT_ROLE_BINDINGS);
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
	 * This returns CompositionLanguageSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositionLanguageSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
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

		switch (notification.getFeatureID(CompositionLanguageSpecification.class)) {
			case ReuseextensionPackage.COMPOSITION_LANGUAGE_SPECIFICATION__COMPOSITION_PROGRAM_PHYSICAL_LOCATION_EXPRESSION:
			case ReuseextensionPackage.COMPOSITION_LANGUAGE_SPECIFICATION__UCPI_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ReuseextensionPackage.COMPOSITION_LANGUAGE_SPECIFICATION__COMPOSITION_ASSOCIATION_BINDINGS:
			case ReuseextensionPackage.COMPOSITION_LANGUAGE_SPECIFICATION__FRAGMENT_ROLE_BINDINGS:
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
				(ReuseextensionPackage.Literals.COMPOSITION_LANGUAGE_SPECIFICATION__COMPOSITION_ASSOCIATION_BINDINGS,
				 ReuseextensionFactory.eINSTANCE.createCompositionAssociation2CompositionLinkBinding()));

		newChildDescriptors.add
			(createChildParameter
				(ReuseextensionPackage.Literals.COMPOSITION_LANGUAGE_SPECIFICATION__FRAGMENT_ROLE_BINDINGS,
				 ReuseextensionFactory.eINSTANCE.createFragmentRole2FragmentInstanceBinding()));

		newChildDescriptors.add
			(createChildParameter
				(ReuseextensionPackage.Literals.COMPOSITION_LANGUAGE_SPECIFICATION__FRAGMENT_ROLE_BINDINGS,
				 ReuseextensionFactory.eINSTANCE.createFragmentRole2FragmentReferenceBinding()));
	}

}
