package org.reuseware.sokan.test.misc.notify;

import java.util.LinkedHashSet;
import java.util.Set;

import org.reuseware.sokan.ID;
import org.reuseware.sokan.index.notify.IndexListener;
import org.reuseware.sokan.index.notify.IndexNotifier;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * @author Matthias Schmidt
 * 
 */
public class MockIndex {
	public static final MockIndex INSTANCE = new MockIndex();

	private IndexNotifier notifier;
	private int value;

	private MockIndex() {
		notifier = new IndexNotifier();
		setValue(0);
	}

	public void addListener(IndexListener listener) {
		notifier.add(listener);
	}

	public void removeListener(IndexListener listener) {
		notifier.remove(listener);
	}

	/**
	 * @param newValue
	 *            the value to set
	 */
	public void setValue(int newValue) {
		value = newValue;

		Set<ID> delta = new LinkedHashSet<ID>();
		ID mockID = ResourceUtil.idFrom("my/mock/id.file");
		delta.add(mockID);
		
		notifier.notifyListeners(delta);
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
}
