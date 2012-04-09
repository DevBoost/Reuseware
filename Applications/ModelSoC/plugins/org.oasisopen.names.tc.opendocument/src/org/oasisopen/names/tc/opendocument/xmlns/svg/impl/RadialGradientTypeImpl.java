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
package org.oasisopen.names.tc.opendocument.xmlns.svg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.StopType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radial Gradient Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl#getFx <em>Fx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl#getFy <em>Fy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl#getGradientTransform <em>Gradient Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl#getGradientUnits <em>Gradient Units</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl#getR <em>R</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.RadialGradientTypeImpl#getSpreadMethod <em>Spread Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadialGradientTypeImpl extends EObjectImpl implements RadialGradientType {
	/**
	 * The cached value of the '{@link #getStop() <em>Stop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected EList<StopType> stop;

	/**
	 * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected static final String CX_EDEFAULT = "50%";

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
	 * This is true if the Cx attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cxESet;

	/**
	 * The default value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected static final String CY_EDEFAULT = "50%";

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
	 * This is true if the Cy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cyESet;

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
	 * The default value of the '{@link #getFx() <em>Fx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx()
	 * @generated
	 * @ordered
	 */
	protected static final String FX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFx() <em>Fx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx()
	 * @generated
	 * @ordered
	 */
	protected String fx = FX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFy() <em>Fy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFy()
	 * @generated
	 * @ordered
	 */
	protected static final String FY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFy() <em>Fy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFy()
	 * @generated
	 * @ordered
	 */
	protected String fy = FY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradientTransform() <em>Gradient Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADIENT_TRANSFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGradientTransform() <em>Gradient Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientTransform()
	 * @generated
	 * @ordered
	 */
	protected String gradientTransform = GRADIENT_TRANSFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradientUnits() <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientUnits()
	 * @generated
	 * @ordered
	 */
	protected static final GradientUnitsType GRADIENT_UNITS_EDEFAULT = GradientUnitsType.OBJECT_BOUNDING_BOX;

	/**
	 * The cached value of the '{@link #getGradientUnits() <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientUnits()
	 * @generated
	 * @ordered
	 */
	protected GradientUnitsType gradientUnits = GRADIENT_UNITS_EDEFAULT;

	/**
	 * This is true if the Gradient Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gradientUnitsESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final String R_EDEFAULT = "50%";

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected String r = R_EDEFAULT;

	/**
	 * This is true if the R attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rESet;

	/**
	 * The default value of the '{@link #getSpreadMethod() <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadMethod()
	 * @generated
	 * @ordered
	 */
	protected static final SpreadMethodType SPREAD_METHOD_EDEFAULT = SpreadMethodType.PAD;

	/**
	 * The cached value of the '{@link #getSpreadMethod() <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadMethod()
	 * @generated
	 * @ordered
	 */
	protected SpreadMethodType spreadMethod = SPREAD_METHOD_EDEFAULT;

	/**
	 * This is true if the Spread Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spreadMethodESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadialGradientTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.RADIAL_GRADIENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopType> getStop() {
		if (stop == null) {
			stop = new EObjectContainmentEList<StopType>(StopType.class, this, SvgPackage.RADIAL_GRADIENT_TYPE__STOP);
		}
		return stop;
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
		boolean oldCxESet = cxESet;
		cxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RADIAL_GRADIENT_TYPE__CX, oldCx, cx, !oldCxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCx() {
		String oldCx = cx;
		boolean oldCxESet = cxESet;
		cx = CX_EDEFAULT;
		cxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.RADIAL_GRADIENT_TYPE__CX, oldCx, CX_EDEFAULT, oldCxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCx() {
		return cxESet;
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
		boolean oldCyESet = cyESet;
		cyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RADIAL_GRADIENT_TYPE__CY, oldCy, cy, !oldCyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCy() {
		String oldCy = cy;
		boolean oldCyESet = cyESet;
		cy = CY_EDEFAULT;
		cyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.RADIAL_GRADIENT_TYPE__CY, oldCy, CY_EDEFAULT, oldCyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCy() {
		return cyESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RADIAL_GRADIENT_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFx() {
		return fx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFx(String newFx) {
		String oldFx = fx;
		fx = newFx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RADIAL_GRADIENT_TYPE__FX, oldFx, fx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFy() {
		return fy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFy(String newFy) {
		String oldFy = fy;
		fy = newFy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RADIAL_GRADIENT_TYPE__FY, oldFy, fy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGradientTransform() {
		return gradientTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientTransform(String newGradientTransform) {
		String oldGradientTransform = gradientTransform;
		gradientTransform = newGradientTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RADIAL_GRADIENT_TYPE__GRADIENT_TRANSFORM, oldGradientTransform, gradientTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientUnitsType getGradientUnits() {
		return gradientUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientUnits(GradientUnitsType newGradientUnits) {
		GradientUnitsType oldGradientUnits = gradientUnits;
		gradientUnits = newGradientUnits == null ? GRADIENT_UNITS_EDEFAULT : newGradientUnits;
		boolean oldGradientUnitsESet = gradientUnitsESet;
		gradientUnitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RADIAL_GRADIENT_TYPE__GRADIENT_UNITS, oldGradientUnits, gradientUnits, !oldGradientUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGradientUnits() {
		GradientUnitsType oldGradientUnits = gradientUnits;
		boolean oldGradientUnitsESet = gradientUnitsESet;
		gradientUnits = GRADIENT_UNITS_EDEFAULT;
		gradientUnitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.RADIAL_GRADIENT_TYPE__GRADIENT_UNITS, oldGradientUnits, GRADIENT_UNITS_EDEFAULT, oldGradientUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGradientUnits() {
		return gradientUnitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RADIAL_GRADIENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(String newR) {
		String oldR = r;
		r = newR;
		boolean oldRESet = rESet;
		rESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RADIAL_GRADIENT_TYPE__R, oldR, r, !oldRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetR() {
		String oldR = r;
		boolean oldRESet = rESet;
		r = R_EDEFAULT;
		rESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.RADIAL_GRADIENT_TYPE__R, oldR, R_EDEFAULT, oldRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetR() {
		return rESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadMethodType getSpreadMethod() {
		return spreadMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadMethod(SpreadMethodType newSpreadMethod) {
		SpreadMethodType oldSpreadMethod = spreadMethod;
		spreadMethod = newSpreadMethod == null ? SPREAD_METHOD_EDEFAULT : newSpreadMethod;
		boolean oldSpreadMethodESet = spreadMethodESet;
		spreadMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.RADIAL_GRADIENT_TYPE__SPREAD_METHOD, oldSpreadMethod, spreadMethod, !oldSpreadMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpreadMethod() {
		SpreadMethodType oldSpreadMethod = spreadMethod;
		boolean oldSpreadMethodESet = spreadMethodESet;
		spreadMethod = SPREAD_METHOD_EDEFAULT;
		spreadMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.RADIAL_GRADIENT_TYPE__SPREAD_METHOD, oldSpreadMethod, SPREAD_METHOD_EDEFAULT, oldSpreadMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpreadMethod() {
		return spreadMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SvgPackage.RADIAL_GRADIENT_TYPE__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
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
			case SvgPackage.RADIAL_GRADIENT_TYPE__STOP:
				return getStop();
			case SvgPackage.RADIAL_GRADIENT_TYPE__CX:
				return getCx();
			case SvgPackage.RADIAL_GRADIENT_TYPE__CY:
				return getCy();
			case SvgPackage.RADIAL_GRADIENT_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case SvgPackage.RADIAL_GRADIENT_TYPE__FX:
				return getFx();
			case SvgPackage.RADIAL_GRADIENT_TYPE__FY:
				return getFy();
			case SvgPackage.RADIAL_GRADIENT_TYPE__GRADIENT_TRANSFORM:
				return getGradientTransform();
			case SvgPackage.RADIAL_GRADIENT_TYPE__GRADIENT_UNITS:
				return getGradientUnits();
			case SvgPackage.RADIAL_GRADIENT_TYPE__NAME:
				return getName();
			case SvgPackage.RADIAL_GRADIENT_TYPE__R:
				return getR();
			case SvgPackage.RADIAL_GRADIENT_TYPE__SPREAD_METHOD:
				return getSpreadMethod();
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
			case SvgPackage.RADIAL_GRADIENT_TYPE__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopType>)newValue);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__CX:
				setCx((String)newValue);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__CY:
				setCy((String)newValue);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__FX:
				setFx((String)newValue);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__FY:
				setFy((String)newValue);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__GRADIENT_TRANSFORM:
				setGradientTransform((String)newValue);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__GRADIENT_UNITS:
				setGradientUnits((GradientUnitsType)newValue);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__R:
				setR((String)newValue);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__SPREAD_METHOD:
				setSpreadMethod((SpreadMethodType)newValue);
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
			case SvgPackage.RADIAL_GRADIENT_TYPE__STOP:
				getStop().clear();
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__CX:
				unsetCx();
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__CY:
				unsetCy();
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__FX:
				setFx(FX_EDEFAULT);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__FY:
				setFy(FY_EDEFAULT);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__GRADIENT_TRANSFORM:
				setGradientTransform(GRADIENT_TRANSFORM_EDEFAULT);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__GRADIENT_UNITS:
				unsetGradientUnits();
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__R:
				unsetR();
				return;
			case SvgPackage.RADIAL_GRADIENT_TYPE__SPREAD_METHOD:
				unsetSpreadMethod();
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
			case SvgPackage.RADIAL_GRADIENT_TYPE__STOP:
				return stop != null && !stop.isEmpty();
			case SvgPackage.RADIAL_GRADIENT_TYPE__CX:
				return isSetCx();
			case SvgPackage.RADIAL_GRADIENT_TYPE__CY:
				return isSetCy();
			case SvgPackage.RADIAL_GRADIENT_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case SvgPackage.RADIAL_GRADIENT_TYPE__FX:
				return FX_EDEFAULT == null ? fx != null : !FX_EDEFAULT.equals(fx);
			case SvgPackage.RADIAL_GRADIENT_TYPE__FY:
				return FY_EDEFAULT == null ? fy != null : !FY_EDEFAULT.equals(fy);
			case SvgPackage.RADIAL_GRADIENT_TYPE__GRADIENT_TRANSFORM:
				return GRADIENT_TRANSFORM_EDEFAULT == null ? gradientTransform != null : !GRADIENT_TRANSFORM_EDEFAULT.equals(gradientTransform);
			case SvgPackage.RADIAL_GRADIENT_TYPE__GRADIENT_UNITS:
				return isSetGradientUnits();
			case SvgPackage.RADIAL_GRADIENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SvgPackage.RADIAL_GRADIENT_TYPE__R:
				return isSetR();
			case SvgPackage.RADIAL_GRADIENT_TYPE__SPREAD_METHOD:
				return isSetSpreadMethod();
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
		result.append(" (cx: ");
		if (cxESet) result.append(cx); else result.append("<unset>");
		result.append(", cy: ");
		if (cyESet) result.append(cy); else result.append("<unset>");
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", fx: ");
		result.append(fx);
		result.append(", fy: ");
		result.append(fy);
		result.append(", gradientTransform: ");
		result.append(gradientTransform);
		result.append(", gradientUnits: ");
		if (gradientUnitsESet) result.append(gradientUnits); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", r: ");
		if (rESet) result.append(r); else result.append("<unset>");
		result.append(", spreadMethod: ");
		if (spreadMethodESet) result.append(spreadMethod); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RadialGradientTypeImpl
