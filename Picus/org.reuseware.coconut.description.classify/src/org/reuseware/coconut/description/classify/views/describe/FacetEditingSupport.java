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

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.classify.DescriptionManager;
import org.reuseware.coconut.description.classify.FacetManager;
import org.reuseware.coconut.description.classify.views.facet.FacetViewManager;

public class FacetEditingSupport extends EditingSupport {
	private FragmentDescription context;
	private CellEditor editor;
	private int column;
	private Set<FacetType> registeredFacetTypes;
	private String[] typeStrings = {};
	private FacetViewManager fvManager;

	public FacetEditingSupport(ColumnViewer viewer, int cIndex, FacetViewManager fvManager) {
		super(viewer);
		this.column = cIndex;
		this.fvManager = fvManager;

		// define the list of available, registered FacetTypes
		registeredFacetTypes = new HashSet<FacetType>();
		registeredFacetTypes.addAll(FacetManager.getRegisteredTypes());

		// remove all type which are already in the FragmentDescription
		context = (FragmentDescription) viewer.getInput();
		List<FacetType> alreadyUsedTypes = new LinkedList<FacetType>();
		if (context != null)
			if (context.getFacets() != null)
				for (Facet facet : context.getFacets())
					alreadyUsedTypes.add(facet.getType());

		registeredFacetTypes.removeAll(alreadyUsedTypes);

		// build String-Array to be shown in drop down list of type column
		typeStrings = new String[registeredFacetTypes.size() + 1];
		int i = 0;
		typeStrings[0] = DescriptionManager.DUMMY_FACET_TYPE;
		for (FacetType type : registeredFacetTypes) {
			i++;
			typeStrings[i] = type.getName();
		}

		// Create the correct editor based on the column index
		switch (column) {
		case 0:
			editor = new ComboBoxCellEditor(((TableViewer) viewer).getTable(),
					typeStrings);
			break;
		default:
			editor = null;
			break;
		}
	}

	@Override
	protected boolean canEdit(Object element) {
		Facet facet = (Facet) element;
		if (!DescriptionManager.isDummyFacet(facet))
			return false;

		switch (column) {
		case 0:
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
		if (!(element instanceof Facet))
			return null;
		Facet facet = (Facet) element;

		switch (this.column) {
		case 0:
			String type = facet.getTypeID().get(facet.getTypeID().size() - 1);
			for (int i = 0; i < typeStrings.length; i++) {
				if (typeStrings[i].equals(type))
					return i;
			}
			return 0;

		case 1:
			System.err.println("ERROR! This Coloum should not be editable!");

		default:
			return null;
		}
	}

	@Override
	protected void setValue(Object element, Object value) {
		if (!(element instanceof Facet))
			return;
		int index = (Integer) value;

		// wrong usage of drop down list
		if (index <= 0)
			return;

		index--;
		final FacetType selectedType = (FacetType) registeredFacetTypes
				.toArray()[index];
		fvManager.addFacet(selectedType, context);
//		getViewer().update(element, null);
	}
}
