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
 * A representation of the model object '<em><b>Service Access Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ServiceAccessPoint#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.ServiceAccessPoint#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.ServiceAccessPoint#getSystemName <em>System Name</em>}</li>
 *   <li>{@link es.tid.cim.ServiceAccessPoint#getBindsToLANEndpoint <em>Binds To LAN Endpoint</em>}</li>
 *   <li>{@link es.tid.cim.ServiceAccessPoint#getSAPSAPDependency <em>SAPSAP Dependency</em>}</li>
 *   <li>{@link es.tid.cim.ServiceAccessPoint#getBindsTo <em>Binds To</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getServiceAccessPoint()
 * @model abstract="true"
 * @generated
 */
public interface ServiceAccessPoint extends EnabledLogicalElement {
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
	 * @see es.tid.cim.CimPackage#getServiceAccessPoint_CreationClassName()
	 * @model
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.ServiceAccessPoint#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

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
	 * @see es.tid.cim.CimPackage#getServiceAccessPoint_SystemCreationClassName()
	 * @model
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.ServiceAccessPoint#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * @see es.tid.cim.CimPackage#getServiceAccessPoint_SystemName()
	 * @model
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link es.tid.cim.ServiceAccessPoint#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Binds To LAN Endpoint</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.LANEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binds To LAN Endpoint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binds To LAN Endpoint</em>' reference list.
	 * @see es.tid.cim.CimPackage#getServiceAccessPoint_BindsToLANEndpoint()
	 * @model
	 * @generated
	 */
	EList<LANEndpoint> getBindsToLANEndpoint();

	/**
	 * Returns the value of the '<em><b>SAPSAP Dependency</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ServiceAccessPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SAPSAP Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SAPSAP Dependency</em>' reference list.
	 * @see es.tid.cim.CimPackage#getServiceAccessPoint_SAPSAPDependency()
	 * @model
	 * @generated
	 */
	EList<ServiceAccessPoint> getSAPSAPDependency();

	/**
	 * Returns the value of the '<em><b>Binds To</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ProtocolEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binds To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binds To</em>' reference list.
	 * @see es.tid.cim.CimPackage#getServiceAccessPoint_BindsTo()
	 * @model
	 * @generated
	 */
	EList<ProtocolEndpoint> getBindsTo();

} // ServiceAccessPoint
