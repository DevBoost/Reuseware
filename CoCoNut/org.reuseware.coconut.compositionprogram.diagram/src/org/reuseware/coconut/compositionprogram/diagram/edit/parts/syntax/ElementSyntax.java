/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.compositionprogram.diagram.edit.parts.syntax;

/**
 * Data structure to cache the syntax properties of an element for
 * which custom syntax can be defined (fragment or port instance).
 */
public class ElementSyntax {
	
	private boolean visible;
	private boolean labelVisible;
	
	private int width;
	private int height;

	private String icon;
	
	
	/**
	 * The constructor for an element syntax.
	 * 
	 * @param visible is the element visible?
	 * @param labelVisible is the label visible?
	 * @param width of the element
	 * @param height height of the element
	 * @param icon icon for the element
	 */
	public ElementSyntax(boolean visible, boolean labelVisible, int width,
			int height, String icon) {
		this.visible = visible;
		this.labelVisible = labelVisible;
		this.width = width;
		this.height = height;
		this.icon = icon;
	}

	/**
	 * @return true if visible
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * @return true if label visible
	 */
	public boolean isLabelVisible() {
		return labelVisible;
	}

	/**
	 * @return width of element
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @return height of element
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return path to icon for element
	 */
	public String getIcon() {
		return icon;
	}
}
