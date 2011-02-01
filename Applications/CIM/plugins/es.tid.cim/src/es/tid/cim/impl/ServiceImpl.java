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
import es.tid.cim.Service;
import es.tid.cim.ServiceAccessPoint;
import es.tid.cim.SoftwareElement;
import es.tid.cim.SoftwareFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ServiceImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceImpl#getPrimaryOwnerName <em>Primary Owner Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceImpl#getPrimaryOwnerContact <em>Primary Owner Contact</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceImpl#isStarted <em>Started</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceImpl#getServiceComponents <em>Service Components</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceImpl#getServiceServiceDependency <em>Service Service Dependency</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceImpl#getSoftwareElementServiceImplementation <em>Software Element Service Implementation</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceImpl#getSoftwareFeatureServiceImplementation <em>Software Feature Service Implementation</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.ServiceImpl#getServiceAccessBySAP <em>Service Access By SAP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ServiceImpl extends EnabledLogicalElementImpl implements Service {
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
	 * The default value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected boolean started = STARTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceComponents() <em>Service Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> serviceComponents;

	/**
	 * The cached value of the '{@link #getServiceServiceDependency() <em>Service Service Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceServiceDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> serviceServiceDependency;

	/**
	 * The cached value of the '{@link #getSoftwareElementServiceImplementation() <em>Software Element Service Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementServiceImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareElement> softwareElementServiceImplementation;

	/**
	 * The cached value of the '{@link #getSoftwareFeatureServiceImplementation() <em>Software Feature Service Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareFeatureServiceImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareFeature> softwareFeatureServiceImplementation;

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
	 * The cached value of the '{@link #getServiceAccessBySAP() <em>Service Access By SAP</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAccessBySAP()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceAccessPoint> serviceAccessBySAP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getService();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SERVICE__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SERVICE__PRIMARY_OWNER_NAME, oldPrimaryOwnerName, primaryOwnerName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SERVICE__PRIMARY_OWNER_CONTACT, oldPrimaryOwnerContact, primaryOwnerContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarted(boolean newStarted) {
		boolean oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SERVICE__STARTED, oldStarted, started));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServiceComponents() {
		if (serviceComponents == null) {
			serviceComponents = new EObjectContainmentEList<Service>(Service.class, this, CimPackage.SERVICE__SERVICE_COMPONENTS);
		}
		return serviceComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServiceServiceDependency() {
		if (serviceServiceDependency == null) {
			serviceServiceDependency = new EObjectResolvingEList<Service>(Service.class, this, CimPackage.SERVICE__SERVICE_SERVICE_DEPENDENCY);
		}
		return serviceServiceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareElement> getSoftwareElementServiceImplementation() {
		if (softwareElementServiceImplementation == null) {
			softwareElementServiceImplementation = new EObjectResolvingEList<SoftwareElement>(SoftwareElement.class, this, CimPackage.SERVICE__SOFTWARE_ELEMENT_SERVICE_IMPLEMENTATION);
		}
		return softwareElementServiceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareFeature> getSoftwareFeatureServiceImplementation() {
		if (softwareFeatureServiceImplementation == null) {
			softwareFeatureServiceImplementation = new EObjectResolvingEList<SoftwareFeature>(SoftwareFeature.class, this, CimPackage.SERVICE__SOFTWARE_FEATURE_SERVICE_IMPLEMENTATION);
		}
		return softwareFeatureServiceImplementation;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SERVICE__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SERVICE__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceAccessPoint> getServiceAccessBySAP() {
		if (serviceAccessBySAP == null) {
			serviceAccessBySAP = new EObjectResolvingEList<ServiceAccessPoint>(ServiceAccessPoint.class, this, CimPackage.SERVICE__SERVICE_ACCESS_BY_SAP);
		}
		return serviceAccessBySAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CimPackage.SERVICE__SERVICE_COMPONENTS:
				return ((InternalEList<?>)getServiceComponents()).basicRemove(otherEnd, msgs);
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
			case CimPackage.SERVICE__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.SERVICE__PRIMARY_OWNER_NAME:
				return getPrimaryOwnerName();
			case CimPackage.SERVICE__PRIMARY_OWNER_CONTACT:
				return getPrimaryOwnerContact();
			case CimPackage.SERVICE__STARTED:
				return isStarted();
			case CimPackage.SERVICE__SERVICE_COMPONENTS:
				return getServiceComponents();
			case CimPackage.SERVICE__SERVICE_SERVICE_DEPENDENCY:
				return getServiceServiceDependency();
			case CimPackage.SERVICE__SOFTWARE_ELEMENT_SERVICE_IMPLEMENTATION:
				return getSoftwareElementServiceImplementation();
			case CimPackage.SERVICE__SOFTWARE_FEATURE_SERVICE_IMPLEMENTATION:
				return getSoftwareFeatureServiceImplementation();
			case CimPackage.SERVICE__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.SERVICE__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.SERVICE__SERVICE_ACCESS_BY_SAP:
				return getServiceAccessBySAP();
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
			case CimPackage.SERVICE__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.SERVICE__PRIMARY_OWNER_NAME:
				setPrimaryOwnerName((String)newValue);
				return;
			case CimPackage.SERVICE__PRIMARY_OWNER_CONTACT:
				setPrimaryOwnerContact((String)newValue);
				return;
			case CimPackage.SERVICE__STARTED:
				setStarted((Boolean)newValue);
				return;
			case CimPackage.SERVICE__SERVICE_COMPONENTS:
				getServiceComponents().clear();
				getServiceComponents().addAll((Collection<? extends Service>)newValue);
				return;
			case CimPackage.SERVICE__SERVICE_SERVICE_DEPENDENCY:
				getServiceServiceDependency().clear();
				getServiceServiceDependency().addAll((Collection<? extends Service>)newValue);
				return;
			case CimPackage.SERVICE__SOFTWARE_ELEMENT_SERVICE_IMPLEMENTATION:
				getSoftwareElementServiceImplementation().clear();
				getSoftwareElementServiceImplementation().addAll((Collection<? extends SoftwareElement>)newValue);
				return;
			case CimPackage.SERVICE__SOFTWARE_FEATURE_SERVICE_IMPLEMENTATION:
				getSoftwareFeatureServiceImplementation().clear();
				getSoftwareFeatureServiceImplementation().addAll((Collection<? extends SoftwareFeature>)newValue);
				return;
			case CimPackage.SERVICE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.SERVICE__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.SERVICE__SERVICE_ACCESS_BY_SAP:
				getServiceAccessBySAP().clear();
				getServiceAccessBySAP().addAll((Collection<? extends ServiceAccessPoint>)newValue);
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
			case CimPackage.SERVICE__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.SERVICE__PRIMARY_OWNER_NAME:
				setPrimaryOwnerName(PRIMARY_OWNER_NAME_EDEFAULT);
				return;
			case CimPackage.SERVICE__PRIMARY_OWNER_CONTACT:
				setPrimaryOwnerContact(PRIMARY_OWNER_CONTACT_EDEFAULT);
				return;
			case CimPackage.SERVICE__STARTED:
				setStarted(STARTED_EDEFAULT);
				return;
			case CimPackage.SERVICE__SERVICE_COMPONENTS:
				getServiceComponents().clear();
				return;
			case CimPackage.SERVICE__SERVICE_SERVICE_DEPENDENCY:
				getServiceServiceDependency().clear();
				return;
			case CimPackage.SERVICE__SOFTWARE_ELEMENT_SERVICE_IMPLEMENTATION:
				getSoftwareElementServiceImplementation().clear();
				return;
			case CimPackage.SERVICE__SOFTWARE_FEATURE_SERVICE_IMPLEMENTATION:
				getSoftwareFeatureServiceImplementation().clear();
				return;
			case CimPackage.SERVICE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.SERVICE__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.SERVICE__SERVICE_ACCESS_BY_SAP:
				getServiceAccessBySAP().clear();
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
			case CimPackage.SERVICE__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.SERVICE__PRIMARY_OWNER_NAME:
				return PRIMARY_OWNER_NAME_EDEFAULT == null ? primaryOwnerName != null : !PRIMARY_OWNER_NAME_EDEFAULT.equals(primaryOwnerName);
			case CimPackage.SERVICE__PRIMARY_OWNER_CONTACT:
				return PRIMARY_OWNER_CONTACT_EDEFAULT == null ? primaryOwnerContact != null : !PRIMARY_OWNER_CONTACT_EDEFAULT.equals(primaryOwnerContact);
			case CimPackage.SERVICE__STARTED:
				return started != STARTED_EDEFAULT;
			case CimPackage.SERVICE__SERVICE_COMPONENTS:
				return serviceComponents != null && !serviceComponents.isEmpty();
			case CimPackage.SERVICE__SERVICE_SERVICE_DEPENDENCY:
				return serviceServiceDependency != null && !serviceServiceDependency.isEmpty();
			case CimPackage.SERVICE__SOFTWARE_ELEMENT_SERVICE_IMPLEMENTATION:
				return softwareElementServiceImplementation != null && !softwareElementServiceImplementation.isEmpty();
			case CimPackage.SERVICE__SOFTWARE_FEATURE_SERVICE_IMPLEMENTATION:
				return softwareFeatureServiceImplementation != null && !softwareFeatureServiceImplementation.isEmpty();
			case CimPackage.SERVICE__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.SERVICE__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.SERVICE__SERVICE_ACCESS_BY_SAP:
				return serviceAccessBySAP != null && !serviceAccessBySAP.isEmpty();
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
		result.append(", primaryOwnerName: ");
		result.append(primaryOwnerName);
		result.append(", primaryOwnerContact: ");
		result.append(primaryOwnerContact);
		result.append(", started: ");
		result.append(started);
		result.append(", systemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", systemName: ");
		result.append(systemName);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
