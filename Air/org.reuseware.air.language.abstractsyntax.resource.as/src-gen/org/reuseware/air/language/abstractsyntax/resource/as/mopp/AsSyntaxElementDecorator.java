/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.mopp;

public class AsSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private AsSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<java.lang.Integer> indicesToPrint = new java.util.ArrayList<java.lang.Integer>();
	
	public AsSyntaxElementDecorator(org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement decoratedElement, AsSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(java.lang.Integer index) {
		indicesToPrint.add(index);
	}
	
	public org.reuseware.air.language.abstractsyntax.resource.as.grammar.AsSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public AsSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public java.lang.Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
