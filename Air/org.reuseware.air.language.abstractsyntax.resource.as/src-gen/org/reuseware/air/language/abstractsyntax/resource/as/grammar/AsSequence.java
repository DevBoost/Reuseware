/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.grammar;

public class AsSequence extends org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement {
	
	public AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.reuseware.air.language.abstractsyntax.resource.as.util.AsStringUtil.explode(getChildren(), " ");
	}
	
}
