/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Footnote Sep Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getAdjustment <em>Adjustment</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getColor <em>Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getDistanceAfterSep <em>Distance After Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getDistanceBeforeSep <em>Distance Before Sep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getRelWidth <em>Rel Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFootnoteSepType()
 * @model extendedMetaData="name='footnote-sep_._type' kind='empty'"
 * @generated
 */
public interface FootnoteSepType extends EObject {
	/**
	 * Returns the value of the '<em><b>Adjustment</b></em>' attribute.
	 * The default value is <code>"left"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjustment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjustment</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType
	 * @see #isSetAdjustment()
	 * @see #unsetAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFootnoteSepType_Adjustment()
	 * @model default="left" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='adjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	AdjustmentType getAdjustment();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getAdjustment <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustment</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType
	 * @see #isSetAdjustment()
	 * @see #unsetAdjustment()
	 * @see #getAdjustment()
	 * @generated
	 */
	void setAdjustment(AdjustmentType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getAdjustment <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdjustment()
	 * @see #getAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @generated
	 */
	void unsetAdjustment();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getAdjustment <em>Adjustment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Adjustment</em>' attribute is set.
	 * @see #unsetAdjustment()
	 * @see #getAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @generated
	 */
	boolean isSetAdjustment();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFootnoteSepType_Color()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Distance After Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance After Sep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance After Sep</em>' attribute.
	 * @see #setDistanceAfterSep(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFootnoteSepType_DistanceAfterSep()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='distance-after-sep' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDistanceAfterSep();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getDistanceAfterSep <em>Distance After Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance After Sep</em>' attribute.
	 * @see #getDistanceAfterSep()
	 * @generated
	 */
	void setDistanceAfterSep(String value);

	/**
	 * Returns the value of the '<em><b>Distance Before Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Before Sep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Before Sep</em>' attribute.
	 * @see #setDistanceBeforeSep(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFootnoteSepType_DistanceBeforeSep()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='distance-before-sep' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDistanceBeforeSep();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getDistanceBeforeSep <em>Distance Before Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Before Sep</em>' attribute.
	 * @see #getDistanceBeforeSep()
	 * @generated
	 */
	void setDistanceBeforeSep(String value);

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle
	 * @see #isSetLineStyle()
	 * @see #unsetLineStyle()
	 * @see #setLineStyle(LineStyle)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFootnoteSepType_LineStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='line-style' namespace='##targetNamespace'"
	 * @generated
	 */
	LineStyle getLineStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle
	 * @see #isSetLineStyle()
	 * @see #unsetLineStyle()
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(LineStyle value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getLineStyle <em>Line Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineStyle()
	 * @see #getLineStyle()
	 * @see #setLineStyle(LineStyle)
	 * @generated
	 */
	void unsetLineStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getLineStyle <em>Line Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Style</em>' attribute is set.
	 * @see #unsetLineStyle()
	 * @see #getLineStyle()
	 * @see #setLineStyle(LineStyle)
	 * @generated
	 */
	boolean isSetLineStyle();

	/**
	 * Returns the value of the '<em><b>Rel Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Width</em>' attribute.
	 * @see #setRelWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFootnoteSepType_RelWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent" required="true"
	 *        extendedMetaData="kind='attribute' name='rel-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRelWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getRelWidth <em>Rel Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Width</em>' attribute.
	 * @see #getRelWidth()
	 * @generated
	 */
	void setRelWidth(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFootnoteSepType_Width()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length" required="true"
	 *        extendedMetaData="kind='attribute' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // FootnoteSepType
