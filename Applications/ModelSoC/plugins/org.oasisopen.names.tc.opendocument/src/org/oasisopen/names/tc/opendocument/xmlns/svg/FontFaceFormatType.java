/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.svg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Face Format Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceFormatType#getString <em>String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getFontFaceFormatType()
 * @model extendedMetaData="name='font-face-format_._type' kind='empty'"
 * @generated
 */
public interface FontFaceFormatType extends EObject {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getFontFaceFormatType_String()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='string' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getString();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceFormatType#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(Object value);

} // FontFaceFormatType
