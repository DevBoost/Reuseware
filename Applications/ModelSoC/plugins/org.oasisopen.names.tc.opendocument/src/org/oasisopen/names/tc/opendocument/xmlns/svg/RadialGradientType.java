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
package org.oasisopen.names.tc.opendocument.xmlns.svg;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radial Gradient Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getStop <em>Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getCx <em>Cx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getCy <em>Cy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getFx <em>Fx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getFy <em>Fy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getGradientTransform <em>Gradient Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getGradientUnits <em>Gradient Units</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getR <em>R</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getSpreadMethod <em>Spread Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getRadialGradientType()
 * @model extendedMetaData="name='radialGradient_._type' kind='elementOnly'"
 * @generated
 */
public interface RadialGradientType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getRadialGradientType_Stop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StopType> getStop();

	/**
	 * Returns the value of the '<em><b>Cx</b></em>' attribute.
	 * The default value is <code>"50%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cx</em>' attribute.
	 * @see #isSetCx()
	 * @see #unsetCx()
	 * @see #setCx(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getRadialGradientType_Cx()
	 * @model default="50%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.CxType"
	 *        extendedMetaData="kind='attribute' name='cx' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCx();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getCx <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cx</em>' attribute.
	 * @see #isSetCx()
	 * @see #unsetCx()
	 * @see #getCx()
	 * @generated
	 */
	void setCx(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getCx <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCx()
	 * @see #getCx()
	 * @see #setCx(String)
	 * @generated
	 */
	void unsetCx();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getCx <em>Cx</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cx</em>' attribute is set.
	 * @see #unsetCx()
	 * @see #getCx()
	 * @see #setCx(String)
	 * @generated
	 */
	boolean isSetCx();

	/**
	 * Returns the value of the '<em><b>Cy</b></em>' attribute.
	 * The default value is <code>"50%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cy</em>' attribute.
	 * @see #isSetCy()
	 * @see #unsetCy()
	 * @see #setCy(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getRadialGradientType_Cy()
	 * @model default="50%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.CyType"
	 *        extendedMetaData="kind='attribute' name='cy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getCy <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cy</em>' attribute.
	 * @see #isSetCy()
	 * @see #unsetCy()
	 * @see #getCy()
	 * @generated
	 */
	void setCy(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getCy <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCy()
	 * @see #getCy()
	 * @see #setCy(String)
	 * @generated
	 */
	void unsetCy();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getCy <em>Cy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cy</em>' attribute is set.
	 * @see #unsetCy()
	 * @see #getCy()
	 * @see #setCy(String)
	 * @generated
	 */
	boolean isSetCy();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getRadialGradientType_DisplayName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='display-name' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Fx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx</em>' attribute.
	 * @see #setFx(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getRadialGradientType_Fx()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.FxType"
	 *        extendedMetaData="kind='attribute' name='fx' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFx();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getFx <em>Fx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fx</em>' attribute.
	 * @see #getFx()
	 * @generated
	 */
	void setFx(String value);

	/**
	 * Returns the value of the '<em><b>Fy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fy</em>' attribute.
	 * @see #setFy(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getRadialGradientType_Fy()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.FyType"
	 *        extendedMetaData="kind='attribute' name='fy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getFy <em>Fy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fy</em>' attribute.
	 * @see #getFy()
	 * @generated
	 */
	void setFy(String value);

	/**
	 * Returns the value of the '<em><b>Gradient Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient Transform</em>' attribute.
	 * @see #setGradientTransform(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getRadialGradientType_GradientTransform()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='gradientTransform' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGradientTransform();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getGradientTransform <em>Gradient Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Transform</em>' attribute.
	 * @see #getGradientTransform()
	 * @generated
	 */
	void setGradientTransform(String value);

	/**
	 * Returns the value of the '<em><b>Gradient Units</b></em>' attribute.
	 * The default value is <code>"objectBoundingBox"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient Units</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType
	 * @see #isSetGradientUnits()
	 * @see #unsetGradientUnits()
	 * @see #setGradientUnits(GradientUnitsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getRadialGradientType_GradientUnits()
	 * @model default="objectBoundingBox" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='gradientUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	GradientUnitsType getGradientUnits();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getGradientUnits <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Units</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType
	 * @see #isSetGradientUnits()
	 * @see #unsetGradientUnits()
	 * @see #getGradientUnits()
	 * @generated
	 */
	void setGradientUnits(GradientUnitsType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getGradientUnits <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGradientUnits()
	 * @see #getGradientUnits()
	 * @see #setGradientUnits(GradientUnitsType)
	 * @generated
	 */
	void unsetGradientUnits();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getGradientUnits <em>Gradient Units</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gradient Units</em>' attribute is set.
	 * @see #unsetGradientUnits()
	 * @see #getGradientUnits()
	 * @see #setGradientUnits(GradientUnitsType)
	 * @generated
	 */
	boolean isSetGradientUnits();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getRadialGradientType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleName" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * The default value is <code>"50%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #setR(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getRadialGradientType_R()
	 * @model default="50%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.RType"
	 *        extendedMetaData="kind='attribute' name='r' namespace='##targetNamespace'"
	 * @generated
	 */
	String getR();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #getR()
	 * @generated
	 */
	void setR(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetR()
	 * @see #getR()
	 * @see #setR(String)
	 * @generated
	 */
	void unsetR();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getR <em>R</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>R</em>' attribute is set.
	 * @see #unsetR()
	 * @see #getR()
	 * @see #setR(String)
	 * @generated
	 */
	boolean isSetR();

	/**
	 * Returns the value of the '<em><b>Spread Method</b></em>' attribute.
	 * The default value is <code>"pad"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spread Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spread Method</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType
	 * @see #isSetSpreadMethod()
	 * @see #unsetSpreadMethod()
	 * @see #setSpreadMethod(SpreadMethodType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getRadialGradientType_SpreadMethod()
	 * @model default="pad" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='spreadMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	SpreadMethodType getSpreadMethod();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getSpreadMethod <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spread Method</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType
	 * @see #isSetSpreadMethod()
	 * @see #unsetSpreadMethod()
	 * @see #getSpreadMethod()
	 * @generated
	 */
	void setSpreadMethod(SpreadMethodType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getSpreadMethod <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpreadMethod()
	 * @see #getSpreadMethod()
	 * @see #setSpreadMethod(SpreadMethodType)
	 * @generated
	 */
	void unsetSpreadMethod();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType#getSpreadMethod <em>Spread Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spread Method</em>' attribute is set.
	 * @see #unsetSpreadMethod()
	 * @see #getSpreadMethod()
	 * @see #setSpreadMethod(SpreadMethodType)
	 * @generated
	 */
	boolean isSetSpreadMethod();

} // RadialGradientType
