/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.compositionprogram.lacome;

import java.util.ArrayList;
import java.util.List;

import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.util.CompositionStepPostProcessor;
import org.reuseware.coconut.fragment.ComposedFragment;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.lacome.CompositionDiagramUtil;
import org.reuseware.lacome.DiagramDescription;
import org.reuseware.lacome.TraceProvider;

/**
 * Post processor that calls into Lacome to compose the diagram
 * layout associated with the model fragments involved in a 
 * composition step.
 */
public class LaCoMeCompositionStepPostProcessor implements
		CompositionStepPostProcessor {

	/**
	 * The argument that can be set on a fragment instance to define a 
	 * layout adjustment strategy:
	 * <i>layoutStrategy</i>.
	 */
	public static final String LAYOUT_STRATEGY_ARGUMENT = "layoutStrategy";
	
	private TraceProvider traceProvider = new CoCoNutTraceProvider();

	/**
	 * Calls Layome's <code>CompositionDiagramUtil.composeDiagrams()</code>.
	 * 
	 * @param result the composed fragment to post-process
	 * @param receivingFragmentInstance the fragment instance in the currently processed
	 *        composition program that is the target of the current composition step
	 * @param contributingFragments fragments that contributes to the given result
	 */
	public void process(
			ComposedFragment result, 
			FragmentInstance receivingFragmentInstance, 
			List<Fragment> contributingFragments) {
        List<DiagramDescription> contributingDiagrams = new ArrayList<DiagramDescription>();
		for (FragmentInstance aFragmentInstance : receivingFragmentInstance.getCompositionProgram().getFragmentInstances()) {
			if (!aFragmentInstance.equals(receivingFragmentInstance)) {
				for (Fragment aContributingFragment : aFragmentInstance
						.getInstantiations()) {
					if (contributingFragments.contains(aContributingFragment)) {
						DiagramDescription contributingDiagram = new DiagramDescription(
								aContributingFragment.getContents(),
								aContributingFragment.getDiagrams(),
								aFragmentInstance, 
								aFragmentInstance.getArguments().get(LAYOUT_STRATEGY_ARGUMENT));
						contributingDiagrams.add(contributingDiagram);
					}
				}
			}
		}

        DiagramDescription receivingDiagram = new DiagramDescription(
        		result.getContents(), 
        		result.getDiagrams(), 
        		receivingFragmentInstance, 
        		receivingFragmentInstance.getArguments().get(LAYOUT_STRATEGY_ARGUMENT));
        CompositionDiagramUtil.composeDiagrams(
        		contributingDiagrams, receivingDiagram, traceProvider);
	}

	/**
	 * Calls Layome's <code>CompositionDiagramUtil.cleanup()</code>.
	 * 
	 * @param result the composed fragment to cleanup
	 */
	public void cleanup(ComposedFragment result) {
		DiagramDescription diagramToCleanUp = new DiagramDescription(
        		result.getContents(), 
        		result.getDiagrams(), 
        		null, 
        		null);
		CompositionDiagramUtil.cleanup(
				diagramToCleanUp);
	}
}
