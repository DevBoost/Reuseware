/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enabled Logical Element Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.EnabledLogicalElementCapabilities#isElementNameEditSupported <em>Element Name Edit Supported</em>}</li>
 *   <li>{@link es.tid.cim.EnabledLogicalElementCapabilities#getMaxElementNameLen <em>Max Element Name Len</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getEnabledLogicalElementCapabilities()
 * @model
 * @generated
 */
public interface EnabledLogicalElementCapabilities extends Capabilities {
	/**
	 * Returns the value of the '<em><b>Element Name Edit Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name Edit Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name Edit Supported</em>' attribute.
	 * @see #setElementNameEditSupported(boolean)
	 * @see es.tid.cim.CimPackage#getEnabledLogicalElementCapabilities_ElementNameEditSupported()
	 * @model
	 * @generated
	 */
	boolean isElementNameEditSupported();

	/**
	 * Sets the value of the '{@link es.tid.cim.EnabledLogicalElementCapabilities#isElementNameEditSupported <em>Element Name Edit Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name Edit Supported</em>' attribute.
	 * @see #isElementNameEditSupported()
	 * @generated
	 */
	void setElementNameEditSupported(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Element Name Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Element Name Len</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Element Name Len</em>' attribute.
	 * @see #setMaxElementNameLen(int)
	 * @see es.tid.cim.CimPackage#getEnabledLogicalElementCapabilities_MaxElementNameLen()
	 * @model
	 * @generated
	 */
	int getMaxElementNameLen();

	/**
	 * Sets the value of the '{@link es.tid.cim.EnabledLogicalElementCapabilities#getMaxElementNameLen <em>Max Element Name Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Element Name Len</em>' attribute.
	 * @see #getMaxElementNameLen()
	 * @generated
	 */
	void setMaxElementNameLen(int value);

} // EnabledLogicalElementCapabilities
