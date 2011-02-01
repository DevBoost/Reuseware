/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.EnumAvailability;
import es.tid.cim.EnumStatusInfo;
import es.tid.cim.USBPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>USB Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.USBPortImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link es.tid.cim.impl.USBPortImpl#getStatusInfo <em>Status Info</em>}</li>
 *   <li>{@link es.tid.cim.impl.USBPortImpl#isSuspended <em>Suspended</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class USBPortImpl extends LogicalPortImpl implements USBPort {
	/**
	 * The default value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final EnumAvailability AVAILABILITY_EDEFAULT = EnumAvailability.UNKNOWN;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected EnumAvailability availability = AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusInfo() <em>Status Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusInfo()
	 * @generated
	 * @ordered
	 */
	protected static final EnumStatusInfo STATUS_INFO_EDEFAULT = EnumStatusInfo.UNKNOWN;

	/**
	 * The cached value of the '{@link #getStatusInfo() <em>Status Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusInfo()
	 * @generated
	 * @ordered
	 */
	protected EnumStatusInfo statusInfo = STATUS_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #isSuspended() <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspended()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUSPENDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSuspended() <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspended()
	 * @generated
	 * @ordered
	 */
	protected boolean suspended = SUSPENDED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USBPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getUSBPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAvailability getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(EnumAvailability newAvailability) {
		EnumAvailability oldAvailability = availability;
		availability = newAvailability == null ? AVAILABILITY_EDEFAULT : newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.USB_PORT__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumStatusInfo getStatusInfo() {
		return statusInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusInfo(EnumStatusInfo newStatusInfo) {
		EnumStatusInfo oldStatusInfo = statusInfo;
		statusInfo = newStatusInfo == null ? STATUS_INFO_EDEFAULT : newStatusInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.USB_PORT__STATUS_INFO, oldStatusInfo, statusInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuspended() {
		return suspended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuspended(boolean newSuspended) {
		boolean oldSuspended = suspended;
		suspended = newSuspended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.USB_PORT__SUSPENDED, oldSuspended, suspended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.USB_PORT__AVAILABILITY:
				return getAvailability();
			case CimPackage.USB_PORT__STATUS_INFO:
				return getStatusInfo();
			case CimPackage.USB_PORT__SUSPENDED:
				return isSuspended();
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
			case CimPackage.USB_PORT__AVAILABILITY:
				setAvailability((EnumAvailability)newValue);
				return;
			case CimPackage.USB_PORT__STATUS_INFO:
				setStatusInfo((EnumStatusInfo)newValue);
				return;
			case CimPackage.USB_PORT__SUSPENDED:
				setSuspended((Boolean)newValue);
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
			case CimPackage.USB_PORT__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case CimPackage.USB_PORT__STATUS_INFO:
				setStatusInfo(STATUS_INFO_EDEFAULT);
				return;
			case CimPackage.USB_PORT__SUSPENDED:
				setSuspended(SUSPENDED_EDEFAULT);
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
			case CimPackage.USB_PORT__AVAILABILITY:
				return availability != AVAILABILITY_EDEFAULT;
			case CimPackage.USB_PORT__STATUS_INFO:
				return statusInfo != STATUS_INFO_EDEFAULT;
			case CimPackage.USB_PORT__SUSPENDED:
				return suspended != SUSPENDED_EDEFAULT;
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
		result.append(" (availability: ");
		result.append(availability);
		result.append(", statusInfo: ");
		result.append(statusInfo);
		result.append(", suspended: ");
		result.append(suspended);
		result.append(')');
		return result.toString();
	}

} //USBPortImpl
