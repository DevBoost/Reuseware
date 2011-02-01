package org.reuseware.coconut.resource;

import java.util.List;

/**
 * Implementations of this interface need to use the 
 * repository to calculate dependencies between
 * artifacts.
 */
public interface ReuseResourceDependencyCalculator {

	/**
	 * Calculates which composition interfaces need to be updated
	 * if the given Fracol has changed.
	 * 
	 * @param fracolID ID of the Fracol that has been changed
	 * @return the composition interfaces to update
	 */
	List<List<String>> getInfluencedCompositionInterfaceIDsFracol(
			List<String> fracolID);

	/**
	 * Calculates which composition interfaces need to be updated
	 * if the given component model specification (REXcm) has changed.
	 * 
	 * @param rexcmID ID of the REXcm that has been changed
	 * @return the composition interfaces to update
	 */
	List<List<String>> getInfluencedCompositionInterfaceIDsRexCM(
			List<String> rexcmID);

	/**
	 * Calculates which composition interfaces need to be updated
	 * if the given reuse extension activator has changed.
	 * 
	 * @param rexActivatorID ID of the reuse extension activator that has been changed
	 * @return the composition interfaces to update
	 */
	List<List<String>> getInfluencedCompositionInterfaceIDsRexActivator(
			List<String> rexActivatorID);

	/**
	 * Calculates which composition programs need to be re-executed
	 * if the given Fracol has changed.
	 * 
	 * @param fracolID ID of the Fracol that has been changed
	 * @return the composition program to re-execute
	 */
	List<List<String>> getInfluencedComposingCompositionProgramIDsFracol(
			List<String> fracolID);

	/**
	 * Calculates which composition programs need to be re-executed
	 * if the given component model specification (REXcm) has changed.
	 * 
	 * @param rexcmID ID of the REXcm that has been changed
	 * @return the composition program to re-execute
	 */
	List<List<String>> getInfluencedComposingCompositionProgramIDsRexCM(
			List<String> rexcmID);
	
	/**
	 * Calculates which composition programs need to be re-executed
	 * if the given reuse extension activator has changed.
	 * 
	 * @param rexActivatorID ID of the reuse extension activator that has been changed
	 * @return the composition program to re-execute
	 */
	List<List<String>> getInfluencedComposingCompositionProgramIDsRexActivator(
			List<String> rexActivatorID);

	/**
	 * Calculates which composition programs need to be re-executed
	 * if the given fragment has changed.
	 * 
	 * @param fragmentID ID of the fragment that has been changed
	 * @return the composition program to re-execute
	 */
	List<List<String>> getInfluencedComposingCompositionProgramIDsFragment(
			List<String> fragmentID);

	/**
	 * Calculates which derived composition programs need to be re-derived
	 * if the given Fracol has changed.
	 * 
	 * @param fracolID ID of the Fracol that has been changed
	 * @return the composition programs to re-derive
	 */
	List<List<String>> getInfluencedDerivedCompositionProgramIDsFracol(
			List<String> fracolID);

	/**
	 * Calculates which derived composition programs need to be re-derived
	 * if the given composition language specifications (REXcl) has changed.
	 * 
	 * @param rexclID ID of the REXcl that has been changed
	 * @return the composition programs to re-derive
	 */
	List<List<String>> getInfluencedDerivedCompositionProgramIDsRexCL(
			List<String> rexclID);

	/**
	 * Calculates which derived composition programs need to be re-derived
	 * if the given fragment from which the programs are derived has changed.
	 * 
	 * @param fragmentID ID of the fragment that has been changed
	 * @return the composition programs to re-derive
	 */
	List<List<String>> getInfluencedDerivedCompositionProgramIDsCompositionProgramSource(
			List<String> fragmentID);
	
	/**
	 * Calculates which derived composition programs need to be re-derived
	 * if the given reuse extension activator has changed.
	 * 
	 * @param rexActivatorID ID of the reuse extension activator that has been changed
	 * @return the composition programs to re-derive
	 */
	List<List<String>> getInfluencedCompositionProgramSourceIDsRexActivator(
			List<String> rexActivatorID);

}