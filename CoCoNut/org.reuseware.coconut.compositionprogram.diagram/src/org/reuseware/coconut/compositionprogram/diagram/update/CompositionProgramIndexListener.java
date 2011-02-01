package org.reuseware.coconut.compositionprogram.diagram.update;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PhysicalCompositionProgram;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramDiagramEditor;
import org.reuseware.coconut.compositionprogram.util.CompositionProgramUtil;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.coconut.resource.sokan.util.SokanReuseResourceUtil;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivator;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.notify.IndexListener;

/**
 * Index listener that reacts on changes to fragments in the index
 * and instantly updates the corresponding fragment instances in the currently
 * displayed composition program.
 */
public class CompositionProgramIndexListener implements IndexListener {
	
	private CompositionprogramDiagramEditor compositionprogramDiagramEditor;
	
	/**
	 * Constructs a new index listener.
	 * 
	 * @param compositionprogramDiagramEditor the UCL diagram editor of this listener
	 */
	public CompositionProgramIndexListener(
			CompositionprogramDiagramEditor compositionprogramDiagramEditor) {
		this.compositionprogramDiagramEditor = compositionprogramDiagramEditor;
	}

	/**
	 * Updates the fragment instances of the fragments identified by the given IDs.
	 * 
	 * @param delta IDs of changed fragments
	 */
	public void indexChanged(Set<ID> delta) {
		if (compositionprogramDiagramEditor.getDiagram() == null) {
			return;
		}
		
		if (!(compositionprogramDiagramEditor.getDiagram().getElement()
				instanceof PhysicalCompositionProgram)) {
			return;
		}
		
		final CompositionProgram compositionProgram = 
			(CompositionProgram) compositionprogramDiagramEditor.getDiagram().getElement();
		final TransactionalEditingDomain domain = compositionprogramDiagramEditor.getEditingDomain();

		for (FragmentInstance fragmentInstance : compositionProgram.getFragmentInstances()) {
			for (ID updated : delta) {
				if (fragmentInstance.getUFI().equals(updated.getSegments())) {
					final FragmentInstance toUpdate = fragmentInstance;
					domain.getCommandStack().execute(new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							toUpdate.setFragment(ReuseResources.INSTANCE.getFragment(
									toUpdate.getUFI(), domain.getResourceSet()));
							toUpdate.update();
						}
					});

				}
			}
		}
		
		final List<ReuseExtensionActivator> activatorList = SokanReuseResourceUtil.findReuseExtensionActivators(
				compositionProgram.getUCPI(), 
				domain.getResourceSet());
		
		//ensure that a syntax that got activated later is used
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				CompositionProgramUtil.activateCompositionLanguageSyntaxSpecifications(
						compositionProgram, activatorList);
			}
		});
	}

}
