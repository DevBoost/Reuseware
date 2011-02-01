/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.LogicalPort#getSpeed <em>Speed</em>}</li>
 *   <li>{@link es.tid.cim.LogicalPort#getMaxSpeed <em>Max Speed</em>}</li>
 *   <li>{@link es.tid.cim.LogicalPort#getRequestedSpeed <em>Requested Speed</em>}</li>
 *   <li>{@link es.tid.cim.LogicalPort#getUsageRestriction <em>Usage Restriction</em>}</li>
 *   <li>{@link es.tid.cim.LogicalPort#getPortType <em>Port Type</em>}</li>
 *   <li>{@link es.tid.cim.LogicalPort#getOtherPortType <em>Other Port Type</em>}</li>
 *   <li>{@link es.tid.cim.LogicalPort#getPortImplementsEndPoint <em>Port Implements End Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getLogicalPort()
 * @model
 * @generated
 */
public interface LogicalPort extends LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(BigInteger)
	 * @see es.tid.cim.CimPackage#getLogicalPort_Speed()
	 * @model
	 * @generated
	 */
	BigInteger getSpeed();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalPort#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Speed</em>' attribute.
	 * @see #setMaxSpeed(BigInteger)
	 * @see es.tid.cim.CimPackage#getLogicalPort_MaxSpeed()
	 * @model
	 * @generated
	 */
	BigInteger getMaxSpeed();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalPort#getMaxSpeed <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Speed</em>' attribute.
	 * @see #getMaxSpeed()
	 * @generated
	 */
	void setMaxSpeed(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Requested Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Speed</em>' attribute.
	 * @see #setRequestedSpeed(int)
	 * @see es.tid.cim.CimPackage#getLogicalPort_RequestedSpeed()
	 * @model
	 * @generated
	 */
	int getRequestedSpeed();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalPort#getRequestedSpeed <em>Requested Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Speed</em>' attribute.
	 * @see #getRequestedSpeed()
	 * @generated
	 */
	void setRequestedSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Usage Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Restriction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Restriction</em>' attribute.
	 * @see #setUsageRestriction(int)
	 * @see es.tid.cim.CimPackage#getLogicalPort_UsageRestriction()
	 * @model
	 * @generated
	 */
	int getUsageRestriction();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalPort#getUsageRestriction <em>Usage Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Restriction</em>' attribute.
	 * @see #getUsageRestriction()
	 * @generated
	 */
	void setUsageRestriction(int value);

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumPortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' attribute.
	 * @see es.tid.cim.EnumPortType
	 * @see #setPortType(EnumPortType)
	 * @see es.tid.cim.CimPackage#getLogicalPort_PortType()
	 * @model
	 * @generated
	 */
	EnumPortType getPortType();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalPort#getPortType <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' attribute.
	 * @see es.tid.cim.EnumPortType
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(EnumPortType value);

	/**
	 * Returns the value of the '<em><b>Other Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Port Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Port Type</em>' attribute.
	 * @see #setOtherPortType(String)
	 * @see es.tid.cim.CimPackage#getLogicalPort_OtherPortType()
	 * @model
	 * @generated
	 */
	String getOtherPortType();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalPort#getOtherPortType <em>Other Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Port Type</em>' attribute.
	 * @see #getOtherPortType()
	 * @generated
	 */
	void setOtherPortType(String value);

	/**
	 * Returns the value of the '<em><b>Port Implements End Point</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ProtocolEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Implements End Point</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Implements End Point</em>' reference list.
	 * @see es.tid.cim.CimPackage#getLogicalPort_PortImplementsEndPoint()
	 * @model
	 * @generated
	 */
	EList<ProtocolEndpoint> getPortImplementsEndPoint();

} // LogicalPort
