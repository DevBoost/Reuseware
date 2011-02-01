package org.reuseware.air.language.cmsl.resource.cmsl;

public class CmslTokenResolverFactory extends org.emftext.runtime.resource.impl.AbstractTokenResolverFactory implements org.emftext.runtime.resource.ITokenResolverFactory {
	
	public CmslTokenResolverFactory() {
		super.registerTokenResolver("ESTRING1", new org.reuseware.air.language.cmsl.resource.cmsl.analysis.CmslESTRING1TokenResolver());
		super.registerTokenResolver("ESTRING2", new org.reuseware.air.language.cmsl.resource.cmsl.analysis.CmslESTRING2TokenResolver());
		super.registerTokenResolver("QUOTED_60_62", new org.reuseware.air.language.cmsl.resource.cmsl.analysis.CmslQUOTED_60_62TokenResolver());
	}
}
