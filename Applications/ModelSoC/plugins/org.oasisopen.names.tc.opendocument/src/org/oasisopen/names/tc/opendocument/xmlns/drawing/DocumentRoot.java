/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getApplet <em>Applet</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAreaCircle <em>Area Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAreaPolygon <em>Area Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAreaRectangle <em>Area Rectangle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getContourPath <em>Contour Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getContourPolygon <em>Contour Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEnhancedGeometry <em>Enhanced Geometry</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImage <em>Fill Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFloatingFrame <em>Floating Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePoint <em>Glue Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGradient <em>Gradient</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHatch <em>Hatch</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getImage <em>Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getImageMap <em>Image Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLayerSet <em>Layer Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarker <em>Marker</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getObject <em>Object</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getObjectOle <em>Object Ole</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPage <em>Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getParam <em>Param</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeDash <em>Stroke Dash</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextBox <em>Text Box</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAlign <em>Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getArchive <em>Archive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAutoGrowHeight <em>Auto Grow Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAutoGrowWidth <em>Auto Grow Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBackgroundSize <em>Background Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBlue <em>Blue</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBorder <em>Border</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionAngle <em>Caption Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionAngleType <em>Caption Angle Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionEscape <em>Caption Escape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionEscapeDirection <em>Caption Escape Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionFitLineLength <em>Caption Fit Line Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionGap <em>Caption Gap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionId <em>Caption Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionLineLength <em>Caption Line Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionPointX <em>Caption Point X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionPointY <em>Caption Point Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionType <em>Caption Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getChainNextName <em>Chain Next Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getClassId <em>Class Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColor <em>Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColorInversion <em>Color Inversion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConcave <em>Concave</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConcentricGradientFillAllowed <em>Concentric Gradient Fill Allowed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getContrast <em>Contrast</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getControl1 <em>Control1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCopyOf <em>Copy Of</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCornerRadius <em>Corner Radius</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCorners <em>Corners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCx <em>Cx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCy <em>Cy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getData <em>Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDecimalPlaces <em>Decimal Places</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots1 <em>Dots1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots1Length <em>Dots1 Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots2 <em>Dots2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots2Length <em>Dots2 Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndAngle <em>End Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndColor <em>End Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndGluePoint <em>End Glue Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndGuide <em>End Guide</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndIntensity <em>End Intensity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndLineSpacingHorizontal <em>End Line Spacing Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndLineSpacingVertical <em>End Line Spacing Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndShape <em>End Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEngine <em>Engine</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEnhancedPath <em>Enhanced Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEscapeDirection <em>Escape Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusion <em>Extrusion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionAllowed <em>Extrusion Allowed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionBrightness <em>Extrusion Brightness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionColor <em>Extrusion Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionDepth <em>Extrusion Depth</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionDiffusion <em>Extrusion Diffusion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightDirection <em>Extrusion First Light Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightHarsh <em>Extrusion First Light Harsh</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightLevel <em>Extrusion First Light Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionLightFace <em>Extrusion Light Face</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionMetal <em>Extrusion Metal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionNumberOfLineSegments <em>Extrusion Number Of Line Segments</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionOrigin <em>Extrusion Origin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionRotationAngle <em>Extrusion Rotation Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionRotationCenter <em>Extrusion Rotation Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightDirection <em>Extrusion Second Light Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightHarsh <em>Extrusion Second Light Harsh</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightLevel <em>Extrusion Second Light Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionShininess <em>Extrusion Shininess</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSkew <em>Extrusion Skew</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSpecularity <em>Extrusion Specularity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionViewpoint <em>Extrusion Viewpoint</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFill <em>Fill</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillGradientName <em>Fill Gradient Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillHatchName <em>Fill Hatch Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillHatchSolid <em>Fill Hatch Solid</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageHeight <em>Fill Image Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageName <em>Fill Image Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPoint <em>Fill Image Ref Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPointX <em>Fill Image Ref Point X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPointY <em>Fill Image Ref Point Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageWidth <em>Fill Image Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFitToContour <em>Fit To Contour</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFitToSize <em>Fit To Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameDisplayBorder <em>Frame Display Border</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameDisplayScrollbar <em>Frame Display Scrollbar</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameMarginHorizontal <em>Frame Margin Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameMarginVertical <em>Frame Margin Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameName <em>Frame Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGamma <em>Gamma</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePointLeavingDirections <em>Glue Point Leaving Directions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePoints <em>Glue Points</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePointType <em>Glue Point Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGradientStepCount <em>Gradient Step Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGreen <em>Green</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGuideDistance <em>Guide Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGuideOverhang <em>Guide Overhang</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleMirrorHorizontal <em>Handle Mirror Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleMirrorVertical <em>Handle Mirror Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandlePolar <em>Handle Polar</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandlePosition <em>Handle Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRadiusRangeMaximum <em>Handle Radius Range Maximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRadiusRangeMinimum <em>Handle Radius Range Minimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeXMaximum <em>Handle Range XMaximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeXMinimum <em>Handle Range XMinimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeYMaximum <em>Handle Range YMaximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeYMinimum <em>Handle Range YMinimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleSwitched <em>Handle Switched</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getImageOpacity <em>Image Opacity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getKind <em>Kind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLayer1 <em>Layer1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLineDistance <em>Line Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLineSkew <em>Line Skew</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLuminance <em>Luminance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEndCenter <em>Marker End Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEndWidth <em>Marker End Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStart <em>Marker Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStartCenter <em>Marker Start Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStartWidth <em>Marker Start Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMasterPageName <em>Master Page Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMayScript <em>May Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasureAlign <em>Measure Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasureVerticalAlign <em>Measure Vertical Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMirrorHorizontal <em>Mirror Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMirrorVertical <em>Mirror Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNavOrder <em>Nav Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNohref <em>Nohref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNotifyOnUpdateOfRanges <em>Notify On Update Of Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getObject1 <em>Object1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOleDrawAspect <em>Ole Draw Aspect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOpacity1 <em>Opacity1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOpacityName <em>Opacity Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getParallel <em>Parallel</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPathStretchpointX <em>Path Stretchpoint X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPathStretchpointY <em>Path Stretchpoint Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPlacing <em>Placing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPoints <em>Points</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getProtected <em>Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRecreateOnEdit <em>Recreate On Edit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRed <em>Red</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getSecondaryFillColor <em>Secondary Fill Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadow <em>Shadow</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowColor <em>Shadow Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowOffsetX <em>Shadow Offset X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowOffsetY <em>Shadow Offset Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowOpacity <em>Shadow Opacity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShapeId <em>Shape Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getSharpness <em>Sharpness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShowUnit <em>Show Unit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStart <em>Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartAngle <em>Start Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartColor <em>Start Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartGluePoint <em>Start Glue Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartGuide <em>Start Guide</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartIntensity <em>Start Intensity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartLineSpacingHorizontal <em>Start Line Spacing Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartLineSpacingVertical <em>Start Line Spacing Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartShape <em>Start Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeDash1 <em>Stroke Dash1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeDashNames <em>Stroke Dash Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeLinejoin <em>Stroke Linejoin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getSymbolColor <em>Symbol Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextareaHorizontalAlign <em>Textarea Horizontal Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextAreas <em>Text Areas</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextareaVerticalAlign <em>Textarea Vertical Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPath <em>Text Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathAllowed <em>Text Path Allowed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathMode <em>Text Path Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathSameLetterHeights <em>Text Path Same Letter Heights</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathScale <em>Text Path Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextRotateAngle <em>Text Rotate Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextStyleName <em>Text Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTileRepeatOffset <em>Tile Repeat Offset</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaHeight <em>Visible Area Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaLeft <em>Visible Area Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaTop <em>Visible Area Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaWidth <em>Visible Area Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getWrapInfluenceOnPosition <em>Wrap Influence On Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getZIndex <em>ZIndex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference.
	 * @see #setA(AType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_A()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace'"
	 * @generated
	 */
	AType getA();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getA <em>A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' containment reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(AType value);

	/**
	 * Returns the value of the '<em><b>Applet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applet</em>' containment reference.
	 * @see #setApplet(AppletType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Applet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='applet' namespace='##targetNamespace'"
	 * @generated
	 */
	AppletType getApplet();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getApplet <em>Applet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applet</em>' containment reference.
	 * @see #getApplet()
	 * @generated
	 */
	void setApplet(AppletType value);

	/**
	 * Returns the value of the '<em><b>Area Circle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Circle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Circle</em>' containment reference.
	 * @see #setAreaCircle(AreaCircleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_AreaCircle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='area-circle' namespace='##targetNamespace'"
	 * @generated
	 */
	AreaCircleType getAreaCircle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAreaCircle <em>Area Circle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Circle</em>' containment reference.
	 * @see #getAreaCircle()
	 * @generated
	 */
	void setAreaCircle(AreaCircleType value);

	/**
	 * Returns the value of the '<em><b>Area Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Polygon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Polygon</em>' containment reference.
	 * @see #setAreaPolygon(AreaPolygonType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_AreaPolygon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='area-polygon' namespace='##targetNamespace'"
	 * @generated
	 */
	AreaPolygonType getAreaPolygon();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAreaPolygon <em>Area Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Polygon</em>' containment reference.
	 * @see #getAreaPolygon()
	 * @generated
	 */
	void setAreaPolygon(AreaPolygonType value);

	/**
	 * Returns the value of the '<em><b>Area Rectangle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Rectangle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Rectangle</em>' containment reference.
	 * @see #setAreaRectangle(AreaRectangleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_AreaRectangle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='area-rectangle' namespace='##targetNamespace'"
	 * @generated
	 */
	AreaRectangleType getAreaRectangle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAreaRectangle <em>Area Rectangle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Rectangle</em>' containment reference.
	 * @see #getAreaRectangle()
	 * @generated
	 */
	void setAreaRectangle(AreaRectangleType value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference.
	 * @see #setCaption(CaptionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Caption()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='##targetNamespace'"
	 * @generated
	 */
	CaptionType getCaption();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaption <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' containment reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(CaptionType value);

	/**
	 * Returns the value of the '<em><b>Circle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circle</em>' containment reference.
	 * @see #setCircle(CircleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Circle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='circle' namespace='##targetNamespace'"
	 * @generated
	 */
	CircleType getCircle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCircle <em>Circle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circle</em>' containment reference.
	 * @see #getCircle()
	 * @generated
	 */
	void setCircle(CircleType value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference.
	 * @see #setConnector(ConnectorType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Connector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectorType getConnector();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConnector <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' containment reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(ConnectorType value);

	/**
	 * Returns the value of the '<em><b>Contour Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contour Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contour Path</em>' containment reference.
	 * @see #setContourPath(ContourPathType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ContourPath()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contour-path' namespace='##targetNamespace'"
	 * @generated
	 */
	ContourPathType getContourPath();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getContourPath <em>Contour Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contour Path</em>' containment reference.
	 * @see #getContourPath()
	 * @generated
	 */
	void setContourPath(ContourPathType value);

	/**
	 * Returns the value of the '<em><b>Contour Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contour Polygon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contour Polygon</em>' containment reference.
	 * @see #setContourPolygon(ContourPolygonType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ContourPolygon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contour-polygon' namespace='##targetNamespace'"
	 * @generated
	 */
	ContourPolygonType getContourPolygon();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getContourPolygon <em>Contour Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contour Polygon</em>' containment reference.
	 * @see #getContourPolygon()
	 * @generated
	 */
	void setContourPolygon(ContourPolygonType value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(ControlType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Control()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='control' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlType getControl();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(ControlType value);

	/**
	 * Returns the value of the '<em><b>Custom Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Shape</em>' containment reference.
	 * @see #setCustomShape(CustomShapeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CustomShape()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-shape' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomShapeType getCustomShape();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCustomShape <em>Custom Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Shape</em>' containment reference.
	 * @see #getCustomShape()
	 * @generated
	 */
	void setCustomShape(CustomShapeType value);

	/**
	 * Returns the value of the '<em><b>Ellipse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ellipse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse</em>' containment reference.
	 * @see #setEllipse(EllipseType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Ellipse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipse' namespace='##targetNamespace'"
	 * @generated
	 */
	EllipseType getEllipse();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEllipse <em>Ellipse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipse</em>' containment reference.
	 * @see #getEllipse()
	 * @generated
	 */
	void setEllipse(EllipseType value);

	/**
	 * Returns the value of the '<em><b>Enhanced Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enhanced Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enhanced Geometry</em>' containment reference.
	 * @see #setEnhancedGeometry(EnhancedGeometryType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_EnhancedGeometry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='enhanced-geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	EnhancedGeometryType getEnhancedGeometry();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEnhancedGeometry <em>Enhanced Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enhanced Geometry</em>' containment reference.
	 * @see #getEnhancedGeometry()
	 * @generated
	 */
	void setEnhancedGeometry(EnhancedGeometryType value);

	/**
	 * Returns the value of the '<em><b>Equation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation</em>' containment reference.
	 * @see #setEquation(EquationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Equation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='equation' namespace='##targetNamespace'"
	 * @generated
	 */
	EquationType getEquation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEquation <em>Equation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equation</em>' containment reference.
	 * @see #getEquation()
	 * @generated
	 */
	void setEquation(EquationType value);

	/**
	 * Returns the value of the '<em><b>Fill Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Image</em>' containment reference.
	 * @see #setFillImage(FillImageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FillImage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fill-image' namespace='##targetNamespace'"
	 * @generated
	 */
	FillImageType getFillImage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImage <em>Fill Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Image</em>' containment reference.
	 * @see #getFillImage()
	 * @generated
	 */
	void setFillImage(FillImageType value);

	/**
	 * Returns the value of the '<em><b>Floating Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating Frame</em>' containment reference.
	 * @see #setFloatingFrame(FloatingFrameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FloatingFrame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='floating-frame' namespace='##targetNamespace'"
	 * @generated
	 */
	FloatingFrameType getFloatingFrame();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFloatingFrame <em>Floating Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating Frame</em>' containment reference.
	 * @see #getFloatingFrame()
	 * @generated
	 */
	void setFloatingFrame(FloatingFrameType value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference.
	 * @see #setFrame(FrameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Frame()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='frame' namespace='##targetNamespace'"
	 * @generated
	 */
	FrameType getFrame();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrame <em>Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' containment reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(FrameType value);

	/**
	 * Returns the value of the '<em><b>G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' containment reference.
	 * @see #setG(GType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_G()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='g' namespace='##targetNamespace'"
	 * @generated
	 */
	GType getG();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getG <em>G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' containment reference.
	 * @see #getG()
	 * @generated
	 */
	void setG(GType value);

	/**
	 * Returns the value of the '<em><b>Glue Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue Point</em>' containment reference.
	 * @see #setGluePoint(GluePointType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_GluePoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='glue-point' namespace='##targetNamespace'"
	 * @generated
	 */
	GluePointType getGluePoint();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePoint <em>Glue Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue Point</em>' containment reference.
	 * @see #getGluePoint()
	 * @generated
	 */
	void setGluePoint(GluePointType value);

	/**
	 * Returns the value of the '<em><b>Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient</em>' containment reference.
	 * @see #setGradient(GradientType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Gradient()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gradient' namespace='##targetNamespace'"
	 * @generated
	 */
	GradientType getGradient();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGradient <em>Gradient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient</em>' containment reference.
	 * @see #getGradient()
	 * @generated
	 */
	void setGradient(GradientType value);

	/**
	 * Returns the value of the '<em><b>Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle</em>' containment reference.
	 * @see #setHandle(HandleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Handle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='handle' namespace='##targetNamespace'"
	 * @generated
	 */
	HandleType getHandle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandle <em>Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle</em>' containment reference.
	 * @see #getHandle()
	 * @generated
	 */
	void setHandle(HandleType value);

	/**
	 * Returns the value of the '<em><b>Hatch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hatch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hatch</em>' containment reference.
	 * @see #setHatch(HatchType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Hatch()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hatch' namespace='##targetNamespace'"
	 * @generated
	 */
	HatchType getHatch();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHatch <em>Hatch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch</em>' containment reference.
	 * @see #getHatch()
	 * @generated
	 */
	void setHatch(HatchType value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(ImageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Image()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageType getImage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(ImageType value);

	/**
	 * Returns the value of the '<em><b>Image Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Map</em>' containment reference.
	 * @see #setImageMap(ImageMapType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ImageMap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='image-map' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageMapType getImageMap();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getImageMap <em>Image Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Map</em>' containment reference.
	 * @see #getImageMap()
	 * @generated
	 */
	void setImageMap(ImageMapType value);

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' containment reference.
	 * @see #setLayer(LayerType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Layer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='layer' namespace='##targetNamespace'"
	 * @generated
	 */
	LayerType getLayer();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLayer <em>Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' containment reference.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(LayerType value);

	/**
	 * Returns the value of the '<em><b>Layer Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Set</em>' containment reference.
	 * @see #setLayerSet(LayerSetType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_LayerSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='layer-set' namespace='##targetNamespace'"
	 * @generated
	 */
	LayerSetType getLayerSet();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLayerSet <em>Layer Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Set</em>' containment reference.
	 * @see #getLayerSet()
	 * @generated
	 */
	void setLayerSet(LayerSetType value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(LineType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Line()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='line' namespace='##targetNamespace'"
	 * @generated
	 */
	LineType getLine();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(LineType value);

	/**
	 * Returns the value of the '<em><b>Marker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker</em>' containment reference.
	 * @see #setMarker(MarkerType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Marker()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='marker' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkerType getMarker();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarker <em>Marker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker</em>' containment reference.
	 * @see #getMarker()
	 * @generated
	 */
	void setMarker(MarkerType value);

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(MeasureType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Measure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getMeasure();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Object()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectType getObject();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectType value);

	/**
	 * Returns the value of the '<em><b>Object Ole</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Ole</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Ole</em>' containment reference.
	 * @see #setObjectOle(ObjectOleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ObjectOle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-ole' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectOleType getObjectOle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getObjectOle <em>Object Ole</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Ole</em>' containment reference.
	 * @see #getObjectOle()
	 * @generated
	 */
	void setObjectOle(ObjectOleType value);

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opacity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' containment reference.
	 * @see #setOpacity(OpacityType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Opacity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='opacity' namespace='##targetNamespace'"
	 * @generated
	 */
	OpacityType getOpacity();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOpacity <em>Opacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' containment reference.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(OpacityType value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference.
	 * @see #setPage(PageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Page()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	PageType getPage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPage <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' containment reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(PageType value);

	/**
	 * Returns the value of the '<em><b>Page Thumbnail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Thumbnail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Thumbnail</em>' containment reference.
	 * @see #setPageThumbnail(PageThumbnailType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_PageThumbnail()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-thumbnail' namespace='##targetNamespace'"
	 * @generated
	 */
	PageThumbnailType getPageThumbnail();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPageThumbnail <em>Page Thumbnail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Thumbnail</em>' containment reference.
	 * @see #getPageThumbnail()
	 * @generated
	 */
	void setPageThumbnail(PageThumbnailType value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference.
	 * @see #setParam(ParamType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Param()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamType getParam();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getParam <em>Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' containment reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(ParamType value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(PathType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Path()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	PathType getPath();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(PathType value);

	/**
	 * Returns the value of the '<em><b>Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin</em>' containment reference.
	 * @see #setPlugin(PluginType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Plugin()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='plugin' namespace='##targetNamespace'"
	 * @generated
	 */
	PluginType getPlugin();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPlugin <em>Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin</em>' containment reference.
	 * @see #getPlugin()
	 * @generated
	 */
	void setPlugin(PluginType value);

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference.
	 * @see #setPolygon(PolygonType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Polygon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polygon' namespace='##targetNamespace'"
	 * @generated
	 */
	PolygonType getPolygon();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPolygon <em>Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon</em>' containment reference.
	 * @see #getPolygon()
	 * @generated
	 */
	void setPolygon(PolygonType value);

	/**
	 * Returns the value of the '<em><b>Polyline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polyline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polyline</em>' containment reference.
	 * @see #setPolyline(PolylineType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Polyline()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polyline' namespace='##targetNamespace'"
	 * @generated
	 */
	PolylineType getPolyline();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPolyline <em>Polyline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polyline</em>' containment reference.
	 * @see #getPolyline()
	 * @generated
	 */
	void setPolyline(PolylineType value);

	/**
	 * Returns the value of the '<em><b>Rect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rect</em>' containment reference.
	 * @see #setRect(RectType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Rect()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rect' namespace='##targetNamespace'"
	 * @generated
	 */
	RectType getRect();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRect <em>Rect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rect</em>' containment reference.
	 * @see #getRect()
	 * @generated
	 */
	void setRect(RectType value);

	/**
	 * Returns the value of the '<em><b>Regular Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Polygon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Polygon</em>' containment reference.
	 * @see #setRegularPolygon(RegularPolygonType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_RegularPolygon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='regular-polygon' namespace='##targetNamespace'"
	 * @generated
	 */
	RegularPolygonType getRegularPolygon();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRegularPolygon <em>Regular Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regular Polygon</em>' containment reference.
	 * @see #getRegularPolygon()
	 * @generated
	 */
	void setRegularPolygon(RegularPolygonType value);

	/**
	 * Returns the value of the '<em><b>Stroke Dash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Dash</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Dash</em>' containment reference.
	 * @see #setStrokeDash(StrokeDashType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StrokeDash()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stroke-dash' namespace='##targetNamespace'"
	 * @generated
	 */
	StrokeDashType1 getStrokeDash();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeDash <em>Stroke Dash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Dash</em>' containment reference.
	 * @see #getStrokeDash()
	 * @generated
	 */
	void setStrokeDash(StrokeDashType1 value);

	/**
	 * Returns the value of the '<em><b>Text Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Box</em>' containment reference.
	 * @see #setTextBox(TextBoxType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_TextBox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text-box' namespace='##targetNamespace'"
	 * @generated
	 */
	TextBoxType getTextBox();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextBox <em>Text Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Box</em>' containment reference.
	 * @see #getTextBox()
	 * @generated
	 */
	void setTextBox(TextBoxType value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #setAlign(AlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Align()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='align' namespace='##targetNamespace'"
	 * @generated
	 */
	AlignType getAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(AlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAlign <em>Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Align</em>' attribute is set.
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	boolean isSetAlign();

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Angle()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='angle' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive</em>' attribute.
	 * @see #setArchive(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Archive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='archive' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getArchive();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getArchive <em>Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive</em>' attribute.
	 * @see #getArchive()
	 * @generated
	 */
	void setArchive(Object value);

	/**
	 * Returns the value of the '<em><b>Auto Grow Height</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Grow Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Grow Height</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoGrowHeight()
	 * @see #unsetAutoGrowHeight()
	 * @see #setAutoGrowHeight(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_AutoGrowHeight()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='auto-grow-height' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoGrowHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAutoGrowHeight <em>Auto Grow Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Grow Height</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoGrowHeight()
	 * @see #unsetAutoGrowHeight()
	 * @see #getAutoGrowHeight()
	 * @generated
	 */
	void setAutoGrowHeight(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAutoGrowHeight <em>Auto Grow Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoGrowHeight()
	 * @see #getAutoGrowHeight()
	 * @see #setAutoGrowHeight(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutoGrowHeight();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAutoGrowHeight <em>Auto Grow Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Grow Height</em>' attribute is set.
	 * @see #unsetAutoGrowHeight()
	 * @see #getAutoGrowHeight()
	 * @see #setAutoGrowHeight(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutoGrowHeight();

	/**
	 * Returns the value of the '<em><b>Auto Grow Width</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Grow Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Grow Width</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoGrowWidth()
	 * @see #unsetAutoGrowWidth()
	 * @see #setAutoGrowWidth(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_AutoGrowWidth()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='auto-grow-width' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoGrowWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAutoGrowWidth <em>Auto Grow Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Grow Width</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoGrowWidth()
	 * @see #unsetAutoGrowWidth()
	 * @see #getAutoGrowWidth()
	 * @generated
	 */
	void setAutoGrowWidth(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAutoGrowWidth <em>Auto Grow Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoGrowWidth()
	 * @see #getAutoGrowWidth()
	 * @see #setAutoGrowWidth(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutoGrowWidth();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getAutoGrowWidth <em>Auto Grow Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Grow Width</em>' attribute is set.
	 * @see #unsetAutoGrowWidth()
	 * @see #getAutoGrowWidth()
	 * @see #setAutoGrowWidth(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutoGrowWidth();

	/**
	 * Returns the value of the '<em><b>Background Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.BackgroundSizeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Size</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.BackgroundSizeType
	 * @see #isSetBackgroundSize()
	 * @see #unsetBackgroundSize()
	 * @see #setBackgroundSize(BackgroundSizeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_BackgroundSize()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='background-size' namespace='##targetNamespace'"
	 * @generated
	 */
	BackgroundSizeType getBackgroundSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBackgroundSize <em>Background Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Size</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.BackgroundSizeType
	 * @see #isSetBackgroundSize()
	 * @see #unsetBackgroundSize()
	 * @see #getBackgroundSize()
	 * @generated
	 */
	void setBackgroundSize(BackgroundSizeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBackgroundSize <em>Background Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBackgroundSize()
	 * @see #getBackgroundSize()
	 * @see #setBackgroundSize(BackgroundSizeType)
	 * @generated
	 */
	void unsetBackgroundSize();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBackgroundSize <em>Background Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Background Size</em>' attribute is set.
	 * @see #unsetBackgroundSize()
	 * @see #getBackgroundSize()
	 * @see #setBackgroundSize(BackgroundSizeType)
	 * @generated
	 */
	boolean isSetBackgroundSize();

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Blue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='blue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBlue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(String value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see #setBorder(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Border()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='border' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBorder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(String value);

	/**
	 * Returns the value of the '<em><b>Caption Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Angle</em>' attribute.
	 * @see #setCaptionAngle(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CaptionAngle()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='caption-angle' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCaptionAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionAngle <em>Caption Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Angle</em>' attribute.
	 * @see #getCaptionAngle()
	 * @generated
	 */
	void setCaptionAngle(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Caption Angle Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionAngleTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Angle Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Angle Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionAngleTypeType
	 * @see #isSetCaptionAngleType()
	 * @see #unsetCaptionAngleType()
	 * @see #setCaptionAngleType(CaptionAngleTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CaptionAngleType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='caption-angle-type' namespace='##targetNamespace'"
	 * @generated
	 */
	CaptionAngleTypeType getCaptionAngleType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionAngleType <em>Caption Angle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Angle Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionAngleTypeType
	 * @see #isSetCaptionAngleType()
	 * @see #unsetCaptionAngleType()
	 * @see #getCaptionAngleType()
	 * @generated
	 */
	void setCaptionAngleType(CaptionAngleTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionAngleType <em>Caption Angle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCaptionAngleType()
	 * @see #getCaptionAngleType()
	 * @see #setCaptionAngleType(CaptionAngleTypeType)
	 * @generated
	 */
	void unsetCaptionAngleType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionAngleType <em>Caption Angle Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Caption Angle Type</em>' attribute is set.
	 * @see #unsetCaptionAngleType()
	 * @see #getCaptionAngleType()
	 * @see #setCaptionAngleType(CaptionAngleTypeType)
	 * @generated
	 */
	boolean isSetCaptionAngleType();

	/**
	 * Returns the value of the '<em><b>Caption Escape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Escape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Escape</em>' attribute.
	 * @see #setCaptionEscape(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CaptionEscape()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeType"
	 *        extendedMetaData="kind='attribute' name='caption-escape' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCaptionEscape();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionEscape <em>Caption Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Escape</em>' attribute.
	 * @see #getCaptionEscape()
	 * @generated
	 */
	void setCaptionEscape(String value);

	/**
	 * Returns the value of the '<em><b>Caption Escape Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeDirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Escape Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Escape Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeDirectionType
	 * @see #isSetCaptionEscapeDirection()
	 * @see #unsetCaptionEscapeDirection()
	 * @see #setCaptionEscapeDirection(CaptionEscapeDirectionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CaptionEscapeDirection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='caption-escape-direction' namespace='##targetNamespace'"
	 * @generated
	 */
	CaptionEscapeDirectionType getCaptionEscapeDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionEscapeDirection <em>Caption Escape Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Escape Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionEscapeDirectionType
	 * @see #isSetCaptionEscapeDirection()
	 * @see #unsetCaptionEscapeDirection()
	 * @see #getCaptionEscapeDirection()
	 * @generated
	 */
	void setCaptionEscapeDirection(CaptionEscapeDirectionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionEscapeDirection <em>Caption Escape Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCaptionEscapeDirection()
	 * @see #getCaptionEscapeDirection()
	 * @see #setCaptionEscapeDirection(CaptionEscapeDirectionType)
	 * @generated
	 */
	void unsetCaptionEscapeDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionEscapeDirection <em>Caption Escape Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Caption Escape Direction</em>' attribute is set.
	 * @see #unsetCaptionEscapeDirection()
	 * @see #getCaptionEscapeDirection()
	 * @see #setCaptionEscapeDirection(CaptionEscapeDirectionType)
	 * @generated
	 */
	boolean isSetCaptionEscapeDirection();

	/**
	 * Returns the value of the '<em><b>Caption Fit Line Length</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Fit Line Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Fit Line Length</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCaptionFitLineLength()
	 * @see #unsetCaptionFitLineLength()
	 * @see #setCaptionFitLineLength(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CaptionFitLineLength()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='caption-fit-line-length' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCaptionFitLineLength();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionFitLineLength <em>Caption Fit Line Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Fit Line Length</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCaptionFitLineLength()
	 * @see #unsetCaptionFitLineLength()
	 * @see #getCaptionFitLineLength()
	 * @generated
	 */
	void setCaptionFitLineLength(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionFitLineLength <em>Caption Fit Line Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCaptionFitLineLength()
	 * @see #getCaptionFitLineLength()
	 * @see #setCaptionFitLineLength(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCaptionFitLineLength();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionFitLineLength <em>Caption Fit Line Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Caption Fit Line Length</em>' attribute is set.
	 * @see #unsetCaptionFitLineLength()
	 * @see #getCaptionFitLineLength()
	 * @see #setCaptionFitLineLength(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCaptionFitLineLength();

	/**
	 * Returns the value of the '<em><b>Caption Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Gap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Gap</em>' attribute.
	 * @see #setCaptionGap(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CaptionGap()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Distance"
	 *        extendedMetaData="kind='attribute' name='caption-gap' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCaptionGap();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionGap <em>Caption Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Gap</em>' attribute.
	 * @see #getCaptionGap()
	 * @generated
	 */
	void setCaptionGap(String value);

	/**
	 * Returns the value of the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Id</em>' attribute.
	 * @see #setCaptionId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CaptionId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='caption-id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCaptionId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionId <em>Caption Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Id</em>' attribute.
	 * @see #getCaptionId()
	 * @generated
	 */
	void setCaptionId(String value);

	/**
	 * Returns the value of the '<em><b>Caption Line Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Line Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Line Length</em>' attribute.
	 * @see #setCaptionLineLength(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CaptionLineLength()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='caption-line-length' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCaptionLineLength();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionLineLength <em>Caption Line Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Line Length</em>' attribute.
	 * @see #getCaptionLineLength()
	 * @generated
	 */
	void setCaptionLineLength(String value);

	/**
	 * Returns the value of the '<em><b>Caption Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Point X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Point X</em>' attribute.
	 * @see #setCaptionPointX(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CaptionPointX()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='caption-point-x' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCaptionPointX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionPointX <em>Caption Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Point X</em>' attribute.
	 * @see #getCaptionPointX()
	 * @generated
	 */
	void setCaptionPointX(String value);

	/**
	 * Returns the value of the '<em><b>Caption Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Point Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Point Y</em>' attribute.
	 * @see #setCaptionPointY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CaptionPointY()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='caption-point-y' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCaptionPointY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionPointY <em>Caption Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Point Y</em>' attribute.
	 * @see #getCaptionPointY()
	 * @generated
	 */
	void setCaptionPointY(String value);

	/**
	 * Returns the value of the '<em><b>Caption Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionTypeType
	 * @see #isSetCaptionType()
	 * @see #unsetCaptionType()
	 * @see #setCaptionType(CaptionTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CaptionType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='caption-type' namespace='##targetNamespace'"
	 * @generated
	 */
	CaptionTypeType getCaptionType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionType <em>Caption Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionTypeType
	 * @see #isSetCaptionType()
	 * @see #unsetCaptionType()
	 * @see #getCaptionType()
	 * @generated
	 */
	void setCaptionType(CaptionTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionType <em>Caption Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCaptionType()
	 * @see #getCaptionType()
	 * @see #setCaptionType(CaptionTypeType)
	 * @generated
	 */
	void unsetCaptionType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCaptionType <em>Caption Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Caption Type</em>' attribute is set.
	 * @see #unsetCaptionType()
	 * @see #getCaptionType()
	 * @see #setCaptionType(CaptionTypeType)
	 * @generated
	 */
	boolean isSetCaptionType();

	/**
	 * Returns the value of the '<em><b>Chain Next Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain Next Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain Next Name</em>' attribute.
	 * @see #setChainNextName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ChainNextName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='chain-next-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getChainNextName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getChainNextName <em>Chain Next Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain Next Name</em>' attribute.
	 * @see #getChainNextName()
	 * @generated
	 */
	void setChainNextName(String value);

	/**
	 * Returns the value of the '<em><b>Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Id</em>' attribute.
	 * @see #setClassId(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ClassId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='class-id' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getClassId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getClassId <em>Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Id</em>' attribute.
	 * @see #getClassId()
	 * @generated
	 */
	void setClassId(Object value);

	/**
	 * Returns the value of the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Names</em>' attribute.
	 * @see #setClassNames(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ClassNames()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameRefs" many="false"
	 *        extendedMetaData="kind='attribute' name='class-names' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getClassNames();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getClassNames <em>Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Names</em>' attribute.
	 * @see #getClassNames()
	 * @generated
	 */
	void setClassNames(List<String> value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Color()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Color Inversion</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Inversion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Inversion</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetColorInversion()
	 * @see #unsetColorInversion()
	 * @see #setColorInversion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ColorInversion()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='color-inversion' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getColorInversion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColorInversion <em>Color Inversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Inversion</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetColorInversion()
	 * @see #unsetColorInversion()
	 * @see #getColorInversion()
	 * @generated
	 */
	void setColorInversion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColorInversion <em>Color Inversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColorInversion()
	 * @see #getColorInversion()
	 * @see #setColorInversion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetColorInversion();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColorInversion <em>Color Inversion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color Inversion</em>' attribute is set.
	 * @see #unsetColorInversion()
	 * @see #getColorInversion()
	 * @see #setColorInversion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetColorInversion();

	/**
	 * Returns the value of the '<em><b>Color Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ColorModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ColorModeType
	 * @see #isSetColorMode()
	 * @see #unsetColorMode()
	 * @see #setColorMode(ColorModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ColorMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='color-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	ColorModeType getColorMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColorMode <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ColorModeType
	 * @see #isSetColorMode()
	 * @see #unsetColorMode()
	 * @see #getColorMode()
	 * @generated
	 */
	void setColorMode(ColorModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColorMode <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColorMode()
	 * @see #getColorMode()
	 * @see #setColorMode(ColorModeType)
	 * @generated
	 */
	void unsetColorMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getColorMode <em>Color Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color Mode</em>' attribute is set.
	 * @see #unsetColorMode()
	 * @see #getColorMode()
	 * @see #setColorMode(ColorModeType)
	 * @generated
	 */
	boolean isSetColorMode();

	/**
	 * Returns the value of the '<em><b>Concave</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConcaveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concave</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concave</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConcaveType
	 * @see #isSetConcave()
	 * @see #unsetConcave()
	 * @see #setConcave(ConcaveType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Concave()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='concave' namespace='##targetNamespace'"
	 * @generated
	 */
	ConcaveType getConcave();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConcave <em>Concave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concave</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConcaveType
	 * @see #isSetConcave()
	 * @see #unsetConcave()
	 * @see #getConcave()
	 * @generated
	 */
	void setConcave(ConcaveType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConcave <em>Concave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConcave()
	 * @see #getConcave()
	 * @see #setConcave(ConcaveType)
	 * @generated
	 */
	void unsetConcave();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConcave <em>Concave</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Concave</em>' attribute is set.
	 * @see #unsetConcave()
	 * @see #getConcave()
	 * @see #setConcave(ConcaveType)
	 * @generated
	 */
	boolean isSetConcave();

	/**
	 * Returns the value of the '<em><b>Concentric Gradient Fill Allowed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concentric Gradient Fill Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentric Gradient Fill Allowed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetConcentricGradientFillAllowed()
	 * @see #unsetConcentricGradientFillAllowed()
	 * @see #setConcentricGradientFillAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ConcentricGradientFillAllowed()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='concentric-gradient-fill-allowed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getConcentricGradientFillAllowed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConcentricGradientFillAllowed <em>Concentric Gradient Fill Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentric Gradient Fill Allowed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetConcentricGradientFillAllowed()
	 * @see #unsetConcentricGradientFillAllowed()
	 * @see #getConcentricGradientFillAllowed()
	 * @generated
	 */
	void setConcentricGradientFillAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConcentricGradientFillAllowed <em>Concentric Gradient Fill Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConcentricGradientFillAllowed()
	 * @see #getConcentricGradientFillAllowed()
	 * @see #setConcentricGradientFillAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetConcentricGradientFillAllowed();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getConcentricGradientFillAllowed <em>Concentric Gradient Fill Allowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Concentric Gradient Fill Allowed</em>' attribute is set.
	 * @see #unsetConcentricGradientFillAllowed()
	 * @see #getConcentricGradientFillAllowed()
	 * @see #setConcentricGradientFillAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetConcentricGradientFillAllowed();

	/**
	 * Returns the value of the '<em><b>Contrast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrast</em>' attribute.
	 * @see #setContrast(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Contrast()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='contrast' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContrast();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getContrast <em>Contrast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrast</em>' attribute.
	 * @see #getContrast()
	 * @generated
	 */
	void setContrast(String value);

	/**
	 * Returns the value of the '<em><b>Control1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control1</em>' attribute.
	 * @see #setControl1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Control1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='control' namespace='##targetNamespace'"
	 * @generated
	 */
	String getControl1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getControl1 <em>Control1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control1</em>' attribute.
	 * @see #getControl1()
	 * @generated
	 */
	void setControl1(String value);

	/**
	 * Returns the value of the '<em><b>Copy Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Of</em>' attribute.
	 * @see #setCopyOf(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CopyOf()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='copy-of' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCopyOf();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCopyOf <em>Copy Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Of</em>' attribute.
	 * @see #getCopyOf()
	 * @generated
	 */
	void setCopyOf(String value);

	/**
	 * Returns the value of the '<em><b>Corner Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corner Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner Radius</em>' attribute.
	 * @see #setCornerRadius(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_CornerRadius()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='corner-radius' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCornerRadius();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCornerRadius <em>Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner Radius</em>' attribute.
	 * @see #getCornerRadius()
	 * @generated
	 */
	void setCornerRadius(String value);

	/**
	 * Returns the value of the '<em><b>Corners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corners</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corners</em>' attribute.
	 * @see #setCorners(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Corners()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='corners' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCorners();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCorners <em>Corners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corners</em>' attribute.
	 * @see #getCorners()
	 * @generated
	 */
	void setCorners(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cx</em>' attribute.
	 * @see #setCx(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Cx()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='cx' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCx();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCx <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cx</em>' attribute.
	 * @see #getCx()
	 * @generated
	 */
	void setCx(String value);

	/**
	 * Returns the value of the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cy</em>' attribute.
	 * @see #setCy(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Cy()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='cy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getCy <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cy</em>' attribute.
	 * @see #getCy()
	 * @generated
	 */
	void setCy(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Data()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Decimal Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Places</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Places</em>' attribute.
	 * @see #setDecimalPlaces(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_DecimalPlaces()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='decimal-places' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDecimalPlaces();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDecimalPlaces <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Places</em>' attribute.
	 * @see #getDecimalPlaces()
	 * @generated
	 */
	void setDecimalPlaces(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DisplayType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DisplayType
	 * @see #isSetDisplay()
	 * @see #unsetDisplay()
	 * @see #setDisplay(DisplayType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Display()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayType getDisplay();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DisplayType
	 * @see #isSetDisplay()
	 * @see #unsetDisplay()
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(DisplayType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplay()
	 * @see #getDisplay()
	 * @see #setDisplay(DisplayType)
	 * @generated
	 */
	void unsetDisplay();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDisplay <em>Display</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display</em>' attribute is set.
	 * @see #unsetDisplay()
	 * @see #getDisplay()
	 * @see #setDisplay(DisplayType)
	 * @generated
	 */
	boolean isSetDisplay();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_DisplayName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Distance()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='distance' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDistance();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(String value);

	/**
	 * Returns the value of the '<em><b>Dots1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dots1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dots1</em>' attribute.
	 * @see #setDots1(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Dots1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='dots1' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDots1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots1 <em>Dots1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dots1</em>' attribute.
	 * @see #getDots1()
	 * @generated
	 */
	void setDots1(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dots1 Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dots1 Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dots1 Length</em>' attribute.
	 * @see #setDots1Length(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Dots1Length()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='dots1-length' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDots1Length();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots1Length <em>Dots1 Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dots1 Length</em>' attribute.
	 * @see #getDots1Length()
	 * @generated
	 */
	void setDots1Length(String value);

	/**
	 * Returns the value of the '<em><b>Dots2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dots2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dots2</em>' attribute.
	 * @see #setDots2(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Dots2()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='dots2' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDots2();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots2 <em>Dots2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dots2</em>' attribute.
	 * @see #getDots2()
	 * @generated
	 */
	void setDots2(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Dots2 Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dots2 Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dots2 Length</em>' attribute.
	 * @see #setDots2Length(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Dots2Length()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='dots2-length' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDots2Length();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getDots2Length <em>Dots2 Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dots2 Length</em>' attribute.
	 * @see #getDots2Length()
	 * @generated
	 */
	void setDots2Length(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_End()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>End Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Angle</em>' attribute.
	 * @see #isSetEndAngle()
	 * @see #unsetEndAngle()
	 * @see #setEndAngle(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_EndAngle()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='end-angle' namespace='##targetNamespace'"
	 * @generated
	 */
	double getEndAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndAngle <em>End Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Angle</em>' attribute.
	 * @see #isSetEndAngle()
	 * @see #unsetEndAngle()
	 * @see #getEndAngle()
	 * @generated
	 */
	void setEndAngle(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndAngle <em>End Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndAngle()
	 * @see #getEndAngle()
	 * @see #setEndAngle(double)
	 * @generated
	 */
	void unsetEndAngle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndAngle <em>End Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Angle</em>' attribute is set.
	 * @see #unsetEndAngle()
	 * @see #getEndAngle()
	 * @see #setEndAngle(double)
	 * @generated
	 */
	boolean isSetEndAngle();

	/**
	 * Returns the value of the '<em><b>End Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Color</em>' attribute.
	 * @see #setEndColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_EndColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='end-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndColor <em>End Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Color</em>' attribute.
	 * @see #getEndColor()
	 * @generated
	 */
	void setEndColor(String value);

	/**
	 * Returns the value of the '<em><b>End Glue Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Glue Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Glue Point</em>' attribute.
	 * @see #setEndGluePoint(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_EndGluePoint()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='end-glue-point' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEndGluePoint();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndGluePoint <em>End Glue Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Glue Point</em>' attribute.
	 * @see #getEndGluePoint()
	 * @generated
	 */
	void setEndGluePoint(BigInteger value);

	/**
	 * Returns the value of the '<em><b>End Guide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Guide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Guide</em>' attribute.
	 * @see #setEndGuide(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_EndGuide()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='end-guide' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndGuide();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndGuide <em>End Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Guide</em>' attribute.
	 * @see #getEndGuide()
	 * @generated
	 */
	void setEndGuide(String value);

	/**
	 * Returns the value of the '<em><b>End Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Intensity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Intensity</em>' attribute.
	 * @see #setEndIntensity(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_EndIntensity()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='end-intensity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndIntensity();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndIntensity <em>End Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Intensity</em>' attribute.
	 * @see #getEndIntensity()
	 * @generated
	 */
	void setEndIntensity(String value);

	/**
	 * Returns the value of the '<em><b>End Line Spacing Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Line Spacing Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Line Spacing Horizontal</em>' attribute.
	 * @see #setEndLineSpacingHorizontal(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_EndLineSpacingHorizontal()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Distance"
	 *        extendedMetaData="kind='attribute' name='end-line-spacing-horizontal' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndLineSpacingHorizontal();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndLineSpacingHorizontal <em>End Line Spacing Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Line Spacing Horizontal</em>' attribute.
	 * @see #getEndLineSpacingHorizontal()
	 * @generated
	 */
	void setEndLineSpacingHorizontal(String value);

	/**
	 * Returns the value of the '<em><b>End Line Spacing Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Line Spacing Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Line Spacing Vertical</em>' attribute.
	 * @see #setEndLineSpacingVertical(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_EndLineSpacingVertical()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Distance"
	 *        extendedMetaData="kind='attribute' name='end-line-spacing-vertical' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndLineSpacingVertical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndLineSpacingVertical <em>End Line Spacing Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Line Spacing Vertical</em>' attribute.
	 * @see #getEndLineSpacingVertical()
	 * @generated
	 */
	void setEndLineSpacingVertical(String value);

	/**
	 * Returns the value of the '<em><b>End Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Shape</em>' attribute.
	 * @see #setEndShape(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_EndShape()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='end-shape' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndShape();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEndShape <em>End Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Shape</em>' attribute.
	 * @see #getEndShape()
	 * @generated
	 */
	void setEndShape(String value);

	/**
	 * Returns the value of the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' attribute.
	 * @see #setEngine(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Engine()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NamespacedToken"
	 *        extendedMetaData="kind='attribute' name='engine' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEngine();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEngine <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' attribute.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(String value);

	/**
	 * Returns the value of the '<em><b>Enhanced Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enhanced Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enhanced Path</em>' attribute.
	 * @see #setEnhancedPath(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_EnhancedPath()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='enhanced-path' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEnhancedPath();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEnhancedPath <em>Enhanced Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enhanced Path</em>' attribute.
	 * @see #getEnhancedPath()
	 * @generated
	 */
	void setEnhancedPath(String value);

	/**
	 * Returns the value of the '<em><b>Escape Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EscapeDirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escape Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escape Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EscapeDirectionType
	 * @see #isSetEscapeDirection()
	 * @see #unsetEscapeDirection()
	 * @see #setEscapeDirection(EscapeDirectionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_EscapeDirection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='escape-direction' namespace='##targetNamespace'"
	 * @generated
	 */
	EscapeDirectionType getEscapeDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEscapeDirection <em>Escape Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EscapeDirectionType
	 * @see #isSetEscapeDirection()
	 * @see #unsetEscapeDirection()
	 * @see #getEscapeDirection()
	 * @generated
	 */
	void setEscapeDirection(EscapeDirectionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEscapeDirection <em>Escape Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEscapeDirection()
	 * @see #getEscapeDirection()
	 * @see #setEscapeDirection(EscapeDirectionType)
	 * @generated
	 */
	void unsetEscapeDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getEscapeDirection <em>Escape Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Escape Direction</em>' attribute is set.
	 * @see #unsetEscapeDirection()
	 * @see #getEscapeDirection()
	 * @see #setEscapeDirection(EscapeDirectionType)
	 * @generated
	 */
	boolean isSetEscapeDirection();

	/**
	 * Returns the value of the '<em><b>Extrusion</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusion()
	 * @see #unsetExtrusion()
	 * @see #setExtrusion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Extrusion()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusion <em>Extrusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusion()
	 * @see #unsetExtrusion()
	 * @see #getExtrusion()
	 * @generated
	 */
	void setExtrusion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusion <em>Extrusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusion()
	 * @see #getExtrusion()
	 * @see #setExtrusion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusion();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusion <em>Extrusion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion</em>' attribute is set.
	 * @see #unsetExtrusion()
	 * @see #getExtrusion()
	 * @see #setExtrusion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusion();

	/**
	 * Returns the value of the '<em><b>Extrusion Allowed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Allowed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionAllowed()
	 * @see #unsetExtrusionAllowed()
	 * @see #setExtrusionAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionAllowed()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion-allowed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionAllowed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionAllowed <em>Extrusion Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Allowed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionAllowed()
	 * @see #unsetExtrusionAllowed()
	 * @see #getExtrusionAllowed()
	 * @generated
	 */
	void setExtrusionAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionAllowed <em>Extrusion Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionAllowed()
	 * @see #getExtrusionAllowed()
	 * @see #setExtrusionAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusionAllowed();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionAllowed <em>Extrusion Allowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Allowed</em>' attribute is set.
	 * @see #unsetExtrusionAllowed()
	 * @see #getExtrusionAllowed()
	 * @see #setExtrusionAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusionAllowed();

	/**
	 * Returns the value of the '<em><b>Extrusion Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Brightness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Brightness</em>' attribute.
	 * @see #setExtrusionBrightness(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionBrightness()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='extrusion-brightness' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionBrightness();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionBrightness <em>Extrusion Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Brightness</em>' attribute.
	 * @see #getExtrusionBrightness()
	 * @generated
	 */
	void setExtrusionBrightness(String value);

	/**
	 * Returns the value of the '<em><b>Extrusion Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Color</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionColor()
	 * @see #unsetExtrusionColor()
	 * @see #setExtrusionColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionColor()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion-color' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionColor <em>Extrusion Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Color</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionColor()
	 * @see #unsetExtrusionColor()
	 * @see #getExtrusionColor()
	 * @generated
	 */
	void setExtrusionColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionColor <em>Extrusion Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionColor()
	 * @see #getExtrusionColor()
	 * @see #setExtrusionColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusionColor();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionColor <em>Extrusion Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Color</em>' attribute is set.
	 * @see #unsetExtrusionColor()
	 * @see #getExtrusionColor()
	 * @see #setExtrusionColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusionColor();

	/**
	 * Returns the value of the '<em><b>Extrusion Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Depth</em>' attribute.
	 * @see #setExtrusionDepth(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionDepth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.ExtrusionDepthType" many="false"
	 *        extendedMetaData="kind='attribute' name='extrusion-depth' namespace='##targetNamespace'"
	 * @generated
	 */
	List getExtrusionDepth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionDepth <em>Extrusion Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Depth</em>' attribute.
	 * @see #getExtrusionDepth()
	 * @generated
	 */
	void setExtrusionDepth(List value);

	/**
	 * Returns the value of the '<em><b>Extrusion Diffusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Diffusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Diffusion</em>' attribute.
	 * @see #setExtrusionDiffusion(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionDiffusion()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='extrusion-diffusion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionDiffusion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionDiffusion <em>Extrusion Diffusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Diffusion</em>' attribute.
	 * @see #getExtrusionDiffusion()
	 * @generated
	 */
	void setExtrusionDiffusion(String value);

	/**
	 * Returns the value of the '<em><b>Extrusion First Light Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion First Light Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion First Light Direction</em>' attribute.
	 * @see #setExtrusionFirstLightDirection(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionFirstLightDirection()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='extrusion-first-light-direction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionFirstLightDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightDirection <em>Extrusion First Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion First Light Direction</em>' attribute.
	 * @see #getExtrusionFirstLightDirection()
	 * @generated
	 */
	void setExtrusionFirstLightDirection(String value);

	/**
	 * Returns the value of the '<em><b>Extrusion First Light Harsh</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion First Light Harsh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion First Light Harsh</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionFirstLightHarsh()
	 * @see #unsetExtrusionFirstLightHarsh()
	 * @see #setExtrusionFirstLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionFirstLightHarsh()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion-first-light-harsh' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionFirstLightHarsh();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightHarsh <em>Extrusion First Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion First Light Harsh</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionFirstLightHarsh()
	 * @see #unsetExtrusionFirstLightHarsh()
	 * @see #getExtrusionFirstLightHarsh()
	 * @generated
	 */
	void setExtrusionFirstLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightHarsh <em>Extrusion First Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionFirstLightHarsh()
	 * @see #getExtrusionFirstLightHarsh()
	 * @see #setExtrusionFirstLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusionFirstLightHarsh();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightHarsh <em>Extrusion First Light Harsh</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion First Light Harsh</em>' attribute is set.
	 * @see #unsetExtrusionFirstLightHarsh()
	 * @see #getExtrusionFirstLightHarsh()
	 * @see #setExtrusionFirstLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusionFirstLightHarsh();

	/**
	 * Returns the value of the '<em><b>Extrusion First Light Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion First Light Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion First Light Level</em>' attribute.
	 * @see #setExtrusionFirstLightLevel(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionFirstLightLevel()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='extrusion-first-light-level' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionFirstLightLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionFirstLightLevel <em>Extrusion First Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion First Light Level</em>' attribute.
	 * @see #getExtrusionFirstLightLevel()
	 * @generated
	 */
	void setExtrusionFirstLightLevel(String value);

	/**
	 * Returns the value of the '<em><b>Extrusion Light Face</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Light Face</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Light Face</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionLightFace()
	 * @see #unsetExtrusionLightFace()
	 * @see #setExtrusionLightFace(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionLightFace()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion-light-face' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionLightFace();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionLightFace <em>Extrusion Light Face</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Light Face</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionLightFace()
	 * @see #unsetExtrusionLightFace()
	 * @see #getExtrusionLightFace()
	 * @generated
	 */
	void setExtrusionLightFace(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionLightFace <em>Extrusion Light Face</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionLightFace()
	 * @see #getExtrusionLightFace()
	 * @see #setExtrusionLightFace(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusionLightFace();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionLightFace <em>Extrusion Light Face</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Light Face</em>' attribute is set.
	 * @see #unsetExtrusionLightFace()
	 * @see #getExtrusionLightFace()
	 * @see #setExtrusionLightFace(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusionLightFace();

	/**
	 * Returns the value of the '<em><b>Extrusion Metal</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Metal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Metal</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionMetal()
	 * @see #unsetExtrusionMetal()
	 * @see #setExtrusionMetal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionMetal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion-metal' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionMetal();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionMetal <em>Extrusion Metal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Metal</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionMetal()
	 * @see #unsetExtrusionMetal()
	 * @see #getExtrusionMetal()
	 * @generated
	 */
	void setExtrusionMetal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionMetal <em>Extrusion Metal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionMetal()
	 * @see #getExtrusionMetal()
	 * @see #setExtrusionMetal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusionMetal();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionMetal <em>Extrusion Metal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Metal</em>' attribute is set.
	 * @see #unsetExtrusionMetal()
	 * @see #getExtrusionMetal()
	 * @see #setExtrusionMetal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusionMetal();

	/**
	 * Returns the value of the '<em><b>Extrusion Number Of Line Segments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Number Of Line Segments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Number Of Line Segments</em>' attribute.
	 * @see #setExtrusionNumberOfLineSegments(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionNumberOfLineSegments()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='extrusion-number-of-line-segments' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getExtrusionNumberOfLineSegments();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionNumberOfLineSegments <em>Extrusion Number Of Line Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Number Of Line Segments</em>' attribute.
	 * @see #getExtrusionNumberOfLineSegments()
	 * @generated
	 */
	void setExtrusionNumberOfLineSegments(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Extrusion Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Origin</em>' attribute.
	 * @see #setExtrusionOrigin(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionOrigin()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.ExtrusionOriginType" many="false"
	 *        extendedMetaData="kind='attribute' name='extrusion-origin' namespace='##targetNamespace'"
	 * @generated
	 */
	List getExtrusionOrigin();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionOrigin <em>Extrusion Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Origin</em>' attribute.
	 * @see #getExtrusionOrigin()
	 * @generated
	 */
	void setExtrusionOrigin(List value);

	/**
	 * Returns the value of the '<em><b>Extrusion Rotation Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Rotation Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Rotation Angle</em>' attribute.
	 * @see #setExtrusionRotationAngle(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionRotationAngle()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.ExtrusionRotationAngleType" many="false"
	 *        extendedMetaData="kind='attribute' name='extrusion-rotation-angle' namespace='##targetNamespace'"
	 * @generated
	 */
	List getExtrusionRotationAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionRotationAngle <em>Extrusion Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Rotation Angle</em>' attribute.
	 * @see #getExtrusionRotationAngle()
	 * @generated
	 */
	void setExtrusionRotationAngle(List value);

	/**
	 * Returns the value of the '<em><b>Extrusion Rotation Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Rotation Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Rotation Center</em>' attribute.
	 * @see #setExtrusionRotationCenter(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionRotationCenter()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='extrusion-rotation-center' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionRotationCenter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionRotationCenter <em>Extrusion Rotation Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Rotation Center</em>' attribute.
	 * @see #getExtrusionRotationCenter()
	 * @generated
	 */
	void setExtrusionRotationCenter(String value);

	/**
	 * Returns the value of the '<em><b>Extrusion Second Light Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Second Light Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Second Light Direction</em>' attribute.
	 * @see #setExtrusionSecondLightDirection(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionSecondLightDirection()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='extrusion-second-light-direction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionSecondLightDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightDirection <em>Extrusion Second Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Second Light Direction</em>' attribute.
	 * @see #getExtrusionSecondLightDirection()
	 * @generated
	 */
	void setExtrusionSecondLightDirection(String value);

	/**
	 * Returns the value of the '<em><b>Extrusion Second Light Harsh</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Second Light Harsh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Second Light Harsh</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionSecondLightHarsh()
	 * @see #unsetExtrusionSecondLightHarsh()
	 * @see #setExtrusionSecondLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionSecondLightHarsh()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion-second-light-harsh' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionSecondLightHarsh();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightHarsh <em>Extrusion Second Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Second Light Harsh</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionSecondLightHarsh()
	 * @see #unsetExtrusionSecondLightHarsh()
	 * @see #getExtrusionSecondLightHarsh()
	 * @generated
	 */
	void setExtrusionSecondLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightHarsh <em>Extrusion Second Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionSecondLightHarsh()
	 * @see #getExtrusionSecondLightHarsh()
	 * @see #setExtrusionSecondLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusionSecondLightHarsh();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightHarsh <em>Extrusion Second Light Harsh</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Second Light Harsh</em>' attribute is set.
	 * @see #unsetExtrusionSecondLightHarsh()
	 * @see #getExtrusionSecondLightHarsh()
	 * @see #setExtrusionSecondLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusionSecondLightHarsh();

	/**
	 * Returns the value of the '<em><b>Extrusion Second Light Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Second Light Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Second Light Level</em>' attribute.
	 * @see #setExtrusionSecondLightLevel(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionSecondLightLevel()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='extrusion-second-light-level' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionSecondLightLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSecondLightLevel <em>Extrusion Second Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Second Light Level</em>' attribute.
	 * @see #getExtrusionSecondLightLevel()
	 * @generated
	 */
	void setExtrusionSecondLightLevel(String value);

	/**
	 * Returns the value of the '<em><b>Extrusion Shininess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Shininess</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Shininess</em>' attribute.
	 * @see #setExtrusionShininess(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionShininess()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='extrusion-shininess' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionShininess();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionShininess <em>Extrusion Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Shininess</em>' attribute.
	 * @see #getExtrusionShininess()
	 * @generated
	 */
	void setExtrusionShininess(String value);

	/**
	 * Returns the value of the '<em><b>Extrusion Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Skew</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Skew</em>' attribute.
	 * @see #setExtrusionSkew(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionSkew()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.ExtrusionSkewType" many="false"
	 *        extendedMetaData="kind='attribute' name='extrusion-skew' namespace='##targetNamespace'"
	 * @generated
	 */
	List getExtrusionSkew();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSkew <em>Extrusion Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Skew</em>' attribute.
	 * @see #getExtrusionSkew()
	 * @generated
	 */
	void setExtrusionSkew(List value);

	/**
	 * Returns the value of the '<em><b>Extrusion Specularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Specularity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Specularity</em>' attribute.
	 * @see #setExtrusionSpecularity(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionSpecularity()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='extrusion-specularity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionSpecularity();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionSpecularity <em>Extrusion Specularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Specularity</em>' attribute.
	 * @see #getExtrusionSpecularity()
	 * @generated
	 */
	void setExtrusionSpecularity(String value);

	/**
	 * Returns the value of the '<em><b>Extrusion Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Viewpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Viewpoint</em>' attribute.
	 * @see #setExtrusionViewpoint(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ExtrusionViewpoint()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Point3D"
	 *        extendedMetaData="kind='attribute' name='extrusion-viewpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionViewpoint();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getExtrusionViewpoint <em>Extrusion Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Viewpoint</em>' attribute.
	 * @see #getExtrusionViewpoint()
	 * @generated
	 */
	void setExtrusionViewpoint(String value);

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillType
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #setFill(FillType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Fill()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fill' namespace='##targetNamespace'"
	 * @generated
	 */
	FillType getFill();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillType
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #getFill()
	 * @generated
	 */
	void setFill(FillType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFill()
	 * @see #getFill()
	 * @see #setFill(FillType)
	 * @generated
	 */
	void unsetFill();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFill <em>Fill</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill</em>' attribute is set.
	 * @see #unsetFill()
	 * @see #getFill()
	 * @see #setFill(FillType)
	 * @generated
	 */
	boolean isSetFill();

	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Color</em>' attribute.
	 * @see #setFillColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FillColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='fill-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFillColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillColor <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Color</em>' attribute.
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(String value);

	/**
	 * Returns the value of the '<em><b>Fill Gradient Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Gradient Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Gradient Name</em>' attribute.
	 * @see #setFillGradientName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FillGradientName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.FillGradientNameType"
	 *        extendedMetaData="kind='attribute' name='fill-gradient-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFillGradientName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillGradientName <em>Fill Gradient Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Gradient Name</em>' attribute.
	 * @see #getFillGradientName()
	 * @generated
	 */
	void setFillGradientName(String value);

	/**
	 * Returns the value of the '<em><b>Fill Hatch Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Hatch Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Hatch Name</em>' attribute.
	 * @see #setFillHatchName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FillHatchName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.FillHatchNameType"
	 *        extendedMetaData="kind='attribute' name='fill-hatch-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFillHatchName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillHatchName <em>Fill Hatch Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Hatch Name</em>' attribute.
	 * @see #getFillHatchName()
	 * @generated
	 */
	void setFillHatchName(String value);

	/**
	 * Returns the value of the '<em><b>Fill Hatch Solid</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Hatch Solid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Hatch Solid</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFillHatchSolid()
	 * @see #unsetFillHatchSolid()
	 * @see #setFillHatchSolid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FillHatchSolid()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fill-hatch-solid' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFillHatchSolid();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillHatchSolid <em>Fill Hatch Solid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Hatch Solid</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFillHatchSolid()
	 * @see #unsetFillHatchSolid()
	 * @see #getFillHatchSolid()
	 * @generated
	 */
	void setFillHatchSolid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillHatchSolid <em>Fill Hatch Solid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillHatchSolid()
	 * @see #getFillHatchSolid()
	 * @see #setFillHatchSolid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetFillHatchSolid();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillHatchSolid <em>Fill Hatch Solid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill Hatch Solid</em>' attribute is set.
	 * @see #unsetFillHatchSolid()
	 * @see #getFillHatchSolid()
	 * @see #setFillHatchSolid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetFillHatchSolid();

	/**
	 * Returns the value of the '<em><b>Fill Image Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Image Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Image Height</em>' attribute.
	 * @see #setFillImageHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FillImageHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageHeightType"
	 *        extendedMetaData="kind='attribute' name='fill-image-height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFillImageHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageHeight <em>Fill Image Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Image Height</em>' attribute.
	 * @see #getFillImageHeight()
	 * @generated
	 */
	void setFillImageHeight(String value);

	/**
	 * Returns the value of the '<em><b>Fill Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Image Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Image Name</em>' attribute.
	 * @see #setFillImageName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FillImageName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageNameType"
	 *        extendedMetaData="kind='attribute' name='fill-image-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFillImageName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageName <em>Fill Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Image Name</em>' attribute.
	 * @see #getFillImageName()
	 * @generated
	 */
	void setFillImageName(String value);

	/**
	 * Returns the value of the '<em><b>Fill Image Ref Point</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageRefPointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Image Ref Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Image Ref Point</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageRefPointType
	 * @see #isSetFillImageRefPoint()
	 * @see #unsetFillImageRefPoint()
	 * @see #setFillImageRefPoint(FillImageRefPointType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FillImageRefPoint()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fill-image-ref-point' namespace='##targetNamespace'"
	 * @generated
	 */
	FillImageRefPointType getFillImageRefPoint();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPoint <em>Fill Image Ref Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Image Ref Point</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageRefPointType
	 * @see #isSetFillImageRefPoint()
	 * @see #unsetFillImageRefPoint()
	 * @see #getFillImageRefPoint()
	 * @generated
	 */
	void setFillImageRefPoint(FillImageRefPointType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPoint <em>Fill Image Ref Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillImageRefPoint()
	 * @see #getFillImageRefPoint()
	 * @see #setFillImageRefPoint(FillImageRefPointType)
	 * @generated
	 */
	void unsetFillImageRefPoint();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPoint <em>Fill Image Ref Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill Image Ref Point</em>' attribute is set.
	 * @see #unsetFillImageRefPoint()
	 * @see #getFillImageRefPoint()
	 * @see #setFillImageRefPoint(FillImageRefPointType)
	 * @generated
	 */
	boolean isSetFillImageRefPoint();

	/**
	 * Returns the value of the '<em><b>Fill Image Ref Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Image Ref Point X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Image Ref Point X</em>' attribute.
	 * @see #setFillImageRefPointX(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FillImageRefPointX()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='fill-image-ref-point-x' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFillImageRefPointX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPointX <em>Fill Image Ref Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Image Ref Point X</em>' attribute.
	 * @see #getFillImageRefPointX()
	 * @generated
	 */
	void setFillImageRefPointX(String value);

	/**
	 * Returns the value of the '<em><b>Fill Image Ref Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Image Ref Point Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Image Ref Point Y</em>' attribute.
	 * @see #setFillImageRefPointY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FillImageRefPointY()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='fill-image-ref-point-y' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFillImageRefPointY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageRefPointY <em>Fill Image Ref Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Image Ref Point Y</em>' attribute.
	 * @see #getFillImageRefPointY()
	 * @generated
	 */
	void setFillImageRefPointY(String value);

	/**
	 * Returns the value of the '<em><b>Fill Image Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Image Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Image Width</em>' attribute.
	 * @see #setFillImageWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FillImageWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageWidthType"
	 *        extendedMetaData="kind='attribute' name='fill-image-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFillImageWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFillImageWidth <em>Fill Image Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Image Width</em>' attribute.
	 * @see #getFillImageWidth()
	 * @generated
	 */
	void setFillImageWidth(String value);

	/**
	 * Returns the value of the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Name</em>' attribute.
	 * @see #setFilterName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FilterName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='filter-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFilterName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFilterName <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Name</em>' attribute.
	 * @see #getFilterName()
	 * @generated
	 */
	void setFilterName(String value);

	/**
	 * Returns the value of the '<em><b>Fit To Contour</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fit To Contour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fit To Contour</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFitToContour()
	 * @see #unsetFitToContour()
	 * @see #setFitToContour(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FitToContour()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fit-to-contour' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFitToContour();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFitToContour <em>Fit To Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fit To Contour</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFitToContour()
	 * @see #unsetFitToContour()
	 * @see #getFitToContour()
	 * @generated
	 */
	void setFitToContour(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFitToContour <em>Fit To Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFitToContour()
	 * @see #getFitToContour()
	 * @see #setFitToContour(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetFitToContour();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFitToContour <em>Fit To Contour</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fit To Contour</em>' attribute is set.
	 * @see #unsetFitToContour()
	 * @see #getFitToContour()
	 * @see #setFitToContour(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetFitToContour();

	/**
	 * Returns the value of the '<em><b>Fit To Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fit To Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fit To Size</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFitToSize()
	 * @see #unsetFitToSize()
	 * @see #setFitToSize(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FitToSize()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fit-to-size' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFitToSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFitToSize <em>Fit To Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fit To Size</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFitToSize()
	 * @see #unsetFitToSize()
	 * @see #getFitToSize()
	 * @generated
	 */
	void setFitToSize(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFitToSize <em>Fit To Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFitToSize()
	 * @see #getFitToSize()
	 * @see #setFitToSize(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetFitToSize();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFitToSize <em>Fit To Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fit To Size</em>' attribute is set.
	 * @see #unsetFitToSize()
	 * @see #getFitToSize()
	 * @see #setFitToSize(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetFitToSize();

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Formula()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='formula' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

	/**
	 * Returns the value of the '<em><b>Frame Display Border</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Display Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Display Border</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFrameDisplayBorder()
	 * @see #unsetFrameDisplayBorder()
	 * @see #setFrameDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FrameDisplayBorder()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='frame-display-border' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFrameDisplayBorder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameDisplayBorder <em>Frame Display Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Display Border</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFrameDisplayBorder()
	 * @see #unsetFrameDisplayBorder()
	 * @see #getFrameDisplayBorder()
	 * @generated
	 */
	void setFrameDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameDisplayBorder <em>Frame Display Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrameDisplayBorder()
	 * @see #getFrameDisplayBorder()
	 * @see #setFrameDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetFrameDisplayBorder();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameDisplayBorder <em>Frame Display Border</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame Display Border</em>' attribute is set.
	 * @see #unsetFrameDisplayBorder()
	 * @see #getFrameDisplayBorder()
	 * @see #setFrameDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetFrameDisplayBorder();

	/**
	 * Returns the value of the '<em><b>Frame Display Scrollbar</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Display Scrollbar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Display Scrollbar</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFrameDisplayScrollbar()
	 * @see #unsetFrameDisplayScrollbar()
	 * @see #setFrameDisplayScrollbar(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FrameDisplayScrollbar()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='frame-display-scrollbar' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFrameDisplayScrollbar();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameDisplayScrollbar <em>Frame Display Scrollbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Display Scrollbar</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFrameDisplayScrollbar()
	 * @see #unsetFrameDisplayScrollbar()
	 * @see #getFrameDisplayScrollbar()
	 * @generated
	 */
	void setFrameDisplayScrollbar(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameDisplayScrollbar <em>Frame Display Scrollbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrameDisplayScrollbar()
	 * @see #getFrameDisplayScrollbar()
	 * @see #setFrameDisplayScrollbar(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetFrameDisplayScrollbar();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameDisplayScrollbar <em>Frame Display Scrollbar</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame Display Scrollbar</em>' attribute is set.
	 * @see #unsetFrameDisplayScrollbar()
	 * @see #getFrameDisplayScrollbar()
	 * @see #setFrameDisplayScrollbar(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetFrameDisplayScrollbar();

	/**
	 * Returns the value of the '<em><b>Frame Margin Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Margin Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Margin Horizontal</em>' attribute.
	 * @see #setFrameMarginHorizontal(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FrameMarginHorizontal()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativePixelLength"
	 *        extendedMetaData="kind='attribute' name='frame-margin-horizontal' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFrameMarginHorizontal();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameMarginHorizontal <em>Frame Margin Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Margin Horizontal</em>' attribute.
	 * @see #getFrameMarginHorizontal()
	 * @generated
	 */
	void setFrameMarginHorizontal(String value);

	/**
	 * Returns the value of the '<em><b>Frame Margin Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Margin Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Margin Vertical</em>' attribute.
	 * @see #setFrameMarginVertical(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FrameMarginVertical()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativePixelLength"
	 *        extendedMetaData="kind='attribute' name='frame-margin-vertical' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFrameMarginVertical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameMarginVertical <em>Frame Margin Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Margin Vertical</em>' attribute.
	 * @see #getFrameMarginVertical()
	 * @generated
	 */
	void setFrameMarginVertical(String value);

	/**
	 * Returns the value of the '<em><b>Frame Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Name</em>' attribute.
	 * @see #setFrameName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_FrameName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='frame-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFrameName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getFrameName <em>Frame Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Name</em>' attribute.
	 * @see #getFrameName()
	 * @generated
	 */
	void setFrameName(String value);

	/**
	 * Returns the value of the '<em><b>Gamma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gamma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamma</em>' attribute.
	 * @see #setGamma(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Gamma()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='gamma' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGamma();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGamma <em>Gamma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma</em>' attribute.
	 * @see #getGamma()
	 * @generated
	 */
	void setGamma(String value);

	/**
	 * Returns the value of the '<em><b>Glue Point Leaving Directions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue Point Leaving Directions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue Point Leaving Directions</em>' attribute.
	 * @see #setGluePointLeavingDirections(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_GluePointLeavingDirections()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='glue-point-leaving-directions' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getGluePointLeavingDirections();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePointLeavingDirections <em>Glue Point Leaving Directions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue Point Leaving Directions</em>' attribute.
	 * @see #getGluePointLeavingDirections()
	 * @generated
	 */
	void setGluePointLeavingDirections(Object value);

	/**
	 * Returns the value of the '<em><b>Glue Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue Points</em>' attribute.
	 * @see #setGluePoints(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_GluePoints()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='glue-points' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGluePoints();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePoints <em>Glue Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue Points</em>' attribute.
	 * @see #getGluePoints()
	 * @generated
	 */
	void setGluePoints(String value);

	/**
	 * Returns the value of the '<em><b>Glue Point Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue Point Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue Point Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType
	 * @see #isSetGluePointType()
	 * @see #unsetGluePointType()
	 * @see #setGluePointType(GluePointTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_GluePointType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='glue-point-type' namespace='##targetNamespace'"
	 * @generated
	 */
	GluePointTypeType getGluePointType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePointType <em>Glue Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue Point Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType
	 * @see #isSetGluePointType()
	 * @see #unsetGluePointType()
	 * @see #getGluePointType()
	 * @generated
	 */
	void setGluePointType(GluePointTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePointType <em>Glue Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGluePointType()
	 * @see #getGluePointType()
	 * @see #setGluePointType(GluePointTypeType)
	 * @generated
	 */
	void unsetGluePointType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGluePointType <em>Glue Point Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Glue Point Type</em>' attribute is set.
	 * @see #unsetGluePointType()
	 * @see #getGluePointType()
	 * @see #setGluePointType(GluePointTypeType)
	 * @generated
	 */
	boolean isSetGluePointType();

	/**
	 * Returns the value of the '<em><b>Gradient Step Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient Step Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient Step Count</em>' attribute.
	 * @see #setGradientStepCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_GradientStepCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='gradient-step-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getGradientStepCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGradientStepCount <em>Gradient Step Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Step Count</em>' attribute.
	 * @see #getGradientStepCount()
	 * @generated
	 */
	void setGradientStepCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Green()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='green' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGreen();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(String value);

	/**
	 * Returns the value of the '<em><b>Guide Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guide Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guide Distance</em>' attribute.
	 * @see #setGuideDistance(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_GuideDistance()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Distance"
	 *        extendedMetaData="kind='attribute' name='guide-distance' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGuideDistance();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGuideDistance <em>Guide Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guide Distance</em>' attribute.
	 * @see #getGuideDistance()
	 * @generated
	 */
	void setGuideDistance(String value);

	/**
	 * Returns the value of the '<em><b>Guide Overhang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guide Overhang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guide Overhang</em>' attribute.
	 * @see #setGuideOverhang(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_GuideOverhang()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='guide-overhang' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGuideOverhang();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getGuideOverhang <em>Guide Overhang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guide Overhang</em>' attribute.
	 * @see #getGuideOverhang()
	 * @generated
	 */
	void setGuideOverhang(String value);

	/**
	 * Returns the value of the '<em><b>Handle Mirror Horizontal</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Mirror Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Mirror Horizontal</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHandleMirrorHorizontal()
	 * @see #unsetHandleMirrorHorizontal()
	 * @see #setHandleMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_HandleMirrorHorizontal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='handle-mirror-horizontal' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHandleMirrorHorizontal();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleMirrorHorizontal <em>Handle Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Mirror Horizontal</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHandleMirrorHorizontal()
	 * @see #unsetHandleMirrorHorizontal()
	 * @see #getHandleMirrorHorizontal()
	 * @generated
	 */
	void setHandleMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleMirrorHorizontal <em>Handle Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHandleMirrorHorizontal()
	 * @see #getHandleMirrorHorizontal()
	 * @see #setHandleMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetHandleMirrorHorizontal();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleMirrorHorizontal <em>Handle Mirror Horizontal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Handle Mirror Horizontal</em>' attribute is set.
	 * @see #unsetHandleMirrorHorizontal()
	 * @see #getHandleMirrorHorizontal()
	 * @see #setHandleMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetHandleMirrorHorizontal();

	/**
	 * Returns the value of the '<em><b>Handle Mirror Vertical</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Mirror Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Mirror Vertical</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHandleMirrorVertical()
	 * @see #unsetHandleMirrorVertical()
	 * @see #setHandleMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_HandleMirrorVertical()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='handle-mirror-vertical' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHandleMirrorVertical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleMirrorVertical <em>Handle Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Mirror Vertical</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHandleMirrorVertical()
	 * @see #unsetHandleMirrorVertical()
	 * @see #getHandleMirrorVertical()
	 * @generated
	 */
	void setHandleMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleMirrorVertical <em>Handle Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHandleMirrorVertical()
	 * @see #getHandleMirrorVertical()
	 * @see #setHandleMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetHandleMirrorVertical();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleMirrorVertical <em>Handle Mirror Vertical</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Handle Mirror Vertical</em>' attribute is set.
	 * @see #unsetHandleMirrorVertical()
	 * @see #getHandleMirrorVertical()
	 * @see #setHandleMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetHandleMirrorVertical();

	/**
	 * Returns the value of the '<em><b>Handle Polar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Polar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Polar</em>' attribute.
	 * @see #setHandlePolar(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_HandlePolar()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-polar' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandlePolar();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandlePolar <em>Handle Polar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Polar</em>' attribute.
	 * @see #getHandlePolar()
	 * @generated
	 */
	void setHandlePolar(String value);

	/**
	 * Returns the value of the '<em><b>Handle Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Position</em>' attribute.
	 * @see #setHandlePosition(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_HandlePosition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-position' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandlePosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandlePosition <em>Handle Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Position</em>' attribute.
	 * @see #getHandlePosition()
	 * @generated
	 */
	void setHandlePosition(String value);

	/**
	 * Returns the value of the '<em><b>Handle Radius Range Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Radius Range Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Radius Range Maximum</em>' attribute.
	 * @see #setHandleRadiusRangeMaximum(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_HandleRadiusRangeMaximum()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-radius-range-maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandleRadiusRangeMaximum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRadiusRangeMaximum <em>Handle Radius Range Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Radius Range Maximum</em>' attribute.
	 * @see #getHandleRadiusRangeMaximum()
	 * @generated
	 */
	void setHandleRadiusRangeMaximum(String value);

	/**
	 * Returns the value of the '<em><b>Handle Radius Range Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Radius Range Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Radius Range Minimum</em>' attribute.
	 * @see #setHandleRadiusRangeMinimum(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_HandleRadiusRangeMinimum()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-radius-range-minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandleRadiusRangeMinimum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRadiusRangeMinimum <em>Handle Radius Range Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Radius Range Minimum</em>' attribute.
	 * @see #getHandleRadiusRangeMinimum()
	 * @generated
	 */
	void setHandleRadiusRangeMinimum(String value);

	/**
	 * Returns the value of the '<em><b>Handle Range XMaximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Range XMaximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Range XMaximum</em>' attribute.
	 * @see #setHandleRangeXMaximum(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_HandleRangeXMaximum()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-range-x-maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandleRangeXMaximum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeXMaximum <em>Handle Range XMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Range XMaximum</em>' attribute.
	 * @see #getHandleRangeXMaximum()
	 * @generated
	 */
	void setHandleRangeXMaximum(String value);

	/**
	 * Returns the value of the '<em><b>Handle Range XMinimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Range XMinimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Range XMinimum</em>' attribute.
	 * @see #setHandleRangeXMinimum(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_HandleRangeXMinimum()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-range-x-minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandleRangeXMinimum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeXMinimum <em>Handle Range XMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Range XMinimum</em>' attribute.
	 * @see #getHandleRangeXMinimum()
	 * @generated
	 */
	void setHandleRangeXMinimum(String value);

	/**
	 * Returns the value of the '<em><b>Handle Range YMaximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Range YMaximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Range YMaximum</em>' attribute.
	 * @see #setHandleRangeYMaximum(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_HandleRangeYMaximum()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-range-y-maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandleRangeYMaximum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeYMaximum <em>Handle Range YMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Range YMaximum</em>' attribute.
	 * @see #getHandleRangeYMaximum()
	 * @generated
	 */
	void setHandleRangeYMaximum(String value);

	/**
	 * Returns the value of the '<em><b>Handle Range YMinimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Range YMinimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Range YMinimum</em>' attribute.
	 * @see #setHandleRangeYMinimum(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_HandleRangeYMinimum()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-range-y-minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandleRangeYMinimum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleRangeYMinimum <em>Handle Range YMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Range YMinimum</em>' attribute.
	 * @see #getHandleRangeYMinimum()
	 * @generated
	 */
	void setHandleRangeYMinimum(String value);

	/**
	 * Returns the value of the '<em><b>Handle Switched</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Switched</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Switched</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHandleSwitched()
	 * @see #unsetHandleSwitched()
	 * @see #setHandleSwitched(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_HandleSwitched()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='handle-switched' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHandleSwitched();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleSwitched <em>Handle Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Switched</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHandleSwitched()
	 * @see #unsetHandleSwitched()
	 * @see #getHandleSwitched()
	 * @generated
	 */
	void setHandleSwitched(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleSwitched <em>Handle Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHandleSwitched()
	 * @see #getHandleSwitched()
	 * @see #setHandleSwitched(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetHandleSwitched();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getHandleSwitched <em>Handle Switched</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Handle Switched</em>' attribute is set.
	 * @see #unsetHandleSwitched()
	 * @see #getHandleSwitched()
	 * @see #setHandleSwitched(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetHandleSwitched();

	/**
	 * Returns the value of the '<em><b>Image Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Opacity</em>' attribute.
	 * @see #setImageOpacity(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ImageOpacity()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='image-opacity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImageOpacity();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getImageOpacity <em>Image Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Opacity</em>' attribute.
	 * @see #getImageOpacity()
	 * @generated
	 */
	void setImageOpacity(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(KindType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Kind()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='kind' namespace='##targetNamespace'"
	 * @generated
	 */
	KindType getKind();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.KindType
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(KindType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(KindType)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(KindType)
	 * @generated
	 */
	boolean isSetKind();

	/**
	 * Returns the value of the '<em><b>Layer1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer1</em>' attribute.
	 * @see #setLayer1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Layer1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='layer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLayer1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLayer1 <em>Layer1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer1</em>' attribute.
	 * @see #getLayer1()
	 * @generated
	 */
	void setLayer1(String value);

	/**
	 * Returns the value of the '<em><b>Line Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Distance</em>' attribute.
	 * @see #setLineDistance(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_LineDistance()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Distance"
	 *        extendedMetaData="kind='attribute' name='line-distance' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLineDistance();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLineDistance <em>Line Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Distance</em>' attribute.
	 * @see #getLineDistance()
	 * @generated
	 */
	void setLineDistance(String value);

	/**
	 * Returns the value of the '<em><b>Line Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Skew</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Skew</em>' attribute.
	 * @see #setLineSkew(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_LineSkew()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.LineSkewType" many="false"
	 *        extendedMetaData="kind='attribute' name='line-skew' namespace='##targetNamespace'"
	 * @generated
	 */
	List getLineSkew();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLineSkew <em>Line Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Skew</em>' attribute.
	 * @see #getLineSkew()
	 * @generated
	 */
	void setLineSkew(List value);

	/**
	 * Returns the value of the '<em><b>Luminance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminance</em>' attribute.
	 * @see #setLuminance(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Luminance()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='luminance' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLuminance();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getLuminance <em>Luminance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminance</em>' attribute.
	 * @see #getLuminance()
	 * @generated
	 */
	void setLuminance(String value);

	/**
	 * Returns the value of the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker End</em>' attribute.
	 * @see #setMarkerEnd(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MarkerEnd()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerEndType"
	 *        extendedMetaData="kind='attribute' name='marker-end' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMarkerEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEnd <em>Marker End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker End</em>' attribute.
	 * @see #getMarkerEnd()
	 * @generated
	 */
	void setMarkerEnd(String value);

	/**
	 * Returns the value of the '<em><b>Marker End Center</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker End Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker End Center</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMarkerEndCenter()
	 * @see #unsetMarkerEndCenter()
	 * @see #setMarkerEndCenter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MarkerEndCenter()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='marker-end-center' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMarkerEndCenter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEndCenter <em>Marker End Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker End Center</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMarkerEndCenter()
	 * @see #unsetMarkerEndCenter()
	 * @see #getMarkerEndCenter()
	 * @generated
	 */
	void setMarkerEndCenter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEndCenter <em>Marker End Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarkerEndCenter()
	 * @see #getMarkerEndCenter()
	 * @see #setMarkerEndCenter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMarkerEndCenter();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEndCenter <em>Marker End Center</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marker End Center</em>' attribute is set.
	 * @see #unsetMarkerEndCenter()
	 * @see #getMarkerEndCenter()
	 * @see #setMarkerEndCenter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMarkerEndCenter();

	/**
	 * Returns the value of the '<em><b>Marker End Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker End Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker End Width</em>' attribute.
	 * @see #setMarkerEndWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MarkerEndWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='marker-end-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMarkerEndWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerEndWidth <em>Marker End Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker End Width</em>' attribute.
	 * @see #getMarkerEndWidth()
	 * @generated
	 */
	void setMarkerEndWidth(String value);

	/**
	 * Returns the value of the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker Start</em>' attribute.
	 * @see #setMarkerStart(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MarkerStart()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerStartType"
	 *        extendedMetaData="kind='attribute' name='marker-start' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMarkerStart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStart <em>Marker Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Start</em>' attribute.
	 * @see #getMarkerStart()
	 * @generated
	 */
	void setMarkerStart(String value);

	/**
	 * Returns the value of the '<em><b>Marker Start Center</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker Start Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker Start Center</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMarkerStartCenter()
	 * @see #unsetMarkerStartCenter()
	 * @see #setMarkerStartCenter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MarkerStartCenter()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='marker-start-center' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMarkerStartCenter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStartCenter <em>Marker Start Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Start Center</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMarkerStartCenter()
	 * @see #unsetMarkerStartCenter()
	 * @see #getMarkerStartCenter()
	 * @generated
	 */
	void setMarkerStartCenter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStartCenter <em>Marker Start Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarkerStartCenter()
	 * @see #getMarkerStartCenter()
	 * @see #setMarkerStartCenter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMarkerStartCenter();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStartCenter <em>Marker Start Center</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marker Start Center</em>' attribute is set.
	 * @see #unsetMarkerStartCenter()
	 * @see #getMarkerStartCenter()
	 * @see #setMarkerStartCenter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMarkerStartCenter();

	/**
	 * Returns the value of the '<em><b>Marker Start Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker Start Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker Start Width</em>' attribute.
	 * @see #setMarkerStartWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MarkerStartWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='marker-start-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMarkerStartWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMarkerStartWidth <em>Marker Start Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Start Width</em>' attribute.
	 * @see #getMarkerStartWidth()
	 * @generated
	 */
	void setMarkerStartWidth(String value);

	/**
	 * Returns the value of the '<em><b>Master Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Page Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Page Name</em>' attribute.
	 * @see #setMasterPageName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MasterPageName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.MasterPageNameType"
	 *        extendedMetaData="kind='attribute' name='master-page-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMasterPageName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMasterPageName <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Page Name</em>' attribute.
	 * @see #getMasterPageName()
	 * @generated
	 */
	void setMasterPageName(String value);

	/**
	 * Returns the value of the '<em><b>May Script</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>May Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Script</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMayScript()
	 * @see #unsetMayScript()
	 * @see #setMayScript(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MayScript()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='may-script' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMayScript();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMayScript <em>May Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>May Script</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMayScript()
	 * @see #unsetMayScript()
	 * @see #getMayScript()
	 * @generated
	 */
	void setMayScript(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMayScript <em>May Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMayScript()
	 * @see #getMayScript()
	 * @see #setMayScript(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMayScript();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMayScript <em>May Script</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>May Script</em>' attribute is set.
	 * @see #unsetMayScript()
	 * @see #getMayScript()
	 * @see #setMayScript(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMayScript();

	/**
	 * Returns the value of the '<em><b>Measure Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureAlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureAlignType
	 * @see #isSetMeasureAlign()
	 * @see #unsetMeasureAlign()
	 * @see #setMeasureAlign(MeasureAlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MeasureAlign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='measure-align' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureAlignType getMeasureAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasureAlign <em>Measure Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureAlignType
	 * @see #isSetMeasureAlign()
	 * @see #unsetMeasureAlign()
	 * @see #getMeasureAlign()
	 * @generated
	 */
	void setMeasureAlign(MeasureAlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasureAlign <em>Measure Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMeasureAlign()
	 * @see #getMeasureAlign()
	 * @see #setMeasureAlign(MeasureAlignType)
	 * @generated
	 */
	void unsetMeasureAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasureAlign <em>Measure Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Measure Align</em>' attribute is set.
	 * @see #unsetMeasureAlign()
	 * @see #getMeasureAlign()
	 * @see #setMeasureAlign(MeasureAlignType)
	 * @generated
	 */
	boolean isSetMeasureAlign();

	/**
	 * Returns the value of the '<em><b>Measure Vertical Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureVerticalAlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Vertical Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Vertical Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureVerticalAlignType
	 * @see #isSetMeasureVerticalAlign()
	 * @see #unsetMeasureVerticalAlign()
	 * @see #setMeasureVerticalAlign(MeasureVerticalAlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MeasureVerticalAlign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='measure-vertical-align' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureVerticalAlignType getMeasureVerticalAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasureVerticalAlign <em>Measure Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Vertical Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureVerticalAlignType
	 * @see #isSetMeasureVerticalAlign()
	 * @see #unsetMeasureVerticalAlign()
	 * @see #getMeasureVerticalAlign()
	 * @generated
	 */
	void setMeasureVerticalAlign(MeasureVerticalAlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasureVerticalAlign <em>Measure Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMeasureVerticalAlign()
	 * @see #getMeasureVerticalAlign()
	 * @see #setMeasureVerticalAlign(MeasureVerticalAlignType)
	 * @generated
	 */
	void unsetMeasureVerticalAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMeasureVerticalAlign <em>Measure Vertical Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Measure Vertical Align</em>' attribute is set.
	 * @see #unsetMeasureVerticalAlign()
	 * @see #getMeasureVerticalAlign()
	 * @see #setMeasureVerticalAlign(MeasureVerticalAlignType)
	 * @generated
	 */
	boolean isSetMeasureVerticalAlign();

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MimeType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='mime-type' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMimeType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(Object value);

	/**
	 * Returns the value of the '<em><b>Mirror Horizontal</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mirror Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mirror Horizontal</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMirrorHorizontal()
	 * @see #unsetMirrorHorizontal()
	 * @see #setMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MirrorHorizontal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mirror-horizontal' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMirrorHorizontal();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMirrorHorizontal <em>Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mirror Horizontal</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMirrorHorizontal()
	 * @see #unsetMirrorHorizontal()
	 * @see #getMirrorHorizontal()
	 * @generated
	 */
	void setMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMirrorHorizontal <em>Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMirrorHorizontal()
	 * @see #getMirrorHorizontal()
	 * @see #setMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMirrorHorizontal();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMirrorHorizontal <em>Mirror Horizontal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mirror Horizontal</em>' attribute is set.
	 * @see #unsetMirrorHorizontal()
	 * @see #getMirrorHorizontal()
	 * @see #setMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMirrorHorizontal();

	/**
	 * Returns the value of the '<em><b>Mirror Vertical</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mirror Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mirror Vertical</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMirrorVertical()
	 * @see #unsetMirrorVertical()
	 * @see #setMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_MirrorVertical()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mirror-vertical' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMirrorVertical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMirrorVertical <em>Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mirror Vertical</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMirrorVertical()
	 * @see #unsetMirrorVertical()
	 * @see #getMirrorVertical()
	 * @generated
	 */
	void setMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMirrorVertical <em>Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMirrorVertical()
	 * @see #getMirrorVertical()
	 * @see #setMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMirrorVertical();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getMirrorVertical <em>Mirror Vertical</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mirror Vertical</em>' attribute is set.
	 * @see #unsetMirrorVertical()
	 * @see #getMirrorVertical()
	 * @see #setMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMirrorVertical();

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute.
	 * @see #setModifiers(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Modifiers()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='modifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModifiers();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getModifiers <em>Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifiers</em>' attribute.
	 * @see #getModifiers()
	 * @generated
	 */
	void setModifiers(String value);

	/**
	 * Returns the value of the '<em><b>Nav Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nav Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nav Order</em>' attribute.
	 * @see #setNavOrder(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_NavOrder()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='nav-order' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getNavOrder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNavOrder <em>Nav Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nav Order</em>' attribute.
	 * @see #getNavOrder()
	 * @generated
	 */
	void setNavOrder(List<String> value);

	/**
	 * Returns the value of the '<em><b>Nohref</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.NohrefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nohref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nohref</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.NohrefType
	 * @see #isSetNohref()
	 * @see #unsetNohref()
	 * @see #setNohref(NohrefType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Nohref()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='nohref' namespace='##targetNamespace'"
	 * @generated
	 */
	NohrefType getNohref();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNohref <em>Nohref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nohref</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.NohrefType
	 * @see #isSetNohref()
	 * @see #unsetNohref()
	 * @see #getNohref()
	 * @generated
	 */
	void setNohref(NohrefType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNohref <em>Nohref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNohref()
	 * @see #getNohref()
	 * @see #setNohref(NohrefType)
	 * @generated
	 */
	void unsetNohref();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNohref <em>Nohref</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nohref</em>' attribute is set.
	 * @see #unsetNohref()
	 * @see #getNohref()
	 * @see #setNohref(NohrefType)
	 * @generated
	 */
	boolean isSetNohref();

	/**
	 * Returns the value of the '<em><b>Notify On Update Of Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notify On Update Of Ranges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notify On Update Of Ranges</em>' attribute.
	 * @see #setNotifyOnUpdateOfRanges(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_NotifyOnUpdateOfRanges()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='notify-on-update-of-ranges' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNotifyOnUpdateOfRanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getNotifyOnUpdateOfRanges <em>Notify On Update Of Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notify On Update Of Ranges</em>' attribute.
	 * @see #getNotifyOnUpdateOfRanges()
	 * @generated
	 */
	void setNotifyOnUpdateOfRanges(String value);

	/**
	 * Returns the value of the '<em><b>Object1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object1</em>' attribute.
	 * @see #setObject1(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Object1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='object' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getObject1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getObject1 <em>Object1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object1</em>' attribute.
	 * @see #getObject1()
	 * @generated
	 */
	void setObject1(Object value);

	/**
	 * Returns the value of the '<em><b>Ole Draw Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ole Draw Aspect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ole Draw Aspect</em>' attribute.
	 * @see #setOleDrawAspect(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_OleDrawAspect()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='ole-draw-aspect' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOleDrawAspect();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOleDrawAspect <em>Ole Draw Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ole Draw Aspect</em>' attribute.
	 * @see #getOleDrawAspect()
	 * @generated
	 */
	void setOleDrawAspect(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Opacity1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opacity1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity1</em>' attribute.
	 * @see #setOpacity1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Opacity1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='opacity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOpacity1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOpacity1 <em>Opacity1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity1</em>' attribute.
	 * @see #getOpacity1()
	 * @generated
	 */
	void setOpacity1(String value);

	/**
	 * Returns the value of the '<em><b>Opacity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opacity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity Name</em>' attribute.
	 * @see #setOpacityName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_OpacityName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityNameType"
	 *        extendedMetaData="kind='attribute' name='opacity-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOpacityName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getOpacityName <em>Opacity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity Name</em>' attribute.
	 * @see #getOpacityName()
	 * @generated
	 */
	void setOpacityName(String value);

	/**
	 * Returns the value of the '<em><b>Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Number</em>' attribute.
	 * @see #setPageNumber(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_PageNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='page-number' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPageNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPageNumber <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Number</em>' attribute.
	 * @see #getPageNumber()
	 * @generated
	 */
	void setPageNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetParallel()
	 * @see #unsetParallel()
	 * @see #setParallel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Parallel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='parallel' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getParallel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getParallel <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetParallel()
	 * @see #unsetParallel()
	 * @see #getParallel()
	 * @generated
	 */
	void setParallel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getParallel <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParallel()
	 * @see #getParallel()
	 * @see #setParallel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetParallel();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getParallel <em>Parallel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parallel</em>' attribute is set.
	 * @see #unsetParallel()
	 * @see #getParallel()
	 * @see #setParallel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetParallel();

	/**
	 * Returns the value of the '<em><b>Path Stretchpoint X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Stretchpoint X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Stretchpoint X</em>' attribute.
	 * @see #isSetPathStretchpointX()
	 * @see #unsetPathStretchpointX()
	 * @see #setPathStretchpointX(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_PathStretchpointX()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='path-stretchpoint-x' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPathStretchpointX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPathStretchpointX <em>Path Stretchpoint X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Stretchpoint X</em>' attribute.
	 * @see #isSetPathStretchpointX()
	 * @see #unsetPathStretchpointX()
	 * @see #getPathStretchpointX()
	 * @generated
	 */
	void setPathStretchpointX(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPathStretchpointX <em>Path Stretchpoint X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPathStretchpointX()
	 * @see #getPathStretchpointX()
	 * @see #setPathStretchpointX(double)
	 * @generated
	 */
	void unsetPathStretchpointX();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPathStretchpointX <em>Path Stretchpoint X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Path Stretchpoint X</em>' attribute is set.
	 * @see #unsetPathStretchpointX()
	 * @see #getPathStretchpointX()
	 * @see #setPathStretchpointX(double)
	 * @generated
	 */
	boolean isSetPathStretchpointX();

	/**
	 * Returns the value of the '<em><b>Path Stretchpoint Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Stretchpoint Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Stretchpoint Y</em>' attribute.
	 * @see #isSetPathStretchpointY()
	 * @see #unsetPathStretchpointY()
	 * @see #setPathStretchpointY(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_PathStretchpointY()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='path-stretchpoint-y' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPathStretchpointY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPathStretchpointY <em>Path Stretchpoint Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Stretchpoint Y</em>' attribute.
	 * @see #isSetPathStretchpointY()
	 * @see #unsetPathStretchpointY()
	 * @see #getPathStretchpointY()
	 * @generated
	 */
	void setPathStretchpointY(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPathStretchpointY <em>Path Stretchpoint Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPathStretchpointY()
	 * @see #getPathStretchpointY()
	 * @see #setPathStretchpointY(double)
	 * @generated
	 */
	void unsetPathStretchpointY();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPathStretchpointY <em>Path Stretchpoint Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Path Stretchpoint Y</em>' attribute is set.
	 * @see #unsetPathStretchpointY()
	 * @see #getPathStretchpointY()
	 * @see #setPathStretchpointY(double)
	 * @generated
	 */
	boolean isSetPathStretchpointY();

	/**
	 * Returns the value of the '<em><b>Placing</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PlacingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placing</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PlacingType
	 * @see #isSetPlacing()
	 * @see #unsetPlacing()
	 * @see #setPlacing(PlacingType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Placing()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='placing' namespace='##targetNamespace'"
	 * @generated
	 */
	PlacingType getPlacing();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPlacing <em>Placing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placing</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PlacingType
	 * @see #isSetPlacing()
	 * @see #unsetPlacing()
	 * @see #getPlacing()
	 * @generated
	 */
	void setPlacing(PlacingType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPlacing <em>Placing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlacing()
	 * @see #getPlacing()
	 * @see #setPlacing(PlacingType)
	 * @generated
	 */
	void unsetPlacing();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPlacing <em>Placing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Placing</em>' attribute is set.
	 * @see #unsetPlacing()
	 * @see #getPlacing()
	 * @see #setPlacing(PlacingType)
	 * @generated
	 */
	boolean isSetPlacing();

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Points()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Points"
	 *        extendedMetaData="kind='attribute' name='points' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPoints();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(String value);

	/**
	 * Returns the value of the '<em><b>Protected</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetProtected()
	 * @see #unsetProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Protected()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='protected' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtected();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetProtected()
	 * @see #unsetProtected()
	 * @see #getProtected()
	 * @generated
	 */
	void setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtected()
	 * @see #getProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetProtected();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getProtected <em>Protected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protected</em>' attribute is set.
	 * @see #unsetProtected()
	 * @see #getProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetProtected();

	/**
	 * Returns the value of the '<em><b>Recreate On Edit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recreate On Edit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recreate On Edit</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRecreateOnEdit()
	 * @see #unsetRecreateOnEdit()
	 * @see #setRecreateOnEdit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_RecreateOnEdit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='recreate-on-edit' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRecreateOnEdit();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRecreateOnEdit <em>Recreate On Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recreate On Edit</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRecreateOnEdit()
	 * @see #unsetRecreateOnEdit()
	 * @see #getRecreateOnEdit()
	 * @generated
	 */
	void setRecreateOnEdit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRecreateOnEdit <em>Recreate On Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecreateOnEdit()
	 * @see #getRecreateOnEdit()
	 * @see #setRecreateOnEdit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetRecreateOnEdit();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRecreateOnEdit <em>Recreate On Edit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Recreate On Edit</em>' attribute is set.
	 * @see #unsetRecreateOnEdit()
	 * @see #getRecreateOnEdit()
	 * @see #setRecreateOnEdit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetRecreateOnEdit();

	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Red()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='red' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(String value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Rotation()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRotation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Secondary Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Fill Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Fill Color</em>' attribute.
	 * @see #setSecondaryFillColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_SecondaryFillColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='secondary-fill-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecondaryFillColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getSecondaryFillColor <em>Secondary Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Fill Color</em>' attribute.
	 * @see #getSecondaryFillColor()
	 * @generated
	 */
	void setSecondaryFillColor(String value);

	/**
	 * Returns the value of the '<em><b>Shadow</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ShadowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ShadowType
	 * @see #isSetShadow()
	 * @see #unsetShadow()
	 * @see #setShadow(ShadowType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Shadow()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shadow' namespace='##targetNamespace'"
	 * @generated
	 */
	ShadowType getShadow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadow <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ShadowType
	 * @see #isSetShadow()
	 * @see #unsetShadow()
	 * @see #getShadow()
	 * @generated
	 */
	void setShadow(ShadowType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadow <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShadow()
	 * @see #getShadow()
	 * @see #setShadow(ShadowType)
	 * @generated
	 */
	void unsetShadow();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadow <em>Shadow</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shadow</em>' attribute is set.
	 * @see #unsetShadow()
	 * @see #getShadow()
	 * @see #setShadow(ShadowType)
	 * @generated
	 */
	boolean isSetShadow();

	/**
	 * Returns the value of the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Color</em>' attribute.
	 * @see #setShadowColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ShadowColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='shadow-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShadowColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowColor <em>Shadow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Color</em>' attribute.
	 * @see #getShadowColor()
	 * @generated
	 */
	void setShadowColor(String value);

	/**
	 * Returns the value of the '<em><b>Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow Offset X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Offset X</em>' attribute.
	 * @see #setShadowOffsetX(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ShadowOffsetX()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='shadow-offset-x' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShadowOffsetX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowOffsetX <em>Shadow Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Offset X</em>' attribute.
	 * @see #getShadowOffsetX()
	 * @generated
	 */
	void setShadowOffsetX(String value);

	/**
	 * Returns the value of the '<em><b>Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow Offset Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Offset Y</em>' attribute.
	 * @see #setShadowOffsetY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ShadowOffsetY()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='shadow-offset-y' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShadowOffsetY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowOffsetY <em>Shadow Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Offset Y</em>' attribute.
	 * @see #getShadowOffsetY()
	 * @generated
	 */
	void setShadowOffsetY(String value);

	/**
	 * Returns the value of the '<em><b>Shadow Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Opacity</em>' attribute.
	 * @see #setShadowOpacity(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ShadowOpacity()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='shadow-opacity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShadowOpacity();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShadowOpacity <em>Shadow Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Opacity</em>' attribute.
	 * @see #getShadowOpacity()
	 * @generated
	 */
	void setShadowOpacity(String value);

	/**
	 * Returns the value of the '<em><b>Shape Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Id</em>' attribute.
	 * @see #setShapeId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ShapeId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='shape-id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShapeId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShapeId <em>Shape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Id</em>' attribute.
	 * @see #getShapeId()
	 * @generated
	 */
	void setShapeId(String value);

	/**
	 * Returns the value of the '<em><b>Sharpness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sharpness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sharpness</em>' attribute.
	 * @see #setSharpness(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Sharpness()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='sharpness' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSharpness();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getSharpness <em>Sharpness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharpness</em>' attribute.
	 * @see #getSharpness()
	 * @generated
	 */
	void setSharpness(String value);

	/**
	 * Returns the value of the '<em><b>Show Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Unit</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowUnit()
	 * @see #unsetShowUnit()
	 * @see #setShowUnit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ShowUnit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show-unit' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowUnit();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShowUnit <em>Show Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Unit</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowUnit()
	 * @see #unsetShowUnit()
	 * @see #getShowUnit()
	 * @generated
	 */
	void setShowUnit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShowUnit <em>Show Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowUnit()
	 * @see #getShowUnit()
	 * @see #setShowUnit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetShowUnit();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getShowUnit <em>Show Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show Unit</em>' attribute is set.
	 * @see #unsetShowUnit()
	 * @see #getShowUnit()
	 * @see #setShowUnit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetShowUnit();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Start()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

	/**
	 * Returns the value of the '<em><b>Start Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Angle</em>' attribute.
	 * @see #isSetStartAngle()
	 * @see #unsetStartAngle()
	 * @see #setStartAngle(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StartAngle()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='start-angle' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStartAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartAngle <em>Start Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Angle</em>' attribute.
	 * @see #isSetStartAngle()
	 * @see #unsetStartAngle()
	 * @see #getStartAngle()
	 * @generated
	 */
	void setStartAngle(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartAngle <em>Start Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartAngle()
	 * @see #getStartAngle()
	 * @see #setStartAngle(double)
	 * @generated
	 */
	void unsetStartAngle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartAngle <em>Start Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Angle</em>' attribute is set.
	 * @see #unsetStartAngle()
	 * @see #getStartAngle()
	 * @see #setStartAngle(double)
	 * @generated
	 */
	boolean isSetStartAngle();

	/**
	 * Returns the value of the '<em><b>Start Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Color</em>' attribute.
	 * @see #setStartColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StartColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='start-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartColor <em>Start Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Color</em>' attribute.
	 * @see #getStartColor()
	 * @generated
	 */
	void setStartColor(String value);

	/**
	 * Returns the value of the '<em><b>Start Glue Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Glue Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Glue Point</em>' attribute.
	 * @see #setStartGluePoint(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StartGluePoint()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='start-glue-point' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartGluePoint();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartGluePoint <em>Start Glue Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Glue Point</em>' attribute.
	 * @see #getStartGluePoint()
	 * @generated
	 */
	void setStartGluePoint(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start Guide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Guide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Guide</em>' attribute.
	 * @see #setStartGuide(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StartGuide()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='start-guide' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartGuide();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartGuide <em>Start Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Guide</em>' attribute.
	 * @see #getStartGuide()
	 * @generated
	 */
	void setStartGuide(String value);

	/**
	 * Returns the value of the '<em><b>Start Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Intensity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Intensity</em>' attribute.
	 * @see #setStartIntensity(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StartIntensity()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='start-intensity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartIntensity();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartIntensity <em>Start Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Intensity</em>' attribute.
	 * @see #getStartIntensity()
	 * @generated
	 */
	void setStartIntensity(String value);

	/**
	 * Returns the value of the '<em><b>Start Line Spacing Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Line Spacing Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Line Spacing Horizontal</em>' attribute.
	 * @see #setStartLineSpacingHorizontal(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StartLineSpacingHorizontal()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Distance"
	 *        extendedMetaData="kind='attribute' name='start-line-spacing-horizontal' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartLineSpacingHorizontal();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartLineSpacingHorizontal <em>Start Line Spacing Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Line Spacing Horizontal</em>' attribute.
	 * @see #getStartLineSpacingHorizontal()
	 * @generated
	 */
	void setStartLineSpacingHorizontal(String value);

	/**
	 * Returns the value of the '<em><b>Start Line Spacing Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Line Spacing Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Line Spacing Vertical</em>' attribute.
	 * @see #setStartLineSpacingVertical(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StartLineSpacingVertical()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Distance"
	 *        extendedMetaData="kind='attribute' name='start-line-spacing-vertical' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartLineSpacingVertical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartLineSpacingVertical <em>Start Line Spacing Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Line Spacing Vertical</em>' attribute.
	 * @see #getStartLineSpacingVertical()
	 * @generated
	 */
	void setStartLineSpacingVertical(String value);

	/**
	 * Returns the value of the '<em><b>Start Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Shape</em>' attribute.
	 * @see #setStartShape(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StartShape()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='start-shape' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartShape();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStartShape <em>Start Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Shape</em>' attribute.
	 * @see #getStartShape()
	 * @generated
	 */
	void setStartShape(String value);

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeType
	 * @see #isSetStroke()
	 * @see #unsetStroke()
	 * @see #setStroke(StrokeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Stroke()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='stroke' namespace='##targetNamespace'"
	 * @generated
	 */
	StrokeType getStroke();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeType
	 * @see #isSetStroke()
	 * @see #unsetStroke()
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(StrokeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStroke()
	 * @see #getStroke()
	 * @see #setStroke(StrokeType)
	 * @generated
	 */
	void unsetStroke();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStroke <em>Stroke</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke</em>' attribute is set.
	 * @see #unsetStroke()
	 * @see #getStroke()
	 * @see #setStroke(StrokeType)
	 * @generated
	 */
	boolean isSetStroke();

	/**
	 * Returns the value of the '<em><b>Stroke Dash1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Dash1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Dash1</em>' attribute.
	 * @see #setStrokeDash1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StrokeDash1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType"
	 *        extendedMetaData="kind='attribute' name='stroke-dash' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStrokeDash1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeDash1 <em>Stroke Dash1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Dash1</em>' attribute.
	 * @see #getStrokeDash1()
	 * @generated
	 */
	void setStrokeDash1(String value);

	/**
	 * Returns the value of the '<em><b>Stroke Dash Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Dash Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Dash Names</em>' attribute.
	 * @see #setStrokeDashNames(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StrokeDashNames()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameRefs" many="false"
	 *        extendedMetaData="kind='attribute' name='stroke-dash-names' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getStrokeDashNames();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeDashNames <em>Stroke Dash Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Dash Names</em>' attribute.
	 * @see #getStrokeDashNames()
	 * @generated
	 */
	void setStrokeDashNames(List<String> value);

	/**
	 * Returns the value of the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeLinejoinType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Linejoin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Linejoin</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeLinejoinType
	 * @see #isSetStrokeLinejoin()
	 * @see #unsetStrokeLinejoin()
	 * @see #setStrokeLinejoin(StrokeLinejoinType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StrokeLinejoin()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='stroke-linejoin' namespace='##targetNamespace'"
	 * @generated
	 */
	StrokeLinejoinType getStrokeLinejoin();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Linejoin</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeLinejoinType
	 * @see #isSetStrokeLinejoin()
	 * @see #unsetStrokeLinejoin()
	 * @see #getStrokeLinejoin()
	 * @generated
	 */
	void setStrokeLinejoin(StrokeLinejoinType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrokeLinejoin()
	 * @see #getStrokeLinejoin()
	 * @see #setStrokeLinejoin(StrokeLinejoinType)
	 * @generated
	 */
	void unsetStrokeLinejoin();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stroke Linejoin</em>' attribute is set.
	 * @see #unsetStrokeLinejoin()
	 * @see #getStrokeLinejoin()
	 * @see #setStrokeLinejoin(StrokeLinejoinType)
	 * @generated
	 */
	boolean isSetStrokeLinejoin();

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Symbol Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Color</em>' attribute.
	 * @see #setSymbolColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_SymbolColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='symbol-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSymbolColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getSymbolColor <em>Symbol Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Color</em>' attribute.
	 * @see #getSymbolColor()
	 * @generated
	 */
	void setSymbolColor(String value);

	/**
	 * Returns the value of the '<em><b>Textarea Horizontal Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textarea Horizontal Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textarea Horizontal Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType
	 * @see #isSetTextareaHorizontalAlign()
	 * @see #unsetTextareaHorizontalAlign()
	 * @see #setTextareaHorizontalAlign(TextareaHorizontalAlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_TextareaHorizontalAlign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='textarea-horizontal-align' namespace='##targetNamespace'"
	 * @generated
	 */
	TextareaHorizontalAlignType getTextareaHorizontalAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextareaHorizontalAlign <em>Textarea Horizontal Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textarea Horizontal Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType
	 * @see #isSetTextareaHorizontalAlign()
	 * @see #unsetTextareaHorizontalAlign()
	 * @see #getTextareaHorizontalAlign()
	 * @generated
	 */
	void setTextareaHorizontalAlign(TextareaHorizontalAlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextareaHorizontalAlign <em>Textarea Horizontal Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextareaHorizontalAlign()
	 * @see #getTextareaHorizontalAlign()
	 * @see #setTextareaHorizontalAlign(TextareaHorizontalAlignType)
	 * @generated
	 */
	void unsetTextareaHorizontalAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextareaHorizontalAlign <em>Textarea Horizontal Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Textarea Horizontal Align</em>' attribute is set.
	 * @see #unsetTextareaHorizontalAlign()
	 * @see #getTextareaHorizontalAlign()
	 * @see #setTextareaHorizontalAlign(TextareaHorizontalAlignType)
	 * @generated
	 */
	boolean isSetTextareaHorizontalAlign();

	/**
	 * Returns the value of the '<em><b>Text Areas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Areas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Areas</em>' attribute.
	 * @see #setTextAreas(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_TextAreas()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='text-areas' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextAreas();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextAreas <em>Text Areas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Areas</em>' attribute.
	 * @see #getTextAreas()
	 * @generated
	 */
	void setTextAreas(String value);

	/**
	 * Returns the value of the '<em><b>Textarea Vertical Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textarea Vertical Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textarea Vertical Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType
	 * @see #isSetTextareaVerticalAlign()
	 * @see #unsetTextareaVerticalAlign()
	 * @see #setTextareaVerticalAlign(TextareaVerticalAlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_TextareaVerticalAlign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='textarea-vertical-align' namespace='##targetNamespace'"
	 * @generated
	 */
	TextareaVerticalAlignType getTextareaVerticalAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextareaVerticalAlign <em>Textarea Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textarea Vertical Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType
	 * @see #isSetTextareaVerticalAlign()
	 * @see #unsetTextareaVerticalAlign()
	 * @see #getTextareaVerticalAlign()
	 * @generated
	 */
	void setTextareaVerticalAlign(TextareaVerticalAlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextareaVerticalAlign <em>Textarea Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextareaVerticalAlign()
	 * @see #getTextareaVerticalAlign()
	 * @see #setTextareaVerticalAlign(TextareaVerticalAlignType)
	 * @generated
	 */
	void unsetTextareaVerticalAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextareaVerticalAlign <em>Textarea Vertical Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Textarea Vertical Align</em>' attribute is set.
	 * @see #unsetTextareaVerticalAlign()
	 * @see #getTextareaVerticalAlign()
	 * @see #setTextareaVerticalAlign(TextareaVerticalAlignType)
	 * @generated
	 */
	boolean isSetTextareaVerticalAlign();

	/**
	 * Returns the value of the '<em><b>Text Path</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Path</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextPath()
	 * @see #unsetTextPath()
	 * @see #setTextPath(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_TextPath()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-path' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextPath();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPath <em>Text Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Path</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextPath()
	 * @see #unsetTextPath()
	 * @see #getTextPath()
	 * @generated
	 */
	void setTextPath(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPath <em>Text Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextPath()
	 * @see #getTextPath()
	 * @see #setTextPath(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTextPath();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPath <em>Text Path</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Path</em>' attribute is set.
	 * @see #unsetTextPath()
	 * @see #getTextPath()
	 * @see #setTextPath(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTextPath();

	/**
	 * Returns the value of the '<em><b>Text Path Allowed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Path Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Path Allowed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextPathAllowed()
	 * @see #unsetTextPathAllowed()
	 * @see #setTextPathAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_TextPathAllowed()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-path-allowed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextPathAllowed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathAllowed <em>Text Path Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Path Allowed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextPathAllowed()
	 * @see #unsetTextPathAllowed()
	 * @see #getTextPathAllowed()
	 * @generated
	 */
	void setTextPathAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathAllowed <em>Text Path Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextPathAllowed()
	 * @see #getTextPathAllowed()
	 * @see #setTextPathAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTextPathAllowed();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathAllowed <em>Text Path Allowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Path Allowed</em>' attribute is set.
	 * @see #unsetTextPathAllowed()
	 * @see #getTextPathAllowed()
	 * @see #setTextPathAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTextPathAllowed();

	/**
	 * Returns the value of the '<em><b>Text Path Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Path Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Path Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType
	 * @see #isSetTextPathMode()
	 * @see #unsetTextPathMode()
	 * @see #setTextPathMode(TextPathModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_TextPathMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-path-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	TextPathModeType getTextPathMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathMode <em>Text Path Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Path Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType
	 * @see #isSetTextPathMode()
	 * @see #unsetTextPathMode()
	 * @see #getTextPathMode()
	 * @generated
	 */
	void setTextPathMode(TextPathModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathMode <em>Text Path Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextPathMode()
	 * @see #getTextPathMode()
	 * @see #setTextPathMode(TextPathModeType)
	 * @generated
	 */
	void unsetTextPathMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathMode <em>Text Path Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Path Mode</em>' attribute is set.
	 * @see #unsetTextPathMode()
	 * @see #getTextPathMode()
	 * @see #setTextPathMode(TextPathModeType)
	 * @generated
	 */
	boolean isSetTextPathMode();

	/**
	 * Returns the value of the '<em><b>Text Path Same Letter Heights</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Path Same Letter Heights</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Path Same Letter Heights</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextPathSameLetterHeights()
	 * @see #unsetTextPathSameLetterHeights()
	 * @see #setTextPathSameLetterHeights(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_TextPathSameLetterHeights()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-path-same-letter-heights' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextPathSameLetterHeights();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathSameLetterHeights <em>Text Path Same Letter Heights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Path Same Letter Heights</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextPathSameLetterHeights()
	 * @see #unsetTextPathSameLetterHeights()
	 * @see #getTextPathSameLetterHeights()
	 * @generated
	 */
	void setTextPathSameLetterHeights(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathSameLetterHeights <em>Text Path Same Letter Heights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextPathSameLetterHeights()
	 * @see #getTextPathSameLetterHeights()
	 * @see #setTextPathSameLetterHeights(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTextPathSameLetterHeights();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathSameLetterHeights <em>Text Path Same Letter Heights</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Path Same Letter Heights</em>' attribute is set.
	 * @see #unsetTextPathSameLetterHeights()
	 * @see #getTextPathSameLetterHeights()
	 * @see #setTextPathSameLetterHeights(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTextPathSameLetterHeights();

	/**
	 * Returns the value of the '<em><b>Text Path Scale</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Path Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Path Scale</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType
	 * @see #isSetTextPathScale()
	 * @see #unsetTextPathScale()
	 * @see #setTextPathScale(TextPathScaleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_TextPathScale()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-path-scale' namespace='##targetNamespace'"
	 * @generated
	 */
	TextPathScaleType getTextPathScale();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathScale <em>Text Path Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Path Scale</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType
	 * @see #isSetTextPathScale()
	 * @see #unsetTextPathScale()
	 * @see #getTextPathScale()
	 * @generated
	 */
	void setTextPathScale(TextPathScaleType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathScale <em>Text Path Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextPathScale()
	 * @see #getTextPathScale()
	 * @see #setTextPathScale(TextPathScaleType)
	 * @generated
	 */
	void unsetTextPathScale();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextPathScale <em>Text Path Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Path Scale</em>' attribute is set.
	 * @see #unsetTextPathScale()
	 * @see #getTextPathScale()
	 * @see #setTextPathScale(TextPathScaleType)
	 * @generated
	 */
	boolean isSetTextPathScale();

	/**
	 * Returns the value of the '<em><b>Text Rotate Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Rotate Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Rotate Angle</em>' attribute.
	 * @see #isSetTextRotateAngle()
	 * @see #unsetTextRotateAngle()
	 * @see #setTextRotateAngle(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_TextRotateAngle()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='text-rotate-angle' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTextRotateAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextRotateAngle <em>Text Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Rotate Angle</em>' attribute.
	 * @see #isSetTextRotateAngle()
	 * @see #unsetTextRotateAngle()
	 * @see #getTextRotateAngle()
	 * @generated
	 */
	void setTextRotateAngle(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextRotateAngle <em>Text Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextRotateAngle()
	 * @see #getTextRotateAngle()
	 * @see #setTextRotateAngle(double)
	 * @generated
	 */
	void unsetTextRotateAngle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextRotateAngle <em>Text Rotate Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Rotate Angle</em>' attribute is set.
	 * @see #unsetTextRotateAngle()
	 * @see #getTextRotateAngle()
	 * @see #setTextRotateAngle(double)
	 * @generated
	 */
	boolean isSetTextRotateAngle();

	/**
	 * Returns the value of the '<em><b>Text Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Style Name</em>' attribute.
	 * @see #setTextStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_TextStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.TextStyleNameType"
	 *        extendedMetaData="kind='attribute' name='text-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTextStyleName <em>Text Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Style Name</em>' attribute.
	 * @see #getTextStyleName()
	 * @generated
	 */
	void setTextStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Tile Repeat Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tile Repeat Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Repeat Offset</em>' attribute.
	 * @see #setTileRepeatOffset(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_TileRepeatOffset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='tile-repeat-offset' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTileRepeatOffset();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTileRepeatOffset <em>Tile Repeat Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Repeat Offset</em>' attribute.
	 * @see #getTileRepeatOffset()
	 * @generated
	 */
	void setTileRepeatOffset(Object value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' attribute.
	 * @see #setTransform(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Transform()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='transform' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransform();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(UnitType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Unit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getUnit();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(UnitType)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(UnitType)
	 * @generated
	 */
	boolean isSetUnit();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Visible Area Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Area Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Area Height</em>' attribute.
	 * @see #setVisibleAreaHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_VisibleAreaHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveLength"
	 *        extendedMetaData="kind='attribute' name='visible-area-height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVisibleAreaHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaHeight <em>Visible Area Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Area Height</em>' attribute.
	 * @see #getVisibleAreaHeight()
	 * @generated
	 */
	void setVisibleAreaHeight(String value);

	/**
	 * Returns the value of the '<em><b>Visible Area Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Area Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Area Left</em>' attribute.
	 * @see #setVisibleAreaLeft(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_VisibleAreaLeft()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='visible-area-left' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVisibleAreaLeft();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaLeft <em>Visible Area Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Area Left</em>' attribute.
	 * @see #getVisibleAreaLeft()
	 * @generated
	 */
	void setVisibleAreaLeft(String value);

	/**
	 * Returns the value of the '<em><b>Visible Area Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Area Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Area Top</em>' attribute.
	 * @see #setVisibleAreaTop(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_VisibleAreaTop()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='visible-area-top' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVisibleAreaTop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaTop <em>Visible Area Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Area Top</em>' attribute.
	 * @see #getVisibleAreaTop()
	 * @generated
	 */
	void setVisibleAreaTop(String value);

	/**
	 * Returns the value of the '<em><b>Visible Area Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Area Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Area Width</em>' attribute.
	 * @see #setVisibleAreaWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_VisibleAreaWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveLength"
	 *        extendedMetaData="kind='attribute' name='visible-area-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVisibleAreaWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getVisibleAreaWidth <em>Visible Area Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Area Width</em>' attribute.
	 * @see #getVisibleAreaWidth()
	 * @generated
	 */
	void setVisibleAreaWidth(String value);

	/**
	 * Returns the value of the '<em><b>Wrap Influence On Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrap Influence On Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrap Influence On Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType
	 * @see #isSetWrapInfluenceOnPosition()
	 * @see #unsetWrapInfluenceOnPosition()
	 * @see #setWrapInfluenceOnPosition(WrapInfluenceOnPositionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_WrapInfluenceOnPosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='wrap-influence-on-position' namespace='##targetNamespace'"
	 * @generated
	 */
	WrapInfluenceOnPositionType getWrapInfluenceOnPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getWrapInfluenceOnPosition <em>Wrap Influence On Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap Influence On Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType
	 * @see #isSetWrapInfluenceOnPosition()
	 * @see #unsetWrapInfluenceOnPosition()
	 * @see #getWrapInfluenceOnPosition()
	 * @generated
	 */
	void setWrapInfluenceOnPosition(WrapInfluenceOnPositionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getWrapInfluenceOnPosition <em>Wrap Influence On Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrapInfluenceOnPosition()
	 * @see #getWrapInfluenceOnPosition()
	 * @see #setWrapInfluenceOnPosition(WrapInfluenceOnPositionType)
	 * @generated
	 */
	void unsetWrapInfluenceOnPosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getWrapInfluenceOnPosition <em>Wrap Influence On Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrap Influence On Position</em>' attribute is set.
	 * @see #unsetWrapInfluenceOnPosition()
	 * @see #getWrapInfluenceOnPosition()
	 * @see #setWrapInfluenceOnPosition(WrapInfluenceOnPositionType)
	 * @generated
	 */
	boolean isSetWrapInfluenceOnPosition();

	/**
	 * Returns the value of the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZIndex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZIndex</em>' attribute.
	 * @see #setZIndex(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getDocumentRoot_ZIndex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='z-index' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getZIndex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot#getZIndex <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZIndex</em>' attribute.
	 * @see #getZIndex()
	 * @generated
	 */
	void setZIndex(BigInteger value);

} // DocumentRoot
