/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.Construct#getName <em>Name</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.Construct#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getConstruct()
 * @model
 * @generated
 */
public interface Construct extends ConstructReference {
	/**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(NonTerminal)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getConstruct_Name()
   * @model containment="true" required="true"
   * @generated
   */
	NonTerminal getName();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.Construct#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
	void setName(NonTerminal value);

	/**
   * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' containment reference.
   * @see #setCardinality(Cardinality)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getConstruct_Cardinality()
   * @model containment="true"
   * @generated
   */
	Cardinality getCardinality();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.Construct#getCardinality <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' containment reference.
   * @see #getCardinality()
   * @generated
   */
	void setCardinality(Cardinality value);

} // Construct
