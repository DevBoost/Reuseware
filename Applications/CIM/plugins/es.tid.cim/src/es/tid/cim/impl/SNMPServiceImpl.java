/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.ProtocolEndpoint;
import es.tid.cim.SNMPService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SNMP Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.SNMPServiceImpl#getTrapSourceForSNMPService <em>Trap Source For SNMP Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SNMPServiceImpl extends ServiceImpl implements SNMPService {
	/**
	 * The cached value of the '{@link #getTrapSourceForSNMPService() <em>Trap Source For SNMP Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrapSourceForSNMPService()
	 * @generated
	 * @ordered
	 */
	protected ProtocolEndpoint trapSourceForSNMPService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SNMPServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getSNMPService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolEndpoint getTrapSourceForSNMPService() {
		if (trapSourceForSNMPService != null && trapSourceForSNMPService.eIsProxy()) {
			InternalEObject oldTrapSourceForSNMPService = (InternalEObject)trapSourceForSNMPService;
			trapSourceForSNMPService = (ProtocolEndpoint)eResolveProxy(oldTrapSourceForSNMPService);
			if (trapSourceForSNMPService != oldTrapSourceForSNMPService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.SNMP_SERVICE__TRAP_SOURCE_FOR_SNMP_SERVICE, oldTrapSourceForSNMPService, trapSourceForSNMPService));
			}
		}
		return trapSourceForSNMPService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolEndpoint basicGetTrapSourceForSNMPService() {
		return trapSourceForSNMPService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrapSourceForSNMPService(ProtocolEndpoint newTrapSourceForSNMPService) {
		ProtocolEndpoint oldTrapSourceForSNMPService = trapSourceForSNMPService;
		trapSourceForSNMPService = newTrapSourceForSNMPService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SNMP_SERVICE__TRAP_SOURCE_FOR_SNMP_SERVICE, oldTrapSourceForSNMPService, trapSourceForSNMPService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.SNMP_SERVICE__TRAP_SOURCE_FOR_SNMP_SERVICE:
				if (resolve) return getTrapSourceForSNMPService();
				return basicGetTrapSourceForSNMPService();
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
			case CimPackage.SNMP_SERVICE__TRAP_SOURCE_FOR_SNMP_SERVICE:
				setTrapSourceForSNMPService((ProtocolEndpoint)newValue);
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
			case CimPackage.SNMP_SERVICE__TRAP_SOURCE_FOR_SNMP_SERVICE:
				setTrapSourceForSNMPService((ProtocolEndpoint)null);
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
			case CimPackage.SNMP_SERVICE__TRAP_SOURCE_FOR_SNMP_SERVICE:
				return trapSourceForSNMPService != null;
		}
		return super.eIsSet(featureID);
	}

} //SNMPServiceImpl
