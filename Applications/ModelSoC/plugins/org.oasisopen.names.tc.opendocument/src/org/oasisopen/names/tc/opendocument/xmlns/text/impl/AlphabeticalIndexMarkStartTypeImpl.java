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
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexMarkStartType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alphabetical Index Mark Start Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexMarkStartTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexMarkStartTypeImpl#getKey1 <em>Key1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexMarkStartTypeImpl#getKey1Phonetic <em>Key1 Phonetic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexMarkStartTypeImpl#getKey2 <em>Key2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexMarkStartTypeImpl#getKey2Phonetic <em>Key2 Phonetic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexMarkStartTypeImpl#getMainEntry <em>Main Entry</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexMarkStartTypeImpl#getStringValuePhonetic <em>String Value Phonetic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlphabeticalIndexMarkStartTypeImpl extends EObjectImpl implements AlphabeticalIndexMarkStartType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey1() <em>Key1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey1()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey1() <em>Key1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey1()
	 * @generated
	 * @ordered
	 */
	protected String key1 = KEY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey1Phonetic() <em>Key1 Phonetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey1Phonetic()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY1_PHONETIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey1Phonetic() <em>Key1 Phonetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey1Phonetic()
	 * @generated
	 * @ordered
	 */
	protected String key1Phonetic = KEY1_PHONETIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey2() <em>Key2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey2()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey2() <em>Key2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey2()
	 * @generated
	 * @ordered
	 */
	protected String key2 = KEY2_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey2Phonetic() <em>Key2 Phonetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey2Phonetic()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY2_PHONETIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey2Phonetic() <em>Key2 Phonetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey2Phonetic()
	 * @generated
	 * @ordered
	 */
	protected String key2Phonetic = KEY2_PHONETIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainEntry() <em>Main Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainEntry()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MAIN_ENTRY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMainEntry() <em>Main Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainEntry()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean mainEntry = MAIN_ENTRY_EDEFAULT;

	/**
	 * This is true if the Main Entry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mainEntryESet;

	/**
	 * The default value of the '{@link #getStringValuePhonetic() <em>String Value Phonetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValuePhonetic()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_PHONETIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringValuePhonetic() <em>String Value Phonetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValuePhonetic()
	 * @generated
	 * @ordered
	 */
	protected String stringValuePhonetic = STRING_VALUE_PHONETIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlphabeticalIndexMarkStartTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getAlphabeticalIndexMarkStartType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey1() {
		return key1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey1(String newKey1) {
		String oldKey1 = key1;
		key1 = newKey1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY1, oldKey1, key1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey1Phonetic() {
		return key1Phonetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey1Phonetic(String newKey1Phonetic) {
		String oldKey1Phonetic = key1Phonetic;
		key1Phonetic = newKey1Phonetic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY1_PHONETIC, oldKey1Phonetic, key1Phonetic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey2() {
		return key2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey2(String newKey2) {
		String oldKey2 = key2;
		key2 = newKey2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY2, oldKey2, key2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey2Phonetic() {
		return key2Phonetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey2Phonetic(String newKey2Phonetic) {
		String oldKey2Phonetic = key2Phonetic;
		key2Phonetic = newKey2Phonetic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY2_PHONETIC, oldKey2Phonetic, key2Phonetic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMainEntry() {
		return mainEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainEntry(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMainEntry) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMainEntry = mainEntry;
		mainEntry = newMainEntry == null ? MAIN_ENTRY_EDEFAULT : newMainEntry;
		boolean oldMainEntryESet = mainEntryESet;
		mainEntryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__MAIN_ENTRY, oldMainEntry, mainEntry, !oldMainEntryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMainEntry() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMainEntry = mainEntry;
		boolean oldMainEntryESet = mainEntryESet;
		mainEntry = MAIN_ENTRY_EDEFAULT;
		mainEntryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__MAIN_ENTRY, oldMainEntry, MAIN_ENTRY_EDEFAULT, oldMainEntryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMainEntry() {
		return mainEntryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringValuePhonetic() {
		return stringValuePhonetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValuePhonetic(String newStringValuePhonetic) {
		String oldStringValuePhonetic = stringValuePhonetic;
		stringValuePhonetic = newStringValuePhonetic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__STRING_VALUE_PHONETIC, oldStringValuePhonetic, stringValuePhonetic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__ID:
				return getId();
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY1:
				return getKey1();
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY1_PHONETIC:
				return getKey1Phonetic();
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY2:
				return getKey2();
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY2_PHONETIC:
				return getKey2Phonetic();
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__MAIN_ENTRY:
				return getMainEntry();
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__STRING_VALUE_PHONETIC:
				return getStringValuePhonetic();
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
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__ID:
				setId((String)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY1:
				setKey1((String)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY1_PHONETIC:
				setKey1Phonetic((String)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY2:
				setKey2((String)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY2_PHONETIC:
				setKey2Phonetic((String)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__MAIN_ENTRY:
				setMainEntry((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__STRING_VALUE_PHONETIC:
				setStringValuePhonetic((String)newValue);
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
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY1:
				setKey1(KEY1_EDEFAULT);
				return;
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY1_PHONETIC:
				setKey1Phonetic(KEY1_PHONETIC_EDEFAULT);
				return;
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY2:
				setKey2(KEY2_EDEFAULT);
				return;
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY2_PHONETIC:
				setKey2Phonetic(KEY2_PHONETIC_EDEFAULT);
				return;
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__MAIN_ENTRY:
				unsetMainEntry();
				return;
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__STRING_VALUE_PHONETIC:
				setStringValuePhonetic(STRING_VALUE_PHONETIC_EDEFAULT);
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
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY1:
				return KEY1_EDEFAULT == null ? key1 != null : !KEY1_EDEFAULT.equals(key1);
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY1_PHONETIC:
				return KEY1_PHONETIC_EDEFAULT == null ? key1Phonetic != null : !KEY1_PHONETIC_EDEFAULT.equals(key1Phonetic);
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY2:
				return KEY2_EDEFAULT == null ? key2 != null : !KEY2_EDEFAULT.equals(key2);
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__KEY2_PHONETIC:
				return KEY2_PHONETIC_EDEFAULT == null ? key2Phonetic != null : !KEY2_PHONETIC_EDEFAULT.equals(key2Phonetic);
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__MAIN_ENTRY:
				return isSetMainEntry();
			case TextPackage.ALPHABETICAL_INDEX_MARK_START_TYPE__STRING_VALUE_PHONETIC:
				return STRING_VALUE_PHONETIC_EDEFAULT == null ? stringValuePhonetic != null : !STRING_VALUE_PHONETIC_EDEFAULT.equals(stringValuePhonetic);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", key1: ");
		result.append(key1);
		result.append(", key1Phonetic: ");
		result.append(key1Phonetic);
		result.append(", key2: ");
		result.append(key2);
		result.append(", key2Phonetic: ");
		result.append(key2Phonetic);
		result.append(", mainEntry: ");
		if (mainEntryESet) result.append(mainEntry); else result.append("<unset>");
		result.append(", stringValuePhonetic: ");
		result.append(stringValuePhonetic);
		result.append(')');
		return result.toString();
	}

} //AlphabeticalIndexMarkStartTypeImpl
