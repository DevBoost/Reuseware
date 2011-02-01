package org.reuseware.air.comogen.output;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.reuseware.air.comogen.ICompositionSystemContext;

/**
 * Output generators produce physical resources in the workspace.
 * 
 * @author skarol
 */

public interface IOutputGenerator {
	
	public abstract void generate(IJavaProject project, ICompositionSystemContext systemContext) throws IOException,CoreException;

	
}
