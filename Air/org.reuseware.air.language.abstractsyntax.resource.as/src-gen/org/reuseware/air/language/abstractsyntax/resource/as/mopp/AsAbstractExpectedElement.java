/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class AsAbstractExpectedElement implements org.reuseware.air.language.abstractsyntax.resource.as.IAsExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<org.reuseware.air.language.abstractsyntax.resource.as.util.AsPair<org.reuseware.air.language.abstractsyntax.resource.as.IAsExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<org.reuseware.air.language.abstractsyntax.resource.as.util.AsPair<org.reuseware.air.language.abstractsyntax.resource.as.IAsExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public AsAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.reuseware.air.language.abstractsyntax.resource.as.IAsExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new org.reuseware.air.language.abstractsyntax.resource.as.util.AsPair<org.reuseware.air.language.abstractsyntax.resource.as.IAsExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.reuseware.air.language.abstractsyntax.resource.as.util.AsPair<org.reuseware.air.language.abstractsyntax.resource.as.IAsExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
