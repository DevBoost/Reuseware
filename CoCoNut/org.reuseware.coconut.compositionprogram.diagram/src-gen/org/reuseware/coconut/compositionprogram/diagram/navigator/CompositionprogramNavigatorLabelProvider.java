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
package org.reuseware.coconut.compositionprogram.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.reuseware.coconut.compositionprogram.CompositionLink;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.CompositionLinkEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.CompositionProgramEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.FragmentInstanceEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.FragmentInstanceNameEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.PortInstanceEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.PortInstancePortNameEditPart;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramDiagramEditorPlugin;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramVisualIDRegistry;
import org.reuseware.coconut.compositionprogram.diagram.providers.CompositionprogramElementTypes;
import org.reuseware.coconut.compositionprogram.diagram.providers.CompositionprogramParserProvider;

/**
 * @generated
 */
public class CompositionprogramNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		CompositionprogramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		CompositionprogramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CompositionprogramNavigatorItem
				&& !isOwnView(((CompositionprogramNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof CompositionprogramNavigatorGroup) {
			CompositionprogramNavigatorGroup group = (CompositionprogramNavigatorGroup) element;
			return CompositionprogramDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof CompositionprogramNavigatorItem) {
			CompositionprogramNavigatorItem navigatorItem = (CompositionprogramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (CompositionprogramVisualIDRegistry.getVisualID(view)) {
		case CompositionLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://reuseware.org/coconut/compositionprogram?CompositionLink", CompositionprogramElementTypes.CompositionLink_4001); //$NON-NLS-1$
		case PortInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://reuseware.org/coconut/compositionprogram?PortInstance", CompositionprogramElementTypes.PortInstance_3001); //$NON-NLS-1$
		case CompositionProgramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://reuseware.org/coconut/compositionprogram?CompositionProgram", CompositionprogramElementTypes.CompositionProgram_1000); //$NON-NLS-1$
		case FragmentInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://reuseware.org/coconut/compositionprogram?FragmentInstance", CompositionprogramElementTypes.FragmentInstance_2001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CompositionprogramDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& CompositionprogramElementTypes
						.isKnownElementType(elementType)) {
			image = CompositionprogramElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof CompositionprogramNavigatorGroup) {
			CompositionprogramNavigatorGroup group = (CompositionprogramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CompositionprogramNavigatorItem) {
			CompositionprogramNavigatorItem navigatorItem = (CompositionprogramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CompositionprogramVisualIDRegistry.getVisualID(view)) {
		case CompositionLinkEditPart.VISUAL_ID:
			return getCompositionLink_4001Text(view);
		case PortInstanceEditPart.VISUAL_ID:
			return getPortInstance_3001Text(view);
		case CompositionProgramEditPart.VISUAL_ID:
			return getCompositionProgram_1000Text(view);
		case FragmentInstanceEditPart.VISUAL_ID:
			return getFragmentInstance_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCompositionProgram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPortInstance_3001Text(View view) {
		IParser parser = CompositionprogramParserProvider.getParser(
				CompositionprogramElementTypes.PortInstance_3001, view
						.getElement() != null ? view.getElement() : view,
				CompositionprogramVisualIDRegistry
						.getType(PortInstancePortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CompositionprogramDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFragmentInstance_2001Text(View view) {
		IParser parser = CompositionprogramParserProvider.getParser(
				CompositionprogramElementTypes.FragmentInstance_2001, view
						.getElement() != null ? view.getElement() : view,
				CompositionprogramVisualIDRegistry
						.getType(FragmentInstanceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CompositionprogramDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositionLink_4001Text(View view) {
		CompositionLink domainModelElement = (CompositionLink) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isContributes());
		} else {
			CompositionprogramDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CompositionProgramEditPart.MODEL_ID
				.equals(CompositionprogramVisualIDRegistry.getModelID(view));
	}

}
