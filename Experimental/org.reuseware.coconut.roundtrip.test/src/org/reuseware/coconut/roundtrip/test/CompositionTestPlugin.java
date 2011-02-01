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
package org.reuseware.coconut.roundtrip.test;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class CompositionTestPlugin extends Plugin {

	// examples plug-in ID
	public static final String EXAMPLES_BUNDLE_ID = "org.reuseware.example";

	// test plug-in ID
	public static final String TEST_BUNDLE_ID = "org.reuseware.test";

	public static final String PLUGIN_ID = "org.reuseware.coconut.roundtrip.test";

	// the shared instance
	private static CompositionTestPlugin plugin;

	// examples-bundle
	private static Bundle examplesBundle;

	// test-bundle
	private static Bundle testBundle;

	/**
	 * The constructor
	 */
	public CompositionTestPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		Bundle[] bundles = context.getBundles();

		for (Bundle bundle : bundles) {
			if (bundle.getSymbolicName().equals(EXAMPLES_BUNDLE_ID)) {
				examplesBundle = bundle;
			}
			if (bundle.getSymbolicName().equals(TEST_BUNDLE_ID)) {
				testBundle = bundle;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);

	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static CompositionTestPlugin getDefault() {
		return plugin;
	}

	/**
	 * @return the org.reuseware.example bundle
	 */
	public static Bundle getExamplesBundle() {
		return examplesBundle;
	}

	/**
	 * 
	 * @return the org.reuseware.test bundle
	 */
	public static Bundle getTestBundle() {
		return testBundle;
	}

	public static File getExamplesBundleBaseDirectory() {
		try {
			return new File(FileLocator.toFileURL(
					getExamplesBundle().getEntry("/")).getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static File getTestBundleBaseDirectory() {
		try {
			return new File(FileLocator
					.toFileURL(getTestBundle().getEntry("/")).getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
