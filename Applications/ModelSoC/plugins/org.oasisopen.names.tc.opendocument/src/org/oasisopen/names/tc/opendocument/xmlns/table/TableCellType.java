/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import java.math.BigInteger;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableTableCellContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getContentValidationName <em>Content Validation Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberColumnsRepeated <em>Number Columns Repeated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberColumnsSpanned <em>Number Columns Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberMatrixColumnsSpanned <em>Number Matrix Columns Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberMatrixRowsSpanned <em>Number Matrix Rows Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberRowsSpanned <em>Number Rows Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getProtect <em>Protect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType()
 * @model extendedMetaData="name='table-cell_._type' kind='elementOnly'"
 * @generated
 */
public interface TableCellType extends TableTableCellContent {
	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetBooleanValue()
	 * @see #unsetBooleanValue()
	 * @see #setBooleanValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_BooleanValue()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='boolean-value' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBooleanValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetBooleanValue()
	 * @see #unsetBooleanValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	void setBooleanValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBooleanValue()
	 * @see #getBooleanValue()
	 * @see #setBooleanValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetBooleanValue();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getBooleanValue <em>Boolean Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boolean Value</em>' attribute is set.
	 * @see #unsetBooleanValue()
	 * @see #getBooleanValue()
	 * @see #setBooleanValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetBooleanValue();

