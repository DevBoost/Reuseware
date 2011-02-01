/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NAT Static Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.NATStaticSettings#getInsideAddress <em>Inside Address</em>}</li>
 *   <li>{@link es.tid.cim.NATStaticSettings#getOutsideAddress <em>Outside Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getNATStaticSettings()
 * @model
 * @generated
 */
public interface NATStaticSettings extends NATSettingData {
	/**
	 * Returns the value of the '<em><b>Inside Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inside Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inside Address</em>' attribute.
	 * @see #setInsideAddress(String)
	 * @see es.tid.cim.CimPackage#getNATStaticSettings_InsideAddress()
	 * @model
	 * @generated
	 */
	String getInsideAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.NATStaticSettings#getInsideAddress <em>Inside Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inside Address</em>' attribute.
	 * @see #getInsideAddress()
	 * @generated
	 */
	void setInsideAddress(String value);

	/**
	 * Returns the value of the '<em><b>Outside Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outside Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outside Address</em>' attribute.
	 * @see #setOutsideAddress(String)
	 * @see es.tid.cim.CimPackage#getNATStaticSettings_OutsideAddress()
	 * @model
	 * @generated
	 */
	String getOutsideAddress();

	/**
	 * Sets the value of the '{@link es.tid.cim.NATStaticSettings#getOutsideAddress <em>Outside Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside Address</em>' attribute.
	 * @see #getOutsideAddress()
	 * @generated
	 */
	void setOutsideAddress(String value);

} // NATStaticSettings
