/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getTableCell <em>Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getCoveredTableCell <em>Covered Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getDefaultCellStyleName <em>Default Cell Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getNumberRowsRepeated <em>Number Rows Repeated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableRowType()
 * @model extendedMetaData="name='table-row_._type' kind='elementOnly'"
 * @generated
 */
public interface TableRowType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableRowType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Table Cell</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Cell</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Cell</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableRowType_TableCell()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-cell' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TableCellType> getTableCell();

	/**
	 * Returns the value of the '<em><b>Covered Table Cell</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered Table Cell</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered Table Cell</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableRowType_CoveredTableCell()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='covered-table-cell' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CoveredTableCellType> getCoveredTableCell();

	/**
	 * Returns the value of the '<em><b>Default Cell Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Cell Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Cell Style Name</em>' attribute.
	 * @see #setDefaultCellStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableRowType_DefaultCellStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.DefaultCellStyleNameType"
	 *        extendedMetaData="kind='attribute' name='default-cell-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultCellStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getDefaultCellStyleName <em>Default Cell Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Cell Style Name</em>' attribute.
	 * @see #getDefaultCellStyleName()
	 * @generated
	 */
	void setDefaultCellStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Number Rows Repeated</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Rows Repeated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Rows Repeated</em>' attribute.
	 * @see #isSetNumberRowsRepeated()
	 * @see #unsetNumberRowsRepeated()
	 * @see #setNumberRowsRepeated(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableRowType_NumberRowsRepeated()
	 * @model default="1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-rows-repeated' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberRowsRepeated();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getNumberRowsRepeated <em>Number Rows Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Rows Repeated</em>' attribute.
	 * @see #isSetNumberRowsRepeated()
	 * @see #unsetNumberRowsRepeated()
	 * @see #getNumberRowsRepeated()
	 * @generated
	 */
	void setNumberRowsRepeated(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getNumberRowsRepeated <em>Number Rows Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberRowsRepeated()
	 * @see #getNumberRowsRepeated()
	 * @see #setNumberRowsRepeated(BigInteger)
	 * @generated
	 */
	void unsetNumberRowsRepeated();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getNumberRowsRepeated <em>Number Rows Repeated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Rows Repeated</em>' attribute is set.
	 * @see #unsetNumberRowsRepeated()
	 * @see #getNumberRowsRepeated()
	 * @see #setNumberRowsRepeated(BigInteger)
	 * @generated
	 */
	boolean isSetNumberRowsRepeated();

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableRowType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"visible"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(TableVisibilityValue)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableRowType_Visibility()
	 * @model default="visible" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='visibility' namespace='##targetNamespace'"
	 * @generated
	 */
	TableVisibilityValue getVisibility();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(TableVisibilityValue value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(TableVisibilityValue)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(TableVisibilityValue)
	 * @generated
	 */
	boolean isSetVisibility();

} // TableRowType
