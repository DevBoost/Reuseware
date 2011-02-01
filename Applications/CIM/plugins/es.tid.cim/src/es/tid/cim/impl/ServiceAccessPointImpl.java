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
import es.tid.cim.LANEndpoint;
import es.tid.cim.ProtocolEndpoint;
import es.tid.cim.ServiceAccessPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Access Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ServiceAccessPointImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceAccessPointImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceAccessPointImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceAccessPointImpl#getBindsToLANEndpoint <em>Binds To LAN Endpoint</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceAccessPointImpl#getSAPSAPDependency <em>SAPSAP Dependency</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceAccessPointImpl#getBindsTo <em>Binds To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ServiceAccessPointImpl extends EnabledLogicalElementImpl implements ServiceAccessPoint {
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
	 * The cached value of the '{@link #getBindsToLANEndpoint() <em>Binds To LAN Endpoint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindsToLANEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<LANEndpoint> bindsToLANEndpoint;

	/**
	 * The cached value of the '{@link #getSAPSAPDependency() <em>SAPSAP Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAPSAPDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceAccessPoint> sapsapDependency;

	/**
	 * The cached value of the '{@link #getBindsTo() <em>Binds To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolEndpoint> bindsTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceAccessPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getServiceAccessPoint();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SERVICE_ACCESS_POINT__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SERVICE_ACCESS_POINT__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SERVICE_ACCESS_POINT__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LANEndpoint> getBindsToLANEndpoint() {
		if (bindsToLANEndpoint == null) {
			bindsToLANEndpoint = new EObjectResolvingEList<LANEndpoint>(LANEndpoint.class, this, CimPackage.SERVICE_ACCESS_POINT__BINDS_TO_LAN_ENDPOINT);
		}
		return bindsToLANEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceAccessPoint> getSAPSAPDependency() {
		if (sapsapDependency == null) {
			sapsapDependency = new EObjectResolvingEList<ServiceAccessPoint>(ServiceAccessPoint.class, this, CimPackage.SERVICE_ACCESS_POINT__SAPSAP_DEPENDENCY);
		}
		return sapsapDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolEndpoint> getBindsTo() {
		if (bindsTo == null) {
			bindsTo = new EObjectResolvingEList<ProtocolEndpoint>(ProtocolEndpoint.class, this, CimPackage.SERVICE_ACCESS_POINT__BINDS_TO);
		}
		return bindsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.SERVICE_ACCESS_POINT__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.SERVICE_ACCESS_POINT__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.SERVICE_ACCESS_POINT__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.SERVICE_ACCESS_POINT__BINDS_TO_LAN_ENDPOINT:
				return getBindsToLANEndpoint();
			case CimPackage.SERVICE_ACCESS_POINT__SAPSAP_DEPENDENCY:
				return getSAPSAPDependency();
			case CimPackage.SERVICE_ACCESS_POINT__BINDS_TO:
				return getBindsTo();
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
			case CimPackage.SERVICE_ACCESS_POINT__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.SERVICE_ACCESS_POINT__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.SERVICE_ACCESS_POINT__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.SERVICE_ACCESS_POINT__BINDS_TO_LAN_ENDPOINT:
				getBindsToLANEndpoint().clear();
				getBindsToLANEndpoint().addAll((Collection<? extends LANEndpoint>)newValue);
				return;
			case CimPackage.SERVICE_ACCESS_POINT__SAPSAP_DEPENDENCY:
				getSAPSAPDependency().clear();
				getSAPSAPDependency().addAll((Collection<? extends ServiceAccessPoint>)newValue);
				return;
			case CimPackage.SERVICE_ACCESS_POINT__BINDS_TO:
				getBindsTo().clear();
				getBindsTo().addAll((Collection<? extends ProtocolEndpoint>)newValue);
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
			case CimPackage.SERVICE_ACCESS_POINT__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.SERVICE_ACCESS_POINT__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.SERVICE_ACCESS_POINT__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.SERVICE_ACCESS_POINT__BINDS_TO_LAN_ENDPOINT:
				getBindsToLANEndpoint().clear();
				return;
			case CimPackage.SERVICE_ACCESS_POINT__SAPSAP_DEPENDENCY:
				getSAPSAPDependency().clear();
				return;
			case CimPackage.SERVICE_ACCESS_POINT__BINDS_TO:
				getBindsTo().clear();
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
			case CimPackage.SERVICE_ACCESS_POINT__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.SERVICE_ACCESS_POINT__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.SERVICE_ACCESS_POINT__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.SERVICE_ACCESS_POINT__BINDS_TO_LAN_ENDPOINT:
				return bindsToLANEndpoint != null && !bindsToLANEndpoint.isEmpty();
			case CimPackage.SERVICE_ACCESS_POINT__SAPSAP_DEPENDENCY:
				return sapsapDependency != null && !sapsapDependency.isEmpty();
			case CimPackage.SERVICE_ACCESS_POINT__BINDS_TO:
				return bindsTo != null && !bindsTo.isEmpty();
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
		result.append(", systemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", systemName: ");
		result.append(systemName);
		result.append(')');
		return result.toString();
	}

} //ServiceAccessPointImpl
