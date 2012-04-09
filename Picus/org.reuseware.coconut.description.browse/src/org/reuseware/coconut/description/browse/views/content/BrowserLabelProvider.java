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
package org.reuseware.coconut.description.browse.views.content;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.Property;
import org.reuseware.coconut.description.classify.DescriptionManager;

public class BrowserLabelProvider extends LabelProvider implements ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		if (!(element instanceof FragmentDescription))
			return getText(element);

		FragmentDescription description = (FragmentDescription) element;
		Property property = null;
		String propName = DescriptionManager.PROPERTY_TYPES[columnIndex];

		for (Property prop : description.getProperties()) {
			if (prop.getName().equals(propName)) {
				property = prop;
				break;
			}
		}

		if (property == null || property.getValue() == null)
			return getText(element);

		return property.getValue();

	}
}
