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
import org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableVisibilityValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnTypeImpl#getDefaultCellStyleName <em>Default Cell Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnTypeImpl#getNumberColumnsRepeated <em>Number Columns Repeated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableColumnTypeImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableColumnTypeImpl extends EObjectImpl implements TableColumnType {
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
	 * The default value of the '{@link #getNumberColumnsRepeated() <em>Number Columns Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberColumnsRepeated()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_COLUMNS_REPEATED_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getNumberColumnsRepeated() <em>Number Columns Repeated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberColumnsRepeated()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberColumnsRepeated = NUMBER_COLUMNS_REPEATED_EDEFAULT;

	/**
	 * This is true if the Number Columns Repeated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberColumnsRepeatedESet;

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
	protected TableColumnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getTableColumnType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_COLUMN_TYPE__DEFAULT_CELL_STYLE_NAME, oldDefaultCellStyleName, defaultCellStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberColumnsRepeated() {
		return numberColumnsRepeated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberColumnsRepeated(BigInteger newNumberColumnsRepeated) {
		BigInteger oldNumberColumnsRepeated = numberColumnsRepeated;
		numberColumnsRepeated = newNumberColumnsRepeated;
		boolean oldNumberColumnsRepeatedESet = numberColumnsRepeatedESet;
		numberColumnsRepeatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_COLUMN_TYPE__NUMBER_COLUMNS_REPEATED, oldNumberColumnsRepeated, numberColumnsRepeated, !oldNumberColumnsRepeatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberColumnsRepeated() {
		BigInteger oldNumberColumnsRepeated = numberColumnsRepeated;
		boolean oldNumberColumnsRepeatedESet = numberColumnsRepeatedESet;
		numberColumnsRepeated = NUMBER_COLUMNS_REPEATED_EDEFAULT;
		numberColumnsRepeatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_COLUMN_TYPE__NUMBER_COLUMNS_REPEATED, oldNumberColumnsRepeated, NUMBER_COLUMNS_REPEATED_EDEFAULT, oldNumberColumnsRepeatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberColumnsRepeated() {
		return numberColumnsRepeatedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_COLUMN_TYPE__STYLE_NAME, oldStyleName, styleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_COLUMN_TYPE__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_COLUMN_TYPE__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.TABLE_COLUMN_TYPE__DEFAULT_CELL_STYLE_NAME:
				return getDefaultCellStyleName();
			case TablePackage.TABLE_COLUMN_TYPE__NUMBER_COLUMNS_REPEATED:
				return getNumberColumnsRepeated();
			case TablePackage.TABLE_COLUMN_TYPE__STYLE_NAME:
				return getStyleName();
			case TablePackage.TABLE_COLUMN_TYPE__VISIBILITY:
				return getVisibility();
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
			case TablePackage.TABLE_COLUMN_TYPE__DEFAULT_CELL_STYLE_NAME:
				setDefaultCellStyleName((String)newValue);
				return;
			case TablePackage.TABLE_COLUMN_TYPE__NUMBER_COLUMNS_REPEATED:
				setNumberColumnsRepeated((BigInteger)newValue);
				return;
			case TablePackage.TABLE_COLUMN_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case TablePackage.TABLE_COLUMN_TYPE__VISIBILITY:
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
			case TablePackage.TABLE_COLUMN_TYPE__DEFAULT_CELL_STYLE_NAME:
				setDefaultCellStyleName(DEFAULT_CELL_STYLE_NAME_EDEFAULT);
				return;
			case TablePackage.TABLE_COLUMN_TYPE__NUMBER_COLUMNS_REPEATED:
				unsetNumberColumnsRepeated();
				return;
			case TablePackage.TABLE_COLUMN_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case TablePackage.TABLE_COLUMN_TYPE__VISIBILITY:
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
			case TablePackage.TABLE_COLUMN_TYPE__DEFAULT_CELL_STYLE_NAME:
				return DEFAULT_CELL_STYLE_NAME_EDEFAULT == null ? defaultCellStyleName != null : !DEFAULT_CELL_STYLE_NAME_EDEFAULT.equals(defaultCellStyleName);
			case TablePackage.TABLE_COLUMN_TYPE__NUMBER_COLUMNS_REPEATED:
				return isSetNumberColumnsRepeated();
			case TablePackage.TABLE_COLUMN_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case TablePackage.TABLE_COLUMN_TYPE__VISIBILITY:
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
		result.append(" (defaultCellStyleName: ");
		result.append(defaultCellStyleName);
		result.append(", numberColumnsRepeated: ");
		if (numberColumnsRepeatedESet) result.append(numberColumnsRepeated); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TableColumnTypeImpl
