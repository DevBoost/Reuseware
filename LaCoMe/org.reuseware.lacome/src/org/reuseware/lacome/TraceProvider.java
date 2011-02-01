package org.reuseware.lacome;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;

/**
 * Implementations of this interface provide
 * tracing information between models and copies
 * of models to Lacome. Lacome works with diagrams
 * of copied models and sometimes needs to know
 * how the copies were modified compared to the
 * original models in order to modify the copied 
 * diagrams accordingly.
 */
public interface TraceProvider {
	
	/**
	 * @param copy a copy of a model element
	 * @return the original model element
	 */
	EObject getOriginal(EObject copy);
	
	/**
	 * @param element a model element
	 * @return model elements that were replaced by the given element
	 */
	List<EObject> getReplacedValues(EObject element);

	/**
	 * @param element a model element
	 * @return the setting from which the element was removed (if any)
	 */
	Setting getRemovedFromSetting(EObject element);

	/**
	 * @param element a model element
	 * @return all elements from which this element was derived 
	 *         (e.g., by some kind of model transformation)
	 */
	List<EObject> getDerivedFrom(EObject element);
}
