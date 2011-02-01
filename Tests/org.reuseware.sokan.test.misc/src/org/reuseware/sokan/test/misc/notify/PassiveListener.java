package org.reuseware.sokan.test.misc.notify;

import java.util.Set;

import org.reuseware.sokan.ID;

/**
 * Passive Listener
 * 
 * @author Matthias Schmidt
 * 
 */
public class PassiveListener extends AbstractTestListener {

	public PassiveListener(String name) {
		super(name);
	}

	public void indexChanged(Set<ID> delta) {
		print(null);
		invokeCounter++;
	}
}
