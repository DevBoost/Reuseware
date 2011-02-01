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
 * A representation of the model object '<em><b>Forwarding Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ForwardingService#getProtocolType <em>Protocol Type</em>}</li>
 *   <li>{@link es.tid.cim.ForwardingService#getOtherProtocolType <em>Other Protocol Type</em>}</li>
 *   <li>{@link es.tid.cim.ForwardingService#getForwardsAmong <em>Forwards Among</em>}</li>
 *   <li>{@link es.tid.cim.ForwardingService#getRouteForwardedByService <em>Route Forwarded By Service</em>}</li>
 *   <li>{@link es.tid.cim.ForwardingService#getForwardedRoutes <em>Forwarded Routes</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getForwardingService()
 * @model
 * @generated
 */
public interface ForwardingService extends NetworkService {
	/**
	 * Returns the value of the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Type</em>' attribute.
	 * @see #setProtocolType(String)
	 * @see es.tid.cim.CimPackage#getForwardingService_ProtocolType()
	 * @model
	 * @generated
	 */
	String getProtocolType();

	/**
	 * Sets the value of the '{@link es.tid.cim.ForwardingService#getProtocolType <em>Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Type</em>' attribute.
	 * @see #getProtocolType()
	 * @generated
	 */
	void setProtocolType(String value);

	/**
	 * Returns the value of the '<em><b>Other Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Protocol Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Protocol Type</em>' attribute.
	 * @see #setOtherProtocolType(String)
	 * @see es.tid.cim.CimPackage#getForwardingService_OtherProtocolType()
	 * @model
	 * @generated
	 */
	String getOtherProtocolType();

	/**
	 * Sets the value of the '{@link es.tid.cim.ForwardingService#getOtherProtocolType <em>Other Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Protocol Type</em>' attribute.
	 * @see #getOtherProtocolType()
	 * @generated
	 */
	void setOtherProtocolType(String value);

	/**
	 * Returns the value of the '<em><b>Forwards Among</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ProtocolEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forwards Among</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forwards Among</em>' reference list.
	 * @see es.tid.cim.CimPackage#getForwardingService_ForwardsAmong()
	 * @model
	 * @generated
	 */
	EList<ProtocolEndpoint> getForwardsAmong();

	/**
	 * Returns the value of the '<em><b>Route Forwarded By Service</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.NextHopRouting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Forwarded By Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Forwarded By Service</em>' reference list.
	 * @see es.tid.cim.CimPackage#getForwardingService_RouteForwardedByService()
	 * @model
	 * @generated
	 */
	EList<NextHopRouting> getRouteForwardedByService();

	/**
	 * Returns the value of the '<em><b>Forwarded Routes</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.IPRoute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forwarded Routes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forwarded Routes</em>' reference list.
	 * @see es.tid.cim.CimPackage#getForwardingService_ForwardedRoutes()
	 * @model
	 * @generated
	 */
	EList<IPRoute> getForwardedRoutes();

} // ForwardingService
