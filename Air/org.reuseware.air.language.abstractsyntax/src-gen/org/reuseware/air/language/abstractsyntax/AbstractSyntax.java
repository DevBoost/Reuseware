/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.abstractsyntax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getNsuri <em>Nsuri</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getNsprefix <em>Nsprefix</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getImport <em>Import</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getAbstractSyntax()
 * @model
 * @generated
 */
public interface AbstractSyntax extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(ASUnit)
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getAbstractSyntax_Unit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ASUnit getUnit();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(ASUnit value);

	/**
	 * Returns the value of the '<em><b>Nsuri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nsuri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nsuri</em>' attribute.
	 * @see #setNsuri(String)
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getAbstractSyntax_Nsuri()
	 * @model required="true"
	 * @generated
	 */
	String getNsuri();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getNsuri <em>Nsuri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nsuri</em>' attribute.
	 * @see #getNsuri()
	 * @generated
	 */
	void setNsuri(String value);

	/**
	 * Returns the value of the '<em><b>Nsprefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nsprefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nsprefix</em>' attribute.
	 * @see #setNsprefix(String)
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getAbstractSyntax_Nsprefix()
	 * @model required="true"
	 * @generated
	 */
	String getNsprefix();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getNsprefix <em>Nsprefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nsprefix</em>' attribute.
	 * @see #getNsprefix()
	 * @generated
	 */
	void setNsprefix(String value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.reuseware.air.language.abstractsyntax.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getAbstractSyntax_Import()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImport();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage#getAbstractSyntax_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractSyntax
