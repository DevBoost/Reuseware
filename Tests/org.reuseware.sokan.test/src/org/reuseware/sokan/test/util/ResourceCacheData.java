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
package org.reuseware.sokan.test.util;

import java.io.File;

import org.reuseware.sokan.index.CommitCache;

public class ResourceCacheData extends AbstractData {
	public File project;
	public File dir1;
	public File dir2;
	public File r1;
	public File u1;
	public File a1;
	public CommitCache cache1;
	public CommitCache cache2;
}
