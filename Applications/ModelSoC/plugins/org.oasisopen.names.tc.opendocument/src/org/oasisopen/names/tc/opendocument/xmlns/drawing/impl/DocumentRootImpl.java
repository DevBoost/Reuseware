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
package org.oasisopen.names.tc.opendocument.xmlns.drawing.impl;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
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
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaHorizontalAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextareaVerticalAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.UnitType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.WrapInfluenceOnPositionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getA <em>A</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getApplet <em>Applet</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getAreaCircle <em>Area Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getAreaPolygon <em>Area Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getAreaRectangle <em>Area Rectangle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getContourPath <em>Contour Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getContourPolygon <em>Contour Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEnhancedGeometry <em>Enhanced Geometry</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFillImage <em>Fill Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFloatingFrame <em>Floating Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getGluePoint <em>Glue Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getGradient <em>Gradient</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHatch <em>Hatch</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getImageMap <em>Image Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getLayerSet <em>Layer Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMarker <em>Marker</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getObjectOle <em>Object Ole</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getPage <em>Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStrokeDash <em>Stroke Dash</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTextBox <em>Text Box</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getArchive <em>Archive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getAutoGrowHeight <em>Auto Grow Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getAutoGrowWidth <em>Auto Grow Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getBackgroundSize <em>Background Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getBlue <em>Blue</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCaptionAngle <em>Caption Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCaptionAngleType <em>Caption Angle Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCaptionEscape <em>Caption Escape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCaptionEscapeDirection <em>Caption Escape Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCaptionFitLineLength <em>Caption Fit Line Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCaptionGap <em>Caption Gap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCaptionId <em>Caption Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCaptionLineLength <em>Caption Line Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCaptionPointX <em>Caption Point X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCaptionPointY <em>Caption Point Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCaptionType <em>Caption Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getChainNextName <em>Chain Next Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getClassId <em>Class Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getColorInversion <em>Color Inversion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getConcave <em>Concave</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getConcentricGradientFillAllowed <em>Concentric Gradient Fill Allowed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getContrast <em>Contrast</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getControl1 <em>Control1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCopyOf <em>Copy Of</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCornerRadius <em>Corner Radius</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCorners <em>Corners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getDecimalPlaces <em>Decimal Places</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getDots1 <em>Dots1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getDots1Length <em>Dots1 Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getDots2 <em>Dots2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getDots2Length <em>Dots2 Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEndAngle <em>End Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEndColor <em>End Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEndGluePoint <em>End Glue Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEndGuide <em>End Guide</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEndIntensity <em>End Intensity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEndLineSpacingHorizontal <em>End Line Spacing Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEndLineSpacingVertical <em>End Line Spacing Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEndShape <em>End Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEnhancedPath <em>Enhanced Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getEscapeDirection <em>Escape Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusion <em>Extrusion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionAllowed <em>Extrusion Allowed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionBrightness <em>Extrusion Brightness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionColor <em>Extrusion Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionDepth <em>Extrusion Depth</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionDiffusion <em>Extrusion Diffusion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionFirstLightDirection <em>Extrusion First Light Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionFirstLightHarsh <em>Extrusion First Light Harsh</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionFirstLightLevel <em>Extrusion First Light Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionLightFace <em>Extrusion Light Face</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionMetal <em>Extrusion Metal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionNumberOfLineSegments <em>Extrusion Number Of Line Segments</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionOrigin <em>Extrusion Origin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionRotationAngle <em>Extrusion Rotation Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionRotationCenter <em>Extrusion Rotation Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionSecondLightDirection <em>Extrusion Second Light Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionSecondLightHarsh <em>Extrusion Second Light Harsh</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionSecondLightLevel <em>Extrusion Second Light Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionShininess <em>Extrusion Shininess</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionSkew <em>Extrusion Skew</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionSpecularity <em>Extrusion Specularity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getExtrusionViewpoint <em>Extrusion Viewpoint</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFillGradientName <em>Fill Gradient Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFillHatchName <em>Fill Hatch Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFillHatchSolid <em>Fill Hatch Solid</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFillImageHeight <em>Fill Image Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFillImageName <em>Fill Image Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFillImageRefPoint <em>Fill Image Ref Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFillImageRefPointX <em>Fill Image Ref Point X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFillImageRefPointY <em>Fill Image Ref Point Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFillImageWidth <em>Fill Image Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFitToContour <em>Fit To Contour</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFitToSize <em>Fit To Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFrameDisplayBorder <em>Frame Display Border</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFrameDisplayScrollbar <em>Frame Display Scrollbar</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFrameMarginHorizontal <em>Frame Margin Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFrameMarginVertical <em>Frame Margin Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getFrameName <em>Frame Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getGamma <em>Gamma</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getGluePointLeavingDirections <em>Glue Point Leaving Directions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getGluePoints <em>Glue Points</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getGluePointType <em>Glue Point Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getGradientStepCount <em>Gradient Step Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getGuideDistance <em>Guide Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getGuideOverhang <em>Guide Overhang</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHandleMirrorHorizontal <em>Handle Mirror Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHandleMirrorVertical <em>Handle Mirror Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHandlePolar <em>Handle Polar</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHandlePosition <em>Handle Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHandleRadiusRangeMaximum <em>Handle Radius Range Maximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHandleRadiusRangeMinimum <em>Handle Radius Range Minimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHandleRangeXMaximum <em>Handle Range XMaximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHandleRangeXMinimum <em>Handle Range XMinimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHandleRangeYMaximum <em>Handle Range YMaximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHandleRangeYMinimum <em>Handle Range YMinimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getHandleSwitched <em>Handle Switched</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getImageOpacity <em>Image Opacity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getLayer1 <em>Layer1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getLineDistance <em>Line Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getLineSkew <em>Line Skew</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getLuminance <em>Luminance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMarkerEndCenter <em>Marker End Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMarkerEndWidth <em>Marker End Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMarkerStart <em>Marker Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMarkerStartCenter <em>Marker Start Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMarkerStartWidth <em>Marker Start Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMasterPageName <em>Master Page Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMayScript <em>May Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMeasureAlign <em>Measure Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMeasureVerticalAlign <em>Measure Vertical Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMirrorHorizontal <em>Mirror Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getMirrorVertical <em>Mirror Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getNavOrder <em>Nav Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getNohref <em>Nohref</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getNotifyOnUpdateOfRanges <em>Notify On Update Of Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getObject1 <em>Object1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getOleDrawAspect <em>Ole Draw Aspect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getOpacity1 <em>Opacity1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getOpacityName <em>Opacity Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getPathStretchpointX <em>Path Stretchpoint X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getPathStretchpointY <em>Path Stretchpoint Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getPlacing <em>Placing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getProtected <em>Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getRecreateOnEdit <em>Recreate On Edit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getRed <em>Red</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getSecondaryFillColor <em>Secondary Fill Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getShadow <em>Shadow</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getShadowColor <em>Shadow Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getShadowOffsetX <em>Shadow Offset X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getShadowOffsetY <em>Shadow Offset Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getShadowOpacity <em>Shadow Opacity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getShapeId <em>Shape Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getSharpness <em>Sharpness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getShowUnit <em>Show Unit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStartAngle <em>Start Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStartColor <em>Start Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStartGluePoint <em>Start Glue Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStartGuide <em>Start Guide</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStartIntensity <em>Start Intensity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStartLineSpacingHorizontal <em>Start Line Spacing Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStartLineSpacingVertical <em>Start Line Spacing Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStartShape <em>Start Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStrokeDash1 <em>Stroke Dash1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStrokeDashNames <em>Stroke Dash Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStrokeLinejoin <em>Stroke Linejoin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getSymbolColor <em>Symbol Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTextareaHorizontalAlign <em>Textarea Horizontal Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTextAreas <em>Text Areas</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTextareaVerticalAlign <em>Textarea Vertical Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTextPath <em>Text Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTextPathAllowed <em>Text Path Allowed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTextPathMode <em>Text Path Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTextPathSameLetterHeights <em>Text Path Same Letter Heights</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTextPathScale <em>Text Path Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTextRotateAngle <em>Text Rotate Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTextStyleName <em>Text Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTileRepeatOffset <em>Tile Repeat Offset</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getVisibleAreaHeight <em>Visible Area Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getVisibleAreaLeft <em>Visible Area Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getVisibleAreaTop <em>Visible Area Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getVisibleAreaWidth <em>Visible Area Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getWrapInfluenceOnPosition <em>Wrap Influence On Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DocumentRootImpl#getZIndex <em>ZIndex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final AlignType ALIGN_EDEFAULT = AlignType.TOP_LEFT;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected AlignType align = ALIGN_EDEFAULT;

	/**
	 * This is true if the Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignESet;

	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected BigInteger angle = ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchive() <em>Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchive()
	 * @generated
	 * @ordered
	 */
	protected static final Object ARCHIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchive() <em>Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchive()
	 * @generated
	 * @ordered
	 */
	protected Object archive = ARCHIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoGrowHeight() <em>Auto Grow Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoGrowHeight()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTO_GROW_HEIGHT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutoGrowHeight() <em>Auto Grow Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoGrowHeight()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean autoGrowHeight = AUTO_GROW_HEIGHT_EDEFAULT;

	/**
	 * This is true if the Auto Grow Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoGrowHeightESet;

	/**
	 * The default value of the '{@link #getAutoGrowWidth() <em>Auto Grow Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoGrowWidth()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTO_GROW_WIDTH_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutoGrowWidth() <em>Auto Grow Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoGrowWidth()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean autoGrowWidth = AUTO_GROW_WIDTH_EDEFAULT;

	/**
	 * This is true if the Auto Grow Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoGrowWidthESet;

	/**
	 * The default value of the '{@link #getBackgroundSize() <em>Background Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundSize()
	 * @generated
	 * @ordered
	 */
	protected static final BackgroundSizeType BACKGROUND_SIZE_EDEFAULT = BackgroundSizeType.FULL;

	/**
	 * The cached value of the '{@link #getBackgroundSize() <em>Background Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundSize()
	 * @generated
	 * @ordered
	 */
	protected BackgroundSizeType backgroundSize = BACKGROUND_SIZE_EDEFAULT;

	/**
	 * This is true if the Background Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean backgroundSizeESet;

	/**
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final String BLUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected String blue = BLUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected String border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptionAngle() <em>Caption Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionAngle()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CAPTION_ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptionAngle() <em>Caption Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionAngle()
	 * @generated
	 * @ordered
	 */
	protected BigInteger captionAngle = CAPTION_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptionAngleType() <em>Caption Angle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionAngleType()
	 * @generated
	 * @ordered
	 */
	protected static final CaptionAngleTypeType CAPTION_ANGLE_TYPE_EDEFAULT = CaptionAngleTypeType.FIXED;

	/**
	 * The cached value of the '{@link #getCaptionAngleType() <em>Caption Angle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionAngleType()
	 * @generated
	 * @ordered
	 */
	protected CaptionAngleTypeType captionAngleType = CAPTION_ANGLE_TYPE_EDEFAULT;

	/**
	 * This is true if the Caption Angle Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean captionAngleTypeESet;

	/**
	 * The default value of the '{@link #getCaptionEscape() <em>Caption Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionEscape()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_ESCAPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptionEscape() <em>Caption Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionEscape()
	 * @generated
	 * @ordered
	 */
	protected String captionEscape = CAPTION_ESCAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptionEscapeDirection() <em>Caption Escape Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionEscapeDirection()
	 * @generated
	 * @ordered
	 */
	protected static final CaptionEscapeDirectionType CAPTION_ESCAPE_DIRECTION_EDEFAULT = CaptionEscapeDirectionType.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getCaptionEscapeDirection() <em>Caption Escape Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionEscapeDirection()
	 * @generated
	 * @ordered
	 */
	protected CaptionEscapeDirectionType captionEscapeDirection = CAPTION_ESCAPE_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Caption Escape Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean captionEscapeDirectionESet;

	/**
	 * The default value of the '{@link #getCaptionFitLineLength() <em>Caption Fit Line Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionFitLineLength()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CAPTION_FIT_LINE_LENGTH_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCaptionFitLineLength() <em>Caption Fit Line Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionFitLineLength()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean captionFitLineLength = CAPTION_FIT_LINE_LENGTH_EDEFAULT;

	/**
	 * This is true if the Caption Fit Line Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean captionFitLineLengthESet;

	/**
	 * The default value of the '{@link #getCaptionGap() <em>Caption Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionGap()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_GAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptionGap() <em>Caption Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionGap()
	 * @generated
	 * @ordered
	 */
	protected String captionGap = CAPTION_GAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptionId() <em>Caption Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionId()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptionId() <em>Caption Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionId()
	 * @generated
	 * @ordered
	 */
	protected String captionId = CAPTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptionLineLength() <em>Caption Line Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionLineLength()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_LINE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptionLineLength() <em>Caption Line Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionLineLength()
	 * @generated
	 * @ordered
	 */
	protected String captionLineLength = CAPTION_LINE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptionPointX() <em>Caption Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionPointX()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_POINT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptionPointX() <em>Caption Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionPointX()
	 * @generated
	 * @ordered
	 */
	protected String captionPointX = CAPTION_POINT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptionPointY() <em>Caption Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionPointY()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_POINT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptionPointY() <em>Caption Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionPointY()
	 * @generated
	 * @ordered
	 */
	protected String captionPointY = CAPTION_POINT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptionType() <em>Caption Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionType()
	 * @generated
	 * @ordered
	 */
	protected static final CaptionTypeType CAPTION_TYPE_EDEFAULT = CaptionTypeType.STRAIGHT_LINE;

	/**
	 * The cached value of the '{@link #getCaptionType() <em>Caption Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionType()
	 * @generated
	 * @ordered
	 */
	protected CaptionTypeType captionType = CAPTION_TYPE_EDEFAULT;

	/**
	 * This is true if the Caption Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean captionTypeESet;

	/**
	 * The default value of the '{@link #getChainNextName() <em>Chain Next Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainNextName()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAIN_NEXT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChainNextName() <em>Chain Next Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainNextName()
	 * @generated
	 * @ordered
	 */
	protected String chainNextName = CHAIN_NEXT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassId() <em>Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassId()
	 * @generated
	 * @ordered
	 */
	protected static final Object CLASS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassId() <em>Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassId()
	 * @generated
	 * @ordered
	 */
	protected Object classId = CLASS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassNames() <em>Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNames()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CLASS_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassNames() <em>Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNames()
	 * @generated
	 * @ordered
	 */
	protected List<String> classNames = CLASS_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final Object CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Object code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorInversion() <em>Color Inversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorInversion()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COLOR_INVERSION_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getColorInversion() <em>Color Inversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorInversion()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean colorInversion = COLOR_INVERSION_EDEFAULT;

	/**
	 * This is true if the Color Inversion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colorInversionESet;

	/**
	 * The default value of the '{@link #getColorMode() <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorMode()
	 * @generated
	 * @ordered
	 */
	protected static final ColorModeType COLOR_MODE_EDEFAULT = ColorModeType.GREYSCALE;

	/**
	 * The cached value of the '{@link #getColorMode() <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorMode()
	 * @generated
	 * @ordered
	 */
	protected ColorModeType colorMode = COLOR_MODE_EDEFAULT;

	/**
	 * This is true if the Color Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colorModeESet;

	/**
	 * The default value of the '{@link #getConcave() <em>Concave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcave()
	 * @generated
	 * @ordered
	 */
	protected static final ConcaveType CONCAVE_EDEFAULT = ConcaveType.FALSE;

	/**
	 * The cached value of the '{@link #getConcave() <em>Concave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcave()
	 * @generated
	 * @ordered
	 */
	protected ConcaveType concave = CONCAVE_EDEFAULT;

	/**
	 * This is true if the Concave attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean concaveESet;

	/**
	 * The default value of the '{@link #getConcentricGradientFillAllowed() <em>Concentric Gradient Fill Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentricGradientFillAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CONCENTRIC_GRADIENT_FILL_ALLOWED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getConcentricGradientFillAllowed() <em>Concentric Gradient Fill Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentricGradientFillAllowed()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean concentricGradientFillAllowed = CONCENTRIC_GRADIENT_FILL_ALLOWED_EDEFAULT;

	/**
	 * This is true if the Concentric Gradient Fill Allowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean concentricGradientFillAllowedESet;

	/**
	 * The default value of the '{@link #getContrast() <em>Contrast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrast()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContrast() <em>Contrast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrast()
	 * @generated
	 * @ordered
	 */
	protected String contrast = CONTRAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getControl1() <em>Control1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl1()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControl1() <em>Control1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl1()
	 * @generated
	 * @ordered
	 */
	protected String control1 = CONTROL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyOf() <em>Copy Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyOf()
	 * @generated
	 * @ordered
	 */
	protected static final String COPY_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyOf() <em>Copy Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyOf()
	 * @generated
	 * @ordered
	 */
	protected String copyOf = COPY_OF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCornerRadius() <em>Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected static final String CORNER_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCornerRadius() <em>Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected String cornerRadius = CORNER_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorners() <em>Corners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorners()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CORNERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorners() <em>Corners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorners()
	 * @generated
	 * @ordered
	 */
	protected BigInteger corners = CORNERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected static final String CX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected String cx = CX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected static final String CY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected String cy = CY_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimalPlaces() <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPlaces()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DECIMAL_PLACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecimalPlaces() <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalPlaces()
	 * @generated
	 * @ordered
	 */
	protected BigInteger decimalPlaces = DECIMAL_PLACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayType DISPLAY_EDEFAULT = DisplayType.ALWAYS;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected DisplayType display = DISPLAY_EDEFAULT;

	/**
	 * This is true if the Display attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayESet;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected String distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDots1() <em>Dots1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DOTS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDots1() <em>Dots1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dots1 = DOTS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDots1Length() <em>Dots1 Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots1Length()
	 * @generated
	 * @ordered
	 */
	protected static final String DOTS1_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDots1Length() <em>Dots1 Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots1Length()
	 * @generated
	 * @ordered
	 */
	protected String dots1Length = DOTS1_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDots2() <em>Dots2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots2()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DOTS2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDots2() <em>Dots2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots2()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dots2 = DOTS2_EDEFAULT;

	/**
	 * The default value of the '{@link #getDots2Length() <em>Dots2 Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots2Length()
	 * @generated
	 * @ordered
	 */
	protected static final String DOTS2_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDots2Length() <em>Dots2 Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDots2Length()
	 * @generated
	 * @ordered
	 */
	protected String dots2Length = DOTS2_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndAngle() <em>End Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double END_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEndAngle() <em>End Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAngle()
	 * @generated
	 * @ordered
	 */
	protected double endAngle = END_ANGLE_EDEFAULT;

	/**
	 * This is true if the End Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endAngleESet;

	/**
	 * The default value of the '{@link #getEndColor() <em>End Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColor()
	 * @generated
	 * @ordered
	 */
	protected static final String END_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndColor() <em>End Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColor()
	 * @generated
	 * @ordered
	 */
	protected String endColor = END_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndGluePoint() <em>End Glue Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndGluePoint()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_GLUE_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndGluePoint() <em>End Glue Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndGluePoint()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endGluePoint = END_GLUE_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndGuide() <em>End Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndGuide()
	 * @generated
	 * @ordered
	 */
	protected static final String END_GUIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndGuide() <em>End Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndGuide()
	 * @generated
	 * @ordered
	 */
	protected String endGuide = END_GUIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndIntensity() <em>End Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final String END_INTENSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndIntensity() <em>End Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndIntensity()
	 * @generated
	 * @ordered
	 */
	protected String endIntensity = END_INTENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndLineSpacingHorizontal() <em>End Line Spacing Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLineSpacingHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final String END_LINE_SPACING_HORIZONTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndLineSpacingHorizontal() <em>End Line Spacing Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLineSpacingHorizontal()
	 * @generated
	 * @ordered
	 */
	protected String endLineSpacingHorizontal = END_LINE_SPACING_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndLineSpacingVertical() <em>End Line Spacing Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLineSpacingVertical()
	 * @generated
	 * @ordered
	 */
	protected static final String END_LINE_SPACING_VERTICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndLineSpacingVertical() <em>End Line Spacing Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLineSpacingVertical()
	 * @generated
	 * @ordered
	 */
	protected String endLineSpacingVertical = END_LINE_SPACING_VERTICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndShape() <em>End Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndShape()
	 * @generated
	 * @ordered
	 */
	protected static final String END_SHAPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndShape() <em>End Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndShape()
	 * @generated
	 * @ordered
	 */
	protected String endShape = END_SHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngine() <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected String engine = ENGINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnhancedPath() <em>Enhanced Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnhancedPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ENHANCED_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnhancedPath() <em>Enhanced Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnhancedPath()
	 * @generated
	 * @ordered
	 */
	protected String enhancedPath = ENHANCED_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEscapeDirection() <em>Escape Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeDirection()
	 * @generated
	 * @ordered
	 */
	protected static final EscapeDirectionType ESCAPE_DIRECTION_EDEFAULT = EscapeDirectionType.AUTO;

	/**
	 * The cached value of the '{@link #getEscapeDirection() <em>Escape Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeDirection()
	 * @generated
	 * @ordered
	 */
	protected EscapeDirectionType escapeDirection = ESCAPE_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Escape Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean escapeDirectionESet;

	/**
	 * The default value of the '{@link #getExtrusion() <em>Extrusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusion()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExtrusion() <em>Extrusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusion()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusion = EXTRUSION_EDEFAULT;

	/**
	 * This is true if the Extrusion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionESet;

	/**
	 * The default value of the '{@link #getExtrusionAllowed() <em>Extrusion Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_ALLOWED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExtrusionAllowed() <em>Extrusion Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionAllowed()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusionAllowed = EXTRUSION_ALLOWED_EDEFAULT;

	/**
	 * This is true if the Extrusion Allowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionAllowedESet;

	/**
	 * The default value of the '{@link #getExtrusionBrightness() <em>Extrusion Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionBrightness()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_BRIGHTNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionBrightness() <em>Extrusion Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionBrightness()
	 * @generated
	 * @ordered
	 */
	protected String extrusionBrightness = EXTRUSION_BRIGHTNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionColor() <em>Extrusion Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionColor()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_COLOR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExtrusionColor() <em>Extrusion Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionColor()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusionColor = EXTRUSION_COLOR_EDEFAULT;

	/**
	 * This is true if the Extrusion Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionColorESet;

	/**
	 * The default value of the '{@link #getExtrusionDepth() <em>Extrusion Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionDepth()
	 * @generated
	 * @ordered
	 */
	protected static final List EXTRUSION_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionDepth() <em>Extrusion Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionDepth()
	 * @generated
	 * @ordered
	 */
	protected List extrusionDepth = EXTRUSION_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionDiffusion() <em>Extrusion Diffusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionDiffusion()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_DIFFUSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionDiffusion() <em>Extrusion Diffusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionDiffusion()
	 * @generated
	 * @ordered
	 */
	protected String extrusionDiffusion = EXTRUSION_DIFFUSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionFirstLightDirection() <em>Extrusion First Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionFirstLightDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_FIRST_LIGHT_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionFirstLightDirection() <em>Extrusion First Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionFirstLightDirection()
	 * @generated
	 * @ordered
	 */
	protected String extrusionFirstLightDirection = EXTRUSION_FIRST_LIGHT_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionFirstLightHarsh() <em>Extrusion First Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionFirstLightHarsh()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_FIRST_LIGHT_HARSH_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExtrusionFirstLightHarsh() <em>Extrusion First Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionFirstLightHarsh()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusionFirstLightHarsh = EXTRUSION_FIRST_LIGHT_HARSH_EDEFAULT;

	/**
	 * This is true if the Extrusion First Light Harsh attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionFirstLightHarshESet;

	/**
	 * The default value of the '{@link #getExtrusionFirstLightLevel() <em>Extrusion First Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionFirstLightLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_FIRST_LIGHT_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionFirstLightLevel() <em>Extrusion First Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionFirstLightLevel()
	 * @generated
	 * @ordered
	 */
	protected String extrusionFirstLightLevel = EXTRUSION_FIRST_LIGHT_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionLightFace() <em>Extrusion Light Face</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionLightFace()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_LIGHT_FACE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExtrusionLightFace() <em>Extrusion Light Face</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionLightFace()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusionLightFace = EXTRUSION_LIGHT_FACE_EDEFAULT;

	/**
	 * This is true if the Extrusion Light Face attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionLightFaceESet;

	/**
	 * The default value of the '{@link #getExtrusionMetal() <em>Extrusion Metal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionMetal()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_METAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExtrusionMetal() <em>Extrusion Metal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionMetal()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusionMetal = EXTRUSION_METAL_EDEFAULT;

	/**
	 * This is true if the Extrusion Metal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionMetalESet;

	/**
	 * The default value of the '{@link #getExtrusionNumberOfLineSegments() <em>Extrusion Number Of Line Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionNumberOfLineSegments()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EXTRUSION_NUMBER_OF_LINE_SEGMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionNumberOfLineSegments() <em>Extrusion Number Of Line Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionNumberOfLineSegments()
	 * @generated
	 * @ordered
	 */
	protected BigInteger extrusionNumberOfLineSegments = EXTRUSION_NUMBER_OF_LINE_SEGMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionOrigin() <em>Extrusion Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final List EXTRUSION_ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionOrigin() <em>Extrusion Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionOrigin()
	 * @generated
	 * @ordered
	 */
	protected List extrusionOrigin = EXTRUSION_ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionRotationAngle() <em>Extrusion Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionRotationAngle()
	 * @generated
	 * @ordered
	 */
	protected static final List EXTRUSION_ROTATION_ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionRotationAngle() <em>Extrusion Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionRotationAngle()
	 * @generated
	 * @ordered
	 */
	protected List extrusionRotationAngle = EXTRUSION_ROTATION_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionRotationCenter() <em>Extrusion Rotation Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionRotationCenter()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_ROTATION_CENTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionRotationCenter() <em>Extrusion Rotation Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionRotationCenter()
	 * @generated
	 * @ordered
	 */
	protected String extrusionRotationCenter = EXTRUSION_ROTATION_CENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionSecondLightDirection() <em>Extrusion Second Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSecondLightDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_SECOND_LIGHT_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionSecondLightDirection() <em>Extrusion Second Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSecondLightDirection()
	 * @generated
	 * @ordered
	 */
	protected String extrusionSecondLightDirection = EXTRUSION_SECOND_LIGHT_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionSecondLightHarsh() <em>Extrusion Second Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSecondLightHarsh()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXTRUSION_SECOND_LIGHT_HARSH_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExtrusionSecondLightHarsh() <em>Extrusion Second Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSecondLightHarsh()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean extrusionSecondLightHarsh = EXTRUSION_SECOND_LIGHT_HARSH_EDEFAULT;

	/**
	 * This is true if the Extrusion Second Light Harsh attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrusionSecondLightHarshESet;

	/**
	 * The default value of the '{@link #getExtrusionSecondLightLevel() <em>Extrusion Second Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSecondLightLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_SECOND_LIGHT_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionSecondLightLevel() <em>Extrusion Second Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSecondLightLevel()
	 * @generated
	 * @ordered
	 */
	protected String extrusionSecondLightLevel = EXTRUSION_SECOND_LIGHT_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionShininess() <em>Extrusion Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionShininess()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_SHININESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionShininess() <em>Extrusion Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionShininess()
	 * @generated
	 * @ordered
	 */
	protected String extrusionShininess = EXTRUSION_SHININESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionSkew() <em>Extrusion Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSkew()
	 * @generated
	 * @ordered
	 */
	protected static final List EXTRUSION_SKEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionSkew() <em>Extrusion Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSkew()
	 * @generated
	 * @ordered
	 */
	protected List extrusionSkew = EXTRUSION_SKEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionSpecularity() <em>Extrusion Specularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSpecularity()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_SPECULARITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionSpecularity() <em>Extrusion Specularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionSpecularity()
	 * @generated
	 * @ordered
	 */
	protected String extrusionSpecularity = EXTRUSION_SPECULARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtrusionViewpoint() <em>Extrusion Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionViewpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRUSION_VIEWPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtrusionViewpoint() <em>Extrusion Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionViewpoint()
	 * @generated
	 * @ordered
	 */
	protected String extrusionViewpoint = EXTRUSION_VIEWPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected static final FillType FILL_EDEFAULT = FillType.NONE;

	/**
	 * The cached value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected FillType fill = FILL_EDEFAULT;

	/**
	 * This is true if the Fill attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillESet;

	/**
	 * The default value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected String fillColor = FILL_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillGradientName() <em>Fill Gradient Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillGradientName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_GRADIENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillGradientName() <em>Fill Gradient Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillGradientName()
	 * @generated
	 * @ordered
	 */
	protected String fillGradientName = FILL_GRADIENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillHatchName() <em>Fill Hatch Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillHatchName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_HATCH_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillHatchName() <em>Fill Hatch Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillHatchName()
	 * @generated
	 * @ordered
	 */
	protected String fillHatchName = FILL_HATCH_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillHatchSolid() <em>Fill Hatch Solid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillHatchSolid()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FILL_HATCH_SOLID_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getFillHatchSolid() <em>Fill Hatch Solid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillHatchSolid()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean fillHatchSolid = FILL_HATCH_SOLID_EDEFAULT;

	/**
	 * This is true if the Fill Hatch Solid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillHatchSolidESet;

	/**
	 * The default value of the '{@link #getFillImageHeight() <em>Fill Image Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillImageHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_IMAGE_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillImageHeight() <em>Fill Image Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillImageHeight()
	 * @generated
	 * @ordered
	 */
	protected String fillImageHeight = FILL_IMAGE_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillImageName() <em>Fill Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillImageName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_IMAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillImageName() <em>Fill Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillImageName()
	 * @generated
	 * @ordered
	 */
	protected String fillImageName = FILL_IMAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillImageRefPoint() <em>Fill Image Ref Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillImageRefPoint()
	 * @generated
	 * @ordered
	 */
	protected static final FillImageRefPointType FILL_IMAGE_REF_POINT_EDEFAULT = FillImageRefPointType.TOP_LEFT;

	/**
	 * The cached value of the '{@link #getFillImageRefPoint() <em>Fill Image Ref Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillImageRefPoint()
	 * @generated
	 * @ordered
	 */
	protected FillImageRefPointType fillImageRefPoint = FILL_IMAGE_REF_POINT_EDEFAULT;

	/**
	 * This is true if the Fill Image Ref Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillImageRefPointESet;

	/**
	 * The default value of the '{@link #getFillImageRefPointX() <em>Fill Image Ref Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillImageRefPointX()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_IMAGE_REF_POINT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillImageRefPointX() <em>Fill Image Ref Point X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillImageRefPointX()
	 * @generated
	 * @ordered
	 */
	protected String fillImageRefPointX = FILL_IMAGE_REF_POINT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillImageRefPointY() <em>Fill Image Ref Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillImageRefPointY()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_IMAGE_REF_POINT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillImageRefPointY() <em>Fill Image Ref Point Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillImageRefPointY()
	 * @generated
	 * @ordered
	 */
	protected String fillImageRefPointY = FILL_IMAGE_REF_POINT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillImageWidth() <em>Fill Image Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillImageWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_IMAGE_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillImageWidth() <em>Fill Image Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillImageWidth()
	 * @generated
	 * @ordered
	 */
	protected String fillImageWidth = FILL_IMAGE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilterName() <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterName() <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected String filterName = FILTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFitToContour() <em>Fit To Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitToContour()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FIT_TO_CONTOUR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getFitToContour() <em>Fit To Contour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitToContour()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean fitToContour = FIT_TO_CONTOUR_EDEFAULT;

	/**
	 * This is true if the Fit To Contour attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fitToContourESet;

	/**
	 * The default value of the '{@link #getFitToSize() <em>Fit To Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitToSize()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FIT_TO_SIZE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getFitToSize() <em>Fit To Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitToSize()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean fitToSize = FIT_TO_SIZE_EDEFAULT;

	/**
	 * This is true if the Fit To Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fitToSizeESet;

	/**
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected String formula = FORMULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameDisplayBorder() <em>Frame Display Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameDisplayBorder()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FRAME_DISPLAY_BORDER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getFrameDisplayBorder() <em>Frame Display Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameDisplayBorder()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean frameDisplayBorder = FRAME_DISPLAY_BORDER_EDEFAULT;

	/**
	 * This is true if the Frame Display Border attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameDisplayBorderESet;

	/**
	 * The default value of the '{@link #getFrameDisplayScrollbar() <em>Frame Display Scrollbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameDisplayScrollbar()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FRAME_DISPLAY_SCROLLBAR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getFrameDisplayScrollbar() <em>Frame Display Scrollbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameDisplayScrollbar()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean frameDisplayScrollbar = FRAME_DISPLAY_SCROLLBAR_EDEFAULT;

	/**
	 * This is true if the Frame Display Scrollbar attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameDisplayScrollbarESet;

	/**
	 * The default value of the '{@link #getFrameMarginHorizontal() <em>Frame Margin Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameMarginHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAME_MARGIN_HORIZONTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameMarginHorizontal() <em>Frame Margin Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameMarginHorizontal()
	 * @generated
	 * @ordered
	 */
	protected String frameMarginHorizontal = FRAME_MARGIN_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameMarginVertical() <em>Frame Margin Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameMarginVertical()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAME_MARGIN_VERTICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameMarginVertical() <em>Frame Margin Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameMarginVertical()
	 * @generated
	 * @ordered
	 */
	protected String frameMarginVertical = FRAME_MARGIN_VERTICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameName() <em>Frame Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameName()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameName() <em>Frame Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameName()
	 * @generated
	 * @ordered
	 */
	protected String frameName = FRAME_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGamma() <em>Gamma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma()
	 * @generated
	 * @ordered
	 */
	protected static final String GAMMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGamma() <em>Gamma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma()
	 * @generated
	 * @ordered
	 */
	protected String gamma = GAMMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getGluePointLeavingDirections() <em>Glue Point Leaving Directions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePointLeavingDirections()
	 * @generated
	 * @ordered
	 */
	protected static final Object GLUE_POINT_LEAVING_DIRECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGluePointLeavingDirections() <em>Glue Point Leaving Directions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePointLeavingDirections()
	 * @generated
	 * @ordered
	 */
	protected Object gluePointLeavingDirections = GLUE_POINT_LEAVING_DIRECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGluePoints() <em>Glue Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePoints()
	 * @generated
	 * @ordered
	 */
	protected static final String GLUE_POINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGluePoints() <em>Glue Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePoints()
	 * @generated
	 * @ordered
	 */
	protected String gluePoints = GLUE_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGluePointType() <em>Glue Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePointType()
	 * @generated
	 * @ordered
	 */
	protected static final GluePointTypeType GLUE_POINT_TYPE_EDEFAULT = GluePointTypeType.NONE;

	/**
	 * The cached value of the '{@link #getGluePointType() <em>Glue Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGluePointType()
	 * @generated
	 * @ordered
	 */
	protected GluePointTypeType gluePointType = GLUE_POINT_TYPE_EDEFAULT;

	/**
	 * This is true if the Glue Point Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gluePointTypeESet;

	/**
	 * The default value of the '{@link #getGradientStepCount() <em>Gradient Step Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientStepCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger GRADIENT_STEP_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGradientStepCount() <em>Gradient Step Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientStepCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger gradientStepCount = GRADIENT_STEP_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final String GREEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected String green = GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuideDistance() <em>Guide Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideDistance()
	 * @generated
	 * @ordered
	 */
	protected static final String GUIDE_DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuideDistance() <em>Guide Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideDistance()
	 * @generated
	 * @ordered
	 */
	protected String guideDistance = GUIDE_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuideOverhang() <em>Guide Overhang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideOverhang()
	 * @generated
	 * @ordered
	 */
	protected static final String GUIDE_OVERHANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuideOverhang() <em>Guide Overhang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideOverhang()
	 * @generated
	 * @ordered
	 */
	protected String guideOverhang = GUIDE_OVERHANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleMirrorHorizontal() <em>Handle Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleMirrorHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean HANDLE_MIRROR_HORIZONTAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getHandleMirrorHorizontal() <em>Handle Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleMirrorHorizontal()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean handleMirrorHorizontal = HANDLE_MIRROR_HORIZONTAL_EDEFAULT;

	/**
	 * This is true if the Handle Mirror Horizontal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean handleMirrorHorizontalESet;

	/**
	 * The default value of the '{@link #getHandleMirrorVertical() <em>Handle Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleMirrorVertical()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean HANDLE_MIRROR_VERTICAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getHandleMirrorVertical() <em>Handle Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleMirrorVertical()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean handleMirrorVertical = HANDLE_MIRROR_VERTICAL_EDEFAULT;

	/**
	 * This is true if the Handle Mirror Vertical attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean handleMirrorVerticalESet;

	/**
	 * The default value of the '{@link #getHandlePolar() <em>Handle Polar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlePolar()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_POLAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlePolar() <em>Handle Polar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlePolar()
	 * @generated
	 * @ordered
	 */
	protected String handlePolar = HANDLE_POLAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlePosition() <em>Handle Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlePosition()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlePosition() <em>Handle Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlePosition()
	 * @generated
	 * @ordered
	 */
	protected String handlePosition = HANDLE_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleRadiusRangeMaximum() <em>Handle Radius Range Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRadiusRangeMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_RADIUS_RANGE_MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandleRadiusRangeMaximum() <em>Handle Radius Range Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRadiusRangeMaximum()
	 * @generated
	 * @ordered
	 */
	protected String handleRadiusRangeMaximum = HANDLE_RADIUS_RANGE_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleRadiusRangeMinimum() <em>Handle Radius Range Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRadiusRangeMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_RADIUS_RANGE_MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandleRadiusRangeMinimum() <em>Handle Radius Range Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRadiusRangeMinimum()
	 * @generated
	 * @ordered
	 */
	protected String handleRadiusRangeMinimum = HANDLE_RADIUS_RANGE_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleRangeXMaximum() <em>Handle Range XMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeXMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_RANGE_XMAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandleRangeXMaximum() <em>Handle Range XMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeXMaximum()
	 * @generated
	 * @ordered
	 */
	protected String handleRangeXMaximum = HANDLE_RANGE_XMAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleRangeXMinimum() <em>Handle Range XMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeXMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_RANGE_XMINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandleRangeXMinimum() <em>Handle Range XMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeXMinimum()
	 * @generated
	 * @ordered
	 */
	protected String handleRangeXMinimum = HANDLE_RANGE_XMINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleRangeYMaximum() <em>Handle Range YMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeYMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_RANGE_YMAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandleRangeYMaximum() <em>Handle Range YMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeYMaximum()
	 * @generated
	 * @ordered
	 */
	protected String handleRangeYMaximum = HANDLE_RANGE_YMAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleRangeYMinimum() <em>Handle Range YMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeYMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_RANGE_YMINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandleRangeYMinimum() <em>Handle Range YMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeYMinimum()
	 * @generated
	 * @ordered
	 */
	protected String handleRangeYMinimum = HANDLE_RANGE_YMINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleSwitched() <em>Handle Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleSwitched()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean HANDLE_SWITCHED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getHandleSwitched() <em>Handle Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleSwitched()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean handleSwitched = HANDLE_SWITCHED_EDEFAULT;

	/**
	 * This is true if the Handle Switched attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean handleSwitchedESet;

	/**
	 * The default value of the '{@link #getImageOpacity() <em>Image Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_OPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageOpacity() <em>Image Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageOpacity()
	 * @generated
	 * @ordered
	 */
	protected String imageOpacity = IMAGE_OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final KindType KIND_EDEFAULT = KindType.FULL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected KindType kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getLayer1() <em>Layer1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer1()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLayer1() <em>Layer1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer1()
	 * @generated
	 * @ordered
	 */
	protected String layer1 = LAYER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineDistance() <em>Line Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDistance()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineDistance() <em>Line Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDistance()
	 * @generated
	 * @ordered
	 */
	protected String lineDistance = LINE_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineSkew() <em>Line Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSkew()
	 * @generated
	 * @ordered
	 */
	protected static final List LINE_SKEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineSkew() <em>Line Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSkew()
	 * @generated
	 * @ordered
	 */
	protected List lineSkew = LINE_SKEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuminance() <em>Luminance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminance()
	 * @generated
	 * @ordered
	 */
	protected static final String LUMINANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLuminance() <em>Luminance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminance()
	 * @generated
	 * @ordered
	 */
	protected String luminance = LUMINANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarkerEnd() <em>Marker End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkerEnd() <em>Marker End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerEnd()
	 * @generated
	 * @ordered
	 */
	protected String markerEnd = MARKER_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarkerEndCenter() <em>Marker End Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerEndCenter()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MARKER_END_CENTER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMarkerEndCenter() <em>Marker End Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerEndCenter()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean markerEndCenter = MARKER_END_CENTER_EDEFAULT;

	/**
	 * This is true if the Marker End Center attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean markerEndCenterESet;

	/**
	 * The default value of the '{@link #getMarkerEndWidth() <em>Marker End Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerEndWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_END_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkerEndWidth() <em>Marker End Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerEndWidth()
	 * @generated
	 * @ordered
	 */
	protected String markerEndWidth = MARKER_END_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarkerStart() <em>Marker Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerStart()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkerStart() <em>Marker Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerStart()
	 * @generated
	 * @ordered
	 */
	protected String markerStart = MARKER_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarkerStartCenter() <em>Marker Start Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerStartCenter()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MARKER_START_CENTER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMarkerStartCenter() <em>Marker Start Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerStartCenter()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean markerStartCenter = MARKER_START_CENTER_EDEFAULT;

	/**
	 * This is true if the Marker Start Center attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean markerStartCenterESet;

	/**
	 * The default value of the '{@link #getMarkerStartWidth() <em>Marker Start Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerStartWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_START_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkerStartWidth() <em>Marker Start Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerStartWidth()
	 * @generated
	 * @ordered
	 */
	protected String markerStartWidth = MARKER_START_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterPageName() <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterPageName()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_PAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterPageName() <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterPageName()
	 * @generated
	 * @ordered
	 */
	protected String masterPageName = MASTER_PAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMayScript() <em>May Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayScript()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MAY_SCRIPT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMayScript() <em>May Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayScript()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean mayScript = MAY_SCRIPT_EDEFAULT;

	/**
	 * This is true if the May Script attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mayScriptESet;

	/**
	 * The default value of the '{@link #getMeasureAlign() <em>Measure Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureAlign()
	 * @generated
	 * @ordered
	 */
	protected static final MeasureAlignType MEASURE_ALIGN_EDEFAULT = MeasureAlignType.AUTOMATIC;

	/**
	 * The cached value of the '{@link #getMeasureAlign() <em>Measure Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureAlign()
	 * @generated
	 * @ordered
	 */
	protected MeasureAlignType measureAlign = MEASURE_ALIGN_EDEFAULT;

	/**
	 * This is true if the Measure Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean measureAlignESet;

	/**
	 * The default value of the '{@link #getMeasureVerticalAlign() <em>Measure Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected static final MeasureVerticalAlignType MEASURE_VERTICAL_ALIGN_EDEFAULT = MeasureVerticalAlignType.AUTOMATIC;

	/**
	 * The cached value of the '{@link #getMeasureVerticalAlign() <em>Measure Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected MeasureVerticalAlignType measureVerticalAlign = MEASURE_VERTICAL_ALIGN_EDEFAULT;

	/**
	 * This is true if the Measure Vertical Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean measureVerticalAlignESet;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final Object MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected Object mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMirrorHorizontal() <em>Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirrorHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MIRROR_HORIZONTAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMirrorHorizontal() <em>Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirrorHorizontal()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean mirrorHorizontal = MIRROR_HORIZONTAL_EDEFAULT;

	/**
	 * This is true if the Mirror Horizontal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mirrorHorizontalESet;

	/**
	 * The default value of the '{@link #getMirrorVertical() <em>Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirrorVertical()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MIRROR_VERTICAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMirrorVertical() <em>Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirrorVertical()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean mirrorVertical = MIRROR_VERTICAL_EDEFAULT;

	/**
	 * This is true if the Mirror Vertical attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mirrorVerticalESet;

	/**
	 * The default value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected String modifiers = MODIFIERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavOrder() <em>Nav Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavOrder()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> NAV_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavOrder() <em>Nav Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavOrder()
	 * @generated
	 * @ordered
	 */
	protected List<String> navOrder = NAV_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNohref() <em>Nohref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNohref()
	 * @generated
	 * @ordered
	 */
	protected static final NohrefType NOHREF_EDEFAULT = NohrefType.NOHREF;

	/**
	 * The cached value of the '{@link #getNohref() <em>Nohref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNohref()
	 * @generated
	 * @ordered
	 */
	protected NohrefType nohref = NOHREF_EDEFAULT;

	/**
	 * This is true if the Nohref attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nohrefESet;

	/**
	 * The default value of the '{@link #getNotifyOnUpdateOfRanges() <em>Notify On Update Of Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifyOnUpdateOfRanges()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFY_ON_UPDATE_OF_RANGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotifyOnUpdateOfRanges() <em>Notify On Update Of Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifyOnUpdateOfRanges()
	 * @generated
	 * @ordered
	 */
	protected String notifyOnUpdateOfRanges = NOTIFY_ON_UPDATE_OF_RANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getObject1() <em>Object1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject1()
	 * @generated
	 * @ordered
	 */
	protected static final Object OBJECT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject1() <em>Object1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject1()
	 * @generated
	 * @ordered
	 */
	protected Object object1 = OBJECT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getOleDrawAspect() <em>Ole Draw Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOleDrawAspect()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OLE_DRAW_ASPECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOleDrawAspect() <em>Ole Draw Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOleDrawAspect()
	 * @generated
	 * @ordered
	 */
	protected BigInteger oleDrawAspect = OLE_DRAW_ASPECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpacity1() <em>Opacity1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity1()
	 * @generated
	 * @ordered
	 */
	protected static final String OPACITY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpacity1() <em>Opacity1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity1()
	 * @generated
	 * @ordered
	 */
	protected String opacity1 = OPACITY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpacityName() <em>Opacity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacityName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPACITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpacityName() <em>Opacity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacityName()
	 * @generated
	 * @ordered
	 */
	protected String opacityName = OPACITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageNumber() <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PAGE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageNumber() <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger pageNumber = PAGE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PARALLEL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean parallel = PARALLEL_EDEFAULT;

	/**
	 * This is true if the Parallel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parallelESet;

	/**
	 * The default value of the '{@link #getPathStretchpointX() <em>Path Stretchpoint X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathStretchpointX()
	 * @generated
	 * @ordered
	 */
	protected static final double PATH_STRETCHPOINT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPathStretchpointX() <em>Path Stretchpoint X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathStretchpointX()
	 * @generated
	 * @ordered
	 */
	protected double pathStretchpointX = PATH_STRETCHPOINT_X_EDEFAULT;

	/**
	 * This is true if the Path Stretchpoint X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pathStretchpointXESet;

	/**
	 * The default value of the '{@link #getPathStretchpointY() <em>Path Stretchpoint Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathStretchpointY()
	 * @generated
	 * @ordered
	 */
	protected static final double PATH_STRETCHPOINT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPathStretchpointY() <em>Path Stretchpoint Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathStretchpointY()
	 * @generated
	 * @ordered
	 */
	protected double pathStretchpointY = PATH_STRETCHPOINT_Y_EDEFAULT;

	/**
	 * This is true if the Path Stretchpoint Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pathStretchpointYESet;

	/**
	 * The default value of the '{@link #getPlacing() <em>Placing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacing()
	 * @generated
	 * @ordered
	 */
	protected static final PlacingType PLACING_EDEFAULT = PlacingType.BELOW;

	/**
	 * The cached value of the '{@link #getPlacing() <em>Placing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacing()
	 * @generated
	 * @ordered
	 */
	protected PlacingType placing = PLACING_EDEFAULT;

	/**
	 * This is true if the Placing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean placingESet;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final String POINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected String points = POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PROTECTED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean protected_ = PROTECTED_EDEFAULT;

	/**
	 * This is true if the Protected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protectedESet;

	/**
	 * The default value of the '{@link #getRecreateOnEdit() <em>Recreate On Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecreateOnEdit()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean RECREATE_ON_EDIT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getRecreateOnEdit() <em>Recreate On Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecreateOnEdit()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean recreateOnEdit = RECREATE_ON_EDIT_EDEFAULT;

	/**
	 * This is true if the Recreate On Edit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recreateOnEditESet;

	/**
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final String RED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected String red = RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rotation = ROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondaryFillColor() <em>Secondary Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryFillColor()
	 * @generated
	 * @ordered
	 */
	protected static final String SECONDARY_FILL_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondaryFillColor() <em>Secondary Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryFillColor()
	 * @generated
	 * @ordered
	 */
	protected String secondaryFillColor = SECONDARY_FILL_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getShadow() <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadow()
	 * @generated
	 * @ordered
	 */
	protected static final ShadowType SHADOW_EDEFAULT = ShadowType.VISIBLE;

	/**
	 * The cached value of the '{@link #getShadow() <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadow()
	 * @generated
	 * @ordered
	 */
	protected ShadowType shadow = SHADOW_EDEFAULT;

	/**
	 * This is true if the Shadow attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shadowESet;

	/**
	 * The default value of the '{@link #getShadowColor() <em>Shadow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowColor()
	 * @generated
	 * @ordered
	 */
	protected static final String SHADOW_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShadowColor() <em>Shadow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowColor()
	 * @generated
	 * @ordered
	 */
	protected String shadowColor = SHADOW_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getShadowOffsetX() <em>Shadow Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowOffsetX()
	 * @generated
	 * @ordered
	 */
	protected static final String SHADOW_OFFSET_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShadowOffsetX() <em>Shadow Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowOffsetX()
	 * @generated
	 * @ordered
	 */
	protected String shadowOffsetX = SHADOW_OFFSET_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getShadowOffsetY() <em>Shadow Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowOffsetY()
	 * @generated
	 * @ordered
	 */
	protected static final String SHADOW_OFFSET_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShadowOffsetY() <em>Shadow Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowOffsetY()
	 * @generated
	 * @ordered
	 */
	protected String shadowOffsetY = SHADOW_OFFSET_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getShadowOpacity() <em>Shadow Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final String SHADOW_OPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShadowOpacity() <em>Shadow Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowOpacity()
	 * @generated
	 * @ordered
	 */
	protected String shadowOpacity = SHADOW_OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getShapeId() <em>Shape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHAPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShapeId() <em>Shape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeId()
	 * @generated
	 * @ordered
	 */
	protected String shapeId = SHAPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharpness() <em>Sharpness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharpness()
	 * @generated
	 * @ordered
	 */
	protected static final String SHARPNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharpness() <em>Sharpness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharpness()
	 * @generated
	 * @ordered
	 */
	protected String sharpness = SHARPNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowUnit() <em>Show Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowUnit()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SHOW_UNIT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getShowUnit() <em>Show Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowUnit()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean showUnit = SHOW_UNIT_EDEFAULT;

	/**
	 * This is true if the Show Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showUnitESet;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final String START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected String start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartAngle() <em>Start Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double START_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartAngle() <em>Start Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAngle()
	 * @generated
	 * @ordered
	 */
	protected double startAngle = START_ANGLE_EDEFAULT;

	/**
	 * This is true if the Start Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startAngleESet;

	/**
	 * The default value of the '{@link #getStartColor() <em>Start Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColor()
	 * @generated
	 * @ordered
	 */
	protected static final String START_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartColor() <em>Start Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColor()
	 * @generated
	 * @ordered
	 */
	protected String startColor = START_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartGluePoint() <em>Start Glue Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartGluePoint()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_GLUE_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartGluePoint() <em>Start Glue Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartGluePoint()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startGluePoint = START_GLUE_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartGuide() <em>Start Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartGuide()
	 * @generated
	 * @ordered
	 */
	protected static final String START_GUIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartGuide() <em>Start Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartGuide()
	 * @generated
	 * @ordered
	 */
	protected String startGuide = START_GUIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartIntensity() <em>Start Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final String START_INTENSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartIntensity() <em>Start Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIntensity()
	 * @generated
	 * @ordered
	 */
	protected String startIntensity = START_INTENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartLineSpacingHorizontal() <em>Start Line Spacing Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLineSpacingHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final String START_LINE_SPACING_HORIZONTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartLineSpacingHorizontal() <em>Start Line Spacing Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLineSpacingHorizontal()
	 * @generated
	 * @ordered
	 */
	protected String startLineSpacingHorizontal = START_LINE_SPACING_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartLineSpacingVertical() <em>Start Line Spacing Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLineSpacingVertical()
	 * @generated
	 * @ordered
	 */
	protected static final String START_LINE_SPACING_VERTICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartLineSpacingVertical() <em>Start Line Spacing Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLineSpacingVertical()
	 * @generated
	 * @ordered
	 */
	protected String startLineSpacingVertical = START_LINE_SPACING_VERTICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartShape() <em>Start Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartShape()
	 * @generated
	 * @ordered
	 */
	protected static final String START_SHAPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartShape() <em>Start Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartShape()
	 * @generated
	 * @ordered
	 */
	protected String startShape = START_SHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected static final StrokeType STROKE_EDEFAULT = StrokeType.NONE;

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected StrokeType stroke = STROKE_EDEFAULT;

	/**
	 * This is true if the Stroke attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeESet;

	/**
	 * The default value of the '{@link #getStrokeDash1() <em>Stroke Dash1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDash1()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_DASH1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrokeDash1() <em>Stroke Dash1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDash1()
	 * @generated
	 * @ordered
	 */
	protected String strokeDash1 = STROKE_DASH1_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrokeDashNames() <em>Stroke Dash Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashNames()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> STROKE_DASH_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrokeDashNames() <em>Stroke Dash Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDashNames()
	 * @generated
	 * @ordered
	 */
	protected List<String> strokeDashNames = STROKE_DASH_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrokeLinejoin() <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinejoin()
	 * @generated
	 * @ordered
	 */
	protected static final StrokeLinejoinType STROKE_LINEJOIN_EDEFAULT = StrokeLinejoinType.MITER;

	/**
	 * The cached value of the '{@link #getStrokeLinejoin() <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinejoin()
	 * @generated
	 * @ordered
	 */
	protected StrokeLinejoinType strokeLinejoin = STROKE_LINEJOIN_EDEFAULT;

	/**
	 * This is true if the Stroke Linejoin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strokeLinejoinESet;

	/**
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected String styleName = STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbolColor() <em>Symbol Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolColor()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolColor() <em>Symbol Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolColor()
	 * @generated
	 * @ordered
	 */
	protected String symbolColor = SYMBOL_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextareaHorizontalAlign() <em>Textarea Horizontal Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextareaHorizontalAlign()
	 * @generated
	 * @ordered
	 */
	protected static final TextareaHorizontalAlignType TEXTAREA_HORIZONTAL_ALIGN_EDEFAULT = TextareaHorizontalAlignType.LEFT;

	/**
	 * The cached value of the '{@link #getTextareaHorizontalAlign() <em>Textarea Horizontal Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextareaHorizontalAlign()
	 * @generated
	 * @ordered
	 */
	protected TextareaHorizontalAlignType textareaHorizontalAlign = TEXTAREA_HORIZONTAL_ALIGN_EDEFAULT;

	/**
	 * This is true if the Textarea Horizontal Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textareaHorizontalAlignESet;

	/**
	 * The default value of the '{@link #getTextAreas() <em>Text Areas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAreas()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_AREAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextAreas() <em>Text Areas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAreas()
	 * @generated
	 * @ordered
	 */
	protected String textAreas = TEXT_AREAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextareaVerticalAlign() <em>Textarea Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextareaVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected static final TextareaVerticalAlignType TEXTAREA_VERTICAL_ALIGN_EDEFAULT = TextareaVerticalAlignType.TOP;

	/**
	 * The cached value of the '{@link #getTextareaVerticalAlign() <em>Textarea Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextareaVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected TextareaVerticalAlignType textareaVerticalAlign = TEXTAREA_VERTICAL_ALIGN_EDEFAULT;

	/**
	 * This is true if the Textarea Vertical Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textareaVerticalAlignESet;

	/**
	 * The default value of the '{@link #getTextPath() <em>Text Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPath()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TEXT_PATH_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTextPath() <em>Text Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPath()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean textPath = TEXT_PATH_EDEFAULT;

	/**
	 * This is true if the Text Path attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textPathESet;

	/**
	 * The default value of the '{@link #getTextPathAllowed() <em>Text Path Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TEXT_PATH_ALLOWED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTextPathAllowed() <em>Text Path Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathAllowed()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean textPathAllowed = TEXT_PATH_ALLOWED_EDEFAULT;

	/**
	 * This is true if the Text Path Allowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textPathAllowedESet;

	/**
	 * The default value of the '{@link #getTextPathMode() <em>Text Path Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathMode()
	 * @generated
	 * @ordered
	 */
	protected static final TextPathModeType TEXT_PATH_MODE_EDEFAULT = TextPathModeType.NORMAL;

	/**
	 * The cached value of the '{@link #getTextPathMode() <em>Text Path Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathMode()
	 * @generated
	 * @ordered
	 */
	protected TextPathModeType textPathMode = TEXT_PATH_MODE_EDEFAULT;

	/**
	 * This is true if the Text Path Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textPathModeESet;

	/**
	 * The default value of the '{@link #getTextPathSameLetterHeights() <em>Text Path Same Letter Heights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathSameLetterHeights()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean TEXT_PATH_SAME_LETTER_HEIGHTS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getTextPathSameLetterHeights() <em>Text Path Same Letter Heights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathSameLetterHeights()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean textPathSameLetterHeights = TEXT_PATH_SAME_LETTER_HEIGHTS_EDEFAULT;

	/**
	 * This is true if the Text Path Same Letter Heights attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textPathSameLetterHeightsESet;

	/**
	 * The default value of the '{@link #getTextPathScale() <em>Text Path Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathScale()
	 * @generated
	 * @ordered
	 */
	protected static final TextPathScaleType TEXT_PATH_SCALE_EDEFAULT = TextPathScaleType.PATH;

	/**
	 * The cached value of the '{@link #getTextPathScale() <em>Text Path Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPathScale()
	 * @generated
	 * @ordered
	 */
	protected TextPathScaleType textPathScale = TEXT_PATH_SCALE_EDEFAULT;

	/**
	 * This is true if the Text Path Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textPathScaleESet;

	/**
	 * The default value of the '{@link #getTextRotateAngle() <em>Text Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRotateAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double TEXT_ROTATE_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTextRotateAngle() <em>Text Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRotateAngle()
	 * @generated
	 * @ordered
	 */
	protected double textRotateAngle = TEXT_ROTATE_ANGLE_EDEFAULT;

	/**
	 * This is true if the Text Rotate Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textRotateAngleESet;

	/**
	 * The default value of the '{@link #getTextStyleName() <em>Text Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextStyleName() <em>Text Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextStyleName()
	 * @generated
	 * @ordered
	 */
	protected String textStyleName = TEXT_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTileRepeatOffset() <em>Tile Repeat Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileRepeatOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Object TILE_REPEAT_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTileRepeatOffset() <em>Tile Repeat Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileRepeatOffset()
	 * @generated
	 * @ordered
	 */
	protected Object tileRepeatOffset = TILE_REPEAT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected String transform = TRANSFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitType UNIT_EDEFAULT = UnitType.AUTOMATIC;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitType unit = UNIT_EDEFAULT;

	/**
	 * This is true if the Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibleAreaHeight() <em>Visible Area Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAreaHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBLE_AREA_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleAreaHeight() <em>Visible Area Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAreaHeight()
	 * @generated
	 * @ordered
	 */
	protected String visibleAreaHeight = VISIBLE_AREA_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibleAreaLeft() <em>Visible Area Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAreaLeft()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBLE_AREA_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleAreaLeft() <em>Visible Area Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAreaLeft()
	 * @generated
	 * @ordered
	 */
	protected String visibleAreaLeft = VISIBLE_AREA_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibleAreaTop() <em>Visible Area Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAreaTop()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBLE_AREA_TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleAreaTop() <em>Visible Area Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAreaTop()
	 * @generated
	 * @ordered
	 */
	protected String visibleAreaTop = VISIBLE_AREA_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibleAreaWidth() <em>Visible Area Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAreaWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBLE_AREA_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleAreaWidth() <em>Visible Area Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAreaWidth()
	 * @generated
	 * @ordered
	 */
	protected String visibleAreaWidth = VISIBLE_AREA_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrapInfluenceOnPosition() <em>Wrap Influence On Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapInfluenceOnPosition()
	 * @generated
	 * @ordered
	 */
	protected static final WrapInfluenceOnPositionType WRAP_INFLUENCE_ON_POSITION_EDEFAULT = WrapInfluenceOnPositionType.ITERATIVE;

	/**
	 * The cached value of the '{@link #getWrapInfluenceOnPosition() <em>Wrap Influence On Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapInfluenceOnPosition()
	 * @generated
	 * @ordered
	 */
	protected WrapInfluenceOnPositionType wrapInfluenceOnPosition = WRAP_INFLUENCE_ON_POSITION_EDEFAULT;

	/**
	 * This is true if the Wrap Influence On Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrapInfluenceOnPositionESet;

	/**
	 * The default value of the '{@link #getZIndex() <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ZINDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZIndex() <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger zIndex = ZINDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DrawingPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DrawingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DrawingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AType getA() {
		return (AType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_A(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA(AType newA, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_A(), newA, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(AType newA) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_A(), newA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppletType getApplet() {
		return (AppletType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Applet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplet(AppletType newApplet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Applet(), newApplet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplet(AppletType newApplet) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Applet(), newApplet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaCircleType getAreaCircle() {
		return (AreaCircleType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_AreaCircle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAreaCircle(AreaCircleType newAreaCircle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_AreaCircle(), newAreaCircle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaCircle(AreaCircleType newAreaCircle) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_AreaCircle(), newAreaCircle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaPolygonType getAreaPolygon() {
		return (AreaPolygonType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_AreaPolygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAreaPolygon(AreaPolygonType newAreaPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_AreaPolygon(), newAreaPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaPolygon(AreaPolygonType newAreaPolygon) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_AreaPolygon(), newAreaPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaRectangleType getAreaRectangle() {
		return (AreaRectangleType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_AreaRectangle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAreaRectangle(AreaRectangleType newAreaRectangle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_AreaRectangle(), newAreaRectangle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaRectangle(AreaRectangleType newAreaRectangle) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_AreaRectangle(), newAreaRectangle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionType getCaption() {
		return (CaptionType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Caption(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(CaptionType newCaption, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Caption(), newCaption, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(CaptionType newCaption) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Caption(), newCaption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircleType getCircle() {
		return (CircleType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Circle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircle(CircleType newCircle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Circle(), newCircle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircle(CircleType newCircle) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Circle(), newCircle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType getConnector() {
		return (ConnectorType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Connector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(ConnectorType newConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Connector(), newConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(ConnectorType newConnector) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Connector(), newConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContourPathType getContourPath() {
		return (ContourPathType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_ContourPath(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContourPath(ContourPathType newContourPath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_ContourPath(), newContourPath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContourPath(ContourPathType newContourPath) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_ContourPath(), newContourPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContourPolygonType getContourPolygon() {
		return (ContourPolygonType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_ContourPolygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContourPolygon(ContourPolygonType newContourPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_ContourPolygon(), newContourPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContourPolygon(ContourPolygonType newContourPolygon) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_ContourPolygon(), newContourPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType getControl() {
		return (ControlType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Control(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(ControlType newControl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Control(), newControl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(ControlType newControl) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Control(), newControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomShapeType getCustomShape() {
		return (CustomShapeType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_CustomShape(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomShape(CustomShapeType newCustomShape, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_CustomShape(), newCustomShape, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomShape(CustomShapeType newCustomShape) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_CustomShape(), newCustomShape);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipseType getEllipse() {
		return (EllipseType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Ellipse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipse(EllipseType newEllipse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Ellipse(), newEllipse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEllipse(EllipseType newEllipse) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Ellipse(), newEllipse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnhancedGeometryType getEnhancedGeometry() {
		return (EnhancedGeometryType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_EnhancedGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnhancedGeometry(EnhancedGeometryType newEnhancedGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_EnhancedGeometry(), newEnhancedGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnhancedGeometry(EnhancedGeometryType newEnhancedGeometry) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_EnhancedGeometry(), newEnhancedGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquationType getEquation() {
		return (EquationType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Equation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquation(EquationType newEquation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Equation(), newEquation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquation(EquationType newEquation) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Equation(), newEquation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillImageType getFillImage() {
		return (FillImageType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_FillImage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFillImage(FillImageType newFillImage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_FillImage(), newFillImage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillImage(FillImageType newFillImage) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_FillImage(), newFillImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingFrameType getFloatingFrame() {
		return (FloatingFrameType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_FloatingFrame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloatingFrame(FloatingFrameType newFloatingFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_FloatingFrame(), newFloatingFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingFrame(FloatingFrameType newFloatingFrame) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_FloatingFrame(), newFloatingFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType getFrame() {
		return (FrameType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Frame(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(FrameType newFrame, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Frame(), newFrame, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(FrameType newFrame) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Frame(), newFrame);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GType getG() {
		return (GType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_G(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetG(GType newG, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_G(), newG, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(GType newG) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_G(), newG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GluePointType getGluePoint() {
		return (GluePointType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_GluePoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGluePoint(GluePointType newGluePoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_GluePoint(), newGluePoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGluePoint(GluePointType newGluePoint) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_GluePoint(), newGluePoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientType getGradient() {
		return (GradientType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Gradient(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGradient(GradientType newGradient, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Gradient(), newGradient, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradient(GradientType newGradient) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Gradient(), newGradient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandleType getHandle() {
		return (HandleType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Handle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandle(HandleType newHandle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Handle(), newHandle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandle(HandleType newHandle) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Handle(), newHandle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HatchType getHatch() {
		return (HatchType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Hatch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHatch(HatchType newHatch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Hatch(), newHatch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHatch(HatchType newHatch) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Hatch(), newHatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageType getImage() {
		return (ImageType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Image(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(ImageType newImage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Image(), newImage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(ImageType newImage) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Image(), newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageMapType getImageMap() {
		return (ImageMapType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_ImageMap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageMap(ImageMapType newImageMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_ImageMap(), newImageMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageMap(ImageMapType newImageMap) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_ImageMap(), newImageMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerType getLayer() {
		return (LayerType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Layer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayer(LayerType newLayer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Layer(), newLayer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer(LayerType newLayer) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Layer(), newLayer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerSetType getLayerSet() {
		return (LayerSetType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_LayerSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayerSet(LayerSetType newLayerSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_LayerSet(), newLayerSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerSet(LayerSetType newLayerSet) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_LayerSet(), newLayerSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType getLine() {
		return (LineType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Line(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine(LineType newLine, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Line(), newLine, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(LineType newLine) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Line(), newLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkerType getMarker() {
		return (MarkerType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Marker(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarker(MarkerType newMarker, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Marker(), newMarker, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarker(MarkerType newMarker) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Marker(), newMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getMeasure() {
		return (MeasureType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Measure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(MeasureType newMeasure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Measure(), newMeasure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(MeasureType newMeasure) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Measure(), newMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType getObject() {
		return (ObjectType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Object(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(ObjectType newObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Object(), newObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(ObjectType newObject) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Object(), newObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOleType getObjectOle() {
		return (ObjectOleType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_ObjectOle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectOle(ObjectOleType newObjectOle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_ObjectOle(), newObjectOle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectOle(ObjectOleType newObjectOle) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_ObjectOle(), newObjectOle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpacityType getOpacity() {
		return (OpacityType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Opacity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpacity(OpacityType newOpacity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Opacity(), newOpacity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity(OpacityType newOpacity) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Opacity(), newOpacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageType getPage() {
		return (PageType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Page(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPage(PageType newPage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Page(), newPage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(PageType newPage) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Page(), newPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageThumbnailType getPageThumbnail() {
		return (PageThumbnailType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_PageThumbnail(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageThumbnail(PageThumbnailType newPageThumbnail, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_PageThumbnail(), newPageThumbnail, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageThumbnail(PageThumbnailType newPageThumbnail) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_PageThumbnail(), newPageThumbnail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType getParam() {
		return (ParamType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Param(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParam(ParamType newParam, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Param(), newParam, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam(ParamType newParam) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Param(), newParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathType getPath() {
		return (PathType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Path(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(PathType newPath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Path(), newPath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(PathType newPath) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Path(), newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginType getPlugin() {
		return (PluginType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Plugin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlugin(PluginType newPlugin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Plugin(), newPlugin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugin(PluginType newPlugin) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Plugin(), newPlugin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonType getPolygon() {
		return (PolygonType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Polygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygon(PolygonType newPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Polygon(), newPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygon(PolygonType newPolygon) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Polygon(), newPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolylineType getPolyline() {
		return (PolylineType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Polyline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolyline(PolylineType newPolyline, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Polyline(), newPolyline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolyline(PolylineType newPolyline) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Polyline(), newPolyline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectType getRect() {
		return (RectType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_Rect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRect(RectType newRect, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_Rect(), newRect, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRect(RectType newRect) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_Rect(), newRect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularPolygonType getRegularPolygon() {
		return (RegularPolygonType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_RegularPolygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegularPolygon(RegularPolygonType newRegularPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_RegularPolygon(), newRegularPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegularPolygon(RegularPolygonType newRegularPolygon) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_RegularPolygon(), newRegularPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeDashType1 getStrokeDash() {
		return (StrokeDashType1)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_StrokeDash(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrokeDash(StrokeDashType1 newStrokeDash, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_StrokeDash(), newStrokeDash, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDash(StrokeDashType1 newStrokeDash) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_StrokeDash(), newStrokeDash);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBoxType getTextBox() {
		return (TextBoxType)getMixed().get(DrawingPackage.eINSTANCE.getDocumentRoot_TextBox(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextBox(TextBoxType newTextBox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DrawingPackage.eINSTANCE.getDocumentRoot_TextBox(), newTextBox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextBox(TextBoxType newTextBox) {
		((FeatureMap.Internal)getMixed()).set(DrawingPackage.eINSTANCE.getDocumentRoot_TextBox(), newTextBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(AlignType newAlign) {
		AlignType oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		boolean oldAlignESet = alignESet;
		alignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__ALIGN, oldAlign, align, !oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlign() {
		AlignType oldAlign = align;
		boolean oldAlignESet = alignESet;
		align = ALIGN_EDEFAULT;
		alignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlign() {
		return alignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(BigInteger newAngle) {
		BigInteger oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getArchive() {
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchive(Object newArchive) {
		Object oldArchive = archive;
		archive = newArchive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__ARCHIVE, oldArchive, archive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoGrowHeight() {
		return autoGrowHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoGrowHeight(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutoGrowHeight) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoGrowHeight = autoGrowHeight;
		autoGrowHeight = newAutoGrowHeight == null ? AUTO_GROW_HEIGHT_EDEFAULT : newAutoGrowHeight;
		boolean oldAutoGrowHeightESet = autoGrowHeightESet;
		autoGrowHeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__AUTO_GROW_HEIGHT, oldAutoGrowHeight, autoGrowHeight, !oldAutoGrowHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoGrowHeight() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoGrowHeight = autoGrowHeight;
		boolean oldAutoGrowHeightESet = autoGrowHeightESet;
		autoGrowHeight = AUTO_GROW_HEIGHT_EDEFAULT;
		autoGrowHeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__AUTO_GROW_HEIGHT, oldAutoGrowHeight, AUTO_GROW_HEIGHT_EDEFAULT, oldAutoGrowHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoGrowHeight() {
		return autoGrowHeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoGrowWidth() {
		return autoGrowWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoGrowWidth(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutoGrowWidth) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoGrowWidth = autoGrowWidth;
		autoGrowWidth = newAutoGrowWidth == null ? AUTO_GROW_WIDTH_EDEFAULT : newAutoGrowWidth;
		boolean oldAutoGrowWidthESet = autoGrowWidthESet;
		autoGrowWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__AUTO_GROW_WIDTH, oldAutoGrowWidth, autoGrowWidth, !oldAutoGrowWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoGrowWidth() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutoGrowWidth = autoGrowWidth;
		boolean oldAutoGrowWidthESet = autoGrowWidthESet;
		autoGrowWidth = AUTO_GROW_WIDTH_EDEFAULT;
		autoGrowWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__AUTO_GROW_WIDTH, oldAutoGrowWidth, AUTO_GROW_WIDTH_EDEFAULT, oldAutoGrowWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoGrowWidth() {
		return autoGrowWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundSizeType getBackgroundSize() {
		return backgroundSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundSize(BackgroundSizeType newBackgroundSize) {
		BackgroundSizeType oldBackgroundSize = backgroundSize;
		backgroundSize = newBackgroundSize == null ? BACKGROUND_SIZE_EDEFAULT : newBackgroundSize;
		boolean oldBackgroundSizeESet = backgroundSizeESet;
		backgroundSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__BACKGROUND_SIZE, oldBackgroundSize, backgroundSize, !oldBackgroundSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBackgroundSize() {
		BackgroundSizeType oldBackgroundSize = backgroundSize;
		boolean oldBackgroundSizeESet = backgroundSizeESet;
		backgroundSize = BACKGROUND_SIZE_EDEFAULT;
		backgroundSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__BACKGROUND_SIZE, oldBackgroundSize, BACKGROUND_SIZE_EDEFAULT, oldBackgroundSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBackgroundSize() {
		return backgroundSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlue() {
		return blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlue(String newBlue) {
		String oldBlue = blue;
		blue = newBlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__BLUE, oldBlue, blue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(String newBorder) {
		String oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCaptionAngle() {
		return captionAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionAngle(BigInteger newCaptionAngle) {
		BigInteger oldCaptionAngle = captionAngle;
		captionAngle = newCaptionAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CAPTION_ANGLE, oldCaptionAngle, captionAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionAngleTypeType getCaptionAngleType() {
		return captionAngleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionAngleType(CaptionAngleTypeType newCaptionAngleType) {
		CaptionAngleTypeType oldCaptionAngleType = captionAngleType;
		captionAngleType = newCaptionAngleType == null ? CAPTION_ANGLE_TYPE_EDEFAULT : newCaptionAngleType;
		boolean oldCaptionAngleTypeESet = captionAngleTypeESet;
		captionAngleTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CAPTION_ANGLE_TYPE, oldCaptionAngleType, captionAngleType, !oldCaptionAngleTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCaptionAngleType() {
		CaptionAngleTypeType oldCaptionAngleType = captionAngleType;
		boolean oldCaptionAngleTypeESet = captionAngleTypeESet;
		captionAngleType = CAPTION_ANGLE_TYPE_EDEFAULT;
		captionAngleTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__CAPTION_ANGLE_TYPE, oldCaptionAngleType, CAPTION_ANGLE_TYPE_EDEFAULT, oldCaptionAngleTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaptionAngleType() {
		return captionAngleTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionEscape() {
		return captionEscape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionEscape(String newCaptionEscape) {
		String oldCaptionEscape = captionEscape;
		captionEscape = newCaptionEscape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CAPTION_ESCAPE, oldCaptionEscape, captionEscape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionEscapeDirectionType getCaptionEscapeDirection() {
		return captionEscapeDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionEscapeDirection(CaptionEscapeDirectionType newCaptionEscapeDirection) {
		CaptionEscapeDirectionType oldCaptionEscapeDirection = captionEscapeDirection;
		captionEscapeDirection = newCaptionEscapeDirection == null ? CAPTION_ESCAPE_DIRECTION_EDEFAULT : newCaptionEscapeDirection;
		boolean oldCaptionEscapeDirectionESet = captionEscapeDirectionESet;
		captionEscapeDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CAPTION_ESCAPE_DIRECTION, oldCaptionEscapeDirection, captionEscapeDirection, !oldCaptionEscapeDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCaptionEscapeDirection() {
		CaptionEscapeDirectionType oldCaptionEscapeDirection = captionEscapeDirection;
		boolean oldCaptionEscapeDirectionESet = captionEscapeDirectionESet;
		captionEscapeDirection = CAPTION_ESCAPE_DIRECTION_EDEFAULT;
		captionEscapeDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__CAPTION_ESCAPE_DIRECTION, oldCaptionEscapeDirection, CAPTION_ESCAPE_DIRECTION_EDEFAULT, oldCaptionEscapeDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaptionEscapeDirection() {
		return captionEscapeDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCaptionFitLineLength() {
		return captionFitLineLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionFitLineLength(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCaptionFitLineLength) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCaptionFitLineLength = captionFitLineLength;
		captionFitLineLength = newCaptionFitLineLength == null ? CAPTION_FIT_LINE_LENGTH_EDEFAULT : newCaptionFitLineLength;
		boolean oldCaptionFitLineLengthESet = captionFitLineLengthESet;
		captionFitLineLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CAPTION_FIT_LINE_LENGTH, oldCaptionFitLineLength, captionFitLineLength, !oldCaptionFitLineLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCaptionFitLineLength() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCaptionFitLineLength = captionFitLineLength;
		boolean oldCaptionFitLineLengthESet = captionFitLineLengthESet;
		captionFitLineLength = CAPTION_FIT_LINE_LENGTH_EDEFAULT;
		captionFitLineLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__CAPTION_FIT_LINE_LENGTH, oldCaptionFitLineLength, CAPTION_FIT_LINE_LENGTH_EDEFAULT, oldCaptionFitLineLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaptionFitLineLength() {
		return captionFitLineLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionGap() {
		return captionGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionGap(String newCaptionGap) {
		String oldCaptionGap = captionGap;
		captionGap = newCaptionGap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CAPTION_GAP, oldCaptionGap, captionGap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionId() {
		return captionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionId(String newCaptionId) {
		String oldCaptionId = captionId;
		captionId = newCaptionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CAPTION_ID, oldCaptionId, captionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionLineLength() {
		return captionLineLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionLineLength(String newCaptionLineLength) {
		String oldCaptionLineLength = captionLineLength;
		captionLineLength = newCaptionLineLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CAPTION_LINE_LENGTH, oldCaptionLineLength, captionLineLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionPointX() {
		return captionPointX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionPointX(String newCaptionPointX) {
		String oldCaptionPointX = captionPointX;
		captionPointX = newCaptionPointX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CAPTION_POINT_X, oldCaptionPointX, captionPointX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionPointY() {
		return captionPointY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionPointY(String newCaptionPointY) {
		String oldCaptionPointY = captionPointY;
		captionPointY = newCaptionPointY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CAPTION_POINT_Y, oldCaptionPointY, captionPointY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionTypeType getCaptionType() {
		return captionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionType(CaptionTypeType newCaptionType) {
		CaptionTypeType oldCaptionType = captionType;
		captionType = newCaptionType == null ? CAPTION_TYPE_EDEFAULT : newCaptionType;
		boolean oldCaptionTypeESet = captionTypeESet;
		captionTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CAPTION_TYPE, oldCaptionType, captionType, !oldCaptionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCaptionType() {
		CaptionTypeType oldCaptionType = captionType;
		boolean oldCaptionTypeESet = captionTypeESet;
		captionType = CAPTION_TYPE_EDEFAULT;
		captionTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__CAPTION_TYPE, oldCaptionType, CAPTION_TYPE_EDEFAULT, oldCaptionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaptionType() {
		return captionTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChainNextName() {
		return chainNextName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainNextName(String newChainNextName) {
		String oldChainNextName = chainNextName;
		chainNextName = newChainNextName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CHAIN_NEXT_NAME, oldChainNextName, chainNextName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getClassId() {
		return classId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassId(Object newClassId) {
		Object oldClassId = classId;
		classId = newClassId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CLASS_ID, oldClassId, classId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getClassNames() {
		return classNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassNames(List<String> newClassNames) {
		List<String> oldClassNames = classNames;
		classNames = newClassNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CLASS_NAMES, oldClassNames, classNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Object newCode) {
		Object oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getColorInversion() {
		return colorInversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorInversion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newColorInversion) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldColorInversion = colorInversion;
		colorInversion = newColorInversion == null ? COLOR_INVERSION_EDEFAULT : newColorInversion;
		boolean oldColorInversionESet = colorInversionESet;
		colorInversionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__COLOR_INVERSION, oldColorInversion, colorInversion, !oldColorInversionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColorInversion() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldColorInversion = colorInversion;
		boolean oldColorInversionESet = colorInversionESet;
		colorInversion = COLOR_INVERSION_EDEFAULT;
		colorInversionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__COLOR_INVERSION, oldColorInversion, COLOR_INVERSION_EDEFAULT, oldColorInversionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColorInversion() {
		return colorInversionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorModeType getColorMode() {
		return colorMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorMode(ColorModeType newColorMode) {
		ColorModeType oldColorMode = colorMode;
		colorMode = newColorMode == null ? COLOR_MODE_EDEFAULT : newColorMode;
		boolean oldColorModeESet = colorModeESet;
		colorModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__COLOR_MODE, oldColorMode, colorMode, !oldColorModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColorMode() {
		ColorModeType oldColorMode = colorMode;
		boolean oldColorModeESet = colorModeESet;
		colorMode = COLOR_MODE_EDEFAULT;
		colorModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__COLOR_MODE, oldColorMode, COLOR_MODE_EDEFAULT, oldColorModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColorMode() {
		return colorModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcaveType getConcave() {
		return concave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcave(ConcaveType newConcave) {
		ConcaveType oldConcave = concave;
		concave = newConcave == null ? CONCAVE_EDEFAULT : newConcave;
		boolean oldConcaveESet = concaveESet;
		concaveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CONCAVE, oldConcave, concave, !oldConcaveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConcave() {
		ConcaveType oldConcave = concave;
		boolean oldConcaveESet = concaveESet;
		concave = CONCAVE_EDEFAULT;
		concaveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__CONCAVE, oldConcave, CONCAVE_EDEFAULT, oldConcaveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConcave() {
		return concaveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getConcentricGradientFillAllowed() {
		return concentricGradientFillAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcentricGradientFillAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newConcentricGradientFillAllowed) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldConcentricGradientFillAllowed = concentricGradientFillAllowed;
		concentricGradientFillAllowed = newConcentricGradientFillAllowed == null ? CONCENTRIC_GRADIENT_FILL_ALLOWED_EDEFAULT : newConcentricGradientFillAllowed;
		boolean oldConcentricGradientFillAllowedESet = concentricGradientFillAllowedESet;
		concentricGradientFillAllowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CONCENTRIC_GRADIENT_FILL_ALLOWED, oldConcentricGradientFillAllowed, concentricGradientFillAllowed, !oldConcentricGradientFillAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConcentricGradientFillAllowed() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldConcentricGradientFillAllowed = concentricGradientFillAllowed;
		boolean oldConcentricGradientFillAllowedESet = concentricGradientFillAllowedESet;
		concentricGradientFillAllowed = CONCENTRIC_GRADIENT_FILL_ALLOWED_EDEFAULT;
		concentricGradientFillAllowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__CONCENTRIC_GRADIENT_FILL_ALLOWED, oldConcentricGradientFillAllowed, CONCENTRIC_GRADIENT_FILL_ALLOWED_EDEFAULT, oldConcentricGradientFillAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConcentricGradientFillAllowed() {
		return concentricGradientFillAllowedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContrast() {
		return contrast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContrast(String newContrast) {
		String oldContrast = contrast;
		contrast = newContrast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CONTRAST, oldContrast, contrast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControl1() {
		return control1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl1(String newControl1) {
		String oldControl1 = control1;
		control1 = newControl1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CONTROL1, oldControl1, control1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyOf() {
		return copyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyOf(String newCopyOf) {
		String oldCopyOf = copyOf;
		copyOf = newCopyOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__COPY_OF, oldCopyOf, copyOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCornerRadius() {
		return cornerRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCornerRadius(String newCornerRadius) {
		String oldCornerRadius = cornerRadius;
		cornerRadius = newCornerRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CORNER_RADIUS, oldCornerRadius, cornerRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCorners() {
		return corners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorners(BigInteger newCorners) {
		BigInteger oldCorners = corners;
		corners = newCorners;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CORNERS, oldCorners, corners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCx() {
		return cx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCx(String newCx) {
		String oldCx = cx;
		cx = newCx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CX, oldCx, cx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCy() {
		return cy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCy(String newCy) {
		String oldCy = cy;
		cy = newCy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__CY, oldCy, cy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDecimalPlaces() {
		return decimalPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalPlaces(BigInteger newDecimalPlaces) {
		BigInteger oldDecimalPlaces = decimalPlaces;
		decimalPlaces = newDecimalPlaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__DECIMAL_PLACES, oldDecimalPlaces, decimalPlaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(DisplayType newDisplay) {
		DisplayType oldDisplay = display;
		display = newDisplay == null ? DISPLAY_EDEFAULT : newDisplay;
		boolean oldDisplayESet = displayESet;
		displayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__DISPLAY, oldDisplay, display, !oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplay() {
		DisplayType oldDisplay = display;
		boolean oldDisplayESet = displayESet;
		display = DISPLAY_EDEFAULT;
		displayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__DISPLAY, oldDisplay, DISPLAY_EDEFAULT, oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplay() {
		return displayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(String newDistance) {
		String oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDots1() {
		return dots1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDots1(BigInteger newDots1) {
		BigInteger oldDots1 = dots1;
		dots1 = newDots1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__DOTS1, oldDots1, dots1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDots1Length() {
		return dots1Length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDots1Length(String newDots1Length) {
		String oldDots1Length = dots1Length;
		dots1Length = newDots1Length;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__DOTS1_LENGTH, oldDots1Length, dots1Length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDots2() {
		return dots2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDots2(BigInteger newDots2) {
		BigInteger oldDots2 = dots2;
		dots2 = newDots2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__DOTS2, oldDots2, dots2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDots2Length() {
		return dots2Length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDots2Length(String newDots2Length) {
		String oldDots2Length = dots2Length;
		dots2Length = newDots2Length;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__DOTS2_LENGTH, oldDots2Length, dots2Length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(String newEnd) {
		String oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndAngle() {
		return endAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndAngle(double newEndAngle) {
		double oldEndAngle = endAngle;
		endAngle = newEndAngle;
		boolean oldEndAngleESet = endAngleESet;
		endAngleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__END_ANGLE, oldEndAngle, endAngle, !oldEndAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndAngle() {
		double oldEndAngle = endAngle;
		boolean oldEndAngleESet = endAngleESet;
		endAngle = END_ANGLE_EDEFAULT;
		endAngleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__END_ANGLE, oldEndAngle, END_ANGLE_EDEFAULT, oldEndAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndAngle() {
		return endAngleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndColor() {
		return endColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndColor(String newEndColor) {
		String oldEndColor = endColor;
		endColor = newEndColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__END_COLOR, oldEndColor, endColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndGluePoint() {
		return endGluePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndGluePoint(BigInteger newEndGluePoint) {
		BigInteger oldEndGluePoint = endGluePoint;
		endGluePoint = newEndGluePoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__END_GLUE_POINT, oldEndGluePoint, endGluePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndGuide() {
		return endGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndGuide(String newEndGuide) {
		String oldEndGuide = endGuide;
		endGuide = newEndGuide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__END_GUIDE, oldEndGuide, endGuide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndIntensity() {
		return endIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndIntensity(String newEndIntensity) {
		String oldEndIntensity = endIntensity;
		endIntensity = newEndIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__END_INTENSITY, oldEndIntensity, endIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndLineSpacingHorizontal() {
		return endLineSpacingHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndLineSpacingHorizontal(String newEndLineSpacingHorizontal) {
		String oldEndLineSpacingHorizontal = endLineSpacingHorizontal;
		endLineSpacingHorizontal = newEndLineSpacingHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__END_LINE_SPACING_HORIZONTAL, oldEndLineSpacingHorizontal, endLineSpacingHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndLineSpacingVertical() {
		return endLineSpacingVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndLineSpacingVertical(String newEndLineSpacingVertical) {
		String oldEndLineSpacingVertical = endLineSpacingVertical;
		endLineSpacingVertical = newEndLineSpacingVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__END_LINE_SPACING_VERTICAL, oldEndLineSpacingVertical, endLineSpacingVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndShape() {
		return endShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndShape(String newEndShape) {
		String oldEndShape = endShape;
		endShape = newEndShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__END_SHAPE, oldEndShape, endShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngine() {
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine(String newEngine) {
		String oldEngine = engine;
		engine = newEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__ENGINE, oldEngine, engine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnhancedPath() {
		return enhancedPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnhancedPath(String newEnhancedPath) {
		String oldEnhancedPath = enhancedPath;
		enhancedPath = newEnhancedPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__ENHANCED_PATH, oldEnhancedPath, enhancedPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscapeDirectionType getEscapeDirection() {
		return escapeDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscapeDirection(EscapeDirectionType newEscapeDirection) {
		EscapeDirectionType oldEscapeDirection = escapeDirection;
		escapeDirection = newEscapeDirection == null ? ESCAPE_DIRECTION_EDEFAULT : newEscapeDirection;
		boolean oldEscapeDirectionESet = escapeDirectionESet;
		escapeDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__ESCAPE_DIRECTION, oldEscapeDirection, escapeDirection, !oldEscapeDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEscapeDirection() {
		EscapeDirectionType oldEscapeDirection = escapeDirection;
		boolean oldEscapeDirectionESet = escapeDirectionESet;
		escapeDirection = ESCAPE_DIRECTION_EDEFAULT;
		escapeDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__ESCAPE_DIRECTION, oldEscapeDirection, ESCAPE_DIRECTION_EDEFAULT, oldEscapeDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEscapeDirection() {
		return escapeDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusion() {
		return extrusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusion) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusion = extrusion;
		extrusion = newExtrusion == null ? EXTRUSION_EDEFAULT : newExtrusion;
		boolean oldExtrusionESet = extrusionESet;
		extrusionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION, oldExtrusion, extrusion, !oldExtrusionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusion() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusion = extrusion;
		boolean oldExtrusionESet = extrusionESet;
		extrusion = EXTRUSION_EDEFAULT;
		extrusionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION, oldExtrusion, EXTRUSION_EDEFAULT, oldExtrusionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusion() {
		return extrusionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionAllowed() {
		return extrusionAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusionAllowed) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionAllowed = extrusionAllowed;
		extrusionAllowed = newExtrusionAllowed == null ? EXTRUSION_ALLOWED_EDEFAULT : newExtrusionAllowed;
		boolean oldExtrusionAllowedESet = extrusionAllowedESet;
		extrusionAllowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ALLOWED, oldExtrusionAllowed, extrusionAllowed, !oldExtrusionAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionAllowed() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionAllowed = extrusionAllowed;
		boolean oldExtrusionAllowedESet = extrusionAllowedESet;
		extrusionAllowed = EXTRUSION_ALLOWED_EDEFAULT;
		extrusionAllowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ALLOWED, oldExtrusionAllowed, EXTRUSION_ALLOWED_EDEFAULT, oldExtrusionAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionAllowed() {
		return extrusionAllowedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionBrightness() {
		return extrusionBrightness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionBrightness(String newExtrusionBrightness) {
		String oldExtrusionBrightness = extrusionBrightness;
		extrusionBrightness = newExtrusionBrightness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_BRIGHTNESS, oldExtrusionBrightness, extrusionBrightness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionColor() {
		return extrusionColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusionColor) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionColor = extrusionColor;
		extrusionColor = newExtrusionColor == null ? EXTRUSION_COLOR_EDEFAULT : newExtrusionColor;
		boolean oldExtrusionColorESet = extrusionColorESet;
		extrusionColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_COLOR, oldExtrusionColor, extrusionColor, !oldExtrusionColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionColor() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionColor = extrusionColor;
		boolean oldExtrusionColorESet = extrusionColorESet;
		extrusionColor = EXTRUSION_COLOR_EDEFAULT;
		extrusionColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_COLOR, oldExtrusionColor, EXTRUSION_COLOR_EDEFAULT, oldExtrusionColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionColor() {
		return extrusionColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtrusionDepth() {
		return extrusionDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionDepth(List newExtrusionDepth) {
		List oldExtrusionDepth = extrusionDepth;
		extrusionDepth = newExtrusionDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_DEPTH, oldExtrusionDepth, extrusionDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionDiffusion() {
		return extrusionDiffusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionDiffusion(String newExtrusionDiffusion) {
		String oldExtrusionDiffusion = extrusionDiffusion;
		extrusionDiffusion = newExtrusionDiffusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_DIFFUSION, oldExtrusionDiffusion, extrusionDiffusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionFirstLightDirection() {
		return extrusionFirstLightDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionFirstLightDirection(String newExtrusionFirstLightDirection) {
		String oldExtrusionFirstLightDirection = extrusionFirstLightDirection;
		extrusionFirstLightDirection = newExtrusionFirstLightDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_DIRECTION, oldExtrusionFirstLightDirection, extrusionFirstLightDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionFirstLightHarsh() {
		return extrusionFirstLightHarsh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionFirstLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusionFirstLightHarsh) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionFirstLightHarsh = extrusionFirstLightHarsh;
		extrusionFirstLightHarsh = newExtrusionFirstLightHarsh == null ? EXTRUSION_FIRST_LIGHT_HARSH_EDEFAULT : newExtrusionFirstLightHarsh;
		boolean oldExtrusionFirstLightHarshESet = extrusionFirstLightHarshESet;
		extrusionFirstLightHarshESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_HARSH, oldExtrusionFirstLightHarsh, extrusionFirstLightHarsh, !oldExtrusionFirstLightHarshESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionFirstLightHarsh() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionFirstLightHarsh = extrusionFirstLightHarsh;
		boolean oldExtrusionFirstLightHarshESet = extrusionFirstLightHarshESet;
		extrusionFirstLightHarsh = EXTRUSION_FIRST_LIGHT_HARSH_EDEFAULT;
		extrusionFirstLightHarshESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_HARSH, oldExtrusionFirstLightHarsh, EXTRUSION_FIRST_LIGHT_HARSH_EDEFAULT, oldExtrusionFirstLightHarshESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionFirstLightHarsh() {
		return extrusionFirstLightHarshESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionFirstLightLevel() {
		return extrusionFirstLightLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionFirstLightLevel(String newExtrusionFirstLightLevel) {
		String oldExtrusionFirstLightLevel = extrusionFirstLightLevel;
		extrusionFirstLightLevel = newExtrusionFirstLightLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_LEVEL, oldExtrusionFirstLightLevel, extrusionFirstLightLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionLightFace() {
		return extrusionLightFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionLightFace(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusionLightFace) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionLightFace = extrusionLightFace;
		extrusionLightFace = newExtrusionLightFace == null ? EXTRUSION_LIGHT_FACE_EDEFAULT : newExtrusionLightFace;
		boolean oldExtrusionLightFaceESet = extrusionLightFaceESet;
		extrusionLightFaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_LIGHT_FACE, oldExtrusionLightFace, extrusionLightFace, !oldExtrusionLightFaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionLightFace() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionLightFace = extrusionLightFace;
		boolean oldExtrusionLightFaceESet = extrusionLightFaceESet;
		extrusionLightFace = EXTRUSION_LIGHT_FACE_EDEFAULT;
		extrusionLightFaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_LIGHT_FACE, oldExtrusionLightFace, EXTRUSION_LIGHT_FACE_EDEFAULT, oldExtrusionLightFaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionLightFace() {
		return extrusionLightFaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionMetal() {
		return extrusionMetal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionMetal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusionMetal) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionMetal = extrusionMetal;
		extrusionMetal = newExtrusionMetal == null ? EXTRUSION_METAL_EDEFAULT : newExtrusionMetal;
		boolean oldExtrusionMetalESet = extrusionMetalESet;
		extrusionMetalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_METAL, oldExtrusionMetal, extrusionMetal, !oldExtrusionMetalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionMetal() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionMetal = extrusionMetal;
		boolean oldExtrusionMetalESet = extrusionMetalESet;
		extrusionMetal = EXTRUSION_METAL_EDEFAULT;
		extrusionMetalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_METAL, oldExtrusionMetal, EXTRUSION_METAL_EDEFAULT, oldExtrusionMetalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionMetal() {
		return extrusionMetalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getExtrusionNumberOfLineSegments() {
		return extrusionNumberOfLineSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionNumberOfLineSegments(BigInteger newExtrusionNumberOfLineSegments) {
		BigInteger oldExtrusionNumberOfLineSegments = extrusionNumberOfLineSegments;
		extrusionNumberOfLineSegments = newExtrusionNumberOfLineSegments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_NUMBER_OF_LINE_SEGMENTS, oldExtrusionNumberOfLineSegments, extrusionNumberOfLineSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtrusionOrigin() {
		return extrusionOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionOrigin(List newExtrusionOrigin) {
		List oldExtrusionOrigin = extrusionOrigin;
		extrusionOrigin = newExtrusionOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ORIGIN, oldExtrusionOrigin, extrusionOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtrusionRotationAngle() {
		return extrusionRotationAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionRotationAngle(List newExtrusionRotationAngle) {
		List oldExtrusionRotationAngle = extrusionRotationAngle;
		extrusionRotationAngle = newExtrusionRotationAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ROTATION_ANGLE, oldExtrusionRotationAngle, extrusionRotationAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionRotationCenter() {
		return extrusionRotationCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionRotationCenter(String newExtrusionRotationCenter) {
		String oldExtrusionRotationCenter = extrusionRotationCenter;
		extrusionRotationCenter = newExtrusionRotationCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ROTATION_CENTER, oldExtrusionRotationCenter, extrusionRotationCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionSecondLightDirection() {
		return extrusionSecondLightDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionSecondLightDirection(String newExtrusionSecondLightDirection) {
		String oldExtrusionSecondLightDirection = extrusionSecondLightDirection;
		extrusionSecondLightDirection = newExtrusionSecondLightDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_DIRECTION, oldExtrusionSecondLightDirection, extrusionSecondLightDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionSecondLightHarsh() {
		return extrusionSecondLightHarsh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionSecondLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExtrusionSecondLightHarsh) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionSecondLightHarsh = extrusionSecondLightHarsh;
		extrusionSecondLightHarsh = newExtrusionSecondLightHarsh == null ? EXTRUSION_SECOND_LIGHT_HARSH_EDEFAULT : newExtrusionSecondLightHarsh;
		boolean oldExtrusionSecondLightHarshESet = extrusionSecondLightHarshESet;
		extrusionSecondLightHarshESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_HARSH, oldExtrusionSecondLightHarsh, extrusionSecondLightHarsh, !oldExtrusionSecondLightHarshESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrusionSecondLightHarsh() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExtrusionSecondLightHarsh = extrusionSecondLightHarsh;
		boolean oldExtrusionSecondLightHarshESet = extrusionSecondLightHarshESet;
		extrusionSecondLightHarsh = EXTRUSION_SECOND_LIGHT_HARSH_EDEFAULT;
		extrusionSecondLightHarshESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_HARSH, oldExtrusionSecondLightHarsh, EXTRUSION_SECOND_LIGHT_HARSH_EDEFAULT, oldExtrusionSecondLightHarshESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrusionSecondLightHarsh() {
		return extrusionSecondLightHarshESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionSecondLightLevel() {
		return extrusionSecondLightLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionSecondLightLevel(String newExtrusionSecondLightLevel) {
		String oldExtrusionSecondLightLevel = extrusionSecondLightLevel;
		extrusionSecondLightLevel = newExtrusionSecondLightLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_LEVEL, oldExtrusionSecondLightLevel, extrusionSecondLightLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionShininess() {
		return extrusionShininess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionShininess(String newExtrusionShininess) {
		String oldExtrusionShininess = extrusionShininess;
		extrusionShininess = newExtrusionShininess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SHININESS, oldExtrusionShininess, extrusionShininess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getExtrusionSkew() {
		return extrusionSkew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionSkew(List newExtrusionSkew) {
		List oldExtrusionSkew = extrusionSkew;
		extrusionSkew = newExtrusionSkew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SKEW, oldExtrusionSkew, extrusionSkew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionSpecularity() {
		return extrusionSpecularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionSpecularity(String newExtrusionSpecularity) {
		String oldExtrusionSpecularity = extrusionSpecularity;
		extrusionSpecularity = newExtrusionSpecularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SPECULARITY, oldExtrusionSpecularity, extrusionSpecularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtrusionViewpoint() {
		return extrusionViewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrusionViewpoint(String newExtrusionViewpoint) {
		String oldExtrusionViewpoint = extrusionViewpoint;
		extrusionViewpoint = newExtrusionViewpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__EXTRUSION_VIEWPOINT, oldExtrusionViewpoint, extrusionViewpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillType getFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(FillType newFill) {
		FillType oldFill = fill;
		fill = newFill == null ? FILL_EDEFAULT : newFill;
		boolean oldFillESet = fillESet;
		fillESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FILL, oldFill, fill, !oldFillESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFill() {
		FillType oldFill = fill;
		boolean oldFillESet = fillESet;
		fill = FILL_EDEFAULT;
		fillESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__FILL, oldFill, FILL_EDEFAULT, oldFillESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFill() {
		return fillESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillColor() {
		return fillColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillColor(String newFillColor) {
		String oldFillColor = fillColor;
		fillColor = newFillColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FILL_COLOR, oldFillColor, fillColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillGradientName() {
		return fillGradientName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillGradientName(String newFillGradientName) {
		String oldFillGradientName = fillGradientName;
		fillGradientName = newFillGradientName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FILL_GRADIENT_NAME, oldFillGradientName, fillGradientName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillHatchName() {
		return fillHatchName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillHatchName(String newFillHatchName) {
		String oldFillHatchName = fillHatchName;
		fillHatchName = newFillHatchName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FILL_HATCH_NAME, oldFillHatchName, fillHatchName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFillHatchSolid() {
		return fillHatchSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillHatchSolid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newFillHatchSolid) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFillHatchSolid = fillHatchSolid;
		fillHatchSolid = newFillHatchSolid == null ? FILL_HATCH_SOLID_EDEFAULT : newFillHatchSolid;
		boolean oldFillHatchSolidESet = fillHatchSolidESet;
		fillHatchSolidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FILL_HATCH_SOLID, oldFillHatchSolid, fillHatchSolid, !oldFillHatchSolidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillHatchSolid() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFillHatchSolid = fillHatchSolid;
		boolean oldFillHatchSolidESet = fillHatchSolidESet;
		fillHatchSolid = FILL_HATCH_SOLID_EDEFAULT;
		fillHatchSolidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__FILL_HATCH_SOLID, oldFillHatchSolid, FILL_HATCH_SOLID_EDEFAULT, oldFillHatchSolidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillHatchSolid() {
		return fillHatchSolidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillImageHeight() {
		return fillImageHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillImageHeight(String newFillImageHeight) {
		String oldFillImageHeight = fillImageHeight;
		fillImageHeight = newFillImageHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_HEIGHT, oldFillImageHeight, fillImageHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillImageName() {
		return fillImageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillImageName(String newFillImageName) {
		String oldFillImageName = fillImageName;
		fillImageName = newFillImageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_NAME, oldFillImageName, fillImageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillImageRefPointType getFillImageRefPoint() {
		return fillImageRefPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillImageRefPoint(FillImageRefPointType newFillImageRefPoint) {
		FillImageRefPointType oldFillImageRefPoint = fillImageRefPoint;
		fillImageRefPoint = newFillImageRefPoint == null ? FILL_IMAGE_REF_POINT_EDEFAULT : newFillImageRefPoint;
		boolean oldFillImageRefPointESet = fillImageRefPointESet;
		fillImageRefPointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT, oldFillImageRefPoint, fillImageRefPoint, !oldFillImageRefPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillImageRefPoint() {
		FillImageRefPointType oldFillImageRefPoint = fillImageRefPoint;
		boolean oldFillImageRefPointESet = fillImageRefPointESet;
		fillImageRefPoint = FILL_IMAGE_REF_POINT_EDEFAULT;
		fillImageRefPointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT, oldFillImageRefPoint, FILL_IMAGE_REF_POINT_EDEFAULT, oldFillImageRefPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillImageRefPoint() {
		return fillImageRefPointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillImageRefPointX() {
		return fillImageRefPointX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillImageRefPointX(String newFillImageRefPointX) {
		String oldFillImageRefPointX = fillImageRefPointX;
		fillImageRefPointX = newFillImageRefPointX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT_X, oldFillImageRefPointX, fillImageRefPointX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillImageRefPointY() {
		return fillImageRefPointY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillImageRefPointY(String newFillImageRefPointY) {
		String oldFillImageRefPointY = fillImageRefPointY;
		fillImageRefPointY = newFillImageRefPointY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT_Y, oldFillImageRefPointY, fillImageRefPointY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillImageWidth() {
		return fillImageWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillImageWidth(String newFillImageWidth) {
		String oldFillImageWidth = fillImageWidth;
		fillImageWidth = newFillImageWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_WIDTH, oldFillImageWidth, fillImageWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterName() {
		return filterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterName(String newFilterName) {
		String oldFilterName = filterName;
		filterName = newFilterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FILTER_NAME, oldFilterName, filterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFitToContour() {
		return fitToContour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFitToContour(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newFitToContour) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFitToContour = fitToContour;
		fitToContour = newFitToContour == null ? FIT_TO_CONTOUR_EDEFAULT : newFitToContour;
		boolean oldFitToContourESet = fitToContourESet;
		fitToContourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FIT_TO_CONTOUR, oldFitToContour, fitToContour, !oldFitToContourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFitToContour() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFitToContour = fitToContour;
		boolean oldFitToContourESet = fitToContourESet;
		fitToContour = FIT_TO_CONTOUR_EDEFAULT;
		fitToContourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__FIT_TO_CONTOUR, oldFitToContour, FIT_TO_CONTOUR_EDEFAULT, oldFitToContourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFitToContour() {
		return fitToContourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFitToSize() {
		return fitToSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFitToSize(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newFitToSize) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFitToSize = fitToSize;
		fitToSize = newFitToSize == null ? FIT_TO_SIZE_EDEFAULT : newFitToSize;
		boolean oldFitToSizeESet = fitToSizeESet;
		fitToSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FIT_TO_SIZE, oldFitToSize, fitToSize, !oldFitToSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFitToSize() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFitToSize = fitToSize;
		boolean oldFitToSizeESet = fitToSizeESet;
		fitToSize = FIT_TO_SIZE_EDEFAULT;
		fitToSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__FIT_TO_SIZE, oldFitToSize, FIT_TO_SIZE_EDEFAULT, oldFitToSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFitToSize() {
		return fitToSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		String oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FORMULA, oldFormula, formula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFrameDisplayBorder() {
		return frameDisplayBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newFrameDisplayBorder) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFrameDisplayBorder = frameDisplayBorder;
		frameDisplayBorder = newFrameDisplayBorder == null ? FRAME_DISPLAY_BORDER_EDEFAULT : newFrameDisplayBorder;
		boolean oldFrameDisplayBorderESet = frameDisplayBorderESet;
		frameDisplayBorderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FRAME_DISPLAY_BORDER, oldFrameDisplayBorder, frameDisplayBorder, !oldFrameDisplayBorderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrameDisplayBorder() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFrameDisplayBorder = frameDisplayBorder;
		boolean oldFrameDisplayBorderESet = frameDisplayBorderESet;
		frameDisplayBorder = FRAME_DISPLAY_BORDER_EDEFAULT;
		frameDisplayBorderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__FRAME_DISPLAY_BORDER, oldFrameDisplayBorder, FRAME_DISPLAY_BORDER_EDEFAULT, oldFrameDisplayBorderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrameDisplayBorder() {
		return frameDisplayBorderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFrameDisplayScrollbar() {
		return frameDisplayScrollbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameDisplayScrollbar(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newFrameDisplayScrollbar) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFrameDisplayScrollbar = frameDisplayScrollbar;
		frameDisplayScrollbar = newFrameDisplayScrollbar == null ? FRAME_DISPLAY_SCROLLBAR_EDEFAULT : newFrameDisplayScrollbar;
		boolean oldFrameDisplayScrollbarESet = frameDisplayScrollbarESet;
		frameDisplayScrollbarESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FRAME_DISPLAY_SCROLLBAR, oldFrameDisplayScrollbar, frameDisplayScrollbar, !oldFrameDisplayScrollbarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrameDisplayScrollbar() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFrameDisplayScrollbar = frameDisplayScrollbar;
		boolean oldFrameDisplayScrollbarESet = frameDisplayScrollbarESet;
		frameDisplayScrollbar = FRAME_DISPLAY_SCROLLBAR_EDEFAULT;
		frameDisplayScrollbarESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__FRAME_DISPLAY_SCROLLBAR, oldFrameDisplayScrollbar, FRAME_DISPLAY_SCROLLBAR_EDEFAULT, oldFrameDisplayScrollbarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrameDisplayScrollbar() {
		return frameDisplayScrollbarESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrameMarginHorizontal() {
		return frameMarginHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameMarginHorizontal(String newFrameMarginHorizontal) {
		String oldFrameMarginHorizontal = frameMarginHorizontal;
		frameMarginHorizontal = newFrameMarginHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FRAME_MARGIN_HORIZONTAL, oldFrameMarginHorizontal, frameMarginHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrameMarginVertical() {
		return frameMarginVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameMarginVertical(String newFrameMarginVertical) {
		String oldFrameMarginVertical = frameMarginVertical;
		frameMarginVertical = newFrameMarginVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FRAME_MARGIN_VERTICAL, oldFrameMarginVertical, frameMarginVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrameName() {
		return frameName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameName(String newFrameName) {
		String oldFrameName = frameName;
		frameName = newFrameName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__FRAME_NAME, oldFrameName, frameName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGamma() {
		return gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGamma(String newGamma) {
		String oldGamma = gamma;
		gamma = newGamma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__GAMMA, oldGamma, gamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getGluePointLeavingDirections() {
		return gluePointLeavingDirections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGluePointLeavingDirections(Object newGluePointLeavingDirections) {
		Object oldGluePointLeavingDirections = gluePointLeavingDirections;
		gluePointLeavingDirections = newGluePointLeavingDirections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__GLUE_POINT_LEAVING_DIRECTIONS, oldGluePointLeavingDirections, gluePointLeavingDirections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGluePoints() {
		return gluePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGluePoints(String newGluePoints) {
		String oldGluePoints = gluePoints;
		gluePoints = newGluePoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__GLUE_POINTS, oldGluePoints, gluePoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GluePointTypeType getGluePointType() {
		return gluePointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGluePointType(GluePointTypeType newGluePointType) {
		GluePointTypeType oldGluePointType = gluePointType;
		gluePointType = newGluePointType == null ? GLUE_POINT_TYPE_EDEFAULT : newGluePointType;
		boolean oldGluePointTypeESet = gluePointTypeESet;
		gluePointTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__GLUE_POINT_TYPE, oldGluePointType, gluePointType, !oldGluePointTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGluePointType() {
		GluePointTypeType oldGluePointType = gluePointType;
		boolean oldGluePointTypeESet = gluePointTypeESet;
		gluePointType = GLUE_POINT_TYPE_EDEFAULT;
		gluePointTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__GLUE_POINT_TYPE, oldGluePointType, GLUE_POINT_TYPE_EDEFAULT, oldGluePointTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGluePointType() {
		return gluePointTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getGradientStepCount() {
		return gradientStepCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientStepCount(BigInteger newGradientStepCount) {
		BigInteger oldGradientStepCount = gradientStepCount;
		gradientStepCount = newGradientStepCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__GRADIENT_STEP_COUNT, oldGradientStepCount, gradientStepCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGreen() {
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreen(String newGreen) {
		String oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__GREEN, oldGreen, green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuideDistance() {
		return guideDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuideDistance(String newGuideDistance) {
		String oldGuideDistance = guideDistance;
		guideDistance = newGuideDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__GUIDE_DISTANCE, oldGuideDistance, guideDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuideOverhang() {
		return guideOverhang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuideOverhang(String newGuideOverhang) {
		String oldGuideOverhang = guideOverhang;
		guideOverhang = newGuideOverhang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__GUIDE_OVERHANG, oldGuideOverhang, guideOverhang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHandleMirrorHorizontal() {
		return handleMirrorHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newHandleMirrorHorizontal) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHandleMirrorHorizontal = handleMirrorHorizontal;
		handleMirrorHorizontal = newHandleMirrorHorizontal == null ? HANDLE_MIRROR_HORIZONTAL_EDEFAULT : newHandleMirrorHorizontal;
		boolean oldHandleMirrorHorizontalESet = handleMirrorHorizontalESet;
		handleMirrorHorizontalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__HANDLE_MIRROR_HORIZONTAL, oldHandleMirrorHorizontal, handleMirrorHorizontal, !oldHandleMirrorHorizontalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHandleMirrorHorizontal() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHandleMirrorHorizontal = handleMirrorHorizontal;
		boolean oldHandleMirrorHorizontalESet = handleMirrorHorizontalESet;
		handleMirrorHorizontal = HANDLE_MIRROR_HORIZONTAL_EDEFAULT;
		handleMirrorHorizontalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__HANDLE_MIRROR_HORIZONTAL, oldHandleMirrorHorizontal, HANDLE_MIRROR_HORIZONTAL_EDEFAULT, oldHandleMirrorHorizontalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHandleMirrorHorizontal() {
		return handleMirrorHorizontalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHandleMirrorVertical() {
		return handleMirrorVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newHandleMirrorVertical) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHandleMirrorVertical = handleMirrorVertical;
		handleMirrorVertical = newHandleMirrorVertical == null ? HANDLE_MIRROR_VERTICAL_EDEFAULT : newHandleMirrorVertical;
		boolean oldHandleMirrorVerticalESet = handleMirrorVerticalESet;
		handleMirrorVerticalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__HANDLE_MIRROR_VERTICAL, oldHandleMirrorVertical, handleMirrorVertical, !oldHandleMirrorVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHandleMirrorVertical() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHandleMirrorVertical = handleMirrorVertical;
		boolean oldHandleMirrorVerticalESet = handleMirrorVerticalESet;
		handleMirrorVertical = HANDLE_MIRROR_VERTICAL_EDEFAULT;
		handleMirrorVerticalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__HANDLE_MIRROR_VERTICAL, oldHandleMirrorVertical, HANDLE_MIRROR_VERTICAL_EDEFAULT, oldHandleMirrorVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHandleMirrorVertical() {
		return handleMirrorVerticalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandlePolar() {
		return handlePolar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlePolar(String newHandlePolar) {
		String oldHandlePolar = handlePolar;
		handlePolar = newHandlePolar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__HANDLE_POLAR, oldHandlePolar, handlePolar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandlePosition() {
		return handlePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlePosition(String newHandlePosition) {
		String oldHandlePosition = handlePosition;
		handlePosition = newHandlePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__HANDLE_POSITION, oldHandlePosition, handlePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleRadiusRangeMaximum() {
		return handleRadiusRangeMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleRadiusRangeMaximum(String newHandleRadiusRangeMaximum) {
		String oldHandleRadiusRangeMaximum = handleRadiusRangeMaximum;
		handleRadiusRangeMaximum = newHandleRadiusRangeMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__HANDLE_RADIUS_RANGE_MAXIMUM, oldHandleRadiusRangeMaximum, handleRadiusRangeMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleRadiusRangeMinimum() {
		return handleRadiusRangeMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleRadiusRangeMinimum(String newHandleRadiusRangeMinimum) {
		String oldHandleRadiusRangeMinimum = handleRadiusRangeMinimum;
		handleRadiusRangeMinimum = newHandleRadiusRangeMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__HANDLE_RADIUS_RANGE_MINIMUM, oldHandleRadiusRangeMinimum, handleRadiusRangeMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleRangeXMaximum() {
		return handleRangeXMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleRangeXMaximum(String newHandleRangeXMaximum) {
		String oldHandleRangeXMaximum = handleRangeXMaximum;
		handleRangeXMaximum = newHandleRangeXMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_XMAXIMUM, oldHandleRangeXMaximum, handleRangeXMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleRangeXMinimum() {
		return handleRangeXMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleRangeXMinimum(String newHandleRangeXMinimum) {
		String oldHandleRangeXMinimum = handleRangeXMinimum;
		handleRangeXMinimum = newHandleRangeXMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_XMINIMUM, oldHandleRangeXMinimum, handleRangeXMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleRangeYMaximum() {
		return handleRangeYMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleRangeYMaximum(String newHandleRangeYMaximum) {
		String oldHandleRangeYMaximum = handleRangeYMaximum;
		handleRangeYMaximum = newHandleRangeYMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_YMAXIMUM, oldHandleRangeYMaximum, handleRangeYMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleRangeYMinimum() {
		return handleRangeYMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleRangeYMinimum(String newHandleRangeYMinimum) {
		String oldHandleRangeYMinimum = handleRangeYMinimum;
		handleRangeYMinimum = newHandleRangeYMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_YMINIMUM, oldHandleRangeYMinimum, handleRangeYMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHandleSwitched() {
		return handleSwitched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleSwitched(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newHandleSwitched) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHandleSwitched = handleSwitched;
		handleSwitched = newHandleSwitched == null ? HANDLE_SWITCHED_EDEFAULT : newHandleSwitched;
		boolean oldHandleSwitchedESet = handleSwitchedESet;
		handleSwitchedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__HANDLE_SWITCHED, oldHandleSwitched, handleSwitched, !oldHandleSwitchedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHandleSwitched() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHandleSwitched = handleSwitched;
		boolean oldHandleSwitchedESet = handleSwitchedESet;
		handleSwitched = HANDLE_SWITCHED_EDEFAULT;
		handleSwitchedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__HANDLE_SWITCHED, oldHandleSwitched, HANDLE_SWITCHED_EDEFAULT, oldHandleSwitchedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHandleSwitched() {
		return handleSwitchedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageOpacity() {
		return imageOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageOpacity(String newImageOpacity) {
		String oldImageOpacity = imageOpacity;
		imageOpacity = newImageOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__IMAGE_OPACITY, oldImageOpacity, imageOpacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindType getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(KindType newKind) {
		KindType oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind() {
		KindType oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLayer1() {
		return layer1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer1(String newLayer1) {
		String oldLayer1 = layer1;
		layer1 = newLayer1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__LAYER1, oldLayer1, layer1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineDistance() {
		return lineDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineDistance(String newLineDistance) {
		String oldLineDistance = lineDistance;
		lineDistance = newLineDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__LINE_DISTANCE, oldLineDistance, lineDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getLineSkew() {
		return lineSkew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineSkew(List newLineSkew) {
		List oldLineSkew = lineSkew;
		lineSkew = newLineSkew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__LINE_SKEW, oldLineSkew, lineSkew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLuminance() {
		return luminance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuminance(String newLuminance) {
		String oldLuminance = luminance;
		luminance = newLuminance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__LUMINANCE, oldLuminance, luminance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerEnd() {
		return markerEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerEnd(String newMarkerEnd) {
		String oldMarkerEnd = markerEnd;
		markerEnd = newMarkerEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MARKER_END, oldMarkerEnd, markerEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMarkerEndCenter() {
		return markerEndCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerEndCenter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMarkerEndCenter) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMarkerEndCenter = markerEndCenter;
		markerEndCenter = newMarkerEndCenter == null ? MARKER_END_CENTER_EDEFAULT : newMarkerEndCenter;
		boolean oldMarkerEndCenterESet = markerEndCenterESet;
		markerEndCenterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MARKER_END_CENTER, oldMarkerEndCenter, markerEndCenter, !oldMarkerEndCenterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarkerEndCenter() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMarkerEndCenter = markerEndCenter;
		boolean oldMarkerEndCenterESet = markerEndCenterESet;
		markerEndCenter = MARKER_END_CENTER_EDEFAULT;
		markerEndCenterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__MARKER_END_CENTER, oldMarkerEndCenter, MARKER_END_CENTER_EDEFAULT, oldMarkerEndCenterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarkerEndCenter() {
		return markerEndCenterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerEndWidth() {
		return markerEndWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerEndWidth(String newMarkerEndWidth) {
		String oldMarkerEndWidth = markerEndWidth;
		markerEndWidth = newMarkerEndWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MARKER_END_WIDTH, oldMarkerEndWidth, markerEndWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerStart() {
		return markerStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerStart(String newMarkerStart) {
		String oldMarkerStart = markerStart;
		markerStart = newMarkerStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MARKER_START, oldMarkerStart, markerStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMarkerStartCenter() {
		return markerStartCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerStartCenter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMarkerStartCenter) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMarkerStartCenter = markerStartCenter;
		markerStartCenter = newMarkerStartCenter == null ? MARKER_START_CENTER_EDEFAULT : newMarkerStartCenter;
		boolean oldMarkerStartCenterESet = markerStartCenterESet;
		markerStartCenterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MARKER_START_CENTER, oldMarkerStartCenter, markerStartCenter, !oldMarkerStartCenterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarkerStartCenter() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMarkerStartCenter = markerStartCenter;
		boolean oldMarkerStartCenterESet = markerStartCenterESet;
		markerStartCenter = MARKER_START_CENTER_EDEFAULT;
		markerStartCenterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__MARKER_START_CENTER, oldMarkerStartCenter, MARKER_START_CENTER_EDEFAULT, oldMarkerStartCenterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarkerStartCenter() {
		return markerStartCenterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerStartWidth() {
		return markerStartWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerStartWidth(String newMarkerStartWidth) {
		String oldMarkerStartWidth = markerStartWidth;
		markerStartWidth = newMarkerStartWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MARKER_START_WIDTH, oldMarkerStartWidth, markerStartWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasterPageName() {
		return masterPageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterPageName(String newMasterPageName) {
		String oldMasterPageName = masterPageName;
		masterPageName = newMasterPageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MASTER_PAGE_NAME, oldMasterPageName, masterPageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMayScript() {
		return mayScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMayScript(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMayScript) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMayScript = mayScript;
		mayScript = newMayScript == null ? MAY_SCRIPT_EDEFAULT : newMayScript;
		boolean oldMayScriptESet = mayScriptESet;
		mayScriptESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MAY_SCRIPT, oldMayScript, mayScript, !oldMayScriptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMayScript() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMayScript = mayScript;
		boolean oldMayScriptESet = mayScriptESet;
		mayScript = MAY_SCRIPT_EDEFAULT;
		mayScriptESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__MAY_SCRIPT, oldMayScript, MAY_SCRIPT_EDEFAULT, oldMayScriptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMayScript() {
		return mayScriptESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureAlignType getMeasureAlign() {
		return measureAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureAlign(MeasureAlignType newMeasureAlign) {
		MeasureAlignType oldMeasureAlign = measureAlign;
		measureAlign = newMeasureAlign == null ? MEASURE_ALIGN_EDEFAULT : newMeasureAlign;
		boolean oldMeasureAlignESet = measureAlignESet;
		measureAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MEASURE_ALIGN, oldMeasureAlign, measureAlign, !oldMeasureAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeasureAlign() {
		MeasureAlignType oldMeasureAlign = measureAlign;
		boolean oldMeasureAlignESet = measureAlignESet;
		measureAlign = MEASURE_ALIGN_EDEFAULT;
		measureAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__MEASURE_ALIGN, oldMeasureAlign, MEASURE_ALIGN_EDEFAULT, oldMeasureAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeasureAlign() {
		return measureAlignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureVerticalAlignType getMeasureVerticalAlign() {
		return measureVerticalAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureVerticalAlign(MeasureVerticalAlignType newMeasureVerticalAlign) {
		MeasureVerticalAlignType oldMeasureVerticalAlign = measureVerticalAlign;
		measureVerticalAlign = newMeasureVerticalAlign == null ? MEASURE_VERTICAL_ALIGN_EDEFAULT : newMeasureVerticalAlign;
		boolean oldMeasureVerticalAlignESet = measureVerticalAlignESet;
		measureVerticalAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MEASURE_VERTICAL_ALIGN, oldMeasureVerticalAlign, measureVerticalAlign, !oldMeasureVerticalAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeasureVerticalAlign() {
		MeasureVerticalAlignType oldMeasureVerticalAlign = measureVerticalAlign;
		boolean oldMeasureVerticalAlignESet = measureVerticalAlignESet;
		measureVerticalAlign = MEASURE_VERTICAL_ALIGN_EDEFAULT;
		measureVerticalAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__MEASURE_VERTICAL_ALIGN, oldMeasureVerticalAlign, MEASURE_VERTICAL_ALIGN_EDEFAULT, oldMeasureVerticalAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeasureVerticalAlign() {
		return measureVerticalAlignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(Object newMimeType) {
		Object oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMirrorHorizontal() {
		return mirrorHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMirrorHorizontal) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMirrorHorizontal = mirrorHorizontal;
		mirrorHorizontal = newMirrorHorizontal == null ? MIRROR_HORIZONTAL_EDEFAULT : newMirrorHorizontal;
		boolean oldMirrorHorizontalESet = mirrorHorizontalESet;
		mirrorHorizontalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MIRROR_HORIZONTAL, oldMirrorHorizontal, mirrorHorizontal, !oldMirrorHorizontalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMirrorHorizontal() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMirrorHorizontal = mirrorHorizontal;
		boolean oldMirrorHorizontalESet = mirrorHorizontalESet;
		mirrorHorizontal = MIRROR_HORIZONTAL_EDEFAULT;
		mirrorHorizontalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__MIRROR_HORIZONTAL, oldMirrorHorizontal, MIRROR_HORIZONTAL_EDEFAULT, oldMirrorHorizontalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMirrorHorizontal() {
		return mirrorHorizontalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMirrorVertical() {
		return mirrorVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMirrorVertical) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMirrorVertical = mirrorVertical;
		mirrorVertical = newMirrorVertical == null ? MIRROR_VERTICAL_EDEFAULT : newMirrorVertical;
		boolean oldMirrorVerticalESet = mirrorVerticalESet;
		mirrorVerticalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MIRROR_VERTICAL, oldMirrorVertical, mirrorVertical, !oldMirrorVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMirrorVertical() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMirrorVertical = mirrorVertical;
		boolean oldMirrorVerticalESet = mirrorVerticalESet;
		mirrorVertical = MIRROR_VERTICAL_EDEFAULT;
		mirrorVerticalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__MIRROR_VERTICAL, oldMirrorVertical, MIRROR_VERTICAL_EDEFAULT, oldMirrorVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMirrorVertical() {
		return mirrorVerticalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifiers() {
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiers(String newModifiers) {
		String oldModifiers = modifiers;
		modifiers = newModifiers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__MODIFIERS, oldModifiers, modifiers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getNavOrder() {
		return navOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavOrder(List<String> newNavOrder) {
		List<String> oldNavOrder = navOrder;
		navOrder = newNavOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__NAV_ORDER, oldNavOrder, navOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NohrefType getNohref() {
		return nohref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNohref(NohrefType newNohref) {
		NohrefType oldNohref = nohref;
		nohref = newNohref == null ? NOHREF_EDEFAULT : newNohref;
		boolean oldNohrefESet = nohrefESet;
		nohrefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__NOHREF, oldNohref, nohref, !oldNohrefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNohref() {
		NohrefType oldNohref = nohref;
		boolean oldNohrefESet = nohrefESet;
		nohref = NOHREF_EDEFAULT;
		nohrefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__NOHREF, oldNohref, NOHREF_EDEFAULT, oldNohrefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNohref() {
		return nohrefESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotifyOnUpdateOfRanges() {
		return notifyOnUpdateOfRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotifyOnUpdateOfRanges(String newNotifyOnUpdateOfRanges) {
		String oldNotifyOnUpdateOfRanges = notifyOnUpdateOfRanges;
		notifyOnUpdateOfRanges = newNotifyOnUpdateOfRanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__NOTIFY_ON_UPDATE_OF_RANGES, oldNotifyOnUpdateOfRanges, notifyOnUpdateOfRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getObject1() {
		return object1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject1(Object newObject1) {
		Object oldObject1 = object1;
		object1 = newObject1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__OBJECT1, oldObject1, object1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOleDrawAspect() {
		return oleDrawAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOleDrawAspect(BigInteger newOleDrawAspect) {
		BigInteger oldOleDrawAspect = oleDrawAspect;
		oleDrawAspect = newOleDrawAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__OLE_DRAW_ASPECT, oldOleDrawAspect, oleDrawAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpacity1() {
		return opacity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity1(String newOpacity1) {
		String oldOpacity1 = opacity1;
		opacity1 = newOpacity1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__OPACITY1, oldOpacity1, opacity1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpacityName() {
		return opacityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacityName(String newOpacityName) {
		String oldOpacityName = opacityName;
		opacityName = newOpacityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__OPACITY_NAME, oldOpacityName, opacityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPageNumber() {
		return pageNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageNumber(BigInteger newPageNumber) {
		BigInteger oldPageNumber = pageNumber;
		pageNumber = newPageNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__PAGE_NUMBER, oldPageNumber, pageNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getParallel() {
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newParallel) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldParallel = parallel;
		parallel = newParallel == null ? PARALLEL_EDEFAULT : newParallel;
		boolean oldParallelESet = parallelESet;
		parallelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__PARALLEL, oldParallel, parallel, !oldParallelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParallel() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldParallel = parallel;
		boolean oldParallelESet = parallelESet;
		parallel = PARALLEL_EDEFAULT;
		parallelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__PARALLEL, oldParallel, PARALLEL_EDEFAULT, oldParallelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParallel() {
		return parallelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPathStretchpointX() {
		return pathStretchpointX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathStretchpointX(double newPathStretchpointX) {
		double oldPathStretchpointX = pathStretchpointX;
		pathStretchpointX = newPathStretchpointX;
		boolean oldPathStretchpointXESet = pathStretchpointXESet;
		pathStretchpointXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__PATH_STRETCHPOINT_X, oldPathStretchpointX, pathStretchpointX, !oldPathStretchpointXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPathStretchpointX() {
		double oldPathStretchpointX = pathStretchpointX;
		boolean oldPathStretchpointXESet = pathStretchpointXESet;
		pathStretchpointX = PATH_STRETCHPOINT_X_EDEFAULT;
		pathStretchpointXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__PATH_STRETCHPOINT_X, oldPathStretchpointX, PATH_STRETCHPOINT_X_EDEFAULT, oldPathStretchpointXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPathStretchpointX() {
		return pathStretchpointXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPathStretchpointY() {
		return pathStretchpointY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathStretchpointY(double newPathStretchpointY) {
		double oldPathStretchpointY = pathStretchpointY;
		pathStretchpointY = newPathStretchpointY;
		boolean oldPathStretchpointYESet = pathStretchpointYESet;
		pathStretchpointYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__PATH_STRETCHPOINT_Y, oldPathStretchpointY, pathStretchpointY, !oldPathStretchpointYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPathStretchpointY() {
		double oldPathStretchpointY = pathStretchpointY;
		boolean oldPathStretchpointYESet = pathStretchpointYESet;
		pathStretchpointY = PATH_STRETCHPOINT_Y_EDEFAULT;
		pathStretchpointYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__PATH_STRETCHPOINT_Y, oldPathStretchpointY, PATH_STRETCHPOINT_Y_EDEFAULT, oldPathStretchpointYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPathStretchpointY() {
		return pathStretchpointYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacingType getPlacing() {
		return placing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacing(PlacingType newPlacing) {
		PlacingType oldPlacing = placing;
		placing = newPlacing == null ? PLACING_EDEFAULT : newPlacing;
		boolean oldPlacingESet = placingESet;
		placingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__PLACING, oldPlacing, placing, !oldPlacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlacing() {
		PlacingType oldPlacing = placing;
		boolean oldPlacingESet = placingESet;
		placing = PLACING_EDEFAULT;
		placingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__PLACING, oldPlacing, PLACING_EDEFAULT, oldPlacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlacing() {
		return placingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(String newPoints) {
		String oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtected() {
		return protected_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newProtected) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtected = protected_;
		protected_ = newProtected == null ? PROTECTED_EDEFAULT : newProtected;
		boolean oldProtectedESet = protectedESet;
		protectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__PROTECTED, oldProtected, protected_, !oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtected() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtected = protected_;
		boolean oldProtectedESet = protectedESet;
		protected_ = PROTECTED_EDEFAULT;
		protectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__PROTECTED, oldProtected, PROTECTED_EDEFAULT, oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtected() {
		return protectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRecreateOnEdit() {
		return recreateOnEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecreateOnEdit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newRecreateOnEdit) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRecreateOnEdit = recreateOnEdit;
		recreateOnEdit = newRecreateOnEdit == null ? RECREATE_ON_EDIT_EDEFAULT : newRecreateOnEdit;
		boolean oldRecreateOnEditESet = recreateOnEditESet;
		recreateOnEditESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__RECREATE_ON_EDIT, oldRecreateOnEdit, recreateOnEdit, !oldRecreateOnEditESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRecreateOnEdit() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRecreateOnEdit = recreateOnEdit;
		boolean oldRecreateOnEditESet = recreateOnEditESet;
		recreateOnEdit = RECREATE_ON_EDIT_EDEFAULT;
		recreateOnEditESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__RECREATE_ON_EDIT, oldRecreateOnEdit, RECREATE_ON_EDIT_EDEFAULT, oldRecreateOnEditESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRecreateOnEdit() {
		return recreateOnEditESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRed() {
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed(String newRed) {
		String oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(BigInteger newRotation) {
		BigInteger oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondaryFillColor() {
		return secondaryFillColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondaryFillColor(String newSecondaryFillColor) {
		String oldSecondaryFillColor = secondaryFillColor;
		secondaryFillColor = newSecondaryFillColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__SECONDARY_FILL_COLOR, oldSecondaryFillColor, secondaryFillColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadowType getShadow() {
		return shadow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadow(ShadowType newShadow) {
		ShadowType oldShadow = shadow;
		shadow = newShadow == null ? SHADOW_EDEFAULT : newShadow;
		boolean oldShadowESet = shadowESet;
		shadowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__SHADOW, oldShadow, shadow, !oldShadowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShadow() {
		ShadowType oldShadow = shadow;
		boolean oldShadowESet = shadowESet;
		shadow = SHADOW_EDEFAULT;
		shadowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__SHADOW, oldShadow, SHADOW_EDEFAULT, oldShadowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShadow() {
		return shadowESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShadowColor() {
		return shadowColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowColor(String newShadowColor) {
		String oldShadowColor = shadowColor;
		shadowColor = newShadowColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__SHADOW_COLOR, oldShadowColor, shadowColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShadowOffsetX() {
		return shadowOffsetX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowOffsetX(String newShadowOffsetX) {
		String oldShadowOffsetX = shadowOffsetX;
		shadowOffsetX = newShadowOffsetX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__SHADOW_OFFSET_X, oldShadowOffsetX, shadowOffsetX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShadowOffsetY() {
		return shadowOffsetY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowOffsetY(String newShadowOffsetY) {
		String oldShadowOffsetY = shadowOffsetY;
		shadowOffsetY = newShadowOffsetY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__SHADOW_OFFSET_Y, oldShadowOffsetY, shadowOffsetY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShadowOpacity() {
		return shadowOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowOpacity(String newShadowOpacity) {
		String oldShadowOpacity = shadowOpacity;
		shadowOpacity = newShadowOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__SHADOW_OPACITY, oldShadowOpacity, shadowOpacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShapeId() {
		return shapeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeId(String newShapeId) {
		String oldShapeId = shapeId;
		shapeId = newShapeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__SHAPE_ID, oldShapeId, shapeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSharpness() {
		return sharpness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharpness(String newSharpness) {
		String oldSharpness = sharpness;
		sharpness = newSharpness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__SHARPNESS, oldSharpness, sharpness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowUnit() {
		return showUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowUnit(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newShowUnit) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowUnit = showUnit;
		showUnit = newShowUnit == null ? SHOW_UNIT_EDEFAULT : newShowUnit;
		boolean oldShowUnitESet = showUnitESet;
		showUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__SHOW_UNIT, oldShowUnit, showUnit, !oldShowUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowUnit() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowUnit = showUnit;
		boolean oldShowUnitESet = showUnitESet;
		showUnit = SHOW_UNIT_EDEFAULT;
		showUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__SHOW_UNIT, oldShowUnit, SHOW_UNIT_EDEFAULT, oldShowUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowUnit() {
		return showUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(String newStart) {
		String oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartAngle() {
		return startAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartAngle(double newStartAngle) {
		double oldStartAngle = startAngle;
		startAngle = newStartAngle;
		boolean oldStartAngleESet = startAngleESet;
		startAngleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__START_ANGLE, oldStartAngle, startAngle, !oldStartAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartAngle() {
		double oldStartAngle = startAngle;
		boolean oldStartAngleESet = startAngleESet;
		startAngle = START_ANGLE_EDEFAULT;
		startAngleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__START_ANGLE, oldStartAngle, START_ANGLE_EDEFAULT, oldStartAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartAngle() {
		return startAngleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartColor() {
		return startColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartColor(String newStartColor) {
		String oldStartColor = startColor;
		startColor = newStartColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__START_COLOR, oldStartColor, startColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartGluePoint() {
		return startGluePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartGluePoint(BigInteger newStartGluePoint) {
		BigInteger oldStartGluePoint = startGluePoint;
		startGluePoint = newStartGluePoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__START_GLUE_POINT, oldStartGluePoint, startGluePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartGuide() {
		return startGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartGuide(String newStartGuide) {
		String oldStartGuide = startGuide;
		startGuide = newStartGuide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__START_GUIDE, oldStartGuide, startGuide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartIntensity() {
		return startIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartIntensity(String newStartIntensity) {
		String oldStartIntensity = startIntensity;
		startIntensity = newStartIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__START_INTENSITY, oldStartIntensity, startIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartLineSpacingHorizontal() {
		return startLineSpacingHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLineSpacingHorizontal(String newStartLineSpacingHorizontal) {
		String oldStartLineSpacingHorizontal = startLineSpacingHorizontal;
		startLineSpacingHorizontal = newStartLineSpacingHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__START_LINE_SPACING_HORIZONTAL, oldStartLineSpacingHorizontal, startLineSpacingHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartLineSpacingVertical() {
		return startLineSpacingVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLineSpacingVertical(String newStartLineSpacingVertical) {
		String oldStartLineSpacingVertical = startLineSpacingVertical;
		startLineSpacingVertical = newStartLineSpacingVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__START_LINE_SPACING_VERTICAL, oldStartLineSpacingVertical, startLineSpacingVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartShape() {
		return startShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartShape(String newStartShape) {
		String oldStartShape = startShape;
		startShape = newStartShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__START_SHAPE, oldStartShape, startShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeType getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(StrokeType newStroke) {
		StrokeType oldStroke = stroke;
		stroke = newStroke == null ? STROKE_EDEFAULT : newStroke;
		boolean oldStrokeESet = strokeESet;
		strokeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__STROKE, oldStroke, stroke, !oldStrokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStroke() {
		StrokeType oldStroke = stroke;
		boolean oldStrokeESet = strokeESet;
		stroke = STROKE_EDEFAULT;
		strokeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__STROKE, oldStroke, STROKE_EDEFAULT, oldStrokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStroke() {
		return strokeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeDash1() {
		return strokeDash1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDash1(String newStrokeDash1) {
		String oldStrokeDash1 = strokeDash1;
		strokeDash1 = newStrokeDash1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__STROKE_DASH1, oldStrokeDash1, strokeDash1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getStrokeDashNames() {
		return strokeDashNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDashNames(List<String> newStrokeDashNames) {
		List<String> oldStrokeDashNames = strokeDashNames;
		strokeDashNames = newStrokeDashNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__STROKE_DASH_NAMES, oldStrokeDashNames, strokeDashNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeLinejoinType getStrokeLinejoin() {
		return strokeLinejoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinejoin(StrokeLinejoinType newStrokeLinejoin) {
		StrokeLinejoinType oldStrokeLinejoin = strokeLinejoin;
		strokeLinejoin = newStrokeLinejoin == null ? STROKE_LINEJOIN_EDEFAULT : newStrokeLinejoin;
		boolean oldStrokeLinejoinESet = strokeLinejoinESet;
		strokeLinejoinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__STROKE_LINEJOIN, oldStrokeLinejoin, strokeLinejoin, !oldStrokeLinejoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeLinejoin() {
		StrokeLinejoinType oldStrokeLinejoin = strokeLinejoin;
		boolean oldStrokeLinejoinESet = strokeLinejoinESet;
		strokeLinejoin = STROKE_LINEJOIN_EDEFAULT;
		strokeLinejoinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__STROKE_LINEJOIN, oldStrokeLinejoin, STROKE_LINEJOIN_EDEFAULT, oldStrokeLinejoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeLinejoin() {
		return strokeLinejoinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName(String newStyleName) {
		String oldStyleName = styleName;
		styleName = newStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbolColor() {
		return symbolColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolColor(String newSymbolColor) {
		String oldSymbolColor = symbolColor;
		symbolColor = newSymbolColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__SYMBOL_COLOR, oldSymbolColor, symbolColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextareaHorizontalAlignType getTextareaHorizontalAlign() {
		return textareaHorizontalAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextareaHorizontalAlign(TextareaHorizontalAlignType newTextareaHorizontalAlign) {
		TextareaHorizontalAlignType oldTextareaHorizontalAlign = textareaHorizontalAlign;
		textareaHorizontalAlign = newTextareaHorizontalAlign == null ? TEXTAREA_HORIZONTAL_ALIGN_EDEFAULT : newTextareaHorizontalAlign;
		boolean oldTextareaHorizontalAlignESet = textareaHorizontalAlignESet;
		textareaHorizontalAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__TEXTAREA_HORIZONTAL_ALIGN, oldTextareaHorizontalAlign, textareaHorizontalAlign, !oldTextareaHorizontalAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextareaHorizontalAlign() {
		TextareaHorizontalAlignType oldTextareaHorizontalAlign = textareaHorizontalAlign;
		boolean oldTextareaHorizontalAlignESet = textareaHorizontalAlignESet;
		textareaHorizontalAlign = TEXTAREA_HORIZONTAL_ALIGN_EDEFAULT;
		textareaHorizontalAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__TEXTAREA_HORIZONTAL_ALIGN, oldTextareaHorizontalAlign, TEXTAREA_HORIZONTAL_ALIGN_EDEFAULT, oldTextareaHorizontalAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextareaHorizontalAlign() {
		return textareaHorizontalAlignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextAreas() {
		return textAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAreas(String newTextAreas) {
		String oldTextAreas = textAreas;
		textAreas = newTextAreas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__TEXT_AREAS, oldTextAreas, textAreas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextareaVerticalAlignType getTextareaVerticalAlign() {
		return textareaVerticalAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextareaVerticalAlign(TextareaVerticalAlignType newTextareaVerticalAlign) {
		TextareaVerticalAlignType oldTextareaVerticalAlign = textareaVerticalAlign;
		textareaVerticalAlign = newTextareaVerticalAlign == null ? TEXTAREA_VERTICAL_ALIGN_EDEFAULT : newTextareaVerticalAlign;
		boolean oldTextareaVerticalAlignESet = textareaVerticalAlignESet;
		textareaVerticalAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__TEXTAREA_VERTICAL_ALIGN, oldTextareaVerticalAlign, textareaVerticalAlign, !oldTextareaVerticalAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextareaVerticalAlign() {
		TextareaVerticalAlignType oldTextareaVerticalAlign = textareaVerticalAlign;
		boolean oldTextareaVerticalAlignESet = textareaVerticalAlignESet;
		textareaVerticalAlign = TEXTAREA_VERTICAL_ALIGN_EDEFAULT;
		textareaVerticalAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__TEXTAREA_VERTICAL_ALIGN, oldTextareaVerticalAlign, TEXTAREA_VERTICAL_ALIGN_EDEFAULT, oldTextareaVerticalAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextareaVerticalAlign() {
		return textareaVerticalAlignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextPath() {
		return textPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPath(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTextPath) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextPath = textPath;
		textPath = newTextPath == null ? TEXT_PATH_EDEFAULT : newTextPath;
		boolean oldTextPathESet = textPathESet;
		textPathESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__TEXT_PATH, oldTextPath, textPath, !oldTextPathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextPath() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextPath = textPath;
		boolean oldTextPathESet = textPathESet;
		textPath = TEXT_PATH_EDEFAULT;
		textPathESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__TEXT_PATH, oldTextPath, TEXT_PATH_EDEFAULT, oldTextPathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextPath() {
		return textPathESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextPathAllowed() {
		return textPathAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPathAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTextPathAllowed) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextPathAllowed = textPathAllowed;
		textPathAllowed = newTextPathAllowed == null ? TEXT_PATH_ALLOWED_EDEFAULT : newTextPathAllowed;
		boolean oldTextPathAllowedESet = textPathAllowedESet;
		textPathAllowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_ALLOWED, oldTextPathAllowed, textPathAllowed, !oldTextPathAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextPathAllowed() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextPathAllowed = textPathAllowed;
		boolean oldTextPathAllowedESet = textPathAllowedESet;
		textPathAllowed = TEXT_PATH_ALLOWED_EDEFAULT;
		textPathAllowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_ALLOWED, oldTextPathAllowed, TEXT_PATH_ALLOWED_EDEFAULT, oldTextPathAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextPathAllowed() {
		return textPathAllowedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPathModeType getTextPathMode() {
		return textPathMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPathMode(TextPathModeType newTextPathMode) {
		TextPathModeType oldTextPathMode = textPathMode;
		textPathMode = newTextPathMode == null ? TEXT_PATH_MODE_EDEFAULT : newTextPathMode;
		boolean oldTextPathModeESet = textPathModeESet;
		textPathModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_MODE, oldTextPathMode, textPathMode, !oldTextPathModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextPathMode() {
		TextPathModeType oldTextPathMode = textPathMode;
		boolean oldTextPathModeESet = textPathModeESet;
		textPathMode = TEXT_PATH_MODE_EDEFAULT;
		textPathModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_MODE, oldTextPathMode, TEXT_PATH_MODE_EDEFAULT, oldTextPathModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextPathMode() {
		return textPathModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextPathSameLetterHeights() {
		return textPathSameLetterHeights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPathSameLetterHeights(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newTextPathSameLetterHeights) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextPathSameLetterHeights = textPathSameLetterHeights;
		textPathSameLetterHeights = newTextPathSameLetterHeights == null ? TEXT_PATH_SAME_LETTER_HEIGHTS_EDEFAULT : newTextPathSameLetterHeights;
		boolean oldTextPathSameLetterHeightsESet = textPathSameLetterHeightsESet;
		textPathSameLetterHeightsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_SAME_LETTER_HEIGHTS, oldTextPathSameLetterHeights, textPathSameLetterHeights, !oldTextPathSameLetterHeightsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextPathSameLetterHeights() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldTextPathSameLetterHeights = textPathSameLetterHeights;
		boolean oldTextPathSameLetterHeightsESet = textPathSameLetterHeightsESet;
		textPathSameLetterHeights = TEXT_PATH_SAME_LETTER_HEIGHTS_EDEFAULT;
		textPathSameLetterHeightsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_SAME_LETTER_HEIGHTS, oldTextPathSameLetterHeights, TEXT_PATH_SAME_LETTER_HEIGHTS_EDEFAULT, oldTextPathSameLetterHeightsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextPathSameLetterHeights() {
		return textPathSameLetterHeightsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextPathScaleType getTextPathScale() {
		return textPathScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPathScale(TextPathScaleType newTextPathScale) {
		TextPathScaleType oldTextPathScale = textPathScale;
		textPathScale = newTextPathScale == null ? TEXT_PATH_SCALE_EDEFAULT : newTextPathScale;
		boolean oldTextPathScaleESet = textPathScaleESet;
		textPathScaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_SCALE, oldTextPathScale, textPathScale, !oldTextPathScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextPathScale() {
		TextPathScaleType oldTextPathScale = textPathScale;
		boolean oldTextPathScaleESet = textPathScaleESet;
		textPathScale = TEXT_PATH_SCALE_EDEFAULT;
		textPathScaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_SCALE, oldTextPathScale, TEXT_PATH_SCALE_EDEFAULT, oldTextPathScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextPathScale() {
		return textPathScaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTextRotateAngle() {
		return textRotateAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextRotateAngle(double newTextRotateAngle) {
		double oldTextRotateAngle = textRotateAngle;
		textRotateAngle = newTextRotateAngle;
		boolean oldTextRotateAngleESet = textRotateAngleESet;
		textRotateAngleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__TEXT_ROTATE_ANGLE, oldTextRotateAngle, textRotateAngle, !oldTextRotateAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextRotateAngle() {
		double oldTextRotateAngle = textRotateAngle;
		boolean oldTextRotateAngleESet = textRotateAngleESet;
		textRotateAngle = TEXT_ROTATE_ANGLE_EDEFAULT;
		textRotateAngleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__TEXT_ROTATE_ANGLE, oldTextRotateAngle, TEXT_ROTATE_ANGLE_EDEFAULT, oldTextRotateAngleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextRotateAngle() {
		return textRotateAngleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextStyleName() {
		return textStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextStyleName(String newTextStyleName) {
		String oldTextStyleName = textStyleName;
		textStyleName = newTextStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__TEXT_STYLE_NAME, oldTextStyleName, textStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTileRepeatOffset() {
		return tileRepeatOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTileRepeatOffset(Object newTileRepeatOffset) {
		Object oldTileRepeatOffset = tileRepeatOffset;
		tileRepeatOffset = newTileRepeatOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__TILE_REPEAT_OFFSET, oldTileRepeatOffset, tileRepeatOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(String newTransform) {
		String oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__TRANSFORM, oldTransform, transform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(UnitType newUnit) {
		UnitType oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		boolean oldUnitESet = unitESet;
		unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__UNIT, oldUnit, unit, !oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnit() {
		UnitType oldUnit = unit;
		boolean oldUnitESet = unitESet;
		unit = UNIT_EDEFAULT;
		unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__UNIT, oldUnit, UNIT_EDEFAULT, oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnit() {
		return unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleAreaHeight() {
		return visibleAreaHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleAreaHeight(String newVisibleAreaHeight) {
		String oldVisibleAreaHeight = visibleAreaHeight;
		visibleAreaHeight = newVisibleAreaHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_HEIGHT, oldVisibleAreaHeight, visibleAreaHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleAreaLeft() {
		return visibleAreaLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleAreaLeft(String newVisibleAreaLeft) {
		String oldVisibleAreaLeft = visibleAreaLeft;
		visibleAreaLeft = newVisibleAreaLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_LEFT, oldVisibleAreaLeft, visibleAreaLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleAreaTop() {
		return visibleAreaTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleAreaTop(String newVisibleAreaTop) {
		String oldVisibleAreaTop = visibleAreaTop;
		visibleAreaTop = newVisibleAreaTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_TOP, oldVisibleAreaTop, visibleAreaTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleAreaWidth() {
		return visibleAreaWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleAreaWidth(String newVisibleAreaWidth) {
		String oldVisibleAreaWidth = visibleAreaWidth;
		visibleAreaWidth = newVisibleAreaWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_WIDTH, oldVisibleAreaWidth, visibleAreaWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapInfluenceOnPositionType getWrapInfluenceOnPosition() {
		return wrapInfluenceOnPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapInfluenceOnPosition(WrapInfluenceOnPositionType newWrapInfluenceOnPosition) {
		WrapInfluenceOnPositionType oldWrapInfluenceOnPosition = wrapInfluenceOnPosition;
		wrapInfluenceOnPosition = newWrapInfluenceOnPosition == null ? WRAP_INFLUENCE_ON_POSITION_EDEFAULT : newWrapInfluenceOnPosition;
		boolean oldWrapInfluenceOnPositionESet = wrapInfluenceOnPositionESet;
		wrapInfluenceOnPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__WRAP_INFLUENCE_ON_POSITION, oldWrapInfluenceOnPosition, wrapInfluenceOnPosition, !oldWrapInfluenceOnPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrapInfluenceOnPosition() {
		WrapInfluenceOnPositionType oldWrapInfluenceOnPosition = wrapInfluenceOnPosition;
		boolean oldWrapInfluenceOnPositionESet = wrapInfluenceOnPositionESet;
		wrapInfluenceOnPosition = WRAP_INFLUENCE_ON_POSITION_EDEFAULT;
		wrapInfluenceOnPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.DOCUMENT_ROOT__WRAP_INFLUENCE_ON_POSITION, oldWrapInfluenceOnPosition, WRAP_INFLUENCE_ON_POSITION_EDEFAULT, oldWrapInfluenceOnPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrapInfluenceOnPosition() {
		return wrapInfluenceOnPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getZIndex() {
		return zIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZIndex(BigInteger newZIndex) {
		BigInteger oldZIndex = zIndex;
		zIndex = newZIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.DOCUMENT_ROOT__ZINDEX, oldZIndex, zIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrawingPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DrawingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DrawingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DrawingPackage.DOCUMENT_ROOT__A:
				return basicSetA(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__APPLET:
				return basicSetApplet(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__AREA_CIRCLE:
				return basicSetAreaCircle(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__AREA_POLYGON:
				return basicSetAreaPolygon(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__AREA_RECTANGLE:
				return basicSetAreaRectangle(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__CAPTION:
				return basicSetCaption(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__CIRCLE:
				return basicSetCircle(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__CONNECTOR:
				return basicSetConnector(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__CONTOUR_PATH:
				return basicSetContourPath(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__CONTOUR_POLYGON:
				return basicSetContourPolygon(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__CONTROL:
				return basicSetControl(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__CUSTOM_SHAPE:
				return basicSetCustomShape(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__ELLIPSE:
				return basicSetEllipse(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__ENHANCED_GEOMETRY:
				return basicSetEnhancedGeometry(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__EQUATION:
				return basicSetEquation(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE:
				return basicSetFillImage(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__FLOATING_FRAME:
				return basicSetFloatingFrame(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__FRAME:
				return basicSetFrame(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__G:
				return basicSetG(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT:
				return basicSetGluePoint(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__GRADIENT:
				return basicSetGradient(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__HANDLE:
				return basicSetHandle(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__HATCH:
				return basicSetHatch(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__IMAGE:
				return basicSetImage(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__IMAGE_MAP:
				return basicSetImageMap(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__LAYER:
				return basicSetLayer(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__LAYER_SET:
				return basicSetLayerSet(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__LINE:
				return basicSetLine(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__MARKER:
				return basicSetMarker(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__MEASURE:
				return basicSetMeasure(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__OBJECT:
				return basicSetObject(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__OBJECT_OLE:
				return basicSetObjectOle(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__OPACITY:
				return basicSetOpacity(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__PAGE:
				return basicSetPage(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__PAGE_THUMBNAIL:
				return basicSetPageThumbnail(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__PARAM:
				return basicSetParam(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__PATH:
				return basicSetPath(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__PLUGIN:
				return basicSetPlugin(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__POLYGON:
				return basicSetPolygon(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__POLYLINE:
				return basicSetPolyline(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__RECT:
				return basicSetRect(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__REGULAR_POLYGON:
				return basicSetRegularPolygon(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH:
				return basicSetStrokeDash(null, msgs);
			case DrawingPackage.DOCUMENT_ROOT__TEXT_BOX:
				return basicSetTextBox(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrawingPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DrawingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DrawingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DrawingPackage.DOCUMENT_ROOT__A:
				return getA();
			case DrawingPackage.DOCUMENT_ROOT__APPLET:
				return getApplet();
			case DrawingPackage.DOCUMENT_ROOT__AREA_CIRCLE:
				return getAreaCircle();
			case DrawingPackage.DOCUMENT_ROOT__AREA_POLYGON:
				return getAreaPolygon();
			case DrawingPackage.DOCUMENT_ROOT__AREA_RECTANGLE:
				return getAreaRectangle();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION:
				return getCaption();
			case DrawingPackage.DOCUMENT_ROOT__CIRCLE:
				return getCircle();
			case DrawingPackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector();
			case DrawingPackage.DOCUMENT_ROOT__CONTOUR_PATH:
				return getContourPath();
			case DrawingPackage.DOCUMENT_ROOT__CONTOUR_POLYGON:
				return getContourPolygon();
			case DrawingPackage.DOCUMENT_ROOT__CONTROL:
				return getControl();
			case DrawingPackage.DOCUMENT_ROOT__CUSTOM_SHAPE:
				return getCustomShape();
			case DrawingPackage.DOCUMENT_ROOT__ELLIPSE:
				return getEllipse();
			case DrawingPackage.DOCUMENT_ROOT__ENHANCED_GEOMETRY:
				return getEnhancedGeometry();
			case DrawingPackage.DOCUMENT_ROOT__EQUATION:
				return getEquation();
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE:
				return getFillImage();
			case DrawingPackage.DOCUMENT_ROOT__FLOATING_FRAME:
				return getFloatingFrame();
			case DrawingPackage.DOCUMENT_ROOT__FRAME:
				return getFrame();
			case DrawingPackage.DOCUMENT_ROOT__G:
				return getG();
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT:
				return getGluePoint();
			case DrawingPackage.DOCUMENT_ROOT__GRADIENT:
				return getGradient();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE:
				return getHandle();
			case DrawingPackage.DOCUMENT_ROOT__HATCH:
				return getHatch();
			case DrawingPackage.DOCUMENT_ROOT__IMAGE:
				return getImage();
			case DrawingPackage.DOCUMENT_ROOT__IMAGE_MAP:
				return getImageMap();
			case DrawingPackage.DOCUMENT_ROOT__LAYER:
				return getLayer();
			case DrawingPackage.DOCUMENT_ROOT__LAYER_SET:
				return getLayerSet();
			case DrawingPackage.DOCUMENT_ROOT__LINE:
				return getLine();
			case DrawingPackage.DOCUMENT_ROOT__MARKER:
				return getMarker();
			case DrawingPackage.DOCUMENT_ROOT__MEASURE:
				return getMeasure();
			case DrawingPackage.DOCUMENT_ROOT__OBJECT:
				return getObject();
			case DrawingPackage.DOCUMENT_ROOT__OBJECT_OLE:
				return getObjectOle();
			case DrawingPackage.DOCUMENT_ROOT__OPACITY:
				return getOpacity();
			case DrawingPackage.DOCUMENT_ROOT__PAGE:
				return getPage();
			case DrawingPackage.DOCUMENT_ROOT__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case DrawingPackage.DOCUMENT_ROOT__PARAM:
				return getParam();
			case DrawingPackage.DOCUMENT_ROOT__PATH:
				return getPath();
			case DrawingPackage.DOCUMENT_ROOT__PLUGIN:
				return getPlugin();
			case DrawingPackage.DOCUMENT_ROOT__POLYGON:
				return getPolygon();
			case DrawingPackage.DOCUMENT_ROOT__POLYLINE:
				return getPolyline();
			case DrawingPackage.DOCUMENT_ROOT__RECT:
				return getRect();
			case DrawingPackage.DOCUMENT_ROOT__REGULAR_POLYGON:
				return getRegularPolygon();
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH:
				return getStrokeDash();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_BOX:
				return getTextBox();
			case DrawingPackage.DOCUMENT_ROOT__ALIGN:
				return getAlign();
			case DrawingPackage.DOCUMENT_ROOT__ANGLE:
				return getAngle();
			case DrawingPackage.DOCUMENT_ROOT__ARCHIVE:
				return getArchive();
			case DrawingPackage.DOCUMENT_ROOT__AUTO_GROW_HEIGHT:
				return getAutoGrowHeight();
			case DrawingPackage.DOCUMENT_ROOT__AUTO_GROW_WIDTH:
				return getAutoGrowWidth();
			case DrawingPackage.DOCUMENT_ROOT__BACKGROUND_SIZE:
				return getBackgroundSize();
			case DrawingPackage.DOCUMENT_ROOT__BLUE:
				return getBlue();
			case DrawingPackage.DOCUMENT_ROOT__BORDER:
				return getBorder();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ANGLE:
				return getCaptionAngle();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ANGLE_TYPE:
				return getCaptionAngleType();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ESCAPE:
				return getCaptionEscape();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ESCAPE_DIRECTION:
				return getCaptionEscapeDirection();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_FIT_LINE_LENGTH:
				return getCaptionFitLineLength();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_GAP:
				return getCaptionGap();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ID:
				return getCaptionId();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_LINE_LENGTH:
				return getCaptionLineLength();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_POINT_X:
				return getCaptionPointX();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_POINT_Y:
				return getCaptionPointY();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_TYPE:
				return getCaptionType();
			case DrawingPackage.DOCUMENT_ROOT__CHAIN_NEXT_NAME:
				return getChainNextName();
			case DrawingPackage.DOCUMENT_ROOT__CLASS_ID:
				return getClassId();
			case DrawingPackage.DOCUMENT_ROOT__CLASS_NAMES:
				return getClassNames();
			case DrawingPackage.DOCUMENT_ROOT__CODE:
				return getCode();
			case DrawingPackage.DOCUMENT_ROOT__COLOR:
				return getColor();
			case DrawingPackage.DOCUMENT_ROOT__COLOR_INVERSION:
				return getColorInversion();
			case DrawingPackage.DOCUMENT_ROOT__COLOR_MODE:
				return getColorMode();
			case DrawingPackage.DOCUMENT_ROOT__CONCAVE:
				return getConcave();
			case DrawingPackage.DOCUMENT_ROOT__CONCENTRIC_GRADIENT_FILL_ALLOWED:
				return getConcentricGradientFillAllowed();
			case DrawingPackage.DOCUMENT_ROOT__CONTRAST:
				return getContrast();
			case DrawingPackage.DOCUMENT_ROOT__CONTROL1:
				return getControl1();
			case DrawingPackage.DOCUMENT_ROOT__COPY_OF:
				return getCopyOf();
			case DrawingPackage.DOCUMENT_ROOT__CORNER_RADIUS:
				return getCornerRadius();
			case DrawingPackage.DOCUMENT_ROOT__CORNERS:
				return getCorners();
			case DrawingPackage.DOCUMENT_ROOT__CX:
				return getCx();
			case DrawingPackage.DOCUMENT_ROOT__CY:
				return getCy();
			case DrawingPackage.DOCUMENT_ROOT__DATA:
				return getData();
			case DrawingPackage.DOCUMENT_ROOT__DECIMAL_PLACES:
				return getDecimalPlaces();
			case DrawingPackage.DOCUMENT_ROOT__DISPLAY:
				return getDisplay();
			case DrawingPackage.DOCUMENT_ROOT__DISPLAY_NAME:
				return getDisplayName();
			case DrawingPackage.DOCUMENT_ROOT__DISTANCE:
				return getDistance();
			case DrawingPackage.DOCUMENT_ROOT__DOTS1:
				return getDots1();
			case DrawingPackage.DOCUMENT_ROOT__DOTS1_LENGTH:
				return getDots1Length();
			case DrawingPackage.DOCUMENT_ROOT__DOTS2:
				return getDots2();
			case DrawingPackage.DOCUMENT_ROOT__DOTS2_LENGTH:
				return getDots2Length();
			case DrawingPackage.DOCUMENT_ROOT__END:
				return getEnd();
			case DrawingPackage.DOCUMENT_ROOT__END_ANGLE:
				return new Double(getEndAngle());
			case DrawingPackage.DOCUMENT_ROOT__END_COLOR:
				return getEndColor();
			case DrawingPackage.DOCUMENT_ROOT__END_GLUE_POINT:
				return getEndGluePoint();
			case DrawingPackage.DOCUMENT_ROOT__END_GUIDE:
				return getEndGuide();
			case DrawingPackage.DOCUMENT_ROOT__END_INTENSITY:
				return getEndIntensity();
			case DrawingPackage.DOCUMENT_ROOT__END_LINE_SPACING_HORIZONTAL:
				return getEndLineSpacingHorizontal();
			case DrawingPackage.DOCUMENT_ROOT__END_LINE_SPACING_VERTICAL:
				return getEndLineSpacingVertical();
			case DrawingPackage.DOCUMENT_ROOT__END_SHAPE:
				return getEndShape();
			case DrawingPackage.DOCUMENT_ROOT__ENGINE:
				return getEngine();
			case DrawingPackage.DOCUMENT_ROOT__ENHANCED_PATH:
				return getEnhancedPath();
			case DrawingPackage.DOCUMENT_ROOT__ESCAPE_DIRECTION:
				return getEscapeDirection();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION:
				return getExtrusion();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ALLOWED:
				return getExtrusionAllowed();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_BRIGHTNESS:
				return getExtrusionBrightness();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_COLOR:
				return getExtrusionColor();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_DEPTH:
				return getExtrusionDepth();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_DIFFUSION:
				return getExtrusionDiffusion();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_DIRECTION:
				return getExtrusionFirstLightDirection();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_HARSH:
				return getExtrusionFirstLightHarsh();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_LEVEL:
				return getExtrusionFirstLightLevel();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_LIGHT_FACE:
				return getExtrusionLightFace();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_METAL:
				return getExtrusionMetal();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_NUMBER_OF_LINE_SEGMENTS:
				return getExtrusionNumberOfLineSegments();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ORIGIN:
				return getExtrusionOrigin();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ROTATION_ANGLE:
				return getExtrusionRotationAngle();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ROTATION_CENTER:
				return getExtrusionRotationCenter();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_DIRECTION:
				return getExtrusionSecondLightDirection();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_HARSH:
				return getExtrusionSecondLightHarsh();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_LEVEL:
				return getExtrusionSecondLightLevel();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SHININESS:
				return getExtrusionShininess();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SKEW:
				return getExtrusionSkew();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SPECULARITY:
				return getExtrusionSpecularity();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_VIEWPOINT:
				return getExtrusionViewpoint();
			case DrawingPackage.DOCUMENT_ROOT__FILL:
				return getFill();
			case DrawingPackage.DOCUMENT_ROOT__FILL_COLOR:
				return getFillColor();
			case DrawingPackage.DOCUMENT_ROOT__FILL_GRADIENT_NAME:
				return getFillGradientName();
			case DrawingPackage.DOCUMENT_ROOT__FILL_HATCH_NAME:
				return getFillHatchName();
			case DrawingPackage.DOCUMENT_ROOT__FILL_HATCH_SOLID:
				return getFillHatchSolid();
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_HEIGHT:
				return getFillImageHeight();
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_NAME:
				return getFillImageName();
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT:
				return getFillImageRefPoint();
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT_X:
				return getFillImageRefPointX();
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT_Y:
				return getFillImageRefPointY();
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_WIDTH:
				return getFillImageWidth();
			case DrawingPackage.DOCUMENT_ROOT__FILTER_NAME:
				return getFilterName();
			case DrawingPackage.DOCUMENT_ROOT__FIT_TO_CONTOUR:
				return getFitToContour();
			case DrawingPackage.DOCUMENT_ROOT__FIT_TO_SIZE:
				return getFitToSize();
			case DrawingPackage.DOCUMENT_ROOT__FORMULA:
				return getFormula();
			case DrawingPackage.DOCUMENT_ROOT__FRAME_DISPLAY_BORDER:
				return getFrameDisplayBorder();
			case DrawingPackage.DOCUMENT_ROOT__FRAME_DISPLAY_SCROLLBAR:
				return getFrameDisplayScrollbar();
			case DrawingPackage.DOCUMENT_ROOT__FRAME_MARGIN_HORIZONTAL:
				return getFrameMarginHorizontal();
			case DrawingPackage.DOCUMENT_ROOT__FRAME_MARGIN_VERTICAL:
				return getFrameMarginVertical();
			case DrawingPackage.DOCUMENT_ROOT__FRAME_NAME:
				return getFrameName();
			case DrawingPackage.DOCUMENT_ROOT__GAMMA:
				return getGamma();
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT_LEAVING_DIRECTIONS:
				return getGluePointLeavingDirections();
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINTS:
				return getGluePoints();
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT_TYPE:
				return getGluePointType();
			case DrawingPackage.DOCUMENT_ROOT__GRADIENT_STEP_COUNT:
				return getGradientStepCount();
			case DrawingPackage.DOCUMENT_ROOT__GREEN:
				return getGreen();
			case DrawingPackage.DOCUMENT_ROOT__GUIDE_DISTANCE:
				return getGuideDistance();
			case DrawingPackage.DOCUMENT_ROOT__GUIDE_OVERHANG:
				return getGuideOverhang();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_MIRROR_HORIZONTAL:
				return getHandleMirrorHorizontal();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_MIRROR_VERTICAL:
				return getHandleMirrorVertical();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_POLAR:
				return getHandlePolar();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_POSITION:
				return getHandlePosition();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RADIUS_RANGE_MAXIMUM:
				return getHandleRadiusRangeMaximum();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RADIUS_RANGE_MINIMUM:
				return getHandleRadiusRangeMinimum();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_XMAXIMUM:
				return getHandleRangeXMaximum();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_XMINIMUM:
				return getHandleRangeXMinimum();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_YMAXIMUM:
				return getHandleRangeYMaximum();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_YMINIMUM:
				return getHandleRangeYMinimum();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_SWITCHED:
				return getHandleSwitched();
			case DrawingPackage.DOCUMENT_ROOT__IMAGE_OPACITY:
				return getImageOpacity();
			case DrawingPackage.DOCUMENT_ROOT__KIND:
				return getKind();
			case DrawingPackage.DOCUMENT_ROOT__LAYER1:
				return getLayer1();
			case DrawingPackage.DOCUMENT_ROOT__LINE_DISTANCE:
				return getLineDistance();
			case DrawingPackage.DOCUMENT_ROOT__LINE_SKEW:
				return getLineSkew();
			case DrawingPackage.DOCUMENT_ROOT__LUMINANCE:
				return getLuminance();
			case DrawingPackage.DOCUMENT_ROOT__MARKER_END:
				return getMarkerEnd();
			case DrawingPackage.DOCUMENT_ROOT__MARKER_END_CENTER:
				return getMarkerEndCenter();
			case DrawingPackage.DOCUMENT_ROOT__MARKER_END_WIDTH:
				return getMarkerEndWidth();
			case DrawingPackage.DOCUMENT_ROOT__MARKER_START:
				return getMarkerStart();
			case DrawingPackage.DOCUMENT_ROOT__MARKER_START_CENTER:
				return getMarkerStartCenter();
			case DrawingPackage.DOCUMENT_ROOT__MARKER_START_WIDTH:
				return getMarkerStartWidth();
			case DrawingPackage.DOCUMENT_ROOT__MASTER_PAGE_NAME:
				return getMasterPageName();
			case DrawingPackage.DOCUMENT_ROOT__MAY_SCRIPT:
				return getMayScript();
			case DrawingPackage.DOCUMENT_ROOT__MEASURE_ALIGN:
				return getMeasureAlign();
			case DrawingPackage.DOCUMENT_ROOT__MEASURE_VERTICAL_ALIGN:
				return getMeasureVerticalAlign();
			case DrawingPackage.DOCUMENT_ROOT__MIME_TYPE:
				return getMimeType();
			case DrawingPackage.DOCUMENT_ROOT__MIRROR_HORIZONTAL:
				return getMirrorHorizontal();
			case DrawingPackage.DOCUMENT_ROOT__MIRROR_VERTICAL:
				return getMirrorVertical();
			case DrawingPackage.DOCUMENT_ROOT__MODIFIERS:
				return getModifiers();
			case DrawingPackage.DOCUMENT_ROOT__NAV_ORDER:
				return getNavOrder();
			case DrawingPackage.DOCUMENT_ROOT__NOHREF:
				return getNohref();
			case DrawingPackage.DOCUMENT_ROOT__NOTIFY_ON_UPDATE_OF_RANGES:
				return getNotifyOnUpdateOfRanges();
			case DrawingPackage.DOCUMENT_ROOT__OBJECT1:
				return getObject1();
			case DrawingPackage.DOCUMENT_ROOT__OLE_DRAW_ASPECT:
				return getOleDrawAspect();
			case DrawingPackage.DOCUMENT_ROOT__OPACITY1:
				return getOpacity1();
			case DrawingPackage.DOCUMENT_ROOT__OPACITY_NAME:
				return getOpacityName();
			case DrawingPackage.DOCUMENT_ROOT__PAGE_NUMBER:
				return getPageNumber();
			case DrawingPackage.DOCUMENT_ROOT__PARALLEL:
				return getParallel();
			case DrawingPackage.DOCUMENT_ROOT__PATH_STRETCHPOINT_X:
				return new Double(getPathStretchpointX());
			case DrawingPackage.DOCUMENT_ROOT__PATH_STRETCHPOINT_Y:
				return new Double(getPathStretchpointY());
			case DrawingPackage.DOCUMENT_ROOT__PLACING:
				return getPlacing();
			case DrawingPackage.DOCUMENT_ROOT__POINTS:
				return getPoints();
			case DrawingPackage.DOCUMENT_ROOT__PROTECTED:
				return getProtected();
			case DrawingPackage.DOCUMENT_ROOT__RECREATE_ON_EDIT:
				return getRecreateOnEdit();
			case DrawingPackage.DOCUMENT_ROOT__RED:
				return getRed();
			case DrawingPackage.DOCUMENT_ROOT__ROTATION:
				return getRotation();
			case DrawingPackage.DOCUMENT_ROOT__SECONDARY_FILL_COLOR:
				return getSecondaryFillColor();
			case DrawingPackage.DOCUMENT_ROOT__SHADOW:
				return getShadow();
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_COLOR:
				return getShadowColor();
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_OFFSET_X:
				return getShadowOffsetX();
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_OFFSET_Y:
				return getShadowOffsetY();
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_OPACITY:
				return getShadowOpacity();
			case DrawingPackage.DOCUMENT_ROOT__SHAPE_ID:
				return getShapeId();
			case DrawingPackage.DOCUMENT_ROOT__SHARPNESS:
				return getSharpness();
			case DrawingPackage.DOCUMENT_ROOT__SHOW_UNIT:
				return getShowUnit();
			case DrawingPackage.DOCUMENT_ROOT__START:
				return getStart();
			case DrawingPackage.DOCUMENT_ROOT__START_ANGLE:
				return new Double(getStartAngle());
			case DrawingPackage.DOCUMENT_ROOT__START_COLOR:
				return getStartColor();
			case DrawingPackage.DOCUMENT_ROOT__START_GLUE_POINT:
				return getStartGluePoint();
			case DrawingPackage.DOCUMENT_ROOT__START_GUIDE:
				return getStartGuide();
			case DrawingPackage.DOCUMENT_ROOT__START_INTENSITY:
				return getStartIntensity();
			case DrawingPackage.DOCUMENT_ROOT__START_LINE_SPACING_HORIZONTAL:
				return getStartLineSpacingHorizontal();
			case DrawingPackage.DOCUMENT_ROOT__START_LINE_SPACING_VERTICAL:
				return getStartLineSpacingVertical();
			case DrawingPackage.DOCUMENT_ROOT__START_SHAPE:
				return getStartShape();
			case DrawingPackage.DOCUMENT_ROOT__STROKE:
				return getStroke();
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH1:
				return getStrokeDash1();
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH_NAMES:
				return getStrokeDashNames();
			case DrawingPackage.DOCUMENT_ROOT__STROKE_LINEJOIN:
				return getStrokeLinejoin();
			case DrawingPackage.DOCUMENT_ROOT__STYLE_NAME:
				return getStyleName();
			case DrawingPackage.DOCUMENT_ROOT__SYMBOL_COLOR:
				return getSymbolColor();
			case DrawingPackage.DOCUMENT_ROOT__TEXTAREA_HORIZONTAL_ALIGN:
				return getTextareaHorizontalAlign();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_AREAS:
				return getTextAreas();
			case DrawingPackage.DOCUMENT_ROOT__TEXTAREA_VERTICAL_ALIGN:
				return getTextareaVerticalAlign();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH:
				return getTextPath();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_ALLOWED:
				return getTextPathAllowed();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_MODE:
				return getTextPathMode();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_SAME_LETTER_HEIGHTS:
				return getTextPathSameLetterHeights();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_SCALE:
				return getTextPathScale();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_ROTATE_ANGLE:
				return new Double(getTextRotateAngle());
			case DrawingPackage.DOCUMENT_ROOT__TEXT_STYLE_NAME:
				return getTextStyleName();
			case DrawingPackage.DOCUMENT_ROOT__TILE_REPEAT_OFFSET:
				return getTileRepeatOffset();
			case DrawingPackage.DOCUMENT_ROOT__TRANSFORM:
				return getTransform();
			case DrawingPackage.DOCUMENT_ROOT__UNIT:
				return getUnit();
			case DrawingPackage.DOCUMENT_ROOT__VALUE:
				return getValue();
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_HEIGHT:
				return getVisibleAreaHeight();
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_LEFT:
				return getVisibleAreaLeft();
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_TOP:
				return getVisibleAreaTop();
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_WIDTH:
				return getVisibleAreaWidth();
			case DrawingPackage.DOCUMENT_ROOT__WRAP_INFLUENCE_ON_POSITION:
				return getWrapInfluenceOnPosition();
			case DrawingPackage.DOCUMENT_ROOT__ZINDEX:
				return getZIndex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DrawingPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__A:
				setA((AType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__APPLET:
				setApplet((AppletType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__AREA_CIRCLE:
				setAreaCircle((AreaCircleType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__AREA_POLYGON:
				setAreaPolygon((AreaPolygonType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__AREA_RECTANGLE:
				setAreaRectangle((AreaRectangleType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION:
				setCaption((CaptionType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CIRCLE:
				setCircle((CircleType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((ConnectorType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONTOUR_PATH:
				setContourPath((ContourPathType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONTOUR_POLYGON:
				setContourPolygon((ContourPolygonType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONTROL:
				setControl((ControlType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CUSTOM_SHAPE:
				setCustomShape((CustomShapeType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ELLIPSE:
				setEllipse((EllipseType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ENHANCED_GEOMETRY:
				setEnhancedGeometry((EnhancedGeometryType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EQUATION:
				setEquation((EquationType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE:
				setFillImage((FillImageType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FLOATING_FRAME:
				setFloatingFrame((FloatingFrameType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FRAME:
				setFrame((FrameType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__G:
				setG((GType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT:
				setGluePoint((GluePointType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GRADIENT:
				setGradient((GradientType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE:
				setHandle((HandleType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HATCH:
				setHatch((HatchType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__IMAGE:
				setImage((ImageType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__IMAGE_MAP:
				setImageMap((ImageMapType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LAYER:
				setLayer((LayerType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LAYER_SET:
				setLayerSet((LayerSetType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LINE:
				setLine((LineType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER:
				setMarker((MarkerType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MEASURE:
				setMeasure((MeasureType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OBJECT:
				setObject((ObjectType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OBJECT_OLE:
				setObjectOle((ObjectOleType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OPACITY:
				setOpacity((OpacityType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PAGE:
				setPage((PageType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PAGE_THUMBNAIL:
				setPageThumbnail((PageThumbnailType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PARAM:
				setParam((ParamType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PATH:
				setPath((PathType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PLUGIN:
				setPlugin((PluginType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__POLYGON:
				setPolygon((PolygonType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__POLYLINE:
				setPolyline((PolylineType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__RECT:
				setRect((RectType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__REGULAR_POLYGON:
				setRegularPolygon((RegularPolygonType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH:
				setStrokeDash((StrokeDashType1)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_BOX:
				setTextBox((TextBoxType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ALIGN:
				setAlign((AlignType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ANGLE:
				setAngle((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ARCHIVE:
				setArchive(newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__AUTO_GROW_HEIGHT:
				setAutoGrowHeight((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__AUTO_GROW_WIDTH:
				setAutoGrowWidth((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__BACKGROUND_SIZE:
				setBackgroundSize((BackgroundSizeType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__BLUE:
				setBlue((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__BORDER:
				setBorder((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ANGLE:
				setCaptionAngle((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ANGLE_TYPE:
				setCaptionAngleType((CaptionAngleTypeType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ESCAPE:
				setCaptionEscape((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ESCAPE_DIRECTION:
				setCaptionEscapeDirection((CaptionEscapeDirectionType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_FIT_LINE_LENGTH:
				setCaptionFitLineLength((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_GAP:
				setCaptionGap((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ID:
				setCaptionId((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_LINE_LENGTH:
				setCaptionLineLength((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_POINT_X:
				setCaptionPointX((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_POINT_Y:
				setCaptionPointY((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_TYPE:
				setCaptionType((CaptionTypeType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CHAIN_NEXT_NAME:
				setChainNextName((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CLASS_ID:
				setClassId(newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CLASS_NAMES:
				setClassNames((List<String>)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CODE:
				setCode(newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__COLOR:
				setColor((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__COLOR_INVERSION:
				setColorInversion((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__COLOR_MODE:
				setColorMode((ColorModeType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONCAVE:
				setConcave((ConcaveType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONCENTRIC_GRADIENT_FILL_ALLOWED:
				setConcentricGradientFillAllowed((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONTRAST:
				setContrast((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONTROL1:
				setControl1((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__COPY_OF:
				setCopyOf((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CORNER_RADIUS:
				setCornerRadius((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CORNERS:
				setCorners((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CX:
				setCx((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CY:
				setCy((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DATA:
				setData((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DECIMAL_PLACES:
				setDecimalPlaces((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DISPLAY:
				setDisplay((DisplayType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DISTANCE:
				setDistance((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DOTS1:
				setDots1((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DOTS1_LENGTH:
				setDots1Length((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DOTS2:
				setDots2((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DOTS2_LENGTH:
				setDots2Length((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END:
				setEnd((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_ANGLE:
				setEndAngle(((Double)newValue).doubleValue());
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_COLOR:
				setEndColor((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_GLUE_POINT:
				setEndGluePoint((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_GUIDE:
				setEndGuide((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_INTENSITY:
				setEndIntensity((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_LINE_SPACING_HORIZONTAL:
				setEndLineSpacingHorizontal((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_LINE_SPACING_VERTICAL:
				setEndLineSpacingVertical((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_SHAPE:
				setEndShape((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ENGINE:
				setEngine((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ENHANCED_PATH:
				setEnhancedPath((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ESCAPE_DIRECTION:
				setEscapeDirection((EscapeDirectionType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION:
				setExtrusion((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ALLOWED:
				setExtrusionAllowed((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_BRIGHTNESS:
				setExtrusionBrightness((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_COLOR:
				setExtrusionColor((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_DEPTH:
				setExtrusionDepth((List)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_DIFFUSION:
				setExtrusionDiffusion((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_DIRECTION:
				setExtrusionFirstLightDirection((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_HARSH:
				setExtrusionFirstLightHarsh((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_LEVEL:
				setExtrusionFirstLightLevel((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_LIGHT_FACE:
				setExtrusionLightFace((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_METAL:
				setExtrusionMetal((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_NUMBER_OF_LINE_SEGMENTS:
				setExtrusionNumberOfLineSegments((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ORIGIN:
				setExtrusionOrigin((List)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ROTATION_ANGLE:
				setExtrusionRotationAngle((List)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ROTATION_CENTER:
				setExtrusionRotationCenter((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_DIRECTION:
				setExtrusionSecondLightDirection((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_HARSH:
				setExtrusionSecondLightHarsh((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_LEVEL:
				setExtrusionSecondLightLevel((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SHININESS:
				setExtrusionShininess((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SKEW:
				setExtrusionSkew((List)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SPECULARITY:
				setExtrusionSpecularity((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_VIEWPOINT:
				setExtrusionViewpoint((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL:
				setFill((FillType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_COLOR:
				setFillColor((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_GRADIENT_NAME:
				setFillGradientName((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_HATCH_NAME:
				setFillHatchName((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_HATCH_SOLID:
				setFillHatchSolid((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_HEIGHT:
				setFillImageHeight((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_NAME:
				setFillImageName((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT:
				setFillImageRefPoint((FillImageRefPointType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT_X:
				setFillImageRefPointX((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT_Y:
				setFillImageRefPointY((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_WIDTH:
				setFillImageWidth((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILTER_NAME:
				setFilterName((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FIT_TO_CONTOUR:
				setFitToContour((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FIT_TO_SIZE:
				setFitToSize((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FORMULA:
				setFormula((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FRAME_DISPLAY_BORDER:
				setFrameDisplayBorder((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FRAME_DISPLAY_SCROLLBAR:
				setFrameDisplayScrollbar((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FRAME_MARGIN_HORIZONTAL:
				setFrameMarginHorizontal((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FRAME_MARGIN_VERTICAL:
				setFrameMarginVertical((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FRAME_NAME:
				setFrameName((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GAMMA:
				setGamma((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT_LEAVING_DIRECTIONS:
				setGluePointLeavingDirections(newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINTS:
				setGluePoints((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT_TYPE:
				setGluePointType((GluePointTypeType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GRADIENT_STEP_COUNT:
				setGradientStepCount((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GREEN:
				setGreen((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GUIDE_DISTANCE:
				setGuideDistance((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GUIDE_OVERHANG:
				setGuideOverhang((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_MIRROR_HORIZONTAL:
				setHandleMirrorHorizontal((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_MIRROR_VERTICAL:
				setHandleMirrorVertical((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_POLAR:
				setHandlePolar((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_POSITION:
				setHandlePosition((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RADIUS_RANGE_MAXIMUM:
				setHandleRadiusRangeMaximum((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RADIUS_RANGE_MINIMUM:
				setHandleRadiusRangeMinimum((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_XMAXIMUM:
				setHandleRangeXMaximum((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_XMINIMUM:
				setHandleRangeXMinimum((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_YMAXIMUM:
				setHandleRangeYMaximum((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_YMINIMUM:
				setHandleRangeYMinimum((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_SWITCHED:
				setHandleSwitched((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__IMAGE_OPACITY:
				setImageOpacity((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__KIND:
				setKind((KindType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LAYER1:
				setLayer1((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LINE_DISTANCE:
				setLineDistance((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LINE_SKEW:
				setLineSkew((List)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LUMINANCE:
				setLuminance((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER_END:
				setMarkerEnd((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER_END_CENTER:
				setMarkerEndCenter((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER_END_WIDTH:
				setMarkerEndWidth((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER_START:
				setMarkerStart((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER_START_CENTER:
				setMarkerStartCenter((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER_START_WIDTH:
				setMarkerStartWidth((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MASTER_PAGE_NAME:
				setMasterPageName((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MAY_SCRIPT:
				setMayScript((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MEASURE_ALIGN:
				setMeasureAlign((MeasureAlignType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MEASURE_VERTICAL_ALIGN:
				setMeasureVerticalAlign((MeasureVerticalAlignType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MIME_TYPE:
				setMimeType(newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MIRROR_HORIZONTAL:
				setMirrorHorizontal((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MIRROR_VERTICAL:
				setMirrorVertical((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MODIFIERS:
				setModifiers((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__NAV_ORDER:
				setNavOrder((List<String>)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__NOHREF:
				setNohref((NohrefType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__NOTIFY_ON_UPDATE_OF_RANGES:
				setNotifyOnUpdateOfRanges((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OBJECT1:
				setObject1(newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OLE_DRAW_ASPECT:
				setOleDrawAspect((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OPACITY1:
				setOpacity1((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OPACITY_NAME:
				setOpacityName((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PAGE_NUMBER:
				setPageNumber((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PARALLEL:
				setParallel((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PATH_STRETCHPOINT_X:
				setPathStretchpointX(((Double)newValue).doubleValue());
				return;
			case DrawingPackage.DOCUMENT_ROOT__PATH_STRETCHPOINT_Y:
				setPathStretchpointY(((Double)newValue).doubleValue());
				return;
			case DrawingPackage.DOCUMENT_ROOT__PLACING:
				setPlacing((PlacingType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__POINTS:
				setPoints((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PROTECTED:
				setProtected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__RECREATE_ON_EDIT:
				setRecreateOnEdit((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__RED:
				setRed((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ROTATION:
				setRotation((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SECONDARY_FILL_COLOR:
				setSecondaryFillColor((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHADOW:
				setShadow((ShadowType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_COLOR:
				setShadowColor((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_OFFSET_X:
				setShadowOffsetX((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_OFFSET_Y:
				setShadowOffsetY((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_OPACITY:
				setShadowOpacity((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHAPE_ID:
				setShapeId((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHARPNESS:
				setSharpness((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHOW_UNIT:
				setShowUnit((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START:
				setStart((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_ANGLE:
				setStartAngle(((Double)newValue).doubleValue());
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_COLOR:
				setStartColor((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_GLUE_POINT:
				setStartGluePoint((BigInteger)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_GUIDE:
				setStartGuide((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_INTENSITY:
				setStartIntensity((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_LINE_SPACING_HORIZONTAL:
				setStartLineSpacingHorizontal((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_LINE_SPACING_VERTICAL:
				setStartLineSpacingVertical((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_SHAPE:
				setStartShape((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__STROKE:
				setStroke((StrokeType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH1:
				setStrokeDash1((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH_NAMES:
				setStrokeDashNames((List<String>)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__STROKE_LINEJOIN:
				setStrokeLinejoin((StrokeLinejoinType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SYMBOL_COLOR:
				setSymbolColor((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXTAREA_HORIZONTAL_ALIGN:
				setTextareaHorizontalAlign((TextareaHorizontalAlignType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_AREAS:
				setTextAreas((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXTAREA_VERTICAL_ALIGN:
				setTextareaVerticalAlign((TextareaVerticalAlignType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH:
				setTextPath((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_ALLOWED:
				setTextPathAllowed((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_MODE:
				setTextPathMode((TextPathModeType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_SAME_LETTER_HEIGHTS:
				setTextPathSameLetterHeights((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_SCALE:
				setTextPathScale((TextPathScaleType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_ROTATE_ANGLE:
				setTextRotateAngle(((Double)newValue).doubleValue());
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_STYLE_NAME:
				setTextStyleName((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TILE_REPEAT_OFFSET:
				setTileRepeatOffset(newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__UNIT:
				setUnit((UnitType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__VALUE:
				setValue(newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_HEIGHT:
				setVisibleAreaHeight((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_LEFT:
				setVisibleAreaLeft((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_TOP:
				setVisibleAreaTop((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_WIDTH:
				setVisibleAreaWidth((String)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__WRAP_INFLUENCE_ON_POSITION:
				setWrapInfluenceOnPosition((WrapInfluenceOnPositionType)newValue);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ZINDEX:
				setZIndex((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DrawingPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case DrawingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DrawingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DrawingPackage.DOCUMENT_ROOT__A:
				setA((AType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__APPLET:
				setApplet((AppletType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__AREA_CIRCLE:
				setAreaCircle((AreaCircleType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__AREA_POLYGON:
				setAreaPolygon((AreaPolygonType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__AREA_RECTANGLE:
				setAreaRectangle((AreaRectangleType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION:
				setCaption((CaptionType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CIRCLE:
				setCircle((CircleType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((ConnectorType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONTOUR_PATH:
				setContourPath((ContourPathType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONTOUR_POLYGON:
				setContourPolygon((ContourPolygonType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONTROL:
				setControl((ControlType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CUSTOM_SHAPE:
				setCustomShape((CustomShapeType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ELLIPSE:
				setEllipse((EllipseType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ENHANCED_GEOMETRY:
				setEnhancedGeometry((EnhancedGeometryType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EQUATION:
				setEquation((EquationType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE:
				setFillImage((FillImageType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FLOATING_FRAME:
				setFloatingFrame((FloatingFrameType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FRAME:
				setFrame((FrameType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__G:
				setG((GType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT:
				setGluePoint((GluePointType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GRADIENT:
				setGradient((GradientType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE:
				setHandle((HandleType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HATCH:
				setHatch((HatchType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__IMAGE:
				setImage((ImageType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__IMAGE_MAP:
				setImageMap((ImageMapType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LAYER:
				setLayer((LayerType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LAYER_SET:
				setLayerSet((LayerSetType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LINE:
				setLine((LineType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER:
				setMarker((MarkerType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MEASURE:
				setMeasure((MeasureType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OBJECT:
				setObject((ObjectType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OBJECT_OLE:
				setObjectOle((ObjectOleType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OPACITY:
				setOpacity((OpacityType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PAGE:
				setPage((PageType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PAGE_THUMBNAIL:
				setPageThumbnail((PageThumbnailType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PARAM:
				setParam((ParamType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PATH:
				setPath((PathType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PLUGIN:
				setPlugin((PluginType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__POLYGON:
				setPolygon((PolygonType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__POLYLINE:
				setPolyline((PolylineType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__RECT:
				setRect((RectType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__REGULAR_POLYGON:
				setRegularPolygon((RegularPolygonType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH:
				setStrokeDash((StrokeDashType1)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_BOX:
				setTextBox((TextBoxType)null);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ALIGN:
				unsetAlign();
				return;
			case DrawingPackage.DOCUMENT_ROOT__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ARCHIVE:
				setArchive(ARCHIVE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__AUTO_GROW_HEIGHT:
				unsetAutoGrowHeight();
				return;
			case DrawingPackage.DOCUMENT_ROOT__AUTO_GROW_WIDTH:
				unsetAutoGrowWidth();
				return;
			case DrawingPackage.DOCUMENT_ROOT__BACKGROUND_SIZE:
				unsetBackgroundSize();
				return;
			case DrawingPackage.DOCUMENT_ROOT__BLUE:
				setBlue(BLUE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ANGLE:
				setCaptionAngle(CAPTION_ANGLE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ANGLE_TYPE:
				unsetCaptionAngleType();
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ESCAPE:
				setCaptionEscape(CAPTION_ESCAPE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ESCAPE_DIRECTION:
				unsetCaptionEscapeDirection();
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_FIT_LINE_LENGTH:
				unsetCaptionFitLineLength();
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_GAP:
				setCaptionGap(CAPTION_GAP_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ID:
				setCaptionId(CAPTION_ID_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_LINE_LENGTH:
				setCaptionLineLength(CAPTION_LINE_LENGTH_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_POINT_X:
				setCaptionPointX(CAPTION_POINT_X_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_POINT_Y:
				setCaptionPointY(CAPTION_POINT_Y_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_TYPE:
				unsetCaptionType();
				return;
			case DrawingPackage.DOCUMENT_ROOT__CHAIN_NEXT_NAME:
				setChainNextName(CHAIN_NEXT_NAME_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CLASS_ID:
				setClassId(CLASS_ID_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CLASS_NAMES:
				setClassNames(CLASS_NAMES_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__COLOR_INVERSION:
				unsetColorInversion();
				return;
			case DrawingPackage.DOCUMENT_ROOT__COLOR_MODE:
				unsetColorMode();
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONCAVE:
				unsetConcave();
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONCENTRIC_GRADIENT_FILL_ALLOWED:
				unsetConcentricGradientFillAllowed();
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONTRAST:
				setContrast(CONTRAST_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CONTROL1:
				setControl1(CONTROL1_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__COPY_OF:
				setCopyOf(COPY_OF_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CORNER_RADIUS:
				setCornerRadius(CORNER_RADIUS_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CORNERS:
				setCorners(CORNERS_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CX:
				setCx(CX_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__CY:
				setCy(CY_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DATA:
				setData(DATA_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DECIMAL_PLACES:
				setDecimalPlaces(DECIMAL_PLACES_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DISPLAY:
				unsetDisplay();
				return;
			case DrawingPackage.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DOTS1:
				setDots1(DOTS1_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DOTS1_LENGTH:
				setDots1Length(DOTS1_LENGTH_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DOTS2:
				setDots2(DOTS2_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__DOTS2_LENGTH:
				setDots2Length(DOTS2_LENGTH_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END:
				setEnd(END_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_ANGLE:
				unsetEndAngle();
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_COLOR:
				setEndColor(END_COLOR_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_GLUE_POINT:
				setEndGluePoint(END_GLUE_POINT_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_GUIDE:
				setEndGuide(END_GUIDE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_INTENSITY:
				setEndIntensity(END_INTENSITY_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_LINE_SPACING_HORIZONTAL:
				setEndLineSpacingHorizontal(END_LINE_SPACING_HORIZONTAL_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_LINE_SPACING_VERTICAL:
				setEndLineSpacingVertical(END_LINE_SPACING_VERTICAL_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__END_SHAPE:
				setEndShape(END_SHAPE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ENGINE:
				setEngine(ENGINE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ENHANCED_PATH:
				setEnhancedPath(ENHANCED_PATH_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ESCAPE_DIRECTION:
				unsetEscapeDirection();
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION:
				unsetExtrusion();
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ALLOWED:
				unsetExtrusionAllowed();
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_BRIGHTNESS:
				setExtrusionBrightness(EXTRUSION_BRIGHTNESS_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_COLOR:
				unsetExtrusionColor();
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_DEPTH:
				setExtrusionDepth(EXTRUSION_DEPTH_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_DIFFUSION:
				setExtrusionDiffusion(EXTRUSION_DIFFUSION_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_DIRECTION:
				setExtrusionFirstLightDirection(EXTRUSION_FIRST_LIGHT_DIRECTION_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_HARSH:
				unsetExtrusionFirstLightHarsh();
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_LEVEL:
				setExtrusionFirstLightLevel(EXTRUSION_FIRST_LIGHT_LEVEL_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_LIGHT_FACE:
				unsetExtrusionLightFace();
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_METAL:
				unsetExtrusionMetal();
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_NUMBER_OF_LINE_SEGMENTS:
				setExtrusionNumberOfLineSegments(EXTRUSION_NUMBER_OF_LINE_SEGMENTS_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ORIGIN:
				setExtrusionOrigin(EXTRUSION_ORIGIN_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ROTATION_ANGLE:
				setExtrusionRotationAngle(EXTRUSION_ROTATION_ANGLE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ROTATION_CENTER:
				setExtrusionRotationCenter(EXTRUSION_ROTATION_CENTER_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_DIRECTION:
				setExtrusionSecondLightDirection(EXTRUSION_SECOND_LIGHT_DIRECTION_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_HARSH:
				unsetExtrusionSecondLightHarsh();
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_LEVEL:
				setExtrusionSecondLightLevel(EXTRUSION_SECOND_LIGHT_LEVEL_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SHININESS:
				setExtrusionShininess(EXTRUSION_SHININESS_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SKEW:
				setExtrusionSkew(EXTRUSION_SKEW_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SPECULARITY:
				setExtrusionSpecularity(EXTRUSION_SPECULARITY_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_VIEWPOINT:
				setExtrusionViewpoint(EXTRUSION_VIEWPOINT_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL:
				unsetFill();
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_COLOR:
				setFillColor(FILL_COLOR_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_GRADIENT_NAME:
				setFillGradientName(FILL_GRADIENT_NAME_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_HATCH_NAME:
				setFillHatchName(FILL_HATCH_NAME_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_HATCH_SOLID:
				unsetFillHatchSolid();
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_HEIGHT:
				setFillImageHeight(FILL_IMAGE_HEIGHT_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_NAME:
				setFillImageName(FILL_IMAGE_NAME_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT:
				unsetFillImageRefPoint();
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT_X:
				setFillImageRefPointX(FILL_IMAGE_REF_POINT_X_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT_Y:
				setFillImageRefPointY(FILL_IMAGE_REF_POINT_Y_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_WIDTH:
				setFillImageWidth(FILL_IMAGE_WIDTH_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FILTER_NAME:
				setFilterName(FILTER_NAME_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FIT_TO_CONTOUR:
				unsetFitToContour();
				return;
			case DrawingPackage.DOCUMENT_ROOT__FIT_TO_SIZE:
				unsetFitToSize();
				return;
			case DrawingPackage.DOCUMENT_ROOT__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FRAME_DISPLAY_BORDER:
				unsetFrameDisplayBorder();
				return;
			case DrawingPackage.DOCUMENT_ROOT__FRAME_DISPLAY_SCROLLBAR:
				unsetFrameDisplayScrollbar();
				return;
			case DrawingPackage.DOCUMENT_ROOT__FRAME_MARGIN_HORIZONTAL:
				setFrameMarginHorizontal(FRAME_MARGIN_HORIZONTAL_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FRAME_MARGIN_VERTICAL:
				setFrameMarginVertical(FRAME_MARGIN_VERTICAL_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__FRAME_NAME:
				setFrameName(FRAME_NAME_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GAMMA:
				setGamma(GAMMA_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT_LEAVING_DIRECTIONS:
				setGluePointLeavingDirections(GLUE_POINT_LEAVING_DIRECTIONS_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINTS:
				setGluePoints(GLUE_POINTS_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT_TYPE:
				unsetGluePointType();
				return;
			case DrawingPackage.DOCUMENT_ROOT__GRADIENT_STEP_COUNT:
				setGradientStepCount(GRADIENT_STEP_COUNT_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GREEN:
				setGreen(GREEN_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GUIDE_DISTANCE:
				setGuideDistance(GUIDE_DISTANCE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__GUIDE_OVERHANG:
				setGuideOverhang(GUIDE_OVERHANG_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_MIRROR_HORIZONTAL:
				unsetHandleMirrorHorizontal();
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_MIRROR_VERTICAL:
				unsetHandleMirrorVertical();
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_POLAR:
				setHandlePolar(HANDLE_POLAR_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_POSITION:
				setHandlePosition(HANDLE_POSITION_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RADIUS_RANGE_MAXIMUM:
				setHandleRadiusRangeMaximum(HANDLE_RADIUS_RANGE_MAXIMUM_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RADIUS_RANGE_MINIMUM:
				setHandleRadiusRangeMinimum(HANDLE_RADIUS_RANGE_MINIMUM_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_XMAXIMUM:
				setHandleRangeXMaximum(HANDLE_RANGE_XMAXIMUM_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_XMINIMUM:
				setHandleRangeXMinimum(HANDLE_RANGE_XMINIMUM_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_YMAXIMUM:
				setHandleRangeYMaximum(HANDLE_RANGE_YMAXIMUM_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_YMINIMUM:
				setHandleRangeYMinimum(HANDLE_RANGE_YMINIMUM_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_SWITCHED:
				unsetHandleSwitched();
				return;
			case DrawingPackage.DOCUMENT_ROOT__IMAGE_OPACITY:
				setImageOpacity(IMAGE_OPACITY_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__KIND:
				unsetKind();
				return;
			case DrawingPackage.DOCUMENT_ROOT__LAYER1:
				setLayer1(LAYER1_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LINE_DISTANCE:
				setLineDistance(LINE_DISTANCE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LINE_SKEW:
				setLineSkew(LINE_SKEW_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__LUMINANCE:
				setLuminance(LUMINANCE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER_END:
				setMarkerEnd(MARKER_END_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER_END_CENTER:
				unsetMarkerEndCenter();
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER_END_WIDTH:
				setMarkerEndWidth(MARKER_END_WIDTH_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER_START:
				setMarkerStart(MARKER_START_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER_START_CENTER:
				unsetMarkerStartCenter();
				return;
			case DrawingPackage.DOCUMENT_ROOT__MARKER_START_WIDTH:
				setMarkerStartWidth(MARKER_START_WIDTH_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MASTER_PAGE_NAME:
				setMasterPageName(MASTER_PAGE_NAME_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MAY_SCRIPT:
				unsetMayScript();
				return;
			case DrawingPackage.DOCUMENT_ROOT__MEASURE_ALIGN:
				unsetMeasureAlign();
				return;
			case DrawingPackage.DOCUMENT_ROOT__MEASURE_VERTICAL_ALIGN:
				unsetMeasureVerticalAlign();
				return;
			case DrawingPackage.DOCUMENT_ROOT__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__MIRROR_HORIZONTAL:
				unsetMirrorHorizontal();
				return;
			case DrawingPackage.DOCUMENT_ROOT__MIRROR_VERTICAL:
				unsetMirrorVertical();
				return;
			case DrawingPackage.DOCUMENT_ROOT__MODIFIERS:
				setModifiers(MODIFIERS_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__NAV_ORDER:
				setNavOrder(NAV_ORDER_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__NOHREF:
				unsetNohref();
				return;
			case DrawingPackage.DOCUMENT_ROOT__NOTIFY_ON_UPDATE_OF_RANGES:
				setNotifyOnUpdateOfRanges(NOTIFY_ON_UPDATE_OF_RANGES_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OBJECT1:
				setObject1(OBJECT1_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OLE_DRAW_ASPECT:
				setOleDrawAspect(OLE_DRAW_ASPECT_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OPACITY1:
				setOpacity1(OPACITY1_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__OPACITY_NAME:
				setOpacityName(OPACITY_NAME_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PAGE_NUMBER:
				setPageNumber(PAGE_NUMBER_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PARALLEL:
				unsetParallel();
				return;
			case DrawingPackage.DOCUMENT_ROOT__PATH_STRETCHPOINT_X:
				unsetPathStretchpointX();
				return;
			case DrawingPackage.DOCUMENT_ROOT__PATH_STRETCHPOINT_Y:
				unsetPathStretchpointY();
				return;
			case DrawingPackage.DOCUMENT_ROOT__PLACING:
				unsetPlacing();
				return;
			case DrawingPackage.DOCUMENT_ROOT__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__PROTECTED:
				unsetProtected();
				return;
			case DrawingPackage.DOCUMENT_ROOT__RECREATE_ON_EDIT:
				unsetRecreateOnEdit();
				return;
			case DrawingPackage.DOCUMENT_ROOT__RED:
				setRed(RED_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SECONDARY_FILL_COLOR:
				setSecondaryFillColor(SECONDARY_FILL_COLOR_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHADOW:
				unsetShadow();
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_COLOR:
				setShadowColor(SHADOW_COLOR_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_OFFSET_X:
				setShadowOffsetX(SHADOW_OFFSET_X_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_OFFSET_Y:
				setShadowOffsetY(SHADOW_OFFSET_Y_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_OPACITY:
				setShadowOpacity(SHADOW_OPACITY_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHAPE_ID:
				setShapeId(SHAPE_ID_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHARPNESS:
				setSharpness(SHARPNESS_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SHOW_UNIT:
				unsetShowUnit();
				return;
			case DrawingPackage.DOCUMENT_ROOT__START:
				setStart(START_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_ANGLE:
				unsetStartAngle();
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_COLOR:
				setStartColor(START_COLOR_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_GLUE_POINT:
				setStartGluePoint(START_GLUE_POINT_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_GUIDE:
				setStartGuide(START_GUIDE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_INTENSITY:
				setStartIntensity(START_INTENSITY_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_LINE_SPACING_HORIZONTAL:
				setStartLineSpacingHorizontal(START_LINE_SPACING_HORIZONTAL_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_LINE_SPACING_VERTICAL:
				setStartLineSpacingVertical(START_LINE_SPACING_VERTICAL_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__START_SHAPE:
				setStartShape(START_SHAPE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__STROKE:
				unsetStroke();
				return;
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH1:
				setStrokeDash1(STROKE_DASH1_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH_NAMES:
				setStrokeDashNames(STROKE_DASH_NAMES_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__STROKE_LINEJOIN:
				unsetStrokeLinejoin();
				return;
			case DrawingPackage.DOCUMENT_ROOT__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__SYMBOL_COLOR:
				setSymbolColor(SYMBOL_COLOR_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXTAREA_HORIZONTAL_ALIGN:
				unsetTextareaHorizontalAlign();
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_AREAS:
				setTextAreas(TEXT_AREAS_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXTAREA_VERTICAL_ALIGN:
				unsetTextareaVerticalAlign();
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH:
				unsetTextPath();
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_ALLOWED:
				unsetTextPathAllowed();
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_MODE:
				unsetTextPathMode();
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_SAME_LETTER_HEIGHTS:
				unsetTextPathSameLetterHeights();
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_SCALE:
				unsetTextPathScale();
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_ROTATE_ANGLE:
				unsetTextRotateAngle();
				return;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_STYLE_NAME:
				setTextStyleName(TEXT_STYLE_NAME_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TILE_REPEAT_OFFSET:
				setTileRepeatOffset(TILE_REPEAT_OFFSET_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform(TRANSFORM_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__UNIT:
				unsetUnit();
				return;
			case DrawingPackage.DOCUMENT_ROOT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_HEIGHT:
				setVisibleAreaHeight(VISIBLE_AREA_HEIGHT_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_LEFT:
				setVisibleAreaLeft(VISIBLE_AREA_LEFT_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_TOP:
				setVisibleAreaTop(VISIBLE_AREA_TOP_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_WIDTH:
				setVisibleAreaWidth(VISIBLE_AREA_WIDTH_EDEFAULT);
				return;
			case DrawingPackage.DOCUMENT_ROOT__WRAP_INFLUENCE_ON_POSITION:
				unsetWrapInfluenceOnPosition();
				return;
			case DrawingPackage.DOCUMENT_ROOT__ZINDEX:
				setZIndex(ZINDEX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DrawingPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DrawingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DrawingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DrawingPackage.DOCUMENT_ROOT__A:
				return getA() != null;
			case DrawingPackage.DOCUMENT_ROOT__APPLET:
				return getApplet() != null;
			case DrawingPackage.DOCUMENT_ROOT__AREA_CIRCLE:
				return getAreaCircle() != null;
			case DrawingPackage.DOCUMENT_ROOT__AREA_POLYGON:
				return getAreaPolygon() != null;
			case DrawingPackage.DOCUMENT_ROOT__AREA_RECTANGLE:
				return getAreaRectangle() != null;
			case DrawingPackage.DOCUMENT_ROOT__CAPTION:
				return getCaption() != null;
			case DrawingPackage.DOCUMENT_ROOT__CIRCLE:
				return getCircle() != null;
			case DrawingPackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector() != null;
			case DrawingPackage.DOCUMENT_ROOT__CONTOUR_PATH:
				return getContourPath() != null;
			case DrawingPackage.DOCUMENT_ROOT__CONTOUR_POLYGON:
				return getContourPolygon() != null;
			case DrawingPackage.DOCUMENT_ROOT__CONTROL:
				return getControl() != null;
			case DrawingPackage.DOCUMENT_ROOT__CUSTOM_SHAPE:
				return getCustomShape() != null;
			case DrawingPackage.DOCUMENT_ROOT__ELLIPSE:
				return getEllipse() != null;
			case DrawingPackage.DOCUMENT_ROOT__ENHANCED_GEOMETRY:
				return getEnhancedGeometry() != null;
			case DrawingPackage.DOCUMENT_ROOT__EQUATION:
				return getEquation() != null;
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE:
				return getFillImage() != null;
			case DrawingPackage.DOCUMENT_ROOT__FLOATING_FRAME:
				return getFloatingFrame() != null;
			case DrawingPackage.DOCUMENT_ROOT__FRAME:
				return getFrame() != null;
			case DrawingPackage.DOCUMENT_ROOT__G:
				return getG() != null;
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT:
				return getGluePoint() != null;
			case DrawingPackage.DOCUMENT_ROOT__GRADIENT:
				return getGradient() != null;
			case DrawingPackage.DOCUMENT_ROOT__HANDLE:
				return getHandle() != null;
			case DrawingPackage.DOCUMENT_ROOT__HATCH:
				return getHatch() != null;
			case DrawingPackage.DOCUMENT_ROOT__IMAGE:
				return getImage() != null;
			case DrawingPackage.DOCUMENT_ROOT__IMAGE_MAP:
				return getImageMap() != null;
			case DrawingPackage.DOCUMENT_ROOT__LAYER:
				return getLayer() != null;
			case DrawingPackage.DOCUMENT_ROOT__LAYER_SET:
				return getLayerSet() != null;
			case DrawingPackage.DOCUMENT_ROOT__LINE:
				return getLine() != null;
			case DrawingPackage.DOCUMENT_ROOT__MARKER:
				return getMarker() != null;
			case DrawingPackage.DOCUMENT_ROOT__MEASURE:
				return getMeasure() != null;
			case DrawingPackage.DOCUMENT_ROOT__OBJECT:
				return getObject() != null;
			case DrawingPackage.DOCUMENT_ROOT__OBJECT_OLE:
				return getObjectOle() != null;
			case DrawingPackage.DOCUMENT_ROOT__OPACITY:
				return getOpacity() != null;
			case DrawingPackage.DOCUMENT_ROOT__PAGE:
				return getPage() != null;
			case DrawingPackage.DOCUMENT_ROOT__PAGE_THUMBNAIL:
				return getPageThumbnail() != null;
			case DrawingPackage.DOCUMENT_ROOT__PARAM:
				return getParam() != null;
			case DrawingPackage.DOCUMENT_ROOT__PATH:
				return getPath() != null;
			case DrawingPackage.DOCUMENT_ROOT__PLUGIN:
				return getPlugin() != null;
			case DrawingPackage.DOCUMENT_ROOT__POLYGON:
				return getPolygon() != null;
			case DrawingPackage.DOCUMENT_ROOT__POLYLINE:
				return getPolyline() != null;
			case DrawingPackage.DOCUMENT_ROOT__RECT:
				return getRect() != null;
			case DrawingPackage.DOCUMENT_ROOT__REGULAR_POLYGON:
				return getRegularPolygon() != null;
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH:
				return getStrokeDash() != null;
			case DrawingPackage.DOCUMENT_ROOT__TEXT_BOX:
				return getTextBox() != null;
			case DrawingPackage.DOCUMENT_ROOT__ALIGN:
				return isSetAlign();
			case DrawingPackage.DOCUMENT_ROOT__ANGLE:
				return ANGLE_EDEFAULT == null ? angle != null : !ANGLE_EDEFAULT.equals(angle);
			case DrawingPackage.DOCUMENT_ROOT__ARCHIVE:
				return ARCHIVE_EDEFAULT == null ? archive != null : !ARCHIVE_EDEFAULT.equals(archive);
			case DrawingPackage.DOCUMENT_ROOT__AUTO_GROW_HEIGHT:
				return isSetAutoGrowHeight();
			case DrawingPackage.DOCUMENT_ROOT__AUTO_GROW_WIDTH:
				return isSetAutoGrowWidth();
			case DrawingPackage.DOCUMENT_ROOT__BACKGROUND_SIZE:
				return isSetBackgroundSize();
			case DrawingPackage.DOCUMENT_ROOT__BLUE:
				return BLUE_EDEFAULT == null ? blue != null : !BLUE_EDEFAULT.equals(blue);
			case DrawingPackage.DOCUMENT_ROOT__BORDER:
				return BORDER_EDEFAULT == null ? border != null : !BORDER_EDEFAULT.equals(border);
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ANGLE:
				return CAPTION_ANGLE_EDEFAULT == null ? captionAngle != null : !CAPTION_ANGLE_EDEFAULT.equals(captionAngle);
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ANGLE_TYPE:
				return isSetCaptionAngleType();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ESCAPE:
				return CAPTION_ESCAPE_EDEFAULT == null ? captionEscape != null : !CAPTION_ESCAPE_EDEFAULT.equals(captionEscape);
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ESCAPE_DIRECTION:
				return isSetCaptionEscapeDirection();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_FIT_LINE_LENGTH:
				return isSetCaptionFitLineLength();
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_GAP:
				return CAPTION_GAP_EDEFAULT == null ? captionGap != null : !CAPTION_GAP_EDEFAULT.equals(captionGap);
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_ID:
				return CAPTION_ID_EDEFAULT == null ? captionId != null : !CAPTION_ID_EDEFAULT.equals(captionId);
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_LINE_LENGTH:
				return CAPTION_LINE_LENGTH_EDEFAULT == null ? captionLineLength != null : !CAPTION_LINE_LENGTH_EDEFAULT.equals(captionLineLength);
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_POINT_X:
				return CAPTION_POINT_X_EDEFAULT == null ? captionPointX != null : !CAPTION_POINT_X_EDEFAULT.equals(captionPointX);
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_POINT_Y:
				return CAPTION_POINT_Y_EDEFAULT == null ? captionPointY != null : !CAPTION_POINT_Y_EDEFAULT.equals(captionPointY);
			case DrawingPackage.DOCUMENT_ROOT__CAPTION_TYPE:
				return isSetCaptionType();
			case DrawingPackage.DOCUMENT_ROOT__CHAIN_NEXT_NAME:
				return CHAIN_NEXT_NAME_EDEFAULT == null ? chainNextName != null : !CHAIN_NEXT_NAME_EDEFAULT.equals(chainNextName);
			case DrawingPackage.DOCUMENT_ROOT__CLASS_ID:
				return CLASS_ID_EDEFAULT == null ? classId != null : !CLASS_ID_EDEFAULT.equals(classId);
			case DrawingPackage.DOCUMENT_ROOT__CLASS_NAMES:
				return CLASS_NAMES_EDEFAULT == null ? classNames != null : !CLASS_NAMES_EDEFAULT.equals(classNames);
			case DrawingPackage.DOCUMENT_ROOT__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DrawingPackage.DOCUMENT_ROOT__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case DrawingPackage.DOCUMENT_ROOT__COLOR_INVERSION:
				return isSetColorInversion();
			case DrawingPackage.DOCUMENT_ROOT__COLOR_MODE:
				return isSetColorMode();
			case DrawingPackage.DOCUMENT_ROOT__CONCAVE:
				return isSetConcave();
			case DrawingPackage.DOCUMENT_ROOT__CONCENTRIC_GRADIENT_FILL_ALLOWED:
				return isSetConcentricGradientFillAllowed();
			case DrawingPackage.DOCUMENT_ROOT__CONTRAST:
				return CONTRAST_EDEFAULT == null ? contrast != null : !CONTRAST_EDEFAULT.equals(contrast);
			case DrawingPackage.DOCUMENT_ROOT__CONTROL1:
				return CONTROL1_EDEFAULT == null ? control1 != null : !CONTROL1_EDEFAULT.equals(control1);
			case DrawingPackage.DOCUMENT_ROOT__COPY_OF:
				return COPY_OF_EDEFAULT == null ? copyOf != null : !COPY_OF_EDEFAULT.equals(copyOf);
			case DrawingPackage.DOCUMENT_ROOT__CORNER_RADIUS:
				return CORNER_RADIUS_EDEFAULT == null ? cornerRadius != null : !CORNER_RADIUS_EDEFAULT.equals(cornerRadius);
			case DrawingPackage.DOCUMENT_ROOT__CORNERS:
				return CORNERS_EDEFAULT == null ? corners != null : !CORNERS_EDEFAULT.equals(corners);
			case DrawingPackage.DOCUMENT_ROOT__CX:
				return CX_EDEFAULT == null ? cx != null : !CX_EDEFAULT.equals(cx);
			case DrawingPackage.DOCUMENT_ROOT__CY:
				return CY_EDEFAULT == null ? cy != null : !CY_EDEFAULT.equals(cy);
			case DrawingPackage.DOCUMENT_ROOT__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case DrawingPackage.DOCUMENT_ROOT__DECIMAL_PLACES:
				return DECIMAL_PLACES_EDEFAULT == null ? decimalPlaces != null : !DECIMAL_PLACES_EDEFAULT.equals(decimalPlaces);
			case DrawingPackage.DOCUMENT_ROOT__DISPLAY:
				return isSetDisplay();
			case DrawingPackage.DOCUMENT_ROOT__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case DrawingPackage.DOCUMENT_ROOT__DISTANCE:
				return DISTANCE_EDEFAULT == null ? distance != null : !DISTANCE_EDEFAULT.equals(distance);
			case DrawingPackage.DOCUMENT_ROOT__DOTS1:
				return DOTS1_EDEFAULT == null ? dots1 != null : !DOTS1_EDEFAULT.equals(dots1);
			case DrawingPackage.DOCUMENT_ROOT__DOTS1_LENGTH:
				return DOTS1_LENGTH_EDEFAULT == null ? dots1Length != null : !DOTS1_LENGTH_EDEFAULT.equals(dots1Length);
			case DrawingPackage.DOCUMENT_ROOT__DOTS2:
				return DOTS2_EDEFAULT == null ? dots2 != null : !DOTS2_EDEFAULT.equals(dots2);
			case DrawingPackage.DOCUMENT_ROOT__DOTS2_LENGTH:
				return DOTS2_LENGTH_EDEFAULT == null ? dots2Length != null : !DOTS2_LENGTH_EDEFAULT.equals(dots2Length);
			case DrawingPackage.DOCUMENT_ROOT__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case DrawingPackage.DOCUMENT_ROOT__END_ANGLE:
				return isSetEndAngle();
			case DrawingPackage.DOCUMENT_ROOT__END_COLOR:
				return END_COLOR_EDEFAULT == null ? endColor != null : !END_COLOR_EDEFAULT.equals(endColor);
			case DrawingPackage.DOCUMENT_ROOT__END_GLUE_POINT:
				return END_GLUE_POINT_EDEFAULT == null ? endGluePoint != null : !END_GLUE_POINT_EDEFAULT.equals(endGluePoint);
			case DrawingPackage.DOCUMENT_ROOT__END_GUIDE:
				return END_GUIDE_EDEFAULT == null ? endGuide != null : !END_GUIDE_EDEFAULT.equals(endGuide);
			case DrawingPackage.DOCUMENT_ROOT__END_INTENSITY:
				return END_INTENSITY_EDEFAULT == null ? endIntensity != null : !END_INTENSITY_EDEFAULT.equals(endIntensity);
			case DrawingPackage.DOCUMENT_ROOT__END_LINE_SPACING_HORIZONTAL:
				return END_LINE_SPACING_HORIZONTAL_EDEFAULT == null ? endLineSpacingHorizontal != null : !END_LINE_SPACING_HORIZONTAL_EDEFAULT.equals(endLineSpacingHorizontal);
			case DrawingPackage.DOCUMENT_ROOT__END_LINE_SPACING_VERTICAL:
				return END_LINE_SPACING_VERTICAL_EDEFAULT == null ? endLineSpacingVertical != null : !END_LINE_SPACING_VERTICAL_EDEFAULT.equals(endLineSpacingVertical);
			case DrawingPackage.DOCUMENT_ROOT__END_SHAPE:
				return END_SHAPE_EDEFAULT == null ? endShape != null : !END_SHAPE_EDEFAULT.equals(endShape);
			case DrawingPackage.DOCUMENT_ROOT__ENGINE:
				return ENGINE_EDEFAULT == null ? engine != null : !ENGINE_EDEFAULT.equals(engine);
			case DrawingPackage.DOCUMENT_ROOT__ENHANCED_PATH:
				return ENHANCED_PATH_EDEFAULT == null ? enhancedPath != null : !ENHANCED_PATH_EDEFAULT.equals(enhancedPath);
			case DrawingPackage.DOCUMENT_ROOT__ESCAPE_DIRECTION:
				return isSetEscapeDirection();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION:
				return isSetExtrusion();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ALLOWED:
				return isSetExtrusionAllowed();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_BRIGHTNESS:
				return EXTRUSION_BRIGHTNESS_EDEFAULT == null ? extrusionBrightness != null : !EXTRUSION_BRIGHTNESS_EDEFAULT.equals(extrusionBrightness);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_COLOR:
				return isSetExtrusionColor();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_DEPTH:
				return EXTRUSION_DEPTH_EDEFAULT == null ? extrusionDepth != null : !EXTRUSION_DEPTH_EDEFAULT.equals(extrusionDepth);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_DIFFUSION:
				return EXTRUSION_DIFFUSION_EDEFAULT == null ? extrusionDiffusion != null : !EXTRUSION_DIFFUSION_EDEFAULT.equals(extrusionDiffusion);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_DIRECTION:
				return EXTRUSION_FIRST_LIGHT_DIRECTION_EDEFAULT == null ? extrusionFirstLightDirection != null : !EXTRUSION_FIRST_LIGHT_DIRECTION_EDEFAULT.equals(extrusionFirstLightDirection);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_HARSH:
				return isSetExtrusionFirstLightHarsh();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_FIRST_LIGHT_LEVEL:
				return EXTRUSION_FIRST_LIGHT_LEVEL_EDEFAULT == null ? extrusionFirstLightLevel != null : !EXTRUSION_FIRST_LIGHT_LEVEL_EDEFAULT.equals(extrusionFirstLightLevel);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_LIGHT_FACE:
				return isSetExtrusionLightFace();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_METAL:
				return isSetExtrusionMetal();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_NUMBER_OF_LINE_SEGMENTS:
				return EXTRUSION_NUMBER_OF_LINE_SEGMENTS_EDEFAULT == null ? extrusionNumberOfLineSegments != null : !EXTRUSION_NUMBER_OF_LINE_SEGMENTS_EDEFAULT.equals(extrusionNumberOfLineSegments);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ORIGIN:
				return EXTRUSION_ORIGIN_EDEFAULT == null ? extrusionOrigin != null : !EXTRUSION_ORIGIN_EDEFAULT.equals(extrusionOrigin);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ROTATION_ANGLE:
				return EXTRUSION_ROTATION_ANGLE_EDEFAULT == null ? extrusionRotationAngle != null : !EXTRUSION_ROTATION_ANGLE_EDEFAULT.equals(extrusionRotationAngle);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_ROTATION_CENTER:
				return EXTRUSION_ROTATION_CENTER_EDEFAULT == null ? extrusionRotationCenter != null : !EXTRUSION_ROTATION_CENTER_EDEFAULT.equals(extrusionRotationCenter);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_DIRECTION:
				return EXTRUSION_SECOND_LIGHT_DIRECTION_EDEFAULT == null ? extrusionSecondLightDirection != null : !EXTRUSION_SECOND_LIGHT_DIRECTION_EDEFAULT.equals(extrusionSecondLightDirection);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_HARSH:
				return isSetExtrusionSecondLightHarsh();
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SECOND_LIGHT_LEVEL:
				return EXTRUSION_SECOND_LIGHT_LEVEL_EDEFAULT == null ? extrusionSecondLightLevel != null : !EXTRUSION_SECOND_LIGHT_LEVEL_EDEFAULT.equals(extrusionSecondLightLevel);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SHININESS:
				return EXTRUSION_SHININESS_EDEFAULT == null ? extrusionShininess != null : !EXTRUSION_SHININESS_EDEFAULT.equals(extrusionShininess);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SKEW:
				return EXTRUSION_SKEW_EDEFAULT == null ? extrusionSkew != null : !EXTRUSION_SKEW_EDEFAULT.equals(extrusionSkew);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_SPECULARITY:
				return EXTRUSION_SPECULARITY_EDEFAULT == null ? extrusionSpecularity != null : !EXTRUSION_SPECULARITY_EDEFAULT.equals(extrusionSpecularity);
			case DrawingPackage.DOCUMENT_ROOT__EXTRUSION_VIEWPOINT:
				return EXTRUSION_VIEWPOINT_EDEFAULT == null ? extrusionViewpoint != null : !EXTRUSION_VIEWPOINT_EDEFAULT.equals(extrusionViewpoint);
			case DrawingPackage.DOCUMENT_ROOT__FILL:
				return isSetFill();
			case DrawingPackage.DOCUMENT_ROOT__FILL_COLOR:
				return FILL_COLOR_EDEFAULT == null ? fillColor != null : !FILL_COLOR_EDEFAULT.equals(fillColor);
			case DrawingPackage.DOCUMENT_ROOT__FILL_GRADIENT_NAME:
				return FILL_GRADIENT_NAME_EDEFAULT == null ? fillGradientName != null : !FILL_GRADIENT_NAME_EDEFAULT.equals(fillGradientName);
			case DrawingPackage.DOCUMENT_ROOT__FILL_HATCH_NAME:
				return FILL_HATCH_NAME_EDEFAULT == null ? fillHatchName != null : !FILL_HATCH_NAME_EDEFAULT.equals(fillHatchName);
			case DrawingPackage.DOCUMENT_ROOT__FILL_HATCH_SOLID:
				return isSetFillHatchSolid();
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_HEIGHT:
				return FILL_IMAGE_HEIGHT_EDEFAULT == null ? fillImageHeight != null : !FILL_IMAGE_HEIGHT_EDEFAULT.equals(fillImageHeight);
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_NAME:
				return FILL_IMAGE_NAME_EDEFAULT == null ? fillImageName != null : !FILL_IMAGE_NAME_EDEFAULT.equals(fillImageName);
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT:
				return isSetFillImageRefPoint();
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT_X:
				return FILL_IMAGE_REF_POINT_X_EDEFAULT == null ? fillImageRefPointX != null : !FILL_IMAGE_REF_POINT_X_EDEFAULT.equals(fillImageRefPointX);
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_REF_POINT_Y:
				return FILL_IMAGE_REF_POINT_Y_EDEFAULT == null ? fillImageRefPointY != null : !FILL_IMAGE_REF_POINT_Y_EDEFAULT.equals(fillImageRefPointY);
			case DrawingPackage.DOCUMENT_ROOT__FILL_IMAGE_WIDTH:
				return FILL_IMAGE_WIDTH_EDEFAULT == null ? fillImageWidth != null : !FILL_IMAGE_WIDTH_EDEFAULT.equals(fillImageWidth);
			case DrawingPackage.DOCUMENT_ROOT__FILTER_NAME:
				return FILTER_NAME_EDEFAULT == null ? filterName != null : !FILTER_NAME_EDEFAULT.equals(filterName);
			case DrawingPackage.DOCUMENT_ROOT__FIT_TO_CONTOUR:
				return isSetFitToContour();
			case DrawingPackage.DOCUMENT_ROOT__FIT_TO_SIZE:
				return isSetFitToSize();
			case DrawingPackage.DOCUMENT_ROOT__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
			case DrawingPackage.DOCUMENT_ROOT__FRAME_DISPLAY_BORDER:
				return isSetFrameDisplayBorder();
			case DrawingPackage.DOCUMENT_ROOT__FRAME_DISPLAY_SCROLLBAR:
				return isSetFrameDisplayScrollbar();
			case DrawingPackage.DOCUMENT_ROOT__FRAME_MARGIN_HORIZONTAL:
				return FRAME_MARGIN_HORIZONTAL_EDEFAULT == null ? frameMarginHorizontal != null : !FRAME_MARGIN_HORIZONTAL_EDEFAULT.equals(frameMarginHorizontal);
			case DrawingPackage.DOCUMENT_ROOT__FRAME_MARGIN_VERTICAL:
				return FRAME_MARGIN_VERTICAL_EDEFAULT == null ? frameMarginVertical != null : !FRAME_MARGIN_VERTICAL_EDEFAULT.equals(frameMarginVertical);
			case DrawingPackage.DOCUMENT_ROOT__FRAME_NAME:
				return FRAME_NAME_EDEFAULT == null ? frameName != null : !FRAME_NAME_EDEFAULT.equals(frameName);
			case DrawingPackage.DOCUMENT_ROOT__GAMMA:
				return GAMMA_EDEFAULT == null ? gamma != null : !GAMMA_EDEFAULT.equals(gamma);
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT_LEAVING_DIRECTIONS:
				return GLUE_POINT_LEAVING_DIRECTIONS_EDEFAULT == null ? gluePointLeavingDirections != null : !GLUE_POINT_LEAVING_DIRECTIONS_EDEFAULT.equals(gluePointLeavingDirections);
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINTS:
				return GLUE_POINTS_EDEFAULT == null ? gluePoints != null : !GLUE_POINTS_EDEFAULT.equals(gluePoints);
			case DrawingPackage.DOCUMENT_ROOT__GLUE_POINT_TYPE:
				return isSetGluePointType();
			case DrawingPackage.DOCUMENT_ROOT__GRADIENT_STEP_COUNT:
				return GRADIENT_STEP_COUNT_EDEFAULT == null ? gradientStepCount != null : !GRADIENT_STEP_COUNT_EDEFAULT.equals(gradientStepCount);
			case DrawingPackage.DOCUMENT_ROOT__GREEN:
				return GREEN_EDEFAULT == null ? green != null : !GREEN_EDEFAULT.equals(green);
			case DrawingPackage.DOCUMENT_ROOT__GUIDE_DISTANCE:
				return GUIDE_DISTANCE_EDEFAULT == null ? guideDistance != null : !GUIDE_DISTANCE_EDEFAULT.equals(guideDistance);
			case DrawingPackage.DOCUMENT_ROOT__GUIDE_OVERHANG:
				return GUIDE_OVERHANG_EDEFAULT == null ? guideOverhang != null : !GUIDE_OVERHANG_EDEFAULT.equals(guideOverhang);
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_MIRROR_HORIZONTAL:
				return isSetHandleMirrorHorizontal();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_MIRROR_VERTICAL:
				return isSetHandleMirrorVertical();
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_POLAR:
				return HANDLE_POLAR_EDEFAULT == null ? handlePolar != null : !HANDLE_POLAR_EDEFAULT.equals(handlePolar);
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_POSITION:
				return HANDLE_POSITION_EDEFAULT == null ? handlePosition != null : !HANDLE_POSITION_EDEFAULT.equals(handlePosition);
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RADIUS_RANGE_MAXIMUM:
				return HANDLE_RADIUS_RANGE_MAXIMUM_EDEFAULT == null ? handleRadiusRangeMaximum != null : !HANDLE_RADIUS_RANGE_MAXIMUM_EDEFAULT.equals(handleRadiusRangeMaximum);
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RADIUS_RANGE_MINIMUM:
				return HANDLE_RADIUS_RANGE_MINIMUM_EDEFAULT == null ? handleRadiusRangeMinimum != null : !HANDLE_RADIUS_RANGE_MINIMUM_EDEFAULT.equals(handleRadiusRangeMinimum);
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_XMAXIMUM:
				return HANDLE_RANGE_XMAXIMUM_EDEFAULT == null ? handleRangeXMaximum != null : !HANDLE_RANGE_XMAXIMUM_EDEFAULT.equals(handleRangeXMaximum);
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_XMINIMUM:
				return HANDLE_RANGE_XMINIMUM_EDEFAULT == null ? handleRangeXMinimum != null : !HANDLE_RANGE_XMINIMUM_EDEFAULT.equals(handleRangeXMinimum);
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_YMAXIMUM:
				return HANDLE_RANGE_YMAXIMUM_EDEFAULT == null ? handleRangeYMaximum != null : !HANDLE_RANGE_YMAXIMUM_EDEFAULT.equals(handleRangeYMaximum);
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_RANGE_YMINIMUM:
				return HANDLE_RANGE_YMINIMUM_EDEFAULT == null ? handleRangeYMinimum != null : !HANDLE_RANGE_YMINIMUM_EDEFAULT.equals(handleRangeYMinimum);
			case DrawingPackage.DOCUMENT_ROOT__HANDLE_SWITCHED:
				return isSetHandleSwitched();
			case DrawingPackage.DOCUMENT_ROOT__IMAGE_OPACITY:
				return IMAGE_OPACITY_EDEFAULT == null ? imageOpacity != null : !IMAGE_OPACITY_EDEFAULT.equals(imageOpacity);
			case DrawingPackage.DOCUMENT_ROOT__KIND:
				return isSetKind();
			case DrawingPackage.DOCUMENT_ROOT__LAYER1:
				return LAYER1_EDEFAULT == null ? layer1 != null : !LAYER1_EDEFAULT.equals(layer1);
			case DrawingPackage.DOCUMENT_ROOT__LINE_DISTANCE:
				return LINE_DISTANCE_EDEFAULT == null ? lineDistance != null : !LINE_DISTANCE_EDEFAULT.equals(lineDistance);
			case DrawingPackage.DOCUMENT_ROOT__LINE_SKEW:
				return LINE_SKEW_EDEFAULT == null ? lineSkew != null : !LINE_SKEW_EDEFAULT.equals(lineSkew);
			case DrawingPackage.DOCUMENT_ROOT__LUMINANCE:
				return LUMINANCE_EDEFAULT == null ? luminance != null : !LUMINANCE_EDEFAULT.equals(luminance);
			case DrawingPackage.DOCUMENT_ROOT__MARKER_END:
				return MARKER_END_EDEFAULT == null ? markerEnd != null : !MARKER_END_EDEFAULT.equals(markerEnd);
			case DrawingPackage.DOCUMENT_ROOT__MARKER_END_CENTER:
				return isSetMarkerEndCenter();
			case DrawingPackage.DOCUMENT_ROOT__MARKER_END_WIDTH:
				return MARKER_END_WIDTH_EDEFAULT == null ? markerEndWidth != null : !MARKER_END_WIDTH_EDEFAULT.equals(markerEndWidth);
			case DrawingPackage.DOCUMENT_ROOT__MARKER_START:
				return MARKER_START_EDEFAULT == null ? markerStart != null : !MARKER_START_EDEFAULT.equals(markerStart);
			case DrawingPackage.DOCUMENT_ROOT__MARKER_START_CENTER:
				return isSetMarkerStartCenter();
			case DrawingPackage.DOCUMENT_ROOT__MARKER_START_WIDTH:
				return MARKER_START_WIDTH_EDEFAULT == null ? markerStartWidth != null : !MARKER_START_WIDTH_EDEFAULT.equals(markerStartWidth);
			case DrawingPackage.DOCUMENT_ROOT__MASTER_PAGE_NAME:
				return MASTER_PAGE_NAME_EDEFAULT == null ? masterPageName != null : !MASTER_PAGE_NAME_EDEFAULT.equals(masterPageName);
			case DrawingPackage.DOCUMENT_ROOT__MAY_SCRIPT:
				return isSetMayScript();
			case DrawingPackage.DOCUMENT_ROOT__MEASURE_ALIGN:
				return isSetMeasureAlign();
			case DrawingPackage.DOCUMENT_ROOT__MEASURE_VERTICAL_ALIGN:
				return isSetMeasureVerticalAlign();
			case DrawingPackage.DOCUMENT_ROOT__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case DrawingPackage.DOCUMENT_ROOT__MIRROR_HORIZONTAL:
				return isSetMirrorHorizontal();
			case DrawingPackage.DOCUMENT_ROOT__MIRROR_VERTICAL:
				return isSetMirrorVertical();
			case DrawingPackage.DOCUMENT_ROOT__MODIFIERS:
				return MODIFIERS_EDEFAULT == null ? modifiers != null : !MODIFIERS_EDEFAULT.equals(modifiers);
			case DrawingPackage.DOCUMENT_ROOT__NAV_ORDER:
				return NAV_ORDER_EDEFAULT == null ? navOrder != null : !NAV_ORDER_EDEFAULT.equals(navOrder);
			case DrawingPackage.DOCUMENT_ROOT__NOHREF:
				return isSetNohref();
			case DrawingPackage.DOCUMENT_ROOT__NOTIFY_ON_UPDATE_OF_RANGES:
				return NOTIFY_ON_UPDATE_OF_RANGES_EDEFAULT == null ? notifyOnUpdateOfRanges != null : !NOTIFY_ON_UPDATE_OF_RANGES_EDEFAULT.equals(notifyOnUpdateOfRanges);
			case DrawingPackage.DOCUMENT_ROOT__OBJECT1:
				return OBJECT1_EDEFAULT == null ? object1 != null : !OBJECT1_EDEFAULT.equals(object1);
			case DrawingPackage.DOCUMENT_ROOT__OLE_DRAW_ASPECT:
				return OLE_DRAW_ASPECT_EDEFAULT == null ? oleDrawAspect != null : !OLE_DRAW_ASPECT_EDEFAULT.equals(oleDrawAspect);
			case DrawingPackage.DOCUMENT_ROOT__OPACITY1:
				return OPACITY1_EDEFAULT == null ? opacity1 != null : !OPACITY1_EDEFAULT.equals(opacity1);
			case DrawingPackage.DOCUMENT_ROOT__OPACITY_NAME:
				return OPACITY_NAME_EDEFAULT == null ? opacityName != null : !OPACITY_NAME_EDEFAULT.equals(opacityName);
			case DrawingPackage.DOCUMENT_ROOT__PAGE_NUMBER:
				return PAGE_NUMBER_EDEFAULT == null ? pageNumber != null : !PAGE_NUMBER_EDEFAULT.equals(pageNumber);
			case DrawingPackage.DOCUMENT_ROOT__PARALLEL:
				return isSetParallel();
			case DrawingPackage.DOCUMENT_ROOT__PATH_STRETCHPOINT_X:
				return isSetPathStretchpointX();
			case DrawingPackage.DOCUMENT_ROOT__PATH_STRETCHPOINT_Y:
				return isSetPathStretchpointY();
			case DrawingPackage.DOCUMENT_ROOT__PLACING:
				return isSetPlacing();
			case DrawingPackage.DOCUMENT_ROOT__POINTS:
				return POINTS_EDEFAULT == null ? points != null : !POINTS_EDEFAULT.equals(points);
			case DrawingPackage.DOCUMENT_ROOT__PROTECTED:
				return isSetProtected();
			case DrawingPackage.DOCUMENT_ROOT__RECREATE_ON_EDIT:
				return isSetRecreateOnEdit();
			case DrawingPackage.DOCUMENT_ROOT__RED:
				return RED_EDEFAULT == null ? red != null : !RED_EDEFAULT.equals(red);
			case DrawingPackage.DOCUMENT_ROOT__ROTATION:
				return ROTATION_EDEFAULT == null ? rotation != null : !ROTATION_EDEFAULT.equals(rotation);
			case DrawingPackage.DOCUMENT_ROOT__SECONDARY_FILL_COLOR:
				return SECONDARY_FILL_COLOR_EDEFAULT == null ? secondaryFillColor != null : !SECONDARY_FILL_COLOR_EDEFAULT.equals(secondaryFillColor);
			case DrawingPackage.DOCUMENT_ROOT__SHADOW:
				return isSetShadow();
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_COLOR:
				return SHADOW_COLOR_EDEFAULT == null ? shadowColor != null : !SHADOW_COLOR_EDEFAULT.equals(shadowColor);
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_OFFSET_X:
				return SHADOW_OFFSET_X_EDEFAULT == null ? shadowOffsetX != null : !SHADOW_OFFSET_X_EDEFAULT.equals(shadowOffsetX);
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_OFFSET_Y:
				return SHADOW_OFFSET_Y_EDEFAULT == null ? shadowOffsetY != null : !SHADOW_OFFSET_Y_EDEFAULT.equals(shadowOffsetY);
			case DrawingPackage.DOCUMENT_ROOT__SHADOW_OPACITY:
				return SHADOW_OPACITY_EDEFAULT == null ? shadowOpacity != null : !SHADOW_OPACITY_EDEFAULT.equals(shadowOpacity);
			case DrawingPackage.DOCUMENT_ROOT__SHAPE_ID:
				return SHAPE_ID_EDEFAULT == null ? shapeId != null : !SHAPE_ID_EDEFAULT.equals(shapeId);
			case DrawingPackage.DOCUMENT_ROOT__SHARPNESS:
				return SHARPNESS_EDEFAULT == null ? sharpness != null : !SHARPNESS_EDEFAULT.equals(sharpness);
			case DrawingPackage.DOCUMENT_ROOT__SHOW_UNIT:
				return isSetShowUnit();
			case DrawingPackage.DOCUMENT_ROOT__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case DrawingPackage.DOCUMENT_ROOT__START_ANGLE:
				return isSetStartAngle();
			case DrawingPackage.DOCUMENT_ROOT__START_COLOR:
				return START_COLOR_EDEFAULT == null ? startColor != null : !START_COLOR_EDEFAULT.equals(startColor);
			case DrawingPackage.DOCUMENT_ROOT__START_GLUE_POINT:
				return START_GLUE_POINT_EDEFAULT == null ? startGluePoint != null : !START_GLUE_POINT_EDEFAULT.equals(startGluePoint);
			case DrawingPackage.DOCUMENT_ROOT__START_GUIDE:
				return START_GUIDE_EDEFAULT == null ? startGuide != null : !START_GUIDE_EDEFAULT.equals(startGuide);
			case DrawingPackage.DOCUMENT_ROOT__START_INTENSITY:
				return START_INTENSITY_EDEFAULT == null ? startIntensity != null : !START_INTENSITY_EDEFAULT.equals(startIntensity);
			case DrawingPackage.DOCUMENT_ROOT__START_LINE_SPACING_HORIZONTAL:
				return START_LINE_SPACING_HORIZONTAL_EDEFAULT == null ? startLineSpacingHorizontal != null : !START_LINE_SPACING_HORIZONTAL_EDEFAULT.equals(startLineSpacingHorizontal);
			case DrawingPackage.DOCUMENT_ROOT__START_LINE_SPACING_VERTICAL:
				return START_LINE_SPACING_VERTICAL_EDEFAULT == null ? startLineSpacingVertical != null : !START_LINE_SPACING_VERTICAL_EDEFAULT.equals(startLineSpacingVertical);
			case DrawingPackage.DOCUMENT_ROOT__START_SHAPE:
				return START_SHAPE_EDEFAULT == null ? startShape != null : !START_SHAPE_EDEFAULT.equals(startShape);
			case DrawingPackage.DOCUMENT_ROOT__STROKE:
				return isSetStroke();
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH1:
				return STROKE_DASH1_EDEFAULT == null ? strokeDash1 != null : !STROKE_DASH1_EDEFAULT.equals(strokeDash1);
			case DrawingPackage.DOCUMENT_ROOT__STROKE_DASH_NAMES:
				return STROKE_DASH_NAMES_EDEFAULT == null ? strokeDashNames != null : !STROKE_DASH_NAMES_EDEFAULT.equals(strokeDashNames);
			case DrawingPackage.DOCUMENT_ROOT__STROKE_LINEJOIN:
				return isSetStrokeLinejoin();
			case DrawingPackage.DOCUMENT_ROOT__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case DrawingPackage.DOCUMENT_ROOT__SYMBOL_COLOR:
				return SYMBOL_COLOR_EDEFAULT == null ? symbolColor != null : !SYMBOL_COLOR_EDEFAULT.equals(symbolColor);
			case DrawingPackage.DOCUMENT_ROOT__TEXTAREA_HORIZONTAL_ALIGN:
				return isSetTextareaHorizontalAlign();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_AREAS:
				return TEXT_AREAS_EDEFAULT == null ? textAreas != null : !TEXT_AREAS_EDEFAULT.equals(textAreas);
			case DrawingPackage.DOCUMENT_ROOT__TEXTAREA_VERTICAL_ALIGN:
				return isSetTextareaVerticalAlign();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH:
				return isSetTextPath();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_ALLOWED:
				return isSetTextPathAllowed();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_MODE:
				return isSetTextPathMode();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_SAME_LETTER_HEIGHTS:
				return isSetTextPathSameLetterHeights();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_PATH_SCALE:
				return isSetTextPathScale();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_ROTATE_ANGLE:
				return isSetTextRotateAngle();
			case DrawingPackage.DOCUMENT_ROOT__TEXT_STYLE_NAME:
				return TEXT_STYLE_NAME_EDEFAULT == null ? textStyleName != null : !TEXT_STYLE_NAME_EDEFAULT.equals(textStyleName);
			case DrawingPackage.DOCUMENT_ROOT__TILE_REPEAT_OFFSET:
				return TILE_REPEAT_OFFSET_EDEFAULT == null ? tileRepeatOffset != null : !TILE_REPEAT_OFFSET_EDEFAULT.equals(tileRepeatOffset);
			case DrawingPackage.DOCUMENT_ROOT__TRANSFORM:
				return TRANSFORM_EDEFAULT == null ? transform != null : !TRANSFORM_EDEFAULT.equals(transform);
			case DrawingPackage.DOCUMENT_ROOT__UNIT:
				return isSetUnit();
			case DrawingPackage.DOCUMENT_ROOT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_HEIGHT:
				return VISIBLE_AREA_HEIGHT_EDEFAULT == null ? visibleAreaHeight != null : !VISIBLE_AREA_HEIGHT_EDEFAULT.equals(visibleAreaHeight);
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_LEFT:
				return VISIBLE_AREA_LEFT_EDEFAULT == null ? visibleAreaLeft != null : !VISIBLE_AREA_LEFT_EDEFAULT.equals(visibleAreaLeft);
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_TOP:
				return VISIBLE_AREA_TOP_EDEFAULT == null ? visibleAreaTop != null : !VISIBLE_AREA_TOP_EDEFAULT.equals(visibleAreaTop);
			case DrawingPackage.DOCUMENT_ROOT__VISIBLE_AREA_WIDTH:
				return VISIBLE_AREA_WIDTH_EDEFAULT == null ? visibleAreaWidth != null : !VISIBLE_AREA_WIDTH_EDEFAULT.equals(visibleAreaWidth);
			case DrawingPackage.DOCUMENT_ROOT__WRAP_INFLUENCE_ON_POSITION:
				return isSetWrapInfluenceOnPosition();
			case DrawingPackage.DOCUMENT_ROOT__ZINDEX:
				return ZINDEX_EDEFAULT == null ? zIndex != null : !ZINDEX_EDEFAULT.equals(zIndex);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", align: ");
		if (alignESet) result.append(align); else result.append("<unset>");
		result.append(", angle: ");
		result.append(angle);
		result.append(", archive: ");
		result.append(archive);
		result.append(", autoGrowHeight: ");
		if (autoGrowHeightESet) result.append(autoGrowHeight); else result.append("<unset>");
		result.append(", autoGrowWidth: ");
		if (autoGrowWidthESet) result.append(autoGrowWidth); else result.append("<unset>");
		result.append(", backgroundSize: ");
		if (backgroundSizeESet) result.append(backgroundSize); else result.append("<unset>");
		result.append(", blue: ");
		result.append(blue);
		result.append(", border: ");
		result.append(border);
		result.append(", captionAngle: ");
		result.append(captionAngle);
		result.append(", captionAngleType: ");
		if (captionAngleTypeESet) result.append(captionAngleType); else result.append("<unset>");
		result.append(", captionEscape: ");
		result.append(captionEscape);
		result.append(", captionEscapeDirection: ");
		if (captionEscapeDirectionESet) result.append(captionEscapeDirection); else result.append("<unset>");
		result.append(", captionFitLineLength: ");
		if (captionFitLineLengthESet) result.append(captionFitLineLength); else result.append("<unset>");
		result.append(", captionGap: ");
		result.append(captionGap);
		result.append(", captionId: ");
		result.append(captionId);
		result.append(", captionLineLength: ");
		result.append(captionLineLength);
		result.append(", captionPointX: ");
		result.append(captionPointX);
		result.append(", captionPointY: ");
		result.append(captionPointY);
		result.append(", captionType: ");
		if (captionTypeESet) result.append(captionType); else result.append("<unset>");
		result.append(", chainNextName: ");
		result.append(chainNextName);
		result.append(", classId: ");
		result.append(classId);
		result.append(", classNames: ");
		result.append(classNames);
		result.append(", code: ");
		result.append(code);
		result.append(", color: ");
		result.append(color);
		result.append(", colorInversion: ");
		if (colorInversionESet) result.append(colorInversion); else result.append("<unset>");
		result.append(", colorMode: ");
		if (colorModeESet) result.append(colorMode); else result.append("<unset>");
		result.append(", concave: ");
		if (concaveESet) result.append(concave); else result.append("<unset>");
		result.append(", concentricGradientFillAllowed: ");
		if (concentricGradientFillAllowedESet) result.append(concentricGradientFillAllowed); else result.append("<unset>");
		result.append(", contrast: ");
		result.append(contrast);
		result.append(", control1: ");
		result.append(control1);
		result.append(", copyOf: ");
		result.append(copyOf);
		result.append(", cornerRadius: ");
		result.append(cornerRadius);
		result.append(", corners: ");
		result.append(corners);
		result.append(", cx: ");
		result.append(cx);
		result.append(", cy: ");
		result.append(cy);
		result.append(", data: ");
		result.append(data);
		result.append(", decimalPlaces: ");
		result.append(decimalPlaces);
		result.append(", display: ");
		if (displayESet) result.append(display); else result.append("<unset>");
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", distance: ");
		result.append(distance);
		result.append(", dots1: ");
		result.append(dots1);
		result.append(", dots1Length: ");
		result.append(dots1Length);
		result.append(", dots2: ");
		result.append(dots2);
		result.append(", dots2Length: ");
		result.append(dots2Length);
		result.append(", end: ");
		result.append(end);
		result.append(", endAngle: ");
		if (endAngleESet) result.append(endAngle); else result.append("<unset>");
		result.append(", endColor: ");
		result.append(endColor);
		result.append(", endGluePoint: ");
		result.append(endGluePoint);
		result.append(", endGuide: ");
		result.append(endGuide);
		result.append(", endIntensity: ");
		result.append(endIntensity);
		result.append(", endLineSpacingHorizontal: ");
		result.append(endLineSpacingHorizontal);
		result.append(", endLineSpacingVertical: ");
		result.append(endLineSpacingVertical);
		result.append(", endShape: ");
		result.append(endShape);
		result.append(", engine: ");
		result.append(engine);
		result.append(", enhancedPath: ");
		result.append(enhancedPath);
		result.append(", escapeDirection: ");
		if (escapeDirectionESet) result.append(escapeDirection); else result.append("<unset>");
		result.append(", extrusion: ");
		if (extrusionESet) result.append(extrusion); else result.append("<unset>");
		result.append(", extrusionAllowed: ");
		if (extrusionAllowedESet) result.append(extrusionAllowed); else result.append("<unset>");
		result.append(", extrusionBrightness: ");
		result.append(extrusionBrightness);
		result.append(", extrusionColor: ");
		if (extrusionColorESet) result.append(extrusionColor); else result.append("<unset>");
		result.append(", extrusionDepth: ");
		result.append(extrusionDepth);
		result.append(", extrusionDiffusion: ");
		result.append(extrusionDiffusion);
		result.append(", extrusionFirstLightDirection: ");
		result.append(extrusionFirstLightDirection);
		result.append(", extrusionFirstLightHarsh: ");
		if (extrusionFirstLightHarshESet) result.append(extrusionFirstLightHarsh); else result.append("<unset>");
		result.append(", extrusionFirstLightLevel: ");
		result.append(extrusionFirstLightLevel);
		result.append(", extrusionLightFace: ");
		if (extrusionLightFaceESet) result.append(extrusionLightFace); else result.append("<unset>");
		result.append(", extrusionMetal: ");
		if (extrusionMetalESet) result.append(extrusionMetal); else result.append("<unset>");
		result.append(", extrusionNumberOfLineSegments: ");
		result.append(extrusionNumberOfLineSegments);
		result.append(", extrusionOrigin: ");
		result.append(extrusionOrigin);
		result.append(", extrusionRotationAngle: ");
		result.append(extrusionRotationAngle);
		result.append(", extrusionRotationCenter: ");
		result.append(extrusionRotationCenter);
		result.append(", extrusionSecondLightDirection: ");
		result.append(extrusionSecondLightDirection);
		result.append(", extrusionSecondLightHarsh: ");
		if (extrusionSecondLightHarshESet) result.append(extrusionSecondLightHarsh); else result.append("<unset>");
		result.append(", extrusionSecondLightLevel: ");
		result.append(extrusionSecondLightLevel);
		result.append(", extrusionShininess: ");
		result.append(extrusionShininess);
		result.append(", extrusionSkew: ");
		result.append(extrusionSkew);
		result.append(", extrusionSpecularity: ");
		result.append(extrusionSpecularity);
		result.append(", extrusionViewpoint: ");
		result.append(extrusionViewpoint);
		result.append(", fill: ");
		if (fillESet) result.append(fill); else result.append("<unset>");
		result.append(", fillColor: ");
		result.append(fillColor);
		result.append(", fillGradientName: ");
		result.append(fillGradientName);
		result.append(", fillHatchName: ");
		result.append(fillHatchName);
		result.append(", fillHatchSolid: ");
		if (fillHatchSolidESet) result.append(fillHatchSolid); else result.append("<unset>");
		result.append(", fillImageHeight: ");
		result.append(fillImageHeight);
		result.append(", fillImageName: ");
		result.append(fillImageName);
		result.append(", fillImageRefPoint: ");
		if (fillImageRefPointESet) result.append(fillImageRefPoint); else result.append("<unset>");
		result.append(", fillImageRefPointX: ");
		result.append(fillImageRefPointX);
		result.append(", fillImageRefPointY: ");
		result.append(fillImageRefPointY);
		result.append(", fillImageWidth: ");
		result.append(fillImageWidth);
		result.append(", filterName: ");
		result.append(filterName);
		result.append(", fitToContour: ");
		if (fitToContourESet) result.append(fitToContour); else result.append("<unset>");
		result.append(", fitToSize: ");
		if (fitToSizeESet) result.append(fitToSize); else result.append("<unset>");
		result.append(", formula: ");
		result.append(formula);
		result.append(", frameDisplayBorder: ");
		if (frameDisplayBorderESet) result.append(frameDisplayBorder); else result.append("<unset>");
		result.append(", frameDisplayScrollbar: ");
		if (frameDisplayScrollbarESet) result.append(frameDisplayScrollbar); else result.append("<unset>");
		result.append(", frameMarginHorizontal: ");
		result.append(frameMarginHorizontal);
		result.append(", frameMarginVertical: ");
		result.append(frameMarginVertical);
		result.append(", frameName: ");
		result.append(frameName);
		result.append(", gamma: ");
		result.append(gamma);
		result.append(", gluePointLeavingDirections: ");
		result.append(gluePointLeavingDirections);
		result.append(", gluePoints: ");
		result.append(gluePoints);
		result.append(", gluePointType: ");
		if (gluePointTypeESet) result.append(gluePointType); else result.append("<unset>");
		result.append(", gradientStepCount: ");
		result.append(gradientStepCount);
		result.append(", green: ");
		result.append(green);
		result.append(", guideDistance: ");
		result.append(guideDistance);
		result.append(", guideOverhang: ");
		result.append(guideOverhang);
		result.append(", handleMirrorHorizontal: ");
		if (handleMirrorHorizontalESet) result.append(handleMirrorHorizontal); else result.append("<unset>");
		result.append(", handleMirrorVertical: ");
		if (handleMirrorVerticalESet) result.append(handleMirrorVertical); else result.append("<unset>");
		result.append(", handlePolar: ");
		result.append(handlePolar);
		result.append(", handlePosition: ");
		result.append(handlePosition);
		result.append(", handleRadiusRangeMaximum: ");
		result.append(handleRadiusRangeMaximum);
		result.append(", handleRadiusRangeMinimum: ");
		result.append(handleRadiusRangeMinimum);
		result.append(", handleRangeXMaximum: ");
		result.append(handleRangeXMaximum);
		result.append(", handleRangeXMinimum: ");
		result.append(handleRangeXMinimum);
		result.append(", handleRangeYMaximum: ");
		result.append(handleRangeYMaximum);
		result.append(", handleRangeYMinimum: ");
		result.append(handleRangeYMinimum);
		result.append(", handleSwitched: ");
		if (handleSwitchedESet) result.append(handleSwitched); else result.append("<unset>");
		result.append(", imageOpacity: ");
		result.append(imageOpacity);
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", layer1: ");
		result.append(layer1);
		result.append(", lineDistance: ");
		result.append(lineDistance);
		result.append(", lineSkew: ");
		result.append(lineSkew);
		result.append(", luminance: ");
		result.append(luminance);
		result.append(", markerEnd: ");
		result.append(markerEnd);
		result.append(", markerEndCenter: ");
		if (markerEndCenterESet) result.append(markerEndCenter); else result.append("<unset>");
		result.append(", markerEndWidth: ");
		result.append(markerEndWidth);
		result.append(", markerStart: ");
		result.append(markerStart);
		result.append(", markerStartCenter: ");
		if (markerStartCenterESet) result.append(markerStartCenter); else result.append("<unset>");
		result.append(", markerStartWidth: ");
		result.append(markerStartWidth);
		result.append(", masterPageName: ");
		result.append(masterPageName);
		result.append(", mayScript: ");
		if (mayScriptESet) result.append(mayScript); else result.append("<unset>");
		result.append(", measureAlign: ");
		if (measureAlignESet) result.append(measureAlign); else result.append("<unset>");
		result.append(", measureVerticalAlign: ");
		if (measureVerticalAlignESet) result.append(measureVerticalAlign); else result.append("<unset>");
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(", mirrorHorizontal: ");
		if (mirrorHorizontalESet) result.append(mirrorHorizontal); else result.append("<unset>");
		result.append(", mirrorVertical: ");
		if (mirrorVerticalESet) result.append(mirrorVertical); else result.append("<unset>");
		result.append(", modifiers: ");
		result.append(modifiers);
		result.append(", navOrder: ");
		result.append(navOrder);
		result.append(", nohref: ");
		if (nohrefESet) result.append(nohref); else result.append("<unset>");
		result.append(", notifyOnUpdateOfRanges: ");
		result.append(notifyOnUpdateOfRanges);
		result.append(", object1: ");
		result.append(object1);
		result.append(", oleDrawAspect: ");
		result.append(oleDrawAspect);
		result.append(", opacity1: ");
		result.append(opacity1);
		result.append(", opacityName: ");
		result.append(opacityName);
		result.append(", pageNumber: ");
		result.append(pageNumber);
		result.append(", parallel: ");
		if (parallelESet) result.append(parallel); else result.append("<unset>");
		result.append(", pathStretchpointX: ");
		if (pathStretchpointXESet) result.append(pathStretchpointX); else result.append("<unset>");
		result.append(", pathStretchpointY: ");
		if (pathStretchpointYESet) result.append(pathStretchpointY); else result.append("<unset>");
		result.append(", placing: ");
		if (placingESet) result.append(placing); else result.append("<unset>");
		result.append(", points: ");
		result.append(points);
		result.append(", protected: ");
		if (protectedESet) result.append(protected_); else result.append("<unset>");
		result.append(", recreateOnEdit: ");
		if (recreateOnEditESet) result.append(recreateOnEdit); else result.append("<unset>");
		result.append(", red: ");
		result.append(red);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", secondaryFillColor: ");
		result.append(secondaryFillColor);
		result.append(", shadow: ");
		if (shadowESet) result.append(shadow); else result.append("<unset>");
		result.append(", shadowColor: ");
		result.append(shadowColor);
		result.append(", shadowOffsetX: ");
		result.append(shadowOffsetX);
		result.append(", shadowOffsetY: ");
		result.append(shadowOffsetY);
		result.append(", shadowOpacity: ");
		result.append(shadowOpacity);
		result.append(", shapeId: ");
		result.append(shapeId);
		result.append(", sharpness: ");
		result.append(sharpness);
		result.append(", showUnit: ");
		if (showUnitESet) result.append(showUnit); else result.append("<unset>");
		result.append(", start: ");
		result.append(start);
		result.append(", startAngle: ");
		if (startAngleESet) result.append(startAngle); else result.append("<unset>");
		result.append(", startColor: ");
		result.append(startColor);
		result.append(", startGluePoint: ");
		result.append(startGluePoint);
		result.append(", startGuide: ");
		result.append(startGuide);
		result.append(", startIntensity: ");
		result.append(startIntensity);
		result.append(", startLineSpacingHorizontal: ");
		result.append(startLineSpacingHorizontal);
		result.append(", startLineSpacingVertical: ");
		result.append(startLineSpacingVertical);
		result.append(", startShape: ");
		result.append(startShape);
		result.append(", stroke: ");
		if (strokeESet) result.append(stroke); else result.append("<unset>");
		result.append(", strokeDash1: ");
		result.append(strokeDash1);
		result.append(", strokeDashNames: ");
		result.append(strokeDashNames);
		result.append(", strokeLinejoin: ");
		if (strokeLinejoinESet) result.append(strokeLinejoin); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", symbolColor: ");
		result.append(symbolColor);
		result.append(", textareaHorizontalAlign: ");
		if (textareaHorizontalAlignESet) result.append(textareaHorizontalAlign); else result.append("<unset>");
		result.append(", textAreas: ");
		result.append(textAreas);
		result.append(", textareaVerticalAlign: ");
		if (textareaVerticalAlignESet) result.append(textareaVerticalAlign); else result.append("<unset>");
		result.append(", textPath: ");
		if (textPathESet) result.append(textPath); else result.append("<unset>");
		result.append(", textPathAllowed: ");
		if (textPathAllowedESet) result.append(textPathAllowed); else result.append("<unset>");
		result.append(", textPathMode: ");
		if (textPathModeESet) result.append(textPathMode); else result.append("<unset>");
		result.append(", textPathSameLetterHeights: ");
		if (textPathSameLetterHeightsESet) result.append(textPathSameLetterHeights); else result.append("<unset>");
		result.append(", textPathScale: ");
		if (textPathScaleESet) result.append(textPathScale); else result.append("<unset>");
		result.append(", textRotateAngle: ");
		if (textRotateAngleESet) result.append(textRotateAngle); else result.append("<unset>");
		result.append(", textStyleName: ");
		result.append(textStyleName);
		result.append(", tileRepeatOffset: ");
		result.append(tileRepeatOffset);
		result.append(", transform: ");
		result.append(transform);
		result.append(", unit: ");
		if (unitESet) result.append(unit); else result.append("<unset>");
		result.append(", value: ");
		result.append(value);
		result.append(", visibleAreaHeight: ");
		result.append(visibleAreaHeight);
		result.append(", visibleAreaLeft: ");
		result.append(visibleAreaLeft);
		result.append(", visibleAreaTop: ");
		result.append(visibleAreaTop);
		result.append(", visibleAreaWidth: ");
		result.append(visibleAreaWidth);
		result.append(", wrapInfluenceOnPosition: ");
		if (wrapInfluenceOnPositionESet) result.append(wrapInfluenceOnPosition); else result.append("<unset>");
		result.append(", zIndex: ");
		result.append(zIndex);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
