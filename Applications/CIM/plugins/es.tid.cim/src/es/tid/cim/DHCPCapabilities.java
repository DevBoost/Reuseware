/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DHCP Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.DHCPCapabilities#getOptionsSupported <em>Options Supported</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getDHCPCapabilities()
 * @model
 * @generated
 */
public interface DHCPCapabilities extends Capabilities {
	/**
	 * Returns the value of the '<em><b>Options Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options Supported</em>' attribute.
	 * @see #setOptionsSupported(int)
	 * @see es.tid.cim.CimPackage#getDHCPCapabilities_OptionsSupported()
	 * @model
	 * @generated
	 */
	int getOptionsSupported();

	/**
	 * Sets the value of the '{@link es.tid.cim.DHCPCapabilities#getOptionsSupported <em>Options Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options Supported</em>' attribute.
	 * @see #getOptionsSupported()
	 * @generated
	 */
	void setOptionsSupported(int value);

} // DHCPCapabilities
