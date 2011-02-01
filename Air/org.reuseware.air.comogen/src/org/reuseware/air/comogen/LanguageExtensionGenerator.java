package org.reuseware.air.comogen;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.reuseware.air.comogen.util.CMSLSpecificationUtil;

import org.reuseware.air.language.cmsl.Annotation;
import org.reuseware.air.language.cmsl.Arbitrary;
import org.reuseware.air.language.cmsl.BaseLanguageReference;
import org.reuseware.air.language.cmsl.BaseReference;
import org.reuseware.air.language.cmsl.Cardinality;
import org.reuseware.air.language.cmsl.Construct;
import org.reuseware.air.language.cmsl.ConstructReference;
import org.reuseware.air.language.cmsl.DefinitionChoice;
import org.reuseware.air.language.cmsl.DefinitionConstruct;
import org.reuseware.air.language.cmsl.DefinitionPart;
import org.reuseware.air.language.cmsl.ExtensionStatement;
import org.reuseware.air.language.cmsl.Injection;
import org.reuseware.air.language.cmsl.MoreThanOne;
import org.reuseware.air.language.cmsl.NonTerminal;
import org.reuseware.air.language.cmsl.NonTerminalIdentifier;
import org.reuseware.air.language.cmsl.Reference;
import org.reuseware.air.language.cmsl.Slotify;
import org.reuseware.air.language.cmsl.UpperLevelReference;
import org.reuseware.air.language.cmsl.ZeroOne;

/**
 * Action class for performing a language extension as specified in 
 * a CMSL program.
 * 
 * @author b0kaj
 */
public class LanguageExtensionGenerator {


	private EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
	private static final String annotationSourceURI = "http://reuseware.org/annotation/location"; 

	// name conventions
	private String SLOT_SUFFIX = "SLOT"; 
	private String ABSTRACT_SUFFIX = "ABSTRACT";

	// maps: String -> EClassifier in extended language model
	private Hashtable<String,EClassifier> extendedConstructsMap =
		new Hashtable<String,EClassifier>();

	// upper-level component model constructs
	private List<String> upperLevelCompModelTerms = new LinkedList<String>();

	public LanguageExtensionGenerator() {}
	
	/**
	 * Process the file on which the ExtendGrammarAction was fired
	 * @param file
	 */
	public void process(IExtensionContext context) {
		extendedConstructsMap.clear(); 

		// introduce upper-level component model notions
		upperLevelCompModelTerms.add("Composer");
		upperLevelCompModelTerms.add("Location");

		// slot
		upperLevelCompModelTerms.add("Slot");
		extendGrammar(context); 
	}


	/**
	 * Extends a grammar according to CMSL specification
	 * 
	 * @param baseLanguage
	 */
	@SuppressWarnings("unchecked")
	private void extendGrammar(IExtensionContext context) {
		/**
		 * TODO: 
		 * 1) Parse each CMSL statement and extend metamodel accordingly
		 *    (look at GeneratePluginAction.java, and GenerateReuseLanguagePlugin.java,
		 *     and AbstractSyntaxMapping.mapToEcore() ) 
		 */

		EPackage extendedLanguageModelPackage = context.getExtensionLanguagePackage();
		
		// get the extension statements
		EList<ExtensionStatement> statements = 
			(EList<ExtensionStatement>)context.getExtensionProgram().getStatements();

		// create all the needed new classes in the extended language model
		// that is, classes for all the new constructs
		cmslExtensionIntroduceNewConstructs(extendedLanguageModelPackage, statements);

		// treat the extension statements one by one
		for (Iterator i = statements.iterator(); i.hasNext(); ) {

			ExtensionStatement statement = (ExtensionStatement)i.next();

			// DEFINITION CHOICE
			if (statement instanceof DefinitionChoice) {
				
				cmslExtensionConstructChoice(extendedLanguageModelPackage, (DefinitionChoice)statement);  
			}
			// DEFINITION CONSTRUCT
			else if (statement instanceof DefinitionConstruct) {

				cmslExtensionConstructDefine((DefinitionConstruct)statement,context);
			}
			// SLOTIFY
			else if (statement instanceof Slotify) {

				Slotify slotify = (Slotify)statement;

				String constructName = 
					((NonTerminalIdentifier)((BaseLanguageReference)slotify.getConstruct()).getBase()).getValue(); 
				EClass slotConstruct = (EClass)getClass(constructName + SLOT_SUFFIX);

				// annotate with the upper-level Slot construct 
				cmslExtensionAnnotate(slotConstruct, (EClass)getClass("Slot")); 
				// inject 
				cmslExtensionInjection(slotConstruct, (EClass)getClass(slotify.getConstruct(),context),context);

			}
			// INJECTION
			else if (statement instanceof Injection) {

				cmslExtensionInjectionConstruct(extendedLanguageModelPackage, (Injection)statement, context);
			}
			// ANNOTATION
			else if (statement instanceof Annotation) {

				cmslExtensionAnnotationConstruct(extendedLanguageModelPackage, (Annotation)statement);
			}

		}
		
		context.setExtensionDone(true);
	}


