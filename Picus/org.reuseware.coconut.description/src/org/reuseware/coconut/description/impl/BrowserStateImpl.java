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
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.coconut.description.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.reuseware.coconut.description.BrowserState;
import org.reuseware.coconut.description.DescriptionPackage;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.GUIState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browser State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.impl.BrowserStateImpl#getSelectedFacets <em>Selected Facets</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.BrowserStateImpl#getGuiState <em>Gui State</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.BrowserStateImpl#getFilteredContent <em>Filtered Content</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.BrowserStateImpl#getAdditionalFacets <em>Additional Facets</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.BrowserStateImpl#getPresentedFacets <em>Presented Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BrowserStateImpl extends EObjectImpl implements BrowserState {
	/**
	 * The cached value of the '{@link #getSelectedFacets() <em>Selected Facets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedFacets()
	 * @generated
	 * @ordered
	 */
	protected EList<Facet> selectedFacets;

	/**
	 * The default value of the '{@link #getGuiState() <em>Gui State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuiState()
	 * @generated
	 * @ordered
	 */
	protected static final GUIState GUI_STATE_EDEFAULT = GUIState.REFRESH_ALL;

	/**
	 * The cached value of the '{@link #getGuiState() <em>Gui State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuiState()
	 * @generated
	 * @ordered
	 */
	protected GUIState guiState = GUI_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilteredContent() <em>Filtered Content</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteredContent()
	 * @generated
	 * @ordered
	 */
	protected EList<FragmentDescription> filteredContent;

	/**
	 * The cached value of the '{@link #getAdditionalFacets() <em>Additional Facets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalFacets()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetTypeDecorator> additionalFacets;

	/**
	 * The cached value of the '{@link #getPresentedFacets() <em>Presented Facets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentedFacets()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetTypeDecorator> presentedFacets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowserStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.BROWSER_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Facet> getSelectedFacets() {
		if (selectedFacets == null) {
			selectedFacets = new EObjectResolvingEList<Facet>(Facet.class, this, DescriptionPackage.BROWSER_STATE__SELECTED_FACETS);
		}
		return selectedFacets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIState getGuiState() {
		return guiState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuiState(GUIState newGuiState) {
		GUIState oldGuiState = guiState;
		guiState = newGuiState == null ? GUI_STATE_EDEFAULT : newGuiState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.BROWSER_STATE__GUI_STATE, oldGuiState, guiState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FragmentDescription> getFilteredContent() {
		if (filteredContent == null) {
			filteredContent = new EObjectResolvingEList<FragmentDescription>(FragmentDescription.class, this, DescriptionPackage.BROWSER_STATE__FILTERED_CONTENT);
		}
		return filteredContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacetTypeDecorator> getAdditionalFacets() {
		if (additionalFacets == null) {
			additionalFacets = new EObjectResolvingEList<FacetTypeDecorator>(FacetTypeDecorator.class, this, DescriptionPackage.BROWSER_STATE__ADDITIONAL_FACETS);
		}
		return additionalFacets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacetTypeDecorator> getPresentedFacets() {
		if (presentedFacets == null) {
			presentedFacets = new EObjectResolvingEList<FacetTypeDecorator>(FacetTypeDecorator.class, this, DescriptionPackage.BROWSER_STATE__PRESENTED_FACETS);
		}
		return presentedFacets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DescriptionPackage.BROWSER_STATE__SELECTED_FACETS:
				return getSelectedFacets();
			case DescriptionPackage.BROWSER_STATE__GUI_STATE:
				return getGuiState();
			case DescriptionPackage.BROWSER_STATE__FILTERED_CONTENT:
				return getFilteredContent();
			case DescriptionPackage.BROWSER_STATE__ADDITIONAL_FACETS:
				return getAdditionalFacets();
			case DescriptionPackage.BROWSER_STATE__PRESENTED_FACETS:
				return getPresentedFacets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DescriptionPackage.BROWSER_STATE__SELECTED_FACETS:
				getSelectedFacets().clear();
				getSelectedFacets().addAll((Collection<? extends Facet>)newValue);
				return;
			case DescriptionPackage.BROWSER_STATE__GUI_STATE:
				setGuiState((GUIState)newValue);
				return;
			case DescriptionPackage.BROWSER_STATE__FILTERED_CONTENT:
				getFilteredContent().clear();
				getFilteredContent().addAll((Collection<? extends FragmentDescription>)newValue);
				return;
			case DescriptionPackage.BROWSER_STATE__ADDITIONAL_FACETS:
				getAdditionalFacets().clear();
				getAdditionalFacets().addAll((Collection<? extends FacetTypeDecorator>)newValue);
				return;
			case DescriptionPackage.BROWSER_STATE__PRESENTED_FACETS:
				getPresentedFacets().clear();
				getPresentedFacets().addAll((Collection<? extends FacetTypeDecorator>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DescriptionPackage.BROWSER_STATE__SELECTED_FACETS:
				getSelectedFacets().clear();
				return;
			case DescriptionPackage.BROWSER_STATE__GUI_STATE:
				setGuiState(GUI_STATE_EDEFAULT);
				return;
			case DescriptionPackage.BROWSER_STATE__FILTERED_CONTENT:
				getFilteredContent().clear();
				return;
			case DescriptionPackage.BROWSER_STATE__ADDITIONAL_FACETS:
				getAdditionalFacets().clear();
				return;
			case DescriptionPackage.BROWSER_STATE__PRESENTED_FACETS:
				getPresentedFacets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DescriptionPackage.BROWSER_STATE__SELECTED_FACETS:
				return selectedFacets != null && !selectedFacets.isEmpty();
			case DescriptionPackage.BROWSER_STATE__GUI_STATE:
				return guiState != GUI_STATE_EDEFAULT;
			case DescriptionPackage.BROWSER_STATE__FILTERED_CONTENT:
				return filteredContent != null && !filteredContent.isEmpty();
			case DescriptionPackage.BROWSER_STATE__ADDITIONAL_FACETS:
				return additionalFacets != null && !additionalFacets.isEmpty();
			case DescriptionPackage.BROWSER_STATE__PRESENTED_FACETS:
				return presentedFacets != null && !presentedFacets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (guiState: ");
		result.append(guiState);
		result.append(')');
		return result.toString();
	}

} //BrowserStateImpl
