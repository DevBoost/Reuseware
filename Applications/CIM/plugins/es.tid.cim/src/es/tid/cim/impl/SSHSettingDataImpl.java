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
import es.tid.cim.SSHSettingData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSH Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.SSHSettingDataImpl#getEnabledSSHVersions <em>Enabled SSH Versions</em>}</li>
 *   <li>{@link es.tid.cim.impl.SSHSettingDataImpl#getOtherEnabledSSHVersion <em>Other Enabled SSH Version</em>}</li>
 *   <li>{@link es.tid.cim.impl.SSHSettingDataImpl#getSSHVersion <em>SSH Version</em>}</li>
 *   <li>{@link es.tid.cim.impl.SSHSettingDataImpl#getEnabledEncryptionAlgorithms <em>Enabled Encryption Algorithms</em>}</li>
 *   <li>{@link es.tid.cim.impl.SSHSettingDataImpl#getOtherEnabledEncryptionAlgorithm <em>Other Enabled Encryption Algorithm</em>}</li>
 *   <li>{@link es.tid.cim.impl.SSHSettingDataImpl#getIdleTimeout <em>Idle Timeout</em>}</li>
 *   <li>{@link es.tid.cim.impl.SSHSettingDataImpl#isKeepAlive <em>Keep Alive</em>}</li>
 *   <li>{@link es.tid.cim.impl.SSHSettingDataImpl#isForwardX11 <em>Forward X11</em>}</li>
 *   <li>{@link es.tid.cim.impl.SSHSettingDataImpl#isCompression <em>Compression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SSHSettingDataImpl extends SettingDataImpl implements SSHSettingData {
	/**
	 * The default value of the '{@link #getEnabledSSHVersions() <em>Enabled SSH Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledSSHVersions()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLED_SSH_VERSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabledSSHVersions() <em>Enabled SSH Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledSSHVersions()
	 * @generated
	 * @ordered
	 */
	protected String enabledSSHVersions = ENABLED_SSH_VERSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEnabledSSHVersion() <em>Other Enabled SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledSSHVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENABLED_SSH_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEnabledSSHVersion() <em>Other Enabled SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledSSHVersion()
	 * @generated
	 * @ordered
	 */
	protected String otherEnabledSSHVersion = OTHER_ENABLED_SSH_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSHVersion() <em>SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSHVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSHVersion() <em>SSH Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSHVersion()
	 * @generated
	 * @ordered
	 */
	protected String sshVersion = SSH_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabledEncryptionAlgorithms() <em>Enabled Encryption Algorithms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledEncryptionAlgorithms()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLED_ENCRYPTION_ALGORITHMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabledEncryptionAlgorithms() <em>Enabled Encryption Algorithms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledEncryptionAlgorithms()
	 * @generated
	 * @ordered
	 */
	protected String enabledEncryptionAlgorithms = ENABLED_ENCRYPTION_ALGORITHMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEnabledEncryptionAlgorithm() <em>Other Enabled Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENABLED_ENCRYPTION_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEnabledEncryptionAlgorithm() <em>Other Enabled Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String otherEnabledEncryptionAlgorithm = OTHER_ENABLED_ENCRYPTION_ALGORITHM_EDEFAULT;

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
	 * The default value of the '{@link #isKeepAlive() <em>Keep Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeepAlive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEEP_ALIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKeepAlive() <em>Keep Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeepAlive()
	 * @generated
	 * @ordered
	 */
	protected boolean keepAlive = KEEP_ALIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isForwardX11() <em>Forward X11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForwardX11()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORWARD_X11_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForwardX11() <em>Forward X11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForwardX11()
	 * @generated
	 * @ordered
	 */
	protected boolean forwardX11 = FORWARD_X11_EDEFAULT;

	/**
	 * The default value of the '{@link #isCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompression()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPRESSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCompression() <em>Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompression()
	 * @generated
	 * @ordered
	 */
	protected boolean compression = COMPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SSHSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getSSHSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnabledSSHVersions() {
		return enabledSSHVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabledSSHVersions(String newEnabledSSHVersions) {
		String oldEnabledSSHVersions = enabledSSHVersions;
		enabledSSHVersions = newEnabledSSHVersions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SSH_SETTING_DATA__ENABLED_SSH_VERSIONS, oldEnabledSSHVersions, enabledSSHVersions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherEnabledSSHVersion() {
		return otherEnabledSSHVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherEnabledSSHVersion(String newOtherEnabledSSHVersion) {
		String oldOtherEnabledSSHVersion = otherEnabledSSHVersion;
		otherEnabledSSHVersion = newOtherEnabledSSHVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SSH_SETTING_DATA__OTHER_ENABLED_SSH_VERSION, oldOtherEnabledSSHVersion, otherEnabledSSHVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSSHVersion() {
		return sshVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSSHVersion(String newSSHVersion) {
		String oldSSHVersion = sshVersion;
		sshVersion = newSSHVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SSH_SETTING_DATA__SSH_VERSION, oldSSHVersion, sshVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnabledEncryptionAlgorithms() {
		return enabledEncryptionAlgorithms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabledEncryptionAlgorithms(String newEnabledEncryptionAlgorithms) {
		String oldEnabledEncryptionAlgorithms = enabledEncryptionAlgorithms;
		enabledEncryptionAlgorithms = newEnabledEncryptionAlgorithms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SSH_SETTING_DATA__ENABLED_ENCRYPTION_ALGORITHMS, oldEnabledEncryptionAlgorithms, enabledEncryptionAlgorithms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherEnabledEncryptionAlgorithm() {
		return otherEnabledEncryptionAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherEnabledEncryptionAlgorithm(String newOtherEnabledEncryptionAlgorithm) {
		String oldOtherEnabledEncryptionAlgorithm = otherEnabledEncryptionAlgorithm;
		otherEnabledEncryptionAlgorithm = newOtherEnabledEncryptionAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SSH_SETTING_DATA__OTHER_ENABLED_ENCRYPTION_ALGORITHM, oldOtherEnabledEncryptionAlgorithm, otherEnabledEncryptionAlgorithm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SSH_SETTING_DATA__IDLE_TIMEOUT, oldIdleTimeout, idleTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKeepAlive() {
		return keepAlive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepAlive(boolean newKeepAlive) {
		boolean oldKeepAlive = keepAlive;
		keepAlive = newKeepAlive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SSH_SETTING_DATA__KEEP_ALIVE, oldKeepAlive, keepAlive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForwardX11() {
		return forwardX11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardX11(boolean newForwardX11) {
		boolean oldForwardX11 = forwardX11;
		forwardX11 = newForwardX11;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SSH_SETTING_DATA__FORWARD_X11, oldForwardX11, forwardX11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompression() {
		return compression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompression(boolean newCompression) {
		boolean oldCompression = compression;
		compression = newCompression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SSH_SETTING_DATA__COMPRESSION, oldCompression, compression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.SSH_SETTING_DATA__ENABLED_SSH_VERSIONS:
				return getEnabledSSHVersions();
			case CimPackage.SSH_SETTING_DATA__OTHER_ENABLED_SSH_VERSION:
				return getOtherEnabledSSHVersion();
			case CimPackage.SSH_SETTING_DATA__SSH_VERSION:
				return getSSHVersion();
			case CimPackage.SSH_SETTING_DATA__ENABLED_ENCRYPTION_ALGORITHMS:
				return getEnabledEncryptionAlgorithms();
			case CimPackage.SSH_SETTING_DATA__OTHER_ENABLED_ENCRYPTION_ALGORITHM:
				return getOtherEnabledEncryptionAlgorithm();
			case CimPackage.SSH_SETTING_DATA__IDLE_TIMEOUT:
				return getIdleTimeout();
			case CimPackage.SSH_SETTING_DATA__KEEP_ALIVE:
				return isKeepAlive();
			case CimPackage.SSH_SETTING_DATA__FORWARD_X11:
				return isForwardX11();
			case CimPackage.SSH_SETTING_DATA__COMPRESSION:
				return isCompression();
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
			case CimPackage.SSH_SETTING_DATA__ENABLED_SSH_VERSIONS:
				setEnabledSSHVersions((String)newValue);
				return;
			case CimPackage.SSH_SETTING_DATA__OTHER_ENABLED_SSH_VERSION:
				setOtherEnabledSSHVersion((String)newValue);
				return;
			case CimPackage.SSH_SETTING_DATA__SSH_VERSION:
				setSSHVersion((String)newValue);
				return;
			case CimPackage.SSH_SETTING_DATA__ENABLED_ENCRYPTION_ALGORITHMS:
				setEnabledEncryptionAlgorithms((String)newValue);
				return;
			case CimPackage.SSH_SETTING_DATA__OTHER_ENABLED_ENCRYPTION_ALGORITHM:
				setOtherEnabledEncryptionAlgorithm((String)newValue);
				return;
			case CimPackage.SSH_SETTING_DATA__IDLE_TIMEOUT:
				setIdleTimeout((Integer)newValue);
				return;
			case CimPackage.SSH_SETTING_DATA__KEEP_ALIVE:
				setKeepAlive((Boolean)newValue);
				return;
			case CimPackage.SSH_SETTING_DATA__FORWARD_X11:
				setForwardX11((Boolean)newValue);
				return;
			case CimPackage.SSH_SETTING_DATA__COMPRESSION:
				setCompression((Boolean)newValue);
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
			case CimPackage.SSH_SETTING_DATA__ENABLED_SSH_VERSIONS:
				setEnabledSSHVersions(ENABLED_SSH_VERSIONS_EDEFAULT);
				return;
			case CimPackage.SSH_SETTING_DATA__OTHER_ENABLED_SSH_VERSION:
				setOtherEnabledSSHVersion(OTHER_ENABLED_SSH_VERSION_EDEFAULT);
				return;
			case CimPackage.SSH_SETTING_DATA__SSH_VERSION:
				setSSHVersion(SSH_VERSION_EDEFAULT);
				return;
			case CimPackage.SSH_SETTING_DATA__ENABLED_ENCRYPTION_ALGORITHMS:
				setEnabledEncryptionAlgorithms(ENABLED_ENCRYPTION_ALGORITHMS_EDEFAULT);
				return;
			case CimPackage.SSH_SETTING_DATA__OTHER_ENABLED_ENCRYPTION_ALGORITHM:
				setOtherEnabledEncryptionAlgorithm(OTHER_ENABLED_ENCRYPTION_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.SSH_SETTING_DATA__IDLE_TIMEOUT:
				setIdleTimeout(IDLE_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.SSH_SETTING_DATA__KEEP_ALIVE:
				setKeepAlive(KEEP_ALIVE_EDEFAULT);
				return;
			case CimPackage.SSH_SETTING_DATA__FORWARD_X11:
				setForwardX11(FORWARD_X11_EDEFAULT);
				return;
			case CimPackage.SSH_SETTING_DATA__COMPRESSION:
				setCompression(COMPRESSION_EDEFAULT);
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
			case CimPackage.SSH_SETTING_DATA__ENABLED_SSH_VERSIONS:
				return ENABLED_SSH_VERSIONS_EDEFAULT == null ? enabledSSHVersions != null : !ENABLED_SSH_VERSIONS_EDEFAULT.equals(enabledSSHVersions);
			case CimPackage.SSH_SETTING_DATA__OTHER_ENABLED_SSH_VERSION:
				return OTHER_ENABLED_SSH_VERSION_EDEFAULT == null ? otherEnabledSSHVersion != null : !OTHER_ENABLED_SSH_VERSION_EDEFAULT.equals(otherEnabledSSHVersion);
			case CimPackage.SSH_SETTING_DATA__SSH_VERSION:
				return SSH_VERSION_EDEFAULT == null ? sshVersion != null : !SSH_VERSION_EDEFAULT.equals(sshVersion);
			case CimPackage.SSH_SETTING_DATA__ENABLED_ENCRYPTION_ALGORITHMS:
				return ENABLED_ENCRYPTION_ALGORITHMS_EDEFAULT == null ? enabledEncryptionAlgorithms != null : !ENABLED_ENCRYPTION_ALGORITHMS_EDEFAULT.equals(enabledEncryptionAlgorithms);
			case CimPackage.SSH_SETTING_DATA__OTHER_ENABLED_ENCRYPTION_ALGORITHM:
				return OTHER_ENABLED_ENCRYPTION_ALGORITHM_EDEFAULT == null ? otherEnabledEncryptionAlgorithm != null : !OTHER_ENABLED_ENCRYPTION_ALGORITHM_EDEFAULT.equals(otherEnabledEncryptionAlgorithm);
			case CimPackage.SSH_SETTING_DATA__IDLE_TIMEOUT:
				return idleTimeout != IDLE_TIMEOUT_EDEFAULT;
			case CimPackage.SSH_SETTING_DATA__KEEP_ALIVE:
				return keepAlive != KEEP_ALIVE_EDEFAULT;
			case CimPackage.SSH_SETTING_DATA__FORWARD_X11:
				return forwardX11 != FORWARD_X11_EDEFAULT;
			case CimPackage.SSH_SETTING_DATA__COMPRESSION:
				return compression != COMPRESSION_EDEFAULT;
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
		result.append(" (enabledSSHVersions: ");
		result.append(enabledSSHVersions);
		result.append(", otherEnabledSSHVersion: ");
		result.append(otherEnabledSSHVersion);
		result.append(", SSHVersion: ");
		result.append(sshVersion);
		result.append(", enabledEncryptionAlgorithms: ");
		result.append(enabledEncryptionAlgorithms);
		result.append(", otherEnabledEncryptionAlgorithm: ");
		result.append(otherEnabledEncryptionAlgorithm);
		result.append(", idleTimeout: ");
		result.append(idleTimeout);
		result.append(", keepAlive: ");
		result.append(keepAlive);
		result.append(", forwardX11: ");
		result.append(forwardX11);
		result.append(", compression: ");
		result.append(compression);
		result.append(')');
		return result.toString();
	}

} //SSHSettingDataImpl
