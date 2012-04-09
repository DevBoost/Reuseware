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
/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.reuseware.application.taipan.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * @author dstadnik
 */
public class ShipShape extends Figure {

	private WrappingLabel label;

	private IFigure smallCargo;

	private IFigure largeCargo;

	public ShipShape() {
		GridLayout layout = new GridLayout(2, false);
		setLayoutManager(layout);
		add(new ImageFigure(getShipImage()), new GridData(SWT.BEGINNING, SWT.BEGINNING, false, false, 1, 2));
		add(label = new WrappingLabel(), new GridData(SWT.BEGINNING, SWT.BEGINNING, false, false, 1, 1));
		add(smallCargo = new Figure(), new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
		smallCargo.setLayoutManager(new StackLayout());
		add(largeCargo = new Figure(), new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		largeCargo.setLayoutManager(new StackLayout());
	}

	protected Image getShipImage() {
		return getImageImage("images/ship.png"); //$NON-NLS-1$
	}

	protected Image getImageImage(String path) {
		Image image = JFaceResources.getImageRegistry().get(path);
		if (image == null) {
			ImageDescriptor descriptor = AbstractUIPlugin.imageDescriptorFromPlugin("org.reuseware.application.taipan", path); //$NON-NLS-1$
			if (descriptor == null) {
				descriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			JFaceResources.getImageRegistry().put(path, image = descriptor.createImage());
		}
		return image;
	}

	public WrappingLabel getLabel() {
		return label;
	}

	public IFigure getSmallCargo() {
		return smallCargo;
	}

	public IFigure getLargeCargo() {
		return largeCargo;
	}
}
