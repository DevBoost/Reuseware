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
package org.reuseware.coconut.compositionprogram.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.coconut.compositionprogram.CompositionLink;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.CompositionprogramPackage;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PortInstance;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.CompositionLinkEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.CompositionProgramEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.FragmentInstanceEditPart;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.PortInstanceEditPart;
import org.reuseware.coconut.compositionprogram.diagram.providers.CompositionprogramElementTypes;

/**
 * @generated
 */
public class CompositionprogramDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<CompositionprogramNodeDescriptor> getSemanticChildren(
			View view) {
		switch (CompositionprogramVisualIDRegistry.getVisualID(view)) {
		case CompositionProgramEditPart.VISUAL_ID:
			return getCompositionProgram_1000SemanticChildren(view);
		case FragmentInstanceEditPart.VISUAL_ID:
			return getFragmentInstance_2001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramNodeDescriptor> getCompositionProgram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CompositionProgram modelElement = (CompositionProgram) view
				.getElement();
		LinkedList<CompositionprogramNodeDescriptor> result = new LinkedList<CompositionprogramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFragmentInstances().iterator(); it
				.hasNext();) {
			FragmentInstance childElement = (FragmentInstance) it.next();
			int visualID = CompositionprogramVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == FragmentInstanceEditPart.VISUAL_ID) {
				result.add(new CompositionprogramNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramNodeDescriptor> getFragmentInstance_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FragmentInstance modelElement = (FragmentInstance) view.getElement();
		LinkedList<CompositionprogramNodeDescriptor> result = new LinkedList<CompositionprogramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPortInstances().iterator(); it
				.hasNext();) {
			PortInstance childElement = (PortInstance) it.next();
			int visualID = CompositionprogramVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == PortInstanceEditPart.VISUAL_ID) {
				result.add(new CompositionprogramNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getContainedLinks(
			View view) {
		switch (CompositionprogramVisualIDRegistry.getVisualID(view)) {
		case CompositionProgramEditPart.VISUAL_ID:
			return getCompositionProgram_1000ContainedLinks(view);
		case FragmentInstanceEditPart.VISUAL_ID:
			return getFragmentInstance_2001ContainedLinks(view);
		case PortInstanceEditPart.VISUAL_ID:
			return getPortInstance_3001ContainedLinks(view);
		case CompositionLinkEditPart.VISUAL_ID:
			return getCompositionLink_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getIncomingLinks(
			View view) {
		switch (CompositionprogramVisualIDRegistry.getVisualID(view)) {
		case FragmentInstanceEditPart.VISUAL_ID:
			return getFragmentInstance_2001IncomingLinks(view);
		case PortInstanceEditPart.VISUAL_ID:
			return getPortInstance_3001IncomingLinks(view);
		case CompositionLinkEditPart.VISUAL_ID:
			return getCompositionLink_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (CompositionprogramVisualIDRegistry.getVisualID(view)) {
		case FragmentInstanceEditPart.VISUAL_ID:
			return getFragmentInstance_2001OutgoingLinks(view);
		case PortInstanceEditPart.VISUAL_ID:
			return getPortInstance_3001OutgoingLinks(view);
		case CompositionLinkEditPart.VISUAL_ID:
			return getCompositionLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getCompositionProgram_1000ContainedLinks(
			View view) {
		CompositionProgram modelElement = (CompositionProgram) view
				.getElement();
		LinkedList<CompositionprogramLinkDescriptor> result = new LinkedList<CompositionprogramLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_CompositionLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getFragmentInstance_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getPortInstance_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getCompositionLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getFragmentInstance_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getPortInstance_3001IncomingLinks(
			View view) {
		PortInstance modelElement = (PortInstance) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CompositionprogramLinkDescriptor> result = new LinkedList<CompositionprogramLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_CompositionLink_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getCompositionLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getFragmentInstance_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getPortInstance_3001OutgoingLinks(
			View view) {
		PortInstance modelElement = (PortInstance) view.getElement();
		LinkedList<CompositionprogramLinkDescriptor> result = new LinkedList<CompositionprogramLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_CompositionLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CompositionprogramLinkDescriptor> getCompositionLink_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionprogramLinkDescriptor> getContainedTypeModelFacetLinks_CompositionLink_4001(
			CompositionProgram container) {
		LinkedList<CompositionprogramLinkDescriptor> result = new LinkedList<CompositionprogramLinkDescriptor>();
		for (Iterator<?> links = container.getCompositionLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CompositionLink) {
				continue;
			}
			CompositionLink link = (CompositionLink) linkObject;
			if (CompositionLinkEditPart.VISUAL_ID != CompositionprogramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PortInstance dst = link.getTarget();
			PortInstance src = link.getSource();
			result.add(new CompositionprogramLinkDescriptor(src, dst, link,
					CompositionprogramElementTypes.CompositionLink_4001,
					CompositionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionprogramLinkDescriptor> getIncomingTypeModelFacetLinks_CompositionLink_4001(
			PortInstance target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CompositionprogramLinkDescriptor> result = new LinkedList<CompositionprogramLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CompositionprogramPackage.eINSTANCE
					.getCompositionLink_Target()
					|| false == setting.getEObject() instanceof CompositionLink) {
				continue;
			}
			CompositionLink link = (CompositionLink) setting.getEObject();
			if (CompositionLinkEditPart.VISUAL_ID != CompositionprogramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PortInstance src = link.getSource();
			result.add(new CompositionprogramLinkDescriptor(src, target, link,
					CompositionprogramElementTypes.CompositionLink_4001,
					CompositionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CompositionprogramLinkDescriptor> getOutgoingTypeModelFacetLinks_CompositionLink_4001(
			PortInstance source) {
		CompositionProgram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CompositionProgram) {
				container = (CompositionProgram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CompositionprogramLinkDescriptor> result = new LinkedList<CompositionprogramLinkDescriptor>();
		for (Iterator<?> links = container.getCompositionLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CompositionLink) {
				continue;
			}
			CompositionLink link = (CompositionLink) linkObject;
			if (CompositionLinkEditPart.VISUAL_ID != CompositionprogramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PortInstance dst = link.getTarget();
			PortInstance src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CompositionprogramLinkDescriptor(src, dst, link,
					CompositionprogramElementTypes.CompositionLink_4001,
					CompositionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

}
