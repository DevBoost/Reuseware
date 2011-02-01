package org.reuseware.air.core.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public abstract class GenericCompositionAlgebra {


	/**
	 * Replace a fragment with another 
	 * 
	 * @param oldFragment fragment to be replaced
	 * @param valueFragments fragment to replace 
	 * @return
	 */
	public static List<EObject> replace(EObject oldFragment, List<EObject> valueFragments) {

		// TODO: more advanced type check 

		// System.out.println("REPLACE!");

		EObject            container        = oldFragment.eContainer();
		EStructuralFeature containerFeature = oldFragment.eContainmentFeature();

		if (container == null)
			return null; 
		
		Object eo = container.eGet(containerFeature); 

		// copy fragments
		List<EObject> fragmentsToBind = valueFragments; 
		List<EObject> fCopies = copyFragments(fragmentsToBind);

		// System.out.println("Fragment to replace: " + fCopies.get(0).toString()); 

		if (eo instanceof EList) {
			@ SuppressWarnings("unchecked") 
			EList<EObject> el = (EList<EObject>) eo; 

			if (!((EReference)containerFeature).isContainment()) {
				// System.out.println("REPL 1");

				// bind several fragments in one go
				for (EObject f : fCopies) {
					el.add(el.indexOf(oldFragment), f); 
				}
				// remove slot 
				el.remove(oldFragment); 
				//el.add(soloFragmentToBind); 
			}
			else {
//				System.out.println("REPL 2: " + old + ", Num Of Fragments: " + fCopies.size());

				// bind several fragments in one go
				for (EObject f : fCopies) {

					//f.eSet(old.eg, arg1)
					el.add(el.indexOf(oldFragment), f); 
				}
				// remove slot 
				el.remove(oldFragment);
			}
		} else {
			// System.out.println("REPL 3"); 
			// only bind one copy 
			
			container.eSet(containerFeature, fCopies.get(0));
		}

		// Maintain the reference between the target and the transformed fragment 
		List<EObject> newTarget = new ArrayList<EObject>();
		for (EObject f : fCopies) {
			newTarget.add(f);
		}
		
		return newTarget;
		//target.setFragments(newTarget);
	}
	
	
	/**
	 * Copy a fragment list
	 * 
	 * @param fragment
	 * @return
	 */
	public static List<EObject> copyFragments(List<EObject> fragments) {

		List<EObject> result = new Vector<EObject>();

		for (EObject fragment : fragments) {
			result.add(EcoreUtil.copy(fragment));
		}

		return result;
	}

}
