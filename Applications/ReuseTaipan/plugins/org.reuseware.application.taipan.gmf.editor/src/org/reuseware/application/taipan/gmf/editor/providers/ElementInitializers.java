/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.reuseware.application.taipan.gmf.editor.providers;

import org.eclipse.emf.ecore.EcorePackage;
import org.reuseware.application.taipan.Route;
import org.reuseware.application.taipan.TaiPanPackage;
import org.reuseware.application.taipan.gmf.editor.expressions.TaiPanAbstractExpression;
import org.reuseware.application.taipan.gmf.editor.expressions.TaiPanOCLFactory;
import org.reuseware.application.taipan.gmf.editor.part.TaiPanDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	/**
	 * @generated
	 */
	public static void init_Route_4002(Route instance) {
		try {
			Object value_0 = TaiPanOCLFactory.getExpression("0.8",
					TaiPanPackage.eINSTANCE.getRoute()).evaluate(instance);

			value_0 = TaiPanAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEDouble());
			instance.setReliability(((Double) value_0).doubleValue());
		} catch (RuntimeException e) {
			TaiPanDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Route_4003(Route instance) {
		try {
			Object value_0 = TaiPanOCLFactory.getExpression("0.2",
					TaiPanPackage.eINSTANCE.getRoute()).evaluate(instance);

			value_0 = TaiPanAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEDouble());
			instance.setReliability(((Double) value_0).doubleValue());
		} catch (RuntimeException e) {
			TaiPanDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}
}
