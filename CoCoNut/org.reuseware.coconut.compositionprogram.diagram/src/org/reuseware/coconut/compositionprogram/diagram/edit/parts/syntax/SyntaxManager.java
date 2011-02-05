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
package org.reuseware.coconut.compositionprogram.diagram.edit.parts.syntax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PortInstance;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramDiagramEditorPlugin;
import org.reuseware.coconut.fragment.CompositionInterface;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.coconut.reuseextension.CompositionLanguageSyntaxSpecification;
import org.reuseware.coconut.reuseextension.FragmentRole2SyntaxBinding;
import org.reuseware.coconut.reuseextension.PortType2SyntaxBinding;
import org.reuseware.coconut.reuseextension.SyntaxDerivationRule;
import org.reuseware.coconut.reuseextension.evaluator.EvaluatorUtil;
import org.reuseware.coconut.reuseextensionactivator.Argument;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivator;

/**
 * Manager class to apply customized syntax to elements in a UCPI diagram
 * according to composition language syntax specification activated in
 * the context of the shown composition program.
 */
public final class SyntaxManager {

	/**
	 * The singleton instance of the syntax manager.
	 */
	public static final SyntaxManager INSTANCE = new SyntaxManager();
	
	private SyntaxManager() { }

    private NodeFigure createNodePlate(ElementSyntax elementSyntax, boolean parentVisible, IMapMode mapMode) {
    	if (elementSyntax.isVisible() && parentVisible) {
    		return new DefaultSizeNodeFigure(
        		mapMode.DPtoLP(elementSyntax.getWidth()), mapMode.DPtoLP(elementSyntax.getHeight()));
    	} else {
    		return new DefaultSizeNodeFigure(
            		mapMode.DPtoLP(0), mapMode.DPtoLP(0));   			
		}
    }
    
    protected IFigure createNodeShape(ElementSyntax elementSyntax, IMapMode mapMode) {
    	IFigure figure = null;
    	if (elementSyntax.isVisible()) {
    		figure = new IconNodeFigure();
    		figure.setSize(elementSyntax.getWidth(), elementSyntax.getHeight());
    		figure.setBorder(new MarginBorder(mapMode.DPtoLP(3),
    				mapMode.DPtoLP(3), mapMode.DPtoLP(3),
					mapMode.DPtoLP(3)));

    	} else {
    		//create a figure anyway such that the generated GMF code can behave as usual
    		figure = new RoundedRectangle();
    		figure.setVisible(false);
    	}
        return figure; 
    }
	
    /**
     * Creates a figure for a fragment instances by taking syntax specifications
     * in context into account.
     * 
     * @param fragmentInstance the fragment instances for which a figure is needed
     * @param mapMode to calculate with correct units
     * @return the figure
     */
	public NodeFigure createFragmentInstanceFigure(FragmentInstance fragmentInstance, IMapMode mapMode) {
		if (fragmentInstance == null || fragmentInstance.eIsProxy()) {
			return null;
		}
		for (ElementSyntax elementSyntax : findSyntax(fragmentInstance)) {
			NodeFigure figure = createNodePlate(elementSyntax, true, mapMode);
			figure.setLayoutManager(new StackLayout());

			IFigure shape = createNodeShape(elementSyntax, mapMode);
			figure.add(shape);
			
			return figure;
		}
		return null;
	}
	
