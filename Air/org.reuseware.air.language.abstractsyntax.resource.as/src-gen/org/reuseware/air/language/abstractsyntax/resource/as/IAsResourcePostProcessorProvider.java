/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IAsResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsResourcePostProcessor getResourcePostProcessor();
	
}
