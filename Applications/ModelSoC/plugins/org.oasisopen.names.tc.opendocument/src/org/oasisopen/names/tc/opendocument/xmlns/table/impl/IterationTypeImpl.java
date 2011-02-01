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
import org.oasisopen.names.tc.opendocument.xmlns.table.IterationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.StatusType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.IterationTypeImpl#getMaximumDifference <em>Maximum Difference</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.IterationTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.IterationTypeImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IterationTypeImpl extends EObjectImpl implements IterationType {
	/**
	 * The default value of the '{@link #getMaximumDifference() <em>Maximum Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDifference()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_DIFFERENCE_EDEFAULT = 0.0010;

	/**
	 * The cached value of the '{@link #getMaximumDifference() <em>Maximum Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDifference()
	 * @generated
	 * @ordered
	 */
	protected double maximumDifference = MAXIMUM_DIFFERENCE_EDEFAULT;

	/**
	 * This is true if the Maximum Difference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumDifferenceESet;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final StatusType STATUS_EDEFAULT = StatusType.DISABLE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusType status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet;

	/**
	 * The default value of the '{@link #getSteps() <em>Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STEPS_EDEFAULT = new BigInteger("100");

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected BigInteger steps = STEPS_EDEFAULT;

	/**
	 * This is true if the Steps attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getIterationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumDifference() {
		return maximumDifference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumDifference(double newMaximumDifference) {
		double oldMaximumDifference = maximumDifference;
		maximumDifference = newMaximumDifference;
		boolean oldMaximumDifferenceESet = maximumDifferenceESet;
		maximumDifferenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.ITERATION_TYPE__MAXIMUM_DIFFERENCE, oldMaximumDifference, maximumDifference, !oldMaximumDifferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumDifference() {
		double oldMaximumDifference = maximumDifference;
		boolean oldMaximumDifferenceESet = maximumDifferenceESet;
		maximumDifference = MAXIMUM_DIFFERENCE_EDEFAULT;
		maximumDifferenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.ITERATION_TYPE__MAXIMUM_DIFFERENCE, oldMaximumDifference, MAXIMUM_DIFFERENCE_EDEFAULT, oldMaximumDifferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumDifference() {
		return maximumDifferenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		StatusType oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.ITERATION_TYPE__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		StatusType oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.ITERATION_TYPE__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSteps() {
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteps(BigInteger newSteps) {
		BigInteger oldSteps = steps;
		steps = newSteps;
		boolean oldStepsESet = stepsESet;
		stepsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.ITERATION_TYPE__STEPS, oldSteps, steps, !oldStepsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSteps() {
		BigInteger oldSteps = steps;
		boolean oldStepsESet = stepsESet;
		steps = STEPS_EDEFAULT;
		stepsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.ITERATION_TYPE__STEPS, oldSteps, STEPS_EDEFAULT, oldStepsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSteps() {
		return stepsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.ITERATION_TYPE__MAXIMUM_DIFFERENCE:
				return new Double(getMaximumDifference());
			case TablePackage.ITERATION_TYPE__STATUS:
				return getStatus();
			case TablePackage.ITERATION_TYPE__STEPS:
				return getSteps();
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
			case TablePackage.ITERATION_TYPE__MAXIMUM_DIFFERENCE:
				setMaximumDifference(((Double)newValue).doubleValue());
				return;
			case TablePackage.ITERATION_TYPE__STATUS:
				setStatus((StatusType)newValue);
				return;
			case TablePackage.ITERATION_TYPE__STEPS:
				setSteps((BigInteger)newValue);
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
			case TablePackage.ITERATION_TYPE__MAXIMUM_DIFFERENCE:
				unsetMaximumDifference();
				return;
			case TablePackage.ITERATION_TYPE__STATUS:
				unsetStatus();
				return;
			case TablePackage.ITERATION_TYPE__STEPS:
				unsetSteps();
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
			case TablePackage.ITERATION_TYPE__MAXIMUM_DIFFERENCE:
				return isSetMaximumDifference();
			case TablePackage.ITERATION_TYPE__STATUS:
				return isSetStatus();
			case TablePackage.ITERATION_TYPE__STEPS:
				return isSetSteps();
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
		result.append(" (maximumDifference: ");
		if (maximumDifferenceESet) result.append(maximumDifference); else result.append("<unset>");
		result.append(", status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(", steps: ");
		if (stepsESet) result.append(steps); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IterationTypeImpl
