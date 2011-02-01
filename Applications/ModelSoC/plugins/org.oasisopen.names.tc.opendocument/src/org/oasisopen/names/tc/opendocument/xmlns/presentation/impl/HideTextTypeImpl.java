/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation.impl;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffectDirections;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffects;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hide Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideTextTypeImpl#getSound <em>Sound</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideTextTypeImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideTextTypeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideTextTypeImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideTextTypeImpl#getPathId <em>Path Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideTextTypeImpl#getShapeId <em>Shape Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideTextTypeImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.HideTextTypeImpl#getStartScale <em>Start Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HideTextTypeImpl extends EObjectImpl implements HideTextType {
	/**
	 * The cached value of the '{@link #getSound() <em>Sound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSound()
	 * @generated
	 * @ordered
	 */
	protected SoundType sound;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected Duration delay = DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationEffectDirections DIRECTION_EDEFAULT = PresentationEffectDirections.NONE;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected PresentationEffectDirections direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationEffects EFFECT_EDEFAULT = PresentationEffects.NONE;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected PresentationEffects effect = EFFECT_EDEFAULT;

	/**
	 * This is true if the Effect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effectESet;

	/**
	 * The default value of the '{@link #getPathId() <em>Path Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathId()
	 * @generated
	 * @ordered
	 */
	protected static final Object PATH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathId() <em>Path Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathId()
	 * @generated
	 * @ordered
	 */
	protected Object pathId = PATH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShapeId() <em>Shape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHAPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShapeId() <em>Shape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeId()
	 * @generated
	 * @ordered
	 */
	protected String shapeId = SHAPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationSpeeds SPEED_EDEFAULT = PresentationSpeeds.MEDIUM;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected PresentationSpeeds speed = SPEED_EDEFAULT;

	/**
	 * This is true if the Speed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean speedESet;

	/**
	 * The default value of the '{@link #getStartScale() <em>Start Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartScale()
	 * @generated
	 * @ordered
	 */
	protected static final String START_SCALE_EDEFAULT = "100%";

	/**
	 * The cached value of the '{@link #getStartScale() <em>Start Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartScale()
	 * @generated
	 * @ordered
	 */
	protected String startScale = START_SCALE_EDEFAULT;

	/**
	 * This is true if the Start Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startScaleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HideTextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.HIDE_TEXT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundType getSound() {
		return sound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSound(SoundType newSound, NotificationChain msgs) {
		SoundType oldSound = sound;
		sound = newSound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.HIDE_TEXT_TYPE__SOUND, oldSound, newSound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSound(SoundType newSound) {
		if (newSound != sound) {
			NotificationChain msgs = null;
			if (sound != null)
				msgs = ((InternalEObject)sound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.HIDE_TEXT_TYPE__SOUND, null, msgs);
			if (newSound != null)
				msgs = ((InternalEObject)newSound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.HIDE_TEXT_TYPE__SOUND, null, msgs);
			msgs = basicSetSound(newSound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.HIDE_TEXT_TYPE__SOUND, newSound, newSound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(Duration newDelay) {
		Duration oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.HIDE_TEXT_TYPE__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationEffectDirections getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(PresentationEffectDirections newDirection) {
		PresentationEffectDirections oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.HIDE_TEXT_TYPE__DIRECTION, oldDirection, direction, !oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirection() {
		PresentationEffectDirections oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.HIDE_TEXT_TYPE__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationEffects getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(PresentationEffects newEffect) {
		PresentationEffects oldEffect = effect;
		effect = newEffect == null ? EFFECT_EDEFAULT : newEffect;
		boolean oldEffectESet = effectESet;
		effectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.HIDE_TEXT_TYPE__EFFECT, oldEffect, effect, !oldEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffect() {
		PresentationEffects oldEffect = effect;
		boolean oldEffectESet = effectESet;
		effect = EFFECT_EDEFAULT;
		effectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.HIDE_TEXT_TYPE__EFFECT, oldEffect, EFFECT_EDEFAULT, oldEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffect() {
		return effectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPathId() {
		return pathId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathId(Object newPathId) {
		Object oldPathId = pathId;
		pathId = newPathId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.HIDE_TEXT_TYPE__PATH_ID, oldPathId, pathId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShapeId() {
		return shapeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeId(String newShapeId) {
		String oldShapeId = shapeId;
		shapeId = newShapeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.HIDE_TEXT_TYPE__SHAPE_ID, oldShapeId, shapeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationSpeeds getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(PresentationSpeeds newSpeed) {
		PresentationSpeeds oldSpeed = speed;
		speed = newSpeed == null ? SPEED_EDEFAULT : newSpeed;
		boolean oldSpeedESet = speedESet;
		speedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.HIDE_TEXT_TYPE__SPEED, oldSpeed, speed, !oldSpeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpeed() {
		PresentationSpeeds oldSpeed = speed;
		boolean oldSpeedESet = speedESet;
		speed = SPEED_EDEFAULT;
		speedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.HIDE_TEXT_TYPE__SPEED, oldSpeed, SPEED_EDEFAULT, oldSpeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpeed() {
		return speedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartScale() {
		return startScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartScale(String newStartScale) {
		String oldStartScale = startScale;
		startScale = newStartScale;
		boolean oldStartScaleESet = startScaleESet;
		startScaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.HIDE_TEXT_TYPE__START_SCALE, oldStartScale, startScale, !oldStartScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartScale() {
		String oldStartScale = startScale;
		boolean oldStartScaleESet = startScaleESet;
		startScale = START_SCALE_EDEFAULT;
		startScaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.HIDE_TEXT_TYPE__START_SCALE, oldStartScale, START_SCALE_EDEFAULT, oldStartScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartScale() {
		return startScaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.HIDE_TEXT_TYPE__SOUND:
				return basicSetSound(null, msgs);
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
			case PresentationPackage.HIDE_TEXT_TYPE__SOUND:
				return getSound();
			case PresentationPackage.HIDE_TEXT_TYPE__DELAY:
				return getDelay();
			case PresentationPackage.HIDE_TEXT_TYPE__DIRECTION:
				return getDirection();
			case PresentationPackage.HIDE_TEXT_TYPE__EFFECT:
				return getEffect();
			case PresentationPackage.HIDE_TEXT_TYPE__PATH_ID:
				return getPathId();
			case PresentationPackage.HIDE_TEXT_TYPE__SHAPE_ID:
				return getShapeId();
			case PresentationPackage.HIDE_TEXT_TYPE__SPEED:
				return getSpeed();
			case PresentationPackage.HIDE_TEXT_TYPE__START_SCALE:
				return getStartScale();
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
			case PresentationPackage.HIDE_TEXT_TYPE__SOUND:
				setSound((SoundType)newValue);
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__DELAY:
				setDelay((Duration)newValue);
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__DIRECTION:
				setDirection((PresentationEffectDirections)newValue);
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__EFFECT:
				setEffect((PresentationEffects)newValue);
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__PATH_ID:
				setPathId(newValue);
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__SHAPE_ID:
				setShapeId((String)newValue);
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__SPEED:
				setSpeed((PresentationSpeeds)newValue);
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__START_SCALE:
				setStartScale((String)newValue);
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
			case PresentationPackage.HIDE_TEXT_TYPE__SOUND:
				setSound((SoundType)null);
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__DIRECTION:
				unsetDirection();
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__EFFECT:
				unsetEffect();
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__PATH_ID:
				setPathId(PATH_ID_EDEFAULT);
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__SHAPE_ID:
				setShapeId(SHAPE_ID_EDEFAULT);
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__SPEED:
				unsetSpeed();
				return;
			case PresentationPackage.HIDE_TEXT_TYPE__START_SCALE:
				unsetStartScale();
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
			case PresentationPackage.HIDE_TEXT_TYPE__SOUND:
				return sound != null;
			case PresentationPackage.HIDE_TEXT_TYPE__DELAY:
				return DELAY_EDEFAULT == null ? delay != null : !DELAY_EDEFAULT.equals(delay);
			case PresentationPackage.HIDE_TEXT_TYPE__DIRECTION:
				return isSetDirection();
			case PresentationPackage.HIDE_TEXT_TYPE__EFFECT:
				return isSetEffect();
			case PresentationPackage.HIDE_TEXT_TYPE__PATH_ID:
				return PATH_ID_EDEFAULT == null ? pathId != null : !PATH_ID_EDEFAULT.equals(pathId);
			case PresentationPackage.HIDE_TEXT_TYPE__SHAPE_ID:
				return SHAPE_ID_EDEFAULT == null ? shapeId != null : !SHAPE_ID_EDEFAULT.equals(shapeId);
			case PresentationPackage.HIDE_TEXT_TYPE__SPEED:
				return isSetSpeed();
			case PresentationPackage.HIDE_TEXT_TYPE__START_SCALE:
				return isSetStartScale();
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
		result.append(" (delay: ");
		result.append(delay);
		result.append(", direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(", effect: ");
		if (effectESet) result.append(effect); else result.append("<unset>");
		result.append(", pathId: ");
		result.append(pathId);
		result.append(", shapeId: ");
		result.append(shapeId);
		result.append(", speed: ");
		if (speedESet) result.append(speed); else result.append("<unset>");
		result.append(", startScale: ");
		if (startScaleESet) result.append(startScale); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HideTextTypeImpl
