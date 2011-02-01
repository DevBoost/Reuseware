/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stroke Dash Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.StrokeDashType1Impl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.StrokeDashType1Impl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.StrokeDashType1Impl#getDots1 <em>Dots1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.StrokeDashType1Impl#getDots1Length <em>Dots1 Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.StrokeDashType1Impl#getDots2 <em>Dots2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.StrokeDashType1Impl#getDots2Length <em>Dots2 Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.StrokeDashType1Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.StrokeDashType1Impl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrokeDashType1Impl extends EObjectImpl implements StrokeDashType1 {
	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected String distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDots1() <em>Dots1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DOTS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDots1() <em>Dots1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dots1 = DOTS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDots1Length() <em>Dots1 Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots1Length()
	 * @generated
	 * @ordered
	 */
	protected static final String DOTS1_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDots1Length() <em>Dots1 Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots1Length()
	 * @generated
	 * @ordered
	 */
	protected String dots1Length = DOTS1_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDots2() <em>Dots2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots2()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DOTS2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDots2() <em>Dots2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots2()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dots2 = DOTS2_EDEFAULT;

	/**
	 * The default value of the '{@link #getDots2Length() <em>Dots2 Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots2Length()
	 * @generated
	 * @ordered
	 */
	protected static final String DOTS2_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDots2Length() <em>Dots2 Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots2Length()
	 * @generated
	 * @ordered
	 */
	protected String dots2Length = DOTS2_LENGTH_EDEFAULT;

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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final StyleType STYLE_EDEFAULT = StyleType.RECT;

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
	protected StrokeDashType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getStrokeDashType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.STROKE_DASH_TYPE1__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(String newDistance) {
		String oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.STROKE_DASH_TYPE1__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDots1() {
		return dots1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDots1(BigInteger newDots1) {
		BigInteger oldDots1 = dots1;
		dots1 = newDots1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.STROKE_DASH_TYPE1__DOTS1, oldDots1, dots1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDots1Length() {
		return dots1Length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDots1Length(String newDots1Length) {
		String oldDots1Length = dots1Length;
		dots1Length = newDots1Length;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.STROKE_DASH_TYPE1__DOTS1_LENGTH, oldDots1Length, dots1Length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDots2() {
		return dots2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDots2(BigInteger newDots2) {
		BigInteger oldDots2 = dots2;
		dots2 = newDots2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.STROKE_DASH_TYPE1__DOTS2, oldDots2, dots2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDots2Length() {
		return dots2Length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDots2Length(String newDots2Length) {
		String oldDots2Length = dots2Length;
		dots2Length = newDots2Length;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.STROKE_DASH_TYPE1__DOTS2_LENGTH, oldDots2Length, dots2Length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.STROKE_DASH_TYPE1__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.STROKE_DASH_TYPE1__STYLE, oldStyle, style, !oldStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.STROKE_DASH_TYPE1__STYLE, oldStyle, STYLE_EDEFAULT, oldStyleESet));
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
			case DrawingPackage.STROKE_DASH_TYPE1__DISPLAY_NAME:
				return getDisplayName();
			case DrawingPackage.STROKE_DASH_TYPE1__DISTANCE:
				return getDistance();
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS1:
				return getDots1();
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS1_LENGTH:
				return getDots1Length();
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS2:
				return getDots2();
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS2_LENGTH:
				return getDots2Length();
			case DrawingPackage.STROKE_DASH_TYPE1__NAME:
				return getName();
			case DrawingPackage.STROKE_DASH_TYPE1__STYLE:
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
			case DrawingPackage.STROKE_DASH_TYPE1__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__DISTANCE:
				setDistance((String)newValue);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS1:
				setDots1((BigInteger)newValue);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS1_LENGTH:
				setDots1Length((String)newValue);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS2:
				setDots2((BigInteger)newValue);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS2_LENGTH:
				setDots2Length((String)newValue);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__NAME:
				setName((String)newValue);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__STYLE:
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
			case DrawingPackage.STROKE_DASH_TYPE1__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS1:
				setDots1(DOTS1_EDEFAULT);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS1_LENGTH:
				setDots1Length(DOTS1_LENGTH_EDEFAULT);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS2:
				setDots2(DOTS2_EDEFAULT);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS2_LENGTH:
				setDots2Length(DOTS2_LENGTH_EDEFAULT);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DrawingPackage.STROKE_DASH_TYPE1__STYLE:
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
			case DrawingPackage.STROKE_DASH_TYPE1__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case DrawingPackage.STROKE_DASH_TYPE1__DISTANCE:
				return DISTANCE_EDEFAULT == null ? distance != null : !DISTANCE_EDEFAULT.equals(distance);
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS1:
				return DOTS1_EDEFAULT == null ? dots1 != null : !DOTS1_EDEFAULT.equals(dots1);
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS1_LENGTH:
				return DOTS1_LENGTH_EDEFAULT == null ? dots1Length != null : !DOTS1_LENGTH_EDEFAULT.equals(dots1Length);
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS2:
				return DOTS2_EDEFAULT == null ? dots2 != null : !DOTS2_EDEFAULT.equals(dots2);
			case DrawingPackage.STROKE_DASH_TYPE1__DOTS2_LENGTH:
				return DOTS2_LENGTH_EDEFAULT == null ? dots2Length != null : !DOTS2_LENGTH_EDEFAULT.equals(dots2Length);
			case DrawingPackage.STROKE_DASH_TYPE1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DrawingPackage.STROKE_DASH_TYPE1__STYLE:
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
		result.append(" (displayName: ");
		result.append(displayName);
		result.append(", distance: ");
		result.append(distance);
		result.append(", dots1: ");
		result.append(dots1);
		result.append(", dots1Length: ");
		result.append(dots1Length);
		result.append(", dots2: ");
		result.append(dots2);
		result.append(", dots2Length: ");
		result.append(dots2Length);
		result.append(", name: ");
		result.append(name);
		result.append(", style: ");
		if (styleESet) result.append(style); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StrokeDashType1Impl
