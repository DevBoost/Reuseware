/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.svg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.svg.StopType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.StopTypeImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.StopTypeImpl#getStopColor <em>Stop Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.StopTypeImpl#getStopOpacity <em>Stop Opacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StopTypeImpl extends EObjectImpl implements StopType {
	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Object OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Object offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopColor() <em>Stop Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopColor()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopColor() <em>Stop Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopColor()
	 * @generated
	 * @ordered
	 */
	protected String stopColor = STOP_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopOpacity() <em>Stop Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final double STOP_OPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStopOpacity() <em>Stop Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopOpacity()
	 * @generated
	 * @ordered
	 */
	protected double stopOpacity = STOP_OPACITY_EDEFAULT;

	/**
	 * This is true if the Stop Opacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stopOpacityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.STOP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Object newOffset) {
		Object oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.STOP_TYPE__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStopColor() {
		return stopColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopColor(String newStopColor) {
		String oldStopColor = stopColor;
		stopColor = newStopColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.STOP_TYPE__STOP_COLOR, oldStopColor, stopColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStopOpacity() {
		return stopOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopOpacity(double newStopOpacity) {
		double oldStopOpacity = stopOpacity;
		stopOpacity = newStopOpacity;
		boolean oldStopOpacityESet = stopOpacityESet;
		stopOpacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.STOP_TYPE__STOP_OPACITY, oldStopOpacity, stopOpacity, !oldStopOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStopOpacity() {
		double oldStopOpacity = stopOpacity;
		boolean oldStopOpacityESet = stopOpacityESet;
		stopOpacity = STOP_OPACITY_EDEFAULT;
		stopOpacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.STOP_TYPE__STOP_OPACITY, oldStopOpacity, STOP_OPACITY_EDEFAULT, oldStopOpacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStopOpacity() {
		return stopOpacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.STOP_TYPE__OFFSET:
				return getOffset();
			case SvgPackage.STOP_TYPE__STOP_COLOR:
				return getStopColor();
			case SvgPackage.STOP_TYPE__STOP_OPACITY:
				return new Double(getStopOpacity());
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
			case SvgPackage.STOP_TYPE__OFFSET:
				setOffset(newValue);
				return;
			case SvgPackage.STOP_TYPE__STOP_COLOR:
				setStopColor((String)newValue);
				return;
			case SvgPackage.STOP_TYPE__STOP_OPACITY:
				setStopOpacity(((Double)newValue).doubleValue());
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
			case SvgPackage.STOP_TYPE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case SvgPackage.STOP_TYPE__STOP_COLOR:
				setStopColor(STOP_COLOR_EDEFAULT);
				return;
			case SvgPackage.STOP_TYPE__STOP_OPACITY:
				unsetStopOpacity();
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
			case SvgPackage.STOP_TYPE__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case SvgPackage.STOP_TYPE__STOP_COLOR:
				return STOP_COLOR_EDEFAULT == null ? stopColor != null : !STOP_COLOR_EDEFAULT.equals(stopColor);
			case SvgPackage.STOP_TYPE__STOP_OPACITY:
				return isSetStopOpacity();
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
		result.append(" (offset: ");
		result.append(offset);
		result.append(", stopColor: ");
		result.append(stopColor);
		result.append(", stopOpacity: ");
		if (stopOpacityESet) result.append(stopOpacity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StopTypeImpl
