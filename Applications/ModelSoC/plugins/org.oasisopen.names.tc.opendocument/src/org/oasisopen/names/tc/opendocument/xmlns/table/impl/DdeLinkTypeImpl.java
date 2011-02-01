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
import org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dde Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DdeLinkTypeImpl#getDdeSource <em>Dde Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DdeLinkTypeImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DdeLinkTypeImpl extends EObjectImpl implements DdeLinkType {
	/**
	 * The cached value of the '{@link #getDdeSource() <em>Dde Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeSource()
	 * @generated
	 * @ordered
	 */
	protected TextSectionSourceDdeType ddeSource;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected TableType table;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdeLinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDdeLinkType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextSectionSourceDdeType getDdeSource() {
		return ddeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeSource(TextSectionSourceDdeType newDdeSource, NotificationChain msgs) {
		TextSectionSourceDdeType oldDdeSource = ddeSource;
		ddeSource = newDdeSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DDE_LINK_TYPE__DDE_SOURCE, oldDdeSource, newDdeSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeSource(TextSectionSourceDdeType newDdeSource) {
		if (newDdeSource != ddeSource) {
			NotificationChain msgs = null;
			if (ddeSource != null)
				msgs = ((InternalEObject)ddeSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DDE_LINK_TYPE__DDE_SOURCE, null, msgs);
			if (newDdeSource != null)
				msgs = ((InternalEObject)newDdeSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DDE_LINK_TYPE__DDE_SOURCE, null, msgs);
			msgs = basicSetDdeSource(newDdeSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DDE_LINK_TYPE__DDE_SOURCE, newDdeSource, newDdeSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(TableType newTable, NotificationChain msgs) {
		TableType oldTable = table;
		table = newTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DDE_LINK_TYPE__TABLE, oldTable, newTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(TableType newTable) {
		if (newTable != table) {
			NotificationChain msgs = null;
			if (table != null)
				msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DDE_LINK_TYPE__TABLE, null, msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DDE_LINK_TYPE__TABLE, null, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DDE_LINK_TYPE__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.DDE_LINK_TYPE__DDE_SOURCE:
				return basicSetDdeSource(null, msgs);
			case TablePackage.DDE_LINK_TYPE__TABLE:
				return basicSetTable(null, msgs);
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
			case TablePackage.DDE_LINK_TYPE__DDE_SOURCE:
				return getDdeSource();
			case TablePackage.DDE_LINK_TYPE__TABLE:
				return getTable();
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
			case TablePackage.DDE_LINK_TYPE__DDE_SOURCE:
				setDdeSource((TextSectionSourceDdeType)newValue);
				return;
			case TablePackage.DDE_LINK_TYPE__TABLE:
				setTable((TableType)newValue);
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
			case TablePackage.DDE_LINK_TYPE__DDE_SOURCE:
				setDdeSource((TextSectionSourceDdeType)null);
				return;
			case TablePackage.DDE_LINK_TYPE__TABLE:
				setTable((TableType)null);
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
			case TablePackage.DDE_LINK_TYPE__DDE_SOURCE:
				return ddeSource != null;
			case TablePackage.DDE_LINK_TYPE__TABLE:
				return table != null;
		}
		return super.eIsSet(featureID);
	}

} //DdeLinkTypeImpl
