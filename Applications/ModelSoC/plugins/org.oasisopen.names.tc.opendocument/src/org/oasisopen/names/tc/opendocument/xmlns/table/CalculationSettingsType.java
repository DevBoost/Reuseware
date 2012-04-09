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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculation Settings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getNullDate <em>Null Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getIteration <em>Iteration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getAutomaticFindLabels <em>Automatic Find Labels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getNullYear <em>Null Year</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getPrecisionAsShown <em>Precision As Shown</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getSearchCriteriaMustApplyToWholeCell <em>Search Criteria Must Apply To Whole Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getUseRegularExpressions <em>Use Regular Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCalculationSettingsType()
 * @model extendedMetaData="name='calculation-settings_._type' kind='elementOnly'"
 * @generated
 */
public interface CalculationSettingsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Null Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Date</em>' containment reference.
	 * @see #setNullDate(NullDateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCalculationSettingsType_NullDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='null-date' namespace='##targetNamespace'"
	 * @generated
	 */
	NullDateType getNullDate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getNullDate <em>Null Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Date</em>' containment reference.
	 * @see #getNullDate()
	 * @generated
	 */
	void setNullDate(NullDateType value);

	/**
	 * Returns the value of the '<em><b>Iteration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration</em>' containment reference.
	 * @see #setIteration(IterationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCalculationSettingsType_Iteration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='iteration' namespace='##targetNamespace'"
	 * @generated
	 */
	IterationType getIteration();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getIteration <em>Iteration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration</em>' containment reference.
	 * @see #getIteration()
	 * @generated
	 */
	void setIteration(IterationType value);

	/**
	 * Returns the value of the '<em><b>Automatic Find Labels</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Find Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Find Labels</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutomaticFindLabels()
	 * @see #unsetAutomaticFindLabels()
	 * @see #setAutomaticFindLabels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCalculationSettingsType_AutomaticFindLabels()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='automatic-find-labels' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticFindLabels();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getAutomaticFindLabels <em>Automatic Find Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Find Labels</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutomaticFindLabels()
	 * @see #unsetAutomaticFindLabels()
	 * @see #getAutomaticFindLabels()
	 * @generated
	 */
	void setAutomaticFindLabels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getAutomaticFindLabels <em>Automatic Find Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutomaticFindLabels()
	 * @see #getAutomaticFindLabels()
	 * @see #setAutomaticFindLabels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutomaticFindLabels();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getAutomaticFindLabels <em>Automatic Find Labels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Automatic Find Labels</em>' attribute is set.
	 * @see #unsetAutomaticFindLabels()
	 * @see #getAutomaticFindLabels()
	 * @see #setAutomaticFindLabels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutomaticFindLabels();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCalculationSettingsType_CaseSensitive()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='case-sensitive' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCaseSensitive();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getCaseSensitive <em>Case Sensitive</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCaseSensitive()
	 * @see #getCaseSensitive()
	 * @see #setCaseSensitive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCaseSensitive();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getCaseSensitive <em>Case Sensitive</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Null Year</b></em>' attribute.
	 * The default value is <code>"1930"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Year</em>' attribute.
	 * @see #isSetNullYear()
	 * @see #unsetNullYear()
	 * @see #setNullYear(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCalculationSettingsType_NullYear()
	 * @model default="1930" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='null-year' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNullYear();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getNullYear <em>Null Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Year</em>' attribute.
	 * @see #isSetNullYear()
	 * @see #unsetNullYear()
	 * @see #getNullYear()
	 * @generated
	 */
	void setNullYear(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getNullYear <em>Null Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullYear()
	 * @see #getNullYear()
	 * @see #setNullYear(BigInteger)
	 * @generated
	 */
	void unsetNullYear();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getNullYear <em>Null Year</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Null Year</em>' attribute is set.
	 * @see #unsetNullYear()
	 * @see #getNullYear()
	 * @see #setNullYear(BigInteger)
	 * @generated
	 */
	boolean isSetNullYear();

	/**
	 * Returns the value of the '<em><b>Precision As Shown</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision As Shown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision As Shown</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPrecisionAsShown()
	 * @see #unsetPrecisionAsShown()
	 * @see #setPrecisionAsShown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCalculationSettingsType_PrecisionAsShown()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='precision-as-shown' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrecisionAsShown();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getPrecisionAsShown <em>Precision As Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision As Shown</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPrecisionAsShown()
	 * @see #unsetPrecisionAsShown()
	 * @see #getPrecisionAsShown()
	 * @generated
	 */
	void setPrecisionAsShown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getPrecisionAsShown <em>Precision As Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionAsShown()
	 * @see #getPrecisionAsShown()
	 * @see #setPrecisionAsShown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPrecisionAsShown();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getPrecisionAsShown <em>Precision As Shown</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision As Shown</em>' attribute is set.
	 * @see #unsetPrecisionAsShown()
	 * @see #getPrecisionAsShown()
	 * @see #setPrecisionAsShown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetPrecisionAsShown();

	/**
	 * Returns the value of the '<em><b>Search Criteria Must Apply To Whole Cell</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Criteria Must Apply To Whole Cell</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Criteria Must Apply To Whole Cell</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSearchCriteriaMustApplyToWholeCell()
	 * @see #unsetSearchCriteriaMustApplyToWholeCell()
	 * @see #setSearchCriteriaMustApplyToWholeCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCalculationSettingsType_SearchCriteriaMustApplyToWholeCell()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='search-criteria-must-apply-to-whole-cell' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSearchCriteriaMustApplyToWholeCell();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getSearchCriteriaMustApplyToWholeCell <em>Search Criteria Must Apply To Whole Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Criteria Must Apply To Whole Cell</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSearchCriteriaMustApplyToWholeCell()
	 * @see #unsetSearchCriteriaMustApplyToWholeCell()
	 * @see #getSearchCriteriaMustApplyToWholeCell()
	 * @generated
	 */
	void setSearchCriteriaMustApplyToWholeCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getSearchCriteriaMustApplyToWholeCell <em>Search Criteria Must Apply To Whole Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSearchCriteriaMustApplyToWholeCell()
	 * @see #getSearchCriteriaMustApplyToWholeCell()
	 * @see #setSearchCriteriaMustApplyToWholeCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetSearchCriteriaMustApplyToWholeCell();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getSearchCriteriaMustApplyToWholeCell <em>Search Criteria Must Apply To Whole Cell</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Search Criteria Must Apply To Whole Cell</em>' attribute is set.
	 * @see #unsetSearchCriteriaMustApplyToWholeCell()
	 * @see #getSearchCriteriaMustApplyToWholeCell()
	 * @see #setSearchCriteriaMustApplyToWholeCell(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetSearchCriteriaMustApplyToWholeCell();

	/**
	 * Returns the value of the '<em><b>Use Regular Expressions</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Regular Expressions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Regular Expressions</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseRegularExpressions()
	 * @see #unsetUseRegularExpressions()
	 * @see #setUseRegularExpressions(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCalculationSettingsType_UseRegularExpressions()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-regular-expressions' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseRegularExpressions();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getUseRegularExpressions <em>Use Regular Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Regular Expressions</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseRegularExpressions()
	 * @see #unsetUseRegularExpressions()
	 * @see #getUseRegularExpressions()
	 * @generated
	 */
	void setUseRegularExpressions(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getUseRegularExpressions <em>Use Regular Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseRegularExpressions()
	 * @see #getUseRegularExpressions()
	 * @see #setUseRegularExpressions(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseRegularExpressions();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CalculationSettingsType#getUseRegularExpressions <em>Use Regular Expressions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Regular Expressions</em>' attribute is set.
	 * @see #unsetUseRegularExpressions()
	 * @see #getUseRegularExpressions()
	 * @see #setUseRegularExpressions(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseRegularExpressions();

} // CalculationSettingsType
