package org.reuseware.air.comogen.util;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.reuseware.air.util.FileProcessingException;

import org.reuseware.air.comogen.ExtensionContext;
import org.reuseware.air.comogen.IExtensionContext;
import org.reuseware.air.language.cmsl.ExtensionProgram;
import org.reuseware.air.language.cmsl.GrammarExtension;
import org.reuseware.air.language.cmsl.resource.cmsl.CmslResource;

public class CMSLSpecificationLoader {

	private CMSLSpecificationLoader() {}

	/**
	public void cmslLoadSpecification(IFile file) throws FileProcessingException {
		initialize(); 
		grammarExtension = parseCMSLSpecification(file); 
		if (grammarExtension != null) {
			extensionProgram = (ExtensionProgram)grammarExtension.getUnit();
			BaseDeclaration baseDeclaration = extensionProgram.getBase();
			ExtensionDeclaration extensionDeclaration = extensionProgram.getExtension();
			
			URI baseNs = URI.createURI(baseDeclaration.getNsuri());
			URI baseURL = null;
			if(baseDeclaration.getSourceurl()!=null){
				baseURL = URI.createURI(baseDeclaration.getSourceurl());
				if(baseURL.isRelative()){
					URI specURL = URI.createPlatformResourceURI(file.getFullPath().removeLastSegments(1).toString()+"/");
					baseURL = baseURL.resolve(specURL);
				}
			}
			
			if(baseURL!=null)
				baseLanguagePackage = CMSLSpecificationUtil.loadLanguageModel(baseURL,baseNs);
			else
				baseLanguagePackage = CMSLSpecificationUtil.loadLanguageModelFromRegistry(baseNs);
			
			baseLanguagePrefixes.put(baseDeclaration.getName(),baseLanguagePackage);
			reuseLanguageName = extensionDeclaration.getName();
		}

		return;
	}
	**/
	
	public static IExtensionContext initialiseExtensionContext(IFile source) throws FileProcessingException{
		GrammarExtension grammarExtension = parseCMSLSpecification(source);
		//TODO check for other options
		URI specURL = URI.createPlatformResourceURI(source.getFullPath().removeLastSegments(1).toString()+"/");
		IExtensionContext context = new ExtensionContext((ExtensionProgram)grammarExtension.getUnit());
		return context;
	}
	
	public static Resource storeExtendedModel(EPackage extensionPackage, URI targetURL) throws IOException{
		Resource.Factory resFactory = 
			Resource.Factory.Registry.INSTANCE.getFactory(targetURL);
		Resource xmiRes = resFactory.createResource(targetURL);
		xmiRes.getContents().add(extensionPackage);
		xmiRes.save(null);
		return xmiRes;
	}
	
	public static Resource storeExtendedModel(IExtensionContext context) throws IOException{
		return storeExtendedModel(context.getExtensionLanguagePackage(),context.getExtensionTargetURL());
	}
	
	/**
	 * Parse a CMSL program
	 * 
	 * @param file containing CMSL specification
	 * @return GrammarExtension object representing the CMSL specification
	 * @throws FileProcessinException
	 */
	public static GrammarExtension parseCMSLSpecification(IFile file) throws FileProcessingException {
		String path = file.getFullPath().toString();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource cmslResource =  resourceSet.getResource(URI.createPlatformResourceURI(path,true),true);
		try {
			if(!(cmslResource instanceof CmslResource))
				throw new IOException("");
			cmslResource.load(Collections.emptyMap());
			return (GrammarExtension)cmslResource.getContents().get(0);
		} 
		catch (IOException e) {
			System.err.println("Could not parse file: " + file + ". CoreException.");
		} 

		return null;
	}
	
}
