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

import es.tid.cim.Check;
import es.tid.cim.CimPackage;
import es.tid.cim.EnumSoftwareElementState;
import es.tid.cim.EnumTargetOSTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.CheckImpl#getCheckID <em>Check ID</em>}</li>
 *   <li>{@link es.tid.cim.impl.CheckImpl#isCheckMode <em>Check Mode</em>}</li>
 *   <li>{@link es.tid.cim.impl.CheckImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.CheckImpl#getSoftwareElementID <em>Software Element ID</em>}</li>
 *   <li>{@link es.tid.cim.impl.CheckImpl#getSoftwareElementState <em>Software Element State</em>}</li>
 *   <li>{@link es.tid.cim.impl.CheckImpl#getTargetOperatingSystem <em>Target Operating System</em>}</li>
 *   <li>{@link es.tid.cim.impl.CheckImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CheckImpl extends ManagedElementImpl implements Check {
	/**
	 * The default value of the '{@link #getCheckID() <em>Check ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckID()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckID() <em>Check ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckID()
	 * @generated
	 * @ordered
	 */
	protected String checkID = CHECK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckMode() <em>Check Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_MODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckMode() <em>Check Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckMode()
	 * @generated
	 * @ordered
	 */
	protected boolean checkMode = CHECK_MODE_EDEFAULT;

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
	 * The default value of the '{@link #getSoftwareElementID() <em>Software Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareElementID() <em>Software Element ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementID()
	 * @generated
	 * @ordered
	 */
	protected String softwareElementID = SOFTWARE_ELEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftwareElementState() <em>Software Element State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementState()
	 * @generated
	 * @ordered
	 */
	protected static final EnumSoftwareElementState SOFTWARE_ELEMENT_STATE_EDEFAULT = EnumSoftwareElementState.DEPLOYABLE;

	/**
	 * The cached value of the '{@link #getSoftwareElementState() <em>Software Element State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementState()
	 * @generated
	 * @ordered
	 */
	protected EnumSoftwareElementState softwareElementState = SOFTWARE_ELEMENT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetOperatingSystem() <em>Target Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final EnumTargetOSTypes TARGET_OPERATING_SYSTEM_EDEFAULT = EnumTargetOSTypes.UNKNOWN;

	/**
	 * The cached value of the '{@link #getTargetOperatingSystem() <em>Target Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected EnumTargetOSTypes targetOperatingSystem = TARGET_OPERATING_SYSTEM_EDEFAULT;

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
	protected CheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCheck();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckID() {
		return checkID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckID(String newCheckID) {
		String oldCheckID = checkID;
		checkID = newCheckID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CHECK__CHECK_ID, oldCheckID, checkID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckMode() {
		return checkMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckMode(boolean newCheckMode) {
		boolean oldCheckMode = checkMode;
		checkMode = newCheckMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CHECK__CHECK_MODE, oldCheckMode, checkMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CHECK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoftwareElementID() {
		return softwareElementID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareElementID(String newSoftwareElementID) {
		String oldSoftwareElementID = softwareElementID;
		softwareElementID = newSoftwareElementID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CHECK__SOFTWARE_ELEMENT_ID, oldSoftwareElementID, softwareElementID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumSoftwareElementState getSoftwareElementState() {
		return softwareElementState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareElementState(EnumSoftwareElementState newSoftwareElementState) {
		EnumSoftwareElementState oldSoftwareElementState = softwareElementState;
		softwareElementState = newSoftwareElementState == null ? SOFTWARE_ELEMENT_STATE_EDEFAULT : newSoftwareElementState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CHECK__SOFTWARE_ELEMENT_STATE, oldSoftwareElementState, softwareElementState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTargetOSTypes getTargetOperatingSystem() {
		return targetOperatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetOperatingSystem(EnumTargetOSTypes newTargetOperatingSystem) {
		EnumTargetOSTypes oldTargetOperatingSystem = targetOperatingSystem;
		targetOperatingSystem = newTargetOperatingSystem == null ? TARGET_OPERATING_SYSTEM_EDEFAULT : newTargetOperatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CHECK__TARGET_OPERATING_SYSTEM, oldTargetOperatingSystem, targetOperatingSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CHECK__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CHECK__CHECK_ID:
				return getCheckID();
			case CimPackage.CHECK__CHECK_MODE:
				return isCheckMode();
			case CimPackage.CHECK__NAME:
				return getName();
			case CimPackage.CHECK__SOFTWARE_ELEMENT_ID:
				return getSoftwareElementID();
			case CimPackage.CHECK__SOFTWARE_ELEMENT_STATE:
				return getSoftwareElementState();
			case CimPackage.CHECK__TARGET_OPERATING_SYSTEM:
				return getTargetOperatingSystem();
			case CimPackage.CHECK__VERSION:
				return getVersion();
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
			case CimPackage.CHECK__CHECK_ID:
				setCheckID((String)newValue);
				return;
			case CimPackage.CHECK__CHECK_MODE:
				setCheckMode((Boolean)newValue);
				return;
			case CimPackage.CHECK__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CHECK__SOFTWARE_ELEMENT_ID:
				setSoftwareElementID((String)newValue);
				return;
			case CimPackage.CHECK__SOFTWARE_ELEMENT_STATE:
				setSoftwareElementState((EnumSoftwareElementState)newValue);
				return;
			case CimPackage.CHECK__TARGET_OPERATING_SYSTEM:
				setTargetOperatingSystem((EnumTargetOSTypes)newValue);
				return;
			case CimPackage.CHECK__VERSION:
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
			case CimPackage.CHECK__CHECK_ID:
				setCheckID(CHECK_ID_EDEFAULT);
				return;
			case CimPackage.CHECK__CHECK_MODE:
				setCheckMode(CHECK_MODE_EDEFAULT);
				return;
			case CimPackage.CHECK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CHECK__SOFTWARE_ELEMENT_ID:
				setSoftwareElementID(SOFTWARE_ELEMENT_ID_EDEFAULT);
				return;
			case CimPackage.CHECK__SOFTWARE_ELEMENT_STATE:
				setSoftwareElementState(SOFTWARE_ELEMENT_STATE_EDEFAULT);
				return;
			case CimPackage.CHECK__TARGET_OPERATING_SYSTEM:
				setTargetOperatingSystem(TARGET_OPERATING_SYSTEM_EDEFAULT);
				return;
			case CimPackage.CHECK__VERSION:
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
			case CimPackage.CHECK__CHECK_ID:
				return CHECK_ID_EDEFAULT == null ? checkID != null : !CHECK_ID_EDEFAULT.equals(checkID);
			case CimPackage.CHECK__CHECK_MODE:
				return checkMode != CHECK_MODE_EDEFAULT;
			case CimPackage.CHECK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CHECK__SOFTWARE_ELEMENT_ID:
				return SOFTWARE_ELEMENT_ID_EDEFAULT == null ? softwareElementID != null : !SOFTWARE_ELEMENT_ID_EDEFAULT.equals(softwareElementID);
			case CimPackage.CHECK__SOFTWARE_ELEMENT_STATE:
				return softwareElementState != SOFTWARE_ELEMENT_STATE_EDEFAULT;
			case CimPackage.CHECK__TARGET_OPERATING_SYSTEM:
				return targetOperatingSystem != TARGET_OPERATING_SYSTEM_EDEFAULT;
			case CimPackage.CHECK__VERSION:
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
		result.append(" (checkID: ");
		result.append(checkID);
		result.append(", checkMode: ");
		result.append(checkMode);
		result.append(", name: ");
		result.append(name);
		result.append(", softwareElementID: ");
		result.append(softwareElementID);
		result.append(", softwareElementState: ");
		result.append(softwareElementState);
		result.append(", targetOperatingSystem: ");
		result.append(targetOperatingSystem);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //CheckImpl
