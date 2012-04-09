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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaCircleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.AreaRectangleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageMapType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageMapTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageMapTypeImpl#getAreaRectangle <em>Area Rectangle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageMapTypeImpl#getAreaCircle <em>Area Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageMapTypeImpl#getAreaPolygon <em>Area Polygon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageMapTypeImpl extends EObjectImpl implements ImageMapType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getImageMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DrawingPackage.IMAGE_MAP_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AreaRectangleType> getAreaRectangle() {
		return getGroup().list(DrawingPackage.eINSTANCE.getImageMapType_AreaRectangle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AreaCircleType> getAreaCircle() {
		return getGroup().list(DrawingPackage.eINSTANCE.getImageMapType_AreaCircle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AreaPolygonType> getAreaPolygon() {
		return getGroup().list(DrawingPackage.eINSTANCE.getImageMapType_AreaPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrawingPackage.IMAGE_MAP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_RECTANGLE:
				return ((InternalEList<?>)getAreaRectangle()).basicRemove(otherEnd, msgs);
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_CIRCLE:
				return ((InternalEList<?>)getAreaCircle()).basicRemove(otherEnd, msgs);
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_POLYGON:
				return ((InternalEList<?>)getAreaPolygon()).basicRemove(otherEnd, msgs);
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
			case DrawingPackage.IMAGE_MAP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_RECTANGLE:
				return getAreaRectangle();
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_CIRCLE:
				return getAreaCircle();
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_POLYGON:
				return getAreaPolygon();
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
			case DrawingPackage.IMAGE_MAP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_RECTANGLE:
				getAreaRectangle().clear();
				getAreaRectangle().addAll((Collection<? extends AreaRectangleType>)newValue);
				return;
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_CIRCLE:
				getAreaCircle().clear();
				getAreaCircle().addAll((Collection<? extends AreaCircleType>)newValue);
				return;
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_POLYGON:
				getAreaPolygon().clear();
				getAreaPolygon().addAll((Collection<? extends AreaPolygonType>)newValue);
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
			case DrawingPackage.IMAGE_MAP_TYPE__GROUP:
				getGroup().clear();
				return;
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_RECTANGLE:
				getAreaRectangle().clear();
				return;
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_CIRCLE:
				getAreaCircle().clear();
				return;
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_POLYGON:
				getAreaPolygon().clear();
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
			case DrawingPackage.IMAGE_MAP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_RECTANGLE:
				return !getAreaRectangle().isEmpty();
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_CIRCLE:
				return !getAreaCircle().isEmpty();
			case DrawingPackage.IMAGE_MAP_TYPE__AREA_POLYGON:
				return !getAreaPolygon().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ImageMapTypeImpl
