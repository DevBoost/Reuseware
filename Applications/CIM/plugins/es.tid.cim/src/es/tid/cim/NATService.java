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
 * A representation of the model object '<em><b>NAT Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.NATService#getNATServiceRunningOnEndpoint <em>NAT Service Running On Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getNATService()
 * @model annotation="Qualifiers Experimental='true'"
 * @generated
 */
public interface NATService extends ForwardingService {
	/**
	 * Returns the value of the '<em><b>NAT Service Running On Endpoint</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ProtocolEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NAT Service Running On Endpoint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NAT Service Running On Endpoint</em>' reference list.
	 * @see es.tid.cim.CimPackage#getNATService_NATServiceRunningOnEndpoint()
	 * @model
	 * @generated
	 */
	EList<ProtocolEndpoint> getNATServiceRunningOnEndpoint();

} // NATService
