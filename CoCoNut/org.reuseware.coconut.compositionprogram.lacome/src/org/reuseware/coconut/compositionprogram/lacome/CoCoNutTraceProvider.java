package org.reuseware.coconut.compositionprogram.lacome;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.fragment.util.SyncEcoreUtil;
import org.reuseware.lacome.TraceProvider;

/**
 * A trace provider for Lacome that delegates to
 * <code>SyncEcoreUtil</code>.
 */
public class CoCoNutTraceProvider implements TraceProvider {
	
	/**
	 * Delegates to <code>SyncEcoreUtil.getOriginal()</code>.
	 * 
	 * @param copy the copy
	 * @return the original
	 */
	public EObject getOriginal(EObject copy) {
		return SyncEcoreUtil.getOriginal(copy);
	}
	
	/**
	 * Handles fragment instance that were derived from other
	 * model elements.
	 * 
	 * @param element the fragment instance that was derived
	 * @return <code>FragmentInstance.getDerivedFrom()</code>
	 */
	public List<EObject> getDerivedFrom(EObject element) {
		if (element instanceof FragmentInstance) {
			return ((FragmentInstance) element).getDerivedFrom();
		}
		return Collections.emptyList();
	}

	/**
	 * Delegates to <code>SyncEcoreUtil.getRemovedFromSetting()</code>.
	 * 
	 * @param element the EObject that was removed from some setting
	 * @return the setting from which the EObject was removed
	 */
	public Setting getRemovedFromSetting(EObject element) {
		return SyncEcoreUtil.getRemovedFromSetting(element);
	}

	/**
	 * Delegates to <code>SyncEcoreUtil.getReplacedValues()</code>.
	 * 
	 * @param element the EObject that replaced others
	 * @return the replaced EObjects
	 */
	public List<EObject> getReplacedValues(EObject element) {
		return SyncEcoreUtil.getReplacedValues(element);
	}

}
