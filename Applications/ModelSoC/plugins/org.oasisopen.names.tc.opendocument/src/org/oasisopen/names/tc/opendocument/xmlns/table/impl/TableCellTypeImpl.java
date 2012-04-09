/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.math.BigInteger;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableCellType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableTableCellContentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getContentValidationName <em>Content Validation Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getNumberColumnsRepeated <em>Number Columns Repeated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getNumberColumnsSpanned <em>Number Columns Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getNumberMatrixColumnsSpanned <em>Number Matrix Columns Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getNumberMatrixRowsSpanned <em>Number Matrix Rows Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getNumberRowsSpanned <em>Number Rows Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getProtect <em>Protect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableCellTypeImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableCellTypeImpl extends TableTableCellContentImpl implements TableCellType {
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
	 * The default value of the '{@link #getContentValidationName() <em>Content Validation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentValidationName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_VALIDATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentValidationName() <em>Content Validation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentValidationName()
	 * @generated
	 * @ordered
	 */
	protected String contentValidationName = CONTENT_VALIDATION_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getNumberColumnsSpanned() <em>Number Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberColumnsSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_COLUMNS_SPANNED_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getNumberColumnsSpanned() <em>Number Columns Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberColumnsSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberColumnsSpanned = NUMBER_COLUMNS_SPANNED_EDEFAULT;

	/**
	 * This is true if the Number Columns Spanned attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberColumnsSpannedESet;

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
	 * The default value of the '{@link #getNumberRowsSpanned() <em>Number Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRowsSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_ROWS_SPANNED_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getNumberRowsSpanned() <em>Number Rows Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRowsSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numberRowsSpanned = NUMBER_ROWS_SPANNED_EDEFAULT;

	/**
	 * This is true if the Number Rows Spanned attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberRowsSpannedESet;

	/**
	 * The default value of the '{@link #getProtect() <em>Protect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtect()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PROTECT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getProtect() <em>Protect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtect()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean protect = PROTECT_EDEFAULT;

	/**
	 * This is true if the Protect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protectESet;

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
	protected TableCellTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getTableCellType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__BOOLEAN_VALUE, oldBooleanValue, booleanValue, !oldBooleanValueESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_CELL_TYPE__BOOLEAN_VALUE, oldBooleanValue, BOOLEAN_VALUE_EDEFAULT, oldBooleanValueESet));
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
	public String getContentValidationName() {
		return contentValidationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentValidationName(String newContentValidationName) {
		String oldContentValidationName = contentValidationName;
		contentValidationName = newContentValidationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__CONTENT_VALIDATION_NAME, oldContentValidationName, contentValidationName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__CURRENCY, oldCurrency, currency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__DATE_VALUE, oldDateValue, dateValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__FORMULA, oldFormula, formula));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__NUMBER_COLUMNS_REPEATED, oldNumberColumnsRepeated, numberColumnsRepeated, !oldNumberColumnsRepeatedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_CELL_TYPE__NUMBER_COLUMNS_REPEATED, oldNumberColumnsRepeated, NUMBER_COLUMNS_REPEATED_EDEFAULT, oldNumberColumnsRepeatedESet));
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
	public BigInteger getNumberColumnsSpanned() {
		return numberColumnsSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberColumnsSpanned(BigInteger newNumberColumnsSpanned) {
		BigInteger oldNumberColumnsSpanned = numberColumnsSpanned;
		numberColumnsSpanned = newNumberColumnsSpanned;
		boolean oldNumberColumnsSpannedESet = numberColumnsSpannedESet;
		numberColumnsSpannedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__NUMBER_COLUMNS_SPANNED, oldNumberColumnsSpanned, numberColumnsSpanned, !oldNumberColumnsSpannedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberColumnsSpanned() {
		BigInteger oldNumberColumnsSpanned = numberColumnsSpanned;
		boolean oldNumberColumnsSpannedESet = numberColumnsSpannedESet;
		numberColumnsSpanned = NUMBER_COLUMNS_SPANNED_EDEFAULT;
		numberColumnsSpannedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_CELL_TYPE__NUMBER_COLUMNS_SPANNED, oldNumberColumnsSpanned, NUMBER_COLUMNS_SPANNED_EDEFAULT, oldNumberColumnsSpannedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberColumnsSpanned() {
		return numberColumnsSpannedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__NUMBER_MATRIX_COLUMNS_SPANNED, oldNumberMatrixColumnsSpanned, numberMatrixColumnsSpanned));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__NUMBER_MATRIX_ROWS_SPANNED, oldNumberMatrixRowsSpanned, numberMatrixRowsSpanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumberRowsSpanned() {
		return numberRowsSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberRowsSpanned(BigInteger newNumberRowsSpanned) {
		BigInteger oldNumberRowsSpanned = numberRowsSpanned;
		numberRowsSpanned = newNumberRowsSpanned;
		boolean oldNumberRowsSpannedESet = numberRowsSpannedESet;
		numberRowsSpannedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__NUMBER_ROWS_SPANNED, oldNumberRowsSpanned, numberRowsSpanned, !oldNumberRowsSpannedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberRowsSpanned() {
		BigInteger oldNumberRowsSpanned = numberRowsSpanned;
		boolean oldNumberRowsSpannedESet = numberRowsSpannedESet;
		numberRowsSpanned = NUMBER_ROWS_SPANNED_EDEFAULT;
		numberRowsSpannedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_CELL_TYPE__NUMBER_ROWS_SPANNED, oldNumberRowsSpanned, NUMBER_ROWS_SPANNED_EDEFAULT, oldNumberRowsSpannedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberRowsSpanned() {
		return numberRowsSpannedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtect() {
		return protect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtect(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newProtect) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtect = protect;
		protect = newProtect == null ? PROTECT_EDEFAULT : newProtect;
		boolean oldProtectESet = protectESet;
		protectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__PROTECT, oldProtect, protect, !oldProtectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtect() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtect = protect;
		boolean oldProtectESet = protectESet;
		protect = PROTECT_EDEFAULT;
		protectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_CELL_TYPE__PROTECT, oldProtect, PROTECT_EDEFAULT, oldProtectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtect() {
		return protectESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__STRING_VALUE, oldStringValue, stringValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__STYLE_NAME, oldStyleName, styleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__TIME_VALUE, oldTimeValue, timeValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__VALUE, oldValue, value, !oldValueESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_CELL_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_CELL_TYPE__VALUE_TYPE, oldValueType, valueType, !oldValueTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_CELL_TYPE__VALUE_TYPE, oldValueType, VALUE_TYPE_EDEFAULT, oldValueTypeESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.TABLE_CELL_TYPE__BOOLEAN_VALUE:
				return getBooleanValue();
			case TablePackage.TABLE_CELL_TYPE__CONTENT_VALIDATION_NAME:
				return getContentValidationName();
			case TablePackage.TABLE_CELL_TYPE__CURRENCY:
				return getCurrency();
			case TablePackage.TABLE_CELL_TYPE__DATE_VALUE:
				return getDateValue();
			case TablePackage.TABLE_CELL_TYPE__FORMULA:
				return getFormula();
			case TablePackage.TABLE_CELL_TYPE__NUMBER_COLUMNS_REPEATED:
				return getNumberColumnsRepeated();
			case TablePackage.TABLE_CELL_TYPE__NUMBER_COLUMNS_SPANNED:
				return getNumberColumnsSpanned();
			case TablePackage.TABLE_CELL_TYPE__NUMBER_MATRIX_COLUMNS_SPANNED:
				return getNumberMatrixColumnsSpanned();
			case TablePackage.TABLE_CELL_TYPE__NUMBER_MATRIX_ROWS_SPANNED:
				return getNumberMatrixRowsSpanned();
			case TablePackage.TABLE_CELL_TYPE__NUMBER_ROWS_SPANNED:
				return getNumberRowsSpanned();
			case TablePackage.TABLE_CELL_TYPE__PROTECT:
				return getProtect();
			case TablePackage.TABLE_CELL_TYPE__STRING_VALUE:
				return getStringValue();
			case TablePackage.TABLE_CELL_TYPE__STYLE_NAME:
				return getStyleName();
			case TablePackage.TABLE_CELL_TYPE__TIME_VALUE:
				return getTimeValue();
			case TablePackage.TABLE_CELL_TYPE__VALUE:
				return new Double(getValue());
			case TablePackage.TABLE_CELL_TYPE__VALUE_TYPE:
				return getValueType();
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
			case TablePackage.TABLE_CELL_TYPE__BOOLEAN_VALUE:
				setBooleanValue((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__CONTENT_VALIDATION_NAME:
				setContentValidationName((String)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__CURRENCY:
				setCurrency((String)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__DATE_VALUE:
				setDateValue((XMLGregorianCalendar)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__FORMULA:
				setFormula((String)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__NUMBER_COLUMNS_REPEATED:
				setNumberColumnsRepeated((BigInteger)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__NUMBER_COLUMNS_SPANNED:
				setNumberColumnsSpanned((BigInteger)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__NUMBER_MATRIX_COLUMNS_SPANNED:
				setNumberMatrixColumnsSpanned((BigInteger)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__NUMBER_MATRIX_ROWS_SPANNED:
				setNumberMatrixRowsSpanned((BigInteger)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__NUMBER_ROWS_SPANNED:
				setNumberRowsSpanned((BigInteger)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__PROTECT:
				setProtect((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__TIME_VALUE:
				setTimeValue((Duration)newValue);
				return;
			case TablePackage.TABLE_CELL_TYPE__VALUE:
				setValue(((Double)newValue).doubleValue());
				return;
			case TablePackage.TABLE_CELL_TYPE__VALUE_TYPE:
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
			case TablePackage.TABLE_CELL_TYPE__BOOLEAN_VALUE:
				unsetBooleanValue();
				return;
			case TablePackage.TABLE_CELL_TYPE__CONTENT_VALIDATION_NAME:
				setContentValidationName(CONTENT_VALIDATION_NAME_EDEFAULT);
				return;
			case TablePackage.TABLE_CELL_TYPE__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case TablePackage.TABLE_CELL_TYPE__DATE_VALUE:
				setDateValue(DATE_VALUE_EDEFAULT);
				return;
			case TablePackage.TABLE_CELL_TYPE__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case TablePackage.TABLE_CELL_TYPE__NUMBER_COLUMNS_REPEATED:
				unsetNumberColumnsRepeated();
				return;
			case TablePackage.TABLE_CELL_TYPE__NUMBER_COLUMNS_SPANNED:
				unsetNumberColumnsSpanned();
				return;
			case TablePackage.TABLE_CELL_TYPE__NUMBER_MATRIX_COLUMNS_SPANNED:
				setNumberMatrixColumnsSpanned(NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT);
				return;
			case TablePackage.TABLE_CELL_TYPE__NUMBER_MATRIX_ROWS_SPANNED:
				setNumberMatrixRowsSpanned(NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT);
				return;
			case TablePackage.TABLE_CELL_TYPE__NUMBER_ROWS_SPANNED:
				unsetNumberRowsSpanned();
				return;
			case TablePackage.TABLE_CELL_TYPE__PROTECT:
				unsetProtect();
				return;
			case TablePackage.TABLE_CELL_TYPE__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
				return;
			case TablePackage.TABLE_CELL_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case TablePackage.TABLE_CELL_TYPE__TIME_VALUE:
				setTimeValue(TIME_VALUE_EDEFAULT);
				return;
			case TablePackage.TABLE_CELL_TYPE__VALUE:
				unsetValue();
				return;
			case TablePackage.TABLE_CELL_TYPE__VALUE_TYPE:
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
			case TablePackage.TABLE_CELL_TYPE__BOOLEAN_VALUE:
				return isSetBooleanValue();
			case TablePackage.TABLE_CELL_TYPE__CONTENT_VALIDATION_NAME:
				return CONTENT_VALIDATION_NAME_EDEFAULT == null ? contentValidationName != null : !CONTENT_VALIDATION_NAME_EDEFAULT.equals(contentValidationName);
			case TablePackage.TABLE_CELL_TYPE__CURRENCY:
				return CURRENCY_EDEFAULT == null ? currency != null : !CURRENCY_EDEFAULT.equals(currency);
			case TablePackage.TABLE_CELL_TYPE__DATE_VALUE:
				return DATE_VALUE_EDEFAULT == null ? dateValue != null : !DATE_VALUE_EDEFAULT.equals(dateValue);
			case TablePackage.TABLE_CELL_TYPE__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
			case TablePackage.TABLE_CELL_TYPE__NUMBER_COLUMNS_REPEATED:
				return isSetNumberColumnsRepeated();
			case TablePackage.TABLE_CELL_TYPE__NUMBER_COLUMNS_SPANNED:
				return isSetNumberColumnsSpanned();
			case TablePackage.TABLE_CELL_TYPE__NUMBER_MATRIX_COLUMNS_SPANNED:
				return NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT == null ? numberMatrixColumnsSpanned != null : !NUMBER_MATRIX_COLUMNS_SPANNED_EDEFAULT.equals(numberMatrixColumnsSpanned);
			case TablePackage.TABLE_CELL_TYPE__NUMBER_MATRIX_ROWS_SPANNED:
				return NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT == null ? numberMatrixRowsSpanned != null : !NUMBER_MATRIX_ROWS_SPANNED_EDEFAULT.equals(numberMatrixRowsSpanned);
			case TablePackage.TABLE_CELL_TYPE__NUMBER_ROWS_SPANNED:
				return isSetNumberRowsSpanned();
			case TablePackage.TABLE_CELL_TYPE__PROTECT:
				return isSetProtect();
			case TablePackage.TABLE_CELL_TYPE__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
			case TablePackage.TABLE_CELL_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case TablePackage.TABLE_CELL_TYPE__TIME_VALUE:
				return TIME_VALUE_EDEFAULT == null ? timeValue != null : !TIME_VALUE_EDEFAULT.equals(timeValue);
			case TablePackage.TABLE_CELL_TYPE__VALUE:
				return isSetValue();
			case TablePackage.TABLE_CELL_TYPE__VALUE_TYPE:
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
		result.append(", contentValidationName: ");
		result.append(contentValidationName);
		result.append(", currency: ");
		result.append(currency);
		result.append(", dateValue: ");
		result.append(dateValue);
		result.append(", formula: ");
		result.append(formula);
		result.append(", numberColumnsRepeated: ");
		if (numberColumnsRepeatedESet) result.append(numberColumnsRepeated); else result.append("<unset>");
		result.append(", numberColumnsSpanned: ");
		if (numberColumnsSpannedESet) result.append(numberColumnsSpanned); else result.append("<unset>");
		result.append(", numberMatrixColumnsSpanned: ");
		result.append(numberMatrixColumnsSpanned);
		result.append(", numberMatrixRowsSpanned: ");
		result.append(numberMatrixRowsSpanned);
		result.append(", numberRowsSpanned: ");
		if (numberRowsSpannedESet) result.append(numberRowsSpanned); else result.append("<unset>");
		result.append(", protect: ");
		if (protectESet) result.append(protect); else result.append("<unset>");
		result.append(", stringValue: ");
		result.append(stringValue);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", timeValue: ");
		result.append(timeValue);
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", valueType: ");
		if (valueTypeESet) result.append(valueType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TableCellTypeImpl
