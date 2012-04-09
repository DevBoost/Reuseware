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

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.text.HType;
import org.oasisopen.names.tc.opendocument.xmlns.text.NumberedParagraphType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numbered Paragraph Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.NumberedParagraphTypeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.NumberedParagraphTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.NumberedParagraphTypeImpl#getH <em>H</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.NumberedParagraphTypeImpl#getContinueNumbering <em>Continue Numbering</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.NumberedParagraphTypeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.NumberedParagraphTypeImpl#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.NumberedParagraphTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberedParagraphTypeImpl extends EObjectImpl implements NumberedParagraphType {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected PType p;

	/**
	 * The cached value of the '{@link #getH() <em>H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected HType h;

	/**
	 * The default value of the '{@link #getContinueNumbering() <em>Continue Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinueNumbering()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean CONTINUE_NUMBERING_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getContinueNumbering() <em>Continue Numbering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinueNumbering()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean continueNumbering = CONTINUE_NUMBERING_EDEFAULT;

	/**
	 * This is true if the Continue Numbering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean continueNumberingESet;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LEVEL_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger level = LEVEL_EDEFAULT;

	/**
	 * This is true if the Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean levelESet;

	/**
	 * The default value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startValue = START_VALUE_EDEFAULT;

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
	protected NumberedParagraphTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getNumberedParagraphType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.NUMBERED_PARAGRAPH_TYPE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PType getP() {
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP(PType newP, NotificationChain msgs) {
		PType oldP = p;
		p = newP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.NUMBERED_PARAGRAPH_TYPE__P, oldP, newP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP(PType newP) {
		if (newP != p) {
			NotificationChain msgs = null;
			if (p != null)
				msgs = ((InternalEObject)p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.NUMBERED_PARAGRAPH_TYPE__P, null, msgs);
			if (newP != null)
				msgs = ((InternalEObject)newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.NUMBERED_PARAGRAPH_TYPE__P, null, msgs);
			msgs = basicSetP(newP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.NUMBERED_PARAGRAPH_TYPE__P, newP, newP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HType getH() {
		return h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH(HType newH, NotificationChain msgs) {
		HType oldH = h;
		h = newH;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.NUMBERED_PARAGRAPH_TYPE__H, oldH, newH);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setH(HType newH) {
		if (newH != h) {
			NotificationChain msgs = null;
			if (h != null)
				msgs = ((InternalEObject)h).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.NUMBERED_PARAGRAPH_TYPE__H, null, msgs);
			if (newH != null)
				msgs = ((InternalEObject)newH).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.NUMBERED_PARAGRAPH_TYPE__H, null, msgs);
			msgs = basicSetH(newH, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.NUMBERED_PARAGRAPH_TYPE__H, newH, newH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getContinueNumbering() {
		return continueNumbering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinueNumbering(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newContinueNumbering) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldContinueNumbering = continueNumbering;
		continueNumbering = newContinueNumbering == null ? CONTINUE_NUMBERING_EDEFAULT : newContinueNumbering;
		boolean oldContinueNumberingESet = continueNumberingESet;
		continueNumberingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.NUMBERED_PARAGRAPH_TYPE__CONTINUE_NUMBERING, oldContinueNumbering, continueNumbering, !oldContinueNumberingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContinueNumbering() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldContinueNumbering = continueNumbering;
		boolean oldContinueNumberingESet = continueNumberingESet;
		continueNumbering = CONTINUE_NUMBERING_EDEFAULT;
		continueNumberingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.NUMBERED_PARAGRAPH_TYPE__CONTINUE_NUMBERING, oldContinueNumbering, CONTINUE_NUMBERING_EDEFAULT, oldContinueNumberingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContinueNumbering() {
		return continueNumberingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(BigInteger newLevel) {
		BigInteger oldLevel = level;
		level = newLevel;
		boolean oldLevelESet = levelESet;
		levelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.NUMBERED_PARAGRAPH_TYPE__LEVEL, oldLevel, level, !oldLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLevel() {
		BigInteger oldLevel = level;
		boolean oldLevelESet = levelESet;
		level = LEVEL_EDEFAULT;
		levelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.NUMBERED_PARAGRAPH_TYPE__LEVEL, oldLevel, LEVEL_EDEFAULT, oldLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLevel() {
		return levelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartValue() {
		return startValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartValue(BigInteger newStartValue) {
		BigInteger oldStartValue = startValue;
		startValue = newStartValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.NUMBERED_PARAGRAPH_TYPE__START_VALUE, oldStartValue, startValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.NUMBERED_PARAGRAPH_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__P:
				return basicSetP(null, msgs);
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__H:
				return basicSetH(null, msgs);
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
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__NUMBER:
				return getNumber();
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__P:
				return getP();
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__H:
				return getH();
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__CONTINUE_NUMBERING:
				return getContinueNumbering();
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__LEVEL:
				return getLevel();
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__START_VALUE:
				return getStartValue();
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__STYLE_NAME:
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
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__NUMBER:
				setNumber((String)newValue);
				return;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__P:
				setP((PType)newValue);
				return;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__H:
				setH((HType)newValue);
				return;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__CONTINUE_NUMBERING:
				setContinueNumbering((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__LEVEL:
				setLevel((BigInteger)newValue);
				return;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__START_VALUE:
				setStartValue((BigInteger)newValue);
				return;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__STYLE_NAME:
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
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__P:
				setP((PType)null);
				return;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__H:
				setH((HType)null);
				return;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__CONTINUE_NUMBERING:
				unsetContinueNumbering();
				return;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__LEVEL:
				unsetLevel();
				return;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__START_VALUE:
				setStartValue(START_VALUE_EDEFAULT);
				return;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__STYLE_NAME:
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
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__P:
				return p != null;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__H:
				return h != null;
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__CONTINUE_NUMBERING:
				return isSetContinueNumbering();
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__LEVEL:
				return isSetLevel();
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__START_VALUE:
				return START_VALUE_EDEFAULT == null ? startValue != null : !START_VALUE_EDEFAULT.equals(startValue);
			case TextPackage.NUMBERED_PARAGRAPH_TYPE__STYLE_NAME:
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
		result.append(" (number: ");
		result.append(number);
		result.append(", continueNumbering: ");
		if (continueNumberingESet) result.append(continueNumbering); else result.append("<unset>");
		result.append(", level: ");
		if (levelESet) result.append(level); else result.append("<unset>");
		result.append(", startValue: ");
		result.append(startValue);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //NumberedParagraphTypeImpl
