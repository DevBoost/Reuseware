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
import org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellAddressTypeImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellAddressTypeImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellAddressTypeImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellAddressTypeImpl extends EObjectImpl implements CellAddressType {
	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected BigInteger column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected BigInteger row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected BigInteger table = TABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellAddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getCellAddressType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(BigInteger newColumn) {
		BigInteger oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_ADDRESS_TYPE__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(BigInteger newRow) {
		BigInteger oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_ADDRESS_TYPE__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(BigInteger newTable) {
		BigInteger oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_ADDRESS_TYPE__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.CELL_ADDRESS_TYPE__COLUMN:
				return getColumn();
			case TablePackage.CELL_ADDRESS_TYPE__ROW:
				return getRow();
			case TablePackage.CELL_ADDRESS_TYPE__TABLE:
				return getTable();
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
			case TablePackage.CELL_ADDRESS_TYPE__COLUMN:
				setColumn((BigInteger)newValue);
				return;
			case TablePackage.CELL_ADDRESS_TYPE__ROW:
				setRow((BigInteger)newValue);
				return;
			case TablePackage.CELL_ADDRESS_TYPE__TABLE:
				setTable((BigInteger)newValue);
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
			case TablePackage.CELL_ADDRESS_TYPE__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case TablePackage.CELL_ADDRESS_TYPE__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case TablePackage.CELL_ADDRESS_TYPE__TABLE:
				setTable(TABLE_EDEFAULT);
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
			case TablePackage.CELL_ADDRESS_TYPE__COLUMN:
				return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
			case TablePackage.CELL_ADDRESS_TYPE__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case TablePackage.CELL_ADDRESS_TYPE__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
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
		result.append(" (column: ");
		result.append(column);
		result.append(", row: ");
		result.append(row);
		result.append(", table: ");
		result.append(table);
		result.append(')');
		return result.toString();
	}

} //CellAddressTypeImpl
