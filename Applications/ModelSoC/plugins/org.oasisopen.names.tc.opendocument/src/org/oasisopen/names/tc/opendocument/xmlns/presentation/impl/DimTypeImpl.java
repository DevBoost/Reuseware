/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dim Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DimTypeImpl#getSound <em>Sound</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DimTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.DimTypeImpl#getShapeId <em>Shape Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimTypeImpl extends EObjectImpl implements DimType {
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
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.DIM_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.DIM_TYPE__SOUND, oldSound, newSound);
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
				msgs = ((InternalEObject)sound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.DIM_TYPE__SOUND, null, msgs);
			if (newSound != null)
				msgs = ((InternalEObject)newSound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.DIM_TYPE__SOUND, null, msgs);
			msgs = basicSetSound(newSound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DIM_TYPE__SOUND, newSound, newSound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DIM_TYPE__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.DIM_TYPE__SHAPE_ID, oldShapeId, shapeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.DIM_TYPE__SOUND:
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
			case PresentationPackage.DIM_TYPE__SOUND:
				return getSound();
			case PresentationPackage.DIM_TYPE__COLOR:
				return getColor();
			case PresentationPackage.DIM_TYPE__SHAPE_ID:
				return getShapeId();
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
			case PresentationPackage.DIM_TYPE__SOUND:
				setSound((SoundType)newValue);
				return;
			case PresentationPackage.DIM_TYPE__COLOR:
				setColor((String)newValue);
				return;
			case PresentationPackage.DIM_TYPE__SHAPE_ID:
				setShapeId((String)newValue);
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
			case PresentationPackage.DIM_TYPE__SOUND:
				setSound((SoundType)null);
				return;
			case PresentationPackage.DIM_TYPE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case PresentationPackage.DIM_TYPE__SHAPE_ID:
				setShapeId(SHAPE_ID_EDEFAULT);
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
			case PresentationPackage.DIM_TYPE__SOUND:
				return sound != null;
			case PresentationPackage.DIM_TYPE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case PresentationPackage.DIM_TYPE__SHAPE_ID:
				return SHAPE_ID_EDEFAULT == null ? shapeId != null : !SHAPE_ID_EDEFAULT.equals(shapeId);
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
		result.append(" (color: ");
		result.append(color);
		result.append(", shapeId: ");
		result.append(shapeId);
		result.append(')');
		return result.toString();
	}

} //DimTypeImpl
