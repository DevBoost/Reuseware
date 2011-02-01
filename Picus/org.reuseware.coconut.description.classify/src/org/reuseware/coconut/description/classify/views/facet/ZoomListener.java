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
package org.reuseware.coconut.description.classify.views.facet;

import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetTypeDecorator;

/**
 * A kind of Listener which can be attached to a <code>FacetView</code> to be
 * notified, when the user selects values and a zoom-step is needed.
 * 
 * @author Matthias Schmidt
 * 
 */
public abstract class ZoomListener {
	/**
	 * The single instance.
	 */
	protected static ZoomListener instance;

	protected ZoomListener() {
	}

	/**
	 * Performs a zoom process on the current filtered search content of the
	 * fragment browser. This zoom-step is usually a zoom-in which leads the
	 * content to shrink. If the list of selected <code>FacetValue</code>s is
	 * empty this method usually performs a zoom-out leading the content to
	 * grow.<br>
	 * <br>
	 * The <code>Facet</code> object gives information about which type should
	 * be in focus of this process and which <code>FacetValue</code>s where
	 * selected by the user to do the next step in his search.
	 * 
	 * @param facet
	 *            The <code>Facet</code> on which the zoom should be performed.
	 * @param lazy
	 *            Defines whether the <code>BrowserState</code> should be
	 *            updated in a lazy way.
	 */
	public abstract void zoom(Facet facet, boolean lazy);

	/**
	 * Changes the filtered content of the browser. As there is only a
	 * <code>FacetType</code> given, this method implies that there were no
	 * values selected for the type. This leads to a so called zoom-out.
	 * 
	 * @param type
	 *            The <code>FacetType</code> which is in focus of the zoom
	 *            process.
	 * @param lazy
	 *            Defines whether the <code>BrowserState</code> should be
	 *            updated in a lazy way.
	 */
	public abstract void zoom(FacetType type, boolean lazy);

	/**
	 * Refreshes all <code>valueCount</code> attributes of the given decorator.
	 * 
	 * @param cecor
	 *            The decorator in focus.
	 * @param state
	 *            The BrowserState to use.
	 * @return Recalculates and refreshes the <code>valueCount</code>
	 *         attributes.
	 */
	public abstract FacetTypeDecorator calcValueCounts(FacetTypeDecorator decor, BrowserState state);

	/**
	 * First zoom the list of <code>FragementDescriptions</code>s.
	 * 
	 * @param state
	 *            The <code>BrowserState</code> we are working on.
	 * @param facet
	 *            The <code>Facet</code> which describes the current zoom-step.
	 * @return The refreshed <code>BrowserState</code>.
	 */
	public abstract BrowserState zoomContent(BrowserState state, Facet facet);
}
