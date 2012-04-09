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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage
 * @generated
 */
public class TextSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TextPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextSwitch() {
		if (modelPackage == null) {
			modelPackage = TextPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TextPackage.ALPHABETICAL_INDEX_AUTO_MARK_FILE_TYPE: {
				AlphabeticalIndexAutoMarkFileType alphabeticalIndexAutoMarkFileType = (AlphabeticalIndexAutoMarkFileType)theEObject;
				T result = caseAlphabeticalIndexAutoMarkFileType(alphabeticalIndexAutoMarkFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE: {
				AlphabeticalIndexEntryTemplateType alphabeticalIndexEntryTemplateType = (AlphabeticalIndexEntryTemplateType)theEObject;
				T result = caseAlphabeticalIndexEntryTemplateType(alphabeticalIndexEntryTemplateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.ALPHABETICAL_INDEX_MARK_END_TYPE: {
				AlphabeticalIndexMarkEndType alphabeticalIndexMarkEndType = (AlphabeticalIndexMarkEndType)theEObject;
				T result = caseAlphabeticalIndexMarkEndType(alphabeticalIndexMarkEndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE: {
				AlphabeticalIndexMarkStartType alphabeticalIndexMarkStartType = (AlphabeticalIndexMarkStartType)theEObject;
				T result = caseAlphabeticalIndexMarkStartType(alphabeticalIndexMarkStartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.ALPHABETICAL_INDEX_MARK_TYPE: {
				AlphabeticalIndexMarkType alphabeticalIndexMarkType = (AlphabeticalIndexMarkType)theEObject;
				T result = caseAlphabeticalIndexMarkType(alphabeticalIndexMarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.ALPHABETICAL_INDEX_SOURCE_TYPE: {
				AlphabeticalIndexSourceType alphabeticalIndexSourceType = (AlphabeticalIndexSourceType)theEObject;
				T result = caseAlphabeticalIndexSourceType(alphabeticalIndexSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.ALPHABETICAL_INDEX_TYPE: {
				AlphabeticalIndexType alphabeticalIndexType = (AlphabeticalIndexType)theEObject;
				T result = caseAlphabeticalIndexType(alphabeticalIndexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.ANY_ATT_LIST_OR_ELEMENTS: {
				AnyAttListOrElements anyAttListOrElements = (AnyAttListOrElements)theEObject;
				T result = caseAnyAttListOrElements(anyAttListOrElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.ATYPE: {
				AType aType = (AType)theEObject;
				T result = caseAType(aType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.AUTHOR_INITIALS_TYPE: {
				AuthorInitialsType authorInitialsType = (AuthorInitialsType)theEObject;
				T result = caseAuthorInitialsType(authorInitialsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.AUTHOR_NAME_TYPE: {
				AuthorNameType authorNameType = (AuthorNameType)theEObject;
				T result = caseAuthorNameType(authorNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.BIBLIOGRAPHY_CONFIGURATION_TYPE: {
				BibliographyConfigurationType bibliographyConfigurationType = (BibliographyConfigurationType)theEObject;
				T result = caseBibliographyConfigurationType(bibliographyConfigurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE: {
				BibliographyEntryTemplateType bibliographyEntryTemplateType = (BibliographyEntryTemplateType)theEObject;
				T result = caseBibliographyEntryTemplateType(bibliographyEntryTemplateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.BIBLIOGRAPHY_MARK_TYPE: {
				BibliographyMarkType bibliographyMarkType = (BibliographyMarkType)theEObject;
				T result = caseBibliographyMarkType(bibliographyMarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.BIBLIOGRAPHY_SOURCE_TYPE: {
				BibliographySourceType bibliographySourceType = (BibliographySourceType)theEObject;
				T result = caseBibliographySourceType(bibliographySourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.BIBLIOGRAPHY_TYPE: {
				BibliographyType bibliographyType = (BibliographyType)theEObject;
				T result = caseBibliographyType(bibliographyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.BOOKMARK_END_TYPE: {
				BookmarkEndType bookmarkEndType = (BookmarkEndType)theEObject;
				T result = caseBookmarkEndType(bookmarkEndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.BOOKMARK_REF_TYPE: {
				BookmarkRefType bookmarkRefType = (BookmarkRefType)theEObject;
				T result = caseBookmarkRefType(bookmarkRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.BOOKMARK_START_TYPE: {
				BookmarkStartType bookmarkStartType = (BookmarkStartType)theEObject;
				T result = caseBookmarkStartType(bookmarkStartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.BOOKMARK_TYPE: {
				BookmarkType bookmarkType = (BookmarkType)theEObject;
				T result = caseBookmarkType(bookmarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.CHANGED_REGION_TYPE: {
				ChangedRegionType changedRegionType = (ChangedRegionType)theEObject;
				T result = caseChangedRegionType(changedRegionType);
				if (result == null) result = caseTextChangedRegionContent(changedRegionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.CHANGE_MARKS_TYPE: {
				ChangeMarksType changeMarksType = (ChangeMarksType)theEObject;
				T result = caseChangeMarksType(changeMarksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.CHAPTER_TYPE: {
				ChapterType chapterType = (ChapterType)theEObject;
				T result = caseChapterType(chapterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.CHARACTER_COUNT_TYPE: {
				CharacterCountType characterCountType = (CharacterCountType)theEObject;
				T result = caseCharacterCountType(characterCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.COMMON_FORM_CONTROL_CONTENT: {
				CommonFormControlContent commonFormControlContent = (CommonFormControlContent)theEObject;
				T result = caseCommonFormControlContent(commonFormControlContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.CONDITIONAL_TEXT_TYPE: {
				ConditionalTextType conditionalTextType = (ConditionalTextType)theEObject;
				T result = caseConditionalTextType(conditionalTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.CONFIG_ITEMS: {
				ConfigItems configItems = (ConfigItems)theEObject;
				T result = caseConfigItems(configItems);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.CREATION_DATE_TYPE: {
				CreationDateType creationDateType = (CreationDateType)theEObject;
				T result = caseCreationDateType(creationDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.CREATION_TIME_TYPE: {
				CreationTimeType creationTimeType = (CreationTimeType)theEObject;
				T result = caseCreationTimeType(creationTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.CREATOR_TYPE: {
				CreatorType creatorType = (CreatorType)theEObject;
				T result = caseCreatorType(creatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.DATABASE_NAME_TYPE: {
				DatabaseNameType databaseNameType = (DatabaseNameType)theEObject;
				T result = caseDatabaseNameType(databaseNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.DATABASE_ROW_NUMBER_TYPE: {
				DatabaseRowNumberType databaseRowNumberType = (DatabaseRowNumberType)theEObject;
				T result = caseDatabaseRowNumberType(databaseRowNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.DDE_CONNECTION_DECLS_TYPE: {
				DdeConnectionDeclsType ddeConnectionDeclsType = (DdeConnectionDeclsType)theEObject;
				T result = caseDdeConnectionDeclsType(ddeConnectionDeclsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.DDE_CONNECTION_DECL_TYPE: {
				DdeConnectionDeclType ddeConnectionDeclType = (DdeConnectionDeclType)theEObject;
				T result = caseDdeConnectionDeclType(ddeConnectionDeclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.DDE_CONNECTION_TYPE: {
				DdeConnectionType ddeConnectionType = (DdeConnectionType)theEObject;
				T result = caseDdeConnectionType(ddeConnectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.DELETION_TYPE: {
				DeletionType deletionType = (DeletionType)theEObject;
				T result = caseDeletionType(deletionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.DESCRIPTION_TYPE: {
				DescriptionType descriptionType = (DescriptionType)theEObject;
				T result = caseDescriptionType(descriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.EDITING_CYCLES_TYPE: {
				EditingCyclesType editingCyclesType = (EditingCyclesType)theEObject;
				T result = caseEditingCyclesType(editingCyclesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.EDITING_DURATION_TYPE: {
				EditingDurationType editingDurationType = (EditingDurationType)theEObject;
				T result = caseEditingDurationType(editingDurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.EXECUTE_MACRO_TYPE: {
				ExecuteMacroType executeMacroType = (ExecuteMacroType)theEObject;
				T result = caseExecuteMacroType(executeMacroType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.EXPRESSION_TYPE: {
				ExpressionType expressionType = (ExpressionType)theEObject;
				T result = caseExpressionType(expressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.FILE_NAME_TYPE: {
				FileNameType fileNameType = (FileNameType)theEObject;
				T result = caseFileNameType(fileNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.FORMAT_CHANGE_TYPE: {
				FormatChangeType formatChangeType = (FormatChangeType)theEObject;
				T result = caseFormatChangeType(formatChangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST: {
				FormPropertyTypeAndValueList formPropertyTypeAndValueList = (FormPropertyTypeAndValueList)theEObject;
				T result = caseFormPropertyTypeAndValueList(formPropertyTypeAndValueList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.HEADER_FOOTER_CONTENT: {
				HeaderFooterContent headerFooterContent = (HeaderFooterContent)theEObject;
				T result = caseHeaderFooterContent(headerFooterContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.HIDDEN_PARAGRAPH_TYPE: {
				HiddenParagraphType hiddenParagraphType = (HiddenParagraphType)theEObject;
				T result = caseHiddenParagraphType(hiddenParagraphType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.HIDDEN_TEXT_TYPE: {
				HiddenTextType hiddenTextType = (HiddenTextType)theEObject;
				T result = caseHiddenTextType(hiddenTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.HTYPE: {
				HType hType = (HType)theEObject;
				T result = caseHType(hType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE: {
				IllustrationIndexSourceType illustrationIndexSourceType = (IllustrationIndexSourceType)theEObject;
				T result = caseIllustrationIndexSourceType(illustrationIndexSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.ILLUSTRATION_INDEX_TYPE: {
				IllustrationIndexType illustrationIndexType = (IllustrationIndexType)theEObject;
				T result = caseIllustrationIndexType(illustrationIndexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.IMAGE_COUNT_TYPE: {
				ImageCountType imageCountType = (ImageCountType)theEObject;
				T result = caseImageCountType(imageCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_BODY_TYPE: {
				IndexBodyType indexBodyType = (IndexBodyType)theEObject;
				T result = caseIndexBodyType(indexBodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE: {
				IndexEntryBibliographyType indexEntryBibliographyType = (IndexEntryBibliographyType)theEObject;
				T result = caseIndexEntryBibliographyType(indexEntryBibliographyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_ENTRY_CHAPTER_TYPE: {
				IndexEntryChapterType indexEntryChapterType = (IndexEntryChapterType)theEObject;
				T result = caseIndexEntryChapterType(indexEntryChapterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_ENTRY_LINK_END_TYPE: {
				IndexEntryLinkEndType indexEntryLinkEndType = (IndexEntryLinkEndType)theEObject;
				T result = caseIndexEntryLinkEndType(indexEntryLinkEndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_ENTRY_LINK_START_TYPE: {
				IndexEntryLinkStartType indexEntryLinkStartType = (IndexEntryLinkStartType)theEObject;
				T result = caseIndexEntryLinkStartType(indexEntryLinkStartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_ENTRY_PAGE_NUMBER_TYPE: {
				IndexEntryPageNumberType indexEntryPageNumberType = (IndexEntryPageNumberType)theEObject;
				T result = caseIndexEntryPageNumberType(indexEntryPageNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_ENTRY_SPAN_TYPE: {
				IndexEntrySpanType indexEntrySpanType = (IndexEntrySpanType)theEObject;
				T result = caseIndexEntrySpanType(indexEntrySpanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE: {
				IndexEntryTabStopType indexEntryTabStopType = (IndexEntryTabStopType)theEObject;
				T result = caseIndexEntryTabStopType(indexEntryTabStopType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_ENTRY_TEXT_TYPE: {
				IndexEntryTextType indexEntryTextType = (IndexEntryTextType)theEObject;
				T result = caseIndexEntryTextType(indexEntryTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_SOURCE_STYLES_TYPE: {
				IndexSourceStylesType indexSourceStylesType = (IndexSourceStylesType)theEObject;
				T result = caseIndexSourceStylesType(indexSourceStylesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_SOURCE_STYLE_TYPE: {
				IndexSourceStyleType indexSourceStyleType = (IndexSourceStyleType)theEObject;
				T result = caseIndexSourceStyleType(indexSourceStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_TITLE_TEMPLATE_TYPE: {
				IndexTitleTemplateType indexTitleTemplateType = (IndexTitleTemplateType)theEObject;
				T result = caseIndexTitleTemplateType(indexTitleTemplateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INDEX_TITLE_TYPE: {
				IndexTitleType indexTitleType = (IndexTitleType)theEObject;
				T result = caseIndexTitleType(indexTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INITIAL_CREATOR_TYPE: {
				InitialCreatorType initialCreatorType = (InitialCreatorType)theEObject;
				T result = caseInitialCreatorType(initialCreatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.INSERTION_TYPE: {
				InsertionType insertionType = (InsertionType)theEObject;
				T result = caseInsertionType(insertionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.KEYWORDS_TYPE: {
				KeywordsType keywordsType = (KeywordsType)theEObject;
				T result = caseKeywordsType(keywordsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.LINE_BREAK_TYPE: {
				LineBreakType lineBreakType = (LineBreakType)theEObject;
				T result = caseLineBreakType(lineBreakType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE: {
				LinenumberingConfigurationType linenumberingConfigurationType = (LinenumberingConfigurationType)theEObject;
				T result = caseLinenumberingConfigurationType(linenumberingConfigurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.LINENUMBERING_SEPARATOR_TYPE: {
				LinenumberingSeparatorType linenumberingSeparatorType = (LinenumberingSeparatorType)theEObject;
				T result = caseLinenumberingSeparatorType(linenumberingSeparatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.LIST_ITEM_TYPE: {
				ListItemType listItemType = (ListItemType)theEObject;
				T result = caseListItemType(listItemType);
				if (result == null) result = caseTextListItemContent(listItemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.LIST_LEVEL_STYLE_BULLET_TYPE: {
				ListLevelStyleBulletType listLevelStyleBulletType = (ListLevelStyleBulletType)theEObject;
				T result = caseListLevelStyleBulletType(listLevelStyleBulletType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.LIST_LEVEL_STYLE_IMAGE_TYPE: {
				ListLevelStyleImageType listLevelStyleImageType = (ListLevelStyleImageType)theEObject;
				T result = caseListLevelStyleImageType(listLevelStyleImageType);
				if (result == null) result = caseTextListLevelStyleImageAttr(listLevelStyleImageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.LIST_LEVEL_STYLE_NUMBER_TYPE: {
				ListLevelStyleNumberType listLevelStyleNumberType = (ListLevelStyleNumberType)theEObject;
				T result = caseListLevelStyleNumberType(listLevelStyleNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.LIST_STYLE_TYPE: {
				ListStyleType listStyleType = (ListStyleType)theEObject;
				T result = caseListStyleType(listStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.LIST_TYPE: {
				ListType listType = (ListType)theEObject;
				T result = caseListType(listType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.MATH_MARKUP: {
				MathMarkup mathMarkup = (MathMarkup)theEObject;
				T result = caseMathMarkup(mathMarkup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.MEASURE_TYPE: {
				MeasureType measureType = (MeasureType)theEObject;
				T result = caseMeasureType(measureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.MODIFICATION_DATE_TYPE: {
				ModificationDateType modificationDateType = (ModificationDateType)theEObject;
				T result = caseModificationDateType(modificationDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.MODIFICATION_TIME_TYPE: {
				ModificationTimeType modificationTimeType = (ModificationTimeType)theEObject;
				T result = caseModificationTimeType(modificationTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.NOTE_BODY_TYPE: {
				NoteBodyType noteBodyType = (NoteBodyType)theEObject;
				T result = caseNoteBodyType(noteBodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.NOTE_CITATION_TYPE: {
				NoteCitationType noteCitationType = (NoteCitationType)theEObject;
				T result = caseNoteCitationType(noteCitationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.NOTE_REF_TYPE: {
				NoteRefType noteRefType = (NoteRefType)theEObject;
				T result = caseNoteRefType(noteRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.NOTE_TYPE: {
				NoteType noteType = (NoteType)theEObject;
				T result = caseNoteType(noteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.NUMBERED_PARAGRAPH_TYPE: {
				NumberedParagraphType numberedParagraphType = (NumberedParagraphType)theEObject;
				T result = caseNumberedParagraphType(numberedParagraphType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.OBJECT_COUNT_TYPE: {
				ObjectCountType objectCountType = (ObjectCountType)theEObject;
				T result = caseObjectCountType(objectCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE: {
				ObjectIndexSourceType objectIndexSourceType = (ObjectIndexSourceType)theEObject;
				T result = caseObjectIndexSourceType(objectIndexSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.OBJECT_INDEX_TYPE: {
				ObjectIndexType objectIndexType = (ObjectIndexType)theEObject;
				T result = caseObjectIndexType(objectIndexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.OFFICE_BODY_CONTENT: {
				OfficeBodyContent officeBodyContent = (OfficeBodyContent)theEObject;
				T result = caseOfficeBodyContent(officeBodyContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.OFFICE_CHART_CONTENT_MAIN_TYPE: {
				OfficeChartContentMainType officeChartContentMainType = (OfficeChartContentMainType)theEObject;
				T result = caseOfficeChartContentMainType(officeChartContentMainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.OFFICE_IMAGE_CONTENT_MAIN: {
				OfficeImageContentMain officeImageContentMain = (OfficeImageContentMain)theEObject;
				T result = caseOfficeImageContentMain(officeImageContentMain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.OFFICE_META: {
				OfficeMeta officeMeta = (OfficeMeta)theEObject;
				T result = caseOfficeMeta(officeMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.OFFICE_META_CONTENT: {
				OfficeMetaContent officeMetaContent = (OfficeMetaContent)theEObject;
				T result = caseOfficeMetaContent(officeMetaContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.OUTLINE_LEVEL_STYLE_TYPE: {
				OutlineLevelStyleType outlineLevelStyleType = (OutlineLevelStyleType)theEObject;
				T result = caseOutlineLevelStyleType(outlineLevelStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.OUTLINE_STYLE_TYPE: {
				OutlineStyleType outlineStyleType = (OutlineStyleType)theEObject;
				T result = caseOutlineStyleType(outlineStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PAGE_CONTINUATION_TYPE: {
				PageContinuationType pageContinuationType = (PageContinuationType)theEObject;
				T result = casePageContinuationType(pageContinuationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PAGE_COUNT_TYPE: {
				PageCountType pageCountType = (PageCountType)theEObject;
				T result = casePageCountType(pageCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PAGE_NUMBER_TYPE: {
				PageNumberType pageNumberType = (PageNumberType)theEObject;
				T result = casePageNumberType(pageNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PAGE_SEQUENCE_TYPE: {
				PageSequenceType pageSequenceType = (PageSequenceType)theEObject;
				T result = casePageSequenceType(pageSequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PAGE_TYPE: {
				PageType pageType = (PageType)theEObject;
				T result = casePageType(pageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PAGE_VARIABLE_GET_TYPE: {
				PageVariableGetType pageVariableGetType = (PageVariableGetType)theEObject;
				T result = casePageVariableGetType(pageVariableGetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PAGE_VARIABLE_SET_TYPE: {
				PageVariableSetType pageVariableSetType = (PageVariableSetType)theEObject;
				T result = casePageVariableSetType(pageVariableSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PARAGRAPH_COUNT_TYPE: {
				ParagraphCountType paragraphCountType = (ParagraphCountType)theEObject;
				T result = caseParagraphCountType(paragraphCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PLACEHOLDER_TYPE: {
				PlaceholderType placeholderType = (PlaceholderType)theEObject;
				T result = casePlaceholderType(placeholderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PRINT_DATE_TYPE: {
				PrintDateType printDateType = (PrintDateType)theEObject;
				T result = casePrintDateType(printDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PRINTED_BY_TYPE: {
				PrintedByType printedByType = (PrintedByType)theEObject;
				T result = casePrintedByType(printedByType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PRINT_TIME_TYPE: {
				PrintTimeType printTimeType = (PrintTimeType)theEObject;
				T result = casePrintTimeType(printTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.PTYPE: {
				PType pType = (PType)theEObject;
				T result = casePType(pType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.REFERENCE_MARK_END_TYPE: {
				ReferenceMarkEndType referenceMarkEndType = (ReferenceMarkEndType)theEObject;
				T result = caseReferenceMarkEndType(referenceMarkEndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.REFERENCE_MARK_START_TYPE: {
				ReferenceMarkStartType referenceMarkStartType = (ReferenceMarkStartType)theEObject;
				T result = caseReferenceMarkStartType(referenceMarkStartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.REFERENCE_MARK_TYPE: {
				ReferenceMarkType referenceMarkType = (ReferenceMarkType)theEObject;
				T result = caseReferenceMarkType(referenceMarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.REFERENCE_REF_TYPE: {
				ReferenceRefType referenceRefType = (ReferenceRefType)theEObject;
				T result = caseReferenceRefType(referenceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.REGION_CONTENT: {
				RegionContent regionContent = (RegionContent)theEObject;
				T result = caseRegionContent(regionContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.RUBY_BASE_TYPE: {
				RubyBaseType rubyBaseType = (RubyBaseType)theEObject;
				T result = caseRubyBaseType(rubyBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.RUBY_TEXT_TYPE: {
				RubyTextType rubyTextType = (RubyTextType)theEObject;
				T result = caseRubyTextType(rubyTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.RUBY_TYPE: {
				RubyType rubyType = (RubyType)theEObject;
				T result = caseRubyType(rubyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SCRIPT_TYPE: {
				ScriptType scriptType = (ScriptType)theEObject;
				T result = caseScriptType(scriptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SECTION_SOURCE_TYPE: {
				SectionSourceType sectionSourceType = (SectionSourceType)theEObject;
				T result = caseSectionSourceType(sectionSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SECTION_TYPE: {
				SectionType sectionType = (SectionType)theEObject;
				T result = caseSectionType(sectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_CITY_TYPE: {
				SenderCityType senderCityType = (SenderCityType)theEObject;
				T result = caseSenderCityType(senderCityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_COMPANY_TYPE: {
				SenderCompanyType senderCompanyType = (SenderCompanyType)theEObject;
				T result = caseSenderCompanyType(senderCompanyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_COUNTRY_TYPE: {
				SenderCountryType senderCountryType = (SenderCountryType)theEObject;
				T result = caseSenderCountryType(senderCountryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_EMAIL_TYPE: {
				SenderEmailType senderEmailType = (SenderEmailType)theEObject;
				T result = caseSenderEmailType(senderEmailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_FAX_TYPE: {
				SenderFaxType senderFaxType = (SenderFaxType)theEObject;
				T result = caseSenderFaxType(senderFaxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_FIRSTNAME_TYPE: {
				SenderFirstnameType senderFirstnameType = (SenderFirstnameType)theEObject;
				T result = caseSenderFirstnameType(senderFirstnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_INITIALS_TYPE: {
				SenderInitialsType senderInitialsType = (SenderInitialsType)theEObject;
				T result = caseSenderInitialsType(senderInitialsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_LASTNAME_TYPE: {
				SenderLastnameType senderLastnameType = (SenderLastnameType)theEObject;
				T result = caseSenderLastnameType(senderLastnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_PHONE_PRIVATE_TYPE: {
				SenderPhonePrivateType senderPhonePrivateType = (SenderPhonePrivateType)theEObject;
				T result = caseSenderPhonePrivateType(senderPhonePrivateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_PHONE_WORK_TYPE: {
				SenderPhoneWorkType senderPhoneWorkType = (SenderPhoneWorkType)theEObject;
				T result = caseSenderPhoneWorkType(senderPhoneWorkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_POSITION_TYPE: {
				SenderPositionType senderPositionType = (SenderPositionType)theEObject;
				T result = caseSenderPositionType(senderPositionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_POSTAL_CODE_TYPE: {
				SenderPostalCodeType senderPostalCodeType = (SenderPostalCodeType)theEObject;
				T result = caseSenderPostalCodeType(senderPostalCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_STATE_OR_PROVINCE_TYPE: {
				SenderStateOrProvinceType senderStateOrProvinceType = (SenderStateOrProvinceType)theEObject;
				T result = caseSenderStateOrProvinceType(senderStateOrProvinceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_STREET_TYPE: {
				SenderStreetType senderStreetType = (SenderStreetType)theEObject;
				T result = caseSenderStreetType(senderStreetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SENDER_TITLE_TYPE: {
				SenderTitleType senderTitleType = (SenderTitleType)theEObject;
				T result = caseSenderTitleType(senderTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SEQUENCE_DECLS_TYPE: {
				SequenceDeclsType sequenceDeclsType = (SequenceDeclsType)theEObject;
				T result = caseSequenceDeclsType(sequenceDeclsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SEQUENCE_DECL_TYPE: {
				SequenceDeclType sequenceDeclType = (SequenceDeclType)theEObject;
				T result = caseSequenceDeclType(sequenceDeclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SEQUENCE_REF_TYPE: {
				SequenceRefType sequenceRefType = (SequenceRefType)theEObject;
				T result = caseSequenceRefType(sequenceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SOFT_PAGE_BREAK_TYPE: {
				SoftPageBreakType softPageBreakType = (SoftPageBreakType)theEObject;
				T result = caseSoftPageBreakType(softPageBreakType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SORT_KEY_TYPE: {
				SortKeyType sortKeyType = (SortKeyType)theEObject;
				T result = caseSortKeyType(sortKeyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SPAN_TYPE: {
				SpanType spanType = (SpanType)theEObject;
				T result = caseSpanType(spanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_CHART_PROPERTIES_CONTENT: {
				StyleChartPropertiesContent styleChartPropertiesContent = (StyleChartPropertiesContent)theEObject;
				T result = caseStyleChartPropertiesContent(styleChartPropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleChartPropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleChartPropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_DRAWING_PAGE_PROPERTIES_CONTENT: {
				StyleDrawingPagePropertiesContent styleDrawingPagePropertiesContent = (StyleDrawingPagePropertiesContent)theEObject;
				T result = caseStyleDrawingPagePropertiesContent(styleDrawingPagePropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleDrawingPagePropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleDrawingPagePropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_GRAPHIC_PROPERTIES_CONTENT: {
				StyleGraphicPropertiesContent styleGraphicPropertiesContent = (StyleGraphicPropertiesContent)theEObject;
				T result = caseStyleGraphicPropertiesContent(styleGraphicPropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleGraphicPropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleGraphicPropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_HEADER_FOOTER_PROPERTIES_CONTENT: {
				StyleHeaderFooterPropertiesContent styleHeaderFooterPropertiesContent = (StyleHeaderFooterPropertiesContent)theEObject;
				T result = caseStyleHeaderFooterPropertiesContent(styleHeaderFooterPropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleHeaderFooterPropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleHeaderFooterPropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_LIST_LEVEL_PROPERTIES_CONTENT: {
				StyleListLevelPropertiesContent styleListLevelPropertiesContent = (StyleListLevelPropertiesContent)theEObject;
				T result = caseStyleListLevelPropertiesContent(styleListLevelPropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleListLevelPropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleListLevelPropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_PAGE_LAYOUT_PROPERTIES_CONTENT: {
				StylePageLayoutPropertiesContent stylePageLayoutPropertiesContent = (StylePageLayoutPropertiesContent)theEObject;
				T result = caseStylePageLayoutPropertiesContent(stylePageLayoutPropertiesContent);
				if (result == null) result = caseStylePropertiesContent(stylePageLayoutPropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(stylePageLayoutPropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_PARAGRAPH_PROPERTIES_CONTENT: {
				StyleParagraphPropertiesContent styleParagraphPropertiesContent = (StyleParagraphPropertiesContent)theEObject;
				T result = caseStyleParagraphPropertiesContent(styleParagraphPropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleParagraphPropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleParagraphPropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_PROPERTIES_CONTENT: {
				StylePropertiesContent stylePropertiesContent = (StylePropertiesContent)theEObject;
				T result = caseStylePropertiesContent(stylePropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(stylePropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_RUBY_PROPERTIES_CONTENT: {
				StyleRubyPropertiesContent styleRubyPropertiesContent = (StyleRubyPropertiesContent)theEObject;
				T result = caseStyleRubyPropertiesContent(styleRubyPropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleRubyPropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleRubyPropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_SECTION_PROPERTIES_CONTENT: {
				StyleSectionPropertiesContent styleSectionPropertiesContent = (StyleSectionPropertiesContent)theEObject;
				T result = caseStyleSectionPropertiesContent(styleSectionPropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleSectionPropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleSectionPropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_STYLE_CONTENT: {
				StyleStyleContent styleStyleContent = (StyleStyleContent)theEObject;
				T result = caseStyleStyleContent(styleStyleContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_TABLE_CELL_PROPERTIES_CONTENT: {
				StyleTableCellPropertiesContent styleTableCellPropertiesContent = (StyleTableCellPropertiesContent)theEObject;
				T result = caseStyleTableCellPropertiesContent(styleTableCellPropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleTableCellPropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleTableCellPropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_TABLE_COLUMN_PROPERTIES_CONTENT: {
				StyleTableColumnPropertiesContent styleTableColumnPropertiesContent = (StyleTableColumnPropertiesContent)theEObject;
				T result = caseStyleTableColumnPropertiesContent(styleTableColumnPropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleTableColumnPropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleTableColumnPropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_TABLE_PROPERTIES_CONTENT: {
				StyleTablePropertiesContent styleTablePropertiesContent = (StyleTablePropertiesContent)theEObject;
				T result = caseStyleTablePropertiesContent(styleTablePropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleTablePropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleTablePropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_TABLE_ROW_PROPERTIES_CONTENT: {
				StyleTableRowPropertiesContent styleTableRowPropertiesContent = (StyleTableRowPropertiesContent)theEObject;
				T result = caseStyleTableRowPropertiesContent(styleTableRowPropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleTableRowPropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleTableRowPropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYLE_TEXT_PROPERTIES_CONTENT: {
				StyleTextPropertiesContent styleTextPropertiesContent = (StyleTextPropertiesContent)theEObject;
				T result = caseStyleTextPropertiesContent(styleTextPropertiesContent);
				if (result == null) result = caseStylePropertiesContent(styleTextPropertiesContent);
				if (result == null) result = caseAnyAttListOrElements(styleTextPropertiesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.STYPE: {
				SType sType = (SType)theEObject;
				T result = caseSType(sType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.SUBJECT_TYPE: {
				SubjectType subjectType = (SubjectType)theEObject;
				T result = caseSubjectType(subjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TABLE_COUNT_TYPE: {
				TableCountType tableCountType = (TableCountType)theEObject;
				T result = caseTableCountType(tableCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TABLE_FORMULA_TYPE: {
				TableFormulaType tableFormulaType = (TableFormulaType)theEObject;
				T result = caseTableFormulaType(tableFormulaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TABLE_INDEX_SOURCE_TYPE: {
				TableIndexSourceType tableIndexSourceType = (TableIndexSourceType)theEObject;
				T result = caseTableIndexSourceType(tableIndexSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TABLE_INDEX_TYPE: {
				TableIndexType tableIndexType = (TableIndexType)theEObject;
				T result = caseTableIndexType(tableIndexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE: {
				TableOfContentEntryTemplateType tableOfContentEntryTemplateType = (TableOfContentEntryTemplateType)theEObject;
				T result = caseTableOfContentEntryTemplateType(tableOfContentEntryTemplateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE: {
				TableOfContentSourceType tableOfContentSourceType = (TableOfContentSourceType)theEObject;
				T result = caseTableOfContentSourceType(tableOfContentSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TABLE_OF_CONTENT_TYPE: {
				TableOfContentType tableOfContentType = (TableOfContentType)theEObject;
				T result = caseTableOfContentType(tableOfContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TABLE_TABLE_CELL_CONTENT: {
				TableTableCellContent tableTableCellContent = (TableTableCellContent)theEObject;
				T result = caseTableTableCellContent(tableTableCellContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TAB_TYPE: {
				TabType tabType = (TabType)theEObject;
				T result = caseTabType(tabType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TEMPLATE_NAME_TYPE: {
				TemplateNameType templateNameType = (TemplateNameType)theEObject;
				T result = caseTemplateNameType(templateNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TEXT_CHANGED_REGION_CONTENT: {
				TextChangedRegionContent textChangedRegionContent = (TextChangedRegionContent)theEObject;
				T result = caseTextChangedRegionContent(textChangedRegionContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TEXT_DATABASE_DISPLAY_ATTLIST: {
				TextDatabaseDisplayAttlist textDatabaseDisplayAttlist = (TextDatabaseDisplayAttlist)theEObject;
				T result = caseTextDatabaseDisplayAttlist(textDatabaseDisplayAttlist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TEXT_DATABASE_NEXT_ATTLIST: {
				TextDatabaseNextAttlist textDatabaseNextAttlist = (TextDatabaseNextAttlist)theEObject;
				T result = caseTextDatabaseNextAttlist(textDatabaseNextAttlist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TEXT_DATABASE_ROW_SELECT_ATTLIST: {
				TextDatabaseRowSelectAttlist textDatabaseRowSelectAttlist = (TextDatabaseRowSelectAttlist)theEObject;
				T result = caseTextDatabaseRowSelectAttlist(textDatabaseRowSelectAttlist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT: {
				TextIllustrationIndexEntryContent textIllustrationIndexEntryContent = (TextIllustrationIndexEntryContent)theEObject;
				T result = caseTextIllustrationIndexEntryContent(textIllustrationIndexEntryContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TEXT_INPUT_TYPE: {
				TextInputType textInputType = (TextInputType)theEObject;
				T result = caseTextInputType(textInputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TEXT_LIST_ITEM_CONTENT: {
				TextListItemContent textListItemContent = (TextListItemContent)theEObject;
				T result = caseTextListItemContent(textListItemContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TEXT_LIST_LEVEL_STYLE_IMAGE_ATTR: {
				TextListLevelStyleImageAttr textListLevelStyleImageAttr = (TextListLevelStyleImageAttr)theEObject;
				T result = caseTextListLevelStyleImageAttr(textListLevelStyleImageAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT: {
				TextNotesConfigurationContent textNotesConfigurationContent = (TextNotesConfigurationContent)theEObject;
				T result = caseTextNotesConfigurationContent(textNotesConfigurationContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TEXT_SECTION_SOURCE_DDE_TYPE: {
				TextSectionSourceDdeType textSectionSourceDdeType = (TextSectionSourceDdeType)theEObject;
				T result = caseTextSectionSourceDdeType(textSectionSourceDdeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TIME_TYPE: {
				TimeType timeType = (TimeType)theEObject;
				T result = caseTimeType(timeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TITLE_TYPE: {
				TitleType titleType = (TitleType)theEObject;
				T result = caseTitleType(titleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TOC_MARK_END_TYPE: {
				TocMarkEndType tocMarkEndType = (TocMarkEndType)theEObject;
				T result = caseTocMarkEndType(tocMarkEndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TOC_MARK_START_TYPE: {
				TocMarkStartType tocMarkStartType = (TocMarkStartType)theEObject;
				T result = caseTocMarkStartType(tocMarkStartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TOC_MARK_TYPE: {
				TocMarkType tocMarkType = (TocMarkType)theEObject;
				T result = caseTocMarkType(tocMarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.TRACKED_CHANGES_TYPE: {
				TrackedChangesType trackedChangesType = (TrackedChangesType)theEObject;
				T result = caseTrackedChangesType(trackedChangesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.USER_DEFINED_TYPE: {
				UserDefinedType userDefinedType = (UserDefinedType)theEObject;
				T result = caseUserDefinedType(userDefinedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.USER_FIELD_DECLS_TYPE: {
				UserFieldDeclsType userFieldDeclsType = (UserFieldDeclsType)theEObject;
				T result = caseUserFieldDeclsType(userFieldDeclsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.USER_FIELD_DECL_TYPE: {
				UserFieldDeclType userFieldDeclType = (UserFieldDeclType)theEObject;
				T result = caseUserFieldDeclType(userFieldDeclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.USER_FIELD_GET_TYPE: {
				UserFieldGetType userFieldGetType = (UserFieldGetType)theEObject;
				T result = caseUserFieldGetType(userFieldGetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.USER_FIELD_INPUT_TYPE: {
				UserFieldInputType userFieldInputType = (UserFieldInputType)theEObject;
				T result = caseUserFieldInputType(userFieldInputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.USER_INDEX_ENTRY_TEMPLATE_TYPE: {
				UserIndexEntryTemplateType userIndexEntryTemplateType = (UserIndexEntryTemplateType)theEObject;
				T result = caseUserIndexEntryTemplateType(userIndexEntryTemplateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.USER_INDEX_MARK_END_TYPE: {
				UserIndexMarkEndType userIndexMarkEndType = (UserIndexMarkEndType)theEObject;
				T result = caseUserIndexMarkEndType(userIndexMarkEndType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.USER_INDEX_MARK_START_TYPE: {
				UserIndexMarkStartType userIndexMarkStartType = (UserIndexMarkStartType)theEObject;
				T result = caseUserIndexMarkStartType(userIndexMarkStartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.USER_INDEX_MARK_TYPE: {
				UserIndexMarkType userIndexMarkType = (UserIndexMarkType)theEObject;
				T result = caseUserIndexMarkType(userIndexMarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.USER_INDEX_SOURCE_TYPE: {
				UserIndexSourceType userIndexSourceType = (UserIndexSourceType)theEObject;
				T result = caseUserIndexSourceType(userIndexSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.USER_INDEX_TYPE: {
				UserIndexType userIndexType = (UserIndexType)theEObject;
				T result = caseUserIndexType(userIndexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.VARIABLE_DECLS_TYPE: {
				VariableDeclsType variableDeclsType = (VariableDeclsType)theEObject;
				T result = caseVariableDeclsType(variableDeclsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.VARIABLE_DECL_TYPE: {
				VariableDeclType variableDeclType = (VariableDeclType)theEObject;
				T result = caseVariableDeclType(variableDeclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.VARIABLE_GET_TYPE: {
				VariableGetType variableGetType = (VariableGetType)theEObject;
				T result = caseVariableGetType(variableGetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.VARIABLE_INPUT_TYPE: {
				VariableInputType variableInputType = (VariableInputType)theEObject;
				T result = caseVariableInputType(variableInputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.VARIABLE_SET_TYPE: {
				VariableSetType variableSetType = (VariableSetType)theEObject;
				T result = caseVariableSetType(variableSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.WORD_COUNT_TYPE: {
				WordCountType wordCountType = (WordCountType)theEObject;
				T result = caseWordCountType(wordCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabetical Index Auto Mark File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabetical Index Auto Mark File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabeticalIndexAutoMarkFileType(AlphabeticalIndexAutoMarkFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabetical Index Entry Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabetical Index Entry Template Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabeticalIndexEntryTemplateType(AlphabeticalIndexEntryTemplateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabetical Index Mark End Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabetical Index Mark End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabeticalIndexMarkEndType(AlphabeticalIndexMarkEndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabetical Index Mark Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabetical Index Mark Start Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabeticalIndexMarkStartType(AlphabeticalIndexMarkStartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabetical Index Mark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabetical Index Mark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabeticalIndexMarkType(AlphabeticalIndexMarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabetical Index Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabetical Index Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabeticalIndexSourceType(AlphabeticalIndexSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alphabetical Index Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alphabetical Index Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlphabeticalIndexType(AlphabeticalIndexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Att List Or Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Att List Or Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyAttListOrElements(AnyAttListOrElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAType(AType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Initials Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Initials Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorInitialsType(AuthorInitialsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorNameType(AuthorNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliography Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliography Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliographyConfigurationType(BibliographyConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliography Entry Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliography Entry Template Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliographyEntryTemplateType(BibliographyEntryTemplateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliography Mark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliography Mark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliographyMarkType(BibliographyMarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliography Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliography Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliographySourceType(BibliographySourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliography Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliography Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliographyType(BibliographyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bookmark End Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bookmark End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookmarkEndType(BookmarkEndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bookmark Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bookmark Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookmarkRefType(BookmarkRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bookmark Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bookmark Start Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookmarkStartType(BookmarkStartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bookmark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bookmark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookmarkType(BookmarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Changed Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Changed Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangedRegionType(ChangedRegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Marks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Marks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeMarksType(ChangeMarksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chapter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chapter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChapterType(ChapterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterCountType(CharacterCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Form Control Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Form Control Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonFormControlContent(CommonFormControlContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalTextType(ConditionalTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigItems(ConfigItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreationDateType(CreationDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreationTimeType(CreationTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreatorType(CreatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseNameType(DatabaseNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Row Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Row Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseRowNumberType(DatabaseRowNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateType(DateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dde Connection Decls Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dde Connection Decls Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdeConnectionDeclsType(DdeConnectionDeclsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dde Connection Decl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dde Connection Decl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdeConnectionDeclType(DdeConnectionDeclType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dde Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dde Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdeConnectionType(DdeConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deletion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deletion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletionType(DeletionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionType(DescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editing Cycles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editing Cycles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditingCyclesType(EditingCyclesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editing Duration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editing Duration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditingDurationType(EditingDurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute Macro Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute Macro Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteMacroType(ExecuteMacroType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionType(ExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileNameType(FileNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Format Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Format Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormatChangeType(FormatChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Property Type And Value List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Property Type And Value List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormPropertyTypeAndValueList(FormPropertyTypeAndValueList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Footer Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Footer Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderFooterContent(HeaderFooterContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hidden Paragraph Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hidden Paragraph Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHiddenParagraphType(HiddenParagraphType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hidden Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hidden Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHiddenTextType(HiddenTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHType(HType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Illustration Index Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Illustration Index Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIllustrationIndexSourceType(IllustrationIndexSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Illustration Index Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Illustration Index Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIllustrationIndexType(IllustrationIndexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageCountType(ImageCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Body Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Body Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexBodyType(IndexBodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Entry Bibliography Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Entry Bibliography Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexEntryBibliographyType(IndexEntryBibliographyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Entry Chapter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Entry Chapter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexEntryChapterType(IndexEntryChapterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Entry Link End Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Entry Link End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexEntryLinkEndType(IndexEntryLinkEndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Entry Link Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Entry Link Start Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexEntryLinkStartType(IndexEntryLinkStartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Entry Page Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Entry Page Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexEntryPageNumberType(IndexEntryPageNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Entry Span Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Entry Span Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexEntrySpanType(IndexEntrySpanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Entry Tab Stop Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Entry Tab Stop Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexEntryTabStopType(IndexEntryTabStopType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Entry Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Entry Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexEntryTextType(IndexEntryTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Source Styles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Source Styles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexSourceStylesType(IndexSourceStylesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Source Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Source Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexSourceStyleType(IndexSourceStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Title Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Title Template Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexTitleTemplateType(IndexTitleTemplateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexTitleType(IndexTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Creator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Creator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialCreatorType(InitialCreatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insertion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insertion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertionType(InsertionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keywords Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keywords Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordsType(KeywordsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Break Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Break Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineBreakType(LineBreakType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linenumbering Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linenumbering Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinenumberingConfigurationType(LinenumberingConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linenumbering Separator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linenumbering Separator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinenumberingSeparatorType(LinenumberingSeparatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItemType(ListItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Level Style Bullet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Level Style Bullet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListLevelStyleBulletType(ListLevelStyleBulletType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Level Style Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Level Style Image Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListLevelStyleImageType(ListLevelStyleImageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Level Style Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Level Style Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListLevelStyleNumberType(ListLevelStyleNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListStyleType(ListStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListType(ListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Markup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Markup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathMarkup(MathMarkup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureType(MeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modification Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modification Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModificationDateType(ModificationDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modification Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modification Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModificationTimeType(ModificationTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Body Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Body Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteBodyType(NoteBodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Citation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Citation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteCitationType(NoteCitationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteRefType(NoteRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteType(NoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numbered Paragraph Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numbered Paragraph Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberedParagraphType(NumberedParagraphType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectCountType(ObjectCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Index Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Index Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectIndexSourceType(ObjectIndexSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Index Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Index Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectIndexType(ObjectIndexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Office Body Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Office Body Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfficeBodyContent(OfficeBodyContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Office Chart Content Main Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Office Chart Content Main Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfficeChartContentMainType(OfficeChartContentMainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Office Image Content Main</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Office Image Content Main</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfficeImageContentMain(OfficeImageContentMain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Office Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Office Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfficeMeta(OfficeMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Office Meta Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Office Meta Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfficeMetaContent(OfficeMetaContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outline Level Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outline Level Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutlineLevelStyleType(OutlineLevelStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outline Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outline Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutlineStyleType(OutlineStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Continuation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Continuation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageContinuationType(PageContinuationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageCountType(PageCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageNumberType(PageNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageSequenceType(PageSequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageType(PageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Variable Get Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Variable Get Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageVariableGetType(PageVariableGetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Variable Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Variable Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageVariableSetType(PageVariableSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraphCountType(ParagraphCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placeholder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placeholder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceholderType(PlaceholderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintDateType(PrintDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Printed By Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Printed By Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintedByType(PrintedByType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintTimeType(PrintTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePType(PType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Mark End Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Mark End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceMarkEndType(ReferenceMarkEndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Mark Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Mark Start Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceMarkStartType(ReferenceMarkStartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Mark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Mark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceMarkType(ReferenceMarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceRefType(ReferenceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionContent(RegionContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRubyBaseType(RubyBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRubyTextType(RubyTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRubyType(RubyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptType(ScriptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionSourceType(SectionSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionType(SectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender City Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender City Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderCityType(SenderCityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Company Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Company Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderCompanyType(SenderCompanyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Country Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Country Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderCountryType(SenderCountryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Email Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Email Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderEmailType(SenderEmailType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Fax Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Fax Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderFaxType(SenderFaxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Firstname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Firstname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderFirstnameType(SenderFirstnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Initials Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Initials Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderInitialsType(SenderInitialsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Lastname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Lastname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderLastnameType(SenderLastnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Phone Private Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Phone Private Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderPhonePrivateType(SenderPhonePrivateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Phone Work Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Phone Work Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderPhoneWorkType(SenderPhoneWorkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderPositionType(SenderPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Postal Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Postal Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderPostalCodeType(SenderPostalCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender State Or Province Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender State Or Province Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderStateOrProvinceType(SenderStateOrProvinceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Street Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Street Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderStreetType(SenderStreetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderTitleType(SenderTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Decls Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Decls Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceDeclsType(SequenceDeclsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Decl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Decl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceDeclType(SequenceDeclType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceRefType(SequenceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soft Page Break Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soft Page Break Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftPageBreakType(SoftPageBreakType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortKeyType(SortKeyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpanType(SpanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Chart Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Chart Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleChartPropertiesContent(StyleChartPropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Drawing Page Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Drawing Page Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleDrawingPagePropertiesContent(StyleDrawingPagePropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Graphic Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Graphic Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleGraphicPropertiesContent(StyleGraphicPropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Header Footer Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Header Footer Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleHeaderFooterPropertiesContent(StyleHeaderFooterPropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style List Level Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style List Level Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleListLevelPropertiesContent(StyleListLevelPropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Page Layout Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Page Layout Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStylePageLayoutPropertiesContent(StylePageLayoutPropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Paragraph Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Paragraph Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleParagraphPropertiesContent(StyleParagraphPropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStylePropertiesContent(StylePropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Ruby Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Ruby Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleRubyPropertiesContent(StyleRubyPropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Section Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Section Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleSectionPropertiesContent(StyleSectionPropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Style Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Style Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleStyleContent(StyleStyleContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Table Cell Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Table Cell Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleTableCellPropertiesContent(StyleTableCellPropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Table Column Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Table Column Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleTableColumnPropertiesContent(StyleTableColumnPropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Table Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Table Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleTablePropertiesContent(StyleTablePropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Table Row Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Table Row Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleTableRowPropertiesContent(StyleTableRowPropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Text Properties Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Text Properties Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleTextPropertiesContent(StyleTextPropertiesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSType(SType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectType(SubjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCountType(TableCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Formula Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Formula Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableFormulaType(TableFormulaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Index Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Index Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableIndexSourceType(TableIndexSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Index Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Index Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableIndexType(TableIndexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Of Content Entry Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Of Content Entry Template Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOfContentEntryTemplateType(TableOfContentEntryTemplateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Of Content Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Of Content Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOfContentSourceType(TableOfContentSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Of Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Of Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOfContentType(TableOfContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Table Cell Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Table Cell Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableTableCellContent(TableTableCellContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabType(TabType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateNameType(TemplateNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Changed Region Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Changed Region Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextChangedRegionContent(TextChangedRegionContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Display Attlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Display Attlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextDatabaseDisplayAttlist(TextDatabaseDisplayAttlist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Next Attlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Next Attlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextDatabaseNextAttlist(TextDatabaseNextAttlist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Row Select Attlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Row Select Attlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextDatabaseRowSelectAttlist(TextDatabaseRowSelectAttlist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Illustration Index Entry Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Illustration Index Entry Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextIllustrationIndexEntryContent(TextIllustrationIndexEntryContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextInputType(TextInputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextListItemContent(TextListItemContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Level Style Image Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Level Style Image Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextListLevelStyleImageAttr(TextListLevelStyleImageAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notes Configuration Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notes Configuration Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextNotesConfigurationContent(TextNotesConfigurationContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Source Dde Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Source Dde Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextSectionSourceDdeType(TextSectionSourceDdeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeType(TimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleType(TitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toc Mark End Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toc Mark End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTocMarkEndType(TocMarkEndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toc Mark Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toc Mark Start Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTocMarkStartType(TocMarkStartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toc Mark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toc Mark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTocMarkType(TocMarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tracked Changes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tracked Changes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackedChangesType(TrackedChangesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedType(UserDefinedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Field Decls Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Field Decls Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserFieldDeclsType(UserFieldDeclsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Field Decl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Field Decl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserFieldDeclType(UserFieldDeclType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Field Get Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Field Get Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserFieldGetType(UserFieldGetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Field Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Field Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserFieldInputType(UserFieldInputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Index Entry Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Index Entry Template Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIndexEntryTemplateType(UserIndexEntryTemplateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Index Mark End Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Index Mark End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIndexMarkEndType(UserIndexMarkEndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Index Mark Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Index Mark Start Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIndexMarkStartType(UserIndexMarkStartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Index Mark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Index Mark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIndexMarkType(UserIndexMarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Index Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Index Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIndexSourceType(UserIndexSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Index Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Index Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserIndexType(UserIndexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Decls Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Decls Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclsType(VariableDeclsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Decl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Decl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclType(VariableDeclType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Get Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Get Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableGetType(VariableGetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableInputType(VariableInputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableSetType(VariableSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Word Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Word Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWordCountType(WordCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //TextSwitch
