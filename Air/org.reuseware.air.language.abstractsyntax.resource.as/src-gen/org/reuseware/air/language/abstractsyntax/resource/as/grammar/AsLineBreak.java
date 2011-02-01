/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.grammar;

public class AsLineBreak extends org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsFormattingElement {
	
	private final int tabs;
	
	public AsLineBreak(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
