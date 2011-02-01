/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingFactory;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.util.DrawingValidator;
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
public class DrawingPackageImpl extends EPackageImpl implements DrawingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "drawing.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appletTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaCircleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaPolygonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaRectangleTypeEClass = null;

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
	private EClass captionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contourPathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contourPolygonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customShapeTypeEClass = null;

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
	private EClass ellipseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enhancedGeometryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillImageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gluePointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hatchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageMapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markerTypeEClass = null;

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
	private EClass objectOleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opacityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageThumbnailTypeEClass = null;

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
	private EClass paramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polylineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularPolygonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeDashType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textBoxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum backgroundSizeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum captionAngleTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum captionEscapeDirectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum captionTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum concaveTypeEEnum = null;

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
	private EEnum escapeDirectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fillImageRefPointTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fillTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gluePointTypeTypeEEnum = null;

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
	private EEnum measureAlignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measureVerticalAlignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nohrefTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shadowTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strokeLinejoinTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strokeTypeEEnum = null;

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
	private EEnum styleType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textareaHorizontalAlignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textareaVerticalAlignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textPathModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textPathScaleTypeEEnum = null;

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
	private EEnum unitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wrapInfluenceOnPositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType backgroundSizeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType captionAngleTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType captionEscapeDirectionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType captionEscapeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType captionTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType concaveTypeObjectEDataType = null;

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
	private EDataType escapeDirectionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionDepthTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionDepthTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionDepthTypeBaseItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionOriginTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionOriginTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionOriginTypeBaseItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionOriginTypeBaseItemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionRotationAngleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionRotationAngleTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionRotationAngleTypeBaseItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionRotationAngleTypeBaseItemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionSkewTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionSkewTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionSkewTypeBaseItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extrusionSkewTypeBaseItemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillGradientNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillGradientNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillHatchNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillHatchNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillImageHeightTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillImageNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillImageNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillImageRefPointTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillImageWidthTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gluePointTypeTypeObjectEDataType = null;

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
	private EDataType lineSkewTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineSkewTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineSkewTypeBaseItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineSkewTypeBaseItemMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType markerEndTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType markerEndTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType markerStartTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType markerStartTypeMember1EDataType = null;

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
	private EDataType measureAlignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType measureVerticalAlignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nohrefTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType opacityNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType opacityNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType placingTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shadowTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strokeDashTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strokeDashTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strokeLinejoinTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strokeTypeObjectEDataType = null;

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
	private EDataType styleTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textareaHorizontalAlignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textareaVerticalAlignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textPathModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textPathScaleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textStyleNameTypeMember1EDataType = null;

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
	private EDataType unitTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wrapInfluenceOnPositionTypeObjectEDataType = null;

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DrawingPackageImpl() {
		super(eNS_URI, DrawingFactory.eINSTANCE);
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
	public static DrawingPackage init() {
		if (isInited) return (DrawingPackage)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI);

		// Obtain or create and register package
		DrawingPackageImpl theDrawingPackage = (DrawingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DrawingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DrawingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TextPackageImpl theTextPackage = (TextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI) instanceof TextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI) : TextPackage.eINSTANCE);
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
		theDrawingPackage.loadPackage();
		theTextPackage.loadPackage();
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
		theDrawingPackage.fixPackageContents();
		theTextPackage.fixPackageContents();
		theStylePackage.fixPackageContents();
		theFormPackage.fixPackageContents();
		theTablePackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDrawingPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DrawingValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDrawingPackage.freeze();

		return theDrawingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppletType() {
		if (appletTypeEClass == null) {
			appletTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(2);
		}
		return appletTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppletType_Param() {
        return (EReference)getAppletType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppletType_Actuate() {
        return (EAttribute)getAppletType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppletType_Archive() {
        return (EAttribute)getAppletType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppletType_Code() {
        return (EAttribute)getAppletType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppletType_Href() {
        return (EAttribute)getAppletType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppletType_MayScript() {
        return (EAttribute)getAppletType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppletType_Object() {
        return (EAttribute)getAppletType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppletType_Show() {
        return (EAttribute)getAppletType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppletType_Type() {
        return (EAttribute)getAppletType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaCircleType() {
		if (areaCircleTypeEClass == null) {
			areaCircleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(3);
		}
		return areaCircleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaCircleType_Title() {
        return (EAttribute)getAreaCircleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaCircleType_Desc() {
        return (EAttribute)getAreaCircleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAreaCircleType_EventListeners() {
        return (EReference)getAreaCircleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaCircleType_Cx() {
        return (EAttribute)getAreaCircleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaCircleType_Cy() {
        return (EAttribute)getAreaCircleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaCircleType_Href() {
        return (EAttribute)getAreaCircleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaCircleType_Name() {
        return (EAttribute)getAreaCircleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaCircleType_Nohref() {
        return (EAttribute)getAreaCircleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaCircleType_R() {
        return (EAttribute)getAreaCircleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaCircleType_Show() {
        return (EAttribute)getAreaCircleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaCircleType_TargetFrameName() {
        return (EAttribute)getAreaCircleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaCircleType_Type() {
        return (EAttribute)getAreaCircleType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaPolygonType() {
		if (areaPolygonTypeEClass == null) {
			areaPolygonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(4);
		}
		return areaPolygonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_Title() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_Desc() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAreaPolygonType_EventListeners() {
        return (EReference)getAreaPolygonType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_Height() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_Href() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_Name() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_Nohref() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_Points() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_Show() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_TargetFrameName() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_Type() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_ViewBox() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_Width() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_X() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaPolygonType_Y() {
        return (EAttribute)getAreaPolygonType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaRectangleType() {
		if (areaRectangleTypeEClass == null) {
			areaRectangleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(5);
		}
		return areaRectangleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRectangleType_Title() {
        return (EAttribute)getAreaRectangleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRectangleType_Desc() {
        return (EAttribute)getAreaRectangleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAreaRectangleType_EventListeners() {
        return (EReference)getAreaRectangleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRectangleType_Height() {
        return (EAttribute)getAreaRectangleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRectangleType_Href() {
        return (EAttribute)getAreaRectangleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRectangleType_Name() {
        return (EAttribute)getAreaRectangleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRectangleType_Nohref() {
        return (EAttribute)getAreaRectangleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRectangleType_Show() {
        return (EAttribute)getAreaRectangleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRectangleType_TargetFrameName() {
        return (EAttribute)getAreaRectangleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRectangleType_Type() {
        return (EAttribute)getAreaRectangleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRectangleType_Width() {
        return (EAttribute)getAreaRectangleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRectangleType_X() {
        return (EAttribute)getAreaRectangleType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAreaRectangleType_Y() {
        return (EAttribute)getAreaRectangleType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAType() {
		if (aTypeEClass == null) {
			aTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(6);
		}
		return aTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAType_Frame() {
        return (EReference)getAType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Actuate() {
        return (EAttribute)getAType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Href() {
        return (EAttribute)getAType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Name() {
        return (EAttribute)getAType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_ServerMap() {
        return (EAttribute)getAType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Show() {
        return (EAttribute)getAType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_TargetFrameName() {
        return (EAttribute)getAType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Title() {
        return (EAttribute)getAType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Type() {
        return (EAttribute)getAType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaptionType() {
		if (captionTypeEClass == null) {
			captionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(14);
		}
		return captionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Title() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Desc() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaptionType_EventListeners() {
        return (EReference)getCaptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaptionType_GluePoint() {
        return (EReference)getCaptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Group() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaptionType_P() {
        return (EReference)getCaptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaptionType_List() {
        return (EReference)getCaptionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_AnchorPageNumber() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_AnchorType() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_CaptionId() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_CaptionPointX() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_CaptionPointY() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_ClassNames() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_ClassNames1() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_CornerRadius() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_EndCellAddress() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_EndX() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_EndY() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Height() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Id() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Layer() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Name() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_StyleName() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_StyleName1() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_TableBackground() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_TextStyleName() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Transform() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Width() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_X() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Y() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_ZIndex() {
        return (EAttribute)getCaptionType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircleType() {
		if (circleTypeEClass == null) {
			circleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(17);
		}
		return circleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Title() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Desc() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircleType_EventListeners() {
        return (EReference)getCircleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircleType_GluePoint() {
        return (EReference)getCircleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Group() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircleType_P() {
        return (EReference)getCircleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircleType_List() {
        return (EReference)getCircleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_AnchorPageNumber() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_AnchorType() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_CaptionId() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_ClassNames() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_ClassNames1() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Cx() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Cy() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_EndAngle() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_EndCellAddress() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_EndX() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_EndY() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Height() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Id() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Kind() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Layer() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Name() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_R() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_StartAngle() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_StyleName() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_StyleName1() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_TableBackground() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_TextStyleName() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Transform() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Width() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_X() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_Y() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircleType_ZIndex() {
        return (EAttribute)getCircleType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorType() {
		if (connectorTypeEClass == null) {
			connectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(22);
		}
		return connectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Title() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Desc() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_EventListeners() {
        return (EReference)getConnectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_GluePoint() {
        return (EReference)getConnectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Group() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_P() {
        return (EReference)getConnectorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_List() {
        return (EReference)getConnectorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_AnchorPageNumber() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_AnchorType() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_CaptionId() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_ClassNames() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_ClassNames1() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_EndCellAddress() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_EndGluePoint() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_EndShape() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_EndX() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_EndY() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Id() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Layer() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_LineSkew() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Name() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_StartGluePoint() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_StartShape() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_StyleName() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_StyleName1() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_TableBackground() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_TextStyleName() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Transform() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Type() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_X1() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_X2() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Y1() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Y2() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_ZIndex() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContourPathType() {
		if (contourPathTypeEClass == null) {
			contourPathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(23);
		}
		return contourPathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContourPathType_D() {
        return (EAttribute)getContourPathType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContourPathType_Height() {
        return (EAttribute)getContourPathType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContourPathType_RecreateOnEdit() {
        return (EAttribute)getContourPathType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContourPathType_ViewBox() {
        return (EAttribute)getContourPathType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContourPathType_Width() {
        return (EAttribute)getContourPathType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContourPolygonType() {
		if (contourPolygonTypeEClass == null) {
			contourPolygonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(24);
		}
		return contourPolygonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContourPolygonType_Height() {
        return (EAttribute)getContourPolygonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContourPolygonType_Points() {
        return (EAttribute)getContourPolygonType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContourPolygonType_RecreateOnEdit() {
        return (EAttribute)getContourPolygonType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContourPolygonType_ViewBox() {
        return (EAttribute)getContourPolygonType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContourPolygonType_Width() {
        return (EAttribute)getContourPolygonType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlType() {
		if (controlTypeEClass == null) {
			controlTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(25);
		}
		return controlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_Title() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_Desc() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlType_GluePoint() {
        return (EReference)getControlType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_AnchorPageNumber() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_AnchorType() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_CaptionId() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_ClassNames() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_ClassNames1() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_Control() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_EndCellAddress() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_EndX() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_EndY() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_Height() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_Id() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_Layer() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_Name() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_StyleName() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_StyleName1() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_TableBackground() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_TextStyleName() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_Transform() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_Width() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_X() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_Y() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlType_ZIndex() {
        return (EAttribute)getControlType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomShapeType() {
		if (customShapeTypeEClass == null) {
			customShapeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(26);
		}
		return customShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_Title() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_Desc() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomShapeType_EventListeners() {
        return (EReference)getCustomShapeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomShapeType_GluePoint() {
        return (EReference)getCustomShapeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_Group() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomShapeType_P() {
        return (EReference)getCustomShapeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomShapeType_List() {
        return (EReference)getCustomShapeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomShapeType_EnhancedGeometry() {
        return (EReference)getCustomShapeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_AnchorPageNumber() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_AnchorType() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_CaptionId() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_ClassNames() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_ClassNames1() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_Data() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_EndCellAddress() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_EndX() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_EndY() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_Engine() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_Height() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_Id() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_Layer() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_Name() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_StyleName() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_StyleName1() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_TableBackground() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_TextStyleName() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_Transform() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_Width() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_X() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_Y() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomShapeType_ZIndex() {
        return (EAttribute)getCustomShapeType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(29);
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
	public EReference getDocumentRoot_Applet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AreaCircle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AreaPolygon() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AreaRectangle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Caption() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Circle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Connector() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContourPath() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ContourPolygon() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Control() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomShape() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ellipse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EnhancedGeometry() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Equation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FillImage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FloatingFrame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Frame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_G() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GluePoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Gradient() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Handle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Hatch() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Image() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImageMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Layer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LayerSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Line() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Marker() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Measure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Object() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectOle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Opacity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Page() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PageThumbnail() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Param() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Path() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Plugin() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Polygon() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Polyline() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rect() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegularPolygon() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StrokeDash() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TextBox() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Align() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Angle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Archive() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AutoGrowHeight() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AutoGrowWidth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BackgroundSize() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Blue() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Border() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CaptionAngle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CaptionAngleType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CaptionEscape() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CaptionEscapeDirection() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CaptionFitLineLength() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CaptionGap() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CaptionId() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CaptionLineLength() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CaptionPointX() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CaptionPointY() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CaptionType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ChainNextName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ClassId() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ClassNames() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Code() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Color() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ColorInversion() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ColorMode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Concave() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ConcentricGradientFillAllowed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Contrast() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Control1() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CopyOf() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CornerRadius() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Corners() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Cx() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Cy() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Data() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DecimalPlaces() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Display() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DisplayName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Distance() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Dots1() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Dots1Length() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Dots2() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Dots2Length() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_End() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EndAngle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EndColor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EndGluePoint() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EndGuide() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EndIntensity() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EndLineSpacingHorizontal() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EndLineSpacingVertical() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EndShape() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Engine() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EnhancedPath() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EscapeDirection() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Extrusion() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionAllowed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionBrightness() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionColor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionDepth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionDiffusion() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionFirstLightDirection() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionFirstLightHarsh() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionFirstLightLevel() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionLightFace() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionMetal() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionNumberOfLineSegments() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionOrigin() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionRotationAngle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionRotationCenter() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionSecondLightDirection() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionSecondLightHarsh() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionSecondLightLevel() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionShininess() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionSkew() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionSpecularity() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExtrusionViewpoint() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Fill() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FillColor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FillGradientName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FillHatchName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FillHatchSolid() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FillImageHeight() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FillImageName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FillImageRefPoint() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FillImageRefPointX() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FillImageRefPointY() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FillImageWidth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FilterName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FitToContour() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FitToSize() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Formula() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FrameDisplayBorder() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FrameDisplayScrollbar() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FrameMarginHorizontal() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FrameMarginVertical() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FrameName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Gamma() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GluePointLeavingDirections() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GluePoints() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GluePointType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GradientStepCount() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Green() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GuideDistance() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GuideOverhang() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HandleMirrorHorizontal() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HandleMirrorVertical() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HandlePolar() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HandlePosition() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HandleRadiusRangeMaximum() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HandleRadiusRangeMinimum() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HandleRangeXMaximum() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HandleRangeXMinimum() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HandleRangeYMaximum() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HandleRangeYMinimum() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HandleSwitched() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ImageOpacity() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Kind() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Layer1() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LineDistance() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LineSkew() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Luminance() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MarkerEnd() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MarkerEndCenter() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(171);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MarkerEndWidth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(172);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MarkerStart() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(173);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MarkerStartCenter() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(174);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MarkerStartWidth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(175);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MasterPageName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(176);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MayScript() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(177);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MeasureAlign() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(178);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MeasureVerticalAlign() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(179);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MimeType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(180);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MirrorHorizontal() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(181);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MirrorVertical() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(182);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Modifiers() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(183);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NavOrder() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(184);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Nohref() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(185);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NotifyOnUpdateOfRanges() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(186);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Object1() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(187);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OleDrawAspect() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(188);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Opacity1() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(189);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OpacityName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(190);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PageNumber() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(191);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Parallel() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(192);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PathStretchpointX() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(193);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PathStretchpointY() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(194);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Placing() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(195);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Points() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(196);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Protected() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(197);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RecreateOnEdit() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(198);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Red() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(199);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Rotation() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(200);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SecondaryFillColor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Shadow() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ShadowColor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ShadowOffsetX() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ShadowOffsetY() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ShadowOpacity() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ShapeId() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(207);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Sharpness() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(208);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ShowUnit() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(209);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Start() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(210);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartAngle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(211);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartColor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(212);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartGluePoint() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(213);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartGuide() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(214);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartIntensity() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(215);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartLineSpacingHorizontal() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(216);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartLineSpacingVertical() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(217);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartShape() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(218);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Stroke() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(219);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StrokeDash1() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(220);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StrokeDashNames() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(221);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StrokeLinejoin() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(222);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StyleName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(223);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SymbolColor() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(224);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextareaHorizontalAlign() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(225);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextAreas() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(226);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextareaVerticalAlign() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(227);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextPath() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(228);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextPathAllowed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(229);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextPathMode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(230);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextPathSameLetterHeights() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(231);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextPathScale() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(232);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextRotateAngle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(233);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextStyleName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(234);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TileRepeatOffset() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(235);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Transform() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(236);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Unit() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(237);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Value() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(238);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VisibleAreaHeight() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(239);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VisibleAreaLeft() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(240);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VisibleAreaTop() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(241);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VisibleAreaWidth() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(242);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WrapInfluenceOnPosition() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(243);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ZIndex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(244);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipseType() {
		if (ellipseTypeEClass == null) {
			ellipseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(30);
		}
		return ellipseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Title() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Desc() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipseType_EventListeners() {
        return (EReference)getEllipseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipseType_GluePoint() {
        return (EReference)getEllipseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Group() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipseType_P() {
        return (EReference)getEllipseType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipseType_List() {
        return (EReference)getEllipseType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_AnchorPageNumber() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_AnchorType() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_CaptionId() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_ClassNames() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_ClassNames1() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Cx() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Cy() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_EndAngle() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_EndCellAddress() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_EndX() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_EndY() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Height() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Id() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Kind() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Layer() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Name() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Rx() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Ry() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_StartAngle() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_StyleName() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_StyleName1() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_TableBackground() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_TextStyleName() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Transform() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Width() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_X() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_Y() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseType_ZIndex() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnhancedGeometryType() {
		if (enhancedGeometryTypeEClass == null) {
			enhancedGeometryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(31);
		}
		return enhancedGeometryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnhancedGeometryType_Equation() {
        return (EReference)getEnhancedGeometryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnhancedGeometryType_Handle() {
        return (EReference)getEnhancedGeometryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ConcentricGradientFillAllowed() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_EnhancedPath() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_Extrusion() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionAllowed() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionBrightness() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionColor() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionDepth() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionDiffusion() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionFirstLightDirection() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionFirstLightHarsh() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionFirstLightLevel() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionLightFace() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionMetal() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionNumberOfLineSegments() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionOrigin() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionRotationAngle() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionRotationCenter() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionSecondLightDirection() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionSecondLightHarsh() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionSecondLightLevel() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionShininess() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionSkew() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionSpecularity() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ExtrusionViewpoint() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_GluePointLeavingDirections() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_GluePoints() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_GluePointType() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_MirrorHorizontal() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_MirrorVertical() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_Modifiers() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_PathStretchpointX() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_PathStretchpointY() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_Projection() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ShadeMode() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_TextAreas() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_TextPath() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_TextPathAllowed() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_TextPathMode() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_TextPathSameLetterHeights() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_TextPathScale() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_TextRotateAngle() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_Type() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnhancedGeometryType_ViewBox() {
        return (EAttribute)getEnhancedGeometryType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquationType() {
		if (equationTypeEClass == null) {
			equationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(32);
		}
		return equationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquationType_Formula() {
        return (EAttribute)getEquationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquationType_Name() {
        return (EAttribute)getEquationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFillImageType() {
		if (fillImageTypeEClass == null) {
			fillImageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(59);
		}
		return fillImageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFillImageType_Actuate() {
        return (EAttribute)getFillImageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFillImageType_DisplayName() {
        return (EAttribute)getFillImageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFillImageType_Height() {
        return (EAttribute)getFillImageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFillImageType_Href() {
        return (EAttribute)getFillImageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFillImageType_Name() {
        return (EAttribute)getFillImageType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFillImageType_Show() {
        return (EAttribute)getFillImageType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFillImageType_Type() {
        return (EAttribute)getFillImageType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFillImageType_Width() {
        return (EAttribute)getFillImageType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatingFrameType() {
		if (floatingFrameTypeEClass == null) {
			floatingFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(63);
		}
		return floatingFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingFrameType_Actuate() {
        return (EAttribute)getFloatingFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingFrameType_FrameName() {
        return (EAttribute)getFloatingFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingFrameType_Href() {
        return (EAttribute)getFloatingFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingFrameType_Show() {
        return (EAttribute)getFloatingFrameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingFrameType_Type() {
        return (EAttribute)getFloatingFrameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrameType() {
		if (frameTypeEClass == null) {
			frameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(64);
		}
		return frameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Group() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameType_TextBox() {
        return (EReference)getFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameType_Image() {
        return (EReference)getFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameType_Object() {
        return (EReference)getFrameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameType_ObjectOle() {
        return (EReference)getFrameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameType_Applet() {
        return (EReference)getFrameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameType_FloatingFrame() {
        return (EReference)getFrameType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameType_Plugin() {
        return (EReference)getFrameType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameType_EventListeners() {
        return (EReference)getFrameType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameType_GluePoint() {
        return (EReference)getFrameType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameType_ImageMap() {
        return (EReference)getFrameType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Title() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Desc() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameType_ContourPolygon() {
        return (EReference)getFrameType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameType_ContourPath() {
        return (EReference)getFrameType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_AnchorPageNumber() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_AnchorType() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_CaptionId() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Class() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_ClassNames() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_ClassNames1() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_CopyOf() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_EndCellAddress() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_EndX() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_EndY() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Height() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Id() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Layer() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Name() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Placeholder() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_RelHeight() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_RelWidth() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_StyleName() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_StyleName1() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_TableBackground() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_TextStyleName() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Transform() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_UserTransformed() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Width() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_X() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Y() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_ZIndex() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGluePointType() {
		if (gluePointTypeEClass == null) {
			gluePointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(65);
		}
		return gluePointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGluePointType_Align() {
        return (EAttribute)getGluePointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGluePointType_Id() {
        return (EAttribute)getGluePointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGluePointType_X() {
        return (EAttribute)getGluePointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGluePointType_Y() {
        return (EAttribute)getGluePointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradientType() {
		if (gradientTypeEClass == null) {
			gradientTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(68);
		}
		return gradientTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientType_Angle() {
        return (EAttribute)getGradientType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientType_Border() {
        return (EAttribute)getGradientType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientType_Cx() {
        return (EAttribute)getGradientType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientType_Cy() {
        return (EAttribute)getGradientType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientType_DisplayName() {
        return (EAttribute)getGradientType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientType_EndColor() {
        return (EAttribute)getGradientType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientType_EndIntensity() {
        return (EAttribute)getGradientType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientType_Name() {
        return (EAttribute)getGradientType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientType_StartColor() {
        return (EAttribute)getGradientType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientType_StartIntensity() {
        return (EAttribute)getGradientType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientType_Style() {
        return (EAttribute)getGradientType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGType() {
		if (gTypeEClass == null) {
			gTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(69);
		}
		return gTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_Title() {
        return (EAttribute)getGType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_Desc() {
        return (EAttribute)getGType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_EventListeners() {
        return (EReference)getGType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_GluePoint() {
        return (EReference)getGType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_Shape() {
        return (EAttribute)getGType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Rect() {
        return (EReference)getGType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Line() {
        return (EReference)getGType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Polyline() {
        return (EReference)getGType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Polygon() {
        return (EReference)getGType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_RegularPolygon() {
        return (EReference)getGType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Path() {
        return (EReference)getGType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Circle() {
        return (EReference)getGType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Ellipse() {
        return (EReference)getGType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_G() {
        return (EReference)getGType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_PageThumbnail() {
        return (EReference)getGType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Frame() {
        return (EReference)getGType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Measure() {
        return (EReference)getGType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Caption() {
        return (EReference)getGType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Connector() {
        return (EReference)getGType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Control() {
        return (EReference)getGType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_Scene() {
        return (EReference)getGType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGType_CustomShape() {
        return (EReference)getGType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_AnchorPageNumber() {
        return (EAttribute)getGType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_AnchorType() {
        return (EAttribute)getGType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_CaptionId() {
        return (EAttribute)getGType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_ClassNames() {
        return (EAttribute)getGType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_ClassNames1() {
        return (EAttribute)getGType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_EndCellAddress() {
        return (EAttribute)getGType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_EndX() {
        return (EAttribute)getGType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_EndY() {
        return (EAttribute)getGType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_Id() {
        return (EAttribute)getGType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_Name() {
        return (EAttribute)getGType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_StyleName() {
        return (EAttribute)getGType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_StyleName1() {
        return (EAttribute)getGType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_TableBackground() {
        return (EAttribute)getGType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_Y() {
        return (EAttribute)getGType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGType_ZIndex() {
        return (EAttribute)getGType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandleType() {
		if (handleTypeEClass == null) {
			handleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(70);
		}
		return handleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandleType_HandleMirrorHorizontal() {
        return (EAttribute)getHandleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandleType_HandleMirrorVertical() {
        return (EAttribute)getHandleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandleType_HandlePolar() {
        return (EAttribute)getHandleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandleType_HandlePosition() {
        return (EAttribute)getHandleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandleType_HandleRadiusRangeMaximum() {
        return (EAttribute)getHandleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandleType_HandleRadiusRangeMinimum() {
        return (EAttribute)getHandleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandleType_HandleRangeXMaximum() {
        return (EAttribute)getHandleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandleType_HandleRangeXMinimum() {
        return (EAttribute)getHandleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandleType_HandleRangeYMaximum() {
        return (EAttribute)getHandleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandleType_HandleRangeYMinimum() {
        return (EAttribute)getHandleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandleType_HandleSwitched() {
        return (EAttribute)getHandleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHatchType() {
		if (hatchTypeEClass == null) {
			hatchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(71);
		}
		return hatchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHatchType_Color() {
        return (EAttribute)getHatchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHatchType_DisplayName() {
        return (EAttribute)getHatchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHatchType_Distance() {
        return (EAttribute)getHatchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHatchType_Name() {
        return (EAttribute)getHatchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHatchType_Rotation() {
        return (EAttribute)getHatchType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHatchType_Style() {
        return (EAttribute)getHatchType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageMapType() {
		if (imageMapTypeEClass == null) {
			imageMapTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(72);
		}
		return imageMapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageMapType_Group() {
        return (EAttribute)getImageMapType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageMapType_AreaRectangle() {
        return (EReference)getImageMapType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageMapType_AreaCircle() {
        return (EReference)getImageMapType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageMapType_AreaPolygon() {
        return (EReference)getImageMapType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageType() {
		if (imageTypeEClass == null) {
			imageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(73);
		}
		return imageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_BinaryData() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Group() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageType_P() {
        return (EReference)getImageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageType_List() {
        return (EReference)getImageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Actuate() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_FilterName() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Href() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Show() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Type() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerSetType() {
		if (layerSetTypeEClass == null) {
			layerSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(76);
		}
		return layerSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerSetType_Layer() {
        return (EReference)getLayerSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerType() {
		if (layerTypeEClass == null) {
			layerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(77);
		}
		return layerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayerType_Title() {
        return (EAttribute)getLayerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayerType_Desc() {
        return (EAttribute)getLayerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayerType_Display() {
        return (EAttribute)getLayerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayerType_Name() {
        return (EAttribute)getLayerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayerType_Protected() {
        return (EAttribute)getLayerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineType() {
		if (lineTypeEClass == null) {
			lineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(82);
		}
		return lineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Title() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Desc() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType_EventListeners() {
        return (EReference)getLineType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType_GluePoint() {
        return (EReference)getLineType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Group() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType_P() {
        return (EReference)getLineType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineType_List() {
        return (EReference)getLineType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_AnchorPageNumber() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_AnchorType() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_CaptionId() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_ClassNames() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_ClassNames1() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_EndCellAddress() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_EndX() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_EndY() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Id() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Layer() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Name() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_StyleName() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_StyleName1() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_TableBackground() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_TextStyleName() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Transform() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_X1() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_X2() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Y1() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_Y2() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineType_ZIndex() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkerType() {
		if (markerTypeEClass == null) {
			markerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(87);
		}
		return markerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkerType_D() {
        return (EAttribute)getMarkerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkerType_DisplayName() {
        return (EAttribute)getMarkerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkerType_Name() {
        return (EAttribute)getMarkerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkerType_ViewBox() {
        return (EAttribute)getMarkerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureType() {
		if (measureTypeEClass == null) {
			measureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(92);
		}
		return measureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Title() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Desc() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_EventListeners() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_GluePoint() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Group() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_P() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureType_List() {
        return (EReference)getMeasureType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_AnchorPageNumber() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_AnchorType() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_CaptionId() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_ClassNames() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_ClassNames1() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_EndCellAddress() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_EndX() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_EndY() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Id() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Layer() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Name() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_StyleName() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_StyleName1() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_TableBackground() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_TextStyleName() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Transform() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_X1() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_X2() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Y1() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_Y2() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureType_ZIndex() {
        return (EAttribute)getMeasureType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectOleType() {
		if (objectOleTypeEClass == null) {
			objectOleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(97);
		}
		return objectOleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectOleType_BinaryData() {
        return (EAttribute)getObjectOleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectOleType_Actuate() {
        return (EAttribute)getObjectOleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectOleType_ClassId() {
        return (EAttribute)getObjectOleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectOleType_Href() {
        return (EAttribute)getObjectOleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectOleType_Show() {
        return (EAttribute)getObjectOleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectOleType_Type() {
        return (EAttribute)getObjectOleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectType() {
		if (objectTypeEClass == null) {
			objectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(98);
		}
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Document() {
        return (EReference)getObjectType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Math() {
        return (EReference)getObjectType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Actuate() {
        return (EAttribute)getObjectType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Href() {
        return (EAttribute)getObjectType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_NotifyOnUpdateOfRanges() {
        return (EAttribute)getObjectType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Show() {
        return (EAttribute)getObjectType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Type() {
        return (EAttribute)getObjectType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpacityType() {
		if (opacityTypeEClass == null) {
			opacityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(101);
		}
		return opacityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpacityType_Angle() {
        return (EAttribute)getOpacityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpacityType_Border() {
        return (EAttribute)getOpacityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpacityType_Cx() {
        return (EAttribute)getOpacityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpacityType_Cy() {
        return (EAttribute)getOpacityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpacityType_DisplayName() {
        return (EAttribute)getOpacityType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpacityType_End() {
        return (EAttribute)getOpacityType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpacityType_Name() {
        return (EAttribute)getOpacityType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpacityType_Start() {
        return (EAttribute)getOpacityType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpacityType_Style() {
        return (EAttribute)getOpacityType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageThumbnailType() {
		if (pageThumbnailTypeEClass == null) {
			pageThumbnailTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(102);
		}
		return pageThumbnailTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_Title() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_Desc() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_AnchorPageNumber() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_AnchorType() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_CaptionId() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_Class() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_ClassNames() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_ClassNames1() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_EndCellAddress() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_EndX() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_EndY() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_Height() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_Id() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_Layer() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_Name() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_PageNumber() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_Placeholder() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_StyleName() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_StyleName1() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_TableBackground() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_Transform() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_UserTransformed() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_Width() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_X() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_Y() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageThumbnailType_ZIndex() {
        return (EAttribute)getPageThumbnailType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageType() {
		if (pageTypeEClass == null) {
			pageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(103);
		}
		return pageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Forms() {
        return (EReference)getPageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageType_Shape() {
        return (EAttribute)getPageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Rect() {
        return (EReference)getPageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Line() {
        return (EReference)getPageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Polyline() {
        return (EReference)getPageType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Polygon() {
        return (EReference)getPageType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_RegularPolygon() {
        return (EReference)getPageType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Path() {
        return (EReference)getPageType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Circle() {
        return (EReference)getPageType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Ellipse() {
        return (EReference)getPageType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_G() {
        return (EReference)getPageType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_PageThumbnail() {
        return (EReference)getPageType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Frame() {
        return (EReference)getPageType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Measure() {
        return (EReference)getPageType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Caption() {
        return (EReference)getPageType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Connector() {
        return (EReference)getPageType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Control() {
        return (EReference)getPageType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Scene() {
        return (EReference)getPageType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_CustomShape() {
        return (EReference)getPageType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Animations() {
        return (EReference)getPageType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageType_AnimationElementGroup() {
        return (EAttribute)getPageType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_AnimationElement() {
        return (EReference)getPageType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageType_Notes() {
        return (EReference)getPageType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageType_Id() {
        return (EAttribute)getPageType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageType_MasterPageName() {
        return (EAttribute)getPageType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageType_Name() {
        return (EAttribute)getPageType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageType_NavOrder() {
        return (EAttribute)getPageType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageType_PresentationPageLayoutName() {
        return (EAttribute)getPageType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageType_StyleName() {
        return (EAttribute)getPageType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageType_UseDateTimeName() {
        return (EAttribute)getPageType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageType_UseFooterName() {
        return (EAttribute)getPageType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageType_UseHeaderName() {
        return (EAttribute)getPageType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType() {
		if (paramTypeEClass == null) {
			paramTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(104);
		}
		return paramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Name() {
        return (EAttribute)getParamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Value() {
        return (EAttribute)getParamType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathType() {
		if (pathTypeEClass == null) {
			pathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(105);
		}
		return pathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_Title() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_Desc() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathType_EventListeners() {
        return (EReference)getPathType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathType_GluePoint() {
        return (EReference)getPathType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_Group() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathType_P() {
        return (EReference)getPathType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathType_List() {
        return (EReference)getPathType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_AnchorPageNumber() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_AnchorType() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_CaptionId() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_ClassNames() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_ClassNames1() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_D() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_EndCellAddress() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_EndX() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_EndY() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_Height() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_Id() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_Layer() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_Name() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_StyleName() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_StyleName1() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_TableBackground() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_TextStyleName() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_Transform() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_ViewBox() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_Width() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_X() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_Y() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathType_ZIndex() {
        return (EAttribute)getPathType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginType() {
		if (pluginTypeEClass == null) {
			pluginTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(108);
		}
		return pluginTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginType_Param() {
        return (EReference)getPluginType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginType_Actuate() {
        return (EAttribute)getPluginType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginType_Href() {
        return (EAttribute)getPluginType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginType_MimeType() {
        return (EAttribute)getPluginType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginType_Show() {
        return (EAttribute)getPluginType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginType_Type() {
        return (EAttribute)getPluginType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonType() {
		if (polygonTypeEClass == null) {
			polygonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(109);
		}
		return polygonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Title() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Desc() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonType_EventListeners() {
        return (EReference)getPolygonType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonType_GluePoint() {
        return (EReference)getPolygonType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Group() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonType_P() {
        return (EReference)getPolygonType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonType_List() {
        return (EReference)getPolygonType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_AnchorPageNumber() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_AnchorType() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_CaptionId() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_ClassNames() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_ClassNames1() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_EndCellAddress() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_EndX() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_EndY() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Height() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Id() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Layer() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Name() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Points() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_StyleName() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_StyleName1() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_TableBackground() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_TextStyleName() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Transform() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_ViewBox() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Width() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_X() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Y() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_ZIndex() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolylineType() {
		if (polylineTypeEClass == null) {
			polylineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(110);
		}
		return polylineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_Title() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_Desc() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolylineType_EventListeners() {
        return (EReference)getPolylineType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolylineType_GluePoint() {
        return (EReference)getPolylineType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_Group() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolylineType_P() {
        return (EReference)getPolylineType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolylineType_List() {
        return (EReference)getPolylineType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_AnchorPageNumber() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_AnchorType() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_CaptionId() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_ClassNames() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_ClassNames1() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_EndCellAddress() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_EndX() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_EndY() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_Height() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_Id() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_Layer() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_Name() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_Points() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_StyleName() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_StyleName1() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_TableBackground() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_TextStyleName() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_Transform() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_ViewBox() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_Width() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_X() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_Y() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolylineType_ZIndex() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectType() {
		if (rectTypeEClass == null) {
			rectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(111);
		}
		return rectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_Title() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_Desc() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectType_EventListeners() {
        return (EReference)getRectType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectType_GluePoint() {
        return (EReference)getRectType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_Group() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectType_P() {
        return (EReference)getRectType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectType_List() {
        return (EReference)getRectType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_AnchorPageNumber() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_AnchorType() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_CaptionId() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_ClassNames() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_ClassNames1() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_CornerRadius() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_EndCellAddress() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_EndX() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_EndY() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_Height() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_Id() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_Layer() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_Name() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_StyleName() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_StyleName1() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_TableBackground() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_TextStyleName() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_Transform() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_Width() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_X() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_Y() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectType_ZIndex() {
        return (EAttribute)getRectType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegularPolygonType() {
		if (regularPolygonTypeEClass == null) {
			regularPolygonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(112);
		}
		return regularPolygonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Title() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Desc() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularPolygonType_EventListeners() {
        return (EReference)getRegularPolygonType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularPolygonType_GluePoint() {
        return (EReference)getRegularPolygonType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Group() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularPolygonType_P() {
        return (EReference)getRegularPolygonType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegularPolygonType_List() {
        return (EReference)getRegularPolygonType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_AnchorPageNumber() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_AnchorType() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_CaptionId() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_ClassNames() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_ClassNames1() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Concave() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Corners() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_EndCellAddress() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_EndX() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_EndY() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Height() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Id() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Layer() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Name() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Sharpness() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_StyleName() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_StyleName1() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_TableBackground() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_TextStyleName() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Transform() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Width() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_X() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_Y() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegularPolygonType_ZIndex() {
        return (EAttribute)getRegularPolygonType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrokeDashType1() {
		if (strokeDashType1EClass == null) {
			strokeDashType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(116);
		}
		return strokeDashType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrokeDashType1_DisplayName() {
        return (EAttribute)getStrokeDashType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrokeDashType1_Distance() {
        return (EAttribute)getStrokeDashType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrokeDashType1_Dots1() {
        return (EAttribute)getStrokeDashType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrokeDashType1_Dots1Length() {
        return (EAttribute)getStrokeDashType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrokeDashType1_Dots2() {
        return (EAttribute)getStrokeDashType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrokeDashType1_Dots2Length() {
        return (EAttribute)getStrokeDashType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrokeDashType1_Name() {
        return (EAttribute)getStrokeDashType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrokeDashType1_Style() {
        return (EAttribute)getStrokeDashType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextBoxType() {
		if (textBoxTypeEClass == null) {
			textBoxTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(132);
		}
		return textBoxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextBoxType_TextContent() {
        return (EAttribute)getTextBoxType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_H() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_P() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_List() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_NumberedParagraph() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Table() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_A() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Section() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_SoftPageBreak() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_TableOfContent() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_IllustrationIndex() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_TableIndex() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_ObjectIndex() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_UserIndex() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_AlphabeticalIndex() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Bibliography() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Rect() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Line() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Polyline() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Polygon() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_RegularPolygon() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Path() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Circle() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Ellipse() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_G() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_PageThumbnail() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Frame() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Measure() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Caption() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Connector() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Control() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_Scene() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_CustomShape() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextBoxType_ChangeMarksGroup() {
        return (EAttribute)getTextBoxType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextBoxType_ChangeMarks() {
        return (EReference)getTextBoxType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextBoxType_ChainNextName() {
        return (EAttribute)getTextBoxType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextBoxType_CornerRadius() {
        return (EAttribute)getTextBoxType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextBoxType_Id() {
        return (EAttribute)getTextBoxType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextBoxType_MaxHeight() {
        return (EAttribute)getTextBoxType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextBoxType_MaxWidth() {
        return (EAttribute)getTextBoxType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextBoxType_MinHeight() {
        return (EAttribute)getTextBoxType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextBoxType_MinWidth() {
        return (EAttribute)getTextBoxType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignType() {
		if (alignTypeEEnum == null) {
			alignTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(0);
		}
		return alignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBackgroundSizeType() {
		if (backgroundSizeTypeEEnum == null) {
			backgroundSizeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(7);
		}
		return backgroundSizeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCaptionAngleTypeType() {
		if (captionAngleTypeTypeEEnum == null) {
			captionAngleTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(9);
		}
		return captionAngleTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCaptionEscapeDirectionType() {
		if (captionEscapeDirectionTypeEEnum == null) {
			captionEscapeDirectionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(11);
		}
		return captionEscapeDirectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCaptionTypeType() {
		if (captionTypeTypeEEnum == null) {
			captionTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(15);
		}
		return captionTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorModeType() {
		if (colorModeTypeEEnum == null) {
			colorModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(18);
		}
		return colorModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConcaveType() {
		if (concaveTypeEEnum == null) {
			concaveTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(20);
		}
		return concaveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayType() {
		if (displayTypeEEnum == null) {
			displayTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(27);
		}
		return displayTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEscapeDirectionType() {
		if (escapeDirectionTypeEEnum == null) {
			escapeDirectionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(33);
		}
		return escapeDirectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFillImageRefPointType() {
		if (fillImageRefPointTypeEEnum == null) {
			fillImageRefPointTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(57);
		}
		return fillImageRefPointTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFillType() {
		if (fillTypeEEnum == null) {
			fillTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(61);
		}
		return fillTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGluePointTypeType() {
		if (gluePointTypeTypeEEnum == null) {
			gluePointTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(66);
		}
		return gluePointTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKindType() {
		if (kindTypeEEnum == null) {
			kindTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(74);
		}
		return kindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasureAlignType() {
		if (measureAlignTypeEEnum == null) {
			measureAlignTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(90);
		}
		return measureAlignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasureVerticalAlignType() {
		if (measureVerticalAlignTypeEEnum == null) {
			measureVerticalAlignTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(93);
		}
		return measureVerticalAlignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNohrefType() {
		if (nohrefTypeEEnum == null) {
			nohrefTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(95);
		}
		return nohrefTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlacingType() {
		if (placingTypeEEnum == null) {
			placingTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(106);
		}
		return placingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShadowType() {
		if (shadowTypeEEnum == null) {
			shadowTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(113);
		}
		return shadowTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStrokeLinejoinType() {
		if (strokeLinejoinTypeEEnum == null) {
			strokeLinejoinTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(118);
		}
		return strokeLinejoinTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStrokeType() {
		if (strokeTypeEEnum == null) {
			strokeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(120);
		}
		return strokeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStyleType() {
		if (styleTypeEEnum == null) {
			styleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(124);
		}
		return styleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStyleType1() {
		if (styleType1EEnum == null) {
			styleType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(125);
		}
		return styleType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextareaHorizontalAlignType() {
		if (textareaHorizontalAlignTypeEEnum == null) {
			textareaHorizontalAlignTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(128);
		}
		return textareaHorizontalAlignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextareaVerticalAlignType() {
		if (textareaVerticalAlignTypeEEnum == null) {
			textareaVerticalAlignTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(130);
		}
		return textareaVerticalAlignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextPathModeType() {
		if (textPathModeTypeEEnum == null) {
			textPathModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(133);
		}
		return textPathModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextPathScaleType() {
		if (textPathScaleTypeEEnum == null) {
			textPathScaleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(135);
		}
		return textPathScaleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType() {
		if (typeTypeEEnum == null) {
			typeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(139);
		}
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitType() {
		if (unitTypeEEnum == null) {
			unitTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(141);
		}
		return unitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWrapInfluenceOnPositionType() {
		if (wrapInfluenceOnPositionTypeEEnum == null) {
			wrapInfluenceOnPositionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(143);
		}
		return wrapInfluenceOnPositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlignTypeObject() {
		if (alignTypeObjectEDataType == null) {
			alignTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(1);
		}
		return alignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBackgroundSizeTypeObject() {
		if (backgroundSizeTypeObjectEDataType == null) {
			backgroundSizeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(8);
		}
		return backgroundSizeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCaptionAngleTypeTypeObject() {
		if (captionAngleTypeTypeObjectEDataType == null) {
			captionAngleTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(10);
		}
		return captionAngleTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCaptionEscapeDirectionTypeObject() {
		if (captionEscapeDirectionTypeObjectEDataType == null) {
			captionEscapeDirectionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(12);
		}
		return captionEscapeDirectionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCaptionEscapeType() {
		if (captionEscapeTypeEDataType == null) {
			captionEscapeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(13);
		}
		return captionEscapeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCaptionTypeTypeObject() {
		if (captionTypeTypeObjectEDataType == null) {
			captionTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(16);
		}
		return captionTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorModeTypeObject() {
		if (colorModeTypeObjectEDataType == null) {
			colorModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(19);
		}
		return colorModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConcaveTypeObject() {
		if (concaveTypeObjectEDataType == null) {
			concaveTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(21);
		}
		return concaveTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisplayTypeObject() {
		if (displayTypeObjectEDataType == null) {
			displayTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(28);
		}
		return displayTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEscapeDirectionTypeObject() {
		if (escapeDirectionTypeObjectEDataType == null) {
			escapeDirectionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(34);
		}
		return escapeDirectionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionDepthType() {
		if (extrusionDepthTypeEDataType == null) {
			extrusionDepthTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(35);
		}
		return extrusionDepthTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionDepthTypeBase() {
		if (extrusionDepthTypeBaseEDataType == null) {
			extrusionDepthTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(36);
		}
		return extrusionDepthTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionDepthTypeBaseItem() {
		if (extrusionDepthTypeBaseItemEDataType == null) {
			extrusionDepthTypeBaseItemEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(37);
		}
		return extrusionDepthTypeBaseItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionOriginType() {
		if (extrusionOriginTypeEDataType == null) {
			extrusionOriginTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(38);
		}
		return extrusionOriginTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionOriginTypeBase() {
		if (extrusionOriginTypeBaseEDataType == null) {
			extrusionOriginTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(39);
		}
		return extrusionOriginTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionOriginTypeBaseItem() {
		if (extrusionOriginTypeBaseItemEDataType == null) {
			extrusionOriginTypeBaseItemEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(40);
		}
		return extrusionOriginTypeBaseItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionOriginTypeBaseItemObject() {
		if (extrusionOriginTypeBaseItemObjectEDataType == null) {
			extrusionOriginTypeBaseItemObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(41);
		}
		return extrusionOriginTypeBaseItemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionRotationAngleType() {
		if (extrusionRotationAngleTypeEDataType == null) {
			extrusionRotationAngleTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(42);
		}
		return extrusionRotationAngleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionRotationAngleTypeBase() {
		if (extrusionRotationAngleTypeBaseEDataType == null) {
			extrusionRotationAngleTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(43);
		}
		return extrusionRotationAngleTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionRotationAngleTypeBaseItem() {
		if (extrusionRotationAngleTypeBaseItemEDataType == null) {
			extrusionRotationAngleTypeBaseItemEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(44);
		}
		return extrusionRotationAngleTypeBaseItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionRotationAngleTypeBaseItemObject() {
		if (extrusionRotationAngleTypeBaseItemObjectEDataType == null) {
			extrusionRotationAngleTypeBaseItemObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(45);
		}
		return extrusionRotationAngleTypeBaseItemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionSkewType() {
		if (extrusionSkewTypeEDataType == null) {
			extrusionSkewTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(46);
		}
		return extrusionSkewTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionSkewTypeBase() {
		if (extrusionSkewTypeBaseEDataType == null) {
			extrusionSkewTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(47);
		}
		return extrusionSkewTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionSkewTypeBaseItem() {
		if (extrusionSkewTypeBaseItemEDataType == null) {
			extrusionSkewTypeBaseItemEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(48);
		}
		return extrusionSkewTypeBaseItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtrusionSkewTypeBaseItemObject() {
		if (extrusionSkewTypeBaseItemObjectEDataType == null) {
			extrusionSkewTypeBaseItemObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(49);
		}
		return extrusionSkewTypeBaseItemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillGradientNameType() {
		if (fillGradientNameTypeEDataType == null) {
			fillGradientNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(50);
		}
		return fillGradientNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillGradientNameTypeMember1() {
		if (fillGradientNameTypeMember1EDataType == null) {
			fillGradientNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(51);
		}
		return fillGradientNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillHatchNameType() {
		if (fillHatchNameTypeEDataType == null) {
			fillHatchNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(52);
		}
		return fillHatchNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillHatchNameTypeMember1() {
		if (fillHatchNameTypeMember1EDataType == null) {
			fillHatchNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(53);
		}
		return fillHatchNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillImageHeightType() {
		if (fillImageHeightTypeEDataType == null) {
			fillImageHeightTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(54);
		}
		return fillImageHeightTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillImageNameType() {
		if (fillImageNameTypeEDataType == null) {
			fillImageNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(55);
		}
		return fillImageNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillImageNameTypeMember1() {
		if (fillImageNameTypeMember1EDataType == null) {
			fillImageNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(56);
		}
		return fillImageNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillImageRefPointTypeObject() {
		if (fillImageRefPointTypeObjectEDataType == null) {
			fillImageRefPointTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(58);
		}
		return fillImageRefPointTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillImageWidthType() {
		if (fillImageWidthTypeEDataType == null) {
			fillImageWidthTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(60);
		}
		return fillImageWidthTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillTypeObject() {
		if (fillTypeObjectEDataType == null) {
			fillTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(62);
		}
		return fillTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGluePointTypeTypeObject() {
		if (gluePointTypeTypeObjectEDataType == null) {
			gluePointTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(67);
		}
		return gluePointTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKindTypeObject() {
		if (kindTypeObjectEDataType == null) {
			kindTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(75);
		}
		return kindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineSkewType() {
		if (lineSkewTypeEDataType == null) {
			lineSkewTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(78);
		}
		return lineSkewTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineSkewTypeBase() {
		if (lineSkewTypeBaseEDataType == null) {
			lineSkewTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(79);
		}
		return lineSkewTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineSkewTypeBaseItem() {
		if (lineSkewTypeBaseItemEDataType == null) {
			lineSkewTypeBaseItemEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(80);
		}
		return lineSkewTypeBaseItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineSkewTypeBaseItemMember1() {
		if (lineSkewTypeBaseItemMember1EDataType == null) {
			lineSkewTypeBaseItemMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(81);
		}
		return lineSkewTypeBaseItemMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMarkerEndType() {
		if (markerEndTypeEDataType == null) {
			markerEndTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(83);
		}
		return markerEndTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMarkerEndTypeMember1() {
		if (markerEndTypeMember1EDataType == null) {
			markerEndTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(84);
		}
		return markerEndTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMarkerStartType() {
		if (markerStartTypeEDataType == null) {
			markerStartTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(85);
		}
		return markerStartTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMarkerStartTypeMember1() {
		if (markerStartTypeMember1EDataType == null) {
			markerStartTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(86);
		}
		return markerStartTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMasterPageNameType() {
		if (masterPageNameTypeEDataType == null) {
			masterPageNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(88);
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
			masterPageNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(89);
		}
		return masterPageNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMeasureAlignTypeObject() {
		if (measureAlignTypeObjectEDataType == null) {
			measureAlignTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(91);
		}
		return measureAlignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMeasureVerticalAlignTypeObject() {
		if (measureVerticalAlignTypeObjectEDataType == null) {
			measureVerticalAlignTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(94);
		}
		return measureVerticalAlignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNohrefTypeObject() {
		if (nohrefTypeObjectEDataType == null) {
			nohrefTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(96);
		}
		return nohrefTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOpacityNameType() {
		if (opacityNameTypeEDataType == null) {
			opacityNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(99);
		}
		return opacityNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOpacityNameTypeMember1() {
		if (opacityNameTypeMember1EDataType == null) {
			opacityNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(100);
		}
		return opacityNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPlacingTypeObject() {
		if (placingTypeObjectEDataType == null) {
			placingTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(107);
		}
		return placingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShadowTypeObject() {
		if (shadowTypeObjectEDataType == null) {
			shadowTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(114);
		}
		return shadowTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStrokeDashType() {
		if (strokeDashTypeEDataType == null) {
			strokeDashTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(115);
		}
		return strokeDashTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStrokeDashTypeMember1() {
		if (strokeDashTypeMember1EDataType == null) {
			strokeDashTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(117);
		}
		return strokeDashTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStrokeLinejoinTypeObject() {
		if (strokeLinejoinTypeObjectEDataType == null) {
			strokeLinejoinTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(119);
		}
		return strokeLinejoinTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStrokeTypeObject() {
		if (strokeTypeObjectEDataType == null) {
			strokeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(121);
		}
		return strokeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType() {
		if (styleNameTypeEDataType == null) {
			styleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(122);
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
			styleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(123);
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
			styleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(126);
		}
		return styleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleTypeObject1() {
		if (styleTypeObject1EDataType == null) {
			styleTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(127);
		}
		return styleTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextareaHorizontalAlignTypeObject() {
		if (textareaHorizontalAlignTypeObjectEDataType == null) {
			textareaHorizontalAlignTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(129);
		}
		return textareaHorizontalAlignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextareaVerticalAlignTypeObject() {
		if (textareaVerticalAlignTypeObjectEDataType == null) {
			textareaVerticalAlignTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(131);
		}
		return textareaVerticalAlignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextPathModeTypeObject() {
		if (textPathModeTypeObjectEDataType == null) {
			textPathModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(134);
		}
		return textPathModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextPathScaleTypeObject() {
		if (textPathScaleTypeObjectEDataType == null) {
			textPathScaleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(136);
		}
		return textPathScaleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextStyleNameType() {
		if (textStyleNameTypeEDataType == null) {
			textStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(137);
		}
		return textStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextStyleNameTypeMember1() {
		if (textStyleNameTypeMember1EDataType == null) {
			textStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(138);
		}
		return textStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject() {
		if (typeTypeObjectEDataType == null) {
			typeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(140);
		}
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnitTypeObject() {
		if (unitTypeObjectEDataType == null) {
			unitTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(142);
		}
		return unitTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWrapInfluenceOnPositionTypeObject() {
		if (wrapInfluenceOnPositionTypeObjectEDataType == null) {
			wrapInfluenceOnPositionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI).getEClassifiers().get(144);
		}
		return wrapInfluenceOnPositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawingFactory getDrawingFactory() {
		return (DrawingFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.oasisopen.names.tc.opendocument.xmlns.drawing." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //DrawingPackageImpl
