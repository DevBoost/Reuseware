/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.EnabledLogicalElementCapabilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enabled Logical Element Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.EnabledLogicalElementCapabilitiesImpl#isElementNameEditSupported <em>Element Name Edit Supported</em>}</li>
 *   <li>{@link es.tid.cim.impl.EnabledLogicalElementCapabilitiesImpl#getMaxElementNameLen <em>Max Element Name Len</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnabledLogicalElementCapabilitiesImpl extends CapabilitiesImpl implements EnabledLogicalElementCapabilities {
	/**
	 * The default value of the '{@link #isElementNameEditSupported() <em>Element Name Edit Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElementNameEditSupported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELEMENT_NAME_EDIT_SUPPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isElementNameEditSupported() <em>Element Name Edit Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElementNameEditSupported()
	 * @generated
	 * @ordered
	 */
	protected boolean elementNameEditSupported = ELEMENT_NAME_EDIT_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxElementNameLen() <em>Max Element Name Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxElementNameLen()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ELEMENT_NAME_LEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxElementNameLen() <em>Max Element Name Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxElementNameLen()
	 * @generated
	 * @ordered
	 */
	protected int maxElementNameLen = MAX_ELEMENT_NAME_LEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnabledLogicalElementCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getEnabledLogicalElementCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isElementNameEditSupported() {
		return elementNameEditSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementNameEditSupported(boolean newElementNameEditSupported) {
		boolean oldElementNameEditSupported = elementNameEditSupported;
		elementNameEditSupported = newElementNameEditSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_EDIT_SUPPORTED, oldElementNameEditSupported, elementNameEditSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxElementNameLen() {
		return maxElementNameLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxElementNameLen(int newMaxElementNameLen) {
		int oldMaxElementNameLen = maxElementNameLen;
		maxElementNameLen = newMaxElementNameLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ENABLED_LOGICAL_ELEMENT_CAPABILITIES__MAX_ELEMENT_NAME_LEN, oldMaxElementNameLen, maxElementNameLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_EDIT_SUPPORTED:
				return isElementNameEditSupported();
			case CimPackage.ENABLED_LOGICAL_ELEMENT_CAPABILITIES__MAX_ELEMENT_NAME_LEN:
				return getMaxElementNameLen();
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
			case CimPackage.ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_EDIT_SUPPORTED:
				setElementNameEditSupported((Boolean)newValue);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT_CAPABILITIES__MAX_ELEMENT_NAME_LEN:
				setMaxElementNameLen((Integer)newValue);
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
			case CimPackage.ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_EDIT_SUPPORTED:
				setElementNameEditSupported(ELEMENT_NAME_EDIT_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT_CAPABILITIES__MAX_ELEMENT_NAME_LEN:
				setMaxElementNameLen(MAX_ELEMENT_NAME_LEN_EDEFAULT);
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
			case CimPackage.ENABLED_LOGICAL_ELEMENT_CAPABILITIES__ELEMENT_NAME_EDIT_SUPPORTED:
				return elementNameEditSupported != ELEMENT_NAME_EDIT_SUPPORTED_EDEFAULT;
			case CimPackage.ENABLED_LOGICAL_ELEMENT_CAPABILITIES__MAX_ELEMENT_NAME_LEN:
				return maxElementNameLen != MAX_ELEMENT_NAME_LEN_EDEFAULT;
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
		result.append(" (elementNameEditSupported: ");
		result.append(elementNameEditSupported);
		result.append(", maxElementNameLen: ");
		result.append(maxElementNameLen);
		result.append(')');
		return result.toString();
	}

} //EnabledLogicalElementCapabilitiesImpl
