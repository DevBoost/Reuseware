package org.reuseware.coconut.ui.views;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.reuseware.sokan.index.util.StoreUtil;

/**
 * An extended input dialog that allows the user to select one store
 * from the set of stores registered with Sokan. This view is intended
 * to be used for defining the ID of a fragments (in the text input field) and
 * its physical location (in the store selection list). The view can be used,
 * for example, to rename fragments.
 */
public class InputDialogWithStoreSelection extends InputDialog {
	
	private URI currentStoreURI = null;
	private String selectedStore = null; 
	
	/**
	 * Constructor of the view.
	 * 
     * @param parentShell
     *            the parent shell, or <code>null</code> to create a top-level
     *            shell
     * @param dialogTitle
     *            the dialog title, or <code>null</code> if none
     * @param dialogMessage
     *            the dialog message, or <code>null</code> if none
     * @param initialValue
     *            the initial input value, or <code>null</code> if none
     *            (equivalent to the empty string)
	 * @param initialStoreURI
	 *            the URI of the initially selected store
	 * 
	 * @see InputDialog(Shell, String, String, String, IInputValidator)
	 */
	public InputDialogWithStoreSelection(Shell parentShell,
			String dialogTitle, String dialogMessage, String initialValue,
			URI initialStoreURI) {
		super(parentShell, dialogTitle, dialogMessage, initialValue, new IInputValidator() {
			public String isValid(String newText) {
				boolean first = true;
				for (String segment : newText.split("/")) {
					if (segment == null || "".equals(segment)) {
						if (!first) {
							return "Please enter a valid ID";		
						}
						first = false;
					}
				}
				if (newText.endsWith(".") || newText.lastIndexOf(".") < newText.lastIndexOf("/")) {
					return "Please enter a valid ID";
				}
				return null;
			}
		});
		this.currentStoreURI = initialStoreURI;
	}
	
    protected Control createDialogArea(Composite parent) {
        Composite topLevel = (Composite) super.createDialogArea(parent);

		Composite storeGroup = new Composite(topLevel, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 0;
		storeGroup.setLayout(layout);
		storeGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL
				| GridData.GRAB_HORIZONTAL));
		storeGroup.setFont(topLevel.getFont());

		Label label = new Label(storeGroup, SWT.NONE);
		label.setText("Store:");
		label.setFont(topLevel.getFont());

		Combo storeSelection = new Combo(storeGroup, SWT.DROP_DOWN);
		storeSelection.setFont(topLevel.getFont());
		
		for (URI storeURI : StoreUtil.INSTANCE.getAllStoreURIs()) {
			if (storeURI.isPlatformResource()) {
				String locationHint = storeURI.deresolve(
						currentStoreURI.trimSegments(1).appendSegment(""), false, true, true).toString();
				if (storeURI.equals(currentStoreURI)) {
					storeSelection.setText(locationHint);
					selectedStore = locationHint;
				}
				storeSelection.add(locationHint);	
			}
		}
		
		storeSelection.addSelectionListener(new SelectionListener() {	
			public void widgetSelected(SelectionEvent event) {
				selectedStore = ((Combo) event.getSource()).getText();
			}
			public void widgetDefaultSelected(SelectionEvent e) { }
		});
		
		return topLevel;
    }
    
    /**
     * @return the store selected in the dialog.
     */
    public String getSelectedStore() {
    	return selectedStore;
    }
}

