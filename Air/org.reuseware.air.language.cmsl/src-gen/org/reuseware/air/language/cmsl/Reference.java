/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.Reference#getBase <em>Base</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.Reference#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends ConstructReference {
	/**
   * Returns the value of the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' containment reference.
   * @see #setBase(BaseReference)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getReference_Base()
   * @model containment="true" required="true"
   * @generated
   */
	BaseReference getBase();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.Reference#getBase <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' containment reference.
   * @see #getBase()
   * @generated
   */
	void setBase(BaseReference value);

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
   * @see org.reuseware.air.language.cmsl.CmslPackage#getReference_Cardinality()
   * @model containment="true"
   * @generated
   */
	Cardinality getCardinality();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.Reference#getCardinality <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' containment reference.
   * @see #getCardinality()
   * @generated
   */
	void setCardinality(Cardinality value);

} // Reference
