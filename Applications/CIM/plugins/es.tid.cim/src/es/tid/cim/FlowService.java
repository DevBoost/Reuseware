/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.FlowService#getFlowID <em>Flow ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getFlowService()
 * @model
 * @generated
 */
public interface FlowService extends QoSService {
	/**
	 * Returns the value of the '<em><b>Flow ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow ID</em>' attribute.
	 * @see #setFlowID(String)
	 * @see es.tid.cim.CimPackage#getFlowService_FlowID()
	 * @model
	 * @generated
	 */
	String getFlowID();

	/**
	 * Sets the value of the '{@link es.tid.cim.FlowService#getFlowID <em>Flow ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow ID</em>' attribute.
	 * @see #getFlowID()
	 * @generated
	 */
	void setFlowID(String value);

} // FlowService
