/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.reuseware.air.language.cmsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.reuseware.air.language.cmsl.CmslPackage
 * @generated
 */
public class CmslSwitch {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static CmslPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CmslSwitch() {
    if (modelPackage == null)
    {
      modelPackage = CmslPackage.eINSTANCE;
    }
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	public Object doSwitch(EObject theEObject) {
    return doSwitch(theEObject.eClass(), theEObject);
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch((EClass)eSuperTypes.get(0), theEObject);
    }
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	protected Object doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID)
    {
      case CmslPackage.EXTENSION_STATEMENT:
      {
        ExtensionStatement extensionStatement = (ExtensionStatement)theEObject;
        Object result = caseExtensionStatement(extensionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.GRAMMAR_EXTENSION:
      {
        GrammarExtension grammarExtension = (GrammarExtension)theEObject;
        Object result = caseGrammarExtension(grammarExtension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.EXTENSION_PROGRAM:
      {
        ExtensionProgram extensionProgram = (ExtensionProgram)theEObject;
        Object result = caseExtensionProgram(extensionProgram);
        if (result == null) result = caseGrammarExtensionUnit(extensionProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        Object result = caseReference(reference);
        if (result == null) result = caseConstructReference(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.UPPER_LEVEL_REFERENCE:
      {
        UpperLevelReference upperLevelReference = (UpperLevelReference)theEObject;
        Object result = caseUpperLevelReference(upperLevelReference);
        if (result == null) result = caseConstructReference(upperLevelReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.BASE_REFERENCE:
      {
        BaseReference baseReference = (BaseReference)theEObject;
        Object result = caseBaseReference(baseReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.FRAGTYPES:
      {
        Fragtypes fragtypes = (Fragtypes)theEObject;
        Object result = caseFragtypes(fragtypes);
        if (result == null) result = caseExtensionStatement(fragtypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.EXTENSION_DECLARATION:
      {
        ExtensionDeclaration extensionDeclaration = (ExtensionDeclaration)theEObject;
        Object result = caseExtensionDeclaration(extensionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.DEFINITION:
      {
        Definition definition = (Definition)theEObject;
        Object result = caseDefinition(definition);
        if (result == null) result = caseExtensionStatement(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.ARBITRARY:
      {
        Arbitrary arbitrary = (Arbitrary)theEObject;
        Object result = caseArbitrary(arbitrary);
        if (result == null) result = caseCardinality(arbitrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        Object result = caseAnnotation(annotation);
        if (result == null) result = caseExtensionStatement(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.INJECTION:
      {
        Injection injection = (Injection)theEObject;
        Object result = caseInjection(injection);
        if (result == null) result = caseExtensionStatement(injection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.DEFINITION_LIST:
      {
        DefinitionList definitionList = (DefinitionList)theEObject;
        Object result = caseDefinitionList(definitionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.ROLE:
      {
        Role role = (Role)theEObject;
        Object result = caseRole(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.NON_TERMINAL:
      {
        NonTerminal nonTerminal = (NonTerminal)theEObject;
        Object result = caseNonTerminal(nonTerminal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.DEFINITION_CHOICE:
      {
        DefinitionChoice definitionChoice = (DefinitionChoice)theEObject;
        Object result = caseDefinitionChoice(definitionChoice);
        if (result == null) result = caseDefinition(definitionChoice);
        if (result == null) result = caseExtensionStatement(definitionChoice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.CONSTRUCT_REFERENCE:
      {
        ConstructReference constructReference = (ConstructReference)theEObject;
        Object result = caseConstructReference(constructReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.NON_TERMINAL_IDENTIFIER:
      {
        NonTerminalIdentifier nonTerminalIdentifier = (NonTerminalIdentifier)theEObject;
        Object result = caseNonTerminalIdentifier(nonTerminalIdentifier);
        if (result == null) result = caseNonTerminal(nonTerminalIdentifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.GRAMMAR_EXTENSION_UNIT:
      {
        GrammarExtensionUnit grammarExtensionUnit = (GrammarExtensionUnit)theEObject;
        Object result = caseGrammarExtensionUnit(grammarExtensionUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.CONSTRUCT:
      {
        Construct construct = (Construct)theEObject;
        Object result = caseConstruct(construct);
        if (result == null) result = caseConstructReference(construct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.MORE_THAN_ONE:
      {
        MoreThanOne moreThanOne = (MoreThanOne)theEObject;
        Object result = caseMoreThanOne(moreThanOne);
        if (result == null) result = caseCardinality(moreThanOne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.CARDINALITY:
      {
        Cardinality cardinality = (Cardinality)theEObject;
        Object result = caseCardinality(cardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.DEFINITION_CONSTRUCT:
      {
        DefinitionConstruct definitionConstruct = (DefinitionConstruct)theEObject;
        Object result = caseDefinitionConstruct(definitionConstruct);
        if (result == null) result = caseDefinition(definitionConstruct);
        if (result == null) result = caseExtensionStatement(definitionConstruct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.SLOTIFY:
      {
        Slotify slotify = (Slotify)theEObject;
        Object result = caseSlotify(slotify);
        if (result == null) result = caseExtensionStatement(slotify);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.BASE_DECLARATION:
      {
        BaseDeclaration baseDeclaration = (BaseDeclaration)theEObject;
        Object result = caseBaseDeclaration(baseDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.DEFINITION_PART:
      {
        DefinitionPart definitionPart = (DefinitionPart)theEObject;
        Object result = caseDefinitionPart(definitionPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.BASE_LANGUAGE_REFERENCE:
      {
        BaseLanguageReference baseLanguageReference = (BaseLanguageReference)theEObject;
        Object result = caseBaseLanguageReference(baseLanguageReference);
        if (result == null) result = caseBaseReference(baseLanguageReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CmslPackage.ZERO_ONE:
      {
        ZeroOne zeroOne = (ZeroOne)theEObject;
        Object result = caseZeroOne(zeroOne);
        if (result == null) result = caseCardinality(zeroOne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Extension Statement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseExtensionStatement(ExtensionStatement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Grammar Extension</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grammar Extension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseGrammarExtension(GrammarExtension object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Extension Program</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseExtensionProgram(ExtensionProgram object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseReference(Reference object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Upper Level Reference</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Upper Level Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseUpperLevelReference(UpperLevelReference object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Base Reference</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseBaseReference(BaseReference object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fragtypes</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fragtypes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseFragtypes(Fragtypes object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Extension Declaration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseExtensionDeclaration(ExtensionDeclaration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseDefinition(Definition object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Arbitrary</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arbitrary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseArbitrary(Arbitrary object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseAnnotation(Annotation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Injection</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Injection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseInjection(Injection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Definition List</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseDefinitionList(DefinitionList object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseRole(Role object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Non Terminal</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Terminal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseNonTerminal(NonTerminal object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Definition Choice</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Choice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseDefinitionChoice(DefinitionChoice object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Construct Reference</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Construct Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseConstructReference(ConstructReference object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Non Terminal Identifier</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Terminal Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseNonTerminalIdentifier(NonTerminalIdentifier object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Grammar Extension Unit</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grammar Extension Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseGrammarExtensionUnit(GrammarExtensionUnit object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Construct</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Construct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseConstruct(Construct object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>More Than One</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>More Than One</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseMoreThanOne(MoreThanOne object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseCardinality(Cardinality object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Definition Construct</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Construct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseDefinitionConstruct(DefinitionConstruct object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Slotify</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slotify</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseSlotify(Slotify object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Base Declaration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseBaseDeclaration(BaseDeclaration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Definition Part</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseDefinitionPart(DefinitionPart object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Base Language Reference</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Language Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseBaseLanguageReference(BaseLanguageReference object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Zero One</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zero One</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public Object caseZeroOne(ZeroOne object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	public Object defaultCase(EObject object) {
    return null;
  }

} //CmslSwitch
