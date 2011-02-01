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
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.lacome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EContentsEList.FeatureIterator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.reuseware.lacome.provider.SourceDiagramInformationProvider;
import org.reuseware.lacome.provider.TargetDiagramInformationProvider;
import org.reuseware.lacome.strategy.DiagramAligner;
import org.reuseware.lacome.strategy.DiagramArranger;
import org.reuseware.lacome.strategy.DiagramComparator;
import org.reuseware.lacome.strategy.DiagramCompositionStrategy;
import org.reuseware.lacome.strategy.DiagramMerger;
import org.reuseware.lacome.strategy.MultiSourceDiagramArranger;
import org.reuseware.lacome.strategy.SingleSourceDiagramArranger;

/**
 * Central management class of Lacome. It handles 
 * diagram composition and layout adjustment by 
 * calling registered mergers and arrangers.
 * <p>
 * This class manages the following extension points
 * that may be used to extend Lacome with support for
 * further layout formats and adjustment algorithms.
 * 
 * <ul>
 *   <li>org.reuseware.lacome.diagramCompositionStrategy</li>
 *   <li>org.reuseware.lacome.diagramArranger</li>
 *   <li>org.reuseware.lacome.diagramMerger</li>
 *   <li>org.reuseware.lacome.targetDiagramInformationProvider</li>
 *   <li>org.reuseware.lacome.sourceDiagramInformationProvider</li>
 *   <li>org.reuseware.lacome.diagramAligner</li>
 * </ul>
 * 
 * 
 */
public final class CompositionDiagramUtil {
	
	private CompositionDiagramUtil() { }
	
	/**
	 * Extension point ID:
	 * <i>org.reuseware.lacome.diagramCompositionStrategy</i>.
	 */
	public static final String DIAGRAM_COMPOSITION_STRATEGY_EP_ID = "org.reuseware.lacome.diagramCompositionStrategy";
	
	/**
	 * Extension point ID:
	 * <i>org.reuseware.lacome.diagramArranger</i>.
	 */
	public static final String DIAGRAM_ARRANGER_EP_ID 			  = "org.reuseware.lacome.diagramArranger";
	
	/**
	 * Extension point ID:
	 * <i>org.reuseware.lacome.diagramMerger</i>.
	 */
	public static final String DIAGRAM_MERGER_EP_ID          	  = "org.reuseware.lacome.diagramMerger";
	
	/**
	 * Extension point ID:
	 * <i>org.reuseware.lacome.targetDiagramInformationProvider</i>.
	 */
	public static final String TARGET_DIAGRAM_PROVIDER_EP_ID 	  = "org.reuseware.lacome.targetDiagramInformationProvider";
	
	/**
	 * Extension point ID:
	 * <i>org.reuseware.lacome.sourceDiagramInformationProvider</i>.
	 */
	public static final String SOURCE_DIAGRAM_PROVIDER_EP_ID 	  = "org.reuseware.lacome.sourceDiagramInformationProvider";

	/**
	 * Extension point ID:
	 * <i>org.reuseware.lacome.diagramAligner</i>.
	 */
	public static final String DIAGRAM_ALIGNER_EP_ID        	  = "org.reuseware.lacome.diagramAligner";

	protected static Map<String, DiagramMerger> diagramMergers = 
		new LinkedHashMap<String, DiagramMerger>();
	protected static List<SourceDiagramInformationProvider> sdiProviders = 
		new ArrayList<SourceDiagramInformationProvider>();
	protected static List<TargetDiagramInformationProvider> tdiProviders = 
		new ArrayList<TargetDiagramInformationProvider>();
	protected static Map<String, DiagramCompositionStrategy> diagramCompositionStrategies = 
		new LinkedHashMap<String, DiagramCompositionStrategy>();
	protected static Map<String, DiagramArranger<?>> diagramArrangers = 
		new LinkedHashMap<String, DiagramArranger<?>>();
	protected static List<DiagramAligner> diagramAligners = 
		new ArrayList<DiagramAligner>();
	
