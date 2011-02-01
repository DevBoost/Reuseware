/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.application.taipan;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.application.taipan.PortSlot#getPortName <em>Port Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.application.taipan.TaiPanPackage#getPortSlot()
 * @model
 * @generated
 */
public interface PortSlot extends PortType {

	/**
	 * Returns the value of the '<em><b>Port Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Name</em>' attribute.
	 * @see #setPortName(String)
	 * @see org.reuseware.application.taipan.TaiPanPackage#getPortSlot_PortName()
	 * @model
	 * @generated
	 */
	String getPortName();

	/**
	 * Sets the value of the '{@link org.reuseware.application.taipan.PortSlot#getPortName <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Name</em>' attribute.
	 * @see #getPortName()
	 * @generated
	 */
	void setPortName(String value);
} // PortSlot
