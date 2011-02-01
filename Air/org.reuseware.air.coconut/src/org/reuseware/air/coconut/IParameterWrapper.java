package org.reuseware.air.coconut;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;


public interface IParameterWrapper {
	

	public List<Object> wrap(ArrayList<ArrayList<EObject>> parameters);  
}
