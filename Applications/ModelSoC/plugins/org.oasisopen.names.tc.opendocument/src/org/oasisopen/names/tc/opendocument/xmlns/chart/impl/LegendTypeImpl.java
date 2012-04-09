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
package org.oasisopen.names.tc.opendocument.xmlns.chart.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType;
import org.oasisopen.names.tc.opendocument.xmlns.style.LegendExpansionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legend Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.LegendTypeImpl#getLegendAlign <em>Legend Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.LegendTypeImpl#getLegendExpansion <em>Legend Expansion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.LegendTypeImpl#getLegendExpansionAspectRatio <em>Legend Expansion Aspect Ratio</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.LegendTypeImpl#getLegendPosition <em>Legend Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.LegendTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.LegendTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.LegendTypeImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LegendTypeImpl extends EObjectImpl implements LegendType {
	/**
	 * The default value of the '{@link #getLegendAlign() <em>Legend Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendAlign()
	 * @generated
	 * @ordered
	 */
	protected static final LegendAlignType LEGEND_ALIGN_EDEFAULT = LegendAlignType.START;

	/**
	 * The cached value of the '{@link #getLegendAlign() <em>Legend Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendAlign()
	 * @generated
	 * @ordered
	 */
	protected LegendAlignType legendAlign = LEGEND_ALIGN_EDEFAULT;

	/**
	 * This is true if the Legend Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean legendAlignESet;

	/**
	 * The default value of the '{@link #getLegendExpansion() <em>Legend Expansion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendExpansion()
	 * @generated
	 * @ordered
	 */
	protected static final LegendExpansionType LEGEND_EXPANSION_EDEFAULT = LegendExpansionType.WIDE;

	/**
	 * The cached value of the '{@link #getLegendExpansion() <em>Legend Expansion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendExpansion()
	 * @generated
	 * @ordered
	 */
	protected LegendExpansionType legendExpansion = LEGEND_EXPANSION_EDEFAULT;

	/**
	 * This is true if the Legend Expansion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean legendExpansionESet;

	/**
	 * The default value of the '{@link #getLegendExpansionAspectRatio() <em>Legend Expansion Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendExpansionAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double LEGEND_EXPANSION_ASPECT_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLegendExpansionAspectRatio() <em>Legend Expansion Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendExpansionAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected double legendExpansionAspectRatio = LEGEND_EXPANSION_ASPECT_RATIO_EDEFAULT;

	/**
	 * This is true if the Legend Expansion Aspect Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean legendExpansionAspectRatioESet;

	/**
	 * The default value of the '{@link #getLegendPosition() <em>Legend Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendPosition()
	 * @generated
	 * @ordered
	 */
	protected static final LegendPositionType LEGEND_POSITION_EDEFAULT = LegendPositionType.START;

	/**
	 * The cached value of the '{@link #getLegendPosition() <em>Legend Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendPosition()
	 * @generated
	 * @ordered
	 */
	protected LegendPositionType legendPosition = LEGEND_POSITION_EDEFAULT;

	/**
	 * This is true if the Legend Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean legendPositionESet;

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
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final String X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected String x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final String Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected String y = Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegendTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartPackage.Literals.LEGEND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendAlignType getLegendAlign() {
		return legendAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegendAlign(LegendAlignType newLegendAlign) {
		LegendAlignType oldLegendAlign = legendAlign;
		legendAlign = newLegendAlign == null ? LEGEND_ALIGN_EDEFAULT : newLegendAlign;
		boolean oldLegendAlignESet = legendAlignESet;
		legendAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.LEGEND_TYPE__LEGEND_ALIGN, oldLegendAlign, legendAlign, !oldLegendAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLegendAlign() {
		LegendAlignType oldLegendAlign = legendAlign;
		boolean oldLegendAlignESet = legendAlignESet;
		legendAlign = LEGEND_ALIGN_EDEFAULT;
		legendAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.LEGEND_TYPE__LEGEND_ALIGN, oldLegendAlign, LEGEND_ALIGN_EDEFAULT, oldLegendAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLegendAlign() {
		return legendAlignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendExpansionType getLegendExpansion() {
		return legendExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegendExpansion(LegendExpansionType newLegendExpansion) {
		LegendExpansionType oldLegendExpansion = legendExpansion;
		legendExpansion = newLegendExpansion == null ? LEGEND_EXPANSION_EDEFAULT : newLegendExpansion;
		boolean oldLegendExpansionESet = legendExpansionESet;
		legendExpansionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.LEGEND_TYPE__LEGEND_EXPANSION, oldLegendExpansion, legendExpansion, !oldLegendExpansionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLegendExpansion() {
		LegendExpansionType oldLegendExpansion = legendExpansion;
		boolean oldLegendExpansionESet = legendExpansionESet;
		legendExpansion = LEGEND_EXPANSION_EDEFAULT;
		legendExpansionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.LEGEND_TYPE__LEGEND_EXPANSION, oldLegendExpansion, LEGEND_EXPANSION_EDEFAULT, oldLegendExpansionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLegendExpansion() {
		return legendExpansionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLegendExpansionAspectRatio() {
		return legendExpansionAspectRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegendExpansionAspectRatio(double newLegendExpansionAspectRatio) {
		double oldLegendExpansionAspectRatio = legendExpansionAspectRatio;
		legendExpansionAspectRatio = newLegendExpansionAspectRatio;
		boolean oldLegendExpansionAspectRatioESet = legendExpansionAspectRatioESet;
		legendExpansionAspectRatioESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.LEGEND_TYPE__LEGEND_EXPANSION_ASPECT_RATIO, oldLegendExpansionAspectRatio, legendExpansionAspectRatio, !oldLegendExpansionAspectRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLegendExpansionAspectRatio() {
		double oldLegendExpansionAspectRatio = legendExpansionAspectRatio;
		boolean oldLegendExpansionAspectRatioESet = legendExpansionAspectRatioESet;
		legendExpansionAspectRatio = LEGEND_EXPANSION_ASPECT_RATIO_EDEFAULT;
		legendExpansionAspectRatioESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.LEGEND_TYPE__LEGEND_EXPANSION_ASPECT_RATIO, oldLegendExpansionAspectRatio, LEGEND_EXPANSION_ASPECT_RATIO_EDEFAULT, oldLegendExpansionAspectRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLegendExpansionAspectRatio() {
		return legendExpansionAspectRatioESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendPositionType getLegendPosition() {
		return legendPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegendPosition(LegendPositionType newLegendPosition) {
		LegendPositionType oldLegendPosition = legendPosition;
		legendPosition = newLegendPosition == null ? LEGEND_POSITION_EDEFAULT : newLegendPosition;
		boolean oldLegendPositionESet = legendPositionESet;
		legendPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.LEGEND_TYPE__LEGEND_POSITION, oldLegendPosition, legendPosition, !oldLegendPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLegendPosition() {
		LegendPositionType oldLegendPosition = legendPosition;
		boolean oldLegendPositionESet = legendPositionESet;
		legendPosition = LEGEND_POSITION_EDEFAULT;
		legendPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.LEGEND_TYPE__LEGEND_POSITION, oldLegendPosition, LEGEND_POSITION_EDEFAULT, oldLegendPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLegendPosition() {
		return legendPositionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.LEGEND_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(String newX) {
		String oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.LEGEND_TYPE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(String newY) {
		String oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.LEGEND_TYPE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChartPackage.LEGEND_TYPE__LEGEND_ALIGN:
				return getLegendAlign();
			case ChartPackage.LEGEND_TYPE__LEGEND_EXPANSION:
				return getLegendExpansion();
			case ChartPackage.LEGEND_TYPE__LEGEND_EXPANSION_ASPECT_RATIO:
				return new Double(getLegendExpansionAspectRatio());
			case ChartPackage.LEGEND_TYPE__LEGEND_POSITION:
				return getLegendPosition();
			case ChartPackage.LEGEND_TYPE__STYLE_NAME:
				return getStyleName();
			case ChartPackage.LEGEND_TYPE__X:
				return getX();
			case ChartPackage.LEGEND_TYPE__Y:
				return getY();
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
			case ChartPackage.LEGEND_TYPE__LEGEND_ALIGN:
				setLegendAlign((LegendAlignType)newValue);
				return;
			case ChartPackage.LEGEND_TYPE__LEGEND_EXPANSION:
				setLegendExpansion((LegendExpansionType)newValue);
				return;
			case ChartPackage.LEGEND_TYPE__LEGEND_EXPANSION_ASPECT_RATIO:
				setLegendExpansionAspectRatio(((Double)newValue).doubleValue());
				return;
			case ChartPackage.LEGEND_TYPE__LEGEND_POSITION:
				setLegendPosition((LegendPositionType)newValue);
				return;
			case ChartPackage.LEGEND_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case ChartPackage.LEGEND_TYPE__X:
				setX((String)newValue);
				return;
			case ChartPackage.LEGEND_TYPE__Y:
				setY((String)newValue);
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
			case ChartPackage.LEGEND_TYPE__LEGEND_ALIGN:
				unsetLegendAlign();
				return;
			case ChartPackage.LEGEND_TYPE__LEGEND_EXPANSION:
				unsetLegendExpansion();
				return;
			case ChartPackage.LEGEND_TYPE__LEGEND_EXPANSION_ASPECT_RATIO:
				unsetLegendExpansionAspectRatio();
				return;
			case ChartPackage.LEGEND_TYPE__LEGEND_POSITION:
				unsetLegendPosition();
				return;
			case ChartPackage.LEGEND_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case ChartPackage.LEGEND_TYPE__X:
				setX(X_EDEFAULT);
				return;
			case ChartPackage.LEGEND_TYPE__Y:
				setY(Y_EDEFAULT);
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
			case ChartPackage.LEGEND_TYPE__LEGEND_ALIGN:
				return isSetLegendAlign();
			case ChartPackage.LEGEND_TYPE__LEGEND_EXPANSION:
				return isSetLegendExpansion();
			case ChartPackage.LEGEND_TYPE__LEGEND_EXPANSION_ASPECT_RATIO:
				return isSetLegendExpansionAspectRatio();
			case ChartPackage.LEGEND_TYPE__LEGEND_POSITION:
				return isSetLegendPosition();
			case ChartPackage.LEGEND_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case ChartPackage.LEGEND_TYPE__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case ChartPackage.LEGEND_TYPE__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
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
		result.append(" (legendAlign: ");
		if (legendAlignESet) result.append(legendAlign); else result.append("<unset>");
		result.append(", legendExpansion: ");
		if (legendExpansionESet) result.append(legendExpansion); else result.append("<unset>");
		result.append(", legendExpansionAspectRatio: ");
		if (legendExpansionAspectRatioESet) result.append(legendExpansionAspectRatio); else result.append("<unset>");
		result.append(", legendPosition: ");
		if (legendPositionESet) result.append(legendPosition); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //LegendTypeImpl
