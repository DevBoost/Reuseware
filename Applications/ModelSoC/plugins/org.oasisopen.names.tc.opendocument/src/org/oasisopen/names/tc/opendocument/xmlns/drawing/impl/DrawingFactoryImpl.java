/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
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
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingFactory;
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
import org.oasisopen.names.tc.opendocument.xmlns.text.TextFactory;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DrawingFactoryImpl extends EFactoryImpl implements DrawingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DrawingFactory init() {
		try {
			DrawingFactory theDrawingFactory = (DrawingFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"); 
			if (theDrawingFactory != null) {
				return theDrawingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DrawingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawingFactoryImpl() {
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
			case DrawingPackage.APPLET_TYPE: return createAppletType();
			case DrawingPackage.AREA_CIRCLE_TYPE: return createAreaCircleType();
			case DrawingPackage.AREA_POLYGON_TYPE: return createAreaPolygonType();
			case DrawingPackage.AREA_RECTANGLE_TYPE: return createAreaRectangleType();
			case DrawingPackage.ATYPE: return createAType();
			case DrawingPackage.CAPTION_TYPE: return createCaptionType();
			case DrawingPackage.CIRCLE_TYPE: return createCircleType();
			case DrawingPackage.CONNECTOR_TYPE: return createConnectorType();
			case DrawingPackage.CONTOUR_PATH_TYPE: return createContourPathType();
			case DrawingPackage.CONTOUR_POLYGON_TYPE: return createContourPolygonType();
			case DrawingPackage.CONTROL_TYPE: return createControlType();
			case DrawingPackage.CUSTOM_SHAPE_TYPE: return createCustomShapeType();
			case DrawingPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case DrawingPackage.ELLIPSE_TYPE: return createEllipseType();
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE: return createEnhancedGeometryType();
			case DrawingPackage.EQUATION_TYPE: return createEquationType();
			case DrawingPackage.FILL_IMAGE_TYPE: return createFillImageType();
			case DrawingPackage.FLOATING_FRAME_TYPE: return createFloatingFrameType();
			case DrawingPackage.FRAME_TYPE: return createFrameType();
			case DrawingPackage.GLUE_POINT_TYPE: return createGluePointType();
			case DrawingPackage.GRADIENT_TYPE: return createGradientType();
			case DrawingPackage.GTYPE: return createGType();
			case DrawingPackage.HANDLE_TYPE: return createHandleType();
			case DrawingPackage.HATCH_TYPE: return createHatchType();
			case DrawingPackage.IMAGE_MAP_TYPE: return createImageMapType();
			case DrawingPackage.IMAGE_TYPE: return createImageType();
			case DrawingPackage.LAYER_SET_TYPE: return createLayerSetType();
			case DrawingPackage.LAYER_TYPE: return createLayerType();
			case DrawingPackage.LINE_TYPE: return createLineType();
			case DrawingPackage.MARKER_TYPE: return createMarkerType();
			case DrawingPackage.MEASURE_TYPE: return createMeasureType();
			case DrawingPackage.OBJECT_OLE_TYPE: return createObjectOleType();
			case DrawingPackage.OBJECT_TYPE: return createObjectType();
			case DrawingPackage.OPACITY_TYPE: return createOpacityType();
			case DrawingPackage.PAGE_THUMBNAIL_TYPE: return createPageThumbnailType();
			case DrawingPackage.PAGE_TYPE: return createPageType();
			case DrawingPackage.PARAM_TYPE: return createParamType();
			case DrawingPackage.PATH_TYPE: return createPathType();
			case DrawingPackage.PLUGIN_TYPE: return createPluginType();
			case DrawingPackage.POLYGON_TYPE: return createPolygonType();
			case DrawingPackage.POLYLINE_TYPE: return createPolylineType();
			case DrawingPackage.RECT_TYPE: return createRectType();
			case DrawingPackage.REGULAR_POLYGON_TYPE: return createRegularPolygonType();
			case DrawingPackage.STROKE_DASH_TYPE1: return createStrokeDashType1();
			case DrawingPackage.TEXT_BOX_TYPE: return createTextBoxType();
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
			case DrawingPackage.ALIGN_TYPE:
				return createAlignTypeFromString(eDataType, initialValue);
			case DrawingPackage.BACKGROUND_SIZE_TYPE:
				return createBackgroundSizeTypeFromString(eDataType, initialValue);
			case DrawingPackage.CAPTION_ANGLE_TYPE_TYPE:
				return createCaptionAngleTypeTypeFromString(eDataType, initialValue);
			case DrawingPackage.CAPTION_ESCAPE_DIRECTION_TYPE:
				return createCaptionEscapeDirectionTypeFromString(eDataType, initialValue);
			case DrawingPackage.CAPTION_TYPE_TYPE:
				return createCaptionTypeTypeFromString(eDataType, initialValue);
			case DrawingPackage.COLOR_MODE_TYPE:
				return createColorModeTypeFromString(eDataType, initialValue);
			case DrawingPackage.CONCAVE_TYPE:
				return createConcaveTypeFromString(eDataType, initialValue);
			case DrawingPackage.DISPLAY_TYPE:
				return createDisplayTypeFromString(eDataType, initialValue);
			case DrawingPackage.ESCAPE_DIRECTION_TYPE:
				return createEscapeDirectionTypeFromString(eDataType, initialValue);
			case DrawingPackage.FILL_IMAGE_REF_POINT_TYPE:
				return createFillImageRefPointTypeFromString(eDataType, initialValue);
			case DrawingPackage.FILL_TYPE:
				return createFillTypeFromString(eDataType, initialValue);
			case DrawingPackage.GLUE_POINT_TYPE_TYPE:
				return createGluePointTypeTypeFromString(eDataType, initialValue);
			case DrawingPackage.KIND_TYPE:
				return createKindTypeFromString(eDataType, initialValue);
			case DrawingPackage.MEASURE_ALIGN_TYPE:
				return createMeasureAlignTypeFromString(eDataType, initialValue);
			case DrawingPackage.MEASURE_VERTICAL_ALIGN_TYPE:
				return createMeasureVerticalAlignTypeFromString(eDataType, initialValue);
			case DrawingPackage.NOHREF_TYPE:
				return createNohrefTypeFromString(eDataType, initialValue);
			case DrawingPackage.PLACING_TYPE:
				return createPlacingTypeFromString(eDataType, initialValue);
			case DrawingPackage.SHADOW_TYPE:
				return createShadowTypeFromString(eDataType, initialValue);
			case DrawingPackage.STROKE_LINEJOIN_TYPE:
				return createStrokeLinejoinTypeFromString(eDataType, initialValue);
			case DrawingPackage.STROKE_TYPE:
				return createStrokeTypeFromString(eDataType, initialValue);
			case DrawingPackage.STYLE_TYPE:
				return createStyleTypeFromString(eDataType, initialValue);
			case DrawingPackage.STYLE_TYPE1:
				return createStyleType1FromString(eDataType, initialValue);
			case DrawingPackage.TEXTAREA_HORIZONTAL_ALIGN_TYPE:
				return createTextareaHorizontalAlignTypeFromString(eDataType, initialValue);
			case DrawingPackage.TEXTAREA_VERTICAL_ALIGN_TYPE:
				return createTextareaVerticalAlignTypeFromString(eDataType, initialValue);
			case DrawingPackage.TEXT_PATH_MODE_TYPE:
				return createTextPathModeTypeFromString(eDataType, initialValue);
			case DrawingPackage.TEXT_PATH_SCALE_TYPE:
				return createTextPathScaleTypeFromString(eDataType, initialValue);
			case DrawingPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case DrawingPackage.UNIT_TYPE:
				return createUnitTypeFromString(eDataType, initialValue);
			case DrawingPackage.WRAP_INFLUENCE_ON_POSITION_TYPE:
				return createWrapInfluenceOnPositionTypeFromString(eDataType, initialValue);
			case DrawingPackage.ALIGN_TYPE_OBJECT:
				return createAlignTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.BACKGROUND_SIZE_TYPE_OBJECT:
				return createBackgroundSizeTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.CAPTION_ANGLE_TYPE_TYPE_OBJECT:
				return createCaptionAngleTypeTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.CAPTION_ESCAPE_DIRECTION_TYPE_OBJECT:
				return createCaptionEscapeDirectionTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.CAPTION_ESCAPE_TYPE:
				return createCaptionEscapeTypeFromString(eDataType, initialValue);
			case DrawingPackage.CAPTION_TYPE_TYPE_OBJECT:
				return createCaptionTypeTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.COLOR_MODE_TYPE_OBJECT:
				return createColorModeTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.CONCAVE_TYPE_OBJECT:
				return createConcaveTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.DISPLAY_TYPE_OBJECT:
				return createDisplayTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.ESCAPE_DIRECTION_TYPE_OBJECT:
				return createEscapeDirectionTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_DEPTH_TYPE:
				return createExtrusionDepthTypeFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_DEPTH_TYPE_BASE:
				return createExtrusionDepthTypeBaseFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_DEPTH_TYPE_BASE_ITEM:
				return createExtrusionDepthTypeBaseItemFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_ORIGIN_TYPE:
				return createExtrusionOriginTypeFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_ORIGIN_TYPE_BASE:
				return createExtrusionOriginTypeBaseFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_ORIGIN_TYPE_BASE_ITEM:
				return createExtrusionOriginTypeBaseItemFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_ORIGIN_TYPE_BASE_ITEM_OBJECT:
				return createExtrusionOriginTypeBaseItemObjectFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_ROTATION_ANGLE_TYPE:
				return createExtrusionRotationAngleTypeFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_ROTATION_ANGLE_TYPE_BASE:
				return createExtrusionRotationAngleTypeBaseFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_ROTATION_ANGLE_TYPE_BASE_ITEM:
				return createExtrusionRotationAngleTypeBaseItemFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_ROTATION_ANGLE_TYPE_BASE_ITEM_OBJECT:
				return createExtrusionRotationAngleTypeBaseItemObjectFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_SKEW_TYPE:
				return createExtrusionSkewTypeFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_SKEW_TYPE_BASE:
				return createExtrusionSkewTypeBaseFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_SKEW_TYPE_BASE_ITEM:
				return createExtrusionSkewTypeBaseItemFromString(eDataType, initialValue);
			case DrawingPackage.EXTRUSION_SKEW_TYPE_BASE_ITEM_OBJECT:
				return createExtrusionSkewTypeBaseItemObjectFromString(eDataType, initialValue);
			case DrawingPackage.FILL_GRADIENT_NAME_TYPE:
				return createFillGradientNameTypeFromString(eDataType, initialValue);
			case DrawingPackage.FILL_GRADIENT_NAME_TYPE_MEMBER1:
				return createFillGradientNameTypeMember1FromString(eDataType, initialValue);
			case DrawingPackage.FILL_HATCH_NAME_TYPE:
				return createFillHatchNameTypeFromString(eDataType, initialValue);
			case DrawingPackage.FILL_HATCH_NAME_TYPE_MEMBER1:
				return createFillHatchNameTypeMember1FromString(eDataType, initialValue);
			case DrawingPackage.FILL_IMAGE_HEIGHT_TYPE:
				return createFillImageHeightTypeFromString(eDataType, initialValue);
			case DrawingPackage.FILL_IMAGE_NAME_TYPE:
				return createFillImageNameTypeFromString(eDataType, initialValue);
			case DrawingPackage.FILL_IMAGE_NAME_TYPE_MEMBER1:
				return createFillImageNameTypeMember1FromString(eDataType, initialValue);
			case DrawingPackage.FILL_IMAGE_REF_POINT_TYPE_OBJECT:
				return createFillImageRefPointTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.FILL_IMAGE_WIDTH_TYPE:
				return createFillImageWidthTypeFromString(eDataType, initialValue);
			case DrawingPackage.FILL_TYPE_OBJECT:
				return createFillTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.GLUE_POINT_TYPE_TYPE_OBJECT:
				return createGluePointTypeTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.KIND_TYPE_OBJECT:
				return createKindTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.LINE_SKEW_TYPE:
				return createLineSkewTypeFromString(eDataType, initialValue);
			case DrawingPackage.LINE_SKEW_TYPE_BASE:
				return createLineSkewTypeBaseFromString(eDataType, initialValue);
			case DrawingPackage.LINE_SKEW_TYPE_BASE_ITEM:
				return createLineSkewTypeBaseItemFromString(eDataType, initialValue);
			case DrawingPackage.LINE_SKEW_TYPE_BASE_ITEM_MEMBER1:
				return createLineSkewTypeBaseItemMember1FromString(eDataType, initialValue);
			case DrawingPackage.MARKER_END_TYPE:
				return createMarkerEndTypeFromString(eDataType, initialValue);
			case DrawingPackage.MARKER_END_TYPE_MEMBER1:
				return createMarkerEndTypeMember1FromString(eDataType, initialValue);
			case DrawingPackage.MARKER_START_TYPE:
				return createMarkerStartTypeFromString(eDataType, initialValue);
			case DrawingPackage.MARKER_START_TYPE_MEMBER1:
				return createMarkerStartTypeMember1FromString(eDataType, initialValue);
			case DrawingPackage.MASTER_PAGE_NAME_TYPE:
				return createMasterPageNameTypeFromString(eDataType, initialValue);
			case DrawingPackage.MASTER_PAGE_NAME_TYPE_MEMBER1:
				return createMasterPageNameTypeMember1FromString(eDataType, initialValue);
			case DrawingPackage.MEASURE_ALIGN_TYPE_OBJECT:
				return createMeasureAlignTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.MEASURE_VERTICAL_ALIGN_TYPE_OBJECT:
				return createMeasureVerticalAlignTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.NOHREF_TYPE_OBJECT:
				return createNohrefTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.OPACITY_NAME_TYPE:
				return createOpacityNameTypeFromString(eDataType, initialValue);
			case DrawingPackage.OPACITY_NAME_TYPE_MEMBER1:
				return createOpacityNameTypeMember1FromString(eDataType, initialValue);
			case DrawingPackage.PLACING_TYPE_OBJECT:
				return createPlacingTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.SHADOW_TYPE_OBJECT:
				return createShadowTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.STROKE_DASH_TYPE:
				return createStrokeDashTypeFromString(eDataType, initialValue);
			case DrawingPackage.STROKE_DASH_TYPE_MEMBER1:
				return createStrokeDashTypeMember1FromString(eDataType, initialValue);
			case DrawingPackage.STROKE_LINEJOIN_TYPE_OBJECT:
				return createStrokeLinejoinTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.STROKE_TYPE_OBJECT:
				return createStrokeTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.STYLE_NAME_TYPE:
				return createStyleNameTypeFromString(eDataType, initialValue);
			case DrawingPackage.STYLE_NAME_TYPE_MEMBER1:
				return createStyleNameTypeMember1FromString(eDataType, initialValue);
			case DrawingPackage.STYLE_TYPE_OBJECT:
				return createStyleTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.STYLE_TYPE_OBJECT1:
				return createStyleTypeObject1FromString(eDataType, initialValue);
			case DrawingPackage.TEXTAREA_HORIZONTAL_ALIGN_TYPE_OBJECT:
				return createTextareaHorizontalAlignTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.TEXTAREA_VERTICAL_ALIGN_TYPE_OBJECT:
				return createTextareaVerticalAlignTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.TEXT_PATH_MODE_TYPE_OBJECT:
				return createTextPathModeTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.TEXT_PATH_SCALE_TYPE_OBJECT:
				return createTextPathScaleTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.TEXT_STYLE_NAME_TYPE:
				return createTextStyleNameTypeFromString(eDataType, initialValue);
			case DrawingPackage.TEXT_STYLE_NAME_TYPE_MEMBER1:
				return createTextStyleNameTypeMember1FromString(eDataType, initialValue);
			case DrawingPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.UNIT_TYPE_OBJECT:
				return createUnitTypeObjectFromString(eDataType, initialValue);
			case DrawingPackage.WRAP_INFLUENCE_ON_POSITION_TYPE_OBJECT:
				return createWrapInfluenceOnPositionTypeObjectFromString(eDataType, initialValue);
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
			case DrawingPackage.ALIGN_TYPE:
				return convertAlignTypeToString(eDataType, instanceValue);
			case DrawingPackage.BACKGROUND_SIZE_TYPE:
				return convertBackgroundSizeTypeToString(eDataType, instanceValue);
			case DrawingPackage.CAPTION_ANGLE_TYPE_TYPE:
				return convertCaptionAngleTypeTypeToString(eDataType, instanceValue);
			case DrawingPackage.CAPTION_ESCAPE_DIRECTION_TYPE:
				return convertCaptionEscapeDirectionTypeToString(eDataType, instanceValue);
			case DrawingPackage.CAPTION_TYPE_TYPE:
				return convertCaptionTypeTypeToString(eDataType, instanceValue);
			case DrawingPackage.COLOR_MODE_TYPE:
				return convertColorModeTypeToString(eDataType, instanceValue);
			case DrawingPackage.CONCAVE_TYPE:
				return convertConcaveTypeToString(eDataType, instanceValue);
			case DrawingPackage.DISPLAY_TYPE:
				return convertDisplayTypeToString(eDataType, instanceValue);
			case DrawingPackage.ESCAPE_DIRECTION_TYPE:
				return convertEscapeDirectionTypeToString(eDataType, instanceValue);
			case DrawingPackage.FILL_IMAGE_REF_POINT_TYPE:
				return convertFillImageRefPointTypeToString(eDataType, instanceValue);
			case DrawingPackage.FILL_TYPE:
				return convertFillTypeToString(eDataType, instanceValue);
			case DrawingPackage.GLUE_POINT_TYPE_TYPE:
				return convertGluePointTypeTypeToString(eDataType, instanceValue);
			case DrawingPackage.KIND_TYPE:
				return convertKindTypeToString(eDataType, instanceValue);
			case DrawingPackage.MEASURE_ALIGN_TYPE:
				return convertMeasureAlignTypeToString(eDataType, instanceValue);
			case DrawingPackage.MEASURE_VERTICAL_ALIGN_TYPE:
				return convertMeasureVerticalAlignTypeToString(eDataType, instanceValue);
			case DrawingPackage.NOHREF_TYPE:
				return convertNohrefTypeToString(eDataType, instanceValue);
			case DrawingPackage.PLACING_TYPE:
				return convertPlacingTypeToString(eDataType, instanceValue);
			case DrawingPackage.SHADOW_TYPE:
				return convertShadowTypeToString(eDataType, instanceValue);
			case DrawingPackage.STROKE_LINEJOIN_TYPE:
				return convertStrokeLinejoinTypeToString(eDataType, instanceValue);
			case DrawingPackage.STROKE_TYPE:
				return convertStrokeTypeToString(eDataType, instanceValue);
			case DrawingPackage.STYLE_TYPE:
				return convertStyleTypeToString(eDataType, instanceValue);
			case DrawingPackage.STYLE_TYPE1:
				return convertStyleType1ToString(eDataType, instanceValue);
			case DrawingPackage.TEXTAREA_HORIZONTAL_ALIGN_TYPE:
				return convertTextareaHorizontalAlignTypeToString(eDataType, instanceValue);
			case DrawingPackage.TEXTAREA_VERTICAL_ALIGN_TYPE:
				return convertTextareaVerticalAlignTypeToString(eDataType, instanceValue);
			case DrawingPackage.TEXT_PATH_MODE_TYPE:
				return convertTextPathModeTypeToString(eDataType, instanceValue);
			case DrawingPackage.TEXT_PATH_SCALE_TYPE:
				return convertTextPathScaleTypeToString(eDataType, instanceValue);
			case DrawingPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case DrawingPackage.UNIT_TYPE:
				return convertUnitTypeToString(eDataType, instanceValue);
			case DrawingPackage.WRAP_INFLUENCE_ON_POSITION_TYPE:
				return convertWrapInfluenceOnPositionTypeToString(eDataType, instanceValue);
			case DrawingPackage.ALIGN_TYPE_OBJECT:
				return convertAlignTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.BACKGROUND_SIZE_TYPE_OBJECT:
				return convertBackgroundSizeTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.CAPTION_ANGLE_TYPE_TYPE_OBJECT:
				return convertCaptionAngleTypeTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.CAPTION_ESCAPE_DIRECTION_TYPE_OBJECT:
				return convertCaptionEscapeDirectionTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.CAPTION_ESCAPE_TYPE:
				return convertCaptionEscapeTypeToString(eDataType, instanceValue);
			case DrawingPackage.CAPTION_TYPE_TYPE_OBJECT:
				return convertCaptionTypeTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.COLOR_MODE_TYPE_OBJECT:
				return convertColorModeTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.CONCAVE_TYPE_OBJECT:
				return convertConcaveTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.DISPLAY_TYPE_OBJECT:
				return convertDisplayTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.ESCAPE_DIRECTION_TYPE_OBJECT:
				return convertEscapeDirectionTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_DEPTH_TYPE:
				return convertExtrusionDepthTypeToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_DEPTH_TYPE_BASE:
				return convertExtrusionDepthTypeBaseToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_DEPTH_TYPE_BASE_ITEM:
				return convertExtrusionDepthTypeBaseItemToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_ORIGIN_TYPE:
				return convertExtrusionOriginTypeToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_ORIGIN_TYPE_BASE:
				return convertExtrusionOriginTypeBaseToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_ORIGIN_TYPE_BASE_ITEM:
				return convertExtrusionOriginTypeBaseItemToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_ORIGIN_TYPE_BASE_ITEM_OBJECT:
				return convertExtrusionOriginTypeBaseItemObjectToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_ROTATION_ANGLE_TYPE:
				return convertExtrusionRotationAngleTypeToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_ROTATION_ANGLE_TYPE_BASE:
				return convertExtrusionRotationAngleTypeBaseToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_ROTATION_ANGLE_TYPE_BASE_ITEM:
				return convertExtrusionRotationAngleTypeBaseItemToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_ROTATION_ANGLE_TYPE_BASE_ITEM_OBJECT:
				return convertExtrusionRotationAngleTypeBaseItemObjectToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_SKEW_TYPE:
				return convertExtrusionSkewTypeToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_SKEW_TYPE_BASE:
				return convertExtrusionSkewTypeBaseToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_SKEW_TYPE_BASE_ITEM:
				return convertExtrusionSkewTypeBaseItemToString(eDataType, instanceValue);
			case DrawingPackage.EXTRUSION_SKEW_TYPE_BASE_ITEM_OBJECT:
				return convertExtrusionSkewTypeBaseItemObjectToString(eDataType, instanceValue);
			case DrawingPackage.FILL_GRADIENT_NAME_TYPE:
				return convertFillGradientNameTypeToString(eDataType, instanceValue);
			case DrawingPackage.FILL_GRADIENT_NAME_TYPE_MEMBER1:
				return convertFillGradientNameTypeMember1ToString(eDataType, instanceValue);
			case DrawingPackage.FILL_HATCH_NAME_TYPE:
				return convertFillHatchNameTypeToString(eDataType, instanceValue);
			case DrawingPackage.FILL_HATCH_NAME_TYPE_MEMBER1:
				return convertFillHatchNameTypeMember1ToString(eDataType, instanceValue);
			case DrawingPackage.FILL_IMAGE_HEIGHT_TYPE:
				return convertFillImageHeightTypeToString(eDataType, instanceValue);
			case DrawingPackage.FILL_IMAGE_NAME_TYPE:
				return convertFillImageNameTypeToString(eDataType, instanceValue);
			case DrawingPackage.FILL_IMAGE_NAME_TYPE_MEMBER1:
				return convertFillImageNameTypeMember1ToString(eDataType, instanceValue);
			case DrawingPackage.FILL_IMAGE_REF_POINT_TYPE_OBJECT:
				return convertFillImageRefPointTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.FILL_IMAGE_WIDTH_TYPE:
				return convertFillImageWidthTypeToString(eDataType, instanceValue);
			case DrawingPackage.FILL_TYPE_OBJECT:
				return convertFillTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.GLUE_POINT_TYPE_TYPE_OBJECT:
				return convertGluePointTypeTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.KIND_TYPE_OBJECT:
				return convertKindTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.LINE_SKEW_TYPE:
				return convertLineSkewTypeToString(eDataType, instanceValue);
			case DrawingPackage.LINE_SKEW_TYPE_BASE:
				return convertLineSkewTypeBaseToString(eDataType, instanceValue);
			case DrawingPackage.LINE_SKEW_TYPE_BASE_ITEM:
				return convertLineSkewTypeBaseItemToString(eDataType, instanceValue);
			case DrawingPackage.LINE_SKEW_TYPE_BASE_ITEM_MEMBER1:
				return convertLineSkewTypeBaseItemMember1ToString(eDataType, instanceValue);
			case DrawingPackage.MARKER_END_TYPE:
				return convertMarkerEndTypeToString(eDataType, instanceValue);
			case DrawingPackage.MARKER_END_TYPE_MEMBER1:
				return convertMarkerEndTypeMember1ToString(eDataType, instanceValue);
			case DrawingPackage.MARKER_START_TYPE:
				return convertMarkerStartTypeToString(eDataType, instanceValue);
			case DrawingPackage.MARKER_START_TYPE_MEMBER1:
				return convertMarkerStartTypeMember1ToString(eDataType, instanceValue);
			case DrawingPackage.MASTER_PAGE_NAME_TYPE:
				return convertMasterPageNameTypeToString(eDataType, instanceValue);
			case DrawingPackage.MASTER_PAGE_NAME_TYPE_MEMBER1:
				return convertMasterPageNameTypeMember1ToString(eDataType, instanceValue);
			case DrawingPackage.MEASURE_ALIGN_TYPE_OBJECT:
				return convertMeasureAlignTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.MEASURE_VERTICAL_ALIGN_TYPE_OBJECT:
				return convertMeasureVerticalAlignTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.NOHREF_TYPE_OBJECT:
				return convertNohrefTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.OPACITY_NAME_TYPE:
				return convertOpacityNameTypeToString(eDataType, instanceValue);
			case DrawingPackage.OPACITY_NAME_TYPE_MEMBER1:
				return convertOpacityNameTypeMember1ToString(eDataType, instanceValue);
			case DrawingPackage.PLACING_TYPE_OBJECT:
				return convertPlacingTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.SHADOW_TYPE_OBJECT:
				return convertShadowTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.STROKE_DASH_TYPE:
				return convertStrokeDashTypeToString(eDataType, instanceValue);
			case DrawingPackage.STROKE_DASH_TYPE_MEMBER1:
				return convertStrokeDashTypeMember1ToString(eDataType, instanceValue);
			case DrawingPackage.STROKE_LINEJOIN_TYPE_OBJECT:
				return convertStrokeLinejoinTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.STROKE_TYPE_OBJECT:
				return convertStrokeTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.STYLE_NAME_TYPE:
				return convertStyleNameTypeToString(eDataType, instanceValue);
			case DrawingPackage.STYLE_NAME_TYPE_MEMBER1:
				return convertStyleNameTypeMember1ToString(eDataType, instanceValue);
			case DrawingPackage.STYLE_TYPE_OBJECT:
				return convertStyleTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.STYLE_TYPE_OBJECT1:
				return convertStyleTypeObject1ToString(eDataType, instanceValue);
			case DrawingPackage.TEXTAREA_HORIZONTAL_ALIGN_TYPE_OBJECT:
				return convertTextareaHorizontalAlignTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.TEXTAREA_VERTICAL_ALIGN_TYPE_OBJECT:
				return convertTextareaVerticalAlignTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.TEXT_PATH_MODE_TYPE_OBJECT:
				return convertTextPathModeTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.TEXT_PATH_SCALE_TYPE_OBJECT:
				return convertTextPathScaleTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.TEXT_STYLE_NAME_TYPE:
				return convertTextStyleNameTypeToString(eDataType, instanceValue);
			case DrawingPackage.TEXT_STYLE_NAME_TYPE_MEMBER1:
				return convertTextStyleNameTypeMember1ToString(eDataType, instanceValue);
			case DrawingPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.UNIT_TYPE_OBJECT:
				return convertUnitTypeObjectToString(eDataType, instanceValue);
			case DrawingPackage.WRAP_INFLUENCE_ON_POSITION_TYPE_OBJECT:
				return convertWrapInfluenceOnPositionTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppletType createAppletType() {
		AppletTypeImpl appletType = new AppletTypeImpl();
		return appletType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaCircleType createAreaCircleType() {
		AreaCircleTypeImpl areaCircleType = new AreaCircleTypeImpl();
		return areaCircleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaPolygonType createAreaPolygonType() {
		AreaPolygonTypeImpl areaPolygonType = new AreaPolygonTypeImpl();
		return areaPolygonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaRectangleType createAreaRectangleType() {
		AreaRectangleTypeImpl areaRectangleType = new AreaRectangleTypeImpl();
		return areaRectangleType;
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
	public CaptionType createCaptionType() {
		CaptionTypeImpl captionType = new CaptionTypeImpl();
		return captionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircleType createCircleType() {
		CircleTypeImpl circleType = new CircleTypeImpl();
		return circleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType createConnectorType() {
		ConnectorTypeImpl connectorType = new ConnectorTypeImpl();
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContourPathType createContourPathType() {
		ContourPathTypeImpl contourPathType = new ContourPathTypeImpl();
		return contourPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContourPolygonType createContourPolygonType() {
		ContourPolygonTypeImpl contourPolygonType = new ContourPolygonTypeImpl();
		return contourPolygonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType createControlType() {
		ControlTypeImpl controlType = new ControlTypeImpl();
		return controlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomShapeType createCustomShapeType() {
		CustomShapeTypeImpl customShapeType = new CustomShapeTypeImpl();
		return customShapeType;
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
	public EllipseType createEllipseType() {
		EllipseTypeImpl ellipseType = new EllipseTypeImpl();
		return ellipseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnhancedGeometryType createEnhancedGeometryType() {
		EnhancedGeometryTypeImpl enhancedGeometryType = new EnhancedGeometryTypeImpl();
		return enhancedGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquationType createEquationType() {
		EquationTypeImpl equationType = new EquationTypeImpl();
		return equationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillImageType createFillImageType() {
		FillImageTypeImpl fillImageType = new FillImageTypeImpl();
		return fillImageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingFrameType createFloatingFrameType() {
		FloatingFrameTypeImpl floatingFrameType = new FloatingFrameTypeImpl();
		return floatingFrameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType createFrameType() {
		FrameTypeImpl frameType = new FrameTypeImpl();
		return frameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GluePointType createGluePointType() {
		GluePointTypeImpl gluePointType = new GluePointTypeImpl();
		return gluePointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientType createGradientType() {
		GradientTypeImpl gradientType = new GradientTypeImpl();
		return gradientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GType createGType() {
		GTypeImpl gType = new GTypeImpl();
		return gType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandleType createHandleType() {
		HandleTypeImpl handleType = new HandleTypeImpl();
		return handleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HatchType createHatchType() {
		HatchTypeImpl hatchType = new HatchTypeImpl();
		return hatchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageMapType createImageMapType() {
		ImageMapTypeImpl imageMapType = new ImageMapTypeImpl();
		return imageMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageType createImageType() {
		ImageTypeImpl imageType = new ImageTypeImpl();
		return imageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerSetType createLayerSetType() {
		LayerSetTypeImpl layerSetType = new LayerSetTypeImpl();
		return layerSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerType createLayerType() {
		LayerTypeImpl layerType = new LayerTypeImpl();
		return layerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType createLineType() {
		LineTypeImpl lineType = new LineTypeImpl();
		return lineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkerType createMarkerType() {
		MarkerTypeImpl markerType = new MarkerTypeImpl();
		return markerType;
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
	public ObjectOleType createObjectOleType() {
		ObjectOleTypeImpl objectOleType = new ObjectOleTypeImpl();
		return objectOleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType createObjectType() {
		ObjectTypeImpl objectType = new ObjectTypeImpl();
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpacityType createOpacityType() {
		OpacityTypeImpl opacityType = new OpacityTypeImpl();
		return opacityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageThumbnailType createPageThumbnailType() {
		PageThumbnailTypeImpl pageThumbnailType = new PageThumbnailTypeImpl();
		return pageThumbnailType;
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
	public ParamType createParamType() {
		ParamTypeImpl paramType = new ParamTypeImpl();
		return paramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathType createPathType() {
		PathTypeImpl pathType = new PathTypeImpl();
		return pathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginType createPluginType() {
		PluginTypeImpl pluginType = new PluginTypeImpl();
		return pluginType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonType createPolygonType() {
		PolygonTypeImpl polygonType = new PolygonTypeImpl();
		return polygonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolylineType createPolylineType() {
		PolylineTypeImpl polylineType = new PolylineTypeImpl();
		return polylineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectType createRectType() {
		RectTypeImpl rectType = new RectTypeImpl();
		return rectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularPolygonType createRegularPolygonType() {
		RegularPolygonTypeImpl regularPolygonType = new RegularPolygonTypeImpl();
		return regularPolygonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeDashType1 createStrokeDashType1() {
		StrokeDashType1Impl strokeDashType1 = new StrokeDashType1Impl();
		return strokeDashType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBoxType createTextBoxType() {
		TextBoxTypeImpl textBoxType = new TextBoxTypeImpl();
		return textBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeFromString(EDataType eDataType, String initialValue) {
		AlignType result = AlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundSizeType createBackgroundSizeTypeFromString(EDataType eDataType, String initialValue) {
		BackgroundSizeType result = BackgroundSizeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackgroundSizeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionAngleTypeType createCaptionAngleTypeTypeFromString(EDataType eDataType, String initialValue) {
		CaptionAngleTypeType result = CaptionAngleTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCaptionAngleTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionEscapeDirectionType createCaptionEscapeDirectionTypeFromString(EDataType eDataType, String initialValue) {
		CaptionEscapeDirectionType result = CaptionEscapeDirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCaptionEscapeDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionTypeType createCaptionTypeTypeFromString(EDataType eDataType, String initialValue) {
		CaptionTypeType result = CaptionTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCaptionTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorModeType createColorModeTypeFromString(EDataType eDataType, String initialValue) {
		ColorModeType result = ColorModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcaveType createConcaveTypeFromString(EDataType eDataType, String initialValue) {
		ConcaveType result = ConcaveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConcaveTypeToString(EDataType eDataType, Object instanceValue) {
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
	public EscapeDirectionType createEscapeDirectionTypeFromString(EDataType eDataType, String initialValue) {
		EscapeDirectionType result = EscapeDirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEscapeDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillImageRefPointType createFillImageRefPointTypeFromString(EDataType eDataType, String initialValue) {
		FillImageRefPointType result = FillImageRefPointType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillImageRefPointTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillType createFillTypeFromString(EDataType eDataType, String initialValue) {
		FillType result = FillType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GluePointTypeType createGluePointTypeTypeFromString(EDataType eDataType, String initialValue) {
		GluePointTypeType result = GluePointTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGluePointTypeTypeToString(EDataType eDataType, Object instanceValue) {
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
	public MeasureAlignType createMeasureAlignTypeFromString(EDataType eDataType, String initialValue) {
		MeasureAlignType result = MeasureAlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureVerticalAlignType createMeasureVerticalAlignTypeFromString(EDataType eDataType, String initialValue) {
		MeasureVerticalAlignType result = MeasureVerticalAlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureVerticalAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NohrefType createNohrefTypeFromString(EDataType eDataType, String initialValue) {
		NohrefType result = NohrefType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNohrefTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacingType createPlacingTypeFromString(EDataType eDataType, String initialValue) {
		PlacingType result = PlacingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlacingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadowType createShadowTypeFromString(EDataType eDataType, String initialValue) {
		ShadowType result = ShadowType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShadowTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeLinejoinType createStrokeLinejoinTypeFromString(EDataType eDataType, String initialValue) {
		StrokeLinejoinType result = StrokeLinejoinType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrokeLinejoinTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeType createStrokeTypeFromString(EDataType eDataType, String initialValue) {
		StrokeType result = StrokeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrokeTypeToString(EDataType eDataType, Object instanceValue) {
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
	public StyleType1 createStyleType1FromString(EDataType eDataType, String initialValue) {
		StyleType1 result = StyleType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextareaHorizontalAlignType createTextareaHorizontalAlignTypeFromString(EDataType eDataType, String initialValue) {
		TextareaHorizontalAlignType result = TextareaHorizontalAlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextareaHorizontalAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextareaVerticalAlignType createTextareaVerticalAlignTypeFromString(EDataType eDataType, String initialValue) {
		TextareaVerticalAlignType result = TextareaVerticalAlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextareaVerticalAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPathModeType createTextPathModeTypeFromString(EDataType eDataType, String initialValue) {
		TextPathModeType result = TextPathModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextPathModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPathScaleType createTextPathScaleTypeFromString(EDataType eDataType, String initialValue) {
		TextPathScaleType result = TextPathScaleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextPathScaleTypeToString(EDataType eDataType, Object instanceValue) {
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
	public UnitType createUnitTypeFromString(EDataType eDataType, String initialValue) {
		UnitType result = UnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapInfluenceOnPositionType createWrapInfluenceOnPositionTypeFromString(EDataType eDataType, String initialValue) {
		WrapInfluenceOnPositionType result = WrapInfluenceOnPositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWrapInfluenceOnPositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignTypeFromString(DrawingPackage.eINSTANCE.getAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignTypeToString(DrawingPackage.eINSTANCE.getAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundSizeType createBackgroundSizeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBackgroundSizeTypeFromString(DrawingPackage.eINSTANCE.getBackgroundSizeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBackgroundSizeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBackgroundSizeTypeToString(DrawingPackage.eINSTANCE.getBackgroundSizeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionAngleTypeType createCaptionAngleTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCaptionAngleTypeTypeFromString(DrawingPackage.eINSTANCE.getCaptionAngleTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCaptionAngleTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCaptionAngleTypeTypeToString(DrawingPackage.eINSTANCE.getCaptionAngleTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionEscapeDirectionType createCaptionEscapeDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCaptionEscapeDirectionTypeFromString(DrawingPackage.eINSTANCE.getCaptionEscapeDirectionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCaptionEscapeDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCaptionEscapeDirectionTypeToString(DrawingPackage.eINSTANCE.getCaptionEscapeDirectionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCaptionEscapeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
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
	public String convertCaptionEscapeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
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
	public CaptionTypeType createCaptionTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCaptionTypeTypeFromString(DrawingPackage.eINSTANCE.getCaptionTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCaptionTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCaptionTypeTypeToString(DrawingPackage.eINSTANCE.getCaptionTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorModeType createColorModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createColorModeTypeFromString(DrawingPackage.eINSTANCE.getColorModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColorModeTypeToString(DrawingPackage.eINSTANCE.getColorModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcaveType createConcaveTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConcaveTypeFromString(DrawingPackage.eINSTANCE.getConcaveType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConcaveTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConcaveTypeToString(DrawingPackage.eINSTANCE.getConcaveType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType createDisplayTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDisplayTypeFromString(DrawingPackage.eINSTANCE.getDisplayType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayTypeToString(DrawingPackage.eINSTANCE.getDisplayType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscapeDirectionType createEscapeDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEscapeDirectionTypeFromString(DrawingPackage.eINSTANCE.getEscapeDirectionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEscapeDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEscapeDirectionTypeToString(DrawingPackage.eINSTANCE.getEscapeDirectionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createExtrusionDepthTypeFromString(EDataType eDataType, String initialValue) {
		return new ArrayList(); // (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtrusionDepthTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createExtrusionDepthTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createExtrusionDepthTypeBaseItemFromString(DrawingPackage.eINSTANCE.getExtrusionDepthTypeBaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtrusionDepthTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertExtrusionDepthTypeBaseItemToString(DrawingPackage.eINSTANCE.getExtrusionDepthTypeBaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createExtrusionDepthTypeBaseItemFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getDouble(), initialValue);
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
	public String convertExtrusionDepthTypeBaseItemToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getDouble().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getDouble(), instanceValue);
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
	public List createExtrusionOriginTypeFromString(EDataType eDataType, String initialValue) {
		return new ArrayList(); // (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtrusionOriginTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createExtrusionOriginTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createExtrusionOriginTypeBaseItemFromString(DrawingPackage.eINSTANCE.getExtrusionOriginTypeBaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtrusionOriginTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertExtrusionOriginTypeBaseItemToString(DrawingPackage.eINSTANCE.getExtrusionOriginTypeBaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createExtrusionOriginTypeBaseItemFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Double result = null;
		RuntimeException exception = null;
		try {
			result = (Double)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getDouble(), initialValue);
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
	public String convertExtrusionOriginTypeBaseItemToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getDouble().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getDouble(), instanceValue);
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
	public Double createExtrusionOriginTypeBaseItemObjectFromString(EDataType eDataType, String initialValue) {
		return createExtrusionOriginTypeBaseItemFromString(DrawingPackage.eINSTANCE.getExtrusionOriginTypeBaseItem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtrusionOriginTypeBaseItemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExtrusionOriginTypeBaseItemToString(DrawingPackage.eINSTANCE.getExtrusionOriginTypeBaseItem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createExtrusionRotationAngleTypeFromString(EDataType eDataType, String initialValue) {
		return new ArrayList(); // (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtrusionRotationAngleTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createExtrusionRotationAngleTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createExtrusionRotationAngleTypeBaseItemFromString(DrawingPackage.eINSTANCE.getExtrusionRotationAngleTypeBaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtrusionRotationAngleTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertExtrusionRotationAngleTypeBaseItemToString(DrawingPackage.eINSTANCE.getExtrusionRotationAngleTypeBaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createExtrusionRotationAngleTypeBaseItemFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Double result = null;
		RuntimeException exception = null;
		try {
			result = (Double)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getDouble(), initialValue);
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
	public String convertExtrusionRotationAngleTypeBaseItemToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getDouble().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getDouble(), instanceValue);
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
	public Double createExtrusionRotationAngleTypeBaseItemObjectFromString(EDataType eDataType, String initialValue) {
		return createExtrusionRotationAngleTypeBaseItemFromString(DrawingPackage.eINSTANCE.getExtrusionRotationAngleTypeBaseItem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtrusionRotationAngleTypeBaseItemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExtrusionRotationAngleTypeBaseItemToString(DrawingPackage.eINSTANCE.getExtrusionRotationAngleTypeBaseItem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createExtrusionSkewTypeFromString(EDataType eDataType, String initialValue) {
		return new ArrayList(); // (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtrusionSkewTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createExtrusionSkewTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createExtrusionSkewTypeBaseItemFromString(DrawingPackage.eINSTANCE.getExtrusionSkewTypeBaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtrusionSkewTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertExtrusionSkewTypeBaseItemToString(DrawingPackage.eINSTANCE.getExtrusionSkewTypeBaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createExtrusionSkewTypeBaseItemFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Double result = null;
		RuntimeException exception = null;
		try {
			result = (Double)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getDouble(), initialValue);
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
	public String convertExtrusionSkewTypeBaseItemToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getDouble().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getDouble(), instanceValue);
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
	public Double createExtrusionSkewTypeBaseItemObjectFromString(EDataType eDataType, String initialValue) {
		return createExtrusionSkewTypeBaseItemFromString(DrawingPackage.eINSTANCE.getExtrusionSkewTypeBaseItem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtrusionSkewTypeBaseItemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExtrusionSkewTypeBaseItemToString(DrawingPackage.eINSTANCE.getExtrusionSkewTypeBaseItem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFillGradientNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFillGradientNameTypeMember1FromString(DrawingPackage.eINSTANCE.getFillGradientNameTypeMember1(), initialValue);
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
	public String convertFillGradientNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DrawingPackage.eINSTANCE.getFillGradientNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertFillGradientNameTypeMember1ToString(DrawingPackage.eINSTANCE.getFillGradientNameTypeMember1(), instanceValue);
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
	public String createFillGradientNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillGradientNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFillHatchNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFillHatchNameTypeMember1FromString(DrawingPackage.eINSTANCE.getFillHatchNameTypeMember1(), initialValue);
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
	public String convertFillHatchNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DrawingPackage.eINSTANCE.getFillHatchNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertFillHatchNameTypeMember1ToString(DrawingPackage.eINSTANCE.getFillHatchNameTypeMember1(), instanceValue);
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
	public String createFillHatchNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillHatchNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFillImageHeightTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
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
	public String convertFillImageHeightTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
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
	public String createFillImageNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createFillImageNameTypeMember1FromString(DrawingPackage.eINSTANCE.getFillImageNameTypeMember1(), initialValue);
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
	public String convertFillImageNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DrawingPackage.eINSTANCE.getFillImageNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertFillImageNameTypeMember1ToString(DrawingPackage.eINSTANCE.getFillImageNameTypeMember1(), instanceValue);
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
	public String createFillImageNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillImageNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillImageRefPointType createFillImageRefPointTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFillImageRefPointTypeFromString(DrawingPackage.eINSTANCE.getFillImageRefPointType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillImageRefPointTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFillImageRefPointTypeToString(DrawingPackage.eINSTANCE.getFillImageRefPointType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFillImageWidthTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
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
	public String convertFillImageWidthTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
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
	public FillType createFillTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFillTypeFromString(DrawingPackage.eINSTANCE.getFillType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFillTypeToString(DrawingPackage.eINSTANCE.getFillType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GluePointTypeType createGluePointTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGluePointTypeTypeFromString(DrawingPackage.eINSTANCE.getGluePointTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGluePointTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGluePointTypeTypeToString(DrawingPackage.eINSTANCE.getGluePointTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType createKindTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKindTypeFromString(DrawingPackage.eINSTANCE.getKindType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKindTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKindTypeToString(DrawingPackage.eINSTANCE.getKindType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createLineSkewTypeFromString(EDataType eDataType, String initialValue) {
		return new ArrayList(); // (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineSkewTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createLineSkewTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createLineSkewTypeBaseItemFromString(DrawingPackage.eINSTANCE.getLineSkewTypeBaseItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineSkewTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertLineSkewTypeBaseItemToString(DrawingPackage.eINSTANCE.getLineSkewTypeBaseItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLineSkewTypeBaseItemFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createLineSkewTypeBaseItemMember1FromString(DrawingPackage.eINSTANCE.getLineSkewTypeBaseItemMember1(), initialValue);
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
	public String convertLineSkewTypeBaseItemToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DrawingPackage.eINSTANCE.getLineSkewTypeBaseItemMember1().isInstance(instanceValue)) {
			try {
				String value = convertLineSkewTypeBaseItemMember1ToString(DrawingPackage.eINSTANCE.getLineSkewTypeBaseItemMember1(), instanceValue);
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
	public String createLineSkewTypeBaseItemMember1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
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
	public String convertLineSkewTypeBaseItemMember1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
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
	public String createMarkerEndTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMarkerEndTypeMember1FromString(DrawingPackage.eINSTANCE.getMarkerEndTypeMember1(), initialValue);
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
	public String convertMarkerEndTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DrawingPackage.eINSTANCE.getMarkerEndTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertMarkerEndTypeMember1ToString(DrawingPackage.eINSTANCE.getMarkerEndTypeMember1(), instanceValue);
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
	public String createMarkerEndTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkerEndTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMarkerStartTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMarkerStartTypeMember1FromString(DrawingPackage.eINSTANCE.getMarkerStartTypeMember1(), initialValue);
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
	public String convertMarkerStartTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DrawingPackage.eINSTANCE.getMarkerStartTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertMarkerStartTypeMember1ToString(DrawingPackage.eINSTANCE.getMarkerStartTypeMember1(), instanceValue);
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
	public String createMarkerStartTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkerStartTypeMember1ToString(EDataType eDataType, Object instanceValue) {
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
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMasterPageNameTypeMember1FromString(DrawingPackage.eINSTANCE.getMasterPageNameTypeMember1(), initialValue);
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
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DrawingPackage.eINSTANCE.getMasterPageNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertMasterPageNameTypeMember1ToString(DrawingPackage.eINSTANCE.getMasterPageNameTypeMember1(), instanceValue);
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
	public MeasureAlignType createMeasureAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureAlignTypeFromString(DrawingPackage.eINSTANCE.getMeasureAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureAlignTypeToString(DrawingPackage.eINSTANCE.getMeasureAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureVerticalAlignType createMeasureVerticalAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMeasureVerticalAlignTypeFromString(DrawingPackage.eINSTANCE.getMeasureVerticalAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasureVerticalAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeasureVerticalAlignTypeToString(DrawingPackage.eINSTANCE.getMeasureVerticalAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NohrefType createNohrefTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNohrefTypeFromString(DrawingPackage.eINSTANCE.getNohrefType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNohrefTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNohrefTypeToString(DrawingPackage.eINSTANCE.getNohrefType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOpacityNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createOpacityNameTypeMember1FromString(DrawingPackage.eINSTANCE.getOpacityNameTypeMember1(), initialValue);
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
	public String convertOpacityNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DrawingPackage.eINSTANCE.getOpacityNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertOpacityNameTypeMember1ToString(DrawingPackage.eINSTANCE.getOpacityNameTypeMember1(), instanceValue);
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
	public String createOpacityNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpacityNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacingType createPlacingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPlacingTypeFromString(DrawingPackage.eINSTANCE.getPlacingType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlacingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlacingTypeToString(DrawingPackage.eINSTANCE.getPlacingType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadowType createShadowTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createShadowTypeFromString(DrawingPackage.eINSTANCE.getShadowType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShadowTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShadowTypeToString(DrawingPackage.eINSTANCE.getShadowType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStrokeDashTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStrokeDashTypeMember1FromString(DrawingPackage.eINSTANCE.getStrokeDashTypeMember1(), initialValue);
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
	public String convertStrokeDashTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DrawingPackage.eINSTANCE.getStrokeDashTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertStrokeDashTypeMember1ToString(DrawingPackage.eINSTANCE.getStrokeDashTypeMember1(), instanceValue);
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
	public String createStrokeDashTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrokeDashTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeLinejoinType createStrokeLinejoinTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStrokeLinejoinTypeFromString(DrawingPackage.eINSTANCE.getStrokeLinejoinType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrokeLinejoinTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStrokeLinejoinTypeToString(DrawingPackage.eINSTANCE.getStrokeLinejoinType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeType createStrokeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStrokeTypeFromString(DrawingPackage.eINSTANCE.getStrokeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrokeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStrokeTypeToString(DrawingPackage.eINSTANCE.getStrokeType(), instanceValue);
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
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember1FromString(DrawingPackage.eINSTANCE.getStyleNameTypeMember1(), initialValue);
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
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DrawingPackage.eINSTANCE.getStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember1ToString(DrawingPackage.eINSTANCE.getStyleNameTypeMember1(), instanceValue);
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
		return createStyleTypeFromString(DrawingPackage.eINSTANCE.getStyleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStyleTypeToString(DrawingPackage.eINSTANCE.getStyleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType1 createStyleTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createStyleType1FromString(DrawingPackage.eINSTANCE.getStyleType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertStyleType1ToString(DrawingPackage.eINSTANCE.getStyleType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextareaHorizontalAlignType createTextareaHorizontalAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextareaHorizontalAlignTypeFromString(DrawingPackage.eINSTANCE.getTextareaHorizontalAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextareaHorizontalAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextareaHorizontalAlignTypeToString(DrawingPackage.eINSTANCE.getTextareaHorizontalAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextareaVerticalAlignType createTextareaVerticalAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextareaVerticalAlignTypeFromString(DrawingPackage.eINSTANCE.getTextareaVerticalAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextareaVerticalAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextareaVerticalAlignTypeToString(DrawingPackage.eINSTANCE.getTextareaVerticalAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPathModeType createTextPathModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextPathModeTypeFromString(DrawingPackage.eINSTANCE.getTextPathModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextPathModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextPathModeTypeToString(DrawingPackage.eINSTANCE.getTextPathModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPathScaleType createTextPathScaleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextPathScaleTypeFromString(DrawingPackage.eINSTANCE.getTextPathScaleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextPathScaleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextPathScaleTypeToString(DrawingPackage.eINSTANCE.getTextPathScaleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTextStyleNameTypeMember1FromString(DrawingPackage.eINSTANCE.getTextStyleNameTypeMember1(), initialValue);
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
	public String convertTextStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (DrawingPackage.eINSTANCE.getTextStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertTextStyleNameTypeMember1ToString(DrawingPackage.eINSTANCE.getTextStyleNameTypeMember1(), instanceValue);
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
	public String createTextStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(DrawingPackage.eINSTANCE.getTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(DrawingPackage.eINSTANCE.getTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitTypeFromString(DrawingPackage.eINSTANCE.getUnitType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitTypeToString(DrawingPackage.eINSTANCE.getUnitType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapInfluenceOnPositionType createWrapInfluenceOnPositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWrapInfluenceOnPositionTypeFromString(DrawingPackage.eINSTANCE.getWrapInfluenceOnPositionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWrapInfluenceOnPositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWrapInfluenceOnPositionTypeToString(DrawingPackage.eINSTANCE.getWrapInfluenceOnPositionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawingPackage getDrawingPackage() {
		return (DrawingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DrawingPackage getPackage() {
		return DrawingPackage.eINSTANCE;
	}

} //DrawingFactoryImpl