	/**
	 * Returns the value of the '<em><b>Content Validation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Validation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Validation Name</em>' attribute.
	 * @see #setContentValidationName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_ContentValidationName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='content-validation-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContentValidationName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getContentValidationName <em>Content Validation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Validation Name</em>' attribute.
	 * @see #getContentValidationName()
	 * @generated
	 */
	void setContentValidationName(String value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_Currency()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='currency' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(String value);

	/**
	 * Returns the value of the '<em><b>Date Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Value</em>' attribute.
	 * @see #setDateValue(XMLGregorianCalendar)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_DateValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.DateOrDateTime"
	 *        extendedMetaData="kind='attribute' name='date-value' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	XMLGregorianCalendar getDateValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getDateValue <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Value</em>' attribute.
	 * @see #getDateValue()
	 * @generated
	 */
	void setDateValue(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_Formula()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='formula' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

	/**
	 * Returns the value of the '<em><b>Number Columns Repeated</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Columns Repeated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Columns Repeated</em>' attribute.
	 * @see #isSetNumberColumnsRepeated()
	 * @see #unsetNumberColumnsRepeated()
	 * @see #setNumberColumnsRepeated(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_NumberColumnsRepeated()
	 * @model default="1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-columns-repeated' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberColumnsRepeated();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberColumnsRepeated <em>Number Columns Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Columns Repeated</em>' attribute.
	 * @see #isSetNumberColumnsRepeated()
	 * @see #unsetNumberColumnsRepeated()
	 * @see #getNumberColumnsRepeated()
	 * @generated
	 */
	void setNumberColumnsRepeated(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberColumnsRepeated <em>Number Columns Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberColumnsRepeated()
	 * @see #getNumberColumnsRepeated()
	 * @see #setNumberColumnsRepeated(BigInteger)
	 * @generated
	 */
	void unsetNumberColumnsRepeated();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberColumnsRepeated <em>Number Columns Repeated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Columns Repeated</em>' attribute is set.
	 * @see #unsetNumberColumnsRepeated()
	 * @see #getNumberColumnsRepeated()
	 * @see #setNumberColumnsRepeated(BigInteger)
	 * @generated
	 */
	boolean isSetNumberColumnsRepeated();

	/**
	 * Returns the value of the '<em><b>Number Columns Spanned</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Columns Spanned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Columns Spanned</em>' attribute.
	 * @see #isSetNumberColumnsSpanned()
	 * @see #unsetNumberColumnsSpanned()
	 * @see #setNumberColumnsSpanned(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_NumberColumnsSpanned()
	 * @model default="1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-columns-spanned' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberColumnsSpanned();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberColumnsSpanned <em>Number Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Columns Spanned</em>' attribute.
	 * @see #isSetNumberColumnsSpanned()
	 * @see #unsetNumberColumnsSpanned()
	 * @see #getNumberColumnsSpanned()
	 * @generated
	 */
	void setNumberColumnsSpanned(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberColumnsSpanned <em>Number Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberColumnsSpanned()
	 * @see #getNumberColumnsSpanned()
	 * @see #setNumberColumnsSpanned(BigInteger)
	 * @generated
	 */
	void unsetNumberColumnsSpanned();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberColumnsSpanned <em>Number Columns Spanned</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Columns Spanned</em>' attribute is set.
	 * @see #unsetNumberColumnsSpanned()
	 * @see #getNumberColumnsSpanned()
	 * @see #setNumberColumnsSpanned(BigInteger)
	 * @generated
	 */
	boolean isSetNumberColumnsSpanned();

	/**
	 * Returns the value of the '<em><b>Number Matrix Columns Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Matrix Columns Spanned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Matrix Columns Spanned</em>' attribute.
	 * @see #setNumberMatrixColumnsSpanned(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_NumberMatrixColumnsSpanned()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-matrix-columns-spanned' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberMatrixColumnsSpanned();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberMatrixColumnsSpanned <em>Number Matrix Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Matrix Columns Spanned</em>' attribute.
	 * @see #getNumberMatrixColumnsSpanned()
	 * @generated
	 */
	void setNumberMatrixColumnsSpanned(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Matrix Rows Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Matrix Rows Spanned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Matrix Rows Spanned</em>' attribute.
	 * @see #setNumberMatrixRowsSpanned(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_NumberMatrixRowsSpanned()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-matrix-rows-spanned' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberMatrixRowsSpanned();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberMatrixRowsSpanned <em>Number Matrix Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Matrix Rows Spanned</em>' attribute.
	 * @see #getNumberMatrixRowsSpanned()
	 * @generated
	 */
	void setNumberMatrixRowsSpanned(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Rows Spanned</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Rows Spanned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Rows Spanned</em>' attribute.
	 * @see #isSetNumberRowsSpanned()
	 * @see #unsetNumberRowsSpanned()
	 * @see #setNumberRowsSpanned(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_NumberRowsSpanned()
	 * @model default="1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='number-rows-spanned' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumberRowsSpanned();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberRowsSpanned <em>Number Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Rows Spanned</em>' attribute.
	 * @see #isSetNumberRowsSpanned()
	 * @see #unsetNumberRowsSpanned()
	 * @see #getNumberRowsSpanned()
	 * @generated
	 */
	void setNumberRowsSpanned(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberRowsSpanned <em>Number Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberRowsSpanned()
	 * @see #getNumberRowsSpanned()
	 * @see #setNumberRowsSpanned(BigInteger)
	 * @generated
	 */
	void unsetNumberRowsSpanned();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getNumberRowsSpanned <em>Number Rows Spanned</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Rows Spanned</em>' attribute is set.
	 * @see #unsetNumberRowsSpanned()
	 * @see #getNumberRowsSpanned()
	 * @see #setNumberRowsSpanned(BigInteger)
	 * @generated
	 */
	boolean isSetNumberRowsSpanned();

	/**
	 * Returns the value of the '<em><b>Protect</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protect</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetProtect()
	 * @see #unsetProtect()
	 * @see #setProtect(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_Protect()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='protect' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtect();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getProtect <em>Protect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protect</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetProtect()
	 * @see #unsetProtect()
	 * @see #getProtect()
	 * @generated
	 */
	void setProtect(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getProtect <em>Protect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtect()
	 * @see #getProtect()
	 * @see #setProtect(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetProtect();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getProtect <em>Protect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protect</em>' attribute is set.
	 * @see #unsetProtect()
	 * @see #getProtect()
	 * @see #setProtect(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetProtect();

	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' attribute.
	 * @see #setStringValue(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_StringValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='string-value' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Value</em>' attribute.
	 * @see #setTimeValue(Duration)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_TimeValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration"
	 *        extendedMetaData="kind='attribute' name='time-value' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	Duration getTimeValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getTimeValue <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value</em>' attribute.
	 * @see #getTimeValue()
	 * @generated
	 */
	void setTimeValue(Duration value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_Value()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='value' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1
	 * @see #isSetValueType()
	 * @see #unsetValueType()
	 * @see #setValueType(ValueTypeType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableCellType_ValueType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='value-type' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	ValueTypeType1 getValueType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1
	 * @see #isSetValueType()
	 * @see #unsetValueType()
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ValueTypeType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueType()
	 * @see #getValueType()
	 * @see #setValueType(ValueTypeType1)
	 * @generated
	 */
	void unsetValueType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType#getValueType <em>Value Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Type</em>' attribute is set.
	 * @see #unsetValueType()
	 * @see #getValueType()
	 * @see #setValueType(ValueTypeType1)
	 * @generated
	 */
	boolean isSetValueType();

} // TableCellType
