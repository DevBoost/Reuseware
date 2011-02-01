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
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType;
import org.oasisopen.names.tc.opendocument.xmlns.text.GradientStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gradient Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl#getEndColor <em>End Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl#getEndIntensity <em>End Intensity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl#getStartColor <em>Start Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl#getStartIntensity <em>Start Intensity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.GradientTypeImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradientTypeImpl extends EObjectImpl implements GradientType {
	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected BigInteger angle = ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected String border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected static final String CX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected String cx = CX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected static final String CY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected String cy = CY_EDEFAULT;

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
	 * The default value of the '{@link #getEndColor() <em>End Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColor()
	 * @generated
	 * @ordered
	 */
	protected static final String END_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndColor() <em>End Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColor()
	 * @generated
	 * @ordered
	 */
	protected String endColor = END_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndIntensity() <em>End Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final String END_INTENSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndIntensity() <em>End Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndIntensity()
	 * @generated
	 * @ordered
	 */
	protected String endIntensity = END_INTENSITY_EDEFAULT;

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
	 * The default value of the '{@link #getStartColor() <em>Start Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColor()
	 * @generated
	 * @ordered
	 */
	protected static final String START_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartColor() <em>Start Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColor()
	 * @generated
	 * @ordered
	 */
	protected String startColor = START_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartIntensity() <em>Start Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final String START_INTENSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartIntensity() <em>Start Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIntensity()
	 * @generated
	 * @ordered
	 */
	protected String startIntensity = START_INTENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final GradientStyle STYLE_EDEFAULT = GradientStyle.LINEAR;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected GradientStyle style = STYLE_EDEFAULT;

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
	protected GradientTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getGradientType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(BigInteger newAngle) {
		BigInteger oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GRADIENT_TYPE__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(String newBorder) {
		String oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GRADIENT_TYPE__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCx() {
		return cx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCx(String newCx) {
		String oldCx = cx;
		cx = newCx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GRADIENT_TYPE__CX, oldCx, cx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCy() {
		return cy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCy(String newCy) {
		String oldCy = cy;
		cy = newCy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GRADIENT_TYPE__CY, oldCy, cy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GRADIENT_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndColor() {
		return endColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndColor(String newEndColor) {
		String oldEndColor = endColor;
		endColor = newEndColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GRADIENT_TYPE__END_COLOR, oldEndColor, endColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndIntensity() {
		return endIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndIntensity(String newEndIntensity) {
		String oldEndIntensity = endIntensity;
		endIntensity = newEndIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GRADIENT_TYPE__END_INTENSITY, oldEndIntensity, endIntensity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GRADIENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartColor() {
		return startColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartColor(String newStartColor) {
		String oldStartColor = startColor;
		startColor = newStartColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GRADIENT_TYPE__START_COLOR, oldStartColor, startColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartIntensity() {
		return startIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartIntensity(String newStartIntensity) {
		String oldStartIntensity = startIntensity;
		startIntensity = newStartIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GRADIENT_TYPE__START_INTENSITY, oldStartIntensity, startIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientStyle getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(GradientStyle newStyle) {
		GradientStyle oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		boolean oldStyleESet = styleESet;
		styleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.GRADIENT_TYPE__STYLE, oldStyle, style, !oldStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStyle() {
		GradientStyle oldStyle = style;
		boolean oldStyleESet = styleESet;
		style = STYLE_EDEFAULT;
		styleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.GRADIENT_TYPE__STYLE, oldStyle, STYLE_EDEFAULT, oldStyleESet));
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
			case DrawingPackage.GRADIENT_TYPE__ANGLE:
				return getAngle();
			case DrawingPackage.GRADIENT_TYPE__BORDER:
				return getBorder();
			case DrawingPackage.GRADIENT_TYPE__CX:
				return getCx();
			case DrawingPackage.GRADIENT_TYPE__CY:
				return getCy();
			case DrawingPackage.GRADIENT_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case DrawingPackage.GRADIENT_TYPE__END_COLOR:
				return getEndColor();
			case DrawingPackage.GRADIENT_TYPE__END_INTENSITY:
				return getEndIntensity();
			case DrawingPackage.GRADIENT_TYPE__NAME:
				return getName();
			case DrawingPackage.GRADIENT_TYPE__START_COLOR:
				return getStartColor();
			case DrawingPackage.GRADIENT_TYPE__START_INTENSITY:
				return getStartIntensity();
			case DrawingPackage.GRADIENT_TYPE__STYLE:
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
			case DrawingPackage.GRADIENT_TYPE__ANGLE:
				setAngle((BigInteger)newValue);
				return;
			case DrawingPackage.GRADIENT_TYPE__BORDER:
				setBorder((String)newValue);
				return;
			case DrawingPackage.GRADIENT_TYPE__CX:
				setCx((String)newValue);
				return;
			case DrawingPackage.GRADIENT_TYPE__CY:
				setCy((String)newValue);
				return;
			case DrawingPackage.GRADIENT_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case DrawingPackage.GRADIENT_TYPE__END_COLOR:
				setEndColor((String)newValue);
				return;
			case DrawingPackage.GRADIENT_TYPE__END_INTENSITY:
				setEndIntensity((String)newValue);
				return;
			case DrawingPackage.GRADIENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case DrawingPackage.GRADIENT_TYPE__START_COLOR:
				setStartColor((String)newValue);
				return;
			case DrawingPackage.GRADIENT_TYPE__START_INTENSITY:
				setStartIntensity((String)newValue);
				return;
			case DrawingPackage.GRADIENT_TYPE__STYLE:
				setStyle((GradientStyle)newValue);
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
			case DrawingPackage.GRADIENT_TYPE__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case DrawingPackage.GRADIENT_TYPE__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case DrawingPackage.GRADIENT_TYPE__CX:
				setCx(CX_EDEFAULT);
				return;
			case DrawingPackage.GRADIENT_TYPE__CY:
				setCy(CY_EDEFAULT);
				return;
			case DrawingPackage.GRADIENT_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case DrawingPackage.GRADIENT_TYPE__END_COLOR:
				setEndColor(END_COLOR_EDEFAULT);
				return;
			case DrawingPackage.GRADIENT_TYPE__END_INTENSITY:
				setEndIntensity(END_INTENSITY_EDEFAULT);
				return;
			case DrawingPackage.GRADIENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DrawingPackage.GRADIENT_TYPE__START_COLOR:
				setStartColor(START_COLOR_EDEFAULT);
				return;
			case DrawingPackage.GRADIENT_TYPE__START_INTENSITY:
				setStartIntensity(START_INTENSITY_EDEFAULT);
				return;
			case DrawingPackage.GRADIENT_TYPE__STYLE:
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
			case DrawingPackage.GRADIENT_TYPE__ANGLE:
				return ANGLE_EDEFAULT == null ? angle != null : !ANGLE_EDEFAULT.equals(angle);
			case DrawingPackage.GRADIENT_TYPE__BORDER:
				return BORDER_EDEFAULT == null ? border != null : !BORDER_EDEFAULT.equals(border);
			case DrawingPackage.GRADIENT_TYPE__CX:
				return CX_EDEFAULT == null ? cx != null : !CX_EDEFAULT.equals(cx);
			case DrawingPackage.GRADIENT_TYPE__CY:
				return CY_EDEFAULT == null ? cy != null : !CY_EDEFAULT.equals(cy);
			case DrawingPackage.GRADIENT_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case DrawingPackage.GRADIENT_TYPE__END_COLOR:
				return END_COLOR_EDEFAULT == null ? endColor != null : !END_COLOR_EDEFAULT.equals(endColor);
			case DrawingPackage.GRADIENT_TYPE__END_INTENSITY:
				return END_INTENSITY_EDEFAULT == null ? endIntensity != null : !END_INTENSITY_EDEFAULT.equals(endIntensity);
			case DrawingPackage.GRADIENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DrawingPackage.GRADIENT_TYPE__START_COLOR:
				return START_COLOR_EDEFAULT == null ? startColor != null : !START_COLOR_EDEFAULT.equals(startColor);
			case DrawingPackage.GRADIENT_TYPE__START_INTENSITY:
				return START_INTENSITY_EDEFAULT == null ? startIntensity != null : !START_INTENSITY_EDEFAULT.equals(startIntensity);
			case DrawingPackage.GRADIENT_TYPE__STYLE:
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
		result.append(" (angle: ");
		result.append(angle);
		result.append(", border: ");
		result.append(border);
		result.append(", cx: ");
		result.append(cx);
		result.append(", cy: ");
		result.append(cy);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", endColor: ");
		result.append(endColor);
		result.append(", endIntensity: ");
		result.append(endIntensity);
		result.append(", name: ");
		result.append(name);
		result.append(", startColor: ");
		result.append(startColor);
		result.append(", startIntensity: ");
		result.append(startIntensity);
		result.append(", style: ");
		if (styleESet) result.append(style); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GradientTypeImpl
