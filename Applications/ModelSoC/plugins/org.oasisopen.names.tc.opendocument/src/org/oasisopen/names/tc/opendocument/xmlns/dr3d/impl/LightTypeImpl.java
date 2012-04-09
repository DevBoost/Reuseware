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
package org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.LightTypeImpl#getDiffuseColor <em>Diffuse Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.LightTypeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.LightTypeImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.LightTypeImpl#getSpecular <em>Specular</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LightTypeImpl extends EObjectImpl implements LightType {
	/**
	 * The default value of the '{@link #getDiffuseColor() <em>Diffuse Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseColor()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFFUSE_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiffuseColor() <em>Diffuse Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseColor()
	 * @generated
	 * @ordered
	 */
	protected String diffuseColor = DIFFUSE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected String direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ENABLED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean enabled = ENABLED_EDEFAULT;

	/**
	 * This is true if the Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enabledESet;

	/**
	 * The default value of the '{@link #getSpecular() <em>Specular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecular()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SPECULAR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSpecular() <em>Specular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecular()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean specular = SPECULAR_EDEFAULT;

	/**
	 * This is true if the Specular attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specularESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dr3dPackage.Literals.LIGHT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiffuseColor() {
		return diffuseColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseColor(String newDiffuseColor) {
		String oldDiffuseColor = diffuseColor;
		diffuseColor = newDiffuseColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.LIGHT_TYPE__DIFFUSE_COLOR, oldDiffuseColor, diffuseColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(String newDirection) {
		String oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.LIGHT_TYPE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newEnabled) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEnabled = enabled;
		enabled = newEnabled == null ? ENABLED_EDEFAULT : newEnabled;
		boolean oldEnabledESet = enabledESet;
		enabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.LIGHT_TYPE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnabled() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEnabled = enabled;
		boolean oldEnabledESet = enabledESet;
		enabled = ENABLED_EDEFAULT;
		enabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.LIGHT_TYPE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnabled() {
		return enabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSpecular() {
		return specular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecular(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newSpecular) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSpecular = specular;
		specular = newSpecular == null ? SPECULAR_EDEFAULT : newSpecular;
		boolean oldSpecularESet = specularESet;
		specularESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dr3dPackage.LIGHT_TYPE__SPECULAR, oldSpecular, specular, !oldSpecularESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecular() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldSpecular = specular;
		boolean oldSpecularESet = specularESet;
		specular = SPECULAR_EDEFAULT;
		specularESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Dr3dPackage.LIGHT_TYPE__SPECULAR, oldSpecular, SPECULAR_EDEFAULT, oldSpecularESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecular() {
		return specularESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dr3dPackage.LIGHT_TYPE__DIFFUSE_COLOR:
				return getDiffuseColor();
			case Dr3dPackage.LIGHT_TYPE__DIRECTION:
				return getDirection();
			case Dr3dPackage.LIGHT_TYPE__ENABLED:
				return getEnabled();
			case Dr3dPackage.LIGHT_TYPE__SPECULAR:
				return getSpecular();
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
			case Dr3dPackage.LIGHT_TYPE__DIFFUSE_COLOR:
				setDiffuseColor((String)newValue);
				return;
			case Dr3dPackage.LIGHT_TYPE__DIRECTION:
				setDirection((String)newValue);
				return;
			case Dr3dPackage.LIGHT_TYPE__ENABLED:
				setEnabled((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case Dr3dPackage.LIGHT_TYPE__SPECULAR:
				setSpecular((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case Dr3dPackage.LIGHT_TYPE__DIFFUSE_COLOR:
				setDiffuseColor(DIFFUSE_COLOR_EDEFAULT);
				return;
			case Dr3dPackage.LIGHT_TYPE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case Dr3dPackage.LIGHT_TYPE__ENABLED:
				unsetEnabled();
				return;
			case Dr3dPackage.LIGHT_TYPE__SPECULAR:
				unsetSpecular();
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
			case Dr3dPackage.LIGHT_TYPE__DIFFUSE_COLOR:
				return DIFFUSE_COLOR_EDEFAULT == null ? diffuseColor != null : !DIFFUSE_COLOR_EDEFAULT.equals(diffuseColor);
			case Dr3dPackage.LIGHT_TYPE__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
			case Dr3dPackage.LIGHT_TYPE__ENABLED:
				return isSetEnabled();
			case Dr3dPackage.LIGHT_TYPE__SPECULAR:
				return isSetSpecular();
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
		result.append(" (diffuseColor: ");
		result.append(diffuseColor);
		result.append(", direction: ");
		result.append(direction);
		result.append(", enabled: ");
		if (enabledESet) result.append(enabled); else result.append("<unset>");
		result.append(", specular: ");
		if (specularESet) result.append(specular); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LightTypeImpl
