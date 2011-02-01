/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclType;
import org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dde Connection Decls Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DdeConnectionDeclsTypeImpl#getDdeConnectionDecl <em>Dde Connection Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DdeConnectionDeclsTypeImpl extends EObjectImpl implements DdeConnectionDeclsType {
	/**
	 * The cached value of the '{@link #getDdeConnectionDecl() <em>Dde Connection Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeConnectionDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<DdeConnectionDeclType> ddeConnectionDecl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdeConnectionDeclsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getDdeConnectionDeclsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdeConnectionDeclType> getDdeConnectionDecl() {
		if (ddeConnectionDecl == null) {
			ddeConnectionDecl = new EObjectContainmentEList<DdeConnectionDeclType>(DdeConnectionDeclType.class, this, TextPackage.DDE_CONNECTION_DECLS_TYPE__DDE_CONNECTION_DECL);
		}
		return ddeConnectionDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.DDE_CONNECTION_DECLS_TYPE__DDE_CONNECTION_DECL:
				return ((InternalEList<?>)getDdeConnectionDecl()).basicRemove(otherEnd, msgs);
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
			case TextPackage.DDE_CONNECTION_DECLS_TYPE__DDE_CONNECTION_DECL:
				return getDdeConnectionDecl();
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
			case TextPackage.DDE_CONNECTION_DECLS_TYPE__DDE_CONNECTION_DECL:
				getDdeConnectionDecl().clear();
				getDdeConnectionDecl().addAll((Collection<? extends DdeConnectionDeclType>)newValue);
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
			case TextPackage.DDE_CONNECTION_DECLS_TYPE__DDE_CONNECTION_DECL:
				getDdeConnectionDecl().clear();
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
			case TextPackage.DDE_CONNECTION_DECLS_TYPE__DDE_CONNECTION_DECL:
				return ddeConnectionDecl != null && !ddeConnectionDecl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DdeConnectionDeclsTypeImpl
