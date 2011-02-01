package org.reuseware.air.comogen.util;

import java.util.LinkedList;
import java.util.List;

/**
 * Structure to represent a method signature 
 * 
 * @author b0kaj
 *
 */
public class MethodStruct {

	private String returnType;
	private String methodName; 
	
	private List<String> parameters; 
	
	private String origName; 
	
	public MethodStruct() {
		returnType = "";
		methodName = "";
		parameters = new LinkedList<String>(); 
		origName = ""; 
	}
	
	public MethodStruct(String returnType, String methodName, List<String> parameters) {
		this.returnType = returnType; 
		this.methodName = methodName; 
		this.parameters = parameters; 
	}
	
	public void setOrigName(String name) {
		origName = name; 
	}
	
	public String getOrigName() {
		return origName; 
	}
	
	
	public String getReturnType() {
		return returnType;
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	public List<String> getParameters() {
		return parameters; 
	}
	
}
