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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.tid.cim.AdministrativeDistance;
import es.tid.cim.BGPPeerGroup;
import es.tid.cim.BGPService;
import es.tid.cim.CimPackage;
import es.tid.cim.RoutingPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BGP Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.BGPServiceImpl#getBGPPeerGroupServices <em>BGP Peer Group Services</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPServiceImpl#getBGPVersion <em>BGP Version</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPServiceImpl#getLastErrorCode <em>Last Error Code</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPServiceImpl#getLastMessageErrorSubCode <em>Last Message Error Sub Code</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPServiceImpl#getLastOpenErrorSubCode <em>Last Open Error Sub Code</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPServiceImpl#getLastUpdatedErrorSubCode <em>Last Updated Error Sub Code</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPServiceImpl#getBGPRoutingPolicy <em>BGP Routing Policy</em>}</li>
 *   <li>{@link es.tid.cim.impl.BGPServiceImpl#getBGPAdminDistance <em>BGP Admin Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BGPServiceImpl extends RouteCalculationServiceImpl implements BGPService {
	/**
	 * The cached value of the '{@link #getBGPPeerGroupServices() <em>BGP Peer Group Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPPeerGroupServices()
	 * @generated
	 * @ordered
	 */
	protected EList<BGPPeerGroup> bgpPeerGroupServices;

	/**
	 * The default value of the '{@link #getBGPVersion() <em>BGP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int BGP_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBGPVersion() <em>BGP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPVersion()
	 * @generated
	 * @ordered
	 */
	protected int bgpVersion = BGP_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastErrorCode() <em>Last Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_ERROR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastErrorCode() <em>Last Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastErrorCode()
	 * @generated
	 * @ordered
	 */
	protected String lastErrorCode = LAST_ERROR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastMessageErrorSubCode() <em>Last Message Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMessageErrorSubCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MESSAGE_ERROR_SUB_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastMessageErrorSubCode() <em>Last Message Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMessageErrorSubCode()
	 * @generated
	 * @ordered
	 */
	protected String lastMessageErrorSubCode = LAST_MESSAGE_ERROR_SUB_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastOpenErrorSubCode() <em>Last Open Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOpenErrorSubCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_OPEN_ERROR_SUB_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastOpenErrorSubCode() <em>Last Open Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOpenErrorSubCode()
	 * @generated
	 * @ordered
	 */
	protected String lastOpenErrorSubCode = LAST_OPEN_ERROR_SUB_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdatedErrorSubCode() <em>Last Updated Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedErrorSubCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_UPDATED_ERROR_SUB_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdatedErrorSubCode() <em>Last Updated Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedErrorSubCode()
	 * @generated
	 * @ordered
	 */
	protected String lastUpdatedErrorSubCode = LAST_UPDATED_ERROR_SUB_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBGPRoutingPolicy() <em>BGP Routing Policy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPRoutingPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<RoutingPolicy> bgpRoutingPolicy;

	/**
	 * The cached value of the '{@link #getBGPAdminDistance() <em>BGP Admin Distance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPAdminDistance()
	 * @generated
	 * @ordered
	 */
	protected AdministrativeDistance bgpAdminDistance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BGPServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getBGPService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BGPPeerGroup> getBGPPeerGroupServices() {
		if (bgpPeerGroupServices == null) {
			bgpPeerGroupServices = new EObjectResolvingEList<BGPPeerGroup>(BGPPeerGroup.class, this, CimPackage.BGP_SERVICE__BGP_PEER_GROUP_SERVICES);
		}
		return bgpPeerGroupServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBGPVersion() {
		return bgpVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBGPVersion(int newBGPVersion) {
		int oldBGPVersion = bgpVersion;
		bgpVersion = newBGPVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_SERVICE__BGP_VERSION, oldBGPVersion, bgpVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastErrorCode() {
		return lastErrorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastErrorCode(String newLastErrorCode) {
		String oldLastErrorCode = lastErrorCode;
		lastErrorCode = newLastErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_SERVICE__LAST_ERROR_CODE, oldLastErrorCode, lastErrorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastMessageErrorSubCode() {
		return lastMessageErrorSubCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastMessageErrorSubCode(String newLastMessageErrorSubCode) {
		String oldLastMessageErrorSubCode = lastMessageErrorSubCode;
		lastMessageErrorSubCode = newLastMessageErrorSubCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_SERVICE__LAST_MESSAGE_ERROR_SUB_CODE, oldLastMessageErrorSubCode, lastMessageErrorSubCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastOpenErrorSubCode() {
		return lastOpenErrorSubCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastOpenErrorSubCode(String newLastOpenErrorSubCode) {
		String oldLastOpenErrorSubCode = lastOpenErrorSubCode;
		lastOpenErrorSubCode = newLastOpenErrorSubCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_SERVICE__LAST_OPEN_ERROR_SUB_CODE, oldLastOpenErrorSubCode, lastOpenErrorSubCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastUpdatedErrorSubCode() {
		return lastUpdatedErrorSubCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdatedErrorSubCode(String newLastUpdatedErrorSubCode) {
		String oldLastUpdatedErrorSubCode = lastUpdatedErrorSubCode;
		lastUpdatedErrorSubCode = newLastUpdatedErrorSubCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_SERVICE__LAST_UPDATED_ERROR_SUB_CODE, oldLastUpdatedErrorSubCode, lastUpdatedErrorSubCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoutingPolicy> getBGPRoutingPolicy() {
		if (bgpRoutingPolicy == null) {
			bgpRoutingPolicy = new EObjectResolvingEList<RoutingPolicy>(RoutingPolicy.class, this, CimPackage.BGP_SERVICE__BGP_ROUTING_POLICY);
		}
		return bgpRoutingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeDistance getBGPAdminDistance() {
		if (bgpAdminDistance != null && bgpAdminDistance.eIsProxy()) {
			InternalEObject oldBGPAdminDistance = (InternalEObject)bgpAdminDistance;
			bgpAdminDistance = (AdministrativeDistance)eResolveProxy(oldBGPAdminDistance);
			if (bgpAdminDistance != oldBGPAdminDistance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.BGP_SERVICE__BGP_ADMIN_DISTANCE, oldBGPAdminDistance, bgpAdminDistance));
			}
		}
		return bgpAdminDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeDistance basicGetBGPAdminDistance() {
		return bgpAdminDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBGPAdminDistance(AdministrativeDistance newBGPAdminDistance) {
		AdministrativeDistance oldBGPAdminDistance = bgpAdminDistance;
		bgpAdminDistance = newBGPAdminDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.BGP_SERVICE__BGP_ADMIN_DISTANCE, oldBGPAdminDistance, bgpAdminDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.BGP_SERVICE__BGP_PEER_GROUP_SERVICES:
				return getBGPPeerGroupServices();
			case CimPackage.BGP_SERVICE__BGP_VERSION:
				return getBGPVersion();
			case CimPackage.BGP_SERVICE__LAST_ERROR_CODE:
				return getLastErrorCode();
			case CimPackage.BGP_SERVICE__LAST_MESSAGE_ERROR_SUB_CODE:
				return getLastMessageErrorSubCode();
			case CimPackage.BGP_SERVICE__LAST_OPEN_ERROR_SUB_CODE:
				return getLastOpenErrorSubCode();
			case CimPackage.BGP_SERVICE__LAST_UPDATED_ERROR_SUB_CODE:
				return getLastUpdatedErrorSubCode();
			case CimPackage.BGP_SERVICE__BGP_ROUTING_POLICY:
				return getBGPRoutingPolicy();
			case CimPackage.BGP_SERVICE__BGP_ADMIN_DISTANCE:
				if (resolve) return getBGPAdminDistance();
				return basicGetBGPAdminDistance();
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
			case CimPackage.BGP_SERVICE__BGP_PEER_GROUP_SERVICES:
				getBGPPeerGroupServices().clear();
				getBGPPeerGroupServices().addAll((Collection<? extends BGPPeerGroup>)newValue);
				return;
			case CimPackage.BGP_SERVICE__BGP_VERSION:
				setBGPVersion((Integer)newValue);
				return;
			case CimPackage.BGP_SERVICE__LAST_ERROR_CODE:
				setLastErrorCode((String)newValue);
				return;
			case CimPackage.BGP_SERVICE__LAST_MESSAGE_ERROR_SUB_CODE:
				setLastMessageErrorSubCode((String)newValue);
				return;
			case CimPackage.BGP_SERVICE__LAST_OPEN_ERROR_SUB_CODE:
				setLastOpenErrorSubCode((String)newValue);
				return;
			case CimPackage.BGP_SERVICE__LAST_UPDATED_ERROR_SUB_CODE:
				setLastUpdatedErrorSubCode((String)newValue);
				return;
			case CimPackage.BGP_SERVICE__BGP_ROUTING_POLICY:
				getBGPRoutingPolicy().clear();
				getBGPRoutingPolicy().addAll((Collection<? extends RoutingPolicy>)newValue);
				return;
			case CimPackage.BGP_SERVICE__BGP_ADMIN_DISTANCE:
				setBGPAdminDistance((AdministrativeDistance)newValue);
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
			case CimPackage.BGP_SERVICE__BGP_PEER_GROUP_SERVICES:
				getBGPPeerGroupServices().clear();
				return;
			case CimPackage.BGP_SERVICE__BGP_VERSION:
				setBGPVersion(BGP_VERSION_EDEFAULT);
				return;
			case CimPackage.BGP_SERVICE__LAST_ERROR_CODE:
				setLastErrorCode(LAST_ERROR_CODE_EDEFAULT);
				return;
			case CimPackage.BGP_SERVICE__LAST_MESSAGE_ERROR_SUB_CODE:
				setLastMessageErrorSubCode(LAST_MESSAGE_ERROR_SUB_CODE_EDEFAULT);
				return;
			case CimPackage.BGP_SERVICE__LAST_OPEN_ERROR_SUB_CODE:
				setLastOpenErrorSubCode(LAST_OPEN_ERROR_SUB_CODE_EDEFAULT);
				return;
			case CimPackage.BGP_SERVICE__LAST_UPDATED_ERROR_SUB_CODE:
				setLastUpdatedErrorSubCode(LAST_UPDATED_ERROR_SUB_CODE_EDEFAULT);
				return;
			case CimPackage.BGP_SERVICE__BGP_ROUTING_POLICY:
				getBGPRoutingPolicy().clear();
				return;
			case CimPackage.BGP_SERVICE__BGP_ADMIN_DISTANCE:
				setBGPAdminDistance((AdministrativeDistance)null);
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
			case CimPackage.BGP_SERVICE__BGP_PEER_GROUP_SERVICES:
				return bgpPeerGroupServices != null && !bgpPeerGroupServices.isEmpty();
			case CimPackage.BGP_SERVICE__BGP_VERSION:
				return bgpVersion != BGP_VERSION_EDEFAULT;
			case CimPackage.BGP_SERVICE__LAST_ERROR_CODE:
				return LAST_ERROR_CODE_EDEFAULT == null ? lastErrorCode != null : !LAST_ERROR_CODE_EDEFAULT.equals(lastErrorCode);
			case CimPackage.BGP_SERVICE__LAST_MESSAGE_ERROR_SUB_CODE:
				return LAST_MESSAGE_ERROR_SUB_CODE_EDEFAULT == null ? lastMessageErrorSubCode != null : !LAST_MESSAGE_ERROR_SUB_CODE_EDEFAULT.equals(lastMessageErrorSubCode);
			case CimPackage.BGP_SERVICE__LAST_OPEN_ERROR_SUB_CODE:
				return LAST_OPEN_ERROR_SUB_CODE_EDEFAULT == null ? lastOpenErrorSubCode != null : !LAST_OPEN_ERROR_SUB_CODE_EDEFAULT.equals(lastOpenErrorSubCode);
			case CimPackage.BGP_SERVICE__LAST_UPDATED_ERROR_SUB_CODE:
				return LAST_UPDATED_ERROR_SUB_CODE_EDEFAULT == null ? lastUpdatedErrorSubCode != null : !LAST_UPDATED_ERROR_SUB_CODE_EDEFAULT.equals(lastUpdatedErrorSubCode);
			case CimPackage.BGP_SERVICE__BGP_ROUTING_POLICY:
				return bgpRoutingPolicy != null && !bgpRoutingPolicy.isEmpty();
			case CimPackage.BGP_SERVICE__BGP_ADMIN_DISTANCE:
				return bgpAdminDistance != null;
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
		result.append(" (BGPVersion: ");
		result.append(bgpVersion);
		result.append(", lastErrorCode: ");
		result.append(lastErrorCode);
		result.append(", lastMessageErrorSubCode: ");
		result.append(lastMessageErrorSubCode);
		result.append(", lastOpenErrorSubCode: ");
		result.append(lastOpenErrorSubCode);
		result.append(", lastUpdatedErrorSubCode: ");
		result.append(lastUpdatedErrorSubCode);
		result.append(')');
		return result.toString();
	}

} //BGPServiceImpl
