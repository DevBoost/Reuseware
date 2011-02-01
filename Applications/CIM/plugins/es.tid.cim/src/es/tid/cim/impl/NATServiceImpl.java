/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.tid.cim.CimPackage;
import es.tid.cim.NATService;
import es.tid.cim.ProtocolEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NAT Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.NATServiceImpl#getNATServiceRunningOnEndpoint <em>NAT Service Running On Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NATServiceImpl extends ForwardingServiceImpl implements NATService {
	/**
	 * The cached value of the '{@link #getNATServiceRunningOnEndpoint() <em>NAT Service Running On Endpoint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNATServiceRunningOnEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolEndpoint> natServiceRunningOnEndpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NATServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getNATService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolEndpoint> getNATServiceRunningOnEndpoint() {
		if (natServiceRunningOnEndpoint == null) {
			natServiceRunningOnEndpoint = new EObjectResolvingEList<ProtocolEndpoint>(ProtocolEndpoint.class, this, CimPackage.NAT_SERVICE__NAT_SERVICE_RUNNING_ON_ENDPOINT);
		}
		return natServiceRunningOnEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.NAT_SERVICE__NAT_SERVICE_RUNNING_ON_ENDPOINT:
				return getNATServiceRunningOnEndpoint();
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
			case CimPackage.NAT_SERVICE__NAT_SERVICE_RUNNING_ON_ENDPOINT:
				getNATServiceRunningOnEndpoint().clear();
				getNATServiceRunningOnEndpoint().addAll((Collection<? extends ProtocolEndpoint>)newValue);
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
			case CimPackage.NAT_SERVICE__NAT_SERVICE_RUNNING_ON_ENDPOINT:
				getNATServiceRunningOnEndpoint().clear();
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
			case CimPackage.NAT_SERVICE__NAT_SERVICE_RUNNING_ON_ENDPOINT:
				return natServiceRunningOnEndpoint != null && !natServiceRunningOnEndpoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NATServiceImpl
