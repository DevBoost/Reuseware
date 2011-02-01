/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Serv Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.DiffServService#getDSCP <em>DSCP</em>}</li>
 *   <li>{@link es.tid.cim.DiffServService#getPHBID <em>PHBID</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getDiffServService()
 * @model
 * @generated
 */
public interface DiffServService extends QoSService {
	/**
	 * Returns the value of the '<em><b>DSCP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSCP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSCP</em>' attribute.
	 * @see #setDSCP(int)
	 * @see es.tid.cim.CimPackage#getDiffServService_DSCP()
	 * @model
	 * @generated
	 */
	int getDSCP();

	/**
	 * Sets the value of the '{@link es.tid.cim.DiffServService#getDSCP <em>DSCP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSCP</em>' attribute.
	 * @see #getDSCP()
	 * @generated
	 */
	void setDSCP(int value);

	/**
	 * Returns the value of the '<em><b>PHBID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PHBID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PHBID</em>' attribute.
	 * @see #setPHBID(int)
	 * @see es.tid.cim.CimPackage#getDiffServService_PHBID()
	 * @model
	 * @generated
	 */
	int getPHBID();

	/**
	 * Sets the value of the '{@link es.tid.cim.DiffServService#getPHBID <em>PHBID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PHBID</em>' attribute.
	 * @see #getPHBID()
	 * @generated
	 */
	void setPHBID(int value);

} // DiffServService
