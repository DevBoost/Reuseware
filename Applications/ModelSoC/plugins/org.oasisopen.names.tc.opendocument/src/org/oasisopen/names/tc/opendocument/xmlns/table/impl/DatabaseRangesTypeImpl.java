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
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Ranges Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DatabaseRangesTypeImpl#getDatabaseRange <em>Database Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseRangesTypeImpl extends EObjectImpl implements DatabaseRangesType {
	/**
	 * The cached value of the '{@link #getDatabaseRange() <em>Database Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseRange()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabaseRangeType> databaseRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseRangesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDatabaseRangesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseRangeType> getDatabaseRange() {
		if (databaseRange == null) {
			databaseRange = new EObjectContainmentEList<DatabaseRangeType>(DatabaseRangeType.class, this, TablePackage.DATABASE_RANGES_TYPE__DATABASE_RANGE);
		}
		return databaseRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.DATABASE_RANGES_TYPE__DATABASE_RANGE:
				return ((InternalEList<?>)getDatabaseRange()).basicRemove(otherEnd, msgs);
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
			case TablePackage.DATABASE_RANGES_TYPE__DATABASE_RANGE:
				return getDatabaseRange();
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
			case TablePackage.DATABASE_RANGES_TYPE__DATABASE_RANGE:
				getDatabaseRange().clear();
				getDatabaseRange().addAll((Collection<? extends DatabaseRangeType>)newValue);
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
			case TablePackage.DATABASE_RANGES_TYPE__DATABASE_RANGE:
				getDatabaseRange().clear();
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
			case TablePackage.DATABASE_RANGES_TYPE__DATABASE_RANGE:
				return databaseRange != null && !databaseRange.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabaseRangesTypeImpl
