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
import es.tid.cim.MPLSProtocolEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MPLS Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.MPLSProtocolEndpointImpl#isOverruleLSR <em>Overrule LSR</em>}</li>
 *   <li>{@link es.tid.cim.impl.MPLSProtocolEndpointImpl#getTotalBandwidth <em>Total Bandwidth</em>}</li>
 *   <li>{@link es.tid.cim.impl.MPLSProtocolEndpointImpl#getAvailableBandwidth <em>Available Bandwidth</em>}</li>
 *   <li>{@link es.tid.cim.impl.MPLSProtocolEndpointImpl#getResourceClasses <em>Resource Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MPLSProtocolEndpointImpl extends ProtocolEndpointImpl implements MPLSProtocolEndpoint {
	/**
	 * The default value of the '{@link #isOverruleLSR() <em>Overrule LSR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverruleLSR()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERRULE_LSR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverruleLSR() <em>Overrule LSR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverruleLSR()
	 * @generated
	 * @ordered
	 */
	protected boolean overruleLSR = OVERRULE_LSR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalBandwidth() <em>Total Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_BANDWIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalBandwidth() <em>Total Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBandwidth()
	 * @generated
	 * @ordered
	 */
	protected int totalBandwidth = TOTAL_BANDWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableBandwidth() <em>Available Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_BANDWIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableBandwidth() <em>Available Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableBandwidth()
	 * @generated
	 * @ordered
	 */
	protected int availableBandwidth = AVAILABLE_BANDWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceClasses() <em>Resource Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceClasses()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOURCE_CLASSES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResourceClasses() <em>Resource Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceClasses()
	 * @generated
	 * @ordered
	 */
	protected int resourceClasses = RESOURCE_CLASSES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPLSProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getMPLSProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverruleLSR() {
		return overruleLSR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverruleLSR(boolean newOverruleLSR) {
		boolean oldOverruleLSR = overruleLSR;
		overruleLSR = newOverruleLSR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.MPLS_PROTOCOL_ENDPOINT__OVERRULE_LSR, oldOverruleLSR, overruleLSR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalBandwidth() {
		return totalBandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalBandwidth(int newTotalBandwidth) {
		int oldTotalBandwidth = totalBandwidth;
		totalBandwidth = newTotalBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.MPLS_PROTOCOL_ENDPOINT__TOTAL_BANDWIDTH, oldTotalBandwidth, totalBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAvailableBandwidth() {
		return availableBandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableBandwidth(int newAvailableBandwidth) {
		int oldAvailableBandwidth = availableBandwidth;
		availableBandwidth = newAvailableBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.MPLS_PROTOCOL_ENDPOINT__AVAILABLE_BANDWIDTH, oldAvailableBandwidth, availableBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResourceClasses() {
		return resourceClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceClasses(int newResourceClasses) {
		int oldResourceClasses = resourceClasses;
		resourceClasses = newResourceClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.MPLS_PROTOCOL_ENDPOINT__RESOURCE_CLASSES, oldResourceClasses, resourceClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__OVERRULE_LSR:
				return isOverruleLSR();
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__TOTAL_BANDWIDTH:
				return getTotalBandwidth();
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__AVAILABLE_BANDWIDTH:
				return getAvailableBandwidth();
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__RESOURCE_CLASSES:
				return getResourceClasses();
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
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__OVERRULE_LSR:
				setOverruleLSR((Boolean)newValue);
				return;
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__TOTAL_BANDWIDTH:
				setTotalBandwidth((Integer)newValue);
				return;
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__AVAILABLE_BANDWIDTH:
				setAvailableBandwidth((Integer)newValue);
				return;
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__RESOURCE_CLASSES:
				setResourceClasses((Integer)newValue);
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
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__OVERRULE_LSR:
				setOverruleLSR(OVERRULE_LSR_EDEFAULT);
				return;
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__TOTAL_BANDWIDTH:
				setTotalBandwidth(TOTAL_BANDWIDTH_EDEFAULT);
				return;
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__AVAILABLE_BANDWIDTH:
				setAvailableBandwidth(AVAILABLE_BANDWIDTH_EDEFAULT);
				return;
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__RESOURCE_CLASSES:
				setResourceClasses(RESOURCE_CLASSES_EDEFAULT);
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
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__OVERRULE_LSR:
				return overruleLSR != OVERRULE_LSR_EDEFAULT;
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__TOTAL_BANDWIDTH:
				return totalBandwidth != TOTAL_BANDWIDTH_EDEFAULT;
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__AVAILABLE_BANDWIDTH:
				return availableBandwidth != AVAILABLE_BANDWIDTH_EDEFAULT;
			case CimPackage.MPLS_PROTOCOL_ENDPOINT__RESOURCE_CLASSES:
				return resourceClasses != RESOURCE_CLASSES_EDEFAULT;
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
		result.append(" (overruleLSR: ");
		result.append(overruleLSR);
		result.append(", totalBandwidth: ");
		result.append(totalBandwidth);
		result.append(", availableBandwidth: ");
		result.append(availableBandwidth);
		result.append(", resourceClasses: ");
		result.append(resourceClasses);
		result.append(')');
		return result.toString();
	}

} //MPLSProtocolEndpointImpl