	/**
	 * @param fragmentInstance the fragment instance to display
	 * @return the icon for the fragment instance 
	 *         (according to syntax specifications in context)
	 */
	public Image getIcon(FragmentInstance fragmentInstance) {
		String icon = null;
		String pluginID = null;
		URI basePath = null;
		
		for (ElementSyntax elementSyntax : findSyntax(fragmentInstance)) {
			Fragment fragment = fragmentInstance.getFragment();
			if (fragment != null && !fragment.getContents().isEmpty()) {
				icon = elementSyntax.getIcon();
				Resource resource = fragment.getContents().get(0).eResource();
				if (resource != null) {
					URIConverter uriConverter = resource.getResourceSet().getURIConverter();
					URI normalizedURI = uriConverter.normalize(resource.getURI());
					basePath = normalizedURI.trimSegments(fragment.getUFI().size());
					if (normalizedURI.isPlatformPlugin()) {
						pluginID = normalizedURI.segment(1);
					}
				}
			}
			//for now, only consider the first syntax found
			break;
		}
		
		ImageRegistry imageRegistry = CompositionprogramDiagramEditorPlugin.getInstance(
				).getImageRegistry();
		Image image = null;
		
		if (icon == null || "".equals(icon)) {
			List<String> ufi = fragmentInstance.getUFI();
			if (!fragmentInstance.getUFI().isEmpty()) {
				String fileName = ufi.get(ufi.size() - 1);
				image = imageRegistry.get(fileName);
				if (image == null) {
				      ImageDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getImageDescriptor(
				    		  fileName);
				      image = desc.createImage();
				      imageRegistry.put(fileName, image);
				}				
			}
		} else {
			image = imageRegistry.get(icon);
			if (image == null && basePath != null) {
				ImageDescriptor imageDescriptor = null;
				String fullIconPath = basePath.appendSegments(icon.split("/")).toPlatformString(true);
				if (pluginID != null) {
					//trim plugin ID
					fullIconPath = fullIconPath.substring(pluginID.length() + 1);
					imageDescriptor = CompositionprogramDiagramEditorPlugin.imageDescriptorFromPlugin(pluginID, fullIconPath);
					imageRegistry.put(icon,	imageDescriptor);
				} else {
					if (fullIconPath != null) {
						IResource iconFile = ResourcesPlugin.getWorkspace().getRoot().findMember(
								fullIconPath);
						if (iconFile != null) {
							String iconPath = iconFile.getRawLocation().toString();
							imageRegistry.put(
									icon,
									new Image(null, iconPath));
						}
					}
				}
	
				image = imageRegistry.get(icon);
			}
		}
		return image;
	}

	private List<ElementSyntax> findSyntax(EObject element) {
		if (element == null || element.eResource() == null || element.eResource().getResourceSet() == null) {
			return Collections.emptyList();
		}
		
		List<ElementSyntax> resultList = new ArrayList<ElementSyntax>();
		ResourceSet rs = element.eResource().getResourceSet();
		
		if (element instanceof PortInstance) {
			PortInstance portInstance = (PortInstance) element;
			CompositionProgram compositionProgram = 
				portInstance.getFragmentInstance().getCompositionProgram();
			Fragment fragment = portInstance.getFragmentInstance().getFragment();
			if (compositionProgram != null && fragment != null) {
				List<ReuseExtensionActivator> activatorList = 
					SokanReuseResourceUtil.findReuseExtensionActivators(
						compositionProgram.getUCPI(), rs);
				for (ReuseExtensionActivator activator : activatorList) {
					if (activator.getReuseExtension() instanceof CompositionLanguageSyntaxSpecification) {
						CompositionLanguageSyntaxSpecification clSyntax = 
							(CompositionLanguageSyntaxSpecification) activator.getReuseExtension();
						Map<String, String> args = new LinkedHashMap<String, String>();
						for (Argument arg : activator.getArguments()) {
							args.put(arg.getParameter(), arg.getValue());
						}
						
						for (FragmentRole2SyntaxBinding fragmentRoleBinding : clSyntax.getFragmentRoleBindings()) {
							for (PortType2SyntaxBinding portTypeBinding : fragmentRoleBinding.getPortTypeBindings()) {
								if (portTypeBinding.getPortType().equals(portInstance.port().getPortTypeBinding().getPortType())) {
									resultList.add(createElementSyntax(portTypeBinding, fragment, args));
								}								
							}
						}
					}
				}
			}
		}
		if (element instanceof FragmentInstance) {
			FragmentInstance fragmentInstance = (FragmentInstance) element;
			CompositionProgram compositionProgram = fragmentInstance.getCompositionProgram();
			Fragment fragment = fragmentInstance.getFragment();
			if (compositionProgram != null && fragment != null) {
				List<ReuseExtensionActivator> activatorList = SokanReuseResourceUtil.findReuseExtensionActivators(
						compositionProgram.getUCPI(), rs);
				for (ReuseExtensionActivator activator : activatorList) {
					if (activator.getReuseExtension() instanceof CompositionLanguageSyntaxSpecification) {
						CompositionLanguageSyntaxSpecification clSyntax = 
							(CompositionLanguageSyntaxSpecification) activator.getReuseExtension();
						Map<String, String> args = new LinkedHashMap<String, String>();
						for (Argument arg : activator.getArguments()) {
							args.put(arg.getParameter(), arg.getValue());
						}
						for (FragmentRole2SyntaxBinding fragmentRoleBinding : clSyntax.getFragmentRoleBindings()) {
							if (fragmentInstance.getFragment() != null) {
								for (CompositionInterface ci : fragmentInstance.getFragment().getCompositionInterfaces()) {
									if (fragmentRoleBinding.getFragmentRole().equals(ci.getRoleBinding().getFragmentRole())) {
										resultList.add(createElementSyntax(fragmentRoleBinding, fragment, args));
									}
								}
							}							
						}
					}
				}
			}
		}

		return resultList;
	}


