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

import es.tid.cim.CimPackage;
import es.tid.cim.EnumHealthState;
import es.tid.cim.EnumOperationalStatus;
import es.tid.cim.ManagedSystemElement;
import es.tid.cim.StatusDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Managed System Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ManagedSystemElementImpl#getHealthState <em>Health State</em>}</li>
 *   <li>{@link es.tid.cim.impl.ManagedSystemElementImpl#getInstallDate <em>Install Date</em>}</li>
 *   <li>{@link es.tid.cim.impl.ManagedSystemElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.ManagedSystemElementImpl#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link es.tid.cim.impl.ManagedSystemElementImpl#getStatusDescriptions <em>Status Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ManagedSystemElementImpl extends ManagedElementImpl implements ManagedSystemElement {
	/**
	 * The default value of the '{@link #getHealthState() <em>Health State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthState()
	 * @generated
	 * @ordered
	 */
	protected static final EnumHealthState HEALTH_STATE_EDEFAULT = EnumHealthState.UNKNOWN;

	/**
	 * The cached value of the '{@link #getHealthState() <em>Health State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthState()
	 * @generated
	 * @ordered
	 */
	protected EnumHealthState healthState = HEALTH_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstallDate() <em>Install Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallDate()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstallDate() <em>Install Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallDate()
	 * @generated
	 * @ordered
	 */
	protected String installDate = INSTALL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationalStatus() <em>Operational Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected static final EnumOperationalStatus OPERATIONAL_STATUS_EDEFAULT = EnumOperationalStatus.UNKNOWN;

	/**
	 * The cached value of the '{@link #getOperationalStatus() <em>Operational Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected EnumOperationalStatus operationalStatus = OPERATIONAL_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatusDescriptions() <em>Status Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusDescription> statusDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagedSystemElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getManagedSystemElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumHealthState getHealthState() {
		return healthState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthState(EnumHealthState newHealthState) {
		EnumHealthState oldHealthState = healthState;
		healthState = newHealthState == null ? HEALTH_STATE_EDEFAULT : newHealthState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.MANAGED_SYSTEM_ELEMENT__HEALTH_STATE, oldHealthState, healthState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstallDate() {
		return installDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallDate(String newInstallDate) {
		String oldInstallDate = installDate;
		installDate = newInstallDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.MANAGED_SYSTEM_ELEMENT__INSTALL_DATE, oldInstallDate, installDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.MANAGED_SYSTEM_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumOperationalStatus getOperationalStatus() {
		return operationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalStatus(EnumOperationalStatus newOperationalStatus) {
		EnumOperationalStatus oldOperationalStatus = operationalStatus;
		operationalStatus = newOperationalStatus == null ? OPERATIONAL_STATUS_EDEFAULT : newOperationalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.MANAGED_SYSTEM_ELEMENT__OPERATIONAL_STATUS, oldOperationalStatus, operationalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusDescription> getStatusDescriptions() {
		if (statusDescriptions == null) {
			statusDescriptions = new EObjectContainmentEList<StatusDescription>(StatusDescription.class, this, CimPackage.MANAGED_SYSTEM_ELEMENT__STATUS_DESCRIPTIONS);
		}
		return statusDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CimPackage.MANAGED_SYSTEM_ELEMENT__STATUS_DESCRIPTIONS:
				return ((InternalEList<?>)getStatusDescriptions()).basicRemove(otherEnd, msgs);
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
			case CimPackage.MANAGED_SYSTEM_ELEMENT__HEALTH_STATE:
				return getHealthState();
			case CimPackage.MANAGED_SYSTEM_ELEMENT__INSTALL_DATE:
				return getInstallDate();
			case CimPackage.MANAGED_SYSTEM_ELEMENT__NAME:
				return getName();
			case CimPackage.MANAGED_SYSTEM_ELEMENT__OPERATIONAL_STATUS:
				return getOperationalStatus();
			case CimPackage.MANAGED_SYSTEM_ELEMENT__STATUS_DESCRIPTIONS:
				return getStatusDescriptions();
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
			case CimPackage.MANAGED_SYSTEM_ELEMENT__HEALTH_STATE:
				setHealthState((EnumHealthState)newValue);
				return;
			case CimPackage.MANAGED_SYSTEM_ELEMENT__INSTALL_DATE:
				setInstallDate((String)newValue);
				return;
			case CimPackage.MANAGED_SYSTEM_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case CimPackage.MANAGED_SYSTEM_ELEMENT__OPERATIONAL_STATUS:
				setOperationalStatus((EnumOperationalStatus)newValue);
				return;
			case CimPackage.MANAGED_SYSTEM_ELEMENT__STATUS_DESCRIPTIONS:
				getStatusDescriptions().clear();
				getStatusDescriptions().addAll((Collection<? extends StatusDescription>)newValue);
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
			case CimPackage.MANAGED_SYSTEM_ELEMENT__HEALTH_STATE:
				setHealthState(HEALTH_STATE_EDEFAULT);
				return;
			case CimPackage.MANAGED_SYSTEM_ELEMENT__INSTALL_DATE:
				setInstallDate(INSTALL_DATE_EDEFAULT);
				return;
			case CimPackage.MANAGED_SYSTEM_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.MANAGED_SYSTEM_ELEMENT__OPERATIONAL_STATUS:
				setOperationalStatus(OPERATIONAL_STATUS_EDEFAULT);
				return;
			case CimPackage.MANAGED_SYSTEM_ELEMENT__STATUS_DESCRIPTIONS:
				getStatusDescriptions().clear();
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
			case CimPackage.MANAGED_SYSTEM_ELEMENT__HEALTH_STATE:
				return healthState != HEALTH_STATE_EDEFAULT;
			case CimPackage.MANAGED_SYSTEM_ELEMENT__INSTALL_DATE:
				return INSTALL_DATE_EDEFAULT == null ? installDate != null : !INSTALL_DATE_EDEFAULT.equals(installDate);
			case CimPackage.MANAGED_SYSTEM_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.MANAGED_SYSTEM_ELEMENT__OPERATIONAL_STATUS:
				return operationalStatus != OPERATIONAL_STATUS_EDEFAULT;
			case CimPackage.MANAGED_SYSTEM_ELEMENT__STATUS_DESCRIPTIONS:
				return statusDescriptions != null && !statusDescriptions.isEmpty();
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
		result.append(" (healthState: ");
		result.append(healthState);
		result.append(", installDate: ");
		result.append(installDate);
		result.append(", name: ");
		result.append(name);
		result.append(", operationalStatus: ");
		result.append(operationalStatus);
		result.append(')');
		return result.toString();
	}

} //ManagedSystemElementImpl
