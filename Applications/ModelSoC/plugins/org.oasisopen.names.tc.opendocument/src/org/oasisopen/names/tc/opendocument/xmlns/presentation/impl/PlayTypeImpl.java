/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PlayType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Play Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlayTypeImpl#getShapeId <em>Shape Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlayTypeImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayTypeImpl extends EObjectImpl implements PlayType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.PLAY_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PLAY_TYPE__SHAPE_ID, oldShapeId, shapeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PLAY_TYPE__SPEED, oldSpeed, speed, !oldSpeedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.PLAY_TYPE__SPEED, oldSpeed, SPEED_EDEFAULT, oldSpeedESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.PLAY_TYPE__SHAPE_ID:
				return getShapeId();
			case PresentationPackage.PLAY_TYPE__SPEED:
				return getSpeed();
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
			case PresentationPackage.PLAY_TYPE__SHAPE_ID:
				setShapeId((String)newValue);
				return;
			case PresentationPackage.PLAY_TYPE__SPEED:
				setSpeed((PresentationSpeeds)newValue);
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
			case PresentationPackage.PLAY_TYPE__SHAPE_ID:
				setShapeId(SHAPE_ID_EDEFAULT);
				return;
			case PresentationPackage.PLAY_TYPE__SPEED:
				unsetSpeed();
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
			case PresentationPackage.PLAY_TYPE__SHAPE_ID:
				return SHAPE_ID_EDEFAULT == null ? shapeId != null : !SHAPE_ID_EDEFAULT.equals(shapeId);
			case PresentationPackage.PLAY_TYPE__SPEED:
				return isSetSpeed();
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
		result.append(" (shapeId: ");
		result.append(shapeId);
		result.append(", speed: ");
		if (speedESet) result.append(speed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PlayTypeImpl
