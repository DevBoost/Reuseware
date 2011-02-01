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
 * A representation of the model object '<em><b>Seconds Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType#getDecimalPlaces <em>Decimal Places</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getSecondsType()
 * @model extendedMetaData="name='seconds_._type' kind='empty'"
 * @generated
 */
public interface SecondsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Decimal Places</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Places</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Places</em>' attribute.
	 * @see #isSetDecimalPlaces()
	 * @see #unsetDecimalPlaces()
	 * @see #setDecimalPlaces(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getSecondsType_DecimalPlaces()
	 * @model default="0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='decimal-places' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDecimalPlaces();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType#getDecimalPlaces <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Places</em>' attribute.
	 * @see #isSetDecimalPlaces()
	 * @see #unsetDecimalPlaces()
	 * @see #getDecimalPlaces()
	 * @generated
	 */
	void setDecimalPlaces(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType#getDecimalPlaces <em>Decimal Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDecimalPlaces()
	 * @see #getDecimalPlaces()
	 * @see #setDecimalPlaces(BigInteger)
	 * @generated
	 */
	void unsetDecimalPlaces();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType#getDecimalPlaces <em>Decimal Places</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Decimal Places</em>' attribute is set.
	 * @see #unsetDecimalPlaces()
	 * @see #getDecimalPlaces()
	 * @see #setDecimalPlaces(BigInteger)
	 * @generated
	 */
	boolean isSetDecimalPlaces();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The default value is <code>"short"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #setStyle(StyleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#getSecondsType_Style()
	 * @model default="short" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='style' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleType getStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleType)
	 * @generated
	 */
	void unsetStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType#getStyle <em>Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style</em>' attribute is set.
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleType)
	 * @generated
	 */
	boolean isSetStyle();

} // SecondsType
