package org.reuseware.coconut.compositionprogram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.reuseware.coconut.compositionprogram.diagram.providers.CompositionprogramElementTypes;

/**
 * @generated
 */
public class CompositionLinkItemSemanticEditPolicy extends
		CompositionprogramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositionLinkItemSemanticEditPolicy() {
		super(CompositionprogramElementTypes.CompositionLink_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