	/**
	 * Introduce all new constructs (classes) into the extended language model
	 * 
	 * @param extendedLanguageModelPackage
	 * @param statements
	 */
	private void cmslExtensionIntroduceNewConstructs(
			EPackage extendedLanguageModelPackage,
			EList<ExtensionStatement> statements) {

		// go through all statements in the program
		for (Iterator<ExtensionStatement> iter = statements.iterator(); iter.hasNext(); ) {

			ExtensionStatement statement = (ExtensionStatement)iter.next();

			String constructName = null;

			// DefinitionConstruct:s introduce new constructs
			if (statement instanceof DefinitionConstruct) {

				// name of the new construct
				constructName = 
					((NonTerminalIdentifier) ((DefinitionConstruct)statement).getNewConstruct()).getValue();

			}
			// DefinitionChoice:s can also introduce new constructs
			else if (statement instanceof DefinitionChoice) {

				// name of the new construct
				constructName = 
					((NonTerminalIdentifier) ((DefinitionChoice)statement).getNewConstruct()).getValue();
				
			}
			// but also annotations may introduce new constructs
			else if (statement instanceof Annotation) {

				// name of the new construct
				constructName = 
					((NonTerminalIdentifier) ((Annotation)statement).getSource()).getValue();
			}
			// introduce a new construct for each slotify construct
			else if (statement instanceof Slotify) {

				// name of the new construct
				BaseLanguageReference langRef = (BaseLanguageReference)((Slotify)statement).getConstruct();
				constructName =
					((NonTerminalIdentifier) langRef.getBase()).getValue() + SLOT_SUFFIX;  
			}

			// check that we did not construct it already, and that we found the name
			if ((constructName != null) && !extendedConstructsMap.containsKey(constructName)) {

				// create a model class for the new construct
				EClass eClass = ecoreFactory.createEClass();
				eClass.setName(constructName);
				// add it to the extended language model
				extendedLanguageModelPackage.getEClassifiers().add(eClass);

				// save the map between the construct name and the model element
				extendedConstructsMap.put(constructName, eClass);
			}

		}

	}


