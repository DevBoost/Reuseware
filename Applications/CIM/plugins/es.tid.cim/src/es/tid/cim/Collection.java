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
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.Collection#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getCollection()
 * @model abstract="true"
 * @generated
 */
public interface Collection extends ManagedElement {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ManagedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see es.tid.cim.CimPackage#getCollection_Members()
	 * @model
	 * @generated
	 */
	EList<ManagedElement> getMembers();

} // Collection
