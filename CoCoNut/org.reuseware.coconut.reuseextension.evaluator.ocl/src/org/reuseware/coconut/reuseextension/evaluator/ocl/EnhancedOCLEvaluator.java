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
package org.reuseware.coconut.reuseextension.evaluator.ocl;

import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;

/**
 * An evaluator that supports an enhanced OCL 
 * (see: <code>EnhancedEcoreEnvironment</code>).
 */
public class EnhancedOCLEvaluator extends OCLEvaluator {

	/**
	 * The prefix: <i>ocl+</i>.
	 */
	public static final String PREFIX = "ocl+";

	@Override
	protected EcoreEnvironmentFactory getEnvironmentFactory() {
		return new EnhancedEcoreEnvironmentFactory();
	}

	/**
	 * @return ocl+
	 */
	public String getPrefix() {
		return PREFIX;
	}
}
