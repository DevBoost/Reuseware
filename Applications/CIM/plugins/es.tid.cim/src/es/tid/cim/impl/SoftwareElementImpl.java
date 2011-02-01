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

import es.tid.cim.Action;
import es.tid.cim.Check;
import es.tid.cim.CimPackage;
import es.tid.cim.EnumSoftwareElementState;
import es.tid.cim.EnumTargetOSTypes;
import es.tid.cim.SoftwareElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getSoftwareElementChecks <em>Software Element Checks</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getSoftwareElementActions <em>Software Element Actions</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getBuildNumber <em>Build Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getCodeSet <em>Code Set</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getIdentificationCode <em>Identification Code</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getLanguageEdition <em>Language Edition</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getOtherTargetOS <em>Other Target OS</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getSoftwareElementID <em>Software Element ID</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getSoftwareElementState <em>Software Element State</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getTargetOperatingSystem <em>Target Operating System</em>}</li>
 *   <li>{@link es.tid.cim.impl.SoftwareElementImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareElementImpl extends LogicalElementImpl implements SoftwareElement {
	/**
	 * The cached value of the '{@link #getSoftwareElementChecks() <em>Software Element Checks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementChecks()
	 * @generated
	 * @ordered
	 */
	protected EList<Check> softwareElementChecks;

	/**
	 * The cached value of the '{@link #getSoftwareElementActions() <em>Software Element Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElementActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> softwareElementActions;

	/**
	 * The default value of the '{@link #getBuildNumber() <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildNumber() <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected String buildNumber = BUILD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSet() <em>Code Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSet()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSet() <em>Code Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSet()
	 * @generated
	 * @ordered
	 */
	protected String codeSet = CODE_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentificationCode() <em>Identification Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICATION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentificationCode() <em>Identification Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationCode()
	 * @generated
	 * @ordered
	 */
	protected String identificationCode = IDENTIFICATION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageEdition() <em>Language Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageEdition()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageEdition() <em>Language Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageEdition()
	 * @generated
	 * @ordered
	 */
	protected String languageEdition = LANGUAGE_EDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTargetOS() <em>Other Target OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTargetOS()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TARGET_OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTargetOS() <em>Other Target OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTargetOS()
	 * @generated
	 * @ordered
	 */
	protected String otherTargetOS = OTHER_TARGET_OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

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
	protected SoftwareElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getSoftwareElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Check> getSoftwareElementChecks() {
		if (softwareElementChecks == null) {
			softwareElementChecks = new EObjectResolvingEList<Check>(Check.class, this, CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_CHECKS);
		}
		return softwareElementChecks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getSoftwareElementActions() {
		if (softwareElementActions == null) {
			softwareElementActions = new EObjectResolvingEList<Action>(Action.class, this, CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ACTIONS);
		}
		return softwareElementActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuildNumber() {
		return buildNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildNumber(String newBuildNumber) {
		String oldBuildNumber = buildNumber;
		buildNumber = newBuildNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_ELEMENT__BUILD_NUMBER, oldBuildNumber, buildNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeSet() {
		return codeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSet(String newCodeSet) {
		String oldCodeSet = codeSet;
		codeSet = newCodeSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_ELEMENT__CODE_SET, oldCodeSet, codeSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentificationCode() {
		return identificationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificationCode(String newIdentificationCode) {
		String oldIdentificationCode = identificationCode;
		identificationCode = newIdentificationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_ELEMENT__IDENTIFICATION_CODE, oldIdentificationCode, identificationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageEdition() {
		return languageEdition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageEdition(String newLanguageEdition) {
		String oldLanguageEdition = languageEdition;
		languageEdition = newLanguageEdition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_ELEMENT__LANGUAGE_EDITION, oldLanguageEdition, languageEdition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_ELEMENT__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherTargetOS() {
		return otherTargetOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherTargetOS(String newOtherTargetOS) {
		String oldOtherTargetOS = otherTargetOS;
		otherTargetOS = newOtherTargetOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_ELEMENT__OTHER_TARGET_OS, oldOtherTargetOS, otherTargetOS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_ELEMENT__SERIAL_NUMBER, oldSerialNumber, serialNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ID, oldSoftwareElementID, softwareElementID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_STATE, oldSoftwareElementState, softwareElementState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_ELEMENT__TARGET_OPERATING_SYSTEM, oldTargetOperatingSystem, targetOperatingSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SOFTWARE_ELEMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_CHECKS:
				return getSoftwareElementChecks();
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ACTIONS:
				return getSoftwareElementActions();
			case CimPackage.SOFTWARE_ELEMENT__BUILD_NUMBER:
				return getBuildNumber();
			case CimPackage.SOFTWARE_ELEMENT__CODE_SET:
				return getCodeSet();
			case CimPackage.SOFTWARE_ELEMENT__IDENTIFICATION_CODE:
				return getIdentificationCode();
			case CimPackage.SOFTWARE_ELEMENT__LANGUAGE_EDITION:
				return getLanguageEdition();
			case CimPackage.SOFTWARE_ELEMENT__MANUFACTURER:
				return getManufacturer();
			case CimPackage.SOFTWARE_ELEMENT__OTHER_TARGET_OS:
				return getOtherTargetOS();
			case CimPackage.SOFTWARE_ELEMENT__SERIAL_NUMBER:
				return getSerialNumber();
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ID:
				return getSoftwareElementID();
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_STATE:
				return getSoftwareElementState();
			case CimPackage.SOFTWARE_ELEMENT__TARGET_OPERATING_SYSTEM:
				return getTargetOperatingSystem();
			case CimPackage.SOFTWARE_ELEMENT__VERSION:
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
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_CHECKS:
				getSoftwareElementChecks().clear();
				getSoftwareElementChecks().addAll((Collection<? extends Check>)newValue);
				return;
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ACTIONS:
				getSoftwareElementActions().clear();
				getSoftwareElementActions().addAll((Collection<? extends Action>)newValue);
				return;
			case CimPackage.SOFTWARE_ELEMENT__BUILD_NUMBER:
				setBuildNumber((String)newValue);
				return;
			case CimPackage.SOFTWARE_ELEMENT__CODE_SET:
				setCodeSet((String)newValue);
				return;
			case CimPackage.SOFTWARE_ELEMENT__IDENTIFICATION_CODE:
				setIdentificationCode((String)newValue);
				return;
			case CimPackage.SOFTWARE_ELEMENT__LANGUAGE_EDITION:
				setLanguageEdition((String)newValue);
				return;
			case CimPackage.SOFTWARE_ELEMENT__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case CimPackage.SOFTWARE_ELEMENT__OTHER_TARGET_OS:
				setOtherTargetOS((String)newValue);
				return;
			case CimPackage.SOFTWARE_ELEMENT__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ID:
				setSoftwareElementID((String)newValue);
				return;
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_STATE:
				setSoftwareElementState((EnumSoftwareElementState)newValue);
				return;
			case CimPackage.SOFTWARE_ELEMENT__TARGET_OPERATING_SYSTEM:
				setTargetOperatingSystem((EnumTargetOSTypes)newValue);
				return;
			case CimPackage.SOFTWARE_ELEMENT__VERSION:
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
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_CHECKS:
				getSoftwareElementChecks().clear();
				return;
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ACTIONS:
				getSoftwareElementActions().clear();
				return;
			case CimPackage.SOFTWARE_ELEMENT__BUILD_NUMBER:
				setBuildNumber(BUILD_NUMBER_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_ELEMENT__CODE_SET:
				setCodeSet(CODE_SET_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_ELEMENT__IDENTIFICATION_CODE:
				setIdentificationCode(IDENTIFICATION_CODE_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_ELEMENT__LANGUAGE_EDITION:
				setLanguageEdition(LANGUAGE_EDITION_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_ELEMENT__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_ELEMENT__OTHER_TARGET_OS:
				setOtherTargetOS(OTHER_TARGET_OS_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_ELEMENT__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ID:
				setSoftwareElementID(SOFTWARE_ELEMENT_ID_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_STATE:
				setSoftwareElementState(SOFTWARE_ELEMENT_STATE_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_ELEMENT__TARGET_OPERATING_SYSTEM:
				setTargetOperatingSystem(TARGET_OPERATING_SYSTEM_EDEFAULT);
				return;
			case CimPackage.SOFTWARE_ELEMENT__VERSION:
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
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_CHECKS:
				return softwareElementChecks != null && !softwareElementChecks.isEmpty();
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ACTIONS:
				return softwareElementActions != null && !softwareElementActions.isEmpty();
			case CimPackage.SOFTWARE_ELEMENT__BUILD_NUMBER:
				return BUILD_NUMBER_EDEFAULT == null ? buildNumber != null : !BUILD_NUMBER_EDEFAULT.equals(buildNumber);
			case CimPackage.SOFTWARE_ELEMENT__CODE_SET:
				return CODE_SET_EDEFAULT == null ? codeSet != null : !CODE_SET_EDEFAULT.equals(codeSet);
			case CimPackage.SOFTWARE_ELEMENT__IDENTIFICATION_CODE:
				return IDENTIFICATION_CODE_EDEFAULT == null ? identificationCode != null : !IDENTIFICATION_CODE_EDEFAULT.equals(identificationCode);
			case CimPackage.SOFTWARE_ELEMENT__LANGUAGE_EDITION:
				return LANGUAGE_EDITION_EDEFAULT == null ? languageEdition != null : !LANGUAGE_EDITION_EDEFAULT.equals(languageEdition);
			case CimPackage.SOFTWARE_ELEMENT__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case CimPackage.SOFTWARE_ELEMENT__OTHER_TARGET_OS:
				return OTHER_TARGET_OS_EDEFAULT == null ? otherTargetOS != null : !OTHER_TARGET_OS_EDEFAULT.equals(otherTargetOS);
			case CimPackage.SOFTWARE_ELEMENT__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_ID:
				return SOFTWARE_ELEMENT_ID_EDEFAULT == null ? softwareElementID != null : !SOFTWARE_ELEMENT_ID_EDEFAULT.equals(softwareElementID);
			case CimPackage.SOFTWARE_ELEMENT__SOFTWARE_ELEMENT_STATE:
				return softwareElementState != SOFTWARE_ELEMENT_STATE_EDEFAULT;
			case CimPackage.SOFTWARE_ELEMENT__TARGET_OPERATING_SYSTEM:
				return targetOperatingSystem != TARGET_OPERATING_SYSTEM_EDEFAULT;
			case CimPackage.SOFTWARE_ELEMENT__VERSION:
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
		result.append(" (buildNumber: ");
		result.append(buildNumber);
		result.append(", codeSet: ");
		result.append(codeSet);
		result.append(", identificationCode: ");
		result.append(identificationCode);
		result.append(", languageEdition: ");
		result.append(languageEdition);
		result.append(", manufacturer: ");
		result.append(manufacturer);
		result.append(", otherTargetOS: ");
		result.append(otherTargetOS);
		result.append(", serialNumber: ");
		result.append(serialNumber);
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

} //SoftwareElementImpl
