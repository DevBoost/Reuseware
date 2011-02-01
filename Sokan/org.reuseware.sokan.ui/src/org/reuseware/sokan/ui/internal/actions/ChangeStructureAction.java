package org.reuseware.sokan.ui.internal.actions;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.reuseware.sokan.ui.SokanUIPlugin;
import org.reuseware.sokan.ui.views.BasicRepositoryView;

/**
 * Changes the structure of how artifacts are displayed
 * between <i>package</i> and <i>folder</i>.
 */
public class ChangeStructureAction extends BasicRepositoryViewAction {

	private static ImageDescriptor packageImage;
	static {
		URL url = null;
		url = SokanUIPlugin.getDefault().getBundle().getResource(
				"icons/Package.gif");
		packageImage = ImageDescriptor.createFromURL(url);
	}
	
	/**
	 * Constructs a new action for the given repository view.
	 * 
	 * @param view the repository view
	 */
	public ChangeStructureAction(BasicRepositoryView view) {
		super(view);
		setText("Switch Structure");
		setToolTipText("Switch between Package and Folder Structure");
		setImageDescriptor(packageImage);
	}

	@Override
	public void run() {
		getBasicRepositoryView().swapMode();
		getBasicRepositoryView().newRoot();
	}
}
