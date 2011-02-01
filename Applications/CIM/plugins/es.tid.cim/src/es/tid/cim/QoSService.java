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
 * A representation of the model object '<em><b>Qo SService</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.QoSService#getQoSSubService <em>Qo SSub Service</em>}</li>
 *   <li>{@link es.tid.cim.QoSService#getQoSConditioningSubService <em>Qo SConditioning Sub Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getQoSService()
 * @model
 * @generated
 */
public interface QoSService extends Service {
	/**
	 * Returns the value of the '<em><b>Qo SSub Service</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.QoSService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qo SSub Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qo SSub Service</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getQoSService_QoSSubService()
	 * @model containment="true"
	 * @generated
	 */
	EList<QoSService> getQoSSubService();

	/**
	 * Returns the value of the '<em><b>Qo SConditioning Sub Service</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.ConditioningService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qo SConditioning Sub Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qo SConditioning Sub Service</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getQoSService_QoSConditioningSubService()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditioningService> getQoSConditioningSubService();

} // QoSService
