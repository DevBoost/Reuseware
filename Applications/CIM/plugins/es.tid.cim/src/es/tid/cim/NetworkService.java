/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.NetworkService#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link es.tid.cim.NetworkService#getServiceURL <em>Service URL</em>}</li>
 *   <li>{@link es.tid.cim.NetworkService#getStartupConditions <em>Startup Conditions</em>}</li>
 *   <li>{@link es.tid.cim.NetworkService#getStartupParameters <em>Startup Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getNetworkService()
 * @model abstract="true"
 * @generated
 */
public interface NetworkService extends Service {
	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute.
	 * @see #setKeywords(String)
	 * @see es.tid.cim.CimPackage#getNetworkService_Keywords()
	 * @model
	 * @generated
	 */
	String getKeywords();

	/**
	 * Sets the value of the '{@link es.tid.cim.NetworkService#getKeywords <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywords</em>' attribute.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(String value);

	/**
	 * Returns the value of the '<em><b>Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service URL</em>' attribute.
	 * @see #setServiceURL(String)
	 * @see es.tid.cim.CimPackage#getNetworkService_ServiceURL()
	 * @model
	 * @generated
	 */
	String getServiceURL();

	/**
	 * Sets the value of the '{@link es.tid.cim.NetworkService#getServiceURL <em>Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service URL</em>' attribute.
	 * @see #getServiceURL()
	 * @generated
	 */
	void setServiceURL(String value);

	/**
	 * Returns the value of the '<em><b>Startup Conditions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Conditions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Conditions</em>' attribute.
	 * @see #setStartupConditions(String)
	 * @see es.tid.cim.CimPackage#getNetworkService_StartupConditions()
	 * @model
	 * @generated
	 */
	String getStartupConditions();

	/**
	 * Sets the value of the '{@link es.tid.cim.NetworkService#getStartupConditions <em>Startup Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Conditions</em>' attribute.
	 * @see #getStartupConditions()
	 * @generated
	 */
	void setStartupConditions(String value);

	/**
	 * Returns the value of the '<em><b>Startup Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Parameters</em>' attribute.
	 * @see #setStartupParameters(String)
	 * @see es.tid.cim.CimPackage#getNetworkService_StartupParameters()
	 * @model
	 * @generated
	 */
	String getStartupParameters();

	/**
	 * Sets the value of the '{@link es.tid.cim.NetworkService#getStartupParameters <em>Startup Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Parameters</em>' attribute.
	 * @see #getStartupParameters()
	 * @generated
	 */
	void setStartupParameters(String value);

} // NetworkService
