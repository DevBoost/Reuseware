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
package org.oasisopen.names.tc.opendocument.xmlns.meta.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.meta.HyperlinkBehaviourType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage;
import org.w3.xlink.ShowType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hyperlink Behaviour Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.HyperlinkBehaviourTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.HyperlinkBehaviourTypeImpl#getTargetFrameName <em>Target Frame Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HyperlinkBehaviourTypeImpl extends EObjectImpl implements HyperlinkBehaviourType {
	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType2 SHOW_EDEFAULT = ShowType2.NEW;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType2 show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

	/**
	 * The default value of the '{@link #getTargetFrameName() <em>Target Frame Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrameName()
	 * @generated
	 * @ordered
	 */
	protected static final Object TARGET_FRAME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetFrameName() <em>Target Frame Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrameName()
	 * @generated
	 * @ordered
	 */
	protected Object targetFrameName = TARGET_FRAME_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HyperlinkBehaviourTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.HYPERLINK_BEHAVIOUR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType2 getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(ShowType2 newShow) {
		ShowType2 oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.HYPERLINK_BEHAVIOUR_TYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShow() {
		ShowType2 oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MetaPackage.HYPERLINK_BEHAVIOUR_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShow() {
		return showESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTargetFrameName() {
		return targetFrameName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFrameName(Object newTargetFrameName) {
		Object oldTargetFrameName = targetFrameName;
		targetFrameName = newTargetFrameName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.HYPERLINK_BEHAVIOUR_TYPE__TARGET_FRAME_NAME, oldTargetFrameName, targetFrameName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.HYPERLINK_BEHAVIOUR_TYPE__SHOW:
				return getShow();
			case MetaPackage.HYPERLINK_BEHAVIOUR_TYPE__TARGET_FRAME_NAME:
				return getTargetFrameName();
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
			case MetaPackage.HYPERLINK_BEHAVIOUR_TYPE__SHOW:
				setShow((ShowType2)newValue);
				return;
			case MetaPackage.HYPERLINK_BEHAVIOUR_TYPE__TARGET_FRAME_NAME:
				setTargetFrameName(newValue);
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
			case MetaPackage.HYPERLINK_BEHAVIOUR_TYPE__SHOW:
				unsetShow();
				return;
			case MetaPackage.HYPERLINK_BEHAVIOUR_TYPE__TARGET_FRAME_NAME:
				setTargetFrameName(TARGET_FRAME_NAME_EDEFAULT);
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
			case MetaPackage.HYPERLINK_BEHAVIOUR_TYPE__SHOW:
				return isSetShow();
			case MetaPackage.HYPERLINK_BEHAVIOUR_TYPE__TARGET_FRAME_NAME:
				return TARGET_FRAME_NAME_EDEFAULT == null ? targetFrameName != null : !TARGET_FRAME_NAME_EDEFAULT.equals(targetFrameName);
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
		result.append(" (show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", targetFrameName: ");
		result.append(targetFrameName);
		result.append(')');
		return result.toString();
	}

} //HyperlinkBehaviourTypeImpl
