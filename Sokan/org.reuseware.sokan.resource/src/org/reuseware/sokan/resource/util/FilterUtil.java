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
package org.reuseware.sokan.resource.util;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.reuseware.sokan.index.util.CoreUtil;
import org.reuseware.sokan.index.util.StoreUtil;

/**
 * Utility class to filter artifacts (i.e., files) by name.
 */
// TODO #1146: Extend artifact filter facility
public final class FilterUtil {

	private FilterUtil() { }

	/**
	 * Matches a given resource against a name pattern.
	 * 
	 * @param resource the resource
	 * @param filterPattern the pattern to match
	 * @return true if the resource's name matches the pattern
	 */
	public static boolean isArtifact(IResource resource, String filterPattern) {
		if (!(resource instanceof IFile) || filterPattern == null) {
			return false;
		}
		if (resource.getName().equals(StoreUtil.FILE_STORE)) {
			return false;
		}
		if (resource.getName().equals(StoreUtil.FILE_PROJECT)) {
			return false;
		}
		if (filterPattern.equals("*.*")) {
			return true;
		}
		String fileEx = resource.getFileExtension();
		fileEx = "*." + fileEx;
		List<String> filterList = CoreUtil.toList(filterPattern, ",");
		if (filterList.contains(fileEx)) {
			return true;
		}
		return false;
	}
}
