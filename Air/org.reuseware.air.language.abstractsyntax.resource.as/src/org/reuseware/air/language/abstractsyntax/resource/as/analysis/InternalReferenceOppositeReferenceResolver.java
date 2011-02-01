package org.reuseware.air.language.abstractsyntax.resource.as.analysis;

import java.util.Map;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.reuseware.air.language.abstractsyntax.AbstractSyntax;
import org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition;
import org.reuseware.air.language.abstractsyntax.Definition;
import org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition;
import org.reuseware.air.language.abstractsyntax.InternalReference;
import org.reuseware.air.language.abstractsyntax.NodeFeature;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsContextDependentURIFragment;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolveResult;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolver;
import org.reuseware.air.language.abstractsyntax.resource.as.analysis.helper.DefinitionNamespaceResolverBase;

public class InternalReferenceOppositeReferenceResolver extends DefinitionNamespaceResolverBase<InternalReference,InternalReference> implements IAsReferenceResolver<InternalReference,InternalReference> { 


	public void resolve(String identifier, InternalReference container, EReference reference, int position, boolean resolveFuzzy, IAsReferenceResolveResult<InternalReference> result) {
		InternalReference referenceDefinition = (InternalReference)container;
		ConcreteNodeDefinition thisDefinition = (ConcreteNodeDefinition)referenceDefinition.eContainer();
		Definition oppositeDefinition = referenceDefinition.getType();
		ConcreteNodeDefinition targetDefinition = null;
		if(oppositeDefinition instanceof InterfaceNodeDefinition){
			targetDefinition = this.lookupConcreteDefinitions(oppositeDefinition.getName(),((AbstractSyntax)container.eResource().getContents().get(0)));
		}
		else if(oppositeDefinition instanceof ConcreteNodeDefinition){
			targetDefinition = (ConcreteNodeDefinition)oppositeDefinition;
		}
		if(targetDefinition==null){
			result.setErrorMessage("There's no concrete node definition with name '"+oppositeDefinition.getName()+"'.");
			return;
		}
		
		for(NodeFeature feature:targetDefinition.getMembers()){
			if((feature instanceof InternalReference)&&feature.getName().equals(identifier)){
				InternalReference targetReference = (InternalReference)feature;
				if(targetReference.getType().getName().equals(thisDefinition.getName())){
					//1. case: targetReference has no defined opposite -> add mapping and set opposite
					if(targetReference.getOpposite()==null){
						result.addMapping(identifier,targetReference);
						targetReference.setOpposite(referenceDefinition);
						return;
					}
					else{
						InternalEObject ieo = (InternalEObject)targetReference.getOpposite();
						//2. case: targetReference has opposite, but opposite is proxy
						if(ieo.eIsProxy()&&ieo.eProxyURI().fragment().startsWith(IAsContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX)){
							 String proxyName = ieo.eProxyURI().fragment().substring(ieo.eProxyURI().fragment().lastIndexOf('_')+1);
							 if(proxyName.equals(referenceDefinition.getName())){
									result.addMapping(identifier,targetReference);
									return;
							 }
							 
						}
						else if(targetReference.getOpposite().equals(referenceDefinition)){
							result.addMapping(identifier,targetReference);
							return;
						}
					
					}
					
				}
			}
		}
		result.setErrorMessage("Opposite resolving failed. Check if types of references match each other.");
	}


	public void setOptions(Map<?, ?> options) {
		// TODO Auto-generated method stub
		
	}


	public String deResolve(InternalReference element,InternalReference container, EReference reference) {
		
		return null;
	}
}
