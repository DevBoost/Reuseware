/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsProblem implements org.reuseware.air.language.abstractsyntax.resource.as.IAsProblem {
	
	private java.lang.String message;
	private org.reuseware.air.language.abstractsyntax.resource.as.AsEProblemType type;
	
	public AsProblem(java.lang.String message, org.reuseware.air.language.abstractsyntax.resource.as.AsEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.AsEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
