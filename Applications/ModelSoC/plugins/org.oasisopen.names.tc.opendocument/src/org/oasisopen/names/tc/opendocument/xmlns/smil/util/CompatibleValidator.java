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
package org.oasisopen.names.tc.opendocument.xmlns.smil.util;

import java.math.BigInteger;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage;
import org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.util.TextValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage
 * @generated
 */
public class CompatibleValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CompatibleValidator INSTANCE = new CompatibleValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.oasisopen.names.tc.opendocument.xmlns.smil";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibleValidator() {
		super();
		textValidator = TextValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CompatiblePackage.eINSTANCE;
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
			case CompatiblePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case CompatiblePackage.ACCUMULATE_TYPE:
				return validateAccumulateType((AccumulateType)value, diagnostics, context);
			case CompatiblePackage.ADDITIVE_TYPE:
				return validateAdditiveType((AdditiveType)value, diagnostics, context);
			case CompatiblePackage.CALC_MODE_TYPE:
				return validateCalcModeType((CalcModeType)value, diagnostics, context);
			case CompatiblePackage.DIRECTION_TYPE:
				return validateDirectionType((DirectionType)value, diagnostics, context);
			case CompatiblePackage.ENDSYNC_TYPE:
				return validateEndsyncType((EndsyncType)value, diagnostics, context);
			case CompatiblePackage.FADE_COLOR_TYPE:
				return validateFadeColorType((FadeColorType)value, diagnostics, context);
			case CompatiblePackage.FILL_DEFAULT_TYPE:
				return validateFillDefaultType((FillDefaultType)value, diagnostics, context);
			case CompatiblePackage.FILL_TYPE:
				return validateFillType((FillType)value, diagnostics, context);
			case CompatiblePackage.MODE_TYPE:
				return validateModeType((ModeType)value, diagnostics, context);
			case CompatiblePackage.REPEAT_COUNT_TYPE_MEMBER1:
				return validateRepeatCountTypeMember1((RepeatCountTypeMember1)value, diagnostics, context);
			case CompatiblePackage.RESTART_DEFAULT_TYPE:
				return validateRestartDefaultType((RestartDefaultType)value, diagnostics, context);
			case CompatiblePackage.RESTART_TYPE:
				return validateRestartType((RestartType)value, diagnostics, context);
			case CompatiblePackage.ACCUMULATE_TYPE_OBJECT:
				return validateAccumulateTypeObject((AccumulateType)value, diagnostics, context);
			case CompatiblePackage.ADDITIVE_TYPE_OBJECT:
				return validateAdditiveTypeObject((AdditiveType)value, diagnostics, context);
			case CompatiblePackage.CALC_MODE_TYPE_OBJECT:
				return validateCalcModeTypeObject((CalcModeType)value, diagnostics, context);
			case CompatiblePackage.DIRECTION_TYPE_OBJECT:
				return validateDirectionTypeObject((DirectionType)value, diagnostics, context);
			case CompatiblePackage.ENDSYNC_TYPE_OBJECT:
				return validateEndsyncTypeObject((EndsyncType)value, diagnostics, context);
			case CompatiblePackage.FADE_COLOR_TYPE_OBJECT:
				return validateFadeColorTypeObject((FadeColorType)value, diagnostics, context);
			case CompatiblePackage.FILL_DEFAULT_TYPE_OBJECT:
				return validateFillDefaultTypeObject((FillDefaultType)value, diagnostics, context);
			case CompatiblePackage.FILL_TYPE_OBJECT:
				return validateFillTypeObject((FillType)value, diagnostics, context);
			case CompatiblePackage.MODE_TYPE_OBJECT:
				return validateModeTypeObject((ModeType)value, diagnostics, context);
			case CompatiblePackage.REPEAT_COUNT_TYPE:
				return validateRepeatCountType(value, diagnostics, context);
			case CompatiblePackage.REPEAT_COUNT_TYPE_MEMBER1_OBJECT:
				return validateRepeatCountTypeMember1Object((RepeatCountTypeMember1)value, diagnostics, context);
			case CompatiblePackage.RESTART_DEFAULT_TYPE_OBJECT:
				return validateRestartDefaultTypeObject((RestartDefaultType)value, diagnostics, context);
			case CompatiblePackage.RESTART_TYPE_OBJECT:
				return validateRestartTypeObject((RestartType)value, diagnostics, context);
			default:
				return true;
		}
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
	public boolean validateAccumulateType(AccumulateType accumulateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditiveType(AdditiveType additiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalcModeType(CalcModeType calcModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionType(DirectionType directionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndsyncType(EndsyncType endsyncType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFadeColorType(FadeColorType fadeColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillDefaultType(FillDefaultType fillDefaultType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillType(FillType fillType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeType(ModeType modeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatCountTypeMember1(RepeatCountTypeMember1 repeatCountTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestartDefaultType(RestartDefaultType restartDefaultType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestartType(RestartType restartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccumulateTypeObject(AccumulateType accumulateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditiveTypeObject(AdditiveType additiveTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalcModeTypeObject(CalcModeType calcModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionTypeObject(DirectionType directionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndsyncTypeObject(EndsyncType endsyncTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFadeColorTypeObject(FadeColorType fadeColorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillDefaultTypeObject(FillDefaultType fillDefaultTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillTypeObject(FillType fillTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeTypeObject(ModeType modeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatCountType(Object repeatCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRepeatCountType_MemberTypes(repeatCountType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Repeat Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatCountType_MemberTypes(Object repeatCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getNonNegativeInteger().isInstance(repeatCountType)) {
				if (textValidator.validateNonNegativeInteger((BigInteger)repeatCountType, tempDiagnostics, context)) return true;
			}
			if (CompatiblePackage.Literals.REPEAT_COUNT_TYPE_MEMBER1.isInstance(repeatCountType)) {
				if (validateRepeatCountTypeMember1((RepeatCountTypeMember1)repeatCountType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getNonNegativeInteger().isInstance(repeatCountType)) {
				if (textValidator.validateNonNegativeInteger((BigInteger)repeatCountType, null, context)) return true;
			}
			if (CompatiblePackage.Literals.REPEAT_COUNT_TYPE_MEMBER1.isInstance(repeatCountType)) {
				if (validateRepeatCountTypeMember1((RepeatCountTypeMember1)repeatCountType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatCountTypeMember1Object(RepeatCountTypeMember1 repeatCountTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestartDefaultTypeObject(RestartDefaultType restartDefaultTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestartTypeObject(RestartType restartTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //CompatibleValidator
