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
package org.reuseware.coconut.description.classify.views.describe;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetValue;

public class FacetLabelProvider extends LabelProvider implements
		ITableLabelProvider {

	public String getColumnText(Object obj, int index) {
		if (obj instanceof Facet) {
			Facet facet = (Facet) obj;

			switch (index) {
			case 0:
				if (facet.getType() == null)
					return "";
				return facet.getType().getName();

			case 1:
				if (facet.getType() == null)
					return "";
				String show = "";
				for (FacetValue value : facet.getValues()) {
					show += value.getName() + ", ";
				}
				if (!show.equals(""))
					show = show.substring(0, show.lastIndexOf(','));
				return show;

			default:
				return "ERROR!";
			}
		}
		return getText(obj);
	}

	public Image getColumnImage(Object obj, int index) {
		 return null;
//		return PlatformUI.getWorkbench().getSharedImages().getImage(
//				ISharedImages.IMG_OBJ_ELEMENT);
	}
}
