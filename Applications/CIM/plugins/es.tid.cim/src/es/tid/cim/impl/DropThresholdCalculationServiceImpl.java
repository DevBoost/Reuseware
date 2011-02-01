/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.DropThresholdCalculationService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Threshold Calculation Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.DropThresholdCalculationServiceImpl#getSmoothingWeight <em>Smoothing Weight</em>}</li>
 *   <li>{@link es.tid.cim.impl.DropThresholdCalculationServiceImpl#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DropThresholdCalculationServiceImpl extends ServiceImpl implements DropThresholdCalculationService {
	/**
	 * The default value of the '{@link #getSmoothingWeight() <em>Smoothing Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoothingWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int SMOOTHING_WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSmoothingWeight() <em>Smoothing Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoothingWeight()
	 * @generated
	 * @ordered
	 */
	protected int smoothingWeight = SMOOTHING_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected int timeInterval = TIME_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropThresholdCalculationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getDropThresholdCalculationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSmoothingWeight() {
		return smoothingWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmoothingWeight(int newSmoothingWeight) {
		int oldSmoothingWeight = smoothingWeight;
		smoothingWeight = newSmoothingWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.DROP_THRESHOLD_CALCULATION_SERVICE__SMOOTHING_WEIGHT, oldSmoothingWeight, smoothingWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeInterval() {
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeInterval(int newTimeInterval) {
		int oldTimeInterval = timeInterval;
		timeInterval = newTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.DROP_THRESHOLD_CALCULATION_SERVICE__TIME_INTERVAL, oldTimeInterval, timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.DROP_THRESHOLD_CALCULATION_SERVICE__SMOOTHING_WEIGHT:
				return getSmoothingWeight();
			case CimPackage.DROP_THRESHOLD_CALCULATION_SERVICE__TIME_INTERVAL:
				return getTimeInterval();
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
			case CimPackage.DROP_THRESHOLD_CALCULATION_SERVICE__SMOOTHING_WEIGHT:
				setSmoothingWeight((Integer)newValue);
				return;
			case CimPackage.DROP_THRESHOLD_CALCULATION_SERVICE__TIME_INTERVAL:
				setTimeInterval((Integer)newValue);
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
			case CimPackage.DROP_THRESHOLD_CALCULATION_SERVICE__SMOOTHING_WEIGHT:
				setSmoothingWeight(SMOOTHING_WEIGHT_EDEFAULT);
				return;
			case CimPackage.DROP_THRESHOLD_CALCULATION_SERVICE__TIME_INTERVAL:
				setTimeInterval(TIME_INTERVAL_EDEFAULT);
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
			case CimPackage.DROP_THRESHOLD_CALCULATION_SERVICE__SMOOTHING_WEIGHT:
				return smoothingWeight != SMOOTHING_WEIGHT_EDEFAULT;
			case CimPackage.DROP_THRESHOLD_CALCULATION_SERVICE__TIME_INTERVAL:
				return timeInterval != TIME_INTERVAL_EDEFAULT;
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
		result.append(" (smoothingWeight: ");
		result.append(smoothingWeight);
		result.append(", timeInterval: ");
		result.append(timeInterval);
		result.append(')');
		return result.toString();
	}

} //DropThresholdCalculationServiceImpl
