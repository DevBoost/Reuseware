/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IP Assignment Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.IPAssignmentSettingData#getAddressOrigin <em>Address Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getIPAssignmentSettingData()
 * @model
 * @generated
 */
public interface IPAssignmentSettingData extends SettingData {
	/**
	 * Returns the value of the '<em><b>Address Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumAddressOrigin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Origin</em>' attribute.
	 * @see es.tid.cim.EnumAddressOrigin
	 * @see #setAddressOrigin(EnumAddressOrigin)
	 * @see es.tid.cim.CimPackage#getIPAssignmentSettingData_AddressOrigin()
	 * @model
	 * @generated
	 */
	EnumAddressOrigin getAddressOrigin();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPAssignmentSettingData#getAddressOrigin <em>Address Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Origin</em>' attribute.
	 * @see es.tid.cim.EnumAddressOrigin
	 * @see #getAddressOrigin()
	 * @generated
	 */
	void setAddressOrigin(EnumAddressOrigin value);

} // IPAssignmentSettingData
