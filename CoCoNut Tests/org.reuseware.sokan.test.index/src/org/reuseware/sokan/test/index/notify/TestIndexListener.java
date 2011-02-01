package org.reuseware.sokan.test.index.notify;

import java.util.Set;

import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.notify.IndexListener;

/**
 * @author Matthias Schmidt
 * 
 */
public class TestIndexListener implements IndexListener {

	private Set<ID> myDelta;

	public void indexChanged(Set<ID> delta) {
		myDelta = delta;
	}

	public Set<ID> getMyDelta() {
		return myDelta;
	}

	public void setMyDelta(Set<ID> myDelta) {
		this.myDelta = myDelta;
	}
}
