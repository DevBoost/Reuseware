package org.reuseware.air.util;

import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;


/**
 * Utility class to add markers to files based on FileProcessingProblems.
 * 
 * @author Jendrik Johannes
 */
public class FileMarker {
    
    public static final String MARKER_TYPE = "de.tudresden.reuseware.coconut.ui.eclipse.problem";
    
    /**
     * Marks a file with markers.
     * 
     * @param file The file to mark.
     * @param e The FileProcessingException containing the FileProcessingProblems.
     * @throws CoreException
     */
    public static void mark(FileProcessingException e, IProject project) throws CoreException {
        IMarker marker;
        IFile file;
        
        for(FileProcessingProblem p : e.getProblems()) {
            if (p.getFile() == null) {
                file = project.getFile("/ecomogen.error");
                if (!file.exists()) file.create(new ByteArrayInputStream("error source unknown!".getBytes()), true, new NullProgressMonitor());
            }
            else {
                file = project.getFile(p.getFile().substring(p.getFile().substring(2).indexOf("/") + 2));
            }
            marker = file.createMarker(MARKER_TYPE);

            if (p.getSeverity() == FileProcessingProblem.SEVERITY_WARNING) {
                marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
            }
            else {
                marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
            }
            
            marker.setAttribute(IMarker.MESSAGE, p.getMessage());
            
            marker.setAttribute(IMarker.CHAR_START, p.getStart());
            marker.setAttribute(IMarker.CHAR_END, p.getStop() + 1);

        }
        
        

    }
    
    public static void unmark(IFile file) throws CoreException {
        file.deleteMarkers(FileMarker.MARKER_TYPE, false, IResource.DEPTH_ZERO);    
    }

}
