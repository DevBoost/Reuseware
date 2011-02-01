package org.reuseware.air.language.abstractsyntax.resource.as.analysis.helper;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.reuseware.air.language.abstractsyntax.ASProgram;
import org.reuseware.air.language.abstractsyntax.ASStatement;
import org.reuseware.air.language.abstractsyntax.AbstractSyntax;
import org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition;
import org.reuseware.air.language.abstractsyntax.Definition;
import org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolver;

public abstract class DefinitionNamespaceResolverBase<ContainerType extends EObject,ReferenceType extends EObject> implements IAsReferenceResolver<ContainerType,ReferenceType>{  
	
	private Map<String,ConcreteNodeDefinition> concreteDefinitions;
	private Map<String,InterfaceNodeDefinition> interfaceDefinitions;
	private boolean initialized = false;
	
	protected void init(AbstractSyntax as){
		concreteDefinitions = new HashMap<String,ConcreteNodeDefinition>();
		interfaceDefinitions = new HashMap<String,InterfaceNodeDefinition>();
		for(ASStatement stmt:((ASProgram)as.getUnit()).getStatement()){
			Definition def = (Definition)stmt;
			if(stmt instanceof ConcreteNodeDefinition && !concreteDefinitions.containsKey(def.getName())){
				concreteDefinitions.put(def.getName(),(ConcreteNodeDefinition)def);
			}
			else if(stmt instanceof InterfaceNodeDefinition && !interfaceDefinitions.containsKey(def.getName())){
				interfaceDefinitions.put(def.getName(),(InterfaceNodeDefinition)def);
			}	
		}
		initialized = true;
	}
	
	protected ConcreteNodeDefinition lookupConcreteDefinitions(String identifier, AbstractSyntax as){
		if(!initialized)
			init(as);
		return concreteDefinitions.get(identifier);
	}
	
	protected InterfaceNodeDefinition lookupInterfaceDefinitions(String identifier, AbstractSyntax as){
		if(!initialized)
			init(as);
		return interfaceDefinitions.get(identifier);
	}

	
	protected Definition lookup(String identifier,AbstractSyntax as){
		if(lookupInterfaceDefinitions(identifier,as)!=null)
			return lookupInterfaceDefinitions(identifier,as);
		return lookupConcreteDefinitions(identifier,as);
	}
	
	
}
