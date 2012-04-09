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
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placeholder Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderType#getPlaceholderType <em>Placeholder Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPlaceholderType()
 * @model extendedMetaData="name='placeholder_._type' kind='mixed'"
 * @generated
 */
public interface PlaceholderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPlaceholderType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPlaceholderType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDescription();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Object value);

	/**
	 * Returns the value of the '<em><b>Placeholder Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderTypeType
	 * @see #isSetPlaceholderType()
	 * @see #unsetPlaceholderType()
	 * @see #setPlaceholderType(PlaceholderTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getPlaceholderType_PlaceholderType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='placeholder-type' namespace='##targetNamespace'"
	 * @generated
	 */
	PlaceholderTypeType getPlaceholderType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderType#getPlaceholderType <em>Placeholder Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderTypeType
	 * @see #isSetPlaceholderType()
	 * @see #unsetPlaceholderType()
	 * @see #getPlaceholderType()
	 * @generated
	 */
	void setPlaceholderType(PlaceholderTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderType#getPlaceholderType <em>Placeholder Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlaceholderType()
	 * @see #getPlaceholderType()
	 * @see #setPlaceholderType(PlaceholderTypeType)
	 * @generated
	 */
	void unsetPlaceholderType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.PlaceholderType#getPlaceholderType <em>Placeholder Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Placeholder Type</em>' attribute is set.
	 * @see #unsetPlaceholderType()
	 * @see #getPlaceholderType()
	 * @see #setPlaceholderType(PlaceholderTypeType)
	 * @generated
	 */
	boolean isSetPlaceholderType();

} // PlaceholderType
