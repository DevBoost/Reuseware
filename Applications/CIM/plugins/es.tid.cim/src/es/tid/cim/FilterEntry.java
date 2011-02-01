/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.FilterEntry#getAction <em>Action</em>}</li>
 *   <li>{@link es.tid.cim.FilterEntry#isDefaultFilter <em>Default Filter</em>}</li>
 *   <li>{@link es.tid.cim.FilterEntry#getMatchConditionType <em>Match Condition Type</em>}</li>
 *   <li>{@link es.tid.cim.FilterEntry#getMatchConditionValue <em>Match Condition Value</em>}</li>
 *   <li>{@link es.tid.cim.FilterEntry#getOtherMatchConditionType <em>Other Match Condition Type</em>}</li>
 *   <li>{@link es.tid.cim.FilterEntry#getOtherTrafficType <em>Other Traffic Type</em>}</li>
 *   <li>{@link es.tid.cim.FilterEntry#getTrafficClass <em>Traffic Class</em>}</li>
 *   <li>{@link es.tid.cim.FilterEntry#getTrafficType <em>Traffic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getFilterEntry()
 * @model
 * @generated
 */
public interface FilterEntry extends FilterEntryBase {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see es.tid.cim.EnumAction
	 * @see #setAction(EnumAction)
	 * @see es.tid.cim.CimPackage#getFilterEntry_Action()
	 * @model
	 * @generated
	 */
	EnumAction getAction();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterEntry#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see es.tid.cim.EnumAction
	 * @see #getAction()
	 * @generated
	 */
	void setAction(EnumAction value);

	/**
	 * Returns the value of the '<em><b>Default Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Filter</em>' attribute.
	 * @see #setDefaultFilter(boolean)
	 * @see es.tid.cim.CimPackage#getFilterEntry_DefaultFilter()
	 * @model
	 * @generated
	 */
	boolean isDefaultFilter();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterEntry#isDefaultFilter <em>Default Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Filter</em>' attribute.
	 * @see #isDefaultFilter()
	 * @generated
	 */
	void setDefaultFilter(boolean value);

	/**
	 * Returns the value of the '<em><b>Match Condition Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumMatchConditionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Condition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Condition Type</em>' attribute.
	 * @see es.tid.cim.EnumMatchConditionType
	 * @see #setMatchConditionType(EnumMatchConditionType)
	 * @see es.tid.cim.CimPackage#getFilterEntry_MatchConditionType()
	 * @model
	 * @generated
	 */
	EnumMatchConditionType getMatchConditionType();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterEntry#getMatchConditionType <em>Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Condition Type</em>' attribute.
	 * @see es.tid.cim.EnumMatchConditionType
	 * @see #getMatchConditionType()
	 * @generated
	 */
	void setMatchConditionType(EnumMatchConditionType value);

	/**
	 * Returns the value of the '<em><b>Match Condition Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Condition Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Condition Value</em>' attribute.
	 * @see #setMatchConditionValue(String)
	 * @see es.tid.cim.CimPackage#getFilterEntry_MatchConditionValue()
	 * @model
	 * @generated
	 */
	String getMatchConditionValue();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterEntry#getMatchConditionValue <em>Match Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Condition Value</em>' attribute.
	 * @see #getMatchConditionValue()
	 * @generated
	 */
	void setMatchConditionValue(String value);

	/**
	 * Returns the value of the '<em><b>Other Match Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Match Condition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Match Condition Type</em>' attribute.
	 * @see #setOtherMatchConditionType(String)
	 * @see es.tid.cim.CimPackage#getFilterEntry_OtherMatchConditionType()
	 * @model
	 * @generated
	 */
	String getOtherMatchConditionType();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterEntry#getOtherMatchConditionType <em>Other Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Match Condition Type</em>' attribute.
	 * @see #getOtherMatchConditionType()
	 * @generated
	 */
	void setOtherMatchConditionType(String value);

	/**
	 * Returns the value of the '<em><b>Other Traffic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Traffic Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Traffic Type</em>' attribute.
	 * @see #setOtherTrafficType(String)
	 * @see es.tid.cim.CimPackage#getFilterEntry_OtherTrafficType()
	 * @model
	 * @generated
	 */
	String getOtherTrafficType();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterEntry#getOtherTrafficType <em>Other Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Traffic Type</em>' attribute.
	 * @see #getOtherTrafficType()
	 * @generated
	 */
	void setOtherTrafficType(String value);

	/**
	 * Returns the value of the '<em><b>Traffic Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traffic Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Class</em>' attribute.
	 * @see #setTrafficClass(String)
	 * @see es.tid.cim.CimPackage#getFilterEntry_TrafficClass()
	 * @model
	 * @generated
	 */
	String getTrafficClass();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterEntry#getTrafficClass <em>Traffic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic Class</em>' attribute.
	 * @see #getTrafficClass()
	 * @generated
	 */
	void setTrafficClass(String value);

	/**
	 * Returns the value of the '<em><b>Traffic Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumTrafficType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traffic Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Type</em>' attribute.
	 * @see es.tid.cim.EnumTrafficType
	 * @see #setTrafficType(EnumTrafficType)
	 * @see es.tid.cim.CimPackage#getFilterEntry_TrafficType()
	 * @model
	 * @generated
	 */
	EnumTrafficType getTrafficType();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterEntry#getTrafficType <em>Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic Type</em>' attribute.
	 * @see es.tid.cim.EnumTrafficType
	 * @see #getTrafficType()
	 * @generated
	 */
	void setTrafficType(EnumTrafficType value);

} // FilterEntry
