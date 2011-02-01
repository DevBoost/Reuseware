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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
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
import org.reuseware.application.taipan.gmf.editor.edit.parts.PortRegisterEditPart;
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
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipRouteEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipSmallCargoEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.SmallItemsEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.UnreliableRouteDescEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.UnreliableRouteEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.UnreliableRouteRelbEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.WarshipEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.WarshipLargeCargoEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.WarshipNameEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.WarshipSmallCargoEditPart;
import org.reuseware.application.taipan.gmf.editor.part.TaiPanVisualIDRegistry;
import org.reuseware.application.taipan.gmf.editor.view.factories.AquatoryViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.BesiegePortOrderViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.CargoExtensionViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.EmptyBoxViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.EscortShipsOrderViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.ItemHookViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.LargeItemArticleViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.LargeItemViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.LargeItemWeightViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.PortLocationViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.PortPortNameViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.PortRegisterViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.PortSlotViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.PortViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.ReliableRouteDescViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.ReliableRouteRelbViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.ReliableRouteViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.RoutePortNameViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.RouteSlotViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.ShipDestinationMarkerViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.ShipDestinationViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.ShipLargeCargoViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.ShipNameViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.ShipRouteViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.ShipSmallCargoViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.ShipViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.SmallItemsViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.UnreliableRouteDescViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.UnreliableRouteRelbViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.UnreliableRouteViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.WarshipLargeCargoViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.WarshipNameViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.WarshipSmallCargoViewFactory;
import org.reuseware.application.taipan.gmf.editor.view.factories.WarshipViewFactory;

/**
 * @generated
 */
