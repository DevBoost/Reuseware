/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.script.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType;
import org.oasisopen.names.tc.opendocument.xmlns.script.ScriptPackage;
import org.w3.xlink.ActuateType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Listener Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.script.impl.EventListenerTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.script.impl.EventListenerTypeImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.script.impl.EventListenerTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.script.impl.EventListenerTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.script.impl.EventListenerTypeImpl#getMacroName <em>Macro Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.script.impl.EventListenerTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventListenerTypeImpl extends EObjectImpl implements EventListenerType {
	/**
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType1 ACTUATE_EDEFAULT = ActuateType1.ON_REQUEST;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType1 actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected String eventName = EVENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMacroName() <em>Macro Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacroName()
	 * @generated
	 * @ordered
	 */
	protected static final String MACRO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMacroName() <em>Macro Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacroName()
	 * @generated
	 * @ordered
	 */
	protected String macroName = MACRO_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.SIMPLE;

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
	protected EventListenerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScriptPackage.Literals.EVENT_LISTENER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType1 getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuate(ActuateType1 newActuate) {
		ActuateType1 oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.EVENT_LISTENER_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActuate() {
		ActuateType1 oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ScriptPackage.EVENT_LISTENER_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventName(String newEventName) {
		String oldEventName = eventName;
		eventName = newEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.EVENT_LISTENER_TYPE__EVENT_NAME, oldEventName, eventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.EVENT_LISTENER_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.EVENT_LISTENER_TYPE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMacroName() {
		return macroName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacroName(String newMacroName) {
		String oldMacroName = macroName;
		macroName = newMacroName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.EVENT_LISTENER_TYPE__MACRO_NAME, oldMacroName, macroName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.EVENT_LISTENER_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ScriptPackage.EVENT_LISTENER_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case ScriptPackage.EVENT_LISTENER_TYPE__ACTUATE:
				return getActuate();
			case ScriptPackage.EVENT_LISTENER_TYPE__EVENT_NAME:
				return getEventName();
			case ScriptPackage.EVENT_LISTENER_TYPE__HREF:
				return getHref();
			case ScriptPackage.EVENT_LISTENER_TYPE__LANGUAGE:
				return getLanguage();
			case ScriptPackage.EVENT_LISTENER_TYPE__MACRO_NAME:
				return getMacroName();
			case ScriptPackage.EVENT_LISTENER_TYPE__TYPE:
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
			case ScriptPackage.EVENT_LISTENER_TYPE__ACTUATE:
				setActuate((ActuateType1)newValue);
				return;
			case ScriptPackage.EVENT_LISTENER_TYPE__EVENT_NAME:
				setEventName((String)newValue);
				return;
			case ScriptPackage.EVENT_LISTENER_TYPE__HREF:
				setHref((String)newValue);
				return;
			case ScriptPackage.EVENT_LISTENER_TYPE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case ScriptPackage.EVENT_LISTENER_TYPE__MACRO_NAME:
				setMacroName((String)newValue);
				return;
			case ScriptPackage.EVENT_LISTENER_TYPE__TYPE:
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
			case ScriptPackage.EVENT_LISTENER_TYPE__ACTUATE:
				unsetActuate();
				return;
			case ScriptPackage.EVENT_LISTENER_TYPE__EVENT_NAME:
				setEventName(EVENT_NAME_EDEFAULT);
				return;
			case ScriptPackage.EVENT_LISTENER_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case ScriptPackage.EVENT_LISTENER_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case ScriptPackage.EVENT_LISTENER_TYPE__MACRO_NAME:
				setMacroName(MACRO_NAME_EDEFAULT);
				return;
			case ScriptPackage.EVENT_LISTENER_TYPE__TYPE:
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
			case ScriptPackage.EVENT_LISTENER_TYPE__ACTUATE:
				return isSetActuate();
			case ScriptPackage.EVENT_LISTENER_TYPE__EVENT_NAME:
				return EVENT_NAME_EDEFAULT == null ? eventName != null : !EVENT_NAME_EDEFAULT.equals(eventName);
			case ScriptPackage.EVENT_LISTENER_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case ScriptPackage.EVENT_LISTENER_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case ScriptPackage.EVENT_LISTENER_TYPE__MACRO_NAME:
				return MACRO_NAME_EDEFAULT == null ? macroName != null : !MACRO_NAME_EDEFAULT.equals(macroName);
			case ScriptPackage.EVENT_LISTENER_TYPE__TYPE:
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
		result.append(" (actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", eventName: ");
		result.append(eventName);
		result.append(", href: ");
		result.append(href);
		result.append(", language: ");
		result.append(language);
		result.append(", macroName: ");
		result.append(macroName);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EventListenerTypeImpl
