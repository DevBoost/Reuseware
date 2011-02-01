/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.roundtrip.test.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class ImportOperation {

	private static final int POLICY_DEFAULT = 0;

	private static final int POLICY_FORCE_OVERWRITE = 2;

	private Object source;
	private List<Object> selectedFiles;

	private IContainer destinationContainer;

	public ImportOperation(IContainer destContainer, Object source) {
		super();
		setDestContainer(destContainer);
		this.source = source;
	}

	public ImportOperation(IContainer destContainer, Object source,
			List<Object> filesToImport) {
		this(destContainer, source);
		setFilesToImport(filesToImport);
	}

	// imports specified file object from the file system
	public void execute() throws FileNotFoundException {
		importFileSystemObjects(selectedFiles);
	}

	void importFileSystemObjects(List<Object> resourcesToImport)
			throws FileNotFoundException {
		Iterator<Object> filesEnum = resourcesToImport.iterator();
		while (filesEnum.hasNext()) {
			Object fileSystemResource = filesEnum.next();
			// if (sourcePath == null) {
			// // We just import what we are given into the destination
			// //IPath sourcePath = new Path(fileSystemResource.getFullPath()
			// // .removeLastSegments(1).toString());
			// // sourcePath =
			// ((File)fileSystemResource).getPath().removeLastSegments(1);
			//				
			// /*if ((fileSystemResource.getType() == IResource.FOLDER)
			// && sourcePath.isEmpty()) {
			// // If we don't have a parent then we have
			// // selected the
			// // file systems root. Roots can't copied (at least not
			// // under windows).
			// continue;
			// }*/
			// if(((File)fileSystemResource).isDirectory()){
			// continue;
			// }
			// //sourcePath = new Resource(sourcePath.toString());
			// this.sourcePath = sourcePath;
			// }
			importRecursivelyFrom(fileSystemResource, POLICY_DEFAULT);
		}
	}

	void importRecursivelyFrom(Object fileSystemResource, int policy)
			throws FileNotFoundException {

		if (((File) fileSystemResource).isFile()) {
			importFile((File) fileSystemResource, policy);
			return;
		}

		if (!((File) fileSystemResource).getName().toLowerCase().endsWith(
				".svn")) {
			int childPolicy = importFolder((File) fileSystemResource, policy);
			File[] children;
			children = ((File) fileSystemResource).listFiles();
			for (int i = 0; i < children.length; i++) {
				importRecursivelyFrom(children[i], childPolicy);
			}
		}

	}

	/**
	 * Imports the specified file system container object into the workspace. If
	 * the import fails, adds a status object to the list to be returned by
	 * <code>getResult</code>.
	 * 
	 * @param folderObject
	 *            the file system container object to be imported
	 * @param policy
	 *            determines how the folder object and children are imported
	 * @return the policy to use to import the folder's children
	 */
	int importFolder(File folderObject, int policy) {

		IContainer containerResource;
		try {
			containerResource = getDestinationContainerFor(folderObject);
		} catch (CoreException e) {
			return policy;
		}

		if (containerResource == null) {
			return policy;
		}

		IWorkspace workspace = destinationContainer.getWorkspace();
		IPath containerPath = containerResource.getFullPath();
		IPath resourcePath = containerPath.append(folderObject.getName());

		// Do not attempt the import if the resource path is unchanged.
		// This may happen
		// when importing from a zip file.
		if (resourcePath.equals(containerPath)) {
			return policy;
		}

		if (workspace.getRoot().exists(resourcePath)) {
			return POLICY_FORCE_OVERWRITE;
		}

		try {
			workspace.getRoot().getFolder(resourcePath).create(false, true,
					null);
		} catch (CoreException e) {
			// TODO:
		}

		return policy;
	}

	/**
	 * Imports the specified file system object into the workspace. If the
	 * import fails, adds a status object to the list to be returned by
	 * <code>getResult</code>.
	 * 
	 * @param fileObject
	 *            the file system object to be imported
	 * @param policy
	 *            determines how the file object is imported
	 * @throws FileNotFoundException
	 */
	void importFile(File fileObject, int policy) throws FileNotFoundException {
		IContainer containerResource;
		try {
			containerResource = getDestinationContainerFor(fileObject);
		} catch (CoreException e1) {
			return;
		}

		String fileObjectPath = fileObject.toString();

		IFile targetResource = containerResource.getFile(new Path(fileObject
				.getName()));

		// ensure that the source and target are not the same
		IPath targetPath = targetResource.getLocation();
		// Use Files for comparison to avoid platform specific case
		// issues
		if (targetPath != null
				&& (targetPath.toFile().equals(new File(fileObjectPath)))) {
			return;
		}

		FileInputStream contentStream = new FileInputStream(fileObject
				.getPath());

		if (contentStream == null) {
			return;
		}

		try {
			if (targetResource.exists()) {
				targetResource.setContents(contentStream,
						IResource.KEEP_HISTORY, null);
			} else {
				targetResource.create(contentStream, false, null);
			}
			setResourceAttributes(targetResource, fileObject);

		} catch (CoreException e) {
			// TODO:
		}
	}

	/**
	 * Returns the container resource that the passed file system object should
	 * be imported into.
	 * 
	 * @param fileSystemObject
	 *            the file system object being imported
	 * @return the container resource that the passed file system object should
	 *         be imported into
	 * @exception CoreException
	 *                if this method failed
	 */
	IContainer getDestinationContainerFor(File fileSystemObject)
			throws CoreException {
		IPath pathname = new Path(fileSystemObject.getPath());

		if ((File) source == fileSystemObject) {
			return null;
		}
		// IPath sourcePath = new Path(source.getFullPath().toString());
		IPath sourcePath = new Path(((File) source).getPath());
		IPath destContainerPath = pathname.removeLastSegments(1);
		IPath relativePath = destContainerPath.removeFirstSegments(
				sourcePath.segmentCount()).setDevice(null);
		return createContainersFor(relativePath);
	}

	/**
	 * Creates the folders that appear in the specified resource path. These
	 * folders are created relative to the destination container.
	 * 
	 * @param path
	 *            the relative path of the resource
	 * @return the container resource corresponding to the given path
	 * @exception CoreException
	 *                if this method failed
	 */
	IContainer createContainersFor(IPath path) throws CoreException {

		IContainer currentFolder = destinationContainer;

		int segmentCount = path.segmentCount();

		// No containers to create
		if (segmentCount == 0) {
			return currentFolder;
		}

		for (int i = 0; i < segmentCount; i++) {
			currentFolder = currentFolder.getFolder(new Path(path.segment(i)));
			if (!currentFolder.exists()) {
				((IFolder) currentFolder).create(false, true, null);
			}
		}

		return currentFolder;
	}

	public void setFilesToImport(List<Object> filesToImport) {
		this.selectedFiles = filesToImport;
	}

	private void setDestContainer(IContainer destContainer) {
		this.destinationContainer = destContainer;
	}

	/**
	 * Reuse the file attributes set in the import.
	 * 
	 * @param targetResource
	 * @param fileObject
	 */
	private void setResourceAttributes(IFile targetResource, Object fileObject) {
		if (fileObject instanceof File) {
			try {
				targetResource.setResourceAttributes(ResourceAttributes
						.fromFile((File) fileObject));
			} catch (CoreException e) {
				// TODO:
			}
		}
	}
}
