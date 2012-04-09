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

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.Property;
import org.reuseware.coconut.description.classify.DescriptionManager;

public class PropertyEditingSupport extends EditingSupport {
	private ColumnViewer viewer;
	private CellEditor editor;
	private int column;

	public PropertyEditingSupport(ColumnViewer viewer, int cIndex) {
		super(viewer);
		this.viewer = viewer;
		this.column = cIndex;

		// Create the correct editor based on the column index
		switch (column) {
		case 1:
			editor = new TextCellEditor(((TableViewer) viewer).getTable());
			break;
		default:
			editor = null;
			break;
		}

	}

	@Override
	protected boolean canEdit(Object element) {
		switch (column) {
		case 1:
			return true;
		default:
			return false;
		}
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return editor;
	}

	@Override
	protected Object getValue(Object element) {
		if (!(element instanceof Property))
			return null;
		Property property = (Property) element;

		switch (column) {
		case 1:
			return property.getValue();

		default:
			return null;
		}
	}

	@Override
	protected void setValue(Object element, Object value) {
		Object input = viewer.getInput();
		if (input == null || !(input instanceof FragmentDescription))
			return;

		if (!(element instanceof Property))
			return;
		Property property = (Property) element;

		boolean hasChanged = false;
		switch (this.column) {
		case 1:
			String oldValue = property.getValue();
			String newValue = String.valueOf(value);
			if (oldValue == null)
				if (newValue == null)
					hasChanged = false;
				else
					hasChanged = true;
			else
				hasChanged = !oldValue.equals(newValue);

			if (hasChanged)
				property.setValue(newValue);
			break;
		default:
			break;
		}
		if (hasChanged) {
			getViewer().update(element, null);
			DescriptionManager.save((FragmentDescription) input);
		}
	}

}
