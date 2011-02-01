package org.reuseware.air.util;

import org.eclipse.emf.ecore.EPackage;

public interface IModelFinder {
    
    public EPackage findModel(String uri);

}
