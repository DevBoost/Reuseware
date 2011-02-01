/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as;

public interface IAsReferenceCache {
	public java.lang.Object get(java.lang.String identifier);
	public void put(java.lang.String identifier, java.lang.Object target);
}
