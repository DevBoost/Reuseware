/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsNewFileContentProvider {
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsMetaInformation getMetaInformation() {
		return new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsMetaInformation();
	}
	
	public java.lang.String getNewFileContent(java.lang.String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAbstractSyntax(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new org.reuseware.air.language.abstractsyntax.resource.as.util.AsMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		org.reuseware.air.language.abstractsyntax.resource.as.IAsTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsPlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.IAsTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return getMetaInformation().createPrinter(outputStream, new org.reuseware.air.language.abstractsyntax.resource.as.mopp.AsResource());
	}
	
}
