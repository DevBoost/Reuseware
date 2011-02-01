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

import es.tid.cim.BGPPeerGroup;
import es.tid.cim.CimPackage;

/**
 * This is the item provider adapter for a {@link es.tid.cim.BGPPeerGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BGPPeerGroupItemProvider
	extends CollectionOfMSEsItemProvider
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
	public BGPPeerGroupItemProvider(AdapterFactory adapterFactory) {
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

			addCreationClassNamePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addConnectRetryIntervalPropertyDescriptor(object);
			addHoldTimeConfiguredPropertyDescriptor(object);
			addKeepAliveConfiguredPropertyDescriptor(object);
			addMinASOriginationIntervalPropertyDescriptor(object);
			addMinRouteAdvertisementIntervalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Creation Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPPeerGroup_creationClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPPeerGroup_creationClassName_feature", "_UI_BGPPeerGroup_type"),
				 CimPackage.eINSTANCE.getBGPPeerGroup_CreationClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPPeerGroup_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPPeerGroup_name_feature", "_UI_BGPPeerGroup_type"),
				 CimPackage.eINSTANCE.getBGPPeerGroup_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connect Retry Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectRetryIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPPeerGroup_connectRetryInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPPeerGroup_connectRetryInterval_feature", "_UI_BGPPeerGroup_type"),
				 CimPackage.eINSTANCE.getBGPPeerGroup_ConnectRetryInterval(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hold Time Configured feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHoldTimeConfiguredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPPeerGroup_holdTimeConfigured_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPPeerGroup_holdTimeConfigured_feature", "_UI_BGPPeerGroup_type"),
				 CimPackage.eINSTANCE.getBGPPeerGroup_HoldTimeConfigured(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keep Alive Configured feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeepAliveConfiguredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPPeerGroup_keepAliveConfigured_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPPeerGroup_keepAliveConfigured_feature", "_UI_BGPPeerGroup_type"),
				 CimPackage.eINSTANCE.getBGPPeerGroup_KeepAliveConfigured(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min AS Origination Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinASOriginationIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPPeerGroup_minASOriginationInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPPeerGroup_minASOriginationInterval_feature", "_UI_BGPPeerGroup_type"),
				 CimPackage.eINSTANCE.getBGPPeerGroup_MinASOriginationInterval(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Route Advertisement Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinRouteAdvertisementIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPPeerGroup_minRouteAdvertisementInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPPeerGroup_minRouteAdvertisementInterval_feature", "_UI_BGPPeerGroup_type"),
				 CimPackage.eINSTANCE.getBGPPeerGroup_MinRouteAdvertisementInterval(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns BGPPeerGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BGPPeerGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BGPPeerGroup)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BGPPeerGroup_type") :
			getString("_UI_BGPPeerGroup_type") + " " + label;
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

		switch (notification.getFeatureID(BGPPeerGroup.class)) {
			case CimPackage.BGP_PEER_GROUP__CREATION_CLASS_NAME:
			case CimPackage.BGP_PEER_GROUP__NAME:
			case CimPackage.BGP_PEER_GROUP__CONNECT_RETRY_INTERVAL:
			case CimPackage.BGP_PEER_GROUP__HOLD_TIME_CONFIGURED:
			case CimPackage.BGP_PEER_GROUP__KEEP_ALIVE_CONFIGURED:
			case CimPackage.BGP_PEER_GROUP__MIN_AS_ORIGINATION_INTERVAL:
			case CimPackage.BGP_PEER_GROUP__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
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
