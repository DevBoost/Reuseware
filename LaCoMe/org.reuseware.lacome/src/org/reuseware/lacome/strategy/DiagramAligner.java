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
package org.reuseware.lacome.strategy;

import org.reuseware.lacome.DiagramDescription;

/**
 * A diagram aligner tries to transfer layout information from an old version
 * of a diagram to a new one, preserving the information of new elements in the
 * new version of the diagram.
 */
public interface DiagramAligner {

	/**
	 * @param newDiagram diagram to be aligned
	 * @return true if this aligner can work with the given diagram
	 */
	boolean canAlign(
			DiagramDescription newDiagram);
	
	/**
	 * Aligns a new version of a diagram with an old (manually modified) one.
	 * 
	 * @param newDiagram new version of composed diagram
	 * @param oldDiagram old version of composed diagram
	 */
	void align(
			DiagramDescription newDiagram,
			DiagramDescription oldDiagram);

}
