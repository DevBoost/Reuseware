/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextFactoryImpl extends EFactoryImpl implements TextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextFactory init() {
		try {
			TextFactory theTextFactory = (TextFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:text:1.0"); 
			if (theTextFactory != null) {
				return theTextFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFactoryImpl() {
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
			case TextPackage.ALPHABETICAL_INDEX_AUTO_MARK_FILE_TYPE: return createAlphabeticalIndexAutoMarkFileType();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE: return createAlphabeticalIndexEntryTemplateType();
			case TextPackage.ALPHABETICAL_INDEX_MARK_END_TYPE: return createAlphabeticalIndexMarkEndType();
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE: return createAlphabeticalIndexMarkStartType();
			case TextPackage.ALPHABETICAL_INDEX_MARK_TYPE: return createAlphabeticalIndexMarkType();
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE: return createAlphabeticalIndexSourceType();
			case TextPackage.ALPHABETICAL_INDEX_TYPE: return createAlphabeticalIndexType();
			case TextPackage.ANY_ATT_LIST_OR_ELEMENTS: return createAnyAttListOrElements();
			case TextPackage.ATYPE: return createAType();
			case TextPackage.AUTHOR_INITIALS_TYPE: return createAuthorInitialsType();
			case TextPackage.AUTHOR_NAME_TYPE: return createAuthorNameType();
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE: return createBibliographyConfigurationType();
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE: return createBibliographyEntryTemplateType();
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE: return createBibliographyMarkType();
			case TextPackage.BIBLIOGRAPHY_SOURCE_TYPE: return createBibliographySourceType();
			case TextPackage.BIBLIOGRAPHY_TYPE: return createBibliographyType();
			case TextPackage.BOOKMARK_END_TYPE: return createBookmarkEndType();
			case TextPackage.BOOKMARK_REF_TYPE: return createBookmarkRefType();
			case TextPackage.BOOKMARK_START_TYPE: return createBookmarkStartType();
			case TextPackage.BOOKMARK_TYPE: return createBookmarkType();
			case TextPackage.CHANGED_REGION_TYPE: return createChangedRegionType();
			case TextPackage.CHANGE_MARKS_TYPE: return createChangeMarksType();
			case TextPackage.CHAPTER_TYPE: return createChapterType();
			case TextPackage.CHARACTER_COUNT_TYPE: return createCharacterCountType();
			case TextPackage.COMMON_FORM_CONTROL_CONTENT: return createCommonFormControlContent();
			case TextPackage.CONDITIONAL_TEXT_TYPE: return createConditionalTextType();
			case TextPackage.CONFIG_ITEMS: return createConfigItems();
			case TextPackage.CREATION_DATE_TYPE: return createCreationDateType();
			case TextPackage.CREATION_TIME_TYPE: return createCreationTimeType();
			case TextPackage.CREATOR_TYPE: return createCreatorType();
			case TextPackage.DATABASE_NAME_TYPE: return createDatabaseNameType();
			case TextPackage.DATABASE_ROW_NUMBER_TYPE: return createDatabaseRowNumberType();
			case TextPackage.DATE_TYPE: return createDateType();
			case TextPackage.DDE_CONNECTION_DECLS_TYPE: return createDdeConnectionDeclsType();
			case TextPackage.DDE_CONNECTION_DECL_TYPE: return createDdeConnectionDeclType();
			case TextPackage.DDE_CONNECTION_TYPE: return createDdeConnectionType();
			case TextPackage.DELETION_TYPE: return createDeletionType();
			case TextPackage.DESCRIPTION_TYPE: return createDescriptionType();
			case TextPackage.EDITING_CYCLES_TYPE: return createEditingCyclesType();
			case TextPackage.EDITING_DURATION_TYPE: return createEditingDurationType();
			case TextPackage.EXECUTE_MACRO_TYPE: return createExecuteMacroType();
			case TextPackage.EXPRESSION_TYPE: return createExpressionType();
			case TextPackage.FILE_NAME_TYPE: return createFileNameType();
			case TextPackage.FORMAT_CHANGE_TYPE: return createFormatChangeType();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST: return createFormPropertyTypeAndValueList();
			case TextPackage.HEADER_FOOTER_CONTENT: return createHeaderFooterContent();
			case TextPackage.HIDDEN_PARAGRAPH_TYPE: return createHiddenParagraphType();
			case TextPackage.HIDDEN_TEXT_TYPE: return createHiddenTextType();
			case TextPackage.HTYPE: return createHType();
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE: return createIllustrationIndexSourceType();
			case TextPackage.ILLUSTRATION_INDEX_TYPE: return createIllustrationIndexType();
			case TextPackage.IMAGE_COUNT_TYPE: return createImageCountType();
			case TextPackage.INDEX_BODY_TYPE: return createIndexBodyType();
			case TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE: return createIndexEntryBibliographyType();
			case TextPackage.INDEX_ENTRY_CHAPTER_TYPE: return createIndexEntryChapterType();
			case TextPackage.INDEX_ENTRY_LINK_END_TYPE: return createIndexEntryLinkEndType();
			case TextPackage.INDEX_ENTRY_LINK_START_TYPE: return createIndexEntryLinkStartType();
			case TextPackage.INDEX_ENTRY_PAGE_NUMBER_TYPE: return createIndexEntryPageNumberType();
			case TextPackage.INDEX_ENTRY_SPAN_TYPE: return createIndexEntrySpanType();
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE: return createIndexEntryTabStopType();
			case TextPackage.INDEX_ENTRY_TEXT_TYPE: return createIndexEntryTextType();
			case TextPackage.INDEX_SOURCE_STYLES_TYPE: return createIndexSourceStylesType();
			case TextPackage.INDEX_SOURCE_STYLE_TYPE: return createIndexSourceStyleType();
			case TextPackage.INDEX_TITLE_TEMPLATE_TYPE: return createIndexTitleTemplateType();
			case TextPackage.INDEX_TITLE_TYPE: return createIndexTitleType();
			case TextPackage.INITIAL_CREATOR_TYPE: return createInitialCreatorType();
			case TextPackage.INSERTION_TYPE: return createInsertionType();
			case TextPackage.KEYWORDS_TYPE: return createKeywordsType();
			case TextPackage.LINE_BREAK_TYPE: return createLineBreakType();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE: return createLinenumberingConfigurationType();
			case TextPackage.LINENUMBERING_SEPARATOR_TYPE: return createLinenumberingSeparatorType();
			case TextPackage.LIST_ITEM_TYPE: return createListItemType();
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE: return createListLevelStyleBulletType();
			case TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE: return createListLevelStyleImageType();
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE: return createListLevelStyleNumberType();
			case TextPackage.LIST_STYLE_TYPE: return createListStyleType();
			case TextPackage.LIST_TYPE: return createListType();
			case TextPackage.MATH_MARKUP: return createMathMarkup();
			case TextPackage.MEASURE_TYPE: return createMeasureType();
			case TextPackage.MODIFICATION_DATE_TYPE: return createModificationDateType();
			case TextPackage.MODIFICATION_TIME_TYPE: return createModificationTimeType();
			case TextPackage.NOTE_BODY_TYPE: return createNoteBodyType();
			case TextPackage.NOTE_CITATION_TYPE: return createNoteCitationType();
			case TextPackage.NOTE_REF_TYPE: return createNoteRefType();
			case TextPackage.NOTE_TYPE: return createNoteType();
			case TextPackage.NUMBERED_PARAGRAPH_TYPE: return createNumberedParagraphType();
			case TextPackage.OBJECT_COUNT_TYPE: return createObjectCountType();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE: return createObjectIndexSourceType();
			case TextPackage.OBJECT_INDEX_TYPE: return createObjectIndexType();
			case TextPackage.OFFICE_BODY_CONTENT: return createOfficeBodyContent();
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE: return createOfficeChartContentMainType();
			case TextPackage.OFFICE_IMAGE_CONTENT_MAIN: return createOfficeImageContentMain();
			case TextPackage.OFFICE_META: return createOfficeMeta();
			case TextPackage.OFFICE_META_CONTENT: return createOfficeMetaContent();
			case TextPackage.OUTLINE_LEVEL_STYLE_TYPE: return createOutlineLevelStyleType();
			case TextPackage.OUTLINE_STYLE_TYPE: return createOutlineStyleType();
			case TextPackage.PAGE_CONTINUATION_TYPE: return createPageContinuationType();
			case TextPackage.PAGE_COUNT_TYPE: return createPageCountType();
			case TextPackage.PAGE_NUMBER_TYPE: return createPageNumberType();
			case TextPackage.PAGE_SEQUENCE_TYPE: return createPageSequenceType();
			case TextPackage.PAGE_TYPE: return createPageType();
			case TextPackage.PAGE_VARIABLE_GET_TYPE: return createPageVariableGetType();
			case TextPackage.PAGE_VARIABLE_SET_TYPE: return createPageVariableSetType();
			case TextPackage.PARAGRAPH_COUNT_TYPE: return createParagraphCountType();
			case TextPackage.PLACEHOLDER_TYPE: return createPlaceholderType();
			case TextPackage.PRINT_DATE_TYPE: return createPrintDateType();
			case TextPackage.PRINTED_BY_TYPE: return createPrintedByType();
			case TextPackage.PRINT_TIME_TYPE: return createPrintTimeType();
			case TextPackage.PTYPE: return createPType();
			case TextPackage.REFERENCE_MARK_END_TYPE: return createReferenceMarkEndType();
			case TextPackage.REFERENCE_MARK_START_TYPE: return createReferenceMarkStartType();
			case TextPackage.REFERENCE_MARK_TYPE: return createReferenceMarkType();
			case TextPackage.REFERENCE_REF_TYPE: return createReferenceRefType();
			case TextPackage.REGION_CONTENT: return createRegionContent();
			case TextPackage.RUBY_BASE_TYPE: return createRubyBaseType();
			case TextPackage.RUBY_TEXT_TYPE: return createRubyTextType();
			case TextPackage.RUBY_TYPE: return createRubyType();
			case TextPackage.SCRIPT_TYPE: return createScriptType();
			case TextPackage.SECTION_SOURCE_TYPE: return createSectionSourceType();
			case TextPackage.SECTION_TYPE: return createSectionType();
			case TextPackage.SENDER_CITY_TYPE: return createSenderCityType();
			case TextPackage.SENDER_COMPANY_TYPE: return createSenderCompanyType();
			case TextPackage.SENDER_COUNTRY_TYPE: return createSenderCountryType();
			case TextPackage.SENDER_EMAIL_TYPE: return createSenderEmailType();
			case TextPackage.SENDER_FAX_TYPE: return createSenderFaxType();
			case TextPackage.SENDER_FIRSTNAME_TYPE: return createSenderFirstnameType();
			case TextPackage.SENDER_INITIALS_TYPE: return createSenderInitialsType();
			case TextPackage.SENDER_LASTNAME_TYPE: return createSenderLastnameType();
			case TextPackage.SENDER_PHONE_PRIVATE_TYPE: return createSenderPhonePrivateType();
			case TextPackage.SENDER_PHONE_WORK_TYPE: return createSenderPhoneWorkType();
			case TextPackage.SENDER_POSITION_TYPE: return createSenderPositionType();
			case TextPackage.SENDER_POSTAL_CODE_TYPE: return createSenderPostalCodeType();
			case TextPackage.SENDER_STATE_OR_PROVINCE_TYPE: return createSenderStateOrProvinceType();
			case TextPackage.SENDER_STREET_TYPE: return createSenderStreetType();
			case TextPackage.SENDER_TITLE_TYPE: return createSenderTitleType();
			case TextPackage.SEQUENCE_DECLS_TYPE: return createSequenceDeclsType();
			case TextPackage.SEQUENCE_DECL_TYPE: return createSequenceDeclType();
			case TextPackage.SEQUENCE_REF_TYPE: return createSequenceRefType();
			case TextPackage.SEQUENCE_TYPE: return createSequenceType();
			case TextPackage.SOFT_PAGE_BREAK_TYPE: return createSoftPageBreakType();
			case TextPackage.SORT_KEY_TYPE: return createSortKeyType();
			case TextPackage.SPAN_TYPE: return createSpanType();
			case TextPackage.STYLE_CHART_PROPERTIES_CONTENT: return createStyleChartPropertiesContent();
			case TextPackage.STYLE_DRAWING_PAGE_PROPERTIES_CONTENT: return createStyleDrawingPagePropertiesContent();
			case TextPackage.STYLE_GRAPHIC_PROPERTIES_CONTENT: return createStyleGraphicPropertiesContent();
			case TextPackage.STYLE_HEADER_FOOTER_PROPERTIES_CONTENT: return createStyleHeaderFooterPropertiesContent();
			case TextPackage.STYLE_LIST_LEVEL_PROPERTIES_CONTENT: return createStyleListLevelPropertiesContent();
			case TextPackage.STYLE_PAGE_LAYOUT_PROPERTIES_CONTENT: return createStylePageLayoutPropertiesContent();
			case TextPackage.STYLE_PARAGRAPH_PROPERTIES_CONTENT: return createStyleParagraphPropertiesContent();
			case TextPackage.STYLE_PROPERTIES_CONTENT: return createStylePropertiesContent();
			case TextPackage.STYLE_RUBY_PROPERTIES_CONTENT: return createStyleRubyPropertiesContent();
			case TextPackage.STYLE_SECTION_PROPERTIES_CONTENT: return createStyleSectionPropertiesContent();
			case TextPackage.STYLE_STYLE_CONTENT: return createStyleStyleContent();
			case TextPackage.STYLE_TABLE_CELL_PROPERTIES_CONTENT: return createStyleTableCellPropertiesContent();
			case TextPackage.STYLE_TABLE_COLUMN_PROPERTIES_CONTENT: return createStyleTableColumnPropertiesContent();
			case TextPackage.STYLE_TABLE_PROPERTIES_CONTENT: return createStyleTablePropertiesContent();
			case TextPackage.STYLE_TABLE_ROW_PROPERTIES_CONTENT: return createStyleTableRowPropertiesContent();
			case TextPackage.STYLE_TEXT_PROPERTIES_CONTENT: return createStyleTextPropertiesContent();
			case TextPackage.STYPE: return createSType();
			case TextPackage.SUBJECT_TYPE: return createSubjectType();
			case TextPackage.TABLE_COUNT_TYPE: return createTableCountType();
			case TextPackage.TABLE_FORMULA_TYPE: return createTableFormulaType();
			case TextPackage.TABLE_INDEX_SOURCE_TYPE: return createTableIndexSourceType();
			case TextPackage.TABLE_INDEX_TYPE: return createTableIndexType();
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE: return createTableOfContentEntryTemplateType();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE: return createTableOfContentSourceType();
			case TextPackage.TABLE_OF_CONTENT_TYPE: return createTableOfContentType();
			case TextPackage.TABLE_TABLE_CELL_CONTENT: return createTableTableCellContent();
			case TextPackage.TAB_TYPE: return createTabType();
			case TextPackage.TEMPLATE_NAME_TYPE: return createTemplateNameType();
			case TextPackage.TEXT_CHANGED_REGION_CONTENT: return createTextChangedRegionContent();
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST: return createTextDatabaseDisplayAttlist();
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST: return createTextDatabaseNextAttlist();
			case TextPackage.TEXT_DATABASE_ROW_SELECT_ATTLIST: return createTextDatabaseRowSelectAttlist();
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT: return createTextIllustrationIndexEntryContent();
			case TextPackage.TEXT_INPUT_TYPE: return createTextInputType();
			case TextPackage.TEXT_LIST_ITEM_CONTENT: return createTextListItemContent();
			case TextPackage.TEXT_LIST_LEVEL_STYLE_IMAGE_ATTR: return createTextListLevelStyleImageAttr();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT: return createTextNotesConfigurationContent();
			case TextPackage.TEXT_SECTION_SOURCE_DDE_TYPE: return createTextSectionSourceDdeType();
			case TextPackage.TIME_TYPE: return createTimeType();
			case TextPackage.TITLE_TYPE: return createTitleType();
			case TextPackage.TOC_MARK_END_TYPE: return createTocMarkEndType();
			case TextPackage.TOC_MARK_START_TYPE: return createTocMarkStartType();
			case TextPackage.TOC_MARK_TYPE: return createTocMarkType();
			case TextPackage.TRACKED_CHANGES_TYPE: return createTrackedChangesType();
			case TextPackage.USER_DEFINED_TYPE: return createUserDefinedType();
			case TextPackage.USER_FIELD_DECLS_TYPE: return createUserFieldDeclsType();
			case TextPackage.USER_FIELD_DECL_TYPE: return createUserFieldDeclType();
			case TextPackage.USER_FIELD_GET_TYPE: return createUserFieldGetType();
			case TextPackage.USER_FIELD_INPUT_TYPE: return createUserFieldInputType();
			case TextPackage.USER_INDEX_ENTRY_TEMPLATE_TYPE: return createUserIndexEntryTemplateType();
			case TextPackage.USER_INDEX_MARK_END_TYPE: return createUserIndexMarkEndType();
			case TextPackage.USER_INDEX_MARK_START_TYPE: return createUserIndexMarkStartType();
			case TextPackage.USER_INDEX_MARK_TYPE: return createUserIndexMarkType();
			case TextPackage.USER_INDEX_SOURCE_TYPE: return createUserIndexSourceType();
			case TextPackage.USER_INDEX_TYPE: return createUserIndexType();
			case TextPackage.VARIABLE_DECLS_TYPE: return createVariableDeclsType();
			case TextPackage.VARIABLE_DECL_TYPE: return createVariableDeclType();
			case TextPackage.VARIABLE_GET_TYPE: return createVariableGetType();
			case TextPackage.VARIABLE_INPUT_TYPE: return createVariableInputType();
			case TextPackage.VARIABLE_SET_TYPE: return createVariableSetType();
			case TextPackage.WORD_COUNT_TYPE: return createWordCountType();
			case TextPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
			case TextPackage.ANCHOR_TYPE_TYPE:
				return createAnchorTypeTypeFromString(eDataType, initialValue);
			case TextPackage.BIBLIOGRAPHY_DATA_FIELD_TYPE:
				return createBibliographyDataFieldTypeFromString(eDataType, initialValue);
			case TextPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case TextPackage.CAPTION_SEQUENCE_FORMAT_TYPE:
				return createCaptionSequenceFormatTypeFromString(eDataType, initialValue);
			case TextPackage.CUSTOM_SHAPE_TYPE_MEMBER1:
				return createCustomShapeTypeMember1FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE:
				return createDisplayTypeFromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE1:
				return createDisplayType1FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE2:
				return createDisplayType2FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE3:
				return createDisplayType3FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE4:
				return createDisplayType4FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE5:
				return createDisplayType5FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE6:
				return createDisplayType6FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE7:
				return createDisplayType7FromString(eDataType, initialValue);
			case TextPackage.FONT_FAMILY_GENERIC:
				return createFontFamilyGenericFromString(eDataType, initialValue);
			case TextPackage.FONT_PITCH:
				return createFontPitchFromString(eDataType, initialValue);
			case TextPackage.FONT_STYLE:
				return createFontStyleFromString(eDataType, initialValue);
			case TextPackage.FONT_VARIANT:
				return createFontVariantFromString(eDataType, initialValue);
			case TextPackage.FONT_WEIGHT:
				return createFontWeightFromString(eDataType, initialValue);
			case TextPackage.FOOTNOTES_POSITION_TYPE:
				return createFootnotesPositionTypeFromString(eDataType, initialValue);
			case TextPackage.GRADIENT_STYLE:
				return createGradientStyleFromString(eDataType, initialValue);
			case TextPackage.HORI_BACK_POS:
				return createHoriBackPosFromString(eDataType, initialValue);
			case TextPackage.HORIZONTAL_MIRROR:
				return createHorizontalMirrorFromString(eDataType, initialValue);
			case TextPackage.INDEX_SCOPE_TYPE:
				return createIndexScopeTypeFromString(eDataType, initialValue);
			case TextPackage.INDEX_SCOPE_TYPE1:
				return createIndexScopeType1FromString(eDataType, initialValue);
			case TextPackage.KEY_TYPE:
				return createKeyTypeFromString(eDataType, initialValue);
			case TextPackage.KIND_TYPE:
				return createKindTypeFromString(eDataType, initialValue);
			case TextPackage.LINE_MODE:
				return createLineModeFromString(eDataType, initialValue);
			case TextPackage.LINE_STYLE:
				return createLineStyleFromString(eDataType, initialValue);
			case TextPackage.LINE_TYPE:
				return createLineTypeFromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER3:
				return createLineWidthMember3FromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER4:
				return createLineWidthMember4FromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER5:
				return createLineWidthMember5FromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER6:
				return createLineWidthMember6FromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER7:
				return createLineWidthMember7FromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER8:
				return createLineWidthMember8FromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER9:
				return createLineWidthMember9FromString(eDataType, initialValue);
			case TextPackage.NAVIGATION:
				return createNavigationFromString(eDataType, initialValue);
			case TextPackage.NOTE_CLASS_TYPE:
				return createNoteClassTypeFromString(eDataType, initialValue);
			case TextPackage.NUMBER_POSITION_TYPE:
				return createNumberPositionTypeFromString(eDataType, initialValue);
			case TextPackage.OUTLINE_LEVEL_TYPE:
				return createOutlineLevelTypeFromString(eDataType, initialValue);
			case TextPackage.PLACEHOLDER_TYPE_TYPE:
				return createPlaceholderTypeTypeFromString(eDataType, initialValue);
			case TextPackage.PRESENTATION_CLASSES:
				return createPresentationClassesFromString(eDataType, initialValue);
			case TextPackage.PRESENTATION_EFFECT_DIRECTIONS:
				return createPresentationEffectDirectionsFromString(eDataType, initialValue);
			case TextPackage.PRESENTATION_EFFECTS:
				return createPresentationEffectsFromString(eDataType, initialValue);
			case TextPackage.PRESENTATION_SPEEDS:
				return createPresentationSpeedsFromString(eDataType, initialValue);
			case TextPackage.REFERENCE_FORMAT_TYPE:
				return createReferenceFormatTypeFromString(eDataType, initialValue);
			case TextPackage.REFERENCE_FORMAT_TYPE1:
				return createReferenceFormatType1FromString(eDataType, initialValue);
			case TextPackage.ROW_OR_COL:
				return createRowOrColFromString(eDataType, initialValue);
			case TextPackage.SELECT_PAGE_TYPE:
				return createSelectPageTypeFromString(eDataType, initialValue);
			case TextPackage.SELECT_PAGE_TYPE1:
				return createSelectPageType1FromString(eDataType, initialValue);
			case TextPackage.SHADOW_TYPE_MEMBER1:
				return createShadowTypeMember1FromString(eDataType, initialValue);
			case TextPackage.START_NUMBERING_AT_TYPE:
				return createStartNumberingAtTypeFromString(eDataType, initialValue);
			case TextPackage.STATES:
				return createStatesFromString(eDataType, initialValue);
			case TextPackage.TAB_CYCLES:
				return createTabCyclesFromString(eDataType, initialValue);
			case TextPackage.TABLE_TYPE_TYPE:
				return createTableTypeTypeFromString(eDataType, initialValue);
			case TextPackage.TABLE_VISIBILITY_VALUE:
				return createTableVisibilityValueFromString(eDataType, initialValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER1:
				return createTargetFrameNameMember1FromString(eDataType, initialValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER2:
				return createTargetFrameNameMember2FromString(eDataType, initialValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER3:
				return createTargetFrameNameMember3FromString(eDataType, initialValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER4:
				return createTargetFrameNameMember4FromString(eDataType, initialValue);
			case TextPackage.TEXT_BIBLIOGRAPHY_TYPES:
				return createTextBibliographyTypesFromString(eDataType, initialValue);
			case TextPackage.TYPES:
				return createTypesFromString(eDataType, initialValue);
			case TextPackage.VALUE_TYPE:
				return createValueTypeFromString(eDataType, initialValue);
			case TextPackage.VERT_BACK_POS:
				return createVertBackPosFromString(eDataType, initialValue);
			case TextPackage.ANCHOR_TYPE_TYPE_OBJECT:
				return createAnchorTypeTypeObjectFromString(eDataType, initialValue);
			case TextPackage.ANY_URI:
				return createAnyURIFromString(eDataType, initialValue);
			case TextPackage.BASE64_BINARY:
				return createBase64BinaryFromString(eDataType, initialValue);
			case TextPackage.BIBLIOGRAPHY_DATA_FIELD_TYPE_OBJECT:
				return createBibliographyDataFieldTypeObjectFromString(eDataType, initialValue);
			case TextPackage.BOOLEAN_OBJECT:
				return createBooleanObjectFromString(eDataType, initialValue);
			case TextPackage.BORDER_WIDTHS:
				return createBorderWidthsFromString(eDataType, initialValue);
			case TextPackage.BORDER_WIDTHS_BASE:
				return createBorderWidthsBaseFromString(eDataType, initialValue);
			case TextPackage.BORDER_WIDTHS_BASE_ITEM:
				return createBorderWidthsBaseItemFromString(eDataType, initialValue);
			case TextPackage.CAPTION_SEQUENCE_FORMAT_TYPE_OBJECT:
				return createCaptionSequenceFormatTypeObjectFromString(eDataType, initialValue);
			case TextPackage.CELL_ADDRESS:
				return createCellAddressFromString(eDataType, initialValue);
			case TextPackage.CELL_RANGE_ADDRESS:
				return createCellRangeAddressFromString(eDataType, initialValue);
			case TextPackage.CELL_RANGE_ADDRESS_LIST:
				return createCellRangeAddressListFromString(eDataType, initialValue);
			case TextPackage.CHARACTER:
				return createCharacterFromString(eDataType, initialValue);
			case TextPackage.CITATION_BODY_STYLE_NAME_TYPE:
				return createCitationBodyStyleNameTypeFromString(eDataType, initialValue);
			case TextPackage.CITATION_BODY_STYLE_NAME_TYPE_MEMBER1:
				return createCitationBodyStyleNameTypeMember1FromString(eDataType, initialValue);
			case TextPackage.CITATION_STYLE_NAME_TYPE:
				return createCitationStyleNameTypeFromString(eDataType, initialValue);
			case TextPackage.CITATION_STYLE_NAME_TYPE_MEMBER1:
				return createCitationStyleNameTypeMember1FromString(eDataType, initialValue);
			case TextPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case TextPackage.COND_STYLE_NAME_TYPE:
				return createCondStyleNameTypeFromString(eDataType, initialValue);
			case TextPackage.COND_STYLE_NAME_TYPE_MEMBER1:
				return createCondStyleNameTypeMember1FromString(eDataType, initialValue);
			case TextPackage.COORDINATE:
				return createCoordinateFromString(eDataType, initialValue);
			case TextPackage.COUNTRY_CODE:
				return createCountryCodeFromString(eDataType, initialValue);
			case TextPackage.CUSTOM_SHAPE_TYPE:
				return createCustomShapeTypeFromString(eDataType, initialValue);
			case TextPackage.CUSTOM_SHAPE_TYPE_MEMBER1_OBJECT:
				return createCustomShapeTypeMember1ObjectFromString(eDataType, initialValue);
			case TextPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case TextPackage.DATE_OR_DATE_TIME:
				return createDateOrDateTimeFromString(eDataType, initialValue);
			case TextPackage.DATE_TIME:
				return createDateTimeFromString(eDataType, initialValue);
			case TextPackage.DEFAULT_STYLE_NAME_TYPE:
				return createDefaultStyleNameTypeFromString(eDataType, initialValue);
			case TextPackage.DEFAULT_STYLE_NAME_TYPE_MEMBER1:
				return createDefaultStyleNameTypeMember1FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE_OBJECT:
				return createDisplayTypeObjectFromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE_OBJECT1:
				return createDisplayTypeObject1FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE_OBJECT2:
				return createDisplayTypeObject2FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE_OBJECT3:
				return createDisplayTypeObject3FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE_OBJECT4:
				return createDisplayTypeObject4FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE_OBJECT5:
				return createDisplayTypeObject5FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE_OBJECT6:
				return createDisplayTypeObject6FromString(eDataType, initialValue);
			case TextPackage.DISPLAY_TYPE_OBJECT7:
				return createDisplayTypeObject7FromString(eDataType, initialValue);
			case TextPackage.DISTANCE:
				return createDistanceFromString(eDataType, initialValue);
			case TextPackage.DOUBLE:
				return createDoubleFromString(eDataType, initialValue);
			case TextPackage.DOUBLE_OBJECT:
				return createDoubleObjectFromString(eDataType, initialValue);
			case TextPackage.DURATION:
				return createDurationFromString(eDataType, initialValue);
			case TextPackage.FONT_FAMILY_GENERIC_OBJECT:
				return createFontFamilyGenericObjectFromString(eDataType, initialValue);
			case TextPackage.FONT_PITCH_OBJECT:
				return createFontPitchObjectFromString(eDataType, initialValue);
			case TextPackage.FONT_STYLE_OBJECT:
				return createFontStyleObjectFromString(eDataType, initialValue);
			case TextPackage.FONT_VARIANT_OBJECT:
				return createFontVariantObjectFromString(eDataType, initialValue);
			case TextPackage.FONT_WEIGHT_OBJECT:
				return createFontWeightObjectFromString(eDataType, initialValue);
			case TextPackage.FOOTNOTES_POSITION_TYPE_OBJECT:
				return createFootnotesPositionTypeObjectFromString(eDataType, initialValue);
			case TextPackage.FORMULA:
				return createFormulaFromString(eDataType, initialValue);
			case TextPackage.GRADIENT_STYLE_OBJECT:
				return createGradientStyleObjectFromString(eDataType, initialValue);
			case TextPackage.HORI_BACK_POS_OBJECT:
				return createHoriBackPosObjectFromString(eDataType, initialValue);
			case TextPackage.HORIZONTAL_MIRROR_OBJECT:
				return createHorizontalMirrorObjectFromString(eDataType, initialValue);
			case TextPackage.ID:
				return createIDFromString(eDataType, initialValue);
			case TextPackage.IDREF:
				return createIDREFFromString(eDataType, initialValue);
			case TextPackage.IDREFS:
				return createIDREFSFromString(eDataType, initialValue);
			case TextPackage.INDEX_SCOPE_TYPE_OBJECT:
				return createIndexScopeTypeObjectFromString(eDataType, initialValue);
			case TextPackage.INDEX_SCOPE_TYPE_OBJECT1:
				return createIndexScopeTypeObject1FromString(eDataType, initialValue);
			case TextPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case TextPackage.KEY_TYPE_OBJECT:
				return createKeyTypeObjectFromString(eDataType, initialValue);
			case TextPackage.KIND_TYPE_OBJECT:
				return createKindTypeObjectFromString(eDataType, initialValue);
			case TextPackage.LANGUAGE:
				return createLanguageFromString(eDataType, initialValue);
			case TextPackage.LANGUAGE_CODE:
				return createLanguageCodeFromString(eDataType, initialValue);
			case TextPackage.LENGTH:
				return createLengthFromString(eDataType, initialValue);
			case TextPackage.LINE_MODE_OBJECT:
				return createLineModeObjectFromString(eDataType, initialValue);
			case TextPackage.LINE_STYLE_OBJECT:
				return createLineStyleObjectFromString(eDataType, initialValue);
			case TextPackage.LINE_TYPE_OBJECT:
				return createLineTypeObjectFromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH:
				return createLineWidthFromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER3_OBJECT:
				return createLineWidthMember3ObjectFromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER4_OBJECT:
				return createLineWidthMember4ObjectFromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER5_OBJECT:
				return createLineWidthMember5ObjectFromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER6_OBJECT:
				return createLineWidthMember6ObjectFromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER7_OBJECT:
				return createLineWidthMember7ObjectFromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER8_OBJECT:
				return createLineWidthMember8ObjectFromString(eDataType, initialValue);
			case TextPackage.LINE_WIDTH_MEMBER9_OBJECT:
				return createLineWidthMember9ObjectFromString(eDataType, initialValue);
			case TextPackage.MAIN_ENTRY_STYLE_NAME_TYPE:
				return createMainEntryStyleNameTypeFromString(eDataType, initialValue);
			case TextPackage.MAIN_ENTRY_STYLE_NAME_TYPE_MEMBER1:
				return createMainEntryStyleNameTypeMember1FromString(eDataType, initialValue);
			case TextPackage.MASTER_PAGE_NAME_TYPE:
				return createMasterPageNameTypeFromString(eDataType, initialValue);
			case TextPackage.MASTER_PAGE_NAME_TYPE1:
				return createMasterPageNameType1FromString(eDataType, initialValue);
			case TextPackage.MASTER_PAGE_NAME_TYPE_MEMBER1:
				return createMasterPageNameTypeMember1FromString(eDataType, initialValue);
			case TextPackage.MASTER_PAGE_NAME_TYPE_MEMBER11:
				return createMasterPageNameTypeMember11FromString(eDataType, initialValue);
			case TextPackage.NAMESPACED_TOKEN:
				return createNamespacedTokenFromString(eDataType, initialValue);
			case TextPackage.NAVIGATION_OBJECT:
				return createNavigationObjectFromString(eDataType, initialValue);
			case TextPackage.NON_NEGATIVE_INTEGER:
				return createNonNegativeIntegerFromString(eDataType, initialValue);
			case TextPackage.NON_NEGATIVE_LENGTH:
				return createNonNegativeLengthFromString(eDataType, initialValue);
			case TextPackage.NON_NEGATIVE_PIXEL_LENGTH:
				return createNonNegativePixelLengthFromString(eDataType, initialValue);
			case TextPackage.NOTE_CLASS_TYPE_OBJECT:
				return createNoteClassTypeObjectFromString(eDataType, initialValue);
			case TextPackage.NUMBER_POSITION_TYPE_OBJECT:
				return createNumberPositionTypeObjectFromString(eDataType, initialValue);
			case TextPackage.OUTLINE_LEVEL_TYPE_OBJECT:
				return createOutlineLevelTypeObjectFromString(eDataType, initialValue);
			case TextPackage.PARAGRAPH_STYLE_NAME_TYPE:
				return createParagraphStyleNameTypeFromString(eDataType, initialValue);
			case TextPackage.PARAGRAPH_STYLE_NAME_TYPE_MEMBER1:
				return createParagraphStyleNameTypeMember1FromString(eDataType, initialValue);
			case TextPackage.PATH_DATA:
				return createPathDataFromString(eDataType, initialValue);
			case TextPackage.PERCENT:
				return createPercentFromString(eDataType, initialValue);
			case TextPackage.PLACEHOLDER_TYPE_TYPE_OBJECT:
				return createPlaceholderTypeTypeObjectFromString(eDataType, initialValue);
			case TextPackage.POINT3_D:
				return createPoint3DFromString(eDataType, initialValue);
			case TextPackage.POINTS:
				return createPointsFromString(eDataType, initialValue);
			case TextPackage.POSITIVE_INTEGER:
				return createPositiveIntegerFromString(eDataType, initialValue);
			case TextPackage.POSITIVE_LENGTH:
				return createPositiveLengthFromString(eDataType, initialValue);
			case TextPackage.PRESENTATION_CLASSES_OBJECT:
				return createPresentationClassesObjectFromString(eDataType, initialValue);
			case TextPackage.PRESENTATION_EFFECT_DIRECTIONS_OBJECT:
				return createPresentationEffectDirectionsObjectFromString(eDataType, initialValue);
			case TextPackage.PRESENTATION_EFFECTS_OBJECT:
				return createPresentationEffectsObjectFromString(eDataType, initialValue);
			case TextPackage.PRESENTATION_SPEEDS_OBJECT:
				return createPresentationSpeedsObjectFromString(eDataType, initialValue);
			case TextPackage.REFERENCE_FORMAT_TYPE_OBJECT:
				return createReferenceFormatTypeObjectFromString(eDataType, initialValue);
			case TextPackage.REFERENCE_FORMAT_TYPE_OBJECT1:
				return createReferenceFormatTypeObject1FromString(eDataType, initialValue);
			case TextPackage.RELATIVE_LENGTH:
				return createRelativeLengthFromString(eDataType, initialValue);
			case TextPackage.ROW_OR_COL_OBJECT:
				return createRowOrColObjectFromString(eDataType, initialValue);
			case TextPackage.SELECT_PAGE_TYPE_OBJECT:
				return createSelectPageTypeObjectFromString(eDataType, initialValue);
			case TextPackage.SELECT_PAGE_TYPE_OBJECT1:
				return createSelectPageTypeObject1FromString(eDataType, initialValue);
			case TextPackage.SHADOW_TYPE:
				return createShadowTypeFromString(eDataType, initialValue);
			case TextPackage.SHADOW_TYPE_MEMBER1_OBJECT:
				return createShadowTypeMember1ObjectFromString(eDataType, initialValue);
			case TextPackage.START_NUMBERING_AT_TYPE_OBJECT:
				return createStartNumberingAtTypeObjectFromString(eDataType, initialValue);
			case TextPackage.STATES_OBJECT:
				return createStatesObjectFromString(eDataType, initialValue);
			case TextPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME:
				return createStyleNameFromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_REF:
				return createStyleNameRefFromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_REFS:
				return createStyleNameRefsFromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE:
				return createStyleNameTypeFromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE1:
				return createStyleNameType1FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE2:
				return createStyleNameType2FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE3:
				return createStyleNameType3FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE4:
				return createStyleNameType4FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE5:
				return createStyleNameType5FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE6:
				return createStyleNameType6FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE7:
				return createStyleNameType7FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE8:
				return createStyleNameType8FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE9:
				return createStyleNameType9FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE10:
				return createStyleNameType10FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE11:
				return createStyleNameType11FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE12:
				return createStyleNameType12FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE13:
				return createStyleNameType13FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE14:
				return createStyleNameType14FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE15:
				return createStyleNameType15FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE16:
				return createStyleNameType16FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE17:
				return createStyleNameType17FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE18:
				return createStyleNameType18FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE19:
				return createStyleNameType19FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE20:
				return createStyleNameType20FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE21:
				return createStyleNameType21FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE22:
				return createStyleNameType22FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE23:
				return createStyleNameType23FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE24:
				return createStyleNameType24FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE25:
				return createStyleNameType25FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER1:
				return createStyleNameTypeMember1FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER11:
				return createStyleNameTypeMember11FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER12:
				return createStyleNameTypeMember12FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER13:
				return createStyleNameTypeMember13FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER14:
				return createStyleNameTypeMember14FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER15:
				return createStyleNameTypeMember15FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER16:
				return createStyleNameTypeMember16FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER17:
				return createStyleNameTypeMember17FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER18:
				return createStyleNameTypeMember18FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER19:
				return createStyleNameTypeMember19FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER110:
				return createStyleNameTypeMember110FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER111:
				return createStyleNameTypeMember111FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER112:
				return createStyleNameTypeMember112FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER113:
				return createStyleNameTypeMember113FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER114:
				return createStyleNameTypeMember114FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER115:
				return createStyleNameTypeMember115FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER116:
				return createStyleNameTypeMember116FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER117:
				return createStyleNameTypeMember117FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER118:
				return createStyleNameTypeMember118FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER119:
				return createStyleNameTypeMember119FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER120:
				return createStyleNameTypeMember120FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER121:
				return createStyleNameTypeMember121FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER122:
				return createStyleNameTypeMember122FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER123:
				return createStyleNameTypeMember123FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER124:
				return createStyleNameTypeMember124FromString(eDataType, initialValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER125:
				return createStyleNameTypeMember125FromString(eDataType, initialValue);
			case TextPackage.TAB_CYCLES_OBJECT:
				return createTabCyclesObjectFromString(eDataType, initialValue);
			case TextPackage.TABLE_TYPE_TYPE_OBJECT:
				return createTableTypeTypeObjectFromString(eDataType, initialValue);
			case TextPackage.TABLE_VISIBILITY_VALUE_OBJECT:
				return createTableVisibilityValueObjectFromString(eDataType, initialValue);
			case TextPackage.TARGET_FRAME_NAME:
				return createTargetFrameNameFromString(eDataType, initialValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER1_OBJECT:
				return createTargetFrameNameMember1ObjectFromString(eDataType, initialValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER2_OBJECT:
				return createTargetFrameNameMember2ObjectFromString(eDataType, initialValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER3_OBJECT:
				return createTargetFrameNameMember3ObjectFromString(eDataType, initialValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER4_OBJECT:
				return createTargetFrameNameMember4ObjectFromString(eDataType, initialValue);
			case TextPackage.TEXT_BIBLIOGRAPHY_TYPES_OBJECT:
				return createTextBibliographyTypesObjectFromString(eDataType, initialValue);
			case TextPackage.TEXT_ENCODING:
				return createTextEncodingFromString(eDataType, initialValue);
			case TextPackage.TIME:
				return createTimeFromString(eDataType, initialValue);
			case TextPackage.TIME_OR_DATE_TIME:
				return createTimeOrDateTimeFromString(eDataType, initialValue);
			case TextPackage.TYPES_OBJECT:
				return createTypesObjectFromString(eDataType, initialValue);
			case TextPackage.VALUE_TYPE_OBJECT:
				return createValueTypeObjectFromString(eDataType, initialValue);
			case TextPackage.VARIABLE_NAME:
				return createVariableNameFromString(eDataType, initialValue);
			case TextPackage.VECTOR3_D:
				return createVector3DFromString(eDataType, initialValue);
			case TextPackage.VERT_BACK_POS_OBJECT:
				return createVertBackPosObjectFromString(eDataType, initialValue);
			case TextPackage.VISITED_STYLE_NAME_TYPE:
				return createVisitedStyleNameTypeFromString(eDataType, initialValue);
			case TextPackage.VISITED_STYLE_NAME_TYPE_MEMBER1:
				return createVisitedStyleNameTypeMember1FromString(eDataType, initialValue);
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
			case TextPackage.ANCHOR_TYPE_TYPE:
				return convertAnchorTypeTypeToString(eDataType, instanceValue);
			case TextPackage.BIBLIOGRAPHY_DATA_FIELD_TYPE:
				return convertBibliographyDataFieldTypeToString(eDataType, instanceValue);
			case TextPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case TextPackage.CAPTION_SEQUENCE_FORMAT_TYPE:
				return convertCaptionSequenceFormatTypeToString(eDataType, instanceValue);
			case TextPackage.CUSTOM_SHAPE_TYPE_MEMBER1:
				return convertCustomShapeTypeMember1ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE:
				return convertDisplayTypeToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE1:
				return convertDisplayType1ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE2:
				return convertDisplayType2ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE3:
				return convertDisplayType3ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE4:
				return convertDisplayType4ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE5:
				return convertDisplayType5ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE6:
				return convertDisplayType6ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE7:
				return convertDisplayType7ToString(eDataType, instanceValue);
			case TextPackage.FONT_FAMILY_GENERIC:
				return convertFontFamilyGenericToString(eDataType, instanceValue);
			case TextPackage.FONT_PITCH:
				return convertFontPitchToString(eDataType, instanceValue);
			case TextPackage.FONT_STYLE:
				return convertFontStyleToString(eDataType, instanceValue);
			case TextPackage.FONT_VARIANT:
				return convertFontVariantToString(eDataType, instanceValue);
			case TextPackage.FONT_WEIGHT:
				return convertFontWeightToString(eDataType, instanceValue);
			case TextPackage.FOOTNOTES_POSITION_TYPE:
				return convertFootnotesPositionTypeToString(eDataType, instanceValue);
			case TextPackage.GRADIENT_STYLE:
				return convertGradientStyleToString(eDataType, instanceValue);
			case TextPackage.HORI_BACK_POS:
				return convertHoriBackPosToString(eDataType, instanceValue);
			case TextPackage.HORIZONTAL_MIRROR:
				return convertHorizontalMirrorToString(eDataType, instanceValue);
			case TextPackage.INDEX_SCOPE_TYPE:
				return convertIndexScopeTypeToString(eDataType, instanceValue);
			case TextPackage.INDEX_SCOPE_TYPE1:
				return convertIndexScopeType1ToString(eDataType, instanceValue);
			case TextPackage.KEY_TYPE:
				return convertKeyTypeToString(eDataType, instanceValue);
			case TextPackage.KIND_TYPE:
				return convertKindTypeToString(eDataType, instanceValue);
			case TextPackage.LINE_MODE:
				return convertLineModeToString(eDataType, instanceValue);
			case TextPackage.LINE_STYLE:
				return convertLineStyleToString(eDataType, instanceValue);
			case TextPackage.LINE_TYPE:
				return convertLineTypeToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER3:
				return convertLineWidthMember3ToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER4:
				return convertLineWidthMember4ToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER5:
				return convertLineWidthMember5ToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER6:
				return convertLineWidthMember6ToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER7:
				return convertLineWidthMember7ToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER8:
				return convertLineWidthMember8ToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER9:
				return convertLineWidthMember9ToString(eDataType, instanceValue);
			case TextPackage.NAVIGATION:
				return convertNavigationToString(eDataType, instanceValue);
			case TextPackage.NOTE_CLASS_TYPE:
				return convertNoteClassTypeToString(eDataType, instanceValue);
			case TextPackage.NUMBER_POSITION_TYPE:
				return convertNumberPositionTypeToString(eDataType, instanceValue);
			case TextPackage.OUTLINE_LEVEL_TYPE:
				return convertOutlineLevelTypeToString(eDataType, instanceValue);
			case TextPackage.PLACEHOLDER_TYPE_TYPE:
				return convertPlaceholderTypeTypeToString(eDataType, instanceValue);
			case TextPackage.PRESENTATION_CLASSES:
				return convertPresentationClassesToString(eDataType, instanceValue);
			case TextPackage.PRESENTATION_EFFECT_DIRECTIONS:
				return convertPresentationEffectDirectionsToString(eDataType, instanceValue);
			case TextPackage.PRESENTATION_EFFECTS:
				return convertPresentationEffectsToString(eDataType, instanceValue);
			case TextPackage.PRESENTATION_SPEEDS:
				return convertPresentationSpeedsToString(eDataType, instanceValue);
			case TextPackage.REFERENCE_FORMAT_TYPE:
				return convertReferenceFormatTypeToString(eDataType, instanceValue);
			case TextPackage.REFERENCE_FORMAT_TYPE1:
				return convertReferenceFormatType1ToString(eDataType, instanceValue);
			case TextPackage.ROW_OR_COL:
				return convertRowOrColToString(eDataType, instanceValue);
			case TextPackage.SELECT_PAGE_TYPE:
				return convertSelectPageTypeToString(eDataType, instanceValue);
			case TextPackage.SELECT_PAGE_TYPE1:
				return convertSelectPageType1ToString(eDataType, instanceValue);
			case TextPackage.SHADOW_TYPE_MEMBER1:
				return convertShadowTypeMember1ToString(eDataType, instanceValue);
			case TextPackage.START_NUMBERING_AT_TYPE:
				return convertStartNumberingAtTypeToString(eDataType, instanceValue);
			case TextPackage.STATES:
				return convertStatesToString(eDataType, instanceValue);
			case TextPackage.TAB_CYCLES:
				return convertTabCyclesToString(eDataType, instanceValue);
			case TextPackage.TABLE_TYPE_TYPE:
				return convertTableTypeTypeToString(eDataType, instanceValue);
			case TextPackage.TABLE_VISIBILITY_VALUE:
				return convertTableVisibilityValueToString(eDataType, instanceValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER1:
				return convertTargetFrameNameMember1ToString(eDataType, instanceValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER2:
				return convertTargetFrameNameMember2ToString(eDataType, instanceValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER3:
				return convertTargetFrameNameMember3ToString(eDataType, instanceValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER4:
				return convertTargetFrameNameMember4ToString(eDataType, instanceValue);
			case TextPackage.TEXT_BIBLIOGRAPHY_TYPES:
				return convertTextBibliographyTypesToString(eDataType, instanceValue);
			case TextPackage.TYPES:
				return convertTypesToString(eDataType, instanceValue);
			case TextPackage.VALUE_TYPE:
				return convertValueTypeToString(eDataType, instanceValue);
			case TextPackage.VERT_BACK_POS:
				return convertVertBackPosToString(eDataType, instanceValue);
			case TextPackage.ANCHOR_TYPE_TYPE_OBJECT:
				return convertAnchorTypeTypeObjectToString(eDataType, instanceValue);
			case TextPackage.ANY_URI:
				return convertAnyURIToString(eDataType, instanceValue);
			case TextPackage.BASE64_BINARY:
				return convertBase64BinaryToString(eDataType, instanceValue);
			case TextPackage.BIBLIOGRAPHY_DATA_FIELD_TYPE_OBJECT:
				return convertBibliographyDataFieldTypeObjectToString(eDataType, instanceValue);
			case TextPackage.BOOLEAN_OBJECT:
				return convertBooleanObjectToString(eDataType, instanceValue);
			case TextPackage.BORDER_WIDTHS:
				return convertBorderWidthsToString(eDataType, instanceValue);
			case TextPackage.BORDER_WIDTHS_BASE:
				return convertBorderWidthsBaseToString(eDataType, instanceValue);
			case TextPackage.BORDER_WIDTHS_BASE_ITEM:
				return convertBorderWidthsBaseItemToString(eDataType, instanceValue);
			case TextPackage.CAPTION_SEQUENCE_FORMAT_TYPE_OBJECT:
				return convertCaptionSequenceFormatTypeObjectToString(eDataType, instanceValue);
			case TextPackage.CELL_ADDRESS:
				return convertCellAddressToString(eDataType, instanceValue);
			case TextPackage.CELL_RANGE_ADDRESS:
				return convertCellRangeAddressToString(eDataType, instanceValue);
			case TextPackage.CELL_RANGE_ADDRESS_LIST:
				return convertCellRangeAddressListToString(eDataType, instanceValue);
			case TextPackage.CHARACTER:
				return convertCharacterToString(eDataType, instanceValue);
			case TextPackage.CITATION_BODY_STYLE_NAME_TYPE:
				return convertCitationBodyStyleNameTypeToString(eDataType, instanceValue);
			case TextPackage.CITATION_BODY_STYLE_NAME_TYPE_MEMBER1:
				return convertCitationBodyStyleNameTypeMember1ToString(eDataType, instanceValue);
			case TextPackage.CITATION_STYLE_NAME_TYPE:
				return convertCitationStyleNameTypeToString(eDataType, instanceValue);
			case TextPackage.CITATION_STYLE_NAME_TYPE_MEMBER1:
				return convertCitationStyleNameTypeMember1ToString(eDataType, instanceValue);
			case TextPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case TextPackage.COND_STYLE_NAME_TYPE:
				return convertCondStyleNameTypeToString(eDataType, instanceValue);
			case TextPackage.COND_STYLE_NAME_TYPE_MEMBER1:
				return convertCondStyleNameTypeMember1ToString(eDataType, instanceValue);
			case TextPackage.COORDINATE:
				return convertCoordinateToString(eDataType, instanceValue);
			case TextPackage.COUNTRY_CODE:
				return convertCountryCodeToString(eDataType, instanceValue);
			case TextPackage.CUSTOM_SHAPE_TYPE:
				return convertCustomShapeTypeToString(eDataType, instanceValue);
			case TextPackage.CUSTOM_SHAPE_TYPE_MEMBER1_OBJECT:
				return convertCustomShapeTypeMember1ObjectToString(eDataType, instanceValue);
			case TextPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case TextPackage.DATE_OR_DATE_TIME:
				return convertDateOrDateTimeToString(eDataType, instanceValue);
			case TextPackage.DATE_TIME:
				return convertDateTimeToString(eDataType, instanceValue);
			case TextPackage.DEFAULT_STYLE_NAME_TYPE:
				return convertDefaultStyleNameTypeToString(eDataType, instanceValue);
			case TextPackage.DEFAULT_STYLE_NAME_TYPE_MEMBER1:
				return convertDefaultStyleNameTypeMember1ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE_OBJECT:
				return convertDisplayTypeObjectToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE_OBJECT1:
				return convertDisplayTypeObject1ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE_OBJECT2:
				return convertDisplayTypeObject2ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE_OBJECT3:
				return convertDisplayTypeObject3ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE_OBJECT4:
				return convertDisplayTypeObject4ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE_OBJECT5:
				return convertDisplayTypeObject5ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE_OBJECT6:
				return convertDisplayTypeObject6ToString(eDataType, instanceValue);
			case TextPackage.DISPLAY_TYPE_OBJECT7:
				return convertDisplayTypeObject7ToString(eDataType, instanceValue);
			case TextPackage.DISTANCE:
				return convertDistanceToString(eDataType, instanceValue);
			case TextPackage.DOUBLE:
				return convertDoubleToString(eDataType, instanceValue);
			case TextPackage.DOUBLE_OBJECT:
				return convertDoubleObjectToString(eDataType, instanceValue);
			case TextPackage.DURATION:
				return convertDurationToString(eDataType, instanceValue);
			case TextPackage.FONT_FAMILY_GENERIC_OBJECT:
				return convertFontFamilyGenericObjectToString(eDataType, instanceValue);
			case TextPackage.FONT_PITCH_OBJECT:
				return convertFontPitchObjectToString(eDataType, instanceValue);
			case TextPackage.FONT_STYLE_OBJECT:
				return convertFontStyleObjectToString(eDataType, instanceValue);
			case TextPackage.FONT_VARIANT_OBJECT:
				return convertFontVariantObjectToString(eDataType, instanceValue);
			case TextPackage.FONT_WEIGHT_OBJECT:
				return convertFontWeightObjectToString(eDataType, instanceValue);
			case TextPackage.FOOTNOTES_POSITION_TYPE_OBJECT:
				return convertFootnotesPositionTypeObjectToString(eDataType, instanceValue);
			case TextPackage.FORMULA:
				return convertFormulaToString(eDataType, instanceValue);
			case TextPackage.GRADIENT_STYLE_OBJECT:
				return convertGradientStyleObjectToString(eDataType, instanceValue);
			case TextPackage.HORI_BACK_POS_OBJECT:
				return convertHoriBackPosObjectToString(eDataType, instanceValue);
			case TextPackage.HORIZONTAL_MIRROR_OBJECT:
				return convertHorizontalMirrorObjectToString(eDataType, instanceValue);
			case TextPackage.ID:
				return convertIDToString(eDataType, instanceValue);
			case TextPackage.IDREF:
				return convertIDREFToString(eDataType, instanceValue);
			case TextPackage.IDREFS:
				return convertIDREFSToString(eDataType, instanceValue);
			case TextPackage.INDEX_SCOPE_TYPE_OBJECT:
				return convertIndexScopeTypeObjectToString(eDataType, instanceValue);
			case TextPackage.INDEX_SCOPE_TYPE_OBJECT1:
				return convertIndexScopeTypeObject1ToString(eDataType, instanceValue);
			case TextPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case TextPackage.KEY_TYPE_OBJECT:
				return convertKeyTypeObjectToString(eDataType, instanceValue);
			case TextPackage.KIND_TYPE_OBJECT:
				return convertKindTypeObjectToString(eDataType, instanceValue);
			case TextPackage.LANGUAGE:
				return convertLanguageToString(eDataType, instanceValue);
			case TextPackage.LANGUAGE_CODE:
				return convertLanguageCodeToString(eDataType, instanceValue);
			case TextPackage.LENGTH:
				return convertLengthToString(eDataType, instanceValue);
			case TextPackage.LINE_MODE_OBJECT:
				return convertLineModeObjectToString(eDataType, instanceValue);
			case TextPackage.LINE_STYLE_OBJECT:
				return convertLineStyleObjectToString(eDataType, instanceValue);
			case TextPackage.LINE_TYPE_OBJECT:
				return convertLineTypeObjectToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH:
				return convertLineWidthToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER3_OBJECT:
				return convertLineWidthMember3ObjectToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER4_OBJECT:
				return convertLineWidthMember4ObjectToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER5_OBJECT:
				return convertLineWidthMember5ObjectToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER6_OBJECT:
				return convertLineWidthMember6ObjectToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER7_OBJECT:
				return convertLineWidthMember7ObjectToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER8_OBJECT:
				return convertLineWidthMember8ObjectToString(eDataType, instanceValue);
			case TextPackage.LINE_WIDTH_MEMBER9_OBJECT:
				return convertLineWidthMember9ObjectToString(eDataType, instanceValue);
			case TextPackage.MAIN_ENTRY_STYLE_NAME_TYPE:
				return convertMainEntryStyleNameTypeToString(eDataType, instanceValue);
			case TextPackage.MAIN_ENTRY_STYLE_NAME_TYPE_MEMBER1:
				return convertMainEntryStyleNameTypeMember1ToString(eDataType, instanceValue);
			case TextPackage.MASTER_PAGE_NAME_TYPE:
				return convertMasterPageNameTypeToString(eDataType, instanceValue);
			case TextPackage.MASTER_PAGE_NAME_TYPE1:
				return convertMasterPageNameType1ToString(eDataType, instanceValue);
			case TextPackage.MASTER_PAGE_NAME_TYPE_MEMBER1:
				return convertMasterPageNameTypeMember1ToString(eDataType, instanceValue);
			case TextPackage.MASTER_PAGE_NAME_TYPE_MEMBER11:
				return convertMasterPageNameTypeMember11ToString(eDataType, instanceValue);
			case TextPackage.NAMESPACED_TOKEN:
				return convertNamespacedTokenToString(eDataType, instanceValue);
			case TextPackage.NAVIGATION_OBJECT:
				return convertNavigationObjectToString(eDataType, instanceValue);
			case TextPackage.NON_NEGATIVE_INTEGER:
				return convertNonNegativeIntegerToString(eDataType, instanceValue);
			case TextPackage.NON_NEGATIVE_LENGTH:
				return convertNonNegativeLengthToString(eDataType, instanceValue);
			case TextPackage.NON_NEGATIVE_PIXEL_LENGTH:
				return convertNonNegativePixelLengthToString(eDataType, instanceValue);
			case TextPackage.NOTE_CLASS_TYPE_OBJECT:
				return convertNoteClassTypeObjectToString(eDataType, instanceValue);
			case TextPackage.NUMBER_POSITION_TYPE_OBJECT:
				return convertNumberPositionTypeObjectToString(eDataType, instanceValue);
			case TextPackage.OUTLINE_LEVEL_TYPE_OBJECT:
				return convertOutlineLevelTypeObjectToString(eDataType, instanceValue);
			case TextPackage.PARAGRAPH_STYLE_NAME_TYPE:
				return convertParagraphStyleNameTypeToString(eDataType, instanceValue);
			case TextPackage.PARAGRAPH_STYLE_NAME_TYPE_MEMBER1:
				return convertParagraphStyleNameTypeMember1ToString(eDataType, instanceValue);
			case TextPackage.PATH_DATA:
				return convertPathDataToString(eDataType, instanceValue);
			case TextPackage.PERCENT:
				return convertPercentToString(eDataType, instanceValue);
			case TextPackage.PLACEHOLDER_TYPE_TYPE_OBJECT:
				return convertPlaceholderTypeTypeObjectToString(eDataType, instanceValue);
			case TextPackage.POINT3_D:
				return convertPoint3DToString(eDataType, instanceValue);
			case TextPackage.POINTS:
				return convertPointsToString(eDataType, instanceValue);
			case TextPackage.POSITIVE_INTEGER:
				return convertPositiveIntegerToString(eDataType, instanceValue);
			case TextPackage.POSITIVE_LENGTH:
				return convertPositiveLengthToString(eDataType, instanceValue);
			case TextPackage.PRESENTATION_CLASSES_OBJECT:
				return convertPresentationClassesObjectToString(eDataType, instanceValue);
			case TextPackage.PRESENTATION_EFFECT_DIRECTIONS_OBJECT:
				return convertPresentationEffectDirectionsObjectToString(eDataType, instanceValue);
			case TextPackage.PRESENTATION_EFFECTS_OBJECT:
				return convertPresentationEffectsObjectToString(eDataType, instanceValue);
			case TextPackage.PRESENTATION_SPEEDS_OBJECT:
				return convertPresentationSpeedsObjectToString(eDataType, instanceValue);
			case TextPackage.REFERENCE_FORMAT_TYPE_OBJECT:
				return convertReferenceFormatTypeObjectToString(eDataType, instanceValue);
			case TextPackage.REFERENCE_FORMAT_TYPE_OBJECT1:
				return convertReferenceFormatTypeObject1ToString(eDataType, instanceValue);
			case TextPackage.RELATIVE_LENGTH:
				return convertRelativeLengthToString(eDataType, instanceValue);
			case TextPackage.ROW_OR_COL_OBJECT:
				return convertRowOrColObjectToString(eDataType, instanceValue);
			case TextPackage.SELECT_PAGE_TYPE_OBJECT:
				return convertSelectPageTypeObjectToString(eDataType, instanceValue);
			case TextPackage.SELECT_PAGE_TYPE_OBJECT1:
				return convertSelectPageTypeObject1ToString(eDataType, instanceValue);
			case TextPackage.SHADOW_TYPE:
				return convertShadowTypeToString(eDataType, instanceValue);
			case TextPackage.SHADOW_TYPE_MEMBER1_OBJECT:
				return convertShadowTypeMember1ObjectToString(eDataType, instanceValue);
			case TextPackage.START_NUMBERING_AT_TYPE_OBJECT:
				return convertStartNumberingAtTypeObjectToString(eDataType, instanceValue);
			case TextPackage.STATES_OBJECT:
				return convertStatesObjectToString(eDataType, instanceValue);
			case TextPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME:
				return convertStyleNameToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_REF:
				return convertStyleNameRefToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_REFS:
				return convertStyleNameRefsToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE:
				return convertStyleNameTypeToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE1:
				return convertStyleNameType1ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE2:
				return convertStyleNameType2ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE3:
				return convertStyleNameType3ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE4:
				return convertStyleNameType4ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE5:
				return convertStyleNameType5ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE6:
				return convertStyleNameType6ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE7:
				return convertStyleNameType7ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE8:
				return convertStyleNameType8ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE9:
				return convertStyleNameType9ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE10:
				return convertStyleNameType10ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE11:
				return convertStyleNameType11ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE12:
				return convertStyleNameType12ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE13:
				return convertStyleNameType13ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE14:
				return convertStyleNameType14ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE15:
				return convertStyleNameType15ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE16:
				return convertStyleNameType16ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE17:
				return convertStyleNameType17ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE18:
				return convertStyleNameType18ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE19:
				return convertStyleNameType19ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE20:
				return convertStyleNameType20ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE21:
				return convertStyleNameType21ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE22:
				return convertStyleNameType22ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE23:
				return convertStyleNameType23ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE24:
				return convertStyleNameType24ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE25:
				return convertStyleNameType25ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER1:
				return convertStyleNameTypeMember1ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER11:
				return convertStyleNameTypeMember11ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER12:
				return convertStyleNameTypeMember12ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER13:
				return convertStyleNameTypeMember13ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER14:
				return convertStyleNameTypeMember14ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER15:
				return convertStyleNameTypeMember15ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER16:
				return convertStyleNameTypeMember16ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER17:
				return convertStyleNameTypeMember17ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER18:
				return convertStyleNameTypeMember18ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER19:
				return convertStyleNameTypeMember19ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER110:
				return convertStyleNameTypeMember110ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER111:
				return convertStyleNameTypeMember111ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER112:
				return convertStyleNameTypeMember112ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER113:
				return convertStyleNameTypeMember113ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER114:
				return convertStyleNameTypeMember114ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER115:
				return convertStyleNameTypeMember115ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER116:
				return convertStyleNameTypeMember116ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER117:
				return convertStyleNameTypeMember117ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER118:
				return convertStyleNameTypeMember118ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER119:
				return convertStyleNameTypeMember119ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER120:
				return convertStyleNameTypeMember120ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER121:
				return convertStyleNameTypeMember121ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER122:
				return convertStyleNameTypeMember122ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER123:
				return convertStyleNameTypeMember123ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER124:
				return convertStyleNameTypeMember124ToString(eDataType, instanceValue);
			case TextPackage.STYLE_NAME_TYPE_MEMBER125:
				return convertStyleNameTypeMember125ToString(eDataType, instanceValue);
			case TextPackage.TAB_CYCLES_OBJECT:
				return convertTabCyclesObjectToString(eDataType, instanceValue);
			case TextPackage.TABLE_TYPE_TYPE_OBJECT:
				return convertTableTypeTypeObjectToString(eDataType, instanceValue);
			case TextPackage.TABLE_VISIBILITY_VALUE_OBJECT:
				return convertTableVisibilityValueObjectToString(eDataType, instanceValue);
			case TextPackage.TARGET_FRAME_NAME:
				return convertTargetFrameNameToString(eDataType, instanceValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER1_OBJECT:
				return convertTargetFrameNameMember1ObjectToString(eDataType, instanceValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER2_OBJECT:
				return convertTargetFrameNameMember2ObjectToString(eDataType, instanceValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER3_OBJECT:
				return convertTargetFrameNameMember3ObjectToString(eDataType, instanceValue);
			case TextPackage.TARGET_FRAME_NAME_MEMBER4_OBJECT:
				return convertTargetFrameNameMember4ObjectToString(eDataType, instanceValue);
			case TextPackage.TEXT_BIBLIOGRAPHY_TYPES_OBJECT:
				return convertTextBibliographyTypesObjectToString(eDataType, instanceValue);
			case TextPackage.TEXT_ENCODING:
				return convertTextEncodingToString(eDataType, instanceValue);
			case TextPackage.TIME:
				return convertTimeToString(eDataType, instanceValue);
			case TextPackage.TIME_OR_DATE_TIME:
				return convertTimeOrDateTimeToString(eDataType, instanceValue);
			case TextPackage.TYPES_OBJECT:
				return convertTypesObjectToString(eDataType, instanceValue);
			case TextPackage.VALUE_TYPE_OBJECT:
				return convertValueTypeObjectToString(eDataType, instanceValue);
			case TextPackage.VARIABLE_NAME:
				return convertVariableNameToString(eDataType, instanceValue);
			case TextPackage.VECTOR3_D:
				return convertVector3DToString(eDataType, instanceValue);
			case TextPackage.VERT_BACK_POS_OBJECT:
				return convertVertBackPosObjectToString(eDataType, instanceValue);
			case TextPackage.VISITED_STYLE_NAME_TYPE:
				return convertVisitedStyleNameTypeToString(eDataType, instanceValue);
			case TextPackage.VISITED_STYLE_NAME_TYPE_MEMBER1:
				return convertVisitedStyleNameTypeMember1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexAutoMarkFileType createAlphabeticalIndexAutoMarkFileType() {
		AlphabeticalIndexAutoMarkFileTypeImpl alphabeticalIndexAutoMarkFileType = new AlphabeticalIndexAutoMarkFileTypeImpl();
		return alphabeticalIndexAutoMarkFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexEntryTemplateType createAlphabeticalIndexEntryTemplateType() {
		AlphabeticalIndexEntryTemplateTypeImpl alphabeticalIndexEntryTemplateType = new AlphabeticalIndexEntryTemplateTypeImpl();
		return alphabeticalIndexEntryTemplateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexMarkEndType createAlphabeticalIndexMarkEndType() {
		AlphabeticalIndexMarkEndTypeImpl alphabeticalIndexMarkEndType = new AlphabeticalIndexMarkEndTypeImpl();
		return alphabeticalIndexMarkEndType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexMarkStartType createAlphabeticalIndexMarkStartType() {
		AlphabeticalIndexMarkStartTypeImpl alphabeticalIndexMarkStartType = new AlphabeticalIndexMarkStartTypeImpl();
		return alphabeticalIndexMarkStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexMarkType createAlphabeticalIndexMarkType() {
		AlphabeticalIndexMarkTypeImpl alphabeticalIndexMarkType = new AlphabeticalIndexMarkTypeImpl();
		return alphabeticalIndexMarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexSourceType createAlphabeticalIndexSourceType() {
		AlphabeticalIndexSourceTypeImpl alphabeticalIndexSourceType = new AlphabeticalIndexSourceTypeImpl();
		return alphabeticalIndexSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexType createAlphabeticalIndexType() {
		AlphabeticalIndexTypeImpl alphabeticalIndexType = new AlphabeticalIndexTypeImpl();
		return alphabeticalIndexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyAttListOrElements createAnyAttListOrElements() {
		AnyAttListOrElementsImpl anyAttListOrElements = new AnyAttListOrElementsImpl();
		return anyAttListOrElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AType createAType() {
		ATypeImpl aType = new ATypeImpl();
		return aType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorInitialsType createAuthorInitialsType() {
		AuthorInitialsTypeImpl authorInitialsType = new AuthorInitialsTypeImpl();
		return authorInitialsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorNameType createAuthorNameType() {
		AuthorNameTypeImpl authorNameType = new AuthorNameTypeImpl();
		return authorNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyConfigurationType createBibliographyConfigurationType() {
		BibliographyConfigurationTypeImpl bibliographyConfigurationType = new BibliographyConfigurationTypeImpl();
		return bibliographyConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyEntryTemplateType createBibliographyEntryTemplateType() {
		BibliographyEntryTemplateTypeImpl bibliographyEntryTemplateType = new BibliographyEntryTemplateTypeImpl();
		return bibliographyEntryTemplateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyMarkType createBibliographyMarkType() {
		BibliographyMarkTypeImpl bibliographyMarkType = new BibliographyMarkTypeImpl();
		return bibliographyMarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographySourceType createBibliographySourceType() {
		BibliographySourceTypeImpl bibliographySourceType = new BibliographySourceTypeImpl();
		return bibliographySourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyType createBibliographyType() {
		BibliographyTypeImpl bibliographyType = new BibliographyTypeImpl();
		return bibliographyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookmarkEndType createBookmarkEndType() {
		BookmarkEndTypeImpl bookmarkEndType = new BookmarkEndTypeImpl();
		return bookmarkEndType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookmarkRefType createBookmarkRefType() {
		BookmarkRefTypeImpl bookmarkRefType = new BookmarkRefTypeImpl();
		return bookmarkRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookmarkStartType createBookmarkStartType() {
		BookmarkStartTypeImpl bookmarkStartType = new BookmarkStartTypeImpl();
		return bookmarkStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookmarkType createBookmarkType() {
		BookmarkTypeImpl bookmarkType = new BookmarkTypeImpl();
		return bookmarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangedRegionType createChangedRegionType() {
		ChangedRegionTypeImpl changedRegionType = new ChangedRegionTypeImpl();
		return changedRegionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMarksType createChangeMarksType() {
		ChangeMarksTypeImpl changeMarksType = new ChangeMarksTypeImpl();
		return changeMarksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChapterType createChapterType() {
		ChapterTypeImpl chapterType = new ChapterTypeImpl();
		return chapterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterCountType createCharacterCountType() {
		CharacterCountTypeImpl characterCountType = new CharacterCountTypeImpl();
		return characterCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFormControlContent createCommonFormControlContent() {
		CommonFormControlContentImpl commonFormControlContent = new CommonFormControlContentImpl();
		return commonFormControlContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalTextType createConditionalTextType() {
		ConditionalTextTypeImpl conditionalTextType = new ConditionalTextTypeImpl();
		return conditionalTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigItems createConfigItems() {
		ConfigItemsImpl configItems = new ConfigItemsImpl();
		return configItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationDateType createCreationDateType() {
		CreationDateTypeImpl creationDateType = new CreationDateTypeImpl();
		return creationDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationTimeType createCreationTimeType() {
		CreationTimeTypeImpl creationTimeType = new CreationTimeTypeImpl();
		return creationTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatorType createCreatorType() {
		CreatorTypeImpl creatorType = new CreatorTypeImpl();
		return creatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseNameType createDatabaseNameType() {
		DatabaseNameTypeImpl databaseNameType = new DatabaseNameTypeImpl();
		return databaseNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseRowNumberType createDatabaseRowNumberType() {
		DatabaseRowNumberTypeImpl databaseRowNumberType = new DatabaseRowNumberTypeImpl();
		return databaseRowNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeConnectionDeclsType createDdeConnectionDeclsType() {
		DdeConnectionDeclsTypeImpl ddeConnectionDeclsType = new DdeConnectionDeclsTypeImpl();
		return ddeConnectionDeclsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeConnectionDeclType createDdeConnectionDeclType() {
		DdeConnectionDeclTypeImpl ddeConnectionDeclType = new DdeConnectionDeclTypeImpl();
		return ddeConnectionDeclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeConnectionType createDdeConnectionType() {
		DdeConnectionTypeImpl ddeConnectionType = new DdeConnectionTypeImpl();
		return ddeConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionType createDeletionType() {
		DeletionTypeImpl deletionType = new DeletionTypeImpl();
		return deletionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingCyclesType createEditingCyclesType() {
		EditingCyclesTypeImpl editingCyclesType = new EditingCyclesTypeImpl();
		return editingCyclesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDurationType createEditingDurationType() {
		EditingDurationTypeImpl editingDurationType = new EditingDurationTypeImpl();
		return editingDurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteMacroType createExecuteMacroType() {
		ExecuteMacroTypeImpl executeMacroType = new ExecuteMacroTypeImpl();
		return executeMacroType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType createExpressionType() {
		ExpressionTypeImpl expressionType = new ExpressionTypeImpl();
		return expressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNameType createFileNameType() {
		FileNameTypeImpl fileNameType = new FileNameTypeImpl();
		return fileNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatChangeType createFormatChangeType() {
		FormatChangeTypeImpl formatChangeType = new FormatChangeTypeImpl();
		return formatChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormPropertyTypeAndValueList createFormPropertyTypeAndValueList() {
		FormPropertyTypeAndValueListImpl formPropertyTypeAndValueList = new FormPropertyTypeAndValueListImpl();
		return formPropertyTypeAndValueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderFooterContent createHeaderFooterContent() {
		HeaderFooterContentImpl headerFooterContent = new HeaderFooterContentImpl();
		return headerFooterContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HiddenParagraphType createHiddenParagraphType() {
		HiddenParagraphTypeImpl hiddenParagraphType = new HiddenParagraphTypeImpl();
		return hiddenParagraphType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HiddenTextType createHiddenTextType() {
		HiddenTextTypeImpl hiddenTextType = new HiddenTextTypeImpl();
		return hiddenTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HType createHType() {
		HTypeImpl hType = new HTypeImpl();
		return hType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IllustrationIndexSourceType createIllustrationIndexSourceType() {
		IllustrationIndexSourceTypeImpl illustrationIndexSourceType = new IllustrationIndexSourceTypeImpl();
		return illustrationIndexSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IllustrationIndexType createIllustrationIndexType() {
		IllustrationIndexTypeImpl illustrationIndexType = new IllustrationIndexTypeImpl();
		return illustrationIndexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageCountType createImageCountType() {
		ImageCountTypeImpl imageCountType = new ImageCountTypeImpl();
		return imageCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexBodyType createIndexBodyType() {
		IndexBodyTypeImpl indexBodyType = new IndexBodyTypeImpl();
		return indexBodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryBibliographyType createIndexEntryBibliographyType() {
		IndexEntryBibliographyTypeImpl indexEntryBibliographyType = new IndexEntryBibliographyTypeImpl();
		return indexEntryBibliographyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryChapterType createIndexEntryChapterType() {
		IndexEntryChapterTypeImpl indexEntryChapterType = new IndexEntryChapterTypeImpl();
		return indexEntryChapterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryLinkEndType createIndexEntryLinkEndType() {
		IndexEntryLinkEndTypeImpl indexEntryLinkEndType = new IndexEntryLinkEndTypeImpl();
		return indexEntryLinkEndType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryLinkStartType createIndexEntryLinkStartType() {
		IndexEntryLinkStartTypeImpl indexEntryLinkStartType = new IndexEntryLinkStartTypeImpl();
		return indexEntryLinkStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryPageNumberType createIndexEntryPageNumberType() {
		IndexEntryPageNumberTypeImpl indexEntryPageNumberType = new IndexEntryPageNumberTypeImpl();
		return indexEntryPageNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntrySpanType createIndexEntrySpanType() {
		IndexEntrySpanTypeImpl indexEntrySpanType = new IndexEntrySpanTypeImpl();
		return indexEntrySpanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryTabStopType createIndexEntryTabStopType() {
		IndexEntryTabStopTypeImpl indexEntryTabStopType = new IndexEntryTabStopTypeImpl();
		return indexEntryTabStopType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexEntryTextType createIndexEntryTextType() {
		IndexEntryTextTypeImpl indexEntryTextType = new IndexEntryTextTypeImpl();
		return indexEntryTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexSourceStylesType createIndexSourceStylesType() {
		IndexSourceStylesTypeImpl indexSourceStylesType = new IndexSourceStylesTypeImpl();
		return indexSourceStylesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexSourceStyleType createIndexSourceStyleType() {
		IndexSourceStyleTypeImpl indexSourceStyleType = new IndexSourceStyleTypeImpl();
		return indexSourceStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexTitleTemplateType createIndexTitleTemplateType() {
		IndexTitleTemplateTypeImpl indexTitleTemplateType = new IndexTitleTemplateTypeImpl();
		return indexTitleTemplateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexTitleType createIndexTitleType() {
		IndexTitleTypeImpl indexTitleType = new IndexTitleTypeImpl();
		return indexTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialCreatorType createInitialCreatorType() {
		InitialCreatorTypeImpl initialCreatorType = new InitialCreatorTypeImpl();
		return initialCreatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertionType createInsertionType() {
		InsertionTypeImpl insertionType = new InsertionTypeImpl();
		return insertionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordsType createKeywordsType() {
		KeywordsTypeImpl keywordsType = new KeywordsTypeImpl();
		return keywordsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineBreakType createLineBreakType() {
		LineBreakTypeImpl lineBreakType = new LineBreakTypeImpl();
		return lineBreakType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingConfigurationType createLinenumberingConfigurationType() {
		LinenumberingConfigurationTypeImpl linenumberingConfigurationType = new LinenumberingConfigurationTypeImpl();
		return linenumberingConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingSeparatorType createLinenumberingSeparatorType() {
		LinenumberingSeparatorTypeImpl linenumberingSeparatorType = new LinenumberingSeparatorTypeImpl();
		return linenumberingSeparatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemType createListItemType() {
		ListItemTypeImpl listItemType = new ListItemTypeImpl();
		return listItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListLevelStyleBulletType createListLevelStyleBulletType() {
		ListLevelStyleBulletTypeImpl listLevelStyleBulletType = new ListLevelStyleBulletTypeImpl();
		return listLevelStyleBulletType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListLevelStyleImageType createListLevelStyleImageType() {
		ListLevelStyleImageTypeImpl listLevelStyleImageType = new ListLevelStyleImageTypeImpl();
		return listLevelStyleImageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListLevelStyleNumberType createListLevelStyleNumberType() {
		ListLevelStyleNumberTypeImpl listLevelStyleNumberType = new ListLevelStyleNumberTypeImpl();
		return listLevelStyleNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStyleType createListStyleType() {
		ListStyleTypeImpl listStyleType = new ListStyleTypeImpl();
		return listStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListType createListType() {
		ListTypeImpl listType = new ListTypeImpl();
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathMarkup createMathMarkup() {
		MathMarkupImpl mathMarkup = new MathMarkupImpl();
		return mathMarkup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType createMeasureType() {
		MeasureTypeImpl measureType = new MeasureTypeImpl();
		return measureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationDateType createModificationDateType() {
		ModificationDateTypeImpl modificationDateType = new ModificationDateTypeImpl();
		return modificationDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationTimeType createModificationTimeType() {
		ModificationTimeTypeImpl modificationTimeType = new ModificationTimeTypeImpl();
		return modificationTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteBodyType createNoteBodyType() {
		NoteBodyTypeImpl noteBodyType = new NoteBodyTypeImpl();
		return noteBodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteCitationType createNoteCitationType() {
		NoteCitationTypeImpl noteCitationType = new NoteCitationTypeImpl();
		return noteCitationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteRefType createNoteRefType() {
		NoteRefTypeImpl noteRefType = new NoteRefTypeImpl();
		return noteRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberedParagraphType createNumberedParagraphType() {
		NumberedParagraphTypeImpl numberedParagraphType = new NumberedParagraphTypeImpl();
		return numberedParagraphType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectCountType createObjectCountType() {
		ObjectCountTypeImpl objectCountType = new ObjectCountTypeImpl();
		return objectCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIndexSourceType createObjectIndexSourceType() {
		ObjectIndexSourceTypeImpl objectIndexSourceType = new ObjectIndexSourceTypeImpl();
		return objectIndexSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIndexType createObjectIndexType() {
		ObjectIndexTypeImpl objectIndexType = new ObjectIndexTypeImpl();
		return objectIndexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeBodyContent createOfficeBodyContent() {
		OfficeBodyContentImpl officeBodyContent = new OfficeBodyContentImpl();
		return officeBodyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeChartContentMainType createOfficeChartContentMainType() {
		OfficeChartContentMainTypeImpl officeChartContentMainType = new OfficeChartContentMainTypeImpl();
		return officeChartContentMainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeImageContentMain createOfficeImageContentMain() {
		OfficeImageContentMainImpl officeImageContentMain = new OfficeImageContentMainImpl();
		return officeImageContentMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeMeta createOfficeMeta() {
		OfficeMetaImpl officeMeta = new OfficeMetaImpl();
		return officeMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeMetaContent createOfficeMetaContent() {
		OfficeMetaContentImpl officeMetaContent = new OfficeMetaContentImpl();
		return officeMetaContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineLevelStyleType createOutlineLevelStyleType() {
		OutlineLevelStyleTypeImpl outlineLevelStyleType = new OutlineLevelStyleTypeImpl();
		return outlineLevelStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineStyleType createOutlineStyleType() {
		OutlineStyleTypeImpl outlineStyleType = new OutlineStyleTypeImpl();
		return outlineStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageContinuationType createPageContinuationType() {
		PageContinuationTypeImpl pageContinuationType = new PageContinuationTypeImpl();
		return pageContinuationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageCountType createPageCountType() {
		PageCountTypeImpl pageCountType = new PageCountTypeImpl();
		return pageCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageNumberType createPageNumberType() {
		PageNumberTypeImpl pageNumberType = new PageNumberTypeImpl();
		return pageNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageSequenceType createPageSequenceType() {
		PageSequenceTypeImpl pageSequenceType = new PageSequenceTypeImpl();
		return pageSequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageType createPageType() {
		PageTypeImpl pageType = new PageTypeImpl();
		return pageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageVariableGetType createPageVariableGetType() {
		PageVariableGetTypeImpl pageVariableGetType = new PageVariableGetTypeImpl();
		return pageVariableGetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageVariableSetType createPageVariableSetType() {
		PageVariableSetTypeImpl pageVariableSetType = new PageVariableSetTypeImpl();
		return pageVariableSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParagraphCountType createParagraphCountType() {
		ParagraphCountTypeImpl paragraphCountType = new ParagraphCountTypeImpl();
		return paragraphCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderType createPlaceholderType() {
		PlaceholderTypeImpl placeholderType = new PlaceholderTypeImpl();
		return placeholderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintDateType createPrintDateType() {
		PrintDateTypeImpl printDateType = new PrintDateTypeImpl();
		return printDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintedByType createPrintedByType() {
		PrintedByTypeImpl printedByType = new PrintedByTypeImpl();
		return printedByType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintTimeType createPrintTimeType() {
		PrintTimeTypeImpl printTimeType = new PrintTimeTypeImpl();
		return printTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PType createPType() {
		PTypeImpl pType = new PTypeImpl();
		return pType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceMarkEndType createReferenceMarkEndType() {
		ReferenceMarkEndTypeImpl referenceMarkEndType = new ReferenceMarkEndTypeImpl();
		return referenceMarkEndType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceMarkStartType createReferenceMarkStartType() {
		ReferenceMarkStartTypeImpl referenceMarkStartType = new ReferenceMarkStartTypeImpl();
		return referenceMarkStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceMarkType createReferenceMarkType() {
		ReferenceMarkTypeImpl referenceMarkType = new ReferenceMarkTypeImpl();
		return referenceMarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceRefType createReferenceRefType() {
		ReferenceRefTypeImpl referenceRefType = new ReferenceRefTypeImpl();
		return referenceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionContent createRegionContent() {
		RegionContentImpl regionContent = new RegionContentImpl();
		return regionContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyBaseType createRubyBaseType() {
		RubyBaseTypeImpl rubyBaseType = new RubyBaseTypeImpl();
		return rubyBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyTextType createRubyTextType() {
		RubyTextTypeImpl rubyTextType = new RubyTextTypeImpl();
		return rubyTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyType createRubyType() {
		RubyTypeImpl rubyType = new RubyTypeImpl();
		return rubyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType createScriptType() {
		ScriptTypeImpl scriptType = new ScriptTypeImpl();
		return scriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionSourceType createSectionSourceType() {
		SectionSourceTypeImpl sectionSourceType = new SectionSourceTypeImpl();
		return sectionSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionType createSectionType() {
		SectionTypeImpl sectionType = new SectionTypeImpl();
		return sectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderCityType createSenderCityType() {
		SenderCityTypeImpl senderCityType = new SenderCityTypeImpl();
		return senderCityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderCompanyType createSenderCompanyType() {
		SenderCompanyTypeImpl senderCompanyType = new SenderCompanyTypeImpl();
		return senderCompanyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderCountryType createSenderCountryType() {
		SenderCountryTypeImpl senderCountryType = new SenderCountryTypeImpl();
		return senderCountryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderEmailType createSenderEmailType() {
		SenderEmailTypeImpl senderEmailType = new SenderEmailTypeImpl();
		return senderEmailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderFaxType createSenderFaxType() {
		SenderFaxTypeImpl senderFaxType = new SenderFaxTypeImpl();
		return senderFaxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderFirstnameType createSenderFirstnameType() {
		SenderFirstnameTypeImpl senderFirstnameType = new SenderFirstnameTypeImpl();
		return senderFirstnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderInitialsType createSenderInitialsType() {
		SenderInitialsTypeImpl senderInitialsType = new SenderInitialsTypeImpl();
		return senderInitialsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderLastnameType createSenderLastnameType() {
		SenderLastnameTypeImpl senderLastnameType = new SenderLastnameTypeImpl();
		return senderLastnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPhonePrivateType createSenderPhonePrivateType() {
		SenderPhonePrivateTypeImpl senderPhonePrivateType = new SenderPhonePrivateTypeImpl();
		return senderPhonePrivateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPhoneWorkType createSenderPhoneWorkType() {
		SenderPhoneWorkTypeImpl senderPhoneWorkType = new SenderPhoneWorkTypeImpl();
		return senderPhoneWorkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPositionType createSenderPositionType() {
		SenderPositionTypeImpl senderPositionType = new SenderPositionTypeImpl();
		return senderPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPostalCodeType createSenderPostalCodeType() {
		SenderPostalCodeTypeImpl senderPostalCodeType = new SenderPostalCodeTypeImpl();
		return senderPostalCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderStateOrProvinceType createSenderStateOrProvinceType() {
		SenderStateOrProvinceTypeImpl senderStateOrProvinceType = new SenderStateOrProvinceTypeImpl();
		return senderStateOrProvinceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderStreetType createSenderStreetType() {
		SenderStreetTypeImpl senderStreetType = new SenderStreetTypeImpl();
		return senderStreetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderTitleType createSenderTitleType() {
		SenderTitleTypeImpl senderTitleType = new SenderTitleTypeImpl();
		return senderTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDeclsType createSequenceDeclsType() {
		SequenceDeclsTypeImpl sequenceDeclsType = new SequenceDeclsTypeImpl();
		return sequenceDeclsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDeclType createSequenceDeclType() {
		SequenceDeclTypeImpl sequenceDeclType = new SequenceDeclTypeImpl();
		return sequenceDeclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceRefType createSequenceRefType() {
		SequenceRefTypeImpl sequenceRefType = new SequenceRefTypeImpl();
		return sequenceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftPageBreakType createSoftPageBreakType() {
		SoftPageBreakTypeImpl softPageBreakType = new SoftPageBreakTypeImpl();
		return softPageBreakType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortKeyType createSortKeyType() {
		SortKeyTypeImpl sortKeyType = new SortKeyTypeImpl();
		return sortKeyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanType createSpanType() {
		SpanTypeImpl spanType = new SpanTypeImpl();
		return spanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleChartPropertiesContent createStyleChartPropertiesContent() {
		StyleChartPropertiesContentImpl styleChartPropertiesContent = new StyleChartPropertiesContentImpl();
		return styleChartPropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleDrawingPagePropertiesContent createStyleDrawingPagePropertiesContent() {
		StyleDrawingPagePropertiesContentImpl styleDrawingPagePropertiesContent = new StyleDrawingPagePropertiesContentImpl();
		return styleDrawingPagePropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleGraphicPropertiesContent createStyleGraphicPropertiesContent() {
		StyleGraphicPropertiesContentImpl styleGraphicPropertiesContent = new StyleGraphicPropertiesContentImpl();
		return styleGraphicPropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleHeaderFooterPropertiesContent createStyleHeaderFooterPropertiesContent() {
		StyleHeaderFooterPropertiesContentImpl styleHeaderFooterPropertiesContent = new StyleHeaderFooterPropertiesContentImpl();
		return styleHeaderFooterPropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleListLevelPropertiesContent createStyleListLevelPropertiesContent() {
		StyleListLevelPropertiesContentImpl styleListLevelPropertiesContent = new StyleListLevelPropertiesContentImpl();
		return styleListLevelPropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylePageLayoutPropertiesContent createStylePageLayoutPropertiesContent() {
		StylePageLayoutPropertiesContentImpl stylePageLayoutPropertiesContent = new StylePageLayoutPropertiesContentImpl();
		return stylePageLayoutPropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleParagraphPropertiesContent createStyleParagraphPropertiesContent() {
		StyleParagraphPropertiesContentImpl styleParagraphPropertiesContent = new StyleParagraphPropertiesContentImpl();
		return styleParagraphPropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylePropertiesContent createStylePropertiesContent() {
		StylePropertiesContentImpl stylePropertiesContent = new StylePropertiesContentImpl();
		return stylePropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleRubyPropertiesContent createStyleRubyPropertiesContent() {
		StyleRubyPropertiesContentImpl styleRubyPropertiesContent = new StyleRubyPropertiesContentImpl();
		return styleRubyPropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSectionPropertiesContent createStyleSectionPropertiesContent() {
		StyleSectionPropertiesContentImpl styleSectionPropertiesContent = new StyleSectionPropertiesContentImpl();
		return styleSectionPropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleStyleContent createStyleStyleContent() {
		StyleStyleContentImpl styleStyleContent = new StyleStyleContentImpl();
		return styleStyleContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTableCellPropertiesContent createStyleTableCellPropertiesContent() {
		StyleTableCellPropertiesContentImpl styleTableCellPropertiesContent = new StyleTableCellPropertiesContentImpl();
		return styleTableCellPropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTableColumnPropertiesContent createStyleTableColumnPropertiesContent() {
		StyleTableColumnPropertiesContentImpl styleTableColumnPropertiesContent = new StyleTableColumnPropertiesContentImpl();
		return styleTableColumnPropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTablePropertiesContent createStyleTablePropertiesContent() {
		StyleTablePropertiesContentImpl styleTablePropertiesContent = new StyleTablePropertiesContentImpl();
		return styleTablePropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTableRowPropertiesContent createStyleTableRowPropertiesContent() {
		StyleTableRowPropertiesContentImpl styleTableRowPropertiesContent = new StyleTableRowPropertiesContentImpl();
		return styleTableRowPropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTextPropertiesContent createStyleTextPropertiesContent() {
		StyleTextPropertiesContentImpl styleTextPropertiesContent = new StyleTextPropertiesContentImpl();
		return styleTextPropertiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SType createSType() {
		STypeImpl sType = new STypeImpl();
		return sType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectType createSubjectType() {
		SubjectTypeImpl subjectType = new SubjectTypeImpl();
		return subjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCountType createTableCountType() {
		TableCountTypeImpl tableCountType = new TableCountTypeImpl();
		return tableCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableFormulaType createTableFormulaType() {
		TableFormulaTypeImpl tableFormulaType = new TableFormulaTypeImpl();
		return tableFormulaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableIndexSourceType createTableIndexSourceType() {
		TableIndexSourceTypeImpl tableIndexSourceType = new TableIndexSourceTypeImpl();
		return tableIndexSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableIndexType createTableIndexType() {
		TableIndexTypeImpl tableIndexType = new TableIndexTypeImpl();
		return tableIndexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableOfContentEntryTemplateType createTableOfContentEntryTemplateType() {
		TableOfContentEntryTemplateTypeImpl tableOfContentEntryTemplateType = new TableOfContentEntryTemplateTypeImpl();
		return tableOfContentEntryTemplateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableOfContentSourceType createTableOfContentSourceType() {
		TableOfContentSourceTypeImpl tableOfContentSourceType = new TableOfContentSourceTypeImpl();
		return tableOfContentSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableOfContentType createTableOfContentType() {
		TableOfContentTypeImpl tableOfContentType = new TableOfContentTypeImpl();
		return tableOfContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTableCellContent createTableTableCellContent() {
		TableTableCellContentImpl tableTableCellContent = new TableTableCellContentImpl();
		return tableTableCellContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabType createTabType() {
		TabTypeImpl tabType = new TabTypeImpl();
		return tabType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateNameType createTemplateNameType() {
		TemplateNameTypeImpl templateNameType = new TemplateNameTypeImpl();
		return templateNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextChangedRegionContent createTextChangedRegionContent() {
		TextChangedRegionContentImpl textChangedRegionContent = new TextChangedRegionContentImpl();
		return textChangedRegionContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDatabaseDisplayAttlist createTextDatabaseDisplayAttlist() {
		TextDatabaseDisplayAttlistImpl textDatabaseDisplayAttlist = new TextDatabaseDisplayAttlistImpl();
		return textDatabaseDisplayAttlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDatabaseNextAttlist createTextDatabaseNextAttlist() {
		TextDatabaseNextAttlistImpl textDatabaseNextAttlist = new TextDatabaseNextAttlistImpl();
		return textDatabaseNextAttlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDatabaseRowSelectAttlist createTextDatabaseRowSelectAttlist() {
		TextDatabaseRowSelectAttlistImpl textDatabaseRowSelectAttlist = new TextDatabaseRowSelectAttlistImpl();
		return textDatabaseRowSelectAttlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextIllustrationIndexEntryContent createTextIllustrationIndexEntryContent() {
		TextIllustrationIndexEntryContentImpl textIllustrationIndexEntryContent = new TextIllustrationIndexEntryContentImpl();
		return textIllustrationIndexEntryContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputType createTextInputType() {
		TextInputTypeImpl textInputType = new TextInputTypeImpl();
		return textInputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextListItemContent createTextListItemContent() {
		TextListItemContentImpl textListItemContent = new TextListItemContentImpl();
		return textListItemContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextListLevelStyleImageAttr createTextListLevelStyleImageAttr() {
		TextListLevelStyleImageAttrImpl textListLevelStyleImageAttr = new TextListLevelStyleImageAttrImpl();
		return textListLevelStyleImageAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextNotesConfigurationContent createTextNotesConfigurationContent() {
		TextNotesConfigurationContentImpl textNotesConfigurationContent = new TextNotesConfigurationContentImpl();
		return textNotesConfigurationContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextSectionSourceDdeType createTextSectionSourceDdeType() {
		TextSectionSourceDdeTypeImpl textSectionSourceDdeType = new TextSectionSourceDdeTypeImpl();
		return textSectionSourceDdeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType createTimeType() {
		TimeTypeImpl timeType = new TimeTypeImpl();
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType createTitleType() {
		TitleTypeImpl titleType = new TitleTypeImpl();
		return titleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TocMarkEndType createTocMarkEndType() {
		TocMarkEndTypeImpl tocMarkEndType = new TocMarkEndTypeImpl();
		return tocMarkEndType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TocMarkStartType createTocMarkStartType() {
		TocMarkStartTypeImpl tocMarkStartType = new TocMarkStartTypeImpl();
		return tocMarkStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TocMarkType createTocMarkType() {
		TocMarkTypeImpl tocMarkType = new TocMarkTypeImpl();
		return tocMarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackedChangesType createTrackedChangesType() {
		TrackedChangesTypeImpl trackedChangesType = new TrackedChangesTypeImpl();
		return trackedChangesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedType createUserDefinedType() {
		UserDefinedTypeImpl userDefinedType = new UserDefinedTypeImpl();
		return userDefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldDeclsType createUserFieldDeclsType() {
		UserFieldDeclsTypeImpl userFieldDeclsType = new UserFieldDeclsTypeImpl();
		return userFieldDeclsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldDeclType createUserFieldDeclType() {
		UserFieldDeclTypeImpl userFieldDeclType = new UserFieldDeclTypeImpl();
		return userFieldDeclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldGetType createUserFieldGetType() {
		UserFieldGetTypeImpl userFieldGetType = new UserFieldGetTypeImpl();
		return userFieldGetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldInputType createUserFieldInputType() {
		UserFieldInputTypeImpl userFieldInputType = new UserFieldInputTypeImpl();
		return userFieldInputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexEntryTemplateType createUserIndexEntryTemplateType() {
		UserIndexEntryTemplateTypeImpl userIndexEntryTemplateType = new UserIndexEntryTemplateTypeImpl();
		return userIndexEntryTemplateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexMarkEndType createUserIndexMarkEndType() {
		UserIndexMarkEndTypeImpl userIndexMarkEndType = new UserIndexMarkEndTypeImpl();
		return userIndexMarkEndType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexMarkStartType createUserIndexMarkStartType() {
		UserIndexMarkStartTypeImpl userIndexMarkStartType = new UserIndexMarkStartTypeImpl();
		return userIndexMarkStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexMarkType createUserIndexMarkType() {
		UserIndexMarkTypeImpl userIndexMarkType = new UserIndexMarkTypeImpl();
		return userIndexMarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexSourceType createUserIndexSourceType() {
		UserIndexSourceTypeImpl userIndexSourceType = new UserIndexSourceTypeImpl();
		return userIndexSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserIndexType createUserIndexType() {
		UserIndexTypeImpl userIndexType = new UserIndexTypeImpl();
		return userIndexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclsType createVariableDeclsType() {
		VariableDeclsTypeImpl variableDeclsType = new VariableDeclsTypeImpl();
		return variableDeclsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclType createVariableDeclType() {
		VariableDeclTypeImpl variableDeclType = new VariableDeclTypeImpl();
		return variableDeclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableGetType createVariableGetType() {
		VariableGetTypeImpl variableGetType = new VariableGetTypeImpl();
		return variableGetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableInputType createVariableInputType() {
		VariableInputTypeImpl variableInputType = new VariableInputTypeImpl();
		return variableInputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableSetType createVariableSetType() {
		VariableSetTypeImpl variableSetType = new VariableSetTypeImpl();
		return variableSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordCountType createWordCountType() {
		WordCountTypeImpl wordCountType = new WordCountTypeImpl();
		return wordCountType;
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
	public AnchorTypeType createAnchorTypeTypeFromString(EDataType eDataType, String initialValue) {
		AnchorTypeType result = AnchorTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnchorTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyDataFieldType createBibliographyDataFieldTypeFromString(EDataType eDataType, String initialValue) {
		BibliographyDataFieldType result = BibliographyDataFieldType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBibliographyDataFieldTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean result = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionSequenceFormatType createCaptionSequenceFormatTypeFromString(EDataType eDataType, String initialValue) {
		CaptionSequenceFormatType result = CaptionSequenceFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCaptionSequenceFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomShapeTypeMember1 createCustomShapeTypeMember1FromString(EDataType eDataType, String initialValue) {
		CustomShapeTypeMember1 result = CustomShapeTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomShapeTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType createDisplayTypeFromString(EDataType eDataType, String initialValue) {
		DisplayType result = DisplayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType1 createDisplayType1FromString(EDataType eDataType, String initialValue) {
		DisplayType1 result = DisplayType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType2 createDisplayType2FromString(EDataType eDataType, String initialValue) {
		DisplayType2 result = DisplayType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType3 createDisplayType3FromString(EDataType eDataType, String initialValue) {
		DisplayType3 result = DisplayType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType4 createDisplayType4FromString(EDataType eDataType, String initialValue) {
		DisplayType4 result = DisplayType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType5 createDisplayType5FromString(EDataType eDataType, String initialValue) {
		DisplayType5 result = DisplayType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType6 createDisplayType6FromString(EDataType eDataType, String initialValue) {
		DisplayType6 result = DisplayType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType7 createDisplayType7FromString(EDataType eDataType, String initialValue) {
		DisplayType7 result = DisplayType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamilyGeneric createFontFamilyGenericFromString(EDataType eDataType, String initialValue) {
		FontFamilyGeneric result = FontFamilyGeneric.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontFamilyGenericToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontPitch createFontPitchFromString(EDataType eDataType, String initialValue) {
		FontPitch result = FontPitch.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontPitchToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle createFontStyleFromString(EDataType eDataType, String initialValue) {
		FontStyle result = FontStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontVariant createFontVariantFromString(EDataType eDataType, String initialValue) {
		FontVariant result = FontVariant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontVariantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontWeight createFontWeightFromString(EDataType eDataType, String initialValue) {
		FontWeight result = FontWeight.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontWeightToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootnotesPositionType createFootnotesPositionTypeFromString(EDataType eDataType, String initialValue) {
		FootnotesPositionType result = FootnotesPositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFootnotesPositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientStyle createGradientStyleFromString(EDataType eDataType, String initialValue) {
		GradientStyle result = GradientStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGradientStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HoriBackPos createHoriBackPosFromString(EDataType eDataType, String initialValue) {
		HoriBackPos result = HoriBackPos.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHoriBackPosToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalMirror createHorizontalMirrorFromString(EDataType eDataType, String initialValue) {
		HorizontalMirror result = HorizontalMirror.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHorizontalMirrorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexScopeType createIndexScopeTypeFromString(EDataType eDataType, String initialValue) {
		IndexScopeType result = IndexScopeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndexScopeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexScopeType1 createIndexScopeType1FromString(EDataType eDataType, String initialValue) {
		IndexScopeType1 result = IndexScopeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndexScopeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyType createKeyTypeFromString(EDataType eDataType, String initialValue) {
		KeyType result = KeyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType createKindTypeFromString(EDataType eDataType, String initialValue) {
		KindType result = KindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineMode createLineModeFromString(EDataType eDataType, String initialValue) {
		LineMode result = LineMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle createLineStyleFromString(EDataType eDataType, String initialValue) {
		LineStyle result = LineStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType createLineTypeFromString(EDataType eDataType, String initialValue) {
		LineType result = LineType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember3 createLineWidthMember3FromString(EDataType eDataType, String initialValue) {
		LineWidthMember3 result = LineWidthMember3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember4 createLineWidthMember4FromString(EDataType eDataType, String initialValue) {
		LineWidthMember4 result = LineWidthMember4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember5 createLineWidthMember5FromString(EDataType eDataType, String initialValue) {
		LineWidthMember5 result = LineWidthMember5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember6 createLineWidthMember6FromString(EDataType eDataType, String initialValue) {
		LineWidthMember6 result = LineWidthMember6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember7 createLineWidthMember7FromString(EDataType eDataType, String initialValue) {
		LineWidthMember7 result = LineWidthMember7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember8 createLineWidthMember8FromString(EDataType eDataType, String initialValue) {
		LineWidthMember8 result = LineWidthMember8.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember8ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember9 createLineWidthMember9FromString(EDataType eDataType, String initialValue) {
		LineWidthMember9 result = LineWidthMember9.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember9ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navigation createNavigationFromString(EDataType eDataType, String initialValue) {
		Navigation result = Navigation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNavigationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteClassType createNoteClassTypeFromString(EDataType eDataType, String initialValue) {
		NoteClassType result = NoteClassType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberPositionType createNumberPositionTypeFromString(EDataType eDataType, String initialValue) {
		NumberPositionType result = NumberPositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberPositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineLevelType createOutlineLevelTypeFromString(EDataType eDataType, String initialValue) {
		OutlineLevelType result = OutlineLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutlineLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderTypeType createPlaceholderTypeTypeFromString(EDataType eDataType, String initialValue) {
		PlaceholderTypeType result = PlaceholderTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlaceholderTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationClasses createPresentationClassesFromString(EDataType eDataType, String initialValue) {
		PresentationClasses result = PresentationClasses.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationClassesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationEffectDirections createPresentationEffectDirectionsFromString(EDataType eDataType, String initialValue) {
		PresentationEffectDirections result = PresentationEffectDirections.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationEffectDirectionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationEffects createPresentationEffectsFromString(EDataType eDataType, String initialValue) {
		PresentationEffects result = PresentationEffects.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationEffectsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationSpeeds createPresentationSpeedsFromString(EDataType eDataType, String initialValue) {
		PresentationSpeeds result = PresentationSpeeds.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationSpeedsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceFormatType createReferenceFormatTypeFromString(EDataType eDataType, String initialValue) {
		ReferenceFormatType result = ReferenceFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceFormatType1 createReferenceFormatType1FromString(EDataType eDataType, String initialValue) {
		ReferenceFormatType1 result = ReferenceFormatType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceFormatType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowOrCol createRowOrColFromString(EDataType eDataType, String initialValue) {
		RowOrCol result = RowOrCol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowOrColToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectPageType createSelectPageTypeFromString(EDataType eDataType, String initialValue) {
		SelectPageType result = SelectPageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectPageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectPageType1 createSelectPageType1FromString(EDataType eDataType, String initialValue) {
		SelectPageType1 result = SelectPageType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectPageType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadowTypeMember1 createShadowTypeMember1FromString(EDataType eDataType, String initialValue) {
		ShadowTypeMember1 result = ShadowTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShadowTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNumberingAtType createStartNumberingAtTypeFromString(EDataType eDataType, String initialValue) {
		StartNumberingAtType result = StartNumberingAtType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStartNumberingAtTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public States createStatesFromString(EDataType eDataType, String initialValue) {
		States result = States.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabCycles createTabCyclesFromString(EDataType eDataType, String initialValue) {
		TabCycles result = TabCycles.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTabCyclesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTypeType createTableTypeTypeFromString(EDataType eDataType, String initialValue) {
		TableTypeType result = TableTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableVisibilityValue createTableVisibilityValueFromString(EDataType eDataType, String initialValue) {
		TableVisibilityValue result = TableVisibilityValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableVisibilityValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetFrameNameMember1 createTargetFrameNameMember1FromString(EDataType eDataType, String initialValue) {
		TargetFrameNameMember1 result = TargetFrameNameMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetFrameNameMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetFrameNameMember2 createTargetFrameNameMember2FromString(EDataType eDataType, String initialValue) {
		TargetFrameNameMember2 result = TargetFrameNameMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetFrameNameMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetFrameNameMember3 createTargetFrameNameMember3FromString(EDataType eDataType, String initialValue) {
		TargetFrameNameMember3 result = TargetFrameNameMember3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetFrameNameMember3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetFrameNameMember4 createTargetFrameNameMember4FromString(EDataType eDataType, String initialValue) {
		TargetFrameNameMember4 result = TargetFrameNameMember4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetFrameNameMember4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBibliographyTypes createTextBibliographyTypesFromString(EDataType eDataType, String initialValue) {
		TextBibliographyTypes result = TextBibliographyTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextBibliographyTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Types createTypesFromString(EDataType eDataType, String initialValue) {
		Types result = Types.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueTypeFromString(EDataType eDataType, String initialValue) {
		ValueType result = ValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertBackPos createVertBackPosFromString(EDataType eDataType, String initialValue) {
		VertBackPos result = VertBackPos.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVertBackPosToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnchorTypeType createAnchorTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAnchorTypeTypeFromString(TextPackage.eINSTANCE.getAnchorTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnchorTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAnchorTypeTypeToString(TextPackage.eINSTANCE.getAnchorTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAnyURIFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnyURIToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createBase64BinaryFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBase64BinaryToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyDataFieldType createBibliographyDataFieldTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBibliographyDataFieldTypeFromString(TextPackage.eINSTANCE.getBibliographyDataFieldType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBibliographyDataFieldTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBibliographyDataFieldTypeToString(TextPackage.eINSTANCE.getBibliographyDataFieldType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean createBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanFromString(TextPackage.eINSTANCE.getBoolean(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanToString(TextPackage.eINSTANCE.getBoolean(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createBorderWidthsFromString(EDataType eDataType, String initialValue) {
		return createBorderWidthsBaseFromString(TextPackage.eINSTANCE.getBorderWidthsBase(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBorderWidthsToString(EDataType eDataType, Object instanceValue) {
		return convertBorderWidthsBaseToString(TextPackage.eINSTANCE.getBorderWidthsBase(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createBorderWidthsBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createBorderWidthsBaseItemFromString(TextPackage.eINSTANCE.getBorderWidthsBaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBorderWidthsBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertBorderWidthsBaseItemToString(TextPackage.eINSTANCE.getBorderWidthsBaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBorderWidthsBaseItemFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createPositiveLengthFromString(TextPackage.eINSTANCE.getPositiveLength(), initialValue);
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
	public String convertBorderWidthsBaseItemToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getPositiveLength().isInstance(instanceValue)) {
			try {
				String value = convertPositiveLengthToString(TextPackage.eINSTANCE.getPositiveLength(), instanceValue);
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
	public CaptionSequenceFormatType createCaptionSequenceFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCaptionSequenceFormatTypeFromString(TextPackage.eINSTANCE.getCaptionSequenceFormatType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCaptionSequenceFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCaptionSequenceFormatTypeToString(TextPackage.eINSTANCE.getCaptionSequenceFormatType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCellAddressFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellAddressToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCellRangeAddressFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellRangeAddressToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCellRangeAddressListFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellRangeAddressListToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCharacterFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCitationBodyStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCitationBodyStyleNameTypeMember1FromString(TextPackage.eINSTANCE.getCitationBodyStyleNameTypeMember1(), initialValue);
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
	public String convertCitationBodyStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getCitationBodyStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertCitationBodyStyleNameTypeMember1ToString(TextPackage.eINSTANCE.getCitationBodyStyleNameTypeMember1(), instanceValue);
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
	public String createCitationBodyStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCitationBodyStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCitationStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCitationStyleNameTypeMember1FromString(TextPackage.eINSTANCE.getCitationStyleNameTypeMember1(), initialValue);
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
	public String convertCitationStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getCitationStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertCitationStyleNameTypeMember1ToString(TextPackage.eINSTANCE.getCitationStyleNameTypeMember1(), instanceValue);
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
	public String createCitationStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCitationStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCondStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCondStyleNameTypeMember1FromString(TextPackage.eINSTANCE.getCondStyleNameTypeMember1(), initialValue);
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
	public String convertCondStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getCondStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertCondStyleNameTypeMember1ToString(TextPackage.eINSTANCE.getCondStyleNameTypeMember1(), instanceValue);
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
	public String createCondStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCondStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCoordinateFromString(EDataType eDataType, String initialValue) {
		return createLengthFromString(TextPackage.eINSTANCE.getLength(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoordinateToString(EDataType eDataType, Object instanceValue) {
		return convertLengthToString(TextPackage.eINSTANCE.getLength(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCountryCodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountryCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createCustomShapeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createStringFromString(TextPackage.eINSTANCE.getString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCustomShapeTypeMember1FromString(TextPackage.eINSTANCE.getCustomShapeTypeMember1(), initialValue);
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
	public String convertCustomShapeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getString().isInstance(instanceValue)) {
			try {
				String value = convertStringToString(TextPackage.eINSTANCE.getString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getCustomShapeTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertCustomShapeTypeMember1ToString(TextPackage.eINSTANCE.getCustomShapeTypeMember1(), instanceValue);
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
	public CustomShapeTypeMember1 createCustomShapeTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createCustomShapeTypeMember1FromString(TextPackage.eINSTANCE.getCustomShapeTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomShapeTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCustomShapeTypeMember1ToString(TextPackage.eINSTANCE.getCustomShapeTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateOrDateTimeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
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
	public String convertDateOrDateTimeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
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
	public XMLGregorianCalendar createDateTimeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDefaultStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createDefaultStyleNameTypeMember1FromString(TextPackage.eINSTANCE.getDefaultStyleNameTypeMember1(), initialValue);
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
	public String convertDefaultStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getDefaultStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertDefaultStyleNameTypeMember1ToString(TextPackage.eINSTANCE.getDefaultStyleNameTypeMember1(), instanceValue);
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
	public String createDefaultStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType2 createDisplayTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDisplayType2FromString(TextPackage.eINSTANCE.getDisplayType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayType2ToString(TextPackage.eINSTANCE.getDisplayType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType3 createDisplayTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createDisplayType3FromString(TextPackage.eINSTANCE.getDisplayType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayType3ToString(TextPackage.eINSTANCE.getDisplayType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType5 createDisplayTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createDisplayType5FromString(TextPackage.eINSTANCE.getDisplayType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayType5ToString(TextPackage.eINSTANCE.getDisplayType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType1 createDisplayTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createDisplayType1FromString(TextPackage.eINSTANCE.getDisplayType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayType1ToString(TextPackage.eINSTANCE.getDisplayType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType createDisplayTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createDisplayTypeFromString(TextPackage.eINSTANCE.getDisplayType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayTypeToString(TextPackage.eINSTANCE.getDisplayType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType6 createDisplayTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createDisplayType6FromString(TextPackage.eINSTANCE.getDisplayType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayType6ToString(TextPackage.eINSTANCE.getDisplayType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType4 createDisplayTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createDisplayType4FromString(TextPackage.eINSTANCE.getDisplayType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayType4ToString(TextPackage.eINSTANCE.getDisplayType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType7 createDisplayTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createDisplayType7FromString(TextPackage.eINSTANCE.getDisplayType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayType7ToString(TextPackage.eINSTANCE.getDisplayType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDistanceFromString(EDataType eDataType, String initialValue) {
		return createLengthFromString(TextPackage.eINSTANCE.getLength(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistanceToString(EDataType eDataType, Object instanceValue) {
		return convertLengthToString(TextPackage.eINSTANCE.getLength(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDoubleObjectFromString(EDataType eDataType, String initialValue) {
		return createDoubleFromString(TextPackage.eINSTANCE.getDouble(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDoubleToString(TextPackage.eINSTANCE.getDouble(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDurationFromString(EDataType eDataType, String initialValue) {
		return (Duration)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DURATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DURATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamilyGeneric createFontFamilyGenericObjectFromString(EDataType eDataType, String initialValue) {
		return createFontFamilyGenericFromString(TextPackage.eINSTANCE.getFontFamilyGeneric(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontFamilyGenericObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontFamilyGenericToString(TextPackage.eINSTANCE.getFontFamilyGeneric(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontPitch createFontPitchObjectFromString(EDataType eDataType, String initialValue) {
		return createFontPitchFromString(TextPackage.eINSTANCE.getFontPitch(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontPitchObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontPitchToString(TextPackage.eINSTANCE.getFontPitch(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle createFontStyleObjectFromString(EDataType eDataType, String initialValue) {
		return createFontStyleFromString(TextPackage.eINSTANCE.getFontStyle(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontStyleToString(TextPackage.eINSTANCE.getFontStyle(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontVariant createFontVariantObjectFromString(EDataType eDataType, String initialValue) {
		return createFontVariantFromString(TextPackage.eINSTANCE.getFontVariant(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontVariantObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontVariantToString(TextPackage.eINSTANCE.getFontVariant(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontWeight createFontWeightObjectFromString(EDataType eDataType, String initialValue) {
		return createFontWeightFromString(TextPackage.eINSTANCE.getFontWeight(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontWeightObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontWeightToString(TextPackage.eINSTANCE.getFontWeight(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootnotesPositionType createFootnotesPositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFootnotesPositionTypeFromString(TextPackage.eINSTANCE.getFootnotesPositionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFootnotesPositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFootnotesPositionTypeToString(TextPackage.eINSTANCE.getFootnotesPositionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFormulaFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormulaToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientStyle createGradientStyleObjectFromString(EDataType eDataType, String initialValue) {
		return createGradientStyleFromString(TextPackage.eINSTANCE.getGradientStyle(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGradientStyleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGradientStyleToString(TextPackage.eINSTANCE.getGradientStyle(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HoriBackPos createHoriBackPosObjectFromString(EDataType eDataType, String initialValue) {
		return createHoriBackPosFromString(TextPackage.eINSTANCE.getHoriBackPos(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHoriBackPosObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHoriBackPosToString(TextPackage.eINSTANCE.getHoriBackPos(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalMirror createHorizontalMirrorObjectFromString(EDataType eDataType, String initialValue) {
		return createHorizontalMirrorFromString(TextPackage.eINSTANCE.getHorizontalMirror(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHorizontalMirrorObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHorizontalMirrorToString(TextPackage.eINSTANCE.getHorizontalMirror(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIDFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ID, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ID, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIDREFFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.IDREF, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDREFToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.IDREF, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createIDREFSFromString(EDataType eDataType, String initialValue) {
		return (List)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.IDREFS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDREFSToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.IDREFS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexScopeType createIndexScopeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIndexScopeTypeFromString(TextPackage.eINSTANCE.getIndexScopeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndexScopeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIndexScopeTypeToString(TextPackage.eINSTANCE.getIndexScopeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexScopeType1 createIndexScopeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createIndexScopeType1FromString(TextPackage.eINSTANCE.getIndexScopeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndexScopeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertIndexScopeType1ToString(TextPackage.eINSTANCE.getIndexScopeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyType createKeyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKeyTypeFromString(TextPackage.eINSTANCE.getKeyType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKeyTypeToString(TextPackage.eINSTANCE.getKeyType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType createKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKindTypeFromString(TextPackage.eINSTANCE.getKindType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKindTypeToString(TextPackage.eINSTANCE.getKindType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLanguageFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LANGUAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LANGUAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLanguageCodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLengthFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineMode createLineModeObjectFromString(EDataType eDataType, String initialValue) {
		return createLineModeFromString(TextPackage.eINSTANCE.getLineMode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineModeToString(TextPackage.eINSTANCE.getLineMode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle createLineStyleObjectFromString(EDataType eDataType, String initialValue) {
		return createLineStyleFromString(TextPackage.eINSTANCE.getLineStyle(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineStyleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineStyleToString(TextPackage.eINSTANCE.getLineStyle(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType createLineTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLineTypeFromString(TextPackage.eINSTANCE.getLineType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineTypeToString(TextPackage.eINSTANCE.getLineType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createLineWidthFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createPositiveIntegerFromString(TextPackage.eINSTANCE.getPositiveInteger(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPercentFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPositiveLengthFromString(TextPackage.eINSTANCE.getPositiveLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLineWidthMember3FromString(TextPackage.eINSTANCE.getLineWidthMember3(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLineWidthMember4FromString(TextPackage.eINSTANCE.getLineWidthMember4(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLineWidthMember5FromString(TextPackage.eINSTANCE.getLineWidthMember5(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLineWidthMember6FromString(TextPackage.eINSTANCE.getLineWidthMember6(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLineWidthMember7FromString(TextPackage.eINSTANCE.getLineWidthMember7(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLineWidthMember8FromString(TextPackage.eINSTANCE.getLineWidthMember8(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLineWidthMember9FromString(TextPackage.eINSTANCE.getLineWidthMember9(), initialValue);
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
	public String convertLineWidthToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getPositiveInteger().isInstance(instanceValue)) {
			try {
				String value = convertPositiveIntegerToString(TextPackage.eINSTANCE.getPositiveInteger(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = convertPercentToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPositiveLength().isInstance(instanceValue)) {
			try {
				String value = convertPositiveLengthToString(TextPackage.eINSTANCE.getPositiveLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getLineWidthMember3().isInstance(instanceValue)) {
			try {
				String value = convertLineWidthMember3ToString(TextPackage.eINSTANCE.getLineWidthMember3(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getLineWidthMember4().isInstance(instanceValue)) {
			try {
				String value = convertLineWidthMember4ToString(TextPackage.eINSTANCE.getLineWidthMember4(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getLineWidthMember5().isInstance(instanceValue)) {
			try {
				String value = convertLineWidthMember5ToString(TextPackage.eINSTANCE.getLineWidthMember5(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getLineWidthMember6().isInstance(instanceValue)) {
			try {
				String value = convertLineWidthMember6ToString(TextPackage.eINSTANCE.getLineWidthMember6(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getLineWidthMember7().isInstance(instanceValue)) {
			try {
				String value = convertLineWidthMember7ToString(TextPackage.eINSTANCE.getLineWidthMember7(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getLineWidthMember8().isInstance(instanceValue)) {
			try {
				String value = convertLineWidthMember8ToString(TextPackage.eINSTANCE.getLineWidthMember8(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getLineWidthMember9().isInstance(instanceValue)) {
			try {
				String value = convertLineWidthMember9ToString(TextPackage.eINSTANCE.getLineWidthMember9(), instanceValue);
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
	public LineWidthMember3 createLineWidthMember3ObjectFromString(EDataType eDataType, String initialValue) {
		return createLineWidthMember3FromString(TextPackage.eINSTANCE.getLineWidthMember3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineWidthMember3ToString(TextPackage.eINSTANCE.getLineWidthMember3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember4 createLineWidthMember4ObjectFromString(EDataType eDataType, String initialValue) {
		return createLineWidthMember4FromString(TextPackage.eINSTANCE.getLineWidthMember4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember4ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineWidthMember4ToString(TextPackage.eINSTANCE.getLineWidthMember4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember5 createLineWidthMember5ObjectFromString(EDataType eDataType, String initialValue) {
		return createLineWidthMember5FromString(TextPackage.eINSTANCE.getLineWidthMember5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember5ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineWidthMember5ToString(TextPackage.eINSTANCE.getLineWidthMember5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember6 createLineWidthMember6ObjectFromString(EDataType eDataType, String initialValue) {
		return createLineWidthMember6FromString(TextPackage.eINSTANCE.getLineWidthMember6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember6ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineWidthMember6ToString(TextPackage.eINSTANCE.getLineWidthMember6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember7 createLineWidthMember7ObjectFromString(EDataType eDataType, String initialValue) {
		return createLineWidthMember7FromString(TextPackage.eINSTANCE.getLineWidthMember7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember7ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineWidthMember7ToString(TextPackage.eINSTANCE.getLineWidthMember7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember8 createLineWidthMember8ObjectFromString(EDataType eDataType, String initialValue) {
		return createLineWidthMember8FromString(TextPackage.eINSTANCE.getLineWidthMember8(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember8ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineWidthMember8ToString(TextPackage.eINSTANCE.getLineWidthMember8(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineWidthMember9 createLineWidthMember9ObjectFromString(EDataType eDataType, String initialValue) {
		return createLineWidthMember9FromString(TextPackage.eINSTANCE.getLineWidthMember9(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineWidthMember9ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineWidthMember9ToString(TextPackage.eINSTANCE.getLineWidthMember9(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMainEntryStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMainEntryStyleNameTypeMember1FromString(TextPackage.eINSTANCE.getMainEntryStyleNameTypeMember1(), initialValue);
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
	public String convertMainEntryStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getMainEntryStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertMainEntryStyleNameTypeMember1ToString(TextPackage.eINSTANCE.getMainEntryStyleNameTypeMember1(), instanceValue);
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
	public String createMainEntryStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMainEntryStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
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
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMasterPageNameTypeMember1FromString(TextPackage.eINSTANCE.getMasterPageNameTypeMember1(), initialValue);
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
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getMasterPageNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertMasterPageNameTypeMember1ToString(TextPackage.eINSTANCE.getMasterPageNameTypeMember1(), instanceValue);
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
	public String createMasterPageNameType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMasterPageNameTypeMember11FromString(TextPackage.eINSTANCE.getMasterPageNameTypeMember11(), initialValue);
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
	public String convertMasterPageNameType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getMasterPageNameTypeMember11().isInstance(instanceValue)) {
			try {
				String value = convertMasterPageNameTypeMember11ToString(TextPackage.eINSTANCE.getMasterPageNameTypeMember11(), instanceValue);
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
	public String createMasterPageNameTypeMember11FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMasterPageNameTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNamespacedTokenFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamespacedTokenToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navigation createNavigationObjectFromString(EDataType eDataType, String initialValue) {
		return createNavigationFromString(TextPackage.eINSTANCE.getNavigation(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNavigationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNavigationToString(TextPackage.eINSTANCE.getNavigation(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNonNegativeIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonNegativeLengthFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonNegativePixelLengthFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativePixelLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteClassType createNoteClassTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNoteClassTypeFromString(TextPackage.eINSTANCE.getNoteClassType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteClassTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNoteClassTypeToString(TextPackage.eINSTANCE.getNoteClassType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberPositionType createNumberPositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNumberPositionTypeFromString(TextPackage.eINSTANCE.getNumberPositionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberPositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumberPositionTypeToString(TextPackage.eINSTANCE.getNumberPositionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineLevelType createOutlineLevelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOutlineLevelTypeFromString(TextPackage.eINSTANCE.getOutlineLevelType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutlineLevelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOutlineLevelTypeToString(TextPackage.eINSTANCE.getOutlineLevelType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createParagraphStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createParagraphStyleNameTypeMember1FromString(TextPackage.eINSTANCE.getParagraphStyleNameTypeMember1(), initialValue);
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
	public String convertParagraphStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getParagraphStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertParagraphStyleNameTypeMember1ToString(TextPackage.eINSTANCE.getParagraphStyleNameTypeMember1(), instanceValue);
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
	public String createParagraphStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParagraphStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPathDataFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathDataToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPercentFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderTypeType createPlaceholderTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPlaceholderTypeTypeFromString(TextPackage.eINSTANCE.getPlaceholderTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlaceholderTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlaceholderTypeTypeToString(TextPackage.eINSTANCE.getPlaceholderTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPoint3DFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoint3DToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPointsFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPointsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPositiveIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPositiveLengthFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationClasses createPresentationClassesObjectFromString(EDataType eDataType, String initialValue) {
		return createPresentationClassesFromString(TextPackage.eINSTANCE.getPresentationClasses(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationClassesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPresentationClassesToString(TextPackage.eINSTANCE.getPresentationClasses(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationEffectDirections createPresentationEffectDirectionsObjectFromString(EDataType eDataType, String initialValue) {
		return createPresentationEffectDirectionsFromString(TextPackage.eINSTANCE.getPresentationEffectDirections(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationEffectDirectionsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPresentationEffectDirectionsToString(TextPackage.eINSTANCE.getPresentationEffectDirections(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationEffects createPresentationEffectsObjectFromString(EDataType eDataType, String initialValue) {
		return createPresentationEffectsFromString(TextPackage.eINSTANCE.getPresentationEffects(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationEffectsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPresentationEffectsToString(TextPackage.eINSTANCE.getPresentationEffects(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationSpeeds createPresentationSpeedsObjectFromString(EDataType eDataType, String initialValue) {
		return createPresentationSpeedsFromString(TextPackage.eINSTANCE.getPresentationSpeeds(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationSpeedsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPresentationSpeedsToString(TextPackage.eINSTANCE.getPresentationSpeeds(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceFormatType createReferenceFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReferenceFormatTypeFromString(TextPackage.eINSTANCE.getReferenceFormatType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceFormatTypeToString(TextPackage.eINSTANCE.getReferenceFormatType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceFormatType1 createReferenceFormatTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createReferenceFormatType1FromString(TextPackage.eINSTANCE.getReferenceFormatType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceFormatTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceFormatType1ToString(TextPackage.eINSTANCE.getReferenceFormatType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRelativeLengthFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelativeLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowOrCol createRowOrColObjectFromString(EDataType eDataType, String initialValue) {
		return createRowOrColFromString(TextPackage.eINSTANCE.getRowOrCol(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowOrColObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRowOrColToString(TextPackage.eINSTANCE.getRowOrCol(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectPageType createSelectPageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSelectPageTypeFromString(TextPackage.eINSTANCE.getSelectPageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectPageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSelectPageTypeToString(TextPackage.eINSTANCE.getSelectPageType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectPageType1 createSelectPageTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createSelectPageType1FromString(TextPackage.eINSTANCE.getSelectPageType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectPageTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertSelectPageType1ToString(TextPackage.eINSTANCE.getSelectPageType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createShadowTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createStringFromString(TextPackage.eINSTANCE.getString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createShadowTypeMember1FromString(TextPackage.eINSTANCE.getShadowTypeMember1(), initialValue);
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
	public String convertShadowTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getString().isInstance(instanceValue)) {
			try {
				String value = convertStringToString(TextPackage.eINSTANCE.getString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getShadowTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertShadowTypeMember1ToString(TextPackage.eINSTANCE.getShadowTypeMember1(), instanceValue);
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
	public ShadowTypeMember1 createShadowTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createShadowTypeMember1FromString(TextPackage.eINSTANCE.getShadowTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShadowTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShadowTypeMember1ToString(TextPackage.eINSTANCE.getShadowTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNumberingAtType createStartNumberingAtTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStartNumberingAtTypeFromString(TextPackage.eINSTANCE.getStartNumberingAtType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStartNumberingAtTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStartNumberingAtTypeToString(TextPackage.eINSTANCE.getStartNumberingAtType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public States createStatesObjectFromString(EDataType eDataType, String initialValue) {
		return createStatesFromString(TextPackage.eINSTANCE.getStates(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStatesToString(TextPackage.eINSTANCE.getStates(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameRefFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameRefToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createStyleNameRefsFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameRefsToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
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
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember12FromString(TextPackage.eINSTANCE.getStyleNameTypeMember12(), initialValue);
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
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember12().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember12ToString(TextPackage.eINSTANCE.getStyleNameTypeMember12(), instanceValue);
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
	public String createStyleNameType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember14FromString(TextPackage.eINSTANCE.getStyleNameTypeMember14(), initialValue);
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
	public String convertStyleNameType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember14().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember14ToString(TextPackage.eINSTANCE.getStyleNameTypeMember14(), instanceValue);
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
	public String createStyleNameType2FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember13FromString(TextPackage.eINSTANCE.getStyleNameTypeMember13(), initialValue);
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
	public String convertStyleNameType2ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember13().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember13ToString(TextPackage.eINSTANCE.getStyleNameTypeMember13(), instanceValue);
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
	public String createStyleNameType3FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember18FromString(TextPackage.eINSTANCE.getStyleNameTypeMember18(), initialValue);
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
	public String convertStyleNameType3ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember18().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember18ToString(TextPackage.eINSTANCE.getStyleNameTypeMember18(), instanceValue);
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
	public String createStyleNameType4FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember19FromString(TextPackage.eINSTANCE.getStyleNameTypeMember19(), initialValue);
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
	public String convertStyleNameType4ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember19().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember19ToString(TextPackage.eINSTANCE.getStyleNameTypeMember19(), instanceValue);
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
	public String createStyleNameType5FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember16FromString(TextPackage.eINSTANCE.getStyleNameTypeMember16(), initialValue);
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
	public String convertStyleNameType5ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember16().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember16ToString(TextPackage.eINSTANCE.getStyleNameTypeMember16(), instanceValue);
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
	public String createStyleNameType6FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember17FromString(TextPackage.eINSTANCE.getStyleNameTypeMember17(), initialValue);
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
	public String convertStyleNameType6ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember17().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember17ToString(TextPackage.eINSTANCE.getStyleNameTypeMember17(), instanceValue);
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
	public String createStyleNameType7FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember115FromString(TextPackage.eINSTANCE.getStyleNameTypeMember115(), initialValue);
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
	public String convertStyleNameType7ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember115().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember115ToString(TextPackage.eINSTANCE.getStyleNameTypeMember115(), instanceValue);
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
	public String createStyleNameType8FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember111FromString(TextPackage.eINSTANCE.getStyleNameTypeMember111(), initialValue);
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
	public String convertStyleNameType8ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember111().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember111ToString(TextPackage.eINSTANCE.getStyleNameTypeMember111(), instanceValue);
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
	public String createStyleNameType9FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember15FromString(TextPackage.eINSTANCE.getStyleNameTypeMember15(), initialValue);
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
	public String convertStyleNameType9ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember15().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember15ToString(TextPackage.eINSTANCE.getStyleNameTypeMember15(), instanceValue);
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
	public String createStyleNameType10FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember119FromString(TextPackage.eINSTANCE.getStyleNameTypeMember119(), initialValue);
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
	public String convertStyleNameType10ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember119().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember119ToString(TextPackage.eINSTANCE.getStyleNameTypeMember119(), instanceValue);
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
	public String createStyleNameType11FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember117FromString(TextPackage.eINSTANCE.getStyleNameTypeMember117(), initialValue);
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
	public String convertStyleNameType11ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember117().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember117ToString(TextPackage.eINSTANCE.getStyleNameTypeMember117(), instanceValue);
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
	public String createStyleNameType12FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember113FromString(TextPackage.eINSTANCE.getStyleNameTypeMember113(), initialValue);
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
	public String convertStyleNameType12ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember113().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember113ToString(TextPackage.eINSTANCE.getStyleNameTypeMember113(), instanceValue);
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
	public String createStyleNameType13FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember118FromString(TextPackage.eINSTANCE.getStyleNameTypeMember118(), initialValue);
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
	public String convertStyleNameType13ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember118().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember118ToString(TextPackage.eINSTANCE.getStyleNameTypeMember118(), instanceValue);
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
	public String createStyleNameType14FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember112FromString(TextPackage.eINSTANCE.getStyleNameTypeMember112(), initialValue);
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
	public String convertStyleNameType14ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember112().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember112ToString(TextPackage.eINSTANCE.getStyleNameTypeMember112(), instanceValue);
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
	public String createStyleNameType15FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember121FromString(TextPackage.eINSTANCE.getStyleNameTypeMember121(), initialValue);
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
	public String convertStyleNameType15ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember121().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember121ToString(TextPackage.eINSTANCE.getStyleNameTypeMember121(), instanceValue);
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
	public String createStyleNameType16FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember11FromString(TextPackage.eINSTANCE.getStyleNameTypeMember11(), initialValue);
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
	public String convertStyleNameType16ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember11().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember11ToString(TextPackage.eINSTANCE.getStyleNameTypeMember11(), instanceValue);
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
	public String createStyleNameType17FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember114FromString(TextPackage.eINSTANCE.getStyleNameTypeMember114(), initialValue);
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
	public String convertStyleNameType17ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember114().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember114ToString(TextPackage.eINSTANCE.getStyleNameTypeMember114(), instanceValue);
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
	public String createStyleNameType18FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember110FromString(TextPackage.eINSTANCE.getStyleNameTypeMember110(), initialValue);
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
	public String convertStyleNameType18ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember110().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember110ToString(TextPackage.eINSTANCE.getStyleNameTypeMember110(), instanceValue);
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
	public String createStyleNameType19FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember1FromString(TextPackage.eINSTANCE.getStyleNameTypeMember1(), initialValue);
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
	public String convertStyleNameType19ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember1ToString(TextPackage.eINSTANCE.getStyleNameTypeMember1(), instanceValue);
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
	public String createStyleNameType20FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember116FromString(TextPackage.eINSTANCE.getStyleNameTypeMember116(), initialValue);
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
	public String convertStyleNameType20ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember116().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember116ToString(TextPackage.eINSTANCE.getStyleNameTypeMember116(), instanceValue);
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
	public String createStyleNameType21FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember124FromString(TextPackage.eINSTANCE.getStyleNameTypeMember124(), initialValue);
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
	public String convertStyleNameType21ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember124().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember124ToString(TextPackage.eINSTANCE.getStyleNameTypeMember124(), instanceValue);
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
	public String createStyleNameType22FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember120FromString(TextPackage.eINSTANCE.getStyleNameTypeMember120(), initialValue);
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
	public String convertStyleNameType22ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember120().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember120ToString(TextPackage.eINSTANCE.getStyleNameTypeMember120(), instanceValue);
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
	public String createStyleNameType23FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember122FromString(TextPackage.eINSTANCE.getStyleNameTypeMember122(), initialValue);
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
	public String convertStyleNameType23ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember122().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember122ToString(TextPackage.eINSTANCE.getStyleNameTypeMember122(), instanceValue);
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
	public String createStyleNameType24FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember123FromString(TextPackage.eINSTANCE.getStyleNameTypeMember123(), initialValue);
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
	public String convertStyleNameType24ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember123().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember123ToString(TextPackage.eINSTANCE.getStyleNameTypeMember123(), instanceValue);
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
	public String createStyleNameType25FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember125FromString(TextPackage.eINSTANCE.getStyleNameTypeMember125(), initialValue);
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
	public String convertStyleNameType25ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getStyleNameTypeMember125().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember125ToString(TextPackage.eINSTANCE.getStyleNameTypeMember125(), instanceValue);
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
	public String createStyleNameTypeMember11FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember12FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember12ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember13FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember13ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember14FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember14ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember15FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember15ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember16FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember16ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember17FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember17ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember18FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember18ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember19FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember19ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember110FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember110ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember111FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember111ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember112FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember112ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember113FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember113ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember114FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember114ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember115FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember115ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember116FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember116ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember117FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember117ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember118FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember118ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember119FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember119ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember120FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember120ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember121FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember121ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember122FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember122ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember123FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember123ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember124FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember124ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeMember125FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember125ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabCycles createTabCyclesObjectFromString(EDataType eDataType, String initialValue) {
		return createTabCyclesFromString(TextPackage.eINSTANCE.getTabCycles(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTabCyclesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTabCyclesToString(TextPackage.eINSTANCE.getTabCycles(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTypeType createTableTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTableTypeTypeFromString(TextPackage.eINSTANCE.getTableTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTableTypeTypeToString(TextPackage.eINSTANCE.getTableTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableVisibilityValue createTableVisibilityValueObjectFromString(EDataType eDataType, String initialValue) {
		return createTableVisibilityValueFromString(TextPackage.eINSTANCE.getTableVisibilityValue(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableVisibilityValueObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTableVisibilityValueToString(TextPackage.eINSTANCE.getTableVisibilityValue(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTargetFrameNameFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createStringFromString(TextPackage.eINSTANCE.getString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTargetFrameNameMember1FromString(TextPackage.eINSTANCE.getTargetFrameNameMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTargetFrameNameMember2FromString(TextPackage.eINSTANCE.getTargetFrameNameMember2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTargetFrameNameMember3FromString(TextPackage.eINSTANCE.getTargetFrameNameMember3(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTargetFrameNameMember4FromString(TextPackage.eINSTANCE.getTargetFrameNameMember4(), initialValue);
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
	public String convertTargetFrameNameToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getString().isInstance(instanceValue)) {
			try {
				String value = convertStringToString(TextPackage.eINSTANCE.getString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getTargetFrameNameMember1().isInstance(instanceValue)) {
			try {
				String value = convertTargetFrameNameMember1ToString(TextPackage.eINSTANCE.getTargetFrameNameMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getTargetFrameNameMember2().isInstance(instanceValue)) {
			try {
				String value = convertTargetFrameNameMember2ToString(TextPackage.eINSTANCE.getTargetFrameNameMember2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getTargetFrameNameMember3().isInstance(instanceValue)) {
			try {
				String value = convertTargetFrameNameMember3ToString(TextPackage.eINSTANCE.getTargetFrameNameMember3(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getTargetFrameNameMember4().isInstance(instanceValue)) {
			try {
				String value = convertTargetFrameNameMember4ToString(TextPackage.eINSTANCE.getTargetFrameNameMember4(), instanceValue);
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
	public TargetFrameNameMember1 createTargetFrameNameMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createTargetFrameNameMember1FromString(TextPackage.eINSTANCE.getTargetFrameNameMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetFrameNameMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTargetFrameNameMember1ToString(TextPackage.eINSTANCE.getTargetFrameNameMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetFrameNameMember2 createTargetFrameNameMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createTargetFrameNameMember2FromString(TextPackage.eINSTANCE.getTargetFrameNameMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetFrameNameMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTargetFrameNameMember2ToString(TextPackage.eINSTANCE.getTargetFrameNameMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetFrameNameMember3 createTargetFrameNameMember3ObjectFromString(EDataType eDataType, String initialValue) {
		return createTargetFrameNameMember3FromString(TextPackage.eINSTANCE.getTargetFrameNameMember3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetFrameNameMember3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTargetFrameNameMember3ToString(TextPackage.eINSTANCE.getTargetFrameNameMember3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetFrameNameMember4 createTargetFrameNameMember4ObjectFromString(EDataType eDataType, String initialValue) {
		return createTargetFrameNameMember4FromString(TextPackage.eINSTANCE.getTargetFrameNameMember4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetFrameNameMember4ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTargetFrameNameMember4ToString(TextPackage.eINSTANCE.getTargetFrameNameMember4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBibliographyTypes createTextBibliographyTypesObjectFromString(EDataType eDataType, String initialValue) {
		return createTextBibliographyTypesFromString(TextPackage.eINSTANCE.getTextBibliographyTypes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextBibliographyTypesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextBibliographyTypesToString(TextPackage.eINSTANCE.getTextBibliographyTypes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextEncodingFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextEncodingToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTimeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTimeOrDateTimeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
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
	public String convertTimeOrDateTimeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
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
	public Types createTypesObjectFromString(EDataType eDataType, String initialValue) {
		return createTypesFromString(TextPackage.eINSTANCE.getTypes(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypesToString(TextPackage.eINSTANCE.getTypes(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValueTypeFromString(TextPackage.eINSTANCE.getValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValueTypeToString(TextPackage.eINSTANCE.getValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVariableNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVector3DFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVector3DToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertBackPos createVertBackPosObjectFromString(EDataType eDataType, String initialValue) {
		return createVertBackPosFromString(TextPackage.eINSTANCE.getVertBackPos(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVertBackPosObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVertBackPosToString(TextPackage.eINSTANCE.getVertBackPos(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVisitedStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createStyleNameRefFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createVisitedStyleNameTypeMember1FromString(TextPackage.eINSTANCE.getVisitedStyleNameTypeMember1(), initialValue);
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
	public String convertVisitedStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameRefToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getVisitedStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertVisitedStyleNameTypeMember1ToString(TextPackage.eINSTANCE.getVisitedStyleNameTypeMember1(), instanceValue);
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
	public String createVisitedStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisitedStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPackage getTextPackage() {
		return (TextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TextPackage getPackage() {
		return TextPackage.eINSTANCE;
	}

} //TextFactoryImpl
