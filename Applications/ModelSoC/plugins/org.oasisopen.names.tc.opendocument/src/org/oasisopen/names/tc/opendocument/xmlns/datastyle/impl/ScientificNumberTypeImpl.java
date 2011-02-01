/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scientific Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.ScientificNumberTypeImpl#getDecimalPlaces <em>Decimal Places</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.ScientificNumberTypeImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.ScientificNumberTypeImpl#getMinExponentDigits <em>Min Exponent Digits</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.ScientificNumberTypeImpl#getMinIntegerDigits <em>Min Integer Digits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScientificNumberTypeImpl extends EObjectImpl implements ScientificNumberType {
	/**
	 * The default value of the '{@link #getDecimalPlaces() <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPlaces()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DECIMAL_PLACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimalPlaces() <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPlaces()
	 * @generated
	 * @ordered
	 */
	protected BigInteger decimalPlaces = DECIMAL_PLACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouping()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean GROUPING_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrouping()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean grouping = GROUPING_EDEFAULT;

	/**
	 * This is true if the Grouping attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupingESet;

	/**
	 * The default value of the '{@link #getMinExponentDigits() <em>Min Exponent Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExponentDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_EXPONENT_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinExponentDigits() <em>Min Exponent Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExponentDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minExponentDigits = MIN_EXPONENT_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinIntegerDigits() <em>Min Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIntegerDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_INTEGER_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinIntegerDigits() <em>Min Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIntegerDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minIntegerDigits = MIN_INTEGER_DIGITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScientificNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatastylePackage.Literals.SCIENTIFIC_NUMBER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDecimalPlaces() {
		return decimalPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalPlaces(BigInteger newDecimalPlaces) {
		BigInteger oldDecimalPlaces = decimalPlaces;
		decimalPlaces = newDecimalPlaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.SCIENTIFIC_NUMBER_TYPE__DECIMAL_PLACES, oldDecimalPlaces, decimalPlaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getGrouping() {
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrouping(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newGrouping) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldGrouping = grouping;
		grouping = newGrouping == null ? GROUPING_EDEFAULT : newGrouping;
		boolean oldGroupingESet = groupingESet;
		groupingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.SCIENTIFIC_NUMBER_TYPE__GROUPING, oldGrouping, grouping, !oldGroupingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGrouping() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldGrouping = grouping;
		boolean oldGroupingESet = groupingESet;
		grouping = GROUPING_EDEFAULT;
		groupingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.SCIENTIFIC_NUMBER_TYPE__GROUPING, oldGrouping, GROUPING_EDEFAULT, oldGroupingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGrouping() {
		return groupingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinExponentDigits() {
		return minExponentDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinExponentDigits(BigInteger newMinExponentDigits) {
		BigInteger oldMinExponentDigits = minExponentDigits;
		minExponentDigits = newMinExponentDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.SCIENTIFIC_NUMBER_TYPE__MIN_EXPONENT_DIGITS, oldMinExponentDigits, minExponentDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinIntegerDigits() {
		return minIntegerDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinIntegerDigits(BigInteger newMinIntegerDigits) {
		BigInteger oldMinIntegerDigits = minIntegerDigits;
		minIntegerDigits = newMinIntegerDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.SCIENTIFIC_NUMBER_TYPE__MIN_INTEGER_DIGITS, oldMinIntegerDigits, minIntegerDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__DECIMAL_PLACES:
				return getDecimalPlaces();
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__GROUPING:
				return getGrouping();
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__MIN_EXPONENT_DIGITS:
				return getMinExponentDigits();
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__MIN_INTEGER_DIGITS:
				return getMinIntegerDigits();
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
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__DECIMAL_PLACES:
				setDecimalPlaces((BigInteger)newValue);
				return;
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__GROUPING:
				setGrouping((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__MIN_EXPONENT_DIGITS:
				setMinExponentDigits((BigInteger)newValue);
				return;
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__MIN_INTEGER_DIGITS:
				setMinIntegerDigits((BigInteger)newValue);
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
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__DECIMAL_PLACES:
				setDecimalPlaces(DECIMAL_PLACES_EDEFAULT);
				return;
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__GROUPING:
				unsetGrouping();
				return;
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__MIN_EXPONENT_DIGITS:
				setMinExponentDigits(MIN_EXPONENT_DIGITS_EDEFAULT);
				return;
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__MIN_INTEGER_DIGITS:
				setMinIntegerDigits(MIN_INTEGER_DIGITS_EDEFAULT);
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
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__DECIMAL_PLACES:
				return DECIMAL_PLACES_EDEFAULT == null ? decimalPlaces != null : !DECIMAL_PLACES_EDEFAULT.equals(decimalPlaces);
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__GROUPING:
				return isSetGrouping();
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__MIN_EXPONENT_DIGITS:
				return MIN_EXPONENT_DIGITS_EDEFAULT == null ? minExponentDigits != null : !MIN_EXPONENT_DIGITS_EDEFAULT.equals(minExponentDigits);
			case DatastylePackage.SCIENTIFIC_NUMBER_TYPE__MIN_INTEGER_DIGITS:
				return MIN_INTEGER_DIGITS_EDEFAULT == null ? minIntegerDigits != null : !MIN_INTEGER_DIGITS_EDEFAULT.equals(minIntegerDigits);
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
		result.append(" (decimalPlaces: ");
		result.append(decimalPlaces);
		result.append(", grouping: ");
		if (groupingESet) result.append(grouping); else result.append("<unset>");
		result.append(", minExponentDigits: ");
		result.append(minExponentDigits);
		result.append(", minIntegerDigits: ");
		result.append(minIntegerDigits);
		result.append(')');
		return result.toString();
	}

} //ScientificNumberTypeImpl
