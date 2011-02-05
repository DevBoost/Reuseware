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
package org.reuseware.sokan.index.util;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.reuseware.sokan.Filter;
import org.reuseware.sokan.SokanFactory;
import org.reuseware.sokan.Store;
import org.reuseware.sokan.index.SokanIndexPlugin;

/**
 * Utility to manage stores.
 */
public final class StoreUtil {

	/**
	 * The singleton instance.
	 */
	public static final StoreUtil INSTANCE = new StoreUtil();
	
	private StoreUtil() {
		deletedStores = new LinkedHashSet<Store>();
		externalStores = new LinkedHashSet<URI>();
	}
	
	/**
	 * File extension of the .project file.
	 */
	public static final String FILE_EXT_PROJECT = "project";
	/**
	 * File extension of the .store file.
	 */
	public static final String FILE_EXT_STORE = "store";
	/**
	 * Name of the .project file.
	 */
	public static final String FILE_PROJECT = "." + FILE_EXT_PROJECT;
	/**
	 * Name of the .store file.
	 */
	public static final String FILE_STORE = "." + FILE_EXT_STORE;

	private Set<Store> deletedStores;
	private Set<IContainer> workspaceStores;
	private Set<URI> externalStores;

	/**
	 * Obtains the filter pattern defined for the given store container.
	 * 
	 * @param storeContainer the container that is a store
	 * @return the filter pattern
	 */
	public String acquireFilterPattern(IContainer storeContainer) {
		if (!isStore(storeContainer) && !wasStore(storeContainer)) {
			return null;
		}
		String filter = "";
		Store store = loadStore(storeContainer);
		if (store == null) {
			store = loadDeletedStore(storeContainer);
		}
		if (store == null) {
			return null;
		}

		for (Filter f : store.getFilters()) {
			filter += f.getPattern() + ",";
		}
		return CoreUtil.trimLastChar(filter);
	}

	/**
	 * Obtains the filter pattern defined for the store that contains the given file.
	 * 
	 * @param file the file
	 * @return the filter pattern
	 */
	public String acquireFilterPattern(IFile file) {
		IContainer store = INSTANCE.getStoreContainerFor(file);
		return acquireFilterPattern(store);
	}

	/**
	 * Create a store out of the given container and the given set of patterns.
	 * 
	 * @param patterns the patterns
	 * @param container the container
	 * @return the store handle
	 */
	public Store buildStore(List<String> patterns, IContainer container) {
		if (patterns == null || patterns.size() == 0) {
			return null;
		}
		Store store = SokanFactory.eINSTANCE.createStore();
		store.setUriBuffer(ResourceUtil.uriString(container));
		for (String string : patterns) {
			Filter filter = SokanFactory.eINSTANCE.createFilter();
			filter.setPattern(string);
			store.getFilters().add(filter);
		}

		return store;
	}
	
	/**
	 * Define a new store that is not inside the Eclipse workspace
	 * (i.e., there is no IContainer representing the store).
	 * 
	 * @param storeURI the URI of the folder that is the store
	 */
	public void addExternalStore(URI storeURI) {
		externalStores.add(storeURI);
	}

	/**
	 * Remove the store of the given container if it was marked as deleted.
	 * 
	 * @param storeContainer the container that is a store
	 */
	public void removeDeletedStores(IContainer storeContainer) {
		if (!wasStore(storeContainer)) {
			return;
		}
		Store store = loadDeletedStore(storeContainer);
		if (store != null) {
			deletedStores.remove(store);
		}
	}

	/**
	 * Find a resource in the resource hierarchy.
	 * 
	 * @param resourceName name of the resource
	 * @param resources the list to which the found resource will be added
	 * @param parent the root of the resource hierarchy
	 */
	public void findResource(String resourceName, Set<IResource> resources,
			IContainer parent) {
		try {
			if (parent instanceof IProject && !((IProject) parent).isOpen()) {
				return;
			}
			if (parent == null || resources == null) {
				return;
			}
			for (IResource iRes : parent.members(false)) {
				if (iRes.getName().equals(resourceName)) {
					resources.add(iRes);
				}
				if (iRes instanceof IContainer) {
					findResource(resourceName, resources, (IContainer) iRes);
				}
			}
		} catch (CoreException e) {
			SokanIndexPlugin.logError("", e);
		}

	}

	/**
	 * Collect the file endings of all resources in the given resource hierarchy.
	 * 
	 * @param endings list in which to store the found endings
	 * @param parent root of the resource hierarchy
	 */
	public void findFileEndings(Set<String> endings, IContainer parent) {
		try {
			String fileEnd;
			for (IResource iRes : parent.members(false)) {
				if (iRes instanceof IFile) {
					fileEnd = ((IFile) iRes).getFileExtension();
					if (fileEnd.equals(FILE_EXT_STORE)
							|| fileEnd.equals(FILE_EXT_PROJECT)) {
						continue;
					}
					endings.add(fileEnd);
					continue;
				}

				if (iRes instanceof IContainer) {
					findFileEndings(endings, (IContainer) iRes);
				}
			}
		} catch (CoreException e) {
			SokanIndexPlugin.logError("", e);
		}
	}
	
