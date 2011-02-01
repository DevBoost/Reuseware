/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.ui;

public class AsHoverTextProvider implements org.reuseware.air.language.abstractsyntax.resource.as.IAsHoverTextProvider {
	
	private org.reuseware.air.language.abstractsyntax.resource.as.ui.AsDefaultHoverTextProvider defaultProvider = new org.reuseware.air.language.abstractsyntax.resource.as.ui.AsDefaultHoverTextProvider();
	
	public java.lang.String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