	/**
	 * Introduces a new construct, and its definition, in a language model
	 * 
	 * 
	 * @param extendedLanguageModelPackage package for the extended language model
	 * @param definition definition statement 
	 */
	@SuppressWarnings("unchecked")
	private void cmslExtensionConstructDefine(DefinitionConstruct definition, IExtensionContext context) {

		// get new construct being defined
		EClass constructDefined = 
			(EClass)getClass(definition.getNewConstruct());

		if (constructDefined == null) {
			System.err.println("Referred construct does not exist");
			return;
		}

		// make sure the construct has a definition
		if (definition.getDefinition() != null) {

			// iterate over the definition parts
			for (Iterator<DefinitionPart> iter = 
				definition.getDefinition().getRefs().iterator(); iter.hasNext(); ) 
			{
				DefinitionPart part = (DefinitionPart)iter.next();

				// the role name for the referred construct
				String roleId = part.getRolename().getValue();

				// cardinality, default
				int lowerBound = 1; 
				int upperBound = 1;

				// retrieve the cardinality of the referred construct
				Cardinality cardinality = null;
				if (part.getConstruct() instanceof Construct)
					cardinality = ((Construct)part.getConstruct()).getCardinality();
				else if (part.getConstruct() instanceof Reference) 
					cardinality = ((Reference)part.getConstruct()).getCardinality();

				// calculate lower and upper bounds based on specified cardinality
				if (cardinality instanceof MoreThanOne) {
					lowerBound = 1;
					upperBound = -1;
				}
				else if (cardinality instanceof Arbitrary) {
					lowerBound = 0;
					upperBound = -1;
				}
				else if (cardinality instanceof ZeroOne) {
					lowerBound = 0;
					upperBound = 1;
				}

				// populate defined model class
				if (constructDefined.getEStructuralFeature(roleId) == null) {
					// retrieve model element for referred part

					EClassifier refClass = null;

					EAnnotation annotation = null;
					// check if the construct is annotated 
					if (part.getAnnotation() != null) {

						// in that case, use the annotation as 
						// the construct (most likely Location)
						refClass = getClass(part.getAnnotation(),context); 

						// annotate construct 
						annotation =  ecoreFactory.createEAnnotation();

						//ecoreFactory.create
						// meta information
						annotation.setSource(annotationSourceURI); 
						//annotation.getReferences().add(getClass(part.getConstruct())); 
						// annotation contents
						EMap<String,String> map = annotation.getDetails();
						if (map != null) {
							EClass cls = (EClass)getClass(part.getConstruct(),context);
							map.put("language", cls.getEPackage().getNsURI());
							map.put("construct", cls.getName());
						}

					} else {

						// if there is no annotation, use the specified 
						// construct instead
						refClass = getClass(part.getConstruct(),context);
					}
					EStructuralFeature structFeature = null;

					// differentiate between Classes and DataTypes 
					if (refClass instanceof EClass) {
						EReference ref = ecoreFactory.createEReference();
						ref.setContainment(true);
						structFeature = ref;
					}
					else if (refClass instanceof EDataType) {
						structFeature = ecoreFactory.createEAttribute();
					}

					// populate and set the feature information
					if (structFeature != null) {           
						structFeature.setEType(refClass);
						structFeature.setName(roleId);
						structFeature.setLowerBound(lowerBound);
						structFeature.setUpperBound(upperBound); 

						// check if we should create the annotation, if so, add it
						if (annotation != null) {
							structFeature.getEAnnotations().add(annotation);
						}

						constructDefined.getEStructuralFeatures().add(structFeature);
					}

				} else {

					System.err.println("Role reference already exists.");
				}

			}

		}
	}


	/**
	 * 
	 * 
	 * @param extendedLanguageModelPackage
	 * @param statement
	 */
	@SuppressWarnings("unchecked")
	private void cmslExtensionConstructChoice(
			EPackage extendedLanguageModelPackage, DefinitionChoice statement) {
		
		// super class
		EClassifier superClass = getClass(statement.getNewConstruct());
		
		// get all the choices
		EList<NonTerminal> choices = (EList<NonTerminal>)statement.getChoice();

		// make each choice a subclass of the superclass
		for (NonTerminal choice : choices) {
			
			EClassifier choiceClass = getClass(choice);
			((EClass)choiceClass).getESuperTypes().add((EClass)superClass);
		}

		return;
	}

	/**
	 * Handle a INJECT construct from CMSL 
	 * 
	 * @param extendedLanguageModelPackage
	 * @param statement
	 */
	private void cmslExtensionInjectionConstruct(
			EPackage extendedLanguageModelPackage, Injection statement, IExtensionContext context) {

		// get construct being injected
		EClass constructInjected = (EClass)getClass(statement.getSource());

		// get construct for injection point
		EClass injectionPoint = (EClass)getClass(statement.getTarget(),context);

		// inject the construct 
		cmslExtensionInjection(constructInjected, injectionPoint,context);
	}

