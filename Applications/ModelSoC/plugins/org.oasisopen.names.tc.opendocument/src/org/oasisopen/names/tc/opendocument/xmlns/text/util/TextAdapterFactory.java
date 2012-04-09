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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage
 * @generated
 */
public class TextAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TextPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TextPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextSwitch<Adapter> modelSwitch =
		new TextSwitch<Adapter>() {
			@Override
			public Adapter caseAlphabeticalIndexAutoMarkFileType(AlphabeticalIndexAutoMarkFileType object) {
				return createAlphabeticalIndexAutoMarkFileTypeAdapter();
			}
			@Override
			public Adapter caseAlphabeticalIndexEntryTemplateType(AlphabeticalIndexEntryTemplateType object) {
				return createAlphabeticalIndexEntryTemplateTypeAdapter();
			}
			@Override
			public Adapter caseAlphabeticalIndexMarkEndType(AlphabeticalIndexMarkEndType object) {
				return createAlphabeticalIndexMarkEndTypeAdapter();
			}
			@Override
			public Adapter caseAlphabeticalIndexMarkStartType(AlphabeticalIndexMarkStartType object) {
				return createAlphabeticalIndexMarkStartTypeAdapter();
			}
			@Override
			public Adapter caseAlphabeticalIndexMarkType(AlphabeticalIndexMarkType object) {
				return createAlphabeticalIndexMarkTypeAdapter();
			}
			@Override
			public Adapter caseAlphabeticalIndexSourceType(AlphabeticalIndexSourceType object) {
				return createAlphabeticalIndexSourceTypeAdapter();
			}
			@Override
			public Adapter caseAlphabeticalIndexType(AlphabeticalIndexType object) {
				return createAlphabeticalIndexTypeAdapter();
			}
			@Override
			public Adapter caseAnyAttListOrElements(AnyAttListOrElements object) {
				return createAnyAttListOrElementsAdapter();
			}
			@Override
			public Adapter caseAType(AType object) {
				return createATypeAdapter();
			}
			@Override
			public Adapter caseAuthorInitialsType(AuthorInitialsType object) {
				return createAuthorInitialsTypeAdapter();
			}
			@Override
			public Adapter caseAuthorNameType(AuthorNameType object) {
				return createAuthorNameTypeAdapter();
			}
			@Override
			public Adapter caseBibliographyConfigurationType(BibliographyConfigurationType object) {
				return createBibliographyConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseBibliographyEntryTemplateType(BibliographyEntryTemplateType object) {
				return createBibliographyEntryTemplateTypeAdapter();
			}
			@Override
			public Adapter caseBibliographyMarkType(BibliographyMarkType object) {
				return createBibliographyMarkTypeAdapter();
			}
			@Override
			public Adapter caseBibliographySourceType(BibliographySourceType object) {
				return createBibliographySourceTypeAdapter();
			}
			@Override
			public Adapter caseBibliographyType(BibliographyType object) {
				return createBibliographyTypeAdapter();
			}
			@Override
			public Adapter caseBookmarkEndType(BookmarkEndType object) {
				return createBookmarkEndTypeAdapter();
			}
			@Override
			public Adapter caseBookmarkRefType(BookmarkRefType object) {
				return createBookmarkRefTypeAdapter();
			}
			@Override
			public Adapter caseBookmarkStartType(BookmarkStartType object) {
				return createBookmarkStartTypeAdapter();
			}
			@Override
			public Adapter caseBookmarkType(BookmarkType object) {
				return createBookmarkTypeAdapter();
			}
			@Override
			public Adapter caseChangedRegionType(ChangedRegionType object) {
				return createChangedRegionTypeAdapter();
			}
			@Override
			public Adapter caseChangeMarksType(ChangeMarksType object) {
				return createChangeMarksTypeAdapter();
			}
			@Override
			public Adapter caseChapterType(ChapterType object) {
				return createChapterTypeAdapter();
			}
			@Override
			public Adapter caseCharacterCountType(CharacterCountType object) {
				return createCharacterCountTypeAdapter();
			}
			@Override
			public Adapter caseCommonFormControlContent(CommonFormControlContent object) {
				return createCommonFormControlContentAdapter();
			}
			@Override
			public Adapter caseConditionalTextType(ConditionalTextType object) {
				return createConditionalTextTypeAdapter();
			}
			@Override
			public Adapter caseConfigItems(ConfigItems object) {
				return createConfigItemsAdapter();
			}
			@Override
			public Adapter caseCreationDateType(CreationDateType object) {
				return createCreationDateTypeAdapter();
			}
			@Override
			public Adapter caseCreationTimeType(CreationTimeType object) {
				return createCreationTimeTypeAdapter();
			}
			@Override
			public Adapter caseCreatorType(CreatorType object) {
				return createCreatorTypeAdapter();
			}
			@Override
			public Adapter caseDatabaseNameType(DatabaseNameType object) {
				return createDatabaseNameTypeAdapter();
			}
			@Override
			public Adapter caseDatabaseRowNumberType(DatabaseRowNumberType object) {
				return createDatabaseRowNumberTypeAdapter();
			}
			@Override
			public Adapter caseDateType(DateType object) {
				return createDateTypeAdapter();
			}
			@Override
			public Adapter caseDdeConnectionDeclsType(DdeConnectionDeclsType object) {
				return createDdeConnectionDeclsTypeAdapter();
			}
			@Override
			public Adapter caseDdeConnectionDeclType(DdeConnectionDeclType object) {
				return createDdeConnectionDeclTypeAdapter();
			}
			@Override
			public Adapter caseDdeConnectionType(DdeConnectionType object) {
				return createDdeConnectionTypeAdapter();
			}
			@Override
			public Adapter caseDeletionType(DeletionType object) {
				return createDeletionTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseEditingCyclesType(EditingCyclesType object) {
				return createEditingCyclesTypeAdapter();
			}
			@Override
			public Adapter caseEditingDurationType(EditingDurationType object) {
				return createEditingDurationTypeAdapter();
			}
			@Override
			public Adapter caseExecuteMacroType(ExecuteMacroType object) {
				return createExecuteMacroTypeAdapter();
			}
			@Override
			public Adapter caseExpressionType(ExpressionType object) {
				return createExpressionTypeAdapter();
			}
			@Override
			public Adapter caseFileNameType(FileNameType object) {
				return createFileNameTypeAdapter();
			}
			@Override
			public Adapter caseFormatChangeType(FormatChangeType object) {
				return createFormatChangeTypeAdapter();
			}
			@Override
			public Adapter caseFormPropertyTypeAndValueList(FormPropertyTypeAndValueList object) {
				return createFormPropertyTypeAndValueListAdapter();
			}
			@Override
			public Adapter caseHeaderFooterContent(HeaderFooterContent object) {
				return createHeaderFooterContentAdapter();
			}
			@Override
			public Adapter caseHiddenParagraphType(HiddenParagraphType object) {
				return createHiddenParagraphTypeAdapter();
			}
			@Override
			public Adapter caseHiddenTextType(HiddenTextType object) {
				return createHiddenTextTypeAdapter();
			}
			@Override
			public Adapter caseHType(HType object) {
				return createHTypeAdapter();
			}
			@Override
			public Adapter caseIllustrationIndexSourceType(IllustrationIndexSourceType object) {
				return createIllustrationIndexSourceTypeAdapter();
			}
			@Override
			public Adapter caseIllustrationIndexType(IllustrationIndexType object) {
				return createIllustrationIndexTypeAdapter();
			}
			@Override
			public Adapter caseImageCountType(ImageCountType object) {
				return createImageCountTypeAdapter();
			}
			@Override
			public Adapter caseIndexBodyType(IndexBodyType object) {
				return createIndexBodyTypeAdapter();
			}
			@Override
			public Adapter caseIndexEntryBibliographyType(IndexEntryBibliographyType object) {
				return createIndexEntryBibliographyTypeAdapter();
			}
			@Override
			public Adapter caseIndexEntryChapterType(IndexEntryChapterType object) {
				return createIndexEntryChapterTypeAdapter();
			}
			@Override
			public Adapter caseIndexEntryLinkEndType(IndexEntryLinkEndType object) {
				return createIndexEntryLinkEndTypeAdapter();
			}
			@Override
			public Adapter caseIndexEntryLinkStartType(IndexEntryLinkStartType object) {
				return createIndexEntryLinkStartTypeAdapter();
			}
			@Override
			public Adapter caseIndexEntryPageNumberType(IndexEntryPageNumberType object) {
				return createIndexEntryPageNumberTypeAdapter();
			}
			@Override
			public Adapter caseIndexEntrySpanType(IndexEntrySpanType object) {
				return createIndexEntrySpanTypeAdapter();
			}
			@Override
			public Adapter caseIndexEntryTabStopType(IndexEntryTabStopType object) {
				return createIndexEntryTabStopTypeAdapter();
			}
			@Override
			public Adapter caseIndexEntryTextType(IndexEntryTextType object) {
				return createIndexEntryTextTypeAdapter();
			}
			@Override
			public Adapter caseIndexSourceStylesType(IndexSourceStylesType object) {
				return createIndexSourceStylesTypeAdapter();
			}
			@Override
			public Adapter caseIndexSourceStyleType(IndexSourceStyleType object) {
				return createIndexSourceStyleTypeAdapter();
			}
			@Override
			public Adapter caseIndexTitleTemplateType(IndexTitleTemplateType object) {
				return createIndexTitleTemplateTypeAdapter();
			}
			@Override
			public Adapter caseIndexTitleType(IndexTitleType object) {
				return createIndexTitleTypeAdapter();
			}
			@Override
			public Adapter caseInitialCreatorType(InitialCreatorType object) {
				return createInitialCreatorTypeAdapter();
			}
			@Override
			public Adapter caseInsertionType(InsertionType object) {
				return createInsertionTypeAdapter();
			}
			@Override
			public Adapter caseKeywordsType(KeywordsType object) {
				return createKeywordsTypeAdapter();
			}
			@Override
			public Adapter caseLineBreakType(LineBreakType object) {
				return createLineBreakTypeAdapter();
			}
			@Override
			public Adapter caseLinenumberingConfigurationType(LinenumberingConfigurationType object) {
				return createLinenumberingConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseLinenumberingSeparatorType(LinenumberingSeparatorType object) {
				return createLinenumberingSeparatorTypeAdapter();
			}
			@Override
			public Adapter caseListItemType(ListItemType object) {
				return createListItemTypeAdapter();
			}
			@Override
			public Adapter caseListLevelStyleBulletType(ListLevelStyleBulletType object) {
				return createListLevelStyleBulletTypeAdapter();
			}
			@Override
			public Adapter caseListLevelStyleImageType(ListLevelStyleImageType object) {
				return createListLevelStyleImageTypeAdapter();
			}
			@Override
			public Adapter caseListLevelStyleNumberType(ListLevelStyleNumberType object) {
				return createListLevelStyleNumberTypeAdapter();
			}
			@Override
			public Adapter caseListStyleType(ListStyleType object) {
				return createListStyleTypeAdapter();
			}
			@Override
			public Adapter caseListType(ListType object) {
				return createListTypeAdapter();
			}
			@Override
			public Adapter caseMathMarkup(MathMarkup object) {
				return createMathMarkupAdapter();
			}
			@Override
			public Adapter caseMeasureType(MeasureType object) {
				return createMeasureTypeAdapter();
			}
			@Override
			public Adapter caseModificationDateType(ModificationDateType object) {
				return createModificationDateTypeAdapter();
			}
			@Override
			public Adapter caseModificationTimeType(ModificationTimeType object) {
				return createModificationTimeTypeAdapter();
			}
			@Override
			public Adapter caseNoteBodyType(NoteBodyType object) {
				return createNoteBodyTypeAdapter();
			}
			@Override
			public Adapter caseNoteCitationType(NoteCitationType object) {
				return createNoteCitationTypeAdapter();
			}
			@Override
			public Adapter caseNoteRefType(NoteRefType object) {
				return createNoteRefTypeAdapter();
			}
			@Override
			public Adapter caseNoteType(NoteType object) {
				return createNoteTypeAdapter();
			}
			@Override
			public Adapter caseNumberedParagraphType(NumberedParagraphType object) {
				return createNumberedParagraphTypeAdapter();
			}
			@Override
			public Adapter caseObjectCountType(ObjectCountType object) {
				return createObjectCountTypeAdapter();
			}
			@Override
			public Adapter caseObjectIndexSourceType(ObjectIndexSourceType object) {
				return createObjectIndexSourceTypeAdapter();
			}
			@Override
			public Adapter caseObjectIndexType(ObjectIndexType object) {
				return createObjectIndexTypeAdapter();
			}
			@Override
			public Adapter caseOfficeBodyContent(OfficeBodyContent object) {
				return createOfficeBodyContentAdapter();
			}
			@Override
			public Adapter caseOfficeChartContentMainType(OfficeChartContentMainType object) {
				return createOfficeChartContentMainTypeAdapter();
			}
			@Override
			public Adapter caseOfficeImageContentMain(OfficeImageContentMain object) {
				return createOfficeImageContentMainAdapter();
			}
			@Override
			public Adapter caseOfficeMeta(OfficeMeta object) {
				return createOfficeMetaAdapter();
			}
			@Override
			public Adapter caseOfficeMetaContent(OfficeMetaContent object) {
				return createOfficeMetaContentAdapter();
			}
			@Override
			public Adapter caseOutlineLevelStyleType(OutlineLevelStyleType object) {
				return createOutlineLevelStyleTypeAdapter();
			}
			@Override
			public Adapter caseOutlineStyleType(OutlineStyleType object) {
				return createOutlineStyleTypeAdapter();
			}
			@Override
			public Adapter casePageContinuationType(PageContinuationType object) {
				return createPageContinuationTypeAdapter();
			}
			@Override
			public Adapter casePageCountType(PageCountType object) {
				return createPageCountTypeAdapter();
			}
			@Override
			public Adapter casePageNumberType(PageNumberType object) {
				return createPageNumberTypeAdapter();
			}
			@Override
			public Adapter casePageSequenceType(PageSequenceType object) {
				return createPageSequenceTypeAdapter();
			}
			@Override
			public Adapter casePageType(PageType object) {
				return createPageTypeAdapter();
			}
			@Override
			public Adapter casePageVariableGetType(PageVariableGetType object) {
				return createPageVariableGetTypeAdapter();
			}
			@Override
			public Adapter casePageVariableSetType(PageVariableSetType object) {
				return createPageVariableSetTypeAdapter();
			}
			@Override
			public Adapter caseParagraphCountType(ParagraphCountType object) {
				return createParagraphCountTypeAdapter();
			}
			@Override
			public Adapter casePlaceholderType(PlaceholderType object) {
				return createPlaceholderTypeAdapter();
			}
			@Override
			public Adapter casePrintDateType(PrintDateType object) {
				return createPrintDateTypeAdapter();
			}
			@Override
			public Adapter casePrintedByType(PrintedByType object) {
				return createPrintedByTypeAdapter();
			}
			@Override
			public Adapter casePrintTimeType(PrintTimeType object) {
				return createPrintTimeTypeAdapter();
			}
			@Override
			public Adapter casePType(PType object) {
				return createPTypeAdapter();
			}
			@Override
			public Adapter caseReferenceMarkEndType(ReferenceMarkEndType object) {
				return createReferenceMarkEndTypeAdapter();
			}
			@Override
			public Adapter caseReferenceMarkStartType(ReferenceMarkStartType object) {
				return createReferenceMarkStartTypeAdapter();
			}
			@Override
			public Adapter caseReferenceMarkType(ReferenceMarkType object) {
				return createReferenceMarkTypeAdapter();
			}
			@Override
			public Adapter caseReferenceRefType(ReferenceRefType object) {
				return createReferenceRefTypeAdapter();
			}
			@Override
			public Adapter caseRegionContent(RegionContent object) {
				return createRegionContentAdapter();
			}
			@Override
			public Adapter caseRubyBaseType(RubyBaseType object) {
				return createRubyBaseTypeAdapter();
			}
			@Override
			public Adapter caseRubyTextType(RubyTextType object) {
				return createRubyTextTypeAdapter();
			}
			@Override
			public Adapter caseRubyType(RubyType object) {
				return createRubyTypeAdapter();
			}
			@Override
			public Adapter caseScriptType(ScriptType object) {
				return createScriptTypeAdapter();
			}
			@Override
			public Adapter caseSectionSourceType(SectionSourceType object) {
				return createSectionSourceTypeAdapter();
			}
			@Override
			public Adapter caseSectionType(SectionType object) {
				return createSectionTypeAdapter();
			}
			@Override
			public Adapter caseSenderCityType(SenderCityType object) {
				return createSenderCityTypeAdapter();
			}
			@Override
			public Adapter caseSenderCompanyType(SenderCompanyType object) {
				return createSenderCompanyTypeAdapter();
			}
			@Override
			public Adapter caseSenderCountryType(SenderCountryType object) {
				return createSenderCountryTypeAdapter();
			}
			@Override
			public Adapter caseSenderEmailType(SenderEmailType object) {
				return createSenderEmailTypeAdapter();
			}
			@Override
			public Adapter caseSenderFaxType(SenderFaxType object) {
				return createSenderFaxTypeAdapter();
			}
			@Override
			public Adapter caseSenderFirstnameType(SenderFirstnameType object) {
				return createSenderFirstnameTypeAdapter();
			}
			@Override
			public Adapter caseSenderInitialsType(SenderInitialsType object) {
				return createSenderInitialsTypeAdapter();
			}
			@Override
			public Adapter caseSenderLastnameType(SenderLastnameType object) {
				return createSenderLastnameTypeAdapter();
			}
			@Override
			public Adapter caseSenderPhonePrivateType(SenderPhonePrivateType object) {
				return createSenderPhonePrivateTypeAdapter();
			}
			@Override
			public Adapter caseSenderPhoneWorkType(SenderPhoneWorkType object) {
				return createSenderPhoneWorkTypeAdapter();
			}
			@Override
			public Adapter caseSenderPositionType(SenderPositionType object) {
				return createSenderPositionTypeAdapter();
			}
			@Override
			public Adapter caseSenderPostalCodeType(SenderPostalCodeType object) {
				return createSenderPostalCodeTypeAdapter();
			}
			@Override
			public Adapter caseSenderStateOrProvinceType(SenderStateOrProvinceType object) {
				return createSenderStateOrProvinceTypeAdapter();
			}
			@Override
			public Adapter caseSenderStreetType(SenderStreetType object) {
				return createSenderStreetTypeAdapter();
			}
			@Override
			public Adapter caseSenderTitleType(SenderTitleType object) {
				return createSenderTitleTypeAdapter();
			}
			@Override
			public Adapter caseSequenceDeclsType(SequenceDeclsType object) {
				return createSequenceDeclsTypeAdapter();
			}
			@Override
			public Adapter caseSequenceDeclType(SequenceDeclType object) {
				return createSequenceDeclTypeAdapter();
			}
			@Override
			public Adapter caseSequenceRefType(SequenceRefType object) {
				return createSequenceRefTypeAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseSoftPageBreakType(SoftPageBreakType object) {
				return createSoftPageBreakTypeAdapter();
			}
			@Override
			public Adapter caseSortKeyType(SortKeyType object) {
				return createSortKeyTypeAdapter();
			}
			@Override
			public Adapter caseSpanType(SpanType object) {
				return createSpanTypeAdapter();
			}
			@Override
			public Adapter caseStyleChartPropertiesContent(StyleChartPropertiesContent object) {
				return createStyleChartPropertiesContentAdapter();
			}
			@Override
			public Adapter caseStyleDrawingPagePropertiesContent(StyleDrawingPagePropertiesContent object) {
				return createStyleDrawingPagePropertiesContentAdapter();
			}
			@Override
			public Adapter caseStyleGraphicPropertiesContent(StyleGraphicPropertiesContent object) {
				return createStyleGraphicPropertiesContentAdapter();
			}
			@Override
			public Adapter caseStyleHeaderFooterPropertiesContent(StyleHeaderFooterPropertiesContent object) {
				return createStyleHeaderFooterPropertiesContentAdapter();
			}
			@Override
			public Adapter caseStyleListLevelPropertiesContent(StyleListLevelPropertiesContent object) {
				return createStyleListLevelPropertiesContentAdapter();
			}
			@Override
			public Adapter caseStylePageLayoutPropertiesContent(StylePageLayoutPropertiesContent object) {
				return createStylePageLayoutPropertiesContentAdapter();
			}
			@Override
			public Adapter caseStyleParagraphPropertiesContent(StyleParagraphPropertiesContent object) {
				return createStyleParagraphPropertiesContentAdapter();
			}
			@Override
			public Adapter caseStylePropertiesContent(StylePropertiesContent object) {
				return createStylePropertiesContentAdapter();
			}
			@Override
			public Adapter caseStyleRubyPropertiesContent(StyleRubyPropertiesContent object) {
				return createStyleRubyPropertiesContentAdapter();
			}
			@Override
			public Adapter caseStyleSectionPropertiesContent(StyleSectionPropertiesContent object) {
				return createStyleSectionPropertiesContentAdapter();
			}
			@Override
			public Adapter caseStyleStyleContent(StyleStyleContent object) {
				return createStyleStyleContentAdapter();
			}
			@Override
			public Adapter caseStyleTableCellPropertiesContent(StyleTableCellPropertiesContent object) {
				return createStyleTableCellPropertiesContentAdapter();
			}
			@Override
			public Adapter caseStyleTableColumnPropertiesContent(StyleTableColumnPropertiesContent object) {
				return createStyleTableColumnPropertiesContentAdapter();
			}
			@Override
			public Adapter caseStyleTablePropertiesContent(StyleTablePropertiesContent object) {
				return createStyleTablePropertiesContentAdapter();
			}
			@Override
			public Adapter caseStyleTableRowPropertiesContent(StyleTableRowPropertiesContent object) {
				return createStyleTableRowPropertiesContentAdapter();
			}
			@Override
			public Adapter caseStyleTextPropertiesContent(StyleTextPropertiesContent object) {
				return createStyleTextPropertiesContentAdapter();
			}
			@Override
			public Adapter caseSType(SType object) {
				return createSTypeAdapter();
			}
			@Override
			public Adapter caseSubjectType(SubjectType object) {
				return createSubjectTypeAdapter();
			}
			@Override
			public Adapter caseTableCountType(TableCountType object) {
				return createTableCountTypeAdapter();
			}
			@Override
			public Adapter caseTableFormulaType(TableFormulaType object) {
				return createTableFormulaTypeAdapter();
			}
			@Override
			public Adapter caseTableIndexSourceType(TableIndexSourceType object) {
				return createTableIndexSourceTypeAdapter();
			}
			@Override
			public Adapter caseTableIndexType(TableIndexType object) {
				return createTableIndexTypeAdapter();
			}
			@Override
			public Adapter caseTableOfContentEntryTemplateType(TableOfContentEntryTemplateType object) {
				return createTableOfContentEntryTemplateTypeAdapter();
			}
			@Override
			public Adapter caseTableOfContentSourceType(TableOfContentSourceType object) {
				return createTableOfContentSourceTypeAdapter();
			}
			@Override
			public Adapter caseTableOfContentType(TableOfContentType object) {
				return createTableOfContentTypeAdapter();
			}
			@Override
			public Adapter caseTableTableCellContent(TableTableCellContent object) {
				return createTableTableCellContentAdapter();
			}
			@Override
			public Adapter caseTabType(TabType object) {
				return createTabTypeAdapter();
			}
			@Override
			public Adapter caseTemplateNameType(TemplateNameType object) {
				return createTemplateNameTypeAdapter();
			}
			@Override
			public Adapter caseTextChangedRegionContent(TextChangedRegionContent object) {
				return createTextChangedRegionContentAdapter();
			}
			@Override
			public Adapter caseTextDatabaseDisplayAttlist(TextDatabaseDisplayAttlist object) {
				return createTextDatabaseDisplayAttlistAdapter();
			}
			@Override
			public Adapter caseTextDatabaseNextAttlist(TextDatabaseNextAttlist object) {
				return createTextDatabaseNextAttlistAdapter();
			}
			@Override
			public Adapter caseTextDatabaseRowSelectAttlist(TextDatabaseRowSelectAttlist object) {
				return createTextDatabaseRowSelectAttlistAdapter();
			}
			@Override
			public Adapter caseTextIllustrationIndexEntryContent(TextIllustrationIndexEntryContent object) {
				return createTextIllustrationIndexEntryContentAdapter();
			}
			@Override
			public Adapter caseTextInputType(TextInputType object) {
				return createTextInputTypeAdapter();
			}
			@Override
			public Adapter caseTextListItemContent(TextListItemContent object) {
				return createTextListItemContentAdapter();
			}
			@Override
			public Adapter caseTextListLevelStyleImageAttr(TextListLevelStyleImageAttr object) {
				return createTextListLevelStyleImageAttrAdapter();
			}
			@Override
			public Adapter caseTextNotesConfigurationContent(TextNotesConfigurationContent object) {
				return createTextNotesConfigurationContentAdapter();
			}
			@Override
			public Adapter caseTextSectionSourceDdeType(TextSectionSourceDdeType object) {
				return createTextSectionSourceDdeTypeAdapter();
			}
			@Override
			public Adapter caseTimeType(TimeType object) {
				return createTimeTypeAdapter();
			}
			@Override
			public Adapter caseTitleType(TitleType object) {
				return createTitleTypeAdapter();
			}
			@Override
			public Adapter caseTocMarkEndType(TocMarkEndType object) {
				return createTocMarkEndTypeAdapter();
			}
			@Override
			public Adapter caseTocMarkStartType(TocMarkStartType object) {
				return createTocMarkStartTypeAdapter();
			}
			@Override
			public Adapter caseTocMarkType(TocMarkType object) {
				return createTocMarkTypeAdapter();
			}
			@Override
			public Adapter caseTrackedChangesType(TrackedChangesType object) {
				return createTrackedChangesTypeAdapter();
			}
			@Override
			public Adapter caseUserDefinedType(UserDefinedType object) {
				return createUserDefinedTypeAdapter();
			}
			@Override
			public Adapter caseUserFieldDeclsType(UserFieldDeclsType object) {
				return createUserFieldDeclsTypeAdapter();
			}
			@Override
			public Adapter caseUserFieldDeclType(UserFieldDeclType object) {
				return createUserFieldDeclTypeAdapter();
			}
			@Override
			public Adapter caseUserFieldGetType(UserFieldGetType object) {
				return createUserFieldGetTypeAdapter();
			}
			@Override
			public Adapter caseUserFieldInputType(UserFieldInputType object) {
				return createUserFieldInputTypeAdapter();
			}
			@Override
			public Adapter caseUserIndexEntryTemplateType(UserIndexEntryTemplateType object) {
				return createUserIndexEntryTemplateTypeAdapter();
			}
			@Override
			public Adapter caseUserIndexMarkEndType(UserIndexMarkEndType object) {
				return createUserIndexMarkEndTypeAdapter();
			}
			@Override
			public Adapter caseUserIndexMarkStartType(UserIndexMarkStartType object) {
				return createUserIndexMarkStartTypeAdapter();
			}
			@Override
			public Adapter caseUserIndexMarkType(UserIndexMarkType object) {
				return createUserIndexMarkTypeAdapter();
			}
			@Override
			public Adapter caseUserIndexSourceType(UserIndexSourceType object) {
				return createUserIndexSourceTypeAdapter();
			}
			@Override
			public Adapter caseUserIndexType(UserIndexType object) {
				return createUserIndexTypeAdapter();
			}
			@Override
			public Adapter caseVariableDeclsType(VariableDeclsType object) {
				return createVariableDeclsTypeAdapter();
			}
			@Override
			public Adapter caseVariableDeclType(VariableDeclType object) {
				return createVariableDeclTypeAdapter();
			}
			@Override
			public Adapter caseVariableGetType(VariableGetType object) {
				return createVariableGetTypeAdapter();
			}
			@Override
			public Adapter caseVariableInputType(VariableInputType object) {
				return createVariableInputTypeAdapter();
			}
			@Override
			public Adapter caseVariableSetType(VariableSetType object) {
				return createVariableSetTypeAdapter();
			}
			@Override
			public Adapter caseWordCountType(WordCountType object) {
				return createWordCountTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexAutoMarkFileType <em>Alphabetical Index Auto Mark File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexAutoMarkFileType
	 * @generated
	 */
	public Adapter createAlphabeticalIndexAutoMarkFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexEntryTemplateType <em>Alphabetical Index Entry Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexEntryTemplateType
	 * @generated
	 */
	public Adapter createAlphabeticalIndexEntryTemplateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexMarkEndType <em>Alphabetical Index Mark End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexMarkEndType
	 * @generated
	 */
	public Adapter createAlphabeticalIndexMarkEndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexMarkStartType <em>Alphabetical Index Mark Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexMarkStartType
	 * @generated
	 */
	public Adapter createAlphabeticalIndexMarkStartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexMarkType <em>Alphabetical Index Mark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexMarkType
	 * @generated
	 */
	public Adapter createAlphabeticalIndexMarkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType <em>Alphabetical Index Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType
	 * @generated
	 */
	public Adapter createAlphabeticalIndexSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType <em>Alphabetical Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType
	 * @generated
	 */
	public Adapter createAlphabeticalIndexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AnyAttListOrElements <em>Any Att List Or Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AnyAttListOrElements
	 * @generated
	 */
	public Adapter createAnyAttListOrElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AType <em>AType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AType
	 * @generated
	 */
	public Adapter createATypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AuthorInitialsType <em>Author Initials Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AuthorInitialsType
	 * @generated
	 */
	public Adapter createAuthorInitialsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AuthorNameType <em>Author Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AuthorNameType
	 * @generated
	 */
	public Adapter createAuthorNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType <em>Bibliography Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType
	 * @generated
	 */
	public Adapter createBibliographyConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType <em>Bibliography Entry Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType
	 * @generated
	 */
	public Adapter createBibliographyEntryTemplateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyMarkType <em>Bibliography Mark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyMarkType
	 * @generated
	 */
	public Adapter createBibliographyMarkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographySourceType <em>Bibliography Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.BibliographySourceType
	 * @generated
	 */
	public Adapter createBibliographySourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyType <em>Bibliography Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyType
	 * @generated
	 */
	public Adapter createBibliographyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BookmarkEndType <em>Bookmark End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.BookmarkEndType
	 * @generated
	 */
	public Adapter createBookmarkEndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BookmarkRefType <em>Bookmark Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.BookmarkRefType
	 * @generated
	 */
	public Adapter createBookmarkRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BookmarkStartType <em>Bookmark Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.BookmarkStartType
	 * @generated
	 */
	public Adapter createBookmarkStartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BookmarkType <em>Bookmark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.BookmarkType
	 * @generated
	 */
	public Adapter createBookmarkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ChangedRegionType <em>Changed Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ChangedRegionType
	 * @generated
	 */
	public Adapter createChangedRegionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ChangeMarksType <em>Change Marks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ChangeMarksType
	 * @generated
	 */
	public Adapter createChangeMarksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ChapterType <em>Chapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ChapterType
	 * @generated
	 */
	public Adapter createChapterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.CharacterCountType <em>Character Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.CharacterCountType
	 * @generated
	 */
	public Adapter createCharacterCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.CommonFormControlContent <em>Common Form Control Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.CommonFormControlContent
	 * @generated
	 */
	public Adapter createCommonFormControlContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType <em>Conditional Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType
	 * @generated
	 */
	public Adapter createConditionalTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConfigItems <em>Config Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ConfigItems
	 * @generated
	 */
	public Adapter createConfigItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.CreationDateType <em>Creation Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.CreationDateType
	 * @generated
	 */
	public Adapter createCreationDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.CreationTimeType <em>Creation Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.CreationTimeType
	 * @generated
	 */
	public Adapter createCreationTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.CreatorType <em>Creator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.CreatorType
	 * @generated
	 */
	public Adapter createCreatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseNameType <em>Database Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseNameType
	 * @generated
	 */
	public Adapter createDatabaseNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType <em>Database Row Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.DatabaseRowNumberType
	 * @generated
	 */
	public Adapter createDatabaseRowNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.DateType
	 * @generated
	 */
	public Adapter createDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclsType <em>Dde Connection Decls Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclsType
	 * @generated
	 */
	public Adapter createDdeConnectionDeclsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclType <em>Dde Connection Decl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclType
	 * @generated
	 */
	public Adapter createDdeConnectionDeclTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionType <em>Dde Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionType
	 * @generated
	 */
	public Adapter createDdeConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DeletionType <em>Deletion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.DeletionType
	 * @generated
	 */
	public Adapter createDeletionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingCyclesType <em>Editing Cycles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.EditingCyclesType
	 * @generated
	 */
	public Adapter createEditingCyclesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingDurationType <em>Editing Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.EditingDurationType
	 * @generated
	 */
	public Adapter createEditingDurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ExecuteMacroType <em>Execute Macro Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ExecuteMacroType
	 * @generated
	 */
	public Adapter createExecuteMacroTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ExpressionType
	 * @generated
	 */
	public Adapter createExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.FileNameType <em>File Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FileNameType
	 * @generated
	 */
	public Adapter createFileNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormatChangeType <em>Format Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FormatChangeType
	 * @generated
	 */
	public Adapter createFormatChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList <em>Form Property Type And Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList
	 * @generated
	 */
	public Adapter createFormPropertyTypeAndValueListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent <em>Header Footer Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent
	 * @generated
	 */
	public Adapter createHeaderFooterContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HiddenParagraphType <em>Hidden Paragraph Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.HiddenParagraphType
	 * @generated
	 */
	public Adapter createHiddenParagraphTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HiddenTextType <em>Hidden Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.HiddenTextType
	 * @generated
	 */
	public Adapter createHiddenTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HType <em>HType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.HType
	 * @generated
	 */
	public Adapter createHTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType <em>Illustration Index Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType
	 * @generated
	 */
	public Adapter createIllustrationIndexSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexType <em>Illustration Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexType
	 * @generated
	 */
	public Adapter createIllustrationIndexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ImageCountType <em>Image Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ImageCountType
	 * @generated
	 */
	public Adapter createImageCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType <em>Index Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType
	 * @generated
	 */
	public Adapter createIndexBodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryBibliographyType <em>Index Entry Bibliography Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryBibliographyType
	 * @generated
	 */
	public Adapter createIndexEntryBibliographyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryChapterType <em>Index Entry Chapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryChapterType
	 * @generated
	 */
	public Adapter createIndexEntryChapterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryLinkEndType <em>Index Entry Link End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryLinkEndType
	 * @generated
	 */
	public Adapter createIndexEntryLinkEndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryLinkStartType <em>Index Entry Link Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryLinkStartType
	 * @generated
	 */
	public Adapter createIndexEntryLinkStartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryPageNumberType <em>Index Entry Page Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryPageNumberType
	 * @generated
	 */
	public Adapter createIndexEntryPageNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntrySpanType <em>Index Entry Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntrySpanType
	 * @generated
	 */
	public Adapter createIndexEntrySpanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryTabStopType <em>Index Entry Tab Stop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryTabStopType
	 * @generated
	 */
	public Adapter createIndexEntryTabStopTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryTextType <em>Index Entry Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryTextType
	 * @generated
	 */
	public Adapter createIndexEntryTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexSourceStylesType <em>Index Source Styles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexSourceStylesType
	 * @generated
	 */
	public Adapter createIndexSourceStylesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexSourceStyleType <em>Index Source Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexSourceStyleType
	 * @generated
	 */
	public Adapter createIndexSourceStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleTemplateType <em>Index Title Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleTemplateType
	 * @generated
	 */
	public Adapter createIndexTitleTemplateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleType <em>Index Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleType
	 * @generated
	 */
	public Adapter createIndexTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.InitialCreatorType <em>Initial Creator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.InitialCreatorType
	 * @generated
	 */
	public Adapter createInitialCreatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.InsertionType <em>Insertion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.InsertionType
	 * @generated
	 */
	public Adapter createInsertionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.KeywordsType <em>Keywords Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.KeywordsType
	 * @generated
	 */
	public Adapter createKeywordsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LineBreakType <em>Line Break Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LineBreakType
	 * @generated
	 */
	public Adapter createLineBreakTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType <em>Linenumbering Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType
	 * @generated
	 */
	public Adapter createLinenumberingConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingSeparatorType <em>Linenumbering Separator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingSeparatorType
	 * @generated
	 */
	public Adapter createLinenumberingSeparatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListItemType <em>List Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ListItemType
	 * @generated
	 */
	public Adapter createListItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType <em>List Level Style Bullet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleBulletType
	 * @generated
	 */
	public Adapter createListLevelStyleBulletTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleImageType <em>List Level Style Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleImageType
	 * @generated
	 */
	public Adapter createListLevelStyleImageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType <em>List Level Style Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ListLevelStyleNumberType
	 * @generated
	 */
	public Adapter createListLevelStyleNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListStyleType <em>List Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ListStyleType
	 * @generated
	 */
	public Adapter createListStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ListType
	 * @generated
	 */
	public Adapter createListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.MathMarkup <em>Math Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.MathMarkup
	 * @generated
	 */
	public Adapter createMathMarkupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.MeasureType
	 * @generated
	 */
	public Adapter createMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ModificationDateType <em>Modification Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ModificationDateType
	 * @generated
	 */
	public Adapter createModificationDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ModificationTimeType <em>Modification Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ModificationTimeType
	 * @generated
	 */
	public Adapter createModificationTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteBodyType <em>Note Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.NoteBodyType
	 * @generated
	 */
	public Adapter createNoteBodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteCitationType <em>Note Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.NoteCitationType
	 * @generated
	 */
	public Adapter createNoteCitationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType <em>Note Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.NoteRefType
	 * @generated
	 */
	public Adapter createNoteRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.NoteType
	 * @generated
	 */
	public Adapter createNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.NumberedParagraphType <em>Numbered Paragraph Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.NumberedParagraphType
	 * @generated
	 */
	public Adapter createNumberedParagraphTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectCountType <em>Object Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ObjectCountType
	 * @generated
	 */
	public Adapter createObjectCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType <em>Object Index Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType
	 * @generated
	 */
	public Adapter createObjectIndexSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexType <em>Object Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexType
	 * @generated
	 */
	public Adapter createObjectIndexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeBodyContent <em>Office Body Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.OfficeBodyContent
	 * @generated
	 */
	public Adapter createOfficeBodyContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType <em>Office Chart Content Main Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.OfficeChartContentMainType
	 * @generated
	 */
	public Adapter createOfficeChartContentMainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeImageContentMain <em>Office Image Content Main</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.OfficeImageContentMain
	 * @generated
	 */
	public Adapter createOfficeImageContentMainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeMeta <em>Office Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.OfficeMeta
	 * @generated
	 */
	public Adapter createOfficeMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OfficeMetaContent <em>Office Meta Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.OfficeMetaContent
	 * @generated
	 */
	public Adapter createOfficeMetaContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OutlineLevelStyleType <em>Outline Level Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.OutlineLevelStyleType
	 * @generated
	 */
	public Adapter createOutlineLevelStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.OutlineStyleType <em>Outline Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.OutlineStyleType
	 * @generated
	 */
	public Adapter createOutlineStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageContinuationType <em>Page Continuation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PageContinuationType
	 * @generated
	 */
	public Adapter createPageContinuationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageCountType <em>Page Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PageCountType
	 * @generated
	 */
	public Adapter createPageCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageNumberType <em>Page Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PageNumberType
	 * @generated
	 */
	public Adapter createPageNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageSequenceType <em>Page Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PageSequenceType
	 * @generated
	 */
	public Adapter createPageSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageType <em>Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PageType
	 * @generated
	 */
	public Adapter createPageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageVariableGetType <em>Page Variable Get Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PageVariableGetType
	 * @generated
	 */
	public Adapter createPageVariableGetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PageVariableSetType <em>Page Variable Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PageVariableSetType
	 * @generated
	 */
	public Adapter createPageVariableSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ParagraphCountType <em>Paragraph Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ParagraphCountType
	 * @generated
	 */
	public Adapter createParagraphCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderType <em>Placeholder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderType
	 * @generated
	 */
	public Adapter createPlaceholderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PrintDateType <em>Print Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PrintDateType
	 * @generated
	 */
	public Adapter createPrintDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PrintedByType <em>Printed By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PrintedByType
	 * @generated
	 */
	public Adapter createPrintedByTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PrintTimeType <em>Print Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PrintTimeType
	 * @generated
	 */
	public Adapter createPrintTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PType
	 * @generated
	 */
	public Adapter createPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceMarkEndType <em>Reference Mark End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceMarkEndType
	 * @generated
	 */
	public Adapter createReferenceMarkEndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceMarkStartType <em>Reference Mark Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceMarkStartType
	 * @generated
	 */
	public Adapter createReferenceMarkStartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceMarkType <em>Reference Mark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceMarkType
	 * @generated
	 */
	public Adapter createReferenceMarkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceRefType <em>Reference Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceRefType
	 * @generated
	 */
	public Adapter createReferenceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RegionContent <em>Region Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.RegionContent
	 * @generated
	 */
	public Adapter createRegionContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType <em>Ruby Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType
	 * @generated
	 */
	public Adapter createRubyBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyTextType <em>Ruby Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.RubyTextType
	 * @generated
	 */
	public Adapter createRubyTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyType <em>Ruby Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.RubyType
	 * @generated
	 */
	public Adapter createRubyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ScriptType
	 * @generated
	 */
	public Adapter createScriptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SectionSourceType <em>Section Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SectionSourceType
	 * @generated
	 */
	public Adapter createSectionSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SectionType <em>Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SectionType
	 * @generated
	 */
	public Adapter createSectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderCityType <em>Sender City Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderCityType
	 * @generated
	 */
	public Adapter createSenderCityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderCompanyType <em>Sender Company Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderCompanyType
	 * @generated
	 */
	public Adapter createSenderCompanyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderCountryType <em>Sender Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderCountryType
	 * @generated
	 */
	public Adapter createSenderCountryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderEmailType <em>Sender Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderEmailType
	 * @generated
	 */
	public Adapter createSenderEmailTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderFaxType <em>Sender Fax Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderFaxType
	 * @generated
	 */
	public Adapter createSenderFaxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderFirstnameType <em>Sender Firstname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderFirstnameType
	 * @generated
	 */
	public Adapter createSenderFirstnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderInitialsType <em>Sender Initials Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderInitialsType
	 * @generated
	 */
	public Adapter createSenderInitialsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderLastnameType <em>Sender Lastname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderLastnameType
	 * @generated
	 */
	public Adapter createSenderLastnameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderPhonePrivateType <em>Sender Phone Private Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderPhonePrivateType
	 * @generated
	 */
	public Adapter createSenderPhonePrivateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderPhoneWorkType <em>Sender Phone Work Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderPhoneWorkType
	 * @generated
	 */
	public Adapter createSenderPhoneWorkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderPositionType <em>Sender Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderPositionType
	 * @generated
	 */
	public Adapter createSenderPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderPostalCodeType <em>Sender Postal Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderPostalCodeType
	 * @generated
	 */
	public Adapter createSenderPostalCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderStateOrProvinceType <em>Sender State Or Province Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderStateOrProvinceType
	 * @generated
	 */
	public Adapter createSenderStateOrProvinceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderStreetType <em>Sender Street Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderStreetType
	 * @generated
	 */
	public Adapter createSenderStreetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SenderTitleType <em>Sender Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SenderTitleType
	 * @generated
	 */
	public Adapter createSenderTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclsType <em>Sequence Decls Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclsType
	 * @generated
	 */
	public Adapter createSequenceDeclsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclType <em>Sequence Decl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclType
	 * @generated
	 */
	public Adapter createSequenceDeclTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceRefType <em>Sequence Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SequenceRefType
	 * @generated
	 */
	public Adapter createSequenceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType <em>Soft Page Break Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType
	 * @generated
	 */
	public Adapter createSoftPageBreakTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType <em>Sort Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType
	 * @generated
	 */
	public Adapter createSortKeyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SpanType <em>Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SpanType
	 * @generated
	 */
	public Adapter createSpanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleChartPropertiesContent <em>Style Chart Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleChartPropertiesContent
	 * @generated
	 */
	public Adapter createStyleChartPropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleDrawingPagePropertiesContent <em>Style Drawing Page Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleDrawingPagePropertiesContent
	 * @generated
	 */
	public Adapter createStyleDrawingPagePropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleGraphicPropertiesContent <em>Style Graphic Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleGraphicPropertiesContent
	 * @generated
	 */
	public Adapter createStyleGraphicPropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleHeaderFooterPropertiesContent <em>Style Header Footer Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleHeaderFooterPropertiesContent
	 * @generated
	 */
	public Adapter createStyleHeaderFooterPropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleListLevelPropertiesContent <em>Style List Level Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleListLevelPropertiesContent
	 * @generated
	 */
	public Adapter createStyleListLevelPropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StylePageLayoutPropertiesContent <em>Style Page Layout Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StylePageLayoutPropertiesContent
	 * @generated
	 */
	public Adapter createStylePageLayoutPropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleParagraphPropertiesContent <em>Style Paragraph Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleParagraphPropertiesContent
	 * @generated
	 */
	public Adapter createStyleParagraphPropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StylePropertiesContent <em>Style Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StylePropertiesContent
	 * @generated
	 */
	public Adapter createStylePropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleRubyPropertiesContent <em>Style Ruby Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleRubyPropertiesContent
	 * @generated
	 */
	public Adapter createStyleRubyPropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleSectionPropertiesContent <em>Style Section Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleSectionPropertiesContent
	 * @generated
	 */
	public Adapter createStyleSectionPropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent <em>Style Style Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent
	 * @generated
	 */
	public Adapter createStyleStyleContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleTableCellPropertiesContent <em>Style Table Cell Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleTableCellPropertiesContent
	 * @generated
	 */
	public Adapter createStyleTableCellPropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleTableColumnPropertiesContent <em>Style Table Column Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleTableColumnPropertiesContent
	 * @generated
	 */
	public Adapter createStyleTableColumnPropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleTablePropertiesContent <em>Style Table Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleTablePropertiesContent
	 * @generated
	 */
	public Adapter createStyleTablePropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleTableRowPropertiesContent <em>Style Table Row Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleTableRowPropertiesContent
	 * @generated
	 */
	public Adapter createStyleTableRowPropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleTextPropertiesContent <em>Style Text Properties Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleTextPropertiesContent
	 * @generated
	 */
	public Adapter createStyleTextPropertiesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SType <em>SType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SType
	 * @generated
	 */
	public Adapter createSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SubjectType <em>Subject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.SubjectType
	 * @generated
	 */
	public Adapter createSubjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableCountType <em>Table Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableCountType
	 * @generated
	 */
	public Adapter createTableCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableFormulaType <em>Table Formula Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableFormulaType
	 * @generated
	 */
	public Adapter createTableFormulaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableIndexSourceType <em>Table Index Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableIndexSourceType
	 * @generated
	 */
	public Adapter createTableIndexSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableIndexType <em>Table Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableIndexType
	 * @generated
	 */
	public Adapter createTableIndexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentEntryTemplateType <em>Table Of Content Entry Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentEntryTemplateType
	 * @generated
	 */
	public Adapter createTableOfContentEntryTemplateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType <em>Table Of Content Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType
	 * @generated
	 */
	public Adapter createTableOfContentSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentType <em>Table Of Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentType
	 * @generated
	 */
	public Adapter createTableOfContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableTableCellContent <em>Table Table Cell Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TableTableCellContent
	 * @generated
	 */
	public Adapter createTableTableCellContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TabType <em>Tab Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TabType
	 * @generated
	 */
	public Adapter createTabTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TemplateNameType <em>Template Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TemplateNameType
	 * @generated
	 */
	public Adapter createTemplateNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextChangedRegionContent <em>Changed Region Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextChangedRegionContent
	 * @generated
	 */
	public Adapter createTextChangedRegionContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseDisplayAttlist <em>Database Display Attlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseDisplayAttlist
	 * @generated
	 */
	public Adapter createTextDatabaseDisplayAttlistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseNextAttlist <em>Database Next Attlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseNextAttlist
	 * @generated
	 */
	public Adapter createTextDatabaseNextAttlistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist <em>Database Row Select Attlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextDatabaseRowSelectAttlist
	 * @generated
	 */
	public Adapter createTextDatabaseRowSelectAttlistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextIllustrationIndexEntryContent <em>Illustration Index Entry Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextIllustrationIndexEntryContent
	 * @generated
	 */
	public Adapter createTextIllustrationIndexEntryContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextInputType
	 * @generated
	 */
	public Adapter createTextInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextListItemContent <em>List Item Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextListItemContent
	 * @generated
	 */
	public Adapter createTextListItemContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextListLevelStyleImageAttr <em>List Level Style Image Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextListLevelStyleImageAttr
	 * @generated
	 */
	public Adapter createTextListLevelStyleImageAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent <em>Notes Configuration Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent
	 * @generated
	 */
	public Adapter createTextNotesConfigurationContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType <em>Section Source Dde Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType
	 * @generated
	 */
	public Adapter createTextSectionSourceDdeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TimeType
	 * @generated
	 */
	public Adapter createTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TitleType
	 * @generated
	 */
	public Adapter createTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkEndType <em>Toc Mark End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkEndType
	 * @generated
	 */
	public Adapter createTocMarkEndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkStartType <em>Toc Mark Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkStartType
	 * @generated
	 */
	public Adapter createTocMarkStartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkType <em>Toc Mark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TocMarkType
	 * @generated
	 */
	public Adapter createTocMarkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TrackedChangesType <em>Tracked Changes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TrackedChangesType
	 * @generated
	 */
	public Adapter createTrackedChangesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserDefinedType <em>User Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.UserDefinedType
	 * @generated
	 */
	public Adapter createUserDefinedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclsType <em>User Field Decls Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclsType
	 * @generated
	 */
	public Adapter createUserFieldDeclsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclType <em>User Field Decl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclType
	 * @generated
	 */
	public Adapter createUserFieldDeclTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldGetType <em>User Field Get Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldGetType
	 * @generated
	 */
	public Adapter createUserFieldGetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldInputType <em>User Field Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldInputType
	 * @generated
	 */
	public Adapter createUserFieldInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType <em>User Index Entry Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType
	 * @generated
	 */
	public Adapter createUserIndexEntryTemplateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexMarkEndType <em>User Index Mark End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexMarkEndType
	 * @generated
	 */
	public Adapter createUserIndexMarkEndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexMarkStartType <em>User Index Mark Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexMarkStartType
	 * @generated
	 */
	public Adapter createUserIndexMarkStartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexMarkType <em>User Index Mark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexMarkType
	 * @generated
	 */
	public Adapter createUserIndexMarkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType <em>User Index Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType
	 * @generated
	 */
	public Adapter createUserIndexSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexType <em>User Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexType
	 * @generated
	 */
	public Adapter createUserIndexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.VariableDeclsType <em>Variable Decls Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.VariableDeclsType
	 * @generated
	 */
	public Adapter createVariableDeclsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.VariableDeclType <em>Variable Decl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.VariableDeclType
	 * @generated
	 */
	public Adapter createVariableDeclTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.VariableGetType <em>Variable Get Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.VariableGetType
	 * @generated
	 */
	public Adapter createVariableGetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.VariableInputType <em>Variable Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.VariableInputType
	 * @generated
	 */
	public Adapter createVariableInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.VariableSetType <em>Variable Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.VariableSetType
	 * @generated
	 */
	public Adapter createVariableSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.WordCountType <em>Word Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.WordCountType
	 * @generated
	 */
	public Adapter createWordCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TextAdapterFactory
