/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.reuseware.application.taipan.gmf.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.reuseware.application.taipan.gmf.editor.providers.TaiPanElementTypes;

/**
 * @generated
 */
public class TaiPanPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createAquatoryGroup());
	}

	/**
	 * Creates "Aquatory" palette tool group
	 * @generated
	 */
	private PaletteContainer createAquatoryGroup() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.AquatoryGroup_title);
		paletteContainer.add(createPortTool());
		paletteContainer.add(createShipTool());
		paletteContainer.add(createSmallItemsTool());
		paletteContainer.add(createLargeItemTool());
		paletteContainer.add(createEmptyBoxTool());
		paletteContainer.add(createItemHook6CreationTool());
		paletteContainer.add(createWarshipTool());
		paletteContainer.add(createPortSlot8CreationTool());
		paletteContainer.add(createRouteSlot9CreationTool());
		paletteContainer.add(createShipDestinationTool());
		paletteContainer.add(createReliableRouteTool());
		paletteContainer.add(createUnreliableRouteTool());
		paletteContainer.add(createShipRouteTool());
		paletteContainer.add(createBesiegePortOrderTool());
		paletteContainer.add(createEscortShipsOrderTool());
		paletteContainer.add(createPortRegister16CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPortTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.Port_2001);
		NodeToolEntry entry = new NodeToolEntry(Messages.PortTool_title,
				Messages.PortTool_desc, types);
		entry.setSmallIcon(TaiPanElementTypes
				.getImageDescriptor(TaiPanElementTypes.Port_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShipTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.Ship_2002);
		NodeToolEntry entry = new NodeToolEntry(Messages.ShipTool_title,
				Messages.ShipTool_desc, types);
		entry.setSmallIcon(TaiPanElementTypes
				.getImageDescriptor(TaiPanElementTypes.Ship_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSmallItemsTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.SmallItems_3001);
		NodeToolEntry entry = new NodeToolEntry(Messages.SmallItemsTool_title,
				Messages.SmallItemsTool_desc, types);
		entry.setSmallIcon(TaiPanElementTypes
				.getImageDescriptor(TaiPanElementTypes.SmallItems_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLargeItemTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.LargeItem_3002);
		NodeToolEntry entry = new NodeToolEntry(Messages.LargeItemTool_title,
				Messages.LargeItemTool_desc, types);
		entry.setSmallIcon(TaiPanElementTypes
				.getImageDescriptor(TaiPanElementTypes.LargeItem_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEmptyBoxTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.EmptyBox_3003);
		NodeToolEntry entry = new NodeToolEntry(Messages.EmptyBoxTool_title,
				Messages.EmptyBoxTool_desc, types);
		entry.setSmallIcon(TaiPanElementTypes
				.getImageDescriptor(TaiPanElementTypes.EmptyBox_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRouteSlot9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.RouteSlot_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RouteSlot9CreationTool_title, null, types);
		entry.setSmallIcon(TaiPanElementTypes
				.getImageDescriptor(TaiPanElementTypes.RouteSlot_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShipDestinationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.ShipDestination_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ShipDestinationTool_title,
				Messages.ShipDestinationTool_desc, types);
		entry
				.setSmallIcon(TaiPanDiagramEditorPlugin
						.findImageDescriptor("/org.reuseware.application.taipan.edit/icons/full/obj16/ShipDestination.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaiPanDiagramEditorPlugin
						.findImageDescriptor("/org.reuseware.application.taipan.edit/icons/full/obj16/ShipDestination.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReliableRouteTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.Route_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ReliableRouteTool_title,
				Messages.ReliableRouteTool_desc, types);
		entry
				.setSmallIcon(TaiPanDiagramEditorPlugin
						.findImageDescriptor("/org.reuseware.application.taipan.edit/icons/full/obj16/Route.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaiPanDiagramEditorPlugin
						.findImageDescriptor("/org.reuseware.application.taipan.edit/icons/full/obj16/Route.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnreliableRouteTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.Route_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.UnreliableRouteTool_title,
				Messages.UnreliableRouteTool_desc, types);
		entry
				.setSmallIcon(TaiPanDiagramEditorPlugin
						.findImageDescriptor("/org.reuseware.application.taipan.edit/icons/full/obj16/UnreliableRoute.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaiPanDiagramEditorPlugin
						.findImageDescriptor("/org.reuseware.application.taipan.edit/icons/full/obj16/UnreliableRoute.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShipRouteTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.ShipRoute_4004);
		LinkToolEntry entry = new LinkToolEntry(Messages.ShipRouteTool_title,
				Messages.ShipRouteTool_desc, types);
		entry
				.setSmallIcon(TaiPanDiagramEditorPlugin
						.findImageDescriptor("/org.reuseware.application.taipan.edit/icons/full/obj16/ShipRoute.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(TaiPanDiagramEditorPlugin
						.findImageDescriptor("/org.reuseware.application.taipan.edit/icons/full/obj16/ShipRoute.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBesiegePortOrderTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.BesiegePortOrder_4005);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.BesiegePortOrderTool_title,
				Messages.BesiegePortOrderTool_desc, types);
		entry.setSmallIcon(TaiPanElementTypes
				.getImageDescriptor(TaiPanElementTypes.BesiegePortOrder_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEscortShipsOrderTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.EscortShipsOrder_4006);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EscortShipsOrderTool_title,
				Messages.EscortShipsOrderTool_desc, types);
		entry.setSmallIcon(TaiPanElementTypes
				.getImageDescriptor(TaiPanElementTypes.EscortShipsOrder_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createItemHook6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.LargeItemHook_3004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ItemHook6CreationTool_title, null, types);
		entry.setSmallIcon(TaiPanElementTypes
				.getImageDescriptor(TaiPanElementTypes.LargeItemHook_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWarshipTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.Warship_2003);
		NodeToolEntry entry = new NodeToolEntry(Messages.WarshipTool_title,
				Messages.WarshipTool_desc, types);
		entry.setSmallIcon(TaiPanElementTypes
				.getImageDescriptor(TaiPanElementTypes.Warship_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPortSlot8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.PortSlot_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PortSlot8CreationTool_title, null, types);
		entry.setSmallIcon(TaiPanElementTypes
				.getImageDescriptor(TaiPanElementTypes.PortSlot_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPortRegister16CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TaiPanElementTypes.PortRegister_4007);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PortRegister16CreationTool_title, null, types);
		entry.setSmallIcon(TaiPanElementTypes
				.getImageDescriptor(TaiPanElementTypes.PortRegister_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
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
