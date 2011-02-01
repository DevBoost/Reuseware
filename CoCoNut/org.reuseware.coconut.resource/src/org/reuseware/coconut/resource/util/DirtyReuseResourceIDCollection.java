package org.reuseware.coconut.resource.util;

import java.util.ArrayList;
import java.util.List;

/**
 * A collection of artifacts that need to be re-analyzed for specific purposes.
 */
public class DirtyReuseResourceIDCollection {
	
	protected List<List<String>> fragmentCompositionInterfaceIDs = new ArrayList<List<String>>();
	protected List<List<String>> derivedCompositionProgramIDs = new ArrayList<List<String>>();
	protected List<List<String>> composingCompositionProgramIDs = new ArrayList<List<String>>();
	protected List<List<String>> compositionProgramSourceIDs = new ArrayList<List<String>>();
	
	/**
	 * @return modifiable list of fragment IDs for which the composition interface needs
	 *         to be re-computed.
	 */
	public List<List<String>> getFragmentCompositionInterfaceIDs() {
		return fragmentCompositionInterfaceIDs;
	}
	
	/**
	 * @return modifiable list of derived composition program IDs that point at 
	 *         composition programs which needs to be derived again.
	 */
	public List<List<String>> getDerivedCompositionProgramIDs() {
		return derivedCompositionProgramIDs;
	}
	
	/**
	 * 
	 * @return modifiable list of composition program IDs that need  
	 *         to be re-executed.
	 */
	public List<List<String>> getComposingCompositionProgramIDs() {
		return composingCompositionProgramIDs;
	}
	
	/**
	 * 
	 * @return modifiable list of fragment IDs that are source of one or more  
	 *         composition program derivation(s) and which therefore need to be 
	 *         associated with the corresponding derived composition programs.
	 */
	public List<List<String>> getCompositionProgramSourceIDs() {
		return compositionProgramSourceIDs;
	}
}
