/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class AsContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements org.reuseware.air.language.abstractsyntax.resource.as.IAsContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public AsContextDependentURIFragmentFactory(org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
