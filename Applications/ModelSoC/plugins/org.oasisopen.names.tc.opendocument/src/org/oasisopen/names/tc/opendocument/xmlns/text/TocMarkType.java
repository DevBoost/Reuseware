/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toc Mark Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkType#getOutlineLevel <em>Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkType#getStringValue <em>String Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTocMarkType()
 * @model extendedMetaData="name='toc-mark_._type' kind='empty'"
 * @generated
 */
public interface TocMarkType extends EObject {
	/**
	 * Returns the value of the '<em><b>Outline Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline Level</em>' attribute.
	 * @see #setOutlineLevel(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTocMarkType_OutlineLevel()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='outline-level' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOutlineLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkType#getOutlineLevel <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline Level</em>' attribute.
	 * @see #getOutlineLevel()
	 * @generated
	 */
	void setOutlineLevel(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTocMarkType_StringValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='string-value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkType#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

} // TocMarkType
