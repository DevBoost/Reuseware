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
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.tid.cim.CimPackage;
import es.tid.cim.EnumLogicalModuleType;
import es.tid.cim.LogicalModule;
import es.tid.cim.NetworkPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.LogicalModuleImpl#getModuleNumber <em>Module Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalModuleImpl#getLogicalModuleType <em>Logical Module Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalModuleImpl#getOtherLogicalModuleTypeDescription <em>Other Logical Module Type Description</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalModuleImpl#getModulePort <em>Module Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalModuleImpl extends LogicalDeviceImpl implements LogicalModule {
	/**
	 * The default value of the '{@link #getModuleNumber() <em>Module Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MODULE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getModuleNumber() <em>Module Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleNumber()
	 * @generated
	 * @ordered
	 */
	protected int moduleNumber = MODULE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalModuleType() <em>Logical Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalModuleType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumLogicalModuleType LOGICAL_MODULE_TYPE_EDEFAULT = EnumLogicalModuleType.LINE_CARD;

	/**
	 * The cached value of the '{@link #getLogicalModuleType() <em>Logical Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalModuleType()
	 * @generated
	 * @ordered
	 */
	protected EnumLogicalModuleType logicalModuleType = LOGICAL_MODULE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLogicalModuleTypeDescription() <em>Other Logical Module Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLogicalModuleTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLogicalModuleTypeDescription() <em>Other Logical Module Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLogicalModuleTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherLogicalModuleTypeDescription = OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModulePort() <em>Module Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulePort()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkPort> modulePort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getLogicalModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getModuleNumber() {
		return moduleNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleNumber(int newModuleNumber) {
		int oldModuleNumber = moduleNumber;
		moduleNumber = newModuleNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_MODULE__MODULE_NUMBER, oldModuleNumber, moduleNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLogicalModuleType getLogicalModuleType() {
		return logicalModuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalModuleType(EnumLogicalModuleType newLogicalModuleType) {
		EnumLogicalModuleType oldLogicalModuleType = logicalModuleType;
		logicalModuleType = newLogicalModuleType == null ? LOGICAL_MODULE_TYPE_EDEFAULT : newLogicalModuleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_MODULE__LOGICAL_MODULE_TYPE, oldLogicalModuleType, logicalModuleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherLogicalModuleTypeDescription() {
		return otherLogicalModuleTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherLogicalModuleTypeDescription(String newOtherLogicalModuleTypeDescription) {
		String oldOtherLogicalModuleTypeDescription = otherLogicalModuleTypeDescription;
		otherLogicalModuleTypeDescription = newOtherLogicalModuleTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_MODULE__OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION, oldOtherLogicalModuleTypeDescription, otherLogicalModuleTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkPort> getModulePort() {
		if (modulePort == null) {
			modulePort = new EObjectResolvingEList<NetworkPort>(NetworkPort.class, this, CimPackage.LOGICAL_MODULE__MODULE_PORT);
		}
		return modulePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.LOGICAL_MODULE__MODULE_NUMBER:
				return getModuleNumber();
			case CimPackage.LOGICAL_MODULE__LOGICAL_MODULE_TYPE:
				return getLogicalModuleType();
			case CimPackage.LOGICAL_MODULE__OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION:
				return getOtherLogicalModuleTypeDescription();
			case CimPackage.LOGICAL_MODULE__MODULE_PORT:
				return getModulePort();
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
			case CimPackage.LOGICAL_MODULE__MODULE_NUMBER:
				setModuleNumber((Integer)newValue);
				return;
			case CimPackage.LOGICAL_MODULE__LOGICAL_MODULE_TYPE:
				setLogicalModuleType((EnumLogicalModuleType)newValue);
				return;
			case CimPackage.LOGICAL_MODULE__OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION:
				setOtherLogicalModuleTypeDescription((String)newValue);
				return;
			case CimPackage.LOGICAL_MODULE__MODULE_PORT:
				getModulePort().clear();
				getModulePort().addAll((Collection<? extends NetworkPort>)newValue);
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
			case CimPackage.LOGICAL_MODULE__MODULE_NUMBER:
				setModuleNumber(MODULE_NUMBER_EDEFAULT);
				return;
			case CimPackage.LOGICAL_MODULE__LOGICAL_MODULE_TYPE:
				setLogicalModuleType(LOGICAL_MODULE_TYPE_EDEFAULT);
				return;
			case CimPackage.LOGICAL_MODULE__OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION:
				setOtherLogicalModuleTypeDescription(OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.LOGICAL_MODULE__MODULE_PORT:
				getModulePort().clear();
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
			case CimPackage.LOGICAL_MODULE__MODULE_NUMBER:
				return moduleNumber != MODULE_NUMBER_EDEFAULT;
			case CimPackage.LOGICAL_MODULE__LOGICAL_MODULE_TYPE:
				return logicalModuleType != LOGICAL_MODULE_TYPE_EDEFAULT;
			case CimPackage.LOGICAL_MODULE__OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION:
				return OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION_EDEFAULT == null ? otherLogicalModuleTypeDescription != null : !OTHER_LOGICAL_MODULE_TYPE_DESCRIPTION_EDEFAULT.equals(otherLogicalModuleTypeDescription);
			case CimPackage.LOGICAL_MODULE__MODULE_PORT:
				return modulePort != null && !modulePort.isEmpty();
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
		result.append(" (moduleNumber: ");
		result.append(moduleNumber);
		result.append(", logicalModuleType: ");
		result.append(logicalModuleType);
		result.append(", otherLogicalModuleTypeDescription: ");
		result.append(otherLogicalModuleTypeDescription);
		result.append(')');
		return result.toString();
	}

} //LogicalModuleImpl
