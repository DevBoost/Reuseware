/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.compositionprogram.util;

import org.reuseware.coconut.fragment.Fragment;

/**
 * An interface that needs to be implemented by extensions for the
 * <i>org.reuseware.coconut.compositionprogram.compositionInterfaceComputer</i>
 * extension point.
 */
public interface CompositionInterfaceComputer {
	
	/**
	 * @param fragment The fragment for which to compute the composition interface.
	 * @return <i>true</i> if this computer can compute the composition interface of the 
	 *         given fragment.
	 */
	boolean canCompute(
			Fragment fragment);
	
	/**
	 * @param fragment The fragment for which to compute the composition interface.
	 * @return The computed composition interface.
	 */
	Fragment compute(
			Fragment fragment);

}
