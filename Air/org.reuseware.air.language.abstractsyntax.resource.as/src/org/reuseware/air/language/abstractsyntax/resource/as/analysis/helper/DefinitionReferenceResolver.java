package org.reuseware.air.language.abstractsyntax.resource.as.analysis.helper;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.reuseware.air.language.abstractsyntax.AbstractSyntax;
import org.reuseware.air.language.abstractsyntax.Definition;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolveResult;

public abstract class DefinitionReferenceResolver<ContainerType extends EObject> extends DefinitionNamespaceResolverBase<ContainerType,Definition> {
	
	
	public String deResolve(Definition element, ContainerType container, EReference reference) {
		return ((Definition)element).getName();
	}

	public void resolve(String identifier, ContainerType container, EReference reference, int position, boolean resolveFuzzy, IAsReferenceResolveResult<Definition> result) {
		//System.out.println();
		//System.out.println(this); 
		AbstractSyntax as = ((AbstractSyntax)container.eResource().getContents().get(0));
		Definition def = lookup(identifier,as);
		if(def==null){
			result.setErrorMessage("Could not find definition with name '" + identifier + "'.");
		}
		else{
			result.addMapping(identifier,def);
		}			
	}
	
	public void setOptions(Map<?, ?> options) {
		
	}

}
