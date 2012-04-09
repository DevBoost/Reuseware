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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.reuseware.application.taipan.gmf.editor.edit.parts.AquatoryEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.PortEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.ShipLargeCargoEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.WarshipEditPart;
import org.reuseware.application.taipan.gmf.editor.edit.parts.WarshipLargeCargoEditPart;
import org.reuseware.application.taipan.gmf.editor.part.Messages;
import org.reuseware.application.taipan.gmf.editor.part.TaiPanDiagramEditorPlugin;

/**
 * @generated
 */
public class TaiPanModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ShipEditPart) {
			List types = new ArrayList();
			types.add(TaiPanElementTypes.SmallItems_3001);
			return types;
		}
		if (editPart instanceof WarshipEditPart) {
			List types = new ArrayList();
			types.add(TaiPanElementTypes.SmallItems_3001);
			return types;
		}
		if (editPart instanceof ShipLargeCargoEditPart) {
			List types = new ArrayList();
			types.add(TaiPanElementTypes.LargeItem_3002);
			types.add(TaiPanElementTypes.EmptyBox_3003);
			types.add(TaiPanElementTypes.LargeItemHook_3004);
			return types;
		}
		if (editPart instanceof WarshipLargeCargoEditPart) {
			List types = new ArrayList();
			types.add(TaiPanElementTypes.LargeItem_3002);
			types.add(TaiPanElementTypes.EmptyBox_3003);
			return types;
		}
		if (editPart instanceof AquatoryEditPart) {
			List types = new ArrayList();
			types.add(TaiPanElementTypes.Port_2001);
			types.add(TaiPanElementTypes.Ship_2002);
			types.add(TaiPanElementTypes.Warship_2003);
			types.add(TaiPanElementTypes.PortSlot_2004);
			types.add(TaiPanElementTypes.RouteSlot_2005);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof PortEditPart) {
			List types = new ArrayList();
			types.add(TaiPanElementTypes.PortRegister_4007);
			return types;
		}
		if (sourceEditPart instanceof ShipEditPart) {
			List types = new ArrayList();
			types.add(TaiPanElementTypes.ShipDestination_4001);
			types.add(TaiPanElementTypes.ShipRoute_4004);
			return types;
		}
		if (sourceEditPart instanceof WarshipEditPart) {
			List types = new ArrayList();
			types.add(TaiPanElementTypes.BesiegePortOrder_4005);
			types.add(TaiPanElementTypes.EscortShipsOrder_4006);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ShipEditPart) {
			List types = new ArrayList();
			types.add(TaiPanElementTypes.EscortShipsOrder_4006);
			types.add(TaiPanElementTypes.PortRegister_4007);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof PortEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof ShipEditPart) {
				types.add(TaiPanElementTypes.PortRegister_4007);
			}
			return types;
		}
		if (sourceEditPart instanceof ShipEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof WarshipEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof ShipEditPart) {
				types.add(TaiPanElementTypes.EscortShipsOrder_4006);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ShipEditPart) {
			List types = new ArrayList();
			if (relationshipType == TaiPanElementTypes.EscortShipsOrder_4006) {
				types.add(TaiPanElementTypes.Warship_2003);
			}
			if (relationshipType == TaiPanElementTypes.PortRegister_4007) {
				types.add(TaiPanElementTypes.Port_2001);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof PortEditPart) {
			List types = new ArrayList();
			if (relationshipType == TaiPanElementTypes.PortRegister_4007) {
				types.add(TaiPanElementTypes.Ship_2002);
			}
			return types;
		}
		if (sourceEditPart instanceof ShipEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof WarshipEditPart) {
			List types = new ArrayList();
			if (relationshipType == TaiPanElementTypes.EscortShipsOrder_4006) {
				types.add(TaiPanElementTypes.Ship_2002);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				TaiPanDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.TaiPanModelingAssistantProviderMessage);
		dialog.setTitle(Messages.TaiPanModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
