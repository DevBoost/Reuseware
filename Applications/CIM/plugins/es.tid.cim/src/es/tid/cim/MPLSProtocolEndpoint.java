/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPLS Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.MPLSProtocolEndpoint#isOverruleLSR <em>Overrule LSR</em>}</li>
 *   <li>{@link es.tid.cim.MPLSProtocolEndpoint#getTotalBandwidth <em>Total Bandwidth</em>}</li>
 *   <li>{@link es.tid.cim.MPLSProtocolEndpoint#getAvailableBandwidth <em>Available Bandwidth</em>}</li>
 *   <li>{@link es.tid.cim.MPLSProtocolEndpoint#getResourceClasses <em>Resource Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getMPLSProtocolEndpoint()
 * @model
 * @generated
 */
public interface MPLSProtocolEndpoint extends ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Overrule LSR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overrule LSR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overrule LSR</em>' attribute.
	 * @see #setOverruleLSR(boolean)
	 * @see es.tid.cim.CimPackage#getMPLSProtocolEndpoint_OverruleLSR()
	 * @model
	 * @generated
	 */
	boolean isOverruleLSR();

	/**
	 * Sets the value of the '{@link es.tid.cim.MPLSProtocolEndpoint#isOverruleLSR <em>Overrule LSR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overrule LSR</em>' attribute.
	 * @see #isOverruleLSR()
	 * @generated
	 */
	void setOverruleLSR(boolean value);

	/**
	 * Returns the value of the '<em><b>Total Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Bandwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Bandwidth</em>' attribute.
	 * @see #setTotalBandwidth(int)
	 * @see es.tid.cim.CimPackage#getMPLSProtocolEndpoint_TotalBandwidth()
	 * @model
	 * @generated
	 */
	int getTotalBandwidth();

	/**
	 * Sets the value of the '{@link es.tid.cim.MPLSProtocolEndpoint#getTotalBandwidth <em>Total Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Bandwidth</em>' attribute.
	 * @see #getTotalBandwidth()
	 * @generated
	 */
	void setTotalBandwidth(int value);

	/**
	 * Returns the value of the '<em><b>Available Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Bandwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Bandwidth</em>' attribute.
	 * @see #setAvailableBandwidth(int)
	 * @see es.tid.cim.CimPackage#getMPLSProtocolEndpoint_AvailableBandwidth()
	 * @model
	 * @generated
	 */
	int getAvailableBandwidth();

	/**
	 * Sets the value of the '{@link es.tid.cim.MPLSProtocolEndpoint#getAvailableBandwidth <em>Available Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Bandwidth</em>' attribute.
	 * @see #getAvailableBandwidth()
	 * @generated
	 */
	void setAvailableBandwidth(int value);

	/**
	 * Returns the value of the '<em><b>Resource Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Classes</em>' attribute.
	 * @see #setResourceClasses(int)
	 * @see es.tid.cim.CimPackage#getMPLSProtocolEndpoint_ResourceClasses()
	 * @model
	 * @generated
	 */
	int getResourceClasses();

	/**
	 * Sets the value of the '{@link es.tid.cim.MPLSProtocolEndpoint#getResourceClasses <em>Resource Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Classes</em>' attribute.
	 * @see #getResourceClasses()
	 * @generated
	 */
	void setResourceClasses(int value);

} // MPLSProtocolEndpoint
