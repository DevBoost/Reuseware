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
import es.tid.cim.EnumTargetOSTypes;
import es.tid.cim.OperatingSystem;
import es.tid.cim.SoftwareFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.OperatingSystemImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.OperatingSystemImpl#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.OperatingSystemImpl#getCSName <em>CS Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.OperatingSystemImpl#getOperatingSystemSoftwareFeature <em>Operating System Software Feature</em>}</li>
 *   <li>{@link es.tid.cim.impl.OperatingSystemImpl#getOSType <em>OS Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.OperatingSystemImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link es.tid.cim.impl.OperatingSystemImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatingSystemImpl extends EnabledLogicalElementImpl implements OperatingSystem {
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
	 * The default value of the '{@link #getCSCreationClassName() <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSCreationClassName() <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String csCreationClassName = CS_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCSName() <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSName() <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSName()
	 * @generated
	 * @ordered
	 */
	protected String csName = CS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperatingSystemSoftwareFeature() <em>Operating System Software Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystemSoftwareFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareFeature> operatingSystemSoftwareFeature;

	/**
	 * The default value of the '{@link #getOSType() <em>OS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumTargetOSTypes OS_TYPE_EDEFAULT = EnumTargetOSTypes.UNKNOWN;

	/**
	 * The cached value of the '{@link #getOSType() <em>OS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSType()
	 * @generated
	 * @ordered
	 */
	protected EnumTargetOSTypes osType = OS_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getOperatingSystem();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OPERATING_SYSTEM__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCSCreationClassName() {
		return csCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSCreationClassName(String newCSCreationClassName) {
		String oldCSCreationClassName = csCreationClassName;
		csCreationClassName = newCSCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OPERATING_SYSTEM__CS_CREATION_CLASS_NAME, oldCSCreationClassName, csCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCSName() {
		return csName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSName(String newCSName) {
		String oldCSName = csName;
		csName = newCSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OPERATING_SYSTEM__CS_NAME, oldCSName, csName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareFeature> getOperatingSystemSoftwareFeature() {
		if (operatingSystemSoftwareFeature == null) {
			operatingSystemSoftwareFeature = new EObjectResolvingEList<SoftwareFeature>(SoftwareFeature.class, this, CimPackage.OPERATING_SYSTEM__OPERATING_SYSTEM_SOFTWARE_FEATURE);
		}
		return operatingSystemSoftwareFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTargetOSTypes getOSType() {
		return osType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSType(EnumTargetOSTypes newOSType) {
		EnumTargetOSTypes oldOSType = osType;
		osType = newOSType == null ? OS_TYPE_EDEFAULT : newOSType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OPERATING_SYSTEM__OS_TYPE, oldOSType, osType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OPERATING_SYSTEM__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.OPERATING_SYSTEM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.OPERATING_SYSTEM__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.OPERATING_SYSTEM__CS_CREATION_CLASS_NAME:
				return getCSCreationClassName();
			case CimPackage.OPERATING_SYSTEM__CS_NAME:
				return getCSName();
			case CimPackage.OPERATING_SYSTEM__OPERATING_SYSTEM_SOFTWARE_FEATURE:
				return getOperatingSystemSoftwareFeature();
			case CimPackage.OPERATING_SYSTEM__OS_TYPE:
				return getOSType();
			case CimPackage.OPERATING_SYSTEM__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
			case CimPackage.OPERATING_SYSTEM__VERSION:
				return getVersion();
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
			case CimPackage.OPERATING_SYSTEM__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.OPERATING_SYSTEM__CS_CREATION_CLASS_NAME:
				setCSCreationClassName((String)newValue);
				return;
			case CimPackage.OPERATING_SYSTEM__CS_NAME:
				setCSName((String)newValue);
				return;
			case CimPackage.OPERATING_SYSTEM__OPERATING_SYSTEM_SOFTWARE_FEATURE:
				getOperatingSystemSoftwareFeature().clear();
				getOperatingSystemSoftwareFeature().addAll((Collection<? extends SoftwareFeature>)newValue);
				return;
			case CimPackage.OPERATING_SYSTEM__OS_TYPE:
				setOSType((EnumTargetOSTypes)newValue);
				return;
			case CimPackage.OPERATING_SYSTEM__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
				return;
			case CimPackage.OPERATING_SYSTEM__VERSION:
				setVersion((String)newValue);
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
			case CimPackage.OPERATING_SYSTEM__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.OPERATING_SYSTEM__CS_CREATION_CLASS_NAME:
				setCSCreationClassName(CS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.OPERATING_SYSTEM__CS_NAME:
				setCSName(CS_NAME_EDEFAULT);
				return;
			case CimPackage.OPERATING_SYSTEM__OPERATING_SYSTEM_SOFTWARE_FEATURE:
				getOperatingSystemSoftwareFeature().clear();
				return;
			case CimPackage.OPERATING_SYSTEM__OS_TYPE:
				setOSType(OS_TYPE_EDEFAULT);
				return;
			case CimPackage.OPERATING_SYSTEM__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.OPERATING_SYSTEM__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case CimPackage.OPERATING_SYSTEM__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.OPERATING_SYSTEM__CS_CREATION_CLASS_NAME:
				return CS_CREATION_CLASS_NAME_EDEFAULT == null ? csCreationClassName != null : !CS_CREATION_CLASS_NAME_EDEFAULT.equals(csCreationClassName);
			case CimPackage.OPERATING_SYSTEM__CS_NAME:
				return CS_NAME_EDEFAULT == null ? csName != null : !CS_NAME_EDEFAULT.equals(csName);
			case CimPackage.OPERATING_SYSTEM__OPERATING_SYSTEM_SOFTWARE_FEATURE:
				return operatingSystemSoftwareFeature != null && !operatingSystemSoftwareFeature.isEmpty();
			case CimPackage.OPERATING_SYSTEM__OS_TYPE:
				return osType != OS_TYPE_EDEFAULT;
			case CimPackage.OPERATING_SYSTEM__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
			case CimPackage.OPERATING_SYSTEM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(", CSCreationClassName: ");
		result.append(csCreationClassName);
		result.append(", CSName: ");
		result.append(csName);
		result.append(", OSType: ");
		result.append(osType);
		result.append(", otherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //OperatingSystemImpl
