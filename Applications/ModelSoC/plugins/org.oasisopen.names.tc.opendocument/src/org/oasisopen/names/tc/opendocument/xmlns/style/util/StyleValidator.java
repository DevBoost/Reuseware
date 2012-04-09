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
package org.oasisopen.names.tc.opendocument.xmlns.style.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.oasisopen.names.tc.opendocument.xmlns.style.AdjustmentType;
import org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType;
import org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember0;
import org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.CellProtectTypeMember2BaseItem;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.style.DirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FirstPageNumberTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FontReliefType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FooterLeftType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FooterStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType;
import org.oasisopen.names.tc.opendocument.xmlns.style.GlyphOrientationVerticalType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderLeftType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalPosType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HorizontalRelType;
import org.oasisopen.names.tc.opendocument.xmlns.style.LayoutGridModeType;
import org.oasisopen.names.tc.opendocument.xmlns.style.LeaderColorTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType;
import org.oasisopen.names.tc.opendocument.xmlns.style.LengthTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.LineBreakType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MapType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember2;
import org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember3BaseItemMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.MirrorTypeMember4BaseItemMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member1;
import org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member2;
import org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember0Member0Member3;
import org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.NumberWrappedParagraphsTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.OverflowBehaviorType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PageNumberTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PaperTrayNameTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember0;
import org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember2;
import org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember3;
import org.oasisopen.names.tc.opendocument.xmlns.style.PositionTypeMember4;
import org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PrintOrientationType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PrintPageOrderType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PrintTypeItem;
import org.oasisopen.names.tc.opendocument.xmlns.style.PunctuationWrapType;
import org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.RelHeightTypeMember2;
import org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.RelWidthTypeMember2;
import org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType;
import org.oasisopen.names.tc.opendocument.xmlns.style.RotationAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.style.RubyAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.style.RubyPositionType;
import org.oasisopen.names.tc.opendocument.xmlns.style.RunThroughType;
import org.oasisopen.names.tc.opendocument.xmlns.style.ScriptTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1;
import org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TabStopsType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TableCenteringType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextAlignSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextAutospaceType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextCombineType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember0;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextEmphasizeTypeMember1BaseItem;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextLineThroughColorTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member1;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextPositionTypeBaseItemMember1Member2;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextRotationScaleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TextUnderlineColorTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.style.TypeType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1;
import org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.style.VerticalPosType;
import org.oasisopen.names.tc.opendocument.xmlns.style.VerticalRelType;
import org.oasisopen.names.tc.opendocument.xmlns.style.WrapContourModeType;
import org.oasisopen.names.tc.opendocument.xmlns.style.WrapType;
import org.oasisopen.names.tc.opendocument.xmlns.style.WritingModeType;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage
 * @generated
 */
