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
import org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType;
import org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.OperationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detective Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DetectiveTypeImpl#getHighlightedRange <em>Highlighted Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DetectiveTypeImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DetectiveTypeImpl extends EObjectImpl implements DetectiveType {
	/**
	 * The cached value of the '{@link #getHighlightedRange() <em>Highlighted Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighlightedRange()
	 * @generated
	 * @ordered
	 */
	protected EList<HighlightedRangeType> highlightedRange;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationType> operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetectiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDetectiveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HighlightedRangeType> getHighlightedRange() {
		if (highlightedRange == null) {
			highlightedRange = new EObjectContainmentEList<HighlightedRangeType>(HighlightedRangeType.class, this, TablePackage.DETECTIVE_TYPE__HIGHLIGHTED_RANGE);
		}
		return highlightedRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationType> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<OperationType>(OperationType.class, this, TablePackage.DETECTIVE_TYPE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.DETECTIVE_TYPE__HIGHLIGHTED_RANGE:
				return ((InternalEList<?>)getHighlightedRange()).basicRemove(otherEnd, msgs);
			case TablePackage.DETECTIVE_TYPE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
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
			case TablePackage.DETECTIVE_TYPE__HIGHLIGHTED_RANGE:
				return getHighlightedRange();
			case TablePackage.DETECTIVE_TYPE__OPERATION:
				return getOperation();
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
			case TablePackage.DETECTIVE_TYPE__HIGHLIGHTED_RANGE:
				getHighlightedRange().clear();
				getHighlightedRange().addAll((Collection<? extends HighlightedRangeType>)newValue);
				return;
			case TablePackage.DETECTIVE_TYPE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends OperationType>)newValue);
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
			case TablePackage.DETECTIVE_TYPE__HIGHLIGHTED_RANGE:
				getHighlightedRange().clear();
				return;
			case TablePackage.DETECTIVE_TYPE__OPERATION:
				getOperation().clear();
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
			case TablePackage.DETECTIVE_TYPE__HIGHLIGHTED_RANGE:
				return highlightedRange != null && !highlightedRange.isEmpty();
			case TablePackage.DETECTIVE_TYPE__OPERATION:
				return operation != null && !operation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DetectiveTypeImpl
