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
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.System#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.System#getSystemDevices <em>System Devices</em>}</li>
 *   <li>{@link es.tid.cim.System#getSystemComponents <em>System Components</em>}</li>
 *   <li>{@link es.tid.cim.System#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link es.tid.cim.System#getPrimaryOwnerName <em>Primary Owner Name</em>}</li>
 *   <li>{@link es.tid.cim.System#getPrimaryOwnerContact <em>Primary Owner Contact</em>}</li>
 *   <li>{@link es.tid.cim.System#getRoles <em>Roles</em>}</li>
 *   <li>{@link es.tid.cim.System#getHostedServices <em>Hosted Services</em>}</li>
 *   <li>{@link es.tid.cim.System#getHostedRoute <em>Hosted Route</em>}</li>
 *   <li>{@link es.tid.cim.System#getHostedAccessPoint <em>Hosted Access Point</em>}</li>
 *   <li>{@link es.tid.cim.System#getHostedCollection <em>Hosted Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getSystem()
 * @model abstract="true"
 * @generated
 */
public interface System extends EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see es.tid.cim.CimPackage#getSystem_CreationClassName()
	 * @model required="true"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.System#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Devices</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.LogicalDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Devices</em>' reference list.
	 * @see es.tid.cim.CimPackage#getSystem_SystemDevices()
	 * @model
	 * @generated
	 */
	EList<LogicalDevice> getSystemDevices();

	/**
	 * Returns the value of the '<em><b>System Components</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.ManagedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Components</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getSystem_SystemComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<ManagedElement> getSystemComponents();

	/**
	 * Returns the value of the '<em><b>Name Format</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumNameFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Format</em>' attribute.
	 * @see es.tid.cim.EnumNameFormat
	 * @see #setNameFormat(EnumNameFormat)
	 * @see es.tid.cim.CimPackage#getSystem_NameFormat()
	 * @model
	 * @generated
	 */
	EnumNameFormat getNameFormat();

	/**
	 * Sets the value of the '{@link es.tid.cim.System#getNameFormat <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Format</em>' attribute.
	 * @see es.tid.cim.EnumNameFormat
	 * @see #getNameFormat()
	 * @generated
	 */
	void setNameFormat(EnumNameFormat value);

	/**
	 * Returns the value of the '<em><b>Primary Owner Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Owner Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Owner Name</em>' attribute.
	 * @see #setPrimaryOwnerName(String)
	 * @see es.tid.cim.CimPackage#getSystem_PrimaryOwnerName()
	 * @model
	 * @generated
	 */
	String getPrimaryOwnerName();

	/**
	 * Sets the value of the '{@link es.tid.cim.System#getPrimaryOwnerName <em>Primary Owner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Owner Name</em>' attribute.
	 * @see #getPrimaryOwnerName()
	 * @generated
	 */
	void setPrimaryOwnerName(String value);

	/**
	 * Returns the value of the '<em><b>Primary Owner Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Owner Contact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Owner Contact</em>' attribute.
	 * @see #setPrimaryOwnerContact(String)
	 * @see es.tid.cim.CimPackage#getSystem_PrimaryOwnerContact()
	 * @model
	 * @generated
	 */
	String getPrimaryOwnerContact();

	/**
	 * Sets the value of the '{@link es.tid.cim.System#getPrimaryOwnerContact <em>Primary Owner Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Owner Contact</em>' attribute.
	 * @see #getPrimaryOwnerContact()
	 * @generated
	 */
	void setPrimaryOwnerContact(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getSystem_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Hosted Services</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Services</em>' reference list.
	 * @see es.tid.cim.CimPackage#getSystem_HostedServices()
	 * @model
	 * @generated
	 */
	EList<Service> getHostedServices();

	/**
	 * Returns the value of the '<em><b>Hosted Route</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.NextHopRoute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Route</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Route</em>' reference list.
	 * @see es.tid.cim.CimPackage#getSystem_HostedRoute()
	 * @model
	 * @generated
	 */
	EList<NextHopRoute> getHostedRoute();

	/**
	 * Returns the value of the '<em><b>Hosted Access Point</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ServiceAccessPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Access Point</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Access Point</em>' reference list.
	 * @see es.tid.cim.CimPackage#getSystem_HostedAccessPoint()
	 * @model
	 * @generated
	 */
	EList<ServiceAccessPoint> getHostedAccessPoint();

	/**
	 * Returns the value of the '<em><b>Hosted Collection</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.SystemSpecificCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Collection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Collection</em>' reference list.
	 * @see es.tid.cim.CimPackage#getSystem_HostedCollection()
	 * @model
	 * @generated
	 */
	EList<SystemSpecificCollection> getHostedCollection();

} // System
