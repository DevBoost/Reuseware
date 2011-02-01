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

import es.tid.cim.AdministrativeDistance;
import es.tid.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrative Distance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getDirectConnect <em>Direct Connect</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getEBGP <em>EBGP</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getEIGRPInternal <em>EIGRP Internal</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getIGRP <em>IGRP</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getOSPF <em>OSPF</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getISIS <em>ISIS</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getRIP <em>RIP</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getEGP <em>EGP</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getIEGRPExternal <em>IEGRP External</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getIBGP <em>IBGP</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getBGPLocal <em>BGP Local</em>}</li>
 *   <li>{@link es.tid.cim.impl.AdministrativeDistanceImpl#getUnknown <em>Unknown</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdministrativeDistanceImpl extends LogicalElementImpl implements AdministrativeDistance {
	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectConnect() <em>Direct Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectConnect()
	 * @generated
	 * @ordered
	 */
	protected static final int DIRECT_CONNECT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDirectConnect() <em>Direct Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectConnect()
	 * @generated
	 * @ordered
	 */
	protected int directConnect = DIRECT_CONNECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected static final int STATIC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected int static_ = STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getEBGP() <em>EBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBGP()
	 * @generated
	 * @ordered
	 */
	protected static final int EBGP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEBGP() <em>EBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEBGP()
	 * @generated
	 * @ordered
	 */
	protected int ebgp = EBGP_EDEFAULT;

	/**
	 * The default value of the '{@link #getEIGRPInternal() <em>EIGRP Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIGRPInternal()
	 * @generated
	 * @ordered
	 */
	protected static final int EIGRP_INTERNAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEIGRPInternal() <em>EIGRP Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIGRPInternal()
	 * @generated
	 * @ordered
	 */
	protected int eigrpInternal = EIGRP_INTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIGRP() <em>IGRP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIGRP()
	 * @generated
	 * @ordered
	 */
	protected static final int IGRP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIGRP() <em>IGRP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIGRP()
	 * @generated
	 * @ordered
	 */
	protected int igrp = IGRP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOSPF() <em>OSPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSPF()
	 * @generated
	 * @ordered
	 */
	protected static final int OSPF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOSPF() <em>OSPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSPF()
	 * @generated
	 * @ordered
	 */
	protected int ospf = OSPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getISIS() <em>ISIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISIS()
	 * @generated
	 * @ordered
	 */
	protected static final int ISIS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getISIS() <em>ISIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISIS()
	 * @generated
	 * @ordered
	 */
	protected int isis = ISIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRIP() <em>RIP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRIP()
	 * @generated
	 * @ordered
	 */
	protected static final int RIP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRIP() <em>RIP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRIP()
	 * @generated
	 * @ordered
	 */
	protected int rip = RIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getEGP() <em>EGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGP()
	 * @generated
	 * @ordered
	 */
	protected static final int EGP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEGP() <em>EGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGP()
	 * @generated
	 * @ordered
	 */
	protected int egp = EGP_EDEFAULT;

	/**
	 * The default value of the '{@link #getIEGRPExternal() <em>IEGRP External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIEGRPExternal()
	 * @generated
	 * @ordered
	 */
	protected static final int IEGRP_EXTERNAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIEGRPExternal() <em>IEGRP External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIEGRPExternal()
	 * @generated
	 * @ordered
	 */
	protected int iegrpExternal = IEGRP_EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIBGP() <em>IBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBGP()
	 * @generated
	 * @ordered
	 */
	protected static final int IBGP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIBGP() <em>IBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBGP()
	 * @generated
	 * @ordered
	 */
	protected int ibgp = IBGP_EDEFAULT;

	/**
	 * The default value of the '{@link #getBGPLocal() <em>BGP Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPLocal()
	 * @generated
	 * @ordered
	 */
	protected static final int BGP_LOCAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBGPLocal() <em>BGP Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBGPLocal()
	 * @generated
	 * @ordered
	 */
	protected int bgpLocal = BGP_LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnknown() <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknown()
	 * @generated
	 * @ordered
	 */
	protected static final int UNKNOWN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnknown() <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknown()
	 * @generated
	 * @ordered
	 */
	protected int unknown = UNKNOWN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministrativeDistanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getAdministrativeDistance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDirectConnect() {
		return directConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectConnect(int newDirectConnect) {
		int oldDirectConnect = directConnect;
		directConnect = newDirectConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__DIRECT_CONNECT, oldDirectConnect, directConnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStatic() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(int newStatic) {
		int oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEBGP() {
		return ebgp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEBGP(int newEBGP) {
		int oldEBGP = ebgp;
		ebgp = newEBGP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__EBGP, oldEBGP, ebgp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEIGRPInternal() {
		return eigrpInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEIGRPInternal(int newEIGRPInternal) {
		int oldEIGRPInternal = eigrpInternal;
		eigrpInternal = newEIGRPInternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__EIGRP_INTERNAL, oldEIGRPInternal, eigrpInternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIGRP() {
		return igrp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIGRP(int newIGRP) {
		int oldIGRP = igrp;
		igrp = newIGRP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__IGRP, oldIGRP, igrp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOSPF() {
		return ospf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSPF(int newOSPF) {
		int oldOSPF = ospf;
		ospf = newOSPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__OSPF, oldOSPF, ospf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getISIS() {
		return isis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISIS(int newISIS) {
		int oldISIS = isis;
		isis = newISIS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__ISIS, oldISIS, isis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRIP() {
		return rip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRIP(int newRIP) {
		int oldRIP = rip;
		rip = newRIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__RIP, oldRIP, rip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEGP() {
		return egp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEGP(int newEGP) {
		int oldEGP = egp;
		egp = newEGP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__EGP, oldEGP, egp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIEGRPExternal() {
		return iegrpExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIEGRPExternal(int newIEGRPExternal) {
		int oldIEGRPExternal = iegrpExternal;
		iegrpExternal = newIEGRPExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__IEGRP_EXTERNAL, oldIEGRPExternal, iegrpExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIBGP() {
		return ibgp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBGP(int newIBGP) {
		int oldIBGP = ibgp;
		ibgp = newIBGP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__IBGP, oldIBGP, ibgp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBGPLocal() {
		return bgpLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBGPLocal(int newBGPLocal) {
		int oldBGPLocal = bgpLocal;
		bgpLocal = newBGPLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__BGP_LOCAL, oldBGPLocal, bgpLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUnknown() {
		return unknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknown(int newUnknown) {
		int oldUnknown = unknown;
		unknown = newUnknown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.ADMINISTRATIVE_DISTANCE__UNKNOWN, oldUnknown, unknown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.ADMINISTRATIVE_DISTANCE__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.ADMINISTRATIVE_DISTANCE__DIRECT_CONNECT:
				return getDirectConnect();
			case CimPackage.ADMINISTRATIVE_DISTANCE__STATIC:
				return getStatic();
			case CimPackage.ADMINISTRATIVE_DISTANCE__EBGP:
				return getEBGP();
			case CimPackage.ADMINISTRATIVE_DISTANCE__EIGRP_INTERNAL:
				return getEIGRPInternal();
			case CimPackage.ADMINISTRATIVE_DISTANCE__IGRP:
				return getIGRP();
			case CimPackage.ADMINISTRATIVE_DISTANCE__OSPF:
				return getOSPF();
			case CimPackage.ADMINISTRATIVE_DISTANCE__ISIS:
				return getISIS();
			case CimPackage.ADMINISTRATIVE_DISTANCE__RIP:
				return getRIP();
			case CimPackage.ADMINISTRATIVE_DISTANCE__EGP:
				return getEGP();
			case CimPackage.ADMINISTRATIVE_DISTANCE__IEGRP_EXTERNAL:
				return getIEGRPExternal();
			case CimPackage.ADMINISTRATIVE_DISTANCE__IBGP:
				return getIBGP();
			case CimPackage.ADMINISTRATIVE_DISTANCE__BGP_LOCAL:
				return getBGPLocal();
			case CimPackage.ADMINISTRATIVE_DISTANCE__UNKNOWN:
				return getUnknown();
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
			case CimPackage.ADMINISTRATIVE_DISTANCE__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__DIRECT_CONNECT:
				setDirectConnect((Integer)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__STATIC:
				setStatic((Integer)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__EBGP:
				setEBGP((Integer)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__EIGRP_INTERNAL:
				setEIGRPInternal((Integer)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__IGRP:
				setIGRP((Integer)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__OSPF:
				setOSPF((Integer)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__ISIS:
				setISIS((Integer)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__RIP:
				setRIP((Integer)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__EGP:
				setEGP((Integer)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__IEGRP_EXTERNAL:
				setIEGRPExternal((Integer)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__IBGP:
				setIBGP((Integer)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__BGP_LOCAL:
				setBGPLocal((Integer)newValue);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__UNKNOWN:
				setUnknown((Integer)newValue);
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
			case CimPackage.ADMINISTRATIVE_DISTANCE__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__DIRECT_CONNECT:
				setDirectConnect(DIRECT_CONNECT_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__EBGP:
				setEBGP(EBGP_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__EIGRP_INTERNAL:
				setEIGRPInternal(EIGRP_INTERNAL_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__IGRP:
				setIGRP(IGRP_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__OSPF:
				setOSPF(OSPF_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__ISIS:
				setISIS(ISIS_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__RIP:
				setRIP(RIP_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__EGP:
				setEGP(EGP_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__IEGRP_EXTERNAL:
				setIEGRPExternal(IEGRP_EXTERNAL_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__IBGP:
				setIBGP(IBGP_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__BGP_LOCAL:
				setBGPLocal(BGP_LOCAL_EDEFAULT);
				return;
			case CimPackage.ADMINISTRATIVE_DISTANCE__UNKNOWN:
				setUnknown(UNKNOWN_EDEFAULT);
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
			case CimPackage.ADMINISTRATIVE_DISTANCE__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.ADMINISTRATIVE_DISTANCE__DIRECT_CONNECT:
				return directConnect != DIRECT_CONNECT_EDEFAULT;
			case CimPackage.ADMINISTRATIVE_DISTANCE__STATIC:
				return static_ != STATIC_EDEFAULT;
			case CimPackage.ADMINISTRATIVE_DISTANCE__EBGP:
				return ebgp != EBGP_EDEFAULT;
			case CimPackage.ADMINISTRATIVE_DISTANCE__EIGRP_INTERNAL:
				return eigrpInternal != EIGRP_INTERNAL_EDEFAULT;
			case CimPackage.ADMINISTRATIVE_DISTANCE__IGRP:
				return igrp != IGRP_EDEFAULT;
			case CimPackage.ADMINISTRATIVE_DISTANCE__OSPF:
				return ospf != OSPF_EDEFAULT;
			case CimPackage.ADMINISTRATIVE_DISTANCE__ISIS:
				return isis != ISIS_EDEFAULT;
			case CimPackage.ADMINISTRATIVE_DISTANCE__RIP:
				return rip != RIP_EDEFAULT;
			case CimPackage.ADMINISTRATIVE_DISTANCE__EGP:
				return egp != EGP_EDEFAULT;
			case CimPackage.ADMINISTRATIVE_DISTANCE__IEGRP_EXTERNAL:
				return iegrpExternal != IEGRP_EXTERNAL_EDEFAULT;
			case CimPackage.ADMINISTRATIVE_DISTANCE__IBGP:
				return ibgp != IBGP_EDEFAULT;
			case CimPackage.ADMINISTRATIVE_DISTANCE__BGP_LOCAL:
				return bgpLocal != BGP_LOCAL_EDEFAULT;
			case CimPackage.ADMINISTRATIVE_DISTANCE__UNKNOWN:
				return unknown != UNKNOWN_EDEFAULT;
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
		result.append(" (creationClassName: ");
		result.append(creationClassName);
		result.append(", directConnect: ");
		result.append(directConnect);
		result.append(", static: ");
		result.append(static_);
		result.append(", EBGP: ");
		result.append(ebgp);
		result.append(", EIGRPInternal: ");
		result.append(eigrpInternal);
		result.append(", IGRP: ");
		result.append(igrp);
		result.append(", OSPF: ");
		result.append(ospf);
		result.append(", ISIS: ");
		result.append(isis);
		result.append(", RIP: ");
		result.append(rip);
		result.append(", EGP: ");
		result.append(egp);
		result.append(", IEGRPExternal: ");
		result.append(iegrpExternal);
		result.append(", IBGP: ");
		result.append(ibgp);
		result.append(", BGPLocal: ");
		result.append(bgpLocal);
		result.append(", unknown: ");
		result.append(unknown);
		result.append(')');
		return result.toString();
	}

} //AdministrativeDistanceImpl
