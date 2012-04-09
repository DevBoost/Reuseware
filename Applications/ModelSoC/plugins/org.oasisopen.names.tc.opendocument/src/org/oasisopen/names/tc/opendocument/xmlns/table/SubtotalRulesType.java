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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtotal Rules Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getSortGroups <em>Sort Groups</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getSubtotalRule <em>Subtotal Rule</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getBindStylesToContent <em>Bind Styles To Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getPageBreaksOnGroupChange <em>Page Breaks On Group Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSubtotalRulesType()
 * @model extendedMetaData="name='subtotal-rules_._type' kind='elementOnly'"
 * @generated
 */
public interface SubtotalRulesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sort Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Groups</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Groups</em>' containment reference.
	 * @see #setSortGroups(SortGroupsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSubtotalRulesType_SortGroups()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sort-groups' namespace='##targetNamespace'"
	 * @generated
	 */
	SortGroupsType getSortGroups();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getSortGroups <em>Sort Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Groups</em>' containment reference.
	 * @see #getSortGroups()
	 * @generated
	 */
	void setSortGroups(SortGroupsType value);

	/**
	 * Returns the value of the '<em><b>Subtotal Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtotal Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtotal Rule</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSubtotalRulesType_SubtotalRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtotal-rule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubtotalRuleType> getSubtotalRule();

	/**
	 * Returns the value of the '<em><b>Bind Styles To Content</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind Styles To Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind Styles To Content</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetBindStylesToContent()
	 * @see #unsetBindStylesToContent()
	 * @see #setBindStylesToContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSubtotalRulesType_BindStylesToContent()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='bind-styles-to-content' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBindStylesToContent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getBindStylesToContent <em>Bind Styles To Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind Styles To Content</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetBindStylesToContent()
	 * @see #unsetBindStylesToContent()
	 * @see #getBindStylesToContent()
	 * @generated
	 */
	void setBindStylesToContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getBindStylesToContent <em>Bind Styles To Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBindStylesToContent()
	 * @see #getBindStylesToContent()
	 * @see #setBindStylesToContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetBindStylesToContent();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getBindStylesToContent <em>Bind Styles To Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bind Styles To Content</em>' attribute is set.
	 * @see #unsetBindStylesToContent()
	 * @see #getBindStylesToContent()
	 * @see #setBindStylesToContent(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetBindStylesToContent();

	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Sensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCaseSensitive()
	 * @see #unsetCaseSensitive()
	 * @see #setCaseSensitive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSubtotalRulesType_CaseSensitive()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='case-sensitive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCaseSensitive();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCaseSensitive()
	 * @see #unsetCaseSensitive()
	 * @see #getCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCaseSensitive()
	 * @see #getCaseSensitive()
	 * @see #setCaseSensitive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCaseSensitive();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getCaseSensitive <em>Case Sensitive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Case Sensitive</em>' attribute is set.
	 * @see #unsetCaseSensitive()
	 * @see #getCaseSensitive()
	 * @see #setCaseSensitive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCaseSensitive();

	/**
	 * Returns the value of the '<em><b>Page Breaks On Group Change</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Breaks On Group Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Breaks On Group Change</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPageBreaksOnGroupChange()
	 * @see #unsetPageBreaksOnGroupChange()
	 * @see #setPageBreaksOnGroupChange(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getSubtotalRulesType_PageBreaksOnGroupChange()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='page-breaks-on-group-change' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPageBreaksOnGroupChange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getPageBreaksOnGroupChange <em>Page Breaks On Group Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Breaks On Group Change</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPageBreaksOnGroupChange()
	 * @see #unsetPageBreaksOnGroupChange()
	 * @see #getPageBreaksOnGroupChange()
	 * @generated
	 */
	void setPageBreaksOnGroupChange(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getPageBreaksOnGroupChange <em>Page Breaks On Group Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPageBreaksOnGroupChange()
	 * @see #getPageBreaksOnGroupChange()
	 * @see #setPageBreaksOnGroupChange(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPageBreaksOnGroupChange();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.SubtotalRulesType#getPageBreaksOnGroupChange <em>Page Breaks On Group Change</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Page Breaks On Group Change</em>' attribute is set.
	 * @see #unsetPageBreaksOnGroupChange()
	 * @see #getPageBreaksOnGroupChange()
	 * @see #setPageBreaksOnGroupChange(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetPageBreaksOnGroupChange();

} // SubtotalRulesType
