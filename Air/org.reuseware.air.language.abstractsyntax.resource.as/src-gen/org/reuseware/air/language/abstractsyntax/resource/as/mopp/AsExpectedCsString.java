/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class AsExpectedCsString extends org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsAbstractExpectedElement {
	
	private org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword keyword;
	
	public AsExpectedCsString(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public String getTokenName() {
		return "'" + getValue() + "'";
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof AsExpectedCsString) {
			return getValue().equals(((AsExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
