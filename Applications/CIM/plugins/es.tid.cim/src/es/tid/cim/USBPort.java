/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>USB Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.USBPort#getAvailability <em>Availability</em>}</li>
 *   <li>{@link es.tid.cim.USBPort#getStatusInfo <em>Status Info</em>}</li>
 *   <li>{@link es.tid.cim.USBPort#isSuspended <em>Suspended</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getUSBPort()
 * @model
 * @generated
 */
public interface USBPort extends LogicalPort {
	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumAvailability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see es.tid.cim.EnumAvailability
	 * @see #setAvailability(EnumAvailability)
	 * @see es.tid.cim.CimPackage#getUSBPort_Availability()
	 * @model
	 * @generated
	 */
	EnumAvailability getAvailability();

	/**
	 * Sets the value of the '{@link es.tid.cim.USBPort#getAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see es.tid.cim.EnumAvailability
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(EnumAvailability value);

	/**
	 * Returns the value of the '<em><b>Status Info</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumStatusInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Info</em>' attribute.
	 * @see es.tid.cim.EnumStatusInfo
	 * @see #setStatusInfo(EnumStatusInfo)
	 * @see es.tid.cim.CimPackage#getUSBPort_StatusInfo()
	 * @model
	 * @generated
	 */
	EnumStatusInfo getStatusInfo();

	/**
	 * Sets the value of the '{@link es.tid.cim.USBPort#getStatusInfo <em>Status Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Info</em>' attribute.
	 * @see es.tid.cim.EnumStatusInfo
	 * @see #getStatusInfo()
	 * @generated
	 */
	void setStatusInfo(EnumStatusInfo value);

	/**
	 * Returns the value of the '<em><b>Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspended</em>' attribute.
	 * @see #setSuspended(boolean)
	 * @see es.tid.cim.CimPackage#getUSBPort_Suspended()
	 * @model
	 * @generated
	 */
	boolean isSuspended();

	/**
	 * Sets the value of the '{@link es.tid.cim.USBPort#isSuspended <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspended</em>' attribute.
	 * @see #isSuspended()
	 * @generated
	 */
	void setSuspended(boolean value);

} // USBPort
