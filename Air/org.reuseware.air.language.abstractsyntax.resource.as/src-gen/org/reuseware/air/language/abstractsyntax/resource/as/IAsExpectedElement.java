/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IAsExpectedElement {
	
	public java.lang.String getTokenName();
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	public void addFollower(org.reuseware.air.language.abstractsyntax.resource.as.IAsExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path);
	public java.util.Collection<org.reuseware.air.language.abstractsyntax.resource.as.util.AsPair<org.reuseware.air.language.abstractsyntax.resource.as.IAsExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers();
}
