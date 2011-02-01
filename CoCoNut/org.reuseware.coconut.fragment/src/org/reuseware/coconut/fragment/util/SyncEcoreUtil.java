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
package org.reuseware.coconut.fragment.util;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

/**
 * Utility class to record and retrieve tracing information for EObjects that
 * participate in a composition by Reuseware.
 */
public final class SyncEcoreUtil {
	
	private SyncEcoreUtil() { }
	
	/**
	 * Record information about the relationship of original EObjects
	 * and their copies in a certain context (e.g., a composition program execution).
	 * 
	 * @param copier the <code>EcoreUtil.Copier</code> that was used for copying EObjects
	 * @param contextObject object identifying the context in which the copies were produced
	 *                      (e.g., a composition program)
	 */
	public static void syncCopy(Copier copier, EObject contextObject) {
		for (EObject original : copier.keySet()) {
			EObject copy = copier.get(original);
			boolean isCopy = true;
			while (isCopy) {
				isCopy = false;
				for (Adapter a : original.eAdapters()) {
					if (a instanceof CopiedFromAdapter) {
						original = ((CopiedFromAdapter) a).getOriginal();
						isCopy = true;
						break;
					}
				}

			}
			//the copier might contain values which are not "real" copies
			if (!copy.equals(original)) {
				copy.eAdapters().add(new CopiedFromAdapter(original, contextObject));
			}
		}
	}
	
	/**
	 * Returns the EObject from which the given copy was created.
	 * 
	 * @param copy the copy
	 * @return the original
	 */
	public static EObject getOriginal(EObject copy) {
		if (copy == null) {
			return null;
		}
		for (Adapter a : copy.eAdapters()) {
			if (a instanceof CopiedFromAdapter) {
				return ((CopiedFromAdapter) a).getOriginal();
			}
		}
		return null;
	}
	