	/**
	 * Injects a newly introduced construct into the base language
	 * 
	 * @param extendedLanguageModelPackage
	 * @param statement
	 */
	private void cmslExtensionInjection(
			EClass constructInjected, EClass injectionPoint, IExtensionContext context) {


		// checks if a "complex" injection is required
		// a complex injection is required if the injection point class is not
		// an abstract, feature-less, class
		EList<EStructuralFeature> features = injectionPoint.getEStructuralFeatures();
		// make sure that the base language model package is accessible 
		if (!features.isEmpty() && (context.getBaseLanguagePackage() != null)) {

			System.out.println("Complex injection probably needed.");

			// check if the construct already has been injected, in which case
			// we can do a simple injection, not a complex one
			if (context.getBaseLanguagePackage().getEClassifier(injectionPoint.getName() + ABSTRACT_SUFFIX) != null) {

				if (constructInjected != null && injectionPoint != null) {

					System.out.println("However, the construct already injected, doing simple injection.");

					// make the injected construct a sub-class of the already created 
					// abstract injection point construct
					EClass newInjectionPoint = 
						(EClass)context.getBaseLanguagePackage().getEClassifier(injectionPoint.getName() + ABSTRACT_SUFFIX);
					((EClass)constructInjected).getESuperTypes().add(newInjectionPoint);

				}
			} 
			// actually do the complex injection
			else {

				// STEP 1: 	re-wire the base language model such that it is possible 
				//			to inject the construct

				// the injection point index in the classifiers list
				int index = 
					context.getBaseLanguagePackage().getEClassifiers().indexOf(injectionPoint);

				// create an abstract class
				EClass abstractClass = EcoreFactory.eINSTANCE.createEClass();
				abstractClass.setName(injectionPoint.getName() + ABSTRACT_SUFFIX);
				context.getBaseLanguagePackage().getEClassifiers().add(index, abstractClass);

				// move all super types from the original class to the abstract class
				abstractClass.getESuperTypes().addAll(injectionPoint.getESuperTypes());

				// let the original class derive from the abstract class
				injectionPoint.getESuperTypes().clear();
				injectionPoint.getESuperTypes().add(abstractClass);

				// replace the references to the original with references to the
				// abstract class
				Iterator<EClassifier> iterAllClasses = 
					context.getBaseLanguagePackage().getEClassifiers().iterator();

				while (iterAllClasses.hasNext()) {
					EClass c = (EClass) iterAllClasses.next();
					Iterator<EReference> iterAllRefs = c.getEReferences().iterator();

					while (iterAllRefs.hasNext()) {
						EReference ref = (EReference) iterAllRefs.next();

						if (ref.getEType().equals(injectionPoint)) {
							ref.setEType(abstractClass);
						}
					}
				}

				// finally, make the injected construct a sub-class of the already created 
				// abstract injection point construct
				((EClass)constructInjected).getESuperTypes().add(abstractClass);

			}


			System.out.println("Modification done.");


		} 
		// just sub-class the injection point construct with the injected construct
		else {

			System.out.println("Going ahead with simple injection.");

			if (constructInjected != null && injectionPoint != null) {

				// make the injected construct a sub-class of the construct where the injection is made
				((EClass)constructInjected).getESuperTypes().add(injectionPoint);

			} else {

				System.err.println("Class not found in referenced language, or construct not found");
			}
		}

		return;
	}

	/**
	 * Annotates a newly introduced construct by referring to the 
	 * upper-level component model
	 * 
	 * @param extendedLanguageModelPackage package representing the extended language model
	 * @param statement annotation statement representing information for performing the annotation
	 */
	private void cmslExtensionAnnotationConstruct(
			EPackage extendedLanguageModelPackage, Annotation statement) {

		// get construct being annotated
		EClass constructAnnotated = (EClass)getClass(statement.getSource());

		// get annotation construct
		EClass annotation = (EClass)getClass(statement.getTarget());

		// do the annotation 
		cmslExtensionAnnotate(constructAnnotated, annotation);

		return;
	}

