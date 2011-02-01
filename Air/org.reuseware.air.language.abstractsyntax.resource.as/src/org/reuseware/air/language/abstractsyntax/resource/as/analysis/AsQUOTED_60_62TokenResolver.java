package org.reuseware.air.language.abstractsyntax.resource.as.analysis;

import org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolveResult;
import org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver;

public class AsQUOTED_60_62TokenResolver extends AsDefaultTokenResolver implements IAsTokenResolver  {
	@Override
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		java.lang.String result = super.deResolve(value, feature, container);
		result = result.replaceAll(java.util.regex.Pattern.quote(">"),"\\\\>");
		result += ">";
		result = "<" + result;
		return result;
	}

	@Override
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, IAsTokenResolveResult result) {
		lexem = lexem.substring(1);
		lexem = lexem.substring(0,lexem.length()-1);
		lexem = lexem.replaceAll("\\\\"+java.util.regex.Pattern.quote(">"),">");
		super.resolve(lexem, feature, result);
	}
}
