/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Validations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ContentValidationsTypeImpl#getContentValidation <em>Content Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentValidationsTypeImpl extends EObjectImpl implements ContentValidationsType {
	/**
	 * The cached value of the '{@link #getContentValidation() <em>Content Validation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentValidation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentValidationType> contentValidation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentValidationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getContentValidationsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentValidationType> getContentValidation() {
		if (contentValidation == null) {
			contentValidation = new EObjectContainmentEList<ContentValidationType>(ContentValidationType.class, this, TablePackage.CONTENT_VALIDATIONS_TYPE__CONTENT_VALIDATION);
		}
		return contentValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.CONTENT_VALIDATIONS_TYPE__CONTENT_VALIDATION:
				return ((InternalEList<?>)getContentValidation()).basicRemove(otherEnd, msgs);
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
			case TablePackage.CONTENT_VALIDATIONS_TYPE__CONTENT_VALIDATION:
				return getContentValidation();
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
			case TablePackage.CONTENT_VALIDATIONS_TYPE__CONTENT_VALIDATION:
				getContentValidation().clear();
				getContentValidation().addAll((Collection<? extends ContentValidationType>)newValue);
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
			case TablePackage.CONTENT_VALIDATIONS_TYPE__CONTENT_VALIDATION:
				getContentValidation().clear();
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
			case TablePackage.CONTENT_VALIDATIONS_TYPE__CONTENT_VALIDATION:
				return contentValidation != null && !contentValidation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContentValidationsTypeImpl
