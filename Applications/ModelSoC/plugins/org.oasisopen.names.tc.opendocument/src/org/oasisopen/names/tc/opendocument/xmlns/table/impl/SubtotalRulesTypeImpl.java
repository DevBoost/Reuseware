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
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.table.SortGroupsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType;
import org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtotal Rules Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalRulesTypeImpl#getSortGroups <em>Sort Groups</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalRulesTypeImpl#getSubtotalRule <em>Subtotal Rule</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalRulesTypeImpl#getBindStylesToContent <em>Bind Styles To Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalRulesTypeImpl#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.SubtotalRulesTypeImpl#getPageBreaksOnGroupChange <em>Page Breaks On Group Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubtotalRulesTypeImpl extends EObjectImpl implements SubtotalRulesType {
	/**
	 * The cached value of the '{@link #getSortGroups() <em>Sort Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortGroups()
	 * @generated
	 * @ordered
	 */
	protected SortGroupsType sortGroups;

	/**
	 * The cached value of the '{@link #getSubtotalRule() <em>Subtotal Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtotalRule()
	 * @generated
	 * @ordered
	 */
	protected EList<SubtotalRuleType> subtotalRule;

	/**
	 * The default value of the '{@link #getBindStylesToContent() <em>Bind Styles To Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindStylesToContent()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean BIND_STYLES_TO_CONTENT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getBindStylesToContent() <em>Bind Styles To Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindStylesToContent()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean bindStylesToContent = BIND_STYLES_TO_CONTENT_EDEFAULT;

	/**
	 * This is true if the Bind Styles To Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bindStylesToContentESet;

	/**
	 * The default value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CASE_SENSITIVE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean caseSensitive = CASE_SENSITIVE_EDEFAULT;

	/**
	 * This is true if the Case Sensitive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean caseSensitiveESet;

	/**
	 * The default value of the '{@link #getPageBreaksOnGroupChange() <em>Page Breaks On Group Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageBreaksOnGroupChange()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PAGE_BREAKS_ON_GROUP_CHANGE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getPageBreaksOnGroupChange() <em>Page Breaks On Group Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageBreaksOnGroupChange()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean pageBreaksOnGroupChange = PAGE_BREAKS_ON_GROUP_CHANGE_EDEFAULT;

	/**
	 * This is true if the Page Breaks On Group Change attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pageBreaksOnGroupChangeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtotalRulesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getSubtotalRulesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortGroupsType getSortGroups() {
		return sortGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortGroups(SortGroupsType newSortGroups, NotificationChain msgs) {
		SortGroupsType oldSortGroups = sortGroups;
		sortGroups = newSortGroups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.SUBTOTAL_RULES_TYPE__SORT_GROUPS, oldSortGroups, newSortGroups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortGroups(SortGroupsType newSortGroups) {
		if (newSortGroups != sortGroups) {
			NotificationChain msgs = null;
			if (sortGroups != null)
				msgs = ((InternalEObject)sortGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.SUBTOTAL_RULES_TYPE__SORT_GROUPS, null, msgs);
			if (newSortGroups != null)
				msgs = ((InternalEObject)newSortGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.SUBTOTAL_RULES_TYPE__SORT_GROUPS, null, msgs);
			msgs = basicSetSortGroups(newSortGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SUBTOTAL_RULES_TYPE__SORT_GROUPS, newSortGroups, newSortGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubtotalRuleType> getSubtotalRule() {
		if (subtotalRule == null) {
			subtotalRule = new EObjectContainmentEList<SubtotalRuleType>(SubtotalRuleType.class, this, TablePackage.SUBTOTAL_RULES_TYPE__SUBTOTAL_RULE);
		}
		return subtotalRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBindStylesToContent() {
		return bindStylesToContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindStylesToContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newBindStylesToContent) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBindStylesToContent = bindStylesToContent;
		bindStylesToContent = newBindStylesToContent == null ? BIND_STYLES_TO_CONTENT_EDEFAULT : newBindStylesToContent;
		boolean oldBindStylesToContentESet = bindStylesToContentESet;
		bindStylesToContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SUBTOTAL_RULES_TYPE__BIND_STYLES_TO_CONTENT, oldBindStylesToContent, bindStylesToContent, !oldBindStylesToContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBindStylesToContent() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldBindStylesToContent = bindStylesToContent;
		boolean oldBindStylesToContentESet = bindStylesToContentESet;
		bindStylesToContent = BIND_STYLES_TO_CONTENT_EDEFAULT;
		bindStylesToContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.SUBTOTAL_RULES_TYPE__BIND_STYLES_TO_CONTENT, oldBindStylesToContent, BIND_STYLES_TO_CONTENT_EDEFAULT, oldBindStylesToContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBindStylesToContent() {
		return bindStylesToContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCaseSensitive() {
		return caseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseSensitive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCaseSensitive) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCaseSensitive = caseSensitive;
		caseSensitive = newCaseSensitive == null ? CASE_SENSITIVE_EDEFAULT : newCaseSensitive;
		boolean oldCaseSensitiveESet = caseSensitiveESet;
		caseSensitiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SUBTOTAL_RULES_TYPE__CASE_SENSITIVE, oldCaseSensitive, caseSensitive, !oldCaseSensitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCaseSensitive() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCaseSensitive = caseSensitive;
		boolean oldCaseSensitiveESet = caseSensitiveESet;
		caseSensitive = CASE_SENSITIVE_EDEFAULT;
		caseSensitiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.SUBTOTAL_RULES_TYPE__CASE_SENSITIVE, oldCaseSensitive, CASE_SENSITIVE_EDEFAULT, oldCaseSensitiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaseSensitive() {
		return caseSensitiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPageBreaksOnGroupChange() {
		return pageBreaksOnGroupChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageBreaksOnGroupChange(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPageBreaksOnGroupChange) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPageBreaksOnGroupChange = pageBreaksOnGroupChange;
		pageBreaksOnGroupChange = newPageBreaksOnGroupChange == null ? PAGE_BREAKS_ON_GROUP_CHANGE_EDEFAULT : newPageBreaksOnGroupChange;
		boolean oldPageBreaksOnGroupChangeESet = pageBreaksOnGroupChangeESet;
		pageBreaksOnGroupChangeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SUBTOTAL_RULES_TYPE__PAGE_BREAKS_ON_GROUP_CHANGE, oldPageBreaksOnGroupChange, pageBreaksOnGroupChange, !oldPageBreaksOnGroupChangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPageBreaksOnGroupChange() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPageBreaksOnGroupChange = pageBreaksOnGroupChange;
		boolean oldPageBreaksOnGroupChangeESet = pageBreaksOnGroupChangeESet;
		pageBreaksOnGroupChange = PAGE_BREAKS_ON_GROUP_CHANGE_EDEFAULT;
		pageBreaksOnGroupChangeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.SUBTOTAL_RULES_TYPE__PAGE_BREAKS_ON_GROUP_CHANGE, oldPageBreaksOnGroupChange, PAGE_BREAKS_ON_GROUP_CHANGE_EDEFAULT, oldPageBreaksOnGroupChangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPageBreaksOnGroupChange() {
		return pageBreaksOnGroupChangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.SUBTOTAL_RULES_TYPE__SORT_GROUPS:
				return basicSetSortGroups(null, msgs);
			case TablePackage.SUBTOTAL_RULES_TYPE__SUBTOTAL_RULE:
				return ((InternalEList<?>)getSubtotalRule()).basicRemove(otherEnd, msgs);
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
			case TablePackage.SUBTOTAL_RULES_TYPE__SORT_GROUPS:
				return getSortGroups();
			case TablePackage.SUBTOTAL_RULES_TYPE__SUBTOTAL_RULE:
				return getSubtotalRule();
			case TablePackage.SUBTOTAL_RULES_TYPE__BIND_STYLES_TO_CONTENT:
				return getBindStylesToContent();
			case TablePackage.SUBTOTAL_RULES_TYPE__CASE_SENSITIVE:
				return getCaseSensitive();
			case TablePackage.SUBTOTAL_RULES_TYPE__PAGE_BREAKS_ON_GROUP_CHANGE:
				return getPageBreaksOnGroupChange();
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
			case TablePackage.SUBTOTAL_RULES_TYPE__SORT_GROUPS:
				setSortGroups((SortGroupsType)newValue);
				return;
			case TablePackage.SUBTOTAL_RULES_TYPE__SUBTOTAL_RULE:
				getSubtotalRule().clear();
				getSubtotalRule().addAll((Collection<? extends SubtotalRuleType>)newValue);
				return;
			case TablePackage.SUBTOTAL_RULES_TYPE__BIND_STYLES_TO_CONTENT:
				setBindStylesToContent((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.SUBTOTAL_RULES_TYPE__CASE_SENSITIVE:
				setCaseSensitive((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.SUBTOTAL_RULES_TYPE__PAGE_BREAKS_ON_GROUP_CHANGE:
				setPageBreaksOnGroupChange((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TablePackage.SUBTOTAL_RULES_TYPE__SORT_GROUPS:
				setSortGroups((SortGroupsType)null);
				return;
			case TablePackage.SUBTOTAL_RULES_TYPE__SUBTOTAL_RULE:
				getSubtotalRule().clear();
				return;
			case TablePackage.SUBTOTAL_RULES_TYPE__BIND_STYLES_TO_CONTENT:
				unsetBindStylesToContent();
				return;
			case TablePackage.SUBTOTAL_RULES_TYPE__CASE_SENSITIVE:
				unsetCaseSensitive();
				return;
			case TablePackage.SUBTOTAL_RULES_TYPE__PAGE_BREAKS_ON_GROUP_CHANGE:
				unsetPageBreaksOnGroupChange();
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
			case TablePackage.SUBTOTAL_RULES_TYPE__SORT_GROUPS:
				return sortGroups != null;
			case TablePackage.SUBTOTAL_RULES_TYPE__SUBTOTAL_RULE:
				return subtotalRule != null && !subtotalRule.isEmpty();
			case TablePackage.SUBTOTAL_RULES_TYPE__BIND_STYLES_TO_CONTENT:
				return isSetBindStylesToContent();
			case TablePackage.SUBTOTAL_RULES_TYPE__CASE_SENSITIVE:
				return isSetCaseSensitive();
			case TablePackage.SUBTOTAL_RULES_TYPE__PAGE_BREAKS_ON_GROUP_CHANGE:
				return isSetPageBreaksOnGroupChange();
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
		result.append(" (bindStylesToContent: ");
		if (bindStylesToContentESet) result.append(bindStylesToContent); else result.append("<unset>");
		result.append(", caseSensitive: ");
		if (caseSensitiveESet) result.append(caseSensitive); else result.append("<unset>");
		result.append(", pageBreaksOnGroupChange: ");
		if (pageBreaksOnGroupChangeESet) result.append(pageBreaksOnGroupChange); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SubtotalRulesTypeImpl
