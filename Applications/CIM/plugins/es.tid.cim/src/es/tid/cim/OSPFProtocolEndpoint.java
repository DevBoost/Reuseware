/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSPF Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.OSPFProtocolEndpoint#getPriority <em>Priority</em>}</li>
 *   <li>{@link es.tid.cim.OSPFProtocolEndpoint#getPollInterval <em>Poll Interval</em>}</li>
 *   <li>{@link es.tid.cim.OSPFProtocolEndpoint#getCost <em>Cost</em>}</li>
 *   <li>{@link es.tid.cim.OSPFProtocolEndpoint#isIfDemand <em>If Demand</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getOSPFProtocolEndpoint()
 * @model
 * @generated
 */
public interface OSPFProtocolEndpoint extends OSPFProtocolEndpointBase {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see es.tid.cim.CimPackage#getOSPFProtocolEndpoint_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link es.tid.cim.OSPFProtocolEndpoint#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Poll Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poll Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poll Interval</em>' attribute.
	 * @see #setPollInterval(int)
	 * @see es.tid.cim.CimPackage#getOSPFProtocolEndpoint_PollInterval()
	 * @model
	 * @generated
	 */
	int getPollInterval();

	/**
	 * Sets the value of the '{@link es.tid.cim.OSPFProtocolEndpoint#getPollInterval <em>Poll Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poll Interval</em>' attribute.
	 * @see #getPollInterval()
	 * @generated
	 */
	void setPollInterval(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(int)
	 * @see es.tid.cim.CimPackage#getOSPFProtocolEndpoint_Cost()
	 * @model
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link es.tid.cim.OSPFProtocolEndpoint#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

	/**
	 * Returns the value of the '<em><b>If Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Demand</em>' attribute.
	 * @see #setIfDemand(boolean)
	 * @see es.tid.cim.CimPackage#getOSPFProtocolEndpoint_IfDemand()
	 * @model
	 * @generated
	 */
	boolean isIfDemand();

	/**
	 * Sets the value of the '{@link es.tid.cim.OSPFProtocolEndpoint#isIfDemand <em>If Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Demand</em>' attribute.
	 * @see #isIfDemand()
	 * @generated
	 */
	void setIfDemand(boolean value);

} // OSPFProtocolEndpoint
