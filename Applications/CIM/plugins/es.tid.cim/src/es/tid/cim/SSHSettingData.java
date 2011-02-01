/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSH Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.SSHSettingData#getEnabledSSHVersions <em>Enabled SSH Versions</em>}</li>
 *   <li>{@link es.tid.cim.SSHSettingData#getOtherEnabledSSHVersion <em>Other Enabled SSH Version</em>}</li>
 *   <li>{@link es.tid.cim.SSHSettingData#getSSHVersion <em>SSH Version</em>}</li>
 *   <li>{@link es.tid.cim.SSHSettingData#getEnabledEncryptionAlgorithms <em>Enabled Encryption Algorithms</em>}</li>
 *   <li>{@link es.tid.cim.SSHSettingData#getOtherEnabledEncryptionAlgorithm <em>Other Enabled Encryption Algorithm</em>}</li>
 *   <li>{@link es.tid.cim.SSHSettingData#getIdleTimeout <em>Idle Timeout</em>}</li>
 *   <li>{@link es.tid.cim.SSHSettingData#isKeepAlive <em>Keep Alive</em>}</li>
 *   <li>{@link es.tid.cim.SSHSettingData#isForwardX11 <em>Forward X11</em>}</li>
 *   <li>{@link es.tid.cim.SSHSettingData#isCompression <em>Compression</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getSSHSettingData()
 * @model
 * @generated
 */
public interface SSHSettingData extends SettingData {
	/**
	 * Returns the value of the '<em><b>Enabled SSH Versions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled SSH Versions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled SSH Versions</em>' attribute.
	 * @see #setEnabledSSHVersions(String)
	 * @see es.tid.cim.CimPackage#getSSHSettingData_EnabledSSHVersions()
	 * @model
	 * @generated
	 */
	String getEnabledSSHVersions();

	/**
	 * Sets the value of the '{@link es.tid.cim.SSHSettingData#getEnabledSSHVersions <em>Enabled SSH Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled SSH Versions</em>' attribute.
	 * @see #getEnabledSSHVersions()
	 * @generated
	 */
	void setEnabledSSHVersions(String value);

	/**
	 * Returns the value of the '<em><b>Other Enabled SSH Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Enabled SSH Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Enabled SSH Version</em>' attribute.
	 * @see #setOtherEnabledSSHVersion(String)
	 * @see es.tid.cim.CimPackage#getSSHSettingData_OtherEnabledSSHVersion()
	 * @model
	 * @generated
	 */
	String getOtherEnabledSSHVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.SSHSettingData#getOtherEnabledSSHVersion <em>Other Enabled SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Enabled SSH Version</em>' attribute.
	 * @see #getOtherEnabledSSHVersion()
	 * @generated
	 */
	void setOtherEnabledSSHVersion(String value);

	/**
	 * Returns the value of the '<em><b>SSH Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SSH Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SSH Version</em>' attribute.
	 * @see #setSSHVersion(String)
	 * @see es.tid.cim.CimPackage#getSSHSettingData_SSHVersion()
	 * @model
	 * @generated
	 */
	String getSSHVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.SSHSettingData#getSSHVersion <em>SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSH Version</em>' attribute.
	 * @see #getSSHVersion()
	 * @generated
	 */
	void setSSHVersion(String value);

	/**
	 * Returns the value of the '<em><b>Enabled Encryption Algorithms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled Encryption Algorithms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled Encryption Algorithms</em>' attribute.
	 * @see #setEnabledEncryptionAlgorithms(String)
	 * @see es.tid.cim.CimPackage#getSSHSettingData_EnabledEncryptionAlgorithms()
	 * @model
	 * @generated
	 */
	String getEnabledEncryptionAlgorithms();

	/**
	 * Sets the value of the '{@link es.tid.cim.SSHSettingData#getEnabledEncryptionAlgorithms <em>Enabled Encryption Algorithms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled Encryption Algorithms</em>' attribute.
	 * @see #getEnabledEncryptionAlgorithms()
	 * @generated
	 */
	void setEnabledEncryptionAlgorithms(String value);

	/**
	 * Returns the value of the '<em><b>Other Enabled Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Enabled Encryption Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Enabled Encryption Algorithm</em>' attribute.
	 * @see #setOtherEnabledEncryptionAlgorithm(String)
	 * @see es.tid.cim.CimPackage#getSSHSettingData_OtherEnabledEncryptionAlgorithm()
	 * @model
	 * @generated
	 */
	String getOtherEnabledEncryptionAlgorithm();

	/**
	 * Sets the value of the '{@link es.tid.cim.SSHSettingData#getOtherEnabledEncryptionAlgorithm <em>Other Enabled Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Enabled Encryption Algorithm</em>' attribute.
	 * @see #getOtherEnabledEncryptionAlgorithm()
	 * @generated
	 */
	void setOtherEnabledEncryptionAlgorithm(String value);

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
	 * @see es.tid.cim.CimPackage#getSSHSettingData_IdleTimeout()
	 * @model
	 * @generated
	 */
	int getIdleTimeout();

	/**
	 * Sets the value of the '{@link es.tid.cim.SSHSettingData#getIdleTimeout <em>Idle Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle Timeout</em>' attribute.
	 * @see #getIdleTimeout()
	 * @generated
	 */
	void setIdleTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Keep Alive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Alive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Alive</em>' attribute.
	 * @see #setKeepAlive(boolean)
	 * @see es.tid.cim.CimPackage#getSSHSettingData_KeepAlive()
	 * @model
	 * @generated
	 */
	boolean isKeepAlive();

	/**
	 * Sets the value of the '{@link es.tid.cim.SSHSettingData#isKeepAlive <em>Keep Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Alive</em>' attribute.
	 * @see #isKeepAlive()
	 * @generated
	 */
	void setKeepAlive(boolean value);

	/**
	 * Returns the value of the '<em><b>Forward X11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward X11</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward X11</em>' attribute.
	 * @see #setForwardX11(boolean)
	 * @see es.tid.cim.CimPackage#getSSHSettingData_ForwardX11()
	 * @model
	 * @generated
	 */
	boolean isForwardX11();

	/**
	 * Sets the value of the '{@link es.tid.cim.SSHSettingData#isForwardX11 <em>Forward X11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward X11</em>' attribute.
	 * @see #isForwardX11()
	 * @generated
	 */
	void setForwardX11(boolean value);

	/**
	 * Returns the value of the '<em><b>Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression</em>' attribute.
	 * @see #setCompression(boolean)
	 * @see es.tid.cim.CimPackage#getSSHSettingData_Compression()
	 * @model
	 * @generated
	 */
	boolean isCompression();

	/**
	 * Sets the value of the '{@link es.tid.cim.SSHSettingData#isCompression <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression</em>' attribute.
	 * @see #isCompression()
	 * @generated
	 */
	void setCompression(boolean value);

} // SSHSettingData
