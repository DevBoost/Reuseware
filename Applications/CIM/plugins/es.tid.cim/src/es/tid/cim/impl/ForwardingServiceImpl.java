/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.tid.cim.CimPackage;
import es.tid.cim.ForwardingService;
import es.tid.cim.IPRoute;
import es.tid.cim.NextHopRouting;
import es.tid.cim.ProtocolEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forwarding Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ForwardingServiceImpl#getProtocolType <em>Protocol Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.ForwardingServiceImpl#getOtherProtocolType <em>Other Protocol Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.ForwardingServiceImpl#getForwardsAmong <em>Forwards Among</em>}</li>
 *   <li>{@link es.tid.cim.impl.ForwardingServiceImpl#getRouteForwardedByService <em>Route Forwarded By Service</em>}</li>
 *   <li>{@link es.tid.cim.impl.ForwardingServiceImpl#getForwardedRoutes <em>Forwarded Routes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForwardingServiceImpl extends NetworkServiceImpl implements ForwardingService {
	/**
	 * The default value of the '{@link #getProtocolType() <em>Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolType()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolType() <em>Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolType()
	 * @generated
	 * @ordered
	 */
	protected String protocolType = PROTOCOL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherProtocolType() <em>Other Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocolType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PROTOCOL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherProtocolType() <em>Other Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocolType()
	 * @generated
	 * @ordered
	 */
	protected String otherProtocolType = OTHER_PROTOCOL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForwardsAmong() <em>Forwards Among</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardsAmong()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolEndpoint> forwardsAmong;

	/**
	 * The cached value of the '{@link #getRouteForwardedByService() <em>Route Forwarded By Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteForwardedByService()
	 * @generated
	 * @ordered
	 */
	protected EList<NextHopRouting> routeForwardedByService;

	/**
	 * The cached value of the '{@link #getForwardedRoutes() <em>Forwarded Routes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardedRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<IPRoute> forwardedRoutes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForwardingServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getForwardingService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocolType() {
		return protocolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolType(String newProtocolType) {
		String oldProtocolType = protocolType;
		protocolType = newProtocolType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.FORWARDING_SERVICE__PROTOCOL_TYPE, oldProtocolType, protocolType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherProtocolType() {
		return otherProtocolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherProtocolType(String newOtherProtocolType) {
		String oldOtherProtocolType = otherProtocolType;
		otherProtocolType = newOtherProtocolType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.FORWARDING_SERVICE__OTHER_PROTOCOL_TYPE, oldOtherProtocolType, otherProtocolType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolEndpoint> getForwardsAmong() {
		if (forwardsAmong == null) {
			forwardsAmong = new EObjectResolvingEList<ProtocolEndpoint>(ProtocolEndpoint.class, this, CimPackage.FORWARDING_SERVICE__FORWARDS_AMONG);
		}
		return forwardsAmong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NextHopRouting> getRouteForwardedByService() {
		if (routeForwardedByService == null) {
			routeForwardedByService = new EObjectResolvingEList<NextHopRouting>(NextHopRouting.class, this, CimPackage.FORWARDING_SERVICE__ROUTE_FORWARDED_BY_SERVICE);
		}
		return routeForwardedByService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPRoute> getForwardedRoutes() {
		if (forwardedRoutes == null) {
			forwardedRoutes = new EObjectResolvingEList<IPRoute>(IPRoute.class, this, CimPackage.FORWARDING_SERVICE__FORWARDED_ROUTES);
		}
		return forwardedRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.FORWARDING_SERVICE__PROTOCOL_TYPE:
				return getProtocolType();
			case CimPackage.FORWARDING_SERVICE__OTHER_PROTOCOL_TYPE:
				return getOtherProtocolType();
			case CimPackage.FORWARDING_SERVICE__FORWARDS_AMONG:
				return getForwardsAmong();
			case CimPackage.FORWARDING_SERVICE__ROUTE_FORWARDED_BY_SERVICE:
				return getRouteForwardedByService();
			case CimPackage.FORWARDING_SERVICE__FORWARDED_ROUTES:
				return getForwardedRoutes();
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
			case CimPackage.FORWARDING_SERVICE__PROTOCOL_TYPE:
				setProtocolType((String)newValue);
				return;
			case CimPackage.FORWARDING_SERVICE__OTHER_PROTOCOL_TYPE:
				setOtherProtocolType((String)newValue);
				return;
			case CimPackage.FORWARDING_SERVICE__FORWARDS_AMONG:
				getForwardsAmong().clear();
				getForwardsAmong().addAll((Collection<? extends ProtocolEndpoint>)newValue);
				return;
			case CimPackage.FORWARDING_SERVICE__ROUTE_FORWARDED_BY_SERVICE:
				getRouteForwardedByService().clear();
				getRouteForwardedByService().addAll((Collection<? extends NextHopRouting>)newValue);
				return;
			case CimPackage.FORWARDING_SERVICE__FORWARDED_ROUTES:
				getForwardedRoutes().clear();
				getForwardedRoutes().addAll((Collection<? extends IPRoute>)newValue);
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
			case CimPackage.FORWARDING_SERVICE__PROTOCOL_TYPE:
				setProtocolType(PROTOCOL_TYPE_EDEFAULT);
				return;
			case CimPackage.FORWARDING_SERVICE__OTHER_PROTOCOL_TYPE:
				setOtherProtocolType(OTHER_PROTOCOL_TYPE_EDEFAULT);
				return;
			case CimPackage.FORWARDING_SERVICE__FORWARDS_AMONG:
				getForwardsAmong().clear();
				return;
			case CimPackage.FORWARDING_SERVICE__ROUTE_FORWARDED_BY_SERVICE:
				getRouteForwardedByService().clear();
				return;
			case CimPackage.FORWARDING_SERVICE__FORWARDED_ROUTES:
				getForwardedRoutes().clear();
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
			case CimPackage.FORWARDING_SERVICE__PROTOCOL_TYPE:
				return PROTOCOL_TYPE_EDEFAULT == null ? protocolType != null : !PROTOCOL_TYPE_EDEFAULT.equals(protocolType);
			case CimPackage.FORWARDING_SERVICE__OTHER_PROTOCOL_TYPE:
				return OTHER_PROTOCOL_TYPE_EDEFAULT == null ? otherProtocolType != null : !OTHER_PROTOCOL_TYPE_EDEFAULT.equals(otherProtocolType);
			case CimPackage.FORWARDING_SERVICE__FORWARDS_AMONG:
				return forwardsAmong != null && !forwardsAmong.isEmpty();
			case CimPackage.FORWARDING_SERVICE__ROUTE_FORWARDED_BY_SERVICE:
				return routeForwardedByService != null && !routeForwardedByService.isEmpty();
			case CimPackage.FORWARDING_SERVICE__FORWARDED_ROUTES:
				return forwardedRoutes != null && !forwardedRoutes.isEmpty();
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
		result.append(" (protocolType: ");
		result.append(protocolType);
		result.append(", otherProtocolType: ");
		result.append(otherProtocolType);
		result.append(')');
		return result.toString();
	}

} //ForwardingServiceImpl
