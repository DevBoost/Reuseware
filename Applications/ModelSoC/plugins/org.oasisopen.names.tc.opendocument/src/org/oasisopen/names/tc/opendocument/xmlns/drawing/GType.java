/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType;
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEventListeners <em>Event Listeners</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getGluePoint <em>Glue Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getShape <em>Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getAnchorPageNumber <em>Anchor Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getAnchorType <em>Anchor Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCaptionId <em>Caption Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getClassNames1 <em>Class Names1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEndCellAddress <em>End Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEndX <em>End X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEndY <em>End Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getStyleName1 <em>Style Name1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getTableBackground <em>Table Background</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getY <em>Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getZIndex <em>ZIndex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType()
 * @model extendedMetaData="name='g_._type' kind='elementOnly'"
 * @generated
 */
public interface GType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='title' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='desc' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Event Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Listeners</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Listeners</em>' containment reference.
	 * @see #setEventListeners(EventListenersType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_EventListeners()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event-listeners' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	EventListenersType getEventListeners();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEventListeners <em>Event Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Listeners</em>' containment reference.
	 * @see #getEventListeners()
	 * @generated
	 */
	void setEventListeners(EventListenersType value);

	/**
	 * Returns the value of the '<em><b>Glue Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue Point</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_GluePoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='glue-point' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GluePointType> getGluePoint();

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Shape()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Shape:4'"
	 * @generated
	 */
	FeatureMap getShape();

	/**
	 * Returns the value of the '<em><b>Rect</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rect</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Rect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rect' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<RectType> getRect();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Line()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='line' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<LineType> getLine();

	/**
	 * Returns the value of the '<em><b>Polyline</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polyline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polyline</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Polyline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polyline' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<PolylineType> getPolyline();

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Polygon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polygon' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<PolygonType> getPolygon();

	/**
	 * Returns the value of the '<em><b>Regular Polygon</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Polygon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Polygon</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_RegularPolygon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='regular-polygon' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<RegularPolygonType> getRegularPolygon();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Path()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<PathType> getPath();

	/**
	 * Returns the value of the '<em><b>Circle</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circle</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Circle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='circle' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<CircleType> getCircle();

	/**
	 * Returns the value of the '<em><b>Ellipse</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ellipse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Ellipse()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipse' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<EllipseType> getEllipse();

	/**
	 * Returns the value of the '<em><b>G</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_G()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='g' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<GType> getG();

	/**
	 * Returns the value of the '<em><b>Page Thumbnail</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Thumbnail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Thumbnail</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_PageThumbnail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-thumbnail' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<PageThumbnailType> getPageThumbnail();

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Frame()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='frame' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<FrameType> getFrame();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Measure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='measure' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<MeasureType> getMeasure();

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Caption()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<CaptionType> getCaption();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Connector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<ConnectorType> getConnector();

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Control()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='control' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<ControlType> getControl();

	/**
	 * Returns the value of the '<em><b>Scene</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Scene()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scene' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0' group='#Shape:4'"
	 * @generated
	 */
	EList<SceneType> getScene();

	/**
	 * Returns the value of the '<em><b>Custom Shape</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Shape</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Shape</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_CustomShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-shape' namespace='##targetNamespace' group='#Shape:4'"
	 * @generated
	 */
	EList<CustomShapeType> getCustomShape();

	/**
	 * Returns the value of the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Page Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Page Number</em>' attribute.
	 * @see #setAnchorPageNumber(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_AnchorPageNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='anchor-page-number' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	BigInteger getAnchorPageNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getAnchorPageNumber <em>Anchor Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Page Number</em>' attribute.
	 * @see #getAnchorPageNumber()
	 * @generated
	 */
	void setAnchorPageNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Anchor Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType
	 * @see #isSetAnchorType()
	 * @see #unsetAnchorType()
	 * @see #setAnchorType(AnchorTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_AnchorType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='anchor-type' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	AnchorTypeType getAnchorType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getAnchorType <em>Anchor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType
	 * @see #isSetAnchorType()
	 * @see #unsetAnchorType()
	 * @see #getAnchorType()
	 * @generated
	 */
	void setAnchorType(AnchorTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getAnchorType <em>Anchor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnchorType()
	 * @see #getAnchorType()
	 * @see #setAnchorType(AnchorTypeType)
	 * @generated
	 */
	void unsetAnchorType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getAnchorType <em>Anchor Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anchor Type</em>' attribute is set.
	 * @see #unsetAnchorType()
	 * @see #getAnchorType()
	 * @see #setAnchorType(AnchorTypeType)
	 * @generated
	 */
	boolean isSetAnchorType();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_CaptionId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='caption-id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCaptionId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getCaptionId <em>Caption Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Id</em>' attribute.
	 * @see #getCaptionId()
	 * @generated
	 */
	void setCaptionId(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_ClassNames()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameRefs" many="false"
	 *        extendedMetaData="kind='attribute' name='class-names' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getClassNames();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getClassNames <em>Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Names</em>' attribute.
	 * @see #getClassNames()
	 * @generated
	 */
	void setClassNames(List<String> value);

	/**
	 * Returns the value of the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Names1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Names1</em>' attribute.
	 * @see #setClassNames1(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_ClassNames1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameRefs" many="false"
	 *        extendedMetaData="kind='attribute' name='class-names' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	List<String> getClassNames1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getClassNames1 <em>Class Names1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Names1</em>' attribute.
	 * @see #getClassNames1()
	 * @generated
	 */
	void setClassNames1(List<String> value);

	/**
	 * Returns the value of the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Cell Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Cell Address</em>' attribute.
	 * @see #setEndCellAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_EndCellAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='end-cell-address' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	String getEndCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEndCellAddress <em>End Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Cell Address</em>' attribute.
	 * @see #getEndCellAddress()
	 * @generated
	 */
	void setEndCellAddress(String value);

	/**
	 * Returns the value of the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End X</em>' attribute.
	 * @see #setEndX(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_EndX()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='end-x' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	String getEndX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEndX <em>End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End X</em>' attribute.
	 * @see #getEndX()
	 * @generated
	 */
	void setEndX(String value);

	/**
	 * Returns the value of the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Y</em>' attribute.
	 * @see #setEndY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_EndY()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='end-y' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	String getEndY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getEndY <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Y</em>' attribute.
	 * @see #getEndY()
	 * @generated
	 */
	void setEndY(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Id()
	 * @model id="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name1</em>' attribute.
	 * @see #setStyleName1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_StyleName1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.presentation.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	String getStyleName1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getStyleName1 <em>Style Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name1</em>' attribute.
	 * @see #getStyleName1()
	 * @generated
	 */
	void setStyleName1(String value);

	/**
	 * Returns the value of the '<em><b>Table Background</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Background</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTableBackground()
	 * @see #unsetTableBackground()
	 * @see #setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_TableBackground()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='table-background' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTableBackground();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getTableBackground <em>Table Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Background</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTableBackground()
	 * @see #unsetTableBackground()
	 * @see #getTableBackground()
	 * @generated
	 */
	void setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getTableBackground <em>Table Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTableBackground()
	 * @see #getTableBackground()
	 * @see #setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTableBackground();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getTableBackground <em>Table Background</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Table Background</em>' attribute is set.
	 * @see #unsetTableBackground()
	 * @see #getTableBackground()
	 * @see #setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTableBackground();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_Y()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate" required="true"
	 *        extendedMetaData="kind='attribute' name='y' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getGType_ZIndex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='z-index' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getZIndex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GType#getZIndex <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZIndex</em>' attribute.
	 * @see #getZIndex()
	 * @generated
	 */
	void setZIndex(BigInteger value);

} // GType
