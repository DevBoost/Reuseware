package org.reuseware.coconut.compositionprogram.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.fragment.ComposedFragment;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.fragment.util.SyncEcoreUtil;

/**
 * Management class for the
 * <i>org.reuseware.coconut.compositionprogram.compositionStepPostProcessor</i>
 * extension point.
 */
public final class CompositionStepPostProcessorUtil {
	
	private CompositionStepPostProcessorUtil() { }
	
	/**
	 * Extension point ID:
	 * <i>org.reuseware.coconut.compositionprogram.compositionStepPostProcessor</i>.
	 */
	public static final String COMPOSITION_STEP_POST_PROCESSOR_EP_ID = 
		"org.reuseware.coconut.compositionprogram.compositionStepPostProcessor";
	
	private static List<CompositionStepPostProcessor> postProcessorList = null;
	
	private static void init() {
		if (postProcessorList == null) {
			postProcessorList = new ArrayList<CompositionStepPostProcessor>();
			if (Platform.isRunning()) {
		        IExtensionPoint reporterEP = 
		        	Platform.getExtensionRegistry().getExtensionPoint(COMPOSITION_STEP_POST_PROCESSOR_EP_ID);
		        IConfigurationElement[] entries = reporterEP.getConfigurationElements();
		        
		        for (int i = 0; i < entries.length; i++) {
		        	try {
		        		CompositionStepPostProcessor postProcessor = 
							(CompositionStepPostProcessor) entries[i].createExecutableExtension("class");
		        		postProcessorList.add(postProcessor);
					} catch (CoreException e) {
						e.printStackTrace();
					}
		        }
			}
		}
	}
	
	/**
	 * @return modifiable list of all registered composition step post processors.
	 */
	public static List<CompositionStepPostProcessor> getCompositionStepPostProcessors() {
		init();
		return postProcessorList;
	}
	
	/**
	 * Calls all registered post processors for the composition step identified by
	 * the parameters.
	 * 
	 * @param result the composed fragment to post-process
	 * @param receivingFragmentInstance the fragment instance in the currently processed
	 *        composition program that is the target of the current composition step	 
	 * @param contributingFragments fragments that contributes to the given result
	 */
	public static void process(
			ComposedFragment result, 
			FragmentInstance receivingFragmentInstance,
			List<Fragment> contributingFragments) {
		init();
        SyncEcoreUtil.removeReplaced(result.getContents());
		for (CompositionStepPostProcessor postProcessor : postProcessorList) {
			postProcessor.process(result, receivingFragmentInstance, contributingFragments);
		}
	}

	/**
	 * Calls cleanup operation of all registered post processors for the composed fragment
	 * that is the final result of a series of composition steps.
	 * 
	 * @param result The composed fragment to cleanup.
	 */
	public static void cleanup(ComposedFragment result) {
		init();
		for (CompositionStepPostProcessor postProcessor : postProcessorList) {
			postProcessor.cleanup(result);
		}
		
	}
}
