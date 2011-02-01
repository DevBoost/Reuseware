/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LAN Connectivity Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.LANConnectivitySegment#getLANID <em>LANID</em>}</li>
 *   <li>{@link es.tid.cim.LANConnectivitySegment#getConnectivityType <em>Connectivity Type</em>}</li>
 *   <li>{@link es.tid.cim.LANConnectivitySegment#getOtherTypeDescription <em>Other Type Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getLANConnectivitySegment()
 * @model
 * @generated
 */
public interface LANConnectivitySegment extends ConnectivityCollection {
	/**
	 * Returns the value of the '<em><b>LANID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LANID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LANID</em>' attribute.
	 * @see #setLANID(String)
	 * @see es.tid.cim.CimPackage#getLANConnectivitySegment_LANID()
	 * @model
	 * @generated
	 */
	String getLANID();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANConnectivitySegment#getLANID <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LANID</em>' attribute.
	 * @see #getLANID()
	 * @generated
	 */
	void setLANID(String value);

	/**
	 * Returns the value of the '<em><b>Connectivity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Type</em>' attribute.
	 * @see #setConnectivityType(String)
	 * @see es.tid.cim.CimPackage#getLANConnectivitySegment_ConnectivityType()
	 * @model
	 * @generated
	 */
	String getConnectivityType();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANConnectivitySegment#getConnectivityType <em>Connectivity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Type</em>' attribute.
	 * @see #getConnectivityType()
	 * @generated
	 */
	void setConnectivityType(String value);

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
	 * @see es.tid.cim.CimPackage#getLANConnectivitySegment_OtherTypeDescription()
	 * @model
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANConnectivitySegment#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

} // LANConnectivitySegment
