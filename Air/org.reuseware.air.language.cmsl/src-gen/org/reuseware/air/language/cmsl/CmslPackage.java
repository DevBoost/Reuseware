/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.reuseware.air.language.cmsl.CmslFactory
 * @model kind="package"
 * @generated
 */
public interface CmslPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "cmsl";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://www.reuseware.org/air/language/cmsl";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "org.reuseware.air.language";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	CmslPackage eINSTANCE = org.reuseware.air.language.cmsl.impl.CmslPackageImpl.init();

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.ExtensionStatement <em>Extension Statement</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.ExtensionStatement
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getExtensionStatement()
   * @generated
   */
	int EXTENSION_STATEMENT = 0;

	/**
   * The number of structural features of the '<em>Extension Statement</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTENSION_STATEMENT_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.GrammarExtensionImpl <em>Grammar Extension</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.GrammarExtensionImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getGrammarExtension()
   * @generated
   */
	int GRAMMAR_EXTENSION = 1;

	/**
   * The feature id for the '<em><b>Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRAMMAR_EXTENSION__UNIT = 0;

	/**
   * The number of structural features of the '<em>Grammar Extension</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRAMMAR_EXTENSION_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.GrammarExtensionUnit <em>Grammar Extension Unit</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.GrammarExtensionUnit
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getGrammarExtensionUnit()
   * @generated
   */
	int GRAMMAR_EXTENSION_UNIT = 18;

	/**
   * The number of structural features of the '<em>Grammar Extension Unit</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GRAMMAR_EXTENSION_UNIT_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.ExtensionProgramImpl <em>Extension Program</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.ExtensionProgramImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getExtensionProgram()
   * @generated
   */
	int EXTENSION_PROGRAM = 2;

	/**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTENSION_PROGRAM__BASE = GRAMMAR_EXTENSION_UNIT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Extension</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTENSION_PROGRAM__EXTENSION = GRAMMAR_EXTENSION_UNIT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTENSION_PROGRAM__STATEMENTS = GRAMMAR_EXTENSION_UNIT_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Extension Program</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTENSION_PROGRAM_FEATURE_COUNT = GRAMMAR_EXTENSION_UNIT_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.ConstructReference <em>Construct Reference</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.ConstructReference
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getConstructReference()
   * @generated
   */
	int CONSTRUCT_REFERENCE = 16;

	/**
   * The number of structural features of the '<em>Construct Reference</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONSTRUCT_REFERENCE_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.ReferenceImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getReference()
   * @generated
   */
	int REFERENCE = 3;

	/**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REFERENCE__BASE = CONSTRUCT_REFERENCE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REFERENCE__CARDINALITY = CONSTRUCT_REFERENCE_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int REFERENCE_FEATURE_COUNT = CONSTRUCT_REFERENCE_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.UpperLevelReferenceImpl <em>Upper Level Reference</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.UpperLevelReferenceImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getUpperLevelReference()
   * @generated
   */
	int UPPER_LEVEL_REFERENCE = 4;

	/**
   * The feature id for the '<em><b>Upper</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int UPPER_LEVEL_REFERENCE__UPPER = CONSTRUCT_REFERENCE_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Upper Level Reference</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int UPPER_LEVEL_REFERENCE_FEATURE_COUNT = CONSTRUCT_REFERENCE_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.BaseReference <em>Base Reference</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.BaseReference
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getBaseReference()
   * @generated
   */
	int BASE_REFERENCE = 5;

	/**
   * The number of structural features of the '<em>Base Reference</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BASE_REFERENCE_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.FragtypesImpl <em>Fragtypes</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.FragtypesImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getFragtypes()
   * @generated
   */
	int FRAGTYPES = 6;

	/**
   * The feature id for the '<em><b>Fragtype</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FRAGTYPES__FRAGTYPE = EXTENSION_STATEMENT_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Fragtypes</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FRAGTYPES_FEATURE_COUNT = EXTENSION_STATEMENT_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.ExtensionDeclarationImpl <em>Extension Declaration</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.ExtensionDeclarationImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getExtensionDeclaration()
   * @generated
   */
	int EXTENSION_DECLARATION = 7;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTENSION_DECLARATION__NAME = 0;

	/**
   * The feature id for the '<em><b>Nsuri</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTENSION_DECLARATION__NSURI = 1;

	/**
   * The feature id for the '<em><b>Nsprefix</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTENSION_DECLARATION__NSPREFIX = 2;

	/**
   * The feature id for the '<em><b>Targeturl</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTENSION_DECLARATION__TARGETURL = 3;

	/**
   * The number of structural features of the '<em>Extension Declaration</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXTENSION_DECLARATION_FEATURE_COUNT = 4;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.Definition <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.Definition
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getDefinition()
   * @generated
   */
	int DEFINITION = 8;

	/**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_FEATURE_COUNT = EXTENSION_STATEMENT_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.Cardinality <em>Cardinality</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.Cardinality
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getCardinality()
   * @generated
   */
	int CARDINALITY = 21;

	/**
   * The number of structural features of the '<em>Cardinality</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CARDINALITY_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.ArbitraryImpl <em>Arbitrary</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.ArbitraryImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getArbitrary()
   * @generated
   */
	int ARBITRARY = 9;

	/**
   * The number of structural features of the '<em>Arbitrary</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ARBITRARY_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.AnnotationImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getAnnotation()
   * @generated
   */
	int ANNOTATION = 10;

	/**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ANNOTATION__SOURCE = EXTENSION_STATEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ANNOTATION__TARGET = EXTENSION_STATEMENT_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ANNOTATION_FEATURE_COUNT = EXTENSION_STATEMENT_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.InjectionImpl <em>Injection</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.InjectionImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getInjection()
   * @generated
   */
	int INJECTION = 11;

	/**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INJECTION__SOURCE = EXTENSION_STATEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INJECTION__TARGET = EXTENSION_STATEMENT_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Injection</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INJECTION_FEATURE_COUNT = EXTENSION_STATEMENT_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.DefinitionListImpl <em>Definition List</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.DefinitionListImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getDefinitionList()
   * @generated
   */
	int DEFINITION_LIST = 12;

	/**
   * The feature id for the '<em><b>Refs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_LIST__REFS = 0;

	/**
   * The number of structural features of the '<em>Definition List</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_LIST_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.RoleImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getRole()
   * @generated
   */
	int ROLE = 13;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ROLE__VALUE = 0;

	/**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ROLE_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.NonTerminal <em>Non Terminal</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.NonTerminal
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getNonTerminal()
   * @generated
   */
	int NON_TERMINAL = 14;

	/**
   * The number of structural features of the '<em>Non Terminal</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NON_TERMINAL_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.DefinitionChoiceImpl <em>Definition Choice</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.DefinitionChoiceImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getDefinitionChoice()
   * @generated
   */
	int DEFINITION_CHOICE = 15;

	/**
   * The feature id for the '<em><b>New Construct</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_CHOICE__NEW_CONSTRUCT = DEFINITION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Choice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_CHOICE__CHOICE = DEFINITION_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Definition Choice</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_CHOICE_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.NonTerminalIdentifierImpl <em>Non Terminal Identifier</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.NonTerminalIdentifierImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getNonTerminalIdentifier()
   * @generated
   */
	int NON_TERMINAL_IDENTIFIER = 17;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NON_TERMINAL_IDENTIFIER__VALUE = NON_TERMINAL_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Non Terminal Identifier</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NON_TERMINAL_IDENTIFIER_FEATURE_COUNT = NON_TERMINAL_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.ConstructImpl <em>Construct</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.ConstructImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getConstruct()
   * @generated
   */
	int CONSTRUCT = 19;

	/**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONSTRUCT__NAME = CONSTRUCT_REFERENCE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONSTRUCT__CARDINALITY = CONSTRUCT_REFERENCE_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Construct</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONSTRUCT_FEATURE_COUNT = CONSTRUCT_REFERENCE_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.MoreThanOneImpl <em>More Than One</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.MoreThanOneImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getMoreThanOne()
   * @generated
   */
	int MORE_THAN_ONE = 20;

	/**
   * The number of structural features of the '<em>More Than One</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MORE_THAN_ONE_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.DefinitionConstructImpl <em>Definition Construct</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.DefinitionConstructImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getDefinitionConstruct()
   * @generated
   */
	int DEFINITION_CONSTRUCT = 22;

	/**
   * The feature id for the '<em><b>New Construct</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_CONSTRUCT__NEW_CONSTRUCT = DEFINITION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_CONSTRUCT__DEFINITION = DEFINITION_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Definition Construct</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_CONSTRUCT_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.SlotifyImpl <em>Slotify</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.SlotifyImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getSlotify()
   * @generated
   */
	int SLOTIFY = 23;

	/**
   * The feature id for the '<em><b>Construct</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SLOTIFY__CONSTRUCT = EXTENSION_STATEMENT_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Slotify</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SLOTIFY_FEATURE_COUNT = EXTENSION_STATEMENT_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.BaseDeclarationImpl <em>Base Declaration</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.BaseDeclarationImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getBaseDeclaration()
   * @generated
   */
	int BASE_DECLARATION = 24;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BASE_DECLARATION__NAME = 0;

	/**
   * The feature id for the '<em><b>Nsuri</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BASE_DECLARATION__NSURI = 1;

	/**
   * The feature id for the '<em><b>Sourceurl</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BASE_DECLARATION__SOURCEURL = 2;

	/**
   * The number of structural features of the '<em>Base Declaration</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BASE_DECLARATION_FEATURE_COUNT = 3;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.DefinitionPartImpl <em>Definition Part</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.DefinitionPartImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getDefinitionPart()
   * @generated
   */
	int DEFINITION_PART = 25;

	/**
   * The feature id for the '<em><b>Rolename</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_PART__ROLENAME = 0;

	/**
   * The feature id for the '<em><b>Construct</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_PART__CONSTRUCT = 1;

	/**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_PART__ANNOTATION = 2;

	/**
   * The number of structural features of the '<em>Definition Part</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEFINITION_PART_FEATURE_COUNT = 3;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.BaseLanguageReferenceImpl <em>Base Language Reference</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.BaseLanguageReferenceImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getBaseLanguageReference()
   * @generated
   */
	int BASE_LANGUAGE_REFERENCE = 26;

	/**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BASE_LANGUAGE_REFERENCE__LANGUAGE = BASE_REFERENCE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BASE_LANGUAGE_REFERENCE__BASE = BASE_REFERENCE_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Base Language Reference</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int BASE_LANGUAGE_REFERENCE_FEATURE_COUNT = BASE_REFERENCE_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.reuseware.air.language.cmsl.impl.ZeroOneImpl <em>Zero One</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.reuseware.air.language.cmsl.impl.ZeroOneImpl
   * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getZeroOne()
   * @generated
   */
	int ZERO_ONE = 27;

	/**
   * The number of structural features of the '<em>Zero One</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ZERO_ONE_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 0;


	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.ExtensionStatement <em>Extension Statement</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Statement</em>'.
   * @see org.reuseware.air.language.cmsl.ExtensionStatement
   * @generated
   */
	EClass getExtensionStatement();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.GrammarExtension <em>Grammar Extension</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grammar Extension</em>'.
   * @see org.reuseware.air.language.cmsl.GrammarExtension
   * @generated
   */
	EClass getGrammarExtension();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.GrammarExtension#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unit</em>'.
   * @see org.reuseware.air.language.cmsl.GrammarExtension#getUnit()
   * @see #getGrammarExtension()
   * @generated
   */
	EReference getGrammarExtension_Unit();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.ExtensionProgram <em>Extension Program</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Program</em>'.
   * @see org.reuseware.air.language.cmsl.ExtensionProgram
   * @generated
   */
	EClass getExtensionProgram();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.ExtensionProgram#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see org.reuseware.air.language.cmsl.ExtensionProgram#getBase()
   * @see #getExtensionProgram()
   * @generated
   */
	EReference getExtensionProgram_Base();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.ExtensionProgram#getExtension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extension</em>'.
   * @see org.reuseware.air.language.cmsl.ExtensionProgram#getExtension()
   * @see #getExtensionProgram()
   * @generated
   */
	EReference getExtensionProgram_Extension();

	/**
   * Returns the meta object for the containment reference list '{@link org.reuseware.air.language.cmsl.ExtensionProgram#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.reuseware.air.language.cmsl.ExtensionProgram#getStatements()
   * @see #getExtensionProgram()
   * @generated
   */
	EReference getExtensionProgram_Statements();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.reuseware.air.language.cmsl.Reference
   * @generated
   */
	EClass getReference();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.Reference#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see org.reuseware.air.language.cmsl.Reference#getBase()
   * @see #getReference()
   * @generated
   */
	EReference getReference_Base();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.Reference#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cardinality</em>'.
   * @see org.reuseware.air.language.cmsl.Reference#getCardinality()
   * @see #getReference()
   * @generated
   */
	EReference getReference_Cardinality();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.UpperLevelReference <em>Upper Level Reference</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Upper Level Reference</em>'.
   * @see org.reuseware.air.language.cmsl.UpperLevelReference
   * @generated
   */
	EClass getUpperLevelReference();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.UpperLevelReference#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper</em>'.
   * @see org.reuseware.air.language.cmsl.UpperLevelReference#getUpper()
   * @see #getUpperLevelReference()
   * @generated
   */
	EReference getUpperLevelReference_Upper();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.BaseReference <em>Base Reference</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Reference</em>'.
   * @see org.reuseware.air.language.cmsl.BaseReference
   * @generated
   */
	EClass getBaseReference();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.Fragtypes <em>Fragtypes</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fragtypes</em>'.
   * @see org.reuseware.air.language.cmsl.Fragtypes
   * @generated
   */
	EClass getFragtypes();

	/**
   * Returns the meta object for the containment reference list '{@link org.reuseware.air.language.cmsl.Fragtypes#getFragtype <em>Fragtype</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fragtype</em>'.
   * @see org.reuseware.air.language.cmsl.Fragtypes#getFragtype()
   * @see #getFragtypes()
   * @generated
   */
	EReference getFragtypes_Fragtype();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.ExtensionDeclaration <em>Extension Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Declaration</em>'.
   * @see org.reuseware.air.language.cmsl.ExtensionDeclaration
   * @generated
   */
	EClass getExtensionDeclaration();

	/**
   * Returns the meta object for the attribute '{@link org.reuseware.air.language.cmsl.ExtensionDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.reuseware.air.language.cmsl.ExtensionDeclaration#getName()
   * @see #getExtensionDeclaration()
   * @generated
   */
	EAttribute getExtensionDeclaration_Name();

	/**
   * Returns the meta object for the attribute '{@link org.reuseware.air.language.cmsl.ExtensionDeclaration#getNsuri <em>Nsuri</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nsuri</em>'.
   * @see org.reuseware.air.language.cmsl.ExtensionDeclaration#getNsuri()
   * @see #getExtensionDeclaration()
   * @generated
   */
	EAttribute getExtensionDeclaration_Nsuri();

	/**
   * Returns the meta object for the attribute '{@link org.reuseware.air.language.cmsl.ExtensionDeclaration#getNsprefix <em>Nsprefix</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nsprefix</em>'.
   * @see org.reuseware.air.language.cmsl.ExtensionDeclaration#getNsprefix()
   * @see #getExtensionDeclaration()
   * @generated
   */
	EAttribute getExtensionDeclaration_Nsprefix();

	/**
   * Returns the meta object for the attribute '{@link org.reuseware.air.language.cmsl.ExtensionDeclaration#getTargeturl <em>Targeturl</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Targeturl</em>'.
   * @see org.reuseware.air.language.cmsl.ExtensionDeclaration#getTargeturl()
   * @see #getExtensionDeclaration()
   * @generated
   */
	EAttribute getExtensionDeclaration_Targeturl();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.reuseware.air.language.cmsl.Definition
   * @generated
   */
	EClass getDefinition();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.Arbitrary <em>Arbitrary</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arbitrary</em>'.
   * @see org.reuseware.air.language.cmsl.Arbitrary
   * @generated
   */
	EClass getArbitrary();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.reuseware.air.language.cmsl.Annotation
   * @generated
   */
	EClass getAnnotation();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.Annotation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.reuseware.air.language.cmsl.Annotation#getSource()
   * @see #getAnnotation()
   * @generated
   */
	EReference getAnnotation_Source();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.Annotation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.reuseware.air.language.cmsl.Annotation#getTarget()
   * @see #getAnnotation()
   * @generated
   */
	EReference getAnnotation_Target();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.Injection <em>Injection</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Injection</em>'.
   * @see org.reuseware.air.language.cmsl.Injection
   * @generated
   */
	EClass getInjection();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.Injection#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.reuseware.air.language.cmsl.Injection#getSource()
   * @see #getInjection()
   * @generated
   */
	EReference getInjection_Source();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.Injection#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.reuseware.air.language.cmsl.Injection#getTarget()
   * @see #getInjection()
   * @generated
   */
	EReference getInjection_Target();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.DefinitionList <em>Definition List</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition List</em>'.
   * @see org.reuseware.air.language.cmsl.DefinitionList
   * @generated
   */
	EClass getDefinitionList();

	/**
   * Returns the meta object for the containment reference list '{@link org.reuseware.air.language.cmsl.DefinitionList#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refs</em>'.
   * @see org.reuseware.air.language.cmsl.DefinitionList#getRefs()
   * @see #getDefinitionList()
   * @generated
   */
	EReference getDefinitionList_Refs();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see org.reuseware.air.language.cmsl.Role
   * @generated
   */
	EClass getRole();

	/**
   * Returns the meta object for the attribute '{@link org.reuseware.air.language.cmsl.Role#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.reuseware.air.language.cmsl.Role#getValue()
   * @see #getRole()
   * @generated
   */
	EAttribute getRole_Value();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.NonTerminal <em>Non Terminal</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Terminal</em>'.
   * @see org.reuseware.air.language.cmsl.NonTerminal
   * @generated
   */
	EClass getNonTerminal();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.DefinitionChoice <em>Definition Choice</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition Choice</em>'.
   * @see org.reuseware.air.language.cmsl.DefinitionChoice
   * @generated
   */
	EClass getDefinitionChoice();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.DefinitionChoice#getNewConstruct <em>New Construct</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Construct</em>'.
   * @see org.reuseware.air.language.cmsl.DefinitionChoice#getNewConstruct()
   * @see #getDefinitionChoice()
   * @generated
   */
	EReference getDefinitionChoice_NewConstruct();

	/**
   * Returns the meta object for the containment reference list '{@link org.reuseware.air.language.cmsl.DefinitionChoice#getChoice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choice</em>'.
   * @see org.reuseware.air.language.cmsl.DefinitionChoice#getChoice()
   * @see #getDefinitionChoice()
   * @generated
   */
	EReference getDefinitionChoice_Choice();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.ConstructReference <em>Construct Reference</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Construct Reference</em>'.
   * @see org.reuseware.air.language.cmsl.ConstructReference
   * @generated
   */
	EClass getConstructReference();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.NonTerminalIdentifier <em>Non Terminal Identifier</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Terminal Identifier</em>'.
   * @see org.reuseware.air.language.cmsl.NonTerminalIdentifier
   * @generated
   */
	EClass getNonTerminalIdentifier();

	/**
   * Returns the meta object for the attribute '{@link org.reuseware.air.language.cmsl.NonTerminalIdentifier#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.reuseware.air.language.cmsl.NonTerminalIdentifier#getValue()
   * @see #getNonTerminalIdentifier()
   * @generated
   */
	EAttribute getNonTerminalIdentifier_Value();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.GrammarExtensionUnit <em>Grammar Extension Unit</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grammar Extension Unit</em>'.
   * @see org.reuseware.air.language.cmsl.GrammarExtensionUnit
   * @generated
   */
	EClass getGrammarExtensionUnit();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.Construct <em>Construct</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Construct</em>'.
   * @see org.reuseware.air.language.cmsl.Construct
   * @generated
   */
	EClass getConstruct();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.Construct#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.reuseware.air.language.cmsl.Construct#getName()
   * @see #getConstruct()
   * @generated
   */
	EReference getConstruct_Name();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.Construct#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cardinality</em>'.
   * @see org.reuseware.air.language.cmsl.Construct#getCardinality()
   * @see #getConstruct()
   * @generated
   */
	EReference getConstruct_Cardinality();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.MoreThanOne <em>More Than One</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>More Than One</em>'.
   * @see org.reuseware.air.language.cmsl.MoreThanOne
   * @generated
   */
	EClass getMoreThanOne();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cardinality</em>'.
   * @see org.reuseware.air.language.cmsl.Cardinality
   * @generated
   */
	EClass getCardinality();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.DefinitionConstruct <em>Definition Construct</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition Construct</em>'.
   * @see org.reuseware.air.language.cmsl.DefinitionConstruct
   * @generated
   */
	EClass getDefinitionConstruct();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.DefinitionConstruct#getNewConstruct <em>New Construct</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Construct</em>'.
   * @see org.reuseware.air.language.cmsl.DefinitionConstruct#getNewConstruct()
   * @see #getDefinitionConstruct()
   * @generated
   */
	EReference getDefinitionConstruct_NewConstruct();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.DefinitionConstruct#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.reuseware.air.language.cmsl.DefinitionConstruct#getDefinition()
   * @see #getDefinitionConstruct()
   * @generated
   */
	EReference getDefinitionConstruct_Definition();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.Slotify <em>Slotify</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slotify</em>'.
   * @see org.reuseware.air.language.cmsl.Slotify
   * @generated
   */
	EClass getSlotify();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.Slotify#getConstruct <em>Construct</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Construct</em>'.
   * @see org.reuseware.air.language.cmsl.Slotify#getConstruct()
   * @see #getSlotify()
   * @generated
   */
	EReference getSlotify_Construct();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.BaseDeclaration <em>Base Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Declaration</em>'.
   * @see org.reuseware.air.language.cmsl.BaseDeclaration
   * @generated
   */
	EClass getBaseDeclaration();

	/**
   * Returns the meta object for the attribute '{@link org.reuseware.air.language.cmsl.BaseDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.reuseware.air.language.cmsl.BaseDeclaration#getName()
   * @see #getBaseDeclaration()
   * @generated
   */
	EAttribute getBaseDeclaration_Name();

	/**
   * Returns the meta object for the attribute '{@link org.reuseware.air.language.cmsl.BaseDeclaration#getNsuri <em>Nsuri</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nsuri</em>'.
   * @see org.reuseware.air.language.cmsl.BaseDeclaration#getNsuri()
   * @see #getBaseDeclaration()
   * @generated
   */
	EAttribute getBaseDeclaration_Nsuri();

	/**
   * Returns the meta object for the attribute '{@link org.reuseware.air.language.cmsl.BaseDeclaration#getSourceurl <em>Sourceurl</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sourceurl</em>'.
   * @see org.reuseware.air.language.cmsl.BaseDeclaration#getSourceurl()
   * @see #getBaseDeclaration()
   * @generated
   */
	EAttribute getBaseDeclaration_Sourceurl();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.DefinitionPart <em>Definition Part</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition Part</em>'.
   * @see org.reuseware.air.language.cmsl.DefinitionPart
   * @generated
   */
	EClass getDefinitionPart();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.DefinitionPart#getRolename <em>Rolename</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rolename</em>'.
   * @see org.reuseware.air.language.cmsl.DefinitionPart#getRolename()
   * @see #getDefinitionPart()
   * @generated
   */
	EReference getDefinitionPart_Rolename();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.DefinitionPart#getConstruct <em>Construct</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Construct</em>'.
   * @see org.reuseware.air.language.cmsl.DefinitionPart#getConstruct()
   * @see #getDefinitionPart()
   * @generated
   */
	EReference getDefinitionPart_Construct();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.DefinitionPart#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see org.reuseware.air.language.cmsl.DefinitionPart#getAnnotation()
   * @see #getDefinitionPart()
   * @generated
   */
	EReference getDefinitionPart_Annotation();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.BaseLanguageReference <em>Base Language Reference</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Language Reference</em>'.
   * @see org.reuseware.air.language.cmsl.BaseLanguageReference
   * @generated
   */
	EClass getBaseLanguageReference();

	/**
   * Returns the meta object for the attribute '{@link org.reuseware.air.language.cmsl.BaseLanguageReference#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Language</em>'.
   * @see org.reuseware.air.language.cmsl.BaseLanguageReference#getLanguage()
   * @see #getBaseLanguageReference()
   * @generated
   */
	EAttribute getBaseLanguageReference_Language();

	/**
   * Returns the meta object for the containment reference '{@link org.reuseware.air.language.cmsl.BaseLanguageReference#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see org.reuseware.air.language.cmsl.BaseLanguageReference#getBase()
   * @see #getBaseLanguageReference()
   * @generated
   */
	EReference getBaseLanguageReference_Base();

	/**
   * Returns the meta object for class '{@link org.reuseware.air.language.cmsl.ZeroOne <em>Zero One</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Zero One</em>'.
   * @see org.reuseware.air.language.cmsl.ZeroOne
   * @generated
   */
	EClass getZeroOne();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	CmslFactory getCmslFactory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals {
		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.ExtensionStatement <em>Extension Statement</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.ExtensionStatement
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getExtensionStatement()
     * @generated
     */
		EClass EXTENSION_STATEMENT = eINSTANCE.getExtensionStatement();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.GrammarExtensionImpl <em>Grammar Extension</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.GrammarExtensionImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getGrammarExtension()
     * @generated
     */
		EClass GRAMMAR_EXTENSION = eINSTANCE.getGrammarExtension();

		/**
     * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference GRAMMAR_EXTENSION__UNIT = eINSTANCE.getGrammarExtension_Unit();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.ExtensionProgramImpl <em>Extension Program</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.ExtensionProgramImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getExtensionProgram()
     * @generated
     */
		EClass EXTENSION_PROGRAM = eINSTANCE.getExtensionProgram();

		/**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference EXTENSION_PROGRAM__BASE = eINSTANCE.getExtensionProgram_Base();

		/**
     * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference EXTENSION_PROGRAM__EXTENSION = eINSTANCE.getExtensionProgram_Extension();

		/**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference EXTENSION_PROGRAM__STATEMENTS = eINSTANCE.getExtensionProgram_Statements();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.ReferenceImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getReference()
     * @generated
     */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference REFERENCE__BASE = eINSTANCE.getReference_Base();

		/**
     * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference REFERENCE__CARDINALITY = eINSTANCE.getReference_Cardinality();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.UpperLevelReferenceImpl <em>Upper Level Reference</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.UpperLevelReferenceImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getUpperLevelReference()
     * @generated
     */
		EClass UPPER_LEVEL_REFERENCE = eINSTANCE.getUpperLevelReference();

		/**
     * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference UPPER_LEVEL_REFERENCE__UPPER = eINSTANCE.getUpperLevelReference_Upper();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.BaseReference <em>Base Reference</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.BaseReference
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getBaseReference()
     * @generated
     */
		EClass BASE_REFERENCE = eINSTANCE.getBaseReference();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.FragtypesImpl <em>Fragtypes</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.FragtypesImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getFragtypes()
     * @generated
     */
		EClass FRAGTYPES = eINSTANCE.getFragtypes();

		/**
     * The meta object literal for the '<em><b>Fragtype</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference FRAGTYPES__FRAGTYPE = eINSTANCE.getFragtypes_Fragtype();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.ExtensionDeclarationImpl <em>Extension Declaration</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.ExtensionDeclarationImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getExtensionDeclaration()
     * @generated
     */
		EClass EXTENSION_DECLARATION = eINSTANCE.getExtensionDeclaration();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute EXTENSION_DECLARATION__NAME = eINSTANCE.getExtensionDeclaration_Name();

		/**
     * The meta object literal for the '<em><b>Nsuri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute EXTENSION_DECLARATION__NSURI = eINSTANCE.getExtensionDeclaration_Nsuri();

		/**
     * The meta object literal for the '<em><b>Nsprefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute EXTENSION_DECLARATION__NSPREFIX = eINSTANCE.getExtensionDeclaration_Nsprefix();

		/**
     * The meta object literal for the '<em><b>Targeturl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute EXTENSION_DECLARATION__TARGETURL = eINSTANCE.getExtensionDeclaration_Targeturl();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.Definition <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.Definition
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getDefinition()
     * @generated
     */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.ArbitraryImpl <em>Arbitrary</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.ArbitraryImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getArbitrary()
     * @generated
     */
		EClass ARBITRARY = eINSTANCE.getArbitrary();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.AnnotationImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getAnnotation()
     * @generated
     */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ANNOTATION__SOURCE = eINSTANCE.getAnnotation_Source();

		/**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ANNOTATION__TARGET = eINSTANCE.getAnnotation_Target();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.InjectionImpl <em>Injection</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.InjectionImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getInjection()
     * @generated
     */
		EClass INJECTION = eINSTANCE.getInjection();

		/**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference INJECTION__SOURCE = eINSTANCE.getInjection_Source();

		/**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference INJECTION__TARGET = eINSTANCE.getInjection_Target();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.DefinitionListImpl <em>Definition List</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.DefinitionListImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getDefinitionList()
     * @generated
     */
		EClass DEFINITION_LIST = eINSTANCE.getDefinitionList();

		/**
     * The meta object literal for the '<em><b>Refs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DEFINITION_LIST__REFS = eINSTANCE.getDefinitionList_Refs();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.RoleImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getRole()
     * @generated
     */
		EClass ROLE = eINSTANCE.getRole();

		/**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ROLE__VALUE = eINSTANCE.getRole_Value();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.NonTerminal <em>Non Terminal</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.NonTerminal
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getNonTerminal()
     * @generated
     */
		EClass NON_TERMINAL = eINSTANCE.getNonTerminal();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.DefinitionChoiceImpl <em>Definition Choice</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.DefinitionChoiceImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getDefinitionChoice()
     * @generated
     */
		EClass DEFINITION_CHOICE = eINSTANCE.getDefinitionChoice();

		/**
     * The meta object literal for the '<em><b>New Construct</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DEFINITION_CHOICE__NEW_CONSTRUCT = eINSTANCE.getDefinitionChoice_NewConstruct();

		/**
     * The meta object literal for the '<em><b>Choice</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DEFINITION_CHOICE__CHOICE = eINSTANCE.getDefinitionChoice_Choice();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.ConstructReference <em>Construct Reference</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.ConstructReference
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getConstructReference()
     * @generated
     */
		EClass CONSTRUCT_REFERENCE = eINSTANCE.getConstructReference();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.NonTerminalIdentifierImpl <em>Non Terminal Identifier</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.NonTerminalIdentifierImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getNonTerminalIdentifier()
     * @generated
     */
		EClass NON_TERMINAL_IDENTIFIER = eINSTANCE.getNonTerminalIdentifier();

		/**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NON_TERMINAL_IDENTIFIER__VALUE = eINSTANCE.getNonTerminalIdentifier_Value();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.GrammarExtensionUnit <em>Grammar Extension Unit</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.GrammarExtensionUnit
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getGrammarExtensionUnit()
     * @generated
     */
		EClass GRAMMAR_EXTENSION_UNIT = eINSTANCE.getGrammarExtensionUnit();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.ConstructImpl <em>Construct</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.ConstructImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getConstruct()
     * @generated
     */
		EClass CONSTRUCT = eINSTANCE.getConstruct();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CONSTRUCT__NAME = eINSTANCE.getConstruct_Name();

		/**
     * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CONSTRUCT__CARDINALITY = eINSTANCE.getConstruct_Cardinality();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.MoreThanOneImpl <em>More Than One</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.MoreThanOneImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getMoreThanOne()
     * @generated
     */
		EClass MORE_THAN_ONE = eINSTANCE.getMoreThanOne();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.Cardinality <em>Cardinality</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.Cardinality
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getCardinality()
     * @generated
     */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.DefinitionConstructImpl <em>Definition Construct</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.DefinitionConstructImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getDefinitionConstruct()
     * @generated
     */
		EClass DEFINITION_CONSTRUCT = eINSTANCE.getDefinitionConstruct();

		/**
     * The meta object literal for the '<em><b>New Construct</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DEFINITION_CONSTRUCT__NEW_CONSTRUCT = eINSTANCE.getDefinitionConstruct_NewConstruct();

		/**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DEFINITION_CONSTRUCT__DEFINITION = eINSTANCE.getDefinitionConstruct_Definition();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.SlotifyImpl <em>Slotify</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.SlotifyImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getSlotify()
     * @generated
     */
		EClass SLOTIFY = eINSTANCE.getSlotify();

		/**
     * The meta object literal for the '<em><b>Construct</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SLOTIFY__CONSTRUCT = eINSTANCE.getSlotify_Construct();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.BaseDeclarationImpl <em>Base Declaration</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.BaseDeclarationImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getBaseDeclaration()
     * @generated
     */
		EClass BASE_DECLARATION = eINSTANCE.getBaseDeclaration();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute BASE_DECLARATION__NAME = eINSTANCE.getBaseDeclaration_Name();

		/**
     * The meta object literal for the '<em><b>Nsuri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute BASE_DECLARATION__NSURI = eINSTANCE.getBaseDeclaration_Nsuri();

		/**
     * The meta object literal for the '<em><b>Sourceurl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute BASE_DECLARATION__SOURCEURL = eINSTANCE.getBaseDeclaration_Sourceurl();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.DefinitionPartImpl <em>Definition Part</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.DefinitionPartImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getDefinitionPart()
     * @generated
     */
		EClass DEFINITION_PART = eINSTANCE.getDefinitionPart();

		/**
     * The meta object literal for the '<em><b>Rolename</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DEFINITION_PART__ROLENAME = eINSTANCE.getDefinitionPart_Rolename();

		/**
     * The meta object literal for the '<em><b>Construct</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DEFINITION_PART__CONSTRUCT = eINSTANCE.getDefinitionPart_Construct();

		/**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DEFINITION_PART__ANNOTATION = eINSTANCE.getDefinitionPart_Annotation();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.BaseLanguageReferenceImpl <em>Base Language Reference</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.BaseLanguageReferenceImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getBaseLanguageReference()
     * @generated
     */
		EClass BASE_LANGUAGE_REFERENCE = eINSTANCE.getBaseLanguageReference();

		/**
     * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute BASE_LANGUAGE_REFERENCE__LANGUAGE = eINSTANCE.getBaseLanguageReference_Language();

		/**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference BASE_LANGUAGE_REFERENCE__BASE = eINSTANCE.getBaseLanguageReference_Base();

		/**
     * The meta object literal for the '{@link org.reuseware.air.language.cmsl.impl.ZeroOneImpl <em>Zero One</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.reuseware.air.language.cmsl.impl.ZeroOneImpl
     * @see org.reuseware.air.language.cmsl.impl.CmslPackageImpl#getZeroOne()
     * @generated
     */
		EClass ZERO_ONE = eINSTANCE.getZeroOne();

	}

} //CmslPackage
