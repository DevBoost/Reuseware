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
package org.reuseware.lacome.adjustment.comparator;

import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.strategy.DiagramComparator;

/**
 * A comparator to sort by y position.
 */
public class YPositionComparator implements DiagramComparator {

	/**
	 * @param dd1 a diagram description
	 * @param dd2 a diagram description
	 * 
     * @return a negative integer, zero, or a positive integer as the
     * 	       first argument is less than, equal to, or greater than the
     *	       second.
	 */
	public int compare(DiagramDescription dd1, DiagramDescription dd2) {
		//starting with lowest y value
		if (dd1.getTargetBounds().getY() < dd2.getTargetBounds().getY()) {
			return -1;
		} else {
			//if fd1.y = fd2.y the lowest x value wins
			if ((dd1.getTargetBounds().getY() == dd2.getTargetBounds().getY())
					&& (dd1.getTargetBounds().getY() < dd2.getTargetBounds().getY())) {
				return -1;
			}
			return 1;
		}
	}
}
