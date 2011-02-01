package org.reuseware.coconut.test.sokan;

import org.reuseware.coconut.test.AbstractReusewareTestHelper;
import org.reuseware.coconut.test.ReusewareFeaturesCompositionTest;


public class SokanReusewareFeaturesCompositionTest extends
		ReusewareFeaturesCompositionTest {

	@Override
	public AbstractReusewareTestHelper getTestHelper() {
		return new SokanReusewareTestHelper();
	}
}
