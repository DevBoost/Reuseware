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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.BodyType;
import org.oasisopen.names.tc.opendocument.xmlns.table.EvenColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.EvenRowsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FirstColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.table.FirstRowType;
import org.oasisopen.names.tc.opendocument.xmlns.table.LastColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.table.LastRowType;
import org.oasisopen.names.tc.opendocument.xmlns.table.OddColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.OddRowsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.RowOrCol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getFirstRow <em>First Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getLastRow <em>Last Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getFirstColumn <em>First Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getLastColumn <em>Last Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getEvenRows <em>Even Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getOddRows <em>Odd Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getEvenColumns <em>Even Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getOddColumns <em>Odd Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getFirstRowEndColumn <em>First Row End Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getFirstRowStartColumn <em>First Row Start Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getLastRowEndColumn <em>Last Row End Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getLastRowStartColumn <em>Last Row Start Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTemplateTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableTemplateTypeImpl extends EObjectImpl implements TableTemplateType {
	/**
	 * The cached value of the '{@link #getFirstRow() <em>First Row</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRow()
	 * @generated
	 * @ordered
	 */
	protected FirstRowType firstRow;

	/**
	 * The cached value of the '{@link #getLastRow() <em>Last Row</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRow()
	 * @generated
	 * @ordered
	 */
	protected LastRowType lastRow;

	/**
	 * The cached value of the '{@link #getFirstColumn() <em>First Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstColumn()
	 * @generated
	 * @ordered
	 */
	protected FirstColumnType firstColumn;

	/**
	 * The cached value of the '{@link #getLastColumn() <em>Last Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastColumn()
	 * @generated
	 * @ordered
	 */
	protected LastColumnType lastColumn;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected BodyType body;

	/**
	 * The cached value of the '{@link #getEvenRows() <em>Even Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvenRows()
	 * @generated
	 * @ordered
	 */
	protected EvenRowsType evenRows;

	/**
	 * The cached value of the '{@link #getOddRows() <em>Odd Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOddRows()
	 * @generated
	 * @ordered
	 */
	protected OddRowsType oddRows;

	/**
	 * The cached value of the '{@link #getEvenColumns() <em>Even Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvenColumns()
	 * @generated
	 * @ordered
	 */
	protected EvenColumnsType evenColumns;

	/**
	 * The cached value of the '{@link #getOddColumns() <em>Odd Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOddColumns()
	 * @generated
	 * @ordered
	 */
	protected OddColumnsType oddColumns;

	/**
	 * The default value of the '{@link #getFirstRowEndColumn() <em>First Row End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRowEndColumn()
	 * @generated
	 * @ordered
	 */
	protected static final RowOrCol FIRST_ROW_END_COLUMN_EDEFAULT = RowOrCol.ROW;

	/**
	 * The cached value of the '{@link #getFirstRowEndColumn() <em>First Row End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRowEndColumn()
	 * @generated
	 * @ordered
	 */
	protected RowOrCol firstRowEndColumn = FIRST_ROW_END_COLUMN_EDEFAULT;

	/**
	 * This is true if the First Row End Column attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstRowEndColumnESet;

	/**
	 * The default value of the '{@link #getFirstRowStartColumn() <em>First Row Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRowStartColumn()
	 * @generated
	 * @ordered
	 */
	protected static final RowOrCol FIRST_ROW_START_COLUMN_EDEFAULT = RowOrCol.ROW;

	/**
	 * The cached value of the '{@link #getFirstRowStartColumn() <em>First Row Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRowStartColumn()
	 * @generated
	 * @ordered
	 */
	protected RowOrCol firstRowStartColumn = FIRST_ROW_START_COLUMN_EDEFAULT;

	/**
	 * This is true if the First Row Start Column attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstRowStartColumnESet;

	/**
	 * The default value of the '{@link #getLastRowEndColumn() <em>Last Row End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRowEndColumn()
	 * @generated
	 * @ordered
	 */
	protected static final RowOrCol LAST_ROW_END_COLUMN_EDEFAULT = RowOrCol.ROW;

	/**
	 * The cached value of the '{@link #getLastRowEndColumn() <em>Last Row End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRowEndColumn()
	 * @generated
	 * @ordered
	 */
	protected RowOrCol lastRowEndColumn = LAST_ROW_END_COLUMN_EDEFAULT;

	/**
	 * This is true if the Last Row End Column attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastRowEndColumnESet;

	/**
	 * The default value of the '{@link #getLastRowStartColumn() <em>Last Row Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRowStartColumn()
	 * @generated
	 * @ordered
	 */
	protected static final RowOrCol LAST_ROW_START_COLUMN_EDEFAULT = RowOrCol.ROW;

	/**
	 * The cached value of the '{@link #getLastRowStartColumn() <em>Last Row Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRowStartColumn()
	 * @generated
	 * @ordered
	 */
	protected RowOrCol lastRowStartColumn = LAST_ROW_START_COLUMN_EDEFAULT;

	/**
	 * This is true if the Last Row Start Column attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastRowStartColumnESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableTemplateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getTableTemplateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstRowType getFirstRow() {
		return firstRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstRow(FirstRowType newFirstRow, NotificationChain msgs) {
		FirstRowType oldFirstRow = firstRow;
		firstRow = newFirstRow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW, oldFirstRow, newFirstRow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstRow(FirstRowType newFirstRow) {
		if (newFirstRow != firstRow) {
			NotificationChain msgs = null;
			if (firstRow != null)
				msgs = ((InternalEObject)firstRow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW, null, msgs);
			if (newFirstRow != null)
				msgs = ((InternalEObject)newFirstRow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW, null, msgs);
			msgs = basicSetFirstRow(newFirstRow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW, newFirstRow, newFirstRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastRowType getLastRow() {
		return lastRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastRow(LastRowType newLastRow, NotificationChain msgs) {
		LastRowType oldLastRow = lastRow;
		lastRow = newLastRow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW, oldLastRow, newLastRow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRow(LastRowType newLastRow) {
		if (newLastRow != lastRow) {
			NotificationChain msgs = null;
			if (lastRow != null)
				msgs = ((InternalEObject)lastRow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW, null, msgs);
			if (newLastRow != null)
				msgs = ((InternalEObject)newLastRow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW, null, msgs);
			msgs = basicSetLastRow(newLastRow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW, newLastRow, newLastRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstColumnType getFirstColumn() {
		return firstColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstColumn(FirstColumnType newFirstColumn, NotificationChain msgs) {
		FirstColumnType oldFirstColumn = firstColumn;
		firstColumn = newFirstColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__FIRST_COLUMN, oldFirstColumn, newFirstColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstColumn(FirstColumnType newFirstColumn) {
		if (newFirstColumn != firstColumn) {
			NotificationChain msgs = null;
			if (firstColumn != null)
				msgs = ((InternalEObject)firstColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__FIRST_COLUMN, null, msgs);
			if (newFirstColumn != null)
				msgs = ((InternalEObject)newFirstColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__FIRST_COLUMN, null, msgs);
			msgs = basicSetFirstColumn(newFirstColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__FIRST_COLUMN, newFirstColumn, newFirstColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastColumnType getLastColumn() {
		return lastColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastColumn(LastColumnType newLastColumn, NotificationChain msgs) {
		LastColumnType oldLastColumn = lastColumn;
		lastColumn = newLastColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__LAST_COLUMN, oldLastColumn, newLastColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastColumn(LastColumnType newLastColumn) {
		if (newLastColumn != lastColumn) {
			NotificationChain msgs = null;
			if (lastColumn != null)
				msgs = ((InternalEObject)lastColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__LAST_COLUMN, null, msgs);
			if (newLastColumn != null)
				msgs = ((InternalEObject)newLastColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__LAST_COLUMN, null, msgs);
			msgs = basicSetLastColumn(newLastColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__LAST_COLUMN, newLastColumn, newLastColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyType getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(BodyType newBody, NotificationChain msgs) {
		BodyType oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(BodyType newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvenRowsType getEvenRows() {
		return evenRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvenRows(EvenRowsType newEvenRows, NotificationChain msgs) {
		EvenRowsType oldEvenRows = evenRows;
		evenRows = newEvenRows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__EVEN_ROWS, oldEvenRows, newEvenRows);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvenRows(EvenRowsType newEvenRows) {
		if (newEvenRows != evenRows) {
			NotificationChain msgs = null;
			if (evenRows != null)
				msgs = ((InternalEObject)evenRows).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__EVEN_ROWS, null, msgs);
			if (newEvenRows != null)
				msgs = ((InternalEObject)newEvenRows).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__EVEN_ROWS, null, msgs);
			msgs = basicSetEvenRows(newEvenRows, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__EVEN_ROWS, newEvenRows, newEvenRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OddRowsType getOddRows() {
		return oddRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOddRows(OddRowsType newOddRows, NotificationChain msgs) {
		OddRowsType oldOddRows = oddRows;
		oddRows = newOddRows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__ODD_ROWS, oldOddRows, newOddRows);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOddRows(OddRowsType newOddRows) {
		if (newOddRows != oddRows) {
			NotificationChain msgs = null;
			if (oddRows != null)
				msgs = ((InternalEObject)oddRows).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__ODD_ROWS, null, msgs);
			if (newOddRows != null)
				msgs = ((InternalEObject)newOddRows).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__ODD_ROWS, null, msgs);
			msgs = basicSetOddRows(newOddRows, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__ODD_ROWS, newOddRows, newOddRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvenColumnsType getEvenColumns() {
		return evenColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvenColumns(EvenColumnsType newEvenColumns, NotificationChain msgs) {
		EvenColumnsType oldEvenColumns = evenColumns;
		evenColumns = newEvenColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__EVEN_COLUMNS, oldEvenColumns, newEvenColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvenColumns(EvenColumnsType newEvenColumns) {
		if (newEvenColumns != evenColumns) {
			NotificationChain msgs = null;
			if (evenColumns != null)
				msgs = ((InternalEObject)evenColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__EVEN_COLUMNS, null, msgs);
			if (newEvenColumns != null)
				msgs = ((InternalEObject)newEvenColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__EVEN_COLUMNS, null, msgs);
			msgs = basicSetEvenColumns(newEvenColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__EVEN_COLUMNS, newEvenColumns, newEvenColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OddColumnsType getOddColumns() {
		return oddColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOddColumns(OddColumnsType newOddColumns, NotificationChain msgs) {
		OddColumnsType oldOddColumns = oddColumns;
		oddColumns = newOddColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__ODD_COLUMNS, oldOddColumns, newOddColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOddColumns(OddColumnsType newOddColumns) {
		if (newOddColumns != oddColumns) {
			NotificationChain msgs = null;
			if (oddColumns != null)
				msgs = ((InternalEObject)oddColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__ODD_COLUMNS, null, msgs);
			if (newOddColumns != null)
				msgs = ((InternalEObject)newOddColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TEMPLATE_TYPE__ODD_COLUMNS, null, msgs);
			msgs = basicSetOddColumns(newOddColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__ODD_COLUMNS, newOddColumns, newOddColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowOrCol getFirstRowEndColumn() {
		return firstRowEndColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstRowEndColumn(RowOrCol newFirstRowEndColumn) {
		RowOrCol oldFirstRowEndColumn = firstRowEndColumn;
		firstRowEndColumn = newFirstRowEndColumn == null ? FIRST_ROW_END_COLUMN_EDEFAULT : newFirstRowEndColumn;
		boolean oldFirstRowEndColumnESet = firstRowEndColumnESet;
		firstRowEndColumnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW_END_COLUMN, oldFirstRowEndColumn, firstRowEndColumn, !oldFirstRowEndColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstRowEndColumn() {
		RowOrCol oldFirstRowEndColumn = firstRowEndColumn;
		boolean oldFirstRowEndColumnESet = firstRowEndColumnESet;
		firstRowEndColumn = FIRST_ROW_END_COLUMN_EDEFAULT;
		firstRowEndColumnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW_END_COLUMN, oldFirstRowEndColumn, FIRST_ROW_END_COLUMN_EDEFAULT, oldFirstRowEndColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstRowEndColumn() {
		return firstRowEndColumnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowOrCol getFirstRowStartColumn() {
		return firstRowStartColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstRowStartColumn(RowOrCol newFirstRowStartColumn) {
		RowOrCol oldFirstRowStartColumn = firstRowStartColumn;
		firstRowStartColumn = newFirstRowStartColumn == null ? FIRST_ROW_START_COLUMN_EDEFAULT : newFirstRowStartColumn;
		boolean oldFirstRowStartColumnESet = firstRowStartColumnESet;
		firstRowStartColumnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW_START_COLUMN, oldFirstRowStartColumn, firstRowStartColumn, !oldFirstRowStartColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstRowStartColumn() {
		RowOrCol oldFirstRowStartColumn = firstRowStartColumn;
		boolean oldFirstRowStartColumnESet = firstRowStartColumnESet;
		firstRowStartColumn = FIRST_ROW_START_COLUMN_EDEFAULT;
		firstRowStartColumnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW_START_COLUMN, oldFirstRowStartColumn, FIRST_ROW_START_COLUMN_EDEFAULT, oldFirstRowStartColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstRowStartColumn() {
		return firstRowStartColumnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowOrCol getLastRowEndColumn() {
		return lastRowEndColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRowEndColumn(RowOrCol newLastRowEndColumn) {
		RowOrCol oldLastRowEndColumn = lastRowEndColumn;
		lastRowEndColumn = newLastRowEndColumn == null ? LAST_ROW_END_COLUMN_EDEFAULT : newLastRowEndColumn;
		boolean oldLastRowEndColumnESet = lastRowEndColumnESet;
		lastRowEndColumnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW_END_COLUMN, oldLastRowEndColumn, lastRowEndColumn, !oldLastRowEndColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastRowEndColumn() {
		RowOrCol oldLastRowEndColumn = lastRowEndColumn;
		boolean oldLastRowEndColumnESet = lastRowEndColumnESet;
		lastRowEndColumn = LAST_ROW_END_COLUMN_EDEFAULT;
		lastRowEndColumnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW_END_COLUMN, oldLastRowEndColumn, LAST_ROW_END_COLUMN_EDEFAULT, oldLastRowEndColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastRowEndColumn() {
		return lastRowEndColumnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowOrCol getLastRowStartColumn() {
		return lastRowStartColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRowStartColumn(RowOrCol newLastRowStartColumn) {
		RowOrCol oldLastRowStartColumn = lastRowStartColumn;
		lastRowStartColumn = newLastRowStartColumn == null ? LAST_ROW_START_COLUMN_EDEFAULT : newLastRowStartColumn;
		boolean oldLastRowStartColumnESet = lastRowStartColumnESet;
		lastRowStartColumnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW_START_COLUMN, oldLastRowStartColumn, lastRowStartColumn, !oldLastRowStartColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastRowStartColumn() {
		RowOrCol oldLastRowStartColumn = lastRowStartColumn;
		boolean oldLastRowStartColumnESet = lastRowStartColumnESet;
		lastRowStartColumn = LAST_ROW_START_COLUMN_EDEFAULT;
		lastRowStartColumnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW_START_COLUMN, oldLastRowStartColumn, LAST_ROW_START_COLUMN_EDEFAULT, oldLastRowStartColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastRowStartColumn() {
		return lastRowStartColumnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TEMPLATE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW:
				return basicSetFirstRow(null, msgs);
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW:
				return basicSetLastRow(null, msgs);
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_COLUMN:
				return basicSetFirstColumn(null, msgs);
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_COLUMN:
				return basicSetLastColumn(null, msgs);
			case TablePackage.TABLE_TEMPLATE_TYPE__BODY:
				return basicSetBody(null, msgs);
			case TablePackage.TABLE_TEMPLATE_TYPE__EVEN_ROWS:
				return basicSetEvenRows(null, msgs);
			case TablePackage.TABLE_TEMPLATE_TYPE__ODD_ROWS:
				return basicSetOddRows(null, msgs);
			case TablePackage.TABLE_TEMPLATE_TYPE__EVEN_COLUMNS:
				return basicSetEvenColumns(null, msgs);
			case TablePackage.TABLE_TEMPLATE_TYPE__ODD_COLUMNS:
				return basicSetOddColumns(null, msgs);
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
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW:
				return getFirstRow();
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW:
				return getLastRow();
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_COLUMN:
				return getFirstColumn();
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_COLUMN:
				return getLastColumn();
			case TablePackage.TABLE_TEMPLATE_TYPE__BODY:
				return getBody();
			case TablePackage.TABLE_TEMPLATE_TYPE__EVEN_ROWS:
				return getEvenRows();
			case TablePackage.TABLE_TEMPLATE_TYPE__ODD_ROWS:
				return getOddRows();
			case TablePackage.TABLE_TEMPLATE_TYPE__EVEN_COLUMNS:
				return getEvenColumns();
			case TablePackage.TABLE_TEMPLATE_TYPE__ODD_COLUMNS:
				return getOddColumns();
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW_END_COLUMN:
				return getFirstRowEndColumn();
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW_START_COLUMN:
				return getFirstRowStartColumn();
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW_END_COLUMN:
				return getLastRowEndColumn();
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW_START_COLUMN:
				return getLastRowStartColumn();
			case TablePackage.TABLE_TEMPLATE_TYPE__NAME:
				return getName();
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
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW:
				setFirstRow((FirstRowType)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW:
				setLastRow((LastRowType)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_COLUMN:
				setFirstColumn((FirstColumnType)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_COLUMN:
				setLastColumn((LastColumnType)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__BODY:
				setBody((BodyType)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__EVEN_ROWS:
				setEvenRows((EvenRowsType)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__ODD_ROWS:
				setOddRows((OddRowsType)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__EVEN_COLUMNS:
				setEvenColumns((EvenColumnsType)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__ODD_COLUMNS:
				setOddColumns((OddColumnsType)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW_END_COLUMN:
				setFirstRowEndColumn((RowOrCol)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW_START_COLUMN:
				setFirstRowStartColumn((RowOrCol)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW_END_COLUMN:
				setLastRowEndColumn((RowOrCol)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW_START_COLUMN:
				setLastRowStartColumn((RowOrCol)newValue);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__NAME:
				setName((String)newValue);
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
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW:
				setFirstRow((FirstRowType)null);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW:
				setLastRow((LastRowType)null);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_COLUMN:
				setFirstColumn((FirstColumnType)null);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_COLUMN:
				setLastColumn((LastColumnType)null);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__BODY:
				setBody((BodyType)null);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__EVEN_ROWS:
				setEvenRows((EvenRowsType)null);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__ODD_ROWS:
				setOddRows((OddRowsType)null);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__EVEN_COLUMNS:
				setEvenColumns((EvenColumnsType)null);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__ODD_COLUMNS:
				setOddColumns((OddColumnsType)null);
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW_END_COLUMN:
				unsetFirstRowEndColumn();
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW_START_COLUMN:
				unsetFirstRowStartColumn();
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW_END_COLUMN:
				unsetLastRowEndColumn();
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW_START_COLUMN:
				unsetLastRowStartColumn();
				return;
			case TablePackage.TABLE_TEMPLATE_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW:
				return firstRow != null;
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW:
				return lastRow != null;
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_COLUMN:
				return firstColumn != null;
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_COLUMN:
				return lastColumn != null;
			case TablePackage.TABLE_TEMPLATE_TYPE__BODY:
				return body != null;
			case TablePackage.TABLE_TEMPLATE_TYPE__EVEN_ROWS:
				return evenRows != null;
			case TablePackage.TABLE_TEMPLATE_TYPE__ODD_ROWS:
				return oddRows != null;
			case TablePackage.TABLE_TEMPLATE_TYPE__EVEN_COLUMNS:
				return evenColumns != null;
			case TablePackage.TABLE_TEMPLATE_TYPE__ODD_COLUMNS:
				return oddColumns != null;
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW_END_COLUMN:
				return isSetFirstRowEndColumn();
			case TablePackage.TABLE_TEMPLATE_TYPE__FIRST_ROW_START_COLUMN:
				return isSetFirstRowStartColumn();
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW_END_COLUMN:
				return isSetLastRowEndColumn();
			case TablePackage.TABLE_TEMPLATE_TYPE__LAST_ROW_START_COLUMN:
				return isSetLastRowStartColumn();
			case TablePackage.TABLE_TEMPLATE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (firstRowEndColumn: ");
		if (firstRowEndColumnESet) result.append(firstRowEndColumn); else result.append("<unset>");
		result.append(", firstRowStartColumn: ");
		if (firstRowStartColumnESet) result.append(firstRowStartColumn); else result.append("<unset>");
		result.append(", lastRowEndColumn: ");
		if (lastRowEndColumnESet) result.append(lastRowEndColumn); else result.append("<unset>");
		result.append(", lastRowStartColumn: ");
		if (lastRowStartColumnESet) result.append(lastRowStartColumn); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TableTemplateTypeImpl
