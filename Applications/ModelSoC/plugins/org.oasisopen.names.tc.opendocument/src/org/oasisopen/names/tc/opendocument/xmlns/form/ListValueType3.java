/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Value Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType3#getTimeValue <em>Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListValueType3()
 * @model extendedMetaData="name='list-value_._3_._type' kind='empty'"
 * @generated
 */
public interface ListValueType3 extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListValueType3_TimeValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration" required="true"
	 *        extendedMetaData="kind='attribute' name='time-value' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	Duration getTimeValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType3#getTimeValue <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value</em>' attribute.
	 * @see #getTimeValue()
	 * @generated
	 */
	void setTimeValue(Duration value);

} // ListValueType3
