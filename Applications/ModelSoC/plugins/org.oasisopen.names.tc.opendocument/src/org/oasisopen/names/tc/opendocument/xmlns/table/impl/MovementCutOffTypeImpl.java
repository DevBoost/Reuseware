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
import org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movement Cut Off Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.MovementCutOffTypeImpl#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.MovementCutOffTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.MovementCutOffTypeImpl#getStartPosition <em>Start Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MovementCutOffTypeImpl extends EObjectImpl implements MovementCutOffType {
	/**
	 * The default value of the '{@link #getEndPosition() <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger END_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPosition() <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger endPosition = END_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startPosition = START_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovementCutOffTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getMovementCutOffType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEndPosition() {
		return endPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPosition(BigInteger newEndPosition) {
		BigInteger oldEndPosition = endPosition;
		endPosition = newEndPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.MOVEMENT_CUT_OFF_TYPE__END_POSITION, oldEndPosition, endPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(BigInteger newPosition) {
		BigInteger oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.MOVEMENT_CUT_OFF_TYPE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartPosition() {
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPosition(BigInteger newStartPosition) {
		BigInteger oldStartPosition = startPosition;
		startPosition = newStartPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.MOVEMENT_CUT_OFF_TYPE__START_POSITION, oldStartPosition, startPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.MOVEMENT_CUT_OFF_TYPE__END_POSITION:
				return getEndPosition();
			case TablePackage.MOVEMENT_CUT_OFF_TYPE__POSITION:
				return getPosition();
			case TablePackage.MOVEMENT_CUT_OFF_TYPE__START_POSITION:
				return getStartPosition();
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
			case TablePackage.MOVEMENT_CUT_OFF_TYPE__END_POSITION:
				setEndPosition((BigInteger)newValue);
				return;
			case TablePackage.MOVEMENT_CUT_OFF_TYPE__POSITION:
				setPosition((BigInteger)newValue);
				return;
			case TablePackage.MOVEMENT_CUT_OFF_TYPE__START_POSITION:
				setStartPosition((BigInteger)newValue);
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
			case TablePackage.MOVEMENT_CUT_OFF_TYPE__END_POSITION:
				setEndPosition(END_POSITION_EDEFAULT);
				return;
			case TablePackage.MOVEMENT_CUT_OFF_TYPE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case TablePackage.MOVEMENT_CUT_OFF_TYPE__START_POSITION:
				setStartPosition(START_POSITION_EDEFAULT);
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
			case TablePackage.MOVEMENT_CUT_OFF_TYPE__END_POSITION:
				return END_POSITION_EDEFAULT == null ? endPosition != null : !END_POSITION_EDEFAULT.equals(endPosition);
			case TablePackage.MOVEMENT_CUT_OFF_TYPE__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case TablePackage.MOVEMENT_CUT_OFF_TYPE__START_POSITION:
				return START_POSITION_EDEFAULT == null ? startPosition != null : !START_POSITION_EDEFAULT.equals(startPosition);
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
		result.append(" (endPosition: ");
		result.append(endPosition);
		result.append(", position: ");
		result.append(position);
		result.append(", startPosition: ");
		result.append(startPosition);
		result.append(')');
		return result.toString();
	}

} //MovementCutOffTypeImpl
