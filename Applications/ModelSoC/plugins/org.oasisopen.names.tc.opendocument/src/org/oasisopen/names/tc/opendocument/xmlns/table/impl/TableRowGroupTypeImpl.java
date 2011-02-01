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
import org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getTableRowGroup <em>Table Row Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getTableRows <em>Table Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getTableRow <em>Table Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getTableHeaderRows <em>Table Header Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getTableRows1 <em>Table Rows1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getSoftPageBreak1 <em>Soft Page Break1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getTableRow1 <em>Table Row1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getTableHeaderRows1 <em>Table Header Rows1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getTableRows2 <em>Table Rows2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getSoftPageBreak2 <em>Soft Page Break2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getTableRow2 <em>Table Row2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowGroupTypeImpl#getDisplay <em>Display</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableRowGroupTypeImpl extends EObjectImpl implements TableRowGroupType {
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
	protected TableRowGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getTableRowGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TablePackage.TABLE_ROW_GROUP_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowGroupType> getTableRowGroup() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowGroupType_TableRowGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowsType> getTableRows() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowGroupType_TableRows());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowGroupType_SoftPageBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowType> getTableRow() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowGroupType_TableRow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableHeaderRowsType> getTableHeaderRows() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowGroupType_TableHeaderRows());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowsType> getTableRows1() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowGroupType_TableRows1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak1() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowGroupType_SoftPageBreak1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowType> getTableRow1() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowGroupType_TableRow1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableHeaderRowsType> getTableHeaderRows1() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowGroupType_TableHeaderRows1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowsType> getTableRows2() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowGroupType_TableRows2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak2() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowGroupType_SoftPageBreak2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowType> getTableRow2() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowGroupType_TableRow2());
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_ROW_GROUP_TYPE__DISPLAY, oldDisplay, display, !oldDisplayESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_ROW_GROUP_TYPE__DISPLAY, oldDisplay, DISPLAY_EDEFAULT, oldDisplayESet));
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
			case TablePackage.TABLE_ROW_GROUP_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW_GROUP:
				return ((InternalEList<?>)getTableRowGroup()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS:
				return ((InternalEList<?>)getTableRows()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK:
				return ((InternalEList<?>)getSoftPageBreak()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW:
				return ((InternalEList<?>)getTableRow()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_HEADER_ROWS:
				return ((InternalEList<?>)getTableHeaderRows()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS1:
				return ((InternalEList<?>)getTableRows1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK1:
				return ((InternalEList<?>)getSoftPageBreak1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW1:
				return ((InternalEList<?>)getTableRow1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_HEADER_ROWS1:
				return ((InternalEList<?>)getTableHeaderRows1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS2:
				return ((InternalEList<?>)getTableRows2()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK2:
				return ((InternalEList<?>)getSoftPageBreak2()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW2:
				return ((InternalEList<?>)getTableRow2()).basicRemove(otherEnd, msgs);
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
			case TablePackage.TABLE_ROW_GROUP_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW_GROUP:
				return getTableRowGroup();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS:
				return getTableRows();
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW:
				return getTableRow();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_HEADER_ROWS:
				return getTableHeaderRows();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS1:
				return getTableRows1();
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK1:
				return getSoftPageBreak1();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW1:
				return getTableRow1();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_HEADER_ROWS1:
				return getTableHeaderRows1();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS2:
				return getTableRows2();
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK2:
				return getSoftPageBreak2();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW2:
				return getTableRow2();
			case TablePackage.TABLE_ROW_GROUP_TYPE__DISPLAY:
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
			case TablePackage.TABLE_ROW_GROUP_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW_GROUP:
				getTableRowGroup().clear();
				getTableRowGroup().addAll((Collection<? extends TableRowGroupType>)newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS:
				getTableRows().clear();
				getTableRows().addAll((Collection<? extends TableRowsType>)newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				getSoftPageBreak().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW:
				getTableRow().clear();
				getTableRow().addAll((Collection<? extends TableRowType>)newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_HEADER_ROWS:
				getTableHeaderRows().clear();
				getTableHeaderRows().addAll((Collection<? extends TableHeaderRowsType>)newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS1:
				getTableRows1().clear();
				getTableRows1().addAll((Collection<? extends TableRowsType>)newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK1:
				getSoftPageBreak1().clear();
				getSoftPageBreak1().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW1:
				getTableRow1().clear();
				getTableRow1().addAll((Collection<? extends TableRowType>)newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_HEADER_ROWS1:
				getTableHeaderRows1().clear();
				getTableHeaderRows1().addAll((Collection<? extends TableHeaderRowsType>)newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS2:
				getTableRows2().clear();
				getTableRows2().addAll((Collection<? extends TableRowsType>)newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK2:
				getSoftPageBreak2().clear();
				getSoftPageBreak2().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW2:
				getTableRow2().clear();
				getTableRow2().addAll((Collection<? extends TableRowType>)newValue);
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__DISPLAY:
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
			case TablePackage.TABLE_ROW_GROUP_TYPE__GROUP:
				getGroup().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW_GROUP:
				getTableRowGroup().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS:
				getTableRows().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW:
				getTableRow().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_HEADER_ROWS:
				getTableHeaderRows().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS1:
				getTableRows1().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK1:
				getSoftPageBreak1().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW1:
				getTableRow1().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_HEADER_ROWS1:
				getTableHeaderRows1().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS2:
				getTableRows2().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK2:
				getSoftPageBreak2().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW2:
				getTableRow2().clear();
				return;
			case TablePackage.TABLE_ROW_GROUP_TYPE__DISPLAY:
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
			case TablePackage.TABLE_ROW_GROUP_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW_GROUP:
				return !getTableRowGroup().isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS:
				return !getTableRows().isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK:
				return !getSoftPageBreak().isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW:
				return !getTableRow().isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_HEADER_ROWS:
				return !getTableHeaderRows().isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS1:
				return !getTableRows1().isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK1:
				return !getSoftPageBreak1().isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW1:
				return !getTableRow1().isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_HEADER_ROWS1:
				return !getTableHeaderRows1().isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROWS2:
				return !getTableRows2().isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__SOFT_PAGE_BREAK2:
				return !getSoftPageBreak2().isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__TABLE_ROW2:
				return !getTableRow2().isEmpty();
			case TablePackage.TABLE_ROW_GROUP_TYPE__DISPLAY:
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

} //TableRowGroupTypeImpl
