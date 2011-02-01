/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.style.TypeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryTabStopType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Entry Tab Stop Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexEntryTabStopTypeImpl#getLeaderChar <em>Leader Char</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexEntryTabStopTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexEntryTabStopTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexEntryTabStopTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexEntryTabStopTypeImpl extends EObjectImpl implements IndexEntryTabStopType {
	/**
	 * The default value of the '{@link #getLeaderChar() <em>Leader Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderChar()
	 * @generated
	 * @ordered
	 */
	protected static final String LEADER_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeaderChar() <em>Leader Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderChar()
	 * @generated
	 * @ordered
	 */
	protected String leaderChar = LEADER_CHAR_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.RIGHT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

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
	protected IndexEntryTabStopTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getIndexEntryTabStopType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeaderChar() {
		return leaderChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderChar(String newLeaderChar) {
		String oldLeaderChar = leaderChar;
		leaderChar = newLeaderChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__LEADER_CHAR, oldLeaderChar, leaderChar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__POSITION, oldPosition, position));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__LEADER_CHAR:
				return getLeaderChar();
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__POSITION:
				return getPosition();
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__STYLE_NAME:
				return getStyleName();
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__TYPE:
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
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__LEADER_CHAR:
				setLeaderChar((String)newValue);
				return;
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__POSITION:
				setPosition((String)newValue);
				return;
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__TYPE:
				setType((TypeType)newValue);
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
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__LEADER_CHAR:
				setLeaderChar(LEADER_CHAR_EDEFAULT);
				return;
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__TYPE:
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
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__LEADER_CHAR:
				return LEADER_CHAR_EDEFAULT == null ? leaderChar != null : !LEADER_CHAR_EDEFAULT.equals(leaderChar);
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case TextPackage.INDEX_ENTRY_TAB_STOP_TYPE__TYPE:
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
		result.append(" (leaderChar: ");
		result.append(leaderChar);
		result.append(", position: ");
		result.append(position);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IndexEntryTabStopTypeImpl
