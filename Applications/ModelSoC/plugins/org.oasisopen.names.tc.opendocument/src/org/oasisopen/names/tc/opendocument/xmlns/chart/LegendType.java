/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.chart;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legend Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendAlign <em>Legend Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendExpansion <em>Legend Expansion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendExpansionAspectRatio <em>Legend Expansion Aspect Ratio</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendPosition <em>Legend Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getX <em>X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getLegendType()
 * @model extendedMetaData="name='legend_._type' kind='empty'"
 * @generated
 */
public interface LegendType extends EObject {
	/**
	 * Returns the value of the '<em><b>Legend Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legend Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType
	 * @see #isSetLegendAlign()
	 * @see #unsetLegendAlign()
	 * @see #setLegendAlign(LegendAlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getLegendType_LegendAlign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='legend-align' namespace='##targetNamespace'"
	 * @generated
	 */
	LegendAlignType getLegendAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendAlign <em>Legend Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType
	 * @see #isSetLegendAlign()
	 * @see #unsetLegendAlign()
	 * @see #getLegendAlign()
	 * @generated
	 */
	void setLegendAlign(LegendAlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendAlign <em>Legend Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLegendAlign()
	 * @see #getLegendAlign()
	 * @see #setLegendAlign(LegendAlignType)
	 * @generated
	 */
	void unsetLegendAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendAlign <em>Legend Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Legend Align</em>' attribute is set.
	 * @see #unsetLegendAlign()
	 * @see #getLegendAlign()
	 * @see #setLegendAlign(LegendAlignType)
	 * @generated
	 */
	boolean isSetLegendAlign();

	/**
	 * Returns the value of the '<em><b>Legend Expansion</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legend Expansion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend Expansion</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType
	 * @see #isSetLegendExpansion()
	 * @see #unsetLegendExpansion()
	 * @see #setLegendExpansion(LegendExpansionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getLegendType_LegendExpansion()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='legend-expansion' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	LegendExpansionType getLegendExpansion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendExpansion <em>Legend Expansion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend Expansion</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType
	 * @see #isSetLegendExpansion()
	 * @see #unsetLegendExpansion()
	 * @see #getLegendExpansion()
	 * @generated
	 */
	void setLegendExpansion(LegendExpansionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendExpansion <em>Legend Expansion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLegendExpansion()
	 * @see #getLegendExpansion()
	 * @see #setLegendExpansion(LegendExpansionType)
	 * @generated
	 */
	void unsetLegendExpansion();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendExpansion <em>Legend Expansion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Legend Expansion</em>' attribute is set.
	 * @see #unsetLegendExpansion()
	 * @see #getLegendExpansion()
	 * @see #setLegendExpansion(LegendExpansionType)
	 * @generated
	 */
	boolean isSetLegendExpansion();

	/**
	 * Returns the value of the '<em><b>Legend Expansion Aspect Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legend Expansion Aspect Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend Expansion Aspect Ratio</em>' attribute.
	 * @see #isSetLegendExpansionAspectRatio()
	 * @see #unsetLegendExpansionAspectRatio()
	 * @see #setLegendExpansionAspectRatio(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getLegendType_LegendExpansionAspectRatio()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='legend-expansion-aspect-ratio' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	double getLegendExpansionAspectRatio();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendExpansionAspectRatio <em>Legend Expansion Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend Expansion Aspect Ratio</em>' attribute.
	 * @see #isSetLegendExpansionAspectRatio()
	 * @see #unsetLegendExpansionAspectRatio()
	 * @see #getLegendExpansionAspectRatio()
	 * @generated
	 */
	void setLegendExpansionAspectRatio(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendExpansionAspectRatio <em>Legend Expansion Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLegendExpansionAspectRatio()
	 * @see #getLegendExpansionAspectRatio()
	 * @see #setLegendExpansionAspectRatio(double)
	 * @generated
	 */
	void unsetLegendExpansionAspectRatio();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendExpansionAspectRatio <em>Legend Expansion Aspect Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Legend Expansion Aspect Ratio</em>' attribute is set.
	 * @see #unsetLegendExpansionAspectRatio()
	 * @see #getLegendExpansionAspectRatio()
	 * @see #setLegendExpansionAspectRatio(double)
	 * @generated
	 */
	boolean isSetLegendExpansionAspectRatio();

	/**
	 * Returns the value of the '<em><b>Legend Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legend Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType
	 * @see #isSetLegendPosition()
	 * @see #unsetLegendPosition()
	 * @see #setLegendPosition(LegendPositionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getLegendType_LegendPosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='legend-position' namespace='##targetNamespace'"
	 * @generated
	 */
	LegendPositionType getLegendPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendPosition <em>Legend Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType
	 * @see #isSetLegendPosition()
	 * @see #unsetLegendPosition()
	 * @see #getLegendPosition()
	 * @generated
	 */
	void setLegendPosition(LegendPositionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendPosition <em>Legend Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLegendPosition()
	 * @see #getLegendPosition()
	 * @see #setLegendPosition(LegendPositionType)
	 * @generated
	 */
	void unsetLegendPosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getLegendPosition <em>Legend Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Legend Position</em>' attribute is set.
	 * @see #unsetLegendPosition()
	 * @see #getLegendPosition()
	 * @see #setLegendPosition(LegendPositionType)
	 * @generated
	 */
	boolean isSetLegendPosition();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getLegendType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.chart.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getLegendType_X()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate" required="true"
	 *        extendedMetaData="kind='attribute' name='x' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(String value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#getLegendType_Y()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate" required="true"
	 *        extendedMetaData="kind='attribute' name='y' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(String value);

} // LegendType
