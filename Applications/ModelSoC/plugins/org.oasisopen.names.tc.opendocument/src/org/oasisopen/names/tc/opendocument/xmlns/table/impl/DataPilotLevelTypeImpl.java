/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotDisplayInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotMembersType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSortInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pilot Level Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotLevelTypeImpl#getDataPilotSubtotals <em>Data Pilot Subtotals</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotLevelTypeImpl#getDataPilotMembers <em>Data Pilot Members</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotLevelTypeImpl#getDataPilotDisplayInfo <em>Data Pilot Display Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotLevelTypeImpl#getDataPilotSortInfo <em>Data Pilot Sort Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotLevelTypeImpl#getDataPilotLayoutInfo <em>Data Pilot Layout Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotLevelTypeImpl#getShowEmpty <em>Show Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPilotLevelTypeImpl extends EObjectImpl implements DataPilotLevelType {
	/**
	 * The cached value of the '{@link #getDataPilotSubtotals() <em>Data Pilot Subtotals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotSubtotals()
	 * @generated
	 * @ordered
	 */
	protected DataPilotSubtotalsType dataPilotSubtotals;

	/**
	 * The cached value of the '{@link #getDataPilotMembers() <em>Data Pilot Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotMembers()
	 * @generated
	 * @ordered
	 */
	protected DataPilotMembersType dataPilotMembers;

	/**
	 * The cached value of the '{@link #getDataPilotDisplayInfo() <em>Data Pilot Display Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotDisplayInfo()
	 * @generated
	 * @ordered
	 */
	protected DataPilotDisplayInfoType dataPilotDisplayInfo;

	/**
	 * The cached value of the '{@link #getDataPilotSortInfo() <em>Data Pilot Sort Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotSortInfo()
	 * @generated
	 * @ordered
	 */
	protected DataPilotSortInfoType dataPilotSortInfo;

	/**
	 * The cached value of the '{@link #getDataPilotLayoutInfo() <em>Data Pilot Layout Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotLayoutInfo()
	 * @generated
	 * @ordered
	 */
	protected DataPilotLayoutInfoType dataPilotLayoutInfo;

	/**
	 * The default value of the '{@link #getShowEmpty() <em>Show Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean SHOW_EMPTY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getShowEmpty() <em>Show Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowEmpty()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean showEmpty = SHOW_EMPTY_EDEFAULT;

	/**
	 * This is true if the Show Empty attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showEmptyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPilotLevelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDataPilotLevelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotSubtotalsType getDataPilotSubtotals() {
		return dataPilotSubtotals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotSubtotals(DataPilotSubtotalsType newDataPilotSubtotals, NotificationChain msgs) {
		DataPilotSubtotalsType oldDataPilotSubtotals = dataPilotSubtotals;
		dataPilotSubtotals = newDataPilotSubtotals;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SUBTOTALS, oldDataPilotSubtotals, newDataPilotSubtotals);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotSubtotals(DataPilotSubtotalsType newDataPilotSubtotals) {
		if (newDataPilotSubtotals != dataPilotSubtotals) {
			NotificationChain msgs = null;
			if (dataPilotSubtotals != null)
				msgs = ((InternalEObject)dataPilotSubtotals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SUBTOTALS, null, msgs);
			if (newDataPilotSubtotals != null)
				msgs = ((InternalEObject)newDataPilotSubtotals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SUBTOTALS, null, msgs);
			msgs = basicSetDataPilotSubtotals(newDataPilotSubtotals, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SUBTOTALS, newDataPilotSubtotals, newDataPilotSubtotals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotMembersType getDataPilotMembers() {
		return dataPilotMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotMembers(DataPilotMembersType newDataPilotMembers, NotificationChain msgs) {
		DataPilotMembersType oldDataPilotMembers = dataPilotMembers;
		dataPilotMembers = newDataPilotMembers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_MEMBERS, oldDataPilotMembers, newDataPilotMembers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotMembers(DataPilotMembersType newDataPilotMembers) {
		if (newDataPilotMembers != dataPilotMembers) {
			NotificationChain msgs = null;
			if (dataPilotMembers != null)
				msgs = ((InternalEObject)dataPilotMembers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_MEMBERS, null, msgs);
			if (newDataPilotMembers != null)
				msgs = ((InternalEObject)newDataPilotMembers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_MEMBERS, null, msgs);
			msgs = basicSetDataPilotMembers(newDataPilotMembers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_MEMBERS, newDataPilotMembers, newDataPilotMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotDisplayInfoType getDataPilotDisplayInfo() {
		return dataPilotDisplayInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotDisplayInfo(DataPilotDisplayInfoType newDataPilotDisplayInfo, NotificationChain msgs) {
		DataPilotDisplayInfoType oldDataPilotDisplayInfo = dataPilotDisplayInfo;
		dataPilotDisplayInfo = newDataPilotDisplayInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_DISPLAY_INFO, oldDataPilotDisplayInfo, newDataPilotDisplayInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotDisplayInfo(DataPilotDisplayInfoType newDataPilotDisplayInfo) {
		if (newDataPilotDisplayInfo != dataPilotDisplayInfo) {
			NotificationChain msgs = null;
			if (dataPilotDisplayInfo != null)
				msgs = ((InternalEObject)dataPilotDisplayInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_DISPLAY_INFO, null, msgs);
			if (newDataPilotDisplayInfo != null)
				msgs = ((InternalEObject)newDataPilotDisplayInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_DISPLAY_INFO, null, msgs);
			msgs = basicSetDataPilotDisplayInfo(newDataPilotDisplayInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_DISPLAY_INFO, newDataPilotDisplayInfo, newDataPilotDisplayInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotSortInfoType getDataPilotSortInfo() {
		return dataPilotSortInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotSortInfo(DataPilotSortInfoType newDataPilotSortInfo, NotificationChain msgs) {
		DataPilotSortInfoType oldDataPilotSortInfo = dataPilotSortInfo;
		dataPilotSortInfo = newDataPilotSortInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SORT_INFO, oldDataPilotSortInfo, newDataPilotSortInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotSortInfo(DataPilotSortInfoType newDataPilotSortInfo) {
		if (newDataPilotSortInfo != dataPilotSortInfo) {
			NotificationChain msgs = null;
			if (dataPilotSortInfo != null)
				msgs = ((InternalEObject)dataPilotSortInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SORT_INFO, null, msgs);
			if (newDataPilotSortInfo != null)
				msgs = ((InternalEObject)newDataPilotSortInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SORT_INFO, null, msgs);
			msgs = basicSetDataPilotSortInfo(newDataPilotSortInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SORT_INFO, newDataPilotSortInfo, newDataPilotSortInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotLayoutInfoType getDataPilotLayoutInfo() {
		return dataPilotLayoutInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotLayoutInfo(DataPilotLayoutInfoType newDataPilotLayoutInfo, NotificationChain msgs) {
		DataPilotLayoutInfoType oldDataPilotLayoutInfo = dataPilotLayoutInfo;
		dataPilotLayoutInfo = newDataPilotLayoutInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_LAYOUT_INFO, oldDataPilotLayoutInfo, newDataPilotLayoutInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotLayoutInfo(DataPilotLayoutInfoType newDataPilotLayoutInfo) {
		if (newDataPilotLayoutInfo != dataPilotLayoutInfo) {
			NotificationChain msgs = null;
			if (dataPilotLayoutInfo != null)
				msgs = ((InternalEObject)dataPilotLayoutInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_LAYOUT_INFO, null, msgs);
			if (newDataPilotLayoutInfo != null)
				msgs = ((InternalEObject)newDataPilotLayoutInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_LAYOUT_INFO, null, msgs);
			msgs = basicSetDataPilotLayoutInfo(newDataPilotLayoutInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_LAYOUT_INFO, newDataPilotLayoutInfo, newDataPilotLayoutInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowEmpty() {
		return showEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowEmpty(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newShowEmpty) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowEmpty = showEmpty;
		showEmpty = newShowEmpty == null ? SHOW_EMPTY_EDEFAULT : newShowEmpty;
		boolean oldShowEmptyESet = showEmptyESet;
		showEmptyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LEVEL_TYPE__SHOW_EMPTY, oldShowEmpty, showEmpty, !oldShowEmptyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShowEmpty() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldShowEmpty = showEmpty;
		boolean oldShowEmptyESet = showEmptyESet;
		showEmpty = SHOW_EMPTY_EDEFAULT;
		showEmptyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_LEVEL_TYPE__SHOW_EMPTY, oldShowEmpty, SHOW_EMPTY_EDEFAULT, oldShowEmptyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShowEmpty() {
		return showEmptyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SUBTOTALS:
				return basicSetDataPilotSubtotals(null, msgs);
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_MEMBERS:
				return basicSetDataPilotMembers(null, msgs);
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_DISPLAY_INFO:
				return basicSetDataPilotDisplayInfo(null, msgs);
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SORT_INFO:
				return basicSetDataPilotSortInfo(null, msgs);
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_LAYOUT_INFO:
				return basicSetDataPilotLayoutInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SUBTOTALS:
				return getDataPilotSubtotals();
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_MEMBERS:
				return getDataPilotMembers();
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_DISPLAY_INFO:
				return getDataPilotDisplayInfo();
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SORT_INFO:
				return getDataPilotSortInfo();
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_LAYOUT_INFO:
				return getDataPilotLayoutInfo();
			case TablePackage.DATA_PILOT_LEVEL_TYPE__SHOW_EMPTY:
				return getShowEmpty();
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
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SUBTOTALS:
				setDataPilotSubtotals((DataPilotSubtotalsType)newValue);
				return;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_MEMBERS:
				setDataPilotMembers((DataPilotMembersType)newValue);
				return;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_DISPLAY_INFO:
				setDataPilotDisplayInfo((DataPilotDisplayInfoType)newValue);
				return;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SORT_INFO:
				setDataPilotSortInfo((DataPilotSortInfoType)newValue);
				return;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_LAYOUT_INFO:
				setDataPilotLayoutInfo((DataPilotLayoutInfoType)newValue);
				return;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__SHOW_EMPTY:
				setShowEmpty((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SUBTOTALS:
				setDataPilotSubtotals((DataPilotSubtotalsType)null);
				return;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_MEMBERS:
				setDataPilotMembers((DataPilotMembersType)null);
				return;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_DISPLAY_INFO:
				setDataPilotDisplayInfo((DataPilotDisplayInfoType)null);
				return;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SORT_INFO:
				setDataPilotSortInfo((DataPilotSortInfoType)null);
				return;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_LAYOUT_INFO:
				setDataPilotLayoutInfo((DataPilotLayoutInfoType)null);
				return;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__SHOW_EMPTY:
				unsetShowEmpty();
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
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SUBTOTALS:
				return dataPilotSubtotals != null;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_MEMBERS:
				return dataPilotMembers != null;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_DISPLAY_INFO:
				return dataPilotDisplayInfo != null;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_SORT_INFO:
				return dataPilotSortInfo != null;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__DATA_PILOT_LAYOUT_INFO:
				return dataPilotLayoutInfo != null;
			case TablePackage.DATA_PILOT_LEVEL_TYPE__SHOW_EMPTY:
				return isSetShowEmpty();
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
		result.append(" (showEmpty: ");
		if (showEmptyESet) result.append(showEmpty); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataPilotLevelTypeImpl
