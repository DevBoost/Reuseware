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
 * A representation of the model object '<em><b>BGP Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.BGPCluster#getClusterID <em>Cluster ID</em>}</li>
 *   <li>{@link es.tid.cim.BGPCluster#getReflectorService <em>Reflector Service</em>}</li>
 *   <li>{@link es.tid.cim.BGPCluster#getReflectorClientService <em>Reflector Client Service</em>}</li>
 *   <li>{@link es.tid.cim.BGPCluster#getReflectorNonClientService <em>Reflector Non Client Service</em>}</li>
 *   <li>{@link es.tid.cim.BGPCluster#getRoutersInBGPCluster <em>Routers In BGP Cluster</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getBGPCluster()
 * @model
 * @generated
 */
public interface BGPCluster extends CollectionOfMSEs {
	/**
	 * Returns the value of the '<em><b>Cluster ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cluster ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster ID</em>' attribute.
	 * @see #setClusterID(int)
	 * @see es.tid.cim.CimPackage#getBGPCluster_ClusterID()
	 * @model
	 * @generated
	 */
	int getClusterID();

	/**
	 * Sets the value of the '{@link es.tid.cim.BGPCluster#getClusterID <em>Cluster ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster ID</em>' attribute.
	 * @see #getClusterID()
	 * @generated
	 */
	void setClusterID(int value);

	/**
	 * Returns the value of the '<em><b>Reflector Service</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.BGPService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflector Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflector Service</em>' reference list.
	 * @see es.tid.cim.CimPackage#getBGPCluster_ReflectorService()
	 * @model
	 * @generated
	 */
	EList<BGPService> getReflectorService();

	/**
	 * Returns the value of the '<em><b>Reflector Client Service</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.BGPService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflector Client Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflector Client Service</em>' reference list.
	 * @see es.tid.cim.CimPackage#getBGPCluster_ReflectorClientService()
	 * @model
	 * @generated
	 */
	EList<BGPService> getReflectorClientService();

	/**
	 * Returns the value of the '<em><b>Reflector Non Client Service</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.BGPService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflector Non Client Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflector Non Client Service</em>' reference list.
	 * @see es.tid.cim.CimPackage#getBGPCluster_ReflectorNonClientService()
	 * @model
	 * @generated
	 */
	EList<BGPService> getReflectorNonClientService();

	/**
	 * Returns the value of the '<em><b>Routers In BGP Cluster</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.ComputerSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routers In BGP Cluster</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routers In BGP Cluster</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getBGPCluster_RoutersInBGPCluster()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComputerSystem> getRoutersInBGPCluster();

} // BGPCluster
