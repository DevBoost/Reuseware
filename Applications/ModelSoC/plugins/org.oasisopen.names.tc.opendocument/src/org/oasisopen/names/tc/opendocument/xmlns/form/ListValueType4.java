/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Value Type4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListValueType4()
 * @model extendedMetaData="name='list-value_._4_._type' kind='empty'"
 * @generated
 */
public interface ListValueType4 extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListValueType4_Currency()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='currency' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListValueType4_Value()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='value' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	boolean isSetValue();

} // ListValueType4