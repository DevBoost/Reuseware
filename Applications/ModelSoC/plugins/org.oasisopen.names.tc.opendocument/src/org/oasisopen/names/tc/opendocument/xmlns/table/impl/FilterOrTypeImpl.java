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
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Or Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterOrTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterOrTypeImpl#getFilterAnd <em>Filter And</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.FilterOrTypeImpl#getFilterCondition <em>Filter Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterOrTypeImpl extends EObjectImpl implements FilterOrType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterOrTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getFilterOrType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TablePackage.FILTER_OR_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterAndType> getFilterAnd() {
		return getGroup().list(TablePackage.eINSTANCE.getFilterOrType_FilterAnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterConditionType> getFilterCondition() {
		return getGroup().list(TablePackage.eINSTANCE.getFilterOrType_FilterCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.FILTER_OR_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TablePackage.FILTER_OR_TYPE__FILTER_AND:
				return ((InternalEList<?>)getFilterAnd()).basicRemove(otherEnd, msgs);
			case TablePackage.FILTER_OR_TYPE__FILTER_CONDITION:
				return ((InternalEList<?>)getFilterCondition()).basicRemove(otherEnd, msgs);
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
			case TablePackage.FILTER_OR_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TablePackage.FILTER_OR_TYPE__FILTER_AND:
				return getFilterAnd();
			case TablePackage.FILTER_OR_TYPE__FILTER_CONDITION:
				return getFilterCondition();
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
			case TablePackage.FILTER_OR_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TablePackage.FILTER_OR_TYPE__FILTER_AND:
				getFilterAnd().clear();
				getFilterAnd().addAll((Collection<? extends FilterAndType>)newValue);
				return;
			case TablePackage.FILTER_OR_TYPE__FILTER_CONDITION:
				getFilterCondition().clear();
				getFilterCondition().addAll((Collection<? extends FilterConditionType>)newValue);
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
			case TablePackage.FILTER_OR_TYPE__GROUP:
				getGroup().clear();
				return;
			case TablePackage.FILTER_OR_TYPE__FILTER_AND:
				getFilterAnd().clear();
				return;
			case TablePackage.FILTER_OR_TYPE__FILTER_CONDITION:
				getFilterCondition().clear();
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
			case TablePackage.FILTER_OR_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TablePackage.FILTER_OR_TYPE__FILTER_AND:
				return !getFilterAnd().isEmpty();
			case TablePackage.FILTER_OR_TYPE__FILTER_CONDITION:
				return !getFilterCondition().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //FilterOrTypeImpl
