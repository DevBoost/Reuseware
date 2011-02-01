/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.tid.cim.CimPackage;
import es.tid.cim.EnabledLogicalElement;
import es.tid.cim.EnumEnabledDefault;
import es.tid.cim.EnumEnabledState;
import es.tid.cim.EnumRequestedState;
import es.tid.cim.RemoteServiceAccessPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enabled Logical Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.EnabledLogicalElementImpl#getEnabledDefault <em>Enabled Default</em>}</li>
 *   <li>{@link es.tid.cim.impl.EnabledLogicalElementImpl#getEnabledState <em>Enabled State</em>}</li>
 *   <li>{@link es.tid.cim.impl.EnabledLogicalElementImpl#getOtherEnabledState <em>Other Enabled State</em>}</li>
 *   <li>{@link es.tid.cim.impl.EnabledLogicalElementImpl#getOverwritePolicy <em>Overwrite Policy</em>}</li>
 *   <li>{@link es.tid.cim.impl.EnabledLogicalElementImpl#getRemoteAccessAvailableToElement <em>Remote Access Available To Element</em>}</li>
 *   <li>{@link es.tid.cim.impl.EnabledLogicalElementImpl#getRequestedState <em>Requested State</em>}</li>
 *   <li>{@link es.tid.cim.impl.EnabledLogicalElementImpl#getTimeOfLastStateChange <em>Time Of Last State Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EnabledLogicalElementImpl extends LogicalElementImpl implements EnabledLogicalElement {
	/**
	 * The default value of the '{@link #getEnabledDefault() <em>Enabled Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledDefault()
	 * @generated
	 * @ordered
	 */
	protected static final EnumEnabledDefault ENABLED_DEFAULT_EDEFAULT = EnumEnabledDefault.ENABLED;

	/**
	 * The cached value of the '{@link #getEnabledDefault() <em>Enabled Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledDefault()
	 * @generated
	 * @ordered
	 */
	protected EnumEnabledDefault enabledDefault = ENABLED_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabledState() <em>Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledState()
	 * @generated
	 * @ordered
	 */
	protected static final EnumEnabledState ENABLED_STATE_EDEFAULT = EnumEnabledState.ENABLED;

	/**
	 * The cached value of the '{@link #getEnabledState() <em>Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledState()
	 * @generated
	 * @ordered
	 */
	protected EnumEnabledState enabledState = ENABLED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEnabledState() <em>Other Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledState()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENABLED_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEnabledState() <em>Other Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledState()
	 * @generated
	 * @ordered
	 */
	protected String otherEnabledState = OTHER_ENABLED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverwritePolicy() <em>Overwrite Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverwritePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERWRITE_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverwritePolicy() <em>Overwrite Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverwritePolicy()
	 * @generated
	 * @ordered
	 */
	protected String overwritePolicy = OVERWRITE_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRemoteAccessAvailableToElement() <em>Remote Access Available To Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteAccessAvailableToElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoteServiceAccessPoint> remoteAccessAvailableToElement;

	/**
	 * The default value of the '{@link #getRequestedState() <em>Requested State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedState()
	 * @generated
	 * @ordered
	 */
	protected static final EnumRequestedState REQUESTED_STATE_EDEFAULT = EnumRequestedState.UNKNOWN;

	/**
	 * The cached value of the '{@link #getRequestedState() <em>Requested State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedState()
	 * @generated
	 * @ordered
	 */
	protected EnumRequestedState requestedState = REQUESTED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOfLastStateChange() <em>Time Of Last State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastStateChange()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_OF_LAST_STATE_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfLastStateChange() <em>Time Of Last State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastStateChange()
	 * @generated
	 * @ordered
	 */
	protected Date timeOfLastStateChange = TIME_OF_LAST_STATE_CHANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnabledLogicalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getEnabledLogicalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumEnabledDefault getEnabledDefault() {
		return enabledDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabledDefault(EnumEnabledDefault newEnabledDefault) {
		EnumEnabledDefault oldEnabledDefault = enabledDefault;
		enabledDefault = newEnabledDefault == null ? ENABLED_DEFAULT_EDEFAULT : newEnabledDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ENABLED_LOGICAL_ELEMENT__ENABLED_DEFAULT, oldEnabledDefault, enabledDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumEnabledState getEnabledState() {
		return enabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabledState(EnumEnabledState newEnabledState) {
		EnumEnabledState oldEnabledState = enabledState;
		enabledState = newEnabledState == null ? ENABLED_STATE_EDEFAULT : newEnabledState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ENABLED_LOGICAL_ELEMENT__ENABLED_STATE, oldEnabledState, enabledState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherEnabledState() {
		return otherEnabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherEnabledState(String newOtherEnabledState) {
		String oldOtherEnabledState = otherEnabledState;
		otherEnabledState = newOtherEnabledState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ENABLED_LOGICAL_ELEMENT__OTHER_ENABLED_STATE, oldOtherEnabledState, otherEnabledState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverwritePolicy() {
		return overwritePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverwritePolicy(String newOverwritePolicy) {
		String oldOverwritePolicy = overwritePolicy;
		overwritePolicy = newOverwritePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ENABLED_LOGICAL_ELEMENT__OVERWRITE_POLICY, oldOverwritePolicy, overwritePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoteServiceAccessPoint> getRemoteAccessAvailableToElement() {
		if (remoteAccessAvailableToElement == null) {
			remoteAccessAvailableToElement = new EObjectResolvingEList<RemoteServiceAccessPoint>(RemoteServiceAccessPoint.class, this, CimPackage.ENABLED_LOGICAL_ELEMENT__REMOTE_ACCESS_AVAILABLE_TO_ELEMENT);
		}
		return remoteAccessAvailableToElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumRequestedState getRequestedState() {
		return requestedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedState(EnumRequestedState newRequestedState) {
		EnumRequestedState oldRequestedState = requestedState;
		requestedState = newRequestedState == null ? REQUESTED_STATE_EDEFAULT : newRequestedState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ENABLED_LOGICAL_ELEMENT__REQUESTED_STATE, oldRequestedState, requestedState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeOfLastStateChange() {
		return timeOfLastStateChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOfLastStateChange(Date newTimeOfLastStateChange) {
		Date oldTimeOfLastStateChange = timeOfLastStateChange;
		timeOfLastStateChange = newTimeOfLastStateChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ENABLED_LOGICAL_ELEMENT__TIME_OF_LAST_STATE_CHANGE, oldTimeOfLastStateChange, timeOfLastStateChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.ENABLED_LOGICAL_ELEMENT__ENABLED_DEFAULT:
				return getEnabledDefault();
			case CimPackage.ENABLED_LOGICAL_ELEMENT__ENABLED_STATE:
				return getEnabledState();
			case CimPackage.ENABLED_LOGICAL_ELEMENT__OTHER_ENABLED_STATE:
				return getOtherEnabledState();
			case CimPackage.ENABLED_LOGICAL_ELEMENT__OVERWRITE_POLICY:
				return getOverwritePolicy();
			case CimPackage.ENABLED_LOGICAL_ELEMENT__REMOTE_ACCESS_AVAILABLE_TO_ELEMENT:
				return getRemoteAccessAvailableToElement();
			case CimPackage.ENABLED_LOGICAL_ELEMENT__REQUESTED_STATE:
				return getRequestedState();
			case CimPackage.ENABLED_LOGICAL_ELEMENT__TIME_OF_LAST_STATE_CHANGE:
				return getTimeOfLastStateChange();
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
			case CimPackage.ENABLED_LOGICAL_ELEMENT__ENABLED_DEFAULT:
				setEnabledDefault((EnumEnabledDefault)newValue);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__ENABLED_STATE:
				setEnabledState((EnumEnabledState)newValue);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__OTHER_ENABLED_STATE:
				setOtherEnabledState((String)newValue);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__OVERWRITE_POLICY:
				setOverwritePolicy((String)newValue);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__REMOTE_ACCESS_AVAILABLE_TO_ELEMENT:
				getRemoteAccessAvailableToElement().clear();
				getRemoteAccessAvailableToElement().addAll((Collection<? extends RemoteServiceAccessPoint>)newValue);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__REQUESTED_STATE:
				setRequestedState((EnumRequestedState)newValue);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__TIME_OF_LAST_STATE_CHANGE:
				setTimeOfLastStateChange((Date)newValue);
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
			case CimPackage.ENABLED_LOGICAL_ELEMENT__ENABLED_DEFAULT:
				setEnabledDefault(ENABLED_DEFAULT_EDEFAULT);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__ENABLED_STATE:
				setEnabledState(ENABLED_STATE_EDEFAULT);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__OTHER_ENABLED_STATE:
				setOtherEnabledState(OTHER_ENABLED_STATE_EDEFAULT);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__OVERWRITE_POLICY:
				setOverwritePolicy(OVERWRITE_POLICY_EDEFAULT);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__REMOTE_ACCESS_AVAILABLE_TO_ELEMENT:
				getRemoteAccessAvailableToElement().clear();
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__REQUESTED_STATE:
				setRequestedState(REQUESTED_STATE_EDEFAULT);
				return;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__TIME_OF_LAST_STATE_CHANGE:
				setTimeOfLastStateChange(TIME_OF_LAST_STATE_CHANGE_EDEFAULT);
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
			case CimPackage.ENABLED_LOGICAL_ELEMENT__ENABLED_DEFAULT:
				return enabledDefault != ENABLED_DEFAULT_EDEFAULT;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__ENABLED_STATE:
				return enabledState != ENABLED_STATE_EDEFAULT;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__OTHER_ENABLED_STATE:
				return OTHER_ENABLED_STATE_EDEFAULT == null ? otherEnabledState != null : !OTHER_ENABLED_STATE_EDEFAULT.equals(otherEnabledState);
			case CimPackage.ENABLED_LOGICAL_ELEMENT__OVERWRITE_POLICY:
				return OVERWRITE_POLICY_EDEFAULT == null ? overwritePolicy != null : !OVERWRITE_POLICY_EDEFAULT.equals(overwritePolicy);
			case CimPackage.ENABLED_LOGICAL_ELEMENT__REMOTE_ACCESS_AVAILABLE_TO_ELEMENT:
				return remoteAccessAvailableToElement != null && !remoteAccessAvailableToElement.isEmpty();
			case CimPackage.ENABLED_LOGICAL_ELEMENT__REQUESTED_STATE:
				return requestedState != REQUESTED_STATE_EDEFAULT;
			case CimPackage.ENABLED_LOGICAL_ELEMENT__TIME_OF_LAST_STATE_CHANGE:
				return TIME_OF_LAST_STATE_CHANGE_EDEFAULT == null ? timeOfLastStateChange != null : !TIME_OF_LAST_STATE_CHANGE_EDEFAULT.equals(timeOfLastStateChange);
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
		result.append(" (enabledDefault: ");
		result.append(enabledDefault);
		result.append(", enabledState: ");
		result.append(enabledState);
		result.append(", otherEnabledState: ");
		result.append(otherEnabledState);
		result.append(", overwritePolicy: ");
		result.append(overwritePolicy);
		result.append(", requestedState: ");
		result.append(requestedState);
		result.append(", timeOfLastStateChange: ");
		result.append(timeOfLastStateChange);
		result.append(')');
		return result.toString();
	}

} //EnabledLogicalElementImpl
