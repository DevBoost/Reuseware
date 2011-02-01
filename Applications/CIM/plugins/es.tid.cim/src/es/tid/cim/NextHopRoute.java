/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Next Hop Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.NextHopRoute#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link es.tid.cim.NextHopRoute#getDestinationAddress <em>Destination Address</em>}</li>
 *   <li>{@link es.tid.cim.NextHopRoute#getAdminDistance <em>Admin Distance</em>}</li>
 *   <li>{@link es.tid.cim.NextHopRoute#getRouteMetric <em>Route Metric</em>}</li>
 *   <li>{@link es.tid.cim.NextHopRoute#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link es.tid.cim.NextHopRoute#getTypeOfRoute <em>Type Of Route</em>}</li>
 *   <li>{@link es.tid.cim.NextHopRoute#getRouteUsesEndpoint <em>Route Uses Endpoint</em>}</li>
 *   <li>{@link es.tid.cim.NextHopRoute#getAssociatedNextHop <em>Associated Next Hop</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getNextHopRoute()
 * @model abstract="true"
 * @generated
 */
public interface NextHopRoute extends ManagedElement {
	/**
	 * Returns the value of the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance ID</em>' attribute.
	 * @see #setInstanceID(String)
	 * @see es.tid.cim.CimPackage#getNextHopRoute_InstanceID()
	 * @model
	 * @generated
	 */
	String getInstanceID();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopRoute#getInstanceID <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance ID</em>' attribute.
	 * @see #getInstanceID()
	 * @generated
	 */
	void setInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>Destination Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Address</em>' attribute.
	 * @see #setDestinationAddress(String)
	 * @see es.tid.cim.CimPackage#getNextHopRoute_DestinationAddress()
	 * @model
	 * @generated
	 */
	String getDestinationAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopRoute#getDestinationAddress <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Address</em>' attribute.
	 * @see #getDestinationAddress()
	 * @generated
	 */
	void setDestinationAddress(String value);

	/**
	 * Returns the value of the '<em><b>Admin Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Distance</em>' attribute.
	 * @see #setAdminDistance(int)
	 * @see es.tid.cim.CimPackage#getNextHopRoute_AdminDistance()
	 * @model
	 * @generated
	 */
	int getAdminDistance();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopRoute#getAdminDistance <em>Admin Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Distance</em>' attribute.
	 * @see #getAdminDistance()
	 * @generated
	 */
	void setAdminDistance(int value);

	/**
	 * Returns the value of the '<em><b>Route Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Metric</em>' attribute.
	 * @see #setRouteMetric(int)
	 * @see es.tid.cim.CimPackage#getNextHopRoute_RouteMetric()
	 * @model
	 * @generated
	 */
	int getRouteMetric();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopRoute#getRouteMetric <em>Route Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Metric</em>' attribute.
	 * @see #getRouteMetric()
	 * @generated
	 */
	void setRouteMetric(int value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see es.tid.cim.CimPackage#getNextHopRoute_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopRoute#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Type Of Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of Route</em>' attribute.
	 * @see #setTypeOfRoute(String)
	 * @see es.tid.cim.CimPackage#getNextHopRoute_TypeOfRoute()
	 * @model
	 * @generated
	 */
	String getTypeOfRoute();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopRoute#getTypeOfRoute <em>Type Of Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Route</em>' attribute.
	 * @see #getTypeOfRoute()
	 * @generated
	 */
	void setTypeOfRoute(String value);

	/**
	 * Returns the value of the '<em><b>Route Uses Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Uses Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Uses Endpoint</em>' reference.
	 * @see #setRouteUsesEndpoint(ProtocolEndpoint)
	 * @see es.tid.cim.CimPackage#getNextHopRoute_RouteUsesEndpoint()
	 * @model
	 * @generated
	 */
	ProtocolEndpoint getRouteUsesEndpoint();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopRoute#getRouteUsesEndpoint <em>Route Uses Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Uses Endpoint</em>' reference.
	 * @see #getRouteUsesEndpoint()
	 * @generated
	 */
	void setRouteUsesEndpoint(ProtocolEndpoint value);

	/**
	 * Returns the value of the '<em><b>Associated Next Hop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Next Hop</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Next Hop</em>' reference.
	 * @see #setAssociatedNextHop(RemoteServiceAccessPoint)
	 * @see es.tid.cim.CimPackage#getNextHopRoute_AssociatedNextHop()
	 * @model
	 * @generated
	 */
	RemoteServiceAccessPoint getAssociatedNextHop();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopRoute#getAssociatedNextHop <em>Associated Next Hop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Next Hop</em>' reference.
	 * @see #getAssociatedNextHop()
	 * @generated
	 */
	void setAssociatedNextHop(RemoteServiceAccessPoint value);

} // NextHopRoute
