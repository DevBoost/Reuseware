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
 * A representation of the model object '<em><b>Logical Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.LogicalNetwork#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.LogicalNetwork#getName <em>Name</em>}</li>
 *   <li>{@link es.tid.cim.LogicalNetwork#getNetworkType <em>Network Type</em>}</li>
 *   <li>{@link es.tid.cim.LogicalNetwork#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link es.tid.cim.LogicalNetwork#getInLogicalNetwork <em>In Logical Network</em>}</li>
 *   <li>{@link es.tid.cim.LogicalNetwork#getLogicalNetworkService <em>Logical Network Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getLogicalNetwork()
 * @model
 * @generated
 */
public interface LogicalNetwork extends CollectionOfMSEs {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see es.tid.cim.CimPackage#getLogicalNetwork_CreationClassName()
	 * @model
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalNetwork#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.tid.cim.CimPackage#getLogicalNetwork_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalNetwork#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Network Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Type</em>' attribute.
	 * @see #setNetworkType(String)
	 * @see es.tid.cim.CimPackage#getLogicalNetwork_NetworkType()
	 * @model
	 * @generated
	 */
	String getNetworkType();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalNetwork#getNetworkType <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Type</em>' attribute.
	 * @see #getNetworkType()
	 * @generated
	 */
	void setNetworkType(String value);

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
	 * @see es.tid.cim.CimPackage#getLogicalNetwork_OtherTypeDescription()
	 * @model
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalNetwork#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>In Logical Network</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.ProtocolEndpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Logical Network</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Logical Network</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getLogicalNetwork_InLogicalNetwork()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProtocolEndpoint> getInLogicalNetwork();

	/**
	 * Returns the value of the '<em><b>Logical Network Service</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.NetworkService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Network Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Network Service</em>' reference list.
	 * @see es.tid.cim.CimPackage#getLogicalNetwork_LogicalNetworkService()
	 * @model
	 * @generated
	 */
	EList<NetworkService> getLogicalNetworkService();

} // LogicalNetwork