	/**
	 * Annotate a construct
	 * 
	 * @param constructAnnotated
	 * @param annotation
	 */
	private void cmslExtensionAnnotate(EClass constructAnnotated, EClass annotation) {

		if (constructAnnotated != null && annotation != null) {

			// make the annotation a super-class of the annotated construct
			((EClass)constructAnnotated).getESuperTypes().add(annotation);

		} else {

			System.err.println("Class not found in upper-level component model, or construct not found");
		}

		return; 
	}


	/**
	 * Return class from language extension
	 * 
	 * @param classID
	 * @return
	 */
	private EClassifier getClass(ConstructReference classID, IExtensionContext context) {

		// it is a construct (from CMSL language specification)
		if (classID instanceof Construct) {

			Construct construct = (Construct)classID;

			// get the model class for the non-terminal
			return getClass(construct.getName());

		}
		// it is a reference (from CMSL language specification)
		else if (classID instanceof Reference) {

			Reference reference = (Reference)classID;

			// get the model class for the reference (BaseReference)
			return getClass(reference.getBase(), context);
		}
		// it is an upper-level reference
		else if (classID instanceof UpperLevelReference) {

			UpperLevelReference upper = (UpperLevelReference)classID;

			// get the model class for the upper-level construct
			return getClass(upper.getUpper());
		}

		System.err.println("Should be unreachable code!");
		// default (should never happen)
		return null;
	}


	/**
	 * Return class from language extension
	 * 
	 * @param classID
	 * @return
	 */
	private EClassifier getClass(NonTerminal classID) {

		// name of the construct
		String constructName = 
			((NonTerminalIdentifier) classID).getValue();

		return getClass(constructName);
	}


	/**
	 * Return class from language extension
	 * 
	 * @param constructName The name of the construct
	 * @return
	 */
	private EClassifier getClass(String constructName) {


		// get the name from the saved map between construct 
		// names and model elements, that it, if it exists
		EClassifier classifier = extendedConstructsMap.get(constructName);

		// return if found
		if (classifier != null)
			return classifier;

		// otherwise, check if it refers to the UPPER-LEVEL COMPONENT MODEL
		if (upperLevelCompModelTerms.contains(constructName)) {

			// try the upper-level component model

			// load the referenced language model
			EPackage componentModelPackage = 
				CMSLSpecificationUtil.loadLanguageModelFromRegistry(URI.createURI("http://www.reuseware.org/air/language/componentmodel")); 

			// return upper-level annotation construct, if it exists
			EClassifier componentModelConstruct = 
				componentModelPackage.getEClassifier(constructName);
			if (componentModelConstruct != null)
				return componentModelConstruct;

			// try the minimal composition language

			// load the referenced language model
			//			EPackage minimalCompositionLangugePackage = 
			//				loadLanguageModel("minimalcl");

			// return minimal composition language construct, if it exists
			//			EClassifier minimalCompositionLanguageConstruct = 
			//				minimalCompositionLangugePackage.getEClassifier(constructName);
			//			if (minimalCompositionLanguageConstruct != null)
			//				return minimalCompositionLanguageConstruct;
		}

		// default
		return null;

	}

	/**
	 * Return class from extended language
	 * 
	 * @param classID
	 * @return
	 */
	private EClassifier getClass(BaseReference classID, IExtensionContext context) {

		BaseLanguageReference baseRef = (BaseLanguageReference)classID;
		if (context.getBaseLanguagePackage() != null) {

			String languagePrefix = baseRef.getLanguage();
			EPackage basePackage = context.getPackageForLanguagePrefix(languagePrefix);
				
			if (basePackage != null) {
				String constructName = 
					((NonTerminalIdentifier) baseRef.getBase()).getValue();
				EClassifier classifier = basePackage.getEClassifier(constructName);
				return classifier;

			} else {
				System.err.println("Invalid prefix used, lanugage not defined");
			}
		}

		return null;
	}




}
