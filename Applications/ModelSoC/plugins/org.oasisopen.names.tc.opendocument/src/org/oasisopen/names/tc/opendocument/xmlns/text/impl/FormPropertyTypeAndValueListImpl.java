/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType1;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType2;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType3;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType5;
import org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Property Type And Value List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue <em>List Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue1 <em>List Value1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue2 <em>List Value2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue3 <em>List Value3</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue11 <em>List Value11</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue4 <em>List Value4</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue21 <em>List Value21</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue5 <em>List Value5</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue31 <em>List Value31</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue6 <em>List Value6</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue41 <em>List Value41</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue7 <em>List Value7</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue51 <em>List Value51</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getListValue8 <em>List Value8</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.FormPropertyTypeAndValueListImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormPropertyTypeAndValueListImpl extends EObjectImpl implements FormPropertyTypeAndValueList {
	/**
	 * The cached value of the '{@link #getListValue() <em>List Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListValue()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap listValue;

	/**
	 * The cached value of the '{@link #getListValue2() <em>List Value2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListValue2()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap listValue2;

	/**
	 * The cached value of the '{@link #getListValue11() <em>List Value11</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListValue11()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap listValue11;

	/**
	 * The cached value of the '{@link #getListValue21() <em>List Value21</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListValue21()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap listValue21;

	/**
	 * The cached value of the '{@link #getListValue31() <em>List Value31</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListValue31()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap listValue31;

	/**
	 * The cached value of the '{@link #getListValue41() <em>List Value41</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListValue41()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap listValue41;

	/**
	 * The cached value of the '{@link #getListValue51() <em>List Value51</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListValue51()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap listValue51;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final ValueTypeType VALUE_TYPE_EDEFAULT = ValueTypeType.FLOAT;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected ValueTypeType valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * This is true if the Value Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormPropertyTypeAndValueListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getFormPropertyTypeAndValueList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getListValue() {
		if (listValue == null) {
			listValue = new BasicFeatureMap(this, TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE);
		}
		return listValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListValueType5> getListValue1() {
		return getListValue().list(TextPackage.eINSTANCE.getFormPropertyTypeAndValueList_ListValue1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getListValue2() {
		if (listValue2 == null) {
			listValue2 = new BasicFeatureMap(this, TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE2);
		}
		return listValue2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListValueType5> getListValue3() {
		return getListValue2().list(TextPackage.eINSTANCE.getFormPropertyTypeAndValueList_ListValue3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getListValue11() {
		if (listValue11 == null) {
			listValue11 = new BasicFeatureMap(this, TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE11);
		}
		return listValue11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListValueType4> getListValue4() {
		return getListValue11().list(TextPackage.eINSTANCE.getFormPropertyTypeAndValueList_ListValue4());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getListValue21() {
		if (listValue21 == null) {
			listValue21 = new BasicFeatureMap(this, TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE21);
		}
		return listValue21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListValueType> getListValue5() {
		return getListValue21().list(TextPackage.eINSTANCE.getFormPropertyTypeAndValueList_ListValue5());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getListValue31() {
		if (listValue31 == null) {
			listValue31 = new BasicFeatureMap(this, TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE31);
		}
		return listValue31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListValueType3> getListValue6() {
		return getListValue31().list(TextPackage.eINSTANCE.getFormPropertyTypeAndValueList_ListValue6());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getListValue41() {
		if (listValue41 == null) {
			listValue41 = new BasicFeatureMap(this, TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE41);
		}
		return listValue41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListValueType1> getListValue7() {
		return getListValue41().list(TextPackage.eINSTANCE.getFormPropertyTypeAndValueList_ListValue7());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getListValue51() {
		if (listValue51 == null) {
			listValue51 = new BasicFeatureMap(this, TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE51);
		}
		return listValue51;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListValueType2> getListValue8() {
		return getListValue51().list(TextPackage.eINSTANCE.getFormPropertyTypeAndValueList_ListValue8());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(ValueTypeType newValueType) {
		ValueTypeType oldValueType = valueType;
		valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
		boolean oldValueTypeESet = valueTypeESet;
		valueTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__VALUE_TYPE, oldValueType, valueType, !oldValueTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValueType() {
		ValueTypeType oldValueType = valueType;
		boolean oldValueTypeESet = valueTypeESet;
		valueType = VALUE_TYPE_EDEFAULT;
		valueTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__VALUE_TYPE, oldValueType, VALUE_TYPE_EDEFAULT, oldValueTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValueType() {
		return valueTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE:
				return ((InternalEList<?>)getListValue()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE1:
				return ((InternalEList<?>)getListValue1()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE2:
				return ((InternalEList<?>)getListValue2()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE3:
				return ((InternalEList<?>)getListValue3()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE11:
				return ((InternalEList<?>)getListValue11()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE4:
				return ((InternalEList<?>)getListValue4()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE21:
				return ((InternalEList<?>)getListValue21()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE5:
				return ((InternalEList<?>)getListValue5()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE31:
				return ((InternalEList<?>)getListValue31()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE6:
				return ((InternalEList<?>)getListValue6()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE41:
				return ((InternalEList<?>)getListValue41()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE7:
				return ((InternalEList<?>)getListValue7()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE51:
				return ((InternalEList<?>)getListValue51()).basicRemove(otherEnd, msgs);
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE8:
				return ((InternalEList<?>)getListValue8()).basicRemove(otherEnd, msgs);
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
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE:
				if (coreType) return getListValue();
				return ((FeatureMap.Internal)getListValue()).getWrapper();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE1:
				return getListValue1();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE2:
				if (coreType) return getListValue2();
				return ((FeatureMap.Internal)getListValue2()).getWrapper();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE3:
				return getListValue3();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE11:
				if (coreType) return getListValue11();
				return ((FeatureMap.Internal)getListValue11()).getWrapper();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE4:
				return getListValue4();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE21:
				if (coreType) return getListValue21();
				return ((FeatureMap.Internal)getListValue21()).getWrapper();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE5:
				return getListValue5();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE31:
				if (coreType) return getListValue31();
				return ((FeatureMap.Internal)getListValue31()).getWrapper();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE6:
				return getListValue6();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE41:
				if (coreType) return getListValue41();
				return ((FeatureMap.Internal)getListValue41()).getWrapper();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE7:
				return getListValue7();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE51:
				if (coreType) return getListValue51();
				return ((FeatureMap.Internal)getListValue51()).getWrapper();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE8:
				return getListValue8();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__VALUE_TYPE:
				return getValueType();
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
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE:
				((FeatureMap.Internal)getListValue()).set(newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE1:
				getListValue1().clear();
				getListValue1().addAll((Collection<? extends ListValueType5>)newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE2:
				((FeatureMap.Internal)getListValue2()).set(newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE3:
				getListValue3().clear();
				getListValue3().addAll((Collection<? extends ListValueType5>)newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE11:
				((FeatureMap.Internal)getListValue11()).set(newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE4:
				getListValue4().clear();
				getListValue4().addAll((Collection<? extends ListValueType4>)newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE21:
				((FeatureMap.Internal)getListValue21()).set(newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE5:
				getListValue5().clear();
				getListValue5().addAll((Collection<? extends ListValueType>)newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE31:
				((FeatureMap.Internal)getListValue31()).set(newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE6:
				getListValue6().clear();
				getListValue6().addAll((Collection<? extends ListValueType3>)newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE41:
				((FeatureMap.Internal)getListValue41()).set(newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE7:
				getListValue7().clear();
				getListValue7().addAll((Collection<? extends ListValueType1>)newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE51:
				((FeatureMap.Internal)getListValue51()).set(newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE8:
				getListValue8().clear();
				getListValue8().addAll((Collection<? extends ListValueType2>)newValue);
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__VALUE_TYPE:
				setValueType((ValueTypeType)newValue);
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
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE:
				getListValue().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE1:
				getListValue1().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE2:
				getListValue2().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE3:
				getListValue3().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE11:
				getListValue11().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE4:
				getListValue4().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE21:
				getListValue21().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE5:
				getListValue5().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE31:
				getListValue31().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE6:
				getListValue6().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE41:
				getListValue41().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE7:
				getListValue7().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE51:
				getListValue51().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE8:
				getListValue8().clear();
				return;
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__VALUE_TYPE:
				unsetValueType();
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
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE:
				return listValue != null && !listValue.isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE1:
				return !getListValue1().isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE2:
				return listValue2 != null && !listValue2.isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE3:
				return !getListValue3().isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE11:
				return listValue11 != null && !listValue11.isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE4:
				return !getListValue4().isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE21:
				return listValue21 != null && !listValue21.isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE5:
				return !getListValue5().isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE31:
				return listValue31 != null && !listValue31.isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE6:
				return !getListValue6().isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE41:
				return listValue41 != null && !listValue41.isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE7:
				return !getListValue7().isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE51:
				return listValue51 != null && !listValue51.isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__LIST_VALUE8:
				return !getListValue8().isEmpty();
			case TextPackage.FORM_PROPERTY_TYPE_AND_VALUE_LIST__VALUE_TYPE:
				return isSetValueType();
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
		result.append(" (listValue: ");
		result.append(listValue);
		result.append(", listValue2: ");
		result.append(listValue2);
		result.append(", listValue11: ");
		result.append(listValue11);
		result.append(", listValue21: ");
		result.append(listValue21);
		result.append(", listValue31: ");
		result.append(listValue31);
		result.append(", listValue41: ");
		result.append(listValue41);
		result.append(", listValue51: ");
		result.append(listValue51);
		result.append(", valueType: ");
		if (valueTypeESet) result.append(valueType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FormPropertyTypeAndValueListImpl
