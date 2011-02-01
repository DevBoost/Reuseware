/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dim Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType#getSound <em>Sound</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType#getColor <em>Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType#getShapeId <em>Shape Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDimType()
 * @model extendedMetaData="name='dim_._type' kind='elementOnly'"
 * @generated
 */
public interface DimType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound</em>' containment reference.
	 * @see #setSound(SoundType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDimType_Sound()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sound' namespace='##targetNamespace'"
	 * @generated
	 */
	SoundType getSound();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType#getSound <em>Sound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound</em>' containment reference.
	 * @see #getSound()
	 * @generated
	 */
	void setSound(SoundType value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDimType_Color()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color" required="true"
	 *        extendedMetaData="kind='attribute' name='color' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Shape Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Id</em>' attribute.
	 * @see #setShapeId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDimType_ShapeId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='shape-id' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getShapeId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType#getShapeId <em>Shape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Id</em>' attribute.
	 * @see #getShapeId()
	 * @generated
	 */
	void setShapeId(String value);

} // DimType
