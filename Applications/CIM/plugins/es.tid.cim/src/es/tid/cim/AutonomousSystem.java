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
 * A representation of the model object '<em><b>Autonomous System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.AutonomousSystem#getASNumber <em>AS Number</em>}</li>
 *   <li>{@link es.tid.cim.AutonomousSystem#isIsSingleHomed <em>Is Single Homed</em>}</li>
 *   <li>{@link es.tid.cim.AutonomousSystem#isIsTransit <em>Is Transit</em>}</li>
 *   <li>{@link es.tid.cim.AutonomousSystem#isRequireIGPSync <em>Require IGP Sync</em>}</li>
 *   <li>{@link es.tid.cim.AutonomousSystem#getRoutingUpdateSource <em>Routing Update Source</em>}</li>
 *   <li>{@link es.tid.cim.AutonomousSystem#getAggregationType <em>Aggregation Type</em>}</li>
 *   <li>{@link es.tid.cim.AutonomousSystem#getRouterInAS <em>Router In AS</em>}</li>
 *   <li>{@link es.tid.cim.AutonomousSystem#getASBGPEndpoints <em>ASBGP Endpoints</em>}</li>
 *   <li>{@link es.tid.cim.AutonomousSystem#getRoutingProtocolDomainInAS <em>Routing Protocol Domain In AS</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getAutonomousSystem()
 * @model
 * @generated
 */
public interface AutonomousSystem extends AdminDomain {
	/**
	 * Returns the value of the '<em><b>AS Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AS Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AS Number</em>' attribute.
	 * @see #setASNumber(int)
	 * @see es.tid.cim.CimPackage#getAutonomousSystem_ASNumber()
	 * @model
	 * @generated
	 */
	int getASNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.AutonomousSystem#getASNumber <em>AS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AS Number</em>' attribute.
	 * @see #getASNumber()
	 * @generated
	 */
	void setASNumber(int value);

	/**
	 * Returns the value of the '<em><b>Is Single Homed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Single Homed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Single Homed</em>' attribute.
	 * @see #setIsSingleHomed(boolean)
	 * @see es.tid.cim.CimPackage#getAutonomousSystem_IsSingleHomed()
	 * @model
	 * @generated
	 */
	boolean isIsSingleHomed();

	/**
	 * Sets the value of the '{@link es.tid.cim.AutonomousSystem#isIsSingleHomed <em>Is Single Homed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Single Homed</em>' attribute.
	 * @see #isIsSingleHomed()
	 * @generated
	 */
	void setIsSingleHomed(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Transit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Transit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Transit</em>' attribute.
	 * @see #setIsTransit(boolean)
	 * @see es.tid.cim.CimPackage#getAutonomousSystem_IsTransit()
	 * @model
	 * @generated
	 */
	boolean isIsTransit();

	/**
	 * Sets the value of the '{@link es.tid.cim.AutonomousSystem#isIsTransit <em>Is Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Transit</em>' attribute.
	 * @see #isIsTransit()
	 * @generated
	 */
	void setIsTransit(boolean value);

	/**
	 * Returns the value of the '<em><b>Require IGP Sync</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require IGP Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require IGP Sync</em>' attribute.
	 * @see #setRequireIGPSync(boolean)
	 * @see es.tid.cim.CimPackage#getAutonomousSystem_RequireIGPSync()
	 * @model default="false"
	 * @generated
	 */
	boolean isRequireIGPSync();

	/**
	 * Sets the value of the '{@link es.tid.cim.AutonomousSystem#isRequireIGPSync <em>Require IGP Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require IGP Sync</em>' attribute.
	 * @see #isRequireIGPSync()
	 * @generated
	 */
	void setRequireIGPSync(boolean value);

	/**
	 * Returns the value of the '<em><b>Routing Update Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Update Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Update Source</em>' attribute.
	 * @see #setRoutingUpdateSource(String)
	 * @see es.tid.cim.CimPackage#getAutonomousSystem_RoutingUpdateSource()
	 * @model
	 * @generated
	 */
	String getRoutingUpdateSource();

	/**
	 * Sets the value of the '{@link es.tid.cim.AutonomousSystem#getRoutingUpdateSource <em>Routing Update Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Update Source</em>' attribute.
	 * @see #getRoutingUpdateSource()
	 * @generated
	 */
	void setRoutingUpdateSource(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Type</em>' attribute.
	 * @see #setAggregationType(String)
	 * @see es.tid.cim.CimPackage#getAutonomousSystem_AggregationType()
	 * @model
	 * @generated
	 */
	String getAggregationType();

	/**
	 * Sets the value of the '{@link es.tid.cim.AutonomousSystem#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Type</em>' attribute.
	 * @see #getAggregationType()
	 * @generated
	 */
	void setAggregationType(String value);

	/**
	 * Returns the value of the '<em><b>Router In AS</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.ComputerSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router In AS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router In AS</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getAutonomousSystem_RouterInAS()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComputerSystem> getRouterInAS();

	/**
	 * Returns the value of the '<em><b>ASBGP Endpoints</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.BGPProtocolEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ASBGP Endpoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ASBGP Endpoints</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getAutonomousSystem_ASBGPEndpoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<BGPProtocolEndpoint> getASBGPEndpoints();

	/**
	 * Returns the value of the '<em><b>Routing Protocol Domain In AS</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.RoutingProtocolDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Protocol Domain In AS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Protocol Domain In AS</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getAutonomousSystem_RoutingProtocolDomainInAS()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoutingProtocolDomain> getRoutingProtocolDomainInAS();

} // AutonomousSystem
