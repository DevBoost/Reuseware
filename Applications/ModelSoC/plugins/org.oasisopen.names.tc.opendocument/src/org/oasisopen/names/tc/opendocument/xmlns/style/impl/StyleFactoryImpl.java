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
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
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
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StyleFactoryImpl extends EFactoryImpl implements StyleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StyleFactory init() {
		try {
			StyleFactory theStyleFactory = (StyleFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:style:1.0"); 
			if (theStyleFactory != null) {
				return theStyleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StyleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleFactoryImpl() {
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
			case StylePackage.BACKGROUND_IMAGE_TYPE: return createBackgroundImageType();
			case StylePackage.COLUMN_SEP_TYPE: return createColumnSepType();
			case StylePackage.COLUMNS_TYPE: return createColumnsType();
			case StylePackage.COLUMN_TYPE: return createColumnType();
			case StylePackage.DROP_CAP_TYPE: return createDropCapType();
			case StylePackage.FONT_FACE_TYPE: return createFontFaceType();
			case StylePackage.FOOTER_LEFT_TYPE: return createFooterLeftType();
			case StylePackage.FOOTER_STYLE_TYPE: return createFooterStyleType();
			case StylePackage.FOOTER_TYPE: return createFooterType();
			case StylePackage.FOOTNOTE_SEP_TYPE: return createFootnoteSepType();
			case StylePackage.HANDOUT_MASTER_TYPE: return createHandoutMasterType();
			case StylePackage.HEADER_LEFT_TYPE: return createHeaderLeftType();
			case StylePackage.HEADER_STYLE_TYPE: return createHeaderStyleType();
			case StylePackage.HEADER_TYPE: return createHeaderType();
			case StylePackage.MAP_TYPE: return createMapType();
			case StylePackage.MASTER_PAGE_TYPE: return createMasterPageType();
			case StylePackage.PAGE_LAYOUT_TYPE: return createPageLayoutType();
			case StylePackage.PRESENTATION_PAGE_LAYOUT_TYPE: return createPresentationPageLayoutType();
			case StylePackage.STYLE_TYPE1: return createStyleType1();
			case StylePackage.TAB_STOPS_TYPE: return createTabStopsType();
			case StylePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case StylePackage.TAB_STOP_TYPE: return createTabStopType();
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
			case StylePackage.ADJUSTMENT_TYPE:
				return createAdjustmentTypeFromString(eDataType, initialValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER0:
				return createCellProtectTypeMember0FromString(eDataType, initialValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER1:
				return createCellProtectTypeMember1FromString(eDataType, initialValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER2_BASE_ITEM:
				return createCellProtectTypeMember2BaseItemFromString(eDataType, initialValue);
			case StylePackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case StylePackage.FAMILY_TYPE:
				return createFamilyTypeFromString(eDataType, initialValue);
			case StylePackage.FIRST_PAGE_NUMBER_TYPE_MEMBER1:
				return createFirstPageNumberTypeMember1FromString(eDataType, initialValue);
			case StylePackage.FONT_RELIEF_TYPE:
				return createFontReliefTypeFromString(eDataType, initialValue);
			case StylePackage.GLYPH_ORIENTATION_VERTICAL_TYPE:
				return createGlyphOrientationVerticalTypeFromString(eDataType, initialValue);
			case StylePackage.HORIZONTAL_POS_TYPE:
				return createHorizontalPosTypeFromString(eDataType, initialValue);
			case StylePackage.HORIZONTAL_REL_TYPE:
				return createHorizontalRelTypeFromString(eDataType, initialValue);
			case StylePackage.LAYOUT_GRID_MODE_TYPE:
				return createLayoutGridModeTypeFromString(eDataType, initialValue);
			case StylePackage.LEADER_COLOR_TYPE_MEMBER1:
				return createLeaderColorTypeMember1FromString(eDataType, initialValue);
			case StylePackage.LEGEND_EXPANSION_TYPE:
				return createLegendExpansionTypeFromString(eDataType, initialValue);
			case StylePackage.LENGTH_TYPE_MEMBER1:
				return createLengthTypeMember1FromString(eDataType, initialValue);
			case StylePackage.LINE_BREAK_TYPE:
				return createLineBreakTypeFromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER1:
				return createMirrorTypeMember1FromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER2:
				return createMirrorTypeMember2FromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER3_BASE_ITEM_MEMBER1:
				return createMirrorTypeMember3BaseItemMember1FromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER4_BASE_ITEM_MEMBER1:
				return createMirrorTypeMember4BaseItemMember1FromString(eDataType, initialValue);
			case StylePackage.NUMBER_WRAPPED_PARAGRAPHS_TYPE_MEMBER1:
				return createNumberWrappedParagraphsTypeMember1FromString(eDataType, initialValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER1:
				return createNumFormatTypeMember0Member0Member1FromString(eDataType, initialValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER2:
				return createNumFormatTypeMember0Member0Member2FromString(eDataType, initialValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER3:
				return createNumFormatTypeMember0Member0Member3FromString(eDataType, initialValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER1:
				return createNumFormatTypeMember1FromString(eDataType, initialValue);
			case StylePackage.OVERFLOW_BEHAVIOR_TYPE:
				return createOverflowBehaviorTypeFromString(eDataType, initialValue);
			case StylePackage.PAGE_NUMBER_TYPE_MEMBER1:
				return createPageNumberTypeMember1FromString(eDataType, initialValue);
			case StylePackage.PAGE_USAGE_TYPE:
				return createPageUsageTypeFromString(eDataType, initialValue);
			case StylePackage.PAPER_TRAY_NAME_TYPE_MEMBER1:
				return createPaperTrayNameTypeMember1FromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER0:
				return createPositionTypeMember0FromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER1:
				return createPositionTypeMember1FromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER2:
				return createPositionTypeMember2FromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER3:
				return createPositionTypeMember3FromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER4:
				return createPositionTypeMember4FromString(eDataType, initialValue);
			case StylePackage.PRINT_ORIENTATION_TYPE:
				return createPrintOrientationTypeFromString(eDataType, initialValue);
			case StylePackage.PRINT_PAGE_ORDER_TYPE:
				return createPrintPageOrderTypeFromString(eDataType, initialValue);
			case StylePackage.PRINT_TYPE_ITEM:
				return createPrintTypeItemFromString(eDataType, initialValue);
			case StylePackage.PUNCTUATION_WRAP_TYPE:
				return createPunctuationWrapTypeFromString(eDataType, initialValue);
			case StylePackage.REL_HEIGHT_TYPE_MEMBER1:
				return createRelHeightTypeMember1FromString(eDataType, initialValue);
			case StylePackage.REL_HEIGHT_TYPE_MEMBER2:
				return createRelHeightTypeMember2FromString(eDataType, initialValue);
			case StylePackage.REL_WIDTH_TYPE_MEMBER1:
				return createRelWidthTypeMember1FromString(eDataType, initialValue);
			case StylePackage.REL_WIDTH_TYPE_MEMBER2:
				return createRelWidthTypeMember2FromString(eDataType, initialValue);
			case StylePackage.REPEAT_TYPE:
				return createRepeatTypeFromString(eDataType, initialValue);
			case StylePackage.ROTATION_ALIGN_TYPE:
				return createRotationAlignTypeFromString(eDataType, initialValue);
			case StylePackage.RUBY_ALIGN_TYPE:
				return createRubyAlignTypeFromString(eDataType, initialValue);
			case StylePackage.RUBY_POSITION_TYPE:
				return createRubyPositionTypeFromString(eDataType, initialValue);
			case StylePackage.RUN_THROUGH_TYPE:
				return createRunThroughTypeFromString(eDataType, initialValue);
			case StylePackage.SCRIPT_TYPE_TYPE:
				return createScriptTypeTypeFromString(eDataType, initialValue);
			case StylePackage.STYLE_TYPE:
				return createStyleTypeFromString(eDataType, initialValue);
			case StylePackage.TEXT_AUTOSPACE_TYPE:
				return createTextAutospaceTypeFromString(eDataType, initialValue);
			case StylePackage.TEXT_COMBINE_TYPE:
				return createTextCombineTypeFromString(eDataType, initialValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER0:
				return createTextEmphasizeTypeMember0FromString(eDataType, initialValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER1_BASE_ITEM:
				return createTextEmphasizeTypeMember1BaseItemFromString(eDataType, initialValue);
			case StylePackage.TEXT_LINE_THROUGH_COLOR_TYPE_MEMBER1:
				return createTextLineThroughColorTypeMember1FromString(eDataType, initialValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER1:
				return createTextPositionTypeBaseItemMember1Member1FromString(eDataType, initialValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER2:
				return createTextPositionTypeBaseItemMember1Member2FromString(eDataType, initialValue);
			case StylePackage.TEXT_ROTATION_SCALE_TYPE:
				return createTextRotationScaleTypeFromString(eDataType, initialValue);
			case StylePackage.TEXT_UNDERLINE_COLOR_TYPE_MEMBER1:
				return createTextUnderlineColorTypeMember1FromString(eDataType, initialValue);
			case StylePackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case StylePackage.TABLE_CENTERING_TYPE:
				return createTableCenteringTypeFromString(eDataType, initialValue);
			case StylePackage.TEXT_ALIGN_SOURCE_TYPE:
				return createTextAlignSourceTypeFromString(eDataType, initialValue);
			case StylePackage.TYPE_TYPE1:
				return createTypeType1FromString(eDataType, initialValue);
			case StylePackage.VERTICAL_ALIGN_TYPE:
				return createVerticalAlignTypeFromString(eDataType, initialValue);
			case StylePackage.VERTICAL_POS_TYPE:
				return createVerticalPosTypeFromString(eDataType, initialValue);
			case StylePackage.VERTICAL_REL_TYPE:
				return createVerticalRelTypeFromString(eDataType, initialValue);
			case StylePackage.WRAP_CONTOUR_MODE_TYPE:
				return createWrapContourModeTypeFromString(eDataType, initialValue);
			case StylePackage.WRAP_TYPE:
				return createWrapTypeFromString(eDataType, initialValue);
			case StylePackage.WRITING_MODE_TYPE:
				return createWritingModeTypeFromString(eDataType, initialValue);
			case StylePackage.ADJUSTMENT_TYPE_OBJECT:
				return createAdjustmentTypeObjectFromString(eDataType, initialValue);
			case StylePackage.APPLY_STYLE_NAME_TYPE:
				return createApplyStyleNameTypeFromString(eDataType, initialValue);
			case StylePackage.APPLY_STYLE_NAME_TYPE_MEMBER1:
				return createApplyStyleNameTypeMember1FromString(eDataType, initialValue);
			case StylePackage.CELL_PROTECT_TYPE:
				return createCellProtectTypeFromString(eDataType, initialValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER0_OBJECT:
				return createCellProtectTypeMember0ObjectFromString(eDataType, initialValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER1_OBJECT:
				return createCellProtectTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER2:
				return createCellProtectTypeMember2FromString(eDataType, initialValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER2_BASE:
				return createCellProtectTypeMember2BaseFromString(eDataType, initialValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER2_BASE_ITEM_OBJECT:
				return createCellProtectTypeMember2BaseItemObjectFromString(eDataType, initialValue);
			case StylePackage.DATA_STYLE_NAME_TYPE:
				return createDataStyleNameTypeFromString(eDataType, initialValue);
			case StylePackage.DATA_STYLE_NAME_TYPE_MEMBER1:
				return createDataStyleNameTypeMember1FromString(eDataType, initialValue);
			case StylePackage.DIRECTION_TYPE_OBJECT:
				return createDirectionTypeObjectFromString(eDataType, initialValue);
			case StylePackage.FAMILY_TYPE_OBJECT:
				return createFamilyTypeObjectFromString(eDataType, initialValue);
			case StylePackage.FIRST_PAGE_NUMBER_TYPE:
				return createFirstPageNumberTypeFromString(eDataType, initialValue);
			case StylePackage.FIRST_PAGE_NUMBER_TYPE_MEMBER1_OBJECT:
				return createFirstPageNumberTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.FONT_RELIEF_TYPE_OBJECT:
				return createFontReliefTypeObjectFromString(eDataType, initialValue);
			case StylePackage.FONT_SIZE_ASIAN_TYPE:
				return createFontSizeAsianTypeFromString(eDataType, initialValue);
			case StylePackage.FONT_SIZE_COMPLEX_TYPE:
				return createFontSizeComplexTypeFromString(eDataType, initialValue);
			case StylePackage.GLYPH_ORIENTATION_VERTICAL_TYPE_OBJECT:
				return createGlyphOrientationVerticalTypeObjectFromString(eDataType, initialValue);
			case StylePackage.HORIZONTAL_POS_TYPE_OBJECT:
				return createHorizontalPosTypeObjectFromString(eDataType, initialValue);
			case StylePackage.HORIZONTAL_REL_TYPE_OBJECT:
				return createHorizontalRelTypeObjectFromString(eDataType, initialValue);
			case StylePackage.LAYOUT_GRID_MODE_TYPE_OBJECT:
				return createLayoutGridModeTypeObjectFromString(eDataType, initialValue);
			case StylePackage.LEADER_COLOR_TYPE:
				return createLeaderColorTypeFromString(eDataType, initialValue);
			case StylePackage.LEADER_COLOR_TYPE_MEMBER1_OBJECT:
				return createLeaderColorTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.LEADER_TEXT_STYLE_TYPE:
				return createLeaderTextStyleTypeFromString(eDataType, initialValue);
			case StylePackage.LEADER_TEXT_STYLE_TYPE_MEMBER1:
				return createLeaderTextStyleTypeMember1FromString(eDataType, initialValue);
			case StylePackage.LEGEND_EXPANSION_TYPE_OBJECT:
				return createLegendExpansionTypeObjectFromString(eDataType, initialValue);
			case StylePackage.LENGTH_TYPE:
				return createLengthTypeFromString(eDataType, initialValue);
			case StylePackage.LENGTH_TYPE_MEMBER1_OBJECT:
				return createLengthTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.LINE_BREAK_TYPE_OBJECT:
				return createLineBreakTypeObjectFromString(eDataType, initialValue);
			case StylePackage.LIST_STYLE_NAME_TYPE:
				return createListStyleNameTypeFromString(eDataType, initialValue);
			case StylePackage.LIST_STYLE_NAME_TYPE_MEMBER1:
				return createListStyleNameTypeMember1FromString(eDataType, initialValue);
			case StylePackage.MASTER_PAGE_NAME_TYPE:
				return createMasterPageNameTypeFromString(eDataType, initialValue);
			case StylePackage.MASTER_PAGE_NAME_TYPE_MEMBER1:
				return createMasterPageNameTypeMember1FromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE:
				return createMirrorTypeFromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER1_OBJECT:
				return createMirrorTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER2_OBJECT:
				return createMirrorTypeMember2ObjectFromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER3:
				return createMirrorTypeMember3FromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER3_BASE:
				return createMirrorTypeMember3BaseFromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER3_BASE_ITEM:
				return createMirrorTypeMember3BaseItemFromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER3_BASE_ITEM_MEMBER1_OBJECT:
				return createMirrorTypeMember3BaseItemMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER4:
				return createMirrorTypeMember4FromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER4_BASE:
				return createMirrorTypeMember4BaseFromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER4_BASE_ITEM:
				return createMirrorTypeMember4BaseItemFromString(eDataType, initialValue);
			case StylePackage.MIRROR_TYPE_MEMBER4_BASE_ITEM_MEMBER1_OBJECT:
				return createMirrorTypeMember4BaseItemMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.NEXT_STYLE_NAME_TYPE:
				return createNextStyleNameTypeFromString(eDataType, initialValue);
			case StylePackage.NEXT_STYLE_NAME_TYPE_MEMBER1:
				return createNextStyleNameTypeMember1FromString(eDataType, initialValue);
			case StylePackage.NUMBER_WRAPPED_PARAGRAPHS_TYPE:
				return createNumberWrappedParagraphsTypeFromString(eDataType, initialValue);
			case StylePackage.NUMBER_WRAPPED_PARAGRAPHS_TYPE_MEMBER1_OBJECT:
				return createNumberWrappedParagraphsTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.NUM_FORMAT_TYPE:
				return createNumFormatTypeFromString(eDataType, initialValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0:
				return createNumFormatTypeMember0FromString(eDataType, initialValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0:
				return createNumFormatTypeMember0Member0FromString(eDataType, initialValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER1_OBJECT:
				return createNumFormatTypeMember0Member0Member1ObjectFromString(eDataType, initialValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER2_OBJECT:
				return createNumFormatTypeMember0Member0Member2ObjectFromString(eDataType, initialValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER3_OBJECT:
				return createNumFormatTypeMember0Member0Member3ObjectFromString(eDataType, initialValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER1:
				return createNumFormatTypeMember0Member1FromString(eDataType, initialValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER1_OBJECT:
				return createNumFormatTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.OVERFLOW_BEHAVIOR_TYPE_OBJECT:
				return createOverflowBehaviorTypeObjectFromString(eDataType, initialValue);
			case StylePackage.PAGE_LAYOUT_NAME_TYPE:
				return createPageLayoutNameTypeFromString(eDataType, initialValue);
			case StylePackage.PAGE_LAYOUT_NAME_TYPE_MEMBER1:
				return createPageLayoutNameTypeMember1FromString(eDataType, initialValue);
			case StylePackage.PAGE_NUMBER_TYPE:
				return createPageNumberTypeFromString(eDataType, initialValue);
			case StylePackage.PAGE_NUMBER_TYPE_MEMBER1_OBJECT:
				return createPageNumberTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.PAGE_USAGE_TYPE_OBJECT:
				return createPageUsageTypeObjectFromString(eDataType, initialValue);
			case StylePackage.PAPER_TRAY_NAME_TYPE:
				return createPaperTrayNameTypeFromString(eDataType, initialValue);
			case StylePackage.PAPER_TRAY_NAME_TYPE_MEMBER1_OBJECT:
				return createPaperTrayNameTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.PARENT_STYLE_NAME_TYPE:
				return createParentStyleNameTypeFromString(eDataType, initialValue);
			case StylePackage.PARENT_STYLE_NAME_TYPE_MEMBER1:
				return createParentStyleNameTypeMember1FromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE:
				return createPositionTypeFromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER0_OBJECT:
				return createPositionTypeMember0ObjectFromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER1_OBJECT:
				return createPositionTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER2_OBJECT:
				return createPositionTypeMember2ObjectFromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER3_OBJECT:
				return createPositionTypeMember3ObjectFromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER4_OBJECT:
				return createPositionTypeMember4ObjectFromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER5:
				return createPositionTypeMember5FromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER5_BASE:
				return createPositionTypeMember5BaseFromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER5_BASE_ITEM:
				return createPositionTypeMember5BaseItemFromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER6:
				return createPositionTypeMember6FromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER6_BASE:
				return createPositionTypeMember6BaseFromString(eDataType, initialValue);
			case StylePackage.POSITION_TYPE_MEMBER6_BASE_ITEM:
				return createPositionTypeMember6BaseItemFromString(eDataType, initialValue);
			case StylePackage.PRINT_ORIENTATION_TYPE_OBJECT:
				return createPrintOrientationTypeObjectFromString(eDataType, initialValue);
			case StylePackage.PRINT_PAGE_ORDER_TYPE_OBJECT:
				return createPrintPageOrderTypeObjectFromString(eDataType, initialValue);
			case StylePackage.PRINT_TYPE:
				return createPrintTypeFromString(eDataType, initialValue);
			case StylePackage.PRINT_TYPE_ITEM_OBJECT:
				return createPrintTypeItemObjectFromString(eDataType, initialValue);
			case StylePackage.PUNCTUATION_WRAP_TYPE_OBJECT:
				return createPunctuationWrapTypeObjectFromString(eDataType, initialValue);
			case StylePackage.REGISTER_TRUTH_REF_STYLE_NAME_TYPE:
				return createRegisterTruthRefStyleNameTypeFromString(eDataType, initialValue);
			case StylePackage.REGISTER_TRUTH_REF_STYLE_NAME_TYPE_MEMBER1:
				return createRegisterTruthRefStyleNameTypeMember1FromString(eDataType, initialValue);
			case StylePackage.REL_HEIGHT_TYPE:
				return createRelHeightTypeFromString(eDataType, initialValue);
			case StylePackage.REL_HEIGHT_TYPE_MEMBER1_OBJECT:
				return createRelHeightTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.REL_HEIGHT_TYPE_MEMBER2_OBJECT:
				return createRelHeightTypeMember2ObjectFromString(eDataType, initialValue);
			case StylePackage.REL_WIDTH_TYPE:
				return createRelWidthTypeFromString(eDataType, initialValue);
			case StylePackage.REL_WIDTH_TYPE_MEMBER1_OBJECT:
				return createRelWidthTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.REL_WIDTH_TYPE_MEMBER2_OBJECT:
				return createRelWidthTypeMember2ObjectFromString(eDataType, initialValue);
			case StylePackage.REPEAT_TYPE_OBJECT:
				return createRepeatTypeObjectFromString(eDataType, initialValue);
			case StylePackage.ROTATION_ALIGN_TYPE_OBJECT:
				return createRotationAlignTypeObjectFromString(eDataType, initialValue);
			case StylePackage.RUBY_ALIGN_TYPE_OBJECT:
				return createRubyAlignTypeObjectFromString(eDataType, initialValue);
			case StylePackage.RUBY_POSITION_TYPE_OBJECT:
				return createRubyPositionTypeObjectFromString(eDataType, initialValue);
			case StylePackage.RUN_THROUGH_TYPE_OBJECT:
				return createRunThroughTypeObjectFromString(eDataType, initialValue);
			case StylePackage.SCRIPT_TYPE_TYPE_OBJECT:
				return createScriptTypeTypeObjectFromString(eDataType, initialValue);
			case StylePackage.STYLE_NAME_TYPE:
				return createStyleNameTypeFromString(eDataType, initialValue);
			case StylePackage.STYLE_NAME_TYPE_MEMBER1:
				return createStyleNameTypeMember1FromString(eDataType, initialValue);
			case StylePackage.STYLE_TYPE_OBJECT:
				return createStyleTypeObjectFromString(eDataType, initialValue);
			case StylePackage.TEXT_AUTOSPACE_TYPE_OBJECT:
				return createTextAutospaceTypeObjectFromString(eDataType, initialValue);
			case StylePackage.TEXT_COMBINE_TYPE_OBJECT:
				return createTextCombineTypeObjectFromString(eDataType, initialValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE:
				return createTextEmphasizeTypeFromString(eDataType, initialValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER0_OBJECT:
				return createTextEmphasizeTypeMember0ObjectFromString(eDataType, initialValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER1:
				return createTextEmphasizeTypeMember1FromString(eDataType, initialValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER1_BASE:
				return createTextEmphasizeTypeMember1BaseFromString(eDataType, initialValue);
			case StylePackage.TEXT_LINE_THROUGH_COLOR_TYPE:
				return createTextLineThroughColorTypeFromString(eDataType, initialValue);
			case StylePackage.TEXT_LINE_THROUGH_COLOR_TYPE_MEMBER1_OBJECT:
				return createTextLineThroughColorTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.TEXT_LINE_THROUGH_TEXT_STYLE_TYPE:
				return createTextLineThroughTextStyleTypeFromString(eDataType, initialValue);
			case StylePackage.TEXT_LINE_THROUGH_TEXT_STYLE_TYPE_MEMBER1:
				return createTextLineThroughTextStyleTypeMember1FromString(eDataType, initialValue);
			case StylePackage.TEXT_POSITION_TYPE:
				return createTextPositionTypeFromString(eDataType, initialValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE:
				return createTextPositionTypeBaseFromString(eDataType, initialValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM:
				return createTextPositionTypeBaseItemFromString(eDataType, initialValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1:
				return createTextPositionTypeBaseItemMember1FromString(eDataType, initialValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER1_OBJECT:
				return createTextPositionTypeBaseItemMember1Member1ObjectFromString(eDataType, initialValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER2_OBJECT:
				return createTextPositionTypeBaseItemMember1Member2ObjectFromString(eDataType, initialValue);
			case StylePackage.TEXT_ROTATION_SCALE_TYPE_OBJECT:
				return createTextRotationScaleTypeObjectFromString(eDataType, initialValue);
			case StylePackage.TEXT_UNDERLINE_COLOR_TYPE_MEMBER1_OBJECT:
				return createTextUnderlineColorTypeMember1ObjectFromString(eDataType, initialValue);
			case StylePackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case StylePackage.TABLE_CENTERING_TYPE_OBJECT:
				return createTableCenteringTypeObjectFromString(eDataType, initialValue);
			case StylePackage.TEXT_ALIGN_SOURCE_TYPE_OBJECT:
				return createTextAlignSourceTypeObjectFromString(eDataType, initialValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER1_BASE_ITEM_OBJECT:
				return createTextEmphasizeTypeMember1BaseItemObjectFromString(eDataType, initialValue);
			case StylePackage.TEXT_UNDERLINE_COLOR_TYPE:
				return createTextUnderlineColorTypeFromString(eDataType, initialValue);
			case StylePackage.TYPE_TYPE_OBJECT1:
				return createTypeTypeObject1FromString(eDataType, initialValue);
			case StylePackage.VERTICAL_ALIGN_TYPE_OBJECT:
				return createVerticalAlignTypeObjectFromString(eDataType, initialValue);
			case StylePackage.VERTICAL_POS_TYPE_OBJECT:
				return createVerticalPosTypeObjectFromString(eDataType, initialValue);
			case StylePackage.VERTICAL_REL_TYPE_OBJECT:
				return createVerticalRelTypeObjectFromString(eDataType, initialValue);
			case StylePackage.WRAP_CONTOUR_MODE_TYPE_OBJECT:
				return createWrapContourModeTypeObjectFromString(eDataType, initialValue);
			case StylePackage.WRAP_TYPE_OBJECT:
				return createWrapTypeObjectFromString(eDataType, initialValue);
			case StylePackage.WRITING_MODE_TYPE_OBJECT:
				return createWritingModeTypeObjectFromString(eDataType, initialValue);
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
			case StylePackage.ADJUSTMENT_TYPE:
				return convertAdjustmentTypeToString(eDataType, instanceValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER0:
				return convertCellProtectTypeMember0ToString(eDataType, instanceValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER1:
				return convertCellProtectTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER2_BASE_ITEM:
				return convertCellProtectTypeMember2BaseItemToString(eDataType, instanceValue);
			case StylePackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case StylePackage.FAMILY_TYPE:
				return convertFamilyTypeToString(eDataType, instanceValue);
			case StylePackage.FIRST_PAGE_NUMBER_TYPE_MEMBER1:
				return convertFirstPageNumberTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.FONT_RELIEF_TYPE:
				return convertFontReliefTypeToString(eDataType, instanceValue);
			case StylePackage.GLYPH_ORIENTATION_VERTICAL_TYPE:
				return convertGlyphOrientationVerticalTypeToString(eDataType, instanceValue);
			case StylePackage.HORIZONTAL_POS_TYPE:
				return convertHorizontalPosTypeToString(eDataType, instanceValue);
			case StylePackage.HORIZONTAL_REL_TYPE:
				return convertHorizontalRelTypeToString(eDataType, instanceValue);
			case StylePackage.LAYOUT_GRID_MODE_TYPE:
				return convertLayoutGridModeTypeToString(eDataType, instanceValue);
			case StylePackage.LEADER_COLOR_TYPE_MEMBER1:
				return convertLeaderColorTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.LEGEND_EXPANSION_TYPE:
				return convertLegendExpansionTypeToString(eDataType, instanceValue);
			case StylePackage.LENGTH_TYPE_MEMBER1:
				return convertLengthTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.LINE_BREAK_TYPE:
				return convertLineBreakTypeToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER1:
				return convertMirrorTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER2:
				return convertMirrorTypeMember2ToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER3_BASE_ITEM_MEMBER1:
				return convertMirrorTypeMember3BaseItemMember1ToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER4_BASE_ITEM_MEMBER1:
				return convertMirrorTypeMember4BaseItemMember1ToString(eDataType, instanceValue);
			case StylePackage.NUMBER_WRAPPED_PARAGRAPHS_TYPE_MEMBER1:
				return convertNumberWrappedParagraphsTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER1:
				return convertNumFormatTypeMember0Member0Member1ToString(eDataType, instanceValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER2:
				return convertNumFormatTypeMember0Member0Member2ToString(eDataType, instanceValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER3:
				return convertNumFormatTypeMember0Member0Member3ToString(eDataType, instanceValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER1:
				return convertNumFormatTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.OVERFLOW_BEHAVIOR_TYPE:
				return convertOverflowBehaviorTypeToString(eDataType, instanceValue);
			case StylePackage.PAGE_NUMBER_TYPE_MEMBER1:
				return convertPageNumberTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.PAGE_USAGE_TYPE:
				return convertPageUsageTypeToString(eDataType, instanceValue);
			case StylePackage.PAPER_TRAY_NAME_TYPE_MEMBER1:
				return convertPaperTrayNameTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER0:
				return convertPositionTypeMember0ToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER1:
				return convertPositionTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER2:
				return convertPositionTypeMember2ToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER3:
				return convertPositionTypeMember3ToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER4:
				return convertPositionTypeMember4ToString(eDataType, instanceValue);
			case StylePackage.PRINT_ORIENTATION_TYPE:
				return convertPrintOrientationTypeToString(eDataType, instanceValue);
			case StylePackage.PRINT_PAGE_ORDER_TYPE:
				return convertPrintPageOrderTypeToString(eDataType, instanceValue);
			case StylePackage.PRINT_TYPE_ITEM:
				return convertPrintTypeItemToString(eDataType, instanceValue);
			case StylePackage.PUNCTUATION_WRAP_TYPE:
				return convertPunctuationWrapTypeToString(eDataType, instanceValue);
			case StylePackage.REL_HEIGHT_TYPE_MEMBER1:
				return convertRelHeightTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.REL_HEIGHT_TYPE_MEMBER2:
				return convertRelHeightTypeMember2ToString(eDataType, instanceValue);
			case StylePackage.REL_WIDTH_TYPE_MEMBER1:
				return convertRelWidthTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.REL_WIDTH_TYPE_MEMBER2:
				return convertRelWidthTypeMember2ToString(eDataType, instanceValue);
			case StylePackage.REPEAT_TYPE:
				return convertRepeatTypeToString(eDataType, instanceValue);
			case StylePackage.ROTATION_ALIGN_TYPE:
				return convertRotationAlignTypeToString(eDataType, instanceValue);
			case StylePackage.RUBY_ALIGN_TYPE:
				return convertRubyAlignTypeToString(eDataType, instanceValue);
			case StylePackage.RUBY_POSITION_TYPE:
				return convertRubyPositionTypeToString(eDataType, instanceValue);
			case StylePackage.RUN_THROUGH_TYPE:
				return convertRunThroughTypeToString(eDataType, instanceValue);
			case StylePackage.SCRIPT_TYPE_TYPE:
				return convertScriptTypeTypeToString(eDataType, instanceValue);
			case StylePackage.STYLE_TYPE:
				return convertStyleTypeToString(eDataType, instanceValue);
			case StylePackage.TEXT_AUTOSPACE_TYPE:
				return convertTextAutospaceTypeToString(eDataType, instanceValue);
			case StylePackage.TEXT_COMBINE_TYPE:
				return convertTextCombineTypeToString(eDataType, instanceValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER0:
				return convertTextEmphasizeTypeMember0ToString(eDataType, instanceValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER1_BASE_ITEM:
				return convertTextEmphasizeTypeMember1BaseItemToString(eDataType, instanceValue);
			case StylePackage.TEXT_LINE_THROUGH_COLOR_TYPE_MEMBER1:
				return convertTextLineThroughColorTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER1:
				return convertTextPositionTypeBaseItemMember1Member1ToString(eDataType, instanceValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER2:
				return convertTextPositionTypeBaseItemMember1Member2ToString(eDataType, instanceValue);
			case StylePackage.TEXT_ROTATION_SCALE_TYPE:
				return convertTextRotationScaleTypeToString(eDataType, instanceValue);
			case StylePackage.TEXT_UNDERLINE_COLOR_TYPE_MEMBER1:
				return convertTextUnderlineColorTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case StylePackage.TABLE_CENTERING_TYPE:
				return convertTableCenteringTypeToString(eDataType, instanceValue);
			case StylePackage.TEXT_ALIGN_SOURCE_TYPE:
				return convertTextAlignSourceTypeToString(eDataType, instanceValue);
			case StylePackage.TYPE_TYPE1:
				return convertTypeType1ToString(eDataType, instanceValue);
			case StylePackage.VERTICAL_ALIGN_TYPE:
				return convertVerticalAlignTypeToString(eDataType, instanceValue);
			case StylePackage.VERTICAL_POS_TYPE:
				return convertVerticalPosTypeToString(eDataType, instanceValue);
			case StylePackage.VERTICAL_REL_TYPE:
				return convertVerticalRelTypeToString(eDataType, instanceValue);
			case StylePackage.WRAP_CONTOUR_MODE_TYPE:
				return convertWrapContourModeTypeToString(eDataType, instanceValue);
			case StylePackage.WRAP_TYPE:
				return convertWrapTypeToString(eDataType, instanceValue);
			case StylePackage.WRITING_MODE_TYPE:
				return convertWritingModeTypeToString(eDataType, instanceValue);
			case StylePackage.ADJUSTMENT_TYPE_OBJECT:
				return convertAdjustmentTypeObjectToString(eDataType, instanceValue);
			case StylePackage.APPLY_STYLE_NAME_TYPE:
				return convertApplyStyleNameTypeToString(eDataType, instanceValue);
			case StylePackage.APPLY_STYLE_NAME_TYPE_MEMBER1:
				return convertApplyStyleNameTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.CELL_PROTECT_TYPE:
				return convertCellProtectTypeToString(eDataType, instanceValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER0_OBJECT:
				return convertCellProtectTypeMember0ObjectToString(eDataType, instanceValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER1_OBJECT:
				return convertCellProtectTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER2:
				return convertCellProtectTypeMember2ToString(eDataType, instanceValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER2_BASE:
				return convertCellProtectTypeMember2BaseToString(eDataType, instanceValue);
			case StylePackage.CELL_PROTECT_TYPE_MEMBER2_BASE_ITEM_OBJECT:
				return convertCellProtectTypeMember2BaseItemObjectToString(eDataType, instanceValue);
			case StylePackage.DATA_STYLE_NAME_TYPE:
				return convertDataStyleNameTypeToString(eDataType, instanceValue);
			case StylePackage.DATA_STYLE_NAME_TYPE_MEMBER1:
				return convertDataStyleNameTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.DIRECTION_TYPE_OBJECT:
				return convertDirectionTypeObjectToString(eDataType, instanceValue);
			case StylePackage.FAMILY_TYPE_OBJECT:
				return convertFamilyTypeObjectToString(eDataType, instanceValue);
			case StylePackage.FIRST_PAGE_NUMBER_TYPE:
				return convertFirstPageNumberTypeToString(eDataType, instanceValue);
			case StylePackage.FIRST_PAGE_NUMBER_TYPE_MEMBER1_OBJECT:
				return convertFirstPageNumberTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.FONT_RELIEF_TYPE_OBJECT:
				return convertFontReliefTypeObjectToString(eDataType, instanceValue);
			case StylePackage.FONT_SIZE_ASIAN_TYPE:
				return convertFontSizeAsianTypeToString(eDataType, instanceValue);
			case StylePackage.FONT_SIZE_COMPLEX_TYPE:
				return convertFontSizeComplexTypeToString(eDataType, instanceValue);
			case StylePackage.GLYPH_ORIENTATION_VERTICAL_TYPE_OBJECT:
				return convertGlyphOrientationVerticalTypeObjectToString(eDataType, instanceValue);
			case StylePackage.HORIZONTAL_POS_TYPE_OBJECT:
				return convertHorizontalPosTypeObjectToString(eDataType, instanceValue);
			case StylePackage.HORIZONTAL_REL_TYPE_OBJECT:
				return convertHorizontalRelTypeObjectToString(eDataType, instanceValue);
			case StylePackage.LAYOUT_GRID_MODE_TYPE_OBJECT:
				return convertLayoutGridModeTypeObjectToString(eDataType, instanceValue);
			case StylePackage.LEADER_COLOR_TYPE:
				return convertLeaderColorTypeToString(eDataType, instanceValue);
			case StylePackage.LEADER_COLOR_TYPE_MEMBER1_OBJECT:
				return convertLeaderColorTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.LEADER_TEXT_STYLE_TYPE:
				return convertLeaderTextStyleTypeToString(eDataType, instanceValue);
			case StylePackage.LEADER_TEXT_STYLE_TYPE_MEMBER1:
				return convertLeaderTextStyleTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.LEGEND_EXPANSION_TYPE_OBJECT:
				return convertLegendExpansionTypeObjectToString(eDataType, instanceValue);
			case StylePackage.LENGTH_TYPE:
				return convertLengthTypeToString(eDataType, instanceValue);
			case StylePackage.LENGTH_TYPE_MEMBER1_OBJECT:
				return convertLengthTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.LINE_BREAK_TYPE_OBJECT:
				return convertLineBreakTypeObjectToString(eDataType, instanceValue);
			case StylePackage.LIST_STYLE_NAME_TYPE:
				return convertListStyleNameTypeToString(eDataType, instanceValue);
			case StylePackage.LIST_STYLE_NAME_TYPE_MEMBER1:
				return convertListStyleNameTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.MASTER_PAGE_NAME_TYPE:
				return convertMasterPageNameTypeToString(eDataType, instanceValue);
			case StylePackage.MASTER_PAGE_NAME_TYPE_MEMBER1:
				return convertMasterPageNameTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE:
				return convertMirrorTypeToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER1_OBJECT:
				return convertMirrorTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER2_OBJECT:
				return convertMirrorTypeMember2ObjectToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER3:
				return convertMirrorTypeMember3ToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER3_BASE:
				return convertMirrorTypeMember3BaseToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER3_BASE_ITEM:
				return convertMirrorTypeMember3BaseItemToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER3_BASE_ITEM_MEMBER1_OBJECT:
				return convertMirrorTypeMember3BaseItemMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER4:
				return convertMirrorTypeMember4ToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER4_BASE:
				return convertMirrorTypeMember4BaseToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER4_BASE_ITEM:
				return convertMirrorTypeMember4BaseItemToString(eDataType, instanceValue);
			case StylePackage.MIRROR_TYPE_MEMBER4_BASE_ITEM_MEMBER1_OBJECT:
				return convertMirrorTypeMember4BaseItemMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.NEXT_STYLE_NAME_TYPE:
				return convertNextStyleNameTypeToString(eDataType, instanceValue);
			case StylePackage.NEXT_STYLE_NAME_TYPE_MEMBER1:
				return convertNextStyleNameTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.NUMBER_WRAPPED_PARAGRAPHS_TYPE:
				return convertNumberWrappedParagraphsTypeToString(eDataType, instanceValue);
			case StylePackage.NUMBER_WRAPPED_PARAGRAPHS_TYPE_MEMBER1_OBJECT:
				return convertNumberWrappedParagraphsTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.NUM_FORMAT_TYPE:
				return convertNumFormatTypeToString(eDataType, instanceValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0:
				return convertNumFormatTypeMember0ToString(eDataType, instanceValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0:
				return convertNumFormatTypeMember0Member0ToString(eDataType, instanceValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER1_OBJECT:
				return convertNumFormatTypeMember0Member0Member1ObjectToString(eDataType, instanceValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER2_OBJECT:
				return convertNumFormatTypeMember0Member0Member2ObjectToString(eDataType, instanceValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER0_MEMBER3_OBJECT:
				return convertNumFormatTypeMember0Member0Member3ObjectToString(eDataType, instanceValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER0_MEMBER1:
				return convertNumFormatTypeMember0Member1ToString(eDataType, instanceValue);
			case StylePackage.NUM_FORMAT_TYPE_MEMBER1_OBJECT:
				return convertNumFormatTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.OVERFLOW_BEHAVIOR_TYPE_OBJECT:
				return convertOverflowBehaviorTypeObjectToString(eDataType, instanceValue);
			case StylePackage.PAGE_LAYOUT_NAME_TYPE:
				return convertPageLayoutNameTypeToString(eDataType, instanceValue);
			case StylePackage.PAGE_LAYOUT_NAME_TYPE_MEMBER1:
				return convertPageLayoutNameTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.PAGE_NUMBER_TYPE:
				return convertPageNumberTypeToString(eDataType, instanceValue);
			case StylePackage.PAGE_NUMBER_TYPE_MEMBER1_OBJECT:
				return convertPageNumberTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.PAGE_USAGE_TYPE_OBJECT:
				return convertPageUsageTypeObjectToString(eDataType, instanceValue);
			case StylePackage.PAPER_TRAY_NAME_TYPE:
				return convertPaperTrayNameTypeToString(eDataType, instanceValue);
			case StylePackage.PAPER_TRAY_NAME_TYPE_MEMBER1_OBJECT:
				return convertPaperTrayNameTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.PARENT_STYLE_NAME_TYPE:
				return convertParentStyleNameTypeToString(eDataType, instanceValue);
			case StylePackage.PARENT_STYLE_NAME_TYPE_MEMBER1:
				return convertParentStyleNameTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE:
				return convertPositionTypeToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER0_OBJECT:
				return convertPositionTypeMember0ObjectToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER1_OBJECT:
				return convertPositionTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER2_OBJECT:
				return convertPositionTypeMember2ObjectToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER3_OBJECT:
				return convertPositionTypeMember3ObjectToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER4_OBJECT:
				return convertPositionTypeMember4ObjectToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER5:
				return convertPositionTypeMember5ToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER5_BASE:
				return convertPositionTypeMember5BaseToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER5_BASE_ITEM:
				return convertPositionTypeMember5BaseItemToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER6:
				return convertPositionTypeMember6ToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER6_BASE:
				return convertPositionTypeMember6BaseToString(eDataType, instanceValue);
			case StylePackage.POSITION_TYPE_MEMBER6_BASE_ITEM:
				return convertPositionTypeMember6BaseItemToString(eDataType, instanceValue);
			case StylePackage.PRINT_ORIENTATION_TYPE_OBJECT:
				return convertPrintOrientationTypeObjectToString(eDataType, instanceValue);
			case StylePackage.PRINT_PAGE_ORDER_TYPE_OBJECT:
				return convertPrintPageOrderTypeObjectToString(eDataType, instanceValue);
			case StylePackage.PRINT_TYPE:
				return convertPrintTypeToString(eDataType, instanceValue);
			case StylePackage.PRINT_TYPE_ITEM_OBJECT:
				return convertPrintTypeItemObjectToString(eDataType, instanceValue);
			case StylePackage.PUNCTUATION_WRAP_TYPE_OBJECT:
				return convertPunctuationWrapTypeObjectToString(eDataType, instanceValue);
			case StylePackage.REGISTER_TRUTH_REF_STYLE_NAME_TYPE:
				return convertRegisterTruthRefStyleNameTypeToString(eDataType, instanceValue);
			case StylePackage.REGISTER_TRUTH_REF_STYLE_NAME_TYPE_MEMBER1:
				return convertRegisterTruthRefStyleNameTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.REL_HEIGHT_TYPE:
				return convertRelHeightTypeToString(eDataType, instanceValue);
			case StylePackage.REL_HEIGHT_TYPE_MEMBER1_OBJECT:
				return convertRelHeightTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.REL_HEIGHT_TYPE_MEMBER2_OBJECT:
				return convertRelHeightTypeMember2ObjectToString(eDataType, instanceValue);
			case StylePackage.REL_WIDTH_TYPE:
				return convertRelWidthTypeToString(eDataType, instanceValue);
			case StylePackage.REL_WIDTH_TYPE_MEMBER1_OBJECT:
				return convertRelWidthTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.REL_WIDTH_TYPE_MEMBER2_OBJECT:
				return convertRelWidthTypeMember2ObjectToString(eDataType, instanceValue);
			case StylePackage.REPEAT_TYPE_OBJECT:
				return convertRepeatTypeObjectToString(eDataType, instanceValue);
			case StylePackage.ROTATION_ALIGN_TYPE_OBJECT:
				return convertRotationAlignTypeObjectToString(eDataType, instanceValue);
			case StylePackage.RUBY_ALIGN_TYPE_OBJECT:
				return convertRubyAlignTypeObjectToString(eDataType, instanceValue);
			case StylePackage.RUBY_POSITION_TYPE_OBJECT:
				return convertRubyPositionTypeObjectToString(eDataType, instanceValue);
			case StylePackage.RUN_THROUGH_TYPE_OBJECT:
				return convertRunThroughTypeObjectToString(eDataType, instanceValue);
			case StylePackage.SCRIPT_TYPE_TYPE_OBJECT:
				return convertScriptTypeTypeObjectToString(eDataType, instanceValue);
			case StylePackage.STYLE_NAME_TYPE:
				return convertStyleNameTypeToString(eDataType, instanceValue);
			case StylePackage.STYLE_NAME_TYPE_MEMBER1:
				return convertStyleNameTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.STYLE_TYPE_OBJECT:
				return convertStyleTypeObjectToString(eDataType, instanceValue);
			case StylePackage.TEXT_AUTOSPACE_TYPE_OBJECT:
				return convertTextAutospaceTypeObjectToString(eDataType, instanceValue);
			case StylePackage.TEXT_COMBINE_TYPE_OBJECT:
				return convertTextCombineTypeObjectToString(eDataType, instanceValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE:
				return convertTextEmphasizeTypeToString(eDataType, instanceValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER0_OBJECT:
				return convertTextEmphasizeTypeMember0ObjectToString(eDataType, instanceValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER1:
				return convertTextEmphasizeTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER1_BASE:
				return convertTextEmphasizeTypeMember1BaseToString(eDataType, instanceValue);
			case StylePackage.TEXT_LINE_THROUGH_COLOR_TYPE:
				return convertTextLineThroughColorTypeToString(eDataType, instanceValue);
			case StylePackage.TEXT_LINE_THROUGH_COLOR_TYPE_MEMBER1_OBJECT:
				return convertTextLineThroughColorTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.TEXT_LINE_THROUGH_TEXT_STYLE_TYPE:
				return convertTextLineThroughTextStyleTypeToString(eDataType, instanceValue);
			case StylePackage.TEXT_LINE_THROUGH_TEXT_STYLE_TYPE_MEMBER1:
				return convertTextLineThroughTextStyleTypeMember1ToString(eDataType, instanceValue);
			case StylePackage.TEXT_POSITION_TYPE:
				return convertTextPositionTypeToString(eDataType, instanceValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE:
				return convertTextPositionTypeBaseToString(eDataType, instanceValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM:
				return convertTextPositionTypeBaseItemToString(eDataType, instanceValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1:
				return convertTextPositionTypeBaseItemMember1ToString(eDataType, instanceValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER1_OBJECT:
				return convertTextPositionTypeBaseItemMember1Member1ObjectToString(eDataType, instanceValue);
			case StylePackage.TEXT_POSITION_TYPE_BASE_ITEM_MEMBER1_MEMBER2_OBJECT:
				return convertTextPositionTypeBaseItemMember1Member2ObjectToString(eDataType, instanceValue);
			case StylePackage.TEXT_ROTATION_SCALE_TYPE_OBJECT:
				return convertTextRotationScaleTypeObjectToString(eDataType, instanceValue);
			case StylePackage.TEXT_UNDERLINE_COLOR_TYPE_MEMBER1_OBJECT:
				return convertTextUnderlineColorTypeMember1ObjectToString(eDataType, instanceValue);
			case StylePackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case StylePackage.TABLE_CENTERING_TYPE_OBJECT:
				return convertTableCenteringTypeObjectToString(eDataType, instanceValue);
			case StylePackage.TEXT_ALIGN_SOURCE_TYPE_OBJECT:
				return convertTextAlignSourceTypeObjectToString(eDataType, instanceValue);
			case StylePackage.TEXT_EMPHASIZE_TYPE_MEMBER1_BASE_ITEM_OBJECT:
				return convertTextEmphasizeTypeMember1BaseItemObjectToString(eDataType, instanceValue);
			case StylePackage.TEXT_UNDERLINE_COLOR_TYPE:
				return convertTextUnderlineColorTypeToString(eDataType, instanceValue);
			case StylePackage.TYPE_TYPE_OBJECT1:
				return convertTypeTypeObject1ToString(eDataType, instanceValue);
			case StylePackage.VERTICAL_ALIGN_TYPE_OBJECT:
				return convertVerticalAlignTypeObjectToString(eDataType, instanceValue);
			case StylePackage.VERTICAL_POS_TYPE_OBJECT:
				return convertVerticalPosTypeObjectToString(eDataType, instanceValue);
			case StylePackage.VERTICAL_REL_TYPE_OBJECT:
				return convertVerticalRelTypeObjectToString(eDataType, instanceValue);
			case StylePackage.WRAP_CONTOUR_MODE_TYPE_OBJECT:
				return convertWrapContourModeTypeObjectToString(eDataType, instanceValue);
			case StylePackage.WRAP_TYPE_OBJECT:
				return convertWrapTypeObjectToString(eDataType, instanceValue);
			case StylePackage.WRITING_MODE_TYPE_OBJECT:
				return convertWritingModeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundImageType createBackgroundImageType() {
		BackgroundImageTypeImpl backgroundImageType = new BackgroundImageTypeImpl();
		return backgroundImageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnSepType createColumnSepType() {
		ColumnSepTypeImpl columnSepType = new ColumnSepTypeImpl();
		return columnSepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsType createColumnsType() {
		ColumnsTypeImpl columnsType = new ColumnsTypeImpl();
		return columnsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType createColumnType() {
		ColumnTypeImpl columnType = new ColumnTypeImpl();
		return columnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropCapType createDropCapType() {
		DropCapTypeImpl dropCapType = new DropCapTypeImpl();
		return dropCapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceType createFontFaceType() {
		FontFaceTypeImpl fontFaceType = new FontFaceTypeImpl();
		return fontFaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterLeftType createFooterLeftType() {
		FooterLeftTypeImpl footerLeftType = new FooterLeftTypeImpl();
		return footerLeftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterStyleType createFooterStyleType() {
		FooterStyleTypeImpl footerStyleType = new FooterStyleTypeImpl();
		return footerStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterType createFooterType() {
		FooterTypeImpl footerType = new FooterTypeImpl();
		return footerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootnoteSepType createFootnoteSepType() {
		FootnoteSepTypeImpl footnoteSepType = new FootnoteSepTypeImpl();
		return footnoteSepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandoutMasterType createHandoutMasterType() {
		HandoutMasterTypeImpl handoutMasterType = new HandoutMasterTypeImpl();
		return handoutMasterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderLeftType createHeaderLeftType() {
		HeaderLeftTypeImpl headerLeftType = new HeaderLeftTypeImpl();
		return headerLeftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderStyleType createHeaderStyleType() {
		HeaderStyleTypeImpl headerStyleType = new HeaderStyleTypeImpl();
		return headerStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType createHeaderType() {
		HeaderTypeImpl headerType = new HeaderTypeImpl();
		return headerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType createMapType() {
		MapTypeImpl mapType = new MapTypeImpl();
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterPageType createMasterPageType() {
		MasterPageTypeImpl masterPageType = new MasterPageTypeImpl();
		return masterPageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageLayoutType createPageLayoutType() {
		PageLayoutTypeImpl pageLayoutType = new PageLayoutTypeImpl();
		return pageLayoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationPageLayoutType createPresentationPageLayoutType() {
		PresentationPageLayoutTypeImpl presentationPageLayoutType = new PresentationPageLayoutTypeImpl();
		return presentationPageLayoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType1 createStyleType1() {
		StyleType1Impl styleType1 = new StyleType1Impl();
		return styleType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabStopsType createTabStopsType() {
		TabStopsTypeImpl tabStopsType = new TabStopsTypeImpl();
		return tabStopsType;
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
	public TabStopType createTabStopType() {
		TabStopTypeImpl tabStopType = new TabStopTypeImpl();
		return tabStopType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjustmentType createAdjustmentTypeFromString(EDataType eDataType, String initialValue) {
		AdjustmentType result = AdjustmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjustmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellProtectTypeMember0 createCellProtectTypeMember0FromString(EDataType eDataType, String initialValue) {
		CellProtectTypeMember0 result = CellProtectTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellProtectTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellProtectTypeMember1 createCellProtectTypeMember1FromString(EDataType eDataType, String initialValue) {
		CellProtectTypeMember1 result = CellProtectTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellProtectTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellProtectTypeMember2BaseItem createCellProtectTypeMember2BaseItemFromString(EDataType eDataType, String initialValue) {
		CellProtectTypeMember2BaseItem result = CellProtectTypeMember2BaseItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellProtectTypeMember2BaseItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyType createFamilyTypeFromString(EDataType eDataType, String initialValue) {
		FamilyType result = FamilyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstPageNumberTypeMember1 createFirstPageNumberTypeMember1FromString(EDataType eDataType, String initialValue) {
		FirstPageNumberTypeMember1 result = FirstPageNumberTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFirstPageNumberTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontReliefType createFontReliefTypeFromString(EDataType eDataType, String initialValue) {
		FontReliefType result = FontReliefType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontReliefTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlyphOrientationVerticalType createGlyphOrientationVerticalTypeFromString(EDataType eDataType, String initialValue) {
		GlyphOrientationVerticalType result = GlyphOrientationVerticalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlyphOrientationVerticalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalPosType createHorizontalPosTypeFromString(EDataType eDataType, String initialValue) {
		HorizontalPosType result = HorizontalPosType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHorizontalPosTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalRelType createHorizontalRelTypeFromString(EDataType eDataType, String initialValue) {
		HorizontalRelType result = HorizontalRelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHorizontalRelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutGridModeType createLayoutGridModeTypeFromString(EDataType eDataType, String initialValue) {
		LayoutGridModeType result = LayoutGridModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutGridModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeaderColorTypeMember1 createLeaderColorTypeMember1FromString(EDataType eDataType, String initialValue) {
		LeaderColorTypeMember1 result = LeaderColorTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeaderColorTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendExpansionType createLegendExpansionTypeFromString(EDataType eDataType, String initialValue) {
		LegendExpansionType result = LegendExpansionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegendExpansionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthTypeMember1 createLengthTypeMember1FromString(EDataType eDataType, String initialValue) {
		LengthTypeMember1 result = LengthTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineBreakType createLineBreakTypeFromString(EDataType eDataType, String initialValue) {
		LineBreakType result = LineBreakType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineBreakTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirrorTypeMember1 createMirrorTypeMember1FromString(EDataType eDataType, String initialValue) {
		MirrorTypeMember1 result = MirrorTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMirrorTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirrorTypeMember2 createMirrorTypeMember2FromString(EDataType eDataType, String initialValue) {
		MirrorTypeMember2 result = MirrorTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMirrorTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirrorTypeMember3BaseItemMember1 createMirrorTypeMember3BaseItemMember1FromString(EDataType eDataType, String initialValue) {
		MirrorTypeMember3BaseItemMember1 result = MirrorTypeMember3BaseItemMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMirrorTypeMember3BaseItemMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirrorTypeMember4BaseItemMember1 createMirrorTypeMember4BaseItemMember1FromString(EDataType eDataType, String initialValue) {
		MirrorTypeMember4BaseItemMember1 result = MirrorTypeMember4BaseItemMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMirrorTypeMember4BaseItemMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberWrappedParagraphsTypeMember1 createNumberWrappedParagraphsTypeMember1FromString(EDataType eDataType, String initialValue) {
		NumberWrappedParagraphsTypeMember1 result = NumberWrappedParagraphsTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberWrappedParagraphsTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumFormatTypeMember0Member0Member1 createNumFormatTypeMember0Member0Member1FromString(EDataType eDataType, String initialValue) {
		NumFormatTypeMember0Member0Member1 result = NumFormatTypeMember0Member0Member1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumFormatTypeMember0Member0Member1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumFormatTypeMember0Member0Member2 createNumFormatTypeMember0Member0Member2FromString(EDataType eDataType, String initialValue) {
		NumFormatTypeMember0Member0Member2 result = NumFormatTypeMember0Member0Member2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumFormatTypeMember0Member0Member2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumFormatTypeMember0Member0Member3 createNumFormatTypeMember0Member0Member3FromString(EDataType eDataType, String initialValue) {
		NumFormatTypeMember0Member0Member3 result = NumFormatTypeMember0Member0Member3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumFormatTypeMember0Member0Member3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumFormatTypeMember1 createNumFormatTypeMember1FromString(EDataType eDataType, String initialValue) {
		NumFormatTypeMember1 result = NumFormatTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumFormatTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverflowBehaviorType createOverflowBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		OverflowBehaviorType result = OverflowBehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverflowBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageNumberTypeMember1 createPageNumberTypeMember1FromString(EDataType eDataType, String initialValue) {
		PageNumberTypeMember1 result = PageNumberTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPageNumberTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageUsageType createPageUsageTypeFromString(EDataType eDataType, String initialValue) {
		PageUsageType result = PageUsageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPageUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaperTrayNameTypeMember1 createPaperTrayNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		PaperTrayNameTypeMember1 result = PaperTrayNameTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaperTrayNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionTypeMember0 createPositionTypeMember0FromString(EDataType eDataType, String initialValue) {
		PositionTypeMember0 result = PositionTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionTypeMember1 createPositionTypeMember1FromString(EDataType eDataType, String initialValue) {
		PositionTypeMember1 result = PositionTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionTypeMember2 createPositionTypeMember2FromString(EDataType eDataType, String initialValue) {
		PositionTypeMember2 result = PositionTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionTypeMember3 createPositionTypeMember3FromString(EDataType eDataType, String initialValue) {
		PositionTypeMember3 result = PositionTypeMember3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionTypeMember4 createPositionTypeMember4FromString(EDataType eDataType, String initialValue) {
		PositionTypeMember4 result = PositionTypeMember4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintOrientationType createPrintOrientationTypeFromString(EDataType eDataType, String initialValue) {
		PrintOrientationType result = PrintOrientationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrintOrientationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintPageOrderType createPrintPageOrderTypeFromString(EDataType eDataType, String initialValue) {
		PrintPageOrderType result = PrintPageOrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrintPageOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintTypeItem createPrintTypeItemFromString(EDataType eDataType, String initialValue) {
		PrintTypeItem result = PrintTypeItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrintTypeItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PunctuationWrapType createPunctuationWrapTypeFromString(EDataType eDataType, String initialValue) {
		PunctuationWrapType result = PunctuationWrapType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPunctuationWrapTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelHeightTypeMember1 createRelHeightTypeMember1FromString(EDataType eDataType, String initialValue) {
		RelHeightTypeMember1 result = RelHeightTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelHeightTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelHeightTypeMember2 createRelHeightTypeMember2FromString(EDataType eDataType, String initialValue) {
		RelHeightTypeMember2 result = RelHeightTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelHeightTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelWidthTypeMember1 createRelWidthTypeMember1FromString(EDataType eDataType, String initialValue) {
		RelWidthTypeMember1 result = RelWidthTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelWidthTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelWidthTypeMember2 createRelWidthTypeMember2FromString(EDataType eDataType, String initialValue) {
		RelWidthTypeMember2 result = RelWidthTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelWidthTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatType createRepeatTypeFromString(EDataType eDataType, String initialValue) {
		RepeatType result = RepeatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepeatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationAlignType createRotationAlignTypeFromString(EDataType eDataType, String initialValue) {
		RotationAlignType result = RotationAlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRotationAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyAlignType createRubyAlignTypeFromString(EDataType eDataType, String initialValue) {
		RubyAlignType result = RubyAlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRubyAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyPositionType createRubyPositionTypeFromString(EDataType eDataType, String initialValue) {
		RubyPositionType result = RubyPositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRubyPositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunThroughType createRunThroughTypeFromString(EDataType eDataType, String initialValue) {
		RunThroughType result = RunThroughType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRunThroughTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTypeType createScriptTypeTypeFromString(EDataType eDataType, String initialValue) {
		ScriptTypeType result = ScriptTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType createStyleTypeFromString(EDataType eDataType, String initialValue) {
		StyleType result = StyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAutospaceType createTextAutospaceTypeFromString(EDataType eDataType, String initialValue) {
		TextAutospaceType result = TextAutospaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextAutospaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextCombineType createTextCombineTypeFromString(EDataType eDataType, String initialValue) {
		TextCombineType result = TextCombineType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextCombineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextEmphasizeTypeMember0 createTextEmphasizeTypeMember0FromString(EDataType eDataType, String initialValue) {
		TextEmphasizeTypeMember0 result = TextEmphasizeTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextEmphasizeTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextEmphasizeTypeMember1BaseItem createTextEmphasizeTypeMember1BaseItemFromString(EDataType eDataType, String initialValue) {
		TextEmphasizeTypeMember1BaseItem result = TextEmphasizeTypeMember1BaseItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextEmphasizeTypeMember1BaseItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLineThroughColorTypeMember1 createTextLineThroughColorTypeMember1FromString(EDataType eDataType, String initialValue) {
		TextLineThroughColorTypeMember1 result = TextLineThroughColorTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextLineThroughColorTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPositionTypeBaseItemMember1Member1 createTextPositionTypeBaseItemMember1Member1FromString(EDataType eDataType, String initialValue) {
		TextPositionTypeBaseItemMember1Member1 result = TextPositionTypeBaseItemMember1Member1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextPositionTypeBaseItemMember1Member1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPositionTypeBaseItemMember1Member2 createTextPositionTypeBaseItemMember1Member2FromString(EDataType eDataType, String initialValue) {
		TextPositionTypeBaseItemMember1Member2 result = TextPositionTypeBaseItemMember1Member2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextPositionTypeBaseItemMember1Member2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextRotationScaleType createTextRotationScaleTypeFromString(EDataType eDataType, String initialValue) {
		TextRotationScaleType result = TextRotationScaleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextRotationScaleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextUnderlineColorTypeMember1 createTextUnderlineColorTypeMember1FromString(EDataType eDataType, String initialValue) {
		TextUnderlineColorTypeMember1 result = TextUnderlineColorTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextUnderlineColorTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCenteringType createTableCenteringTypeFromString(EDataType eDataType, String initialValue) {
		TableCenteringType result = TableCenteringType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableCenteringTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlignSourceType createTextAlignSourceTypeFromString(EDataType eDataType, String initialValue) {
		TextAlignSourceType result = TextAlignSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextAlignSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeType1FromString(EDataType eDataType, String initialValue) {
		TypeType1 result = TypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalAlignType createVerticalAlignTypeFromString(EDataType eDataType, String initialValue) {
		VerticalAlignType result = VerticalAlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalPosType createVerticalPosTypeFromString(EDataType eDataType, String initialValue) {
		VerticalPosType result = VerticalPosType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalPosTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalRelType createVerticalRelTypeFromString(EDataType eDataType, String initialValue) {
		VerticalRelType result = VerticalRelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalRelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapContourModeType createWrapContourModeTypeFromString(EDataType eDataType, String initialValue) {
		WrapContourModeType result = WrapContourModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWrapContourModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapType createWrapTypeFromString(EDataType eDataType, String initialValue) {
		WrapType result = WrapType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWrapTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritingModeType createWritingModeTypeFromString(EDataType eDataType, String initialValue) {
		WritingModeType result = WritingModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWritingModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjustmentType createAdjustmentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAdjustmentTypeFromString(StylePackage.eINSTANCE.getAdjustmentType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjustmentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdjustmentTypeToString(StylePackage.eINSTANCE.getAdjustmentType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createApplyStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createApplyStyleNameTypeMember1FromString(StylePackage.eINSTANCE.getApplyStyleNameTypeMember1(), initialValue);
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
	public String convertApplyStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getApplyStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertApplyStyleNameTypeMember1ToString(StylePackage.eINSTANCE.getApplyStyleNameTypeMember1(), instanceValue);
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
	public String createApplyStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplyStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createCellProtectTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createCellProtectTypeMember0FromString(StylePackage.eINSTANCE.getCellProtectTypeMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCellProtectTypeMember1FromString(StylePackage.eINSTANCE.getCellProtectTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCellProtectTypeMember2FromString(StylePackage.eINSTANCE.getCellProtectTypeMember2(), initialValue);
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
	public String convertCellProtectTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getCellProtectTypeMember0().isInstance(instanceValue)) {
			try {
				String value = convertCellProtectTypeMember0ToString(StylePackage.eINSTANCE.getCellProtectTypeMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getCellProtectTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertCellProtectTypeMember1ToString(StylePackage.eINSTANCE.getCellProtectTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getCellProtectTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertCellProtectTypeMember2ToString(StylePackage.eINSTANCE.getCellProtectTypeMember2(), instanceValue);
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
	public CellProtectTypeMember0 createCellProtectTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createCellProtectTypeMember0FromString(StylePackage.eINSTANCE.getCellProtectTypeMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellProtectTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCellProtectTypeMember0ToString(StylePackage.eINSTANCE.getCellProtectTypeMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellProtectTypeMember1 createCellProtectTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createCellProtectTypeMember1FromString(StylePackage.eINSTANCE.getCellProtectTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellProtectTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCellProtectTypeMember1ToString(StylePackage.eINSTANCE.getCellProtectTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createCellProtectTypeMember2FromString(EDataType eDataType, String initialValue) {
		return new ArrayList(); //(List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellProtectTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CellProtectTypeMember2BaseItem> createCellProtectTypeMember2BaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<CellProtectTypeMember2BaseItem> result = new ArrayList<CellProtectTypeMember2BaseItem>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createCellProtectTypeMember2BaseItemFromString(StylePackage.eINSTANCE.getCellProtectTypeMember2BaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellProtectTypeMember2BaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertCellProtectTypeMember2BaseItemToString(StylePackage.eINSTANCE.getCellProtectTypeMember2BaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellProtectTypeMember2BaseItem createCellProtectTypeMember2BaseItemObjectFromString(EDataType eDataType, String initialValue) {
		return createCellProtectTypeMember2BaseItemFromString(StylePackage.eINSTANCE.getCellProtectTypeMember2BaseItem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellProtectTypeMember2BaseItemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCellProtectTypeMember2BaseItemToString(StylePackage.eINSTANCE.getCellProtectTypeMember2BaseItem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDataStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createDataStyleNameTypeMember1FromString(StylePackage.eINSTANCE.getDataStyleNameTypeMember1(), initialValue);
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
	public String convertDataStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getDataStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertDataStyleNameTypeMember1ToString(StylePackage.eINSTANCE.getDataStyleNameTypeMember1(), instanceValue);
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
	public String createDataStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectionTypeFromString(StylePackage.eINSTANCE.getDirectionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectionTypeToString(StylePackage.eINSTANCE.getDirectionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyType createFamilyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFamilyTypeFromString(StylePackage.eINSTANCE.getFamilyType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFamilyTypeToString(StylePackage.eINSTANCE.getFamilyType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFirstPageNumberTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createFirstPageNumberTypeMember1FromString(StylePackage.eINSTANCE.getFirstPageNumberTypeMember1(), initialValue);
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
	public String convertFirstPageNumberTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getFirstPageNumberTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertFirstPageNumberTypeMember1ToString(StylePackage.eINSTANCE.getFirstPageNumberTypeMember1(), instanceValue);
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
	public FirstPageNumberTypeMember1 createFirstPageNumberTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createFirstPageNumberTypeMember1FromString(StylePackage.eINSTANCE.getFirstPageNumberTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFirstPageNumberTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFirstPageNumberTypeMember1ToString(StylePackage.eINSTANCE.getFirstPageNumberTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontReliefType createFontReliefTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFontReliefTypeFromString(StylePackage.eINSTANCE.getFontReliefType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontReliefTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontReliefTypeToString(StylePackage.eINSTANCE.getFontReliefType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFontSizeAsianTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontSizeAsianTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFontSizeComplexTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontSizeComplexTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlyphOrientationVerticalType createGlyphOrientationVerticalTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGlyphOrientationVerticalTypeFromString(StylePackage.eINSTANCE.getGlyphOrientationVerticalType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlyphOrientationVerticalTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGlyphOrientationVerticalTypeToString(StylePackage.eINSTANCE.getGlyphOrientationVerticalType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalPosType createHorizontalPosTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHorizontalPosTypeFromString(StylePackage.eINSTANCE.getHorizontalPosType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHorizontalPosTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHorizontalPosTypeToString(StylePackage.eINSTANCE.getHorizontalPosType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalRelType createHorizontalRelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHorizontalRelTypeFromString(StylePackage.eINSTANCE.getHorizontalRelType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHorizontalRelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHorizontalRelTypeToString(StylePackage.eINSTANCE.getHorizontalRelType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutGridModeType createLayoutGridModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLayoutGridModeTypeFromString(StylePackage.eINSTANCE.getLayoutGridModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutGridModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLayoutGridModeTypeToString(StylePackage.eINSTANCE.getLayoutGridModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createLeaderColorTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLeaderColorTypeMember1FromString(StylePackage.eINSTANCE.getLeaderColorTypeMember1(), initialValue);
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
	public String convertLeaderColorTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getLeaderColorTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertLeaderColorTypeMember1ToString(StylePackage.eINSTANCE.getLeaderColorTypeMember1(), instanceValue);
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
	public LeaderColorTypeMember1 createLeaderColorTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createLeaderColorTypeMember1FromString(StylePackage.eINSTANCE.getLeaderColorTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeaderColorTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLeaderColorTypeMember1ToString(StylePackage.eINSTANCE.getLeaderColorTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLeaderTextStyleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createLeaderTextStyleTypeMember1FromString(StylePackage.eINSTANCE.getLeaderTextStyleTypeMember1(), initialValue);
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
	public String convertLeaderTextStyleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getLeaderTextStyleTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertLeaderTextStyleTypeMember1ToString(StylePackage.eINSTANCE.getLeaderTextStyleTypeMember1(), instanceValue);
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
	public String createLeaderTextStyleTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeaderTextStyleTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendExpansionType createLegendExpansionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLegendExpansionTypeFromString(StylePackage.eINSTANCE.getLegendExpansionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegendExpansionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLegendExpansionTypeToString(StylePackage.eINSTANCE.getLegendExpansionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createLengthTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createLengthTypeMember1FromString(StylePackage.eINSTANCE.getLengthTypeMember1(), initialValue);
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
	public String convertLengthTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getLengthTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertLengthTypeMember1ToString(StylePackage.eINSTANCE.getLengthTypeMember1(), instanceValue);
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
	public LengthTypeMember1 createLengthTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createLengthTypeMember1FromString(StylePackage.eINSTANCE.getLengthTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLengthTypeMember1ToString(StylePackage.eINSTANCE.getLengthTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineBreakType createLineBreakTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLineBreakTypeFromString(StylePackage.eINSTANCE.getLineBreakType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineBreakTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineBreakTypeToString(StylePackage.eINSTANCE.getLineBreakType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createListStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createListStyleNameTypeMember1FromString(StylePackage.eINSTANCE.getListStyleNameTypeMember1(), initialValue);
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
	public String convertListStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getListStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertListStyleNameTypeMember1ToString(StylePackage.eINSTANCE.getListStyleNameTypeMember1(), instanceValue);
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
	public String createListStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMasterPageNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createMasterPageNameTypeMember1FromString(StylePackage.eINSTANCE.getMasterPageNameTypeMember1(), initialValue);
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
	public String convertMasterPageNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getMasterPageNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertMasterPageNameTypeMember1ToString(StylePackage.eINSTANCE.getMasterPageNameTypeMember1(), instanceValue);
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
	public String createMasterPageNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMasterPageNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMirrorTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createMirrorTypeMember1FromString(StylePackage.eINSTANCE.getMirrorTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMirrorTypeMember2FromString(StylePackage.eINSTANCE.getMirrorTypeMember2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMirrorTypeMember3FromString(StylePackage.eINSTANCE.getMirrorTypeMember3(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMirrorTypeMember4FromString(StylePackage.eINSTANCE.getMirrorTypeMember4(), initialValue);
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
	public String convertMirrorTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getMirrorTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertMirrorTypeMember1ToString(StylePackage.eINSTANCE.getMirrorTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getMirrorTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertMirrorTypeMember2ToString(StylePackage.eINSTANCE.getMirrorTypeMember2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getMirrorTypeMember3().isInstance(instanceValue)) {
			try {
				String value = convertMirrorTypeMember3ToString(StylePackage.eINSTANCE.getMirrorTypeMember3(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getMirrorTypeMember4().isInstance(instanceValue)) {
			try {
				String value = convertMirrorTypeMember4ToString(StylePackage.eINSTANCE.getMirrorTypeMember4(), instanceValue);
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
	public MirrorTypeMember1 createMirrorTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createMirrorTypeMember1FromString(StylePackage.eINSTANCE.getMirrorTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMirrorTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMirrorTypeMember1ToString(StylePackage.eINSTANCE.getMirrorTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirrorTypeMember2 createMirrorTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createMirrorTypeMember2FromString(StylePackage.eINSTANCE.getMirrorTypeMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMirrorTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMirrorTypeMember2ToString(StylePackage.eINSTANCE.getMirrorTypeMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createMirrorTypeMember3FromString(EDataType eDataType, String initialValue) {
		return new ArrayList(); //super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMirrorTypeMember3ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Enumerator> createMirrorTypeMember3BaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Enumerator> result = new ArrayList<Enumerator>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createMirrorTypeMember3BaseItemFromString(StylePackage.eINSTANCE.getMirrorTypeMember3BaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMirrorTypeMember3BaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertMirrorTypeMember3BaseItemToString(StylePackage.eINSTANCE.getMirrorTypeMember3BaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createMirrorTypeMember3BaseItemFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Enumerator result = null;
		RuntimeException exception = null;
		try {
			result = (Enumerator)createMirrorTypeMember3BaseItemMember1FromString(StylePackage.eINSTANCE.getMirrorTypeMember3BaseItemMember1(), initialValue);
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
	public String convertMirrorTypeMember3BaseItemToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getMirrorTypeMember3BaseItemMember1().isInstance(instanceValue)) {
			try {
				String value = convertMirrorTypeMember3BaseItemMember1ToString(StylePackage.eINSTANCE.getMirrorTypeMember3BaseItemMember1(), instanceValue);
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
	public MirrorTypeMember3BaseItemMember1 createMirrorTypeMember3BaseItemMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createMirrorTypeMember3BaseItemMember1FromString(StylePackage.eINSTANCE.getMirrorTypeMember3BaseItemMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMirrorTypeMember3BaseItemMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMirrorTypeMember3BaseItemMember1ToString(StylePackage.eINSTANCE.getMirrorTypeMember3BaseItemMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createMirrorTypeMember4FromString(EDataType eDataType, String initialValue) {
		return new ArrayList(); //(List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMirrorTypeMember4ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Enumerator> createMirrorTypeMember4BaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Enumerator> result = new ArrayList<Enumerator>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createMirrorTypeMember4BaseItemFromString(StylePackage.eINSTANCE.getMirrorTypeMember4BaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMirrorTypeMember4BaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertMirrorTypeMember4BaseItemToString(StylePackage.eINSTANCE.getMirrorTypeMember4BaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createMirrorTypeMember4BaseItemFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Enumerator result = null;
		RuntimeException exception = null;
		try {
			result = (Enumerator)createMirrorTypeMember4BaseItemMember1FromString(StylePackage.eINSTANCE.getMirrorTypeMember4BaseItemMember1(), initialValue);
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
	public String convertMirrorTypeMember4BaseItemToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getMirrorTypeMember4BaseItemMember1().isInstance(instanceValue)) {
			try {
				String value = convertMirrorTypeMember4BaseItemMember1ToString(StylePackage.eINSTANCE.getMirrorTypeMember4BaseItemMember1(), instanceValue);
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
	public MirrorTypeMember4BaseItemMember1 createMirrorTypeMember4BaseItemMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createMirrorTypeMember4BaseItemMember1FromString(StylePackage.eINSTANCE.getMirrorTypeMember4BaseItemMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMirrorTypeMember4BaseItemMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMirrorTypeMember4BaseItemMember1ToString(StylePackage.eINSTANCE.getMirrorTypeMember4BaseItemMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNextStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createNextStyleNameTypeMember1FromString(StylePackage.eINSTANCE.getNextStyleNameTypeMember1(), initialValue);
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
	public String convertNextStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getNextStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertNextStyleNameTypeMember1ToString(StylePackage.eINSTANCE.getNextStyleNameTypeMember1(), instanceValue);
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
	public String createNextStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNextStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNumberWrappedParagraphsTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNumberWrappedParagraphsTypeMember1FromString(StylePackage.eINSTANCE.getNumberWrappedParagraphsTypeMember1(), initialValue);
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
	public String convertNumberWrappedParagraphsTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getNumberWrappedParagraphsTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertNumberWrappedParagraphsTypeMember1ToString(StylePackage.eINSTANCE.getNumberWrappedParagraphsTypeMember1(), instanceValue);
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
	public NumberWrappedParagraphsTypeMember1 createNumberWrappedParagraphsTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createNumberWrappedParagraphsTypeMember1FromString(StylePackage.eINSTANCE.getNumberWrappedParagraphsTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberWrappedParagraphsTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumberWrappedParagraphsTypeMember1ToString(StylePackage.eINSTANCE.getNumberWrappedParagraphsTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNumFormatTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNumFormatTypeMember0FromString(StylePackage.eINSTANCE.getNumFormatTypeMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNumFormatTypeMember1FromString(StylePackage.eINSTANCE.getNumFormatTypeMember1(), initialValue);
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
	public String convertNumFormatTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getNumFormatTypeMember0().isInstance(instanceValue)) {
			try {
				String value = convertNumFormatTypeMember0ToString(StylePackage.eINSTANCE.getNumFormatTypeMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getNumFormatTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertNumFormatTypeMember1ToString(StylePackage.eINSTANCE.getNumFormatTypeMember1(), instanceValue);
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
	public Object createNumFormatTypeMember0FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNumFormatTypeMember0Member0FromString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNumFormatTypeMember0Member1FromString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member1(), initialValue);
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
	public String convertNumFormatTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member0().isInstance(instanceValue)) {
			try {
				String value = convertNumFormatTypeMember0Member0ToString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member1().isInstance(instanceValue)) {
			try {
				String value = convertNumFormatTypeMember0Member1ToString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member1(), instanceValue);
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
	public Object createNumFormatTypeMember0Member0FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNumFormatTypeMember0Member0Member1FromString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNumFormatTypeMember0Member0Member2FromString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNumFormatTypeMember0Member0Member3FromString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member3(), initialValue);
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
	public String convertNumFormatTypeMember0Member0ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member1().isInstance(instanceValue)) {
			try {
				String value = convertNumFormatTypeMember0Member0Member1ToString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member2().isInstance(instanceValue)) {
			try {
				String value = convertNumFormatTypeMember0Member0Member2ToString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member3().isInstance(instanceValue)) {
			try {
				String value = convertNumFormatTypeMember0Member0Member3ToString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member3(), instanceValue);
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
	public NumFormatTypeMember0Member0Member1 createNumFormatTypeMember0Member0Member1ObjectFromString(EDataType eDataType, String initialValue) {
		return createNumFormatTypeMember0Member0Member1FromString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumFormatTypeMember0Member0Member1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumFormatTypeMember0Member0Member1ToString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumFormatTypeMember0Member0Member2 createNumFormatTypeMember0Member0Member2ObjectFromString(EDataType eDataType, String initialValue) {
		return createNumFormatTypeMember0Member0Member2FromString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumFormatTypeMember0Member0Member2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumFormatTypeMember0Member0Member2ToString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumFormatTypeMember0Member0Member3 createNumFormatTypeMember0Member0Member3ObjectFromString(EDataType eDataType, String initialValue) {
		return createNumFormatTypeMember0Member0Member3FromString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumFormatTypeMember0Member0Member3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumFormatTypeMember0Member0Member3ToString(StylePackage.eINSTANCE.getNumFormatTypeMember0Member0Member3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNumFormatTypeMember0Member1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumFormatTypeMember0Member1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumFormatTypeMember1 createNumFormatTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createNumFormatTypeMember1FromString(StylePackage.eINSTANCE.getNumFormatTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumFormatTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumFormatTypeMember1ToString(StylePackage.eINSTANCE.getNumFormatTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverflowBehaviorType createOverflowBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOverflowBehaviorTypeFromString(StylePackage.eINSTANCE.getOverflowBehaviorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverflowBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOverflowBehaviorTypeToString(StylePackage.eINSTANCE.getOverflowBehaviorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPageLayoutNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createPageLayoutNameTypeMember1FromString(StylePackage.eINSTANCE.getPageLayoutNameTypeMember1(), initialValue);
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
	public String convertPageLayoutNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getPageLayoutNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertPageLayoutNameTypeMember1ToString(StylePackage.eINSTANCE.getPageLayoutNameTypeMember1(), instanceValue);
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
	public String createPageLayoutNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPageLayoutNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPageNumberTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createPageNumberTypeMember1FromString(StylePackage.eINSTANCE.getPageNumberTypeMember1(), initialValue);
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
	public String convertPageNumberTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getPageNumberTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertPageNumberTypeMember1ToString(StylePackage.eINSTANCE.getPageNumberTypeMember1(), instanceValue);
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
	public PageNumberTypeMember1 createPageNumberTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createPageNumberTypeMember1FromString(StylePackage.eINSTANCE.getPageNumberTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPageNumberTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPageNumberTypeMember1ToString(StylePackage.eINSTANCE.getPageNumberTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageUsageType createPageUsageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPageUsageTypeFromString(StylePackage.eINSTANCE.getPageUsageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPageUsageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPageUsageTypeToString(StylePackage.eINSTANCE.getPageUsageType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPaperTrayNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createPaperTrayNameTypeMember1FromString(StylePackage.eINSTANCE.getPaperTrayNameTypeMember1(), initialValue);
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
	public String convertPaperTrayNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getPaperTrayNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertPaperTrayNameTypeMember1ToString(StylePackage.eINSTANCE.getPaperTrayNameTypeMember1(), instanceValue);
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
	public PaperTrayNameTypeMember1 createPaperTrayNameTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createPaperTrayNameTypeMember1FromString(StylePackage.eINSTANCE.getPaperTrayNameTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaperTrayNameTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPaperTrayNameTypeMember1ToString(StylePackage.eINSTANCE.getPaperTrayNameTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createParentStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createParentStyleNameTypeMember1FromString(StylePackage.eINSTANCE.getParentStyleNameTypeMember1(), initialValue);
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
	public String convertParentStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getParentStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertParentStyleNameTypeMember1ToString(StylePackage.eINSTANCE.getParentStyleNameTypeMember1(), instanceValue);
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
	public String createParentStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParentStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPositionTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createPositionTypeMember0FromString(StylePackage.eINSTANCE.getPositionTypeMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPositionTypeMember1FromString(StylePackage.eINSTANCE.getPositionTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPositionTypeMember2FromString(StylePackage.eINSTANCE.getPositionTypeMember2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPositionTypeMember3FromString(StylePackage.eINSTANCE.getPositionTypeMember3(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPositionTypeMember4FromString(StylePackage.eINSTANCE.getPositionTypeMember4(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPositionTypeMember5FromString(StylePackage.eINSTANCE.getPositionTypeMember5(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPositionTypeMember6FromString(StylePackage.eINSTANCE.getPositionTypeMember6(), initialValue);
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
	public String convertPositionTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getPositionTypeMember0().isInstance(instanceValue)) {
			try {
				String value = convertPositionTypeMember0ToString(StylePackage.eINSTANCE.getPositionTypeMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getPositionTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertPositionTypeMember1ToString(StylePackage.eINSTANCE.getPositionTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getPositionTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertPositionTypeMember2ToString(StylePackage.eINSTANCE.getPositionTypeMember2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getPositionTypeMember3().isInstance(instanceValue)) {
			try {
				String value = convertPositionTypeMember3ToString(StylePackage.eINSTANCE.getPositionTypeMember3(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getPositionTypeMember4().isInstance(instanceValue)) {
			try {
				String value = convertPositionTypeMember4ToString(StylePackage.eINSTANCE.getPositionTypeMember4(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getPositionTypeMember5().isInstance(instanceValue)) {
			try {
				String value = convertPositionTypeMember5ToString(StylePackage.eINSTANCE.getPositionTypeMember5(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getPositionTypeMember6().isInstance(instanceValue)) {
			try {
				String value = convertPositionTypeMember6ToString(StylePackage.eINSTANCE.getPositionTypeMember6(), instanceValue);
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
	public PositionTypeMember0 createPositionTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createPositionTypeMember0FromString(StylePackage.eINSTANCE.getPositionTypeMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPositionTypeMember0ToString(StylePackage.eINSTANCE.getPositionTypeMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionTypeMember1 createPositionTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createPositionTypeMember1FromString(StylePackage.eINSTANCE.getPositionTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPositionTypeMember1ToString(StylePackage.eINSTANCE.getPositionTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionTypeMember2 createPositionTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createPositionTypeMember2FromString(StylePackage.eINSTANCE.getPositionTypeMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPositionTypeMember2ToString(StylePackage.eINSTANCE.getPositionTypeMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionTypeMember3 createPositionTypeMember3ObjectFromString(EDataType eDataType, String initialValue) {
		return createPositionTypeMember3FromString(StylePackage.eINSTANCE.getPositionTypeMember3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPositionTypeMember3ToString(StylePackage.eINSTANCE.getPositionTypeMember3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionTypeMember4 createPositionTypeMember4ObjectFromString(EDataType eDataType, String initialValue) {
		return createPositionTypeMember4FromString(StylePackage.eINSTANCE.getPositionTypeMember4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember4ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPositionTypeMember4ToString(StylePackage.eINSTANCE.getPositionTypeMember4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createPositionTypeMember5FromString(EDataType eDataType, String initialValue) {
		return new ArrayList(); //(List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember5ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Enumerator> createPositionTypeMember5BaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Enumerator> result = new ArrayList<Enumerator>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createPositionTypeMember5BaseItemFromString(StylePackage.eINSTANCE.getPositionTypeMember5BaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember5BaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertPositionTypeMember5BaseItemToString(StylePackage.eINSTANCE.getPositionTypeMember5BaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createPositionTypeMember5BaseItemFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember5BaseItemToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createPositionTypeMember6FromString(EDataType eDataType, String initialValue) {
		return new ArrayList(); //(List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember6ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Enumerator> createPositionTypeMember6BaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Enumerator> result = new ArrayList<Enumerator>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createPositionTypeMember6BaseItemFromString(StylePackage.eINSTANCE.getPositionTypeMember6BaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember6BaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertPositionTypeMember6BaseItemToString(StylePackage.eINSTANCE.getPositionTypeMember6BaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createPositionTypeMember6BaseItemFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeMember6BaseItemToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintOrientationType createPrintOrientationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPrintOrientationTypeFromString(StylePackage.eINSTANCE.getPrintOrientationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrintOrientationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPrintOrientationTypeToString(StylePackage.eINSTANCE.getPrintOrientationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintPageOrderType createPrintPageOrderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPrintPageOrderTypeFromString(StylePackage.eINSTANCE.getPrintPageOrderType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrintPageOrderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPrintPageOrderTypeToString(StylePackage.eINSTANCE.getPrintPageOrderType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PrintTypeItem> createPrintTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<PrintTypeItem> result = new ArrayList<PrintTypeItem>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createPrintTypeItemFromString(StylePackage.eINSTANCE.getPrintTypeItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrintTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertPrintTypeItemToString(StylePackage.eINSTANCE.getPrintTypeItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintTypeItem createPrintTypeItemObjectFromString(EDataType eDataType, String initialValue) {
		return createPrintTypeItemFromString(StylePackage.eINSTANCE.getPrintTypeItem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrintTypeItemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPrintTypeItemToString(StylePackage.eINSTANCE.getPrintTypeItem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PunctuationWrapType createPunctuationWrapTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPunctuationWrapTypeFromString(StylePackage.eINSTANCE.getPunctuationWrapType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPunctuationWrapTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPunctuationWrapTypeToString(StylePackage.eINSTANCE.getPunctuationWrapType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRegisterTruthRefStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createRegisterTruthRefStyleNameTypeMember1FromString(StylePackage.eINSTANCE.getRegisterTruthRefStyleNameTypeMember1(), initialValue);
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
	public String convertRegisterTruthRefStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getRegisterTruthRefStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertRegisterTruthRefStyleNameTypeMember1ToString(StylePackage.eINSTANCE.getRegisterTruthRefStyleNameTypeMember1(), instanceValue);
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
	public String createRegisterTruthRefStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegisterTruthRefStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRelHeightTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createRelHeightTypeMember1FromString(StylePackage.eINSTANCE.getRelHeightTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createRelHeightTypeMember2FromString(StylePackage.eINSTANCE.getRelHeightTypeMember2(), initialValue);
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
	public String convertRelHeightTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getRelHeightTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertRelHeightTypeMember1ToString(StylePackage.eINSTANCE.getRelHeightTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getRelHeightTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertRelHeightTypeMember2ToString(StylePackage.eINSTANCE.getRelHeightTypeMember2(), instanceValue);
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
	public RelHeightTypeMember1 createRelHeightTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createRelHeightTypeMember1FromString(StylePackage.eINSTANCE.getRelHeightTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelHeightTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelHeightTypeMember1ToString(StylePackage.eINSTANCE.getRelHeightTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelHeightTypeMember2 createRelHeightTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createRelHeightTypeMember2FromString(StylePackage.eINSTANCE.getRelHeightTypeMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelHeightTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelHeightTypeMember2ToString(StylePackage.eINSTANCE.getRelHeightTypeMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRelWidthTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createRelWidthTypeMember1FromString(StylePackage.eINSTANCE.getRelWidthTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createRelWidthTypeMember2FromString(StylePackage.eINSTANCE.getRelWidthTypeMember2(), initialValue);
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
	public String convertRelWidthTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getRelWidthTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertRelWidthTypeMember1ToString(StylePackage.eINSTANCE.getRelWidthTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getRelWidthTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertRelWidthTypeMember2ToString(StylePackage.eINSTANCE.getRelWidthTypeMember2(), instanceValue);
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
	public RelWidthTypeMember1 createRelWidthTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createRelWidthTypeMember1FromString(StylePackage.eINSTANCE.getRelWidthTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelWidthTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelWidthTypeMember1ToString(StylePackage.eINSTANCE.getRelWidthTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelWidthTypeMember2 createRelWidthTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createRelWidthTypeMember2FromString(StylePackage.eINSTANCE.getRelWidthTypeMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelWidthTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelWidthTypeMember2ToString(StylePackage.eINSTANCE.getRelWidthTypeMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatType createRepeatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRepeatTypeFromString(StylePackage.eINSTANCE.getRepeatType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepeatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRepeatTypeToString(StylePackage.eINSTANCE.getRepeatType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotationAlignType createRotationAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRotationAlignTypeFromString(StylePackage.eINSTANCE.getRotationAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRotationAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRotationAlignTypeToString(StylePackage.eINSTANCE.getRotationAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyAlignType createRubyAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRubyAlignTypeFromString(StylePackage.eINSTANCE.getRubyAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRubyAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRubyAlignTypeToString(StylePackage.eINSTANCE.getRubyAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyPositionType createRubyPositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRubyPositionTypeFromString(StylePackage.eINSTANCE.getRubyPositionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRubyPositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRubyPositionTypeToString(StylePackage.eINSTANCE.getRubyPositionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunThroughType createRunThroughTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRunThroughTypeFromString(StylePackage.eINSTANCE.getRunThroughType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRunThroughTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRunThroughTypeToString(StylePackage.eINSTANCE.getRunThroughType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTypeType createScriptTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScriptTypeTypeFromString(StylePackage.eINSTANCE.getScriptTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScriptTypeTypeToString(StylePackage.eINSTANCE.getScriptTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameTypeMember1FromString(StylePackage.eINSTANCE.getStyleNameTypeMember1(), initialValue);
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
	public String convertStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember1ToString(StylePackage.eINSTANCE.getStyleNameTypeMember1(), instanceValue);
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
	public String createStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType createStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStyleTypeFromString(StylePackage.eINSTANCE.getStyleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStyleTypeToString(StylePackage.eINSTANCE.getStyleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAutospaceType createTextAutospaceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextAutospaceTypeFromString(StylePackage.eINSTANCE.getTextAutospaceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextAutospaceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextAutospaceTypeToString(StylePackage.eINSTANCE.getTextAutospaceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextCombineType createTextCombineTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextCombineTypeFromString(StylePackage.eINSTANCE.getTextCombineType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextCombineTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextCombineTypeToString(StylePackage.eINSTANCE.getTextCombineType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTextEmphasizeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTextEmphasizeTypeMember0FromString(StylePackage.eINSTANCE.getTextEmphasizeTypeMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTextEmphasizeTypeMember1FromString(StylePackage.eINSTANCE.getTextEmphasizeTypeMember1(), initialValue);
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
	public String convertTextEmphasizeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getTextEmphasizeTypeMember0().isInstance(instanceValue)) {
			try {
				String value = convertTextEmphasizeTypeMember0ToString(StylePackage.eINSTANCE.getTextEmphasizeTypeMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getTextEmphasizeTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertTextEmphasizeTypeMember1ToString(StylePackage.eINSTANCE.getTextEmphasizeTypeMember1(), instanceValue);
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
	public TextEmphasizeTypeMember0 createTextEmphasizeTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createTextEmphasizeTypeMember0FromString(StylePackage.eINSTANCE.getTextEmphasizeTypeMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextEmphasizeTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextEmphasizeTypeMember0ToString(StylePackage.eINSTANCE.getTextEmphasizeTypeMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createTextEmphasizeTypeMember1FromString(EDataType eDataType, String initialValue) {
		return new ArrayList(); //(List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextEmphasizeTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TextEmphasizeTypeMember1BaseItem> createTextEmphasizeTypeMember1BaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<TextEmphasizeTypeMember1BaseItem> result = new ArrayList<TextEmphasizeTypeMember1BaseItem>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createTextEmphasizeTypeMember1BaseItemFromString(StylePackage.eINSTANCE.getTextEmphasizeTypeMember1BaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextEmphasizeTypeMember1BaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertTextEmphasizeTypeMember1BaseItemToString(StylePackage.eINSTANCE.getTextEmphasizeTypeMember1BaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTextLineThroughColorTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTextLineThroughColorTypeMember1FromString(StylePackage.eINSTANCE.getTextLineThroughColorTypeMember1(), initialValue);
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
	public String convertTextLineThroughColorTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getTextLineThroughColorTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertTextLineThroughColorTypeMember1ToString(StylePackage.eINSTANCE.getTextLineThroughColorTypeMember1(), instanceValue);
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
	public TextLineThroughColorTypeMember1 createTextLineThroughColorTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createTextLineThroughColorTypeMember1FromString(StylePackage.eINSTANCE.getTextLineThroughColorTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextLineThroughColorTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextLineThroughColorTypeMember1ToString(StylePackage.eINSTANCE.getTextLineThroughColorTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextLineThroughTextStyleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createTextLineThroughTextStyleTypeMember1FromString(StylePackage.eINSTANCE.getTextLineThroughTextStyleTypeMember1(), initialValue);
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
	public String convertTextLineThroughTextStyleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getTextLineThroughTextStyleTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertTextLineThroughTextStyleTypeMember1ToString(StylePackage.eINSTANCE.getTextLineThroughTextStyleTypeMember1(), instanceValue);
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
	public String createTextLineThroughTextStyleTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextLineThroughTextStyleTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createTextPositionTypeFromString(EDataType eDataType, String initialValue) {
		return new ArrayList(); //(List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextPositionTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createTextPositionTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createTextPositionTypeBaseItemFromString(StylePackage.eINSTANCE.getTextPositionTypeBaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextPositionTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertTextPositionTypeBaseItemToString(StylePackage.eINSTANCE.getTextPositionTypeBaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTextPositionTypeBaseItemFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTextPositionTypeBaseItemMember1FromString(StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1(), initialValue);
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
	public String convertTextPositionTypeBaseItemToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1().isInstance(instanceValue)) {
			try {
				String value = convertTextPositionTypeBaseItemMember1ToString(StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1(), instanceValue);
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
	public Object createTextPositionTypeBaseItemMember1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTextPositionTypeBaseItemMember1Member1FromString(StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTextPositionTypeBaseItemMember1Member2FromString(StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member2(), initialValue);
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
	public String convertTextPositionTypeBaseItemMember1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member1().isInstance(instanceValue)) {
			try {
				String value = convertTextPositionTypeBaseItemMember1Member1ToString(StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member2().isInstance(instanceValue)) {
			try {
				String value = convertTextPositionTypeBaseItemMember1Member2ToString(StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member2(), instanceValue);
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
	public TextPositionTypeBaseItemMember1Member1 createTextPositionTypeBaseItemMember1Member1ObjectFromString(EDataType eDataType, String initialValue) {
		return createTextPositionTypeBaseItemMember1Member1FromString(StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextPositionTypeBaseItemMember1Member1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextPositionTypeBaseItemMember1Member1ToString(StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPositionTypeBaseItemMember1Member2 createTextPositionTypeBaseItemMember1Member2ObjectFromString(EDataType eDataType, String initialValue) {
		return createTextPositionTypeBaseItemMember1Member2FromString(StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextPositionTypeBaseItemMember1Member2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextPositionTypeBaseItemMember1Member2ToString(StylePackage.eINSTANCE.getTextPositionTypeBaseItemMember1Member2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextRotationScaleType createTextRotationScaleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextRotationScaleTypeFromString(StylePackage.eINSTANCE.getTextRotationScaleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextRotationScaleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextRotationScaleTypeToString(StylePackage.eINSTANCE.getTextRotationScaleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextUnderlineColorTypeMember1 createTextUnderlineColorTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createTextUnderlineColorTypeMember1FromString(StylePackage.eINSTANCE.getTextUnderlineColorTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextUnderlineColorTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextUnderlineColorTypeMember1ToString(StylePackage.eINSTANCE.getTextUnderlineColorTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(StylePackage.eINSTANCE.getTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(StylePackage.eINSTANCE.getTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCenteringType createTableCenteringTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTableCenteringTypeFromString(StylePackage.eINSTANCE.getTableCenteringType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableCenteringTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTableCenteringTypeToString(StylePackage.eINSTANCE.getTableCenteringType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlignSourceType createTextAlignSourceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextAlignSourceTypeFromString(StylePackage.eINSTANCE.getTextAlignSourceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextAlignSourceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextAlignSourceTypeToString(StylePackage.eINSTANCE.getTextAlignSourceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextEmphasizeTypeMember1BaseItem createTextEmphasizeTypeMember1BaseItemObjectFromString(EDataType eDataType, String initialValue) {
		return createTextEmphasizeTypeMember1BaseItemFromString(StylePackage.eINSTANCE.getTextEmphasizeTypeMember1BaseItem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextEmphasizeTypeMember1BaseItemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextEmphasizeTypeMember1BaseItemToString(StylePackage.eINSTANCE.getTextEmphasizeTypeMember1BaseItem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTextUnderlineColorTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTextUnderlineColorTypeMember1FromString(StylePackage.eINSTANCE.getTextUnderlineColorTypeMember1(), initialValue);
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
	public String convertTextUnderlineColorTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (StylePackage.eINSTANCE.getTextUnderlineColorTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertTextUnderlineColorTypeMember1ToString(StylePackage.eINSTANCE.getTextUnderlineColorTypeMember1(), instanceValue);
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
	public TypeType1 createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTypeType1FromString(StylePackage.eINSTANCE.getTypeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType1ToString(StylePackage.eINSTANCE.getTypeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalAlignType createVerticalAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVerticalAlignTypeFromString(StylePackage.eINSTANCE.getVerticalAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVerticalAlignTypeToString(StylePackage.eINSTANCE.getVerticalAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalPosType createVerticalPosTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVerticalPosTypeFromString(StylePackage.eINSTANCE.getVerticalPosType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalPosTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVerticalPosTypeToString(StylePackage.eINSTANCE.getVerticalPosType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalRelType createVerticalRelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVerticalRelTypeFromString(StylePackage.eINSTANCE.getVerticalRelType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalRelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVerticalRelTypeToString(StylePackage.eINSTANCE.getVerticalRelType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapContourModeType createWrapContourModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWrapContourModeTypeFromString(StylePackage.eINSTANCE.getWrapContourModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWrapContourModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWrapContourModeTypeToString(StylePackage.eINSTANCE.getWrapContourModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapType createWrapTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWrapTypeFromString(StylePackage.eINSTANCE.getWrapType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWrapTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWrapTypeToString(StylePackage.eINSTANCE.getWrapType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritingModeType createWritingModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWritingModeTypeFromString(StylePackage.eINSTANCE.getWritingModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWritingModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWritingModeTypeToString(StylePackage.eINSTANCE.getWritingModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylePackage getStylePackage() {
		return (StylePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StylePackage getPackage() {
		return StylePackage.eINSTANCE;
	}

} //StyleFactoryImpl
