/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AlignType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.BackgroundSizeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionAngleTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeDirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ColorModeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ConcaveType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DisplayType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EquationType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EscapeDirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageRefPointType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FillType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerSetType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureVerticalAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.NohrefType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ParamType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PlacingType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ShadowType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeLinejoinType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleType1;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TypeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.util.TextValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage
 * @generated
 */
public class DrawingValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DrawingValidator INSTANCE = new DrawingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.oasisopen.names.tc.opendocument.xmlns.drawing";

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
	protected TextValidator textValidator;

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
	public DrawingValidator() {
		super();
		textValidator = TextValidator.INSTANCE;
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
	  return DrawingPackage.eINSTANCE;
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
			case DrawingPackage.APPLET_TYPE:
				return validateAppletType((AppletType)value, diagnostics, context);
			case DrawingPackage.AREA_CIRCLE_TYPE:
				return validateAreaCircleType((AreaCircleType)value, diagnostics, context);
			case DrawingPackage.AREA_POLYGON_TYPE:
				return validateAreaPolygonType((AreaPolygonType)value, diagnostics, context);
			case DrawingPackage.AREA_RECTANGLE_TYPE:
				return validateAreaRectangleType((AreaRectangleType)value, diagnostics, context);
			case DrawingPackage.ATYPE:
				return validateAType((AType)value, diagnostics, context);
			case DrawingPackage.CAPTION_TYPE:
				return validateCaptionType((CaptionType)value, diagnostics, context);
			case DrawingPackage.CIRCLE_TYPE:
				return validateCircleType((CircleType)value, diagnostics, context);
			case DrawingPackage.CONNECTOR_TYPE:
				return validateConnectorType((ConnectorType)value, diagnostics, context);
			case DrawingPackage.CONTOUR_PATH_TYPE:
				return validateContourPathType((ContourPathType)value, diagnostics, context);
			case DrawingPackage.CONTOUR_POLYGON_TYPE:
				return validateContourPolygonType((ContourPolygonType)value, diagnostics, context);
			case DrawingPackage.CONTROL_TYPE:
				return validateControlType((ControlType)value, diagnostics, context);
			case DrawingPackage.CUSTOM_SHAPE_TYPE:
				return validateCustomShapeType((CustomShapeType)value, diagnostics, context);
			case DrawingPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case DrawingPackage.ELLIPSE_TYPE:
				return validateEllipseType((EllipseType)value, diagnostics, context);
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE:
				return validateEnhancedGeometryType((EnhancedGeometryType)value, diagnostics, context);
			case DrawingPackage.EQUATION_TYPE:
				return validateEquationType((EquationType)value, diagnostics, context);
			case DrawingPackage.FILL_IMAGE_TYPE:
				return validateFillImageType((FillImageType)value, diagnostics, context);
			case DrawingPackage.FLOATING_FRAME_TYPE:
				return validateFloatingFrameType((FloatingFrameType)value, diagnostics, context);
			case DrawingPackage.FRAME_TYPE:
				return validateFrameType((FrameType)value, diagnostics, context);
			case DrawingPackage.GLUE_POINT_TYPE:
				return validateGluePointType((GluePointType)value, diagnostics, context);
			case DrawingPackage.GRADIENT_TYPE:
				return validateGradientType((GradientType)value, diagnostics, context);
			case DrawingPackage.GTYPE:
				return validateGType((GType)value, diagnostics, context);
			case DrawingPackage.HANDLE_TYPE:
				return validateHandleType((HandleType)value, diagnostics, context);
			case DrawingPackage.HATCH_TYPE:
				return validateHatchType((HatchType)value, diagnostics, context);
			case DrawingPackage.IMAGE_MAP_TYPE:
				return validateImageMapType((ImageMapType)value, diagnostics, context);
			case DrawingPackage.IMAGE_TYPE:
				return validateImageType((ImageType)value, diagnostics, context);
			case DrawingPackage.LAYER_SET_TYPE:
				return validateLayerSetType((LayerSetType)value, diagnostics, context);
			case DrawingPackage.LAYER_TYPE:
				return validateLayerType((LayerType)value, diagnostics, context);
			case DrawingPackage.LINE_TYPE:
				return validateLineType((LineType)value, diagnostics, context);
			case DrawingPackage.MARKER_TYPE:
				return validateMarkerType((MarkerType)value, diagnostics, context);
			case DrawingPackage.MEASURE_TYPE:
				return validateMeasureType((MeasureType)value, diagnostics, context);
			case DrawingPackage.OBJECT_OLE_TYPE:
				return validateObjectOleType((ObjectOleType)value, diagnostics, context);
			case DrawingPackage.OBJECT_TYPE:
				return validateObjectType((ObjectType)value, diagnostics, context);
			case DrawingPackage.OPACITY_TYPE:
				return validateOpacityType((OpacityType)value, diagnostics, context);
			case DrawingPackage.PAGE_THUMBNAIL_TYPE:
				return validatePageThumbnailType((PageThumbnailType)value, diagnostics, context);
			case DrawingPackage.PAGE_TYPE:
				return validatePageType((PageType)value, diagnostics, context);
			case DrawingPackage.PARAM_TYPE:
				return validateParamType((ParamType)value, diagnostics, context);
			case DrawingPackage.PATH_TYPE:
				return validatePathType((PathType)value, diagnostics, context);
			case DrawingPackage.PLUGIN_TYPE:
				return validatePluginType((PluginType)value, diagnostics, context);
			case DrawingPackage.POLYGON_TYPE:
				return validatePolygonType((PolygonType)value, diagnostics, context);
			case DrawingPackage.POLYLINE_TYPE:
				return validatePolylineType((PolylineType)value, diagnostics, context);
			case DrawingPackage.RECT_TYPE:
				return validateRectType((RectType)value, diagnostics, context);
			case DrawingPackage.REGULAR_POLYGON_TYPE:
				return validateRegularPolygonType((RegularPolygonType)value, diagnostics, context);
			case DrawingPackage.STROKE_DASH_TYPE1:
				return validateStrokeDashType1((StrokeDashType1)value, diagnostics, context);
			case DrawingPackage.TEXT_BOX_TYPE:
				return validateTextBoxType((TextBoxType)value, diagnostics, context);
			case DrawingPackage.ALIGN_TYPE:
				return validateAlignType((AlignType)value, diagnostics, context);
			case DrawingPackage.BACKGROUND_SIZE_TYPE:
				return validateBackgroundSizeType((BackgroundSizeType)value, diagnostics, context);
			case DrawingPackage.CAPTION_ANGLE_TYPE_TYPE:
				return validateCaptionAngleTypeType((CaptionAngleTypeType)value, diagnostics, context);
			case DrawingPackage.CAPTION_ESCAPE_DIRECTION_TYPE:
				return validateCaptionEscapeDirectionType((CaptionEscapeDirectionType)value, diagnostics, context);
			case DrawingPackage.CAPTION_TYPE_TYPE:
				return validateCaptionTypeType((CaptionTypeType)value, diagnostics, context);
			case DrawingPackage.COLOR_MODE_TYPE:
				return validateColorModeType((ColorModeType)value, diagnostics, context);
			case DrawingPackage.CONCAVE_TYPE:
				return validateConcaveType((ConcaveType)value, diagnostics, context);
			case DrawingPackage.DISPLAY_TYPE:
				return validateDisplayType((DisplayType)value, diagnostics, context);
			case DrawingPackage.ESCAPE_DIRECTION_TYPE:
				return validateEscapeDirectionType((EscapeDirectionType)value, diagnostics, context);
			case DrawingPackage.FILL_IMAGE_REF_POINT_TYPE:
				return validateFillImageRefPointType((FillImageRefPointType)value, diagnostics, context);
			case DrawingPackage.FILL_TYPE:
				return validateFillType((FillType)value, diagnostics, context);
			case DrawingPackage.GLUE_POINT_TYPE_TYPE:
				return validateGluePointTypeType((GluePointTypeType)value, diagnostics, context);
			case DrawingPackage.KIND_TYPE:
				return validateKindType((KindType)value, diagnostics, context);
			case DrawingPackage.MEASURE_ALIGN_TYPE:
				return validateMeasureAlignType((MeasureAlignType)value, diagnostics, context);
			case DrawingPackage.MEASURE_VERTICAL_ALIGN_TYPE:
				return validateMeasureVerticalAlignType((MeasureVerticalAlignType)value, diagnostics, context);
			case DrawingPackage.NOHREF_TYPE:
				return validateNohrefType((NohrefType)value, diagnostics, context);
			case DrawingPackage.PLACING_TYPE:
				return validatePlacingType((PlacingType)value, diagnostics, context);
			case DrawingPackage.SHADOW_TYPE:
				return validateShadowType((ShadowType)value, diagnostics, context);
			case DrawingPackage.STROKE_LINEJOIN_TYPE:
				return validateStrokeLinejoinType((StrokeLinejoinType)value, diagnostics, context);
			case DrawingPackage.STROKE_TYPE:
				return validateStrokeType((StrokeType)value, diagnostics, context);
			case DrawingPackage.STYLE_TYPE:
				return validateStyleType((StyleType)value, diagnostics, context);
			case DrawingPackage.STYLE_TYPE1:
				return validateStyleType1((StyleType1)value, diagnostics, context);
			case DrawingPackage.TEXTAREA_HORIZONTAL_ALIGN_TYPE:
				return validateTextareaHorizontalAlignType((TextareaHorizontalAlignType)value, diagnostics, context);
			case DrawingPackage.TEXTAREA_VERTICAL_ALIGN_TYPE:
				return validateTextareaVerticalAlignType((TextareaVerticalAlignType)value, diagnostics, context);
			case DrawingPackage.TEXT_PATH_MODE_TYPE:
				return validateTextPathModeType((TextPathModeType)value, diagnostics, context);
			case DrawingPackage.TEXT_PATH_SCALE_TYPE:
				return validateTextPathScaleType((TextPathScaleType)value, diagnostics, context);
			case DrawingPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case DrawingPackage.UNIT_TYPE:
				return validateUnitType((UnitType)value, diagnostics, context);
			case DrawingPackage.WRAP_INFLUENCE_ON_POSITION_TYPE:
				return validateWrapInfluenceOnPositionType((WrapInfluenceOnPositionType)value, diagnostics, context);
			case DrawingPackage.ALIGN_TYPE_OBJECT:
				return validateAlignTypeObject((AlignType)value, diagnostics, context);
			case DrawingPackage.BACKGROUND_SIZE_TYPE_OBJECT:
				return validateBackgroundSizeTypeObject((BackgroundSizeType)value, diagnostics, context);
			case DrawingPackage.CAPTION_ANGLE_TYPE_TYPE_OBJECT:
				return validateCaptionAngleTypeTypeObject((CaptionAngleTypeType)value, diagnostics, context);
			case DrawingPackage.CAPTION_ESCAPE_DIRECTION_TYPE_OBJECT:
				return validateCaptionEscapeDirectionTypeObject((CaptionEscapeDirectionType)value, diagnostics, context);
			case DrawingPackage.CAPTION_ESCAPE_TYPE:
				return validateCaptionEscapeType((String)value, diagnostics, context);
			case DrawingPackage.CAPTION_TYPE_TYPE_OBJECT:
				return validateCaptionTypeTypeObject((CaptionTypeType)value, diagnostics, context);
			case DrawingPackage.COLOR_MODE_TYPE_OBJECT:
				return validateColorModeTypeObject((ColorModeType)value, diagnostics, context);
			case DrawingPackage.CONCAVE_TYPE_OBJECT:
				return validateConcaveTypeObject((ConcaveType)value, diagnostics, context);
			case DrawingPackage.DISPLAY_TYPE_OBJECT:
				return validateDisplayTypeObject((DisplayType)value, diagnostics, context);
			case DrawingPackage.ESCAPE_DIRECTION_TYPE_OBJECT:
				return validateEscapeDirectionTypeObject((EscapeDirectionType)value, diagnostics, context);
			case DrawingPackage.EXTRUSION_DEPTH_TYPE:
				return validateExtrusionDepthType((List)value, diagnostics, context);
			case DrawingPackage.EXTRUSION_DEPTH_TYPE_BASE:
				return validateExtrusionDepthTypeBase((List<?>)value, diagnostics, context);
			case DrawingPackage.EXTRUSION_DEPTH_TYPE_BASE_ITEM:
				return validateExtrusionDepthTypeBaseItem(value, diagnostics, context);
			case DrawingPackage.EXTRUSION_ORIGIN_TYPE:
				return validateExtrusionOriginType((List)value, diagnostics, context);
			case DrawingPackage.EXTRUSION_ORIGIN_TYPE_BASE:
				return validateExtrusionOriginTypeBase((List<?>)value, diagnostics, context);
			case DrawingPackage.EXTRUSION_ORIGIN_TYPE_BASE_ITEM:
				return validateExtrusionOriginTypeBaseItem(((Double)value).doubleValue(), diagnostics, context);
			case DrawingPackage.EXTRUSION_ORIGIN_TYPE_BASE_ITEM_OBJECT:
				return validateExtrusionOriginTypeBaseItemObject((Double)value, diagnostics, context);
			case DrawingPackage.EXTRUSION_ROTATION_ANGLE_TYPE:
				return validateExtrusionRotationAngleType((List)value, diagnostics, context);
			case DrawingPackage.EXTRUSION_ROTATION_ANGLE_TYPE_BASE:
				return validateExtrusionRotationAngleTypeBase((List<?>)value, diagnostics, context);
			case DrawingPackage.EXTRUSION_ROTATION_ANGLE_TYPE_BASE_ITEM:
				return validateExtrusionRotationAngleTypeBaseItem(((Double)value).doubleValue(), diagnostics, context);
			case DrawingPackage.EXTRUSION_ROTATION_ANGLE_TYPE_BASE_ITEM_OBJECT:
				return validateExtrusionRotationAngleTypeBaseItemObject((Double)value, diagnostics, context);
			case DrawingPackage.EXTRUSION_SKEW_TYPE:
				return validateExtrusionSkewType((List)value, diagnostics, context);
			case DrawingPackage.EXTRUSION_SKEW_TYPE_BASE:
				return validateExtrusionSkewTypeBase((List<?>)value, diagnostics, context);
			case DrawingPackage.EXTRUSION_SKEW_TYPE_BASE_ITEM:
				return validateExtrusionSkewTypeBaseItem(((Double)value).doubleValue(), diagnostics, context);
			case DrawingPackage.EXTRUSION_SKEW_TYPE_BASE_ITEM_OBJECT:
				return validateExtrusionSkewTypeBaseItemObject((Double)value, diagnostics, context);
			case DrawingPackage.FILL_GRADIENT_NAME_TYPE:
				return validateFillGradientNameType((String)value, diagnostics, context);
			case DrawingPackage.FILL_GRADIENT_NAME_TYPE_MEMBER1:
				return validateFillGradientNameTypeMember1((String)value, diagnostics, context);
			case DrawingPackage.FILL_HATCH_NAME_TYPE:
				return validateFillHatchNameType((String)value, diagnostics, context);
			case DrawingPackage.FILL_HATCH_NAME_TYPE_MEMBER1:
				return validateFillHatchNameTypeMember1((String)value, diagnostics, context);
			case DrawingPackage.FILL_IMAGE_HEIGHT_TYPE:
				return validateFillImageHeightType((String)value, diagnostics, context);
			case DrawingPackage.FILL_IMAGE_NAME_TYPE:
				return validateFillImageNameType((String)value, diagnostics, context);
			case DrawingPackage.FILL_IMAGE_NAME_TYPE_MEMBER1:
				return validateFillImageNameTypeMember1((String)value, diagnostics, context);
			case DrawingPackage.FILL_IMAGE_REF_POINT_TYPE_OBJECT:
				return validateFillImageRefPointTypeObject((FillImageRefPointType)value, diagnostics, context);
			case DrawingPackage.FILL_IMAGE_WIDTH_TYPE:
				return validateFillImageWidthType((String)value, diagnostics, context);
			case DrawingPackage.FILL_TYPE_OBJECT:
				return validateFillTypeObject((FillType)value, diagnostics, context);
			case DrawingPackage.GLUE_POINT_TYPE_TYPE_OBJECT:
				return validateGluePointTypeTypeObject((GluePointTypeType)value, diagnostics, context);
			case DrawingPackage.KIND_TYPE_OBJECT:
				return validateKindTypeObject((KindType)value, diagnostics, context);
			case DrawingPackage.LINE_SKEW_TYPE:
				return validateLineSkewType((List)value, diagnostics, context);
			case DrawingPackage.LINE_SKEW_TYPE_BASE:
				return validateLineSkewTypeBase((List<?>)value, diagnostics, context);
			case DrawingPackage.LINE_SKEW_TYPE_BASE_ITEM:
				return validateLineSkewTypeBaseItem((String)value, diagnostics, context);
			case DrawingPackage.LINE_SKEW_TYPE_BASE_ITEM_MEMBER1:
				return validateLineSkewTypeBaseItemMember1((String)value, diagnostics, context);
			case DrawingPackage.MARKER_END_TYPE:
				return validateMarkerEndType((String)value, diagnostics, context);
			case DrawingPackage.MARKER_END_TYPE_MEMBER1:
				return validateMarkerEndTypeMember1((String)value, diagnostics, context);
			case DrawingPackage.MARKER_START_TYPE:
				return validateMarkerStartType((String)value, diagnostics, context);
			case DrawingPackage.MARKER_START_TYPE_MEMBER1:
				return validateMarkerStartTypeMember1((String)value, diagnostics, context);
			case DrawingPackage.MASTER_PAGE_NAME_TYPE:
				return validateMasterPageNameType((String)value, diagnostics, context);
			case DrawingPackage.MASTER_PAGE_NAME_TYPE_MEMBER1:
				return validateMasterPageNameTypeMember1((String)value, diagnostics, context);
			case DrawingPackage.MEASURE_ALIGN_TYPE_OBJECT:
				return validateMeasureAlignTypeObject((MeasureAlignType)value, diagnostics, context);
			case DrawingPackage.MEASURE_VERTICAL_ALIGN_TYPE_OBJECT:
				return validateMeasureVerticalAlignTypeObject((MeasureVerticalAlignType)value, diagnostics, context);
			case DrawingPackage.NOHREF_TYPE_OBJECT:
				return validateNohrefTypeObject((NohrefType)value, diagnostics, context);
			case DrawingPackage.OPACITY_NAME_TYPE:
				return validateOpacityNameType((String)value, diagnostics, context);
			case DrawingPackage.OPACITY_NAME_TYPE_MEMBER1:
				return validateOpacityNameTypeMember1((String)value, diagnostics, context);
			case DrawingPackage.PLACING_TYPE_OBJECT:
				return validatePlacingTypeObject((PlacingType)value, diagnostics, context);
			case DrawingPackage.SHADOW_TYPE_OBJECT:
				return validateShadowTypeObject((ShadowType)value, diagnostics, context);
			case DrawingPackage.STROKE_DASH_TYPE:
				return validateStrokeDashType((String)value, diagnostics, context);
			case DrawingPackage.STROKE_DASH_TYPE_MEMBER1:
				return validateStrokeDashTypeMember1((String)value, diagnostics, context);
			case DrawingPackage.STROKE_LINEJOIN_TYPE_OBJECT:
				return validateStrokeLinejoinTypeObject((StrokeLinejoinType)value, diagnostics, context);
			case DrawingPackage.STROKE_TYPE_OBJECT:
				return validateStrokeTypeObject((StrokeType)value, diagnostics, context);
			case DrawingPackage.STYLE_NAME_TYPE:
				return validateStyleNameType((String)value, diagnostics, context);
			case DrawingPackage.STYLE_NAME_TYPE_MEMBER1:
				return validateStyleNameTypeMember1((String)value, diagnostics, context);
			case DrawingPackage.STYLE_TYPE_OBJECT:
				return validateStyleTypeObject((StyleType)value, diagnostics, context);
			case DrawingPackage.STYLE_TYPE_OBJECT1:
				return validateStyleTypeObject1((StyleType1)value, diagnostics, context);
			case DrawingPackage.TEXTAREA_HORIZONTAL_ALIGN_TYPE_OBJECT:
				return validateTextareaHorizontalAlignTypeObject((TextareaHorizontalAlignType)value, diagnostics, context);
			case DrawingPackage.TEXTAREA_VERTICAL_ALIGN_TYPE_OBJECT:
				return validateTextareaVerticalAlignTypeObject((TextareaVerticalAlignType)value, diagnostics, context);
			case DrawingPackage.TEXT_PATH_MODE_TYPE_OBJECT:
				return validateTextPathModeTypeObject((TextPathModeType)value, diagnostics, context);
			case DrawingPackage.TEXT_PATH_SCALE_TYPE_OBJECT:
				return validateTextPathScaleTypeObject((TextPathScaleType)value, diagnostics, context);
			case DrawingPackage.TEXT_STYLE_NAME_TYPE:
				return validateTextStyleNameType((String)value, diagnostics, context);
			case DrawingPackage.TEXT_STYLE_NAME_TYPE_MEMBER1:
				return validateTextStyleNameTypeMember1((String)value, diagnostics, context);
			case DrawingPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case DrawingPackage.UNIT_TYPE_OBJECT:
				return validateUnitTypeObject((UnitType)value, diagnostics, context);
			case DrawingPackage.WRAP_INFLUENCE_ON_POSITION_TYPE_OBJECT:
				return validateWrapInfluenceOnPositionTypeObject((WrapInfluenceOnPositionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppletType(AppletType appletType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appletType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAreaCircleType(AreaCircleType areaCircleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(areaCircleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAreaPolygonType(AreaPolygonType areaPolygonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(areaPolygonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAreaRectangleType(AreaRectangleType areaRectangleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(areaRectangleType, diagnostics, context);
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
	public boolean validateCaptionType(CaptionType captionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(captionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCircleType(CircleType circleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(circleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorType(ConnectorType connectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContourPathType(ContourPathType contourPathType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contourPathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContourPolygonType(ContourPolygonType contourPolygonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contourPolygonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlType(ControlType controlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomShapeType(CustomShapeType customShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customShapeType, diagnostics, context);
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
	public boolean validateEllipseType(EllipseType ellipseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ellipseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnhancedGeometryType(EnhancedGeometryType enhancedGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enhancedGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquationType(EquationType equationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillImageType(FillImageType fillImageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fillImageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatingFrameType(FloatingFrameType floatingFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floatingFrameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameType(FrameType frameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGluePointType(GluePointType gluePointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gluePointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGradientType(GradientType gradientType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gradientType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGType(GType gType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandleType(HandleType handleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(handleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHatchType(HatchType hatchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hatchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageMapType(ImageMapType imageMapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageType(ImageType imageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayerSetType(LayerSetType layerSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layerSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayerType(LayerType layerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineType(LineType lineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkerType(MarkerType markerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(markerType, diagnostics, context);
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
	public boolean validateObjectOleType(ObjectOleType objectOleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectOleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectType(ObjectType objectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpacityType(OpacityType opacityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(opacityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageThumbnailType(PageThumbnailType pageThumbnailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageThumbnailType, diagnostics, context);
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
	public boolean validateParamType(ParamType paramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathType(PathType pathType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePluginType(PluginType pluginType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pluginType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonType(PolygonType polygonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolylineType(PolylineType polylineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polylineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRectType(RectType rectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularPolygonType(RegularPolygonType regularPolygonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regularPolygonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeDashType1(StrokeDashType1 strokeDashType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strokeDashType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextBoxType(TextBoxType textBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignType(AlignType alignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundSizeType(BackgroundSizeType backgroundSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptionAngleTypeType(CaptionAngleTypeType captionAngleTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptionEscapeDirectionType(CaptionEscapeDirectionType captionEscapeDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptionTypeType(CaptionTypeType captionTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorModeType(ColorModeType colorModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcaveType(ConcaveType concaveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateEscapeDirectionType(EscapeDirectionType escapeDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillImageRefPointType(FillImageRefPointType fillImageRefPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillType(FillType fillType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGluePointTypeType(GluePointTypeType gluePointTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateMeasureAlignType(MeasureAlignType measureAlignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureVerticalAlignType(MeasureVerticalAlignType measureVerticalAlignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNohrefType(NohrefType nohrefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacingType(PlacingType placingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShadowType(ShadowType shadowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeLinejoinType(StrokeLinejoinType strokeLinejoinType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeType(StrokeType strokeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateStyleType1(StyleType1 styleType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextareaHorizontalAlignType(TextareaHorizontalAlignType textareaHorizontalAlignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextareaVerticalAlignType(TextareaVerticalAlignType textareaVerticalAlignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPathModeType(TextPathModeType textPathModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPathScaleType(TextPathScaleType textPathScaleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateUnitType(UnitType unitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapInfluenceOnPositionType(WrapInfluenceOnPositionType wrapInfluenceOnPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignTypeObject(AlignType alignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundSizeTypeObject(BackgroundSizeType backgroundSizeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptionAngleTypeTypeObject(CaptionAngleTypeType captionAngleTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptionEscapeDirectionTypeObject(CaptionEscapeDirectionType captionEscapeDirectionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptionEscapeType(String captionEscapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCaptionEscapeType_MemberTypes(captionEscapeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Caption Escape Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptionEscapeType_MemberTypes(String captionEscapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(captionEscapeType)) {
				if (textValidator.validateLength(captionEscapeType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(captionEscapeType)) {
				if (textValidator.validatePercent(captionEscapeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(captionEscapeType)) {
				if (textValidator.validateLength(captionEscapeType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(captionEscapeType)) {
				if (textValidator.validatePercent(captionEscapeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptionTypeTypeObject(CaptionTypeType captionTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorModeTypeObject(ColorModeType colorModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcaveTypeObject(ConcaveType concaveTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayTypeObject(DisplayType displayTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEscapeDirectionTypeObject(EscapeDirectionType escapeDirectionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionDepthType(List extrusionDepthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionDepthType_MinLength(extrusionDepthType, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtrusionDepthType_MaxLength(extrusionDepthType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Extrusion Depth Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionDepthType_MinLength(List extrusionDepthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = extrusionDepthType.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getExtrusionDepthType(), extrusionDepthType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Extrusion Depth Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionDepthType_MaxLength(List extrusionDepthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = extrusionDepthType.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getExtrusionDepthType(), extrusionDepthType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionDepthTypeBase(List<?> extrusionDepthTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionDepthTypeBase_ItemType(extrusionDepthTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Extrusion Depth Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionDepthTypeBase_ItemType(List<?> extrusionDepthTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = extrusionDepthTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (DrawingPackage.eINSTANCE.getExtrusionDepthTypeBaseItem().isInstance(item)) {
				result &= validateExtrusionDepthTypeBaseItem(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(DrawingPackage.eINSTANCE.getExtrusionDepthTypeBaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionDepthTypeBaseItem(Object extrusionDepthTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionDepthTypeBaseItem_MemberTypes(extrusionDepthTypeBaseItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Extrusion Depth Type Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionDepthTypeBaseItem_MemberTypes(Object extrusionDepthTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(extrusionDepthTypeBaseItem)) {
				if (textValidator.validateLength((String)extrusionDepthTypeBaseItem, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getDouble().isInstance(extrusionDepthTypeBaseItem)) {
				if (textValidator.validateDouble(((Double)extrusionDepthTypeBaseItem).doubleValue(), tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(extrusionDepthTypeBaseItem)) {
				if (textValidator.validateLength((String)extrusionDepthTypeBaseItem, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getDouble().isInstance(extrusionDepthTypeBaseItem)) {
				if (textValidator.validateDouble(((Double)extrusionDepthTypeBaseItem).doubleValue(), null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionOriginType(List extrusionOriginType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionOriginType_MinLength(extrusionOriginType, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtrusionOriginType_MaxLength(extrusionOriginType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Extrusion Origin Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionOriginType_MinLength(List extrusionOriginType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = extrusionOriginType.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getExtrusionOriginType(), extrusionOriginType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Extrusion Origin Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionOriginType_MaxLength(List extrusionOriginType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = extrusionOriginType.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getExtrusionOriginType(), extrusionOriginType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionOriginTypeBase(List<?> extrusionOriginTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionOriginTypeBase_ItemType(extrusionOriginTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Extrusion Origin Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionOriginTypeBase_ItemType(List<?> extrusionOriginTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = extrusionOriginTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (DrawingPackage.eINSTANCE.getExtrusionOriginTypeBaseItem().isInstance(item)) {
				result &= validateExtrusionOriginTypeBaseItem(((Double)item).doubleValue(), diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(DrawingPackage.eINSTANCE.getExtrusionOriginTypeBaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionOriginTypeBaseItem(double extrusionOriginTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionOriginTypeBaseItem_MemberTypes(extrusionOriginTypeBaseItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Extrusion Origin Type Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionOriginTypeBaseItem_MemberTypes(double extrusionOriginTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (textValidator.validateDouble(extrusionOriginTypeBaseItem, tempDiagnostics, context)) return true;
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (textValidator.validateDouble(extrusionOriginTypeBaseItem, null, context)) return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionOriginTypeBaseItemObject(Double extrusionOriginTypeBaseItemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionOriginTypeBaseItem_MemberTypes(extrusionOriginTypeBaseItemObject.doubleValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionRotationAngleType(List extrusionRotationAngleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionRotationAngleType_MinLength(extrusionRotationAngleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtrusionRotationAngleType_MaxLength(extrusionRotationAngleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Extrusion Rotation Angle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionRotationAngleType_MinLength(List extrusionRotationAngleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = extrusionRotationAngleType.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getExtrusionRotationAngleType(), extrusionRotationAngleType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Extrusion Rotation Angle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionRotationAngleType_MaxLength(List extrusionRotationAngleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = extrusionRotationAngleType.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getExtrusionRotationAngleType(), extrusionRotationAngleType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionRotationAngleTypeBase(List<?> extrusionRotationAngleTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionRotationAngleTypeBase_ItemType(extrusionRotationAngleTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Extrusion Rotation Angle Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionRotationAngleTypeBase_ItemType(List<?> extrusionRotationAngleTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = extrusionRotationAngleTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (DrawingPackage.eINSTANCE.getExtrusionRotationAngleTypeBaseItem().isInstance(item)) {
				result &= validateExtrusionRotationAngleTypeBaseItem(((Double)item).doubleValue(), diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(DrawingPackage.eINSTANCE.getExtrusionRotationAngleTypeBaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionRotationAngleTypeBaseItem(double extrusionRotationAngleTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionRotationAngleTypeBaseItem_MemberTypes(extrusionRotationAngleTypeBaseItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Extrusion Rotation Angle Type Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionRotationAngleTypeBaseItem_MemberTypes(double extrusionRotationAngleTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (textValidator.validateDouble(extrusionRotationAngleTypeBaseItem, tempDiagnostics, context)) return true;
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (textValidator.validateDouble(extrusionRotationAngleTypeBaseItem, null, context)) return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionRotationAngleTypeBaseItemObject(Double extrusionRotationAngleTypeBaseItemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionRotationAngleTypeBaseItem_MemberTypes(extrusionRotationAngleTypeBaseItemObject.doubleValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionSkewType(List extrusionSkewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionSkewType_MinLength(extrusionSkewType, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtrusionSkewType_MaxLength(extrusionSkewType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Extrusion Skew Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionSkewType_MinLength(List extrusionSkewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = extrusionSkewType.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getExtrusionSkewType(), extrusionSkewType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Extrusion Skew Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionSkewType_MaxLength(List extrusionSkewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = extrusionSkewType.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getExtrusionSkewType(), extrusionSkewType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionSkewTypeBase(List<?> extrusionSkewTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionSkewTypeBase_ItemType(extrusionSkewTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Extrusion Skew Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionSkewTypeBase_ItemType(List<?> extrusionSkewTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = extrusionSkewTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (DrawingPackage.eINSTANCE.getExtrusionSkewTypeBaseItem().isInstance(item)) {
				result &= validateExtrusionSkewTypeBaseItem(((Double)item).doubleValue(), diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(DrawingPackage.eINSTANCE.getExtrusionSkewTypeBaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionSkewTypeBaseItem(double extrusionSkewTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionSkewTypeBaseItem_MemberTypes(extrusionSkewTypeBaseItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Extrusion Skew Type Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionSkewTypeBaseItem_MemberTypes(double extrusionSkewTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (textValidator.validateDouble(extrusionSkewTypeBaseItem, tempDiagnostics, context)) return true;
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (textValidator.validateDouble(extrusionSkewTypeBaseItem, null, context)) return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrusionSkewTypeBaseItemObject(Double extrusionSkewTypeBaseItemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExtrusionSkewTypeBaseItem_MemberTypes(extrusionSkewTypeBaseItemObject.doubleValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillGradientNameType(String fillGradientNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFillGradientNameType_MemberTypes(fillGradientNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fill Gradient Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillGradientNameType_MemberTypes(String fillGradientNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(fillGradientNameType)) {
				if (textValidator.validateStyleNameRef(fillGradientNameType, tempDiagnostics, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getFillGradientNameTypeMember1().isInstance(fillGradientNameType)) {
				if (validateFillGradientNameTypeMember1(fillGradientNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(fillGradientNameType)) {
				if (textValidator.validateStyleNameRef(fillGradientNameType, null, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getFillGradientNameTypeMember1().isInstance(fillGradientNameType)) {
				if (validateFillGradientNameTypeMember1(fillGradientNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillGradientNameTypeMember1(String fillGradientNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFillGradientNameTypeMember1_MinLength(fillGradientNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateFillGradientNameTypeMember1_MaxLength(fillGradientNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Fill Gradient Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillGradientNameTypeMember1_MinLength(String fillGradientNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = fillGradientNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getFillGradientNameTypeMember1(), fillGradientNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Fill Gradient Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillGradientNameTypeMember1_MaxLength(String fillGradientNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = fillGradientNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getFillGradientNameTypeMember1(), fillGradientNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillHatchNameType(String fillHatchNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFillHatchNameType_MemberTypes(fillHatchNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fill Hatch Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillHatchNameType_MemberTypes(String fillHatchNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(fillHatchNameType)) {
				if (textValidator.validateStyleNameRef(fillHatchNameType, tempDiagnostics, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getFillHatchNameTypeMember1().isInstance(fillHatchNameType)) {
				if (validateFillHatchNameTypeMember1(fillHatchNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(fillHatchNameType)) {
				if (textValidator.validateStyleNameRef(fillHatchNameType, null, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getFillHatchNameTypeMember1().isInstance(fillHatchNameType)) {
				if (validateFillHatchNameTypeMember1(fillHatchNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillHatchNameTypeMember1(String fillHatchNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFillHatchNameTypeMember1_MinLength(fillHatchNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateFillHatchNameTypeMember1_MaxLength(fillHatchNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Fill Hatch Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillHatchNameTypeMember1_MinLength(String fillHatchNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = fillHatchNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getFillHatchNameTypeMember1(), fillHatchNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Fill Hatch Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillHatchNameTypeMember1_MaxLength(String fillHatchNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = fillHatchNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getFillHatchNameTypeMember1(), fillHatchNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillImageHeightType(String fillImageHeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFillImageHeightType_MemberTypes(fillImageHeightType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fill Image Height Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillImageHeightType_MemberTypes(String fillImageHeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(fillImageHeightType)) {
				if (textValidator.validateLength(fillImageHeightType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(fillImageHeightType)) {
				if (textValidator.validatePercent(fillImageHeightType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(fillImageHeightType)) {
				if (textValidator.validateLength(fillImageHeightType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(fillImageHeightType)) {
				if (textValidator.validatePercent(fillImageHeightType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillImageNameType(String fillImageNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFillImageNameType_MemberTypes(fillImageNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fill Image Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillImageNameType_MemberTypes(String fillImageNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(fillImageNameType)) {
				if (textValidator.validateStyleNameRef(fillImageNameType, tempDiagnostics, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getFillImageNameTypeMember1().isInstance(fillImageNameType)) {
				if (validateFillImageNameTypeMember1(fillImageNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(fillImageNameType)) {
				if (textValidator.validateStyleNameRef(fillImageNameType, null, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getFillImageNameTypeMember1().isInstance(fillImageNameType)) {
				if (validateFillImageNameTypeMember1(fillImageNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillImageNameTypeMember1(String fillImageNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFillImageNameTypeMember1_MinLength(fillImageNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateFillImageNameTypeMember1_MaxLength(fillImageNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Fill Image Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillImageNameTypeMember1_MinLength(String fillImageNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = fillImageNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getFillImageNameTypeMember1(), fillImageNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Fill Image Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillImageNameTypeMember1_MaxLength(String fillImageNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = fillImageNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getFillImageNameTypeMember1(), fillImageNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillImageRefPointTypeObject(FillImageRefPointType fillImageRefPointTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillImageWidthType(String fillImageWidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFillImageWidthType_MemberTypes(fillImageWidthType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Fill Image Width Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillImageWidthType_MemberTypes(String fillImageWidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(fillImageWidthType)) {
				if (textValidator.validateLength(fillImageWidthType, tempDiagnostics, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(fillImageWidthType)) {
				if (textValidator.validatePercent(fillImageWidthType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(fillImageWidthType)) {
				if (textValidator.validateLength(fillImageWidthType, null, context)) return true;
			}
			if (TextPackage.eINSTANCE.getPercent().isInstance(fillImageWidthType)) {
				if (textValidator.validatePercent(fillImageWidthType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillTypeObject(FillType fillTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGluePointTypeTypeObject(GluePointTypeType gluePointTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateLineSkewType(List lineSkewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLineSkewType_MinLength(lineSkewType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLineSkewType_MaxLength(lineSkewType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Line Skew Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineSkewType_MinLength(List lineSkewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = lineSkewType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getLineSkewType(), lineSkewType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Line Skew Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineSkewType_MaxLength(List lineSkewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = lineSkewType.size();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getLineSkewType(), lineSkewType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineSkewTypeBase(List<?> lineSkewTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLineSkewTypeBase_ItemType(lineSkewTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Line Skew Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineSkewTypeBase_ItemType(List<?> lineSkewTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = lineSkewTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (DrawingPackage.eINSTANCE.getLineSkewTypeBaseItem().isInstance(item)) {
				result &= validateLineSkewTypeBaseItem((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(DrawingPackage.eINSTANCE.getLineSkewTypeBaseItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineSkewTypeBaseItem(String lineSkewTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLineSkewTypeBaseItem_MemberTypes(lineSkewTypeBaseItem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Line Skew Type Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineSkewTypeBaseItem_MemberTypes(String lineSkewTypeBaseItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(lineSkewTypeBaseItem)) {
				if (textValidator.validateLength(lineSkewTypeBaseItem, tempDiagnostics, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getLineSkewTypeBaseItemMember1().isInstance(lineSkewTypeBaseItem)) {
				if (validateLineSkewTypeBaseItemMember1(lineSkewTypeBaseItem, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(lineSkewTypeBaseItem)) {
				if (textValidator.validateLength(lineSkewTypeBaseItem, null, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getLineSkewTypeBaseItemMember1().isInstance(lineSkewTypeBaseItem)) {
				if (validateLineSkewTypeBaseItemMember1(lineSkewTypeBaseItem, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineSkewTypeBaseItemMember1(String lineSkewTypeBaseItemMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLineSkewTypeBaseItemMember1_MemberTypes(lineSkewTypeBaseItemMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Line Skew Type Base Item Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineSkewTypeBaseItemMember1_MemberTypes(String lineSkewTypeBaseItemMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getLength().isInstance(lineSkewTypeBaseItemMember1)) {
				if (textValidator.validateLength(lineSkewTypeBaseItemMember1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getLength().isInstance(lineSkewTypeBaseItemMember1)) {
				if (textValidator.validateLength(lineSkewTypeBaseItemMember1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkerEndType(String markerEndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarkerEndType_MemberTypes(markerEndType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Marker End Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkerEndType_MemberTypes(String markerEndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(markerEndType)) {
				if (textValidator.validateStyleNameRef(markerEndType, tempDiagnostics, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getMarkerEndTypeMember1().isInstance(markerEndType)) {
				if (validateMarkerEndTypeMember1(markerEndType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(markerEndType)) {
				if (textValidator.validateStyleNameRef(markerEndType, null, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getMarkerEndTypeMember1().isInstance(markerEndType)) {
				if (validateMarkerEndTypeMember1(markerEndType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkerEndTypeMember1(String markerEndTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarkerEndTypeMember1_MinLength(markerEndTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateMarkerEndTypeMember1_MaxLength(markerEndTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Marker End Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkerEndTypeMember1_MinLength(String markerEndTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = markerEndTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getMarkerEndTypeMember1(), markerEndTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Marker End Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkerEndTypeMember1_MaxLength(String markerEndTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = markerEndTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getMarkerEndTypeMember1(), markerEndTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkerStartType(String markerStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarkerStartType_MemberTypes(markerStartType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Marker Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkerStartType_MemberTypes(String markerStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(markerStartType)) {
				if (textValidator.validateStyleNameRef(markerStartType, tempDiagnostics, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getMarkerStartTypeMember1().isInstance(markerStartType)) {
				if (validateMarkerStartTypeMember1(markerStartType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(markerStartType)) {
				if (textValidator.validateStyleNameRef(markerStartType, null, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getMarkerStartTypeMember1().isInstance(markerStartType)) {
				if (validateMarkerStartTypeMember1(markerStartType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkerStartTypeMember1(String markerStartTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMarkerStartTypeMember1_MinLength(markerStartTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateMarkerStartTypeMember1_MaxLength(markerStartTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Marker Start Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkerStartTypeMember1_MinLength(String markerStartTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = markerStartTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getMarkerStartTypeMember1(), markerStartTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Marker Start Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkerStartTypeMember1_MaxLength(String markerStartTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = markerStartTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getMarkerStartTypeMember1(), markerStartTypeMember1, length, 0, diagnostics, context);
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
				if (textValidator.validateStyleNameRef(masterPageNameType, tempDiagnostics, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getMasterPageNameTypeMember1().isInstance(masterPageNameType)) {
				if (validateMasterPageNameTypeMember1(masterPageNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(masterPageNameType)) {
				if (textValidator.validateStyleNameRef(masterPageNameType, null, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getMasterPageNameTypeMember1().isInstance(masterPageNameType)) {
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
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getMasterPageNameTypeMember1(), masterPageNameTypeMember1, length, 0, diagnostics, context);
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
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getMasterPageNameTypeMember1(), masterPageNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureAlignTypeObject(MeasureAlignType measureAlignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureVerticalAlignTypeObject(MeasureVerticalAlignType measureVerticalAlignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNohrefTypeObject(NohrefType nohrefTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpacityNameType(String opacityNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOpacityNameType_MemberTypes(opacityNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Opacity Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpacityNameType_MemberTypes(String opacityNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(opacityNameType)) {
				if (textValidator.validateStyleNameRef(opacityNameType, tempDiagnostics, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getOpacityNameTypeMember1().isInstance(opacityNameType)) {
				if (validateOpacityNameTypeMember1(opacityNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(opacityNameType)) {
				if (textValidator.validateStyleNameRef(opacityNameType, null, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getOpacityNameTypeMember1().isInstance(opacityNameType)) {
				if (validateOpacityNameTypeMember1(opacityNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpacityNameTypeMember1(String opacityNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOpacityNameTypeMember1_MinLength(opacityNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateOpacityNameTypeMember1_MaxLength(opacityNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Opacity Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpacityNameTypeMember1_MinLength(String opacityNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = opacityNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getOpacityNameTypeMember1(), opacityNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Opacity Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpacityNameTypeMember1_MaxLength(String opacityNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = opacityNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getOpacityNameTypeMember1(), opacityNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacingTypeObject(PlacingType placingTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShadowTypeObject(ShadowType shadowTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeDashType(String strokeDashType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStrokeDashType_MemberTypes(strokeDashType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Stroke Dash Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeDashType_MemberTypes(String strokeDashType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(strokeDashType)) {
				if (textValidator.validateStyleNameRef(strokeDashType, tempDiagnostics, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getStrokeDashTypeMember1().isInstance(strokeDashType)) {
				if (validateStrokeDashTypeMember1(strokeDashType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(strokeDashType)) {
				if (textValidator.validateStyleNameRef(strokeDashType, null, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getStrokeDashTypeMember1().isInstance(strokeDashType)) {
				if (validateStrokeDashTypeMember1(strokeDashType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeDashTypeMember1(String strokeDashTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStrokeDashTypeMember1_MinLength(strokeDashTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrokeDashTypeMember1_MaxLength(strokeDashTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Stroke Dash Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeDashTypeMember1_MinLength(String strokeDashTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = strokeDashTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getStrokeDashTypeMember1(), strokeDashTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Stroke Dash Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeDashTypeMember1_MaxLength(String strokeDashTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = strokeDashTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getStrokeDashTypeMember1(), strokeDashTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeLinejoinTypeObject(StrokeLinejoinType strokeLinejoinTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrokeTypeObject(StrokeType strokeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * Validates the MemberTypes constraint of '<em>Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType_MemberTypes(String styleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType)) {
				if (textValidator.validateStyleNameRef(styleNameType, tempDiagnostics, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getStyleNameTypeMember1().isInstance(styleNameType)) {
				if (validateStyleNameTypeMember1(styleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType)) {
				if (textValidator.validateStyleNameRef(styleNameType, null, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getStyleNameTypeMember1().isInstance(styleNameType)) {
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
	 * Validates the MinLength constraint of '<em>Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember1_MinLength(String styleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getStyleNameTypeMember1(), styleNameTypeMember1, length, 0, diagnostics, context);
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
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getStyleNameTypeMember1(), styleNameTypeMember1, length, 0, diagnostics, context);
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
	public boolean validateStyleTypeObject1(StyleType1 styleTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextareaHorizontalAlignTypeObject(TextareaHorizontalAlignType textareaHorizontalAlignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextareaVerticalAlignTypeObject(TextareaVerticalAlignType textareaVerticalAlignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPathModeTypeObject(TextPathModeType textPathModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextPathScaleTypeObject(TextPathScaleType textPathScaleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextStyleNameType(String textStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextStyleNameType_MemberTypes(textStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Text Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextStyleNameType_MemberTypes(String textStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(textStyleNameType)) {
				if (textValidator.validateStyleNameRef(textStyleNameType, tempDiagnostics, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getTextStyleNameTypeMember1().isInstance(textStyleNameType)) {
				if (validateTextStyleNameTypeMember1(textStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(textStyleNameType)) {
				if (textValidator.validateStyleNameRef(textStyleNameType, null, context)) return true;
			}
			if (DrawingPackage.eINSTANCE.getTextStyleNameTypeMember1().isInstance(textStyleNameType)) {
				if (validateTextStyleNameTypeMember1(textStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextStyleNameTypeMember1(String textStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextStyleNameTypeMember1_MinLength(textStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextStyleNameTypeMember1_MaxLength(textStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Text Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextStyleNameTypeMember1_MinLength(String textStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = textStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DrawingPackage.eINSTANCE.getTextStyleNameTypeMember1(), textStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Text Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextStyleNameTypeMember1_MaxLength(String textStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = textStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DrawingPackage.eINSTANCE.getTextStyleNameTypeMember1(), textStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
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
	public boolean validateUnitTypeObject(UnitType unitTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapInfluenceOnPositionTypeObject(WrapInfluenceOnPositionType wrapInfluenceOnPositionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //DrawingValidator
