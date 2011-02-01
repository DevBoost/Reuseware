package org.reuseware.coconut.compositionprogram.diagram.util;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.diagram.edit.parts.CompositionProgramEditPart;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramDiagramEditorPlugin;
import org.reuseware.coconut.compositionprogram.diagram.part.CompositionprogramDiagramEditorUtil;
import org.reuseware.coconut.ui.DiagramInitializer;

/**
 * Diagram initializer for UCL files.
 */
public class UCLDiagramInitializer implements DiagramInitializer {

	/**
	 * @param modelResource resource holding a composition program
	 * 
	 * @return true if the given resource holds a <code>CompositionProgram</code>
	 */
	public boolean canInitializeDiagramFor(Resource modelResource) {
		return (!modelResource.getContents().isEmpty()
				&& modelResource.getContents().get(0) instanceof CompositionProgram);
	}

	/**
	 * @param modelResource resource holding a composition program
	 * 
	 * @return resource holding a UCL diagram (UCLDI file)
	 */
	public Resource initializeDiagram(Resource modelResource) {
		final CompositionProgram root = (CompositionProgram) modelResource.getContents().get(0);
		final TransactionalEditingDomain eDomain = TransactionUtil.getEditingDomain(modelResource);
		final ResourceSet rs =  modelResource.getResourceSet();
		
		URI modelURI = modelResource.getURI();
		URI diagramURI = modelURI.trimFileExtension().appendFileExtension("ucldi");
				
		Resource diagramResource = rs.getResource(diagramURI, false);
		if (diagramResource == null) {
			diagramResource = rs.createResource(diagramURI);
		}
		
		if (eDomain != null) {
			final Resource resourceToModify = diagramResource;
			eDomain.getCommandStack().execute(new RecordingCommand(eDomain) {	
				@Override
				protected void doExecute() {
					modifyResource(root, resourceToModify);	
				}
			});
		} else {
			modifyResource(root, diagramResource);
		}

		try {
			diagramResource.save(CompositionprogramDiagramEditorUtil
					.getSaveOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return diagramResource;
	}

	private void modifyResource(CompositionProgram root,
			Resource diagramResource) {
		diagramResource.getContents().clear();
		
		Diagram diagram = ViewService.createDiagram(
				root,
				CompositionProgramEditPart.MODEL_ID,
				CompositionprogramDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		diagram.setElement(root);
		diagramResource.getContents().add(diagram);
	}

}
