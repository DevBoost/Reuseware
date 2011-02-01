package org.reuseware.air.core.cm;

import org.eclipse.emf.ecore.EClass;

public interface IFragment {

	void bind(IFragment value);
	void bind(String slotName, IFragment value);
	
	void extend(IFragment value);
	void prepend(IFragment value);
	void append(IFragment value); 

	void collect(IFragment value);  
	
	void print(String file); 
	
	boolean inContextOf(EClass node); 
	boolean isContainedIn(EClass node);
	boolean isType(EClass node); 

	boolean isLoaded();
	
	boolean isFirst();
	boolean isLast(); 
	
	
	
	String toString(); 
}

