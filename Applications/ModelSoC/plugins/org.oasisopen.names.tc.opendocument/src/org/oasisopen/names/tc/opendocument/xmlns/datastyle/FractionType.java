/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.datastyle;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fraction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getDenominatorValue <em>Denominator Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getMinDenominatorDigits <em>Min Denominator Digits</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getMinIntegerDigits <em>Min Integer Digits</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getMinNumeratorDigits <em>Min Numerator Digits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getFractionType()
 * @model extendedMetaData="name='fraction_._type' kind='empty'"
 * @generated
 */
public interface FractionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Denominator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator Value</em>' attribute.
	 * @see #setDenominatorValue(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getFractionType_DenominatorValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='denominator-value' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDenominatorValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getDenominatorValue <em>Denominator Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator Value</em>' attribute.
	 * @see #getDenominatorValue()
	 * @generated
	 */
	void setDenominatorValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Grouping</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetGrouping()
	 * @see #unsetGrouping()
	 * @see #setGrouping(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getFractionType_Grouping()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='grouping' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getGrouping();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getGrouping <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetGrouping()
	 * @see #unsetGrouping()
	 * @see #getGrouping()
	 * @generated
	 */
	void setGrouping(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getGrouping <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrouping()
	 * @see #getGrouping()
	 * @see #setGrouping(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetGrouping();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getGrouping <em>Grouping</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grouping</em>' attribute is set.
	 * @see #unsetGrouping()
	 * @see #getGrouping()
	 * @see #setGrouping(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetGrouping();

	/**
	 * Returns the value of the '<em><b>Min Denominator Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Denominator Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Denominator Digits</em>' attribute.
	 * @see #setMinDenominatorDigits(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getFractionType_MinDenominatorDigits()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='min-denominator-digits' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinDenominatorDigits();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getMinDenominatorDigits <em>Min Denominator Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Denominator Digits</em>' attribute.
	 * @see #getMinDenominatorDigits()
	 * @generated
	 */
	void setMinDenominatorDigits(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Min Integer Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Integer Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Integer Digits</em>' attribute.
	 * @see #setMinIntegerDigits(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getFractionType_MinIntegerDigits()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='min-integer-digits' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinIntegerDigits();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getMinIntegerDigits <em>Min Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Integer Digits</em>' attribute.
	 * @see #getMinIntegerDigits()
	 * @generated
	 */
	void setMinIntegerDigits(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Min Numerator Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Numerator Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Numerator Digits</em>' attribute.
	 * @see #setMinNumeratorDigits(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getFractionType_MinNumeratorDigits()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='min-numerator-digits' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinNumeratorDigits();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType#getMinNumeratorDigits <em>Min Numerator Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Numerator Digits</em>' attribute.
	 * @see #getMinNumeratorDigits()
	 * @generated
	 */
	void setMinNumeratorDigits(BigInteger value);

} // FractionType
