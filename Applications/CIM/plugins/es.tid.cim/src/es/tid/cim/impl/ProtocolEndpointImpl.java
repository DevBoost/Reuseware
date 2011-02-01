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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.tid.cim.CimPackage;
import es.tid.cim.ConditioningService;
import es.tid.cim.EnumProtocolIFType;
import es.tid.cim.ProtocolEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ProtocolEndpointImpl#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProtocolEndpointImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProtocolEndpointImpl#getProtocolIFType <em>Protocol IF Type</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProtocolEndpointImpl#getEgressConditioningServiceOnEndpoint <em>Egress Conditioning Service On Endpoint</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProtocolEndpointImpl#getIngressConditioningServiceOnEndpoint <em>Ingress Conditioning Service On Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolEndpointImpl extends ServiceAccessPointImpl implements ProtocolEndpoint {
	/**
	 * The default value of the '{@link #getNameFormat() <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameFormat() <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFormat()
	 * @generated
	 * @ordered
	 */
	protected String nameFormat = NAME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherTypeDescription = OTHER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolIFType() <em>Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolIFType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumProtocolIFType PROTOCOL_IF_TYPE_EDEFAULT = EnumProtocolIFType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getProtocolIFType() <em>Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolIFType()
	 * @generated
	 * @ordered
	 */
	protected EnumProtocolIFType protocolIFType = PROTOCOL_IF_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEgressConditioningServiceOnEndpoint() <em>Egress Conditioning Service On Endpoint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEgressConditioningServiceOnEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditioningService> egressConditioningServiceOnEndpoint;

	/**
	 * The cached value of the '{@link #getIngressConditioningServiceOnEndpoint() <em>Ingress Conditioning Service On Endpoint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngressConditioningServiceOnEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditioningService> ingressConditioningServiceOnEndpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameFormat() {
		return nameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameFormat(String newNameFormat) {
		String oldNameFormat = nameFormat;
		nameFormat = newNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PROTOCOL_ENDPOINT__NAME_FORMAT, oldNameFormat, nameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherTypeDescription() {
		return otherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherTypeDescription(String newOtherTypeDescription) {
		String oldOtherTypeDescription = otherTypeDescription;
		otherTypeDescription = newOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PROTOCOL_ENDPOINT__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumProtocolIFType getProtocolIFType() {
		return protocolIFType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolIFType(EnumProtocolIFType newProtocolIFType) {
		EnumProtocolIFType oldProtocolIFType = protocolIFType;
		protocolIFType = newProtocolIFType == null ? PROTOCOL_IF_TYPE_EDEFAULT : newProtocolIFType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PROTOCOL_ENDPOINT__PROTOCOL_IF_TYPE, oldProtocolIFType, protocolIFType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditioningService> getEgressConditioningServiceOnEndpoint() {
		if (egressConditioningServiceOnEndpoint == null) {
			egressConditioningServiceOnEndpoint = new EObjectResolvingEList<ConditioningService>(ConditioningService.class, this, CimPackage.PROTOCOL_ENDPOINT__EGRESS_CONDITIONING_SERVICE_ON_ENDPOINT);
		}
		return egressConditioningServiceOnEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditioningService> getIngressConditioningServiceOnEndpoint() {
		if (ingressConditioningServiceOnEndpoint == null) {
			ingressConditioningServiceOnEndpoint = new EObjectResolvingEList<ConditioningService>(ConditioningService.class, this, CimPackage.PROTOCOL_ENDPOINT__INGRESS_CONDITIONING_SERVICE_ON_ENDPOINT);
		}
		return ingressConditioningServiceOnEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.PROTOCOL_ENDPOINT__NAME_FORMAT:
				return getNameFormat();
			case CimPackage.PROTOCOL_ENDPOINT__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
			case CimPackage.PROTOCOL_ENDPOINT__PROTOCOL_IF_TYPE:
				return getProtocolIFType();
			case CimPackage.PROTOCOL_ENDPOINT__EGRESS_CONDITIONING_SERVICE_ON_ENDPOINT:
				return getEgressConditioningServiceOnEndpoint();
			case CimPackage.PROTOCOL_ENDPOINT__INGRESS_CONDITIONING_SERVICE_ON_ENDPOINT:
				return getIngressConditioningServiceOnEndpoint();
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
			case CimPackage.PROTOCOL_ENDPOINT__NAME_FORMAT:
				setNameFormat((String)newValue);
				return;
			case CimPackage.PROTOCOL_ENDPOINT__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
				return;
			case CimPackage.PROTOCOL_ENDPOINT__PROTOCOL_IF_TYPE:
				setProtocolIFType((EnumProtocolIFType)newValue);
				return;
			case CimPackage.PROTOCOL_ENDPOINT__EGRESS_CONDITIONING_SERVICE_ON_ENDPOINT:
				getEgressConditioningServiceOnEndpoint().clear();
				getEgressConditioningServiceOnEndpoint().addAll((Collection<? extends ConditioningService>)newValue);
				return;
			case CimPackage.PROTOCOL_ENDPOINT__INGRESS_CONDITIONING_SERVICE_ON_ENDPOINT:
				getIngressConditioningServiceOnEndpoint().clear();
				getIngressConditioningServiceOnEndpoint().addAll((Collection<? extends ConditioningService>)newValue);
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
			case CimPackage.PROTOCOL_ENDPOINT__NAME_FORMAT:
				setNameFormat(NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.PROTOCOL_ENDPOINT__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.PROTOCOL_ENDPOINT__PROTOCOL_IF_TYPE:
				setProtocolIFType(PROTOCOL_IF_TYPE_EDEFAULT);
				return;
			case CimPackage.PROTOCOL_ENDPOINT__EGRESS_CONDITIONING_SERVICE_ON_ENDPOINT:
				getEgressConditioningServiceOnEndpoint().clear();
				return;
			case CimPackage.PROTOCOL_ENDPOINT__INGRESS_CONDITIONING_SERVICE_ON_ENDPOINT:
				getIngressConditioningServiceOnEndpoint().clear();
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
			case CimPackage.PROTOCOL_ENDPOINT__NAME_FORMAT:
				return NAME_FORMAT_EDEFAULT == null ? nameFormat != null : !NAME_FORMAT_EDEFAULT.equals(nameFormat);
			case CimPackage.PROTOCOL_ENDPOINT__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
			case CimPackage.PROTOCOL_ENDPOINT__PROTOCOL_IF_TYPE:
				return protocolIFType != PROTOCOL_IF_TYPE_EDEFAULT;
			case CimPackage.PROTOCOL_ENDPOINT__EGRESS_CONDITIONING_SERVICE_ON_ENDPOINT:
				return egressConditioningServiceOnEndpoint != null && !egressConditioningServiceOnEndpoint.isEmpty();
			case CimPackage.PROTOCOL_ENDPOINT__INGRESS_CONDITIONING_SERVICE_ON_ENDPOINT:
				return ingressConditioningServiceOnEndpoint != null && !ingressConditioningServiceOnEndpoint.isEmpty();
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
		result.append(" (nameFormat: ");
		result.append(nameFormat);
		result.append(", otherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(", protocolIFType: ");
		result.append(protocolIFType);
		result.append(')');
		return result.toString();
	}

} //ProtocolEndpointImpl
