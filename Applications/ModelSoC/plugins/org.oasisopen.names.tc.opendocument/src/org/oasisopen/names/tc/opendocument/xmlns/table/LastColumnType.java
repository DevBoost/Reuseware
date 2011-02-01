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
 * A representation of the model object '<em><b>Last Column Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType#getParagraphStyleName <em>Paragraph Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getLastColumnType()
 * @model extendedMetaData="name='last-column_._type' kind='empty'"
 * @generated
 */
public interface LastColumnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Paragraph Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph Style Name</em>' attribute.
	 * @see #setParagraphStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getLastColumnType_ParagraphStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ParagraphStyleNameType" required="true"
	 *        extendedMetaData="kind='attribute' name='paragraph-style-name' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	String getParagraphStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType#getParagraphStyleName <em>Paragraph Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph Style Name</em>' attribute.
	 * @see #getParagraphStyleName()
	 * @generated
	 */
	void setParagraphStyleName(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getLastColumnType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType8" required="true"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // LastColumnType
