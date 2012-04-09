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
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dde Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType#getDdeSource <em>Dde Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDdeLinkType()
 * @model extendedMetaData="name='dde-link_._type' kind='elementOnly'"
 * @generated
 */
public interface DdeLinkType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dde Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Source</em>' containment reference.
	 * @see #setDdeSource(TextSectionSourceDdeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDdeLinkType_DdeSource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dde-source' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	TextSectionSourceDdeType getDdeSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType#getDdeSource <em>Dde Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dde Source</em>' containment reference.
	 * @see #getDdeSource()
	 * @generated
	 */
	void setDdeSource(TextSectionSourceDdeType value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(TableType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDdeLinkType_Table()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	TableType getTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DdeLinkType#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(TableType value);

} // DdeLinkType
