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
import es.tid.cim.DNSProtocolEndpoint;

/**
 * This is the item provider adapter for a {@link es.tid.cim.DNSProtocolEndpoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DNSProtocolEndpointItemProvider
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
	public DNSProtocolEndpointItemProvider(AdapterFactory adapterFactory) {
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

			addAppendParentSuffixesPropertyDescriptor(object);
			addAppendPrimarySuffixesPropertyDescriptor(object);
			addDomainNamePropertyDescriptor(object);
			addHostnamePropertyDescriptor(object);
			addRegisterThisConnectionsAddressPropertyDescriptor(object);
			addUseSuffixWhenRegisteringPropertyDescriptor(object);
			addDHCPOptionsToUsePropertyDescriptor(object);
			addDNSSuffixesToAppendPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Append Parent Suffixes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppendParentSuffixesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DNSProtocolEndpoint_appendParentSuffixes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DNSProtocolEndpoint_appendParentSuffixes_feature", "_UI_DNSProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getDNSProtocolEndpoint_AppendParentSuffixes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Append Primary Suffixes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppendPrimarySuffixesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DNSProtocolEndpoint_appendPrimarySuffixes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DNSProtocolEndpoint_appendPrimarySuffixes_feature", "_UI_DNSProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getDNSProtocolEndpoint_AppendPrimarySuffixes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DNSProtocolEndpoint_domainName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DNSProtocolEndpoint_domainName_feature", "_UI_DNSProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getDNSProtocolEndpoint_DomainName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hostname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DNSProtocolEndpoint_hostname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DNSProtocolEndpoint_hostname_feature", "_UI_DNSProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getDNSProtocolEndpoint_Hostname(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Register This Connections Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegisterThisConnectionsAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DNSProtocolEndpoint_registerThisConnectionsAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DNSProtocolEndpoint_registerThisConnectionsAddress_feature", "_UI_DNSProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getDNSProtocolEndpoint_RegisterThisConnectionsAddress(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Suffix When Registering feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseSuffixWhenRegisteringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DNSProtocolEndpoint_useSuffixWhenRegistering_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DNSProtocolEndpoint_useSuffixWhenRegistering_feature", "_UI_DNSProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getDNSProtocolEndpoint_UseSuffixWhenRegistering(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DHCP Options To Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDHCPOptionsToUsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DNSProtocolEndpoint_DHCPOptionsToUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DNSProtocolEndpoint_DHCPOptionsToUse_feature", "_UI_DNSProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getDNSProtocolEndpoint_DHCPOptionsToUse(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DNS Suffixes To Append feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDNSSuffixesToAppendPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DNSProtocolEndpoint_DNSSuffixesToAppend_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DNSProtocolEndpoint_DNSSuffixesToAppend_feature", "_UI_DNSProtocolEndpoint_type"),
				 CimPackage.eINSTANCE.getDNSProtocolEndpoint_DNSSuffixesToAppend(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DNSProtocolEndpoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DNSProtocolEndpoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DNSProtocolEndpoint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DNSProtocolEndpoint_type") :
			getString("_UI_DNSProtocolEndpoint_type") + " " + label;
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

		switch (notification.getFeatureID(DNSProtocolEndpoint.class)) {
			case CimPackage.DNS_PROTOCOL_ENDPOINT__APPEND_PARENT_SUFFIXES:
			case CimPackage.DNS_PROTOCOL_ENDPOINT__APPEND_PRIMARY_SUFFIXES:
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DOMAIN_NAME:
			case CimPackage.DNS_PROTOCOL_ENDPOINT__HOSTNAME:
			case CimPackage.DNS_PROTOCOL_ENDPOINT__REGISTER_THIS_CONNECTIONS_ADDRESS:
			case CimPackage.DNS_PROTOCOL_ENDPOINT__USE_SUFFIX_WHEN_REGISTERING:
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DHCP_OPTIONS_TO_USE:
			case CimPackage.DNS_PROTOCOL_ENDPOINT__DNS_SUFFIXES_TO_APPEND:
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
