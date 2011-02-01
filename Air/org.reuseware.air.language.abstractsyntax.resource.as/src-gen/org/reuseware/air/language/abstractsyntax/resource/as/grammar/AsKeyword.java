/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class AsKeyword extends org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement {
	
	private final String value;
	
	public AsKeyword(String value, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
