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
 * A representation of the model object '<em><b>LAN Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.LANSegment#getLANID <em>LANID</em>}</li>
 *   <li>{@link es.tid.cim.LANSegment#getLANType <em>LAN Type</em>}</li>
 *   <li>{@link es.tid.cim.LANSegment#getOtherLANType <em>Other LAN Type</em>}</li>
 *   <li>{@link es.tid.cim.LANSegment#getInSegment <em>In Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getLANSegment()
 * @model
 * @generated
 */
public interface LANSegment extends LogicalNetwork {
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
	 * @see es.tid.cim.CimPackage#getLANSegment_LANID()
	 * @model
	 * @generated
	 */
	String getLANID();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANSegment#getLANID <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LANID</em>' attribute.
	 * @see #getLANID()
	 * @generated
	 */
	void setLANID(String value);

	/**
	 * Returns the value of the '<em><b>LAN Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LAN Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LAN Type</em>' attribute.
	 * @see #setLANType(String)
	 * @see es.tid.cim.CimPackage#getLANSegment_LANType()
	 * @model
	 * @generated
	 */
	String getLANType();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANSegment#getLANType <em>LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LAN Type</em>' attribute.
	 * @see #getLANType()
	 * @generated
	 */
	void setLANType(String value);

	/**
	 * Returns the value of the '<em><b>Other LAN Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other LAN Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other LAN Type</em>' attribute.
	 * @see #setOtherLANType(String)
	 * @see es.tid.cim.CimPackage#getLANSegment_OtherLANType()
	 * @model
	 * @generated
	 */
	String getOtherLANType();

	/**
	 * Sets the value of the '{@link es.tid.cim.LANSegment#getOtherLANType <em>Other LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other LAN Type</em>' attribute.
	 * @see #getOtherLANType()
	 * @generated
	 */
	void setOtherLANType(String value);

	/**
	 * Returns the value of the '<em><b>In Segment</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.LANEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Segment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Segment</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getLANSegment_InSegment()
	 * @model containment="true"
	 * @generated
	 */
	EList<LANEndpoint> getInSegment();

} // LANSegment
