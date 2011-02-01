/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.PhysicalElement#getTag <em>Tag</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#getCreationclassName <em>Creationclass Name</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#getModel <em>Model</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#getSKU <em>SKU</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#getVersion <em>Version</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#getPartNo <em>Part No</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#getOtherIdentiyingInfo <em>Other Identiying Info</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#isPoweredOn <em>Powered On</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#getVendorEquipmentType <em>Vendor Equipment Type</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#getUserTracking <em>User Tracking</em>}</li>
 *   <li>{@link es.tid.cim.PhysicalElement#isCanBeFRUed <em>Can Be FR Ued</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getPhysicalElement()
 * @model abstract="true"
 * @generated
 */
public interface PhysicalElement extends ManagedSystemElement {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_Tag()
	 * @model
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Creationclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creationclass Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creationclass Name</em>' attribute.
	 * @see #setCreationclassName(String)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_CreationclassName()
	 * @model
	 * @generated
	 */
	String getCreationclassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#getCreationclassName <em>Creationclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creationclass Name</em>' attribute.
	 * @see #getCreationclassName()
	 * @generated
	 */
	void setCreationclassName(String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_Manufacturer()
	 * @model
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>SKU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SKU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SKU</em>' attribute.
	 * @see #setSKU(String)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_SKU()
	 * @model
	 * @generated
	 */
	String getSKU();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#getSKU <em>SKU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SKU</em>' attribute.
	 * @see #getSKU()
	 * @generated
	 */
	void setSKU(String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_SerialNumber()
	 * @model
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Part No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part No</em>' attribute.
	 * @see #setPartNo(String)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_PartNo()
	 * @model
	 * @generated
	 */
	String getPartNo();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#getPartNo <em>Part No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part No</em>' attribute.
	 * @see #getPartNo()
	 * @generated
	 */
	void setPartNo(String value);

	/**
	 * Returns the value of the '<em><b>Other Identiying Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Identiying Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Identiying Info</em>' attribute.
	 * @see #setOtherIdentiyingInfo(String)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_OtherIdentiyingInfo()
	 * @model
	 * @generated
	 */
	String getOtherIdentiyingInfo();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#getOtherIdentiyingInfo <em>Other Identiying Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Identiying Info</em>' attribute.
	 * @see #getOtherIdentiyingInfo()
	 * @generated
	 */
	void setOtherIdentiyingInfo(String value);

	/**
	 * Returns the value of the '<em><b>Powered On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powered On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powered On</em>' attribute.
	 * @see #setPoweredOn(boolean)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_PoweredOn()
	 * @model
	 * @generated
	 */
	boolean isPoweredOn();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#isPoweredOn <em>Powered On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powered On</em>' attribute.
	 * @see #isPoweredOn()
	 * @generated
	 */
	void setPoweredOn(boolean value);

	/**
	 * Returns the value of the '<em><b>Manufacture Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacture Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacture Date</em>' attribute.
	 * @see #setManufactureDate(String)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_ManufactureDate()
	 * @model
	 * @generated
	 */
	String getManufactureDate();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#getManufactureDate <em>Manufacture Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacture Date</em>' attribute.
	 * @see #getManufactureDate()
	 * @generated
	 */
	void setManufactureDate(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Equipment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Equipment Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Equipment Type</em>' attribute.
	 * @see #setVendorEquipmentType(String)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_VendorEquipmentType()
	 * @model
	 * @generated
	 */
	String getVendorEquipmentType();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#getVendorEquipmentType <em>Vendor Equipment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Equipment Type</em>' attribute.
	 * @see #getVendorEquipmentType()
	 * @generated
	 */
	void setVendorEquipmentType(String value);

	/**
	 * Returns the value of the '<em><b>User Tracking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Tracking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Tracking</em>' attribute.
	 * @see #setUserTracking(String)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_UserTracking()
	 * @model
	 * @generated
	 */
	String getUserTracking();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#getUserTracking <em>User Tracking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Tracking</em>' attribute.
	 * @see #getUserTracking()
	 * @generated
	 */
	void setUserTracking(String value);

	/**
	 * Returns the value of the '<em><b>Can Be FR Ued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Be FR Ued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Be FR Ued</em>' attribute.
	 * @see #setCanBeFRUed(boolean)
	 * @see es.tid.cim.CimPackage#getPhysicalElement_CanBeFRUed()
	 * @model
	 * @generated
	 */
	boolean isCanBeFRUed();

	/**
	 * Sets the value of the '{@link es.tid.cim.PhysicalElement#isCanBeFRUed <em>Can Be FR Ued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Be FR Ued</em>' attribute.
	 * @see #isCanBeFRUed()
	 * @generated
	 */
	void setCanBeFRUed(boolean value);

} // PhysicalElement
