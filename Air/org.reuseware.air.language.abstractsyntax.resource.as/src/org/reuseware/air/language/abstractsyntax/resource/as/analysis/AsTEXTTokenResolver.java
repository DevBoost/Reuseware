package org.reuseware.air.language.abstractsyntax.resource.as.analysis;

import org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver;

public class AsTEXTTokenResolver extends AsDefaultTokenResolver implements IAsTokenResolver  {
	@Override
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		java.lang.String result = super.deResolve(value, feature, container);
		return result;
	}

	@Override
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, IAsTokenResolveResult result) {
		super.resolve(lexem, feature, result);
	}
}
