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
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TypeType1;
import org.oasisopen.names.tc.opendocument.xmlns.text.LineStyle;
import org.oasisopen.names.tc.opendocument.xmlns.text.LineType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Stop Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopTypeImpl#getChar <em>Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopTypeImpl#getLeaderColor <em>Leader Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopTypeImpl#getLeaderStyle <em>Leader Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopTypeImpl#getLeaderText <em>Leader Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopTypeImpl#getLeaderTextStyle <em>Leader Text Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopTypeImpl#getLeaderType <em>Leader Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopTypeImpl#getLeaderWidth <em>Leader Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.TabStopTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabStopTypeImpl extends EObjectImpl implements TabStopType {
	/**
	 * The default value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected String char_ = CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaderColor() <em>Leader Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderColor()
	 * @generated
	 * @ordered
	 */
	protected static final Object LEADER_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaderColor() <em>Leader Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderColor()
	 * @generated
	 * @ordered
	 */
	protected Object leaderColor = LEADER_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaderStyle() <em>Leader Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderStyle()
	 * @generated
	 * @ordered
	 */
	protected static final LineStyle LEADER_STYLE_EDEFAULT = LineStyle.NONE;

	/**
	 * The cached value of the '{@link #getLeaderStyle() <em>Leader Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyle leaderStyle = LEADER_STYLE_EDEFAULT;

	/**
	 * This is true if the Leader Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leaderStyleESet;

	/**
	 * The default value of the '{@link #getLeaderText() <em>Leader Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderText()
	 * @generated
	 * @ordered
	 */
	protected static final String LEADER_TEXT_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getLeaderText() <em>Leader Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderText()
	 * @generated
	 * @ordered
	 */
	protected String leaderText = LEADER_TEXT_EDEFAULT;

	/**
	 * This is true if the Leader Text attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leaderTextESet;

	/**
	 * The default value of the '{@link #getLeaderTextStyle() <em>Leader Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderTextStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String LEADER_TEXT_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaderTextStyle() <em>Leader Text Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderTextStyle()
	 * @generated
	 * @ordered
	 */
	protected String leaderTextStyle = LEADER_TEXT_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaderType() <em>Leader Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderType()
	 * @generated
	 * @ordered
	 */
	protected static final LineType LEADER_TYPE_EDEFAULT = LineType.NONE;

	/**
	 * The cached value of the '{@link #getLeaderType() <em>Leader Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderType()
	 * @generated
	 * @ordered
	 */
	protected LineType leaderType = LEADER_TYPE_EDEFAULT;

	/**
	 * This is true if the Leader Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leaderTypeESet;

	/**
	 * The default value of the '{@link #getLeaderWidth() <em>Leader Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object LEADER_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaderWidth() <em>Leader Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderWidth()
	 * @generated
	 * @ordered
	 */
	protected Object leaderWidth = LEADER_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected String position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType1 TYPE_EDEFAULT = TypeType1.LEFT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType1 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabStopTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getTabStopType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChar(String newChar) {
		String oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.TAB_STOP_TYPE__CHAR, oldChar, char_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLeaderColor() {
		return leaderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderColor(Object newLeaderColor) {
		Object oldLeaderColor = leaderColor;
		leaderColor = newLeaderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.TAB_STOP_TYPE__LEADER_COLOR, oldLeaderColor, leaderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyle getLeaderStyle() {
		return leaderStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderStyle(LineStyle newLeaderStyle) {
		LineStyle oldLeaderStyle = leaderStyle;
		leaderStyle = newLeaderStyle == null ? LEADER_STYLE_EDEFAULT : newLeaderStyle;
		boolean oldLeaderStyleESet = leaderStyleESet;
		leaderStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.TAB_STOP_TYPE__LEADER_STYLE, oldLeaderStyle, leaderStyle, !oldLeaderStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLeaderStyle() {
		LineStyle oldLeaderStyle = leaderStyle;
		boolean oldLeaderStyleESet = leaderStyleESet;
		leaderStyle = LEADER_STYLE_EDEFAULT;
		leaderStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.TAB_STOP_TYPE__LEADER_STYLE, oldLeaderStyle, LEADER_STYLE_EDEFAULT, oldLeaderStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLeaderStyle() {
		return leaderStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeaderText() {
		return leaderText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderText(String newLeaderText) {
		String oldLeaderText = leaderText;
		leaderText = newLeaderText;
		boolean oldLeaderTextESet = leaderTextESet;
		leaderTextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.TAB_STOP_TYPE__LEADER_TEXT, oldLeaderText, leaderText, !oldLeaderTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLeaderText() {
		String oldLeaderText = leaderText;
		boolean oldLeaderTextESet = leaderTextESet;
		leaderText = LEADER_TEXT_EDEFAULT;
		leaderTextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.TAB_STOP_TYPE__LEADER_TEXT, oldLeaderText, LEADER_TEXT_EDEFAULT, oldLeaderTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLeaderText() {
		return leaderTextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeaderTextStyle() {
		return leaderTextStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderTextStyle(String newLeaderTextStyle) {
		String oldLeaderTextStyle = leaderTextStyle;
		leaderTextStyle = newLeaderTextStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.TAB_STOP_TYPE__LEADER_TEXT_STYLE, oldLeaderTextStyle, leaderTextStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType getLeaderType() {
		return leaderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderType(LineType newLeaderType) {
		LineType oldLeaderType = leaderType;
		leaderType = newLeaderType == null ? LEADER_TYPE_EDEFAULT : newLeaderType;
		boolean oldLeaderTypeESet = leaderTypeESet;
		leaderTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.TAB_STOP_TYPE__LEADER_TYPE, oldLeaderType, leaderType, !oldLeaderTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLeaderType() {
		LineType oldLeaderType = leaderType;
		boolean oldLeaderTypeESet = leaderTypeESet;
		leaderType = LEADER_TYPE_EDEFAULT;
		leaderTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.TAB_STOP_TYPE__LEADER_TYPE, oldLeaderType, LEADER_TYPE_EDEFAULT, oldLeaderTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLeaderType() {
		return leaderTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLeaderWidth() {
		return leaderWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderWidth(Object newLeaderWidth) {
		Object oldLeaderWidth = leaderWidth;
		leaderWidth = newLeaderWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.TAB_STOP_TYPE__LEADER_WIDTH, oldLeaderWidth, leaderWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(String newPosition) {
		String oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.TAB_STOP_TYPE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType1 newType) {
		TypeType1 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.TAB_STOP_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType1 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.TAB_STOP_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StylePackage.TAB_STOP_TYPE__CHAR:
				return getChar();
			case StylePackage.TAB_STOP_TYPE__LEADER_COLOR:
				return getLeaderColor();
			case StylePackage.TAB_STOP_TYPE__LEADER_STYLE:
				return getLeaderStyle();
			case StylePackage.TAB_STOP_TYPE__LEADER_TEXT:
				return getLeaderText();
			case StylePackage.TAB_STOP_TYPE__LEADER_TEXT_STYLE:
				return getLeaderTextStyle();
			case StylePackage.TAB_STOP_TYPE__LEADER_TYPE:
				return getLeaderType();
			case StylePackage.TAB_STOP_TYPE__LEADER_WIDTH:
				return getLeaderWidth();
			case StylePackage.TAB_STOP_TYPE__POSITION:
				return getPosition();
			case StylePackage.TAB_STOP_TYPE__TYPE:
				return getType();
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
			case StylePackage.TAB_STOP_TYPE__CHAR:
				setChar((String)newValue);
				return;
			case StylePackage.TAB_STOP_TYPE__LEADER_COLOR:
				setLeaderColor(newValue);
				return;
			case StylePackage.TAB_STOP_TYPE__LEADER_STYLE:
				setLeaderStyle((LineStyle)newValue);
				return;
			case StylePackage.TAB_STOP_TYPE__LEADER_TEXT:
				setLeaderText((String)newValue);
				return;
			case StylePackage.TAB_STOP_TYPE__LEADER_TEXT_STYLE:
				setLeaderTextStyle((String)newValue);
				return;
			case StylePackage.TAB_STOP_TYPE__LEADER_TYPE:
				setLeaderType((LineType)newValue);
				return;
			case StylePackage.TAB_STOP_TYPE__LEADER_WIDTH:
				setLeaderWidth(newValue);
				return;
			case StylePackage.TAB_STOP_TYPE__POSITION:
				setPosition((String)newValue);
				return;
			case StylePackage.TAB_STOP_TYPE__TYPE:
				setType((TypeType1)newValue);
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
			case StylePackage.TAB_STOP_TYPE__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case StylePackage.TAB_STOP_TYPE__LEADER_COLOR:
				setLeaderColor(LEADER_COLOR_EDEFAULT);
				return;
			case StylePackage.TAB_STOP_TYPE__LEADER_STYLE:
				unsetLeaderStyle();
				return;
			case StylePackage.TAB_STOP_TYPE__LEADER_TEXT:
				unsetLeaderText();
				return;
			case StylePackage.TAB_STOP_TYPE__LEADER_TEXT_STYLE:
				setLeaderTextStyle(LEADER_TEXT_STYLE_EDEFAULT);
				return;
			case StylePackage.TAB_STOP_TYPE__LEADER_TYPE:
				unsetLeaderType();
				return;
			case StylePackage.TAB_STOP_TYPE__LEADER_WIDTH:
				setLeaderWidth(LEADER_WIDTH_EDEFAULT);
				return;
			case StylePackage.TAB_STOP_TYPE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case StylePackage.TAB_STOP_TYPE__TYPE:
				unsetType();
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
			case StylePackage.TAB_STOP_TYPE__CHAR:
				return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
			case StylePackage.TAB_STOP_TYPE__LEADER_COLOR:
				return LEADER_COLOR_EDEFAULT == null ? leaderColor != null : !LEADER_COLOR_EDEFAULT.equals(leaderColor);
			case StylePackage.TAB_STOP_TYPE__LEADER_STYLE:
				return isSetLeaderStyle();
			case StylePackage.TAB_STOP_TYPE__LEADER_TEXT:
				return isSetLeaderText();
			case StylePackage.TAB_STOP_TYPE__LEADER_TEXT_STYLE:
				return LEADER_TEXT_STYLE_EDEFAULT == null ? leaderTextStyle != null : !LEADER_TEXT_STYLE_EDEFAULT.equals(leaderTextStyle);
			case StylePackage.TAB_STOP_TYPE__LEADER_TYPE:
				return isSetLeaderType();
			case StylePackage.TAB_STOP_TYPE__LEADER_WIDTH:
				return LEADER_WIDTH_EDEFAULT == null ? leaderWidth != null : !LEADER_WIDTH_EDEFAULT.equals(leaderWidth);
			case StylePackage.TAB_STOP_TYPE__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case StylePackage.TAB_STOP_TYPE__TYPE:
				return isSetType();
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
		result.append(" (char: ");
		result.append(char_);
		result.append(", leaderColor: ");
		result.append(leaderColor);
		result.append(", leaderStyle: ");
		if (leaderStyleESet) result.append(leaderStyle); else result.append("<unset>");
		result.append(", leaderText: ");
		if (leaderTextESet) result.append(leaderText); else result.append("<unset>");
		result.append(", leaderTextStyle: ");
		result.append(leaderTextStyle);
		result.append(", leaderType: ");
		if (leaderTypeESet) result.append(leaderType); else result.append("<unset>");
		result.append(", leaderWidth: ");
		result.append(leaderWidth);
		result.append(", position: ");
		result.append(position);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TabStopTypeImpl
