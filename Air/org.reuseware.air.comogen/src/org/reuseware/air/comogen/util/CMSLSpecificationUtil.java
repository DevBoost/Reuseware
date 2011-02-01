package org.reuseware.air.comogen.util;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.reuseware.air.language.cmsl.Annotation;
import org.reuseware.air.language.cmsl.BaseLanguageReference;
import org.reuseware.air.language.cmsl.BaseReference;
import org.reuseware.air.language.cmsl.Construct;
import org.reuseware.air.language.cmsl.ConstructReference;
import org.reuseware.air.language.cmsl.Definition;
import org.reuseware.air.language.cmsl.DefinitionConstruct;
import org.reuseware.air.language.cmsl.DefinitionList;
import org.reuseware.air.language.cmsl.DefinitionPart;
import org.reuseware.air.language.cmsl.ExtensionStatement;
import org.reuseware.air.language.cmsl.Fragtypes;
import org.reuseware.air.language.cmsl.Injection;
import org.reuseware.air.language.cmsl.NonTerminal;
import org.reuseware.air.language.cmsl.NonTerminalIdentifier;
import org.reuseware.air.language.cmsl.Reference;




public class CMSLSpecificationUtil {

	//private static final String nsURIPrefix = "http://www.reuseware.org/air/language/";
	
	//TODO remove dependencies from these parameters
	//private static final String baseLanguagePrefix = "b_";
	//private static final String reuseLanguagePrefix = "r_"; 

	/**
	 * Returns the specified fragment type names.
	 * 
	 * @param statements
	 * @return
	 */
/**	public static List<String> getComponentModelFragTypes(EList<ExtensionStatement> statements) {

		Fragtypes fragTypesConstruct = getFirstFragtypesConstruct(statements); 
		EList<Object> list = fragTypesConstruct.getFragtype(); 

		List<String> types = new LinkedList<String>(); 

		for (Object obj : list) {
			// in the base language
			if (obj instanceof Reference) {
				Reference ref = (Reference)obj;
				// add the declared fragment 
				types.add(baseLanguagePrefix + getNTName(ref.getBase())); 
			}
			// in the reuse language 
			else if (obj instanceof Construct) {
				Construct construct = (Construct)obj; 
				types.add(reuseLanguagePrefix + getNTName(construct.getName()));  
			}
		}
		return types; 
	}
	**/
	
	/**
	 * Returns the first Fragtypes construct from CMSL statement list. 
	 * 
	 * @param statements - the statement list
	 * @return first FragType statement in list.
	
	private static Fragtypes getFirstFragtypesConstruct(EList<ExtensionStatement> statements) {
		for (Iterator<ExtensionStatement> i = statements.iterator(); i.hasNext(); ) {
			ExtensionStatement statement = (ExtensionStatement)i.next();
			if (statement instanceof Fragtypes) {
				return  (Fragtypes)statement; 
			}
		}
		return null; 
	}
 */
	/**
	 * Constructs the signature lists for a possible set of composers. This is done by mapping annotations
	 * to definitions and the evaluation of the definitions' members. 
	 * 
	 * @param statements
	 * @return
	 */
	public static List<MethodStruct> getComposerSignatures(EList<ExtensionStatement> statements) {
		List<Definition> definitions = new LinkedList<Definition>();
		List<Annotation> annotations = new LinkedList<Annotation>(); 
		Hashtable<String,String> returnTypes = new Hashtable<String,String>(); 
		
		// treat the statements one by one
		for (Iterator<ExtensionStatement> i = statements.iterator(); i.hasNext(); ) {

			ExtensionStatement statement = (ExtensionStatement)i.next();
			if (statement instanceof Definition) {
				definitions.add((Definition)statement); 
			}
			else if (statement instanceof Annotation) {
				annotations.add((Annotation)statement); 
			}
			else if (statement instanceof Injection) {
				Injection injection = (Injection)statement; 

				// save relationship between newly defined construct, and its injection point, 
				// this information is used to derive return type for composer implementations  
				returnTypes.put(getNTName(injection.getSource()), getNTName(injection.getTarget())); 
			}
		}
		
		List<MethodStruct> signatures = new LinkedList<MethodStruct>(); 
		
		for (Annotation annotation : annotations) {
			String annotationName = getNTName(annotation.getTarget());
			// verify that it is the correct annotation 
			if (annotationName != null && annotationName.equals("Composer")) { 
				String annotatedName = getNTName(annotation.getSource());
				if (annotatedName != null) {
					// get the parameter list 
					List<String> parameters = getParameters(annotatedName, definitions); 
				
					// TODO: fix proper return type 
					MethodStruct methodStruct = 
						new MethodStruct(returnTypes.get(annotatedName), cup(annotatedName), parameters);
					methodStruct.setOrigName(annotatedName); 
					signatures.add(methodStruct);
				}
			}
			
		}
		return signatures; 
	}
	
	/**
	 * Constructs the signature for a method corresponding to a composer 
	 * 
	 *  NB: The first item on the signature list is the name of the "method" 
	 *  (actually, the name of the annotation, e.g.. @ReusewairComposer("[constructName]"))   
	 * 
	 * @param constructName 
	 * @param definitions
	 * @return
	 */
	private static List<String> getParameters(String constructName, List<Definition> definitions) {

		List<String> parameters = new LinkedList<String>(); 
				
		for (Definition def : definitions) {

			// the definition must be a construct definition (DefinitionConstruct from cmsl.as)
			if (def instanceof DefinitionConstruct) {

				String nonTermName = getNTName(((DefinitionConstruct)def).getNewConstruct()); 
				// check that we found the right construct 
				if (nonTermName != null && nonTermName.equals(constructName)) {

					// construct the signature 
					DefinitionList defList = ((DefinitionConstruct)def).getDefinition(); 

					@SuppressWarnings("unchecked")
					EList<DefinitionPart> parts = (EList<DefinitionPart>)defList.getRefs(); 
					for (DefinitionPart part : parts) {
						ConstructReference cRef = part.getConstruct();  
						if (cRef instanceof Reference) {

							String name = getNTName((Reference)cRef);
							if (name != null)
								parameters.add(name);  

						} else if (cRef instanceof Construct) {

							String name = getNTName(((Construct)cRef).getName());
							if (name != null)
								parameters.add(name);  
						}
					}
				}
			} else {
				System.err.println("Trying to extract composer parameter list from a DefinitionChoice."); 
			}
		}
		
		return parameters;
	}

	/**
	 * Loads the language model from EPackage registry.
	 * 
	 * @param Namespace URI
	 * @return EPackage containing the requested language model
	 */
	public static EPackage loadLanguageModelFromRegistry(URI nsuri) {
		//TODO simply delegate to loadLanguageModel(nsuri,nsuri)?
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsuri.toString());
		return ePackage;		 
	}
	
	/**
	 * Loads 
	 * 
	 * @param url
	 * @param nsuri
	 * @return
	 */
	public static EPackage loadLanguageModel(URI url, URI nsuri){
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(url,true);
		if(resource==null||resource.getContents().isEmpty())
			return null;
		for(EObject eObject:resource.getContents()){
			if(eObject instanceof EPackage){
				EPackage pck = (EPackage)eObject;
				if(nsuri.toString().equals(pck.getNsURI())){
					return pck;
				}
			}
		}
		return null;		 
	}


	/**
	 * Retrieves the name of a nonterminal 
	 * 
	 * @param nonTerminal
	 * @return
	 */
	public static String getNTName(NonTerminal nonTerminal) {
		
		return ((NonTerminalIdentifier)nonTerminal).getValue(); 
	}
	
	/**
	 * Retrieves the name of a Reference  
	 * 
	 * @param reference
	 * @return
	 */
	private static String getNTName(Reference reference) {
		
		return getNTName(((BaseLanguageReference)reference.getBase()).getBase()); 
		
	}

	/**
	 * Retrieves the name of a BaseReference  
	 * 
	 * @param reference
	 * @return
	 */
	public static String getNTName(BaseReference reference) {
		return getNTName(((BaseLanguageReference)reference).getBase());  
	}

	
	/**
	 * Make sure that the first letter in a string is lower case  
	 * 
	 * @param str
	 * @return
	 */
	private static String cup(String str) {
		return str.substring(0,1).toLowerCase() + str.substring(1); 
	}
}
