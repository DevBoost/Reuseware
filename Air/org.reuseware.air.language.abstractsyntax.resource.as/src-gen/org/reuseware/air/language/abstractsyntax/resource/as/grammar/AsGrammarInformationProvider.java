/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.grammar;

public class AsGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public static class Rule extends org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement {
		
		private final org.eclipse.emf.ecore.EClass metaclass;
		
		public Rule(org.eclipse.emf.ecore.EClass metaclass, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice choice, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality) {
			super(cardinality, new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement[] {choice});
			this.metaclass = metaclass;
		}
		
		public org.eclipse.emf.ecore.EClass getMetaclass() {
			return metaclass;
		}
		
		public org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice getDefinition() {
			return (org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice) getChildren()[0];
		}
	}
	
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_0_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("ABSTRACTSYNTAX", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_0_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAbstractSyntax().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NAME), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak AS_0_0_0_2 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_0_0_0_3 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("URI", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_0_0_0_4 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAbstractSyntax().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSURI), "QUOTED_60_62", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak AS_0_0_0_5 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_0_0_0_6 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("PREFIX", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_0_0_0_7 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAbstractSyntax().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSPREFIX), "QNAME", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak AS_0_0_0_8 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_0_0_0_9_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("IMPORT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment AS_0_0_0_9_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAbstractSyntax().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT), org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_0_0_0_9_0_0_2_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword(",", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment AS_0_0_0_9_0_0_2_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAbstractSyntax().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT), org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_0_0_0_9_0_0_2_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_0_0_0_9_0_0_2_0_0_0, AS_0_0_0_9_0_0_2_0_0_1);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_0_0_0_9_0_0_2_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_0_0_0_9_0_0_2_0_0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound AS_0_0_0_9_0_0_2 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound(AS_0_0_0_9_0_0_2_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.STAR);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak AS_0_0_0_9_0_0_3 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_0_0_0_9_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_0_0_0_9_0_0_0, AS_0_0_0_9_0_0_1, AS_0_0_0_9_0_0_2, AS_0_0_0_9_0_0_3);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_0_0_0_9_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_0_0_0_9_0_0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound AS_0_0_0_9 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound(AS_0_0_0_9_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.QUESTIONMARK);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment AS_0_0_0_10 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAbstractSyntax().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT), org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_0_0_0_0, AS_0_0_0_1, AS_0_0_0_2, AS_0_0_0_3, AS_0_0_0_4, AS_0_0_0_5, AS_0_0_0_6, AS_0_0_0_7, AS_0_0_0_8, AS_0_0_0_9, AS_0_0_0_10);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_0_0_0);
	public final static Rule AS_0 = new Rule(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAbstractSyntax(), AS_0_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_1_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getImport().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__EPACKAGE), "QUOTED_60_62", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_1_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("AS", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_1_0_0_2 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getImport().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.IMPORT__PREFIX), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_1_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_1_0_0_0, AS_1_0_0_1, AS_1_0_0_2);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_1_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_1_0_0);
	public final static Rule AS_1 = new Rule(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getImport(), AS_1_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak AS_2_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsLineBreak(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 2);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment AS_2_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getASProgram().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.AS_PROGRAM__STATEMENT), org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.PLUS, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_2_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_2_0_0_0, AS_2_0_0_1);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_2_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_2_0_0);
	public final static Rule AS_2 = new Rule(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getASProgram(), AS_2_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_3_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getConcreteNodeDefinition().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__NAME), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_3_0_0_1_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("==>", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_3_0_0_1_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getConcreteNodeDefinition().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS), "QNAME", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_3_0_0_1_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_3_0_0_1_0_0_0, AS_3_0_0_1_0_0_1);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_3_0_0_1_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_3_0_0_1_0_0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound AS_3_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound(AS_3_0_0_1_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.QUESTIONMARK);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_3_0_0_2_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("=", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment AS_3_0_0_2_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getConcreteNodeDefinition().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS), org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_3_0_0_2_0_0_2_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword(",", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment AS_3_0_0_2_0_0_2_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getConcreteNodeDefinition().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS), org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_3_0_0_2_0_0_2_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_3_0_0_2_0_0_2_0_0_0, AS_3_0_0_2_0_0_2_0_0_1);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_3_0_0_2_0_0_2_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_3_0_0_2_0_0_2_0_0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound AS_3_0_0_2_0_0_2 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound(AS_3_0_0_2_0_0_2_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.STAR);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_3_0_0_2_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_3_0_0_2_0_0_0, AS_3_0_0_2_0_0_1, AS_3_0_0_2_0_0_2);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_3_0_0_2_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_3_0_0_2_0_0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound AS_3_0_0_2 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound(AS_3_0_0_2_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.QUESTIONMARK);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_3_0_0_3 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword(";", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_3_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_3_0_0_0, AS_3_0_0_1, AS_3_0_0_2, AS_3_0_0_3);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_3_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_3_0_0);
	public final static Rule AS_3 = new Rule(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getConcreteNodeDefinition(), AS_3_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_4_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInterfaceNodeDefinition().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__NAME), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_4_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("=", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_4_0_0_2 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInterfaceNodeDefinition().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_4_0_0_3_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("|", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_4_0_0_3_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInterfaceNodeDefinition().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_4_0_0_3_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_4_0_0_3_0_0_0, AS_4_0_0_3_0_0_1);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_4_0_0_3_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_4_0_0_3_0_0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound AS_4_0_0_3 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound(AS_4_0_0_3_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.STAR);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_4_0_0_4 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword(";", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_4_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_4_0_0_0, AS_4_0_0_1, AS_4_0_0_2, AS_4_0_0_3, AS_4_0_0_4);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_4_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_4_0_0);
	public final static Rule AS_4 = new Rule(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInterfaceNodeDefinition(), AS_4_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_5_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("@", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_5_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAttribute().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__NAME), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_5_0_0_2 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword(":", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_5_0_0_3 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAttribute().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__TYPE), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment AS_5_0_0_4 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAttribute().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.ATTRIBUTE__CARDINALITY), org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.QUESTIONMARK, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_5_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_5_0_0_0, AS_5_0_0_1, AS_5_0_0_2, AS_5_0_0_3, AS_5_0_0_4);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_5_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_5_0_0);
	public final static Rule AS_5 = new Rule(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getAttribute(), AS_5_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_6_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getContainment().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__NAME), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_6_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword(":", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_6_0_0_2 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getContainment().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__TYPE), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment AS_6_0_0_3 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getContainment().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.CONTAINMENT__CARDINALITY), org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.QUESTIONMARK, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_6_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_6_0_0_0, AS_6_0_0_1, AS_6_0_0_2, AS_6_0_0_3);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_6_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_6_0_0);
	public final static Rule AS_6 = new Rule(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getContainment(), AS_6_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_7_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInternalReference().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__NAME), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_7_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("::", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_7_0_0_2 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInternalReference().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__TYPE), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_7_0_0_3_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("->", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_7_0_0_3_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInternalReference().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__OPPOSITE), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_7_0_0_3_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_7_0_0_3_0_0_0, AS_7_0_0_3_0_0_1);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_7_0_0_3_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_7_0_0_3_0_0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound AS_7_0_0_3 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCompound(AS_7_0_0_3_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.QUESTIONMARK);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment AS_7_0_0_4 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInternalReference().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.INTERNAL_REFERENCE__CARDINALITY), org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.QUESTIONMARK, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_7_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_7_0_0_0, AS_7_0_0_1, AS_7_0_0_2, AS_7_0_0_3, AS_7_0_0_4);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_7_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_7_0_0);
	public final static Rule AS_7 = new Rule(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getInternalReference(), AS_7_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_8_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getExternalReference().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__NAME), "TEXT", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_8_0_0_1 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("::", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder AS_8_0_0_2 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsPlaceholder(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getExternalReference().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__TYPE), "QNAME", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment AS_8_0_0_3 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsContainment(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getExternalReference().getEStructuralFeature(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.EXTERNAL_REFERENCE__CARDINALITY), org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.QUESTIONMARK, 0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_8_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_8_0_0_0, AS_8_0_0_1, AS_8_0_0_2, AS_8_0_0_3);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_8_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_8_0_0);
	public final static Rule AS_8 = new Rule(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getExternalReference(), AS_8_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_9_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("+", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_9_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_9_0_0_0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_9_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_9_0_0);
	public final static Rule AS_9 = new Rule(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getPLUS(), AS_9_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_10_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("*", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_10_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_10_0_0_0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_10_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_10_0_0);
	public final static Rule AS_10 = new Rule(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getSTAR(), AS_10_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword AS_11_0_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsKeyword("?", org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence AS_11_0_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSequence(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_11_0_0_0);
	public final static org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice AS_11_0 = new org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsChoice(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE, AS_11_0_0);
	public final static Rule AS_11 = new Rule(org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage.eINSTANCE.getQUESTIONMARK(), AS_11_0, org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality.ONE);
}
