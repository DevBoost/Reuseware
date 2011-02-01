package org.reuseware.sokan.ui.internal.actions;

import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.reuseware.sokan.ui.SokanUIPlugin;
import org.reuseware.sokan.ui.views.BasicRepositoryView;

/**
 * Action to open an artifact from a repository view.
 */
public class OpenAction extends BasicRepositoryViewAction {

	private static ImageDescriptor artifactImage;
	static {
		URL url = null;
		url = SokanUIPlugin.getDefault().getBundle().getResource(
				"icons/Artifact.gif");
		artifactImage = ImageDescriptor.createFromURL(url);
	}
	
	/**
	 * Constructs a new action for the given repository view.
	 * 
	 * @param view the repository view
	 */
	public OpenAction(BasicRepositoryView view) {
		super(view);
		this.setText("Open Artifact");
		this.setToolTipText("Open Artifact");
		this.setImageDescriptor(artifactImage);
	}

	@Override
	public void run() {
		for (EObject element : getBasicRepositoryView().getSelectedElements()) {
			IFile file = getBasicRepositoryView().getFileForElement(element);
			openEditor(file);
		}
	}

	private IEditorPart openEditor(IFile file) {		
		if (file != null && file.exists()) {
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			IEditorRegistry editorRegistry = PlatformUI.getWorkbench()
					.getEditorRegistry();

			IEditorDescriptor editorDescriptor = null;
			String fileName = file.getName();
			IContentType[] contentTypes = Platform.getContentTypeManager()
					.findContentTypesFor(fileName);

			if (contentTypes.length == 0) {
				editorDescriptor = editorRegistry.getDefaultEditor(fileName,
						null);
			}
			for (int i = 0; editorDescriptor == null && i < contentTypes.length; i++) {
				editorDescriptor = editorRegistry.getDefaultEditor(fileName,
						contentTypes[i]);
			}
			
			if (editorDescriptor == null) {
				//try default model tree editor
				editorDescriptor = editorRegistry.getDefaultEditor(".xmi");
			}

			if (editorDescriptor != null) {

				try {
					final IEditorPart editor = page
							.openEditor(new FileEditorInput(file),
									editorDescriptor.getId());
					return editor;
				} catch (PartInitException e) {
					//ok
				}
			} else {
				MessageDialog.openError(page.getActivePart().getSite()
						.getShell(), "Open editor error",
						"No editor found for '" + file.getName() + "'.");
			}
		}
		return null;
	}
}
