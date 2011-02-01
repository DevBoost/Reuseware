/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.grammar;

public class AsContainment extends org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsTerminal {
	
	public AsContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
