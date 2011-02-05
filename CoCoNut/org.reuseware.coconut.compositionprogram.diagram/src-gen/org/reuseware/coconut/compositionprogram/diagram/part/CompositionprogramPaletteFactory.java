/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.compositionprogram.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.reuseware.coconut.compositionprogram.diagram.providers.CompositionprogramElementTypes;

/**
 * @generated
 */
public class CompositionprogramPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createFragmentComposition1Group());
	}

	/**
	 * Creates "FragmentComposition" palette tool group
	 * @generated
	 */
	private PaletteContainer createFragmentComposition1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.FragmentComposition1Group_title);
		paletteContainer.setId("createFragmentComposition1Group"); //$NON-NLS-1$
		paletteContainer.add(createLink1CreationTool());
		paletteContainer.add(new PaletteSeparator());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Link1CreationTool_title,
				Messages.Link1CreationTool_desc,
				Collections
						.singletonList(CompositionprogramElementTypes.CompositionLink_4001));
		entry.setId("createLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CompositionprogramElementTypes
				.getImageDescriptor(CompositionprogramElementTypes.CompositionLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
