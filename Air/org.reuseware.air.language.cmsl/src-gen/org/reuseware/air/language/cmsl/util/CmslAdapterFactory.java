/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.reuseware.air.language.cmsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.reuseware.air.language.cmsl.CmslPackage
 * @generated
 */
public class CmslAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static CmslPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CmslAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = CmslPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CmslSwitch modelSwitch =
		new CmslSwitch()
    {
      public Object caseExtensionStatement(ExtensionStatement object)
      {
        return createExtensionStatementAdapter();
      }
      public Object caseGrammarExtension(GrammarExtension object)
      {
        return createGrammarExtensionAdapter();
      }
      public Object caseExtensionProgram(ExtensionProgram object)
      {
        return createExtensionProgramAdapter();
      }
      public Object caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      public Object caseUpperLevelReference(UpperLevelReference object)
      {
        return createUpperLevelReferenceAdapter();
      }
      public Object caseBaseReference(BaseReference object)
      {
        return createBaseReferenceAdapter();
      }
      public Object caseFragtypes(Fragtypes object)
      {
        return createFragtypesAdapter();
      }
      public Object caseExtensionDeclaration(ExtensionDeclaration object)
      {
        return createExtensionDeclarationAdapter();
      }
      public Object caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      public Object caseArbitrary(Arbitrary object)
      {
        return createArbitraryAdapter();
      }
      public Object caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      public Object caseInjection(Injection object)
      {
        return createInjectionAdapter();
      }
      public Object caseDefinitionList(DefinitionList object)
      {
        return createDefinitionListAdapter();
      }
      public Object caseRole(Role object)
      {
        return createRoleAdapter();
      }
      public Object caseNonTerminal(NonTerminal object)
      {
        return createNonTerminalAdapter();
      }
      public Object caseDefinitionChoice(DefinitionChoice object)
      {
        return createDefinitionChoiceAdapter();
      }
      public Object caseConstructReference(ConstructReference object)
      {
        return createConstructReferenceAdapter();
      }
      public Object caseNonTerminalIdentifier(NonTerminalIdentifier object)
      {
        return createNonTerminalIdentifierAdapter();
      }
      public Object caseGrammarExtensionUnit(GrammarExtensionUnit object)
      {
        return createGrammarExtensionUnitAdapter();
      }
      public Object caseConstruct(Construct object)
      {
        return createConstructAdapter();
      }
      public Object caseMoreThanOne(MoreThanOne object)
      {
        return createMoreThanOneAdapter();
      }
      public Object caseCardinality(Cardinality object)
      {
        return createCardinalityAdapter();
      }
      public Object caseDefinitionConstruct(DefinitionConstruct object)
      {
        return createDefinitionConstructAdapter();
      }
      public Object caseSlotify(Slotify object)
      {
        return createSlotifyAdapter();
      }
      public Object caseBaseDeclaration(BaseDeclaration object)
      {
        return createBaseDeclarationAdapter();
      }
      public Object caseDefinitionPart(DefinitionPart object)
      {
        return createDefinitionPartAdapter();
      }
      public Object caseBaseLanguageReference(BaseLanguageReference object)
      {
        return createBaseLanguageReferenceAdapter();
      }
      public Object caseZeroOne(ZeroOne object)
      {
        return createZeroOneAdapter();
      }
      public Object defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	public Adapter createAdapter(Notifier target) {
    return (Adapter)modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.ExtensionStatement <em>Extension Statement</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.ExtensionStatement
   * @generated
   */
	public Adapter createExtensionStatementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.GrammarExtension <em>Grammar Extension</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.GrammarExtension
   * @generated
   */
	public Adapter createGrammarExtensionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.ExtensionProgram <em>Extension Program</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.ExtensionProgram
   * @generated
   */
	public Adapter createExtensionProgramAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.Reference
   * @generated
   */
	public Adapter createReferenceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.UpperLevelReference <em>Upper Level Reference</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.UpperLevelReference
   * @generated
   */
	public Adapter createUpperLevelReferenceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.BaseReference <em>Base Reference</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.BaseReference
   * @generated
   */
	public Adapter createBaseReferenceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.Fragtypes <em>Fragtypes</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.Fragtypes
   * @generated
   */
	public Adapter createFragtypesAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.ExtensionDeclaration <em>Extension Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.ExtensionDeclaration
   * @generated
   */
	public Adapter createExtensionDeclarationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.Definition
   * @generated
   */
	public Adapter createDefinitionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.Arbitrary <em>Arbitrary</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.Arbitrary
   * @generated
   */
	public Adapter createArbitraryAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.Annotation
   * @generated
   */
	public Adapter createAnnotationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.Injection <em>Injection</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.Injection
   * @generated
   */
	public Adapter createInjectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.DefinitionList <em>Definition List</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.DefinitionList
   * @generated
   */
	public Adapter createDefinitionListAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.Role
   * @generated
   */
	public Adapter createRoleAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.NonTerminal <em>Non Terminal</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.NonTerminal
   * @generated
   */
	public Adapter createNonTerminalAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.DefinitionChoice <em>Definition Choice</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.DefinitionChoice
   * @generated
   */
	public Adapter createDefinitionChoiceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.ConstructReference <em>Construct Reference</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.ConstructReference
   * @generated
   */
	public Adapter createConstructReferenceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.NonTerminalIdentifier <em>Non Terminal Identifier</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.NonTerminalIdentifier
   * @generated
   */
	public Adapter createNonTerminalIdentifierAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.GrammarExtensionUnit <em>Grammar Extension Unit</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.GrammarExtensionUnit
   * @generated
   */
	public Adapter createGrammarExtensionUnitAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.Construct <em>Construct</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.Construct
   * @generated
   */
	public Adapter createConstructAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.MoreThanOne <em>More Than One</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.MoreThanOne
   * @generated
   */
	public Adapter createMoreThanOneAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.Cardinality
   * @generated
   */
	public Adapter createCardinalityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.DefinitionConstruct <em>Definition Construct</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.DefinitionConstruct
   * @generated
   */
	public Adapter createDefinitionConstructAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.Slotify <em>Slotify</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.Slotify
   * @generated
   */
	public Adapter createSlotifyAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.BaseDeclaration <em>Base Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.BaseDeclaration
   * @generated
   */
	public Adapter createBaseDeclarationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.DefinitionPart <em>Definition Part</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.DefinitionPart
   * @generated
   */
	public Adapter createDefinitionPartAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.BaseLanguageReference <em>Base Language Reference</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.BaseLanguageReference
   * @generated
   */
	public Adapter createBaseLanguageReferenceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.reuseware.air.language.cmsl.ZeroOne <em>Zero One</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.reuseware.air.language.cmsl.ZeroOne
   * @generated
   */
	public Adapter createZeroOneAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //CmslAdapterFactory
