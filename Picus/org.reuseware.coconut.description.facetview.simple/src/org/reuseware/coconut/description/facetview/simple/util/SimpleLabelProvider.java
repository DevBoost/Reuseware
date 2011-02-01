/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.description.facetview.simple.util;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.reuseware.coconut.description.FacetValueDecorator;
import org.reuseware.coconut.description.classify.views.facet.FacetView;
import org.reuseware.coconut.description.classify.views.facet.JFaceFacetView;
import org.reuseware.coconut.description.facetview.simple.views.SimpleFacetView;

/**
 * This LabelProvider defines how the decorated values will be presented in the
 * {@link SimpleFacetView}'s TreeViewer. If the view is in browser mode the values will
 * have the valueCount next to them. If this valueCount is <1 the values label
 * will be gray and the icon next to it will be different. <br>
 * <br>
 * A standard label without any valueCount is shown, if the view is not in
 * browser mode
 * 
 * @see SimpleFacetView
 * @see FacetView#browserMode
 * @see FacetValueDecorator
 * 
 * @author Matthias Schmidt
 * 
 */
public class SimpleLabelProvider extends LabelProvider implements ILabelProvider, IColorProvider {

	/**
	 * The view which uses this LabelProvider.
	 */
	private JFaceFacetView view;

	/**
	 * The default icon which is used when the view is not in browser mode.
	 */
	private static final Image IMG_DEFAULT = AbstractUIPlugin.imageDescriptorFromPlugin(
			"org.reuseware.coconut.description.edit", "icons/full/obj16/FacetValue.gif")
			.createImage();
	/**
	 * A special icon which is used in browser mode and if the decorator's
	 * valueCount is >0.
	 */
	private static final Image IMG_ITEM_VISIBLE = AbstractUIPlugin.imageDescriptorFromPlugin(
			"org.reuseware.coconut.description.facetview.simple", "icons/item_visible.gif")
			.createImage();
	/**
	 * A special icon which is used in browser mode and if the decorator's
	 * valueCount is <0.
	 */
	private static final Image IMG_ITEM_INVISIBLE = AbstractUIPlugin.imageDescriptorFromPlugin(
			"org.reuseware.coconut.description.facetview.simple", "icons/item_invisible.gif")
			.createImage();

	/**
	 * The constructor.
	 * 
	 * @param view
	 *            The view which uses this LabelProvider.
	 */
	public SimpleLabelProvider(JFaceFacetView view) {
		this.view = view;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		if (element instanceof FacetValueDecorator) {
			FacetValueDecorator vDecor = (FacetValueDecorator) element;
			String label = vDecor.getDecoratee().getName();

			if (view.browserMode)
				label += " (" + vDecor.getValueCount() + ")";

			return label;
		}
		return super.getText(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(Object element) {
		if (!view.browserMode)
			return IMG_DEFAULT;

		if (element instanceof FacetValueDecorator) {
			if (((FacetValueDecorator) element).getValueCount() < 1)
				return IMG_ITEM_INVISIBLE;
			else
				return IMG_ITEM_VISIBLE;
		}

		return IMG_DEFAULT;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IColorProvider#getBackground(java.lang.Object)
	 */
	public Color getBackground(Object element) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IColorProvider#getForeground(java.lang.Object)
	 */
	public Color getForeground(Object element) {
		Display disp = view.getSite().getShell().getDisplay();
		if (!view.browserMode)
			return disp.getSystemColor(SWT.COLOR_BLACK);

		if (element instanceof FacetValueDecorator) {
			if (((FacetValueDecorator) element).getValueCount() < 1)
				return disp.getSystemColor(SWT.COLOR_GRAY);
			else
				return disp.getSystemColor(SWT.COLOR_BLACK);
		}

		return disp.getSystemColor(SWT.COLOR_RED);
	}
}
