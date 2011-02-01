/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationClasses;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placeholder Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getObject <em>Object</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getWidth <em>Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getX <em>X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getPlaceholderType()
 * @model extendedMetaData="name='placeholder_._type' kind='empty'"
 * @generated
 */
public interface PlaceholderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getPlaceholderType_Height()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.HeightType" required="true"
	 *        extendedMetaData="kind='attribute' name='height' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.PresentationClasses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationClasses
	 * @see #isSetObject()
	 * @see #unsetObject()
	 * @see #setObject(PresentationClasses)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getPlaceholderType_Object()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='object' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationClasses getObject();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationClasses
	 * @see #isSetObject()
	 * @see #unsetObject()
	 * @see #getObject()
	 * @generated
	 */
	void setObject(PresentationClasses value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObject()
	 * @see #getObject()
	 * @see #setObject(PresentationClasses)
	 * @generated
	 */
	void unsetObject();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getObject <em>Object</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object</em>' attribute is set.
	 * @see #unsetObject()
	 * @see #getObject()
	 * @see #setObject(PresentationClasses)
	 * @generated
	 */
	boolean isSetObject();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getPlaceholderType_Width()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.WidthType" required="true"
	 *        extendedMetaData="kind='attribute' name='width' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getPlaceholderType_X()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.XType" required="true"
	 *        extendedMetaData="kind='attribute' name='x' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(String value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getPlaceholderType_Y()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.YType" required="true"
	 *        extendedMetaData="kind='attribute' name='y' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(String value);

} // PlaceholderType