	protected static TraceProvider traceProvider = null;
	
	/**
	 * Composes the tow give diagrams.
	 * 
	 * @param contributingDiagrams the diagram contributing new layout information
	 * @param receivingDiagram     the diagram receiving new layout information
	 * @param traceProvider        a trace provider that exploits information about 
	 *                             the modification that were made to the models
	 *                             of the diagrams during model composition
	 */
	public static void composeDiagrams(
			List<DiagramDescription> contributingDiagrams,
			DiagramDescription receivingDiagram,
			TraceProvider traceProvider) {
		
		initEPs();
		CompositionDiagramUtil.traceProvider = traceProvider;

		//get target bounds of receiving diagram
		for (TargetDiagramInformationProvider provider : tdiProviders) {
			if (provider.canProvide(receivingDiagram)) {
				provider.provideBounds(receivingDiagram);
			}
		}
		//compute source bounds of receiving diagram
		for (SourceDiagramInformationProvider provider : sdiProviders) {
			if (provider.canProvide(receivingDiagram)) {
				provider.provideBounds(receivingDiagram);
			}
		}
		
		//prepare contributing diagrams
	    for (DiagramDescription contributingDiagram : contributingDiagrams) {
			//get target bounds of contributing diagram
			for (TargetDiagramInformationProvider provider : tdiProviders) {
				if (provider.canProvide(contributingDiagram)) {
					provider.provideBounds(contributingDiagram);
				}
			}
			//get source bounds of contributing diagram
			for (SourceDiagramInformationProvider provider : sdiProviders) {
				if (provider.canProvide(contributingDiagram)) {
					provider.provideBounds(contributingDiagram);
				}
			}
		}
	    
	    Map<String, List<DiagramDescription>> sortedContributingDiagrams =
	    	sortDiagramsByStrategy(contributingDiagrams);
	    
		for (String strategyID : sortedContributingDiagrams.keySet()) {
			
			DiagramCompositionStrategy diagramCompositionStrategy = diagramCompositionStrategies
					.get(strategyID);

			if (diagramCompositionStrategy == null) {
				continue;
			}
			
			
			
			List<DiagramDescription> contributingDiagramsWithStrategy = sortedContributingDiagrams
					.get(strategyID);

			if (!diagramCompositionStrategy.getArrangerIDs().isEmpty()) {
				// arrange multiple if an arranger exists
				for (String arrangerID : diagramCompositionStrategy.getArrangerIDs()) {
					DiagramArranger<?> arranger = diagramArrangers.get(arrangerID);
					if (arranger instanceof MultiSourceDiagramArranger) {
						if (!contributingDiagramsWithStrategy.isEmpty()) {
							// sort the list of contributing diagrams
							// for composition order
							DiagramComparator comparator = arranger.getComparator();
							if (comparator != null) {
								Collections.sort(
										contributingDiagramsWithStrategy,
										comparator);
							}
							((MultiSourceDiagramArranger) arranger).arrange(
									contributingDiagramsWithStrategy,
									receivingDiagram);
						}
					}

					if (!contributingDiagramsWithStrategy.isEmpty()) {
						for (String mergerID : diagramMergers.keySet()) {
							if (!diagramCompositionStrategy.getDeactivateMergerIDs()
									.contains(mergerID)) {
								DiagramMerger merger = diagramMergers.get(mergerID);
								if (merger.canMerge(receivingDiagram)) {
									if (arranger instanceof SingleSourceDiagramArranger) {
										// sort the list of contributing
										// diagrams for composition order
										DiagramComparator comparator = arranger.getComparator();
										if (comparator != null) {
											Collections.sort(
															contributingDiagramsWithStrategy,
															comparator);
										}
										for (DiagramDescription contributingDiagram : contributingDiagramsWithStrategy) {
											// arrange
											((SingleSourceDiagramArranger) arranger).arrange(
															contributingDiagram,
															receivingDiagram);

											// merge
											merger.merge(Collections.singletonList(contributingDiagram),
															receivingDiagram,
															contributingDiagramsWithStrategy);

											// re-compute source bounds of the
											// receiving diagram that is now
											// merged
											// with the contributing diagram
											for (SourceDiagramInformationProvider provider : sdiProviders) {
												if (provider.canProvide(receivingDiagram)) {
													provider.provideBounds(receivingDiagram);
												}
											}
										}
									} else {
										merger.merge(
														contributingDiagramsWithStrategy,
														receivingDiagram,
														new BasicEList<DiagramDescription>());
									}
								}
							}
						}
					}
				}
			} else {
				//if there are no arrangers for the strategy
				//the merge has to be performed all the same
				for (String mergerID : diagramMergers.keySet()) {
					if (!diagramCompositionStrategy.getDeactivateMergerIDs()
							.contains(mergerID)) {
						DiagramMerger merger = diagramMergers.get(mergerID);
						if (merger.canMerge(receivingDiagram)) {
							merger.merge(contributingDiagramsWithStrategy,
									receivingDiagram,
									new BasicEList<DiagramDescription>());
						}
					}
				}
			}
			cleanup(receivingDiagram);
		}
		
		CompositionDiagramUtil.traceProvider = null;
	}

