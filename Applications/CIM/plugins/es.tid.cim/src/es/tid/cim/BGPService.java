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
 * A representation of the model object '<em><b>BGP Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.BGPService#getBGPPeerGroupServices <em>BGP Peer Group Services</em>}</li>
 *   <li>{@link es.tid.cim.BGPService#getBGPVersion <em>BGP Version</em>}</li>
 *   <li>{@link es.tid.cim.BGPService#getLastErrorCode <em>Last Error Code</em>}</li>
 *   <li>{@link es.tid.cim.BGPService#getLastMessageErrorSubCode <em>Last Message Error Sub Code</em>}</li>
 *   <li>{@link es.tid.cim.BGPService#getLastOpenErrorSubCode <em>Last Open Error Sub Code</em>}</li>
 *   <li>{@link es.tid.cim.BGPService#getLastUpdatedErrorSubCode <em>Last Updated Error Sub Code</em>}</li>
 *   <li>{@link es.tid.cim.BGPService#getBGPRoutingPolicy <em>BGP Routing Policy</em>}</li>
 *   <li>{@link es.tid.cim.BGPService#getBGPAdminDistance <em>BGP Admin Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getBGPService()
 * @model
 * @generated
 */
public interface BGPService extends RouteCalculationService {
	/**
	 * Returns the value of the '<em><b>BGP Peer Group Services</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.BGPPeerGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BGP Peer Group Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BGP Peer Group Services</em>' reference list.
	 * @see es.tid.cim.CimPackage#getBGPService_BGPPeerGroupServices()
	 * @model
	 * @generated
	 */
	EList<BGPPeerGroup> getBGPPeerGroupServices();

	/**
	 * Returns the value of the '<em><b>BGP Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BGP Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BGP Version</em>' attribute.
	 * @see #setBGPVersion(int)
	 * @see es.tid.cim.CimPackage#getBGPService_BGPVersion()
	 * @model
	 * @generated
	 */
	int getBGPVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPService#getBGPVersion <em>BGP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BGP Version</em>' attribute.
	 * @see #getBGPVersion()
	 * @generated
	 */
	void setBGPVersion(int value);

	/**
	 * Returns the value of the '<em><b>Last Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Error Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Error Code</em>' attribute.
	 * @see #setLastErrorCode(String)
	 * @see es.tid.cim.CimPackage#getBGPService_LastErrorCode()
	 * @model
	 * @generated
	 */
	String getLastErrorCode();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPService#getLastErrorCode <em>Last Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Error Code</em>' attribute.
	 * @see #getLastErrorCode()
	 * @generated
	 */
	void setLastErrorCode(String value);

	/**
	 * Returns the value of the '<em><b>Last Message Error Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Message Error Sub Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Message Error Sub Code</em>' attribute.
	 * @see #setLastMessageErrorSubCode(String)
	 * @see es.tid.cim.CimPackage#getBGPService_LastMessageErrorSubCode()
	 * @model
	 * @generated
	 */
	String getLastMessageErrorSubCode();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPService#getLastMessageErrorSubCode <em>Last Message Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Message Error Sub Code</em>' attribute.
	 * @see #getLastMessageErrorSubCode()
	 * @generated
	 */
	void setLastMessageErrorSubCode(String value);

	/**
	 * Returns the value of the '<em><b>Last Open Error Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Open Error Sub Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Open Error Sub Code</em>' attribute.
	 * @see #setLastOpenErrorSubCode(String)
	 * @see es.tid.cim.CimPackage#getBGPService_LastOpenErrorSubCode()
	 * @model
	 * @generated
	 */
	String getLastOpenErrorSubCode();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPService#getLastOpenErrorSubCode <em>Last Open Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Open Error Sub Code</em>' attribute.
	 * @see #getLastOpenErrorSubCode()
	 * @generated
	 */
	void setLastOpenErrorSubCode(String value);

	/**
	 * Returns the value of the '<em><b>Last Updated Error Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Updated Error Sub Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Updated Error Sub Code</em>' attribute.
	 * @see #setLastUpdatedErrorSubCode(String)
	 * @see es.tid.cim.CimPackage#getBGPService_LastUpdatedErrorSubCode()
	 * @model
	 * @generated
	 */
	String getLastUpdatedErrorSubCode();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPService#getLastUpdatedErrorSubCode <em>Last Updated Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated Error Sub Code</em>' attribute.
	 * @see #getLastUpdatedErrorSubCode()
	 * @generated
	 */
	void setLastUpdatedErrorSubCode(String value);

	/**
	 * Returns the value of the '<em><b>BGP Routing Policy</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.RoutingPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BGP Routing Policy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BGP Routing Policy</em>' reference list.
	 * @see es.tid.cim.CimPackage#getBGPService_BGPRoutingPolicy()
	 * @model
	 * @generated
	 */
	EList<RoutingPolicy> getBGPRoutingPolicy();

	/**
	 * Returns the value of the '<em><b>BGP Admin Distance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BGP Admin Distance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BGP Admin Distance</em>' reference.
	 * @see #setBGPAdminDistance(AdministrativeDistance)
	 * @see es.tid.cim.CimPackage#getBGPService_BGPAdminDistance()
	 * @model
	 * @generated
	 */
	AdministrativeDistance getBGPAdminDistance();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPService#getBGPAdminDistance <em>BGP Admin Distance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BGP Admin Distance</em>' reference.
	 * @see #getBGPAdminDistance()
	 * @generated
	 */
	void setBGPAdminDistance(AdministrativeDistance value);

} // BGPService
