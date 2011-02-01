package org.reuseware.air.comogen;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.common.util.URI;
import org.reuseware.air.comogen.util.CMSLSpecificationUtil;
import org.reuseware.air.language.cmsl.BaseDeclaration;
import org.reuseware.air.language.cmsl.ExtensionDeclaration;
import org.reuseware.air.language.cmsl.ExtensionProgram;

public class ExtensionContext implements IExtensionContext {
	
	private EPackage baseLanguagePackage = null;
	private EPackage extensionLanguagePackage = null;
	private ExtensionProgram extensionProgram = null; 
	private ResourceSet resourceSet = null;
	private URI extensionTargetURL = null;
	private URI extensionGenModelTargetURL = null;
	private boolean extensionDone = false;
	
	public ExtensionContext(ExtensionProgram csmlExtension){
		if(csmlExtension==null)
			throw new IllegalArgumentException("Extension program must not be null.");
		extensionProgram = csmlExtension;
		BaseDeclaration baseDeclaration = extensionProgram.getBase();
		ExtensionDeclaration extensionDeclaration = extensionProgram.getExtension();
		
		URI specURL = csmlExtension.eResource().getURI();
		resourceSet = new ResourceSetImpl();
		
		initialiseBase(baseDeclaration, specURL);
		initialiseExtension(extensionDeclaration, specURL);
	}
	
	private void initialiseBase(BaseDeclaration baseDeclaration, URI specURL){
		URI baseNs = URI.createURI(baseDeclaration.getNsuri());
		URI baseURL = null;
		if(baseDeclaration.getSourceurl()!=null){
			baseURL = URI.createURI(baseDeclaration.getSourceurl());
			if(baseURL.isRelative()){
				baseURL = baseURL.resolve(specURL);
			}
		}
			
		if(baseURL!=null)
			baseLanguagePackage = CMSLSpecificationUtil.loadLanguageModel(baseURL,baseNs);
		else
			baseLanguagePackage = CMSLSpecificationUtil.loadLanguageModelFromRegistry(baseNs);
			
	}
	
	private void initialiseExtension(ExtensionDeclaration extensionDeclaration, URI specURL){
		String extensionNSURI = null;
		if(extensionDeclaration.getNsuri()==null){
			String baseURI = baseLanguagePackage.getNsURI(); 
			int index = baseURI.lastIndexOf('/');
			String commonPrefix = null;
			if(index==-1){
				commonPrefix = "";
			}
			else{
				commonPrefix = baseURI.substring(0,index+1);
			}
				
			extensionNSURI = URI.createURI(commonPrefix+extensionDeclaration.getName()).toString();
		}
		else{
			extensionNSURI = extensionDeclaration.getNsuri();
		}
		
		String extensionNSPrefix = null;
		if(extensionDeclaration.getNsprefix()==null){
			extensionNSPrefix = baseLanguagePackage.getNsPrefix();
		}
		else{
			extensionNSPrefix = extensionDeclaration.getNsprefix();
		}
		
		extensionTargetURL = null;
		if(extensionDeclaration.getTargeturl()==null){
			String fileExtension = "ecore";
			String fileName = extensionDeclaration.getName() + "." + fileExtension;
			extensionTargetURL = URI.createURI(fileName);
		}
		else{
			extensionTargetURL = URI.createURI(extensionDeclaration.getTargeturl());
		}
		
		if(extensionTargetURL.isRelative())
			extensionTargetURL = extensionTargetURL.resolve(specURL);
		
		String genFileExtension = "genmodel";
		String genFileName = extensionDeclaration.getName() + "." +genFileExtension;
		extensionGenModelTargetURL = URI.createURI(genFileName);
		extensionGenModelTargetURL = extensionGenModelTargetURL.resolve(extensionTargetURL);
		
		extensionLanguagePackage = EcoreFactory.eINSTANCE.createEPackage();
		extensionLanguagePackage.setName(extensionDeclaration.getName());
		extensionLanguagePackage.setNsPrefix(extensionNSPrefix);
		extensionLanguagePackage.setNsURI(extensionNSURI);
	}
	
	/* (non-Javadoc)
	 * @see org.reuseware.air.comogen.cmsl.IExtensionContext#getPackageForLanguagePrefix(java.lang.String)
	 */
	public EPackage getPackageForLanguagePrefix(String languagePrefix) {
		if(languagePrefix.equals(extensionProgram.getBase().getName()))
			return baseLanguagePackage;
		return null; 
	}

	/* (non-Javadoc)
	 * @see org.reuseware.air.comogen.cmsl.IExtensionContext#getBaseLanguageName()
	 */
	public String getBaseLanguageName() {
		return baseLanguagePackage.getName(); 
	}
	
	/* (non-Javadoc)
	 * @see org.reuseware.air.comogen.cmsl.IExtensionContext#getReuseLanguageName()
	 */
	public String getReuseLanguageName() {
		return extensionProgram.getExtension().getName(); 
	}

	/* (non-Javadoc)
	 * @see org.reuseware.air.comogen.cmsl.IExtensionContext#getBaseLanguagePackage()
	 */
	public EPackage getBaseLanguagePackage() {
		return baseLanguagePackage; 
	}
	
	/* (non-Javadoc)
	 * @see org.reuseware.air.comogen.cmsl.IExtensionContext#getExtensionLanguagePackage()
	 */
	public EPackage getExtensionLanguagePackage(){
		return extensionLanguagePackage;
	}
	
	/* (non-Javadoc)
	 * @see org.reuseware.air.comogen.cmsl.IExtensionContext#getExtensionProgram()
	 */
	public ExtensionProgram getExtensionProgram() {
		return extensionProgram; 
	}
	
	/* (non-Javadoc)
	 * @see org.reuseware.air.comogen.cmsl.IExtensionContext#getExtensionTargetURL()
	 */
	public URI getExtensionTargetURL() {
		return extensionTargetURL;
	}
	
	/* (non-Javadoc)
	 * @see org.reuseware.air.comogen.cmsl.IExtensionContext#getResourceSet()
	 */
	public ResourceSet getResourceSet(){
		return resourceSet;
	}

	/* (non-Javadoc)
	 * @see org.reuseware.air.comogen.cmsl.IExtensionContext#setExtensionDone(boolean)
	 */
	public void setExtensionDone(boolean extensionDone) {
		this.extensionDone = extensionDone;
	}

	/* (non-Javadoc)
	 * @see org.reuseware.air.comogen.cmsl.IExtensionContext#isExtensionDone()
	 */
	public boolean isExtensionDone() {
		return extensionDone;
	}

	public URI getExtensionGenModelTargetURL() {
		return extensionGenModelTargetURL;
	}
	
	
}
