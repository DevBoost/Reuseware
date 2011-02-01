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
import es.tid.cim.NextHopRouting;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Next Hop Routing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.NextHopRoutingImpl#getDestinationAddress <em>Destination Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopRoutingImpl#getDestinationMask <em>Destination Mask</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopRoutingImpl#getNextHop <em>Next Hop</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopRoutingImpl#isIsStatic <em>Is Static</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NextHopRoutingImpl extends LogicalElementImpl implements NextHopRouting {
	/**
	 * The default value of the '{@link #getDestinationAddress() <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationAddress() <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected String destinationAddress = DESTINATION_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationMask() <em>Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationMask()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationMask() <em>Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationMask()
	 * @generated
	 * @ordered
	 */
	protected String destinationMask = DESTINATION_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextHop() <em>Next Hop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextHop()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_HOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextHop() <em>Next Hop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextHop()
	 * @generated
	 * @ordered
	 */
	protected String nextHop = NEXT_HOP_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NextHopRoutingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getNextHopRouting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationAddress(String newDestinationAddress) {
		String oldDestinationAddress = destinationAddress;
		destinationAddress = newDestinationAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_ROUTING__DESTINATION_ADDRESS, oldDestinationAddress, destinationAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationMask() {
		return destinationMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationMask(String newDestinationMask) {
		String oldDestinationMask = destinationMask;
		destinationMask = newDestinationMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_ROUTING__DESTINATION_MASK, oldDestinationMask, destinationMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextHop() {
		return nextHop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextHop(String newNextHop) {
		String oldNextHop = nextHop;
		nextHop = newNextHop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_ROUTING__NEXT_HOP, oldNextHop, nextHop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_ROUTING__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.NEXT_HOP_ROUTING__DESTINATION_ADDRESS:
				return getDestinationAddress();
			case CimPackage.NEXT_HOP_ROUTING__DESTINATION_MASK:
				return getDestinationMask();
			case CimPackage.NEXT_HOP_ROUTING__NEXT_HOP:
				return getNextHop();
			case CimPackage.NEXT_HOP_ROUTING__IS_STATIC:
				return isIsStatic();
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
			case CimPackage.NEXT_HOP_ROUTING__DESTINATION_ADDRESS:
				setDestinationAddress((String)newValue);
				return;
			case CimPackage.NEXT_HOP_ROUTING__DESTINATION_MASK:
				setDestinationMask((String)newValue);
				return;
			case CimPackage.NEXT_HOP_ROUTING__NEXT_HOP:
				setNextHop((String)newValue);
				return;
			case CimPackage.NEXT_HOP_ROUTING__IS_STATIC:
				setIsStatic((Boolean)newValue);
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
			case CimPackage.NEXT_HOP_ROUTING__DESTINATION_ADDRESS:
				setDestinationAddress(DESTINATION_ADDRESS_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_ROUTING__DESTINATION_MASK:
				setDestinationMask(DESTINATION_MASK_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_ROUTING__NEXT_HOP:
				setNextHop(NEXT_HOP_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_ROUTING__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
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
			case CimPackage.NEXT_HOP_ROUTING__DESTINATION_ADDRESS:
				return DESTINATION_ADDRESS_EDEFAULT == null ? destinationAddress != null : !DESTINATION_ADDRESS_EDEFAULT.equals(destinationAddress);
			case CimPackage.NEXT_HOP_ROUTING__DESTINATION_MASK:
				return DESTINATION_MASK_EDEFAULT == null ? destinationMask != null : !DESTINATION_MASK_EDEFAULT.equals(destinationMask);
			case CimPackage.NEXT_HOP_ROUTING__NEXT_HOP:
				return NEXT_HOP_EDEFAULT == null ? nextHop != null : !NEXT_HOP_EDEFAULT.equals(nextHop);
			case CimPackage.NEXT_HOP_ROUTING__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
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
		result.append(" (destinationAddress: ");
		result.append(destinationAddress);
		result.append(", destinationMask: ");
		result.append(destinationMask);
		result.append(", nextHop: ");
		result.append(nextHop);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(')');
		return result.toString();
	}

} //NextHopRoutingImpl
