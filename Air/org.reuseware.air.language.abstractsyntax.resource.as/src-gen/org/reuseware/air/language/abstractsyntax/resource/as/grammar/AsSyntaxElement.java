/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class AsSyntaxElement {
	
	private AsSyntaxElement[] children;
	private AsSyntaxElement parent;
	private org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality;
	
	public AsSyntaxElement(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality cardinality, AsSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (AsSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(AsSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public AsSyntaxElement[] getChildren() {
		if (children == null) {
			return new AsSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsCardinality getCardinality() {
		return cardinality;
	}
	
}
