/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.PowerManagementCapabilities#getPowerCapabilities <em>Power Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getPowerManagementCapabilities()
 * @model
 * @generated
 */
public interface PowerManagementCapabilities extends Capabilities {
	/**
	 * Returns the value of the '<em><b>Power Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Capabilities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Capabilities</em>' attribute.
	 * @see #setPowerCapabilities(String)
	 * @see es.tid.cim.CimPackage#getPowerManagementCapabilities_PowerCapabilities()
	 * @model
	 * @generated
	 */
	String getPowerCapabilities();

	/**
	 * Sets the value of the '{@link es.tid.cim.PowerManagementCapabilities#getPowerCapabilities <em>Power Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Capabilities</em>' attribute.
	 * @see #getPowerCapabilities()
	 * @generated
	 */
	void setPowerCapabilities(String value);

} // PowerManagementCapabilities
