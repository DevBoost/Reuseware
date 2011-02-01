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

import es.tid.cim.CimPackage;
import es.tid.cim.LogicalNetwork;
import es.tid.cim.NetworkService;
import es.tid.cim.ProtocolEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.LogicalNetworkImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalNetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalNetworkImpl#getNetworkType <em>Network Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalNetworkImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalNetworkImpl#getInLogicalNetwork <em>In Logical Network</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalNetworkImpl#getLogicalNetworkService <em>Logical Network Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalNetworkImpl extends CollectionOfMSEsImpl implements LogicalNetwork {
	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getNetworkType() <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkType()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkType() <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkType()
	 * @generated
	 * @ordered
	 */
	protected String networkType = NETWORK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherTypeDescription = OTHER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInLogicalNetwork() <em>In Logical Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInLogicalNetwork()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolEndpoint> inLogicalNetwork;

	/**
	 * The cached value of the '{@link #getLogicalNetworkService() <em>Logical Network Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalNetworkService()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkService> logicalNetworkService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getLogicalNetwork();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_NETWORK__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkType() {
		return networkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkType(String newNetworkType) {
		String oldNetworkType = networkType;
		networkType = newNetworkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_NETWORK__NETWORK_TYPE, oldNetworkType, networkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherTypeDescription() {
		return otherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherTypeDescription(String newOtherTypeDescription) {
		String oldOtherTypeDescription = otherTypeDescription;
		otherTypeDescription = newOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_NETWORK__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolEndpoint> getInLogicalNetwork() {
		if (inLogicalNetwork == null) {
			inLogicalNetwork = new EObjectContainmentEList<ProtocolEndpoint>(ProtocolEndpoint.class, this, CimPackage.LOGICAL_NETWORK__IN_LOGICAL_NETWORK);
		}
		return inLogicalNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkService> getLogicalNetworkService() {
		if (logicalNetworkService == null) {
			logicalNetworkService = new EObjectResolvingEList<NetworkService>(NetworkService.class, this, CimPackage.LOGICAL_NETWORK__LOGICAL_NETWORK_SERVICE);
		}
		return logicalNetworkService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CimPackage.LOGICAL_NETWORK__IN_LOGICAL_NETWORK:
				return ((InternalEList<?>)getInLogicalNetwork()).basicRemove(otherEnd, msgs);
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
			case CimPackage.LOGICAL_NETWORK__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.LOGICAL_NETWORK__NAME:
				return getName();
			case CimPackage.LOGICAL_NETWORK__NETWORK_TYPE:
				return getNetworkType();
			case CimPackage.LOGICAL_NETWORK__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
			case CimPackage.LOGICAL_NETWORK__IN_LOGICAL_NETWORK:
				return getInLogicalNetwork();
			case CimPackage.LOGICAL_NETWORK__LOGICAL_NETWORK_SERVICE:
				return getLogicalNetworkService();
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
			case CimPackage.LOGICAL_NETWORK__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.LOGICAL_NETWORK__NAME:
				setName((String)newValue);
				return;
			case CimPackage.LOGICAL_NETWORK__NETWORK_TYPE:
				setNetworkType((String)newValue);
				return;
			case CimPackage.LOGICAL_NETWORK__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
				return;
			case CimPackage.LOGICAL_NETWORK__IN_LOGICAL_NETWORK:
				getInLogicalNetwork().clear();
				getInLogicalNetwork().addAll((Collection<? extends ProtocolEndpoint>)newValue);
				return;
			case CimPackage.LOGICAL_NETWORK__LOGICAL_NETWORK_SERVICE:
				getLogicalNetworkService().clear();
				getLogicalNetworkService().addAll((Collection<? extends NetworkService>)newValue);
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
			case CimPackage.LOGICAL_NETWORK__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.LOGICAL_NETWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.LOGICAL_NETWORK__NETWORK_TYPE:
				setNetworkType(NETWORK_TYPE_EDEFAULT);
				return;
			case CimPackage.LOGICAL_NETWORK__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.LOGICAL_NETWORK__IN_LOGICAL_NETWORK:
				getInLogicalNetwork().clear();
				return;
			case CimPackage.LOGICAL_NETWORK__LOGICAL_NETWORK_SERVICE:
				getLogicalNetworkService().clear();
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
			case CimPackage.LOGICAL_NETWORK__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.LOGICAL_NETWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.LOGICAL_NETWORK__NETWORK_TYPE:
				return NETWORK_TYPE_EDEFAULT == null ? networkType != null : !NETWORK_TYPE_EDEFAULT.equals(networkType);
			case CimPackage.LOGICAL_NETWORK__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
			case CimPackage.LOGICAL_NETWORK__IN_LOGICAL_NETWORK:
				return inLogicalNetwork != null && !inLogicalNetwork.isEmpty();
			case CimPackage.LOGICAL_NETWORK__LOGICAL_NETWORK_SERVICE:
				return logicalNetworkService != null && !logicalNetworkService.isEmpty();
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
		result.append(" (creationClassName: ");
		result.append(creationClassName);
		result.append(", name: ");
		result.append(name);
		result.append(", networkType: ");
		result.append(networkType);
		result.append(", otherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(')');
		return result.toString();
	}

} //LogicalNetworkImpl
