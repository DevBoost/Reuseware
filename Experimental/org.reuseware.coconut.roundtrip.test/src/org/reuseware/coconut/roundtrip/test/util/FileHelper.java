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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Assert;

public class FileHelper {

	public void clear(File directory) {
		if (!directory.exists()) {
			return;
		}
		Assert.assertTrue(directory.isDirectory());
		for (File file : directory.listFiles(new SVNDirFilter())) {
			if (file.isFile() && file.exists()) {
				boolean success = file.delete();
				Assert.assertTrue("Can't delete " + file.getAbsolutePath(), success);
			}
			if (file.isDirectory()) {
				clear(file);
			}
		}
	}

	public void copyDir(File source, File target)
			throws FileNotFoundException, IOException {

		File[] files = source.listFiles(new SVNDirFilter());
		target.mkdirs();
		for (File file : files) {
			if (file.isDirectory()) {
				copyDir(file,
						new File(target.getAbsolutePath()
								+ System.getProperty("file.separator")
								+ file.getName()));
			} else {
				copyFile(file,
						new File(target.getAbsolutePath()
								+ System.getProperty("file.separator")
								+ file.getName()));
			}
		}
	}

	public void copyFile(File source, File target)
			throws FileNotFoundException, IOException {

		InputStream in = new BufferedInputStream(new FileInputStream(source));
		OutputStream out = new BufferedOutputStream(new FileOutputStream(
				target, false));
		int bytes = 0;
		while ((bytes = in.read()) != -1) {
			out.write(bytes);
		}
		in.close();
		out.close();
	}
}
