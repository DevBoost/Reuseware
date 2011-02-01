/*******************************************************************************
 * Copyright (c) 2006-2010 
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

package org.reuseware.coconut.compositionprogram.resource;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

/**
 * Utility class for marking resources that cause errors in a UCL composition programs.
 * This are not only UCL files but also diagrams for UCL files and other files from
 * which UCL files are derived.
 * <p>
 * This class manages the extension point:
 * <i>org.reuseware.coconut.compositionprogram.resource.ucl.reporter</i>.
 */
public final class UCLMarkerHelper {
	
	private UCLMarkerHelper() { }
	
	/**
	 * Extension point ID:
	 * <i>org.reuseware.coconut.compositionprogram.resource.ucl.reporter</i>.
	 */
	public static final String REPORTER_EP_ID = 
		"org.reuseware.coconut.compositionprogram.resource.ucl.reporter";

	/**
	 * Constant used as UCPI attribute in markers.
	 */
	public static final String UNIQUE_COMPOSITION_PROGRAM_IDENTIFIER = 
		"UNIQUE_COMPOSITION_PROGRAM_IDENTIFIER";
	
	private static final class ExistingMarker {
		private ExistingMarker() { }
		
		private String type;
		@SuppressWarnings("rawtypes")
		private Map attributes;
	}
	
	private static List<CompositionProblemReporter> reporterList = null;
	
	private static void init() {
		if (reporterList == null) {
			reporterList = new ArrayList<CompositionProblemReporter>();
			if (Platform.isRunning()) {
		        IExtensionPoint reporterEP = 
		        	Platform.getExtensionRegistry().getExtensionPoint(REPORTER_EP_ID);
		        IConfigurationElement[] entries = reporterEP.getConfigurationElements();
		        
		        for (int i = 0; i < entries.length; i++) {
		        	try {
		        		CompositionProblemReporter reporter = 
							(CompositionProblemReporter) entries[i].createExecutableExtension("class");
						reporterList.add(reporter);
					} catch (CoreException e) {
						e.printStackTrace();
					}
		        }
			}
			reporterList.add(new DefaultCompositionProblemReporter());
		}

	}
	
	/**
	 * Register a new reporter.
	 * 
	 * @param reporter the reporter to register
	 */
	public static void addReporter(CompositionProblemReporter reporter) {
		init();
		reporterList.add(0, reporter);
	}
	
	/**
	 * @return list of all registered reporters
	 */
	public static List<CompositionProblemReporter> getReporter() {
		init();
		return reporterList;
	}
	
	/**
	 * Create a marker based on the given diagnostic.
	 * 
	 * @param diagnostic diagnostic holding the issue
	 * @param ucpi UCPI of the composition diagram causing the issue
	 */
	public static void mark(UCLDiagnostic diagnostic, List<String> ucpi) {
		if (!Platform.isRunning()) {
			return;
		}
		init();
		for (EObject problemSource : diagnostic.getElements()) {
			Set<IFile> markedFiles = new LinkedHashSet<IFile>();
			for (CompositionProblemReporter reporter : UCLMarkerHelper.getReporter()) {
				IFile file = reporter.getFile(problemSource);
				if (file != null && !markedFiles.contains(file)) {
					String markerType = reporter.getMarkerType(problemSource);
					Map<String, Object> attributes = new LinkedHashMap<String, Object>();
					reporter.getAttributes(problemSource, attributes);
					createNewMarker(file, diagnostic, markerType, attributes, ucpi);
					markedFiles.add(file);					
				}	
			}
		}
	}
	
	/**
	 * Removes all markers from the given resource that were caused by the 
	 * indicated composition program.
	 * 
	 * @param resource resource from which to remove markers
	 * @param ucpi UCPI of the composition program causing the issue
	 */
	public static void unmark(Resource resource, List<String> ucpi) {
		init();
		if (!Platform.isRunning()) {
			return;
		}		
		IFile file = WorkspaceSynchronizer.getFile(resource);
		if (file != null) {
			try {
				List<ExistingMarker> markerMemory = new ArrayList<ExistingMarker>();
				boolean needsClean = false;
				for (IMarker existingMarker : file.findMarkers(null, false, IResource.DEPTH_ZERO)) {
					if (!ucpi.toString().equals(existingMarker.getAttribute(UNIQUE_COMPOSITION_PROGRAM_IDENTIFIER))) {
						Map<?, ?> markerAttributes = existingMarker.getAttributes();
						if (markerAttributes != null) {
							ExistingMarker m = new ExistingMarker();
							m.type = existingMarker.getType();
							m.attributes = markerAttributes;
							markerMemory.add(m);
						}
					} else {
						needsClean = true;
					}
				}
				if (needsClean) {
					file.deleteMarkers(null, false, IResource.DEPTH_ZERO);
					for (ExistingMarker m : markerMemory) {
						IMarker marker = file.createMarker(m.type);
						marker.setAttributes(m.attributes);
					}
				}
			} catch (Exception ce) {
				if (ce.getMessage().matches("Marker.*not found.")) {
					// ignore
				} else if (ce.getMessage().matches("Resource.*does not exist.")) {
					// ignore
				} else {
					ce.printStackTrace();
				}
			}
		}
	}
	
	private static void createNewMarker(
			IFile file, UCLDiagnostic diagnostic, String markerType, Map<String, Object> attributes, List<String> ucpi) {
		try {
			IMarker marker = file.createMarker(markerType);
			attributes.put(IMarker.MESSAGE, diagnostic.getMessage());
			if (diagnostic.getSeverity() == org.eclipse.emf.common.util.Diagnostic.ERROR) {
				attributes.put(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			} else if (diagnostic.getSeverity() == org.eclipse.emf.common.util.Diagnostic.INFO) {
				attributes.put(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
			} else {
				attributes.put(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
			}
			
			attributes.put(UNIQUE_COMPOSITION_PROGRAM_IDENTIFIER, ucpi.toString());
			
			marker.setAttributes(attributes);
			
		} catch (org.eclipse.core.runtime.CoreException ce) {
			if (ce.getMessage().matches("Marker.*not found.")) {
				// ignore
			} else {
				ce.printStackTrace();
			}
		}
	}
}
