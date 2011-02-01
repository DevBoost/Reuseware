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
 * A representation of the model object '<em><b>Computer System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ComputerSystem#getOtherIdentifyingInfo <em>Other Identifying Info</em>}</li>
 *   <li>{@link es.tid.cim.ComputerSystem#getIdentifyingDescriptions <em>Identifying Descriptions</em>}</li>
 *   <li>{@link es.tid.cim.ComputerSystem#getDedicated <em>Dedicated</em>}</li>
 *   <li>{@link es.tid.cim.ComputerSystem#getOtherDedicatedDescriptions <em>Other Dedicated Descriptions</em>}</li>
 *   <li>{@link es.tid.cim.ComputerSystem#getResetCapability <em>Reset Capability</em>}</li>
 *   <li>{@link es.tid.cim.ComputerSystem#getHostedRoutingServices <em>Hosted Routing Services</em>}</li>
 *   <li>{@link es.tid.cim.ComputerSystem#getHostedForwardingServices <em>Hosted Forwarding Services</em>}</li>
 *   <li>{@link es.tid.cim.ComputerSystem#getHostedRoutingPolicy <em>Hosted Routing Policy</em>}</li>
 *   <li>{@link es.tid.cim.ComputerSystem#getHostedFilterList <em>Hosted Filter List</em>}</li>
 *   <li>{@link es.tid.cim.ComputerSystem#getRunningOS <em>Running OS</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getComputerSystem()
 * @model
 * @generated
 */
public interface ComputerSystem extends es.tid.cim.System {
	/**
	 * Returns the value of the '<em><b>Other Identifying Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Identifying Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Identifying Info</em>' attribute.
	 * @see #setOtherIdentifyingInfo(String)
	 * @see es.tid.cim.CimPackage#getComputerSystem_OtherIdentifyingInfo()
	 * @model
	 * @generated
	 */
	String getOtherIdentifyingInfo();

	/**
	 * Sets the value of the '{@link es.tid.cim.ComputerSystem#getOtherIdentifyingInfo <em>Other Identifying Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Identifying Info</em>' attribute.
	 * @see #getOtherIdentifyingInfo()
	 * @generated
	 */
	void setOtherIdentifyingInfo(String value);

	/**
	 * Returns the value of the '<em><b>Identifying Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifying Descriptions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifying Descriptions</em>' attribute.
	 * @see #setIdentifyingDescriptions(String)
	 * @see es.tid.cim.CimPackage#getComputerSystem_IdentifyingDescriptions()
	 * @model
	 * @generated
	 */
	String getIdentifyingDescriptions();

	/**
	 * Sets the value of the '{@link es.tid.cim.ComputerSystem#getIdentifyingDescriptions <em>Identifying Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifying Descriptions</em>' attribute.
	 * @see #getIdentifyingDescriptions()
	 * @generated
	 */
	void setIdentifyingDescriptions(String value);

	/**
	 * Returns the value of the '<em><b>Dedicated</b></em>' attribute list.
	 * The list contents are of type {@link es.tid.cim.EnumDedicated}.
	 * The literals are from the enumeration {@link es.tid.cim.EnumDedicated}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dedicated</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dedicated</em>' attribute list.
	 * @see es.tid.cim.EnumDedicated
	 * @see es.tid.cim.CimPackage#getComputerSystem_Dedicated()
	 * @model
	 * @generated
	 */
	EList<EnumDedicated> getDedicated();

	/**
	 * Returns the value of the '<em><b>Other Dedicated Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Dedicated Descriptions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Dedicated Descriptions</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getComputerSystem_OtherDedicatedDescriptions()
	 * @model
	 * @generated
	 */
	EList<String> getOtherDedicatedDescriptions();

	/**
	 * Returns the value of the '<em><b>Reset Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Capability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Capability</em>' attribute.
	 * @see #setResetCapability(String)
	 * @see es.tid.cim.CimPackage#getComputerSystem_ResetCapability()
	 * @model
	 * @generated
	 */
	String getResetCapability();

	/**
	 * Sets the value of the '{@link es.tid.cim.ComputerSystem#getResetCapability <em>Reset Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Capability</em>' attribute.
	 * @see #getResetCapability()
	 * @generated
	 */
	void setResetCapability(String value);

	/**
	 * Returns the value of the '<em><b>Hosted Routing Services</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.RouteCalculationService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Routing Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Routing Services</em>' reference list.
	 * @see es.tid.cim.CimPackage#getComputerSystem_HostedRoutingServices()
	 * @model
	 * @generated
	 */
	EList<RouteCalculationService> getHostedRoutingServices();

	/**
	 * Returns the value of the '<em><b>Hosted Forwarding Services</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ForwardingService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Forwarding Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Forwarding Services</em>' reference list.
	 * @see es.tid.cim.CimPackage#getComputerSystem_HostedForwardingServices()
	 * @model
	 * @generated
	 */
	EList<ForwardingService> getHostedForwardingServices();

	/**
	 * Returns the value of the '<em><b>Hosted Routing Policy</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.RoutingPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Routing Policy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Routing Policy</em>' reference list.
	 * @see es.tid.cim.CimPackage#getComputerSystem_HostedRoutingPolicy()
	 * @model
	 * @generated
	 */
	EList<RoutingPolicy> getHostedRoutingPolicy();

	/**
	 * Returns the value of the '<em><b>Hosted Filter List</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.FilterList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Filter List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Filter List</em>' reference list.
	 * @see es.tid.cim.CimPackage#getComputerSystem_HostedFilterList()
	 * @model
	 * @generated
	 */
	EList<FilterList> getHostedFilterList();

	/**
	 * Returns the value of the '<em><b>Running OS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running OS</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running OS</em>' reference.
	 * @see #setRunningOS(OperatingSystem)
	 * @see es.tid.cim.CimPackage#getComputerSystem_RunningOS()
	 * @model
	 * @generated
	 */
	OperatingSystem getRunningOS();

	/**
	 * Sets the value of the '{@link es.tid.cim.ComputerSystem#getRunningOS <em>Running OS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running OS</em>' reference.
	 * @see #getRunningOS()
	 * @generated
	 */
	void setRunningOS(OperatingSystem value);

} // ComputerSystem
