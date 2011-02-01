/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form.impl;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertyTypeImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertyTypeImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertyTypeImpl#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertyTypeImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertyTypeImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertyTypeImpl#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertyTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertyTypeImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyTypeImpl extends EObjectImpl implements PropertyType {
	/**
	 * The default value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean BOOLEAN_VALUE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean booleanValue = BOOLEAN_VALUE_EDEFAULT;

	/**
	 * This is true if the Boolean Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean booleanValueESet;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected String currency = CURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateValue() <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValue()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateValue() <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValue()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateValue = DATE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected String stringValue = STRING_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeValue() <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected static final Duration TIME_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeValue() <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected Duration timeValue = TIME_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final ValueTypeType VALUE_TYPE_EDEFAULT = ValueTypeType.FLOAT;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected ValueTypeType valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * This is true if the Value Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.eINSTANCE.getPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBooleanValue() {
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newBooleanValue) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBooleanValue = booleanValue;
		booleanValue = newBooleanValue == null ? BOOLEAN_VALUE_EDEFAULT : newBooleanValue;
		boolean oldBooleanValueESet = booleanValueESet;
		booleanValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.PROPERTY_TYPE__BOOLEAN_VALUE, oldBooleanValue, booleanValue, !oldBooleanValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBooleanValue() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBooleanValue = booleanValue;
		boolean oldBooleanValueESet = booleanValueESet;
		booleanValue = BOOLEAN_VALUE_EDEFAULT;
		booleanValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.PROPERTY_TYPE__BOOLEAN_VALUE, oldBooleanValue, BOOLEAN_VALUE_EDEFAULT, oldBooleanValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBooleanValue() {
		return booleanValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(String newCurrency) {
		String oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.PROPERTY_TYPE__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateValue() {
		return dateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateValue(XMLGregorianCalendar newDateValue) {
		XMLGregorianCalendar oldDateValue = dateValue;
		dateValue = newDateValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.PROPERTY_TYPE__DATE_VALUE, oldDateValue, dateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.PROPERTY_TYPE__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(String newStringValue) {
		String oldStringValue = stringValue;
		stringValue = newStringValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.PROPERTY_TYPE__STRING_VALUE, oldStringValue, stringValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimeValue() {
		return timeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeValue(Duration newTimeValue) {
		Duration oldTimeValue = timeValue;
		timeValue = newTimeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.PROPERTY_TYPE__TIME_VALUE, oldTimeValue, timeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.PROPERTY_TYPE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		double oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.PROPERTY_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(ValueTypeType newValueType) {
		ValueTypeType oldValueType = valueType;
		valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
		boolean oldValueTypeESet = valueTypeESet;
		valueTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.PROPERTY_TYPE__VALUE_TYPE, oldValueType, valueType, !oldValueTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValueType() {
		ValueTypeType oldValueType = valueType;
		boolean oldValueTypeESet = valueTypeESet;
		valueType = VALUE_TYPE_EDEFAULT;
		valueTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.PROPERTY_TYPE__VALUE_TYPE, oldValueType, VALUE_TYPE_EDEFAULT, oldValueTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValueType() {
		return valueTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.PROPERTY_TYPE__BOOLEAN_VALUE:
				return getBooleanValue();
			case FormPackage.PROPERTY_TYPE__CURRENCY:
				return getCurrency();
			case FormPackage.PROPERTY_TYPE__DATE_VALUE:
				return getDateValue();
			case FormPackage.PROPERTY_TYPE__PROPERTY_NAME:
				return getPropertyName();
			case FormPackage.PROPERTY_TYPE__STRING_VALUE:
				return getStringValue();
			case FormPackage.PROPERTY_TYPE__TIME_VALUE:
				return getTimeValue();
			case FormPackage.PROPERTY_TYPE__VALUE:
				return new Double(getValue());
			case FormPackage.PROPERTY_TYPE__VALUE_TYPE:
				return getValueType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormPackage.PROPERTY_TYPE__BOOLEAN_VALUE:
				setBooleanValue((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.PROPERTY_TYPE__CURRENCY:
				setCurrency((String)newValue);
				return;
			case FormPackage.PROPERTY_TYPE__DATE_VALUE:
				setDateValue((XMLGregorianCalendar)newValue);
				return;
			case FormPackage.PROPERTY_TYPE__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case FormPackage.PROPERTY_TYPE__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case FormPackage.PROPERTY_TYPE__TIME_VALUE:
				setTimeValue((Duration)newValue);
				return;
			case FormPackage.PROPERTY_TYPE__VALUE:
				setValue(((Double)newValue).doubleValue());
				return;
			case FormPackage.PROPERTY_TYPE__VALUE_TYPE:
				setValueType((ValueTypeType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FormPackage.PROPERTY_TYPE__BOOLEAN_VALUE:
				unsetBooleanValue();
				return;
			case FormPackage.PROPERTY_TYPE__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case FormPackage.PROPERTY_TYPE__DATE_VALUE:
				setDateValue(DATE_VALUE_EDEFAULT);
				return;
			case FormPackage.PROPERTY_TYPE__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case FormPackage.PROPERTY_TYPE__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
				return;
			case FormPackage.PROPERTY_TYPE__TIME_VALUE:
				setTimeValue(TIME_VALUE_EDEFAULT);
				return;
			case FormPackage.PROPERTY_TYPE__VALUE:
				unsetValue();
				return;
			case FormPackage.PROPERTY_TYPE__VALUE_TYPE:
				unsetValueType();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FormPackage.PROPERTY_TYPE__BOOLEAN_VALUE:
				return isSetBooleanValue();
			case FormPackage.PROPERTY_TYPE__CURRENCY:
				return CURRENCY_EDEFAULT == null ? currency != null : !CURRENCY_EDEFAULT.equals(currency);
			case FormPackage.PROPERTY_TYPE__DATE_VALUE:
				return DATE_VALUE_EDEFAULT == null ? dateValue != null : !DATE_VALUE_EDEFAULT.equals(dateValue);
			case FormPackage.PROPERTY_TYPE__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case FormPackage.PROPERTY_TYPE__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
			case FormPackage.PROPERTY_TYPE__TIME_VALUE:
				return TIME_VALUE_EDEFAULT == null ? timeValue != null : !TIME_VALUE_EDEFAULT.equals(timeValue);
			case FormPackage.PROPERTY_TYPE__VALUE:
				return isSetValue();
			case FormPackage.PROPERTY_TYPE__VALUE_TYPE:
				return isSetValueType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (booleanValue: ");
		if (booleanValueESet) result.append(booleanValue); else result.append("<unset>");
		result.append(", currency: ");
		result.append(currency);
		result.append(", dateValue: ");
		result.append(dateValue);
		result.append(", propertyName: ");
		result.append(propertyName);
		result.append(", stringValue: ");
		result.append(stringValue);
		result.append(", timeValue: ");
		result.append(timeValue);
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", valueType: ");
		if (valueTypeESet) result.append(valueType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PropertyTypeImpl
