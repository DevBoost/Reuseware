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
package org.reuseware.application.taipan.gmf.editor.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.application.taipan.Aquatory;
import org.reuseware.application.taipan.Route;
import org.reuseware.application.taipan.TaiPanPackage;
import org.reuseware.application.taipan.gmf.editor.edit.parts.AquatoryEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.BesiegePortOrderEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.CargoExtensionEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.EmptyBoxEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.EscortShipsOrderEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ItemHookEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.LargeItemArticleEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.LargeItemEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.LargeItemWeightEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.PortEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.PortLocationEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.PortPortNameEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.PortSlotEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ReliableRouteDescEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ReliableRouteEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ReliableRouteRelbEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.RoutePortNameEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.RouteSlotEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipDestinationEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipDestinationMarkerEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipLargeCargoEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipNameEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipSmallCargoEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.SmallItemsEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.UnreliableRouteDescEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.UnreliableRouteEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.UnreliableRouteRelbEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.WarshipEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.WarshipLargeCargoEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.WarshipNameEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.WarshipSmallCargoEditPart;
import org.reuseware.application.taipan.gmf.editor.expressions.TaiPanAbstractExpression;
import org.reuseware.application.taipan.gmf.editor.expressions.TaiPanOCLFactory;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TaiPanVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.reuseware.application.taipan.gmf.editor/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static TaiPanAbstractExpression Route_4002_Constraint;
	/**
	 * @generated
	 */
	private static TaiPanAbstractExpression Route_4003_Constraint;

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (AquatoryEditPart.MODEL_ID.equals(view.getType())) {
				return AquatoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.reuseware.application.taipan.gmf.editor.part.TaiPanVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				TaiPanDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TaiPanPackage.eINSTANCE.getAquatory().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Aquatory) domainElement)) {
			return AquatoryEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.reuseware.application.taipan.gmf.editor.part.TaiPanVisualIDRegistry
				.getModelID(containerView);
		if (!AquatoryEditPart.MODEL_ID.equals(containerModelID)
				&& !"TaiPan".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (AquatoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.reuseware.application.taipan.gmf.editor.part.TaiPanVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = AquatoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ShipSmallCargoEditPart.VISUAL_ID:
			if (TaiPanPackage.eINSTANCE.getSmallItems().isSuperTypeOf(
					domainElement.eClass())) {
				return SmallItemsEditPart.VISUAL_ID;
			}
			break;
		case ShipLargeCargoEditPart.VISUAL_ID:
			if (TaiPanPackage.eINSTANCE.getLargeItem().isSuperTypeOf(
					domainElement.eClass())) {
				return LargeItemEditPart.VISUAL_ID;
			}
			if (TaiPanPackage.eINSTANCE.getEmptyBox().isSuperTypeOf(
					domainElement.eClass())) {
				return EmptyBoxEditPart.VISUAL_ID;
			}
			if (TaiPanPackage.eINSTANCE.getLargeItemHook().isSuperTypeOf(
					domainElement.eClass())) {
				return ItemHookEditPart.VISUAL_ID;
			}
			break;
		case WarshipSmallCargoEditPart.VISUAL_ID:
			if (TaiPanPackage.eINSTANCE.getSmallItems().isSuperTypeOf(
					domainElement.eClass())) {
				return SmallItemsEditPart.VISUAL_ID;
			}
			break;
		case WarshipLargeCargoEditPart.VISUAL_ID:
			if (TaiPanPackage.eINSTANCE.getLargeItem().isSuperTypeOf(
					domainElement.eClass())) {
				return LargeItemEditPart.VISUAL_ID;
			}
			if (TaiPanPackage.eINSTANCE.getEmptyBox().isSuperTypeOf(
					domainElement.eClass())) {
				return EmptyBoxEditPart.VISUAL_ID;
			}
			break;
		case AquatoryEditPart.VISUAL_ID:
			if (TaiPanPackage.eINSTANCE.getPort().isSuperTypeOf(
					domainElement.eClass())) {
				return PortEditPart.VISUAL_ID;
			}
			if (TaiPanPackage.eINSTANCE.getShip().isSuperTypeOf(
					domainElement.eClass())) {
				return ShipEditPart.VISUAL_ID;
			}
			if (TaiPanPackage.eINSTANCE.getWarship().isSuperTypeOf(
					domainElement.eClass())) {
				return WarshipEditPart.VISUAL_ID;
			}
			if (TaiPanPackage.eINSTANCE.getPortSlot().isSuperTypeOf(
					domainElement.eClass())) {
				return PortSlotEditPart.VISUAL_ID;
			}
			if (TaiPanPackage.eINSTANCE.getRouteSlot().isSuperTypeOf(
					domainElement.eClass())) {
				return RouteSlotEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.reuseware.application.taipan.gmf.editor.part.TaiPanVisualIDRegistry
				.getModelID(containerView);
		if (!AquatoryEditPart.MODEL_ID.equals(containerModelID)
				&& !"TaiPan".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (AquatoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.reuseware.application.taipan.gmf.editor.part.TaiPanVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = AquatoryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PortEditPart.VISUAL_ID:
			if (PortLocationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ShipEditPart.VISUAL_ID:
			if (ShipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ShipSmallCargoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ShipLargeCargoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WarshipEditPart.VISUAL_ID:
			if (WarshipNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WarshipSmallCargoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WarshipLargeCargoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortSlotEditPart.VISUAL_ID:
			if (PortPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RouteSlotEditPart.VISUAL_ID:
			if (RoutePortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LargeItemEditPart.VISUAL_ID:
			if (LargeItemArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LargeItemWeightEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ItemHookEditPart.VISUAL_ID:
			if (CargoExtensionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ShipSmallCargoEditPart.VISUAL_ID:
			if (SmallItemsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ShipLargeCargoEditPart.VISUAL_ID:
			if (LargeItemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmptyBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ItemHookEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WarshipSmallCargoEditPart.VISUAL_ID:
			if (SmallItemsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WarshipLargeCargoEditPart.VISUAL_ID:
			if (LargeItemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmptyBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AquatoryEditPart.VISUAL_ID:
			if (PortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ShipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WarshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortSlotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RouteSlotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ShipDestinationEditPart.VISUAL_ID:
			if (ShipDestinationMarkerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReliableRouteEditPart.VISUAL_ID:
			if (ReliableRouteDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReliableRouteRelbEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnreliableRouteEditPart.VISUAL_ID:
			if (UnreliableRouteDescEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnreliableRouteRelbEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TaiPanPackage.eINSTANCE.getRoute().isSuperTypeOf(
				domainElement.eClass())
				&& isRoute_4002((Route) domainElement)) {
			return ReliableRouteEditPart.VISUAL_ID;
		}
		if (TaiPanPackage.eINSTANCE.getRoute().isSuperTypeOf(
				domainElement.eClass())
				&& isRoute_4003((Route) domainElement)) {
			return UnreliableRouteEditPart.VISUAL_ID;
		}
		if (TaiPanPackage.eINSTANCE.getBesiegePortOrder().isSuperTypeOf(
				domainElement.eClass())) {
			return BesiegePortOrderEditPart.VISUAL_ID;
		}
		if (TaiPanPackage.eINSTANCE.getEscortShipsOrder().isSuperTypeOf(
				domainElement.eClass())) {
			return EscortShipsOrderEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Aquatory element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isRoute_4002(Route domainElement) {
		if (Route_4002_Constraint == null) { // lazy initialization
			Route_4002_Constraint = TaiPanOCLFactory.getExpression(
					"reliability >= 0.5", TaiPanPackage.eINSTANCE.getRoute()); //$NON-NLS-1$
		}
		Object result = Route_4002_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isRoute_4003(Route domainElement) {
		if (Route_4003_Constraint == null) { // lazy initialization
			Route_4003_Constraint = TaiPanOCLFactory.getExpression(
					"reliability < 0.5", TaiPanPackage.eINSTANCE.getRoute()); //$NON-NLS-1$
		}
		Object result = Route_4003_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
