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
import org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.NamedExpressionsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.NamedRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Expressions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedExpressionsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedExpressionsTypeImpl#getNamedRange <em>Named Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.NamedExpressionsTypeImpl#getNamedExpression <em>Named Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedExpressionsTypeImpl extends EObjectImpl implements NamedExpressionsType {
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
	protected NamedExpressionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getNamedExpressionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TablePackage.NAMED_EXPRESSIONS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedRangeType> getNamedRange() {
		return getGroup().list(TablePackage.eINSTANCE.getNamedExpressionsType_NamedRange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedExpressionType> getNamedExpression() {
		return getGroup().list(TablePackage.eINSTANCE.getNamedExpressionsType_NamedExpression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.NAMED_EXPRESSIONS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TablePackage.NAMED_EXPRESSIONS_TYPE__NAMED_RANGE:
				return ((InternalEList<?>)getNamedRange()).basicRemove(otherEnd, msgs);
			case TablePackage.NAMED_EXPRESSIONS_TYPE__NAMED_EXPRESSION:
				return ((InternalEList<?>)getNamedExpression()).basicRemove(otherEnd, msgs);
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
			case TablePackage.NAMED_EXPRESSIONS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TablePackage.NAMED_EXPRESSIONS_TYPE__NAMED_RANGE:
				return getNamedRange();
			case TablePackage.NAMED_EXPRESSIONS_TYPE__NAMED_EXPRESSION:
				return getNamedExpression();
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
			case TablePackage.NAMED_EXPRESSIONS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TablePackage.NAMED_EXPRESSIONS_TYPE__NAMED_RANGE:
				getNamedRange().clear();
				getNamedRange().addAll((Collection<? extends NamedRangeType>)newValue);
				return;
			case TablePackage.NAMED_EXPRESSIONS_TYPE__NAMED_EXPRESSION:
				getNamedExpression().clear();
				getNamedExpression().addAll((Collection<? extends NamedExpressionType>)newValue);
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
			case TablePackage.NAMED_EXPRESSIONS_TYPE__GROUP:
				getGroup().clear();
				return;
			case TablePackage.NAMED_EXPRESSIONS_TYPE__NAMED_RANGE:
				getNamedRange().clear();
				return;
			case TablePackage.NAMED_EXPRESSIONS_TYPE__NAMED_EXPRESSION:
				getNamedExpression().clear();
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
			case TablePackage.NAMED_EXPRESSIONS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TablePackage.NAMED_EXPRESSIONS_TYPE__NAMED_RANGE:
				return !getNamedRange().isEmpty();
			case TablePackage.NAMED_EXPRESSIONS_TYPE__NAMED_EXPRESSION:
				return !getNamedExpression().isEmpty();
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

} //NamedExpressionsTypeImpl
