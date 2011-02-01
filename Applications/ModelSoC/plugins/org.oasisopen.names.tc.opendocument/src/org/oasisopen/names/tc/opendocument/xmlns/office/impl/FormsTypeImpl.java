/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormType;
import org.oasisopen.names.tc.opendocument.xmlns.office.FormsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.AnyAttListOrElements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forms Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.FormsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.FormsTypeImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.FormsTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.FormsTypeImpl#getApplyDesignMode <em>Apply Design Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.FormsTypeImpl#getAutomaticFocus <em>Automatic Focus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormsTypeImpl extends EObjectImpl implements FormsType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getApplyDesignMode() <em>Apply Design Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyDesignMode()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean APPLY_DESIGN_MODE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getApplyDesignMode() <em>Apply Design Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyDesignMode()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean applyDesignMode = APPLY_DESIGN_MODE_EDEFAULT;

	/**
	 * This is true if the Apply Design Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applyDesignModeESet;

	/**
	 * The default value of the '{@link #getAutomaticFocus() <em>Automatic Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticFocus()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTOMATIC_FOCUS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAutomaticFocus() <em>Automatic Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticFocus()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean automaticFocus = AUTOMATIC_FOCUS_EDEFAULT;

	/**
	 * This is true if the Automatic Focus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean automaticFocusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.FORMS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, OfficePackage.FORMS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormType> getForm() {
		return getGroup().list(OfficePackage.Literals.FORMS_TYPE__FORM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnyAttListOrElements> getModel() {
		return getGroup().list(OfficePackage.Literals.FORMS_TYPE__MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getApplyDesignMode() {
		return applyDesignMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyDesignMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newApplyDesignMode) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldApplyDesignMode = applyDesignMode;
		applyDesignMode = newApplyDesignMode == null ? APPLY_DESIGN_MODE_EDEFAULT : newApplyDesignMode;
		boolean oldApplyDesignModeESet = applyDesignModeESet;
		applyDesignModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.FORMS_TYPE__APPLY_DESIGN_MODE, oldApplyDesignMode, applyDesignMode, !oldApplyDesignModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplyDesignMode() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldApplyDesignMode = applyDesignMode;
		boolean oldApplyDesignModeESet = applyDesignModeESet;
		applyDesignMode = APPLY_DESIGN_MODE_EDEFAULT;
		applyDesignModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.FORMS_TYPE__APPLY_DESIGN_MODE, oldApplyDesignMode, APPLY_DESIGN_MODE_EDEFAULT, oldApplyDesignModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplyDesignMode() {
		return applyDesignModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticFocus() {
		return automaticFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticFocus(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutomaticFocus) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticFocus = automaticFocus;
		automaticFocus = newAutomaticFocus == null ? AUTOMATIC_FOCUS_EDEFAULT : newAutomaticFocus;
		boolean oldAutomaticFocusESet = automaticFocusESet;
		automaticFocusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.FORMS_TYPE__AUTOMATIC_FOCUS, oldAutomaticFocus, automaticFocus, !oldAutomaticFocusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutomaticFocus() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticFocus = automaticFocus;
		boolean oldAutomaticFocusESet = automaticFocusESet;
		automaticFocus = AUTOMATIC_FOCUS_EDEFAULT;
		automaticFocusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OfficePackage.FORMS_TYPE__AUTOMATIC_FOCUS, oldAutomaticFocus, AUTOMATIC_FOCUS_EDEFAULT, oldAutomaticFocusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutomaticFocus() {
		return automaticFocusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.FORMS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OfficePackage.FORMS_TYPE__FORM:
				return ((InternalEList<?>)getForm()).basicRemove(otherEnd, msgs);
			case OfficePackage.FORMS_TYPE__MODEL:
				return ((InternalEList<?>)getModel()).basicRemove(otherEnd, msgs);
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
			case OfficePackage.FORMS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OfficePackage.FORMS_TYPE__FORM:
				return getForm();
			case OfficePackage.FORMS_TYPE__MODEL:
				return getModel();
			case OfficePackage.FORMS_TYPE__APPLY_DESIGN_MODE:
				return getApplyDesignMode();
			case OfficePackage.FORMS_TYPE__AUTOMATIC_FOCUS:
				return getAutomaticFocus();
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
			case OfficePackage.FORMS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OfficePackage.FORMS_TYPE__FORM:
				getForm().clear();
				getForm().addAll((Collection<? extends FormType>)newValue);
				return;
			case OfficePackage.FORMS_TYPE__MODEL:
				getModel().clear();
				getModel().addAll((Collection<? extends AnyAttListOrElements>)newValue);
				return;
			case OfficePackage.FORMS_TYPE__APPLY_DESIGN_MODE:
				setApplyDesignMode((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case OfficePackage.FORMS_TYPE__AUTOMATIC_FOCUS:
				setAutomaticFocus((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case OfficePackage.FORMS_TYPE__GROUP:
				getGroup().clear();
				return;
			case OfficePackage.FORMS_TYPE__FORM:
				getForm().clear();
				return;
			case OfficePackage.FORMS_TYPE__MODEL:
				getModel().clear();
				return;
			case OfficePackage.FORMS_TYPE__APPLY_DESIGN_MODE:
				unsetApplyDesignMode();
				return;
			case OfficePackage.FORMS_TYPE__AUTOMATIC_FOCUS:
				unsetAutomaticFocus();
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
			case OfficePackage.FORMS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case OfficePackage.FORMS_TYPE__FORM:
				return !getForm().isEmpty();
			case OfficePackage.FORMS_TYPE__MODEL:
				return !getModel().isEmpty();
			case OfficePackage.FORMS_TYPE__APPLY_DESIGN_MODE:
				return isSetApplyDesignMode();
			case OfficePackage.FORMS_TYPE__AUTOMATIC_FOCUS:
				return isSetAutomaticFocus();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", applyDesignMode: ");
		if (applyDesignModeESet) result.append(applyDesignMode); else result.append("<unset>");
		result.append(", automaticFocus: ");
		if (automaticFocusESet) result.append(automaticFocus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FormsTypeImpl
