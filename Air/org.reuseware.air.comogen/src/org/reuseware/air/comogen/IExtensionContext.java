package org.reuseware.air.comogen;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.air.language.cmsl.ExtensionProgram;

public interface IExtensionContext {

	public abstract EPackage getPackageForLanguagePrefix(String languagePrefix);

	/**
	 * @return base language name
	 */
	public abstract String getBaseLanguageName();

	/**
	 * @return extended language name
	 */
	public abstract String getReuseLanguageName();

	/**
	 * Returns base language package
	 */
	public abstract EPackage getBaseLanguagePackage();

	/**
	 * @return extension language package, initially empty
	 */
	public abstract EPackage getExtensionLanguagePackage();

	/**
	 * Returns the CMSL specification program 
	 */
	public abstract ExtensionProgram getExtensionProgram();

	public abstract URI getExtensionTargetURL();
	
	public abstract URI getExtensionGenModelTargetURL();

	public abstract ResourceSet getResourceSet();

	public abstract void setExtensionDone(boolean extensionDone);

	public abstract boolean isExtensionDone();

}