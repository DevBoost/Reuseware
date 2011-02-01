package org.reuseware.air.ui.eclipse.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SampleHandler extends AbstractHandler implements ISelectionListener {
	
	private boolean toggled = false; 
	private IDocumentListener documentListener;
	
	/**
	 * The constructor.
	 */
	public SampleHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IEditorPart editor =
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		if (editor instanceof ITextEditor) {
			
			ITextEditor textEditor = (ITextEditor) editor;

			IDocument doc =
				textEditor.getDocumentProvider().getDocument(textEditor.getEditorInput());

			IAnnotationModel annotation = 
				textEditor.getDocumentProvider().getAnnotationModel(null);
			
			if (!toggled) {

				// start a new listener 
				documentListener = new DocumentListener();
				// add the document listener 
				doc.addDocumentListener(documentListener);
				
			} else { 
			
				// remove the document listener 
				doc.removeDocumentListener(documentListener); 
			}
			
			// change status 
			toggled = !toggled; 
		}

//		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
//		MessageDialog.openInformation(
//				window.getShell(),
//				"Eclipse Plug-in",
//				"Hello, Eclipse world");
		
		return null;
	}

	
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		
		  System.out.println("==========> selectionChanged");
		  System.out.println(selection);
		
	}
}
