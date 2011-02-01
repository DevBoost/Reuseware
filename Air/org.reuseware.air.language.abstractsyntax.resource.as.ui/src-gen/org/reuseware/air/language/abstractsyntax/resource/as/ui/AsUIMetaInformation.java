/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.ui;

public class AsUIMetaInformation extends org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsMetaInformation {
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsHoverTextProvider getHoverTextProvider() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.ui.AsHoverTextProvider();
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.ui.AsColorManager createColorManager() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.ui.AsColorManager();
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.ui.AsTokenScanner createTokenScanner(org.reuseware.air.language.abstractsyntax.resource.as.ui.AsColorManager colorManager) {
		return new org.reuseware.air.language.abstractsyntax.resource.as.ui.AsTokenScanner(colorManager);
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.ui.AsCodeCompletionHelper createCodeCompletionHelper() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.ui.AsCodeCompletionHelper();
	}
	
}
