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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.tid.cim.BGPCluster;
import es.tid.cim.BGPService;
import es.tid.cim.CimPackage;
import es.tid.cim.ComputerSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BGP Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.BGPClusterImpl#getClusterID <em>Cluster ID</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPClusterImpl#getReflectorService <em>Reflector Service</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPClusterImpl#getReflectorClientService <em>Reflector Client Service</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPClusterImpl#getReflectorNonClientService <em>Reflector Non Client Service</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPClusterImpl#getRoutersInBGPCluster <em>Routers In BGP Cluster</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BGPClusterImpl extends CollectionOfMSEsImpl implements BGPCluster {
	/**
	 * The default value of the '{@link #getClusterID() <em>Cluster ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterID()
	 * @generated
	 * @ordered
	 */
	protected static final int CLUSTER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClusterID() <em>Cluster ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterID()
	 * @generated
	 * @ordered
	 */
	protected int clusterID = CLUSTER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReflectorService() <em>Reflector Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectorService()
	 * @generated
	 * @ordered
	 */
	protected EList<BGPService> reflectorService;

	/**
	 * The cached value of the '{@link #getReflectorClientService() <em>Reflector Client Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectorClientService()
	 * @generated
	 * @ordered
	 */
	protected EList<BGPService> reflectorClientService;

	/**
	 * The cached value of the '{@link #getReflectorNonClientService() <em>Reflector Non Client Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectorNonClientService()
	 * @generated
	 * @ordered
	 */
	protected EList<BGPService> reflectorNonClientService;

	/**
	 * The cached value of the '{@link #getRoutersInBGPCluster() <em>Routers In BGP Cluster</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutersInBGPCluster()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputerSystem> routersInBGPCluster;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BGPClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getBGPCluster();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClusterID() {
		return clusterID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClusterID(int newClusterID) {
		int oldClusterID = clusterID;
		clusterID = newClusterID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_CLUSTER__CLUSTER_ID, oldClusterID, clusterID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BGPService> getReflectorService() {
		if (reflectorService == null) {
			reflectorService = new EObjectResolvingEList<BGPService>(BGPService.class, this, CimPackage.BGP_CLUSTER__REFLECTOR_SERVICE);
		}
		return reflectorService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BGPService> getReflectorClientService() {
		if (reflectorClientService == null) {
			reflectorClientService = new EObjectResolvingEList<BGPService>(BGPService.class, this, CimPackage.BGP_CLUSTER__REFLECTOR_CLIENT_SERVICE);
		}
		return reflectorClientService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BGPService> getReflectorNonClientService() {
		if (reflectorNonClientService == null) {
			reflectorNonClientService = new EObjectResolvingEList<BGPService>(BGPService.class, this, CimPackage.BGP_CLUSTER__REFLECTOR_NON_CLIENT_SERVICE);
		}
		return reflectorNonClientService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComputerSystem> getRoutersInBGPCluster() {
		if (routersInBGPCluster == null) {
			routersInBGPCluster = new EObjectContainmentEList<ComputerSystem>(ComputerSystem.class, this, CimPackage.BGP_CLUSTER__ROUTERS_IN_BGP_CLUSTER);
		}
		return routersInBGPCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CimPackage.BGP_CLUSTER__ROUTERS_IN_BGP_CLUSTER:
				return ((InternalEList<?>)getRoutersInBGPCluster()).basicRemove(otherEnd, msgs);
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
			case CimPackage.BGP_CLUSTER__CLUSTER_ID:
				return getClusterID();
			case CimPackage.BGP_CLUSTER__REFLECTOR_SERVICE:
				return getReflectorService();
			case CimPackage.BGP_CLUSTER__REFLECTOR_CLIENT_SERVICE:
				return getReflectorClientService();
			case CimPackage.BGP_CLUSTER__REFLECTOR_NON_CLIENT_SERVICE:
				return getReflectorNonClientService();
			case CimPackage.BGP_CLUSTER__ROUTERS_IN_BGP_CLUSTER:
				return getRoutersInBGPCluster();
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
			case CimPackage.BGP_CLUSTER__CLUSTER_ID:
				setClusterID((Integer)newValue);
				return;
			case CimPackage.BGP_CLUSTER__REFLECTOR_SERVICE:
				getReflectorService().clear();
				getReflectorService().addAll((Collection<? extends BGPService>)newValue);
				return;
			case CimPackage.BGP_CLUSTER__REFLECTOR_CLIENT_SERVICE:
				getReflectorClientService().clear();
				getReflectorClientService().addAll((Collection<? extends BGPService>)newValue);
				return;
			case CimPackage.BGP_CLUSTER__REFLECTOR_NON_CLIENT_SERVICE:
				getReflectorNonClientService().clear();
				getReflectorNonClientService().addAll((Collection<? extends BGPService>)newValue);
				return;
			case CimPackage.BGP_CLUSTER__ROUTERS_IN_BGP_CLUSTER:
				getRoutersInBGPCluster().clear();
				getRoutersInBGPCluster().addAll((Collection<? extends ComputerSystem>)newValue);
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
			case CimPackage.BGP_CLUSTER__CLUSTER_ID:
				setClusterID(CLUSTER_ID_EDEFAULT);
				return;
			case CimPackage.BGP_CLUSTER__REFLECTOR_SERVICE:
				getReflectorService().clear();
				return;
			case CimPackage.BGP_CLUSTER__REFLECTOR_CLIENT_SERVICE:
				getReflectorClientService().clear();
				return;
			case CimPackage.BGP_CLUSTER__REFLECTOR_NON_CLIENT_SERVICE:
				getReflectorNonClientService().clear();
				return;
			case CimPackage.BGP_CLUSTER__ROUTERS_IN_BGP_CLUSTER:
				getRoutersInBGPCluster().clear();
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
			case CimPackage.BGP_CLUSTER__CLUSTER_ID:
				return clusterID != CLUSTER_ID_EDEFAULT;
			case CimPackage.BGP_CLUSTER__REFLECTOR_SERVICE:
				return reflectorService != null && !reflectorService.isEmpty();
			case CimPackage.BGP_CLUSTER__REFLECTOR_CLIENT_SERVICE:
				return reflectorClientService != null && !reflectorClientService.isEmpty();
			case CimPackage.BGP_CLUSTER__REFLECTOR_NON_CLIENT_SERVICE:
				return reflectorNonClientService != null && !reflectorNonClientService.isEmpty();
			case CimPackage.BGP_CLUSTER__ROUTERS_IN_BGP_CLUSTER:
				return routersInBGPCluster != null && !routersInBGPCluster.isEmpty();
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
		result.append(" (clusterID: ");
		result.append(clusterID);
		result.append(')');
		return result.toString();
	}

} //BGPClusterImpl