public class TaiPanViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (AquatoryEditPart.MODEL_ID.equals(diagramKind)
				&& TaiPanVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return AquatoryViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = TaiPanVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = TaiPanVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!TaiPanElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != TaiPanVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!AquatoryEditPart.MODEL_ID.equals(TaiPanVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case PortEditPart.VISUAL_ID:
				case ShipEditPart.VISUAL_ID:
				case WarshipEditPart.VISUAL_ID:
				case PortSlotEditPart.VISUAL_ID:
				case RouteSlotEditPart.VISUAL_ID:
				case SmallItemsEditPart.VISUAL_ID:
				case LargeItemEditPart.VISUAL_ID:
				case EmptyBoxEditPart.VISUAL_ID:
				case ItemHookEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != TaiPanVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case PortLocationEditPart.VISUAL_ID:
					if (PortEditPart.VISUAL_ID != TaiPanVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ShipNameEditPart.VISUAL_ID:
				case ShipSmallCargoEditPart.VISUAL_ID:
				case ShipLargeCargoEditPart.VISUAL_ID:
					if (ShipEditPart.VISUAL_ID != TaiPanVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case WarshipNameEditPart.VISUAL_ID:
				case WarshipSmallCargoEditPart.VISUAL_ID:
				case WarshipLargeCargoEditPart.VISUAL_ID:
					if (WarshipEditPart.VISUAL_ID != TaiPanVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PortPortNameEditPart.VISUAL_ID:
					if (PortSlotEditPart.VISUAL_ID != TaiPanVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case RoutePortNameEditPart.VISUAL_ID:
					if (RouteSlotEditPart.VISUAL_ID != TaiPanVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case LargeItemArticleEditPart.VISUAL_ID:
				case LargeItemWeightEditPart.VISUAL_ID:
					if (LargeItemEditPart.VISUAL_ID != TaiPanVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CargoExtensionEditPart.VISUAL_ID:
					if (ItemHookEditPart.VISUAL_ID != TaiPanVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ShipDestinationMarkerEditPart.VISUAL_ID:
					if (ShipDestinationEditPart.VISUAL_ID != TaiPanVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ReliableRouteDescEditPart.VISUAL_ID:
				case ReliableRouteRelbEditPart.VISUAL_ID:
					if (ReliableRouteEditPart.VISUAL_ID != TaiPanVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case UnreliableRouteDescEditPart.VISUAL_ID:
				case UnreliableRouteRelbEditPart.VISUAL_ID:
					if (UnreliableRouteEditPart.VISUAL_ID != TaiPanVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !TaiPanVisualIDRegistry.canCreateNode(containerView,
						visualID)) {
			return null;
		}
		switch (visualID) {
		case PortEditPart.VISUAL_ID:
			return PortViewFactory.class;
		case PortLocationEditPart.VISUAL_ID:
			return PortLocationViewFactory.class;
		case ShipEditPart.VISUAL_ID:
			return ShipViewFactory.class;
		case ShipNameEditPart.VISUAL_ID:
			return ShipNameViewFactory.class;
		case WarshipEditPart.VISUAL_ID:
			return WarshipViewFactory.class;
		case WarshipNameEditPart.VISUAL_ID:
			return WarshipNameViewFactory.class;
		case PortSlotEditPart.VISUAL_ID:
			return PortSlotViewFactory.class;
		case PortPortNameEditPart.VISUAL_ID:
			return PortPortNameViewFactory.class;
		case RouteSlotEditPart.VISUAL_ID:
			return RouteSlotViewFactory.class;
		case RoutePortNameEditPart.VISUAL_ID:
			return RoutePortNameViewFactory.class;
		case SmallItemsEditPart.VISUAL_ID:
			return SmallItemsViewFactory.class;
		case LargeItemEditPart.VISUAL_ID:
			return LargeItemViewFactory.class;
		case LargeItemArticleEditPart.VISUAL_ID:
			return LargeItemArticleViewFactory.class;
		case LargeItemWeightEditPart.VISUAL_ID:
			return LargeItemWeightViewFactory.class;
		case EmptyBoxEditPart.VISUAL_ID:
			return EmptyBoxViewFactory.class;
		case ItemHookEditPart.VISUAL_ID:
			return ItemHookViewFactory.class;
		case CargoExtensionEditPart.VISUAL_ID:
			return CargoExtensionViewFactory.class;
		case ShipSmallCargoEditPart.VISUAL_ID:
			return ShipSmallCargoViewFactory.class;
		case ShipLargeCargoEditPart.VISUAL_ID:
			return ShipLargeCargoViewFactory.class;
		case WarshipSmallCargoEditPart.VISUAL_ID:
			return WarshipSmallCargoViewFactory.class;
		case WarshipLargeCargoEditPart.VISUAL_ID:
			return WarshipLargeCargoViewFactory.class;
		case ShipDestinationMarkerEditPart.VISUAL_ID:
			return ShipDestinationMarkerViewFactory.class;
		case ReliableRouteDescEditPart.VISUAL_ID:
			return ReliableRouteDescViewFactory.class;
		case ReliableRouteRelbEditPart.VISUAL_ID:
			return ReliableRouteRelbViewFactory.class;
		case UnreliableRouteDescEditPart.VISUAL_ID:
			return UnreliableRouteDescViewFactory.class;
		case UnreliableRouteRelbEditPart.VISUAL_ID:
			return UnreliableRouteRelbViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!TaiPanElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = TaiPanVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != TaiPanVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case ShipDestinationEditPart.VISUAL_ID:
			return ShipDestinationViewFactory.class;
		case ReliableRouteEditPart.VISUAL_ID:
			return ReliableRouteViewFactory.class;
		case UnreliableRouteEditPart.VISUAL_ID:
			return UnreliableRouteViewFactory.class;
		case ShipRouteEditPart.VISUAL_ID:
			return ShipRouteViewFactory.class;
		case BesiegePortOrderEditPart.VISUAL_ID:
			return BesiegePortOrderViewFactory.class;
		case EscortShipsOrderEditPart.VISUAL_ID:
			return EscortShipsOrderViewFactory.class;
		case PortRegisterEditPart.VISUAL_ID:
			return PortRegisterViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
