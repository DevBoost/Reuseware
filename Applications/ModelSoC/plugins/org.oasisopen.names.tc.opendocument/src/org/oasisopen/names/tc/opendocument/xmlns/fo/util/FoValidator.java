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
package org.oasisopen.names.tc.opendocument.xmlns.fo.util;

import java.math.BigInteger;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage;
import org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2;
import org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.util.TextValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage
 * @generated
 */
public class FoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FoValidator INSTANCE = new FoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.oasisopen.names.tc.opendocument.xmlns.fo";

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
	public FoValidator() {
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
	  return FoPackage.eINSTANCE;
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
			case FoPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case FoPackage.BACKGROUND_COLOR_TYPE_MEMBER1:
				return validateBackgroundColorTypeMember1((BackgroundColorTypeMember1)value, diagnostics, context);
			case FoPackage.BREAK_AFTER_TYPE:
				return validateBreakAfterType((BreakAfterType)value, diagnostics, context);
			case FoPackage.BREAK_BEFORE_TYPE:
				return validateBreakBeforeType((BreakBeforeType)value, diagnostics, context);
			case FoPackage.HYPHENATION_KEEP_TYPE:
				return validateHyphenationKeepType((HyphenationKeepType)value, diagnostics, context);
			case FoPackage.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1:
				return validateHyphenationLadderCountTypeMember1((HyphenationLadderCountTypeMember1)value, diagnostics, context);
			case FoPackage.KEEP_TOGETHER_TYPE:
				return validateKeepTogetherType((KeepTogetherType)value, diagnostics, context);
			case FoPackage.KEEP_WITH_NEXT_TYPE:
				return validateKeepWithNextType((KeepWithNextType)value, diagnostics, context);
			case FoPackage.LETTER_SPACING_TYPE_MEMBER1:
				return validateLetterSpacingTypeMember1((LetterSpacingTypeMember1)value, diagnostics, context);
			case FoPackage.LINE_HEIGHT_TYPE_MEMBER2:
				return validateLineHeightTypeMember2((LineHeightTypeMember2)value, diagnostics, context);
			case FoPackage.TEXT_ALIGN_LAST_TYPE:
				return validateTextAlignLastType((TextAlignLastType)value, diagnostics, context);
			case FoPackage.TEXT_ALIGN_TYPE:
				return validateTextAlignType((TextAlignType)value, diagnostics, context);
			case FoPackage.TEXT_TRANSFORM_TYPE:
				return validateTextTransformType((TextTransformType)value, diagnostics, context);
			case FoPackage.WRAP_OPTION_TYPE:
				return validateWrapOptionType((WrapOptionType)value, diagnostics, context);
			case FoPackage.BACKGROUND_COLOR_TYPE:
				return validateBackgroundColorType(value, diagnostics, context);
			case FoPackage.BACKGROUND_COLOR_TYPE_MEMBER1_OBJECT:
				return validateBackgroundColorTypeMember1Object((BackgroundColorTypeMember1)value, diagnostics, context);
			case FoPackage.BREAK_AFTER_TYPE_OBJECT:
				return validateBreakAfterTypeObject((BreakAfterType)value, diagnostics, context);
			case FoPackage.BREAK_BEFORE_TYPE_OBJECT:
				return validateBreakBeforeTypeObject((BreakBeforeType)value, diagnostics, context);
			case FoPackage.FONT_SIZE_TYPE:
				return validateFontSizeType((String)value, diagnostics, context);
			case FoPackage.HYPHENATION_KEEP_TYPE_OBJECT:
				return validateHyphenationKeepTypeObject((HyphenationKeepType)value, diagnostics, context);
			case FoPackage.HYPHENATION_LADDER_COUNT_TYPE:
				return validateHyphenationLadderCountType(value, diagnostics, context);
			case FoPackage.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1_OBJECT:
				return validateHyphenationLadderCountTypeMember1Object((HyphenationLadderCountTypeMember1)value, diagnostics, context);
			case FoPackage.KEEP_TOGETHER_TYPE_OBJECT:
				return validateKeepTogetherTypeObject((KeepTogetherType)value, diagnostics, context);
			case FoPackage.KEEP_WITH_NEXT_TYPE_OBJECT:
				return validateKeepWithNextTypeObject((KeepWithNextType)value, diagnostics, context);
			case FoPackage.LETTER_SPACING_TYPE:
				return validateLetterSpacingType(value, diagnostics, context);
			case FoPackage.LETTER_SPACING_TYPE_MEMBER1_OBJECT:
				return validateLetterSpacingTypeMember1Object((LetterSpacingTypeMember1)value, diagnostics, context);
			case FoPackage.LINE_HEIGHT_TYPE:
				return validateLineHeightType(value, diagnostics, context);
			case FoPackage.LINE_HEIGHT_TYPE_MEMBER2_OBJECT:
				return validateLineHeightTypeMember2Object((LineHeightTypeMember2)value, diagnostics, context);
			case FoPackage.MARGIN_BOTTOM_TYPE:
				return validateMarginBottomType((String)value, diagnostics, context);
			case FoPackage.MARGIN_LEFT_TYPE:
				return validateMarginLeftType((String)value, diagnostics, context);
			case FoPackage.MARGIN_RIGHT_TYPE:
				return validateMarginRightType((String)value, diagnostics, context);
			case FoPackage.MARGIN_TOP_TYPE:
				return validateMarginTopType((String)value, diagnostics, context);
			case FoPackage.MARGIN_TYPE:
				return validateMarginType((String)value, diagnostics, context);
			case FoPackage.MAX_HEIGHT_TYPE:
				return validateMaxHeightType((String)value, diagnostics, context);
			case FoPackage.MAX_WIDTH_TYPE:
				return validateMaxWidthType((String)value, diagnostics, context);
			case FoPackage.MIN_HEIGHT_TYPE:
				return validateMinHeightType((String)value, diagnostics, context);
			case FoPackage.MIN_WIDTH_TYPE:
				return validateMinWidthType((String)value, diagnostics, context);
			case FoPackage.TEXT_ALIGN_LAST_TYPE_OBJECT:
				return validateTextAlignLastTypeObject((TextAlignLastType)value, diagnostics, context);
			case FoPackage.TEXT_ALIGN_TYPE_OBJECT:
				return validateTextAlignTypeObject((TextAlignType)value, diagnostics, context);
			case FoPackage.TEXT_INDENT_TYPE:
				return validateTextIndentType((String)value, diagnostics, context);
			case FoPackage.TEXT_TRANSFORM_TYPE_OBJECT:
				return validateTextTransformTypeObject((TextTransformType)value, diagnostics, context);
			case FoPackage.WRAP_OPTION_TYPE_OBJECT:
				return validateWrapOptionTypeObject((WrapOptionType)value, diagnostics, context);
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
	public boolean validateBackgroundColorTypeMember1(BackgroundColorTypeMember1 backgroundColorTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreakAfterType(BreakAfterType breakAfterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreakBeforeType(BreakBeforeType breakBeforeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyphenationKeepType(HyphenationKeepType hyphenationKeepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyphenationLadderCountTypeMember1(HyphenationLadderCountTypeMember1 hyphenationLadderCountTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeepTogetherType(KeepTogetherType keepTogetherType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeepWithNextType(KeepWithNextType keepWithNextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLetterSpacingTypeMember1(LetterSpacingTypeMember1 letterSpacingTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineHeightTypeMember2(LineHeightTypeMember2 lineHeightTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextAlignLastType(TextAlignLastType textAlignLastType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextAlignType(TextAlignType textAlignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextTransformType(TextTransformType textTransformType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapOptionType(WrapOptionType wrapOptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundColorType(Object backgroundColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBackgroundColorType_MemberTypes(backgroundColorType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Background Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundColorType_MemberTypes(Object backgroundColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getColor().isInstance(backgroundColorType)) {
				if (textValidator.validateColor((String)backgroundColorType, tempDiagnostics, context)) return true;
			}
			if (FoPackage.Literals.BACKGROUND_COLOR_TYPE_MEMBER1.isInstance(backgroundColorType)) {
				if (validateBackgroundColorTypeMember1((BackgroundColorTypeMember1)backgroundColorType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getColor().isInstance(backgroundColorType)) {
				if (textValidator.validateColor((String)backgroundColorType, null, context)) return true;
			}
			if (FoPackage.Literals.BACKGROUND_COLOR_TYPE_MEMBER1.isInstance(backgroundColorType)) {
				if (validateBackgroundColorTypeMember1((BackgroundColorTypeMember1)backgroundColorType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundColorTypeMember1Object(BackgroundColorTypeMember1 backgroundColorTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreakAfterTypeObject(BreakAfterType breakAfterTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreakBeforeTypeObject(BreakBeforeType breakBeforeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontSizeType(String fontSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFontSizeType_MemberTypes(fontSizeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Font Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontSizeType_MemberTypes(String fontSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getPositiveLength().isInstance(fontSizeType)) {
				if (textValidator.validatePositiveLength(fontSizeType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(fontSizeType)) {
				if (textValidator.validatePercent(fontSizeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getPositiveLength().isInstance(fontSizeType)) {
				if (textValidator.validatePositiveLength(fontSizeType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(fontSizeType)) {
				if (textValidator.validatePercent(fontSizeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyphenationKeepTypeObject(HyphenationKeepType hyphenationKeepTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyphenationLadderCountType(Object hyphenationLadderCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHyphenationLadderCountType_MemberTypes(hyphenationLadderCountType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Hyphenation Ladder Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyphenationLadderCountType_MemberTypes(Object hyphenationLadderCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getPositiveInteger().isInstance(hyphenationLadderCountType)) {
				if (textValidator.validatePositiveInteger((BigInteger)hyphenationLadderCountType, tempDiagnostics, context)) return true;
			}
			if (FoPackage.Literals.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1.isInstance(hyphenationLadderCountType)) {
				if (validateHyphenationLadderCountTypeMember1((HyphenationLadderCountTypeMember1)hyphenationLadderCountType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getPositiveInteger().isInstance(hyphenationLadderCountType)) {
				if (textValidator.validatePositiveInteger((BigInteger)hyphenationLadderCountType, null, context)) return true;
			}
			if (FoPackage.Literals.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1.isInstance(hyphenationLadderCountType)) {
				if (validateHyphenationLadderCountTypeMember1((HyphenationLadderCountTypeMember1)hyphenationLadderCountType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyphenationLadderCountTypeMember1Object(HyphenationLadderCountTypeMember1 hyphenationLadderCountTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeepTogetherTypeObject(KeepTogetherType keepTogetherTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeepWithNextTypeObject(KeepWithNextType keepWithNextTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLetterSpacingType(Object letterSpacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLetterSpacingType_MemberTypes(letterSpacingType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Letter Spacing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLetterSpacingType_MemberTypes(Object letterSpacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(letterSpacingType)) {
				if (textValidator.validateLength((String)letterSpacingType, tempDiagnostics, context)) return true;
			}
			if (FoPackage.Literals.LETTER_SPACING_TYPE_MEMBER1.isInstance(letterSpacingType)) {
				if (validateLetterSpacingTypeMember1((LetterSpacingTypeMember1)letterSpacingType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(letterSpacingType)) {
				if (textValidator.validateLength((String)letterSpacingType, null, context)) return true;
			}
			if (FoPackage.Literals.LETTER_SPACING_TYPE_MEMBER1.isInstance(letterSpacingType)) {
				if (validateLetterSpacingTypeMember1((LetterSpacingTypeMember1)letterSpacingType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLetterSpacingTypeMember1Object(LetterSpacingTypeMember1 letterSpacingTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineHeightType(Object lineHeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLineHeightType_MemberTypes(lineHeightType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Line Height Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineHeightType_MemberTypes(Object lineHeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getNonNegativeLength().isInstance(lineHeightType)) {
				if (textValidator.validateNonNegativeLength((String)lineHeightType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(lineHeightType)) {
				if (textValidator.validatePercent((String)lineHeightType, tempDiagnostics, context)) return true;
			}
			if (FoPackage.Literals.LINE_HEIGHT_TYPE_MEMBER2.isInstance(lineHeightType)) {
				if (validateLineHeightTypeMember2((LineHeightTypeMember2)lineHeightType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getNonNegativeLength().isInstance(lineHeightType)) {
				if (textValidator.validateNonNegativeLength((String)lineHeightType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(lineHeightType)) {
				if (textValidator.validatePercent((String)lineHeightType, null, context)) return true;
			}
			if (FoPackage.Literals.LINE_HEIGHT_TYPE_MEMBER2.isInstance(lineHeightType)) {
				if (validateLineHeightTypeMember2((LineHeightTypeMember2)lineHeightType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineHeightTypeMember2Object(LineHeightTypeMember2 lineHeightTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarginBottomType(String marginBottomType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarginBottomType_MemberTypes(marginBottomType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Margin Bottom Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarginBottomType_MemberTypes(String marginBottomType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getNonNegativeLength().isInstance(marginBottomType)) {
				if (textValidator.validateNonNegativeLength(marginBottomType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(marginBottomType)) {
				if (textValidator.validatePercent(marginBottomType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getNonNegativeLength().isInstance(marginBottomType)) {
				if (textValidator.validateNonNegativeLength(marginBottomType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(marginBottomType)) {
				if (textValidator.validatePercent(marginBottomType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarginLeftType(String marginLeftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarginLeftType_MemberTypes(marginLeftType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Margin Left Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarginLeftType_MemberTypes(String marginLeftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(marginLeftType)) {
				if (textValidator.validateLength(marginLeftType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(marginLeftType)) {
				if (textValidator.validatePercent(marginLeftType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(marginLeftType)) {
				if (textValidator.validateLength(marginLeftType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(marginLeftType)) {
				if (textValidator.validatePercent(marginLeftType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarginRightType(String marginRightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarginRightType_MemberTypes(marginRightType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Margin Right Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarginRightType_MemberTypes(String marginRightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(marginRightType)) {
				if (textValidator.validateLength(marginRightType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(marginRightType)) {
				if (textValidator.validatePercent(marginRightType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(marginRightType)) {
				if (textValidator.validateLength(marginRightType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(marginRightType)) {
				if (textValidator.validatePercent(marginRightType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarginTopType(String marginTopType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarginTopType_MemberTypes(marginTopType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Margin Top Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarginTopType_MemberTypes(String marginTopType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getNonNegativeLength().isInstance(marginTopType)) {
				if (textValidator.validateNonNegativeLength(marginTopType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(marginTopType)) {
				if (textValidator.validatePercent(marginTopType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getNonNegativeLength().isInstance(marginTopType)) {
				if (textValidator.validateNonNegativeLength(marginTopType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(marginTopType)) {
				if (textValidator.validatePercent(marginTopType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarginType(String marginType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarginType_MemberTypes(marginType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Margin Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarginType_MemberTypes(String marginType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getNonNegativeLength().isInstance(marginType)) {
				if (textValidator.validateNonNegativeLength(marginType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(marginType)) {
				if (textValidator.validatePercent(marginType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getNonNegativeLength().isInstance(marginType)) {
				if (textValidator.validateNonNegativeLength(marginType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(marginType)) {
				if (textValidator.validatePercent(marginType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxHeightType(String maxHeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaxHeightType_MemberTypes(maxHeightType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Max Height Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxHeightType_MemberTypes(String maxHeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(maxHeightType)) {
				if (textValidator.validateLength(maxHeightType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(maxHeightType)) {
				if (textValidator.validatePercent(maxHeightType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(maxHeightType)) {
				if (textValidator.validateLength(maxHeightType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(maxHeightType)) {
				if (textValidator.validatePercent(maxHeightType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxWidthType(String maxWidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaxWidthType_MemberTypes(maxWidthType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Max Width Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxWidthType_MemberTypes(String maxWidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(maxWidthType)) {
				if (textValidator.validateLength(maxWidthType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(maxWidthType)) {
				if (textValidator.validatePercent(maxWidthType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(maxWidthType)) {
				if (textValidator.validateLength(maxWidthType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(maxWidthType)) {
				if (textValidator.validatePercent(maxWidthType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinHeightType(String minHeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMinHeightType_MemberTypes(minHeightType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Min Height Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinHeightType_MemberTypes(String minHeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(minHeightType)) {
				if (textValidator.validateLength(minHeightType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(minHeightType)) {
				if (textValidator.validatePercent(minHeightType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(minHeightType)) {
				if (textValidator.validateLength(minHeightType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(minHeightType)) {
				if (textValidator.validatePercent(minHeightType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinWidthType(String minWidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMinWidthType_MemberTypes(minWidthType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Min Width Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinWidthType_MemberTypes(String minWidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(minWidthType)) {
				if (textValidator.validateLength(minWidthType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(minWidthType)) {
				if (textValidator.validatePercent(minWidthType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(minWidthType)) {
				if (textValidator.validateLength(minWidthType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(minWidthType)) {
				if (textValidator.validatePercent(minWidthType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextAlignLastTypeObject(TextAlignLastType textAlignLastTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextAlignTypeObject(TextAlignType textAlignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextIndentType(String textIndentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextIndentType_MemberTypes(textIndentType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Text Indent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextIndentType_MemberTypes(String textIndentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(textIndentType)) {
				if (textValidator.validateLength(textIndentType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(textIndentType)) {
				if (textValidator.validatePercent(textIndentType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(textIndentType)) {
				if (textValidator.validateLength(textIndentType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(textIndentType)) {
				if (textValidator.validatePercent(textIndentType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextTransformTypeObject(TextTransformType textTransformTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapOptionTypeObject(WrapOptionType wrapOptionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //FoValidator
