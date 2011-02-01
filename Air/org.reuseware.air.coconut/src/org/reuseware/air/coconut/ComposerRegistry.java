package org.reuseware.air.coconut;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

public class ComposerRegistry {
	
	public static final String EP_OPERATORDEFINITION_ID = "org.reuseware.coconut.composer";
	
	private static ComposerRegistry instance;
	
	private Map<EClass, IComplexOperator> complexOperatorImplementations;
	private Map<EClass, IParameterWrapper> operatorParameterWrappers;

	
	private ComposerRegistry() throws CoreException{
		complexOperatorImplementations = new HashMap<EClass, IComplexOperator>();
		operatorParameterWrappers = new HashMap<EClass, IParameterWrapper>();
		loadCompositionOperators();
	}
	
	public static ComposerRegistry getInstance() throws CoreException{
		if(instance==null)
			instance = new ComposerRegistry();
		return instance;
	}
	
	private void loadCompositionOperators() throws CoreException{
		IExtensionPoint interpreterExtensionPoint = Platform.getExtensionRegistry().getExtensionPoint(EP_OPERATORDEFINITION_ID); 
		if (interpreterExtensionPoint != null) {
			IConfigurationElement[] interpreterPoints = interpreterExtensionPoint.getConfigurationElements(); 
			for (int i = 0; i < interpreterPoints.length; i++) {
				String language = interpreterPoints[i].getAttribute("language");
				// composition operator implementation class
				IComplexOperator interpreter = 
					(IComplexOperator) interpreterPoints[i].createExecutableExtension("operators"); 

				// composition operator parameter wrapper implementation class  
				IParameterWrapper wrapper = 
					(IParameterWrapper) interpreterPoints[i].createExecutableExtension("wrapper"); 

				IConfigurationElement[] children = interpreterPoints[i].getChildren("construct"); 
				for (int j = 0; j < children.length; j++) {

					String construct = 	children[j].getAttribute("name"); 

					// store and associate defined operator with language construct  
					addComplexOperator(language, construct, interpreter);

					// store information about wrapper 
					addWrapper(language, construct, wrapper); 
				}
			}
		}

	}
	
	/**
	 * Stores a complex operator definition corresponding to a language construct
	 * 
	 * @param language - the language namespace URI
	 * @param construct - the specific construct
	 * @param operator - the operator implementation
	 */
	private void addComplexOperator(String language, String construct, IComplexOperator operator) {
	    EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(language);
	    EClass eClass = (EClass) ePackage.getEClassifier(construct);
	    addComplexOperator(eClass, operator);  
	}


	private void addComplexOperator(EClass construct, IComplexOperator operator) {
		complexOperatorImplementations.put(construct, operator);
	}


	/**
     * Retrieves a complex operator 
     */
    public IComplexOperator getComplexOperator(EClass construct) {   	
    	if (complexOperatorImplementations.containsKey(construct))
    		return complexOperatorImplementations.get(construct);
    	return null;
    }

    /**
     * Stores information about a composition operator parameter wrapper
     */
    private void addWrapper(String language, String construct, IParameterWrapper wrapper) {
	    EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(language);
	    EClass eClass = (EClass) ePackage.getEClassifier(construct);
	    addWrapper(eClass, wrapper);  
    }
    
    /**
     * Stores information about a composition operator parameter wrapper
     * 
     * @param construct
     * @param wrapper
     */
    private void addWrapper(EClass construct, IParameterWrapper wrapper) {
    	operatorParameterWrappers.put(construct, wrapper);
    }

    
    /**
     * Retrieves a composition operator parameter wrapper 
     * 
     * @param language
     * @return
     */
    public IParameterWrapper getWrapper(EClass construct) {    	
    	return operatorParameterWrappers.get(construct); 
    }
    
    public Map<EClass, IComplexOperator> getComplexOperatorMap() {		
		return complexOperatorImplementations;
	}



}
