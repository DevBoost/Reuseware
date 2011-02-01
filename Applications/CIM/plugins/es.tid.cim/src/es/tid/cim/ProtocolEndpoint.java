/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ProtocolEndpoint#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link es.tid.cim.ProtocolEndpoint#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link es.tid.cim.ProtocolEndpoint#getProtocolIFType <em>Protocol IF Type</em>}</li>
 *   <li>{@link es.tid.cim.ProtocolEndpoint#getEgressConditioningServiceOnEndpoint <em>Egress Conditioning Service On Endpoint</em>}</li>
 *   <li>{@link es.tid.cim.ProtocolEndpoint#getIngressConditioningServiceOnEndpoint <em>Ingress Conditioning Service On Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getProtocolEndpoint()
 * @model
 * @generated
 */
public interface ProtocolEndpoint extends ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Format</em>' attribute.
	 * @see #setNameFormat(String)
	 * @see es.tid.cim.CimPackage#getProtocolEndpoint_NameFormat()
	 * @model
	 * @generated
	 */
	String getNameFormat();

	/**
	 * Sets the value of the '{@link es.tid.cim.ProtocolEndpoint#getNameFormat <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Format</em>' attribute.
	 * @see #getNameFormat()
	 * @generated
	 */
	void setNameFormat(String value);

	/**
	 * Returns the value of the '<em><b>Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Type Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see es.tid.cim.CimPackage#getProtocolEndpoint_OtherTypeDescription()
	 * @model
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link es.tid.cim.ProtocolEndpoint#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Protocol IF Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumProtocolIFType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol IF Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol IF Type</em>' attribute.
	 * @see es.tid.cim.EnumProtocolIFType
	 * @see #setProtocolIFType(EnumProtocolIFType)
	 * @see es.tid.cim.CimPackage#getProtocolEndpoint_ProtocolIFType()
	 * @model
	 * @generated
	 */
	EnumProtocolIFType getProtocolIFType();

	/**
	 * Sets the value of the '{@link es.tid.cim.ProtocolEndpoint#getProtocolIFType <em>Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol IF Type</em>' attribute.
	 * @see es.tid.cim.EnumProtocolIFType
	 * @see #getProtocolIFType()
	 * @generated
	 */
	void setProtocolIFType(EnumProtocolIFType value);

	/**
	 * Returns the value of the '<em><b>Egress Conditioning Service On Endpoint</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ConditioningService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Egress Conditioning Service On Endpoint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Egress Conditioning Service On Endpoint</em>' reference list.
	 * @see es.tid.cim.CimPackage#getProtocolEndpoint_EgressConditioningServiceOnEndpoint()
	 * @model
	 * @generated
	 */
	EList<ConditioningService> getEgressConditioningServiceOnEndpoint();

	/**
	 * Returns the value of the '<em><b>Ingress Conditioning Service On Endpoint</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ConditioningService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingress Conditioning Service On Endpoint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingress Conditioning Service On Endpoint</em>' reference list.
	 * @see es.tid.cim.CimPackage#getProtocolEndpoint_IngressConditioningServiceOnEndpoint()
	 * @model
	 * @generated
	 */
	EList<ConditioningService> getIngressConditioningServiceOnEndpoint();

} // ProtocolEndpoint