	/**
	 * Collect the file endings of all resources in the given resource hierarchy.
	 * 
	 * @param container root of the resource hierarchy
	 * @return found endings
	 */
	public String[] grabFileEndings(IContainer container) {
		Set<String> back = new TreeSet<String>();
		findFileEndings(back, container);
		return back.toArray(new String[0]);
	}

	/**
	 * @param container the container
	 * @return all stores under the given container
	 */
	public List<URI> getAllStoreURIs(IContainer container) {
		List<URI> uris = new LinkedList<URI>();
		for (IContainer con : getAllStores(container)) {
			uris.add(ResourceUtil.uriFrom(con));
		}
		return uris;
	}

	/**
	 * Finds all stores.
	 *
	 * @return list of URIs pointing at the stores
	 */
	public List<URI> getAllStoreURIs() {
		List<URI> uris = new LinkedList<URI>();
		for (IContainer container : getWorkspaceStores()) {
			uris.add(ResourceUtil.uriFrom(container));
		}
		uris.addAll(externalStores);
		return uris;
	}

	/**
	 * @return all stores marked as deleted
	 */
	public List<URI> getAllDeletedStoreURIs() {
		List<URI> uris = new LinkedList<URI>();
		for (Store store : deletedStores) {
			uris.add(ResourceUtil.uriFrom(store.getUriBuffer()));
		}
		return uris;
	}

	/**
	 * @param container the container
	 * @return all stores under the given container
	 */
	public Set<IContainer> getAllStores(IContainer container) {
		Set<IResource> storeFiles = new LinkedHashSet<IResource>();
		findResource(FILE_STORE, storeFiles, container);

		if (storeFiles.size() == 0) {
			return Collections.emptySet();
		}
		Set<IContainer> stores = new LinkedHashSet<IContainer>();
		for (IResource file : storeFiles) {
			stores.add(file.getParent());
		}

		return stores;
	}

	/**
	 * @return all stores inside the Eclipse workspace
	 */
	public Set<IContainer> getWorkspaceStores() {
		if (workspaceStores == null) {
			workspaceStores = new LinkedHashSet<IContainer>();
			if (Platform.isRunning()) {
				IProject[] projects = ResourcesPlugin.getWorkspace(
						).getRoot().getProjects();
				for (IProject project : projects) {
					workspaceStores.addAll(getAllStores(project));
				}
			}
		}

		return workspaceStores;
	}

	/**
	 * @param container the container
	 * @return number of stores under the given container
	 */
	public int getStoreCount(IContainer container) {
		Set<IResource> storeFiles = new LinkedHashSet<IResource>();
		findResource(FILE_STORE, storeFiles, container);
		return storeFiles.size();
	}

	/**
	 * 
	 * @param resource the resource
	 * @return the container that is the store containing the given resource
	 */
	public IContainer getStoreContainerFor(IResource resource) {
		if (resource == null) {
			return null;
		}
		String resStr = resource.getFullPath().toString();
		String storeStr;
		for (IContainer container : getWorkspaceStores()) {
			storeStr = container.getFullPath().toString();
			if (resStr.equals(storeStr)) {
				return container;
			}
			if (resStr.startsWith(storeStr + "/")) {
				return container;
			}
		}

		return null;
	}

	/**
	 * @param uri the artifacts's URI
	 * @return the URI of the store that contains the given artifact
	 */
	public URI getStoreContainerFor(URI uri) {
		if (uri == null) {
			return null;
		}
		String resStr = uri.toString();
		String storeStr;
		for (URI container : externalStores) {
			storeStr = container.toString();
			if (resStr.equals(storeStr)) {
				return container;
			}
			if (resStr.startsWith(storeStr + "/")) {
				return container;
			}
		}
		
		resStr = uri.toPlatformString(true);
		for (IContainer container : getWorkspaceStores()) {
			storeStr = container.getFullPath().toString();
			if (resStr.equals(storeStr)) {
				return ResourceUtil.uriFrom(container);
			}
			if (resStr.startsWith(storeStr + "/")) {
				return ResourceUtil.uriFrom(container);
			}
		}
		return null;
	}
	
	/**
	 * @param container the container
	 * @return true if the container is a closed project
	 */
	public boolean isClosedProject(IContainer container) {
		if (container == null || !container.exists() || !(container instanceof IProject)) {
			return false;
		}
		IProject project = (IProject) container;

		return !project.isOpen();
	}

	/**
	 * @param resource the resource
	 * @return true if the given resource is inside a store
	 */
	public boolean isInStore(IResource resource) {
		return getStoreContainerFor(resource) != null;
	}
	
