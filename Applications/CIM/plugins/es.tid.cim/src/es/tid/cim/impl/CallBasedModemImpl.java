/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CallBasedModem;
import es.tid.cim.CimPackage;
import es.tid.cim.EnumModulationScheme;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Based Modem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.CallBasedModemImpl#getCallSpeed <em>Call Speed</em>}</li>
 *   <li>{@link es.tid.cim.impl.CallBasedModemImpl#getModulationScheme <em>Modulation Scheme</em>}</li>
 *   <li>{@link es.tid.cim.impl.CallBasedModemImpl#getNumberDialed <em>Number Dialed</em>}</li>
 *   <li>{@link es.tid.cim.impl.CallBasedModemImpl#getOtherModulationDescription <em>Other Modulation Description</em>}</li>
 *   <li>{@link es.tid.cim.impl.CallBasedModemImpl#getModulationSupported <em>Modulation Supported</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CallBasedModemImpl extends ModemImpl implements CallBasedModem {
	/**
	 * The default value of the '{@link #getCallSpeed() <em>Call Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CALL_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallSpeed() <em>Call Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallSpeed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger callSpeed = CALL_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getModulationScheme() <em>Modulation Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationScheme()
	 * @generated
	 * @ordered
	 */
	protected static final EnumModulationScheme MODULATION_SCHEME_EDEFAULT = EnumModulationScheme.V90_ISSUE1_ASYMMETRIC;

	/**
	 * The cached value of the '{@link #getModulationScheme() <em>Modulation Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationScheme()
	 * @generated
	 * @ordered
	 */
	protected EnumModulationScheme modulationScheme = MODULATION_SCHEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberDialed() <em>Number Dialed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberDialed()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_DIALED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberDialed() <em>Number Dialed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberDialed()
	 * @generated
	 * @ordered
	 */
	protected String numberDialed = NUMBER_DIALED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherModulationDescription() <em>Other Modulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherModulationDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_MODULATION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherModulationDescription() <em>Other Modulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherModulationDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherModulationDescription = OTHER_MODULATION_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModulationSupported() <em>Modulation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationSupported()
	 * @generated
	 * @ordered
	 */
	protected static final EnumModulationScheme MODULATION_SUPPORTED_EDEFAULT = EnumModulationScheme.V90_ISSUE1_ASYMMETRIC;

	/**
	 * The cached value of the '{@link #getModulationSupported() <em>Modulation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationSupported()
	 * @generated
	 * @ordered
	 */
	protected EnumModulationScheme modulationSupported = MODULATION_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallBasedModemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCallBasedModem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCallSpeed() {
		return callSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallSpeed(BigInteger newCallSpeed) {
		BigInteger oldCallSpeed = callSpeed;
		callSpeed = newCallSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CALL_BASED_MODEM__CALL_SPEED, oldCallSpeed, callSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumModulationScheme getModulationScheme() {
		return modulationScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulationScheme(EnumModulationScheme newModulationScheme) {
		EnumModulationScheme oldModulationScheme = modulationScheme;
		modulationScheme = newModulationScheme == null ? MODULATION_SCHEME_EDEFAULT : newModulationScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CALL_BASED_MODEM__MODULATION_SCHEME, oldModulationScheme, modulationScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumberDialed() {
		return numberDialed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberDialed(String newNumberDialed) {
		String oldNumberDialed = numberDialed;
		numberDialed = newNumberDialed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CALL_BASED_MODEM__NUMBER_DIALED, oldNumberDialed, numberDialed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherModulationDescription() {
		return otherModulationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherModulationDescription(String newOtherModulationDescription) {
		String oldOtherModulationDescription = otherModulationDescription;
		otherModulationDescription = newOtherModulationDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CALL_BASED_MODEM__OTHER_MODULATION_DESCRIPTION, oldOtherModulationDescription, otherModulationDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumModulationScheme getModulationSupported() {
		return modulationSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulationSupported(EnumModulationScheme newModulationSupported) {
		EnumModulationScheme oldModulationSupported = modulationSupported;
		modulationSupported = newModulationSupported == null ? MODULATION_SUPPORTED_EDEFAULT : newModulationSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CALL_BASED_MODEM__MODULATION_SUPPORTED, oldModulationSupported, modulationSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CALL_BASED_MODEM__CALL_SPEED:
				return getCallSpeed();
			case CimPackage.CALL_BASED_MODEM__MODULATION_SCHEME:
				return getModulationScheme();
			case CimPackage.CALL_BASED_MODEM__NUMBER_DIALED:
				return getNumberDialed();
			case CimPackage.CALL_BASED_MODEM__OTHER_MODULATION_DESCRIPTION:
				return getOtherModulationDescription();
			case CimPackage.CALL_BASED_MODEM__MODULATION_SUPPORTED:
				return getModulationSupported();
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
			case CimPackage.CALL_BASED_MODEM__CALL_SPEED:
				setCallSpeed((BigInteger)newValue);
				return;
			case CimPackage.CALL_BASED_MODEM__MODULATION_SCHEME:
				setModulationScheme((EnumModulationScheme)newValue);
				return;
			case CimPackage.CALL_BASED_MODEM__NUMBER_DIALED:
				setNumberDialed((String)newValue);
				return;
			case CimPackage.CALL_BASED_MODEM__OTHER_MODULATION_DESCRIPTION:
				setOtherModulationDescription((String)newValue);
				return;
			case CimPackage.CALL_BASED_MODEM__MODULATION_SUPPORTED:
				setModulationSupported((EnumModulationScheme)newValue);
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
			case CimPackage.CALL_BASED_MODEM__CALL_SPEED:
				setCallSpeed(CALL_SPEED_EDEFAULT);
				return;
			case CimPackage.CALL_BASED_MODEM__MODULATION_SCHEME:
				setModulationScheme(MODULATION_SCHEME_EDEFAULT);
				return;
			case CimPackage.CALL_BASED_MODEM__NUMBER_DIALED:
				setNumberDialed(NUMBER_DIALED_EDEFAULT);
				return;
			case CimPackage.CALL_BASED_MODEM__OTHER_MODULATION_DESCRIPTION:
				setOtherModulationDescription(OTHER_MODULATION_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CALL_BASED_MODEM__MODULATION_SUPPORTED:
				setModulationSupported(MODULATION_SUPPORTED_EDEFAULT);
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
			case CimPackage.CALL_BASED_MODEM__CALL_SPEED:
				return CALL_SPEED_EDEFAULT == null ? callSpeed != null : !CALL_SPEED_EDEFAULT.equals(callSpeed);
			case CimPackage.CALL_BASED_MODEM__MODULATION_SCHEME:
				return modulationScheme != MODULATION_SCHEME_EDEFAULT;
			case CimPackage.CALL_BASED_MODEM__NUMBER_DIALED:
				return NUMBER_DIALED_EDEFAULT == null ? numberDialed != null : !NUMBER_DIALED_EDEFAULT.equals(numberDialed);
			case CimPackage.CALL_BASED_MODEM__OTHER_MODULATION_DESCRIPTION:
				return OTHER_MODULATION_DESCRIPTION_EDEFAULT == null ? otherModulationDescription != null : !OTHER_MODULATION_DESCRIPTION_EDEFAULT.equals(otherModulationDescription);
			case CimPackage.CALL_BASED_MODEM__MODULATION_SUPPORTED:
				return modulationSupported != MODULATION_SUPPORTED_EDEFAULT;
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
		result.append(" (callSpeed: ");
		result.append(callSpeed);
		result.append(", modulationScheme: ");
		result.append(modulationScheme);
		result.append(", numberDialed: ");
		result.append(numberDialed);
		result.append(", otherModulationDescription: ");
		result.append(otherModulationDescription);
		result.append(", modulationSupported: ");
		result.append(modulationSupported);
		result.append(')');
		return result.toString();
	}

} //CallBasedModemImpl
