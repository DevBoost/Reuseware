/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.ui;

/**
 * A class used to initialize default preference values.
 */
public class AsPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static org.reuseware.air.language.abstractsyntax.resource.as.ui.AsAntlrTokenHelper tokenHelper = new org.reuseware.air.language.abstractsyntax.resource.as.ui.AsAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.reuseware.air.language.abstractsyntax.resource.as.ui.AsUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
		// Set default value for occurrences
		store.setDefault(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsPreferenceConstants.EDITOR_OCCURRENCE_CHECKBOX, true);
		store.setDefault(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsPreferenceConstants.EDITOR_DEFINITION_COLOR, "240,216,168");
		store.setDefault(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsPreferenceConstants.EDITOR_PROXY_COLOR, "212,212,212");
		
		// store.setDefault(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_OVERVIEW_
		// RULER, true);
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.reuseware.air.language.abstractsyntax.resource.as.ui.AsUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.reuseware.air.language.abstractsyntax.resource.as.ui.AsUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.reuseware.air.language.abstractsyntax.resource.as.IAsMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.reuseware.air.language.abstractsyntax.resource.as.ui.AsBracketSet bracketSet = new org.reuseware.air.language.abstractsyntax.resource.as.ui.AsBracketSet(null, null);
		final java.util.Collection<org.reuseware.air.language.abstractsyntax.resource.as.IAsBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.reuseware.air.language.abstractsyntax.resource.as.IAsBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.reuseware.air.language.abstractsyntax.resource.as.ui.AsPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.reuseware.air.language.abstractsyntax.resource.as.IAsMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxColoring(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.reuseware.air.language.abstractsyntax.resource.as.ui.AsSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
