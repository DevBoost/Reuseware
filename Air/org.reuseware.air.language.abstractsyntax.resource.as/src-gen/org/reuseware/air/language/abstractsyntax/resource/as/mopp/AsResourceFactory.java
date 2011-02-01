/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public AsResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsResource(uri);
	}
}
