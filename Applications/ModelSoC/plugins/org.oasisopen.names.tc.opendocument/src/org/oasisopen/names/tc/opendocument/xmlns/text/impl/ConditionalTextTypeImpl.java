/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ConditionalTextTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ConditionalTextTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ConditionalTextTypeImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ConditionalTextTypeImpl#getStringValueIfFalse <em>String Value If False</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ConditionalTextTypeImpl#getStringValueIfTrue <em>String Value If True</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalTextTypeImpl extends EObjectImpl implements ConditionalTextType {
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
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentValue() <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CURRENT_VALUE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean currentValue = CURRENT_VALUE_EDEFAULT;

	/**
	 * This is true if the Current Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentValueESet;

	/**
	 * The default value of the '{@link #getStringValueIfFalse() <em>String Value If False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValueIfFalse()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_IF_FALSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringValueIfFalse() <em>String Value If False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValueIfFalse()
	 * @generated
	 * @ordered
	 */
	protected String stringValueIfFalse = STRING_VALUE_IF_FALSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringValueIfTrue() <em>String Value If True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValueIfTrue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_IF_TRUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringValueIfTrue() <em>String Value If True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValueIfTrue()
	 * @generated
	 * @ordered
	 */
	protected String stringValueIfTrue = STRING_VALUE_IF_TRUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalTextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getConditionalTextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.CONDITIONAL_TEXT_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.CONDITIONAL_TEXT_TYPE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCurrentValue() {
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCurrentValue) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCurrentValue = currentValue;
		currentValue = newCurrentValue == null ? CURRENT_VALUE_EDEFAULT : newCurrentValue;
		boolean oldCurrentValueESet = currentValueESet;
		currentValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.CONDITIONAL_TEXT_TYPE__CURRENT_VALUE, oldCurrentValue, currentValue, !oldCurrentValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentValue() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCurrentValue = currentValue;
		boolean oldCurrentValueESet = currentValueESet;
		currentValue = CURRENT_VALUE_EDEFAULT;
		currentValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.CONDITIONAL_TEXT_TYPE__CURRENT_VALUE, oldCurrentValue, CURRENT_VALUE_EDEFAULT, oldCurrentValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentValue() {
		return currentValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringValueIfFalse() {
		return stringValueIfFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValueIfFalse(String newStringValueIfFalse) {
		String oldStringValueIfFalse = stringValueIfFalse;
		stringValueIfFalse = newStringValueIfFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.CONDITIONAL_TEXT_TYPE__STRING_VALUE_IF_FALSE, oldStringValueIfFalse, stringValueIfFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringValueIfTrue() {
		return stringValueIfTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValueIfTrue(String newStringValueIfTrue) {
		String oldStringValueIfTrue = stringValueIfTrue;
		stringValueIfTrue = newStringValueIfTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.CONDITIONAL_TEXT_TYPE__STRING_VALUE_IF_TRUE, oldStringValueIfTrue, stringValueIfTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.CONDITIONAL_TEXT_TYPE__MIXED:
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
			case TextPackage.CONDITIONAL_TEXT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.CONDITIONAL_TEXT_TYPE__CONDITION:
				return getCondition();
			case TextPackage.CONDITIONAL_TEXT_TYPE__CURRENT_VALUE:
				return getCurrentValue();
			case TextPackage.CONDITIONAL_TEXT_TYPE__STRING_VALUE_IF_FALSE:
				return getStringValueIfFalse();
			case TextPackage.CONDITIONAL_TEXT_TYPE__STRING_VALUE_IF_TRUE:
				return getStringValueIfTrue();
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
			case TextPackage.CONDITIONAL_TEXT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.CONDITIONAL_TEXT_TYPE__CONDITION:
				setCondition((String)newValue);
				return;
			case TextPackage.CONDITIONAL_TEXT_TYPE__CURRENT_VALUE:
				setCurrentValue((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.CONDITIONAL_TEXT_TYPE__STRING_VALUE_IF_FALSE:
				setStringValueIfFalse((String)newValue);
				return;
			case TextPackage.CONDITIONAL_TEXT_TYPE__STRING_VALUE_IF_TRUE:
				setStringValueIfTrue((String)newValue);
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
			case TextPackage.CONDITIONAL_TEXT_TYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.CONDITIONAL_TEXT_TYPE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case TextPackage.CONDITIONAL_TEXT_TYPE__CURRENT_VALUE:
				unsetCurrentValue();
				return;
			case TextPackage.CONDITIONAL_TEXT_TYPE__STRING_VALUE_IF_FALSE:
				setStringValueIfFalse(STRING_VALUE_IF_FALSE_EDEFAULT);
				return;
			case TextPackage.CONDITIONAL_TEXT_TYPE__STRING_VALUE_IF_TRUE:
				setStringValueIfTrue(STRING_VALUE_IF_TRUE_EDEFAULT);
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
			case TextPackage.CONDITIONAL_TEXT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.CONDITIONAL_TEXT_TYPE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case TextPackage.CONDITIONAL_TEXT_TYPE__CURRENT_VALUE:
				return isSetCurrentValue();
			case TextPackage.CONDITIONAL_TEXT_TYPE__STRING_VALUE_IF_FALSE:
				return STRING_VALUE_IF_FALSE_EDEFAULT == null ? stringValueIfFalse != null : !STRING_VALUE_IF_FALSE_EDEFAULT.equals(stringValueIfFalse);
			case TextPackage.CONDITIONAL_TEXT_TYPE__STRING_VALUE_IF_TRUE:
				return STRING_VALUE_IF_TRUE_EDEFAULT == null ? stringValueIfTrue != null : !STRING_VALUE_IF_TRUE_EDEFAULT.equals(stringValueIfTrue);
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
		result.append(", condition: ");
		result.append(condition);
		result.append(", currentValue: ");
		if (currentValueESet) result.append(currentValue); else result.append("<unset>");
		result.append(", stringValueIfFalse: ");
		result.append(stringValueIfFalse);
		result.append(", stringValueIfTrue: ");
		result.append(stringValueIfTrue);
		result.append(')');
		return result.toString();
	}

} //ConditionalTextTypeImpl
