package org.reuseware.air.comogen;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.reuseware.air.comogen.util.MethodStruct;

public interface ICompositionSystemContext {

	
	public String getCompositionSystemProjectBase() ;
	
	public String getFragmentInterfacePackage() ;
	
	public String getFragmentInterfaceImplementationPackage() ;
	
	public String getActivatorPackage();
	
	public String getComposerPackage();
	
	public String getUtilityPackage();

	public String getAlgebraPackage();
	
	/** 
	 * @return the list of base language
	 * fragment-types valid for the composition system.
	 */
	public abstract List<String> getBaseLanguageFragmentTypeNames();
	
	/** 
	 * @return the list of reuse language
	 * fragment-types valid for the composition system.
	 */
	public abstract List<String> getReuseLanguageFragmentTypeNames();
	
	
	/**
	 * @return annotated composer constructs
	 */
	public abstract List<MethodStruct> getComposerSignature();
	
	public String getBaseLanguageName();
	
	public String getReuseLanguageName();
	
	public String getBaseLanguageBasePackageName();
	
	public String getReuseLanguageBasePackageName();
	
	public EPackage getBaseLanguagePackage();
	
	public EPackage getReuseLanguagePackage();
	
}