	/**
	 * Returns the EObject that was created as copy of the given original in 
	 * the given context.
	 * 
	 * @param original the original
	 * @param contextObject the context in which the copy was produced
	 * @param copieContainers collections of EObjects containing copies as children
	 * @return the copy
	 */
	public static EObject getCopy(EObject original, EObject contextObject, Collection<EObject> copieContainers) {
		if (original == null) {
			return null;
		}
		//maybe the original is already a copy, because we are composing a composed fragment
		//--> exchange "original" for the real original
		for (Adapter a : original.eAdapters()) {
			if (a instanceof CopiedFromAdapter) {
				original = ((CopiedFromAdapter) a).getOriginal();
				break;
			}
		}
		
		for (Iterator<EObject> copyIt = EcoreUtil.getAllContents(copieContainers); copyIt.hasNext();) {
			EObject copy = copyIt.next();
			for (Adapter a : copy.eAdapters()) {
				if (a instanceof CopiedFromAdapter) {
					CopiedFromAdapter cfa = (CopiedFromAdapter) a;
					
					if (contextObject == null || contextObject.equals(cfa.getContextObject())) {
						if (original.equals(cfa.getOriginal())) {
							return copy;
						}
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * Returns all EObjects that were created as copy of the given original in 
	 * independent of a context objects.
	 * 
	 * 
	 * @param original the original
	 * @param copieContainers collections of EObjects containing copies as children
	 * @return the copies
	 */
	public static EList<EObject> getAllCopies(EObject original, Collection<EObject> copieContainers) {
		EList<EObject> resultList = new BasicEList<EObject>();
		
		if (original == null) {
			return resultList;
		}
		//maybe the original is already a copy, because we are composing a composed fragment
		//--> exchange "original" for the real original
		for (Adapter a : original.eAdapters()) {
			if (a instanceof CopiedFromAdapter) {
				original = ((CopiedFromAdapter) a).getOriginal();
				break;
			}
		}
		
		for (Iterator<EObject> copyIt = EcoreUtil.getAllContents(copieContainers); copyIt.hasNext();) {
			EObject copy = copyIt.next();
			for (Adapter a : copy.eAdapters()) {
				if (a instanceof CopiedFromAdapter) {
					CopiedFromAdapter cfa = (CopiedFromAdapter) a;
					if (original.equals(cfa.getOriginal())) {
						resultList.add(copy);
					}
				
				}
			}
		}
		return resultList;
	}
	
	/**
	 * Finds EObjects that were replaced by the given replacement EObject during composition.
	 * 
	 * @param replacement the EObject that replaced others
	 * @return the replaced EObjects
	 */
	public static EList<EObject> getReplacedValues(EObject replacement) {
		if (replacement == null) {
			return ECollections.emptyEList();
		}
		
		for (Adapter a : replacement.eAdapters()) {
			if (a instanceof ReplacementForAdapter) {
				return ((ReplacementForAdapter) a).getReplacedValues();
			}
		}
		return ECollections.emptyEList();
	}
	
	/**
	 * Finds the setting from which the given EObject was removed during composition.
	 * 
	 * @param removed the EObject that was removed from some setting
	 * @return the setting from which the EObject was removed
	 */
	public static Setting getRemovedFromSetting(EObject removed) {
		if (removed == null) {
			return null;
		}
		
		for (Adapter a : removed.eAdapters()) {
			if (a instanceof ReplacementForAdapter) {
				return ((ReplacementForAdapter) a).getRemovedFromSetting();
			}
		}
		return null;
	}
	
	/**
	 * Removes all EObjects that were replaced by other ones from the
	 * containment hierarchy of the given containers. This method is
	 * used to clean slot elements (which are replaced in 
	 * non-containment references only) from the contents of a
	 * composed fragment.
	 * 
	 * @param containers root EObjects of the containment hierarchy to be cleaned
	 */
	public static void removeReplaced(EList<EObject> containers) {
		EList<EObject> replacedList = new BasicEList<EObject>();
		
		for (Iterator<EObject> it = EcoreUtil.getAllContents(containers); it.hasNext();) {
			EObject element = it.next();
			replacedList.addAll(getReplacedValues(element));
		}
		
		for (EObject replaced : replacedList) {
			EcoreUtil.remove(replaced);
		}
	}

	/**
	 * Marks a replaced EObject as replacement of another EObject. 
	 * This method is called to record trace information.
	 * 
	 * @param replacement the EObject that is the replacement for another EObject
	 * @param replaced the EObject that was replaced
	 */
	public static void markAsReplacement(EObject replacement, EObject replaced) {
		if (replacement == null || replaced == null) {
			return;
		}
		ReplacementForAdapter rfa = null;
		for (Iterator<Adapter> adapterIt = replacement.eAdapters().iterator(); adapterIt.hasNext();) {
			Adapter a = adapterIt.next();
			if (a instanceof ReplacementForAdapter) {
				rfa = (ReplacementForAdapter) a;
			}
		}
		if (rfa == null) {
			rfa = new ReplacementForAdapter();
			replacement.eAdapters().add(rfa);
		}
		if (!rfa.getReplacedValues().contains(replaced)) {
			rfa.getReplacedValues().add(replaced);
		}
	}
	
	/**
	 * Marks a removed EObject as removed from a certain setting.
	 * This method is called to record trace information.
	 * 
	 * @param removed the EObject that was removed from a setting
	 * @param removedFromSetting the setting the EObject was removed from
	 */
	public static void markAsRemovedFrom(EObject removed, Setting removedFromSetting) {
		if (removed == null || removedFromSetting == null) {
			return;
		}
		ReplacementForAdapter rfa = null;
		for (Iterator<Adapter> adapterIt = removed.eAdapters().iterator(); adapterIt.hasNext();) {
			Adapter a = adapterIt.next();
			if (a instanceof ReplacementForAdapter) {
				rfa = (ReplacementForAdapter) a;
			}
		}
		if (rfa == null) {
			rfa = new ReplacementForAdapter();
			removed.eAdapters().add(rfa);
		}
		rfa.setRemovedFromSetting(removedFromSetting);
	}

}
