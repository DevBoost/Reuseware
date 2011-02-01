/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Day Of Week Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DayOfWeekTypeImpl#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DayOfWeekTypeImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DayOfWeekTypeImpl extends EObjectImpl implements DayOfWeekType {
	/**
	 * The default value of the '{@link #getCalendar() <em>Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected static final Object CALENDAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalendar() <em>Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendar()
	 * @generated
	 * @ordered
	 */
	protected Object calendar = CALENDAR_EDEFAULT;

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
	protected DayOfWeekTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatastylePackage.Literals.DAY_OF_WEEK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCalendar() {
		return calendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendar(Object newCalendar) {
		Object oldCalendar = calendar;
		calendar = newCalendar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DAY_OF_WEEK_TYPE__CALENDAR, oldCalendar, calendar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.DAY_OF_WEEK_TYPE__STYLE, oldStyle, style, !oldStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.DAY_OF_WEEK_TYPE__STYLE, oldStyle, STYLE_EDEFAULT, oldStyleESet));
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
			case DatastylePackage.DAY_OF_WEEK_TYPE__CALENDAR:
				return getCalendar();
			case DatastylePackage.DAY_OF_WEEK_TYPE__STYLE:
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
			case DatastylePackage.DAY_OF_WEEK_TYPE__CALENDAR:
				setCalendar(newValue);
				return;
			case DatastylePackage.DAY_OF_WEEK_TYPE__STYLE:
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
			case DatastylePackage.DAY_OF_WEEK_TYPE__CALENDAR:
				setCalendar(CALENDAR_EDEFAULT);
				return;
			case DatastylePackage.DAY_OF_WEEK_TYPE__STYLE:
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
			case DatastylePackage.DAY_OF_WEEK_TYPE__CALENDAR:
				return CALENDAR_EDEFAULT == null ? calendar != null : !CALENDAR_EDEFAULT.equals(calendar);
			case DatastylePackage.DAY_OF_WEEK_TYPE__STYLE:
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
		result.append(" (calendar: ");
		result.append(calendar);
		result.append(", style: ");
		if (styleESet) result.append(style); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DayOfWeekTypeImpl
