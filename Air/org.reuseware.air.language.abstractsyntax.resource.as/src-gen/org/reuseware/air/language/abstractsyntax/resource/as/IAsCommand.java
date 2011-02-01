/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IAsCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
