package org.reuseware.air.language.abstractsyntax.resource.as.analysis;

import java.util.Map;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EReference;
import org.reuseware.air.language.abstractsyntax.Attribute;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolveResult;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolver;

public class AttributeTypeReferenceResolver implements IAsReferenceResolver<Attribute,EDataType> {

	public String deResolve(EDataType element, Attribute container, EReference reference) {
		return element.getName();
	}
	public void resolve(String identifier, Attribute container, EReference reference, int position, boolean resolveFuzzy, IAsReferenceResolveResult<EDataType> result) {
		EcoreFactory factory = EcoreFactoryImpl.init();
		EcorePackage ecorePackage = factory.getEcorePackage();
		EDataType dataType = null;
		if(identifier.equals("int")||identifier.equals("EInt")){
			dataType = ecorePackage.getEInt();
		}
		else if(identifier.equals("String")||identifier.equals("string")||identifier.equals("EString")){
			dataType = ecorePackage.getEString();
		}
		else if(identifier.equals("boolean")||identifier.equals("EBoolean")){
			dataType = ecorePackage.getEBoolean();
		}
		else{
			try{
				Object object = ecorePackage.getClass().getMethod("get"+identifier).invoke(ecorePackage);
				if(object instanceof EDataType){
					dataType = (EDataType)object;
				}
			}
			catch(Exception e){
				
				//e.printStackTrace();
			}

		}
		if(dataType!=null){
			result.addMapping(identifier,dataType);
		}
		else{
			result.setErrorMessage(identifier+" is not a valid EDataType.");
		}
	}
	public void setOptions(Map<?, ?> options) {
		// TODO Auto-generated method stub
		
	}
}
