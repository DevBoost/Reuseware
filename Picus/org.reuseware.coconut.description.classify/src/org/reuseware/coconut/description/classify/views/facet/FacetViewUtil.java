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
package org.reuseware.coconut.description.classify.views.facet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.reuseware.coconut.description.FacetType;

public class FacetViewUtil {
		// facet view extension point ID
	private static final String FACET_VIEW_ID = "org.reuseware.coconut.description.classify";
	
	public static FacetView getViewForType(FacetType type) {
			FacetView view = null;
			IConfigurationElement[] config = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(FACET_VIEW_ID);
			for (IConfigurationElement configElement : config) {

				// make sure this is the right extension
				String canShow = configElement.getAttribute("canShow");
				if (canShow == null)
					continue;

				String[] supportedTypes = canShow.split(",");
				boolean cannotShow = true;
				for (String string : supportedTypes) {
					string = string.trim();
					if (type.eClass().getName().equals(string)) {
						cannotShow = false;
						break;
					}
				}
				if (cannotShow)
					continue;

				// Create a FacetView object of this extension
				Object obj = null;
				try {
					obj = configElement.createExecutableExtension("class");
				} catch (CoreException ex) {
					System.out.println(ex.getMessage());
				}
				if (obj != null)
					if (obj instanceof FacetView)
						view = (FacetView) obj;
				break;
			}
			return view;
		
	}
}
