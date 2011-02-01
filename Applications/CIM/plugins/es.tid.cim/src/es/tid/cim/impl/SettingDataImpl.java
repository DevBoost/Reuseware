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

import es.tid.cim.Capabilities;
import es.tid.cim.CimPackage;
import es.tid.cim.EnumChangeableType;
import es.tid.cim.SettingData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.SettingDataImpl#getChangeableType <em>Changeable Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.SettingDataImpl#getConfigurationName <em>Configuration Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.SettingDataImpl#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link es.tid.cim.impl.SettingDataImpl#getSettingsDefineCapabilities <em>Settings Define Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SettingDataImpl extends ManagedElementImpl implements SettingData {
	/**
	 * The default value of the '{@link #getChangeableType() <em>Changeable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumChangeableType CHANGEABLE_TYPE_EDEFAULT = EnumChangeableType.NOT_CHANGEABLE_PERSISTENT;

	/**
	 * The cached value of the '{@link #getChangeableType() <em>Changeable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeableType()
	 * @generated
	 * @ordered
	 */
	protected EnumChangeableType changeableType = CHANGEABLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationName() <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationName() <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationName()
	 * @generated
	 * @ordered
	 */
	protected String configurationName = CONFIGURATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceID() <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String instanceID = INSTANCE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSettingsDefineCapabilities() <em>Settings Define Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingsDefineCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capabilities> settingsDefineCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumChangeableType getChangeableType() {
		return changeableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeableType(EnumChangeableType newChangeableType) {
		EnumChangeableType oldChangeableType = changeableType;
		changeableType = newChangeableType == null ? CHANGEABLE_TYPE_EDEFAULT : newChangeableType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SETTING_DATA__CHANGEABLE_TYPE, oldChangeableType, changeableType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationName() {
		return configurationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationName(String newConfigurationName) {
		String oldConfigurationName = configurationName;
		configurationName = newConfigurationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SETTING_DATA__CONFIGURATION_NAME, oldConfigurationName, configurationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceID() {
		return instanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceID(String newInstanceID) {
		String oldInstanceID = instanceID;
		instanceID = newInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SETTING_DATA__INSTANCE_ID, oldInstanceID, instanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capabilities> getSettingsDefineCapabilities() {
		if (settingsDefineCapabilities == null) {
			settingsDefineCapabilities = new EObjectResolvingEList<Capabilities>(Capabilities.class, this, CimPackage.SETTING_DATA__SETTINGS_DEFINE_CAPABILITIES);
		}
		return settingsDefineCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.SETTING_DATA__CHANGEABLE_TYPE:
				return getChangeableType();
			case CimPackage.SETTING_DATA__CONFIGURATION_NAME:
				return getConfigurationName();
			case CimPackage.SETTING_DATA__INSTANCE_ID:
				return getInstanceID();
			case CimPackage.SETTING_DATA__SETTINGS_DEFINE_CAPABILITIES:
				return getSettingsDefineCapabilities();
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
			case CimPackage.SETTING_DATA__CHANGEABLE_TYPE:
				setChangeableType((EnumChangeableType)newValue);
				return;
			case CimPackage.SETTING_DATA__CONFIGURATION_NAME:
				setConfigurationName((String)newValue);
				return;
			case CimPackage.SETTING_DATA__INSTANCE_ID:
				setInstanceID((String)newValue);
				return;
			case CimPackage.SETTING_DATA__SETTINGS_DEFINE_CAPABILITIES:
				getSettingsDefineCapabilities().clear();
				getSettingsDefineCapabilities().addAll((Collection<? extends Capabilities>)newValue);
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
			case CimPackage.SETTING_DATA__CHANGEABLE_TYPE:
				setChangeableType(CHANGEABLE_TYPE_EDEFAULT);
				return;
			case CimPackage.SETTING_DATA__CONFIGURATION_NAME:
				setConfigurationName(CONFIGURATION_NAME_EDEFAULT);
				return;
			case CimPackage.SETTING_DATA__INSTANCE_ID:
				setInstanceID(INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.SETTING_DATA__SETTINGS_DEFINE_CAPABILITIES:
				getSettingsDefineCapabilities().clear();
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
			case CimPackage.SETTING_DATA__CHANGEABLE_TYPE:
				return changeableType != CHANGEABLE_TYPE_EDEFAULT;
			case CimPackage.SETTING_DATA__CONFIGURATION_NAME:
				return CONFIGURATION_NAME_EDEFAULT == null ? configurationName != null : !CONFIGURATION_NAME_EDEFAULT.equals(configurationName);
			case CimPackage.SETTING_DATA__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceID != null : !INSTANCE_ID_EDEFAULT.equals(instanceID);
			case CimPackage.SETTING_DATA__SETTINGS_DEFINE_CAPABILITIES:
				return settingsDefineCapabilities != null && !settingsDefineCapabilities.isEmpty();
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
		result.append(" (changeableType: ");
		result.append(changeableType);
		result.append(", configurationName: ");
		result.append(configurationName);
		result.append(", instanceID: ");
		result.append(instanceID);
		result.append(')');
		return result.toString();
	}

} //SettingDataImpl