public class StyleValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StyleValidator INSTANCE = new StyleValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.oasisopen.names.tc.opendocument.xmlns.style";

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
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleValidator() {
		super();
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
	  return StylePackage.eINSTANCE;
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
			case StylePackage.BACKGROUND_IMAGE_TYPE:
				return validateBackgroundImageType((BackgroundImageType)value, diagnostics, context);
			case StylePackage.COLUMN_SEP_TYPE:
				return validateColumnSepType((ColumnSepType)value, diagnostics, context);
			case StylePackage.COLUMNS_TYPE:
				return validateColumnsType((ColumnsType)value, diagnostics, context);
			case StylePackage.COLUMN_TYPE:
				return validateColumnType((ColumnType)value, diagnostics, context);
			case StylePackage.DROP_CAP_TYPE:
				return validateDropCapType((DropCapType)value, diagnostics, context);
			case StylePackage.FONT_FACE_TYPE:
				return validateFontFaceType((FontFaceType)value, diagnostics, context);
			case StylePackage.FOOTER_LEFT_TYPE:
				return validateFooterLeftType((FooterLeftType)value, diagnostics, context);
			case StylePackage.FOOTER_STYLE_TYPE:
				return validateFooterStyleType((FooterStyleType)value, diagnostics, context);
			case StylePackage.FOOTER_TYPE:
				return validateFooterType((FooterType)value, diagnostics, context);
			case StylePackage.FOOTNOTE_SEP_TYPE:
				return validateFootnoteSepType((FootnoteSepType)value, diagnostics, context);
			case StylePackage.HANDOUT_MASTER_TYPE:
				return validateHandoutMasterType((HandoutMasterType)value, diagnostics, context);
			case StylePackage.HEADER_LEFT_TYPE:
				return validateHeaderLeftType((HeaderLeftType)value, diagnostics, context);
			case StylePackage.HEADER_STYLE_TYPE:
				return validateHeaderStyleType((HeaderStyleType)value, diagnostics, context);
			case StylePackage.HEADER_TYPE:
				return validateHeaderType((HeaderType)value, diagnostics, context);
			case StylePackage.MAP_TYPE:
				return validateMapType((MapType)value, diagnostics, context);
			case StylePackage.MASTER_PAGE_TYPE:
				return validateMasterPageType((MasterPageType)value, diagnostics, context);
			case StylePackage.PAGE_LAYOUT_TYPE:
				return validatePageLayoutType((PageLayoutType)value, diagnostics, context);
			case StylePackage.PRESENTATION_PAGE_LAYOUT_TYPE:
				return validatePresentationPageLayoutType((PresentationPageLayoutType)value, diagnostics, context);
			case StylePackage.STYLE_TYPE1:
				return validateStyleType1((StyleType1)value, diagnostics, context);
			case StylePackage.TAB_STOPS_TYPE:
				return validateTabStopsType((TabStopsType)value, diagnostics, context);
			case StylePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case StylePackage.TAB_STOP_TYPE:
				return validateTabStopType((TabStopType)value, diagnostics, context);
			case StylePackage.ADJUSTMENT_TYPE:
				return validateAdjustmentType((AdjustmentType)value, diagnostics, context);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER0:
				return validateCellProtectTypeMember0((CellProtectTypeMember0)value, diagnostics, context);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER1:
				return validateCellProtectTypeMember1((CellProtectTypeMember1)value, diagnostics, context);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER2_BASE_ITEM:
				return validateCellProtectTypeMember2BaseItem((CellProtectTypeMember2BaseItem)value, diagnostics, context);
			case StylePackage.DIRECTION_TYPE:
				return validateDirectionType((DirectionType)value, diagnostics, context);
			case StylePackage.FAMILY_TYPE:
				return validateFamilyType((FamilyType)value, diagnostics, context);
			case StylePackage.FIRST_PAGE_NUMBER_TYPE_MEMBER1:
				return validateFirstPageNumberTypeMember1((FirstPageNumberTypeMember1)value, diagnostics, context);
			case StylePackage.FONT_RELIEF_TYPE:
				return validateFontReliefType((FontReliefType)value, diagnostics, context);
			case StylePackage.GLYPH_ORIENTATION_VERTICAL_TYPE:
				return validateGlyphOrientationVerticalType((GlyphOrientationVerticalType)value, diagnostics, context);
			case StylePackage.HORIZONTAL_POS_TYPE:
				return validateHorizontalPosType((HorizontalPosType)value, diagnostics, context);
			case StylePackage.HORIZONTAL_REL_TYPE:
				return validateHorizontalRelType((HorizontalRelType)value, diagnostics, context);
			case StylePackage.LAYOUT_GRID_MODE_TYPE:
				return validateLayoutGridModeType((LayoutGridModeType)value, diagnostics, context);
			case StylePackage.LEADER_COLOR_TYPE_MEMBER1:
				return validateLeaderColorTypeMember1((LeaderColorTypeMember1)value, diagnostics, context);
			case StylePackage.LEGEND_EXPANSION_TYPE:
				return validateLegendExpansionType((LegendExpansionType)value, diagnostics, context);
			case StylePackage.LENGTH_TYPE_MEMBER1:
				return validateLengthTypeMember1((LengthTypeMember1)value, diagnostics, context);
			case StylePackage.LINE_BREAK_TYPE:
				return validateLineBreakType((LineBreakType)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER1:
				return validateMirrorTypeMember1((MirrorTypeMember1)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER2:
				return validateMirrorTypeMember2((MirrorTypeMember2)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER3_BASE_ITEM_MEMBER1:
				return validateMirrorTypeMember3BaseItemMember1((MirrorTypeMember3BaseItemMember1)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER4_BASE_ITEM_MEMBER1:
				return validateMirrorTypeMember4BaseItemMember1((MirrorTypeMember4BaseItemMember1)value, diagnostics, context);
			case StylePackage.NUMBER_WRAPPED_PARAGRAPHS_TYPE_MEMBER1:
				return validateNumberWrappedParagraphsTypeMember1((NumberWrappedParagraphsTypeMember1)value, diagnostics, context);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER1:
				return validateNumFormatTypeMember0Member0Member1((NumFormatTypeMember0Member0Member1)value, diagnostics, context);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER2:
				return validateNumFormatTypeMember0Member0Member2((NumFormatTypeMember0Member0Member2)value, diagnostics, context);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER3:
				return validateNumFormatTypeMember0Member0Member3((NumFormatTypeMember0Member0Member3)value, diagnostics, context);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER1:
				return validateNumFormatTypeMember1((NumFormatTypeMember1)value, diagnostics, context);
			case StylePackage.OVERFLOW_BEHAVIOR_TYPE:
				return validateOverflowBehaviorType((OverflowBehaviorType)value, diagnostics, context);
			case StylePackage.PAGE_NUMBER_TYPE_MEMBER1:
				return validatePageNumberTypeMember1((PageNumberTypeMember1)value, diagnostics, context);
			case StylePackage.PAGE_USAGE_TYPE:
				return validatePageUsageType((PageUsageType)value, diagnostics, context);
			case StylePackage.PAPER_TRAY_NAME_TYPE_MEMBER1:
				return validatePaperTrayNameTypeMember1((PaperTrayNameTypeMember1)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER0:
				return validatePositionTypeMember0((PositionTypeMember0)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER1:
				return validatePositionTypeMember1((PositionTypeMember1)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER2:
				return validatePositionTypeMember2((PositionTypeMember2)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER3:
				return validatePositionTypeMember3((PositionTypeMember3)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER4:
				return validatePositionTypeMember4((PositionTypeMember4)value, diagnostics, context);
			case StylePackage.PRINT_ORIENTATION_TYPE:
				return validatePrintOrientationType((PrintOrientationType)value, diagnostics, context);
			case StylePackage.PRINT_PAGE_ORDER_TYPE:
				return validatePrintPageOrderType((PrintPageOrderType)value, diagnostics, context);
			case StylePackage.PRINT_TYPE_ITEM:
				return validatePrintTypeItem((PrintTypeItem)value, diagnostics, context);
			case StylePackage.PUNCTUATION_WRAP_TYPE:
				return validatePunctuationWrapType((PunctuationWrapType)value, diagnostics, context);
			case StylePackage.REL_HEIGHT_TYPE_MEMBER1:
				return validateRelHeightTypeMember1((RelHeightTypeMember1)value, diagnostics, context);
			case StylePackage.REL_HEIGHT_TYPE_MEMBER2:
				return validateRelHeightTypeMember2((RelHeightTypeMember2)value, diagnostics, context);
			case StylePackage.REL_WIDTH_TYPE_MEMBER1:
				return validateRelWidthTypeMember1((RelWidthTypeMember1)value, diagnostics, context);
			case StylePackage.REL_WIDTH_TYPE_MEMBER2:
				return validateRelWidthTypeMember2((RelWidthTypeMember2)value, diagnostics, context);
			case StylePackage.REPEAT_TYPE:
				return validateRepeatType((RepeatType)value, diagnostics, context);
			case StylePackage.ROTATION_ALIGN_TYPE:
				return validateRotationAlignType((RotationAlignType)value, diagnostics, context);
			case StylePackage.RUBY_ALIGN_TYPE:
				return validateRubyAlignType((RubyAlignType)value, diagnostics, context);
			case StylePackage.RUBY_POSITION_TYPE:
				return validateRubyPositionType((RubyPositionType)value, diagnostics, context);
			case StylePackage.RUN_THROUGH_TYPE:
				return validateRunThroughType((RunThroughType)value, diagnostics, context);
			case StylePackage.SCRIPT_TYPE_TYPE:
				return validateScriptTypeType((ScriptTypeType)value, diagnostics, context);
			case StylePackage.STYLE_TYPE:
				return validateStyleType((StyleType)value, diagnostics, context);
			case StylePackage.TEXT_AUTOSPACE_TYPE:
				return validateTextAutospaceType((TextAutospaceType)value, diagnostics, context);
			case StylePackage.TEXT_COMBINE_TYPE:
				return validateTextCombineType((TextCombineType)value, diagnostics, context);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER0:
				return validateTextEmphasizeTypeMember0((TextEmphasizeTypeMember0)value, diagnostics, context);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER1_BASE_ITEM:
				return validateTextEmphasizeTypeMember1BaseItem((TextEmphasizeTypeMember1BaseItem)value, diagnostics, context);
			case StylePackage.TEXT_LINE_THROUGH_COLOR_TYPE_MEMBER1:
				return validateTextLineThroughColorTypeMember1((TextLineThroughColorTypeMember1)value, diagnostics, context);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER1:
				return validateTextPositionTypeBaseItemMember1Member1((TextPositionTypeBaseItemMember1Member1)value, diagnostics, context);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER2:
				return validateTextPositionTypeBaseItemMember1Member2((TextPositionTypeBaseItemMember1Member2)value, diagnostics, context);
			case StylePackage.TEXT_ROTATION_SCALE_TYPE:
				return validateTextRotationScaleType((TextRotationScaleType)value, diagnostics, context);
			case StylePackage.TEXT_UNDERLINE_COLOR_TYPE_MEMBER1:
				return validateTextUnderlineColorTypeMember1((TextUnderlineColorTypeMember1)value, diagnostics, context);
			case StylePackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case StylePackage.TABLE_CENTERING_TYPE:
				return validateTableCenteringType((TableCenteringType)value, diagnostics, context);
			case StylePackage.TEXT_ALIGN_SOURCE_TYPE:
				return validateTextAlignSourceType((TextAlignSourceType)value, diagnostics, context);
			case StylePackage.TYPE_TYPE1:
				return validateTypeType1((TypeType1)value, diagnostics, context);
			case StylePackage.VERTICAL_ALIGN_TYPE:
				return validateVerticalAlignType((VerticalAlignType)value, diagnostics, context);
			case StylePackage.VERTICAL_POS_TYPE:
				return validateVerticalPosType((VerticalPosType)value, diagnostics, context);
			case StylePackage.VERTICAL_REL_TYPE:
				return validateVerticalRelType((VerticalRelType)value, diagnostics, context);
			case StylePackage.WRAP_CONTOUR_MODE_TYPE:
				return validateWrapContourModeType((WrapContourModeType)value, diagnostics, context);
			case StylePackage.WRAP_TYPE:
				return validateWrapType((WrapType)value, diagnostics, context);
			case StylePackage.WRITING_MODE_TYPE:
				return validateWritingModeType((WritingModeType)value, diagnostics, context);
			case StylePackage.ADJUSTMENT_TYPE_OBJECT:
				return validateAdjustmentTypeObject((AdjustmentType)value, diagnostics, context);
			case StylePackage.APPLY_STYLE_NAME_TYPE:
				return validateApplyStyleNameType((String)value, diagnostics, context);
			case StylePackage.APPLY_STYLE_NAME_TYPE_MEMBER1:
				return validateApplyStyleNameTypeMember1((String)value, diagnostics, context);
			case StylePackage.CELL_PROTECT_TYPE:
				return validateCellProtectType(value, diagnostics, context);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER0_OBJECT:
				return validateCellProtectTypeMember0Object((CellProtectTypeMember0)value, diagnostics, context);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER1_OBJECT:
				return validateCellProtectTypeMember1Object((CellProtectTypeMember1)value, diagnostics, context);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER2:
				return validateCellProtectTypeMember2((List)value, diagnostics, context);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER2_BASE:
				return validateCellProtectTypeMember2Base((List<?>)value, diagnostics, context);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER2_BASE_ITEM_OBJECT:
				return validateCellProtectTypeMember2BaseItemObject((CellProtectTypeMember2BaseItem)value, diagnostics, context);
			case StylePackage.DATA_STYLE_NAME_TYPE:
				return validateDataStyleNameType((String)value, diagnostics, context);
			case StylePackage.DATA_STYLE_NAME_TYPE_MEMBER1:
				return validateDataStyleNameTypeMember1((String)value, diagnostics, context);
			case StylePackage.DIRECTION_TYPE_OBJECT:
				return validateDirectionTypeObject((DirectionType)value, diagnostics, context);
			case StylePackage.FAMILY_TYPE_OBJECT:
				return validateFamilyTypeObject((FamilyType)value, diagnostics, context);
			case StylePackage.FIRST_PAGE_NUMBER_TYPE:
				return validateFirstPageNumberType(value, diagnostics, context);
			case StylePackage.FIRST_PAGE_NUMBER_TYPE_MEMBER1_OBJECT:
				return validateFirstPageNumberTypeMember1Object((FirstPageNumberTypeMember1)value, diagnostics, context);
			case StylePackage.FONT_RELIEF_TYPE_OBJECT:
				return validateFontReliefTypeObject((FontReliefType)value, diagnostics, context);
			case StylePackage.FONT_SIZE_ASIAN_TYPE:
				return validateFontSizeAsianType((String)value, diagnostics, context);
			case StylePackage.FONT_SIZE_COMPLEX_TYPE:
				return validateFontSizeComplexType((String)value, diagnostics, context);
			case StylePackage.GLYPH_ORIENTATION_VERTICAL_TYPE_OBJECT:
				return validateGlyphOrientationVerticalTypeObject((GlyphOrientationVerticalType)value, diagnostics, context);
			case StylePackage.HORIZONTAL_POS_TYPE_OBJECT:
				return validateHorizontalPosTypeObject((HorizontalPosType)value, diagnostics, context);
			case StylePackage.HORIZONTAL_REL_TYPE_OBJECT:
				return validateHorizontalRelTypeObject((HorizontalRelType)value, diagnostics, context);
			case StylePackage.LAYOUT_GRID_MODE_TYPE_OBJECT:
				return validateLayoutGridModeTypeObject((LayoutGridModeType)value, diagnostics, context);
			case StylePackage.LEADER_COLOR_TYPE:
				return validateLeaderColorType(value, diagnostics, context);
			case StylePackage.LEADER_COLOR_TYPE_MEMBER1_OBJECT:
				return validateLeaderColorTypeMember1Object((LeaderColorTypeMember1)value, diagnostics, context);
			case StylePackage.LEADER_TEXT_STYLE_TYPE:
				return validateLeaderTextStyleType((String)value, diagnostics, context);
			case StylePackage.LEADER_TEXT_STYLE_TYPE_MEMBER1:
				return validateLeaderTextStyleTypeMember1((String)value, diagnostics, context);
			case StylePackage.LEGEND_EXPANSION_TYPE_OBJECT:
				return validateLegendExpansionTypeObject((LegendExpansionType)value, diagnostics, context);
			case StylePackage.LENGTH_TYPE:
				return validateLengthType(value, diagnostics, context);
			case StylePackage.LENGTH_TYPE_MEMBER1_OBJECT:
				return validateLengthTypeMember1Object((LengthTypeMember1)value, diagnostics, context);
			case StylePackage.LINE_BREAK_TYPE_OBJECT:
				return validateLineBreakTypeObject((LineBreakType)value, diagnostics, context);
			case StylePackage.LIST_STYLE_NAME_TYPE:
				return validateListStyleNameType((String)value, diagnostics, context);
			case StylePackage.LIST_STYLE_NAME_TYPE_MEMBER1:
				return validateListStyleNameTypeMember1((String)value, diagnostics, context);
			case StylePackage.MASTER_PAGE_NAME_TYPE:
				return validateMasterPageNameType((String)value, diagnostics, context);
			case StylePackage.MASTER_PAGE_NAME_TYPE_MEMBER1:
				return validateMasterPageNameTypeMember1((String)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE:
				return validateMirrorType(value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER1_OBJECT:
				return validateMirrorTypeMember1Object((MirrorTypeMember1)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER2_OBJECT:
				return validateMirrorTypeMember2Object((MirrorTypeMember2)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER3:
				return validateMirrorTypeMember3((List)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER3_BASE:
				return validateMirrorTypeMember3Base((List<?>)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER3_BASE_ITEM:
				return validateMirrorTypeMember3BaseItem((Enumerator)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER3_BASE_ITEM_MEMBER1_OBJECT:
				return validateMirrorTypeMember3BaseItemMember1Object((MirrorTypeMember3BaseItemMember1)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER4:
				return validateMirrorTypeMember4((List)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER4_BASE:
				return validateMirrorTypeMember4Base((List<?>)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER4_BASE_ITEM:
				return validateMirrorTypeMember4BaseItem((Enumerator)value, diagnostics, context);
			case StylePackage.MIRROR_TYPE_MEMBER4_BASE_ITEM_MEMBER1_OBJECT:
				return validateMirrorTypeMember4BaseItemMember1Object((MirrorTypeMember4BaseItemMember1)value, diagnostics, context);
			case StylePackage.NEXT_STYLE_NAME_TYPE:
				return validateNextStyleNameType((String)value, diagnostics, context);
			case StylePackage.NEXT_STYLE_NAME_TYPE_MEMBER1:
				return validateNextStyleNameTypeMember1((String)value, diagnostics, context);
			case StylePackage.NUMBER_WRAPPED_PARAGRAPHS_TYPE:
				return validateNumberWrappedParagraphsType(value, diagnostics, context);
			case StylePackage.NUMBER_WRAPPED_PARAGRAPHS_TYPE_MEMBER1_OBJECT:
				return validateNumberWrappedParagraphsTypeMember1Object((NumberWrappedParagraphsTypeMember1)value, diagnostics, context);
			case StylePackage.NUM_FORMAT_TYPE:
				return validateNumFormatType(value, diagnostics, context);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0:
				return validateNumFormatTypeMember0(value, diagnostics, context);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0:
				return validateNumFormatTypeMember0Member0(value, diagnostics, context);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER1_OBJECT:
				return validateNumFormatTypeMember0Member0Member1Object((NumFormatTypeMember0Member0Member1)value, diagnostics, context);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER2_OBJECT:
				return validateNumFormatTypeMember0Member0Member2Object((NumFormatTypeMember0Member0Member2)value, diagnostics, context);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER3_OBJECT:
				return validateNumFormatTypeMember0Member0Member3Object((NumFormatTypeMember0Member0Member3)value, diagnostics, context);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER1:
				return validateNumFormatTypeMember0Member1((String)value, diagnostics, context);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER1_OBJECT:
				return validateNumFormatTypeMember1Object((NumFormatTypeMember1)value, diagnostics, context);
			case StylePackage.OVERFLOW_BEHAVIOR_TYPE_OBJECT:
				return validateOverflowBehaviorTypeObject((OverflowBehaviorType)value, diagnostics, context);
			case StylePackage.PAGE_LAYOUT_NAME_TYPE:
				return validatePageLayoutNameType((String)value, diagnostics, context);
			case StylePackage.PAGE_LAYOUT_NAME_TYPE_MEMBER1:
				return validatePageLayoutNameTypeMember1((String)value, diagnostics, context);
			case StylePackage.PAGE_NUMBER_TYPE:
				return validatePageNumberType(value, diagnostics, context);
			case StylePackage.PAGE_NUMBER_TYPE_MEMBER1_OBJECT:
				return validatePageNumberTypeMember1Object((PageNumberTypeMember1)value, diagnostics, context);
			case StylePackage.PAGE_USAGE_TYPE_OBJECT:
				return validatePageUsageTypeObject((PageUsageType)value, diagnostics, context);
			case StylePackage.PAPER_TRAY_NAME_TYPE:
				return validatePaperTrayNameType(value, diagnostics, context);
			case StylePackage.PAPER_TRAY_NAME_TYPE_MEMBER1_OBJECT:
				return validatePaperTrayNameTypeMember1Object((PaperTrayNameTypeMember1)value, diagnostics, context);
			case StylePackage.PARENT_STYLE_NAME_TYPE:
				return validateParentStyleNameType((String)value, diagnostics, context);
			case StylePackage.PARENT_STYLE_NAME_TYPE_MEMBER1:
				return validateParentStyleNameTypeMember1((String)value, diagnostics, context);
			case StylePackage.POSITION_TYPE:
				return validatePositionType(value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER0_OBJECT:
				return validatePositionTypeMember0Object((PositionTypeMember0)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER1_OBJECT:
				return validatePositionTypeMember1Object((PositionTypeMember1)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER2_OBJECT:
				return validatePositionTypeMember2Object((PositionTypeMember2)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER3_OBJECT:
				return validatePositionTypeMember3Object((PositionTypeMember3)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER4_OBJECT:
				return validatePositionTypeMember4Object((PositionTypeMember4)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER5:
				return validatePositionTypeMember5((List)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER5_BASE:
				return validatePositionTypeMember5Base((List<?>)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER5_BASE_ITEM:
				return validatePositionTypeMember5BaseItem((Enumerator)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER6:
				return validatePositionTypeMember6((List)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER6_BASE:
				return validatePositionTypeMember6Base((List<?>)value, diagnostics, context);
			case StylePackage.POSITION_TYPE_MEMBER6_BASE_ITEM:
				return validatePositionTypeMember6BaseItem((Enumerator)value, diagnostics, context);
			case StylePackage.PRINT_ORIENTATION_TYPE_OBJECT:
				return validatePrintOrientationTypeObject((PrintOrientationType)value, diagnostics, context);
			case StylePackage.PRINT_PAGE_ORDER_TYPE_OBJECT:
				return validatePrintPageOrderTypeObject((PrintPageOrderType)value, diagnostics, context);
			case StylePackage.PRINT_TYPE:
				return validatePrintType((List<?>)value, diagnostics, context);
			case StylePackage.PRINT_TYPE_ITEM_OBJECT:
				return validatePrintTypeItemObject((PrintTypeItem)value, diagnostics, context);
			case StylePackage.PUNCTUATION_WRAP_TYPE_OBJECT:
				return validatePunctuationWrapTypeObject((PunctuationWrapType)value, diagnostics, context);
			case StylePackage.REGISTER_TRUTH_REF_STYLE_NAME_TYPE:
				return validateRegisterTruthRefStyleNameType((String)value, diagnostics, context);
			case StylePackage.REGISTER_TRUTH_REF_STYLE_NAME_TYPE_MEMBER1:
				return validateRegisterTruthRefStyleNameTypeMember1((String)value, diagnostics, context);
			case StylePackage.REL_HEIGHT_TYPE:
				return validateRelHeightType(value, diagnostics, context);
			case StylePackage.REL_HEIGHT_TYPE_MEMBER1_OBJECT:
				return validateRelHeightTypeMember1Object((RelHeightTypeMember1)value, diagnostics, context);
			case StylePackage.REL_HEIGHT_TYPE_MEMBER2_OBJECT:
				return validateRelHeightTypeMember2Object((RelHeightTypeMember2)value, diagnostics, context);
			case StylePackage.REL_WIDTH_TYPE:
				return validateRelWidthType(value, diagnostics, context);
			case StylePackage.REL_WIDTH_TYPE_MEMBER1_OBJECT:
				return validateRelWidthTypeMember1Object((RelWidthTypeMember1)value, diagnostics, context);
			case StylePackage.REL_WIDTH_TYPE_MEMBER2_OBJECT:
				return validateRelWidthTypeMember2Object((RelWidthTypeMember2)value, diagnostics, context);
			case StylePackage.REPEAT_TYPE_OBJECT:
				return validateRepeatTypeObject((RepeatType)value, diagnostics, context);
			case StylePackage.ROTATION_ALIGN_TYPE_OBJECT:
				return validateRotationAlignTypeObject((RotationAlignType)value, diagnostics, context);
			case StylePackage.RUBY_ALIGN_TYPE_OBJECT:
				return validateRubyAlignTypeObject((RubyAlignType)value, diagnostics, context);
			case StylePackage.RUBY_POSITION_TYPE_OBJECT:
				return validateRubyPositionTypeObject((RubyPositionType)value, diagnostics, context);
			case StylePackage.RUN_THROUGH_TYPE_OBJECT:
				return validateRunThroughTypeObject((RunThroughType)value, diagnostics, context);
			case StylePackage.SCRIPT_TYPE_TYPE_OBJECT:
				return validateScriptTypeTypeObject((ScriptTypeType)value, diagnostics, context);
			case StylePackage.STYLE_NAME_TYPE:
				return validateStyleNameType((String)value, diagnostics, context);
			case StylePackage.STYLE_NAME_TYPE_MEMBER1:
				return validateStyleNameTypeMember1((String)value, diagnostics, context);
			case StylePackage.STYLE_TYPE_OBJECT:
				return validateStyleTypeObject((StyleType)value, diagnostics, context);
			case StylePackage.TEXT_AUTOSPACE_TYPE_OBJECT:
				return validateTextAutospaceTypeObject((TextAutospaceType)value, diagnostics, context);
			case StylePackage.TEXT_COMBINE_TYPE_OBJECT:
				return validateTextCombineTypeObject((TextCombineType)value, diagnostics, context);
			case StylePackage.TEXT_EMPHASIZE_TYPE:
				return validateTextEmphasizeType(value, diagnostics, context);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER0_OBJECT:
				return validateTextEmphasizeTypeMember0Object((TextEmphasizeTypeMember0)value, diagnostics, context);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER1:
				return validateTextEmphasizeTypeMember1((List)value, diagnostics, context);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER1_BASE:
				return validateTextEmphasizeTypeMember1Base((List<?>)value, diagnostics, context);
			case StylePackage.TEXT_LINE_THROUGH_COLOR_TYPE:
				return validateTextLineThroughColorType(value, diagnostics, context);
			case StylePackage.TEXT_LINE_THROUGH_COLOR_TYPE_MEMBER1_OBJECT:
				return validateTextLineThroughColorTypeMember1Object((TextLineThroughColorTypeMember1)value, diagnostics, context);
			case StylePackage.TEXT_LINE_THROUGH_TEXT_STYLE_TYPE:
				return validateTextLineThroughTextStyleType((String)value, diagnostics, context);
			case StylePackage.TEXT_LINE_THROUGH_TEXT_STYLE_TYPE_MEMBER1:
				return validateTextLineThroughTextStyleTypeMember1((String)value, diagnostics, context);
			case StylePackage.TEXT_POSITION_TYPE:
				return validateTextPositionType((List)value, diagnostics, context);
			case StylePackage.TEXT_POSITION_TYPE_BASE:
				return validateTextPositionTypeBase((List<?>)value, diagnostics, context);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM:
				return validateTextPositionTypeBaseItem(value, diagnostics, context);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1:
				return validateTextPositionTypeBaseItemMember1(value, diagnostics, context);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER1_OBJECT:
				return validateTextPositionTypeBaseItemMember1Member1Object((TextPositionTypeBaseItemMember1Member1)value, diagnostics, context);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER2_OBJECT:
				return validateTextPositionTypeBaseItemMember1Member2Object((TextPositionTypeBaseItemMember1Member2)value, diagnostics, context);
			case StylePackage.TEXT_ROTATION_SCALE_TYPE_OBJECT:
				return validateTextRotationScaleTypeObject((TextRotationScaleType)value, diagnostics, context);
			case StylePackage.TEXT_UNDERLINE_COLOR_TYPE_MEMBER1_OBJECT:
				return validateTextUnderlineColorTypeMember1Object((TextUnderlineColorTypeMember1)value, diagnostics, context);
			case StylePackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case StylePackage.TABLE_CENTERING_TYPE_OBJECT:
				return validateTableCenteringTypeObject((TableCenteringType)value, diagnostics, context);
			case StylePackage.TEXT_ALIGN_SOURCE_TYPE_OBJECT:
				return validateTextAlignSourceTypeObject((TextAlignSourceType)value, diagnostics, context);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER1_BASE_ITEM_OBJECT:
				return validateTextEmphasizeTypeMember1BaseItemObject((TextEmphasizeTypeMember1BaseItem)value, diagnostics, context);
			case StylePackage.TEXT_UNDERLINE_COLOR_TYPE:
				return validateTextUnderlineColorType(value, diagnostics, context);
			case StylePackage.TYPE_TYPE_OBJECT1:
				return validateTypeTypeObject1((TypeType1)value, diagnostics, context);
			case StylePackage.VERTICAL_ALIGN_TYPE_OBJECT:
				return validateVerticalAlignTypeObject((VerticalAlignType)value, diagnostics, context);
			case StylePackage.VERTICAL_POS_TYPE_OBJECT:
				return validateVerticalPosTypeObject((VerticalPosType)value, diagnostics, context);
			case StylePackage.VERTICAL_REL_TYPE_OBJECT:
				return validateVerticalRelTypeObject((VerticalRelType)value, diagnostics, context);
			case StylePackage.WRAP_CONTOUR_MODE_TYPE_OBJECT:
				return validateWrapContourModeTypeObject((WrapContourModeType)value, diagnostics, context);
			case StylePackage.WRAP_TYPE_OBJECT:
				return validateWrapTypeObject((WrapType)value, diagnostics, context);
			case StylePackage.WRITING_MODE_TYPE_OBJECT:
				return validateWritingModeTypeObject((WritingModeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundImageType(BackgroundImageType backgroundImageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backgroundImageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnSepType(ColumnSepType columnSepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnSepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnsType(ColumnsType columnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnType(ColumnType columnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropCapType(DropCapType dropCapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropCapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontFaceType(FontFaceType fontFaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fontFaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFooterLeftType(FooterLeftType footerLeftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(footerLeftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFooterStyleType(FooterStyleType footerStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(footerStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFooterType(FooterType footerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(footerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFootnoteSepType(FootnoteSepType footnoteSepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(footnoteSepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandoutMasterType(HandoutMasterType handoutMasterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(handoutMasterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeaderLeftType(HeaderLeftType headerLeftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headerLeftType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeaderStyleType(HeaderStyleType headerStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headerStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeaderType(HeaderType headerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapType(MapType mapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterPageType(MasterPageType masterPageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(masterPageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageLayoutType(PageLayoutType pageLayoutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageLayoutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationPageLayoutType(PresentationPageLayoutType presentationPageLayoutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(presentationPageLayoutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleType1(StyleType1 styleType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabStopsType(TabStopsType tabStopsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tabStopsType, diagnostics, context);
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
	public boolean validateTabStopType(TabStopType tabStopType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tabStopType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdjustmentType(AdjustmentType adjustmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellProtectTypeMember0(CellProtectTypeMember0 cellProtectTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellProtectTypeMember1(CellProtectTypeMember1 cellProtectTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellProtectTypeMember2BaseItem(CellProtectTypeMember2BaseItem cellProtectTypeMember2BaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateFamilyType(FamilyType familyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstPageNumberTypeMember1(FirstPageNumberTypeMember1 firstPageNumberTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontReliefType(FontReliefType fontReliefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlyphOrientationVerticalType(GlyphOrientationVerticalType glyphOrientationVerticalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalPosType(HorizontalPosType horizontalPosType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalRelType(HorizontalRelType horizontalRelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayoutGridModeType(LayoutGridModeType layoutGridModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeaderColorTypeMember1(LeaderColorTypeMember1 leaderColorTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegendExpansionType(LegendExpansionType legendExpansionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthTypeMember1(LengthTypeMember1 lengthTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineBreakType(LineBreakType lineBreakType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember1(MirrorTypeMember1 mirrorTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember2(MirrorTypeMember2 mirrorTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember3BaseItemMember1(MirrorTypeMember3BaseItemMember1 mirrorTypeMember3BaseItemMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember4BaseItemMember1(MirrorTypeMember4BaseItemMember1 mirrorTypeMember4BaseItemMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberWrappedParagraphsTypeMember1(NumberWrappedParagraphsTypeMember1 numberWrappedParagraphsTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0Member0Member1(NumFormatTypeMember0Member0Member1 numFormatTypeMember0Member0Member1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0Member0Member2(NumFormatTypeMember0Member0Member2 numFormatTypeMember0Member0Member2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0Member0Member3(NumFormatTypeMember0Member0Member3 numFormatTypeMember0Member0Member3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember1(NumFormatTypeMember1 numFormatTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverflowBehaviorType(OverflowBehaviorType overflowBehaviorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageNumberTypeMember1(PageNumberTypeMember1 pageNumberTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageUsageType(PageUsageType pageUsageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaperTrayNameTypeMember1(PaperTrayNameTypeMember1 paperTrayNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember0(PositionTypeMember0 positionTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember1(PositionTypeMember1 positionTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember2(PositionTypeMember2 positionTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember3(PositionTypeMember3 positionTypeMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember4(PositionTypeMember4 positionTypeMember4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrintOrientationType(PrintOrientationType printOrientationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrintPageOrderType(PrintPageOrderType printPageOrderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrintTypeItem(PrintTypeItem printTypeItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePunctuationWrapType(PunctuationWrapType punctuationWrapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelHeightTypeMember1(RelHeightTypeMember1 relHeightTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelHeightTypeMember2(RelHeightTypeMember2 relHeightTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelWidthTypeMember1(RelWidthTypeMember1 relWidthTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelWidthTypeMember2(RelWidthTypeMember2 relWidthTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatType(RepeatType repeatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotationAlignType(RotationAlignType rotationAlignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRubyAlignType(RubyAlignType rubyAlignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRubyPositionType(RubyPositionType rubyPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunThroughType(RunThroughType runThroughType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptTypeType(ScriptTypeType scriptTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleType(StyleType styleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextAutospaceType(TextAutospaceType textAutospaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextCombineType(TextCombineType textCombineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEmphasizeTypeMember0(TextEmphasizeTypeMember0 textEmphasizeTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEmphasizeTypeMember1BaseItem(TextEmphasizeTypeMember1BaseItem textEmphasizeTypeMember1BaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextLineThroughColorTypeMember1(TextLineThroughColorTypeMember1 textLineThroughColorTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionTypeBaseItemMember1Member1(TextPositionTypeBaseItemMember1Member1 textPositionTypeBaseItemMember1Member1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionTypeBaseItemMember1Member2(TextPositionTypeBaseItemMember1Member2 textPositionTypeBaseItemMember1Member2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextRotationScaleType(TextRotationScaleType textRotationScaleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextUnderlineColorTypeMember1(TextUnderlineColorTypeMember1 textUnderlineColorTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateTableCenteringType(TableCenteringType tableCenteringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextAlignSourceType(TextAlignSourceType textAlignSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType1(TypeType1 typeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalAlignType(VerticalAlignType verticalAlignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalPosType(VerticalPosType verticalPosType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalRelType(VerticalRelType verticalRelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapContourModeType(WrapContourModeType wrapContourModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapType(WrapType wrapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWritingModeType(WritingModeType writingModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdjustmentTypeObject(AdjustmentType adjustmentTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplyStyleNameType(String applyStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateApplyStyleNameType_MemberTypes(applyStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Apply Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplyStyleNameType_MemberTypes(String applyStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getApplyStyleNameTypeMember1().isInstance(applyStyleNameType)) {
				if (validateApplyStyleNameTypeMember1(applyStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getApplyStyleNameTypeMember1().isInstance(applyStyleNameType)) {
				if (validateApplyStyleNameTypeMember1(applyStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplyStyleNameTypeMember1(String applyStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateApplyStyleNameTypeMember1_MinLength(applyStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplyStyleNameTypeMember1_MaxLength(applyStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Apply Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplyStyleNameTypeMember1_MinLength(String applyStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = applyStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getApplyStyleNameTypeMember1(), applyStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Apply Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplyStyleNameTypeMember1_MaxLength(String applyStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = applyStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getApplyStyleNameTypeMember1(), applyStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellProtectType(Object cellProtectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCellProtectType_MemberTypes(cellProtectType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Cell Protect Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellProtectType_MemberTypes(Object cellProtectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getCellProtectTypeMember0().isInstance(cellProtectType)) {
				if (validateCellProtectTypeMember0((CellProtectTypeMember0)cellProtectType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getCellProtectTypeMember1().isInstance(cellProtectType)) {
				if (validateCellProtectTypeMember1((CellProtectTypeMember1)cellProtectType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getCellProtectTypeMember2().isInstance(cellProtectType)) {
				if (validateCellProtectTypeMember2((List)cellProtectType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getCellProtectTypeMember0().isInstance(cellProtectType)) {
				if (validateCellProtectTypeMember0((CellProtectTypeMember0)cellProtectType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getCellProtectTypeMember1().isInstance(cellProtectType)) {
				if (validateCellProtectTypeMember1((CellProtectTypeMember1)cellProtectType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getCellProtectTypeMember2().isInstance(cellProtectType)) {
				if (validateCellProtectTypeMember2((List)cellProtectType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellProtectTypeMember0Object(CellProtectTypeMember0 cellProtectTypeMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellProtectTypeMember1Object(CellProtectTypeMember1 cellProtectTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellProtectTypeMember2(List cellProtectTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCellProtectTypeMember2_MinLength(cellProtectTypeMember2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Cell Protect Type Member2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellProtectTypeMember2_MinLength(List cellProtectTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cellProtectTypeMember2.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getCellProtectTypeMember2(), cellProtectTypeMember2, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellProtectTypeMember2Base(List<?> cellProtectTypeMember2Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCellProtectTypeMember2Base_ItemType(cellProtectTypeMember2Base, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Cell Protect Type Member2 Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellProtectTypeMember2Base_ItemType(List<?> cellProtectTypeMember2Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = cellProtectTypeMember2Base.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (StylePackage.eINSTANCE.getCellProtectTypeMember2BaseItem().isInstance(item)) {
				result &= validateCellProtectTypeMember2BaseItem((CellProtectTypeMember2BaseItem)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(StylePackage.eINSTANCE.getCellProtectTypeMember2BaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellProtectTypeMember2BaseItemObject(CellProtectTypeMember2BaseItem cellProtectTypeMember2BaseItemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStyleNameType(String dataStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDataStyleNameType_MemberTypes(dataStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Data Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStyleNameType_MemberTypes(String dataStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getDataStyleNameTypeMember1().isInstance(dataStyleNameType)) {
				if (validateDataStyleNameTypeMember1(dataStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getDataStyleNameTypeMember1().isInstance(dataStyleNameType)) {
				if (validateDataStyleNameTypeMember1(dataStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStyleNameTypeMember1(String dataStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDataStyleNameTypeMember1_MinLength(dataStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataStyleNameTypeMember1_MaxLength(dataStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Data Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStyleNameTypeMember1_MinLength(String dataStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = dataStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getDataStyleNameTypeMember1(), dataStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Data Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStyleNameTypeMember1_MaxLength(String dataStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = dataStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getDataStyleNameTypeMember1(), dataStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
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
	public boolean validateFamilyTypeObject(FamilyType familyTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstPageNumberType(Object firstPageNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFirstPageNumberType_MemberTypes(firstPageNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>First Page Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstPageNumberType_MemberTypes(Object firstPageNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getFirstPageNumberTypeMember1().isInstance(firstPageNumberType)) {
				if (validateFirstPageNumberTypeMember1((FirstPageNumberTypeMember1)firstPageNumberType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getFirstPageNumberTypeMember1().isInstance(firstPageNumberType)) {
				if (validateFirstPageNumberTypeMember1((FirstPageNumberTypeMember1)firstPageNumberType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstPageNumberTypeMember1Object(FirstPageNumberTypeMember1 firstPageNumberTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontReliefTypeObject(FontReliefType fontReliefTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontSizeAsianType(String fontSizeAsianType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontSizeComplexType(String fontSizeComplexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlyphOrientationVerticalTypeObject(GlyphOrientationVerticalType glyphOrientationVerticalTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalPosTypeObject(HorizontalPosType horizontalPosTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalRelTypeObject(HorizontalRelType horizontalRelTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayoutGridModeTypeObject(LayoutGridModeType layoutGridModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeaderColorType(Object leaderColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLeaderColorType_MemberTypes(leaderColorType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Leader Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeaderColorType_MemberTypes(Object leaderColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getLeaderColorTypeMember1().isInstance(leaderColorType)) {
				if (validateLeaderColorTypeMember1((LeaderColorTypeMember1)leaderColorType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getLeaderColorTypeMember1().isInstance(leaderColorType)) {
				if (validateLeaderColorTypeMember1((LeaderColorTypeMember1)leaderColorType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeaderColorTypeMember1Object(LeaderColorTypeMember1 leaderColorTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeaderTextStyleType(String leaderTextStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLeaderTextStyleType_MemberTypes(leaderTextStyleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Leader Text Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeaderTextStyleType_MemberTypes(String leaderTextStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getLeaderTextStyleTypeMember1().isInstance(leaderTextStyleType)) {
				if (validateLeaderTextStyleTypeMember1(leaderTextStyleType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getLeaderTextStyleTypeMember1().isInstance(leaderTextStyleType)) {
				if (validateLeaderTextStyleTypeMember1(leaderTextStyleType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeaderTextStyleTypeMember1(String leaderTextStyleTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLeaderTextStyleTypeMember1_MinLength(leaderTextStyleTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateLeaderTextStyleTypeMember1_MaxLength(leaderTextStyleTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Leader Text Style Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeaderTextStyleTypeMember1_MinLength(String leaderTextStyleTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = leaderTextStyleTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getLeaderTextStyleTypeMember1(), leaderTextStyleTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Leader Text Style Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeaderTextStyleTypeMember1_MaxLength(String leaderTextStyleTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = leaderTextStyleTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getLeaderTextStyleTypeMember1(), leaderTextStyleTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegendExpansionTypeObject(LegendExpansionType legendExpansionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthType(Object lengthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLengthType_MemberTypes(lengthType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Length Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthType_MemberTypes(Object lengthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getLengthTypeMember1().isInstance(lengthType)) {
				if (validateLengthTypeMember1((LengthTypeMember1)lengthType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getLengthTypeMember1().isInstance(lengthType)) {
				if (validateLengthTypeMember1((LengthTypeMember1)lengthType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthTypeMember1Object(LengthTypeMember1 lengthTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineBreakTypeObject(LineBreakType lineBreakTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStyleNameType(String listStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateListStyleNameType_MemberTypes(listStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>List Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStyleNameType_MemberTypes(String listStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getListStyleNameTypeMember1().isInstance(listStyleNameType)) {
				if (validateListStyleNameTypeMember1(listStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getListStyleNameTypeMember1().isInstance(listStyleNameType)) {
				if (validateListStyleNameTypeMember1(listStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStyleNameTypeMember1(String listStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateListStyleNameTypeMember1_MinLength(listStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateListStyleNameTypeMember1_MaxLength(listStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>List Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStyleNameTypeMember1_MinLength(String listStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = listStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getListStyleNameTypeMember1(), listStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>List Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStyleNameTypeMember1_MaxLength(String listStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = listStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getListStyleNameTypeMember1(), listStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterPageNameType(String masterPageNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMasterPageNameType_MemberTypes(masterPageNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Master Page Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterPageNameType_MemberTypes(String masterPageNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getMasterPageNameTypeMember1().isInstance(masterPageNameType)) {
				if (validateMasterPageNameTypeMember1(masterPageNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getMasterPageNameTypeMember1().isInstance(masterPageNameType)) {
				if (validateMasterPageNameTypeMember1(masterPageNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterPageNameTypeMember1(String masterPageNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMasterPageNameTypeMember1_MinLength(masterPageNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateMasterPageNameTypeMember1_MaxLength(masterPageNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Master Page Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterPageNameTypeMember1_MinLength(String masterPageNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = masterPageNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getMasterPageNameTypeMember1(), masterPageNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Master Page Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterPageNameTypeMember1_MaxLength(String masterPageNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = masterPageNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getMasterPageNameTypeMember1(), masterPageNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorType(Object mirrorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMirrorType_MemberTypes(mirrorType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Mirror Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorType_MemberTypes(Object mirrorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getMirrorTypeMember1().isInstance(mirrorType)) {
				if (validateMirrorTypeMember1((MirrorTypeMember1)mirrorType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getMirrorTypeMember2().isInstance(mirrorType)) {
				if (validateMirrorTypeMember2((MirrorTypeMember2)mirrorType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getMirrorTypeMember3().isInstance(mirrorType)) {
				if (validateMirrorTypeMember3((List)mirrorType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getMirrorTypeMember4().isInstance(mirrorType)) {
				if (validateMirrorTypeMember4((List)mirrorType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getMirrorTypeMember1().isInstance(mirrorType)) {
				if (validateMirrorTypeMember1((MirrorTypeMember1)mirrorType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getMirrorTypeMember2().isInstance(mirrorType)) {
				if (validateMirrorTypeMember2((MirrorTypeMember2)mirrorType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getMirrorTypeMember3().isInstance(mirrorType)) {
				if (validateMirrorTypeMember3((List)mirrorType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getMirrorTypeMember4().isInstance(mirrorType)) {
				if (validateMirrorTypeMember4((List)mirrorType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember1Object(MirrorTypeMember1 mirrorTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember2Object(MirrorTypeMember2 mirrorTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember3(List mirrorTypeMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMirrorTypeMember3_MinLength(mirrorTypeMember3, diagnostics, context);
		if (result || diagnostics != null) result &= validateMirrorTypeMember3_MaxLength(mirrorTypeMember3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Mirror Type Member3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember3_MinLength(List mirrorTypeMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = mirrorTypeMember3.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getMirrorTypeMember3(), mirrorTypeMember3, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Mirror Type Member3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember3_MaxLength(List mirrorTypeMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = mirrorTypeMember3.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getMirrorTypeMember3(), mirrorTypeMember3, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember3Base(List<?> mirrorTypeMember3Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMirrorTypeMember3Base_ItemType(mirrorTypeMember3Base, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Mirror Type Member3 Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember3Base_ItemType(List<?> mirrorTypeMember3Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = mirrorTypeMember3Base.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (StylePackage.eINSTANCE.getMirrorTypeMember3BaseItem().isInstance(item)) {
				result &= validateMirrorTypeMember3BaseItem((Enumerator)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(StylePackage.eINSTANCE.getMirrorTypeMember3BaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember3BaseItem(Enumerator mirrorTypeMember3BaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMirrorTypeMember3BaseItem_MemberTypes(mirrorTypeMember3BaseItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Mirror Type Member3 Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember3BaseItem_MemberTypes(Enumerator mirrorTypeMember3BaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getMirrorTypeMember3BaseItemMember1().isInstance(mirrorTypeMember3BaseItem)) {
				if (validateMirrorTypeMember3BaseItemMember1((MirrorTypeMember3BaseItemMember1)mirrorTypeMember3BaseItem, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getMirrorTypeMember3BaseItemMember1().isInstance(mirrorTypeMember3BaseItem)) {
				if (validateMirrorTypeMember3BaseItemMember1((MirrorTypeMember3BaseItemMember1)mirrorTypeMember3BaseItem, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember3BaseItemMember1Object(MirrorTypeMember3BaseItemMember1 mirrorTypeMember3BaseItemMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember4(List mirrorTypeMember4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMirrorTypeMember4_MinLength(mirrorTypeMember4, diagnostics, context);
		if (result || diagnostics != null) result &= validateMirrorTypeMember4_MaxLength(mirrorTypeMember4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Mirror Type Member4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember4_MinLength(List mirrorTypeMember4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = mirrorTypeMember4.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getMirrorTypeMember4(), mirrorTypeMember4, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Mirror Type Member4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember4_MaxLength(List mirrorTypeMember4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = mirrorTypeMember4.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getMirrorTypeMember4(), mirrorTypeMember4, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember4Base(List<?> mirrorTypeMember4Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMirrorTypeMember4Base_ItemType(mirrorTypeMember4Base, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Mirror Type Member4 Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember4Base_ItemType(List<?> mirrorTypeMember4Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = mirrorTypeMember4Base.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (StylePackage.eINSTANCE.getMirrorTypeMember4BaseItem().isInstance(item)) {
				result &= validateMirrorTypeMember4BaseItem((Enumerator)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(StylePackage.eINSTANCE.getMirrorTypeMember4BaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember4BaseItem(Enumerator mirrorTypeMember4BaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMirrorTypeMember4BaseItem_MemberTypes(mirrorTypeMember4BaseItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Mirror Type Member4 Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember4BaseItem_MemberTypes(Enumerator mirrorTypeMember4BaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getMirrorTypeMember4BaseItemMember1().isInstance(mirrorTypeMember4BaseItem)) {
				if (validateMirrorTypeMember4BaseItemMember1((MirrorTypeMember4BaseItemMember1)mirrorTypeMember4BaseItem, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getMirrorTypeMember4BaseItemMember1().isInstance(mirrorTypeMember4BaseItem)) {
				if (validateMirrorTypeMember4BaseItemMember1((MirrorTypeMember4BaseItemMember1)mirrorTypeMember4BaseItem, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMirrorTypeMember4BaseItemMember1Object(MirrorTypeMember4BaseItemMember1 mirrorTypeMember4BaseItemMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNextStyleNameType(String nextStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNextStyleNameType_MemberTypes(nextStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Next Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNextStyleNameType_MemberTypes(String nextStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getNextStyleNameTypeMember1().isInstance(nextStyleNameType)) {
				if (validateNextStyleNameTypeMember1(nextStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getNextStyleNameTypeMember1().isInstance(nextStyleNameType)) {
				if (validateNextStyleNameTypeMember1(nextStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNextStyleNameTypeMember1(String nextStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNextStyleNameTypeMember1_MinLength(nextStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateNextStyleNameTypeMember1_MaxLength(nextStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Next Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNextStyleNameTypeMember1_MinLength(String nextStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nextStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getNextStyleNameTypeMember1(), nextStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Next Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNextStyleNameTypeMember1_MaxLength(String nextStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nextStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getNextStyleNameTypeMember1(), nextStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberWrappedParagraphsType(Object numberWrappedParagraphsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNumberWrappedParagraphsType_MemberTypes(numberWrappedParagraphsType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Number Wrapped Paragraphs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberWrappedParagraphsType_MemberTypes(Object numberWrappedParagraphsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getNumberWrappedParagraphsTypeMember1().isInstance(numberWrappedParagraphsType)) {
				if (validateNumberWrappedParagraphsTypeMember1((NumberWrappedParagraphsTypeMember1)numberWrappedParagraphsType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getNumberWrappedParagraphsTypeMember1().isInstance(numberWrappedParagraphsType)) {
				if (validateNumberWrappedParagraphsTypeMember1((NumberWrappedParagraphsTypeMember1)numberWrappedParagraphsType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberWrappedParagraphsTypeMember1Object(NumberWrappedParagraphsTypeMember1 numberWrappedParagraphsTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatType(Object numFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNumFormatType_MemberTypes(numFormatType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Num Format Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatType_MemberTypes(Object numFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getNumFormatTypeMember0().isInstance(numFormatType)) {
				if (validateNumFormatTypeMember0(numFormatType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getNumFormatTypeMember1().isInstance(numFormatType)) {
				if (validateNumFormatTypeMember1((NumFormatTypeMember1)numFormatType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getNumFormatTypeMember0().isInstance(numFormatType)) {
				if (validateNumFormatTypeMember0(numFormatType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getNumFormatTypeMember1().isInstance(numFormatType)) {
				if (validateNumFormatTypeMember1((NumFormatTypeMember1)numFormatType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0(Object numFormatTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNumFormatTypeMember0_MemberTypes(numFormatTypeMember0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Num Format Type Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0_MemberTypes(Object numFormatTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member0().isInstance(numFormatTypeMember0)) {
				if (validateNumFormatTypeMember0Member0(numFormatTypeMember0, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member1().isInstance(numFormatTypeMember0)) {
				if (validateNumFormatTypeMember0Member1((String)numFormatTypeMember0, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member0().isInstance(numFormatTypeMember0)) {
				if (validateNumFormatTypeMember0Member0(numFormatTypeMember0, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member1().isInstance(numFormatTypeMember0)) {
				if (validateNumFormatTypeMember0Member1((String)numFormatTypeMember0, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0Member0(Object numFormatTypeMember0Member0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNumFormatTypeMember0Member0_MemberTypes(numFormatTypeMember0Member0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Num Format Type Member0 Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0Member0_MemberTypes(Object numFormatTypeMember0Member0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member1().isInstance(numFormatTypeMember0Member0)) {
				if (validateNumFormatTypeMember0Member0Member1((NumFormatTypeMember0Member0Member1)numFormatTypeMember0Member0, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member2().isInstance(numFormatTypeMember0Member0)) {
				if (validateNumFormatTypeMember0Member0Member2((NumFormatTypeMember0Member0Member2)numFormatTypeMember0Member0, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member3().isInstance(numFormatTypeMember0Member0)) {
				if (validateNumFormatTypeMember0Member0Member3((NumFormatTypeMember0Member0Member3)numFormatTypeMember0Member0, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member1().isInstance(numFormatTypeMember0Member0)) {
				if (validateNumFormatTypeMember0Member0Member1((NumFormatTypeMember0Member0Member1)numFormatTypeMember0Member0, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member2().isInstance(numFormatTypeMember0Member0)) {
				if (validateNumFormatTypeMember0Member0Member2((NumFormatTypeMember0Member0Member2)numFormatTypeMember0Member0, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member3().isInstance(numFormatTypeMember0Member0)) {
				if (validateNumFormatTypeMember0Member0Member3((NumFormatTypeMember0Member0Member3)numFormatTypeMember0Member0, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0Member0Member1Object(NumFormatTypeMember0Member0Member1 numFormatTypeMember0Member0Member1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0Member0Member2Object(NumFormatTypeMember0Member0Member2 numFormatTypeMember0Member0Member2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0Member0Member3Object(NumFormatTypeMember0Member0Member3 numFormatTypeMember0Member0Member3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0Member1(String numFormatTypeMember0Member1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNumFormatTypeMember0Member1_MinLength(numFormatTypeMember0Member1, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumFormatTypeMember0Member1_MaxLength(numFormatTypeMember0Member1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Num Format Type Member0 Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0Member1_MinLength(String numFormatTypeMember0Member1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = numFormatTypeMember0Member1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getNumFormatTypeMember0Member1(), numFormatTypeMember0Member1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Num Format Type Member0 Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember0Member1_MaxLength(String numFormatTypeMember0Member1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = numFormatTypeMember0Member1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getNumFormatTypeMember0Member1(), numFormatTypeMember0Member1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumFormatTypeMember1Object(NumFormatTypeMember1 numFormatTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverflowBehaviorTypeObject(OverflowBehaviorType overflowBehaviorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageLayoutNameType(String pageLayoutNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePageLayoutNameType_MemberTypes(pageLayoutNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Page Layout Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageLayoutNameType_MemberTypes(String pageLayoutNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getPageLayoutNameTypeMember1().isInstance(pageLayoutNameType)) {
				if (validatePageLayoutNameTypeMember1(pageLayoutNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getPageLayoutNameTypeMember1().isInstance(pageLayoutNameType)) {
				if (validatePageLayoutNameTypeMember1(pageLayoutNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageLayoutNameTypeMember1(String pageLayoutNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePageLayoutNameTypeMember1_MinLength(pageLayoutNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageLayoutNameTypeMember1_MaxLength(pageLayoutNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Page Layout Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageLayoutNameTypeMember1_MinLength(String pageLayoutNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = pageLayoutNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getPageLayoutNameTypeMember1(), pageLayoutNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Page Layout Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageLayoutNameTypeMember1_MaxLength(String pageLayoutNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = pageLayoutNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getPageLayoutNameTypeMember1(), pageLayoutNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageNumberType(Object pageNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePageNumberType_MemberTypes(pageNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Page Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageNumberType_MemberTypes(Object pageNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getPageNumberTypeMember1().isInstance(pageNumberType)) {
				if (validatePageNumberTypeMember1((PageNumberTypeMember1)pageNumberType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getPageNumberTypeMember1().isInstance(pageNumberType)) {
				if (validatePageNumberTypeMember1((PageNumberTypeMember1)pageNumberType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageNumberTypeMember1Object(PageNumberTypeMember1 pageNumberTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageUsageTypeObject(PageUsageType pageUsageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaperTrayNameType(Object paperTrayNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePaperTrayNameType_MemberTypes(paperTrayNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Paper Tray Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaperTrayNameType_MemberTypes(Object paperTrayNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getPaperTrayNameTypeMember1().isInstance(paperTrayNameType)) {
				if (validatePaperTrayNameTypeMember1((PaperTrayNameTypeMember1)paperTrayNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getPaperTrayNameTypeMember1().isInstance(paperTrayNameType)) {
				if (validatePaperTrayNameTypeMember1((PaperTrayNameTypeMember1)paperTrayNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaperTrayNameTypeMember1Object(PaperTrayNameTypeMember1 paperTrayNameTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentStyleNameType(String parentStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateParentStyleNameType_MemberTypes(parentStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Parent Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentStyleNameType_MemberTypes(String parentStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getParentStyleNameTypeMember1().isInstance(parentStyleNameType)) {
				if (validateParentStyleNameTypeMember1(parentStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getParentStyleNameTypeMember1().isInstance(parentStyleNameType)) {
				if (validateParentStyleNameTypeMember1(parentStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentStyleNameTypeMember1(String parentStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateParentStyleNameTypeMember1_MinLength(parentStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateParentStyleNameTypeMember1_MaxLength(parentStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Parent Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentStyleNameTypeMember1_MinLength(String parentStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = parentStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getParentStyleNameTypeMember1(), parentStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Parent Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentStyleNameTypeMember1_MaxLength(String parentStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = parentStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getParentStyleNameTypeMember1(), parentStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType(Object positionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositionType_MemberTypes(positionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType_MemberTypes(Object positionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getPositionTypeMember0().isInstance(positionType)) {
				if (validatePositionTypeMember0((PositionTypeMember0)positionType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getPositionTypeMember1().isInstance(positionType)) {
				if (validatePositionTypeMember1((PositionTypeMember1)positionType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getPositionTypeMember2().isInstance(positionType)) {
				if (validatePositionTypeMember2((PositionTypeMember2)positionType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getPositionTypeMember3().isInstance(positionType)) {
				if (validatePositionTypeMember3((PositionTypeMember3)positionType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getPositionTypeMember4().isInstance(positionType)) {
				if (validatePositionTypeMember4((PositionTypeMember4)positionType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getPositionTypeMember5().isInstance(positionType)) {
				if (validatePositionTypeMember5((List)positionType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getPositionTypeMember6().isInstance(positionType)) {
				if (validatePositionTypeMember6((List)positionType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getPositionTypeMember0().isInstance(positionType)) {
				if (validatePositionTypeMember0((PositionTypeMember0)positionType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getPositionTypeMember1().isInstance(positionType)) {
				if (validatePositionTypeMember1((PositionTypeMember1)positionType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getPositionTypeMember2().isInstance(positionType)) {
				if (validatePositionTypeMember2((PositionTypeMember2)positionType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getPositionTypeMember3().isInstance(positionType)) {
				if (validatePositionTypeMember3((PositionTypeMember3)positionType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getPositionTypeMember4().isInstance(positionType)) {
				if (validatePositionTypeMember4((PositionTypeMember4)positionType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getPositionTypeMember5().isInstance(positionType)) {
				if (validatePositionTypeMember5((List)positionType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getPositionTypeMember6().isInstance(positionType)) {
				if (validatePositionTypeMember6((List)positionType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember0Object(PositionTypeMember0 positionTypeMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember1Object(PositionTypeMember1 positionTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember2Object(PositionTypeMember2 positionTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember3Object(PositionTypeMember3 positionTypeMember3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember4Object(PositionTypeMember4 positionTypeMember4Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember5(List positionTypeMember5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositionTypeMember5_MinLength(positionTypeMember5, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositionTypeMember5_MaxLength(positionTypeMember5, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Position Type Member5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember5_MinLength(List positionTypeMember5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = positionTypeMember5.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getPositionTypeMember5(), positionTypeMember5, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Position Type Member5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember5_MaxLength(List positionTypeMember5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = positionTypeMember5.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getPositionTypeMember5(), positionTypeMember5, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember5Base(List<?> positionTypeMember5Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositionTypeMember5Base_ItemType(positionTypeMember5Base, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Position Type Member5 Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember5Base_ItemType(List<?> positionTypeMember5Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = positionTypeMember5Base.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (StylePackage.eINSTANCE.getPositionTypeMember5BaseItem().isInstance(item)) {
				result &= validatePositionTypeMember5BaseItem((Enumerator)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(StylePackage.eINSTANCE.getPositionTypeMember5BaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember5BaseItem(Enumerator positionTypeMember5BaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember6(List positionTypeMember6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositionTypeMember6_MinLength(positionTypeMember6, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositionTypeMember6_MaxLength(positionTypeMember6, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Position Type Member6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember6_MinLength(List positionTypeMember6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = positionTypeMember6.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getPositionTypeMember6(), positionTypeMember6, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Position Type Member6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember6_MaxLength(List positionTypeMember6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = positionTypeMember6.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getPositionTypeMember6(), positionTypeMember6, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember6Base(List<?> positionTypeMember6Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositionTypeMember6Base_ItemType(positionTypeMember6Base, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Position Type Member6 Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember6Base_ItemType(List<?> positionTypeMember6Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = positionTypeMember6Base.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (StylePackage.eINSTANCE.getPositionTypeMember6BaseItem().isInstance(item)) {
				result &= validatePositionTypeMember6BaseItem((Enumerator)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(StylePackage.eINSTANCE.getPositionTypeMember6BaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionTypeMember6BaseItem(Enumerator positionTypeMember6BaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrintOrientationTypeObject(PrintOrientationType printOrientationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrintPageOrderTypeObject(PrintPageOrderType printPageOrderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrintType(List<?> printType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePrintType_ItemType(printType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Print Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrintType_ItemType(List<?> printType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = printType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (StylePackage.eINSTANCE.getPrintTypeItem().isInstance(item)) {
				result &= validatePrintTypeItem((PrintTypeItem)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(StylePackage.eINSTANCE.getPrintTypeItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrintTypeItemObject(PrintTypeItem printTypeItemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePunctuationWrapTypeObject(PunctuationWrapType punctuationWrapTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisterTruthRefStyleNameType(String registerTruthRefStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRegisterTruthRefStyleNameType_MemberTypes(registerTruthRefStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Register Truth Ref Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisterTruthRefStyleNameType_MemberTypes(String registerTruthRefStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getRegisterTruthRefStyleNameTypeMember1().isInstance(registerTruthRefStyleNameType)) {
				if (validateRegisterTruthRefStyleNameTypeMember1(registerTruthRefStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getRegisterTruthRefStyleNameTypeMember1().isInstance(registerTruthRefStyleNameType)) {
				if (validateRegisterTruthRefStyleNameTypeMember1(registerTruthRefStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisterTruthRefStyleNameTypeMember1(String registerTruthRefStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRegisterTruthRefStyleNameTypeMember1_MinLength(registerTruthRefStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegisterTruthRefStyleNameTypeMember1_MaxLength(registerTruthRefStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Register Truth Ref Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisterTruthRefStyleNameTypeMember1_MinLength(String registerTruthRefStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = registerTruthRefStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getRegisterTruthRefStyleNameTypeMember1(), registerTruthRefStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Register Truth Ref Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisterTruthRefStyleNameTypeMember1_MaxLength(String registerTruthRefStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = registerTruthRefStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getRegisterTruthRefStyleNameTypeMember1(), registerTruthRefStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelHeightType(Object relHeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRelHeightType_MemberTypes(relHeightType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Rel Height Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelHeightType_MemberTypes(Object relHeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getRelHeightTypeMember1().isInstance(relHeightType)) {
				if (validateRelHeightTypeMember1((RelHeightTypeMember1)relHeightType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getRelHeightTypeMember2().isInstance(relHeightType)) {
				if (validateRelHeightTypeMember2((RelHeightTypeMember2)relHeightType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getRelHeightTypeMember1().isInstance(relHeightType)) {
				if (validateRelHeightTypeMember1((RelHeightTypeMember1)relHeightType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getRelHeightTypeMember2().isInstance(relHeightType)) {
				if (validateRelHeightTypeMember2((RelHeightTypeMember2)relHeightType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelHeightTypeMember1Object(RelHeightTypeMember1 relHeightTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelHeightTypeMember2Object(RelHeightTypeMember2 relHeightTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelWidthType(Object relWidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRelWidthType_MemberTypes(relWidthType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Rel Width Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelWidthType_MemberTypes(Object relWidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getRelWidthTypeMember1().isInstance(relWidthType)) {
				if (validateRelWidthTypeMember1((RelWidthTypeMember1)relWidthType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getRelWidthTypeMember2().isInstance(relWidthType)) {
				if (validateRelWidthTypeMember2((RelWidthTypeMember2)relWidthType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getRelWidthTypeMember1().isInstance(relWidthType)) {
				if (validateRelWidthTypeMember1((RelWidthTypeMember1)relWidthType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getRelWidthTypeMember2().isInstance(relWidthType)) {
				if (validateRelWidthTypeMember2((RelWidthTypeMember2)relWidthType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelWidthTypeMember1Object(RelWidthTypeMember1 relWidthTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelWidthTypeMember2Object(RelWidthTypeMember2 relWidthTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatTypeObject(RepeatType repeatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRotationAlignTypeObject(RotationAlignType rotationAlignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRubyAlignTypeObject(RubyAlignType rubyAlignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRubyPositionTypeObject(RubyPositionType rubyPositionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunThroughTypeObject(RunThroughType runThroughTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptTypeTypeObject(ScriptTypeType scriptTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType(String styleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType_MemberTypes(styleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType_MemberTypes(String styleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getStyleNameTypeMember1().isInstance(styleNameType)) {
				if (validateStyleNameTypeMember1(styleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getStyleNameTypeMember1().isInstance(styleNameType)) {
				if (validateStyleNameTypeMember1(styleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember1(String styleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember1_MinLength(styleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember1_MaxLength(styleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember1_MinLength(String styleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getStyleNameTypeMember1(), styleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember1_MaxLength(String styleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getStyleNameTypeMember1(), styleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleTypeObject(StyleType styleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextAutospaceTypeObject(TextAutospaceType textAutospaceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextCombineTypeObject(TextCombineType textCombineTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEmphasizeType(Object textEmphasizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextEmphasizeType_MemberTypes(textEmphasizeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Text Emphasize Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEmphasizeType_MemberTypes(Object textEmphasizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getTextEmphasizeTypeMember0().isInstance(textEmphasizeType)) {
				if (validateTextEmphasizeTypeMember0((TextEmphasizeTypeMember0)textEmphasizeType, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getTextEmphasizeTypeMember1().isInstance(textEmphasizeType)) {
				if (validateTextEmphasizeTypeMember1((List)textEmphasizeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getTextEmphasizeTypeMember0().isInstance(textEmphasizeType)) {
				if (validateTextEmphasizeTypeMember0((TextEmphasizeTypeMember0)textEmphasizeType, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getTextEmphasizeTypeMember1().isInstance(textEmphasizeType)) {
				if (validateTextEmphasizeTypeMember1((List)textEmphasizeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEmphasizeTypeMember0Object(TextEmphasizeTypeMember0 textEmphasizeTypeMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEmphasizeTypeMember1(List textEmphasizeTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextEmphasizeTypeMember1_MinLength(textEmphasizeTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextEmphasizeTypeMember1_MaxLength(textEmphasizeTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Text Emphasize Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEmphasizeTypeMember1_MinLength(List textEmphasizeTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = textEmphasizeTypeMember1.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getTextEmphasizeTypeMember1(), textEmphasizeTypeMember1, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Text Emphasize Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEmphasizeTypeMember1_MaxLength(List textEmphasizeTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = textEmphasizeTypeMember1.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getTextEmphasizeTypeMember1(), textEmphasizeTypeMember1, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEmphasizeTypeMember1Base(List<?> textEmphasizeTypeMember1Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextEmphasizeTypeMember1Base_ItemType(textEmphasizeTypeMember1Base, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Text Emphasize Type Member1 Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEmphasizeTypeMember1Base_ItemType(List<?> textEmphasizeTypeMember1Base, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = textEmphasizeTypeMember1Base.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (StylePackage.eINSTANCE.getTextEmphasizeTypeMember1BaseItem().isInstance(item)) {
				result &= validateTextEmphasizeTypeMember1BaseItem((TextEmphasizeTypeMember1BaseItem)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(StylePackage.eINSTANCE.getTextEmphasizeTypeMember1BaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextLineThroughColorType(Object textLineThroughColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextLineThroughColorType_MemberTypes(textLineThroughColorType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Text Line Through Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextLineThroughColorType_MemberTypes(Object textLineThroughColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getTextLineThroughColorTypeMember1().isInstance(textLineThroughColorType)) {
				if (validateTextLineThroughColorTypeMember1((TextLineThroughColorTypeMember1)textLineThroughColorType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getTextLineThroughColorTypeMember1().isInstance(textLineThroughColorType)) {
				if (validateTextLineThroughColorTypeMember1((TextLineThroughColorTypeMember1)textLineThroughColorType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextLineThroughColorTypeMember1Object(TextLineThroughColorTypeMember1 textLineThroughColorTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextLineThroughTextStyleType(String textLineThroughTextStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextLineThroughTextStyleType_MemberTypes(textLineThroughTextStyleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Text Line Through Text Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextLineThroughTextStyleType_MemberTypes(String textLineThroughTextStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getTextLineThroughTextStyleTypeMember1().isInstance(textLineThroughTextStyleType)) {
				if (validateTextLineThroughTextStyleTypeMember1(textLineThroughTextStyleType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getTextLineThroughTextStyleTypeMember1().isInstance(textLineThroughTextStyleType)) {
				if (validateTextLineThroughTextStyleTypeMember1(textLineThroughTextStyleType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextLineThroughTextStyleTypeMember1(String textLineThroughTextStyleTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextLineThroughTextStyleTypeMember1_MinLength(textLineThroughTextStyleTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextLineThroughTextStyleTypeMember1_MaxLength(textLineThroughTextStyleTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Text Line Through Text Style Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextLineThroughTextStyleTypeMember1_MinLength(String textLineThroughTextStyleTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = textLineThroughTextStyleTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getTextLineThroughTextStyleTypeMember1(), textLineThroughTextStyleTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Text Line Through Text Style Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextLineThroughTextStyleTypeMember1_MaxLength(String textLineThroughTextStyleTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = textLineThroughTextStyleTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getTextLineThroughTextStyleTypeMember1(), textLineThroughTextStyleTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionType(List textPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextPositionType_MinLength(textPositionType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextPositionType_MaxLength(textPositionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Text Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionType_MinLength(List textPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = textPositionType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(StylePackage.eINSTANCE.getTextPositionType(), textPositionType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Text Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionType_MaxLength(List textPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = textPositionType.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(StylePackage.eINSTANCE.getTextPositionType(), textPositionType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionTypeBase(List<?> textPositionTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextPositionTypeBase_ItemType(textPositionTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Text Position Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionTypeBase_ItemType(List<?> textPositionTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = textPositionTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (StylePackage.eINSTANCE.getTextPositionTypeBaseItem().isInstance(item)) {
				result &= validateTextPositionTypeBaseItem(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(StylePackage.eINSTANCE.getTextPositionTypeBaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionTypeBaseItem(Object textPositionTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextPositionTypeBaseItem_MemberTypes(textPositionTypeBaseItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Text Position Type Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionTypeBaseItem_MemberTypes(Object textPositionTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1().isInstance(textPositionTypeBaseItem)) {
				if (validateTextPositionTypeBaseItemMember1(textPositionTypeBaseItem, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1().isInstance(textPositionTypeBaseItem)) {
				if (validateTextPositionTypeBaseItemMember1(textPositionTypeBaseItem, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionTypeBaseItemMember1(Object textPositionTypeBaseItemMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextPositionTypeBaseItemMember1_MemberTypes(textPositionTypeBaseItemMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Text Position Type Base Item Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionTypeBaseItemMember1_MemberTypes(Object textPositionTypeBaseItemMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member1().isInstance(textPositionTypeBaseItemMember1)) {
				if (validateTextPositionTypeBaseItemMember1Member1((TextPositionTypeBaseItemMember1Member1)textPositionTypeBaseItemMember1, tempDiagnostics, context)) return true;
			}
			if (StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member2().isInstance(textPositionTypeBaseItemMember1)) {
				if (validateTextPositionTypeBaseItemMember1Member2((TextPositionTypeBaseItemMember1Member2)textPositionTypeBaseItemMember1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member1().isInstance(textPositionTypeBaseItemMember1)) {
				if (validateTextPositionTypeBaseItemMember1Member1((TextPositionTypeBaseItemMember1Member1)textPositionTypeBaseItemMember1, null, context)) return true;
			}
			if (StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member2().isInstance(textPositionTypeBaseItemMember1)) {
				if (validateTextPositionTypeBaseItemMember1Member2((TextPositionTypeBaseItemMember1Member2)textPositionTypeBaseItemMember1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionTypeBaseItemMember1Member1Object(TextPositionTypeBaseItemMember1Member1 textPositionTypeBaseItemMember1Member1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPositionTypeBaseItemMember1Member2Object(TextPositionTypeBaseItemMember1Member2 textPositionTypeBaseItemMember1Member2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextRotationScaleTypeObject(TextRotationScaleType textRotationScaleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextUnderlineColorTypeMember1Object(TextUnderlineColorTypeMember1 textUnderlineColorTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
	public boolean validateTableCenteringTypeObject(TableCenteringType tableCenteringTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextAlignSourceTypeObject(TextAlignSourceType textAlignSourceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEmphasizeTypeMember1BaseItemObject(TextEmphasizeTypeMember1BaseItem textEmphasizeTypeMember1BaseItemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextUnderlineColorType(Object textUnderlineColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextUnderlineColorType_MemberTypes(textUnderlineColorType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Text Underline Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextUnderlineColorType_MemberTypes(Object textUnderlineColorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (StylePackage.eINSTANCE.getTextUnderlineColorTypeMember1().isInstance(textUnderlineColorType)) {
				if (validateTextUnderlineColorTypeMember1((TextUnderlineColorTypeMember1)textUnderlineColorType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (StylePackage.eINSTANCE.getTextUnderlineColorTypeMember1().isInstance(textUnderlineColorType)) {
				if (validateTextUnderlineColorTypeMember1((TextUnderlineColorTypeMember1)textUnderlineColorType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject1(TypeType1 typeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalAlignTypeObject(VerticalAlignType verticalAlignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalPosTypeObject(VerticalPosType verticalPosTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalRelTypeObject(VerticalRelType verticalRelTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapContourModeTypeObject(WrapContourModeType wrapContourModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapTypeObject(WrapType wrapTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWritingModeTypeObject(WritingModeType writingModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //StyleValidator
