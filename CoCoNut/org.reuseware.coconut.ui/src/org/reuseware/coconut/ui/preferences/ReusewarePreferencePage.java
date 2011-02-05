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
package org.reuseware.coconut.ui.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Main preference page for Reuseware. The page is only used as a stating point
 * for sub-pages and has no content itself.
 */
public class ReusewarePreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	/**
	 * Delegates to super implementation.
	 */
	public ReusewarePreferencePage() {
		super();
	}

	/**
	 * Delegates to super implementation.
	 * 
     * @param title the title of this preference page
	 */
	public ReusewarePreferencePage(String title) {
		super(title);
	}

	/**
	 * Delegates to super implementation.
	 * 
     * @param title the title of this preference page
     * @param image the image for this preference page,
     *  or <code>null</code> if none
	 */
	public ReusewarePreferencePage(String title, ImageDescriptor image) {
		super(title, image);
	}

	@Override
	protected Control createContents(Composite parent) {
		return null;
	}

	/**
	 * Calls <code>noDefaultAndApplyButton()</code> to obtain an empty page.
	 * 
	 * @param workbench the workbench
	 */
	public void init(IWorkbench workbench) {
		noDefaultAndApplyButton();
	}

}
