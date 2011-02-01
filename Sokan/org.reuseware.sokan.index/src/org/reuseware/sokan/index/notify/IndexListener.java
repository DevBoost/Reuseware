package org.reuseware.sokan.index.notify;

import java.util.Set;

import org.reuseware.sokan.ID;

/**
 * Clients implementing this interface can register with <code>IndexUtil.addListener()</code>
 * to get notified about changes in the index.
 */
public interface IndexListener {

	/**
	 * The index of the artifacts with the given IDs has changed.
	 *  
	 * @param delta set of artifact IDs of changed index rows
	 */
	void indexChanged(Set<ID> delta);
}
