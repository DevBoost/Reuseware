/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>USB Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.USBDevice#getUSBVersion <em>USB Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getUSBDevice()
 * @model
 * @generated
 */
public interface USBDevice extends LogicalDevice {
	/**
	 * Returns the value of the '<em><b>USB Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>USB Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>USB Version</em>' attribute.
	 * @see #setUSBVersion(int)
	 * @see es.tid.cim.CimPackage#getUSBDevice_USBVersion()
	 * @model
	 * @generated
	 */
	int getUSBVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.USBDevice#getUSBVersion <em>USB Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>USB Version</em>' attribute.
	 * @see #getUSBVersion()
	 * @generated
	 */
	void setUSBVersion(int value);

} // USBDevice
