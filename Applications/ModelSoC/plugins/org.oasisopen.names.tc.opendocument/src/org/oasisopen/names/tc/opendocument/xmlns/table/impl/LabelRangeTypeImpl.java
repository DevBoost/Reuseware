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
import org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.LabelRangeTypeImpl#getDataCellRangeAddress <em>Data Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.LabelRangeTypeImpl#getLabelCellRangeAddress <em>Label Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.LabelRangeTypeImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelRangeTypeImpl extends EObjectImpl implements LabelRangeType {
	/**
	 * The default value of the '{@link #getDataCellRangeAddress() <em>Data Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_CELL_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataCellRangeAddress() <em>Data Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String dataCellRangeAddress = DATA_CELL_RANGE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelCellRangeAddress() <em>Label Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_CELL_RANGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelCellRangeAddress() <em>Label Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelCellRangeAddress()
	 * @generated
	 * @ordered
	 */
	protected String labelCellRangeAddress = LABEL_CELL_RANGE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final OrientationType1 ORIENTATION_EDEFAULT = OrientationType1.COLUMN;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType1 orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getLabelRangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataCellRangeAddress() {
		return dataCellRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataCellRangeAddress(String newDataCellRangeAddress) {
		String oldDataCellRangeAddress = dataCellRangeAddress;
		dataCellRangeAddress = newDataCellRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.LABEL_RANGE_TYPE__DATA_CELL_RANGE_ADDRESS, oldDataCellRangeAddress, dataCellRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelCellRangeAddress() {
		return labelCellRangeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelCellRangeAddress(String newLabelCellRangeAddress) {
		String oldLabelCellRangeAddress = labelCellRangeAddress;
		labelCellRangeAddress = newLabelCellRangeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.LABEL_RANGE_TYPE__LABEL_CELL_RANGE_ADDRESS, oldLabelCellRangeAddress, labelCellRangeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType1 getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(OrientationType1 newOrientation) {
		OrientationType1 oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.LABEL_RANGE_TYPE__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrientation() {
		OrientationType1 oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.LABEL_RANGE_TYPE__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrientation() {
		return orientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.LABEL_RANGE_TYPE__DATA_CELL_RANGE_ADDRESS:
				return getDataCellRangeAddress();
			case TablePackage.LABEL_RANGE_TYPE__LABEL_CELL_RANGE_ADDRESS:
				return getLabelCellRangeAddress();
			case TablePackage.LABEL_RANGE_TYPE__ORIENTATION:
				return getOrientation();
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
			case TablePackage.LABEL_RANGE_TYPE__DATA_CELL_RANGE_ADDRESS:
				setDataCellRangeAddress((String)newValue);
				return;
			case TablePackage.LABEL_RANGE_TYPE__LABEL_CELL_RANGE_ADDRESS:
				setLabelCellRangeAddress((String)newValue);
				return;
			case TablePackage.LABEL_RANGE_TYPE__ORIENTATION:
				setOrientation((OrientationType1)newValue);
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
			case TablePackage.LABEL_RANGE_TYPE__DATA_CELL_RANGE_ADDRESS:
				setDataCellRangeAddress(DATA_CELL_RANGE_ADDRESS_EDEFAULT);
				return;
			case TablePackage.LABEL_RANGE_TYPE__LABEL_CELL_RANGE_ADDRESS:
				setLabelCellRangeAddress(LABEL_CELL_RANGE_ADDRESS_EDEFAULT);
				return;
			case TablePackage.LABEL_RANGE_TYPE__ORIENTATION:
				unsetOrientation();
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
			case TablePackage.LABEL_RANGE_TYPE__DATA_CELL_RANGE_ADDRESS:
				return DATA_CELL_RANGE_ADDRESS_EDEFAULT == null ? dataCellRangeAddress != null : !DATA_CELL_RANGE_ADDRESS_EDEFAULT.equals(dataCellRangeAddress);
			case TablePackage.LABEL_RANGE_TYPE__LABEL_CELL_RANGE_ADDRESS:
				return LABEL_CELL_RANGE_ADDRESS_EDEFAULT == null ? labelCellRangeAddress != null : !LABEL_CELL_RANGE_ADDRESS_EDEFAULT.equals(labelCellRangeAddress);
			case TablePackage.LABEL_RANGE_TYPE__ORIENTATION:
				return isSetOrientation();
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
		result.append(" (dataCellRangeAddress: ");
		result.append(dataCellRangeAddress);
		result.append(", labelCellRangeAddress: ");
		result.append(labelCellRangeAddress);
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LabelRangeTypeImpl
