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
import es.tid.cim.EnumCharacterDisplayMode;
import es.tid.cim.EnumTerminalMode;
import es.tid.cim.TelnetSettingData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telnet Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.TelnetSettingDataImpl#getEnabledTerminalModes <em>Enabled Terminal Modes</em>}</li>
 *   <li>{@link es.tid.cim.impl.TelnetSettingDataImpl#getOtherEnabledTerminalMode <em>Other Enabled Terminal Mode</em>}</li>
 *   <li>{@link es.tid.cim.impl.TelnetSettingDataImpl#getTerminalMode <em>Terminal Mode</em>}</li>
 *   <li>{@link es.tid.cim.impl.TelnetSettingDataImpl#getOtherTerminalMode <em>Other Terminal Mode</em>}</li>
 *   <li>{@link es.tid.cim.impl.TelnetSettingDataImpl#getEnabledCharacterDisplayModes <em>Enabled Character Display Modes</em>}</li>
 *   <li>{@link es.tid.cim.impl.TelnetSettingDataImpl#getOtherEnabledCharacterDisplayMode <em>Other Enabled Character Display Mode</em>}</li>
 *   <li>{@link es.tid.cim.impl.TelnetSettingDataImpl#getCharacterDisplayMode <em>Character Display Mode</em>}</li>
 *   <li>{@link es.tid.cim.impl.TelnetSettingDataImpl#getOtherCharacterDisplayMode <em>Other Character Display Mode</em>}</li>
 *   <li>{@link es.tid.cim.impl.TelnetSettingDataImpl#getEscapeCharacter <em>Escape Character</em>}</li>
 *   <li>{@link es.tid.cim.impl.TelnetSettingDataImpl#getIdleTimeout <em>Idle Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TelnetSettingDataImpl extends SettingDataImpl implements TelnetSettingData {
	/**
	 * The default value of the '{@link #getEnabledTerminalModes() <em>Enabled Terminal Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledTerminalModes()
	 * @generated
	 * @ordered
	 */
	protected static final EnumTerminalMode ENABLED_TERMINAL_MODES_EDEFAULT = EnumTerminalMode.VT100;

	/**
	 * The cached value of the '{@link #getEnabledTerminalModes() <em>Enabled Terminal Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledTerminalModes()
	 * @generated
	 * @ordered
	 */
	protected EnumTerminalMode enabledTerminalModes = ENABLED_TERMINAL_MODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEnabledTerminalMode() <em>Other Enabled Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledTerminalMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENABLED_TERMINAL_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEnabledTerminalMode() <em>Other Enabled Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledTerminalMode()
	 * @generated
	 * @ordered
	 */
	protected String otherEnabledTerminalMode = OTHER_ENABLED_TERMINAL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminalMode() <em>Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalMode()
	 * @generated
	 * @ordered
	 */
	protected static final EnumTerminalMode TERMINAL_MODE_EDEFAULT = EnumTerminalMode.VT100;

	/**
	 * The cached value of the '{@link #getTerminalMode() <em>Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalMode()
	 * @generated
	 * @ordered
	 */
	protected EnumTerminalMode terminalMode = TERMINAL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTerminalMode() <em>Other Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTerminalMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TERMINAL_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTerminalMode() <em>Other Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTerminalMode()
	 * @generated
	 * @ordered
	 */
	protected String otherTerminalMode = OTHER_TERMINAL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabledCharacterDisplayModes() <em>Enabled Character Display Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledCharacterDisplayModes()
	 * @generated
	 * @ordered
	 */
	protected static final EnumCharacterDisplayMode ENABLED_CHARACTER_DISPLAY_MODES_EDEFAULT = EnumCharacterDisplayMode.UNKNOWN;

	/**
	 * The cached value of the '{@link #getEnabledCharacterDisplayModes() <em>Enabled Character Display Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledCharacterDisplayModes()
	 * @generated
	 * @ordered
	 */
	protected EnumCharacterDisplayMode enabledCharacterDisplayModes = ENABLED_CHARACTER_DISPLAY_MODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEnabledCharacterDisplayMode() <em>Other Enabled Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledCharacterDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENABLED_CHARACTER_DISPLAY_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEnabledCharacterDisplayMode() <em>Other Enabled Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledCharacterDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected String otherEnabledCharacterDisplayMode = OTHER_ENABLED_CHARACTER_DISPLAY_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacterDisplayMode() <em>Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected static final EnumCharacterDisplayMode CHARACTER_DISPLAY_MODE_EDEFAULT = EnumCharacterDisplayMode.UNKNOWN;

	/**
	 * The cached value of the '{@link #getCharacterDisplayMode() <em>Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected EnumCharacterDisplayMode characterDisplayMode = CHARACTER_DISPLAY_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCharacterDisplayMode() <em>Other Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCharacterDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CHARACTER_DISPLAY_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCharacterDisplayMode() <em>Other Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCharacterDisplayMode()
	 * @generated
	 * @ordered
	 */
	protected String otherCharacterDisplayMode = OTHER_CHARACTER_DISPLAY_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEscapeCharacter() <em>Escape Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeCharacter()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCAPE_CHARACTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEscapeCharacter() <em>Escape Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeCharacter()
	 * @generated
	 * @ordered
	 */
	protected String escapeCharacter = ESCAPE_CHARACTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdleTimeout() <em>Idle Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int IDLE_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdleTimeout() <em>Idle Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleTimeout()
	 * @generated
	 * @ordered
	 */
	protected int idleTimeout = IDLE_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelnetSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getTelnetSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTerminalMode getEnabledTerminalModes() {
		return enabledTerminalModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabledTerminalModes(EnumTerminalMode newEnabledTerminalModes) {
		EnumTerminalMode oldEnabledTerminalModes = enabledTerminalModes;
		enabledTerminalModes = newEnabledTerminalModes == null ? ENABLED_TERMINAL_MODES_EDEFAULT : newEnabledTerminalModes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.TELNET_SETTING_DATA__ENABLED_TERMINAL_MODES, oldEnabledTerminalModes, enabledTerminalModes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherEnabledTerminalMode() {
		return otherEnabledTerminalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherEnabledTerminalMode(String newOtherEnabledTerminalMode) {
		String oldOtherEnabledTerminalMode = otherEnabledTerminalMode;
		otherEnabledTerminalMode = newOtherEnabledTerminalMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.TELNET_SETTING_DATA__OTHER_ENABLED_TERMINAL_MODE, oldOtherEnabledTerminalMode, otherEnabledTerminalMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTerminalMode getTerminalMode() {
		return terminalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminalMode(EnumTerminalMode newTerminalMode) {
		EnumTerminalMode oldTerminalMode = terminalMode;
		terminalMode = newTerminalMode == null ? TERMINAL_MODE_EDEFAULT : newTerminalMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.TELNET_SETTING_DATA__TERMINAL_MODE, oldTerminalMode, terminalMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherTerminalMode() {
		return otherTerminalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherTerminalMode(String newOtherTerminalMode) {
		String oldOtherTerminalMode = otherTerminalMode;
		otherTerminalMode = newOtherTerminalMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.TELNET_SETTING_DATA__OTHER_TERMINAL_MODE, oldOtherTerminalMode, otherTerminalMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumCharacterDisplayMode getEnabledCharacterDisplayModes() {
		return enabledCharacterDisplayModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabledCharacterDisplayModes(EnumCharacterDisplayMode newEnabledCharacterDisplayModes) {
		EnumCharacterDisplayMode oldEnabledCharacterDisplayModes = enabledCharacterDisplayModes;
		enabledCharacterDisplayModes = newEnabledCharacterDisplayModes == null ? ENABLED_CHARACTER_DISPLAY_MODES_EDEFAULT : newEnabledCharacterDisplayModes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.TELNET_SETTING_DATA__ENABLED_CHARACTER_DISPLAY_MODES, oldEnabledCharacterDisplayModes, enabledCharacterDisplayModes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherEnabledCharacterDisplayMode() {
		return otherEnabledCharacterDisplayMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherEnabledCharacterDisplayMode(String newOtherEnabledCharacterDisplayMode) {
		String oldOtherEnabledCharacterDisplayMode = otherEnabledCharacterDisplayMode;
		otherEnabledCharacterDisplayMode = newOtherEnabledCharacterDisplayMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.TELNET_SETTING_DATA__OTHER_ENABLED_CHARACTER_DISPLAY_MODE, oldOtherEnabledCharacterDisplayMode, otherEnabledCharacterDisplayMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumCharacterDisplayMode getCharacterDisplayMode() {
		return characterDisplayMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterDisplayMode(EnumCharacterDisplayMode newCharacterDisplayMode) {
		EnumCharacterDisplayMode oldCharacterDisplayMode = characterDisplayMode;
		characterDisplayMode = newCharacterDisplayMode == null ? CHARACTER_DISPLAY_MODE_EDEFAULT : newCharacterDisplayMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.TELNET_SETTING_DATA__CHARACTER_DISPLAY_MODE, oldCharacterDisplayMode, characterDisplayMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherCharacterDisplayMode() {
		return otherCharacterDisplayMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherCharacterDisplayMode(String newOtherCharacterDisplayMode) {
		String oldOtherCharacterDisplayMode = otherCharacterDisplayMode;
		otherCharacterDisplayMode = newOtherCharacterDisplayMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.TELNET_SETTING_DATA__OTHER_CHARACTER_DISPLAY_MODE, oldOtherCharacterDisplayMode, otherCharacterDisplayMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEscapeCharacter() {
		return escapeCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscapeCharacter(String newEscapeCharacter) {
		String oldEscapeCharacter = escapeCharacter;
		escapeCharacter = newEscapeCharacter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.TELNET_SETTING_DATA__ESCAPE_CHARACTER, oldEscapeCharacter, escapeCharacter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdleTimeout() {
		return idleTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdleTimeout(int newIdleTimeout) {
		int oldIdleTimeout = idleTimeout;
		idleTimeout = newIdleTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.TELNET_SETTING_DATA__IDLE_TIMEOUT, oldIdleTimeout, idleTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.TELNET_SETTING_DATA__ENABLED_TERMINAL_MODES:
				return getEnabledTerminalModes();
			case CimPackage.TELNET_SETTING_DATA__OTHER_ENABLED_TERMINAL_MODE:
				return getOtherEnabledTerminalMode();
			case CimPackage.TELNET_SETTING_DATA__TERMINAL_MODE:
				return getTerminalMode();
			case CimPackage.TELNET_SETTING_DATA__OTHER_TERMINAL_MODE:
				return getOtherTerminalMode();
			case CimPackage.TELNET_SETTING_DATA__ENABLED_CHARACTER_DISPLAY_MODES:
				return getEnabledCharacterDisplayModes();
			case CimPackage.TELNET_SETTING_DATA__OTHER_ENABLED_CHARACTER_DISPLAY_MODE:
				return getOtherEnabledCharacterDisplayMode();
			case CimPackage.TELNET_SETTING_DATA__CHARACTER_DISPLAY_MODE:
				return getCharacterDisplayMode();
			case CimPackage.TELNET_SETTING_DATA__OTHER_CHARACTER_DISPLAY_MODE:
				return getOtherCharacterDisplayMode();
			case CimPackage.TELNET_SETTING_DATA__ESCAPE_CHARACTER:
				return getEscapeCharacter();
			case CimPackage.TELNET_SETTING_DATA__IDLE_TIMEOUT:
				return getIdleTimeout();
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
			case CimPackage.TELNET_SETTING_DATA__ENABLED_TERMINAL_MODES:
				setEnabledTerminalModes((EnumTerminalMode)newValue);
				return;
			case CimPackage.TELNET_SETTING_DATA__OTHER_ENABLED_TERMINAL_MODE:
				setOtherEnabledTerminalMode((String)newValue);
				return;
			case CimPackage.TELNET_SETTING_DATA__TERMINAL_MODE:
				setTerminalMode((EnumTerminalMode)newValue);
				return;
			case CimPackage.TELNET_SETTING_DATA__OTHER_TERMINAL_MODE:
				setOtherTerminalMode((String)newValue);
				return;
			case CimPackage.TELNET_SETTING_DATA__ENABLED_CHARACTER_DISPLAY_MODES:
				setEnabledCharacterDisplayModes((EnumCharacterDisplayMode)newValue);
				return;
			case CimPackage.TELNET_SETTING_DATA__OTHER_ENABLED_CHARACTER_DISPLAY_MODE:
				setOtherEnabledCharacterDisplayMode((String)newValue);
				return;
			case CimPackage.TELNET_SETTING_DATA__CHARACTER_DISPLAY_MODE:
				setCharacterDisplayMode((EnumCharacterDisplayMode)newValue);
				return;
			case CimPackage.TELNET_SETTING_DATA__OTHER_CHARACTER_DISPLAY_MODE:
				setOtherCharacterDisplayMode((String)newValue);
				return;
			case CimPackage.TELNET_SETTING_DATA__ESCAPE_CHARACTER:
				setEscapeCharacter((String)newValue);
				return;
			case CimPackage.TELNET_SETTING_DATA__IDLE_TIMEOUT:
				setIdleTimeout((Integer)newValue);
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
			case CimPackage.TELNET_SETTING_DATA__ENABLED_TERMINAL_MODES:
				setEnabledTerminalModes(ENABLED_TERMINAL_MODES_EDEFAULT);
				return;
			case CimPackage.TELNET_SETTING_DATA__OTHER_ENABLED_TERMINAL_MODE:
				setOtherEnabledTerminalMode(OTHER_ENABLED_TERMINAL_MODE_EDEFAULT);
				return;
			case CimPackage.TELNET_SETTING_DATA__TERMINAL_MODE:
				setTerminalMode(TERMINAL_MODE_EDEFAULT);
				return;
			case CimPackage.TELNET_SETTING_DATA__OTHER_TERMINAL_MODE:
				setOtherTerminalMode(OTHER_TERMINAL_MODE_EDEFAULT);
				return;
			case CimPackage.TELNET_SETTING_DATA__ENABLED_CHARACTER_DISPLAY_MODES:
				setEnabledCharacterDisplayModes(ENABLED_CHARACTER_DISPLAY_MODES_EDEFAULT);
				return;
			case CimPackage.TELNET_SETTING_DATA__OTHER_ENABLED_CHARACTER_DISPLAY_MODE:
				setOtherEnabledCharacterDisplayMode(OTHER_ENABLED_CHARACTER_DISPLAY_MODE_EDEFAULT);
				return;
			case CimPackage.TELNET_SETTING_DATA__CHARACTER_DISPLAY_MODE:
				setCharacterDisplayMode(CHARACTER_DISPLAY_MODE_EDEFAULT);
				return;
			case CimPackage.TELNET_SETTING_DATA__OTHER_CHARACTER_DISPLAY_MODE:
				setOtherCharacterDisplayMode(OTHER_CHARACTER_DISPLAY_MODE_EDEFAULT);
				return;
			case CimPackage.TELNET_SETTING_DATA__ESCAPE_CHARACTER:
				setEscapeCharacter(ESCAPE_CHARACTER_EDEFAULT);
				return;
			case CimPackage.TELNET_SETTING_DATA__IDLE_TIMEOUT:
				setIdleTimeout(IDLE_TIMEOUT_EDEFAULT);
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
			case CimPackage.TELNET_SETTING_DATA__ENABLED_TERMINAL_MODES:
				return enabledTerminalModes != ENABLED_TERMINAL_MODES_EDEFAULT;
			case CimPackage.TELNET_SETTING_DATA__OTHER_ENABLED_TERMINAL_MODE:
				return OTHER_ENABLED_TERMINAL_MODE_EDEFAULT == null ? otherEnabledTerminalMode != null : !OTHER_ENABLED_TERMINAL_MODE_EDEFAULT.equals(otherEnabledTerminalMode);
			case CimPackage.TELNET_SETTING_DATA__TERMINAL_MODE:
				return terminalMode != TERMINAL_MODE_EDEFAULT;
			case CimPackage.TELNET_SETTING_DATA__OTHER_TERMINAL_MODE:
				return OTHER_TERMINAL_MODE_EDEFAULT == null ? otherTerminalMode != null : !OTHER_TERMINAL_MODE_EDEFAULT.equals(otherTerminalMode);
			case CimPackage.TELNET_SETTING_DATA__ENABLED_CHARACTER_DISPLAY_MODES:
				return enabledCharacterDisplayModes != ENABLED_CHARACTER_DISPLAY_MODES_EDEFAULT;
			case CimPackage.TELNET_SETTING_DATA__OTHER_ENABLED_CHARACTER_DISPLAY_MODE:
				return OTHER_ENABLED_CHARACTER_DISPLAY_MODE_EDEFAULT == null ? otherEnabledCharacterDisplayMode != null : !OTHER_ENABLED_CHARACTER_DISPLAY_MODE_EDEFAULT.equals(otherEnabledCharacterDisplayMode);
			case CimPackage.TELNET_SETTING_DATA__CHARACTER_DISPLAY_MODE:
				return characterDisplayMode != CHARACTER_DISPLAY_MODE_EDEFAULT;
			case CimPackage.TELNET_SETTING_DATA__OTHER_CHARACTER_DISPLAY_MODE:
				return OTHER_CHARACTER_DISPLAY_MODE_EDEFAULT == null ? otherCharacterDisplayMode != null : !OTHER_CHARACTER_DISPLAY_MODE_EDEFAULT.equals(otherCharacterDisplayMode);
			case CimPackage.TELNET_SETTING_DATA__ESCAPE_CHARACTER:
				return ESCAPE_CHARACTER_EDEFAULT == null ? escapeCharacter != null : !ESCAPE_CHARACTER_EDEFAULT.equals(escapeCharacter);
			case CimPackage.TELNET_SETTING_DATA__IDLE_TIMEOUT:
				return idleTimeout != IDLE_TIMEOUT_EDEFAULT;
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
		result.append(" (enabledTerminalModes: ");
		result.append(enabledTerminalModes);
		result.append(", otherEnabledTerminalMode: ");
		result.append(otherEnabledTerminalMode);
		result.append(", terminalMode: ");
		result.append(terminalMode);
		result.append(", otherTerminalMode: ");
		result.append(otherTerminalMode);
		result.append(", enabledCharacterDisplayModes: ");
		result.append(enabledCharacterDisplayModes);
		result.append(", otherEnabledCharacterDisplayMode: ");
		result.append(otherEnabledCharacterDisplayMode);
		result.append(", characterDisplayMode: ");
		result.append(characterDisplayMode);
		result.append(", otherCharacterDisplayMode: ");
		result.append(otherCharacterDisplayMode);
		result.append(", escapeCharacter: ");
		result.append(escapeCharacter);
		result.append(", idleTimeout: ");
		result.append(idleTimeout);
		result.append(')');
		return result.toString();
	}

} //TelnetSettingDataImpl
