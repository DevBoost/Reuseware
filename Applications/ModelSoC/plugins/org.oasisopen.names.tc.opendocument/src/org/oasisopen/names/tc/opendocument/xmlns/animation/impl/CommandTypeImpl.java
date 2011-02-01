/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.animation.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ParamType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getMasterElement <em>Master Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getPresetClass <em>Preset Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getPresetId <em>Preset Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getPresetSubType <em>Preset Sub Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getSubItem <em>Sub Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.CommandTypeImpl#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandTypeImpl extends EObjectImpl implements CommandType {
	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamType> param;

	/**
	 * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected static final String BEGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected String begin = BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

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
	 * The default value of the '{@link #getMasterElement() <em>Master Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterElement()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterElement() <em>Master Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterElement()
	 * @generated
	 * @ordered
	 */
	protected String masterElement = MASTER_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeTypeType NODE_TYPE_EDEFAULT = NodeTypeType.DEFAULT;

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected NodeTypeType nodeType = NODE_TYPE_EDEFAULT;

	/**
	 * This is true if the Node Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nodeTypeESet;

	/**
	 * The default value of the '{@link #getPresetClass() <em>Preset Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetClass()
	 * @generated
	 * @ordered
	 */
	protected static final PresetClassType PRESET_CLASS_EDEFAULT = PresetClassType.CUSTOM;

	/**
	 * The cached value of the '{@link #getPresetClass() <em>Preset Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetClass()
	 * @generated
	 * @ordered
	 */
	protected PresetClassType presetClass = PRESET_CLASS_EDEFAULT;

	/**
	 * This is true if the Preset Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean presetClassESet;

	/**
	 * The default value of the '{@link #getPresetId() <em>Preset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresetId() <em>Preset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetId()
	 * @generated
	 * @ordered
	 */
	protected String presetId = PRESET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresetSubType() <em>Preset Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetSubType()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESET_SUB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresetSubType() <em>Preset Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetSubType()
	 * @generated
	 * @ordered
	 */
	protected String presetSubType = PRESET_SUB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubItem() <em>Sub Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubItem()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubItem() <em>Sub Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubItem()
	 * @generated
	 * @ordered
	 */
	protected String subItem = SUB_ITEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetElement() <em>Target Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected String targetElement = TARGET_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnimationPackage.Literals.COMMAND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamType> getParam() {
		if (param == null) {
			param = new EObjectContainmentEList<ParamType>(ParamType.class, this, AnimationPackage.COMMAND_TYPE__PARAM);
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBegin(String newBegin) {
		String oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.COMMAND_TYPE__BEGIN, oldBegin, begin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.COMMAND_TYPE__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(String newEnd) {
		String oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.COMMAND_TYPE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.COMMAND_TYPE__GROUP_ID, oldGroupId, groupId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.COMMAND_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasterElement() {
		return masterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterElement(String newMasterElement) {
		String oldMasterElement = masterElement;
		masterElement = newMasterElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.COMMAND_TYPE__MASTER_ELEMENT, oldMasterElement, masterElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeType getNodeType() {
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeType(NodeTypeType newNodeType) {
		NodeTypeType oldNodeType = nodeType;
		nodeType = newNodeType == null ? NODE_TYPE_EDEFAULT : newNodeType;
		boolean oldNodeTypeESet = nodeTypeESet;
		nodeTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.COMMAND_TYPE__NODE_TYPE, oldNodeType, nodeType, !oldNodeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNodeType() {
		NodeTypeType oldNodeType = nodeType;
		boolean oldNodeTypeESet = nodeTypeESet;
		nodeType = NODE_TYPE_EDEFAULT;
		nodeTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.COMMAND_TYPE__NODE_TYPE, oldNodeType, NODE_TYPE_EDEFAULT, oldNodeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNodeType() {
		return nodeTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresetClassType getPresetClass() {
		return presetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresetClass(PresetClassType newPresetClass) {
		PresetClassType oldPresetClass = presetClass;
		presetClass = newPresetClass == null ? PRESET_CLASS_EDEFAULT : newPresetClass;
		boolean oldPresetClassESet = presetClassESet;
		presetClassESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.COMMAND_TYPE__PRESET_CLASS, oldPresetClass, presetClass, !oldPresetClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPresetClass() {
		PresetClassType oldPresetClass = presetClass;
		boolean oldPresetClassESet = presetClassESet;
		presetClass = PRESET_CLASS_EDEFAULT;
		presetClassESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.COMMAND_TYPE__PRESET_CLASS, oldPresetClass, PRESET_CLASS_EDEFAULT, oldPresetClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPresetClass() {
		return presetClassESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresetId() {
		return presetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresetId(String newPresetId) {
		String oldPresetId = presetId;
		presetId = newPresetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.COMMAND_TYPE__PRESET_ID, oldPresetId, presetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresetSubType() {
		return presetSubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresetSubType(String newPresetSubType) {
		String oldPresetSubType = presetSubType;
		presetSubType = newPresetSubType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.COMMAND_TYPE__PRESET_SUB_TYPE, oldPresetSubType, presetSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubItem() {
		return subItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubItem(String newSubItem) {
		String oldSubItem = subItem;
		subItem = newSubItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.COMMAND_TYPE__SUB_ITEM, oldSubItem, subItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetElement() {
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetElement(String newTargetElement) {
		String oldTargetElement = targetElement;
		targetElement = newTargetElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.COMMAND_TYPE__TARGET_ELEMENT, oldTargetElement, targetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnimationPackage.COMMAND_TYPE__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
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
			case AnimationPackage.COMMAND_TYPE__PARAM:
				return getParam();
			case AnimationPackage.COMMAND_TYPE__BEGIN:
				return getBegin();
			case AnimationPackage.COMMAND_TYPE__COMMAND:
				return getCommand();
			case AnimationPackage.COMMAND_TYPE__END:
				return getEnd();
			case AnimationPackage.COMMAND_TYPE__GROUP_ID:
				return getGroupId();
			case AnimationPackage.COMMAND_TYPE__ID:
				return getId();
			case AnimationPackage.COMMAND_TYPE__MASTER_ELEMENT:
				return getMasterElement();
			case AnimationPackage.COMMAND_TYPE__NODE_TYPE:
				return getNodeType();
			case AnimationPackage.COMMAND_TYPE__PRESET_CLASS:
				return getPresetClass();
			case AnimationPackage.COMMAND_TYPE__PRESET_ID:
				return getPresetId();
			case AnimationPackage.COMMAND_TYPE__PRESET_SUB_TYPE:
				return getPresetSubType();
			case AnimationPackage.COMMAND_TYPE__SUB_ITEM:
				return getSubItem();
			case AnimationPackage.COMMAND_TYPE__TARGET_ELEMENT:
				return getTargetElement();
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
			case AnimationPackage.COMMAND_TYPE__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends ParamType>)newValue);
				return;
			case AnimationPackage.COMMAND_TYPE__BEGIN:
				setBegin((String)newValue);
				return;
			case AnimationPackage.COMMAND_TYPE__COMMAND:
				setCommand((String)newValue);
				return;
			case AnimationPackage.COMMAND_TYPE__END:
				setEnd((String)newValue);
				return;
			case AnimationPackage.COMMAND_TYPE__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case AnimationPackage.COMMAND_TYPE__ID:
				setId((String)newValue);
				return;
			case AnimationPackage.COMMAND_TYPE__MASTER_ELEMENT:
				setMasterElement((String)newValue);
				return;
			case AnimationPackage.COMMAND_TYPE__NODE_TYPE:
				setNodeType((NodeTypeType)newValue);
				return;
			case AnimationPackage.COMMAND_TYPE__PRESET_CLASS:
				setPresetClass((PresetClassType)newValue);
				return;
			case AnimationPackage.COMMAND_TYPE__PRESET_ID:
				setPresetId((String)newValue);
				return;
			case AnimationPackage.COMMAND_TYPE__PRESET_SUB_TYPE:
				setPresetSubType((String)newValue);
				return;
			case AnimationPackage.COMMAND_TYPE__SUB_ITEM:
				setSubItem((String)newValue);
				return;
			case AnimationPackage.COMMAND_TYPE__TARGET_ELEMENT:
				setTargetElement((String)newValue);
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
			case AnimationPackage.COMMAND_TYPE__PARAM:
				getParam().clear();
				return;
			case AnimationPackage.COMMAND_TYPE__BEGIN:
				setBegin(BEGIN_EDEFAULT);
				return;
			case AnimationPackage.COMMAND_TYPE__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case AnimationPackage.COMMAND_TYPE__END:
				setEnd(END_EDEFAULT);
				return;
			case AnimationPackage.COMMAND_TYPE__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case AnimationPackage.COMMAND_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case AnimationPackage.COMMAND_TYPE__MASTER_ELEMENT:
				setMasterElement(MASTER_ELEMENT_EDEFAULT);
				return;
			case AnimationPackage.COMMAND_TYPE__NODE_TYPE:
				unsetNodeType();
				return;
			case AnimationPackage.COMMAND_TYPE__PRESET_CLASS:
				unsetPresetClass();
				return;
			case AnimationPackage.COMMAND_TYPE__PRESET_ID:
				setPresetId(PRESET_ID_EDEFAULT);
				return;
			case AnimationPackage.COMMAND_TYPE__PRESET_SUB_TYPE:
				setPresetSubType(PRESET_SUB_TYPE_EDEFAULT);
				return;
			case AnimationPackage.COMMAND_TYPE__SUB_ITEM:
				setSubItem(SUB_ITEM_EDEFAULT);
				return;
			case AnimationPackage.COMMAND_TYPE__TARGET_ELEMENT:
				setTargetElement(TARGET_ELEMENT_EDEFAULT);
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
			case AnimationPackage.COMMAND_TYPE__PARAM:
				return param != null && !param.isEmpty();
			case AnimationPackage.COMMAND_TYPE__BEGIN:
				return BEGIN_EDEFAULT == null ? begin != null : !BEGIN_EDEFAULT.equals(begin);
			case AnimationPackage.COMMAND_TYPE__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
			case AnimationPackage.COMMAND_TYPE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case AnimationPackage.COMMAND_TYPE__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case AnimationPackage.COMMAND_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AnimationPackage.COMMAND_TYPE__MASTER_ELEMENT:
				return MASTER_ELEMENT_EDEFAULT == null ? masterElement != null : !MASTER_ELEMENT_EDEFAULT.equals(masterElement);
			case AnimationPackage.COMMAND_TYPE__NODE_TYPE:
				return isSetNodeType();
			case AnimationPackage.COMMAND_TYPE__PRESET_CLASS:
				return isSetPresetClass();
			case AnimationPackage.COMMAND_TYPE__PRESET_ID:
				return PRESET_ID_EDEFAULT == null ? presetId != null : !PRESET_ID_EDEFAULT.equals(presetId);
			case AnimationPackage.COMMAND_TYPE__PRESET_SUB_TYPE:
				return PRESET_SUB_TYPE_EDEFAULT == null ? presetSubType != null : !PRESET_SUB_TYPE_EDEFAULT.equals(presetSubType);
			case AnimationPackage.COMMAND_TYPE__SUB_ITEM:
				return SUB_ITEM_EDEFAULT == null ? subItem != null : !SUB_ITEM_EDEFAULT.equals(subItem);
			case AnimationPackage.COMMAND_TYPE__TARGET_ELEMENT:
				return TARGET_ELEMENT_EDEFAULT == null ? targetElement != null : !TARGET_ELEMENT_EDEFAULT.equals(targetElement);
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
		result.append(" (begin: ");
		result.append(begin);
		result.append(", command: ");
		result.append(command);
		result.append(", end: ");
		result.append(end);
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", id: ");
		result.append(id);
		result.append(", masterElement: ");
		result.append(masterElement);
		result.append(", nodeType: ");
		if (nodeTypeESet) result.append(nodeType); else result.append("<unset>");
		result.append(", presetClass: ");
		if (presetClassESet) result.append(presetClass); else result.append("<unset>");
		result.append(", presetId: ");
		result.append(presetId);
		result.append(", presetSubType: ");
		result.append(presetSubType);
		result.append(", subItem: ");
		result.append(subItem);
		result.append(", targetElement: ");
		result.append(targetElement);
		result.append(')');
		return result.toString();
	}

} //CommandTypeImpl
