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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.TargetRangeAddressType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Range Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TargetRangeAddressTypeImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TargetRangeAddressTypeImpl#getEndColumn <em>End Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TargetRangeAddressTypeImpl#getEndRow <em>End Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TargetRangeAddressTypeImpl#getEndTable <em>End Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TargetRangeAddressTypeImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TargetRangeAddressTypeImpl#getStartColumn <em>Start Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TargetRangeAddressTypeImpl#getStartRow <em>Start Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TargetRangeAddressTypeImpl#getStartTable <em>Start Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TargetRangeAddressTypeImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetRangeAddressTypeImpl extends EObjectImpl implements TargetRangeAddressType {
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
	 * The default value of the '{@link #getEndColumn() <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColumn()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndColumn() <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColumn()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endColumn = END_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndRow() <em>End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndRow()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndRow() <em>End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndRow()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endRow = END_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTable() <em>End Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTable()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTable() <em>End Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTable()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endTable = END_TABLE_EDEFAULT;

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
	 * The default value of the '{@link #getStartColumn() <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColumn()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartColumn() <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColumn()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startColumn = START_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartRow() <em>Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRow()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartRow() <em>Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRow()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startRow = START_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTable() <em>Start Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTable()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTable() <em>Start Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTable()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startTable = START_TABLE_EDEFAULT;

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
	protected TargetRangeAddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getTargetRangeAddressType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TARGET_RANGE_ADDRESS_TYPE__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndColumn() {
		return endColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndColumn(BigInteger newEndColumn) {
		BigInteger oldEndColumn = endColumn;
		endColumn = newEndColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_COLUMN, oldEndColumn, endColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndRow() {
		return endRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndRow(BigInteger newEndRow) {
		BigInteger oldEndRow = endRow;
		endRow = newEndRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_ROW, oldEndRow, endRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndTable() {
		return endTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTable(BigInteger newEndTable) {
		BigInteger oldEndTable = endTable;
		endTable = newEndTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_TABLE, oldEndTable, endTable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TARGET_RANGE_ADDRESS_TYPE__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartColumn() {
		return startColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartColumn(BigInteger newStartColumn) {
		BigInteger oldStartColumn = startColumn;
		startColumn = newStartColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_COLUMN, oldStartColumn, startColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartRow() {
		return startRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartRow(BigInteger newStartRow) {
		BigInteger oldStartRow = startRow;
		startRow = newStartRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_ROW, oldStartRow, startRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartTable() {
		return startTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTable(BigInteger newStartTable) {
		BigInteger oldStartTable = startTable;
		startTable = newStartTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_TABLE, oldStartTable, startTable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TARGET_RANGE_ADDRESS_TYPE__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__COLUMN:
				return getColumn();
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_COLUMN:
				return getEndColumn();
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_ROW:
				return getEndRow();
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_TABLE:
				return getEndTable();
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__ROW:
				return getRow();
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_COLUMN:
				return getStartColumn();
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_ROW:
				return getStartRow();
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_TABLE:
				return getStartTable();
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__TABLE:
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
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__COLUMN:
				setColumn((BigInteger)newValue);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_COLUMN:
				setEndColumn((BigInteger)newValue);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_ROW:
				setEndRow((BigInteger)newValue);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_TABLE:
				setEndTable((BigInteger)newValue);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__ROW:
				setRow((BigInteger)newValue);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_COLUMN:
				setStartColumn((BigInteger)newValue);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_ROW:
				setStartRow((BigInteger)newValue);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_TABLE:
				setStartTable((BigInteger)newValue);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__TABLE:
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
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_COLUMN:
				setEndColumn(END_COLUMN_EDEFAULT);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_ROW:
				setEndRow(END_ROW_EDEFAULT);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_TABLE:
				setEndTable(END_TABLE_EDEFAULT);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_COLUMN:
				setStartColumn(START_COLUMN_EDEFAULT);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_ROW:
				setStartRow(START_ROW_EDEFAULT);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_TABLE:
				setStartTable(START_TABLE_EDEFAULT);
				return;
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__TABLE:
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
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__COLUMN:
				return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_COLUMN:
				return END_COLUMN_EDEFAULT == null ? endColumn != null : !END_COLUMN_EDEFAULT.equals(endColumn);
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_ROW:
				return END_ROW_EDEFAULT == null ? endRow != null : !END_ROW_EDEFAULT.equals(endRow);
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__END_TABLE:
				return END_TABLE_EDEFAULT == null ? endTable != null : !END_TABLE_EDEFAULT.equals(endTable);
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_COLUMN:
				return START_COLUMN_EDEFAULT == null ? startColumn != null : !START_COLUMN_EDEFAULT.equals(startColumn);
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_ROW:
				return START_ROW_EDEFAULT == null ? startRow != null : !START_ROW_EDEFAULT.equals(startRow);
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__START_TABLE:
				return START_TABLE_EDEFAULT == null ? startTable != null : !START_TABLE_EDEFAULT.equals(startTable);
			case TablePackage.TARGET_RANGE_ADDRESS_TYPE__TABLE:
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
		result.append(", endColumn: ");
		result.append(endColumn);
		result.append(", endRow: ");
		result.append(endRow);
		result.append(", endTable: ");
		result.append(endTable);
		result.append(", row: ");
		result.append(row);
		result.append(", startColumn: ");
		result.append(startColumn);
		result.append(", startRow: ");
		result.append(startRow);
		result.append(", startTable: ");
		result.append(startTable);
		result.append(", table: ");
		result.append(table);
		result.append(')');
		return result.toString();
	}

} //TargetRangeAddressTypeImpl
