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
package org.reuseware.coconut.description.classify.derive;

import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.fragment.Fragment;

/**
 * @author Matthias Schmidt
 *
 */
public class RuleBaseDerivator extends Derivator {

	/* (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.derivate.Derivator#derive(org.reuseware.coconut.fragment.Fragment)
	 */
	@Override
	public Facet derive(Fragment subject, FacetType facetType) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.reuseware.coconut.description.classify.derivate.Derivator#getID()
	 */
	@Override
	public String getID() {
		return null;
	}

}
