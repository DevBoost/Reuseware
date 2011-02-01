/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.Annotation#getSource <em>Source</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.Annotation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.cmsl.CmslPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends ExtensionStatement {
	/**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(NonTerminal)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getAnnotation_Source()
   * @model containment="true" required="true"
   * @generated
   */
	NonTerminal getSource();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.Annotation#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
	void setSource(NonTerminal value);

	/**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(NonTerminal)
   * @see org.reuseware.air.language.cmsl.CmslPackage#getAnnotation_Target()
   * @model containment="true" required="true"
   * @generated
   */
	NonTerminal getTarget();

	/**
   * Sets the value of the '{@link org.reuseware.air.language.cmsl.Annotation#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
	void setTarget(NonTerminal value);

} // Annotation
