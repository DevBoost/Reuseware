package org.reuseware.sokan.test.misc.cases;

import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.reuseware.sokan.index.notify.IndexListener;
import org.reuseware.sokan.test.misc.notify.AbstractTestListener;
import org.reuseware.sokan.test.misc.notify.ActiveListener;
import org.reuseware.sokan.test.misc.notify.MockIndex;
import org.reuseware.sokan.test.misc.notify.PassiveListener;

/**
 * @author Matthias Schmidt
 * 
 */
public class IndexNotifyTestCase {
	private static MockIndex INDEX = MockIndex.INSTANCE;
	private PassiveListener lis1;
	private ActiveListener lis2;
	private ActiveListener lis3;
	private PassiveListener lis4;

	@Before
	public void setUp() {
		lis1 = new PassiveListener("lis1");
		lis2 = new ActiveListener("lis2");
		lis3 = new ActiveListener("lis3");
		lis4 = new PassiveListener("lis4");

		if (INDEX == null)
			INDEX = MockIndex.INSTANCE;
	}

	@Test
	public void testSinglePassive() {
		int expected = 0;
		List<AbstractTestListener> lis = new LinkedList<AbstractTestListener>();
		lis.add(lis1);
		init(lis, expected, "testSinglePassive");

		assertTrue(expected == lis1.getMyValue());

		expected = 12;
		INDEX.setValue(expected);

		assertTrue(expected == lis1.getMyValue());
		assertTrue(1 == lis1.getInvokeCounter());

		remove(lis);
	}

