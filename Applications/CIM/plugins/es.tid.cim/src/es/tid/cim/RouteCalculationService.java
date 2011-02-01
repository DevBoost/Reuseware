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
 * A representation of the model object '<em><b>Route Calculation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.RouteCalculationService#getRouterID <em>Router ID</em>}</li>
 *   <li>{@link es.tid.cim.RouteCalculationService#getAlgorithmType <em>Algorithm Type</em>}</li>
 *   <li>{@link es.tid.cim.RouteCalculationService#getCalculatesAmong <em>Calculates Among</em>}</li>
 *   <li>{@link es.tid.cim.RouteCalculationService#getCalculatedRoutes <em>Calculated Routes</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getRouteCalculationService()
 * @model abstract="true"
 * @generated
 */
public interface RouteCalculationService extends NetworkService {
	/**
	 * Returns the value of the '<em><b>Router ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router ID</em>' attribute.
	 * @see #setRouterID(String)
	 * @see es.tid.cim.CimPackage#getRouteCalculationService_RouterID()
	 * @model
	 * @generated
	 */
	String getRouterID();

	/**
	 * Sets the value of the '{@link es.tid.cim.RouteCalculationService#getRouterID <em>Router ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router ID</em>' attribute.
	 * @see #getRouterID()
	 * @generated
	 */
	void setRouterID(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Type</em>' attribute.
	 * @see #setAlgorithmType(String)
	 * @see es.tid.cim.CimPackage#getRouteCalculationService_AlgorithmType()
	 * @model
	 * @generated
	 */
	String getAlgorithmType();

	/**
	 * Sets the value of the '{@link es.tid.cim.RouteCalculationService#getAlgorithmType <em>Algorithm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Type</em>' attribute.
	 * @see #getAlgorithmType()
	 * @generated
	 */
	void setAlgorithmType(String value);

	/**
	 * Returns the value of the '<em><b>Calculates Among</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ProtocolEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculates Among</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculates Among</em>' reference list.
	 * @see es.tid.cim.CimPackage#getRouteCalculationService_CalculatesAmong()
	 * @model
	 * @generated
	 */
	EList<ProtocolEndpoint> getCalculatesAmong();

	/**
	 * Returns the value of the '<em><b>Calculated Routes</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.IPRoute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculated Routes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated Routes</em>' reference list.
	 * @see es.tid.cim.CimPackage#getRouteCalculationService_CalculatedRoutes()
	 * @model
	 * @generated
	 */
	EList<IPRoute> getCalculatedRoutes();

} // RouteCalculationService
