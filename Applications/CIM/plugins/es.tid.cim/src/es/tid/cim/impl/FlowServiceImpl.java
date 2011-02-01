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
import es.tid.cim.FlowService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.FlowServiceImpl#getFlowID <em>Flow ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowServiceImpl extends QoSServiceImpl implements FlowService {
	/**
	 * The default value of the '{@link #getFlowID() <em>Flow ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowID()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowID() <em>Flow ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowID()
	 * @generated
	 * @ordered
	 */
	protected String flowID = FLOW_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getFlowService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlowID() {
		return flowID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowID(String newFlowID) {
		String oldFlowID = flowID;
		flowID = newFlowID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.FLOW_SERVICE__FLOW_ID, oldFlowID, flowID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.FLOW_SERVICE__FLOW_ID:
				return getFlowID();
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
			case CimPackage.FLOW_SERVICE__FLOW_ID:
				setFlowID((String)newValue);
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
			case CimPackage.FLOW_SERVICE__FLOW_ID:
				setFlowID(FLOW_ID_EDEFAULT);
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
			case CimPackage.FLOW_SERVICE__FLOW_ID:
				return FLOW_ID_EDEFAULT == null ? flowID != null : !FLOW_ID_EDEFAULT.equals(flowID);
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
		result.append(" (flowID: ");
		result.append(flowID);
		result.append(')');
		return result.toString();
	}

} //FlowServiceImpl
