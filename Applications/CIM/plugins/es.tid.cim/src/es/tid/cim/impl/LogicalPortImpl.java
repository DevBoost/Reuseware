/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.tid.cim.CimPackage;
import es.tid.cim.EnumPortType;
import es.tid.cim.LogicalPort;
import es.tid.cim.ProtocolEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.LogicalPortImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalPortImpl#getMaxSpeed <em>Max Speed</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalPortImpl#getRequestedSpeed <em>Requested Speed</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalPortImpl#getUsageRestriction <em>Usage Restriction</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalPortImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalPortImpl#getOtherPortType <em>Other Port Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.LogicalPortImpl#getPortImplementsEndPoint <em>Port Implements End Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalPortImpl extends LogicalDeviceImpl implements LogicalPort {
	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxSpeed = MAX_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestedSpeed() <em>Requested Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUESTED_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequestedSpeed() <em>Requested Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedSpeed()
	 * @generated
	 * @ordered
	 */
	protected int requestedSpeed = REQUESTED_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsageRestriction() <em>Usage Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageRestriction()
	 * @generated
	 * @ordered
	 */
	protected static final int USAGE_RESTRICTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUsageRestriction() <em>Usage Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageRestriction()
	 * @generated
	 * @ordered
	 */
	protected int usageRestriction = USAGE_RESTRICTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumPortType PORT_TYPE_EDEFAULT = EnumPortType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected EnumPortType portType = PORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPortType() <em>Other Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPortType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPortType() <em>Other Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPortType()
	 * @generated
	 * @ordered
	 */
	protected String otherPortType = OTHER_PORT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortImplementsEndPoint() <em>Port Implements End Point</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortImplementsEndPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolEndpoint> portImplementsEndPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getLogicalPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(BigInteger newSpeed) {
		BigInteger oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_PORT__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSpeed(BigInteger newMaxSpeed) {
		BigInteger oldMaxSpeed = maxSpeed;
		maxSpeed = newMaxSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_PORT__MAX_SPEED, oldMaxSpeed, maxSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequestedSpeed() {
		return requestedSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedSpeed(int newRequestedSpeed) {
		int oldRequestedSpeed = requestedSpeed;
		requestedSpeed = newRequestedSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_PORT__REQUESTED_SPEED, oldRequestedSpeed, requestedSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUsageRestriction() {
		return usageRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageRestriction(int newUsageRestriction) {
		int oldUsageRestriction = usageRestriction;
		usageRestriction = newUsageRestriction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_PORT__USAGE_RESTRICTION, oldUsageRestriction, usageRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumPortType getPortType() {
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortType(EnumPortType newPortType) {
		EnumPortType oldPortType = portType;
		portType = newPortType == null ? PORT_TYPE_EDEFAULT : newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_PORT__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherPortType() {
		return otherPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherPortType(String newOtherPortType) {
		String oldOtherPortType = otherPortType;
		otherPortType = newOtherPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LOGICAL_PORT__OTHER_PORT_TYPE, oldOtherPortType, otherPortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolEndpoint> getPortImplementsEndPoint() {
		if (portImplementsEndPoint == null) {
			portImplementsEndPoint = new EObjectResolvingEList<ProtocolEndpoint>(ProtocolEndpoint.class, this, CimPackage.LOGICAL_PORT__PORT_IMPLEMENTS_END_POINT);
		}
		return portImplementsEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.LOGICAL_PORT__SPEED:
				return getSpeed();
			case CimPackage.LOGICAL_PORT__MAX_SPEED:
				return getMaxSpeed();
			case CimPackage.LOGICAL_PORT__REQUESTED_SPEED:
				return getRequestedSpeed();
			case CimPackage.LOGICAL_PORT__USAGE_RESTRICTION:
				return getUsageRestriction();
			case CimPackage.LOGICAL_PORT__PORT_TYPE:
				return getPortType();
			case CimPackage.LOGICAL_PORT__OTHER_PORT_TYPE:
				return getOtherPortType();
			case CimPackage.LOGICAL_PORT__PORT_IMPLEMENTS_END_POINT:
				return getPortImplementsEndPoint();
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
			case CimPackage.LOGICAL_PORT__SPEED:
				setSpeed((BigInteger)newValue);
				return;
			case CimPackage.LOGICAL_PORT__MAX_SPEED:
				setMaxSpeed((BigInteger)newValue);
				return;
			case CimPackage.LOGICAL_PORT__REQUESTED_SPEED:
				setRequestedSpeed((Integer)newValue);
				return;
			case CimPackage.LOGICAL_PORT__USAGE_RESTRICTION:
				setUsageRestriction((Integer)newValue);
				return;
			case CimPackage.LOGICAL_PORT__PORT_TYPE:
				setPortType((EnumPortType)newValue);
				return;
			case CimPackage.LOGICAL_PORT__OTHER_PORT_TYPE:
				setOtherPortType((String)newValue);
				return;
			case CimPackage.LOGICAL_PORT__PORT_IMPLEMENTS_END_POINT:
				getPortImplementsEndPoint().clear();
				getPortImplementsEndPoint().addAll((Collection<? extends ProtocolEndpoint>)newValue);
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
			case CimPackage.LOGICAL_PORT__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case CimPackage.LOGICAL_PORT__MAX_SPEED:
				setMaxSpeed(MAX_SPEED_EDEFAULT);
				return;
			case CimPackage.LOGICAL_PORT__REQUESTED_SPEED:
				setRequestedSpeed(REQUESTED_SPEED_EDEFAULT);
				return;
			case CimPackage.LOGICAL_PORT__USAGE_RESTRICTION:
				setUsageRestriction(USAGE_RESTRICTION_EDEFAULT);
				return;
			case CimPackage.LOGICAL_PORT__PORT_TYPE:
				setPortType(PORT_TYPE_EDEFAULT);
				return;
			case CimPackage.LOGICAL_PORT__OTHER_PORT_TYPE:
				setOtherPortType(OTHER_PORT_TYPE_EDEFAULT);
				return;
			case CimPackage.LOGICAL_PORT__PORT_IMPLEMENTS_END_POINT:
				getPortImplementsEndPoint().clear();
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
			case CimPackage.LOGICAL_PORT__SPEED:
				return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
			case CimPackage.LOGICAL_PORT__MAX_SPEED:
				return MAX_SPEED_EDEFAULT == null ? maxSpeed != null : !MAX_SPEED_EDEFAULT.equals(maxSpeed);
			case CimPackage.LOGICAL_PORT__REQUESTED_SPEED:
				return requestedSpeed != REQUESTED_SPEED_EDEFAULT;
			case CimPackage.LOGICAL_PORT__USAGE_RESTRICTION:
				return usageRestriction != USAGE_RESTRICTION_EDEFAULT;
			case CimPackage.LOGICAL_PORT__PORT_TYPE:
				return portType != PORT_TYPE_EDEFAULT;
			case CimPackage.LOGICAL_PORT__OTHER_PORT_TYPE:
				return OTHER_PORT_TYPE_EDEFAULT == null ? otherPortType != null : !OTHER_PORT_TYPE_EDEFAULT.equals(otherPortType);
			case CimPackage.LOGICAL_PORT__PORT_IMPLEMENTS_END_POINT:
				return portImplementsEndPoint != null && !portImplementsEndPoint.isEmpty();
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
		result.append(" (speed: ");
		result.append(speed);
		result.append(", maxSpeed: ");
		result.append(maxSpeed);
		result.append(", requestedSpeed: ");
		result.append(requestedSpeed);
		result.append(", usageRestriction: ");
		result.append(usageRestriction);
		result.append(", portType: ");
		result.append(portType);
		result.append(", otherPortType: ");
		result.append(otherPortType);
		result.append(')');
		return result.toString();
	}

} //LogicalPortImpl
