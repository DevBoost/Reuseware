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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.reuseware.coconut.fragment.ComposedFragment;
import org.reuseware.coconut.fragment.Fragment;

/**
 * Management class for the
 * <i>org.reuseware.coconut.compositionprogram.compositionInterfaceComputer</i>
 * extension point.
 */
public final class CompositionInterfaceComputerUtil {
	
	private CompositionInterfaceComputerUtil() { }
	
	/**
	 * Extension point ID: 
	 * <i>org.reuseware.coconut.compositionprogram.compositionInterfaceComputer</i>.
	 */
	public static final String COMPOSITION_INTERFACE_COMPUTER_EP = 
		"org.reuseware.coconut.compositionprogram.compositionInterfaceComputer";

	private static List<CompositionInterfaceComputer> compositionInterfaceComputers;

	/**
	 * @return modifiable list of all registered composition interface computers.
	 */
	public static List<CompositionInterfaceComputer> getCompositionInterfaceComputers() {
		if (compositionInterfaceComputers == null) {
			compositionInterfaceComputers = new ArrayList<CompositionInterfaceComputer>();
			init();
		}
		return compositionInterfaceComputers;
	}
	
	/**
	 * Computes the composition interface for the fragment by selecting an
	 * appropriate composition interface computer or by falling back to the
	 * default computation of composition interfaces by interpreting REX files.
	 * 
	 * @param fragment The fragment from which to extract the composition program.
	 */
	public static void compute(Fragment fragment) {
		if (fragment instanceof ComposedFragment) {
			ComposedFragment composedFragment = ((ComposedFragment) fragment);
			doComputeCompositionInterface(composedFragment);
			composedFragment.removeVariationPoints();
			CompositionStepPostProcessorUtil.cleanup(composedFragment);
			doComputeCompositionInterface(composedFragment);
		} else {
			doComputeCompositionInterface(fragment);
		}
	}
	
	private static void doComputeCompositionInterface(Fragment fragment) {
		if (fragment.getContents().isEmpty()) {
			return;
		}
		
		for (CompositionInterfaceComputer computer : getCompositionInterfaceComputers()) {
			if (computer.canCompute(fragment)) {
				Fragment newFragment = computer.compute(fragment);
				if (fragment != newFragment) {
					fragment.getCompositionInterfaces().clear();
					fragment.getCompositionInterfaces().addAll(
							newFragment.getCompositionInterfaces());
				}
				return;
			}
		}
		
		//fall back to default
		fragment.computeCompositionInterface();
	}

	private static void init() {
		if (Platform.isRunning()) {
			IExtensionPoint storeEP = Platform.getExtensionRegistry().getExtensionPoint(COMPOSITION_INTERFACE_COMPUTER_EP);
	        IConfigurationElement[] entries = storeEP.getConfigurationElements();

	        for (int i = 0; i < entries.length; i++) {
	        	if (entries[i].getName().equals("compositionInterfaceComputer")) {
					try {
		        		String extension = entries[i].getAttribute("class");
		        		CompositionInterfaceComputer compositionInterfaceComputer = 
		        			(CompositionInterfaceComputer) entries[i].createExecutableExtension("class");
		        		compositionInterfaceComputers.add(compositionInterfaceComputer);
					} catch (CoreException e) {
						e.printStackTrace();
					}
	        	}
	        }	
		}
	}

}
