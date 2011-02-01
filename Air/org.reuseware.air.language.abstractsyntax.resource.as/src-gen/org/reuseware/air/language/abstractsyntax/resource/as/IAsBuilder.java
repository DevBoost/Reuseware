/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as;

public interface IAsBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
