package org.reuseware.air.util;

import org.eclipse.emf.ecore.EObject;


/**
 * A problem that occurred while processing a file.
 * It contains a message and the problem's position
 * in the file.
 * 
 * @author Jendrik Johannes
 */
public class FileProcessingProblem {
    
    public static final int SEVERITY_WARNING = 0;
    public static final int SEVERITY_PROBLEM = 1;

    protected String message = "";

    protected int start  = 1;
    protected int stop   = 2;
    
    protected int severity = 1;
    
    protected String file = "";
    
    public FileProcessingProblem(String file, int start, int stop, String message) {
        this(file, start, stop, message, 1);
    }

    public FileProcessingProblem(String file, int start, int stop, String message, int severity) {
        this.file = file;
        this.message = message;
        this.start = start;
        this.stop = stop;
        this.severity = severity;
    }
    
    public FileProcessingProblem(EObject element, String message) {
        this(element, message, 1);
    }
    
    public FileProcessingProblem(EObject element, String message, int severity) {
          
        FragmentFileMap m = FragmentFileMap.get();
        
        this.file = m.getFile(element);
        this.message = message;
        this.start = m.getStart(element);
        this.stop = m.getStop(element);
        this.severity = severity;
    }
    

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getMessage() {
        return message;
    }

    public int getSeverity() {
        return severity;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @param severity the severity to set
     */
    public void setSeverity(int severity) {
        this.severity = severity;
    }

    /**
     * @return the start
     */
    public int getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * @return the stop
     */
    public int getStop() {
        return stop;
    }

    /**
     * @param stop the stop to set
     */
    public void setStop(int stop) {
        this.stop = stop;
    }
    
    
    
    
}
