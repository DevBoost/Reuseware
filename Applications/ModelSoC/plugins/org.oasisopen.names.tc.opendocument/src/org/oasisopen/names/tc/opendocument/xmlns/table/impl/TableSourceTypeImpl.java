/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.ModeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType;
import org.w3.xlink.ActuateType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableSourceTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableSourceTypeImpl#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableSourceTypeImpl#getFilterOptions <em>Filter Options</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableSourceTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableSourceTypeImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableSourceTypeImpl#getRefreshDelay <em>Refresh Delay</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableSourceTypeImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableSourceTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableSourceTypeImpl extends EObjectImpl implements TableSourceType {
	/**
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType1 ACTUATE_EDEFAULT = ActuateType1.ON_REQUEST;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType1 actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getFilterName() <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterName() <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected String filterName = FILTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilterOptions() <em>Filter Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOptions()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_OPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterOptions() <em>Filter Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOptions()
	 * @generated
	 * @ordered
	 */
	protected String filterOptions = FILTER_OPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ModeType MODE_EDEFAULT = ModeType.COPY_ALL;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ModeType mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * The default value of the '{@link #getRefreshDelay() <em>Refresh Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshDelay()
	 * @generated
	 * @ordered
	 */
	protected static final Duration REFRESH_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshDelay() <em>Refresh Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshDelay()
	 * @generated
	 * @ordered
	 */
	protected Duration refreshDelay = REFRESH_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.SIMPLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getTableSourceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType1 getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuate(ActuateType1 newActuate) {
		ActuateType1 oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_SOURCE_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActuate() {
		ActuateType1 oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_SOURCE_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterName() {
		return filterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterName(String newFilterName) {
		String oldFilterName = filterName;
		filterName = newFilterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_SOURCE_TYPE__FILTER_NAME, oldFilterName, filterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterOptions() {
		return filterOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterOptions(String newFilterOptions) {
		String oldFilterOptions = filterOptions;
		filterOptions = newFilterOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_SOURCE_TYPE__FILTER_OPTIONS, oldFilterOptions, filterOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_SOURCE_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ModeType newMode) {
		ModeType oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		boolean oldModeESet = modeESet;
		modeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_SOURCE_TYPE__MODE, oldMode, mode, !oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMode() {
		ModeType oldMode = mode;
		boolean oldModeESet = modeESet;
		mode = MODE_EDEFAULT;
		modeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_SOURCE_TYPE__MODE, oldMode, MODE_EDEFAULT, oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMode() {
		return modeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRefreshDelay() {
		return refreshDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshDelay(Duration newRefreshDelay) {
		Duration oldRefreshDelay = refreshDelay;
		refreshDelay = newRefreshDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_SOURCE_TYPE__REFRESH_DELAY, oldRefreshDelay, refreshDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_SOURCE_TYPE__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_SOURCE_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_SOURCE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.TABLE_SOURCE_TYPE__ACTUATE:
				return getActuate();
			case TablePackage.TABLE_SOURCE_TYPE__FILTER_NAME:
				return getFilterName();
			case TablePackage.TABLE_SOURCE_TYPE__FILTER_OPTIONS:
				return getFilterOptions();
			case TablePackage.TABLE_SOURCE_TYPE__HREF:
				return getHref();
			case TablePackage.TABLE_SOURCE_TYPE__MODE:
				return getMode();
			case TablePackage.TABLE_SOURCE_TYPE__REFRESH_DELAY:
				return getRefreshDelay();
			case TablePackage.TABLE_SOURCE_TYPE__TABLE_NAME:
				return getTableName();
			case TablePackage.TABLE_SOURCE_TYPE__TYPE:
				return getType();
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
			case TablePackage.TABLE_SOURCE_TYPE__ACTUATE:
				setActuate((ActuateType1)newValue);
				return;
			case TablePackage.TABLE_SOURCE_TYPE__FILTER_NAME:
				setFilterName((String)newValue);
				return;
			case TablePackage.TABLE_SOURCE_TYPE__FILTER_OPTIONS:
				setFilterOptions((String)newValue);
				return;
			case TablePackage.TABLE_SOURCE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case TablePackage.TABLE_SOURCE_TYPE__MODE:
				setMode((ModeType)newValue);
				return;
			case TablePackage.TABLE_SOURCE_TYPE__REFRESH_DELAY:
				setRefreshDelay((Duration)newValue);
				return;
			case TablePackage.TABLE_SOURCE_TYPE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case TablePackage.TABLE_SOURCE_TYPE__TYPE:
				setType((TypeType)newValue);
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
			case TablePackage.TABLE_SOURCE_TYPE__ACTUATE:
				unsetActuate();
				return;
			case TablePackage.TABLE_SOURCE_TYPE__FILTER_NAME:
				setFilterName(FILTER_NAME_EDEFAULT);
				return;
			case TablePackage.TABLE_SOURCE_TYPE__FILTER_OPTIONS:
				setFilterOptions(FILTER_OPTIONS_EDEFAULT);
				return;
			case TablePackage.TABLE_SOURCE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case TablePackage.TABLE_SOURCE_TYPE__MODE:
				unsetMode();
				return;
			case TablePackage.TABLE_SOURCE_TYPE__REFRESH_DELAY:
				setRefreshDelay(REFRESH_DELAY_EDEFAULT);
				return;
			case TablePackage.TABLE_SOURCE_TYPE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case TablePackage.TABLE_SOURCE_TYPE__TYPE:
				unsetType();
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
			case TablePackage.TABLE_SOURCE_TYPE__ACTUATE:
				return isSetActuate();
			case TablePackage.TABLE_SOURCE_TYPE__FILTER_NAME:
				return FILTER_NAME_EDEFAULT == null ? filterName != null : !FILTER_NAME_EDEFAULT.equals(filterName);
			case TablePackage.TABLE_SOURCE_TYPE__FILTER_OPTIONS:
				return FILTER_OPTIONS_EDEFAULT == null ? filterOptions != null : !FILTER_OPTIONS_EDEFAULT.equals(filterOptions);
			case TablePackage.TABLE_SOURCE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case TablePackage.TABLE_SOURCE_TYPE__MODE:
				return isSetMode();
			case TablePackage.TABLE_SOURCE_TYPE__REFRESH_DELAY:
				return REFRESH_DELAY_EDEFAULT == null ? refreshDelay != null : !REFRESH_DELAY_EDEFAULT.equals(refreshDelay);
			case TablePackage.TABLE_SOURCE_TYPE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case TablePackage.TABLE_SOURCE_TYPE__TYPE:
				return isSetType();
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
		result.append(" (actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", filterName: ");
		result.append(filterName);
		result.append(", filterOptions: ");
		result.append(filterOptions);
		result.append(", href: ");
		result.append(href);
		result.append(", mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(", refreshDelay: ");
		result.append(refreshDelay);
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TableSourceTypeImpl