	private ElementSyntax createElementSyntax(
			SyntaxDerivationRule syntaxDerivationRule, Fragment fragment, Map<String, String> args) {
		if (fragment == null || fragment.getContents().isEmpty()) {
			return null;
		}
		
		boolean visible = true; 
		if (syntaxDerivationRule.getVisibleExpression() != null) {
			visible = EvaluatorUtil.eval(
				fragment.getUFI(), fragment.getContents().get(0), syntaxDerivationRule.getVisibleExpression(), args);
		}
		boolean labelVisible = false;
		if (syntaxDerivationRule instanceof PortType2SyntaxBinding) {
			labelVisible = EvaluatorUtil.eval(
					fragment.getUFI(), fragment.getContents().get(0), ((PortType2SyntaxBinding) syntaxDerivationRule).getLabelExpression(), args);
		}
		int width = EvaluatorUtil.deriveInt(
			fragment.getUFI(), fragment.getContents().get(0), syntaxDerivationRule.getWidthExpression(), args);
		int height = EvaluatorUtil.deriveInt(
			fragment.getUFI(), fragment.getContents().get(0), syntaxDerivationRule.getHeightExpression(), args);

		String icon = EvaluatorUtil.derive(
				fragment.getUFI(), fragment.getContents().get(0), syntaxDerivationRule.getIconExpression(), args);

		return new ElementSyntax(visible, labelVisible, width, height, icon);
	}

	/**
	 * 
	 * @param portInstance the port instance to display
	 * @return true if the label of the port instance should be hidden 
	 *              (according to syntax specifications in context)
	 */
	public boolean showPortLabel(PortInstance portInstance) {
		if (portInstance == null) {
			return false;
		}
		if (portInstance.port() == null) {
			return false;
		}
		
		boolean declaredVisibility = true;
		for (ElementSyntax elementSyntax : findSyntax(portInstance)) {
			declaredVisibility = declaredVisibility && elementSyntax.isLabelVisible() && elementSyntax.isVisible();
		}
		for (ElementSyntax elementSyntax : findSyntax(portInstance.getFragmentInstance())) {
			declaredVisibility = declaredVisibility && elementSyntax.isVisible();
		}
		return declaredVisibility;
	}

	/**
	 * 
	 * @param portInstance the port instance to display
	 * @return true if the port instance itself should be hidden 
	 *              (according to syntax specifications in context)
	 */
	public boolean showPort(PortInstance portInstance) {
		if (portInstance == null) {
			return false;
		}
		if (!showFragment(portInstance.getFragmentInstance())) {
			return false;
		}
		
		//if the port is not typed (anymore) it has to be shown
		if (portInstance.port() == null) {
			return true;
		}
		
		boolean declaredVisibility = true;
		for (ElementSyntax portSyntax : findSyntax(portInstance)) {
			for (ElementSyntax fragmentSyntax : findSyntax(portInstance.getFragmentInstance())) {
				declaredVisibility = declaredVisibility && fragmentSyntax.isVisible();
				declaredVisibility = declaredVisibility && portSyntax.isVisible();
			}
		}
		return declaredVisibility;
	}
	
	/**
	 * 
	 * @param fragmentInstance the fragment instance to display
	 * @return true if the fragment instance should be hidden 
	 *              (according to syntax specifications in context)
	 */
	public boolean showFragment(FragmentInstance fragmentInstance) {
		boolean declaredVisibility = true;
		for (ElementSyntax desc : findSyntax(fragmentInstance)) {
			declaredVisibility = declaredVisibility && desc.isVisible();
		}
		return declaredVisibility;
	}
}