	private static Map<String, List<DiagramDescription>> sortDiagramsByStrategy(
			List<DiagramDescription> fragmentDiagrams) {
	
		Map<String, List<DiagramDescription>> result = 
			new LinkedHashMap<String, List<DiagramDescription>>();
		for (DiagramDescription fragmentDiagram : fragmentDiagrams) {
			String strategy = fragmentDiagram.getStrategy();
			if (!diagramCompositionStrategies.containsKey(strategy)) {
				strategy = "default";
			}
			if (!result.containsKey(strategy)) {
				result.put(strategy, new ArrayList<DiagramDescription>());
			}
			result.get(strategy).add(fragmentDiagram);
		}
		
		return result;
	}
	
	/**
	 * Cleanup the diagram by removing nodes and edges
	 * that are broken, because relating elements were
	 * removed.
	 * 
	 * @param diagram the diagram to cleanup
	 */
	public static void cleanup(
			DiagramDescription diagram) {
		//remove all dangling 
		boolean diagramModified = true;
		while (diagramModified) {
			diagramModified = false;
			treeIteration: 
			for (TreeIterator<EObject> diagramElIt = EcoreUtil.getAllContents(
					diagram.getDiagramRoots()); diagramElIt.hasNext();) {
				EObject next = diagramElIt.next();

				boolean crossReferencesModified = true;
				while (crossReferencesModified) {
					crossReferencesModified = false;
					for (FeatureIterator<EObject> featureIterator = (FeatureIterator<EObject>) next.eCrossReferences().iterator(); featureIterator.hasNext();) {
						EObject nextChild = featureIterator.next();
						EStructuralFeature feature = featureIterator.feature();
						if (!EcoreUtil.isAncestor(diagram.getDiagramRoots(), nextChild)
								&& !EcoreUtil.isAncestor(diagram.getContents(), nextChild)) {
							EcoreUtil.remove(next, feature, nextChild);
							for	(DiagramMerger diagramMerger : diagramMergers.values()) {
								diagramModified = diagramMerger.cleanup(next, feature, nextChild);
								if (diagramModified) {
									break treeIteration;
								}
							}
							crossReferencesModified = true;
							break;
						}
					}
				}
			}
		}
	}

