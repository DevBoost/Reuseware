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
package org.oasisopen.names.tc.opendocument.xmlns.fo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoFactory
 * @model kind="package"
 * @generated
 */
public interface FoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odffo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FoPackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BACKGROUND_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER = 4;

	/**
	 * The feature id for the '<em><b>Border Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER_BOTTOM = 5;

	/**
	 * The feature id for the '<em><b>Border Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER_LEFT = 6;

	/**
	 * The feature id for the '<em><b>Border Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER_RIGHT = 7;

	/**
	 * The feature id for the '<em><b>Border Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BORDER_TOP = 8;

	/**
	 * The feature id for the '<em><b>Break After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BREAK_AFTER = 9;

	/**
	 * The feature id for the '<em><b>Break Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BREAK_BEFORE = 10;

	/**
	 * The feature id for the '<em><b>Clip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLIP = 11;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLOR = 12;

	/**
	 * The feature id for the '<em><b>Column Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMN_COUNT = 13;

	/**
	 * The feature id for the '<em><b>Column Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMN_GAP = 14;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTRY = 15;

	/**
	 * The feature id for the '<em><b>End Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END_INDENT = 16;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_FAMILY = 17;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_SIZE = 18;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_STYLE = 19;

	/**
	 * The feature id for the '<em><b>Font Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_VARIANT = 20;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FONT_WEIGHT = 21;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEIGHT = 22;

	/**
	 * The feature id for the '<em><b>Hyphenate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HYPHENATE = 23;

	/**
	 * The feature id for the '<em><b>Hyphenation Keep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HYPHENATION_KEEP = 24;

	/**
	 * The feature id for the '<em><b>Hyphenation Ladder Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HYPHENATION_LADDER_COUNT = 25;

	/**
	 * The feature id for the '<em><b>Hyphenation Push Char Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HYPHENATION_PUSH_CHAR_COUNT = 26;

	/**
	 * The feature id for the '<em><b>Hyphenation Remain Char Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HYPHENATION_REMAIN_CHAR_COUNT = 27;

	/**
	 * The feature id for the '<em><b>Keep Together</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEEP_TOGETHER = 28;

	/**
	 * The feature id for the '<em><b>Keep With Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEEP_WITH_NEXT = 29;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANGUAGE = 30;

	/**
	 * The feature id for the '<em><b>Letter Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LETTER_SPACING = 31;

	/**
	 * The feature id for the '<em><b>Line Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_HEIGHT = 32;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARGIN = 33;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARGIN_BOTTOM = 34;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARGIN_LEFT = 35;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARGIN_RIGHT = 36;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MARGIN_TOP = 37;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_HEIGHT = 38;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_WIDTH = 39;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_WIDTH = 40;

	/**
	 * The feature id for the '<em><b>Orphans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORPHANS = 41;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PADDING = 42;

	/**
	 * The feature id for the '<em><b>Padding Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PADDING_BOTTOM = 43;

	/**
	 * The feature id for the '<em><b>Padding Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PADDING_LEFT = 44;

	/**
	 * The feature id for the '<em><b>Padding Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PADDING_RIGHT = 45;

	/**
	 * The feature id for the '<em><b>Padding Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PADDING_TOP = 46;

	/**
	 * The feature id for the '<em><b>Page Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE_HEIGHT = 47;

	/**
	 * The feature id for the '<em><b>Page Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAGE_WIDTH = 48;

	/**
	 * The feature id for the '<em><b>Space After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPACE_AFTER = 49;

	/**
	 * The feature id for the '<em><b>Space Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPACE_BEFORE = 50;

	/**
	 * The feature id for the '<em><b>Start Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START_INDENT = 51;

	/**
	 * The feature id for the '<em><b>Text Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_ALIGN = 52;

	/**
	 * The feature id for the '<em><b>Text Align Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_ALIGN_LAST = 53;

	/**
	 * The feature id for the '<em><b>Text Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_INDENT = 54;

	/**
	 * The feature id for the '<em><b>Text Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_SHADOW = 55;

	/**
	 * The feature id for the '<em><b>Text Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_TRANSFORM = 56;

	/**
	 * The feature id for the '<em><b>Widows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WIDOWS = 57;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WIDTH = 58;

	/**
	 * The feature id for the '<em><b>Wrap Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WRAP_OPTION = 59;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 60;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1 <em>Background Color Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBackgroundColorTypeMember1()
	 * @generated
	 */
	int BACKGROUND_COLOR_TYPE_MEMBER1 = 1;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType <em>Break After Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBreakAfterType()
	 * @generated
	 */
	int BREAK_AFTER_TYPE = 2;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType <em>Break Before Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBreakBeforeType()
	 * @generated
	 */
	int BREAK_BEFORE_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType <em>Hyphenation Keep Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getHyphenationKeepType()
	 * @generated
	 */
	int HYPHENATION_KEEP_TYPE = 4;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1 <em>Hyphenation Ladder Count Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getHyphenationLadderCountTypeMember1()
	 * @generated
	 */
	int HYPHENATION_LADDER_COUNT_TYPE_MEMBER1 = 5;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType <em>Keep Together Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getKeepTogetherType()
	 * @generated
	 */
	int KEEP_TOGETHER_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType <em>Keep With Next Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getKeepWithNextType()
	 * @generated
	 */
	int KEEP_WITH_NEXT_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1 <em>Letter Spacing Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getLetterSpacingTypeMember1()
	 * @generated
	 */
	int LETTER_SPACING_TYPE_MEMBER1 = 8;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2 <em>Line Height Type Member2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getLineHeightTypeMember2()
	 * @generated
	 */
	int LINE_HEIGHT_TYPE_MEMBER2 = 9;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType <em>Text Align Last Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextAlignLastType()
	 * @generated
	 */
	int TEXT_ALIGN_LAST_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType <em>Text Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextAlignType()
	 * @generated
	 */
	int TEXT_ALIGN_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType <em>Text Transform Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextTransformType()
	 * @generated
	 */
	int TEXT_TRANSFORM_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType <em>Wrap Option Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getWrapOptionType()
	 * @generated
	 */
	int WRAP_OPTION_TYPE = 13;

	/**
	 * The meta object id for the '<em>Background Color Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBackgroundColorType()
	 * @generated
	 */
	int BACKGROUND_COLOR_TYPE = 14;

	/**
	 * The meta object id for the '<em>Background Color Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBackgroundColorTypeMember1Object()
	 * @generated
	 */
	int BACKGROUND_COLOR_TYPE_MEMBER1_OBJECT = 15;

	/**
	 * The meta object id for the '<em>Break After Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBreakAfterTypeObject()
	 * @generated
	 */
	int BREAK_AFTER_TYPE_OBJECT = 16;

	/**
	 * The meta object id for the '<em>Break Before Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBreakBeforeTypeObject()
	 * @generated
	 */
	int BREAK_BEFORE_TYPE_OBJECT = 17;

	/**
	 * The meta object id for the '<em>Font Size Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getFontSizeType()
	 * @generated
	 */
	int FONT_SIZE_TYPE = 18;

	/**
	 * The meta object id for the '<em>Hyphenation Keep Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getHyphenationKeepTypeObject()
	 * @generated
	 */
	int HYPHENATION_KEEP_TYPE_OBJECT = 19;

	/**
	 * The meta object id for the '<em>Hyphenation Ladder Count Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getHyphenationLadderCountType()
	 * @generated
	 */
	int HYPHENATION_LADDER_COUNT_TYPE = 20;

	/**
	 * The meta object id for the '<em>Hyphenation Ladder Count Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getHyphenationLadderCountTypeMember1Object()
	 * @generated
	 */
	int HYPHENATION_LADDER_COUNT_TYPE_MEMBER1_OBJECT = 21;

	/**
	 * The meta object id for the '<em>Keep Together Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getKeepTogetherTypeObject()
	 * @generated
	 */
	int KEEP_TOGETHER_TYPE_OBJECT = 22;

	/**
	 * The meta object id for the '<em>Keep With Next Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getKeepWithNextTypeObject()
	 * @generated
	 */
	int KEEP_WITH_NEXT_TYPE_OBJECT = 23;

	/**
	 * The meta object id for the '<em>Letter Spacing Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getLetterSpacingType()
	 * @generated
	 */
	int LETTER_SPACING_TYPE = 24;

	/**
	 * The meta object id for the '<em>Letter Spacing Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getLetterSpacingTypeMember1Object()
	 * @generated
	 */
	int LETTER_SPACING_TYPE_MEMBER1_OBJECT = 25;

	/**
	 * The meta object id for the '<em>Line Height Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getLineHeightType()
	 * @generated
	 */
	int LINE_HEIGHT_TYPE = 26;

	/**
	 * The meta object id for the '<em>Line Height Type Member2 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getLineHeightTypeMember2Object()
	 * @generated
	 */
	int LINE_HEIGHT_TYPE_MEMBER2_OBJECT = 27;

	/**
	 * The meta object id for the '<em>Margin Bottom Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMarginBottomType()
	 * @generated
	 */
	int MARGIN_BOTTOM_TYPE = 28;

	/**
	 * The meta object id for the '<em>Margin Left Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMarginLeftType()
	 * @generated
	 */
	int MARGIN_LEFT_TYPE = 29;

	/**
	 * The meta object id for the '<em>Margin Right Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMarginRightType()
	 * @generated
	 */
	int MARGIN_RIGHT_TYPE = 30;

	/**
	 * The meta object id for the '<em>Margin Top Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMarginTopType()
	 * @generated
	 */
	int MARGIN_TOP_TYPE = 31;

	/**
	 * The meta object id for the '<em>Margin Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMarginType()
	 * @generated
	 */
	int MARGIN_TYPE = 32;

	/**
	 * The meta object id for the '<em>Max Height Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMaxHeightType()
	 * @generated
	 */
	int MAX_HEIGHT_TYPE = 33;

	/**
	 * The meta object id for the '<em>Max Width Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMaxWidthType()
	 * @generated
	 */
	int MAX_WIDTH_TYPE = 34;

	/**
	 * The meta object id for the '<em>Min Height Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMinHeightType()
	 * @generated
	 */
	int MIN_HEIGHT_TYPE = 35;

	/**
	 * The meta object id for the '<em>Min Width Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMinWidthType()
	 * @generated
	 */
	int MIN_WIDTH_TYPE = 36;

	/**
	 * The meta object id for the '<em>Text Align Last Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextAlignLastTypeObject()
	 * @generated
	 */
	int TEXT_ALIGN_LAST_TYPE_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Text Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextAlignTypeObject()
	 * @generated
	 */
	int TEXT_ALIGN_TYPE_OBJECT = 38;

	/**
	 * The meta object id for the '<em>Text Indent Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextIndentType()
	 * @generated
	 */
	int TEXT_INDENT_TYPE = 39;

	/**
	 * The meta object id for the '<em>Text Transform Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextTransformTypeObject()
	 * @generated
	 */
	int TEXT_TRANSFORM_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Wrap Option Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getWrapOptionTypeObject()
	 * @generated
	 */
	int WRAP_OPTION_TYPE_OBJECT = 41;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBackgroundColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Border();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderBottom <em>Border Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Bottom</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderBottom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BorderBottom();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderLeft <em>Border Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Left</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderLeft()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BorderLeft();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderRight <em>Border Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Right</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderRight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BorderRight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderTop <em>Border Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Top</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderTop()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BorderTop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBreakAfter <em>Break After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Break After</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBreakAfter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BreakAfter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBreakBefore <em>Break Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Break Before</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBreakBefore()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BreakBefore();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getClip <em>Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getClip()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Clip();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getColumnCount <em>Column Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getColumnCount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ColumnCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getColumnGap <em>Column Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Gap</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getColumnGap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ColumnGap();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getCountry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getEndIndent <em>End Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Indent</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getEndIndent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EndIndent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontFamily()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontSize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontVariant <em>Font Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Variant</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontVariant()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontVariant();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontWeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FontWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenate <em>Hyphenate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyphenate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Hyphenate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationKeep <em>Hyphenation Keep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyphenation Keep</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationKeep()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HyphenationKeep();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationLadderCount <em>Hyphenation Ladder Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyphenation Ladder Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationLadderCount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HyphenationLadderCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationPushCharCount <em>Hyphenation Push Char Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyphenation Push Char Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationPushCharCount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HyphenationPushCharCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationRemainCharCount <em>Hyphenation Remain Char Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyphenation Remain Char Count</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationRemainCharCount()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HyphenationRemainCharCount();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getKeepTogether <em>Keep Together</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keep Together</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getKeepTogether()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_KeepTogether();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getKeepWithNext <em>Keep With Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keep With Next</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getKeepWithNext()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_KeepWithNext();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getLanguage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getLetterSpacing <em>Letter Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Letter Spacing</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getLetterSpacing()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LetterSpacing();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getLineHeight <em>Line Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getLineHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LineHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMargin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Margin();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginBottom <em>Margin Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Bottom</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginBottom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MarginBottom();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginLeft <em>Margin Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Left</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginLeft()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MarginLeft();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginRight <em>Margin Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Right</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginRight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MarginRight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginTop <em>Margin Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Top</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginTop()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MarginTop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMaxHeight <em>Max Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMaxHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMaxWidth <em>Max Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMaxWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMinWidth <em>Min Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMinWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getOrphans <em>Orphans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orphans</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getOrphans()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Orphans();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPadding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Padding();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingBottom <em>Padding Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding Bottom</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingBottom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PaddingBottom();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingLeft <em>Padding Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding Left</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingLeft()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PaddingLeft();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingRight <em>Padding Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding Right</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingRight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PaddingRight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingTop <em>Padding Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding Top</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingTop()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PaddingTop();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPageHeight <em>Page Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Height</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPageHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PageHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPageWidth <em>Page Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPageWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PageWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getSpaceAfter <em>Space After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space After</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getSpaceAfter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SpaceAfter();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getSpaceBefore <em>Space Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space Before</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getSpaceBefore()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SpaceBefore();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getStartIndent <em>Start Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Indent</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getStartIndent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StartIndent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextAlign <em>Text Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Align</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextAlign()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextAlignLast <em>Text Align Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Align Last</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextAlignLast()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextAlignLast();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextIndent <em>Text Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Indent</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextIndent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextIndent();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextShadow <em>Text Shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Shadow</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextShadow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextShadow();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextTransform <em>Text Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Transform</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextTransform()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextTransform();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWidows <em>Widows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Widows</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWidows()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Widows();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWrapOption <em>Wrap Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap Option</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWrapOption()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_WrapOption();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1 <em>Background Color Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Background Color Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1
	 * @generated
	 */
	EEnum getBackgroundColorTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType <em>Break After Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Break After Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType
	 * @generated
	 */
	EEnum getBreakAfterType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType <em>Break Before Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Break Before Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType
	 * @generated
	 */
	EEnum getBreakBeforeType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType <em>Hyphenation Keep Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hyphenation Keep Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType
	 * @generated
	 */
	EEnum getHyphenationKeepType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1 <em>Hyphenation Ladder Count Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hyphenation Ladder Count Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1
	 * @generated
	 */
	EEnum getHyphenationLadderCountTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType <em>Keep Together Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Keep Together Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType
	 * @generated
	 */
	EEnum getKeepTogetherType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType <em>Keep With Next Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Keep With Next Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType
	 * @generated
	 */
	EEnum getKeepWithNextType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1 <em>Letter Spacing Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Letter Spacing Type Member1</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1
	 * @generated
	 */
	EEnum getLetterSpacingTypeMember1();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2 <em>Line Height Type Member2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Height Type Member2</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2
	 * @generated
	 */
	EEnum getLineHeightTypeMember2();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType <em>Text Align Last Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Align Last Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType
	 * @generated
	 */
	EEnum getTextAlignLastType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType <em>Text Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Align Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType
	 * @generated
	 */
	EEnum getTextAlignType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType <em>Text Transform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Transform Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType
	 * @generated
	 */
	EEnum getTextTransformType();

	/**
	 * Returns the meta object for enum '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType <em>Wrap Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wrap Option Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType
	 * @generated
	 */
	EEnum getWrapOptionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Background Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Background Color Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='background-color_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#color background-color_._type_._member_._1'"
	 * @generated
	 */
	EDataType getBackgroundColorType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1 <em>Background Color Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Background Color Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1"
	 *        extendedMetaData="name='background-color_._type_._member_._1:Object' baseType='background-color_._type_._member_._1'"
	 * @generated
	 */
	EDataType getBackgroundColorTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType <em>Break After Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Break After Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType"
	 *        extendedMetaData="name='break-after_._type:Object' baseType='break-after_._type'"
	 * @generated
	 */
	EDataType getBreakAfterTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType <em>Break Before Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Break Before Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType"
	 *        extendedMetaData="name='break-before_._type:Object' baseType='break-before_._type'"
	 * @generated
	 */
	EDataType getBreakBeforeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Font Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Size Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='font-size_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#positiveLength urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getFontSizeType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType <em>Hyphenation Keep Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hyphenation Keep Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType"
	 *        extendedMetaData="name='hyphenation-keep_._type:Object' baseType='hyphenation-keep_._type'"
	 * @generated
	 */
	EDataType getHyphenationKeepTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Hyphenation Ladder Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hyphenation Ladder Count Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='hyphenation-ladder-count_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#positiveInteger hyphenation-ladder-count_._type_._member_._1'"
	 * @generated
	 */
	EDataType getHyphenationLadderCountType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1 <em>Hyphenation Ladder Count Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hyphenation Ladder Count Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1"
	 *        extendedMetaData="name='hyphenation-ladder-count_._type_._member_._1:Object' baseType='hyphenation-ladder-count_._type_._member_._1'"
	 * @generated
	 */
	EDataType getHyphenationLadderCountTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType <em>Keep Together Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Keep Together Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType"
	 *        extendedMetaData="name='keep-together_._type:Object' baseType='keep-together_._type'"
	 * @generated
	 */
	EDataType getKeepTogetherTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType <em>Keep With Next Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Keep With Next Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType"
	 *        extendedMetaData="name='keep-with-next_._type:Object' baseType='keep-with-next_._type'"
	 * @generated
	 */
	EDataType getKeepWithNextTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Letter Spacing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Letter Spacing Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='letter-spacing_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length letter-spacing_._type_._member_._1'"
	 * @generated
	 */
	EDataType getLetterSpacingType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1 <em>Letter Spacing Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Letter Spacing Type Member1 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1"
	 *        extendedMetaData="name='letter-spacing_._type_._member_._1:Object' baseType='letter-spacing_._type_._member_._1'"
	 * @generated
	 */
	EDataType getLetterSpacingTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Line Height Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Line Height Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='line-height_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#nonNegativeLength urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent line-height_._type_._member_._2'"
	 * @generated
	 */
	EDataType getLineHeightType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2 <em>Line Height Type Member2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Line Height Type Member2 Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2"
	 *        extendedMetaData="name='line-height_._type_._member_._2:Object' baseType='line-height_._type_._member_._2'"
	 * @generated
	 */
	EDataType getLineHeightTypeMember2Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Margin Bottom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Margin Bottom Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='margin-bottom_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#nonNegativeLength urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getMarginBottomType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Margin Left Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Margin Left Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='margin-left_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getMarginLeftType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Margin Right Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Margin Right Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='margin-right_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getMarginRightType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Margin Top Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Margin Top Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='margin-top_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#nonNegativeLength urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getMarginTopType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Margin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Margin Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='margin_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#nonNegativeLength urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getMarginType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Max Height Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Height Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='max-height_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getMaxHeightType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Max Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Width Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='max-width_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getMaxWidthType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Min Height Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Min Height Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='min-height_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getMinHeightType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Min Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Min Width Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='min-width_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getMinWidthType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType <em>Text Align Last Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Align Last Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType"
	 *        extendedMetaData="name='text-align-last_._type:Object' baseType='text-align-last_._type'"
	 * @generated
	 */
	EDataType getTextAlignLastTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType <em>Text Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Align Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType"
	 *        extendedMetaData="name='text-align_._type:Object' baseType='text-align_._type'"
	 * @generated
	 */
	EDataType getTextAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text Indent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Indent Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='text-indent_._type' memberTypes='urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent'"
	 * @generated
	 */
	EDataType getTextIndentType();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType <em>Text Transform Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text Transform Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType"
	 *        extendedMetaData="name='text-transform_._type:Object' baseType='text-transform_._type'"
	 * @generated
	 */
	EDataType getTextTransformTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType <em>Wrap Option Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Wrap Option Type Object</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType
	 * @model instanceClass="org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType"
	 *        extendedMetaData="name='wrap-option_._type:Object' baseType='wrap-option_._type'"
	 * @generated
	 */
	EDataType getWrapOptionTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FoFactory getFoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BACKGROUND_COLOR = eINSTANCE.getDocumentRoot_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BORDER = eINSTANCE.getDocumentRoot_Border();

		/**
		 * The meta object literal for the '<em><b>Border Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BORDER_BOTTOM = eINSTANCE.getDocumentRoot_BorderBottom();

		/**
		 * The meta object literal for the '<em><b>Border Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BORDER_LEFT = eINSTANCE.getDocumentRoot_BorderLeft();

		/**
		 * The meta object literal for the '<em><b>Border Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BORDER_RIGHT = eINSTANCE.getDocumentRoot_BorderRight();

		/**
		 * The meta object literal for the '<em><b>Border Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BORDER_TOP = eINSTANCE.getDocumentRoot_BorderTop();

		/**
		 * The meta object literal for the '<em><b>Break After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BREAK_AFTER = eINSTANCE.getDocumentRoot_BreakAfter();

		/**
		 * The meta object literal for the '<em><b>Break Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BREAK_BEFORE = eINSTANCE.getDocumentRoot_BreakBefore();

		/**
		 * The meta object literal for the '<em><b>Clip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CLIP = eINSTANCE.getDocumentRoot_Clip();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COLOR = eINSTANCE.getDocumentRoot_Color();

		/**
		 * The meta object literal for the '<em><b>Column Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COLUMN_COUNT = eINSTANCE.getDocumentRoot_ColumnCount();

		/**
		 * The meta object literal for the '<em><b>Column Gap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COLUMN_GAP = eINSTANCE.getDocumentRoot_ColumnGap();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COUNTRY = eINSTANCE.getDocumentRoot_Country();

		/**
		 * The meta object literal for the '<em><b>End Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__END_INDENT = eINSTANCE.getDocumentRoot_EndIndent();

		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FONT_FAMILY = eINSTANCE.getDocumentRoot_FontFamily();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FONT_SIZE = eINSTANCE.getDocumentRoot_FontSize();

		/**
		 * The meta object literal for the '<em><b>Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FONT_STYLE = eINSTANCE.getDocumentRoot_FontStyle();

		/**
		 * The meta object literal for the '<em><b>Font Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FONT_VARIANT = eINSTANCE.getDocumentRoot_FontVariant();

		/**
		 * The meta object literal for the '<em><b>Font Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FONT_WEIGHT = eINSTANCE.getDocumentRoot_FontWeight();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HEIGHT = eINSTANCE.getDocumentRoot_Height();

		/**
		 * The meta object literal for the '<em><b>Hyphenate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HYPHENATE = eINSTANCE.getDocumentRoot_Hyphenate();

		/**
		 * The meta object literal for the '<em><b>Hyphenation Keep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HYPHENATION_KEEP = eINSTANCE.getDocumentRoot_HyphenationKeep();

		/**
		 * The meta object literal for the '<em><b>Hyphenation Ladder Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HYPHENATION_LADDER_COUNT = eINSTANCE.getDocumentRoot_HyphenationLadderCount();

		/**
		 * The meta object literal for the '<em><b>Hyphenation Push Char Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HYPHENATION_PUSH_CHAR_COUNT = eINSTANCE.getDocumentRoot_HyphenationPushCharCount();

		/**
		 * The meta object literal for the '<em><b>Hyphenation Remain Char Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HYPHENATION_REMAIN_CHAR_COUNT = eINSTANCE.getDocumentRoot_HyphenationRemainCharCount();

		/**
		 * The meta object literal for the '<em><b>Keep Together</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__KEEP_TOGETHER = eINSTANCE.getDocumentRoot_KeepTogether();

		/**
		 * The meta object literal for the '<em><b>Keep With Next</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__KEEP_WITH_NEXT = eINSTANCE.getDocumentRoot_KeepWithNext();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LANGUAGE = eINSTANCE.getDocumentRoot_Language();

		/**
		 * The meta object literal for the '<em><b>Letter Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LETTER_SPACING = eINSTANCE.getDocumentRoot_LetterSpacing();

		/**
		 * The meta object literal for the '<em><b>Line Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LINE_HEIGHT = eINSTANCE.getDocumentRoot_LineHeight();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MARGIN = eINSTANCE.getDocumentRoot_Margin();

		/**
		 * The meta object literal for the '<em><b>Margin Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MARGIN_BOTTOM = eINSTANCE.getDocumentRoot_MarginBottom();

		/**
		 * The meta object literal for the '<em><b>Margin Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MARGIN_LEFT = eINSTANCE.getDocumentRoot_MarginLeft();

		/**
		 * The meta object literal for the '<em><b>Margin Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MARGIN_RIGHT = eINSTANCE.getDocumentRoot_MarginRight();

		/**
		 * The meta object literal for the '<em><b>Margin Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MARGIN_TOP = eINSTANCE.getDocumentRoot_MarginTop();

		/**
		 * The meta object literal for the '<em><b>Max Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MAX_HEIGHT = eINSTANCE.getDocumentRoot_MaxHeight();

		/**
		 * The meta object literal for the '<em><b>Max Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MAX_WIDTH = eINSTANCE.getDocumentRoot_MaxWidth();

		/**
		 * The meta object literal for the '<em><b>Min Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIN_WIDTH = eINSTANCE.getDocumentRoot_MinWidth();

		/**
		 * The meta object literal for the '<em><b>Orphans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORPHANS = eINSTANCE.getDocumentRoot_Orphans();

		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PADDING = eINSTANCE.getDocumentRoot_Padding();

		/**
		 * The meta object literal for the '<em><b>Padding Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PADDING_BOTTOM = eINSTANCE.getDocumentRoot_PaddingBottom();

		/**
		 * The meta object literal for the '<em><b>Padding Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PADDING_LEFT = eINSTANCE.getDocumentRoot_PaddingLeft();

		/**
		 * The meta object literal for the '<em><b>Padding Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PADDING_RIGHT = eINSTANCE.getDocumentRoot_PaddingRight();

		/**
		 * The meta object literal for the '<em><b>Padding Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PADDING_TOP = eINSTANCE.getDocumentRoot_PaddingTop();

		/**
		 * The meta object literal for the '<em><b>Page Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PAGE_HEIGHT = eINSTANCE.getDocumentRoot_PageHeight();

		/**
		 * The meta object literal for the '<em><b>Page Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PAGE_WIDTH = eINSTANCE.getDocumentRoot_PageWidth();

		/**
		 * The meta object literal for the '<em><b>Space After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SPACE_AFTER = eINSTANCE.getDocumentRoot_SpaceAfter();

		/**
		 * The meta object literal for the '<em><b>Space Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SPACE_BEFORE = eINSTANCE.getDocumentRoot_SpaceBefore();

		/**
		 * The meta object literal for the '<em><b>Start Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__START_INDENT = eINSTANCE.getDocumentRoot_StartIndent();

		/**
		 * The meta object literal for the '<em><b>Text Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXT_ALIGN = eINSTANCE.getDocumentRoot_TextAlign();

		/**
		 * The meta object literal for the '<em><b>Text Align Last</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXT_ALIGN_LAST = eINSTANCE.getDocumentRoot_TextAlignLast();

		/**
		 * The meta object literal for the '<em><b>Text Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXT_INDENT = eINSTANCE.getDocumentRoot_TextIndent();

		/**
		 * The meta object literal for the '<em><b>Text Shadow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXT_SHADOW = eINSTANCE.getDocumentRoot_TextShadow();

		/**
		 * The meta object literal for the '<em><b>Text Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TEXT_TRANSFORM = eINSTANCE.getDocumentRoot_TextTransform();

		/**
		 * The meta object literal for the '<em><b>Widows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__WIDOWS = eINSTANCE.getDocumentRoot_Widows();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__WIDTH = eINSTANCE.getDocumentRoot_Width();

		/**
		 * The meta object literal for the '<em><b>Wrap Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__WRAP_OPTION = eINSTANCE.getDocumentRoot_WrapOption();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1 <em>Background Color Type Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBackgroundColorTypeMember1()
		 * @generated
		 */
		EEnum BACKGROUND_COLOR_TYPE_MEMBER1 = eINSTANCE.getBackgroundColorTypeMember1();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType <em>Break After Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBreakAfterType()
		 * @generated
		 */
		EEnum BREAK_AFTER_TYPE = eINSTANCE.getBreakAfterType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType <em>Break Before Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBreakBeforeType()
		 * @generated
		 */
		EEnum BREAK_BEFORE_TYPE = eINSTANCE.getBreakBeforeType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType <em>Hyphenation Keep Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getHyphenationKeepType()
		 * @generated
		 */
		EEnum HYPHENATION_KEEP_TYPE = eINSTANCE.getHyphenationKeepType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1 <em>Hyphenation Ladder Count Type Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getHyphenationLadderCountTypeMember1()
		 * @generated
		 */
		EEnum HYPHENATION_LADDER_COUNT_TYPE_MEMBER1 = eINSTANCE.getHyphenationLadderCountTypeMember1();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType <em>Keep Together Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getKeepTogetherType()
		 * @generated
		 */
		EEnum KEEP_TOGETHER_TYPE = eINSTANCE.getKeepTogetherType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType <em>Keep With Next Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getKeepWithNextType()
		 * @generated
		 */
		EEnum KEEP_WITH_NEXT_TYPE = eINSTANCE.getKeepWithNextType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1 <em>Letter Spacing Type Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getLetterSpacingTypeMember1()
		 * @generated
		 */
		EEnum LETTER_SPACING_TYPE_MEMBER1 = eINSTANCE.getLetterSpacingTypeMember1();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2 <em>Line Height Type Member2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getLineHeightTypeMember2()
		 * @generated
		 */
		EEnum LINE_HEIGHT_TYPE_MEMBER2 = eINSTANCE.getLineHeightTypeMember2();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType <em>Text Align Last Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextAlignLastType()
		 * @generated
		 */
		EEnum TEXT_ALIGN_LAST_TYPE = eINSTANCE.getTextAlignLastType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType <em>Text Align Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextAlignType()
		 * @generated
		 */
		EEnum TEXT_ALIGN_TYPE = eINSTANCE.getTextAlignType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType <em>Text Transform Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextTransformType()
		 * @generated
		 */
		EEnum TEXT_TRANSFORM_TYPE = eINSTANCE.getTextTransformType();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType <em>Wrap Option Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getWrapOptionType()
		 * @generated
		 */
		EEnum WRAP_OPTION_TYPE = eINSTANCE.getWrapOptionType();

		/**
		 * The meta object literal for the '<em>Background Color Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBackgroundColorType()
		 * @generated
		 */
		EDataType BACKGROUND_COLOR_TYPE = eINSTANCE.getBackgroundColorType();

		/**
		 * The meta object literal for the '<em>Background Color Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBackgroundColorTypeMember1Object()
		 * @generated
		 */
		EDataType BACKGROUND_COLOR_TYPE_MEMBER1_OBJECT = eINSTANCE.getBackgroundColorTypeMember1Object();

		/**
		 * The meta object literal for the '<em>Break After Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBreakAfterTypeObject()
		 * @generated
		 */
		EDataType BREAK_AFTER_TYPE_OBJECT = eINSTANCE.getBreakAfterTypeObject();

		/**
		 * The meta object literal for the '<em>Break Before Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getBreakBeforeTypeObject()
		 * @generated
		 */
		EDataType BREAK_BEFORE_TYPE_OBJECT = eINSTANCE.getBreakBeforeTypeObject();

		/**
		 * The meta object literal for the '<em>Font Size Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getFontSizeType()
		 * @generated
		 */
		EDataType FONT_SIZE_TYPE = eINSTANCE.getFontSizeType();

		/**
		 * The meta object literal for the '<em>Hyphenation Keep Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getHyphenationKeepTypeObject()
		 * @generated
		 */
		EDataType HYPHENATION_KEEP_TYPE_OBJECT = eINSTANCE.getHyphenationKeepTypeObject();

		/**
		 * The meta object literal for the '<em>Hyphenation Ladder Count Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getHyphenationLadderCountType()
		 * @generated
		 */
		EDataType HYPHENATION_LADDER_COUNT_TYPE = eINSTANCE.getHyphenationLadderCountType();

		/**
		 * The meta object literal for the '<em>Hyphenation Ladder Count Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getHyphenationLadderCountTypeMember1Object()
		 * @generated
		 */
		EDataType HYPHENATION_LADDER_COUNT_TYPE_MEMBER1_OBJECT = eINSTANCE.getHyphenationLadderCountTypeMember1Object();

		/**
		 * The meta object literal for the '<em>Keep Together Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getKeepTogetherTypeObject()
		 * @generated
		 */
		EDataType KEEP_TOGETHER_TYPE_OBJECT = eINSTANCE.getKeepTogetherTypeObject();

		/**
		 * The meta object literal for the '<em>Keep With Next Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getKeepWithNextTypeObject()
		 * @generated
		 */
		EDataType KEEP_WITH_NEXT_TYPE_OBJECT = eINSTANCE.getKeepWithNextTypeObject();

		/**
		 * The meta object literal for the '<em>Letter Spacing Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getLetterSpacingType()
		 * @generated
		 */
		EDataType LETTER_SPACING_TYPE = eINSTANCE.getLetterSpacingType();

		/**
		 * The meta object literal for the '<em>Letter Spacing Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getLetterSpacingTypeMember1Object()
		 * @generated
		 */
		EDataType LETTER_SPACING_TYPE_MEMBER1_OBJECT = eINSTANCE.getLetterSpacingTypeMember1Object();

		/**
		 * The meta object literal for the '<em>Line Height Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getLineHeightType()
		 * @generated
		 */
		EDataType LINE_HEIGHT_TYPE = eINSTANCE.getLineHeightType();

		/**
		 * The meta object literal for the '<em>Line Height Type Member2 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getLineHeightTypeMember2Object()
		 * @generated
		 */
		EDataType LINE_HEIGHT_TYPE_MEMBER2_OBJECT = eINSTANCE.getLineHeightTypeMember2Object();

		/**
		 * The meta object literal for the '<em>Margin Bottom Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMarginBottomType()
		 * @generated
		 */
		EDataType MARGIN_BOTTOM_TYPE = eINSTANCE.getMarginBottomType();

		/**
		 * The meta object literal for the '<em>Margin Left Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMarginLeftType()
		 * @generated
		 */
		EDataType MARGIN_LEFT_TYPE = eINSTANCE.getMarginLeftType();

		/**
		 * The meta object literal for the '<em>Margin Right Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMarginRightType()
		 * @generated
		 */
		EDataType MARGIN_RIGHT_TYPE = eINSTANCE.getMarginRightType();

		/**
		 * The meta object literal for the '<em>Margin Top Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMarginTopType()
		 * @generated
		 */
		EDataType MARGIN_TOP_TYPE = eINSTANCE.getMarginTopType();

		/**
		 * The meta object literal for the '<em>Margin Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMarginType()
		 * @generated
		 */
		EDataType MARGIN_TYPE = eINSTANCE.getMarginType();

		/**
		 * The meta object literal for the '<em>Max Height Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMaxHeightType()
		 * @generated
		 */
		EDataType MAX_HEIGHT_TYPE = eINSTANCE.getMaxHeightType();

		/**
		 * The meta object literal for the '<em>Max Width Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMaxWidthType()
		 * @generated
		 */
		EDataType MAX_WIDTH_TYPE = eINSTANCE.getMaxWidthType();

		/**
		 * The meta object literal for the '<em>Min Height Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMinHeightType()
		 * @generated
		 */
		EDataType MIN_HEIGHT_TYPE = eINSTANCE.getMinHeightType();

		/**
		 * The meta object literal for the '<em>Min Width Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getMinWidthType()
		 * @generated
		 */
		EDataType MIN_WIDTH_TYPE = eINSTANCE.getMinWidthType();

		/**
		 * The meta object literal for the '<em>Text Align Last Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextAlignLastTypeObject()
		 * @generated
		 */
		EDataType TEXT_ALIGN_LAST_TYPE_OBJECT = eINSTANCE.getTextAlignLastTypeObject();

		/**
		 * The meta object literal for the '<em>Text Align Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextAlignTypeObject()
		 * @generated
		 */
		EDataType TEXT_ALIGN_TYPE_OBJECT = eINSTANCE.getTextAlignTypeObject();

		/**
		 * The meta object literal for the '<em>Text Indent Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextIndentType()
		 * @generated
		 */
		EDataType TEXT_INDENT_TYPE = eINSTANCE.getTextIndentType();

		/**
		 * The meta object literal for the '<em>Text Transform Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getTextTransformTypeObject()
		 * @generated
		 */
		EDataType TEXT_TRANSFORM_TYPE_OBJECT = eINSTANCE.getTextTransformTypeObject();

		/**
		 * The meta object literal for the '<em>Wrap Option Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType
		 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl#getWrapOptionTypeObject()
		 * @generated
		 */
		EDataType WRAP_OPTION_TYPE_OBJECT = eINSTANCE.getWrapOptionTypeObject();

	}

} //FoPackage
