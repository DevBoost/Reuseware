package org.reuseware.air.coconut;


import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.reuseware.air.util.FileProcessingProblem;


/**
 * The singleton composition language interpreter system
 * 
 * @author Jendrik Johannes
 */
public class InterpreterSystem {
    
   private InterpreterSystem() { }

   private static class SingletonHolder { 
	   private final static InterpreterSystem instance = new InterpreterSystem();
   }

   public static InterpreterSystem getInstance() {
    	return SingletonHolder.instance;
   }

 
    
    /**
     * Starts the interpretation process of a fragment AST.
     * 
     * @param fragment AST root
     * @param env 
     * @param envTypes
     * @param problems
     * @throws CoreException 
     */
    public void interpret(EObject startingNode, Map<String, List<EObject>> env,
            Map<String, EClass> envTypes, List<FileProcessingProblem> problems) throws CoreException {
        
        if (startingNode == null) 
        	throw new IllegalArgumentException();
        	
        // get interpreter module for root type 
        IUpperLevelInterpreter interpreter = InterpreterRegistry.getInstance().getInterpreterModule(startingNode.eClass());
        
        initialiseComposers();
        
        // traverse fragment AST
        traverseChildren(startingNode, env, envTypes, problems);
                  
        if (interpreter != null) {
            interpreter.interpret(startingNode, env, envTypes, problems);
        }
    }
    
    private void initialiseComposers() throws CoreException{
        Map<EClass, IComplexOperator> operators = ComposerRegistry.getInstance().getComplexOperatorMap();
        Set<IComplexOperator> initialised = new HashSet<IComplexOperator>();      
        for (Iterator<IComplexOperator> i = operators.values().iterator(); i.hasNext(); ) {       	
        	IComplexOperator operator = i.next(); 
         	if(!initialised.contains(operator)){
               	operator.initialize(); 
                initialised.add(operator);        		
         	}
        }
    }
    
    /**
     * 
     * 
     * @param fragment
     * @param env
     * @param envTypes
     * @param problems
     * @throws CoreException 
     */
    private void traverseChildren(EObject fragment, Map<String, List<EObject>> env,
            Map<String, EClass> envTypes, List<FileProcessingProblem> problems) throws CoreException {
        
        //collection of fragments already interpreted
        Set<EObject> interpretedFragments = new HashSet<EObject>();
        
        // rerun after interpretation (AST might have changed)
        boolean rerun = true;
        
        while (rerun) {
            rerun = false;
            for (Iterator<EObject> i = fragment.eContents().iterator(); i.hasNext(); ) {
                EObject f = (EObject) i.next();
                
                if (interpretedFragments.contains(f)) {
                	rerun = false;
                    break;
                }
                
                // get interpreter 
                IUpperLevelInterpreter interpreter = InterpreterRegistry.getInstance().getInterpreterModule(f.eClass());
                traverseChildren(f, env, envTypes, problems);
                
                if (interpreter != null) {
                    interpreter.interpret(f, env, envTypes, problems);
                    interpretedFragments.add(f);
                    rerun = true;
                    break;
                }
            }
        }
    }

    
}
