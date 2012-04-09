/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * 
 */
package org.reuseware.coconut.description.browse;

import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveListener4;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PerspectiveAdapter;
import org.reuseware.coconut.description.browse.views.BrowserPerspectiveFactory;

/**
 * @author Matthias Schmidt
 * 
 */
public class BrowserListener extends PerspectiveAdapter implements IPerspectiveListener4 {

	private MainBrowserManager main;
	private boolean isNewPerspective;

	public BrowserListener(MainBrowserManager main, boolean isNewPerspective) {
		this.main = main;
		this.isNewPerspective = isNewPerspective;
	}

	/**
	 * @return the isNewPerspective
	 */
	public boolean isNewPerspective() {
		return isNewPerspective;
	}

	/**
	 * @param isNewPerspective
	 *            the isNewPerspective to set
	 */
	public void setNewPerspective(boolean isNewPerspective) {
		this.isNewPerspective = isNewPerspective;
	}

	private void resetBrowser() {
		main.resetInstance();
	}

	private boolean isMy(IPerspectiveDescriptor perspective) {
		return perspective.getId().equals(BrowserPerspectiveFactory.PERSPECTIVE_ID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IPerspectiveListener3#perspectiveClosed(org.eclipse.ui
	 * .IWorkbenchPage, org.eclipse.ui.IPerspectiveDescriptor)
	 */
	@Override
	public void perspectiveClosed(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
		if (isMy(perspective))
			resetBrowser();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IPerspectiveListener#perspectiveActivated(org.eclipse.
	 * ui.IWorkbenchPage, org.eclipse.ui.IPerspectiveDescriptor)
	 */
	@Override
	public void perspectiveActivated(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
		// do nothing more if this is not new myPerspective
		if (!isMy(perspective) || !isNewPerspective)
			return;

		// do a refresh
		main.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IPerspectiveListener#perspectiveChanged(org.eclipse.ui
	 * .IWorkbenchPage, org.eclipse.ui.IPerspectiveDescriptor, java.lang.String)
	 */
	@Override
	public void perspectiveChanged(IWorkbenchPage page, IPerspectiveDescriptor perspective,
			String changeId) {
		// reset Browser if perspective is reset
		if (isMy(perspective) && changeId.equals(IWorkbenchPage.CHANGE_RESET))
			resetBrowser();
	}

}
