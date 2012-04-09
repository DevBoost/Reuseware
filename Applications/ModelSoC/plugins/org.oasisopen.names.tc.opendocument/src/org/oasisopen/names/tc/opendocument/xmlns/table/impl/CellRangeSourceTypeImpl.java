/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.math.BigInteger;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.CellRangeSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.w3.xlink.ActuateType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Range Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellRangeSourceTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellRangeSourceTypeImpl#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellRangeSourceTypeImpl#getFilterOptions <em>Filter Options</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellRangeSourceTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellRangeSourceTypeImpl#getLastColumnSpanned <em>Last Column Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellRangeSourceTypeImpl#getLastRowSpanned <em>Last Row Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellRangeSourceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellRangeSourceTypeImpl#getRefreshDelay <em>Refresh Delay</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellRangeSourceTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellRangeSourceTypeImpl extends EObjectImpl implements CellRangeSourceType {
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
	 * The default value of the '{@link #getLastColumnSpanned() <em>Last Column Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastColumnSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LAST_COLUMN_SPANNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastColumnSpanned() <em>Last Column Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastColumnSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lastColumnSpanned = LAST_COLUMN_SPANNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastRowSpanned() <em>Last Row Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRowSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LAST_ROW_SPANNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRowSpanned() <em>Last Row Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRowSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lastRowSpanned = LAST_ROW_SPANNED_EDEFAULT;

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
	protected CellRangeSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getCellRangeSourceType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_RANGE_SOURCE_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CELL_RANGE_SOURCE_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_RANGE_SOURCE_TYPE__FILTER_NAME, oldFilterName, filterName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_RANGE_SOURCE_TYPE__FILTER_OPTIONS, oldFilterOptions, filterOptions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_RANGE_SOURCE_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLastColumnSpanned() {
		return lastColumnSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastColumnSpanned(BigInteger newLastColumnSpanned) {
		BigInteger oldLastColumnSpanned = lastColumnSpanned;
		lastColumnSpanned = newLastColumnSpanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_RANGE_SOURCE_TYPE__LAST_COLUMN_SPANNED, oldLastColumnSpanned, lastColumnSpanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLastRowSpanned() {
		return lastRowSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRowSpanned(BigInteger newLastRowSpanned) {
		BigInteger oldLastRowSpanned = lastRowSpanned;
		lastRowSpanned = newLastRowSpanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_RANGE_SOURCE_TYPE__LAST_ROW_SPANNED, oldLastRowSpanned, lastRowSpanned));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_RANGE_SOURCE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_RANGE_SOURCE_TYPE__REFRESH_DELAY, oldRefreshDelay, refreshDelay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_RANGE_SOURCE_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CELL_RANGE_SOURCE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case TablePackage.CELL_RANGE_SOURCE_TYPE__ACTUATE:
				return getActuate();
			case TablePackage.CELL_RANGE_SOURCE_TYPE__FILTER_NAME:
				return getFilterName();
			case TablePackage.CELL_RANGE_SOURCE_TYPE__FILTER_OPTIONS:
				return getFilterOptions();
			case TablePackage.CELL_RANGE_SOURCE_TYPE__HREF:
				return getHref();
			case TablePackage.CELL_RANGE_SOURCE_TYPE__LAST_COLUMN_SPANNED:
				return getLastColumnSpanned();
			case TablePackage.CELL_RANGE_SOURCE_TYPE__LAST_ROW_SPANNED:
				return getLastRowSpanned();
			case TablePackage.CELL_RANGE_SOURCE_TYPE__NAME:
				return getName();
			case TablePackage.CELL_RANGE_SOURCE_TYPE__REFRESH_DELAY:
				return getRefreshDelay();
			case TablePackage.CELL_RANGE_SOURCE_TYPE__TYPE:
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
			case TablePackage.CELL_RANGE_SOURCE_TYPE__ACTUATE:
				setActuate((ActuateType1)newValue);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__FILTER_NAME:
				setFilterName((String)newValue);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__FILTER_OPTIONS:
				setFilterOptions((String)newValue);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__LAST_COLUMN_SPANNED:
				setLastColumnSpanned((BigInteger)newValue);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__LAST_ROW_SPANNED:
				setLastRowSpanned((BigInteger)newValue);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__NAME:
				setName((String)newValue);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__REFRESH_DELAY:
				setRefreshDelay((Duration)newValue);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__TYPE:
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
			case TablePackage.CELL_RANGE_SOURCE_TYPE__ACTUATE:
				unsetActuate();
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__FILTER_NAME:
				setFilterName(FILTER_NAME_EDEFAULT);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__FILTER_OPTIONS:
				setFilterOptions(FILTER_OPTIONS_EDEFAULT);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__LAST_COLUMN_SPANNED:
				setLastColumnSpanned(LAST_COLUMN_SPANNED_EDEFAULT);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__LAST_ROW_SPANNED:
				setLastRowSpanned(LAST_ROW_SPANNED_EDEFAULT);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__REFRESH_DELAY:
				setRefreshDelay(REFRESH_DELAY_EDEFAULT);
				return;
			case TablePackage.CELL_RANGE_SOURCE_TYPE__TYPE:
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
			case TablePackage.CELL_RANGE_SOURCE_TYPE__ACTUATE:
				return isSetActuate();
			case TablePackage.CELL_RANGE_SOURCE_TYPE__FILTER_NAME:
				return FILTER_NAME_EDEFAULT == null ? filterName != null : !FILTER_NAME_EDEFAULT.equals(filterName);
			case TablePackage.CELL_RANGE_SOURCE_TYPE__FILTER_OPTIONS:
				return FILTER_OPTIONS_EDEFAULT == null ? filterOptions != null : !FILTER_OPTIONS_EDEFAULT.equals(filterOptions);
			case TablePackage.CELL_RANGE_SOURCE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case TablePackage.CELL_RANGE_SOURCE_TYPE__LAST_COLUMN_SPANNED:
				return LAST_COLUMN_SPANNED_EDEFAULT == null ? lastColumnSpanned != null : !LAST_COLUMN_SPANNED_EDEFAULT.equals(lastColumnSpanned);
			case TablePackage.CELL_RANGE_SOURCE_TYPE__LAST_ROW_SPANNED:
				return LAST_ROW_SPANNED_EDEFAULT == null ? lastRowSpanned != null : !LAST_ROW_SPANNED_EDEFAULT.equals(lastRowSpanned);
			case TablePackage.CELL_RANGE_SOURCE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TablePackage.CELL_RANGE_SOURCE_TYPE__REFRESH_DELAY:
				return REFRESH_DELAY_EDEFAULT == null ? refreshDelay != null : !REFRESH_DELAY_EDEFAULT.equals(refreshDelay);
			case TablePackage.CELL_RANGE_SOURCE_TYPE__TYPE:
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
		result.append(", lastColumnSpanned: ");
		result.append(lastColumnSpanned);
		result.append(", lastRowSpanned: ");
		result.append(lastRowSpanned);
		result.append(", name: ");
		result.append(name);
		result.append(", refreshDelay: ");
		result.append(refreshDelay);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CellRangeSourceTypeImpl
