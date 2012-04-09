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
package org.oasisopen.names.tc.opendocument.xmlns.style;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getMap <em>Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getAutoUpdate <em>Auto Update</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getDataStyleName <em>Data Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getDefaultOutlineLevel <em>Default Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getListStyleName <em>List Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getMasterPageName <em>Master Page Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getNextStyleName <em>Next Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getParentStyleName <em>Parent Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getStyleType1()
 * @model extendedMetaData="name='style_._type' kind='elementOnly'"
 * @generated
 */
public interface StyleType1 extends StyleStyleContent {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.style.MapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getStyleType1_Map()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MapType> getMap();

	/**
	 * Returns the value of the '<em><b>Auto Update</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Update</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoUpdate()
	 * @see #unsetAutoUpdate()
	 * @see #setAutoUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getStyleType1_AutoUpdate()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='auto-update' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoUpdate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getAutoUpdate <em>Auto Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Update</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoUpdate()
	 * @see #unsetAutoUpdate()
	 * @see #getAutoUpdate()
	 * @generated
	 */
	void setAutoUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getAutoUpdate <em>Auto Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoUpdate()
	 * @see #getAutoUpdate()
	 * @see #setAutoUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutoUpdate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getAutoUpdate <em>Auto Update</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Update</em>' attribute is set.
	 * @see #unsetAutoUpdate()
	 * @see #getAutoUpdate()
	 * @see #setAutoUpdate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutoUpdate();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getStyleType1_Class()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Data Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Style Name</em>' attribute.
	 * @see #setDataStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getStyleType1_DataStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.DataStyleNameType"
	 *        extendedMetaData="kind='attribute' name='data-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getDataStyleName <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Style Name</em>' attribute.
	 * @see #getDataStyleName()
	 * @generated
	 */
	void setDataStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Default Outline Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Outline Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Outline Level</em>' attribute.
	 * @see #setDefaultOutlineLevel(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getStyleType1_DefaultOutlineLevel()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='default-outline-level' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDefaultOutlineLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getDefaultOutlineLevel <em>Default Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Outline Level</em>' attribute.
	 * @see #getDefaultOutlineLevel()
	 * @generated
	 */
	void setDefaultOutlineLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getStyleType1_DisplayName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>List Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style Name</em>' attribute.
	 * @see #setListStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getStyleType1_ListStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.ListStyleNameType"
	 *        extendedMetaData="kind='attribute' name='list-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getListStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getListStyleName <em>List Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Style Name</em>' attribute.
	 * @see #getListStyleName()
	 * @generated
	 */
	void setListStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Master Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Page Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Page Name</em>' attribute.
	 * @see #setMasterPageName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getStyleType1_MasterPageName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageNameType"
	 *        extendedMetaData="kind='attribute' name='master-page-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMasterPageName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getMasterPageName <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Page Name</em>' attribute.
	 * @see #getMasterPageName()
	 * @generated
	 */
	void setMasterPageName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getStyleType1_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleName" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Style Name</em>' attribute.
	 * @see #setNextStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getStyleType1_NextStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.NextStyleNameType"
	 *        extendedMetaData="kind='attribute' name='next-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNextStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getNextStyleName <em>Next Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Style Name</em>' attribute.
	 * @see #getNextStyleName()
	 * @generated
	 */
	void setNextStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Style Name</em>' attribute.
	 * @see #setParentStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getStyleType1_ParentStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.ParentStyleNameType"
	 *        extendedMetaData="kind='attribute' name='parent-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParentStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1#getParentStyleName <em>Parent Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Style Name</em>' attribute.
	 * @see #getParentStyleName()
	 * @generated
	 */
	void setParentStyleName(String value);

} // StyleType1
