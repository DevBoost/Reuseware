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
package org.oasisopen.names.tc.opendocument.xmlns.svg.util;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceFormatType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceNameType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.StopType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage;
import org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.util.TextValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage
 * @generated
 */
public class SvgValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SvgValidator INSTANCE = new SvgValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.oasisopen.names.tc.opendocument.xmlns.svg";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextValidator textValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgValidator() {
		super();
		textValidator = TextValidator.INSTANCE;
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SvgPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SvgPackage.DEFINITION_SRC_TYPE:
				return validateDefinitionSrcType((DefinitionSrcType)value, diagnostics, context);
			case SvgPackage.FONT_FACE_FORMAT_TYPE:
				return validateFontFaceFormatType((FontFaceFormatType)value, diagnostics, context);
			case SvgPackage.FONT_FACE_NAME_TYPE:
				return validateFontFaceNameType((FontFaceNameType)value, diagnostics, context);
			case SvgPackage.FONT_FACE_SRC_TYPE:
				return validateFontFaceSrcType((FontFaceSrcType)value, diagnostics, context);
			case SvgPackage.FONT_FACE_URI_TYPE:
				return validateFontFaceUriType((FontFaceUriType)value, diagnostics, context);
			case SvgPackage.LINEAR_GRADIENT_TYPE:
				return validateLinearGradientType((LinearGradientType)value, diagnostics, context);
			case SvgPackage.RADIAL_GRADIENT_TYPE:
				return validateRadialGradientType((RadialGradientType)value, diagnostics, context);
			case SvgPackage.STOP_TYPE:
				return validateStopType((StopType)value, diagnostics, context);
			case SvgPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case SvgPackage.FILL_RULE_TYPE:
				return validateFillRuleType((FillRuleType)value, diagnostics, context);
			case SvgPackage.FONT_STRETCH_TYPE:
				return validateFontStretchType((FontStretchType)value, diagnostics, context);
			case SvgPackage.GRADIENT_UNITS_TYPE:
				return validateGradientUnitsType((GradientUnitsType)value, diagnostics, context);
			case SvgPackage.SPREAD_METHOD_TYPE:
				return validateSpreadMethodType((SpreadMethodType)value, diagnostics, context);
			case SvgPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case SvgPackage.CX_TYPE:
				return validateCxType((String)value, diagnostics, context);
			case SvgPackage.CY_TYPE:
				return validateCyType((String)value, diagnostics, context);
			case SvgPackage.FILL_RULE_TYPE_OBJECT:
				return validateFillRuleTypeObject((FillRuleType)value, diagnostics, context);
			case SvgPackage.FONT_STRETCH_TYPE_OBJECT:
				return validateFontStretchTypeObject((FontStretchType)value, diagnostics, context);
			case SvgPackage.FX_TYPE:
				return validateFxType((String)value, diagnostics, context);
			case SvgPackage.FY_TYPE:
				return validateFyType((String)value, diagnostics, context);
			case SvgPackage.GRADIENT_UNITS_TYPE_OBJECT:
				return validateGradientUnitsTypeObject((GradientUnitsType)value, diagnostics, context);
			case SvgPackage.HEIGHT_TYPE:
				return validateHeightType((String)value, diagnostics, context);
			case SvgPackage.OFFSET_TYPE:
				return validateOffsetType(value, diagnostics, context);
			case SvgPackage.RTYPE:
				return validateRType((String)value, diagnostics, context);
			case SvgPackage.SPREAD_METHOD_TYPE_OBJECT:
				return validateSpreadMethodTypeObject((SpreadMethodType)value, diagnostics, context);
			case SvgPackage.STROKE_OPACITY_TYPE:
				return validateStrokeOpacityType(value, diagnostics, context);
			case SvgPackage.STROKE_OPACITY_TYPE_MEMBER1:
				return validateStrokeOpacityTypeMember1(((Double)value).doubleValue(), diagnostics, context);
			case SvgPackage.STROKE_OPACITY_TYPE_MEMBER1_OBJECT:
				return validateStrokeOpacityTypeMember1Object((Double)value, diagnostics, context);
			case SvgPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case SvgPackage.VIEW_BOX_TYPE:
				return validateViewBoxType((List)value, diagnostics, context);
			case SvgPackage.VIEW_BOX_TYPE_BASE:
				return validateViewBoxTypeBase((List<?>)value, diagnostics, context);
			case SvgPackage.VIEW_BOX_TYPE_BASE_ITEM:
				return validateViewBoxTypeBaseItem((BigInteger)value, diagnostics, context);
			case SvgPackage.WIDTH_TYPE:
				return validateWidthType((String)value, diagnostics, context);
			case SvgPackage.X1_TYPE:
				return validateX1Type((String)value, diagnostics, context);
			case SvgPackage.X2_TYPE:
				return validateX2Type((String)value, diagnostics, context);
			case SvgPackage.XTYPE:
				return validateXType((String)value, diagnostics, context);
			case SvgPackage.XTYPE1:
				return validateXType1((String)value, diagnostics, context);
			case SvgPackage.Y1_TYPE:
				return validateY1Type((String)value, diagnostics, context);
			case SvgPackage.Y2_TYPE:
				return validateY2Type((String)value, diagnostics, context);
			case SvgPackage.YTYPE:
				return validateYType((String)value, diagnostics, context);
			case SvgPackage.YTYPE1:
				return validateYType1((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionSrcType(DefinitionSrcType definitionSrcType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitionSrcType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontFaceFormatType(FontFaceFormatType fontFaceFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fontFaceFormatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontFaceNameType(FontFaceNameType fontFaceNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fontFaceNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontFaceSrcType(FontFaceSrcType fontFaceSrcType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fontFaceSrcType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontFaceUriType(FontFaceUriType fontFaceUriType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fontFaceUriType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearGradientType(LinearGradientType linearGradientType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linearGradientType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadialGradientType(RadialGradientType radialGradientType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(radialGradientType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopType(StopType stopType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stopType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillRuleType(FillRuleType fillRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontStretchType(FontStretchType fontStretchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGradientUnitsType(GradientUnitsType gradientUnitsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpreadMethodType(SpreadMethodType spreadMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCxType(String cxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCyType(String cyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillRuleTypeObject(FillRuleType fillRuleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontStretchTypeObject(FontStretchType fontStretchTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFxType(String fxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFxType_MemberTypes(fxType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fx Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFxType_MemberTypes(String fxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getCoordinate().isInstance(fxType)) {
				if (textValidator.validateCoordinate(fxType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(fxType)) {
				if (textValidator.validatePercent(fxType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getCoordinate().isInstance(fxType)) {
				if (textValidator.validateCoordinate(fxType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(fxType)) {
				if (textValidator.validatePercent(fxType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFyType(String fyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFyType_MemberTypes(fyType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fy Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFyType_MemberTypes(String fyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getCoordinate().isInstance(fyType)) {
				if (textValidator.validateCoordinate(fyType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(fyType)) {
				if (textValidator.validatePercent(fyType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getCoordinate().isInstance(fyType)) {
				if (textValidator.validateCoordinate(fyType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(fyType)) {
				if (textValidator.validatePercent(fyType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGradientUnitsTypeObject(GradientUnitsType gradientUnitsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeightType(String heightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHeightType_MemberTypes(heightType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Height Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeightType_MemberTypes(String heightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(heightType)) {
				if (textValidator.validateLength(heightType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(heightType)) {
				if (textValidator.validatePercent(heightType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(heightType)) {
				if (textValidator.validateLength(heightType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(heightType)) {
				if (textValidator.validatePercent(heightType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffsetType(Object offsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOffsetType_MemberTypes(offsetType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Offset Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffsetType_MemberTypes(Object offsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getDouble().isInstance(offsetType)) {
				if (textValidator.validateDouble(((Double)offsetType).doubleValue(), tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(offsetType)) {
				if (textValidator.validatePercent((String)offsetType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getDouble().isInstance(offsetType)) {
				if (textValidator.validateDouble(((Double)offsetType).doubleValue(), null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(offsetType)) {
				if (textValidator.validatePercent((String)offsetType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRType(String rType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpreadMethodTypeObject(SpreadMethodType spreadMethodTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeOpacityType(Object strokeOpacityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStrokeOpacityType_MemberTypes(strokeOpacityType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Stroke Opacity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeOpacityType_MemberTypes(Object strokeOpacityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getPercent().isInstance(strokeOpacityType)) {
				if (textValidator.validatePercent((String)strokeOpacityType, tempDiagnostics, context)) return true;
			}
			if (SvgPackage.Literals.STROKE_OPACITY_TYPE_MEMBER1.isInstance(strokeOpacityType)) {
				if (validateStrokeOpacityTypeMember1(((Double)strokeOpacityType).doubleValue(), tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getPercent().isInstance(strokeOpacityType)) {
				if (textValidator.validatePercent((String)strokeOpacityType, null, context)) return true;
			}
			if (SvgPackage.Literals.STROKE_OPACITY_TYPE_MEMBER1.isInstance(strokeOpacityType)) {
				if (validateStrokeOpacityTypeMember1(((Double)strokeOpacityType).doubleValue(), null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeOpacityTypeMember1(double strokeOpacityTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStrokeOpacityTypeMember1_Min(strokeOpacityTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrokeOpacityTypeMember1_Max(strokeOpacityTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStrokeOpacityTypeMember1_Min
	 */
	public static final double STROKE_OPACITY_TYPE_MEMBER1__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Stroke Opacity Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeOpacityTypeMember1_Min(double strokeOpacityTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = strokeOpacityTypeMember1 >= STROKE_OPACITY_TYPE_MEMBER1__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(SvgPackage.Literals.STROKE_OPACITY_TYPE_MEMBER1, new Double(strokeOpacityTypeMember1), new Double(STROKE_OPACITY_TYPE_MEMBER1__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStrokeOpacityTypeMember1_Max
	 */
	public static final double STROKE_OPACITY_TYPE_MEMBER1__MAX__VALUE = 1.0;

	/**
	 * Validates the Max constraint of '<em>Stroke Opacity Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeOpacityTypeMember1_Max(double strokeOpacityTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = strokeOpacityTypeMember1 <= STROKE_OPACITY_TYPE_MEMBER1__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(SvgPackage.Literals.STROKE_OPACITY_TYPE_MEMBER1, new Double(strokeOpacityTypeMember1), new Double(STROKE_OPACITY_TYPE_MEMBER1__MAX__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeOpacityTypeMember1Object(Double strokeOpacityTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStrokeOpacityTypeMember1_Min(strokeOpacityTypeMember1Object.doubleValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateStrokeOpacityTypeMember1_Max(strokeOpacityTypeMember1Object.doubleValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewBoxType(List viewBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateViewBoxType_MinLength(viewBoxType, diagnostics, context);
		if (result || diagnostics != null) result &= validateViewBoxType_MaxLength(viewBoxType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>View Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewBoxType_MinLength(List viewBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = viewBoxType.size();
		boolean result = length >= 4;
		if (!result && diagnostics != null)
			reportMinLengthViolation(SvgPackage.Literals.VIEW_BOX_TYPE, viewBoxType, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>View Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewBoxType_MaxLength(List viewBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = viewBoxType.size();
		boolean result = length <= 4;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(SvgPackage.Literals.VIEW_BOX_TYPE, viewBoxType, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewBoxTypeBase(List<?> viewBoxTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateViewBoxTypeBase_ItemType(viewBoxTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>View Box Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewBoxTypeBase_ItemType(List<?> viewBoxTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = viewBoxTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (SvgPackage.Literals.VIEW_BOX_TYPE_BASE_ITEM.isInstance(item)) {
				result &= validateViewBoxTypeBaseItem((BigInteger)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(SvgPackage.Literals.VIEW_BOX_TYPE_BASE_ITEM, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewBoxTypeBaseItem(BigInteger viewBoxTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateViewBoxTypeBaseItem_MemberTypes(viewBoxTypeBaseItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>View Box Type Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewBoxTypeBaseItem_MemberTypes(BigInteger viewBoxTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getInteger().isInstance(viewBoxTypeBaseItem)) {
				if (textValidator.validateInteger(viewBoxTypeBaseItem, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getInteger().isInstance(viewBoxTypeBaseItem)) {
				if (textValidator.validateInteger(viewBoxTypeBaseItem, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWidthType(String widthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateWidthType_MemberTypes(widthType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Width Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWidthType_MemberTypes(String widthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(widthType)) {
				if (textValidator.validateLength(widthType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(widthType)) {
				if (textValidator.validatePercent(widthType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(widthType)) {
				if (textValidator.validateLength(widthType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(widthType)) {
				if (textValidator.validatePercent(widthType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1Type(String x1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX2Type(String x2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXType(String xType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateXType_MemberTypes(xType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>XType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXType_MemberTypes(String xType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getCoordinate().isInstance(xType)) {
				if (textValidator.validateCoordinate(xType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(xType)) {
				if (textValidator.validatePercent(xType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getCoordinate().isInstance(xType)) {
				if (textValidator.validateCoordinate(xType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(xType)) {
				if (textValidator.validatePercent(xType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXType1(String xType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateXType1_MemberTypes(xType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>XType1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXType1_MemberTypes(String xType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getDistance().isInstance(xType1)) {
				if (textValidator.validateDistance(xType1, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(xType1)) {
				if (textValidator.validatePercent(xType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getDistance().isInstance(xType1)) {
				if (textValidator.validateDistance(xType1, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(xType1)) {
				if (textValidator.validatePercent(xType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateY1Type(String y1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateY2Type(String y2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYType(String yType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateYType_MemberTypes(yType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>YType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYType_MemberTypes(String yType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getCoordinate().isInstance(yType)) {
				if (textValidator.validateCoordinate(yType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(yType)) {
				if (textValidator.validatePercent(yType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getCoordinate().isInstance(yType)) {
				if (textValidator.validateCoordinate(yType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(yType)) {
				if (textValidator.validatePercent(yType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYType1(String yType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateYType1_MemberTypes(yType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>YType1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYType1_MemberTypes(String yType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getDistance().isInstance(yType1)) {
				if (textValidator.validateDistance(yType1, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(yType1)) {
				if (textValidator.validatePercent(yType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getDistance().isInstance(yType1)) {
				if (textValidator.validateDistance(yType1, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(yType1)) {
				if (textValidator.validatePercent(yType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SvgValidator
