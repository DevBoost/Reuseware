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
package org.reuseware.coconut.roundtrip.test;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.reuseware.coconut.fragment.ComposedFragment;
import org.reuseware.coconut.fragment.util.CopiedFromAdapter;
import org.reuseware.coconut.fragment.util.IModificationHandler;
import org.reuseware.coconut.repository.PackageableElement;
import org.reuseware.coconut.repository.resource.ReuseResources;
import org.reuseware.coconut.repository.util.IDUtil;
import org.reuseware.coconut.test.composition.AbstractReusewareCompositionTest;

public abstract class AbstractRoundtripTest extends AbstractReusewareCompositionTest {

	public ComposedFragment getComposedFragment(String uri, IModificationHandler... handlers) {
		PackageableElement pe = ReuseResources.INSTANCE.getElement(IDUtil.uriToID(URI.createURI(uri)));
		ComposedFragment composedFragment = (ComposedFragment) pe;
		List<EObject> contents = composedFragment.getContents();
		registerModificationHandlers(contents, handlers);
		return composedFragment;
	}

	public void registerModificationHandlers(List<EObject> elementsInComposedFragment, IModificationHandler... handlers) {
		for (EObject eObject : elementsInComposedFragment) {
			List<Adapter> adapters = eObject.eAdapters();
			for (Adapter adapter : adapters) {
				if (adapter instanceof CopiedFromAdapter) {
					CopiedFromAdapter cfAdapter = (CopiedFromAdapter) adapter;
					cfAdapter.active = true;
					for (IModificationHandler handler : handlers) {
						cfAdapter.addModificationHandler(handler);
					}
				}
			}
			List<EObject> contents = eObject.eContents();
			registerModificationHandlers(contents, handlers);
		}
	}
}
