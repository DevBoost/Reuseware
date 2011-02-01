/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserDefinedType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Defined Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserDefinedTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserDefinedTypeImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserDefinedTypeImpl#getDataStyleName <em>Data Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserDefinedTypeImpl#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserDefinedTypeImpl#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserDefinedTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserDefinedTypeImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserDefinedTypeImpl#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserDefinedTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserDefinedTypeImpl extends EObjectImpl implements UserDefinedType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

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
	 * The default value of the '{@link #getDataStyleName() <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataStyleName() <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStyleName()
	 * @generated
	 * @ordered
	 */
	protected String dataStyleName = DATA_STYLE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FIXED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean fixed = FIXED_EDEFAULT;

	/**
	 * This is true if the Fixed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixedESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDefinedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getUserDefinedType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.USER_DEFINED_TYPE__MIXED);
		}
		return mixed;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_DEFINED_TYPE__BOOLEAN_VALUE, oldBooleanValue, booleanValue, !oldBooleanValueESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.USER_DEFINED_TYPE__BOOLEAN_VALUE, oldBooleanValue, BOOLEAN_VALUE_EDEFAULT, oldBooleanValueESet));
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
	public String getDataStyleName() {
		return dataStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStyleName(String newDataStyleName) {
		String oldDataStyleName = dataStyleName;
		dataStyleName = newDataStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_DEFINED_TYPE__DATA_STYLE_NAME, oldDataStyleName, dataStyleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_DEFINED_TYPE__DATE_VALUE, oldDateValue, dateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFixed() {
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newFixed) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFixed = fixed;
		fixed = newFixed == null ? FIXED_EDEFAULT : newFixed;
		boolean oldFixedESet = fixedESet;
		fixedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_DEFINED_TYPE__FIXED, oldFixed, fixed, !oldFixedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFixed() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFixed = fixed;
		boolean oldFixedESet = fixedESet;
		fixed = FIXED_EDEFAULT;
		fixedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.USER_DEFINED_TYPE__FIXED, oldFixed, FIXED_EDEFAULT, oldFixedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFixed() {
		return fixedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_DEFINED_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_DEFINED_TYPE__STRING_VALUE, oldStringValue, stringValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_DEFINED_TYPE__TIME_VALUE, oldTimeValue, timeValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_DEFINED_TYPE__VALUE, oldValue, value, !oldValueESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.USER_DEFINED_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.USER_DEFINED_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextPackage.USER_DEFINED_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.USER_DEFINED_TYPE__BOOLEAN_VALUE:
				return getBooleanValue();
			case TextPackage.USER_DEFINED_TYPE__DATA_STYLE_NAME:
				return getDataStyleName();
			case TextPackage.USER_DEFINED_TYPE__DATE_VALUE:
				return getDateValue();
			case TextPackage.USER_DEFINED_TYPE__FIXED:
				return getFixed();
			case TextPackage.USER_DEFINED_TYPE__NAME:
				return getName();
			case TextPackage.USER_DEFINED_TYPE__STRING_VALUE:
				return getStringValue();
			case TextPackage.USER_DEFINED_TYPE__TIME_VALUE:
				return getTimeValue();
			case TextPackage.USER_DEFINED_TYPE__VALUE:
				return new Double(getValue());
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
			case TextPackage.USER_DEFINED_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.USER_DEFINED_TYPE__BOOLEAN_VALUE:
				setBooleanValue((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.USER_DEFINED_TYPE__DATA_STYLE_NAME:
				setDataStyleName((String)newValue);
				return;
			case TextPackage.USER_DEFINED_TYPE__DATE_VALUE:
				setDateValue((XMLGregorianCalendar)newValue);
				return;
			case TextPackage.USER_DEFINED_TYPE__FIXED:
				setFixed((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.USER_DEFINED_TYPE__NAME:
				setName((String)newValue);
				return;
			case TextPackage.USER_DEFINED_TYPE__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case TextPackage.USER_DEFINED_TYPE__TIME_VALUE:
				setTimeValue((Duration)newValue);
				return;
			case TextPackage.USER_DEFINED_TYPE__VALUE:
				setValue(((Double)newValue).doubleValue());
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
			case TextPackage.USER_DEFINED_TYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.USER_DEFINED_TYPE__BOOLEAN_VALUE:
				unsetBooleanValue();
				return;
			case TextPackage.USER_DEFINED_TYPE__DATA_STYLE_NAME:
				setDataStyleName(DATA_STYLE_NAME_EDEFAULT);
				return;
			case TextPackage.USER_DEFINED_TYPE__DATE_VALUE:
				setDateValue(DATE_VALUE_EDEFAULT);
				return;
			case TextPackage.USER_DEFINED_TYPE__FIXED:
				unsetFixed();
				return;
			case TextPackage.USER_DEFINED_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TextPackage.USER_DEFINED_TYPE__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
				return;
			case TextPackage.USER_DEFINED_TYPE__TIME_VALUE:
				setTimeValue(TIME_VALUE_EDEFAULT);
				return;
			case TextPackage.USER_DEFINED_TYPE__VALUE:
				unsetValue();
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
			case TextPackage.USER_DEFINED_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.USER_DEFINED_TYPE__BOOLEAN_VALUE:
				return isSetBooleanValue();
			case TextPackage.USER_DEFINED_TYPE__DATA_STYLE_NAME:
				return DATA_STYLE_NAME_EDEFAULT == null ? dataStyleName != null : !DATA_STYLE_NAME_EDEFAULT.equals(dataStyleName);
			case TextPackage.USER_DEFINED_TYPE__DATE_VALUE:
				return DATE_VALUE_EDEFAULT == null ? dateValue != null : !DATE_VALUE_EDEFAULT.equals(dateValue);
			case TextPackage.USER_DEFINED_TYPE__FIXED:
				return isSetFixed();
			case TextPackage.USER_DEFINED_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TextPackage.USER_DEFINED_TYPE__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
			case TextPackage.USER_DEFINED_TYPE__TIME_VALUE:
				return TIME_VALUE_EDEFAULT == null ? timeValue != null : !TIME_VALUE_EDEFAULT.equals(timeValue);
			case TextPackage.USER_DEFINED_TYPE__VALUE:
				return isSetValue();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", booleanValue: ");
		if (booleanValueESet) result.append(booleanValue); else result.append("<unset>");
		result.append(", dataStyleName: ");
		result.append(dataStyleName);
		result.append(", dateValue: ");
		result.append(dateValue);
		result.append(", fixed: ");
		if (fixedESet) result.append(fixed); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", stringValue: ");
		result.append(stringValue);
		result.append(", timeValue: ");
		result.append(timeValue);
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserDefinedTypeImpl
