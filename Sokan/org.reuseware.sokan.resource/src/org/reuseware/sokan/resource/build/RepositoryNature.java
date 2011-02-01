package org.reuseware.sokan.resource.build;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.reuseware.sokan.resource.util.BuildUtil;

/**
 * A nature to associate the <code>IndexBuilder</code>
 * with a project in the workspace. It is automatically 
 * added to a project if one of the project's folders is 
 * marked as Sokan store.
 */
public class RepositoryNature implements IProjectNature {

	private IProject project;

	/**
	 * Adds the index builder to the current project.
	 * 
	 * @throws CoreException if this method fails.
	 */
	public void configure() throws CoreException {
		BuildUtil.addIndexBuilder(project);
	}

	/**
	 * Removes the index builder from the current project.
	 * 
	 * @throws CoreException if this method fails.
	 */
	public void deconfigure() throws CoreException {
		BuildUtil.removeIndexBuilder(project);
	}

	/**
	 * @return the current project.
	 */
	public IProject getProject() {
		return project;
	}

	/**
	 * Sets the current project.
	 * 
	 * @param project the project
	 */
	public void setProject(IProject project) {
		this.project = project;
	}
}
