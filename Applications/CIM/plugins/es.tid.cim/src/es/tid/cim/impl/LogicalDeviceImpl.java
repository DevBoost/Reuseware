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

import es.tid.cim.CimPackage;
import es.tid.cim.LogicalDevice;
import es.tid.cim.LogicalPort;
import es.tid.cim.ServiceAccessPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.LogicalDeviceImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalDeviceImpl#getDeviceId <em>Device Id</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalDeviceImpl#getPortOnDevice <em>Port On Device</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalDeviceImpl#getDeviceSAPImplementation <em>Device SAP Implementation</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalDeviceImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalDeviceImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalDeviceImpl#getDeviceIdentity <em>Device Identity</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalDeviceImpl#getDeviceConnection <em>Device Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LogicalDeviceImpl extends EnabledLogicalElementImpl implements LogicalDevice {
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
	 * The default value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected String deviceId = DEVICE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortOnDevice() <em>Port On Device</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortOnDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalPort> portOnDevice;

	/**
	 * The cached value of the '{@link #getDeviceSAPImplementation() <em>Device SAP Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceSAPImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceAccessPoint> deviceSAPImplementation;

	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeviceIdentity() <em>Device Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceIdentity()
	 * @generated
	 * @ordered
	 */
	protected LogicalDevice deviceIdentity;

	/**
	 * The cached value of the '{@link #getDeviceConnection() <em>Device Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalDevice> deviceConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getLogicalDevice();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_DEVICE__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceId(String newDeviceId) {
		String oldDeviceId = deviceId;
		deviceId = newDeviceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_DEVICE__DEVICE_ID, oldDeviceId, deviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalPort> getPortOnDevice() {
		if (portOnDevice == null) {
			portOnDevice = new EObjectResolvingEList<LogicalPort>(LogicalPort.class, this, CimPackage.LOGICAL_DEVICE__PORT_ON_DEVICE);
		}
		return portOnDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceAccessPoint> getDeviceSAPImplementation() {
		if (deviceSAPImplementation == null) {
			deviceSAPImplementation = new EObjectResolvingEList<ServiceAccessPoint>(ServiceAccessPoint.class, this, CimPackage.LOGICAL_DEVICE__DEVICE_SAP_IMPLEMENTATION);
		}
		return deviceSAPImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_DEVICE__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_DEVICE__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDevice getDeviceIdentity() {
		if (deviceIdentity != null && deviceIdentity.eIsProxy()) {
			InternalEObject oldDeviceIdentity = (InternalEObject)deviceIdentity;
			deviceIdentity = (LogicalDevice)eResolveProxy(oldDeviceIdentity);
			if (deviceIdentity != oldDeviceIdentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.LOGICAL_DEVICE__DEVICE_IDENTITY, oldDeviceIdentity, deviceIdentity));
			}
		}
		return deviceIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDevice basicGetDeviceIdentity() {
		return deviceIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceIdentity(LogicalDevice newDeviceIdentity) {
		LogicalDevice oldDeviceIdentity = deviceIdentity;
		deviceIdentity = newDeviceIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_DEVICE__DEVICE_IDENTITY, oldDeviceIdentity, deviceIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalDevice> getDeviceConnection() {
		if (deviceConnection == null) {
			deviceConnection = new EObjectResolvingEList<LogicalDevice>(LogicalDevice.class, this, CimPackage.LOGICAL_DEVICE__DEVICE_CONNECTION);
		}
		return deviceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.LOGICAL_DEVICE__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.LOGICAL_DEVICE__DEVICE_ID:
				return getDeviceId();
			case CimPackage.LOGICAL_DEVICE__PORT_ON_DEVICE:
				return getPortOnDevice();
			case CimPackage.LOGICAL_DEVICE__DEVICE_SAP_IMPLEMENTATION:
				return getDeviceSAPImplementation();
			case CimPackage.LOGICAL_DEVICE__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.LOGICAL_DEVICE__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.LOGICAL_DEVICE__DEVICE_IDENTITY:
				if (resolve) return getDeviceIdentity();
				return basicGetDeviceIdentity();
			case CimPackage.LOGICAL_DEVICE__DEVICE_CONNECTION:
				return getDeviceConnection();
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
			case CimPackage.LOGICAL_DEVICE__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.LOGICAL_DEVICE__DEVICE_ID:
				setDeviceId((String)newValue);
				return;
			case CimPackage.LOGICAL_DEVICE__PORT_ON_DEVICE:
				getPortOnDevice().clear();
				getPortOnDevice().addAll((Collection<? extends LogicalPort>)newValue);
				return;
			case CimPackage.LOGICAL_DEVICE__DEVICE_SAP_IMPLEMENTATION:
				getDeviceSAPImplementation().clear();
				getDeviceSAPImplementation().addAll((Collection<? extends ServiceAccessPoint>)newValue);
				return;
			case CimPackage.LOGICAL_DEVICE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.LOGICAL_DEVICE__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.LOGICAL_DEVICE__DEVICE_IDENTITY:
				setDeviceIdentity((LogicalDevice)newValue);
				return;
			case CimPackage.LOGICAL_DEVICE__DEVICE_CONNECTION:
				getDeviceConnection().clear();
				getDeviceConnection().addAll((Collection<? extends LogicalDevice>)newValue);
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
			case CimPackage.LOGICAL_DEVICE__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.LOGICAL_DEVICE__DEVICE_ID:
				setDeviceId(DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.LOGICAL_DEVICE__PORT_ON_DEVICE:
				getPortOnDevice().clear();
				return;
			case CimPackage.LOGICAL_DEVICE__DEVICE_SAP_IMPLEMENTATION:
				getDeviceSAPImplementation().clear();
				return;
			case CimPackage.LOGICAL_DEVICE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.LOGICAL_DEVICE__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.LOGICAL_DEVICE__DEVICE_IDENTITY:
				setDeviceIdentity((LogicalDevice)null);
				return;
			case CimPackage.LOGICAL_DEVICE__DEVICE_CONNECTION:
				getDeviceConnection().clear();
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
			case CimPackage.LOGICAL_DEVICE__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.LOGICAL_DEVICE__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? deviceId != null : !DEVICE_ID_EDEFAULT.equals(deviceId);
			case CimPackage.LOGICAL_DEVICE__PORT_ON_DEVICE:
				return portOnDevice != null && !portOnDevice.isEmpty();
			case CimPackage.LOGICAL_DEVICE__DEVICE_SAP_IMPLEMENTATION:
				return deviceSAPImplementation != null && !deviceSAPImplementation.isEmpty();
			case CimPackage.LOGICAL_DEVICE__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.LOGICAL_DEVICE__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.LOGICAL_DEVICE__DEVICE_IDENTITY:
				return deviceIdentity != null;
			case CimPackage.LOGICAL_DEVICE__DEVICE_CONNECTION:
				return deviceConnection != null && !deviceConnection.isEmpty();
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
		result.append(", deviceId: ");
		result.append(deviceId);
		result.append(", systemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", systemName: ");
		result.append(systemName);
		result.append(')');
		return result.toString();
	}

} //LogicalDeviceImpl
