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
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListStyleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automatic Styles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl#getListStyle <em>List Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl#getNumberStyle <em>Number Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl#getCurrencyStyle <em>Currency Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl#getPercentageStyle <em>Percentage Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl#getDateStyle <em>Date Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl#getTimeStyle <em>Time Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl#getBooleanStyle <em>Boolean Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.AutomaticStylesTypeImpl#getPageLayout <em>Page Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutomaticStylesTypeImpl extends EObjectImpl implements AutomaticStylesType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomaticStylesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.AUTOMATIC_STYLES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, OfficePackage.AUTOMATIC_STYLES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleType1> getStyle() {
		return getGroup().list(OfficePackage.Literals.AUTOMATIC_STYLES_TYPE__STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListStyleType> getListStyle() {
		return getGroup().list(OfficePackage.Literals.AUTOMATIC_STYLES_TYPE__LIST_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberStyleType> getNumberStyle() {
		return getGroup().list(OfficePackage.Literals.AUTOMATIC_STYLES_TYPE__NUMBER_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurrencyStyleType> getCurrencyStyle() {
		return getGroup().list(OfficePackage.Literals.AUTOMATIC_STYLES_TYPE__CURRENCY_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PercentageStyleType> getPercentageStyle() {
		return getGroup().list(OfficePackage.Literals.AUTOMATIC_STYLES_TYPE__PERCENTAGE_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateStyleType> getDateStyle() {
		return getGroup().list(OfficePackage.Literals.AUTOMATIC_STYLES_TYPE__DATE_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeStyleType> getTimeStyle() {
		return getGroup().list(OfficePackage.Literals.AUTOMATIC_STYLES_TYPE__TIME_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanStyleType> getBooleanStyle() {
		return getGroup().list(OfficePackage.Literals.AUTOMATIC_STYLES_TYPE__BOOLEAN_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextStyleType> getTextStyle() {
		return getGroup().list(OfficePackage.Literals.AUTOMATIC_STYLES_TYPE__TEXT_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageLayoutType> getPageLayout() {
		return getGroup().list(OfficePackage.Literals.AUTOMATIC_STYLES_TYPE__PAGE_LAYOUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.AUTOMATIC_STYLES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OfficePackage.AUTOMATIC_STYLES_TYPE__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.AUTOMATIC_STYLES_TYPE__LIST_STYLE:
				return ((InternalEList<?>)getListStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.AUTOMATIC_STYLES_TYPE__NUMBER_STYLE:
				return ((InternalEList<?>)getNumberStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.AUTOMATIC_STYLES_TYPE__CURRENCY_STYLE:
				return ((InternalEList<?>)getCurrencyStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.AUTOMATIC_STYLES_TYPE__PERCENTAGE_STYLE:
				return ((InternalEList<?>)getPercentageStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.AUTOMATIC_STYLES_TYPE__DATE_STYLE:
				return ((InternalEList<?>)getDateStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.AUTOMATIC_STYLES_TYPE__TIME_STYLE:
				return ((InternalEList<?>)getTimeStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.AUTOMATIC_STYLES_TYPE__BOOLEAN_STYLE:
				return ((InternalEList<?>)getBooleanStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.AUTOMATIC_STYLES_TYPE__TEXT_STYLE:
				return ((InternalEList<?>)getTextStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.AUTOMATIC_STYLES_TYPE__PAGE_LAYOUT:
				return ((InternalEList<?>)getPageLayout()).basicRemove(otherEnd, msgs);
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
			case OfficePackage.AUTOMATIC_STYLES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__STYLE:
				return getStyle();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__LIST_STYLE:
				return getListStyle();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__NUMBER_STYLE:
				return getNumberStyle();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__CURRENCY_STYLE:
				return getCurrencyStyle();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__PERCENTAGE_STYLE:
				return getPercentageStyle();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__DATE_STYLE:
				return getDateStyle();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__TIME_STYLE:
				return getTimeStyle();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__BOOLEAN_STYLE:
				return getBooleanStyle();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__TEXT_STYLE:
				return getTextStyle();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__PAGE_LAYOUT:
				return getPageLayout();
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
			case OfficePackage.AUTOMATIC_STYLES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__STYLE:
				getStyle().clear();
				getStyle().addAll((Collection<? extends StyleType1>)newValue);
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__LIST_STYLE:
				getListStyle().clear();
				getListStyle().addAll((Collection<? extends ListStyleType>)newValue);
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__NUMBER_STYLE:
				getNumberStyle().clear();
				getNumberStyle().addAll((Collection<? extends NumberStyleType>)newValue);
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__CURRENCY_STYLE:
				getCurrencyStyle().clear();
				getCurrencyStyle().addAll((Collection<? extends CurrencyStyleType>)newValue);
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__PERCENTAGE_STYLE:
				getPercentageStyle().clear();
				getPercentageStyle().addAll((Collection<? extends PercentageStyleType>)newValue);
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__DATE_STYLE:
				getDateStyle().clear();
				getDateStyle().addAll((Collection<? extends DateStyleType>)newValue);
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__TIME_STYLE:
				getTimeStyle().clear();
				getTimeStyle().addAll((Collection<? extends TimeStyleType>)newValue);
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__BOOLEAN_STYLE:
				getBooleanStyle().clear();
				getBooleanStyle().addAll((Collection<? extends BooleanStyleType>)newValue);
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__TEXT_STYLE:
				getTextStyle().clear();
				getTextStyle().addAll((Collection<? extends TextStyleType>)newValue);
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__PAGE_LAYOUT:
				getPageLayout().clear();
				getPageLayout().addAll((Collection<? extends PageLayoutType>)newValue);
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
			case OfficePackage.AUTOMATIC_STYLES_TYPE__GROUP:
				getGroup().clear();
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__STYLE:
				getStyle().clear();
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__LIST_STYLE:
				getListStyle().clear();
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__NUMBER_STYLE:
				getNumberStyle().clear();
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__CURRENCY_STYLE:
				getCurrencyStyle().clear();
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__PERCENTAGE_STYLE:
				getPercentageStyle().clear();
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__DATE_STYLE:
				getDateStyle().clear();
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__TIME_STYLE:
				getTimeStyle().clear();
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__BOOLEAN_STYLE:
				getBooleanStyle().clear();
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__TEXT_STYLE:
				getTextStyle().clear();
				return;
			case OfficePackage.AUTOMATIC_STYLES_TYPE__PAGE_LAYOUT:
				getPageLayout().clear();
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
			case OfficePackage.AUTOMATIC_STYLES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__STYLE:
				return !getStyle().isEmpty();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__LIST_STYLE:
				return !getListStyle().isEmpty();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__NUMBER_STYLE:
				return !getNumberStyle().isEmpty();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__CURRENCY_STYLE:
				return !getCurrencyStyle().isEmpty();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__PERCENTAGE_STYLE:
				return !getPercentageStyle().isEmpty();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__DATE_STYLE:
				return !getDateStyle().isEmpty();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__TIME_STYLE:
				return !getTimeStyle().isEmpty();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__BOOLEAN_STYLE:
				return !getBooleanStyle().isEmpty();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__TEXT_STYLE:
				return !getTextStyle().isEmpty();
			case OfficePackage.AUTOMATIC_STYLES_TYPE__PAGE_LAYOUT:
				return !getPageLayout().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //AutomaticStylesTypeImpl
