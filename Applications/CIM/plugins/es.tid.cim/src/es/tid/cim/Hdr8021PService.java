/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hdr8021 PService</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.Hdr8021PService#getPriorityValue <em>Priority Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getHdr8021PService()
 * @model
 * @generated
 */
public interface Hdr8021PService extends QoSService {
	/**
	 * Returns the value of the '<em><b>Priority Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Value</em>' attribute.
	 * @see #setPriorityValue(int)
	 * @see es.tid.cim.CimPackage#getHdr8021PService_PriorityValue()
	 * @model
	 * @generated
	 */
	int getPriorityValue();

	/**
	 * Sets the value of the '{@link es.tid.cim.Hdr8021PService#getPriorityValue <em>Priority Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Value</em>' attribute.
	 * @see #getPriorityValue()
	 * @generated
	 */
	void setPriorityValue(int value);

} // Hdr8021PService
