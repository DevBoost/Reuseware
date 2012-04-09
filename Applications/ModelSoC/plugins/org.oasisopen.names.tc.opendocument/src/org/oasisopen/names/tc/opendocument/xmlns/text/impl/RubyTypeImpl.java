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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.text.RubyBaseType;
import org.oasisopen.names.tc.opendocument.xmlns.text.RubyTextType;
import org.oasisopen.names.tc.opendocument.xmlns.text.RubyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ruby Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyTypeImpl#getRubyBase <em>Ruby Base</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyTypeImpl#getRubyText <em>Ruby Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.RubyTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RubyTypeImpl extends EObjectImpl implements RubyType {
	/**
	 * The cached value of the '{@link #getRubyBase() <em>Ruby Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubyBase()
	 * @generated
	 * @ordered
	 */
	protected RubyBaseType rubyBase;

	/**
	 * The cached value of the '{@link #getRubyText() <em>Ruby Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubyText()
	 * @generated
	 * @ordered
	 */
	protected RubyTextType rubyText;

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
	protected RubyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getRubyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyBaseType getRubyBase() {
		return rubyBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRubyBase(RubyBaseType newRubyBase, NotificationChain msgs) {
		RubyBaseType oldRubyBase = rubyBase;
		rubyBase = newRubyBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.RUBY_TYPE__RUBY_BASE, oldRubyBase, newRubyBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubyBase(RubyBaseType newRubyBase) {
		if (newRubyBase != rubyBase) {
			NotificationChain msgs = null;
			if (rubyBase != null)
				msgs = ((InternalEObject)rubyBase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.RUBY_TYPE__RUBY_BASE, null, msgs);
			if (newRubyBase != null)
				msgs = ((InternalEObject)newRubyBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.RUBY_TYPE__RUBY_BASE, null, msgs);
			msgs = basicSetRubyBase(newRubyBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.RUBY_TYPE__RUBY_BASE, newRubyBase, newRubyBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyTextType getRubyText() {
		return rubyText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRubyText(RubyTextType newRubyText, NotificationChain msgs) {
		RubyTextType oldRubyText = rubyText;
		rubyText = newRubyText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.RUBY_TYPE__RUBY_TEXT, oldRubyText, newRubyText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubyText(RubyTextType newRubyText) {
		if (newRubyText != rubyText) {
			NotificationChain msgs = null;
			if (rubyText != null)
				msgs = ((InternalEObject)rubyText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.RUBY_TYPE__RUBY_TEXT, null, msgs);
			if (newRubyText != null)
				msgs = ((InternalEObject)newRubyText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.RUBY_TYPE__RUBY_TEXT, null, msgs);
			msgs = basicSetRubyText(newRubyText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.RUBY_TYPE__RUBY_TEXT, newRubyText, newRubyText));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.RUBY_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.RUBY_TYPE__RUBY_BASE:
				return basicSetRubyBase(null, msgs);
			case TextPackage.RUBY_TYPE__RUBY_TEXT:
				return basicSetRubyText(null, msgs);
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
			case TextPackage.RUBY_TYPE__RUBY_BASE:
				return getRubyBase();
			case TextPackage.RUBY_TYPE__RUBY_TEXT:
				return getRubyText();
			case TextPackage.RUBY_TYPE__STYLE_NAME:
				return getStyleName();
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
			case TextPackage.RUBY_TYPE__RUBY_BASE:
				setRubyBase((RubyBaseType)newValue);
				return;
			case TextPackage.RUBY_TYPE__RUBY_TEXT:
				setRubyText((RubyTextType)newValue);
				return;
			case TextPackage.RUBY_TYPE__STYLE_NAME:
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
			case TextPackage.RUBY_TYPE__RUBY_BASE:
				setRubyBase((RubyBaseType)null);
				return;
			case TextPackage.RUBY_TYPE__RUBY_TEXT:
				setRubyText((RubyTextType)null);
				return;
			case TextPackage.RUBY_TYPE__STYLE_NAME:
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
			case TextPackage.RUBY_TYPE__RUBY_BASE:
				return rubyBase != null;
			case TextPackage.RUBY_TYPE__RUBY_TEXT:
				return rubyText != null;
			case TextPackage.RUBY_TYPE__STYLE_NAME:
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
		result.append(" (styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //RubyTypeImpl
