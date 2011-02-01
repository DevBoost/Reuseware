/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.provider;



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

import es.tid.cim.CimPackage;
import es.tid.cim.EnabledLogicalElement;

/**
 * This is the item provider adapter for a {@link es.tid.cim.EnabledLogicalElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnabledLogicalElementItemProvider
	extends LogicalElementItemProvider
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
	public EnabledLogicalElementItemProvider(AdapterFactory adapterFactory) {
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

			addEnabledDefaultPropertyDescriptor(object);
			addEnabledStatePropertyDescriptor(object);
			addOtherEnabledStatePropertyDescriptor(object);
			addOverwritePolicyPropertyDescriptor(object);
			addRemoteAccessAvailableToElementPropertyDescriptor(object);
			addRequestedStatePropertyDescriptor(object);
			addTimeOfLastStateChangePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enabled Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnabledLogicalElement_enabledDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnabledLogicalElement_enabledDefault_feature", "_UI_EnabledLogicalElement_type"),
				 CimPackage.eINSTANCE.getEnabledLogicalElement_EnabledDefault(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enabled State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnabledLogicalElement_enabledState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnabledLogicalElement_enabledState_feature", "_UI_EnabledLogicalElement_type"),
				 CimPackage.eINSTANCE.getEnabledLogicalElement_EnabledState(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Enabled State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherEnabledStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnabledLogicalElement_otherEnabledState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnabledLogicalElement_otherEnabledState_feature", "_UI_EnabledLogicalElement_type"),
				 CimPackage.eINSTANCE.getEnabledLogicalElement_OtherEnabledState(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overwrite Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverwritePolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnabledLogicalElement_overwritePolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnabledLogicalElement_overwritePolicy_feature", "_UI_EnabledLogicalElement_type"),
				 CimPackage.eINSTANCE.getEnabledLogicalElement_OverwritePolicy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remote Access Available To Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemoteAccessAvailableToElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnabledLogicalElement_remoteAccessAvailableToElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnabledLogicalElement_remoteAccessAvailableToElement_feature", "_UI_EnabledLogicalElement_type"),
				 CimPackage.eINSTANCE.getEnabledLogicalElement_RemoteAccessAvailableToElement(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requested State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestedStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnabledLogicalElement_requestedState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnabledLogicalElement_requestedState_feature", "_UI_EnabledLogicalElement_type"),
				 CimPackage.eINSTANCE.getEnabledLogicalElement_RequestedState(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Of Last State Change feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeOfLastStateChangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnabledLogicalElement_timeOfLastStateChange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnabledLogicalElement_timeOfLastStateChange_feature", "_UI_EnabledLogicalElement_type"),
				 CimPackage.eINSTANCE.getEnabledLogicalElement_TimeOfLastStateChange(),
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
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EnabledLogicalElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EnabledLogicalElement_type") :
			getString("_UI_EnabledLogicalElement_type") + " " + label;
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

		switch (notification.getFeatureID(EnabledLogicalElement.class)) {
			case CimPackage.ENABLED_LOGICAL_ELEMENT__ENABLED_DEFAULT:
			case CimPackage.ENABLED_LOGICAL_ELEMENT__ENABLED_STATE:
			case CimPackage.ENABLED_LOGICAL_ELEMENT__OTHER_ENABLED_STATE:
			case CimPackage.ENABLED_LOGICAL_ELEMENT__OVERWRITE_POLICY:
			case CimPackage.ENABLED_LOGICAL_ELEMENT__REQUESTED_STATE:
			case CimPackage.ENABLED_LOGICAL_ELEMENT__TIME_OF_LAST_STATE_CHANGE:
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
