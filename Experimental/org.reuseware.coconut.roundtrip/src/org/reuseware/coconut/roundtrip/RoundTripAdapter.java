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
package org.reuseware.coconut.roundtrip;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

/**
 * FIXME: This code is copied from an old version of the CopiedFromAdapter in the org.reuseware.coconut.fragment
 *        All round-trip functionality should go somewhere separate...
 * 
 * TODO mseifert: remove all the code that confirms or discards modifications.
 *                these actions must be performed separately.
 */
public class RoundTripAdapter extends AdapterImpl {

	// Original fragment data
	protected EObject original;
	protected String  originalURIFragment;
	protected final EObject contextObject;
	public boolean active = false;
	private Collection<IModificationHandler> modificationHandlers;
	private final Resource eResource;

	// Data for change operations
	private EList<EObject> copyValues;
	private int idx;
	private int type;
	private EObject copy;
	private EStructuralFeature feature;

	// Temporary data
	private Object oldChangedValue;
	private EList<EObject> tmp = new BasicEList<EObject>();
	private Object newValue;
	private Object oldValue;

	/**
	 * Standard constructor
	 * 
	 * This constructor is used when adding adapters to each element of a syntax tree
	 * 
	 * @param original The original element in source fragment
	 * @param contextObject The source fragment
	 */
	public RoundTripAdapter(EObject original, EObject contextObject) {
		super();
		this.original = original;
		this.contextObject = contextObject;
		this.eResource = original.eResource();
		if (eResource != null) {
			this.originalURIFragment = eResource.getURIFragment(original);
		}
	}

	
	/**
	 * Constructor used when adding a new element during model editing. This constructor is 
	 * needed because eResource is null when new elements are added.
	 * 
	 * @param original The original element in source fragment
	 * @param contextObject The source fragment
	 * @param originalUFI The UFI of the original element
	 * @param eResource The eResource of original fragment
	 */
	public RoundTripAdapter(EObject original, EObject contextObject,
			Resource eResource) {
		super();
		this.original = original;
		this.originalURIFragment = eResource.getURIFragment(original);
		this.contextObject = contextObject;
		this.eResource = eResource;
	}


	/**
	 * Adds new elements to the source fragment. This method is called if all 
	 * conflicts are resolved and adding should be propagated.
	 */
	public void confirmAddElements() {
		//System.out.println(hashCode() + ": confirmAddElements() originalValues = " + originalValues);
		EObject newValue = EcoreUtil.copy(copyValues.get(idx));
		//System.out.println(hashCode() + ": confirmAddElements() newValue = " + newValue);
		RoundTripAdapter newAdapter = new RoundTripAdapter(newValue,
			this.contextObject, this.eResource);
		
		//System.out.println(hashCode() + ": confirmAddElements() feature = " + feature);
		//System.out.println(hashCode() + ": confirmAddElements() feature = " + feature.getEContainingClass());
		EObject originalContainer = original.eContainer();
		//System.out.println(hashCode() + ": confirmAddElements() original = " + original);
		Object list = original.eGet(original.eClass().getEStructuralFeature(feature.getName()));
		EList<EObject> originalList = castUnchecked(list);
		//System.out.println(hashCode() + ": confirmAddElements() listInOriginal = " + originalList);
		
		if (originalList != null && copyValues != null) {

			//newAdapter.openerUFI = this.openerUFI;
			copyValues.get(idx).eAdapters().add(newAdapter);

			if (idx < originalList.size() - 1) {
				originalList.add(idx, newValue);
			} else {
				originalList.add(newValue);
			}
		}
	
		saveOriginalFragment();
		newAdapter.active = true;

	}


	@SuppressWarnings("unchecked")
	private EList<EObject> castUnchecked(Object listOfEObjects) {
		return (EList<EObject>) listOfEObjects;
	}

	/**
	 * Method for adding new elements temporary to the source fragment. This is used when 
	 * a compare view is being opened.
	 */
	public void addTemporary() {
		Copier copier = new Copier();
		Collection<EObject> tmpCopied = copier.copyAll(getOriginalValues());
		Iterator<EObject> contents = tmpCopied.iterator();
		tmp = new BasicEList<EObject>();
	
		while (contents.hasNext()) {
			tmp.add(contents.next());
		}
	
		confirmAddElements();
	}

