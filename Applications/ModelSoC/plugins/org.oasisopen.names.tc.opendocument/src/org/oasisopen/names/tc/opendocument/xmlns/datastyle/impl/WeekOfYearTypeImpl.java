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
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Week Of Year Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.WeekOfYearTypeImpl#getCalendar <em>Calendar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeekOfYearTypeImpl extends EObjectImpl implements WeekOfYearType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeekOfYearTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatastylePackage.Literals.WEEK_OF_YEAR_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.WEEK_OF_YEAR_TYPE__CALENDAR, oldCalendar, calendar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatastylePackage.WEEK_OF_YEAR_TYPE__CALENDAR:
				return getCalendar();
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
			case DatastylePackage.WEEK_OF_YEAR_TYPE__CALENDAR:
				setCalendar(newValue);
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
			case DatastylePackage.WEEK_OF_YEAR_TYPE__CALENDAR:
				setCalendar(CALENDAR_EDEFAULT);
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
			case DatastylePackage.WEEK_OF_YEAR_TYPE__CALENDAR:
				return CALENDAR_EDEFAULT == null ? calendar != null : !CALENDAR_EDEFAULT.equals(calendar);
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
		result.append(')');
		return result.toString();
	}

} //WeekOfYearTypeImpl
