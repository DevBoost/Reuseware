/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Highlighted Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.HighlightedRangeTypeImpl#getCellRangeAddress <em>Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.HighlightedRangeTypeImpl#getContainsError <em>Contains Error</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.HighlightedRangeTypeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.HighlightedRangeTypeImpl#getMarkedInvalid <em>Marked Invalid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HighlightedRangeTypeImpl extends EObjectImpl implements HighlightedRangeType {
	/**
	 * The default value of the '{@link #getCellRangeAddress() <em>Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CELL_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellRangeAddress() <em>Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String cellRangeAddress = CELL_RANGE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainsError() <em>Contains Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsError()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CONTAINS_ERROR_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getContainsError() <em>Contains Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsError()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean containsError = CONTAINS_ERROR_EDEFAULT;

	/**
	 * This is true if the Contains Error attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean containsErrorESet;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.FROM_ANOTHER_TABLE;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The default value of the '{@link #getMarkedInvalid() <em>Marked Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkedInvalid()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MARKED_INVALID_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMarkedInvalid() <em>Marked Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkedInvalid()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean markedInvalid = MARKED_INVALID_EDEFAULT;

	/**
	 * This is true if the Marked Invalid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean markedInvalidESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighlightedRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getHighlightedRangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellRangeAddress() {
		return cellRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellRangeAddress(String newCellRangeAddress) {
		String oldCellRangeAddress = cellRangeAddress;
		cellRangeAddress = newCellRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.HIGHLIGHTED_RANGE_TYPE__CELL_RANGE_ADDRESS, oldCellRangeAddress, cellRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getContainsError() {
		return containsError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsError(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newContainsError) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldContainsError = containsError;
		containsError = newContainsError == null ? CONTAINS_ERROR_EDEFAULT : newContainsError;
		boolean oldContainsErrorESet = containsErrorESet;
		containsErrorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.HIGHLIGHTED_RANGE_TYPE__CONTAINS_ERROR, oldContainsError, containsError, !oldContainsErrorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContainsError() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldContainsError = containsError;
		boolean oldContainsErrorESet = containsErrorESet;
		containsError = CONTAINS_ERROR_EDEFAULT;
		containsErrorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.HIGHLIGHTED_RANGE_TYPE__CONTAINS_ERROR, oldContainsError, CONTAINS_ERROR_EDEFAULT, oldContainsErrorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainsError() {
		return containsErrorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionType newDirection) {
		DirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.HIGHLIGHTED_RANGE_TYPE__DIRECTION, oldDirection, direction, !oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirection() {
		DirectionType oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.HIGHLIGHTED_RANGE_TYPE__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMarkedInvalid() {
		return markedInvalid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkedInvalid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMarkedInvalid) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMarkedInvalid = markedInvalid;
		markedInvalid = newMarkedInvalid == null ? MARKED_INVALID_EDEFAULT : newMarkedInvalid;
		boolean oldMarkedInvalidESet = markedInvalidESet;
		markedInvalidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.HIGHLIGHTED_RANGE_TYPE__MARKED_INVALID, oldMarkedInvalid, markedInvalid, !oldMarkedInvalidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarkedInvalid() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMarkedInvalid = markedInvalid;
		boolean oldMarkedInvalidESet = markedInvalidESet;
		markedInvalid = MARKED_INVALID_EDEFAULT;
		markedInvalidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.HIGHLIGHTED_RANGE_TYPE__MARKED_INVALID, oldMarkedInvalid, MARKED_INVALID_EDEFAULT, oldMarkedInvalidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarkedInvalid() {
		return markedInvalidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__CELL_RANGE_ADDRESS:
				return getCellRangeAddress();
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__CONTAINS_ERROR:
				return getContainsError();
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__DIRECTION:
				return getDirection();
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__MARKED_INVALID:
				return getMarkedInvalid();
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
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__CELL_RANGE_ADDRESS:
				setCellRangeAddress((String)newValue);
				return;
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__CONTAINS_ERROR:
				setContainsError((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__DIRECTION:
				setDirection((DirectionType)newValue);
				return;
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__MARKED_INVALID:
				setMarkedInvalid((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__CELL_RANGE_ADDRESS:
				setCellRangeAddress(CELL_RANGE_ADDRESS_EDEFAULT);
				return;
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__CONTAINS_ERROR:
				unsetContainsError();
				return;
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__DIRECTION:
				unsetDirection();
				return;
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__MARKED_INVALID:
				unsetMarkedInvalid();
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
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__CELL_RANGE_ADDRESS:
				return CELL_RANGE_ADDRESS_EDEFAULT == null ? cellRangeAddress != null : !CELL_RANGE_ADDRESS_EDEFAULT.equals(cellRangeAddress);
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__CONTAINS_ERROR:
				return isSetContainsError();
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__DIRECTION:
				return isSetDirection();
			case TablePackage.HIGHLIGHTED_RANGE_TYPE__MARKED_INVALID:
				return isSetMarkedInvalid();
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
		result.append(" (cellRangeAddress: ");
		result.append(cellRangeAddress);
		result.append(", containsError: ");
		if (containsErrorESet) result.append(containsError); else result.append("<unset>");
		result.append(", direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(", markedInvalid: ");
		if (markedInvalidESet) result.append(markedInvalid); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HighlightedRangeTypeImpl
