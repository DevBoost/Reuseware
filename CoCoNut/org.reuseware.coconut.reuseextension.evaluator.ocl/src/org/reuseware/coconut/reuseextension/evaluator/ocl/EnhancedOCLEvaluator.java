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
