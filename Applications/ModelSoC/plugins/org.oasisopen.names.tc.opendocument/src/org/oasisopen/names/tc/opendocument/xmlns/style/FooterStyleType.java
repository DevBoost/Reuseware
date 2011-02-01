/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleHeaderFooterPropertiesContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Footer Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FooterStyleType#getHeaderFooterProperties <em>Header Footer Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFooterStyleType()
 * @model extendedMetaData="name='footer-style_._type' kind='elementOnly'"
 * @generated
 */
public interface FooterStyleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Header Footer Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Footer Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Footer Properties</em>' containment reference.
	 * @see #setHeaderFooterProperties(StyleHeaderFooterPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFooterStyleType_HeaderFooterProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header-footer-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleHeaderFooterPropertiesContent getHeaderFooterProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FooterStyleType#getHeaderFooterProperties <em>Header Footer Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Footer Properties</em>' containment reference.
	 * @see #getHeaderFooterProperties()
	 * @generated
	 */
	void setHeaderFooterProperties(StyleHeaderFooterPropertiesContent value);

} // FooterStyleType
