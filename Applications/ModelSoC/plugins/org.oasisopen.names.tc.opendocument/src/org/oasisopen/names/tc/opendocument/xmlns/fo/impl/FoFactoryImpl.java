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
package org.oasisopen.names.tc.opendocument.xmlns.fo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.fo.FoFactory;
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
import org.oasisopen.names.tc.opendocument.xmlns.text.TextFactory;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FoFactoryImpl extends EFactoryImpl implements FoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FoFactory init() {
		try {
			FoFactory theFoFactory = (FoFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0"); 
			if (theFoFactory != null) {
				return theFoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FoPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FoPackage.BACKGROUND_COLOR_TYPE_MEMBER1:
				return createBackgroundColorTypeMember1FromString(eDataType, initialValue);
			case FoPackage.BREAK_AFTER_TYPE:
				return createBreakAfterTypeFromString(eDataType, initialValue);
			case FoPackage.BREAK_BEFORE_TYPE:
				return createBreakBeforeTypeFromString(eDataType, initialValue);
			case FoPackage.HYPHENATION_KEEP_TYPE:
				return createHyphenationKeepTypeFromString(eDataType, initialValue);
			case FoPackage.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1:
				return createHyphenationLadderCountTypeMember1FromString(eDataType, initialValue);
			case FoPackage.KEEP_TOGETHER_TYPE:
				return createKeepTogetherTypeFromString(eDataType, initialValue);
			case FoPackage.KEEP_WITH_NEXT_TYPE:
				return createKeepWithNextTypeFromString(eDataType, initialValue);
			case FoPackage.LETTER_SPACING_TYPE_MEMBER1:
				return createLetterSpacingTypeMember1FromString(eDataType, initialValue);
			case FoPackage.LINE_HEIGHT_TYPE_MEMBER2:
				return createLineHeightTypeMember2FromString(eDataType, initialValue);
			case FoPackage.TEXT_ALIGN_LAST_TYPE:
				return createTextAlignLastTypeFromString(eDataType, initialValue);
			case FoPackage.TEXT_ALIGN_TYPE:
				return createTextAlignTypeFromString(eDataType, initialValue);
			case FoPackage.TEXT_TRANSFORM_TYPE:
				return createTextTransformTypeFromString(eDataType, initialValue);
			case FoPackage.WRAP_OPTION_TYPE:
				return createWrapOptionTypeFromString(eDataType, initialValue);
			case FoPackage.BACKGROUND_COLOR_TYPE:
				return createBackgroundColorTypeFromString(eDataType, initialValue);
			case FoPackage.BACKGROUND_COLOR_TYPE_MEMBER1_OBJECT:
				return createBackgroundColorTypeMember1ObjectFromString(eDataType, initialValue);
			case FoPackage.BREAK_AFTER_TYPE_OBJECT:
				return createBreakAfterTypeObjectFromString(eDataType, initialValue);
			case FoPackage.BREAK_BEFORE_TYPE_OBJECT:
				return createBreakBeforeTypeObjectFromString(eDataType, initialValue);
			case FoPackage.FONT_SIZE_TYPE:
				return createFontSizeTypeFromString(eDataType, initialValue);
			case FoPackage.HYPHENATION_KEEP_TYPE_OBJECT:
				return createHyphenationKeepTypeObjectFromString(eDataType, initialValue);
			case FoPackage.HYPHENATION_LADDER_COUNT_TYPE:
				return createHyphenationLadderCountTypeFromString(eDataType, initialValue);
			case FoPackage.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1_OBJECT:
				return createHyphenationLadderCountTypeMember1ObjectFromString(eDataType, initialValue);
			case FoPackage.KEEP_TOGETHER_TYPE_OBJECT:
				return createKeepTogetherTypeObjectFromString(eDataType, initialValue);
			case FoPackage.KEEP_WITH_NEXT_TYPE_OBJECT:
				return createKeepWithNextTypeObjectFromString(eDataType, initialValue);
			case FoPackage.LETTER_SPACING_TYPE:
				return createLetterSpacingTypeFromString(eDataType, initialValue);
			case FoPackage.LETTER_SPACING_TYPE_MEMBER1_OBJECT:
				return createLetterSpacingTypeMember1ObjectFromString(eDataType, initialValue);
			case FoPackage.LINE_HEIGHT_TYPE:
				return createLineHeightTypeFromString(eDataType, initialValue);
			case FoPackage.LINE_HEIGHT_TYPE_MEMBER2_OBJECT:
				return createLineHeightTypeMember2ObjectFromString(eDataType, initialValue);
			case FoPackage.MARGIN_BOTTOM_TYPE:
				return createMarginBottomTypeFromString(eDataType, initialValue);
			case FoPackage.MARGIN_LEFT_TYPE:
				return createMarginLeftTypeFromString(eDataType, initialValue);
			case FoPackage.MARGIN_RIGHT_TYPE:
				return createMarginRightTypeFromString(eDataType, initialValue);
			case FoPackage.MARGIN_TOP_TYPE:
				return createMarginTopTypeFromString(eDataType, initialValue);
			case FoPackage.MARGIN_TYPE:
				return createMarginTypeFromString(eDataType, initialValue);
			case FoPackage.MAX_HEIGHT_TYPE:
				return createMaxHeightTypeFromString(eDataType, initialValue);
			case FoPackage.MAX_WIDTH_TYPE:
				return createMaxWidthTypeFromString(eDataType, initialValue);
			case FoPackage.MIN_HEIGHT_TYPE:
				return createMinHeightTypeFromString(eDataType, initialValue);
			case FoPackage.MIN_WIDTH_TYPE:
				return createMinWidthTypeFromString(eDataType, initialValue);
			case FoPackage.TEXT_ALIGN_LAST_TYPE_OBJECT:
				return createTextAlignLastTypeObjectFromString(eDataType, initialValue);
			case FoPackage.TEXT_ALIGN_TYPE_OBJECT:
				return createTextAlignTypeObjectFromString(eDataType, initialValue);
			case FoPackage.TEXT_INDENT_TYPE:
				return createTextIndentTypeFromString(eDataType, initialValue);
			case FoPackage.TEXT_TRANSFORM_TYPE_OBJECT:
				return createTextTransformTypeObjectFromString(eDataType, initialValue);
			case FoPackage.WRAP_OPTION_TYPE_OBJECT:
				return createWrapOptionTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FoPackage.BACKGROUND_COLOR_TYPE_MEMBER1:
				return convertBackgroundColorTypeMember1ToString(eDataType, instanceValue);
			case FoPackage.BREAK_AFTER_TYPE:
				return convertBreakAfterTypeToString(eDataType, instanceValue);
			case FoPackage.BREAK_BEFORE_TYPE:
				return convertBreakBeforeTypeToString(eDataType, instanceValue);
			case FoPackage.HYPHENATION_KEEP_TYPE:
				return convertHyphenationKeepTypeToString(eDataType, instanceValue);
			case FoPackage.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1:
				return convertHyphenationLadderCountTypeMember1ToString(eDataType, instanceValue);
			case FoPackage.KEEP_TOGETHER_TYPE:
				return convertKeepTogetherTypeToString(eDataType, instanceValue);
			case FoPackage.KEEP_WITH_NEXT_TYPE:
				return convertKeepWithNextTypeToString(eDataType, instanceValue);
			case FoPackage.LETTER_SPACING_TYPE_MEMBER1:
				return convertLetterSpacingTypeMember1ToString(eDataType, instanceValue);
			case FoPackage.LINE_HEIGHT_TYPE_MEMBER2:
				return convertLineHeightTypeMember2ToString(eDataType, instanceValue);
			case FoPackage.TEXT_ALIGN_LAST_TYPE:
				return convertTextAlignLastTypeToString(eDataType, instanceValue);
			case FoPackage.TEXT_ALIGN_TYPE:
				return convertTextAlignTypeToString(eDataType, instanceValue);
			case FoPackage.TEXT_TRANSFORM_TYPE:
				return convertTextTransformTypeToString(eDataType, instanceValue);
			case FoPackage.WRAP_OPTION_TYPE:
				return convertWrapOptionTypeToString(eDataType, instanceValue);
			case FoPackage.BACKGROUND_COLOR_TYPE:
				return convertBackgroundColorTypeToString(eDataType, instanceValue);
			case FoPackage.BACKGROUND_COLOR_TYPE_MEMBER1_OBJECT:
				return convertBackgroundColorTypeMember1ObjectToString(eDataType, instanceValue);
			case FoPackage.BREAK_AFTER_TYPE_OBJECT:
				return convertBreakAfterTypeObjectToString(eDataType, instanceValue);
			case FoPackage.BREAK_BEFORE_TYPE_OBJECT:
				return convertBreakBeforeTypeObjectToString(eDataType, instanceValue);
			case FoPackage.FONT_SIZE_TYPE:
				return convertFontSizeTypeToString(eDataType, instanceValue);
			case FoPackage.HYPHENATION_KEEP_TYPE_OBJECT:
				return convertHyphenationKeepTypeObjectToString(eDataType, instanceValue);
			case FoPackage.HYPHENATION_LADDER_COUNT_TYPE:
				return convertHyphenationLadderCountTypeToString(eDataType, instanceValue);
			case FoPackage.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1_OBJECT:
				return convertHyphenationLadderCountTypeMember1ObjectToString(eDataType, instanceValue);
			case FoPackage.KEEP_TOGETHER_TYPE_OBJECT:
				return convertKeepTogetherTypeObjectToString(eDataType, instanceValue);
			case FoPackage.KEEP_WITH_NEXT_TYPE_OBJECT:
				return convertKeepWithNextTypeObjectToString(eDataType, instanceValue);
			case FoPackage.LETTER_SPACING_TYPE:
				return convertLetterSpacingTypeToString(eDataType, instanceValue);
			case FoPackage.LETTER_SPACING_TYPE_MEMBER1_OBJECT:
				return convertLetterSpacingTypeMember1ObjectToString(eDataType, instanceValue);
			case FoPackage.LINE_HEIGHT_TYPE:
				return convertLineHeightTypeToString(eDataType, instanceValue);
			case FoPackage.LINE_HEIGHT_TYPE_MEMBER2_OBJECT:
				return convertLineHeightTypeMember2ObjectToString(eDataType, instanceValue);
			case FoPackage.MARGIN_BOTTOM_TYPE:
				return convertMarginBottomTypeToString(eDataType, instanceValue);
			case FoPackage.MARGIN_LEFT_TYPE:
				return convertMarginLeftTypeToString(eDataType, instanceValue);
			case FoPackage.MARGIN_RIGHT_TYPE:
				return convertMarginRightTypeToString(eDataType, instanceValue);
			case FoPackage.MARGIN_TOP_TYPE:
				return convertMarginTopTypeToString(eDataType, instanceValue);
			case FoPackage.MARGIN_TYPE:
				return convertMarginTypeToString(eDataType, instanceValue);
			case FoPackage.MAX_HEIGHT_TYPE:
				return convertMaxHeightTypeToString(eDataType, instanceValue);
			case FoPackage.MAX_WIDTH_TYPE:
				return convertMaxWidthTypeToString(eDataType, instanceValue);
			case FoPackage.MIN_HEIGHT_TYPE:
				return convertMinHeightTypeToString(eDataType, instanceValue);
			case FoPackage.MIN_WIDTH_TYPE:
				return convertMinWidthTypeToString(eDataType, instanceValue);
			case FoPackage.TEXT_ALIGN_LAST_TYPE_OBJECT:
				return convertTextAlignLastTypeObjectToString(eDataType, instanceValue);
			case FoPackage.TEXT_ALIGN_TYPE_OBJECT:
				return convertTextAlignTypeObjectToString(eDataType, instanceValue);
			case FoPackage.TEXT_INDENT_TYPE:
				return convertTextIndentTypeToString(eDataType, instanceValue);
			case FoPackage.TEXT_TRANSFORM_TYPE_OBJECT:
				return convertTextTransformTypeObjectToString(eDataType, instanceValue);
			case FoPackage.WRAP_OPTION_TYPE_OBJECT:
				return convertWrapOptionTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundColorTypeMember1 createBackgroundColorTypeMember1FromString(EDataType eDataType, String initialValue) {
		BackgroundColorTypeMember1 result = BackgroundColorTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackgroundColorTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakAfterType createBreakAfterTypeFromString(EDataType eDataType, String initialValue) {
		BreakAfterType result = BreakAfterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBreakAfterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakBeforeType createBreakBeforeTypeFromString(EDataType eDataType, String initialValue) {
		BreakBeforeType result = BreakBeforeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBreakBeforeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyphenationKeepType createHyphenationKeepTypeFromString(EDataType eDataType, String initialValue) {
		HyphenationKeepType result = HyphenationKeepType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyphenationKeepTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyphenationLadderCountTypeMember1 createHyphenationLadderCountTypeMember1FromString(EDataType eDataType, String initialValue) {
		HyphenationLadderCountTypeMember1 result = HyphenationLadderCountTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyphenationLadderCountTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeepTogetherType createKeepTogetherTypeFromString(EDataType eDataType, String initialValue) {
		KeepTogetherType result = KeepTogetherType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeepTogetherTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeepWithNextType createKeepWithNextTypeFromString(EDataType eDataType, String initialValue) {
		KeepWithNextType result = KeepWithNextType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeepWithNextTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetterSpacingTypeMember1 createLetterSpacingTypeMember1FromString(EDataType eDataType, String initialValue) {
		LetterSpacingTypeMember1 result = LetterSpacingTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLetterSpacingTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineHeightTypeMember2 createLineHeightTypeMember2FromString(EDataType eDataType, String initialValue) {
		LineHeightTypeMember2 result = LineHeightTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineHeightTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlignLastType createTextAlignLastTypeFromString(EDataType eDataType, String initialValue) {
		TextAlignLastType result = TextAlignLastType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextAlignLastTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlignType createTextAlignTypeFromString(EDataType eDataType, String initialValue) {
		TextAlignType result = TextAlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextTransformType createTextTransformTypeFromString(EDataType eDataType, String initialValue) {
		TextTransformType result = TextTransformType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextTransformTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapOptionType createWrapOptionTypeFromString(EDataType eDataType, String initialValue) {
		WrapOptionType result = WrapOptionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWrapOptionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createBackgroundColorTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getColor(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createBackgroundColorTypeMember1FromString(FoPackage.Literals.BACKGROUND_COLOR_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackgroundColorTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getColor().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getColor(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (FoPackage.Literals.BACKGROUND_COLOR_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertBackgroundColorTypeMember1ToString(FoPackage.Literals.BACKGROUND_COLOR_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundColorTypeMember1 createBackgroundColorTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createBackgroundColorTypeMember1FromString(FoPackage.Literals.BACKGROUND_COLOR_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackgroundColorTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBackgroundColorTypeMember1ToString(FoPackage.Literals.BACKGROUND_COLOR_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakAfterType createBreakAfterTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBreakAfterTypeFromString(FoPackage.Literals.BREAK_AFTER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBreakAfterTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBreakAfterTypeToString(FoPackage.Literals.BREAK_AFTER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakBeforeType createBreakBeforeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBreakBeforeTypeFromString(FoPackage.Literals.BREAK_BEFORE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBreakBeforeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBreakBeforeTypeToString(FoPackage.Literals.BREAK_BEFORE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFontSizeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPositiveLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontSizeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getPositiveLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPositiveLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyphenationKeepType createHyphenationKeepTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHyphenationKeepTypeFromString(FoPackage.Literals.HYPHENATION_KEEP_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyphenationKeepTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHyphenationKeepTypeToString(FoPackage.Literals.HYPHENATION_KEEP_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createHyphenationLadderCountTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPositiveInteger(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createHyphenationLadderCountTypeMember1FromString(FoPackage.Literals.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyphenationLadderCountTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getPositiveInteger().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPositiveInteger(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (FoPackage.Literals.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertHyphenationLadderCountTypeMember1ToString(FoPackage.Literals.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyphenationLadderCountTypeMember1 createHyphenationLadderCountTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createHyphenationLadderCountTypeMember1FromString(FoPackage.Literals.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyphenationLadderCountTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHyphenationLadderCountTypeMember1ToString(FoPackage.Literals.HYPHENATION_LADDER_COUNT_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeepTogetherType createKeepTogetherTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKeepTogetherTypeFromString(FoPackage.Literals.KEEP_TOGETHER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeepTogetherTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKeepTogetherTypeToString(FoPackage.Literals.KEEP_TOGETHER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeepWithNextType createKeepWithNextTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKeepWithNextTypeFromString(FoPackage.Literals.KEEP_WITH_NEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeepWithNextTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKeepWithNextTypeToString(FoPackage.Literals.KEEP_WITH_NEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createLetterSpacingTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLetterSpacingTypeMember1FromString(FoPackage.Literals.LETTER_SPACING_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLetterSpacingTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (FoPackage.Literals.LETTER_SPACING_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertLetterSpacingTypeMember1ToString(FoPackage.Literals.LETTER_SPACING_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetterSpacingTypeMember1 createLetterSpacingTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createLetterSpacingTypeMember1FromString(FoPackage.Literals.LETTER_SPACING_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLetterSpacingTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLetterSpacingTypeMember1ToString(FoPackage.Literals.LETTER_SPACING_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createLineHeightTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getNonNegativeLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLineHeightTypeMember2FromString(FoPackage.Literals.LINE_HEIGHT_TYPE_MEMBER2, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineHeightTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getNonNegativeLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getNonNegativeLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (FoPackage.Literals.LINE_HEIGHT_TYPE_MEMBER2.isInstance(instanceValue)) {
			try {
				String value = convertLineHeightTypeMember2ToString(FoPackage.Literals.LINE_HEIGHT_TYPE_MEMBER2, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineHeightTypeMember2 createLineHeightTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createLineHeightTypeMember2FromString(FoPackage.Literals.LINE_HEIGHT_TYPE_MEMBER2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineHeightTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineHeightTypeMember2ToString(FoPackage.Literals.LINE_HEIGHT_TYPE_MEMBER2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMarginBottomTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getNonNegativeLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarginBottomTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getNonNegativeLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getNonNegativeLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMarginLeftTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarginLeftTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMarginRightTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarginRightTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMarginTopTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getNonNegativeLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarginTopTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getNonNegativeLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getNonNegativeLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMarginTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getNonNegativeLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarginTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getNonNegativeLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getNonNegativeLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMaxHeightTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxHeightTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMaxWidthTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxWidthTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMinHeightTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMinHeightTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMinWidthTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMinWidthTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlignLastType createTextAlignLastTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextAlignLastTypeFromString(FoPackage.Literals.TEXT_ALIGN_LAST_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextAlignLastTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextAlignLastTypeToString(FoPackage.Literals.TEXT_ALIGN_LAST_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlignType createTextAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextAlignTypeFromString(FoPackage.Literals.TEXT_ALIGN_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextAlignTypeToString(FoPackage.Literals.TEXT_ALIGN_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextIndentTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextIndentTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextTransformType createTextTransformTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextTransformTypeFromString(FoPackage.Literals.TEXT_TRANSFORM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextTransformTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextTransformTypeToString(FoPackage.Literals.TEXT_TRANSFORM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapOptionType createWrapOptionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWrapOptionTypeFromString(FoPackage.Literals.WRAP_OPTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWrapOptionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWrapOptionTypeToString(FoPackage.Literals.WRAP_OPTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoPackage getFoPackage() {
		return (FoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FoPackage getPackage() {
		return FoPackage.eINSTANCE;
	}

} //FoFactoryImpl
