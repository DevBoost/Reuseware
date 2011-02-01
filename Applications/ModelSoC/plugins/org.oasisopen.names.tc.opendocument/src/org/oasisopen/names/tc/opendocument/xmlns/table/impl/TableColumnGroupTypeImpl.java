/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl#getTableColumnGroup <em>Table Column Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl#getTableColumns <em>Table Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl#getTableColumn <em>Table Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl#getTableHeaderColumns <em>Table Header Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl#getTableColumns1 <em>Table Columns1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl#getTableColumn1 <em>Table Column1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl#getTableHeaderColumns1 <em>Table Header Columns1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl#getTableColumns2 <em>Table Columns2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl#getTableColumn2 <em>Table Column2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnGroupTypeImpl#getDisplay <em>Display</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableColumnGroupTypeImpl extends EObjectImpl implements TableColumnGroupType {
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
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean display = DISPLAY_EDEFAULT;

	/**
	 * This is true if the Display attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableColumnGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getTableColumnGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TablePackage.TABLE_COLUMN_GROUP_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnGroupType> getTableColumnGroup() {
		return getGroup().list(TablePackage.eINSTANCE.getTableColumnGroupType_TableColumnGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnsType> getTableColumns() {
		return getGroup().list(TablePackage.eINSTANCE.getTableColumnGroupType_TableColumns());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnType> getTableColumn() {
		return getGroup().list(TablePackage.eINSTANCE.getTableColumnGroupType_TableColumn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableHeaderColumnsType> getTableHeaderColumns() {
		return getGroup().list(TablePackage.eINSTANCE.getTableColumnGroupType_TableHeaderColumns());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnsType> getTableColumns1() {
		return getGroup().list(TablePackage.eINSTANCE.getTableColumnGroupType_TableColumns1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnType> getTableColumn1() {
		return getGroup().list(TablePackage.eINSTANCE.getTableColumnGroupType_TableColumn1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableHeaderColumnsType> getTableHeaderColumns1() {
		return getGroup().list(TablePackage.eINSTANCE.getTableColumnGroupType_TableHeaderColumns1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnsType> getTableColumns2() {
		return getGroup().list(TablePackage.eINSTANCE.getTableColumnGroupType_TableColumns2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnType> getTableColumn2() {
		return getGroup().list(TablePackage.eINSTANCE.getTableColumnGroupType_TableColumn2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplay) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplay = display;
		display = newDisplay == null ? DISPLAY_EDEFAULT : newDisplay;
		boolean oldDisplayESet = displayESet;
		displayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_COLUMN_GROUP_TYPE__DISPLAY, oldDisplay, display, !oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplay() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplay = display;
		boolean oldDisplayESet = displayESet;
		display = DISPLAY_EDEFAULT;
		displayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_COLUMN_GROUP_TYPE__DISPLAY, oldDisplay, DISPLAY_EDEFAULT, oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplay() {
		return displayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN_GROUP:
				return ((InternalEList<?>)getTableColumnGroup()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS:
				return ((InternalEList<?>)getTableColumns()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN:
				return ((InternalEList<?>)getTableColumn()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_HEADER_COLUMNS:
				return ((InternalEList<?>)getTableHeaderColumns()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS1:
				return ((InternalEList<?>)getTableColumns1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN1:
				return ((InternalEList<?>)getTableColumn1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_HEADER_COLUMNS1:
				return ((InternalEList<?>)getTableHeaderColumns1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS2:
				return ((InternalEList<?>)getTableColumns2()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN2:
				return ((InternalEList<?>)getTableColumn2()).basicRemove(otherEnd, msgs);
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
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN_GROUP:
				return getTableColumnGroup();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS:
				return getTableColumns();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN:
				return getTableColumn();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_HEADER_COLUMNS:
				return getTableHeaderColumns();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS1:
				return getTableColumns1();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN1:
				return getTableColumn1();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_HEADER_COLUMNS1:
				return getTableHeaderColumns1();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS2:
				return getTableColumns2();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN2:
				return getTableColumn2();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__DISPLAY:
				return getDisplay();
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
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN_GROUP:
				getTableColumnGroup().clear();
				getTableColumnGroup().addAll((Collection<? extends TableColumnGroupType>)newValue);
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS:
				getTableColumns().clear();
				getTableColumns().addAll((Collection<? extends TableColumnsType>)newValue);
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN:
				getTableColumn().clear();
				getTableColumn().addAll((Collection<? extends TableColumnType>)newValue);
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_HEADER_COLUMNS:
				getTableHeaderColumns().clear();
				getTableHeaderColumns().addAll((Collection<? extends TableHeaderColumnsType>)newValue);
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS1:
				getTableColumns1().clear();
				getTableColumns1().addAll((Collection<? extends TableColumnsType>)newValue);
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN1:
				getTableColumn1().clear();
				getTableColumn1().addAll((Collection<? extends TableColumnType>)newValue);
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_HEADER_COLUMNS1:
				getTableHeaderColumns1().clear();
				getTableHeaderColumns1().addAll((Collection<? extends TableHeaderColumnsType>)newValue);
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS2:
				getTableColumns2().clear();
				getTableColumns2().addAll((Collection<? extends TableColumnsType>)newValue);
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN2:
				getTableColumn2().clear();
				getTableColumn2().addAll((Collection<? extends TableColumnType>)newValue);
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__DISPLAY:
				setDisplay((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__GROUP:
				getGroup().clear();
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN_GROUP:
				getTableColumnGroup().clear();
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS:
				getTableColumns().clear();
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN:
				getTableColumn().clear();
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_HEADER_COLUMNS:
				getTableHeaderColumns().clear();
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS1:
				getTableColumns1().clear();
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN1:
				getTableColumn1().clear();
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_HEADER_COLUMNS1:
				getTableHeaderColumns1().clear();
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS2:
				getTableColumns2().clear();
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN2:
				getTableColumn2().clear();
				return;
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__DISPLAY:
				unsetDisplay();
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
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN_GROUP:
				return !getTableColumnGroup().isEmpty();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS:
				return !getTableColumns().isEmpty();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN:
				return !getTableColumn().isEmpty();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_HEADER_COLUMNS:
				return !getTableHeaderColumns().isEmpty();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS1:
				return !getTableColumns1().isEmpty();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN1:
				return !getTableColumn1().isEmpty();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_HEADER_COLUMNS1:
				return !getTableHeaderColumns1().isEmpty();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMNS2:
				return !getTableColumns2().isEmpty();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__TABLE_COLUMN2:
				return !getTableColumn2().isEmpty();
			case TablePackage.TABLE_COLUMN_GROUP_TYPE__DISPLAY:
				return isSetDisplay();
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
		result.append(", display: ");
		if (displayESet) result.append(display); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TableColumnGroupTypeImpl
