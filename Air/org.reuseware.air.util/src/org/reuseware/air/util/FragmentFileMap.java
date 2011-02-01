package org.reuseware.air.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public class FragmentFileMap {
    
    private Map<EObject, Integer> start = new HashMap<EObject, Integer>();
    private Map<EObject, Integer> stop  = new HashMap<EObject, Integer>();
    private Map<EObject, String>  file  = new HashMap<EObject, String>();    

    private static FragmentFileMap ffMap = null;
    
    private FragmentFileMap(){
        
    }
    
    public static FragmentFileMap get() {
        if (ffMap == null) {
            ffMap = new FragmentFileMap();
        }
        return ffMap;
    }
    
    public void clean() {
        file.clear();
        start.clear();
        stop.clear();
    }
    
    public int getStart(EObject fragment) {
        if (!start.containsKey(fragment)) return 0;
        return start.get(fragment);
    }
    
    public void setStart(EObject fragment, int pos) {
        if (fragment == null) return;
        if (start.get(fragment) == null ) {
            start.put(fragment, pos);
        }
    }
    
    public int getStop(EObject fragment) {
        if (!stop.containsKey(fragment)) return 0;
        return stop.get(fragment);
    }
    
    public void setStop(EObject fragment, int pos) {
        if (fragment == null) return;
        stop.put(fragment, pos);
    }
    
    public String getFile(EObject fragment) {
        return file.get(fragment);
    }

    public void setFile(EObject fragment, String name) {
        if (fragment == null) return;
        file.put(fragment, name);
    }
    
    public void clear() {
        start.clear();
        stop.clear();
        file.clear();
    }

}
