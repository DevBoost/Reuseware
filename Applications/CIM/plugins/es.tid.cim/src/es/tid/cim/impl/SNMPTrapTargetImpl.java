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
import es.tid.cim.SNMPTrapTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SNMP Trap Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.SNMPTrapTargetImpl#getNotificationMessage <em>Notification Message</em>}</li>
 *   <li>{@link es.tid.cim.impl.SNMPTrapTargetImpl#getSNMPVersion <em>SNMP Version</em>}</li>
 *   <li>{@link es.tid.cim.impl.SNMPTrapTargetImpl#getCommunityString <em>Community String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SNMPTrapTargetImpl extends RemotePortImpl implements SNMPTrapTarget {
	/**
	 * The default value of the '{@link #getNotificationMessage() <em>Notification Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATION_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotificationMessage() <em>Notification Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationMessage()
	 * @generated
	 * @ordered
	 */
	protected String notificationMessage = NOTIFICATION_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSNMPVersion() <em>SNMP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSNMPVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SNMP_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSNMPVersion() <em>SNMP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSNMPVersion()
	 * @generated
	 * @ordered
	 */
	protected String snmpVersion = SNMP_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunityString() <em>Community String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunityString()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNITY_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunityString() <em>Community String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunityString()
	 * @generated
	 * @ordered
	 */
	protected String communityString = COMMUNITY_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SNMPTrapTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getSNMPTrapTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotificationMessage() {
		return notificationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationMessage(String newNotificationMessage) {
		String oldNotificationMessage = notificationMessage;
		notificationMessage = newNotificationMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SNMP_TRAP_TARGET__NOTIFICATION_MESSAGE, oldNotificationMessage, notificationMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSNMPVersion() {
		return snmpVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSNMPVersion(String newSNMPVersion) {
		String oldSNMPVersion = snmpVersion;
		snmpVersion = newSNMPVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SNMP_TRAP_TARGET__SNMP_VERSION, oldSNMPVersion, snmpVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommunityString() {
		return communityString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunityString(String newCommunityString) {
		String oldCommunityString = communityString;
		communityString = newCommunityString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SNMP_TRAP_TARGET__COMMUNITY_STRING, oldCommunityString, communityString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.SNMP_TRAP_TARGET__NOTIFICATION_MESSAGE:
				return getNotificationMessage();
			case CimPackage.SNMP_TRAP_TARGET__SNMP_VERSION:
				return getSNMPVersion();
			case CimPackage.SNMP_TRAP_TARGET__COMMUNITY_STRING:
				return getCommunityString();
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
			case CimPackage.SNMP_TRAP_TARGET__NOTIFICATION_MESSAGE:
				setNotificationMessage((String)newValue);
				return;
			case CimPackage.SNMP_TRAP_TARGET__SNMP_VERSION:
				setSNMPVersion((String)newValue);
				return;
			case CimPackage.SNMP_TRAP_TARGET__COMMUNITY_STRING:
				setCommunityString((String)newValue);
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
			case CimPackage.SNMP_TRAP_TARGET__NOTIFICATION_MESSAGE:
				setNotificationMessage(NOTIFICATION_MESSAGE_EDEFAULT);
				return;
			case CimPackage.SNMP_TRAP_TARGET__SNMP_VERSION:
				setSNMPVersion(SNMP_VERSION_EDEFAULT);
				return;
			case CimPackage.SNMP_TRAP_TARGET__COMMUNITY_STRING:
				setCommunityString(COMMUNITY_STRING_EDEFAULT);
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
			case CimPackage.SNMP_TRAP_TARGET__NOTIFICATION_MESSAGE:
				return NOTIFICATION_MESSAGE_EDEFAULT == null ? notificationMessage != null : !NOTIFICATION_MESSAGE_EDEFAULT.equals(notificationMessage);
			case CimPackage.SNMP_TRAP_TARGET__SNMP_VERSION:
				return SNMP_VERSION_EDEFAULT == null ? snmpVersion != null : !SNMP_VERSION_EDEFAULT.equals(snmpVersion);
			case CimPackage.SNMP_TRAP_TARGET__COMMUNITY_STRING:
				return COMMUNITY_STRING_EDEFAULT == null ? communityString != null : !COMMUNITY_STRING_EDEFAULT.equals(communityString);
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
		result.append(" (notificationMessage: ");
		result.append(notificationMessage);
		result.append(", SNMPVersion: ");
		result.append(snmpVersion);
		result.append(", communityString: ");
		result.append(communityString);
		result.append(')');
		return result.toString();
	}

} //SNMPTrapTargetImpl
