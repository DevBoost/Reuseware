package org.reuseware.air.coconut;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.reuseware.air.util.FileProcessingProblem;


public interface IUpperLevelInterpreter {
	
	public void initialize(IFragmentRetriever retriever);
	
	public void interpret(EObject fragment, Map<String, List<EObject>> env, Map<String, EClass> envTypes, List<FileProcessingProblem> problems) throws CoreException;

}
