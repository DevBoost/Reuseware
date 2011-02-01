package org.reuseware.sokan.index.indexer;

/**
 * Interface that allows Sokan to control validation of resources. A resource
 * needs to implement this interface in addition to the EMF <code>Resource</code> 
 * interface in order to get validated by Sokan.
 */
public interface Validatable {
	
	/**
	 * Perform the validation of myself.
	 */
	void validate();

}
