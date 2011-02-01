/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.Check#getCheckID <em>Check ID</em>}</li>
 *   <li>{@link es.tid.cim.Check#isCheckMode <em>Check Mode</em>}</li>
 *   <li>{@link es.tid.cim.Check#getName <em>Name</em>}</li>
 *   <li>{@link es.tid.cim.Check#getSoftwareElementID <em>Software Element ID</em>}</li>
 *   <li>{@link es.tid.cim.Check#getSoftwareElementState <em>Software Element State</em>}</li>
 *   <li>{@link es.tid.cim.Check#getTargetOperatingSystem <em>Target Operating System</em>}</li>
 *   <li>{@link es.tid.cim.Check#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getCheck()
 * @model abstract="true"
 * @generated
 */
public interface Check extends ManagedElement {
	/**
	 * Returns the value of the '<em><b>Check ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check ID</em>' attribute.
	 * @see #setCheckID(String)
	 * @see es.tid.cim.CimPackage#getCheck_CheckID()
	 * @model
	 * @generated
	 */
	String getCheckID();

	/**
	 * Sets the value of the '{@link es.tid.cim.Check#getCheckID <em>Check ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check ID</em>' attribute.
	 * @see #getCheckID()
	 * @generated
	 */
	void setCheckID(String value);

	/**
	 * Returns the value of the '<em><b>Check Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Mode</em>' attribute.
	 * @see #setCheckMode(boolean)
	 * @see es.tid.cim.CimPackage#getCheck_CheckMode()
	 * @model
	 * @generated
	 */
	boolean isCheckMode();

	/**
	 * Sets the value of the '{@link es.tid.cim.Check#isCheckMode <em>Check Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Mode</em>' attribute.
	 * @see #isCheckMode()
	 * @generated
	 */
	void setCheckMode(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.tid.cim.CimPackage#getCheck_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.tid.cim.Check#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see es.tid.cim.CimPackage#getCheck_SoftwareElementID()
	 * @model
	 * @generated
	 */
	String getSoftwareElementID();

	/**
	 * Sets the value of the '{@link es.tid.cim.Check#getSoftwareElementID <em>Software Element ID</em>}' attribute.
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
	 * @see es.tid.cim.CimPackage#getCheck_SoftwareElementState()
	 * @model
	 * @generated
	 */
	EnumSoftwareElementState getSoftwareElementState();

	/**
	 * Sets the value of the '{@link es.tid.cim.Check#getSoftwareElementState <em>Software Element State</em>}' attribute.
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
	 * @see es.tid.cim.CimPackage#getCheck_TargetOperatingSystem()
	 * @model
	 * @generated
	 */
	EnumTargetOSTypes getTargetOperatingSystem();

	/**
	 * Sets the value of the '{@link es.tid.cim.Check#getTargetOperatingSystem <em>Target Operating System</em>}' attribute.
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
	 * @see es.tid.cim.CimPackage#getCheck_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.Check#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Check
