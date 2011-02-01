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
import org.oasisopen.names.tc.opendocument.xmlns.table.ErrorMessageType;
import org.oasisopen.names.tc.opendocument.xmlns.table.MessageTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ErrorMessageTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ErrorMessageTypeImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ErrorMessageTypeImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ErrorMessageTypeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorMessageTypeImpl extends EObjectImpl implements ErrorMessageType {
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected EList<PType> p;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean display = DISPLAY_EDEFAULT;

	/**
	 * This is true if the Display attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayESet;

	/**
	 * The default value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected static final MessageTypeType MESSAGE_TYPE_EDEFAULT = MessageTypeType.STOP;

	/**
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected MessageTypeType messageType = MESSAGE_TYPE_EDEFAULT;

	/**
	 * This is true if the Message Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageTypeESet;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorMessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getErrorMessageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		if (p == null) {
			p = new EObjectContainmentEList<PType>(PType.class, this, TablePackage.ERROR_MESSAGE_TYPE__P);
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplay) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplay = display;
		display = newDisplay == null ? DISPLAY_EDEFAULT : newDisplay;
		boolean oldDisplayESet = displayESet;
		displayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.ERROR_MESSAGE_TYPE__DISPLAY, oldDisplay, display, !oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplay() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplay = display;
		boolean oldDisplayESet = displayESet;
		display = DISPLAY_EDEFAULT;
		displayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.ERROR_MESSAGE_TYPE__DISPLAY, oldDisplay, DISPLAY_EDEFAULT, oldDisplayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplay() {
		return displayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeType getMessageType() {
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageType(MessageTypeType newMessageType) {
		MessageTypeType oldMessageType = messageType;
		messageType = newMessageType == null ? MESSAGE_TYPE_EDEFAULT : newMessageType;
		boolean oldMessageTypeESet = messageTypeESet;
		messageTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.ERROR_MESSAGE_TYPE__MESSAGE_TYPE, oldMessageType, messageType, !oldMessageTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessageType() {
		MessageTypeType oldMessageType = messageType;
		boolean oldMessageTypeESet = messageTypeESet;
		messageType = MESSAGE_TYPE_EDEFAULT;
		messageTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.ERROR_MESSAGE_TYPE__MESSAGE_TYPE, oldMessageType, MESSAGE_TYPE_EDEFAULT, oldMessageTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessageType() {
		return messageTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.ERROR_MESSAGE_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.ERROR_MESSAGE_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
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
			case TablePackage.ERROR_MESSAGE_TYPE__P:
				return getP();
			case TablePackage.ERROR_MESSAGE_TYPE__DISPLAY:
				return getDisplay();
			case TablePackage.ERROR_MESSAGE_TYPE__MESSAGE_TYPE:
				return getMessageType();
			case TablePackage.ERROR_MESSAGE_TYPE__TITLE:
				return getTitle();
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
			case TablePackage.ERROR_MESSAGE_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case TablePackage.ERROR_MESSAGE_TYPE__DISPLAY:
				setDisplay((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.ERROR_MESSAGE_TYPE__MESSAGE_TYPE:
				setMessageType((MessageTypeType)newValue);
				return;
			case TablePackage.ERROR_MESSAGE_TYPE__TITLE:
				setTitle((String)newValue);
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
			case TablePackage.ERROR_MESSAGE_TYPE__P:
				getP().clear();
				return;
			case TablePackage.ERROR_MESSAGE_TYPE__DISPLAY:
				unsetDisplay();
				return;
			case TablePackage.ERROR_MESSAGE_TYPE__MESSAGE_TYPE:
				unsetMessageType();
				return;
			case TablePackage.ERROR_MESSAGE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case TablePackage.ERROR_MESSAGE_TYPE__P:
				return p != null && !p.isEmpty();
			case TablePackage.ERROR_MESSAGE_TYPE__DISPLAY:
				return isSetDisplay();
			case TablePackage.ERROR_MESSAGE_TYPE__MESSAGE_TYPE:
				return isSetMessageType();
			case TablePackage.ERROR_MESSAGE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (display: ");
		if (displayESet) result.append(display); else result.append("<unset>");
		result.append(", messageType: ");
		if (messageTypeESet) result.append(messageType); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ErrorMessageTypeImpl
