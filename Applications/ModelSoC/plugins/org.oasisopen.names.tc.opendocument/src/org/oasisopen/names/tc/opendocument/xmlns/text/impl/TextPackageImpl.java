/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage;
import org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigPackage;
import org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage;
import org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage;
import org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.script.ScriptPackage;
import org.oasisopen.names.tc.opendocument.xmlns.script.impl.ScriptPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage;
import org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage;
import org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextFactory;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.util.TextValidator;
import org.purl.dc.elements.dc.DCPackage;
import org.purl.dc.elements.dc.impl.DCPackageImpl;
import org.w3.math.ml.mathml.MathMLPackage;
import org.w3.math.ml.mathml.impl.MathMLPackageImpl;
import org.w3.xforms.XFormsPackage;
import org.w3.xforms.impl.XFormsPackageImpl;
import org.w3.xlink.XLinkPackage;
import org.w3.xlink.impl.XLinkPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextPackageImpl extends EPackageImpl implements TextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "text.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphabeticalIndexAutoMarkFileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphabeticalIndexEntryTemplateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphabeticalIndexMarkEndTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphabeticalIndexMarkStartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphabeticalIndexMarkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphabeticalIndexSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alphabeticalIndexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyAttListOrElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorInitialsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliographyConfigurationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliographyEntryTemplateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliographyMarkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliographySourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliographyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookmarkEndTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookmarkRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookmarkStartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookmarkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changedRegionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeMarksTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chapterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterCountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonFormControlContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseRowNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddeConnectionDeclsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddeConnectionDeclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddeConnectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editingCyclesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editingDurationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executeMacroTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatChangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formPropertyTypeAndValueListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerFooterContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hiddenParagraphTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hiddenTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass illustrationIndexSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass illustrationIndexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageCountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexBodyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEntryBibliographyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEntryChapterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEntryLinkEndTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEntryLinkStartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEntryPageNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEntrySpanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEntryTabStopTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEntryTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexSourceStylesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexSourceStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexTitleTemplateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexTitleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialCreatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineBreakTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linenumberingConfigurationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linenumberingSeparatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listLevelStyleBulletTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listLevelStyleImageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listLevelStyleNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mathMarkupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modificationDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modificationTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteBodyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteCitationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberedParagraphTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectCountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIndexSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIndexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass officeBodyContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass officeChartContentMainTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass officeImageContentMainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass officeMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass officeMetaContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outlineLevelStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outlineStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageContinuationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageCountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageSequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageVariableGetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageVariableSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphCountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeholderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printedByTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceMarkEndTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceMarkStartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceMarkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rubyBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rubyTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rubyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderCityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderCompanyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderCountryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderEmailTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderFaxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderFirstnameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderInitialsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderLastnameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderPhonePrivateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderPhoneWorkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderPositionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderPostalCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderStateOrProvinceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderStreetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderTitleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceDeclsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceDeclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softPageBreakTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortKeyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleChartPropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleDrawingPagePropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleGraphicPropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleHeaderFooterPropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleListLevelPropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylePageLayoutPropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleParagraphPropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylePropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleRubyPropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleSectionPropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleStyleContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleTableCellPropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleTableColumnPropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleTablePropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleTableRowPropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleTextPropertiesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableFormulaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableIndexSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableIndexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableOfContentEntryTemplateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableOfContentSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableOfContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTableCellContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textChangedRegionContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textDatabaseDisplayAttlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textDatabaseNextAttlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textDatabaseRowSelectAttlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textIllustrationIndexEntryContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textListItemContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textListLevelStyleImageAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textNotesConfigurationContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textSectionSourceDdeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tocMarkEndTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tocMarkStartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tocMarkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackedChangesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userFieldDeclsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userFieldDeclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userFieldGetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userFieldInputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userIndexEntryTemplateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userIndexMarkEndTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userIndexMarkStartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userIndexMarkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userIndexSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userIndexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableGetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableInputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wordCountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum anchorTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bibliographyDataFieldTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum captionSequenceFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum customShapeTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayType3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayType4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayType5EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayType6EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayType7EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontFamilyGenericEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontPitchEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontVariantEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontWeightEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum footnotesPositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gradientStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum horiBackPosEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum horizontalMirrorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indexScopeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indexScopeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineWidthMember3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineWidthMember4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineWidthMember5EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineWidthMember6EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineWidthMember7EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineWidthMember8EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineWidthMember9EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum navigationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noteClassTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberPositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum outlineLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placeholderTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationClassesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationEffectDirectionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationEffectsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationSpeedsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceFormatType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rowOrColEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selectPageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selectPageType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shadowTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum startNumberingAtTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tabCyclesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tableTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tableVisibilityValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetFrameNameMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetFrameNameMember2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetFrameNameMember3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetFrameNameMember4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textBibliographyTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vertBackPosEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anchorTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anyURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType base64BinaryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bibliographyDataFieldTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType borderWidthsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType borderWidthsBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType borderWidthsBaseItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType captionSequenceFormatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cellAddressEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cellRangeAddressEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cellRangeAddressListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType characterEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType citationBodyStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType citationBodyStyleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType citationStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType citationStyleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType condStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType condStyleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coordinateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countryCodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType customShapeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType customShapeTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateOrDateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType defaultStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType defaultStyleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType displayTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType displayTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType displayTypeObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType displayTypeObject3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType displayTypeObject4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType displayTypeObject5EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType displayTypeObject6EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType displayTypeObject7EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType distanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontFamilyGenericObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontPitchObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontStyleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontVariantObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontWeightObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType footnotesPositionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType formulaEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gradientStyleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType horiBackPosObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType horizontalMirrorObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idrefEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idrefsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType indexScopeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType indexScopeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType keyTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType languageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType languageCodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineModeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineStyleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineWidthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineWidthMember3ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineWidthMember4ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineWidthMember5ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineWidthMember6ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineWidthMember7ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineWidthMember8ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineWidthMember9ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mainEntryStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mainEntryStyleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType masterPageNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType masterPageNameType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType masterPageNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType masterPageNameTypeMember11EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType namespacedTokenEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType navigationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeLengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativePixelLengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType noteClassTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberPositionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outlineLevelTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType paragraphStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType paragraphStyleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pathDataEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType placeholderTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType point3DEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveLengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType presentationClassesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType presentationEffectDirectionsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType presentationEffectsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType presentationSpeedsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referenceFormatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referenceFormatTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relativeLengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rowOrColObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType selectPageTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType selectPageTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shadowTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shadowTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType startNumberingAtTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameRefEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameRefsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType5EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType6EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType7EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType8EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType9EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType10EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType11EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType12EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType13EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType14EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType15EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType16EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType17EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType18EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType19EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType20EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType21EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType22EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType23EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType24EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameType25EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember11EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember12EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember13EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember14EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember15EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember16EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember17EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember18EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember19EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember110EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember111EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember112EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember113EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember114EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember115EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember116EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember117EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember118EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember119EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember120EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember121EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember122EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember123EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember124EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember125EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tabCyclesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tableTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tableVisibilityValueObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType targetFrameNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType targetFrameNameMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType targetFrameNameMember2ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType targetFrameNameMember3ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType targetFrameNameMember4ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textBibliographyTypesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textEncodingEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeOrDateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valueTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType variableNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vector3DEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vertBackPosObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType visitedStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType visitedStyleNameTypeMember1EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TextPackageImpl() {
		super(eNS_URI, TextFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static TextPackage init() {
		if (isInited) return (TextPackage)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI);

		// Obtain or create and register package
		TextPackageImpl theTextPackage = (TextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DrawingPackageImpl theDrawingPackage = (DrawingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI) instanceof DrawingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI) : DrawingPackage.eINSTANCE);
		OfficePackageImpl theOfficePackage = (OfficePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OfficePackage.eNS_URI) instanceof OfficePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OfficePackage.eNS_URI) : OfficePackage.eINSTANCE);
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) instanceof ScriptPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) : ScriptPackage.eINSTANCE);
		XLinkPackageImpl theXLinkPackage = (XLinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI) instanceof XLinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI) : XLinkPackage.eINSTANCE);
		PresentationPackageImpl thePresentationPackage = (PresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) instanceof PresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) : PresentationPackage.eINSTANCE);
		SvgPackageImpl theSvgPackage = (SvgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI) instanceof SvgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI) : SvgPackage.eINSTANCE);
		Dr3dPackageImpl theDr3dPackage = (Dr3dPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Dr3dPackage.eNS_URI) instanceof Dr3dPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Dr3dPackage.eNS_URI) : Dr3dPackage.eINSTANCE);
		StylePackageImpl theStylePackage = (StylePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) instanceof StylePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) : StylePackage.eINSTANCE);
		FormPackageImpl theFormPackage = (FormPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI) instanceof FormPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI) : FormPackage.eINSTANCE);
		TablePackageImpl theTablePackage = (TablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) instanceof TablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) : TablePackage.eINSTANCE);
		FoPackageImpl theFoPackage = (FoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FoPackage.eNS_URI) instanceof FoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FoPackage.eNS_URI) : FoPackage.eINSTANCE);
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) instanceof ConfigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) : ConfigPackage.eINSTANCE);
		DatastylePackageImpl theDatastylePackage = (DatastylePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatastylePackage.eNS_URI) instanceof DatastylePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatastylePackage.eNS_URI) : DatastylePackage.eINSTANCE);
		AnimationPackageImpl theAnimationPackage = (AnimationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnimationPackage.eNS_URI) instanceof AnimationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnimationPackage.eNS_URI) : AnimationPackage.eINSTANCE);
		CompatiblePackageImpl theCompatiblePackage = (CompatiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompatiblePackage.eNS_URI) instanceof CompatiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompatiblePackage.eNS_URI) : CompatiblePackage.eINSTANCE);
		MetaPackageImpl theMetaPackage = (MetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI) instanceof MetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI) : MetaPackage.eINSTANCE);
		ChartPackageImpl theChartPackage = (ChartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChartPackage.eNS_URI) instanceof ChartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChartPackage.eNS_URI) : ChartPackage.eINSTANCE);
		DCPackageImpl theDCPackage = (DCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI) instanceof DCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI) : DCPackage.eINSTANCE);
		MathMLPackageImpl theMathMLPackage = (MathMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MathMLPackage.eNS_URI) instanceof MathMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MathMLPackage.eNS_URI) : MathMLPackage.eINSTANCE);
		XFormsPackageImpl theXFormsPackage = (XFormsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XFormsPackage.eNS_URI) instanceof XFormsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XFormsPackage.eNS_URI) : XFormsPackage.eINSTANCE);

		// Load packages
		theTextPackage.loadPackage();
		theDrawingPackage.loadPackage();
		theStylePackage.loadPackage();
		theFormPackage.loadPackage();
		theTablePackage.loadPackage();

		// Create package meta-data objects
		theOfficePackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theXLinkPackage.createPackageContents();
		thePresentationPackage.createPackageContents();
		theSvgPackage.createPackageContents();
		theDr3dPackage.createPackageContents();
		theFoPackage.createPackageContents();
		theConfigPackage.createPackageContents();
		theDatastylePackage.createPackageContents();
		theAnimationPackage.createPackageContents();
		theCompatiblePackage.createPackageContents();
		theMetaPackage.createPackageContents();
		theChartPackage.createPackageContents();
		theDCPackage.createPackageContents();
		theMathMLPackage.createPackageContents();
		theXFormsPackage.createPackageContents();

		// Initialize created meta-data
		theOfficePackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theXLinkPackage.initializePackageContents();
		thePresentationPackage.initializePackageContents();
		theSvgPackage.initializePackageContents();
		theDr3dPackage.initializePackageContents();
		theFoPackage.initializePackageContents();
		theConfigPackage.initializePackageContents();
		theDatastylePackage.initializePackageContents();
		theAnimationPackage.initializePackageContents();
		theCompatiblePackage.initializePackageContents();
		theMetaPackage.initializePackageContents();
		theChartPackage.initializePackageContents();
		theDCPackage.initializePackageContents();
		theMathMLPackage.initializePackageContents();
		theXFormsPackage.initializePackageContents();

		// Fix loaded packages
		theTextPackage.fixPackageContents();
		theDrawingPackage.fixPackageContents();
		theStylePackage.fixPackageContents();
		theFormPackage.fixPackageContents();
		theTablePackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTextPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TextValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTextPackage.freeze();

		return theTextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphabeticalIndexAutoMarkFileType() {
		if (alphabeticalIndexAutoMarkFileTypeEClass == null) {
			alphabeticalIndexAutoMarkFileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(0);
		}
		return alphabeticalIndexAutoMarkFileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexAutoMarkFileType_Href() {
        return (EAttribute)getAlphabeticalIndexAutoMarkFileType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexAutoMarkFileType_Type() {
        return (EAttribute)getAlphabeticalIndexAutoMarkFileType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphabeticalIndexEntryTemplateType() {
		if (alphabeticalIndexEntryTemplateTypeEClass == null) {
			alphabeticalIndexEntryTemplateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(1);
		}
		return alphabeticalIndexEntryTemplateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexEntryTemplateType_Group() {
        return (EAttribute)getAlphabeticalIndexEntryTemplateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphabeticalIndexEntryTemplateType_IndexEntryChapter() {
        return (EReference)getAlphabeticalIndexEntryTemplateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphabeticalIndexEntryTemplateType_IndexEntryPageNumber() {
        return (EReference)getAlphabeticalIndexEntryTemplateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphabeticalIndexEntryTemplateType_IndexEntryText() {
        return (EReference)getAlphabeticalIndexEntryTemplateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphabeticalIndexEntryTemplateType_IndexEntrySpan() {
        return (EReference)getAlphabeticalIndexEntryTemplateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphabeticalIndexEntryTemplateType_IndexEntryTabStop() {
        return (EReference)getAlphabeticalIndexEntryTemplateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexEntryTemplateType_OutlineLevel() {
        return (EAttribute)getAlphabeticalIndexEntryTemplateType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexEntryTemplateType_StyleName() {
        return (EAttribute)getAlphabeticalIndexEntryTemplateType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphabeticalIndexMarkEndType() {
		if (alphabeticalIndexMarkEndTypeEClass == null) {
			alphabeticalIndexMarkEndTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(2);
		}
		return alphabeticalIndexMarkEndTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkEndType_Id() {
        return (EAttribute)getAlphabeticalIndexMarkEndType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphabeticalIndexMarkStartType() {
		if (alphabeticalIndexMarkStartTypeEClass == null) {
			alphabeticalIndexMarkStartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(3);
		}
		return alphabeticalIndexMarkStartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkStartType_Id() {
        return (EAttribute)getAlphabeticalIndexMarkStartType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkStartType_Key1() {
        return (EAttribute)getAlphabeticalIndexMarkStartType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkStartType_Key1Phonetic() {
        return (EAttribute)getAlphabeticalIndexMarkStartType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkStartType_Key2() {
        return (EAttribute)getAlphabeticalIndexMarkStartType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkStartType_Key2Phonetic() {
        return (EAttribute)getAlphabeticalIndexMarkStartType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkStartType_MainEntry() {
        return (EAttribute)getAlphabeticalIndexMarkStartType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkStartType_StringValuePhonetic() {
        return (EAttribute)getAlphabeticalIndexMarkStartType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphabeticalIndexMarkType() {
		if (alphabeticalIndexMarkTypeEClass == null) {
			alphabeticalIndexMarkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(4);
		}
		return alphabeticalIndexMarkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkType_Key1() {
        return (EAttribute)getAlphabeticalIndexMarkType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkType_Key1Phonetic() {
        return (EAttribute)getAlphabeticalIndexMarkType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkType_Key2() {
        return (EAttribute)getAlphabeticalIndexMarkType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkType_Key2Phonetic() {
        return (EAttribute)getAlphabeticalIndexMarkType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkType_MainEntry() {
        return (EAttribute)getAlphabeticalIndexMarkType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkType_StringValue() {
        return (EAttribute)getAlphabeticalIndexMarkType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexMarkType_StringValuePhonetic() {
        return (EAttribute)getAlphabeticalIndexMarkType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphabeticalIndexSourceType() {
		if (alphabeticalIndexSourceTypeEClass == null) {
			alphabeticalIndexSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(5);
		}
		return alphabeticalIndexSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphabeticalIndexSourceType_IndexTitleTemplate() {
        return (EReference)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphabeticalIndexSourceType_AlphabeticalIndexEntryTemplate() {
        return (EReference)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_AlphabeticalSeparators() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_CapitalizeEntries() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_CombineEntries() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_CombineEntriesWithDash() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_CombineEntriesWithPp() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_CommaSeparated() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_Country() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_IgnoreCase() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_IndexScope() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_Language() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_MainEntryStyleName() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_RelativeTabStopPosition() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_SortAlgorithm() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexSourceType_UseKeysAsEntries() {
        return (EAttribute)getAlphabeticalIndexSourceType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlphabeticalIndexType() {
		if (alphabeticalIndexTypeEClass == null) {
			alphabeticalIndexTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(6);
		}
		return alphabeticalIndexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphabeticalIndexType_AlphabeticalIndexSource() {
        return (EReference)getAlphabeticalIndexType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlphabeticalIndexType_IndexBody() {
        return (EReference)getAlphabeticalIndexType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexType_Name() {
        return (EAttribute)getAlphabeticalIndexType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexType_Protected() {
        return (EAttribute)getAlphabeticalIndexType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexType_ProtectionKey() {
        return (EAttribute)getAlphabeticalIndexType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlphabeticalIndexType_StyleName() {
        return (EAttribute)getAlphabeticalIndexType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyAttListOrElements() {
		if (anyAttListOrElementsEClass == null) {
			anyAttListOrElementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(9);
		}
		return anyAttListOrElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyAttListOrElements_Any() {
        return (EAttribute)getAnyAttListOrElements().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyAttListOrElements_AnyAttribute() {
        return (EAttribute)getAnyAttListOrElements().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAType() {
		if (aTypeEClass == null) {
			aTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(11);
		}
		return aTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Mixed() {
        return (EAttribute)getAType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_EventListeners() {
        return (EReference)getAType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Group() {
        return (EAttribute)getAType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_S() {
        return (EReference)getAType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Tab() {
        return (EReference)getAType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_LineBreak() {
        return (EReference)getAType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SoftPageBreak() {
        return (EReference)getAType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Span() {
        return (EReference)getAType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_A() {
        return (EReference)getAType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Bookmark() {
        return (EReference)getAType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_BookmarkStart() {
        return (EReference)getAType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_BookmarkEnd() {
        return (EReference)getAType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_ReferenceMark() {
        return (EReference)getAType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_ReferenceMarkStart() {
        return (EReference)getAType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_ReferenceMarkEnd() {
        return (EReference)getAType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Note() {
        return (EReference)getAType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Ruby() {
        return (EReference)getAType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Annotation() {
        return (EReference)getAType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_ChangeMarksGroup() {
        return (EAttribute)getAType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_ChangeMarks() {
        return (EReference)getAType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Rect() {
        return (EReference)getAType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Line() {
        return (EReference)getAType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Polyline() {
        return (EReference)getAType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Polygon() {
        return (EReference)getAType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_RegularPolygon() {
        return (EReference)getAType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Path() {
        return (EReference)getAType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Circle() {
        return (EReference)getAType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Ellipse() {
        return (EReference)getAType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_G() {
        return (EReference)getAType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_PageThumbnail() {
        return (EReference)getAType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Frame() {
        return (EReference)getAType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Measure() {
        return (EReference)getAType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Caption() {
        return (EReference)getAType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Connector() {
        return (EReference)getAType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Control() {
        return (EReference)getAType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Scene() {
        return (EReference)getAType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_CustomShape() {
        return (EReference)getAType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_A1() {
        return (EReference)getAType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Date() {
        return (EReference)getAType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Time() {
        return (EReference)getAType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_PageNumber() {
        return (EReference)getAType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_PageContinuation() {
        return (EReference)getAType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderFirstname() {
        return (EReference)getAType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderLastname() {
        return (EReference)getAType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderInitials() {
        return (EReference)getAType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderTitle() {
        return (EReference)getAType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderPosition() {
        return (EReference)getAType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderEmail() {
        return (EReference)getAType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderPhonePrivate() {
        return (EReference)getAType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderFax() {
        return (EReference)getAType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderCompany() {
        return (EReference)getAType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderPhoneWork() {
        return (EReference)getAType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderStreet() {
        return (EReference)getAType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderCity() {
        return (EReference)getAType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderPostalCode() {
        return (EReference)getAType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderCountry() {
        return (EReference)getAType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SenderStateOrProvince() {
        return (EReference)getAType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_AuthorName() {
        return (EReference)getAType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_AuthorInitials() {
        return (EReference)getAType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Chapter() {
        return (EReference)getAType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_FileName() {
        return (EReference)getAType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_TemplateName() {
        return (EReference)getAType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_SheetName() {
        return (EAttribute)getAType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_VariableSet() {
        return (EReference)getAType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_VariableGet() {
        return (EReference)getAType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_VariableInput() {
        return (EReference)getAType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_UserFieldGet() {
        return (EReference)getAType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_UserFieldInput() {
        return (EReference)getAType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Sequence() {
        return (EReference)getAType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Expression() {
        return (EReference)getAType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_TextInput() {
        return (EReference)getAType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_InitialCreator() {
        return (EReference)getAType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_CreationDate() {
        return (EReference)getAType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_CreationTime() {
        return (EReference)getAType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Description() {
        return (EReference)getAType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_UserDefined() {
        return (EReference)getAType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_PrintTime() {
        return (EReference)getAType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_PrintDate() {
        return (EReference)getAType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_PrintedBy() {
        return (EReference)getAType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Title() {
        return (EReference)getAType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Subject() {
        return (EReference)getAType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Keywords() {
        return (EReference)getAType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_EditingCycles() {
        return (EReference)getAType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_EditingDuration() {
        return (EReference)getAType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_ModificationTime() {
        return (EReference)getAType().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_ModificationDate() {
        return (EReference)getAType().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Creator() {
        return (EReference)getAType().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_PageCount() {
        return (EReference)getAType().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_ParagraphCount() {
        return (EReference)getAType().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_WordCount() {
        return (EReference)getAType().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_CharacterCount() {
        return (EReference)getAType().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_TableCount() {
        return (EReference)getAType().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_ImageCount() {
        return (EReference)getAType().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_ObjectCount() {
        return (EReference)getAType().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_DatabaseDisplay() {
        return (EReference)getAType().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_DatabaseNext() {
        return (EReference)getAType().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_DatabaseRowSelect() {
        return (EReference)getAType().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_DatabaseRowNumber() {
        return (EReference)getAType().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_DatabaseName() {
        return (EReference)getAType().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_PageVariableSet() {
        return (EReference)getAType().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_PageVariableGet() {
        return (EReference)getAType().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Placeholder() {
        return (EReference)getAType().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_ConditionalText() {
        return (EReference)getAType().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_HiddenText() {
        return (EReference)getAType().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_ReferenceRef() {
        return (EReference)getAType().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_BookmarkRef() {
        return (EReference)getAType().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_NoteRef() {
        return (EReference)getAType().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_SequenceRef() {
        return (EReference)getAType().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Script() {
        return (EReference)getAType().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_ExecuteMacro() {
        return (EReference)getAType().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_HiddenParagraph() {
        return (EReference)getAType().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_DdeConnection() {
        return (EReference)getAType().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Measure1() {
        return (EReference)getAType().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_TableFormula() {
        return (EReference)getAType().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_TocMarkStart() {
        return (EReference)getAType().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_TocMarkEnd() {
        return (EReference)getAType().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_TocMark() {
        return (EReference)getAType().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_UserIndexMarkStart() {
        return (EReference)getAType().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_UserIndexMarkEnd() {
        return (EReference)getAType().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_UserIndexMark() {
        return (EReference)getAType().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_AlphabeticalIndexMarkStart() {
        return (EReference)getAType().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_AlphabeticalIndexMarkEnd() {
        return (EReference)getAType().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_AlphabeticalIndexMark() {
        return (EReference)getAType().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_BibliographyMark() {
        return (EReference)getAType().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Header() {
        return (EReference)getAType().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Footer() {
        return (EReference)getAType().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_DateTime() {
        return (EReference)getAType().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Actuate() {
        return (EAttribute)getAType().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Href() {
        return (EAttribute)getAType().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Name() {
        return (EAttribute)getAType().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Show() {
        return (EAttribute)getAType().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_StyleName() {
        return (EAttribute)getAType().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_TargetFrameName() {
        return (EAttribute)getAType().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Title1() {
        return (EAttribute)getAType().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Type() {
        return (EAttribute)getAType().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_VisitedStyleName() {
        return (EAttribute)getAType().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorInitialsType() {
		if (authorInitialsTypeEClass == null) {
			authorInitialsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(12);
		}
		return authorInitialsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorInitialsType_Mixed() {
        return (EAttribute)getAuthorInitialsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorInitialsType_Fixed() {
        return (EAttribute)getAuthorInitialsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorNameType() {
		if (authorNameTypeEClass == null) {
			authorNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(13);
		}
		return authorNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorNameType_Mixed() {
        return (EAttribute)getAuthorNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorNameType_Fixed() {
        return (EAttribute)getAuthorNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBibliographyConfigurationType() {
		if (bibliographyConfigurationTypeEClass == null) {
			bibliographyConfigurationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(15);
		}
		return bibliographyConfigurationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBibliographyConfigurationType_SortKey() {
        return (EReference)getBibliographyConfigurationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyConfigurationType_Country() {
        return (EAttribute)getBibliographyConfigurationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyConfigurationType_Language() {
        return (EAttribute)getBibliographyConfigurationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyConfigurationType_NumberedEntries() {
        return (EAttribute)getBibliographyConfigurationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyConfigurationType_Prefix() {
        return (EAttribute)getBibliographyConfigurationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyConfigurationType_SortAlgorithm() {
        return (EAttribute)getBibliographyConfigurationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyConfigurationType_SortByPosition() {
        return (EAttribute)getBibliographyConfigurationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyConfigurationType_Suffix() {
        return (EAttribute)getBibliographyConfigurationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBibliographyEntryTemplateType() {
		if (bibliographyEntryTemplateTypeEClass == null) {
			bibliographyEntryTemplateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(18);
		}
		return bibliographyEntryTemplateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyEntryTemplateType_Group() {
        return (EAttribute)getBibliographyEntryTemplateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBibliographyEntryTemplateType_IndexEntrySpan() {
        return (EReference)getBibliographyEntryTemplateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBibliographyEntryTemplateType_IndexEntryTabStop() {
        return (EReference)getBibliographyEntryTemplateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBibliographyEntryTemplateType_IndexEntryBibliography() {
        return (EReference)getBibliographyEntryTemplateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyEntryTemplateType_BibliographyType() {
        return (EAttribute)getBibliographyEntryTemplateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyEntryTemplateType_StyleName() {
        return (EAttribute)getBibliographyEntryTemplateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBibliographyMarkType() {
		if (bibliographyMarkTypeEClass == null) {
			bibliographyMarkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(19);
		}
		return bibliographyMarkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Mixed() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Address() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Annote() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Author() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_BibliographyType() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Booktitle() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Chapter() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Custom1() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Custom2() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Custom3() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Custom4() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Custom5() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Edition() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Editor() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Howpublished() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Identifier() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Institution() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Isbn() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Issn() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Journal() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Month() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Note() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Number() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Organizations() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Pages() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Publisher() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_ReportType() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_School() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Series() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Title() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Url() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Volume() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyMarkType_Year() {
        return (EAttribute)getBibliographyMarkType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBibliographySourceType() {
		if (bibliographySourceTypeEClass == null) {
			bibliographySourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(20);
		}
		return bibliographySourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBibliographySourceType_IndexTitleTemplate() {
        return (EReference)getBibliographySourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBibliographySourceType_BibliographyEntryTemplate() {
        return (EReference)getBibliographySourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBibliographyType() {
		if (bibliographyTypeEClass == null) {
			bibliographyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(21);
		}
		return bibliographyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBibliographyType_BibliographySource() {
        return (EReference)getBibliographyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBibliographyType_IndexBody() {
        return (EReference)getBibliographyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyType_Name() {
        return (EAttribute)getBibliographyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyType_Protected() {
        return (EAttribute)getBibliographyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyType_ProtectionKey() {
        return (EAttribute)getBibliographyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBibliographyType_StyleName() {
        return (EAttribute)getBibliographyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookmarkEndType() {
		if (bookmarkEndTypeEClass == null) {
			bookmarkEndTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(22);
		}
		return bookmarkEndTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookmarkEndType_Name() {
        return (EAttribute)getBookmarkEndType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookmarkRefType() {
		if (bookmarkRefTypeEClass == null) {
			bookmarkRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(23);
		}
		return bookmarkRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookmarkRefType_Mixed() {
        return (EAttribute)getBookmarkRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookmarkRefType_ReferenceFormat() {
        return (EAttribute)getBookmarkRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookmarkRefType_RefName() {
        return (EAttribute)getBookmarkRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookmarkStartType() {
		if (bookmarkStartTypeEClass == null) {
			bookmarkStartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(24);
		}
		return bookmarkStartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookmarkStartType_Name() {
        return (EAttribute)getBookmarkStartType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookmarkType() {
		if (bookmarkTypeEClass == null) {
			bookmarkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(25);
		}
		return bookmarkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookmarkType_Name() {
        return (EAttribute)getBookmarkType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangedRegionType() {
		if (changedRegionTypeEClass == null) {
			changedRegionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(36);
		}
		return changedRegionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangedRegionType_Id() {
        return (EAttribute)getChangedRegionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeMarksType() {
		if (changeMarksTypeEClass == null) {
			changeMarksTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(37);
		}
		return changeMarksTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeMarksType_ChangeId() {
        return (EAttribute)getChangeMarksType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChapterType() {
		if (chapterTypeEClass == null) {
			chapterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(38);
		}
		return chapterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChapterType_Mixed() {
        return (EAttribute)getChapterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChapterType_Display() {
        return (EAttribute)getChapterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChapterType_OutlineLevel() {
        return (EAttribute)getChapterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterCountType() {
		if (characterCountTypeEClass == null) {
			characterCountTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(40);
		}
		return characterCountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterCountType_Mixed() {
        return (EAttribute)getCharacterCountType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterCountType_NumFormat() {
        return (EAttribute)getCharacterCountType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterCountType_NumLetterSync() {
        return (EAttribute)getCharacterCountType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonFormControlContent() {
		if (commonFormControlContentEClass == null) {
			commonFormControlContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(46);
		}
		return commonFormControlContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonFormControlContent_Properties() {
        return (EReference)getCommonFormControlContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonFormControlContent_EventListeners() {
        return (EReference)getCommonFormControlContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalTextType() {
		if (conditionalTextTypeEClass == null) {
			conditionalTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(47);
		}
		return conditionalTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalTextType_Mixed() {
        return (EAttribute)getConditionalTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalTextType_Condition() {
        return (EAttribute)getConditionalTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalTextType_CurrentValue() {
        return (EAttribute)getConditionalTextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalTextType_StringValueIfFalse() {
        return (EAttribute)getConditionalTextType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalTextType_StringValueIfTrue() {
        return (EAttribute)getConditionalTextType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigItems() {
		if (configItemsEClass == null) {
			configItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(50);
		}
		return configItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigItems_Group() {
        return (EAttribute)getConfigItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigItems_ConfigItem() {
        return (EReference)getConfigItems().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigItems_ConfigItemSet() {
        return (EReference)getConfigItems().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigItems_ConfigItemMapNamed() {
        return (EReference)getConfigItems().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigItems_ConfigItemMapIndexed() {
        return (EReference)getConfigItems().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreationDateType() {
		if (creationDateTypeEClass == null) {
			creationDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(53);
		}
		return creationDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationDateType_Mixed() {
        return (EAttribute)getCreationDateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationDateType_DataStyleName() {
        return (EAttribute)getCreationDateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationDateType_DateValue() {
        return (EAttribute)getCreationDateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationDateType_Fixed() {
        return (EAttribute)getCreationDateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreationTimeType() {
		if (creationTimeTypeEClass == null) {
			creationTimeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(54);
		}
		return creationTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationTimeType_Mixed() {
        return (EAttribute)getCreationTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationTimeType_DataStyleName() {
        return (EAttribute)getCreationTimeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationTimeType_Fixed() {
        return (EAttribute)getCreationTimeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreationTimeType_TimeValue() {
        return (EAttribute)getCreationTimeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreatorType() {
		if (creatorTypeEClass == null) {
			creatorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(55);
		}
		return creatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreatorType_Mixed() {
        return (EAttribute)getCreatorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreatorType_Fixed() {
        return (EAttribute)getCreatorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseNameType() {
		if (databaseNameTypeEClass == null) {
			databaseNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(59);
		}
		return databaseNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseNameType_Mixed() {
        return (EAttribute)getDatabaseNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseNameType_ConnectionResource() {
        return (EReference)getDatabaseNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseNameType_DatabaseName() {
        return (EAttribute)getDatabaseNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseNameType_TableName() {
        return (EAttribute)getDatabaseNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseNameType_TableType() {
        return (EAttribute)getDatabaseNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseRowNumberType() {
		if (databaseRowNumberTypeEClass == null) {
			databaseRowNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(60);
		}
		return databaseRowNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseRowNumberType_Mixed() {
        return (EAttribute)getDatabaseRowNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseRowNumberType_ConnectionResource() {
        return (EReference)getDatabaseRowNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseRowNumberType_DatabaseName() {
        return (EAttribute)getDatabaseRowNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseRowNumberType_NumFormat() {
        return (EAttribute)getDatabaseRowNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseRowNumberType_NumLetterSync() {
        return (EAttribute)getDatabaseRowNumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseRowNumberType_TableName() {
        return (EAttribute)getDatabaseRowNumberType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseRowNumberType_TableType() {
        return (EAttribute)getDatabaseRowNumberType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseRowNumberType_Value() {
        return (EAttribute)getDatabaseRowNumberType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateType() {
		if (dateTypeEClass == null) {
			dateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(64);
		}
		return dateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Mixed() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_DataStyleName() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_DateAdjust() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_DateValue() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Fixed() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdeConnectionDeclsType() {
		if (ddeConnectionDeclsTypeEClass == null) {
			ddeConnectionDeclsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(65);
		}
		return ddeConnectionDeclsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdeConnectionDeclsType_DdeConnectionDecl() {
        return (EReference)getDdeConnectionDeclsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdeConnectionDeclType() {
		if (ddeConnectionDeclTypeEClass == null) {
			ddeConnectionDeclTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(66);
		}
		return ddeConnectionDeclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdeConnectionDeclType_AutomaticUpdate() {
        return (EAttribute)getDdeConnectionDeclType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdeConnectionDeclType_DdeApplication() {
        return (EAttribute)getDdeConnectionDeclType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdeConnectionDeclType_DdeItem() {
        return (EAttribute)getDdeConnectionDeclType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdeConnectionDeclType_DdeTopic() {
        return (EAttribute)getDdeConnectionDeclType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdeConnectionDeclType_Name() {
        return (EAttribute)getDdeConnectionDeclType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdeConnectionType() {
		if (ddeConnectionTypeEClass == null) {
			ddeConnectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(67);
		}
		return ddeConnectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdeConnectionType_Mixed() {
        return (EAttribute)getDdeConnectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdeConnectionType_ConnectionName() {
        return (EAttribute)getDdeConnectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletionType() {
		if (deletionTypeEClass == null) {
			deletionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(70);
		}
		return deletionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_ChangeInfo() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletionType_TextContent() {
        return (EAttribute)getDeletionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_H() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_P() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_List() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_NumberedParagraph() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Table() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_A() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Section() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_SoftPageBreak() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_TableOfContent() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_IllustrationIndex() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_TableIndex() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_ObjectIndex() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_UserIndex() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_AlphabeticalIndex() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Bibliography() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Rect() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Line() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Polyline() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Polygon() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_RegularPolygon() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Path() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Circle() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Ellipse() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_G() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_PageThumbnail() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Frame() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Measure() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Caption() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Connector() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Control() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_Scene() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_CustomShape() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletionType_ChangeMarksGroup() {
        return (EAttribute)getDeletionType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletionType_ChangeMarks() {
        return (EReference)getDeletionType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionType() {
		if (descriptionTypeEClass == null) {
			descriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(71);
		}
		return descriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionType_Mixed() {
        return (EAttribute)getDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionType_Fixed() {
        return (EAttribute)getDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditingCyclesType() {
		if (editingCyclesTypeEClass == null) {
			editingCyclesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(92);
		}
		return editingCyclesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditingCyclesType_Mixed() {
        return (EAttribute)getEditingCyclesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditingCyclesType_Fixed() {
        return (EAttribute)getEditingCyclesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditingDurationType() {
		if (editingDurationTypeEClass == null) {
			editingDurationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(93);
		}
		return editingDurationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditingDurationType_Mixed() {
        return (EAttribute)getEditingDurationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditingDurationType_DataStyleName() {
        return (EAttribute)getEditingDurationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditingDurationType_Duration() {
        return (EAttribute)getEditingDurationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditingDurationType_Fixed() {
        return (EAttribute)getEditingDurationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecuteMacroType() {
		if (executeMacroTypeEClass == null) {
			executeMacroTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(94);
		}
		return executeMacroTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecuteMacroType_Mixed() {
        return (EAttribute)getExecuteMacroType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecuteMacroType_EventListeners() {
        return (EReference)getExecuteMacroType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecuteMacroType_Name() {
        return (EAttribute)getExecuteMacroType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionType() {
		if (expressionTypeEClass == null) {
			expressionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(95);
		}
		return expressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionType_Mixed() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionType_BooleanValue() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionType_Currency() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionType_DataStyleName() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionType_DateValue() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionType_Display() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionType_Formula() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionType_StringValue() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionType_TimeValue() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionType_Value() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionType_ValueType() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileNameType() {
		if (fileNameTypeEClass == null) {
			fileNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(96);
		}
		return fileNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileNameType_Mixed() {
        return (EAttribute)getFileNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileNameType_Display() {
        return (EAttribute)getFileNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileNameType_Fixed() {
        return (EAttribute)getFileNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormatChangeType() {
		if (formatChangeTypeEClass == null) {
			formatChangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(109);
		}
		return formatChangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormatChangeType_ChangeInfo() {
        return (EReference)getFormatChangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormPropertyTypeAndValueList() {
		if (formPropertyTypeAndValueListEClass == null) {
			formPropertyTypeAndValueListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(110);
		}
		return formPropertyTypeAndValueListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormPropertyTypeAndValueList_ListValue() {
        return (EAttribute)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormPropertyTypeAndValueList_ListValue1() {
        return (EReference)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormPropertyTypeAndValueList_ListValue2() {
        return (EAttribute)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormPropertyTypeAndValueList_ListValue3() {
        return (EReference)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormPropertyTypeAndValueList_ListValue11() {
        return (EAttribute)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormPropertyTypeAndValueList_ListValue4() {
        return (EReference)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormPropertyTypeAndValueList_ListValue21() {
        return (EAttribute)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormPropertyTypeAndValueList_ListValue5() {
        return (EReference)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormPropertyTypeAndValueList_ListValue31() {
        return (EAttribute)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormPropertyTypeAndValueList_ListValue6() {
        return (EReference)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormPropertyTypeAndValueList_ListValue41() {
        return (EAttribute)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormPropertyTypeAndValueList_ListValue7() {
        return (EReference)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormPropertyTypeAndValueList_ListValue51() {
        return (EAttribute)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormPropertyTypeAndValueList_ListValue8() {
        return (EReference)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormPropertyTypeAndValueList_ValueType() {
        return (EAttribute)getFormPropertyTypeAndValueList().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderFooterContent() {
		if (headerFooterContentEClass == null) {
			headerFooterContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(114);
		}
		return headerFooterContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_TrackedChanges() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_VariableDecls() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_SequenceDecls() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_UserFieldDecls() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_DdeConnectionDecls() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_AlphabeticalIndexAutoMarkFile() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderFooterContent_Group() {
        return (EAttribute)getHeaderFooterContent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_H() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_P() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_List() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_Table() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_Section() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_TableOfContent() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_IllustrationIndex() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_TableIndex() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_ObjectIndex() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_UserIndex() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_AlphabeticalIndex() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_Bibliography() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_IndexTitle() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderFooterContent_ChangeMarksGroup() {
        return (EAttribute)getHeaderFooterContent().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_ChangeMarks() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_RegionLeft() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_RegionCenter() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderFooterContent_RegionRight() {
        return (EReference)getHeaderFooterContent().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHiddenParagraphType() {
		if (hiddenParagraphTypeEClass == null) {
			hiddenParagraphTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(115);
		}
		return hiddenParagraphTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHiddenParagraphType_Mixed() {
        return (EAttribute)getHiddenParagraphType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHiddenParagraphType_Condition() {
        return (EAttribute)getHiddenParagraphType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHiddenParagraphType_IsHidden() {
        return (EAttribute)getHiddenParagraphType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHiddenTextType() {
		if (hiddenTextTypeEClass == null) {
			hiddenTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(116);
		}
		return hiddenTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHiddenTextType_Mixed() {
        return (EAttribute)getHiddenTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHiddenTextType_Condition() {
        return (EAttribute)getHiddenTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHiddenTextType_IsHidden() {
        return (EAttribute)getHiddenTextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHiddenTextType_StringValue() {
        return (EAttribute)getHiddenTextType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHType() {
		if (hTypeEClass == null) {
			hTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(121);
		}
		return hTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_Mixed() {
        return (EAttribute)getHType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_Number() {
        return (EAttribute)getHType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_Group() {
        return (EAttribute)getHType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_S() {
        return (EReference)getHType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Tab() {
        return (EReference)getHType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_LineBreak() {
        return (EReference)getHType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SoftPageBreak() {
        return (EReference)getHType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Span() {
        return (EReference)getHType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_A() {
        return (EReference)getHType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Bookmark() {
        return (EReference)getHType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_BookmarkStart() {
        return (EReference)getHType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_BookmarkEnd() {
        return (EReference)getHType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_ReferenceMark() {
        return (EReference)getHType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_ReferenceMarkStart() {
        return (EReference)getHType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_ReferenceMarkEnd() {
        return (EReference)getHType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Note() {
        return (EReference)getHType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Ruby() {
        return (EReference)getHType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Annotation() {
        return (EReference)getHType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_ChangeMarksGroup() {
        return (EAttribute)getHType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_ChangeMarks() {
        return (EReference)getHType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Rect() {
        return (EReference)getHType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Line() {
        return (EReference)getHType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Polyline() {
        return (EReference)getHType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Polygon() {
        return (EReference)getHType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_RegularPolygon() {
        return (EReference)getHType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Path() {
        return (EReference)getHType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Circle() {
        return (EReference)getHType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Ellipse() {
        return (EReference)getHType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_G() {
        return (EReference)getHType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_PageThumbnail() {
        return (EReference)getHType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Frame() {
        return (EReference)getHType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Measure() {
        return (EReference)getHType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Caption() {
        return (EReference)getHType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Connector() {
        return (EReference)getHType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Control() {
        return (EReference)getHType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Scene() {
        return (EReference)getHType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_CustomShape() {
        return (EReference)getHType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_A1() {
        return (EReference)getHType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Date() {
        return (EReference)getHType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Time() {
        return (EReference)getHType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_PageNumber() {
        return (EReference)getHType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_PageContinuation() {
        return (EReference)getHType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderFirstname() {
        return (EReference)getHType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderLastname() {
        return (EReference)getHType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderInitials() {
        return (EReference)getHType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderTitle() {
        return (EReference)getHType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderPosition() {
        return (EReference)getHType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderEmail() {
        return (EReference)getHType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderPhonePrivate() {
        return (EReference)getHType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderFax() {
        return (EReference)getHType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderCompany() {
        return (EReference)getHType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderPhoneWork() {
        return (EReference)getHType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderStreet() {
        return (EReference)getHType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderCity() {
        return (EReference)getHType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderPostalCode() {
        return (EReference)getHType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderCountry() {
        return (EReference)getHType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SenderStateOrProvince() {
        return (EReference)getHType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_AuthorName() {
        return (EReference)getHType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_AuthorInitials() {
        return (EReference)getHType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Chapter() {
        return (EReference)getHType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_FileName() {
        return (EReference)getHType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_TemplateName() {
        return (EReference)getHType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_SheetName() {
        return (EAttribute)getHType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_VariableSet() {
        return (EReference)getHType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_VariableGet() {
        return (EReference)getHType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_VariableInput() {
        return (EReference)getHType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_UserFieldGet() {
        return (EReference)getHType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_UserFieldInput() {
        return (EReference)getHType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Sequence() {
        return (EReference)getHType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Expression() {
        return (EReference)getHType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_TextInput() {
        return (EReference)getHType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_InitialCreator() {
        return (EReference)getHType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_CreationDate() {
        return (EReference)getHType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_CreationTime() {
        return (EReference)getHType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Description() {
        return (EReference)getHType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_UserDefined() {
        return (EReference)getHType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_PrintTime() {
        return (EReference)getHType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_PrintDate() {
        return (EReference)getHType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_PrintedBy() {
        return (EReference)getHType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Title() {
        return (EReference)getHType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Subject() {
        return (EReference)getHType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Keywords() {
        return (EReference)getHType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_EditingCycles() {
        return (EReference)getHType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_EditingDuration() {
        return (EReference)getHType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_ModificationTime() {
        return (EReference)getHType().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_ModificationDate() {
        return (EReference)getHType().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Creator() {
        return (EReference)getHType().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_PageCount() {
        return (EReference)getHType().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_ParagraphCount() {
        return (EReference)getHType().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_WordCount() {
        return (EReference)getHType().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_CharacterCount() {
        return (EReference)getHType().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_TableCount() {
        return (EReference)getHType().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_ImageCount() {
        return (EReference)getHType().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_ObjectCount() {
        return (EReference)getHType().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_DatabaseDisplay() {
        return (EReference)getHType().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_DatabaseNext() {
        return (EReference)getHType().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_DatabaseRowSelect() {
        return (EReference)getHType().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_DatabaseRowNumber() {
        return (EReference)getHType().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_DatabaseName() {
        return (EReference)getHType().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_PageVariableSet() {
        return (EReference)getHType().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_PageVariableGet() {
        return (EReference)getHType().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Placeholder() {
        return (EReference)getHType().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_ConditionalText() {
        return (EReference)getHType().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_HiddenText() {
        return (EReference)getHType().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_ReferenceRef() {
        return (EReference)getHType().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_BookmarkRef() {
        return (EReference)getHType().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_NoteRef() {
        return (EReference)getHType().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_SequenceRef() {
        return (EReference)getHType().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Script() {
        return (EReference)getHType().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_ExecuteMacro() {
        return (EReference)getHType().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_HiddenParagraph() {
        return (EReference)getHType().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_DdeConnection() {
        return (EReference)getHType().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Measure1() {
        return (EReference)getHType().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_TableFormula() {
        return (EReference)getHType().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_TocMarkStart() {
        return (EReference)getHType().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_TocMarkEnd() {
        return (EReference)getHType().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_TocMark() {
        return (EReference)getHType().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_UserIndexMarkStart() {
        return (EReference)getHType().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_UserIndexMarkEnd() {
        return (EReference)getHType().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_UserIndexMark() {
        return (EReference)getHType().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_AlphabeticalIndexMarkStart() {
        return (EReference)getHType().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_AlphabeticalIndexMarkEnd() {
        return (EReference)getHType().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_AlphabeticalIndexMark() {
        return (EReference)getHType().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_BibliographyMark() {
        return (EReference)getHType().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Header() {
        return (EReference)getHType().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_Footer() {
        return (EReference)getHType().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHType_DateTime() {
        return (EReference)getHType().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_ClassNames() {
        return (EAttribute)getHType().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_CondStyleName() {
        return (EAttribute)getHType().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_Id() {
        return (EAttribute)getHType().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_IsListHeader() {
        return (EAttribute)getHType().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_OutlineLevel() {
        return (EAttribute)getHType().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_RestartNumbering() {
        return (EAttribute)getHType().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_StartValue() {
        return (EAttribute)getHType().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHType_StyleName() {
        return (EAttribute)getHType().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIllustrationIndexSourceType() {
		if (illustrationIndexSourceTypeEClass == null) {
			illustrationIndexSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(125);
		}
		return illustrationIndexSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIllustrationIndexSourceType_IndexTitleTemplate() {
        return (EReference)getIllustrationIndexSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIllustrationIndexSourceType_IllustrationIndexEntryTemplate() {
        return (EReference)getIllustrationIndexSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIllustrationIndexSourceType_CaptionSequenceFormat() {
        return (EAttribute)getIllustrationIndexSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIllustrationIndexSourceType_CaptionSequenceName() {
        return (EAttribute)getIllustrationIndexSourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIllustrationIndexSourceType_IndexScope() {
        return (EAttribute)getIllustrationIndexSourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIllustrationIndexSourceType_RelativeTabStopPosition() {
        return (EAttribute)getIllustrationIndexSourceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIllustrationIndexSourceType_UseCaption() {
        return (EAttribute)getIllustrationIndexSourceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIllustrationIndexType() {
		if (illustrationIndexTypeEClass == null) {
			illustrationIndexTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(126);
		}
		return illustrationIndexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIllustrationIndexType_IllustrationIndexSource() {
        return (EReference)getIllustrationIndexType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIllustrationIndexType_IndexBody() {
        return (EReference)getIllustrationIndexType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIllustrationIndexType_Name() {
        return (EAttribute)getIllustrationIndexType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIllustrationIndexType_Protected() {
        return (EAttribute)getIllustrationIndexType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIllustrationIndexType_ProtectionKey() {
        return (EAttribute)getIllustrationIndexType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIllustrationIndexType_StyleName() {
        return (EAttribute)getIllustrationIndexType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageCountType() {
		if (imageCountTypeEClass == null) {
			imageCountTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(127);
		}
		return imageCountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCountType_Mixed() {
        return (EAttribute)getImageCountType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCountType_NumFormat() {
        return (EAttribute)getImageCountType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageCountType_NumLetterSync() {
        return (EAttribute)getImageCountType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexBodyType() {
		if (indexBodyTypeEClass == null) {
			indexBodyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(128);
		}
		return indexBodyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexBodyType_IndexContentMain() {
        return (EAttribute)getIndexBodyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_H() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_P() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_List() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_NumberedParagraph() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Table() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_A() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Section() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_SoftPageBreak() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_TableOfContent() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_IllustrationIndex() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_TableIndex() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_ObjectIndex() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_UserIndex() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_AlphabeticalIndex() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Bibliography() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Rect() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Line() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Polyline() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Polygon() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_RegularPolygon() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Path() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Circle() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Ellipse() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_G() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_PageThumbnail() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Frame() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Measure() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Caption() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Connector() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Control() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_Scene() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_CustomShape() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexBodyType_ChangeMarksGroup() {
        return (EAttribute)getIndexBodyType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_ChangeMarks() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBodyType_IndexTitle() {
        return (EReference)getIndexBodyType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexEntryBibliographyType() {
		if (indexEntryBibliographyTypeEClass == null) {
			indexEntryBibliographyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(129);
		}
		return indexEntryBibliographyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntryBibliographyType_BibliographyDataField() {
        return (EAttribute)getIndexEntryBibliographyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntryBibliographyType_StyleName() {
        return (EAttribute)getIndexEntryBibliographyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexEntryChapterType() {
		if (indexEntryChapterTypeEClass == null) {
			indexEntryChapterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(130);
		}
		return indexEntryChapterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntryChapterType_Display() {
        return (EAttribute)getIndexEntryChapterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntryChapterType_StyleName() {
        return (EAttribute)getIndexEntryChapterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexEntryLinkEndType() {
		if (indexEntryLinkEndTypeEClass == null) {
			indexEntryLinkEndTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(131);
		}
		return indexEntryLinkEndTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntryLinkEndType_StyleName() {
        return (EAttribute)getIndexEntryLinkEndType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexEntryLinkStartType() {
		if (indexEntryLinkStartTypeEClass == null) {
			indexEntryLinkStartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(132);
		}
		return indexEntryLinkStartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntryLinkStartType_StyleName() {
        return (EAttribute)getIndexEntryLinkStartType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexEntryPageNumberType() {
		if (indexEntryPageNumberTypeEClass == null) {
			indexEntryPageNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(133);
		}
		return indexEntryPageNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntryPageNumberType_StyleName() {
        return (EAttribute)getIndexEntryPageNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexEntrySpanType() {
		if (indexEntrySpanTypeEClass == null) {
			indexEntrySpanTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(134);
		}
		return indexEntrySpanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntrySpanType_Mixed() {
        return (EAttribute)getIndexEntrySpanType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntrySpanType_StyleName() {
        return (EAttribute)getIndexEntrySpanType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexEntryTabStopType() {
		if (indexEntryTabStopTypeEClass == null) {
			indexEntryTabStopTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(135);
		}
		return indexEntryTabStopTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntryTabStopType_LeaderChar() {
        return (EAttribute)getIndexEntryTabStopType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntryTabStopType_Position() {
        return (EAttribute)getIndexEntryTabStopType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntryTabStopType_StyleName() {
        return (EAttribute)getIndexEntryTabStopType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntryTabStopType_Type() {
        return (EAttribute)getIndexEntryTabStopType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexEntryTextType() {
		if (indexEntryTextTypeEClass == null) {
			indexEntryTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(136);
		}
		return indexEntryTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexEntryTextType_StyleName() {
        return (EAttribute)getIndexEntryTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexSourceStylesType() {
		if (indexSourceStylesTypeEClass == null) {
			indexSourceStylesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(141);
		}
		return indexSourceStylesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexSourceStylesType_IndexSourceStyle() {
        return (EReference)getIndexSourceStylesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexSourceStylesType_OutlineLevel() {
        return (EAttribute)getIndexSourceStylesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexSourceStyleType() {
		if (indexSourceStyleTypeEClass == null) {
			indexSourceStyleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(142);
		}
		return indexSourceStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexSourceStyleType_StyleName() {
        return (EAttribute)getIndexSourceStyleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexTitleTemplateType() {
		if (indexTitleTemplateTypeEClass == null) {
			indexTitleTemplateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(143);
		}
		return indexTitleTemplateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexTitleTemplateType_Mixed() {
        return (EAttribute)getIndexTitleTemplateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexTitleTemplateType_StyleName() {
        return (EAttribute)getIndexTitleTemplateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexTitleType() {
		if (indexTitleTypeEClass == null) {
			indexTitleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(144);
		}
		return indexTitleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexTitleType_IndexContentMain() {
        return (EAttribute)getIndexTitleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_H() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_P() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_List() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_NumberedParagraph() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Table() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_A() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Section() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_SoftPageBreak() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_TableOfContent() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_IllustrationIndex() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_TableIndex() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_ObjectIndex() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_UserIndex() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_AlphabeticalIndex() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Bibliography() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Rect() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Line() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Polyline() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Polygon() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_RegularPolygon() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Path() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Circle() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Ellipse() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_G() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_PageThumbnail() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Frame() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Measure() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Caption() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Connector() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Control() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_Scene() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_CustomShape() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexTitleType_ChangeMarksGroup() {
        return (EAttribute)getIndexTitleType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_ChangeMarks() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexTitleType_IndexTitle() {
        return (EReference)getIndexTitleType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexTitleType_Name() {
        return (EAttribute)getIndexTitleType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexTitleType_Protected() {
        return (EAttribute)getIndexTitleType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexTitleType_ProtectionKey() {
        return (EAttribute)getIndexTitleType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexTitleType_StyleName() {
        return (EAttribute)getIndexTitleType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialCreatorType() {
		if (initialCreatorTypeEClass == null) {
			initialCreatorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(145);
		}
		return initialCreatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialCreatorType_Mixed() {
        return (EAttribute)getInitialCreatorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialCreatorType_Fixed() {
        return (EAttribute)getInitialCreatorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertionType() {
		if (insertionTypeEClass == null) {
			insertionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(146);
		}
		return insertionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionType_ChangeInfo() {
        return (EReference)getInsertionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeywordsType() {
		if (keywordsTypeEClass == null) {
			keywordsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(150);
		}
		return keywordsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeywordsType_Mixed() {
        return (EAttribute)getKeywordsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeywordsType_Fixed() {
        return (EAttribute)getKeywordsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineBreakType() {
		if (lineBreakTypeEClass == null) {
			lineBreakTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(156);
		}
		return lineBreakTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinenumberingConfigurationType() {
		if (linenumberingConfigurationTypeEClass == null) {
			linenumberingConfigurationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(159);
		}
		return linenumberingConfigurationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinenumberingConfigurationType_LinenumberingSeparator() {
        return (EReference)getLinenumberingConfigurationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinenumberingConfigurationType_CountEmptyLines() {
        return (EAttribute)getLinenumberingConfigurationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinenumberingConfigurationType_CountInTextBoxes() {
        return (EAttribute)getLinenumberingConfigurationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinenumberingConfigurationType_Increment() {
        return (EAttribute)getLinenumberingConfigurationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinenumberingConfigurationType_NumberLines() {
        return (EAttribute)getLinenumberingConfigurationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinenumberingConfigurationType_NumberPosition() {
        return (EAttribute)getLinenumberingConfigurationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinenumberingConfigurationType_NumFormat() {
        return (EAttribute)getLinenumberingConfigurationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinenumberingConfigurationType_NumLetterSync() {
        return (EAttribute)getLinenumberingConfigurationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinenumberingConfigurationType_Offset() {
        return (EAttribute)getLinenumberingConfigurationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinenumberingConfigurationType_RestartOnPage() {
        return (EAttribute)getLinenumberingConfigurationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinenumberingConfigurationType_StyleName() {
        return (EAttribute)getLinenumberingConfigurationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinenumberingSeparatorType() {
		if (linenumberingSeparatorTypeEClass == null) {
			linenumberingSeparatorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(160);
		}
		return linenumberingSeparatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinenumberingSeparatorType_Mixed() {
        return (EAttribute)getLinenumberingSeparatorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinenumberingSeparatorType_Increment() {
        return (EAttribute)getLinenumberingSeparatorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItemType() {
		if (listItemTypeEClass == null) {
			listItemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(180);
		}
		return listItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListItemType_StartValue() {
        return (EAttribute)getListItemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListLevelStyleBulletType() {
		if (listLevelStyleBulletTypeEClass == null) {
			listLevelStyleBulletTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(181);
		}
		return listLevelStyleBulletTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListLevelStyleBulletType_ListLevelProperties() {
        return (EReference)getListLevelStyleBulletType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListLevelStyleBulletType_TextProperties() {
        return (EReference)getListLevelStyleBulletType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleBulletType_BulletChar() {
        return (EAttribute)getListLevelStyleBulletType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleBulletType_BulletRelativeSize() {
        return (EAttribute)getListLevelStyleBulletType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleBulletType_Level() {
        return (EAttribute)getListLevelStyleBulletType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleBulletType_NumPrefix() {
        return (EAttribute)getListLevelStyleBulletType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleBulletType_NumSuffix() {
        return (EAttribute)getListLevelStyleBulletType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleBulletType_StyleName() {
        return (EAttribute)getListLevelStyleBulletType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListLevelStyleImageType() {
		if (listLevelStyleImageTypeEClass == null) {
			listLevelStyleImageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(182);
		}
		return listLevelStyleImageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListLevelStyleImageType_ListLevelProperties() {
        return (EReference)getListLevelStyleImageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleImageType_Level() {
        return (EAttribute)getListLevelStyleImageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListLevelStyleNumberType() {
		if (listLevelStyleNumberTypeEClass == null) {
			listLevelStyleNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(183);
		}
		return listLevelStyleNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListLevelStyleNumberType_ListLevelProperties() {
        return (EReference)getListLevelStyleNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListLevelStyleNumberType_TextProperties() {
        return (EReference)getListLevelStyleNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleNumberType_DisplayLevels() {
        return (EAttribute)getListLevelStyleNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleNumberType_Level() {
        return (EAttribute)getListLevelStyleNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleNumberType_NumFormat() {
        return (EAttribute)getListLevelStyleNumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleNumberType_NumLetterSync() {
        return (EAttribute)getListLevelStyleNumberType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleNumberType_NumPrefix() {
        return (EAttribute)getListLevelStyleNumberType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleNumberType_NumSuffix() {
        return (EAttribute)getListLevelStyleNumberType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleNumberType_StartValue() {
        return (EAttribute)getListLevelStyleNumberType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListLevelStyleNumberType_StyleName() {
        return (EAttribute)getListLevelStyleNumberType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListStyleType() {
		if (listStyleTypeEClass == null) {
			listStyleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(184);
		}
		return listStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyleType_TextListStyleContentGroup() {
        return (EAttribute)getListStyleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListStyleType_TextListStyleContent() {
        return (EReference)getListStyleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyleType_ConsecutiveNumbering() {
        return (EAttribute)getListStyleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyleType_DisplayName() {
        return (EAttribute)getListStyleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyleType_Name() {
        return (EAttribute)getListStyleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListType() {
		if (listTypeEClass == null) {
			listTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(185);
		}
		return listTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListType_ListHeader() {
        return (EReference)getListType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListType_ListItem() {
        return (EReference)getListType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListType_ContinueNumbering() {
        return (EAttribute)getListType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListType_StyleName() {
        return (EAttribute)getListType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMathMarkup() {
		if (mathMarkupEClass == null) {
			mathMarkupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(192);
		}
		return mathMarkupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMathMarkup_Mixed() {
        return (EAttribute)getMathMarkup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMathMarkup_Any() {
        return (EAttribute)getMathMarkup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMathMarkup_AnyAttribute() {
        return (EAttribute)getMathMarkup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureType() {
		if (measureTypeEClass == null) {
			measureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(193);
		}
		return measureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Mixed() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Kind() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModificationDateType() {
		if (modificationDateTypeEClass == null) {
			modificationDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(194);
		}
		return modificationDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationDateType_Mixed() {
        return (EAttribute)getModificationDateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationDateType_DataStyleName() {
        return (EAttribute)getModificationDateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationDateType_DateValue() {
        return (EAttribute)getModificationDateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationDateType_Fixed() {
        return (EAttribute)getModificationDateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModificationTimeType() {
		if (modificationTimeTypeEClass == null) {
			modificationTimeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(195);
		}
		return modificationTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationTimeType_Mixed() {
        return (EAttribute)getModificationTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationTimeType_DataStyleName() {
        return (EAttribute)getModificationTimeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationTimeType_Fixed() {
        return (EAttribute)getModificationTimeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationTimeType_TimeValue() {
        return (EAttribute)getModificationTimeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteBodyType() {
		if (noteBodyTypeEClass == null) {
			noteBodyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(202);
		}
		return noteBodyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteBodyType_TextContent() {
        return (EAttribute)getNoteBodyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_H() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_P() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_List() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_NumberedParagraph() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Table() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_A() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Section() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_SoftPageBreak() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_TableOfContent() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_IllustrationIndex() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_TableIndex() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_ObjectIndex() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_UserIndex() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_AlphabeticalIndex() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Bibliography() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Rect() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Line() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Polyline() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Polygon() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_RegularPolygon() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Path() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Circle() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Ellipse() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_G() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_PageThumbnail() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Frame() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Measure() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Caption() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Connector() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Control() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_Scene() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_CustomShape() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteBodyType_ChangeMarksGroup() {
        return (EAttribute)getNoteBodyType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteBodyType_ChangeMarks() {
        return (EReference)getNoteBodyType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteCitationType() {
		if (noteCitationTypeEClass == null) {
			noteCitationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(203);
		}
		return noteCitationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteCitationType_Mixed() {
        return (EAttribute)getNoteCitationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteCitationType_Label() {
        return (EAttribute)getNoteCitationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteRefType() {
		if (noteRefTypeEClass == null) {
			noteRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(206);
		}
		return noteRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteRefType_Mixed() {
        return (EAttribute)getNoteRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteRefType_NoteClass() {
        return (EAttribute)getNoteRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteRefType_ReferenceFormat() {
        return (EAttribute)getNoteRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteRefType_RefName() {
        return (EAttribute)getNoteRefType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteType() {
		if (noteTypeEClass == null) {
			noteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(207);
		}
		return noteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteType_NoteCitation() {
        return (EReference)getNoteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteType_NoteBody() {
        return (EReference)getNoteType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Id() {
        return (EAttribute)getNoteType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_NoteClass() {
        return (EAttribute)getNoteType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberedParagraphType() {
		if (numberedParagraphTypeEClass == null) {
			numberedParagraphTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(208);
		}
		return numberedParagraphTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberedParagraphType_Number() {
        return (EAttribute)getNumberedParagraphType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberedParagraphType_P() {
        return (EReference)getNumberedParagraphType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberedParagraphType_H() {
        return (EReference)getNumberedParagraphType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberedParagraphType_ContinueNumbering() {
        return (EAttribute)getNumberedParagraphType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberedParagraphType_Level() {
        return (EAttribute)getNumberedParagraphType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberedParagraphType_StartValue() {
        return (EAttribute)getNumberedParagraphType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberedParagraphType_StyleName() {
        return (EAttribute)getNumberedParagraphType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectCountType() {
		if (objectCountTypeEClass == null) {
			objectCountTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(211);
		}
		return objectCountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectCountType_Mixed() {
        return (EAttribute)getObjectCountType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectCountType_NumFormat() {
        return (EAttribute)getObjectCountType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectCountType_NumLetterSync() {
        return (EAttribute)getObjectCountType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIndexSourceType() {
		if (objectIndexSourceTypeEClass == null) {
			objectIndexSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(212);
		}
		return objectIndexSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIndexSourceType_IndexTitleTemplate() {
        return (EReference)getObjectIndexSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIndexSourceType_ObjectIndexEntryTemplate() {
        return (EReference)getObjectIndexSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectIndexSourceType_IndexScope() {
        return (EAttribute)getObjectIndexSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectIndexSourceType_RelativeTabStopPosition() {
        return (EAttribute)getObjectIndexSourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectIndexSourceType_UseChartObjects() {
        return (EAttribute)getObjectIndexSourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectIndexSourceType_UseDrawObjects() {
        return (EAttribute)getObjectIndexSourceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectIndexSourceType_UseMathObjects() {
        return (EAttribute)getObjectIndexSourceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectIndexSourceType_UseOtherObjects() {
        return (EAttribute)getObjectIndexSourceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectIndexSourceType_UseSpreadsheetObjects() {
        return (EAttribute)getObjectIndexSourceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIndexType() {
		if (objectIndexTypeEClass == null) {
			objectIndexTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(213);
		}
		return objectIndexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIndexType_ObjectIndexSource() {
        return (EReference)getObjectIndexType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIndexType_IndexBody() {
        return (EReference)getObjectIndexType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectIndexType_Name() {
        return (EAttribute)getObjectIndexType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectIndexType_Protected() {
        return (EAttribute)getObjectIndexType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectIndexType_ProtectionKey() {
        return (EAttribute)getObjectIndexType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectIndexType_StyleName() {
        return (EAttribute)getObjectIndexType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfficeBodyContent() {
		if (officeBodyContentEClass == null) {
			officeBodyContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(214);
		}
		return officeBodyContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOfficeBodyContent_OfficeBodyContentGroup() {
        return (EAttribute)getOfficeBodyContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOfficeBodyContent_OfficeBodyContent() {
        return (EReference)getOfficeBodyContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfficeChartContentMainType() {
		if (officeChartContentMainTypeEClass == null) {
			officeChartContentMainTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(215);
		}
		return officeChartContentMainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOfficeChartContentMainType_Title() {
        return (EReference)getOfficeChartContentMainType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOfficeChartContentMainType_Subtitle() {
        return (EReference)getOfficeChartContentMainType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOfficeChartContentMainType_Footer() {
        return (EReference)getOfficeChartContentMainType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOfficeChartContentMainType_Legend() {
        return (EReference)getOfficeChartContentMainType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOfficeChartContentMainType_PlotArea() {
        return (EReference)getOfficeChartContentMainType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOfficeChartContentMainType_Table() {
        return (EReference)getOfficeChartContentMainType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOfficeChartContentMainType_ColumnMapping() {
        return (EAttribute)getOfficeChartContentMainType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOfficeChartContentMainType_RowMapping() {
        return (EAttribute)getOfficeChartContentMainType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOfficeChartContentMainType_StyleName() {
        return (EAttribute)getOfficeChartContentMainType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfficeImageContentMain() {
		if (officeImageContentMainEClass == null) {
			officeImageContentMainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(216);
		}
		return officeImageContentMainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOfficeImageContentMain_Frame() {
        return (EReference)getOfficeImageContentMain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfficeMeta() {
		if (officeMetaEClass == null) {
			officeMetaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(217);
		}
		return officeMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOfficeMeta_Meta() {
        return (EReference)getOfficeMeta().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfficeMetaContent() {
		if (officeMetaContentEClass == null) {
			officeMetaContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(218);
		}
		return officeMetaContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOfficeMetaContent_Any() {
        return (EAttribute)getOfficeMetaContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutlineLevelStyleType() {
		if (outlineLevelStyleTypeEClass == null) {
			outlineLevelStyleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(219);
		}
		return outlineLevelStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutlineLevelStyleType_ListLevelProperties() {
        return (EReference)getOutlineLevelStyleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutlineLevelStyleType_TextProperties() {
        return (EReference)getOutlineLevelStyleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineLevelStyleType_DisplayLevels() {
        return (EAttribute)getOutlineLevelStyleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineLevelStyleType_Level() {
        return (EAttribute)getOutlineLevelStyleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineLevelStyleType_NumFormat() {
        return (EAttribute)getOutlineLevelStyleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineLevelStyleType_NumLetterSync() {
        return (EAttribute)getOutlineLevelStyleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineLevelStyleType_NumPrefix() {
        return (EAttribute)getOutlineLevelStyleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineLevelStyleType_NumSuffix() {
        return (EAttribute)getOutlineLevelStyleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineLevelStyleType_StartValue() {
        return (EAttribute)getOutlineLevelStyleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlineLevelStyleType_StyleName() {
        return (EAttribute)getOutlineLevelStyleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutlineStyleType() {
		if (outlineStyleTypeEClass == null) {
			outlineStyleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(222);
		}
		return outlineStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutlineStyleType_OutlineLevelStyle() {
        return (EReference)getOutlineStyleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageContinuationType() {
		if (pageContinuationTypeEClass == null) {
			pageContinuationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(223);
		}
		return pageContinuationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageContinuationType_Mixed() {
        return (EAttribute)getPageContinuationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageContinuationType_SelectPage() {
        return (EAttribute)getPageContinuationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageContinuationType_StringValue() {
        return (EAttribute)getPageContinuationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageCountType() {
		if (pageCountTypeEClass == null) {
			pageCountTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(224);
		}
		return pageCountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageCountType_Mixed() {
        return (EAttribute)getPageCountType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageCountType_NumFormat() {
        return (EAttribute)getPageCountType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageCountType_NumLetterSync() {
        return (EAttribute)getPageCountType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageNumberType() {
		if (pageNumberTypeEClass == null) {
			pageNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(225);
		}
		return pageNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageNumberType_Mixed() {
        return (EAttribute)getPageNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageNumberType_Fixed() {
        return (EAttribute)getPageNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageNumberType_NumFormat() {
        return (EAttribute)getPageNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageNumberType_NumLetterSync() {
        return (EAttribute)getPageNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageNumberType_PageAdjust() {
        return (EAttribute)getPageNumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageNumberType_SelectPage() {
        return (EAttribute)getPageNumberType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageSequenceType() {
		if (pageSequenceTypeEClass == null) {
			pageSequenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(226);
		}
		return pageSequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageSequenceType_Page() {
        return (EReference)getPageSequenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageType() {
		if (pageTypeEClass == null) {
			pageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(227);
		}
		return pageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageType_MasterPageName() {
        return (EAttribute)getPageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageVariableGetType() {
		if (pageVariableGetTypeEClass == null) {
			pageVariableGetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(228);
		}
		return pageVariableGetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageVariableGetType_Mixed() {
        return (EAttribute)getPageVariableGetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageVariableGetType_NumFormat() {
        return (EAttribute)getPageVariableGetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageVariableGetType_NumLetterSync() {
        return (EAttribute)getPageVariableGetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageVariableSetType() {
		if (pageVariableSetTypeEClass == null) {
			pageVariableSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(229);
		}
		return pageVariableSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageVariableSetType_Mixed() {
        return (EAttribute)getPageVariableSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageVariableSetType_Active() {
        return (EAttribute)getPageVariableSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageVariableSetType_PageAdjust() {
        return (EAttribute)getPageVariableSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraphCountType() {
		if (paragraphCountTypeEClass == null) {
			paragraphCountTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(230);
		}
		return paragraphCountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphCountType_Mixed() {
        return (EAttribute)getParagraphCountType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphCountType_NumFormat() {
        return (EAttribute)getParagraphCountType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphCountType_NumLetterSync() {
        return (EAttribute)getParagraphCountType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceholderType() {
		if (placeholderTypeEClass == null) {
			placeholderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(235);
		}
		return placeholderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholderType_Mixed() {
        return (EAttribute)getPlaceholderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholderType_Description() {
        return (EAttribute)getPlaceholderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholderType_PlaceholderType() {
        return (EAttribute)getPlaceholderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrintDateType() {
		if (printDateTypeEClass == null) {
			printDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(250);
		}
		return printDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintDateType_Mixed() {
        return (EAttribute)getPrintDateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintDateType_DataStyleName() {
        return (EAttribute)getPrintDateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintDateType_DateValue() {
        return (EAttribute)getPrintDateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintDateType_Fixed() {
        return (EAttribute)getPrintDateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrintedByType() {
		if (printedByTypeEClass == null) {
			printedByTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(251);
		}
		return printedByTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintedByType_Mixed() {
        return (EAttribute)getPrintedByType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintedByType_Fixed() {
        return (EAttribute)getPrintedByType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrintTimeType() {
		if (printTimeTypeEClass == null) {
			printTimeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(252);
		}
		return printTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintTimeType_Mixed() {
        return (EAttribute)getPrintTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintTimeType_DataStyleName() {
        return (EAttribute)getPrintTimeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintTimeType_Fixed() {
        return (EAttribute)getPrintTimeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintTimeType_TimeValue() {
        return (EAttribute)getPrintTimeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPType() {
		if (pTypeEClass == null) {
			pTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(253);
		}
		return pTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Mixed() {
        return (EAttribute)getPType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Group() {
        return (EAttribute)getPType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_S() {
        return (EReference)getPType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Tab() {
        return (EReference)getPType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_LineBreak() {
        return (EReference)getPType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SoftPageBreak() {
        return (EReference)getPType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Span() {
        return (EReference)getPType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_A() {
        return (EReference)getPType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Bookmark() {
        return (EReference)getPType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_BookmarkStart() {
        return (EReference)getPType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_BookmarkEnd() {
        return (EReference)getPType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_ReferenceMark() {
        return (EReference)getPType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_ReferenceMarkStart() {
        return (EReference)getPType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_ReferenceMarkEnd() {
        return (EReference)getPType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Note() {
        return (EReference)getPType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Ruby() {
        return (EReference)getPType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Annotation() {
        return (EReference)getPType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_ChangeMarksGroup() {
        return (EAttribute)getPType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_ChangeMarks() {
        return (EReference)getPType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Rect() {
        return (EReference)getPType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Line() {
        return (EReference)getPType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Polyline() {
        return (EReference)getPType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Polygon() {
        return (EReference)getPType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_RegularPolygon() {
        return (EReference)getPType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Path() {
        return (EReference)getPType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Circle() {
        return (EReference)getPType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Ellipse() {
        return (EReference)getPType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_G() {
        return (EReference)getPType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_PageThumbnail() {
        return (EReference)getPType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Frame() {
        return (EReference)getPType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Measure() {
        return (EReference)getPType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Caption() {
        return (EReference)getPType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Connector() {
        return (EReference)getPType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Control() {
        return (EReference)getPType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Scene() {
        return (EReference)getPType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_CustomShape() {
        return (EReference)getPType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_A1() {
        return (EReference)getPType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Date() {
        return (EReference)getPType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Time() {
        return (EReference)getPType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_PageNumber() {
        return (EReference)getPType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_PageContinuation() {
        return (EReference)getPType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderFirstname() {
        return (EReference)getPType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderLastname() {
        return (EReference)getPType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderInitials() {
        return (EReference)getPType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderTitle() {
        return (EReference)getPType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderPosition() {
        return (EReference)getPType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderEmail() {
        return (EReference)getPType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderPhonePrivate() {
        return (EReference)getPType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderFax() {
        return (EReference)getPType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderCompany() {
        return (EReference)getPType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderPhoneWork() {
        return (EReference)getPType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderStreet() {
        return (EReference)getPType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderCity() {
        return (EReference)getPType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderPostalCode() {
        return (EReference)getPType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderCountry() {
        return (EReference)getPType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SenderStateOrProvince() {
        return (EReference)getPType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_AuthorName() {
        return (EReference)getPType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_AuthorInitials() {
        return (EReference)getPType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Chapter() {
        return (EReference)getPType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_FileName() {
        return (EReference)getPType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_TemplateName() {
        return (EReference)getPType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_SheetName() {
        return (EAttribute)getPType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_VariableSet() {
        return (EReference)getPType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_VariableGet() {
        return (EReference)getPType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_VariableInput() {
        return (EReference)getPType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_UserFieldGet() {
        return (EReference)getPType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_UserFieldInput() {
        return (EReference)getPType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Sequence() {
        return (EReference)getPType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Expression() {
        return (EReference)getPType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_TextInput() {
        return (EReference)getPType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_InitialCreator() {
        return (EReference)getPType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_CreationDate() {
        return (EReference)getPType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_CreationTime() {
        return (EReference)getPType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Description() {
        return (EReference)getPType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_UserDefined() {
        return (EReference)getPType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_PrintTime() {
        return (EReference)getPType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_PrintDate() {
        return (EReference)getPType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_PrintedBy() {
        return (EReference)getPType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Title() {
        return (EReference)getPType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Subject() {
        return (EReference)getPType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Keywords() {
        return (EReference)getPType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_EditingCycles() {
        return (EReference)getPType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_EditingDuration() {
        return (EReference)getPType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_ModificationTime() {
        return (EReference)getPType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_ModificationDate() {
        return (EReference)getPType().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Creator() {
        return (EReference)getPType().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_PageCount() {
        return (EReference)getPType().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_ParagraphCount() {
        return (EReference)getPType().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_WordCount() {
        return (EReference)getPType().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_CharacterCount() {
        return (EReference)getPType().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_TableCount() {
        return (EReference)getPType().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_ImageCount() {
        return (EReference)getPType().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_ObjectCount() {
        return (EReference)getPType().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_DatabaseDisplay() {
        return (EReference)getPType().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_DatabaseNext() {
        return (EReference)getPType().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_DatabaseRowSelect() {
        return (EReference)getPType().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_DatabaseRowNumber() {
        return (EReference)getPType().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_DatabaseName() {
        return (EReference)getPType().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_PageVariableSet() {
        return (EReference)getPType().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_PageVariableGet() {
        return (EReference)getPType().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Placeholder() {
        return (EReference)getPType().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_ConditionalText() {
        return (EReference)getPType().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_HiddenText() {
        return (EReference)getPType().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_ReferenceRef() {
        return (EReference)getPType().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_BookmarkRef() {
        return (EReference)getPType().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_NoteRef() {
        return (EReference)getPType().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_SequenceRef() {
        return (EReference)getPType().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Script() {
        return (EReference)getPType().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_ExecuteMacro() {
        return (EReference)getPType().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_HiddenParagraph() {
        return (EReference)getPType().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_DdeConnection() {
        return (EReference)getPType().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Measure1() {
        return (EReference)getPType().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_TableFormula() {
        return (EReference)getPType().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_TocMarkStart() {
        return (EReference)getPType().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_TocMarkEnd() {
        return (EReference)getPType().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_TocMark() {
        return (EReference)getPType().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_UserIndexMarkStart() {
        return (EReference)getPType().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_UserIndexMarkEnd() {
        return (EReference)getPType().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_UserIndexMark() {
        return (EReference)getPType().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_AlphabeticalIndexMarkStart() {
        return (EReference)getPType().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_AlphabeticalIndexMarkEnd() {
        return (EReference)getPType().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_AlphabeticalIndexMark() {
        return (EReference)getPType().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_BibliographyMark() {
        return (EReference)getPType().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Header() {
        return (EReference)getPType().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Footer() {
        return (EReference)getPType().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_DateTime() {
        return (EReference)getPType().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_ClassNames() {
        return (EAttribute)getPType().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_CondStyleName() {
        return (EAttribute)getPType().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Id() {
        return (EAttribute)getPType().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_StyleName() {
        return (EAttribute)getPType().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceMarkEndType() {
		if (referenceMarkEndTypeEClass == null) {
			referenceMarkEndTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(258);
		}
		return referenceMarkEndTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceMarkEndType_Name() {
        return (EAttribute)getReferenceMarkEndType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceMarkStartType() {
		if (referenceMarkStartTypeEClass == null) {
			referenceMarkStartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(259);
		}
		return referenceMarkStartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceMarkStartType_Name() {
        return (EAttribute)getReferenceMarkStartType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceMarkType() {
		if (referenceMarkTypeEClass == null) {
			referenceMarkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(260);
		}
		return referenceMarkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceMarkType_Name() {
        return (EAttribute)getReferenceMarkType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceRefType() {
		if (referenceRefTypeEClass == null) {
			referenceRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(261);
		}
		return referenceRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceRefType_Mixed() {
        return (EAttribute)getReferenceRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceRefType_ReferenceFormat() {
        return (EAttribute)getReferenceRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceRefType_RefName() {
        return (EAttribute)getReferenceRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionContent() {
		if (regionContentEClass == null) {
			regionContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(262);
		}
		return regionContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionContent_P() {
        return (EReference)getRegionContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRubyBaseType() {
		if (rubyBaseTypeEClass == null) {
			rubyBaseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(266);
		}
		return rubyBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyBaseType_Mixed() {
        return (EAttribute)getRubyBaseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_S() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Tab() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_LineBreak() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SoftPageBreak() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Span() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_A() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Bookmark() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_BookmarkStart() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_BookmarkEnd() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_ReferenceMark() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_ReferenceMarkStart() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_ReferenceMarkEnd() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Note() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Ruby() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Annotation() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyBaseType_ChangeMarksGroup() {
        return (EAttribute)getRubyBaseType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_ChangeMarks() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Rect() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Line() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Polyline() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Polygon() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_RegularPolygon() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Path() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Circle() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Ellipse() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_G() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_PageThumbnail() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Frame() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Measure() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Caption() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Connector() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Control() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Scene() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_CustomShape() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_A1() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Date() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Time() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_PageNumber() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_PageContinuation() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderFirstname() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderLastname() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderInitials() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderTitle() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderPosition() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderEmail() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderPhonePrivate() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderFax() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderCompany() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderPhoneWork() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderStreet() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderCity() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderPostalCode() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderCountry() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SenderStateOrProvince() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_AuthorName() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_AuthorInitials() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Chapter() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_FileName() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_TemplateName() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyBaseType_SheetName() {
        return (EAttribute)getRubyBaseType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_VariableSet() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_VariableGet() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_VariableInput() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_UserFieldGet() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_UserFieldInput() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Sequence() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Expression() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_TextInput() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_InitialCreator() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_CreationDate() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_CreationTime() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Description() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_UserDefined() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_PrintTime() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_PrintDate() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_PrintedBy() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Title() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Subject() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Keywords() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_EditingCycles() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_EditingDuration() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_ModificationTime() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_ModificationDate() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Creator() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_PageCount() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_ParagraphCount() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_WordCount() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_CharacterCount() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_TableCount() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_ImageCount() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_ObjectCount() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_DatabaseDisplay() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_DatabaseNext() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_DatabaseRowSelect() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_DatabaseRowNumber() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_DatabaseName() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_PageVariableSet() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_PageVariableGet() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Placeholder() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_ConditionalText() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_HiddenText() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_ReferenceRef() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_BookmarkRef() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_NoteRef() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_SequenceRef() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Script() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_ExecuteMacro() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_HiddenParagraph() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_DdeConnection() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Measure1() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_TableFormula() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_TocMarkStart() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_TocMarkEnd() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_TocMark() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_UserIndexMarkStart() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_UserIndexMarkEnd() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_UserIndexMark() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_AlphabeticalIndexMarkStart() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_AlphabeticalIndexMarkEnd() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_AlphabeticalIndexMark() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_BibliographyMark() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Header() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_Footer() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyBaseType_DateTime() {
        return (EReference)getRubyBaseType().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRubyTextType() {
		if (rubyTextTypeEClass == null) {
			rubyTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(267);
		}
		return rubyTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyTextType_Mixed() {
        return (EAttribute)getRubyTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyTextType_StyleName() {
        return (EAttribute)getRubyTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRubyType() {
		if (rubyTypeEClass == null) {
			rubyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(268);
		}
		return rubyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyType_RubyBase() {
        return (EReference)getRubyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRubyType_RubyText() {
        return (EReference)getRubyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyType_StyleName() {
        return (EAttribute)getRubyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptType() {
		if (scriptTypeEClass == null) {
			scriptTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(269);
		}
		return scriptTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptType_Mixed() {
        return (EAttribute)getScriptType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptType_Href() {
        return (EAttribute)getScriptType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptType_Language() {
        return (EAttribute)getScriptType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptType_Type() {
        return (EAttribute)getScriptType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionSourceType() {
		if (sectionSourceTypeEClass == null) {
			sectionSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(270);
		}
		return sectionSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionSourceType_FilterName() {
        return (EAttribute)getSectionSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionSourceType_Href() {
        return (EAttribute)getSectionSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionSourceType_SectionName() {
        return (EAttribute)getSectionSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionSourceType_Show() {
        return (EAttribute)getSectionSourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionSourceType_Type() {
        return (EAttribute)getSectionSourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionType() {
		if (sectionTypeEClass == null) {
			sectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(271);
		}
		return sectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_SectionSource() {
        return (EReference)getSectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_TextSectionSourceDdeGroup() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_TextSectionSourceDde() {
        return (EReference)getSectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_TextContent() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_H() {
        return (EReference)getSectionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_P() {
        return (EReference)getSectionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_List() {
        return (EReference)getSectionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_NumberedParagraph() {
        return (EReference)getSectionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Table() {
        return (EReference)getSectionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_A() {
        return (EReference)getSectionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Section() {
        return (EReference)getSectionType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_SoftPageBreak() {
        return (EReference)getSectionType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_TableOfContent() {
        return (EReference)getSectionType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_IllustrationIndex() {
        return (EReference)getSectionType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_TableIndex() {
        return (EReference)getSectionType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_ObjectIndex() {
        return (EReference)getSectionType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_UserIndex() {
        return (EReference)getSectionType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_AlphabeticalIndex() {
        return (EReference)getSectionType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Bibliography() {
        return (EReference)getSectionType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Rect() {
        return (EReference)getSectionType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Line() {
        return (EReference)getSectionType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Polyline() {
        return (EReference)getSectionType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Polygon() {
        return (EReference)getSectionType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_RegularPolygon() {
        return (EReference)getSectionType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Path() {
        return (EReference)getSectionType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Circle() {
        return (EReference)getSectionType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Ellipse() {
        return (EReference)getSectionType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_G() {
        return (EReference)getSectionType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_PageThumbnail() {
        return (EReference)getSectionType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Frame() {
        return (EReference)getSectionType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Measure() {
        return (EReference)getSectionType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Caption() {
        return (EReference)getSectionType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Connector() {
        return (EReference)getSectionType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Control() {
        return (EReference)getSectionType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Scene() {
        return (EReference)getSectionType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_CustomShape() {
        return (EReference)getSectionType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_ChangeMarksGroup() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_ChangeMarks() {
        return (EReference)getSectionType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_Condition() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_Display() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_Name() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_Protected() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_ProtectionKey() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_StyleName() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderCityType() {
		if (senderCityTypeEClass == null) {
			senderCityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(276);
		}
		return senderCityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderCityType_Mixed() {
        return (EAttribute)getSenderCityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderCityType_Fixed() {
        return (EAttribute)getSenderCityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderCompanyType() {
		if (senderCompanyTypeEClass == null) {
			senderCompanyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(277);
		}
		return senderCompanyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderCompanyType_Mixed() {
        return (EAttribute)getSenderCompanyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderCompanyType_Fixed() {
        return (EAttribute)getSenderCompanyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderCountryType() {
		if (senderCountryTypeEClass == null) {
			senderCountryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(278);
		}
		return senderCountryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderCountryType_Mixed() {
        return (EAttribute)getSenderCountryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderCountryType_Fixed() {
        return (EAttribute)getSenderCountryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderEmailType() {
		if (senderEmailTypeEClass == null) {
			senderEmailTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(279);
		}
		return senderEmailTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderEmailType_Mixed() {
        return (EAttribute)getSenderEmailType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderEmailType_Fixed() {
        return (EAttribute)getSenderEmailType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderFaxType() {
		if (senderFaxTypeEClass == null) {
			senderFaxTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(280);
		}
		return senderFaxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderFaxType_Mixed() {
        return (EAttribute)getSenderFaxType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderFaxType_Fixed() {
        return (EAttribute)getSenderFaxType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderFirstnameType() {
		if (senderFirstnameTypeEClass == null) {
			senderFirstnameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(281);
		}
		return senderFirstnameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderFirstnameType_Mixed() {
        return (EAttribute)getSenderFirstnameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderFirstnameType_Fixed() {
        return (EAttribute)getSenderFirstnameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderInitialsType() {
		if (senderInitialsTypeEClass == null) {
			senderInitialsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(282);
		}
		return senderInitialsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderInitialsType_Mixed() {
        return (EAttribute)getSenderInitialsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderInitialsType_Fixed() {
        return (EAttribute)getSenderInitialsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderLastnameType() {
		if (senderLastnameTypeEClass == null) {
			senderLastnameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(283);
		}
		return senderLastnameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderLastnameType_Mixed() {
        return (EAttribute)getSenderLastnameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderLastnameType_Fixed() {
        return (EAttribute)getSenderLastnameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderPhonePrivateType() {
		if (senderPhonePrivateTypeEClass == null) {
			senderPhonePrivateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(284);
		}
		return senderPhonePrivateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderPhonePrivateType_Mixed() {
        return (EAttribute)getSenderPhonePrivateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderPhonePrivateType_Fixed() {
        return (EAttribute)getSenderPhonePrivateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderPhoneWorkType() {
		if (senderPhoneWorkTypeEClass == null) {
			senderPhoneWorkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(285);
		}
		return senderPhoneWorkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderPhoneWorkType_Mixed() {
        return (EAttribute)getSenderPhoneWorkType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderPhoneWorkType_Fixed() {
        return (EAttribute)getSenderPhoneWorkType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderPositionType() {
		if (senderPositionTypeEClass == null) {
			senderPositionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(286);
		}
		return senderPositionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderPositionType_Mixed() {
        return (EAttribute)getSenderPositionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderPositionType_Fixed() {
        return (EAttribute)getSenderPositionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderPostalCodeType() {
		if (senderPostalCodeTypeEClass == null) {
			senderPostalCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(287);
		}
		return senderPostalCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderPostalCodeType_Mixed() {
        return (EAttribute)getSenderPostalCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderPostalCodeType_Fixed() {
        return (EAttribute)getSenderPostalCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderStateOrProvinceType() {
		if (senderStateOrProvinceTypeEClass == null) {
			senderStateOrProvinceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(288);
		}
		return senderStateOrProvinceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderStateOrProvinceType_Mixed() {
        return (EAttribute)getSenderStateOrProvinceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderStateOrProvinceType_Fixed() {
        return (EAttribute)getSenderStateOrProvinceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderStreetType() {
		if (senderStreetTypeEClass == null) {
			senderStreetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(289);
		}
		return senderStreetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderStreetType_Mixed() {
        return (EAttribute)getSenderStreetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderStreetType_Fixed() {
        return (EAttribute)getSenderStreetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderTitleType() {
		if (senderTitleTypeEClass == null) {
			senderTitleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(290);
		}
		return senderTitleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderTitleType_Mixed() {
        return (EAttribute)getSenderTitleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSenderTitleType_Fixed() {
        return (EAttribute)getSenderTitleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceDeclsType() {
		if (sequenceDeclsTypeEClass == null) {
			sequenceDeclsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(291);
		}
		return sequenceDeclsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceDeclsType_SequenceDecl() {
        return (EReference)getSequenceDeclsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceDeclType() {
		if (sequenceDeclTypeEClass == null) {
			sequenceDeclTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(292);
		}
		return sequenceDeclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceDeclType_DisplayOutlineLevel() {
        return (EAttribute)getSequenceDeclType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceDeclType_Name() {
        return (EAttribute)getSequenceDeclType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceDeclType_SeparationCharacter() {
        return (EAttribute)getSequenceDeclType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceRefType() {
		if (sequenceRefTypeEClass == null) {
			sequenceRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(293);
		}
		return sequenceRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceRefType_Mixed() {
        return (EAttribute)getSequenceRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceRefType_ReferenceFormat() {
        return (EAttribute)getSequenceRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceRefType_RefName() {
        return (EAttribute)getSequenceRefType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceType() {
		if (sequenceTypeEClass == null) {
			sequenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(294);
		}
		return sequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_Mixed() {
        return (EAttribute)getSequenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_Formula() {
        return (EAttribute)getSequenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_Name() {
        return (EAttribute)getSequenceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_NumFormat() {
        return (EAttribute)getSequenceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_NumLetterSync() {
        return (EAttribute)getSequenceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_RefName() {
        return (EAttribute)getSequenceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftPageBreakType() {
		if (softPageBreakTypeEClass == null) {
			softPageBreakTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(298);
		}
		return softPageBreakTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortKeyType() {
		if (sortKeyTypeEClass == null) {
			sortKeyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(299);
		}
		return sortKeyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortKeyType_Key() {
        return (EAttribute)getSortKeyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortKeyType_SortAscending() {
        return (EAttribute)getSortKeyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpanType() {
		if (spanTypeEClass == null) {
			spanTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(300);
		}
		return spanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_Mixed() {
        return (EAttribute)getSpanType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_Group() {
        return (EAttribute)getSpanType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_S() {
        return (EReference)getSpanType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Tab() {
        return (EReference)getSpanType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_LineBreak() {
        return (EReference)getSpanType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SoftPageBreak() {
        return (EReference)getSpanType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Span() {
        return (EReference)getSpanType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_A() {
        return (EReference)getSpanType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Bookmark() {
        return (EReference)getSpanType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_BookmarkStart() {
        return (EReference)getSpanType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_BookmarkEnd() {
        return (EReference)getSpanType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_ReferenceMark() {
        return (EReference)getSpanType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_ReferenceMarkStart() {
        return (EReference)getSpanType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_ReferenceMarkEnd() {
        return (EReference)getSpanType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Note() {
        return (EReference)getSpanType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Ruby() {
        return (EReference)getSpanType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Annotation() {
        return (EReference)getSpanType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_ChangeMarksGroup() {
        return (EAttribute)getSpanType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_ChangeMarks() {
        return (EReference)getSpanType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Rect() {
        return (EReference)getSpanType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Line() {
        return (EReference)getSpanType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Polyline() {
        return (EReference)getSpanType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Polygon() {
        return (EReference)getSpanType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_RegularPolygon() {
        return (EReference)getSpanType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Path() {
        return (EReference)getSpanType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Circle() {
        return (EReference)getSpanType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Ellipse() {
        return (EReference)getSpanType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_G() {
        return (EReference)getSpanType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_PageThumbnail() {
        return (EReference)getSpanType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Frame() {
        return (EReference)getSpanType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Measure() {
        return (EReference)getSpanType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Caption() {
        return (EReference)getSpanType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Connector() {
        return (EReference)getSpanType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Control() {
        return (EReference)getSpanType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Scene() {
        return (EReference)getSpanType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_CustomShape() {
        return (EReference)getSpanType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_A1() {
        return (EReference)getSpanType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Date() {
        return (EReference)getSpanType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Time() {
        return (EReference)getSpanType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_PageNumber() {
        return (EReference)getSpanType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_PageContinuation() {
        return (EReference)getSpanType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderFirstname() {
        return (EReference)getSpanType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderLastname() {
        return (EReference)getSpanType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderInitials() {
        return (EReference)getSpanType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderTitle() {
        return (EReference)getSpanType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderPosition() {
        return (EReference)getSpanType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderEmail() {
        return (EReference)getSpanType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderPhonePrivate() {
        return (EReference)getSpanType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderFax() {
        return (EReference)getSpanType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderCompany() {
        return (EReference)getSpanType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderPhoneWork() {
        return (EReference)getSpanType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderStreet() {
        return (EReference)getSpanType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderCity() {
        return (EReference)getSpanType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderPostalCode() {
        return (EReference)getSpanType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderCountry() {
        return (EReference)getSpanType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SenderStateOrProvince() {
        return (EReference)getSpanType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_AuthorName() {
        return (EReference)getSpanType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_AuthorInitials() {
        return (EReference)getSpanType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Chapter() {
        return (EReference)getSpanType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_FileName() {
        return (EReference)getSpanType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_TemplateName() {
        return (EReference)getSpanType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_SheetName() {
        return (EAttribute)getSpanType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_VariableSet() {
        return (EReference)getSpanType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_VariableGet() {
        return (EReference)getSpanType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_VariableInput() {
        return (EReference)getSpanType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_UserFieldGet() {
        return (EReference)getSpanType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_UserFieldInput() {
        return (EReference)getSpanType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Sequence() {
        return (EReference)getSpanType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Expression() {
        return (EReference)getSpanType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_TextInput() {
        return (EReference)getSpanType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_InitialCreator() {
        return (EReference)getSpanType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_CreationDate() {
        return (EReference)getSpanType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_CreationTime() {
        return (EReference)getSpanType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Description() {
        return (EReference)getSpanType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_UserDefined() {
        return (EReference)getSpanType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_PrintTime() {
        return (EReference)getSpanType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_PrintDate() {
        return (EReference)getSpanType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_PrintedBy() {
        return (EReference)getSpanType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Title() {
        return (EReference)getSpanType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Subject() {
        return (EReference)getSpanType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Keywords() {
        return (EReference)getSpanType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_EditingCycles() {
        return (EReference)getSpanType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_EditingDuration() {
        return (EReference)getSpanType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_ModificationTime() {
        return (EReference)getSpanType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_ModificationDate() {
        return (EReference)getSpanType().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Creator() {
        return (EReference)getSpanType().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_PageCount() {
        return (EReference)getSpanType().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_ParagraphCount() {
        return (EReference)getSpanType().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_WordCount() {
        return (EReference)getSpanType().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_CharacterCount() {
        return (EReference)getSpanType().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_TableCount() {
        return (EReference)getSpanType().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_ImageCount() {
        return (EReference)getSpanType().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_ObjectCount() {
        return (EReference)getSpanType().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_DatabaseDisplay() {
        return (EReference)getSpanType().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_DatabaseNext() {
        return (EReference)getSpanType().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_DatabaseRowSelect() {
        return (EReference)getSpanType().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_DatabaseRowNumber() {
        return (EReference)getSpanType().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_DatabaseName() {
        return (EReference)getSpanType().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_PageVariableSet() {
        return (EReference)getSpanType().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_PageVariableGet() {
        return (EReference)getSpanType().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Placeholder() {
        return (EReference)getSpanType().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_ConditionalText() {
        return (EReference)getSpanType().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_HiddenText() {
        return (EReference)getSpanType().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_ReferenceRef() {
        return (EReference)getSpanType().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_BookmarkRef() {
        return (EReference)getSpanType().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_NoteRef() {
        return (EReference)getSpanType().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_SequenceRef() {
        return (EReference)getSpanType().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Script() {
        return (EReference)getSpanType().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_ExecuteMacro() {
        return (EReference)getSpanType().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_HiddenParagraph() {
        return (EReference)getSpanType().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_DdeConnection() {
        return (EReference)getSpanType().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Measure1() {
        return (EReference)getSpanType().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_TableFormula() {
        return (EReference)getSpanType().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_TocMarkStart() {
        return (EReference)getSpanType().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_TocMarkEnd() {
        return (EReference)getSpanType().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_TocMark() {
        return (EReference)getSpanType().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_UserIndexMarkStart() {
        return (EReference)getSpanType().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_UserIndexMarkEnd() {
        return (EReference)getSpanType().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_UserIndexMark() {
        return (EReference)getSpanType().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_AlphabeticalIndexMarkStart() {
        return (EReference)getSpanType().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_AlphabeticalIndexMarkEnd() {
        return (EReference)getSpanType().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_AlphabeticalIndexMark() {
        return (EReference)getSpanType().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_BibliographyMark() {
        return (EReference)getSpanType().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Header() {
        return (EReference)getSpanType().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_Footer() {
        return (EReference)getSpanType().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpanType_DateTime() {
        return (EReference)getSpanType().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_ClassNames() {
        return (EAttribute)getSpanType().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_StyleName() {
        return (EAttribute)getSpanType().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleChartPropertiesContent() {
		if (styleChartPropertiesContentEClass == null) {
			styleChartPropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(306);
		}
		return styleChartPropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleDrawingPagePropertiesContent() {
		if (styleDrawingPagePropertiesContentEClass == null) {
			styleDrawingPagePropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(307);
		}
		return styleDrawingPagePropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleGraphicPropertiesContent() {
		if (styleGraphicPropertiesContentEClass == null) {
			styleGraphicPropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(308);
		}
		return styleGraphicPropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleHeaderFooterPropertiesContent() {
		if (styleHeaderFooterPropertiesContentEClass == null) {
			styleHeaderFooterPropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(309);
		}
		return styleHeaderFooterPropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleListLevelPropertiesContent() {
		if (styleListLevelPropertiesContentEClass == null) {
			styleListLevelPropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(310);
		}
		return styleListLevelPropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStylePageLayoutPropertiesContent() {
		if (stylePageLayoutPropertiesContentEClass == null) {
			stylePageLayoutPropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(366);
		}
		return stylePageLayoutPropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleParagraphPropertiesContent() {
		if (styleParagraphPropertiesContentEClass == null) {
			styleParagraphPropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(367);
		}
		return styleParagraphPropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStylePropertiesContent() {
		if (stylePropertiesContentEClass == null) {
			stylePropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(368);
		}
		return stylePropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleRubyPropertiesContent() {
		if (styleRubyPropertiesContentEClass == null) {
			styleRubyPropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(369);
		}
		return styleRubyPropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleSectionPropertiesContent() {
		if (styleSectionPropertiesContentEClass == null) {
			styleSectionPropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(370);
		}
		return styleSectionPropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleStyleContent() {
		if (styleStyleContentEClass == null) {
			styleStyleContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(371);
		}
		return styleStyleContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_TextProperties() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_ParagraphProperties() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_TextProperties1() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_SectionProperties() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_RubyProperties() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_TableProperties() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_TableColumnProperties() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_TableRowProperties() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_TableCellProperties() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_ParagraphProperties1() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_TextProperties2() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_GraphicProperties() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_ParagraphProperties2() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_TextProperties3() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_DrawingPageProperties() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_ChartProperties() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_GraphicProperties1() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_ParagraphProperties3() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleStyleContent_TextProperties4() {
        return (EReference)getStyleStyleContent().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleStyleContent_Family() {
        return (EAttribute)getStyleStyleContent().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleTableCellPropertiesContent() {
		if (styleTableCellPropertiesContentEClass == null) {
			styleTableCellPropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(372);
		}
		return styleTableCellPropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleTableColumnPropertiesContent() {
		if (styleTableColumnPropertiesContentEClass == null) {
			styleTableColumnPropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(373);
		}
		return styleTableColumnPropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleTablePropertiesContent() {
		if (styleTablePropertiesContentEClass == null) {
			styleTablePropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(374);
		}
		return styleTablePropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleTableRowPropertiesContent() {
		if (styleTableRowPropertiesContentEClass == null) {
			styleTableRowPropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(375);
		}
		return styleTableRowPropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleTextPropertiesContent() {
		if (styleTextPropertiesContentEClass == null) {
			styleTextPropertiesContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(376);
		}
		return styleTextPropertiesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSType() {
		if (sTypeEClass == null) {
			sTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(377);
		}
		return sTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSType_C() {
        return (EAttribute)getSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectType() {
		if (subjectTypeEClass == null) {
			subjectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(378);
		}
		return subjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectType_Mixed() {
        return (EAttribute)getSubjectType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectType_Fixed() {
        return (EAttribute)getSubjectType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableCountType() {
		if (tableCountTypeEClass == null) {
			tableCountTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(381);
		}
		return tableCountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCountType_Mixed() {
        return (EAttribute)getTableCountType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCountType_NumFormat() {
        return (EAttribute)getTableCountType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCountType_NumLetterSync() {
        return (EAttribute)getTableCountType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableFormulaType() {
		if (tableFormulaTypeEClass == null) {
			tableFormulaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(382);
		}
		return tableFormulaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableFormulaType_Mixed() {
        return (EAttribute)getTableFormulaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableFormulaType_DataStyleName() {
        return (EAttribute)getTableFormulaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableFormulaType_Display() {
        return (EAttribute)getTableFormulaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableFormulaType_Formula() {
        return (EAttribute)getTableFormulaType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableIndexSourceType() {
		if (tableIndexSourceTypeEClass == null) {
			tableIndexSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(383);
		}
		return tableIndexSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableIndexSourceType_IndexTitleTemplate() {
        return (EReference)getTableIndexSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableIndexSourceType_TableIndexEntryTemplate() {
        return (EReference)getTableIndexSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableIndexSourceType_CaptionSequenceFormat() {
        return (EAttribute)getTableIndexSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableIndexSourceType_CaptionSequenceName() {
        return (EAttribute)getTableIndexSourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableIndexSourceType_IndexScope() {
        return (EAttribute)getTableIndexSourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableIndexSourceType_RelativeTabStopPosition() {
        return (EAttribute)getTableIndexSourceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableIndexSourceType_UseCaption() {
        return (EAttribute)getTableIndexSourceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableIndexType() {
		if (tableIndexTypeEClass == null) {
			tableIndexTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(384);
		}
		return tableIndexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableIndexType_TableIndexSource() {
        return (EReference)getTableIndexType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableIndexType_IndexBody() {
        return (EReference)getTableIndexType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableIndexType_Name() {
        return (EAttribute)getTableIndexType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableIndexType_Protected() {
        return (EAttribute)getTableIndexType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableIndexType_ProtectionKey() {
        return (EAttribute)getTableIndexType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableIndexType_StyleName() {
        return (EAttribute)getTableIndexType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableOfContentEntryTemplateType() {
		if (tableOfContentEntryTemplateTypeEClass == null) {
			tableOfContentEntryTemplateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(385);
		}
		return tableOfContentEntryTemplateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentEntryTemplateType_TextTableOfContentChildrenGroup() {
        return (EAttribute)getTableOfContentEntryTemplateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableOfContentEntryTemplateType_TextTableOfContentChildren() {
        return (EReference)getTableOfContentEntryTemplateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentEntryTemplateType_OutlineLevel() {
        return (EAttribute)getTableOfContentEntryTemplateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentEntryTemplateType_StyleName() {
        return (EAttribute)getTableOfContentEntryTemplateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableOfContentSourceType() {
		if (tableOfContentSourceTypeEClass == null) {
			tableOfContentSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(386);
		}
		return tableOfContentSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableOfContentSourceType_IndexTitleTemplate() {
        return (EReference)getTableOfContentSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableOfContentSourceType_TableOfContentEntryTemplate() {
        return (EReference)getTableOfContentSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableOfContentSourceType_IndexSourceStyles() {
        return (EReference)getTableOfContentSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentSourceType_IndexScope() {
        return (EAttribute)getTableOfContentSourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentSourceType_OutlineLevel() {
        return (EAttribute)getTableOfContentSourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentSourceType_RelativeTabStopPosition() {
        return (EAttribute)getTableOfContentSourceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentSourceType_UseIndexMarks() {
        return (EAttribute)getTableOfContentSourceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentSourceType_UseIndexSourceStyles() {
        return (EAttribute)getTableOfContentSourceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentSourceType_UseOutlineLevel() {
        return (EAttribute)getTableOfContentSourceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableOfContentType() {
		if (tableOfContentTypeEClass == null) {
			tableOfContentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(387);
		}
		return tableOfContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableOfContentType_TableOfContentSource() {
        return (EReference)getTableOfContentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableOfContentType_IndexBody() {
        return (EReference)getTableOfContentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentType_Name() {
        return (EAttribute)getTableOfContentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentType_Protected() {
        return (EAttribute)getTableOfContentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentType_ProtectionKey() {
        return (EAttribute)getTableOfContentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableOfContentType_StyleName() {
        return (EAttribute)getTableOfContentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableTableCellContent() {
		if (tableTableCellContentEClass == null) {
			tableTableCellContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(388);
		}
		return tableTableCellContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_CellRangeSource() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Annotation() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Detective() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableTableCellContent_TextContent() {
        return (EAttribute)getTableTableCellContent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_H() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_P() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_List() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_NumberedParagraph() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Table() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_A() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Section() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_SoftPageBreak() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_TableOfContent() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_IllustrationIndex() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_TableIndex() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_ObjectIndex() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_UserIndex() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_AlphabeticalIndex() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Bibliography() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Rect() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Line() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Polyline() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Polygon() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_RegularPolygon() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Path() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Circle() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Ellipse() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_G() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_PageThumbnail() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Frame() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Measure() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Caption() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Connector() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Control() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_Scene() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_CustomShape() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableTableCellContent_ChangeMarksGroup() {
        return (EAttribute)getTableTableCellContent().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTableCellContent_ChangeMarks() {
        return (EReference)getTableTableCellContent().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabType() {
		if (tabTypeEClass == null) {
			tabTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(393);
		}
		return tabTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabType_TabRef() {
        return (EAttribute)getTabType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateNameType() {
		if (templateNameTypeEClass == null) {
			templateNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(403);
		}
		return templateNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateNameType_Mixed() {
        return (EAttribute)getTemplateNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateNameType_Display() {
        return (EAttribute)getTemplateNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextChangedRegionContent() {
		if (textChangedRegionContentEClass == null) {
			textChangedRegionContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(406);
		}
		return textChangedRegionContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextChangedRegionContent_TextChangedRegionContentGroup() {
        return (EAttribute)getTextChangedRegionContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextChangedRegionContent_TextChangedRegionContent() {
        return (EReference)getTextChangedRegionContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextDatabaseDisplayAttlist() {
		if (textDatabaseDisplayAttlistEClass == null) {
			textDatabaseDisplayAttlistEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(407);
		}
		return textDatabaseDisplayAttlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseDisplayAttlist_Mixed() {
        return (EAttribute)getTextDatabaseDisplayAttlist().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextDatabaseDisplayAttlist_ConnectionResource() {
        return (EReference)getTextDatabaseDisplayAttlist().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseDisplayAttlist_ColumnName() {
        return (EAttribute)getTextDatabaseDisplayAttlist().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseDisplayAttlist_DatabaseName() {
        return (EAttribute)getTextDatabaseDisplayAttlist().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseDisplayAttlist_DataStyleName() {
        return (EAttribute)getTextDatabaseDisplayAttlist().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseDisplayAttlist_TableName() {
        return (EAttribute)getTextDatabaseDisplayAttlist().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseDisplayAttlist_TableType() {
        return (EAttribute)getTextDatabaseDisplayAttlist().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextDatabaseNextAttlist() {
		if (textDatabaseNextAttlistEClass == null) {
			textDatabaseNextAttlistEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(408);
		}
		return textDatabaseNextAttlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextDatabaseNextAttlist_ConnectionResource() {
        return (EReference)getTextDatabaseNextAttlist().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseNextAttlist_Condition() {
        return (EAttribute)getTextDatabaseNextAttlist().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseNextAttlist_DatabaseName() {
        return (EAttribute)getTextDatabaseNextAttlist().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseNextAttlist_TableName() {
        return (EAttribute)getTextDatabaseNextAttlist().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseNextAttlist_TableType() {
        return (EAttribute)getTextDatabaseNextAttlist().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextDatabaseRowSelectAttlist() {
		if (textDatabaseRowSelectAttlistEClass == null) {
			textDatabaseRowSelectAttlistEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(409);
		}
		return textDatabaseRowSelectAttlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextDatabaseRowSelectAttlist_ConnectionResource() {
        return (EReference)getTextDatabaseRowSelectAttlist().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseRowSelectAttlist_Condition() {
        return (EAttribute)getTextDatabaseRowSelectAttlist().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseRowSelectAttlist_DatabaseName() {
        return (EAttribute)getTextDatabaseRowSelectAttlist().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseRowSelectAttlist_RowNumber() {
        return (EAttribute)getTextDatabaseRowSelectAttlist().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseRowSelectAttlist_TableName() {
        return (EAttribute)getTextDatabaseRowSelectAttlist().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDatabaseRowSelectAttlist_TableType() {
        return (EAttribute)getTextDatabaseRowSelectAttlist().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextIllustrationIndexEntryContent() {
		if (textIllustrationIndexEntryContentEClass == null) {
			textIllustrationIndexEntryContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(411);
		}
		return textIllustrationIndexEntryContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextIllustrationIndexEntryContent_Group() {
        return (EAttribute)getTextIllustrationIndexEntryContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextIllustrationIndexEntryContent_IndexEntryPageNumber() {
        return (EReference)getTextIllustrationIndexEntryContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextIllustrationIndexEntryContent_IndexEntryText() {
        return (EReference)getTextIllustrationIndexEntryContent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextIllustrationIndexEntryContent_IndexEntrySpan() {
        return (EReference)getTextIllustrationIndexEntryContent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextIllustrationIndexEntryContent_IndexEntryTabStop() {
        return (EReference)getTextIllustrationIndexEntryContent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextIllustrationIndexEntryContent_StyleName() {
        return (EAttribute)getTextIllustrationIndexEntryContent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextInputType() {
		if (textInputTypeEClass == null) {
			textInputTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(412);
		}
		return textInputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputType_Mixed() {
        return (EAttribute)getTextInputType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputType_Description() {
        return (EAttribute)getTextInputType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextListItemContent() {
		if (textListItemContentEClass == null) {
			textListItemContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(413);
		}
		return textListItemContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextListItemContent_Number() {
        return (EAttribute)getTextListItemContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextListItemContent_Group() {
        return (EAttribute)getTextListItemContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextListItemContent_P() {
        return (EReference)getTextListItemContent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextListItemContent_H() {
        return (EReference)getTextListItemContent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextListItemContent_List() {
        return (EReference)getTextListItemContent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextListItemContent_SoftPageBreak() {
        return (EReference)getTextListItemContent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextListLevelStyleImageAttr() {
		if (textListLevelStyleImageAttrEClass == null) {
			textListLevelStyleImageAttrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(414);
		}
		return textListLevelStyleImageAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextListLevelStyleImageAttr_BinaryData() {
        return (EAttribute)getTextListLevelStyleImageAttr().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextListLevelStyleImageAttr_Actuate() {
        return (EAttribute)getTextListLevelStyleImageAttr().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextListLevelStyleImageAttr_Href() {
        return (EAttribute)getTextListLevelStyleImageAttr().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextListLevelStyleImageAttr_Show() {
        return (EAttribute)getTextListLevelStyleImageAttr().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextListLevelStyleImageAttr_Type() {
        return (EAttribute)getTextListLevelStyleImageAttr().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextNotesConfigurationContent() {
		if (textNotesConfigurationContentEClass == null) {
			textNotesConfigurationContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(415);
		}
		return textNotesConfigurationContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_Group() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_NoteContinuationNoticeForward() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_NoteContinuationNoticeBackward() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_CitationBodyStyleName() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_CitationStyleName() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_DefaultStyleName() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_FootnotesPosition() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_MasterPageName() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_NoteClass() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_NumFormat() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_NumLetterSync() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_NumPrefix() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_NumSuffix() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_StartNumberingAt() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextNotesConfigurationContent_StartValue() {
        return (EAttribute)getTextNotesConfigurationContent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextSectionSourceDdeType() {
		if (textSectionSourceDdeTypeEClass == null) {
			textSectionSourceDdeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(416);
		}
		return textSectionSourceDdeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSectionSourceDdeType_AutomaticUpdate() {
        return (EAttribute)getTextSectionSourceDdeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSectionSourceDdeType_ConversionMode() {
        return (EAttribute)getTextSectionSourceDdeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSectionSourceDdeType_DdeApplication() {
        return (EAttribute)getTextSectionSourceDdeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSectionSourceDdeType_DdeItem() {
        return (EAttribute)getTextSectionSourceDdeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSectionSourceDdeType_DdeTopic() {
        return (EAttribute)getTextSectionSourceDdeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextSectionSourceDdeType_Name() {
        return (EAttribute)getTextSectionSourceDdeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeType() {
		if (timeTypeEClass == null) {
			timeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(419);
		}
		return timeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Mixed() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_DataStyleName() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Fixed() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_TimeAdjust() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_TimeValue() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitleType() {
		if (titleTypeEClass == null) {
			titleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(420);
		}
		return titleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_Mixed() {
        return (EAttribute)getTitleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_Fixed() {
        return (EAttribute)getTitleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTocMarkEndType() {
		if (tocMarkEndTypeEClass == null) {
			tocMarkEndTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(421);
		}
		return tocMarkEndTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTocMarkEndType_Id() {
        return (EAttribute)getTocMarkEndType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTocMarkStartType() {
		if (tocMarkStartTypeEClass == null) {
			tocMarkStartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(422);
		}
		return tocMarkStartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTocMarkStartType_Id() {
        return (EAttribute)getTocMarkStartType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTocMarkStartType_OutlineLevel() {
        return (EAttribute)getTocMarkStartType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTocMarkType() {
		if (tocMarkTypeEClass == null) {
			tocMarkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(423);
		}
		return tocMarkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTocMarkType_OutlineLevel() {
        return (EAttribute)getTocMarkType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTocMarkType_StringValue() {
        return (EAttribute)getTocMarkType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrackedChangesType() {
		if (trackedChangesTypeEClass == null) {
			trackedChangesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(424);
		}
		return trackedChangesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrackedChangesType_ChangedRegion() {
        return (EReference)getTrackedChangesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrackedChangesType_TrackChanges() {
        return (EAttribute)getTrackedChangesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedType() {
		if (userDefinedTypeEClass == null) {
			userDefinedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(427);
		}
		return userDefinedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_Mixed() {
        return (EAttribute)getUserDefinedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_BooleanValue() {
        return (EAttribute)getUserDefinedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_DataStyleName() {
        return (EAttribute)getUserDefinedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_DateValue() {
        return (EAttribute)getUserDefinedType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_Fixed() {
        return (EAttribute)getUserDefinedType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_Name() {
        return (EAttribute)getUserDefinedType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_StringValue() {
        return (EAttribute)getUserDefinedType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_TimeValue() {
        return (EAttribute)getUserDefinedType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_Value() {
        return (EAttribute)getUserDefinedType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserFieldDeclsType() {
		if (userFieldDeclsTypeEClass == null) {
			userFieldDeclsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(428);
		}
		return userFieldDeclsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserFieldDeclsType_UserFieldDecl() {
        return (EReference)getUserFieldDeclsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserFieldDeclType() {
		if (userFieldDeclTypeEClass == null) {
			userFieldDeclTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(429);
		}
		return userFieldDeclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldDeclType_BooleanValue() {
        return (EAttribute)getUserFieldDeclType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldDeclType_Currency() {
        return (EAttribute)getUserFieldDeclType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldDeclType_DateValue() {
        return (EAttribute)getUserFieldDeclType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldDeclType_Formula() {
        return (EAttribute)getUserFieldDeclType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldDeclType_Name() {
        return (EAttribute)getUserFieldDeclType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldDeclType_StringValue() {
        return (EAttribute)getUserFieldDeclType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldDeclType_TimeValue() {
        return (EAttribute)getUserFieldDeclType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldDeclType_Value() {
        return (EAttribute)getUserFieldDeclType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldDeclType_ValueType() {
        return (EAttribute)getUserFieldDeclType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserFieldGetType() {
		if (userFieldGetTypeEClass == null) {
			userFieldGetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(430);
		}
		return userFieldGetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldGetType_Mixed() {
        return (EAttribute)getUserFieldGetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldGetType_DataStyleName() {
        return (EAttribute)getUserFieldGetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldGetType_Display() {
        return (EAttribute)getUserFieldGetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldGetType_Name() {
        return (EAttribute)getUserFieldGetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserFieldInputType() {
		if (userFieldInputTypeEClass == null) {
			userFieldInputTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(431);
		}
		return userFieldInputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldInputType_Mixed() {
        return (EAttribute)getUserFieldInputType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldInputType_DataStyleName() {
        return (EAttribute)getUserFieldInputType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldInputType_Description() {
        return (EAttribute)getUserFieldInputType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserFieldInputType_Name() {
        return (EAttribute)getUserFieldInputType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserIndexEntryTemplateType() {
		if (userIndexEntryTemplateTypeEClass == null) {
			userIndexEntryTemplateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(432);
		}
		return userIndexEntryTemplateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexEntryTemplateType_Group() {
        return (EAttribute)getUserIndexEntryTemplateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserIndexEntryTemplateType_IndexEntryChapter() {
        return (EReference)getUserIndexEntryTemplateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserIndexEntryTemplateType_IndexEntryPageNumber() {
        return (EReference)getUserIndexEntryTemplateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserIndexEntryTemplateType_IndexEntryText() {
        return (EReference)getUserIndexEntryTemplateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserIndexEntryTemplateType_IndexEntrySpan() {
        return (EReference)getUserIndexEntryTemplateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserIndexEntryTemplateType_IndexEntryTabStop() {
        return (EReference)getUserIndexEntryTemplateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexEntryTemplateType_OutlineLevel() {
        return (EAttribute)getUserIndexEntryTemplateType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexEntryTemplateType_StyleName() {
        return (EAttribute)getUserIndexEntryTemplateType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserIndexMarkEndType() {
		if (userIndexMarkEndTypeEClass == null) {
			userIndexMarkEndTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(433);
		}
		return userIndexMarkEndTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexMarkEndType_Id() {
        return (EAttribute)getUserIndexMarkEndType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexMarkEndType_OutlineLevel() {
        return (EAttribute)getUserIndexMarkEndType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserIndexMarkStartType() {
		if (userIndexMarkStartTypeEClass == null) {
			userIndexMarkStartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(434);
		}
		return userIndexMarkStartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexMarkStartType_Id() {
        return (EAttribute)getUserIndexMarkStartType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexMarkStartType_IndexName() {
        return (EAttribute)getUserIndexMarkStartType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexMarkStartType_OutlineLevel() {
        return (EAttribute)getUserIndexMarkStartType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserIndexMarkType() {
		if (userIndexMarkTypeEClass == null) {
			userIndexMarkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(435);
		}
		return userIndexMarkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexMarkType_IndexName() {
        return (EAttribute)getUserIndexMarkType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexMarkType_OutlineLevel() {
        return (EAttribute)getUserIndexMarkType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexMarkType_StringValue() {
        return (EAttribute)getUserIndexMarkType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserIndexSourceType() {
		if (userIndexSourceTypeEClass == null) {
			userIndexSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(436);
		}
		return userIndexSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserIndexSourceType_IndexTitleTemplate() {
        return (EReference)getUserIndexSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserIndexSourceType_UserIndexEntryTemplate() {
        return (EReference)getUserIndexSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserIndexSourceType_IndexSourceStyles() {
        return (EReference)getUserIndexSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexSourceType_CopyOutlineLevels() {
        return (EAttribute)getUserIndexSourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexSourceType_IndexName() {
        return (EAttribute)getUserIndexSourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexSourceType_IndexScope() {
        return (EAttribute)getUserIndexSourceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexSourceType_RelativeTabStopPosition() {
        return (EAttribute)getUserIndexSourceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexSourceType_UseFloatingFrames() {
        return (EAttribute)getUserIndexSourceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexSourceType_UseGraphics() {
        return (EAttribute)getUserIndexSourceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexSourceType_UseIndexMarks() {
        return (EAttribute)getUserIndexSourceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexSourceType_UseObjects() {
        return (EAttribute)getUserIndexSourceType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexSourceType_UseTables() {
        return (EAttribute)getUserIndexSourceType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserIndexType() {
		if (userIndexTypeEClass == null) {
			userIndexTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(437);
		}
		return userIndexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserIndexType_UserIndexSource() {
        return (EReference)getUserIndexType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserIndexType_IndexBody() {
        return (EReference)getUserIndexType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexType_Name() {
        return (EAttribute)getUserIndexType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexType_Protected() {
        return (EAttribute)getUserIndexType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexType_ProtectionKey() {
        return (EAttribute)getUserIndexType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserIndexType_StyleName() {
        return (EAttribute)getUserIndexType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclsType() {
		if (variableDeclsTypeEClass == null) {
			variableDeclsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(440);
		}
		return variableDeclsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclsType_VariableDecl() {
        return (EReference)getVariableDeclsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclType() {
		if (variableDeclTypeEClass == null) {
			variableDeclTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(441);
		}
		return variableDeclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclType_Name() {
        return (EAttribute)getVariableDeclType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclType_ValueType() {
        return (EAttribute)getVariableDeclType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableGetType() {
		if (variableGetTypeEClass == null) {
			variableGetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(442);
		}
		return variableGetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableGetType_Mixed() {
        return (EAttribute)getVariableGetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableGetType_DataStyleName() {
        return (EAttribute)getVariableGetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableGetType_Display() {
        return (EAttribute)getVariableGetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableGetType_Name() {
        return (EAttribute)getVariableGetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableInputType() {
		if (variableInputTypeEClass == null) {
			variableInputTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(443);
		}
		return variableInputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableInputType_Mixed() {
        return (EAttribute)getVariableInputType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableInputType_DataStyleName() {
        return (EAttribute)getVariableInputType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableInputType_Description() {
        return (EAttribute)getVariableInputType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableInputType_Display() {
        return (EAttribute)getVariableInputType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableInputType_Name() {
        return (EAttribute)getVariableInputType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableInputType_ValueType() {
        return (EAttribute)getVariableInputType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableSetType() {
		if (variableSetTypeEClass == null) {
			variableSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(445);
		}
		return variableSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSetType_Mixed() {
        return (EAttribute)getVariableSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSetType_BooleanValue() {
        return (EAttribute)getVariableSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSetType_Currency() {
        return (EAttribute)getVariableSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSetType_DataStyleName() {
        return (EAttribute)getVariableSetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSetType_DateValue() {
        return (EAttribute)getVariableSetType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSetType_Display() {
        return (EAttribute)getVariableSetType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSetType_Formula() {
        return (EAttribute)getVariableSetType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSetType_Name() {
        return (EAttribute)getVariableSetType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSetType_StringValue() {
        return (EAttribute)getVariableSetType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSetType_TimeValue() {
        return (EAttribute)getVariableSetType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSetType_Value() {
        return (EAttribute)getVariableSetType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSetType_ValueType() {
        return (EAttribute)getVariableSetType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWordCountType() {
		if (wordCountTypeEClass == null) {
			wordCountTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(451);
		}
		return wordCountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWordCountType_Mixed() {
        return (EAttribute)getWordCountType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWordCountType_NumFormat() {
        return (EAttribute)getWordCountType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWordCountType_NumLetterSync() {
        return (EAttribute)getWordCountType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(452);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_A() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AlphabeticalIndex() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AlphabeticalIndexAutoMarkFile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AlphabeticalIndexEntryTemplate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AlphabeticalIndexMark() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AlphabeticalIndexMarkEnd() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AlphabeticalIndexMarkStart() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AlphabeticalIndexSource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AnimationElement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AnyNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuthorInitials() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuthorName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OfficeMetaData() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bibliography() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BibliographyConfiguration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BibliographyEntryTemplate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BibliographyMark() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BibliographySource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bookmark() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BookmarkEnd() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BookmarkRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BookmarkStart() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Controls() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Change() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeMarks() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangedRegion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeEnd() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeStart() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Chapter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CharacterCount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OfficeChartContentMain() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OfficeBodyContent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ColumnControls() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConditionalText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CreationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CreationTime() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Creator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Shapes3d() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DatabaseDisplay() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DatabaseName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DatabaseNext() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DatabaseRowNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DatabaseRowSelect() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Date() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PresentationDecl() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DdeConnection() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DdeConnectionDecl() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DdeConnectionDecls() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TextSectionSourceDde() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Deletion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TextChangedRegionContent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Description() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PresentationAnimationElements() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EditingCycles() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EditingDuration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExecuteMacro() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Expression() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FileName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FormatChange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FormProperty() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_H() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HiddenParagraph() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HiddenText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IllustrationIndex() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IllustrationIndexEntryTemplate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IllustrationIndexSource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImageCount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexBody() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexEntryBibliography() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexEntryChapter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TextTableOfContentChildren() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexEntryLinkEnd() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexEntryLinkStart() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexEntryPageNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexEntrySpan() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexEntryTabStop() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexEntryText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexSourceStyle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexSourceStyles() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexTitle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IndexTitleTemplate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InitialCreator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Insertion() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Keywords() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LineBreak() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LinenumberingConfiguration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LinenumberingSeparator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_List() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListHeader() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListLevelStyleBullet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TextListStyleContent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListLevelStyleImage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListLevelStyleNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListStyle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Measure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModificationDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModificationTime() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Note() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NoteBody() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NoteCitation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NoteContinuationNoticeBackward() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NoteContinuationNoticeForward() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NoteRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NotesConfiguration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Number() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NumberedParagraph() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectCount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectIndex() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectIndexEntryTemplate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectIndexSource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OutlineLevelStyle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OutlineStyle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_P() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Page() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PageContinuation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PageCount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PageNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PageSequence() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PageVariableGet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PageVariableSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ParagraphCount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Placeholder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PrintDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PrintedBy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PrintTime() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceMark() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceMarkEnd() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceMarkStart() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ruby() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RubyBase() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RubyText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_S() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Script() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Section() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SectionSource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderCity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderCompany() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderCountry() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderEmail() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderFax() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderFirstname() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderInitials() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderLastname() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderPhonePrivate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderPhoneWork() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderPosition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderPostalCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderStateOrProvince() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderStreet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SenderTitle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sequence() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SequenceDecl() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SequenceDecls() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SequenceRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SheetName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SoftPageBreak() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SortKey() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Span() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Subject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tab() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TableCount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TableFormula() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TableIndex() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TableIndexEntryTemplate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TableIndexSource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TableOfContent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TableOfContentEntryTemplate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TableOfContentSource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TemplateName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TextInput() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Time() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Title() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TocMark() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TocMarkEnd() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TocMarkStart() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TrackedChanges() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserDefined() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserFieldDecl() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserFieldDecls() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserFieldGet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserFieldInput() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserIndex() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserIndexEntryTemplate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserIndexMark() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserIndexMarkEnd() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserIndexMarkStart() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserIndexSource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VariableDecl() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VariableDecls() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VariableGet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VariableInput() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VariableSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WordCount() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnchorTypeType() {
		if (anchorTypeTypeEEnum == null) {
			anchorTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(7);
		}
		return anchorTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBibliographyDataFieldType() {
		if (bibliographyDataFieldTypeEEnum == null) {
			bibliographyDataFieldTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(16);
		}
		return bibliographyDataFieldTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBoolean() {
		if (booleanEEnum == null) {
			booleanEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(26);
		}
		return booleanEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCaptionSequenceFormatType() {
		if (captionSequenceFormatTypeEEnum == null) {
			captionSequenceFormatTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(31);
		}
		return captionSequenceFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCustomShapeTypeMember1() {
		if (customShapeTypeMember1EEnum == null) {
			customShapeTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(57);
		}
		return customShapeTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayType() {
		if (displayTypeEEnum == null) {
			displayTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(72);
		}
		return displayTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayType1() {
		if (displayType1EEnum == null) {
			displayType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(73);
		}
		return displayType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayType2() {
		if (displayType2EEnum == null) {
			displayType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(74);
		}
		return displayType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayType3() {
		if (displayType3EEnum == null) {
			displayType3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(75);
		}
		return displayType3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayType4() {
		if (displayType4EEnum == null) {
			displayType4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(76);
		}
		return displayType4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayType5() {
		if (displayType5EEnum == null) {
			displayType5EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(77);
		}
		return displayType5EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayType6() {
		if (displayType6EEnum == null) {
			displayType6EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(78);
		}
		return displayType6EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayType7() {
		if (displayType7EEnum == null) {
			displayType7EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(79);
		}
		return displayType7EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontFamilyGeneric() {
		if (fontFamilyGenericEEnum == null) {
			fontFamilyGenericEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(97);
		}
		return fontFamilyGenericEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontPitch() {
		if (fontPitchEEnum == null) {
			fontPitchEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(99);
		}
		return fontPitchEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontStyle() {
		if (fontStyleEEnum == null) {
			fontStyleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(101);
		}
		return fontStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontVariant() {
		if (fontVariantEEnum == null) {
			fontVariantEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(103);
		}
		return fontVariantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontWeight() {
		if (fontWeightEEnum == null) {
			fontWeightEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(105);
		}
		return fontWeightEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFootnotesPositionType() {
		if (footnotesPositionTypeEEnum == null) {
			footnotesPositionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(107);
		}
		return footnotesPositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGradientStyle() {
		if (gradientStyleEEnum == null) {
			gradientStyleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(112);
		}
		return gradientStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHoriBackPos() {
		if (horiBackPosEEnum == null) {
			horiBackPosEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(117);
		}
		return horiBackPosEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHorizontalMirror() {
		if (horizontalMirrorEEnum == null) {
			horizontalMirrorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(119);
		}
		return horizontalMirrorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndexScopeType() {
		if (indexScopeTypeEEnum == null) {
			indexScopeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(137);
		}
		return indexScopeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndexScopeType1() {
		if (indexScopeType1EEnum == null) {
			indexScopeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(138);
		}
		return indexScopeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKeyType() {
		if (keyTypeEEnum == null) {
			keyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(148);
		}
		return keyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKindType() {
		if (kindTypeEEnum == null) {
			kindTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(151);
		}
		return kindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineMode() {
		if (lineModeEEnum == null) {
			lineModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(157);
		}
		return lineModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineStyle() {
		if (lineStyleEEnum == null) {
			lineStyleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(161);
		}
		return lineStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineType() {
		if (lineTypeEEnum == null) {
			lineTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(163);
		}
		return lineTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineWidthMember3() {
		if (lineWidthMember3EEnum == null) {
			lineWidthMember3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(166);
		}
		return lineWidthMember3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineWidthMember4() {
		if (lineWidthMember4EEnum == null) {
			lineWidthMember4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(168);
		}
		return lineWidthMember4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineWidthMember5() {
		if (lineWidthMember5EEnum == null) {
			lineWidthMember5EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(170);
		}
		return lineWidthMember5EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineWidthMember6() {
		if (lineWidthMember6EEnum == null) {
			lineWidthMember6EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(172);
		}
		return lineWidthMember6EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineWidthMember7() {
		if (lineWidthMember7EEnum == null) {
			lineWidthMember7EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(174);
		}
		return lineWidthMember7EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineWidthMember8() {
		if (lineWidthMember8EEnum == null) {
			lineWidthMember8EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(176);
		}
		return lineWidthMember8EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineWidthMember9() {
		if (lineWidthMember9EEnum == null) {
			lineWidthMember9EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(178);
		}
		return lineWidthMember9EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNavigation() {
		if (navigationEEnum == null) {
			navigationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(197);
		}
		return navigationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNoteClassType() {
		if (noteClassTypeEEnum == null) {
			noteClassTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(204);
		}
		return noteClassTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberPositionType() {
		if (numberPositionTypeEEnum == null) {
			numberPositionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(209);
		}
		return numberPositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOutlineLevelType() {
		if (outlineLevelTypeEEnum == null) {
			outlineLevelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(220);
		}
		return outlineLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlaceholderTypeType() {
		if (placeholderTypeTypeEEnum == null) {
			placeholderTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(236);
		}
		return placeholderTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPresentationClasses() {
		if (presentationClassesEEnum == null) {
			presentationClassesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(242);
		}
		return presentationClassesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPresentationEffectDirections() {
		if (presentationEffectDirectionsEEnum == null) {
			presentationEffectDirectionsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(244);
		}
		return presentationEffectDirectionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPresentationEffects() {
		if (presentationEffectsEEnum == null) {
			presentationEffectsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(246);
		}
		return presentationEffectsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPresentationSpeeds() {
		if (presentationSpeedsEEnum == null) {
			presentationSpeedsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(248);
		}
		return presentationSpeedsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceFormatType() {
		if (referenceFormatTypeEEnum == null) {
			referenceFormatTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(254);
		}
		return referenceFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceFormatType1() {
		if (referenceFormatType1EEnum == null) {
			referenceFormatType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(255);
		}
		return referenceFormatType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRowOrCol() {
		if (rowOrColEEnum == null) {
			rowOrColEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(264);
		}
		return rowOrColEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSelectPageType() {
		if (selectPageTypeEEnum == null) {
			selectPageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(272);
		}
		return selectPageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSelectPageType1() {
		if (selectPageType1EEnum == null) {
			selectPageType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(273);
		}
		return selectPageType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShadowTypeMember1() {
		if (shadowTypeMember1EEnum == null) {
			shadowTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(296);
		}
		return shadowTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStartNumberingAtType() {
		if (startNumberingAtTypeEEnum == null) {
			startNumberingAtTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(301);
		}
		return startNumberingAtTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStates() {
		if (statesEEnum == null) {
			statesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(303);
		}
		return statesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTabCycles() {
		if (tabCyclesEEnum == null) {
			tabCyclesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(379);
		}
		return tabCyclesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTableTypeType() {
		if (tableTypeTypeEEnum == null) {
			tableTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(389);
		}
		return tableTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTableVisibilityValue() {
		if (tableVisibilityValueEEnum == null) {
			tableVisibilityValueEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(391);
		}
		return tableVisibilityValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTargetFrameNameMember1() {
		if (targetFrameNameMember1EEnum == null) {
			targetFrameNameMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(395);
		}
		return targetFrameNameMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTargetFrameNameMember2() {
		if (targetFrameNameMember2EEnum == null) {
			targetFrameNameMember2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(397);
		}
		return targetFrameNameMember2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTargetFrameNameMember3() {
		if (targetFrameNameMember3EEnum == null) {
			targetFrameNameMember3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(399);
		}
		return targetFrameNameMember3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTargetFrameNameMember4() {
		if (targetFrameNameMember4EEnum == null) {
			targetFrameNameMember4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(401);
		}
		return targetFrameNameMember4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextBibliographyTypes() {
		if (textBibliographyTypesEEnum == null) {
			textBibliographyTypesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(404);
		}
		return textBibliographyTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypes() {
		if (typesEEnum == null) {
			typesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(425);
		}
		return typesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValueType() {
		if (valueTypeEEnum == null) {
			valueTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(438);
		}
		return valueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVertBackPos() {
		if (vertBackPosEEnum == null) {
			vertBackPosEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(447);
		}
		return vertBackPosEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnchorTypeTypeObject() {
		if (anchorTypeTypeObjectEDataType == null) {
			anchorTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(8);
		}
		return anchorTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnyURI() {
		if (anyURIEDataType == null) {
			anyURIEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(10);
		}
		return anyURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBase64Binary() {
		if (base64BinaryEDataType == null) {
			base64BinaryEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(14);
		}
		return base64BinaryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBibliographyDataFieldTypeObject() {
		if (bibliographyDataFieldTypeObjectEDataType == null) {
			bibliographyDataFieldTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(17);
		}
		return bibliographyDataFieldTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanObject() {
		if (booleanObjectEDataType == null) {
			booleanObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(27);
		}
		return booleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBorderWidths() {
		if (borderWidthsEDataType == null) {
			borderWidthsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(28);
		}
		return borderWidthsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBorderWidthsBase() {
		if (borderWidthsBaseEDataType == null) {
			borderWidthsBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(29);
		}
		return borderWidthsBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBorderWidthsBaseItem() {
		if (borderWidthsBaseItemEDataType == null) {
			borderWidthsBaseItemEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(30);
		}
		return borderWidthsBaseItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCaptionSequenceFormatTypeObject() {
		if (captionSequenceFormatTypeObjectEDataType == null) {
			captionSequenceFormatTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(32);
		}
		return captionSequenceFormatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCellAddress() {
		if (cellAddressEDataType == null) {
			cellAddressEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(33);
		}
		return cellAddressEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCellRangeAddress() {
		if (cellRangeAddressEDataType == null) {
			cellRangeAddressEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(34);
		}
		return cellRangeAddressEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCellRangeAddressList() {
		if (cellRangeAddressListEDataType == null) {
			cellRangeAddressListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(35);
		}
		return cellRangeAddressListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharacter() {
		if (characterEDataType == null) {
			characterEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(39);
		}
		return characterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCitationBodyStyleNameType() {
		if (citationBodyStyleNameTypeEDataType == null) {
			citationBodyStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(41);
		}
		return citationBodyStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCitationBodyStyleNameTypeMember1() {
		if (citationBodyStyleNameTypeMember1EDataType == null) {
			citationBodyStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(42);
		}
		return citationBodyStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCitationStyleNameType() {
		if (citationStyleNameTypeEDataType == null) {
			citationStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(43);
		}
		return citationStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCitationStyleNameTypeMember1() {
		if (citationStyleNameTypeMember1EDataType == null) {
			citationStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(44);
		}
		return citationStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		if (colorEDataType == null) {
			colorEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(45);
		}
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCondStyleNameType() {
		if (condStyleNameTypeEDataType == null) {
			condStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(48);
		}
		return condStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCondStyleNameTypeMember1() {
		if (condStyleNameTypeMember1EDataType == null) {
			condStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(49);
		}
		return condStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCoordinate() {
		if (coordinateEDataType == null) {
			coordinateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(51);
		}
		return coordinateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCountryCode() {
		if (countryCodeEDataType == null) {
			countryCodeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(52);
		}
		return countryCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCustomShapeType() {
		if (customShapeTypeEDataType == null) {
			customShapeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(56);
		}
		return customShapeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCustomShapeTypeMember1Object() {
		if (customShapeTypeMember1ObjectEDataType == null) {
			customShapeTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(58);
		}
		return customShapeTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		if (dateEDataType == null) {
			dateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(61);
		}
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateOrDateTime() {
		if (dateOrDateTimeEDataType == null) {
			dateOrDateTimeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(62);
		}
		return dateOrDateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTime() {
		if (dateTimeEDataType == null) {
			dateTimeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(63);
		}
		return dateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefaultStyleNameType() {
		if (defaultStyleNameTypeEDataType == null) {
			defaultStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(68);
		}
		return defaultStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefaultStyleNameTypeMember1() {
		if (defaultStyleNameTypeMember1EDataType == null) {
			defaultStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(69);
		}
		return defaultStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisplayTypeObject() {
		if (displayTypeObjectEDataType == null) {
			displayTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(80);
		}
		return displayTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisplayTypeObject1() {
		if (displayTypeObject1EDataType == null) {
			displayTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(81);
		}
		return displayTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisplayTypeObject2() {
		if (displayTypeObject2EDataType == null) {
			displayTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(82);
		}
		return displayTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisplayTypeObject3() {
		if (displayTypeObject3EDataType == null) {
			displayTypeObject3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(83);
		}
		return displayTypeObject3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisplayTypeObject4() {
		if (displayTypeObject4EDataType == null) {
			displayTypeObject4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(84);
		}
		return displayTypeObject4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisplayTypeObject5() {
		if (displayTypeObject5EDataType == null) {
			displayTypeObject5EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(85);
		}
		return displayTypeObject5EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisplayTypeObject6() {
		if (displayTypeObject6EDataType == null) {
			displayTypeObject6EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(86);
		}
		return displayTypeObject6EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisplayTypeObject7() {
		if (displayTypeObject7EDataType == null) {
			displayTypeObject7EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(87);
		}
		return displayTypeObject7EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDistance() {
		if (distanceEDataType == null) {
			distanceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(88);
		}
		return distanceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDouble() {
		if (doubleEDataType == null) {
			doubleEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(89);
		}
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDoubleObject() {
		if (doubleObjectEDataType == null) {
			doubleObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(90);
		}
		return doubleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDuration() {
		if (durationEDataType == null) {
			durationEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(91);
		}
		return durationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontFamilyGenericObject() {
		if (fontFamilyGenericObjectEDataType == null) {
			fontFamilyGenericObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(98);
		}
		return fontFamilyGenericObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontPitchObject() {
		if (fontPitchObjectEDataType == null) {
			fontPitchObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(100);
		}
		return fontPitchObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontStyleObject() {
		if (fontStyleObjectEDataType == null) {
			fontStyleObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(102);
		}
		return fontStyleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontVariantObject() {
		if (fontVariantObjectEDataType == null) {
			fontVariantObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(104);
		}
		return fontVariantObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontWeightObject() {
		if (fontWeightObjectEDataType == null) {
			fontWeightObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(106);
		}
		return fontWeightObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFootnotesPositionTypeObject() {
		if (footnotesPositionTypeObjectEDataType == null) {
			footnotesPositionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(108);
		}
		return footnotesPositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFormula() {
		if (formulaEDataType == null) {
			formulaEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(111);
		}
		return formulaEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGradientStyleObject() {
		if (gradientStyleObjectEDataType == null) {
			gradientStyleObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(113);
		}
		return gradientStyleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHoriBackPosObject() {
		if (horiBackPosObjectEDataType == null) {
			horiBackPosObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(118);
		}
		return horiBackPosObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHorizontalMirrorObject() {
		if (horizontalMirrorObjectEDataType == null) {
			horizontalMirrorObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(120);
		}
		return horizontalMirrorObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getID() {
		if (idEDataType == null) {
			idEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(122);
		}
		return idEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIDREF() {
		if (idrefEDataType == null) {
			idrefEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(123);
		}
		return idrefEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIDREFS() {
		if (idrefsEDataType == null) {
			idrefsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(124);
		}
		return idrefsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIndexScopeTypeObject() {
		if (indexScopeTypeObjectEDataType == null) {
			indexScopeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(139);
		}
		return indexScopeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIndexScopeTypeObject1() {
		if (indexScopeTypeObject1EDataType == null) {
			indexScopeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(140);
		}
		return indexScopeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		if (integerEDataType == null) {
			integerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(147);
		}
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKeyTypeObject() {
		if (keyTypeObjectEDataType == null) {
			keyTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(149);
		}
		return keyTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKindTypeObject() {
		if (kindTypeObjectEDataType == null) {
			kindTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(152);
		}
		return kindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLanguage() {
		if (languageEDataType == null) {
			languageEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(153);
		}
		return languageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLanguageCode() {
		if (languageCodeEDataType == null) {
			languageCodeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(154);
		}
		return languageCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLength() {
		if (lengthEDataType == null) {
			lengthEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(155);
		}
		return lengthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineModeObject() {
		if (lineModeObjectEDataType == null) {
			lineModeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(158);
		}
		return lineModeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineStyleObject() {
		if (lineStyleObjectEDataType == null) {
			lineStyleObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(162);
		}
		return lineStyleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineTypeObject() {
		if (lineTypeObjectEDataType == null) {
			lineTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(164);
		}
		return lineTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineWidth() {
		if (lineWidthEDataType == null) {
			lineWidthEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(165);
		}
		return lineWidthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineWidthMember3Object() {
		if (lineWidthMember3ObjectEDataType == null) {
			lineWidthMember3ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(167);
		}
		return lineWidthMember3ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineWidthMember4Object() {
		if (lineWidthMember4ObjectEDataType == null) {
			lineWidthMember4ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(169);
		}
		return lineWidthMember4ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineWidthMember5Object() {
		if (lineWidthMember5ObjectEDataType == null) {
			lineWidthMember5ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(171);
		}
		return lineWidthMember5ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineWidthMember6Object() {
		if (lineWidthMember6ObjectEDataType == null) {
			lineWidthMember6ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(173);
		}
		return lineWidthMember6ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineWidthMember7Object() {
		if (lineWidthMember7ObjectEDataType == null) {
			lineWidthMember7ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(175);
		}
		return lineWidthMember7ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineWidthMember8Object() {
		if (lineWidthMember8ObjectEDataType == null) {
			lineWidthMember8ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(177);
		}
		return lineWidthMember8ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineWidthMember9Object() {
		if (lineWidthMember9ObjectEDataType == null) {
			lineWidthMember9ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(179);
		}
		return lineWidthMember9ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMainEntryStyleNameType() {
		if (mainEntryStyleNameTypeEDataType == null) {
			mainEntryStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(186);
		}
		return mainEntryStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMainEntryStyleNameTypeMember1() {
		if (mainEntryStyleNameTypeMember1EDataType == null) {
			mainEntryStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(187);
		}
		return mainEntryStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMasterPageNameType() {
		if (masterPageNameTypeEDataType == null) {
			masterPageNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(188);
		}
		return masterPageNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMasterPageNameType1() {
		if (masterPageNameType1EDataType == null) {
			masterPageNameType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(189);
		}
		return masterPageNameType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMasterPageNameTypeMember1() {
		if (masterPageNameTypeMember1EDataType == null) {
			masterPageNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(190);
		}
		return masterPageNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMasterPageNameTypeMember11() {
		if (masterPageNameTypeMember11EDataType == null) {
			masterPageNameTypeMember11EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(191);
		}
		return masterPageNameTypeMember11EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNamespacedToken() {
		if (namespacedTokenEDataType == null) {
			namespacedTokenEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(196);
		}
		return namespacedTokenEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNavigationObject() {
		if (navigationObjectEDataType == null) {
			navigationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(198);
		}
		return navigationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonNegativeInteger() {
		if (nonNegativeIntegerEDataType == null) {
			nonNegativeIntegerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(199);
		}
		return nonNegativeIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonNegativeLength() {
		if (nonNegativeLengthEDataType == null) {
			nonNegativeLengthEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(200);
		}
		return nonNegativeLengthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonNegativePixelLength() {
		if (nonNegativePixelLengthEDataType == null) {
			nonNegativePixelLengthEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(201);
		}
		return nonNegativePixelLengthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNoteClassTypeObject() {
		if (noteClassTypeObjectEDataType == null) {
			noteClassTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(205);
		}
		return noteClassTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumberPositionTypeObject() {
		if (numberPositionTypeObjectEDataType == null) {
			numberPositionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(210);
		}
		return numberPositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOutlineLevelTypeObject() {
		if (outlineLevelTypeObjectEDataType == null) {
			outlineLevelTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(221);
		}
		return outlineLevelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParagraphStyleNameType() {
		if (paragraphStyleNameTypeEDataType == null) {
			paragraphStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(231);
		}
		return paragraphStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParagraphStyleNameTypeMember1() {
		if (paragraphStyleNameTypeMember1EDataType == null) {
			paragraphStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(232);
		}
		return paragraphStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPathData() {
		if (pathDataEDataType == null) {
			pathDataEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(233);
		}
		return pathDataEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercent() {
		if (percentEDataType == null) {
			percentEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(234);
		}
		return percentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPlaceholderTypeTypeObject() {
		if (placeholderTypeTypeObjectEDataType == null) {
			placeholderTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(237);
		}
		return placeholderTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint3D() {
		if (point3DEDataType == null) {
			point3DEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(238);
		}
		return point3DEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoints() {
		if (pointsEDataType == null) {
			pointsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(239);
		}
		return pointsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveInteger() {
		if (positiveIntegerEDataType == null) {
			positiveIntegerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(240);
		}
		return positiveIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveLength() {
		if (positiveLengthEDataType == null) {
			positiveLengthEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(241);
		}
		return positiveLengthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPresentationClassesObject() {
		if (presentationClassesObjectEDataType == null) {
			presentationClassesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(243);
		}
		return presentationClassesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPresentationEffectDirectionsObject() {
		if (presentationEffectDirectionsObjectEDataType == null) {
			presentationEffectDirectionsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(245);
		}
		return presentationEffectDirectionsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPresentationEffectsObject() {
		if (presentationEffectsObjectEDataType == null) {
			presentationEffectsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(247);
		}
		return presentationEffectsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPresentationSpeedsObject() {
		if (presentationSpeedsObjectEDataType == null) {
			presentationSpeedsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(249);
		}
		return presentationSpeedsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReferenceFormatTypeObject() {
		if (referenceFormatTypeObjectEDataType == null) {
			referenceFormatTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(256);
		}
		return referenceFormatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReferenceFormatTypeObject1() {
		if (referenceFormatTypeObject1EDataType == null) {
			referenceFormatTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(257);
		}
		return referenceFormatTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelativeLength() {
		if (relativeLengthEDataType == null) {
			relativeLengthEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(263);
		}
		return relativeLengthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRowOrColObject() {
		if (rowOrColObjectEDataType == null) {
			rowOrColObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(265);
		}
		return rowOrColObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSelectPageTypeObject() {
		if (selectPageTypeObjectEDataType == null) {
			selectPageTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(274);
		}
		return selectPageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSelectPageTypeObject1() {
		if (selectPageTypeObject1EDataType == null) {
			selectPageTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(275);
		}
		return selectPageTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShadowType() {
		if (shadowTypeEDataType == null) {
			shadowTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(295);
		}
		return shadowTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShadowTypeMember1Object() {
		if (shadowTypeMember1ObjectEDataType == null) {
			shadowTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(297);
		}
		return shadowTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStartNumberingAtTypeObject() {
		if (startNumberingAtTypeObjectEDataType == null) {
			startNumberingAtTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(302);
		}
		return startNumberingAtTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStatesObject() {
		if (statesObjectEDataType == null) {
			statesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(304);
		}
		return statesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		if (stringEDataType == null) {
			stringEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(305);
		}
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleName() {
		if (styleNameEDataType == null) {
			styleNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(311);
		}
		return styleNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameRef() {
		if (styleNameRefEDataType == null) {
			styleNameRefEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(312);
		}
		return styleNameRefEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameRefs() {
		if (styleNameRefsEDataType == null) {
			styleNameRefsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(313);
		}
		return styleNameRefsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType() {
		if (styleNameTypeEDataType == null) {
			styleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(314);
		}
		return styleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType1() {
		if (styleNameType1EDataType == null) {
			styleNameType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(315);
		}
		return styleNameType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType2() {
		if (styleNameType2EDataType == null) {
			styleNameType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(316);
		}
		return styleNameType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType3() {
		if (styleNameType3EDataType == null) {
			styleNameType3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(317);
		}
		return styleNameType3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType4() {
		if (styleNameType4EDataType == null) {
			styleNameType4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(318);
		}
		return styleNameType4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType5() {
		if (styleNameType5EDataType == null) {
			styleNameType5EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(319);
		}
		return styleNameType5EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType6() {
		if (styleNameType6EDataType == null) {
			styleNameType6EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(320);
		}
		return styleNameType6EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType7() {
		if (styleNameType7EDataType == null) {
			styleNameType7EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(321);
		}
		return styleNameType7EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType8() {
		if (styleNameType8EDataType == null) {
			styleNameType8EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(322);
		}
		return styleNameType8EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType9() {
		if (styleNameType9EDataType == null) {
			styleNameType9EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(323);
		}
		return styleNameType9EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType10() {
		if (styleNameType10EDataType == null) {
			styleNameType10EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(324);
		}
		return styleNameType10EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType11() {
		if (styleNameType11EDataType == null) {
			styleNameType11EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(325);
		}
		return styleNameType11EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType12() {
		if (styleNameType12EDataType == null) {
			styleNameType12EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(326);
		}
		return styleNameType12EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType13() {
		if (styleNameType13EDataType == null) {
			styleNameType13EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(327);
		}
		return styleNameType13EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType14() {
		if (styleNameType14EDataType == null) {
			styleNameType14EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(328);
		}
		return styleNameType14EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType15() {
		if (styleNameType15EDataType == null) {
			styleNameType15EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(329);
		}
		return styleNameType15EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType16() {
		if (styleNameType16EDataType == null) {
			styleNameType16EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(330);
		}
		return styleNameType16EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType17() {
		if (styleNameType17EDataType == null) {
			styleNameType17EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(331);
		}
		return styleNameType17EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType18() {
		if (styleNameType18EDataType == null) {
			styleNameType18EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(332);
		}
		return styleNameType18EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType19() {
		if (styleNameType19EDataType == null) {
			styleNameType19EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(333);
		}
		return styleNameType19EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType20() {
		if (styleNameType20EDataType == null) {
			styleNameType20EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(334);
		}
		return styleNameType20EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType21() {
		if (styleNameType21EDataType == null) {
			styleNameType21EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(335);
		}
		return styleNameType21EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType22() {
		if (styleNameType22EDataType == null) {
			styleNameType22EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(336);
		}
		return styleNameType22EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType23() {
		if (styleNameType23EDataType == null) {
			styleNameType23EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(337);
		}
		return styleNameType23EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType24() {
		if (styleNameType24EDataType == null) {
			styleNameType24EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(338);
		}
		return styleNameType24EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType25() {
		if (styleNameType25EDataType == null) {
			styleNameType25EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(339);
		}
		return styleNameType25EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember1() {
		if (styleNameTypeMember1EDataType == null) {
			styleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(340);
		}
		return styleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember11() {
		if (styleNameTypeMember11EDataType == null) {
			styleNameTypeMember11EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(341);
		}
		return styleNameTypeMember11EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember12() {
		if (styleNameTypeMember12EDataType == null) {
			styleNameTypeMember12EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(342);
		}
		return styleNameTypeMember12EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember13() {
		if (styleNameTypeMember13EDataType == null) {
			styleNameTypeMember13EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(343);
		}
		return styleNameTypeMember13EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember14() {
		if (styleNameTypeMember14EDataType == null) {
			styleNameTypeMember14EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(344);
		}
		return styleNameTypeMember14EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember15() {
		if (styleNameTypeMember15EDataType == null) {
			styleNameTypeMember15EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(345);
		}
		return styleNameTypeMember15EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember16() {
		if (styleNameTypeMember16EDataType == null) {
			styleNameTypeMember16EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(346);
		}
		return styleNameTypeMember16EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember17() {
		if (styleNameTypeMember17EDataType == null) {
			styleNameTypeMember17EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(347);
		}
		return styleNameTypeMember17EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember18() {
		if (styleNameTypeMember18EDataType == null) {
			styleNameTypeMember18EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(348);
		}
		return styleNameTypeMember18EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember19() {
		if (styleNameTypeMember19EDataType == null) {
			styleNameTypeMember19EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(349);
		}
		return styleNameTypeMember19EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember110() {
		if (styleNameTypeMember110EDataType == null) {
			styleNameTypeMember110EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(350);
		}
		return styleNameTypeMember110EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember111() {
		if (styleNameTypeMember111EDataType == null) {
			styleNameTypeMember111EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(351);
		}
		return styleNameTypeMember111EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember112() {
		if (styleNameTypeMember112EDataType == null) {
			styleNameTypeMember112EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(352);
		}
		return styleNameTypeMember112EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember113() {
		if (styleNameTypeMember113EDataType == null) {
			styleNameTypeMember113EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(353);
		}
		return styleNameTypeMember113EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember114() {
		if (styleNameTypeMember114EDataType == null) {
			styleNameTypeMember114EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(354);
		}
		return styleNameTypeMember114EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember115() {
		if (styleNameTypeMember115EDataType == null) {
			styleNameTypeMember115EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(355);
		}
		return styleNameTypeMember115EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember116() {
		if (styleNameTypeMember116EDataType == null) {
			styleNameTypeMember116EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(356);
		}
		return styleNameTypeMember116EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember117() {
		if (styleNameTypeMember117EDataType == null) {
			styleNameTypeMember117EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(357);
		}
		return styleNameTypeMember117EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember118() {
		if (styleNameTypeMember118EDataType == null) {
			styleNameTypeMember118EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(358);
		}
		return styleNameTypeMember118EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember119() {
		if (styleNameTypeMember119EDataType == null) {
			styleNameTypeMember119EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(359);
		}
		return styleNameTypeMember119EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember120() {
		if (styleNameTypeMember120EDataType == null) {
			styleNameTypeMember120EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(360);
		}
		return styleNameTypeMember120EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember121() {
		if (styleNameTypeMember121EDataType == null) {
			styleNameTypeMember121EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(361);
		}
		return styleNameTypeMember121EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember122() {
		if (styleNameTypeMember122EDataType == null) {
			styleNameTypeMember122EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(362);
		}
		return styleNameTypeMember122EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember123() {
		if (styleNameTypeMember123EDataType == null) {
			styleNameTypeMember123EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(363);
		}
		return styleNameTypeMember123EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember124() {
		if (styleNameTypeMember124EDataType == null) {
			styleNameTypeMember124EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(364);
		}
		return styleNameTypeMember124EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember125() {
		if (styleNameTypeMember125EDataType == null) {
			styleNameTypeMember125EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(365);
		}
		return styleNameTypeMember125EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTabCyclesObject() {
		if (tabCyclesObjectEDataType == null) {
			tabCyclesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(380);
		}
		return tabCyclesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTableTypeTypeObject() {
		if (tableTypeTypeObjectEDataType == null) {
			tableTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(390);
		}
		return tableTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTableVisibilityValueObject() {
		if (tableVisibilityValueObjectEDataType == null) {
			tableVisibilityValueObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(392);
		}
		return tableVisibilityValueObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTargetFrameName() {
		if (targetFrameNameEDataType == null) {
			targetFrameNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(394);
		}
		return targetFrameNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTargetFrameNameMember1Object() {
		if (targetFrameNameMember1ObjectEDataType == null) {
			targetFrameNameMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(396);
		}
		return targetFrameNameMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTargetFrameNameMember2Object() {
		if (targetFrameNameMember2ObjectEDataType == null) {
			targetFrameNameMember2ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(398);
		}
		return targetFrameNameMember2ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTargetFrameNameMember3Object() {
		if (targetFrameNameMember3ObjectEDataType == null) {
			targetFrameNameMember3ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(400);
		}
		return targetFrameNameMember3ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTargetFrameNameMember4Object() {
		if (targetFrameNameMember4ObjectEDataType == null) {
			targetFrameNameMember4ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(402);
		}
		return targetFrameNameMember4ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextBibliographyTypesObject() {
		if (textBibliographyTypesObjectEDataType == null) {
			textBibliographyTypesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(405);
		}
		return textBibliographyTypesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextEncoding() {
		if (textEncodingEDataType == null) {
			textEncodingEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(410);
		}
		return textEncodingEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTime() {
		if (timeEDataType == null) {
			timeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(417);
		}
		return timeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeOrDateTime() {
		if (timeOrDateTimeEDataType == null) {
			timeOrDateTimeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(418);
		}
		return timeOrDateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypesObject() {
		if (typesObjectEDataType == null) {
			typesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(426);
		}
		return typesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValueTypeObject() {
		if (valueTypeObjectEDataType == null) {
			valueTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(439);
		}
		return valueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVariableName() {
		if (variableNameEDataType == null) {
			variableNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(444);
		}
		return variableNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVector3D() {
		if (vector3DEDataType == null) {
			vector3DEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(446);
		}
		return vector3DEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVertBackPosObject() {
		if (vertBackPosObjectEDataType == null) {
			vertBackPosObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(448);
		}
		return vertBackPosObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVisitedStyleNameType() {
		if (visitedStyleNameTypeEDataType == null) {
			visitedStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(449);
		}
		return visitedStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVisitedStyleNameTypeMember1() {
		if (visitedStyleNameTypeMember1EDataType == null) {
			visitedStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI).getEClassifiers().get(450);
		}
		return visitedStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFactory getTextFactory() {
		return (TextFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.oasisopen.names.tc.opendocument.xmlns.text." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //TextPackageImpl
