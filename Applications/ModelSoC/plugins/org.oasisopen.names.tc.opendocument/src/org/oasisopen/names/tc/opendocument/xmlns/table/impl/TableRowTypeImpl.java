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
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.table.CoveredTableCellType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowTypeImpl#getTableCell <em>Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowTypeImpl#getCoveredTableCell <em>Covered Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowTypeImpl#getDefaultCellStyleName <em>Default Cell Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowTypeImpl#getNumberRowsRepeated <em>Number Rows Repeated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableRowTypeImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableRowTypeImpl extends EObjectImpl implements TableRowType {
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
	 * The default value of the '{@link #getDefaultCellStyleName() <em>Default Cell Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCellStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CELL_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultCellStyleName() <em>Default Cell Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCellStyleName()
	 * @generated
	 * @ordered
	 */
	protected String defaultCellStyleName = DEFAULT_CELL_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberRowsRepeated() <em>Number Rows Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRowsRepeated()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_ROWS_REPEATED_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getNumberRowsRepeated() <em>Number Rows Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRowsRepeated()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberRowsRepeated = NUMBER_ROWS_REPEATED_EDEFAULT;

	/**
	 * This is true if the Number Rows Repeated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberRowsRepeatedESet;

	/**
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected String styleName = STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final TableVisibilityValue VISIBILITY_EDEFAULT = TableVisibilityValue.VISIBLE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected TableVisibilityValue visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableRowTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getTableRowType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TablePackage.TABLE_ROW_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableCellType> getTableCell() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowType_TableCell());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoveredTableCellType> getCoveredTableCell() {
		return getGroup().list(TablePackage.eINSTANCE.getTableRowType_CoveredTableCell());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultCellStyleName() {
		return defaultCellStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCellStyleName(String newDefaultCellStyleName) {
		String oldDefaultCellStyleName = defaultCellStyleName;
		defaultCellStyleName = newDefaultCellStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_ROW_TYPE__DEFAULT_CELL_STYLE_NAME, oldDefaultCellStyleName, defaultCellStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberRowsRepeated() {
		return numberRowsRepeated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberRowsRepeated(BigInteger newNumberRowsRepeated) {
		BigInteger oldNumberRowsRepeated = numberRowsRepeated;
		numberRowsRepeated = newNumberRowsRepeated;
		boolean oldNumberRowsRepeatedESet = numberRowsRepeatedESet;
		numberRowsRepeatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_ROW_TYPE__NUMBER_ROWS_REPEATED, oldNumberRowsRepeated, numberRowsRepeated, !oldNumberRowsRepeatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberRowsRepeated() {
		BigInteger oldNumberRowsRepeated = numberRowsRepeated;
		boolean oldNumberRowsRepeatedESet = numberRowsRepeatedESet;
		numberRowsRepeated = NUMBER_ROWS_REPEATED_EDEFAULT;
		numberRowsRepeatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_ROW_TYPE__NUMBER_ROWS_REPEATED, oldNumberRowsRepeated, NUMBER_ROWS_REPEATED_EDEFAULT, oldNumberRowsRepeatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberRowsRepeated() {
		return numberRowsRepeatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName(String newStyleName) {
		String oldStyleName = styleName;
		styleName = newStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_ROW_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableVisibilityValue getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(TableVisibilityValue newVisibility) {
		TableVisibilityValue oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_ROW_TYPE__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility() {
		TableVisibilityValue oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_ROW_TYPE__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return visibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.TABLE_ROW_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_TYPE__TABLE_CELL:
				return ((InternalEList<?>)getTableCell()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_ROW_TYPE__COVERED_TABLE_CELL:
				return ((InternalEList<?>)getCoveredTableCell()).basicRemove(otherEnd, msgs);
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
			case TablePackage.TABLE_ROW_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TablePackage.TABLE_ROW_TYPE__TABLE_CELL:
				return getTableCell();
			case TablePackage.TABLE_ROW_TYPE__COVERED_TABLE_CELL:
				return getCoveredTableCell();
			case TablePackage.TABLE_ROW_TYPE__DEFAULT_CELL_STYLE_NAME:
				return getDefaultCellStyleName();
			case TablePackage.TABLE_ROW_TYPE__NUMBER_ROWS_REPEATED:
				return getNumberRowsRepeated();
			case TablePackage.TABLE_ROW_TYPE__STYLE_NAME:
				return getStyleName();
			case TablePackage.TABLE_ROW_TYPE__VISIBILITY:
				return getVisibility();
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
			case TablePackage.TABLE_ROW_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TablePackage.TABLE_ROW_TYPE__TABLE_CELL:
				getTableCell().clear();
				getTableCell().addAll((Collection<? extends TableCellType>)newValue);
				return;
			case TablePackage.TABLE_ROW_TYPE__COVERED_TABLE_CELL:
				getCoveredTableCell().clear();
				getCoveredTableCell().addAll((Collection<? extends CoveredTableCellType>)newValue);
				return;
			case TablePackage.TABLE_ROW_TYPE__DEFAULT_CELL_STYLE_NAME:
				setDefaultCellStyleName((String)newValue);
				return;
			case TablePackage.TABLE_ROW_TYPE__NUMBER_ROWS_REPEATED:
				setNumberRowsRepeated((BigInteger)newValue);
				return;
			case TablePackage.TABLE_ROW_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case TablePackage.TABLE_ROW_TYPE__VISIBILITY:
				setVisibility((TableVisibilityValue)newValue);
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
			case TablePackage.TABLE_ROW_TYPE__GROUP:
				getGroup().clear();
				return;
			case TablePackage.TABLE_ROW_TYPE__TABLE_CELL:
				getTableCell().clear();
				return;
			case TablePackage.TABLE_ROW_TYPE__COVERED_TABLE_CELL:
				getCoveredTableCell().clear();
				return;
			case TablePackage.TABLE_ROW_TYPE__DEFAULT_CELL_STYLE_NAME:
				setDefaultCellStyleName(DEFAULT_CELL_STYLE_NAME_EDEFAULT);
				return;
			case TablePackage.TABLE_ROW_TYPE__NUMBER_ROWS_REPEATED:
				unsetNumberRowsRepeated();
				return;
			case TablePackage.TABLE_ROW_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case TablePackage.TABLE_ROW_TYPE__VISIBILITY:
				unsetVisibility();
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
			case TablePackage.TABLE_ROW_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TablePackage.TABLE_ROW_TYPE__TABLE_CELL:
				return !getTableCell().isEmpty();
			case TablePackage.TABLE_ROW_TYPE__COVERED_TABLE_CELL:
				return !getCoveredTableCell().isEmpty();
			case TablePackage.TABLE_ROW_TYPE__DEFAULT_CELL_STYLE_NAME:
				return DEFAULT_CELL_STYLE_NAME_EDEFAULT == null ? defaultCellStyleName != null : !DEFAULT_CELL_STYLE_NAME_EDEFAULT.equals(defaultCellStyleName);
			case TablePackage.TABLE_ROW_TYPE__NUMBER_ROWS_REPEATED:
				return isSetNumberRowsRepeated();
			case TablePackage.TABLE_ROW_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case TablePackage.TABLE_ROW_TYPE__VISIBILITY:
				return isSetVisibility();
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
		result.append(", defaultCellStyleName: ");
		result.append(defaultCellStyleName);
		result.append(", numberRowsRepeated: ");
		if (numberRowsRepeatedESet) result.append(numberRowsRepeated); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TableRowTypeImpl
