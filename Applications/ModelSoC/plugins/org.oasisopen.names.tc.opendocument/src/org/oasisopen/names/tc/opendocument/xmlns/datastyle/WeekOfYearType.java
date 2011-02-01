/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.datastyle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Week Of Year Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType#getCalendar <em>Calendar</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getWeekOfYearType()
 * @model extendedMetaData="name='week-of-year_._type' kind='empty'"
 * @generated
 */
public interface WeekOfYearType extends EObject {
	/**
	 * Returns the value of the '<em><b>Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar</em>' attribute.
	 * @see #setCalendar(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getWeekOfYearType_Calendar()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarType"
	 *        extendedMetaData="kind='attribute' name='calendar' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getCalendar();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType#getCalendar <em>Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar</em>' attribute.
	 * @see #getCalendar()
	 * @generated
	 */
	void setCalendar(Object value);

} // WeekOfYearType
