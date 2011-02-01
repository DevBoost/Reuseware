/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.ui;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class AsTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private org.reuseware.air.language.abstractsyntax.resource.as.IAsTextScanner lexer;
	private org.reuseware.air.language.abstractsyntax.resource.as.IAsTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private org.reuseware.air.language.abstractsyntax.resource.as.ui.AsColorManager colorManager;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public AsTokenScanner(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsColorManager colorManager) {
		this.lexer = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsMetaInformation().createLexer();
		this.languageId = new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsMetaInformation().getSyntaxName();
		this.store = org.reuseware.air.language.abstractsyntax.resource.as.ui.AsUIPlugin.getDefault().getPreferenceStore();
		this.colorManager = colorManager;
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		currentToken = lexer.getNextToken();
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		org.eclipse.jface.text.TextAttribute ta = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			String enableKey = org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.StyleProperty.ENABLE);
			if (store.getBoolean(enableKey)) {
				String colorKey = org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));
				int style = org.eclipse.swt.SWT.NORMAL;
				if (store.getBoolean(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.StyleProperty.BOLD))) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (store.getBoolean(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.StyleProperty.ITALIC))) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (store.getBoolean(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.StyleProperty.STRIKETHROUGH))) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (store.getBoolean(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.StyleProperty.UNDERLINE))) {
					style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
				}
				ta = new org.eclipse.jface.text.TextAttribute(color, null, style);
			}
		}
		return new org.eclipse.jface.text.rules.Token(ta);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
}
