/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsBracketInformationProvider {
	
	public class BracketPair implements org.reuseware.air.language.abstractsyntax.resource.as.IAsBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<org.reuseware.air.language.abstractsyntax.resource.as.IAsBracketPair> getBracketPairs() {
		java.util.Collection<org.reuseware.air.language.abstractsyntax.resource.as.IAsBracketPair> result = new java.util.ArrayList<org.reuseware.air.language.abstractsyntax.resource.as.IAsBracketPair>();
		result.add(new BracketPair("<", ">", false));
		return result;
	}
	
}
