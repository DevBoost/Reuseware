/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.reuseware.air.language.cmsl.Annotation;
import org.reuseware.air.language.cmsl.Arbitrary;
import org.reuseware.air.language.cmsl.BaseDeclaration;
import org.reuseware.air.language.cmsl.BaseLanguageReference;
import org.reuseware.air.language.cmsl.BaseReference;
import org.reuseware.air.language.cmsl.Cardinality;
import org.reuseware.air.language.cmsl.CmslFactory;
import org.reuseware.air.language.cmsl.CmslPackage;
import org.reuseware.air.language.cmsl.Construct;
import org.reuseware.air.language.cmsl.ConstructReference;
import org.reuseware.air.language.cmsl.Definition;
import org.reuseware.air.language.cmsl.DefinitionChoice;
import org.reuseware.air.language.cmsl.DefinitionConstruct;
import org.reuseware.air.language.cmsl.DefinitionList;
import org.reuseware.air.language.cmsl.DefinitionPart;
import org.reuseware.air.language.cmsl.ExtensionDeclaration;
import org.reuseware.air.language.cmsl.ExtensionProgram;
import org.reuseware.air.language.cmsl.ExtensionStatement;
import org.reuseware.air.language.cmsl.Fragtypes;
import org.reuseware.air.language.cmsl.GrammarExtension;
import org.reuseware.air.language.cmsl.GrammarExtensionUnit;
import org.reuseware.air.language.cmsl.Injection;
import org.reuseware.air.language.cmsl.MoreThanOne;
import org.reuseware.air.language.cmsl.NonTerminal;
import org.reuseware.air.language.cmsl.NonTerminalIdentifier;
import org.reuseware.air.language.cmsl.Reference;
import org.reuseware.air.language.cmsl.Role;
import org.reuseware.air.language.cmsl.Slotify;
import org.reuseware.air.language.cmsl.UpperLevelReference;
import org.reuseware.air.language.cmsl.ZeroOne;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmslPackageImpl extends EPackageImpl implements CmslPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass extensionStatementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass grammarExtensionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass extensionProgramEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass referenceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass upperLevelReferenceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass baseReferenceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass fragtypesEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass extensionDeclarationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass definitionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass arbitraryEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass annotationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass injectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass definitionListEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass roleEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass nonTerminalEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass definitionChoiceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass constructReferenceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass nonTerminalIdentifierEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass grammarExtensionUnitEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass constructEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass moreThanOneEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass cardinalityEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass definitionConstructEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass slotifyEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass baseDeclarationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass definitionPartEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass baseLanguageReferenceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass zeroOneEClass = null;

	/**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.reuseware.air.language.cmsl.CmslPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private CmslPackageImpl() {
    super(eNS_URI, CmslFactory.eINSTANCE);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static boolean isInited = false;

	/**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static CmslPackage init() {
    if (isInited) return (CmslPackage)EPackage.Registry.INSTANCE.getEPackage(CmslPackage.eNS_URI);

    // Obtain or create and register package
    CmslPackageImpl theCmslPackage = (CmslPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CmslPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CmslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCmslPackage.createPackageContents();

    // Initialize created meta-data
    theCmslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCmslPackage.freeze();

    return theCmslPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getExtensionStatement() {
    return extensionStatementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getGrammarExtension() {
    return grammarExtensionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getGrammarExtension_Unit() {
    return (EReference)grammarExtensionEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getExtensionProgram() {
    return extensionProgramEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getExtensionProgram_Base() {
    return (EReference)extensionProgramEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getExtensionProgram_Extension() {
    return (EReference)extensionProgramEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getExtensionProgram_Statements() {
    return (EReference)extensionProgramEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getReference() {
    return referenceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getReference_Base() {
    return (EReference)referenceEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getReference_Cardinality() {
    return (EReference)referenceEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getUpperLevelReference() {
    return upperLevelReferenceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getUpperLevelReference_Upper() {
    return (EReference)upperLevelReferenceEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getBaseReference() {
    return baseReferenceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getFragtypes() {
    return fragtypesEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getFragtypes_Fragtype() {
    return (EReference)fragtypesEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getExtensionDeclaration() {
    return extensionDeclarationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getExtensionDeclaration_Name() {
    return (EAttribute)extensionDeclarationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getExtensionDeclaration_Nsuri() {
    return (EAttribute)extensionDeclarationEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getExtensionDeclaration_Nsprefix() {
    return (EAttribute)extensionDeclarationEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getExtensionDeclaration_Targeturl() {
    return (EAttribute)extensionDeclarationEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDefinition() {
    return definitionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getArbitrary() {
    return arbitraryEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnnotation() {
    return annotationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAnnotation_Source() {
    return (EReference)annotationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAnnotation_Target() {
    return (EReference)annotationEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getInjection() {
    return injectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getInjection_Source() {
    return (EReference)injectionEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getInjection_Target() {
    return (EReference)injectionEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDefinitionList() {
    return definitionListEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDefinitionList_Refs() {
    return (EReference)definitionListEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getRole() {
    return roleEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRole_Value() {
    return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNonTerminal() {
    return nonTerminalEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDefinitionChoice() {
    return definitionChoiceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDefinitionChoice_NewConstruct() {
    return (EReference)definitionChoiceEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDefinitionChoice_Choice() {
    return (EReference)definitionChoiceEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getConstructReference() {
    return constructReferenceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNonTerminalIdentifier() {
    return nonTerminalIdentifierEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNonTerminalIdentifier_Value() {
    return (EAttribute)nonTerminalIdentifierEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getGrammarExtensionUnit() {
    return grammarExtensionUnitEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getConstruct() {
    return constructEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getConstruct_Name() {
    return (EReference)constructEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getConstruct_Cardinality() {
    return (EReference)constructEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMoreThanOne() {
    return moreThanOneEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getCardinality() {
    return cardinalityEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDefinitionConstruct() {
    return definitionConstructEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDefinitionConstruct_NewConstruct() {
    return (EReference)definitionConstructEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDefinitionConstruct_Definition() {
    return (EReference)definitionConstructEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSlotify() {
    return slotifyEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSlotify_Construct() {
    return (EReference)slotifyEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getBaseDeclaration() {
    return baseDeclarationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getBaseDeclaration_Name() {
    return (EAttribute)baseDeclarationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getBaseDeclaration_Nsuri() {
    return (EAttribute)baseDeclarationEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getBaseDeclaration_Sourceurl() {
    return (EAttribute)baseDeclarationEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDefinitionPart() {
    return definitionPartEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDefinitionPart_Rolename() {
    return (EReference)definitionPartEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDefinitionPart_Construct() {
    return (EReference)definitionPartEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDefinitionPart_Annotation() {
    return (EReference)definitionPartEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getBaseLanguageReference() {
    return baseLanguageReferenceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getBaseLanguageReference_Language() {
    return (EAttribute)baseLanguageReferenceEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getBaseLanguageReference_Base() {
    return (EReference)baseLanguageReferenceEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getZeroOne() {
    return zeroOneEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CmslFactory getCmslFactory() {
    return (CmslFactory)getEFactoryInstance();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isCreated = false;

	/**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    extensionStatementEClass = createEClass(EXTENSION_STATEMENT);

    grammarExtensionEClass = createEClass(GRAMMAR_EXTENSION);
    createEReference(grammarExtensionEClass, GRAMMAR_EXTENSION__UNIT);

    extensionProgramEClass = createEClass(EXTENSION_PROGRAM);
    createEReference(extensionProgramEClass, EXTENSION_PROGRAM__BASE);
    createEReference(extensionProgramEClass, EXTENSION_PROGRAM__EXTENSION);
    createEReference(extensionProgramEClass, EXTENSION_PROGRAM__STATEMENTS);

    referenceEClass = createEClass(REFERENCE);
    createEReference(referenceEClass, REFERENCE__BASE);
    createEReference(referenceEClass, REFERENCE__CARDINALITY);

    upperLevelReferenceEClass = createEClass(UPPER_LEVEL_REFERENCE);
    createEReference(upperLevelReferenceEClass, UPPER_LEVEL_REFERENCE__UPPER);

    baseReferenceEClass = createEClass(BASE_REFERENCE);

    fragtypesEClass = createEClass(FRAGTYPES);
    createEReference(fragtypesEClass, FRAGTYPES__FRAGTYPE);

    extensionDeclarationEClass = createEClass(EXTENSION_DECLARATION);
    createEAttribute(extensionDeclarationEClass, EXTENSION_DECLARATION__NAME);
    createEAttribute(extensionDeclarationEClass, EXTENSION_DECLARATION__NSURI);
    createEAttribute(extensionDeclarationEClass, EXTENSION_DECLARATION__NSPREFIX);
    createEAttribute(extensionDeclarationEClass, EXTENSION_DECLARATION__TARGETURL);

    definitionEClass = createEClass(DEFINITION);

    arbitraryEClass = createEClass(ARBITRARY);

    annotationEClass = createEClass(ANNOTATION);
    createEReference(annotationEClass, ANNOTATION__SOURCE);
    createEReference(annotationEClass, ANNOTATION__TARGET);

    injectionEClass = createEClass(INJECTION);
    createEReference(injectionEClass, INJECTION__SOURCE);
    createEReference(injectionEClass, INJECTION__TARGET);

    definitionListEClass = createEClass(DEFINITION_LIST);
    createEReference(definitionListEClass, DEFINITION_LIST__REFS);

    roleEClass = createEClass(ROLE);
    createEAttribute(roleEClass, ROLE__VALUE);

    nonTerminalEClass = createEClass(NON_TERMINAL);

    definitionChoiceEClass = createEClass(DEFINITION_CHOICE);
    createEReference(definitionChoiceEClass, DEFINITION_CHOICE__NEW_CONSTRUCT);
    createEReference(definitionChoiceEClass, DEFINITION_CHOICE__CHOICE);

    constructReferenceEClass = createEClass(CONSTRUCT_REFERENCE);

    nonTerminalIdentifierEClass = createEClass(NON_TERMINAL_IDENTIFIER);
    createEAttribute(nonTerminalIdentifierEClass, NON_TERMINAL_IDENTIFIER__VALUE);

    grammarExtensionUnitEClass = createEClass(GRAMMAR_EXTENSION_UNIT);

    constructEClass = createEClass(CONSTRUCT);
    createEReference(constructEClass, CONSTRUCT__NAME);
    createEReference(constructEClass, CONSTRUCT__CARDINALITY);

    moreThanOneEClass = createEClass(MORE_THAN_ONE);

    cardinalityEClass = createEClass(CARDINALITY);

    definitionConstructEClass = createEClass(DEFINITION_CONSTRUCT);
    createEReference(definitionConstructEClass, DEFINITION_CONSTRUCT__NEW_CONSTRUCT);
    createEReference(definitionConstructEClass, DEFINITION_CONSTRUCT__DEFINITION);

    slotifyEClass = createEClass(SLOTIFY);
    createEReference(slotifyEClass, SLOTIFY__CONSTRUCT);

    baseDeclarationEClass = createEClass(BASE_DECLARATION);
    createEAttribute(baseDeclarationEClass, BASE_DECLARATION__NAME);
    createEAttribute(baseDeclarationEClass, BASE_DECLARATION__NSURI);
    createEAttribute(baseDeclarationEClass, BASE_DECLARATION__SOURCEURL);

    definitionPartEClass = createEClass(DEFINITION_PART);
    createEReference(definitionPartEClass, DEFINITION_PART__ROLENAME);
    createEReference(definitionPartEClass, DEFINITION_PART__CONSTRUCT);
    createEReference(definitionPartEClass, DEFINITION_PART__ANNOTATION);

    baseLanguageReferenceEClass = createEClass(BASE_LANGUAGE_REFERENCE);
    createEAttribute(baseLanguageReferenceEClass, BASE_LANGUAGE_REFERENCE__LANGUAGE);
    createEReference(baseLanguageReferenceEClass, BASE_LANGUAGE_REFERENCE__BASE);

    zeroOneEClass = createEClass(ZERO_ONE);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isInitialized = false;

	/**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Add supertypes to classes
    extensionProgramEClass.getESuperTypes().add(this.getGrammarExtensionUnit());
    referenceEClass.getESuperTypes().add(this.getConstructReference());
    upperLevelReferenceEClass.getESuperTypes().add(this.getConstructReference());
    fragtypesEClass.getESuperTypes().add(this.getExtensionStatement());
    definitionEClass.getESuperTypes().add(this.getExtensionStatement());
    arbitraryEClass.getESuperTypes().add(this.getCardinality());
    annotationEClass.getESuperTypes().add(this.getExtensionStatement());
    injectionEClass.getESuperTypes().add(this.getExtensionStatement());
    definitionChoiceEClass.getESuperTypes().add(this.getDefinition());
    nonTerminalIdentifierEClass.getESuperTypes().add(this.getNonTerminal());
    constructEClass.getESuperTypes().add(this.getConstructReference());
    moreThanOneEClass.getESuperTypes().add(this.getCardinality());
    definitionConstructEClass.getESuperTypes().add(this.getDefinition());
    slotifyEClass.getESuperTypes().add(this.getExtensionStatement());
    baseLanguageReferenceEClass.getESuperTypes().add(this.getBaseReference());
    zeroOneEClass.getESuperTypes().add(this.getCardinality());

    // Initialize classes and features; add operations and parameters
    initEClass(extensionStatementEClass, ExtensionStatement.class, "ExtensionStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(grammarExtensionEClass, GrammarExtension.class, "GrammarExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGrammarExtension_Unit(), this.getGrammarExtensionUnit(), null, "unit", null, 1, 1, GrammarExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extensionProgramEClass, ExtensionProgram.class, "ExtensionProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtensionProgram_Base(), this.getBaseDeclaration(), null, "base", null, 1, 1, ExtensionProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtensionProgram_Extension(), this.getExtensionDeclaration(), null, "extension", null, 1, 1, ExtensionProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtensionProgram_Statements(), this.getExtensionStatement(), null, "statements", null, 0, -1, ExtensionProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReference_Base(), this.getBaseReference(), null, "base", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReference_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(upperLevelReferenceEClass, UpperLevelReference.class, "UpperLevelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpperLevelReference_Upper(), this.getNonTerminal(), null, "upper", null, 1, 1, UpperLevelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(baseReferenceEClass, BaseReference.class, "BaseReference", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fragtypesEClass, Fragtypes.class, "Fragtypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFragtypes_Fragtype(), this.getConstructReference(), null, "fragtype", null, 0, -1, Fragtypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extensionDeclarationEClass, ExtensionDeclaration.class, "ExtensionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExtensionDeclaration_Name(), ecorePackage.getEString(), "name", null, 1, 1, ExtensionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtensionDeclaration_Nsuri(), ecorePackage.getEString(), "nsuri", null, 0, 1, ExtensionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtensionDeclaration_Nsprefix(), ecorePackage.getEString(), "nsprefix", null, 0, 1, ExtensionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtensionDeclaration_Targeturl(), ecorePackage.getEString(), "targeturl", null, 0, 1, ExtensionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionEClass, Definition.class, "Definition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arbitraryEClass, Arbitrary.class, "Arbitrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotation_Source(), this.getNonTerminal(), null, "source", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotation_Target(), this.getNonTerminal(), null, "target", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(injectionEClass, Injection.class, "Injection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInjection_Source(), this.getNonTerminal(), null, "source", null, 1, 1, Injection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInjection_Target(), this.getBaseReference(), null, "target", null, 1, 1, Injection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionListEClass, DefinitionList.class, "DefinitionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinitionList_Refs(), this.getDefinitionPart(), null, "refs", null, 1, -1, DefinitionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRole_Value(), ecorePackage.getEString(), "value", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nonTerminalEClass, NonTerminal.class, "NonTerminal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(definitionChoiceEClass, DefinitionChoice.class, "DefinitionChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinitionChoice_NewConstruct(), this.getNonTerminal(), null, "newConstruct", null, 1, 1, DefinitionChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinitionChoice_Choice(), this.getNonTerminal(), null, "choice", null, 0, -1, DefinitionChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructReferenceEClass, ConstructReference.class, "ConstructReference", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nonTerminalIdentifierEClass, NonTerminalIdentifier.class, "NonTerminalIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNonTerminalIdentifier_Value(), ecorePackage.getEString(), "value", null, 1, 1, NonTerminalIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(grammarExtensionUnitEClass, GrammarExtensionUnit.class, "GrammarExtensionUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constructEClass, Construct.class, "Construct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstruct_Name(), this.getNonTerminal(), null, "name", null, 1, 1, Construct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstruct_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, 1, Construct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moreThanOneEClass, MoreThanOne.class, "MoreThanOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cardinalityEClass, Cardinality.class, "Cardinality", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(definitionConstructEClass, DefinitionConstruct.class, "DefinitionConstruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinitionConstruct_NewConstruct(), this.getNonTerminal(), null, "newConstruct", null, 1, 1, DefinitionConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinitionConstruct_Definition(), this.getDefinitionList(), null, "definition", null, 0, 1, DefinitionConstruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slotifyEClass, Slotify.class, "Slotify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlotify_Construct(), this.getBaseReference(), null, "construct", null, 1, 1, Slotify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(baseDeclarationEClass, BaseDeclaration.class, "BaseDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBaseDeclaration_Name(), ecorePackage.getEString(), "name", null, 1, 1, BaseDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBaseDeclaration_Nsuri(), ecorePackage.getEString(), "nsuri", null, 1, 1, BaseDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBaseDeclaration_Sourceurl(), ecorePackage.getEString(), "sourceurl", null, 0, 1, BaseDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionPartEClass, DefinitionPart.class, "DefinitionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinitionPart_Rolename(), this.getRole(), null, "rolename", null, 1, 1, DefinitionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinitionPart_Construct(), this.getConstructReference(), null, "construct", null, 1, 1, DefinitionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinitionPart_Annotation(), this.getUpperLevelReference(), null, "annotation", null, 0, 1, DefinitionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(baseLanguageReferenceEClass, BaseLanguageReference.class, "BaseLanguageReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBaseLanguageReference_Language(), ecorePackage.getEString(), "language", null, 1, 1, BaseLanguageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBaseLanguageReference_Base(), this.getNonTerminal(), null, "base", null, 1, 1, BaseLanguageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(zeroOneEClass, ZeroOne.class, "ZeroOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //CmslPackageImpl
