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
package org.oasisopen.names.tc.opendocument.xmlns.text.util;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.oasisopen.names.tc.opendocument.xmlns.text.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage
 * @generated
 */
public class TextValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TextValidator INSTANCE = new TextValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.oasisopen.names.tc.opendocument.xmlns.text";

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
	public TextValidator() {
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
	  return TextPackage.eINSTANCE;
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
			case TextPackage.ALPHABETICAL_INDEX_AUTO_MARK_FILE_TYPE:
				return validateAlphabeticalIndexAutoMarkFileType((AlphabeticalIndexAutoMarkFileType)value, diagnostics, context);
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE:
				return validateAlphabeticalIndexEntryTemplateType((AlphabeticalIndexEntryTemplateType)value, diagnostics, context);
			case TextPackage.ALPHABETICAL_INDEX_MARK_END_TYPE:
				return validateAlphabeticalIndexMarkEndType((AlphabeticalIndexMarkEndType)value, diagnostics, context);
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE:
				return validateAlphabeticalIndexMarkStartType((AlphabeticalIndexMarkStartType)value, diagnostics, context);
			case TextPackage.ALPHABETICAL_INDEX_MARK_TYPE:
				return validateAlphabeticalIndexMarkType((AlphabeticalIndexMarkType)value, diagnostics, context);
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE:
				return validateAlphabeticalIndexSourceType((AlphabeticalIndexSourceType)value, diagnostics, context);
			case TextPackage.ALPHABETICAL_INDEX_TYPE:
				return validateAlphabeticalIndexType((AlphabeticalIndexType)value, diagnostics, context);
			case TextPackage.ANY_ATT_LIST_OR_ELEMENTS:
				return validateAnyAttListOrElements((AnyAttListOrElements)value, diagnostics, context);
			case TextPackage.ATYPE:
				return validateAType((AType)value, diagnostics, context);
			case TextPackage.AUTHOR_INITIALS_TYPE:
				return validateAuthorInitialsType((AuthorInitialsType)value, diagnostics, context);
			case TextPackage.AUTHOR_NAME_TYPE:
				return validateAuthorNameType((AuthorNameType)value, diagnostics, context);
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE:
				return validateBibliographyConfigurationType((BibliographyConfigurationType)value, diagnostics, context);
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE:
				return validateBibliographyEntryTemplateType((BibliographyEntryTemplateType)value, diagnostics, context);
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE:
				return validateBibliographyMarkType((BibliographyMarkType)value, diagnostics, context);
			case TextPackage.BIBLIOGRAPHY_SOURCE_TYPE:
				return validateBibliographySourceType((BibliographySourceType)value, diagnostics, context);
			case TextPackage.BIBLIOGRAPHY_TYPE:
				return validateBibliographyType((BibliographyType)value, diagnostics, context);
			case TextPackage.BOOKMARK_END_TYPE:
				return validateBookmarkEndType((BookmarkEndType)value, diagnostics, context);
			case TextPackage.BOOKMARK_REF_TYPE:
				return validateBookmarkRefType((BookmarkRefType)value, diagnostics, context);
			case TextPackage.BOOKMARK_START_TYPE:
				return validateBookmarkStartType((BookmarkStartType)value, diagnostics, context);
			case TextPackage.BOOKMARK_TYPE:
				return validateBookmarkType((BookmarkType)value, diagnostics, context);
			case TextPackage.CHANGED_REGION_TYPE:
				return validateChangedRegionType((ChangedRegionType)value, diagnostics, context);
			case TextPackage.CHANGE_MARKS_TYPE:
				return validateChangeMarksType((ChangeMarksType)value, diagnostics, context);
			case TextPackage.CHAPTER_TYPE:
				return validateChapterType((ChapterType)value, diagnostics, context);
			case TextPackage.CHARACTER_COUNT_TYPE:
				return validateCharacterCountType((CharacterCountType)value, diagnostics, context);
			case TextPackage.COMMON_FORM_CONTROL_CONTENT:
				return validateCommonFormControlContent((CommonFormControlContent)value, diagnostics, context);
			case TextPackage.CONDITIONAL_TEXT_TYPE:
				return validateConditionalTextType((ConditionalTextType)value, diagnostics, context);
			case TextPackage.CONFIG_ITEMS:
				return validateConfigItems((ConfigItems)value, diagnostics, context);
			case TextPackage.CREATION_DATE_TYPE:
				return validateCreationDateType((CreationDateType)value, diagnostics, context);
			case TextPackage.CREATION_TIME_TYPE:
				return validateCreationTimeType((CreationTimeType)value, diagnostics, context);
			case TextPackage.CREATOR_TYPE:
				return validateCreatorType((CreatorType)value, diagnostics, context);
			case TextPackage.DATABASE_NAME_TYPE:
				return validateDatabaseNameType((DatabaseNameType)value, diagnostics, context);
			case TextPackage.DATABASE_ROW_NUMBER_TYPE:
				return validateDatabaseRowNumberType((DatabaseRowNumberType)value, diagnostics, context);
			case TextPackage.DATE_TYPE:
				return validateDateType((DateType)value, diagnostics, context);
			case TextPackage.DDE_CONNECTION_DECLS_TYPE:
				return validateDdeConnectionDeclsType((DdeConnectionDeclsType)value, diagnostics, context);
			case TextPackage.DDE_CONNECTION_DECL_TYPE:
				return validateDdeConnectionDeclType((DdeConnectionDeclType)value, diagnostics, context);
			case TextPackage.DDE_CONNECTION_TYPE:
				return validateDdeConnectionType((DdeConnectionType)value, diagnostics, context);
			case TextPackage.DELETION_TYPE:
				return validateDeletionType((DeletionType)value, diagnostics, context);
			case TextPackage.DESCRIPTION_TYPE:
				return validateDescriptionType((DescriptionType)value, diagnostics, context);
			case TextPackage.EDITING_CYCLES_TYPE:
				return validateEditingCyclesType((EditingCyclesType)value, diagnostics, context);
			case TextPackage.EDITING_DURATION_TYPE:
				return validateEditingDurationType((EditingDurationType)value, diagnostics, context);
			case TextPackage.EXECUTE_MACRO_TYPE:
				return validateExecuteMacroType((ExecuteMacroType)value, diagnostics, context);
			case TextPackage.EXPRESSION_TYPE:
				return validateExpressionType((ExpressionType)value, diagnostics, context);
			case TextPackage.FILE_NAME_TYPE:
				return validateFileNameType((FileNameType)value, diagnostics, context);
			case TextPackage.FORMAT_CHANGE_TYPE:
				return validateFormatChangeType((FormatChangeType)value, diagnostics, context);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST:
				return validateFormPropertyTypeAndValueList((FormPropertyTypeAndValueList)value, diagnostics, context);
			case TextPackage.HEADER_FOOTER_CONTENT:
				return validateHeaderFooterContent((HeaderFooterContent)value, diagnostics, context);
			case TextPackage.HIDDEN_PARAGRAPH_TYPE:
				return validateHiddenParagraphType((HiddenParagraphType)value, diagnostics, context);
			case TextPackage.HIDDEN_TEXT_TYPE:
				return validateHiddenTextType((HiddenTextType)value, diagnostics, context);
			case TextPackage.HTYPE:
				return validateHType((HType)value, diagnostics, context);
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE:
				return validateIllustrationIndexSourceType((IllustrationIndexSourceType)value, diagnostics, context);
			case TextPackage.ILLUSTRATION_INDEX_TYPE:
				return validateIllustrationIndexType((IllustrationIndexType)value, diagnostics, context);
			case TextPackage.IMAGE_COUNT_TYPE:
				return validateImageCountType((ImageCountType)value, diagnostics, context);
			case TextPackage.INDEX_BODY_TYPE:
				return validateIndexBodyType((IndexBodyType)value, diagnostics, context);
			case TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE:
				return validateIndexEntryBibliographyType((IndexEntryBibliographyType)value, diagnostics, context);
			case TextPackage.INDEX_ENTRY_CHAPTER_TYPE:
				return validateIndexEntryChapterType((IndexEntryChapterType)value, diagnostics, context);
			case TextPackage.INDEX_ENTRY_LINK_END_TYPE:
				return validateIndexEntryLinkEndType((IndexEntryLinkEndType)value, diagnostics, context);
			case TextPackage.INDEX_ENTRY_LINK_START_TYPE:
				return validateIndexEntryLinkStartType((IndexEntryLinkStartType)value, diagnostics, context);
			case TextPackage.INDEX_ENTRY_PAGE_NUMBER_TYPE:
				return validateIndexEntryPageNumberType((IndexEntryPageNumberType)value, diagnostics, context);
			case TextPackage.INDEX_ENTRY_SPAN_TYPE:
				return validateIndexEntrySpanType((IndexEntrySpanType)value, diagnostics, context);
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE:
				return validateIndexEntryTabStopType((IndexEntryTabStopType)value, diagnostics, context);
			case TextPackage.INDEX_ENTRY_TEXT_TYPE:
				return validateIndexEntryTextType((IndexEntryTextType)value, diagnostics, context);
			case TextPackage.INDEX_SOURCE_STYLES_TYPE:
				return validateIndexSourceStylesType((IndexSourceStylesType)value, diagnostics, context);
			case TextPackage.INDEX_SOURCE_STYLE_TYPE:
				return validateIndexSourceStyleType((IndexSourceStyleType)value, diagnostics, context);
			case TextPackage.INDEX_TITLE_TEMPLATE_TYPE:
				return validateIndexTitleTemplateType((IndexTitleTemplateType)value, diagnostics, context);
			case TextPackage.INDEX_TITLE_TYPE:
				return validateIndexTitleType((IndexTitleType)value, diagnostics, context);
			case TextPackage.INITIAL_CREATOR_TYPE:
				return validateInitialCreatorType((InitialCreatorType)value, diagnostics, context);
			case TextPackage.INSERTION_TYPE:
				return validateInsertionType((InsertionType)value, diagnostics, context);
			case TextPackage.KEYWORDS_TYPE:
				return validateKeywordsType((KeywordsType)value, diagnostics, context);
			case TextPackage.LINE_BREAK_TYPE:
				return validateLineBreakType((LineBreakType)value, diagnostics, context);
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE:
				return validateLinenumberingConfigurationType((LinenumberingConfigurationType)value, diagnostics, context);
			case TextPackage.LINENUMBERING_SEPARATOR_TYPE:
				return validateLinenumberingSeparatorType((LinenumberingSeparatorType)value, diagnostics, context);
			case TextPackage.LIST_ITEM_TYPE:
				return validateListItemType((ListItemType)value, diagnostics, context);
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE:
				return validateListLevelStyleBulletType((ListLevelStyleBulletType)value, diagnostics, context);
			case TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE:
				return validateListLevelStyleImageType((ListLevelStyleImageType)value, diagnostics, context);
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE:
				return validateListLevelStyleNumberType((ListLevelStyleNumberType)value, diagnostics, context);
			case TextPackage.LIST_STYLE_TYPE:
				return validateListStyleType((ListStyleType)value, diagnostics, context);
			case TextPackage.LIST_TYPE:
				return validateListType((ListType)value, diagnostics, context);
			case TextPackage.MATH_MARKUP:
				return validateMathMarkup((MathMarkup)value, diagnostics, context);
			case TextPackage.MEASURE_TYPE:
				return validateMeasureType((MeasureType)value, diagnostics, context);
			case TextPackage.MODIFICATION_DATE_TYPE:
				return validateModificationDateType((ModificationDateType)value, diagnostics, context);
			case TextPackage.MODIFICATION_TIME_TYPE:
				return validateModificationTimeType((ModificationTimeType)value, diagnostics, context);
			case TextPackage.NOTE_BODY_TYPE:
				return validateNoteBodyType((NoteBodyType)value, diagnostics, context);
			case TextPackage.NOTE_CITATION_TYPE:
				return validateNoteCitationType((NoteCitationType)value, diagnostics, context);
			case TextPackage.NOTE_REF_TYPE:
				return validateNoteRefType((NoteRefType)value, diagnostics, context);
			case TextPackage.NOTE_TYPE:
				return validateNoteType((NoteType)value, diagnostics, context);
			case TextPackage.NUMBERED_PARAGRAPH_TYPE:
				return validateNumberedParagraphType((NumberedParagraphType)value, diagnostics, context);
			case TextPackage.OBJECT_COUNT_TYPE:
				return validateObjectCountType((ObjectCountType)value, diagnostics, context);
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE:
				return validateObjectIndexSourceType((ObjectIndexSourceType)value, diagnostics, context);
			case TextPackage.OBJECT_INDEX_TYPE:
				return validateObjectIndexType((ObjectIndexType)value, diagnostics, context);
			case TextPackage.OFFICE_BODY_CONTENT:
				return validateOfficeBodyContent((OfficeBodyContent)value, diagnostics, context);
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE:
				return validateOfficeChartContentMainType((OfficeChartContentMainType)value, diagnostics, context);
			case TextPackage.OFFICE_IMAGE_CONTENT_MAIN:
				return validateOfficeImageContentMain((OfficeImageContentMain)value, diagnostics, context);
			case TextPackage.OFFICE_META:
				return validateOfficeMeta((OfficeMeta)value, diagnostics, context);
			case TextPackage.OFFICE_META_CONTENT:
				return validateOfficeMetaContent((OfficeMetaContent)value, diagnostics, context);
			case TextPackage.OUTLINE_LEVEL_STYLE_TYPE:
				return validateOutlineLevelStyleType((OutlineLevelStyleType)value, diagnostics, context);
			case TextPackage.OUTLINE_STYLE_TYPE:
				return validateOutlineStyleType((OutlineStyleType)value, diagnostics, context);
			case TextPackage.PAGE_CONTINUATION_TYPE:
				return validatePageContinuationType((PageContinuationType)value, diagnostics, context);
			case TextPackage.PAGE_COUNT_TYPE:
				return validatePageCountType((PageCountType)value, diagnostics, context);
			case TextPackage.PAGE_NUMBER_TYPE:
				return validatePageNumberType((PageNumberType)value, diagnostics, context);
			case TextPackage.PAGE_SEQUENCE_TYPE:
				return validatePageSequenceType((PageSequenceType)value, diagnostics, context);
			case TextPackage.PAGE_TYPE:
				return validatePageType((PageType)value, diagnostics, context);
			case TextPackage.PAGE_VARIABLE_GET_TYPE:
				return validatePageVariableGetType((PageVariableGetType)value, diagnostics, context);
			case TextPackage.PAGE_VARIABLE_SET_TYPE:
				return validatePageVariableSetType((PageVariableSetType)value, diagnostics, context);
			case TextPackage.PARAGRAPH_COUNT_TYPE:
				return validateParagraphCountType((ParagraphCountType)value, diagnostics, context);
			case TextPackage.PLACEHOLDER_TYPE:
				return validatePlaceholderType((PlaceholderType)value, diagnostics, context);
			case TextPackage.PRINT_DATE_TYPE:
				return validatePrintDateType((PrintDateType)value, diagnostics, context);
			case TextPackage.PRINTED_BY_TYPE:
				return validatePrintedByType((PrintedByType)value, diagnostics, context);
			case TextPackage.PRINT_TIME_TYPE:
				return validatePrintTimeType((PrintTimeType)value, diagnostics, context);
			case TextPackage.PTYPE:
				return validatePType((PType)value, diagnostics, context);
			case TextPackage.REFERENCE_MARK_END_TYPE:
				return validateReferenceMarkEndType((ReferenceMarkEndType)value, diagnostics, context);
			case TextPackage.REFERENCE_MARK_START_TYPE:
				return validateReferenceMarkStartType((ReferenceMarkStartType)value, diagnostics, context);
			case TextPackage.REFERENCE_MARK_TYPE:
				return validateReferenceMarkType((ReferenceMarkType)value, diagnostics, context);
			case TextPackage.REFERENCE_REF_TYPE:
				return validateReferenceRefType((ReferenceRefType)value, diagnostics, context);
			case TextPackage.REGION_CONTENT:
				return validateRegionContent((RegionContent)value, diagnostics, context);
			case TextPackage.RUBY_BASE_TYPE:
				return validateRubyBaseType((RubyBaseType)value, diagnostics, context);
			case TextPackage.RUBY_TEXT_TYPE:
				return validateRubyTextType((RubyTextType)value, diagnostics, context);
			case TextPackage.RUBY_TYPE:
				return validateRubyType((RubyType)value, diagnostics, context);
			case TextPackage.SCRIPT_TYPE:
				return validateScriptType((ScriptType)value, diagnostics, context);
			case TextPackage.SECTION_SOURCE_TYPE:
				return validateSectionSourceType((SectionSourceType)value, diagnostics, context);
			case TextPackage.SECTION_TYPE:
				return validateSectionType((SectionType)value, diagnostics, context);
			case TextPackage.SENDER_CITY_TYPE:
				return validateSenderCityType((SenderCityType)value, diagnostics, context);
			case TextPackage.SENDER_COMPANY_TYPE:
				return validateSenderCompanyType((SenderCompanyType)value, diagnostics, context);
			case TextPackage.SENDER_COUNTRY_TYPE:
				return validateSenderCountryType((SenderCountryType)value, diagnostics, context);
			case TextPackage.SENDER_EMAIL_TYPE:
				return validateSenderEmailType((SenderEmailType)value, diagnostics, context);
			case TextPackage.SENDER_FAX_TYPE:
				return validateSenderFaxType((SenderFaxType)value, diagnostics, context);
			case TextPackage.SENDER_FIRSTNAME_TYPE:
				return validateSenderFirstnameType((SenderFirstnameType)value, diagnostics, context);
			case TextPackage.SENDER_INITIALS_TYPE:
				return validateSenderInitialsType((SenderInitialsType)value, diagnostics, context);
			case TextPackage.SENDER_LASTNAME_TYPE:
				return validateSenderLastnameType((SenderLastnameType)value, diagnostics, context);
			case TextPackage.SENDER_PHONE_PRIVATE_TYPE:
				return validateSenderPhonePrivateType((SenderPhonePrivateType)value, diagnostics, context);
			case TextPackage.SENDER_PHONE_WORK_TYPE:
				return validateSenderPhoneWorkType((SenderPhoneWorkType)value, diagnostics, context);
			case TextPackage.SENDER_POSITION_TYPE:
				return validateSenderPositionType((SenderPositionType)value, diagnostics, context);
			case TextPackage.SENDER_POSTAL_CODE_TYPE:
				return validateSenderPostalCodeType((SenderPostalCodeType)value, diagnostics, context);
			case TextPackage.SENDER_STATE_OR_PROVINCE_TYPE:
				return validateSenderStateOrProvinceType((SenderStateOrProvinceType)value, diagnostics, context);
			case TextPackage.SENDER_STREET_TYPE:
				return validateSenderStreetType((SenderStreetType)value, diagnostics, context);
			case TextPackage.SENDER_TITLE_TYPE:
				return validateSenderTitleType((SenderTitleType)value, diagnostics, context);
			case TextPackage.SEQUENCE_DECLS_TYPE:
				return validateSequenceDeclsType((SequenceDeclsType)value, diagnostics, context);
			case TextPackage.SEQUENCE_DECL_TYPE:
				return validateSequenceDeclType((SequenceDeclType)value, diagnostics, context);
			case TextPackage.SEQUENCE_REF_TYPE:
				return validateSequenceRefType((SequenceRefType)value, diagnostics, context);
			case TextPackage.SEQUENCE_TYPE:
				return validateSequenceType((SequenceType)value, diagnostics, context);
			case TextPackage.SOFT_PAGE_BREAK_TYPE:
				return validateSoftPageBreakType((SoftPageBreakType)value, diagnostics, context);
			case TextPackage.SORT_KEY_TYPE:
				return validateSortKeyType((SortKeyType)value, diagnostics, context);
			case TextPackage.SPAN_TYPE:
				return validateSpanType((SpanType)value, diagnostics, context);
			case TextPackage.STYLE_CHART_PROPERTIES_CONTENT:
				return validateStyleChartPropertiesContent((StyleChartPropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_DRAWING_PAGE_PROPERTIES_CONTENT:
				return validateStyleDrawingPagePropertiesContent((StyleDrawingPagePropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_GRAPHIC_PROPERTIES_CONTENT:
				return validateStyleGraphicPropertiesContent((StyleGraphicPropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_HEADER_FOOTER_PROPERTIES_CONTENT:
				return validateStyleHeaderFooterPropertiesContent((StyleHeaderFooterPropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_LIST_LEVEL_PROPERTIES_CONTENT:
				return validateStyleListLevelPropertiesContent((StyleListLevelPropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_PAGE_LAYOUT_PROPERTIES_CONTENT:
				return validateStylePageLayoutPropertiesContent((StylePageLayoutPropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_PARAGRAPH_PROPERTIES_CONTENT:
				return validateStyleParagraphPropertiesContent((StyleParagraphPropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_PROPERTIES_CONTENT:
				return validateStylePropertiesContent((StylePropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_RUBY_PROPERTIES_CONTENT:
				return validateStyleRubyPropertiesContent((StyleRubyPropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_SECTION_PROPERTIES_CONTENT:
				return validateStyleSectionPropertiesContent((StyleSectionPropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_STYLE_CONTENT:
				return validateStyleStyleContent((StyleStyleContent)value, diagnostics, context);
			case TextPackage.STYLE_TABLE_CELL_PROPERTIES_CONTENT:
				return validateStyleTableCellPropertiesContent((StyleTableCellPropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_TABLE_COLUMN_PROPERTIES_CONTENT:
				return validateStyleTableColumnPropertiesContent((StyleTableColumnPropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_TABLE_PROPERTIES_CONTENT:
				return validateStyleTablePropertiesContent((StyleTablePropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_TABLE_ROW_PROPERTIES_CONTENT:
				return validateStyleTableRowPropertiesContent((StyleTableRowPropertiesContent)value, diagnostics, context);
			case TextPackage.STYLE_TEXT_PROPERTIES_CONTENT:
				return validateStyleTextPropertiesContent((StyleTextPropertiesContent)value, diagnostics, context);
			case TextPackage.STYPE:
				return validateSType((SType)value, diagnostics, context);
			case TextPackage.SUBJECT_TYPE:
				return validateSubjectType((SubjectType)value, diagnostics, context);
			case TextPackage.TABLE_COUNT_TYPE:
				return validateTableCountType((TableCountType)value, diagnostics, context);
			case TextPackage.TABLE_FORMULA_TYPE:
				return validateTableFormulaType((TableFormulaType)value, diagnostics, context);
			case TextPackage.TABLE_INDEX_SOURCE_TYPE:
				return validateTableIndexSourceType((TableIndexSourceType)value, diagnostics, context);
			case TextPackage.TABLE_INDEX_TYPE:
				return validateTableIndexType((TableIndexType)value, diagnostics, context);
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE:
				return validateTableOfContentEntryTemplateType((TableOfContentEntryTemplateType)value, diagnostics, context);
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE:
				return validateTableOfContentSourceType((TableOfContentSourceType)value, diagnostics, context);
			case TextPackage.TABLE_OF_CONTENT_TYPE:
				return validateTableOfContentType((TableOfContentType)value, diagnostics, context);
			case TextPackage.TABLE_TABLE_CELL_CONTENT:
				return validateTableTableCellContent((TableTableCellContent)value, diagnostics, context);
			case TextPackage.TAB_TYPE:
				return validateTabType((TabType)value, diagnostics, context);
			case TextPackage.TEMPLATE_NAME_TYPE:
				return validateTemplateNameType((TemplateNameType)value, diagnostics, context);
			case TextPackage.TEXT_CHANGED_REGION_CONTENT:
				return validateTextChangedRegionContent((TextChangedRegionContent)value, diagnostics, context);
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST:
				return validateTextDatabaseDisplayAttlist((TextDatabaseDisplayAttlist)value, diagnostics, context);
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST:
				return validateTextDatabaseNextAttlist((TextDatabaseNextAttlist)value, diagnostics, context);
			case TextPackage.TEXT_DATABASE_ROW_SELECT_ATTLIST:
				return validateTextDatabaseRowSelectAttlist((TextDatabaseRowSelectAttlist)value, diagnostics, context);
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT:
				return validateTextIllustrationIndexEntryContent((TextIllustrationIndexEntryContent)value, diagnostics, context);
			case TextPackage.TEXT_INPUT_TYPE:
				return validateTextInputType((TextInputType)value, diagnostics, context);
			case TextPackage.TEXT_LIST_ITEM_CONTENT:
				return validateTextListItemContent((TextListItemContent)value, diagnostics, context);
			case TextPackage.TEXT_LIST_LEVEL_STYLE_IMAGE_ATTR:
				return validateTextListLevelStyleImageAttr((TextListLevelStyleImageAttr)value, diagnostics, context);
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT:
				return validateTextNotesConfigurationContent((TextNotesConfigurationContent)value, diagnostics, context);
			case TextPackage.TEXT_SECTION_SOURCE_DDE_TYPE:
				return validateTextSectionSourceDdeType((TextSectionSourceDdeType)value, diagnostics, context);
			case TextPackage.TIME_TYPE:
				return validateTimeType((TimeType)value, diagnostics, context);
			case TextPackage.TITLE_TYPE:
				return validateTitleType((TitleType)value, diagnostics, context);
			case TextPackage.TOC_MARK_END_TYPE:
				return validateTocMarkEndType((TocMarkEndType)value, diagnostics, context);
			case TextPackage.TOC_MARK_START_TYPE:
				return validateTocMarkStartType((TocMarkStartType)value, diagnostics, context);
			case TextPackage.TOC_MARK_TYPE:
				return validateTocMarkType((TocMarkType)value, diagnostics, context);
			case TextPackage.TRACKED_CHANGES_TYPE:
				return validateTrackedChangesType((TrackedChangesType)value, diagnostics, context);
			case TextPackage.USER_DEFINED_TYPE:
				return validateUserDefinedType((UserDefinedType)value, diagnostics, context);
			case TextPackage.USER_FIELD_DECLS_TYPE:
				return validateUserFieldDeclsType((UserFieldDeclsType)value, diagnostics, context);
			case TextPackage.USER_FIELD_DECL_TYPE:
				return validateUserFieldDeclType((UserFieldDeclType)value, diagnostics, context);
			case TextPackage.USER_FIELD_GET_TYPE:
				return validateUserFieldGetType((UserFieldGetType)value, diagnostics, context);
			case TextPackage.USER_FIELD_INPUT_TYPE:
				return validateUserFieldInputType((UserFieldInputType)value, diagnostics, context);
			case TextPackage.USER_INDEX_ENTRY_TEMPLATE_TYPE:
				return validateUserIndexEntryTemplateType((UserIndexEntryTemplateType)value, diagnostics, context);
			case TextPackage.USER_INDEX_MARK_END_TYPE:
				return validateUserIndexMarkEndType((UserIndexMarkEndType)value, diagnostics, context);
			case TextPackage.USER_INDEX_MARK_START_TYPE:
				return validateUserIndexMarkStartType((UserIndexMarkStartType)value, diagnostics, context);
			case TextPackage.USER_INDEX_MARK_TYPE:
				return validateUserIndexMarkType((UserIndexMarkType)value, diagnostics, context);
			case TextPackage.USER_INDEX_SOURCE_TYPE:
				return validateUserIndexSourceType((UserIndexSourceType)value, diagnostics, context);
			case TextPackage.USER_INDEX_TYPE:
				return validateUserIndexType((UserIndexType)value, diagnostics, context);
			case TextPackage.VARIABLE_DECLS_TYPE:
				return validateVariableDeclsType((VariableDeclsType)value, diagnostics, context);
			case TextPackage.VARIABLE_DECL_TYPE:
				return validateVariableDeclType((VariableDeclType)value, diagnostics, context);
			case TextPackage.VARIABLE_GET_TYPE:
				return validateVariableGetType((VariableGetType)value, diagnostics, context);
			case TextPackage.VARIABLE_INPUT_TYPE:
				return validateVariableInputType((VariableInputType)value, diagnostics, context);
			case TextPackage.VARIABLE_SET_TYPE:
				return validateVariableSetType((VariableSetType)value, diagnostics, context);
			case TextPackage.WORD_COUNT_TYPE:
				return validateWordCountType((WordCountType)value, diagnostics, context);
			case TextPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case TextPackage.ANCHOR_TYPE_TYPE:
				return validateAnchorTypeType((AnchorTypeType)value, diagnostics, context);
			case TextPackage.BIBLIOGRAPHY_DATA_FIELD_TYPE:
				return validateBibliographyDataFieldType((BibliographyDataFieldType)value, diagnostics, context);
			case TextPackage.BOOLEAN:
				return validateBoolean((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)value, diagnostics, context);
			case TextPackage.CAPTION_SEQUENCE_FORMAT_TYPE:
				return validateCaptionSequenceFormatType((CaptionSequenceFormatType)value, diagnostics, context);
			case TextPackage.CUSTOM_SHAPE_TYPE_MEMBER1:
				return validateCustomShapeTypeMember1((CustomShapeTypeMember1)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE:
				return validateDisplayType((DisplayType)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE1:
				return validateDisplayType1((DisplayType1)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE2:
				return validateDisplayType2((DisplayType2)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE3:
				return validateDisplayType3((DisplayType3)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE4:
				return validateDisplayType4((DisplayType4)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE5:
				return validateDisplayType5((DisplayType5)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE6:
				return validateDisplayType6((DisplayType6)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE7:
				return validateDisplayType7((DisplayType7)value, diagnostics, context);
			case TextPackage.FONT_FAMILY_GENERIC:
				return validateFontFamilyGeneric((FontFamilyGeneric)value, diagnostics, context);
			case TextPackage.FONT_PITCH:
				return validateFontPitch((FontPitch)value, diagnostics, context);
			case TextPackage.FONT_STYLE:
				return validateFontStyle((FontStyle)value, diagnostics, context);
			case TextPackage.FONT_VARIANT:
				return validateFontVariant((FontVariant)value, diagnostics, context);
			case TextPackage.FONT_WEIGHT:
				return validateFontWeight((FontWeight)value, diagnostics, context);
			case TextPackage.FOOTNOTES_POSITION_TYPE:
				return validateFootnotesPositionType((FootnotesPositionType)value, diagnostics, context);
			case TextPackage.GRADIENT_STYLE:
				return validateGradientStyle((GradientStyle)value, diagnostics, context);
			case TextPackage.HORI_BACK_POS:
				return validateHoriBackPos((HoriBackPos)value, diagnostics, context);
			case TextPackage.HORIZONTAL_MIRROR:
				return validateHorizontalMirror((HorizontalMirror)value, diagnostics, context);
			case TextPackage.INDEX_SCOPE_TYPE:
				return validateIndexScopeType((IndexScopeType)value, diagnostics, context);
			case TextPackage.INDEX_SCOPE_TYPE1:
				return validateIndexScopeType1((IndexScopeType1)value, diagnostics, context);
			case TextPackage.KEY_TYPE:
				return validateKeyType((KeyType)value, diagnostics, context);
			case TextPackage.KIND_TYPE:
				return validateKindType((KindType)value, diagnostics, context);
			case TextPackage.LINE_MODE:
				return validateLineMode((LineMode)value, diagnostics, context);
			case TextPackage.LINE_STYLE:
				return validateLineStyle((LineStyle)value, diagnostics, context);
			case TextPackage.LINE_TYPE:
				return validateLineType((LineType)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER3:
				return validateLineWidthMember3((LineWidthMember3)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER4:
				return validateLineWidthMember4((LineWidthMember4)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER5:
				return validateLineWidthMember5((LineWidthMember5)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER6:
				return validateLineWidthMember6((LineWidthMember6)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER7:
				return validateLineWidthMember7((LineWidthMember7)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER8:
				return validateLineWidthMember8((LineWidthMember8)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER9:
				return validateLineWidthMember9((LineWidthMember9)value, diagnostics, context);
			case TextPackage.NAVIGATION:
				return validateNavigation((Navigation)value, diagnostics, context);
			case TextPackage.NOTE_CLASS_TYPE:
				return validateNoteClassType((NoteClassType)value, diagnostics, context);
			case TextPackage.NUMBER_POSITION_TYPE:
				return validateNumberPositionType((NumberPositionType)value, diagnostics, context);
			case TextPackage.OUTLINE_LEVEL_TYPE:
				return validateOutlineLevelType((OutlineLevelType)value, diagnostics, context);
			case TextPackage.PLACEHOLDER_TYPE_TYPE:
				return validatePlaceholderTypeType((PlaceholderTypeType)value, diagnostics, context);
			case TextPackage.PRESENTATION_CLASSES:
				return validatePresentationClasses((PresentationClasses)value, diagnostics, context);
			case TextPackage.PRESENTATION_EFFECT_DIRECTIONS:
				return validatePresentationEffectDirections((PresentationEffectDirections)value, diagnostics, context);
			case TextPackage.PRESENTATION_EFFECTS:
				return validatePresentationEffects((PresentationEffects)value, diagnostics, context);
			case TextPackage.PRESENTATION_SPEEDS:
				return validatePresentationSpeeds((PresentationSpeeds)value, diagnostics, context);
			case TextPackage.REFERENCE_FORMAT_TYPE:
				return validateReferenceFormatType((ReferenceFormatType)value, diagnostics, context);
			case TextPackage.REFERENCE_FORMAT_TYPE1:
				return validateReferenceFormatType1((ReferenceFormatType1)value, diagnostics, context);
			case TextPackage.ROW_OR_COL:
				return validateRowOrCol((RowOrCol)value, diagnostics, context);
			case TextPackage.SELECT_PAGE_TYPE:
				return validateSelectPageType((SelectPageType)value, diagnostics, context);
			case TextPackage.SELECT_PAGE_TYPE1:
				return validateSelectPageType1((SelectPageType1)value, diagnostics, context);
			case TextPackage.SHADOW_TYPE_MEMBER1:
				return validateShadowTypeMember1((ShadowTypeMember1)value, diagnostics, context);
			case TextPackage.START_NUMBERING_AT_TYPE:
				return validateStartNumberingAtType((StartNumberingAtType)value, diagnostics, context);
			case TextPackage.STATES:
				return validateStates((States)value, diagnostics, context);
			case TextPackage.TAB_CYCLES:
				return validateTabCycles((TabCycles)value, diagnostics, context);
			case TextPackage.TABLE_TYPE_TYPE:
				return validateTableTypeType((TableTypeType)value, diagnostics, context);
			case TextPackage.TABLE_VISIBILITY_VALUE:
				return validateTableVisibilityValue((TableVisibilityValue)value, diagnostics, context);
			case TextPackage.TARGET_FRAME_NAME_MEMBER1:
				return validateTargetFrameNameMember1((TargetFrameNameMember1)value, diagnostics, context);
			case TextPackage.TARGET_FRAME_NAME_MEMBER2:
				return validateTargetFrameNameMember2((TargetFrameNameMember2)value, diagnostics, context);
			case TextPackage.TARGET_FRAME_NAME_MEMBER3:
				return validateTargetFrameNameMember3((TargetFrameNameMember3)value, diagnostics, context);
			case TextPackage.TARGET_FRAME_NAME_MEMBER4:
				return validateTargetFrameNameMember4((TargetFrameNameMember4)value, diagnostics, context);
			case TextPackage.TEXT_BIBLIOGRAPHY_TYPES:
				return validateTextBibliographyTypes((TextBibliographyTypes)value, diagnostics, context);
			case TextPackage.TYPES:
				return validateTypes((Types)value, diagnostics, context);
			case TextPackage.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case TextPackage.VERT_BACK_POS:
				return validateVertBackPos((VertBackPos)value, diagnostics, context);
			case TextPackage.ANCHOR_TYPE_TYPE_OBJECT:
				return validateAnchorTypeTypeObject((AnchorTypeType)value, diagnostics, context);
			case TextPackage.ANY_URI:
				return validateAnyURI((String)value, diagnostics, context);
			case TextPackage.BASE64_BINARY:
				return validateBase64Binary((byte[])value, diagnostics, context);
			case TextPackage.BIBLIOGRAPHY_DATA_FIELD_TYPE_OBJECT:
				return validateBibliographyDataFieldTypeObject((BibliographyDataFieldType)value, diagnostics, context);
			case TextPackage.BOOLEAN_OBJECT:
				return validateBooleanObject((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)value, diagnostics, context);
			case TextPackage.BORDER_WIDTHS:
				return validateBorderWidths((List<?>)value, diagnostics, context);
			case TextPackage.BORDER_WIDTHS_BASE:
				return validateBorderWidthsBase((List<?>)value, diagnostics, context);
			case TextPackage.BORDER_WIDTHS_BASE_ITEM:
				return validateBorderWidthsBaseItem((String)value, diagnostics, context);
			case TextPackage.CAPTION_SEQUENCE_FORMAT_TYPE_OBJECT:
				return validateCaptionSequenceFormatTypeObject((CaptionSequenceFormatType)value, diagnostics, context);
			case TextPackage.CELL_ADDRESS:
				return validateCellAddress((String)value, diagnostics, context);
			case TextPackage.CELL_RANGE_ADDRESS:
				return validateCellRangeAddress((String)value, diagnostics, context);
			case TextPackage.CELL_RANGE_ADDRESS_LIST:
				return validateCellRangeAddressList((String)value, diagnostics, context);
			case TextPackage.CHARACTER:
				return validateCharacter((String)value, diagnostics, context);
			case TextPackage.CITATION_BODY_STYLE_NAME_TYPE:
				return validateCitationBodyStyleNameType((String)value, diagnostics, context);
			case TextPackage.CITATION_BODY_STYLE_NAME_TYPE_MEMBER1:
				return validateCitationBodyStyleNameTypeMember1((String)value, diagnostics, context);
			case TextPackage.CITATION_STYLE_NAME_TYPE:
				return validateCitationStyleNameType((String)value, diagnostics, context);
			case TextPackage.CITATION_STYLE_NAME_TYPE_MEMBER1:
				return validateCitationStyleNameTypeMember1((String)value, diagnostics, context);
			case TextPackage.COLOR:
				return validateColor((String)value, diagnostics, context);
			case TextPackage.COND_STYLE_NAME_TYPE:
				return validateCondStyleNameType((String)value, diagnostics, context);
			case TextPackage.COND_STYLE_NAME_TYPE_MEMBER1:
				return validateCondStyleNameTypeMember1((String)value, diagnostics, context);
			case TextPackage.COORDINATE:
				return validateCoordinate((String)value, diagnostics, context);
			case TextPackage.COUNTRY_CODE:
				return validateCountryCode((String)value, diagnostics, context);
			case TextPackage.CUSTOM_SHAPE_TYPE:
				return validateCustomShapeType(value, diagnostics, context);
			case TextPackage.CUSTOM_SHAPE_TYPE_MEMBER1_OBJECT:
				return validateCustomShapeTypeMember1Object((CustomShapeTypeMember1)value, diagnostics, context);
			case TextPackage.DATE:
				return validateDate((XMLGregorianCalendar)value, diagnostics, context);
			case TextPackage.DATE_OR_DATE_TIME:
				return validateDateOrDateTime((XMLGregorianCalendar)value, diagnostics, context);
			case TextPackage.DATE_TIME:
				return validateDateTime((XMLGregorianCalendar)value, diagnostics, context);
			case TextPackage.DEFAULT_STYLE_NAME_TYPE:
				return validateDefaultStyleNameType((String)value, diagnostics, context);
			case TextPackage.DEFAULT_STYLE_NAME_TYPE_MEMBER1:
				return validateDefaultStyleNameTypeMember1((String)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE_OBJECT:
				return validateDisplayTypeObject((DisplayType2)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE_OBJECT1:
				return validateDisplayTypeObject1((DisplayType3)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE_OBJECT2:
				return validateDisplayTypeObject2((DisplayType5)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE_OBJECT3:
				return validateDisplayTypeObject3((DisplayType1)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE_OBJECT4:
				return validateDisplayTypeObject4((DisplayType)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE_OBJECT5:
				return validateDisplayTypeObject5((DisplayType6)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE_OBJECT6:
				return validateDisplayTypeObject6((DisplayType4)value, diagnostics, context);
			case TextPackage.DISPLAY_TYPE_OBJECT7:
				return validateDisplayTypeObject7((DisplayType7)value, diagnostics, context);
			case TextPackage.DISTANCE:
				return validateDistance((String)value, diagnostics, context);
			case TextPackage.DOUBLE:
				return validateDouble(((Double)value).doubleValue(), diagnostics, context);
			case TextPackage.DOUBLE_OBJECT:
				return validateDoubleObject((Double)value, diagnostics, context);
			case TextPackage.DURATION:
				return validateDuration((Duration)value, diagnostics, context);
			case TextPackage.FONT_FAMILY_GENERIC_OBJECT:
				return validateFontFamilyGenericObject((FontFamilyGeneric)value, diagnostics, context);
			case TextPackage.FONT_PITCH_OBJECT:
				return validateFontPitchObject((FontPitch)value, diagnostics, context);
			case TextPackage.FONT_STYLE_OBJECT:
				return validateFontStyleObject((FontStyle)value, diagnostics, context);
			case TextPackage.FONT_VARIANT_OBJECT:
				return validateFontVariantObject((FontVariant)value, diagnostics, context);
			case TextPackage.FONT_WEIGHT_OBJECT:
				return validateFontWeightObject((FontWeight)value, diagnostics, context);
			case TextPackage.FOOTNOTES_POSITION_TYPE_OBJECT:
				return validateFootnotesPositionTypeObject((FootnotesPositionType)value, diagnostics, context);
			case TextPackage.FORMULA:
				return validateFormula((String)value, diagnostics, context);
			case TextPackage.GRADIENT_STYLE_OBJECT:
				return validateGradientStyleObject((GradientStyle)value, diagnostics, context);
			case TextPackage.HORI_BACK_POS_OBJECT:
				return validateHoriBackPosObject((HoriBackPos)value, diagnostics, context);
			case TextPackage.HORIZONTAL_MIRROR_OBJECT:
				return validateHorizontalMirrorObject((HorizontalMirror)value, diagnostics, context);
			case TextPackage.ID:
				return validateID((String)value, diagnostics, context);
			case TextPackage.IDREF:
				return validateIDREF((String)value, diagnostics, context);
			case TextPackage.IDREFS:
				return validateIDREFS((List<?>)value, diagnostics, context);
			case TextPackage.INDEX_SCOPE_TYPE_OBJECT:
				return validateIndexScopeTypeObject((IndexScopeType)value, diagnostics, context);
			case TextPackage.INDEX_SCOPE_TYPE_OBJECT1:
				return validateIndexScopeTypeObject1((IndexScopeType1)value, diagnostics, context);
			case TextPackage.INTEGER:
				return validateInteger((BigInteger)value, diagnostics, context);
			case TextPackage.KEY_TYPE_OBJECT:
				return validateKeyTypeObject((KeyType)value, diagnostics, context);
			case TextPackage.KIND_TYPE_OBJECT:
				return validateKindTypeObject((KindType)value, diagnostics, context);
			case TextPackage.LANGUAGE:
				return validateLanguage((String)value, diagnostics, context);
			case TextPackage.LANGUAGE_CODE:
				return validateLanguageCode((String)value, diagnostics, context);
			case TextPackage.LENGTH:
				return validateLength((String)value, diagnostics, context);
			case TextPackage.LINE_MODE_OBJECT:
				return validateLineModeObject((LineMode)value, diagnostics, context);
			case TextPackage.LINE_STYLE_OBJECT:
				return validateLineStyleObject((LineStyle)value, diagnostics, context);
			case TextPackage.LINE_TYPE_OBJECT:
				return validateLineTypeObject((LineType)value, diagnostics, context);
			case TextPackage.LINE_WIDTH:
				return validateLineWidth(value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER3_OBJECT:
				return validateLineWidthMember3Object((LineWidthMember3)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER4_OBJECT:
				return validateLineWidthMember4Object((LineWidthMember4)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER5_OBJECT:
				return validateLineWidthMember5Object((LineWidthMember5)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER6_OBJECT:
				return validateLineWidthMember6Object((LineWidthMember6)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER7_OBJECT:
				return validateLineWidthMember7Object((LineWidthMember7)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER8_OBJECT:
				return validateLineWidthMember8Object((LineWidthMember8)value, diagnostics, context);
			case TextPackage.LINE_WIDTH_MEMBER9_OBJECT:
				return validateLineWidthMember9Object((LineWidthMember9)value, diagnostics, context);
			case TextPackage.MAIN_ENTRY_STYLE_NAME_TYPE:
				return validateMainEntryStyleNameType((String)value, diagnostics, context);
			case TextPackage.MAIN_ENTRY_STYLE_NAME_TYPE_MEMBER1:
				return validateMainEntryStyleNameTypeMember1((String)value, diagnostics, context);
			case TextPackage.MASTER_PAGE_NAME_TYPE:
				return validateMasterPageNameType((String)value, diagnostics, context);
			case TextPackage.MASTER_PAGE_NAME_TYPE1:
				return validateMasterPageNameType1((String)value, diagnostics, context);
			case TextPackage.MASTER_PAGE_NAME_TYPE_MEMBER1:
				return validateMasterPageNameTypeMember1((String)value, diagnostics, context);
			case TextPackage.MASTER_PAGE_NAME_TYPE_MEMBER11:
				return validateMasterPageNameTypeMember11((String)value, diagnostics, context);
			case TextPackage.NAMESPACED_TOKEN:
				return validateNamespacedToken((String)value, diagnostics, context);
			case TextPackage.NAVIGATION_OBJECT:
				return validateNavigationObject((Navigation)value, diagnostics, context);
			case TextPackage.NON_NEGATIVE_INTEGER:
				return validateNonNegativeInteger((BigInteger)value, diagnostics, context);
			case TextPackage.NON_NEGATIVE_LENGTH:
				return validateNonNegativeLength((String)value, diagnostics, context);
			case TextPackage.NON_NEGATIVE_PIXEL_LENGTH:
				return validateNonNegativePixelLength((String)value, diagnostics, context);
			case TextPackage.NOTE_CLASS_TYPE_OBJECT:
				return validateNoteClassTypeObject((NoteClassType)value, diagnostics, context);
			case TextPackage.NUMBER_POSITION_TYPE_OBJECT:
				return validateNumberPositionTypeObject((NumberPositionType)value, diagnostics, context);
			case TextPackage.OUTLINE_LEVEL_TYPE_OBJECT:
				return validateOutlineLevelTypeObject((OutlineLevelType)value, diagnostics, context);
			case TextPackage.PARAGRAPH_STYLE_NAME_TYPE:
				return validateParagraphStyleNameType((String)value, diagnostics, context);
			case TextPackage.PARAGRAPH_STYLE_NAME_TYPE_MEMBER1:
				return validateParagraphStyleNameTypeMember1((String)value, diagnostics, context);
			case TextPackage.PATH_DATA:
				return validatePathData((String)value, diagnostics, context);
			case TextPackage.PERCENT:
				return validatePercent((String)value, diagnostics, context);
			case TextPackage.PLACEHOLDER_TYPE_TYPE_OBJECT:
				return validatePlaceholderTypeTypeObject((PlaceholderTypeType)value, diagnostics, context);
			case TextPackage.POINT3_D:
				return validatePoint3D((String)value, diagnostics, context);
			case TextPackage.POINTS:
				return validatePoints((String)value, diagnostics, context);
			case TextPackage.POSITIVE_INTEGER:
				return validatePositiveInteger((BigInteger)value, diagnostics, context);
			case TextPackage.POSITIVE_LENGTH:
				return validatePositiveLength((String)value, diagnostics, context);
			case TextPackage.PRESENTATION_CLASSES_OBJECT:
				return validatePresentationClassesObject((PresentationClasses)value, diagnostics, context);
			case TextPackage.PRESENTATION_EFFECT_DIRECTIONS_OBJECT:
				return validatePresentationEffectDirectionsObject((PresentationEffectDirections)value, diagnostics, context);
			case TextPackage.PRESENTATION_EFFECTS_OBJECT:
				return validatePresentationEffectsObject((PresentationEffects)value, diagnostics, context);
			case TextPackage.PRESENTATION_SPEEDS_OBJECT:
				return validatePresentationSpeedsObject((PresentationSpeeds)value, diagnostics, context);
			case TextPackage.REFERENCE_FORMAT_TYPE_OBJECT:
				return validateReferenceFormatTypeObject((ReferenceFormatType)value, diagnostics, context);
			case TextPackage.REFERENCE_FORMAT_TYPE_OBJECT1:
				return validateReferenceFormatTypeObject1((ReferenceFormatType1)value, diagnostics, context);
			case TextPackage.RELATIVE_LENGTH:
				return validateRelativeLength((String)value, diagnostics, context);
			case TextPackage.ROW_OR_COL_OBJECT:
				return validateRowOrColObject((RowOrCol)value, diagnostics, context);
			case TextPackage.SELECT_PAGE_TYPE_OBJECT:
				return validateSelectPageTypeObject((SelectPageType)value, diagnostics, context);
			case TextPackage.SELECT_PAGE_TYPE_OBJECT1:
				return validateSelectPageTypeObject1((SelectPageType1)value, diagnostics, context);
			case TextPackage.SHADOW_TYPE:
				return validateShadowType(value, diagnostics, context);
			case TextPackage.SHADOW_TYPE_MEMBER1_OBJECT:
				return validateShadowTypeMember1Object((ShadowTypeMember1)value, diagnostics, context);
			case TextPackage.START_NUMBERING_AT_TYPE_OBJECT:
				return validateStartNumberingAtTypeObject((StartNumberingAtType)value, diagnostics, context);
			case TextPackage.STATES_OBJECT:
				return validateStatesObject((States)value, diagnostics, context);
			case TextPackage.STRING:
				return validateString((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME:
				return validateStyleName((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_REF:
				return validateStyleNameRef((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_REFS:
				return validateStyleNameRefs((List<?>)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE:
				return validateStyleNameType((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE1:
				return validateStyleNameType1((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE2:
				return validateStyleNameType2((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE3:
				return validateStyleNameType3((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE4:
				return validateStyleNameType4((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE5:
				return validateStyleNameType5((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE6:
				return validateStyleNameType6((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE7:
				return validateStyleNameType7((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE8:
				return validateStyleNameType8((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE9:
				return validateStyleNameType9((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE10:
				return validateStyleNameType10((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE11:
				return validateStyleNameType11((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE12:
				return validateStyleNameType12((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE13:
				return validateStyleNameType13((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE14:
				return validateStyleNameType14((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE15:
				return validateStyleNameType15((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE16:
				return validateStyleNameType16((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE17:
				return validateStyleNameType17((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE18:
				return validateStyleNameType18((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE19:
				return validateStyleNameType19((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE20:
				return validateStyleNameType20((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE21:
				return validateStyleNameType21((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE22:
				return validateStyleNameType22((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE23:
				return validateStyleNameType23((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE24:
				return validateStyleNameType24((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE25:
				return validateStyleNameType25((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER1:
				return validateStyleNameTypeMember1((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER11:
				return validateStyleNameTypeMember11((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER12:
				return validateStyleNameTypeMember12((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER13:
				return validateStyleNameTypeMember13((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER14:
				return validateStyleNameTypeMember14((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER15:
				return validateStyleNameTypeMember15((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER16:
				return validateStyleNameTypeMember16((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER17:
				return validateStyleNameTypeMember17((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER18:
				return validateStyleNameTypeMember18((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER19:
				return validateStyleNameTypeMember19((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER110:
				return validateStyleNameTypeMember110((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER111:
				return validateStyleNameTypeMember111((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER112:
				return validateStyleNameTypeMember112((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER113:
				return validateStyleNameTypeMember113((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER114:
				return validateStyleNameTypeMember114((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER115:
				return validateStyleNameTypeMember115((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER116:
				return validateStyleNameTypeMember116((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER117:
				return validateStyleNameTypeMember117((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER118:
				return validateStyleNameTypeMember118((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER119:
				return validateStyleNameTypeMember119((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER120:
				return validateStyleNameTypeMember120((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER121:
				return validateStyleNameTypeMember121((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER122:
				return validateStyleNameTypeMember122((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER123:
				return validateStyleNameTypeMember123((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER124:
				return validateStyleNameTypeMember124((String)value, diagnostics, context);
			case TextPackage.STYLE_NAME_TYPE_MEMBER125:
				return validateStyleNameTypeMember125((String)value, diagnostics, context);
			case TextPackage.TAB_CYCLES_OBJECT:
				return validateTabCyclesObject((TabCycles)value, diagnostics, context);
			case TextPackage.TABLE_TYPE_TYPE_OBJECT:
				return validateTableTypeTypeObject((TableTypeType)value, diagnostics, context);
			case TextPackage.TABLE_VISIBILITY_VALUE_OBJECT:
				return validateTableVisibilityValueObject((TableVisibilityValue)value, diagnostics, context);
			case TextPackage.TARGET_FRAME_NAME:
				return validateTargetFrameName(value, diagnostics, context);
			case TextPackage.TARGET_FRAME_NAME_MEMBER1_OBJECT:
				return validateTargetFrameNameMember1Object((TargetFrameNameMember1)value, diagnostics, context);
			case TextPackage.TARGET_FRAME_NAME_MEMBER2_OBJECT:
				return validateTargetFrameNameMember2Object((TargetFrameNameMember2)value, diagnostics, context);
			case TextPackage.TARGET_FRAME_NAME_MEMBER3_OBJECT:
				return validateTargetFrameNameMember3Object((TargetFrameNameMember3)value, diagnostics, context);
			case TextPackage.TARGET_FRAME_NAME_MEMBER4_OBJECT:
				return validateTargetFrameNameMember4Object((TargetFrameNameMember4)value, diagnostics, context);
			case TextPackage.TEXT_BIBLIOGRAPHY_TYPES_OBJECT:
				return validateTextBibliographyTypesObject((TextBibliographyTypes)value, diagnostics, context);
			case TextPackage.TEXT_ENCODING:
				return validateTextEncoding((String)value, diagnostics, context);
			case TextPackage.TIME:
				return validateTime((XMLGregorianCalendar)value, diagnostics, context);
			case TextPackage.TIME_OR_DATE_TIME:
				return validateTimeOrDateTime((XMLGregorianCalendar)value, diagnostics, context);
			case TextPackage.TYPES_OBJECT:
				return validateTypesObject((Types)value, diagnostics, context);
			case TextPackage.VALUE_TYPE_OBJECT:
				return validateValueTypeObject((ValueType)value, diagnostics, context);
			case TextPackage.VARIABLE_NAME:
				return validateVariableName((String)value, diagnostics, context);
			case TextPackage.VECTOR3_D:
				return validateVector3D((String)value, diagnostics, context);
			case TextPackage.VERT_BACK_POS_OBJECT:
				return validateVertBackPosObject((VertBackPos)value, diagnostics, context);
			case TextPackage.VISITED_STYLE_NAME_TYPE:
				return validateVisitedStyleNameType((String)value, diagnostics, context);
			case TextPackage.VISITED_STYLE_NAME_TYPE_MEMBER1:
				return validateVisitedStyleNameTypeMember1((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlphabeticalIndexAutoMarkFileType(AlphabeticalIndexAutoMarkFileType alphabeticalIndexAutoMarkFileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alphabeticalIndexAutoMarkFileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlphabeticalIndexEntryTemplateType(AlphabeticalIndexEntryTemplateType alphabeticalIndexEntryTemplateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alphabeticalIndexEntryTemplateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlphabeticalIndexMarkEndType(AlphabeticalIndexMarkEndType alphabeticalIndexMarkEndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alphabeticalIndexMarkEndType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlphabeticalIndexMarkStartType(AlphabeticalIndexMarkStartType alphabeticalIndexMarkStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alphabeticalIndexMarkStartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlphabeticalIndexMarkType(AlphabeticalIndexMarkType alphabeticalIndexMarkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alphabeticalIndexMarkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlphabeticalIndexSourceType(AlphabeticalIndexSourceType alphabeticalIndexSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alphabeticalIndexSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlphabeticalIndexType(AlphabeticalIndexType alphabeticalIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alphabeticalIndexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyAttListOrElements(AnyAttListOrElements anyAttListOrElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anyAttListOrElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAType(AType aType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorInitialsType(AuthorInitialsType authorInitialsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorInitialsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorNameType(AuthorNameType authorNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBibliographyConfigurationType(BibliographyConfigurationType bibliographyConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bibliographyConfigurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBibliographyEntryTemplateType(BibliographyEntryTemplateType bibliographyEntryTemplateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bibliographyEntryTemplateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBibliographyMarkType(BibliographyMarkType bibliographyMarkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bibliographyMarkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBibliographySourceType(BibliographySourceType bibliographySourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bibliographySourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBibliographyType(BibliographyType bibliographyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bibliographyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookmarkEndType(BookmarkEndType bookmarkEndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bookmarkEndType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookmarkRefType(BookmarkRefType bookmarkRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bookmarkRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookmarkStartType(BookmarkStartType bookmarkStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bookmarkStartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookmarkType(BookmarkType bookmarkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bookmarkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangedRegionType(ChangedRegionType changedRegionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changedRegionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeMarksType(ChangeMarksType changeMarksType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeMarksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChapterType(ChapterType chapterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chapterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterCountType(CharacterCountType characterCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characterCountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonFormControlContent(CommonFormControlContent commonFormControlContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonFormControlContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalTextType(ConditionalTextType conditionalTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionalTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigItems(ConfigItems configItems, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configItems, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreationDateType(CreationDateType creationDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creationDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreationTimeType(CreationTimeType creationTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creationTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreatorType(CreatorType creatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseNameType(DatabaseNameType databaseNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseRowNumberType(DatabaseRowNumberType databaseRowNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(databaseRowNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateType(DateType dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdeConnectionDeclsType(DdeConnectionDeclsType ddeConnectionDeclsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddeConnectionDeclsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdeConnectionDeclType(DdeConnectionDeclType ddeConnectionDeclType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddeConnectionDeclType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdeConnectionType(DdeConnectionType ddeConnectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddeConnectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeletionType(DeletionType deletionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deletionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType(DescriptionType descriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditingCyclesType(EditingCyclesType editingCyclesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(editingCyclesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditingDurationType(EditingDurationType editingDurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(editingDurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecuteMacroType(ExecuteMacroType executeMacroType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executeMacroType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionType(ExpressionType expressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileNameType(FileNameType fileNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatChangeType(FormatChangeType formatChangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formatChangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormPropertyTypeAndValueList(FormPropertyTypeAndValueList formPropertyTypeAndValueList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formPropertyTypeAndValueList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeaderFooterContent(HeaderFooterContent headerFooterContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headerFooterContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHiddenParagraphType(HiddenParagraphType hiddenParagraphType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hiddenParagraphType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHiddenTextType(HiddenTextType hiddenTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hiddenTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHType(HType hType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIllustrationIndexSourceType(IllustrationIndexSourceType illustrationIndexSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(illustrationIndexSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIllustrationIndexType(IllustrationIndexType illustrationIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(illustrationIndexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageCountType(ImageCountType imageCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageCountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexBodyType(IndexBodyType indexBodyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexBodyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexEntryBibliographyType(IndexEntryBibliographyType indexEntryBibliographyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexEntryBibliographyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexEntryChapterType(IndexEntryChapterType indexEntryChapterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexEntryChapterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexEntryLinkEndType(IndexEntryLinkEndType indexEntryLinkEndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexEntryLinkEndType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexEntryLinkStartType(IndexEntryLinkStartType indexEntryLinkStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexEntryLinkStartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexEntryPageNumberType(IndexEntryPageNumberType indexEntryPageNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexEntryPageNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexEntrySpanType(IndexEntrySpanType indexEntrySpanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexEntrySpanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexEntryTabStopType(IndexEntryTabStopType indexEntryTabStopType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexEntryTabStopType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexEntryTextType(IndexEntryTextType indexEntryTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexEntryTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexSourceStylesType(IndexSourceStylesType indexSourceStylesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexSourceStylesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexSourceStyleType(IndexSourceStyleType indexSourceStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexSourceStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexTitleTemplateType(IndexTitleTemplateType indexTitleTemplateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexTitleTemplateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexTitleType(IndexTitleType indexTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexTitleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialCreatorType(InitialCreatorType initialCreatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initialCreatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsertionType(InsertionType insertionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insertionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeywordsType(KeywordsType keywordsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keywordsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineBreakType(LineBreakType lineBreakType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineBreakType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinenumberingConfigurationType(LinenumberingConfigurationType linenumberingConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linenumberingConfigurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinenumberingSeparatorType(LinenumberingSeparatorType linenumberingSeparatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linenumberingSeparatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListItemType(ListItemType listItemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listItemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListLevelStyleBulletType(ListLevelStyleBulletType listLevelStyleBulletType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listLevelStyleBulletType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListLevelStyleImageType(ListLevelStyleImageType listLevelStyleImageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listLevelStyleImageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListLevelStyleNumberType(ListLevelStyleNumberType listLevelStyleNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listLevelStyleNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStyleType(ListStyleType listStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListType(ListType listType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMathMarkup(MathMarkup mathMarkup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mathMarkup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureType(MeasureType measureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModificationDateType(ModificationDateType modificationDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modificationDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModificationTimeType(ModificationTimeType modificationTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modificationTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteBodyType(NoteBodyType noteBodyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noteBodyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteCitationType(NoteCitationType noteCitationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noteCitationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteRefType(NoteRefType noteRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noteRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteType(NoteType noteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberedParagraphType(NumberedParagraphType numberedParagraphType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberedParagraphType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectCountType(ObjectCountType objectCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectCountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectIndexSourceType(ObjectIndexSourceType objectIndexSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectIndexSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectIndexType(ObjectIndexType objectIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectIndexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfficeBodyContent(OfficeBodyContent officeBodyContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(officeBodyContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfficeChartContentMainType(OfficeChartContentMainType officeChartContentMainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(officeChartContentMainType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfficeImageContentMain(OfficeImageContentMain officeImageContentMain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(officeImageContentMain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfficeMeta(OfficeMeta officeMeta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(officeMeta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfficeMetaContent(OfficeMetaContent officeMetaContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(officeMetaContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutlineLevelStyleType(OutlineLevelStyleType outlineLevelStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outlineLevelStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutlineStyleType(OutlineStyleType outlineStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outlineStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageContinuationType(PageContinuationType pageContinuationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageContinuationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageCountType(PageCountType pageCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageCountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageNumberType(PageNumberType pageNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageSequenceType(PageSequenceType pageSequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageSequenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageType(PageType pageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageVariableGetType(PageVariableGetType pageVariableGetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageVariableGetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageVariableSetType(PageVariableSetType pageVariableSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageVariableSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParagraphCountType(ParagraphCountType paragraphCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paragraphCountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlaceholderType(PlaceholderType placeholderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placeholderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrintDateType(PrintDateType printDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(printDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrintedByType(PrintedByType printedByType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(printedByType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrintTimeType(PrintTimeType printTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(printTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePType(PType pType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceMarkEndType(ReferenceMarkEndType referenceMarkEndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceMarkEndType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceMarkStartType(ReferenceMarkStartType referenceMarkStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceMarkStartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceMarkType(ReferenceMarkType referenceMarkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceMarkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceRefType(ReferenceRefType referenceRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionContent(RegionContent regionContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRubyBaseType(RubyBaseType rubyBaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rubyBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRubyTextType(RubyTextType rubyTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rubyTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRubyType(RubyType rubyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rubyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptType(ScriptType scriptType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scriptType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionSourceType(SectionSourceType sectionSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sectionSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionType(SectionType sectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderCityType(SenderCityType senderCityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderCityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderCompanyType(SenderCompanyType senderCompanyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderCompanyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderCountryType(SenderCountryType senderCountryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderCountryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderEmailType(SenderEmailType senderEmailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderEmailType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderFaxType(SenderFaxType senderFaxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderFaxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderFirstnameType(SenderFirstnameType senderFirstnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderFirstnameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderInitialsType(SenderInitialsType senderInitialsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderInitialsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderLastnameType(SenderLastnameType senderLastnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderLastnameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderPhonePrivateType(SenderPhonePrivateType senderPhonePrivateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderPhonePrivateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderPhoneWorkType(SenderPhoneWorkType senderPhoneWorkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderPhoneWorkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderPositionType(SenderPositionType senderPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderPostalCodeType(SenderPostalCodeType senderPostalCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderPostalCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderStateOrProvinceType(SenderStateOrProvinceType senderStateOrProvinceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderStateOrProvinceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderStreetType(SenderStreetType senderStreetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderStreetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSenderTitleType(SenderTitleType senderTitleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(senderTitleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceDeclsType(SequenceDeclsType sequenceDeclsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceDeclsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceDeclType(SequenceDeclType sequenceDeclType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceDeclType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceRefType(SequenceRefType sequenceRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceType(SequenceType sequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftPageBreakType(SoftPageBreakType softPageBreakType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softPageBreakType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortKeyType(SortKeyType sortKeyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortKeyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpanType(SpanType spanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleChartPropertiesContent(StyleChartPropertiesContent styleChartPropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleChartPropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleDrawingPagePropertiesContent(StyleDrawingPagePropertiesContent styleDrawingPagePropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleDrawingPagePropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleGraphicPropertiesContent(StyleGraphicPropertiesContent styleGraphicPropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleGraphicPropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleHeaderFooterPropertiesContent(StyleHeaderFooterPropertiesContent styleHeaderFooterPropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleHeaderFooterPropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleListLevelPropertiesContent(StyleListLevelPropertiesContent styleListLevelPropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleListLevelPropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStylePageLayoutPropertiesContent(StylePageLayoutPropertiesContent stylePageLayoutPropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stylePageLayoutPropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleParagraphPropertiesContent(StyleParagraphPropertiesContent styleParagraphPropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleParagraphPropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStylePropertiesContent(StylePropertiesContent stylePropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stylePropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleRubyPropertiesContent(StyleRubyPropertiesContent styleRubyPropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleRubyPropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleSectionPropertiesContent(StyleSectionPropertiesContent styleSectionPropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleSectionPropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleStyleContent(StyleStyleContent styleStyleContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleStyleContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleTableCellPropertiesContent(StyleTableCellPropertiesContent styleTableCellPropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleTableCellPropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleTableColumnPropertiesContent(StyleTableColumnPropertiesContent styleTableColumnPropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleTableColumnPropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleTablePropertiesContent(StyleTablePropertiesContent styleTablePropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleTablePropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleTableRowPropertiesContent(StyleTableRowPropertiesContent styleTableRowPropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleTableRowPropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleTextPropertiesContent(StyleTextPropertiesContent styleTextPropertiesContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleTextPropertiesContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSType(SType sType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectType(SubjectType subjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableCountType(TableCountType tableCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableCountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableFormulaType(TableFormulaType tableFormulaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableFormulaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableIndexSourceType(TableIndexSourceType tableIndexSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableIndexSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableIndexType(TableIndexType tableIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableIndexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableOfContentEntryTemplateType(TableOfContentEntryTemplateType tableOfContentEntryTemplateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableOfContentEntryTemplateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableOfContentSourceType(TableOfContentSourceType tableOfContentSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableOfContentSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableOfContentType(TableOfContentType tableOfContentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableOfContentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableTableCellContent(TableTableCellContent tableTableCellContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableTableCellContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabType(TabType tabType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tabType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateNameType(TemplateNameType templateNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(templateNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextChangedRegionContent(TextChangedRegionContent textChangedRegionContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textChangedRegionContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextDatabaseDisplayAttlist(TextDatabaseDisplayAttlist textDatabaseDisplayAttlist, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textDatabaseDisplayAttlist, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextDatabaseNextAttlist(TextDatabaseNextAttlist textDatabaseNextAttlist, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textDatabaseNextAttlist, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextDatabaseRowSelectAttlist(TextDatabaseRowSelectAttlist textDatabaseRowSelectAttlist, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textDatabaseRowSelectAttlist, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextIllustrationIndexEntryContent(TextIllustrationIndexEntryContent textIllustrationIndexEntryContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textIllustrationIndexEntryContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextInputType(TextInputType textInputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textInputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextListItemContent(TextListItemContent textListItemContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textListItemContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextListLevelStyleImageAttr(TextListLevelStyleImageAttr textListLevelStyleImageAttr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textListLevelStyleImageAttr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextNotesConfigurationContent(TextNotesConfigurationContent textNotesConfigurationContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textNotesConfigurationContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextSectionSourceDdeType(TextSectionSourceDdeType textSectionSourceDdeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textSectionSourceDdeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType(TimeType timeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitleType(TitleType titleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(titleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTocMarkEndType(TocMarkEndType tocMarkEndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tocMarkEndType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTocMarkStartType(TocMarkStartType tocMarkStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tocMarkStartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTocMarkType(TocMarkType tocMarkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tocMarkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrackedChangesType(TrackedChangesType trackedChangesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trackedChangesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserDefinedType(UserDefinedType userDefinedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userDefinedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserFieldDeclsType(UserFieldDeclsType userFieldDeclsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userFieldDeclsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserFieldDeclType(UserFieldDeclType userFieldDeclType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userFieldDeclType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserFieldGetType(UserFieldGetType userFieldGetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userFieldGetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserFieldInputType(UserFieldInputType userFieldInputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userFieldInputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserIndexEntryTemplateType(UserIndexEntryTemplateType userIndexEntryTemplateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userIndexEntryTemplateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserIndexMarkEndType(UserIndexMarkEndType userIndexMarkEndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userIndexMarkEndType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserIndexMarkStartType(UserIndexMarkStartType userIndexMarkStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userIndexMarkStartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserIndexMarkType(UserIndexMarkType userIndexMarkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userIndexMarkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserIndexSourceType(UserIndexSourceType userIndexSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userIndexSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserIndexType(UserIndexType userIndexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userIndexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableDeclsType(VariableDeclsType variableDeclsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableDeclsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableDeclType(VariableDeclType variableDeclType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableDeclType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableGetType(VariableGetType variableGetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableGetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableInputType(VariableInputType variableInputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableInputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableSetType(VariableSetType variableSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWordCountType(WordCountType wordCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wordCountType, diagnostics, context);
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
	public boolean validateAnchorTypeType(AnchorTypeType anchorTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBibliographyDataFieldType(BibliographyDataFieldType bibliographyDataFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptionSequenceFormatType(CaptionSequenceFormatType captionSequenceFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomShapeTypeMember1(CustomShapeTypeMember1 customShapeTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayType(DisplayType displayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayType1(DisplayType1 displayType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayType2(DisplayType2 displayType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayType3(DisplayType3 displayType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayType4(DisplayType4 displayType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayType5(DisplayType5 displayType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayType6(DisplayType6 displayType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayType7(DisplayType7 displayType7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontFamilyGeneric(FontFamilyGeneric fontFamilyGeneric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontPitch(FontPitch fontPitch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontStyle(FontStyle fontStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontVariant(FontVariant fontVariant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontWeight(FontWeight fontWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFootnotesPositionType(FootnotesPositionType footnotesPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGradientStyle(GradientStyle gradientStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoriBackPos(HoriBackPos horiBackPos, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalMirror(HorizontalMirror horizontalMirror, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexScopeType(IndexScopeType indexScopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexScopeType1(IndexScopeType1 indexScopeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyType(KeyType keyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKindType(KindType kindType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineMode(LineMode lineMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineStyle(LineStyle lineStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineType(LineType lineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember3(LineWidthMember3 lineWidthMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember4(LineWidthMember4 lineWidthMember4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember5(LineWidthMember5 lineWidthMember5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember6(LineWidthMember6 lineWidthMember6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember7(LineWidthMember7 lineWidthMember7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember8(LineWidthMember8 lineWidthMember8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember9(LineWidthMember9 lineWidthMember9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigation(Navigation navigation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteClassType(NoteClassType noteClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberPositionType(NumberPositionType numberPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutlineLevelType(OutlineLevelType outlineLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlaceholderTypeType(PlaceholderTypeType placeholderTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationClasses(PresentationClasses presentationClasses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationEffectDirections(PresentationEffectDirections presentationEffectDirections, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationEffects(PresentationEffects presentationEffects, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationSpeeds(PresentationSpeeds presentationSpeeds, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceFormatType(ReferenceFormatType referenceFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceFormatType1(ReferenceFormatType1 referenceFormatType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowOrCol(RowOrCol rowOrCol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectPageType(SelectPageType selectPageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectPageType1(SelectPageType1 selectPageType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShadowTypeMember1(ShadowTypeMember1 shadowTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartNumberingAtType(StartNumberingAtType startNumberingAtType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStates(States states, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabCycles(TabCycles tabCycles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableTypeType(TableTypeType tableTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableVisibilityValue(TableVisibilityValue tableVisibilityValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetFrameNameMember1(TargetFrameNameMember1 targetFrameNameMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetFrameNameMember2(TargetFrameNameMember2 targetFrameNameMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetFrameNameMember3(TargetFrameNameMember3 targetFrameNameMember3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetFrameNameMember4(TargetFrameNameMember4 targetFrameNameMember4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextBibliographyTypes(TextBibliographyTypes textBibliographyTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypes(Types types, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertBackPos(VertBackPos vertBackPos, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnchorTypeTypeObject(AnchorTypeType anchorTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyURI(String anyURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64Binary(byte[] base64Binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBibliographyDataFieldTypeObject(BibliographyDataFieldType bibliographyDataFieldTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanObject(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean booleanObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorderWidths(List<?> borderWidths, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBorderWidthsBase_ItemType(borderWidths, diagnostics, context);
		if (result || diagnostics != null) result &= validateBorderWidths_MinLength(borderWidths, diagnostics, context);
		if (result || diagnostics != null) result &= validateBorderWidths_MaxLength(borderWidths, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Border Widths</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorderWidths_MinLength(List<?> borderWidths, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = borderWidths.size();
		boolean result = length >= 3;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getBorderWidths(), borderWidths, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Border Widths</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorderWidths_MaxLength(List<?> borderWidths, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = borderWidths.size();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getBorderWidths(), borderWidths, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorderWidthsBase(List<?> borderWidthsBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBorderWidthsBase_ItemType(borderWidthsBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Border Widths Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorderWidthsBase_ItemType(List<?> borderWidthsBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = borderWidthsBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (TextPackage.eINSTANCE.getBorderWidthsBaseItem().isInstance(item)) {
				result &= validateBorderWidthsBaseItem((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(TextPackage.eINSTANCE.getBorderWidthsBaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorderWidthsBaseItem(String borderWidthsBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBorderWidthsBaseItem_MemberTypes(borderWidthsBaseItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Border Widths Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorderWidthsBaseItem_MemberTypes(String borderWidthsBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getPositiveLength().isInstance(borderWidthsBaseItem)) {
				if (validatePositiveLength(borderWidthsBaseItem, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getPositiveLength().isInstance(borderWidthsBaseItem)) {
				if (validatePositiveLength(borderWidthsBaseItem, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptionSequenceFormatTypeObject(CaptionSequenceFormatType captionSequenceFormatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellAddress(String cellAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCellAddress_Pattern(cellAddress, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCellAddress_Pattern
	 */
	public static final  PatternMatcher [][] CELL_ADDRESS__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				//XMLTypeUtil.createPatternMatcher("($?([^\\. \']+|\'([^\']|\'\')+\'))?\\.$?[A-Z]+$?[0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Cell Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellAddress_Pattern(String cellAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getCellAddress(), cellAddress, CELL_ADDRESS__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellRangeAddress(String cellRangeAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCellRangeAddress_Pattern(cellRangeAddress, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCellRangeAddress_Pattern
	 */
	public static final  PatternMatcher [][] CELL_RANGE_ADDRESS__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				//XMLTypeUtil.createPatternMatcher("($?([^\\. \']+|\'([^\']|\'\')+\'))?\\.$?[A-Z]+$?[0-9]+(:($?([^\\. \']+|\'([^\']|\'\')+\'))?\\.$?[A-Z]+$?[0-9]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Cell Range Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellRangeAddress_Pattern(String cellRangeAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getCellRangeAddress(), cellRangeAddress, CELL_RANGE_ADDRESS__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCellRangeAddressList(String cellRangeAddressList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCharacter_MinLength(character, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacter_MaxLength(character, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_MinLength(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = character.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getCharacter(), character, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_MaxLength(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = character.length();
		boolean result = length <= 1;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getCharacter(), character, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationBodyStyleNameType(String citationBodyStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCitationBodyStyleNameType_MemberTypes(citationBodyStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Citation Body Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationBodyStyleNameType_MemberTypes(String citationBodyStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(citationBodyStyleNameType)) {
				if (validateStyleNameRef(citationBodyStyleNameType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getCitationBodyStyleNameTypeMember1().isInstance(citationBodyStyleNameType)) {
				if (validateCitationBodyStyleNameTypeMember1(citationBodyStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(citationBodyStyleNameType)) {
				if (validateStyleNameRef(citationBodyStyleNameType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getCitationBodyStyleNameTypeMember1().isInstance(citationBodyStyleNameType)) {
				if (validateCitationBodyStyleNameTypeMember1(citationBodyStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationBodyStyleNameTypeMember1(String citationBodyStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCitationBodyStyleNameTypeMember1_MinLength(citationBodyStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateCitationBodyStyleNameTypeMember1_MaxLength(citationBodyStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Citation Body Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationBodyStyleNameTypeMember1_MinLength(String citationBodyStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = citationBodyStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getCitationBodyStyleNameTypeMember1(), citationBodyStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Citation Body Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationBodyStyleNameTypeMember1_MaxLength(String citationBodyStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = citationBodyStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getCitationBodyStyleNameTypeMember1(), citationBodyStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationStyleNameType(String citationStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCitationStyleNameType_MemberTypes(citationStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Citation Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationStyleNameType_MemberTypes(String citationStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(citationStyleNameType)) {
				if (validateStyleNameRef(citationStyleNameType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getCitationStyleNameTypeMember1().isInstance(citationStyleNameType)) {
				if (validateCitationStyleNameTypeMember1(citationStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(citationStyleNameType)) {
				if (validateStyleNameRef(citationStyleNameType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getCitationStyleNameTypeMember1().isInstance(citationStyleNameType)) {
				if (validateCitationStyleNameTypeMember1(citationStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationStyleNameTypeMember1(String citationStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCitationStyleNameTypeMember1_MinLength(citationStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateCitationStyleNameTypeMember1_MaxLength(citationStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Citation Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationStyleNameTypeMember1_MinLength(String citationStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = citationStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getCitationStyleNameTypeMember1(), citationStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Citation Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitationStyleNameTypeMember1_MaxLength(String citationStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = citationStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getCitationStyleNameTypeMember1(), citationStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(String color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColor_Pattern(color, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateColor_Pattern
	 */
	public static final  PatternMatcher [][] COLOR__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("#[0-9a-fA-F]{6}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_Pattern(String color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getColor(), color, COLOR__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondStyleNameType(String condStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCondStyleNameType_MemberTypes(condStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Cond Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondStyleNameType_MemberTypes(String condStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(condStyleNameType)) {
				if (validateStyleNameRef(condStyleNameType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getCondStyleNameTypeMember1().isInstance(condStyleNameType)) {
				if (validateCondStyleNameTypeMember1(condStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(condStyleNameType)) {
				if (validateStyleNameRef(condStyleNameType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getCondStyleNameTypeMember1().isInstance(condStyleNameType)) {
				if (validateCondStyleNameTypeMember1(condStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondStyleNameTypeMember1(String condStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCondStyleNameTypeMember1_MinLength(condStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondStyleNameTypeMember1_MaxLength(condStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Cond Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondStyleNameTypeMember1_MinLength(String condStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = condStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getCondStyleNameTypeMember1(), condStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Cond Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondStyleNameTypeMember1_MaxLength(String condStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = condStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getCondStyleNameTypeMember1(), condStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinate(String coordinate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLength_Pattern(coordinate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountryCode(String countryCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCountryCode_Pattern(countryCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCountryCode_Pattern
	 */
	public static final  PatternMatcher [][] COUNTRY_CODE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z0-9]{1,8}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Country Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountryCode_Pattern(String countryCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getCountryCode(), countryCode, COUNTRY_CODE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomShapeType(Object customShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCustomShapeType_MemberTypes(customShapeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Custom Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomShapeType_MemberTypes(Object customShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getString().isInstance(customShapeType)) {
				if (validateString((String)customShapeType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getCustomShapeTypeMember1().isInstance(customShapeType)) {
				if (validateCustomShapeTypeMember1((CustomShapeTypeMember1)customShapeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getString().isInstance(customShapeType)) {
				if (validateString((String)customShapeType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getCustomShapeTypeMember1().isInstance(customShapeType)) {
				if (validateCustomShapeTypeMember1((CustomShapeTypeMember1)customShapeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomShapeTypeMember1Object(CustomShapeTypeMember1 customShapeTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(XMLGregorianCalendar date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOrDateTime(XMLGregorianCalendar dateOrDateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateOrDateTime_MemberTypes(dateOrDateTime, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Or Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOrDateTime_MemberTypes(XMLGregorianCalendar dateOrDateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DATE.isInstance(dateOrDateTime)) {
				if (xmlTypeValidator.validateDate(dateOrDateTime, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateOrDateTime)) {
				if (xmlTypeValidator.validateDateTime(dateOrDateTime, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DATE.isInstance(dateOrDateTime)) {
				if (xmlTypeValidator.validateDate(dateOrDateTime, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateOrDateTime)) {
				if (xmlTypeValidator.validateDateTime(dateOrDateTime, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime(XMLGregorianCalendar dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultStyleNameType(String defaultStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDefaultStyleNameType_MemberTypes(defaultStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Default Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultStyleNameType_MemberTypes(String defaultStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(defaultStyleNameType)) {
				if (validateStyleNameRef(defaultStyleNameType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getDefaultStyleNameTypeMember1().isInstance(defaultStyleNameType)) {
				if (validateDefaultStyleNameTypeMember1(defaultStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(defaultStyleNameType)) {
				if (validateStyleNameRef(defaultStyleNameType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getDefaultStyleNameTypeMember1().isInstance(defaultStyleNameType)) {
				if (validateDefaultStyleNameTypeMember1(defaultStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultStyleNameTypeMember1(String defaultStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDefaultStyleNameTypeMember1_MinLength(defaultStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateDefaultStyleNameTypeMember1_MaxLength(defaultStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Default Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultStyleNameTypeMember1_MinLength(String defaultStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = defaultStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getDefaultStyleNameTypeMember1(), defaultStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Default Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultStyleNameTypeMember1_MaxLength(String defaultStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = defaultStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getDefaultStyleNameTypeMember1(), defaultStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayTypeObject(DisplayType2 displayTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayTypeObject1(DisplayType3 displayTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayTypeObject2(DisplayType5 displayTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayTypeObject3(DisplayType1 displayTypeObject3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayTypeObject4(DisplayType displayTypeObject4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayTypeObject5(DisplayType6 displayTypeObject5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayTypeObject6(DisplayType4 displayTypeObject6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayTypeObject7(DisplayType7 displayTypeObject7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistance(String distance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLength_Pattern(distance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDouble(double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleObject(Double doubleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration(Duration duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontFamilyGenericObject(FontFamilyGeneric fontFamilyGenericObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontPitchObject(FontPitch fontPitchObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontStyleObject(FontStyle fontStyleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontVariantObject(FontVariant fontVariantObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontWeightObject(FontWeight fontWeightObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFootnotesPositionTypeObject(FootnotesPositionType footnotesPositionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormula(String formula, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGradientStyleObject(GradientStyle gradientStyleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHoriBackPosObject(HoriBackPos horiBackPosObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalMirrorObject(HorizontalMirror horizontalMirrorObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateID(String id, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNCName_Pattern(id, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDREF(String idref, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNCName_Pattern(idref, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDREFS(List<?> idrefs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateIDREFS_MinLength(idrefs, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateIDREFSBase_ItemType(idrefs, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexScopeTypeObject(IndexScopeType indexScopeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexScopeTypeObject1(IndexScopeType1 indexScopeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(BigInteger integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyTypeObject(KeyType keyTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKindTypeObject(KindType kindTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguage(String language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateLanguage_Pattern(language, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCode(String languageCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLanguageCode_Pattern(languageCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLanguageCode_Pattern
	 */
	public static final  PatternMatcher [][] LANGUAGE_CODE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z]{1,8}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Language Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCode_Pattern(String languageCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getLanguageCode(), languageCode, LANGUAGE_CODE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength(String length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLength_Pattern(length, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLength_Pattern
	 */
	public static final  PatternMatcher [][] LENGTH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)((cm)|(mm)|(in)|(pt)|(pc)|(px))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength_Pattern(String length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getLength(), length, LENGTH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineModeObject(LineMode lineModeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineStyleObject(LineStyle lineStyleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineTypeObject(LineType lineTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidth(Object lineWidth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLineWidth_MemberTypes(lineWidth, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Line Width</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidth_MemberTypes(Object lineWidth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getPositiveInteger().isInstance(lineWidth)) {
				if (validatePositiveInteger((BigInteger)lineWidth, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(lineWidth)) {
				if (validatePercent((String)lineWidth, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPositiveLength().isInstance(lineWidth)) {
				if (validatePositiveLength((String)lineWidth, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember3().isInstance(lineWidth)) {
				if (validateLineWidthMember3((LineWidthMember3)lineWidth, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember4().isInstance(lineWidth)) {
				if (validateLineWidthMember4((LineWidthMember4)lineWidth, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember5().isInstance(lineWidth)) {
				if (validateLineWidthMember5((LineWidthMember5)lineWidth, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember6().isInstance(lineWidth)) {
				if (validateLineWidthMember6((LineWidthMember6)lineWidth, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember7().isInstance(lineWidth)) {
				if (validateLineWidthMember7((LineWidthMember7)lineWidth, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember8().isInstance(lineWidth)) {
				if (validateLineWidthMember8((LineWidthMember8)lineWidth, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember9().isInstance(lineWidth)) {
				if (validateLineWidthMember9((LineWidthMember9)lineWidth, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getPositiveInteger().isInstance(lineWidth)) {
				if (validatePositiveInteger((BigInteger)lineWidth, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(lineWidth)) {
				if (validatePercent((String)lineWidth, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPositiveLength().isInstance(lineWidth)) {
				if (validatePositiveLength((String)lineWidth, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember3().isInstance(lineWidth)) {
				if (validateLineWidthMember3((LineWidthMember3)lineWidth, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember4().isInstance(lineWidth)) {
				if (validateLineWidthMember4((LineWidthMember4)lineWidth, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember5().isInstance(lineWidth)) {
				if (validateLineWidthMember5((LineWidthMember5)lineWidth, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember6().isInstance(lineWidth)) {
				if (validateLineWidthMember6((LineWidthMember6)lineWidth, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember7().isInstance(lineWidth)) {
				if (validateLineWidthMember7((LineWidthMember7)lineWidth, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember8().isInstance(lineWidth)) {
				if (validateLineWidthMember8((LineWidthMember8)lineWidth, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getLineWidthMember9().isInstance(lineWidth)) {
				if (validateLineWidthMember9((LineWidthMember9)lineWidth, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember3Object(LineWidthMember3 lineWidthMember3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember4Object(LineWidthMember4 lineWidthMember4Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember5Object(LineWidthMember5 lineWidthMember5Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember6Object(LineWidthMember6 lineWidthMember6Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember7Object(LineWidthMember7 lineWidthMember7Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember8Object(LineWidthMember8 lineWidthMember8Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineWidthMember9Object(LineWidthMember9 lineWidthMember9Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainEntryStyleNameType(String mainEntryStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMainEntryStyleNameType_MemberTypes(mainEntryStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Main Entry Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainEntryStyleNameType_MemberTypes(String mainEntryStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(mainEntryStyleNameType)) {
				if (validateStyleNameRef(mainEntryStyleNameType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getMainEntryStyleNameTypeMember1().isInstance(mainEntryStyleNameType)) {
				if (validateMainEntryStyleNameTypeMember1(mainEntryStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(mainEntryStyleNameType)) {
				if (validateStyleNameRef(mainEntryStyleNameType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getMainEntryStyleNameTypeMember1().isInstance(mainEntryStyleNameType)) {
				if (validateMainEntryStyleNameTypeMember1(mainEntryStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainEntryStyleNameTypeMember1(String mainEntryStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMainEntryStyleNameTypeMember1_MinLength(mainEntryStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateMainEntryStyleNameTypeMember1_MaxLength(mainEntryStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Main Entry Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainEntryStyleNameTypeMember1_MinLength(String mainEntryStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = mainEntryStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getMainEntryStyleNameTypeMember1(), mainEntryStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Main Entry Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainEntryStyleNameTypeMember1_MaxLength(String mainEntryStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = mainEntryStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getMainEntryStyleNameTypeMember1(), mainEntryStyleNameTypeMember1, length, 0, diagnostics, context);
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
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(masterPageNameType)) {
				if (validateStyleNameRef(masterPageNameType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getMasterPageNameTypeMember1().isInstance(masterPageNameType)) {
				if (validateMasterPageNameTypeMember1(masterPageNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(masterPageNameType)) {
				if (validateStyleNameRef(masterPageNameType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getMasterPageNameTypeMember1().isInstance(masterPageNameType)) {
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
	public boolean validateMasterPageNameType1(String masterPageNameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMasterPageNameType1_MemberTypes(masterPageNameType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Master Page Name Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterPageNameType1_MemberTypes(String masterPageNameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(masterPageNameType1)) {
				if (validateStyleNameRef(masterPageNameType1, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getMasterPageNameTypeMember11().isInstance(masterPageNameType1)) {
				if (validateMasterPageNameTypeMember11(masterPageNameType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(masterPageNameType1)) {
				if (validateStyleNameRef(masterPageNameType1, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getMasterPageNameTypeMember11().isInstance(masterPageNameType1)) {
				if (validateMasterPageNameTypeMember11(masterPageNameType1, null, context)) return true;
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
			reportMinLengthViolation(TextPackage.eINSTANCE.getMasterPageNameTypeMember1(), masterPageNameTypeMember1, length, 0, diagnostics, context);
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
			reportMaxLengthViolation(TextPackage.eINSTANCE.getMasterPageNameTypeMember1(), masterPageNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterPageNameTypeMember11(String masterPageNameTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMasterPageNameTypeMember11_MinLength(masterPageNameTypeMember11, diagnostics, context);
		if (result || diagnostics != null) result &= validateMasterPageNameTypeMember11_MaxLength(masterPageNameTypeMember11, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Master Page Name Type Member11</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterPageNameTypeMember11_MinLength(String masterPageNameTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = masterPageNameTypeMember11.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getMasterPageNameTypeMember11(), masterPageNameTypeMember11, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Master Page Name Type Member11</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterPageNameTypeMember11_MaxLength(String masterPageNameTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = masterPageNameTypeMember11.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getMasterPageNameTypeMember11(), masterPageNameTypeMember11, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespacedToken(String namespacedToken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNamespacedToken_Pattern(namespacedToken, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNamespacedToken_Pattern
	 */
	public static final  PatternMatcher [][] NAMESPACED_TOKEN__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9a-zA-Z_]+:[0-9a-zA-Z._\\-]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Namespaced Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespacedToken_Pattern(String namespacedToken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getNamespacedToken(), namespacedToken, NAMESPACED_TOKEN__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigationObject(Navigation navigationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeInteger(BigInteger nonNegativeInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(nonNegativeInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeLength(String nonNegativeLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeLength_Pattern(nonNegativeLength, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeLength_Pattern
	 */
	public static final  PatternMatcher [][] NON_NEGATIVE_LENGTH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]+(\\.[0-9]*)?|\\.[0-9]+)((cm)|(mm)|(in)|(pt)|(pc)|(px))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Non Negative Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeLength_Pattern(String nonNegativeLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getNonNegativeLength(), nonNegativeLength, NON_NEGATIVE_LENGTH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativePixelLength(String nonNegativePixelLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativePixelLength_Pattern(nonNegativePixelLength, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativePixelLength_Pattern
	 */
	public static final  PatternMatcher [][] NON_NEGATIVE_PIXEL_LENGTH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]+(\\.[0-9]*)?|\\.[0-9]+)(px)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Non Negative Pixel Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativePixelLength_Pattern(String nonNegativePixelLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getNonNegativePixelLength(), nonNegativePixelLength, NON_NEGATIVE_PIXEL_LENGTH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteClassTypeObject(NoteClassType noteClassTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberPositionTypeObject(NumberPositionType numberPositionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutlineLevelTypeObject(OutlineLevelType outlineLevelTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParagraphStyleNameType(String paragraphStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateParagraphStyleNameType_MemberTypes(paragraphStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Paragraph Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParagraphStyleNameType_MemberTypes(String paragraphStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(paragraphStyleNameType)) {
				if (validateStyleNameRef(paragraphStyleNameType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getParagraphStyleNameTypeMember1().isInstance(paragraphStyleNameType)) {
				if (validateParagraphStyleNameTypeMember1(paragraphStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(paragraphStyleNameType)) {
				if (validateStyleNameRef(paragraphStyleNameType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getParagraphStyleNameTypeMember1().isInstance(paragraphStyleNameType)) {
				if (validateParagraphStyleNameTypeMember1(paragraphStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParagraphStyleNameTypeMember1(String paragraphStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateParagraphStyleNameTypeMember1_MinLength(paragraphStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateParagraphStyleNameTypeMember1_MaxLength(paragraphStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Paragraph Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParagraphStyleNameTypeMember1_MinLength(String paragraphStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = paragraphStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getParagraphStyleNameTypeMember1(), paragraphStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Paragraph Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParagraphStyleNameTypeMember1_MaxLength(String paragraphStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = paragraphStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getParagraphStyleNameTypeMember1(), paragraphStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathData(String pathData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercent(String percent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePercent_Pattern(percent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercent_Pattern
	 */
	public static final  PatternMatcher [][] PERCENT__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)%")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Percent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercent_Pattern(String percent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getPercent(), percent, PERCENT__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlaceholderTypeTypeObject(PlaceholderTypeType placeholderTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoint3D(String point3D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoints(String points, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePoints_Pattern(points, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePoints_Pattern
	 */
	public static final  PatternMatcher [][] POINTS__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("-?[0-9]+,-?[0-9]+([ ]+-?[0-9]+,-?[0-9]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Points</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoints_Pattern(String points, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getPoints(), points, POINTS__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInteger(BigInteger positiveInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(positiveInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveLength(String positiveLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveLength_Pattern(positiveLength, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveLength_Pattern
	 */
	public static final  PatternMatcher [][] POSITIVE_LENGTH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([0-9]*[1-9][0-9]*(\\.[0-9]*)?|0+\\.[0-9]*[1-9][0-9]*|\\.[0-9]*[1-9][0-9]*)((cm)|(mm)|(in)|(pt)|(pc)|(px))")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Positive Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveLength_Pattern(String positiveLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getPositiveLength(), positiveLength, POSITIVE_LENGTH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationClassesObject(PresentationClasses presentationClassesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationEffectDirectionsObject(PresentationEffectDirections presentationEffectDirectionsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationEffectsObject(PresentationEffects presentationEffectsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationSpeedsObject(PresentationSpeeds presentationSpeedsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceFormatTypeObject(ReferenceFormatType referenceFormatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceFormatTypeObject1(ReferenceFormatType1 referenceFormatTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeLength(String relativeLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRelativeLength_Pattern(relativeLength, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRelativeLength_Pattern
	 */
	public static final  PatternMatcher [][] RELATIVE_LENGTH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]+\\*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Relative Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeLength_Pattern(String relativeLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getRelativeLength(), relativeLength, RELATIVE_LENGTH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowOrColObject(RowOrCol rowOrColObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectPageTypeObject(SelectPageType selectPageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectPageTypeObject1(SelectPageType1 selectPageTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShadowType(Object shadowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateShadowType_MemberTypes(shadowType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Shadow Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShadowType_MemberTypes(Object shadowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getString().isInstance(shadowType)) {
				if (validateString((String)shadowType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getShadowTypeMember1().isInstance(shadowType)) {
				if (validateShadowTypeMember1((ShadowTypeMember1)shadowType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getString().isInstance(shadowType)) {
				if (validateString((String)shadowType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getShadowTypeMember1().isInstance(shadowType)) {
				if (validateShadowTypeMember1((ShadowTypeMember1)shadowType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShadowTypeMember1Object(ShadowTypeMember1 shadowTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartNumberingAtTypeObject(StartNumberingAtType startNumberingAtTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatesObject(States statesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleName(String styleName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNCName_Pattern(styleName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameRef(String styleNameRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNCName_Pattern(styleNameRef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameRefs(List<?> styleNameRefs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameRefs_ItemType(styleNameRefs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Style Name Refs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameRefs_ItemType(List<?> styleNameRefs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = styleNameRefs.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.NC_NAME.isInstance(item)) {
				result &= xmlTypeValidator.validateNCName((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.NC_NAME, item, diagnostics, context);
			}
		}
		return result;
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
	 * Validates the MemberTypes constraint of '<em>Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType_MemberTypes(String styleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType)) {
				if (validateStyleNameRef(styleNameType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember12().isInstance(styleNameType)) {
				if (validateStyleNameTypeMember12(styleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType)) {
				if (validateStyleNameRef(styleNameType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember12().isInstance(styleNameType)) {
				if (validateStyleNameTypeMember12(styleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType1(String styleNameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType1_MemberTypes(styleNameType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType1_MemberTypes(String styleNameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType1)) {
				if (validateStyleNameRef(styleNameType1, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember14().isInstance(styleNameType1)) {
				if (validateStyleNameTypeMember14(styleNameType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType1)) {
				if (validateStyleNameRef(styleNameType1, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember14().isInstance(styleNameType1)) {
				if (validateStyleNameTypeMember14(styleNameType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType2(String styleNameType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType2_MemberTypes(styleNameType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType2_MemberTypes(String styleNameType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType2)) {
				if (validateStyleNameRef(styleNameType2, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember13().isInstance(styleNameType2)) {
				if (validateStyleNameTypeMember13(styleNameType2, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType2)) {
				if (validateStyleNameRef(styleNameType2, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember13().isInstance(styleNameType2)) {
				if (validateStyleNameTypeMember13(styleNameType2, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType3(String styleNameType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType3_MemberTypes(styleNameType3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType3_MemberTypes(String styleNameType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType3)) {
				if (validateStyleNameRef(styleNameType3, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember18().isInstance(styleNameType3)) {
				if (validateStyleNameTypeMember18(styleNameType3, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType3)) {
				if (validateStyleNameRef(styleNameType3, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember18().isInstance(styleNameType3)) {
				if (validateStyleNameTypeMember18(styleNameType3, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType4(String styleNameType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType4_MemberTypes(styleNameType4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType4_MemberTypes(String styleNameType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType4)) {
				if (validateStyleNameRef(styleNameType4, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember19().isInstance(styleNameType4)) {
				if (validateStyleNameTypeMember19(styleNameType4, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType4)) {
				if (validateStyleNameRef(styleNameType4, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember19().isInstance(styleNameType4)) {
				if (validateStyleNameTypeMember19(styleNameType4, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType5(String styleNameType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType5_MemberTypes(styleNameType5, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType5_MemberTypes(String styleNameType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType5)) {
				if (validateStyleNameRef(styleNameType5, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember16().isInstance(styleNameType5)) {
				if (validateStyleNameTypeMember16(styleNameType5, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType5)) {
				if (validateStyleNameRef(styleNameType5, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember16().isInstance(styleNameType5)) {
				if (validateStyleNameTypeMember16(styleNameType5, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType6(String styleNameType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType6_MemberTypes(styleNameType6, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType6_MemberTypes(String styleNameType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType6)) {
				if (validateStyleNameRef(styleNameType6, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember17().isInstance(styleNameType6)) {
				if (validateStyleNameTypeMember17(styleNameType6, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType6)) {
				if (validateStyleNameRef(styleNameType6, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember17().isInstance(styleNameType6)) {
				if (validateStyleNameTypeMember17(styleNameType6, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType7(String styleNameType7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType7_MemberTypes(styleNameType7, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type7</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType7_MemberTypes(String styleNameType7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType7)) {
				if (validateStyleNameRef(styleNameType7, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember115().isInstance(styleNameType7)) {
				if (validateStyleNameTypeMember115(styleNameType7, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType7)) {
				if (validateStyleNameRef(styleNameType7, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember115().isInstance(styleNameType7)) {
				if (validateStyleNameTypeMember115(styleNameType7, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType8(String styleNameType8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType8_MemberTypes(styleNameType8, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type8</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType8_MemberTypes(String styleNameType8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType8)) {
				if (validateStyleNameRef(styleNameType8, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember111().isInstance(styleNameType8)) {
				if (validateStyleNameTypeMember111(styleNameType8, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType8)) {
				if (validateStyleNameRef(styleNameType8, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember111().isInstance(styleNameType8)) {
				if (validateStyleNameTypeMember111(styleNameType8, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType9(String styleNameType9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType9_MemberTypes(styleNameType9, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type9</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType9_MemberTypes(String styleNameType9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType9)) {
				if (validateStyleNameRef(styleNameType9, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember15().isInstance(styleNameType9)) {
				if (validateStyleNameTypeMember15(styleNameType9, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType9)) {
				if (validateStyleNameRef(styleNameType9, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember15().isInstance(styleNameType9)) {
				if (validateStyleNameTypeMember15(styleNameType9, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType10(String styleNameType10, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType10_MemberTypes(styleNameType10, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type10</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType10_MemberTypes(String styleNameType10, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType10)) {
				if (validateStyleNameRef(styleNameType10, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember119().isInstance(styleNameType10)) {
				if (validateStyleNameTypeMember119(styleNameType10, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType10)) {
				if (validateStyleNameRef(styleNameType10, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember119().isInstance(styleNameType10)) {
				if (validateStyleNameTypeMember119(styleNameType10, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType11(String styleNameType11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType11_MemberTypes(styleNameType11, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type11</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType11_MemberTypes(String styleNameType11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType11)) {
				if (validateStyleNameRef(styleNameType11, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember117().isInstance(styleNameType11)) {
				if (validateStyleNameTypeMember117(styleNameType11, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType11)) {
				if (validateStyleNameRef(styleNameType11, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember117().isInstance(styleNameType11)) {
				if (validateStyleNameTypeMember117(styleNameType11, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType12(String styleNameType12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType12_MemberTypes(styleNameType12, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type12</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType12_MemberTypes(String styleNameType12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType12)) {
				if (validateStyleNameRef(styleNameType12, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember113().isInstance(styleNameType12)) {
				if (validateStyleNameTypeMember113(styleNameType12, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType12)) {
				if (validateStyleNameRef(styleNameType12, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember113().isInstance(styleNameType12)) {
				if (validateStyleNameTypeMember113(styleNameType12, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType13(String styleNameType13, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType13_MemberTypes(styleNameType13, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type13</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType13_MemberTypes(String styleNameType13, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType13)) {
				if (validateStyleNameRef(styleNameType13, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember118().isInstance(styleNameType13)) {
				if (validateStyleNameTypeMember118(styleNameType13, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType13)) {
				if (validateStyleNameRef(styleNameType13, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember118().isInstance(styleNameType13)) {
				if (validateStyleNameTypeMember118(styleNameType13, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType14(String styleNameType14, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType14_MemberTypes(styleNameType14, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type14</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType14_MemberTypes(String styleNameType14, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType14)) {
				if (validateStyleNameRef(styleNameType14, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember112().isInstance(styleNameType14)) {
				if (validateStyleNameTypeMember112(styleNameType14, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType14)) {
				if (validateStyleNameRef(styleNameType14, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember112().isInstance(styleNameType14)) {
				if (validateStyleNameTypeMember112(styleNameType14, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType15(String styleNameType15, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType15_MemberTypes(styleNameType15, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type15</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType15_MemberTypes(String styleNameType15, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType15)) {
				if (validateStyleNameRef(styleNameType15, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember121().isInstance(styleNameType15)) {
				if (validateStyleNameTypeMember121(styleNameType15, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType15)) {
				if (validateStyleNameRef(styleNameType15, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember121().isInstance(styleNameType15)) {
				if (validateStyleNameTypeMember121(styleNameType15, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType16(String styleNameType16, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType16_MemberTypes(styleNameType16, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type16</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType16_MemberTypes(String styleNameType16, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType16)) {
				if (validateStyleNameRef(styleNameType16, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember11().isInstance(styleNameType16)) {
				if (validateStyleNameTypeMember11(styleNameType16, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType16)) {
				if (validateStyleNameRef(styleNameType16, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember11().isInstance(styleNameType16)) {
				if (validateStyleNameTypeMember11(styleNameType16, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType17(String styleNameType17, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType17_MemberTypes(styleNameType17, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type17</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType17_MemberTypes(String styleNameType17, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType17)) {
				if (validateStyleNameRef(styleNameType17, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember114().isInstance(styleNameType17)) {
				if (validateStyleNameTypeMember114(styleNameType17, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType17)) {
				if (validateStyleNameRef(styleNameType17, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember114().isInstance(styleNameType17)) {
				if (validateStyleNameTypeMember114(styleNameType17, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType18(String styleNameType18, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType18_MemberTypes(styleNameType18, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type18</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType18_MemberTypes(String styleNameType18, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType18)) {
				if (validateStyleNameRef(styleNameType18, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember110().isInstance(styleNameType18)) {
				if (validateStyleNameTypeMember110(styleNameType18, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType18)) {
				if (validateStyleNameRef(styleNameType18, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember110().isInstance(styleNameType18)) {
				if (validateStyleNameTypeMember110(styleNameType18, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType19(String styleNameType19, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType19_MemberTypes(styleNameType19, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type19</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType19_MemberTypes(String styleNameType19, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType19)) {
				if (validateStyleNameRef(styleNameType19, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember1().isInstance(styleNameType19)) {
				if (validateStyleNameTypeMember1(styleNameType19, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType19)) {
				if (validateStyleNameRef(styleNameType19, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember1().isInstance(styleNameType19)) {
				if (validateStyleNameTypeMember1(styleNameType19, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType20(String styleNameType20, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType20_MemberTypes(styleNameType20, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type20</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType20_MemberTypes(String styleNameType20, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType20)) {
				if (validateStyleNameRef(styleNameType20, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember116().isInstance(styleNameType20)) {
				if (validateStyleNameTypeMember116(styleNameType20, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType20)) {
				if (validateStyleNameRef(styleNameType20, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember116().isInstance(styleNameType20)) {
				if (validateStyleNameTypeMember116(styleNameType20, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType21(String styleNameType21, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType21_MemberTypes(styleNameType21, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type21</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType21_MemberTypes(String styleNameType21, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType21)) {
				if (validateStyleNameRef(styleNameType21, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember124().isInstance(styleNameType21)) {
				if (validateStyleNameTypeMember124(styleNameType21, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType21)) {
				if (validateStyleNameRef(styleNameType21, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember124().isInstance(styleNameType21)) {
				if (validateStyleNameTypeMember124(styleNameType21, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType22(String styleNameType22, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType22_MemberTypes(styleNameType22, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type22</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType22_MemberTypes(String styleNameType22, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType22)) {
				if (validateStyleNameRef(styleNameType22, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember120().isInstance(styleNameType22)) {
				if (validateStyleNameTypeMember120(styleNameType22, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType22)) {
				if (validateStyleNameRef(styleNameType22, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember120().isInstance(styleNameType22)) {
				if (validateStyleNameTypeMember120(styleNameType22, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType23(String styleNameType23, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType23_MemberTypes(styleNameType23, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type23</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType23_MemberTypes(String styleNameType23, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType23)) {
				if (validateStyleNameRef(styleNameType23, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember122().isInstance(styleNameType23)) {
				if (validateStyleNameTypeMember122(styleNameType23, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType23)) {
				if (validateStyleNameRef(styleNameType23, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember122().isInstance(styleNameType23)) {
				if (validateStyleNameTypeMember122(styleNameType23, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType24(String styleNameType24, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType24_MemberTypes(styleNameType24, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type24</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType24_MemberTypes(String styleNameType24, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType24)) {
				if (validateStyleNameRef(styleNameType24, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember123().isInstance(styleNameType24)) {
				if (validateStyleNameTypeMember123(styleNameType24, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType24)) {
				if (validateStyleNameRef(styleNameType24, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember123().isInstance(styleNameType24)) {
				if (validateStyleNameTypeMember123(styleNameType24, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType25(String styleNameType25, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType25_MemberTypes(styleNameType25, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type25</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType25_MemberTypes(String styleNameType25, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType25)) {
				if (validateStyleNameRef(styleNameType25, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember125().isInstance(styleNameType25)) {
				if (validateStyleNameTypeMember125(styleNameType25, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType25)) {
				if (validateStyleNameRef(styleNameType25, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getStyleNameTypeMember125().isInstance(styleNameType25)) {
				if (validateStyleNameTypeMember125(styleNameType25, null, context)) return true;
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
	 * Validates the MinLength constraint of '<em>Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember1_MinLength(String styleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember1(), styleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember1_MaxLength(String styleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember1(), styleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember11(String styleNameTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember11_MinLength(styleNameTypeMember11, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember11_MaxLength(styleNameTypeMember11, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member11</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember11_MinLength(String styleNameTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember11.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember11(), styleNameTypeMember11, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member11</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember11_MaxLength(String styleNameTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember11.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember11(), styleNameTypeMember11, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember12(String styleNameTypeMember12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember12_MinLength(styleNameTypeMember12, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember12_MaxLength(styleNameTypeMember12, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member12</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember12_MinLength(String styleNameTypeMember12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember12.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember12(), styleNameTypeMember12, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member12</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember12_MaxLength(String styleNameTypeMember12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember12.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember12(), styleNameTypeMember12, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember13(String styleNameTypeMember13, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember13_MinLength(styleNameTypeMember13, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember13_MaxLength(styleNameTypeMember13, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member13</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember13_MinLength(String styleNameTypeMember13, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember13.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember13(), styleNameTypeMember13, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member13</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember13_MaxLength(String styleNameTypeMember13, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember13.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember13(), styleNameTypeMember13, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember14(String styleNameTypeMember14, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember14_MinLength(styleNameTypeMember14, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember14_MaxLength(styleNameTypeMember14, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member14</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember14_MinLength(String styleNameTypeMember14, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember14.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember14(), styleNameTypeMember14, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member14</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember14_MaxLength(String styleNameTypeMember14, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember14.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember14(), styleNameTypeMember14, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember15(String styleNameTypeMember15, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember15_MinLength(styleNameTypeMember15, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember15_MaxLength(styleNameTypeMember15, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member15</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember15_MinLength(String styleNameTypeMember15, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember15.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember15(), styleNameTypeMember15, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member15</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember15_MaxLength(String styleNameTypeMember15, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember15.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember15(), styleNameTypeMember15, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember16(String styleNameTypeMember16, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember16_MinLength(styleNameTypeMember16, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember16_MaxLength(styleNameTypeMember16, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member16</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember16_MinLength(String styleNameTypeMember16, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember16.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember16(), styleNameTypeMember16, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member16</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember16_MaxLength(String styleNameTypeMember16, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember16.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember16(), styleNameTypeMember16, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember17(String styleNameTypeMember17, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember17_MinLength(styleNameTypeMember17, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember17_MaxLength(styleNameTypeMember17, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member17</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember17_MinLength(String styleNameTypeMember17, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember17.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember17(), styleNameTypeMember17, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member17</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember17_MaxLength(String styleNameTypeMember17, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember17.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember17(), styleNameTypeMember17, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember18(String styleNameTypeMember18, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember18_MinLength(styleNameTypeMember18, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember18_MaxLength(styleNameTypeMember18, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member18</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember18_MinLength(String styleNameTypeMember18, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember18.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember18(), styleNameTypeMember18, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member18</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember18_MaxLength(String styleNameTypeMember18, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember18.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember18(), styleNameTypeMember18, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember19(String styleNameTypeMember19, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember19_MinLength(styleNameTypeMember19, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember19_MaxLength(styleNameTypeMember19, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member19</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember19_MinLength(String styleNameTypeMember19, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember19.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember19(), styleNameTypeMember19, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member19</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember19_MaxLength(String styleNameTypeMember19, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember19.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember19(), styleNameTypeMember19, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember110(String styleNameTypeMember110, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember110_MinLength(styleNameTypeMember110, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember110_MaxLength(styleNameTypeMember110, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member110</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember110_MinLength(String styleNameTypeMember110, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember110.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember110(), styleNameTypeMember110, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member110</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember110_MaxLength(String styleNameTypeMember110, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember110.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember110(), styleNameTypeMember110, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember111(String styleNameTypeMember111, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember111_MinLength(styleNameTypeMember111, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember111_MaxLength(styleNameTypeMember111, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member111</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember111_MinLength(String styleNameTypeMember111, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember111.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember111(), styleNameTypeMember111, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member111</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember111_MaxLength(String styleNameTypeMember111, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember111.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember111(), styleNameTypeMember111, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember112(String styleNameTypeMember112, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember112_MinLength(styleNameTypeMember112, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember112_MaxLength(styleNameTypeMember112, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member112</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember112_MinLength(String styleNameTypeMember112, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember112.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember112(), styleNameTypeMember112, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member112</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember112_MaxLength(String styleNameTypeMember112, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember112.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember112(), styleNameTypeMember112, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember113(String styleNameTypeMember113, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember113_MinLength(styleNameTypeMember113, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember113_MaxLength(styleNameTypeMember113, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member113</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember113_MinLength(String styleNameTypeMember113, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember113.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember113(), styleNameTypeMember113, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member113</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember113_MaxLength(String styleNameTypeMember113, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember113.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember113(), styleNameTypeMember113, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember114(String styleNameTypeMember114, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember114_MinLength(styleNameTypeMember114, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember114_MaxLength(styleNameTypeMember114, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member114</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember114_MinLength(String styleNameTypeMember114, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember114.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember114(), styleNameTypeMember114, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member114</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember114_MaxLength(String styleNameTypeMember114, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember114.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember114(), styleNameTypeMember114, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember115(String styleNameTypeMember115, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember115_MinLength(styleNameTypeMember115, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember115_MaxLength(styleNameTypeMember115, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member115</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember115_MinLength(String styleNameTypeMember115, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember115.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember115(), styleNameTypeMember115, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member115</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember115_MaxLength(String styleNameTypeMember115, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember115.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember115(), styleNameTypeMember115, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember116(String styleNameTypeMember116, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember116_MinLength(styleNameTypeMember116, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember116_MaxLength(styleNameTypeMember116, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member116</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember116_MinLength(String styleNameTypeMember116, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember116.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember116(), styleNameTypeMember116, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member116</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember116_MaxLength(String styleNameTypeMember116, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember116.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember116(), styleNameTypeMember116, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember117(String styleNameTypeMember117, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember117_MinLength(styleNameTypeMember117, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember117_MaxLength(styleNameTypeMember117, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member117</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember117_MinLength(String styleNameTypeMember117, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember117.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember117(), styleNameTypeMember117, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member117</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember117_MaxLength(String styleNameTypeMember117, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember117.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember117(), styleNameTypeMember117, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember118(String styleNameTypeMember118, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember118_MinLength(styleNameTypeMember118, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember118_MaxLength(styleNameTypeMember118, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member118</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember118_MinLength(String styleNameTypeMember118, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember118.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember118(), styleNameTypeMember118, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member118</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember118_MaxLength(String styleNameTypeMember118, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember118.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember118(), styleNameTypeMember118, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember119(String styleNameTypeMember119, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember119_MinLength(styleNameTypeMember119, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember119_MaxLength(styleNameTypeMember119, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member119</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember119_MinLength(String styleNameTypeMember119, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember119.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember119(), styleNameTypeMember119, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member119</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember119_MaxLength(String styleNameTypeMember119, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember119.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember119(), styleNameTypeMember119, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember120(String styleNameTypeMember120, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember120_MinLength(styleNameTypeMember120, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember120_MaxLength(styleNameTypeMember120, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member120</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember120_MinLength(String styleNameTypeMember120, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember120.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember120(), styleNameTypeMember120, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member120</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember120_MaxLength(String styleNameTypeMember120, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember120.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember120(), styleNameTypeMember120, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember121(String styleNameTypeMember121, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember121_MinLength(styleNameTypeMember121, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember121_MaxLength(styleNameTypeMember121, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member121</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember121_MinLength(String styleNameTypeMember121, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember121.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember121(), styleNameTypeMember121, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member121</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember121_MaxLength(String styleNameTypeMember121, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember121.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember121(), styleNameTypeMember121, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember122(String styleNameTypeMember122, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember122_MinLength(styleNameTypeMember122, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember122_MaxLength(styleNameTypeMember122, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member122</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember122_MinLength(String styleNameTypeMember122, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember122.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember122(), styleNameTypeMember122, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member122</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember122_MaxLength(String styleNameTypeMember122, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember122.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember122(), styleNameTypeMember122, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember123(String styleNameTypeMember123, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember123_MinLength(styleNameTypeMember123, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember123_MaxLength(styleNameTypeMember123, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member123</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember123_MinLength(String styleNameTypeMember123, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember123.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember123(), styleNameTypeMember123, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member123</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember123_MaxLength(String styleNameTypeMember123, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember123.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember123(), styleNameTypeMember123, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember124(String styleNameTypeMember124, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember124_MinLength(styleNameTypeMember124, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember124_MaxLength(styleNameTypeMember124, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member124</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember124_MinLength(String styleNameTypeMember124, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember124.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember124(), styleNameTypeMember124, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member124</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember124_MaxLength(String styleNameTypeMember124, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember124.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember124(), styleNameTypeMember124, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember125(String styleNameTypeMember125, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember125_MinLength(styleNameTypeMember125, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember125_MaxLength(styleNameTypeMember125, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member125</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember125_MinLength(String styleNameTypeMember125, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember125.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember125(), styleNameTypeMember125, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member125</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember125_MaxLength(String styleNameTypeMember125, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember125.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getStyleNameTypeMember125(), styleNameTypeMember125, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabCyclesObject(TabCycles tabCyclesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableTypeTypeObject(TableTypeType tableTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableVisibilityValueObject(TableVisibilityValue tableVisibilityValueObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetFrameName(Object targetFrameName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTargetFrameName_MemberTypes(targetFrameName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Target Frame Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetFrameName_MemberTypes(Object targetFrameName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getString().isInstance(targetFrameName)) {
				if (validateString((String)targetFrameName, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getTargetFrameNameMember1().isInstance(targetFrameName)) {
				if (validateTargetFrameNameMember1((TargetFrameNameMember1)targetFrameName, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getTargetFrameNameMember2().isInstance(targetFrameName)) {
				if (validateTargetFrameNameMember2((TargetFrameNameMember2)targetFrameName, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getTargetFrameNameMember3().isInstance(targetFrameName)) {
				if (validateTargetFrameNameMember3((TargetFrameNameMember3)targetFrameName, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getTargetFrameNameMember4().isInstance(targetFrameName)) {
				if (validateTargetFrameNameMember4((TargetFrameNameMember4)targetFrameName, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getString().isInstance(targetFrameName)) {
				if (validateString((String)targetFrameName, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getTargetFrameNameMember1().isInstance(targetFrameName)) {
				if (validateTargetFrameNameMember1((TargetFrameNameMember1)targetFrameName, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getTargetFrameNameMember2().isInstance(targetFrameName)) {
				if (validateTargetFrameNameMember2((TargetFrameNameMember2)targetFrameName, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getTargetFrameNameMember3().isInstance(targetFrameName)) {
				if (validateTargetFrameNameMember3((TargetFrameNameMember3)targetFrameName, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getTargetFrameNameMember4().isInstance(targetFrameName)) {
				if (validateTargetFrameNameMember4((TargetFrameNameMember4)targetFrameName, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetFrameNameMember1Object(TargetFrameNameMember1 targetFrameNameMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetFrameNameMember2Object(TargetFrameNameMember2 targetFrameNameMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetFrameNameMember3Object(TargetFrameNameMember3 targetFrameNameMember3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetFrameNameMember4Object(TargetFrameNameMember4 targetFrameNameMember4Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextBibliographyTypesObject(TextBibliographyTypes textBibliographyTypesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEncoding(String textEncoding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextEncoding_Pattern(textEncoding, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTextEncoding_Pattern
	 */
	public static final  PatternMatcher [][] TEXT_ENCODING__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z][A-Za-z0-9._\\-]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextEncoding_Pattern(String textEncoding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getTextEncoding(), textEncoding, TEXT_ENCODING__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(XMLGregorianCalendar time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeOrDateTime(XMLGregorianCalendar timeOrDateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeOrDateTime_MemberTypes(timeOrDateTime, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Time Or Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeOrDateTime_MemberTypes(XMLGregorianCalendar timeOrDateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.TIME.isInstance(timeOrDateTime)) {
				if (xmlTypeValidator.validateTime(timeOrDateTime, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(timeOrDateTime)) {
				if (xmlTypeValidator.validateDateTime(timeOrDateTime, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.TIME.isInstance(timeOrDateTime)) {
				if (xmlTypeValidator.validateTime(timeOrDateTime, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(timeOrDateTime)) {
				if (xmlTypeValidator.validateDateTime(timeOrDateTime, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypesObject(Types typesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueTypeObject(ValueType valueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableName(String variableName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVector3D(String vector3D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVector3D_Pattern(vector3D, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVector3D_Pattern
	 */
	public static final  PatternMatcher [][] VECTOR3_D__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\([ ]*-?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)([ ]+-?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)){2}[ ]*\\)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Vector3 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVector3D_Pattern(String vector3D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TextPackage.eINSTANCE.getVector3D(), vector3D, VECTOR3_D__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertBackPosObject(VertBackPos vertBackPosObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisitedStyleNameType(String visitedStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVisitedStyleNameType_MemberTypes(visitedStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Visited Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisitedStyleNameType_MemberTypes(String visitedStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(visitedStyleNameType)) {
				if (validateStyleNameRef(visitedStyleNameType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getVisitedStyleNameTypeMember1().isInstance(visitedStyleNameType)) {
				if (validateVisitedStyleNameTypeMember1(visitedStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(visitedStyleNameType)) {
				if (validateStyleNameRef(visitedStyleNameType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getVisitedStyleNameTypeMember1().isInstance(visitedStyleNameType)) {
				if (validateVisitedStyleNameTypeMember1(visitedStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisitedStyleNameTypeMember1(String visitedStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVisitedStyleNameTypeMember1_MinLength(visitedStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateVisitedStyleNameTypeMember1_MaxLength(visitedStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Visited Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisitedStyleNameTypeMember1_MinLength(String visitedStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = visitedStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TextPackage.eINSTANCE.getVisitedStyleNameTypeMember1(), visitedStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Visited Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisitedStyleNameTypeMember1_MaxLength(String visitedStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = visitedStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TextPackage.eINSTANCE.getVisitedStyleNameTypeMember1(), visitedStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
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

} //TextValidator
