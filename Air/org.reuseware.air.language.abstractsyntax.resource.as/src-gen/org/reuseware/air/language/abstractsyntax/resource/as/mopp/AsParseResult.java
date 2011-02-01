/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsParseResult implements org.reuseware.air.language.abstractsyntax.resource.as.IAsParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource>> commands = new java.util.ArrayList<org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource>>();
	
	public AsParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
