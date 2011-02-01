/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.PrecedenceService#getPrecedenceValue <em>Precedence Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getPrecedenceService()
 * @model
 * @generated
 */
public interface PrecedenceService extends QoSService {
	/**
	 * Returns the value of the '<em><b>Precedence Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence Value</em>' attribute.
	 * @see #setPrecedenceValue(int)
	 * @see es.tid.cim.CimPackage#getPrecedenceService_PrecedenceValue()
	 * @model
	 * @generated
	 */
	int getPrecedenceValue();

	/**
	 * Sets the value of the '{@link es.tid.cim.PrecedenceService#getPrecedenceValue <em>Precedence Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedence Value</em>' attribute.
	 * @see #getPrecedenceValue()
	 * @generated
	 */
	void setPrecedenceValue(int value);

} // PrecedenceService
