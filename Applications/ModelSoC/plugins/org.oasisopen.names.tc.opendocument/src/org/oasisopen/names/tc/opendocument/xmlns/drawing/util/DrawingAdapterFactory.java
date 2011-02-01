/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage
 * @generated
 */
public class DrawingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DrawingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DrawingPackage.eINSTANCE;
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
	protected DrawingSwitch<Adapter> modelSwitch =
		new DrawingSwitch<Adapter>() {
			@Override
			public Adapter caseAppletType(AppletType object) {
				return createAppletTypeAdapter();
			}
			@Override
			public Adapter caseAreaCircleType(AreaCircleType object) {
				return createAreaCircleTypeAdapter();
			}
			@Override
			public Adapter caseAreaPolygonType(AreaPolygonType object) {
				return createAreaPolygonTypeAdapter();
			}
			@Override
			public Adapter caseAreaRectangleType(AreaRectangleType object) {
				return createAreaRectangleTypeAdapter();
			}
			@Override
			public Adapter caseAType(AType object) {
				return createATypeAdapter();
			}
			@Override
			public Adapter caseCaptionType(CaptionType object) {
				return createCaptionTypeAdapter();
			}
			@Override
			public Adapter caseCircleType(CircleType object) {
				return createCircleTypeAdapter();
			}
			@Override
			public Adapter caseConnectorType(ConnectorType object) {
				return createConnectorTypeAdapter();
			}
			@Override
			public Adapter caseContourPathType(ContourPathType object) {
				return createContourPathTypeAdapter();
			}
			@Override
			public Adapter caseContourPolygonType(ContourPolygonType object) {
				return createContourPolygonTypeAdapter();
			}
			@Override
			public Adapter caseControlType(ControlType object) {
				return createControlTypeAdapter();
			}
			@Override
			public Adapter caseCustomShapeType(CustomShapeType object) {
				return createCustomShapeTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEllipseType(EllipseType object) {
				return createEllipseTypeAdapter();
			}
			@Override
			public Adapter caseEnhancedGeometryType(EnhancedGeometryType object) {
				return createEnhancedGeometryTypeAdapter();
			}
			@Override
			public Adapter caseEquationType(EquationType object) {
				return createEquationTypeAdapter();
			}
			@Override
			public Adapter caseFillImageType(FillImageType object) {
				return createFillImageTypeAdapter();
			}
			@Override
			public Adapter caseFloatingFrameType(FloatingFrameType object) {
				return createFloatingFrameTypeAdapter();
			}
			@Override
			public Adapter caseFrameType(FrameType object) {
				return createFrameTypeAdapter();
			}
			@Override
			public Adapter caseGluePointType(GluePointType object) {
				return createGluePointTypeAdapter();
			}
			@Override
			public Adapter caseGradientType(GradientType object) {
				return createGradientTypeAdapter();
			}
			@Override
			public Adapter caseGType(GType object) {
				return createGTypeAdapter();
			}
			@Override
			public Adapter caseHandleType(HandleType object) {
				return createHandleTypeAdapter();
			}
			@Override
			public Adapter caseHatchType(HatchType object) {
				return createHatchTypeAdapter();
			}
			@Override
			public Adapter caseImageMapType(ImageMapType object) {
				return createImageMapTypeAdapter();
			}
			@Override
			public Adapter caseImageType(ImageType object) {
				return createImageTypeAdapter();
			}
			@Override
			public Adapter caseLayerSetType(LayerSetType object) {
				return createLayerSetTypeAdapter();
			}
			@Override
			public Adapter caseLayerType(LayerType object) {
				return createLayerTypeAdapter();
			}
			@Override
			public Adapter caseLineType(LineType object) {
				return createLineTypeAdapter();
			}
			@Override
			public Adapter caseMarkerType(MarkerType object) {
				return createMarkerTypeAdapter();
			}
			@Override
			public Adapter caseMeasureType(MeasureType object) {
				return createMeasureTypeAdapter();
			}
			@Override
			public Adapter caseObjectOleType(ObjectOleType object) {
				return createObjectOleTypeAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter caseOpacityType(OpacityType object) {
				return createOpacityTypeAdapter();
			}
			@Override
			public Adapter casePageThumbnailType(PageThumbnailType object) {
				return createPageThumbnailTypeAdapter();
			}
			@Override
			public Adapter casePageType(PageType object) {
				return createPageTypeAdapter();
			}
			@Override
			public Adapter caseParamType(ParamType object) {
				return createParamTypeAdapter();
			}
			@Override
			public Adapter casePathType(PathType object) {
				return createPathTypeAdapter();
			}
			@Override
			public Adapter casePluginType(PluginType object) {
				return createPluginTypeAdapter();
			}
			@Override
			public Adapter casePolygonType(PolygonType object) {
				return createPolygonTypeAdapter();
			}
			@Override
			public Adapter casePolylineType(PolylineType object) {
				return createPolylineTypeAdapter();
			}
			@Override
			public Adapter caseRectType(RectType object) {
				return createRectTypeAdapter();
			}
			@Override
			public Adapter caseRegularPolygonType(RegularPolygonType object) {
				return createRegularPolygonTypeAdapter();
			}
			@Override
			public Adapter caseStrokeDashType1(StrokeDashType1 object) {
				return createStrokeDashType1Adapter();
			}
			@Override
			public Adapter caseTextBoxType(TextBoxType object) {
				return createTextBoxTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType <em>Applet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType
	 * @generated
	 */
	public Adapter createAppletTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType <em>Area Circle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType
	 * @generated
	 */
	public Adapter createAreaCircleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType <em>Area Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType
	 * @generated
	 */
	public Adapter createAreaPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType <em>Area Rectangle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType
	 * @generated
	 */
	public Adapter createAreaRectangleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AType <em>AType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.AType
	 * @generated
	 */
	public Adapter createATypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType <em>Caption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType
	 * @generated
	 */
	public Adapter createCaptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType <em>Circle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType
	 * @generated
	 */
	public Adapter createCircleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType
	 * @generated
	 */
	public Adapter createConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType <em>Contour Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType
	 * @generated
	 */
	public Adapter createContourPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType <em>Contour Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPolygonType
	 * @generated
	 */
	public Adapter createContourPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType
	 * @generated
	 */
	public Adapter createControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType <em>Custom Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType
	 * @generated
	 */
	public Adapter createCustomShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType <em>Ellipse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType
	 * @generated
	 */
	public Adapter createEllipseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType <em>Enhanced Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType
	 * @generated
	 */
	public Adapter createEnhancedGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EquationType <em>Equation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.EquationType
	 * @generated
	 */
	public Adapter createEquationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType <em>Fill Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType
	 * @generated
	 */
	public Adapter createFillImageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType <em>Floating Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FloatingFrameType
	 * @generated
	 */
	public Adapter createFloatingFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType <em>Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType
	 * @generated
	 */
	public Adapter createFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType <em>Glue Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType
	 * @generated
	 */
	public Adapter createGluePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType <em>Gradient Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType
	 * @generated
	 */
	public Adapter createGradientTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType <em>GType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GType
	 * @generated
	 */
	public Adapter createGTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType <em>Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType
	 * @generated
	 */
	public Adapter createHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType <em>Hatch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType
	 * @generated
	 */
	public Adapter createHatchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType <em>Image Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType
	 * @generated
	 */
	public Adapter createImageMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType <em>Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType
	 * @generated
	 */
	public Adapter createImageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerSetType <em>Layer Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerSetType
	 * @generated
	 */
	public Adapter createLayerSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType <em>Layer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerType
	 * @generated
	 */
	public Adapter createLayerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType
	 * @generated
	 */
	public Adapter createLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType <em>Marker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType
	 * @generated
	 */
	public Adapter createMarkerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType
	 * @generated
	 */
	public Adapter createMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType <em>Object Ole Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectOleType
	 * @generated
	 */
	public Adapter createObjectOleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType <em>Opacity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType
	 * @generated
	 */
	public Adapter createOpacityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType <em>Page Thumbnail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType
	 * @generated
	 */
	public Adapter createPageThumbnailTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType <em>Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType
	 * @generated
	 */
	public Adapter createPageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.ParamType
	 * @generated
	 */
	public Adapter createParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType <em>Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType
	 * @generated
	 */
	public Adapter createPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType <em>Plugin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PluginType
	 * @generated
	 */
	public Adapter createPluginTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType
	 * @generated
	 */
	public Adapter createPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType <em>Polyline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType
	 * @generated
	 */
	public Adapter createPolylineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType <em>Rect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType
	 * @generated
	 */
	public Adapter createRectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType <em>Regular Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType
	 * @generated
	 */
	public Adapter createRegularPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1 <em>Stroke Dash Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1
	 * @generated
	 */
	public Adapter createStrokeDashType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType <em>Text Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextBoxType
	 * @generated
	 */
	public Adapter createTextBoxTypeAdapter() {
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

} //DrawingAdapterFactory
