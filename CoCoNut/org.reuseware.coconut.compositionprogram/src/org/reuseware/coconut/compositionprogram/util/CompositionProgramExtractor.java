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
package org.reuseware.coconut.compositionprogram.util;

import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;
import org.reuseware.coconut.fragment.Fragment;

/**
 * An interface that needs to be implemented by extensions for the
 * <i>org.reuseware.coconut.compositionprogram.compositionProgramExtractor</i>
 * extension point.
 */
public interface CompositionProgramExtractor {

	/**
	 * @param fragment The fragment from which to extract the composition program.
	 * @return <i>true</i> if this extractor can extract a composition program based on the 
	 *         given fragment.
	 */
	boolean canExtract(
			Fragment fragment);
	
	/**
	 * @param fragment The fragment from which to extract the composition program.
	 * @return The extracted composition program.
	 */
	DerivedCompositionProgram extract(
			Fragment fragment);
}
