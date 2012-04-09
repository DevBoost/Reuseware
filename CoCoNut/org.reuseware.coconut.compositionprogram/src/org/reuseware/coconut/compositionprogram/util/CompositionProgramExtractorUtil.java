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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;
import org.reuseware.coconut.fragment.Fragment;

/**
 * Management class for the
 * <i>org.reuseware.coconut.compositionprogram.compositionProgramExtractor</i>
 * extension point.
 */
public final class CompositionProgramExtractorUtil {
	
	private CompositionProgramExtractorUtil() { }
	
	/**
	 * Extension point ID: 
	 * <i>org.reuseware.coconut.compositionprogram.compositionProgramExtractor</i>.
	 */
	public static final String COMPOSITION_PROGRAM_EXTRACTOR_EP = 
		"org.reuseware.coconut.compositionprogram.compositionProgramExtractor";

	private static List<CompositionProgramExtractor> compositionProgramExtractors;

	/**
	 * @return modifiable list of all registered composition program extractors.
	 */
	public static List<CompositionProgramExtractor> getCompositionProgramExtractors() {
		if (compositionProgramExtractors == null) {
			compositionProgramExtractors = new ArrayList<CompositionProgramExtractor>();
			init();
		}
		return compositionProgramExtractors;
	}
	
	private static void init() {
		if (Platform.isRunning()) {
			IExtensionPoint storeEP = Platform.getExtensionRegistry().getExtensionPoint(
					COMPOSITION_PROGRAM_EXTRACTOR_EP);
	        IConfigurationElement[] entries = storeEP.getConfigurationElements();

	        for (int i = 0; i < entries.length; i++) {
	        	if (entries[i].getName().equals("compositionProgramExtractor")) {
					try {
		        		String extension = entries[i].getAttribute("class");
		        		CompositionProgramExtractor extractor = 
		        			(CompositionProgramExtractor) entries[i].createExecutableExtension("class");
		        		compositionProgramExtractors.add(extractor);
					} catch (CoreException e) {
						e.printStackTrace();
					}
	        	}
	        }	
		}
	}
	
	/**
	 * Extracts a composition program based on a fragment by selecting an
	 * appropriate composition program extractor.
	 * 
	 * @param fragment The fragment from which to extract the composition program.
	 * @return The extracted composition program.
	 */
	public static DerivedCompositionProgram extract(Fragment fragment) {
		if (fragment != null && !fragment.getContents().isEmpty()) {
			for (CompositionProgramExtractor extractor : getCompositionProgramExtractors()) {
				if (extractor.canExtract(fragment)) {
					DerivedCompositionProgram derivedCompositionProgram = 
						extractor.extract(fragment);
		
					return derivedCompositionProgram;
				}
			}
		}
		return null;
	}
}