	/**
	 * Uses diagram aligners tries to transfer layout information from an old version
     * of a diagram to a new one, preserving the information of new elements in the
     * new version of the diagram.
	 * <p>
	 * 
	 * <i>Currently not implemented</i>
	 * 
	 * @param newDiagram the new diagram
	 * @param oldDiagram the old diagram
	 */
	public static void alignDiagrams(
			DiagramDescription newDiagram,
			DiagramDescription oldDiagram) {
		
		if (diagramAligners.isEmpty()) {
			initAligners();
		}
		
		/* TODO #1473: activate alignment here
		FragmentDiagram newDiagram = 
			new FragmentDiagram(newDiagrams);
		FragmentDiagram oldDiagram = 
			new FragmentDiagram(oldDiagrams);
	
		DiagramAligner aligner = null;
		
		for(DiagramAligner candidate : diagramAligners) {
			if(candidate.canAlign(newDiagram)) {
				aligner = candidate;
				break;
			}
		}
		
		if (aligner != null) {
			aligner.align(newDiagram, oldDiagram);
		}
		*/
	}
	
	private static void initEPs() {
		if (diagramArrangers.isEmpty()) {
			initDiagramArranger();
		}
		if (diagramMergers.isEmpty()) {
			initDiagramMerger();
		}
		if (sdiProviders.isEmpty()) {
			initSDInformationProvider();
		}
		if (tdiProviders.isEmpty()) {
			initTDInformationProvider();
		}
		if (diagramCompositionStrategies.isEmpty()) {
			initDiagramCompositionStrategies();
		}
	}
	
	private static void initDiagramArranger() {
		if (Platform.isRunning()) {
			//read extension point
	        IExtensionPoint sdipComposerEP = 
	        	Platform.getExtensionRegistry().getExtensionPoint(DIAGRAM_ARRANGER_EP_ID);
	        IConfigurationElement[] entries = sdipComposerEP.getConfigurationElements();
	        
	        for (int i = 0; i < entries.length; i++) {
	        	try {
	        		
	        		DiagramComparator comparator = null;
	        		if (entries[i].getAttribute("comparator") != null) {
	        			comparator = (DiagramComparator) entries[i].createExecutableExtension("comparator");
	        		}
	        		
	        		DiagramArranger<?> diagramArranger = 
						(DiagramArranger<?>) entries[i].createExecutableExtension("arranger");
	        		
	        		//set the comparator for that arranger
	        		diagramArranger.setComparator(comparator);
					
	        		String iD = entries[i].getAttribute("id");
					diagramArrangers.put(iD, diagramArranger);			
				} catch (CoreException e) {
					e.printStackTrace();
				}
	        }
		}
		
	}

	private static void initDiagramMerger() {
		if (Platform.isRunning()) {
			//read extension point
	        IExtensionPoint sdipComposerEP = 
	        	Platform.getExtensionRegistry().getExtensionPoint(DIAGRAM_MERGER_EP_ID);
	        IConfigurationElement[] entries = sdipComposerEP.getConfigurationElements();
	        
	        for (int i = 0; i < entries.length; i++) {
	        	try {
	        		DiagramMerger diagramMerger = 
						(DiagramMerger) entries[i].createExecutableExtension("merger");
					
	        		String iD = entries[i].getAttribute("id");
	        		diagramMergers.put(iD, diagramMerger);			
				} catch (CoreException e) {
					e.printStackTrace();
				}
	        }
		}
	}
	
	private static void initSDInformationProvider() {
		if (Platform.isRunning()) {
			//read extension point
	        IExtensionPoint sdipComposerEP = 
	        	Platform.getExtensionRegistry().getExtensionPoint(SOURCE_DIAGRAM_PROVIDER_EP_ID);
	        IConfigurationElement[] entries = sdipComposerEP.getConfigurationElements();
	        
	        for (int i = 0; i < entries.length; i++) {
	        	try {
					SourceDiagramInformationProvider sdiProvider = 
						(SourceDiagramInformationProvider) entries[i].createExecutableExtension("provider");
					
					sdiProviders.add(sdiProvider);
				} catch (CoreException e) {
					e.printStackTrace();
				}
	        }
		}
	}
	
