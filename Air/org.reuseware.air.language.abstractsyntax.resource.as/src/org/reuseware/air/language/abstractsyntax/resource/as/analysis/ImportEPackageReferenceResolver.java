package org.reuseware.air.language.abstractsyntax.resource.as.analysis;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.emf.common.util.URI;
import org.reuseware.air.language.abstractsyntax.Import;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolver;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolveResult;


public class ImportEPackageReferenceResolver implements IAsReferenceResolver<Import,EPackage> {

	public String deResolve(EPackage element, Import container, EReference reference) {
		EPackage pck = (EPackage)element;
		return pck.getNsURI();
	}

	public void resolve(String identifier, Import container, EReference reference, int position, boolean resolveFuzzy, IAsReferenceResolveResult<EPackage> result) {		
		
		Registry registry = EPackage.Registry.INSTANCE;
		//EcorePlugin.getDefaultRegistryImplementation();
		EPackage pck = registry.getEPackage(identifier);
		if(pck!=null){
			result.addMapping(identifier,pck);
		}
		else{
			Resource resource = container.eResource();
			if(resource!=null){
				IPath path = new Path(resource.getURI().toPlatformString(false));
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
				IContainer asContainer = file.getParent();
				EPackageVisitor visitor = new EPackageVisitor(identifier);
				try{
					asContainer.accept(visitor,1,true);					
				}
				catch(CoreException e){ 
					e.printStackTrace();
				}
				if(visitor.getFoundPackage()!=null){
					result.addMapping(identifier,visitor.getFoundPackage());
				}
			}
			else
				result.setErrorMessage("Could not resolve imported packages neither in global registry nor in adjacent file.");
		}
	}
	
	private static class EPackageVisitor implements IResourceVisitor{
		
		private String nsuri;
		private EPackage foundPackage;
		
		public EPackageVisitor(String nsuri){
			this.nsuri = nsuri;
		}
		
		public boolean visit(IResource resource) throws CoreException {
			if(nsuri==null)
				return false;
			else if(resource instanceof IFile){
				IFile file = (IFile)resource;
				
				if("ecore".equals(file.getFileExtension())){
					ResourceSet set = new ResourceSetImpl();
					Resource importedResource = set.getResource(URI.createPlatformResourceURI(file.getFullPath().toString(),true),true);
					for(EObject object:importedResource.getContents()){
						if(object instanceof EPackage){
							EPackage pckToCheck = (EPackage)object;
							if(nsuri.equals(pckToCheck.getNsURI())){
								foundPackage = pckToCheck;
								return true;
							}
						}
					}
				}
			}
			return false;
		}

		public EPackage getFoundPackage() {
			return foundPackage;
		}
		
	}

	public void setOptions(Map<?, ?> options) {}
	
}
