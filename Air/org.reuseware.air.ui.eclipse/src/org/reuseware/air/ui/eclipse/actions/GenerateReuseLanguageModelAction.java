package org.reuseware.air.ui.eclipse.actions;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.reuseware.air.comogen.CompositionSystemGenerator;
import org.reuseware.air.comogen.IExtensionContext;
import org.reuseware.air.comogen.ExtensionContext;
import org.reuseware.air.comogen.LanguageExtensionGenerator;
import org.reuseware.air.comogen.util.CMSLSpecificationLoader;
import org.reuseware.air.language.cmsl.ExtensionProgram;
import org.reuseware.air.util.FileProcessingException;


/**
 * Action class for performing a language extension as specified in 
 * a CMSL program.
 * 
 * @author b0kaj
 *
 */
public class GenerateReuseLanguageModelAction implements IObjectActionDelegate {

	private ISelection selection;

	/**
	 * Process the file on which the ExtendGrammarAction was fired
	 * 
	 * 
	 * @param file
	 */
	public void process(IFile file) {

		IExtensionContext extensionContext;

		try {
			extensionContext = new ExtensionContext((ExtensionProgram)CMSLSpecificationLoader.parseCMSLSpecification(file).getUnit());
			CompositionSystemGenerator.processLanguageExtension(extensionContext);
			CompositionSystemGenerator.generateEcoreFile(extensionContext);

		} catch (FileProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			//GenerateLanguagePlugin genPlugin = new GenerateLanguagePlugin(); 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	/**
	 * Implements IObjectActionDelegate interface
	 * 
	 * Method executed when the Action is executed
	 * 
	 */
	@SuppressWarnings("unchecked")
	public void run(IAction action) {

		/**
		 * Find the selected file when the action is executed, 
		 * then pass the file to process().
		 * 
		 */
		if (selection instanceof IStructuredSelection) {
			for (Iterator i = ((IStructuredSelection)selection).iterator(); i.hasNext(); ) {
				Object o = i.next();
				if (o instanceof IFile) {
					IFile file = (IFile) o;

					process(file);
				}
			}
		}

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;

	}


	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}

}
