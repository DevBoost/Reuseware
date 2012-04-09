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
/**
 * 
 */
package org.reuseware.coconut.description.browse.util;

import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.browse.MainBrowserManager;
import org.reuseware.coconut.description.classify.DecorationManager;
import org.reuseware.coconut.description.classify.views.facet.ZoomListener;

/**
 * @author Matthias Schmidt
 * 
 */
public class DynamicDecorationManager extends DecorationManager {

	/**
	 * Simply returns <code>false</code> at the moment. <br>
	 * Should check whether all it's <code>FacetValueDecorator</code>s have the
	 * correct valueCount.
	 * 
	 * @param context
	 * 
	 * @param context
	 *            The <code>FacetTypeDecorator</code> to check.
	 * @return <code>False</code> if a refresh is needed, else <code>true</code>
	 *         .
	 */
	public static boolean isViewUpToDate(FacetTypeDecorator viewDecor, FacetTypeDecorator stateDecor) {
		return false;

		// are all values up-to-date?
		// return areValuesUpToDate(viewDecor.getValues(),
		// stateDecor.getValues());
	}

	// private static boolean areValuesUpToDate(EList<FacetValueDecorator>
	// viewValues,
	// EList<FacetValueDecorator> stateValues) {
	// boolean upToDate = true;
	//
	// for (FacetValueDecorator viewValue : viewValues) {
	// for (FacetValueDecorator stateValue : stateValues) {
	// if (viewValue.equals(stateValue)) {
	// upToDate = viewValue.getValueCount() == stateValue.getValueCount();
	// if (!upToDate)
	// return false;
	//
	// upToDate = areValuesUpToDate(viewValue.getChildren(),
	// stateValue.getChildren());
	// if (!upToDate)
	// return false;
	// }
	// }
	// }
	//
	// return true;
	// }

	public static FacetTypeDecorator refresh(FacetTypeDecorator decor) {
		BrowserState state = MainBrowserManager.getInstance().getBrowserStateManager().getState();
		getZoomLister().calcValueCounts(decor, state);
		return decor;
	}

	public static FacetTypeDecorator buildFacetTypeDecorator(FacetType type) {
		FacetTypeDecorator ftDecorator = DecorationManager.buildFacetTypeDecorator(type);
		ftDecorator = getZoomLister().calcValueCounts(ftDecorator, null);
		return ftDecorator;
	}

	public static ZoomListener getZoomLister() {
		return OCLZoomer.getInstance();
	}
}
