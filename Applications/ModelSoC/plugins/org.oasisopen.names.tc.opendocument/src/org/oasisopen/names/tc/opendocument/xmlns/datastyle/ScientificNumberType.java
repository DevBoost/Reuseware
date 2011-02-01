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
 * A representation of the model object '<em><b>Scientific Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getDecimalPlaces <em>Decimal Places</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getMinExponentDigits <em>Min Exponent Digits</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getMinIntegerDigits <em>Min Integer Digits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getScientificNumberType()
 * @model extendedMetaData="name='scientific-number_._type' kind='empty'"
 * @generated
 */
public interface ScientificNumberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Decimal Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Places</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Places</em>' attribute.
	 * @see #setDecimalPlaces(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getScientificNumberType_DecimalPlaces()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='decimal-places' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDecimalPlaces();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getDecimalPlaces <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Places</em>' attribute.
	 * @see #getDecimalPlaces()
	 * @generated
	 */
	void setDecimalPlaces(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getScientificNumberType_Grouping()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='grouping' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getGrouping();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getGrouping <em>Grouping</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getGrouping <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrouping()
	 * @see #getGrouping()
	 * @see #setGrouping(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetGrouping();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getGrouping <em>Grouping</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Min Exponent Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Exponent Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Exponent Digits</em>' attribute.
	 * @see #setMinExponentDigits(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getScientificNumberType_MinExponentDigits()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='min-exponent-digits' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinExponentDigits();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getMinExponentDigits <em>Min Exponent Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Exponent Digits</em>' attribute.
	 * @see #getMinExponentDigits()
	 * @generated
	 */
	void setMinExponentDigits(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getScientificNumberType_MinIntegerDigits()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='min-integer-digits' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinIntegerDigits();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType#getMinIntegerDigits <em>Min Integer Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Integer Digits</em>' attribute.
	 * @see #getMinIntegerDigits()
	 * @generated
	 */
	void setMinIntegerDigits(BigInteger value);

} // ScientificNumberType
