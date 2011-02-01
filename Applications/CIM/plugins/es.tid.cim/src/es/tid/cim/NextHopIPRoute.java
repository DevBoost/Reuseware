/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Next Hop IP Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.NextHopIPRoute#getRouteDerivation <em>Route Derivation</em>}</li>
 *   <li>{@link es.tid.cim.NextHopIPRoute#getOtherDerivation <em>Other Derivation</em>}</li>
 *   <li>{@link es.tid.cim.NextHopIPRoute#getDestinationMask <em>Destination Mask</em>}</li>
 *   <li>{@link es.tid.cim.NextHopIPRoute#getPrefixLength <em>Prefix Length</em>}</li>
 *   <li>{@link es.tid.cim.NextHopIPRoute#getAddressType <em>Address Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getNextHopIPRoute()
 * @model
 * @generated
 */
public interface NextHopIPRoute extends NextHopRoute {
	/**
	 * Returns the value of the '<em><b>Route Derivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Derivation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Derivation</em>' attribute.
	 * @see #setRouteDerivation(String)
	 * @see es.tid.cim.CimPackage#getNextHopIPRoute_RouteDerivation()
	 * @model
	 * @generated
	 */
	String getRouteDerivation();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopIPRoute#getRouteDerivation <em>Route Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Derivation</em>' attribute.
	 * @see #getRouteDerivation()
	 * @generated
	 */
	void setRouteDerivation(String value);

	/**
	 * Returns the value of the '<em><b>Other Derivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Derivation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Derivation</em>' attribute.
	 * @see #setOtherDerivation(String)
	 * @see es.tid.cim.CimPackage#getNextHopIPRoute_OtherDerivation()
	 * @model
	 * @generated
	 */
	String getOtherDerivation();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopIPRoute#getOtherDerivation <em>Other Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Derivation</em>' attribute.
	 * @see #getOtherDerivation()
	 * @generated
	 */
	void setOtherDerivation(String value);

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
	 * @see es.tid.cim.CimPackage#getNextHopIPRoute_DestinationMask()
	 * @model
	 * @generated
	 */
	String getDestinationMask();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopIPRoute#getDestinationMask <em>Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Mask</em>' attribute.
	 * @see #getDestinationMask()
	 * @generated
	 */
	void setDestinationMask(String value);

	/**
	 * Returns the value of the '<em><b>Prefix Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix Length</em>' attribute.
	 * @see #setPrefixLength(int)
	 * @see es.tid.cim.CimPackage#getNextHopIPRoute_PrefixLength()
	 * @model
	 * @generated
	 */
	int getPrefixLength();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopIPRoute#getPrefixLength <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix Length</em>' attribute.
	 * @see #getPrefixLength()
	 * @generated
	 */
	void setPrefixLength(int value);

	/**
	 * Returns the value of the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see #setAddressType(String)
	 * @see es.tid.cim.CimPackage#getNextHopIPRoute_AddressType()
	 * @model
	 * @generated
	 */
	String getAddressType();

	/**
	 * Sets the value of the '{@link es.tid.cim.NextHopIPRoute#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(String value);

} // NextHopIPRoute
