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
import es.tid.cim.DiffServService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Serv Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.DiffServServiceImpl#getDSCP <em>DSCP</em>}</li>
 *   <li>{@link es.tid.cim.impl.DiffServServiceImpl#getPHBID <em>PHBID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiffServServiceImpl extends QoSServiceImpl implements DiffServService {
	/**
	 * The default value of the '{@link #getDSCP() <em>DSCP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSCP()
	 * @generated
	 * @ordered
	 */
	protected static final int DSCP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDSCP() <em>DSCP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSCP()
	 * @generated
	 * @ordered
	 */
	protected int dscp = DSCP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPHBID() <em>PHBID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHBID()
	 * @generated
	 * @ordered
	 */
	protected static final int PHBID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPHBID() <em>PHBID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHBID()
	 * @generated
	 * @ordered
	 */
	protected int phbid = PHBID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffServServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getDiffServService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDSCP() {
		return dscp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSCP(int newDSCP) {
		int oldDSCP = dscp;
		dscp = newDSCP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.DIFF_SERV_SERVICE__DSCP, oldDSCP, dscp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPHBID() {
		return phbid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPHBID(int newPHBID) {
		int oldPHBID = phbid;
		phbid = newPHBID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.DIFF_SERV_SERVICE__PHBID, oldPHBID, phbid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.DIFF_SERV_SERVICE__DSCP:
				return getDSCP();
			case CimPackage.DIFF_SERV_SERVICE__PHBID:
				return getPHBID();
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
			case CimPackage.DIFF_SERV_SERVICE__DSCP:
				setDSCP((Integer)newValue);
				return;
			case CimPackage.DIFF_SERV_SERVICE__PHBID:
				setPHBID((Integer)newValue);
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
			case CimPackage.DIFF_SERV_SERVICE__DSCP:
				setDSCP(DSCP_EDEFAULT);
				return;
			case CimPackage.DIFF_SERV_SERVICE__PHBID:
				setPHBID(PHBID_EDEFAULT);
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
			case CimPackage.DIFF_SERV_SERVICE__DSCP:
				return dscp != DSCP_EDEFAULT;
			case CimPackage.DIFF_SERV_SERVICE__PHBID:
				return phbid != PHBID_EDEFAULT;
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
		result.append(" (DSCP: ");
		result.append(dscp);
		result.append(", PHBID: ");
		result.append(phbid);
		result.append(')');
		return result.toString();
	}

} //DiffServServiceImpl
