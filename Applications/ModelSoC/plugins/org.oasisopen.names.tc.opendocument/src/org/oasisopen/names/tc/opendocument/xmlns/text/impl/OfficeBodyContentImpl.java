/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeBodyContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Office Body Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.OfficeBodyContentImpl#getOfficeBodyContentGroup <em>Office Body Content Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.OfficeBodyContentImpl#getOfficeBodyContent <em>Office Body Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OfficeBodyContentImpl extends EObjectImpl implements OfficeBodyContent {
	/**
	 * The cached value of the '{@link #getOfficeBodyContentGroup() <em>Office Body Content Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfficeBodyContentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap officeBodyContentGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfficeBodyContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getOfficeBodyContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOfficeBodyContentGroup() {
		if (officeBodyContentGroup == null) {
			officeBodyContentGroup = new BasicFeatureMap(this, TextPackage.OFFICE_BODY_CONTENT__OFFICE_BODY_CONTENT_GROUP);
		}
		return officeBodyContentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOfficeBodyContent() {
		return (EObject)getOfficeBodyContentGroup().get(TextPackage.eINSTANCE.getOfficeBodyContent_OfficeBodyContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOfficeBodyContent(EObject newOfficeBodyContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getOfficeBodyContentGroup()).basicAdd(TextPackage.eINSTANCE.getOfficeBodyContent_OfficeBodyContent(), newOfficeBodyContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.OFFICE_BODY_CONTENT__OFFICE_BODY_CONTENT_GROUP:
				return ((InternalEList<?>)getOfficeBodyContentGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.OFFICE_BODY_CONTENT__OFFICE_BODY_CONTENT:
				return basicSetOfficeBodyContent(null, msgs);
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
			case TextPackage.OFFICE_BODY_CONTENT__OFFICE_BODY_CONTENT_GROUP:
				if (coreType) return getOfficeBodyContentGroup();
				return ((FeatureMap.Internal)getOfficeBodyContentGroup()).getWrapper();
			case TextPackage.OFFICE_BODY_CONTENT__OFFICE_BODY_CONTENT:
				return getOfficeBodyContent();
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
			case TextPackage.OFFICE_BODY_CONTENT__OFFICE_BODY_CONTENT_GROUP:
				((FeatureMap.Internal)getOfficeBodyContentGroup()).set(newValue);
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
			case TextPackage.OFFICE_BODY_CONTENT__OFFICE_BODY_CONTENT_GROUP:
				getOfficeBodyContentGroup().clear();
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
			case TextPackage.OFFICE_BODY_CONTENT__OFFICE_BODY_CONTENT_GROUP:
				return officeBodyContentGroup != null && !officeBodyContentGroup.isEmpty();
			case TextPackage.OFFICE_BODY_CONTENT__OFFICE_BODY_CONTENT:
				return getOfficeBodyContent() != null;
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
		result.append(" (officeBodyContentGroup: ");
		result.append(officeBodyContentGroup);
		result.append(')');
		return result.toString();
	}

} //OfficeBodyContentImpl
