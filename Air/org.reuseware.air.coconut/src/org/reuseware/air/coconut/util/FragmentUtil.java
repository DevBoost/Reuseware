package org.reuseware.air.coconut.util;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.reuseware.air.language.componentmodel.AbstractVariationPointName;
import org.reuseware.air.language.componentmodel.Slot;
import org.reuseware.air.language.componentmodel.VariationPointName;

public class FragmentUtil {

	
    /**
     * Checks if a fragment contains a slot
     * 
     * @param fragment
     * @return slot name if a slot is found, null otherwise 
     */
    public static String containsSlot(EObject fragment) {
    	
		for (Iterator<EObject> iter = fragment.eAllContents(); iter.hasNext(); ) {

			EObject obj = (EObject) iter.next();
			if (obj instanceof Slot) {
				Slot slot = (Slot)obj;
				AbstractVariationPointName name = slot.getName(); 
				return ((VariationPointName)name).getName(); 
			}
		}
    	
    	// default 
    	return null;
    }
    
    /**
     * Remove a set of objects
     * 
     * @param fl
     * @return
     */
    public static boolean selfRemove(List<EObject> fl) {
        boolean r = true;
        for(EObject f : fl) {
          	r = selfRemove(f) && r;
        }
        return r;
    }
    
    /**
     * Remove a model instance 
     * 
     * @param f
     * @return
     */
    public static boolean selfRemove(EObject f) {
        if (f.eContainer() != null) {
            Object eo = f.eContainer().eGet(f.eContainingFeature());
            if (eo instanceof EList) {
                EList el = (EList) eo;
                el.remove(f);
            } else {
                if (f.eContainingFeature().getLowerBound() == 0) {
                    f.eContainer().eSet(f.eContainingFeature(), null);
                }
                else
                  return false;
            }   
        }
        return true;
    }
    
}

