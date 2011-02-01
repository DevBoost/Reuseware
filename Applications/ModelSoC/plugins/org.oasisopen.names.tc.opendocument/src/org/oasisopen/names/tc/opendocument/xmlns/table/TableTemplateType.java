/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRow <em>First Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRow <em>Last Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstColumn <em>First Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastColumn <em>Last Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getBody <em>Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getEvenRows <em>Even Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getOddRows <em>Odd Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getEvenColumns <em>Even Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getOddColumns <em>Odd Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRowEndColumn <em>First Row End Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRowStartColumn <em>First Row Start Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRowEndColumn <em>Last Row End Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRowStartColumn <em>Last Row Start Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType()
 * @model extendedMetaData="name='table-template_._type' kind='elementOnly'"
 * @generated
 */
public interface TableTemplateType extends EObject {
	/**
	 * Returns the value of the '<em><b>First Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Row</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Row</em>' containment reference.
	 * @see #setFirstRow(FirstRowType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_FirstRow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='first-row' namespace='##targetNamespace'"
	 * @generated
	 */
	FirstRowType getFirstRow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRow <em>First Row</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Row</em>' containment reference.
	 * @see #getFirstRow()
	 * @generated
	 */
	void setFirstRow(FirstRowType value);

	/**
	 * Returns the value of the '<em><b>Last Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Row</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Row</em>' containment reference.
	 * @see #setLastRow(LastRowType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_LastRow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='last-row' namespace='##targetNamespace'"
	 * @generated
	 */
	LastRowType getLastRow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRow <em>Last Row</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Row</em>' containment reference.
	 * @see #getLastRow()
	 * @generated
	 */
	void setLastRow(LastRowType value);

	/**
	 * Returns the value of the '<em><b>First Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Column</em>' containment reference.
	 * @see #setFirstColumn(FirstColumnType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_FirstColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='first-column' namespace='##targetNamespace'"
	 * @generated
	 */
	FirstColumnType getFirstColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstColumn <em>First Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Column</em>' containment reference.
	 * @see #getFirstColumn()
	 * @generated
	 */
	void setFirstColumn(FirstColumnType value);

	/**
	 * Returns the value of the '<em><b>Last Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Column</em>' containment reference.
	 * @see #setLastColumn(LastColumnType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_LastColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='last-column' namespace='##targetNamespace'"
	 * @generated
	 */
	LastColumnType getLastColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastColumn <em>Last Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Column</em>' containment reference.
	 * @see #getLastColumn()
	 * @generated
	 */
	void setLastColumn(LastColumnType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BodyType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_Body()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	BodyType getBody();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BodyType value);

	/**
	 * Returns the value of the '<em><b>Even Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Even Rows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Even Rows</em>' containment reference.
	 * @see #setEvenRows(EvenRowsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_EvenRows()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='even-rows' namespace='##targetNamespace'"
	 * @generated
	 */
	EvenRowsType getEvenRows();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getEvenRows <em>Even Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Even Rows</em>' containment reference.
	 * @see #getEvenRows()
	 * @generated
	 */
	void setEvenRows(EvenRowsType value);

	/**
	 * Returns the value of the '<em><b>Odd Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Odd Rows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odd Rows</em>' containment reference.
	 * @see #setOddRows(OddRowsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_OddRows()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='odd-rows' namespace='##targetNamespace'"
	 * @generated
	 */
	OddRowsType getOddRows();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getOddRows <em>Odd Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odd Rows</em>' containment reference.
	 * @see #getOddRows()
	 * @generated
	 */
	void setOddRows(OddRowsType value);

	/**
	 * Returns the value of the '<em><b>Even Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Even Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Even Columns</em>' containment reference.
	 * @see #setEvenColumns(EvenColumnsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_EvenColumns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='even-columns' namespace='##targetNamespace'"
	 * @generated
	 */
	EvenColumnsType getEvenColumns();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getEvenColumns <em>Even Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Even Columns</em>' containment reference.
	 * @see #getEvenColumns()
	 * @generated
	 */
	void setEvenColumns(EvenColumnsType value);

	/**
	 * Returns the value of the '<em><b>Odd Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Odd Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odd Columns</em>' containment reference.
	 * @see #setOddColumns(OddColumnsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_OddColumns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='odd-columns' namespace='##targetNamespace'"
	 * @generated
	 */
	OddColumnsType getOddColumns();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getOddColumns <em>Odd Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odd Columns</em>' containment reference.
	 * @see #getOddColumns()
	 * @generated
	 */
	void setOddColumns(OddColumnsType value);

