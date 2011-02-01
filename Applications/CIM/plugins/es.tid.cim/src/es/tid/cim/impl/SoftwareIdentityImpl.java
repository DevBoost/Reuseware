/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import es.tid.cim.CimPackage;
import es.tid.cim.ElementSoftwareIdentity;
import es.tid.cim.EnumExtendedResourceType;
import es.tid.cim.EnumTargetOSTypes;
import es.tid.cim.SoftwareIdentity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getBuildNumber <em>Build Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getElementSoftwareIdentity <em>Element Software Identity</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getExtendedResourceType <em>Extended Resource Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#isIsEntity <em>Is Entity</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getMinExtendedResourceTypeBuildNumber <em>Min Extended Resource Type Build Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getMinExtendedResourceTypeMajorVersion <em>Min Extended Resource Type Major Version</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getMinExtendedResourceTypeMinorVersion <em>Min Extended Resource Type Minor Version</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getMinExtendedResourceTypeRevisionNumber <em>Min Extended Resource Type Revision Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getOtherExtendedResourceTypeDescription <em>Other Extended Resource Type Description</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getVersionString <em>Version String</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getClassificationDescriptions <em>Classification Descriptions</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getIdentityInfoType <em>Identity Info Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getIdentityInfoValue <em>Identity Info Value</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getTargetOperatingSystems <em>Target Operating Systems</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getTargetOSTypes <em>Target OS Types</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareIdentityImpl#getTargetTypes <em>Target Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareIdentityImpl extends LogicalElementImpl implements SoftwareIdentity {
	/**
	 * The default value of the '{@link #getBuildNumber() <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int BUILD_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBuildNumber() <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected int buildNumber = BUILD_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementSoftwareIdentity() <em>Element Software Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSoftwareIdentity()
	 * @generated
	 * @ordered
	 */
	protected ElementSoftwareIdentity elementSoftwareIdentity;

	/**
	 * The default value of the '{@link #getExtendedResourceType() <em>Extended Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumExtendedResourceType EXTENDED_RESOURCE_TYPE_EDEFAULT = EnumExtendedResourceType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getExtendedResourceType() <em>Extended Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedResourceType()
	 * @generated
	 * @ordered
	 */
	protected EnumExtendedResourceType extendedResourceType = EXTENDED_RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String instanceID = INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEntity() <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEntity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENTITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEntity() <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEntity()
	 * @generated
	 * @ordered
	 */
	protected boolean isEntity = IS_ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int MAJOR_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMajorVersion() <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected int majorVersion = MAJOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinExtendedResourceTypeBuildNumber() <em>Min Extended Resource Type Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinExtendedResourceTypeBuildNumber() <em>Min Extended Resource Type Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected int minExtendedResourceTypeBuildNumber = MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinExtendedResourceTypeMajorVersion() <em>Min Extended Resource Type Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinExtendedResourceTypeMajorVersion() <em>Min Extended Resource Type Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected int minExtendedResourceTypeMajorVersion = MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinExtendedResourceTypeMinorVersion() <em>Min Extended Resource Type Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinExtendedResourceTypeMinorVersion() <em>Min Extended Resource Type Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected int minExtendedResourceTypeMinorVersion = MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinExtendedResourceTypeRevisionNumber() <em>Min Extended Resource Type Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinExtendedResourceTypeRevisionNumber() <em>Min Extended Resource Type Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExtendedResourceTypeRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected int minExtendedResourceTypeRevisionNumber = MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int MINOR_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinorVersion() <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected int minorVersion = MINOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherExtendedResourceTypeDescription() <em>Other Extended Resource Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherExtendedResourceTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherExtendedResourceTypeDescription() <em>Other Extended Resource Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherExtendedResourceTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherExtendedResourceTypeDescription = OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected Date releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int REVISION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected int revisionNumber = REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionString() <em>Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionString()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionString() <em>Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionString()
	 * @generated
	 * @ordered
	 */
	protected String versionString = VERSION_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassificationDescriptions() <em>Classification Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classificationDescriptions;

	/**
	 * The cached value of the '{@link #getIdentityInfoType() <em>Identity Info Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityInfoType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identityInfoType;

	/**
	 * The cached value of the '{@link #getIdentityInfoValue() <em>Identity Info Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityInfoValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identityInfoValue;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> languages;

	/**
	 * The cached value of the '{@link #getTargetOperatingSystems() <em>Target Operating Systems</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperatingSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> targetOperatingSystems;

	/**
	 * The cached value of the '{@link #getTargetOSTypes() <em>Target OS Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOSTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumTargetOSTypes> targetOSTypes;

	/**
	 * The cached value of the '{@link #getTargetTypes() <em>Target Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> targetTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareIdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getSoftwareIdentity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBuildNumber() {
		return buildNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildNumber(int newBuildNumber) {
		int oldBuildNumber = buildNumber;
		buildNumber = newBuildNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__BUILD_NUMBER, oldBuildNumber, buildNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementSoftwareIdentity getElementSoftwareIdentity() {
		if (elementSoftwareIdentity != null && elementSoftwareIdentity.eIsProxy()) {
			InternalEObject oldElementSoftwareIdentity = (InternalEObject)elementSoftwareIdentity;
			elementSoftwareIdentity = (ElementSoftwareIdentity)eResolveProxy(oldElementSoftwareIdentity);
			if (elementSoftwareIdentity != oldElementSoftwareIdentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_IDENTITY, oldElementSoftwareIdentity, elementSoftwareIdentity));
			}
		}
		return elementSoftwareIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementSoftwareIdentity basicGetElementSoftwareIdentity() {
		return elementSoftwareIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementSoftwareIdentity(ElementSoftwareIdentity newElementSoftwareIdentity) {
		ElementSoftwareIdentity oldElementSoftwareIdentity = elementSoftwareIdentity;
		elementSoftwareIdentity = newElementSoftwareIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_IDENTITY, oldElementSoftwareIdentity, elementSoftwareIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumExtendedResourceType getExtendedResourceType() {
		return extendedResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedResourceType(EnumExtendedResourceType newExtendedResourceType) {
		EnumExtendedResourceType oldExtendedResourceType = extendedResourceType;
		extendedResourceType = newExtendedResourceType == null ? EXTENDED_RESOURCE_TYPE_EDEFAULT : newExtendedResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__EXTENDED_RESOURCE_TYPE, oldExtendedResourceType, extendedResourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceID() {
		return instanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceID(String newInstanceID) {
		String oldInstanceID = instanceID;
		instanceID = newInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__INSTANCE_ID, oldInstanceID, instanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEntity() {
		return isEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEntity(boolean newIsEntity) {
		boolean oldIsEntity = isEntity;
		isEntity = newIsEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__IS_ENTITY, oldIsEntity, isEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMajorVersion() {
		return majorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajorVersion(int newMajorVersion) {
		int oldMajorVersion = majorVersion;
		majorVersion = newMajorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__MAJOR_VERSION, oldMajorVersion, majorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinExtendedResourceTypeBuildNumber() {
		return minExtendedResourceTypeBuildNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinExtendedResourceTypeBuildNumber(int newMinExtendedResourceTypeBuildNumber) {
		int oldMinExtendedResourceTypeBuildNumber = minExtendedResourceTypeBuildNumber;
		minExtendedResourceTypeBuildNumber = newMinExtendedResourceTypeBuildNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER, oldMinExtendedResourceTypeBuildNumber, minExtendedResourceTypeBuildNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinExtendedResourceTypeMajorVersion() {
		return minExtendedResourceTypeMajorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinExtendedResourceTypeMajorVersion(int newMinExtendedResourceTypeMajorVersion) {
		int oldMinExtendedResourceTypeMajorVersion = minExtendedResourceTypeMajorVersion;
		minExtendedResourceTypeMajorVersion = newMinExtendedResourceTypeMajorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION, oldMinExtendedResourceTypeMajorVersion, minExtendedResourceTypeMajorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinExtendedResourceTypeMinorVersion() {
		return minExtendedResourceTypeMinorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinExtendedResourceTypeMinorVersion(int newMinExtendedResourceTypeMinorVersion) {
		int oldMinExtendedResourceTypeMinorVersion = minExtendedResourceTypeMinorVersion;
		minExtendedResourceTypeMinorVersion = newMinExtendedResourceTypeMinorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION, oldMinExtendedResourceTypeMinorVersion, minExtendedResourceTypeMinorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinExtendedResourceTypeRevisionNumber() {
		return minExtendedResourceTypeRevisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinExtendedResourceTypeRevisionNumber(int newMinExtendedResourceTypeRevisionNumber) {
		int oldMinExtendedResourceTypeRevisionNumber = minExtendedResourceTypeRevisionNumber;
		minExtendedResourceTypeRevisionNumber = newMinExtendedResourceTypeRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER, oldMinExtendedResourceTypeRevisionNumber, minExtendedResourceTypeRevisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinorVersion() {
		return minorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinorVersion(int newMinorVersion) {
		int oldMinorVersion = minorVersion;
		minorVersion = newMinorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__MINOR_VERSION, oldMinorVersion, minorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherExtendedResourceTypeDescription() {
		return otherExtendedResourceTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherExtendedResourceTypeDescription(String newOtherExtendedResourceTypeDescription) {
		String oldOtherExtendedResourceTypeDescription = otherExtendedResourceTypeDescription;
		otherExtendedResourceTypeDescription = newOtherExtendedResourceTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION, oldOtherExtendedResourceTypeDescription, otherExtendedResourceTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseDate(Date newReleaseDate) {
		Date oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__RELEASE_DATE, oldReleaseDate, releaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRevisionNumber() {
		return revisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionNumber(int newRevisionNumber) {
		int oldRevisionNumber = revisionNumber;
		revisionNumber = newRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__REVISION_NUMBER, oldRevisionNumber, revisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionString() {
		return versionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionString(String newVersionString) {
		String oldVersionString = versionString;
		versionString = newVersionString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_IDENTITY__VERSION_STRING, oldVersionString, versionString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClassificationDescriptions() {
		if (classificationDescriptions == null) {
			classificationDescriptions = new EDataTypeUniqueEList<String>(String.class, this, CimPackage.SOFTWARE_IDENTITY__CLASSIFICATION_DESCRIPTIONS);
		}
		return classificationDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIdentityInfoType() {
		if (identityInfoType == null) {
			identityInfoType = new EDataTypeUniqueEList<String>(String.class, this, CimPackage.SOFTWARE_IDENTITY__IDENTITY_INFO_TYPE);
		}
		return identityInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIdentityInfoValue() {
		if (identityInfoValue == null) {
			identityInfoValue = new EDataTypeUniqueEList<String>(String.class, this, CimPackage.SOFTWARE_IDENTITY__IDENTITY_INFO_VALUE);
		}
		return identityInfoValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguages() {
		if (languages == null) {
			languages = new EDataTypeUniqueEList<String>(String.class, this, CimPackage.SOFTWARE_IDENTITY__LANGUAGES);
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTargetOperatingSystems() {
		if (targetOperatingSystems == null) {
			targetOperatingSystems = new EDataTypeUniqueEList<String>(String.class, this, CimPackage.SOFTWARE_IDENTITY__TARGET_OPERATING_SYSTEMS);
		}
		return targetOperatingSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumTargetOSTypes> getTargetOSTypes() {
		if (targetOSTypes == null) {
			targetOSTypes = new EDataTypeUniqueEList<EnumTargetOSTypes>(EnumTargetOSTypes.class, this, CimPackage.SOFTWARE_IDENTITY__TARGET_OS_TYPES);
		}
		return targetOSTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTargetTypes() {
		if (targetTypes == null) {
			targetTypes = new EDataTypeUniqueEList<String>(String.class, this, CimPackage.SOFTWARE_IDENTITY__TARGET_TYPES);
		}
		return targetTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.SOFTWARE_IDENTITY__BUILD_NUMBER:
				return getBuildNumber();
			case CimPackage.SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_IDENTITY:
				if (resolve) return getElementSoftwareIdentity();
				return basicGetElementSoftwareIdentity();
			case CimPackage.SOFTWARE_IDENTITY__EXTENDED_RESOURCE_TYPE:
				return getExtendedResourceType();
			case CimPackage.SOFTWARE_IDENTITY__INSTANCE_ID:
				return getInstanceID();
			case CimPackage.SOFTWARE_IDENTITY__IS_ENTITY:
				return isIsEntity();
			case CimPackage.SOFTWARE_IDENTITY__MAJOR_VERSION:
				return getMajorVersion();
			case CimPackage.SOFTWARE_IDENTITY__MANUFACTURER:
				return getManufacturer();
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER:
				return getMinExtendedResourceTypeBuildNumber();
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION:
				return getMinExtendedResourceTypeMajorVersion();
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION:
				return getMinExtendedResourceTypeMinorVersion();
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER:
				return getMinExtendedResourceTypeRevisionNumber();
			case CimPackage.SOFTWARE_IDENTITY__MINOR_VERSION:
				return getMinorVersion();
			case CimPackage.SOFTWARE_IDENTITY__OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION:
				return getOtherExtendedResourceTypeDescription();
			case CimPackage.SOFTWARE_IDENTITY__RELEASE_DATE:
				return getReleaseDate();
			case CimPackage.SOFTWARE_IDENTITY__REVISION_NUMBER:
				return getRevisionNumber();
			case CimPackage.SOFTWARE_IDENTITY__SERIAL_NUMBER:
				return getSerialNumber();
			case CimPackage.SOFTWARE_IDENTITY__VERSION_STRING:
				return getVersionString();
			case CimPackage.SOFTWARE_IDENTITY__CLASSIFICATION_DESCRIPTIONS:
				return getClassificationDescriptions();
			case CimPackage.SOFTWARE_IDENTITY__IDENTITY_INFO_TYPE:
				return getIdentityInfoType();
			case CimPackage.SOFTWARE_IDENTITY__IDENTITY_INFO_VALUE:
				return getIdentityInfoValue();
			case CimPackage.SOFTWARE_IDENTITY__LANGUAGES:
				return getLanguages();
			case CimPackage.SOFTWARE_IDENTITY__TARGET_OPERATING_SYSTEMS:
				return getTargetOperatingSystems();
			case CimPackage.SOFTWARE_IDENTITY__TARGET_OS_TYPES:
				return getTargetOSTypes();
			case CimPackage.SOFTWARE_IDENTITY__TARGET_TYPES:
				return getTargetTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.SOFTWARE_IDENTITY__BUILD_NUMBER:
				setBuildNumber((Integer)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_IDENTITY:
				setElementSoftwareIdentity((ElementSoftwareIdentity)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__EXTENDED_RESOURCE_TYPE:
				setExtendedResourceType((EnumExtendedResourceType)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__INSTANCE_ID:
				setInstanceID((String)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__IS_ENTITY:
				setIsEntity((Boolean)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MAJOR_VERSION:
				setMajorVersion((Integer)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER:
				setMinExtendedResourceTypeBuildNumber((Integer)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION:
				setMinExtendedResourceTypeMajorVersion((Integer)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION:
				setMinExtendedResourceTypeMinorVersion((Integer)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER:
				setMinExtendedResourceTypeRevisionNumber((Integer)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MINOR_VERSION:
				setMinorVersion((Integer)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION:
				setOtherExtendedResourceTypeDescription((String)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__RELEASE_DATE:
				setReleaseDate((Date)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__REVISION_NUMBER:
				setRevisionNumber((Integer)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__VERSION_STRING:
				setVersionString((String)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__CLASSIFICATION_DESCRIPTIONS:
				getClassificationDescriptions().clear();
				getClassificationDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__IDENTITY_INFO_TYPE:
				getIdentityInfoType().clear();
				getIdentityInfoType().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__IDENTITY_INFO_VALUE:
				getIdentityInfoValue().clear();
				getIdentityInfoValue().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__TARGET_OPERATING_SYSTEMS:
				getTargetOperatingSystems().clear();
				getTargetOperatingSystems().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__TARGET_OS_TYPES:
				getTargetOSTypes().clear();
				getTargetOSTypes().addAll((Collection<? extends EnumTargetOSTypes>)newValue);
				return;
			case CimPackage.SOFTWARE_IDENTITY__TARGET_TYPES:
				getTargetTypes().clear();
				getTargetTypes().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.SOFTWARE_IDENTITY__BUILD_NUMBER:
				setBuildNumber(BUILD_NUMBER_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_IDENTITY:
				setElementSoftwareIdentity((ElementSoftwareIdentity)null);
				return;
			case CimPackage.SOFTWARE_IDENTITY__EXTENDED_RESOURCE_TYPE:
				setExtendedResourceType(EXTENDED_RESOURCE_TYPE_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__INSTANCE_ID:
				setInstanceID(INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__IS_ENTITY:
				setIsEntity(IS_ENTITY_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MAJOR_VERSION:
				setMajorVersion(MAJOR_VERSION_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER:
				setMinExtendedResourceTypeBuildNumber(MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION:
				setMinExtendedResourceTypeMajorVersion(MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION:
				setMinExtendedResourceTypeMinorVersion(MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER:
				setMinExtendedResourceTypeRevisionNumber(MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__MINOR_VERSION:
				setMinorVersion(MINOR_VERSION_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION:
				setOtherExtendedResourceTypeDescription(OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__REVISION_NUMBER:
				setRevisionNumber(REVISION_NUMBER_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__VERSION_STRING:
				setVersionString(VERSION_STRING_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_IDENTITY__CLASSIFICATION_DESCRIPTIONS:
				getClassificationDescriptions().clear();
				return;
			case CimPackage.SOFTWARE_IDENTITY__IDENTITY_INFO_TYPE:
				getIdentityInfoType().clear();
				return;
			case CimPackage.SOFTWARE_IDENTITY__IDENTITY_INFO_VALUE:
				getIdentityInfoValue().clear();
				return;
			case CimPackage.SOFTWARE_IDENTITY__LANGUAGES:
				getLanguages().clear();
				return;
			case CimPackage.SOFTWARE_IDENTITY__TARGET_OPERATING_SYSTEMS:
				getTargetOperatingSystems().clear();
				return;
			case CimPackage.SOFTWARE_IDENTITY__TARGET_OS_TYPES:
				getTargetOSTypes().clear();
				return;
			case CimPackage.SOFTWARE_IDENTITY__TARGET_TYPES:
				getTargetTypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.SOFTWARE_IDENTITY__BUILD_NUMBER:
				return buildNumber != BUILD_NUMBER_EDEFAULT;
			case CimPackage.SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_IDENTITY:
				return elementSoftwareIdentity != null;
			case CimPackage.SOFTWARE_IDENTITY__EXTENDED_RESOURCE_TYPE:
				return extendedResourceType != EXTENDED_RESOURCE_TYPE_EDEFAULT;
			case CimPackage.SOFTWARE_IDENTITY__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceID != null : !INSTANCE_ID_EDEFAULT.equals(instanceID);
			case CimPackage.SOFTWARE_IDENTITY__IS_ENTITY:
				return isEntity != IS_ENTITY_EDEFAULT;
			case CimPackage.SOFTWARE_IDENTITY__MAJOR_VERSION:
				return majorVersion != MAJOR_VERSION_EDEFAULT;
			case CimPackage.SOFTWARE_IDENTITY__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER:
				return minExtendedResourceTypeBuildNumber != MIN_EXTENDED_RESOURCE_TYPE_BUILD_NUMBER_EDEFAULT;
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION:
				return minExtendedResourceTypeMajorVersion != MIN_EXTENDED_RESOURCE_TYPE_MAJOR_VERSION_EDEFAULT;
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION:
				return minExtendedResourceTypeMinorVersion != MIN_EXTENDED_RESOURCE_TYPE_MINOR_VERSION_EDEFAULT;
			case CimPackage.SOFTWARE_IDENTITY__MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER:
				return minExtendedResourceTypeRevisionNumber != MIN_EXTENDED_RESOURCE_TYPE_REVISION_NUMBER_EDEFAULT;
			case CimPackage.SOFTWARE_IDENTITY__MINOR_VERSION:
				return minorVersion != MINOR_VERSION_EDEFAULT;
			case CimPackage.SOFTWARE_IDENTITY__OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION:
				return OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION_EDEFAULT == null ? otherExtendedResourceTypeDescription != null : !OTHER_EXTENDED_RESOURCE_TYPE_DESCRIPTION_EDEFAULT.equals(otherExtendedResourceTypeDescription);
			case CimPackage.SOFTWARE_IDENTITY__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? releaseDate != null : !RELEASE_DATE_EDEFAULT.equals(releaseDate);
			case CimPackage.SOFTWARE_IDENTITY__REVISION_NUMBER:
				return revisionNumber != REVISION_NUMBER_EDEFAULT;
			case CimPackage.SOFTWARE_IDENTITY__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case CimPackage.SOFTWARE_IDENTITY__VERSION_STRING:
				return VERSION_STRING_EDEFAULT == null ? versionString != null : !VERSION_STRING_EDEFAULT.equals(versionString);
			case CimPackage.SOFTWARE_IDENTITY__CLASSIFICATION_DESCRIPTIONS:
				return classificationDescriptions != null && !classificationDescriptions.isEmpty();
			case CimPackage.SOFTWARE_IDENTITY__IDENTITY_INFO_TYPE:
				return identityInfoType != null && !identityInfoType.isEmpty();
			case CimPackage.SOFTWARE_IDENTITY__IDENTITY_INFO_VALUE:
				return identityInfoValue != null && !identityInfoValue.isEmpty();
			case CimPackage.SOFTWARE_IDENTITY__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case CimPackage.SOFTWARE_IDENTITY__TARGET_OPERATING_SYSTEMS:
				return targetOperatingSystems != null && !targetOperatingSystems.isEmpty();
			case CimPackage.SOFTWARE_IDENTITY__TARGET_OS_TYPES:
				return targetOSTypes != null && !targetOSTypes.isEmpty();
			case CimPackage.SOFTWARE_IDENTITY__TARGET_TYPES:
				return targetTypes != null && !targetTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (buildNumber: ");
		result.append(buildNumber);
		result.append(", extendedResourceType: ");
		result.append(extendedResourceType);
		result.append(", instanceID: ");
		result.append(instanceID);
		result.append(", isEntity: ");
		result.append(isEntity);
		result.append(", majorVersion: ");
		result.append(majorVersion);
		result.append(", manufacturer: ");
		result.append(manufacturer);
		result.append(", minExtendedResourceTypeBuildNumber: ");
		result.append(minExtendedResourceTypeBuildNumber);
		result.append(", minExtendedResourceTypeMajorVersion: ");
		result.append(minExtendedResourceTypeMajorVersion);
		result.append(", minExtendedResourceTypeMinorVersion: ");
		result.append(minExtendedResourceTypeMinorVersion);
		result.append(", minExtendedResourceTypeRevisionNumber: ");
		result.append(minExtendedResourceTypeRevisionNumber);
		result.append(", minorVersion: ");
		result.append(minorVersion);
		result.append(", otherExtendedResourceTypeDescription: ");
		result.append(otherExtendedResourceTypeDescription);
		result.append(", releaseDate: ");
		result.append(releaseDate);
		result.append(", revisionNumber: ");
		result.append(revisionNumber);
		result.append(", serialNumber: ");
		result.append(serialNumber);
		result.append(", versionString: ");
		result.append(versionString);
		result.append(", classificationDescriptions: ");
		result.append(classificationDescriptions);
		result.append(", identityInfoType: ");
		result.append(identityInfoType);
		result.append(", identityInfoValue: ");
		result.append(identityInfoValue);
		result.append(", languages: ");
		result.append(languages);
		result.append(", targetOperatingSystems: ");
		result.append(targetOperatingSystems);
		result.append(", targetOSTypes: ");
		result.append(targetOSTypes);
		result.append(", targetTypes: ");
		result.append(targetTypes);
		result.append(')');
		return result.toString();
	}

} //SoftwareIdentityImpl
