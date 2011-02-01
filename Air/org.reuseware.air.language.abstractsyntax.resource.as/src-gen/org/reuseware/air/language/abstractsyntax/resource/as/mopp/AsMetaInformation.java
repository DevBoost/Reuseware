/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsMetaInformation implements org.reuseware.air.language.abstractsyntax.resource.as.IAsMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "as";
	}
	
	public java.lang.String getURI() {
		return "http://www.reuseware.org/air/language/abstractsyntax";
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsTextScanner createLexer() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsAntlrScanner(new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsLexer());
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsParser().createInstance(inputStream, encoding);
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsTextPrinter createPrinter(java.io.OutputStream outputStream, org.reuseware.air.language.abstractsyntax.resource.as.IAsTextResource resource) {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsReferenceResolverSwitch();
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenResolverFactory getTokenResolverFactory() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "org.reuseware.air.language.abstractsyntax/metamodel/as.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsParser(null).getTokenNames();
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.reuseware.air.language.abstractsyntax.resource.as.IAsBracketPair> getBracketPairs() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsResourceFactory();
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsNewFileContentProvider getNewFileContentProvider() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsNewFileContentProvider();
	}
	
}
