/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getPropertyType()
 * @model extendedMetaData="name='property_._type' kind='empty'"
 * @generated
 */
public interface PropertyType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getPropertyType_BooleanValue()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='boolean-value' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBooleanValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getBooleanValue <em>Boolean Value</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBooleanValue()
	 * @see #getBooleanValue()
	 * @see #setBooleanValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetBooleanValue();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getBooleanValue <em>Boolean Value</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getPropertyType_Currency()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='currency' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getCurrency <em>Currency</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getPropertyType_DateValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.DateOrDateTime"
	 *        extendedMetaData="kind='attribute' name='date-value' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	XMLGregorianCalendar getDateValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getDateValue <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Value</em>' attribute.
	 * @see #getDateValue()
	 * @generated
	 */
	void setDateValue(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getPropertyType_PropertyName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='property-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getPropertyType_StringValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='string-value' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getPropertyType_TimeValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration"
	 *        extendedMetaData="kind='attribute' name='time-value' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	Duration getTimeValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getTimeValue <em>Time Value</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getPropertyType_Value()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='value' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getValue <em>Value</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType
	 * @see #isSetValueType()
	 * @see #unsetValueType()
	 * @see #setValueType(ValueTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getPropertyType_ValueType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='value-type' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	ValueTypeType getValueType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType
	 * @see #isSetValueType()
	 * @see #unsetValueType()
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ValueTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueType()
	 * @see #getValueType()
	 * @see #setValueType(ValueTypeType)
	 * @generated
	 */
	void unsetValueType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType#getValueType <em>Value Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Type</em>' attribute is set.
	 * @see #unsetValueType()
	 * @see #getValueType()
	 * @see #setValueType(ValueTypeType)
	 * @generated
	 */
	boolean isSetValueType();

} // PropertyType
