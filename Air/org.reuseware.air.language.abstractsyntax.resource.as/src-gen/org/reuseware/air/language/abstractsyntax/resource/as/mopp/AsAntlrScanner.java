/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsAntlrScanner implements org.reuseware.air.language.abstractsyntax.resource.as.IAsTextScanner {
	
	private org.antlr.runtime3_2_0.Lexer antlrLexer;
	
	public AsAntlrScanner(org.antlr.runtime3_2_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_2_0.Token current = antlrLexer.nextToken();
		org.reuseware.air.language.abstractsyntax.resource.as.IAsTextToken result = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_2_0.ANTLRStringStream(text));
	}
	
}
