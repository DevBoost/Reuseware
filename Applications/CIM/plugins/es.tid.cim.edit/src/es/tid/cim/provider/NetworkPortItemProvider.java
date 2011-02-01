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
import es.tid.cim.NetworkPort;

/**
 * This is the item provider adapter for a {@link es.tid.cim.NetworkPort} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkPortItemProvider
	extends LogicalPortItemProvider
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
	public NetworkPortItemProvider(AdapterFactory adapterFactory) {
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

			addPortNumberPropertyDescriptor(object);
			addLinkTechnologyPropertyDescriptor(object);
			addOtherLinktechnologyPropertyDescriptor(object);
			addNetworkAddressesPropertyDescriptor(object);
			addFullDuplexPropertyDescriptor(object);
			addAutoSensePropertyDescriptor(object);
			addSupportedMaximumTransmissionUnitPropertyDescriptor(object);
			addPermanentAddressPropertyDescriptor(object);
			addActiveMaximumTransmissionUnitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Port Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkPort_portNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkPort_portNumber_feature", "_UI_NetworkPort_type"),
				 CimPackage.eINSTANCE.getNetworkPort_PortNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkPort_linkTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkPort_linkTechnology_feature", "_UI_NetworkPort_type"),
				 CimPackage.eINSTANCE.getNetworkPort_LinkTechnology(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Linktechnology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherLinktechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkPort_otherLinktechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkPort_otherLinktechnology_feature", "_UI_NetworkPort_type"),
				 CimPackage.eINSTANCE.getNetworkPort_OtherLinktechnology(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network Addresses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkAddressesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkPort_networkAddresses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkPort_networkAddresses_feature", "_UI_NetworkPort_type"),
				 CimPackage.eINSTANCE.getNetworkPort_NetworkAddresses(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Full Duplex feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFullDuplexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkPort_fullDuplex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkPort_fullDuplex_feature", "_UI_NetworkPort_type"),
				 CimPackage.eINSTANCE.getNetworkPort_FullDuplex(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Sense feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoSensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkPort_autoSense_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkPort_autoSense_feature", "_UI_NetworkPort_type"),
				 CimPackage.eINSTANCE.getNetworkPort_AutoSense(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Maximum Transmission Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedMaximumTransmissionUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkPort_supportedMaximumTransmissionUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkPort_supportedMaximumTransmissionUnit_feature", "_UI_NetworkPort_type"),
				 CimPackage.eINSTANCE.getNetworkPort_SupportedMaximumTransmissionUnit(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Permanent Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPermanentAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkPort_permanentAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkPort_permanentAddress_feature", "_UI_NetworkPort_type"),
				 CimPackage.eINSTANCE.getNetworkPort_PermanentAddress(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Active Maximum Transmission Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActiveMaximumTransmissionUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkPort_activeMaximumTransmissionUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkPort_activeMaximumTransmissionUnit_feature", "_UI_NetworkPort_type"),
				 CimPackage.eINSTANCE.getNetworkPort_ActiveMaximumTransmissionUnit(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns NetworkPort.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NetworkPort"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NetworkPort)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NetworkPort_type") :
			getString("_UI_NetworkPort_type") + " " + label;
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

		switch (notification.getFeatureID(NetworkPort.class)) {
			case CimPackage.NETWORK_PORT__PORT_NUMBER:
			case CimPackage.NETWORK_PORT__LINK_TECHNOLOGY:
			case CimPackage.NETWORK_PORT__OTHER_LINKTECHNOLOGY:
			case CimPackage.NETWORK_PORT__NETWORK_ADDRESSES:
			case CimPackage.NETWORK_PORT__FULL_DUPLEX:
			case CimPackage.NETWORK_PORT__AUTO_SENSE:
			case CimPackage.NETWORK_PORT__SUPPORTED_MAXIMUM_TRANSMISSION_UNIT:
			case CimPackage.NETWORK_PORT__PERMANENT_ADDRESS:
			case CimPackage.NETWORK_PORT__ACTIVE_MAXIMUM_TRANSMISSION_UNIT:
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
