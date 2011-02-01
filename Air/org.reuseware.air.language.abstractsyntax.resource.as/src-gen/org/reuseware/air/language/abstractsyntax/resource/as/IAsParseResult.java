/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IAsParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.reuseware.air.language.abstractsyntax.resource.as.IAsCommand<org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource>> getPostParseCommands();
	
}
