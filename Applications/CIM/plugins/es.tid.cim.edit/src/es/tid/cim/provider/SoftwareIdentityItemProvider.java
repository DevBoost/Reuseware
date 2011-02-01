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
import es.tid.cim.SoftwareIdentity;

/**
 * This is the item provider adapter for a {@link es.tid.cim.SoftwareIdentity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareIdentityItemProvider
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
	public SoftwareIdentityItemProvider(AdapterFactory adapterFactory) {
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

			addBuildNumberPropertyDescriptor(object);
			addElementSoftwareIdentityPropertyDescriptor(object);
			addExtendedResourceTypePropertyDescriptor(object);
			addInstanceIDPropertyDescriptor(object);
			addIsEntityPropertyDescriptor(object);
			addMajorVersionPropertyDescriptor(object);
			addManufacturerPropertyDescriptor(object);
			addMinExtendedResourceTypeBuildNumberPropertyDescriptor(object);
			addMinExtendedResourceTypeMajorVersionPropertyDescriptor(object);
			addMinExtendedResourceTypeMinorVersionPropertyDescriptor(object);
			addMinExtendedResourceTypeRevisionNumberPropertyDescriptor(object);
			addMinorVersionPropertyDescriptor(object);
			addOtherExtendedResourceTypeDescriptionPropertyDescriptor(object);
			addReleaseDatePropertyDescriptor(object);
			addRevisionNumberPropertyDescriptor(object);
			addSerialNumberPropertyDescriptor(object);
			addVersionStringPropertyDescriptor(object);
			addClassificationDescriptionsPropertyDescriptor(object);
			addIdentityInfoTypePropertyDescriptor(object);
			addIdentityInfoValuePropertyDescriptor(object);
			addLanguagesPropertyDescriptor(object);
			addTargetOperatingSystemsPropertyDescriptor(object);
			addTargetOSTypesPropertyDescriptor(object);
			addTargetTypesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_SoftwareIdentity_buildNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_buildNumber_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_BuildNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Software Identity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementSoftwareIdentityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_elementSoftwareIdentity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_elementSoftwareIdentity_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_ElementSoftwareIdentity(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extended Resource Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedResourceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_extendedResourceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_extendedResourceType_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_ExtendedResourceType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_instanceID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_instanceID_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_InstanceID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_isEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_isEntity_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_IsEntity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Major Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMajorVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_majorVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_majorVersion_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_MajorVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_SoftwareIdentity_manufacturer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_manufacturer_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_Manufacturer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Extended Resource Type Build Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinExtendedResourceTypeBuildNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_minExtendedResourceTypeBuildNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_minExtendedResourceTypeBuildNumber_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_MinExtendedResourceTypeBuildNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Extended Resource Type Major Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinExtendedResourceTypeMajorVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_minExtendedResourceTypeMajorVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_minExtendedResourceTypeMajorVersion_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_MinExtendedResourceTypeMajorVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Extended Resource Type Minor Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinExtendedResourceTypeMinorVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_minExtendedResourceTypeMinorVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_minExtendedResourceTypeMinorVersion_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_MinExtendedResourceTypeMinorVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Extended Resource Type Revision Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinExtendedResourceTypeRevisionNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_minExtendedResourceTypeRevisionNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_minExtendedResourceTypeRevisionNumber_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_MinExtendedResourceTypeRevisionNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minor Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinorVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_minorVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_minorVersion_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_MinorVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Extended Resource Type Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherExtendedResourceTypeDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_otherExtendedResourceTypeDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_otherExtendedResourceTypeDescription_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_OtherExtendedResourceTypeDescription(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Release Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReleaseDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_releaseDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_releaseDate_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_ReleaseDate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Revision Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevisionNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_revisionNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_revisionNumber_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_RevisionNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_SoftwareIdentity_serialNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_serialNumber_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_SerialNumber(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_versionString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_versionString_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_VersionString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classification Descriptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassificationDescriptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_classificationDescriptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_classificationDescriptions_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_ClassificationDescriptions(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Identity Info Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentityInfoTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_identityInfoType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_identityInfoType_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_IdentityInfoType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Identity Info Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentityInfoValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_identityInfoValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_identityInfoValue_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_IdentityInfoValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Languages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_languages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_languages_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_Languages(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Operating Systems feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetOperatingSystemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_targetOperatingSystems_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_targetOperatingSystems_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_TargetOperatingSystems(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target OS Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetOSTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_targetOSTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_targetOSTypes_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_TargetOSTypes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareIdentity_targetTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareIdentity_targetTypes_feature", "_UI_SoftwareIdentity_type"),
				 CimPackage.eINSTANCE.getSoftwareIdentity_TargetTypes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SoftwareIdentity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoftwareIdentity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SoftwareIdentity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SoftwareIdentity_type") :
			getString("_UI_SoftwareIdentity_type") + " " + label;
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

		switch (notification.getFeatureID(SoftwareIdentity.class)) {
			case CimPackage.SOFTWARE_IDENTITY__BUILD_NUMBER:
			case CimPackage.SOFTWARE_IDENTITY__EXTENDED_RESOURCE_TYPE:
			case CimPackage.SOFTWARE_IDENTITY__INSTANCE_ID:
			case CimPackage.SOFTWARE_IDENTITY__IS_ENTITY:
			case CimPackage.SOFTWARE_IDENTITY__MAJOR_VERSION:
			case CimPackage.SOFTWARE_IDENTITY__MANUFACTURER:
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER:
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION:
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION:
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER:
			case CimPackage.SOFTWARE_IDENTITY__MINOR_VERSION:
			case CimPackage.SOFTWARE_IDENTITY__OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION:
			case CimPackage.SOFTWARE_IDENTITY__RELEASE_DATE:
			case CimPackage.SOFTWARE_IDENTITY__REVISION_NUMBER:
			case CimPackage.SOFTWARE_IDENTITY__SERIAL_NUMBER:
			case CimPackage.SOFTWARE_IDENTITY__VERSION_STRING:
			case CimPackage.SOFTWARE_IDENTITY__CLASSIFICATION_DESCRIPTIONS:
			case CimPackage.SOFTWARE_IDENTITY__IDENTITY_INFO_TYPE:
			case CimPackage.SOFTWARE_IDENTITY__IDENTITY_INFO_VALUE:
			case CimPackage.SOFTWARE_IDENTITY__LANGUAGES:
			case CimPackage.SOFTWARE_IDENTITY__TARGET_OPERATING_SYSTEMS:
			case CimPackage.SOFTWARE_IDENTITY__TARGET_OS_TYPES:
			case CimPackage.SOFTWARE_IDENTITY__TARGET_TYPES:
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
