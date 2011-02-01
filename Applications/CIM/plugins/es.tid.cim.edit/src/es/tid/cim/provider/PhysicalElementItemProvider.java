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
import es.tid.cim.PhysicalElement;

/**
 * This is the item provider adapter for a {@link es.tid.cim.PhysicalElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalElementItemProvider
	extends ManagedSystemElementItemProvider
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
	public PhysicalElementItemProvider(AdapterFactory adapterFactory) {
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

			addTagPropertyDescriptor(object);
			addCreationclassNamePropertyDescriptor(object);
			addManufacturerPropertyDescriptor(object);
			addModelPropertyDescriptor(object);
			addSKUPropertyDescriptor(object);
			addSerialNumberPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addPartNoPropertyDescriptor(object);
			addOtherIdentiyingInfoPropertyDescriptor(object);
			addPoweredOnPropertyDescriptor(object);
			addManufactureDatePropertyDescriptor(object);
			addVendorEquipmentTypePropertyDescriptor(object);
			addUserTrackingPropertyDescriptor(object);
			addCanBeFRUedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_tag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_tag_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_Tag(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creationclass Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationclassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_creationclassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_creationclassName_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_CreationclassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Manufacturer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManufacturerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_manufacturer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_manufacturer_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_Manufacturer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_model_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_Model(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SKU feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSKUPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_SKU_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_SKU_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_SKU(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Serial Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSerialNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_serialNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_serialNumber_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_SerialNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_version_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_Version(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Part No feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartNoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_partNo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_partNo_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_PartNo(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Identiying Info feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherIdentiyingInfoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_otherIdentiyingInfo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_otherIdentiyingInfo_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_OtherIdentiyingInfo(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Powered On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPoweredOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_poweredOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_poweredOn_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_PoweredOn(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Manufacture Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManufactureDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_manufactureDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_manufactureDate_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_ManufactureDate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vendor Equipment Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVendorEquipmentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_vendorEquipmentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_vendorEquipmentType_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_VendorEquipmentType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Tracking feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserTrackingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_userTracking_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_userTracking_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_UserTracking(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Be FR Ued feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanBeFRUedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalElement_canBeFRUed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalElement_canBeFRUed_feature", "_UI_PhysicalElement_type"),
				 CimPackage.eINSTANCE.getPhysicalElement_CanBeFRUed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
		String label = ((PhysicalElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PhysicalElement_type") :
			getString("_UI_PhysicalElement_type") + " " + label;
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

		switch (notification.getFeatureID(PhysicalElement.class)) {
			case CimPackage.PHYSICAL_ELEMENT__TAG:
			case CimPackage.PHYSICAL_ELEMENT__CREATIONCLASS_NAME:
			case CimPackage.PHYSICAL_ELEMENT__MANUFACTURER:
			case CimPackage.PHYSICAL_ELEMENT__MODEL:
			case CimPackage.PHYSICAL_ELEMENT__SKU:
			case CimPackage.PHYSICAL_ELEMENT__SERIAL_NUMBER:
			case CimPackage.PHYSICAL_ELEMENT__VERSION:
			case CimPackage.PHYSICAL_ELEMENT__PART_NO:
			case CimPackage.PHYSICAL_ELEMENT__OTHER_IDENTIYING_INFO:
			case CimPackage.PHYSICAL_ELEMENT__POWERED_ON:
			case CimPackage.PHYSICAL_ELEMENT__MANUFACTURE_DATE:
			case CimPackage.PHYSICAL_ELEMENT__VENDOR_EQUIPMENT_TYPE:
			case CimPackage.PHYSICAL_ELEMENT__USER_TRACKING:
			case CimPackage.PHYSICAL_ELEMENT__CAN_BE_FR_UED:
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
