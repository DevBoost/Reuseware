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
package org.reuseware.coconut.roundtrip.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.reuseware.coconut.roundtrip.RoundTripAdapter;
import org.reuseware.coconut.roundtrip.EModificationType;
import org.reuseware.coconut.roundtrip.IConflictResolver;
import org.reuseware.coconut.roundtrip.IModificationHandler;

/**
 * This class can be registered as a modification handler
 * to composed fragments. If a composed fragment is changed
 * this handler propagates the changes back to the source
 * fragments. If a conflict is cause by a change, a 
 * conflict resolver is used to resolve it. 
 */
public class RoundtripModificationHandler implements IModificationHandler {

	private ChangeHandler changeHandler;
	private AddHandler addHandler;
	private RemoveHandler removeHandler;

	/**
	 * A constructor used when this handler is register via extension
	 * point.
	 */
	public RoundtripModificationHandler() {
		this(registerConflictResolvers());
	}
	
	/**
	 * A constructor used then this handler is used in JUnit test cases.
	 * 
	 * @param conflictResolver
	 */
	public RoundtripModificationHandler(IConflictResolver conflictResolver) {
		changeHandler = new ChangeHandler(conflictResolver);
		addHandler = new AddHandler(conflictResolver);
		removeHandler = new RemoveHandler(conflictResolver);
	}
	
	private static IConflictResolver registerConflictResolvers() {
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		if (extensionRegistry == null) {
			return null;
		}
		
		List<IConflictResolver> resolvers = new ArrayList<IConflictResolver>();
		
		IExtensionPoint extensionPoint = extensionRegistry
			.getExtensionPoint("org.reuseware.coconut.fragment.conflictResolver");
		IExtension[] extensions = extensionPoint.getExtensions();
		
		for (int i = 0; i < extensions.length; i++) {
			IConfigurationElement[] elements = extensions[i].getConfigurationElements();

			for (int j = 0; j < elements.length; j++) {
				try {
					resolvers.add((IConflictResolver) elements[j].createExecutableExtension("class"));
				} catch (CoreException ce) {
					ce.printStackTrace();
				} catch (ClassCastException cce) {
					cce.printStackTrace();
				}
			}
		}
		if (resolvers.size() > 1) {
			System.err.println("RoundtripModificationHandler.registerConflictResolvers() found multiple registered conflict resolver. This is most probably a configuration issue.");
		} else if (resolvers.size() < 1) {
			System.err.println("RoundtripModificationHandler.registerConflictResolvers() no conflict resolver found. This is most probably a configuration issue.");
		}
		return resolvers.get(0);
	}

	public void handle(EModificationType type, URI ufi, RoundTripAdapter adapter) {
		if (type == EModificationType.ADD) {
			addHandler.handleAdd(ufi, adapter);
		}
		if (type == EModificationType.CHANGE) {
			changeHandler.handleChange(ufi, adapter);
		}
		if (type == EModificationType.REMOVE) {
			removeHandler.handleRemove(ufi, adapter);
		}
	}
}
