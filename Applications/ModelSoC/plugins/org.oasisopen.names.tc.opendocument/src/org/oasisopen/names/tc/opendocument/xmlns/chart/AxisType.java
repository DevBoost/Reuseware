/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.chart;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getAxisType()
 * @model extendedMetaData="name='axis_._type' kind='elementOnly'"
 * @generated
 */
public interface AxisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getAxisType_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference.
	 * @see #setCategories(CategoriesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getAxisType_Categories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='categories' namespace='##targetNamespace'"
	 * @generated
	 */
	CategoriesType getCategories();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getCategories <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categories</em>' containment reference.
	 * @see #getCategories()
	 * @generated
	 */
	void setCategories(CategoriesType value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.chart.GridType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getAxisType_Grid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='grid' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GridType> getGrid();

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType
	 * @see #isSetDimension()
	 * @see #unsetDimension()
	 * @see #setDimension(DimensionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getAxisType_Dimension()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='dimension' namespace='##targetNamespace'"
	 * @generated
	 */
	DimensionType getDimension();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType
	 * @see #isSetDimension()
	 * @see #unsetDimension()
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(DimensionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDimension()
	 * @see #getDimension()
	 * @see #setDimension(DimensionType)
	 * @generated
	 */
	void unsetDimension();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getDimension <em>Dimension</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dimension</em>' attribute is set.
	 * @see #unsetDimension()
	 * @see #getDimension()
	 * @see #setDimension(DimensionType)
	 * @generated
	 */
	boolean isSetDimension();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getAxisType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getAxisType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.chart.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // AxisType
