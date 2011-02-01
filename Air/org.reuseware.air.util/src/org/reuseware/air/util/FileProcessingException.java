package org.reuseware.air.util;

import java.util.Collection;
import java.util.HashSet;

/**
 * Indicates errors during file processing. It contains a set of
 * FileProcessingProblems.
 * 
 * @author Jendrik Johannes
 */
public class FileProcessingException extends Exception {
    
    private static final long serialVersionUID = 1L;
    
    protected Collection<FileProcessingProblem> problems;
    
    /**
     * Constructs a new Exception for the collection of
     * FileProcessingProblems.
     * 
     * @param problems The problems.
     */
    public FileProcessingException(Collection<FileProcessingProblem> problems) {
        this.problems = problems;
    }
    
    /**
     * Constructs a new Exception for a single
     * FileProcessingProblem.
     * 
     * @param problem The problem.
     */
    public FileProcessingException(FileProcessingProblem problem) {
        this.problems = new HashSet<FileProcessingProblem>();
        this.problems.add(problem);
    }

    /**
     * @return All included FileProcessingProblems.
     */
    public Collection<FileProcessingProblem> getProblems() {
        return problems;
    } 
    
    public String toString() {
        String s = "";
        for(FileProcessingProblem p : problems) {
            s +=  p.getMessage() + "\n";
        }
        return s;
    }
    
}
