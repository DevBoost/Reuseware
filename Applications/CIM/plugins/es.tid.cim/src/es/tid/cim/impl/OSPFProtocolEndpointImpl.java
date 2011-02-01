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
import es.tid.cim.OSPFProtocolEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSPF Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.OSPFProtocolEndpointImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link es.tid.cim.impl.OSPFProtocolEndpointImpl#getPollInterval <em>Poll Interval</em>}</li>
 *   <li>{@link es.tid.cim.impl.OSPFProtocolEndpointImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link es.tid.cim.impl.OSPFProtocolEndpointImpl#isIfDemand <em>If Demand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSPFProtocolEndpointImpl extends OSPFProtocolEndpointBaseImpl implements OSPFProtocolEndpoint {
	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollInterval() <em>Poll Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int POLL_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPollInterval() <em>Poll Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollInterval()
	 * @generated
	 * @ordered
	 */
	protected int pollInterval = POLL_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected int cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #isIfDemand() <em>If Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfDemand()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IF_DEMAND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIfDemand() <em>If Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfDemand()
	 * @generated
	 * @ordered
	 */
	protected boolean ifDemand = IF_DEMAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSPFProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getOSPFProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OSPF_PROTOCOL_ENDPOINT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPollInterval() {
		return pollInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollInterval(int newPollInterval) {
		int oldPollInterval = pollInterval;
		pollInterval = newPollInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OSPF_PROTOCOL_ENDPOINT__POLL_INTERVAL, oldPollInterval, pollInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(int newCost) {
		int oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OSPF_PROTOCOL_ENDPOINT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIfDemand() {
		return ifDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfDemand(boolean newIfDemand) {
		boolean oldIfDemand = ifDemand;
		ifDemand = newIfDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OSPF_PROTOCOL_ENDPOINT__IF_DEMAND, oldIfDemand, ifDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__PRIORITY:
				return getPriority();
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__POLL_INTERVAL:
				return getPollInterval();
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__COST:
				return getCost();
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__IF_DEMAND:
				return isIfDemand();
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
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__POLL_INTERVAL:
				setPollInterval((Integer)newValue);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__COST:
				setCost((Integer)newValue);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__IF_DEMAND:
				setIfDemand((Boolean)newValue);
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
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__POLL_INTERVAL:
				setPollInterval(POLL_INTERVAL_EDEFAULT);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__COST:
				setCost(COST_EDEFAULT);
				return;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__IF_DEMAND:
				setIfDemand(IF_DEMAND_EDEFAULT);
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
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__POLL_INTERVAL:
				return pollInterval != POLL_INTERVAL_EDEFAULT;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__COST:
				return cost != COST_EDEFAULT;
			case CimPackage.OSPF_PROTOCOL_ENDPOINT__IF_DEMAND:
				return ifDemand != IF_DEMAND_EDEFAULT;
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(", pollInterval: ");
		result.append(pollInterval);
		result.append(", cost: ");
		result.append(cost);
		result.append(", ifDemand: ");
		result.append(ifDemand);
		result.append(')');
		return result.toString();
	}

} //OSPFProtocolEndpointImpl
