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

import es.tid.cim.ADSLModem;
import es.tid.cim.CimPackage;
import es.tid.cim.EnumLineState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADSL Modem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ADSLModemImpl#getLineAttenuation <em>Line Attenuation</em>}</li>
 *   <li>{@link es.tid.cim.impl.ADSLModemImpl#getLineState <em>Line State</em>}</li>
 *   <li>{@link es.tid.cim.impl.ADSLModemImpl#getMaxDataRate <em>Max Data Rate</em>}</li>
 *   <li>{@link es.tid.cim.impl.ADSLModemImpl#getNoiseMargin <em>Noise Margin</em>}</li>
 *   <li>{@link es.tid.cim.impl.ADSLModemImpl#getTotalOutputPower <em>Total Output Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ADSLModemImpl extends DSLModemImpl implements ADSLModem {
	/**
	 * The default value of the '{@link #getLineAttenuation() <em>Line Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineAttenuation()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_ATTENUATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineAttenuation() <em>Line Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineAttenuation()
	 * @generated
	 * @ordered
	 */
	protected int lineAttenuation = LINE_ATTENUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineState() <em>Line State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineState()
	 * @generated
	 * @ordered
	 */
	protected static final EnumLineState LINE_STATE_EDEFAULT = EnumLineState.NO_DEFECT;

	/**
	 * The cached value of the '{@link #getLineState() <em>Line State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineState()
	 * @generated
	 * @ordered
	 */
	protected EnumLineState lineState = LINE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDataRate() <em>Max Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataRate()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_DATA_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxDataRate() <em>Max Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataRate()
	 * @generated
	 * @ordered
	 */
	protected int maxDataRate = MAX_DATA_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoiseMargin() <em>Noise Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoiseMargin()
	 * @generated
	 * @ordered
	 */
	protected static final int NOISE_MARGIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoiseMargin() <em>Noise Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoiseMargin()
	 * @generated
	 * @ordered
	 */
	protected int noiseMargin = NOISE_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalOutputPower() <em>Total Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalOutputPower()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_OUTPUT_POWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalOutputPower() <em>Total Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalOutputPower()
	 * @generated
	 * @ordered
	 */
	protected int totalOutputPower = TOTAL_OUTPUT_POWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADSLModemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getADSLModem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineAttenuation() {
		return lineAttenuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineAttenuation(int newLineAttenuation) {
		int oldLineAttenuation = lineAttenuation;
		lineAttenuation = newLineAttenuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADSL_MODEM__LINE_ATTENUATION, oldLineAttenuation, lineAttenuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLineState getLineState() {
		return lineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineState(EnumLineState newLineState) {
		EnumLineState oldLineState = lineState;
		lineState = newLineState == null ? LINE_STATE_EDEFAULT : newLineState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADSL_MODEM__LINE_STATE, oldLineState, lineState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxDataRate() {
		return maxDataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDataRate(int newMaxDataRate) {
		int oldMaxDataRate = maxDataRate;
		maxDataRate = newMaxDataRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADSL_MODEM__MAX_DATA_RATE, oldMaxDataRate, maxDataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoiseMargin() {
		return noiseMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoiseMargin(int newNoiseMargin) {
		int oldNoiseMargin = noiseMargin;
		noiseMargin = newNoiseMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADSL_MODEM__NOISE_MARGIN, oldNoiseMargin, noiseMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalOutputPower() {
		return totalOutputPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalOutputPower(int newTotalOutputPower) {
		int oldTotalOutputPower = totalOutputPower;
		totalOutputPower = newTotalOutputPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADSL_MODEM__TOTAL_OUTPUT_POWER, oldTotalOutputPower, totalOutputPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.ADSL_MODEM__LINE_ATTENUATION:
				return getLineAttenuation();
			case CimPackage.ADSL_MODEM__LINE_STATE:
				return getLineState();
			case CimPackage.ADSL_MODEM__MAX_DATA_RATE:
				return getMaxDataRate();
			case CimPackage.ADSL_MODEM__NOISE_MARGIN:
				return getNoiseMargin();
			case CimPackage.ADSL_MODEM__TOTAL_OUTPUT_POWER:
				return getTotalOutputPower();
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
			case CimPackage.ADSL_MODEM__LINE_ATTENUATION:
				setLineAttenuation((Integer)newValue);
				return;
			case CimPackage.ADSL_MODEM__LINE_STATE:
				setLineState((EnumLineState)newValue);
				return;
			case CimPackage.ADSL_MODEM__MAX_DATA_RATE:
				setMaxDataRate((Integer)newValue);
				return;
			case CimPackage.ADSL_MODEM__NOISE_MARGIN:
				setNoiseMargin((Integer)newValue);
				return;
			case CimPackage.ADSL_MODEM__TOTAL_OUTPUT_POWER:
				setTotalOutputPower((Integer)newValue);
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
			case CimPackage.ADSL_MODEM__LINE_ATTENUATION:
				setLineAttenuation(LINE_ATTENUATION_EDEFAULT);
				return;
			case CimPackage.ADSL_MODEM__LINE_STATE:
				setLineState(LINE_STATE_EDEFAULT);
				return;
			case CimPackage.ADSL_MODEM__MAX_DATA_RATE:
				setMaxDataRate(MAX_DATA_RATE_EDEFAULT);
				return;
			case CimPackage.ADSL_MODEM__NOISE_MARGIN:
				setNoiseMargin(NOISE_MARGIN_EDEFAULT);
				return;
			case CimPackage.ADSL_MODEM__TOTAL_OUTPUT_POWER:
				setTotalOutputPower(TOTAL_OUTPUT_POWER_EDEFAULT);
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
			case CimPackage.ADSL_MODEM__LINE_ATTENUATION:
				return lineAttenuation != LINE_ATTENUATION_EDEFAULT;
			case CimPackage.ADSL_MODEM__LINE_STATE:
				return lineState != LINE_STATE_EDEFAULT;
			case CimPackage.ADSL_MODEM__MAX_DATA_RATE:
				return maxDataRate != MAX_DATA_RATE_EDEFAULT;
			case CimPackage.ADSL_MODEM__NOISE_MARGIN:
				return noiseMargin != NOISE_MARGIN_EDEFAULT;
			case CimPackage.ADSL_MODEM__TOTAL_OUTPUT_POWER:
				return totalOutputPower != TOTAL_OUTPUT_POWER_EDEFAULT;
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
		result.append(" (lineAttenuation: ");
		result.append(lineAttenuation);
		result.append(", lineState: ");
		result.append(lineState);
		result.append(", maxDataRate: ");
		result.append(maxDataRate);
		result.append(", noiseMargin: ");
		result.append(noiseMargin);
		result.append(", totalOutputPower: ");
		result.append(totalOutputPower);
		result.append(')');
		return result.toString();
	}

} //ADSLModemImpl
