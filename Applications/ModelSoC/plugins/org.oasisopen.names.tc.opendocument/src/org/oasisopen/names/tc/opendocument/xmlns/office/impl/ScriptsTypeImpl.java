/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ScriptsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scripts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.ScriptsTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.ScriptsTypeImpl#getEventListeners <em>Event Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptsTypeImpl extends EObjectImpl implements ScriptsType {
	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected EList<ScriptType> script;

	/**
	 * The cached value of the '{@link #getEventListeners() <em>Event Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventListeners()
	 * @generated
	 * @ordered
	 */
	protected EventListenersType eventListeners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.SCRIPTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		if (script == null) {
			script = new EObjectContainmentEList<ScriptType>(ScriptType.class, this, OfficePackage.SCRIPTS_TYPE__SCRIPT);
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListenersType getEventListeners() {
		return eventListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventListeners(EventListenersType newEventListeners, NotificationChain msgs) {
		EventListenersType oldEventListeners = eventListeners;
		eventListeners = newEventListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.SCRIPTS_TYPE__EVENT_LISTENERS, oldEventListeners, newEventListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventListeners(EventListenersType newEventListeners) {
		if (newEventListeners != eventListeners) {
			NotificationChain msgs = null;
			if (eventListeners != null)
				msgs = ((InternalEObject)eventListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SCRIPTS_TYPE__EVENT_LISTENERS, null, msgs);
			if (newEventListeners != null)
				msgs = ((InternalEObject)newEventListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.SCRIPTS_TYPE__EVENT_LISTENERS, null, msgs);
			msgs = basicSetEventListeners(newEventListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.SCRIPTS_TYPE__EVENT_LISTENERS, newEventListeners, newEventListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.SCRIPTS_TYPE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case OfficePackage.SCRIPTS_TYPE__EVENT_LISTENERS:
				return basicSetEventListeners(null, msgs);
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
			case OfficePackage.SCRIPTS_TYPE__SCRIPT:
				return getScript();
			case OfficePackage.SCRIPTS_TYPE__EVENT_LISTENERS:
				return getEventListeners();
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
			case OfficePackage.SCRIPTS_TYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
				return;
			case OfficePackage.SCRIPTS_TYPE__EVENT_LISTENERS:
				setEventListeners((EventListenersType)newValue);
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
			case OfficePackage.SCRIPTS_TYPE__SCRIPT:
				getScript().clear();
				return;
			case OfficePackage.SCRIPTS_TYPE__EVENT_LISTENERS:
				setEventListeners((EventListenersType)null);
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
			case OfficePackage.SCRIPTS_TYPE__SCRIPT:
				return script != null && !script.isEmpty();
			case OfficePackage.SCRIPTS_TYPE__EVENT_LISTENERS:
				return eventListeners != null;
		}
		return super.eIsSet(featureID);
	}

} //ScriptsTypeImpl
