/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.SoftwareElement#getSoftwareElementChecks <em>Software Element Checks</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareElement#getSoftwareElementActions <em>Software Element Actions</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareElement#getBuildNumber <em>Build Number</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareElement#getCodeSet <em>Code Set</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareElement#getIdentificationCode <em>Identification Code</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareElement#getLanguageEdition <em>Language Edition</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareElement#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareElement#getOtherTargetOS <em>Other Target OS</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareElement#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareElement#getSoftwareElementID <em>Software Element ID</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareElement#getSoftwareElementState <em>Software Element State</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareElement#getTargetOperatingSystem <em>Target Operating System</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareElement#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getSoftwareElement()
 * @model
 * @generated
 */
public interface SoftwareElement extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Software Element Checks</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.Check}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Element Checks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Element Checks</em>' reference list.
	 * @see es.tid.cim.CimPackage#getSoftwareElement_SoftwareElementChecks()
	 * @model
	 * @generated
	 */
	EList<Check> getSoftwareElementChecks();

	/**
	 * Returns the value of the '<em><b>Software Element Actions</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Element Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Element Actions</em>' reference list.
	 * @see es.tid.cim.CimPackage#getSoftwareElement_SoftwareElementActions()
	 * @model
	 * @generated
	 */
	EList<Action> getSoftwareElementActions();

	/**
	 * Returns the value of the '<em><b>Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Number</em>' attribute.
	 * @see #setBuildNumber(String)
	 * @see es.tid.cim.CimPackage#getSoftwareElement_BuildNumber()
	 * @model
	 * @generated
	 */
	String getBuildNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareElement#getBuildNumber <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Number</em>' attribute.
	 * @see #getBuildNumber()
	 * @generated
	 */
	void setBuildNumber(String value);

	/**
	 * Returns the value of the '<em><b>Code Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Set</em>' attribute.
	 * @see #setCodeSet(String)
	 * @see es.tid.cim.CimPackage#getSoftwareElement_CodeSet()
	 * @model
	 * @generated
	 */
	String getCodeSet();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareElement#getCodeSet <em>Code Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Set</em>' attribute.
	 * @see #getCodeSet()
	 * @generated
	 */
	void setCodeSet(String value);

	/**
	 * Returns the value of the '<em><b>Identification Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification Code</em>' attribute.
	 * @see #setIdentificationCode(String)
	 * @see es.tid.cim.CimPackage#getSoftwareElement_IdentificationCode()
	 * @model
	 * @generated
	 */
	String getIdentificationCode();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareElement#getIdentificationCode <em>Identification Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification Code</em>' attribute.
	 * @see #getIdentificationCode()
	 * @generated
	 */
	void setIdentificationCode(String value);

	/**
	 * Returns the value of the '<em><b>Language Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Edition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Edition</em>' attribute.
	 * @see #setLanguageEdition(String)
	 * @see es.tid.cim.CimPackage#getSoftwareElement_LanguageEdition()
	 * @model
	 * @generated
	 */
	String getLanguageEdition();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareElement#getLanguageEdition <em>Language Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Edition</em>' attribute.
	 * @see #getLanguageEdition()
	 * @generated
	 */
	void setLanguageEdition(String value);

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
	 * @see es.tid.cim.CimPackage#getSoftwareElement_Manufacturer()
	 * @model
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareElement#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Other Target OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Target OS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Target OS</em>' attribute.
	 * @see #setOtherTargetOS(String)
	 * @see es.tid.cim.CimPackage#getSoftwareElement_OtherTargetOS()
	 * @model
	 * @generated
	 */
	String getOtherTargetOS();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareElement#getOtherTargetOS <em>Other Target OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Target OS</em>' attribute.
	 * @see #getOtherTargetOS()
	 * @generated
	 */
	void setOtherTargetOS(String value);

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
	 * @see es.tid.cim.CimPackage#getSoftwareElement_SerialNumber()
	 * @model
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareElement#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Software Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Element ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Element ID</em>' attribute.
	 * @see #setSoftwareElementID(String)
	 * @see es.tid.cim.CimPackage#getSoftwareElement_SoftwareElementID()
	 * @model
	 * @generated
	 */
	String getSoftwareElementID();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareElement#getSoftwareElementID <em>Software Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Element ID</em>' attribute.
	 * @see #getSoftwareElementID()
	 * @generated
	 */
	void setSoftwareElementID(String value);

	/**
	 * Returns the value of the '<em><b>Software Element State</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumSoftwareElementState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Element State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Element State</em>' attribute.
	 * @see es.tid.cim.EnumSoftwareElementState
	 * @see #setSoftwareElementState(EnumSoftwareElementState)
	 * @see es.tid.cim.CimPackage#getSoftwareElement_SoftwareElementState()
	 * @model
	 * @generated
	 */
	EnumSoftwareElementState getSoftwareElementState();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareElement#getSoftwareElementState <em>Software Element State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Element State</em>' attribute.
	 * @see es.tid.cim.EnumSoftwareElementState
	 * @see #getSoftwareElementState()
	 * @generated
	 */
	void setSoftwareElementState(EnumSoftwareElementState value);

	/**
	 * Returns the value of the '<em><b>Target Operating System</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumTargetOSTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Operating System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Operating System</em>' attribute.
	 * @see es.tid.cim.EnumTargetOSTypes
	 * @see #setTargetOperatingSystem(EnumTargetOSTypes)
	 * @see es.tid.cim.CimPackage#getSoftwareElement_TargetOperatingSystem()
	 * @model
	 * @generated
	 */
	EnumTargetOSTypes getTargetOperatingSystem();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareElement#getTargetOperatingSystem <em>Target Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Operating System</em>' attribute.
	 * @see es.tid.cim.EnumTargetOSTypes
	 * @see #getTargetOperatingSystem()
	 * @generated
	 */
	void setTargetOperatingSystem(EnumTargetOSTypes value);

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
	 * @see es.tid.cim.CimPackage#getSoftwareElement_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareElement#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // SoftwareElement
