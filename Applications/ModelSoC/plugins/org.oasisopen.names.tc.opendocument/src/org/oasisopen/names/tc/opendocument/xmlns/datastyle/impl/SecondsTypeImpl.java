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
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seconds Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.SecondsTypeImpl#getDecimalPlaces <em>Decimal Places</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.SecondsTypeImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecondsTypeImpl extends EObjectImpl implements SecondsType {
	/**
	 * The default value of the '{@link #getDecimalPlaces() <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPlaces()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DECIMAL_PLACES_EDEFAULT = new BigInteger("0");

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
	 * This is true if the Decimal Places attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean decimalPlacesESet;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final StyleType STYLE_EDEFAULT = StyleType.SHORT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleType style = STYLE_EDEFAULT;

	/**
	 * This is true if the Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean styleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecondsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatastylePackage.Literals.SECONDS_TYPE;
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
		boolean oldDecimalPlacesESet = decimalPlacesESet;
		decimalPlacesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.SECONDS_TYPE__DECIMAL_PLACES, oldDecimalPlaces, decimalPlaces, !oldDecimalPlacesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDecimalPlaces() {
		BigInteger oldDecimalPlaces = decimalPlaces;
		boolean oldDecimalPlacesESet = decimalPlacesESet;
		decimalPlaces = DECIMAL_PLACES_EDEFAULT;
		decimalPlacesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.SECONDS_TYPE__DECIMAL_PLACES, oldDecimalPlaces, DECIMAL_PLACES_EDEFAULT, oldDecimalPlacesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDecimalPlaces() {
		return decimalPlacesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(StyleType newStyle) {
		StyleType oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		boolean oldStyleESet = styleESet;
		styleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.SECONDS_TYPE__STYLE, oldStyle, style, !oldStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStyle() {
		StyleType oldStyle = style;
		boolean oldStyleESet = styleESet;
		style = STYLE_EDEFAULT;
		styleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.SECONDS_TYPE__STYLE, oldStyle, STYLE_EDEFAULT, oldStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStyle() {
		return styleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatastylePackage.SECONDS_TYPE__DECIMAL_PLACES:
				return getDecimalPlaces();
			case DatastylePackage.SECONDS_TYPE__STYLE:
				return getStyle();
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
			case DatastylePackage.SECONDS_TYPE__DECIMAL_PLACES:
				setDecimalPlaces((BigInteger)newValue);
				return;
			case DatastylePackage.SECONDS_TYPE__STYLE:
				setStyle((StyleType)newValue);
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
			case DatastylePackage.SECONDS_TYPE__DECIMAL_PLACES:
				unsetDecimalPlaces();
				return;
			case DatastylePackage.SECONDS_TYPE__STYLE:
				unsetStyle();
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
			case DatastylePackage.SECONDS_TYPE__DECIMAL_PLACES:
				return isSetDecimalPlaces();
			case DatastylePackage.SECONDS_TYPE__STYLE:
				return isSetStyle();
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
		if (decimalPlacesESet) result.append(decimalPlaces); else result.append("<unset>");
		result.append(", style: ");
		if (styleESet) result.append(style); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SecondsTypeImpl
