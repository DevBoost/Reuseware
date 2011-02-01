/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class AsExpectedStructuralFeature extends org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsAbstractExpectedElement {
	
	private org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder placeholder;
	
	public AsExpectedStructuralFeature(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.lang.String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(java.lang.Object o) {
		if (o instanceof AsExpectedStructuralFeature) {
			return getFeature().equals(((AsExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
