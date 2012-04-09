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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alphabetical Index Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getIndexTitleTemplate <em>Index Title Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getAlphabeticalIndexEntryTemplate <em>Alphabetical Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getAlphabeticalSeparators <em>Alphabetical Separators</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCapitalizeEntries <em>Capitalize Entries</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCombineEntries <em>Combine Entries</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCombineEntriesWithDash <em>Combine Entries With Dash</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCombineEntriesWithPp <em>Combine Entries With Pp</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCommaSeparated <em>Comma Separated</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getIgnoreCase <em>Ignore Case</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getIndexScope <em>Index Scope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getMainEntryStyleName <em>Main Entry Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getSortAlgorithm <em>Sort Algorithm</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getUseKeysAsEntries <em>Use Keys As Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType()
 * @model extendedMetaData="name='alphabetical-index-source_._type' kind='elementOnly'"
 * @generated
 */
public interface AlphabeticalIndexSourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Index Title Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Title Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Title Template</em>' containment reference.
	 * @see #setIndexTitleTemplate(IndexTitleTemplateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_IndexTitleTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='index-title-template' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexTitleTemplateType getIndexTitleTemplate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getIndexTitleTemplate <em>Index Title Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Title Template</em>' containment reference.
	 * @see #getIndexTitleTemplate()
	 * @generated
	 */
	void setIndexTitleTemplate(IndexTitleTemplateType value);

	/**
	 * Returns the value of the '<em><b>Alphabetical Index Entry Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexEntryTemplateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Index Entry Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Index Entry Template</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_AlphabeticalIndexEntryTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-entry-template' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AlphabeticalIndexEntryTemplateType> getAlphabeticalIndexEntryTemplate();

	/**
	 * Returns the value of the '<em><b>Alphabetical Separators</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Separators</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Separators</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAlphabeticalSeparators()
	 * @see #unsetAlphabeticalSeparators()
	 * @see #setAlphabeticalSeparators(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_AlphabeticalSeparators()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='alphabetical-separators' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAlphabeticalSeparators();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getAlphabeticalSeparators <em>Alphabetical Separators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alphabetical Separators</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAlphabeticalSeparators()
	 * @see #unsetAlphabeticalSeparators()
	 * @see #getAlphabeticalSeparators()
	 * @generated
	 */
	void setAlphabeticalSeparators(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getAlphabeticalSeparators <em>Alphabetical Separators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlphabeticalSeparators()
	 * @see #getAlphabeticalSeparators()
	 * @see #setAlphabeticalSeparators(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAlphabeticalSeparators();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getAlphabeticalSeparators <em>Alphabetical Separators</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alphabetical Separators</em>' attribute is set.
	 * @see #unsetAlphabeticalSeparators()
	 * @see #getAlphabeticalSeparators()
	 * @see #setAlphabeticalSeparators(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAlphabeticalSeparators();

	/**
	 * Returns the value of the '<em><b>Capitalize Entries</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capitalize Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capitalize Entries</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCapitalizeEntries()
	 * @see #unsetCapitalizeEntries()
	 * @see #setCapitalizeEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_CapitalizeEntries()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='capitalize-entries' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCapitalizeEntries();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCapitalizeEntries <em>Capitalize Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capitalize Entries</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCapitalizeEntries()
	 * @see #unsetCapitalizeEntries()
	 * @see #getCapitalizeEntries()
	 * @generated
	 */
	void setCapitalizeEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCapitalizeEntries <em>Capitalize Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapitalizeEntries()
	 * @see #getCapitalizeEntries()
	 * @see #setCapitalizeEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCapitalizeEntries();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCapitalizeEntries <em>Capitalize Entries</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capitalize Entries</em>' attribute is set.
	 * @see #unsetCapitalizeEntries()
	 * @see #getCapitalizeEntries()
	 * @see #setCapitalizeEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCapitalizeEntries();

	/**
	 * Returns the value of the '<em><b>Combine Entries</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combine Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combine Entries</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCombineEntries()
	 * @see #unsetCombineEntries()
	 * @see #setCombineEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_CombineEntries()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='combine-entries' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCombineEntries();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCombineEntries <em>Combine Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combine Entries</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCombineEntries()
	 * @see #unsetCombineEntries()
	 * @see #getCombineEntries()
	 * @generated
	 */
	void setCombineEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCombineEntries <em>Combine Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCombineEntries()
	 * @see #getCombineEntries()
	 * @see #setCombineEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCombineEntries();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCombineEntries <em>Combine Entries</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Combine Entries</em>' attribute is set.
	 * @see #unsetCombineEntries()
	 * @see #getCombineEntries()
	 * @see #setCombineEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCombineEntries();

	/**
	 * Returns the value of the '<em><b>Combine Entries With Dash</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combine Entries With Dash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combine Entries With Dash</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCombineEntriesWithDash()
	 * @see #unsetCombineEntriesWithDash()
	 * @see #setCombineEntriesWithDash(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_CombineEntriesWithDash()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='combine-entries-with-dash' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCombineEntriesWithDash();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCombineEntriesWithDash <em>Combine Entries With Dash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combine Entries With Dash</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCombineEntriesWithDash()
	 * @see #unsetCombineEntriesWithDash()
	 * @see #getCombineEntriesWithDash()
	 * @generated
	 */
	void setCombineEntriesWithDash(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCombineEntriesWithDash <em>Combine Entries With Dash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCombineEntriesWithDash()
	 * @see #getCombineEntriesWithDash()
	 * @see #setCombineEntriesWithDash(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCombineEntriesWithDash();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCombineEntriesWithDash <em>Combine Entries With Dash</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Combine Entries With Dash</em>' attribute is set.
	 * @see #unsetCombineEntriesWithDash()
	 * @see #getCombineEntriesWithDash()
	 * @see #setCombineEntriesWithDash(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCombineEntriesWithDash();

	/**
	 * Returns the value of the '<em><b>Combine Entries With Pp</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combine Entries With Pp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combine Entries With Pp</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCombineEntriesWithPp()
	 * @see #unsetCombineEntriesWithPp()
	 * @see #setCombineEntriesWithPp(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_CombineEntriesWithPp()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='combine-entries-with-pp' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCombineEntriesWithPp();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCombineEntriesWithPp <em>Combine Entries With Pp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combine Entries With Pp</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCombineEntriesWithPp()
	 * @see #unsetCombineEntriesWithPp()
	 * @see #getCombineEntriesWithPp()
	 * @generated
	 */
	void setCombineEntriesWithPp(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCombineEntriesWithPp <em>Combine Entries With Pp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCombineEntriesWithPp()
	 * @see #getCombineEntriesWithPp()
	 * @see #setCombineEntriesWithPp(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCombineEntriesWithPp();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCombineEntriesWithPp <em>Combine Entries With Pp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Combine Entries With Pp</em>' attribute is set.
	 * @see #unsetCombineEntriesWithPp()
	 * @see #getCombineEntriesWithPp()
	 * @see #setCombineEntriesWithPp(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCombineEntriesWithPp();

	/**
	 * Returns the value of the '<em><b>Comma Separated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comma Separated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comma Separated</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCommaSeparated()
	 * @see #unsetCommaSeparated()
	 * @see #setCommaSeparated(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_CommaSeparated()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='comma-separated' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCommaSeparated();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCommaSeparated <em>Comma Separated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comma Separated</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCommaSeparated()
	 * @see #unsetCommaSeparated()
	 * @see #getCommaSeparated()
	 * @generated
	 */
	void setCommaSeparated(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCommaSeparated <em>Comma Separated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCommaSeparated()
	 * @see #getCommaSeparated()
	 * @see #setCommaSeparated(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCommaSeparated();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCommaSeparated <em>Comma Separated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comma Separated</em>' attribute is set.
	 * @see #unsetCommaSeparated()
	 * @see #getCommaSeparated()
	 * @see #setCommaSeparated(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCommaSeparated();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_Country()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CountryCode"
	 *        extendedMetaData="kind='attribute' name='country' namespace='urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Case</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Case</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIgnoreCase()
	 * @see #unsetIgnoreCase()
	 * @see #setIgnoreCase(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_IgnoreCase()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ignore-case' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIgnoreCase();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getIgnoreCase <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Case</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIgnoreCase()
	 * @see #unsetIgnoreCase()
	 * @see #getIgnoreCase()
	 * @generated
	 */
	void setIgnoreCase(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getIgnoreCase <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreCase()
	 * @see #getIgnoreCase()
	 * @see #setIgnoreCase(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIgnoreCase();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getIgnoreCase <em>Ignore Case</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Case</em>' attribute is set.
	 * @see #unsetIgnoreCase()
	 * @see #getIgnoreCase()
	 * @see #setIgnoreCase(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetIgnoreCase();

	/**
	 * Returns the value of the '<em><b>Index Scope</b></em>' attribute.
	 * The default value is <code>"document"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Scope</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType
	 * @see #isSetIndexScope()
	 * @see #unsetIndexScope()
	 * @see #setIndexScope(IndexScopeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_IndexScope()
	 * @model default="document" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='index-scope' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexScopeType getIndexScope();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getIndexScope <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Scope</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType
	 * @see #isSetIndexScope()
	 * @see #unsetIndexScope()
	 * @see #getIndexScope()
	 * @generated
	 */
	void setIndexScope(IndexScopeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getIndexScope <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndexScope()
	 * @see #getIndexScope()
	 * @see #setIndexScope(IndexScopeType)
	 * @generated
	 */
	void unsetIndexScope();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getIndexScope <em>Index Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index Scope</em>' attribute is set.
	 * @see #unsetIndexScope()
	 * @see #getIndexScope()
	 * @see #setIndexScope(IndexScopeType)
	 * @generated
	 */
	boolean isSetIndexScope();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_Language()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='language' namespace='urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Main Entry Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Entry Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Entry Style Name</em>' attribute.
	 * @see #setMainEntryStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_MainEntryStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.MainEntryStyleNameType"
	 *        extendedMetaData="kind='attribute' name='main-entry-style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMainEntryStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getMainEntryStyleName <em>Main Entry Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Entry Style Name</em>' attribute.
	 * @see #getMainEntryStyleName()
	 * @generated
	 */
	void setMainEntryStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Relative Tab Stop Position</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Tab Stop Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Tab Stop Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRelativeTabStopPosition()
	 * @see #unsetRelativeTabStopPosition()
	 * @see #setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_RelativeTabStopPosition()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='relative-tab-stop-position' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRelativeTabStopPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Tab Stop Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRelativeTabStopPosition()
	 * @see #unsetRelativeTabStopPosition()
	 * @see #getRelativeTabStopPosition()
	 * @generated
	 */
	void setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativeTabStopPosition()
	 * @see #getRelativeTabStopPosition()
	 * @see #setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetRelativeTabStopPosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relative Tab Stop Position</em>' attribute is set.
	 * @see #unsetRelativeTabStopPosition()
	 * @see #getRelativeTabStopPosition()
	 * @see #setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetRelativeTabStopPosition();

	/**
	 * Returns the value of the '<em><b>Sort Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Algorithm</em>' attribute.
	 * @see #setSortAlgorithm(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_SortAlgorithm()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='sort-algorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSortAlgorithm();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getSortAlgorithm <em>Sort Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Algorithm</em>' attribute.
	 * @see #getSortAlgorithm()
	 * @generated
	 */
	void setSortAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Use Keys As Entries</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Keys As Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Keys As Entries</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseKeysAsEntries()
	 * @see #unsetUseKeysAsEntries()
	 * @see #setUseKeysAsEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexSourceType_UseKeysAsEntries()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-keys-as-entries' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseKeysAsEntries();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getUseKeysAsEntries <em>Use Keys As Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Keys As Entries</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseKeysAsEntries()
	 * @see #unsetUseKeysAsEntries()
	 * @see #getUseKeysAsEntries()
	 * @generated
	 */
	void setUseKeysAsEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getUseKeysAsEntries <em>Use Keys As Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseKeysAsEntries()
	 * @see #getUseKeysAsEntries()
	 * @see #setUseKeysAsEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseKeysAsEntries();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexSourceType#getUseKeysAsEntries <em>Use Keys As Entries</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Keys As Entries</em>' attribute is set.
	 * @see #unsetUseKeysAsEntries()
	 * @see #getUseKeysAsEntries()
	 * @see #setUseKeysAsEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseKeysAsEntries();

} // AlphabeticalIndexSourceType
