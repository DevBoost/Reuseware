/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ElementSettingData#getIsCurrent <em>Is Current</em>}</li>
 *   <li>{@link es.tid.cim.ElementSettingData#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link es.tid.cim.ElementSettingData#getIsMaximum <em>Is Maximum</em>}</li>
 *   <li>{@link es.tid.cim.ElementSettingData#getIsMinimum <em>Is Minimum</em>}</li>
 *   <li>{@link es.tid.cim.ElementSettingData#getIsNext <em>Is Next</em>}</li>
 *   <li>{@link es.tid.cim.ElementSettingData#getIsPending <em>Is Pending</em>}</li>
 *   <li>{@link es.tid.cim.ElementSettingData#getSettingData <em>Setting Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getElementSettingData()
 * @model annotation="Qualifiers Association='true'"
 * @generated
 */
public interface ElementSettingData extends ManagedElement {
	/**
	 * Returns the value of the '<em><b>Is Current</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumIsCurrent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Current</em>' attribute.
	 * @see es.tid.cim.EnumIsCurrent
	 * @see #setIsCurrent(EnumIsCurrent)
	 * @see es.tid.cim.CimPackage#getElementSettingData_IsCurrent()
	 * @model
	 * @generated
	 */
	EnumIsCurrent getIsCurrent();

	/**
	 * Sets the value of the '{@link es.tid.cim.ElementSettingData#getIsCurrent <em>Is Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Current</em>' attribute.
	 * @see es.tid.cim.EnumIsCurrent
	 * @see #getIsCurrent()
	 * @generated
	 */
	void setIsCurrent(EnumIsCurrent value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumIsDefault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see es.tid.cim.EnumIsDefault
	 * @see #setIsDefault(EnumIsDefault)
	 * @see es.tid.cim.CimPackage#getElementSettingData_IsDefault()
	 * @model
	 * @generated
	 */
	EnumIsDefault getIsDefault();

	/**
	 * Sets the value of the '{@link es.tid.cim.ElementSettingData#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see es.tid.cim.EnumIsDefault
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(EnumIsDefault value);

	/**
	 * Returns the value of the '<em><b>Is Maximum</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumIsMaximum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Maximum</em>' attribute.
	 * @see es.tid.cim.EnumIsMaximum
	 * @see #setIsMaximum(EnumIsMaximum)
	 * @see es.tid.cim.CimPackage#getElementSettingData_IsMaximum()
	 * @model
	 * @generated
	 */
	EnumIsMaximum getIsMaximum();

	/**
	 * Sets the value of the '{@link es.tid.cim.ElementSettingData#getIsMaximum <em>Is Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Maximum</em>' attribute.
	 * @see es.tid.cim.EnumIsMaximum
	 * @see #getIsMaximum()
	 * @generated
	 */
	void setIsMaximum(EnumIsMaximum value);

	/**
	 * Returns the value of the '<em><b>Is Minimum</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumIsMinimum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Minimum</em>' attribute.
	 * @see es.tid.cim.EnumIsMinimum
	 * @see #setIsMinimum(EnumIsMinimum)
	 * @see es.tid.cim.CimPackage#getElementSettingData_IsMinimum()
	 * @model
	 * @generated
	 */
	EnumIsMinimum getIsMinimum();

	/**
	 * Sets the value of the '{@link es.tid.cim.ElementSettingData#getIsMinimum <em>Is Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Minimum</em>' attribute.
	 * @see es.tid.cim.EnumIsMinimum
	 * @see #getIsMinimum()
	 * @generated
	 */
	void setIsMinimum(EnumIsMinimum value);

	/**
	 * Returns the value of the '<em><b>Is Next</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumIsNext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Next</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Next</em>' attribute.
	 * @see es.tid.cim.EnumIsNext
	 * @see #setIsNext(EnumIsNext)
	 * @see es.tid.cim.CimPackage#getElementSettingData_IsNext()
	 * @model
	 * @generated
	 */
	EnumIsNext getIsNext();

	/**
	 * Sets the value of the '{@link es.tid.cim.ElementSettingData#getIsNext <em>Is Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Next</em>' attribute.
	 * @see es.tid.cim.EnumIsNext
	 * @see #getIsNext()
	 * @generated
	 */
	void setIsNext(EnumIsNext value);

	/**
	 * Returns the value of the '<em><b>Is Pending</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumIsPending}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Pending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Pending</em>' attribute.
	 * @see es.tid.cim.EnumIsPending
	 * @see #setIsPending(EnumIsPending)
	 * @see es.tid.cim.CimPackage#getElementSettingData_IsPending()
	 * @model
	 * @generated
	 */
	EnumIsPending getIsPending();

	/**
	 * Sets the value of the '{@link es.tid.cim.ElementSettingData#getIsPending <em>Is Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Pending</em>' attribute.
	 * @see es.tid.cim.EnumIsPending
	 * @see #getIsPending()
	 * @generated
	 */
	void setIsPending(EnumIsPending value);

	/**
	 * Returns the value of the '<em><b>Setting Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting Data</em>' reference.
	 * @see #setSettingData(SettingData)
	 * @see es.tid.cim.CimPackage#getElementSettingData_SettingData()
	 * @model required="true"
	 * @generated
	 */
	SettingData getSettingData();

	/**
	 * Sets the value of the '{@link es.tid.cim.ElementSettingData#getSettingData <em>Setting Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting Data</em>' reference.
	 * @see #getSettingData()
	 * @generated
	 */
	void setSettingData(SettingData value);

} // ElementSettingData
