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
 * A representation of the model object '<em><b>Managed System Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ManagedSystemElement#getHealthState <em>Health State</em>}</li>
 *   <li>{@link es.tid.cim.ManagedSystemElement#getInstallDate <em>Install Date</em>}</li>
 *   <li>{@link es.tid.cim.ManagedSystemElement#getName <em>Name</em>}</li>
 *   <li>{@link es.tid.cim.ManagedSystemElement#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link es.tid.cim.ManagedSystemElement#getStatusDescriptions <em>Status Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getManagedSystemElement()
 * @model abstract="true"
 * @generated
 */
public interface ManagedSystemElement extends ManagedElement {
	/**
	 * Returns the value of the '<em><b>Health State</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumHealthState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Health State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health State</em>' attribute.
	 * @see es.tid.cim.EnumHealthState
	 * @see #setHealthState(EnumHealthState)
	 * @see es.tid.cim.CimPackage#getManagedSystemElement_HealthState()
	 * @model
	 * @generated
	 */
	EnumHealthState getHealthState();

	/**
	 * Sets the value of the '{@link es.tid.cim.ManagedSystemElement#getHealthState <em>Health State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health State</em>' attribute.
	 * @see es.tid.cim.EnumHealthState
	 * @see #getHealthState()
	 * @generated
	 */
	void setHealthState(EnumHealthState value);

	/**
	 * Returns the value of the '<em><b>Install Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Install Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install Date</em>' attribute.
	 * @see #setInstallDate(String)
	 * @see es.tid.cim.CimPackage#getManagedSystemElement_InstallDate()
	 * @model
	 * @generated
	 */
	String getInstallDate();

	/**
	 * Sets the value of the '{@link es.tid.cim.ManagedSystemElement#getInstallDate <em>Install Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install Date</em>' attribute.
	 * @see #getInstallDate()
	 * @generated
	 */
	void setInstallDate(String value);

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
	 * @see es.tid.cim.CimPackage#getManagedSystemElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.tid.cim.ManagedSystemElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operational Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumOperationalStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Status</em>' attribute.
	 * @see es.tid.cim.EnumOperationalStatus
	 * @see #setOperationalStatus(EnumOperationalStatus)
	 * @see es.tid.cim.CimPackage#getManagedSystemElement_OperationalStatus()
	 * @model
	 * @generated
	 */
	EnumOperationalStatus getOperationalStatus();

	/**
	 * Sets the value of the '{@link es.tid.cim.ManagedSystemElement#getOperationalStatus <em>Operational Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Status</em>' attribute.
	 * @see es.tid.cim.EnumOperationalStatus
	 * @see #getOperationalStatus()
	 * @generated
	 */
	void setOperationalStatus(EnumOperationalStatus value);

	/**
	 * Returns the value of the '<em><b>Status Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.StatusDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Descriptions</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getManagedSystemElement_StatusDescriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<StatusDescription> getStatusDescriptions();

} // ManagedSystemElement
