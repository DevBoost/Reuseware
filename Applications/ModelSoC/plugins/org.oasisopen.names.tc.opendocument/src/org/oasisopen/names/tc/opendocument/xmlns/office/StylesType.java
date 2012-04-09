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
package org.oasisopen.names.tc.opendocument.xmlns.office;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1;
import org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1;
import org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType;
import org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.text.OutlineStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Styles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getListStyle <em>List Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getNumberStyle <em>Number Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getCurrencyStyle <em>Currency Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getPercentageStyle <em>Percentage Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getDateStyle <em>Date Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getTimeStyle <em>Time Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getBooleanStyle <em>Boolean Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getDefaultStyle <em>Default Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getOutlineStyle <em>Outline Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getNotesConfiguration <em>Notes Configuration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getBibliographyConfiguration <em>Bibliography Configuration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getLinenumberingConfiguration <em>Linenumbering Configuration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getGradient <em>Gradient</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getLinearGradient <em>Linear Gradient</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getRadialGradient <em>Radial Gradient</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getHatch <em>Hatch</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getFillImage <em>Fill Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getMarker <em>Marker</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getStrokeDash <em>Stroke Dash</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.StylesType#getPresentationPageLayout <em>Presentation Page Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType()
 * @model extendedMetaData="name='styles_._type' kind='elementOnly'"
 * @generated
 */
public interface StylesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_Style()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='style' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0' group='#group:0'"
	 * @generated
	 */
	EList<StyleType1> getStyle();

	/**
	 * Returns the value of the '<em><b>List Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ListStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_ListStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-style' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:0'"
	 * @generated
	 */
	EList<ListStyleType> getListStyle();

	/**
	 * Returns the value of the '<em><b>Number Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_NumberStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='number-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<NumberStyleType> getNumberStyle();

	/**
	 * Returns the value of the '<em><b>Currency Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_CurrencyStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='currency-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<CurrencyStyleType> getCurrencyStyle();

	/**
	 * Returns the value of the '<em><b>Percentage Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_PercentageStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='percentage-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<PercentageStyleType> getPercentageStyle();

	/**
	 * Returns the value of the '<em><b>Date Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_DateStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<DateStyleType> getDateStyle();

	/**
	 * Returns the value of the '<em><b>Time Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_TimeStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='time-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<TimeStyleType> getTimeStyle();

	/**
	 * Returns the value of the '<em><b>Boolean Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_BooleanStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='boolean-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<BooleanStyleType> getBooleanStyle();

	/**
	 * Returns the value of the '<em><b>Text Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_TextStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<TextStyleType> getTextStyle();

	/**
	 * Returns the value of the '<em><b>Default Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_DefaultStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='default-style' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0' group='#group:0'"
	 * @generated
	 */
	EList<StyleStyleContent> getDefaultStyle();

	/**
	 * Returns the value of the '<em><b>Outline Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.OutlineStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_OutlineStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outline-style' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:0'"
	 * @generated
	 */
	EList<OutlineStyleType> getOutlineStyle();

	/**
	 * Returns the value of the '<em><b>Notes Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes Configuration</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_NotesConfiguration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='notes-configuration' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:0'"
	 * @generated
	 */
	EList<TextNotesConfigurationContent> getNotesConfiguration();

	/**
	 * Returns the value of the '<em><b>Bibliography Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bibliography Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliography Configuration</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_BibliographyConfiguration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliography-configuration' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:0'"
	 * @generated
	 */
	EList<BibliographyConfigurationType> getBibliographyConfiguration();

	/**
	 * Returns the value of the '<em><b>Linenumbering Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linenumbering Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linenumbering Configuration</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_LinenumberingConfiguration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='linenumbering-configuration' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:0'"
	 * @generated
	 */
	EList<LinenumberingConfigurationType> getLinenumberingConfiguration();

	/**
	 * Returns the value of the '<em><b>Gradient</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_Gradient()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gradient' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:0'"
	 * @generated
	 */
	EList<GradientType> getGradient();

	/**
	 * Returns the value of the '<em><b>Linear Gradient</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Gradient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Gradient</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_LinearGradient()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='linearGradient' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0' group='#group:0'"
	 * @generated
	 */
	EList<LinearGradientType> getLinearGradient();

	/**
	 * Returns the value of the '<em><b>Radial Gradient</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radial Gradient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radial Gradient</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_RadialGradient()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='radialGradient' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0' group='#group:0'"
	 * @generated
	 */
	EList<RadialGradientType> getRadialGradient();

	/**
	 * Returns the value of the '<em><b>Hatch</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hatch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hatch</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_Hatch()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hatch' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:0'"
	 * @generated
	 */
	EList<HatchType> getHatch();

	/**
	 * Returns the value of the '<em><b>Fill Image</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Image</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_FillImage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fill-image' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:0'"
	 * @generated
	 */
	EList<FillImageType> getFillImage();

	/**
	 * Returns the value of the '<em><b>Marker</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_Marker()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='marker' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:0'"
	 * @generated
	 */
	EList<MarkerType> getMarker();

	/**
	 * Returns the value of the '<em><b>Stroke Dash</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Dash</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Dash</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_StrokeDash()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stroke-dash' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:0'"
	 * @generated
	 */
	EList<StrokeDashType1> getStrokeDash();

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opacity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_Opacity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='opacity' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:0'"
	 * @generated
	 */
	EList<OpacityType> getOpacity();

	/**
	 * Returns the value of the '<em><b>Presentation Page Layout</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Page Layout</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Page Layout</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getStylesType_PresentationPageLayout()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='presentation-page-layout' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0' group='#group:0'"
	 * @generated
	 */
	EList<PresentationPageLayoutType> getPresentationPageLayout();

} // StylesType
