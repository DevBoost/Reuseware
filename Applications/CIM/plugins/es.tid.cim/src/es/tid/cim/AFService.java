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
 * A representation of the model object '<em><b>AF Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.AFService#getClassNumber <em>Class Number</em>}</li>
 *   <li>{@link es.tid.cim.AFService#getDropperNumber <em>Dropper Number</em>}</li>
 *   <li>{@link es.tid.cim.AFService#getAFRelatedServices <em>AF Related Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getAFService()
 * @model
 * @generated
 */
public interface AFService extends DiffServService {
	/**
	 * Returns the value of the '<em><b>Class Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Number</em>' attribute.
	 * @see #setClassNumber(int)
	 * @see es.tid.cim.CimPackage#getAFService_ClassNumber()
	 * @model
	 * @generated
	 */
	int getClassNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.AFService#getClassNumber <em>Class Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Number</em>' attribute.
	 * @see #getClassNumber()
	 * @generated
	 */
	void setClassNumber(int value);

	/**
	 * Returns the value of the '<em><b>Dropper Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dropper Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dropper Number</em>' attribute.
	 * @see #setDropperNumber(int)
	 * @see es.tid.cim.CimPackage#getAFService_DropperNumber()
	 * @model
	 * @generated
	 */
	int getDropperNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.AFService#getDropperNumber <em>Dropper Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dropper Number</em>' attribute.
	 * @see #getDropperNumber()
	 * @generated
	 */
	void setDropperNumber(int value);

	/**
	 * Returns the value of the '<em><b>AF Related Services</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.AFService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AF Related Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AF Related Services</em>' reference list.
	 * @see es.tid.cim.CimPackage#getAFService_AFRelatedServices()
	 * @model
	 * @generated
	 */
	EList<AFService> getAFRelatedServices();

} // AFService
