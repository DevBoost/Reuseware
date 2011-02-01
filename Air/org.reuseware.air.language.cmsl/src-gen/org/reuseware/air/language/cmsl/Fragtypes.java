/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragtypes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.Fragtypes#getFragtype <em>Fragtype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getFragtypes()
 * @model
 * @generated
 */
public interface Fragtypes extends ExtensionStatement {
	/**
   * Returns the value of the '<em><b>Fragtype</b></em>' containment reference list.
   * The list contents are of type {@link org.reuseware.air.language.cmsl.ConstructReference}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragtype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Fragtype</em>' containment reference list.
   * @see org.reuseware.air.language.cmsl.CmslPackage#getFragtypes_Fragtype()
   * @model type="org.reuseware.air.language.cmsl.ConstructReference" containment="true"
   * @generated
   */
	EList getFragtype();

} // Fragtypes
