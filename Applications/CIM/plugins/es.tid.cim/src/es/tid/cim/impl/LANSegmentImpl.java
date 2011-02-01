/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.tid.cim.CimPackage;
import es.tid.cim.LANEndpoint;
import es.tid.cim.LANSegment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LAN Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.LANSegmentImpl#getLANID <em>LANID</em>}</li>
 *   <li>{@link es.tid.cim.impl.LANSegmentImpl#getLANType <em>LAN Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.LANSegmentImpl#getOtherLANType <em>Other LAN Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.LANSegmentImpl#getInSegment <em>In Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LANSegmentImpl extends LogicalNetworkImpl implements LANSegment {
	/**
	 * The default value of the '{@link #getLANID() <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANID()
	 * @generated
	 * @ordered
	 */
	protected static final String LANID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLANID() <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANID()
	 * @generated
	 * @ordered
	 */
	protected String lanid = LANID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLANType() <em>LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANType()
	 * @generated
	 * @ordered
	 */
	protected static final String LAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLANType() <em>LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANType()
	 * @generated
	 * @ordered
	 */
	protected String lanType = LAN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLANType() <em>Other LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLANType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLANType() <em>Other LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLANType()
	 * @generated
	 * @ordered
	 */
	protected String otherLANType = OTHER_LAN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInSegment() <em>In Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<LANEndpoint> inSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LANSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getLANSegment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLANID() {
		return lanid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLANID(String newLANID) {
		String oldLANID = lanid;
		lanid = newLANID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_SEGMENT__LANID, oldLANID, lanid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLANType() {
		return lanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLANType(String newLANType) {
		String oldLANType = lanType;
		lanType = newLANType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_SEGMENT__LAN_TYPE, oldLANType, lanType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherLANType() {
		return otherLANType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherLANType(String newOtherLANType) {
		String oldOtherLANType = otherLANType;
		otherLANType = newOtherLANType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.LAN_SEGMENT__OTHER_LAN_TYPE, oldOtherLANType, otherLANType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LANEndpoint> getInSegment() {
		if (inSegment == null) {
			inSegment = new EObjectContainmentEList<LANEndpoint>(LANEndpoint.class, this, CimPackage.LAN_SEGMENT__IN_SEGMENT);
		}
		return inSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CimPackage.LAN_SEGMENT__IN_SEGMENT:
				return ((InternalEList<?>)getInSegment()).basicRemove(otherEnd, msgs);
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
			case CimPackage.LAN_SEGMENT__LANID:
				return getLANID();
			case CimPackage.LAN_SEGMENT__LAN_TYPE:
				return getLANType();
			case CimPackage.LAN_SEGMENT__OTHER_LAN_TYPE:
				return getOtherLANType();
			case CimPackage.LAN_SEGMENT__IN_SEGMENT:
				return getInSegment();
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
			case CimPackage.LAN_SEGMENT__LANID:
				setLANID((String)newValue);
				return;
			case CimPackage.LAN_SEGMENT__LAN_TYPE:
				setLANType((String)newValue);
				return;
			case CimPackage.LAN_SEGMENT__OTHER_LAN_TYPE:
				setOtherLANType((String)newValue);
				return;
			case CimPackage.LAN_SEGMENT__IN_SEGMENT:
				getInSegment().clear();
				getInSegment().addAll((Collection<? extends LANEndpoint>)newValue);
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
			case CimPackage.LAN_SEGMENT__LANID:
				setLANID(LANID_EDEFAULT);
				return;
			case CimPackage.LAN_SEGMENT__LAN_TYPE:
				setLANType(LAN_TYPE_EDEFAULT);
				return;
			case CimPackage.LAN_SEGMENT__OTHER_LAN_TYPE:
				setOtherLANType(OTHER_LAN_TYPE_EDEFAULT);
				return;
			case CimPackage.LAN_SEGMENT__IN_SEGMENT:
				getInSegment().clear();
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
			case CimPackage.LAN_SEGMENT__LANID:
				return LANID_EDEFAULT == null ? lanid != null : !LANID_EDEFAULT.equals(lanid);
			case CimPackage.LAN_SEGMENT__LAN_TYPE:
				return LAN_TYPE_EDEFAULT == null ? lanType != null : !LAN_TYPE_EDEFAULT.equals(lanType);
			case CimPackage.LAN_SEGMENT__OTHER_LAN_TYPE:
				return OTHER_LAN_TYPE_EDEFAULT == null ? otherLANType != null : !OTHER_LAN_TYPE_EDEFAULT.equals(otherLANType);
			case CimPackage.LAN_SEGMENT__IN_SEGMENT:
				return inSegment != null && !inSegment.isEmpty();
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
		result.append(" (LANID: ");
		result.append(lanid);
		result.append(", LANType: ");
		result.append(lanType);
		result.append(", otherLANType: ");
		result.append(otherLANType);
		result.append(')');
		return result.toString();
	}

} //LANSegmentImpl
