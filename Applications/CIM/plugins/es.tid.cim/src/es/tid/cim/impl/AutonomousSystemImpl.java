/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.tid.cim.AutonomousSystem;
import es.tid.cim.BGPProtocolEndpoint;
import es.tid.cim.CimPackage;
import es.tid.cim.ComputerSystem;
import es.tid.cim.RoutingProtocolDomain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Autonomous System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.AutonomousSystemImpl#getASNumber <em>AS Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.AutonomousSystemImpl#isIsSingleHomed <em>Is Single Homed</em>}</li>
 *   <li>{@link es.tid.cim.impl.AutonomousSystemImpl#isIsTransit <em>Is Transit</em>}</li>
 *   <li>{@link es.tid.cim.impl.AutonomousSystemImpl#isRequireIGPSync <em>Require IGP Sync</em>}</li>
 *   <li>{@link es.tid.cim.impl.AutonomousSystemImpl#getRoutingUpdateSource <em>Routing Update Source</em>}</li>
 *   <li>{@link es.tid.cim.impl.AutonomousSystemImpl#getAggregationType <em>Aggregation Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.AutonomousSystemImpl#getRouterInAS <em>Router In AS</em>}</li>
 *   <li>{@link es.tid.cim.impl.AutonomousSystemImpl#getASBGPEndpoints <em>ASBGP Endpoints</em>}</li>
 *   <li>{@link es.tid.cim.impl.AutonomousSystemImpl#getRoutingProtocolDomainInAS <em>Routing Protocol Domain In AS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutonomousSystemImpl extends AdminDomainImpl implements AutonomousSystem {
	/**
	 * The default value of the '{@link #getASNumber() <em>AS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int AS_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getASNumber() <em>AS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASNumber()
	 * @generated
	 * @ordered
	 */
	protected int asNumber = AS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSingleHomed() <em>Is Single Homed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleHomed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGLE_HOMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSingleHomed() <em>Is Single Homed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleHomed()
	 * @generated
	 * @ordered
	 */
	protected boolean isSingleHomed = IS_SINGLE_HOMED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTransit() <em>Is Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTransit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRANSIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTransit() <em>Is Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTransit()
	 * @generated
	 * @ordered
	 */
	protected boolean isTransit = IS_TRANSIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequireIGPSync() <em>Require IGP Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireIGPSync()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_IGP_SYNC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireIGPSync() <em>Require IGP Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireIGPSync()
	 * @generated
	 * @ordered
	 */
	protected boolean requireIGPSync = REQUIRE_IGP_SYNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoutingUpdateSource() <em>Routing Update Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingUpdateSource()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTING_UPDATE_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoutingUpdateSource() <em>Routing Update Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingUpdateSource()
	 * @generated
	 * @ordered
	 */
	protected String routingUpdateSource = ROUTING_UPDATE_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationType() <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationType()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationType() <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationType()
	 * @generated
	 * @ordered
	 */
	protected String aggregationType = AGGREGATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRouterInAS() <em>Router In AS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterInAS()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputerSystem> routerInAS;

	/**
	 * The cached value of the '{@link #getASBGPEndpoints() <em>ASBGP Endpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASBGPEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<BGPProtocolEndpoint> asbgpEndpoints;

	/**
	 * The cached value of the '{@link #getRoutingProtocolDomainInAS() <em>Routing Protocol Domain In AS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingProtocolDomainInAS()
	 * @generated
	 * @ordered
	 */
	protected EList<RoutingProtocolDomain> routingProtocolDomainInAS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutonomousSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getAutonomousSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getASNumber() {
		return asNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setASNumber(int newASNumber) {
		int oldASNumber = asNumber;
		asNumber = newASNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.AUTONOMOUS_SYSTEM__AS_NUMBER, oldASNumber, asNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSingleHomed() {
		return isSingleHomed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSingleHomed(boolean newIsSingleHomed) {
		boolean oldIsSingleHomed = isSingleHomed;
		isSingleHomed = newIsSingleHomed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.AUTONOMOUS_SYSTEM__IS_SINGLE_HOMED, oldIsSingleHomed, isSingleHomed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTransit() {
		return isTransit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTransit(boolean newIsTransit) {
		boolean oldIsTransit = isTransit;
		isTransit = newIsTransit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.AUTONOMOUS_SYSTEM__IS_TRANSIT, oldIsTransit, isTransit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequireIGPSync() {
		return requireIGPSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireIGPSync(boolean newRequireIGPSync) {
		boolean oldRequireIGPSync = requireIGPSync;
		requireIGPSync = newRequireIGPSync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.AUTONOMOUS_SYSTEM__REQUIRE_IGP_SYNC, oldRequireIGPSync, requireIGPSync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoutingUpdateSource() {
		return routingUpdateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingUpdateSource(String newRoutingUpdateSource) {
		String oldRoutingUpdateSource = routingUpdateSource;
		routingUpdateSource = newRoutingUpdateSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.AUTONOMOUS_SYSTEM__ROUTING_UPDATE_SOURCE, oldRoutingUpdateSource, routingUpdateSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAggregationType() {
		return aggregationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationType(String newAggregationType) {
		String oldAggregationType = aggregationType;
		aggregationType = newAggregationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.AUTONOMOUS_SYSTEM__AGGREGATION_TYPE, oldAggregationType, aggregationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComputerSystem> getRouterInAS() {
		if (routerInAS == null) {
			routerInAS = new EObjectContainmentEList<ComputerSystem>(ComputerSystem.class, this, CimPackage.AUTONOMOUS_SYSTEM__ROUTER_IN_AS);
		}
		return routerInAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BGPProtocolEndpoint> getASBGPEndpoints() {
		if (asbgpEndpoints == null) {
			asbgpEndpoints = new EObjectContainmentEList<BGPProtocolEndpoint>(BGPProtocolEndpoint.class, this, CimPackage.AUTONOMOUS_SYSTEM__ASBGP_ENDPOINTS);
		}
		return asbgpEndpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoutingProtocolDomain> getRoutingProtocolDomainInAS() {
		if (routingProtocolDomainInAS == null) {
			routingProtocolDomainInAS = new EObjectContainmentEList<RoutingProtocolDomain>(RoutingProtocolDomain.class, this, CimPackage.AUTONOMOUS_SYSTEM__ROUTING_PROTOCOL_DOMAIN_IN_AS);
		}
		return routingProtocolDomainInAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTER_IN_AS:
				return ((InternalEList<?>)getRouterInAS()).basicRemove(otherEnd, msgs);
			case CimPackage.AUTONOMOUS_SYSTEM__ASBGP_ENDPOINTS:
				return ((InternalEList<?>)getASBGPEndpoints()).basicRemove(otherEnd, msgs);
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTING_PROTOCOL_DOMAIN_IN_AS:
				return ((InternalEList<?>)getRoutingProtocolDomainInAS()).basicRemove(otherEnd, msgs);
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
			case CimPackage.AUTONOMOUS_SYSTEM__AS_NUMBER:
				return getASNumber();
			case CimPackage.AUTONOMOUS_SYSTEM__IS_SINGLE_HOMED:
				return isIsSingleHomed();
			case CimPackage.AUTONOMOUS_SYSTEM__IS_TRANSIT:
				return isIsTransit();
			case CimPackage.AUTONOMOUS_SYSTEM__REQUIRE_IGP_SYNC:
				return isRequireIGPSync();
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTING_UPDATE_SOURCE:
				return getRoutingUpdateSource();
			case CimPackage.AUTONOMOUS_SYSTEM__AGGREGATION_TYPE:
				return getAggregationType();
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTER_IN_AS:
				return getRouterInAS();
			case CimPackage.AUTONOMOUS_SYSTEM__ASBGP_ENDPOINTS:
				return getASBGPEndpoints();
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTING_PROTOCOL_DOMAIN_IN_AS:
				return getRoutingProtocolDomainInAS();
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
			case CimPackage.AUTONOMOUS_SYSTEM__AS_NUMBER:
				setASNumber((Integer)newValue);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__IS_SINGLE_HOMED:
				setIsSingleHomed((Boolean)newValue);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__IS_TRANSIT:
				setIsTransit((Boolean)newValue);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__REQUIRE_IGP_SYNC:
				setRequireIGPSync((Boolean)newValue);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTING_UPDATE_SOURCE:
				setRoutingUpdateSource((String)newValue);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__AGGREGATION_TYPE:
				setAggregationType((String)newValue);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTER_IN_AS:
				getRouterInAS().clear();
				getRouterInAS().addAll((Collection<? extends ComputerSystem>)newValue);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__ASBGP_ENDPOINTS:
				getASBGPEndpoints().clear();
				getASBGPEndpoints().addAll((Collection<? extends BGPProtocolEndpoint>)newValue);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTING_PROTOCOL_DOMAIN_IN_AS:
				getRoutingProtocolDomainInAS().clear();
				getRoutingProtocolDomainInAS().addAll((Collection<? extends RoutingProtocolDomain>)newValue);
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
			case CimPackage.AUTONOMOUS_SYSTEM__AS_NUMBER:
				setASNumber(AS_NUMBER_EDEFAULT);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__IS_SINGLE_HOMED:
				setIsSingleHomed(IS_SINGLE_HOMED_EDEFAULT);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__IS_TRANSIT:
				setIsTransit(IS_TRANSIT_EDEFAULT);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__REQUIRE_IGP_SYNC:
				setRequireIGPSync(REQUIRE_IGP_SYNC_EDEFAULT);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTING_UPDATE_SOURCE:
				setRoutingUpdateSource(ROUTING_UPDATE_SOURCE_EDEFAULT);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__AGGREGATION_TYPE:
				setAggregationType(AGGREGATION_TYPE_EDEFAULT);
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTER_IN_AS:
				getRouterInAS().clear();
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__ASBGP_ENDPOINTS:
				getASBGPEndpoints().clear();
				return;
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTING_PROTOCOL_DOMAIN_IN_AS:
				getRoutingProtocolDomainInAS().clear();
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
			case CimPackage.AUTONOMOUS_SYSTEM__AS_NUMBER:
				return asNumber != AS_NUMBER_EDEFAULT;
			case CimPackage.AUTONOMOUS_SYSTEM__IS_SINGLE_HOMED:
				return isSingleHomed != IS_SINGLE_HOMED_EDEFAULT;
			case CimPackage.AUTONOMOUS_SYSTEM__IS_TRANSIT:
				return isTransit != IS_TRANSIT_EDEFAULT;
			case CimPackage.AUTONOMOUS_SYSTEM__REQUIRE_IGP_SYNC:
				return requireIGPSync != REQUIRE_IGP_SYNC_EDEFAULT;
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTING_UPDATE_SOURCE:
				return ROUTING_UPDATE_SOURCE_EDEFAULT == null ? routingUpdateSource != null : !ROUTING_UPDATE_SOURCE_EDEFAULT.equals(routingUpdateSource);
			case CimPackage.AUTONOMOUS_SYSTEM__AGGREGATION_TYPE:
				return AGGREGATION_TYPE_EDEFAULT == null ? aggregationType != null : !AGGREGATION_TYPE_EDEFAULT.equals(aggregationType);
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTER_IN_AS:
				return routerInAS != null && !routerInAS.isEmpty();
			case CimPackage.AUTONOMOUS_SYSTEM__ASBGP_ENDPOINTS:
				return asbgpEndpoints != null && !asbgpEndpoints.isEmpty();
			case CimPackage.AUTONOMOUS_SYSTEM__ROUTING_PROTOCOL_DOMAIN_IN_AS:
				return routingProtocolDomainInAS != null && !routingProtocolDomainInAS.isEmpty();
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
		result.append(" (ASNumber: ");
		result.append(asNumber);
		result.append(", isSingleHomed: ");
		result.append(isSingleHomed);
		result.append(", isTransit: ");
		result.append(isTransit);
		result.append(", requireIGPSync: ");
		result.append(requireIGPSync);
		result.append(", routingUpdateSource: ");
		result.append(routingUpdateSource);
		result.append(", aggregationType: ");
		result.append(aggregationType);
		result.append(')');
		return result.toString();
	}

} //AutonomousSystemImpl
