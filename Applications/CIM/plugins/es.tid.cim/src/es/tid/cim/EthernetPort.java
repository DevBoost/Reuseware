/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ethernet Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.EthernetPort#getMaxDataSize <em>Max Data Size</em>}</li>
 *   <li>{@link es.tid.cim.EthernetPort#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link es.tid.cim.EthernetPort#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link es.tid.cim.EthernetPort#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link es.tid.cim.EthernetPort#getOtherEnabledCapabilities <em>Other Enabled Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getEthernetPort()
 * @model
 * @generated
 */
public interface EthernetPort extends NetworkPort {
	/**
	 * Returns the value of the '<em><b>Max Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Data Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Data Size</em>' attribute.
	 * @see #setMaxDataSize(int)
	 * @see es.tid.cim.CimPackage#getEthernetPort_MaxDataSize()
	 * @model
	 * @generated
	 */
	int getMaxDataSize();

	/**
	 * Sets the value of the '{@link es.tid.cim.EthernetPort#getMaxDataSize <em>Max Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Data Size</em>' attribute.
	 * @see #getMaxDataSize()
	 * @generated
	 */
	void setMaxDataSize(int value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute.
	 * @see #setCapabilities(String)
	 * @see es.tid.cim.CimPackage#getEthernetPort_Capabilities()
	 * @model
	 * @generated
	 */
	String getCapabilities();

	/**
	 * Sets the value of the '{@link es.tid.cim.EthernetPort#getCapabilities <em>Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' attribute.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(String value);

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Descriptions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute.
	 * @see #setCapabilityDescriptions(String)
	 * @see es.tid.cim.CimPackage#getEthernetPort_CapabilityDescriptions()
	 * @model
	 * @generated
	 */
	String getCapabilityDescriptions();

	/**
	 * Sets the value of the '{@link es.tid.cim.EthernetPort#getCapabilityDescriptions <em>Capability Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Descriptions</em>' attribute.
	 * @see #getCapabilityDescriptions()
	 * @generated
	 */
	void setCapabilityDescriptions(String value);

	/**
	 * Returns the value of the '<em><b>Enabled Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled Capabilities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled Capabilities</em>' attribute.
	 * @see #setEnabledCapabilities(String)
	 * @see es.tid.cim.CimPackage#getEthernetPort_EnabledCapabilities()
	 * @model
	 * @generated
	 */
	String getEnabledCapabilities();

	/**
	 * Sets the value of the '{@link es.tid.cim.EthernetPort#getEnabledCapabilities <em>Enabled Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled Capabilities</em>' attribute.
	 * @see #getEnabledCapabilities()
	 * @generated
	 */
	void setEnabledCapabilities(String value);

	/**
	 * Returns the value of the '<em><b>Other Enabled Capabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Enabled Capabilities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Enabled Capabilities</em>' attribute.
	 * @see #setOtherEnabledCapabilities(String)
	 * @see es.tid.cim.CimPackage#getEthernetPort_OtherEnabledCapabilities()
	 * @model
	 * @generated
	 */
	String getOtherEnabledCapabilities();

	/**
	 * Sets the value of the '{@link es.tid.cim.EthernetPort#getOtherEnabledCapabilities <em>Other Enabled Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Enabled Capabilities</em>' attribute.
	 * @see #getOtherEnabledCapabilities()
	 * @generated
	 */
	void setOtherEnabledCapabilities(String value);

} // EthernetPort
