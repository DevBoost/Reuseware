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
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexBodyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alphabetical Index Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexTypeImpl#getAlphabeticalIndexSource <em>Alphabetical Index Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexTypeImpl#getIndexBody <em>Index Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexTypeImpl#getProtected <em>Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexTypeImpl#getProtectionKey <em>Protection Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlphabeticalIndexTypeImpl extends EObjectImpl implements AlphabeticalIndexType {
	/**
	 * The cached value of the '{@link #getAlphabeticalIndexSource() <em>Alphabetical Index Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabeticalIndexSource()
	 * @generated
	 * @ordered
	 */
	protected AlphabeticalIndexSourceType alphabeticalIndexSource;

	/**
	 * The cached value of the '{@link #getIndexBody() <em>Index Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexBody()
	 * @generated
	 * @ordered
	 */
	protected IndexBodyType indexBody;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PROTECTED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean protected_ = PROTECTED_EDEFAULT;

	/**
	 * This is true if the Protected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protectedESet;

	/**
	 * The default value of the '{@link #getProtectionKey() <em>Protection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTECTION_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtectionKey() <em>Protection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionKey()
	 * @generated
	 * @ordered
	 */
	protected String protectionKey = PROTECTION_KEY_EDEFAULT;

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
	protected AlphabeticalIndexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getAlphabeticalIndexType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexSourceType getAlphabeticalIndexSource() {
		return alphabeticalIndexSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexSource(AlphabeticalIndexSourceType newAlphabeticalIndexSource, NotificationChain msgs) {
		AlphabeticalIndexSourceType oldAlphabeticalIndexSource = alphabeticalIndexSource;
		alphabeticalIndexSource = newAlphabeticalIndexSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_TYPE__ALPHABETICAL_INDEX_SOURCE, oldAlphabeticalIndexSource, newAlphabeticalIndexSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexSource(AlphabeticalIndexSourceType newAlphabeticalIndexSource) {
		if (newAlphabeticalIndexSource != alphabeticalIndexSource) {
			NotificationChain msgs = null;
			if (alphabeticalIndexSource != null)
				msgs = ((InternalEObject)alphabeticalIndexSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.ALPHABETICAL_INDEX_TYPE__ALPHABETICAL_INDEX_SOURCE, null, msgs);
			if (newAlphabeticalIndexSource != null)
				msgs = ((InternalEObject)newAlphabeticalIndexSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.ALPHABETICAL_INDEX_TYPE__ALPHABETICAL_INDEX_SOURCE, null, msgs);
			msgs = basicSetAlphabeticalIndexSource(newAlphabeticalIndexSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_TYPE__ALPHABETICAL_INDEX_SOURCE, newAlphabeticalIndexSource, newAlphabeticalIndexSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexBodyType getIndexBody() {
		return indexBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexBody(IndexBodyType newIndexBody, NotificationChain msgs) {
		IndexBodyType oldIndexBody = indexBody;
		indexBody = newIndexBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_TYPE__INDEX_BODY, oldIndexBody, newIndexBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexBody(IndexBodyType newIndexBody) {
		if (newIndexBody != indexBody) {
			NotificationChain msgs = null;
			if (indexBody != null)
				msgs = ((InternalEObject)indexBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.ALPHABETICAL_INDEX_TYPE__INDEX_BODY, null, msgs);
			if (newIndexBody != null)
				msgs = ((InternalEObject)newIndexBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.ALPHABETICAL_INDEX_TYPE__INDEX_BODY, null, msgs);
			msgs = basicSetIndexBody(newIndexBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_TYPE__INDEX_BODY, newIndexBody, newIndexBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtected() {
		return protected_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newProtected) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtected = protected_;
		protected_ = newProtected == null ? PROTECTED_EDEFAULT : newProtected;
		boolean oldProtectedESet = protectedESet;
		protectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_TYPE__PROTECTED, oldProtected, protected_, !oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtected() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtected = protected_;
		boolean oldProtectedESet = protectedESet;
		protected_ = PROTECTED_EDEFAULT;
		protectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_TYPE__PROTECTED, oldProtected, PROTECTED_EDEFAULT, oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtected() {
		return protectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtectionKey() {
		return protectionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectionKey(String newProtectionKey) {
		String oldProtectionKey = protectionKey;
		protectionKey = newProtectionKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_TYPE__PROTECTION_KEY, oldProtectionKey, protectionKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.ALPHABETICAL_INDEX_TYPE__ALPHABETICAL_INDEX_SOURCE:
				return basicSetAlphabeticalIndexSource(null, msgs);
			case TextPackage.ALPHABETICAL_INDEX_TYPE__INDEX_BODY:
				return basicSetIndexBody(null, msgs);
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
			case TextPackage.ALPHABETICAL_INDEX_TYPE__ALPHABETICAL_INDEX_SOURCE:
				return getAlphabeticalIndexSource();
			case TextPackage.ALPHABETICAL_INDEX_TYPE__INDEX_BODY:
				return getIndexBody();
			case TextPackage.ALPHABETICAL_INDEX_TYPE__NAME:
				return getName();
			case TextPackage.ALPHABETICAL_INDEX_TYPE__PROTECTED:
				return getProtected();
			case TextPackage.ALPHABETICAL_INDEX_TYPE__PROTECTION_KEY:
				return getProtectionKey();
			case TextPackage.ALPHABETICAL_INDEX_TYPE__STYLE_NAME:
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
			case TextPackage.ALPHABETICAL_INDEX_TYPE__ALPHABETICAL_INDEX_SOURCE:
				setAlphabeticalIndexSource((AlphabeticalIndexSourceType)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_TYPE__INDEX_BODY:
				setIndexBody((IndexBodyType)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_TYPE__NAME:
				setName((String)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_TYPE__PROTECTED:
				setProtected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_TYPE__PROTECTION_KEY:
				setProtectionKey((String)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_TYPE__STYLE_NAME:
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
			case TextPackage.ALPHABETICAL_INDEX_TYPE__ALPHABETICAL_INDEX_SOURCE:
				setAlphabeticalIndexSource((AlphabeticalIndexSourceType)null);
				return;
			case TextPackage.ALPHABETICAL_INDEX_TYPE__INDEX_BODY:
				setIndexBody((IndexBodyType)null);
				return;
			case TextPackage.ALPHABETICAL_INDEX_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TextPackage.ALPHABETICAL_INDEX_TYPE__PROTECTED:
				unsetProtected();
				return;
			case TextPackage.ALPHABETICAL_INDEX_TYPE__PROTECTION_KEY:
				setProtectionKey(PROTECTION_KEY_EDEFAULT);
				return;
			case TextPackage.ALPHABETICAL_INDEX_TYPE__STYLE_NAME:
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
			case TextPackage.ALPHABETICAL_INDEX_TYPE__ALPHABETICAL_INDEX_SOURCE:
				return alphabeticalIndexSource != null;
			case TextPackage.ALPHABETICAL_INDEX_TYPE__INDEX_BODY:
				return indexBody != null;
			case TextPackage.ALPHABETICAL_INDEX_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TextPackage.ALPHABETICAL_INDEX_TYPE__PROTECTED:
				return isSetProtected();
			case TextPackage.ALPHABETICAL_INDEX_TYPE__PROTECTION_KEY:
				return PROTECTION_KEY_EDEFAULT == null ? protectionKey != null : !PROTECTION_KEY_EDEFAULT.equals(protectionKey);
			case TextPackage.ALPHABETICAL_INDEX_TYPE__STYLE_NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", protected: ");
		if (protectedESet) result.append(protected_); else result.append("<unset>");
		result.append(", protectionKey: ");
		result.append(protectionKey);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //AlphabeticalIndexTypeImpl
