/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.lacome.adjustment.comparator;

import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.strategy.DiagramComparator;

/**
 * A comparator to sort by x position.
 */
public class XPositionComparator implements DiagramComparator {

	/**
	 * @param dd1 a diagram description
	 * @param dd2 a diagram description
	 * 
     * @return a negative integer, zero, or a positive integer as the
     * 	       first argument is less than, equal to, or greater than the
     *	       second.
	 */
	public int compare(DiagramDescription dd1, DiagramDescription dd2) {
		//starting with lowest x value
		if (dd1.getTargetBounds().getX() < dd2.getTargetBounds().getX()) {
			return -1;
		} else {
			//if fd1.x = fd2.x the lowest y value wins
			if ((dd1.getTargetBounds().getX() == dd2.getTargetBounds().getX())
					&& (dd1.getTargetBounds().getY() < dd2.getTargetBounds().getY())) {
				return -1;
			}
			return 1;
		}
	}
}
