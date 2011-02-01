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
import es.tid.cim.ElementSettingData;
import es.tid.cim.EnumIsCurrent;
import es.tid.cim.EnumIsDefault;
import es.tid.cim.EnumIsMaximum;
import es.tid.cim.EnumIsMinimum;
import es.tid.cim.EnumIsNext;
import es.tid.cim.EnumIsPending;
import es.tid.cim.SettingData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ElementSettingDataImpl#getIsCurrent <em>Is Current</em>}</li>
 *   <li>{@link es.tid.cim.impl.ElementSettingDataImpl#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link es.tid.cim.impl.ElementSettingDataImpl#getIsMaximum <em>Is Maximum</em>}</li>
 *   <li>{@link es.tid.cim.impl.ElementSettingDataImpl#getIsMinimum <em>Is Minimum</em>}</li>
 *   <li>{@link es.tid.cim.impl.ElementSettingDataImpl#getIsNext <em>Is Next</em>}</li>
 *   <li>{@link es.tid.cim.impl.ElementSettingDataImpl#getIsPending <em>Is Pending</em>}</li>
 *   <li>{@link es.tid.cim.impl.ElementSettingDataImpl#getSettingData <em>Setting Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementSettingDataImpl extends ManagedElementImpl implements ElementSettingData {
	/**
	 * The default value of the '{@link #getIsCurrent() <em>Is Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final EnumIsCurrent IS_CURRENT_EDEFAULT = EnumIsCurrent.UNKNOWN;

	/**
	 * The cached value of the '{@link #getIsCurrent() <em>Is Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCurrent()
	 * @generated
	 * @ordered
	 */
	protected EnumIsCurrent isCurrent = IS_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final EnumIsDefault IS_DEFAULT_EDEFAULT = EnumIsDefault.UNKNOWN;

	/**
	 * The cached value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected EnumIsDefault isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMaximum() <em>Is Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final EnumIsMaximum IS_MAXIMUM_EDEFAULT = EnumIsMaximum.UNKNOWN;

	/**
	 * The cached value of the '{@link #getIsMaximum() <em>Is Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMaximum()
	 * @generated
	 * @ordered
	 */
	protected EnumIsMaximum isMaximum = IS_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMinimum() <em>Is Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final EnumIsMinimum IS_MINIMUM_EDEFAULT = EnumIsMinimum.UNKNOWN;

	/**
	 * The cached value of the '{@link #getIsMinimum() <em>Is Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMinimum()
	 * @generated
	 * @ordered
	 */
	protected EnumIsMinimum isMinimum = IS_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsNext() <em>Is Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNext()
	 * @generated
	 * @ordered
	 */
	protected static final EnumIsNext IS_NEXT_EDEFAULT = EnumIsNext.UNKNOWN;

	/**
	 * The cached value of the '{@link #getIsNext() <em>Is Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNext()
	 * @generated
	 * @ordered
	 */
	protected EnumIsNext isNext = IS_NEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsPending() <em>Is Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPending()
	 * @generated
	 * @ordered
	 */
	protected static final EnumIsPending IS_PENDING_EDEFAULT = EnumIsPending.UNKNOWN;

	/**
	 * The cached value of the '{@link #getIsPending() <em>Is Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPending()
	 * @generated
	 * @ordered
	 */
	protected EnumIsPending isPending = IS_PENDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSettingData() <em>Setting Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingData()
	 * @generated
	 * @ordered
	 */
	protected SettingData settingData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getElementSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIsCurrent getIsCurrent() {
		return isCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCurrent(EnumIsCurrent newIsCurrent) {
		EnumIsCurrent oldIsCurrent = isCurrent;
		isCurrent = newIsCurrent == null ? IS_CURRENT_EDEFAULT : newIsCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ELEMENT_SETTING_DATA__IS_CURRENT, oldIsCurrent, isCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIsDefault getIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefault(EnumIsDefault newIsDefault) {
		EnumIsDefault oldIsDefault = isDefault;
		isDefault = newIsDefault == null ? IS_DEFAULT_EDEFAULT : newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ELEMENT_SETTING_DATA__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIsMaximum getIsMaximum() {
		return isMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMaximum(EnumIsMaximum newIsMaximum) {
		EnumIsMaximum oldIsMaximum = isMaximum;
		isMaximum = newIsMaximum == null ? IS_MAXIMUM_EDEFAULT : newIsMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ELEMENT_SETTING_DATA__IS_MAXIMUM, oldIsMaximum, isMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIsMinimum getIsMinimum() {
		return isMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMinimum(EnumIsMinimum newIsMinimum) {
		EnumIsMinimum oldIsMinimum = isMinimum;
		isMinimum = newIsMinimum == null ? IS_MINIMUM_EDEFAULT : newIsMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ELEMENT_SETTING_DATA__IS_MINIMUM, oldIsMinimum, isMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIsNext getIsNext() {
		return isNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNext(EnumIsNext newIsNext) {
		EnumIsNext oldIsNext = isNext;
		isNext = newIsNext == null ? IS_NEXT_EDEFAULT : newIsNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ELEMENT_SETTING_DATA__IS_NEXT, oldIsNext, isNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIsPending getIsPending() {
		return isPending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPending(EnumIsPending newIsPending) {
		EnumIsPending oldIsPending = isPending;
		isPending = newIsPending == null ? IS_PENDING_EDEFAULT : newIsPending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ELEMENT_SETTING_DATA__IS_PENDING, oldIsPending, isPending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingData getSettingData() {
		if (settingData != null && settingData.eIsProxy()) {
			InternalEObject oldSettingData = (InternalEObject)settingData;
			settingData = (SettingData)eResolveProxy(oldSettingData);
			if (settingData != oldSettingData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.ELEMENT_SETTING_DATA__SETTING_DATA, oldSettingData, settingData));
			}
		}
		return settingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingData basicGetSettingData() {
		return settingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettingData(SettingData newSettingData) {
		SettingData oldSettingData = settingData;
		settingData = newSettingData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ELEMENT_SETTING_DATA__SETTING_DATA, oldSettingData, settingData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.ELEMENT_SETTING_DATA__IS_CURRENT:
				return getIsCurrent();
			case CimPackage.ELEMENT_SETTING_DATA__IS_DEFAULT:
				return getIsDefault();
			case CimPackage.ELEMENT_SETTING_DATA__IS_MAXIMUM:
				return getIsMaximum();
			case CimPackage.ELEMENT_SETTING_DATA__IS_MINIMUM:
				return getIsMinimum();
			case CimPackage.ELEMENT_SETTING_DATA__IS_NEXT:
				return getIsNext();
			case CimPackage.ELEMENT_SETTING_DATA__IS_PENDING:
				return getIsPending();
			case CimPackage.ELEMENT_SETTING_DATA__SETTING_DATA:
				if (resolve) return getSettingData();
				return basicGetSettingData();
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
			case CimPackage.ELEMENT_SETTING_DATA__IS_CURRENT:
				setIsCurrent((EnumIsCurrent)newValue);
				return;
			case CimPackage.ELEMENT_SETTING_DATA__IS_DEFAULT:
				setIsDefault((EnumIsDefault)newValue);
				return;
			case CimPackage.ELEMENT_SETTING_DATA__IS_MAXIMUM:
				setIsMaximum((EnumIsMaximum)newValue);
				return;
			case CimPackage.ELEMENT_SETTING_DATA__IS_MINIMUM:
				setIsMinimum((EnumIsMinimum)newValue);
				return;
			case CimPackage.ELEMENT_SETTING_DATA__IS_NEXT:
				setIsNext((EnumIsNext)newValue);
				return;
			case CimPackage.ELEMENT_SETTING_DATA__IS_PENDING:
				setIsPending((EnumIsPending)newValue);
				return;
			case CimPackage.ELEMENT_SETTING_DATA__SETTING_DATA:
				setSettingData((SettingData)newValue);
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
			case CimPackage.ELEMENT_SETTING_DATA__IS_CURRENT:
				setIsCurrent(IS_CURRENT_EDEFAULT);
				return;
			case CimPackage.ELEMENT_SETTING_DATA__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case CimPackage.ELEMENT_SETTING_DATA__IS_MAXIMUM:
				setIsMaximum(IS_MAXIMUM_EDEFAULT);
				return;
			case CimPackage.ELEMENT_SETTING_DATA__IS_MINIMUM:
				setIsMinimum(IS_MINIMUM_EDEFAULT);
				return;
			case CimPackage.ELEMENT_SETTING_DATA__IS_NEXT:
				setIsNext(IS_NEXT_EDEFAULT);
				return;
			case CimPackage.ELEMENT_SETTING_DATA__IS_PENDING:
				setIsPending(IS_PENDING_EDEFAULT);
				return;
			case CimPackage.ELEMENT_SETTING_DATA__SETTING_DATA:
				setSettingData((SettingData)null);
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
			case CimPackage.ELEMENT_SETTING_DATA__IS_CURRENT:
				return isCurrent != IS_CURRENT_EDEFAULT;
			case CimPackage.ELEMENT_SETTING_DATA__IS_DEFAULT:
				return isDefault != IS_DEFAULT_EDEFAULT;
			case CimPackage.ELEMENT_SETTING_DATA__IS_MAXIMUM:
				return isMaximum != IS_MAXIMUM_EDEFAULT;
			case CimPackage.ELEMENT_SETTING_DATA__IS_MINIMUM:
				return isMinimum != IS_MINIMUM_EDEFAULT;
			case CimPackage.ELEMENT_SETTING_DATA__IS_NEXT:
				return isNext != IS_NEXT_EDEFAULT;
			case CimPackage.ELEMENT_SETTING_DATA__IS_PENDING:
				return isPending != IS_PENDING_EDEFAULT;
			case CimPackage.ELEMENT_SETTING_DATA__SETTING_DATA:
				return settingData != null;
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
		result.append(" (isCurrent: ");
		result.append(isCurrent);
		result.append(", isDefault: ");
		result.append(isDefault);
		result.append(", isMaximum: ");
		result.append(isMaximum);
		result.append(", isMinimum: ");
		result.append(isMinimum);
		result.append(", isNext: ");
		result.append(isNext);
		result.append(", isPending: ");
		result.append(isPending);
		result.append(')');
		return result.toString();
	}

} //ElementSettingDataImpl
