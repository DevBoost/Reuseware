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
import es.tid.cim.SNMPCommunityStrings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SNMP Community Strings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.SNMPCommunityStringsImpl#getCommunityString <em>Community String</em>}</li>
 *   <li>{@link es.tid.cim.impl.SNMPCommunityStringsImpl#getTypeOfAccess <em>Type Of Access</em>}</li>
 *   <li>{@link es.tid.cim.impl.SNMPCommunityStringsImpl#getLogicalEntitiesAccessed <em>Logical Entities Accessed</em>}</li>
 *   <li>{@link es.tid.cim.impl.SNMPCommunityStringsImpl#getLogicalEntitiesDescriptions <em>Logical Entities Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SNMPCommunityStringsImpl extends ServiceAccessPointImpl implements SNMPCommunityStrings {
	/**
	 * The default value of the '{@link #getCommunityString() <em>Community String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunityString()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNITY_STRING_EDEFAULT = "";

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
	 * The default value of the '{@link #getTypeOfAccess() <em>Type Of Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_OF_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfAccess() <em>Type Of Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfAccess()
	 * @generated
	 * @ordered
	 */
	protected String typeOfAccess = TYPE_OF_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalEntitiesAccessed() <em>Logical Entities Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalEntitiesAccessed()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGICAL_ENTITIES_ACCESSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalEntitiesAccessed() <em>Logical Entities Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalEntitiesAccessed()
	 * @generated
	 * @ordered
	 */
	protected String logicalEntitiesAccessed = LOGICAL_ENTITIES_ACCESSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalEntitiesDescriptions() <em>Logical Entities Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalEntitiesDescriptions()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGICAL_ENTITIES_DESCRIPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalEntitiesDescriptions() <em>Logical Entities Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalEntitiesDescriptions()
	 * @generated
	 * @ordered
	 */
	protected String logicalEntitiesDescriptions = LOGICAL_ENTITIES_DESCRIPTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SNMPCommunityStringsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getSNMPCommunityStrings();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SNMP_COMMUNITY_STRINGS__COMMUNITY_STRING, oldCommunityString, communityString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeOfAccess() {
		return typeOfAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfAccess(String newTypeOfAccess) {
		String oldTypeOfAccess = typeOfAccess;
		typeOfAccess = newTypeOfAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SNMP_COMMUNITY_STRINGS__TYPE_OF_ACCESS, oldTypeOfAccess, typeOfAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogicalEntitiesAccessed() {
		return logicalEntitiesAccessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalEntitiesAccessed(String newLogicalEntitiesAccessed) {
		String oldLogicalEntitiesAccessed = logicalEntitiesAccessed;
		logicalEntitiesAccessed = newLogicalEntitiesAccessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SNMP_COMMUNITY_STRINGS__LOGICAL_ENTITIES_ACCESSED, oldLogicalEntitiesAccessed, logicalEntitiesAccessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogicalEntitiesDescriptions() {
		return logicalEntitiesDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalEntitiesDescriptions(String newLogicalEntitiesDescriptions) {
		String oldLogicalEntitiesDescriptions = logicalEntitiesDescriptions;
		logicalEntitiesDescriptions = newLogicalEntitiesDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SNMP_COMMUNITY_STRINGS__LOGICAL_ENTITIES_DESCRIPTIONS, oldLogicalEntitiesDescriptions, logicalEntitiesDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.SNMP_COMMUNITY_STRINGS__COMMUNITY_STRING:
				return getCommunityString();
			case CimPackage.SNMP_COMMUNITY_STRINGS__TYPE_OF_ACCESS:
				return getTypeOfAccess();
			case CimPackage.SNMP_COMMUNITY_STRINGS__LOGICAL_ENTITIES_ACCESSED:
				return getLogicalEntitiesAccessed();
			case CimPackage.SNMP_COMMUNITY_STRINGS__LOGICAL_ENTITIES_DESCRIPTIONS:
				return getLogicalEntitiesDescriptions();
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
			case CimPackage.SNMP_COMMUNITY_STRINGS__COMMUNITY_STRING:
				setCommunityString((String)newValue);
				return;
			case CimPackage.SNMP_COMMUNITY_STRINGS__TYPE_OF_ACCESS:
				setTypeOfAccess((String)newValue);
				return;
			case CimPackage.SNMP_COMMUNITY_STRINGS__LOGICAL_ENTITIES_ACCESSED:
				setLogicalEntitiesAccessed((String)newValue);
				return;
			case CimPackage.SNMP_COMMUNITY_STRINGS__LOGICAL_ENTITIES_DESCRIPTIONS:
				setLogicalEntitiesDescriptions((String)newValue);
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
			case CimPackage.SNMP_COMMUNITY_STRINGS__COMMUNITY_STRING:
				setCommunityString(COMMUNITY_STRING_EDEFAULT);
				return;
			case CimPackage.SNMP_COMMUNITY_STRINGS__TYPE_OF_ACCESS:
				setTypeOfAccess(TYPE_OF_ACCESS_EDEFAULT);
				return;
			case CimPackage.SNMP_COMMUNITY_STRINGS__LOGICAL_ENTITIES_ACCESSED:
				setLogicalEntitiesAccessed(LOGICAL_ENTITIES_ACCESSED_EDEFAULT);
				return;
			case CimPackage.SNMP_COMMUNITY_STRINGS__LOGICAL_ENTITIES_DESCRIPTIONS:
				setLogicalEntitiesDescriptions(LOGICAL_ENTITIES_DESCRIPTIONS_EDEFAULT);
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
			case CimPackage.SNMP_COMMUNITY_STRINGS__COMMUNITY_STRING:
				return COMMUNITY_STRING_EDEFAULT == null ? communityString != null : !COMMUNITY_STRING_EDEFAULT.equals(communityString);
			case CimPackage.SNMP_COMMUNITY_STRINGS__TYPE_OF_ACCESS:
				return TYPE_OF_ACCESS_EDEFAULT == null ? typeOfAccess != null : !TYPE_OF_ACCESS_EDEFAULT.equals(typeOfAccess);
			case CimPackage.SNMP_COMMUNITY_STRINGS__LOGICAL_ENTITIES_ACCESSED:
				return LOGICAL_ENTITIES_ACCESSED_EDEFAULT == null ? logicalEntitiesAccessed != null : !LOGICAL_ENTITIES_ACCESSED_EDEFAULT.equals(logicalEntitiesAccessed);
			case CimPackage.SNMP_COMMUNITY_STRINGS__LOGICAL_ENTITIES_DESCRIPTIONS:
				return LOGICAL_ENTITIES_DESCRIPTIONS_EDEFAULT == null ? logicalEntitiesDescriptions != null : !LOGICAL_ENTITIES_DESCRIPTIONS_EDEFAULT.equals(logicalEntitiesDescriptions);
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
		result.append(" (communityString: ");
		result.append(communityString);
		result.append(", typeOfAccess: ");
		result.append(typeOfAccess);
		result.append(", logicalEntitiesAccessed: ");
		result.append(logicalEntitiesAccessed);
		result.append(", logicalEntitiesDescriptions: ");
		result.append(logicalEntitiesDescriptions);
		result.append(')');
		return result.toString();
	}

} //SNMPCommunityStringsImpl
