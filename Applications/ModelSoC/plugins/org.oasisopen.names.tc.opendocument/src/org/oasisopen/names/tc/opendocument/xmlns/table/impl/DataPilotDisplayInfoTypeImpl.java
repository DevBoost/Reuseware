/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DisplayMemberModeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pilot Display Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotDisplayInfoTypeImpl#getDataField <em>Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotDisplayInfoTypeImpl#getDisplayMemberMode <em>Display Member Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotDisplayInfoTypeImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotDisplayInfoTypeImpl#getMemberCount <em>Member Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPilotDisplayInfoTypeImpl extends EObjectImpl implements DataPilotDisplayInfoType {
	/**
	 * The default value of the '{@link #getDataField() <em>Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataField()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataField() <em>Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataField()
	 * @generated
	 * @ordered
	 */
	protected String dataField = DATA_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayMemberMode() <em>Display Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayMemberMode()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayMemberModeType DISPLAY_MEMBER_MODE_EDEFAULT = DisplayMemberModeType.FROM_TOP;

	/**
	 * The cached value of the '{@link #getDisplayMemberMode() <em>Display Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayMemberMode()
	 * @generated
	 * @ordered
	 */
	protected DisplayMemberModeType displayMemberMode = DISPLAY_MEMBER_MODE_EDEFAULT;

	/**
	 * This is true if the Display Member Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayMemberModeESet;

	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ENABLED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean enabled = ENABLED_EDEFAULT;

	/**
	 * This is true if the Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enabledESet;

	/**
	 * The default value of the '{@link #getMemberCount() <em>Member Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MEMBER_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberCount() <em>Member Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger memberCount = MEMBER_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPilotDisplayInfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDataPilotDisplayInfoType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataField() {
		return dataField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataField(String newDataField) {
		String oldDataField = dataField;
		dataField = newDataField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__DATA_FIELD, oldDataField, dataField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayMemberModeType getDisplayMemberMode() {
		return displayMemberMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayMemberMode(DisplayMemberModeType newDisplayMemberMode) {
		DisplayMemberModeType oldDisplayMemberMode = displayMemberMode;
		displayMemberMode = newDisplayMemberMode == null ? DISPLAY_MEMBER_MODE_EDEFAULT : newDisplayMemberMode;
		boolean oldDisplayMemberModeESet = displayMemberModeESet;
		displayMemberModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__DISPLAY_MEMBER_MODE, oldDisplayMemberMode, displayMemberMode, !oldDisplayMemberModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayMemberMode() {
		DisplayMemberModeType oldDisplayMemberMode = displayMemberMode;
		boolean oldDisplayMemberModeESet = displayMemberModeESet;
		displayMemberMode = DISPLAY_MEMBER_MODE_EDEFAULT;
		displayMemberModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__DISPLAY_MEMBER_MODE, oldDisplayMemberMode, DISPLAY_MEMBER_MODE_EDEFAULT, oldDisplayMemberModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayMemberMode() {
		return displayMemberModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newEnabled) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEnabled = enabled;
		enabled = newEnabled == null ? ENABLED_EDEFAULT : newEnabled;
		boolean oldEnabledESet = enabledESet;
		enabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnabled() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldEnabled = enabled;
		boolean oldEnabledESet = enabledESet;
		enabled = ENABLED_EDEFAULT;
		enabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnabled() {
		return enabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMemberCount() {
		return memberCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberCount(BigInteger newMemberCount) {
		BigInteger oldMemberCount = memberCount;
		memberCount = newMemberCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__MEMBER_COUNT, oldMemberCount, memberCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__DATA_FIELD:
				return getDataField();
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__DISPLAY_MEMBER_MODE:
				return getDisplayMemberMode();
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__ENABLED:
				return getEnabled();
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__MEMBER_COUNT:
				return getMemberCount();
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
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__DATA_FIELD:
				setDataField((String)newValue);
				return;
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__DISPLAY_MEMBER_MODE:
				setDisplayMemberMode((DisplayMemberModeType)newValue);
				return;
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__ENABLED:
				setEnabled((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__MEMBER_COUNT:
				setMemberCount((BigInteger)newValue);
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
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__DATA_FIELD:
				setDataField(DATA_FIELD_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__DISPLAY_MEMBER_MODE:
				unsetDisplayMemberMode();
				return;
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__ENABLED:
				unsetEnabled();
				return;
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__MEMBER_COUNT:
				setMemberCount(MEMBER_COUNT_EDEFAULT);
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
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__DATA_FIELD:
				return DATA_FIELD_EDEFAULT == null ? dataField != null : !DATA_FIELD_EDEFAULT.equals(dataField);
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__DISPLAY_MEMBER_MODE:
				return isSetDisplayMemberMode();
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__ENABLED:
				return isSetEnabled();
			case TablePackage.DATA_PILOT_DISPLAY_INFO_TYPE__MEMBER_COUNT:
				return MEMBER_COUNT_EDEFAULT == null ? memberCount != null : !MEMBER_COUNT_EDEFAULT.equals(memberCount);
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
		result.append(" (dataField: ");
		result.append(dataField);
		result.append(", displayMemberMode: ");
		if (displayMemberModeESet) result.append(displayMemberMode); else result.append("<unset>");
		result.append(", enabled: ");
		if (enabledESet) result.append(enabled); else result.append("<unset>");
		result.append(", memberCount: ");
		result.append(memberCount);
		result.append(')');
		return result.toString();
	}

} //DataPilotDisplayInfoTypeImpl
