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
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.sokan.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.FacetedResponse;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.SokanPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Faceted Response</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.sokan.impl.FacetedResponseImpl#getValueCountMap <em>Value Count Map</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.FacetedResponseImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.FacetedResponseImpl#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetedResponseImpl extends EObjectImpl implements FacetedResponse {
	/**
	 * The cached value of the '{@link #getValueCountMap() <em>Value Count Map</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getValueCountMap()
	 * @generated
	 * @ordered
	 */
	protected Map<String, Map<String, Long>> valueCountMap;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexRow> content;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected FacetedRequest query;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetedResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SokanPackage.Literals.FACETED_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, Map<String, Long>> getValueCountMap() {
		return valueCountMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueCountMap(Map<String, Map<String, Long>> newValueCountMap) {
		Map<String, Map<String, Long>> oldValueCountMap = valueCountMap;
		valueCountMap = newValueCountMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.FACETED_RESPONSE__VALUE_COUNT_MAP, oldValueCountMap, valueCountMap));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexRow> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<IndexRow>(IndexRow.class, this, SokanPackage.FACETED_RESPONSE__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FacetedRequest getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(FacetedRequest newQuery, NotificationChain msgs) {
		FacetedRequest oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SokanPackage.FACETED_RESPONSE__QUERY, oldQuery, newQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(FacetedRequest newQuery) {
		if (newQuery != query) {
			NotificationChain msgs = null;
			if (query != null)
				msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SokanPackage.FACETED_RESPONSE__QUERY, null, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SokanPackage.FACETED_RESPONSE__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.FACETED_RESPONSE__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SokanPackage.FACETED_RESPONSE__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case SokanPackage.FACETED_RESPONSE__QUERY:
				return basicSetQuery(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SokanPackage.FACETED_RESPONSE__VALUE_COUNT_MAP:
				return getValueCountMap();
			case SokanPackage.FACETED_RESPONSE__CONTENT:
				return getContent();
			case SokanPackage.FACETED_RESPONSE__QUERY:
				return getQuery();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SokanPackage.FACETED_RESPONSE__VALUE_COUNT_MAP:
				setValueCountMap((Map<String, Map<String, Long>>)newValue);
				return;
			case SokanPackage.FACETED_RESPONSE__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends IndexRow>)newValue);
				return;
			case SokanPackage.FACETED_RESPONSE__QUERY:
				setQuery((FacetedRequest)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SokanPackage.FACETED_RESPONSE__VALUE_COUNT_MAP:
				setValueCountMap((Map<String, Map<String, Long>>)null);
				return;
			case SokanPackage.FACETED_RESPONSE__CONTENT:
				getContent().clear();
				return;
			case SokanPackage.FACETED_RESPONSE__QUERY:
				setQuery((FacetedRequest)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SokanPackage.FACETED_RESPONSE__VALUE_COUNT_MAP:
				return valueCountMap != null;
			case SokanPackage.FACETED_RESPONSE__CONTENT:
				return content != null && !content.isEmpty();
			case SokanPackage.FACETED_RESPONSE__QUERY:
				return query != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (valueCountMap: ");
		result.append(valueCountMap);
		result.append(')');
		return result.toString();
	}

} // FacetedResponseImpl
