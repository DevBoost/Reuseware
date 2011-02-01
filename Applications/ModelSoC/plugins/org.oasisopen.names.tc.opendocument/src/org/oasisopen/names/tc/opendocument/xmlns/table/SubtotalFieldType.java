/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtotal Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType#getFieldNumber <em>Field Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSubtotalFieldType()
 * @model extendedMetaData="name='subtotal-field_._type' kind='empty'"
 * @generated
 */
public interface SubtotalFieldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Number</em>' attribute.
	 * @see #setFieldNumber(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSubtotalFieldType_FieldNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='field-number' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFieldNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType#getFieldNumber <em>Field Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Number</em>' attribute.
	 * @see #getFieldNumber()
	 * @generated
	 */
	void setFieldNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSubtotalFieldType_Function()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionType" required="true"
	 *        extendedMetaData="kind='attribute' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getFunction();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Object value);

} // SubtotalFieldType
