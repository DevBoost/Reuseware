package org.reuseware.air.coconut;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.reuseware.air.language.componentmodel.ComponentmodelPackage;

public class InterpreterRegistry {
	
	private static InterpreterRegistry instance = null;
	
	private Map<EClass, IUpperLevelInterpreter> upperLevelInterpreters = null; 
	
	private InterpreterRegistry(){
		upperLevelInterpreters = new HashMap<EClass, IUpperLevelInterpreter>();
		
		putInterpreterModule(ComponentmodelPackage.eINSTANCE.getComposer(), new ComplexComposerInterpreter()); 
	}
	
	public static InterpreterRegistry getInstance(){
		if(instance==null)
			instance = new InterpreterRegistry();
		return instance;
	}
	
	
    private void putInterpreterModule(EClass construct, IUpperLevelInterpreter interpreter) {
        upperLevelInterpreters.put(construct, interpreter);
    }
    
    public IUpperLevelInterpreter getInterpreterModule(EClass construct) {
	    IUpperLevelInterpreter interpreter = null;
	
	    List<EClass> c = new ArrayList<EClass>(1);
	    c.add(construct);
	    interpreter = resolveInterpreter(c);
	
	    return interpreter;
	}


	/**
     * @param language - the language package namespace URI
     * @param construct - the EClass name
     * @param interpreter - the implemented interpreter
     */
    public void putInterpreterModule(String language, String construct, IUpperLevelInterpreter interpreter) {
        EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(language);
        EClass eClass = (EClass) ePackage.getEClassifier(construct);
        
        upperLevelInterpreters.put(eClass, interpreter);
    }
    
    
    /**
     * Recursive function for super-classes.
     */
    private IUpperLevelInterpreter resolveInterpreter(List<EClass> constructs) {
        IUpperLevelInterpreter interpreter = null;
        List<EClass> superConstructs = new ArrayList<EClass>();
        
        for(EClass c : constructs) {
            interpreter = upperLevelInterpreters.get(c);
            if (interpreter != null) {               
                break;
            }
            superConstructs.addAll(c.getESuperTypes());
        }

        if (interpreter == null && !superConstructs.isEmpty()) {
            interpreter = resolveInterpreter(superConstructs);
        }

        return interpreter;
    }

}
