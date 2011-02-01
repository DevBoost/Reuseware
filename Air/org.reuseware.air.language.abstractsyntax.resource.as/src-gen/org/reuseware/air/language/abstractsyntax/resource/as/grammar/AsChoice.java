/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.grammar;

public class AsChoice extends org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement {
	
	public AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.reuseware.air.language.abstractsyntax.resource.as.util.AsStringUtil.explode(getChildren(), "|");
	}
	
}
