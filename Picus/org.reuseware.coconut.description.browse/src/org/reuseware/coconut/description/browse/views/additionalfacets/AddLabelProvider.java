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
package org.reuseware.coconut.description.browse.views.additionalfacets;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.reuseware.coconut.description.FacetTypeDecorator;

public class AddLabelProvider extends LabelProvider implements ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		if (element == null || !(element instanceof FacetTypeDecorator))
			return getText(element);
		FacetTypeDecorator typeDecor = (FacetTypeDecorator) element;

		switch (columnIndex) {
		case 0:
			return typeDecor.getDecoratee().getName();
		case 1:
			return typeDecor.getDecoratee().getDescription();

		default:
			return "ERROR!";
		}
	}
}
