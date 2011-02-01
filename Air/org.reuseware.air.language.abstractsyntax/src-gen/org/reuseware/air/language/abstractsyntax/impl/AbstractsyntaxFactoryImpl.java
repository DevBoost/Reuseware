/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.abstractsyntax.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.reuseware.air.language.abstractsyntax.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractsyntaxFactoryImpl extends EFactoryImpl implements AbstractsyntaxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractsyntaxFactory init() {
		try {
			AbstractsyntaxFactory theAbstractsyntaxFactory = (AbstractsyntaxFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.reuseware.org/air/language/abstractsyntax"); 
			if (theAbstractsyntaxFactory != null) {
				return theAbstractsyntaxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractsyntaxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsyntaxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX: return createAbstractSyntax();
			case AbstractsyntaxPackage.IMPORT: return createImport();
			case AbstractsyntaxPackage.AS_PROGRAM: return createASProgram();
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION: return createConcreteNodeDefinition();
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION: return createInterfaceNodeDefinition();
			case AbstractsyntaxPackage.PLUS: return createPLUS();
			case AbstractsyntaxPackage.STAR: return createSTAR();
			case AbstractsyntaxPackage.QUESTIONMARK: return createQUESTIONMARK();
			case AbstractsyntaxPackage.ATTRIBUTE: return createAttribute();
			case AbstractsyntaxPackage.CONTAINMENT: return createContainment();
			case AbstractsyntaxPackage.INTERNAL_REFERENCE: return createInternalReference();
			case AbstractsyntaxPackage.EXTERNAL_REFERENCE: return createExternalReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSyntax createAbstractSyntax() {
		AbstractSyntaxImpl abstractSyntax = new AbstractSyntaxImpl();
		return abstractSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASProgram createASProgram() {
		ASProgramImpl asProgram = new ASProgramImpl();
		return asProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteNodeDefinition createConcreteNodeDefinition() {
		ConcreteNodeDefinitionImpl concreteNodeDefinition = new ConcreteNodeDefinitionImpl();
		return concreteNodeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceNodeDefinition createInterfaceNodeDefinition() {
		InterfaceNodeDefinitionImpl interfaceNodeDefinition = new InterfaceNodeDefinitionImpl();
		return interfaceNodeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLUS createPLUS() {
		PLUSImpl plus = new PLUSImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STAR createSTAR() {
		STARImpl star = new STARImpl();
		return star;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QUESTIONMARK createQUESTIONMARK() {
		QUESTIONMARKImpl questionmark = new QUESTIONMARKImpl();
		return questionmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Containment createContainment() {
		ContainmentImpl containment = new ContainmentImpl();
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalReference createInternalReference() {
		InternalReferenceImpl internalReference = new InternalReferenceImpl();
		return internalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReference createExternalReference() {
		ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsyntaxPackage getAbstractsyntaxPackage() {
		return (AbstractsyntaxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractsyntaxPackage getPackage() {
		return AbstractsyntaxPackage.eINSTANCE;
	}

} //AbstractsyntaxFactoryImpl
