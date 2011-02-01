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
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pilot Layout Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotLayoutInfoTypeImpl#getAddEmptyLines <em>Add Empty Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotLayoutInfoTypeImpl#getLayoutMode <em>Layout Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPilotLayoutInfoTypeImpl extends EObjectImpl implements DataPilotLayoutInfoType {
	/**
	 * The default value of the '{@link #getAddEmptyLines() <em>Add Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddEmptyLines()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean ADD_EMPTY_LINES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAddEmptyLines() <em>Add Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddEmptyLines()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean addEmptyLines = ADD_EMPTY_LINES_EDEFAULT;

	/**
	 * This is true if the Add Empty Lines attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean addEmptyLinesESet;

	/**
	 * The default value of the '{@link #getLayoutMode() <em>Layout Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutMode()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutModeType LAYOUT_MODE_EDEFAULT = LayoutModeType.TABULAR_LAYOUT;

	/**
	 * The cached value of the '{@link #getLayoutMode() <em>Layout Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutMode()
	 * @generated
	 * @ordered
	 */
	protected LayoutModeType layoutMode = LAYOUT_MODE_EDEFAULT;

	/**
	 * This is true if the Layout Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layoutModeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPilotLayoutInfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDataPilotLayoutInfoType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAddEmptyLines() {
		return addEmptyLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAddEmptyLines) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAddEmptyLines = addEmptyLines;
		addEmptyLines = newAddEmptyLines == null ? ADD_EMPTY_LINES_EDEFAULT : newAddEmptyLines;
		boolean oldAddEmptyLinesESet = addEmptyLinesESet;
		addEmptyLinesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE__ADD_EMPTY_LINES, oldAddEmptyLines, addEmptyLines, !oldAddEmptyLinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAddEmptyLines() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAddEmptyLines = addEmptyLines;
		boolean oldAddEmptyLinesESet = addEmptyLinesESet;
		addEmptyLines = ADD_EMPTY_LINES_EDEFAULT;
		addEmptyLinesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE__ADD_EMPTY_LINES, oldAddEmptyLines, ADD_EMPTY_LINES_EDEFAULT, oldAddEmptyLinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAddEmptyLines() {
		return addEmptyLinesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutModeType getLayoutMode() {
		return layoutMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutMode(LayoutModeType newLayoutMode) {
		LayoutModeType oldLayoutMode = layoutMode;
		layoutMode = newLayoutMode == null ? LAYOUT_MODE_EDEFAULT : newLayoutMode;
		boolean oldLayoutModeESet = layoutModeESet;
		layoutModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE__LAYOUT_MODE, oldLayoutMode, layoutMode, !oldLayoutModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayoutMode() {
		LayoutModeType oldLayoutMode = layoutMode;
		boolean oldLayoutModeESet = layoutModeESet;
		layoutMode = LAYOUT_MODE_EDEFAULT;
		layoutModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE__LAYOUT_MODE, oldLayoutMode, LAYOUT_MODE_EDEFAULT, oldLayoutModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayoutMode() {
		return layoutModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE__ADD_EMPTY_LINES:
				return getAddEmptyLines();
			case TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE__LAYOUT_MODE:
				return getLayoutMode();
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
			case TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE__ADD_EMPTY_LINES:
				setAddEmptyLines((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE__LAYOUT_MODE:
				setLayoutMode((LayoutModeType)newValue);
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
			case TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE__ADD_EMPTY_LINES:
				unsetAddEmptyLines();
				return;
			case TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE__LAYOUT_MODE:
				unsetLayoutMode();
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
			case TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE__ADD_EMPTY_LINES:
				return isSetAddEmptyLines();
			case TablePackage.DATA_PILOT_LAYOUT_INFO_TYPE__LAYOUT_MODE:
				return isSetLayoutMode();
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
		result.append(" (addEmptyLines: ");
		if (addEmptyLinesESet) result.append(addEmptyLines); else result.append("<unset>");
		result.append(", layoutMode: ");
		if (layoutModeESet) result.append(layoutMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataPilotLayoutInfoTypeImpl
