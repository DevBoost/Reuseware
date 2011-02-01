/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.abstractsyntax;

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
 * @see org.reuseware.air.language.abstractsyntax.AbstractsyntaxFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractsyntaxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstractsyntax";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.reuseware.org/air/language/abstractsyntax";

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
	AbstractsyntaxPackage eINSTANCE = org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.AbstractSyntaxImpl <em>Abstract Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractSyntaxImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getAbstractSyntax()
	 * @generated
	 */
	int ABSTRACT_SYNTAX = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Nsuri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__NSURI = 1;

	/**
	 * The feature id for the '<em><b>Nsprefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__NSPREFIX = 2;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX__NAME = 4;

	/**
	 * The number of structural features of the '<em>Abstract Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SYNTAX_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.ImportImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__PREFIX = 0;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__EPACKAGE = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.ASUnit <em>AS Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.ASUnit
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getASUnit()
	 * @generated
	 */
	int AS_UNIT = 2;

	/**
	 * The number of structural features of the '<em>AS Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS_UNIT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.ASProgramImpl <em>AS Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.ASProgramImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getASProgram()
	 * @generated
	 */
	int AS_PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS_PROGRAM__STATEMENT = AS_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AS Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS_PROGRAM_FEATURE_COUNT = AS_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.ASStatement <em>AS Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.ASStatement
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getASStatement()
	 * @generated
	 */
	int AS_STATEMENT = 4;

	/**
	 * The number of structural features of the '<em>AS Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AS_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.Definition <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.Definition
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__NAME = AS_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__INTERFACES = AS_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = AS_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.ConcreteNodeDefinitionImpl <em>Concrete Node Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.ConcreteNodeDefinitionImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getConcreteNodeDefinition()
	 * @generated
	 */
	int CONCRETE_NODE_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_NODE_DEFINITION__NAME = DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_NODE_DEFINITION__INTERFACES = DEFINITION__INTERFACES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_NODE_DEFINITION__MEMBERS = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ESuper Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_NODE_DEFINITION__ESUPER_CLASS = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concrete Node Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_NODE_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.InterfaceNodeDefinitionImpl <em>Interface Node Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.InterfaceNodeDefinitionImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getInterfaceNodeDefinition()
	 * @generated
	 */
	int INTERFACE_NODE_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NODE_DEFINITION__NAME = DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NODE_DEFINITION__INTERFACES = DEFINITION__INTERFACES;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NODE_DEFINITION__OPTIONS = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Node Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NODE_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.Cardinality <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.Cardinality
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 8;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.PLUSImpl <em>PLUS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.PLUSImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getPLUS()
	 * @generated
	 */
	int PLUS = 9;

	/**
	 * The number of structural features of the '<em>PLUS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.STARImpl <em>STAR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.STARImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getSTAR()
	 * @generated
	 */
	int STAR = 10;

	/**
	 * The number of structural features of the '<em>STAR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.QUESTIONMARKImpl <em>QUESTIONMARK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.QUESTIONMARKImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getQUESTIONMARK()
	 * @generated
	 */
	int QUESTIONMARK = 11;

	/**
	 * The number of structural features of the '<em>QUESTIONMARK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONMARK_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.NodeFeatureImpl <em>Node Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.NodeFeatureImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getNodeFeature()
	 * @generated
	 */
	int NODE_FEATURE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE__CARDINALITY = 1;

	/**
	 * The number of structural features of the '<em>Node Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.AttributeImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NODE_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CARDINALITY = NODE_FEATURE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = NODE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NODE_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.ContainmentImpl <em>Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.ContainmentImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getContainment()
	 * @generated
	 */
	int CONTAINMENT = 14;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.InternalReferenceImpl <em>Internal Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.InternalReferenceImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getInternalReference()
	 * @generated
	 */
	int INTERNAL_REFERENCE = 15;

	/**
	 * The meta object id for the '{@link org.reuseware.air.language.abstractsyntax.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.air.language.abstractsyntax.impl.ExternalReferenceImpl
	 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__NAME = NODE_FEATURE__NAME;

  /**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__CARDINALITY = NODE_FEATURE__CARDINALITY;

  /**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__TYPE = NODE_FEATURE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_FEATURE_COUNT = NODE_FEATURE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__NAME = NODE_FEATURE__NAME;

  /**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__CARDINALITY = NODE_FEATURE__CARDINALITY;

  /**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__TYPE = NODE_FEATURE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE__OPPOSITE = NODE_FEATURE_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Internal Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REFERENCE_FEATURE_COUNT = NODE_FEATURE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__NAME = NODE_FEATURE__NAME;

  /**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__CARDINALITY = NODE_FEATURE__CARDINALITY;

  /**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__TYPE = NODE_FEATURE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = NODE_FEATURE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax <em>Abstract Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Syntax</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.AbstractSyntax
	 * @generated
	 */
	EClass getAbstractSyntax();

	/**
	 * Returns the meta object for the containment reference '{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.AbstractSyntax#getUnit()
	 * @see #getAbstractSyntax()
	 * @generated
	 */
	EReference getAbstractSyntax_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getNsuri <em>Nsuri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nsuri</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.AbstractSyntax#getNsuri()
	 * @see #getAbstractSyntax()
	 * @generated
	 */
	EAttribute getAbstractSyntax_Nsuri();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getNsprefix <em>Nsprefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nsprefix</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.AbstractSyntax#getNsprefix()
	 * @see #getAbstractSyntax()
	 * @generated
	 */
	EAttribute getAbstractSyntax_Nsprefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.AbstractSyntax#getImport()
	 * @see #getAbstractSyntax()
	 * @generated
	 */
	EReference getAbstractSyntax_Import();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.air.language.abstractsyntax.AbstractSyntax#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.AbstractSyntax#getName()
	 * @see #getAbstractSyntax()
	 * @generated
	 */
	EAttribute getAbstractSyntax_Name();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.air.language.abstractsyntax.Import#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.Import#getPrefix()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Prefix();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.air.language.abstractsyntax.Import#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPackage</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.Import#getEPackage()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_EPackage();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.ASUnit <em>AS Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AS Unit</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.ASUnit
	 * @generated
	 */
	EClass getASUnit();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.ASProgram <em>AS Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AS Program</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.ASProgram
	 * @generated
	 */
	EClass getASProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.air.language.abstractsyntax.ASProgram#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.ASProgram#getStatement()
	 * @see #getASProgram()
	 * @generated
	 */
	EReference getASProgram_Statement();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.ASStatement <em>AS Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AS Statement</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.ASStatement
	 * @generated
	 */
	EClass getASStatement();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.air.language.abstractsyntax.Definition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.Definition#getName()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.air.language.abstractsyntax.Definition#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.Definition#getInterfaces()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Interfaces();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition <em>Concrete Node Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Node Definition</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition
	 * @generated
	 */
	EClass getConcreteNodeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition#getMembers()
	 * @see #getConcreteNodeDefinition()
	 * @generated
	 */
	EReference getConcreteNodeDefinition_Members();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition#getESuperClass <em>ESuper Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ESuper Class</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition#getESuperClass()
	 * @see #getConcreteNodeDefinition()
	 * @generated
	 */
	EReference getConcreteNodeDefinition_ESuperClass();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition <em>Interface Node Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Node Definition</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition
	 * @generated
	 */
	EClass getInterfaceNodeDefinition();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition#getOptions()
	 * @see #getInterfaceNodeDefinition()
	 * @generated
	 */
	EReference getInterfaceNodeDefinition_Options();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.PLUS <em>PLUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PLUS</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.PLUS
	 * @generated
	 */
	EClass getPLUS();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.STAR <em>STAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STAR</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.STAR
	 * @generated
	 */
	EClass getSTAR();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.QUESTIONMARK <em>QUESTIONMARK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QUESTIONMARK</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.QUESTIONMARK
	 * @generated
	 */
	EClass getQUESTIONMARK();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.NodeFeature <em>Node Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Feature</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.NodeFeature
	 * @generated
	 */
	EClass getNodeFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.air.language.abstractsyntax.NodeFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.NodeFeature#getName()
	 * @see #getNodeFeature()
	 * @generated
	 */
	EAttribute getNodeFeature_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.reuseware.air.language.abstractsyntax.NodeFeature#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.NodeFeature#getCardinality()
	 * @see #getNodeFeature()
	 * @generated
	 */
	EReference getNodeFeature_Cardinality();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.air.language.abstractsyntax.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.Containment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.Containment
	 * @generated
	 */
	EClass getContainment();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.air.language.abstractsyntax.Containment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.Containment#getType()
	 * @see #getContainment()
	 * @generated
	 */
	EReference getContainment_Type();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.InternalReference <em>Internal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Reference</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.InternalReference
	 * @generated
	 */
	EClass getInternalReference();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.air.language.abstractsyntax.InternalReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.InternalReference#getType()
	 * @see #getInternalReference()
	 * @generated
	 */
	EReference getInternalReference_Type();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.air.language.abstractsyntax.InternalReference#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.InternalReference#getOpposite()
	 * @see #getInternalReference()
	 * @generated
	 */
	EReference getInternalReference_Opposite();

	/**
	 * Returns the meta object for class '{@link org.reuseware.air.language.abstractsyntax.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.ExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.air.language.abstractsyntax.ExternalReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.reuseware.air.language.abstractsyntax.ExternalReference#getType()
	 * @see #getExternalReference()
	 * @generated
	 */
	EReference getExternalReference_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractsyntaxFactory getAbstractsyntaxFactory();

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
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.AbstractSyntaxImpl <em>Abstract Syntax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractSyntaxImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getAbstractSyntax()
		 * @generated
		 */
		EClass ABSTRACT_SYNTAX = eINSTANCE.getAbstractSyntax();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SYNTAX__UNIT = eINSTANCE.getAbstractSyntax_Unit();

		/**
		 * The meta object literal for the '<em><b>Nsuri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SYNTAX__NSURI = eINSTANCE.getAbstractSyntax_Nsuri();

		/**
		 * The meta object literal for the '<em><b>Nsprefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SYNTAX__NSPREFIX = eINSTANCE.getAbstractSyntax_Nsprefix();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SYNTAX__IMPORT = eINSTANCE.getAbstractSyntax_Import();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SYNTAX__NAME = eINSTANCE.getAbstractSyntax_Name();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.ImportImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__PREFIX = eINSTANCE.getImport_Prefix();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__EPACKAGE = eINSTANCE.getImport_EPackage();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.ASUnit <em>AS Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.ASUnit
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getASUnit()
		 * @generated
		 */
		EClass AS_UNIT = eINSTANCE.getASUnit();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.ASProgramImpl <em>AS Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.ASProgramImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getASProgram()
		 * @generated
		 */
		EClass AS_PROGRAM = eINSTANCE.getASProgram();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AS_PROGRAM__STATEMENT = eINSTANCE.getASProgram_Statement();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.ASStatement <em>AS Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.ASStatement
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getASStatement()
		 * @generated
		 */
		EClass AS_STATEMENT = eINSTANCE.getASStatement();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.Definition <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.Definition
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__NAME = eINSTANCE.getDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__INTERFACES = eINSTANCE.getDefinition_Interfaces();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.ConcreteNodeDefinitionImpl <em>Concrete Node Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.ConcreteNodeDefinitionImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getConcreteNodeDefinition()
		 * @generated
		 */
		EClass CONCRETE_NODE_DEFINITION = eINSTANCE.getConcreteNodeDefinition();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_NODE_DEFINITION__MEMBERS = eINSTANCE.getConcreteNodeDefinition_Members();

		/**
		 * The meta object literal for the '<em><b>ESuper Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_NODE_DEFINITION__ESUPER_CLASS = eINSTANCE.getConcreteNodeDefinition_ESuperClass();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.InterfaceNodeDefinitionImpl <em>Interface Node Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.InterfaceNodeDefinitionImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getInterfaceNodeDefinition()
		 * @generated
		 */
		EClass INTERFACE_NODE_DEFINITION = eINSTANCE.getInterfaceNodeDefinition();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_NODE_DEFINITION__OPTIONS = eINSTANCE.getInterfaceNodeDefinition_Options();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.Cardinality <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.Cardinality
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.PLUSImpl <em>PLUS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.PLUSImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getPLUS()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPLUS();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.STARImpl <em>STAR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.STARImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getSTAR()
		 * @generated
		 */
		EClass STAR = eINSTANCE.getSTAR();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.QUESTIONMARKImpl <em>QUESTIONMARK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.QUESTIONMARKImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getQUESTIONMARK()
		 * @generated
		 */
		EClass QUESTIONMARK = eINSTANCE.getQUESTIONMARK();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.NodeFeatureImpl <em>Node Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.NodeFeatureImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getNodeFeature()
		 * @generated
		 */
		EClass NODE_FEATURE = eINSTANCE.getNodeFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FEATURE__NAME = eINSTANCE.getNodeFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_FEATURE__CARDINALITY = eINSTANCE.getNodeFeature_Cardinality();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.AttributeImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.ContainmentImpl <em>Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.ContainmentImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getContainment()
		 * @generated
		 */
		EClass CONTAINMENT = eINSTANCE.getContainment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT__TYPE = eINSTANCE.getContainment_Type();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.InternalReferenceImpl <em>Internal Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.InternalReferenceImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getInternalReference()
		 * @generated
		 */
		EClass INTERNAL_REFERENCE = eINSTANCE.getInternalReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_REFERENCE__TYPE = eINSTANCE.getInternalReference_Type();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_REFERENCE__OPPOSITE = eINSTANCE.getInternalReference_Opposite();

		/**
		 * The meta object literal for the '{@link org.reuseware.air.language.abstractsyntax.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.air.language.abstractsyntax.impl.ExternalReferenceImpl
		 * @see org.reuseware.air.language.abstractsyntax.impl.AbstractsyntaxPackageImpl#getExternalReference()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_REFERENCE__TYPE = eINSTANCE.getExternalReference_Type();

	}

} //AbstractsyntaxPackage
