package org.reuseware.air.language.abstractsyntax.resource.as.analysis.helper;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.reuseware.air.language.abstractsyntax.AbstractSyntax;
import org.reuseware.air.language.abstractsyntax.Import;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolveResult;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolver;

public class EClassReferenceResolver<ContainerType extends EObject> implements IAsReferenceResolver<ContainerType,EClass>{
		
	

	public String deResolve(EClass element, ContainerType container, EReference reference) {
		EClass eClass = (EClass)element;
		String className = eClass.getName();
		String prefix = null;
		AbstractSyntax as = (AbstractSyntax)container.eContainer();
		for(Import imp:as.getImport()){
			for(EClassifier eClassifier:imp.getEPackage().getEClassifiers()){
				if(eClassifier.equals(eClass)){
					prefix = imp.getPrefix();
				}
			}
			if(prefix!=null)
				break;
		}
		return prefix + "." + className;
	}

	public void resolve(String identifier, ContainerType container, EReference reference, int position, boolean resolveFuzzy, IAsReferenceResolveResult<EClass> result) {
		int lastPoint = identifier.lastIndexOf('.');
		if(lastPoint==-1){
			result.setErrorMessage("Superclasses can only be added from base models.");
			return;
		}
		
		EClass superClass = null;
		String prefix = identifier.substring(0,lastPoint);
		String className = identifier.substring(lastPoint+1);
		AbstractSyntax as = (AbstractSyntax)container.eResource().getContents().get(0);
		for(Import imp:as.getImport()){
			if(imp.getPrefix().equals(prefix)){
				for(EClassifier classifier:imp.getEPackage().getEClassifiers()){
					if((classifier instanceof EClass) && classifier.getName().equals(className)){
						superClass = (EClass)classifier;
						result.addMapping(identifier,superClass);
						return;
					}
				}

			}
									
		}	
		if(superClass==null){
			result.setErrorMessage("There is no class '"+className+"' in package '"+prefix+"'.");
			return;
		}
			
	}

	public void setOptions(Map<?, ?> options) {
		// TODO Auto-generated method stub
		
	}
	

	
}
