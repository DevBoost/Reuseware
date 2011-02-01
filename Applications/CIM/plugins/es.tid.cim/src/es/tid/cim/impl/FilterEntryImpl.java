/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.EnumAction;
import es.tid.cim.EnumMatchConditionType;
import es.tid.cim.EnumTrafficType;
import es.tid.cim.FilterEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.FilterEntryImpl#getAction <em>Action</em>}</li>
 *   <li>{@link es.tid.cim.impl.FilterEntryImpl#isDefaultFilter <em>Default Filter</em>}</li>
 *   <li>{@link es.tid.cim.impl.FilterEntryImpl#getMatchConditionType <em>Match Condition Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.FilterEntryImpl#getMatchConditionValue <em>Match Condition Value</em>}</li>
 *   <li>{@link es.tid.cim.impl.FilterEntryImpl#getOtherMatchConditionType <em>Other Match Condition Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.FilterEntryImpl#getOtherTrafficType <em>Other Traffic Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.FilterEntryImpl#getTrafficClass <em>Traffic Class</em>}</li>
 *   <li>{@link es.tid.cim.impl.FilterEntryImpl#getTrafficType <em>Traffic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterEntryImpl extends FilterEntryBaseImpl implements FilterEntry {
	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final EnumAction ACTION_EDEFAULT = EnumAction.PERMIT;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EnumAction action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefaultFilter() <em>Default Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultFilter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_FILTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultFilter() <em>Default Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultFilter()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultFilter = DEFAULT_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchConditionType() <em>Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchConditionType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumMatchConditionType MATCH_CONDITION_TYPE_EDEFAULT = EnumMatchConditionType.OTHER;

	/**
	 * The cached value of the '{@link #getMatchConditionType() <em>Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchConditionType()
	 * @generated
	 * @ordered
	 */
	protected EnumMatchConditionType matchConditionType = MATCH_CONDITION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchConditionValue() <em>Match Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchConditionValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_CONDITION_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchConditionValue() <em>Match Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchConditionValue()
	 * @generated
	 * @ordered
	 */
	protected String matchConditionValue = MATCH_CONDITION_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherMatchConditionType() <em>Other Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMatchConditionType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_MATCH_CONDITION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherMatchConditionType() <em>Other Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMatchConditionType()
	 * @generated
	 * @ordered
	 */
	protected String otherMatchConditionType = OTHER_MATCH_CONDITION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTrafficType() <em>Other Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTrafficType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TRAFFIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTrafficType() <em>Other Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTrafficType()
	 * @generated
	 * @ordered
	 */
	protected String otherTrafficType = OTHER_TRAFFIC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrafficClass() <em>Traffic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAFFIC_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrafficClass() <em>Traffic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficClass()
	 * @generated
	 * @ordered
	 */
	protected String trafficClass = TRAFFIC_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrafficType() <em>Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumTrafficType TRAFFIC_TYPE_EDEFAULT = EnumTrafficType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getTrafficType() <em>Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficType()
	 * @generated
	 * @ordered
	 */
	protected EnumTrafficType trafficType = TRAFFIC_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getFilterEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(EnumAction newAction) {
		EnumAction oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.FILTER_ENTRY__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultFilter() {
		return defaultFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFilter(boolean newDefaultFilter) {
		boolean oldDefaultFilter = defaultFilter;
		defaultFilter = newDefaultFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.FILTER_ENTRY__DEFAULT_FILTER, oldDefaultFilter, defaultFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumMatchConditionType getMatchConditionType() {
		return matchConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchConditionType(EnumMatchConditionType newMatchConditionType) {
		EnumMatchConditionType oldMatchConditionType = matchConditionType;
		matchConditionType = newMatchConditionType == null ? MATCH_CONDITION_TYPE_EDEFAULT : newMatchConditionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.FILTER_ENTRY__MATCH_CONDITION_TYPE, oldMatchConditionType, matchConditionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatchConditionValue() {
		return matchConditionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchConditionValue(String newMatchConditionValue) {
		String oldMatchConditionValue = matchConditionValue;
		matchConditionValue = newMatchConditionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.FILTER_ENTRY__MATCH_CONDITION_VALUE, oldMatchConditionValue, matchConditionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherMatchConditionType() {
		return otherMatchConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherMatchConditionType(String newOtherMatchConditionType) {
		String oldOtherMatchConditionType = otherMatchConditionType;
		otherMatchConditionType = newOtherMatchConditionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.FILTER_ENTRY__OTHER_MATCH_CONDITION_TYPE, oldOtherMatchConditionType, otherMatchConditionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherTrafficType() {
		return otherTrafficType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherTrafficType(String newOtherTrafficType) {
		String oldOtherTrafficType = otherTrafficType;
		otherTrafficType = newOtherTrafficType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.FILTER_ENTRY__OTHER_TRAFFIC_TYPE, oldOtherTrafficType, otherTrafficType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrafficClass() {
		return trafficClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrafficClass(String newTrafficClass) {
		String oldTrafficClass = trafficClass;
		trafficClass = newTrafficClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.FILTER_ENTRY__TRAFFIC_CLASS, oldTrafficClass, trafficClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTrafficType getTrafficType() {
		return trafficType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrafficType(EnumTrafficType newTrafficType) {
		EnumTrafficType oldTrafficType = trafficType;
		trafficType = newTrafficType == null ? TRAFFIC_TYPE_EDEFAULT : newTrafficType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.FILTER_ENTRY__TRAFFIC_TYPE, oldTrafficType, trafficType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.FILTER_ENTRY__ACTION:
				return getAction();
			case CimPackage.FILTER_ENTRY__DEFAULT_FILTER:
				return isDefaultFilter();
			case CimPackage.FILTER_ENTRY__MATCH_CONDITION_TYPE:
				return getMatchConditionType();
			case CimPackage.FILTER_ENTRY__MATCH_CONDITION_VALUE:
				return getMatchConditionValue();
			case CimPackage.FILTER_ENTRY__OTHER_MATCH_CONDITION_TYPE:
				return getOtherMatchConditionType();
			case CimPackage.FILTER_ENTRY__OTHER_TRAFFIC_TYPE:
				return getOtherTrafficType();
			case CimPackage.FILTER_ENTRY__TRAFFIC_CLASS:
				return getTrafficClass();
			case CimPackage.FILTER_ENTRY__TRAFFIC_TYPE:
				return getTrafficType();
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
			case CimPackage.FILTER_ENTRY__ACTION:
				setAction((EnumAction)newValue);
				return;
			case CimPackage.FILTER_ENTRY__DEFAULT_FILTER:
				setDefaultFilter((Boolean)newValue);
				return;
			case CimPackage.FILTER_ENTRY__MATCH_CONDITION_TYPE:
				setMatchConditionType((EnumMatchConditionType)newValue);
				return;
			case CimPackage.FILTER_ENTRY__MATCH_CONDITION_VALUE:
				setMatchConditionValue((String)newValue);
				return;
			case CimPackage.FILTER_ENTRY__OTHER_MATCH_CONDITION_TYPE:
				setOtherMatchConditionType((String)newValue);
				return;
			case CimPackage.FILTER_ENTRY__OTHER_TRAFFIC_TYPE:
				setOtherTrafficType((String)newValue);
				return;
			case CimPackage.FILTER_ENTRY__TRAFFIC_CLASS:
				setTrafficClass((String)newValue);
				return;
			case CimPackage.FILTER_ENTRY__TRAFFIC_TYPE:
				setTrafficType((EnumTrafficType)newValue);
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
			case CimPackage.FILTER_ENTRY__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case CimPackage.FILTER_ENTRY__DEFAULT_FILTER:
				setDefaultFilter(DEFAULT_FILTER_EDEFAULT);
				return;
			case CimPackage.FILTER_ENTRY__MATCH_CONDITION_TYPE:
				setMatchConditionType(MATCH_CONDITION_TYPE_EDEFAULT);
				return;
			case CimPackage.FILTER_ENTRY__MATCH_CONDITION_VALUE:
				setMatchConditionValue(MATCH_CONDITION_VALUE_EDEFAULT);
				return;
			case CimPackage.FILTER_ENTRY__OTHER_MATCH_CONDITION_TYPE:
				setOtherMatchConditionType(OTHER_MATCH_CONDITION_TYPE_EDEFAULT);
				return;
			case CimPackage.FILTER_ENTRY__OTHER_TRAFFIC_TYPE:
				setOtherTrafficType(OTHER_TRAFFIC_TYPE_EDEFAULT);
				return;
			case CimPackage.FILTER_ENTRY__TRAFFIC_CLASS:
				setTrafficClass(TRAFFIC_CLASS_EDEFAULT);
				return;
			case CimPackage.FILTER_ENTRY__TRAFFIC_TYPE:
				setTrafficType(TRAFFIC_TYPE_EDEFAULT);
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
			case CimPackage.FILTER_ENTRY__ACTION:
				return action != ACTION_EDEFAULT;
			case CimPackage.FILTER_ENTRY__DEFAULT_FILTER:
				return defaultFilter != DEFAULT_FILTER_EDEFAULT;
			case CimPackage.FILTER_ENTRY__MATCH_CONDITION_TYPE:
				return matchConditionType != MATCH_CONDITION_TYPE_EDEFAULT;
			case CimPackage.FILTER_ENTRY__MATCH_CONDITION_VALUE:
				return MATCH_CONDITION_VALUE_EDEFAULT == null ? matchConditionValue != null : !MATCH_CONDITION_VALUE_EDEFAULT.equals(matchConditionValue);
			case CimPackage.FILTER_ENTRY__OTHER_MATCH_CONDITION_TYPE:
				return OTHER_MATCH_CONDITION_TYPE_EDEFAULT == null ? otherMatchConditionType != null : !OTHER_MATCH_CONDITION_TYPE_EDEFAULT.equals(otherMatchConditionType);
			case CimPackage.FILTER_ENTRY__OTHER_TRAFFIC_TYPE:
				return OTHER_TRAFFIC_TYPE_EDEFAULT == null ? otherTrafficType != null : !OTHER_TRAFFIC_TYPE_EDEFAULT.equals(otherTrafficType);
			case CimPackage.FILTER_ENTRY__TRAFFIC_CLASS:
				return TRAFFIC_CLASS_EDEFAULT == null ? trafficClass != null : !TRAFFIC_CLASS_EDEFAULT.equals(trafficClass);
			case CimPackage.FILTER_ENTRY__TRAFFIC_TYPE:
				return trafficType != TRAFFIC_TYPE_EDEFAULT;
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
		result.append(" (action: ");
		result.append(action);
		result.append(", defaultFilter: ");
		result.append(defaultFilter);
		result.append(", matchConditionType: ");
		result.append(matchConditionType);
		result.append(", matchConditionValue: ");
		result.append(matchConditionValue);
		result.append(", otherMatchConditionType: ");
		result.append(otherMatchConditionType);
		result.append(", otherTrafficType: ");
		result.append(otherTrafficType);
		result.append(", trafficClass: ");
		result.append(trafficClass);
		result.append(", trafficType: ");
		result.append(trafficType);
		result.append(')');
		return result.toString();
	}

} //FilterEntryImpl
