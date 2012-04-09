/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.sokan.index.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.SokanFactory;

/**
 * Utility methods to work with resources and their identifiers.
 */
public final class ResourceUtil {
	
	private ResourceUtil() { }
	
	/**
	 * Converts the given URI to an Eclipse file handle.
	 * 
	 * @param uri the URI
	 * @return the file handle
	 */
	public static IFile fileFor(URI uri) {
		if (uri == null || !uri.isPlatform()) {
			return null;
		}
		String pathStr = uri.toPlatformString(true);
		IPath path = new Path(pathStr);
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

		return file;
	}

	/**
	 * Given a list of <code>IResource</code> this method tries to find the
	 * resource in the list that can be represented by the given artifactID. The
	 * desired resource doesn't need to be indexed yet, but it needs to be
	 * located in a store.
	 * 
	 * @param resourceList
	 *            a list of resources.
	 * @param artifactID
	 *            The artifact identifier of the needed resource.
	 * @return A resource from the list, that matches the given artifact
	 *         identifier. <code>Null</code> is retrieved if there is no
	 *         resource matching in the list or the resource is not located in a
	 *         store.
	 */
	public static IResource findResource(List<IResource> resourceList,
			ID artifactID) {
		if (resourceList == null || artifactID == null) {
			return null;
		}
		ID myID;
		for (IResource iRes : resourceList) {
			myID = idFrom(iRes);
			if (artifactID.equals(myID)) {
				return iRes;
			}
		}

		return null;
	}

	/**
	 * Retrieves an artifact identifier defined by a string or <code>null</code>
	 * if no or an empty String is given. It is not checked, whether the
	 * artifact is in the store. In fact, the idString is simply parsed to a
	 * list and then given as segments to the new <code>ID</code> instance.
	 * 
	 * @param idString
	 *            A string representing an <code>ID</code>.
	 * @see ResourceUtil#idString(ID)
	 * @return A new <code>ID</code> instance.
	 */
	public static ID idFrom(String idString) {
		if (idString == null || idString.equals("")
				|| idString.equals(SokanConst.SEPERATOR)) {
			return null;
		}
		String idStr;
		if (idString.startsWith(SokanConst.SEPERATOR)) {
			idStr = idString.substring(1);
		} else {
			idStr = idString;
		}
		ID id = SokanFactory.eINSTANCE.createID();
		id.getSegments().addAll(CoreUtil.toList(idStr, SokanConst.SEPERATOR));
		return id;
	}

	/**
	 * Retrieves an artifact identifier defined by a string array or
	 * <code>null</code> if no or an empty String array is given. It is not
	 * checked, whether the artifact is in the store. In fact, the string array
	 * is given as segments to the new <code>ID</code> instance.
	 * 
	 * @param idStringArray
	 *            A string array representing an <code>ID</code>.
	 * @see ResourceUtil#idString(ID)
	 * @return A new <code>ID</code> instance.
	 */
	public static ID idFrom(String[] idStringArray) {
		if (idStringArray == null || idStringArray.length == 0) {
			return null;
		}
		ID id = SokanFactory.eINSTANCE.createID();
		id.getSegments().addAll(Arrays.asList(idStringArray));
		return id;
	}

	/**
	 * Retrieves an artifact identifier defined by a string list or
	 * <code>null</code> if no or an empty list is given. It is not
	 * checked, whether the artifact is in the store. In fact, the string list
	 * is given as segments to the new <code>ID</code> instance.
	 * 
	 * @param idStringList
	 *            A string list representing an <code>ID</code>.
	 * @see ResourceUtil#idString(ID)
	 * @return A new <code>ID</code> instance.
	 */
	public static ID idFrom(List<String> idStringList) {
		if (idStringList == null || idStringList.size() == 0) {
			return null;
		}
		ID id = SokanFactory.eINSTANCE.createID();
		id.getSegments().addAll(idStringList);
		return id;
	}

	/**
	 * Retrieves an artifact identifier for the given resource or
	 * <code>null</code> if no resource is given. This resource doesn't need to
	 * be indexed yet, but it must be contained in a store.
	 * 
	 * @param resource
	 *            The resource associated with the artifact.
	 * @return A new <code>ID</code> instance.
	 */
	public static ID idFrom(IResource resource) {
		if (resource == null) {
			return null;
		}
		return idFrom(uriFrom(resource));
	}

	/**
	 * Retrieves an artifact identifier defined by the given <code>URI</code>.
	 * This artifact doesn't need to be indexed yet, but the resource
	 * representing the artifact must be contained in a store. Hence, this
	 * method will return <code>null</code> if the given <code>URI</code> is
	 * <code>null</code> or doesn't point into a store.
	 * 
	 * @param uri
	 *            The unique resource identifier.
	 * @return A new <code>ID</code> instance.
	 */
	public static ID idFrom(URI uri) {
		if (uri == null) {
			return null;
		}
		String physicalURIString = uri.toString();
		for (URI aBase : getStoreURIList()) {
			if (physicalURIString.startsWith(aBase.toString())
					&& !StoreUtil.INSTANCE.isStore(uri)) {
				return buildIDFromURI(uri.deresolve(aBase));
			}
		}
		return null;
	}

	/**
	 * Retrieves the artifact identifiers for the given resources.
	 * <code>Null</code> is retrieved if the requested list of resources is
	 * <code>null</code>. In addition, the resources doesn't need to be indexed
	 * yet, but they must be contained in a store.
	 * 
	 * @param uris
	 *            The resource associated with the artifact.
	 * @return A list of artifact identifiers.
	 */
	public static List<ID> idListFromURIs(Collection<URI> uris) {
		if (uris == null) {
			return Collections.emptyList();
		}
		List<ID> idList = new ArrayList<ID>(uris.size());
		for (URI uri : uris) {
			ID id = idFrom(uri);
			if (id != null) {
				idList.add(idFrom(uri));
			}
		}
		return idList;
	}

	/**
	 * Builds a string out of a given ID.
	 * 
	 * @param id
	 *            The artifact's identifier.
	 * @see ResourceUtil#idFrom(String)
	 * @return A <code>String</code> representing an <code>ID</code>.
	 */
	public static String idString(ID id) {
		if (id == null) {
			return null;
		}
		return SokanConst.SEPERATOR
				+ CoreUtil.toListString(id.getSegments(), SokanConst.SEPERATOR);
	}

	/**
	 * Builds a string out of a given String list that represents an ID.
	 * 
	 * @param idList
	 *            The artifact's identifier as String list.
	 * @see ResourceUtil#idFrom(String)
	 * @return A <code>String</code> list representing an <code>ID</code>.
	 */
	public static String idString(List<String> idList) {
		if (idList == null) {
			return null;
		}
		return SokanConst.SEPERATOR
				+ CoreUtil.toListString(idList, SokanConst.SEPERATOR);
	}

	/**
	 * Retrieves the artifact's physical <code>URI</code> of a given artifact
	 * identifier. Retrieves <code>null</code> if artifactID is
	 * <code>null</code>.<br>
	 * <b>Attention!</b> <br>
	 * This method leads to an index query!
	 * 
	 * @param artifactID
	 *            The artifact's identifier.
	 * @return The artifact's physical <code>URI</code>.
	 */
	public static URI uriFrom(ID artifactID) {
		if (artifactID == null) {
			return null;
		}
		IndexRow row = IndexUtil.INSTANCE.getIndex(artifactID);
		if (row == null) {
			return null;
		}
		return uriFrom(row.getPhyURI());
	}

	/**
	 * Retrieves the <code>URI</code> of a given path or <code>null</code> if
	 * this path is <code>null</code>.
	 * 
	 * @param path
	 *            A path in the Eclipse workspace.
	 * @return A platform resource <code>URI</code>.
	 */
	public static URI uriFrom(IPath path) {
		if (path == null) {
			return null;
		}
		return URI.createPlatformResourceURI(path.toString(), true);
	}

	/**
	 * Retrieves the physical <code>URI</code> of a given resource. It is not
	 * checked, whether this resource is indexed as artifact.
	 * 
	 * @param resource
	 *            A resource in the Eclipse workspace.
	 * @return A platform resource <code>URI</code>.
	 */
	public static URI uriFrom(IResource resource) {
		if (resource == null) {
			return null;
		}
		return uriFrom(resource.getFullPath());
	}

	/**
	 * Retrieves the u<code>URI</code> defined by a uriString or
	 * <code>null</code> if this string is <code>null</code> or empty.
	 * 
	 * @param uriString
	 *            A string defining a <code>URI</code>.
	 * @see ResourceUtil#uriString(URI)
	 * @return A platform resource <code>URI</code>.
	 */
	public static URI uriFrom(String uriString) {
		if (uriString == null || uriString.equals("")) {
			return null;
		}
		return URI.createURI(uriString, true);
	}

	/**
	 * Retrieves a string representing a <code>URI</code> or null if the given
	 * <code>URI</code> is <code>null</code>.
	 * 
	 * @param uri
	 *            The <code>URI</code> to get a string representation from.
	 * @return A string defining a <code>URI</code>.
	 */
	public static String uriString(URI uri) {
		if (uri == null) {
			return null;
		}
		return uri.toString();
	}

	/**
	 * Retrieves a string representing the <code>URI</code> of a resource or
	 * null if the given resource is <code>null</code>.
	 * 
	 * @param resource
	 *            The <code>Resource</code> to get a <code>URI</code>
	 *            representation from.
	 * @return A string defining a <code>URI</code>.
	 */
	public static String uriString(IResource resource) {
		if (resource == null) {
			return null;
		}
		return uriString(uriFrom(resource));
	}

	private static List<URI> getStoreURIList() {
		List<URI> uris = new ArrayList<URI>();
		uris.addAll(StoreUtil.INSTANCE.getAllStoreURIs());
		uris.addAll(StoreUtil.INSTANCE.getAllDeletedStoreURIs());

		return uris;
	}

	private static ID buildIDFromURI(URI uri) {
		if (uri == null) {
			return null;
		}
		List<String> segments = uri.segmentsList();

		if (segments.size() < 1) {
			return null;
		}
		segments = segments.subList(1, segments.size());
		ID id = SokanFactory.eINSTANCE.createID();
		id.getSegments().addAll(segments);
		return id;
	}

}
