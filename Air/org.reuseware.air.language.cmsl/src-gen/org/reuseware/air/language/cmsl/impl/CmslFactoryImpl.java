/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.reuseware.air.language.cmsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmslFactoryImpl extends EFactoryImpl implements CmslFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CmslFactory init() {
    try
    {
      CmslFactory theCmslFactory = (CmslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.reuseware.org/air/language/cmsl"); 
      if (theCmslFactory != null)
      {
        return theCmslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CmslFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CmslFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case CmslPackage.GRAMMAR_EXTENSION: return createGrammarExtension();
      case CmslPackage.EXTENSION_PROGRAM: return createExtensionProgram();
      case CmslPackage.REFERENCE: return createReference();
      case CmslPackage.UPPER_LEVEL_REFERENCE: return createUpperLevelReference();
      case CmslPackage.FRAGTYPES: return createFragtypes();
      case CmslPackage.EXTENSION_DECLARATION: return createExtensionDeclaration();
      case CmslPackage.ARBITRARY: return createArbitrary();
      case CmslPackage.ANNOTATION: return createAnnotation();
      case CmslPackage.INJECTION: return createInjection();
      case CmslPackage.DEFINITION_LIST: return createDefinitionList();
      case CmslPackage.ROLE: return createRole();
      case CmslPackage.DEFINITION_CHOICE: return createDefinitionChoice();
      case CmslPackage.NON_TERMINAL_IDENTIFIER: return createNonTerminalIdentifier();
      case CmslPackage.CONSTRUCT: return createConstruct();
      case CmslPackage.MORE_THAN_ONE: return createMoreThanOne();
      case CmslPackage.DEFINITION_CONSTRUCT: return createDefinitionConstruct();
      case CmslPackage.SLOTIFY: return createSlotify();
      case CmslPackage.BASE_DECLARATION: return createBaseDeclaration();
      case CmslPackage.DEFINITION_PART: return createDefinitionPart();
      case CmslPackage.BASE_LANGUAGE_REFERENCE: return createBaseLanguageReference();
      case CmslPackage.ZERO_ONE: return createZeroOne();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GrammarExtension createGrammarExtension() {
    GrammarExtensionImpl grammarExtension = new GrammarExtensionImpl();
    return grammarExtension;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ExtensionProgram createExtensionProgram() {
    ExtensionProgramImpl extensionProgram = new ExtensionProgramImpl();
    return extensionProgram;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Reference createReference() {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public UpperLevelReference createUpperLevelReference() {
    UpperLevelReferenceImpl upperLevelReference = new UpperLevelReferenceImpl();
    return upperLevelReference;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Fragtypes createFragtypes() {
    FragtypesImpl fragtypes = new FragtypesImpl();
    return fragtypes;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ExtensionDeclaration createExtensionDeclaration() {
    ExtensionDeclarationImpl extensionDeclaration = new ExtensionDeclarationImpl();
    return extensionDeclaration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Arbitrary createArbitrary() {
    ArbitraryImpl arbitrary = new ArbitraryImpl();
    return arbitrary;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Annotation createAnnotation() {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Injection createInjection() {
    InjectionImpl injection = new InjectionImpl();
    return injection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DefinitionList createDefinitionList() {
    DefinitionListImpl definitionList = new DefinitionListImpl();
    return definitionList;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Role createRole() {
    RoleImpl role = new RoleImpl();
    return role;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DefinitionChoice createDefinitionChoice() {
    DefinitionChoiceImpl definitionChoice = new DefinitionChoiceImpl();
    return definitionChoice;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NonTerminalIdentifier createNonTerminalIdentifier() {
    NonTerminalIdentifierImpl nonTerminalIdentifier = new NonTerminalIdentifierImpl();
    return nonTerminalIdentifier;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Construct createConstruct() {
    ConstructImpl construct = new ConstructImpl();
    return construct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MoreThanOne createMoreThanOne() {
    MoreThanOneImpl moreThanOne = new MoreThanOneImpl();
    return moreThanOne;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DefinitionConstruct createDefinitionConstruct() {
    DefinitionConstructImpl definitionConstruct = new DefinitionConstructImpl();
    return definitionConstruct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Slotify createSlotify() {
    SlotifyImpl slotify = new SlotifyImpl();
    return slotify;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BaseDeclaration createBaseDeclaration() {
    BaseDeclarationImpl baseDeclaration = new BaseDeclarationImpl();
    return baseDeclaration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DefinitionPart createDefinitionPart() {
    DefinitionPartImpl definitionPart = new DefinitionPartImpl();
    return definitionPart;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BaseLanguageReference createBaseLanguageReference() {
    BaseLanguageReferenceImpl baseLanguageReference = new BaseLanguageReferenceImpl();
    return baseLanguageReference;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ZeroOne createZeroOne() {
    ZeroOneImpl zeroOne = new ZeroOneImpl();
    return zeroOne;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CmslPackage getCmslPackage() {
    return (CmslPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	public static CmslPackage getPackage() {
    return CmslPackage.eINSTANCE;
  }

} //CmslFactoryImpl
