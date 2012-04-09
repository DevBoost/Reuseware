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
package org.reuseware.sokan;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * 
 * Describes the part of an index, that gets created by custom
 * <code>Indexer</code>s . It stores single and multi value fields which get
 * added to the index during the index creation process. Single value fields are
 * those fields of an index that contain one and only one value, while multi
 * value fields can contain a list of values. <br>
 * <br>
 * 
 * <b>Note:</b><br>
 * When putting new data into an <code>IndexMetaData</code> all given field
 * names need to be unique. This means there must not be any equal fields stored
 * in this <code>IndexMetaData</code>'s <code>singleValueFields</code> or
 * <code>multiValueFields</code> as well as in the index itself.
 * 
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.reuseware.sokan.IndexMetaData#getMultiValueFields <em>
 * multiValueFields</em>}</li>
 * <li>{@link org.reuseware.sokan.IndexMetaData#getSingleValueFields <em>
 * singleValueFields</em>}</li>
 * </ul>
 * </p>
 * 
 * @author Matthias Schmidt
 * 
 * @see IndexMetaData#putMultiple(String, String)
 * @see IndexMetaData#putSingle(String, String)
 * @see org.reuseware.sokan.index.Indexer
 * @generated
 */
public interface IndexMetaData extends EObject {
	/**
	 * Retrieves the list of values associated to the given multi value field.
	 * 
	 * @param field
	 *            A field name.
	 * @return The associated list of values or <code>null</code> if there is
	 *         non.
	 * 
	 * @generated NOT
	 */
	List<String> getMulti(String field);

	/**
	 * Returns the value of the '<em><b>Multi Value Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Value Fields</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Value Fields</em>' attribute.
	 * @see #setMultiValueFields(Map)
	 * @see org.reuseware.sokan.SokanPackage#getIndexMetaData_MultiValueFields()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, EList<String>> getMultiValueFields();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.IndexMetaData#getMultiValueFields <em>Multi Value Fields</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Multi Value Fields</em>' attribute.
	 * @see #getMultiValueFields()
	 * @generated
	 */
	void setMultiValueFields(Map<String, EList<String>> value);

	/**
	 * Retrieves the single value associated to the given single value field.
	 * 
	 * @param field
	 *            A field name.
	 * @return The associated value or <code>null</code> if there is non.
	 * 
	 * @generated NOT
	 */
	String getSingle(String field);

	/**
	 * Returns the value of the '<em><b>Single Value Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Value Fields</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Value Fields</em>' attribute.
	 * @see #setSingleValueFields(Map)
	 * @see org.reuseware.sokan.SokanPackage#getIndexMetaData_SingleValueFields()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getSingleValueFields();

	/**
	 * Sets the value of the '{@link org.reuseware.sokan.IndexMetaData#getSingleValueFields <em>Single Value Fields</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Single Value Fields</em>' attribute.
	 * @see #getSingleValueFields()
	 * @generated
	 */
	void setSingleValueFields(Map<String, String> value);

	/**
	 * Check's whether this <code>IndexMetaData</code> contains anything.
	 * 
	 * @return <code>True</code> if both <code>multiValueFields</code> and
	 *         <code>singleValueFields</code> are empty, else <code>false</code>
	 *         .
	 * @generated NOT
	 */
	boolean isEmpty();

	/**
	 * Maintains single and multi value fields of the given
	 * <code>IndexMetaData</code> under the condition that the field values
	 * didn't exist in this <code>IndexMetaData</code> before.<br>
	 * 
	 * @param metaData
	 *            The <code>IndexMetaData</code> object storing fields that
	 *            should put to this <code>IndexMetaData</code>.
	 * @see IndexMetaData
	 * @generated NOT
	 */
	void putAll(IndexMetaData metaData);

	/**
	 * Maintains a multi-value field of the index. <br>
	 * If this <code>IndexMetaData</code> doesn't contain the field given a new
	 * one is created, else the given values are added to the field's list of
	 * values under the condition, that they didn't exist in this list before.
	 * 
	 * @param field
	 *            A field name. This name needs to be unique in the index as
	 *            recurring field names in different <code>Indexer</code>s will
	 *            lead to data loss.
	 * @param values
	 *            A list of new values associated to the field.
	 * @see IndexMetaData
	 * @generated NOT
	 */
	void putMultiple(String field, List<String> values);

	/**
	 * Maintains a multi-value field of the index. <br>
	 * If this <code>IndexMetaData</code> doesn't contain the field given a new
	 * one is created, else it is checked whether the field's list contains the
	 * given value. If so, the given value won't be added.
	 * 
	 * @param field
	 *            A field name. This name needs to be unique in the index as
	 *            recurring field names in different <code>Indexer</code>s will
	 *            lead to data loss.
	 * @param value
	 *            The new value associated to the field.
	 * @see IndexMetaData
	 * @generated NOT
	 */
	void putMultiple(String field, String value);

	/**
	 * Maintains a single-value field of the index. <br>
	 * If this <code>IndexMetaData</code> doesn't contain the field given a new
	 * one is created, else the given value will override the old one associated
	 * to the existing field.
	 * 
	 * @param field
	 *            A field name. This name needs to be unique in the index as
	 *            recurring field names in different <code>Indexer</code>s will
	 *            lead to data loss.
	 * @param value
	 *            The new value associated to the field.
	 * @see IndexMetaData
	 * 
	 * @generated NOT
	 */
	void putSingle(String field, String value);

	/**
	 * Maintains a multi-value field of the index. <br>
	 * If this <code>IndexMetaData</code> doesn't contain the field given a new
	 * one is created, else the given value is added to the field's list of
	 * values.
	 * 
	 * @param field
	 *            A field name. This name needs to be unique in the index as
	 *            recurring field names in different <code>Indexer</code>s will
	 *            lead to data loss.
	 * @param value
	 *            The new value associated to the field.
	 * @see IndexMetaData
	 * @generated NOT
	 */
	void addMultiple(String field, String value);

	/**
	 * Maintains a multi-value field of the index. <br>
	 * If this <code>IndexMetaData</code> doesn't contain the field given a new
	 * one is created, else the given values are added to the field's list of
	 * values.
	 * 
	 * @param field
	 *            A field name. This name needs to be unique in the index as
	 *            recurring field names in different <code>Indexer</code>s will
	 *            lead to data loss.
	 * @param values
	 *            A list of new values associated to the field.
	 * @see IndexMetaData
	 * @generated NOT
	 */
	void addMultiple(String field, List<String> values);

	/**
	 * Maintains single and multi value fields of the given
	 * <code>IndexMetaData</code>.<br>
	 * 
	 * @param metaData
	 *            The <code>IndexMetaData</code> object storing fields that
	 *            should put to this <code>IndexMetaData</code>.
	 * @see IndexMetaData
	 * @generated NOT
	 */
	void addAll(IndexMetaData metaData);
} // IndexMetaData
