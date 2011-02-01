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
package org.reuseware.coconut.description.classify.views.describe;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.reuseware.coconut.description.Property;

public class PropertyLabelProvider extends LabelProvider implements
		ITableLabelProvider {

	public String getColumnText(Object obj, int index) {
		if (obj instanceof Property) {
			Property property = (Property) obj;
			
			switch (index) {
			case 0:
				return property.getName();
			
			case 1:
				return property.getValue();
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
