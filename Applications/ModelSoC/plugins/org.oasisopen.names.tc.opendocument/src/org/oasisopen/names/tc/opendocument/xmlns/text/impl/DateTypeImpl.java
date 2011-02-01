/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.DateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DateTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DateTypeImpl#getDataStyleName <em>Data Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DateTypeImpl#getDateAdjust <em>Date Adjust</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DateTypeImpl#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DateTypeImpl#getFixed <em>Fixed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateTypeImpl extends EObjectImpl implements DateType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getDataStyleName() <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataStyleName() <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStyleName()
	 * @generated
	 * @ordered
	 */
	protected String dataStyleName = DATA_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateAdjust() <em>Date Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAdjust()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DATE_ADJUST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateAdjust() <em>Date Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAdjust()
	 * @generated
	 * @ordered
	 */
	protected Duration dateAdjust = DATE_ADJUST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateValue() <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValue()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateValue() <em>Date Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValue()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateValue = DATE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean FIXED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean fixed = FIXED_EDEFAULT;

	/**
	 * This is true if the Fixed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getDateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.DATE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataStyleName() {
		return dataStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStyleName(String newDataStyleName) {
		String oldDataStyleName = dataStyleName;
		dataStyleName = newDataStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DATE_TYPE__DATA_STYLE_NAME, oldDataStyleName, dataStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDateAdjust() {
		return dateAdjust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAdjust(Duration newDateAdjust) {
		Duration oldDateAdjust = dateAdjust;
		dateAdjust = newDateAdjust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DATE_TYPE__DATE_ADJUST, oldDateAdjust, dateAdjust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateValue() {
		return dateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateValue(XMLGregorianCalendar newDateValue) {
		XMLGregorianCalendar oldDateValue = dateValue;
		dateValue = newDateValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DATE_TYPE__DATE_VALUE, oldDateValue, dateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFixed() {
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newFixed) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFixed = fixed;
		fixed = newFixed == null ? FIXED_EDEFAULT : newFixed;
		boolean oldFixedESet = fixedESet;
		fixedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DATE_TYPE__FIXED, oldFixed, fixed, !oldFixedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFixed() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldFixed = fixed;
		boolean oldFixedESet = fixedESet;
		fixed = FIXED_EDEFAULT;
		fixedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.DATE_TYPE__FIXED, oldFixed, FIXED_EDEFAULT, oldFixedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFixed() {
		return fixedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.DATE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case TextPackage.DATE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.DATE_TYPE__DATA_STYLE_NAME:
				return getDataStyleName();
			case TextPackage.DATE_TYPE__DATE_ADJUST:
				return getDateAdjust();
			case TextPackage.DATE_TYPE__DATE_VALUE:
				return getDateValue();
			case TextPackage.DATE_TYPE__FIXED:
				return getFixed();
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
			case TextPackage.DATE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.DATE_TYPE__DATA_STYLE_NAME:
				setDataStyleName((String)newValue);
				return;
			case TextPackage.DATE_TYPE__DATE_ADJUST:
				setDateAdjust((Duration)newValue);
				return;
			case TextPackage.DATE_TYPE__DATE_VALUE:
				setDateValue((XMLGregorianCalendar)newValue);
				return;
			case TextPackage.DATE_TYPE__FIXED:
				setFixed((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TextPackage.DATE_TYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.DATE_TYPE__DATA_STYLE_NAME:
				setDataStyleName(DATA_STYLE_NAME_EDEFAULT);
				return;
			case TextPackage.DATE_TYPE__DATE_ADJUST:
				setDateAdjust(DATE_ADJUST_EDEFAULT);
				return;
			case TextPackage.DATE_TYPE__DATE_VALUE:
				setDateValue(DATE_VALUE_EDEFAULT);
				return;
			case TextPackage.DATE_TYPE__FIXED:
				unsetFixed();
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
			case TextPackage.DATE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.DATE_TYPE__DATA_STYLE_NAME:
				return DATA_STYLE_NAME_EDEFAULT == null ? dataStyleName != null : !DATA_STYLE_NAME_EDEFAULT.equals(dataStyleName);
			case TextPackage.DATE_TYPE__DATE_ADJUST:
				return DATE_ADJUST_EDEFAULT == null ? dateAdjust != null : !DATE_ADJUST_EDEFAULT.equals(dateAdjust);
			case TextPackage.DATE_TYPE__DATE_VALUE:
				return DATE_VALUE_EDEFAULT == null ? dateValue != null : !DATE_VALUE_EDEFAULT.equals(dateValue);
			case TextPackage.DATE_TYPE__FIXED:
				return isSetFixed();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", dataStyleName: ");
		result.append(dataStyleName);
		result.append(", dateAdjust: ");
		result.append(dateAdjust);
		result.append(", dateValue: ");
		result.append(dateValue);
		result.append(", fixed: ");
		if (fixedESet) result.append(fixed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DateTypeImpl
