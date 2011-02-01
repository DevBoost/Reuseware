package org.reuseware.coconut.reuseextension.evaluator.ocl;

import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;

/**
 * An evaluator that supports plain standard-conforming OCL.
 */
public class PlainOCLEvaluator extends OCLEvaluator {

	/**
	 * The prefix: <i>ocl</i>.
	 */
	public static final String PREFIX = "ocl";

	@Override
	protected EcoreEnvironmentFactory getEnvironmentFactory() {
		return new EcoreEnvironmentFactory();
	}

	/**
	 * @return ocl
	 */
	public String getPrefix() {
		return PREFIX;
	}
}
