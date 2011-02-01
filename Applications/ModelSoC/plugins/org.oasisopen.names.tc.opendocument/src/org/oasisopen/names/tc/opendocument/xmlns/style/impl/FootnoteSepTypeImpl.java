/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Footnote Sep Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FootnoteSepTypeImpl#getAdjustment <em>Adjustment</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FootnoteSepTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FootnoteSepTypeImpl#getDistanceAfterSep <em>Distance After Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FootnoteSepTypeImpl#getDistanceBeforeSep <em>Distance Before Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FootnoteSepTypeImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FootnoteSepTypeImpl#getRelWidth <em>Rel Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FootnoteSepTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FootnoteSepTypeImpl extends EObjectImpl implements FootnoteSepType {
	/**
	 * The default value of the '{@link #getAdjustment() <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment()
	 * @generated
	 * @ordered
	 */
	protected static final AdjustmentType ADJUSTMENT_EDEFAULT = AdjustmentType.LEFT;

	/**
	 * The cached value of the '{@link #getAdjustment() <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment()
	 * @generated
	 * @ordered
	 */
	protected AdjustmentType adjustment = ADJUSTMENT_EDEFAULT;

	/**
	 * This is true if the Adjustment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean adjustmentESet;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceAfterSep() <em>Distance After Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAfterSep()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_AFTER_SEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistanceAfterSep() <em>Distance After Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAfterSep()
	 * @generated
	 * @ordered
	 */
	protected String distanceAfterSep = DISTANCE_AFTER_SEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceBeforeSep() <em>Distance Before Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceBeforeSep()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_BEFORE_SEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistanceBeforeSep() <em>Distance Before Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceBeforeSep()
	 * @generated
	 * @ordered
	 */
	protected String distanceBeforeSep = DISTANCE_BEFORE_SEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle LINE_STYLE_EDEFAULT = LineStyle.NONE;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle lineStyle = LINE_STYLE_EDEFAULT;

	/**
	 * This is true if the Line Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineStyleESet;

	/**
	 * The default value of the '{@link #getRelWidth() <em>Rel Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String REL_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelWidth() <em>Rel Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelWidth()
	 * @generated
	 * @ordered
	 */
	protected String relWidth = REL_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FootnoteSepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getFootnoteSepType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjustmentType getAdjustment() {
		return adjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjustment(AdjustmentType newAdjustment) {
		AdjustmentType oldAdjustment = adjustment;
		adjustment = newAdjustment == null ? ADJUSTMENT_EDEFAULT : newAdjustment;
		boolean oldAdjustmentESet = adjustmentESet;
		adjustmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FOOTNOTE_SEP_TYPE__ADJUSTMENT, oldAdjustment, adjustment, !oldAdjustmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAdjustment() {
		AdjustmentType oldAdjustment = adjustment;
		boolean oldAdjustmentESet = adjustmentESet;
		adjustment = ADJUSTMENT_EDEFAULT;
		adjustmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.FOOTNOTE_SEP_TYPE__ADJUSTMENT, oldAdjustment, ADJUSTMENT_EDEFAULT, oldAdjustmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAdjustment() {
		return adjustmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FOOTNOTE_SEP_TYPE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistanceAfterSep() {
		return distanceAfterSep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceAfterSep(String newDistanceAfterSep) {
		String oldDistanceAfterSep = distanceAfterSep;
		distanceAfterSep = newDistanceAfterSep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FOOTNOTE_SEP_TYPE__DISTANCE_AFTER_SEP, oldDistanceAfterSep, distanceAfterSep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistanceBeforeSep() {
		return distanceBeforeSep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceBeforeSep(String newDistanceBeforeSep) {
		String oldDistanceBeforeSep = distanceBeforeSep;
		distanceBeforeSep = newDistanceBeforeSep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FOOTNOTE_SEP_TYPE__DISTANCE_BEFORE_SEP, oldDistanceBeforeSep, distanceBeforeSep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(LineStyle newLineStyle) {
		LineStyle oldLineStyle = lineStyle;
		lineStyle = newLineStyle == null ? LINE_STYLE_EDEFAULT : newLineStyle;
		boolean oldLineStyleESet = lineStyleESet;
		lineStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FOOTNOTE_SEP_TYPE__LINE_STYLE, oldLineStyle, lineStyle, !oldLineStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLineStyle() {
		LineStyle oldLineStyle = lineStyle;
		boolean oldLineStyleESet = lineStyleESet;
		lineStyle = LINE_STYLE_EDEFAULT;
		lineStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.FOOTNOTE_SEP_TYPE__LINE_STYLE, oldLineStyle, LINE_STYLE_EDEFAULT, oldLineStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLineStyle() {
		return lineStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelWidth() {
		return relWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelWidth(String newRelWidth) {
		String oldRelWidth = relWidth;
		relWidth = newRelWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FOOTNOTE_SEP_TYPE__REL_WIDTH, oldRelWidth, relWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FOOTNOTE_SEP_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StylePackage.FOOTNOTE_SEP_TYPE__ADJUSTMENT:
				return getAdjustment();
			case StylePackage.FOOTNOTE_SEP_TYPE__COLOR:
				return getColor();
			case StylePackage.FOOTNOTE_SEP_TYPE__DISTANCE_AFTER_SEP:
				return getDistanceAfterSep();
			case StylePackage.FOOTNOTE_SEP_TYPE__DISTANCE_BEFORE_SEP:
				return getDistanceBeforeSep();
			case StylePackage.FOOTNOTE_SEP_TYPE__LINE_STYLE:
				return getLineStyle();
			case StylePackage.FOOTNOTE_SEP_TYPE__REL_WIDTH:
				return getRelWidth();
			case StylePackage.FOOTNOTE_SEP_TYPE__WIDTH:
				return getWidth();
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
			case StylePackage.FOOTNOTE_SEP_TYPE__ADJUSTMENT:
				setAdjustment((AdjustmentType)newValue);
				return;
			case StylePackage.FOOTNOTE_SEP_TYPE__COLOR:
				setColor((String)newValue);
				return;
			case StylePackage.FOOTNOTE_SEP_TYPE__DISTANCE_AFTER_SEP:
				setDistanceAfterSep((String)newValue);
				return;
			case StylePackage.FOOTNOTE_SEP_TYPE__DISTANCE_BEFORE_SEP:
				setDistanceBeforeSep((String)newValue);
				return;
			case StylePackage.FOOTNOTE_SEP_TYPE__LINE_STYLE:
				setLineStyle((LineStyle)newValue);
				return;
			case StylePackage.FOOTNOTE_SEP_TYPE__REL_WIDTH:
				setRelWidth((String)newValue);
				return;
			case StylePackage.FOOTNOTE_SEP_TYPE__WIDTH:
				setWidth((String)newValue);
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
			case StylePackage.FOOTNOTE_SEP_TYPE__ADJUSTMENT:
				unsetAdjustment();
				return;
			case StylePackage.FOOTNOTE_SEP_TYPE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case StylePackage.FOOTNOTE_SEP_TYPE__DISTANCE_AFTER_SEP:
				setDistanceAfterSep(DISTANCE_AFTER_SEP_EDEFAULT);
				return;
			case StylePackage.FOOTNOTE_SEP_TYPE__DISTANCE_BEFORE_SEP:
				setDistanceBeforeSep(DISTANCE_BEFORE_SEP_EDEFAULT);
				return;
			case StylePackage.FOOTNOTE_SEP_TYPE__LINE_STYLE:
				unsetLineStyle();
				return;
			case StylePackage.FOOTNOTE_SEP_TYPE__REL_WIDTH:
				setRelWidth(REL_WIDTH_EDEFAULT);
				return;
			case StylePackage.FOOTNOTE_SEP_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case StylePackage.FOOTNOTE_SEP_TYPE__ADJUSTMENT:
				return isSetAdjustment();
			case StylePackage.FOOTNOTE_SEP_TYPE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case StylePackage.FOOTNOTE_SEP_TYPE__DISTANCE_AFTER_SEP:
				return DISTANCE_AFTER_SEP_EDEFAULT == null ? distanceAfterSep != null : !DISTANCE_AFTER_SEP_EDEFAULT.equals(distanceAfterSep);
			case StylePackage.FOOTNOTE_SEP_TYPE__DISTANCE_BEFORE_SEP:
				return DISTANCE_BEFORE_SEP_EDEFAULT == null ? distanceBeforeSep != null : !DISTANCE_BEFORE_SEP_EDEFAULT.equals(distanceBeforeSep);
			case StylePackage.FOOTNOTE_SEP_TYPE__LINE_STYLE:
				return isSetLineStyle();
			case StylePackage.FOOTNOTE_SEP_TYPE__REL_WIDTH:
				return REL_WIDTH_EDEFAULT == null ? relWidth != null : !REL_WIDTH_EDEFAULT.equals(relWidth);
			case StylePackage.FOOTNOTE_SEP_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (adjustment: ");
		if (adjustmentESet) result.append(adjustment); else result.append("<unset>");
		result.append(", color: ");
		result.append(color);
		result.append(", distanceAfterSep: ");
		result.append(distanceAfterSep);
		result.append(", distanceBeforeSep: ");
		result.append(distanceBeforeSep);
		result.append(", lineStyle: ");
		if (lineStyleESet) result.append(lineStyle); else result.append("<unset>");
		result.append(", relWidth: ");
		result.append(relWidth);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //FootnoteSepTypeImpl
