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
import es.tid.cim.NextHopIPRoute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Next Hop IP Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.NextHopIPRouteImpl#getRouteDerivation <em>Route Derivation</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopIPRouteImpl#getOtherDerivation <em>Other Derivation</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopIPRouteImpl#getDestinationMask <em>Destination Mask</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopIPRouteImpl#getPrefixLength <em>Prefix Length</em>}</li>
 *   <li>{@link es.tid.cim.impl.NextHopIPRouteImpl#getAddressType <em>Address Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NextHopIPRouteImpl extends NextHopRouteImpl implements NextHopIPRoute {
	/**
	 * The default value of the '{@link #getRouteDerivation() <em>Route Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDerivation()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_DERIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteDerivation() <em>Route Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteDerivation()
	 * @generated
	 * @ordered
	 */
	protected String routeDerivation = ROUTE_DERIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherDerivation() <em>Other Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDerivation()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_DERIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherDerivation() <em>Other Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDerivation()
	 * @generated
	 * @ordered
	 */
	protected String otherDerivation = OTHER_DERIVATION_EDEFAULT;

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
	 * The default value of the '{@link #getPrefixLength() <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixLength()
	 * @generated
	 * @ordered
	 */
	protected static final int PREFIX_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrefixLength() <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixLength()
	 * @generated
	 * @ordered
	 */
	protected int prefixLength = PREFIX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected String addressType = ADDRESS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NextHopIPRouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getNextHopIPRoute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRouteDerivation() {
		return routeDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteDerivation(String newRouteDerivation) {
		String oldRouteDerivation = routeDerivation;
		routeDerivation = newRouteDerivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_IP_ROUTE__ROUTE_DERIVATION, oldRouteDerivation, routeDerivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherDerivation() {
		return otherDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherDerivation(String newOtherDerivation) {
		String oldOtherDerivation = otherDerivation;
		otherDerivation = newOtherDerivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_IP_ROUTE__OTHER_DERIVATION, oldOtherDerivation, otherDerivation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_IP_ROUTE__DESTINATION_MASK, oldDestinationMask, destinationMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrefixLength() {
		return prefixLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefixLength(int newPrefixLength) {
		int oldPrefixLength = prefixLength;
		prefixLength = newPrefixLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_IP_ROUTE__PREFIX_LENGTH, oldPrefixLength, prefixLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressType() {
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressType(String newAddressType) {
		String oldAddressType = addressType;
		addressType = newAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NEXT_HOP_IP_ROUTE__ADDRESS_TYPE, oldAddressType, addressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.NEXT_HOP_IP_ROUTE__ROUTE_DERIVATION:
				return getRouteDerivation();
			case CimPackage.NEXT_HOP_IP_ROUTE__OTHER_DERIVATION:
				return getOtherDerivation();
			case CimPackage.NEXT_HOP_IP_ROUTE__DESTINATION_MASK:
				return getDestinationMask();
			case CimPackage.NEXT_HOP_IP_ROUTE__PREFIX_LENGTH:
				return getPrefixLength();
			case CimPackage.NEXT_HOP_IP_ROUTE__ADDRESS_TYPE:
				return getAddressType();
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
			case CimPackage.NEXT_HOP_IP_ROUTE__ROUTE_DERIVATION:
				setRouteDerivation((String)newValue);
				return;
			case CimPackage.NEXT_HOP_IP_ROUTE__OTHER_DERIVATION:
				setOtherDerivation((String)newValue);
				return;
			case CimPackage.NEXT_HOP_IP_ROUTE__DESTINATION_MASK:
				setDestinationMask((String)newValue);
				return;
			case CimPackage.NEXT_HOP_IP_ROUTE__PREFIX_LENGTH:
				setPrefixLength((Integer)newValue);
				return;
			case CimPackage.NEXT_HOP_IP_ROUTE__ADDRESS_TYPE:
				setAddressType((String)newValue);
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
			case CimPackage.NEXT_HOP_IP_ROUTE__ROUTE_DERIVATION:
				setRouteDerivation(ROUTE_DERIVATION_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_IP_ROUTE__OTHER_DERIVATION:
				setOtherDerivation(OTHER_DERIVATION_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_IP_ROUTE__DESTINATION_MASK:
				setDestinationMask(DESTINATION_MASK_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_IP_ROUTE__PREFIX_LENGTH:
				setPrefixLength(PREFIX_LENGTH_EDEFAULT);
				return;
			case CimPackage.NEXT_HOP_IP_ROUTE__ADDRESS_TYPE:
				setAddressType(ADDRESS_TYPE_EDEFAULT);
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
			case CimPackage.NEXT_HOP_IP_ROUTE__ROUTE_DERIVATION:
				return ROUTE_DERIVATION_EDEFAULT == null ? routeDerivation != null : !ROUTE_DERIVATION_EDEFAULT.equals(routeDerivation);
			case CimPackage.NEXT_HOP_IP_ROUTE__OTHER_DERIVATION:
				return OTHER_DERIVATION_EDEFAULT == null ? otherDerivation != null : !OTHER_DERIVATION_EDEFAULT.equals(otherDerivation);
			case CimPackage.NEXT_HOP_IP_ROUTE__DESTINATION_MASK:
				return DESTINATION_MASK_EDEFAULT == null ? destinationMask != null : !DESTINATION_MASK_EDEFAULT.equals(destinationMask);
			case CimPackage.NEXT_HOP_IP_ROUTE__PREFIX_LENGTH:
				return prefixLength != PREFIX_LENGTH_EDEFAULT;
			case CimPackage.NEXT_HOP_IP_ROUTE__ADDRESS_TYPE:
				return ADDRESS_TYPE_EDEFAULT == null ? addressType != null : !ADDRESS_TYPE_EDEFAULT.equals(addressType);
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
		result.append(" (routeDerivation: ");
		result.append(routeDerivation);
		result.append(", otherDerivation: ");
		result.append(otherDerivation);
		result.append(", destinationMask: ");
		result.append(destinationMask);
		result.append(", prefixLength: ");
		result.append(prefixLength);
		result.append(", addressType: ");
		result.append(addressType);
		result.append(')');
		return result.toString();
	}

} //NextHopIPRouteImpl
