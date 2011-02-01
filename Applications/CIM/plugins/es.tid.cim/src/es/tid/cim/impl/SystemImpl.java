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
import es.tid.cim.EnumNameFormat;
import es.tid.cim.LogicalDevice;
import es.tid.cim.ManagedElement;
import es.tid.cim.NextHopRoute;
import es.tid.cim.Role;
import es.tid.cim.Service;
import es.tid.cim.ServiceAccessPoint;
import es.tid.cim.SystemSpecificCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.SystemImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.SystemImpl#getSystemDevices <em>System Devices</em>}</li>
 *   <li>{@link es.tid.cim.impl.SystemImpl#getSystemComponents <em>System Components</em>}</li>
 *   <li>{@link es.tid.cim.impl.SystemImpl#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link es.tid.cim.impl.SystemImpl#getPrimaryOwnerName <em>Primary Owner Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.SystemImpl#getPrimaryOwnerContact <em>Primary Owner Contact</em>}</li>
 *   <li>{@link es.tid.cim.impl.SystemImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link es.tid.cim.impl.SystemImpl#getHostedServices <em>Hosted Services</em>}</li>
 *   <li>{@link es.tid.cim.impl.SystemImpl#getHostedRoute <em>Hosted Route</em>}</li>
 *   <li>{@link es.tid.cim.impl.SystemImpl#getHostedAccessPoint <em>Hosted Access Point</em>}</li>
 *   <li>{@link es.tid.cim.impl.SystemImpl#getHostedCollection <em>Hosted Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SystemImpl extends EnabledLogicalElementImpl implements es.tid.cim.System {
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
	 * The cached value of the '{@link #getSystemDevices() <em>System Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalDevice> systemDevices;

	/**
	 * The cached value of the '{@link #getSystemComponents() <em>System Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagedElement> systemComponents;

	/**
	 * The default value of the '{@link #getNameFormat() <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final EnumNameFormat NAME_FORMAT_EDEFAULT = EnumNameFormat.OTHER;

	/**
	 * The cached value of the '{@link #getNameFormat() <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFormat()
	 * @generated
	 * @ordered
	 */
	protected EnumNameFormat nameFormat = NAME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryOwnerName() <em>Primary Owner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOwnerName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_OWNER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryOwnerName() <em>Primary Owner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOwnerName()
	 * @generated
	 * @ordered
	 */
	protected String primaryOwnerName = PRIMARY_OWNER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryOwnerContact() <em>Primary Owner Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOwnerContact()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_OWNER_CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryOwnerContact() <em>Primary Owner Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOwnerContact()
	 * @generated
	 * @ordered
	 */
	protected String primaryOwnerContact = PRIMARY_OWNER_CONTACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getHostedServices() <em>Hosted Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> hostedServices;

	/**
	 * The cached value of the '{@link #getHostedRoute() <em>Hosted Route</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<NextHopRoute> hostedRoute;

	/**
	 * The cached value of the '{@link #getHostedAccessPoint() <em>Hosted Access Point</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedAccessPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceAccessPoint> hostedAccessPoint;

	/**
	 * The cached value of the '{@link #getHostedCollection() <em>Hosted Collection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedCollection()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemSpecificCollection> hostedCollection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getSystem();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SYSTEM__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalDevice> getSystemDevices() {
		if (systemDevices == null) {
			systemDevices = new EObjectResolvingEList<LogicalDevice>(LogicalDevice.class, this, CimPackage.SYSTEM__SYSTEM_DEVICES);
		}
		return systemDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagedElement> getSystemComponents() {
		if (systemComponents == null) {
			systemComponents = new EObjectContainmentEList<ManagedElement>(ManagedElement.class, this, CimPackage.SYSTEM__SYSTEM_COMPONENTS);
		}
		return systemComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumNameFormat getNameFormat() {
		return nameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameFormat(EnumNameFormat newNameFormat) {
		EnumNameFormat oldNameFormat = nameFormat;
		nameFormat = newNameFormat == null ? NAME_FORMAT_EDEFAULT : newNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SYSTEM__NAME_FORMAT, oldNameFormat, nameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryOwnerName() {
		return primaryOwnerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryOwnerName(String newPrimaryOwnerName) {
		String oldPrimaryOwnerName = primaryOwnerName;
		primaryOwnerName = newPrimaryOwnerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SYSTEM__PRIMARY_OWNER_NAME, oldPrimaryOwnerName, primaryOwnerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimaryOwnerContact() {
		return primaryOwnerContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryOwnerContact(String newPrimaryOwnerContact) {
		String oldPrimaryOwnerContact = primaryOwnerContact;
		primaryOwnerContact = newPrimaryOwnerContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SYSTEM__PRIMARY_OWNER_CONTACT, oldPrimaryOwnerContact, primaryOwnerContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, CimPackage.SYSTEM__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getHostedServices() {
		if (hostedServices == null) {
			hostedServices = new EObjectResolvingEList<Service>(Service.class, this, CimPackage.SYSTEM__HOSTED_SERVICES);
		}
		return hostedServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NextHopRoute> getHostedRoute() {
		if (hostedRoute == null) {
			hostedRoute = new EObjectResolvingEList<NextHopRoute>(NextHopRoute.class, this, CimPackage.SYSTEM__HOSTED_ROUTE);
		}
		return hostedRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceAccessPoint> getHostedAccessPoint() {
		if (hostedAccessPoint == null) {
			hostedAccessPoint = new EObjectResolvingEList<ServiceAccessPoint>(ServiceAccessPoint.class, this, CimPackage.SYSTEM__HOSTED_ACCESS_POINT);
		}
		return hostedAccessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemSpecificCollection> getHostedCollection() {
		if (hostedCollection == null) {
			hostedCollection = new EObjectResolvingEList<SystemSpecificCollection>(SystemSpecificCollection.class, this, CimPackage.SYSTEM__HOSTED_COLLECTION);
		}
		return hostedCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CimPackage.SYSTEM__SYSTEM_COMPONENTS:
				return ((InternalEList<?>)getSystemComponents()).basicRemove(otherEnd, msgs);
			case CimPackage.SYSTEM__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case CimPackage.SYSTEM__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.SYSTEM__SYSTEM_DEVICES:
				return getSystemDevices();
			case CimPackage.SYSTEM__SYSTEM_COMPONENTS:
				return getSystemComponents();
			case CimPackage.SYSTEM__NAME_FORMAT:
				return getNameFormat();
			case CimPackage.SYSTEM__PRIMARY_OWNER_NAME:
				return getPrimaryOwnerName();
			case CimPackage.SYSTEM__PRIMARY_OWNER_CONTACT:
				return getPrimaryOwnerContact();
			case CimPackage.SYSTEM__ROLES:
				return getRoles();
			case CimPackage.SYSTEM__HOSTED_SERVICES:
				return getHostedServices();
			case CimPackage.SYSTEM__HOSTED_ROUTE:
				return getHostedRoute();
			case CimPackage.SYSTEM__HOSTED_ACCESS_POINT:
				return getHostedAccessPoint();
			case CimPackage.SYSTEM__HOSTED_COLLECTION:
				return getHostedCollection();
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
			case CimPackage.SYSTEM__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.SYSTEM__SYSTEM_DEVICES:
				getSystemDevices().clear();
				getSystemDevices().addAll((Collection<? extends LogicalDevice>)newValue);
				return;
			case CimPackage.SYSTEM__SYSTEM_COMPONENTS:
				getSystemComponents().clear();
				getSystemComponents().addAll((Collection<? extends ManagedElement>)newValue);
				return;
			case CimPackage.SYSTEM__NAME_FORMAT:
				setNameFormat((EnumNameFormat)newValue);
				return;
			case CimPackage.SYSTEM__PRIMARY_OWNER_NAME:
				setPrimaryOwnerName((String)newValue);
				return;
			case CimPackage.SYSTEM__PRIMARY_OWNER_CONTACT:
				setPrimaryOwnerContact((String)newValue);
				return;
			case CimPackage.SYSTEM__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case CimPackage.SYSTEM__HOSTED_SERVICES:
				getHostedServices().clear();
				getHostedServices().addAll((Collection<? extends Service>)newValue);
				return;
			case CimPackage.SYSTEM__HOSTED_ROUTE:
				getHostedRoute().clear();
				getHostedRoute().addAll((Collection<? extends NextHopRoute>)newValue);
				return;
			case CimPackage.SYSTEM__HOSTED_ACCESS_POINT:
				getHostedAccessPoint().clear();
				getHostedAccessPoint().addAll((Collection<? extends ServiceAccessPoint>)newValue);
				return;
			case CimPackage.SYSTEM__HOSTED_COLLECTION:
				getHostedCollection().clear();
				getHostedCollection().addAll((Collection<? extends SystemSpecificCollection>)newValue);
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
			case CimPackage.SYSTEM__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.SYSTEM__SYSTEM_DEVICES:
				getSystemDevices().clear();
				return;
			case CimPackage.SYSTEM__SYSTEM_COMPONENTS:
				getSystemComponents().clear();
				return;
			case CimPackage.SYSTEM__NAME_FORMAT:
				setNameFormat(NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.SYSTEM__PRIMARY_OWNER_NAME:
				setPrimaryOwnerName(PRIMARY_OWNER_NAME_EDEFAULT);
				return;
			case CimPackage.SYSTEM__PRIMARY_OWNER_CONTACT:
				setPrimaryOwnerContact(PRIMARY_OWNER_CONTACT_EDEFAULT);
				return;
			case CimPackage.SYSTEM__ROLES:
				getRoles().clear();
				return;
			case CimPackage.SYSTEM__HOSTED_SERVICES:
				getHostedServices().clear();
				return;
			case CimPackage.SYSTEM__HOSTED_ROUTE:
				getHostedRoute().clear();
				return;
			case CimPackage.SYSTEM__HOSTED_ACCESS_POINT:
				getHostedAccessPoint().clear();
				return;
			case CimPackage.SYSTEM__HOSTED_COLLECTION:
				getHostedCollection().clear();
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
			case CimPackage.SYSTEM__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.SYSTEM__SYSTEM_DEVICES:
				return systemDevices != null && !systemDevices.isEmpty();
			case CimPackage.SYSTEM__SYSTEM_COMPONENTS:
				return systemComponents != null && !systemComponents.isEmpty();
			case CimPackage.SYSTEM__NAME_FORMAT:
				return nameFormat != NAME_FORMAT_EDEFAULT;
			case CimPackage.SYSTEM__PRIMARY_OWNER_NAME:
				return PRIMARY_OWNER_NAME_EDEFAULT == null ? primaryOwnerName != null : !PRIMARY_OWNER_NAME_EDEFAULT.equals(primaryOwnerName);
			case CimPackage.SYSTEM__PRIMARY_OWNER_CONTACT:
				return PRIMARY_OWNER_CONTACT_EDEFAULT == null ? primaryOwnerContact != null : !PRIMARY_OWNER_CONTACT_EDEFAULT.equals(primaryOwnerContact);
			case CimPackage.SYSTEM__ROLES:
				return roles != null && !roles.isEmpty();
			case CimPackage.SYSTEM__HOSTED_SERVICES:
				return hostedServices != null && !hostedServices.isEmpty();
			case CimPackage.SYSTEM__HOSTED_ROUTE:
				return hostedRoute != null && !hostedRoute.isEmpty();
			case CimPackage.SYSTEM__HOSTED_ACCESS_POINT:
				return hostedAccessPoint != null && !hostedAccessPoint.isEmpty();
			case CimPackage.SYSTEM__HOSTED_COLLECTION:
				return hostedCollection != null && !hostedCollection.isEmpty();
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
		result.append(", nameFormat: ");
		result.append(nameFormat);
		result.append(", primaryOwnerName: ");
		result.append(primaryOwnerName);
		result.append(", primaryOwnerContact: ");
		result.append(primaryOwnerContact);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
