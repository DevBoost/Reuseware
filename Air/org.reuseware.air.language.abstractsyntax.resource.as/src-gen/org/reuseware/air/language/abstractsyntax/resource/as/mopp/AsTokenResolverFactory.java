/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsTokenResolverFactory implements org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolverFactory {
	
	private java.util.Map<java.lang.String, org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver> featureName2CollectInTokenResolver;
	private static org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver defaultResolver = new org.reuseware.air.language.abstractsyntax.resource.as.analysis.AsDefaultTokenResolver();
	
	public AsTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<java.lang.String, org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<java.lang.String, org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver>();
		registerTokenResolver("TEXT", new org.reuseware.air.language.abstractsyntax.resource.as.analysis.AsTEXTTokenResolver());
		registerTokenResolver("QNAME", new org.reuseware.air.language.abstractsyntax.resource.as.analysis.AsQNAMETokenResolver());
		registerTokenResolver("QUOTED_60_62", new org.reuseware.air.language.abstractsyntax.resource.as.analysis.AsQUOTED_60_62TokenResolver());
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver internalCreateResolver(java.util.Map<java.lang.String, org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver> resolverMap, java.lang.String key, org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
