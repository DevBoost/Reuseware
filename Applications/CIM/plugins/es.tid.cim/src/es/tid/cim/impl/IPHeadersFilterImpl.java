/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import es.tid.cim.CimPackage;
import es.tid.cim.EnumIPVersion;
import es.tid.cim.IPHeadersFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IP Headers Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrDestPortEnd <em>Hdr Dest Port End</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrDestPortStart <em>Hdr Dest Port Start</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrIPVersion <em>Hdr IP Version</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrProtocolID <em>Hdr Protocol ID</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrSrcPortEnd <em>Hdr Src Port End</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrSrcPortStart <em>Hdr Src Port Start</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrDestAddress <em>Hdr Dest Address</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrDestAddressEndOfRange <em>Hdr Dest Address End Of Range</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrDestMask <em>Hdr Dest Mask</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrDSCP <em>Hdr DSCP</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrFlowLabel <em>Hdr Flow Label</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrSrcAddressEndOfRange <em>Hdr Src Address End Of Range</em>}</li>
 *   <li>{@link es.tid.cim.impl.IPHeadersFilterImpl#getHdrSrcMask <em>Hdr Src Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IPHeadersFilterImpl extends FilterEntryBaseImpl implements IPHeadersFilter {
	/**
	 * The default value of the '{@link #getHdrDestPortEnd() <em>Hdr Dest Port End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestPortEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int HDR_DEST_PORT_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHdrDestPortEnd() <em>Hdr Dest Port End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestPortEnd()
	 * @generated
	 * @ordered
	 */
	protected int hdrDestPortEnd = HDR_DEST_PORT_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdrDestPortStart() <em>Hdr Dest Port Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestPortStart()
	 * @generated
	 * @ordered
	 */
	protected static final int HDR_DEST_PORT_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHdrDestPortStart() <em>Hdr Dest Port Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestPortStart()
	 * @generated
	 * @ordered
	 */
	protected int hdrDestPortStart = HDR_DEST_PORT_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdrIPVersion() <em>Hdr IP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrIPVersion()
	 * @generated
	 * @ordered
	 */
	protected static final EnumIPVersion HDR_IP_VERSION_EDEFAULT = EnumIPVersion.IPV4;

	/**
	 * The cached value of the '{@link #getHdrIPVersion() <em>Hdr IP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrIPVersion()
	 * @generated
	 * @ordered
	 */
	protected EnumIPVersion hdrIPVersion = HDR_IP_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdrProtocolID() <em>Hdr Protocol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrProtocolID()
	 * @generated
	 * @ordered
	 */
	protected static final byte HDR_PROTOCOL_ID_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getHdrProtocolID() <em>Hdr Protocol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrProtocolID()
	 * @generated
	 * @ordered
	 */
	protected byte hdrProtocolID = HDR_PROTOCOL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdrSrcPortEnd() <em>Hdr Src Port End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcPortEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int HDR_SRC_PORT_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHdrSrcPortEnd() <em>Hdr Src Port End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcPortEnd()
	 * @generated
	 * @ordered
	 */
	protected int hdrSrcPortEnd = HDR_SRC_PORT_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdrSrcPortStart() <em>Hdr Src Port Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcPortStart()
	 * @generated
	 * @ordered
	 */
	protected static final int HDR_SRC_PORT_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHdrSrcPortStart() <em>Hdr Src Port Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcPortStart()
	 * @generated
	 * @ordered
	 */
	protected int hdrSrcPortStart = HDR_SRC_PORT_START_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHdrDestAddress() <em>Hdr Dest Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrDestAddress;

	/**
	 * The cached value of the '{@link #getHdrDestAddressEndOfRange() <em>Hdr Dest Address End Of Range</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestAddressEndOfRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrDestAddressEndOfRange;

	/**
	 * The cached value of the '{@link #getHdrDestMask() <em>Hdr Dest Mask</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDestMask()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrDestMask;

	/**
	 * The cached value of the '{@link #getHdrDSCP() <em>Hdr DSCP</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrDSCP()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrDSCP;

	/**
	 * The cached value of the '{@link #getHdrFlowLabel() <em>Hdr Flow Label</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrFlowLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrFlowLabel;

	/**
	 * The cached value of the '{@link #getHdrSrcAddressEndOfRange() <em>Hdr Src Address End Of Range</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcAddressEndOfRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrSrcAddressEndOfRange;

	/**
	 * The cached value of the '{@link #getHdrSrcMask() <em>Hdr Src Mask</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdrSrcMask()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hdrSrcMask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPHeadersFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getIPHeadersFilter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHdrDestPortEnd() {
		return hdrDestPortEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdrDestPortEnd(int newHdrDestPortEnd) {
		int oldHdrDestPortEnd = hdrDestPortEnd;
		hdrDestPortEnd = newHdrDestPortEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_HEADERS_FILTER__HDR_DEST_PORT_END, oldHdrDestPortEnd, hdrDestPortEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHdrDestPortStart() {
		return hdrDestPortStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdrDestPortStart(int newHdrDestPortStart) {
		int oldHdrDestPortStart = hdrDestPortStart;
		hdrDestPortStart = newHdrDestPortStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_HEADERS_FILTER__HDR_DEST_PORT_START, oldHdrDestPortStart, hdrDestPortStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumIPVersion getHdrIPVersion() {
		return hdrIPVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdrIPVersion(EnumIPVersion newHdrIPVersion) {
		EnumIPVersion oldHdrIPVersion = hdrIPVersion;
		hdrIPVersion = newHdrIPVersion == null ? HDR_IP_VERSION_EDEFAULT : newHdrIPVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_HEADERS_FILTER__HDR_IP_VERSION, oldHdrIPVersion, hdrIPVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getHdrProtocolID() {
		return hdrProtocolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdrProtocolID(byte newHdrProtocolID) {
		byte oldHdrProtocolID = hdrProtocolID;
		hdrProtocolID = newHdrProtocolID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_HEADERS_FILTER__HDR_PROTOCOL_ID, oldHdrProtocolID, hdrProtocolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHdrSrcPortEnd() {
		return hdrSrcPortEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdrSrcPortEnd(int newHdrSrcPortEnd) {
		int oldHdrSrcPortEnd = hdrSrcPortEnd;
		hdrSrcPortEnd = newHdrSrcPortEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_HEADERS_FILTER__HDR_SRC_PORT_END, oldHdrSrcPortEnd, hdrSrcPortEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHdrSrcPortStart() {
		return hdrSrcPortStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdrSrcPortStart(int newHdrSrcPortStart) {
		int oldHdrSrcPortStart = hdrSrcPortStart;
		hdrSrcPortStart = newHdrSrcPortStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.IP_HEADERS_FILTER__HDR_SRC_PORT_START, oldHdrSrcPortStart, hdrSrcPortStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getHdrDestAddress() {
		if (hdrDestAddress == null) {
			hdrDestAddress = new EDataTypeUniqueEList<Integer>(Integer.class, this, CimPackage.IP_HEADERS_FILTER__HDR_DEST_ADDRESS);
		}
		return hdrDestAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getHdrDestAddressEndOfRange() {
		if (hdrDestAddressEndOfRange == null) {
			hdrDestAddressEndOfRange = new EDataTypeUniqueEList<Integer>(Integer.class, this, CimPackage.IP_HEADERS_FILTER__HDR_DEST_ADDRESS_END_OF_RANGE);
		}
		return hdrDestAddressEndOfRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getHdrDestMask() {
		if (hdrDestMask == null) {
			hdrDestMask = new EDataTypeUniqueEList<Integer>(Integer.class, this, CimPackage.IP_HEADERS_FILTER__HDR_DEST_MASK);
		}
		return hdrDestMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getHdrDSCP() {
		if (hdrDSCP == null) {
			hdrDSCP = new EDataTypeUniqueEList<Integer>(Integer.class, this, CimPackage.IP_HEADERS_FILTER__HDR_DSCP);
		}
		return hdrDSCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getHdrFlowLabel() {
		if (hdrFlowLabel == null) {
			hdrFlowLabel = new EDataTypeUniqueEList<Integer>(Integer.class, this, CimPackage.IP_HEADERS_FILTER__HDR_FLOW_LABEL);
		}
		return hdrFlowLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getHdrSrcAddressEndOfRange() {
		if (hdrSrcAddressEndOfRange == null) {
			hdrSrcAddressEndOfRange = new EDataTypeUniqueEList<Integer>(Integer.class, this, CimPackage.IP_HEADERS_FILTER__HDR_SRC_ADDRESS_END_OF_RANGE);
		}
		return hdrSrcAddressEndOfRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getHdrSrcMask() {
		if (hdrSrcMask == null) {
			hdrSrcMask = new EDataTypeUniqueEList<Integer>(Integer.class, this, CimPackage.IP_HEADERS_FILTER__HDR_SRC_MASK);
		}
		return hdrSrcMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_PORT_END:
				return getHdrDestPortEnd();
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_PORT_START:
				return getHdrDestPortStart();
			case CimPackage.IP_HEADERS_FILTER__HDR_IP_VERSION:
				return getHdrIPVersion();
			case CimPackage.IP_HEADERS_FILTER__HDR_PROTOCOL_ID:
				return getHdrProtocolID();
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_PORT_END:
				return getHdrSrcPortEnd();
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_PORT_START:
				return getHdrSrcPortStart();
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_ADDRESS:
				return getHdrDestAddress();
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_ADDRESS_END_OF_RANGE:
				return getHdrDestAddressEndOfRange();
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_MASK:
				return getHdrDestMask();
			case CimPackage.IP_HEADERS_FILTER__HDR_DSCP:
				return getHdrDSCP();
			case CimPackage.IP_HEADERS_FILTER__HDR_FLOW_LABEL:
				return getHdrFlowLabel();
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_ADDRESS_END_OF_RANGE:
				return getHdrSrcAddressEndOfRange();
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_MASK:
				return getHdrSrcMask();
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
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_PORT_END:
				setHdrDestPortEnd((Integer)newValue);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_PORT_START:
				setHdrDestPortStart((Integer)newValue);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_IP_VERSION:
				setHdrIPVersion((EnumIPVersion)newValue);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_PROTOCOL_ID:
				setHdrProtocolID((Byte)newValue);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_PORT_END:
				setHdrSrcPortEnd((Integer)newValue);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_PORT_START:
				setHdrSrcPortStart((Integer)newValue);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_ADDRESS:
				getHdrDestAddress().clear();
				getHdrDestAddress().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_ADDRESS_END_OF_RANGE:
				getHdrDestAddressEndOfRange().clear();
				getHdrDestAddressEndOfRange().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_MASK:
				getHdrDestMask().clear();
				getHdrDestMask().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_DSCP:
				getHdrDSCP().clear();
				getHdrDSCP().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_FLOW_LABEL:
				getHdrFlowLabel().clear();
				getHdrFlowLabel().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_ADDRESS_END_OF_RANGE:
				getHdrSrcAddressEndOfRange().clear();
				getHdrSrcAddressEndOfRange().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_MASK:
				getHdrSrcMask().clear();
				getHdrSrcMask().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_PORT_END:
				setHdrDestPortEnd(HDR_DEST_PORT_END_EDEFAULT);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_PORT_START:
				setHdrDestPortStart(HDR_DEST_PORT_START_EDEFAULT);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_IP_VERSION:
				setHdrIPVersion(HDR_IP_VERSION_EDEFAULT);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_PROTOCOL_ID:
				setHdrProtocolID(HDR_PROTOCOL_ID_EDEFAULT);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_PORT_END:
				setHdrSrcPortEnd(HDR_SRC_PORT_END_EDEFAULT);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_PORT_START:
				setHdrSrcPortStart(HDR_SRC_PORT_START_EDEFAULT);
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_ADDRESS:
				getHdrDestAddress().clear();
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_ADDRESS_END_OF_RANGE:
				getHdrDestAddressEndOfRange().clear();
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_MASK:
				getHdrDestMask().clear();
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_DSCP:
				getHdrDSCP().clear();
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_FLOW_LABEL:
				getHdrFlowLabel().clear();
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_ADDRESS_END_OF_RANGE:
				getHdrSrcAddressEndOfRange().clear();
				return;
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_MASK:
				getHdrSrcMask().clear();
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
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_PORT_END:
				return hdrDestPortEnd != HDR_DEST_PORT_END_EDEFAULT;
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_PORT_START:
				return hdrDestPortStart != HDR_DEST_PORT_START_EDEFAULT;
			case CimPackage.IP_HEADERS_FILTER__HDR_IP_VERSION:
				return hdrIPVersion != HDR_IP_VERSION_EDEFAULT;
			case CimPackage.IP_HEADERS_FILTER__HDR_PROTOCOL_ID:
				return hdrProtocolID != HDR_PROTOCOL_ID_EDEFAULT;
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_PORT_END:
				return hdrSrcPortEnd != HDR_SRC_PORT_END_EDEFAULT;
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_PORT_START:
				return hdrSrcPortStart != HDR_SRC_PORT_START_EDEFAULT;
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_ADDRESS:
				return hdrDestAddress != null && !hdrDestAddress.isEmpty();
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_ADDRESS_END_OF_RANGE:
				return hdrDestAddressEndOfRange != null && !hdrDestAddressEndOfRange.isEmpty();
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_MASK:
				return hdrDestMask != null && !hdrDestMask.isEmpty();
			case CimPackage.IP_HEADERS_FILTER__HDR_DSCP:
				return hdrDSCP != null && !hdrDSCP.isEmpty();
			case CimPackage.IP_HEADERS_FILTER__HDR_FLOW_LABEL:
				return hdrFlowLabel != null && !hdrFlowLabel.isEmpty();
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_ADDRESS_END_OF_RANGE:
				return hdrSrcAddressEndOfRange != null && !hdrSrcAddressEndOfRange.isEmpty();
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_MASK:
				return hdrSrcMask != null && !hdrSrcMask.isEmpty();
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
		result.append(" (hdrDestPortEnd: ");
		result.append(hdrDestPortEnd);
		result.append(", hdrDestPortStart: ");
		result.append(hdrDestPortStart);
		result.append(", hdrIPVersion: ");
		result.append(hdrIPVersion);
		result.append(", hdrProtocolID: ");
		result.append(hdrProtocolID);
		result.append(", hdrSrcPortEnd: ");
		result.append(hdrSrcPortEnd);
		result.append(", hdrSrcPortStart: ");
		result.append(hdrSrcPortStart);
		result.append(", hdrDestAddress: ");
		result.append(hdrDestAddress);
		result.append(", hdrDestAddressEndOfRange: ");
		result.append(hdrDestAddressEndOfRange);
		result.append(", hdrDestMask: ");
		result.append(hdrDestMask);
		result.append(", hdrDSCP: ");
		result.append(hdrDSCP);
		result.append(", hdrFlowLabel: ");
		result.append(hdrFlowLabel);
		result.append(", hdrSrcAddressEndOfRange: ");
		result.append(hdrSrcAddressEndOfRange);
		result.append(", hdrSrcMask: ");
		result.append(hdrSrcMask);
		result.append(')');
		return result.toString();
	}

} //IPHeadersFilterImpl
