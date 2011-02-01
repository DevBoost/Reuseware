/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getFilterCondition <em>Filter Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getFilterAnd <em>Filter And</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getFilterOr <em>Filter Or</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getConditionSource <em>Condition Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getConditionSourceRangeAddress <em>Condition Source Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getDisplayDuplicates <em>Display Duplicates</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getTargetRangeAddress <em>Target Range Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterType()
 * @model extendedMetaData="name='filter_._type' kind='elementOnly'"
 * @generated
 */
public interface FilterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Condition</em>' containment reference.
	 * @see #setFilterCondition(FilterConditionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterType_FilterCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter-condition' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterConditionType getFilterCondition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getFilterCondition <em>Filter Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Condition</em>' containment reference.
	 * @see #getFilterCondition()
	 * @generated
	 */
	void setFilterCondition(FilterConditionType value);

	/**
	 * Returns the value of the '<em><b>Filter And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter And</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter And</em>' containment reference.
	 * @see #setFilterAnd(FilterAndType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterType_FilterAnd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter-and' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterAndType getFilterAnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getFilterAnd <em>Filter And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter And</em>' containment reference.
	 * @see #getFilterAnd()
	 * @generated
	 */
	void setFilterAnd(FilterAndType value);

	/**
	 * Returns the value of the '<em><b>Filter Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Or</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Or</em>' containment reference.
	 * @see #setFilterOr(FilterOrType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterType_FilterOr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter-or' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterOrType getFilterOr();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getFilterOr <em>Filter Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Or</em>' containment reference.
	 * @see #getFilterOr()
	 * @generated
	 */
	void setFilterOr(FilterOrType value);

	/**
	 * Returns the value of the '<em><b>Condition Source</b></em>' attribute.
	 * The default value is <code>"self"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType
	 * @see #isSetConditionSource()
	 * @see #unsetConditionSource()
	 * @see #setConditionSource(ConditionSourceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterType_ConditionSource()
	 * @model default="self" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='condition-source' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionSourceType getConditionSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getConditionSource <em>Condition Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ConditionSourceType
	 * @see #isSetConditionSource()
	 * @see #unsetConditionSource()
	 * @see #getConditionSource()
	 * @generated
	 */
	void setConditionSource(ConditionSourceType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getConditionSource <em>Condition Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionSource()
	 * @see #getConditionSource()
	 * @see #setConditionSource(ConditionSourceType)
	 * @generated
	 */
	void unsetConditionSource();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getConditionSource <em>Condition Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition Source</em>' attribute is set.
	 * @see #unsetConditionSource()
	 * @see #getConditionSource()
	 * @see #setConditionSource(ConditionSourceType)
	 * @generated
	 */
	boolean isSetConditionSource();

	/**
	 * Returns the value of the '<em><b>Condition Source Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Source Range Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Source Range Address</em>' attribute.
	 * @see #setConditionSourceRangeAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterType_ConditionSourceRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress"
	 *        extendedMetaData="kind='attribute' name='condition-source-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConditionSourceRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getConditionSourceRangeAddress <em>Condition Source Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Source Range Address</em>' attribute.
	 * @see #getConditionSourceRangeAddress()
	 * @generated
	 */
	void setConditionSourceRangeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Display Duplicates</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Duplicates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Duplicates</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayDuplicates()
	 * @see #unsetDisplayDuplicates()
	 * @see #setDisplayDuplicates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterType_DisplayDuplicates()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-duplicates' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayDuplicates();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getDisplayDuplicates <em>Display Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Duplicates</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayDuplicates()
	 * @see #unsetDisplayDuplicates()
	 * @see #getDisplayDuplicates()
	 * @generated
	 */
	void setDisplayDuplicates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getDisplayDuplicates <em>Display Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayDuplicates()
	 * @see #getDisplayDuplicates()
	 * @see #setDisplayDuplicates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplayDuplicates();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getDisplayDuplicates <em>Display Duplicates</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Duplicates</em>' attribute is set.
	 * @see #unsetDisplayDuplicates()
	 * @see #getDisplayDuplicates()
	 * @see #setDisplayDuplicates(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplayDuplicates();

	/**
	 * Returns the value of the '<em><b>Target Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Range Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Range Address</em>' attribute.
	 * @see #setTargetRangeAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterType_TargetRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress"
	 *        extendedMetaData="kind='attribute' name='target-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterType#getTargetRangeAddress <em>Target Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Range Address</em>' attribute.
	 * @see #getTargetRangeAddress()
	 * @generated
	 */
	void setTargetRangeAddress(String value);

} // FilterType
