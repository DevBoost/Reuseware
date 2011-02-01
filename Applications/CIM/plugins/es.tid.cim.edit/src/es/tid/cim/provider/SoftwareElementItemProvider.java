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
import es.tid.cim.SoftwareElement;

/**
 * This is the item provider adapter for a {@link es.tid.cim.SoftwareElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareElementItemProvider
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
	public SoftwareElementItemProvider(AdapterFactory adapterFactory) {
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

			addSoftwareElementChecksPropertyDescriptor(object);
			addSoftwareElementActionsPropertyDescriptor(object);
			addBuildNumberPropertyDescriptor(object);
			addCodeSetPropertyDescriptor(object);
			addIdentificationCodePropertyDescriptor(object);
			addLanguageEditionPropertyDescriptor(object);
			addManufacturerPropertyDescriptor(object);
			addOtherTargetOSPropertyDescriptor(object);
			addSerialNumberPropertyDescriptor(object);
			addSoftwareElementIDPropertyDescriptor(object);
			addSoftwareElementStatePropertyDescriptor(object);
			addTargetOperatingSystemPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Software Element Checks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoftwareElementChecksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareElement_softwareElementChecks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_softwareElementChecks_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_SoftwareElementChecks(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Software Element Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoftwareElementActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareElement_softwareElementActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_softwareElementActions_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_SoftwareElementActions(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Build Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuildNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareElement_buildNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_buildNumber_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_BuildNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Code Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodeSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareElement_codeSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_codeSet_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_CodeSet(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Identification Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentificationCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareElement_identificationCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_identificationCode_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_IdentificationCode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Language Edition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguageEditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareElement_languageEdition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_languageEdition_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_LanguageEdition(),
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
				 getString("_UI_SoftwareElement_manufacturer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_manufacturer_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_Manufacturer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Target OS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherTargetOSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareElement_otherTargetOS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_otherTargetOS_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_OtherTargetOS(),
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
				 getString("_UI_SoftwareElement_serialNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_serialNumber_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_SerialNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Software Element ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoftwareElementIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareElement_softwareElementID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_softwareElementID_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_SoftwareElementID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Software Element State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoftwareElementStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareElement_softwareElementState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_softwareElementState_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_SoftwareElementState(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Operating System feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetOperatingSystemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareElement_targetOperatingSystem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_targetOperatingSystem_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_TargetOperatingSystem(),
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
				 getString("_UI_SoftwareElement_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareElement_version_feature", "_UI_SoftwareElement_type"),
				 CimPackage.eINSTANCE.getSoftwareElement_Version(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SoftwareElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoftwareElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SoftwareElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SoftwareElement_type") :
			getString("_UI_SoftwareElement_type") + " " + label;
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

		switch (notification.getFeatureID(SoftwareElement.class)) {
			case CimPackage.SOFTWARE_ELEMENT__BUILD_NUMBER:
			case CimPackage.SOFTWARE_ELEMENT__CODE_SET:
			case CimPackage.SOFTWARE_ELEMENT__IDENTIFICATION_CODE:
			case CimPackage.SOFTWARE_ELEMENT__LANGUAGE_EDITION:
			case CimPackage.SOFTWARE_ELEMENT__MANUFACTURER:
			case CimPackage.SOFTWARE_ELEMENT__OTHER_TARGET_OS:
			case CimPackage.SOFTWARE_ELEMENT__SERIAL_NUMBER:
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ID:
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_STATE:
			case CimPackage.SOFTWARE_ELEMENT__TARGET_OPERATING_SYSTEM:
			case CimPackage.SOFTWARE_ELEMENT__VERSION:
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
