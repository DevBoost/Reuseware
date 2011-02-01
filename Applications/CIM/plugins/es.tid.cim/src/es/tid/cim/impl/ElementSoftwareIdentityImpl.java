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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.ElementSoftwareIdentity;
import es.tid.cim.EnumElementSoftwareStatus;
import es.tid.cim.EnumUpgradeCondition;
import es.tid.cim.ManagedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Software Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ElementSoftwareIdentityImpl#getElementSoftwareStatus <em>Element Software Status</em>}</li>
 *   <li>{@link es.tid.cim.impl.ElementSoftwareIdentityImpl#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link es.tid.cim.impl.ElementSoftwareIdentityImpl#getOtherUpgradeCondition <em>Other Upgrade Condition</em>}</li>
 *   <li>{@link es.tid.cim.impl.ElementSoftwareIdentityImpl#getUpgradeCondition <em>Upgrade Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementSoftwareIdentityImpl extends EObjectImpl implements ElementSoftwareIdentity {
	/**
	 * The default value of the '{@link #getElementSoftwareStatus() <em>Element Software Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSoftwareStatus()
	 * @generated
	 * @ordered
	 */
	protected static final EnumElementSoftwareStatus ELEMENT_SOFTWARE_STATUS_EDEFAULT = EnumElementSoftwareStatus.UNKNOWN;

	/**
	 * The cached value of the '{@link #getElementSoftwareStatus() <em>Element Software Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSoftwareStatus()
	 * @generated
	 * @ordered
	 */
	protected EnumElementSoftwareStatus elementSoftwareStatus = ELEMENT_SOFTWARE_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManagedElement() <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedElement()
	 * @generated
	 * @ordered
	 */
	protected ManagedElement managedElement;

	/**
	 * The default value of the '{@link #getOtherUpgradeCondition() <em>Other Upgrade Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUpgradeCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_UPGRADE_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherUpgradeCondition() <em>Other Upgrade Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUpgradeCondition()
	 * @generated
	 * @ordered
	 */
	protected String otherUpgradeCondition = OTHER_UPGRADE_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpgradeCondition() <em>Upgrade Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeCondition()
	 * @generated
	 * @ordered
	 */
	protected static final EnumUpgradeCondition UPGRADE_CONDITION_EDEFAULT = EnumUpgradeCondition.UNKNOWN;

	/**
	 * The cached value of the '{@link #getUpgradeCondition() <em>Upgrade Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeCondition()
	 * @generated
	 * @ordered
	 */
	protected EnumUpgradeCondition upgradeCondition = UPGRADE_CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementSoftwareIdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getElementSoftwareIdentity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumElementSoftwareStatus getElementSoftwareStatus() {
		return elementSoftwareStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementSoftwareStatus(EnumElementSoftwareStatus newElementSoftwareStatus) {
		EnumElementSoftwareStatus oldElementSoftwareStatus = elementSoftwareStatus;
		elementSoftwareStatus = newElementSoftwareStatus == null ? ELEMENT_SOFTWARE_STATUS_EDEFAULT : newElementSoftwareStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ELEMENT_SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_STATUS, oldElementSoftwareStatus, elementSoftwareStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagedElement getManagedElement() {
		if (managedElement != null && managedElement.eIsProxy()) {
			InternalEObject oldManagedElement = (InternalEObject)managedElement;
			managedElement = (ManagedElement)eResolveProxy(oldManagedElement);
			if (managedElement != oldManagedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.ELEMENT_SOFTWARE_IDENTITY__MANAGED_ELEMENT, oldManagedElement, managedElement));
			}
		}
		return managedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagedElement basicGetManagedElement() {
		return managedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagedElement(ManagedElement newManagedElement) {
		ManagedElement oldManagedElement = managedElement;
		managedElement = newManagedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ELEMENT_SOFTWARE_IDENTITY__MANAGED_ELEMENT, oldManagedElement, managedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherUpgradeCondition() {
		return otherUpgradeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherUpgradeCondition(String newOtherUpgradeCondition) {
		String oldOtherUpgradeCondition = otherUpgradeCondition;
		otherUpgradeCondition = newOtherUpgradeCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ELEMENT_SOFTWARE_IDENTITY__OTHER_UPGRADE_CONDITION, oldOtherUpgradeCondition, otherUpgradeCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumUpgradeCondition getUpgradeCondition() {
		return upgradeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpgradeCondition(EnumUpgradeCondition newUpgradeCondition) {
		EnumUpgradeCondition oldUpgradeCondition = upgradeCondition;
		upgradeCondition = newUpgradeCondition == null ? UPGRADE_CONDITION_EDEFAULT : newUpgradeCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ELEMENT_SOFTWARE_IDENTITY__UPGRADE_CONDITION, oldUpgradeCondition, upgradeCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_STATUS:
				return getElementSoftwareStatus();
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__MANAGED_ELEMENT:
				if (resolve) return getManagedElement();
				return basicGetManagedElement();
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__OTHER_UPGRADE_CONDITION:
				return getOtherUpgradeCondition();
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__UPGRADE_CONDITION:
				return getUpgradeCondition();
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
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_STATUS:
				setElementSoftwareStatus((EnumElementSoftwareStatus)newValue);
				return;
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__MANAGED_ELEMENT:
				setManagedElement((ManagedElement)newValue);
				return;
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__OTHER_UPGRADE_CONDITION:
				setOtherUpgradeCondition((String)newValue);
				return;
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__UPGRADE_CONDITION:
				setUpgradeCondition((EnumUpgradeCondition)newValue);
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
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_STATUS:
				setElementSoftwareStatus(ELEMENT_SOFTWARE_STATUS_EDEFAULT);
				return;
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__MANAGED_ELEMENT:
				setManagedElement((ManagedElement)null);
				return;
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__OTHER_UPGRADE_CONDITION:
				setOtherUpgradeCondition(OTHER_UPGRADE_CONDITION_EDEFAULT);
				return;
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__UPGRADE_CONDITION:
				setUpgradeCondition(UPGRADE_CONDITION_EDEFAULT);
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
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__ELEMENT_SOFTWARE_STATUS:
				return elementSoftwareStatus != ELEMENT_SOFTWARE_STATUS_EDEFAULT;
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__MANAGED_ELEMENT:
				return managedElement != null;
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__OTHER_UPGRADE_CONDITION:
				return OTHER_UPGRADE_CONDITION_EDEFAULT == null ? otherUpgradeCondition != null : !OTHER_UPGRADE_CONDITION_EDEFAULT.equals(otherUpgradeCondition);
			case CimPackage.ELEMENT_SOFTWARE_IDENTITY__UPGRADE_CONDITION:
				return upgradeCondition != UPGRADE_CONDITION_EDEFAULT;
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
		result.append(" (elementSoftwareStatus: ");
		result.append(elementSoftwareStatus);
		result.append(", otherUpgradeCondition: ");
		result.append(otherUpgradeCondition);
		result.append(", upgradeCondition: ");
		result.append(upgradeCondition);
		result.append(')');
		return result.toString();
	}

} //ElementSoftwareIdentityImpl
