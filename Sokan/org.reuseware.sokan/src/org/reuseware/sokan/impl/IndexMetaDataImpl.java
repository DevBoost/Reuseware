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

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.SokanPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Index Meta Data</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.sokan.impl.IndexMetaDataImpl#getMultiValueFields <em>Multi Value Fields</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.IndexMetaDataImpl#getSingleValueFields <em>Single Value Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexMetaDataImpl extends EObjectImpl implements IndexMetaData {
	/**
	 * The cached value of the '{@link #getMultiValueFields() <em>Multi Value Fields</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMultiValueFields()
	 * @generated
	 * @ordered
	 */
	protected Map<String, EList<String>> multiValueFields;

	/**
	 * The cached value of the '{@link #getSingleValueFields() <em>Single Value Fields</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSingleValueFields()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> singleValueFields;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected IndexMetaDataImpl() {
		super();

		setMultiValueFields(new TreeMap<String, EList<String>>());
		setSingleValueFields(new TreeMap<String, String>());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SokanPackage.Literals.INDEX_META_DATA;
	}

	/**
	 * @generated NOT
	 */
	public List<String> getMulti(String field) {
		List<String> multi = multiValueFields.get(field);
		if (multi == null) {
			return Collections.emptyList();
		}
		return multi;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, EList<String>> getMultiValueFields() {
		return multiValueFields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setMultiValueFields(
			Map<String, EList<String>> newMultiValueFields) {
		if (newMultiValueFields != null && newMultiValueFields.size() > 0
				&& singleValueFields != null && singleValueFields.size() > 0) {
			for (String key : newMultiValueFields.keySet()) {
				if (singleValueFields.containsKey(key))
					newMultiValueFields.remove(key);
			}
		}

		Map<String, EList<String>> oldMultiValueFields = multiValueFields;
		multiValueFields = newMultiValueFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SokanPackage.INDEX_META_DATA__MULTI_VALUE_FIELDS,
					oldMultiValueFields, multiValueFields));
	}

	/**
	 * @generated NOT
	 */
	public String getSingle(String field) {
		return singleValueFields.get(field);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getSingleValueFields() {
		return singleValueFields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setSingleValueFields(Map<String, String> newSingleValueFields) {
		if (newSingleValueFields != null && newSingleValueFields.size() > 0
				&& multiValueFields != null && multiValueFields.size() > 0) {
			for (String key : newSingleValueFields.keySet()) {
				if (multiValueFields.containsKey(key))
					newSingleValueFields.remove(key);
			}
		}

		Map<String, String> oldSingleValueFields = singleValueFields;
		singleValueFields = newSingleValueFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SokanPackage.INDEX_META_DATA__SINGLE_VALUE_FIELDS,
					oldSingleValueFields, singleValueFields));
	}

	/**
	 * @generated NOT
	 */
	public boolean isEmpty() {
		return multiValueFields.isEmpty() && singleValueFields.isEmpty();
	}

	/**
	 * @generated NOT
	 */
	public void putAll(IndexMetaData metaData) {
		if (metaData == null || metaData.isEmpty())
			return;

		// single value fields
		for (Entry<String, String> entry : metaData.getSingleValueFields()
				.entrySet()) {
			putSingle(entry.getKey(), entry.getValue());
		}

		// multi value fields
		for (Entry<String, EList<String>> entry : metaData
				.getMultiValueFields().entrySet()) {
			putMultiple(entry.getKey(), entry.getValue());
		}
	}

	/**
	 * @generated NOT
	 */
	public void putMultiple(String field, List<String> values) {
		if (field == null || values == null)
			return;

		if (singleValueFields.containsKey(field))
			return;

		for (String v : values)
			putMultiple(field, v);
	}

	/**
	 * @generated NOT
	 */
	public void putMultiple(String field, String value) {
		if (field == null || value == null)
			return;

		if (singleValueFields.containsKey(field))
			return;

		EList<String> values = multiValueFields.get(field);

		if (values != null) {
			if (!values.contains(value)) {
				values.add(value);	
			}
			return;
		}

		values = new BasicEList<String>();
		values.add(value);
		multiValueFields.put(field, values);
	}

	/**
	 * @generated NOT
	 */
	public void putSingle(String field, String value) {
		if (field == null || value == null)
			return;

		if (multiValueFields.containsKey(field))
			return;

		singleValueFields.put(field, value);
	}
	
	/**
	 * @generated NOT
	 */
	public void addAll(IndexMetaData metaData) {
		if (metaData == null || metaData.isEmpty())
			return;

		// single value fields
		for (Entry<String, String> entry : metaData.getSingleValueFields()
				.entrySet()) {
			putSingle(entry.getKey(), entry.getValue());
		}

		// multi value fields
		for (Entry<String, EList<String>> entry : metaData
				.getMultiValueFields().entrySet()) {
			addMultiple(entry.getKey(), entry.getValue());
		}
	}

	/**
	 * @generated NOT
	 */
	public void addMultiple(String field, List<String> values) {
		if (field == null || values == null)
			return;

		if (singleValueFields.containsKey(field))
			return;

		for (String v : values)
			addMultiple(field, v);
	}

	/**
	 * @generated NOT
	 */
	public void addMultiple(String field, String value) {
		if (field == null || value == null)
			return;

		if (singleValueFields.containsKey(field))
			return;

		EList<String> values = multiValueFields.get(field);

		if (values != null) {
			values.add(value);
			return;
		}

		values = new BasicEList<String>();
		values.add(value);
		multiValueFields.put(field, values);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SokanPackage.INDEX_META_DATA__MULTI_VALUE_FIELDS:
				return getMultiValueFields();
			case SokanPackage.INDEX_META_DATA__SINGLE_VALUE_FIELDS:
				return getSingleValueFields();
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
			case SokanPackage.INDEX_META_DATA__MULTI_VALUE_FIELDS:
				setMultiValueFields((Map<String, EList<String>>)newValue);
				return;
			case SokanPackage.INDEX_META_DATA__SINGLE_VALUE_FIELDS:
				setSingleValueFields((Map<String, String>)newValue);
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
			case SokanPackage.INDEX_META_DATA__MULTI_VALUE_FIELDS:
				setMultiValueFields((Map<String, EList<String>>)null);
				return;
			case SokanPackage.INDEX_META_DATA__SINGLE_VALUE_FIELDS:
				setSingleValueFields((Map<String, String>)null);
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
			case SokanPackage.INDEX_META_DATA__MULTI_VALUE_FIELDS:
				return multiValueFields != null;
			case SokanPackage.INDEX_META_DATA__SINGLE_VALUE_FIELDS:
				return singleValueFields != null;
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
		result.append(" (multiValueFields: ");
		result.append(multiValueFields);
		result.append(", singleValueFields: ");
		result.append(singleValueFields);
		result.append(')');
		return result.toString();
	}

} // IndexMetaDataImpl
