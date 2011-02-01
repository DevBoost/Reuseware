/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Columns Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnsTypeImpl#getTableColumn <em>Table Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableColumnsTypeImpl extends EObjectImpl implements TableColumnsType {
	/**
	 * The cached value of the '{@link #getTableColumn() <em>Table Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<TableColumnType> tableColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableColumnsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getTableColumnsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnType> getTableColumn() {
		if (tableColumn == null) {
			tableColumn = new EObjectContainmentEList<TableColumnType>(TableColumnType.class, this, TablePackage.TABLE_COLUMNS_TYPE__TABLE_COLUMN);
		}
		return tableColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.TABLE_COLUMNS_TYPE__TABLE_COLUMN:
				return ((InternalEList<?>)getTableColumn()).basicRemove(otherEnd, msgs);
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
			case TablePackage.TABLE_COLUMNS_TYPE__TABLE_COLUMN:
				return getTableColumn();
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
			case TablePackage.TABLE_COLUMNS_TYPE__TABLE_COLUMN:
				getTableColumn().clear();
				getTableColumn().addAll((Collection<? extends TableColumnType>)newValue);
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
			case TablePackage.TABLE_COLUMNS_TYPE__TABLE_COLUMN:
				getTableColumn().clear();
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
			case TablePackage.TABLE_COLUMNS_TYPE__TABLE_COLUMN:
				return tableColumn != null && !tableColumn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableColumnsTypeImpl
