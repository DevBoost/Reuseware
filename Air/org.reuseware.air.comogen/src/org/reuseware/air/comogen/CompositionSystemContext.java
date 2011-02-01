package org.reuseware.air.comogen;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.reuseware.air.comogen.util.MethodStruct;
import org.reuseware.air.comogen.util.CMSLSpecificationUtil;
import org.reuseware.air.language.cmsl.Construct;
import org.reuseware.air.language.cmsl.ExtensionStatement;
import org.reuseware.air.language.cmsl.Fragtypes;
import org.reuseware.air.language.cmsl.Reference;
import org.eclipse.jdt.core.IJavaProject;

public class CompositionSystemContext implements ICompositionSystemContext {

	private IExtensionContext extension = null;
	private EPackage baseLanguagePackage = null;
	private EPackage reuseLanguagePackage = null;
	private List<String> baseTypes = new LinkedList<String>(); 
	private List<String> reuseTypes = new LinkedList<String>();
	
	
	public CompositionSystemContext( IExtensionContext extension){
		if(extension==null)
			throw new IllegalArgumentException("Extension must not be null.");
		this.extension = extension;
		baseLanguagePackage = extension.getBaseLanguagePackage();
		reuseLanguagePackage = extension.getExtensionLanguagePackage();
		initialiseComponentModelFragTypes(extension.getExtensionProgram().getStatements());
	}
	
	public String getCompositionSystemProjectBase() {
		return getReuseLanguageBasePackageName() + ".ics";
	}
	
	public String getFragmentInterfacePackage() {
		return getCompositionSystemProjectBase() + ".fragment";
	}
	
	public String getFragmentInterfaceImplementationPackage() {
		return getCompositionSystemProjectBase() + ".fragment.impl";
	}

	public String getActivatorPackage(){
		return getCompositionSystemProjectBase() + ".plugin";
	}
	
	public String getComposerPackage(){
		return getCompositionSystemProjectBase() + ".composers";
	}
	
	public String getUtilityPackage(){
		return getCompositionSystemProjectBase() + ".util";
	}
	
	public String getAlgebraPackage(){
		return getCompositionSystemProjectBase() + ".algebra";
	}
	
	public List<MethodStruct> getComposerSignature() {
		return CMSLSpecificationUtil.getComposerSignatures(extension.getExtensionProgram().getStatements());
	}
	
	public List<String> getBaseLanguageFragmentTypeNames(){
		return baseTypes;
	}
	
	public List<String> getReuseLanguageFragmentTypeNames(){
		return reuseTypes; 
	}

	public String getBaseLanguageBasePackageName() {
		return getReuseLanguagePackage().getNsPrefix()+"."+extension.getBaseLanguageName();
	}

	public String getBaseLanguageName() {
		return baseLanguagePackage.getName();
	}

	public String getReuseLanguageBasePackageName() {
		return getReuseLanguagePackage().getNsPrefix()+"."+getReuseLanguageName();
	}

	public String getReuseLanguageName() {
		return getReuseLanguagePackage().getName();
	}
	
	public EPackage getBaseLanguagePackage() {
		return baseLanguagePackage;
	}

	public EPackage getReuseLanguagePackage() {
		return reuseLanguagePackage;
	}

	
	/**
	 * Returns the specified fragment type names.
	 */
	private void initialiseComponentModelFragTypes(EList<ExtensionStatement> statements) {
		Fragtypes fragTypesConstruct = getFirstFragtypesConstruct(statements); 
		EList<Object> list = fragTypesConstruct.getFragtype(); 

		for (Object obj : list) {
			if (obj instanceof Reference) {
				Reference ref = (Reference)obj;
				String name = CMSLSpecificationUtil.getNTName(ref.getBase());
				baseTypes.add(name); 
			}
			else if (obj instanceof Construct) {
				Construct construct = (Construct)obj; 
				String name = CMSLSpecificationUtil.getNTName(construct.getName());
				reuseTypes.add(name);  
			}
		}
		
	}

	/**
	 * Returns the first Fragtypes construct from CMSL statement list. 
	 * (stupid, there should be only one in the model)
	 * @param statements - the statement list
	 * @return first FragType statement in list.
	 */
	private Fragtypes getFirstFragtypesConstruct(EList<ExtensionStatement> statements) {
		for (Iterator<ExtensionStatement> i = statements.iterator(); i.hasNext(); ) {
			ExtensionStatement statement = (ExtensionStatement)i.next();
			if (statement instanceof Fragtypes) {
				return  (Fragtypes)statement; 
			}
		}
		return null; 
	}

	
}
