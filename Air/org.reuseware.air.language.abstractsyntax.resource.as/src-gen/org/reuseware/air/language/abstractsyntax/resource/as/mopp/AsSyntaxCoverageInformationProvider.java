/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAbstractSyntax(),
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getImport(),
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getASProgram(),
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getConcreteNodeDefinition(),
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInterfaceNodeDefinition(),
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAttribute(),
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getContainment(),
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInternalReference(),
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getExternalReference(),
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getPLUS(),
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getSTAR(),
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getQUESTIONMARK(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAbstractSyntax(),
		};
	}
	
}
