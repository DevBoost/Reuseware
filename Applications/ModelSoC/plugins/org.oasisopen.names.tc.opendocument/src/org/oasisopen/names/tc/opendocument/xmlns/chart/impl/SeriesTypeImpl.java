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
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DataPointType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DomainType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorIndicatorType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.MeanValueType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionCurveType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Series Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl#getMeanValue <em>Mean Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl#getRegressionCurve <em>Regression Curve</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl#getErrorIndicator <em>Error Indicator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl#getDataPoint <em>Data Point</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl#getAttachedAxis <em>Attached Axis</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl#getLabelCellAddress <em>Label Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.SeriesTypeImpl#getValuesCellRangeAddress <em>Values Cell Range Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeriesTypeImpl extends EObjectImpl implements SeriesType {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainType> domain;

	/**
	 * The cached value of the '{@link #getMeanValue() <em>Mean Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanValue()
	 * @generated
	 * @ordered
	 */
	protected MeanValueType meanValue;

	/**
	 * The cached value of the '{@link #getRegressionCurve() <em>Regression Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegressionCurve()
	 * @generated
	 * @ordered
	 */
	protected RegressionCurveType regressionCurve;

	/**
	 * The cached value of the '{@link #getErrorIndicator() <em>Error Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorIndicator()
	 * @generated
	 * @ordered
	 */
	protected ErrorIndicatorType errorIndicator;

	/**
	 * The cached value of the '{@link #getDataPoint() <em>Data Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPointType> dataPoint;

	/**
	 * The default value of the '{@link #getAttachedAxis() <em>Attached Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedAxis()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHED_AXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachedAxis() <em>Attached Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedAxis()
	 * @generated
	 * @ordered
	 */
	protected String attachedAxis = ATTACHED_AXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelCellAddress() <em>Label Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelCellAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_CELL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelCellAddress() <em>Label Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelCellAddress()
	 * @generated
	 * @ordered
	 */
	protected String labelCellAddress = LABEL_CELL_ADDRESS_EDEFAULT;

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
	 * The default value of the '{@link #getValuesCellRangeAddress() <em>Values Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUES_CELL_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValuesCellRangeAddress() <em>Values Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String valuesCellRangeAddress = VALUES_CELL_RANGE_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeriesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartPackage.Literals.SERIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainType> getDomain() {
		if (domain == null) {
			domain = new EObjectContainmentEList<DomainType>(DomainType.class, this, ChartPackage.SERIES_TYPE__DOMAIN);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeanValueType getMeanValue() {
		return meanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeanValue(MeanValueType newMeanValue, NotificationChain msgs) {
		MeanValueType oldMeanValue = meanValue;
		meanValue = newMeanValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChartPackage.SERIES_TYPE__MEAN_VALUE, oldMeanValue, newMeanValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanValue(MeanValueType newMeanValue) {
		if (newMeanValue != meanValue) {
			NotificationChain msgs = null;
			if (meanValue != null)
				msgs = ((InternalEObject)meanValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChartPackage.SERIES_TYPE__MEAN_VALUE, null, msgs);
			if (newMeanValue != null)
				msgs = ((InternalEObject)newMeanValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChartPackage.SERIES_TYPE__MEAN_VALUE, null, msgs);
			msgs = basicSetMeanValue(newMeanValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.SERIES_TYPE__MEAN_VALUE, newMeanValue, newMeanValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegressionCurveType getRegressionCurve() {
		return regressionCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegressionCurve(RegressionCurveType newRegressionCurve, NotificationChain msgs) {
		RegressionCurveType oldRegressionCurve = regressionCurve;
		regressionCurve = newRegressionCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChartPackage.SERIES_TYPE__REGRESSION_CURVE, oldRegressionCurve, newRegressionCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegressionCurve(RegressionCurveType newRegressionCurve) {
		if (newRegressionCurve != regressionCurve) {
			NotificationChain msgs = null;
			if (regressionCurve != null)
				msgs = ((InternalEObject)regressionCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChartPackage.SERIES_TYPE__REGRESSION_CURVE, null, msgs);
			if (newRegressionCurve != null)
				msgs = ((InternalEObject)newRegressionCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChartPackage.SERIES_TYPE__REGRESSION_CURVE, null, msgs);
			msgs = basicSetRegressionCurve(newRegressionCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.SERIES_TYPE__REGRESSION_CURVE, newRegressionCurve, newRegressionCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorIndicatorType getErrorIndicator() {
		return errorIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorIndicator(ErrorIndicatorType newErrorIndicator, NotificationChain msgs) {
		ErrorIndicatorType oldErrorIndicator = errorIndicator;
		errorIndicator = newErrorIndicator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChartPackage.SERIES_TYPE__ERROR_INDICATOR, oldErrorIndicator, newErrorIndicator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorIndicator(ErrorIndicatorType newErrorIndicator) {
		if (newErrorIndicator != errorIndicator) {
			NotificationChain msgs = null;
			if (errorIndicator != null)
				msgs = ((InternalEObject)errorIndicator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChartPackage.SERIES_TYPE__ERROR_INDICATOR, null, msgs);
			if (newErrorIndicator != null)
				msgs = ((InternalEObject)newErrorIndicator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChartPackage.SERIES_TYPE__ERROR_INDICATOR, null, msgs);
			msgs = basicSetErrorIndicator(newErrorIndicator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.SERIES_TYPE__ERROR_INDICATOR, newErrorIndicator, newErrorIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPointType> getDataPoint() {
		if (dataPoint == null) {
			dataPoint = new EObjectContainmentEList<DataPointType>(DataPointType.class, this, ChartPackage.SERIES_TYPE__DATA_POINT);
		}
		return dataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttachedAxis() {
		return attachedAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachedAxis(String newAttachedAxis) {
		String oldAttachedAxis = attachedAxis;
		attachedAxis = newAttachedAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.SERIES_TYPE__ATTACHED_AXIS, oldAttachedAxis, attachedAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.SERIES_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelCellAddress() {
		return labelCellAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelCellAddress(String newLabelCellAddress) {
		String oldLabelCellAddress = labelCellAddress;
		labelCellAddress = newLabelCellAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.SERIES_TYPE__LABEL_CELL_ADDRESS, oldLabelCellAddress, labelCellAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.SERIES_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValuesCellRangeAddress() {
		return valuesCellRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuesCellRangeAddress(String newValuesCellRangeAddress) {
		String oldValuesCellRangeAddress = valuesCellRangeAddress;
		valuesCellRangeAddress = newValuesCellRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.SERIES_TYPE__VALUES_CELL_RANGE_ADDRESS, oldValuesCellRangeAddress, valuesCellRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChartPackage.SERIES_TYPE__DOMAIN:
				return ((InternalEList<?>)getDomain()).basicRemove(otherEnd, msgs);
			case ChartPackage.SERIES_TYPE__MEAN_VALUE:
				return basicSetMeanValue(null, msgs);
			case ChartPackage.SERIES_TYPE__REGRESSION_CURVE:
				return basicSetRegressionCurve(null, msgs);
			case ChartPackage.SERIES_TYPE__ERROR_INDICATOR:
				return basicSetErrorIndicator(null, msgs);
			case ChartPackage.SERIES_TYPE__DATA_POINT:
				return ((InternalEList<?>)getDataPoint()).basicRemove(otherEnd, msgs);
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
			case ChartPackage.SERIES_TYPE__DOMAIN:
				return getDomain();
			case ChartPackage.SERIES_TYPE__MEAN_VALUE:
				return getMeanValue();
			case ChartPackage.SERIES_TYPE__REGRESSION_CURVE:
				return getRegressionCurve();
			case ChartPackage.SERIES_TYPE__ERROR_INDICATOR:
				return getErrorIndicator();
			case ChartPackage.SERIES_TYPE__DATA_POINT:
				return getDataPoint();
			case ChartPackage.SERIES_TYPE__ATTACHED_AXIS:
				return getAttachedAxis();
			case ChartPackage.SERIES_TYPE__CLASS:
				return getClass_();
			case ChartPackage.SERIES_TYPE__LABEL_CELL_ADDRESS:
				return getLabelCellAddress();
			case ChartPackage.SERIES_TYPE__STYLE_NAME:
				return getStyleName();
			case ChartPackage.SERIES_TYPE__VALUES_CELL_RANGE_ADDRESS:
				return getValuesCellRangeAddress();
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
			case ChartPackage.SERIES_TYPE__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends DomainType>)newValue);
				return;
			case ChartPackage.SERIES_TYPE__MEAN_VALUE:
				setMeanValue((MeanValueType)newValue);
				return;
			case ChartPackage.SERIES_TYPE__REGRESSION_CURVE:
				setRegressionCurve((RegressionCurveType)newValue);
				return;
			case ChartPackage.SERIES_TYPE__ERROR_INDICATOR:
				setErrorIndicator((ErrorIndicatorType)newValue);
				return;
			case ChartPackage.SERIES_TYPE__DATA_POINT:
				getDataPoint().clear();
				getDataPoint().addAll((Collection<? extends DataPointType>)newValue);
				return;
			case ChartPackage.SERIES_TYPE__ATTACHED_AXIS:
				setAttachedAxis((String)newValue);
				return;
			case ChartPackage.SERIES_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case ChartPackage.SERIES_TYPE__LABEL_CELL_ADDRESS:
				setLabelCellAddress((String)newValue);
				return;
			case ChartPackage.SERIES_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case ChartPackage.SERIES_TYPE__VALUES_CELL_RANGE_ADDRESS:
				setValuesCellRangeAddress((String)newValue);
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
			case ChartPackage.SERIES_TYPE__DOMAIN:
				getDomain().clear();
				return;
			case ChartPackage.SERIES_TYPE__MEAN_VALUE:
				setMeanValue((MeanValueType)null);
				return;
			case ChartPackage.SERIES_TYPE__REGRESSION_CURVE:
				setRegressionCurve((RegressionCurveType)null);
				return;
			case ChartPackage.SERIES_TYPE__ERROR_INDICATOR:
				setErrorIndicator((ErrorIndicatorType)null);
				return;
			case ChartPackage.SERIES_TYPE__DATA_POINT:
				getDataPoint().clear();
				return;
			case ChartPackage.SERIES_TYPE__ATTACHED_AXIS:
				setAttachedAxis(ATTACHED_AXIS_EDEFAULT);
				return;
			case ChartPackage.SERIES_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case ChartPackage.SERIES_TYPE__LABEL_CELL_ADDRESS:
				setLabelCellAddress(LABEL_CELL_ADDRESS_EDEFAULT);
				return;
			case ChartPackage.SERIES_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case ChartPackage.SERIES_TYPE__VALUES_CELL_RANGE_ADDRESS:
				setValuesCellRangeAddress(VALUES_CELL_RANGE_ADDRESS_EDEFAULT);
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
			case ChartPackage.SERIES_TYPE__DOMAIN:
				return domain != null && !domain.isEmpty();
			case ChartPackage.SERIES_TYPE__MEAN_VALUE:
				return meanValue != null;
			case ChartPackage.SERIES_TYPE__REGRESSION_CURVE:
				return regressionCurve != null;
			case ChartPackage.SERIES_TYPE__ERROR_INDICATOR:
				return errorIndicator != null;
			case ChartPackage.SERIES_TYPE__DATA_POINT:
				return dataPoint != null && !dataPoint.isEmpty();
			case ChartPackage.SERIES_TYPE__ATTACHED_AXIS:
				return ATTACHED_AXIS_EDEFAULT == null ? attachedAxis != null : !ATTACHED_AXIS_EDEFAULT.equals(attachedAxis);
			case ChartPackage.SERIES_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case ChartPackage.SERIES_TYPE__LABEL_CELL_ADDRESS:
				return LABEL_CELL_ADDRESS_EDEFAULT == null ? labelCellAddress != null : !LABEL_CELL_ADDRESS_EDEFAULT.equals(labelCellAddress);
			case ChartPackage.SERIES_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case ChartPackage.SERIES_TYPE__VALUES_CELL_RANGE_ADDRESS:
				return VALUES_CELL_RANGE_ADDRESS_EDEFAULT == null ? valuesCellRangeAddress != null : !VALUES_CELL_RANGE_ADDRESS_EDEFAULT.equals(valuesCellRangeAddress);
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
		result.append(" (attachedAxis: ");
		result.append(attachedAxis);
		result.append(", class: ");
		result.append(class_);
		result.append(", labelCellAddress: ");
		result.append(labelCellAddress);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", valuesCellRangeAddress: ");
		result.append(valuesCellRangeAddress);
		result.append(')');
		return result.toString();
	}

} //SeriesTypeImpl