	/**
	 * @param uri the URI
	 * @return true if the artifact with the given URI is inside a store
	 */
	public boolean isInStore(URI uri) {
		return getStoreContainerFor(uri) != null;
	}

	/**
	 * @param resource the resource
	 * @return true if the given resource is a container that is a store
	 */
	public boolean isStore(IResource resource) {
		if (!(resource instanceof IContainer)) {
			return false;
		}
		return getWorkspaceStores().contains(resource);
	}

	/**
	 * @param uri the URI
	 * @return true if the URI points at a store
	 */
	public boolean isStore(URI uri) {
		if (uri.isPlatformResource() && Platform.isRunning()) {
			IResource resource = ResourceUtil.fileFor(uri);
			return resource.equals(getStoreContainerFor(resource));
		}
		
		return externalStores.contains(uri);
	}

	/**
	 * @param resource the resource
	 * @return true if the resource is a '.store' file
	 */
	public boolean isStoreFile(IResource resource) {
		if (!(resource instanceof IFile)) {
			return false;
		}
		return resource.getName().equals(FILE_STORE);
	}

	/**
	 * @param storeContainer a container that was unmarked as store
	 * @return the store handle
	 */
	public Store loadDeletedStore(IContainer storeContainer) {
		if (storeContainer == null) {
			return null;
		}
		String storeURIString = ResourceUtil.uriString(storeContainer);
		for (Store oldStore : deletedStores) {
			if (oldStore.getUriBuffer().equals(storeURIString)) {
				return oldStore;
			}
		}

		return null;
	}

	/**
	 * @param storeContainer a container that was marked as store
	 * @return the store handle
	 */
	public Store loadStore(IContainer storeContainer) {
		if (!isStore(storeContainer)) {
			return null;
		}
		// Obtain a new resource set
		ResourceSet resourceSet = new ResourceSetImpl();

		// IFile file = folder.getFile(StoreProjectUtil.STORE_FILE);
		// String path = file.getFullPath().toString();
		String path = storeContainer.getFullPath().append(FILE_STORE)
				.toString();
		URI uri = URI.createPlatformResourceURI(path, true);

		// try open resource and retrieve
		try {
			Resource res = resourceSet.getResource(uri, true);
			return (Store) res.getContents().get(0);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * @param storeContainer container
	 * @param store store
	 * @return true if successful
	 */
	public boolean markStore(IContainer storeContainer, Store store) {
		if (storeContainer == null || store == null) {
			return false;
		}
		if (isInStore(storeContainer) || isParentOfStore(storeContainer)
				|| isClosedProject(storeContainer)) {
			return false;
		}
		ResourceSet resourceSet = new ResourceSetImpl();
		IPath path = storeContainer.getFullPath().append(FILE_STORE);
		URI uri = ResourceUtil.uriFrom(path);

		// create and save new resource
		Resource newRes = resourceSet.createResource(uri);
		try {
			newRes.getContents().add(store);
			newRes.save(Collections.EMPTY_MAP);
		} catch (Exception e) {
			SokanIndexPlugin.logError("", e);
			return false;
		}

		getWorkspaceStores().add(storeContainer);

		return true;
	}


	/**
	 * @param storeContainer the store container
	 * @return true if successful
	 */
	// TODO #1238: Reorganize Sokan API
	public boolean unmarkStore(IContainer storeContainer) {
		ResourceSet resourceSet = new ResourceSetImpl();
		IPath path = storeContainer.getFullPath().append(FILE_STORE);
		URI uri = ResourceUtil.uriFrom(path);

		Resource existingRes = null;
		try {
			existingRes = resourceSet.getResource(uri, true);
		} catch (Exception e) {
			// do nothing
		}

		if (existingRes == null) {
			return false;
		}
		deletedStores.add(((Store) existingRes.getContents().get(0)));
		existingRes.getContents().clear();

		try {
			existingRes.delete(null);
		} catch (IOException e) {
			SokanIndexPlugin.logError("", e);
			return false;
		}

		getWorkspaceStores().remove(storeContainer);

		return true;
	}

	/**
	 * @return all deleted stores
	 */
	public Set<Store> getDeletedStores() {
		return this.deletedStores;
	}

	/**
	 * @param storeContainer the container
	 * @return true if the container was unmarked as store
	 */
	public boolean wasStore(IContainer storeContainer) {
		return loadDeletedStore(storeContainer) != null;
	}

	/**
	 * @param container the container
	 * @return true if the container contains itself store containers
	 */
	public boolean isParentOfStore(IContainer container) {
		String containerString = ResourceUtil.uriString(container) + "/";
		for (URI storeURI : getAllStoreURIs()) {
			if (ResourceUtil.uriString(storeURI).startsWith(containerString)) {
				return true;
			}
		}
		return false;
	}
}
