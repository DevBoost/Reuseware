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
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryPageNumberType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntrySpanType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryTabStopType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryTextType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextIllustrationIndexEntryContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Illustration Index Entry Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextIllustrationIndexEntryContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextIllustrationIndexEntryContentImpl#getIndexEntryPageNumber <em>Index Entry Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextIllustrationIndexEntryContentImpl#getIndexEntryText <em>Index Entry Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextIllustrationIndexEntryContentImpl#getIndexEntrySpan <em>Index Entry Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextIllustrationIndexEntryContentImpl#getIndexEntryTabStop <em>Index Entry Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextIllustrationIndexEntryContentImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextIllustrationIndexEntryContentImpl extends EObjectImpl implements TextIllustrationIndexEntryContent {
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
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected String styleName = STYLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextIllustrationIndexEntryContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getTextIllustrationIndexEntryContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntryPageNumberType> getIndexEntryPageNumber() {
		return getGroup().list(TextPackage.eINSTANCE.getTextIllustrationIndexEntryContent_IndexEntryPageNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntryTextType> getIndexEntryText() {
		return getGroup().list(TextPackage.eINSTANCE.getTextIllustrationIndexEntryContent_IndexEntryText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntrySpanType> getIndexEntrySpan() {
		return getGroup().list(TextPackage.eINSTANCE.getTextIllustrationIndexEntryContent_IndexEntrySpan());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntryTabStopType> getIndexEntryTabStop() {
		return getGroup().list(TextPackage.eINSTANCE.getTextIllustrationIndexEntryContent_IndexEntryTabStop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName(String newStyleName) {
		String oldStyleName = styleName;
		styleName = newStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_PAGE_NUMBER:
				return ((InternalEList<?>)getIndexEntryPageNumber()).basicRemove(otherEnd, msgs);
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_TEXT:
				return ((InternalEList<?>)getIndexEntryText()).basicRemove(otherEnd, msgs);
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_SPAN:
				return ((InternalEList<?>)getIndexEntrySpan()).basicRemove(otherEnd, msgs);
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_TAB_STOP:
				return ((InternalEList<?>)getIndexEntryTabStop()).basicRemove(otherEnd, msgs);
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
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_PAGE_NUMBER:
				return getIndexEntryPageNumber();
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_TEXT:
				return getIndexEntryText();
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_SPAN:
				return getIndexEntrySpan();
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_TAB_STOP:
				return getIndexEntryTabStop();
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__STYLE_NAME:
				return getStyleName();
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
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_PAGE_NUMBER:
				getIndexEntryPageNumber().clear();
				getIndexEntryPageNumber().addAll((Collection<? extends IndexEntryPageNumberType>)newValue);
				return;
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_TEXT:
				getIndexEntryText().clear();
				getIndexEntryText().addAll((Collection<? extends IndexEntryTextType>)newValue);
				return;
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_SPAN:
				getIndexEntrySpan().clear();
				getIndexEntrySpan().addAll((Collection<? extends IndexEntrySpanType>)newValue);
				return;
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_TAB_STOP:
				getIndexEntryTabStop().clear();
				getIndexEntryTabStop().addAll((Collection<? extends IndexEntryTabStopType>)newValue);
				return;
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__STYLE_NAME:
				setStyleName((String)newValue);
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
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__GROUP:
				getGroup().clear();
				return;
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_PAGE_NUMBER:
				getIndexEntryPageNumber().clear();
				return;
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_TEXT:
				getIndexEntryText().clear();
				return;
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_SPAN:
				getIndexEntrySpan().clear();
				return;
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_TAB_STOP:
				getIndexEntryTabStop().clear();
				return;
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
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
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__GROUP:
				return group != null && !group.isEmpty();
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_PAGE_NUMBER:
				return !getIndexEntryPageNumber().isEmpty();
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_TEXT:
				return !getIndexEntryText().isEmpty();
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_SPAN:
				return !getIndexEntrySpan().isEmpty();
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__INDEX_ENTRY_TAB_STOP:
				return !getIndexEntryTabStop().isEmpty();
			case TextPackage.TEXT_ILLUSTRATION_INDEX_ENTRY_CONTENT__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
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
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //TextIllustrationIndexEntryContentImpl
