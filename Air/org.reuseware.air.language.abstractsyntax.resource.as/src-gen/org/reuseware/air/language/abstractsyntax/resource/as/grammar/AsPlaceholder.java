/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class AsPlaceholder extends org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsTerminal {
	
	private final java.lang.String tokenName;
	
	public AsPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, java.lang.String tokenName, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public java.lang.String getTokenName() {
		return tokenName;
	}
	
}
