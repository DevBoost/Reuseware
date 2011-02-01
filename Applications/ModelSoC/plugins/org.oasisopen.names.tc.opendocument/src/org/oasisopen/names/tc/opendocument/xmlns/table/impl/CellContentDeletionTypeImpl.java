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
import org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Content Deletion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentDeletionTypeImpl#getCellAddress <em>Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentDeletionTypeImpl#getChangeTrackTableCell <em>Change Track Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentDeletionTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellContentDeletionTypeImpl extends EObjectImpl implements CellContentDeletionType {
	/**
	 * The cached value of the '{@link #getCellAddress() <em>Cell Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellAddress()
	 * @generated
	 * @ordered
	 */
	protected CellAddressType cellAddress;

	/**
	 * The cached value of the '{@link #getChangeTrackTableCell() <em>Change Track Table Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeTrackTableCell()
	 * @generated
	 * @ordered
	 */
	protected ChangeTrackTableCellType changeTrackTableCell;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellContentDeletionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getCellContentDeletionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellAddressType getCellAddress() {
		return cellAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellAddress(CellAddressType newCellAddress, NotificationChain msgs) {
		CellAddressType oldCellAddress = cellAddress;
		cellAddress = newCellAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_DELETION_TYPE__CELL_ADDRESS, oldCellAddress, newCellAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellAddress(CellAddressType newCellAddress) {
		if (newCellAddress != cellAddress) {
			NotificationChain msgs = null;
			if (cellAddress != null)
				msgs = ((InternalEObject)cellAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_DELETION_TYPE__CELL_ADDRESS, null, msgs);
			if (newCellAddress != null)
				msgs = ((InternalEObject)newCellAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_DELETION_TYPE__CELL_ADDRESS, null, msgs);
			msgs = basicSetCellAddress(newCellAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_DELETION_TYPE__CELL_ADDRESS, newCellAddress, newCellAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeTrackTableCellType getChangeTrackTableCell() {
		return changeTrackTableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeTrackTableCell(ChangeTrackTableCellType newChangeTrackTableCell, NotificationChain msgs) {
		ChangeTrackTableCellType oldChangeTrackTableCell = changeTrackTableCell;
		changeTrackTableCell = newChangeTrackTableCell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_DELETION_TYPE__CHANGE_TRACK_TABLE_CELL, oldChangeTrackTableCell, newChangeTrackTableCell);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeTrackTableCell(ChangeTrackTableCellType newChangeTrackTableCell) {
		if (newChangeTrackTableCell != changeTrackTableCell) {
			NotificationChain msgs = null;
			if (changeTrackTableCell != null)
				msgs = ((InternalEObject)changeTrackTableCell).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_DELETION_TYPE__CHANGE_TRACK_TABLE_CELL, null, msgs);
			if (newChangeTrackTableCell != null)
				msgs = ((InternalEObject)newChangeTrackTableCell).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_DELETION_TYPE__CHANGE_TRACK_TABLE_CELL, null, msgs);
			msgs = basicSetChangeTrackTableCell(newChangeTrackTableCell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_DELETION_TYPE__CHANGE_TRACK_TABLE_CELL, newChangeTrackTableCell, newChangeTrackTableCell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_DELETION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.CELL_CONTENT_DELETION_TYPE__CELL_ADDRESS:
				return basicSetCellAddress(null, msgs);
			case TablePackage.CELL_CONTENT_DELETION_TYPE__CHANGE_TRACK_TABLE_CELL:
				return basicSetChangeTrackTableCell(null, msgs);
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
			case TablePackage.CELL_CONTENT_DELETION_TYPE__CELL_ADDRESS:
				return getCellAddress();
			case TablePackage.CELL_CONTENT_DELETION_TYPE__CHANGE_TRACK_TABLE_CELL:
				return getChangeTrackTableCell();
			case TablePackage.CELL_CONTENT_DELETION_TYPE__ID:
				return getId();
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
			case TablePackage.CELL_CONTENT_DELETION_TYPE__CELL_ADDRESS:
				setCellAddress((CellAddressType)newValue);
				return;
			case TablePackage.CELL_CONTENT_DELETION_TYPE__CHANGE_TRACK_TABLE_CELL:
				setChangeTrackTableCell((ChangeTrackTableCellType)newValue);
				return;
			case TablePackage.CELL_CONTENT_DELETION_TYPE__ID:
				setId((String)newValue);
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
			case TablePackage.CELL_CONTENT_DELETION_TYPE__CELL_ADDRESS:
				setCellAddress((CellAddressType)null);
				return;
			case TablePackage.CELL_CONTENT_DELETION_TYPE__CHANGE_TRACK_TABLE_CELL:
				setChangeTrackTableCell((ChangeTrackTableCellType)null);
				return;
			case TablePackage.CELL_CONTENT_DELETION_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case TablePackage.CELL_CONTENT_DELETION_TYPE__CELL_ADDRESS:
				return cellAddress != null;
			case TablePackage.CELL_CONTENT_DELETION_TYPE__CHANGE_TRACK_TABLE_CELL:
				return changeTrackTableCell != null;
			case TablePackage.CELL_CONTENT_DELETION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CellContentDeletionTypeImpl
