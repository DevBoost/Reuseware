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

import es.tid.cim.BGPProtocolEndpoint;
import es.tid.cim.CimPackage;

/**
 * This is the item provider adapter for a {@link es.tid.cim.BGPProtocolEndpoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BGPProtocolEndpointItemProvider
	extends ProtocolEndpointItemProvider
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
	public BGPProtocolEndpointItemProvider(AdapterFactory adapterFactory) {
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

			addIsEBGPPropertyDescriptor(object);
			addIsEBGPMultihopPropertyDescriptor(object);
			addLocalIdentifierPropertyDescriptor(object);
			addPerrIdentifierPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addAdminStatusPropertyDescriptor(object);
			addNegotiatedVersionPropertyDescriptor(object);
			addLocalAddressPropertyDescriptor(object);
			addLocalPortPropertyDescriptor(object);
			addRemoteAddressPropertyDescriptor(object);
			addRemotePortPropertyDescriptor(object);
			addRemoteASPropertyDescriptor(object);
			addConnectRetryIntervalPropertyDescriptor(object);
			addHoldTimeConfiguredPropertyDescriptor(object);
			addKeepAliveConfiguredPropertyDescriptor(object);
			addMinASOriginationIntervalPropertyDescriptor(object);
			addMinRouteAdvertisementIntervalPropertyDescriptor(object);
			addHoldTimePropertyDescriptor(object);
			addKeepAlivePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is EBGP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEBGPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_isEBGP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_isEBGP_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_IsEBGP(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is EBGP Multihop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEBGPMultihopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_isEBGPMultihop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_isEBGPMultihop_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_IsEBGPMultihop(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_localIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_localIdentifier_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_LocalIdentifier(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Perr Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerrIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_perrIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_perrIdentifier_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_PerrIdentifier(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_state_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_State(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Admin Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdminStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_adminStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_adminStatus_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_AdminStatus(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Negotiated Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNegotiatedVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_negotiatedVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_negotiatedVersion_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_NegotiatedVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_localAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_localAddress_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_LocalAddress(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_localPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_localPort_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_LocalPort(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remote Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemoteAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_remoteAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_remoteAddress_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_RemoteAddress(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remote Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemotePortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_remotePort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_remotePort_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_RemotePort(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remote AS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemoteASPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_remoteAS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_remoteAS_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_RemoteAS(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_BGPProtocolEndpoint_connectRetryInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_connectRetryInterval_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_ConnectRetryInterval(),
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
				 getString("_UI_BGPProtocolEndpoint_holdTimeConfigured_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_holdTimeConfigured_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_HoldTimeConfigured(),
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
				 getString("_UI_BGPProtocolEndpoint_keepAliveConfigured_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_keepAliveConfigured_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_KeepAliveConfigured(),
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
				 getString("_UI_BGPProtocolEndpoint_minASOriginationInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_minASOriginationInterval_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_MinASOriginationInterval(),
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
				 getString("_UI_BGPProtocolEndpoint_minRouteAdvertisementInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_minRouteAdvertisementInterval_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_MinRouteAdvertisementInterval(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hold Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHoldTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_holdTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_holdTime_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_HoldTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keep Alive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeepAlivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BGPProtocolEndpoint_keepAlive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BGPProtocolEndpoint_keepAlive_feature", "_UI_BGPProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getBGPProtocolEndpoint_KeepAlive(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns BGPProtocolEndpoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BGPProtocolEndpoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BGPProtocolEndpoint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BGPProtocolEndpoint_type") :
			getString("_UI_BGPProtocolEndpoint_type") + " " + label;
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

		switch (notification.getFeatureID(BGPProtocolEndpoint.class)) {
			case CimPackage.BGP_PROTOCOL_ENDPOINT__IS_EBGP:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__IS_EBGP_MULTIHOP:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_IDENTIFIER:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__PERR_IDENTIFIER:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__STATE:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__ADMIN_STATUS:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__NEGOTIATED_VERSION:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_ADDRESS:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__LOCAL_PORT:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_ADDRESS:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_PORT:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__REMOTE_AS:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__CONNECT_RETRY_INTERVAL:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__HOLD_TIME_CONFIGURED:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE_CONFIGURED:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__MIN_AS_ORIGINATION_INTERVAL:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__HOLD_TIME:
			case CimPackage.BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE:
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
