/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.CIM_Model#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getCIM_Model()
 * @model
 * @generated
 */
public interface CIM_Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.ManagedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getCIM_Model_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ManagedElement> getElements();

} // CIM_Model