	/**
	 * Adds an handler that listens for modifications.
	 *
	 * @param newHandler an IModificationHandler that listens to changes
	 */
	public void addModificationHandler(IModificationHandler newHandler) {

		Collection<IModificationHandler> handlers = getModificationHandlers();
		handlers.add(newHandler);
	}

	/**
	 * Method for changing an element temporary to the source fragment. This is used when 
	 * a compare view is being opened.
	 */
	public void changeTemporary() {
	
		active = false;
		oldChangedValue = original.eGet(feature);
		original.eSet(feature, newValue);
		saveOriginalFragment();
		active = true;

	}

	/**
	 * 
	 * Changes an element in the source fragment. This method is called if all 
	 * conflicts are resolved and changes should be propagated.
	 * 
	 */
	public void confirmChangeAttribute() {
		//TODO because original might be reloaded... we need to handle this in some uniform way
		EObject altOriginal = eResource.getEObject(originalURIFragment);
		if (altOriginal != null) {
			original = altOriginal;
		}
		if (feature instanceof EAttribute && newValue != null) {
			original.eSet(feature, newValue);
		} else {
			//TODO #689: this check is necessary, because sometimes the copy is not the copy but the container of the copy (that should not happen)
			if (copy.eClass().getEAllStructuralFeatures().contains(feature)) {
				return;
			}
			else  {
				original.eSet(feature, copy);
			}
		}
		
		saveOriginalFragment();
	
	}

	/**
	 * Method for removing the new added element from the edited model. 
	 * This is called if conflicts arose from adding an element. 
	 */
	public void discardAdd() {
		
		// TODO #689: also remove elements from diagram, not only from model (e.g. TopCased)
		active = false;
		copy.eSet(feature, getOriginalValues());
		active = true;

	}

	/**
	 * Method for undoing the changes at an element in the edited model. 
	 * This is called if conflicts arose from changing an element. 
	 */
	public void discardChange() {

		active = false;
		copy.eSet(feature, oldValue);
		active = true;

	}

	/**
	 * Method for undoing removal of an element from the edited model. 
	 * This is called if conflicts arose from removing an element. 
	 */
	public void discardRemove() {

		// TODO #689: also undo removal from diagram, not only from model (e.g. TopCased)
		active = false;
		copy.eSet(feature, getOriginalValues());
		active = true;

	}

	/**
	 * Searches for extensions that implement the IConflictResolver interface.
	 */
	private Collection<IModificationHandler> getRegisteredModificationHandlers() {
	
		Collection<IModificationHandler> handlers = new ArrayList<IModificationHandler>();
	
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		if (extensionRegistry == null) {
			return handlers;
		}
		
		IExtensionPoint extensionPoint = extensionRegistry
			.getExtensionPoint("org.reuseware.coconut.fragment.modificationHandler");
		IExtension[] extensions = extensionPoint.getExtensions();
		
		for (int i = 0; i < extensions.length; i++) {
			IConfigurationElement[] elements = extensions[i].getConfigurationElements();
		
			for (int j = 0; j < elements.length; j++) {
				try {
					handlers.add((IModificationHandler) elements[j].createExecutableExtension("class"));
				} catch (CoreException ce) {
					ce.printStackTrace();
				} catch (ClassCastException cc) {
					cc.printStackTrace();
				}
			}
		}
		if (handlers.size() > 1) {
			System.err.println("CopiedFromAdapter.getRegisteredModificationHandlers() found multiple registered modification handlers (" + handlers + "). This is most probably a configuration issue.");
		}
		return handlers;
	}

	private Collection<IModificationHandler> getModificationHandlers() {
		if (modificationHandlers == null) {
			modificationHandlers = new LinkedHashSet<IModificationHandler>();
			modificationHandlers.addAll(getRegisteredModificationHandlers());
		}
		return modificationHandlers;
	}

	public EObject getContextObject() {
		return contextObject;
	}

	public EList<EObject> getCopyValues() {
		return copyValues;
	}

	public EStructuralFeature getFeature() {
		return feature;
	}

	public int getIdx() {
		return idx;
	}

	public EObject getOriginal() {
		return original;
	}

