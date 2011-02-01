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
 * A representation of the model object '<em><b>Logical Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.LogicalDevice#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.LogicalDevice#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link es.tid.cim.LogicalDevice#getPortOnDevice <em>Port On Device</em>}</li>
 *   <li>{@link es.tid.cim.LogicalDevice#getDeviceSAPImplementation <em>Device SAP Implementation</em>}</li>
 *   <li>{@link es.tid.cim.LogicalDevice#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.LogicalDevice#getSystemName <em>System Name</em>}</li>
 *   <li>{@link es.tid.cim.LogicalDevice#getDeviceIdentity <em>Device Identity</em>}</li>
 *   <li>{@link es.tid.cim.LogicalDevice#getDeviceConnection <em>Device Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getLogicalDevice()
 * @model abstract="true"
 * @generated
 */
public interface LogicalDevice extends EnabledLogicalElement {
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
	 * @see es.tid.cim.CimPackage#getLogicalDevice_CreationClassName()
	 * @model
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalDevice#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Id</em>' attribute.
	 * @see #setDeviceId(String)
	 * @see es.tid.cim.CimPackage#getLogicalDevice_DeviceId()
	 * @model
	 * @generated
	 */
	String getDeviceId();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalDevice#getDeviceId <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Id</em>' attribute.
	 * @see #getDeviceId()
	 * @generated
	 */
	void setDeviceId(String value);

	/**
	 * Returns the value of the '<em><b>Port On Device</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.LogicalPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port On Device</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port On Device</em>' reference list.
	 * @see es.tid.cim.CimPackage#getLogicalDevice_PortOnDevice()
	 * @model
	 * @generated
	 */
	EList<LogicalPort> getPortOnDevice();

	/**
	 * Returns the value of the '<em><b>Device SAP Implementation</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ServiceAccessPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device SAP Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device SAP Implementation</em>' reference list.
	 * @see es.tid.cim.CimPackage#getLogicalDevice_DeviceSAPImplementation()
	 * @model
	 * @generated
	 */
	EList<ServiceAccessPoint> getDeviceSAPImplementation();

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
	 * @see es.tid.cim.CimPackage#getLogicalDevice_SystemCreationClassName()
	 * @model
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalDevice#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * @see es.tid.cim.CimPackage#getLogicalDevice_SystemName()
	 * @model
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalDevice#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Device Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Identity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Identity</em>' reference.
	 * @see #setDeviceIdentity(LogicalDevice)
	 * @see es.tid.cim.CimPackage#getLogicalDevice_DeviceIdentity()
	 * @model
	 * @generated
	 */
	LogicalDevice getDeviceIdentity();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalDevice#getDeviceIdentity <em>Device Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Identity</em>' reference.
	 * @see #getDeviceIdentity()
	 * @generated
	 */
	void setDeviceIdentity(LogicalDevice value);

	/**
	 * Returns the value of the '<em><b>Device Connection</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.LogicalDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Connection</em>' reference list.
	 * @see es.tid.cim.CimPackage#getLogicalDevice_DeviceConnection()
	 * @model
	 * @generated
	 */
	EList<LogicalDevice> getDeviceConnection();

} // LogicalDevice
