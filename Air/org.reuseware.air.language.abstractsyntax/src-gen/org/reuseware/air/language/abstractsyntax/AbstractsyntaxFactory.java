/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.abstractsyntax;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage
 * @generated
 */
public interface AbstractsyntaxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractsyntaxFactory eINSTANCE = org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abstract Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Syntax</em>'.
	 * @generated
	 */
	AbstractSyntax createAbstractSyntax();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>AS Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AS Program</em>'.
	 * @generated
	 */
	ASProgram createASProgram();

	/**
	 * Returns a new object of class '<em>Concrete Node Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Node Definition</em>'.
	 * @generated
	 */
	ConcreteNodeDefinition createConcreteNodeDefinition();

	/**
	 * Returns a new object of class '<em>Interface Node Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Node Definition</em>'.
	 * @generated
	 */
	InterfaceNodeDefinition createInterfaceNodeDefinition();

	/**
	 * Returns a new object of class '<em>PLUS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PLUS</em>'.
	 * @generated
	 */
	PLUS createPLUS();

	/**
	 * Returns a new object of class '<em>STAR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>STAR</em>'.
	 * @generated
	 */
	STAR createSTAR();

	/**
	 * Returns a new object of class '<em>QUESTIONMARK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QUESTIONMARK</em>'.
	 * @generated
	 */
	QUESTIONMARK createQUESTIONMARK();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment</em>'.
	 * @generated
	 */
	Containment createContainment();

	/**
	 * Returns a new object of class '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Reference</em>'.
	 * @generated
	 */
	InternalReference createInternalReference();

	/**
	 * Returns a new object of class '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference</em>'.
	 * @generated
	 */
	ExternalReference createExternalReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractsyntaxPackage getAbstractsyntaxPackage();

} //AbstractsyntaxFactory
