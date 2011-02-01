/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Page Layout Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getPresentationPageLayoutType()
 * @model extendedMetaData="name='presentation-page-layout_._type' kind='elementOnly'"
 * @generated
 */
public interface PresentationPageLayoutType extends EObject {
	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getPresentationPageLayoutType_Placeholder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='placeholder' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	EList<PlaceholderType> getPlaceholder();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getPresentationPageLayoutType_DisplayName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getPresentationPageLayoutType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleName" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PresentationPageLayoutType
