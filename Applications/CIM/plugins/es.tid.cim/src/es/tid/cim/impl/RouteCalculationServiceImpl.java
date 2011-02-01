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
import es.tid.cim.IPRoute;
import es.tid.cim.ProtocolEndpoint;
import es.tid.cim.RouteCalculationService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Calculation Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.RouteCalculationServiceImpl#getRouterID <em>Router ID</em>}</li>
 *   <li>{@link es.tid.cim.impl.RouteCalculationServiceImpl#getAlgorithmType <em>Algorithm Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.RouteCalculationServiceImpl#getCalculatesAmong <em>Calculates Among</em>}</li>
 *   <li>{@link es.tid.cim.impl.RouteCalculationServiceImpl#getCalculatedRoutes <em>Calculated Routes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RouteCalculationServiceImpl extends NetworkServiceImpl implements RouteCalculationService {
	/**
	 * The default value of the '{@link #getRouterID() <em>Router ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterID()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouterID() <em>Router ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterID()
	 * @generated
	 * @ordered
	 */
	protected String routerID = ROUTER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithmType() <em>Algorithm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmType()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmType() <em>Algorithm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmType()
	 * @generated
	 * @ordered
	 */
	protected String algorithmType = ALGORITHM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCalculatesAmong() <em>Calculates Among</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatesAmong()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolEndpoint> calculatesAmong;

	/**
	 * The cached value of the '{@link #getCalculatedRoutes() <em>Calculated Routes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatedRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<IPRoute> calculatedRoutes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteCalculationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getRouteCalculationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRouterID() {
		return routerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouterID(String newRouterID) {
		String oldRouterID = routerID;
		routerID = newRouterID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ROUTE_CALCULATION_SERVICE__ROUTER_ID, oldRouterID, routerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithmType() {
		return algorithmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmType(String newAlgorithmType) {
		String oldAlgorithmType = algorithmType;
		algorithmType = newAlgorithmType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ROUTE_CALCULATION_SERVICE__ALGORITHM_TYPE, oldAlgorithmType, algorithmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolEndpoint> getCalculatesAmong() {
		if (calculatesAmong == null) {
			calculatesAmong = new EObjectResolvingEList<ProtocolEndpoint>(ProtocolEndpoint.class, this, CimPackage.ROUTE_CALCULATION_SERVICE__CALCULATES_AMONG);
		}
		return calculatesAmong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPRoute> getCalculatedRoutes() {
		if (calculatedRoutes == null) {
			calculatedRoutes = new EObjectResolvingEList<IPRoute>(IPRoute.class, this, CimPackage.ROUTE_CALCULATION_SERVICE__CALCULATED_ROUTES);
		}
		return calculatedRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.ROUTE_CALCULATION_SERVICE__ROUTER_ID:
				return getRouterID();
			case CimPackage.ROUTE_CALCULATION_SERVICE__ALGORITHM_TYPE:
				return getAlgorithmType();
			case CimPackage.ROUTE_CALCULATION_SERVICE__CALCULATES_AMONG:
				return getCalculatesAmong();
			case CimPackage.ROUTE_CALCULATION_SERVICE__CALCULATED_ROUTES:
				return getCalculatedRoutes();
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
			case CimPackage.ROUTE_CALCULATION_SERVICE__ROUTER_ID:
				setRouterID((String)newValue);
				return;
			case CimPackage.ROUTE_CALCULATION_SERVICE__ALGORITHM_TYPE:
				setAlgorithmType((String)newValue);
				return;
			case CimPackage.ROUTE_CALCULATION_SERVICE__CALCULATES_AMONG:
				getCalculatesAmong().clear();
				getCalculatesAmong().addAll((Collection<? extends ProtocolEndpoint>)newValue);
				return;
			case CimPackage.ROUTE_CALCULATION_SERVICE__CALCULATED_ROUTES:
				getCalculatedRoutes().clear();
				getCalculatedRoutes().addAll((Collection<? extends IPRoute>)newValue);
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
			case CimPackage.ROUTE_CALCULATION_SERVICE__ROUTER_ID:
				setRouterID(ROUTER_ID_EDEFAULT);
				return;
			case CimPackage.ROUTE_CALCULATION_SERVICE__ALGORITHM_TYPE:
				setAlgorithmType(ALGORITHM_TYPE_EDEFAULT);
				return;
			case CimPackage.ROUTE_CALCULATION_SERVICE__CALCULATES_AMONG:
				getCalculatesAmong().clear();
				return;
			case CimPackage.ROUTE_CALCULATION_SERVICE__CALCULATED_ROUTES:
				getCalculatedRoutes().clear();
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
			case CimPackage.ROUTE_CALCULATION_SERVICE__ROUTER_ID:
				return ROUTER_ID_EDEFAULT == null ? routerID != null : !ROUTER_ID_EDEFAULT.equals(routerID);
			case CimPackage.ROUTE_CALCULATION_SERVICE__ALGORITHM_TYPE:
				return ALGORITHM_TYPE_EDEFAULT == null ? algorithmType != null : !ALGORITHM_TYPE_EDEFAULT.equals(algorithmType);
			case CimPackage.ROUTE_CALCULATION_SERVICE__CALCULATES_AMONG:
				return calculatesAmong != null && !calculatesAmong.isEmpty();
			case CimPackage.ROUTE_CALCULATION_SERVICE__CALCULATED_ROUTES:
				return calculatedRoutes != null && !calculatedRoutes.isEmpty();
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
		result.append(" (routerID: ");
		result.append(routerID);
		result.append(", algorithmType: ");
		result.append(algorithmType);
		result.append(')');
		return result.toString();
	}

} //RouteCalculationServiceImpl
