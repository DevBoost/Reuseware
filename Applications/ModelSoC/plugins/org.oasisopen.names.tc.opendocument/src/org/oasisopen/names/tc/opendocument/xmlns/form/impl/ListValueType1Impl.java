/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Value Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.ListValueType1Impl#getBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListValueType1Impl extends EObjectImpl implements ListValueType1 {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListValueType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.eINSTANCE.getListValueType1();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.LIST_VALUE_TYPE1__BOOLEAN_VALUE, oldBooleanValue, booleanValue, !oldBooleanValueESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.LIST_VALUE_TYPE1__BOOLEAN_VALUE, oldBooleanValue, BOOLEAN_VALUE_EDEFAULT, oldBooleanValueESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.LIST_VALUE_TYPE1__BOOLEAN_VALUE:
				return getBooleanValue();
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
			case FormPackage.LIST_VALUE_TYPE1__BOOLEAN_VALUE:
				setBooleanValue((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case FormPackage.LIST_VALUE_TYPE1__BOOLEAN_VALUE:
				unsetBooleanValue();
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
			case FormPackage.LIST_VALUE_TYPE1__BOOLEAN_VALUE:
				return isSetBooleanValue();
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
		result.append(')');
		return result.toString();
	}

} //ListValueType1Impl
