/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalFieldType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtotal Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalRuleTypeImpl#getSubtotalField <em>Subtotal Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalRuleTypeImpl#getGroupByFieldNumber <em>Group By Field Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubtotalRuleTypeImpl extends EObjectImpl implements SubtotalRuleType {
	/**
	 * The cached value of the '{@link #getSubtotalField() <em>Subtotal Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtotalField()
	 * @generated
	 * @ordered
	 */
	protected EList<SubtotalFieldType> subtotalField;

	/**
	 * The default value of the '{@link #getGroupByFieldNumber() <em>Group By Field Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupByFieldNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger GROUP_BY_FIELD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupByFieldNumber() <em>Group By Field Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupByFieldNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger groupByFieldNumber = GROUP_BY_FIELD_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtotalRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getSubtotalRuleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubtotalFieldType> getSubtotalField() {
		if (subtotalField == null) {
			subtotalField = new EObjectContainmentEList<SubtotalFieldType>(SubtotalFieldType.class, this, TablePackage.SUBTOTAL_RULE_TYPE__SUBTOTAL_FIELD);
		}
		return subtotalField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getGroupByFieldNumber() {
		return groupByFieldNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupByFieldNumber(BigInteger newGroupByFieldNumber) {
		BigInteger oldGroupByFieldNumber = groupByFieldNumber;
		groupByFieldNumber = newGroupByFieldNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SUBTOTAL_RULE_TYPE__GROUP_BY_FIELD_NUMBER, oldGroupByFieldNumber, groupByFieldNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.SUBTOTAL_RULE_TYPE__SUBTOTAL_FIELD:
				return ((InternalEList<?>)getSubtotalField()).basicRemove(otherEnd, msgs);
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
			case TablePackage.SUBTOTAL_RULE_TYPE__SUBTOTAL_FIELD:
				return getSubtotalField();
			case TablePackage.SUBTOTAL_RULE_TYPE__GROUP_BY_FIELD_NUMBER:
				return getGroupByFieldNumber();
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
			case TablePackage.SUBTOTAL_RULE_TYPE__SUBTOTAL_FIELD:
				getSubtotalField().clear();
				getSubtotalField().addAll((Collection<? extends SubtotalFieldType>)newValue);
				return;
			case TablePackage.SUBTOTAL_RULE_TYPE__GROUP_BY_FIELD_NUMBER:
				setGroupByFieldNumber((BigInteger)newValue);
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
			case TablePackage.SUBTOTAL_RULE_TYPE__SUBTOTAL_FIELD:
				getSubtotalField().clear();
				return;
			case TablePackage.SUBTOTAL_RULE_TYPE__GROUP_BY_FIELD_NUMBER:
				setGroupByFieldNumber(GROUP_BY_FIELD_NUMBER_EDEFAULT);
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
			case TablePackage.SUBTOTAL_RULE_TYPE__SUBTOTAL_FIELD:
				return subtotalField != null && !subtotalField.isEmpty();
			case TablePackage.SUBTOTAL_RULE_TYPE__GROUP_BY_FIELD_NUMBER:
				return GROUP_BY_FIELD_NUMBER_EDEFAULT == null ? groupByFieldNumber != null : !GROUP_BY_FIELD_NUMBER_EDEFAULT.equals(groupByFieldNumber);
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
		result.append(" (groupByFieldNumber: ");
		result.append(groupByFieldNumber);
		result.append(')');
		return result.toString();
	}

} //SubtotalRuleTypeImpl
