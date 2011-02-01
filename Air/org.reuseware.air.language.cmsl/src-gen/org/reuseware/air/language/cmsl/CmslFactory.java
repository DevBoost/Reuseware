/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.reuseware.air.language.cmsl.CmslPackage
 * @generated
 */
public interface CmslFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	CmslFactory eINSTANCE = org.reuseware.air.language.cmsl.impl.CmslFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Grammar Extension</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Grammar Extension</em>'.
   * @generated
   */
	GrammarExtension createGrammarExtension();

	/**
   * Returns a new object of class '<em>Extension Program</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension Program</em>'.
   * @generated
   */
	ExtensionProgram createExtensionProgram();

	/**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
	Reference createReference();

	/**
   * Returns a new object of class '<em>Upper Level Reference</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Upper Level Reference</em>'.
   * @generated
   */
	UpperLevelReference createUpperLevelReference();

	/**
   * Returns a new object of class '<em>Fragtypes</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Fragtypes</em>'.
   * @generated
   */
	Fragtypes createFragtypes();

	/**
   * Returns a new object of class '<em>Extension Declaration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension Declaration</em>'.
   * @generated
   */
	ExtensionDeclaration createExtensionDeclaration();

	/**
   * Returns a new object of class '<em>Arbitrary</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Arbitrary</em>'.
   * @generated
   */
	Arbitrary createArbitrary();

	/**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
	Annotation createAnnotation();

	/**
   * Returns a new object of class '<em>Injection</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Injection</em>'.
   * @generated
   */
	Injection createInjection();

	/**
   * Returns a new object of class '<em>Definition List</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition List</em>'.
   * @generated
   */
	DefinitionList createDefinitionList();

	/**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
	Role createRole();

	/**
   * Returns a new object of class '<em>Definition Choice</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition Choice</em>'.
   * @generated
   */
	DefinitionChoice createDefinitionChoice();

	/**
   * Returns a new object of class '<em>Non Terminal Identifier</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Terminal Identifier</em>'.
   * @generated
   */
	NonTerminalIdentifier createNonTerminalIdentifier();

	/**
   * Returns a new object of class '<em>Construct</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Construct</em>'.
   * @generated
   */
	Construct createConstruct();

	/**
   * Returns a new object of class '<em>More Than One</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>More Than One</em>'.
   * @generated
   */
	MoreThanOne createMoreThanOne();

	/**
   * Returns a new object of class '<em>Definition Construct</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition Construct</em>'.
   * @generated
   */
	DefinitionConstruct createDefinitionConstruct();

	/**
   * Returns a new object of class '<em>Slotify</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Slotify</em>'.
   * @generated
   */
	Slotify createSlotify();

	/**
   * Returns a new object of class '<em>Base Declaration</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Declaration</em>'.
   * @generated
   */
	BaseDeclaration createBaseDeclaration();

	/**
   * Returns a new object of class '<em>Definition Part</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition Part</em>'.
   * @generated
   */
	DefinitionPart createDefinitionPart();

	/**
   * Returns a new object of class '<em>Base Language Reference</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Language Reference</em>'.
   * @generated
   */
	BaseLanguageReference createBaseLanguageReference();

	/**
   * Returns a new object of class '<em>Zero One</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Zero One</em>'.
   * @generated
   */
	ZeroOne createZeroOne();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	CmslPackage getCmslPackage();

} //CmslFactory
