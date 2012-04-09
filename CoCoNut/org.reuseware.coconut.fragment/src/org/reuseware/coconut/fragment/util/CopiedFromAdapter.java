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
package org.reuseware.coconut.fragment.util;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * A CopiedFromAdapter is attached to all EObjects when they are copied during
 * the process of composition. The adapter stores information about the origin
 * of the EObject.
 */
public class CopiedFromAdapter extends AdapterImpl {

	protected EObject original;
	protected final EObject contextObject;

	/**
	 * This constructor is used when adding adapters to each element of
	 * a model. The context object is required to distinguish multiple copies
	 * of the same original.
	 * 
	 * @param original the element that is copied
	 * @param contextObject an object identifying the context in which the element is copied
	 */
	public CopiedFromAdapter(EObject original, EObject contextObject) {
		super();
		this.original = original;
		this.contextObject = contextObject;
	}
	
	/**
	 * @return object identifying the context in which the element is copied
	 */
	public EObject getContextObject() {
		return contextObject;
	}

	/**
	 * @return original the element that was copied
	 */
	public EObject getOriginal() {
		return original;
	}

	/**
	 * @param type the type to check
	 * 
	 * @return <code>CopiedFromAdapter.class</code>
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		return type == CopiedFromAdapter.class;
	}
}
