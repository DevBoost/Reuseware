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
package org.reuseware.lacome.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * A composition strategies combines a set of arrangers.
 */
public class DiagramCompositionStrategy {
	
	private String iD;
	
	private List<String> arrangerIDs = new ArrayList<String>();
	private List<String> deactivateMergerIDs = new ArrayList<String>();
	
	/**
	 * Constructs a composition strategy with the given ID.
	 * 
	 * @param iD ID of the composition strategy
	 */
	public DiagramCompositionStrategy(String iD) {
		super();
		this.iD = iD;
	}
	
	/**
	 * @return ID of the composition strategy
	 */
	public String getID() {
		return iD;
	}

	/**
	 * @return modifiable list of arranger IDs that belong to this strategy
	 */
	public List<String> getArrangerIDs() {
		return arrangerIDs;
	}

	/**
	 * Mergers that would work for a given model (i.e., <code>DiagramMerger.canMerge</code>
	 * returns true) can be explicitly de-activated for a strategy.
	 * 
	 * @return modifiable list of mergers that should be explicitly NOT used 
	 *         if this strategy is applied 
	 */
	public List<String> getDeactivateMergerIDs() {
		return deactivateMergerIDs;
	}

}
