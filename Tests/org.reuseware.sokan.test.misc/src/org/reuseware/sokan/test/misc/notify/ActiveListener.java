package org.reuseware.sokan.test.misc.notify;

import java.util.Set;

import org.reuseware.sokan.ID;

/**
 * @author Matthias Schmidt
 * 
 */
public class ActiveListener extends AbstractTestListener {

	public ActiveListener(String name) {
		super(name);
	}

	public void indexChanged(Set<ID> delta) {
		print("-Before");

		INDEX.setValue(INDEX.getValue() + 1);

		print("-After");
		;
		invokeCounter++;
	}
}
