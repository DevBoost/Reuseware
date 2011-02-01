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
import es.tid.cim.EnumProtocolServiceReturnCode;
import es.tid.cim.EnumProtocolType;
import es.tid.cim.IPProtocolEndpoint;
import es.tid.cim.ProtocolService;
import es.tid.cim.TCPProtocolEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ProtocolServiceImpl#getMaxConnections <em>Max Connections</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProtocolServiceImpl#getOtherProtocol <em>Other Protocol</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProtocolServiceImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolServiceImpl extends ServiceImpl implements ProtocolService {
	/**
	 * The default value of the '{@link #getMaxConnections() <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConnections()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CONNECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxConnections() <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConnections()
	 * @generated
	 * @ordered
	 */
	protected int maxConnections = MAX_CONNECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherProtocol() <em>Other Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherProtocol() <em>Other Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocol()
	 * @generated
	 * @ordered
	 */
	protected String otherProtocol = OTHER_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final EnumProtocolType PROTOCOL_EDEFAULT = EnumProtocolType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EnumProtocolType protocol = PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getProtocolService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxConnections() {
		return maxConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxConnections(int newMaxConnections) {
		int oldMaxConnections = maxConnections;
		maxConnections = newMaxConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PROTOCOL_SERVICE__MAX_CONNECTIONS, oldMaxConnections, maxConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherProtocol() {
		return otherProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherProtocol(String newOtherProtocol) {
		String oldOtherProtocol = otherProtocol;
		otherProtocol = newOtherProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PROTOCOL_SERVICE__OTHER_PROTOCOL, oldOtherProtocol, otherProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumProtocolType getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(EnumProtocolType newProtocol) {
		EnumProtocolType oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PROTOCOL_SERVICE__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumProtocolServiceReturnCode listenOnPort(int portNumber, IPProtocolEndpoint ipEndpoint, TCPProtocolEndpoint tcpEndpoint) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.PROTOCOL_SERVICE__MAX_CONNECTIONS:
				return getMaxConnections();
			case CimPackage.PROTOCOL_SERVICE__OTHER_PROTOCOL:
				return getOtherProtocol();
			case CimPackage.PROTOCOL_SERVICE__PROTOCOL:
				return getProtocol();
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
			case CimPackage.PROTOCOL_SERVICE__MAX_CONNECTIONS:
				setMaxConnections((Integer)newValue);
				return;
			case CimPackage.PROTOCOL_SERVICE__OTHER_PROTOCOL:
				setOtherProtocol((String)newValue);
				return;
			case CimPackage.PROTOCOL_SERVICE__PROTOCOL:
				setProtocol((EnumProtocolType)newValue);
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
			case CimPackage.PROTOCOL_SERVICE__MAX_CONNECTIONS:
				setMaxConnections(MAX_CONNECTIONS_EDEFAULT);
				return;
			case CimPackage.PROTOCOL_SERVICE__OTHER_PROTOCOL:
				setOtherProtocol(OTHER_PROTOCOL_EDEFAULT);
				return;
			case CimPackage.PROTOCOL_SERVICE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
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
			case CimPackage.PROTOCOL_SERVICE__MAX_CONNECTIONS:
				return maxConnections != MAX_CONNECTIONS_EDEFAULT;
			case CimPackage.PROTOCOL_SERVICE__OTHER_PROTOCOL:
				return OTHER_PROTOCOL_EDEFAULT == null ? otherProtocol != null : !OTHER_PROTOCOL_EDEFAULT.equals(otherProtocol);
			case CimPackage.PROTOCOL_SERVICE__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
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
		result.append(" (maxConnections: ");
		result.append(maxConnections);
		result.append(", otherProtocol: ");
		result.append(otherProtocol);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(')');
		return result.toString();
	}

} //ProtocolServiceImpl
