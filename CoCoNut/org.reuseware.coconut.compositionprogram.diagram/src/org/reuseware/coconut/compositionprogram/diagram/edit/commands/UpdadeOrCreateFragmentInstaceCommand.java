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
package org.reuseware.coconut.compositionprogram.diagram.edit.commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Node;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.FragmentInstanceEditPart;
import org.reuseware.coconut.compositionprogram.diagram.providers.CompositionprogramElementTypes;
import org.reuseware.coconut.compositionprogram.util.CompositionProgramUtil;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.ReuseResources;

/**
 * Command to create a new (or update an existing) fragment instance
 * in a composition program.
 */
public class UpdadeOrCreateFragmentInstaceCommand extends
		AbstractTransactionalCommand {
	
	protected List<String> ufi = null;
	
	protected FragmentInstance fragmentInstance = null;
	protected CompositionProgram compositionProgram = null;
	
	protected IGraphicalEditPart editPart = null;
	protected Point location = null;

	/**
	 * @param domain editing domain to use
	 * @param ufi UFI of the fragment for the fragment instance
	 * @param compositionProgram composition program into which to place the fragment instance
	 * @param editPart edit part onto which to place the visualization of the fragment instance
	 * @param location location where to place the visualization of the fragment instance
	 */
	public UpdadeOrCreateFragmentInstaceCommand(
			TransactionalEditingDomain domain, List<String> ufi, CompositionProgram compositionProgram,
			IGraphicalEditPart editPart, Point location) {
		super(domain, "Create Fragment Instance from UFI", Collections.emptyList());
		this.ufi = ufi;
		this.compositionProgram = compositionProgram;
		this.editPart = editPart;
		this.location = location;
	}
	
	/**
	 * 
	 * @param domain editing domain to use
	 * @param ufi UFI of the fragment for the fragment instance
	 * @param fragmentInstance fragment instance to update with the new UFI
	 */
	public UpdadeOrCreateFragmentInstaceCommand(
			TransactionalEditingDomain domain, List<String> ufi, FragmentInstance fragmentInstance) {
		super(domain, "Update Fragment Instance UFI", Collections.emptyList());
		this.ufi = ufi;
		this.compositionProgram = fragmentInstance.getCompositionProgram();
		this.fragmentInstance = fragmentInstance;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		Fragment fragment = ReuseResources.INSTANCE.getFragment(ufi, 
				getEditingDomain().getResourceSet());
		if (fragment == null) {
			return CommandResult.newCancelledCommandResult();
		}
		if (fragmentInstance == null) {
			fragmentInstance = CompositionProgramUtil.createFragmentInstance(fragment, compositionProgram);
			CompositionProgramUtil.linkImplicitInterface(compositionProgram, fragmentInstance);
			List<CreateViewRequest.ViewDescriptor> descriptors = 
				new ArrayList<CreateViewRequest.ViewDescriptor>();
			CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
					new EObjectAdapter((EObject) fragmentInstance), Node.class,
					getSemanticHintForEObject((EObject) fragmentInstance),
					getDiagramPreferencesHint());
			viewDescriptor.setPersisted(true);
			descriptors.add(viewDescriptor);
			CreateViewRequest createViewRequest = new CreateViewRequest(
					descriptors);
			createViewRequest.setLocation(location);
			Command createViewCommand = editPart.getCommand(createViewRequest);
			createViewCommand.execute();
		} else {
			CompositionProgramUtil.updateFragmentInstance(fragment, fragmentInstance);
		}
		return CommandResult.newOKCommandResult();
	}
	
	private String getSemanticHintForEObject(EObject element) {
		if (element instanceof FragmentInstance) {
			return ((IHintedType) CompositionprogramElementTypes
					.getElementType(FragmentInstanceEditPart.VISUAL_ID))
					.getSemanticHint();
		}
		return null;
	}

	private PreferencesHint getDiagramPreferencesHint() {
		return ((IGraphicalEditPart) editPart).getDiagramPreferencesHint();
	}

}
