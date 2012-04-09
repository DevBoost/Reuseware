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
package org.reuseware.coconut.compositionprogram.resource;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * An issue caused by a UCL composition program. It implements and extends the 
 * <code>org.eclipse.emf.ecore.resource.Resource.Diagnostic</code> interface.
 */
public class UCLDiagnostic implements Resource.Diagnostic {

	private final org.eclipse.emf.common.util.Diagnostic wrappedDiagnostic;
	
	/**
	 * Create a UCL diagnostic based on a common EMF diagnostic.
	 * 
	 * @param diagnostic the EMF diagnostic to use as basis
	 */
	public UCLDiagnostic(org.eclipse.emf.common.util.Diagnostic diagnostic) {
		this.wrappedDiagnostic = diagnostic;
	}
	
	/**
	 * @return a message describing the problem
	 */
	public String getMessage() {
		return wrappedDiagnostic.getMessage();
	}
	
	/**
	 * @return source location of the problem
	 */
	public String getLocation() {
		return wrappedDiagnostic.getSource();
	}
	
	/**
	 * @return 0
	 */
	public int getColumn() {
		return 0;
	}
	
	/**
	 * @return 0
	 */
	public int getLine() {
		return 0;
	}

	/**
	 * @return a list of elements causing the problem.
	 */
	public List<EObject> getElements() {
		@SuppressWarnings("unchecked")
		List<EObject> list = (List<EObject>) wrappedDiagnostic.getData();
		return list;
	}

	/**
	 * @return severity of the problem
	 */
	public int getSeverity() {
		return wrappedDiagnostic.getSeverity();
	}
}
