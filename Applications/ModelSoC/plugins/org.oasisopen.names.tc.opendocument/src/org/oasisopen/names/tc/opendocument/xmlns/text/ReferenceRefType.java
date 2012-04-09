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
 * A representation of the model object '<em><b>Reference Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceRefType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceRefType#getReferenceFormat <em>Reference Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceRefType#getRefName <em>Ref Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getReferenceRefType()
 * @model extendedMetaData="name='reference-ref_._type' kind='mixed'"
 * @generated
 */
public interface ReferenceRefType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getReferenceRefType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Reference Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceFormatType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Format</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceFormatType1
	 * @see #isSetReferenceFormat()
	 * @see #unsetReferenceFormat()
	 * @see #setReferenceFormat(ReferenceFormatType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getReferenceRefType_ReferenceFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='reference-format' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceFormatType1 getReferenceFormat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceRefType#getReferenceFormat <em>Reference Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Format</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceFormatType1
	 * @see #isSetReferenceFormat()
	 * @see #unsetReferenceFormat()
	 * @see #getReferenceFormat()
	 * @generated
	 */
	void setReferenceFormat(ReferenceFormatType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceRefType#getReferenceFormat <em>Reference Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceFormat()
	 * @see #getReferenceFormat()
	 * @see #setReferenceFormat(ReferenceFormatType1)
	 * @generated
	 */
	void unsetReferenceFormat();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceRefType#getReferenceFormat <em>Reference Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Format</em>' attribute is set.
	 * @see #unsetReferenceFormat()
	 * @see #getReferenceFormat()
	 * @see #setReferenceFormat(ReferenceFormatType1)
	 * @generated
	 */
	boolean isSetReferenceFormat();

	/**
	 * Returns the value of the '<em><b>Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Name</em>' attribute.
	 * @see #setRefName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getReferenceRefType_RefName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='ref-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceRefType#getRefName <em>Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Name</em>' attribute.
	 * @see #getRefName()
	 * @generated
	 */
	void setRefName(String value);

} // ReferenceRefType
