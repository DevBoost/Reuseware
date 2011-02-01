/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsReferenceResolverSwitch implements org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolverSwitch {
	
	protected org.reuseware.air.language.abstractsyntax.resource.as.analysis.ImportEPackageReferenceResolver importEPackageReferenceResolver = new org.reuseware.air.language.abstractsyntax.resource.as.analysis.ImportEPackageReferenceResolver();
	protected org.reuseware.air.language.abstractsyntax.resource.as.analysis.ConcreteNodeDefinitionESuperClassReferenceResolver concreteNodeDefinitionESuperClassReferenceResolver = new org.reuseware.air.language.abstractsyntax.resource.as.analysis.ConcreteNodeDefinitionESuperClassReferenceResolver();
	protected org.reuseware.air.language.abstractsyntax.resource.as.analysis.InterfaceNodeDefinitionOptionsReferenceResolver interfaceNodeDefinitionOptionsReferenceResolver = new org.reuseware.air.language.abstractsyntax.resource.as.analysis.InterfaceNodeDefinitionOptionsReferenceResolver();
	protected org.reuseware.air.language.abstractsyntax.resource.as.analysis.AttributeTypeReferenceResolver attributeTypeReferenceResolver = new org.reuseware.air.language.abstractsyntax.resource.as.analysis.AttributeTypeReferenceResolver();
	protected org.reuseware.air.language.abstractsyntax.resource.as.analysis.ContainmentTypeReferenceResolver containmentTypeReferenceResolver = new org.reuseware.air.language.abstractsyntax.resource.as.analysis.ContainmentTypeReferenceResolver();
	protected org.reuseware.air.language.abstractsyntax.resource.as.analysis.InternalReferenceTypeReferenceResolver internalReferenceTypeReferenceResolver = new org.reuseware.air.language.abstractsyntax.resource.as.analysis.InternalReferenceTypeReferenceResolver();
	protected org.reuseware.air.language.abstractsyntax.resource.as.analysis.InternalReferenceOppositeReferenceResolver internalReferenceOppositeReferenceResolver = new org.reuseware.air.language.abstractsyntax.resource.as.analysis.InternalReferenceOppositeReferenceResolver();
	protected org.reuseware.air.language.abstractsyntax.resource.as.analysis.ExternalReferenceTypeReferenceResolver externalReferenceTypeReferenceResolver = new org.reuseware.air.language.abstractsyntax.resource.as.analysis.ExternalReferenceTypeReferenceResolver();
	
	public org.reuseware.air.language.abstractsyntax.resource.as.analysis.ImportEPackageReferenceResolver getImportEPackageReferenceResolver() {
		return importEPackageReferenceResolver;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.analysis.ConcreteNodeDefinitionESuperClassReferenceResolver getConcreteNodeDefinitionESuperClassReferenceResolver() {
		return concreteNodeDefinitionESuperClassReferenceResolver;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.analysis.InterfaceNodeDefinitionOptionsReferenceResolver getInterfaceNodeDefinitionOptionsReferenceResolver() {
		return interfaceNodeDefinitionOptionsReferenceResolver;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.analysis.AttributeTypeReferenceResolver getAttributeTypeReferenceResolver() {
		return attributeTypeReferenceResolver;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.analysis.ContainmentTypeReferenceResolver getContainmentTypeReferenceResolver() {
		return containmentTypeReferenceResolver;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.analysis.InternalReferenceTypeReferenceResolver getInternalReferenceTypeReferenceResolver() {
		return internalReferenceTypeReferenceResolver;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.analysis.InternalReferenceOppositeReferenceResolver getInternalReferenceOppositeReferenceResolver() {
		return internalReferenceOppositeReferenceResolver;
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.analysis.ExternalReferenceTypeReferenceResolver getExternalReferenceTypeReferenceResolver() {
		return externalReferenceTypeReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		importEPackageReferenceResolver.setOptions(options);
		concreteNodeDefinitionESuperClassReferenceResolver.setOptions(options);
		interfaceNodeDefinitionOptionsReferenceResolver.setOptions(options);
		attributeTypeReferenceResolver.setOptions(options);
		containmentTypeReferenceResolver.setOptions(options);
		internalReferenceTypeReferenceResolver.setOptions(options);
		internalReferenceOppositeReferenceResolver.setOptions(options);
		externalReferenceTypeReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(java.lang.String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getImport().isInstance(container)) {
			AsFuzzyResolveResult<org.eclipse.emf.ecore.EPackage> frr = new AsFuzzyResolveResult<org.eclipse.emf.ecore.EPackage>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ePackage")) {
				importEPackageReferenceResolver.resolve(identifier, (org.reuseware.air.language.abstractsyntax.Import) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getConcreteNodeDefinition().isInstance(container)) {
			AsFuzzyResolveResult<org.eclipse.emf.ecore.EClass> frr = new AsFuzzyResolveResult<org.eclipse.emf.ecore.EClass>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("eSuperClass")) {
				concreteNodeDefinitionESuperClassReferenceResolver.resolve(identifier, (org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInterfaceNodeDefinition().isInstance(container)) {
			AsFuzzyResolveResult<org.reuseware.air.language.abstractsyntax.Definition> frr = new AsFuzzyResolveResult<org.reuseware.air.language.abstractsyntax.Definition>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("options")) {
				interfaceNodeDefinitionOptionsReferenceResolver.resolve(identifier, (org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAttribute().isInstance(container)) {
			AsFuzzyResolveResult<org.eclipse.emf.ecore.EDataType> frr = new AsFuzzyResolveResult<org.eclipse.emf.ecore.EDataType>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				attributeTypeReferenceResolver.resolve(identifier, (org.reuseware.air.language.abstractsyntax.Attribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getContainment().isInstance(container)) {
			AsFuzzyResolveResult<org.reuseware.air.language.abstractsyntax.Definition> frr = new AsFuzzyResolveResult<org.reuseware.air.language.abstractsyntax.Definition>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				containmentTypeReferenceResolver.resolve(identifier, (org.reuseware.air.language.abstractsyntax.Containment) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInternalReference().isInstance(container)) {
			AsFuzzyResolveResult<org.reuseware.air.language.abstractsyntax.Definition> frr = new AsFuzzyResolveResult<org.reuseware.air.language.abstractsyntax.Definition>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				internalReferenceTypeReferenceResolver.resolve(identifier, (org.reuseware.air.language.abstractsyntax.InternalReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInternalReference().isInstance(container)) {
			AsFuzzyResolveResult<org.reuseware.air.language.abstractsyntax.InternalReference> frr = new AsFuzzyResolveResult<org.reuseware.air.language.abstractsyntax.InternalReference>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("opposite")) {
				internalReferenceOppositeReferenceResolver.resolve(identifier, (org.reuseware.air.language.abstractsyntax.InternalReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getExternalReference().isInstance(container)) {
			AsFuzzyResolveResult<org.eclipse.emf.ecore.EClass> frr = new AsFuzzyResolveResult<org.eclipse.emf.ecore.EClass>(result);
			java.lang.String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				externalReferenceTypeReferenceResolver.resolve(identifier, (org.reuseware.air.language.abstractsyntax.ExternalReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getImport_EPackage()) {
			return importEPackageReferenceResolver;
		}
		if (reference == org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getConcreteNodeDefinition_ESuperClass()) {
			return concreteNodeDefinitionESuperClassReferenceResolver;
		}
		if (reference == org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInterfaceNodeDefinition_Options()) {
			return interfaceNodeDefinitionOptionsReferenceResolver;
		}
		if (reference == org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAttribute_Type()) {
			return attributeTypeReferenceResolver;
		}
		if (reference == org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getContainment_Type()) {
			return containmentTypeReferenceResolver;
		}
		if (reference == org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInternalReference_Type()) {
			return internalReferenceTypeReferenceResolver;
		}
		if (reference == org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInternalReference_Opposite()) {
			return internalReferenceOppositeReferenceResolver;
		}
		if (reference == org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getExternalReference_Type()) {
			return externalReferenceTypeReferenceResolver;
		}
		return null;
	}
	
}
