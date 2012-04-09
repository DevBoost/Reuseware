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
package org.oasisopen.names.tc.opendocument.xmlns.drawing.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EquationType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerSetType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ParamType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage
 * @generated
 */
public class DrawingSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DrawingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawingSwitch() {
		if (modelPackage == null) {
			modelPackage = DrawingPackage.eINSTANCE;
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
			case DrawingPackage.APPLET_TYPE: {
				AppletType appletType = (AppletType)theEObject;
				T result = caseAppletType(appletType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.AREA_CIRCLE_TYPE: {
				AreaCircleType areaCircleType = (AreaCircleType)theEObject;
				T result = caseAreaCircleType(areaCircleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.AREA_POLYGON_TYPE: {
				AreaPolygonType areaPolygonType = (AreaPolygonType)theEObject;
				T result = caseAreaPolygonType(areaPolygonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.AREA_RECTANGLE_TYPE: {
				AreaRectangleType areaRectangleType = (AreaRectangleType)theEObject;
				T result = caseAreaRectangleType(areaRectangleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.ATYPE: {
				AType aType = (AType)theEObject;
				T result = caseAType(aType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.CAPTION_TYPE: {
				CaptionType captionType = (CaptionType)theEObject;
				T result = caseCaptionType(captionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.CIRCLE_TYPE: {
				CircleType circleType = (CircleType)theEObject;
				T result = caseCircleType(circleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.CONNECTOR_TYPE: {
				ConnectorType connectorType = (ConnectorType)theEObject;
				T result = caseConnectorType(connectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.CONTOUR_PATH_TYPE: {
				ContourPathType contourPathType = (ContourPathType)theEObject;
				T result = caseContourPathType(contourPathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.CONTOUR_POLYGON_TYPE: {
				ContourPolygonType contourPolygonType = (ContourPolygonType)theEObject;
				T result = caseContourPolygonType(contourPolygonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.CONTROL_TYPE: {
				ControlType controlType = (ControlType)theEObject;
				T result = caseControlType(controlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.CUSTOM_SHAPE_TYPE: {
				CustomShapeType customShapeType = (CustomShapeType)theEObject;
				T result = caseCustomShapeType(customShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.ELLIPSE_TYPE: {
				EllipseType ellipseType = (EllipseType)theEObject;
				T result = caseEllipseType(ellipseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.ENHANCED_GEOMETRY_TYPE: {
				EnhancedGeometryType enhancedGeometryType = (EnhancedGeometryType)theEObject;
				T result = caseEnhancedGeometryType(enhancedGeometryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.EQUATION_TYPE: {
				EquationType equationType = (EquationType)theEObject;
				T result = caseEquationType(equationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.FILL_IMAGE_TYPE: {
				FillImageType fillImageType = (FillImageType)theEObject;
				T result = caseFillImageType(fillImageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.FLOATING_FRAME_TYPE: {
				FloatingFrameType floatingFrameType = (FloatingFrameType)theEObject;
				T result = caseFloatingFrameType(floatingFrameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.FRAME_TYPE: {
				FrameType frameType = (FrameType)theEObject;
				T result = caseFrameType(frameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.GLUE_POINT_TYPE: {
				GluePointType gluePointType = (GluePointType)theEObject;
				T result = caseGluePointType(gluePointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.GRADIENT_TYPE: {
				GradientType gradientType = (GradientType)theEObject;
				T result = caseGradientType(gradientType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.GTYPE: {
				GType gType = (GType)theEObject;
				T result = caseGType(gType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.HANDLE_TYPE: {
				HandleType handleType = (HandleType)theEObject;
				T result = caseHandleType(handleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.HATCH_TYPE: {
				HatchType hatchType = (HatchType)theEObject;
				T result = caseHatchType(hatchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.IMAGE_MAP_TYPE: {
				ImageMapType imageMapType = (ImageMapType)theEObject;
				T result = caseImageMapType(imageMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.IMAGE_TYPE: {
				ImageType imageType = (ImageType)theEObject;
				T result = caseImageType(imageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.LAYER_SET_TYPE: {
				LayerSetType layerSetType = (LayerSetType)theEObject;
				T result = caseLayerSetType(layerSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.LAYER_TYPE: {
				LayerType layerType = (LayerType)theEObject;
				T result = caseLayerType(layerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.LINE_TYPE: {
				LineType lineType = (LineType)theEObject;
				T result = caseLineType(lineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.MARKER_TYPE: {
				MarkerType markerType = (MarkerType)theEObject;
				T result = caseMarkerType(markerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.MEASURE_TYPE: {
				MeasureType measureType = (MeasureType)theEObject;
				T result = caseMeasureType(measureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.OBJECT_OLE_TYPE: {
				ObjectOleType objectOleType = (ObjectOleType)theEObject;
				T result = caseObjectOleType(objectOleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.OBJECT_TYPE: {
				ObjectType objectType = (ObjectType)theEObject;
				T result = caseObjectType(objectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.OPACITY_TYPE: {
				OpacityType opacityType = (OpacityType)theEObject;
				T result = caseOpacityType(opacityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.PAGE_THUMBNAIL_TYPE: {
				PageThumbnailType pageThumbnailType = (PageThumbnailType)theEObject;
				T result = casePageThumbnailType(pageThumbnailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.PAGE_TYPE: {
				PageType pageType = (PageType)theEObject;
				T result = casePageType(pageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.PARAM_TYPE: {
				ParamType paramType = (ParamType)theEObject;
				T result = caseParamType(paramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.PATH_TYPE: {
				PathType pathType = (PathType)theEObject;
				T result = casePathType(pathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.PLUGIN_TYPE: {
				PluginType pluginType = (PluginType)theEObject;
				T result = casePluginType(pluginType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.POLYGON_TYPE: {
				PolygonType polygonType = (PolygonType)theEObject;
				T result = casePolygonType(polygonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.POLYLINE_TYPE: {
				PolylineType polylineType = (PolylineType)theEObject;
				T result = casePolylineType(polylineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.RECT_TYPE: {
				RectType rectType = (RectType)theEObject;
				T result = caseRectType(rectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.REGULAR_POLYGON_TYPE: {
				RegularPolygonType regularPolygonType = (RegularPolygonType)theEObject;
				T result = caseRegularPolygonType(regularPolygonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.STROKE_DASH_TYPE1: {
				StrokeDashType1 strokeDashType1 = (StrokeDashType1)theEObject;
				T result = caseStrokeDashType1(strokeDashType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DrawingPackage.TEXT_BOX_TYPE: {
				TextBoxType textBoxType = (TextBoxType)theEObject;
				T result = caseTextBoxType(textBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Applet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Applet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppletType(AppletType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Circle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Circle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaCircleType(AreaCircleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Polygon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaPolygonType(AreaPolygonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Rectangle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Rectangle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaRectangleType(AreaRectangleType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Caption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaptionType(CaptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircleType(CircleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorType(ConnectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contour Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contour Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContourPathType(ContourPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contour Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contour Polygon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContourPolygonType(ContourPolygonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlType(ControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomShapeType(CustomShapeType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipseType(EllipseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enhanced Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enhanced Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnhancedGeometryType(EnhancedGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquationType(EquationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fill Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fill Image Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFillImageType(FillImageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floating Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floating Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatingFrameType(FloatingFrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameType(FrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glue Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glue Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGluePointType(GluePointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradient Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradient Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGradientType(GradientType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGType(GType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandleType(HandleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hatch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hatch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHatchType(HatchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageMapType(ImageMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageType(ImageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerSetType(LayerSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerType(LayerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineType(LineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marker Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marker Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkerType(MarkerType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Object Ole Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Ole Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectOleType(ObjectOleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectType(ObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opacity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opacity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpacityType(OpacityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Thumbnail Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Thumbnail Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageThumbnailType(PageThumbnailType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamType(ParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathType(PathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePluginType(PluginType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonType(PolygonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolylineType(PolylineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rect Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rect Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectType(RectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Polygon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularPolygonType(RegularPolygonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke Dash Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke Dash Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrokeDashType1(StrokeDashType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextBoxType(TextBoxType object) {
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

} //DrawingSwitch
