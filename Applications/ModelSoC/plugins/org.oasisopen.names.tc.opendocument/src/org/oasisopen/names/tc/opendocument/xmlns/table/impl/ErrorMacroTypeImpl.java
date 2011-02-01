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
import org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMacroType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Macro Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ErrorMacroTypeImpl#getExecute <em>Execute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorMacroTypeImpl extends EObjectImpl implements ErrorMacroType {
	/**
	 * The default value of the '{@link #getExecute() <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean EXECUTE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExecute() <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean execute = EXECUTE_EDEFAULT;

	/**
	 * This is true if the Execute attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean executeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorMacroTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getErrorMacroType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExecute() {
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecute(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newExecute) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExecute = execute;
		execute = newExecute == null ? EXECUTE_EDEFAULT : newExecute;
		boolean oldExecuteESet = executeESet;
		executeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.ERROR_MACRO_TYPE__EXECUTE, oldExecute, execute, !oldExecuteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExecute() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldExecute = execute;
		boolean oldExecuteESet = executeESet;
		execute = EXECUTE_EDEFAULT;
		executeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.ERROR_MACRO_TYPE__EXECUTE, oldExecute, EXECUTE_EDEFAULT, oldExecuteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExecute() {
		return executeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.ERROR_MACRO_TYPE__EXECUTE:
				return getExecute();
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
			case TablePackage.ERROR_MACRO_TYPE__EXECUTE:
				setExecute((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TablePackage.ERROR_MACRO_TYPE__EXECUTE:
				unsetExecute();
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
			case TablePackage.ERROR_MACRO_TYPE__EXECUTE:
				return isSetExecute();
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
		result.append(" (execute: ");
		if (executeESet) result.append(execute); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ErrorMacroTypeImpl
