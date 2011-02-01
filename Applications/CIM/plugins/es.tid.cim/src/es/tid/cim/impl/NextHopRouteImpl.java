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
import es.tid.cim.NextHopRoute;
import es.tid.cim.ProtocolEndpoint;
import es.tid.cim.RemoteServiceAccessPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Next Hop Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.NextHopRouteImpl#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopRouteImpl#getDestinationAddress <em>Destination Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopRouteImpl#getAdminDistance <em>Admin Distance</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopRouteImpl#getRouteMetric <em>Route Metric</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopRouteImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopRouteImpl#getTypeOfRoute <em>Type Of Route</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopRouteImpl#getRouteUsesEndpoint <em>Route Uses Endpoint</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopRouteImpl#getAssociatedNextHop <em>Associated Next Hop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NextHopRouteImpl extends ManagedElementImpl implements NextHopRoute {
	/**
	 * The default value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String instanceID = INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationAddress() <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationAddress() <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected String destinationAddress = DESTINATION_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdminDistance() <em>Admin Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int ADMIN_DISTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAdminDistance() <em>Admin Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminDistance()
	 * @generated
	 * @ordered
	 */
	protected int adminDistance = ADMIN_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouteMetric() <em>Route Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteMetric()
	 * @generated
	 * @ordered
	 */
	protected static final int ROUTE_METRIC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRouteMetric() <em>Route Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteMetric()
	 * @generated
	 * @ordered
	 */
	protected int routeMetric = ROUTE_METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeOfRoute() <em>Type Of Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfRoute()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_OF_ROUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfRoute() <em>Type Of Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfRoute()
	 * @generated
	 * @ordered
	 */
	protected String typeOfRoute = TYPE_OF_ROUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRouteUsesEndpoint() <em>Route Uses Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteUsesEndpoint()
	 * @generated
	 * @ordered
	 */
	protected ProtocolEndpoint routeUsesEndpoint;

	/**
	 * The cached value of the '{@link #getAssociatedNextHop() <em>Associated Next Hop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedNextHop()
	 * @generated
	 * @ordered
	 */
	protected RemoteServiceAccessPoint associatedNextHop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NextHopRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getNextHopRoute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceID() {
		return instanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceID(String newInstanceID) {
		String oldInstanceID = instanceID;
		instanceID = newInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_ROUTE__INSTANCE_ID, oldInstanceID, instanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationAddress(String newDestinationAddress) {
		String oldDestinationAddress = destinationAddress;
		destinationAddress = newDestinationAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_ROUTE__DESTINATION_ADDRESS, oldDestinationAddress, destinationAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAdminDistance() {
		return adminDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminDistance(int newAdminDistance) {
		int oldAdminDistance = adminDistance;
		adminDistance = newAdminDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_ROUTE__ADMIN_DISTANCE, oldAdminDistance, adminDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRouteMetric() {
		return routeMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteMetric(int newRouteMetric) {
		int oldRouteMetric = routeMetric;
		routeMetric = newRouteMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_ROUTE__ROUTE_METRIC, oldRouteMetric, routeMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_ROUTE__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeOfRoute() {
		return typeOfRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfRoute(String newTypeOfRoute) {
		String oldTypeOfRoute = typeOfRoute;
		typeOfRoute = newTypeOfRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_ROUTE__TYPE_OF_ROUTE, oldTypeOfRoute, typeOfRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolEndpoint getRouteUsesEndpoint() {
		if (routeUsesEndpoint != null && routeUsesEndpoint.eIsProxy()) {
			InternalEObject oldRouteUsesEndpoint = (InternalEObject)routeUsesEndpoint;
			routeUsesEndpoint = (ProtocolEndpoint)eResolveProxy(oldRouteUsesEndpoint);
			if (routeUsesEndpoint != oldRouteUsesEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.NEXT_HOP_ROUTE__ROUTE_USES_ENDPOINT, oldRouteUsesEndpoint, routeUsesEndpoint));
			}
		}
		return routeUsesEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolEndpoint basicGetRouteUsesEndpoint() {
		return routeUsesEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteUsesEndpoint(ProtocolEndpoint newRouteUsesEndpoint) {
		ProtocolEndpoint oldRouteUsesEndpoint = routeUsesEndpoint;
		routeUsesEndpoint = newRouteUsesEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_ROUTE__ROUTE_USES_ENDPOINT, oldRouteUsesEndpoint, routeUsesEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteServiceAccessPoint getAssociatedNextHop() {
		if (associatedNextHop != null && associatedNextHop.eIsProxy()) {
			InternalEObject oldAssociatedNextHop = (InternalEObject)associatedNextHop;
			associatedNextHop = (RemoteServiceAccessPoint)eResolveProxy(oldAssociatedNextHop);
			if (associatedNextHop != oldAssociatedNextHop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.NEXT_HOP_ROUTE__ASSOCIATED_NEXT_HOP, oldAssociatedNextHop, associatedNextHop));
			}
		}
		return associatedNextHop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteServiceAccessPoint basicGetAssociatedNextHop() {
		return associatedNextHop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedNextHop(RemoteServiceAccessPoint newAssociatedNextHop) {
		RemoteServiceAccessPoint oldAssociatedNextHop = associatedNextHop;
		associatedNextHop = newAssociatedNextHop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_ROUTE__ASSOCIATED_NEXT_HOP, oldAssociatedNextHop, associatedNextHop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.NEXT_HOP_ROUTE__INSTANCE_ID:
				return getInstanceID();
			case CimPackage.NEXT_HOP_ROUTE__DESTINATION_ADDRESS:
				return getDestinationAddress();
			case CimPackage.NEXT_HOP_ROUTE__ADMIN_DISTANCE:
				return getAdminDistance();
			case CimPackage.NEXT_HOP_ROUTE__ROUTE_METRIC:
				return getRouteMetric();
			case CimPackage.NEXT_HOP_ROUTE__IS_STATIC:
				return isIsStatic();
			case CimPackage.NEXT_HOP_ROUTE__TYPE_OF_ROUTE:
				return getTypeOfRoute();
			case CimPackage.NEXT_HOP_ROUTE__ROUTE_USES_ENDPOINT:
				if (resolve) return getRouteUsesEndpoint();
				return basicGetRouteUsesEndpoint();
			case CimPackage.NEXT_HOP_ROUTE__ASSOCIATED_NEXT_HOP:
				if (resolve) return getAssociatedNextHop();
				return basicGetAssociatedNextHop();
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
			case CimPackage.NEXT_HOP_ROUTE__INSTANCE_ID:
				setInstanceID((String)newValue);
				return;
			case CimPackage.NEXT_HOP_ROUTE__DESTINATION_ADDRESS:
				setDestinationAddress((String)newValue);
				return;
			case CimPackage.NEXT_HOP_ROUTE__ADMIN_DISTANCE:
				setAdminDistance((Integer)newValue);
				return;
			case CimPackage.NEXT_HOP_ROUTE__ROUTE_METRIC:
				setRouteMetric((Integer)newValue);
				return;
			case CimPackage.NEXT_HOP_ROUTE__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case CimPackage.NEXT_HOP_ROUTE__TYPE_OF_ROUTE:
				setTypeOfRoute((String)newValue);
				return;
			case CimPackage.NEXT_HOP_ROUTE__ROUTE_USES_ENDPOINT:
				setRouteUsesEndpoint((ProtocolEndpoint)newValue);
				return;
			case CimPackage.NEXT_HOP_ROUTE__ASSOCIATED_NEXT_HOP:
				setAssociatedNextHop((RemoteServiceAccessPoint)newValue);
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
			case CimPackage.NEXT_HOP_ROUTE__INSTANCE_ID:
				setInstanceID(INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_ROUTE__DESTINATION_ADDRESS:
				setDestinationAddress(DESTINATION_ADDRESS_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_ROUTE__ADMIN_DISTANCE:
				setAdminDistance(ADMIN_DISTANCE_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_ROUTE__ROUTE_METRIC:
				setRouteMetric(ROUTE_METRIC_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_ROUTE__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_ROUTE__TYPE_OF_ROUTE:
				setTypeOfRoute(TYPE_OF_ROUTE_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_ROUTE__ROUTE_USES_ENDPOINT:
				setRouteUsesEndpoint((ProtocolEndpoint)null);
				return;
			case CimPackage.NEXT_HOP_ROUTE__ASSOCIATED_NEXT_HOP:
				setAssociatedNextHop((RemoteServiceAccessPoint)null);
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
			case CimPackage.NEXT_HOP_ROUTE__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceID != null : !INSTANCE_ID_EDEFAULT.equals(instanceID);
			case CimPackage.NEXT_HOP_ROUTE__DESTINATION_ADDRESS:
				return DESTINATION_ADDRESS_EDEFAULT == null ? destinationAddress != null : !DESTINATION_ADDRESS_EDEFAULT.equals(destinationAddress);
			case CimPackage.NEXT_HOP_ROUTE__ADMIN_DISTANCE:
				return adminDistance != ADMIN_DISTANCE_EDEFAULT;
			case CimPackage.NEXT_HOP_ROUTE__ROUTE_METRIC:
				return routeMetric != ROUTE_METRIC_EDEFAULT;
			case CimPackage.NEXT_HOP_ROUTE__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case CimPackage.NEXT_HOP_ROUTE__TYPE_OF_ROUTE:
				return TYPE_OF_ROUTE_EDEFAULT == null ? typeOfRoute != null : !TYPE_OF_ROUTE_EDEFAULT.equals(typeOfRoute);
			case CimPackage.NEXT_HOP_ROUTE__ROUTE_USES_ENDPOINT:
				return routeUsesEndpoint != null;
			case CimPackage.NEXT_HOP_ROUTE__ASSOCIATED_NEXT_HOP:
				return associatedNextHop != null;
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
		result.append(" (instanceID: ");
		result.append(instanceID);
		result.append(", destinationAddress: ");
		result.append(destinationAddress);
		result.append(", adminDistance: ");
		result.append(adminDistance);
		result.append(", routeMetric: ");
		result.append(routeMetric);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", typeOfRoute: ");
		result.append(typeOfRoute);
		result.append(')');
		return result.toString();
	}

} //NextHopRouteImpl
