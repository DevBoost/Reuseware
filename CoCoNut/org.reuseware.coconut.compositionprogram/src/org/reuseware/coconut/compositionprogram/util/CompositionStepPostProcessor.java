package org.reuseware.coconut.compositionprogram.util;

import java.util.List;

import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.fragment.ComposedFragment;
import org.reuseware.coconut.fragment.Fragment;

/**
 * An interface that needs to be implemented by extensions for the
 * <i>org.reuseware.coconut.compositionprogram.compositionStepPostProcessor</i>
 * extension point.
 */
public interface CompositionStepPostProcessor {
	
	/**
	 * An implementation of this method may perform post-composition modifications
	 * of the given composed fragment.
	 * 
	 * @param result the composed fragment to post-process
	 * @param receivingFragmentInstance the fragment instance in the currently processed
	 *        composition program that is the target of the current composition step
	 * @param contributingFragments fragments that contributes to the given result
	 */
	void process(
			ComposedFragment result, 
			FragmentInstance receivingFragmentInstance, 
			List<Fragment> contributingFragments);
	
	/**
	 * Performs cleanup operations on a composed fragments (e.g. removing dangling edges).
	 * 
	 * @param result the composed fragment to cleanup
	 */
	void cleanup(
			ComposedFragment result);

}
