/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NAT List Based Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.NATListBasedSettings#isOverloadingPermitted <em>Overloading Permitted</em>}</li>
 *   <li>{@link es.tid.cim.NATListBasedSettings#getTranslationPoolForNAT <em>Translation Pool For NAT</em>}</li>
 *   <li>{@link es.tid.cim.NATListBasedSettings#getAddressesToBeTranslated <em>Addresses To Be Translated</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getNATListBasedSettings()
 * @model
 * @generated
 */
public interface NATListBasedSettings extends NATSettingData {
	/**
	 * Returns the value of the '<em><b>Overloading Permitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overloading Permitted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overloading Permitted</em>' attribute.
	 * @see #setOverloadingPermitted(boolean)
	 * @see es.tid.cim.CimPackage#getNATListBasedSettings_OverloadingPermitted()
	 * @model
	 * @generated
	 */
	boolean isOverloadingPermitted();

	/**
	 * Sets the value of the '{@link es.tid.cim.NATListBasedSettings#isOverloadingPermitted <em>Overloading Permitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overloading Permitted</em>' attribute.
	 * @see #isOverloadingPermitted()
	 * @generated
	 */
	void setOverloadingPermitted(boolean value);

	/**
	 * Returns the value of the '<em><b>Translation Pool For NAT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation Pool For NAT</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation Pool For NAT</em>' reference.
	 * @see #setTranslationPoolForNAT(RangeOfIPAddresses)
	 * @see es.tid.cim.CimPackage#getNATListBasedSettings_TranslationPoolForNAT()
	 * @model
	 * @generated
	 */
	RangeOfIPAddresses getTranslationPoolForNAT();

	/**
	 * Sets the value of the '{@link es.tid.cim.NATListBasedSettings#getTranslationPoolForNAT <em>Translation Pool For NAT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation Pool For NAT</em>' reference.
	 * @see #getTranslationPoolForNAT()
	 * @generated
	 */
	void setTranslationPoolForNAT(RangeOfIPAddresses value);

	/**
	 * Returns the value of the '<em><b>Addresses To Be Translated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses To Be Translated</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses To Be Translated</em>' reference.
	 * @see #setAddressesToBeTranslated(FilterList)
	 * @see es.tid.cim.CimPackage#getNATListBasedSettings_AddressesToBeTranslated()
	 * @model
	 * @generated
	 */
	FilterList getAddressesToBeTranslated();

	/**
	 * Sets the value of the '{@link es.tid.cim.NATListBasedSettings#getAddressesToBeTranslated <em>Addresses To Be Translated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addresses To Be Translated</em>' reference.
	 * @see #getAddressesToBeTranslated()
	 * @generated
	 */
	void setAddressesToBeTranslated(FilterList value);

} // NATListBasedSettings
