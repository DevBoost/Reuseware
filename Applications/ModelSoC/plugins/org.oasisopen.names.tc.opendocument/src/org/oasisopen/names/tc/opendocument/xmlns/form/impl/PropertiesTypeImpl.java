/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.PropertiesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertiesTypeImpl#getFormPropertyGroup <em>Form Property Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.PropertiesTypeImpl#getFormProperty <em>Form Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertiesTypeImpl extends EObjectImpl implements PropertiesType {
	/**
	 * The cached value of the '{@link #getFormPropertyGroup() <em>Form Property Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormPropertyGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap formPropertyGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.eINSTANCE.getPropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFormPropertyGroup() {
		if (formPropertyGroup == null) {
			formPropertyGroup = new BasicFeatureMap(this, FormPackage.PROPERTIES_TYPE__FORM_PROPERTY_GROUP);
		}
		return formPropertyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFormProperty() {
		return getFormPropertyGroup().list(FormPackage.eINSTANCE.getPropertiesType_FormProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.PROPERTIES_TYPE__FORM_PROPERTY_GROUP:
				return ((InternalEList<?>)getFormPropertyGroup()).basicRemove(otherEnd, msgs);
			case FormPackage.PROPERTIES_TYPE__FORM_PROPERTY:
				return ((InternalEList<?>)getFormProperty()).basicRemove(otherEnd, msgs);
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
			case FormPackage.PROPERTIES_TYPE__FORM_PROPERTY_GROUP:
				if (coreType) return getFormPropertyGroup();
				return ((FeatureMap.Internal)getFormPropertyGroup()).getWrapper();
			case FormPackage.PROPERTIES_TYPE__FORM_PROPERTY:
				return getFormProperty();
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
			case FormPackage.PROPERTIES_TYPE__FORM_PROPERTY_GROUP:
				((FeatureMap.Internal)getFormPropertyGroup()).set(newValue);
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
			case FormPackage.PROPERTIES_TYPE__FORM_PROPERTY_GROUP:
				getFormPropertyGroup().clear();
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
			case FormPackage.PROPERTIES_TYPE__FORM_PROPERTY_GROUP:
				return formPropertyGroup != null && !formPropertyGroup.isEmpty();
			case FormPackage.PROPERTIES_TYPE__FORM_PROPERTY:
				return !getFormProperty().isEmpty();
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
		result.append(" (formPropertyGroup: ");
		result.append(formPropertyGroup);
		result.append(')');
		return result.toString();
	}

} //PropertiesTypeImpl
