/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.abstractsyntax.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.reuseware.air.language.abstractsyntax.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage
 * @generated
 */
public class AbstractsyntaxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractsyntaxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsyntaxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AbstractsyntaxPackage.eINSTANCE;
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
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected AbstractsyntaxSwitch<Adapter> modelSwitch =
		new AbstractsyntaxSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractSyntax(AbstractSyntax object) {
				return createAbstractSyntaxAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseASUnit(ASUnit object) {
				return createASUnitAdapter();
			}
			@Override
			public Adapter caseASProgram(ASProgram object) {
				return createASProgramAdapter();
			}
			@Override
			public Adapter caseASStatement(ASStatement object) {
				return createASStatementAdapter();
			}
			@Override
			public Adapter caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			@Override
			public Adapter caseConcreteNodeDefinition(ConcreteNodeDefinition object) {
				return createConcreteNodeDefinitionAdapter();
			}
			@Override
			public Adapter caseInterfaceNodeDefinition(InterfaceNodeDefinition object) {
				return createInterfaceNodeDefinitionAdapter();
			}
			@Override
			public Adapter caseCardinality(Cardinality object) {
				return createCardinalityAdapter();
			}
			@Override
			public Adapter casePLUS(PLUS object) {
				return createPLUSAdapter();
			}
			@Override
			public Adapter caseSTAR(STAR object) {
				return createSTARAdapter();
			}
			@Override
			public Adapter caseQUESTIONMARK(QUESTIONMARK object) {
				return createQUESTIONMARKAdapter();
			}
			@Override
			public Adapter caseNodeFeature(NodeFeature object) {
				return createNodeFeatureAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseContainment(Containment object) {
				return createContainmentAdapter();
			}
			@Override
			public Adapter caseInternalReference(InternalReference object) {
				return createInternalReferenceAdapter();
			}
			@Override
			public Adapter caseExternalReference(ExternalReference object) {
				return createExternalReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.AbstractSyntax
	 * @generated
	 */
	public Adapter createAbstractSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.ASUnit <em>AS Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.ASUnit
	 * @generated
	 */
	public Adapter createASUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.ASProgram <em>AS Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.ASProgram
	 * @generated
	 */
	public Adapter createASProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.ASStatement <em>AS Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.ASStatement
	 * @generated
	 */
	public Adapter createASStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition <em>Concrete Node Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition
	 * @generated
	 */
	public Adapter createConcreteNodeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition <em>Interface Node Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition
	 * @generated
	 */
	public Adapter createInterfaceNodeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.Cardinality
	 * @generated
	 */
	public Adapter createCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.PLUS <em>PLUS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.PLUS
	 * @generated
	 */
	public Adapter createPLUSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.STAR <em>STAR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.STAR
	 * @generated
	 */
	public Adapter createSTARAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.QUESTIONMARK <em>QUESTIONMARK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.QUESTIONMARK
	 * @generated
	 */
	public Adapter createQUESTIONMARKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.NodeFeature <em>Node Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.NodeFeature
	 * @generated
	 */
	public Adapter createNodeFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.Containment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.Containment
	 * @generated
	 */
	public Adapter createContainmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.InternalReference <em>Internal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.InternalReference
	 * @generated
	 */
	public Adapter createInternalReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.reuseware.air.language.abstractsyntax.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.reuseware.air.language.abstractsyntax.ExternalReference
	 * @generated
	 */
	public Adapter createExternalReferenceAdapter() {
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

} //AbstractsyntaxAdapterFactory
