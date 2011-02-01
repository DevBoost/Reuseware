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
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclType;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Field Decls Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserFieldDeclsTypeImpl#getUserFieldDecl <em>User Field Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserFieldDeclsTypeImpl extends EObjectImpl implements UserFieldDeclsType {
	/**
	 * The cached value of the '{@link #getUserFieldDecl() <em>User Field Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFieldDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<UserFieldDeclType> userFieldDecl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserFieldDeclsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getUserFieldDeclsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserFieldDeclType> getUserFieldDecl() {
		if (userFieldDecl == null) {
			userFieldDecl = new EObjectContainmentEList<UserFieldDeclType>(UserFieldDeclType.class, this, TextPackage.USER_FIELD_DECLS_TYPE__USER_FIELD_DECL);
		}
		return userFieldDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.USER_FIELD_DECLS_TYPE__USER_FIELD_DECL:
				return ((InternalEList<?>)getUserFieldDecl()).basicRemove(otherEnd, msgs);
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
			case TextPackage.USER_FIELD_DECLS_TYPE__USER_FIELD_DECL:
				return getUserFieldDecl();
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
			case TextPackage.USER_FIELD_DECLS_TYPE__USER_FIELD_DECL:
				getUserFieldDecl().clear();
				getUserFieldDecl().addAll((Collection<? extends UserFieldDeclType>)newValue);
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
			case TextPackage.USER_FIELD_DECLS_TYPE__USER_FIELD_DECL:
				getUserFieldDecl().clear();
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
			case TextPackage.USER_FIELD_DECLS_TYPE__USER_FIELD_DECL:
				return userFieldDecl != null && !userFieldDecl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserFieldDeclsTypeImpl
