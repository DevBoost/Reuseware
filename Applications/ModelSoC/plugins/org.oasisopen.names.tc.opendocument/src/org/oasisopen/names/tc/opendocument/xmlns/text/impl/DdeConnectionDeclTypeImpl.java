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
import org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dde Connection Decl Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DdeConnectionDeclTypeImpl#getAutomaticUpdate <em>Automatic Update</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DdeConnectionDeclTypeImpl#getDdeApplication <em>Dde Application</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DdeConnectionDeclTypeImpl#getDdeItem <em>Dde Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DdeConnectionDeclTypeImpl#getDdeTopic <em>Dde Topic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.DdeConnectionDeclTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DdeConnectionDeclTypeImpl extends EObjectImpl implements DdeConnectionDeclType {
	/**
	 * The default value of the '{@link #getAutomaticUpdate() <em>Automatic Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTOMATIC_UPDATE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutomaticUpdate() <em>Automatic Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticUpdate()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean automaticUpdate = AUTOMATIC_UPDATE_EDEFAULT;

	/**
	 * This is true if the Automatic Update attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean automaticUpdateESet;

	/**
	 * The default value of the '{@link #getDdeApplication() <em>Dde Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String DDE_APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDdeApplication() <em>Dde Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeApplication()
	 * @generated
	 * @ordered
	 */
	protected String ddeApplication = DDE_APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDdeItem() <em>Dde Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeItem()
	 * @generated
	 * @ordered
	 */
	protected static final String DDE_ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDdeItem() <em>Dde Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeItem()
	 * @generated
	 * @ordered
	 */
	protected String ddeItem = DDE_ITEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDdeTopic() <em>Dde Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String DDE_TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDdeTopic() <em>Dde Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeTopic()
	 * @generated
	 * @ordered
	 */
	protected String ddeTopic = DDE_TOPIC_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdeConnectionDeclTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getDdeConnectionDeclType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticUpdate() {
		return automaticUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutomaticUpdate) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticUpdate = automaticUpdate;
		automaticUpdate = newAutomaticUpdate == null ? AUTOMATIC_UPDATE_EDEFAULT : newAutomaticUpdate;
		boolean oldAutomaticUpdateESet = automaticUpdateESet;
		automaticUpdateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DDE_CONNECTION_DECL_TYPE__AUTOMATIC_UPDATE, oldAutomaticUpdate, automaticUpdate, !oldAutomaticUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutomaticUpdate() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticUpdate = automaticUpdate;
		boolean oldAutomaticUpdateESet = automaticUpdateESet;
		automaticUpdate = AUTOMATIC_UPDATE_EDEFAULT;
		automaticUpdateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.DDE_CONNECTION_DECL_TYPE__AUTOMATIC_UPDATE, oldAutomaticUpdate, AUTOMATIC_UPDATE_EDEFAULT, oldAutomaticUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutomaticUpdate() {
		return automaticUpdateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDdeApplication() {
		return ddeApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeApplication(String newDdeApplication) {
		String oldDdeApplication = ddeApplication;
		ddeApplication = newDdeApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_APPLICATION, oldDdeApplication, ddeApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDdeItem() {
		return ddeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeItem(String newDdeItem) {
		String oldDdeItem = ddeItem;
		ddeItem = newDdeItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_ITEM, oldDdeItem, ddeItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDdeTopic() {
		return ddeTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeTopic(String newDdeTopic) {
		String oldDdeTopic = ddeTopic;
		ddeTopic = newDdeTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_TOPIC, oldDdeTopic, ddeTopic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.DDE_CONNECTION_DECL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextPackage.DDE_CONNECTION_DECL_TYPE__AUTOMATIC_UPDATE:
				return getAutomaticUpdate();
			case TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_APPLICATION:
				return getDdeApplication();
			case TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_ITEM:
				return getDdeItem();
			case TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_TOPIC:
				return getDdeTopic();
			case TextPackage.DDE_CONNECTION_DECL_TYPE__NAME:
				return getName();
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
			case TextPackage.DDE_CONNECTION_DECL_TYPE__AUTOMATIC_UPDATE:
				setAutomaticUpdate((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_APPLICATION:
				setDdeApplication((String)newValue);
				return;
			case TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_ITEM:
				setDdeItem((String)newValue);
				return;
			case TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_TOPIC:
				setDdeTopic((String)newValue);
				return;
			case TextPackage.DDE_CONNECTION_DECL_TYPE__NAME:
				setName((String)newValue);
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
			case TextPackage.DDE_CONNECTION_DECL_TYPE__AUTOMATIC_UPDATE:
				unsetAutomaticUpdate();
				return;
			case TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_APPLICATION:
				setDdeApplication(DDE_APPLICATION_EDEFAULT);
				return;
			case TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_ITEM:
				setDdeItem(DDE_ITEM_EDEFAULT);
				return;
			case TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_TOPIC:
				setDdeTopic(DDE_TOPIC_EDEFAULT);
				return;
			case TextPackage.DDE_CONNECTION_DECL_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case TextPackage.DDE_CONNECTION_DECL_TYPE__AUTOMATIC_UPDATE:
				return isSetAutomaticUpdate();
			case TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_APPLICATION:
				return DDE_APPLICATION_EDEFAULT == null ? ddeApplication != null : !DDE_APPLICATION_EDEFAULT.equals(ddeApplication);
			case TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_ITEM:
				return DDE_ITEM_EDEFAULT == null ? ddeItem != null : !DDE_ITEM_EDEFAULT.equals(ddeItem);
			case TextPackage.DDE_CONNECTION_DECL_TYPE__DDE_TOPIC:
				return DDE_TOPIC_EDEFAULT == null ? ddeTopic != null : !DDE_TOPIC_EDEFAULT.equals(ddeTopic);
			case TextPackage.DDE_CONNECTION_DECL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (automaticUpdate: ");
		if (automaticUpdateESet) result.append(automaticUpdate); else result.append("<unset>");
		result.append(", ddeApplication: ");
		result.append(ddeApplication);
		result.append(", ddeItem: ");
		result.append(ddeItem);
		result.append(", ddeTopic: ");
		result.append(ddeTopic);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DdeConnectionDeclTypeImpl
