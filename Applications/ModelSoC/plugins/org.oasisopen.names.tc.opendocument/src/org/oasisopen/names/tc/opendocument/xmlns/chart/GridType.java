/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.chart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.GridType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.GridType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getGridType()
 * @model extendedMetaData="name='grid_._type' kind='empty'"
 * @generated
 */
public interface GridType extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType
	 * @see #isSetClass()
	 * @see #unsetClass()
	 * @see #setClass(ClassType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getGridType_Class()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassType getClass_();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.GridType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType
	 * @see #isSetClass()
	 * @see #unsetClass()
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(ClassType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.GridType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClass()
	 * @see #getClass_()
	 * @see #setClass(ClassType)
	 * @generated
	 */
	void unsetClass();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.GridType#getClass_ <em>Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Class</em>' attribute is set.
	 * @see #unsetClass()
	 * @see #getClass_()
	 * @see #setClass(ClassType)
	 * @generated
	 */
	boolean isSetClass();

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getGridType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.chart.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.GridType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // GridType
