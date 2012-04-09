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
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shapes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ShapesTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapesTypeImpl extends EObjectImpl implements ShapesType {
	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap shape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getShapesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getShape() {
		if (shape == null) {
			shape = new BasicFeatureMap(this, TablePackage.SHAPES_TYPE__SHAPE);
		}
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getShape().list(TablePackage.eINSTANCE.getShapesType_CustomShape());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.SHAPES_TYPE__SHAPE:
				return ((InternalEList<?>)getShape()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case TablePackage.SHAPES_TYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
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
			case TablePackage.SHAPES_TYPE__SHAPE:
				if (coreType) return getShape();
				return ((FeatureMap.Internal)getShape()).getWrapper();
			case TablePackage.SHAPES_TYPE__RECT:
				return getRect();
			case TablePackage.SHAPES_TYPE__LINE:
				return getLine();
			case TablePackage.SHAPES_TYPE__POLYLINE:
				return getPolyline();
			case TablePackage.SHAPES_TYPE__POLYGON:
				return getPolygon();
			case TablePackage.SHAPES_TYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case TablePackage.SHAPES_TYPE__PATH:
				return getPath();
			case TablePackage.SHAPES_TYPE__CIRCLE:
				return getCircle();
			case TablePackage.SHAPES_TYPE__ELLIPSE:
				return getEllipse();
			case TablePackage.SHAPES_TYPE__G:
				return getG();
			case TablePackage.SHAPES_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case TablePackage.SHAPES_TYPE__FRAME:
				return getFrame();
			case TablePackage.SHAPES_TYPE__MEASURE:
				return getMeasure();
			case TablePackage.SHAPES_TYPE__CAPTION:
				return getCaption();
			case TablePackage.SHAPES_TYPE__CONNECTOR:
				return getConnector();
			case TablePackage.SHAPES_TYPE__CONTROL:
				return getControl();
			case TablePackage.SHAPES_TYPE__SCENE:
				return getScene();
			case TablePackage.SHAPES_TYPE__CUSTOM_SHAPE:
				return getCustomShape();
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
			case TablePackage.SHAPES_TYPE__SHAPE:
				((FeatureMap.Internal)getShape()).set(newValue);
				return;
			case TablePackage.SHAPES_TYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case TablePackage.SHAPES_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
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
			case TablePackage.SHAPES_TYPE__SHAPE:
				getShape().clear();
				return;
			case TablePackage.SHAPES_TYPE__RECT:
				getRect().clear();
				return;
			case TablePackage.SHAPES_TYPE__LINE:
				getLine().clear();
				return;
			case TablePackage.SHAPES_TYPE__POLYLINE:
				getPolyline().clear();
				return;
			case TablePackage.SHAPES_TYPE__POLYGON:
				getPolygon().clear();
				return;
			case TablePackage.SHAPES_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case TablePackage.SHAPES_TYPE__PATH:
				getPath().clear();
				return;
			case TablePackage.SHAPES_TYPE__CIRCLE:
				getCircle().clear();
				return;
			case TablePackage.SHAPES_TYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case TablePackage.SHAPES_TYPE__G:
				getG().clear();
				return;
			case TablePackage.SHAPES_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case TablePackage.SHAPES_TYPE__FRAME:
				getFrame().clear();
				return;
			case TablePackage.SHAPES_TYPE__MEASURE:
				getMeasure().clear();
				return;
			case TablePackage.SHAPES_TYPE__CAPTION:
				getCaption().clear();
				return;
			case TablePackage.SHAPES_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case TablePackage.SHAPES_TYPE__CONTROL:
				getControl().clear();
				return;
			case TablePackage.SHAPES_TYPE__SCENE:
				getScene().clear();
				return;
			case TablePackage.SHAPES_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
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
			case TablePackage.SHAPES_TYPE__SHAPE:
				return shape != null && !shape.isEmpty();
			case TablePackage.SHAPES_TYPE__RECT:
				return !getRect().isEmpty();
			case TablePackage.SHAPES_TYPE__LINE:
				return !getLine().isEmpty();
			case TablePackage.SHAPES_TYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case TablePackage.SHAPES_TYPE__POLYGON:
				return !getPolygon().isEmpty();
			case TablePackage.SHAPES_TYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case TablePackage.SHAPES_TYPE__PATH:
				return !getPath().isEmpty();
			case TablePackage.SHAPES_TYPE__CIRCLE:
				return !getCircle().isEmpty();
			case TablePackage.SHAPES_TYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case TablePackage.SHAPES_TYPE__G:
				return !getG().isEmpty();
			case TablePackage.SHAPES_TYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case TablePackage.SHAPES_TYPE__FRAME:
				return !getFrame().isEmpty();
			case TablePackage.SHAPES_TYPE__MEASURE:
				return !getMeasure().isEmpty();
			case TablePackage.SHAPES_TYPE__CAPTION:
				return !getCaption().isEmpty();
			case TablePackage.SHAPES_TYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case TablePackage.SHAPES_TYPE__CONTROL:
				return !getControl().isEmpty();
			case TablePackage.SHAPES_TYPE__SCENE:
				return !getScene().isEmpty();
			case TablePackage.SHAPES_TYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
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
		result.append(" (shape: ");
		result.append(shape);
		result.append(')');
		return result.toString();
	}

} //ShapesTypeImpl
