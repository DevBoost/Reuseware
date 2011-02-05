/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.sokan.resource.util;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.reuseware.sokan.Store;
import org.reuseware.sokan.index.SokanIndexPlugin;
import org.reuseware.sokan.index.util.SokanConst;
import org.reuseware.sokan.index.util.StoreUtil;
import org.reuseware.sokan.resource.build.StoreVisitor;

/**
 * Utility methods for configuring the index builder for
 * projects and for marking projects or folders as
 * Sokan stores.
 */
public final class BuildUtil {
	
	private BuildUtil() { }
	
	private static final StoreUtil STORE_UTIL = StoreUtil.INSTANCE;

	/**
	 * Configures the index builder for the given project.
	 * 
	 * @param project the project
	 * @throws CoreException if this method fails.
	 */
	public static void addIndexBuilder(IProject project) throws CoreException {
		if (project == null) {
			return;
		}
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();

		for (ICommand com : commands) {
			if (com.getBuilderName().equals(SokanConst.ID_INDEX_BUILDER)) {
				return;
			}
		}

		ICommand command = desc.newCommand();
		command.setBuilderName(SokanConst.ID_INDEX_BUILDER);
		// command.setArguments(calcBuilderArguments(project));

		ICommand[] newCommands = new ICommand[commands.length + 1];
		System.arraycopy(commands, 0, newCommands, 0, commands.length);
		newCommands[newCommands.length - 1] = command;
		desc.setBuildSpec(newCommands);
		project.setDescription(desc, null);
	}

	/**
	 * Adds the repository nature to the given project.
	 * 
	 * @param project the project
	 */
	public static void addRepositoryNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			for (String id : natures) {
				if (id.equals(SokanConst.ID_REPOSITORY_NATURE)) {
					//nature already assigned
					return;
				}
			}

			// Add the nature
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = SokanConst.ID_REPOSITORY_NATURE;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		} catch (CoreException e) {
			SokanIndexPlugin.logError("", e);
		}
	}

	/**
	 * Gets the index builder build command from the given project configuration.
	 * 
	 * @param project the project
	 * @return the index build command
	 */
	public static ICommand getBuilderCommand(IProject project) {
		try {
			IProjectDescription desc = project.getDescription();
			for (ICommand icom : desc.getBuildSpec()) {
				if (icom.getBuilderName().equals(SokanConst.ID_INDEX_BUILDER)) {
					return icom;
				}
			}
		} catch (CoreException e) {
			SokanIndexPlugin.logError("", e);
			return null;
		}

		return null;
	}

	/**
	 * Determines whether the given project has 
	 * the index builder configured.
	 * 
	 * @param project the project
	 * @return true if the index builder is configured
	 */	
	public static boolean hasIndexBuilder(IProject project) {
		if (getBuilderCommand(project) == null) {
			return false;
		}
		return true;
	}

	/**
	 * Determines whether the given project already has 
	 * the repository nature.
	 * 
	 * @param project the project
	 * @return true if the repository nature if configured
	 */
	public static boolean hasRepositoryNature(IProject project) {
		try {
			String[] natures = project.getDescription().getNatureIds();

			for (String natureID : natures) {
				if (SokanConst.ID_REPOSITORY_NATURE.equals(natureID)) {
					return true;
				}
			}
		} catch (CoreException e) {
			SokanIndexPlugin.logError("", e);
			return false;
		}

		return false;
	}

	/**
	 * Removes the index builder from the given project.
	 * 
	 * @param project the project
	 * 
	 * @throws CoreException if this method fails.
	 */
	public static void removeIndexBuilder(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		ICommand[] commands = description.getBuildSpec();
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName()
					.equals(SokanConst.ID_INDEX_BUILDER)) {
				ICommand[] newCommands = new ICommand[commands.length - 1];
				System.arraycopy(commands, 0, newCommands, 0, i);
				System.arraycopy(commands, i + 1, newCommands, i,
						commands.length - i - 1);
				description.setBuildSpec(newCommands);
				project.setDescription(description, null);
				return;
			}
		}
	}

	/**
	 * Removes the repository nature and with that the 
	 * index builder from the given project.
	 * 
	 * @param project the project
	 */
	public static void removeRepositoryNature(IProject project) {
		try {
			if (StoreUtil.INSTANCE.getStoreCount(project) < 1) {
				project
						.build(IncrementalProjectBuilder.INCREMENTAL_BUILD,
								null);
			}

			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();

			for (int i = 0; i < natures.length; ++i) {
				if (SokanConst.ID_REPOSITORY_NATURE.equals(natures[i])) {
					// Remove the nature
					String[] newNatures = new String[natures.length - 1];
					System.arraycopy(natures, 0, newNatures, 0, i);
					System.arraycopy(natures, i + 1, newNatures, i,
							natures.length - i - 1);
					description.setNatureIds(newNatures);
					project.setDescription(description, null);
				}
			}
		} catch (CoreException e) {
			SokanIndexPlugin.logError("", e);
		}
	}

	/**
	 * Toggles the given container from being a store to not being a store.
	 * 
	 * @param container the container to toggle
	 * @param store the store representation, if the container was a store before
	 * @return true if toggling succeeded
	 */
	public static boolean toggleStore(IContainer container, Store store) {
		boolean hasToggled = toggleStoreMarker(container, store);
		if (hasToggled) {
			toggleNature(container);
		}
		return hasToggled;
	}

	/**
	 * Visits the given store container and adds or removes contained
	 * files from the index.
	 * 
	 * @param storeContainer the container that is or was a store
	 * @param pattern a file name pattern to decide which files to include
	 * @param addMode true if we are adding a store; false if we are removing one
	 */
	public static void visitStore(IContainer storeContainer, String pattern,
			boolean addMode) {
		try {
			storeContainer.accept(new StoreVisitor(pattern, addMode));
		} catch (Exception e) {
			SokanIndexPlugin.logError("There was an error during store update.", e);
		}
	}

	private static boolean toggleStoreMarker(IContainer container, Store store) {
		boolean storeIsNew = !STORE_UTIL.unmarkStore(container);
		if (!storeIsNew) {
			return true;
		}
		if (store == null) {
			return false;
		}
		return STORE_UTIL.markStore(container, store);
	}

	private static void toggleNature(IContainer container) {
		try {
			int storeCount = STORE_UTIL.getStoreCount(container.getProject());
			if (storeCount == 0) {
				removeRepositoryNature(container
						.getProject());
			} else {
				addRepositoryNature(container
						.getProject());
			}
		} catch (Exception e) {
			SokanIndexPlugin.logError("", e);
		}
	}
}
