/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.PhysicalElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#getCreationclassName <em>Creationclass Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#getModel <em>Model</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#getSKU <em>SKU</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#getPartNo <em>Part No</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#getOtherIdentiyingInfo <em>Other Identiying Info</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#isPoweredOn <em>Powered On</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#getVendorEquipmentType <em>Vendor Equipment Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#getUserTracking <em>User Tracking</em>}</li>
 *   <li>{@link es.tid.cim.impl.PhysicalElementImpl#isCanBeFRUed <em>Can Be FR Ued</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PhysicalElementImpl extends ManagedSystemElementImpl implements PhysicalElement {
	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationclassName() <em>Creationclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationclassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATIONCLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationclassName() <em>Creationclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationclassName()
	 * @generated
	 * @ordered
	 */
	protected String creationclassName = CREATIONCLASS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSKU() <em>SKU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKU()
	 * @generated
	 * @ordered
	 */
	protected static final String SKU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSKU() <em>SKU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKU()
	 * @generated
	 * @ordered
	 */
	protected String sku = SKU_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartNo() <em>Part No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNo()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartNo() <em>Part No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNo()
	 * @generated
	 * @ordered
	 */
	protected String partNo = PART_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherIdentiyingInfo() <em>Other Identiying Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIdentiyingInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_IDENTIYING_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherIdentiyingInfo() <em>Other Identiying Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIdentiyingInfo()
	 * @generated
	 * @ordered
	 */
	protected String otherIdentiyingInfo = OTHER_IDENTIYING_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #isPoweredOn() <em>Powered On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPoweredOn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POWERED_ON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPoweredOn() <em>Powered On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPoweredOn()
	 * @generated
	 * @ordered
	 */
	protected boolean poweredOn = POWERED_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufactureDate() <em>Manufacture Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufactureDate()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufactureDate() <em>Manufacture Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufactureDate()
	 * @generated
	 * @ordered
	 */
	protected String manufactureDate = MANUFACTURE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorEquipmentType() <em>Vendor Equipment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorEquipmentType()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EQUIPMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorEquipmentType() <em>Vendor Equipment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorEquipmentType()
	 * @generated
	 * @ordered
	 */
	protected String vendorEquipmentType = VENDOR_EQUIPMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserTracking() <em>User Tracking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTracking()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_TRACKING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserTracking() <em>User Tracking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTracking()
	 * @generated
	 * @ordered
	 */
	protected String userTracking = USER_TRACKING_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanBeFRUed() <em>Can Be FR Ued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanBeFRUed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_BE_FR_UED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanBeFRUed() <em>Can Be FR Ued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanBeFRUed()
	 * @generated
	 * @ordered
	 */
	protected boolean canBeFRUed = CAN_BE_FR_UED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getPhysicalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationclassName() {
		return creationclassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationclassName(String newCreationclassName) {
		String oldCreationclassName = creationclassName;
		creationclassName = newCreationclassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__CREATIONCLASS_NAME, oldCreationclassName, creationclassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSKU() {
		return sku;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSKU(String newSKU) {
		String oldSKU = sku;
		sku = newSKU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__SKU, oldSKU, sku));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartNo() {
		return partNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartNo(String newPartNo) {
		String oldPartNo = partNo;
		partNo = newPartNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__PART_NO, oldPartNo, partNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherIdentiyingInfo() {
		return otherIdentiyingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherIdentiyingInfo(String newOtherIdentiyingInfo) {
		String oldOtherIdentiyingInfo = otherIdentiyingInfo;
		otherIdentiyingInfo = newOtherIdentiyingInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__OTHER_IDENTIYING_INFO, oldOtherIdentiyingInfo, otherIdentiyingInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPoweredOn() {
		return poweredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoweredOn(boolean newPoweredOn) {
		boolean oldPoweredOn = poweredOn;
		poweredOn = newPoweredOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__POWERED_ON, oldPoweredOn, poweredOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufactureDate() {
		return manufactureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufactureDate(String newManufactureDate) {
		String oldManufactureDate = manufactureDate;
		manufactureDate = newManufactureDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__MANUFACTURE_DATE, oldManufactureDate, manufactureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendorEquipmentType() {
		return vendorEquipmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendorEquipmentType(String newVendorEquipmentType) {
		String oldVendorEquipmentType = vendorEquipmentType;
		vendorEquipmentType = newVendorEquipmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__VENDOR_EQUIPMENT_TYPE, oldVendorEquipmentType, vendorEquipmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserTracking() {
		return userTracking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserTracking(String newUserTracking) {
		String oldUserTracking = userTracking;
		userTracking = newUserTracking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__USER_TRACKING, oldUserTracking, userTracking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanBeFRUed() {
		return canBeFRUed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanBeFRUed(boolean newCanBeFRUed) {
		boolean oldCanBeFRUed = canBeFRUed;
		canBeFRUed = newCanBeFRUed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PHYSICAL_ELEMENT__CAN_BE_FR_UED, oldCanBeFRUed, canBeFRUed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.PHYSICAL_ELEMENT__TAG:
				return getTag();
			case CimPackage.PHYSICAL_ELEMENT__CREATIONCLASS_NAME:
				return getCreationclassName();
			case CimPackage.PHYSICAL_ELEMENT__MANUFACTURER:
				return getManufacturer();
			case CimPackage.PHYSICAL_ELEMENT__MODEL:
				return getModel();
			case CimPackage.PHYSICAL_ELEMENT__SKU:
				return getSKU();
			case CimPackage.PHYSICAL_ELEMENT__SERIAL_NUMBER:
				return getSerialNumber();
			case CimPackage.PHYSICAL_ELEMENT__VERSION:
				return getVersion();
			case CimPackage.PHYSICAL_ELEMENT__PART_NO:
				return getPartNo();
			case CimPackage.PHYSICAL_ELEMENT__OTHER_IDENTIYING_INFO:
				return getOtherIdentiyingInfo();
			case CimPackage.PHYSICAL_ELEMENT__POWERED_ON:
				return isPoweredOn();
			case CimPackage.PHYSICAL_ELEMENT__MANUFACTURE_DATE:
				return getManufactureDate();
			case CimPackage.PHYSICAL_ELEMENT__VENDOR_EQUIPMENT_TYPE:
				return getVendorEquipmentType();
			case CimPackage.PHYSICAL_ELEMENT__USER_TRACKING:
				return getUserTracking();
			case CimPackage.PHYSICAL_ELEMENT__CAN_BE_FR_UED:
				return isCanBeFRUed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.PHYSICAL_ELEMENT__TAG:
				setTag((String)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__CREATIONCLASS_NAME:
				setCreationclassName((String)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__MODEL:
				setModel((String)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__SKU:
				setSKU((String)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__VERSION:
				setVersion((String)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__PART_NO:
				setPartNo((String)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__OTHER_IDENTIYING_INFO:
				setOtherIdentiyingInfo((String)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__POWERED_ON:
				setPoweredOn((Boolean)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__MANUFACTURE_DATE:
				setManufactureDate((String)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__VENDOR_EQUIPMENT_TYPE:
				setVendorEquipmentType((String)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__USER_TRACKING:
				setUserTracking((String)newValue);
				return;
			case CimPackage.PHYSICAL_ELEMENT__CAN_BE_FR_UED:
				setCanBeFRUed((Boolean)newValue);
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
			case CimPackage.PHYSICAL_ELEMENT__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__CREATIONCLASS_NAME:
				setCreationclassName(CREATIONCLASS_NAME_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__SKU:
				setSKU(SKU_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__PART_NO:
				setPartNo(PART_NO_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__OTHER_IDENTIYING_INFO:
				setOtherIdentiyingInfo(OTHER_IDENTIYING_INFO_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__POWERED_ON:
				setPoweredOn(POWERED_ON_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__MANUFACTURE_DATE:
				setManufactureDate(MANUFACTURE_DATE_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__VENDOR_EQUIPMENT_TYPE:
				setVendorEquipmentType(VENDOR_EQUIPMENT_TYPE_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__USER_TRACKING:
				setUserTracking(USER_TRACKING_EDEFAULT);
				return;
			case CimPackage.PHYSICAL_ELEMENT__CAN_BE_FR_UED:
				setCanBeFRUed(CAN_BE_FR_UED_EDEFAULT);
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
			case CimPackage.PHYSICAL_ELEMENT__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case CimPackage.PHYSICAL_ELEMENT__CREATIONCLASS_NAME:
				return CREATIONCLASS_NAME_EDEFAULT == null ? creationclassName != null : !CREATIONCLASS_NAME_EDEFAULT.equals(creationclassName);
			case CimPackage.PHYSICAL_ELEMENT__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case CimPackage.PHYSICAL_ELEMENT__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case CimPackage.PHYSICAL_ELEMENT__SKU:
				return SKU_EDEFAULT == null ? sku != null : !SKU_EDEFAULT.equals(sku);
			case CimPackage.PHYSICAL_ELEMENT__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case CimPackage.PHYSICAL_ELEMENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.PHYSICAL_ELEMENT__PART_NO:
				return PART_NO_EDEFAULT == null ? partNo != null : !PART_NO_EDEFAULT.equals(partNo);
			case CimPackage.PHYSICAL_ELEMENT__OTHER_IDENTIYING_INFO:
				return OTHER_IDENTIYING_INFO_EDEFAULT == null ? otherIdentiyingInfo != null : !OTHER_IDENTIYING_INFO_EDEFAULT.equals(otherIdentiyingInfo);
			case CimPackage.PHYSICAL_ELEMENT__POWERED_ON:
				return poweredOn != POWERED_ON_EDEFAULT;
			case CimPackage.PHYSICAL_ELEMENT__MANUFACTURE_DATE:
				return MANUFACTURE_DATE_EDEFAULT == null ? manufactureDate != null : !MANUFACTURE_DATE_EDEFAULT.equals(manufactureDate);
			case CimPackage.PHYSICAL_ELEMENT__VENDOR_EQUIPMENT_TYPE:
				return VENDOR_EQUIPMENT_TYPE_EDEFAULT == null ? vendorEquipmentType != null : !VENDOR_EQUIPMENT_TYPE_EDEFAULT.equals(vendorEquipmentType);
			case CimPackage.PHYSICAL_ELEMENT__USER_TRACKING:
				return USER_TRACKING_EDEFAULT == null ? userTracking != null : !USER_TRACKING_EDEFAULT.equals(userTracking);
			case CimPackage.PHYSICAL_ELEMENT__CAN_BE_FR_UED:
				return canBeFRUed != CAN_BE_FR_UED_EDEFAULT;
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
		result.append(" (tag: ");
		result.append(tag);
		result.append(", creationclassName: ");
		result.append(creationclassName);
		result.append(", manufacturer: ");
		result.append(manufacturer);
		result.append(", model: ");
		result.append(model);
		result.append(", SKU: ");
		result.append(sku);
		result.append(", serialNumber: ");
		result.append(serialNumber);
		result.append(", version: ");
		result.append(version);
		result.append(", partNo: ");
		result.append(partNo);
		result.append(", otherIdentiyingInfo: ");
		result.append(otherIdentiyingInfo);
		result.append(", poweredOn: ");
		result.append(poweredOn);
		result.append(", manufactureDate: ");
		result.append(manufactureDate);
		result.append(", vendorEquipmentType: ");
		result.append(vendorEquipmentType);
		result.append(", userTracking: ");
		result.append(userTracking);
		result.append(", canBeFRUed: ");
		result.append(canBeFRUed);
		result.append(')');
		return result.toString();
	}

} //PhysicalElementImpl
