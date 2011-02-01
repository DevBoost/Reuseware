/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.FilterList;
import es.tid.cim.NATListBasedSettings;
import es.tid.cim.RangeOfIPAddresses;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NAT List Based Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.NATListBasedSettingsImpl#isOverloadingPermitted <em>Overloading Permitted</em>}</li>
 *   <li>{@link es.tid.cim.impl.NATListBasedSettingsImpl#getTranslationPoolForNAT <em>Translation Pool For NAT</em>}</li>
 *   <li>{@link es.tid.cim.impl.NATListBasedSettingsImpl#getAddressesToBeTranslated <em>Addresses To Be Translated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NATListBasedSettingsImpl extends NATSettingDataImpl implements NATListBasedSettings {
	/**
	 * The default value of the '{@link #isOverloadingPermitted() <em>Overloading Permitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverloadingPermitted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERLOADING_PERMITTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverloadingPermitted() <em>Overloading Permitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverloadingPermitted()
	 * @generated
	 * @ordered
	 */
	protected boolean overloadingPermitted = OVERLOADING_PERMITTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTranslationPoolForNAT() <em>Translation Pool For NAT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationPoolForNAT()
	 * @generated
	 * @ordered
	 */
	protected RangeOfIPAddresses translationPoolForNAT;

	/**
	 * The cached value of the '{@link #getAddressesToBeTranslated() <em>Addresses To Be Translated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressesToBeTranslated()
	 * @generated
	 * @ordered
	 */
	protected FilterList addressesToBeTranslated;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NATListBasedSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getNATListBasedSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverloadingPermitted() {
		return overloadingPermitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverloadingPermitted(boolean newOverloadingPermitted) {
		boolean oldOverloadingPermitted = overloadingPermitted;
		overloadingPermitted = newOverloadingPermitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NAT_LIST_BASED_SETTINGS__OVERLOADING_PERMITTED, oldOverloadingPermitted, overloadingPermitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeOfIPAddresses getTranslationPoolForNAT() {
		if (translationPoolForNAT != null && translationPoolForNAT.eIsProxy()) {
			InternalEObject oldTranslationPoolForNAT = (InternalEObject)translationPoolForNAT;
			translationPoolForNAT = (RangeOfIPAddresses)eResolveProxy(oldTranslationPoolForNAT);
			if (translationPoolForNAT != oldTranslationPoolForNAT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.NAT_LIST_BASED_SETTINGS__TRANSLATION_POOL_FOR_NAT, oldTranslationPoolForNAT, translationPoolForNAT));
			}
		}
		return translationPoolForNAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeOfIPAddresses basicGetTranslationPoolForNAT() {
		return translationPoolForNAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslationPoolForNAT(RangeOfIPAddresses newTranslationPoolForNAT) {
		RangeOfIPAddresses oldTranslationPoolForNAT = translationPoolForNAT;
		translationPoolForNAT = newTranslationPoolForNAT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NAT_LIST_BASED_SETTINGS__TRANSLATION_POOL_FOR_NAT, oldTranslationPoolForNAT, translationPoolForNAT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterList getAddressesToBeTranslated() {
		if (addressesToBeTranslated != null && addressesToBeTranslated.eIsProxy()) {
			InternalEObject oldAddressesToBeTranslated = (InternalEObject)addressesToBeTranslated;
			addressesToBeTranslated = (FilterList)eResolveProxy(oldAddressesToBeTranslated);
			if (addressesToBeTranslated != oldAddressesToBeTranslated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.NAT_LIST_BASED_SETTINGS__ADDRESSES_TO_BE_TRANSLATED, oldAddressesToBeTranslated, addressesToBeTranslated));
			}
		}
		return addressesToBeTranslated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterList basicGetAddressesToBeTranslated() {
		return addressesToBeTranslated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressesToBeTranslated(FilterList newAddressesToBeTranslated) {
		FilterList oldAddressesToBeTranslated = addressesToBeTranslated;
		addressesToBeTranslated = newAddressesToBeTranslated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NAT_LIST_BASED_SETTINGS__ADDRESSES_TO_BE_TRANSLATED, oldAddressesToBeTranslated, addressesToBeTranslated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.NAT_LIST_BASED_SETTINGS__OVERLOADING_PERMITTED:
				return isOverloadingPermitted();
			case CimPackage.NAT_LIST_BASED_SETTINGS__TRANSLATION_POOL_FOR_NAT:
				if (resolve) return getTranslationPoolForNAT();
				return basicGetTranslationPoolForNAT();
			case CimPackage.NAT_LIST_BASED_SETTINGS__ADDRESSES_TO_BE_TRANSLATED:
				if (resolve) return getAddressesToBeTranslated();
				return basicGetAddressesToBeTranslated();
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
			case CimPackage.NAT_LIST_BASED_SETTINGS__OVERLOADING_PERMITTED:
				setOverloadingPermitted((Boolean)newValue);
				return;
			case CimPackage.NAT_LIST_BASED_SETTINGS__TRANSLATION_POOL_FOR_NAT:
				setTranslationPoolForNAT((RangeOfIPAddresses)newValue);
				return;
			case CimPackage.NAT_LIST_BASED_SETTINGS__ADDRESSES_TO_BE_TRANSLATED:
				setAddressesToBeTranslated((FilterList)newValue);
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
			case CimPackage.NAT_LIST_BASED_SETTINGS__OVERLOADING_PERMITTED:
				setOverloadingPermitted(OVERLOADING_PERMITTED_EDEFAULT);
				return;
			case CimPackage.NAT_LIST_BASED_SETTINGS__TRANSLATION_POOL_FOR_NAT:
				setTranslationPoolForNAT((RangeOfIPAddresses)null);
				return;
			case CimPackage.NAT_LIST_BASED_SETTINGS__ADDRESSES_TO_BE_TRANSLATED:
				setAddressesToBeTranslated((FilterList)null);
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
			case CimPackage.NAT_LIST_BASED_SETTINGS__OVERLOADING_PERMITTED:
				return overloadingPermitted != OVERLOADING_PERMITTED_EDEFAULT;
			case CimPackage.NAT_LIST_BASED_SETTINGS__TRANSLATION_POOL_FOR_NAT:
				return translationPoolForNAT != null;
			case CimPackage.NAT_LIST_BASED_SETTINGS__ADDRESSES_TO_BE_TRANSLATED:
				return addressesToBeTranslated != null;
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
		result.append(" (overloadingPermitted: ");
		result.append(overloadingPermitted);
		result.append(')');
		return result.toString();
	}

} //NATListBasedSettingsImpl
