/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.EmbeddedTextType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberTypeImpl#getEmbeddedText <em>Embedded Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberTypeImpl#getDecimalPlaces <em>Decimal Places</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberTypeImpl#getDecimalReplacement <em>Decimal Replacement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberTypeImpl#getDisplayFactor <em>Display Factor</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberTypeImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.NumberTypeImpl#getMinIntegerDigits <em>Min Integer Digits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberTypeImpl extends EObjectImpl implements NumberType {
	/**
	 * The cached value of the '{@link #getEmbeddedText() <em>Embedded Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedText()
	 * @generated
	 * @ordered
	 */
	protected EList<EmbeddedTextType> embeddedText;

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
	 * The default value of the '{@link #getDecimalReplacement() <em>Decimal Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalReplacement()
	 * @generated
	 * @ordered
	 */
	protected static final Object DECIMAL_REPLACEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimalReplacement() <em>Decimal Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalReplacement()
	 * @generated
	 * @ordered
	 */
	protected Object decimalReplacement = DECIMAL_REPLACEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayFactor() <em>Display Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPLAY_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getDisplayFactor() <em>Display Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFactor()
	 * @generated
	 * @ordered
	 */
	protected double displayFactor = DISPLAY_FACTOR_EDEFAULT;

	/**
	 * This is true if the Display Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayFactorESet;

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
	protected NumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatastylePackage.Literals.NUMBER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmbeddedTextType> getEmbeddedText() {
		if (embeddedText == null) {
			embeddedText = new EObjectContainmentEList<EmbeddedTextType>(EmbeddedTextType.class, this, DatastylePackage.NUMBER_TYPE__EMBEDDED_TEXT);
		}
		return embeddedText;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.NUMBER_TYPE__DECIMAL_PLACES, oldDecimalPlaces, decimalPlaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDecimalReplacement() {
		return decimalReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalReplacement(Object newDecimalReplacement) {
		Object oldDecimalReplacement = decimalReplacement;
		decimalReplacement = newDecimalReplacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.NUMBER_TYPE__DECIMAL_REPLACEMENT, oldDecimalReplacement, decimalReplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDisplayFactor() {
		return displayFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayFactor(double newDisplayFactor) {
		double oldDisplayFactor = displayFactor;
		displayFactor = newDisplayFactor;
		boolean oldDisplayFactorESet = displayFactorESet;
		displayFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.NUMBER_TYPE__DISPLAY_FACTOR, oldDisplayFactor, displayFactor, !oldDisplayFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayFactor() {
		double oldDisplayFactor = displayFactor;
		boolean oldDisplayFactorESet = displayFactorESet;
		displayFactor = DISPLAY_FACTOR_EDEFAULT;
		displayFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.NUMBER_TYPE__DISPLAY_FACTOR, oldDisplayFactor, DISPLAY_FACTOR_EDEFAULT, oldDisplayFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayFactor() {
		return displayFactorESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.NUMBER_TYPE__GROUPING, oldGrouping, grouping, !oldGroupingESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.NUMBER_TYPE__GROUPING, oldGrouping, GROUPING_EDEFAULT, oldGroupingESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.NUMBER_TYPE__MIN_INTEGER_DIGITS, oldMinIntegerDigits, minIntegerDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatastylePackage.NUMBER_TYPE__EMBEDDED_TEXT:
				return ((InternalEList<?>)getEmbeddedText()).basicRemove(otherEnd, msgs);
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
			case DatastylePackage.NUMBER_TYPE__EMBEDDED_TEXT:
				return getEmbeddedText();
			case DatastylePackage.NUMBER_TYPE__DECIMAL_PLACES:
				return getDecimalPlaces();
			case DatastylePackage.NUMBER_TYPE__DECIMAL_REPLACEMENT:
				return getDecimalReplacement();
			case DatastylePackage.NUMBER_TYPE__DISPLAY_FACTOR:
				return new Double(getDisplayFactor());
			case DatastylePackage.NUMBER_TYPE__GROUPING:
				return getGrouping();
			case DatastylePackage.NUMBER_TYPE__MIN_INTEGER_DIGITS:
				return getMinIntegerDigits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatastylePackage.NUMBER_TYPE__EMBEDDED_TEXT:
				getEmbeddedText().clear();
				getEmbeddedText().addAll((Collection<? extends EmbeddedTextType>)newValue);
				return;
			case DatastylePackage.NUMBER_TYPE__DECIMAL_PLACES:
				setDecimalPlaces((BigInteger)newValue);
				return;
			case DatastylePackage.NUMBER_TYPE__DECIMAL_REPLACEMENT:
				setDecimalReplacement(newValue);
				return;
			case DatastylePackage.NUMBER_TYPE__DISPLAY_FACTOR:
				setDisplayFactor(((Double)newValue).doubleValue());
				return;
			case DatastylePackage.NUMBER_TYPE__GROUPING:
				setGrouping((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DatastylePackage.NUMBER_TYPE__MIN_INTEGER_DIGITS:
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
			case DatastylePackage.NUMBER_TYPE__EMBEDDED_TEXT:
				getEmbeddedText().clear();
				return;
			case DatastylePackage.NUMBER_TYPE__DECIMAL_PLACES:
				setDecimalPlaces(DECIMAL_PLACES_EDEFAULT);
				return;
			case DatastylePackage.NUMBER_TYPE__DECIMAL_REPLACEMENT:
				setDecimalReplacement(DECIMAL_REPLACEMENT_EDEFAULT);
				return;
			case DatastylePackage.NUMBER_TYPE__DISPLAY_FACTOR:
				unsetDisplayFactor();
				return;
			case DatastylePackage.NUMBER_TYPE__GROUPING:
				unsetGrouping();
				return;
			case DatastylePackage.NUMBER_TYPE__MIN_INTEGER_DIGITS:
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
			case DatastylePackage.NUMBER_TYPE__EMBEDDED_TEXT:
				return embeddedText != null && !embeddedText.isEmpty();
			case DatastylePackage.NUMBER_TYPE__DECIMAL_PLACES:
				return DECIMAL_PLACES_EDEFAULT == null ? decimalPlaces != null : !DECIMAL_PLACES_EDEFAULT.equals(decimalPlaces);
			case DatastylePackage.NUMBER_TYPE__DECIMAL_REPLACEMENT:
				return DECIMAL_REPLACEMENT_EDEFAULT == null ? decimalReplacement != null : !DECIMAL_REPLACEMENT_EDEFAULT.equals(decimalReplacement);
			case DatastylePackage.NUMBER_TYPE__DISPLAY_FACTOR:
				return isSetDisplayFactor();
			case DatastylePackage.NUMBER_TYPE__GROUPING:
				return isSetGrouping();
			case DatastylePackage.NUMBER_TYPE__MIN_INTEGER_DIGITS:
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
		result.append(", decimalReplacement: ");
		result.append(decimalReplacement);
		result.append(", displayFactor: ");
		if (displayFactorESet) result.append(displayFactor); else result.append("<unset>");
		result.append(", grouping: ");
		if (groupingESet) result.append(grouping); else result.append("<unset>");
		result.append(", minIntegerDigits: ");
		result.append(minIntegerDigits);
		result.append(')');
		return result.toString();
	}

} //NumberTypeImpl
