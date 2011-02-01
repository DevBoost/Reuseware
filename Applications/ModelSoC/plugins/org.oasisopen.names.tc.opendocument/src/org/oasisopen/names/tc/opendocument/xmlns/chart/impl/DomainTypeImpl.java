/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.chart.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DomainType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.DomainTypeImpl#getCellRangeAddress <em>Cell Range Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainTypeImpl extends EObjectImpl implements DomainType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartPackage.Literals.DOMAIN_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.DOMAIN_TYPE__CELL_RANGE_ADDRESS, oldCellRangeAddress, cellRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChartPackage.DOMAIN_TYPE__CELL_RANGE_ADDRESS:
				return getCellRangeAddress();
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
			case ChartPackage.DOMAIN_TYPE__CELL_RANGE_ADDRESS:
				setCellRangeAddress((String)newValue);
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
			case ChartPackage.DOMAIN_TYPE__CELL_RANGE_ADDRESS:
				setCellRangeAddress(CELL_RANGE_ADDRESS_EDEFAULT);
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
			case ChartPackage.DOMAIN_TYPE__CELL_RANGE_ADDRESS:
				return CELL_RANGE_ADDRESS_EDEFAULT == null ? cellRangeAddress != null : !CELL_RANGE_ADDRESS_EDEFAULT.equals(cellRangeAddress);
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
		result.append(')');
		return result.toString();
	}

} //DomainTypeImpl
