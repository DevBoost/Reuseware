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
package org.reuseware.sokan.ui.internal.filters;

import java.util.List;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.IMemento;
import org.reuseware.sokan.ui.model.sokanui.Container;

/**
 * A filter that filters artifacts by their ID.
 */
public class ArtifactFilter extends ViewerFilter implements Cloneable {

	private static final int FILTER_CONTAINS = 0;

	//private static final int FILTER_DOES_NOT_CONTAIN = 1;

	private static final String TAG_FILTER_ON_DESCRIPTION = "filterOnDescription";

	private static final String TAG_DESCRIPTION_FILTER_KIND = "descriptionFilterKind";

	private static final String TAG_DESCRIPTION_FILTER = "descriptionFilter";

	private boolean filterOnDescription;

	private int descriptionFilterKind;

	private String descriptionFilter;

	/**
	 * Constructs a new artifact filter.
	 */
	public ArtifactFilter() {
		reset();
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return selectByAttributes(element);
	}

	private boolean selectByAttributes(Object element) {
		if (element instanceof Container) {
			List<String> id = ((Container) element).getId();
			if (id == null) {
				return true;
			}
			return checkDescription(id);
		} else {
			return true;
		}
	}

	boolean checkDescription(List<String> desc) {
		boolean contains = containsSubstring(desc, descriptionFilter);
		return descriptionFilterKind == FILTER_CONTAINS ? contains : !contains;
	}

	boolean containsSubstring(List<String> stringList, String substring) {
		for (String string : stringList) {
			int strLen = string.length();
			int subLen = substring.length();
			int len = strLen - subLen;
			for (int i = 0; i <= len; ++i) {
				if (string.regionMatches(true, i, substring, 0, subLen)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Resets the filter.
	 */
	public void reset() {
		filterOnDescription = false;
		descriptionFilter = "";
	}

	/**
	 * Saves the filters state using the given memento.
	 * 
	 * @param memento the memento
	 */
	public void saveState(IMemento memento) {
		memento.putInteger(TAG_FILTER_ON_DESCRIPTION, filterOnDescription ? 1 : 0);
		memento.putInteger(TAG_DESCRIPTION_FILTER_KIND, descriptionFilterKind);
		memento.putString(TAG_DESCRIPTION_FILTER, descriptionFilter);
	}
	
	/**
	 * Restores the filters state using the given memento.
	 * 
	 * @param memento the memento
	 */
	public void restoreState(IMemento memento) {
		Integer ival = memento.getInteger(TAG_FILTER_ON_DESCRIPTION);
		filterOnDescription = ival != null && ival.intValue() == 1;
		ival = memento.getInteger(TAG_DESCRIPTION_FILTER_KIND);
		descriptionFilterKind = ival == null ? FILTER_CONTAINS : ival
				.intValue();
		descriptionFilter = memento.getString(TAG_DESCRIPTION_FILTER);
		if (descriptionFilter == null) {
			descriptionFilter = ""; //$NON-NLS-1$
		}
	}

	/**
	 * @param descriptionFilter the descriptionFilter
	 */
	public void setDescriptionFilter(String descriptionFilter) {
		this.descriptionFilter = descriptionFilter;
	}

	/**
	 * @param filterOnDescription the filterOnDescription
	 */
	public void setFilterOnDescription(boolean filterOnDescription) {
		this.filterOnDescription = filterOnDescription;
	}

	/**
	 * @param descriptionFilterKind the descriptionFilterKind
	 */
	public void setDescriptionFilterKind(int descriptionFilterKind) {
		this.descriptionFilterKind = descriptionFilterKind;
	}

	/**
	 * @return the descriptionFilter
	 */
	public String getDescriptionFilter() {
		return descriptionFilter;
	}

	/**
	 * @return the filterOnDescription
	 */
	public boolean getFilterOnDescription() {
		return filterOnDescription;
	}

	/**
	 * @return the descriptionFilterKind
	 */
	public int getDescriptionFilterKind() {
		return descriptionFilterKind;
	}

}