	/**
	 * Returns the value of the '<em><b>First Row End Column</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Row End Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Row End Column</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol
	 * @see #isSetFirstRowEndColumn()
	 * @see #unsetFirstRowEndColumn()
	 * @see #setFirstRowEndColumn(RowOrCol)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_FirstRowEndColumn()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='first-row-end-column' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	RowOrCol getFirstRowEndColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRowEndColumn <em>First Row End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Row End Column</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol
	 * @see #isSetFirstRowEndColumn()
	 * @see #unsetFirstRowEndColumn()
	 * @see #getFirstRowEndColumn()
	 * @generated
	 */
	void setFirstRowEndColumn(RowOrCol value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRowEndColumn <em>First Row End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstRowEndColumn()
	 * @see #getFirstRowEndColumn()
	 * @see #setFirstRowEndColumn(RowOrCol)
	 * @generated
	 */
	void unsetFirstRowEndColumn();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRowEndColumn <em>First Row End Column</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Row End Column</em>' attribute is set.
	 * @see #unsetFirstRowEndColumn()
	 * @see #getFirstRowEndColumn()
	 * @see #setFirstRowEndColumn(RowOrCol)
	 * @generated
	 */
	boolean isSetFirstRowEndColumn();

	/**
	 * Returns the value of the '<em><b>First Row Start Column</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Row Start Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Row Start Column</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol
	 * @see #isSetFirstRowStartColumn()
	 * @see #unsetFirstRowStartColumn()
	 * @see #setFirstRowStartColumn(RowOrCol)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_FirstRowStartColumn()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='first-row-start-column' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	RowOrCol getFirstRowStartColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRowStartColumn <em>First Row Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Row Start Column</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol
	 * @see #isSetFirstRowStartColumn()
	 * @see #unsetFirstRowStartColumn()
	 * @see #getFirstRowStartColumn()
	 * @generated
	 */
	void setFirstRowStartColumn(RowOrCol value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRowStartColumn <em>First Row Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstRowStartColumn()
	 * @see #getFirstRowStartColumn()
	 * @see #setFirstRowStartColumn(RowOrCol)
	 * @generated
	 */
	void unsetFirstRowStartColumn();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getFirstRowStartColumn <em>First Row Start Column</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Row Start Column</em>' attribute is set.
	 * @see #unsetFirstRowStartColumn()
	 * @see #getFirstRowStartColumn()
	 * @see #setFirstRowStartColumn(RowOrCol)
	 * @generated
	 */
	boolean isSetFirstRowStartColumn();

	/**
	 * Returns the value of the '<em><b>Last Row End Column</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Row End Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Row End Column</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol
	 * @see #isSetLastRowEndColumn()
	 * @see #unsetLastRowEndColumn()
	 * @see #setLastRowEndColumn(RowOrCol)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_LastRowEndColumn()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='last-row-end-column' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	RowOrCol getLastRowEndColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRowEndColumn <em>Last Row End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Row End Column</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol
	 * @see #isSetLastRowEndColumn()
	 * @see #unsetLastRowEndColumn()
	 * @see #getLastRowEndColumn()
	 * @generated
	 */
	void setLastRowEndColumn(RowOrCol value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRowEndColumn <em>Last Row End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastRowEndColumn()
	 * @see #getLastRowEndColumn()
	 * @see #setLastRowEndColumn(RowOrCol)
	 * @generated
	 */
	void unsetLastRowEndColumn();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRowEndColumn <em>Last Row End Column</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Row End Column</em>' attribute is set.
	 * @see #unsetLastRowEndColumn()
	 * @see #getLastRowEndColumn()
	 * @see #setLastRowEndColumn(RowOrCol)
	 * @generated
	 */
	boolean isSetLastRowEndColumn();

	/**
	 * Returns the value of the '<em><b>Last Row Start Column</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Row Start Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Row Start Column</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol
	 * @see #isSetLastRowStartColumn()
	 * @see #unsetLastRowStartColumn()
	 * @see #setLastRowStartColumn(RowOrCol)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_LastRowStartColumn()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='last-row-start-column' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	RowOrCol getLastRowStartColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRowStartColumn <em>Last Row Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Row Start Column</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol
	 * @see #isSetLastRowStartColumn()
	 * @see #unsetLastRowStartColumn()
	 * @see #getLastRowStartColumn()
	 * @generated
	 */
	void setLastRowStartColumn(RowOrCol value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRowStartColumn <em>Last Row Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastRowStartColumn()
	 * @see #getLastRowStartColumn()
	 * @see #setLastRowStartColumn(RowOrCol)
	 * @generated
	 */
	void unsetLastRowStartColumn();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getLastRowStartColumn <em>Last Row Start Column</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Row Start Column</em>' attribute is set.
	 * @see #unsetLastRowStartColumn()
	 * @see #getLastRowStartColumn()
	 * @see #setLastRowStartColumn(RowOrCol)
	 * @generated
	 */
	boolean isSetLastRowStartColumn();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableTemplateType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TableTemplateType
