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
import es.tid.cim.PrecedenceService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precedence Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.PrecedenceServiceImpl#getPrecedenceValue <em>Precedence Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrecedenceServiceImpl extends QoSServiceImpl implements PrecedenceService {
	/**
	 * The default value of the '{@link #getPrecedenceValue() <em>Precedence Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedenceValue()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECEDENCE_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecedenceValue() <em>Precedence Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedenceValue()
	 * @generated
	 * @ordered
	 */
	protected int precedenceValue = PRECEDENCE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getPrecedenceService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecedenceValue() {
		return precedenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedenceValue(int newPrecedenceValue) {
		int oldPrecedenceValue = precedenceValue;
		precedenceValue = newPrecedenceValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PRECEDENCE_SERVICE__PRECEDENCE_VALUE, oldPrecedenceValue, precedenceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.PRECEDENCE_SERVICE__PRECEDENCE_VALUE:
				return getPrecedenceValue();
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
			case CimPackage.PRECEDENCE_SERVICE__PRECEDENCE_VALUE:
				setPrecedenceValue((Integer)newValue);
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
			case CimPackage.PRECEDENCE_SERVICE__PRECEDENCE_VALUE:
				setPrecedenceValue(PRECEDENCE_VALUE_EDEFAULT);
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
			case CimPackage.PRECEDENCE_SERVICE__PRECEDENCE_VALUE:
				return precedenceValue != PRECEDENCE_VALUE_EDEFAULT;
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
		result.append(" (precedenceValue: ");
		result.append(precedenceValue);
		result.append(')');
		return result.toString();
	}

} //PrecedenceServiceImpl
