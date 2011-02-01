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
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.Service#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.Service#getPrimaryOwnerName <em>Primary Owner Name</em>}</li>
 *   <li>{@link es.tid.cim.Service#getPrimaryOwnerContact <em>Primary Owner Contact</em>}</li>
 *   <li>{@link es.tid.cim.Service#isStarted <em>Started</em>}</li>
 *   <li>{@link es.tid.cim.Service#getServiceComponents <em>Service Components</em>}</li>
 *   <li>{@link es.tid.cim.Service#getServiceServiceDependency <em>Service Service Dependency</em>}</li>
 *   <li>{@link es.tid.cim.Service#getSoftwareElementServiceImplementation <em>Software Element Service Implementation</em>}</li>
 *   <li>{@link es.tid.cim.Service#getSoftwareFeatureServiceImplementation <em>Software Feature Service Implementation</em>}</li>
 *   <li>{@link es.tid.cim.Service#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.Service#getSystemName <em>System Name</em>}</li>
 *   <li>{@link es.tid.cim.Service#getServiceAccessBySAP <em>Service Access By SAP</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getService()
 * @model abstract="true"
 * @generated
 */
public interface Service extends EnabledLogicalElement {
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
	 * @see es.tid.cim.CimPackage#getService_CreationClassName()
	 * @model
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.Service#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

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
	 * @see es.tid.cim.CimPackage#getService_PrimaryOwnerName()
	 * @model
	 * @generated
	 */
	String getPrimaryOwnerName();

	/**
	 * Sets the value of the '{@link es.tid.cim.Service#getPrimaryOwnerName <em>Primary Owner Name</em>}' attribute.
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
	 * @see es.tid.cim.CimPackage#getService_PrimaryOwnerContact()
	 * @model
	 * @generated
	 */
	String getPrimaryOwnerContact();

	/**
	 * Sets the value of the '{@link es.tid.cim.Service#getPrimaryOwnerContact <em>Primary Owner Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Owner Contact</em>' attribute.
	 * @see #getPrimaryOwnerContact()
	 * @generated
	 */
	void setPrimaryOwnerContact(String value);

	/**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see #setStarted(boolean)
	 * @see es.tid.cim.CimPackage#getService_Started()
	 * @model
	 * @generated
	 */
	boolean isStarted();

	/**
	 * Sets the value of the '{@link es.tid.cim.Service#isStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #isStarted()
	 * @generated
	 */
	void setStarted(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Components</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Components</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getService_ServiceComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServiceComponents();

	/**
	 * Returns the value of the '<em><b>Service Service Dependency</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Service Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Service Dependency</em>' reference list.
	 * @see es.tid.cim.CimPackage#getService_ServiceServiceDependency()
	 * @model
	 * @generated
	 */
	EList<Service> getServiceServiceDependency();

	/**
	 * Returns the value of the '<em><b>Software Element Service Implementation</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.SoftwareElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Element Service Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Element Service Implementation</em>' reference list.
	 * @see es.tid.cim.CimPackage#getService_SoftwareElementServiceImplementation()
	 * @model
	 * @generated
	 */
	EList<SoftwareElement> getSoftwareElementServiceImplementation();

	/**
	 * Returns the value of the '<em><b>Software Feature Service Implementation</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.SoftwareFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Feature Service Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Feature Service Implementation</em>' reference list.
	 * @see es.tid.cim.CimPackage#getService_SoftwareFeatureServiceImplementation()
	 * @model
	 * @generated
	 */
	EList<SoftwareFeature> getSoftwareFeatureServiceImplementation();

	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Creation Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see es.tid.cim.CimPackage#getService_SystemCreationClassName()
	 * @model
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.Service#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see es.tid.cim.CimPackage#getService_SystemName()
	 * @model
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link es.tid.cim.Service#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Service Access By SAP</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ServiceAccessPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Access By SAP</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Access By SAP</em>' reference list.
	 * @see es.tid.cim.CimPackage#getService_ServiceAccessBySAP()
	 * @model
	 * @generated
	 */
	EList<ServiceAccessPoint> getServiceAccessBySAP();

} // Service
