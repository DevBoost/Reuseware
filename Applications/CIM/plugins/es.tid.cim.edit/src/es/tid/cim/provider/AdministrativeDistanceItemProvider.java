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

import es.tid.cim.AdministrativeDistance;
import es.tid.cim.CimPackage;

/**
 * This is the item provider adapter for a {@link es.tid.cim.AdministrativeDistance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdministrativeDistanceItemProvider
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
	public AdministrativeDistanceItemProvider(AdapterFactory adapterFactory) {
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
			addDirectConnectPropertyDescriptor(object);
			addStaticPropertyDescriptor(object);
			addEBGPPropertyDescriptor(object);
			addEIGRPInternalPropertyDescriptor(object);
			addIGRPPropertyDescriptor(object);
			addOSPFPropertyDescriptor(object);
			addISISPropertyDescriptor(object);
			addRIPPropertyDescriptor(object);
			addEGPPropertyDescriptor(object);
			addIEGRPExternalPropertyDescriptor(object);
			addIBGPPropertyDescriptor(object);
			addBGPLocalPropertyDescriptor(object);
			addUnknownPropertyDescriptor(object);
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
				 getString("_UI_AdministrativeDistance_creationClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_creationClassName_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_CreationClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Direct Connect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectConnectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_directConnect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_directConnect_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_DirectConnect(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Static feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_static_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_static_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_Static(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EBGP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEBGPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_EBGP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_EBGP_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_EBGP(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EIGRP Internal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEIGRPInternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_EIGRPInternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_EIGRPInternal_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_EIGRPInternal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IGRP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIGRPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_IGRP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_IGRP_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_IGRP(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the OSPF feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOSPFPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_OSPF_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_OSPF_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_OSPF(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ISIS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addISISPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_ISIS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_ISIS_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_ISIS(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RIP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRIPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_RIP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_RIP_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_RIP(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EGP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEGPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_EGP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_EGP_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_EGP(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IEGRP External feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIEGRPExternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_IEGRPExternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_IEGRPExternal_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_IEGRPExternal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IBGP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIBGPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_IBGP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_IBGP_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_IBGP(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the BGP Local feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBGPLocalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_BGPLocal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_BGPLocal_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_BGPLocal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unknown feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnknownPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AdministrativeDistance_unknown_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AdministrativeDistance_unknown_feature", "_UI_AdministrativeDistance_type"),
				 CimPackage.eINSTANCE.getAdministrativeDistance_Unknown(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AdministrativeDistance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AdministrativeDistance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AdministrativeDistance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AdministrativeDistance_type") :
			getString("_UI_AdministrativeDistance_type") + " " + label;
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

		switch (notification.getFeatureID(AdministrativeDistance.class)) {
			case CimPackage.ADMINISTRATIVE_DISTANCE__CREATION_CLASS_NAME:
			case CimPackage.ADMINISTRATIVE_DISTANCE__DIRECT_CONNECT:
			case CimPackage.ADMINISTRATIVE_DISTANCE__STATIC:
			case CimPackage.ADMINISTRATIVE_DISTANCE__EBGP:
			case CimPackage.ADMINISTRATIVE_DISTANCE__EIGRP_INTERNAL:
			case CimPackage.ADMINISTRATIVE_DISTANCE__IGRP:
			case CimPackage.ADMINISTRATIVE_DISTANCE__OSPF:
			case CimPackage.ADMINISTRATIVE_DISTANCE__ISIS:
			case CimPackage.ADMINISTRATIVE_DISTANCE__RIP:
			case CimPackage.ADMINISTRATIVE_DISTANCE__EGP:
			case CimPackage.ADMINISTRATIVE_DISTANCE__IEGRP_EXTERNAL:
			case CimPackage.ADMINISTRATIVE_DISTANCE__IBGP:
			case CimPackage.ADMINISTRATIVE_DISTANCE__BGP_LOCAL:
			case CimPackage.ADMINISTRATIVE_DISTANCE__UNKNOWN:
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