	public URI getOriginalUFI() {
		URI originalUFI = URI.createURI("unknown:/UNKNOWN_SOURCE");
		Resource resource = original.eResource();
		if (resource != null) {
			if (resource.getURI() != null) {
				originalUFI = resource.getURI();
			}
		}
		return originalUFI;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type == RoundTripAdapter.class;
	}

	@Override
	@SuppressWarnings("unchecked")
	/**
	 * Method that is called when the adapted element is changed.
	 * 
	 * @param notification The notification holding change type and additional informations
	 */
	public void notifyChanged(Notification notification) {
		feature = (EStructuralFeature) notification.getFeature();
		copy = (EObject) notification.getNotifier();
		newValue = notification.getNewValue();
		oldValue = notification.getOldValue();
		
		if (!active) {
			return;
		}
		type = notification.getEventType();
		
		// non-list feature
		//if (feature.getUpperBound() == 1) {
		if (type == Notification.SET) {
			notifyChange();

		} else if (type == Notification.ADD || type == Notification.REMOVE ||
				type == Notification.ADD_MANY || type == Notification.REMOVE_MANY) {
			
			idx = notification.getPosition();
			
			copyValues = (EList<EObject>) copy.eGet(feature);

			// Remove elements
			if (type == Notification.REMOVE) {
				notifyRemove();
			}

			// Add elements
			if (type == Notification.ADD) {
				//System.out.println(hashCode() + ": notifyChanged() originalValues = " + originalValues);
				notifyAdd();
			}
		}
	}


	private EList<EObject> getOriginalValues() {
		return castUnchecked(original.eGet(feature));
	}

	/**
	 * Notifies all registered listeners about the addition 
	 * of an element.
	 */
	private void notifyAdd() {
		notifyAboutModification(EModificationType.ADD);
	}


	private void notifyAboutModification(EModificationType modificationType) {
		for (IModificationHandler handler : getModificationHandlers()) {
			URI uri = null;
			//in case of remove copy.eResource() == null
			if (copy.eResource() != null) {
				uri = copy.eResource().getURI();
			}	
			handler.handle(modificationType, uri, this);
		}
	}

	/**
	 * Notifies the registered handlers about an attribute change
	 * made to the element this adapter is attached to.
	 */
	private void notifyChange() {
		notifyAboutModification(EModificationType.CHANGE);
	}

	/**
	 * Notifies the registered handlers about the removal of
	 * an object from the element this adapter is attached to.
	 */
	private void notifyRemove() {
		notifyAboutModification(EModificationType.REMOVE);
	}

	/**
	 * Removes the element from source fragment
	 */
	public void confirmRemoveElementsFromFragment() {
		active = false;
		getOriginalValues().remove(idx);
		saveOriginalFragment();
		active = true;
	}

	/**
	 * Method for removing elements temporary from the source fragment. This is used when 
	 * a compare view is being opened.
	 */
	public void removeTemporary() {
		active = false;
		tmp = new BasicEList<EObject>(EcoreUtil.copyAll(getOriginalValues()));
		getOriginalValues().remove(idx);
		saveOriginalFragment();
	}
	
	/**
	 * Saves the source fragment after changes are propagated.
	 */
	public void saveOriginalFragment() {

		if (this.eResource != null) {
			//System.out.println("saveOriginalFragment() " + this.eResource.getURI());
			try {
				this.eResource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void setCopyValues(EList<EObject> copyValues) {
		this.copyValues = copyValues;
	}

	public void setFeature(EStructuralFeature feature) {
		this.feature = feature;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	/**
	 * Undo the propagation of changing an element.  
	 */
	public void unchange() {
		active = false;
		original.eSet(feature, oldChangedValue);
		saveOriginalFragment();
		active = true;
	}

	/**
	 * Undo the propagation of changing several elements.
	 */
	public void undoChanges() {
		getOriginalValues().clear();
		getOriginalValues().addAll(tmp);
		tmp = null;
		active = true;
		saveOriginalFragment();
	}


	public void setOriginal(EObject original) {
		this.original = original;
	}

	public Object getNewValue() {
		return newValue;
	}

	public Object getOldValue() {
		return oldValue;
	}

	public String getOriginalURIFragment() {
		return originalURIFragment;
	}

	public Resource getResource() {
		return eResource;
	}
}
