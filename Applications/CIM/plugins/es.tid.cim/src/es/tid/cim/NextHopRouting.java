/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Next Hop Routing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.NextHopRouting#getDestinationAddress <em>Destination Address</em>}</li>
 *   <li>{@link es.tid.cim.NextHopRouting#getDestinationMask <em>Destination Mask</em>}</li>
 *   <li>{@link es.tid.cim.NextHopRouting#getNextHop <em>Next Hop</em>}</li>
 *   <li>{@link es.tid.cim.NextHopRouting#isIsStatic <em>Is Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getNextHopRouting()
 * @model
 * @generated
 */
public interface NextHopRouting extends LogicalElement {
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
	 * @see es.tid.cim.CimPackage#getNextHopRouting_DestinationAddress()
	 * @model
	 * @generated
	 */
	String getDestinationAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopRouting#getDestinationAddress <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Address</em>' attribute.
	 * @see #getDestinationAddress()
	 * @generated
	 */
	void setDestinationAddress(String value);

	/**
	 * Returns the value of the '<em><b>Destination Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Mask</em>' attribute.
	 * @see #setDestinationMask(String)
	 * @see es.tid.cim.CimPackage#getNextHopRouting_DestinationMask()
	 * @model
	 * @generated
	 */
	String getDestinationMask();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopRouting#getDestinationMask <em>Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Mask</em>' attribute.
	 * @see #getDestinationMask()
	 * @generated
	 */
	void setDestinationMask(String value);

	/**
	 * Returns the value of the '<em><b>Next Hop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Hop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Hop</em>' attribute.
	 * @see #setNextHop(String)
	 * @see es.tid.cim.CimPackage#getNextHopRouting_NextHop()
	 * @model
	 * @generated
	 */
	String getNextHop();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopRouting#getNextHop <em>Next Hop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Hop</em>' attribute.
	 * @see #getNextHop()
	 * @generated
	 */
	void setNextHop(String value);

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
	 * @see es.tid.cim.CimPackage#getNextHopRouting_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopRouting#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

} // NextHopRouting
