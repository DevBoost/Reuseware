/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.grammar;

public class AsWhiteSpace extends org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement {
	
	private final int amount;
	
	public AsWhiteSpace(int amount, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