	private static void initTDInformationProvider() {
		if (Platform.isRunning()) {
			//read extension point
	        IExtensionPoint tdipEP = 
	        	Platform.getExtensionRegistry().getExtensionPoint(TARGET_DIAGRAM_PROVIDER_EP_ID);
	        IConfigurationElement[] entries = tdipEP.getConfigurationElements();
	        
	        for (int i = 0; i < entries.length; i++) {
	        	try {
	        		TargetDiagramInformationProvider tdiProvider = 
						(TargetDiagramInformationProvider) entries[i].createExecutableExtension("provider");

					tdiProviders.add(tdiProvider);
				} catch (CoreException e) {
					e.printStackTrace();
				}
	        }
		}
	}
	
	private static void initDiagramCompositionStrategies() {
		if (Platform.isRunning()) {
			//read extension point
	        IExtensionPoint diagramCompositionStrategyEP = 
	        	Platform.getExtensionRegistry().getExtensionPoint(DIAGRAM_COMPOSITION_STRATEGY_EP_ID);
	        IConfigurationElement[] entries = diagramCompositionStrategyEP.getConfigurationElements();
	        
	        for (int i = 0; i < entries.length; i++) {
	        	try {
	        		
					String iD = entries[i].getAttribute("id");
					DiagramCompositionStrategy compositionStrategy = new DiagramCompositionStrategy(iD);
					
					for (IConfigurationElement arranger : entries[i].getChildren("arranger")) {
		        		if (arranger.getAttribute("id") != null) {
		        			String arrangerID = arranger.getAttribute("id");
		        			compositionStrategy.getArrangerIDs().add(arrangerID);
		        		}
	        		}
					
	        		for (IConfigurationElement deactivateMerger : entries[i].getChildren("deactivateMerger")) {
		        		if (deactivateMerger.getAttribute("id") != null) {
		        			String mergerID = deactivateMerger.getAttribute("id");
		        			compositionStrategy.getDeactivateMergerIDs().add(mergerID);
		        		}
	        		}
					
					diagramCompositionStrategies.put(iD, compositionStrategy);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
		}
	}
	
	private static void initAligners() {
		if (Platform.isRunning()) {
			//read extension point
	        IExtensionPoint diagramAlignerEP = 
	        	Platform.getExtensionRegistry().getExtensionPoint(DIAGRAM_ALIGNER_EP_ID);
	        IConfigurationElement[] entries = diagramAlignerEP.getConfigurationElements();
	        
	        for (int i = 0; i < entries.length; i++) {
	        	try {
					DiagramAligner aligner = 
						(DiagramAligner) entries[i].createExecutableExtension("aligner");
					
					diagramAligners.add(aligner);			
				} catch (CoreException e) {
					e.printStackTrace();
				}
	        }
		}
	}

	/**
	 * Delegates to the current trace provider.
	 * 
	 * @param copy a copy of a model element
	 * @return the original model element
	 */
	public static EObject getOriginal(EObject copy) {
		return traceProvider.getOriginal(copy);
	}

	/**
	 * Delegates to the current trace provider.
	 *
	 * @param element a model element
	 * @return model elements that were replaced by the given element
	 */
	public static List<EObject> getReplacedValues(EObject element) {
		if (traceProvider == null) {
			return Collections.emptyList();		
		}
		List<EObject> result = traceProvider.getReplacedValues(element);
		if (result == null) {
			return Collections.emptyList();
		}
		return result;
	}
	
	/**
	 * Delegates to the current trace provider.
	 * 
	 * @param element a model element
	 * @return the setting from which the element was removed (if any)
	 */
	public static Setting getRemovedFromSetting(EObject element) {
		return traceProvider.getRemovedFromSetting(element);
	}

	/**	 
	 * Delegates to the current trace provider.
	 * 
	 * @param element a model element
	 * @return all elements from which this element was derived 
	 *         (e.g., by some kind of model transformation)
	 */
	public static List<EObject> getDerivedFrom(EObject element) {
		if (traceProvider == null) {
			return null;			
		}
		List<EObject> result = traceProvider.getDerivedFrom(element);
		if (result == null) {
			return Collections.emptyList();
		}
		return result;
	}

}
