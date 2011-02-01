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
 * A representation of the model object '<em><b>SType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.SType#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getSType()
 * @model extendedMetaData="name='s_._type' kind='empty'"
 * @generated
 */
public interface SType extends EObject {
	/**
	 * Returns the value of the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' attribute.
	 * @see #setC(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getSType_C()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='c' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getC();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SType#getC <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' attribute.
	 * @see #getC()
	 * @generated
	 */
	void setC(BigInteger value);

} // SType
