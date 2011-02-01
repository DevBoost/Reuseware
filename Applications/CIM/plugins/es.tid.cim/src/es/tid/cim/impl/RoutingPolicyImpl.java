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
import es.tid.cim.RoutingPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routing Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.RoutingPolicyImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.RoutingPolicyImpl#getAction <em>Action</em>}</li>
 *   <li>{@link es.tid.cim.impl.RoutingPolicyImpl#getAttributeAction <em>Attribute Action</em>}</li>
 *   <li>{@link es.tid.cim.impl.RoutingPolicyImpl#getBGPAction <em>BGP Action</em>}</li>
 *   <li>{@link es.tid.cim.impl.RoutingPolicyImpl#getBGPValue <em>BGP Value</em>}</li>
 *   <li>{@link es.tid.cim.impl.RoutingPolicyImpl#getRemarkAction <em>Remark Action</em>}</li>
 *   <li>{@link es.tid.cim.impl.RoutingPolicyImpl#getRemarkValue <em>Remark Value</em>}</li>
 *   <li>{@link es.tid.cim.impl.RoutingPolicyImpl#getConditioningAction <em>Conditioning Action</em>}</li>
 *   <li>{@link es.tid.cim.impl.RoutingPolicyImpl#getOtherConditioningAction <em>Other Conditioning Action</em>}</li>
 *   <li>{@link es.tid.cim.impl.RoutingPolicyImpl#getConditioningValue <em>Conditioning Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoutingPolicyImpl extends LogicalElementImpl implements RoutingPolicy {
	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeAction() <em>Attribute Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeAction() <em>Attribute Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeAction()
	 * @generated
	 * @ordered
	 */
	protected String attributeAction = ATTRIBUTE_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBGPAction() <em>BGP Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPAction()
	 * @generated
	 * @ordered
	 */
	protected static final String BGP_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBGPAction() <em>BGP Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPAction()
	 * @generated
	 * @ordered
	 */
	protected String bgpAction = BGP_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBGPValue() <em>BGP Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPValue()
	 * @generated
	 * @ordered
	 */
	protected static final String BGP_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBGPValue() <em>BGP Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPValue()
	 * @generated
	 * @ordered
	 */
	protected String bgpValue = BGP_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemarkAction() <em>Remark Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarkAction()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARK_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarkAction() <em>Remark Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarkAction()
	 * @generated
	 * @ordered
	 */
	protected String remarkAction = REMARK_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemarkValue() <em>Remark Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarkValue()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARK_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarkValue() <em>Remark Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarkValue()
	 * @generated
	 * @ordered
	 */
	protected String remarkValue = REMARK_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditioningAction() <em>Conditioning Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditioningAction()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONING_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditioningAction() <em>Conditioning Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditioningAction()
	 * @generated
	 * @ordered
	 */
	protected String conditioningAction = CONDITIONING_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherConditioningAction() <em>Other Conditioning Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherConditioningAction()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CONDITIONING_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherConditioningAction() <em>Other Conditioning Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherConditioningAction()
	 * @generated
	 * @ordered
	 */
	protected String otherConditioningAction = OTHER_CONDITIONING_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditioningValue() <em>Conditioning Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditioningValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditioningValue() <em>Conditioning Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditioningValue()
	 * @generated
	 * @ordered
	 */
	protected String conditioningValue = CONDITIONING_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getRoutingPolicy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ROUTING_POLICY__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ROUTING_POLICY__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeAction() {
		return attributeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeAction(String newAttributeAction) {
		String oldAttributeAction = attributeAction;
		attributeAction = newAttributeAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ROUTING_POLICY__ATTRIBUTE_ACTION, oldAttributeAction, attributeAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBGPAction() {
		return bgpAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBGPAction(String newBGPAction) {
		String oldBGPAction = bgpAction;
		bgpAction = newBGPAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ROUTING_POLICY__BGP_ACTION, oldBGPAction, bgpAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBGPValue() {
		return bgpValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBGPValue(String newBGPValue) {
		String oldBGPValue = bgpValue;
		bgpValue = newBGPValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ROUTING_POLICY__BGP_VALUE, oldBGPValue, bgpValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarkAction() {
		return remarkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarkAction(String newRemarkAction) {
		String oldRemarkAction = remarkAction;
		remarkAction = newRemarkAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ROUTING_POLICY__REMARK_ACTION, oldRemarkAction, remarkAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarkValue() {
		return remarkValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarkValue(String newRemarkValue) {
		String oldRemarkValue = remarkValue;
		remarkValue = newRemarkValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ROUTING_POLICY__REMARK_VALUE, oldRemarkValue, remarkValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditioningAction() {
		return conditioningAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditioningAction(String newConditioningAction) {
		String oldConditioningAction = conditioningAction;
		conditioningAction = newConditioningAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ROUTING_POLICY__CONDITIONING_ACTION, oldConditioningAction, conditioningAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherConditioningAction() {
		return otherConditioningAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherConditioningAction(String newOtherConditioningAction) {
		String oldOtherConditioningAction = otherConditioningAction;
		otherConditioningAction = newOtherConditioningAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ROUTING_POLICY__OTHER_CONDITIONING_ACTION, oldOtherConditioningAction, otherConditioningAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditioningValue() {
		return conditioningValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditioningValue(String newConditioningValue) {
		String oldConditioningValue = conditioningValue;
		conditioningValue = newConditioningValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ROUTING_POLICY__CONDITIONING_VALUE, oldConditioningValue, conditioningValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.ROUTING_POLICY__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.ROUTING_POLICY__ACTION:
				return getAction();
			case CimPackage.ROUTING_POLICY__ATTRIBUTE_ACTION:
				return getAttributeAction();
			case CimPackage.ROUTING_POLICY__BGP_ACTION:
				return getBGPAction();
			case CimPackage.ROUTING_POLICY__BGP_VALUE:
				return getBGPValue();
			case CimPackage.ROUTING_POLICY__REMARK_ACTION:
				return getRemarkAction();
			case CimPackage.ROUTING_POLICY__REMARK_VALUE:
				return getRemarkValue();
			case CimPackage.ROUTING_POLICY__CONDITIONING_ACTION:
				return getConditioningAction();
			case CimPackage.ROUTING_POLICY__OTHER_CONDITIONING_ACTION:
				return getOtherConditioningAction();
			case CimPackage.ROUTING_POLICY__CONDITIONING_VALUE:
				return getConditioningValue();
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
			case CimPackage.ROUTING_POLICY__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.ROUTING_POLICY__ACTION:
				setAction((String)newValue);
				return;
			case CimPackage.ROUTING_POLICY__ATTRIBUTE_ACTION:
				setAttributeAction((String)newValue);
				return;
			case CimPackage.ROUTING_POLICY__BGP_ACTION:
				setBGPAction((String)newValue);
				return;
			case CimPackage.ROUTING_POLICY__BGP_VALUE:
				setBGPValue((String)newValue);
				return;
			case CimPackage.ROUTING_POLICY__REMARK_ACTION:
				setRemarkAction((String)newValue);
				return;
			case CimPackage.ROUTING_POLICY__REMARK_VALUE:
				setRemarkValue((String)newValue);
				return;
			case CimPackage.ROUTING_POLICY__CONDITIONING_ACTION:
				setConditioningAction((String)newValue);
				return;
			case CimPackage.ROUTING_POLICY__OTHER_CONDITIONING_ACTION:
				setOtherConditioningAction((String)newValue);
				return;
			case CimPackage.ROUTING_POLICY__CONDITIONING_VALUE:
				setConditioningValue((String)newValue);
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
			case CimPackage.ROUTING_POLICY__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.ROUTING_POLICY__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case CimPackage.ROUTING_POLICY__ATTRIBUTE_ACTION:
				setAttributeAction(ATTRIBUTE_ACTION_EDEFAULT);
				return;
			case CimPackage.ROUTING_POLICY__BGP_ACTION:
				setBGPAction(BGP_ACTION_EDEFAULT);
				return;
			case CimPackage.ROUTING_POLICY__BGP_VALUE:
				setBGPValue(BGP_VALUE_EDEFAULT);
				return;
			case CimPackage.ROUTING_POLICY__REMARK_ACTION:
				setRemarkAction(REMARK_ACTION_EDEFAULT);
				return;
			case CimPackage.ROUTING_POLICY__REMARK_VALUE:
				setRemarkValue(REMARK_VALUE_EDEFAULT);
				return;
			case CimPackage.ROUTING_POLICY__CONDITIONING_ACTION:
				setConditioningAction(CONDITIONING_ACTION_EDEFAULT);
				return;
			case CimPackage.ROUTING_POLICY__OTHER_CONDITIONING_ACTION:
				setOtherConditioningAction(OTHER_CONDITIONING_ACTION_EDEFAULT);
				return;
			case CimPackage.ROUTING_POLICY__CONDITIONING_VALUE:
				setConditioningValue(CONDITIONING_VALUE_EDEFAULT);
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
			case CimPackage.ROUTING_POLICY__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.ROUTING_POLICY__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case CimPackage.ROUTING_POLICY__ATTRIBUTE_ACTION:
				return ATTRIBUTE_ACTION_EDEFAULT == null ? attributeAction != null : !ATTRIBUTE_ACTION_EDEFAULT.equals(attributeAction);
			case CimPackage.ROUTING_POLICY__BGP_ACTION:
				return BGP_ACTION_EDEFAULT == null ? bgpAction != null : !BGP_ACTION_EDEFAULT.equals(bgpAction);
			case CimPackage.ROUTING_POLICY__BGP_VALUE:
				return BGP_VALUE_EDEFAULT == null ? bgpValue != null : !BGP_VALUE_EDEFAULT.equals(bgpValue);
			case CimPackage.ROUTING_POLICY__REMARK_ACTION:
				return REMARK_ACTION_EDEFAULT == null ? remarkAction != null : !REMARK_ACTION_EDEFAULT.equals(remarkAction);
			case CimPackage.ROUTING_POLICY__REMARK_VALUE:
				return REMARK_VALUE_EDEFAULT == null ? remarkValue != null : !REMARK_VALUE_EDEFAULT.equals(remarkValue);
			case CimPackage.ROUTING_POLICY__CONDITIONING_ACTION:
				return CONDITIONING_ACTION_EDEFAULT == null ? conditioningAction != null : !CONDITIONING_ACTION_EDEFAULT.equals(conditioningAction);
			case CimPackage.ROUTING_POLICY__OTHER_CONDITIONING_ACTION:
				return OTHER_CONDITIONING_ACTION_EDEFAULT == null ? otherConditioningAction != null : !OTHER_CONDITIONING_ACTION_EDEFAULT.equals(otherConditioningAction);
			case CimPackage.ROUTING_POLICY__CONDITIONING_VALUE:
				return CONDITIONING_VALUE_EDEFAULT == null ? conditioningValue != null : !CONDITIONING_VALUE_EDEFAULT.equals(conditioningValue);
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
		result.append(" (creationClassName: ");
		result.append(creationClassName);
		result.append(", action: ");
		result.append(action);
		result.append(", attributeAction: ");
		result.append(attributeAction);
		result.append(", BGPAction: ");
		result.append(bgpAction);
		result.append(", BGPValue: ");
		result.append(bgpValue);
		result.append(", remarkAction: ");
		result.append(remarkAction);
		result.append(", remarkValue: ");
		result.append(remarkValue);
		result.append(", conditioningAction: ");
		result.append(conditioningAction);
		result.append(", otherConditioningAction: ");
		result.append(otherConditioningAction);
		result.append(", conditioningValue: ");
		result.append(conditioningValue);
		result.append(')');
		return result.toString();
	}

} //RoutingPolicyImpl
