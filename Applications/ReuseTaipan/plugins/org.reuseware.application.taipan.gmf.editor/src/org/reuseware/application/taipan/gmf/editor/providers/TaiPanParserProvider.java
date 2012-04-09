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
package org.reuseware.application.taipan.gmf.editor.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.application.taipan.TaiPanPackage;
import org.reuseware.application.taipan.gmf.editor.edit.parts.CargoExtensionEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.LargeItemArticleEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.LargeItemWeightEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.PortLocationEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.PortPortNameEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ReliableRouteDescEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ReliableRouteRelbEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.RoutePortNameEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipNameEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.SmallItemsEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.UnreliableRouteDescEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.UnreliableRouteRelbEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.WarshipNameEditPart;
import org.reuseware.application.taipan.gmf.editor.parsers.CompositeParser;
import org.reuseware.application.taipan.gmf.editor.parsers.MessageFormatParser;
import org.reuseware.application.taipan.gmf.editor.parsers.NativeParser;
import org.reuseware.application.taipan.gmf.editor.parsers.PrintfParser;
import org.reuseware.application.taipan.gmf.editor.parsers.RegexpParser;
import org.reuseware.application.taipan.gmf.editor.part.TaiPanVisualIDRegistry;

/**
 * @generated
 */
public class TaiPanParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser portLocation_5001Parser;

	/**
	 * @generated
	 */
	private IParser getPortLocation_5001Parser() {
		if (portLocation_5001Parser == null) {
			portLocation_5001Parser = createPortLocation_5001Parser();
		}
		return portLocation_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPortLocation_5001Parser() {
		EAttribute[] features = new EAttribute[] { TaiPanPackage.eINSTANCE
				.getPort_Location(), };
		NativeParser parser = new NativeParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser shipName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getShipName_5004Parser() {
		if (shipName_5004Parser == null) {
			shipName_5004Parser = createShipName_5004Parser();
		}
		return shipName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createShipName_5004Parser() {
		EAttribute[] features = new EAttribute[] { TaiPanPackage.eINSTANCE
				.getShip_Name(), };
		NativeParser parser = new NativeParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser warshipName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getWarshipName_5005Parser() {
		if (warshipName_5005Parser == null) {
			warshipName_5005Parser = createWarshipName_5005Parser();
		}
		return warshipName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createWarshipName_5005Parser() {
		EAttribute[] features = new EAttribute[] { TaiPanPackage.eINSTANCE
				.getShip_Name(), };
		NativeParser parser = new NativeParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser portSlotPortName_5081Parser;

	/**
	 * @generated
	 */
	private IParser getPortSlotPortName_5081Parser() {
		if (portSlotPortName_5081Parser == null) {
			portSlotPortName_5081Parser = createPortSlotPortName_5081Parser();
		}
		return portSlotPortName_5081Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPortSlotPortName_5081Parser() {
		EAttribute[] features = new EAttribute[] { TaiPanPackage.eINSTANCE
				.getPortSlot_PortName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser routeSlotPortName_5082Parser;

	/**
	 * @generated
	 */
	private IParser getRouteSlotPortName_5082Parser() {
		if (routeSlotPortName_5082Parser == null) {
			routeSlotPortName_5082Parser = createRouteSlotPortName_5082Parser();
		}
		return routeSlotPortName_5082Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRouteSlotPortName_5082Parser() {
		EAttribute[] features = new EAttribute[] { TaiPanPackage.eINSTANCE
				.getRouteSlot_PortName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser smallItems_3001Parser;

	/**
	 * @generated
	 */
	private IParser getSmallItems_3001Parser() {
		if (smallItems_3001Parser == null) {
			smallItems_3001Parser = createSmallItems_3001Parser();
		}
		return smallItems_3001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSmallItems_3001Parser() {
		EAttribute[] features = new EAttribute[] {
				TaiPanPackage.eINSTANCE.getItem_Article(),
				TaiPanPackage.eINSTANCE.getSmallItems_Quantity(), };
		PrintfParser reader = new PrintfParser(features);
		reader.setViewPattern("- %1$s [%2$d]");
		reader.setEditorPattern("%1$s:%2$s");
		RegexpParser writer = new RegexpParser(features);
		writer.setEditPattern(":");
		return new CompositeParser(reader, writer);
	}

	/**
	 * @generated
	 */
	private IParser largeItemArticle_5002Parser;

	/**
	 * @generated
	 */
	private IParser getLargeItemArticle_5002Parser() {
		if (largeItemArticle_5002Parser == null) {
			largeItemArticle_5002Parser = createLargeItemArticle_5002Parser();
		}
		return largeItemArticle_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLargeItemArticle_5002Parser() {
		EAttribute[] features = new EAttribute[] { TaiPanPackage.eINSTANCE
				.getItem_Article(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser largeItemWeight_5003Parser;

	/**
	 * @generated
	 */
	private IParser getLargeItemWeight_5003Parser() {
		if (largeItemWeight_5003Parser == null) {
			largeItemWeight_5003Parser = createLargeItemWeight_5003Parser();
		}
		return largeItemWeight_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLargeItemWeight_5003Parser() {
		EAttribute[] features = new EAttribute[] { TaiPanPackage.eINSTANCE
				.getLargeItem_Weight(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser largeItemHookPortName_5080Parser;

	/**
	 * @generated
	 */
	private IParser getLargeItemHookPortName_5080Parser() {
		if (largeItemHookPortName_5080Parser == null) {
			largeItemHookPortName_5080Parser = createLargeItemHookPortName_5080Parser();
		}
		return largeItemHookPortName_5080Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLargeItemHookPortName_5080Parser() {
		EAttribute[] features = new EAttribute[] { TaiPanPackage.eINSTANCE
				.getLargeItemHook_PortName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser routeDescription_6002Parser;

	/**
	 * @generated
	 */
	private IParser getRouteDescription_6002Parser() {
		if (routeDescription_6002Parser == null) {
			routeDescription_6002Parser = createRouteDescription_6002Parser();
		}
		return routeDescription_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRouteDescription_6002Parser() {
		EAttribute[] features = new EAttribute[] { TaiPanPackage.eINSTANCE
				.getRoute_Description(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("route : {0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser routeReliability_6003Parser;

	/**
	 * @generated
	 */
	private IParser getRouteReliability_6003Parser() {
		if (routeReliability_6003Parser == null) {
			routeReliability_6003Parser = createRouteReliability_6003Parser();
		}
		return routeReliability_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRouteReliability_6003Parser() {
		EAttribute[] features = new EAttribute[] { TaiPanPackage.eINSTANCE
				.getRoute_Reliability(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("reliability : {0,number,percent}");
		parser.setEditorPattern("{0,number,percent}");
		parser.setEditPattern("{0,number,percent}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser routeDescription_6004Parser;

	/**
	 * @generated
	 */
	private IParser getRouteDescription_6004Parser() {
		if (routeDescription_6004Parser == null) {
			routeDescription_6004Parser = createRouteDescription_6004Parser();
		}
		return routeDescription_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRouteDescription_6004Parser() {
		EAttribute[] features = new EAttribute[] { TaiPanPackage.eINSTANCE
				.getRoute_Description(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("route : {0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser routeReliability_6005Parser;

	/**
	 * @generated
	 */
	private IParser getRouteReliability_6005Parser() {
		if (routeReliability_6005Parser == null) {
			routeReliability_6005Parser = createRouteReliability_6005Parser();
		}
		return routeReliability_6005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createRouteReliability_6005Parser() {
		EAttribute[] features = new EAttribute[] { TaiPanPackage.eINSTANCE
				.getRoute_Reliability(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("reliability : {0,number,percent}");
		parser.setEditorPattern("{0,number,percent}");
		parser.setEditPattern("{0,number,percent}");
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PortLocationEditPart.VISUAL_ID:
			return getPortLocation_5001Parser();
		case ShipNameEditPart.VISUAL_ID:
			return getShipName_5004Parser();
		case WarshipNameEditPart.VISUAL_ID:
			return getWarshipName_5005Parser();
		case PortPortNameEditPart.VISUAL_ID:
			return getPortSlotPortName_5081Parser();
		case RoutePortNameEditPart.VISUAL_ID:
			return getRouteSlotPortName_5082Parser();
		case SmallItemsEditPart.VISUAL_ID:
			return getSmallItems_3001Parser();
		case LargeItemArticleEditPart.VISUAL_ID:
			return getLargeItemArticle_5002Parser();
		case LargeItemWeightEditPart.VISUAL_ID:
			return getLargeItemWeight_5003Parser();
		case CargoExtensionEditPart.VISUAL_ID:
			return getLargeItemHookPortName_5080Parser();
		case ReliableRouteDescEditPart.VISUAL_ID:
			return getRouteDescription_6002Parser();
		case ReliableRouteRelbEditPart.VISUAL_ID:
			return getRouteReliability_6003Parser();
		case UnreliableRouteDescEditPart.VISUAL_ID:
			return getRouteDescription_6004Parser();
		case UnreliableRouteRelbEditPart.VISUAL_ID:
			return getRouteReliability_6005Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(TaiPanVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TaiPanVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TaiPanElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
