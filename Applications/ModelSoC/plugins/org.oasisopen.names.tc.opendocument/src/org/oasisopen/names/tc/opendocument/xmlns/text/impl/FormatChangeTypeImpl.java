/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.text.FormatChangeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Format Change Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormatChangeTypeImpl#getChangeInfo <em>Change Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormatChangeTypeImpl extends EObjectImpl implements FormatChangeType {
	/**
	 * The cached value of the '{@link #getChangeInfo() <em>Change Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeInfo()
	 * @generated
	 * @ordered
	 */
	protected ChangeInfoType changeInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormatChangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getFormatChangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeInfoType getChangeInfo() {
		return changeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeInfo(ChangeInfoType newChangeInfo, NotificationChain msgs) {
		ChangeInfoType oldChangeInfo = changeInfo;
		changeInfo = newChangeInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.FORMAT_CHANGE_TYPE__CHANGE_INFO, oldChangeInfo, newChangeInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeInfo(ChangeInfoType newChangeInfo) {
		if (newChangeInfo != changeInfo) {
			NotificationChain msgs = null;
			if (changeInfo != null)
				msgs = ((InternalEObject)changeInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.FORMAT_CHANGE_TYPE__CHANGE_INFO, null, msgs);
			if (newChangeInfo != null)
				msgs = ((InternalEObject)newChangeInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.FORMAT_CHANGE_TYPE__CHANGE_INFO, null, msgs);
			msgs = basicSetChangeInfo(newChangeInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.FORMAT_CHANGE_TYPE__CHANGE_INFO, newChangeInfo, newChangeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.FORMAT_CHANGE_TYPE__CHANGE_INFO:
				return basicSetChangeInfo(null, msgs);
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
			case TextPackage.FORMAT_CHANGE_TYPE__CHANGE_INFO:
				return getChangeInfo();
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
			case TextPackage.FORMAT_CHANGE_TYPE__CHANGE_INFO:
				setChangeInfo((ChangeInfoType)newValue);
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
			case TextPackage.FORMAT_CHANGE_TYPE__CHANGE_INFO:
				setChangeInfo((ChangeInfoType)null);
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
			case TextPackage.FORMAT_CHANGE_TYPE__CHANGE_INFO:
				return changeInfo != null;
		}
		return super.eIsSet(featureID);
	}

} //FormatChangeTypeImpl
