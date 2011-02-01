package org.reuseware.coconut.compositionprogram.diagram.edit.policies;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramDragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.diagram.edit.commands.UpdadeOrCreateFragmentInstaceCommand;

/**
 * A drop editing policy for drag and drop support of fragments into the
 * canvas of the UCL editor. The policy expects an UFI as the dropped object.
 * It then creates an <code>UpdadeOrCreateFragmentInstaceCommand</code> 
 * based on that UFI.
 */
public class UFIDragDropEditPolicy extends
		DiagramDragDropEditPolicy {

	/**
	 * @param request drop object request that contains a UFI as string list
	 * 
	 * @return a <code>UpdadeOrCreateFragmentInstaceCommand</code> based on the given UFI
	 */
	public Command getDropObjectsCommand(DropObjectsRequest request) {
		if (request.getObjects().isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		}
		
		CompoundCommand compoundCommand = new CompoundCommand();
		
		for (Object object : request.getObjects()) {
			if (!(object instanceof List)) {
				continue;
			}
			@SuppressWarnings("unchecked")
			List<String> ufi = (List<String>) object;
			TransactionalEditingDomain eDomain = getEditingDomain();
			EObject element = ((View) getHost().getModel()).getElement();
			
			if (element instanceof FragmentInstance) {
				Command command = new ICommandProxy(new UpdadeOrCreateFragmentInstaceCommand(
						eDomain, ufi, (FragmentInstance) element));
				compoundCommand.add(command);
			} else if (element instanceof CompositionProgram) {
				Command command = new ICommandProxy(new UpdadeOrCreateFragmentInstaceCommand(
						eDomain, ufi, (CompositionProgram) element, 
						(IGraphicalEditPart) getHost(), request.getLocation()));
				compoundCommand.add(command);
			}

		}
		return compoundCommand;
		
	}

	private TransactionalEditingDomain getEditingDomain() {
		if (getHost() instanceof IGraphicalEditPart) {
			return ((IGraphicalEditPart) getHost()).getEditingDomain();
		}
		return null;
	}

}
