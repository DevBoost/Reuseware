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

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ContourPathType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contour Path Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ContourPathTypeImpl#getD <em>D</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ContourPathTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ContourPathTypeImpl#getRecreateOnEdit <em>Recreate On Edit</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ContourPathTypeImpl#getViewBox <em>View Box</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ContourPathTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContourPathTypeImpl extends EObjectImpl implements ContourPathType {
	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final String D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected String d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getViewBox() <em>View Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBox()
	 * @generated
	 * @ordered
	 */
	protected static final List VIEW_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewBox() <em>View Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBox()
	 * @generated
	 * @ordered
	 */
	protected List viewBox = VIEW_BOX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContourPathTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getContourPathType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(String newD) {
		String oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CONTOUR_PATH_TYPE__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CONTOUR_PATH_TYPE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CONTOUR_PATH_TYPE__RECREATE_ON_EDIT, oldRecreateOnEdit, recreateOnEdit, !oldRecreateOnEditESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.CONTOUR_PATH_TYPE__RECREATE_ON_EDIT, oldRecreateOnEdit, RECREATE_ON_EDIT_EDEFAULT, oldRecreateOnEditESet));
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
	public List getViewBox() {
		return viewBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewBox(List newViewBox) {
		List oldViewBox = viewBox;
		viewBox = newViewBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CONTOUR_PATH_TYPE__VIEW_BOX, oldViewBox, viewBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.CONTOUR_PATH_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrawingPackage.CONTOUR_PATH_TYPE__D:
				return getD();
			case DrawingPackage.CONTOUR_PATH_TYPE__HEIGHT:
				return getHeight();
			case DrawingPackage.CONTOUR_PATH_TYPE__RECREATE_ON_EDIT:
				return getRecreateOnEdit();
			case DrawingPackage.CONTOUR_PATH_TYPE__VIEW_BOX:
				return getViewBox();
			case DrawingPackage.CONTOUR_PATH_TYPE__WIDTH:
				return getWidth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DrawingPackage.CONTOUR_PATH_TYPE__D:
				setD((String)newValue);
				return;
			case DrawingPackage.CONTOUR_PATH_TYPE__HEIGHT:
				setHeight((String)newValue);
				return;
			case DrawingPackage.CONTOUR_PATH_TYPE__RECREATE_ON_EDIT:
				setRecreateOnEdit((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.CONTOUR_PATH_TYPE__VIEW_BOX:
				setViewBox((List)newValue);
				return;
			case DrawingPackage.CONTOUR_PATH_TYPE__WIDTH:
				setWidth((String)newValue);
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
			case DrawingPackage.CONTOUR_PATH_TYPE__D:
				setD(D_EDEFAULT);
				return;
			case DrawingPackage.CONTOUR_PATH_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case DrawingPackage.CONTOUR_PATH_TYPE__RECREATE_ON_EDIT:
				unsetRecreateOnEdit();
				return;
			case DrawingPackage.CONTOUR_PATH_TYPE__VIEW_BOX:
				setViewBox(VIEW_BOX_EDEFAULT);
				return;
			case DrawingPackage.CONTOUR_PATH_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case DrawingPackage.CONTOUR_PATH_TYPE__D:
				return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
			case DrawingPackage.CONTOUR_PATH_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case DrawingPackage.CONTOUR_PATH_TYPE__RECREATE_ON_EDIT:
				return isSetRecreateOnEdit();
			case DrawingPackage.CONTOUR_PATH_TYPE__VIEW_BOX:
				return VIEW_BOX_EDEFAULT == null ? viewBox != null : !VIEW_BOX_EDEFAULT.equals(viewBox);
			case DrawingPackage.CONTOUR_PATH_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (d: ");
		result.append(d);
		result.append(", height: ");
		result.append(height);
		result.append(", recreateOnEdit: ");
		if (recreateOnEditESet) result.append(recreateOnEdit); else result.append("<unset>");
		result.append(", viewBox: ");
		result.append(viewBox);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //ContourPathTypeImpl
