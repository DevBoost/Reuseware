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
import es.tid.cim.Hdr8021PService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hdr8021 PService</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.Hdr8021PServiceImpl#getPriorityValue <em>Priority Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Hdr8021PServiceImpl extends QoSServiceImpl implements Hdr8021PService {
	/**
	 * The default value of the '{@link #getPriorityValue() <em>Priority Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityValue()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriorityValue() <em>Priority Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityValue()
	 * @generated
	 * @ordered
	 */
	protected int priorityValue = PRIORITY_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hdr8021PServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getHdr8021PService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriorityValue() {
		return priorityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorityValue(int newPriorityValue) {
		int oldPriorityValue = priorityValue;
		priorityValue = newPriorityValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.HDR8021_PSERVICE__PRIORITY_VALUE, oldPriorityValue, priorityValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.HDR8021_PSERVICE__PRIORITY_VALUE:
				return getPriorityValue();
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
			case CimPackage.HDR8021_PSERVICE__PRIORITY_VALUE:
				setPriorityValue((Integer)newValue);
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
			case CimPackage.HDR8021_PSERVICE__PRIORITY_VALUE:
				setPriorityValue(PRIORITY_VALUE_EDEFAULT);
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
			case CimPackage.HDR8021_PSERVICE__PRIORITY_VALUE:
				return priorityValue != PRIORITY_VALUE_EDEFAULT;
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
		result.append(" (priorityValue: ");
		result.append(priorityValue);
		result.append(')');
		return result.toString();
	}

} //Hdr8021PServiceImpl
