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
import es.tid.cim.OSPFProtocolEndpointBase;

/**
 * This is the item provider adapter for a {@link es.tid.cim.OSPFProtocolEndpointBase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OSPFProtocolEndpointBaseItemProvider
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
	public OSPFProtocolEndpointBaseItemProvider(AdapterFactory adapterFactory) {
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

			addTransitDelayPropertyDescriptor(object);
			addRetransmitIntervalPropertyDescriptor(object);
			addAuthTypePropertyDescriptor(object);
			addOtherAuthTypePropertyDescriptor(object);
			addAuthKeyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Transit Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OSPFProtocolEndpointBase_transitDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OSPFProtocolEndpointBase_transitDelay_feature", "_UI_OSPFProtocolEndpointBase_type"),
				 CimPackage.eINSTANCE.getOSPFProtocolEndpointBase_TransitDelay(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Retransmit Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetransmitIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OSPFProtocolEndpointBase_retransmitInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OSPFProtocolEndpointBase_retransmitInterval_feature", "_UI_OSPFProtocolEndpointBase_type"),
				 CimPackage.eINSTANCE.getOSPFProtocolEndpointBase_RetransmitInterval(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auth Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OSPFProtocolEndpointBase_authType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OSPFProtocolEndpointBase_authType_feature", "_UI_OSPFProtocolEndpointBase_type"),
				 CimPackage.eINSTANCE.getOSPFProtocolEndpointBase_AuthType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Auth Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherAuthTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OSPFProtocolEndpointBase_otherAuthType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OSPFProtocolEndpointBase_otherAuthType_feature", "_UI_OSPFProtocolEndpointBase_type"),
				 CimPackage.eINSTANCE.getOSPFProtocolEndpointBase_OtherAuthType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auth Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OSPFProtocolEndpointBase_authKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OSPFProtocolEndpointBase_authKey_feature", "_UI_OSPFProtocolEndpointBase_type"),
				 CimPackage.eINSTANCE.getOSPFProtocolEndpointBase_AuthKey(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns OSPFProtocolEndpointBase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OSPFProtocolEndpointBase"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OSPFProtocolEndpointBase)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OSPFProtocolEndpointBase_type") :
			getString("_UI_OSPFProtocolEndpointBase_type") + " " + label;
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

		switch (notification.getFeatureID(OSPFProtocolEndpointBase.class)) {
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__TRANSIT_DELAY:
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__RETRANSMIT_INTERVAL:
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_TYPE:
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__OTHER_AUTH_TYPE:
			case CimPackage.OSPF_PROTOCOL_ENDPOINT_BASE__AUTH_KEY:
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
