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
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Sep Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnSepTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnSepTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnSepTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnSepTypeImpl#getVerticalAlign <em>Vertical Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnSepTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnSepTypeImpl extends EObjectImpl implements ColumnSepType {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = "#000000";

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
	 * This is true if the Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colorESet;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = "100%";

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * This is true if the Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean heightESet;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final StyleType STYLE_EDEFAULT = StyleType.SOLID;

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
	 * The default value of the '{@link #getVerticalAlign() <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected static final VerticalAlignType VERTICAL_ALIGN_EDEFAULT = VerticalAlignType.TOP;

	/**
	 * The cached value of the '{@link #getVerticalAlign() <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected VerticalAlignType verticalAlign = VERTICAL_ALIGN_EDEFAULT;

	/**
	 * This is true if the Vertical Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalAlignESet;

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
	protected ColumnSepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getColumnSepType();
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
		boolean oldColorESet = colorESet;
		colorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMN_SEP_TYPE__COLOR, oldColor, color, !oldColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColor() {
		String oldColor = color;
		boolean oldColorESet = colorESet;
		color = COLOR_EDEFAULT;
		colorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.COLUMN_SEP_TYPE__COLOR, oldColor, COLOR_EDEFAULT, oldColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColor() {
		return colorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		boolean oldHeightESet = heightESet;
		heightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMN_SEP_TYPE__HEIGHT, oldHeight, height, !oldHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeight() {
		String oldHeight = height;
		boolean oldHeightESet = heightESet;
		height = HEIGHT_EDEFAULT;
		heightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.COLUMN_SEP_TYPE__HEIGHT, oldHeight, HEIGHT_EDEFAULT, oldHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeight() {
		return heightESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMN_SEP_TYPE__STYLE, oldStyle, style, !oldStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.COLUMN_SEP_TYPE__STYLE, oldStyle, STYLE_EDEFAULT, oldStyleESet));
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
	public VerticalAlignType getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlign(VerticalAlignType newVerticalAlign) {
		VerticalAlignType oldVerticalAlign = verticalAlign;
		verticalAlign = newVerticalAlign == null ? VERTICAL_ALIGN_EDEFAULT : newVerticalAlign;
		boolean oldVerticalAlignESet = verticalAlignESet;
		verticalAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMN_SEP_TYPE__VERTICAL_ALIGN, oldVerticalAlign, verticalAlign, !oldVerticalAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerticalAlign() {
		VerticalAlignType oldVerticalAlign = verticalAlign;
		boolean oldVerticalAlignESet = verticalAlignESet;
		verticalAlign = VERTICAL_ALIGN_EDEFAULT;
		verticalAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.COLUMN_SEP_TYPE__VERTICAL_ALIGN, oldVerticalAlign, VERTICAL_ALIGN_EDEFAULT, oldVerticalAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerticalAlign() {
		return verticalAlignESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMN_SEP_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StylePackage.COLUMN_SEP_TYPE__COLOR:
				return getColor();
			case StylePackage.COLUMN_SEP_TYPE__HEIGHT:
				return getHeight();
			case StylePackage.COLUMN_SEP_TYPE__STYLE:
				return getStyle();
			case StylePackage.COLUMN_SEP_TYPE__VERTICAL_ALIGN:
				return getVerticalAlign();
			case StylePackage.COLUMN_SEP_TYPE__WIDTH:
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
			case StylePackage.COLUMN_SEP_TYPE__COLOR:
				setColor((String)newValue);
				return;
			case StylePackage.COLUMN_SEP_TYPE__HEIGHT:
				setHeight((String)newValue);
				return;
			case StylePackage.COLUMN_SEP_TYPE__STYLE:
				setStyle((StyleType)newValue);
				return;
			case StylePackage.COLUMN_SEP_TYPE__VERTICAL_ALIGN:
				setVerticalAlign((VerticalAlignType)newValue);
				return;
			case StylePackage.COLUMN_SEP_TYPE__WIDTH:
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
			case StylePackage.COLUMN_SEP_TYPE__COLOR:
				unsetColor();
				return;
			case StylePackage.COLUMN_SEP_TYPE__HEIGHT:
				unsetHeight();
				return;
			case StylePackage.COLUMN_SEP_TYPE__STYLE:
				unsetStyle();
				return;
			case StylePackage.COLUMN_SEP_TYPE__VERTICAL_ALIGN:
				unsetVerticalAlign();
				return;
			case StylePackage.COLUMN_SEP_TYPE__WIDTH:
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
			case StylePackage.COLUMN_SEP_TYPE__COLOR:
				return isSetColor();
			case StylePackage.COLUMN_SEP_TYPE__HEIGHT:
				return isSetHeight();
			case StylePackage.COLUMN_SEP_TYPE__STYLE:
				return isSetStyle();
			case StylePackage.COLUMN_SEP_TYPE__VERTICAL_ALIGN:
				return isSetVerticalAlign();
			case StylePackage.COLUMN_SEP_TYPE__WIDTH:
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
		result.append(" (color: ");
		if (colorESet) result.append(color); else result.append("<unset>");
		result.append(", height: ");
		if (heightESet) result.append(height); else result.append("<unset>");
		result.append(", style: ");
		if (styleESet) result.append(style); else result.append("<unset>");
		result.append(", verticalAlign: ");
		if (verticalAlignESet) result.append(verticalAlign); else result.append("<unset>");
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //ColumnSepTypeImpl
