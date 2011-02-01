/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.tid.cim.AdminDomain;
import es.tid.cim.CimPackage;
import es.tid.cim.LogicalNetwork;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.AdminDomainImpl#getContainedDomain <em>Contained Domain</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdminDomainImpl#getNetworksInAdminDomain <em>Networks In Admin Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdminDomainImpl extends SystemImpl implements AdminDomain {
	/**
	 * The cached value of the '{@link #getContainedDomain() <em>Contained Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<AdminDomain> containedDomain;

	/**
	 * The cached value of the '{@link #getNetworksInAdminDomain() <em>Networks In Admin Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworksInAdminDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalNetwork> networksInAdminDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getAdminDomain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdminDomain> getContainedDomain() {
		if (containedDomain == null) {
			containedDomain = new EObjectContainmentEList<AdminDomain>(AdminDomain.class, this, CimPackage.ADMIN_DOMAIN__CONTAINED_DOMAIN);
		}
		return containedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalNetwork> getNetworksInAdminDomain() {
		if (networksInAdminDomain == null) {
			networksInAdminDomain = new EObjectResolvingEList<LogicalNetwork>(LogicalNetwork.class, this, CimPackage.ADMIN_DOMAIN__NETWORKS_IN_ADMIN_DOMAIN);
		}
		return networksInAdminDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CimPackage.ADMIN_DOMAIN__CONTAINED_DOMAIN:
				return ((InternalEList<?>)getContainedDomain()).basicRemove(otherEnd, msgs);
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
			case CimPackage.ADMIN_DOMAIN__CONTAINED_DOMAIN:
				return getContainedDomain();
			case CimPackage.ADMIN_DOMAIN__NETWORKS_IN_ADMIN_DOMAIN:
				return getNetworksInAdminDomain();
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
			case CimPackage.ADMIN_DOMAIN__CONTAINED_DOMAIN:
				getContainedDomain().clear();
				getContainedDomain().addAll((Collection<? extends AdminDomain>)newValue);
				return;
			case CimPackage.ADMIN_DOMAIN__NETWORKS_IN_ADMIN_DOMAIN:
				getNetworksInAdminDomain().clear();
				getNetworksInAdminDomain().addAll((Collection<? extends LogicalNetwork>)newValue);
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
			case CimPackage.ADMIN_DOMAIN__CONTAINED_DOMAIN:
				getContainedDomain().clear();
				return;
			case CimPackage.ADMIN_DOMAIN__NETWORKS_IN_ADMIN_DOMAIN:
				getNetworksInAdminDomain().clear();
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
			case CimPackage.ADMIN_DOMAIN__CONTAINED_DOMAIN:
				return containedDomain != null && !containedDomain.isEmpty();
			case CimPackage.ADMIN_DOMAIN__NETWORKS_IN_ADMIN_DOMAIN:
				return networksInAdminDomain != null && !networksInAdminDomain.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdminDomainImpl
