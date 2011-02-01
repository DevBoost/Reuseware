/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.math.BigInteger;
import java.util.Collection;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1;
import org.oasisopen.names.tc.opendocument.xmlns.table.ChangeTrackTableCellType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Track Table Cell Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getCellAddress <em>Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getMatrixCovered <em>Matrix Covered</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getNumberMatrixColumnsSpanned <em>Number Matrix Columns Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getNumberMatrixRowsSpanned <em>Number Matrix Rows Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ChangeTrackTableCellTypeImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeTrackTableCellTypeImpl extends EObjectImpl implements ChangeTrackTableCellType {
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected EList<PType> p;

	/**
	 * The default value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean BOOLEAN_VALUE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean booleanValue = BOOLEAN_VALUE_EDEFAULT;

	/**
	 * This is true if the Boolean Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean booleanValueESet;

	/**
	 * The default value of the '{@link #getCellAddress() <em>Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CELL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellAddress() <em>Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellAddress()
	 * @generated
	 * @ordered
	 */
	protected String cellAddress = CELL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected String currency = CURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateValue() <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValue()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateValue() <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValue()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateValue = DATE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected String formula = FORMULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatrixCovered() <em>Matrix Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrixCovered()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MATRIX_COVERED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMatrixCovered() <em>Matrix Covered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrixCovered()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean matrixCovered = MATRIX_COVERED_EDEFAULT;

	/**
	 * This is true if the Matrix Covered attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean matrixCoveredESet;

	/**
	 * The default value of the '{@link #getNumberMatrixColumnsSpanned() <em>Number Matrix Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberMatrixColumnsSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberMatrixColumnsSpanned() <em>Number Matrix Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberMatrixColumnsSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberMatrixColumnsSpanned = NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberMatrixRowsSpanned() <em>Number Matrix Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberMatrixRowsSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberMatrixRowsSpanned() <em>Number Matrix Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberMatrixRowsSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberMatrixRowsSpanned = NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected String stringValue = STRING_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeValue() <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected static final Duration TIME_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeValue() <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected Duration timeValue = TIME_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final ValueTypeType1 VALUE_TYPE_EDEFAULT = ValueTypeType1.FLOAT;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected ValueTypeType1 valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * This is true if the Value Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeTrackTableCellTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getChangeTrackTableCellType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		if (p == null) {
			p = new EObjectContainmentEList<PType>(PType.class, this, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__P);
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBooleanValue() {
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newBooleanValue) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBooleanValue = booleanValue;
		booleanValue = newBooleanValue == null ? BOOLEAN_VALUE_EDEFAULT : newBooleanValue;
		boolean oldBooleanValueESet = booleanValueESet;
		booleanValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__BOOLEAN_VALUE, oldBooleanValue, booleanValue, !oldBooleanValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBooleanValue() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBooleanValue = booleanValue;
		boolean oldBooleanValueESet = booleanValueESet;
		booleanValue = BOOLEAN_VALUE_EDEFAULT;
		booleanValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__BOOLEAN_VALUE, oldBooleanValue, BOOLEAN_VALUE_EDEFAULT, oldBooleanValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBooleanValue() {
		return booleanValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellAddress() {
		return cellAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellAddress(String newCellAddress) {
		String oldCellAddress = cellAddress;
		cellAddress = newCellAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__CELL_ADDRESS, oldCellAddress, cellAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(String newCurrency) {
		String oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateValue() {
		return dateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateValue(XMLGregorianCalendar newDateValue) {
		XMLGregorianCalendar oldDateValue = dateValue;
		dateValue = newDateValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__DATE_VALUE, oldDateValue, dateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		String oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__FORMULA, oldFormula, formula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMatrixCovered() {
		return matrixCovered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatrixCovered(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMatrixCovered) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMatrixCovered = matrixCovered;
		matrixCovered = newMatrixCovered == null ? MATRIX_COVERED_EDEFAULT : newMatrixCovered;
		boolean oldMatrixCoveredESet = matrixCoveredESet;
		matrixCoveredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__MATRIX_COVERED, oldMatrixCovered, matrixCovered, !oldMatrixCoveredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMatrixCovered() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMatrixCovered = matrixCovered;
		boolean oldMatrixCoveredESet = matrixCoveredESet;
		matrixCovered = MATRIX_COVERED_EDEFAULT;
		matrixCoveredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__MATRIX_COVERED, oldMatrixCovered, MATRIX_COVERED_EDEFAULT, oldMatrixCoveredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMatrixCovered() {
		return matrixCoveredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberMatrixColumnsSpanned() {
		return numberMatrixColumnsSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberMatrixColumnsSpanned(BigInteger newNumberMatrixColumnsSpanned) {
		BigInteger oldNumberMatrixColumnsSpanned = numberMatrixColumnsSpanned;
		numberMatrixColumnsSpanned = newNumberMatrixColumnsSpanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__NUMBER_MATRIX_COLUMNS_SPANNED, oldNumberMatrixColumnsSpanned, numberMatrixColumnsSpanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberMatrixRowsSpanned() {
		return numberMatrixRowsSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberMatrixRowsSpanned(BigInteger newNumberMatrixRowsSpanned) {
		BigInteger oldNumberMatrixRowsSpanned = numberMatrixRowsSpanned;
		numberMatrixRowsSpanned = newNumberMatrixRowsSpanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__NUMBER_MATRIX_ROWS_SPANNED, oldNumberMatrixRowsSpanned, numberMatrixRowsSpanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(String newStringValue) {
		String oldStringValue = stringValue;
		stringValue = newStringValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__STRING_VALUE, oldStringValue, stringValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimeValue() {
		return timeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeValue(Duration newTimeValue) {
		Duration oldTimeValue = timeValue;
		timeValue = newTimeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__TIME_VALUE, oldTimeValue, timeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		double oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeType1 getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(ValueTypeType1 newValueType) {
		ValueTypeType1 oldValueType = valueType;
		valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
		boolean oldValueTypeESet = valueTypeESet;
		valueTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__VALUE_TYPE, oldValueType, valueType, !oldValueTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValueType() {
		ValueTypeType1 oldValueType = valueType;
		boolean oldValueTypeESet = valueTypeESet;
		valueType = VALUE_TYPE_EDEFAULT;
		valueTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__VALUE_TYPE, oldValueType, VALUE_TYPE_EDEFAULT, oldValueTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValueType() {
		return valueTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
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
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__P:
				return getP();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__BOOLEAN_VALUE:
				return getBooleanValue();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__CELL_ADDRESS:
				return getCellAddress();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__CURRENCY:
				return getCurrency();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__DATE_VALUE:
				return getDateValue();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__FORMULA:
				return getFormula();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__MATRIX_COVERED:
				return getMatrixCovered();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__NUMBER_MATRIX_COLUMNS_SPANNED:
				return getNumberMatrixColumnsSpanned();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__NUMBER_MATRIX_ROWS_SPANNED:
				return getNumberMatrixRowsSpanned();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__STRING_VALUE:
				return getStringValue();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__TIME_VALUE:
				return getTimeValue();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__VALUE:
				return new Double(getValue());
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__VALUE_TYPE:
				return getValueType();
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
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__BOOLEAN_VALUE:
				setBooleanValue((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__CELL_ADDRESS:
				setCellAddress((String)newValue);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__CURRENCY:
				setCurrency((String)newValue);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__DATE_VALUE:
				setDateValue((XMLGregorianCalendar)newValue);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__FORMULA:
				setFormula((String)newValue);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__MATRIX_COVERED:
				setMatrixCovered((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__NUMBER_MATRIX_COLUMNS_SPANNED:
				setNumberMatrixColumnsSpanned((BigInteger)newValue);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__NUMBER_MATRIX_ROWS_SPANNED:
				setNumberMatrixRowsSpanned((BigInteger)newValue);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__TIME_VALUE:
				setTimeValue((Duration)newValue);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__VALUE:
				setValue(((Double)newValue).doubleValue());
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__VALUE_TYPE:
				setValueType((ValueTypeType1)newValue);
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
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__P:
				getP().clear();
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__BOOLEAN_VALUE:
				unsetBooleanValue();
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__CELL_ADDRESS:
				setCellAddress(CELL_ADDRESS_EDEFAULT);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__DATE_VALUE:
				setDateValue(DATE_VALUE_EDEFAULT);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__MATRIX_COVERED:
				unsetMatrixCovered();
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__NUMBER_MATRIX_COLUMNS_SPANNED:
				setNumberMatrixColumnsSpanned(NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__NUMBER_MATRIX_ROWS_SPANNED:
				setNumberMatrixRowsSpanned(NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__TIME_VALUE:
				setTimeValue(TIME_VALUE_EDEFAULT);
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__VALUE:
				unsetValue();
				return;
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__VALUE_TYPE:
				unsetValueType();
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
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__P:
				return p != null && !p.isEmpty();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__BOOLEAN_VALUE:
				return isSetBooleanValue();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__CELL_ADDRESS:
				return CELL_ADDRESS_EDEFAULT == null ? cellAddress != null : !CELL_ADDRESS_EDEFAULT.equals(cellAddress);
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__CURRENCY:
				return CURRENCY_EDEFAULT == null ? currency != null : !CURRENCY_EDEFAULT.equals(currency);
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__DATE_VALUE:
				return DATE_VALUE_EDEFAULT == null ? dateValue != null : !DATE_VALUE_EDEFAULT.equals(dateValue);
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__MATRIX_COVERED:
				return isSetMatrixCovered();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__NUMBER_MATRIX_COLUMNS_SPANNED:
				return NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT == null ? numberMatrixColumnsSpanned != null : !NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT.equals(numberMatrixColumnsSpanned);
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__NUMBER_MATRIX_ROWS_SPANNED:
				return NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT == null ? numberMatrixRowsSpanned != null : !NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT.equals(numberMatrixRowsSpanned);
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__TIME_VALUE:
				return TIME_VALUE_EDEFAULT == null ? timeValue != null : !TIME_VALUE_EDEFAULT.equals(timeValue);
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__VALUE:
				return isSetValue();
			case TablePackage.CHANGE_TRACK_TABLE_CELL_TYPE__VALUE_TYPE:
				return isSetValueType();
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
		result.append(" (booleanValue: ");
		if (booleanValueESet) result.append(booleanValue); else result.append("<unset>");
		result.append(", cellAddress: ");
		result.append(cellAddress);
		result.append(", currency: ");
		result.append(currency);
		result.append(", dateValue: ");
		result.append(dateValue);
		result.append(", formula: ");
		result.append(formula);
		result.append(", matrixCovered: ");
		if (matrixCoveredESet) result.append(matrixCovered); else result.append("<unset>");
		result.append(", numberMatrixColumnsSpanned: ");
		result.append(numberMatrixColumnsSpanned);
		result.append(", numberMatrixRowsSpanned: ");
		result.append(numberMatrixRowsSpanned);
		result.append(", stringValue: ");
		result.append(stringValue);
		result.append(", timeValue: ");
		result.append(timeValue);
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", valueType: ");
		if (valueTypeESet) result.append(valueType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ChangeTrackTableCellTypeImpl
