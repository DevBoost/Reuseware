/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telnet Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.TelnetSettingData#getEnabledTerminalModes <em>Enabled Terminal Modes</em>}</li>
 *   <li>{@link es.tid.cim.TelnetSettingData#getOtherEnabledTerminalMode <em>Other Enabled Terminal Mode</em>}</li>
 *   <li>{@link es.tid.cim.TelnetSettingData#getTerminalMode <em>Terminal Mode</em>}</li>
 *   <li>{@link es.tid.cim.TelnetSettingData#getOtherTerminalMode <em>Other Terminal Mode</em>}</li>
 *   <li>{@link es.tid.cim.TelnetSettingData#getEnabledCharacterDisplayModes <em>Enabled Character Display Modes</em>}</li>
 *   <li>{@link es.tid.cim.TelnetSettingData#getOtherEnabledCharacterDisplayMode <em>Other Enabled Character Display Mode</em>}</li>
 *   <li>{@link es.tid.cim.TelnetSettingData#getCharacterDisplayMode <em>Character Display Mode</em>}</li>
 *   <li>{@link es.tid.cim.TelnetSettingData#getOtherCharacterDisplayMode <em>Other Character Display Mode</em>}</li>
 *   <li>{@link es.tid.cim.TelnetSettingData#getEscapeCharacter <em>Escape Character</em>}</li>
 *   <li>{@link es.tid.cim.TelnetSettingData#getIdleTimeout <em>Idle Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getTelnetSettingData()
 * @model
 * @generated
 */
public interface TelnetSettingData extends SettingData {
	/**
	 * Returns the value of the '<em><b>Enabled Terminal Modes</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumTerminalMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled Terminal Modes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled Terminal Modes</em>' attribute.
	 * @see es.tid.cim.EnumTerminalMode
	 * @see #setEnabledTerminalModes(EnumTerminalMode)
	 * @see es.tid.cim.CimPackage#getTelnetSettingData_EnabledTerminalModes()
	 * @model
	 * @generated
	 */
	EnumTerminalMode getEnabledTerminalModes();

	/**
	 * Sets the value of the '{@link es.tid.cim.TelnetSettingData#getEnabledTerminalModes <em>Enabled Terminal Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled Terminal Modes</em>' attribute.
	 * @see es.tid.cim.EnumTerminalMode
	 * @see #getEnabledTerminalModes()
	 * @generated
	 */
	void setEnabledTerminalModes(EnumTerminalMode value);

	/**
	 * Returns the value of the '<em><b>Other Enabled Terminal Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Enabled Terminal Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Enabled Terminal Mode</em>' attribute.
	 * @see #setOtherEnabledTerminalMode(String)
	 * @see es.tid.cim.CimPackage#getTelnetSettingData_OtherEnabledTerminalMode()
	 * @model
	 * @generated
	 */
	String getOtherEnabledTerminalMode();

	/**
	 * Sets the value of the '{@link es.tid.cim.TelnetSettingData#getOtherEnabledTerminalMode <em>Other Enabled Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Enabled Terminal Mode</em>' attribute.
	 * @see #getOtherEnabledTerminalMode()
	 * @generated
	 */
	void setOtherEnabledTerminalMode(String value);

	/**
	 * Returns the value of the '<em><b>Terminal Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumTerminalMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Mode</em>' attribute.
	 * @see es.tid.cim.EnumTerminalMode
	 * @see #setTerminalMode(EnumTerminalMode)
	 * @see es.tid.cim.CimPackage#getTelnetSettingData_TerminalMode()
	 * @model
	 * @generated
	 */
	EnumTerminalMode getTerminalMode();

	/**
	 * Sets the value of the '{@link es.tid.cim.TelnetSettingData#getTerminalMode <em>Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Mode</em>' attribute.
	 * @see es.tid.cim.EnumTerminalMode
	 * @see #getTerminalMode()
	 * @generated
	 */
	void setTerminalMode(EnumTerminalMode value);

	/**
	 * Returns the value of the '<em><b>Other Terminal Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Terminal Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Terminal Mode</em>' attribute.
	 * @see #setOtherTerminalMode(String)
	 * @see es.tid.cim.CimPackage#getTelnetSettingData_OtherTerminalMode()
	 * @model
	 * @generated
	 */
	String getOtherTerminalMode();

	/**
	 * Sets the value of the '{@link es.tid.cim.TelnetSettingData#getOtherTerminalMode <em>Other Terminal Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Terminal Mode</em>' attribute.
	 * @see #getOtherTerminalMode()
	 * @generated
	 */
	void setOtherTerminalMode(String value);

	/**
	 * Returns the value of the '<em><b>Enabled Character Display Modes</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumCharacterDisplayMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled Character Display Modes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled Character Display Modes</em>' attribute.
	 * @see es.tid.cim.EnumCharacterDisplayMode
	 * @see #setEnabledCharacterDisplayModes(EnumCharacterDisplayMode)
	 * @see es.tid.cim.CimPackage#getTelnetSettingData_EnabledCharacterDisplayModes()
	 * @model
	 * @generated
	 */
	EnumCharacterDisplayMode getEnabledCharacterDisplayModes();

	/**
	 * Sets the value of the '{@link es.tid.cim.TelnetSettingData#getEnabledCharacterDisplayModes <em>Enabled Character Display Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled Character Display Modes</em>' attribute.
	 * @see es.tid.cim.EnumCharacterDisplayMode
	 * @see #getEnabledCharacterDisplayModes()
	 * @generated
	 */
	void setEnabledCharacterDisplayModes(EnumCharacterDisplayMode value);

	/**
	 * Returns the value of the '<em><b>Other Enabled Character Display Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Enabled Character Display Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Enabled Character Display Mode</em>' attribute.
	 * @see #setOtherEnabledCharacterDisplayMode(String)
	 * @see es.tid.cim.CimPackage#getTelnetSettingData_OtherEnabledCharacterDisplayMode()
	 * @model
	 * @generated
	 */
	String getOtherEnabledCharacterDisplayMode();

	/**
	 * Sets the value of the '{@link es.tid.cim.TelnetSettingData#getOtherEnabledCharacterDisplayMode <em>Other Enabled Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Enabled Character Display Mode</em>' attribute.
	 * @see #getOtherEnabledCharacterDisplayMode()
	 * @generated
	 */
	void setOtherEnabledCharacterDisplayMode(String value);

	/**
	 * Returns the value of the '<em><b>Character Display Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumCharacterDisplayMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Display Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Display Mode</em>' attribute.
	 * @see es.tid.cim.EnumCharacterDisplayMode
	 * @see #setCharacterDisplayMode(EnumCharacterDisplayMode)
	 * @see es.tid.cim.CimPackage#getTelnetSettingData_CharacterDisplayMode()
	 * @model
	 * @generated
	 */
	EnumCharacterDisplayMode getCharacterDisplayMode();

	/**
	 * Sets the value of the '{@link es.tid.cim.TelnetSettingData#getCharacterDisplayMode <em>Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Display Mode</em>' attribute.
	 * @see es.tid.cim.EnumCharacterDisplayMode
	 * @see #getCharacterDisplayMode()
	 * @generated
	 */
	void setCharacterDisplayMode(EnumCharacterDisplayMode value);

	/**
	 * Returns the value of the '<em><b>Other Character Display Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Character Display Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Character Display Mode</em>' attribute.
	 * @see #setOtherCharacterDisplayMode(String)
	 * @see es.tid.cim.CimPackage#getTelnetSettingData_OtherCharacterDisplayMode()
	 * @model
	 * @generated
	 */
	String getOtherCharacterDisplayMode();

	/**
	 * Sets the value of the '{@link es.tid.cim.TelnetSettingData#getOtherCharacterDisplayMode <em>Other Character Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Character Display Mode</em>' attribute.
	 * @see #getOtherCharacterDisplayMode()
	 * @generated
	 */
	void setOtherCharacterDisplayMode(String value);

	/**
	 * Returns the value of the '<em><b>Escape Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escape Character</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escape Character</em>' attribute.
	 * @see #setEscapeCharacter(String)
	 * @see es.tid.cim.CimPackage#getTelnetSettingData_EscapeCharacter()
	 * @model
	 * @generated
	 */
	String getEscapeCharacter();

	/**
	 * Sets the value of the '{@link es.tid.cim.TelnetSettingData#getEscapeCharacter <em>Escape Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape Character</em>' attribute.
	 * @see #getEscapeCharacter()
	 * @generated
	 */
	void setEscapeCharacter(String value);

	/**
	 * Returns the value of the '<em><b>Idle Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idle Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idle Timeout</em>' attribute.
	 * @see #setIdleTimeout(int)
	 * @see es.tid.cim.CimPackage#getTelnetSettingData_IdleTimeout()
	 * @model
	 * @generated
	 */
	int getIdleTimeout();

	/**
	 * Sets the value of the '{@link es.tid.cim.TelnetSettingData#getIdleTimeout <em>Idle Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle Timeout</em>' attribute.
	 * @see #getIdleTimeout()
	 * @generated
	 */
	void setIdleTimeout(int value);

} // TelnetSettingData
