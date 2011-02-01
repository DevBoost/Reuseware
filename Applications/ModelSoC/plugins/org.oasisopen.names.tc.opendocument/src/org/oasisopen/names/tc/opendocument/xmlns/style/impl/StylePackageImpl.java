/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleFactory;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.util.StyleValidator;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage;
import org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextPackageImpl;
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
public class StylePackageImpl extends EPackageImpl implements StylePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "style.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundImageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnSepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropCapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontFaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footerLeftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footerStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footnoteSepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handoutMasterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerLeftTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterPageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageLayoutTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationPageLayoutTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabStopsTypeEClass = null;

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
	private EClass tabStopTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adjustmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cellProtectTypeMember0EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cellProtectTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cellProtectTypeMember2BaseItemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum familyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum firstPageNumberTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontReliefTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glyphOrientationVerticalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum horizontalPosTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum horizontalRelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layoutGridModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum leaderColorTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legendExpansionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lengthTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineBreakTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mirrorTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mirrorTypeMember2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mirrorTypeMember3BaseItemMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mirrorTypeMember4BaseItemMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberWrappedParagraphsTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numFormatTypeMember0Member0Member1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numFormatTypeMember0Member0Member2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numFormatTypeMember0Member0Member3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numFormatTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum overflowBehaviorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pageNumberTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pageUsageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paperTrayNameTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionTypeMember0EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionTypeMember2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionTypeMember3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionTypeMember4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum printOrientationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum printPageOrderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum printTypeItemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum punctuationWrapTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relHeightTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relHeightTypeMember2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relWidthTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relWidthTypeMember2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum repeatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rotationAlignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rubyAlignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rubyPositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum runThroughTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scriptTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum styleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textAutospaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textCombineTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textEmphasizeTypeMember0EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textEmphasizeTypeMember1BaseItemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textLineThroughColorTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textPositionTypeBaseItemMember1Member1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textPositionTypeBaseItemMember1Member2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textRotationScaleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textUnderlineColorTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tableCenteringTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textAlignSourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verticalAlignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verticalPosTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verticalRelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wrapContourModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wrapTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum writingModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType adjustmentTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType applyStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType applyStyleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cellProtectTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cellProtectTypeMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cellProtectTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cellProtectTypeMember2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cellProtectTypeMember2BaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cellProtectTypeMember2BaseItemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataStyleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType directionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType familyTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType firstPageNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType firstPageNumberTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontReliefTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontSizeAsianTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontSizeComplexTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glyphOrientationVerticalTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType horizontalPosTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType horizontalRelTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType layoutGridModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType leaderColorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType leaderColorTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType leaderTextStyleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType leaderTextStyleTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType legendExpansionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lengthTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lengthTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineBreakTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listStyleNameTypeMember1EDataType = null;

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
	private EDataType masterPageNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mirrorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mirrorTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mirrorTypeMember2ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mirrorTypeMember3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mirrorTypeMember3BaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mirrorTypeMember3BaseItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mirrorTypeMember3BaseItemMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mirrorTypeMember4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mirrorTypeMember4BaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mirrorTypeMember4BaseItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mirrorTypeMember4BaseItemMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nextStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nextStyleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberWrappedParagraphsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberWrappedParagraphsTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numFormatTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numFormatTypeMember0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numFormatTypeMember0Member0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numFormatTypeMember0Member0Member1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numFormatTypeMember0Member0Member2ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numFormatTypeMember0Member0Member3ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numFormatTypeMember0Member1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numFormatTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType overflowBehaviorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pageLayoutNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pageLayoutNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pageNumberTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pageNumberTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pageUsageTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType paperTrayNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType paperTrayNameTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parentStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parentStyleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeMember2ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeMember3ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeMember4ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeMember5EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeMember5BaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeMember5BaseItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeMember6EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeMember6BaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionTypeMember6BaseItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType printOrientationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType printPageOrderTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType printTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType printTypeItemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType punctuationWrapTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType registerTruthRefStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType registerTruthRefStyleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relHeightTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relHeightTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relHeightTypeMember2ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relWidthTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relWidthTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relWidthTypeMember2ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType repeatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rotationAlignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rubyAlignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rubyPositionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType runThroughTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scriptTypeTypeObjectEDataType = null;

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
	private EDataType styleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textAutospaceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textCombineTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textEmphasizeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textEmphasizeTypeMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textEmphasizeTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textEmphasizeTypeMember1BaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textLineThroughColorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textLineThroughColorTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textLineThroughTextStyleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textLineThroughTextStyleTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textPositionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textPositionTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textPositionTypeBaseItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textPositionTypeBaseItemMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textPositionTypeBaseItemMember1Member1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textPositionTypeBaseItemMember1Member2ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textRotationScaleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textUnderlineColorTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tableCenteringTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textAlignSourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textEmphasizeTypeMember1BaseItemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textUnderlineColorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verticalAlignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verticalPosTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verticalRelTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wrapContourModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wrapTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType writingModeTypeObjectEDataType = null;

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StylePackageImpl() {
		super(eNS_URI, StyleFactory.eINSTANCE);
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
	public static StylePackage init() {
		if (isInited) return (StylePackage)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI);

		// Obtain or create and register package
		StylePackageImpl theStylePackage = (StylePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof StylePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new StylePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DrawingPackageImpl theDrawingPackage = (DrawingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI) instanceof DrawingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI) : DrawingPackage.eINSTANCE);
		TextPackageImpl theTextPackage = (TextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI) instanceof TextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI) : TextPackage.eINSTANCE);
		OfficePackageImpl theOfficePackage = (OfficePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OfficePackage.eNS_URI) instanceof OfficePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OfficePackage.eNS_URI) : OfficePackage.eINSTANCE);
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) instanceof ScriptPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) : ScriptPackage.eINSTANCE);
		XLinkPackageImpl theXLinkPackage = (XLinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI) instanceof XLinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI) : XLinkPackage.eINSTANCE);
		PresentationPackageImpl thePresentationPackage = (PresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) instanceof PresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) : PresentationPackage.eINSTANCE);
		SvgPackageImpl theSvgPackage = (SvgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI) instanceof SvgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI) : SvgPackage.eINSTANCE);
		Dr3dPackageImpl theDr3dPackage = (Dr3dPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Dr3dPackage.eNS_URI) instanceof Dr3dPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Dr3dPackage.eNS_URI) : Dr3dPackage.eINSTANCE);
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
		theStylePackage.loadPackage();
		theDrawingPackage.loadPackage();
		theTextPackage.loadPackage();
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
		theStylePackage.fixPackageContents();
		theDrawingPackage.fixPackageContents();
		theTextPackage.fixPackageContents();
		theFormPackage.fixPackageContents();
		theTablePackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theStylePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return StyleValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theStylePackage.freeze();

		return theStylePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackgroundImageType() {
		if (backgroundImageTypeEClass == null) {
			backgroundImageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(4);
		}
		return backgroundImageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundImageType_BinaryData() {
        return (EAttribute)getBackgroundImageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundImageType_Actuate() {
        return (EAttribute)getBackgroundImageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundImageType_FilterName() {
        return (EAttribute)getBackgroundImageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundImageType_Href() {
        return (EAttribute)getBackgroundImageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundImageType_Opacity() {
        return (EAttribute)getBackgroundImageType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundImageType_Position() {
        return (EAttribute)getBackgroundImageType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundImageType_Repeat() {
        return (EAttribute)getBackgroundImageType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundImageType_Show() {
        return (EAttribute)getBackgroundImageType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundImageType_Type() {
        return (EAttribute)getBackgroundImageType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnSepType() {
		if (columnSepTypeEClass == null) {
			columnSepTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(14);
		}
		return columnSepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnSepType_Color() {
        return (EAttribute)getColumnSepType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnSepType_Height() {
        return (EAttribute)getColumnSepType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnSepType_Style() {
        return (EAttribute)getColumnSepType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnSepType_VerticalAlign() {
        return (EAttribute)getColumnSepType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnSepType_Width() {
        return (EAttribute)getColumnSepType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnsType() {
		if (columnsTypeEClass == null) {
			columnsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(15);
		}
		return columnsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnsType_ColumnSep() {
        return (EReference)getColumnsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnsType_Column() {
        return (EReference)getColumnsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnsType_ColumnCount() {
        return (EAttribute)getColumnsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnsType_ColumnGap() {
        return (EAttribute)getColumnsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnType() {
		if (columnTypeEClass == null) {
			columnTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(16);
		}
		return columnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_EndIndent() {
        return (EAttribute)getColumnType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_RelWidth() {
        return (EAttribute)getColumnType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_SpaceAfter() {
        return (EAttribute)getColumnType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_SpaceBefore() {
        return (EAttribute)getColumnType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_StartIndent() {
        return (EAttribute)getColumnType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropCapType() {
		if (dropCapTypeEClass == null) {
			dropCapTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(21);
		}
		return dropCapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropCapType_Distance() {
        return (EAttribute)getDropCapType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropCapType_Length() {
        return (EAttribute)getDropCapType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropCapType_Lines() {
        return (EAttribute)getDropCapType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropCapType_StyleName() {
        return (EAttribute)getDropCapType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontFaceType() {
		if (fontFaceTypeEClass == null) {
			fontFaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(27);
		}
		return fontFaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFontFaceType_FontFaceSrc() {
        return (EReference)getFontFaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFontFaceType_DefinitionSrc() {
        return (EReference)getFontFaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_AccentHeight() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Alphabetic() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Ascent() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Bbox() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_CapHeight() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Descent() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_FontAdornments() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_FontCharset() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_FontFamily() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_FontFamilyGeneric() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_FontPitch() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_FontSize() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_FontStretch() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_FontStyle() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_FontVariant() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_FontWeight() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Hanging() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Ideographic() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Mathematical() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Name() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_OverlinePosition() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_OverlineThickness() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Panose1() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Slope() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Stemh() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Stemv() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_StrikethroughPosition() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_StrikethroughThickness() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_UnderlinePosition() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_UnderlineThickness() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_UnicodeRange() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_UnitsPerEm() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_VAlphabetic() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_VHanging() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_VIdeographic() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_VMathematical() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_Widths() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceType_XHeight() {
        return (EAttribute)getFontFaceType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFooterLeftType() {
		if (footerLeftTypeEClass == null) {
			footerLeftTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(32);
		}
		return footerLeftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFooterLeftType_Display() {
        return (EAttribute)getFooterLeftType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFooterStyleType() {
		if (footerStyleTypeEClass == null) {
			footerStyleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(33);
		}
		return footerStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFooterStyleType_HeaderFooterProperties() {
        return (EReference)getFooterStyleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFooterType() {
		if (footerTypeEClass == null) {
			footerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(34);
		}
		return footerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFooterType_Display() {
        return (EAttribute)getFooterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFootnoteSepType() {
		if (footnoteSepTypeEClass == null) {
			footnoteSepTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(35);
		}
		return footnoteSepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFootnoteSepType_Adjustment() {
        return (EAttribute)getFootnoteSepType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFootnoteSepType_Color() {
        return (EAttribute)getFootnoteSepType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFootnoteSepType_DistanceAfterSep() {
        return (EAttribute)getFootnoteSepType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFootnoteSepType_DistanceBeforeSep() {
        return (EAttribute)getFootnoteSepType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFootnoteSepType_LineStyle() {
        return (EAttribute)getFootnoteSepType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFootnoteSepType_RelWidth() {
        return (EAttribute)getFootnoteSepType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFootnoteSepType_Width() {
        return (EAttribute)getFootnoteSepType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandoutMasterType() {
		if (handoutMasterTypeEClass == null) {
			handoutMasterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(38);
		}
		return handoutMasterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandoutMasterType_Shape() {
        return (EAttribute)getHandoutMasterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Rect() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Line() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Polyline() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Polygon() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_RegularPolygon() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Path() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Circle() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Ellipse() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_G() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_PageThumbnail() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Frame() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Measure() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Caption() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Connector() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Control() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_Scene() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandoutMasterType_CustomShape() {
        return (EReference)getHandoutMasterType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandoutMasterType_PageLayoutName() {
        return (EAttribute)getHandoutMasterType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandoutMasterType_PresentationPageLayoutName() {
        return (EAttribute)getHandoutMasterType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandoutMasterType_StyleName() {
        return (EAttribute)getHandoutMasterType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandoutMasterType_UseDateTimeName() {
        return (EAttribute)getHandoutMasterType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandoutMasterType_UseFooterName() {
        return (EAttribute)getHandoutMasterType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandoutMasterType_UseHeaderName() {
        return (EAttribute)getHandoutMasterType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderLeftType() {
		if (headerLeftTypeEClass == null) {
			headerLeftTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(39);
		}
		return headerLeftTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderLeftType_Display() {
        return (EAttribute)getHeaderLeftType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderStyleType() {
		if (headerStyleTypeEClass == null) {
			headerStyleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(40);
		}
		return headerStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeaderStyleType_HeaderFooterProperties() {
        return (EReference)getHeaderStyleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderType() {
		if (headerTypeEClass == null) {
			headerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(41);
		}
		return headerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderType_Display() {
        return (EAttribute)getHeaderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapType() {
		if (mapTypeEClass == null) {
			mapTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(62);
		}
		return mapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapType_ApplyStyleName() {
        return (EAttribute)getMapType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapType_BaseCellAddress() {
        return (EAttribute)getMapType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapType_Condition() {
        return (EAttribute)getMapType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterPageType() {
		if (masterPageTypeEClass == null) {
			masterPageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(65);
		}
		return masterPageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Header() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_HeaderLeft() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Footer() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_FooterLeft() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Forms() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Style() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterPageType_Shape() {
        return (EAttribute)getMasterPageType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Rect() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Line() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Polyline() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Polygon() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_RegularPolygon() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Path() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Circle() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Ellipse() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_G() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_PageThumbnail() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Frame() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Measure() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Caption() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Connector() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Control() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Scene() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_CustomShape() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterPageType_Notes() {
        return (EReference)getMasterPageType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterPageType_DisplayName() {
        return (EAttribute)getMasterPageType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterPageType_Name() {
        return (EAttribute)getMasterPageType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterPageType_NextStyleName() {
        return (EAttribute)getMasterPageType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterPageType_PageLayoutName() {
        return (EAttribute)getMasterPageType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterPageType_StyleName() {
        return (EAttribute)getMasterPageType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageLayoutType() {
		if (pageLayoutTypeEClass == null) {
			pageLayoutTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(102);
		}
		return pageLayoutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageLayoutType_PageLayoutProperties() {
        return (EReference)getPageLayoutType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageLayoutType_HeaderStyle() {
        return (EReference)getPageLayoutType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageLayoutType_FooterStyle() {
        return (EReference)getPageLayoutType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageLayoutType_Name() {
        return (EAttribute)getPageLayoutType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageLayoutType_PageUsage() {
        return (EAttribute)getPageLayoutType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresentationPageLayoutType() {
		if (presentationPageLayoutTypeEClass == null) {
			presentationPageLayoutTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(130);
		}
		return presentationPageLayoutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationPageLayoutType_Placeholder() {
        return (EReference)getPresentationPageLayoutType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationPageLayoutType_DisplayName() {
        return (EAttribute)getPresentationPageLayoutType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationPageLayoutType_Name() {
        return (EAttribute)getPresentationPageLayoutType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleType1() {
		if (styleType1EClass == null) {
			styleType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(167);
		}
		return styleType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleType1_Map() {
        return (EReference)getStyleType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleType1_AutoUpdate() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleType1_Class() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleType1_DataStyleName() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleType1_DefaultOutlineLevel() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleType1_DisplayName() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleType1_ListStyleName() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleType1_MasterPageName() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleType1_Name() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleType1_NextStyleName() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleType1_ParentStyleName() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabStopsType() {
		if (tabStopsTypeEClass == null) {
			tabStopsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(169);
		}
		return tabStopsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabStopsType_TabStop() {
        return (EReference)getTabStopsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(199);
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
	public EReference getDocumentRoot_BackgroundImage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChartProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Column() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Columns() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ColumnSep() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DefaultStyle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DrawingPageProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DropCap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FontFace() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Footer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FooterLeft() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FooterStyle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FootnoteSep() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GraphicProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HandoutMaster() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Header() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HeaderFooterProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HeaderLeft() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HeaderStyle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListLevelProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Map() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MasterPage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PageLayout() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PageLayoutProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ParagraphProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PresentationPageLayout() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegionCenter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegionLeft() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegionRight() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RubyProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SectionProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Style() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TableCellProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TableColumnProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TableProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TableRowProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TabStop() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TabStops() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TextProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Adjustment() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ApplyStyleName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AutoTextIndent() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AutoUpdate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BackgroundTransparency() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BaseCellAddress() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BorderLineWidth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BorderLineWidthBottom() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BorderLineWidthLeft() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BorderLineWidthRight() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BorderLineWidthTop() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CellProtect() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Char() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Class() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Color() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ColumnWidth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Condition() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CountryAsian() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CountryComplex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DataStyleName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DecimalPlaces() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DefaultOutlineLevel() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DiagonalBlTr() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DiagonalBlTrWidths() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DiagonalTlBr() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DiagonalTlBrWidths() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Direction() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Display() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DisplayName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Distance() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DistanceAfterSep() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DistanceBeforeSep() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DynamicSpacing() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Editable() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Family() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FilterName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FirstPageNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FlowWithText() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontAdornments() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontCharset() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontCharsetAsian() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontCharsetComplex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontFamilyAsian() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontFamilyComplex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontFamilyGeneric() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontFamilyGenericAsian() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontFamilyGenericComplex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontIndependentLineSpacing() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontNameAsian() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontNameComplex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontPitch() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontPitchAsian() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontPitchComplex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontRelief() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontSizeAsian() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontSizeComplex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontSizeRel() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontSizeRelAsian() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontSizeRelComplex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontStyleAsian() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontStyleComplex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontStyleName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontStyleNameAsian() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontStyleNameComplex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontWeightAsian() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontWeightComplex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FootnoteMaxHeight() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GlyphOrientationVertical() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Height() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HorizontalPos() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HorizontalRel() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_JustifySingleWord() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LanguageAsian() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LanguageComplex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LayoutGridBaseHeight() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LayoutGridColor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LayoutGridDisplay() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LayoutGridLines() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LayoutGridMode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LayoutGridPrint() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LayoutGridRubyBelow() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LayoutGridRubyHeight() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LeaderChar() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LeaderColor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LeaderStyle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LeaderText() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LeaderTextStyle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LeaderType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LeaderWidth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LegendExpansion() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LegendExpansionAspectRatio() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Length() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LetterKerning() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LineBreak() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LineHeightAtLeast() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Lines() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LineSpacing() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LineStyle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ListStyleName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MasterPageName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MayBreakBetweenRows() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MinRowHeight() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mirror() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NextStyleName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NumberWrappedParagraphs() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NumFormat() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NumLetterSync() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NumPrefix() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NumSuffix() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OverflowBehavior() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PageLayoutName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PageNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PageUsage() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PaperTrayName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ParentStyleName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Print() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PrintContent() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PrintOrientation() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PrintPageOrder() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PunctuationWrap() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RegisterTrue() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RegisterTruthRefStyleName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RelColumnWidth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RelHeight() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Repeat() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RepeatContent() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RotationAlign() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RotationAngle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RowHeight() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RubyAlign() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RubyPosition() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RunThrough() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ScaleTo() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ScaleToPages() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ScriptType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Shadow() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ShrinkToFit() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SnapToLayoutGrid() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Style1() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StyleName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TableCentering() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TabStopDistance() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextAlignSource() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextAutospace() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextBlinking() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextCombine() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextCombineEndChar() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextCombineStartChar() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextEmphasize() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextLineThroughColor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextLineThroughMode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextLineThroughStyle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextLineThroughText() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextLineThroughTextStyle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextLineThroughType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextLineThroughWidth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(198);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextOutline() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(199);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextPosition() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(200);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextRotationAngle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextRotationScale() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextScale() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextUnderlineColor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextUnderlineMode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextUnderlineStyle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextUnderlineType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(207);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextUnderlineWidth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(208);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UseOptimalColumnWidth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(209);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UseOptimalRowHeight() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(210);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UseWindowFontColor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(211);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VerticalPos() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(212);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VerticalRel() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(213);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Volatile() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(214);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Wrap() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(215);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WrapContour() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(216);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WrapContourMode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(217);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WrapDynamicThreshold() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(218);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WritingMode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(219);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WritingModeAutomatic() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(220);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabStopType() {
		if (tabStopTypeEClass == null) {
			tabStopTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(202);
		}
		return tabStopTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabStopType_Char() {
        return (EAttribute)getTabStopType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabStopType_LeaderColor() {
        return (EAttribute)getTabStopType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabStopType_LeaderStyle() {
        return (EAttribute)getTabStopType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabStopType_LeaderText() {
        return (EAttribute)getTabStopType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabStopType_LeaderTextStyle() {
        return (EAttribute)getTabStopType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabStopType_LeaderType() {
        return (EAttribute)getTabStopType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabStopType_LeaderWidth() {
        return (EAttribute)getTabStopType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabStopType_Position() {
        return (EAttribute)getTabStopType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabStopType_Type() {
        return (EAttribute)getTabStopType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdjustmentType() {
		if (adjustmentTypeEEnum == null) {
			adjustmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(0);
		}
		return adjustmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCellProtectTypeMember0() {
		if (cellProtectTypeMember0EEnum == null) {
			cellProtectTypeMember0EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(6);
		}
		return cellProtectTypeMember0EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCellProtectTypeMember1() {
		if (cellProtectTypeMember1EEnum == null) {
			cellProtectTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(8);
		}
		return cellProtectTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCellProtectTypeMember2BaseItem() {
		if (cellProtectTypeMember2BaseItemEEnum == null) {
			cellProtectTypeMember2BaseItemEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(12);
		}
		return cellProtectTypeMember2BaseItemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionType() {
		if (directionTypeEEnum == null) {
			directionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(19);
		}
		return directionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFamilyType() {
		if (familyTypeEEnum == null) {
			familyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(22);
		}
		return familyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFirstPageNumberTypeMember1() {
		if (firstPageNumberTypeMember1EEnum == null) {
			firstPageNumberTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(25);
		}
		return firstPageNumberTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontReliefType() {
		if (fontReliefTypeEEnum == null) {
			fontReliefTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(28);
		}
		return fontReliefTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlyphOrientationVerticalType() {
		if (glyphOrientationVerticalTypeEEnum == null) {
			glyphOrientationVerticalTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(36);
		}
		return glyphOrientationVerticalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHorizontalPosType() {
		if (horizontalPosTypeEEnum == null) {
			horizontalPosTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(42);
		}
		return horizontalPosTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHorizontalRelType() {
		if (horizontalRelTypeEEnum == null) {
			horizontalRelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(44);
		}
		return horizontalRelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLayoutGridModeType() {
		if (layoutGridModeTypeEEnum == null) {
			layoutGridModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(46);
		}
		return layoutGridModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLeaderColorTypeMember1() {
		if (leaderColorTypeMember1EEnum == null) {
			leaderColorTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(49);
		}
		return leaderColorTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLegendExpansionType() {
		if (legendExpansionTypeEEnum == null) {
			legendExpansionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(53);
		}
		return legendExpansionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLengthTypeMember1() {
		if (lengthTypeMember1EEnum == null) {
			lengthTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(56);
		}
		return lengthTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineBreakType() {
		if (lineBreakTypeEEnum == null) {
			lineBreakTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(58);
		}
		return lineBreakTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMirrorTypeMember1() {
		if (mirrorTypeMember1EEnum == null) {
			mirrorTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(67);
		}
		return mirrorTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMirrorTypeMember2() {
		if (mirrorTypeMember2EEnum == null) {
			mirrorTypeMember2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(69);
		}
		return mirrorTypeMember2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMirrorTypeMember3BaseItemMember1() {
		if (mirrorTypeMember3BaseItemMember1EEnum == null) {
			mirrorTypeMember3BaseItemMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(74);
		}
		return mirrorTypeMember3BaseItemMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMirrorTypeMember4BaseItemMember1() {
		if (mirrorTypeMember4BaseItemMember1EEnum == null) {
			mirrorTypeMember4BaseItemMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(79);
		}
		return mirrorTypeMember4BaseItemMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberWrappedParagraphsTypeMember1() {
		if (numberWrappedParagraphsTypeMember1EEnum == null) {
			numberWrappedParagraphsTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(84);
		}
		return numberWrappedParagraphsTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumFormatTypeMember0Member0Member1() {
		if (numFormatTypeMember0Member0Member1EEnum == null) {
			numFormatTypeMember0Member0Member1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(89);
		}
		return numFormatTypeMember0Member0Member1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumFormatTypeMember0Member0Member2() {
		if (numFormatTypeMember0Member0Member2EEnum == null) {
			numFormatTypeMember0Member0Member2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(91);
		}
		return numFormatTypeMember0Member0Member2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumFormatTypeMember0Member0Member3() {
		if (numFormatTypeMember0Member0Member3EEnum == null) {
			numFormatTypeMember0Member0Member3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(93);
		}
		return numFormatTypeMember0Member0Member3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumFormatTypeMember1() {
		if (numFormatTypeMember1EEnum == null) {
			numFormatTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(96);
		}
		return numFormatTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOverflowBehaviorType() {
		if (overflowBehaviorTypeEEnum == null) {
			overflowBehaviorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(98);
		}
		return overflowBehaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPageNumberTypeMember1() {
		if (pageNumberTypeMember1EEnum == null) {
			pageNumberTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(104);
		}
		return pageNumberTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPageUsageType() {
		if (pageUsageTypeEEnum == null) {
			pageUsageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(106);
		}
		return pageUsageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaperTrayNameTypeMember1() {
		if (paperTrayNameTypeMember1EEnum == null) {
			paperTrayNameTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(109);
		}
		return paperTrayNameTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPositionTypeMember0() {
		if (positionTypeMember0EEnum == null) {
			positionTypeMember0EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(114);
		}
		return positionTypeMember0EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPositionTypeMember1() {
		if (positionTypeMember1EEnum == null) {
			positionTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(116);
		}
		return positionTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPositionTypeMember2() {
		if (positionTypeMember2EEnum == null) {
			positionTypeMember2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(118);
		}
		return positionTypeMember2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPositionTypeMember3() {
		if (positionTypeMember3EEnum == null) {
			positionTypeMember3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(120);
		}
		return positionTypeMember3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPositionTypeMember4() {
		if (positionTypeMember4EEnum == null) {
			positionTypeMember4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(122);
		}
		return positionTypeMember4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrintOrientationType() {
		if (printOrientationTypeEEnum == null) {
			printOrientationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(131);
		}
		return printOrientationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrintPageOrderType() {
		if (printPageOrderTypeEEnum == null) {
			printPageOrderTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(133);
		}
		return printPageOrderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrintTypeItem() {
		if (printTypeItemEEnum == null) {
			printTypeItemEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(136);
		}
		return printTypeItemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPunctuationWrapType() {
		if (punctuationWrapTypeEEnum == null) {
			punctuationWrapTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(138);
		}
		return punctuationWrapTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelHeightTypeMember1() {
		if (relHeightTypeMember1EEnum == null) {
			relHeightTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(143);
		}
		return relHeightTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelHeightTypeMember2() {
		if (relHeightTypeMember2EEnum == null) {
			relHeightTypeMember2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(145);
		}
		return relHeightTypeMember2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelWidthTypeMember1() {
		if (relWidthTypeMember1EEnum == null) {
			relWidthTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(148);
		}
		return relWidthTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelWidthTypeMember2() {
		if (relWidthTypeMember2EEnum == null) {
			relWidthTypeMember2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(150);
		}
		return relWidthTypeMember2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRepeatType() {
		if (repeatTypeEEnum == null) {
			repeatTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(152);
		}
		return repeatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRotationAlignType() {
		if (rotationAlignTypeEEnum == null) {
			rotationAlignTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(154);
		}
		return rotationAlignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRubyAlignType() {
		if (rubyAlignTypeEEnum == null) {
			rubyAlignTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(156);
		}
		return rubyAlignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRubyPositionType() {
		if (rubyPositionTypeEEnum == null) {
			rubyPositionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(158);
		}
		return rubyPositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRunThroughType() {
		if (runThroughTypeEEnum == null) {
			runThroughTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(160);
		}
		return runThroughTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScriptTypeType() {
		if (scriptTypeTypeEEnum == null) {
			scriptTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(162);
		}
		return scriptTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStyleType() {
		if (styleTypeEEnum == null) {
			styleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(166);
		}
		return styleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextAutospaceType() {
		if (textAutospaceTypeEEnum == null) {
			textAutospaceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(170);
		}
		return textAutospaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextCombineType() {
		if (textCombineTypeEEnum == null) {
			textCombineTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(172);
		}
		return textCombineTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextEmphasizeTypeMember0() {
		if (textEmphasizeTypeMember0EEnum == null) {
			textEmphasizeTypeMember0EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(175);
		}
		return textEmphasizeTypeMember0EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextEmphasizeTypeMember1BaseItem() {
		if (textEmphasizeTypeMember1BaseItemEEnum == null) {
			textEmphasizeTypeMember1BaseItemEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(179);
		}
		return textEmphasizeTypeMember1BaseItemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextLineThroughColorTypeMember1() {
		if (textLineThroughColorTypeMember1EEnum == null) {
			textLineThroughColorTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(181);
		}
		return textLineThroughColorTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextPositionTypeBaseItemMember1Member1() {
		if (textPositionTypeBaseItemMember1Member1EEnum == null) {
			textPositionTypeBaseItemMember1Member1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(189);
		}
		return textPositionTypeBaseItemMember1Member1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextPositionTypeBaseItemMember1Member2() {
		if (textPositionTypeBaseItemMember1Member2EEnum == null) {
			textPositionTypeBaseItemMember1Member2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(191);
		}
		return textPositionTypeBaseItemMember1Member2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextRotationScaleType() {
		if (textRotationScaleTypeEEnum == null) {
			textRotationScaleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(193);
		}
		return textRotationScaleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextUnderlineColorTypeMember1() {
		if (textUnderlineColorTypeMember1EEnum == null) {
			textUnderlineColorTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(195);
		}
		return textUnderlineColorTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType() {
		if (typeTypeEEnum == null) {
			typeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(197);
		}
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTableCenteringType() {
		if (tableCenteringTypeEEnum == null) {
			tableCenteringTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(200);
		}
		return tableCenteringTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextAlignSourceType() {
		if (textAlignSourceTypeEEnum == null) {
			textAlignSourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(203);
		}
		return textAlignSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType1() {
		if (typeType1EEnum == null) {
			typeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(207);
		}
		return typeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerticalAlignType() {
		if (verticalAlignTypeEEnum == null) {
			verticalAlignTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(209);
		}
		return verticalAlignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerticalPosType() {
		if (verticalPosTypeEEnum == null) {
			verticalPosTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(211);
		}
		return verticalPosTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerticalRelType() {
		if (verticalRelTypeEEnum == null) {
			verticalRelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(213);
		}
		return verticalRelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWrapContourModeType() {
		if (wrapContourModeTypeEEnum == null) {
			wrapContourModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(215);
		}
		return wrapContourModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWrapType() {
		if (wrapTypeEEnum == null) {
			wrapTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(217);
		}
		return wrapTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWritingModeType() {
		if (writingModeTypeEEnum == null) {
			writingModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(219);
		}
		return writingModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAdjustmentTypeObject() {
		if (adjustmentTypeObjectEDataType == null) {
			adjustmentTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(1);
		}
		return adjustmentTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getApplyStyleNameType() {
		if (applyStyleNameTypeEDataType == null) {
			applyStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(2);
		}
		return applyStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getApplyStyleNameTypeMember1() {
		if (applyStyleNameTypeMember1EDataType == null) {
			applyStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(3);
		}
		return applyStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCellProtectType() {
		if (cellProtectTypeEDataType == null) {
			cellProtectTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(5);
		}
		return cellProtectTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCellProtectTypeMember0Object() {
		if (cellProtectTypeMember0ObjectEDataType == null) {
			cellProtectTypeMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(7);
		}
		return cellProtectTypeMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCellProtectTypeMember1Object() {
		if (cellProtectTypeMember1ObjectEDataType == null) {
			cellProtectTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(9);
		}
		return cellProtectTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCellProtectTypeMember2() {
		if (cellProtectTypeMember2EDataType == null) {
			cellProtectTypeMember2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(10);
		}
		return cellProtectTypeMember2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCellProtectTypeMember2Base() {
		if (cellProtectTypeMember2BaseEDataType == null) {
			cellProtectTypeMember2BaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(11);
		}
		return cellProtectTypeMember2BaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCellProtectTypeMember2BaseItemObject() {
		if (cellProtectTypeMember2BaseItemObjectEDataType == null) {
			cellProtectTypeMember2BaseItemObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(13);
		}
		return cellProtectTypeMember2BaseItemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataStyleNameType() {
		if (dataStyleNameTypeEDataType == null) {
			dataStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(17);
		}
		return dataStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataStyleNameTypeMember1() {
		if (dataStyleNameTypeMember1EDataType == null) {
			dataStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(18);
		}
		return dataStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirectionTypeObject() {
		if (directionTypeObjectEDataType == null) {
			directionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(20);
		}
		return directionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFamilyTypeObject() {
		if (familyTypeObjectEDataType == null) {
			familyTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(23);
		}
		return familyTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFirstPageNumberType() {
		if (firstPageNumberTypeEDataType == null) {
			firstPageNumberTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(24);
		}
		return firstPageNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFirstPageNumberTypeMember1Object() {
		if (firstPageNumberTypeMember1ObjectEDataType == null) {
			firstPageNumberTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(26);
		}
		return firstPageNumberTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontReliefTypeObject() {
		if (fontReliefTypeObjectEDataType == null) {
			fontReliefTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(29);
		}
		return fontReliefTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontSizeAsianType() {
		if (fontSizeAsianTypeEDataType == null) {
			fontSizeAsianTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(30);
		}
		return fontSizeAsianTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontSizeComplexType() {
		if (fontSizeComplexTypeEDataType == null) {
			fontSizeComplexTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(31);
		}
		return fontSizeComplexTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlyphOrientationVerticalTypeObject() {
		if (glyphOrientationVerticalTypeObjectEDataType == null) {
			glyphOrientationVerticalTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(37);
		}
		return glyphOrientationVerticalTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHorizontalPosTypeObject() {
		if (horizontalPosTypeObjectEDataType == null) {
			horizontalPosTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(43);
		}
		return horizontalPosTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHorizontalRelTypeObject() {
		if (horizontalRelTypeObjectEDataType == null) {
			horizontalRelTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(45);
		}
		return horizontalRelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLayoutGridModeTypeObject() {
		if (layoutGridModeTypeObjectEDataType == null) {
			layoutGridModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(47);
		}
		return layoutGridModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLeaderColorType() {
		if (leaderColorTypeEDataType == null) {
			leaderColorTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(48);
		}
		return leaderColorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLeaderColorTypeMember1Object() {
		if (leaderColorTypeMember1ObjectEDataType == null) {
			leaderColorTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(50);
		}
		return leaderColorTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLeaderTextStyleType() {
		if (leaderTextStyleTypeEDataType == null) {
			leaderTextStyleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(51);
		}
		return leaderTextStyleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLeaderTextStyleTypeMember1() {
		if (leaderTextStyleTypeMember1EDataType == null) {
			leaderTextStyleTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(52);
		}
		return leaderTextStyleTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLegendExpansionTypeObject() {
		if (legendExpansionTypeObjectEDataType == null) {
			legendExpansionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(54);
		}
		return legendExpansionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLengthType() {
		if (lengthTypeEDataType == null) {
			lengthTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(55);
		}
		return lengthTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLengthTypeMember1Object() {
		if (lengthTypeMember1ObjectEDataType == null) {
			lengthTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(57);
		}
		return lengthTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineBreakTypeObject() {
		if (lineBreakTypeObjectEDataType == null) {
			lineBreakTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(59);
		}
		return lineBreakTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListStyleNameType() {
		if (listStyleNameTypeEDataType == null) {
			listStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(60);
		}
		return listStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListStyleNameTypeMember1() {
		if (listStyleNameTypeMember1EDataType == null) {
			listStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(61);
		}
		return listStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMasterPageNameType() {
		if (masterPageNameTypeEDataType == null) {
			masterPageNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(63);
		}
		return masterPageNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMasterPageNameTypeMember1() {
		if (masterPageNameTypeMember1EDataType == null) {
			masterPageNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(64);
		}
		return masterPageNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMirrorType() {
		if (mirrorTypeEDataType == null) {
			mirrorTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(66);
		}
		return mirrorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMirrorTypeMember1Object() {
		if (mirrorTypeMember1ObjectEDataType == null) {
			mirrorTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(68);
		}
		return mirrorTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMirrorTypeMember2Object() {
		if (mirrorTypeMember2ObjectEDataType == null) {
			mirrorTypeMember2ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(70);
		}
		return mirrorTypeMember2ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMirrorTypeMember3() {
		if (mirrorTypeMember3EDataType == null) {
			mirrorTypeMember3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(71);
		}
		return mirrorTypeMember3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMirrorTypeMember3Base() {
		if (mirrorTypeMember3BaseEDataType == null) {
			mirrorTypeMember3BaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(72);
		}
		return mirrorTypeMember3BaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMirrorTypeMember3BaseItem() {
		if (mirrorTypeMember3BaseItemEDataType == null) {
			mirrorTypeMember3BaseItemEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(73);
		}
		return mirrorTypeMember3BaseItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMirrorTypeMember3BaseItemMember1Object() {
		if (mirrorTypeMember3BaseItemMember1ObjectEDataType == null) {
			mirrorTypeMember3BaseItemMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(75);
		}
		return mirrorTypeMember3BaseItemMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMirrorTypeMember4() {
		if (mirrorTypeMember4EDataType == null) {
			mirrorTypeMember4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(76);
		}
		return mirrorTypeMember4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMirrorTypeMember4Base() {
		if (mirrorTypeMember4BaseEDataType == null) {
			mirrorTypeMember4BaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(77);
		}
		return mirrorTypeMember4BaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMirrorTypeMember4BaseItem() {
		if (mirrorTypeMember4BaseItemEDataType == null) {
			mirrorTypeMember4BaseItemEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(78);
		}
		return mirrorTypeMember4BaseItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMirrorTypeMember4BaseItemMember1Object() {
		if (mirrorTypeMember4BaseItemMember1ObjectEDataType == null) {
			mirrorTypeMember4BaseItemMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(80);
		}
		return mirrorTypeMember4BaseItemMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNextStyleNameType() {
		if (nextStyleNameTypeEDataType == null) {
			nextStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(81);
		}
		return nextStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNextStyleNameTypeMember1() {
		if (nextStyleNameTypeMember1EDataType == null) {
			nextStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(82);
		}
		return nextStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumberWrappedParagraphsType() {
		if (numberWrappedParagraphsTypeEDataType == null) {
			numberWrappedParagraphsTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(83);
		}
		return numberWrappedParagraphsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumberWrappedParagraphsTypeMember1Object() {
		if (numberWrappedParagraphsTypeMember1ObjectEDataType == null) {
			numberWrappedParagraphsTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(85);
		}
		return numberWrappedParagraphsTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumFormatType() {
		if (numFormatTypeEDataType == null) {
			numFormatTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(86);
		}
		return numFormatTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumFormatTypeMember0() {
		if (numFormatTypeMember0EDataType == null) {
			numFormatTypeMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(87);
		}
		return numFormatTypeMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumFormatTypeMember0Member0() {
		if (numFormatTypeMember0Member0EDataType == null) {
			numFormatTypeMember0Member0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(88);
		}
		return numFormatTypeMember0Member0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumFormatTypeMember0Member0Member1Object() {
		if (numFormatTypeMember0Member0Member1ObjectEDataType == null) {
			numFormatTypeMember0Member0Member1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(90);
		}
		return numFormatTypeMember0Member0Member1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumFormatTypeMember0Member0Member2Object() {
		if (numFormatTypeMember0Member0Member2ObjectEDataType == null) {
			numFormatTypeMember0Member0Member2ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(92);
		}
		return numFormatTypeMember0Member0Member2ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumFormatTypeMember0Member0Member3Object() {
		if (numFormatTypeMember0Member0Member3ObjectEDataType == null) {
			numFormatTypeMember0Member0Member3ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(94);
		}
		return numFormatTypeMember0Member0Member3ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumFormatTypeMember0Member1() {
		if (numFormatTypeMember0Member1EDataType == null) {
			numFormatTypeMember0Member1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(95);
		}
		return numFormatTypeMember0Member1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumFormatTypeMember1Object() {
		if (numFormatTypeMember1ObjectEDataType == null) {
			numFormatTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(97);
		}
		return numFormatTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOverflowBehaviorTypeObject() {
		if (overflowBehaviorTypeObjectEDataType == null) {
			overflowBehaviorTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(99);
		}
		return overflowBehaviorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPageLayoutNameType() {
		if (pageLayoutNameTypeEDataType == null) {
			pageLayoutNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(100);
		}
		return pageLayoutNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPageLayoutNameTypeMember1() {
		if (pageLayoutNameTypeMember1EDataType == null) {
			pageLayoutNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(101);
		}
		return pageLayoutNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPageNumberType() {
		if (pageNumberTypeEDataType == null) {
			pageNumberTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(103);
		}
		return pageNumberTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPageNumberTypeMember1Object() {
		if (pageNumberTypeMember1ObjectEDataType == null) {
			pageNumberTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(105);
		}
		return pageNumberTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPageUsageTypeObject() {
		if (pageUsageTypeObjectEDataType == null) {
			pageUsageTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(107);
		}
		return pageUsageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPaperTrayNameType() {
		if (paperTrayNameTypeEDataType == null) {
			paperTrayNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(108);
		}
		return paperTrayNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPaperTrayNameTypeMember1Object() {
		if (paperTrayNameTypeMember1ObjectEDataType == null) {
			paperTrayNameTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(110);
		}
		return paperTrayNameTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParentStyleNameType() {
		if (parentStyleNameTypeEDataType == null) {
			parentStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(111);
		}
		return parentStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParentStyleNameTypeMember1() {
		if (parentStyleNameTypeMember1EDataType == null) {
			parentStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(112);
		}
		return parentStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionType() {
		if (positionTypeEDataType == null) {
			positionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(113);
		}
		return positionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionTypeMember0Object() {
		if (positionTypeMember0ObjectEDataType == null) {
			positionTypeMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(115);
		}
		return positionTypeMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionTypeMember1Object() {
		if (positionTypeMember1ObjectEDataType == null) {
			positionTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(117);
		}
		return positionTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionTypeMember2Object() {
		if (positionTypeMember2ObjectEDataType == null) {
			positionTypeMember2ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(119);
		}
		return positionTypeMember2ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionTypeMember3Object() {
		if (positionTypeMember3ObjectEDataType == null) {
			positionTypeMember3ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(121);
		}
		return positionTypeMember3ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionTypeMember4Object() {
		if (positionTypeMember4ObjectEDataType == null) {
			positionTypeMember4ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(123);
		}
		return positionTypeMember4ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionTypeMember5() {
		if (positionTypeMember5EDataType == null) {
			positionTypeMember5EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(124);
		}
		return positionTypeMember5EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionTypeMember5Base() {
		if (positionTypeMember5BaseEDataType == null) {
			positionTypeMember5BaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(125);
		}
		return positionTypeMember5BaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionTypeMember5BaseItem() {
		if (positionTypeMember5BaseItemEDataType == null) {
			positionTypeMember5BaseItemEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(126);
		}
		return positionTypeMember5BaseItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionTypeMember6() {
		if (positionTypeMember6EDataType == null) {
			positionTypeMember6EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(127);
		}
		return positionTypeMember6EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionTypeMember6Base() {
		if (positionTypeMember6BaseEDataType == null) {
			positionTypeMember6BaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(128);
		}
		return positionTypeMember6BaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositionTypeMember6BaseItem() {
		if (positionTypeMember6BaseItemEDataType == null) {
			positionTypeMember6BaseItemEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(129);
		}
		return positionTypeMember6BaseItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrintOrientationTypeObject() {
		if (printOrientationTypeObjectEDataType == null) {
			printOrientationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(132);
		}
		return printOrientationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrintPageOrderTypeObject() {
		if (printPageOrderTypeObjectEDataType == null) {
			printPageOrderTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(134);
		}
		return printPageOrderTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrintType() {
		if (printTypeEDataType == null) {
			printTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(135);
		}
		return printTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrintTypeItemObject() {
		if (printTypeItemObjectEDataType == null) {
			printTypeItemObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(137);
		}
		return printTypeItemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPunctuationWrapTypeObject() {
		if (punctuationWrapTypeObjectEDataType == null) {
			punctuationWrapTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(139);
		}
		return punctuationWrapTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRegisterTruthRefStyleNameType() {
		if (registerTruthRefStyleNameTypeEDataType == null) {
			registerTruthRefStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(140);
		}
		return registerTruthRefStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRegisterTruthRefStyleNameTypeMember1() {
		if (registerTruthRefStyleNameTypeMember1EDataType == null) {
			registerTruthRefStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(141);
		}
		return registerTruthRefStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelHeightType() {
		if (relHeightTypeEDataType == null) {
			relHeightTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(142);
		}
		return relHeightTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelHeightTypeMember1Object() {
		if (relHeightTypeMember1ObjectEDataType == null) {
			relHeightTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(144);
		}
		return relHeightTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelHeightTypeMember2Object() {
		if (relHeightTypeMember2ObjectEDataType == null) {
			relHeightTypeMember2ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(146);
		}
		return relHeightTypeMember2ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelWidthType() {
		if (relWidthTypeEDataType == null) {
			relWidthTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(147);
		}
		return relWidthTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelWidthTypeMember1Object() {
		if (relWidthTypeMember1ObjectEDataType == null) {
			relWidthTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(149);
		}
		return relWidthTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelWidthTypeMember2Object() {
		if (relWidthTypeMember2ObjectEDataType == null) {
			relWidthTypeMember2ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(151);
		}
		return relWidthTypeMember2ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRepeatTypeObject() {
		if (repeatTypeObjectEDataType == null) {
			repeatTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(153);
		}
		return repeatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRotationAlignTypeObject() {
		if (rotationAlignTypeObjectEDataType == null) {
			rotationAlignTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(155);
		}
		return rotationAlignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRubyAlignTypeObject() {
		if (rubyAlignTypeObjectEDataType == null) {
			rubyAlignTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(157);
		}
		return rubyAlignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRubyPositionTypeObject() {
		if (rubyPositionTypeObjectEDataType == null) {
			rubyPositionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(159);
		}
		return rubyPositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRunThroughTypeObject() {
		if (runThroughTypeObjectEDataType == null) {
			runThroughTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(161);
		}
		return runThroughTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScriptTypeTypeObject() {
		if (scriptTypeTypeObjectEDataType == null) {
			scriptTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(163);
		}
		return scriptTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType() {
		if (styleNameTypeEDataType == null) {
			styleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(164);
		}
		return styleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember1() {
		if (styleNameTypeMember1EDataType == null) {
			styleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(165);
		}
		return styleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleTypeObject() {
		if (styleTypeObjectEDataType == null) {
			styleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(168);
		}
		return styleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextAutospaceTypeObject() {
		if (textAutospaceTypeObjectEDataType == null) {
			textAutospaceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(171);
		}
		return textAutospaceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextCombineTypeObject() {
		if (textCombineTypeObjectEDataType == null) {
			textCombineTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(173);
		}
		return textCombineTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextEmphasizeType() {
		if (textEmphasizeTypeEDataType == null) {
			textEmphasizeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(174);
		}
		return textEmphasizeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextEmphasizeTypeMember0Object() {
		if (textEmphasizeTypeMember0ObjectEDataType == null) {
			textEmphasizeTypeMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(176);
		}
		return textEmphasizeTypeMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextEmphasizeTypeMember1() {
		if (textEmphasizeTypeMember1EDataType == null) {
			textEmphasizeTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(177);
		}
		return textEmphasizeTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextEmphasizeTypeMember1Base() {
		if (textEmphasizeTypeMember1BaseEDataType == null) {
			textEmphasizeTypeMember1BaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(178);
		}
		return textEmphasizeTypeMember1BaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextLineThroughColorType() {
		if (textLineThroughColorTypeEDataType == null) {
			textLineThroughColorTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(180);
		}
		return textLineThroughColorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextLineThroughColorTypeMember1Object() {
		if (textLineThroughColorTypeMember1ObjectEDataType == null) {
			textLineThroughColorTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(182);
		}
		return textLineThroughColorTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextLineThroughTextStyleType() {
		if (textLineThroughTextStyleTypeEDataType == null) {
			textLineThroughTextStyleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(183);
		}
		return textLineThroughTextStyleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextLineThroughTextStyleTypeMember1() {
		if (textLineThroughTextStyleTypeMember1EDataType == null) {
			textLineThroughTextStyleTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(184);
		}
		return textLineThroughTextStyleTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextPositionType() {
		if (textPositionTypeEDataType == null) {
			textPositionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(185);
		}
		return textPositionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextPositionTypeBase() {
		if (textPositionTypeBaseEDataType == null) {
			textPositionTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(186);
		}
		return textPositionTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextPositionTypeBaseItem() {
		if (textPositionTypeBaseItemEDataType == null) {
			textPositionTypeBaseItemEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(187);
		}
		return textPositionTypeBaseItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextPositionTypeBaseItemMember1() {
		if (textPositionTypeBaseItemMember1EDataType == null) {
			textPositionTypeBaseItemMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(188);
		}
		return textPositionTypeBaseItemMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextPositionTypeBaseItemMember1Member1Object() {
		if (textPositionTypeBaseItemMember1Member1ObjectEDataType == null) {
			textPositionTypeBaseItemMember1Member1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(190);
		}
		return textPositionTypeBaseItemMember1Member1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextPositionTypeBaseItemMember1Member2Object() {
		if (textPositionTypeBaseItemMember1Member2ObjectEDataType == null) {
			textPositionTypeBaseItemMember1Member2ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(192);
		}
		return textPositionTypeBaseItemMember1Member2ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextRotationScaleTypeObject() {
		if (textRotationScaleTypeObjectEDataType == null) {
			textRotationScaleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(194);
		}
		return textRotationScaleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextUnderlineColorTypeMember1Object() {
		if (textUnderlineColorTypeMember1ObjectEDataType == null) {
			textUnderlineColorTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(196);
		}
		return textUnderlineColorTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject() {
		if (typeTypeObjectEDataType == null) {
			typeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(198);
		}
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTableCenteringTypeObject() {
		if (tableCenteringTypeObjectEDataType == null) {
			tableCenteringTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(201);
		}
		return tableCenteringTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextAlignSourceTypeObject() {
		if (textAlignSourceTypeObjectEDataType == null) {
			textAlignSourceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(204);
		}
		return textAlignSourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextEmphasizeTypeMember1BaseItemObject() {
		if (textEmphasizeTypeMember1BaseItemObjectEDataType == null) {
			textEmphasizeTypeMember1BaseItemObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(205);
		}
		return textEmphasizeTypeMember1BaseItemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextUnderlineColorType() {
		if (textUnderlineColorTypeEDataType == null) {
			textUnderlineColorTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(206);
		}
		return textUnderlineColorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject1() {
		if (typeTypeObject1EDataType == null) {
			typeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(208);
		}
		return typeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVerticalAlignTypeObject() {
		if (verticalAlignTypeObjectEDataType == null) {
			verticalAlignTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(210);
		}
		return verticalAlignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVerticalPosTypeObject() {
		if (verticalPosTypeObjectEDataType == null) {
			verticalPosTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(212);
		}
		return verticalPosTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVerticalRelTypeObject() {
		if (verticalRelTypeObjectEDataType == null) {
			verticalRelTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(214);
		}
		return verticalRelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWrapContourModeTypeObject() {
		if (wrapContourModeTypeObjectEDataType == null) {
			wrapContourModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(216);
		}
		return wrapContourModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWrapTypeObject() {
		if (wrapTypeObjectEDataType == null) {
			wrapTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(218);
		}
		return wrapTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWritingModeTypeObject() {
		if (writingModeTypeObjectEDataType == null) {
			writingModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI).getEClassifiers().get(220);
		}
		return writingModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleFactory getStyleFactory() {
		return (StyleFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.oasisopen.names.tc.opendocument.xmlns.style." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //StylePackageImpl
