/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.animation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getAudioLevel <em>Audio Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getDur <em>Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getMasterElement <em>Master Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getPresetClass <em>Preset Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getPresetId <em>Preset Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getPresetSubType <em>Preset Sub Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AudioTypeImpl#getRepeatDur <em>Repeat Dur</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AudioTypeImpl extends EObjectImpl implements AudioType {
	/**
	 * The default value of the '{@link #getAudioLevel() <em>Audio Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioLevel()
	 * @generated
	 * @ordered
	 */
	protected static final double AUDIO_LEVEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAudioLevel() <em>Audio Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioLevel()
	 * @generated
	 * @ordered
	 */
	protected double audioLevel = AUDIO_LEVEL_EDEFAULT;

	/**
	 * This is true if the Audio Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean audioLevelESet;

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
	 * The default value of the '{@link #getDur() <em>Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDur()
	 * @generated
	 * @ordered
	 */
	protected static final String DUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDur() <em>Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDur()
	 * @generated
	 * @ordered
	 */
	protected String dur = DUR_EDEFAULT;

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
	 * The default value of the '{@link #getRepeatCount() <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatCount()
	 * @generated
	 * @ordered
	 */
	protected static final Object REPEAT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatCount() <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatCount()
	 * @generated
	 * @ordered
	 */
	protected Object repeatCount = REPEAT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatDur() <em>Repeat Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatDur()
	 * @generated
	 * @ordered
	 */
	protected static final String REPEAT_DUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatDur() <em>Repeat Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatDur()
	 * @generated
	 * @ordered
	 */
	protected String repeatDur = REPEAT_DUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnimationPackage.Literals.AUDIO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAudioLevel() {
		return audioLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudioLevel(double newAudioLevel) {
		double oldAudioLevel = audioLevel;
		audioLevel = newAudioLevel;
		boolean oldAudioLevelESet = audioLevelESet;
		audioLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__AUDIO_LEVEL, oldAudioLevel, audioLevel, !oldAudioLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAudioLevel() {
		double oldAudioLevel = audioLevel;
		boolean oldAudioLevelESet = audioLevelESet;
		audioLevel = AUDIO_LEVEL_EDEFAULT;
		audioLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.AUDIO_TYPE__AUDIO_LEVEL, oldAudioLevel, AUDIO_LEVEL_EDEFAULT, oldAudioLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAudioLevel() {
		return audioLevelESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__BEGIN, oldBegin, begin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDur() {
		return dur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDur(String newDur) {
		String oldDur = dur;
		dur = newDur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__DUR, oldDur, dur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__END, oldEnd, end));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__GROUP_ID, oldGroupId, groupId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__MASTER_ELEMENT, oldMasterElement, masterElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__NODE_TYPE, oldNodeType, nodeType, !oldNodeTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.AUDIO_TYPE__NODE_TYPE, oldNodeType, NODE_TYPE_EDEFAULT, oldNodeTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__PRESET_CLASS, oldPresetClass, presetClass, !oldPresetClassESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnimationPackage.AUDIO_TYPE__PRESET_CLASS, oldPresetClass, PRESET_CLASS_EDEFAULT, oldPresetClassESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__PRESET_ID, oldPresetId, presetId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__PRESET_SUB_TYPE, oldPresetSubType, presetSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRepeatCount() {
		return repeatCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatCount(Object newRepeatCount) {
		Object oldRepeatCount = repeatCount;
		repeatCount = newRepeatCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__REPEAT_COUNT, oldRepeatCount, repeatCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepeatDur() {
		return repeatDur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatDur(String newRepeatDur) {
		String oldRepeatDur = repeatDur;
		repeatDur = newRepeatDur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.AUDIO_TYPE__REPEAT_DUR, oldRepeatDur, repeatDur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnimationPackage.AUDIO_TYPE__AUDIO_LEVEL:
				return new Double(getAudioLevel());
			case AnimationPackage.AUDIO_TYPE__BEGIN:
				return getBegin();
			case AnimationPackage.AUDIO_TYPE__DUR:
				return getDur();
			case AnimationPackage.AUDIO_TYPE__END:
				return getEnd();
			case AnimationPackage.AUDIO_TYPE__GROUP_ID:
				return getGroupId();
			case AnimationPackage.AUDIO_TYPE__HREF:
				return getHref();
			case AnimationPackage.AUDIO_TYPE__ID:
				return getId();
			case AnimationPackage.AUDIO_TYPE__MASTER_ELEMENT:
				return getMasterElement();
			case AnimationPackage.AUDIO_TYPE__NODE_TYPE:
				return getNodeType();
			case AnimationPackage.AUDIO_TYPE__PRESET_CLASS:
				return getPresetClass();
			case AnimationPackage.AUDIO_TYPE__PRESET_ID:
				return getPresetId();
			case AnimationPackage.AUDIO_TYPE__PRESET_SUB_TYPE:
				return getPresetSubType();
			case AnimationPackage.AUDIO_TYPE__REPEAT_COUNT:
				return getRepeatCount();
			case AnimationPackage.AUDIO_TYPE__REPEAT_DUR:
				return getRepeatDur();
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
			case AnimationPackage.AUDIO_TYPE__AUDIO_LEVEL:
				setAudioLevel(((Double)newValue).doubleValue());
				return;
			case AnimationPackage.AUDIO_TYPE__BEGIN:
				setBegin((String)newValue);
				return;
			case AnimationPackage.AUDIO_TYPE__DUR:
				setDur((String)newValue);
				return;
			case AnimationPackage.AUDIO_TYPE__END:
				setEnd((String)newValue);
				return;
			case AnimationPackage.AUDIO_TYPE__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case AnimationPackage.AUDIO_TYPE__HREF:
				setHref((String)newValue);
				return;
			case AnimationPackage.AUDIO_TYPE__ID:
				setId((String)newValue);
				return;
			case AnimationPackage.AUDIO_TYPE__MASTER_ELEMENT:
				setMasterElement((String)newValue);
				return;
			case AnimationPackage.AUDIO_TYPE__NODE_TYPE:
				setNodeType((NodeTypeType)newValue);
				return;
			case AnimationPackage.AUDIO_TYPE__PRESET_CLASS:
				setPresetClass((PresetClassType)newValue);
				return;
			case AnimationPackage.AUDIO_TYPE__PRESET_ID:
				setPresetId((String)newValue);
				return;
			case AnimationPackage.AUDIO_TYPE__PRESET_SUB_TYPE:
				setPresetSubType((String)newValue);
				return;
			case AnimationPackage.AUDIO_TYPE__REPEAT_COUNT:
				setRepeatCount(newValue);
				return;
			case AnimationPackage.AUDIO_TYPE__REPEAT_DUR:
				setRepeatDur((String)newValue);
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
			case AnimationPackage.AUDIO_TYPE__AUDIO_LEVEL:
				unsetAudioLevel();
				return;
			case AnimationPackage.AUDIO_TYPE__BEGIN:
				setBegin(BEGIN_EDEFAULT);
				return;
			case AnimationPackage.AUDIO_TYPE__DUR:
				setDur(DUR_EDEFAULT);
				return;
			case AnimationPackage.AUDIO_TYPE__END:
				setEnd(END_EDEFAULT);
				return;
			case AnimationPackage.AUDIO_TYPE__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case AnimationPackage.AUDIO_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case AnimationPackage.AUDIO_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case AnimationPackage.AUDIO_TYPE__MASTER_ELEMENT:
				setMasterElement(MASTER_ELEMENT_EDEFAULT);
				return;
			case AnimationPackage.AUDIO_TYPE__NODE_TYPE:
				unsetNodeType();
				return;
			case AnimationPackage.AUDIO_TYPE__PRESET_CLASS:
				unsetPresetClass();
				return;
			case AnimationPackage.AUDIO_TYPE__PRESET_ID:
				setPresetId(PRESET_ID_EDEFAULT);
				return;
			case AnimationPackage.AUDIO_TYPE__PRESET_SUB_TYPE:
				setPresetSubType(PRESET_SUB_TYPE_EDEFAULT);
				return;
			case AnimationPackage.AUDIO_TYPE__REPEAT_COUNT:
				setRepeatCount(REPEAT_COUNT_EDEFAULT);
				return;
			case AnimationPackage.AUDIO_TYPE__REPEAT_DUR:
				setRepeatDur(REPEAT_DUR_EDEFAULT);
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
			case AnimationPackage.AUDIO_TYPE__AUDIO_LEVEL:
				return isSetAudioLevel();
			case AnimationPackage.AUDIO_TYPE__BEGIN:
				return BEGIN_EDEFAULT == null ? begin != null : !BEGIN_EDEFAULT.equals(begin);
			case AnimationPackage.AUDIO_TYPE__DUR:
				return DUR_EDEFAULT == null ? dur != null : !DUR_EDEFAULT.equals(dur);
			case AnimationPackage.AUDIO_TYPE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case AnimationPackage.AUDIO_TYPE__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case AnimationPackage.AUDIO_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case AnimationPackage.AUDIO_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AnimationPackage.AUDIO_TYPE__MASTER_ELEMENT:
				return MASTER_ELEMENT_EDEFAULT == null ? masterElement != null : !MASTER_ELEMENT_EDEFAULT.equals(masterElement);
			case AnimationPackage.AUDIO_TYPE__NODE_TYPE:
				return isSetNodeType();
			case AnimationPackage.AUDIO_TYPE__PRESET_CLASS:
				return isSetPresetClass();
			case AnimationPackage.AUDIO_TYPE__PRESET_ID:
				return PRESET_ID_EDEFAULT == null ? presetId != null : !PRESET_ID_EDEFAULT.equals(presetId);
			case AnimationPackage.AUDIO_TYPE__PRESET_SUB_TYPE:
				return PRESET_SUB_TYPE_EDEFAULT == null ? presetSubType != null : !PRESET_SUB_TYPE_EDEFAULT.equals(presetSubType);
			case AnimationPackage.AUDIO_TYPE__REPEAT_COUNT:
				return REPEAT_COUNT_EDEFAULT == null ? repeatCount != null : !REPEAT_COUNT_EDEFAULT.equals(repeatCount);
			case AnimationPackage.AUDIO_TYPE__REPEAT_DUR:
				return REPEAT_DUR_EDEFAULT == null ? repeatDur != null : !REPEAT_DUR_EDEFAULT.equals(repeatDur);
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
		result.append(" (audioLevel: ");
		if (audioLevelESet) result.append(audioLevel); else result.append("<unset>");
		result.append(", begin: ");
		result.append(begin);
		result.append(", dur: ");
		result.append(dur);
		result.append(", end: ");
		result.append(end);
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", href: ");
		result.append(href);
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
		result.append(", repeatCount: ");
		result.append(repeatCount);
		result.append(", repeatDur: ");
		result.append(repeatDur);
		result.append(')');
		return result.toString();
	}

} //AudioTypeImpl
