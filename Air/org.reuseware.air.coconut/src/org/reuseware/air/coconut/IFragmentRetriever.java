package org.reuseware.air.coconut;

import java.io.InputStream;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.reuseware.air.util.FileProcessingException;



/**
 * To retrieve and print-back fragments.
 * 
 * @author Jendrik Johannes
 */
public interface IFragmentRetriever {
     
    List<EObject> getFragmentFromLocation(String location, EClass type, EObject loadConstruct) throws FileProcessingException;

    List<EObject> getFragmentFromLocation(String location, InputStream content, EClass type, EObject loadConstruct) throws FileProcessingException;
    
    List<EObject> getFragmentFromContent(Object content, String extension, EClass type, EObject loadFragment) throws FileProcessingException;

    Object printFragments(String path, List<EObject> fragments, EObject printFragment) throws FileProcessingException;

    Object printFragmentsToLocation(String path, List<EObject> fragments, EObject printFragment) throws FileProcessingException;
}
