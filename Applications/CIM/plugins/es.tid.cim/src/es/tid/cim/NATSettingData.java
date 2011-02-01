/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NAT Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.NATSettingData#getAddressExamined <em>Address Examined</em>}</li>
 *   <li>{@link es.tid.cim.NATSettingData#isIsInside <em>Is Inside</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getNATSettingData()
 * @model abstract="true"
 * @generated
 */
public interface NATSettingData extends ScopedSettingData {
	/**
	 * Returns the value of the '<em><b>Address Examined</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumAddressExamined}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Examined</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Examined</em>' attribute.
	 * @see es.tid.cim.EnumAddressExamined
	 * @see #setAddressExamined(EnumAddressExamined)
	 * @see es.tid.cim.CimPackage#getNATSettingData_AddressExamined()
	 * @model
	 * @generated
	 */
	EnumAddressExamined getAddressExamined();

	/**
	 * Sets the value of the '{@link es.tid.cim.NATSettingData#getAddressExamined <em>Address Examined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Examined</em>' attribute.
	 * @see es.tid.cim.EnumAddressExamined
	 * @see #getAddressExamined()
	 * @generated
	 */
	void setAddressExamined(EnumAddressExamined value);

	/**
	 * Returns the value of the '<em><b>Is Inside</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Inside</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Inside</em>' attribute.
	 * @see #setIsInside(boolean)
	 * @see es.tid.cim.CimPackage#getNATSettingData_IsInside()
	 * @model
	 * @generated
	 */
	boolean isIsInside();

	/**
	 * Sets the value of the '{@link es.tid.cim.NATSettingData#isIsInside <em>Is Inside</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inside</em>' attribute.
	 * @see #isIsInside()
	 * @generated
	 */
	void setIsInside(boolean value);

} // NATSettingData