	@Test
	public void testSingleActive() {
		int expected = 0;
		List<AbstractTestListener> lis = new LinkedList<AbstractTestListener>();
		lis.add(lis2);
		init(lis, expected, "testSingleActive");

		assertTrue(expected == lis2.getMyValue());

		expected = 10;
		try {
			INDEX.setValue(expected);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertTrue(expected + 1 == lis2.getMyValue());
		assertTrue(1 == lis2.getInvokeCounter());

		remove(lis);
	}

	@Test
	public void testPassiveActive() {
		int expected = 0;
		List<AbstractTestListener> lis = new LinkedList<AbstractTestListener>();
		lis.add(lis1);
		lis.add(lis2);
		init(lis, expected, "testPassiveActive");

		assertTrue(expected == lis1.getMyValue());
		assertTrue(expected == lis2.getMyValue());

		expected = 10;
		INDEX.setValue(expected);

		assertTrue(expected + 1 == lis1.getMyValue());
		assertTrue(expected + 1 == lis2.getMyValue());

		assertTrue(2 == lis1.getInvokeCounter());
		assertTrue(1 == lis2.getInvokeCounter());

		remove(lis);
	}

	@Test
	public void testPassiveActive2() {
		int expected = 0;
		List<AbstractTestListener> lis = new LinkedList<AbstractTestListener>();
		lis.add(lis1);
		lis.add(lis2);
		init(lis, expected, "testPassiveActive2");

		assertTrue(expected == lis1.getMyValue());
		assertTrue(expected == lis2.getMyValue());

		expected = 10;
		INDEX.setValue(expected);

		assertTrue(expected + 1 == lis1.getMyValue());
		assertTrue(expected + 1 == lis2.getMyValue());
		assertTrue(2 == lis1.getInvokeCounter());
		assertTrue(1 == lis2.getInvokeCounter());

		expected = 20;
		INDEX.setValue(expected);

		assertTrue(expected + 1 == lis1.getMyValue());
		assertTrue(expected + 1 == lis2.getMyValue());
		assertTrue(3 == lis1.getInvokeCounter());
		assertTrue(2 == lis2.getInvokeCounter());

		remove(lis);
	}

	@Test
	public void testActivePassive() {
		int expected = 0;
		List<AbstractTestListener> lis = new LinkedList<AbstractTestListener>();
		lis.add(lis2);
		lis.add(lis1);
		init(lis, expected, "testActivePassive");

		assertTrue(expected == lis1.getMyValue());
		assertTrue(expected == lis2.getMyValue());

		expected = 10;
		INDEX.setValue(expected);

		assertTrue(expected + 1 == lis1.getMyValue());
		assertTrue(expected + 1 == lis2.getMyValue());

		assertTrue(1 == lis1.getInvokeCounter());
		assertTrue(1 == lis2.getInvokeCounter());

		remove(lis);
	}

	@Test
	public void testPassiveActivePassive() {
		int expected = 0;
		List<AbstractTestListener> lis = new LinkedList<AbstractTestListener>();
		lis.add(lis1);
		lis.add(lis2);
		lis.add(lis4);
		init(lis, expected, "testPassiveActivePassive");

		assertTrue(expected == lis1.getMyValue());
		assertTrue(expected == lis2.getMyValue());
		assertTrue(expected == lis4.getMyValue());

		expected = 10;
		INDEX.setValue(expected);

		assertTrue(expected + 1 == lis1.getMyValue());
		assertTrue(expected + 1 == lis2.getMyValue());
		assertTrue(expected + 1 == lis4.getMyValue());

		assertTrue(2 == lis1.getInvokeCounter());
		assertTrue(1 == lis2.getInvokeCounter());
		assertTrue(1 == lis4.getInvokeCounter());

		remove(lis);
	}

	@Test
	public void testActiveActive() {
		int expected = 0;
		List<AbstractTestListener> lis = new LinkedList<AbstractTestListener>();
		lis.add(lis3);
		lis.add(lis2);
		init(lis, expected, "testActiveActive");

		assertTrue(expected == lis3.getMyValue());
		assertTrue(expected == lis2.getMyValue());

		expected = 13;
		INDEX.setValue(expected);

		assertTrue(expected + 1 == lis3.getMyValue());
		assertTrue(expected + 2 == lis2.getMyValue());

		assertTrue(1 == lis3.getInvokeCounter());
		assertTrue(1 == lis2.getInvokeCounter());

		remove(lis);
	}

	@Test
	public void testActivePassiveActivePassive() {
		int expected = 0;
		List<AbstractTestListener> lis = new LinkedList<AbstractTestListener>();
		lis.add(lis3);
		lis.add(lis1);
		lis.add(lis2);
		lis.add(lis4);
		init(lis, expected, "testActivePassiveActivePassive");
		
		assertTrue(expected == lis3.getMyValue());
		assertTrue(expected == lis1.getMyValue());
		assertTrue(expected == lis2.getMyValue());
		assertTrue(expected == lis4.getMyValue());

		expected = 13;
		INDEX.setValue(expected);

		assertTrue(expected + 1 == lis3.getMyValue());
		assertTrue(expected + 2 == lis1.getMyValue());
		assertTrue(expected + 2 == lis2.getMyValue());
		assertTrue(expected + 2 == lis4.getMyValue());

		assertTrue(1 == lis3.getInvokeCounter());
		assertTrue(2 == lis1.getInvokeCounter());
		assertTrue(1 == lis2.getInvokeCounter());
		assertTrue(1 == lis4.getInvokeCounter());

		expected = 23;
		INDEX.setValue(expected);

		assertTrue(expected + 1 == lis3.getMyValue());
		assertTrue(expected + 2 == lis1.getMyValue());
		assertTrue(expected + 2 == lis2.getMyValue());
		assertTrue(expected + 2 == lis4.getMyValue());

		assertTrue(2 == lis3.getInvokeCounter());
		assertTrue(3 == lis1.getInvokeCounter());
		assertTrue(2 == lis2.getInvokeCounter());
		assertTrue(2 == lis4.getInvokeCounter());

		remove(lis);
	}

	private void init(List<? extends AbstractTestListener> lis, int expected,
			String head) {
		System.out.println();
		System.out.println("*** " + head);
		INDEX.setValue(expected);

		for (AbstractTestListener listener : lis) {
			listener.setMyValue(expected);
			listener.setInvokeCounter(0);
			INDEX.addListener(listener);
		}
	}

	private void remove(List<? extends IndexListener> lis) {
		for (IndexListener listener : lis)
			INDEX.removeListener(listener);
	}
}
