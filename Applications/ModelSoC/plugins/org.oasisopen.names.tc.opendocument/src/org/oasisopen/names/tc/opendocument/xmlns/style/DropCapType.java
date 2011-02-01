/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Cap Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getLength <em>Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getLines <em>Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDropCapType()
 * @model extendedMetaData="name='drop-cap_._type' kind='empty'"
 * @generated
 */
public interface DropCapType extends EObject {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * The default value is <code>"0cm"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #isSetDistance()
	 * @see #unsetDistance()
	 * @see #setDistance(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDropCapType_Distance()
	 * @model default="0cm" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='distance' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDistance();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #isSetDistance()
	 * @see #unsetDistance()
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistance()
	 * @see #getDistance()
	 * @see #setDistance(String)
	 * @generated
	 */
	void unsetDistance();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getDistance <em>Distance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance</em>' attribute is set.
	 * @see #unsetDistance()
	 * @see #getDistance()
	 * @see #setDistance(String)
	 * @generated
	 */
	boolean isSetDistance();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #setLength(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDropCapType_Length()
	 * @model default="1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.style.LengthType"
	 *        extendedMetaData="kind='attribute' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLength();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Object value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLength()
	 * @see #getLength()
	 * @see #setLength(Object)
	 * @generated
	 */
	void unsetLength();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getLength <em>Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length</em>' attribute is set.
	 * @see #unsetLength()
	 * @see #getLength()
	 * @see #setLength(Object)
	 * @generated
	 */
	boolean isSetLength();

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' attribute.
	 * @see #isSetLines()
	 * @see #unsetLines()
	 * @see #setLines(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDropCapType_Lines()
	 * @model default="1" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='lines' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLines();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getLines <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lines</em>' attribute.
	 * @see #isSetLines()
	 * @see #unsetLines()
	 * @see #getLines()
	 * @generated
	 */
	void setLines(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getLines <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLines()
	 * @see #getLines()
	 * @see #setLines(BigInteger)
	 * @generated
	 */
	void unsetLines();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getLines <em>Lines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lines</em>' attribute is set.
	 * @see #unsetLines()
	 * @see #getLines()
	 * @see #setLines(BigInteger)
	 * @generated
	 */
	boolean isSetLines();

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getDropCapType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // DropCapType
