/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.grammar;

public class AsCompound extends org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement {
	
	public AsCompound(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice choice, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality) {
		super(cardinality, new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
