/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditioning Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ConditioningService#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getConditioningService()
 * @model
 * @generated
 */
public interface ConditioningService extends Service {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see es.tid.cim.CimPackage#getConditioningService_Enabled()
	 * @model
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link es.tid.cim.ConditioningService#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

} // ConditioningService
