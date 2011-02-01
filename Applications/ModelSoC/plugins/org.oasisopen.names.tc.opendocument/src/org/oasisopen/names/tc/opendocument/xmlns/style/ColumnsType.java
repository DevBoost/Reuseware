/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Columns Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumnSep <em>Column Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumn <em>Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumnCount <em>Column Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumnGap <em>Column Gap</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnsType()
 * @model extendedMetaData="name='columns_._type' kind='elementOnly'"
 * @generated
 */
public interface ColumnsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Sep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Sep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Sep</em>' containment reference.
	 * @see #setColumnSep(ColumnSepType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnsType_ColumnSep()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='column-sep' namespace='##targetNamespace'"
	 * @generated
	 */
	ColumnSepType getColumnSep();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumnSep <em>Column Sep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Sep</em>' containment reference.
	 * @see #getColumnSep()
	 * @generated
	 */
	void setColumnSep(ColumnSepType value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnsType_Column()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColumnType> getColumn();

	/**
	 * Returns the value of the '<em><b>Column Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Count</em>' attribute.
	 * @see #setColumnCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnsType_ColumnCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='column-count' namespace='urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0'"
	 * @generated
	 */
	BigInteger getColumnCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumnCount <em>Column Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Count</em>' attribute.
	 * @see #getColumnCount()
	 * @generated
	 */
	void setColumnCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Column Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Gap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Gap</em>' attribute.
	 * @see #setColumnGap(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnsType_ColumnGap()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='column-gap' namespace='urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0'"
	 * @generated
	 */
	String getColumnGap();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType#getColumnGap <em>Column Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Gap</em>' attribute.
	 * @see #getColumnGap()
	 * @generated
	 */
	void setColumnGap(String value);

} // ColumnsType
