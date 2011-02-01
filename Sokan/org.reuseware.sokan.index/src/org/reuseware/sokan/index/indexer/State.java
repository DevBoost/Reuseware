package org.reuseware.sokan.index.indexer;

/**
 * Current state of the running indexing process.
 */
public final class State {

	private State() { }
	
	private static boolean isCreating = false;
	private static boolean isCalcDep = false;
	

	protected static void setCreating() {
		isCreating = true;
	}

	protected static void unsetCreating() {
		isCreating = false;
	}

	protected static boolean isCreating() {
		return isCreating;
	}
	
	protected static void setCalcDep() {
		isCalcDep = true;
	}

	protected static void unsetCalcDep() {
		isCalcDep = false;
	}

	protected static boolean isCalculatingDependencies() {
		return isCalcDep;
	}
}
